.class public final Lm1/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final e:Ljava/util/logging/Logger;


# instance fields
.field public final a:Lr1/q;

.field public final b:Lm1/t;

.field public final c:Z

.field public final d:Lm1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lm1/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lm1/u;->e:Ljava/util/logging/Logger;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lr1/q;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm1/u;->a:Lr1/q;

    .line 5
    .line 6
    iput-boolean p2, p0, Lm1/u;->c:Z

    .line 7
    .line 8
    new-instance p2, Lm1/t;

    .line 9
    .line 10
    invoke-direct {p2, p1}, Lm1/t;-><init>(Lr1/q;)V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Lm1/u;->b:Lm1/t;

    .line 14
    .line 15
    new-instance p1, Lm1/c;

    .line 16
    .line 17
    invoke-direct {p1, p2}, Lm1/c;-><init>(Lm1/t;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lm1/u;->d:Lm1/c;

    .line 21
    .line 22
    return-void
.end method

.method public static f(IBS)I
    .locals 1

    .line 1
    and-int/lit8 p1, p1, 0x8

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    add-int/lit8 p0, p0, -0x1

    .line 6
    .line 7
    :cond_0
    if-gt p2, p0, :cond_1

    .line 8
    .line 9
    sub-int/2addr p0, p2

    .line 10
    int-to-short p0, p0

    .line 11
    return p0

    .line 12
    :cond_1
    invoke-static {p2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const/4 p2, 0x2

    .line 21
    new-array p2, p2, [Ljava/lang/Object;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    aput-object p1, p2, v0

    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    aput-object p0, p2, p1

    .line 28
    .line 29
    const-string p0, "PROTOCOL_ERROR padding %s > remaining length %s"

    .line 30
    .line 31
    invoke-static {p0, p2}, Lm1/f;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    throw p0
.end method

.method public static m(Lr1/q;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lr1/q;->i()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit16 v0, v0, 0xff

    .line 6
    .line 7
    shl-int/lit8 v0, v0, 0x10

    .line 8
    .line 9
    invoke-virtual {p0}, Lr1/q;->i()B

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    and-int/lit16 v1, v1, 0xff

    .line 14
    .line 15
    shl-int/lit8 v1, v1, 0x8

    .line 16
    .line 17
    or-int/2addr v0, v1

    .line 18
    invoke-virtual {p0}, Lr1/q;->i()B

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    and-int/lit16 p0, p0, 0xff

    .line 23
    .line 24
    or-int/2addr p0, v0

    .line 25
    return p0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm1/u;->a:Lr1/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr1/q;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final g(ZLm1/q;)Z
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    :try_start_0
    iget-object v2, p0, Lm1/u;->a:Lr1/q;

    .line 4
    .line 5
    const-wide/16 v3, 0x9

    .line 6
    .line 7
    invoke-virtual {v2, v3, v4}, Lr1/q;->p(J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, Lm1/u;->a:Lr1/q;

    .line 11
    .line 12
    invoke-static {v2}, Lm1/u;->m(Lr1/q;)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x0

    .line 17
    if-ltz v2, :cond_10

    .line 18
    .line 19
    const/16 v4, 0x4000

    .line 20
    .line 21
    if-gt v2, v4, :cond_10

    .line 22
    .line 23
    iget-object v4, p0, Lm1/u;->a:Lr1/q;

    .line 24
    .line 25
    invoke-virtual {v4}, Lr1/q;->i()B

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    and-int/lit16 v4, v4, 0xff

    .line 30
    .line 31
    int-to-byte v4, v4

    .line 32
    const/4 v5, 0x4

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    if-ne v4, v5, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const-string p1, "Expected a SETTINGS frame but was %s"

    .line 39
    .line 40
    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    new-array v1, v1, [Ljava/lang/Object;

    .line 45
    .line 46
    aput-object p2, v1, v0

    .line 47
    .line 48
    invoke-static {p1, v1}, Lm1/f;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    throw v3

    .line 52
    :cond_1
    :goto_0
    iget-object p1, p0, Lm1/u;->a:Lr1/q;

    .line 53
    .line 54
    invoke-virtual {p1}, Lr1/q;->i()B

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    and-int/lit16 p1, p1, 0xff

    .line 59
    .line 60
    int-to-byte p1, p1

    .line 61
    iget-object v6, p0, Lm1/u;->a:Lr1/q;

    .line 62
    .line 63
    invoke-virtual {v6}, Lr1/q;->l()I

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    const v7, 0x7fffffff

    .line 68
    .line 69
    .line 70
    and-int/2addr v7, v6

    .line 71
    sget-object v8, Lm1/u;->e:Ljava/util/logging/Logger;

    .line 72
    .line 73
    sget-object v9, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 74
    .line 75
    invoke-virtual {v8, v9}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    if-eqz v9, :cond_2

    .line 80
    .line 81
    invoke-static {v1, v7, v2, v4, p1}, Lm1/f;->a(ZIIBB)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    invoke-virtual {v8, v9}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :cond_2
    packed-switch v4, :pswitch_data_0

    .line 89
    .line 90
    .line 91
    iget-object p1, p0, Lm1/u;->a:Lr1/q;

    .line 92
    .line 93
    int-to-long v2, v2

    .line 94
    invoke-virtual {p1, v2, v3}, Lr1/q;->q(J)V

    .line 95
    .line 96
    .line 97
    goto/16 :goto_3

    .line 98
    .line 99
    :pswitch_0
    if-ne v2, v5, :cond_6

    .line 100
    .line 101
    iget-object p1, p0, Lm1/u;->a:Lr1/q;

    .line 102
    .line 103
    invoke-virtual {p1}, Lr1/q;->l()I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    int-to-long v4, p1

    .line 108
    const-wide/32 v8, 0x7fffffff

    .line 109
    .line 110
    .line 111
    and-long/2addr v4, v8

    .line 112
    const-wide/16 v8, 0x0

    .line 113
    .line 114
    cmp-long p1, v4, v8

    .line 115
    .line 116
    if-eqz p1, :cond_5

    .line 117
    .line 118
    if-nez v7, :cond_3

    .line 119
    .line 120
    iget-object p1, p2, Lm1/q;->c:Ljava/lang/Object;

    .line 121
    .line 122
    move-object v0, p1

    .line 123
    check-cast v0, Lm1/s;

    .line 124
    .line 125
    monitor-enter v0

    .line 126
    :try_start_1
    iget-object p1, p2, Lm1/q;->c:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast p1, Lm1/s;

    .line 129
    .line 130
    iget-wide v2, p1, Lm1/s;->m:J

    .line 131
    .line 132
    add-long/2addr v2, v4

    .line 133
    iput-wide v2, p1, Lm1/s;->m:J

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 136
    .line 137
    .line 138
    monitor-exit v0

    .line 139
    goto/16 :goto_3

    .line 140
    .line 141
    :catchall_0
    move-exception p1

    .line 142
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 143
    throw p1

    .line 144
    :cond_3
    iget-object p2, p2, Lm1/q;->c:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast p2, Lm1/s;

    .line 147
    .line 148
    invoke-virtual {p2, v7}, Lm1/s;->h(I)Lm1/y;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    if-eqz p2, :cond_f

    .line 153
    .line 154
    monitor-enter p2

    .line 155
    :try_start_2
    iget-wide v2, p2, Lm1/y;->b:J

    .line 156
    .line 157
    add-long/2addr v2, v4

    .line 158
    iput-wide v2, p2, Lm1/y;->b:J

    .line 159
    .line 160
    if-lez p1, :cond_4

    .line 161
    .line 162
    invoke-virtual {p2}, Ljava/lang/Object;->notifyAll()V

    .line 163
    .line 164
    .line 165
    :cond_4
    monitor-exit p2

    .line 166
    goto/16 :goto_3

    .line 167
    .line 168
    :catchall_1
    move-exception p1

    .line 169
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 170
    throw p1

    .line 171
    :cond_5
    const-string p1, "windowSizeIncrement was 0"

    .line 172
    .line 173
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    new-array v1, v1, [Ljava/lang/Object;

    .line 178
    .line 179
    aput-object p2, v1, v0

    .line 180
    .line 181
    invoke-static {p1, v1}, Lm1/f;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    throw v3

    .line 185
    :cond_6
    const-string p1, "TYPE_WINDOW_UPDATE length !=4: %s"

    .line 186
    .line 187
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object p2

    .line 191
    new-array v1, v1, [Ljava/lang/Object;

    .line 192
    .line 193
    aput-object p2, v1, v0

    .line 194
    .line 195
    invoke-static {p1, v1}, Lm1/f;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    throw v3

    .line 199
    :pswitch_1
    invoke-virtual {p0, p2, v2, v7}, Lm1/u;->j(Lm1/q;II)V

    .line 200
    .line 201
    .line 202
    goto/16 :goto_3

    .line 203
    .line 204
    :pswitch_2
    invoke-virtual {p0, p2, v2, p1, v7}, Lm1/u;->n(Lm1/q;IBI)V

    .line 205
    .line 206
    .line 207
    goto/16 :goto_3

    .line 208
    .line 209
    :pswitch_3
    invoke-virtual {p0, p2, v2, p1, v7}, Lm1/u;->o(Lm1/q;IBI)V

    .line 210
    .line 211
    .line 212
    goto/16 :goto_3

    .line 213
    .line 214
    :pswitch_4
    invoke-virtual {p0, p2, v2, p1, v7}, Lm1/u;->p(Lm1/q;IBI)V

    .line 215
    .line 216
    .line 217
    goto/16 :goto_3

    .line 218
    .line 219
    :pswitch_5
    if-ne v2, v5, :cond_c

    .line 220
    .line 221
    if-eqz v7, :cond_b

    .line 222
    .line 223
    iget-object p1, p0, Lm1/u;->a:Lr1/q;

    .line 224
    .line 225
    invoke-virtual {p1}, Lr1/q;->l()I

    .line 226
    .line 227
    .line 228
    move-result p1

    .line 229
    const/16 v2, 0xb

    .line 230
    .line 231
    invoke-static {v2}, Lt/e;->b(I)[I

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    array-length v4, v2

    .line 236
    const/4 v5, 0x0

    .line 237
    :goto_1
    if-ge v5, v4, :cond_8

    .line 238
    .line 239
    aget v8, v2, v5

    .line 240
    .line 241
    invoke-static {v8}, LQ0/E;->d(I)I

    .line 242
    .line 243
    .line 244
    move-result v9

    .line 245
    if-ne v9, p1, :cond_7

    .line 246
    .line 247
    goto :goto_2

    .line 248
    :cond_7
    add-int/2addr v5, v1

    .line 249
    goto :goto_1

    .line 250
    :cond_8
    const/4 v8, 0x0

    .line 251
    :goto_2
    if-eqz v8, :cond_a

    .line 252
    .line 253
    iget-object p1, p2, Lm1/q;->c:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast p1, Lm1/s;

    .line 256
    .line 257
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    if-eqz v7, :cond_9

    .line 261
    .line 262
    and-int/lit8 p2, v6, 0x1

    .line 263
    .line 264
    if-nez p2, :cond_9

    .line 265
    .line 266
    iget-object p2, p1, Lm1/s;->i:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 267
    .line 268
    new-instance v2, Lm1/k;

    .line 269
    .line 270
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    iget-object v4, p1, Lm1/s;->d:Ljava/lang/String;

    .line 275
    .line 276
    const/4 v5, 0x2

    .line 277
    new-array v5, v5, [Ljava/lang/Object;

    .line 278
    .line 279
    aput-object v4, v5, v0

    .line 280
    .line 281
    aput-object v3, v5, v1

    .line 282
    .line 283
    invoke-direct {v2, p1, v5, v7, v8}, Lm1/k;-><init>(Lm1/s;[Ljava/lang/Object;II)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {p2, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 287
    .line 288
    .line 289
    goto :goto_3

    .line 290
    :cond_9
    invoke-virtual {p1, v7}, Lm1/s;->j(I)Lm1/y;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    if-eqz p1, :cond_f

    .line 295
    .line 296
    invoke-virtual {p1, v8}, Lm1/y;->j(I)V

    .line 297
    .line 298
    .line 299
    goto :goto_3

    .line 300
    :cond_a
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    new-array p2, v1, [Ljava/lang/Object;

    .line 305
    .line 306
    aput-object p1, p2, v0

    .line 307
    .line 308
    const-string p1, "TYPE_RST_STREAM unexpected error code: %d"

    .line 309
    .line 310
    invoke-static {p1, p2}, Lm1/f;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    throw v3

    .line 314
    :cond_b
    new-array p1, v0, [Ljava/lang/Object;

    .line 315
    .line 316
    const-string p2, "TYPE_RST_STREAM streamId == 0"

    .line 317
    .line 318
    invoke-static {p2, p1}, Lm1/f;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    throw v3

    .line 322
    :cond_c
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 323
    .line 324
    .line 325
    move-result-object p1

    .line 326
    new-array p2, v1, [Ljava/lang/Object;

    .line 327
    .line 328
    aput-object p1, p2, v0

    .line 329
    .line 330
    const-string p1, "TYPE_RST_STREAM length: %d != 4"

    .line 331
    .line 332
    invoke-static {p1, p2}, Lm1/f;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    throw v3

    .line 336
    :pswitch_6
    const/4 p1, 0x5

    .line 337
    if-ne v2, p1, :cond_e

    .line 338
    .line 339
    if-eqz v7, :cond_d

    .line 340
    .line 341
    iget-object p1, p0, Lm1/u;->a:Lr1/q;

    .line 342
    .line 343
    invoke-virtual {p1}, Lr1/q;->l()I

    .line 344
    .line 345
    .line 346
    invoke-virtual {p1}, Lr1/q;->i()B

    .line 347
    .line 348
    .line 349
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    goto :goto_3

    .line 353
    :cond_d
    new-array p1, v0, [Ljava/lang/Object;

    .line 354
    .line 355
    const-string p2, "TYPE_PRIORITY streamId == 0"

    .line 356
    .line 357
    invoke-static {p2, p1}, Lm1/f;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    throw v3

    .line 361
    :cond_e
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 362
    .line 363
    .line 364
    move-result-object p1

    .line 365
    new-array p2, v1, [Ljava/lang/Object;

    .line 366
    .line 367
    aput-object p1, p2, v0

    .line 368
    .line 369
    const-string p1, "TYPE_PRIORITY length: %d != 5"

    .line 370
    .line 371
    invoke-static {p1, p2}, Lm1/f;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    throw v3

    .line 375
    :pswitch_7
    invoke-virtual {p0, p2, v2, p1, v7}, Lm1/u;->l(Lm1/q;IBI)V

    .line 376
    .line 377
    .line 378
    goto :goto_3

    .line 379
    :pswitch_8
    invoke-virtual {p0, p2, v2, p1, v7}, Lm1/u;->i(Lm1/q;IBI)V

    .line 380
    .line 381
    .line 382
    :cond_f
    :goto_3
    return v1

    .line 383
    :cond_10
    const-string p1, "FRAME_SIZE_ERROR: %s"

    .line 384
    .line 385
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 386
    .line 387
    .line 388
    move-result-object p2

    .line 389
    new-array v1, v1, [Ljava/lang/Object;

    .line 390
    .line 391
    aput-object p2, v1, v0

    .line 392
    .line 393
    invoke-static {p1, v1}, Lm1/f;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    throw v3

    .line 397
    :catch_0
    return v0

    .line 398
    nop

    .line 399
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Lm1/q;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-boolean v2, p0, Lm1/u;->c:Z

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    if-eqz v2, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, v1, p1}, Lm1/u;->g(ZLm1/q;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-array p1, v0, [Ljava/lang/Object;

    .line 16
    .line 17
    const-string v0, "Required SETTINGS preface not received"

    .line 18
    .line 19
    invoke-static {v0, p1}, Lm1/f;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    throw v3

    .line 23
    :cond_1
    sget-object p1, Lm1/f;->a:Lr1/h;

    .line 24
    .line 25
    iget-object v2, p1, Lr1/h;->a:[B

    .line 26
    .line 27
    array-length v2, v2

    .line 28
    int-to-long v4, v2

    .line 29
    iget-object v2, p0, Lm1/u;->a:Lr1/q;

    .line 30
    .line 31
    invoke-virtual {v2, v4, v5}, Lr1/q;->j(J)Lr1/h;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 36
    .line 37
    sget-object v5, Lm1/u;->e:Ljava/util/logging/Logger;

    .line 38
    .line 39
    invoke-virtual {v5, v4}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    invoke-virtual {v2}, Lr1/h;->h()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    sget-object v6, Lh1/c;->a:[B

    .line 50
    .line 51
    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 52
    .line 53
    new-instance v6, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v7, "<< CONNECTION "

    .line 56
    .line 57
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v5, v4}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    invoke-virtual {p1, v2}, Lr1/h;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    :goto_0
    return-void

    .line 77
    :cond_3
    invoke-virtual {v2}, Lr1/h;->o()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    new-array v1, v1, [Ljava/lang/Object;

    .line 82
    .line 83
    aput-object p1, v1, v0

    .line 84
    .line 85
    const-string p1, "Expected a connection header but was %s"

    .line 86
    .line 87
    invoke-static {p1, v1}, Lm1/f;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    throw v3
.end method

.method public final i(Lm1/q;IBI)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move/from16 v5, p4

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x0

    .line 13
    if-eqz v5, :cond_10

    .line 14
    .line 15
    and-int/lit8 v8, v2, 0x1

    .line 16
    .line 17
    if-eqz v8, :cond_0

    .line 18
    .line 19
    const/4 v8, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v8, 0x0

    .line 22
    :goto_0
    and-int/lit8 v9, v2, 0x20

    .line 23
    .line 24
    if-nez v9, :cond_f

    .line 25
    .line 26
    and-int/lit8 v6, v2, 0x8

    .line 27
    .line 28
    if-eqz v6, :cond_1

    .line 29
    .line 30
    iget-object v6, v1, Lm1/u;->a:Lr1/q;

    .line 31
    .line 32
    invoke-virtual {v6}, Lr1/q;->i()B

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    and-int/lit16 v6, v6, 0xff

    .line 37
    .line 38
    int-to-short v6, v6

    .line 39
    move v9, v6

    .line 40
    move/from16 v6, p2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move/from16 v6, p2

    .line 44
    .line 45
    const/4 v9, 0x0

    .line 46
    :goto_1
    invoke-static {v6, v2, v9}, Lm1/u;->f(IBS)I

    .line 47
    .line 48
    .line 49
    move-result v10

    .line 50
    iget-object v2, v1, Lm1/u;->a:Lr1/q;

    .line 51
    .line 52
    iget-object v6, v0, Lm1/q;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v6, Lm1/s;

    .line 55
    .line 56
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    if-eqz v5, :cond_3

    .line 60
    .line 61
    and-int/lit8 v6, v5, 0x1

    .line 62
    .line 63
    if-nez v6, :cond_3

    .line 64
    .line 65
    iget-object v0, v0, Lm1/q;->c:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Lm1/s;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    new-instance v6, Lr1/e;

    .line 73
    .line 74
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 75
    .line 76
    .line 77
    int-to-long v11, v10

    .line 78
    invoke-virtual {v2, v11, v12}, Lr1/q;->p(J)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v6, v11, v12}, Lr1/q;->e(Lr1/e;J)J

    .line 82
    .line 83
    .line 84
    iget-wide v13, v6, Lr1/e;->b:J

    .line 85
    .line 86
    cmp-long v2, v13, v11

    .line 87
    .line 88
    if-nez v2, :cond_2

    .line 89
    .line 90
    iget-object v11, v0, Lm1/s;->i:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 91
    .line 92
    new-instance v12, Lm1/l;

    .line 93
    .line 94
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    iget-object v13, v0, Lm1/s;->d:Ljava/lang/String;

    .line 99
    .line 100
    new-array v14, v3, [Ljava/lang/Object;

    .line 101
    .line 102
    aput-object v13, v14, v7

    .line 103
    .line 104
    aput-object v2, v14, v4

    .line 105
    .line 106
    move-object v2, v12

    .line 107
    move-object v3, v0

    .line 108
    move-object v4, v14

    .line 109
    move/from16 v5, p4

    .line 110
    .line 111
    move v7, v10

    .line 112
    invoke-direct/range {v2 .. v8}, Lm1/l;-><init>(Lm1/s;[Ljava/lang/Object;ILr1/e;IZ)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v11, v12}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 116
    .line 117
    .line 118
    goto/16 :goto_9

    .line 119
    .line 120
    :cond_2
    new-instance v0, Ljava/io/IOException;

    .line 121
    .line 122
    new-instance v2, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    .line 126
    .line 127
    iget-wide v3, v6, Lr1/e;->b:J

    .line 128
    .line 129
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string v3, " != "

    .line 133
    .line 134
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw v0

    .line 148
    :cond_3
    iget-object v6, v0, Lm1/q;->c:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v6, Lm1/s;

    .line 151
    .line 152
    invoke-virtual {v6, v5}, Lm1/s;->h(I)Lm1/y;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    if-nez v6, :cond_4

    .line 157
    .line 158
    iget-object v0, v0, Lm1/q;->c:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v0, Lm1/s;

    .line 161
    .line 162
    invoke-virtual {v0, v5, v3}, Lm1/s;->m(II)V

    .line 163
    .line 164
    .line 165
    int-to-long v3, v10

    .line 166
    invoke-virtual {v2, v3, v4}, Lr1/q;->q(J)V

    .line 167
    .line 168
    .line 169
    goto/16 :goto_9

    .line 170
    .line 171
    :cond_4
    iget-object v0, v6, Lm1/y;->g:Lm1/w;

    .line 172
    .line 173
    int-to-long v10, v10

    .line 174
    :goto_2
    const-wide/16 v12, 0x0

    .line 175
    .line 176
    cmp-long v3, v10, v12

    .line 177
    .line 178
    if-lez v3, :cond_d

    .line 179
    .line 180
    iget-object v3, v0, Lm1/w;->f:Lm1/y;

    .line 181
    .line 182
    monitor-enter v3

    .line 183
    :try_start_0
    iget-boolean v5, v0, Lm1/w;->e:Z

    .line 184
    .line 185
    iget-object v14, v0, Lm1/w;->b:Lr1/e;

    .line 186
    .line 187
    iget-wide v14, v14, Lr1/e;->b:J

    .line 188
    .line 189
    add-long/2addr v14, v10

    .line 190
    move/from16 v16, v8

    .line 191
    .line 192
    iget-wide v7, v0, Lm1/w;->c:J

    .line 193
    .line 194
    cmp-long v17, v14, v7

    .line 195
    .line 196
    if-lez v17, :cond_5

    .line 197
    .line 198
    const/4 v7, 0x1

    .line 199
    goto :goto_3

    .line 200
    :cond_5
    const/4 v7, 0x0

    .line 201
    :goto_3
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 202
    if-eqz v7, :cond_7

    .line 203
    .line 204
    invoke-virtual {v2, v10, v11}, Lr1/q;->q(J)V

    .line 205
    .line 206
    .line 207
    iget-object v0, v0, Lm1/w;->f:Lm1/y;

    .line 208
    .line 209
    const/4 v2, 0x4

    .line 210
    invoke-virtual {v0, v2}, Lm1/y;->d(I)Z

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    if-nez v3, :cond_6

    .line 215
    .line 216
    goto :goto_8

    .line 217
    :cond_6
    iget-object v3, v0, Lm1/y;->d:Lm1/s;

    .line 218
    .line 219
    iget v0, v0, Lm1/y;->c:I

    .line 220
    .line 221
    invoke-virtual {v3, v0, v2}, Lm1/s;->m(II)V

    .line 222
    .line 223
    .line 224
    goto :goto_8

    .line 225
    :cond_7
    if-eqz v5, :cond_8

    .line 226
    .line 227
    invoke-virtual {v2, v10, v11}, Lr1/q;->q(J)V

    .line 228
    .line 229
    .line 230
    goto :goto_8

    .line 231
    :cond_8
    iget-object v3, v0, Lm1/w;->a:Lr1/e;

    .line 232
    .line 233
    invoke-virtual {v2, v3, v10, v11}, Lr1/q;->e(Lr1/e;J)J

    .line 234
    .line 235
    .line 236
    move-result-wide v7

    .line 237
    const-wide/16 v14, -0x1

    .line 238
    .line 239
    cmp-long v3, v7, v14

    .line 240
    .line 241
    if-eqz v3, :cond_c

    .line 242
    .line 243
    sub-long/2addr v10, v7

    .line 244
    iget-object v3, v0, Lm1/w;->f:Lm1/y;

    .line 245
    .line 246
    monitor-enter v3

    .line 247
    :try_start_1
    iget-object v5, v0, Lm1/w;->b:Lr1/e;

    .line 248
    .line 249
    iget-wide v7, v5, Lr1/e;->b:J

    .line 250
    .line 251
    cmp-long v17, v7, v12

    .line 252
    .line 253
    if-nez v17, :cond_9

    .line 254
    .line 255
    const/4 v7, 0x1

    .line 256
    goto :goto_4

    .line 257
    :cond_9
    const/4 v7, 0x0

    .line 258
    :goto_4
    iget-object v8, v0, Lm1/w;->a:Lr1/e;

    .line 259
    .line 260
    :goto_5
    const-wide/16 v12, 0x2000

    .line 261
    .line 262
    invoke-virtual {v8, v5, v12, v13}, Lr1/e;->e(Lr1/e;J)J

    .line 263
    .line 264
    .line 265
    move-result-wide v12

    .line 266
    cmp-long v17, v12, v14

    .line 267
    .line 268
    if-eqz v17, :cond_a

    .line 269
    .line 270
    goto :goto_5

    .line 271
    :cond_a
    if-eqz v7, :cond_b

    .line 272
    .line 273
    iget-object v5, v0, Lm1/w;->f:Lm1/y;

    .line 274
    .line 275
    invoke-virtual {v5}, Ljava/lang/Object;->notifyAll()V

    .line 276
    .line 277
    .line 278
    goto :goto_6

    .line 279
    :catchall_0
    move-exception v0

    .line 280
    goto :goto_7

    .line 281
    :cond_b
    :goto_6
    monitor-exit v3

    .line 282
    move/from16 v8, v16

    .line 283
    .line 284
    const/4 v7, 0x0

    .line 285
    goto :goto_2

    .line 286
    :goto_7
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 287
    throw v0

    .line 288
    :cond_c
    new-instance v0, Ljava/io/EOFException;

    .line 289
    .line 290
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 291
    .line 292
    .line 293
    throw v0

    .line 294
    :catchall_1
    move-exception v0

    .line 295
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 296
    throw v0

    .line 297
    :cond_d
    move/from16 v16, v8

    .line 298
    .line 299
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    :goto_8
    if-eqz v16, :cond_e

    .line 303
    .line 304
    invoke-virtual {v6}, Lm1/y;->h()V

    .line 305
    .line 306
    .line 307
    :cond_e
    :goto_9
    iget-object v0, v1, Lm1/u;->a:Lr1/q;

    .line 308
    .line 309
    int-to-long v2, v9

    .line 310
    invoke-virtual {v0, v2, v3}, Lr1/q;->q(J)V

    .line 311
    .line 312
    .line 313
    return-void

    .line 314
    :cond_f
    const-string v0, "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"

    .line 315
    .line 316
    const/4 v2, 0x0

    .line 317
    new-array v2, v2, [Ljava/lang/Object;

    .line 318
    .line 319
    invoke-static {v0, v2}, Lm1/f;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    throw v6

    .line 323
    :cond_10
    const/4 v2, 0x0

    .line 324
    const-string v0, "PROTOCOL_ERROR: TYPE_DATA streamId == 0"

    .line 325
    .line 326
    new-array v2, v2, [Ljava/lang/Object;

    .line 327
    .line 328
    invoke-static {v0, v2}, Lm1/f;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    throw v6
.end method

.method public final j(Lm1/q;II)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    const/16 v3, 0x8

    .line 5
    .line 6
    if-lt p2, v3, :cond_7

    .line 7
    .line 8
    if-nez p3, :cond_6

    .line 9
    .line 10
    iget-object p3, p0, Lm1/u;->a:Lr1/q;

    .line 11
    .line 12
    invoke-virtual {p3}, Lr1/q;->l()I

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    iget-object v4, p0, Lm1/u;->a:Lr1/q;

    .line 17
    .line 18
    invoke-virtual {v4}, Lr1/q;->l()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    sub-int/2addr p2, v3

    .line 23
    const/16 v3, 0xb

    .line 24
    .line 25
    invoke-static {v3}, Lt/e;->b(I)[I

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    array-length v5, v3

    .line 30
    const/4 v6, 0x0

    .line 31
    :goto_0
    if-ge v6, v5, :cond_1

    .line 32
    .line 33
    aget v7, v3, v6

    .line 34
    .line 35
    invoke-static {v7}, LQ0/E;->d(I)I

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    if-ne v8, v4, :cond_0

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    add-int/2addr v6, v1

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v7, 0x0

    .line 45
    :goto_1
    if-eqz v7, :cond_5

    .line 46
    .line 47
    sget-object v2, Lr1/h;->e:Lr1/h;

    .line 48
    .line 49
    if-lez p2, :cond_2

    .line 50
    .line 51
    iget-object v2, p0, Lm1/u;->a:Lr1/q;

    .line 52
    .line 53
    int-to-long v3, p2

    .line 54
    invoke-virtual {v2, v3, v4}, Lr1/q;->j(J)Lr1/h;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Lr1/h;->l()I

    .line 62
    .line 63
    .line 64
    iget-object p2, p1, Lm1/q;->c:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p2, Lm1/s;

    .line 67
    .line 68
    monitor-enter p2

    .line 69
    :try_start_0
    iget-object v2, p1, Lm1/q;->c:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, Lm1/s;

    .line 72
    .line 73
    iget-object v2, v2, Lm1/s;->c:Ljava/util/LinkedHashMap;

    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    iget-object v3, p1, Lm1/q;->c:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v3, Lm1/s;

    .line 82
    .line 83
    iget-object v3, v3, Lm1/s;->c:Ljava/util/LinkedHashMap;

    .line 84
    .line 85
    invoke-interface {v3}, Ljava/util/Map;->size()I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    new-array v3, v3, [Lm1/y;

    .line 90
    .line 91
    invoke-interface {v2, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    check-cast v2, [Lm1/y;

    .line 96
    .line 97
    iget-object v3, p1, Lm1/q;->c:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v3, Lm1/s;

    .line 100
    .line 101
    iput-boolean v1, v3, Lm1/s;->g:Z

    .line 102
    .line 103
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    array-length p2, v2

    .line 105
    :goto_2
    if-ge v0, p2, :cond_4

    .line 106
    .line 107
    aget-object v3, v2, v0

    .line 108
    .line 109
    iget v4, v3, Lm1/y;->c:I

    .line 110
    .line 111
    if-le v4, p3, :cond_3

    .line 112
    .line 113
    invoke-virtual {v3}, Lm1/y;->f()Z

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-eqz v4, :cond_3

    .line 118
    .line 119
    const/4 v4, 0x5

    .line 120
    invoke-virtual {v3, v4}, Lm1/y;->j(I)V

    .line 121
    .line 122
    .line 123
    iget-object v4, p1, Lm1/q;->c:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v4, Lm1/s;

    .line 126
    .line 127
    iget v3, v3, Lm1/y;->c:I

    .line 128
    .line 129
    invoke-virtual {v4, v3}, Lm1/s;->j(I)Lm1/y;

    .line 130
    .line 131
    .line 132
    :cond_3
    add-int/2addr v0, v1

    .line 133
    goto :goto_2

    .line 134
    :cond_4
    return-void

    .line 135
    :catchall_0
    move-exception p1

    .line 136
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 137
    throw p1

    .line 138
    :cond_5
    const-string p1, "TYPE_GOAWAY unexpected error code: %d"

    .line 139
    .line 140
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    new-array p3, v1, [Ljava/lang/Object;

    .line 145
    .line 146
    aput-object p2, p3, v0

    .line 147
    .line 148
    invoke-static {p1, p3}, Lm1/f;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    throw v2

    .line 152
    :cond_6
    const-string p1, "TYPE_GOAWAY streamId != 0"

    .line 153
    .line 154
    new-array p2, v0, [Ljava/lang/Object;

    .line 155
    .line 156
    invoke-static {p1, p2}, Lm1/f;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    throw v2

    .line 160
    :cond_7
    const-string p1, "TYPE_GOAWAY length < 8: %s"

    .line 161
    .line 162
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    new-array p3, v1, [Ljava/lang/Object;

    .line 167
    .line 168
    aput-object p2, p3, v0

    .line 169
    .line 170
    invoke-static {p1, p3}, Lm1/f;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    throw v2
.end method

.method public final k(ISBI)Ljava/util/ArrayList;
    .locals 2

    .line 1
    iget-object v0, p0, Lm1/u;->b:Lm1/t;

    .line 2
    .line 3
    iput p1, v0, Lm1/t;->e:I

    .line 4
    .line 5
    iput p1, v0, Lm1/t;->b:I

    .line 6
    .line 7
    iput-short p2, v0, Lm1/t;->f:S

    .line 8
    .line 9
    iput-byte p3, v0, Lm1/t;->c:B

    .line 10
    .line 11
    iput p4, v0, Lm1/t;->d:I

    .line 12
    .line 13
    :cond_0
    :goto_0
    iget-object p1, p0, Lm1/u;->d:Lm1/c;

    .line 14
    .line 15
    iget-object p2, p1, Lm1/c;->b:Lr1/q;

    .line 16
    .line 17
    invoke-virtual {p2}, Lr1/q;->f()Z

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    iget-object p4, p1, Lm1/c;->a:Ljava/util/ArrayList;

    .line 22
    .line 23
    if-nez p3, :cond_c

    .line 24
    .line 25
    invoke-virtual {p2}, Lr1/q;->i()B

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    and-int/lit16 p3, p2, 0xff

    .line 30
    .line 31
    const/16 v0, 0x80

    .line 32
    .line 33
    if-eq p3, v0, :cond_b

    .line 34
    .line 35
    and-int/lit16 v1, p2, 0x80

    .line 36
    .line 37
    if-ne v1, v0, :cond_3

    .line 38
    .line 39
    const/16 p2, 0x7f

    .line 40
    .line 41
    invoke-virtual {p1, p3, p2}, Lm1/c;->e(II)I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    add-int/lit8 p3, p2, -0x1

    .line 46
    .line 47
    if-ltz p3, :cond_1

    .line 48
    .line 49
    sget-object v0, Lm1/e;->a:[Lm1/b;

    .line 50
    .line 51
    array-length v1, v0

    .line 52
    add-int/lit8 v1, v1, -0x1

    .line 53
    .line 54
    if-gt p3, v1, :cond_1

    .line 55
    .line 56
    aget-object p1, v0, p3

    .line 57
    .line 58
    invoke-virtual {p4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    sget-object v0, Lm1/e;->a:[Lm1/b;

    .line 63
    .line 64
    array-length v0, v0

    .line 65
    sub-int/2addr p3, v0

    .line 66
    iget v0, p1, Lm1/c;->f:I

    .line 67
    .line 68
    add-int/lit8 v0, v0, 0x1

    .line 69
    .line 70
    add-int/2addr v0, p3

    .line 71
    if-ltz v0, :cond_2

    .line 72
    .line 73
    iget-object p1, p1, Lm1/c;->e:[Lm1/b;

    .line 74
    .line 75
    array-length p3, p1

    .line 76
    if-ge v0, p3, :cond_2

    .line 77
    .line 78
    aget-object p1, p1, v0

    .line 79
    .line 80
    invoke-virtual {p4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    new-instance p1, Ljava/io/IOException;

    .line 85
    .line 86
    const-string p3, "Header index too large "

    .line 87
    .line 88
    invoke-static {p3, p2}, LQ0/E;->e(Ljava/lang/String;I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p1

    .line 96
    :cond_3
    const/16 v0, 0x40

    .line 97
    .line 98
    if-ne p3, v0, :cond_4

    .line 99
    .line 100
    invoke-virtual {p1}, Lm1/c;->d()Lr1/h;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    invoke-static {p2}, Lm1/e;->a(Lr1/h;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Lm1/c;->d()Lr1/h;

    .line 108
    .line 109
    .line 110
    move-result-object p3

    .line 111
    new-instance p4, Lm1/b;

    .line 112
    .line 113
    invoke-direct {p4, p2, p3}, Lm1/b;-><init>(Lr1/h;Lr1/h;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, p4}, Lm1/c;->c(Lm1/b;)V

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_4
    and-int/lit8 v1, p2, 0x40

    .line 121
    .line 122
    if-ne v1, v0, :cond_5

    .line 123
    .line 124
    const/16 p2, 0x3f

    .line 125
    .line 126
    invoke-virtual {p1, p3, p2}, Lm1/c;->e(II)I

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    add-int/lit8 p2, p2, -0x1

    .line 131
    .line 132
    invoke-virtual {p1, p2}, Lm1/c;->b(I)Lr1/h;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    invoke-virtual {p1}, Lm1/c;->d()Lr1/h;

    .line 137
    .line 138
    .line 139
    move-result-object p3

    .line 140
    new-instance p4, Lm1/b;

    .line 141
    .line 142
    invoke-direct {p4, p2, p3}, Lm1/b;-><init>(Lr1/h;Lr1/h;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, p4}, Lm1/c;->c(Lm1/b;)V

    .line 146
    .line 147
    .line 148
    goto/16 :goto_0

    .line 149
    .line 150
    :cond_5
    and-int/lit8 p2, p2, 0x20

    .line 151
    .line 152
    const/16 v0, 0x20

    .line 153
    .line 154
    if-ne p2, v0, :cond_8

    .line 155
    .line 156
    const/16 p2, 0x1f

    .line 157
    .line 158
    invoke-virtual {p1, p3, p2}, Lm1/c;->e(II)I

    .line 159
    .line 160
    .line 161
    move-result p2

    .line 162
    iput p2, p1, Lm1/c;->d:I

    .line 163
    .line 164
    if-ltz p2, :cond_7

    .line 165
    .line 166
    iget p3, p1, Lm1/c;->c:I

    .line 167
    .line 168
    if-gt p2, p3, :cond_7

    .line 169
    .line 170
    iget p3, p1, Lm1/c;->h:I

    .line 171
    .line 172
    if-ge p2, p3, :cond_0

    .line 173
    .line 174
    if-nez p2, :cond_6

    .line 175
    .line 176
    iget-object p2, p1, Lm1/c;->e:[Lm1/b;

    .line 177
    .line 178
    const/4 p3, 0x0

    .line 179
    invoke-static {p2, p3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    iget-object p2, p1, Lm1/c;->e:[Lm1/b;

    .line 183
    .line 184
    array-length p2, p2

    .line 185
    add-int/lit8 p2, p2, -0x1

    .line 186
    .line 187
    iput p2, p1, Lm1/c;->f:I

    .line 188
    .line 189
    const/4 p2, 0x0

    .line 190
    iput p2, p1, Lm1/c;->g:I

    .line 191
    .line 192
    iput p2, p1, Lm1/c;->h:I

    .line 193
    .line 194
    goto/16 :goto_0

    .line 195
    .line 196
    :cond_6
    sub-int/2addr p3, p2

    .line 197
    invoke-virtual {p1, p3}, Lm1/c;->a(I)I

    .line 198
    .line 199
    .line 200
    goto/16 :goto_0

    .line 201
    .line 202
    :cond_7
    new-instance p2, Ljava/io/IOException;

    .line 203
    .line 204
    new-instance p3, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    const-string p4, "Invalid dynamic table size update "

    .line 207
    .line 208
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    iget p1, p1, Lm1/c;->d:I

    .line 212
    .line 213
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    throw p2

    .line 224
    :cond_8
    const/16 p2, 0x10

    .line 225
    .line 226
    if-eq p3, p2, :cond_a

    .line 227
    .line 228
    if-nez p3, :cond_9

    .line 229
    .line 230
    goto :goto_1

    .line 231
    :cond_9
    const/16 p2, 0xf

    .line 232
    .line 233
    invoke-virtual {p1, p3, p2}, Lm1/c;->e(II)I

    .line 234
    .line 235
    .line 236
    move-result p2

    .line 237
    add-int/lit8 p2, p2, -0x1

    .line 238
    .line 239
    invoke-virtual {p1, p2}, Lm1/c;->b(I)Lr1/h;

    .line 240
    .line 241
    .line 242
    move-result-object p2

    .line 243
    invoke-virtual {p1}, Lm1/c;->d()Lr1/h;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    new-instance p3, Lm1/b;

    .line 248
    .line 249
    invoke-direct {p3, p2, p1}, Lm1/b;-><init>(Lr1/h;Lr1/h;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    goto/16 :goto_0

    .line 256
    .line 257
    :cond_a
    :goto_1
    invoke-virtual {p1}, Lm1/c;->d()Lr1/h;

    .line 258
    .line 259
    .line 260
    move-result-object p2

    .line 261
    invoke-static {p2}, Lm1/e;->a(Lr1/h;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p1}, Lm1/c;->d()Lr1/h;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    new-instance p3, Lm1/b;

    .line 269
    .line 270
    invoke-direct {p3, p2, p1}, Lm1/b;-><init>(Lr1/h;Lr1/h;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    goto/16 :goto_0

    .line 277
    .line 278
    :cond_b
    new-instance p1, Ljava/io/IOException;

    .line 279
    .line 280
    const-string p2, "index == 0"

    .line 281
    .line 282
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    throw p1

    .line 286
    :cond_c
    new-instance p1, Ljava/util/ArrayList;

    .line 287
    .line 288
    invoke-direct {p1, p4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {p4}, Ljava/util/ArrayList;->clear()V

    .line 292
    .line 293
    .line 294
    return-object p1
.end method

.method public final l(Lm1/q;IBI)V
    .locals 10

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    if-eqz p4, :cond_9

    .line 5
    .line 6
    and-int/lit8 v3, p3, 0x1

    .line 7
    .line 8
    if-eqz v3, :cond_0

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v3, 0x0

    .line 13
    :goto_0
    and-int/lit8 v4, p3, 0x8

    .line 14
    .line 15
    if-eqz v4, :cond_1

    .line 16
    .line 17
    iget-object v4, p0, Lm1/u;->a:Lr1/q;

    .line 18
    .line 19
    invoke-virtual {v4}, Lr1/q;->i()B

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    and-int/lit16 v4, v4, 0xff

    .line 24
    .line 25
    int-to-short v4, v4

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/4 v4, 0x0

    .line 28
    :goto_1
    and-int/lit8 v5, p3, 0x20

    .line 29
    .line 30
    if-eqz v5, :cond_2

    .line 31
    .line 32
    iget-object v5, p0, Lm1/u;->a:Lr1/q;

    .line 33
    .line 34
    invoke-virtual {v5}, Lr1/q;->l()I

    .line 35
    .line 36
    .line 37
    invoke-virtual {v5}, Lr1/q;->i()B

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    add-int/lit8 p2, p2, -0x5

    .line 44
    .line 45
    :cond_2
    invoke-static {p2, p3, v4}, Lm1/u;->f(IBS)I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    invoke-virtual {p0, p2, v4, p3, p4}, Lm1/u;->k(ISBI)Ljava/util/ArrayList;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    iget-object p2, p1, Lm1/q;->c:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p2, Lm1/s;

    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    if-eqz p4, :cond_3

    .line 61
    .line 62
    and-int/lit8 p2, p4, 0x1

    .line 63
    .line 64
    if-nez p2, :cond_3

    .line 65
    .line 66
    iget-object p1, p1, Lm1/q;->c:Ljava/lang/Object;

    .line 67
    .line 68
    move-object v5, p1

    .line 69
    check-cast v5, Lm1/s;

    .line 70
    .line 71
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    :try_start_0
    iget-object p1, v5, Lm1/s;->i:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 75
    .line 76
    new-instance p2, Lm1/k;

    .line 77
    .line 78
    iget-object p3, v5, Lm1/s;->d:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    new-array v6, v0, [Ljava/lang/Object;

    .line 85
    .line 86
    aput-object p3, v6, v2

    .line 87
    .line 88
    aput-object v4, v6, v1

    .line 89
    .line 90
    move-object v4, p2

    .line 91
    move v7, p4

    .line 92
    move-object v8, v9

    .line 93
    move v9, v3

    .line 94
    invoke-direct/range {v4 .. v9}, Lm1/k;-><init>(Lm1/s;[Ljava/lang/Object;ILjava/util/ArrayList;Z)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, p2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    .line 99
    .line 100
    goto/16 :goto_2

    .line 101
    .line 102
    :cond_3
    iget-object p2, p1, Lm1/q;->c:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p2, Lm1/s;

    .line 105
    .line 106
    monitor-enter p2

    .line 107
    :try_start_1
    iget-object p3, p1, Lm1/q;->c:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast p3, Lm1/s;

    .line 110
    .line 111
    invoke-virtual {p3, p4}, Lm1/s;->h(I)Lm1/y;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    if-nez p3, :cond_7

    .line 116
    .line 117
    iget-object p3, p1, Lm1/q;->c:Ljava/lang/Object;

    .line 118
    .line 119
    move-object v6, p3

    .line 120
    check-cast v6, Lm1/s;

    .line 121
    .line 122
    iget-boolean p3, v6, Lm1/s;->g:Z

    .line 123
    .line 124
    if-eqz p3, :cond_4

    .line 125
    .line 126
    monitor-exit p2

    .line 127
    goto :goto_2

    .line 128
    :catchall_0
    move-exception p1

    .line 129
    goto :goto_3

    .line 130
    :cond_4
    iget p3, v6, Lm1/s;->e:I

    .line 131
    .line 132
    if-gt p4, p3, :cond_5

    .line 133
    .line 134
    monitor-exit p2

    .line 135
    goto :goto_2

    .line 136
    :cond_5
    rem-int/lit8 p3, p4, 0x2

    .line 137
    .line 138
    iget v4, v6, Lm1/s;->f:I

    .line 139
    .line 140
    rem-int/2addr v4, v0

    .line 141
    if-ne p3, v4, :cond_6

    .line 142
    .line 143
    monitor-exit p2

    .line 144
    goto :goto_2

    .line 145
    :cond_6
    new-instance p3, Lm1/y;

    .line 146
    .line 147
    const/4 v7, 0x0

    .line 148
    move-object v4, p3

    .line 149
    move v5, p4

    .line 150
    move v8, v3

    .line 151
    invoke-direct/range {v4 .. v9}, Lm1/y;-><init>(ILm1/s;ZZLjava/util/ArrayList;)V

    .line 152
    .line 153
    .line 154
    iget-object v3, p1, Lm1/q;->c:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v3, Lm1/s;

    .line 157
    .line 158
    iput p4, v3, Lm1/s;->e:I

    .line 159
    .line 160
    iget-object v3, v3, Lm1/s;->c:Ljava/util/LinkedHashMap;

    .line 161
    .line 162
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-interface {v3, v4, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    sget-object v3, Lm1/s;->u:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 170
    .line 171
    new-instance v4, Lm1/q;

    .line 172
    .line 173
    iget-object v5, p1, Lm1/q;->c:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v5, Lm1/s;

    .line 176
    .line 177
    iget-object v5, v5, Lm1/s;->d:Ljava/lang/String;

    .line 178
    .line 179
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 180
    .line 181
    .line 182
    move-result-object p4

    .line 183
    new-array v0, v0, [Ljava/lang/Object;

    .line 184
    .line 185
    aput-object v5, v0, v2

    .line 186
    .line 187
    aput-object p4, v0, v1

    .line 188
    .line 189
    invoke-direct {v4, p1, v0, p3}, Lm1/q;-><init>(Lm1/q;[Ljava/lang/Object;Lm1/y;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v3, v4}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 193
    .line 194
    .line 195
    monitor-exit p2

    .line 196
    goto :goto_2

    .line 197
    :cond_7
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 198
    invoke-virtual {p3, v9}, Lm1/y;->i(Ljava/util/ArrayList;)V

    .line 199
    .line 200
    .line 201
    if-eqz v3, :cond_8

    .line 202
    .line 203
    invoke-virtual {p3}, Lm1/y;->h()V

    .line 204
    .line 205
    .line 206
    :catch_0
    :cond_8
    :goto_2
    return-void

    .line 207
    :goto_3
    :try_start_2
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 208
    throw p1

    .line 209
    :cond_9
    const-string p1, "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"

    .line 210
    .line 211
    new-array p2, v2, [Ljava/lang/Object;

    .line 212
    .line 213
    invoke-static {p1, p2}, Lm1/f;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    const/4 p1, 0x0

    .line 217
    throw p1
.end method

.method public final n(Lm1/q;IBI)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/16 v2, 0x8

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    if-ne p2, v2, :cond_3

    .line 7
    .line 8
    if-nez p4, :cond_2

    .line 9
    .line 10
    iget-object p2, p0, Lm1/u;->a:Lr1/q;

    .line 11
    .line 12
    invoke-virtual {p2}, Lr1/q;->l()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    iget-object p4, p0, Lm1/u;->a:Lr1/q;

    .line 17
    .line 18
    invoke-virtual {p4}, Lr1/q;->l()I

    .line 19
    .line 20
    .line 21
    move-result p4

    .line 22
    and-int/2addr p3, v0

    .line 23
    if-eqz p3, :cond_0

    .line 24
    .line 25
    const/4 p3, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p3, 0x0

    .line 28
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    if-eqz p3, :cond_1

    .line 32
    .line 33
    iget-object p2, p1, Lm1/q;->c:Ljava/lang/Object;

    .line 34
    .line 35
    move-object p3, p2

    .line 36
    check-cast p3, Lm1/s;

    .line 37
    .line 38
    monitor-enter p3

    .line 39
    :try_start_0
    iget-object p1, p1, Lm1/q;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lm1/s;

    .line 42
    .line 43
    iput-boolean v1, p1, Lm1/s;->k:Z

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 46
    .line 47
    .line 48
    monitor-exit p3

    .line 49
    goto :goto_1

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    throw p1

    .line 53
    :cond_1
    :try_start_1
    iget-object p1, p1, Lm1/q;->c:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Lm1/s;

    .line 56
    .line 57
    iget-object p3, p1, Lm1/s;->h:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 58
    .line 59
    new-instance v1, Lm1/p;

    .line 60
    .line 61
    invoke-direct {v1, p1, v0, p2, p4}, Lm1/p;-><init>(Lm1/s;ZII)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p3, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    .line 65
    .line 66
    .line 67
    :catch_0
    :goto_1
    return-void

    .line 68
    :cond_2
    const-string p1, "TYPE_PING streamId != 0"

    .line 69
    .line 70
    new-array p2, v1, [Ljava/lang/Object;

    .line 71
    .line 72
    invoke-static {p1, p2}, Lm1/f;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    throw v3

    .line 76
    :cond_3
    const-string p1, "TYPE_PING length != 8: %s"

    .line 77
    .line 78
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    new-array p3, v0, [Ljava/lang/Object;

    .line 83
    .line 84
    aput-object p2, p3, v1

    .line 85
    .line 86
    invoke-static {p1, p3}, Lm1/f;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    throw v3
.end method

.method public final o(Lm1/q;IBI)V
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p4, :cond_2

    .line 4
    .line 5
    and-int/lit8 v2, p3, 0x8

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-object v2, p0, Lm1/u;->a:Lr1/q;

    .line 10
    .line 11
    invoke-virtual {v2}, Lr1/q;->i()B

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    and-int/lit16 v2, v2, 0xff

    .line 16
    .line 17
    int-to-short v2, v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v2, 0x0

    .line 20
    :goto_0
    iget-object v3, p0, Lm1/u;->a:Lr1/q;

    .line 21
    .line 22
    invoke-virtual {v3}, Lr1/q;->l()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const v4, 0x7fffffff

    .line 27
    .line 28
    .line 29
    and-int/2addr v3, v4

    .line 30
    add-int/lit8 p2, p2, -0x4

    .line 31
    .line 32
    invoke-static {p2, p3, v2}, Lm1/u;->f(IBS)I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    invoke-virtual {p0, p2, v2, p3, p4}, Lm1/u;->k(ISBI)Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    iget-object p1, p1, Lm1/q;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Lm1/s;

    .line 43
    .line 44
    monitor-enter p1

    .line 45
    :try_start_0
    iget-object p3, p1, Lm1/s;->t:Ljava/util/LinkedHashSet;

    .line 46
    .line 47
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object p4

    .line 51
    invoke-interface {p3, p4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p3

    .line 55
    if-eqz p3, :cond_1

    .line 56
    .line 57
    invoke-virtual {p1, v3, v0}, Lm1/s;->m(II)V

    .line 58
    .line 59
    .line 60
    monitor-exit p1

    .line 61
    goto :goto_1

    .line 62
    :catchall_0
    move-exception p2

    .line 63
    goto :goto_2

    .line 64
    :cond_1
    iget-object p3, p1, Lm1/s;->t:Ljava/util/LinkedHashSet;

    .line 65
    .line 66
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object p4

    .line 70
    invoke-interface {p3, p4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    :try_start_1
    iget-object p3, p1, Lm1/s;->i:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 75
    .line 76
    new-instance p4, Lm1/k;

    .line 77
    .line 78
    iget-object v2, p1, Lm1/s;->d:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    new-array v0, v0, [Ljava/lang/Object;

    .line 85
    .line 86
    aput-object v2, v0, v1

    .line 87
    .line 88
    const/4 v1, 0x1

    .line 89
    aput-object v4, v0, v1

    .line 90
    .line 91
    invoke-direct {p4, p1, v0, v3, p2}, Lm1/k;-><init>(Lm1/s;[Ljava/lang/Object;ILjava/util/ArrayList;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p3, p4}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    .line 95
    .line 96
    .line 97
    :catch_0
    :goto_1
    return-void

    .line 98
    :goto_2
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 99
    throw p2

    .line 100
    :cond_2
    const-string p1, "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"

    .line 101
    .line 102
    new-array p2, v1, [Ljava/lang/Object;

    .line 103
    .line 104
    invoke-static {p1, p2}, Lm1/f;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    const/4 p1, 0x0

    .line 108
    throw p1
.end method

.method public final p(Lm1/q;IBI)V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    if-nez p4, :cond_15

    .line 5
    .line 6
    and-int/2addr p3, v0

    .line 7
    if-eqz p3, :cond_1

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string p1, "FRAME_SIZE_ERROR ack frame should be empty!"

    .line 16
    .line 17
    new-array p2, v1, [Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {p1, p2}, Lm1/f;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    throw v2

    .line 23
    :cond_1
    rem-int/lit8 p3, p2, 0x6

    .line 24
    .line 25
    if-nez p3, :cond_14

    .line 26
    .line 27
    new-instance p3, LK/j;

    .line 28
    .line 29
    invoke-direct {p3}, LK/j;-><init>()V

    .line 30
    .line 31
    .line 32
    const/4 p4, 0x0

    .line 33
    :goto_0
    if-ge p4, p2, :cond_a

    .line 34
    .line 35
    iget-object v3, p0, Lm1/u;->a:Lr1/q;

    .line 36
    .line 37
    invoke-virtual {v3}, Lr1/q;->m()S

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    const v4, 0xffff

    .line 42
    .line 43
    .line 44
    and-int/2addr v3, v4

    .line 45
    iget-object v4, p0, Lm1/u;->a:Lr1/q;

    .line 46
    .line 47
    invoke-virtual {v4}, Lr1/q;->l()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    const/4 v5, 0x2

    .line 52
    if-eq v3, v5, :cond_7

    .line 53
    .line 54
    const/4 v5, 0x3

    .line 55
    const/4 v6, 0x4

    .line 56
    if-eq v3, v5, :cond_6

    .line 57
    .line 58
    if-eq v3, v6, :cond_4

    .line 59
    .line 60
    const/4 v5, 0x5

    .line 61
    if-eq v3, v5, :cond_2

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    const/16 v5, 0x4000

    .line 65
    .line 66
    if-lt v4, v5, :cond_3

    .line 67
    .line 68
    const v5, 0xffffff

    .line 69
    .line 70
    .line 71
    if-gt v4, v5, :cond_3

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    const-string p1, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"

    .line 75
    .line 76
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    new-array p3, v0, [Ljava/lang/Object;

    .line 81
    .line 82
    aput-object p2, p3, v1

    .line 83
    .line 84
    invoke-static {p1, p3}, Lm1/f;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    throw v2

    .line 88
    :cond_4
    if-ltz v4, :cond_5

    .line 89
    .line 90
    const/4 v3, 0x7

    .line 91
    goto :goto_1

    .line 92
    :cond_5
    const-string p1, "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"

    .line 93
    .line 94
    new-array p2, v1, [Ljava/lang/Object;

    .line 95
    .line 96
    invoke-static {p1, p2}, Lm1/f;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    throw v2

    .line 100
    :cond_6
    const/4 v3, 0x4

    .line 101
    goto :goto_1

    .line 102
    :cond_7
    if-eqz v4, :cond_9

    .line 103
    .line 104
    if-ne v4, v0, :cond_8

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_8
    const-string p1, "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"

    .line 108
    .line 109
    new-array p2, v1, [Ljava/lang/Object;

    .line 110
    .line 111
    invoke-static {p1, p2}, Lm1/f;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    throw v2

    .line 115
    :cond_9
    :goto_1
    invoke-virtual {p3, v3, v4}, LK/j;->d(II)V

    .line 116
    .line 117
    .line 118
    add-int/lit8 p4, p4, 0x6

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_a
    iget-object p2, p1, Lm1/q;->c:Ljava/lang/Object;

    .line 122
    .line 123
    move-object p4, p2

    .line 124
    check-cast p4, Lm1/s;

    .line 125
    .line 126
    monitor-enter p4

    .line 127
    :try_start_0
    iget-object p2, p1, Lm1/q;->c:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast p2, Lm1/s;

    .line 130
    .line 131
    iget-object p2, p2, Lm1/s;->o:LK/j;

    .line 132
    .line 133
    invoke-virtual {p2}, LK/j;->b()I

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    iget-object v3, p1, Lm1/q;->c:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v3, Lm1/s;

    .line 140
    .line 141
    iget-object v3, v3, Lm1/s;->o:LK/j;

    .line 142
    .line 143
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    const/4 v4, 0x0

    .line 147
    :goto_2
    const/16 v5, 0xa

    .line 148
    .line 149
    if-ge v4, v5, :cond_d

    .line 150
    .line 151
    shl-int v5, v0, v4

    .line 152
    .line 153
    iget v6, p3, LK/j;->f:I

    .line 154
    .line 155
    and-int/2addr v5, v6

    .line 156
    if-eqz v5, :cond_b

    .line 157
    .line 158
    const/4 v5, 0x1

    .line 159
    goto :goto_3

    .line 160
    :cond_b
    const/4 v5, 0x0

    .line 161
    :goto_3
    if-nez v5, :cond_c

    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_c
    iget-object v5, p3, LK/j;->g:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v5, [I

    .line 167
    .line 168
    aget v5, v5, v4

    .line 169
    .line 170
    invoke-virtual {v3, v4, v5}, LK/j;->d(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 171
    .line 172
    .line 173
    :goto_4
    add-int/2addr v4, v0

    .line 174
    goto :goto_2

    .line 175
    :cond_d
    :try_start_1
    iget-object v3, p1, Lm1/q;->c:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v3, Lm1/s;

    .line 178
    .line 179
    iget-object v4, v3, Lm1/s;->h:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 180
    .line 181
    new-instance v5, Lm1/q;

    .line 182
    .line 183
    iget-object v3, v3, Lm1/s;->d:Ljava/lang/String;

    .line 184
    .line 185
    new-array v6, v0, [Ljava/lang/Object;

    .line 186
    .line 187
    aput-object v3, v6, v1

    .line 188
    .line 189
    invoke-direct {v5, p1, v6, p3}, Lm1/q;-><init>(Lm1/q;[Ljava/lang/Object;LK/j;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v4, v5}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 193
    .line 194
    .line 195
    :catch_0
    :try_start_2
    iget-object p3, p1, Lm1/q;->c:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast p3, Lm1/s;

    .line 198
    .line 199
    iget-object p3, p3, Lm1/s;->o:LK/j;

    .line 200
    .line 201
    invoke-virtual {p3}, LK/j;->b()I

    .line 202
    .line 203
    .line 204
    move-result p3

    .line 205
    const/4 v3, -0x1

    .line 206
    const-wide/16 v4, 0x0

    .line 207
    .line 208
    if-eq p3, v3, :cond_10

    .line 209
    .line 210
    if-eq p3, p2, :cond_10

    .line 211
    .line 212
    sub-int/2addr p3, p2

    .line 213
    int-to-long p2, p3

    .line 214
    iget-object v3, p1, Lm1/q;->c:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v3, Lm1/s;

    .line 217
    .line 218
    iget-boolean v6, v3, Lm1/s;->p:Z

    .line 219
    .line 220
    if-nez v6, :cond_f

    .line 221
    .line 222
    iget-wide v6, v3, Lm1/s;->m:J

    .line 223
    .line 224
    add-long/2addr v6, p2

    .line 225
    iput-wide v6, v3, Lm1/s;->m:J

    .line 226
    .line 227
    cmp-long v6, p2, v4

    .line 228
    .line 229
    if-lez v6, :cond_e

    .line 230
    .line 231
    invoke-virtual {v3}, Ljava/lang/Object;->notifyAll()V

    .line 232
    .line 233
    .line 234
    :cond_e
    iget-object v3, p1, Lm1/q;->c:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v3, Lm1/s;

    .line 237
    .line 238
    iput-boolean v0, v3, Lm1/s;->p:Z

    .line 239
    .line 240
    goto :goto_5

    .line 241
    :catchall_0
    move-exception p1

    .line 242
    goto :goto_8

    .line 243
    :cond_f
    :goto_5
    iget-object v3, p1, Lm1/q;->c:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v3, Lm1/s;

    .line 246
    .line 247
    iget-object v3, v3, Lm1/s;->c:Ljava/util/LinkedHashMap;

    .line 248
    .line 249
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    if-nez v3, :cond_11

    .line 254
    .line 255
    iget-object v2, p1, Lm1/q;->c:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v2, Lm1/s;

    .line 258
    .line 259
    iget-object v2, v2, Lm1/s;->c:Ljava/util/LinkedHashMap;

    .line 260
    .line 261
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    iget-object v3, p1, Lm1/q;->c:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v3, Lm1/s;

    .line 268
    .line 269
    iget-object v3, v3, Lm1/s;->c:Ljava/util/LinkedHashMap;

    .line 270
    .line 271
    invoke-interface {v3}, Ljava/util/Map;->size()I

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    new-array v3, v3, [Lm1/y;

    .line 276
    .line 277
    invoke-interface {v2, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    check-cast v2, [Lm1/y;

    .line 282
    .line 283
    goto :goto_6

    .line 284
    :cond_10
    move-wide p2, v4

    .line 285
    :cond_11
    :goto_6
    sget-object v3, Lm1/s;->u:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 286
    .line 287
    new-instance v6, Lm1/r;

    .line 288
    .line 289
    iget-object v7, p1, Lm1/q;->c:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v7, Lm1/s;

    .line 292
    .line 293
    iget-object v7, v7, Lm1/s;->d:Ljava/lang/String;

    .line 294
    .line 295
    new-array v8, v0, [Ljava/lang/Object;

    .line 296
    .line 297
    aput-object v7, v8, v1

    .line 298
    .line 299
    invoke-direct {v6, p1, v8}, Lm1/r;-><init>(Lm1/q;[Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v3, v6}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 303
    .line 304
    .line 305
    monitor-exit p4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 306
    if-eqz v2, :cond_13

    .line 307
    .line 308
    cmp-long p1, p2, v4

    .line 309
    .line 310
    if-eqz p1, :cond_13

    .line 311
    .line 312
    array-length p4, v2

    .line 313
    :goto_7
    if-ge v1, p4, :cond_13

    .line 314
    .line 315
    aget-object v3, v2, v1

    .line 316
    .line 317
    monitor-enter v3

    .line 318
    :try_start_3
    iget-wide v4, v3, Lm1/y;->b:J

    .line 319
    .line 320
    add-long/2addr v4, p2

    .line 321
    iput-wide v4, v3, Lm1/y;->b:J

    .line 322
    .line 323
    if-lez p1, :cond_12

    .line 324
    .line 325
    invoke-virtual {v3}, Ljava/lang/Object;->notifyAll()V

    .line 326
    .line 327
    .line 328
    :cond_12
    monitor-exit v3

    .line 329
    add-int/2addr v1, v0

    .line 330
    goto :goto_7

    .line 331
    :catchall_1
    move-exception p1

    .line 332
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 333
    throw p1

    .line 334
    :cond_13
    return-void

    .line 335
    :goto_8
    :try_start_4
    monitor-exit p4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 336
    throw p1

    .line 337
    :cond_14
    const-string p1, "TYPE_SETTINGS length %% 6 != 0: %s"

    .line 338
    .line 339
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 340
    .line 341
    .line 342
    move-result-object p2

    .line 343
    new-array p3, v0, [Ljava/lang/Object;

    .line 344
    .line 345
    aput-object p2, p3, v1

    .line 346
    .line 347
    invoke-static {p1, p3}, Lm1/f;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    throw v2

    .line 351
    :cond_15
    const-string p1, "TYPE_SETTINGS streamId != 0"

    .line 352
    .line 353
    new-array p2, v1, [Ljava/lang/Object;

    .line 354
    .line 355
    invoke-static {p1, p2}, Lm1/f;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    throw v2
.end method
