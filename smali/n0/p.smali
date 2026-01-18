.class public final Ln0/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public f:Ln0/m;

.field public g:Landroid/widget/FrameLayout;


# virtual methods
.method public final onPreDraw()Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ln0/p;->g:Landroid/widget/FrameLayout;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2, v0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 13
    .line 14
    .line 15
    sget-object v1, Ln0/q;->c:Ljava/util/ArrayList;

    .line 16
    .line 17
    iget-object v3, v0, Ln0/p;->g:Landroid/widget/FrameLayout;

    .line 18
    .line 19
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v8, 0x1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    return v8

    .line 27
    :cond_0
    invoke-static {}, Ln0/q;->b()Lr/b;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-virtual {v1, v3, v2}, Lr/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Ljava/util/ArrayList;

    .line 37
    .line 38
    if-nez v4, :cond_2

    .line 39
    .line 40
    new-instance v4, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v3, v4}, Lr/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    :cond_1
    move-object v5, v2

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-lez v5, :cond_1

    .line 55
    .line 56
    new-instance v5, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 59
    .line 60
    .line 61
    :goto_0
    iget-object v9, v0, Ln0/p;->f:Ln0/m;

    .line 62
    .line 63
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    new-instance v4, Ln0/o;

    .line 67
    .line 68
    invoke-direct {v4, v0, v1}, Ln0/o;-><init>(Ln0/p;Lr/b;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v9, v4}, Ln0/m;->a(Ln0/k;)V

    .line 72
    .line 73
    .line 74
    const/4 v1, 0x0

    .line 75
    invoke-virtual {v9, v3, v1}, Ln0/m;->h(Landroid/widget/FrameLayout;Z)V

    .line 76
    .line 77
    .line 78
    if-eqz v5, :cond_3

    .line 79
    .line 80
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-eqz v5, :cond_3

    .line 89
    .line 90
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    check-cast v5, Ln0/m;

    .line 95
    .line 96
    invoke-virtual {v5, v3}, Ln0/m;->y(Landroid/widget/FrameLayout;)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    new-instance v4, Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 103
    .line 104
    .line 105
    iput-object v4, v9, Ln0/m;->k:Ljava/util/ArrayList;

    .line 106
    .line 107
    new-instance v4, Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 110
    .line 111
    .line 112
    iput-object v4, v9, Ln0/m;->l:Ljava/util/ArrayList;

    .line 113
    .line 114
    iget-object v4, v9, Ln0/m;->g:LA/k;

    .line 115
    .line 116
    iget-object v5, v9, Ln0/m;->h:LA/k;

    .line 117
    .line 118
    new-instance v6, Lr/b;

    .line 119
    .line 120
    iget-object v7, v4, LA/k;->f:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v7, Lr/b;

    .line 123
    .line 124
    invoke-direct {v6, v7}, Lr/b;-><init>(Lr/k;)V

    .line 125
    .line 126
    .line 127
    new-instance v7, Lr/b;

    .line 128
    .line 129
    iget-object v10, v5, LA/k;->f:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v10, Lr/b;

    .line 132
    .line 133
    invoke-direct {v7, v10}, Lr/b;-><init>(Lr/k;)V

    .line 134
    .line 135
    .line 136
    const/4 v10, 0x0

    .line 137
    :goto_2
    iget-object v11, v9, Ln0/m;->j:[I

    .line 138
    .line 139
    array-length v12, v11

    .line 140
    if-ge v10, v12, :cond_e

    .line 141
    .line 142
    aget v11, v11, v10

    .line 143
    .line 144
    if-eq v11, v8, :cond_b

    .line 145
    .line 146
    const/4 v12, 0x2

    .line 147
    if-eq v11, v12, :cond_9

    .line 148
    .line 149
    const/4 v12, 0x3

    .line 150
    if-eq v11, v12, :cond_7

    .line 151
    .line 152
    const/4 v12, 0x4

    .line 153
    if-eq v11, v12, :cond_4

    .line 154
    .line 155
    goto/16 :goto_7

    .line 156
    .line 157
    :cond_4
    iget-object v11, v4, LA/k;->h:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v11, Lr/e;

    .line 160
    .line 161
    invoke-virtual {v11}, Lr/e;->g()I

    .line 162
    .line 163
    .line 164
    move-result v12

    .line 165
    const/4 v13, 0x0

    .line 166
    :goto_3
    if-ge v13, v12, :cond_d

    .line 167
    .line 168
    invoke-virtual {v11, v13}, Lr/e;->h(I)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v14

    .line 172
    check-cast v14, Landroid/view/View;

    .line 173
    .line 174
    if-eqz v14, :cond_6

    .line 175
    .line 176
    invoke-virtual {v9, v14}, Ln0/m;->t(Landroid/view/View;)Z

    .line 177
    .line 178
    .line 179
    move-result v15

    .line 180
    if-eqz v15, :cond_6

    .line 181
    .line 182
    iget-boolean v15, v11, Lr/e;->a:Z

    .line 183
    .line 184
    if-eqz v15, :cond_5

    .line 185
    .line 186
    invoke-virtual {v11}, Lr/e;->d()V

    .line 187
    .line 188
    .line 189
    :cond_5
    iget-object v15, v11, Lr/e;->b:[J

    .line 190
    .line 191
    move-object/from16 v16, v9

    .line 192
    .line 193
    aget-wide v8, v15, v13

    .line 194
    .line 195
    iget-object v15, v5, LA/k;->h:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v15, Lr/e;

    .line 198
    .line 199
    invoke-virtual {v15, v8, v9, v2}, Lr/e;->e(JLjava/lang/Long;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    check-cast v8, Landroid/view/View;

    .line 204
    .line 205
    move-object/from16 v9, v16

    .line 206
    .line 207
    if-eqz v8, :cond_6

    .line 208
    .line 209
    invoke-virtual {v9, v8}, Ln0/m;->t(Landroid/view/View;)Z

    .line 210
    .line 211
    .line 212
    move-result v15

    .line 213
    if-eqz v15, :cond_6

    .line 214
    .line 215
    invoke-virtual {v6, v14, v2}, Lr/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v15

    .line 219
    check-cast v15, Ln0/u;

    .line 220
    .line 221
    invoke-virtual {v7, v8, v2}, Lr/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v16

    .line 225
    move-object/from16 v1, v16

    .line 226
    .line 227
    check-cast v1, Ln0/u;

    .line 228
    .line 229
    if-eqz v15, :cond_6

    .line 230
    .line 231
    if-eqz v1, :cond_6

    .line 232
    .line 233
    iget-object v2, v9, Ln0/m;->k:Ljava/util/ArrayList;

    .line 234
    .line 235
    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    iget-object v2, v9, Ln0/m;->l:Ljava/util/ArrayList;

    .line 239
    .line 240
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    invoke-virtual {v6, v14}, Lr/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v7, v8}, Lr/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    :cond_6
    add-int/lit8 v13, v13, 0x1

    .line 250
    .line 251
    const/4 v1, 0x0

    .line 252
    const/4 v2, 0x0

    .line 253
    const/4 v8, 0x1

    .line 254
    goto :goto_3

    .line 255
    :cond_7
    iget-object v1, v4, LA/k;->g:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v1, Landroid/util/SparseArray;

    .line 258
    .line 259
    iget-object v2, v5, LA/k;->g:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v2, Landroid/util/SparseArray;

    .line 262
    .line 263
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 264
    .line 265
    .line 266
    move-result v8

    .line 267
    const/4 v11, 0x0

    .line 268
    :goto_4
    if-ge v11, v8, :cond_d

    .line 269
    .line 270
    invoke-virtual {v1, v11}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v12

    .line 274
    check-cast v12, Landroid/view/View;

    .line 275
    .line 276
    if-eqz v12, :cond_8

    .line 277
    .line 278
    invoke-virtual {v9, v12}, Ln0/m;->t(Landroid/view/View;)Z

    .line 279
    .line 280
    .line 281
    move-result v13

    .line 282
    if-eqz v13, :cond_8

    .line 283
    .line 284
    invoke-virtual {v1, v11}, Landroid/util/SparseArray;->keyAt(I)I

    .line 285
    .line 286
    .line 287
    move-result v13

    .line 288
    invoke-virtual {v2, v13}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v13

    .line 292
    check-cast v13, Landroid/view/View;

    .line 293
    .line 294
    if-eqz v13, :cond_8

    .line 295
    .line 296
    invoke-virtual {v9, v13}, Ln0/m;->t(Landroid/view/View;)Z

    .line 297
    .line 298
    .line 299
    move-result v14

    .line 300
    if-eqz v14, :cond_8

    .line 301
    .line 302
    const/4 v14, 0x0

    .line 303
    invoke-virtual {v6, v12, v14}, Lr/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v15

    .line 307
    check-cast v15, Ln0/u;

    .line 308
    .line 309
    invoke-virtual {v7, v13, v14}, Lr/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v17

    .line 313
    move-object/from16 v14, v17

    .line 314
    .line 315
    check-cast v14, Ln0/u;

    .line 316
    .line 317
    if-eqz v15, :cond_8

    .line 318
    .line 319
    if-eqz v14, :cond_8

    .line 320
    .line 321
    iget-object v0, v9, Ln0/m;->k:Ljava/util/ArrayList;

    .line 322
    .line 323
    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    iget-object v0, v9, Ln0/m;->l:Ljava/util/ArrayList;

    .line 327
    .line 328
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    invoke-virtual {v6, v12}, Lr/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v7, v13}, Lr/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    :cond_8
    add-int/lit8 v11, v11, 0x1

    .line 338
    .line 339
    move-object/from16 v0, p0

    .line 340
    .line 341
    goto :goto_4

    .line 342
    :cond_9
    iget-object v0, v4, LA/k;->i:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v0, Lr/b;

    .line 345
    .line 346
    iget v1, v0, Lr/k;->c:I

    .line 347
    .line 348
    const/4 v2, 0x0

    .line 349
    :goto_5
    if-ge v2, v1, :cond_d

    .line 350
    .line 351
    invoke-virtual {v0, v2}, Lr/k;->j(I)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v8

    .line 355
    check-cast v8, Landroid/view/View;

    .line 356
    .line 357
    if-eqz v8, :cond_a

    .line 358
    .line 359
    invoke-virtual {v9, v8}, Ln0/m;->t(Landroid/view/View;)Z

    .line 360
    .line 361
    .line 362
    move-result v11

    .line 363
    if-eqz v11, :cond_a

    .line 364
    .line 365
    invoke-virtual {v0, v2}, Lr/k;->h(I)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v11

    .line 369
    iget-object v12, v5, LA/k;->i:Ljava/lang/Object;

    .line 370
    .line 371
    check-cast v12, Lr/b;

    .line 372
    .line 373
    const/4 v13, 0x0

    .line 374
    invoke-virtual {v12, v11, v13}, Lr/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v11

    .line 378
    check-cast v11, Landroid/view/View;

    .line 379
    .line 380
    if-eqz v11, :cond_a

    .line 381
    .line 382
    invoke-virtual {v9, v11}, Ln0/m;->t(Landroid/view/View;)Z

    .line 383
    .line 384
    .line 385
    move-result v12

    .line 386
    if-eqz v12, :cond_a

    .line 387
    .line 388
    invoke-virtual {v6, v8, v13}, Lr/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v12

    .line 392
    check-cast v12, Ln0/u;

    .line 393
    .line 394
    invoke-virtual {v7, v11, v13}, Lr/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v14

    .line 398
    check-cast v14, Ln0/u;

    .line 399
    .line 400
    if-eqz v12, :cond_a

    .line 401
    .line 402
    if-eqz v14, :cond_a

    .line 403
    .line 404
    iget-object v13, v9, Ln0/m;->k:Ljava/util/ArrayList;

    .line 405
    .line 406
    invoke-virtual {v13, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    iget-object v12, v9, Ln0/m;->l:Ljava/util/ArrayList;

    .line 410
    .line 411
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    invoke-virtual {v6, v8}, Lr/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v7, v11}, Lr/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    :cond_a
    add-int/lit8 v2, v2, 0x1

    .line 421
    .line 422
    goto :goto_5

    .line 423
    :cond_b
    iget v0, v6, Lr/k;->c:I

    .line 424
    .line 425
    const/4 v1, 0x1

    .line 426
    sub-int/2addr v0, v1

    .line 427
    :goto_6
    if-ltz v0, :cond_d

    .line 428
    .line 429
    invoke-virtual {v6, v0}, Lr/k;->h(I)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v1

    .line 433
    check-cast v1, Landroid/view/View;

    .line 434
    .line 435
    if-eqz v1, :cond_c

    .line 436
    .line 437
    invoke-virtual {v9, v1}, Ln0/m;->t(Landroid/view/View;)Z

    .line 438
    .line 439
    .line 440
    move-result v2

    .line 441
    if-eqz v2, :cond_c

    .line 442
    .line 443
    invoke-virtual {v7, v1}, Lr/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    check-cast v1, Ln0/u;

    .line 448
    .line 449
    if-eqz v1, :cond_c

    .line 450
    .line 451
    iget-object v2, v1, Ln0/u;->b:Landroid/view/View;

    .line 452
    .line 453
    invoke-virtual {v9, v2}, Ln0/m;->t(Landroid/view/View;)Z

    .line 454
    .line 455
    .line 456
    move-result v2

    .line 457
    if-eqz v2, :cond_c

    .line 458
    .line 459
    invoke-virtual {v6, v0}, Lr/k;->i(I)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v2

    .line 463
    check-cast v2, Ln0/u;

    .line 464
    .line 465
    iget-object v8, v9, Ln0/m;->k:Ljava/util/ArrayList;

    .line 466
    .line 467
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    iget-object v2, v9, Ln0/m;->l:Ljava/util/ArrayList;

    .line 471
    .line 472
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    :cond_c
    add-int/lit8 v0, v0, -0x1

    .line 476
    .line 477
    goto :goto_6

    .line 478
    :cond_d
    :goto_7
    add-int/lit8 v10, v10, 0x1

    .line 479
    .line 480
    move-object/from16 v0, p0

    .line 481
    .line 482
    const/4 v1, 0x0

    .line 483
    const/4 v2, 0x0

    .line 484
    const/4 v8, 0x1

    .line 485
    goto/16 :goto_2

    .line 486
    .line 487
    :cond_e
    const/4 v0, 0x0

    .line 488
    :goto_8
    iget v1, v6, Lr/k;->c:I

    .line 489
    .line 490
    if-ge v0, v1, :cond_10

    .line 491
    .line 492
    invoke-virtual {v6, v0}, Lr/k;->j(I)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    check-cast v1, Ln0/u;

    .line 497
    .line 498
    iget-object v2, v1, Ln0/u;->b:Landroid/view/View;

    .line 499
    .line 500
    invoke-virtual {v9, v2}, Ln0/m;->t(Landroid/view/View;)Z

    .line 501
    .line 502
    .line 503
    move-result v2

    .line 504
    if-eqz v2, :cond_f

    .line 505
    .line 506
    iget-object v2, v9, Ln0/m;->k:Ljava/util/ArrayList;

    .line 507
    .line 508
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 509
    .line 510
    .line 511
    iget-object v1, v9, Ln0/m;->l:Ljava/util/ArrayList;

    .line 512
    .line 513
    const/4 v2, 0x0

    .line 514
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 515
    .line 516
    .line 517
    :cond_f
    add-int/lit8 v0, v0, 0x1

    .line 518
    .line 519
    goto :goto_8

    .line 520
    :cond_10
    const/4 v1, 0x0

    .line 521
    :goto_9
    iget v0, v7, Lr/k;->c:I

    .line 522
    .line 523
    if-ge v1, v0, :cond_12

    .line 524
    .line 525
    invoke-virtual {v7, v1}, Lr/k;->j(I)Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    check-cast v0, Ln0/u;

    .line 530
    .line 531
    iget-object v2, v0, Ln0/u;->b:Landroid/view/View;

    .line 532
    .line 533
    invoke-virtual {v9, v2}, Ln0/m;->t(Landroid/view/View;)Z

    .line 534
    .line 535
    .line 536
    move-result v2

    .line 537
    if-eqz v2, :cond_11

    .line 538
    .line 539
    iget-object v2, v9, Ln0/m;->l:Ljava/util/ArrayList;

    .line 540
    .line 541
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 542
    .line 543
    .line 544
    iget-object v0, v9, Ln0/m;->k:Ljava/util/ArrayList;

    .line 545
    .line 546
    const/4 v2, 0x0

    .line 547
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    :cond_11
    add-int/lit8 v1, v1, 0x1

    .line 551
    .line 552
    goto :goto_9

    .line 553
    :cond_12
    invoke-static {}, Ln0/m;->p()Lr/b;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    iget v1, v0, Lr/k;->c:I

    .line 558
    .line 559
    invoke-virtual {v3}, Landroid/view/View;->getWindowId()Landroid/view/WindowId;

    .line 560
    .line 561
    .line 562
    move-result-object v2

    .line 563
    const/4 v4, 0x1

    .line 564
    sub-int/2addr v1, v4

    .line 565
    :goto_a
    if-ltz v1, :cond_19

    .line 566
    .line 567
    invoke-virtual {v0, v1}, Lr/k;->h(I)Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v4

    .line 571
    check-cast v4, Landroid/animation/Animator;

    .line 572
    .line 573
    if-eqz v4, :cond_17

    .line 574
    .line 575
    const/4 v5, 0x0

    .line 576
    invoke-virtual {v0, v4, v5}, Lr/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v6

    .line 580
    check-cast v6, Ln0/j;

    .line 581
    .line 582
    if-eqz v6, :cond_17

    .line 583
    .line 584
    iget-object v5, v6, Ln0/j;->a:Landroid/view/View;

    .line 585
    .line 586
    if-eqz v5, :cond_17

    .line 587
    .line 588
    iget-object v7, v6, Ln0/j;->d:Landroid/view/WindowId;

    .line 589
    .line 590
    invoke-virtual {v2, v7}, Landroid/view/WindowId;->equals(Ljava/lang/Object;)Z

    .line 591
    .line 592
    .line 593
    move-result v7

    .line 594
    if-eqz v7, :cond_17

    .line 595
    .line 596
    const/4 v7, 0x1

    .line 597
    invoke-virtual {v9, v5, v7}, Ln0/m;->r(Landroid/view/View;Z)Ln0/u;

    .line 598
    .line 599
    .line 600
    move-result-object v8

    .line 601
    invoke-virtual {v9, v5, v7}, Ln0/m;->n(Landroid/view/View;Z)Ln0/u;

    .line 602
    .line 603
    .line 604
    move-result-object v10

    .line 605
    if-nez v8, :cond_13

    .line 606
    .line 607
    if-nez v10, :cond_13

    .line 608
    .line 609
    iget-object v7, v9, Ln0/m;->h:LA/k;

    .line 610
    .line 611
    iget-object v7, v7, LA/k;->f:Ljava/lang/Object;

    .line 612
    .line 613
    check-cast v7, Lr/b;

    .line 614
    .line 615
    const/4 v11, 0x0

    .line 616
    invoke-virtual {v7, v5, v11}, Lr/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v5

    .line 620
    move-object v10, v5

    .line 621
    check-cast v10, Ln0/u;

    .line 622
    .line 623
    goto :goto_b

    .line 624
    :cond_13
    const/4 v11, 0x0

    .line 625
    :goto_b
    if-nez v8, :cond_14

    .line 626
    .line 627
    if-eqz v10, :cond_18

    .line 628
    .line 629
    :cond_14
    iget-object v5, v6, Ln0/j;->c:Ln0/u;

    .line 630
    .line 631
    iget-object v6, v6, Ln0/j;->e:Ln0/m;

    .line 632
    .line 633
    invoke-virtual {v6, v5, v10}, Ln0/m;->s(Ln0/u;Ln0/u;)Z

    .line 634
    .line 635
    .line 636
    move-result v5

    .line 637
    if-eqz v5, :cond_18

    .line 638
    .line 639
    invoke-virtual {v6}, Ln0/m;->o()Ln0/m;

    .line 640
    .line 641
    .line 642
    move-result-object v5

    .line 643
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 644
    .line 645
    .line 646
    invoke-virtual {v4}, Landroid/animation/Animator;->isRunning()Z

    .line 647
    .line 648
    .line 649
    move-result v5

    .line 650
    if-nez v5, :cond_16

    .line 651
    .line 652
    invoke-virtual {v4}, Landroid/animation/Animator;->isStarted()Z

    .line 653
    .line 654
    .line 655
    move-result v5

    .line 656
    if-eqz v5, :cond_15

    .line 657
    .line 658
    goto :goto_c

    .line 659
    :cond_15
    invoke-virtual {v0, v4}, Lr/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    goto :goto_d

    .line 663
    :cond_16
    :goto_c
    invoke-virtual {v4}, Landroid/animation/Animator;->cancel()V

    .line 664
    .line 665
    .line 666
    goto :goto_d

    .line 667
    :cond_17
    const/4 v11, 0x0

    .line 668
    :cond_18
    :goto_d
    add-int/lit8 v1, v1, -0x1

    .line 669
    .line 670
    goto :goto_a

    .line 671
    :cond_19
    iget-object v4, v9, Ln0/m;->g:LA/k;

    .line 672
    .line 673
    iget-object v5, v9, Ln0/m;->h:LA/k;

    .line 674
    .line 675
    iget-object v6, v9, Ln0/m;->k:Ljava/util/ArrayList;

    .line 676
    .line 677
    iget-object v7, v9, Ln0/m;->l:Ljava/util/ArrayList;

    .line 678
    .line 679
    move-object v2, v9

    .line 680
    invoke-virtual/range {v2 .. v7}, Ln0/m;->l(Landroid/widget/FrameLayout;LA/k;LA/k;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v9}, Ln0/m;->z()V

    .line 684
    .line 685
    .line 686
    const/4 v0, 0x1

    .line 687
    return v0
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Ln0/p;->g:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 11
    .line 12
    .line 13
    sget-object p1, Ln0/q;->c:Ljava/util/ArrayList;

    .line 14
    .line 15
    iget-object v0, p0, Ln0/p;->g:Landroid/widget/FrameLayout;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    invoke-static {}, Ln0/q;->b()Lr/b;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-virtual {p1, v0, v1}, Lr/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Ljava/util/ArrayList;

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-lez v1, :cond_0

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Ln0/m;

    .line 54
    .line 55
    invoke-virtual {v1, v0}, Ln0/m;->y(Landroid/widget/FrameLayout;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    iget-object p1, p0, Ln0/p;->f:Ln0/m;

    .line 60
    .line 61
    const/4 v0, 0x1

    .line 62
    invoke-virtual {p1, v0}, Ln0/m;->i(Z)V

    .line 63
    .line 64
    .line 65
    return-void
.end method
