.class public final Lw/k;
.super Lw/o;
.source "SourceFile"


# static fields
.field public static final k:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    sput-object v0, Lw/k;->k:[I

    .line 5
    .line 6
    return-void
.end method

.method public static m([IIIIIFI)V
    .locals 2

    .line 1
    sub-int/2addr p2, p1

    .line 2
    sub-int/2addr p4, p3

    .line 3
    const/4 p1, -0x1

    .line 4
    const/4 p3, 0x0

    .line 5
    const/high16 v0, 0x3f000000    # 0.5f

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq p6, p1, :cond_2

    .line 9
    .line 10
    if-eqz p6, :cond_1

    .line 11
    .line 12
    if-eq p6, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    int-to-float p1, p2

    .line 16
    mul-float p1, p1, p5

    .line 17
    .line 18
    add-float/2addr p1, v0

    .line 19
    float-to-int p1, p1

    .line 20
    aput p2, p0, p3

    .line 21
    .line 22
    aput p1, p0, v1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    int-to-float p1, p4

    .line 26
    mul-float p1, p1, p5

    .line 27
    .line 28
    add-float/2addr p1, v0

    .line 29
    float-to-int p1, p1

    .line 30
    aput p1, p0, p3

    .line 31
    .line 32
    aput p4, p0, v1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    int-to-float p1, p4

    .line 36
    mul-float p1, p1, p5

    .line 37
    .line 38
    add-float/2addr p1, v0

    .line 39
    float-to-int p1, p1

    .line 40
    int-to-float p6, p2

    .line 41
    div-float/2addr p6, p5

    .line 42
    add-float/2addr p6, v0

    .line 43
    float-to-int p5, p6

    .line 44
    if-gt p1, p2, :cond_3

    .line 45
    .line 46
    aput p1, p0, p3

    .line 47
    .line 48
    aput p4, p0, v1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    if-gt p5, p4, :cond_4

    .line 52
    .line 53
    aput p2, p0, p3

    .line 54
    .line 55
    aput p5, p0, v1

    .line 56
    .line 57
    :cond_4
    :goto_0
    return-void
.end method


# virtual methods
.method public final a(Lw/d;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lw/o;->j:I

    .line 4
    .line 5
    invoke-static {v1}, Lt/e;->a(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x3

    .line 11
    if-eq v1, v3, :cond_2a

    .line 12
    .line 13
    iget-object v1, v0, Lw/o;->e:Lw/g;

    .line 14
    .line 15
    iget-boolean v4, v1, Lw/f;->j:Z

    .line 16
    .line 17
    iget-object v5, v0, Lw/o;->h:Lw/f;

    .line 18
    .line 19
    iget-object v6, v0, Lw/o;->i:Lw/f;

    .line 20
    .line 21
    const/high16 v7, 0x3f000000    # 0.5f

    .line 22
    .line 23
    const/4 v8, 0x1

    .line 24
    if-nez v4, :cond_21

    .line 25
    .line 26
    iget v4, v0, Lw/o;->d:I

    .line 27
    .line 28
    if-ne v4, v3, :cond_21

    .line 29
    .line 30
    iget-object v4, v0, Lw/o;->b:Lv/d;

    .line 31
    .line 32
    iget v9, v4, Lv/d;->r:I

    .line 33
    .line 34
    const/4 v10, 0x2

    .line 35
    if-eq v9, v10, :cond_20

    .line 36
    .line 37
    if-eq v9, v3, :cond_0

    .line 38
    .line 39
    goto/16 :goto_e

    .line 40
    .line 41
    :cond_0
    iget v9, v4, Lv/d;->s:I

    .line 42
    .line 43
    const/4 v10, -0x1

    .line 44
    if-eqz v9, :cond_5

    .line 45
    .line 46
    if-ne v9, v3, :cond_1

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_1
    iget v9, v4, Lv/d;->X:I

    .line 50
    .line 51
    if-eq v9, v10, :cond_4

    .line 52
    .line 53
    if-eqz v9, :cond_3

    .line 54
    .line 55
    if-eq v9, v8, :cond_2

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    iget-object v9, v4, Lv/d;->e:Lw/m;

    .line 60
    .line 61
    iget-object v9, v9, Lw/o;->e:Lw/g;

    .line 62
    .line 63
    iget v9, v9, Lw/f;->g:I

    .line 64
    .line 65
    int-to-float v9, v9

    .line 66
    iget v4, v4, Lv/d;->W:F

    .line 67
    .line 68
    :goto_0
    mul-float v9, v9, v4

    .line 69
    .line 70
    :goto_1
    add-float/2addr v9, v7

    .line 71
    float-to-int v4, v9

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    iget-object v9, v4, Lv/d;->e:Lw/m;

    .line 74
    .line 75
    iget-object v9, v9, Lw/o;->e:Lw/g;

    .line 76
    .line 77
    iget v9, v9, Lw/f;->g:I

    .line 78
    .line 79
    int-to-float v9, v9

    .line 80
    iget v4, v4, Lv/d;->W:F

    .line 81
    .line 82
    div-float/2addr v9, v4

    .line 83
    goto :goto_1

    .line 84
    :cond_4
    iget-object v9, v4, Lv/d;->e:Lw/m;

    .line 85
    .line 86
    iget-object v9, v9, Lw/o;->e:Lw/g;

    .line 87
    .line 88
    iget v9, v9, Lw/f;->g:I

    .line 89
    .line 90
    int-to-float v9, v9

    .line 91
    iget v4, v4, Lv/d;->W:F

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :goto_2
    invoke-virtual {v1, v4}, Lw/g;->d(I)V

    .line 95
    .line 96
    .line 97
    goto/16 :goto_e

    .line 98
    .line 99
    :cond_5
    :goto_3
    iget-object v9, v4, Lv/d;->e:Lw/m;

    .line 100
    .line 101
    iget-object v11, v9, Lw/o;->h:Lw/f;

    .line 102
    .line 103
    iget-object v9, v9, Lw/o;->i:Lw/f;

    .line 104
    .line 105
    iget-object v12, v4, Lv/d;->I:Lv/c;

    .line 106
    .line 107
    iget-object v12, v12, Lv/c;->f:Lv/c;

    .line 108
    .line 109
    if-eqz v12, :cond_6

    .line 110
    .line 111
    const/4 v12, 0x1

    .line 112
    goto :goto_4

    .line 113
    :cond_6
    const/4 v12, 0x0

    .line 114
    :goto_4
    iget-object v13, v4, Lv/d;->J:Lv/c;

    .line 115
    .line 116
    iget-object v13, v13, Lv/c;->f:Lv/c;

    .line 117
    .line 118
    if-eqz v13, :cond_7

    .line 119
    .line 120
    const/4 v13, 0x1

    .line 121
    goto :goto_5

    .line 122
    :cond_7
    const/4 v13, 0x0

    .line 123
    :goto_5
    iget-object v14, v4, Lv/d;->K:Lv/c;

    .line 124
    .line 125
    iget-object v14, v14, Lv/c;->f:Lv/c;

    .line 126
    .line 127
    if-eqz v14, :cond_8

    .line 128
    .line 129
    const/4 v14, 0x1

    .line 130
    goto :goto_6

    .line 131
    :cond_8
    const/4 v14, 0x0

    .line 132
    :goto_6
    iget-object v15, v4, Lv/d;->L:Lv/c;

    .line 133
    .line 134
    iget-object v15, v15, Lv/c;->f:Lv/c;

    .line 135
    .line 136
    if-eqz v15, :cond_9

    .line 137
    .line 138
    const/4 v15, 0x1

    .line 139
    goto :goto_7

    .line 140
    :cond_9
    const/4 v15, 0x0

    .line 141
    :goto_7
    iget v3, v4, Lv/d;->X:I

    .line 142
    .line 143
    if-eqz v12, :cond_12

    .line 144
    .line 145
    if-eqz v13, :cond_12

    .line 146
    .line 147
    if-eqz v14, :cond_12

    .line 148
    .line 149
    if-eqz v15, :cond_12

    .line 150
    .line 151
    iget v4, v4, Lv/d;->W:F

    .line 152
    .line 153
    iget-boolean v10, v11, Lw/f;->j:Z

    .line 154
    .line 155
    sget-object v12, Lw/k;->k:[I

    .line 156
    .line 157
    if-eqz v10, :cond_c

    .line 158
    .line 159
    iget-boolean v10, v9, Lw/f;->j:Z

    .line 160
    .line 161
    if-eqz v10, :cond_c

    .line 162
    .line 163
    iget-boolean v7, v5, Lw/f;->c:Z

    .line 164
    .line 165
    if-eqz v7, :cond_b

    .line 166
    .line 167
    iget-boolean v7, v6, Lw/f;->c:Z

    .line 168
    .line 169
    if-nez v7, :cond_a

    .line 170
    .line 171
    goto :goto_8

    .line 172
    :cond_a
    iget-object v7, v5, Lw/f;->l:Ljava/util/ArrayList;

    .line 173
    .line 174
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    check-cast v7, Lw/f;

    .line 179
    .line 180
    iget v7, v7, Lw/f;->g:I

    .line 181
    .line 182
    iget v5, v5, Lw/f;->f:I

    .line 183
    .line 184
    add-int v17, v7, v5

    .line 185
    .line 186
    iget-object v5, v6, Lw/f;->l:Ljava/util/ArrayList;

    .line 187
    .line 188
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    check-cast v5, Lw/f;

    .line 193
    .line 194
    iget v5, v5, Lw/f;->g:I

    .line 195
    .line 196
    iget v6, v6, Lw/f;->f:I

    .line 197
    .line 198
    sub-int v18, v5, v6

    .line 199
    .line 200
    iget v5, v11, Lw/f;->g:I

    .line 201
    .line 202
    iget v6, v11, Lw/f;->f:I

    .line 203
    .line 204
    add-int v19, v5, v6

    .line 205
    .line 206
    iget v5, v9, Lw/f;->g:I

    .line 207
    .line 208
    iget v6, v9, Lw/f;->f:I

    .line 209
    .line 210
    sub-int v20, v5, v6

    .line 211
    .line 212
    move-object/from16 v16, v12

    .line 213
    .line 214
    move/from16 v21, v4

    .line 215
    .line 216
    move/from16 v22, v3

    .line 217
    .line 218
    invoke-static/range {v16 .. v22}, Lw/k;->m([IIIIIFI)V

    .line 219
    .line 220
    .line 221
    aget v2, v12, v2

    .line 222
    .line 223
    invoke-virtual {v1, v2}, Lw/g;->d(I)V

    .line 224
    .line 225
    .line 226
    iget-object v1, v0, Lw/o;->b:Lv/d;

    .line 227
    .line 228
    iget-object v1, v1, Lv/d;->e:Lw/m;

    .line 229
    .line 230
    iget-object v1, v1, Lw/o;->e:Lw/g;

    .line 231
    .line 232
    aget v2, v12, v8

    .line 233
    .line 234
    invoke-virtual {v1, v2}, Lw/g;->d(I)V

    .line 235
    .line 236
    .line 237
    :cond_b
    :goto_8
    return-void

    .line 238
    :cond_c
    iget-boolean v10, v5, Lw/f;->j:Z

    .line 239
    .line 240
    iget-object v13, v11, Lw/f;->l:Ljava/util/ArrayList;

    .line 241
    .line 242
    if-eqz v10, :cond_f

    .line 243
    .line 244
    iget-boolean v10, v6, Lw/f;->j:Z

    .line 245
    .line 246
    if-eqz v10, :cond_f

    .line 247
    .line 248
    iget-boolean v10, v11, Lw/f;->c:Z

    .line 249
    .line 250
    if-eqz v10, :cond_e

    .line 251
    .line 252
    iget-boolean v10, v9, Lw/f;->c:Z

    .line 253
    .line 254
    if-nez v10, :cond_d

    .line 255
    .line 256
    goto :goto_9

    .line 257
    :cond_d
    iget v10, v5, Lw/f;->g:I

    .line 258
    .line 259
    iget v14, v5, Lw/f;->f:I

    .line 260
    .line 261
    add-int v17, v10, v14

    .line 262
    .line 263
    iget v10, v6, Lw/f;->g:I

    .line 264
    .line 265
    iget v14, v6, Lw/f;->f:I

    .line 266
    .line 267
    sub-int v18, v10, v14

    .line 268
    .line 269
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v10

    .line 273
    check-cast v10, Lw/f;

    .line 274
    .line 275
    iget v10, v10, Lw/f;->g:I

    .line 276
    .line 277
    iget v14, v11, Lw/f;->f:I

    .line 278
    .line 279
    add-int v19, v10, v14

    .line 280
    .line 281
    iget-object v10, v9, Lw/f;->l:Ljava/util/ArrayList;

    .line 282
    .line 283
    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v10

    .line 287
    check-cast v10, Lw/f;

    .line 288
    .line 289
    iget v10, v10, Lw/f;->g:I

    .line 290
    .line 291
    iget v14, v9, Lw/f;->f:I

    .line 292
    .line 293
    sub-int v20, v10, v14

    .line 294
    .line 295
    move-object/from16 v16, v12

    .line 296
    .line 297
    move/from16 v21, v4

    .line 298
    .line 299
    move/from16 v22, v3

    .line 300
    .line 301
    invoke-static/range {v16 .. v22}, Lw/k;->m([IIIIIFI)V

    .line 302
    .line 303
    .line 304
    aget v10, v12, v2

    .line 305
    .line 306
    invoke-virtual {v1, v10}, Lw/g;->d(I)V

    .line 307
    .line 308
    .line 309
    iget-object v10, v0, Lw/o;->b:Lv/d;

    .line 310
    .line 311
    iget-object v10, v10, Lv/d;->e:Lw/m;

    .line 312
    .line 313
    iget-object v10, v10, Lw/o;->e:Lw/g;

    .line 314
    .line 315
    aget v14, v12, v8

    .line 316
    .line 317
    invoke-virtual {v10, v14}, Lw/g;->d(I)V

    .line 318
    .line 319
    .line 320
    goto :goto_a

    .line 321
    :cond_e
    :goto_9
    return-void

    .line 322
    :cond_f
    :goto_a
    iget-boolean v10, v5, Lw/f;->c:Z

    .line 323
    .line 324
    if-eqz v10, :cond_11

    .line 325
    .line 326
    iget-boolean v10, v6, Lw/f;->c:Z

    .line 327
    .line 328
    if-eqz v10, :cond_11

    .line 329
    .line 330
    iget-boolean v10, v11, Lw/f;->c:Z

    .line 331
    .line 332
    if-eqz v10, :cond_11

    .line 333
    .line 334
    iget-boolean v10, v9, Lw/f;->c:Z

    .line 335
    .line 336
    if-nez v10, :cond_10

    .line 337
    .line 338
    goto :goto_b

    .line 339
    :cond_10
    iget-object v10, v5, Lw/f;->l:Ljava/util/ArrayList;

    .line 340
    .line 341
    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v10

    .line 345
    check-cast v10, Lw/f;

    .line 346
    .line 347
    iget v10, v10, Lw/f;->g:I

    .line 348
    .line 349
    iget v14, v5, Lw/f;->f:I

    .line 350
    .line 351
    add-int v17, v10, v14

    .line 352
    .line 353
    iget-object v10, v6, Lw/f;->l:Ljava/util/ArrayList;

    .line 354
    .line 355
    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v10

    .line 359
    check-cast v10, Lw/f;

    .line 360
    .line 361
    iget v10, v10, Lw/f;->g:I

    .line 362
    .line 363
    iget v14, v6, Lw/f;->f:I

    .line 364
    .line 365
    sub-int v18, v10, v14

    .line 366
    .line 367
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v10

    .line 371
    check-cast v10, Lw/f;

    .line 372
    .line 373
    iget v10, v10, Lw/f;->g:I

    .line 374
    .line 375
    iget v11, v11, Lw/f;->f:I

    .line 376
    .line 377
    add-int v19, v10, v11

    .line 378
    .line 379
    iget-object v10, v9, Lw/f;->l:Ljava/util/ArrayList;

    .line 380
    .line 381
    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v10

    .line 385
    check-cast v10, Lw/f;

    .line 386
    .line 387
    iget v10, v10, Lw/f;->g:I

    .line 388
    .line 389
    iget v9, v9, Lw/f;->f:I

    .line 390
    .line 391
    sub-int v20, v10, v9

    .line 392
    .line 393
    move-object/from16 v16, v12

    .line 394
    .line 395
    move/from16 v21, v4

    .line 396
    .line 397
    move/from16 v22, v3

    .line 398
    .line 399
    invoke-static/range {v16 .. v22}, Lw/k;->m([IIIIIFI)V

    .line 400
    .line 401
    .line 402
    aget v3, v12, v2

    .line 403
    .line 404
    invoke-virtual {v1, v3}, Lw/g;->d(I)V

    .line 405
    .line 406
    .line 407
    iget-object v3, v0, Lw/o;->b:Lv/d;

    .line 408
    .line 409
    iget-object v3, v3, Lv/d;->e:Lw/m;

    .line 410
    .line 411
    iget-object v3, v3, Lw/o;->e:Lw/g;

    .line 412
    .line 413
    aget v4, v12, v8

    .line 414
    .line 415
    invoke-virtual {v3, v4}, Lw/g;->d(I)V

    .line 416
    .line 417
    .line 418
    goto/16 :goto_e

    .line 419
    .line 420
    :cond_11
    :goto_b
    return-void

    .line 421
    :cond_12
    if-eqz v12, :cond_19

    .line 422
    .line 423
    if-eqz v14, :cond_19

    .line 424
    .line 425
    iget-boolean v9, v5, Lw/f;->c:Z

    .line 426
    .line 427
    if-eqz v9, :cond_18

    .line 428
    .line 429
    iget-boolean v9, v6, Lw/f;->c:Z

    .line 430
    .line 431
    if-nez v9, :cond_13

    .line 432
    .line 433
    goto :goto_c

    .line 434
    :cond_13
    iget v4, v4, Lv/d;->W:F

    .line 435
    .line 436
    iget-object v9, v5, Lw/f;->l:Ljava/util/ArrayList;

    .line 437
    .line 438
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v9

    .line 442
    check-cast v9, Lw/f;

    .line 443
    .line 444
    iget v9, v9, Lw/f;->g:I

    .line 445
    .line 446
    iget v11, v5, Lw/f;->f:I

    .line 447
    .line 448
    add-int/2addr v9, v11

    .line 449
    iget-object v11, v6, Lw/f;->l:Ljava/util/ArrayList;

    .line 450
    .line 451
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v11

    .line 455
    check-cast v11, Lw/f;

    .line 456
    .line 457
    iget v11, v11, Lw/f;->g:I

    .line 458
    .line 459
    iget v12, v6, Lw/f;->f:I

    .line 460
    .line 461
    sub-int/2addr v11, v12

    .line 462
    if-eq v3, v10, :cond_16

    .line 463
    .line 464
    if-eqz v3, :cond_16

    .line 465
    .line 466
    if-eq v3, v8, :cond_14

    .line 467
    .line 468
    goto/16 :goto_e

    .line 469
    .line 470
    :cond_14
    sub-int/2addr v11, v9

    .line 471
    invoke-virtual {v0, v11, v2}, Lw/o;->g(II)I

    .line 472
    .line 473
    .line 474
    move-result v3

    .line 475
    int-to-float v9, v3

    .line 476
    div-float/2addr v9, v4

    .line 477
    add-float/2addr v9, v7

    .line 478
    float-to-int v9, v9

    .line 479
    invoke-virtual {v0, v9, v8}, Lw/o;->g(II)I

    .line 480
    .line 481
    .line 482
    move-result v10

    .line 483
    if-eq v9, v10, :cond_15

    .line 484
    .line 485
    int-to-float v3, v10

    .line 486
    mul-float v3, v3, v4

    .line 487
    .line 488
    add-float/2addr v3, v7

    .line 489
    float-to-int v3, v3

    .line 490
    :cond_15
    invoke-virtual {v1, v3}, Lw/g;->d(I)V

    .line 491
    .line 492
    .line 493
    iget-object v3, v0, Lw/o;->b:Lv/d;

    .line 494
    .line 495
    iget-object v3, v3, Lv/d;->e:Lw/m;

    .line 496
    .line 497
    iget-object v3, v3, Lw/o;->e:Lw/g;

    .line 498
    .line 499
    invoke-virtual {v3, v10}, Lw/g;->d(I)V

    .line 500
    .line 501
    .line 502
    goto/16 :goto_e

    .line 503
    .line 504
    :cond_16
    sub-int/2addr v11, v9

    .line 505
    invoke-virtual {v0, v11, v2}, Lw/o;->g(II)I

    .line 506
    .line 507
    .line 508
    move-result v3

    .line 509
    int-to-float v9, v3

    .line 510
    mul-float v9, v9, v4

    .line 511
    .line 512
    add-float/2addr v9, v7

    .line 513
    float-to-int v9, v9

    .line 514
    invoke-virtual {v0, v9, v8}, Lw/o;->g(II)I

    .line 515
    .line 516
    .line 517
    move-result v10

    .line 518
    if-eq v9, v10, :cond_17

    .line 519
    .line 520
    int-to-float v3, v10

    .line 521
    div-float/2addr v3, v4

    .line 522
    add-float/2addr v3, v7

    .line 523
    float-to-int v3, v3

    .line 524
    :cond_17
    invoke-virtual {v1, v3}, Lw/g;->d(I)V

    .line 525
    .line 526
    .line 527
    iget-object v3, v0, Lw/o;->b:Lv/d;

    .line 528
    .line 529
    iget-object v3, v3, Lv/d;->e:Lw/m;

    .line 530
    .line 531
    iget-object v3, v3, Lw/o;->e:Lw/g;

    .line 532
    .line 533
    invoke-virtual {v3, v10}, Lw/g;->d(I)V

    .line 534
    .line 535
    .line 536
    goto/16 :goto_e

    .line 537
    .line 538
    :cond_18
    :goto_c
    return-void

    .line 539
    :cond_19
    if-eqz v13, :cond_21

    .line 540
    .line 541
    if-eqz v15, :cond_21

    .line 542
    .line 543
    iget-boolean v12, v11, Lw/f;->c:Z

    .line 544
    .line 545
    if-eqz v12, :cond_1f

    .line 546
    .line 547
    iget-boolean v12, v9, Lw/f;->c:Z

    .line 548
    .line 549
    if-nez v12, :cond_1a

    .line 550
    .line 551
    goto :goto_d

    .line 552
    :cond_1a
    iget v4, v4, Lv/d;->W:F

    .line 553
    .line 554
    iget-object v12, v11, Lw/f;->l:Ljava/util/ArrayList;

    .line 555
    .line 556
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v12

    .line 560
    check-cast v12, Lw/f;

    .line 561
    .line 562
    iget v12, v12, Lw/f;->g:I

    .line 563
    .line 564
    iget v11, v11, Lw/f;->f:I

    .line 565
    .line 566
    add-int/2addr v12, v11

    .line 567
    iget-object v11, v9, Lw/f;->l:Ljava/util/ArrayList;

    .line 568
    .line 569
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v11

    .line 573
    check-cast v11, Lw/f;

    .line 574
    .line 575
    iget v11, v11, Lw/f;->g:I

    .line 576
    .line 577
    iget v9, v9, Lw/f;->f:I

    .line 578
    .line 579
    sub-int/2addr v11, v9

    .line 580
    if-eq v3, v10, :cond_1d

    .line 581
    .line 582
    if-eqz v3, :cond_1b

    .line 583
    .line 584
    if-eq v3, v8, :cond_1d

    .line 585
    .line 586
    goto :goto_e

    .line 587
    :cond_1b
    sub-int/2addr v11, v12

    .line 588
    invoke-virtual {v0, v11, v8}, Lw/o;->g(II)I

    .line 589
    .line 590
    .line 591
    move-result v3

    .line 592
    int-to-float v9, v3

    .line 593
    mul-float v9, v9, v4

    .line 594
    .line 595
    add-float/2addr v9, v7

    .line 596
    float-to-int v9, v9

    .line 597
    invoke-virtual {v0, v9, v2}, Lw/o;->g(II)I

    .line 598
    .line 599
    .line 600
    move-result v10

    .line 601
    if-eq v9, v10, :cond_1c

    .line 602
    .line 603
    int-to-float v3, v10

    .line 604
    div-float/2addr v3, v4

    .line 605
    add-float/2addr v3, v7

    .line 606
    float-to-int v3, v3

    .line 607
    :cond_1c
    invoke-virtual {v1, v10}, Lw/g;->d(I)V

    .line 608
    .line 609
    .line 610
    iget-object v4, v0, Lw/o;->b:Lv/d;

    .line 611
    .line 612
    iget-object v4, v4, Lv/d;->e:Lw/m;

    .line 613
    .line 614
    iget-object v4, v4, Lw/o;->e:Lw/g;

    .line 615
    .line 616
    invoke-virtual {v4, v3}, Lw/g;->d(I)V

    .line 617
    .line 618
    .line 619
    goto :goto_e

    .line 620
    :cond_1d
    sub-int/2addr v11, v12

    .line 621
    invoke-virtual {v0, v11, v8}, Lw/o;->g(II)I

    .line 622
    .line 623
    .line 624
    move-result v3

    .line 625
    int-to-float v9, v3

    .line 626
    div-float/2addr v9, v4

    .line 627
    add-float/2addr v9, v7

    .line 628
    float-to-int v9, v9

    .line 629
    invoke-virtual {v0, v9, v2}, Lw/o;->g(II)I

    .line 630
    .line 631
    .line 632
    move-result v10

    .line 633
    if-eq v9, v10, :cond_1e

    .line 634
    .line 635
    int-to-float v3, v10

    .line 636
    mul-float v3, v3, v4

    .line 637
    .line 638
    add-float/2addr v3, v7

    .line 639
    float-to-int v3, v3

    .line 640
    :cond_1e
    invoke-virtual {v1, v10}, Lw/g;->d(I)V

    .line 641
    .line 642
    .line 643
    iget-object v4, v0, Lw/o;->b:Lv/d;

    .line 644
    .line 645
    iget-object v4, v4, Lv/d;->e:Lw/m;

    .line 646
    .line 647
    iget-object v4, v4, Lw/o;->e:Lw/g;

    .line 648
    .line 649
    invoke-virtual {v4, v3}, Lw/g;->d(I)V

    .line 650
    .line 651
    .line 652
    goto :goto_e

    .line 653
    :cond_1f
    :goto_d
    return-void

    .line 654
    :cond_20
    iget-object v3, v4, Lv/d;->T:Lv/d;

    .line 655
    .line 656
    if-eqz v3, :cond_21

    .line 657
    .line 658
    iget-object v3, v3, Lv/d;->d:Lw/k;

    .line 659
    .line 660
    iget-object v3, v3, Lw/o;->e:Lw/g;

    .line 661
    .line 662
    iget-boolean v9, v3, Lw/f;->j:Z

    .line 663
    .line 664
    if-eqz v9, :cond_21

    .line 665
    .line 666
    iget v4, v4, Lv/d;->w:F

    .line 667
    .line 668
    iget v3, v3, Lw/f;->g:I

    .line 669
    .line 670
    int-to-float v3, v3

    .line 671
    mul-float v3, v3, v4

    .line 672
    .line 673
    add-float/2addr v3, v7

    .line 674
    float-to-int v3, v3

    .line 675
    invoke-virtual {v1, v3}, Lw/g;->d(I)V

    .line 676
    .line 677
    .line 678
    :cond_21
    :goto_e
    iget-boolean v3, v5, Lw/f;->c:Z

    .line 679
    .line 680
    if-eqz v3, :cond_29

    .line 681
    .line 682
    iget-boolean v3, v6, Lw/f;->c:Z

    .line 683
    .line 684
    if-nez v3, :cond_22

    .line 685
    .line 686
    goto/16 :goto_10

    .line 687
    .line 688
    :cond_22
    iget-boolean v3, v5, Lw/f;->j:Z

    .line 689
    .line 690
    if-eqz v3, :cond_23

    .line 691
    .line 692
    iget-boolean v3, v6, Lw/f;->j:Z

    .line 693
    .line 694
    if-eqz v3, :cond_23

    .line 695
    .line 696
    iget-boolean v3, v1, Lw/f;->j:Z

    .line 697
    .line 698
    if-eqz v3, :cond_23

    .line 699
    .line 700
    return-void

    .line 701
    :cond_23
    iget-boolean v3, v1, Lw/f;->j:Z

    .line 702
    .line 703
    if-nez v3, :cond_24

    .line 704
    .line 705
    iget v3, v0, Lw/o;->d:I

    .line 706
    .line 707
    const/4 v4, 0x3

    .line 708
    if-ne v3, v4, :cond_24

    .line 709
    .line 710
    iget-object v3, v0, Lw/o;->b:Lv/d;

    .line 711
    .line 712
    iget v4, v3, Lv/d;->r:I

    .line 713
    .line 714
    if-nez v4, :cond_24

    .line 715
    .line 716
    invoke-virtual {v3}, Lv/d;->x()Z

    .line 717
    .line 718
    .line 719
    move-result v3

    .line 720
    if-nez v3, :cond_24

    .line 721
    .line 722
    iget-object v3, v5, Lw/f;->l:Ljava/util/ArrayList;

    .line 723
    .line 724
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 725
    .line 726
    .line 727
    move-result-object v3

    .line 728
    check-cast v3, Lw/f;

    .line 729
    .line 730
    iget-object v4, v6, Lw/f;->l:Ljava/util/ArrayList;

    .line 731
    .line 732
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    move-result-object v2

    .line 736
    check-cast v2, Lw/f;

    .line 737
    .line 738
    iget v3, v3, Lw/f;->g:I

    .line 739
    .line 740
    iget v4, v5, Lw/f;->f:I

    .line 741
    .line 742
    add-int/2addr v3, v4

    .line 743
    iget v2, v2, Lw/f;->g:I

    .line 744
    .line 745
    iget v4, v6, Lw/f;->f:I

    .line 746
    .line 747
    add-int/2addr v2, v4

    .line 748
    sub-int v4, v2, v3

    .line 749
    .line 750
    invoke-virtual {v5, v3}, Lw/f;->d(I)V

    .line 751
    .line 752
    .line 753
    invoke-virtual {v6, v2}, Lw/f;->d(I)V

    .line 754
    .line 755
    .line 756
    invoke-virtual {v1, v4}, Lw/g;->d(I)V

    .line 757
    .line 758
    .line 759
    return-void

    .line 760
    :cond_24
    iget-boolean v3, v1, Lw/f;->j:Z

    .line 761
    .line 762
    if-nez v3, :cond_26

    .line 763
    .line 764
    iget v3, v0, Lw/o;->d:I

    .line 765
    .line 766
    const/4 v4, 0x3

    .line 767
    if-ne v3, v4, :cond_26

    .line 768
    .line 769
    iget v3, v0, Lw/o;->a:I

    .line 770
    .line 771
    if-ne v3, v8, :cond_26

    .line 772
    .line 773
    iget-object v3, v5, Lw/f;->l:Ljava/util/ArrayList;

    .line 774
    .line 775
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 776
    .line 777
    .line 778
    move-result v3

    .line 779
    if-lez v3, :cond_26

    .line 780
    .line 781
    iget-object v3, v6, Lw/f;->l:Ljava/util/ArrayList;

    .line 782
    .line 783
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 784
    .line 785
    .line 786
    move-result v3

    .line 787
    if-lez v3, :cond_26

    .line 788
    .line 789
    iget-object v3, v5, Lw/f;->l:Ljava/util/ArrayList;

    .line 790
    .line 791
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v3

    .line 795
    check-cast v3, Lw/f;

    .line 796
    .line 797
    iget-object v4, v6, Lw/f;->l:Ljava/util/ArrayList;

    .line 798
    .line 799
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    move-result-object v4

    .line 803
    check-cast v4, Lw/f;

    .line 804
    .line 805
    iget v3, v3, Lw/f;->g:I

    .line 806
    .line 807
    iget v8, v5, Lw/f;->f:I

    .line 808
    .line 809
    add-int/2addr v3, v8

    .line 810
    iget v4, v4, Lw/f;->g:I

    .line 811
    .line 812
    iget v8, v6, Lw/f;->f:I

    .line 813
    .line 814
    add-int/2addr v4, v8

    .line 815
    sub-int/2addr v4, v3

    .line 816
    iget v3, v1, Lw/g;->m:I

    .line 817
    .line 818
    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    .line 819
    .line 820
    .line 821
    move-result v3

    .line 822
    iget-object v4, v0, Lw/o;->b:Lv/d;

    .line 823
    .line 824
    iget v8, v4, Lv/d;->v:I

    .line 825
    .line 826
    iget v4, v4, Lv/d;->u:I

    .line 827
    .line 828
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    .line 829
    .line 830
    .line 831
    move-result v3

    .line 832
    if-lez v8, :cond_25

    .line 833
    .line 834
    invoke-static {v8, v3}, Ljava/lang/Math;->min(II)I

    .line 835
    .line 836
    .line 837
    move-result v3

    .line 838
    :cond_25
    invoke-virtual {v1, v3}, Lw/g;->d(I)V

    .line 839
    .line 840
    .line 841
    :cond_26
    iget-boolean v3, v1, Lw/f;->j:Z

    .line 842
    .line 843
    if-nez v3, :cond_27

    .line 844
    .line 845
    return-void

    .line 846
    :cond_27
    iget-object v3, v5, Lw/f;->l:Ljava/util/ArrayList;

    .line 847
    .line 848
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 849
    .line 850
    .line 851
    move-result-object v3

    .line 852
    check-cast v3, Lw/f;

    .line 853
    .line 854
    iget-object v4, v6, Lw/f;->l:Ljava/util/ArrayList;

    .line 855
    .line 856
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 857
    .line 858
    .line 859
    move-result-object v2

    .line 860
    check-cast v2, Lw/f;

    .line 861
    .line 862
    iget v4, v3, Lw/f;->g:I

    .line 863
    .line 864
    iget v8, v5, Lw/f;->f:I

    .line 865
    .line 866
    add-int/2addr v8, v4

    .line 867
    iget v9, v2, Lw/f;->g:I

    .line 868
    .line 869
    iget v10, v6, Lw/f;->f:I

    .line 870
    .line 871
    add-int/2addr v10, v9

    .line 872
    iget-object v11, v0, Lw/o;->b:Lv/d;

    .line 873
    .line 874
    iget v11, v11, Lv/d;->d0:F

    .line 875
    .line 876
    if-ne v3, v2, :cond_28

    .line 877
    .line 878
    const/high16 v11, 0x3f000000    # 0.5f

    .line 879
    .line 880
    goto :goto_f

    .line 881
    :cond_28
    move v4, v8

    .line 882
    move v9, v10

    .line 883
    :goto_f
    sub-int/2addr v9, v4

    .line 884
    iget v2, v1, Lw/f;->g:I

    .line 885
    .line 886
    sub-int/2addr v9, v2

    .line 887
    int-to-float v2, v4

    .line 888
    add-float/2addr v2, v7

    .line 889
    int-to-float v3, v9

    .line 890
    mul-float v3, v3, v11

    .line 891
    .line 892
    add-float/2addr v3, v2

    .line 893
    float-to-int v2, v3

    .line 894
    invoke-virtual {v5, v2}, Lw/f;->d(I)V

    .line 895
    .line 896
    .line 897
    iget v2, v5, Lw/f;->g:I

    .line 898
    .line 899
    iget v1, v1, Lw/f;->g:I

    .line 900
    .line 901
    add-int/2addr v2, v1

    .line 902
    invoke-virtual {v6, v2}, Lw/f;->d(I)V

    .line 903
    .line 904
    .line 905
    :cond_29
    :goto_10
    return-void

    .line 906
    :cond_2a
    iget-object v1, v0, Lw/o;->b:Lv/d;

    .line 907
    .line 908
    iget-object v3, v1, Lv/d;->I:Lv/c;

    .line 909
    .line 910
    iget-object v1, v1, Lv/d;->K:Lv/c;

    .line 911
    .line 912
    invoke-virtual {v0, v3, v1, v2}, Lw/o;->l(Lv/c;Lv/c;I)V

    .line 913
    .line 914
    .line 915
    return-void
.end method

.method public final d()V
    .locals 11

    .line 1
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 2
    .line 3
    iget-boolean v1, v0, Lv/d;->a:Z

    .line 4
    .line 5
    iget-object v2, p0, Lw/o;->e:Lw/g;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lv/d;->q()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {v2, v0}, Lw/g;->d(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-boolean v0, v2, Lw/f;->j:Z

    .line 17
    .line 18
    iget-object v1, p0, Lw/o;->i:Lw/f;

    .line 19
    .line 20
    iget-object v3, p0, Lw/o;->h:Lw/f;

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    const/4 v5, 0x3

    .line 24
    const/4 v6, 0x4

    .line 25
    const/4 v7, 0x0

    .line 26
    if-nez v0, :cond_3

    .line 27
    .line 28
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 29
    .line 30
    iget-object v8, v0, Lv/d;->p0:[I

    .line 31
    .line 32
    aget v8, v8, v7

    .line 33
    .line 34
    iput v8, p0, Lw/o;->d:I

    .line 35
    .line 36
    if-eq v8, v5, :cond_5

    .line 37
    .line 38
    if-ne v8, v6, :cond_2

    .line 39
    .line 40
    iget-object v9, v0, Lv/d;->T:Lv/d;

    .line 41
    .line 42
    if-eqz v9, :cond_2

    .line 43
    .line 44
    iget-object v10, v9, Lv/d;->p0:[I

    .line 45
    .line 46
    aget v10, v10, v7

    .line 47
    .line 48
    if-eq v10, v4, :cond_1

    .line 49
    .line 50
    if-ne v10, v6, :cond_2

    .line 51
    .line 52
    :cond_1
    invoke-virtual {v9}, Lv/d;->q()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object v4, p0, Lw/o;->b:Lv/d;

    .line 57
    .line 58
    iget-object v4, v4, Lv/d;->I:Lv/c;

    .line 59
    .line 60
    invoke-virtual {v4}, Lv/c;->e()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    sub-int/2addr v0, v4

    .line 65
    iget-object v4, p0, Lw/o;->b:Lv/d;

    .line 66
    .line 67
    iget-object v4, v4, Lv/d;->K:Lv/c;

    .line 68
    .line 69
    invoke-virtual {v4}, Lv/c;->e()I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    sub-int/2addr v0, v4

    .line 74
    iget-object v4, v9, Lv/d;->d:Lw/k;

    .line 75
    .line 76
    iget-object v4, v4, Lw/o;->h:Lw/f;

    .line 77
    .line 78
    iget-object v5, p0, Lw/o;->b:Lv/d;

    .line 79
    .line 80
    iget-object v5, v5, Lv/d;->I:Lv/c;

    .line 81
    .line 82
    invoke-virtual {v5}, Lv/c;->e()I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    invoke-static {v3, v4, v5}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 87
    .line 88
    .line 89
    iget-object v3, v9, Lv/d;->d:Lw/k;

    .line 90
    .line 91
    iget-object v3, v3, Lw/o;->i:Lw/f;

    .line 92
    .line 93
    iget-object v4, p0, Lw/o;->b:Lv/d;

    .line 94
    .line 95
    iget-object v4, v4, Lv/d;->K:Lv/c;

    .line 96
    .line 97
    invoke-virtual {v4}, Lv/c;->e()I

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    neg-int v4, v4

    .line 102
    invoke-static {v1, v3, v4}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v0}, Lw/g;->d(I)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_2
    if-ne v8, v4, :cond_5

    .line 110
    .line 111
    invoke-virtual {v0}, Lv/d;->q()I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    invoke-virtual {v2, v0}, Lw/g;->d(I)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_3
    iget v0, p0, Lw/o;->d:I

    .line 120
    .line 121
    if-ne v0, v6, :cond_5

    .line 122
    .line 123
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 124
    .line 125
    iget-object v8, v0, Lv/d;->T:Lv/d;

    .line 126
    .line 127
    if-eqz v8, :cond_5

    .line 128
    .line 129
    iget-object v9, v8, Lv/d;->p0:[I

    .line 130
    .line 131
    aget v9, v9, v7

    .line 132
    .line 133
    if-eq v9, v4, :cond_4

    .line 134
    .line 135
    if-ne v9, v6, :cond_5

    .line 136
    .line 137
    :cond_4
    iget-object v2, v8, Lv/d;->d:Lw/k;

    .line 138
    .line 139
    iget-object v2, v2, Lw/o;->h:Lw/f;

    .line 140
    .line 141
    iget-object v0, v0, Lv/d;->I:Lv/c;

    .line 142
    .line 143
    invoke-virtual {v0}, Lv/c;->e()I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    invoke-static {v3, v2, v0}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 148
    .line 149
    .line 150
    iget-object v0, v8, Lv/d;->d:Lw/k;

    .line 151
    .line 152
    iget-object v0, v0, Lw/o;->i:Lw/f;

    .line 153
    .line 154
    iget-object v2, p0, Lw/o;->b:Lv/d;

    .line 155
    .line 156
    iget-object v2, v2, Lv/d;->K:Lv/c;

    .line 157
    .line 158
    invoke-virtual {v2}, Lv/c;->e()I

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    neg-int v2, v2

    .line 163
    invoke-static {v1, v0, v2}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :cond_5
    :goto_0
    iget-boolean v0, v2, Lw/f;->j:Z

    .line 168
    .line 169
    if-eqz v0, :cond_c

    .line 170
    .line 171
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 172
    .line 173
    iget-boolean v8, v0, Lv/d;->a:Z

    .line 174
    .line 175
    if-eqz v8, :cond_c

    .line 176
    .line 177
    iget-object v5, v0, Lv/d;->Q:[Lv/c;

    .line 178
    .line 179
    aget-object v6, v5, v7

    .line 180
    .line 181
    iget-object v8, v6, Lv/c;->f:Lv/c;

    .line 182
    .line 183
    if-eqz v8, :cond_9

    .line 184
    .line 185
    aget-object v9, v5, v4

    .line 186
    .line 187
    iget-object v9, v9, Lv/c;->f:Lv/c;

    .line 188
    .line 189
    if-eqz v9, :cond_9

    .line 190
    .line 191
    invoke-virtual {v0}, Lv/d;->x()Z

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-eqz v0, :cond_6

    .line 196
    .line 197
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 198
    .line 199
    iget-object v0, v0, Lv/d;->Q:[Lv/c;

    .line 200
    .line 201
    aget-object v0, v0, v7

    .line 202
    .line 203
    invoke-virtual {v0}, Lv/c;->e()I

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    iput v0, v3, Lw/f;->f:I

    .line 208
    .line 209
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 210
    .line 211
    iget-object v0, v0, Lv/d;->Q:[Lv/c;

    .line 212
    .line 213
    aget-object v0, v0, v4

    .line 214
    .line 215
    invoke-virtual {v0}, Lv/c;->e()I

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    neg-int v0, v0

    .line 220
    iput v0, v1, Lw/f;->f:I

    .line 221
    .line 222
    goto/16 :goto_2

    .line 223
    .line 224
    :cond_6
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 225
    .line 226
    iget-object v0, v0, Lv/d;->Q:[Lv/c;

    .line 227
    .line 228
    aget-object v0, v0, v7

    .line 229
    .line 230
    invoke-static {v0}, Lw/o;->h(Lv/c;)Lw/f;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    if-eqz v0, :cond_7

    .line 235
    .line 236
    iget-object v2, p0, Lw/o;->b:Lv/d;

    .line 237
    .line 238
    iget-object v2, v2, Lv/d;->Q:[Lv/c;

    .line 239
    .line 240
    aget-object v2, v2, v7

    .line 241
    .line 242
    invoke-virtual {v2}, Lv/c;->e()I

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    invoke-static {v3, v0, v2}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 247
    .line 248
    .line 249
    :cond_7
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 250
    .line 251
    iget-object v0, v0, Lv/d;->Q:[Lv/c;

    .line 252
    .line 253
    aget-object v0, v0, v4

    .line 254
    .line 255
    invoke-static {v0}, Lw/o;->h(Lv/c;)Lw/f;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    if-eqz v0, :cond_8

    .line 260
    .line 261
    iget-object v2, p0, Lw/o;->b:Lv/d;

    .line 262
    .line 263
    iget-object v2, v2, Lv/d;->Q:[Lv/c;

    .line 264
    .line 265
    aget-object v2, v2, v4

    .line 266
    .line 267
    invoke-virtual {v2}, Lv/c;->e()I

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    neg-int v2, v2

    .line 272
    invoke-static {v1, v0, v2}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 273
    .line 274
    .line 275
    :cond_8
    iput-boolean v4, v3, Lw/f;->b:Z

    .line 276
    .line 277
    iput-boolean v4, v1, Lw/f;->b:Z

    .line 278
    .line 279
    goto/16 :goto_2

    .line 280
    .line 281
    :cond_9
    if-eqz v8, :cond_a

    .line 282
    .line 283
    invoke-static {v6}, Lw/o;->h(Lv/c;)Lw/f;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    if-eqz v0, :cond_1a

    .line 288
    .line 289
    iget-object v4, p0, Lw/o;->b:Lv/d;

    .line 290
    .line 291
    iget-object v4, v4, Lv/d;->Q:[Lv/c;

    .line 292
    .line 293
    aget-object v4, v4, v7

    .line 294
    .line 295
    invoke-virtual {v4}, Lv/c;->e()I

    .line 296
    .line 297
    .line 298
    move-result v4

    .line 299
    invoke-static {v3, v0, v4}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 300
    .line 301
    .line 302
    iget v0, v2, Lw/f;->g:I

    .line 303
    .line 304
    invoke-static {v1, v3, v0}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 305
    .line 306
    .line 307
    goto/16 :goto_2

    .line 308
    .line 309
    :cond_a
    aget-object v5, v5, v4

    .line 310
    .line 311
    iget-object v6, v5, Lv/c;->f:Lv/c;

    .line 312
    .line 313
    if-eqz v6, :cond_b

    .line 314
    .line 315
    invoke-static {v5}, Lw/o;->h(Lv/c;)Lw/f;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    if-eqz v0, :cond_1a

    .line 320
    .line 321
    iget-object v5, p0, Lw/o;->b:Lv/d;

    .line 322
    .line 323
    iget-object v5, v5, Lv/d;->Q:[Lv/c;

    .line 324
    .line 325
    aget-object v4, v5, v4

    .line 326
    .line 327
    invoke-virtual {v4}, Lv/c;->e()I

    .line 328
    .line 329
    .line 330
    move-result v4

    .line 331
    neg-int v4, v4

    .line 332
    invoke-static {v1, v0, v4}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 333
    .line 334
    .line 335
    iget v0, v2, Lw/f;->g:I

    .line 336
    .line 337
    neg-int v0, v0

    .line 338
    invoke-static {v3, v1, v0}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 339
    .line 340
    .line 341
    goto/16 :goto_2

    .line 342
    .line 343
    :cond_b
    instance-of v4, v0, Lv/i;

    .line 344
    .line 345
    if-nez v4, :cond_1a

    .line 346
    .line 347
    iget-object v4, v0, Lv/d;->T:Lv/d;

    .line 348
    .line 349
    if-eqz v4, :cond_1a

    .line 350
    .line 351
    const/4 v4, 0x7

    .line 352
    invoke-virtual {v0, v4}, Lv/d;->i(I)Lv/c;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    iget-object v0, v0, Lv/c;->f:Lv/c;

    .line 357
    .line 358
    if-nez v0, :cond_1a

    .line 359
    .line 360
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 361
    .line 362
    iget-object v4, v0, Lv/d;->T:Lv/d;

    .line 363
    .line 364
    iget-object v4, v4, Lv/d;->d:Lw/k;

    .line 365
    .line 366
    iget-object v4, v4, Lw/o;->h:Lw/f;

    .line 367
    .line 368
    invoke-virtual {v0}, Lv/d;->r()I

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    invoke-static {v3, v4, v0}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 373
    .line 374
    .line 375
    iget v0, v2, Lw/f;->g:I

    .line 376
    .line 377
    invoke-static {v1, v3, v0}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 378
    .line 379
    .line 380
    goto/16 :goto_2

    .line 381
    .line 382
    :cond_c
    iget v0, p0, Lw/o;->d:I

    .line 383
    .line 384
    if-ne v0, v5, :cond_13

    .line 385
    .line 386
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 387
    .line 388
    iget v8, v0, Lv/d;->r:I

    .line 389
    .line 390
    const/4 v9, 0x2

    .line 391
    if-eq v8, v9, :cond_11

    .line 392
    .line 393
    if-eq v8, v5, :cond_d

    .line 394
    .line 395
    goto/16 :goto_1

    .line 396
    .line 397
    :cond_d
    iget v8, v0, Lv/d;->s:I

    .line 398
    .line 399
    if-ne v8, v5, :cond_10

    .line 400
    .line 401
    iput-object p0, v3, Lw/f;->a:Lw/o;

    .line 402
    .line 403
    iput-object p0, v1, Lw/f;->a:Lw/o;

    .line 404
    .line 405
    iget-object v5, v0, Lv/d;->e:Lw/m;

    .line 406
    .line 407
    iget-object v8, v5, Lw/o;->h:Lw/f;

    .line 408
    .line 409
    iput-object p0, v8, Lw/f;->a:Lw/o;

    .line 410
    .line 411
    iget-object v5, v5, Lw/o;->i:Lw/f;

    .line 412
    .line 413
    iput-object p0, v5, Lw/f;->a:Lw/o;

    .line 414
    .line 415
    iput-object p0, v2, Lw/f;->a:Lw/o;

    .line 416
    .line 417
    invoke-virtual {v0}, Lv/d;->y()Z

    .line 418
    .line 419
    .line 420
    move-result v0

    .line 421
    if-eqz v0, :cond_e

    .line 422
    .line 423
    iget-object v0, v2, Lw/f;->l:Ljava/util/ArrayList;

    .line 424
    .line 425
    iget-object v5, p0, Lw/o;->b:Lv/d;

    .line 426
    .line 427
    iget-object v5, v5, Lv/d;->e:Lw/m;

    .line 428
    .line 429
    iget-object v5, v5, Lw/o;->e:Lw/g;

    .line 430
    .line 431
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 435
    .line 436
    iget-object v0, v0, Lv/d;->e:Lw/m;

    .line 437
    .line 438
    iget-object v0, v0, Lw/o;->e:Lw/g;

    .line 439
    .line 440
    iget-object v0, v0, Lw/f;->k:Ljava/util/ArrayList;

    .line 441
    .line 442
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 446
    .line 447
    iget-object v0, v0, Lv/d;->e:Lw/m;

    .line 448
    .line 449
    iget-object v5, v0, Lw/o;->e:Lw/g;

    .line 450
    .line 451
    iput-object p0, v5, Lw/f;->a:Lw/o;

    .line 452
    .line 453
    iget-object v5, v2, Lw/f;->l:Ljava/util/ArrayList;

    .line 454
    .line 455
    iget-object v0, v0, Lw/o;->h:Lw/f;

    .line 456
    .line 457
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    iget-object v0, v2, Lw/f;->l:Ljava/util/ArrayList;

    .line 461
    .line 462
    iget-object v5, p0, Lw/o;->b:Lv/d;

    .line 463
    .line 464
    iget-object v5, v5, Lv/d;->e:Lw/m;

    .line 465
    .line 466
    iget-object v5, v5, Lw/o;->i:Lw/f;

    .line 467
    .line 468
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 472
    .line 473
    iget-object v0, v0, Lv/d;->e:Lw/m;

    .line 474
    .line 475
    iget-object v0, v0, Lw/o;->h:Lw/f;

    .line 476
    .line 477
    iget-object v0, v0, Lw/f;->k:Ljava/util/ArrayList;

    .line 478
    .line 479
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 483
    .line 484
    iget-object v0, v0, Lv/d;->e:Lw/m;

    .line 485
    .line 486
    iget-object v0, v0, Lw/o;->i:Lw/f;

    .line 487
    .line 488
    iget-object v0, v0, Lw/f;->k:Ljava/util/ArrayList;

    .line 489
    .line 490
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    goto/16 :goto_1

    .line 494
    .line 495
    :cond_e
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 496
    .line 497
    invoke-virtual {v0}, Lv/d;->x()Z

    .line 498
    .line 499
    .line 500
    move-result v0

    .line 501
    if-eqz v0, :cond_f

    .line 502
    .line 503
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 504
    .line 505
    iget-object v0, v0, Lv/d;->e:Lw/m;

    .line 506
    .line 507
    iget-object v0, v0, Lw/o;->e:Lw/g;

    .line 508
    .line 509
    iget-object v0, v0, Lw/f;->l:Ljava/util/ArrayList;

    .line 510
    .line 511
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    iget-object v0, v2, Lw/f;->k:Ljava/util/ArrayList;

    .line 515
    .line 516
    iget-object v5, p0, Lw/o;->b:Lv/d;

    .line 517
    .line 518
    iget-object v5, v5, Lv/d;->e:Lw/m;

    .line 519
    .line 520
    iget-object v5, v5, Lw/o;->e:Lw/g;

    .line 521
    .line 522
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 523
    .line 524
    .line 525
    goto :goto_1

    .line 526
    :cond_f
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 527
    .line 528
    iget-object v0, v0, Lv/d;->e:Lw/m;

    .line 529
    .line 530
    iget-object v0, v0, Lw/o;->e:Lw/g;

    .line 531
    .line 532
    iget-object v0, v0, Lw/f;->l:Ljava/util/ArrayList;

    .line 533
    .line 534
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    goto :goto_1

    .line 538
    :cond_10
    iget-object v0, v0, Lv/d;->e:Lw/m;

    .line 539
    .line 540
    iget-object v0, v0, Lw/o;->e:Lw/g;

    .line 541
    .line 542
    iget-object v5, v2, Lw/f;->l:Ljava/util/ArrayList;

    .line 543
    .line 544
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 545
    .line 546
    .line 547
    iget-object v0, v0, Lw/f;->k:Ljava/util/ArrayList;

    .line 548
    .line 549
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 550
    .line 551
    .line 552
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 553
    .line 554
    iget-object v0, v0, Lv/d;->e:Lw/m;

    .line 555
    .line 556
    iget-object v0, v0, Lw/o;->h:Lw/f;

    .line 557
    .line 558
    iget-object v0, v0, Lw/f;->k:Ljava/util/ArrayList;

    .line 559
    .line 560
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 561
    .line 562
    .line 563
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 564
    .line 565
    iget-object v0, v0, Lv/d;->e:Lw/m;

    .line 566
    .line 567
    iget-object v0, v0, Lw/o;->i:Lw/f;

    .line 568
    .line 569
    iget-object v0, v0, Lw/f;->k:Ljava/util/ArrayList;

    .line 570
    .line 571
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 572
    .line 573
    .line 574
    iput-boolean v4, v2, Lw/f;->b:Z

    .line 575
    .line 576
    iget-object v0, v2, Lw/f;->k:Ljava/util/ArrayList;

    .line 577
    .line 578
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 579
    .line 580
    .line 581
    iget-object v0, v2, Lw/f;->k:Ljava/util/ArrayList;

    .line 582
    .line 583
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 584
    .line 585
    .line 586
    iget-object v0, v3, Lw/f;->l:Ljava/util/ArrayList;

    .line 587
    .line 588
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 589
    .line 590
    .line 591
    iget-object v0, v1, Lw/f;->l:Ljava/util/ArrayList;

    .line 592
    .line 593
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 594
    .line 595
    .line 596
    goto :goto_1

    .line 597
    :cond_11
    iget-object v0, v0, Lv/d;->T:Lv/d;

    .line 598
    .line 599
    if-nez v0, :cond_12

    .line 600
    .line 601
    goto :goto_1

    .line 602
    :cond_12
    iget-object v0, v0, Lv/d;->e:Lw/m;

    .line 603
    .line 604
    iget-object v0, v0, Lw/o;->e:Lw/g;

    .line 605
    .line 606
    iget-object v5, v2, Lw/f;->l:Ljava/util/ArrayList;

    .line 607
    .line 608
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 609
    .line 610
    .line 611
    iget-object v0, v0, Lw/f;->k:Ljava/util/ArrayList;

    .line 612
    .line 613
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 614
    .line 615
    .line 616
    iput-boolean v4, v2, Lw/f;->b:Z

    .line 617
    .line 618
    iget-object v0, v2, Lw/f;->k:Ljava/util/ArrayList;

    .line 619
    .line 620
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 621
    .line 622
    .line 623
    iget-object v0, v2, Lw/f;->k:Ljava/util/ArrayList;

    .line 624
    .line 625
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 626
    .line 627
    .line 628
    :cond_13
    :goto_1
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 629
    .line 630
    iget-object v5, v0, Lv/d;->Q:[Lv/c;

    .line 631
    .line 632
    aget-object v8, v5, v7

    .line 633
    .line 634
    iget-object v9, v8, Lv/c;->f:Lv/c;

    .line 635
    .line 636
    if-eqz v9, :cond_17

    .line 637
    .line 638
    aget-object v10, v5, v4

    .line 639
    .line 640
    iget-object v10, v10, Lv/c;->f:Lv/c;

    .line 641
    .line 642
    if-eqz v10, :cond_17

    .line 643
    .line 644
    invoke-virtual {v0}, Lv/d;->x()Z

    .line 645
    .line 646
    .line 647
    move-result v0

    .line 648
    if-eqz v0, :cond_14

    .line 649
    .line 650
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 651
    .line 652
    iget-object v0, v0, Lv/d;->Q:[Lv/c;

    .line 653
    .line 654
    aget-object v0, v0, v7

    .line 655
    .line 656
    invoke-virtual {v0}, Lv/c;->e()I

    .line 657
    .line 658
    .line 659
    move-result v0

    .line 660
    iput v0, v3, Lw/f;->f:I

    .line 661
    .line 662
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 663
    .line 664
    iget-object v0, v0, Lv/d;->Q:[Lv/c;

    .line 665
    .line 666
    aget-object v0, v0, v4

    .line 667
    .line 668
    invoke-virtual {v0}, Lv/c;->e()I

    .line 669
    .line 670
    .line 671
    move-result v0

    .line 672
    neg-int v0, v0

    .line 673
    iput v0, v1, Lw/f;->f:I

    .line 674
    .line 675
    goto/16 :goto_2

    .line 676
    .line 677
    :cond_14
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 678
    .line 679
    iget-object v0, v0, Lv/d;->Q:[Lv/c;

    .line 680
    .line 681
    aget-object v0, v0, v7

    .line 682
    .line 683
    invoke-static {v0}, Lw/o;->h(Lv/c;)Lw/f;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    iget-object v1, p0, Lw/o;->b:Lv/d;

    .line 688
    .line 689
    iget-object v1, v1, Lv/d;->Q:[Lv/c;

    .line 690
    .line 691
    aget-object v1, v1, v4

    .line 692
    .line 693
    invoke-static {v1}, Lw/o;->h(Lv/c;)Lw/f;

    .line 694
    .line 695
    .line 696
    move-result-object v1

    .line 697
    if-eqz v0, :cond_15

    .line 698
    .line 699
    invoke-virtual {v0, p0}, Lw/f;->b(Lw/o;)V

    .line 700
    .line 701
    .line 702
    :cond_15
    if-eqz v1, :cond_16

    .line 703
    .line 704
    invoke-virtual {v1, p0}, Lw/f;->b(Lw/o;)V

    .line 705
    .line 706
    .line 707
    :cond_16
    iput v6, p0, Lw/o;->j:I

    .line 708
    .line 709
    goto :goto_2

    .line 710
    :cond_17
    if-eqz v9, :cond_18

    .line 711
    .line 712
    invoke-static {v8}, Lw/o;->h(Lv/c;)Lw/f;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    if-eqz v0, :cond_1a

    .line 717
    .line 718
    iget-object v5, p0, Lw/o;->b:Lv/d;

    .line 719
    .line 720
    iget-object v5, v5, Lv/d;->Q:[Lv/c;

    .line 721
    .line 722
    aget-object v5, v5, v7

    .line 723
    .line 724
    invoke-virtual {v5}, Lv/c;->e()I

    .line 725
    .line 726
    .line 727
    move-result v5

    .line 728
    invoke-static {v3, v0, v5}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 729
    .line 730
    .line 731
    invoke-virtual {p0, v1, v3, v4, v2}, Lw/o;->c(Lw/f;Lw/f;ILw/g;)V

    .line 732
    .line 733
    .line 734
    goto :goto_2

    .line 735
    :cond_18
    aget-object v5, v5, v4

    .line 736
    .line 737
    iget-object v6, v5, Lv/c;->f:Lv/c;

    .line 738
    .line 739
    if-eqz v6, :cond_19

    .line 740
    .line 741
    invoke-static {v5}, Lw/o;->h(Lv/c;)Lw/f;

    .line 742
    .line 743
    .line 744
    move-result-object v0

    .line 745
    if-eqz v0, :cond_1a

    .line 746
    .line 747
    iget-object v5, p0, Lw/o;->b:Lv/d;

    .line 748
    .line 749
    iget-object v5, v5, Lv/d;->Q:[Lv/c;

    .line 750
    .line 751
    aget-object v4, v5, v4

    .line 752
    .line 753
    invoke-virtual {v4}, Lv/c;->e()I

    .line 754
    .line 755
    .line 756
    move-result v4

    .line 757
    neg-int v4, v4

    .line 758
    invoke-static {v1, v0, v4}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 759
    .line 760
    .line 761
    const/4 v0, -0x1

    .line 762
    invoke-virtual {p0, v3, v1, v0, v2}, Lw/o;->c(Lw/f;Lw/f;ILw/g;)V

    .line 763
    .line 764
    .line 765
    goto :goto_2

    .line 766
    :cond_19
    instance-of v5, v0, Lv/i;

    .line 767
    .line 768
    if-nez v5, :cond_1a

    .line 769
    .line 770
    iget-object v5, v0, Lv/d;->T:Lv/d;

    .line 771
    .line 772
    if-eqz v5, :cond_1a

    .line 773
    .line 774
    iget-object v5, v5, Lv/d;->d:Lw/k;

    .line 775
    .line 776
    iget-object v5, v5, Lw/o;->h:Lw/f;

    .line 777
    .line 778
    invoke-virtual {v0}, Lv/d;->r()I

    .line 779
    .line 780
    .line 781
    move-result v0

    .line 782
    invoke-static {v3, v5, v0}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 783
    .line 784
    .line 785
    invoke-virtual {p0, v1, v3, v4, v2}, Lw/o;->c(Lw/f;Lw/f;ILw/g;)V

    .line 786
    .line 787
    .line 788
    :cond_1a
    :goto_2
    return-void
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw/o;->h:Lw/f;

    .line 2
    .line 3
    iget-boolean v1, v0, Lw/f;->j:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lw/o;->b:Lv/d;

    .line 8
    .line 9
    iget v0, v0, Lw/f;->g:I

    .line 10
    .line 11
    iput v0, v1, Lv/d;->Y:I

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final f()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lw/o;->c:Lw/l;

    .line 3
    .line 4
    iget-object v0, p0, Lw/o;->h:Lw/f;

    .line 5
    .line 6
    invoke-virtual {v0}, Lw/f;->c()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lw/o;->i:Lw/f;

    .line 10
    .line 11
    invoke-virtual {v0}, Lw/f;->c()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lw/o;->e:Lw/g;

    .line 15
    .line 16
    invoke-virtual {v0}, Lw/f;->c()V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p0, Lw/o;->g:Z

    .line 21
    .line 22
    return-void
.end method

.method public final k()Z
    .locals 3

    .line 1
    iget v0, p0, Lw/o;->d:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 8
    .line 9
    iget v0, v0, Lv/d;->r:I

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return v2

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_1
    return v2
.end method

.method public final n()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lw/o;->g:Z

    .line 3
    .line 4
    iget-object v1, p0, Lw/o;->h:Lw/f;

    .line 5
    .line 6
    invoke-virtual {v1}, Lw/f;->c()V

    .line 7
    .line 8
    .line 9
    iput-boolean v0, v1, Lw/f;->j:Z

    .line 10
    .line 11
    iget-object v1, p0, Lw/o;->i:Lw/f;

    .line 12
    .line 13
    invoke-virtual {v1}, Lw/f;->c()V

    .line 14
    .line 15
    .line 16
    iput-boolean v0, v1, Lw/f;->j:Z

    .line 17
    .line 18
    iget-object v1, p0, Lw/o;->e:Lw/g;

    .line 19
    .line 20
    iput-boolean v0, v1, Lw/f;->j:Z

    .line 21
    .line 22
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "HorizontalRun "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lw/o;->b:Lv/d;

    .line 9
    .line 10
    iget-object v1, v1, Lv/d;->h0:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method
