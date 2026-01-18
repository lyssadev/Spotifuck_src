.class public final LR0/e;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# virtual methods
.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "https://www.facebook.com/privacy/consent/gdp/"

    .line 5
    .line 6
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string p2, "(function(){document.querySelector(\'#facebook div[role=button]\').click();})();"

    .line 14
    .line 15
    invoke-virtual {p1, p2, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string v0, "/login"

    .line 20
    .line 21
    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    const-string p2, "(function(){let gl=document.querySelector(\'section>div>div>div>div>a:first-child:not(.fuckd)\');if(gl) {  let cl=document.createElement(\'a\');  cl.className=\'fuckd\';  cl.innerText=\'Email + Password Classic Login\';  cl.style.cssText=\'display:block;padding:10px;margin:10px 0;color:white;font-weight:bold;text-decoration:none;border:1px solid #ddd;background:#339;border-radius:30px\';  cl.href=\'?allow_password=1\';  gl.parentNode.insertBefore(cl,gl);}})();"

    .line 28
    .line 29
    invoke-virtual {p1, p2, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    :goto_0
    sget-boolean p2, Lit/deviato/spotifuck/AppSingleton;->n:Z

    .line 33
    .line 34
    if-eqz p2, :cond_d

    .line 35
    .line 36
    sget-boolean p2, Lit/deviato/spotifuck/AppSingleton;->r:Z

    .line 37
    .line 38
    if-eqz p2, :cond_2

    .line 39
    .line 40
    const-string p2, "let reqPause=false,firstPlay=true,ulFlag=false,ffDone=false,npOpen=false;featVer=`web-player_${new Date().toISOString().split(\'T\')[0]}_${Date.now()}_${Math.floor(Math.random()*0xFFFFFFF).toString(16).padStart(7,\'0\')}`;lastState=null;lastPos=null;playing=false;pfint=null;afint=null;cssint=null;aaint=null;window.updMedia=function(){  const currState=track+\'|\'+artist+\'|\'+playing+\'|\'+repmode+\'|\'+isfav;  if(currState!==lastState) {    lastState=currState;    const values={artist:artist,track:track,playing:playing,repeat:repmode,fav:isfav,duration:duration,position:position,cover:cover};    AndBridge.recMediaStatus(JSON.stringify(values));  }  else {    if(Math.abs(position-lastPos)>4000) AndBridge.recMediaPosition(position);    lastPos=position;  }};window.fetchAllLibrary=async function(){  const limit=50;  let offset=0;  let allItems=[];  let hasMore=true;  while(hasMore){    const resp=await oriFetch(\'https://api-partner.spotify.com/pathfinder/v2/query\',{      method:\'POST\',      headers:{        \'Authorization\':window.spotAuthToken,\'Client-Token\':window.spotCliToken,\'Content-Type\':\'application/json;charset=UTF-8\'      },      body:JSON.stringify({        variables:{          filters:[],order:null,textFilter:\'\',features:[\'LIKED_SONGS\',\'YOUR_EPISODES_V2\',\'PRERELEASES\',\'EVENTS\'],          limit:limit,offset:offset,flatten:false,expandedFolders:[],folderUri:null,includeFoldersWhenFlattening:true        },        operationName:\'libraryV3\',        extensions:{          persistedQuery:{version:1,sha256Hash:\'0082bf82412db50128add72dbdb73e2961d59100b9cbf41fb25c568bd8bc358b\'}        }      })    });    if(!resp.ok){      const text=await resp.text();      throw new Error(`Error HTTP ${resp.status}: ${text}`);    }    const data=await resp.json();    const items=data?.data?.me?.libraryV3?.items||[];    allItems=allItems.concat(items);    if(items.length<limit) {      hasMore=false;    } else {      offset+=limit;    }  }  return allItems;};window.parseLibrary=function(items) {  const res={playlists:[],albums:[],artists:[],podcasts:[]};  items.forEach(({item})=>{    const data=item.data;    if(!data||!data.__typename) return;    switch(data.__typename) {      case \'PseudoPlaylist\':        res.playlists.push({          id:data.uri,name:data.name,image:data.image?.sources?.[0]?.url||null        });        break;      case \'Playlist\':        res.playlists.push({          id:data.uri,name:data.name,image:data.images?.items?.[0]?.sources?.[0]?.url||null        });        break;      case \'Album\':        res.albums.push({          id:data.uri,name:data.name,image:data.coverArt?.sources?.[0]?.url||null,          artists:data.artists?.items?.map(a=>a.profile?.name).filter(Boolean)||[]        });        break;      case \'Artist\':        res.artists.push({          id:data.uri,name:data.profile?.name,image:data.visuals?.avatarImage?.sources?.[0]?.url||null        });        break;      case \'Podcast\':        res.podcasts.push({          id:data.uri,name:data.name,image:data.coverArt?.sources?.[0]?.url||null,          artists:data.publisher?.name?[data.publisher.name]:[]        });        break;      default:        break;    }  });  return res;};window.checkMediaLib=function(){  if(typeof window.mediaLib===\'undefined\'&&window.spotCliToken&&window.spotAuthToken&&window.spotDevId) {    fetchAllLibrary().then(allItems=>{      console.log(\'\u2705 FetchAllLibrary OK. Items:\'+allItems.length);      window.mediaLib=parseLibrary(allItems);    }).catch(err=>{      console.error(\'\u274c FetchAllLibrary Error:\',err);    });  }};"

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    const-string p2, "let reqPause=false,firstPlay=true,ulFlag=false,ffDone=false,npOpen=false;featVer=`web-player_${new Date().toISOString().split(\'T\')[0]}_${Date.now()}_${Math.floor(Math.random()*0xFFFFFFF).toString(16).padStart(7,\'0\')}`;lastState=null;lastPos=null;playing=false;pfint=null;afint=null;cssint=null;aaint=null;"

    .line 44
    .line 45
    :goto_1
    const-string v0, "const oriFetch=window.fetch;window.fetch=async function(...args) {  const [url,opts]=args;  const ts=new Date().toISOString().slice(11,23);  const method=opts?.method?.toUpperCase?.()||\'GET\';  const headers=opts?.headers||{};  if(method===\'POST\'&&url.includes(\'/track-playback/v1/devices\')&&opts?.body){    const body=JSON.parse(opts.body);    const deviceId=body?.device?.device_id;    if(deviceId&&deviceId!==window.spotDevId){      window.spotDevId=deviceId;      /*console.log(`\ud83c\udf10 [${ts}] [${method}] \u2192 ${url}`);      console.log(\'\ud83d\udcfb Device ID body:\',deviceId);*/      typeof checkMediaLib===\'function\'&&checkMediaLib();    }  }  else if(method===\'POST\'&&url.includes(\'/pathfinder/v2/query\')&&opts?.body){    const body=JSON.parse(opts.body);    if(body?.operationName===\'isCurated\'){      const currUri=body?.variables?.uris?.[0];      if(currUri&&currUri!==window.currUri){        window.currUri=currUri;        /*console.log(`\ud83c\udf10 [${ts}] [${method}] \u2192 ${url}`);        console.log(\'\ud83c\udfb5 Current URI:\',currUri);*/      }    }  }  else {    let match=url.match(/\\/connect-state\\/v1\\/player\\/(?:command|transfer)\\/from\\/([^/]+)\\/to\\/([^/]+)/);    if(match?.[2]&&match[2]!==window.spotDevId) {      window.spotDevId=match[2];      /*console.log(`\ud83c\udf10 [${ts}] [${method}] \u2192 ${url}`);      console.log(\'\ud83d\udcfb Device ID change:\',window.spotDevId);*/      typeof checkMediaLib===\'function\'&&checkMediaLib();    }  }  const cliToken=headers[\'Client-Token\']||headers[\'client-token\'];  if(cliToken&&cliToken!==window.spotCliToken) {    window.spotCliToken=cliToken;    /*console.log(`\ud83c\udf10 [${ts}] [${method}] \u2192 ${url}`);    console.log(\'\ud83c\udfa7 Client Token found:\',cliToken);*/    typeof checkMediaLib===\'function\'&&checkMediaLib();  }  const authHead=headers.Authorization||headers.authorization;  if(authHead?.startsWith(\'Bearer \')&&authHead!==window.spotAuthToken) {    window.spotAuthToken=authHead;    /*console.log(`\ud83c\udf10 [${ts}] [${method}] \u2192 ${url}`);    console.log(\'\ud83d\udd11 Auth Token found:\',authHead);*/    typeof checkMediaLib===\'function\'&&checkMediaLib();  }  if(ffDone&&url.includes(\'/track-playback/\')&&method===\'PUT\') {    const paused=opts?.body?JSON.parse(opts?.body)?.state_ref?.paused:undefined;    if(paused===true&&playing) { console.log(\'#Track-Playback: Pause\'); manageAll(false); }    else if(paused===false&&!playing) { console.log(\'#Track-Playback: Play\'); manageAll(true); }  }  try {    const resp=await oriFetch(url,opts);    if(resp.status===404&&url.includes(\'connect-state\')&&url.includes(\'/command/from/\')) {      AndBridge.deferMessage(\'reload\');      console.log(\'Player Locked: reload\');      location.reload();    }"

    .line 46
    .line 47
    invoke-static {p2, v0}, LQ0/E;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    const-string v0, "    return resp;  } catch(err) {    /*console.error(\'\u274c Error in Fetch Request:\', err);    console.error(\'\ud83d\udd0d Name:\', err.name);    console.error(\'\ud83d\udcc4 Message:\', err.message);    console.error(\'\ud83d\udccc Stack:\', err.stack);*/    throw err;  }};window.playFromUri=function(uri) {  console.log(\'#PlayFromUri:\'+uri);  let type=uri.match(/^spotify:([^:]+)/)?.[1];  if(type==\'user\') type=\'your_library\';  oriFetch(`https://gew4-spclient.spotify.com/connect-state/v1/player/command/from/${window.spotDevId}/to/${window.spotDevId}`, {    method:\'POST\',    headers:{\'Authorization\':window.spotAuthToken,\'Client-Token\':window.spotCliToken,\'Content-Type\':\'application/json\'},    body:JSON.stringify({command:{        context:{uri:uri,url:\'context://\'+uri,metadata:{}},        play_origin:{          feature_identifier:type,          feature_version:featVer,          referrer_identifier:\'your_library\'},        options:{license:\'tft\',skip_to:{},player_options_override:{}},        /*logging_params:{          page_instance_ids:[crypto.randomUUID()],          interaction_ids:[crypto.randomUUID()],          command_id:crypto.randomUUID().replace(/-/g,\'\')        },*/endpoint:\'play\'}    })  });};window.firstFuck=function(){ if(pfint) clearInterval(pfint); pfint=setInterval(()=>{  /*console.log(\'pf_tick\');*/  if(playing&&document.visibilityState==\'hidden\'&&!!document.querySelector(\'.VideoPlayer__container video\')) AndBridge.wakeUp();  else if(!AndBridge.isWoke()&&document.visibilityState==\'visible\'&&!document.querySelector(\'.VideoPlayer__container video\')) AndBridge.wakeOff();  if(typeof npBtn==\'undefined\') {    let lyBtn=document.querySelector(\'button[data-testid=lyrics-button]:not(.fuckd)\');    if(lyBtn) {      lyBtn.classList.add(\'fuckd\');      npBtn=document.createElement(\'button\');      npBtn.className=\'npbtn\';      npBtn.onclick=clickNP;      npBtn.innerHTML=`<svg viewBox=\"0 0 16 17\"><rect x=\"1\" y=\"0.75\" width=\"14\" height=\"15.5\" rx=\"2\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"1.5\"/><path d=\"M 6 5 L 6 5.9160156 L 9.6933594 8.5 L 6 11.080078 L 6 12 L 11 8.5 L 6 5 z\" stroke=\"currentColor\" stroke-width=\"1.2\"/></svg>`;      lyBtn.parentNode.insertBefore(npBtn,lyBtn);      closeNowPlay();    }  }  let pb=document.querySelector(\'aside button[data-testid=control-button-playpause]:not(.fuckd)\');  if(pb) {    AndBridge.playLoaded();    console.log(\'#pBtn fuckd\');    pb.classList.add(\'fuckd\');    window.pBtn=pb;    pBtn.addEventListener(\'click\',()=>{      console.log(\'PlayClicked\');      if(pBtn.getAttribute(\'aria-label\')!==\'Play\') {        console.log(\'Pause Req\');        reqPause=true;        ulFlag=false;        manageWake(false);      }      else if(!ulFlag) {        reqPause=false;        manageWake(true);        console.log(\'Adding Unlocker\');        ulFlag=true;        setTimeout(()=>{          console.log(\'Unlocker Timeout Reached\');          if(ulFlag&&pBtn.getAttribute(\'aria-label\')===\'Play\') {            AndBridge.deferMessage(\'unlock\');            console.log(\'#Unlocking!\');            actSkipForward();            trigUnlock();          }          else if(ulFlag) {            console.log(\'Playing, Removing Unlocker\');            ulFlag=false;          }        },10000);      }    });    if(!ffDone){      ffDone=true;      AndBridge.manageTShut(true);      AndBridge.manageTSleep(false);      console.log(\'FirstFuck Adding All Features\');      addAutoFeatures(); addCSSJSHack(); addAndAuto();      setTimeout(()=>{manageAll(playing)},10000);    }  } },5000);};firstFuck();window.manageWake=function(enable){  if(enable) {    if(document.visibilityState==\'hidden\') AndBridge.wakeUp();  }  else {    if(!AndBridge.isWoke()&&document.visibilityState==\'visible\') AndBridge.wakeOff();  }};window.manageAll=function(play){  playing=play;  typeof updMedia===\'function\'&&updMedia();  AndBridge.manageTShut(!play);  AndBridge.manageTSleep(play);  if(play) {    console.log(\'StartingIntervals\');    firstFuck(); addAutoFeatures(); addCSSJSHack(); addAndAuto();  }  else {    console.log(\'KillingIntervals\');    if(pfint) clearInterval(pfint);    if(afint) clearInterval(afint);    if(cssint) clearInterval(cssint);    if(aaint) clearInterval(aaint);  }};window.clickNP=function(){  let rBtn=document.querySelector(\'#Desktop_PanelContainer_Id\').parentNode.parentNode.nextElementSibling.querySelector(\'button\');  if(rBtn) {    let npHid=document.querySelector(\'#Desktop_PanelContainer_Id\').parentNode.parentNode.ariaHidden;    if(npHid&&npHid==\'true\') npBtn.classList.add(\'active\'); else npBtn.classList.remove(\'active\');    rBtn.click();  }};window.closeNowPlay=function(){  let rc=document.querySelector(\'#Desktop_PanelContainer_Id\');  if(rc&&rc.parentNode.parentNode.ariaHidden==\'false\') { console.log(\'#Close NowPlaying\'); clickNP(); }};window.trigUnlock=function(){  let uint=setInterval(()=>{    if(pBtn.disabled) {      AndBridge.deferMessage(\'reload\');      window.location.reload();    }    else if(pBtn.getAttribute(\'aria-label\')!==\'Play\') {      clearInterval(uint);      ulFlag=false;      console.log(\'#Unlocked OK!\');    }  },3000);};window.actPlayPause=function(play) {  console.log(\'PlayPause:\'+play);  if(\'pBtn\' in window) {    if(pBtn.getAttribute(\'aria-label\')===\'Play\') { if(play) pBtn.click(); }    else { if(!play) pBtn.click(); }  }};window.actSkipBack=function() {  console.log(\'SkipBack\');  let bb=document.querySelector(\'button[data-testid=control-button-skip-back]\');  if(bb) { manageWake(true); bb.click(); }};window.actSkipForward=function() {  console.log(\'SkipForward\');  let fb=document.querySelector(\'button[data-testid=control-button-skip-forward]\');  if(fb) { manageWake(true); fb.click(); }};window.actRepeat=function() {  console.log(\'RepeatClick\');  let rb=document.querySelector(\'button[data-testid=control-button-repeat]\');  if(rb) {    if(repmode==\'false\') repmode=\'true\'; else if(repmode==\'true\') repmode=\'mixed\'; else repmode=\'false\';    updMedia(); rb.click();  }};window.actAddToFav=function() {  console.log(\'AddToFav\');  let fb=document.querySelector(\'div[data-testid=now-playing-widget]>div:last-child>button\');  if(fb) {    if(fb.getAttribute(\'aria-checked\')===\'false\') { fb.click(); isfav=true; updMedia(); }    else {      manageWake(true);      fb.click();      let rfint=setInterval(()=>{        manageWake(true);        let fr=document.querySelector(\'#context-menu button[role=menuitemcheckbox][aria-checked=true]\');        if(fr) {          clearInterval(rfint);          fr.click();          setTimeout(()=>{            let sb=document.querySelector(\'#context-menu button[type=submit]\');            if(sb) { sb.click(); isfav=false; updMedia(); }            manageWake(false);          },500);        }      },1000);    }  }};window.actSeek=function(pos) {  let rg=document.querySelector(\'div[data-testid=playback-progressbar] input[type=range]\');  rg.value=pos+1;  rg.dispatchEvent(new Event(\'change\',{bubbles:true}));};"

    .line 52
    .line 53
    invoke-static {p2, v0}, LQ0/E;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    const-string v0, "window.addAutoFeatures=function(){  console.log(\'Adding AutoFeatures\');"

    .line 58
    .line 59
    invoke-static {p2, v0}, LQ0/E;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->k:Ljava/lang/String;

    .line 64
    .line 65
    const-string v2, "onetime"

    .line 66
    .line 67
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_3

    .line 72
    .line 73
    const-string v0, "  if(\'pBtn\' in window&&firstPlay&&pBtn.getAttribute(\'aria-label\')===\'Play\') {    console.log(\'#OneTime AutoPlay\');    pBtn.click();    firstPlay=false;  }"

    .line 74
    .line 75
    invoke-static {p2, v0}, LQ0/E;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    :cond_3
    sget-boolean v0, Lit/deviato/spotifuck/AppSingleton;->p:Z

    .line 80
    .line 81
    const-string v2, "permanent"

    .line 82
    .line 83
    if-nez v0, :cond_4

    .line 84
    .line 85
    sget-boolean v0, Lit/deviato/spotifuck/AppSingleton;->o:Z

    .line 86
    .line 87
    if-nez v0, :cond_4

    .line 88
    .line 89
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->k:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_8

    .line 96
    .line 97
    :cond_4
    const-string v0, "if(afint) clearInterval(afint);afint=setInterval(()=>{  /*console.log(\'af_tick\');*/"

    .line 98
    .line 99
    invoke-static {p2, v0}, LQ0/E;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    sget-boolean v0, Lit/deviato/spotifuck/AppSingleton;->p:Z

    .line 104
    .line 105
    if-eqz v0, :cond_5

    .line 106
    .line 107
    const-string v0, "  closeNowPlay();"

    .line 108
    .line 109
    invoke-static {p2, v0}, LQ0/E;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    :cond_5
    sget-boolean v0, Lit/deviato/spotifuck/AppSingleton;->o:Z

    .line 114
    .line 115
    if-eqz v0, :cond_6

    .line 116
    .line 117
    const-string v0, "  let ft=document.querySelector(\'aside div.encore-bright-accent-set button\');  if(ft) {    console.log(\'#Take Control\');    ft.click();    setTimeout(()=>{      let cb=document.querySelector(\'aside ul[role=list] li[role=listitem] div[role=button]\');      if(cb) cb.click();    },500);  }"

    .line 118
    .line 119
    invoke-static {p2, v0}, LQ0/E;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    :cond_6
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->k:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-eqz v0, :cond_7

    .line 130
    .line 131
    const-string v0, "  if(\'pBtn\' in window&&!reqPause&&!ulFlag&&pBtn.getAttribute(\'aria-label\')===\'Play\') {console.log(\'#Permanent AutoPlay\'); pBtn.click();}"

    .line 132
    .line 133
    invoke-static {p2, v0}, LQ0/E;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    :cond_7
    const-string v0, "},5000);"

    .line 138
    .line 139
    invoke-static {p2, v0}, LQ0/E;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    :cond_8
    const-string v0, "};"

    .line 144
    .line 145
    invoke-static {p2, v0}, LQ0/E;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    const-string v2, "window.addAndAuto=function(){"

    .line 150
    .line 151
    invoke-static {p2, v2}, LQ0/E;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    sget-boolean v2, Lit/deviato/spotifuck/AppSingleton;->r:Z

    .line 156
    .line 157
    if-eqz v2, :cond_9

    .line 158
    .line 159
    const-string v2, "if(aaint) clearInterval(aaint);aaint=setInterval(()=>{  /*console.log(\'aa_tick\');*/  let ta=document.querySelector(\'a[data-testid=context-item-link]\');  if(ta) track=ta.text; else track=null;  let aa=document.querySelector(\'a[data-testid=context-item-info-artist]\');  if(!aa) aa=document.querySelector(\'a[data-testid=context-item-info-show]\');  if(aa) artist=aa.text; else artist=\'\';  /*if(\'pBtn\' in window&&pBtn.getAttribute(\'aria-label\')===\'Play\') realplay=false; else realplay=true;*/  let rr=document.querySelector(\'button[data-testid=control-button-repeat]\');  if(rr) repmode=rr.getAttribute(\'aria-checked\'); else repmode=\'false\';  let fb=document.querySelector(\'div[data-testid=now-playing-widget]>div:last-child>button\');  if(fb&&fb.getAttribute(\'aria-checked\')===\'true\') isfav=true; else isfav=false;   let rg=document.querySelector(\'div[data-testid=playback-progressbar] input[type=range]\');  if(rg) { duration=parseInt(rg.getAttribute(\'max\')); position=parseInt(rg.getAttribute(\'value\')); }  else { duration=null; position=null; }  let im=document.querySelector(\'img[data-testid=cover-art-image]\');  if(im) cover=im.src; else cover=null;  updMedia();},2000);"

    .line 160
    .line 161
    invoke-static {p2, v2}, LQ0/E;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    :cond_9
    invoke-static {p2, v0}, LQ0/E;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    const-string v2, "window.addCSSJSHack=function(){"

    .line 170
    .line 171
    invoke-static {p2, v2}, LQ0/E;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    sget-object v2, Lit/deviato/spotifuck/AppSingleton;->l:Ljava/lang/String;

    .line 176
    .line 177
    const-string v3, "csshack"

    .line 178
    .line 179
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    if-eqz v2, :cond_a

    .line 184
    .line 185
    const-string v2, "if(cssint) clearInterval(cssint);cssint=setInterval(function(){  /*console.log(\'css_tick\');*/  let lb=document.querySelector(\'#Desktop_LeftSidebar_Id header>div>div:first-child button:not(.fuckd)\');  if(lb) {    console.log(\'LibBtnFuckd\');    window.lBtn=lb;    lb.classList.add(\'fuckd\',\'lbtn\');    lb.style.padding=0;    lb.style.height=\'20px\';    lb.addEventListener(\'click\',function(){setTimeout(()=>switchLs(),0)});    switchLs();    AndBridge.cssInjected();  }  let lbit=document.querySelector(\'#Desktop_LeftSidebar_Id div[role=grid]:not(.fuckd)\');  if(lbit) {    lbit.classList.add(\'fuckd\');    lbit.addEventListener(\'click\',()=>{setTimeout(()=>{      console.log(\'AutoCloseLib\');      lBtn.click();      closeNowPlay();    },0)});  }  let hb=document.querySelector(\'#global-nav-bar button[data-testid=home-button]:not(.fuckd)\');  if(hb) {    hb.classList.add(\'fuckd\');    hb.addEventListener(\'click\',()=>{ closeNowPlay(); });  }  let sr=document.querySelector(\'input[data-testid=search-input]:not(.fuckd)\');  if(sr) {    sr.classList.add(\'fuckd\');    sr.addEventListener(\'focus\',()=>{      let npb=document.querySelector(\'aside[data-testid=now-playing-bar]\');      if(npb) npb.style.display=\'none\';      closeNowPlay();    });    sr.addEventListener(\'blur\',()=>{      let npb=document.querySelector(\'aside[data-testid=now-playing-bar]\');      if(npb) npb.style.display=\'flex\';    });  }  let ub=document.querySelector(\'button[data-testid=user-widget-link]:not(.fuckd)\');  if(ub) {    ub.classList.add(\'fuckd\');    ub.addEventListener(\'click\',()=>{ closeNowPlay(); });  }},5000);"

    .line 186
    .line 187
    invoke-static {p2, v2}, LQ0/E;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p2

    .line 191
    :cond_a
    new-instance v2, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    const-string p2, "window.switchLs=function(){  let ls=document.querySelector(\'#Desktop_LeftSidebar_Id\');  if(ls) {    let exp=ls.querySelector(\'nav>div>div:first-child\').classList.length;    if(exp==2) {      console.log(\'Expanded\');      ls.style.position=\'fixed\';      ls.style.width=\'100%\';      ls.style.height=\'92%\';      ls.style.left=0;      ls.style.zIndex=20;      let lh=ls.querySelector(\'header>div>div:first-child h1\');      lh.innerHTML=\'\u2716 &nbsp; "

    .line 200
    .line 201
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    sget-object p2, Lit/deviato/spotifuck/AppSingleton;->f:Landroid/content/Context;

    .line 205
    .line 206
    const v4, 0x7f1000e2

    .line 207
    .line 208
    .line 209
    invoke-virtual {p2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object p2

    .line 213
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    const-string p2, "\';    }    else {      console.log(\'Collapsed\');      ls.style.zIndex=1;      ls.style.position=\'fixed\';      ls.style.top=\'0\';      ls.style.left=\'60px\';      ls.style.width=\'48px\';      ls.style.height=\'48px\';    }  }};"

    .line 217
    .line 218
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object p2

    .line 225
    invoke-static {p2, v0}, LQ0/E;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p2

    .line 229
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->l:Ljava/lang/String;

    .line 230
    .line 231
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-eqz v0, :cond_b

    .line 236
    .line 237
    const-string v0, "let st=document.createElement(\'style\');st.textContent=\'body{min-width:100%!important;min-height:100%!important} .os-scrollbar{--os-size:6px!important} .contentSpacing{padding:0} div[data-testid=root]{--panel-gap:0!important} #main-view+div,#main-view+div>div{overflow:hidden!important;width:auto} #main-view+div>div>div>div:nth-child(2)>div{width:100vw!important} div[data-encore-id=banner],#global-nav-bar>div:first-of-type,#global-nav-bar a[href=\"/download\"],button[data-testid=fullscreen-mode-button],div.main-view-container__mh-footer-container{display:none!important} section[data-testid=artist-page]>div>div:first-child:not([data-encore-id]){height:25vh} div[data-testid=tracklist-row]{padding:0 10px 0 0;grid-gap:0} div[data-testid=tracklist-row] button:not([data-testid=add-to-playlist-button]){transform:scale(1.3)!important;opacity:0.6!important} div[data-testid=tracklist-row] button:{-webkit-margin-end:0!important} div[data-testid=tracklist-row] button:hover{color:#2d6!important} div[data-testid=tracklist-row]>div:first-child>div:first-child{height:24px;min-height:24px;min-width:24px;margin:0 8px!important} [aria-colcount=\"3\"] div[data-testid=tracklist-row]{grid-template-columns:[index] var(--tracklist-index-column-width,40px) [first] minmax(120px,var(--col1,4fr)) [last] minmax(82px,var(--col2,1fr))!important} [aria-colcount=\"4\"] div[data-testid=tracklist-row]{grid-template-columns:[index] var(--tracklist-index-column-width,40px) [first] minmax(120px,var(--col1,4fr)) [var1] minmax(120px,var(--col2,2fr)) [last] minmax(82px,var(--col3,1fr))!important} [aria-colcount=\"5\"] div[data-testid=tracklist-row]{grid-template-columns:[index] var(--tracklist-index-column-width,40px) [first] minmax(120px,var(--col1,6fr)) [var1] minmax(120px,var(--col2,4fr)) [var2] minmax(120px,var(--col3,3fr)) [last] minmax(82px,var(--col4,1fr))!important} section[data-testid=track-page]>div.contentSpacing>div:nth-child(2) [aria-colcount=\"2\"] div[data-testid=tracklist-row]{grid-template-columns:[first] minmax(120px,var(--col0,4fr)) [last] minmax(82px,var(--col1,1fr))!important} section[data-testid=track-page]>div.contentSpacing>div:nth-child(2) [aria-colcount=\"3\"] div[data-testid=tracklist-row]{grid-template-columns:[first] minmax(120px,var(--col0,4fr)) [var1] minmax(120px,var(--col1,2fr)) [last] minmax(82px,var(--col2,1fr))!important} .npbtn{cursor:pointer;color:#b3b3b3;background:transparent;border:none;width:32px;height:32px;padding:8px} .npbtn.active{color:#1db954} *{--content-spacing:10px} section[data-testid=home-page] .contentSpacing{padding:0 10px!important;overflow:hidden} div[data-testid=grid-container]{margin-inline:0!important;column-gap:0!important;overflow:hidden!important} div[data-testid=action-bar-row],div[data-testid=topbar-content]{padding:5px 10px} div[data-testid=track-list]>div:first-child,div[data-testid=playlist-tracklist]>div:first-child{margin:0!important;padding:0!important} main>section:not([data-testid=artist-page])>div:first-child{height:auto!important;min-height:auto!important;padding:10px} section[data-testid=track-page]>div>div.contentSpacing>div:last-child{overflow:hidden} section[data-testid=artist-page]>div>div:first-child>div.contentSpacing{padding:10px} section[data-testid=artist-page] div[data-testid=grid-container] h2,section[data-testid=artist-page] section[data-testid=component-shelf]{padding:0 10px} main>section h1.encore-text-headline-large{font-size:22px!important} section[data-testid=artist-page] span.encore-text-headline-large{font-size:26px!important} section[data-testid=track-page] h1{font-size:20px!important} aside[data-testid=now-playing-bar]{min-width:100%!important;box-shadow:0 0 6px #440000;background:linear-gradient(to bottom,#770000,#330000)!important} aside[data-testid=now-playing-bar]>div:first-child{margin-top:2px;flex-direction:column!important;height:auto!important} aside[data-testid=now-playing-bar]>div>div{width:100%!important} aside[data-testid=now-playing-bar]>div>div:last-child>div{min-height:32px;margin:5px 10px} aside[data-testid=now-playing-bar]>div>div:last-child button{transform:scale(1.15);margin:0 5px} div[data-testid=general-controls]{margin:15px 0 25px} div[data-testid=general-controls] button{transform:scale(1.4)!important;margin:0 8px!important} div[data-testid=player-controls]{margin:5px 0} div[data-testid=now-playing-widget]{justify-content:center;overflow:hidden} form[role=search]{z-index:10;margin-left:48px;max-width:88%} div[data-testid=now-playing-widget]>div:last-child>button{transform:scale(1.3)} div[data-testid=now-playing-widget]>div:first-child{display:none!important} div[data-testid=now-playing-widget]>div:nth-child(2){display:flex!important;overflow:hidden!important} div[data-testid=now-playing-widget]>div:nth-child(2) span{font-size:13px!important;height:20px!important;margin:0!important} div[data-testid=now-playing-widget]>div:nth-child(2)>div{min-width:auto;max-width:66%} [data-tippy-root]{overflow:hidden!important} [data-tippy-root],[data-tippy-root] *{transition:none!important;transform:none!important} div[data-testid=hover-or-focus-tooltip],#Desktop_LeftSidebar_Id header>div>div:last-child{display:none!important}#Desktop_LeftSidebar_Id>nav>div{min-height:48px;border-radius:25px} .YourLibraryX{overflow:hidden;background:var(--background-elevated-base)!important}.YourLibraryX header{padding:14px} \';document.head.appendChild(st);"

    .line 238
    .line 239
    invoke-static {p2, v0}, LQ0/E;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object p2

    .line 243
    :cond_b
    sget-boolean v0, Lit/deviato/spotifuck/AppSingleton;->q:Z

    .line 244
    .line 245
    if-eqz v0, :cond_c

    .line 246
    .line 247
    const-string v0, "let aled=document.createElement(\'style\');aled.textContent=\'.encore-dark-theme{--background-base:#000;--background-highlight:#000;--background-elevated-base:#000;--background-elevated-highlight:#000;--background-elevated-press:#000;--background-tinted-base:#000}  aside[data-testid=now-playing-bar]{background:#000!important;box-shadow:none;border-top:1px solid #666}\';document.head.appendChild(aled);"

    .line 248
    .line 249
    invoke-static {p2, v0}, LQ0/E;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object p2

    .line 253
    :cond_c
    const-string v0, "console\\.log\\([^)]+\\);"

    .line 254
    .line 255
    const-string v2, ""

    .line 256
    .line 257
    invoke-virtual {p2, v0, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object p2

    .line 261
    invoke-virtual {p1, p2, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 262
    .line 263
    .line 264
    goto :goto_2

    .line 265
    :cond_d
    const-string p2, "(function() {let l=document.querySelector(\'button[data-testid=web-player-link]\');if(l) { AndBridge.loginDetected(); l.click(); }})();"

    .line 266
    .line 267
    invoke-virtual {p1, p2, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 268
    .line 269
    .line 270
    :goto_2
    return-void
.end method

.method public final onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2

    .line 1
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->f:Landroid/content/Context;

    .line 2
    .line 3
    const-string v0, "(function(){window.screen.__defineGetter__(\'width\',function(){return 1920;});window.screen.__defineGetter__(\'height\',function(){return 1080;});window.screen.__defineGetter__(\'availWidth\',function(){return 1920;});window.screen.__defineGetter__(\'availHeight\',function(){return 1040;});window.__defineGetter__(\'innerWidth\',function(){return 1920;});window.__defineGetter__(\'innerHeight\',function(){return 978;});window.navigator.__defineGetter__(\'vendor\',function(){return \'Google Inc.\';});window.navigator.__defineGetter__(\'productSub\',function(){return \'20030107\';});window.navigator.__defineGetter__(\'platform\',function(){return \'Win32\';});window.navigator.__defineGetter__(\'oscpu\',function(){return \'null\';});})()"

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p1, v0, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 12

    .line 1
    const-string v0, "audio/mpeg"

    .line 2
    .line 3
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getRequestHeaders()Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/4 v3, 0x0

    .line 16
    :try_start_0
    new-instance v4, Ljava/net/URL;

    .line 17
    .line 18
    invoke-direct {v4, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 26
    .line 27
    :try_start_1
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getMethod()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {v4, p2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, Ljava/util/Map$Entry;

    .line 53
    .line 54
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    check-cast v5, Ljava/lang/String;

    .line 59
    .line 60
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v4, v5, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    move-exception p1

    .line 71
    move-object v3, v4

    .line 72
    goto/16 :goto_5

    .line 73
    .line 74
    :catch_0
    move-exception p1

    .line 75
    goto/16 :goto_3

    .line 76
    .line 77
    :cond_0
    invoke-virtual {v4}, Ljava/net/URLConnection;->connect()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    const-string v2, "doubleclick.net"

    .line 85
    .line 86
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-nez v2, :cond_4

    .line 91
    .line 92
    const-string v2, "googlesyndication.com"

    .line 93
    .line 94
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-nez v2, :cond_4

    .line 99
    .line 100
    const-string v2, "fastly-insights.com"

    .line 101
    .line 102
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-nez v2, :cond_4

    .line 107
    .line 108
    const-string v2, "sentry.io"

    .line 109
    .line 110
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_1

    .line 115
    .line 116
    goto/16 :goto_2

    .line 117
    .line 118
    :cond_1
    if-eqz p2, :cond_3

    .line 119
    .line 120
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    if-eqz p2, :cond_3

    .line 125
    .line 126
    const-string p2, "podz-content"

    .line 127
    .line 128
    invoke-virtual {v1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    if-nez p2, :cond_3

    .line 133
    .line 134
    const-string p2, "gew4-spclient"

    .line 135
    .line 136
    invoke-virtual {v1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    if-nez p2, :cond_3

    .line 141
    .line 142
    const-string p2, "akamaized.net/audio/"

    .line 143
    .line 144
    invoke-virtual {v1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 145
    .line 146
    .line 147
    move-result p2

    .line 148
    if-nez p2, :cond_2

    .line 149
    .line 150
    const-string p2, "scdn.co/audio/"

    .line 151
    .line 152
    invoke-virtual {v1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 153
    .line 154
    .line 155
    move-result p2

    .line 156
    if-nez p2, :cond_2

    .line 157
    .line 158
    const-string p2, "scdn.co/mp3-ad/"

    .line 159
    .line 160
    invoke-virtual {v1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 161
    .line 162
    .line 163
    move-result p2

    .line 164
    if-nez p2, :cond_2

    .line 165
    .line 166
    const-string p2, "spotifycdn.com/audio/"

    .line 167
    .line 168
    invoke-virtual {v1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 169
    .line 170
    .line 171
    move-result p2

    .line 172
    if-nez p2, :cond_2

    .line 173
    .line 174
    const-string p2, "amillionads.com"

    .line 175
    .line 176
    invoke-virtual {v1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 177
    .line 178
    .line 179
    move-result p2

    .line 180
    if-nez p2, :cond_2

    .line 181
    .line 182
    const-string p2, "2mdn.net"

    .line 183
    .line 184
    invoke-virtual {v1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 185
    .line 186
    .line 187
    move-result p2

    .line 188
    if-nez p2, :cond_2

    .line 189
    .line 190
    const-string p2, "adxcel.com"

    .line 191
    .line 192
    invoke-virtual {v1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 193
    .line 194
    .line 195
    move-result p2

    .line 196
    if-nez p2, :cond_2

    .line 197
    .line 198
    const-string p2, "adstudio-assets.scdn.co"

    .line 199
    .line 200
    invoke-virtual {v1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 201
    .line 202
    .line 203
    move-result p2

    .line 204
    if-eqz p2, :cond_3

    .line 205
    .line 206
    :cond_2
    const-string p2, "adblock"

    .line 207
    .line 208
    invoke-static {p2}, LR0/f;->deferMessage(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    const-string p2, "silent.mp3"

    .line 220
    .line 221
    invoke-virtual {p1, p2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    new-instance p2, Landroid/webkit/WebResourceResponse;

    .line 226
    .line 227
    invoke-direct {p2, v0, v3, p1}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 228
    .line 229
    .line 230
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 231
    .line 232
    .line 233
    return-object p2

    .line 234
    :cond_3
    :goto_1
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 235
    .line 236
    .line 237
    goto :goto_4

    .line 238
    :cond_4
    :goto_2
    :try_start_2
    new-instance v10, Ljava/util/HashMap;

    .line 239
    .line 240
    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 241
    .line 242
    .line 243
    const-string p1, "Access-Control-Allow-Origin"

    .line 244
    .line 245
    const-string p2, "*"

    .line 246
    .line 247
    invoke-virtual {v10, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    new-instance p1, Landroid/webkit/WebResourceResponse;

    .line 251
    .line 252
    const-string v6, "text/plain"

    .line 253
    .line 254
    const-string v7, "utf-8"

    .line 255
    .line 256
    const-string v9, "OK"

    .line 257
    .line 258
    new-instance v11, Ljava/io/ByteArrayInputStream;

    .line 259
    .line 260
    const/4 p2, 0x0

    .line 261
    new-array p2, p2, [B

    .line 262
    .line 263
    invoke-direct {v11, p2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 264
    .line 265
    .line 266
    const/16 v8, 0xc8

    .line 267
    .line 268
    move-object v5, p1

    .line 269
    invoke-direct/range {v5 .. v11}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/io/InputStream;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 270
    .line 271
    .line 272
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 273
    .line 274
    .line 275
    return-object p1

    .line 276
    :catchall_1
    move-exception p1

    .line 277
    goto :goto_5

    .line 278
    :catch_1
    move-exception p1

    .line 279
    move-object v4, v3

    .line 280
    :goto_3
    :try_start_3
    const-string p2, "Spotifuck"

    .line 281
    .line 282
    const-string v0, "Error intercepting request"

    .line 283
    .line 284
    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 285
    .line 286
    .line 287
    if-eqz v4, :cond_5

    .line 288
    .line 289
    goto :goto_1

    .line 290
    :cond_5
    :goto_4
    return-object v3

    .line 291
    :goto_5
    if-eqz v3, :cond_6

    .line 292
    .line 293
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 294
    .line 295
    .line 296
    :cond_6
    throw p1
.end method
