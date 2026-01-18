.class public final Ld0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LA/b;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:I

.field public final synthetic f:LA/b;


# direct methods
.method public constructor <init>(LA/b;LA/b;ILjava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    const/4 p6, 0x1

    iput p6, p0, Ld0/l;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/l;->f:LA/b;

    iput-object p2, p0, Ld0/l;->b:LA/b;

    iput p3, p0, Ld0/l;->c:I

    iput-object p4, p0, Ld0/l;->d:Ljava/lang/String;

    iput p5, p0, Ld0/l;->e:I

    return-void
.end method

.method public constructor <init>(LA/b;LA/b;Ljava/lang/String;IILandroid/os/Bundle;)V
    .locals 0

    const/4 p6, 0x0

    iput p6, p0, Ld0/l;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/l;->f:LA/b;

    iput-object p2, p0, Ld0/l;->b:LA/b;

    iput-object p3, p0, Ld0/l;->d:Ljava/lang/String;

    iput p4, p0, Ld0/l;->c:I

    iput p5, p0, Ld0/l;->e:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1
    iget v0, p0, Ld0/l;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ld0/l;->b:LA/b;

    .line 7
    .line 8
    iget-object v1, v0, LA/b;->g:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Landroid/os/Messenger;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 13
    .line 14
    .line 15
    move-result-object v7

    .line 16
    iget-object v8, p0, Ld0/l;->f:LA/b;

    .line 17
    .line 18
    iget-object v1, v8, LA/b;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ld0/q;

    .line 21
    .line 22
    iget-object v1, v1, Ld0/q;->j:Lr/b;

    .line 23
    .line 24
    invoke-virtual {v1, v7}, Lr/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    iget-object v1, v8, LA/b;->g:Ljava/lang/Object;

    .line 28
    .line 29
    move-object v9, v1

    .line 30
    check-cast v9, Ld0/q;

    .line 31
    .line 32
    iget-object v1, v9, Ld0/q;->i:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v10

    .line 38
    :cond_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v2, 0x0

    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Ld0/c;

    .line 50
    .line 51
    iget v3, v1, Ld0/c;->c:I

    .line 52
    .line 53
    iget v4, p0, Ld0/l;->c:I

    .line 54
    .line 55
    if-ne v3, v4, :cond_0

    .line 56
    .line 57
    iget-object v3, p0, Ld0/l;->d:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-nez v3, :cond_1

    .line 64
    .line 65
    iget v3, p0, Ld0/l;->e:I

    .line 66
    .line 67
    if-gtz v3, :cond_2

    .line 68
    .line 69
    :cond_1
    new-instance v11, Ld0/c;

    .line 70
    .line 71
    iget v4, v1, Ld0/c;->b:I

    .line 72
    .line 73
    iget v5, v1, Ld0/c;->c:I

    .line 74
    .line 75
    iget-object v2, v8, LA/b;->g:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v2, Ld0/q;

    .line 78
    .line 79
    iget-object v3, v1, Ld0/c;->a:Ljava/lang/String;

    .line 80
    .line 81
    move-object v1, v11

    .line 82
    move-object v6, v0

    .line 83
    invoke-direct/range {v1 .. v6}, Ld0/c;-><init>(Ld0/q;Ljava/lang/String;IILA/b;)V

    .line 84
    .line 85
    .line 86
    move-object v2, v11

    .line 87
    :cond_2
    invoke-interface {v10}, Ljava/util/Iterator;->remove()V

    .line 88
    .line 89
    .line 90
    :cond_3
    if-nez v2, :cond_4

    .line 91
    .line 92
    new-instance v10, Ld0/c;

    .line 93
    .line 94
    iget v4, p0, Ld0/l;->e:I

    .line 95
    .line 96
    iget v5, p0, Ld0/l;->c:I

    .line 97
    .line 98
    iget-object v1, v8, LA/b;->g:Ljava/lang/Object;

    .line 99
    .line 100
    move-object v2, v1

    .line 101
    check-cast v2, Ld0/q;

    .line 102
    .line 103
    iget-object v3, p0, Ld0/l;->d:Ljava/lang/String;

    .line 104
    .line 105
    move-object v1, v10

    .line 106
    move-object v6, v0

    .line 107
    invoke-direct/range {v1 .. v6}, Ld0/c;-><init>(Ld0/q;Ljava/lang/String;IILA/b;)V

    .line 108
    .line 109
    .line 110
    move-object v2, v10

    .line 111
    :cond_4
    iget-object v0, v9, Ld0/q;->j:Lr/b;

    .line 112
    .line 113
    invoke-virtual {v0, v7, v2}, Lr/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    const/4 v0, 0x0

    .line 117
    :try_start_0
    invoke-interface {v7, v2, v0}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :catch_0
    const-string v0, "MBServiceCompat"

    .line 122
    .line 123
    const-string v1, "IBinder is already dead."

    .line 124
    .line 125
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    :goto_0
    return-void

    .line 129
    :pswitch_0
    iget-object v0, p0, Ld0/l;->b:LA/b;

    .line 130
    .line 131
    iget-object v1, v0, LA/b;->g:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v1, Landroid/os/Messenger;

    .line 134
    .line 135
    invoke-virtual {v1}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    iget-object v8, p0, Ld0/l;->f:LA/b;

    .line 140
    .line 141
    iget-object v2, v8, LA/b;->g:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v2, Ld0/q;

    .line 144
    .line 145
    iget-object v2, v2, Ld0/q;->j:Lr/b;

    .line 146
    .line 147
    invoke-virtual {v2, v1}, Lr/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    new-instance v9, Ld0/c;

    .line 151
    .line 152
    iget-object v10, p0, Ld0/l;->d:Ljava/lang/String;

    .line 153
    .line 154
    iget v5, p0, Ld0/l;->c:I

    .line 155
    .line 156
    iget v6, p0, Ld0/l;->e:I

    .line 157
    .line 158
    iget-object v2, v8, LA/b;->g:Ljava/lang/Object;

    .line 159
    .line 160
    move-object v3, v2

    .line 161
    check-cast v3, Ld0/q;

    .line 162
    .line 163
    move-object v2, v9

    .line 164
    move-object v4, v10

    .line 165
    move-object v7, v0

    .line 166
    invoke-direct/range {v2 .. v7}, Ld0/c;-><init>(Ld0/q;Ljava/lang/String;IILA/b;)V

    .line 167
    .line 168
    .line 169
    iget-object v2, v8, LA/b;->g:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v2, Ld0/q;

    .line 172
    .line 173
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    move-object v3, v2

    .line 177
    check-cast v3, Lit/deviato/spotifuck/WebService;

    .line 178
    .line 179
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    new-instance v3, Landroid/support/v4/media/i;

    .line 183
    .line 184
    const/4 v4, 0x0

    .line 185
    invoke-direct {v3, v4}, Landroid/support/v4/media/i;-><init>(Landroid/os/Bundle;)V

    .line 186
    .line 187
    .line 188
    iput-object v3, v9, Ld0/c;->f:Landroid/support/v4/media/i;

    .line 189
    .line 190
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    iget-object v3, v9, Ld0/c;->f:Landroid/support/v4/media/i;

    .line 194
    .line 195
    const/4 v5, 0x2

    .line 196
    const-string v6, "MBServiceCompat"

    .line 197
    .line 198
    if-nez v3, :cond_5

    .line 199
    .line 200
    :try_start_1
    invoke-virtual {v0, v5, v4}, LA/b;->C(ILandroid/os/Bundle;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 201
    .line 202
    .line 203
    goto :goto_1

    .line 204
    :catch_1
    const-string v0, "Calling onConnectFailed() failed. Ignoring. pkg="

    .line 205
    .line 206
    invoke-virtual {v0, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-static {v6, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 211
    .line 212
    .line 213
    goto :goto_1

    .line 214
    :cond_5
    :try_start_2
    iget-object v3, v2, Ld0/q;->j:Lr/b;

    .line 215
    .line 216
    invoke-virtual {v3, v1, v9}, Lr/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    const/4 v3, 0x0

    .line 220
    invoke-interface {v1, v9, v3}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V

    .line 221
    .line 222
    .line 223
    iget-object v3, v2, Ld0/q;->l:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 224
    .line 225
    if-eqz v3, :cond_7

    .line 226
    .line 227
    iget-object v4, v9, Ld0/c;->f:Landroid/support/v4/media/i;

    .line 228
    .line 229
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    iget-object v4, v4, Landroid/support/v4/media/i;->a:Landroid/os/Bundle;

    .line 233
    .line 234
    if-nez v4, :cond_6

    .line 235
    .line 236
    new-instance v4, Landroid/os/Bundle;

    .line 237
    .line 238
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 239
    .line 240
    .line 241
    :cond_6
    const-string v7, "extra_service_version"

    .line 242
    .line 243
    invoke-virtual {v4, v7, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 244
    .line 245
    .line 246
    new-instance v5, Landroid/os/Bundle;

    .line 247
    .line 248
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 249
    .line 250
    .line 251
    const-string v7, "data_media_item_id"

    .line 252
    .line 253
    const-string v8, "sfroot"

    .line 254
    .line 255
    invoke-virtual {v5, v7, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    const-string v7, "data_media_session_token"

    .line 259
    .line 260
    invoke-virtual {v5, v7, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 261
    .line 262
    .line 263
    const-string v3, "data_root_hints"

    .line 264
    .line 265
    invoke-virtual {v5, v3, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 266
    .line 267
    .line 268
    const/4 v3, 0x1

    .line 269
    invoke-virtual {v0, v3, v5}, LA/b;->C(ILandroid/os/Bundle;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    .line 270
    .line 271
    .line 272
    goto :goto_1

    .line 273
    :catch_2
    const-string v0, "Calling onConnect() failed. Dropping client. pkg="

    .line 274
    .line 275
    invoke-virtual {v0, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-static {v6, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 280
    .line 281
    .line 282
    iget-object v0, v2, Ld0/q;->j:Lr/b;

    .line 283
    .line 284
    invoke-virtual {v0, v1}, Lr/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    :cond_7
    :goto_1
    return-void

    .line 288
    nop

    .line 289
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
