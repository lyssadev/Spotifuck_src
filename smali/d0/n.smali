.class public final Ld0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LA/b;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Landroid/os/Bundle;

.field public final synthetic e:LA/b;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LA/b;LA/b;Ljava/lang/String;Landroid/os/Bundle;Lb/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ld0/n;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/n;->e:LA/b;

    iput-object p2, p0, Ld0/n;->b:LA/b;

    iput-object p3, p0, Ld0/n;->c:Ljava/lang/String;

    iput-object p4, p0, Ld0/n;->d:Landroid/os/Bundle;

    iput-object p5, p0, Ld0/n;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LA/b;LA/b;Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ld0/n;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/n;->e:LA/b;

    iput-object p2, p0, Ld0/n;->b:LA/b;

    iput-object p3, p0, Ld0/n;->c:Ljava/lang/String;

    iput-object p4, p0, Ld0/n;->f:Ljava/lang/Object;

    iput-object p5, p0, Ld0/n;->d:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1
    iget v0, p0, Ld0/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ld0/n;->b:LA/b;

    .line 7
    .line 8
    iget-object v0, v0, LA/b;->g:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroid/os/Messenger;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, Ld0/n;->e:LA/b;

    .line 17
    .line 18
    iget-object v2, v1, LA/b;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Ld0/q;

    .line 21
    .line 22
    iget-object v2, v2, Ld0/q;->j:Lr/b;

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-virtual {v2, v0, v3}, Lr/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ld0/c;

    .line 30
    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v1, "sendCustomAction for callback that isn\'t registered action="

    .line 36
    .line 37
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Ld0/n;->c:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v1, ", extras="

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Ld0/n;->d:Landroid/os/Bundle;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const-string v1, "MBServiceCompat"

    .line 60
    .line 61
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    iget-object v0, v1, LA/b;->g:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Ld0/q;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    const/4 v0, -0x1

    .line 73
    iget-object v1, p0, Ld0/n;->f:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, Lb/d;

    .line 76
    .line 77
    invoke-virtual {v1, v0, v3}, Lb/d;->b(ILandroid/os/Bundle;)V

    .line 78
    .line 79
    .line 80
    :goto_0
    return-void

    .line 81
    :pswitch_0
    iget-object v0, p0, Ld0/n;->b:LA/b;

    .line 82
    .line 83
    iget-object v0, v0, LA/b;->g:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Landroid/os/Messenger;

    .line 86
    .line 87
    invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget-object v1, p0, Ld0/n;->e:LA/b;

    .line 92
    .line 93
    iget-object v2, v1, LA/b;->g:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v2, Ld0/q;

    .line 96
    .line 97
    iget-object v2, v2, Ld0/q;->j:Lr/b;

    .line 98
    .line 99
    const/4 v3, 0x0

    .line 100
    invoke-virtual {v2, v0, v3}, Lr/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, Ld0/c;

    .line 105
    .line 106
    if-nez v0, :cond_1

    .line 107
    .line 108
    new-instance v0, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    const-string v1, "addSubscription for callback that isn\'t registered id="

    .line 111
    .line 112
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    iget-object v1, p0, Ld0/n;->c:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    const-string v1, "MBServiceCompat"

    .line 125
    .line 126
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    goto/16 :goto_2

    .line 130
    .line 131
    :cond_1
    iget-object v1, v1, LA/b;->g:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v1, Ld0/q;

    .line 134
    .line 135
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    iget-object v2, v0, Ld0/c;->e:Ljava/util/HashMap;

    .line 139
    .line 140
    iget-object v8, p0, Ld0/n;->c:Ljava/lang/String;

    .line 141
    .line 142
    invoke-virtual {v2, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    check-cast v3, Ljava/util/List;

    .line 147
    .line 148
    if-nez v3, :cond_2

    .line 149
    .line 150
    new-instance v3, Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 153
    .line 154
    .line 155
    :cond_2
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    iget-object v6, p0, Ld0/n;->f:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v6, Landroid/os/IBinder;

    .line 166
    .line 167
    iget-object v9, p0, Ld0/n;->d:Landroid/os/Bundle;

    .line 168
    .line 169
    if-eqz v5, :cond_7

    .line 170
    .line 171
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    check-cast v5, LM/b;

    .line 176
    .line 177
    iget-object v7, v5, LM/b;->a:Ljava/lang/Object;

    .line 178
    .line 179
    if-ne v6, v7, :cond_3

    .line 180
    .line 181
    iget-object v5, v5, LM/b;->b:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v5, Landroid/os/Bundle;

    .line 184
    .line 185
    if-ne v9, v5, :cond_4

    .line 186
    .line 187
    goto/16 :goto_2

    .line 188
    .line 189
    :cond_4
    const-string v6, "android.media.browse.extra.PAGE_SIZE"

    .line 190
    .line 191
    const-string v7, "android.media.browse.extra.PAGE"

    .line 192
    .line 193
    const/4 v10, -0x1

    .line 194
    if-nez v9, :cond_5

    .line 195
    .line 196
    invoke-virtual {v5, v7, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 197
    .line 198
    .line 199
    move-result v7

    .line 200
    if-ne v7, v10, :cond_3

    .line 201
    .line 202
    invoke-virtual {v5, v6, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 203
    .line 204
    .line 205
    move-result v5

    .line 206
    if-ne v5, v10, :cond_3

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_5
    if-nez v5, :cond_6

    .line 210
    .line 211
    invoke-virtual {v9, v7, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    if-ne v5, v10, :cond_3

    .line 216
    .line 217
    invoke-virtual {v9, v6, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 218
    .line 219
    .line 220
    move-result v5

    .line 221
    if-ne v5, v10, :cond_3

    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_6
    invoke-virtual {v9, v7, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 225
    .line 226
    .line 227
    move-result v11

    .line 228
    invoke-virtual {v5, v7, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 229
    .line 230
    .line 231
    move-result v7

    .line 232
    if-ne v11, v7, :cond_3

    .line 233
    .line 234
    invoke-virtual {v9, v6, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 235
    .line 236
    .line 237
    move-result v7

    .line 238
    invoke-virtual {v5, v6, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 239
    .line 240
    .line 241
    move-result v5

    .line 242
    if-ne v7, v5, :cond_3

    .line 243
    .line 244
    goto :goto_2

    .line 245
    :cond_7
    new-instance v4, LM/b;

    .line 246
    .line 247
    invoke-direct {v4, v6, v9}, LM/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    invoke-virtual {v2, v8, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    new-instance v10, Ld0/a;

    .line 257
    .line 258
    move-object v2, v10

    .line 259
    move-object v3, v1

    .line 260
    move-object v4, v8

    .line 261
    move-object v5, v0

    .line 262
    move-object v6, v8

    .line 263
    move-object v7, v9

    .line 264
    invoke-direct/range {v2 .. v7}, Ld0/a;-><init>(Ld0/q;Ljava/lang/Object;Ld0/c;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 265
    .line 266
    .line 267
    if-nez v9, :cond_8

    .line 268
    .line 269
    invoke-virtual {v1, v8, v10}, Ld0/q;->b(Ljava/lang/String;Ld0/k;)V

    .line 270
    .line 271
    .line 272
    goto :goto_1

    .line 273
    :cond_8
    const/4 v2, 0x1

    .line 274
    iput v2, v10, Ld0/k;->d:I

    .line 275
    .line 276
    invoke-virtual {v1, v8, v10}, Ld0/q;->b(Ljava/lang/String;Ld0/k;)V

    .line 277
    .line 278
    .line 279
    :goto_1
    invoke-virtual {v10}, Ld0/k;->b()Z

    .line 280
    .line 281
    .line 282
    move-result v1

    .line 283
    if-eqz v1, :cond_9

    .line 284
    .line 285
    :goto_2
    return-void

    .line 286
    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 287
    .line 288
    new-instance v2, Ljava/lang/StringBuilder;

    .line 289
    .line 290
    const-string v3, "onLoadChildren must call detach() or sendResult() before returning for package="

    .line 291
    .line 292
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    iget-object v0, v0, Ld0/c;->a:Ljava/lang/String;

    .line 296
    .line 297
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    const-string v0, " id="

    .line 301
    .line 302
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    throw v1

    .line 316
    nop

    .line 317
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
