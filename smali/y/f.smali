.class public final Ly/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public final synthetic h:Landroidx/constraintlayout/widget/ConstraintLayout;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly/f;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 5
    .line 6
    iput-object p2, p0, Ly/f;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 7
    .line 8
    return-void
.end method

.method public static a(III)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/high16 v2, 0x40000000    # 2.0f

    .line 18
    .line 19
    if-ne v1, v2, :cond_2

    .line 20
    .line 21
    const/high16 v1, -0x80000000

    .line 22
    .line 23
    if-eq p0, v1, :cond_1

    .line 24
    .line 25
    if-nez p0, :cond_2

    .line 26
    .line 27
    :cond_1
    if-ne p2, p1, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    const/4 v0, 0x0

    .line 31
    :goto_0
    return v0
.end method


# virtual methods
.method public final b(Lv/d;Lw/b;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget v3, v1, Lv/d;->g0:I

    .line 11
    .line 12
    const/16 v4, 0x8

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    if-ne v3, v4, :cond_1

    .line 16
    .line 17
    iput v5, v2, Lw/b;->e:I

    .line 18
    .line 19
    iput v5, v2, Lw/b;->f:I

    .line 20
    .line 21
    iput v5, v2, Lw/b;->g:I

    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    iget-object v3, v1, Lv/d;->T:Lv/d;

    .line 25
    .line 26
    if-nez v3, :cond_2

    .line 27
    .line 28
    return-void

    .line 29
    :cond_2
    sget-object v3, Landroidx/constraintlayout/widget/ConstraintLayout;->u:Ly/s;

    .line 30
    .line 31
    iget-object v3, v0, Ly/f;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget v4, v2, Lw/b;->a:I

    .line 37
    .line 38
    iget v6, v2, Lw/b;->b:I

    .line 39
    .line 40
    iget v7, v2, Lw/b;->c:I

    .line 41
    .line 42
    iget v8, v2, Lw/b;->d:I

    .line 43
    .line 44
    iget v9, v0, Ly/f;->b:I

    .line 45
    .line 46
    iget v10, v0, Ly/f;->c:I

    .line 47
    .line 48
    add-int/2addr v9, v10

    .line 49
    iget v10, v0, Ly/f;->d:I

    .line 50
    .line 51
    iget-object v11, v1, Lv/d;->f0:Landroid/view/View;

    .line 52
    .line 53
    invoke-static {v4}, Lt/e;->a(I)I

    .line 54
    .line 55
    .line 56
    move-result v12

    .line 57
    iget-object v13, v1, Lv/d;->K:Lv/c;

    .line 58
    .line 59
    iget-object v14, v1, Lv/d;->I:Lv/c;

    .line 60
    .line 61
    const/4 v15, 0x1

    .line 62
    const/4 v5, 0x2

    .line 63
    if-eqz v12, :cond_e

    .line 64
    .line 65
    if-eq v12, v15, :cond_d

    .line 66
    .line 67
    if-eq v12, v5, :cond_6

    .line 68
    .line 69
    const/4 v7, 0x3

    .line 70
    if-eq v12, v7, :cond_3

    .line 71
    .line 72
    const/4 v7, 0x0

    .line 73
    goto/16 :goto_5

    .line 74
    .line 75
    :cond_3
    iget v7, v0, Ly/f;->f:I

    .line 76
    .line 77
    if-eqz v14, :cond_4

    .line 78
    .line 79
    iget v12, v14, Lv/c;->g:I

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_4
    const/4 v12, 0x0

    .line 83
    :goto_0
    if-eqz v13, :cond_5

    .line 84
    .line 85
    iget v5, v13, Lv/c;->g:I

    .line 86
    .line 87
    add-int/2addr v12, v5

    .line 88
    :cond_5
    add-int/2addr v10, v12

    .line 89
    const/4 v5, -0x1

    .line 90
    invoke-static {v7, v10, v5}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    goto :goto_5

    .line 95
    :cond_6
    iget v5, v0, Ly/f;->f:I

    .line 96
    .line 97
    const/4 v7, -0x2

    .line 98
    invoke-static {v5, v10, v7}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    iget v7, v1, Lv/d;->r:I

    .line 103
    .line 104
    if-ne v7, v15, :cond_7

    .line 105
    .line 106
    const/4 v7, 0x1

    .line 107
    goto :goto_1

    .line 108
    :cond_7
    const/4 v7, 0x0

    .line 109
    :goto_1
    iget v10, v2, Lw/b;->j:I

    .line 110
    .line 111
    const/4 v12, 0x2

    .line 112
    if-eq v10, v15, :cond_8

    .line 113
    .line 114
    if-ne v10, v12, :cond_b

    .line 115
    .line 116
    :cond_8
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 117
    .line 118
    .line 119
    move-result v10

    .line 120
    invoke-virtual/range {p1 .. p1}, Lv/d;->k()I

    .line 121
    .line 122
    .line 123
    move-result v15

    .line 124
    if-ne v10, v15, :cond_9

    .line 125
    .line 126
    const/4 v10, 0x1

    .line 127
    goto :goto_2

    .line 128
    :cond_9
    const/4 v10, 0x0

    .line 129
    :goto_2
    iget v15, v2, Lw/b;->j:I

    .line 130
    .line 131
    if-eq v15, v12, :cond_c

    .line 132
    .line 133
    if-eqz v7, :cond_c

    .line 134
    .line 135
    if-eqz v7, :cond_a

    .line 136
    .line 137
    if-nez v10, :cond_c

    .line 138
    .line 139
    :cond_a
    invoke-virtual/range {p1 .. p1}, Lv/d;->A()Z

    .line 140
    .line 141
    .line 142
    move-result v7

    .line 143
    if-eqz v7, :cond_b

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_b
    :goto_3
    move v7, v5

    .line 147
    goto :goto_5

    .line 148
    :cond_c
    :goto_4
    invoke-virtual/range {p1 .. p1}, Lv/d;->q()I

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    const/high16 v12, 0x40000000    # 2.0f

    .line 153
    .line 154
    invoke-static {v5, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    goto :goto_3

    .line 159
    :cond_d
    const/high16 v12, 0x40000000    # 2.0f

    .line 160
    .line 161
    iget v5, v0, Ly/f;->f:I

    .line 162
    .line 163
    const/4 v7, -0x2

    .line 164
    invoke-static {v5, v10, v7}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    goto :goto_3

    .line 169
    :cond_e
    const/high16 v12, 0x40000000    # 2.0f

    .line 170
    .line 171
    invoke-static {v7, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    goto :goto_3

    .line 176
    :goto_5
    invoke-static {v6}, Lt/e;->a(I)I

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    if-eqz v5, :cond_19

    .line 181
    .line 182
    const/4 v10, 0x1

    .line 183
    if-eq v5, v10, :cond_18

    .line 184
    .line 185
    const/4 v8, 0x2

    .line 186
    if-eq v5, v8, :cond_12

    .line 187
    .line 188
    const/4 v8, 0x3

    .line 189
    if-eq v5, v8, :cond_f

    .line 190
    .line 191
    const/4 v5, 0x0

    .line 192
    goto/16 :goto_a

    .line 193
    .line 194
    :cond_f
    iget v5, v0, Ly/f;->g:I

    .line 195
    .line 196
    if-eqz v14, :cond_10

    .line 197
    .line 198
    iget-object v8, v1, Lv/d;->J:Lv/c;

    .line 199
    .line 200
    iget v8, v8, Lv/c;->g:I

    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_10
    const/4 v8, 0x0

    .line 204
    :goto_6
    if-eqz v13, :cond_11

    .line 205
    .line 206
    iget-object v10, v1, Lv/d;->L:Lv/c;

    .line 207
    .line 208
    iget v10, v10, Lv/c;->g:I

    .line 209
    .line 210
    add-int/2addr v8, v10

    .line 211
    :cond_11
    add-int/2addr v9, v8

    .line 212
    const/4 v8, -0x1

    .line 213
    invoke-static {v5, v9, v8}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 214
    .line 215
    .line 216
    move-result v5

    .line 217
    goto :goto_a

    .line 218
    :cond_12
    iget v5, v0, Ly/f;->g:I

    .line 219
    .line 220
    const/4 v8, -0x2

    .line 221
    invoke-static {v5, v9, v8}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    iget v8, v1, Lv/d;->s:I

    .line 226
    .line 227
    const/4 v9, 0x1

    .line 228
    if-ne v8, v9, :cond_13

    .line 229
    .line 230
    const/4 v8, 0x1

    .line 231
    goto :goto_7

    .line 232
    :cond_13
    const/4 v8, 0x0

    .line 233
    :goto_7
    iget v10, v2, Lw/b;->j:I

    .line 234
    .line 235
    if-eq v10, v9, :cond_14

    .line 236
    .line 237
    const/4 v9, 0x2

    .line 238
    if-ne v10, v9, :cond_1a

    .line 239
    .line 240
    goto :goto_8

    .line 241
    :cond_14
    const/4 v9, 0x2

    .line 242
    :goto_8
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 243
    .line 244
    .line 245
    move-result v10

    .line 246
    invoke-virtual/range {p1 .. p1}, Lv/d;->q()I

    .line 247
    .line 248
    .line 249
    move-result v12

    .line 250
    if-ne v10, v12, :cond_15

    .line 251
    .line 252
    const/4 v10, 0x1

    .line 253
    goto :goto_9

    .line 254
    :cond_15
    const/4 v10, 0x0

    .line 255
    :goto_9
    iget v12, v2, Lw/b;->j:I

    .line 256
    .line 257
    if-eq v12, v9, :cond_17

    .line 258
    .line 259
    if-eqz v8, :cond_17

    .line 260
    .line 261
    if-eqz v8, :cond_16

    .line 262
    .line 263
    if-nez v10, :cond_17

    .line 264
    .line 265
    :cond_16
    invoke-virtual/range {p1 .. p1}, Lv/d;->B()Z

    .line 266
    .line 267
    .line 268
    move-result v8

    .line 269
    if-eqz v8, :cond_1a

    .line 270
    .line 271
    :cond_17
    invoke-virtual/range {p1 .. p1}, Lv/d;->k()I

    .line 272
    .line 273
    .line 274
    move-result v5

    .line 275
    const/high16 v10, 0x40000000    # 2.0f

    .line 276
    .line 277
    invoke-static {v5, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 278
    .line 279
    .line 280
    move-result v5

    .line 281
    goto :goto_a

    .line 282
    :cond_18
    const/high16 v10, 0x40000000    # 2.0f

    .line 283
    .line 284
    iget v5, v0, Ly/f;->g:I

    .line 285
    .line 286
    const/4 v8, -0x2

    .line 287
    invoke-static {v5, v9, v8}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 288
    .line 289
    .line 290
    move-result v5

    .line 291
    goto :goto_a

    .line 292
    :cond_19
    const/high16 v10, 0x40000000    # 2.0f

    .line 293
    .line 294
    invoke-static {v8, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 295
    .line 296
    .line 297
    move-result v5

    .line 298
    :cond_1a
    :goto_a
    iget-object v8, v1, Lv/d;->T:Lv/d;

    .line 299
    .line 300
    check-cast v8, Lv/e;

    .line 301
    .line 302
    if-eqz v8, :cond_1b

    .line 303
    .line 304
    iget v9, v3, Landroidx/constraintlayout/widget/ConstraintLayout;->n:I

    .line 305
    .line 306
    const/16 v10, 0x100

    .line 307
    .line 308
    invoke-static {v9, v10}, Lv/j;->c(II)Z

    .line 309
    .line 310
    .line 311
    move-result v9

    .line 312
    if-eqz v9, :cond_1b

    .line 313
    .line 314
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 315
    .line 316
    .line 317
    move-result v9

    .line 318
    invoke-virtual/range {p1 .. p1}, Lv/d;->q()I

    .line 319
    .line 320
    .line 321
    move-result v10

    .line 322
    if-ne v9, v10, :cond_1b

    .line 323
    .line 324
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 325
    .line 326
    .line 327
    move-result v9

    .line 328
    invoke-virtual {v8}, Lv/d;->q()I

    .line 329
    .line 330
    .line 331
    move-result v10

    .line 332
    if-ge v9, v10, :cond_1b

    .line 333
    .line 334
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 335
    .line 336
    .line 337
    move-result v9

    .line 338
    invoke-virtual/range {p1 .. p1}, Lv/d;->k()I

    .line 339
    .line 340
    .line 341
    move-result v10

    .line 342
    if-ne v9, v10, :cond_1b

    .line 343
    .line 344
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 345
    .line 346
    .line 347
    move-result v9

    .line 348
    invoke-virtual {v8}, Lv/d;->k()I

    .line 349
    .line 350
    .line 351
    move-result v8

    .line 352
    if-ge v9, v8, :cond_1b

    .line 353
    .line 354
    invoke-virtual {v11}, Landroid/view/View;->getBaseline()I

    .line 355
    .line 356
    .line 357
    move-result v8

    .line 358
    iget v9, v1, Lv/d;->a0:I

    .line 359
    .line 360
    if-ne v8, v9, :cond_1b

    .line 361
    .line 362
    invoke-virtual/range {p1 .. p1}, Lv/d;->z()Z

    .line 363
    .line 364
    .line 365
    move-result v8

    .line 366
    if-nez v8, :cond_1b

    .line 367
    .line 368
    iget v8, v1, Lv/d;->G:I

    .line 369
    .line 370
    invoke-virtual/range {p1 .. p1}, Lv/d;->q()I

    .line 371
    .line 372
    .line 373
    move-result v9

    .line 374
    invoke-static {v8, v7, v9}, Ly/f;->a(III)Z

    .line 375
    .line 376
    .line 377
    move-result v8

    .line 378
    if-eqz v8, :cond_1b

    .line 379
    .line 380
    iget v8, v1, Lv/d;->H:I

    .line 381
    .line 382
    invoke-virtual/range {p1 .. p1}, Lv/d;->k()I

    .line 383
    .line 384
    .line 385
    move-result v9

    .line 386
    invoke-static {v8, v5, v9}, Ly/f;->a(III)Z

    .line 387
    .line 388
    .line 389
    move-result v8

    .line 390
    if-eqz v8, :cond_1b

    .line 391
    .line 392
    invoke-virtual/range {p1 .. p1}, Lv/d;->q()I

    .line 393
    .line 394
    .line 395
    move-result v3

    .line 396
    iput v3, v2, Lw/b;->e:I

    .line 397
    .line 398
    invoke-virtual/range {p1 .. p1}, Lv/d;->k()I

    .line 399
    .line 400
    .line 401
    move-result v3

    .line 402
    iput v3, v2, Lw/b;->f:I

    .line 403
    .line 404
    iget v1, v1, Lv/d;->a0:I

    .line 405
    .line 406
    iput v1, v2, Lw/b;->g:I

    .line 407
    .line 408
    return-void

    .line 409
    :cond_1b
    const/4 v8, 0x3

    .line 410
    if-ne v4, v8, :cond_1c

    .line 411
    .line 412
    const/4 v9, 0x1

    .line 413
    goto :goto_b

    .line 414
    :cond_1c
    const/4 v9, 0x0

    .line 415
    :goto_b
    if-ne v6, v8, :cond_1d

    .line 416
    .line 417
    const/4 v8, 0x1

    .line 418
    goto :goto_c

    .line 419
    :cond_1d
    const/4 v8, 0x0

    .line 420
    :goto_c
    const/4 v10, 0x4

    .line 421
    const/4 v12, 0x1

    .line 422
    if-eq v6, v10, :cond_1f

    .line 423
    .line 424
    if-ne v6, v12, :cond_1e

    .line 425
    .line 426
    goto :goto_d

    .line 427
    :cond_1e
    const/4 v6, 0x0

    .line 428
    goto :goto_e

    .line 429
    :cond_1f
    :goto_d
    const/4 v6, 0x1

    .line 430
    :goto_e
    if-eq v4, v10, :cond_21

    .line 431
    .line 432
    if-ne v4, v12, :cond_20

    .line 433
    .line 434
    goto :goto_f

    .line 435
    :cond_20
    const/4 v10, 0x0

    .line 436
    goto :goto_10

    .line 437
    :cond_21
    :goto_f
    const/4 v10, 0x1

    .line 438
    :goto_10
    const/4 v4, 0x0

    .line 439
    if-eqz v9, :cond_22

    .line 440
    .line 441
    iget v12, v1, Lv/d;->W:F

    .line 442
    .line 443
    cmpl-float v12, v12, v4

    .line 444
    .line 445
    if-lez v12, :cond_22

    .line 446
    .line 447
    const/4 v12, 0x1

    .line 448
    goto :goto_11

    .line 449
    :cond_22
    const/4 v12, 0x0

    .line 450
    :goto_11
    if-eqz v8, :cond_23

    .line 451
    .line 452
    iget v13, v1, Lv/d;->W:F

    .line 453
    .line 454
    cmpl-float v4, v13, v4

    .line 455
    .line 456
    if-lez v4, :cond_23

    .line 457
    .line 458
    const/4 v4, 0x1

    .line 459
    goto :goto_12

    .line 460
    :cond_23
    const/4 v4, 0x0

    .line 461
    :goto_12
    if-nez v11, :cond_24

    .line 462
    .line 463
    return-void

    .line 464
    :cond_24
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 465
    .line 466
    .line 467
    move-result-object v13

    .line 468
    check-cast v13, Ly/e;

    .line 469
    .line 470
    iget v14, v2, Lw/b;->j:I

    .line 471
    .line 472
    const/4 v15, 0x1

    .line 473
    if-eq v14, v15, :cond_26

    .line 474
    .line 475
    const/4 v15, 0x2

    .line 476
    if-eq v14, v15, :cond_26

    .line 477
    .line 478
    if-eqz v9, :cond_26

    .line 479
    .line 480
    iget v9, v1, Lv/d;->r:I

    .line 481
    .line 482
    if-nez v9, :cond_26

    .line 483
    .line 484
    if-eqz v8, :cond_26

    .line 485
    .line 486
    iget v8, v1, Lv/d;->s:I

    .line 487
    .line 488
    if-eqz v8, :cond_25

    .line 489
    .line 490
    goto :goto_13

    .line 491
    :cond_25
    const/4 v0, 0x0

    .line 492
    const/4 v3, -0x1

    .line 493
    const/4 v8, 0x0

    .line 494
    const/4 v10, 0x0

    .line 495
    const/4 v15, 0x0

    .line 496
    goto/16 :goto_1a

    .line 497
    .line 498
    :cond_26
    :goto_13
    instance-of v8, v11, Ly/t;

    .line 499
    .line 500
    if-eqz v8, :cond_27

    .line 501
    .line 502
    instance-of v8, v1, Lv/g;

    .line 503
    .line 504
    if-eqz v8, :cond_27

    .line 505
    .line 506
    move-object v8, v1

    .line 507
    check-cast v8, Lv/g;

    .line 508
    .line 509
    move-object v9, v11

    .line 510
    check-cast v9, Ly/t;

    .line 511
    .line 512
    invoke-virtual {v9, v8, v7, v5}, Ly/t;->j(Lv/g;II)V

    .line 513
    .line 514
    .line 515
    goto :goto_14

    .line 516
    :cond_27
    invoke-virtual {v11, v7, v5}, Landroid/view/View;->measure(II)V

    .line 517
    .line 518
    .line 519
    :goto_14
    iput v7, v1, Lv/d;->G:I

    .line 520
    .line 521
    iput v5, v1, Lv/d;->H:I

    .line 522
    .line 523
    const/4 v8, 0x0

    .line 524
    iput-boolean v8, v1, Lv/d;->g:Z

    .line 525
    .line 526
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 527
    .line 528
    .line 529
    move-result v8

    .line 530
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 531
    .line 532
    .line 533
    move-result v9

    .line 534
    invoke-virtual {v11}, Landroid/view/View;->getBaseline()I

    .line 535
    .line 536
    .line 537
    move-result v14

    .line 538
    iget v15, v1, Lv/d;->u:I

    .line 539
    .line 540
    if-lez v15, :cond_28

    .line 541
    .line 542
    invoke-static {v15, v8}, Ljava/lang/Math;->max(II)I

    .line 543
    .line 544
    .line 545
    move-result v15

    .line 546
    goto :goto_15

    .line 547
    :cond_28
    move v15, v8

    .line 548
    :goto_15
    iget v0, v1, Lv/d;->v:I

    .line 549
    .line 550
    if-lez v0, :cond_29

    .line 551
    .line 552
    invoke-static {v0, v15}, Ljava/lang/Math;->min(II)I

    .line 553
    .line 554
    .line 555
    move-result v15

    .line 556
    :cond_29
    iget v0, v1, Lv/d;->x:I

    .line 557
    .line 558
    if-lez v0, :cond_2a

    .line 559
    .line 560
    invoke-static {v0, v9}, Ljava/lang/Math;->max(II)I

    .line 561
    .line 562
    .line 563
    move-result v0

    .line 564
    move/from16 v16, v5

    .line 565
    .line 566
    goto :goto_16

    .line 567
    :cond_2a
    move/from16 v16, v5

    .line 568
    .line 569
    move v0, v9

    .line 570
    :goto_16
    iget v5, v1, Lv/d;->y:I

    .line 571
    .line 572
    if-lez v5, :cond_2b

    .line 573
    .line 574
    invoke-static {v5, v0}, Ljava/lang/Math;->min(II)I

    .line 575
    .line 576
    .line 577
    move-result v0

    .line 578
    :cond_2b
    iget v3, v3, Landroidx/constraintlayout/widget/ConstraintLayout;->n:I

    .line 579
    .line 580
    const/4 v5, 0x1

    .line 581
    invoke-static {v3, v5}, Lv/j;->c(II)Z

    .line 582
    .line 583
    .line 584
    move-result v3

    .line 585
    if-nez v3, :cond_2d

    .line 586
    .line 587
    const/high16 v3, 0x3f000000    # 0.5f

    .line 588
    .line 589
    if-eqz v12, :cond_2c

    .line 590
    .line 591
    if-eqz v6, :cond_2c

    .line 592
    .line 593
    iget v4, v1, Lv/d;->W:F

    .line 594
    .line 595
    int-to-float v5, v0

    .line 596
    mul-float v5, v5, v4

    .line 597
    .line 598
    add-float/2addr v5, v3

    .line 599
    float-to-int v3, v5

    .line 600
    move v15, v3

    .line 601
    goto :goto_17

    .line 602
    :cond_2c
    if-eqz v4, :cond_2d

    .line 603
    .line 604
    if-eqz v10, :cond_2d

    .line 605
    .line 606
    iget v0, v1, Lv/d;->W:F

    .line 607
    .line 608
    int-to-float v4, v15

    .line 609
    div-float/2addr v4, v0

    .line 610
    add-float/2addr v4, v3

    .line 611
    float-to-int v0, v4

    .line 612
    :cond_2d
    :goto_17
    if-ne v8, v15, :cond_2f

    .line 613
    .line 614
    if-eq v9, v0, :cond_2e

    .line 615
    .line 616
    goto :goto_18

    .line 617
    :cond_2e
    move v8, v14

    .line 618
    const/4 v3, -0x1

    .line 619
    const/4 v10, 0x0

    .line 620
    goto :goto_1a

    .line 621
    :cond_2f
    :goto_18
    const/high16 v3, 0x40000000    # 2.0f

    .line 622
    .line 623
    if-eq v8, v15, :cond_30

    .line 624
    .line 625
    invoke-static {v15, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 626
    .line 627
    .line 628
    move-result v7

    .line 629
    :cond_30
    if-eq v9, v0, :cond_31

    .line 630
    .line 631
    invoke-static {v0, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 632
    .line 633
    .line 634
    move-result v5

    .line 635
    goto :goto_19

    .line 636
    :cond_31
    move/from16 v5, v16

    .line 637
    .line 638
    :goto_19
    invoke-virtual {v11, v7, v5}, Landroid/view/View;->measure(II)V

    .line 639
    .line 640
    .line 641
    iput v7, v1, Lv/d;->G:I

    .line 642
    .line 643
    iput v5, v1, Lv/d;->H:I

    .line 644
    .line 645
    const/4 v10, 0x0

    .line 646
    iput-boolean v10, v1, Lv/d;->g:Z

    .line 647
    .line 648
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 649
    .line 650
    .line 651
    move-result v8

    .line 652
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 653
    .line 654
    .line 655
    move-result v0

    .line 656
    invoke-virtual {v11}, Landroid/view/View;->getBaseline()I

    .line 657
    .line 658
    .line 659
    move-result v3

    .line 660
    move v15, v8

    .line 661
    move v8, v3

    .line 662
    const/4 v3, -0x1

    .line 663
    :goto_1a
    if-eq v8, v3, :cond_32

    .line 664
    .line 665
    const/4 v3, 0x1

    .line 666
    goto :goto_1b

    .line 667
    :cond_32
    const/4 v3, 0x0

    .line 668
    :goto_1b
    iget v4, v2, Lw/b;->c:I

    .line 669
    .line 670
    if-ne v15, v4, :cond_34

    .line 671
    .line 672
    iget v4, v2, Lw/b;->d:I

    .line 673
    .line 674
    if-eq v0, v4, :cond_33

    .line 675
    .line 676
    goto :goto_1c

    .line 677
    :cond_33
    const/4 v5, 0x0

    .line 678
    goto :goto_1d

    .line 679
    :cond_34
    :goto_1c
    const/4 v5, 0x1

    .line 680
    :goto_1d
    iput-boolean v5, v2, Lw/b;->i:Z

    .line 681
    .line 682
    iget-boolean v4, v13, Ly/e;->c0:Z

    .line 683
    .line 684
    if-eqz v4, :cond_35

    .line 685
    .line 686
    const/4 v10, 0x1

    .line 687
    goto :goto_1e

    .line 688
    :cond_35
    move v10, v3

    .line 689
    :goto_1e
    if-eqz v10, :cond_36

    .line 690
    .line 691
    const/4 v3, -0x1

    .line 692
    if-eq v8, v3, :cond_36

    .line 693
    .line 694
    iget v1, v1, Lv/d;->a0:I

    .line 695
    .line 696
    if-eq v1, v8, :cond_36

    .line 697
    .line 698
    const/4 v1, 0x1

    .line 699
    iput-boolean v1, v2, Lw/b;->i:Z

    .line 700
    .line 701
    :cond_36
    iput v15, v2, Lw/b;->e:I

    .line 702
    .line 703
    iput v0, v2, Lw/b;->f:I

    .line 704
    .line 705
    iput-boolean v10, v2, Lw/b;->h:Z

    .line 706
    .line 707
    iput v8, v2, Lw/b;->g:I

    .line 708
    .line 709
    return-void
.end method
