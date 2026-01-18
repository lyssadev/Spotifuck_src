.class public Lit/deviato/spotifuck/WebService;
.super Ld0/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lit/deviato/spotifuck/WebService$MediaActionReceiver;
    }
.end annotation


# static fields
.field public static A:J

.field public static B:I

.field public static C:I

.field public static D:Z

.field public static E:Z

.field public static F:Lit/deviato/spotifuck/WebService$MediaActionReceiver;

.field public static G:Landroid/media/AudioManager;

.field public static H:LR0/n;

.field public static n:Landroid/support/v4/media/session/t;

.field public static o:Landroid/app/Notification;

.field public static p:LC/k;

.field public static q:Lit/deviato/spotifuck/WebService;

.field public static r:Landroid/webkit/WebView;

.field public static s:Landroid/os/PowerManager$WakeLock;

.field public static t:Ljava/lang/Boolean;

.field public static u:Ljava/lang/Boolean;

.field public static v:Landroid/graphics/Bitmap;

.field public static w:Ljava/lang/String;

.field public static x:Ljava/lang/String;

.field public static y:Ljava/lang/String;

.field public static z:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    sput-object v0, Lit/deviato/spotifuck/WebService;->t:Ljava/lang/Boolean;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    sput-object v0, Lit/deviato/spotifuck/WebService;->v:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    const-string v0, "No Artist"

    .line 9
    .line 10
    sput-object v0, Lit/deviato/spotifuck/WebService;->w:Ljava/lang/String;

    .line 11
    .line 12
    const-string v0, "No Track"

    .line 13
    .line 14
    sput-object v0, Lit/deviato/spotifuck/WebService;->x:Ljava/lang/String;

    .line 15
    .line 16
    const-string v0, "false"

    .line 17
    .line 18
    sput-object v0, Lit/deviato/spotifuck/WebService;->y:Ljava/lang/String;

    .line 19
    .line 20
    const-wide/16 v0, 0x0

    .line 21
    .line 22
    sput-wide v0, Lit/deviato/spotifuck/WebService;->z:J

    .line 23
    .line 24
    sput-wide v0, Lit/deviato/spotifuck/WebService;->A:J

    .line 25
    .line 26
    const/16 v0, 0x8

    .line 27
    .line 28
    sput v0, Lit/deviato/spotifuck/WebService;->B:I

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    sput-boolean v0, Lit/deviato/spotifuck/WebService;->D:Z

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    sput-boolean v0, Lit/deviato/spotifuck/WebService;->E:Z

    .line 35
    .line 36
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ld0/q;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaBrowserCompat$MediaItem;
    .locals 10

    .line 1
    new-instance v9, Landroid/support/v4/media/MediaDescriptionCompat;

    .line 2
    .line 3
    const/4 v7, 0x0

    .line 4
    const/4 v8, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v6, 0x0

    .line 9
    move-object v0, v9

    .line 10
    move-object v1, p0

    .line 11
    move-object v2, p1

    .line 12
    invoke-direct/range {v0 .. v8}, Landroid/support/v4/media/MediaDescriptionCompat;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/os/Bundle;Landroid/net/Uri;)V

    .line 13
    .line 14
    .line 15
    new-instance p0, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-direct {p0, v9, p1}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;-><init>(Landroid/support/v4/media/MediaDescriptionCompat;I)V

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method public static e()V
    .locals 25

    .line 1
    sget-object v0, Lit/deviato/spotifuck/WebService;->n:Landroid/support/v4/media/session/t;

    .line 2
    .line 3
    iget-object v0, v0, Landroid/support/v4/media/session/t;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LA/b;

    .line 6
    .line 7
    iget-object v0, v0, LA/b;->g:Ljava/lang/Object;

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, Landroid/support/v4/media/session/f;

    .line 11
    .line 12
    iget-object v0, v1, Landroid/support/v4/media/session/f;->e:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->a()Landroid/support/v4/media/session/d;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    :try_start_0
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->a()Landroid/support/v4/media/session/d;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0}, Landroid/support/v4/media/session/d;->O()Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 25
    .line 26
    .line 27
    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    goto/16 :goto_3

    .line 29
    .line 30
    :catch_0
    move-exception v0

    .line 31
    const-string v2, "MediaControllerCompat"

    .line 32
    .line 33
    const-string v3, "Dead object in getPlaybackState."

    .line 34
    .line 35
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 36
    .line 37
    .line 38
    :cond_0
    iget-object v0, v1, Landroid/support/v4/media/session/f;->a:Landroid/media/session/MediaController;

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/media/session/MediaController;->getPlaybackState()Landroid/media/session/PlaybackState;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const/4 v1, 0x0

    .line 45
    if-eqz v0, :cond_5

    .line 46
    .line 47
    invoke-static {v0}, Landroid/support/v4/media/session/u;->j(Landroid/media/session/PlaybackState;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    if-eqz v2, :cond_3

    .line 52
    .line 53
    new-instance v3, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_2

    .line 71
    .line 72
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    if-eqz v4, :cond_1

    .line 77
    .line 78
    check-cast v4, Landroid/media/session/PlaybackState$CustomAction;

    .line 79
    .line 80
    invoke-static {v4}, Landroid/support/v4/media/session/u;->l(Landroid/media/session/PlaybackState$CustomAction;)Landroid/os/Bundle;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-static {v5}, Landroid/support/v4/media/session/t;->j(Landroid/os/Bundle;)V

    .line 85
    .line 86
    .line 87
    new-instance v6, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    .line 88
    .line 89
    invoke-static {v4}, Landroid/support/v4/media/session/u;->f(Landroid/media/session/PlaybackState$CustomAction;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    invoke-static {v4}, Landroid/support/v4/media/session/u;->o(Landroid/media/session/PlaybackState$CustomAction;)Ljava/lang/CharSequence;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    invoke-static {v4}, Landroid/support/v4/media/session/u;->m(Landroid/media/session/PlaybackState$CustomAction;)I

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    invoke-direct {v6, v7, v8, v9, v5}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;ILandroid/os/Bundle;)V

    .line 102
    .line 103
    .line 104
    iput-object v4, v6, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->e:Landroid/media/session/PlaybackState$CustomAction;

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_1
    move-object v6, v1

    .line 108
    :goto_1
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_2
    move-object/from16 v20, v3

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_3
    move-object/from16 v20, v1

    .line 116
    .line 117
    :goto_2
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 118
    .line 119
    const/16 v3, 0x16

    .line 120
    .line 121
    if-lt v2, v3, :cond_4

    .line 122
    .line 123
    invoke-static {v0}, Landroid/support/v4/media/session/v;->a(Landroid/media/session/PlaybackState;)Landroid/os/Bundle;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-static {v1}, Landroid/support/v4/media/session/t;->j(Landroid/os/Bundle;)V

    .line 128
    .line 129
    .line 130
    :cond_4
    move-object/from16 v23, v1

    .line 131
    .line 132
    new-instance v1, Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 133
    .line 134
    move-object v7, v1

    .line 135
    invoke-static {v0}, Landroid/support/v4/media/session/u;->r(Landroid/media/session/PlaybackState;)I

    .line 136
    .line 137
    .line 138
    move-result v8

    .line 139
    invoke-static {v0}, Landroid/support/v4/media/session/u;->q(Landroid/media/session/PlaybackState;)J

    .line 140
    .line 141
    .line 142
    move-result-wide v9

    .line 143
    invoke-static {v0}, Landroid/support/v4/media/session/u;->i(Landroid/media/session/PlaybackState;)J

    .line 144
    .line 145
    .line 146
    move-result-wide v11

    .line 147
    invoke-static {v0}, Landroid/support/v4/media/session/u;->p(Landroid/media/session/PlaybackState;)F

    .line 148
    .line 149
    .line 150
    move-result v13

    .line 151
    invoke-static {v0}, Landroid/support/v4/media/session/u;->g(Landroid/media/session/PlaybackState;)J

    .line 152
    .line 153
    .line 154
    move-result-wide v14

    .line 155
    invoke-static {v0}, Landroid/support/v4/media/session/u;->k(Landroid/media/session/PlaybackState;)Ljava/lang/CharSequence;

    .line 156
    .line 157
    .line 158
    move-result-object v17

    .line 159
    invoke-static {v0}, Landroid/support/v4/media/session/u;->n(Landroid/media/session/PlaybackState;)J

    .line 160
    .line 161
    .line 162
    move-result-wide v18

    .line 163
    invoke-static {v0}, Landroid/support/v4/media/session/u;->h(Landroid/media/session/PlaybackState;)J

    .line 164
    .line 165
    .line 166
    move-result-wide v21

    .line 167
    const/16 v16, 0x0

    .line 168
    .line 169
    invoke-direct/range {v7 .. v23}, Landroid/support/v4/media/session/PlaybackStateCompat;-><init>(IJJFJILjava/lang/CharSequence;JLjava/util/ArrayList;JLandroid/os/Bundle;)V

    .line 170
    .line 171
    .line 172
    iput-object v0, v1, Landroid/support/v4/media/session/PlaybackStateCompat;->l:Landroid/media/session/PlaybackState;

    .line 173
    .line 174
    :cond_5
    move-object v0, v1

    .line 175
    :goto_3
    new-instance v14, Ljava/util/ArrayList;

    .line 176
    .line 177
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 178
    .line 179
    .line 180
    iget-wide v8, v0, Landroid/support/v4/media/session/PlaybackStateCompat;->e:J

    .line 181
    .line 182
    sget v2, Lit/deviato/spotifuck/WebService;->B:I

    .line 183
    .line 184
    sget-wide v3, Lit/deviato/spotifuck/WebService;->A:J

    .line 185
    .line 186
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 187
    .line 188
    .line 189
    move-result-wide v12

    .line 190
    iget-object v0, v0, Landroid/support/v4/media/session/PlaybackStateCompat;->i:Ljava/util/ArrayList;

    .line 191
    .line 192
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    if-eqz v1, :cond_7

    .line 201
    .line 202
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    check-cast v1, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    .line 207
    .line 208
    if-eqz v1, :cond_6

    .line 209
    .line 210
    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 215
    .line 216
    const-string v1, "You may not add a null CustomAction to PlaybackStateCompat"

    .line 217
    .line 218
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    throw v0

    .line 222
    :cond_7
    sget-object v0, Lit/deviato/spotifuck/WebService;->n:Landroid/support/v4/media/session/t;

    .line 223
    .line 224
    new-instance v15, Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 225
    .line 226
    move-object v1, v15

    .line 227
    const-wide/16 v5, 0x0

    .line 228
    .line 229
    const/16 v17, 0x0

    .line 230
    .line 231
    const/high16 v7, 0x3f800000    # 1.0f

    .line 232
    .line 233
    const/4 v10, 0x0

    .line 234
    const/4 v11, 0x0

    .line 235
    const-wide/16 v18, -0x1

    .line 236
    .line 237
    move-object/from16 v24, v15

    .line 238
    .line 239
    move-wide/from16 v15, v18

    .line 240
    .line 241
    invoke-direct/range {v1 .. v17}, Landroid/support/v4/media/session/PlaybackStateCompat;-><init>(IJJFJILjava/lang/CharSequence;JLjava/util/ArrayList;JLandroid/os/Bundle;)V

    .line 242
    .line 243
    .line 244
    move-object/from16 v1, v24

    .line 245
    .line 246
    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/t;->D(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    .line 247
    .line 248
    .line 249
    return-void
.end method

.method public static f()V
    .locals 31

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    sget-object v2, Lit/deviato/spotifuck/WebService;->y:Ljava/lang/String;

    .line 4
    .line 5
    const-string v3, "true"

    .line 6
    .line 7
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    const v2, 0x7f0800f6

    .line 14
    .line 15
    .line 16
    sput v2, Lit/deviato/spotifuck/WebService;->C:I

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-object v2, Lit/deviato/spotifuck/WebService;->y:Ljava/lang/String;

    .line 20
    .line 21
    const-string v3, "mixed"

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    const v2, 0x7f0800f7

    .line 30
    .line 31
    .line 32
    sput v2, Lit/deviato/spotifuck/WebService;->C:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const v2, 0x7f0800f5

    .line 36
    .line 37
    .line 38
    sput v2, Lit/deviato/spotifuck/WebService;->C:I

    .line 39
    .line 40
    :goto_0
    sget-boolean v2, Lit/deviato/spotifuck/WebService;->D:Z

    .line 41
    .line 42
    const/4 v3, 0x3

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    const/4 v4, 0x3

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    const/4 v4, 0x2

    .line 48
    :goto_1
    sput v4, Lit/deviato/spotifuck/WebService;->B:I

    .line 49
    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    sget-object v2, Lit/deviato/spotifuck/WebService;->s:Landroid/os/PowerManager$WakeLock;

    .line 53
    .line 54
    invoke-virtual {v2}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-nez v2, :cond_4

    .line 59
    .line 60
    sget-object v2, Lit/deviato/spotifuck/WebService;->s:Landroid/os/PowerManager$WakeLock;

    .line 61
    .line 62
    invoke-virtual {v2}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    sget-object v2, Lit/deviato/spotifuck/WebService;->s:Landroid/os/PowerManager$WakeLock;

    .line 67
    .line 68
    invoke-virtual {v2}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_4

    .line 73
    .line 74
    sget-object v2, Lit/deviato/spotifuck/WebService;->s:Landroid/os/PowerManager$WakeLock;

    .line 75
    .line 76
    invoke-virtual {v2}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 77
    .line 78
    .line 79
    :cond_4
    :goto_2
    sget-boolean v2, Lit/deviato/spotifuck/WebService;->E:Z

    .line 80
    .line 81
    if-eqz v2, :cond_5

    .line 82
    .line 83
    const v2, 0x7f080090

    .line 84
    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_5
    const v2, 0x7f08008f

    .line 88
    .line 89
    .line 90
    :goto_3
    const-string v6, "ADDTOFAV_ACTION"

    .line 91
    .line 92
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    const-string v8, "You must specify an action to build a CustomAction"

    .line 97
    .line 98
    if-nez v7, :cond_15

    .line 99
    .line 100
    const-string v7, "Add to Favorites"

    .line 101
    .line 102
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 103
    .line 104
    .line 105
    move-result v9

    .line 106
    const-string v10, "You must specify a name to build a CustomAction"

    .line 107
    .line 108
    if-nez v9, :cond_14

    .line 109
    .line 110
    const-string v9, "You must specify an icon resource id to build a CustomAction"

    .line 111
    .line 112
    if-eqz v2, :cond_13

    .line 113
    .line 114
    sget v11, Lit/deviato/spotifuck/WebService;->C:I

    .line 115
    .line 116
    const-string v12, "REPEAT_ACTION"

    .line 117
    .line 118
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 119
    .line 120
    .line 121
    move-result v13

    .line 122
    if-nez v13, :cond_12

    .line 123
    .line 124
    const-string v8, "Repeat"

    .line 125
    .line 126
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 127
    .line 128
    .line 129
    move-result v13

    .line 130
    if-nez v13, :cond_11

    .line 131
    .line 132
    if-eqz v11, :cond_10

    .line 133
    .line 134
    new-instance v9, Ljava/util/ArrayList;

    .line 135
    .line 136
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 137
    .line 138
    .line 139
    new-instance v10, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    .line 140
    .line 141
    invoke-direct {v10, v6, v7, v2, v0}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;ILandroid/os/Bundle;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    new-instance v2, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    .line 148
    .line 149
    invoke-direct {v2, v12, v8, v11, v0}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;ILandroid/os/Bundle;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    sget v15, Lit/deviato/spotifuck/WebService;->B:I

    .line 156
    .line 157
    sget-wide v16, Lit/deviato/spotifuck/WebService;->A:J

    .line 158
    .line 159
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 160
    .line 161
    .line 162
    move-result-wide v25

    .line 163
    sget-object v2, Lit/deviato/spotifuck/WebService;->n:Landroid/support/v4/media/session/t;

    .line 164
    .line 165
    new-instance v7, Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 166
    .line 167
    move-object v14, v7

    .line 168
    const-wide/16 v18, 0x0

    .line 169
    .line 170
    const/16 v30, 0x0

    .line 171
    .line 172
    const/high16 v20, 0x3f800000    # 1.0f

    .line 173
    .line 174
    const-wide/16 v21, 0x736

    .line 175
    .line 176
    const/16 v23, 0x0

    .line 177
    .line 178
    const/16 v24, 0x0

    .line 179
    .line 180
    const-wide/16 v28, -0x1

    .line 181
    .line 182
    move-object/from16 v27, v9

    .line 183
    .line 184
    invoke-direct/range {v14 .. v30}, Landroid/support/v4/media/session/PlaybackStateCompat;-><init>(IJJFJILjava/lang/CharSequence;JLjava/util/ArrayList;JLandroid/os/Bundle;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2, v7}, Landroid/support/v4/media/session/t;->D(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    .line 188
    .line 189
    .line 190
    new-instance v2, Landroid/support/v4/media/i;

    .line 191
    .line 192
    invoke-direct {v2}, Landroid/support/v4/media/i;-><init>()V

    .line 193
    .line 194
    .line 195
    iget-object v7, v2, Landroid/support/v4/media/i;->a:Landroid/os/Bundle;

    .line 196
    .line 197
    const-string v9, "android.media.metadata.TITLE"

    .line 198
    .line 199
    sget-object v10, Lit/deviato/spotifuck/WebService;->x:Ljava/lang/String;

    .line 200
    .line 201
    invoke-virtual {v2, v9, v10}, Landroid/support/v4/media/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    const-string v9, "android.media.metadata.ARTIST"

    .line 205
    .line 206
    sget-object v10, Lit/deviato/spotifuck/WebService;->w:Ljava/lang/String;

    .line 207
    .line 208
    invoke-virtual {v2, v9, v10}, Landroid/support/v4/media/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    sget-wide v9, Lit/deviato/spotifuck/WebService;->z:J

    .line 212
    .line 213
    sget-object v2, Landroid/support/v4/media/MediaMetadataCompat;->c:Lr/b;

    .line 214
    .line 215
    const-string v11, "android.media.metadata.DURATION"

    .line 216
    .line 217
    invoke-virtual {v2, v11}, Lr/k;->containsKey(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v13

    .line 221
    if-eqz v13, :cond_7

    .line 222
    .line 223
    invoke-virtual {v2, v11, v0}, Lr/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    check-cast v2, Ljava/lang/Integer;

    .line 228
    .line 229
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    if-nez v2, :cond_6

    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 237
    .line 238
    const-string v1, "The android.media.metadata.DURATION key cannot be used to put a long"

    .line 239
    .line 240
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    throw v0

    .line 244
    :cond_7
    :goto_4
    invoke-virtual {v7, v11, v9, v10}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 245
    .line 246
    .line 247
    const-string v2, "android.media.metadata.ALBUM_ART"

    .line 248
    .line 249
    sget-object v9, Lit/deviato/spotifuck/WebService;->v:Landroid/graphics/Bitmap;

    .line 250
    .line 251
    sget-object v10, Landroid/support/v4/media/MediaMetadataCompat;->c:Lr/b;

    .line 252
    .line 253
    invoke-virtual {v10, v2}, Lr/k;->containsKey(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v11

    .line 257
    if-eqz v11, :cond_9

    .line 258
    .line 259
    invoke-virtual {v10, v2, v0}, Lr/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v10

    .line 263
    check-cast v10, Ljava/lang/Integer;

    .line 264
    .line 265
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 266
    .line 267
    .line 268
    move-result v10

    .line 269
    if-ne v10, v1, :cond_8

    .line 270
    .line 271
    goto :goto_5

    .line 272
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 273
    .line 274
    const-string v1, "The "

    .line 275
    .line 276
    const-string v3, " key cannot be used to put a Bitmap"

    .line 277
    .line 278
    invoke-static {v1, v2, v3}, LQ0/E;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    throw v0

    .line 286
    :cond_9
    :goto_5
    invoke-virtual {v7, v2, v9}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 287
    .line 288
    .line 289
    new-instance v2, Landroid/support/v4/media/MediaMetadataCompat;

    .line 290
    .line 291
    invoke-direct {v2, v7}, Landroid/support/v4/media/MediaMetadataCompat;-><init>(Landroid/os/Bundle;)V

    .line 292
    .line 293
    .line 294
    sget-object v7, Lit/deviato/spotifuck/WebService;->n:Landroid/support/v4/media/session/t;

    .line 295
    .line 296
    iget-object v7, v7, Landroid/support/v4/media/session/t;->b:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v7, Landroid/support/v4/media/session/o;

    .line 299
    .line 300
    iput-object v2, v7, Landroid/support/v4/media/session/o;->g:Landroid/support/v4/media/MediaMetadataCompat;

    .line 301
    .line 302
    iget-object v9, v2, Landroid/support/v4/media/MediaMetadataCompat;->b:Landroid/media/MediaMetadata;

    .line 303
    .line 304
    const/4 v10, 0x0

    .line 305
    if-nez v9, :cond_a

    .line 306
    .line 307
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 308
    .line 309
    .line 310
    move-result-object v9

    .line 311
    invoke-virtual {v2, v9, v10}, Landroid/support/v4/media/MediaMetadataCompat;->writeToParcel(Landroid/os/Parcel;I)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v9, v10}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 315
    .line 316
    .line 317
    sget-object v11, Landroid/media/MediaMetadata;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 318
    .line 319
    invoke-interface {v11, v9}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v11

    .line 323
    check-cast v11, Landroid/media/MediaMetadata;

    .line 324
    .line 325
    iput-object v11, v2, Landroid/support/v4/media/MediaMetadataCompat;->b:Landroid/media/MediaMetadata;

    .line 326
    .line 327
    invoke-virtual {v9}, Landroid/os/Parcel;->recycle()V

    .line 328
    .line 329
    .line 330
    :cond_a
    iget-object v2, v2, Landroid/support/v4/media/MediaMetadataCompat;->b:Landroid/media/MediaMetadata;

    .line 331
    .line 332
    iget-object v7, v7, Landroid/support/v4/media/session/o;->a:Landroid/media/session/MediaSession;

    .line 333
    .line 334
    invoke-virtual {v7, v2}, Landroid/media/session/MediaSession;->setMetadata(Landroid/media/MediaMetadata;)V

    .line 335
    .line 336
    .line 337
    new-instance v2, LC/k;

    .line 338
    .line 339
    sget-object v7, Lit/deviato/spotifuck/WebService;->q:Lit/deviato/spotifuck/WebService;

    .line 340
    .line 341
    invoke-direct {v2, v7}, LC/k;-><init>(Lit/deviato/spotifuck/WebService;)V

    .line 342
    .line 343
    .line 344
    iget-object v7, v2, LC/k;->b:Ljava/util/ArrayList;

    .line 345
    .line 346
    sget-object v9, Lit/deviato/spotifuck/WebService;->x:Ljava/lang/String;

    .line 347
    .line 348
    invoke-static {v9}, LC/k;->b(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 349
    .line 350
    .line 351
    move-result-object v9

    .line 352
    iput-object v9, v2, LC/k;->e:Ljava/lang/CharSequence;

    .line 353
    .line 354
    sget-object v9, Lit/deviato/spotifuck/WebService;->w:Ljava/lang/String;

    .line 355
    .line 356
    invoke-static {v9}, LC/k;->b(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 357
    .line 358
    .line 359
    move-result-object v9

    .line 360
    iput-object v9, v2, LC/k;->f:Ljava/lang/CharSequence;

    .line 361
    .line 362
    sget-object v9, Lit/deviato/spotifuck/WebService;->v:Landroid/graphics/Bitmap;

    .line 363
    .line 364
    const/4 v11, 0x1

    .line 365
    if-nez v9, :cond_b

    .line 366
    .line 367
    move-object v1, v2

    .line 368
    goto :goto_8

    .line 369
    :cond_b
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 370
    .line 371
    const/16 v13, 0x1b

    .line 372
    .line 373
    if-lt v0, v13, :cond_c

    .line 374
    .line 375
    :goto_6
    move-object/from16 v18, v2

    .line 376
    .line 377
    goto :goto_7

    .line 378
    :cond_c
    iget-object v0, v2, LC/k;->a:Lit/deviato/spotifuck/WebService;

    .line 379
    .line 380
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    const v13, 0x7f07005c

    .line 385
    .line 386
    .line 387
    invoke-virtual {v0, v13}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 388
    .line 389
    .line 390
    move-result v13

    .line 391
    const v14, 0x7f07005b

    .line 392
    .line 393
    .line 394
    invoke-virtual {v0, v14}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 395
    .line 396
    .line 397
    move-result v0

    .line 398
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getWidth()I

    .line 399
    .line 400
    .line 401
    move-result v14

    .line 402
    if-gt v14, v13, :cond_d

    .line 403
    .line 404
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getHeight()I

    .line 405
    .line 406
    .line 407
    move-result v14

    .line 408
    if-gt v14, v0, :cond_d

    .line 409
    .line 410
    goto :goto_6

    .line 411
    :cond_d
    int-to-double v13, v13

    .line 412
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getWidth()I

    .line 413
    .line 414
    .line 415
    move-result v15

    .line 416
    invoke-static {v11, v15}, Ljava/lang/Math;->max(II)I

    .line 417
    .line 418
    .line 419
    move-result v15

    .line 420
    int-to-double v4, v15

    .line 421
    div-double/2addr v13, v4

    .line 422
    int-to-double v4, v0

    .line 423
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getHeight()I

    .line 424
    .line 425
    .line 426
    move-result v0

    .line 427
    invoke-static {v11, v0}, Ljava/lang/Math;->max(II)I

    .line 428
    .line 429
    .line 430
    move-result v0

    .line 431
    move-object/from16 v18, v2

    .line 432
    .line 433
    int-to-double v1, v0

    .line 434
    div-double/2addr v4, v1

    .line 435
    invoke-static {v13, v14, v4, v5}, Ljava/lang/Math;->min(DD)D

    .line 436
    .line 437
    .line 438
    move-result-wide v0

    .line 439
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getWidth()I

    .line 440
    .line 441
    .line 442
    move-result v2

    .line 443
    int-to-double v4, v2

    .line 444
    mul-double v4, v4, v0

    .line 445
    .line 446
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 447
    .line 448
    .line 449
    move-result-wide v4

    .line 450
    double-to-int v2, v4

    .line 451
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getHeight()I

    .line 452
    .line 453
    .line 454
    move-result v4

    .line 455
    int-to-double v4, v4

    .line 456
    mul-double v4, v4, v0

    .line 457
    .line 458
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 459
    .line 460
    .line 461
    move-result-wide v0

    .line 462
    double-to-int v0, v0

    .line 463
    invoke-static {v9, v2, v0, v11}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 464
    .line 465
    .line 466
    move-result-object v9

    .line 467
    :goto_7
    sget-object v0, Landroidx/core/graphics/drawable/IconCompat;->k:Landroid/graphics/PorterDuff$Mode;

    .line 468
    .line 469
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 470
    .line 471
    .line 472
    new-instance v0, Landroidx/core/graphics/drawable/IconCompat;

    .line 473
    .line 474
    invoke-direct {v0, v11}, Landroidx/core/graphics/drawable/IconCompat;-><init>(I)V

    .line 475
    .line 476
    .line 477
    iput-object v9, v0, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 478
    .line 479
    move-object/from16 v1, v18

    .line 480
    .line 481
    :goto_8
    iput-object v0, v1, LC/k;->h:Landroidx/core/graphics/drawable/IconCompat;

    .line 482
    .line 483
    iget-object v0, v1, LC/k;->q:Landroid/app/Notification;

    .line 484
    .line 485
    const v2, 0x7f0800f8

    .line 486
    .line 487
    .line 488
    iput v2, v0, Landroid/app/Notification;->icon:I

    .line 489
    .line 490
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->f:Landroid/content/Context;

    .line 491
    .line 492
    new-instance v2, Landroid/content/Intent;

    .line 493
    .line 494
    sget-object v4, Lit/deviato/spotifuck/AppSingleton;->f:Landroid/content/Context;

    .line 495
    .line 496
    const-class v5, Lit/deviato/spotifuck/MainActivity;

    .line 497
    .line 498
    invoke-direct {v2, v4, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 499
    .line 500
    .line 501
    const/high16 v4, 0x4000000

    .line 502
    .line 503
    invoke-static {v0, v10, v2, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    iput-object v0, v1, LC/k;->g:Landroid/app/PendingIntent;

    .line 508
    .line 509
    iput v11, v1, LC/k;->n:I

    .line 510
    .line 511
    const/4 v0, -0x1

    .line 512
    iput v0, v1, LC/k;->i:I

    .line 513
    .line 514
    new-instance v0, LC/j;

    .line 515
    .line 516
    sget-object v2, Lit/deviato/spotifuck/WebService;->q:Lit/deviato/spotifuck/WebService;

    .line 517
    .line 518
    const-wide/16 v9, 0x10

    .line 519
    .line 520
    invoke-static {v2, v9, v10}, Landroidx/media/session/MediaButtonReceiver;->a(Lit/deviato/spotifuck/WebService;J)Landroid/app/PendingIntent;

    .line 521
    .line 522
    .line 523
    move-result-object v2

    .line 524
    const v5, 0x7f0800f4

    .line 525
    .line 526
    .line 527
    const-string v9, "Previous"

    .line 528
    .line 529
    invoke-direct {v0, v5, v9, v2}, LC/j;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    new-instance v0, LC/j;

    .line 536
    .line 537
    sget-boolean v2, Lit/deviato/spotifuck/WebService;->D:Z

    .line 538
    .line 539
    if-eqz v2, :cond_e

    .line 540
    .line 541
    const v2, 0x7f0800f1

    .line 542
    .line 543
    .line 544
    goto :goto_9

    .line 545
    :cond_e
    const v2, 0x7f0800f2

    .line 546
    .line 547
    .line 548
    :goto_9
    sget-object v5, Lit/deviato/spotifuck/WebService;->q:Lit/deviato/spotifuck/WebService;

    .line 549
    .line 550
    const-wide/16 v9, 0x200

    .line 551
    .line 552
    invoke-static {v5, v9, v10}, Landroidx/media/session/MediaButtonReceiver;->a(Lit/deviato/spotifuck/WebService;J)Landroid/app/PendingIntent;

    .line 553
    .line 554
    .line 555
    move-result-object v5

    .line 556
    const-string v9, "Play/Pause"

    .line 557
    .line 558
    invoke-direct {v0, v2, v9, v5}, LC/j;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 559
    .line 560
    .line 561
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 562
    .line 563
    .line 564
    new-instance v0, LC/j;

    .line 565
    .line 566
    sget-object v2, Lit/deviato/spotifuck/WebService;->q:Lit/deviato/spotifuck/WebService;

    .line 567
    .line 568
    const-wide/16 v9, 0x20

    .line 569
    .line 570
    invoke-static {v2, v9, v10}, Landroidx/media/session/MediaButtonReceiver;->a(Lit/deviato/spotifuck/WebService;J)Landroid/app/PendingIntent;

    .line 571
    .line 572
    .line 573
    move-result-object v2

    .line 574
    const v5, 0x7f0800e3

    .line 575
    .line 576
    .line 577
    const-string v9, "Next"

    .line 578
    .line 579
    invoke-direct {v0, v5, v9, v2}, LC/j;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 583
    .line 584
    .line 585
    new-instance v0, LC/j;

    .line 586
    .line 587
    sget-boolean v2, Lit/deviato/spotifuck/WebService;->E:Z

    .line 588
    .line 589
    if-eqz v2, :cond_f

    .line 590
    .line 591
    const v2, 0x7f080090

    .line 592
    .line 593
    .line 594
    goto :goto_a

    .line 595
    :cond_f
    const v2, 0x7f08008f

    .line 596
    .line 597
    .line 598
    :goto_a
    sget-object v5, Lit/deviato/spotifuck/WebService;->q:Lit/deviato/spotifuck/WebService;

    .line 599
    .line 600
    new-instance v9, Landroid/content/Intent;

    .line 601
    .line 602
    sget-object v10, Lit/deviato/spotifuck/WebService;->q:Lit/deviato/spotifuck/WebService;

    .line 603
    .line 604
    const-class v13, Lit/deviato/spotifuck/WebService$MediaActionReceiver;

    .line 605
    .line 606
    invoke-direct {v9, v10, v13}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 607
    .line 608
    .line 609
    invoke-virtual {v9, v6}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 610
    .line 611
    .line 612
    move-result-object v6

    .line 613
    invoke-static {v5, v11, v6, v4}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 614
    .line 615
    .line 616
    move-result-object v5

    .line 617
    const-string v6, "Add to Fav"

    .line 618
    .line 619
    invoke-direct {v0, v2, v6, v5}, LC/j;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 620
    .line 621
    .line 622
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 623
    .line 624
    .line 625
    new-instance v0, LC/j;

    .line 626
    .line 627
    sget v2, Lit/deviato/spotifuck/WebService;->C:I

    .line 628
    .line 629
    sget-object v5, Lit/deviato/spotifuck/WebService;->q:Lit/deviato/spotifuck/WebService;

    .line 630
    .line 631
    new-instance v6, Landroid/content/Intent;

    .line 632
    .line 633
    sget-object v9, Lit/deviato/spotifuck/WebService;->q:Lit/deviato/spotifuck/WebService;

    .line 634
    .line 635
    invoke-direct {v6, v9, v13}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v6, v12}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 639
    .line 640
    .line 641
    move-result-object v6

    .line 642
    invoke-static {v5, v11, v6, v4}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 643
    .line 644
    .line 645
    move-result-object v4

    .line 646
    invoke-direct {v0, v2, v8, v4}, LC/j;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 647
    .line 648
    .line 649
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 650
    .line 651
    .line 652
    iput-boolean v11, v1, LC/k;->l:Z

    .line 653
    .line 654
    new-instance v0, Landroid/support/v4/media/session/t;

    .line 655
    .line 656
    const/4 v2, 0x5

    .line 657
    invoke-direct {v0, v2}, Landroid/support/v4/media/session/t;-><init>(I)V

    .line 658
    .line 659
    .line 660
    sget-object v2, Lit/deviato/spotifuck/WebService;->n:Landroid/support/v4/media/session/t;

    .line 661
    .line 662
    iget-object v2, v2, Landroid/support/v4/media/session/t;->b:Ljava/lang/Object;

    .line 663
    .line 664
    check-cast v2, Landroid/support/v4/media/session/o;

    .line 665
    .line 666
    iget-object v2, v2, Landroid/support/v4/media/session/o;->c:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 667
    .line 668
    iput-object v2, v0, Landroid/support/v4/media/session/t;->d:Ljava/lang/Object;

    .line 669
    .line 670
    const/4 v2, 0x2

    .line 671
    filled-new-array {v11, v2, v3}, [I

    .line 672
    .line 673
    .line 674
    move-result-object v2

    .line 675
    iput-object v2, v0, Landroid/support/v4/media/session/t;->c:Ljava/lang/Object;

    .line 676
    .line 677
    invoke-virtual {v1, v0}, LC/k;->c(Landroid/support/v4/media/session/t;)V

    .line 678
    .line 679
    .line 680
    sput-object v1, Lit/deviato/spotifuck/WebService;->p:LC/k;

    .line 681
    .line 682
    sget-object v0, Lit/deviato/spotifuck/WebService;->q:Lit/deviato/spotifuck/WebService;

    .line 683
    .line 684
    const-string v1, "notification"

    .line 685
    .line 686
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    check-cast v0, Landroid/app/NotificationManager;

    .line 691
    .line 692
    sget-object v1, Lit/deviato/spotifuck/WebService;->p:LC/k;

    .line 693
    .line 694
    invoke-virtual {v1}, LC/k;->a()Landroid/app/Notification;

    .line 695
    .line 696
    .line 697
    move-result-object v1

    .line 698
    const/16 v2, 0x539

    .line 699
    .line 700
    invoke-virtual {v0, v2, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 701
    .line 702
    .line 703
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->f:Landroid/content/Context;

    .line 704
    .line 705
    invoke-static {v0}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    .line 706
    .line 707
    .line 708
    move-result-object v0

    .line 709
    new-instance v1, Landroid/content/ComponentName;

    .line 710
    .line 711
    sget-object v2, Lit/deviato/spotifuck/AppSingleton;->f:Landroid/content/Context;

    .line 712
    .line 713
    const-class v3, Lit/deviato/spotifuck/HomeWidget;

    .line 714
    .line 715
    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v0, v1}, Landroid/appwidget/AppWidgetManager;->getAppWidgetIds(Landroid/content/ComponentName;)[I

    .line 719
    .line 720
    .line 721
    move-result-object v1

    .line 722
    new-instance v2, Lit/deviato/spotifuck/HomeWidget;

    .line 723
    .line 724
    invoke-direct {v2}, Lit/deviato/spotifuck/HomeWidget;-><init>()V

    .line 725
    .line 726
    .line 727
    sget-object v3, Lit/deviato/spotifuck/AppSingleton;->f:Landroid/content/Context;

    .line 728
    .line 729
    invoke-virtual {v2, v3, v0, v1}, Lit/deviato/spotifuck/HomeWidget;->onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V

    .line 730
    .line 731
    .line 732
    return-void

    .line 733
    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 734
    .line 735
    invoke-direct {v0, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 736
    .line 737
    .line 738
    throw v0

    .line 739
    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 740
    .line 741
    invoke-direct {v0, v10}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 742
    .line 743
    .line 744
    throw v0

    .line 745
    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 746
    .line 747
    invoke-direct {v0, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 748
    .line 749
    .line 750
    throw v0

    .line 751
    :cond_13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 752
    .line 753
    invoke-direct {v0, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 754
    .line 755
    .line 756
    throw v0

    .line 757
    :cond_14
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 758
    .line 759
    invoke-direct {v0, v10}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 760
    .line 761
    .line 762
    throw v0

    .line 763
    :cond_15
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 764
    .line 765
    invoke-direct {v0, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 766
    .line 767
    .line 768
    throw v0
.end method


# virtual methods
.method public final b(Ljava/lang/String;Ld0/k;)V
    .locals 4

    .line 1
    sget-object v0, Lit/deviato/spotifuck/WebService;->u:Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-string v0, "sfroot"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p2}, Ld0/k;->a()V

    .line 19
    .line 20
    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v1, "window.mediaLib?.["

    .line 24
    .line 25
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lorg/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, "]"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sget-object v1, Lit/deviato/spotifuck/WebService;->r:Landroid/webkit/WebView;

    .line 45
    .line 46
    const-string v2, "JSON.stringify("

    .line 47
    .line 48
    const-string v3, ")"

    .line 49
    .line 50
    invoke-static {v2, v0, v3}, LQ0/E;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    new-instance v2, LR0/m;

    .line 55
    .line 56
    invoke-direct {v2, p0, p1, p2}, LR0/m;-><init>(Lit/deviato/spotifuck/WebService;Ljava/lang/String;Ld0/k;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v0, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_1
    :goto_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 64
    .line 65
    sput-object p1, Lit/deviato/spotifuck/WebService;->u:Ljava/lang/Boolean;

    .line 66
    .line 67
    new-instance p1, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    new-instance v0, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v1, "\ud83c\udfb5 "

    .line 75
    .line 76
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const v1, 0x7f100003

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    const-string v1, "playlists"

    .line 94
    .line 95
    invoke-static {v1, v0}, Lit/deviato/spotifuck/WebService;->c(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    new-instance v0, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string v1, "\ud83d\udcbf "

    .line 105
    .line 106
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    const/high16 v1, 0x7f100000

    .line 110
    .line 111
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    const-string v1, "albums"

    .line 123
    .line 124
    invoke-static {v1, v0}, Lit/deviato/spotifuck/WebService;->c(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    new-instance v0, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    const-string v1, "\ud83d\udc64 "

    .line 134
    .line 135
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    const v1, 0x7f100001

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    const-string v1, "artists"

    .line 153
    .line 154
    invoke-static {v1, v0}, Lit/deviato/spotifuck/WebService;->c(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    new-instance v0, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    const-string v1, "\ud83c\udf99 "

    .line 164
    .line 165
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    const v1, 0x7f100004

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    const-string v1, "podcasts"

    .line 183
    .line 184
    invoke-static {v1, v0}, Lit/deviato/spotifuck/WebService;->c(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    invoke-virtual {p2, p1}, Ld0/k;->d(Ljava/util/ArrayList;)V

    .line 192
    .line 193
    .line 194
    return-void
.end method

.method public final d()V
    .locals 8

    .line 1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    sput-object v0, Lit/deviato/spotifuck/WebService;->t:Ljava/lang/Boolean;

    .line 4
    .line 5
    sget-object v0, Lit/deviato/spotifuck/WebService;->s:Landroid/os/PowerManager$WakeLock;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Lit/deviato/spotifuck/WebService;->s:Landroid/os/PowerManager$WakeLock;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 18
    .line 19
    .line 20
    :cond_0
    sget-object v0, Lit/deviato/spotifuck/WebService;->n:Landroid/support/v4/media/session/t;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    iget-object v4, v0, Landroid/support/v4/media/session/t;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Landroid/support/v4/media/session/o;

    .line 30
    .line 31
    iget-object v4, v4, Landroid/support/v4/media/session/o;->a:Landroid/media/session/MediaSession;

    .line 32
    .line 33
    invoke-virtual {v4, v3}, Landroid/media/session/MediaSession;->setActive(Z)V

    .line 34
    .line 35
    .line 36
    iget-object v0, v0, Landroid/support/v4/media/session/t;->d:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-nez v4, :cond_2

    .line 49
    .line 50
    sget-object v0, Lit/deviato/spotifuck/WebService;->n:Landroid/support/v4/media/session/t;

    .line 51
    .line 52
    iget-object v0, v0, Landroid/support/v4/media/session/t;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Landroid/support/v4/media/session/o;

    .line 55
    .line 56
    iget-object v4, v0, Landroid/support/v4/media/session/o;->e:Landroid/os/RemoteCallbackList;

    .line 57
    .line 58
    invoke-virtual {v4}, Landroid/os/RemoteCallbackList;->kill()V

    .line 59
    .line 60
    .line 61
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 62
    .line 63
    const/16 v5, 0x1b

    .line 64
    .line 65
    iget-object v6, v0, Landroid/support/v4/media/session/o;->a:Landroid/media/session/MediaSession;

    .line 66
    .line 67
    if-ne v4, v5, :cond_1

    .line 68
    .line 69
    :try_start_0
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    const-string v5, "mCallback"

    .line 74
    .line 75
    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-virtual {v4, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4, v6}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    check-cast v4, Landroid/os/Handler;

    .line 87
    .line 88
    if-eqz v4, :cond_1

    .line 89
    .line 90
    invoke-virtual {v4, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :catch_0
    move-exception v4

    .line 95
    const-string v5, "MediaSessionCompat"

    .line 96
    .line 97
    const-string v7, "Exception happened while accessing MediaSession.mCallback."

    .line 98
    .line 99
    invoke-static {v5, v7, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 100
    .line 101
    .line 102
    :cond_1
    :goto_0
    invoke-virtual {v6, v2}, Landroid/media/session/MediaSession;->setCallback(Landroid/media/session/MediaSession$Callback;)V

    .line 103
    .line 104
    .line 105
    iget-object v0, v0, Landroid/support/v4/media/session/o;->b:Landroid/support/v4/media/session/n;

    .line 106
    .line 107
    iget-object v0, v0, Landroid/support/v4/media/session/n;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 108
    .line 109
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v6}, Landroid/media/session/MediaSession;->release()V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    new-instance v0, Ljava/lang/ClassCastException;

    .line 124
    .line 125
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 126
    .line 127
    .line 128
    throw v0

    .line 129
    :cond_3
    :goto_1
    invoke-virtual {p0, v1}, Landroid/app/Service;->stopForeground(Z)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 133
    .line 134
    .line 135
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->j:LR0/c;

    .line 136
    .line 137
    if-eqz v0, :cond_4

    .line 138
    .line 139
    const-string v1, "about:blank"

    .line 140
    .line 141
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->j:LR0/c;

    .line 145
    .line 146
    invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V

    .line 147
    .line 148
    .line 149
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->j:LR0/c;

    .line 150
    .line 151
    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 152
    .line 153
    .line 154
    sput-object v2, Lit/deviato/spotifuck/AppSingleton;->j:LR0/c;

    .line 155
    .line 156
    :cond_4
    sput-boolean v3, Lit/deviato/spotifuck/AppSingleton;->B:Z

    .line 157
    .line 158
    return-void
.end method

.method public final onCreate()V
    .locals 4

    .line 1
    invoke-super {p0}, Ld0/q;->onCreate()V

    .line 2
    .line 3
    .line 4
    sput-object p0, Lit/deviato/spotifuck/WebService;->q:Lit/deviato/spotifuck/WebService;

    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x1a

    .line 9
    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    invoke-static {p0}, LC0/a;->h(Lit/deviato/spotifuck/WebService;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Landroid/app/NotificationManager;

    .line 17
    .line 18
    invoke-static {v2}, LL/f;->c(Landroid/app/NotificationManager;)Landroid/app/NotificationChannel;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    invoke-static {}, LL/f;->b()Landroid/app/NotificationChannel;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {p0}, LC0/a;->h(Lit/deviato/spotifuck/WebService;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Landroid/app/NotificationManager;

    .line 33
    .line 34
    invoke-static {v3, v2}, LL/f;->f(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    if-lt v0, v1, :cond_1

    .line 38
    .line 39
    const-string v0, "audio"

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Landroid/media/AudioManager;

    .line 46
    .line 47
    sput-object v0, Lit/deviato/spotifuck/WebService;->G:Landroid/media/AudioManager;

    .line 48
    .line 49
    new-instance v0, LR0/n;

    .line 50
    .line 51
    invoke-direct {v0}, LR0/n;-><init>()V

    .line 52
    .line 53
    .line 54
    sput-object v0, Lit/deviato/spotifuck/WebService;->H:LR0/n;

    .line 55
    .line 56
    sget-object v1, Lit/deviato/spotifuck/WebService;->G:Landroid/media/AudioManager;

    .line 57
    .line 58
    new-instance v2, Landroid/os/Handler;

    .line 59
    .line 60
    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-static {v1, v0, v2}, LC0/a;->l(Landroid/media/AudioManager;LR0/n;Landroid/os/Handler;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    new-instance v0, Lit/deviato/spotifuck/WebService$MediaActionReceiver;

    .line 68
    .line 69
    invoke-direct {v0}, Lit/deviato/spotifuck/WebService$MediaActionReceiver;-><init>()V

    .line 70
    .line 71
    .line 72
    sput-object v0, Lit/deviato/spotifuck/WebService;->F:Lit/deviato/spotifuck/WebService$MediaActionReceiver;

    .line 73
    .line 74
    new-instance v0, Landroid/content/IntentFilter;

    .line 75
    .line 76
    const-string v1, "android.intent.action.HEADSET_PLUG"

    .line 77
    .line 78
    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const-string v1, "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    new-instance v1, Lit/deviato/spotifuck/WebService$MediaActionReceiver;

    .line 87
    .line 88
    invoke-direct {v1}, Lit/deviato/spotifuck/WebService$MediaActionReceiver;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 92
    .line 93
    .line 94
    :goto_0
    return-void
.end method

.method public final onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Ld0/q;->onDestroy()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1a

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    sget-object v0, Lit/deviato/spotifuck/WebService;->H:LR0/n;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    sget-object v1, Lit/deviato/spotifuck/WebService;->G:Landroid/media/AudioManager;

    .line 15
    .line 16
    invoke-static {v1, v0}, LC0/a;->k(Landroid/media/AudioManager;LR0/n;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    sget-object v0, Lit/deviato/spotifuck/WebService;->F:Lit/deviato/spotifuck/WebService$MediaActionReceiver;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 5

    .line 1
    sget-object p2, Lit/deviato/spotifuck/WebService;->t:Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 p3, 0x1

    .line 8
    if-nez p2, :cond_6

    .line 9
    .line 10
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 11
    .line 12
    sput-object p1, Lit/deviato/spotifuck/WebService;->t:Ljava/lang/Boolean;

    .line 13
    .line 14
    sput-object p1, Lit/deviato/spotifuck/WebService;->u:Ljava/lang/Boolean;

    .line 15
    .line 16
    sget-boolean p1, Lit/deviato/spotifuck/AppSingleton;->r:Z

    .line 17
    .line 18
    const p2, 0x7f100021

    .line 19
    .line 20
    .line 21
    if-eqz p1, :cond_3

    .line 22
    .line 23
    new-instance p1, Landroid/support/v4/media/session/t;

    .line 24
    .line 25
    invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-direct {p1, p0, v0}, Landroid/support/v4/media/session/t;-><init>(Lit/deviato/spotifuck/WebService;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    sput-object p1, Lit/deviato/spotifuck/WebService;->n:Landroid/support/v4/media/session/t;

    .line 33
    .line 34
    iget-object p1, p1, Landroid/support/v4/media/session/t;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Landroid/support/v4/media/session/o;

    .line 37
    .line 38
    const/4 v0, 0x3

    .line 39
    iget-object p1, p1, Landroid/support/v4/media/session/o;->a:Landroid/media/session/MediaSession;

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroid/media/session/MediaSession;->setFlags(I)V

    .line 42
    .line 43
    .line 44
    sget-object p1, Lit/deviato/spotifuck/WebService;->n:Landroid/support/v4/media/session/t;

    .line 45
    .line 46
    new-instance v0, LR0/o;

    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    invoke-direct {v0, v1}, LR0/o;-><init>(I)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p1, Landroid/support/v4/media/session/t;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, Landroid/support/v4/media/session/o;

    .line 55
    .line 56
    new-instance v1, Landroid/os/Handler;

    .line 57
    .line 58
    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v0, v1}, Landroid/support/v4/media/session/o;->e(LR0/o;Landroid/os/Handler;)V

    .line 62
    .line 63
    .line 64
    sget-object p1, Lit/deviato/spotifuck/WebService;->n:Landroid/support/v4/media/session/t;

    .line 65
    .line 66
    iget-object p1, p1, Landroid/support/v4/media/session/t;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p1, Landroid/support/v4/media/session/o;

    .line 69
    .line 70
    iget-object p1, p1, Landroid/support/v4/media/session/o;->c:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 71
    .line 72
    if-eqz p1, :cond_2

    .line 73
    .line 74
    iget-object v0, p0, Ld0/q;->l:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 75
    .line 76
    if-nez v0, :cond_1

    .line 77
    .line 78
    iput-object p1, p0, Ld0/q;->l:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 79
    .line 80
    iget-object v0, p0, Ld0/q;->f:LA/k;

    .line 81
    .line 82
    iget-object v1, v0, LA/k;->i:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v1, Ld0/q;

    .line 85
    .line 86
    iget-object v1, v1, Ld0/q;->k:LQ0/j;

    .line 87
    .line 88
    new-instance v2, LC/b;

    .line 89
    .line 90
    const/4 v3, 0x5

    .line 91
    const/4 v4, 0x0

    .line 92
    invoke-direct {v2, v0, p1, v3, v4}, LC/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v2}, LQ0/j;->a(Ljava/lang/Runnable;)V

    .line 96
    .line 97
    .line 98
    sget-object p1, Lit/deviato/spotifuck/WebService;->n:Landroid/support/v4/media/session/t;

    .line 99
    .line 100
    iget-object v0, p1, Landroid/support/v4/media/session/t;->b:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Landroid/support/v4/media/session/o;

    .line 103
    .line 104
    iget-object v0, v0, Landroid/support/v4/media/session/o;->a:Landroid/media/session/MediaSession;

    .line 105
    .line 106
    invoke-virtual {v0, p3}, Landroid/media/session/MediaSession;->setActive(Z)V

    .line 107
    .line 108
    .line 109
    iget-object p1, p1, Landroid/support/v4/media/session/t;->d:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast p1, Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-nez v0, :cond_0

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    new-instance p1, Ljava/lang/ClassCastException;

    .line 132
    .line 133
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 134
    .line 135
    .line 136
    throw p1

    .line 137
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 138
    .line 139
    const-string p2, "The session token has already been set"

    .line 140
    .line 141
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw p1

    .line 145
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 146
    .line 147
    const-string p2, "Session token may not be null"

    .line 148
    .line 149
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw p1

    .line 153
    :cond_3
    :goto_0
    const-string p1, "power"

    .line 154
    .line 155
    invoke-virtual {p0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    check-cast p1, Landroid/os/PowerManager;

    .line 160
    .line 161
    const-string v0, "Spotifuck:KeepAlive"

    .line 162
    .line 163
    invoke-virtual {p1, p3, v0}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    sput-object p1, Lit/deviato/spotifuck/WebService;->s:Landroid/os/PowerManager$WakeLock;

    .line 168
    .line 169
    const/4 v0, 0x0

    .line 170
    invoke-virtual {p1, v0}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    .line 171
    .line 172
    .line 173
    invoke-static {}, Lit/deviato/spotifuck/AppSingleton;->b()Landroid/webkit/WebView;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    sput-object p1, Lit/deviato/spotifuck/WebService;->r:Landroid/webkit/WebView;

    .line 178
    .line 179
    sget-boolean p1, Lit/deviato/spotifuck/AppSingleton;->r:Z

    .line 180
    .line 181
    const/4 v1, -0x1

    .line 182
    const v2, 0x7f0800f8

    .line 183
    .line 184
    .line 185
    if-eqz p1, :cond_4

    .line 186
    .line 187
    new-instance p1, LC/k;

    .line 188
    .line 189
    invoke-direct {p1, p0}, LC/k;-><init>(Lit/deviato/spotifuck/WebService;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p2

    .line 196
    invoke-static {p2}, LC/k;->b(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 197
    .line 198
    .line 199
    move-result-object p2

    .line 200
    iput-object p2, p1, LC/k;->e:Ljava/lang/CharSequence;

    .line 201
    .line 202
    const p2, 0x7f1000eb

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p2

    .line 209
    invoke-static {p2}, LC/k;->b(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 210
    .line 211
    .line 212
    move-result-object p2

    .line 213
    iput-object p2, p1, LC/k;->f:Ljava/lang/CharSequence;

    .line 214
    .line 215
    new-instance p2, Landroid/content/Intent;

    .line 216
    .line 217
    const-class v3, Lit/deviato/spotifuck/MainActivity;

    .line 218
    .line 219
    invoke-direct {p2, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 220
    .line 221
    .line 222
    const/high16 v3, 0x4000000

    .line 223
    .line 224
    invoke-static {p0, v0, p2, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 225
    .line 226
    .line 227
    move-result-object p2

    .line 228
    iput-object p2, p1, LC/k;->g:Landroid/app/PendingIntent;

    .line 229
    .line 230
    iget-object p2, p1, LC/k;->q:Landroid/app/Notification;

    .line 231
    .line 232
    iput v2, p2, Landroid/app/Notification;->icon:I

    .line 233
    .line 234
    iput v1, p1, LC/k;->i:I

    .line 235
    .line 236
    iput p3, p1, LC/k;->n:I

    .line 237
    .line 238
    new-instance p2, Landroid/support/v4/media/session/t;

    .line 239
    .line 240
    const/4 v0, 0x5

    .line 241
    invoke-direct {p2, v0}, Landroid/support/v4/media/session/t;-><init>(I)V

    .line 242
    .line 243
    .line 244
    sget-object v0, Lit/deviato/spotifuck/WebService;->n:Landroid/support/v4/media/session/t;

    .line 245
    .line 246
    iget-object v0, v0, Landroid/support/v4/media/session/t;->b:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v0, Landroid/support/v4/media/session/o;

    .line 249
    .line 250
    iget-object v0, v0, Landroid/support/v4/media/session/o;->c:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 251
    .line 252
    iput-object v0, p2, Landroid/support/v4/media/session/t;->d:Ljava/lang/Object;

    .line 253
    .line 254
    invoke-virtual {p1, p2}, LC/k;->c(Landroid/support/v4/media/session/t;)V

    .line 255
    .line 256
    .line 257
    sput-object p1, Lit/deviato/spotifuck/WebService;->p:LC/k;

    .line 258
    .line 259
    goto :goto_1

    .line 260
    :cond_4
    new-instance p1, LC/k;

    .line 261
    .line 262
    invoke-direct {p1, p0}, LC/k;-><init>(Lit/deviato/spotifuck/WebService;)V

    .line 263
    .line 264
    .line 265
    const p2, 0x7f1000de

    .line 266
    .line 267
    .line 268
    invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object p2

    .line 272
    invoke-static {p2}, LC/k;->b(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 273
    .line 274
    .line 275
    move-result-object p2

    .line 276
    iput-object p2, p1, LC/k;->e:Ljava/lang/CharSequence;

    .line 277
    .line 278
    const p2, 0x7f1000dd

    .line 279
    .line 280
    .line 281
    invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object p2

    .line 285
    invoke-static {p2}, LC/k;->b(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 286
    .line 287
    .line 288
    move-result-object p2

    .line 289
    iput-object p2, p1, LC/k;->f:Ljava/lang/CharSequence;

    .line 290
    .line 291
    iget-object p2, p1, LC/k;->q:Landroid/app/Notification;

    .line 292
    .line 293
    iput v2, p2, Landroid/app/Notification;->icon:I

    .line 294
    .line 295
    iput v1, p1, LC/k;->i:I

    .line 296
    .line 297
    sput-object p1, Lit/deviato/spotifuck/WebService;->p:LC/k;

    .line 298
    .line 299
    :goto_1
    sget-object p1, Lit/deviato/spotifuck/WebService;->p:LC/k;

    .line 300
    .line 301
    invoke-virtual {p1}, LC/k;->a()Landroid/app/Notification;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    sput-object p1, Lit/deviato/spotifuck/WebService;->o:Landroid/app/Notification;

    .line 306
    .line 307
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 308
    .line 309
    const/16 p2, 0x1d

    .line 310
    .line 311
    if-lt p1, p2, :cond_5

    .line 312
    .line 313
    sget-object p1, Lit/deviato/spotifuck/WebService;->o:Landroid/app/Notification;

    .line 314
    .line 315
    invoke-static {p0, p1}, LA/a;->r(Lit/deviato/spotifuck/WebService;Landroid/app/Notification;)V

    .line 316
    .line 317
    .line 318
    goto :goto_2

    .line 319
    :cond_5
    sget-object p1, Lit/deviato/spotifuck/WebService;->o:Landroid/app/Notification;

    .line 320
    .line 321
    const/16 p2, 0x539

    .line 322
    .line 323
    invoke-virtual {p0, p2, p1}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    .line 324
    .line 325
    .line 326
    goto :goto_2

    .line 327
    :cond_6
    if-eqz p1, :cond_7

    .line 328
    .line 329
    const-string p2, "STOP_SERVICE"

    .line 330
    .line 331
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result p1

    .line 339
    if-eqz p1, :cond_7

    .line 340
    .line 341
    invoke-virtual {p0}, Lit/deviato/spotifuck/WebService;->d()V

    .line 342
    .line 343
    .line 344
    const/4 p1, 0x2

    .line 345
    return p1

    .line 346
    :cond_7
    :goto_2
    return p3
.end method

.method public final onTaskRemoved(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Service;->onTaskRemoved(Landroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    sget-boolean p1, Lit/deviato/spotifuck/AppSingleton;->s:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lit/deviato/spotifuck/WebService;->d()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method
