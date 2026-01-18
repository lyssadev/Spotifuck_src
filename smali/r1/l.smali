.class public final Lr1/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr1/v;


# instance fields
.field public a:I

.field public final b:Lr1/q;

.field public final c:Ljava/util/zip/Inflater;

.field public final d:Lr1/m;

.field public final e:Ljava/util/zip/CRC32;


# direct methods
.method public constructor <init>(Lr1/v;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lr1/l;->a:I

    .line 6
    .line 7
    new-instance v0, Ljava/util/zip/CRC32;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lr1/l;->e:Ljava/util/zip/CRC32;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    new-instance v0, Ljava/util/zip/Inflater;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {v0, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lr1/l;->c:Ljava/util/zip/Inflater;

    .line 23
    .line 24
    sget-object v1, Lr1/o;->a:Ljava/util/logging/Logger;

    .line 25
    .line 26
    new-instance v1, Lr1/q;

    .line 27
    .line 28
    invoke-direct {v1, p1}, Lr1/q;-><init>(Lr1/v;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lr1/l;->b:Lr1/q;

    .line 32
    .line 33
    new-instance p1, Lr1/m;

    .line 34
    .line 35
    invoke-direct {p1, v1, v0}, Lr1/m;-><init>(Lr1/q;Ljava/util/zip/Inflater;)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lr1/l;->d:Lr1/m;

    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 42
    .line 43
    const-string v0, "source == null"

    .line 44
    .line 45
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1
.end method

.method public static f(Ljava/lang/String;II)V
    .locals 3

    .line 1
    if-ne p2, p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 5
    .line 6
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v1, 0x3

    .line 15
    new-array v1, v1, [Ljava/lang/Object;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    aput-object p0, v1, v2

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    aput-object p2, v1, p0

    .line 22
    .line 23
    const/4 p0, 0x2

    .line 24
    aput-object p1, v1, p0

    .line 25
    .line 26
    const-string p0, "%s: actual 0x%08x != expected 0x%08x"

    .line 27
    .line 28
    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0
.end method


# virtual methods
.method public final a()Lr1/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lr1/l;->b:Lr1/q;

    .line 2
    .line 3
    iget-object v0, v0, Lr1/q;->b:Lr1/v;

    .line 4
    .line 5
    invoke-interface {v0}, Lr1/v;->a()Lr1/x;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lr1/l;->d:Lr1/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr1/m;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e(Lr1/e;J)J
    .locals 26

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    const/4 v8, 0x3

    .line 6
    const/4 v9, 0x2

    .line 7
    const/4 v10, 0x1

    .line 8
    iget v0, v6, Lr1/l;->a:I

    .line 9
    .line 10
    iget-object v11, v6, Lr1/l;->e:Ljava/util/zip/CRC32;

    .line 11
    .line 12
    const v12, 0xff00

    .line 13
    .line 14
    .line 15
    const-wide/16 v13, -0x1

    .line 16
    .line 17
    iget-object v15, v6, Lr1/l;->b:Lr1/q;

    .line 18
    .line 19
    if-nez v0, :cond_c

    .line 20
    .line 21
    const-wide/16 v0, 0xa

    .line 22
    .line 23
    invoke-virtual {v15, v0, v1}, Lr1/q;->p(J)V

    .line 24
    .line 25
    .line 26
    iget-object v4, v15, Lr1/q;->a:Lr1/e;

    .line 27
    .line 28
    const-wide/16 v0, 0x3

    .line 29
    .line 30
    invoke-virtual {v4, v0, v1}, Lr1/e;->h(J)B

    .line 31
    .line 32
    .line 33
    move-result v21

    .line 34
    shr-int/lit8 v0, v21, 0x1

    .line 35
    .line 36
    and-int/2addr v0, v10

    .line 37
    if-ne v0, v10, :cond_0

    .line 38
    .line 39
    const/16 v22, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v0, 0x0

    .line 43
    const/16 v22, 0x0

    .line 44
    .line 45
    :goto_0
    if-eqz v22, :cond_1

    .line 46
    .line 47
    const-wide/16 v2, 0x0

    .line 48
    .line 49
    const-wide/16 v16, 0xa

    .line 50
    .line 51
    move-object/from16 v0, p0

    .line 52
    .line 53
    move-object v1, v4

    .line 54
    move-object/from16 v23, v4

    .line 55
    .line 56
    move-wide/from16 v4, v16

    .line 57
    .line 58
    invoke-virtual/range {v0 .. v5}, Lr1/l;->g(Lr1/e;JJ)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    move-object/from16 v23, v4

    .line 63
    .line 64
    :goto_1
    invoke-virtual {v15}, Lr1/q;->m()S

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    const-string v1, "ID1ID2"

    .line 69
    .line 70
    const/16 v2, 0x1f8b

    .line 71
    .line 72
    invoke-static {v1, v2, v0}, Lr1/l;->f(Ljava/lang/String;II)V

    .line 73
    .line 74
    .line 75
    const-wide/16 v0, 0x8

    .line 76
    .line 77
    invoke-virtual {v15, v0, v1}, Lr1/q;->q(J)V

    .line 78
    .line 79
    .line 80
    shr-int/lit8 v0, v21, 0x2

    .line 81
    .line 82
    and-int/2addr v0, v10

    .line 83
    const-wide/16 v4, 0x2

    .line 84
    .line 85
    if-ne v0, v10, :cond_4

    .line 86
    .line 87
    invoke-virtual {v15, v4, v5}, Lr1/q;->p(J)V

    .line 88
    .line 89
    .line 90
    if-eqz v22, :cond_2

    .line 91
    .line 92
    const-wide/16 v2, 0x0

    .line 93
    .line 94
    const-wide/16 v16, 0x2

    .line 95
    .line 96
    move-object/from16 v0, p0

    .line 97
    .line 98
    move-object/from16 v1, v23

    .line 99
    .line 100
    move-wide/from16 v4, v16

    .line 101
    .line 102
    invoke-virtual/range {v0 .. v5}, Lr1/l;->g(Lr1/e;JJ)V

    .line 103
    .line 104
    .line 105
    :cond_2
    invoke-virtual/range {v23 .. v23}, Lr1/e;->o()S

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    sget-object v1, Lr1/y;->a:Ljava/nio/charset/Charset;

    .line 110
    .line 111
    and-int v1, v0, v12

    .line 112
    .line 113
    ushr-int/lit8 v1, v1, 0x8

    .line 114
    .line 115
    and-int/lit16 v0, v0, 0xff

    .line 116
    .line 117
    shl-int/lit8 v0, v0, 0x8

    .line 118
    .line 119
    or-int/2addr v0, v1

    .line 120
    int-to-short v0, v0

    .line 121
    int-to-long v4, v0

    .line 122
    invoke-virtual {v15, v4, v5}, Lr1/q;->p(J)V

    .line 123
    .line 124
    .line 125
    if-eqz v22, :cond_3

    .line 126
    .line 127
    const-wide/16 v2, 0x0

    .line 128
    .line 129
    move-object/from16 v0, p0

    .line 130
    .line 131
    move-object/from16 v1, v23

    .line 132
    .line 133
    move-wide/from16 p2, v4

    .line 134
    .line 135
    invoke-virtual/range {v0 .. v5}, Lr1/l;->g(Lr1/e;JJ)V

    .line 136
    .line 137
    .line 138
    move-wide/from16 v0, p2

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_3
    move-wide v0, v4

    .line 142
    :goto_2
    invoke-virtual {v15, v0, v1}, Lr1/q;->q(J)V

    .line 143
    .line 144
    .line 145
    :cond_4
    shr-int/lit8 v0, v21, 0x3

    .line 146
    .line 147
    and-int/2addr v0, v10

    .line 148
    const-wide/16 v24, 0x1

    .line 149
    .line 150
    if-ne v0, v10, :cond_7

    .line 151
    .line 152
    const-wide v19, 0x7fffffffffffffffL

    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    const/16 v16, 0x0

    .line 158
    .line 159
    const-wide/16 v17, 0x0

    .line 160
    .line 161
    move-object v4, v15

    .line 162
    invoke-virtual/range {v15 .. v20}, Lr1/q;->g(BJJ)J

    .line 163
    .line 164
    .line 165
    move-result-wide v15

    .line 166
    cmp-long v0, v15, v13

    .line 167
    .line 168
    if-eqz v0, :cond_6

    .line 169
    .line 170
    if-eqz v22, :cond_5

    .line 171
    .line 172
    const-wide/16 v2, 0x0

    .line 173
    .line 174
    add-long v17, v15, v24

    .line 175
    .line 176
    move-object/from16 v0, p0

    .line 177
    .line 178
    move-object/from16 v1, v23

    .line 179
    .line 180
    move-object v8, v4

    .line 181
    move-wide/from16 v4, v17

    .line 182
    .line 183
    invoke-virtual/range {v0 .. v5}, Lr1/l;->g(Lr1/e;JJ)V

    .line 184
    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_5
    move-object v8, v4

    .line 188
    :goto_3
    add-long v0, v15, v24

    .line 189
    .line 190
    invoke-virtual {v8, v0, v1}, Lr1/q;->q(J)V

    .line 191
    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_6
    new-instance v0, Ljava/io/EOFException;

    .line 195
    .line 196
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 197
    .line 198
    .line 199
    throw v0

    .line 200
    :cond_7
    move-object v8, v15

    .line 201
    :goto_4
    shr-int/lit8 v0, v21, 0x4

    .line 202
    .line 203
    and-int/2addr v0, v10

    .line 204
    if-ne v0, v10, :cond_a

    .line 205
    .line 206
    const-wide v19, 0x7fffffffffffffffL

    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    const/16 v16, 0x0

    .line 212
    .line 213
    const-wide/16 v17, 0x0

    .line 214
    .line 215
    move-object v15, v8

    .line 216
    invoke-virtual/range {v15 .. v20}, Lr1/q;->g(BJJ)J

    .line 217
    .line 218
    .line 219
    move-result-wide v15

    .line 220
    cmp-long v0, v15, v13

    .line 221
    .line 222
    if-eqz v0, :cond_9

    .line 223
    .line 224
    if-eqz v22, :cond_8

    .line 225
    .line 226
    const-wide/16 v2, 0x0

    .line 227
    .line 228
    add-long v4, v15, v24

    .line 229
    .line 230
    move-object/from16 v0, p0

    .line 231
    .line 232
    move-object/from16 v1, v23

    .line 233
    .line 234
    invoke-virtual/range {v0 .. v5}, Lr1/l;->g(Lr1/e;JJ)V

    .line 235
    .line 236
    .line 237
    :cond_8
    add-long v0, v15, v24

    .line 238
    .line 239
    invoke-virtual {v8, v0, v1}, Lr1/q;->q(J)V

    .line 240
    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_9
    new-instance v0, Ljava/io/EOFException;

    .line 244
    .line 245
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 246
    .line 247
    .line 248
    throw v0

    .line 249
    :cond_a
    :goto_5
    if-eqz v22, :cond_b

    .line 250
    .line 251
    const-wide/16 v0, 0x2

    .line 252
    .line 253
    invoke-virtual {v8, v0, v1}, Lr1/q;->p(J)V

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v23 .. v23}, Lr1/e;->o()S

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    sget-object v1, Lr1/y;->a:Ljava/nio/charset/Charset;

    .line 261
    .line 262
    and-int v1, v0, v12

    .line 263
    .line 264
    ushr-int/lit8 v1, v1, 0x8

    .line 265
    .line 266
    and-int/lit16 v0, v0, 0xff

    .line 267
    .line 268
    shl-int/lit8 v0, v0, 0x8

    .line 269
    .line 270
    or-int/2addr v0, v1

    .line 271
    int-to-short v0, v0

    .line 272
    invoke-virtual {v11}, Ljava/util/zip/CRC32;->getValue()J

    .line 273
    .line 274
    .line 275
    move-result-wide v1

    .line 276
    long-to-int v2, v1

    .line 277
    int-to-short v1, v2

    .line 278
    const-string v2, "FHCRC"

    .line 279
    .line 280
    invoke-static {v2, v0, v1}, Lr1/l;->f(Ljava/lang/String;II)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v11}, Ljava/util/zip/CRC32;->reset()V

    .line 284
    .line 285
    .line 286
    :cond_b
    iput v10, v6, Lr1/l;->a:I

    .line 287
    .line 288
    goto :goto_6

    .line 289
    :cond_c
    move-object v8, v15

    .line 290
    :goto_6
    iget v0, v6, Lr1/l;->a:I

    .line 291
    .line 292
    if-ne v0, v10, :cond_e

    .line 293
    .line 294
    iget-wide v2, v7, Lr1/e;->b:J

    .line 295
    .line 296
    iget-object v0, v6, Lr1/l;->d:Lr1/m;

    .line 297
    .line 298
    const-wide/16 v4, 0x2000

    .line 299
    .line 300
    invoke-virtual {v0, v7, v4, v5}, Lr1/m;->e(Lr1/e;J)J

    .line 301
    .line 302
    .line 303
    move-result-wide v15

    .line 304
    cmp-long v0, v15, v13

    .line 305
    .line 306
    if-eqz v0, :cond_d

    .line 307
    .line 308
    move-object/from16 v0, p0

    .line 309
    .line 310
    move-object/from16 v1, p1

    .line 311
    .line 312
    move-wide v4, v15

    .line 313
    invoke-virtual/range {v0 .. v5}, Lr1/l;->g(Lr1/e;JJ)V

    .line 314
    .line 315
    .line 316
    return-wide v15

    .line 317
    :cond_d
    iput v9, v6, Lr1/l;->a:I

    .line 318
    .line 319
    :cond_e
    iget v0, v6, Lr1/l;->a:I

    .line 320
    .line 321
    if-ne v0, v9, :cond_10

    .line 322
    .line 323
    const-wide/16 v0, 0x4

    .line 324
    .line 325
    invoke-virtual {v8, v0, v1}, Lr1/q;->p(J)V

    .line 326
    .line 327
    .line 328
    iget-object v2, v8, Lr1/q;->a:Lr1/e;

    .line 329
    .line 330
    invoke-virtual {v2}, Lr1/e;->n()I

    .line 331
    .line 332
    .line 333
    move-result v3

    .line 334
    sget-object v4, Lr1/y;->a:Ljava/nio/charset/Charset;

    .line 335
    .line 336
    const/high16 v4, -0x1000000

    .line 337
    .line 338
    and-int v5, v3, v4

    .line 339
    .line 340
    ushr-int/lit8 v5, v5, 0x18

    .line 341
    .line 342
    const/high16 v7, 0xff0000

    .line 343
    .line 344
    and-int v9, v3, v7

    .line 345
    .line 346
    ushr-int/lit8 v9, v9, 0x8

    .line 347
    .line 348
    or-int/2addr v5, v9

    .line 349
    and-int v9, v3, v12

    .line 350
    .line 351
    shl-int/lit8 v9, v9, 0x8

    .line 352
    .line 353
    or-int/2addr v5, v9

    .line 354
    and-int/lit16 v3, v3, 0xff

    .line 355
    .line 356
    shl-int/lit8 v3, v3, 0x18

    .line 357
    .line 358
    or-int/2addr v3, v5

    .line 359
    invoke-virtual {v11}, Ljava/util/zip/CRC32;->getValue()J

    .line 360
    .line 361
    .line 362
    move-result-wide v9

    .line 363
    long-to-int v5, v9

    .line 364
    const-string v9, "CRC"

    .line 365
    .line 366
    invoke-static {v9, v3, v5}, Lr1/l;->f(Ljava/lang/String;II)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v8, v0, v1}, Lr1/q;->p(J)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v2}, Lr1/e;->n()I

    .line 373
    .line 374
    .line 375
    move-result v0

    .line 376
    and-int v1, v0, v4

    .line 377
    .line 378
    ushr-int/lit8 v1, v1, 0x18

    .line 379
    .line 380
    and-int v2, v0, v7

    .line 381
    .line 382
    ushr-int/lit8 v2, v2, 0x8

    .line 383
    .line 384
    or-int/2addr v1, v2

    .line 385
    and-int v2, v0, v12

    .line 386
    .line 387
    shl-int/lit8 v2, v2, 0x8

    .line 388
    .line 389
    or-int/2addr v1, v2

    .line 390
    and-int/lit16 v0, v0, 0xff

    .line 391
    .line 392
    shl-int/lit8 v0, v0, 0x18

    .line 393
    .line 394
    or-int/2addr v0, v1

    .line 395
    iget-object v1, v6, Lr1/l;->c:Ljava/util/zip/Inflater;

    .line 396
    .line 397
    invoke-virtual {v1}, Ljava/util/zip/Inflater;->getBytesWritten()J

    .line 398
    .line 399
    .line 400
    move-result-wide v1

    .line 401
    long-to-int v2, v1

    .line 402
    const-string v1, "ISIZE"

    .line 403
    .line 404
    invoke-static {v1, v0, v2}, Lr1/l;->f(Ljava/lang/String;II)V

    .line 405
    .line 406
    .line 407
    const/4 v0, 0x3

    .line 408
    iput v0, v6, Lr1/l;->a:I

    .line 409
    .line 410
    invoke-virtual {v8}, Lr1/q;->f()Z

    .line 411
    .line 412
    .line 413
    move-result v0

    .line 414
    if-eqz v0, :cond_f

    .line 415
    .line 416
    goto :goto_7

    .line 417
    :cond_f
    new-instance v0, Ljava/io/IOException;

    .line 418
    .line 419
    const-string v1, "gzip finished without exhausting source"

    .line 420
    .line 421
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    throw v0

    .line 425
    :cond_10
    :goto_7
    return-wide v13
.end method

.method public final g(Lr1/e;JJ)V
    .locals 5

    .line 1
    iget-object p1, p1, Lr1/e;->a:Lr1/r;

    .line 2
    .line 3
    :goto_0
    iget v0, p1, Lr1/r;->c:I

    .line 4
    .line 5
    iget v1, p1, Lr1/r;->b:I

    .line 6
    .line 7
    sub-int v2, v0, v1

    .line 8
    .line 9
    int-to-long v2, v2

    .line 10
    cmp-long v4, p2, v2

    .line 11
    .line 12
    if-ltz v4, :cond_0

    .line 13
    .line 14
    sub-int/2addr v0, v1

    .line 15
    int-to-long v0, v0

    .line 16
    sub-long/2addr p2, v0

    .line 17
    iget-object p1, p1, Lr1/r;->f:Lr1/r;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    :goto_1
    const-wide/16 v0, 0x0

    .line 21
    .line 22
    cmp-long v2, p4, v0

    .line 23
    .line 24
    if-lez v2, :cond_1

    .line 25
    .line 26
    iget v2, p1, Lr1/r;->b:I

    .line 27
    .line 28
    int-to-long v2, v2

    .line 29
    add-long/2addr v2, p2

    .line 30
    long-to-int p2, v2

    .line 31
    iget p3, p1, Lr1/r;->c:I

    .line 32
    .line 33
    sub-int/2addr p3, p2

    .line 34
    int-to-long v2, p3

    .line 35
    invoke-static {v2, v3, p4, p5}, Ljava/lang/Math;->min(JJ)J

    .line 36
    .line 37
    .line 38
    move-result-wide v2

    .line 39
    long-to-int p3, v2

    .line 40
    iget-object v2, p0, Lr1/l;->e:Ljava/util/zip/CRC32;

    .line 41
    .line 42
    iget-object v3, p1, Lr1/r;->a:[B

    .line 43
    .line 44
    invoke-virtual {v2, v3, p2, p3}, Ljava/util/zip/CRC32;->update([BII)V

    .line 45
    .line 46
    .line 47
    int-to-long p2, p3

    .line 48
    sub-long/2addr p4, p2

    .line 49
    iget-object p1, p1, Lr1/r;->f:Lr1/r;

    .line 50
    .line 51
    move-wide p2, v0

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    return-void
.end method
