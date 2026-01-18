.class public Lit/deviato/spotifuck/AppSingleton;
.super Landroid/app/Application;
.source "SourceFile"


# static fields
.field public static A:I = 0x0

.field public static B:Z = false

.field public static final C:Landroid/os/Handler;

.field public static final D:Landroid/os/Handler;

.field public static E:LQ0/e;

.field public static F:LQ0/e;

.field public static f:Landroid/content/Context;

.field public static g:Ljava/lang/ref/WeakReference;

.field public static h:Landroid/content/SharedPreferences;

.field public static i:Landroid/content/SharedPreferences$Editor;

.field public static j:LR0/c;

.field public static k:Ljava/lang/String;

.field public static l:Ljava/lang/String;

.field public static m:Z

.field public static n:Z

.field public static o:Z

.field public static p:Z

.field public static q:Z

.field public static r:Z

.field public static s:Z

.field public static t:Z

.field public static u:Z

.field public static v:Z

.field public static w:Z

.field public static x:Z

.field public static y:Z

.field public static z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lit/deviato/spotifuck/AppSingleton;->C:Landroid/os/Handler;

    .line 11
    .line 12
    new-instance v0, Landroid/os/Handler;

    .line 13
    .line 14
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lit/deviato/spotifuck/AppSingleton;->D:Landroid/os/Handler;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a()V
    .locals 3

    .line 1
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->g:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lit/deviato/spotifuck/MainActivity;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v1, LR0/a;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v1, v0, v2}, LR0/a;-><init>(Lit/deviato/spotifuck/MainActivity;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public static b()Landroid/webkit/WebView;
    .locals 3

    .line 1
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->j:LR0/c;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, LR0/c;

    .line 6
    .line 7
    sget-object v1, Lit/deviato/spotifuck/AppSingleton;->f:Landroid/content/Context;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lit/deviato/spotifuck/AppSingleton;->j:LR0/c;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setDatabaseEnabled(Z)V

    .line 37
    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setMediaPlaybackRequiresUserGesture(Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 50
    .line 51
    .line 52
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->j:LR0/c;

    .line 53
    .line 54
    const/16 v1, 0x64

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setInitialScale(I)V

    .line 57
    .line 58
    .line 59
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->j:LR0/c;

    .line 60
    .line 61
    const v1, -0xbbbbbc

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 65
    .line 66
    .line 67
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->j:LR0/c;

    .line 68
    .line 69
    new-instance v1, LR0/f;

    .line 70
    .line 71
    sget-object v2, Lit/deviato/spotifuck/AppSingleton;->f:Landroid/content/Context;

    .line 72
    .line 73
    invoke-direct {v1, v2}, LR0/f;-><init>(Landroid/content/Context;)V

    .line 74
    .line 75
    .line 76
    const-string v2, "AndBridge"

    .line 77
    .line 78
    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->j:LR0/c;

    .line 82
    .line 83
    new-instance v1, LR0/d;

    .line 84
    .line 85
    invoke-direct {v1}, Landroid/webkit/WebChromeClient;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 89
    .line 90
    .line 91
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->j:LR0/c;

    .line 92
    .line 93
    new-instance v1, LR0/e;

    .line 94
    .line 95
    invoke-direct {v1}, Landroid/webkit/WebViewClient;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 99
    .line 100
    .line 101
    sget-boolean v0, Lit/deviato/spotifuck/AppSingleton;->B:Z

    .line 102
    .line 103
    if-nez v0, :cond_1

    .line 104
    .line 105
    sget-boolean v0, Lit/deviato/spotifuck/AppSingleton;->n:Z

    .line 106
    .line 107
    if-nez v0, :cond_0

    .line 108
    .line 109
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->j:LR0/c;

    .line 110
    .line 111
    const-string v1, "https://accounts.spotify.com/login"

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_0
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->j:LR0/c;

    .line 118
    .line 119
    const-string v1, "https://open.spotify.com/"

    .line 120
    .line 121
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    :cond_1
    :goto_0
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->j:LR0/c;

    .line 125
    .line 126
    return-object v0
.end method


# virtual methods
.method public final onCreate()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Lit/deviato/spotifuck/AppSingleton;->f:Landroid/content/Context;

    .line 9
    .line 10
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lit/deviato/spotifuck/AppSingleton;->h:Landroid/content/SharedPreferences;

    .line 15
    .line 16
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Lit/deviato/spotifuck/AppSingleton;->i:Landroid/content/SharedPreferences$Editor;

    .line 21
    .line 22
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->h:Landroid/content/SharedPreferences;

    .line 23
    .line 24
    const-string v1, "ServiceOn"

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    sput-boolean v0, Lit/deviato/spotifuck/AppSingleton;->m:Z

    .line 32
    .line 33
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->h:Landroid/content/SharedPreferences;

    .line 34
    .line 35
    const-string v1, "LoggedIn"

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    sput-boolean v0, Lit/deviato/spotifuck/AppSingleton;->n:Z

    .line 43
    .line 44
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->h:Landroid/content/SharedPreferences;

    .line 45
    .line 46
    const-string v1, "APlayMode"

    .line 47
    .line 48
    const-string v4, "disabled"

    .line 49
    .line 50
    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sput-object v0, Lit/deviato/spotifuck/AppSingleton;->k:Ljava/lang/String;

    .line 55
    .line 56
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->h:Landroid/content/SharedPreferences;

    .line 57
    .line 58
    const-string v1, "CloseNowPlay"

    .line 59
    .line 60
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    sput-boolean v0, Lit/deviato/spotifuck/AppSingleton;->p:Z

    .line 65
    .line 66
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->h:Landroid/content/SharedPreferences;

    .line 67
    .line 68
    const-string v1, "TakeControl"

    .line 69
    .line 70
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    sput-boolean v0, Lit/deviato/spotifuck/AppSingleton;->o:Z

    .line 75
    .line 76
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->h:Landroid/content/SharedPreferences;

    .line 77
    .line 78
    const-string v1, "GuiMode"

    .line 79
    .line 80
    const-string v4, "csshack"

    .line 81
    .line 82
    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    sput-object v0, Lit/deviato/spotifuck/AppSingleton;->l:Ljava/lang/String;

    .line 87
    .line 88
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->h:Landroid/content/SharedPreferences;

    .line 89
    .line 90
    const-string v1, "Amoled"

    .line 91
    .line 92
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    sput-boolean v0, Lit/deviato/spotifuck/AppSingleton;->q:Z

    .line 97
    .line 98
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->h:Landroid/content/SharedPreferences;

    .line 99
    .line 100
    const-string v1, "AndAuto"

    .line 101
    .line 102
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    sput-boolean v0, Lit/deviato/spotifuck/AppSingleton;->r:Z

    .line 107
    .line 108
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->h:Landroid/content/SharedPreferences;

    .line 109
    .line 110
    const-string v1, "SwipeStop"

    .line 111
    .line 112
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    sput-boolean v0, Lit/deviato/spotifuck/AppSingleton;->s:Z

    .line 117
    .line 118
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->h:Landroid/content/SharedPreferences;

    .line 119
    .line 120
    const-string v1, "AutoShut"

    .line 121
    .line 122
    const-string v2, "0"

    .line 123
    .line 124
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    sput v0, Lit/deviato/spotifuck/AppSingleton;->z:I

    .line 133
    .line 134
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->h:Landroid/content/SharedPreferences;

    .line 135
    .line 136
    const-string v1, "AutoSleep"

    .line 137
    .line 138
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    sput v0, Lit/deviato/spotifuck/AppSingleton;->A:I

    .line 147
    .line 148
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->h:Landroid/content/SharedPreferences;

    .line 149
    .line 150
    const-string v1, "ForcePortrait"

    .line 151
    .line 152
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    sput-boolean v0, Lit/deviato/spotifuck/AppSingleton;->t:Z

    .line 157
    .line 158
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->h:Landroid/content/SharedPreferences;

    .line 159
    .line 160
    const-string v1, "ForceEn"

    .line 161
    .line 162
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    sput-boolean v0, Lit/deviato/spotifuck/AppSingleton;->u:Z

    .line 167
    .line 168
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->h:Landroid/content/SharedPreferences;

    .line 169
    .line 170
    const-string v1, "HPAP"

    .line 171
    .line 172
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    sput-boolean v0, Lit/deviato/spotifuck/AppSingleton;->v:Z

    .line 177
    .line 178
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->h:Landroid/content/SharedPreferences;

    .line 179
    .line 180
    const-string v1, "HPAS"

    .line 181
    .line 182
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    sput-boolean v0, Lit/deviato/spotifuck/AppSingleton;->w:Z

    .line 187
    .line 188
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->h:Landroid/content/SharedPreferences;

    .line 189
    .line 190
    const-string v1, "BTAP"

    .line 191
    .line 192
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    sput-boolean v0, Lit/deviato/spotifuck/AppSingleton;->x:Z

    .line 197
    .line 198
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->h:Landroid/content/SharedPreferences;

    .line 199
    .line 200
    const-string v1, "BTAS"

    .line 201
    .line 202
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    sput-boolean v0, Lit/deviato/spotifuck/AppSingleton;->y:Z

    .line 207
    .line 208
    return-void
.end method
