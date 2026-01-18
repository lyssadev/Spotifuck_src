.class public final LR0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static deferMessage(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

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
    if-eqz v0, :cond_3

    .line 10
    .line 11
    const-string v1, "unlock"

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    const p0, 0x7f1000ea

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string v1, "reload"

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    const p0, 0x7f1000e7

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const-string v1, "adblock"

    .line 44
    .line 45
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    const p0, 0x7f1000e1

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    :cond_2
    :goto_0
    new-instance v1, LC/a;

    .line 59
    .line 60
    invoke-direct {v1, v0, p0}, LC/a;-><init>(Lit/deviato/spotifuck/MainActivity;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 64
    .line 65
    .line 66
    :cond_3
    return-void
.end method

.method public static manageTShut(Z)V
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    sget-object v0, Lit/deviato/spotifuck/WebService;->t:Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    sget v0, Lit/deviato/spotifuck/AppSingleton;->z:I

    .line 10
    .line 11
    if-lez v0, :cond_1

    .line 12
    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    sget-object p0, Lit/deviato/spotifuck/AppSingleton;->E:LQ0/e;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    sget-object p0, Lit/deviato/spotifuck/AppSingleton;->C:Landroid/os/Handler;

    .line 20
    .line 21
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->E:LQ0/e;

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    new-instance p0, LQ0/e;

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    invoke-direct {p0, v0}, LQ0/e;-><init>(I)V

    .line 30
    .line 31
    .line 32
    sput-object p0, Lit/deviato/spotifuck/AppSingleton;->E:LQ0/e;

    .line 33
    .line 34
    sget-object p0, Lit/deviato/spotifuck/AppSingleton;->C:Landroid/os/Handler;

    .line 35
    .line 36
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->E:LQ0/e;

    .line 37
    .line 38
    sget v1, Lit/deviato/spotifuck/AppSingleton;->z:I

    .line 39
    .line 40
    int-to-long v1, v1

    .line 41
    const-wide/32 v3, 0xea60

    .line 42
    .line 43
    .line 44
    mul-long v1, v1, v3

    .line 45
    .line 46
    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    sget-object p0, Lit/deviato/spotifuck/AppSingleton;->E:LQ0/e;

    .line 51
    .line 52
    if-eqz p0, :cond_2

    .line 53
    .line 54
    sget-object p0, Lit/deviato/spotifuck/AppSingleton;->C:Landroid/os/Handler;

    .line 55
    .line 56
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->E:LQ0/e;

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    :goto_0
    return-void
.end method

.method public static manageTSleep(Z)V
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    sget-object v0, Lit/deviato/spotifuck/WebService;->t:Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    sget v0, Lit/deviato/spotifuck/AppSingleton;->A:I

    .line 10
    .line 11
    if-lez v0, :cond_1

    .line 12
    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    sget-object p0, Lit/deviato/spotifuck/AppSingleton;->F:LQ0/e;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    sget-object p0, Lit/deviato/spotifuck/AppSingleton;->D:Landroid/os/Handler;

    .line 20
    .line 21
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->F:LQ0/e;

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    new-instance p0, LQ0/e;

    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    invoke-direct {p0, v0}, LQ0/e;-><init>(I)V

    .line 30
    .line 31
    .line 32
    sput-object p0, Lit/deviato/spotifuck/AppSingleton;->F:LQ0/e;

    .line 33
    .line 34
    sget-object p0, Lit/deviato/spotifuck/AppSingleton;->D:Landroid/os/Handler;

    .line 35
    .line 36
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->F:LQ0/e;

    .line 37
    .line 38
    sget v1, Lit/deviato/spotifuck/AppSingleton;->A:I

    .line 39
    .line 40
    int-to-long v1, v1

    .line 41
    const-wide/32 v3, 0xea60

    .line 42
    .line 43
    .line 44
    mul-long v1, v1, v3

    .line 45
    .line 46
    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    sget-object p0, Lit/deviato/spotifuck/AppSingleton;->F:LQ0/e;

    .line 51
    .line 52
    if-eqz p0, :cond_2

    .line 53
    .line 54
    sget-object p0, Lit/deviato/spotifuck/AppSingleton;->D:Landroid/os/Handler;

    .line 55
    .line 56
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->F:LQ0/e;

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    :goto_0
    return-void
.end method

.method public static wakeOff()V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

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
    new-instance v1, LR0/a;

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    invoke-direct {v1, v2}, LR0/a;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static wakeUp()V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

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
    new-instance v1, LR0/a;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v1, v2}, LR0/a;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public cssInjected()V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    invoke-static {}, Lit/deviato/spotifuck/AppSingleton;->a()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public isWoke()Z
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->j:LR0/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getWindowVisibility()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    return v0
.end method

.method public loginDetected()V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    sput-boolean v0, Lit/deviato/spotifuck/AppSingleton;->n:Z

    .line 3
    .line 4
    sget-object v1, Lit/deviato/spotifuck/AppSingleton;->i:Landroid/content/SharedPreferences$Editor;

    .line 5
    .line 6
    const-string v2, "LoggedIn"

    .line 7
    .line 8
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 9
    .line 10
    .line 11
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->i:Landroid/content/SharedPreferences$Editor;

    .line 12
    .line 13
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public playLoaded()V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    sput-boolean v0, Lit/deviato/spotifuck/AppSingleton;->B:Z

    .line 3
    .line 4
    invoke-static {}, Lit/deviato/spotifuck/AppSingleton;->a()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public recMediaPosition(J)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    sput-wide p1, Lit/deviato/spotifuck/WebService;->A:J

    .line 2
    .line 3
    invoke-static {}, Lit/deviato/spotifuck/WebService;->e()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public recMediaStatus(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "track"

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_3

    .line 13
    .line 14
    sget-object v1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    goto/16 :goto_2

    .line 23
    .line 24
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    sput-object p1, Lit/deviato/spotifuck/WebService;->x:Ljava/lang/String;

    .line 29
    .line 30
    const-string p1, "artist"

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    sput-object p1, Lit/deviato/spotifuck/WebService;->w:Ljava/lang/String;

    .line 37
    .line 38
    const-string p1, "position"

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 41
    .line 42
    .line 43
    move-result-wide v1

    .line 44
    sput-wide v1, Lit/deviato/spotifuck/WebService;->A:J

    .line 45
    .line 46
    const-string p1, "duration"

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 49
    .line 50
    .line 51
    move-result-wide v1

    .line 52
    sput-wide v1, Lit/deviato/spotifuck/WebService;->z:J

    .line 53
    .line 54
    const-string p1, "playing"

    .line 55
    .line 56
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    sput-boolean p1, Lit/deviato/spotifuck/WebService;->D:Z

    .line 61
    .line 62
    const-string p1, "repeat"

    .line 63
    .line 64
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    sput-object p1, Lit/deviato/spotifuck/WebService;->y:Ljava/lang/String;

    .line 69
    .line 70
    const-string p1, "fav"

    .line 71
    .line 72
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    sput-boolean p1, Lit/deviato/spotifuck/WebService;->E:Z

    .line 77
    .line 78
    const-string p1, "cover"

    .line 79
    .line 80
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    const-string v0, "00004851"

    .line 85
    .line 86
    const-string v1, "0000b273"

    .line 87
    .line 88
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    const/4 v0, 0x0

    .line 93
    sput-object v0, Lit/deviato/spotifuck/WebService;->v:Landroid/graphics/Bitmap;

    .line 94
    .line 95
    if-eqz p1, :cond_2

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 101
    if-nez v0, :cond_2

    .line 102
    .line 103
    :try_start_1
    invoke-static {}, LQ0/w;->c()LQ0/w;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-eqz v1, :cond_1

    .line 119
    .line 120
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    new-instance v1, LQ0/A;

    .line 125
    .line 126
    invoke-direct {v1, v0, p1}, LQ0/A;-><init>(LQ0/w;Landroid/net/Uri;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1}, LQ0/A;->a()Landroid/graphics/Bitmap;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    sput-object p1, Lit/deviato/spotifuck/WebService;->v:Landroid/graphics/Bitmap;

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :catch_0
    move-exception p1

    .line 137
    goto :goto_0

    .line 138
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 139
    .line 140
    const-string v0, "Path must not be empty."

    .line 141
    .line 142
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 146
    :goto_0
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :catch_1
    move-exception p1

    .line 151
    goto :goto_3

    .line 152
    :cond_2
    :goto_1
    sget-object p1, Lit/deviato/spotifuck/WebService;->n:Landroid/support/v4/media/session/t;

    .line 153
    .line 154
    sget-object p1, Lit/deviato/spotifuck/WebService;->n:Landroid/support/v4/media/session/t;

    .line 155
    .line 156
    sget-object p1, Lit/deviato/spotifuck/WebService;->n:Landroid/support/v4/media/session/t;

    .line 157
    .line 158
    sget-object p1, Lit/deviato/spotifuck/WebService;->n:Landroid/support/v4/media/session/t;

    .line 159
    .line 160
    sget-object p1, Lit/deviato/spotifuck/WebService;->n:Landroid/support/v4/media/session/t;

    .line 161
    .line 162
    sget-object p1, Lit/deviato/spotifuck/WebService;->n:Landroid/support/v4/media/session/t;

    .line 163
    .line 164
    sget-object p1, Lit/deviato/spotifuck/WebService;->n:Landroid/support/v4/media/session/t;

    .line 165
    .line 166
    invoke-static {}, Lit/deviato/spotifuck/WebService;->f()V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 167
    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_3
    :goto_2
    return-void

    .line 171
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 172
    .line 173
    .line 174
    :goto_4
    return-void
.end method
