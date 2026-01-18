.class public final Lg1/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:I

.field public final f:Ljava/util/ArrayList;

.field public g:Ljava/util/ArrayList;

.field public h:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lg1/t;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lg1/t;->c:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    iput v1, p0, Lg1/t;->e:I

    .line 12
    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Lg1/t;->f:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a()Lg1/u;
    .locals 2

    .line 1
    iget-object v0, p0, Lg1/t;->a:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lg1/t;->d:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lg1/u;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lg1/u;-><init>(Lg1/t;)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const-string v1, "host == null"

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw v0

    .line 23
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v1, "scheme == null"

    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0
.end method

.method public final b(Lg1/u;Ljava/lang/String;)I
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v10, 0x0

    .line 12
    invoke-static {v9, v10, v2}, Lh1/c;->q(Ljava/lang/String;II)I

    .line 13
    .line 14
    .line 15
    move-result v8

    .line 16
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-static {v9, v8, v2}, Lh1/c;->r(Ljava/lang/String;II)I

    .line 21
    .line 22
    .line 23
    move-result v11

    .line 24
    sub-int v2, v11, v8

    .line 25
    .line 26
    const/4 v12, 0x2

    .line 27
    const/16 v13, 0x3a

    .line 28
    .line 29
    const/4 v14, -0x1

    .line 30
    if-ge v2, v12, :cond_1

    .line 31
    .line 32
    :cond_0
    :goto_0
    const/4 v2, -0x1

    .line 33
    goto :goto_3

    .line 34
    :cond_1
    invoke-virtual {v9, v8}, Ljava/lang/String;->charAt(I)C

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    const/16 v3, 0x5a

    .line 39
    .line 40
    const/16 v4, 0x41

    .line 41
    .line 42
    const/16 v5, 0x7a

    .line 43
    .line 44
    const/16 v6, 0x61

    .line 45
    .line 46
    if-lt v2, v6, :cond_2

    .line 47
    .line 48
    if-le v2, v5, :cond_3

    .line 49
    .line 50
    :cond_2
    if-lt v2, v4, :cond_0

    .line 51
    .line 52
    if-le v2, v3, :cond_3

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    add-int/lit8 v2, v8, 0x1

    .line 56
    .line 57
    :goto_1
    if-ge v2, v11, :cond_0

    .line 58
    .line 59
    invoke-virtual {v9, v2}, Ljava/lang/String;->charAt(I)C

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    if-lt v7, v6, :cond_4

    .line 64
    .line 65
    if-le v7, v5, :cond_8

    .line 66
    .line 67
    :cond_4
    if-lt v7, v4, :cond_5

    .line 68
    .line 69
    if-le v7, v3, :cond_8

    .line 70
    .line 71
    :cond_5
    const/16 v15, 0x30

    .line 72
    .line 73
    if-lt v7, v15, :cond_6

    .line 74
    .line 75
    const/16 v15, 0x39

    .line 76
    .line 77
    if-le v7, v15, :cond_8

    .line 78
    .line 79
    :cond_6
    const/16 v15, 0x2b

    .line 80
    .line 81
    if-eq v7, v15, :cond_8

    .line 82
    .line 83
    const/16 v15, 0x2d

    .line 84
    .line 85
    if-eq v7, v15, :cond_8

    .line 86
    .line 87
    const/16 v15, 0x2e

    .line 88
    .line 89
    if-ne v7, v15, :cond_7

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_7
    if-ne v7, v13, :cond_0

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_8
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :goto_3
    if-eq v2, v14, :cond_b

    .line 99
    .line 100
    const/4 v3, 0x1

    .line 101
    const-string v5, "https:"

    .line 102
    .line 103
    const/4 v6, 0x0

    .line 104
    const/4 v7, 0x6

    .line 105
    move-object/from16 v2, p2

    .line 106
    .line 107
    move v4, v8

    .line 108
    invoke-virtual/range {v2 .. v7}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_9

    .line 113
    .line 114
    const-string v2, "https"

    .line 115
    .line 116
    iput-object v2, v0, Lg1/t;->a:Ljava/lang/String;

    .line 117
    .line 118
    add-int/lit8 v8, v8, 0x6

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_9
    const/4 v3, 0x1

    .line 122
    const-string v5, "http:"

    .line 123
    .line 124
    const/4 v6, 0x0

    .line 125
    const/4 v7, 0x5

    .line 126
    move-object/from16 v2, p2

    .line 127
    .line 128
    move v4, v8

    .line 129
    invoke-virtual/range {v2 .. v7}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-eqz v2, :cond_a

    .line 134
    .line 135
    const-string v2, "http"

    .line 136
    .line 137
    iput-object v2, v0, Lg1/t;->a:Ljava/lang/String;

    .line 138
    .line 139
    add-int/lit8 v8, v8, 0x5

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_a
    const/4 v1, 0x3

    .line 143
    return v1

    .line 144
    :cond_b
    if-eqz v1, :cond_2f

    .line 145
    .line 146
    iget-object v2, v1, Lg1/u;->a:Ljava/lang/String;

    .line 147
    .line 148
    iput-object v2, v0, Lg1/t;->a:Ljava/lang/String;

    .line 149
    .line 150
    :goto_4
    move v2, v8

    .line 151
    const/4 v3, 0x0

    .line 152
    :goto_5
    const/16 v15, 0x2f

    .line 153
    .line 154
    const/16 v7, 0x5c

    .line 155
    .line 156
    if-ge v2, v11, :cond_d

    .line 157
    .line 158
    invoke-virtual {v9, v2}, Ljava/lang/String;->charAt(I)C

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    if-eq v4, v7, :cond_c

    .line 163
    .line 164
    if-ne v4, v15, :cond_d

    .line 165
    .line 166
    :cond_c
    add-int/lit8 v3, v3, 0x1

    .line 167
    .line 168
    add-int/lit8 v2, v2, 0x1

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_d
    iget-object v6, v0, Lg1/t;->f:Ljava/util/ArrayList;

    .line 172
    .line 173
    const/16 v16, 0x1

    .line 174
    .line 175
    const/16 v5, 0x3f

    .line 176
    .line 177
    const/16 v4, 0x23

    .line 178
    .line 179
    if-ge v3, v12, :cond_12

    .line 180
    .line 181
    if-eqz v1, :cond_12

    .line 182
    .line 183
    iget-object v2, v1, Lg1/u;->a:Ljava/lang/String;

    .line 184
    .line 185
    iget-object v12, v0, Lg1/t;->a:Ljava/lang/String;

    .line 186
    .line 187
    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    if-nez v2, :cond_e

    .line 192
    .line 193
    goto :goto_7

    .line 194
    :cond_e
    invoke-virtual/range {p1 .. p1}, Lg1/u;->f()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    iput-object v2, v0, Lg1/t;->b:Ljava/lang/String;

    .line 199
    .line 200
    invoke-virtual/range {p1 .. p1}, Lg1/u;->c()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    iput-object v2, v0, Lg1/t;->c:Ljava/lang/String;

    .line 205
    .line 206
    iget-object v2, v1, Lg1/u;->d:Ljava/lang/String;

    .line 207
    .line 208
    iput-object v2, v0, Lg1/t;->d:Ljava/lang/String;

    .line 209
    .line 210
    iget v2, v1, Lg1/u;->e:I

    .line 211
    .line 212
    iput v2, v0, Lg1/t;->e:I

    .line 213
    .line 214
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {p1 .. p1}, Lg1/u;->d()Ljava/util/ArrayList;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 222
    .line 223
    .line 224
    if-eq v8, v11, :cond_f

    .line 225
    .line 226
    invoke-virtual {v9, v8}, Ljava/lang/String;->charAt(I)C

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    if-ne v2, v4, :cond_11

    .line 231
    .line 232
    :cond_f
    invoke-virtual/range {p1 .. p1}, Lg1/u;->e()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v17

    .line 236
    if-eqz v17, :cond_10

    .line 237
    .line 238
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    .line 239
    .line 240
    .line 241
    move-result v19

    .line 242
    const/16 v21, 0x1

    .line 243
    .line 244
    const/16 v22, 0x0

    .line 245
    .line 246
    const/16 v18, 0x0

    .line 247
    .line 248
    const-string v20, " \"\'<>#"

    .line 249
    .line 250
    const/16 v23, 0x1

    .line 251
    .line 252
    const/16 v24, 0x1

    .line 253
    .line 254
    invoke-static/range {v17 .. v24}, Lg1/u;->a(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-static {v1}, Lg1/u;->k(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    goto :goto_6

    .line 263
    :cond_10
    const/4 v1, 0x0

    .line 264
    :goto_6
    iput-object v1, v0, Lg1/t;->g:Ljava/util/ArrayList;

    .line 265
    .line 266
    :cond_11
    move-object/from16 v20, v6

    .line 267
    .line 268
    goto/16 :goto_11

    .line 269
    .line 270
    :cond_12
    :goto_7
    add-int/2addr v8, v3

    .line 271
    move v2, v8

    .line 272
    const/4 v12, 0x0

    .line 273
    const/16 v17, 0x0

    .line 274
    .line 275
    :goto_8
    const-string v1, "@/\\?#"

    .line 276
    .line 277
    invoke-static {v9, v2, v11, v1}, Lh1/c;->h(Ljava/lang/String;IILjava/lang/String;)I

    .line 278
    .line 279
    .line 280
    move-result v8

    .line 281
    if-eq v8, v11, :cond_13

    .line 282
    .line 283
    invoke-virtual {v9, v8}, Ljava/lang/String;->charAt(I)C

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    goto :goto_9

    .line 288
    :cond_13
    const/4 v1, -0x1

    .line 289
    :goto_9
    if-eq v1, v14, :cond_18

    .line 290
    .line 291
    if-eq v1, v4, :cond_18

    .line 292
    .line 293
    if-eq v1, v15, :cond_18

    .line 294
    .line 295
    if-eq v1, v7, :cond_18

    .line 296
    .line 297
    if-eq v1, v5, :cond_18

    .line 298
    .line 299
    const/16 v3, 0x40

    .line 300
    .line 301
    if-eq v1, v3, :cond_14

    .line 302
    .line 303
    move-object/from16 v20, v6

    .line 304
    .line 305
    goto/16 :goto_b

    .line 306
    .line 307
    :cond_14
    const-string v3, "%40"

    .line 308
    .line 309
    if-nez v12, :cond_17

    .line 310
    .line 311
    invoke-static {v9, v2, v8, v13}, Lh1/c;->g(Ljava/lang/String;IIC)I

    .line 312
    .line 313
    .line 314
    move-result v1

    .line 315
    const/16 v18, 0x0

    .line 316
    .line 317
    const/16 v19, 0x0

    .line 318
    .line 319
    const-string v20, " \"\':;<=>@[]^`{}|/\\?#"

    .line 320
    .line 321
    const/16 v21, 0x1

    .line 322
    .line 323
    const/16 v22, 0x1

    .line 324
    .line 325
    move/from16 p1, v1

    .line 326
    .line 327
    move-object/from16 v1, p2

    .line 328
    .line 329
    move-object v15, v3

    .line 330
    move/from16 v3, p1

    .line 331
    .line 332
    move-object/from16 v4, v20

    .line 333
    .line 334
    move/from16 v5, v21

    .line 335
    .line 336
    move-object/from16 v20, v6

    .line 337
    .line 338
    move/from16 v6, v18

    .line 339
    .line 340
    move/from16 v7, v19

    .line 341
    .line 342
    move v14, v8

    .line 343
    move/from16 v8, v22

    .line 344
    .line 345
    invoke-static/range {v1 .. v8}, Lg1/u;->a(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    if-eqz v17, :cond_15

    .line 350
    .line 351
    new-instance v2, Ljava/lang/StringBuilder;

    .line 352
    .line 353
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 354
    .line 355
    .line 356
    iget-object v3, v0, Lg1/t;->b:Ljava/lang/String;

    .line 357
    .line 358
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    :cond_15
    iput-object v1, v0, Lg1/t;->b:Ljava/lang/String;

    .line 372
    .line 373
    move/from16 v1, p1

    .line 374
    .line 375
    if-eq v1, v14, :cond_16

    .line 376
    .line 377
    add-int/lit8 v2, v1, 0x1

    .line 378
    .line 379
    const/4 v6, 0x0

    .line 380
    const/4 v7, 0x0

    .line 381
    const-string v4, " \"\':;<=>@[]^`{}|/\\?#"

    .line 382
    .line 383
    const/4 v5, 0x1

    .line 384
    const/4 v8, 0x1

    .line 385
    move-object/from16 v1, p2

    .line 386
    .line 387
    move v3, v14

    .line 388
    invoke-static/range {v1 .. v8}, Lg1/u;->a(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v1

    .line 392
    iput-object v1, v0, Lg1/t;->c:Ljava/lang/String;

    .line 393
    .line 394
    const/4 v12, 0x1

    .line 395
    :cond_16
    const/16 v17, 0x1

    .line 396
    .line 397
    goto :goto_a

    .line 398
    :cond_17
    move-object v15, v3

    .line 399
    move-object/from16 v20, v6

    .line 400
    .line 401
    move v14, v8

    .line 402
    new-instance v8, Ljava/lang/StringBuilder;

    .line 403
    .line 404
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 405
    .line 406
    .line 407
    iget-object v1, v0, Lg1/t;->c:Ljava/lang/String;

    .line 408
    .line 409
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    const/4 v6, 0x0

    .line 416
    const/4 v7, 0x0

    .line 417
    const-string v4, " \"\':;<=>@[]^`{}|/\\?#"

    .line 418
    .line 419
    const/4 v5, 0x1

    .line 420
    const/4 v15, 0x1

    .line 421
    move-object/from16 v1, p2

    .line 422
    .line 423
    move v3, v14

    .line 424
    move-object v10, v8

    .line 425
    move v8, v15

    .line 426
    invoke-static/range {v1 .. v8}, Lg1/u;->a(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    iput-object v1, v0, Lg1/t;->c:Ljava/lang/String;

    .line 438
    .line 439
    :goto_a
    add-int/lit8 v2, v14, 0x1

    .line 440
    .line 441
    :goto_b
    move-object/from16 v6, v20

    .line 442
    .line 443
    const/16 v4, 0x23

    .line 444
    .line 445
    const/16 v5, 0x3f

    .line 446
    .line 447
    const/16 v7, 0x5c

    .line 448
    .line 449
    const/4 v10, 0x0

    .line 450
    const/4 v14, -0x1

    .line 451
    const/16 v15, 0x2f

    .line 452
    .line 453
    goto/16 :goto_8

    .line 454
    .line 455
    :cond_18
    move-object/from16 v20, v6

    .line 456
    .line 457
    move v14, v8

    .line 458
    move v8, v2

    .line 459
    :goto_c
    if-ge v8, v14, :cond_1b

    .line 460
    .line 461
    invoke-virtual {v9, v8}, Ljava/lang/String;->charAt(I)C

    .line 462
    .line 463
    .line 464
    move-result v1

    .line 465
    if-eq v1, v13, :cond_1c

    .line 466
    .line 467
    const/16 v3, 0x5b

    .line 468
    .line 469
    if-eq v1, v3, :cond_19

    .line 470
    .line 471
    goto :goto_d

    .line 472
    :cond_19
    add-int/lit8 v8, v8, 0x1

    .line 473
    .line 474
    if-ge v8, v14, :cond_1a

    .line 475
    .line 476
    invoke-virtual {v9, v8}, Ljava/lang/String;->charAt(I)C

    .line 477
    .line 478
    .line 479
    move-result v1

    .line 480
    const/16 v3, 0x5d

    .line 481
    .line 482
    if-ne v1, v3, :cond_19

    .line 483
    .line 484
    :cond_1a
    :goto_d
    add-int/lit8 v8, v8, 0x1

    .line 485
    .line 486
    goto :goto_c

    .line 487
    :cond_1b
    move v8, v14

    .line 488
    :cond_1c
    add-int/lit8 v3, v8, 0x1

    .line 489
    .line 490
    if-ge v3, v14, :cond_1f

    .line 491
    .line 492
    const/4 v1, 0x0

    .line 493
    invoke-static {v9, v2, v8, v1}, Lg1/u;->h(Ljava/lang/String;IIZ)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    invoke-static {v2}, Lh1/c;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    iput-object v1, v0, Lg1/t;->d:Ljava/lang/String;

    .line 502
    .line 503
    :try_start_0
    const-string v4, ""

    .line 504
    .line 505
    const/4 v8, 0x1

    .line 506
    const/4 v5, 0x0

    .line 507
    const/4 v6, 0x0

    .line 508
    const/4 v7, 0x0

    .line 509
    move-object/from16 v1, p2

    .line 510
    .line 511
    move v2, v3

    .line 512
    move v3, v14

    .line 513
    invoke-static/range {v1 .. v8}, Lg1/u;->a(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 518
    .line 519
    .line 520
    move-result v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 521
    if-lez v1, :cond_1d

    .line 522
    .line 523
    const v2, 0xffff

    .line 524
    .line 525
    .line 526
    if-gt v1, v2, :cond_1d

    .line 527
    .line 528
    goto :goto_f

    .line 529
    :cond_1d
    :goto_e
    const/4 v1, -0x1

    .line 530
    goto :goto_f

    .line 531
    :catch_0
    nop

    .line 532
    goto :goto_e

    .line 533
    :goto_f
    iput v1, v0, Lg1/t;->e:I

    .line 534
    .line 535
    const/4 v2, -0x1

    .line 536
    if-ne v1, v2, :cond_1e

    .line 537
    .line 538
    const/4 v1, 0x4

    .line 539
    return v1

    .line 540
    :cond_1e
    const/4 v10, 0x0

    .line 541
    goto :goto_10

    .line 542
    :cond_1f
    const/4 v10, 0x0

    .line 543
    invoke-static {v9, v2, v8, v10}, Lg1/u;->h(Ljava/lang/String;IIZ)Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v1

    .line 547
    invoke-static {v1}, Lh1/c;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v1

    .line 551
    iput-object v1, v0, Lg1/t;->d:Ljava/lang/String;

    .line 552
    .line 553
    iget-object v1, v0, Lg1/t;->a:Ljava/lang/String;

    .line 554
    .line 555
    invoke-static {v1}, Lg1/u;->b(Ljava/lang/String;)I

    .line 556
    .line 557
    .line 558
    move-result v1

    .line 559
    iput v1, v0, Lg1/t;->e:I

    .line 560
    .line 561
    :goto_10
    iget-object v1, v0, Lg1/t;->d:Ljava/lang/String;

    .line 562
    .line 563
    if-nez v1, :cond_20

    .line 564
    .line 565
    const/4 v1, 0x5

    .line 566
    return v1

    .line 567
    :cond_20
    move v8, v14

    .line 568
    :goto_11
    const-string v1, "?#"

    .line 569
    .line 570
    invoke-static {v9, v8, v11, v1}, Lh1/c;->h(Ljava/lang/String;IILjava/lang/String;)I

    .line 571
    .line 572
    .line 573
    move-result v12

    .line 574
    if-ne v8, v12, :cond_21

    .line 575
    .line 576
    goto/16 :goto_19

    .line 577
    .line 578
    :cond_21
    invoke-virtual {v9, v8}, Ljava/lang/String;->charAt(I)C

    .line 579
    .line 580
    .line 581
    move-result v1

    .line 582
    const-string v13, ""

    .line 583
    .line 584
    const/16 v2, 0x2f

    .line 585
    .line 586
    if-eq v1, v2, :cond_22

    .line 587
    .line 588
    const/16 v2, 0x5c

    .line 589
    .line 590
    if-ne v1, v2, :cond_23

    .line 591
    .line 592
    :cond_22
    move-object/from16 v14, v20

    .line 593
    .line 594
    goto :goto_12

    .line 595
    :cond_23
    invoke-virtual/range {v20 .. v20}, Ljava/util/ArrayList;->size()I

    .line 596
    .line 597
    .line 598
    move-result v1

    .line 599
    add-int/lit8 v1, v1, -0x1

    .line 600
    .line 601
    move-object/from16 v14, v20

    .line 602
    .line 603
    invoke-virtual {v14, v1, v13}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    goto :goto_13

    .line 607
    :goto_12
    invoke-virtual {v14}, Ljava/util/ArrayList;->clear()V

    .line 608
    .line 609
    .line 610
    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 611
    .line 612
    .line 613
    add-int/lit8 v8, v8, 0x1

    .line 614
    .line 615
    :goto_13
    move v2, v8

    .line 616
    :goto_14
    if-ge v2, v12, :cond_2c

    .line 617
    .line 618
    const-string v1, "/\\"

    .line 619
    .line 620
    invoke-static {v9, v2, v12, v1}, Lh1/c;->h(Ljava/lang/String;IILjava/lang/String;)I

    .line 621
    .line 622
    .line 623
    move-result v15

    .line 624
    if-ge v15, v12, :cond_24

    .line 625
    .line 626
    const/16 v17, 0x1

    .line 627
    .line 628
    goto :goto_15

    .line 629
    :cond_24
    const/16 v17, 0x0

    .line 630
    .line 631
    :goto_15
    const/4 v6, 0x0

    .line 632
    const/4 v7, 0x0

    .line 633
    const-string v4, " \"<>^`{}|/\\?#"

    .line 634
    .line 635
    const/4 v5, 0x1

    .line 636
    const/4 v8, 0x1

    .line 637
    move-object/from16 v1, p2

    .line 638
    .line 639
    move v3, v15

    .line 640
    invoke-static/range {v1 .. v8}, Lg1/u;->a(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    .line 641
    .line 642
    .line 643
    move-result-object v1

    .line 644
    const-string v2, "."

    .line 645
    .line 646
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 647
    .line 648
    .line 649
    move-result v2

    .line 650
    if-nez v2, :cond_2a

    .line 651
    .line 652
    const-string v2, "%2e"

    .line 653
    .line 654
    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 655
    .line 656
    .line 657
    move-result v2

    .line 658
    if-eqz v2, :cond_25

    .line 659
    .line 660
    goto :goto_18

    .line 661
    :cond_25
    const-string v2, ".."

    .line 662
    .line 663
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 664
    .line 665
    .line 666
    move-result v2

    .line 667
    if-nez v2, :cond_28

    .line 668
    .line 669
    const-string v2, "%2e."

    .line 670
    .line 671
    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 672
    .line 673
    .line 674
    move-result v2

    .line 675
    if-nez v2, :cond_28

    .line 676
    .line 677
    const-string v2, ".%2e"

    .line 678
    .line 679
    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 680
    .line 681
    .line 682
    move-result v2

    .line 683
    if-nez v2, :cond_28

    .line 684
    .line 685
    const-string v2, "%2e%2e"

    .line 686
    .line 687
    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 688
    .line 689
    .line 690
    move-result v2

    .line 691
    if-eqz v2, :cond_26

    .line 692
    .line 693
    goto :goto_17

    .line 694
    :cond_26
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 695
    .line 696
    .line 697
    move-result v2

    .line 698
    add-int/lit8 v2, v2, -0x1

    .line 699
    .line 700
    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 701
    .line 702
    .line 703
    move-result-object v2

    .line 704
    check-cast v2, Ljava/lang/String;

    .line 705
    .line 706
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 707
    .line 708
    .line 709
    move-result v2

    .line 710
    if-eqz v2, :cond_27

    .line 711
    .line 712
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 713
    .line 714
    .line 715
    move-result v2

    .line 716
    add-int/lit8 v2, v2, -0x1

    .line 717
    .line 718
    invoke-virtual {v14, v2, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    goto :goto_16

    .line 722
    :cond_27
    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 723
    .line 724
    .line 725
    :goto_16
    if-eqz v17, :cond_2a

    .line 726
    .line 727
    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 728
    .line 729
    .line 730
    goto :goto_18

    .line 731
    :cond_28
    :goto_17
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 732
    .line 733
    .line 734
    move-result v1

    .line 735
    add-int/lit8 v1, v1, -0x1

    .line 736
    .line 737
    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v1

    .line 741
    check-cast v1, Ljava/lang/String;

    .line 742
    .line 743
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 744
    .line 745
    .line 746
    move-result v1

    .line 747
    if-eqz v1, :cond_29

    .line 748
    .line 749
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 750
    .line 751
    .line 752
    move-result v1

    .line 753
    if-nez v1, :cond_29

    .line 754
    .line 755
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 756
    .line 757
    .line 758
    move-result v1

    .line 759
    add-int/lit8 v1, v1, -0x1

    .line 760
    .line 761
    invoke-virtual {v14, v1, v13}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    goto :goto_18

    .line 765
    :cond_29
    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 766
    .line 767
    .line 768
    :cond_2a
    :goto_18
    if-eqz v17, :cond_2b

    .line 769
    .line 770
    add-int/lit8 v15, v15, 0x1

    .line 771
    .line 772
    :cond_2b
    move v2, v15

    .line 773
    goto/16 :goto_14

    .line 774
    .line 775
    :cond_2c
    :goto_19
    if-ge v12, v11, :cond_2d

    .line 776
    .line 777
    invoke-virtual {v9, v12}, Ljava/lang/String;->charAt(I)C

    .line 778
    .line 779
    .line 780
    move-result v1

    .line 781
    const/16 v2, 0x3f

    .line 782
    .line 783
    if-ne v1, v2, :cond_2d

    .line 784
    .line 785
    const/16 v10, 0x23

    .line 786
    .line 787
    invoke-static {v9, v12, v11, v10}, Lh1/c;->g(Ljava/lang/String;IIC)I

    .line 788
    .line 789
    .line 790
    move-result v13

    .line 791
    add-int/lit8 v2, v12, 0x1

    .line 792
    .line 793
    const/4 v6, 0x0

    .line 794
    const/4 v7, 0x1

    .line 795
    const-string v4, " \"\'<>#"

    .line 796
    .line 797
    const/4 v5, 0x1

    .line 798
    const/4 v8, 0x1

    .line 799
    move-object/from16 v1, p2

    .line 800
    .line 801
    move v3, v13

    .line 802
    invoke-static/range {v1 .. v8}, Lg1/u;->a(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v1

    .line 806
    invoke-static {v1}, Lg1/u;->k(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 807
    .line 808
    .line 809
    move-result-object v1

    .line 810
    iput-object v1, v0, Lg1/t;->g:Ljava/util/ArrayList;

    .line 811
    .line 812
    move v12, v13

    .line 813
    goto :goto_1a

    .line 814
    :cond_2d
    const/16 v10, 0x23

    .line 815
    .line 816
    :goto_1a
    if-ge v12, v11, :cond_2e

    .line 817
    .line 818
    invoke-virtual {v9, v12}, Ljava/lang/String;->charAt(I)C

    .line 819
    .line 820
    .line 821
    move-result v1

    .line 822
    if-ne v1, v10, :cond_2e

    .line 823
    .line 824
    add-int/lit8 v2, v12, 0x1

    .line 825
    .line 826
    const/4 v6, 0x0

    .line 827
    const/4 v7, 0x0

    .line 828
    const-string v4, ""

    .line 829
    .line 830
    const/4 v5, 0x1

    .line 831
    const/4 v8, 0x0

    .line 832
    move-object/from16 v1, p2

    .line 833
    .line 834
    move v3, v11

    .line 835
    invoke-static/range {v1 .. v8}, Lg1/u;->a(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    .line 836
    .line 837
    .line 838
    move-result-object v1

    .line 839
    iput-object v1, v0, Lg1/t;->h:Ljava/lang/String;

    .line 840
    .line 841
    :cond_2e
    return v16

    .line 842
    :cond_2f
    return v12
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lg1/t;->a:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, "://"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lg1/t;->b:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/16 v2, 0x3a

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iget-object v1, p0, Lg1/t;->c:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_2

    .line 33
    .line 34
    :cond_0
    iget-object v1, p0, Lg1/t;->b:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Lg1/t;->c:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_1

    .line 46
    .line 47
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lg1/t;->c:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    :cond_1
    const/16 v1, 0x40

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    :cond_2
    iget-object v1, p0, Lg1/t;->d:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(I)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    const/4 v3, -0x1

    .line 67
    if-eq v1, v3, :cond_3

    .line 68
    .line 69
    const/16 v1, 0x5b

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    iget-object v1, p0, Lg1/t;->d:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const/16 v1, 0x5d

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_3
    iget-object v1, p0, Lg1/t;->d:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    :goto_0
    iget v1, p0, Lg1/t;->e:I

    .line 91
    .line 92
    if-eq v1, v3, :cond_4

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    iget-object v1, p0, Lg1/t;->a:Ljava/lang/String;

    .line 96
    .line 97
    invoke-static {v1}, Lg1/u;->b(Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    :goto_1
    iget-object v3, p0, Lg1/t;->a:Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {v3}, Lg1/u;->b(Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eq v1, v3, :cond_5

    .line 108
    .line 109
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    :cond_5
    iget-object v1, p0, Lg1/t;->f:Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    const/4 v3, 0x0

    .line 122
    :goto_2
    if-ge v3, v2, :cond_6

    .line 123
    .line 124
    const/16 v4, 0x2f

    .line 125
    .line 126
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    check-cast v4, Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    add-int/lit8 v3, v3, 0x1

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_6
    iget-object v1, p0, Lg1/t;->g:Ljava/util/ArrayList;

    .line 142
    .line 143
    if-eqz v1, :cond_7

    .line 144
    .line 145
    const/16 v1, 0x3f

    .line 146
    .line 147
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    iget-object v1, p0, Lg1/t;->g:Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-static {v0, v1}, Lg1/u;->g(Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 153
    .line 154
    .line 155
    :cond_7
    iget-object v1, p0, Lg1/t;->h:Ljava/lang/String;

    .line 156
    .line 157
    if-eqz v1, :cond_8

    .line 158
    .line 159
    const/16 v1, 0x23

    .line 160
    .line 161
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    iget-object v1, p0, Lg1/t;->h:Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    :cond_8
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    return-object v0
.end method
