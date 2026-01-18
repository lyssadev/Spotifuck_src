# Documentation

see [STRUCTURE.md](STRUCTURE.md) for documentation template

## obfuscation analysis

the app is using moderate obfuscation, probably r8 which is kinda mid tbh. not super locked down but enough to be annoying.

**what they did:**
- 115 packages renamed to random stuff like p000A, p001B, p025O (lowkey confusing ngl)
- class names got the treatment: AbstractC0000a, C0001b, InterfaceC0003d
- methods are just single letters now: m7d, m9f, m10g (bruh)
- fields also shortened: f3444F, f3445G
- 1502 java files total, most are scrambled

**what they didnt touch:**
- main package still readable: it.deviato.spotifuck
- core classes kept their names: MainActivity, WebService, SettingsActivity
- android stuff untouched
- strings and resources still there

**verdict:** standard r8 obfuscation, not dexguard level protection. reversible but tedious af

---

## files analyzed

### app startup flow

```
FILE: java_src/it/deviato/spotifuck/MainActivity.java
├── LOCATION: java_src/it/deviato/spotifuck/MainActivity.java
├── TYPE: java class (main activity)
├── PURPOSE: entry point of the app, handles ui setup and webview initialization
│
├── KEY FINDINGS:
│   ├── line 119-157: onCreate() method sets up the entire ui and starts webservice if needed
│   ├── line 122-124: forces english locale if ForceEn setting is enabled
│   ├── line 142-149: extracts chrome version from webview user agent for display
│   ├── line 153-157: auto-starts webservice if ServiceOn preference is true
│   ├── line 175-194: onResume() reattaches webview if service is running
│   ├── line 219-229: handles cache clearing when language setting changes
│   ├── line 231-258: logout flow that nukes all cookies and cache
│   └── line 262-277: m2228s() creates and configures the webview container
│
├── METHODS/FUNCTIONS:
│   ├── onCreate() (line 119): main setup, inflates layout, initializes ui components, starts service
│   ├── onResume() (line 164): handles webview reattachment and settings changes
│   ├── onDestroy() (line 159): cleanup, clears activity reference
│   ├── m2228s() (line 262): loads webview into container with proper dimensions
│   ├── m2227u() (line 95): updates switch ui state based on service status
│   └── m2226t() (line 88): shows toast message for 2.5 seconds
│
├── DEPENDENCIES:
│   ├── AppSingleton: global app state and preferences
│   ├── WebService: background service that handles spotify web player
│   ├── WebView: displays spotify web interface
│   ├── LockableHScrollView: custom scrollview for layout modes
│   └── various obfuscated classes for ui helpers
│
└── NOTES:
    ├── app uses webview to load spotify web player instead of native ui
    ├── supports two layout modes: bigwindow (scrollable) and csshack (fixed width)
    ├── can force portrait orientation and english language
    ├── auto-starts service on launch if previously enabled
    └── handles cache/cookie clearing for logout and language changes
```

```
FILE: java_src/it/deviato/spotifuck/AppSingleton.java
├── LOCATION: java_src/it/deviato/spotifuck/AppSingleton.java
├── TYPE: java class (application singleton)
├── PURPOSE: global app state, preferences management, webview factory
│
├── KEY FINDINGS:
│   ├── line 73-95: onCreate() loads all user preferences from sharedpreferences
│   ├── line 76-92: reads 20+ different settings (autoplay, amoled, android auto, etc)
│   ├── line 98-130: m2224b() creates and configures the main webview instance
│   ├── line 103: spoofs user agent as windows chrome desktop browser
│   ├── line 104-112: enables javascript, dom storage, media autoplay
│   ├── line 116: injects javascript bridge interface "AndBridge"
│   ├── line 120-124: loads spotify login or home page based on login state
│   └── line 22-70: static fields hold all app state and preferences
│
├── METHODS/FUNCTIONS:
│   ├── onCreate() (line 73): initializes app context and loads preferences
│   ├── m2224b() (line 98): singleton factory for webview with full configuration
│   └── m2223a() (line 66): triggers ui update on main activity
│
├── DEPENDENCIES:
│   ├── SharedPreferences: persistent storage for settings
│   ├── WebView: spotify web player container
│   ├── C0361c: custom webview implementation
│   ├── C0362d: custom chrome client
│   ├── C0363e: custom webview client
│   └── C0364f: javascript bridge for android communication
│
└── NOTES:
    ├── uses desktop chrome user agent to get full spotify web player
    ├── javascript bridge allows web page to communicate with android
    ├── webview is reused across activity lifecycle (singleton pattern)
    ├── supports features like android auto, amoled theme, autoplay modes
    └── preferences include auto shutdown, sleep timer, bluetooth controls
```

**startup sequence:**
1. AppSingleton.onCreate() loads all preferences from storage
2. MainActivity.onCreate() inflates ui and checks ServiceOn preference
3. if ServiceOn is true, starts WebService in foreground
4. m2228s() creates webview via AppSingleton.m2224b()
5. webview loads spotify login or home page based on LoggedIn state
6. webview spoofs as desktop chrome to get full web player features
7. javascript bridge "AndBridge" connects web player to android controls

---

### email + password classic login button

```
FILE: java_src/p032R0/C0363e.java
├── LOCATION: java_src/p032R0/C0363e.java
├── TYPE: java class (webview client)
├── PURPOSE: handles webview page loading, ad blocking, and javascript injection
│
├── KEY FINDINGS:
│   ├── line 23-29: onPageFinished() injects javascript when page loads
│   ├── line 27-28: detects spotify login page by url ending with "/login"
│   ├── line 28: injects custom button creation javascript into login page
│   ├── line 30-31: detects successful login by finding web player link button
│   ├── line 31: calls AndBridge.loginDetected() to save login state
│   ├── line 33-117: massive javascript injection for player features
│   ├── line 118-137: shouldInterceptRequest() blocks ads and analytics
│   └── line 122-128: replaces audio ads with silent.mp3 file
│
├── METHODS/FUNCTIONS:
│   ├── onPageFinished() (line 23): injects javascript after page loads
│   ├── onPageStarted() (line 118): spoofs screen resolution and browser info
│   └── shouldInterceptRequest() (line 139): intercepts network requests for ad blocking
│
├── DEPENDENCIES:
│   ├── WebView: spotify web player container
│   ├── C0364f: javascript bridge (AndBridge)
│   ├── AppSingleton: global state and preferences
│   └── assets/silent.mp3: replacement audio for blocked ads
│
└── NOTES:
    ├── button is created via javascript dom manipulation
    ├── adds query parameter ?allow_password=1 to enable classic login
    ├── button styled with blue background and rounded corners
    ├── inserted before first google/facebook login button
    ├── only appears on login page, not after logged in
    └── login detection happens automatically when web player link appears
```

```
FILE: java_src/p032R0/C0364f.java
├── LOCATION: java_src/p032R0/C0364f.java
├── TYPE: java class (javascript bridge)
├── PURPOSE: exposes android methods to javascript via "AndBridge" interface
│
├── KEY FINDINGS:
│   ├── line 20: constructor takes context but does nothing
│   ├── line 23-38: deferMessage() shows toast messages from javascript
│   ├── line 40-52: manageTShut() handles auto shutdown timer
│   ├── line 54-66: manageTSleep() handles sleep timer
│   ├── line 68-75: wakeUp/wakeOff() control screen wake lock
│   ├── line 77-80: cssInjected() callback when css hack is applied
│   ├── line 82-85: isWoke() checks if webview is visible
│   ├── line 87-92: loginDetected() saves login state to preferences
│   ├── line 94-98: playLoaded() marks player as ready
│   ├── line 100-104: recMediaPosition() updates playback position
│   └── line 106-145: recMediaStatus() receives full media metadata from javascript
│
├── METHODS/FUNCTIONS:
│   ├── loginDetected() (line 87): sets LoggedIn preference to true
│   ├── recMediaStatus() (line 106): parses json with track info and updates service
│   ├── manageTShut() (line 40): schedules auto shutdown after inactivity
│   ├── manageTSleep() (line 54): schedules sleep timer during playback
│   └── all methods marked with @JavascriptInterface annotation
│
├── DEPENDENCIES:
│   ├── AppSingleton: global preferences storage
│   ├── WebService: media session and notification updates
│   ├── MainActivity: ui updates and toast messages
│   └── JSONObject: parsing media metadata from javascript
│
└── NOTES:
    ├── all methods are static except loginDetected and recMediaStatus
    ├── javascript can call these via window.AndBridge.methodName()
    ├── login detection is automatic, no manual button click needed
    ├── saves LoggedIn=true to sharedpreferences on detection
    └── next app launch will skip login page and go straight to home
```

**classic login flow:**
1. webview loads https://accounts.spotify.com/login
2. onPageFinished() detects url ends with "/login"
3. javascript creates custom link element with text "Email + Password Classic Login"
4. button styled with blue background, white text, rounded corners
5. button href set to "?allow_password=1" query parameter
6. button inserted before first social login button (google/facebook)
7. user clicks button, spotify shows classic email/password form
8. after successful login, page shows "web-player-link" button
9. javascript auto-clicks it and calls AndBridge.loginDetected()
10. loginDetected() saves LoggedIn=true to preferences
11. next launch loads https://open.spotify.com/ instead of login page

---

### app settings and preferences

```
SETTING: ServiceOn
├── VARIABLE: AppSingleton.f3429m (boolean)
├── DEFAULT: true
├── STORAGE KEY: "ServiceOn"
├── PURPOSE: controls whether webservice auto-starts on app launch
│
├── USAGE:
│   ├── AppSingleton.java line 150: loaded from preferences
│   ├── MainActivity.java line 154: checks if service should start
│   └── MainActivity.java line 224: checks before reloading webview
│
└── NOTES:
    ├── when enabled, starts foreground service automatically
    ├── service keeps spotify web player running in background
    └── allows media controls and notifications to work
```

```
SETTING: LoggedIn
├── VARIABLE: AppSingleton.f3430n (boolean)
├── DEFAULT: false
├── STORAGE KEY: "LoggedIn"
├── PURPOSE: tracks if user has logged into spotify account
│
├── USAGE:
│   ├── AppSingleton.java line 151: loaded from preferences
│   ├── AppSingleton.java line 122: determines which url to load
│   ├── C0364f.java line 89: set to true when login detected
│   └── MainActivity.java line 244: reset to false on logout
│
└── NOTES:
    ├── false: loads login page (accounts.spotify.com/login)
    ├── true: loads home page (open.spotify.com)
    ├── automatically detected via javascript when web player link appears
    └── cleared when user logs out or clears cookies
```

```
SETTING: APlayMode
├── VARIABLE: AppSingleton.f3427k (string)
├── DEFAULT: "disabled"
├── STORAGE KEY: "APlayMode"
├── PURPOSE: controls automatic playback behavior
│
├── VALUES:
│   ├── "disabled": no auto play
│   ├── "onetime": auto play once on first load
│   └── "permanent": always auto play when paused
│
├── USAGE:
│   ├── AppSingleton.java line 152: loaded from preferences
│   ├── C0363e.java line 35: checks for onetime mode
│   ├── C0363e.java line 38: checks for permanent mode
│   └── C0363e.java line 46: injects permanent autoplay javascript
│
└── NOTES:
    ├── onetime clicks play button once after player loads
    ├── permanent automatically resumes playback when paused
    └── works via javascript interval checking play button state
```

```
SETTING: CloseNowPlay
├── VARIABLE: AppSingleton.f3432p (boolean)
├── DEFAULT: false
├── STORAGE KEY: "CloseNowPlay"
├── PURPOSE: automatically closes now playing panel
│
├── USAGE:
│   ├── AppSingleton.java line 153: loaded from preferences
│   ├── C0363e.java line 38: checks if feature enabled
│   └── C0363e.java line 40: injects closeNowPlay() javascript
│
└── NOTES:
    ├── keeps ui clean by hiding expanded now playing view
    ├── runs in 5 second interval when enabled
    └── useful for compact layout modes
```

```
SETTING: TakeControl
├── VARIABLE: AppSingleton.f3431o (boolean)
├── DEFAULT: true
├── STORAGE KEY: "TakeControl"
├── PURPOSE: automatically takes control when another device is playing
│
├── USAGE:
│   ├── AppSingleton.java line 154: loaded from preferences
│   ├── C0363e.java line 38: checks if feature enabled
│   └── C0363e.java line 43: injects take control javascript
│
└── NOTES:
    ├── detects when spotify is playing on another device
    ├── automatically clicks "take control" button
    ├── transfers playback to this device
    └── runs in 5 second interval when enabled
```

```
SETTING: GuiMode
├── VARIABLE: AppSingleton.f3428l (string)
├── DEFAULT: "csshack"
├── STORAGE KEY: "GuiMode"
├── PURPOSE: controls webview layout and css modifications
│
├── VALUES:
│   ├── "csshack": compact mobile-optimized layout with custom css
│   └── "bigwindow": full desktop layout with horizontal scrolling
│
├── USAGE:
│   ├── AppSingleton.java line 155: loaded from preferences
│   ├── MainActivity.java line 285: sets scrolling and width based on mode
│   ├── C0363e.java line 56: injects css hack javascript
│   └── C0363e.java line 60: injects custom css styles
│
└── NOTES:
    ├── csshack mode: 
    │   ├── hides desktop elements (sidebar, nav)
    │   ├── optimizes for mobile screen width
    │   ├── custom now playing bar styling
    │   └── collapsible library sidebar
    ├── bigwindow mode:
    │   ├── 1600px fixed width
    │   ├── horizontal scrolling enabled
    │   └── full desktop experience
    └── css injection happens after page load
```

```
SETTING: Amoled
├── VARIABLE: AppSingleton.f3433q (boolean)
├── DEFAULT: false
├── STORAGE KEY: "Amoled"
├── PURPOSE: enables pure black theme for amoled screens
│
├── USAGE:
│   ├── AppSingleton.java line 156: loaded from preferences
│   └── C0363e.java line 63: injects amoled css if enabled
│
└── NOTES:
    ├── replaces dark theme backgrounds with pure black (#000)
    ├── saves battery on amoled displays
    ├── affects all background colors in spotify ui
    └── only applies when csshack mode is active
```

```
SETTING: AndAuto
├── VARIABLE: AppSingleton.f3434r (boolean)
├── DEFAULT: true
├── STORAGE KEY: "AndAuto"
├── PURPOSE: enables android auto integration and media metadata sync
│
├── USAGE:
│   ├── AppSingleton.java line 157: loaded from preferences
│   ├── C0363e.java line 34: determines which javascript to inject
│   ├── C0363e.java line 52: injects media tracking javascript
│   ├── WebService.java line 528: checks before updating metadata
│   └── WebService.java line 556: checks before updating notification
│
└── NOTES:
    ├── when enabled:
    │   ├── fetches user library from spotify api
    │   ├── tracks playback position every 2 seconds
    │   ├── monitors track, artist, repeat mode, favorite status
    │   ├── extracts album cover art
    │   └── sends metadata to android via AndBridge
    ├── required for android auto compatibility
    ├── enables media session controls
    └── updates lock screen and notification metadata
```

```
SETTING: SwipeStop
├── VARIABLE: AppSingleton.f3435s (boolean)
├── DEFAULT: true
├── STORAGE KEY: "SwipeStop"
├── PURPOSE: stops service when notification is swiped away
│
├── USAGE:
│   ├── AppSingleton.java line 158: loaded from preferences
│   └── SettingsActivity.java lines 273-328: referenced in settings ui
│
└── NOTES:
    ├── controls notification dismissal behavior
    ├── when true: swiping notification stops service
    ├── when false: notification persists and service continues
    └── affects foreground service lifecycle
```

```
SETTING: AutoShut
├── VARIABLE: AppSingleton.f3442z (int)
├── DEFAULT: 0
├── STORAGE KEY: "AutoShut" (stored as string)
├── PURPOSE: auto shutdown timer in minutes when playback stops
│
├── USAGE:
│   ├── AppSingleton.java line 159: loaded and parsed from preferences
│   ├── C0364f.java line 44: checks if timer should be set
│   ├── C0364f.java line 53: schedules shutdown after specified minutes
│   └── SettingsActivity.java line 406: updates when setting changes
│
└── NOTES:
    ├── value in minutes (0 = disabled)
    ├── timer starts when playback stops
    ├── timer cancelled when playback resumes
    ├── stops service and closes app when timer expires
    └── useful for falling asleep to music
```

```
SETTING: AutoSleep
├── VARIABLE: AppSingleton.f3416A (int)
├── DEFAULT: 0
├── STORAGE KEY: "AutoSleep" (stored as string)
├── PURPOSE: sleep timer in minutes during playback
│
├── USAGE:
│   ├── AppSingleton.java line 160: loaded and parsed from preferences
│   ├── C0364f.java line 59: checks if timer should be set
│   ├── C0364f.java line 68: schedules sleep after specified minutes
│   ├── RunnableC0336e.java line 41: resets to 0 when timer expires
│   └── SettingsActivity.java line 372: updates when setting changes
│
└── NOTES:
    ├── value in minutes (0 = disabled)
    ├── timer starts when playback begins
    ├── timer cancelled when playback stops
    ├── pauses playback when timer expires
    └── different from autoshut (pauses vs stops service)
```

```
SETTING: ForcePortrait
├── VARIABLE: AppSingleton.f3436t (boolean)
├── DEFAULT: false
├── STORAGE KEY: "ForcePortrait"
├── PURPOSE: locks screen orientation to portrait mode
│
├── USAGE:
│   ├── AppSingleton.java line 161: loaded from preferences
│   └── MainActivity.java line 172: sets orientation in onResume
│
└── NOTES:
    ├── when true: setRequestedOrientation(1) - portrait only
    ├── when false: setRequestedOrientation(13) - sensor based
    ├── applied every time activity resumes
    └── useful for preventing accidental rotation
```

```
SETTING: ForceEn
├── VARIABLE: AppSingleton.f3437u (boolean)
├── DEFAULT: false
├── STORAGE KEY: "ForceEn"
├── PURPOSE: forces english language in spotify interface
│
├── USAGE:
│   ├── AppSingleton.java line 162: loaded from preferences
│   ├── MainActivity.java line 126: sets locale in onCreate
│   ├── MainActivity.java line 208: sets locale in onResume
│   └── MainActivity.java line 212: detects language change for cache clear
│
└── NOTES:
    ├── sets default locale to english (en)
    ├── clears webview cache when setting changes
    ├── reloads page to apply new language
    └── useful for non-english system language users
```

```
SETTING: HPAP (Headphone Auto Play)
├── VARIABLE: AppSingleton.f3438v (boolean)
├── DEFAULT: false
├── STORAGE KEY: "HPAP"
├── PURPOSE: automatically plays music when headphones plugged in
│
├── USAGE:
│   ├── AppSingleton.java line 163: loaded from preferences
│   └── WebService.java line 154: checks when headset plug detected
│
└── NOTES:
    ├── listens for HEADSET_PLUG intent
    ├── triggers when state=1 (plugged in)
    ├── calls transportControls.play()
    └── works with wired headphones only
```

```
SETTING: HPAS (Headphone Auto Stop)
├── VARIABLE: AppSingleton.f3439w (boolean)
├── DEFAULT: false
├── STORAGE KEY: "HPAS"
├── PURPOSE: automatically pauses music when headphones unplugged
│
├── USAGE:
│   ├── AppSingleton.java line 164: loaded from preferences
│   └── WebService.java line 158: checks when headset unplug detected
│
└── NOTES:
    ├── listens for HEADSET_PLUG intent
    ├── triggers when state=0 (unplugged)
    ├── calls transportControls.pause()
    └── prevents music playing through phone speaker
```

```
SETTING: BTAP (Bluetooth Auto Play)
├── VARIABLE: AppSingleton.f3440x (boolean)
├── DEFAULT: false
├── STORAGE KEY: "BTAP"
├── PURPOSE: automatically plays music when bluetooth device connects
│
├── USAGE:
│   ├── AppSingleton.java line 165: loaded from preferences
│   └── WebService.java line 173: checks when bluetooth state changes
│
└── NOTES:
    ├── listens for bluetooth CONNECTION_STATE_CHANGED intent
    ├── triggers when state=2 (connected)
    ├── calls transportControls.play()
    └── works with bluetooth headphones, speakers, car audio
```

```
SETTING: BTAS (Bluetooth Auto Stop)
├── VARIABLE: AppSingleton.f3441y (boolean)
├── DEFAULT: false
├── STORAGE KEY: "BTAS"
├── PURPOSE: automatically pauses music when bluetooth device disconnects
│
├── USAGE:
│   ├── AppSingleton.java line 166: loaded from preferences
│   └── WebService.java line 174: checks when bluetooth state changes
│
└── NOTES:
    ├── listens for bluetooth CONNECTION_STATE_CHANGED intent
    ├── triggers when state=0 (disconnected)
    ├── calls transportControls.pause()
    └── useful when leaving car or turning off bluetooth headphones
```


---

### javascript injection system

the app injects massive amounts of javascript into spotify web player to add features, bypass limitations, and integrate with android. this is the core of how spotifuck works.

#### injection phases

```
PHASE 1: onPageStarted (before page loads)
├── spoofs browser fingerprint
├── sets screen resolution to 1920x1080
├── sets window size to 1920x978
├── fakes navigator.vendor as "Google Inc."
├── fakes navigator.platform as "Win32"
└── makes spotify think its running on desktop windows chrome
```

```
PHASE 2: onPageFinished (after page loads)
├── detects page type by url
├── facebook gdpr: auto-clicks consent button
├── login page: injects classic login button
├── logged in: injects full player control system
└── different javascript based on settings
```

#### injection 1: facebook gdpr bypass

```javascript
(function(){
  document.querySelector('#facebook div[role=button]').click();
})();
```

**purpose:** auto-accepts facebook privacy consent when logging in with facebook

**trigger:** url starts with "https://www.facebook.com/privacy/consent/gdp/"

**how it works:**
- finds first button in facebook consent dialog
- automatically clicks it
- bypasses manual consent step

---

#### injection 2: classic login button

```javascript
(function(){
  let gl=document.querySelector('section>div>div>div>div>a:first-child:not(.fuckd)');
  if(gl) {
    let cl=document.createElement('a');
    cl.className='fuckd';
    cl.innerText='Email + Password Classic Login';
    cl.style.cssText='display:block;padding:10px;margin:10px 0;color:white;font-weight:bold;text-decoration:none;border:1px solid #ddd;background:#339;border-radius:30px';
    cl.href='?allow_password=1';
    gl.parentNode.insertBefore(cl,gl);
  }
})();
```

**purpose:** adds email/password login option to spotify login page

**trigger:** url ends with "/login"

**how it works:**
- finds first social login button (google/facebook)
- creates new link element with custom styling
- sets href to "?allow_password=1" query parameter
- inserts before social login buttons
- marked with "fuckd" class to prevent duplicate injection

---

#### injection 3: login detection

```javascript
(function() {
  let l=document.querySelector('button[data-testid=web-player-link]');
  if(l) {
    AndBridge.loginDetected();
    l.click();
  }
})();
```

**purpose:** detects successful login and navigates to web player

**trigger:** user not logged in (LoggedIn=false)

**how it works:**
- looks for "open web player" button
- calls AndBridge.loginDetected() to save login state
- auto-clicks button to enter web player
- only runs once until login state saved

---

#### injection 4: main player control system

this is the massive injection that runs when user is logged in. broken down into modules:

**module 1: global variables and state**

```javascript
let reqPause=false;
let firstPlay=true;
let ulFlag=false;
let ffDone=false;
let npOpen=false;
let featVer=`web-player_${new Date().toISOString().split('T')[0]}_${Date.now()}_${Math.floor(Math.random()*0xFFFFFFF).toString(16).padStart(7,'0')}`;
let lastState=null;
let lastPos=null;
let playing=false;
let pfint=null;
let afint=null;
let cssint=null;
let aaint=null;
```

**purpose:** tracks player state and interval timers

**variables:**
- reqPause: user requested pause
- firstPlay: first time playing (for onetime autoplay)
- ulFlag: unlock mechanism active
- ffDone: first initialization complete
- npOpen: now playing panel open
- featVer: fake feature version for spotify api
- lastState: previous media state for change detection
- lastPos: previous playback position
- playing: current playback state
- pfint/afint/cssint/aaint: interval timer ids

---

**module 2: fetch interceptor (AndAuto enabled)**

```javascript
const oriFetch=window.fetch;
window.fetch=async function(...args) {
  const [url,opts]=args;
  const method=opts?.method?.toUpperCase?.()||'GET';
  const headers=opts?.headers||{};
  
  if(method==='POST'&&url.includes('/track-playback/v1/devices')&&opts?.body){
    const body=JSON.parse(opts.body);
    const deviceId=body?.device?.device_id;
    if(deviceId&&deviceId!==window.spotDevId){
      window.spotDevId=deviceId;
      typeof checkMediaLib==='function'&&checkMediaLib();
    }
  }
  
  const cliToken=headers['Client-Token']||headers['client-token'];
  if(cliToken&&cliToken!==window.spotCliToken) {
    window.spotCliToken=cliToken;
    typeof checkMediaLib==='function'&&checkMediaLib();
  }
  
  const authHead=headers.Authorization||headers.authorization;
  if(authHead?.startsWith('Bearer ')&&authHead!==window.spotAuthToken) {
    window.spotAuthToken=authHead;
    typeof checkMediaLib==='function'&&checkMediaLib();
  }
  
  if(ffDone&&url.includes('/track-playback/')&&method==='PUT') {
    const paused=opts?.body?JSON.parse(opts?.body)?.state_ref?.paused:undefined;
    if(paused===true&&playing) { manageAll(false); }
    else if(paused===false&&!playing) { manageAll(true); }
  }
  
  const resp=await oriFetch(url,opts);
  if(resp.status===404&&url.includes('connect-state')&&url.includes('/command/from/')) {
    AndBridge.deferMessage('reload');
    location.reload();
  }
  return resp;
};
```

**purpose:** intercepts all fetch requests to extract tokens and track playback state

**what it captures:**
- spotDevId: spotify device id from playback requests
- spotCliToken: client token from request headers
- spotAuthToken: bearer auth token from headers
- playback state changes from track-playback api

**why:**
- tokens needed for library fetching and playback control
- detects external playback changes
- handles player lock errors with reload

---

**module 3: library fetcher (AndAuto enabled)**

```javascript
window.fetchAllLibrary=async function(){
  const limit=50;
  let offset=0;
  let allItems=[];
  let hasMore=true;
  
  while(hasMore){
    const resp=await oriFetch('https://api-partner.spotify.com/pathfinder/v2/query',{
      method:'POST',
      headers:{
        'Authorization':window.spotAuthToken,
        'Client-Token':window.spotCliToken,
        'Content-Type':'application/json;charset=UTF-8'
      },
      body:JSON.stringify({
        variables:{
          filters:[],
          order:null,
          textFilter:'',
          features:['LIKED_SONGS','YOUR_EPISODES_V2','PRERELEASES','EVENTS'],
          limit:limit,
          offset:offset,
          flatten:false,
          expandedFolders:[],
          folderUri:null,
          includeFoldersWhenFlattening:true
        },
        operationName:'libraryV3',
        extensions:{
          persistedQuery:{
            version:1,
            sha256Hash:'0082bf82412db50128add72dbdb73e2961d59100b9cbf41fb25c568bd8bc358b'
          }
        }
      })
    });
    
    const data=await resp.json();
    const items=data?.data?.me?.libraryV3?.items||[];
    allItems=allItems.concat(items);
    
    if(items.length<limit) {
      hasMore=false;
    } else {
      offset+=limit;
    }
  }
  return allItems;
};
```

**purpose:** fetches entire user library from spotify api

**how it works:**
- paginated requests with 50 items per page
- uses captured auth and client tokens
- fetches playlists, albums, artists, podcasts
- returns complete library array

**used for:** android auto integration, library browsing

---

**module 4: library parser (AndAuto enabled)**

```javascript
window.parseLibrary=function(items) {
  const res={playlists:[],albums:[],artists:[],podcasts:[]};
  
  items.forEach(({item})=>{
    const data=item.data;
    if(!data||!data.__typename) return;
    
    switch(data.__typename) {
      case 'PseudoPlaylist':
      case 'Playlist':
        res.playlists.push({
          id:data.uri,
          name:data.name,
          image:data.images?.items?.[0]?.sources?.[0]?.url||null
        });
        break;
      case 'Album':
        res.albums.push({
          id:data.uri,
          name:data.name,
          image:data.coverArt?.sources?.[0]?.url||null,
          artists:data.artists?.items?.map(a=>a.profile?.name).filter(Boolean)||[]
        });
        break;
      case 'Artist':
        res.artists.push({
          id:data.uri,
          name:data.profile?.name,
          image:data.visuals?.avatarImage?.sources?.[0]?.url||null
        });
        break;
      case 'Podcast':
        res.podcasts.push({
          id:data.uri,
          name:data.name,
          image:data.coverArt?.sources?.[0]?.url||null,
          artists:data.publisher?.name?[data.publisher.name]:[]
        });
        break;
    }
  });
  return res;
};
```

**purpose:** parses raw library data into structured format

**output:** categorized library with playlists, albums, artists, podcasts

---

**module 5: media state updater (AndAuto enabled)**

```javascript
window.updMedia=function(){
  const currState=track+'|'+artist+'|'+playing+'|'+repmode+'|'+isfav;
  if(currState!==lastState) {
    lastState=currState;
    const values={
      artist:artist,
      track:track,
      playing:playing,
      repeat:repmode,
      fav:isfav,
      duration:duration,
      position:position,
      cover:cover
    };
    AndBridge.recMediaStatus(JSON.stringify(values));
  } else {
    if(Math.abs(position-lastPos)>4000) {
      AndBridge.recMediaPosition(position);
    }
    lastPos=position;
  }
};
```

**purpose:** sends media metadata to android when state changes

**triggers:**
- track/artist/playing/repeat/favorite changes
- position jumps more than 4 seconds

**sends to android:**
- track name, artist name
- playing state, repeat mode, favorite status
- duration, position, cover art url

---

**module 6: playback control functions**

```javascript
window.playFromUri=function(uri) {
  let type=uri.match(/^spotify:([^:]+)/)?.[1];
  if(type=='user') type='your_library';
  
  oriFetch(`https://gew4-spclient.spotify.com/connect-state/v1/player/command/from/${window.spotDevId}/to/${window.spotDevId}`, {
    method:'POST',
    headers:{
      'Authorization':window.spotAuthToken,
      'Client-Token':window.spotCliToken,
      'Content-Type':'application/json'
    },
    body:JSON.stringify({
      command:{
        context:{uri:uri,url:'context://'+uri,metadata:{}},
        play_origin:{
          feature_identifier:type,
          feature_version:featVer,
          referrer_identifier:'your_library'
        },
        options:{license:'tft',skip_to:{},player_options_override:{}},
        endpoint:'play'
      }
    })
  });
};

window.actPlayPause=function(play) {
  if('pBtn' in window) {
    if(pBtn.getAttribute('aria-label')==='Play') {
      if(play) pBtn.click();
    } else {
      if(!play) pBtn.click();
    }
  }
};

window.actSkipBack=function() {
  let bb=document.querySelector('button[data-testid=control-button-skip-back]');
  if(bb) { manageWake(true); bb.click(); }
};

window.actSkipForward=function() {
  let fb=document.querySelector('button[data-testid=control-button-skip-forward]');
  if(fb) { manageWake(true); fb.click(); }
};

window.actRepeat=function() {
  let rb=document.querySelector('button[data-testid=control-button-repeat]');
  if(rb) {
    if(repmode=='false') repmode='true';
    else if(repmode=='true') repmode='mixed';
    else repmode='false';
    updMedia();
    rb.click();
  }
};

window.actAddToFav=function() {
  let fb=document.querySelector('div[data-testid=now-playing-widget]>div:last-child>button');
  if(fb) {
    if(fb.getAttribute('aria-checked')==='false') {
      fb.click();
      isfav=true;
      updMedia();
    } else {
      manageWake(true);
      fb.click();
      let rfint=setInterval(()=>{
        let fr=document.querySelector('#context-menu button[role=menuitemcheckbox][aria-checked=true]');
        if(fr) {
          clearInterval(rfint);
          fr.click();
          setTimeout(()=>{
            let sb=document.querySelector('#context-menu button[type=submit]');
            if(sb) { sb.click(); isfav=false; updMedia(); }
            manageWake(false);
          },500);
        }
      },1000);
    }
  }
};

window.actSeek=function(pos) {
  let rg=document.querySelector('div[data-testid=playback-progressbar] input[type=range]');
  rg.value=pos+1;
  rg.dispatchEvent(new Event('change',{bubbles:true}));
};
```

**purpose:** control functions called from android via webview

**functions:**
- playFromUri: plays spotify uri (playlist/album/track)
- actPlayPause: toggles play/pause
- actSkipBack: previous track
- actSkipForward: next track
- actRepeat: cycles repeat modes
- actAddToFav: adds/removes from favorites
- actSeek: seeks to position

---

**module 7: main interval loop (firstFuck)**

```javascript
window.firstFuck=function(){
  if(pfint) clearInterval(pfint);
  pfint=setInterval(()=>{
    if(playing&&document.visibilityState=='hidden'&&!!document.querySelector('.VideoPlayer__container video')) {
      AndBridge.wakeUp();
    } else if(!AndBridge.isWoke()&&document.visibilityState=='visible'&&!document.querySelector('.VideoPlayer__container video')) {
      AndBridge.wakeOff();
    }
    
    if(typeof npBtn=='undefined') {
      let lyBtn=document.querySelector('button[data-testid=lyrics-button]:not(.fuckd)');
      if(lyBtn) {
        lyBtn.classList.add('fuckd');
        npBtn=document.createElement('button');
        npBtn.className='npbtn';
        npBtn.onclick=clickNP;
        npBtn.innerHTML=`<svg viewBox="0 0 16 17">...</svg>`;
        lyBtn.parentNode.insertBefore(npBtn,lyBtn);
        closeNowPlay();
      }
    }
    
    let pb=document.querySelector('aside button[data-testid=control-button-playpause]:not(.fuckd)');
    if(pb) {
      AndBridge.playLoaded();
      pb.classList.add('fuckd');
      window.pBtn=pb;
      
      pBtn.addEventListener('click',()=>{
        if(pBtn.getAttribute('aria-label')!=='Play') {
          reqPause=true;
          ulFlag=false;
          manageWake(false);
        } else if(!ulFlag) {
          reqPause=false;
          manageWake(true);
          ulFlag=true;
          setTimeout(()=>{
            if(ulFlag&&pBtn.getAttribute('aria-label')==='Play') {
              AndBridge.deferMessage('unlock');
              actSkipForward();
              trigUnlock();
            } else if(ulFlag) {
              ulFlag=false;
            }
          },10000);
        }
      });
      
      if(!ffDone){
        ffDone=true;
        AndBridge.manageTShut(true);
        AndBridge.manageTSleep(false);
        addAutoFeatures();
        addCSSJSHack();
        addAndAuto();
        setTimeout(()=>{manageAll(playing)},10000);
      }
    }
  },5000);
};
firstFuck();
```

**purpose:** main 5-second interval that initializes everything

**what it does:**
- manages screen wake lock for video playback
- creates custom now playing button
- hooks into play/pause button
- implements unlock mechanism (skips forward if stuck)
- initializes all other modules once player ready

**unlock mechanism:**
- spotify sometimes locks player requiring interaction
- detects stuck state after 10 seconds
- auto-skips forward to unlock
- monitors until unlocked

---

**module 8: autoplay features (conditional)**

```javascript
window.addAutoFeatures=function(){
  if('pBtn' in window&&firstPlay&&pBtn.getAttribute('aria-label')==='Play') {
    pBtn.click();
    firstPlay=false;
  }
  
  if(afint) clearInterval(afint);
  afint=setInterval(()=>{
    closeNowPlay();
    
    let ft=document.querySelector('aside div.encore-bright-accent-set button');
    if(ft) {
      ft.click();
      setTimeout(()=>{
        let cb=document.querySelector('aside ul[role=list] li[role=listitem] div[role=button]');
        if(cb) cb.click();
      },500);
    }
    
    if('pBtn' in window&&!reqPause&&!ulFlag&&pBtn.getAttribute('aria-label')==='Play') {
      pBtn.click();
    }
  },5000);
};
```

**purpose:** implements autoplay modes and auto-features

**features:**
- onetime: clicks play once on first load
- permanent: auto-resumes when paused
- closeNowPlay: auto-closes now playing panel
- takeControl: auto-takes control from other devices

**runs:** 5-second interval when enabled

---

**module 9: android auto metadata tracker (conditional)**

```javascript
window.addAndAuto=function(){
  if(aaint) clearInterval(aaint);
  aaint=setInterval(()=>{
    let ta=document.querySelector('a[data-testid=context-item-link]');
    if(ta) track=ta.text; else track=null;
    
    let aa=document.querySelector('a[data-testid=context-item-info-artist]');
    if(!aa) aa=document.querySelector('a[data-testid=context-item-info-show]');
    if(aa) artist=aa.text; else artist='';
    
    let rr=document.querySelector('button[data-testid=control-button-repeat]');
    if(rr) repmode=rr.getAttribute('aria-checked'); else repmode='false';
    
    let fb=document.querySelector('div[data-testid=now-playing-widget]>div:last-child>button');
    if(fb&&fb.getAttribute('aria-checked')==='true') isfav=true; else isfav=false;
    
    let rg=document.querySelector('div[data-testid=playback-progressbar] input[type=range]');
    if(rg) {
      duration=parseInt(rg.getAttribute('max'));
      position=parseInt(rg.getAttribute('value'));
    } else {
      duration=null;
      position=null;
    }
    
    let im=document.querySelector('img[data-testid=cover-art-image]');
    if(im) cover=im.src; else cover=null;
    
    updMedia();
  },2000);
};
```

**purpose:** scrapes media metadata from dom every 2 seconds

**extracts:**
- track name from context link
- artist name from artist link or show name
- repeat mode from repeat button
- favorite status from heart button
- duration and position from progress bar
- cover art from image element

**sends:** calls updMedia() to sync with android

---

**module 10: css hack and ui modifications (conditional)**

```javascript
window.addCSSJSHack=function(){
  if(cssint) clearInterval(cssint);
  cssint=setInterval(function(){
    let lb=document.querySelector('#Desktop_LeftSidebar_Id header>div>div:first-child button:not(.fuckd)');
    if(lb) {
      window.lBtn=lb;
      lb.classList.add('fuckd','lbtn');
      lb.style.padding=0;
      lb.style.height='20px';
      lb.addEventListener('click',function(){setTimeout(()=>switchLs(),0)});
      switchLs();
      AndBridge.cssInjected();
    }
    
    let lbit=document.querySelector('#Desktop_LeftSidebar_Id div[role=grid]:not(.fuckd)');
    if(lbit) {
      lbit.classList.add('fuckd');
      lbit.addEventListener('click',()=>{
        setTimeout(()=>{
          lBtn.click();
          closeNowPlay();
        },0)
      });
    }
    
    let hb=document.querySelector('#global-nav-bar button[data-testid=home-button]:not(.fuckd)');
    if(hb) {
      hb.classList.add('fuckd');
      hb.addEventListener('click',()=>{ closeNowPlay(); });
    }
    
    let sr=document.querySelector('input[data-testid=search-input]:not(.fuckd)');
    if(sr) {
      sr.classList.add('fuckd');
      sr.addEventListener('focus',()=>{
        let npb=document.querySelector('aside[data-testid=now-playing-bar]');
        if(npb) npb.style.display='none';
        closeNowPlay();
      });
      sr.addEventListener('blur',()=>{
        let npb=document.querySelector('aside[data-testid=now-playing-bar]');
        if(npb) npb.style.display='flex';
      });
    }
    
    let ub=document.querySelector('button[data-testid=user-widget-link]:not(.fuckd)');
    if(ub) {
      ub.classList.add('fuckd');
      ub.addEventListener('click',()=>{ closeNowPlay(); });
    }
  },5000);
};

window.switchLs=function(){
  let ls=document.querySelector('#Desktop_LeftSidebar_Id');
  if(ls) {
    let exp=ls.querySelector('nav>div>div:first-child').classList.length;
    if(exp==2) {
      ls.style.position='fixed';
      ls.style.width='100%';
      ls.style.height='92%';
      ls.style.left=0;
      ls.style.zIndex=20;
      let lh=ls.querySelector('header>div>div:first-child h1');
      lh.innerHTML='✖   Close Library';
    } else {
      ls.style.zIndex=1;
      ls.style.position='fixed';
      ls.style.top='0';
      ls.style.left='60px';
      ls.style.width='48px';
      ls.style.height='48px';
    }
  }
};
```

**purpose:** modifies spotify ui for mobile optimization

**modifications:**
- hooks library button to toggle fullscreen overlay
- auto-closes now playing when clicking library items
- auto-closes now playing when clicking home/user buttons
- hides now playing bar when search focused
- makes library expand to fullscreen when opened

**runs:** 5-second interval in csshack mode

---

**module 11: massive css injection (csshack mode)**

injects 2kb+ of custom css to:
- hide desktop elements (banners, download links, fullscreen button)
- optimize layout for mobile screens
- resize fonts and spacing
- customize now playing bar (red gradient background)
- modify tracklist grid layouts
- hide tooltips and unnecessary ui
- make library sidebar collapsible
- scale buttons for touch

**amoled mode:** adds extra css for pure black backgrounds

---

#### injection flow diagram

```
APP START
    │
    ├─> onPageStarted
    │   └─> spoof browser fingerprint (1920x1080 desktop)
    │
    ├─> onPageFinished
    │   │
    │   ├─> facebook gdpr page?
    │   │   └─> auto-click consent
    │   │
    │   ├─> login page?
    │   │   └─> inject classic login button
    │   │
    │   ├─> not logged in?
    │   │   └─> detect login and auto-enter player
    │   │
    │   └─> logged in?
    │       │
    │       ├─> inject global variables
    │       │
    │       ├─> AndAuto enabled?
    │       │   ├─> inject fetch interceptor
    │       │   ├─> inject library fetcher
    │       │   ├─> inject library parser
    │       │   └─> inject media updater
    │       │
    │       ├─> inject playback control functions
    │       │
    │       ├─> inject firstFuck (main loop)
    │       │   └─> runs every 5 seconds
    │       │       ├─> manages wake lock
    │       │       ├─> creates now playing button
    │       │       ├─> hooks play/pause button
    │       │       ├─> implements unlock mechanism
    │       │       └─> initializes other modules
    │       │
    │       ├─> APlayMode enabled?
    │       │   └─> inject addAutoFeatures
    │       │       └─> runs every 5 seconds
    │       │
    │       ├─> AndAuto enabled?
    │       │   └─> inject addAndAuto
    │       │       └─> runs every 2 seconds
    │       │
    │       ├─> GuiMode = csshack?
    │       │   ├─> inject addCSSJSHack
    │       │   │   └─> runs every 5 seconds
    │       │   └─> inject massive css
    │       │
    │       └─> Amoled enabled?
    │           └─> inject amoled css
    │
    └─> PLAYER READY
        └─> all intervals running
            └─> syncing with android
```

---

#### key techniques used

**dom manipulation:**
- creates custom ui elements (login button, now playing button)
- modifies existing elements (library sidebar, search bar)
- injects event listeners on spotify buttons

**api interception:**
- hijacks window.fetch to capture tokens
- monitors all network requests
- extracts device id, client token, auth token

**state synchronization:**
- scrapes dom for media metadata every 2 seconds
- detects state changes and notifies android
- bidirectional control (android can call javascript functions)

**workarounds:**
- unlock mechanism for stuck player
- reload on 404 errors
- wake lock management for background playback
- fake feature version to bypass restrictions

**ui optimization:**
- massive css injection for mobile layout
- hides desktop-only elements
- scales buttons for touch
- custom now playing bar design

**automation:**
- auto-clicks consent dialogs
- auto-detects login
- auto-takes control from other devices
- auto-resumes playback

---

### ad blocking mechanism

```
FILE: java_src/p032R0/C0363e.java
├── LOCATION: shouldInterceptRequest() method (line 118-141)
├── TYPE: network request interceptor
├── PURPOSE: blocks ads and analytics by filtering urls and replacing audio ads
│
├── BLOCKING STRATEGY:
│   ├── analytics domains (returns empty response):
│   │   ├── doubleclick.net
│   │   ├── googlesyndication.com
│   │   ├── fastly-insights.com
│   │   └── sentry.io
│   │
│   └── audio ad domains (returns silent.mp3):
│       ├── akamaized.net/audio/
│       ├── scdn.co/audio/
│       ├── scdn.co/mp3-ad/
│       ├── spotifycdn.com/audio/
│       ├── amillionads.com
│       ├── 2mdn.net
│       ├── adxcel.com
│       └── adstudio-assets.scdn.co
│
├── WHITELIST (audio not blocked):
│   ├── podz-content (podcast content)
│   └── gew4-spclient (spotify player api)
│
└── IMPLEMENTATION:
    ├── intercepts every network request before loading
    ├── checks url against blacklist patterns
    ├── analytics: returns empty text/plain response with CORS headers
    ├── audio ads: returns silent.mp3 from assets folder
    ├── shows toast "adblock" when audio ad blocked
    └── legitimate requests pass through unmodified
```

**how it works:**

1. webview makes request to load resource
2. shouldInterceptRequest() intercepts before download
3. checks if url contains blacklisted domain
4. analytics domains: returns empty 200 OK response
5. audio ad domains: checks content-type is audio/mpeg
6. replaces ad audio stream with silent.mp3 file
7. calls C0364f.deferMessage("adblock") to show toast
8. legitimate content loads normally

**effectiveness:**
- blocks all analytics tracking
- blocks audio ads seamlessly
- no interruption in playback
- silent audio prevents detection
- whitelist ensures podcasts work

---

### webservice media session

```
FILE: java_src/it/deviato/spotifuck/WebService.java
├── LOCATION: entire file (600+ lines)
├── TYPE: foreground service with media session
├── PURPOSE: manages media controls, notifications, and android integration
│
├── KEY COMPONENTS:
│   ├── MediaSession (f3491n): android media session for controls
│   ├── Notification (f3492o): persistent notification with controls
│   ├── PowerManager.WakeLock (f3496s): keeps screen on during playback
│   ├── AudioManager (f3489G): handles audio focus
│   └── MediaActionReceiver (f3488F): receives media button events
│
├── MEDIA SESSION SETUP:
│   ├── creates MediaSessionCompat with token
│   ├── sets callback for play/pause/skip/seek/repeat/favorite
│   ├── registers media button receiver
│   ├── handles headphone and bluetooth events
│   └── updates playback state and metadata
│
├── PLAYBACK STATE:
│   ├── state: playing/paused/stopped
│   ├── position: current playback position in ms
│   ├── actions: available controls (play/pause/skip/seek)
│   ├── custom actions: repeat and add to favorites
│   └── updates every 2 seconds from javascript
│
├── METADATA:
│   ├── title: track name
│   ├── artist: artist name
│   ├── album: album name (if available)
│   ├── duration: track length in ms
│   ├── art: album cover bitmap
│   └── sent to notification and lock screen
│
└── NOTIFICATION:
    ├── foreground service notification (id 1)
    ├── shows track info and cover art
    ├── media style with play/pause/skip buttons
    ├── custom actions for repeat and favorite
    ├── updates when metadata changes
    └── dismissible based on SwipeStop setting
```

**media session flow:**

1. javascript scrapes metadata from spotify dom
2. calls AndBridge.recMediaStatus(json) with track info
3. WebService.recMediaStatus() parses json
4. updates MediaSession metadata and playback state
5. notification updates with new info
6. lock screen shows current track
7. android auto receives metadata
8. media buttons control playback

**control flow:**

1. user presses media button (headphones/bluetooth/notification)
2. MediaActionReceiver receives intent
3. forwards to MediaSession callback
4. callback calls javascript function in webview
5. javascript clicks spotify ui button
6. spotify updates playback
7. javascript detects change and syncs back to android

**wake lock management:**

- wakeUp(): acquires wake lock when playing video content
- wakeOff(): releases wake lock when not needed
- prevents screen timeout during video playback
- called from javascript based on visibility state

---

### settings activity ui structure

```
FILE: java_src/it/deviato/spotifuck/SettingsActivity.java
├── LOCATION: java_src/it/deviato/spotifuck/SettingsActivity.java
├── TYPE: preference activity with xml-based ui
├── PURPOSE: provides settings interface for all app preferences
│
├── STRUCTURE:
│   ├── extends AbstractActivityC0841l (AppCompatActivity)
│   ├── implements SharedPreferences.OnSharedPreferenceChangeListener
│   ├── uses PreferenceFragment (C0878a inner class)
│   └── loads preferences from res/xml/preferences.xml
│
├── PREFERENCE CATEGORIES:
│   │
│   ├── PLAYER CONTROLS:
│   │   ├── APlayMode: list (disabled/onetime/permanent)
│   │   ├── CloseNowPlay: switch
│   │   └── TakeControl: switch
│   │
│   ├── GUI SETTINGS:
│   │   ├── GuiMode: list (csshack/bigwindow)
│   │   ├── AndAuto: switch
│   │   └── Amoled: switch
│   │
│   ├── HARDWARE ACTIONS:
│   │   ├── HPAP: switch (headphone auto play)
│   │   ├── HPAS: switch (headphone auto stop)
│   │   ├── BTAP: switch (bluetooth auto play)
│   │   └── BTAS: switch (bluetooth auto stop)
│   │
│   └── SYSTEM SETTINGS:
│       ├── ClearCache: button (clears webview cache)
│       ├── ClearData: button (logout and clear all data)
│       ├── SwipeStop: switch
│       ├── AutoShut: list (0/5/10/15/30/60 minutes)
│       ├── AutoSleep: list (0/5/10/15/30/60 minutes)
│       ├── ForcePortrait: switch
│       └── ForceEn: switch
│
├── SPECIAL ACTIONS:
│   │
│   ├── ClearCache:
│   │   ├── sets MainActivity.f3456R = true
│   │   ├── finishes activity
│   │   └── triggers cache clear on resume
│   │
│   └── ClearData:
│       ├── shows confirmation dialog
│       ├── sets MainActivity.f3457S = true
│       ├── finishes activity
│       └── triggers full logout and data wipe
│
└── PREFERENCE CHANGE HANDLING:
    ├── onSharedPreferenceChanged() called on any change
    ├── updates AppSingleton static variables
    ├── applies changes immediately
    └── some settings require app restart
```

**xml structure (res/xml/preferences.xml):**

```xml
<PreferenceScreen>
  <CustomPrefTitle> (app name and version)
  
  <PreferenceCategory title="Player">
    <ListPreference key="APlayMode">
    <SwitchPreference key="CloseNowPlay">
    <SwitchPreference key="TakeControl">
  </PreferenceCategory>
  
  <PreferenceCategory title="GUI">
    <ListPreference key="GuiMode">
    <SwitchPreference key="AndAuto">
    <SwitchPreference key="Amoled">
  </PreferenceCategory>
  
  <PreferenceCategory title="Actions">
    <SwitchPreference key="HPAP">
    <SwitchPreference key="HPAS">
    <SwitchPreference key="BTAP">
    <SwitchPreference key="BTAS">
  </PreferenceCategory>
  
  <PreferenceCategory title="System">
    <Preference key="ClearCache">
    <Preference key="ClearData">
    <SwitchPreference key="SwipeStop">
    <ListPreference key="AutoShut">
    <ListPreference key="AutoSleep">
    <SwitchPreference key="ForcePortrait">
    <SwitchPreference key="ForceEn">
  </PreferenceCategory>
</PreferenceScreen>
```

**preference types:**

- SwitchPreference: boolean toggle (most settings)
- ListPreference: dropdown selection (APlayMode, GuiMode, timers)
- Preference: clickable action (ClearCache, ClearData)
- CustomPrefTitle: custom header with app info

**icons:** each preference has custom icon from drawable resources

**summaries:** ListPreferences show current value as summary

**defaults:** all preferences have default values defined in xml

---

### home widget implementation

```
FILE: java_src/it/deviato/spotifuck/HomeWidget.java
├── LOCATION: java_src/it/deviato/spotifuck/HomeWidget.java
├── TYPE: app widget provider
├── PURPOSE: provides home screen widget with playback controls
│
├── WIDGET LAYOUT (res/layout/home_widget.xml):
│   ├── dimensions: 76dp height, full width
│   ├── background: red gradient
│   ├── album cover: 76x76dp square on left
│   ├── track info: artist - track name (single line, ellipsized)
│   └── controls row: repeat, previous, play/pause, next, favorite
│
├── WIDGET CONTROLS:
│   ├── btn_wplay: play/pause toggle
│   ├── btn_wprev: previous track
│   ├── btn_wnext: next track
│   ├── btn_wrepeat: cycle repeat modes
│   ├── btn_wfav: toggle favorite
│   └── widget_root: opens main activity on click
│
├── UPDATE MECHANISM:
│   ├── onUpdate() called when widget needs refresh
│   ├── creates RemoteViews with current state
│   ├── reads data from WebService static fields:
│   │   ├── f3500w: artist name
│   │   ├── f3501x: track name
│   │   ├── f3499v: album cover bitmap
│   │   ├── f3486D: playing state (true/false)
│   │   ├── f3485C: repeat mode icon resource
│   │   └── f3487E: favorite state (true/false)
│   ├── sets text, images, and button states
│   ├── attaches pending intents to buttons
│   └── updates all widget instances
│
├── BUTTON ACTIONS:
│   ├── all buttons send broadcasts to MediaActionReceiver
│   ├── WIDGET_PLAYPAUSE: toggles playback
│   ├── WIDGET_PREV: previous track
│   ├── WIDGET_NEXT: next track
│   ├── REPEAT_ACTION: cycle repeat modes
│   └── ADDTOFAV_ACTION: toggle favorite
│
└── INTEGRATION:
    ├── WebService calls HomeWidget.onUpdate() after metadata changes
    ├── widget updates automatically when track changes
    ├── uses same MediaActionReceiver as notification
    └── works even when app is closed (service running)
```

**widget update flow:**

1. javascript detects metadata change in spotify
2. calls AndBridge.recMediaStatus(json)
3. WebService updates static fields with new data
4. WebService calls HomeWidget.onUpdate()
5. widget reads current state from static fields
6. creates RemoteViews with updated info
7. AppWidgetManager updates all widget instances
8. widget displays new track info and cover

**widget limitations:**
- only updates when service running
- no progress bar (static snapshot)
- requires service for button actions
- single layout (no resizing options)

---

### link handler for spotify urls

```
FILE: java_src/it/deviato/spotifuck/LinkHandler.java
├── LOCATION: java_src/it/deviato/spotifuck/LinkHandler.java
├── TYPE: activity for handling spotify deep links
├── PURPOSE: intercepts spotify urls and plays them in app
│
├── SUPPORTED URL SCHEMES:
│   ├── spotify:// (native spotify uris)
│   └── https://open.spotify.com/ (web links)
│
├── URL CONVERSION:
│   ├── spotify://track/123 -> passes through as-is
│   ├── https://open.spotify.com/track/123 -> spotify:track:123
│   ├── handles intl- prefixes (removes them)
│   └── requires at least 2 path segments (type/id)
│
├── PLAYBACK FLOW:
│   ├── receives intent with spotify url
│   ├── extracts and converts url to spotify uri
│   ├── checks if service running and player loaded
│   ├── if ready: calls javascript playFromUri(uri)
│   ├── if not ready: shows "player not loaded" toast
│   ├── opens MainActivity
│   └── finishes with no transition animation
│
├── MANIFEST INTEGRATION:
│   ├── intent filter for spotify:// scheme
│   ├── intent filter for https://open.spotify.com
│   ├── category DEFAULT and BROWSABLE
│   └── exported activity
│
└── USE CASES:
    ├── clicking spotify links in browser
    ├── sharing tracks from other apps
    ├── opening spotify uris from shortcuts
    └── android auto voice commands
```

**url conversion examples:**

```
https://open.spotify.com/track/abc123
-> spotify:track:abc123

https://open.spotify.com/playlist/xyz789
-> spotify:playlist:xyz789

https://open.spotify.com/intl-es/album/def456
-> spotify:album:def456

spotify://artist/ghi789
-> spotify://artist/ghi789 (unchanged)
```

**javascript integration:**

LinkHandler calls `playFromUri('spotify:track:123')` which:
1. extracts uri type (track/album/playlist/artist)
2. sends POST to spotify connect-state api
3. includes auth token and client token
4. spotify starts playing the uri
5. javascript detects change and syncs to android

---

### notification system details

```
NOTIFICATION ARCHITECTURE:
├── foreground service notification (id 1)
├── media style notification with controls
├── updates when metadata changes
├── persistent unless SwipeStop enabled
└── notification channel "SpotifuckChannel" (android 8+)

NOTIFICATION COMPONENTS:
├── small icon: app icon
├── large icon: album cover bitmap
├── title: track name
├── text: artist name
├── subtext: album name (if available)
├── media controls: previous, play/pause, next
├── custom actions: repeat, favorite
└── content intent: opens MainActivity

NOTIFICATION BUILDER:
├── uses NotificationCompat for compatibility
├── media style with MediaSession token
├── shows 3 main actions in compact view
├── expanded view shows all 5 actions
├── color accent from album art
└── ongoing notification (not dismissible by default)

UPDATE MECHANISM:
├── WebService.m2231f() builds notification
├── called after metadata changes
├── reads current state from static fields
├── creates notification with updated info
├── NotificationManager.notify(1337, notification)
└── updates lock screen and notification shade

NOTIFICATION ACTIONS:
├── previous: sends WIDGET_PREV broadcast
├── play/pause: sends WIDGET_PLAYPAUSE broadcast
├── next: sends WIDGET_NEXT broadcast
├── repeat: sends REPEAT_ACTION broadcast
├── favorite: sends ADDTOFAV_ACTION broadcast
└── all handled by MediaActionReceiver
```

**notification vs widget:**
- notification: always visible when service running
- widget: optional, user must add to home screen
- both use same data source (WebService static fields)
- both send actions to MediaActionReceiver
- notification has more features (lock screen, heads-up)

---

### android auto integration

```
ANDROID AUTO ARCHITECTURE:
├── MediaBrowserService implementation
├── exposes media library to android auto
├── provides playback controls
├── syncs metadata and state
└── handles voice commands

SERVICE IMPLEMENTATION:
├── WebService extends AbstractServiceC0729q
├── AbstractServiceC0729q is MediaBrowserServiceCompat
├── registered in manifest with MediaBrowserService action
├── android auto connects via MediaBrowser api
└── receives commands via MediaSession callbacks

MEDIA LIBRARY EXPOSURE:
├── javascript fetches user library via spotify api
├── fetchAllLibrary() gets playlists, albums, artists, podcasts
├── parseLibrary() categorizes items
├── stored in window.mediaLib object
├── android auto can browse library
└── voice commands like "play playlist X" work

METADATA SYNC:
├── AndAuto setting must be enabled
├── javascript scrapes metadata every 2 seconds
├── sends to android via AndBridge.recMediaStatus()
├── WebService updates MediaSession metadata
├── android auto displays current track
├── lock screen shows album art
└── car display shows playback info

PLAYBACK CONTROLS:
├── android auto sends commands to MediaSession
├── MediaSession callbacks invoke javascript functions
├── javascript clicks spotify ui buttons
├── spotify updates playback
├── javascript detects change and syncs back
└── bidirectional sync keeps everything in sync

VOICE COMMANDS:
├── "play [track/album/playlist] [name]"
├── android auto searches library
├── finds matching uri
├── calls playFromUri(uri)
├── javascript sends command to spotify api
└── playback starts
```

**why AndAuto setting exists:**
- fetching library requires api calls (battery/data usage)
- scraping metadata every 2 seconds (performance impact)
- some users don't use android auto
- can disable for better battery life
- still works without it (just no library browsing)

---

### custom webview client behaviors

```
FILE: java_src/p032R0/C0361c.java (custom WebView)
├── LOCATION: java_src/p032R0/C0361c.java
├── TYPE: extended WebView class
├── PURPOSE: handles visibility changes for video playback
│
├── VISIBILITY HANDLING:
│   ├── overrides onWindowVisibilityChanged()
│   ├── detects when webview becomes hidden (GONE or INVISIBLE)
│   ├── checks if video is playing via javascript
│   ├── query: "typeof playing!=='undefined'&&playing&&!!document.querySelector('.VideoPlayer__container video')"
│   ├── if video playing: keeps webview visible (prevents pause)
│   ├── if no video: allows normal visibility change
│   └── prevents spotify from pausing video when app backgrounded
│
└── PURPOSE:
    ├── spotify pauses video when webview hidden
    ├── this hack keeps video playing in background
    ├── allows picture-in-picture style behavior
    └── maintains playback when switching apps
```

```
FILE: java_src/p032R0/C0362d.java (WebChromeClient)
├── LOCATION: java_src/p032R0/C0362d.java
├── TYPE: custom WebChromeClient
├── PURPOSE: handles permission requests from webview
│
├── PERMISSION HANDLING:
│   ├── overrides onPermissionRequest()
│   ├── checks if request is for PROTECTED_MEDIA_ID
│   ├── PROTECTED_MEDIA_ID: drm/widevine for encrypted content
│   ├── if protected media: grants permission automatically
│   ├── if other permission: denies automatically
│   └── no user prompt (automatic decision)
│
└── PURPOSE:
    ├── spotify uses widevine drm for some content
    ├── auto-grants drm permission for playback
    ├── prevents permission dialogs interrupting playback
    └── denies other permissions (camera, mic, location)
```

```
FILE: java_src/p032R0/C0363e.java (WebViewClient)
├── already documented in javascript injection section
├── handles page loading, ad blocking, javascript injection
├── intercepts network requests
├── spoofs browser fingerprint
└── manages login flow
```

**webview configuration (AppSingleton.m2224b()):**

```
user agent: windows chrome desktop
javascript: enabled
dom storage: enabled
database: enabled
media autoplay: enabled (no user gesture required)
multiple windows: enabled
wide viewport: enabled
zoom: enabled
initial scale: 100%
background color: dark red (#ff443434)
javascript bridge: "AndBridge" interface
chrome client: C0362d (permission handler)
webview client: C0363e (ad blocker, injector)
```

**key behaviors:**
- spoofs desktop browser to get full web player
- auto-grants drm permissions for encrypted content
- keeps video playing when app backgrounded
- blocks ads at network level
- injects massive javascript for control
- bridges javascript and android via AndBridge

---

## documentation status

**completed:**
- obfuscation analysis
- app startup flow (MainActivity, AppSingleton)
- classic login button injection
- all 17 app settings and preferences
- complete javascript injection system breakdown
- ad blocking mechanism
- webservice media session implementation
- settings activity ui structure
- home widget implementation
- link handler for spotify urls
- notification system details
- android auto integration
- custom webview client behaviors

**fully documented:**
- all core functionality reverse engineered
- all major components analyzed
- all integration points mapped
- all settings and features explained

**Notes:**
- spotifuck is essentially a webview wrapper with heavy javascript injection
- uses spotify web player instead of native api
- ad blocking via url filtering and silent audio
- media controls bridge javascript and android
- widget and notification use same data pipeline
- android auto works via MediaBrowserService
- custom webview behaviors prevent playback interruption
- entire app is about 1500 java files, mostly obfuscated android libraries
- core logic is in 9 main files (MainActivity, AppSingleton, WebService, etc)