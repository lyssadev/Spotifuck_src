.class public final LE/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final k:LE/s;


# instance fields
.field public final a:F

.field public final b:F

.field public final c:F

.field public final d:F

.field public final e:F

.field public final f:F

.field public final g:[F

.field public final h:F

.field public final i:F

.field public final j:F


# direct methods
.method static constructor <clinit>()V
    .locals 25

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x1

    .line 4
    const/4 v3, 0x0

    .line 5
    sget-object v4, LE/b;->c:[F

    .line 6
    .line 7
    invoke-static {}, LE/b;->o()F

    .line 8
    .line 9
    .line 10
    move-result v5

    .line 11
    float-to-double v5, v5

    .line 12
    const-wide v7, 0x404fd4bbab8b494cL    # 63.66197723675813

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    mul-double v5, v5, v7

    .line 18
    .line 19
    const-wide/high16 v7, 0x4059000000000000L    # 100.0

    .line 20
    .line 21
    div-double/2addr v5, v7

    .line 22
    double-to-float v5, v5

    .line 23
    sget-object v6, LE/b;->a:[[F

    .line 24
    .line 25
    aget v9, v4, v3

    .line 26
    .line 27
    aget-object v10, v6, v3

    .line 28
    .line 29
    aget v11, v10, v3

    .line 30
    .line 31
    mul-float v11, v11, v9

    .line 32
    .line 33
    aget v12, v4, v2

    .line 34
    .line 35
    aget v13, v10, v2

    .line 36
    .line 37
    mul-float v13, v13, v12

    .line 38
    .line 39
    add-float/2addr v13, v11

    .line 40
    aget v11, v4, v1

    .line 41
    .line 42
    aget v10, v10, v1

    .line 43
    .line 44
    mul-float v10, v10, v11

    .line 45
    .line 46
    add-float/2addr v10, v13

    .line 47
    aget-object v13, v6, v2

    .line 48
    .line 49
    aget v14, v13, v3

    .line 50
    .line 51
    mul-float v14, v14, v9

    .line 52
    .line 53
    aget v15, v13, v2

    .line 54
    .line 55
    mul-float v15, v15, v12

    .line 56
    .line 57
    add-float/2addr v15, v14

    .line 58
    aget v13, v13, v1

    .line 59
    .line 60
    mul-float v13, v13, v11

    .line 61
    .line 62
    add-float/2addr v13, v15

    .line 63
    aget-object v6, v6, v1

    .line 64
    .line 65
    aget v14, v6, v3

    .line 66
    .line 67
    mul-float v9, v9, v14

    .line 68
    .line 69
    aget v14, v6, v2

    .line 70
    .line 71
    mul-float v12, v12, v14

    .line 72
    .line 73
    add-float/2addr v12, v9

    .line 74
    aget v6, v6, v1

    .line 75
    .line 76
    mul-float v11, v11, v6

    .line 77
    .line 78
    add-float/2addr v11, v12

    .line 79
    const/high16 v6, 0x3f800000    # 1.0f

    .line 80
    .line 81
    float-to-double v14, v6

    .line 82
    const-wide v16, 0x3feccccccccccccdL    # 0.9

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    cmpl-double v9, v14, v16

    .line 88
    .line 89
    if-ltz v9, :cond_0

    .line 90
    .line 91
    const v9, 0x3f30a3d7    # 0.69f

    .line 92
    .line 93
    .line 94
    const v19, 0x3f30a3d7    # 0.69f

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_0
    const v9, 0x3f27ae14    # 0.655f

    .line 99
    .line 100
    .line 101
    const v19, 0x3f27ae14    # 0.655f

    .line 102
    .line 103
    .line 104
    :goto_0
    neg-float v9, v5

    .line 105
    const/high16 v12, 0x42280000    # 42.0f

    .line 106
    .line 107
    sub-float/2addr v9, v12

    .line 108
    const/high16 v12, 0x42b80000    # 92.0f

    .line 109
    .line 110
    div-float/2addr v9, v12

    .line 111
    float-to-double v14, v9

    .line 112
    invoke-static {v14, v15}, Ljava/lang/Math;->exp(D)D

    .line 113
    .line 114
    .line 115
    move-result-wide v14

    .line 116
    double-to-float v9, v14

    .line 117
    const v12, 0x3e8e38e4

    .line 118
    .line 119
    .line 120
    mul-float v9, v9, v12

    .line 121
    .line 122
    const/high16 v12, 0x3f800000    # 1.0f

    .line 123
    .line 124
    sub-float v9, v12, v9

    .line 125
    .line 126
    mul-float v9, v9, v6

    .line 127
    .line 128
    float-to-double v14, v9

    .line 129
    const-wide/high16 v16, 0x3ff0000000000000L    # 1.0

    .line 130
    .line 131
    cmpl-double v18, v14, v16

    .line 132
    .line 133
    if-lez v18, :cond_1

    .line 134
    .line 135
    const/high16 v9, 0x3f800000    # 1.0f

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_1
    const-wide/16 v16, 0x0

    .line 139
    .line 140
    cmpg-double v18, v14, v16

    .line 141
    .line 142
    if-gez v18, :cond_2

    .line 143
    .line 144
    const/4 v9, 0x0

    .line 145
    :cond_2
    :goto_1
    const/high16 v14, 0x42c80000    # 100.0f

    .line 146
    .line 147
    div-float v15, v14, v10

    .line 148
    .line 149
    mul-float v15, v15, v9

    .line 150
    .line 151
    add-float/2addr v15, v12

    .line 152
    sub-float/2addr v15, v9

    .line 153
    div-float v16, v14, v13

    .line 154
    .line 155
    mul-float v16, v16, v9

    .line 156
    .line 157
    add-float v16, v16, v12

    .line 158
    .line 159
    sub-float v16, v16, v9

    .line 160
    .line 161
    div-float/2addr v14, v11

    .line 162
    mul-float v14, v14, v9

    .line 163
    .line 164
    add-float/2addr v14, v12

    .line 165
    sub-float/2addr v14, v9

    .line 166
    new-array v9, v0, [F

    .line 167
    .line 168
    aput v15, v9, v3

    .line 169
    .line 170
    aput v16, v9, v2

    .line 171
    .line 172
    aput v14, v9, v1

    .line 173
    .line 174
    const/high16 v14, 0x40a00000    # 5.0f

    .line 175
    .line 176
    mul-float v14, v14, v5

    .line 177
    .line 178
    add-float/2addr v14, v12

    .line 179
    div-float v14, v12, v14

    .line 180
    .line 181
    mul-float v15, v14, v14

    .line 182
    .line 183
    mul-float v15, v15, v14

    .line 184
    .line 185
    mul-float v15, v15, v14

    .line 186
    .line 187
    sub-float/2addr v12, v15

    .line 188
    mul-float v15, v15, v5

    .line 189
    .line 190
    const v14, 0x3dcccccd    # 0.1f

    .line 191
    .line 192
    .line 193
    mul-float v14, v14, v12

    .line 194
    .line 195
    mul-float v14, v14, v12

    .line 196
    .line 197
    const-wide/high16 v16, 0x4014000000000000L    # 5.0

    .line 198
    .line 199
    float-to-double v0, v5

    .line 200
    mul-double v0, v0, v16

    .line 201
    .line 202
    invoke-static {v0, v1}, Ljava/lang/Math;->cbrt(D)D

    .line 203
    .line 204
    .line 205
    move-result-wide v0

    .line 206
    double-to-float v0, v0

    .line 207
    mul-float v14, v14, v0

    .line 208
    .line 209
    add-float v0, v14, v15

    .line 210
    .line 211
    invoke-static {}, LE/b;->o()F

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    aget v4, v4, v2

    .line 216
    .line 217
    div-float v15, v1, v4

    .line 218
    .line 219
    float-to-double v4, v15

    .line 220
    move v1, v13

    .line 221
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    .line 222
    .line 223
    .line 224
    move-result-wide v12

    .line 225
    double-to-float v12, v12

    .line 226
    const v13, 0x3fbd70a4    # 1.48f

    .line 227
    .line 228
    .line 229
    add-float v24, v12, v13

    .line 230
    .line 231
    const-wide v12, 0x3fc999999999999aL    # 0.2

    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    invoke-static {v4, v5, v12, v13}, Ljava/lang/Math;->pow(DD)D

    .line 237
    .line 238
    .line 239
    move-result-wide v4

    .line 240
    double-to-float v4, v4

    .line 241
    const v5, 0x3f39999a    # 0.725f

    .line 242
    .line 243
    .line 244
    div-float v4, v5, v4

    .line 245
    .line 246
    aget v5, v9, v3

    .line 247
    .line 248
    mul-float v5, v5, v0

    .line 249
    .line 250
    mul-float v5, v5, v10

    .line 251
    .line 252
    float-to-double v12, v5

    .line 253
    div-double/2addr v12, v7

    .line 254
    move v5, v15

    .line 255
    const-wide v14, 0x3fdae147ae147ae1L    # 0.42

    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->pow(DD)D

    .line 261
    .line 262
    .line 263
    move-result-wide v12

    .line 264
    double-to-float v13, v12

    .line 265
    aget v12, v9, v2

    .line 266
    .line 267
    mul-float v12, v12, v0

    .line 268
    .line 269
    mul-float v12, v12, v1

    .line 270
    .line 271
    float-to-double v2, v12

    .line 272
    div-double/2addr v2, v7

    .line 273
    invoke-static {v2, v3, v14, v15}, Ljava/lang/Math;->pow(DD)D

    .line 274
    .line 275
    .line 276
    move-result-wide v2

    .line 277
    double-to-float v2, v2

    .line 278
    const/4 v3, 0x2

    .line 279
    aget v12, v9, v3

    .line 280
    .line 281
    mul-float v12, v12, v0

    .line 282
    .line 283
    mul-float v12, v12, v11

    .line 284
    .line 285
    float-to-double v11, v12

    .line 286
    div-double/2addr v11, v7

    .line 287
    invoke-static {v11, v12, v14, v15}, Ljava/lang/Math;->pow(DD)D

    .line 288
    .line 289
    .line 290
    move-result-wide v7

    .line 291
    double-to-float v7, v7

    .line 292
    const/4 v8, 0x3

    .line 293
    new-array v10, v8, [F

    .line 294
    .line 295
    const/4 v8, 0x0

    .line 296
    aput v13, v10, v8

    .line 297
    .line 298
    const/4 v1, 0x1

    .line 299
    aput v2, v10, v1

    .line 300
    .line 301
    aput v7, v10, v3

    .line 302
    .line 303
    aget v2, v10, v8

    .line 304
    .line 305
    const/high16 v7, 0x43c80000    # 400.0f

    .line 306
    .line 307
    mul-float v8, v2, v7

    .line 308
    .line 309
    const v11, 0x41d90a3d    # 27.13f

    .line 310
    .line 311
    .line 312
    add-float/2addr v2, v11

    .line 313
    div-float/2addr v8, v2

    .line 314
    aget v2, v10, v1

    .line 315
    .line 316
    mul-float v13, v2, v7

    .line 317
    .line 318
    add-float/2addr v2, v11

    .line 319
    div-float/2addr v13, v2

    .line 320
    aget v2, v10, v3

    .line 321
    .line 322
    mul-float v7, v7, v2

    .line 323
    .line 324
    add-float/2addr v2, v11

    .line 325
    div-float/2addr v7, v2

    .line 326
    const/4 v2, 0x3

    .line 327
    new-array v2, v2, [F

    .line 328
    .line 329
    const/4 v10, 0x0

    .line 330
    aput v8, v2, v10

    .line 331
    .line 332
    aput v13, v2, v1

    .line 333
    .line 334
    aput v7, v2, v3

    .line 335
    .line 336
    const/high16 v7, 0x40000000    # 2.0f

    .line 337
    .line 338
    aget v8, v2, v10

    .line 339
    .line 340
    mul-float v8, v8, v7

    .line 341
    .line 342
    aget v1, v2, v1

    .line 343
    .line 344
    add-float/2addr v8, v1

    .line 345
    const v1, 0x3d4ccccd    # 0.05f

    .line 346
    .line 347
    .line 348
    aget v2, v2, v3

    .line 349
    .line 350
    mul-float v2, v2, v1

    .line 351
    .line 352
    add-float/2addr v2, v8

    .line 353
    mul-float v16, v2, v4

    .line 354
    .line 355
    new-instance v1, LE/s;

    .line 356
    .line 357
    float-to-double v2, v0

    .line 358
    const-wide/high16 v7, 0x3fd0000000000000L    # 0.25

    .line 359
    .line 360
    invoke-static {v2, v3, v7, v8}, Ljava/lang/Math;->pow(DD)D

    .line 361
    .line 362
    .line 363
    move-result-wide v2

    .line 364
    double-to-float v2, v2

    .line 365
    move-object v14, v1

    .line 366
    move v15, v5

    .line 367
    move/from16 v17, v4

    .line 368
    .line 369
    move/from16 v18, v4

    .line 370
    .line 371
    move/from16 v20, v6

    .line 372
    .line 373
    move-object/from16 v21, v9

    .line 374
    .line 375
    move/from16 v22, v0

    .line 376
    .line 377
    move/from16 v23, v2

    .line 378
    .line 379
    invoke-direct/range {v14 .. v24}, LE/s;-><init>(FFFFFF[FFFF)V

    .line 380
    .line 381
    .line 382
    sput-object v1, LE/s;->k:LE/s;

    .line 383
    .line 384
    return-void
.end method

.method public constructor <init>(FFFFFF[FFFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LE/s;->f:F

    .line 5
    .line 6
    iput p2, p0, LE/s;->a:F

    .line 7
    .line 8
    iput p3, p0, LE/s;->b:F

    .line 9
    .line 10
    iput p4, p0, LE/s;->c:F

    .line 11
    .line 12
    iput p5, p0, LE/s;->d:F

    .line 13
    .line 14
    iput p6, p0, LE/s;->e:F

    .line 15
    .line 16
    iput-object p7, p0, LE/s;->g:[F

    .line 17
    .line 18
    iput p8, p0, LE/s;->h:F

    .line 19
    .line 20
    iput p9, p0, LE/s;->i:F

    .line 21
    .line 22
    iput p10, p0, LE/s;->j:F

    .line 23
    .line 24
    return-void
.end method
