.class public final Lk1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg1/v;


# instance fields
.field public final a:Lg1/x;

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lg1/x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk1/f;->a:Lg1/x;

    .line 5
    .line 6
    return-void
.end method

.method public static d(Lg1/C;Lg1/u;)Z
    .locals 2

    .line 1
    iget-object p0, p0, Lg1/C;->a:Lg1/A;

    .line 2
    .line 3
    iget-object p0, p0, Lg1/A;->a:Lg1/u;

    .line 4
    .line 5
    iget-object v0, p0, Lg1/u;->d:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p1, Lg1/u;->d:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget v0, p0, Lg1/u;->e:I

    .line 16
    .line 17
    iget v1, p1, Lg1/u;->e:I

    .line 18
    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    iget-object p0, p0, Lg1/u;->a:Ljava/lang/String;

    .line 22
    .line 23
    iget-object p1, p1, Lg1/u;->a:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 p0, 0x0

    .line 34
    :goto_0
    return p0
.end method


# virtual methods
.method public final a(Lk1/e;)Lg1/C;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget-object v0, v2, Lk1/e;->f:Lg1/A;

    .line 6
    .line 7
    iget-object v10, v2, Lk1/e;->g:Lg1/z;

    .line 8
    .line 9
    iget-object v11, v2, Lk1/e;->h:Lg1/b;

    .line 10
    .line 11
    new-instance v12, Lj1/f;

    .line 12
    .line 13
    iget-object v4, v1, Lk1/f;->a:Lg1/x;

    .line 14
    .line 15
    iget-object v5, v4, Lg1/x;->o:Lg1/n;

    .line 16
    .line 17
    iget-object v4, v0, Lg1/A;->a:Lg1/u;

    .line 18
    .line 19
    invoke-virtual {v1, v4}, Lk1/f;->b(Lg1/u;)Lg1/a;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    iget-object v9, v1, Lk1/f;->b:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v4, v12

    .line 26
    move-object v7, v10

    .line 27
    move-object v8, v11

    .line 28
    invoke-direct/range {v4 .. v9}, Lj1/f;-><init>(Lg1/n;Lg1/a;Lg1/z;Lg1/b;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    const/4 v14, 0x0

    .line 32
    move-object v4, v0

    .line 33
    move-object v5, v14

    .line 34
    const/4 v6, 0x0

    .line 35
    :goto_0
    const/4 v7, 0x1

    .line 36
    :try_start_0
    invoke-virtual {v2, v4, v12, v14, v14}, Lk1/e;->b(Lg1/A;Lj1/f;Lk1/b;Lj1/b;)Lg1/C;

    .line 37
    .line 38
    .line 39
    move-result-object v0
    :try_end_0
    .catch Lj1/c; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 40
    if-eqz v5, :cond_1

    .line 41
    .line 42
    invoke-virtual {v0}, Lg1/C;->h()Lg1/B;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v5}, Lg1/C;->h()Lg1/B;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    iput-object v14, v4, Lg1/B;->g:Lg1/E;

    .line 51
    .line 52
    invoke-virtual {v4}, Lg1/B;->a()Lg1/C;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    iget-object v5, v4, Lg1/C;->g:Lg1/E;

    .line 57
    .line 58
    if-nez v5, :cond_0

    .line 59
    .line 60
    iput-object v4, v0, Lg1/B;->j:Lg1/C;

    .line 61
    .line 62
    invoke-virtual {v0}, Lg1/B;->a()Lg1/C;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    goto :goto_1

    .line 67
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 68
    .line 69
    const-string v2, "priorResponse.body != null"

    .line 70
    .line 71
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v0

    .line 75
    :cond_1
    :goto_1
    iget-object v4, v12, Lj1/f;->c:Lg1/F;

    .line 76
    .line 77
    iget-object v5, v0, Lg1/C;->a:Lg1/A;

    .line 78
    .line 79
    iget-object v8, v5, Lg1/A;->b:Ljava/lang/String;

    .line 80
    .line 81
    const-string v9, "GET"

    .line 82
    .line 83
    iget-object v15, v1, Lk1/f;->a:Lg1/x;

    .line 84
    .line 85
    iget v13, v0, Lg1/C;->c:I

    .line 86
    .line 87
    const/16 v3, 0x133

    .line 88
    .line 89
    if-eq v13, v3, :cond_11

    .line 90
    .line 91
    const/16 v3, 0x134

    .line 92
    .line 93
    if-eq v13, v3, :cond_11

    .line 94
    .line 95
    const/16 v3, 0x191

    .line 96
    .line 97
    if-eq v13, v3, :cond_10

    .line 98
    .line 99
    iget-object v3, v0, Lg1/C;->j:Lg1/C;

    .line 100
    .line 101
    const v16, 0x7fffffff

    .line 102
    .line 103
    .line 104
    const/16 v14, 0x1f7

    .line 105
    .line 106
    if-eq v13, v14, :cond_c

    .line 107
    .line 108
    const/16 v14, 0x197

    .line 109
    .line 110
    if-eq v13, v14, :cond_9

    .line 111
    .line 112
    const/16 v4, 0x198

    .line 113
    .line 114
    if-eq v13, v4, :cond_3

    .line 115
    .line 116
    packed-switch v13, :pswitch_data_0

    .line 117
    .line 118
    .line 119
    :cond_2
    :goto_2
    const/4 v3, 0x0

    .line 120
    :goto_3
    const/4 v13, 0x0

    .line 121
    goto/16 :goto_c

    .line 122
    .line 123
    :cond_3
    iget-boolean v7, v15, Lg1/x;->s:Z

    .line 124
    .line 125
    if-nez v7, :cond_4

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_4
    if-eqz v3, :cond_5

    .line 129
    .line 130
    iget v3, v3, Lg1/C;->c:I

    .line 131
    .line 132
    if-ne v3, v4, :cond_5

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_5
    const-string v3, "Retry-After"

    .line 136
    .line 137
    invoke-virtual {v0, v3}, Lg1/C;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    if-nez v3, :cond_6

    .line 142
    .line 143
    const/16 v16, 0x0

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_6
    const-string v4, "\\d+"

    .line 147
    .line 148
    invoke-virtual {v3, v4}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    if-eqz v4, :cond_7

    .line 153
    .line 154
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 159
    .line 160
    .line 161
    move-result v16

    .line 162
    :cond_7
    :goto_4
    if-lez v16, :cond_8

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_8
    :goto_5
    move-object v3, v5

    .line 166
    goto :goto_3

    .line 167
    :cond_9
    if-eqz v4, :cond_a

    .line 168
    .line 169
    iget-object v3, v4, Lg1/F;->b:Ljava/net/Proxy;

    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_a
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    const/4 v3, 0x0

    .line 176
    :goto_6
    invoke-virtual {v3}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    sget-object v4, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 181
    .line 182
    if-ne v3, v4, :cond_b

    .line 183
    .line 184
    iget-object v3, v15, Lg1/x;->m:Lg1/b;

    .line 185
    .line 186
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_b
    new-instance v0, Ljava/net/ProtocolException;

    .line 191
    .line 192
    const-string v2, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    .line 193
    .line 194
    invoke-direct {v0, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw v0

    .line 198
    :cond_c
    if-eqz v3, :cond_d

    .line 199
    .line 200
    iget v3, v3, Lg1/C;->c:I

    .line 201
    .line 202
    if-ne v3, v14, :cond_d

    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_d
    const-string v3, "Retry-After"

    .line 206
    .line 207
    invoke-virtual {v0, v3}, Lg1/C;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    if-nez v3, :cond_e

    .line 212
    .line 213
    goto :goto_7

    .line 214
    :cond_e
    const-string v4, "\\d+"

    .line 215
    .line 216
    invoke-virtual {v3, v4}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    if-eqz v4, :cond_f

    .line 221
    .line 222
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 227
    .line 228
    .line 229
    move-result v16

    .line 230
    :cond_f
    :goto_7
    if-nez v16, :cond_2

    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_10
    iget-object v3, v15, Lg1/x;->n:Lg1/b;

    .line 234
    .line 235
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_11
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    if-nez v3, :cond_12

    .line 244
    .line 245
    const-string v3, "HEAD"

    .line 246
    .line 247
    invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    if-nez v3, :cond_12

    .line 252
    .line 253
    goto/16 :goto_2

    .line 254
    .line 255
    :cond_12
    :pswitch_0
    iget-boolean v3, v15, Lg1/x;->r:Z

    .line 256
    .line 257
    if-nez v3, :cond_13

    .line 258
    .line 259
    goto/16 :goto_2

    .line 260
    .line 261
    :cond_13
    const-string v3, "Location"

    .line 262
    .line 263
    invoke-virtual {v0, v3}, Lg1/C;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    if-nez v3, :cond_14

    .line 268
    .line 269
    goto/16 :goto_2

    .line 270
    .line 271
    :cond_14
    iget-object v4, v5, Lg1/A;->a:Lg1/u;

    .line 272
    .line 273
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    new-instance v13, Lg1/t;

    .line 277
    .line 278
    invoke-direct {v13}, Lg1/t;-><init>()V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v13, v4, v3}, Lg1/t;->b(Lg1/u;Ljava/lang/String;)I

    .line 282
    .line 283
    .line 284
    move-result v3

    .line 285
    if-ne v3, v7, :cond_15

    .line 286
    .line 287
    goto :goto_8

    .line 288
    :cond_15
    const/4 v13, 0x0

    .line 289
    :goto_8
    if-eqz v13, :cond_16

    .line 290
    .line 291
    invoke-virtual {v13}, Lg1/t;->a()Lg1/u;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    goto :goto_9

    .line 296
    :cond_16
    const/4 v3, 0x0

    .line 297
    :goto_9
    if-nez v3, :cond_17

    .line 298
    .line 299
    goto/16 :goto_2

    .line 300
    .line 301
    :cond_17
    iget-object v4, v5, Lg1/A;->a:Lg1/u;

    .line 302
    .line 303
    iget-object v4, v4, Lg1/u;->a:Ljava/lang/String;

    .line 304
    .line 305
    iget-object v7, v3, Lg1/u;->a:Ljava/lang/String;

    .line 306
    .line 307
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v4

    .line 311
    if-nez v4, :cond_18

    .line 312
    .line 313
    iget-boolean v4, v15, Lg1/x;->q:Z

    .line 314
    .line 315
    if-nez v4, :cond_18

    .line 316
    .line 317
    goto/16 :goto_2

    .line 318
    .line 319
    :cond_18
    invoke-virtual {v5}, Lg1/A;->a()LA/k;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    invoke-static {v8}, LT0/g;->H(Ljava/lang/String;)Z

    .line 324
    .line 325
    .line 326
    move-result v5

    .line 327
    if-eqz v5, :cond_1a

    .line 328
    .line 329
    const-string v5, "PROPFIND"

    .line 330
    .line 331
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v7

    .line 335
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result v5

    .line 339
    if-nez v5, :cond_19

    .line 340
    .line 341
    const/4 v5, 0x0

    .line 342
    invoke-virtual {v4, v9, v5}, LA/k;->n(Ljava/lang/String;LT0/g;)V

    .line 343
    .line 344
    .line 345
    const/4 v13, 0x0

    .line 346
    goto :goto_a

    .line 347
    :cond_19
    const/4 v13, 0x0

    .line 348
    invoke-virtual {v4, v8, v13}, LA/k;->n(Ljava/lang/String;LT0/g;)V

    .line 349
    .line 350
    .line 351
    :goto_a
    if-nez v7, :cond_1b

    .line 352
    .line 353
    const-string v5, "Transfer-Encoding"

    .line 354
    .line 355
    invoke-virtual {v4, v5}, LA/k;->r(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    const-string v5, "Content-Length"

    .line 359
    .line 360
    invoke-virtual {v4, v5}, LA/k;->r(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    const-string v5, "Content-Type"

    .line 364
    .line 365
    invoke-virtual {v4, v5}, LA/k;->r(Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    goto :goto_b

    .line 369
    :cond_1a
    const/4 v13, 0x0

    .line 370
    :cond_1b
    :goto_b
    invoke-static {v0, v3}, Lk1/f;->d(Lg1/C;Lg1/u;)Z

    .line 371
    .line 372
    .line 373
    move-result v5

    .line 374
    if-nez v5, :cond_1c

    .line 375
    .line 376
    const-string v5, "Authorization"

    .line 377
    .line 378
    invoke-virtual {v4, v5}, LA/k;->r(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    :cond_1c
    iput-object v3, v4, LA/k;->f:Ljava/lang/Object;

    .line 382
    .line 383
    invoke-virtual {v4}, LA/k;->b()Lg1/A;

    .line 384
    .line 385
    .line 386
    move-result-object v3

    .line 387
    :goto_c
    if-nez v3, :cond_1d

    .line 388
    .line 389
    invoke-virtual {v12}, Lj1/f;->f()V

    .line 390
    .line 391
    .line 392
    return-object v0

    .line 393
    :cond_1d
    iget-object v4, v0, Lg1/C;->g:Lg1/E;

    .line 394
    .line 395
    invoke-static {v4}, Lh1/c;->c(Ljava/io/Closeable;)V

    .line 396
    .line 397
    .line 398
    add-int/lit8 v14, v6, 0x1

    .line 399
    .line 400
    const/16 v4, 0x14

    .line 401
    .line 402
    if-gt v14, v4, :cond_20

    .line 403
    .line 404
    iget-object v4, v3, Lg1/A;->a:Lg1/u;

    .line 405
    .line 406
    invoke-static {v0, v4}, Lk1/f;->d(Lg1/C;Lg1/u;)Z

    .line 407
    .line 408
    .line 409
    move-result v4

    .line 410
    if-nez v4, :cond_1e

    .line 411
    .line 412
    invoke-virtual {v12}, Lj1/f;->f()V

    .line 413
    .line 414
    .line 415
    new-instance v12, Lj1/f;

    .line 416
    .line 417
    iget-object v4, v1, Lk1/f;->a:Lg1/x;

    .line 418
    .line 419
    iget-object v5, v4, Lg1/x;->o:Lg1/n;

    .line 420
    .line 421
    iget-object v4, v3, Lg1/A;->a:Lg1/u;

    .line 422
    .line 423
    invoke-virtual {v1, v4}, Lk1/f;->b(Lg1/u;)Lg1/a;

    .line 424
    .line 425
    .line 426
    move-result-object v6

    .line 427
    iget-object v9, v1, Lk1/f;->b:Ljava/lang/Object;

    .line 428
    .line 429
    move-object v4, v12

    .line 430
    move-object v7, v10

    .line 431
    move-object v8, v11

    .line 432
    invoke-direct/range {v4 .. v9}, Lj1/f;-><init>(Lg1/n;Lg1/a;Lg1/z;Lg1/b;Ljava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    goto :goto_d

    .line 436
    :cond_1e
    iget-object v4, v12, Lj1/f;->d:Lg1/n;

    .line 437
    .line 438
    monitor-enter v4

    .line 439
    :try_start_1
    iget-object v5, v12, Lj1/f;->l:Lk1/b;

    .line 440
    .line 441
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 442
    if-nez v5, :cond_1f

    .line 443
    .line 444
    :goto_d
    move-object v5, v0

    .line 445
    move-object v4, v3

    .line 446
    move v6, v14

    .line 447
    :goto_e
    const/4 v14, 0x0

    .line 448
    goto/16 :goto_0

    .line 449
    .line 450
    :cond_1f
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 451
    .line 452
    new-instance v3, Ljava/lang/StringBuilder;

    .line 453
    .line 454
    const-string v4, "Closing the body of "

    .line 455
    .line 456
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 460
    .line 461
    .line 462
    const-string v0, " didn\'t close its backing stream. Bad interceptor?"

    .line 463
    .line 464
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    throw v2

    .line 475
    :catchall_0
    move-exception v0

    .line 476
    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 477
    throw v0

    .line 478
    :cond_20
    invoke-virtual {v12}, Lj1/f;->f()V

    .line 479
    .line 480
    .line 481
    new-instance v0, Ljava/net/ProtocolException;

    .line 482
    .line 483
    const-string v2, "Too many follow-up requests: "

    .line 484
    .line 485
    invoke-static {v2, v14}, LQ0/E;->e(Ljava/lang/String;I)Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v2

    .line 489
    invoke-direct {v0, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 490
    .line 491
    .line 492
    throw v0

    .line 493
    :catchall_1
    move-exception v0

    .line 494
    const/4 v2, 0x0

    .line 495
    goto :goto_10

    .line 496
    :catch_0
    move-exception v0

    .line 497
    const/4 v13, 0x0

    .line 498
    move-object v3, v0

    .line 499
    :try_start_3
    nop

    .line 500
    instance-of v0, v3, Lm1/a;

    .line 501
    .line 502
    xor-int/2addr v0, v7

    .line 503
    invoke-virtual {v1, v3, v12, v0, v4}, Lk1/f;->c(Ljava/io/IOException;Lj1/f;ZLg1/A;)Z

    .line 504
    .line 505
    .line 506
    move-result v0

    .line 507
    if-eqz v0, :cond_21

    .line 508
    .line 509
    const/4 v7, 0x0

    .line 510
    goto :goto_f

    .line 511
    :cond_21
    throw v3

    .line 512
    :catch_1
    move-exception v0

    .line 513
    const/4 v13, 0x0

    .line 514
    move-object v3, v0

    .line 515
    iget-object v0, v3, Lj1/c;->a:Ljava/io/IOException;

    .line 516
    .line 517
    const/4 v7, 0x0

    .line 518
    invoke-virtual {v1, v0, v12, v7, v4}, Lk1/f;->c(Ljava/io/IOException;Lj1/f;ZLg1/A;)Z

    .line 519
    .line 520
    .line 521
    move-result v0

    .line 522
    if-eqz v0, :cond_22

    .line 523
    .line 524
    :goto_f
    goto :goto_e

    .line 525
    :cond_22
    iget-object v0, v3, Lj1/c;->a:Ljava/io/IOException;

    .line 526
    .line 527
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 528
    :goto_10
    invoke-virtual {v12, v2}, Lj1/f;->g(Ljava/io/IOException;)V

    .line 529
    .line 530
    .line 531
    invoke-virtual {v12}, Lj1/f;->f()V

    .line 532
    .line 533
    .line 534
    throw v0

    .line 535
    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lg1/u;)Lg1/a;
    .locals 12

    .line 1
    iget-object v0, p1, Lg1/u;->a:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "https"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lk1/f;->a:Lg1/x;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, v1, Lg1/x;->i:Ljavax/net/ssl/SSLSocketFactory;

    .line 14
    .line 15
    iget-object v2, v1, Lg1/x;->k:Lq1/c;

    .line 16
    .line 17
    iget-object v3, v1, Lg1/x;->l:Lg1/k;

    .line 18
    .line 19
    move-object v7, v0

    .line 20
    move-object v8, v2

    .line 21
    move-object v9, v3

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    move-object v7, v0

    .line 25
    move-object v8, v7

    .line 26
    move-object v9, v8

    .line 27
    :goto_0
    new-instance v0, Lg1/a;

    .line 28
    .line 29
    iget-object v5, v1, Lg1/x;->p:Lg1/b;

    .line 30
    .line 31
    sget-object v2, Lg1/x;->w:Ljava/util/List;

    .line 32
    .line 33
    sget-object v2, Lg1/x;->w:Ljava/util/List;

    .line 34
    .line 35
    iget-object v3, p1, Lg1/u;->d:Ljava/lang/String;

    .line 36
    .line 37
    iget v4, p1, Lg1/u;->e:I

    .line 38
    .line 39
    iget-object v6, v1, Lg1/x;->h:Ljavax/net/SocketFactory;

    .line 40
    .line 41
    iget-object v10, v1, Lg1/x;->m:Lg1/b;

    .line 42
    .line 43
    iget-object v11, v1, Lg1/x;->e:Ljava/net/ProxySelector;

    .line 44
    .line 45
    move-object v2, v0

    .line 46
    invoke-direct/range {v2 .. v11}, Lg1/a;-><init>(Ljava/lang/String;ILg1/b;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Lq1/c;Lg1/k;Lg1/b;Ljava/net/ProxySelector;)V

    .line 47
    .line 48
    .line 49
    return-object v0
.end method

.method public final c(Ljava/io/IOException;Lj1/f;ZLg1/A;)Z
    .locals 2

    .line 1
    invoke-virtual {p2, p1}, Lj1/f;->g(Ljava/io/IOException;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lk1/f;->a:Lg1/x;

    .line 5
    .line 6
    iget-boolean v0, v0, Lg1/x;->s:Z

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    if-eqz p3, :cond_1

    .line 13
    .line 14
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    :cond_1
    instance-of p4, p1, Ljava/net/ProtocolException;

    .line 18
    .line 19
    if-eqz p4, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    instance-of p4, p1, Ljava/io/InterruptedIOException;

    .line 23
    .line 24
    if-eqz p4, :cond_3

    .line 25
    .line 26
    instance-of p1, p1, Ljava/net/SocketTimeoutException;

    .line 27
    .line 28
    if-eqz p1, :cond_5

    .line 29
    .line 30
    if-nez p3, :cond_5

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_3
    instance-of p3, p1, Ljavax/net/ssl/SSLHandshakeException;

    .line 34
    .line 35
    if-eqz p3, :cond_4

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    instance-of p3, p3, Ljava/security/cert/CertificateException;

    .line 42
    .line 43
    if-eqz p3, :cond_4

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_4
    instance-of p1, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 47
    .line 48
    if-eqz p1, :cond_6

    .line 49
    .line 50
    :cond_5
    :goto_0
    return v1

    .line 51
    :cond_6
    :goto_1
    iget-object p1, p2, Lj1/f;->c:Lg1/F;

    .line 52
    .line 53
    if-nez p1, :cond_a

    .line 54
    .line 55
    iget-object p1, p2, Lj1/f;->b:LK/j;

    .line 56
    .line 57
    if-eqz p1, :cond_7

    .line 58
    .line 59
    iget p3, p1, LK/j;->f:I

    .line 60
    .line 61
    iget-object p1, p1, LK/j;->g:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-ge p3, p1, :cond_7

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_7
    iget-object p1, p2, Lj1/f;->g:Lj1/d;

    .line 73
    .line 74
    iget p2, p1, Lj1/d;->e:I

    .line 75
    .line 76
    iget-object p3, p1, Lj1/d;->d:Ljava/util/List;

    .line 77
    .line 78
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 79
    .line 80
    .line 81
    move-result p3

    .line 82
    if-ge p2, p3, :cond_8

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_8
    iget-object p1, p1, Lj1/d;->g:Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-nez p1, :cond_9

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_9
    return v1

    .line 95
    :cond_a
    :goto_2
    const/4 p1, 0x1

    .line 96
    return p1
.end method
