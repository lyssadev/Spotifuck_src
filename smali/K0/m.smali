.class public final LK0/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[LK0/u;

.field public final b:[Landroid/graphics/Matrix;

.field public final c:[Landroid/graphics/Matrix;

.field public final d:Landroid/graphics/PointF;

.field public final e:Landroid/graphics/Path;

.field public final f:Landroid/graphics/Path;

.field public final g:LK0/u;

.field public final h:[F

.field public final i:[F

.field public final j:Landroid/graphics/Path;

.field public final k:Landroid/graphics/Path;

.field public final l:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    new-array v1, v0, [LK0/u;

    .line 6
    .line 7
    iput-object v1, p0, LK0/m;->a:[LK0/u;

    .line 8
    .line 9
    new-array v1, v0, [Landroid/graphics/Matrix;

    .line 10
    .line 11
    iput-object v1, p0, LK0/m;->b:[Landroid/graphics/Matrix;

    .line 12
    .line 13
    new-array v1, v0, [Landroid/graphics/Matrix;

    .line 14
    .line 15
    iput-object v1, p0, LK0/m;->c:[Landroid/graphics/Matrix;

    .line 16
    .line 17
    new-instance v1, Landroid/graphics/PointF;

    .line 18
    .line 19
    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, LK0/m;->d:Landroid/graphics/PointF;

    .line 23
    .line 24
    new-instance v1, Landroid/graphics/Path;

    .line 25
    .line 26
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, LK0/m;->e:Landroid/graphics/Path;

    .line 30
    .line 31
    new-instance v1, Landroid/graphics/Path;

    .line 32
    .line 33
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, LK0/m;->f:Landroid/graphics/Path;

    .line 37
    .line 38
    new-instance v1, LK0/u;

    .line 39
    .line 40
    invoke-direct {v1}, LK0/u;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v1, p0, LK0/m;->g:LK0/u;

    .line 44
    .line 45
    const/4 v1, 0x2

    .line 46
    new-array v2, v1, [F

    .line 47
    .line 48
    iput-object v2, p0, LK0/m;->h:[F

    .line 49
    .line 50
    new-array v1, v1, [F

    .line 51
    .line 52
    iput-object v1, p0, LK0/m;->i:[F

    .line 53
    .line 54
    new-instance v1, Landroid/graphics/Path;

    .line 55
    .line 56
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object v1, p0, LK0/m;->j:Landroid/graphics/Path;

    .line 60
    .line 61
    new-instance v1, Landroid/graphics/Path;

    .line 62
    .line 63
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object v1, p0, LK0/m;->k:Landroid/graphics/Path;

    .line 67
    .line 68
    const/4 v1, 0x1

    .line 69
    iput-boolean v1, p0, LK0/m;->l:Z

    .line 70
    .line 71
    const/4 v1, 0x0

    .line 72
    :goto_0
    if-ge v1, v0, :cond_0

    .line 73
    .line 74
    iget-object v2, p0, LK0/m;->a:[LK0/u;

    .line 75
    .line 76
    new-instance v3, LK0/u;

    .line 77
    .line 78
    invoke-direct {v3}, LK0/u;-><init>()V

    .line 79
    .line 80
    .line 81
    aput-object v3, v2, v1

    .line 82
    .line 83
    iget-object v2, p0, LK0/m;->b:[Landroid/graphics/Matrix;

    .line 84
    .line 85
    new-instance v3, Landroid/graphics/Matrix;

    .line 86
    .line 87
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 88
    .line 89
    .line 90
    aput-object v3, v2, v1

    .line 91
    .line 92
    iget-object v2, p0, LK0/m;->c:[Landroid/graphics/Matrix;

    .line 93
    .line 94
    new-instance v3, Landroid/graphics/Matrix;

    .line 95
    .line 96
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 97
    .line 98
    .line 99
    aput-object v3, v2, v1

    .line 100
    .line 101
    add-int/lit8 v1, v1, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(LK0/k;FLandroid/graphics/RectF;LA/b;Landroid/graphics/Path;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v4, p5

    .line 10
    .line 11
    invoke-virtual/range {p5 .. p5}, Landroid/graphics/Path;->rewind()V

    .line 12
    .line 13
    .line 14
    iget-object v5, v0, LK0/m;->e:Landroid/graphics/Path;

    .line 15
    .line 16
    invoke-virtual {v5}, Landroid/graphics/Path;->rewind()V

    .line 17
    .line 18
    .line 19
    iget-object v6, v0, LK0/m;->f:Landroid/graphics/Path;

    .line 20
    .line 21
    invoke-virtual {v6}, Landroid/graphics/Path;->rewind()V

    .line 22
    .line 23
    .line 24
    sget-object v7, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 25
    .line 26
    invoke-virtual {v6, v2, v7}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 27
    .line 28
    .line 29
    const/4 v8, 0x0

    .line 30
    :goto_0
    iget-object v9, v0, LK0/m;->c:[Landroid/graphics/Matrix;

    .line 31
    .line 32
    iget-object v10, v0, LK0/m;->b:[Landroid/graphics/Matrix;

    .line 33
    .line 34
    iget-object v11, v0, LK0/m;->a:[LK0/u;

    .line 35
    .line 36
    const/4 v12, 0x1

    .line 37
    const/4 v13, 0x4

    .line 38
    const/4 v14, 0x2

    .line 39
    const/4 v15, 0x3

    .line 40
    iget-object v7, v0, LK0/m;->h:[F

    .line 41
    .line 42
    if-ge v8, v13, :cond_9

    .line 43
    .line 44
    if-eq v8, v12, :cond_2

    .line 45
    .line 46
    if-eq v8, v14, :cond_1

    .line 47
    .line 48
    if-eq v8, v15, :cond_0

    .line 49
    .line 50
    iget-object v13, v1, LK0/k;->f:LK0/c;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_0
    iget-object v13, v1, LK0/k;->e:LK0/c;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    iget-object v13, v1, LK0/k;->h:LK0/c;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    iget-object v13, v1, LK0/k;->g:LK0/c;

    .line 60
    .line 61
    :goto_1
    if-eq v8, v12, :cond_5

    .line 62
    .line 63
    if-eq v8, v14, :cond_4

    .line 64
    .line 65
    if-eq v8, v15, :cond_3

    .line 66
    .line 67
    iget-object v15, v1, LK0/k;->b:Lp0/a;

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    iget-object v15, v1, LK0/k;->a:Lp0/a;

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    iget-object v15, v1, LK0/k;->d:Lp0/a;

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_5
    iget-object v15, v1, LK0/k;->c:Lp0/a;

    .line 77
    .line 78
    :goto_2
    aget-object v14, v11, v8

    .line 79
    .line 80
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-interface {v13, v2}, LK0/c;->a(Landroid/graphics/RectF;)F

    .line 84
    .line 85
    .line 86
    move-result v13

    .line 87
    move/from16 v12, p2

    .line 88
    .line 89
    invoke-virtual {v15, v14, v12, v13}, Lp0/a;->M(LK0/u;FF)V

    .line 90
    .line 91
    .line 92
    add-int/lit8 v13, v8, 0x1

    .line 93
    .line 94
    rem-int/lit8 v14, v13, 0x4

    .line 95
    .line 96
    mul-int/lit8 v14, v14, 0x5a

    .line 97
    .line 98
    int-to-float v14, v14

    .line 99
    aget-object v15, v10, v8

    .line 100
    .line 101
    invoke-virtual {v15}, Landroid/graphics/Matrix;->reset()V

    .line 102
    .line 103
    .line 104
    iget-object v15, v0, LK0/m;->d:Landroid/graphics/PointF;

    .line 105
    .line 106
    const/4 v12, 0x1

    .line 107
    if-eq v8, v12, :cond_8

    .line 108
    .line 109
    const/4 v12, 0x2

    .line 110
    if-eq v8, v12, :cond_7

    .line 111
    .line 112
    const/4 v12, 0x3

    .line 113
    if-eq v8, v12, :cond_6

    .line 114
    .line 115
    iget v12, v2, Landroid/graphics/RectF;->right:F

    .line 116
    .line 117
    move/from16 v17, v13

    .line 118
    .line 119
    iget v13, v2, Landroid/graphics/RectF;->top:F

    .line 120
    .line 121
    invoke-virtual {v15, v12, v13}, Landroid/graphics/PointF;->set(FF)V

    .line 122
    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_6
    move/from16 v17, v13

    .line 126
    .line 127
    iget v12, v2, Landroid/graphics/RectF;->left:F

    .line 128
    .line 129
    iget v13, v2, Landroid/graphics/RectF;->top:F

    .line 130
    .line 131
    invoke-virtual {v15, v12, v13}, Landroid/graphics/PointF;->set(FF)V

    .line 132
    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_7
    move/from16 v17, v13

    .line 136
    .line 137
    iget v12, v2, Landroid/graphics/RectF;->left:F

    .line 138
    .line 139
    iget v13, v2, Landroid/graphics/RectF;->bottom:F

    .line 140
    .line 141
    invoke-virtual {v15, v12, v13}, Landroid/graphics/PointF;->set(FF)V

    .line 142
    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_8
    move/from16 v17, v13

    .line 146
    .line 147
    iget v12, v2, Landroid/graphics/RectF;->right:F

    .line 148
    .line 149
    iget v13, v2, Landroid/graphics/RectF;->bottom:F

    .line 150
    .line 151
    invoke-virtual {v15, v12, v13}, Landroid/graphics/PointF;->set(FF)V

    .line 152
    .line 153
    .line 154
    :goto_3
    aget-object v12, v10, v8

    .line 155
    .line 156
    iget v13, v15, Landroid/graphics/PointF;->x:F

    .line 157
    .line 158
    iget v15, v15, Landroid/graphics/PointF;->y:F

    .line 159
    .line 160
    invoke-virtual {v12, v13, v15}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 161
    .line 162
    .line 163
    aget-object v12, v10, v8

    .line 164
    .line 165
    invoke-virtual {v12, v14}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 166
    .line 167
    .line 168
    aget-object v11, v11, v8

    .line 169
    .line 170
    iget v12, v11, LK0/u;->b:F

    .line 171
    .line 172
    const/4 v13, 0x0

    .line 173
    aput v12, v7, v13

    .line 174
    .line 175
    iget v11, v11, LK0/u;->c:F

    .line 176
    .line 177
    const/4 v12, 0x1

    .line 178
    aput v11, v7, v12

    .line 179
    .line 180
    aget-object v10, v10, v8

    .line 181
    .line 182
    invoke-virtual {v10, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 183
    .line 184
    .line 185
    aget-object v10, v9, v8

    .line 186
    .line 187
    invoke-virtual {v10}, Landroid/graphics/Matrix;->reset()V

    .line 188
    .line 189
    .line 190
    aget-object v10, v9, v8

    .line 191
    .line 192
    aget v11, v7, v13

    .line 193
    .line 194
    aget v7, v7, v12

    .line 195
    .line 196
    invoke-virtual {v10, v11, v7}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 197
    .line 198
    .line 199
    aget-object v7, v9, v8

    .line 200
    .line 201
    invoke-virtual {v7, v14}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 202
    .line 203
    .line 204
    move/from16 v8, v17

    .line 205
    .line 206
    goto/16 :goto_0

    .line 207
    .line 208
    :cond_9
    const/4 v8, 0x0

    .line 209
    :goto_4
    if-ge v8, v13, :cond_13

    .line 210
    .line 211
    aget-object v12, v11, v8

    .line 212
    .line 213
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    const/4 v14, 0x0

    .line 217
    const/4 v15, 0x0

    .line 218
    aput v14, v7, v15

    .line 219
    .line 220
    iget v12, v12, LK0/u;->a:F

    .line 221
    .line 222
    const/16 v18, 0x1

    .line 223
    .line 224
    aput v12, v7, v18

    .line 225
    .line 226
    aget-object v12, v10, v8

    .line 227
    .line 228
    invoke-virtual {v12, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 229
    .line 230
    .line 231
    if-nez v8, :cond_a

    .line 232
    .line 233
    aget v12, v7, v15

    .line 234
    .line 235
    aget v13, v7, v18

    .line 236
    .line 237
    invoke-virtual {v4, v12, v13}, Landroid/graphics/Path;->moveTo(FF)V

    .line 238
    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_a
    aget v12, v7, v15

    .line 242
    .line 243
    aget v13, v7, v18

    .line 244
    .line 245
    invoke-virtual {v4, v12, v13}, Landroid/graphics/Path;->lineTo(FF)V

    .line 246
    .line 247
    .line 248
    :goto_5
    aget-object v12, v11, v8

    .line 249
    .line 250
    aget-object v13, v10, v8

    .line 251
    .line 252
    invoke-virtual {v12, v13, v4}, LK0/u;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 253
    .line 254
    .line 255
    if-eqz v3, :cond_b

    .line 256
    .line 257
    aget-object v12, v11, v8

    .line 258
    .line 259
    aget-object v13, v10, v8

    .line 260
    .line 261
    iget-object v15, v3, LA/b;->g:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v15, LK0/g;

    .line 264
    .line 265
    iget-object v14, v15, LK0/g;->i:Ljava/util/BitSet;

    .line 266
    .line 267
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    const/4 v2, 0x0

    .line 271
    invoke-virtual {v14, v8, v2}, Ljava/util/BitSet;->set(IZ)V

    .line 272
    .line 273
    .line 274
    iget v2, v12, LK0/u;->e:F

    .line 275
    .line 276
    invoke-virtual {v12, v2}, LK0/u;->a(F)V

    .line 277
    .line 278
    .line 279
    new-instance v2, Landroid/graphics/Matrix;

    .line 280
    .line 281
    invoke-direct {v2, v13}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 282
    .line 283
    .line 284
    new-instance v13, Ljava/util/ArrayList;

    .line 285
    .line 286
    iget-object v12, v12, LK0/u;->g:Ljava/util/ArrayList;

    .line 287
    .line 288
    invoke-direct {v13, v12}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 289
    .line 290
    .line 291
    new-instance v12, LK0/n;

    .line 292
    .line 293
    invoke-direct {v12, v13, v2}, LK0/n;-><init>(Ljava/util/ArrayList;Landroid/graphics/Matrix;)V

    .line 294
    .line 295
    .line 296
    iget-object v2, v15, LK0/g;->g:[LK0/t;

    .line 297
    .line 298
    aput-object v12, v2, v8

    .line 299
    .line 300
    :cond_b
    add-int/lit8 v13, v8, 0x1

    .line 301
    .line 302
    rem-int/lit8 v2, v13, 0x4

    .line 303
    .line 304
    aget-object v12, v11, v8

    .line 305
    .line 306
    iget v14, v12, LK0/u;->b:F

    .line 307
    .line 308
    const/4 v15, 0x0

    .line 309
    aput v14, v7, v15

    .line 310
    .line 311
    iget v12, v12, LK0/u;->c:F

    .line 312
    .line 313
    const/4 v14, 0x1

    .line 314
    aput v12, v7, v14

    .line 315
    .line 316
    aget-object v12, v10, v8

    .line 317
    .line 318
    invoke-virtual {v12, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 319
    .line 320
    .line 321
    aget-object v12, v11, v2

    .line 322
    .line 323
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    iget-object v14, v0, LK0/m;->i:[F

    .line 327
    .line 328
    const/4 v15, 0x0

    .line 329
    const/16 v16, 0x0

    .line 330
    .line 331
    aput v16, v14, v15

    .line 332
    .line 333
    iget v12, v12, LK0/u;->a:F

    .line 334
    .line 335
    const/16 v18, 0x1

    .line 336
    .line 337
    aput v12, v14, v18

    .line 338
    .line 339
    aget-object v12, v10, v2

    .line 340
    .line 341
    invoke-virtual {v12, v14}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 342
    .line 343
    .line 344
    aget v12, v7, v15

    .line 345
    .line 346
    aget v19, v14, v15

    .line 347
    .line 348
    sub-float v12, v12, v19

    .line 349
    .line 350
    move v15, v13

    .line 351
    float-to-double v12, v12

    .line 352
    aget v19, v7, v18

    .line 353
    .line 354
    aget v14, v14, v18

    .line 355
    .line 356
    sub-float v14, v19, v14

    .line 357
    .line 358
    move/from16 v19, v15

    .line 359
    .line 360
    float-to-double v14, v14

    .line 361
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->hypot(DD)D

    .line 362
    .line 363
    .line 364
    move-result-wide v12

    .line 365
    double-to-float v12, v12

    .line 366
    const v13, 0x3a83126f    # 0.001f

    .line 367
    .line 368
    .line 369
    sub-float/2addr v12, v13

    .line 370
    const/4 v13, 0x0

    .line 371
    invoke-static {v12, v13}, Ljava/lang/Math;->max(FF)F

    .line 372
    .line 373
    .line 374
    move-result v12

    .line 375
    aget-object v13, v11, v8

    .line 376
    .line 377
    iget v14, v13, LK0/u;->b:F

    .line 378
    .line 379
    const/4 v15, 0x0

    .line 380
    aput v14, v7, v15

    .line 381
    .line 382
    iget v13, v13, LK0/u;->c:F

    .line 383
    .line 384
    const/4 v14, 0x1

    .line 385
    aput v13, v7, v14

    .line 386
    .line 387
    aget-object v13, v10, v8

    .line 388
    .line 389
    invoke-virtual {v13, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 390
    .line 391
    .line 392
    if-eq v8, v14, :cond_c

    .line 393
    .line 394
    const/4 v13, 0x3

    .line 395
    if-eq v8, v13, :cond_c

    .line 396
    .line 397
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/RectF;->centerY()F

    .line 398
    .line 399
    .line 400
    move-result v13

    .line 401
    aget v15, v7, v14

    .line 402
    .line 403
    sub-float/2addr v13, v15

    .line 404
    invoke-static {v13}, Ljava/lang/Math;->abs(F)F

    .line 405
    .line 406
    .line 407
    goto :goto_6

    .line 408
    :cond_c
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/RectF;->centerX()F

    .line 409
    .line 410
    .line 411
    move-result v13

    .line 412
    const/4 v14, 0x0

    .line 413
    aget v15, v7, v14

    .line 414
    .line 415
    sub-float/2addr v13, v15

    .line 416
    invoke-static {v13}, Ljava/lang/Math;->abs(F)F

    .line 417
    .line 418
    .line 419
    :goto_6
    const/high16 v13, 0x43870000    # 270.0f

    .line 420
    .line 421
    iget-object v14, v0, LK0/m;->g:LK0/u;

    .line 422
    .line 423
    const/4 v15, 0x0

    .line 424
    invoke-virtual {v14, v15, v13, v15}, LK0/u;->d(FFF)V

    .line 425
    .line 426
    .line 427
    const/4 v13, 0x1

    .line 428
    if-eq v8, v13, :cond_f

    .line 429
    .line 430
    const/4 v13, 0x2

    .line 431
    if-eq v8, v13, :cond_e

    .line 432
    .line 433
    const/4 v15, 0x3

    .line 434
    if-eq v8, v15, :cond_d

    .line 435
    .line 436
    iget-object v13, v1, LK0/k;->j:LK0/e;

    .line 437
    .line 438
    goto :goto_7

    .line 439
    :cond_d
    iget-object v13, v1, LK0/k;->i:LK0/e;

    .line 440
    .line 441
    goto :goto_7

    .line 442
    :cond_e
    const/4 v15, 0x3

    .line 443
    iget-object v13, v1, LK0/k;->l:LK0/e;

    .line 444
    .line 445
    goto :goto_7

    .line 446
    :cond_f
    const/4 v15, 0x3

    .line 447
    iget-object v13, v1, LK0/k;->k:LK0/e;

    .line 448
    .line 449
    :goto_7
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    const/4 v13, 0x0

    .line 453
    invoke-virtual {v14, v12, v13}, LK0/u;->c(FF)V

    .line 454
    .line 455
    .line 456
    iget-object v12, v0, LK0/m;->j:Landroid/graphics/Path;

    .line 457
    .line 458
    invoke-virtual {v12}, Landroid/graphics/Path;->reset()V

    .line 459
    .line 460
    .line 461
    aget-object v13, v9, v8

    .line 462
    .line 463
    invoke-virtual {v14, v13, v12}, LK0/u;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 464
    .line 465
    .line 466
    iget-boolean v13, v0, LK0/m;->l:Z

    .line 467
    .line 468
    if-eqz v13, :cond_10

    .line 469
    .line 470
    invoke-virtual {v0, v12, v8}, LK0/m;->b(Landroid/graphics/Path;I)Z

    .line 471
    .line 472
    .line 473
    move-result v13

    .line 474
    if-nez v13, :cond_11

    .line 475
    .line 476
    invoke-virtual {v0, v12, v2}, LK0/m;->b(Landroid/graphics/Path;I)Z

    .line 477
    .line 478
    .line 479
    move-result v2

    .line 480
    if-eqz v2, :cond_10

    .line 481
    .line 482
    goto :goto_8

    .line 483
    :cond_10
    const/4 v13, 0x1

    .line 484
    goto :goto_9

    .line 485
    :cond_11
    :goto_8
    sget-object v2, Landroid/graphics/Path$Op;->DIFFERENCE:Landroid/graphics/Path$Op;

    .line 486
    .line 487
    invoke-virtual {v12, v12, v6, v2}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 488
    .line 489
    .line 490
    const/4 v2, 0x0

    .line 491
    const/4 v12, 0x0

    .line 492
    aput v12, v7, v2

    .line 493
    .line 494
    iget v12, v14, LK0/u;->a:F

    .line 495
    .line 496
    const/4 v13, 0x1

    .line 497
    aput v12, v7, v13

    .line 498
    .line 499
    aget-object v12, v9, v8

    .line 500
    .line 501
    invoke-virtual {v12, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 502
    .line 503
    .line 504
    aget v12, v7, v2

    .line 505
    .line 506
    aget v2, v7, v13

    .line 507
    .line 508
    invoke-virtual {v5, v12, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 509
    .line 510
    .line 511
    aget-object v2, v9, v8

    .line 512
    .line 513
    invoke-virtual {v14, v2, v5}, LK0/u;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 514
    .line 515
    .line 516
    goto :goto_a

    .line 517
    :goto_9
    aget-object v2, v9, v8

    .line 518
    .line 519
    invoke-virtual {v14, v2, v4}, LK0/u;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 520
    .line 521
    .line 522
    :goto_a
    if-eqz v3, :cond_12

    .line 523
    .line 524
    aget-object v2, v9, v8

    .line 525
    .line 526
    iget-object v12, v3, LA/b;->g:Ljava/lang/Object;

    .line 527
    .line 528
    check-cast v12, LK0/g;

    .line 529
    .line 530
    iget-object v13, v12, LK0/g;->i:Ljava/util/BitSet;

    .line 531
    .line 532
    add-int/lit8 v15, v8, 0x4

    .line 533
    .line 534
    const/4 v0, 0x0

    .line 535
    invoke-virtual {v13, v15, v0}, Ljava/util/BitSet;->set(IZ)V

    .line 536
    .line 537
    .line 538
    iget v13, v14, LK0/u;->e:F

    .line 539
    .line 540
    invoke-virtual {v14, v13}, LK0/u;->a(F)V

    .line 541
    .line 542
    .line 543
    new-instance v13, Landroid/graphics/Matrix;

    .line 544
    .line 545
    invoke-direct {v13, v2}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 546
    .line 547
    .line 548
    new-instance v2, Ljava/util/ArrayList;

    .line 549
    .line 550
    iget-object v14, v14, LK0/u;->g:Ljava/util/ArrayList;

    .line 551
    .line 552
    invoke-direct {v2, v14}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 553
    .line 554
    .line 555
    new-instance v14, LK0/n;

    .line 556
    .line 557
    invoke-direct {v14, v2, v13}, LK0/n;-><init>(Ljava/util/ArrayList;Landroid/graphics/Matrix;)V

    .line 558
    .line 559
    .line 560
    iget-object v2, v12, LK0/g;->h:[LK0/t;

    .line 561
    .line 562
    aput-object v14, v2, v8

    .line 563
    .line 564
    goto :goto_b

    .line 565
    :cond_12
    const/4 v0, 0x0

    .line 566
    :goto_b
    const/4 v13, 0x4

    .line 567
    move-object/from16 v0, p0

    .line 568
    .line 569
    move-object/from16 v2, p3

    .line 570
    .line 571
    move/from16 v8, v19

    .line 572
    .line 573
    goto/16 :goto_4

    .line 574
    .line 575
    :cond_13
    invoke-virtual/range {p5 .. p5}, Landroid/graphics/Path;->close()V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v5}, Landroid/graphics/Path;->close()V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v5}, Landroid/graphics/Path;->isEmpty()Z

    .line 582
    .line 583
    .line 584
    move-result v0

    .line 585
    if-nez v0, :cond_14

    .line 586
    .line 587
    sget-object v0, Landroid/graphics/Path$Op;->UNION:Landroid/graphics/Path$Op;

    .line 588
    .line 589
    invoke-virtual {v4, v5, v0}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 590
    .line 591
    .line 592
    :cond_14
    return-void
.end method

.method public final b(Landroid/graphics/Path;I)Z
    .locals 3

    .line 1
    iget-object v0, p0, LK0/m;->k:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LK0/m;->a:[LK0/u;

    .line 7
    .line 8
    aget-object v1, v1, p2

    .line 9
    .line 10
    iget-object v2, p0, LK0/m;->b:[Landroid/graphics/Matrix;

    .line 11
    .line 12
    aget-object p2, v2, p2

    .line 13
    .line 14
    invoke-virtual {v1, p2, v0}, LK0/u;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 15
    .line 16
    .line 17
    new-instance p2, Landroid/graphics/RectF;

    .line 18
    .line 19
    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-virtual {p1, p2, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p2, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 27
    .line 28
    .line 29
    sget-object v2, Landroid/graphics/Path$Op;->INTERSECT:Landroid/graphics/Path$Op;

    .line 30
    .line 31
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, p2, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2}, Landroid/graphics/RectF;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    const/high16 v0, 0x3f800000    # 1.0f

    .line 48
    .line 49
    cmpl-float p1, p1, v0

    .line 50
    .line 51
    if-lez p1, :cond_0

    .line 52
    .line 53
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    cmpl-float p1, p1, v0

    .line 58
    .line 59
    if-lez p1, :cond_0

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const/4 v1, 0x0

    .line 63
    :cond_1
    :goto_0
    return v1
.end method
