.class public final Landroid/support/v4/media/b;
.super Landroid/media/browse/MediaBrowser$ConnectionCallback;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lf0/b;


# direct methods
.method public constructor <init>(Lf0/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/support/v4/media/b;->a:Lf0/b;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/media/browse/MediaBrowser$ConnectionCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onConnected()V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Landroid/support/v4/media/b;->a:Lf0/b;

    .line 3
    .line 4
    iget-object v2, v1, Lf0/b;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v2, Landroid/support/v4/media/c;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v2, :cond_5

    .line 10
    .line 11
    iget-object v4, v2, Landroid/support/v4/media/c;->b:Landroid/media/browse/MediaBrowser;

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {v4}, Landroid/media/browse/MediaBrowser;->getExtras()Landroid/os/Bundle;

    .line 14
    .line 15
    .line 16
    move-result-object v5
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 17
    if-nez v5, :cond_0

    .line 18
    .line 19
    goto/16 :goto_2

    .line 20
    .line 21
    :cond_0
    const-string v6, "extra_service_version"

    .line 22
    .line 23
    invoke-virtual {v5, v6, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 24
    .line 25
    .line 26
    const-string v6, "extra_messenger"

    .line 27
    .line 28
    invoke-virtual {v5, v6}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    if-eqz v6, :cond_1

    .line 33
    .line 34
    new-instance v7, LE/j;

    .line 35
    .line 36
    const/4 v8, 0x5

    .line 37
    invoke-direct {v7, v8, v0}, LE/j;-><init>(IZ)V

    .line 38
    .line 39
    .line 40
    new-instance v0, Landroid/os/Messenger;

    .line 41
    .line 42
    invoke-direct {v0, v6}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, v7, LE/j;->g:Ljava/lang/Object;

    .line 46
    .line 47
    iget-object v0, v2, Landroid/support/v4/media/c;->c:Landroid/os/Bundle;

    .line 48
    .line 49
    iput-object v0, v7, LE/j;->h:Ljava/lang/Object;

    .line 50
    .line 51
    iput-object v7, v2, Landroid/support/v4/media/c;->f:LE/j;

    .line 52
    .line 53
    new-instance v0, Landroid/os/Messenger;

    .line 54
    .line 55
    iget-object v6, v2, Landroid/support/v4/media/c;->d:Landroid/support/v4/media/a;

    .line 56
    .line 57
    invoke-direct {v0, v6}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    .line 58
    .line 59
    .line 60
    iput-object v0, v2, Landroid/support/v4/media/c;->g:Landroid/os/Messenger;

    .line 61
    .line 62
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    new-instance v7, Ljava/lang/ref/WeakReference;

    .line 66
    .line 67
    invoke-direct {v7, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iput-object v7, v6, Landroid/support/v4/media/a;->b:Ljava/lang/ref/WeakReference;

    .line 71
    .line 72
    :try_start_1
    iget-object v0, v2, Landroid/support/v4/media/c;->f:LE/j;

    .line 73
    .line 74
    iget-object v6, v2, Landroid/support/v4/media/c;->a:Landroid/content/Context;

    .line 75
    .line 76
    iget-object v7, v2, Landroid/support/v4/media/c;->g:Landroid/os/Messenger;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    new-instance v8, Landroid/os/Bundle;

    .line 82
    .line 83
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 84
    .line 85
    .line 86
    const-string v9, "data_package_name"

    .line 87
    .line 88
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-virtual {v8, v9, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    const-string v6, "data_calling_pid"

    .line 96
    .line 97
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    invoke-virtual {v8, v6, v9}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 102
    .line 103
    .line 104
    const-string v6, "data_root_hints"

    .line 105
    .line 106
    iget-object v9, v0, LE/j;->h:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v9, Landroid/os/Bundle;

    .line 109
    .line 110
    invoke-virtual {v8, v6, v9}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 111
    .line 112
    .line 113
    const/4 v6, 0x6

    .line 114
    invoke-virtual {v0, v6, v8, v7}, LE/j;->M(ILandroid/os/Bundle;Landroid/os/Messenger;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 115
    .line 116
    .line 117
    :catch_0
    :cond_1
    const-string v0, "extra_session_binder"

    .line 118
    .line 119
    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    sget v5, Landroid/support/v4/media/session/n;->c:I

    .line 124
    .line 125
    if-nez v0, :cond_2

    .line 126
    .line 127
    move-object v5, v3

    .line 128
    goto :goto_0

    .line 129
    :cond_2
    const-string v5, "android.support.v4.media.session.IMediaSession"

    .line 130
    .line 131
    invoke-interface {v0, v5}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    if-eqz v5, :cond_3

    .line 136
    .line 137
    instance-of v6, v5, Landroid/support/v4/media/session/d;

    .line 138
    .line 139
    if-eqz v6, :cond_3

    .line 140
    .line 141
    check-cast v5, Landroid/support/v4/media/session/d;

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_3
    new-instance v5, Landroid/support/v4/media/session/c;

    .line 145
    .line 146
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 147
    .line 148
    .line 149
    iput-object v0, v5, Landroid/support/v4/media/session/c;->b:Landroid/os/IBinder;

    .line 150
    .line 151
    :goto_0
    if-eqz v5, :cond_5

    .line 152
    .line 153
    invoke-virtual {v4}, Landroid/media/browse/MediaBrowser;->getSessionToken()Landroid/media/session/MediaSession$Token;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    if-eqz v0, :cond_4

    .line 158
    .line 159
    new-instance v4, Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 160
    .line 161
    invoke-direct {v4, v0, v5}, Landroid/support/v4/media/session/MediaSessionCompat$Token;-><init>(Ljava/lang/Object;Landroid/support/v4/media/session/d;)V

    .line 162
    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_4
    move-object v4, v3

    .line 166
    :goto_1
    iput-object v4, v2, Landroid/support/v4/media/c;->h:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :catch_1
    move-exception v0

    .line 170
    const-string v2, "MediaBrowserCompat"

    .line 171
    .line 172
    const-string v4, "Unexpected IllegalStateException"

    .line 173
    .line 174
    invoke-static {v2, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 175
    .line 176
    .line 177
    :cond_5
    :goto_2
    iget-object v0, v1, Lf0/b;->f:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v0, Landroid/support/v4/media/f;

    .line 180
    .line 181
    iget-object v0, v0, Landroid/support/v4/media/f;->a:Landroid/support/v4/media/c;

    .line 182
    .line 183
    iget-object v2, v0, Landroid/support/v4/media/c;->h:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 184
    .line 185
    if-nez v2, :cond_7

    .line 186
    .line 187
    iget-object v2, v0, Landroid/support/v4/media/c;->b:Landroid/media/browse/MediaBrowser;

    .line 188
    .line 189
    invoke-virtual {v2}, Landroid/media/browse/MediaBrowser;->getSessionToken()Landroid/media/session/MediaSession$Token;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    if-eqz v2, :cond_6

    .line 194
    .line 195
    new-instance v4, Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 196
    .line 197
    invoke-direct {v4, v2, v3}, Landroid/support/v4/media/session/MediaSessionCompat$Token;-><init>(Ljava/lang/Object;Landroid/support/v4/media/session/d;)V

    .line 198
    .line 199
    .line 200
    move-object v3, v4

    .line 201
    :cond_6
    iput-object v3, v0, Landroid/support/v4/media/c;->h:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 202
    .line 203
    :cond_7
    iget-object v0, v0, Landroid/support/v4/media/c;->h:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 204
    .line 205
    if-eqz v0, :cond_a

    .line 206
    .line 207
    new-instance v2, Ljava/util/HashSet;

    .line 208
    .line 209
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 210
    .line 211
    .line 212
    invoke-static {v2}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 213
    .line 214
    .line 215
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 216
    .line 217
    const/16 v3, 0x1d

    .line 218
    .line 219
    iget-object v4, v1, Lf0/b;->c:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v4, Landroid/content/Context;

    .line 222
    .line 223
    if-lt v2, v3, :cond_8

    .line 224
    .line 225
    new-instance v2, Landroid/support/v4/media/session/g;

    .line 226
    .line 227
    invoke-direct {v2, v4, v0}, Landroid/support/v4/media/session/f;-><init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    .line 228
    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_8
    new-instance v2, Landroid/support/v4/media/session/f;

    .line 232
    .line 233
    invoke-direct {v2, v4, v0}, Landroid/support/v4/media/session/f;-><init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    .line 234
    .line 235
    .line 236
    :goto_3
    iget-object v0, v1, Lf0/b;->d:Ljava/lang/Cloneable;

    .line 237
    .line 238
    check-cast v0, Landroid/content/Intent;

    .line 239
    .line 240
    const-string v3, "android.intent.extra.KEY_EVENT"

    .line 241
    .line 242
    invoke-virtual {v0, v3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    check-cast v0, Landroid/view/KeyEvent;

    .line 247
    .line 248
    if-eqz v0, :cond_9

    .line 249
    .line 250
    iget-object v2, v2, Landroid/support/v4/media/session/f;->a:Landroid/media/session/MediaController;

    .line 251
    .line 252
    invoke-virtual {v2, v0}, Landroid/media/session/MediaController;->dispatchMediaButtonEvent(Landroid/view/KeyEvent;)Z

    .line 253
    .line 254
    .line 255
    invoke-virtual {v1}, Lf0/b;->c()V

    .line 256
    .line 257
    .line 258
    return-void

    .line 259
    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 260
    .line 261
    const-string v1, "KeyEvent may not be null"

    .line 262
    .line 263
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    throw v0

    .line 267
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 268
    .line 269
    const-string v1, "sessionToken must not be null"

    .line 270
    .line 271
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    throw v0
.end method

.method public final onConnectionFailed()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/b;->a:Lf0/b;

    .line 2
    .line 3
    iget-object v1, v0, Lf0/b;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/support/v4/media/c;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {v0}, Lf0/b;->c()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final onConnectionSuspended()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/b;->a:Lf0/b;

    .line 2
    .line 3
    iget-object v1, v0, Lf0/b;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/support/v4/media/c;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    iput-object v2, v1, Landroid/support/v4/media/c;->f:LE/j;

    .line 11
    .line 12
    iput-object v2, v1, Landroid/support/v4/media/c;->g:Landroid/os/Messenger;

    .line 13
    .line 14
    iput-object v2, v1, Landroid/support/v4/media/c;->h:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 15
    .line 16
    iget-object v1, v1, Landroid/support/v4/media/c;->d:Landroid/support/v4/media/a;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    invoke-direct {v3, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iput-object v3, v1, Landroid/support/v4/media/a;->b:Ljava/lang/ref/WeakReference;

    .line 27
    .line 28
    :cond_0
    invoke-virtual {v0}, Lf0/b;->c()V

    .line 29
    .line 30
    .line 31
    return-void
.end method
