.class public abstract LK/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LK/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LK/b;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LK/d;->a:LK/b;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Landroid/content/Context;LK/e;)LK/j;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget-object v4, v1, LK/e;->a:Ljava/lang/String;

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    invoke-virtual {v2, v4, v5}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    if-eqz v6, :cond_13

    .line 21
    .line 22
    iget-object v7, v6, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v8, v1, LK/e;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    if-eqz v7, :cond_12

    .line 31
    .line 32
    iget-object v4, v6, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    .line 33
    .line 34
    const/16 v7, 0x40

    .line 35
    .line 36
    invoke-virtual {v2, v4, v7}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget-object v2, v2, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 41
    .line 42
    new-instance v4, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    array-length v7, v2

    .line 48
    const/4 v8, 0x0

    .line 49
    :goto_0
    if-ge v8, v7, :cond_0

    .line 50
    .line 51
    aget-object v9, v2, v8

    .line 52
    .line 53
    invoke-virtual {v9}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    add-int/lit8 v8, v8, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    sget-object v2, LK/d;->a:LK/b;

    .line 64
    .line 65
    invoke-static {v4, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 66
    .line 67
    .line 68
    iget-object v7, v1, LK/e;->d:Ljava/util/List;

    .line 69
    .line 70
    if-eqz v7, :cond_1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    invoke-static {v3, v5}, LE/b;->l(Landroid/content/res/Resources;I)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    :goto_1
    const/4 v3, 0x0

    .line 78
    :goto_2
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    const/4 v9, 0x0

    .line 83
    if-ge v3, v8, :cond_4

    .line 84
    .line 85
    new-instance v8, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v10

    .line 91
    check-cast v10, Ljava/util/Collection;

    .line 92
    .line 93
    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 94
    .line 95
    .line 96
    invoke-static {v8, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 100
    .line 101
    .line 102
    move-result v10

    .line 103
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 104
    .line 105
    .line 106
    move-result v11

    .line 107
    if-eq v10, v11, :cond_2

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_2
    const/4 v10, 0x0

    .line 111
    :goto_3
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    if-ge v10, v11, :cond_5

    .line 116
    .line 117
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v11

    .line 121
    check-cast v11, [B

    .line 122
    .line 123
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v12

    .line 127
    check-cast v12, [B

    .line 128
    .line 129
    invoke-static {v11, v12}, Ljava/util/Arrays;->equals([B[B)Z

    .line 130
    .line 131
    .line 132
    move-result v11

    .line 133
    if-nez v11, :cond_3

    .line 134
    .line 135
    :goto_4
    add-int/lit8 v3, v3, 0x1

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_3
    add-int/lit8 v10, v10, 0x1

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_4
    move-object v6, v9

    .line 142
    :cond_5
    const/4 v2, 0x1

    .line 143
    if-nez v6, :cond_6

    .line 144
    .line 145
    new-instance v0, LK/j;

    .line 146
    .line 147
    invoke-direct {v0, v2, v9}, LK/j;-><init>(I[LK/k;)V

    .line 148
    .line 149
    .line 150
    return-object v0

    .line 151
    :cond_6
    iget-object v3, v6, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 152
    .line 153
    new-instance v4, Ljava/util/ArrayList;

    .line 154
    .line 155
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 156
    .line 157
    .line 158
    new-instance v6, Landroid/net/Uri$Builder;

    .line 159
    .line 160
    invoke-direct {v6}, Landroid/net/Uri$Builder;-><init>()V

    .line 161
    .line 162
    .line 163
    const-string v7, "content"

    .line 164
    .line 165
    invoke-virtual {v6, v7}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    invoke-virtual {v6, v3}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    invoke-virtual {v6}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    new-instance v8, Landroid/net/Uri$Builder;

    .line 178
    .line 179
    invoke-direct {v8}, Landroid/net/Uri$Builder;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v8, v7}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    invoke-virtual {v7, v3}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    const-string v7, "file"

    .line 191
    .line 192
    invoke-virtual {v3, v7}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-virtual {v3}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 201
    .line 202
    const/16 v8, 0x18

    .line 203
    .line 204
    if-ge v7, v8, :cond_7

    .line 205
    .line 206
    new-instance v7, LK/c;

    .line 207
    .line 208
    const/4 v8, 0x0

    .line 209
    invoke-direct {v7, v0, v6, v8}, LK/c;-><init>(Landroid/content/Context;Landroid/net/Uri;I)V

    .line 210
    .line 211
    .line 212
    goto :goto_5

    .line 213
    :cond_7
    new-instance v7, LK/c;

    .line 214
    .line 215
    const/4 v8, 0x1

    .line 216
    invoke-direct {v7, v0, v6, v8}, LK/c;-><init>(Landroid/content/Context;Landroid/net/Uri;I)V

    .line 217
    .line 218
    .line 219
    :goto_5
    :try_start_0
    const-string v10, "_id"

    .line 220
    .line 221
    const-string v11, "file_id"

    .line 222
    .line 223
    const-string v12, "font_ttc_index"

    .line 224
    .line 225
    const-string v13, "font_variation_settings"

    .line 226
    .line 227
    const-string v14, "font_weight"

    .line 228
    .line 229
    const-string v15, "font_italic"

    .line 230
    .line 231
    const-string v16, "result_code"

    .line 232
    .line 233
    filled-new-array/range {v10 .. v16}, [Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v12

    .line 237
    iget-object v0, v1, LK/e;->c:Ljava/lang/String;

    .line 238
    .line 239
    filled-new-array {v0}, [Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v14

    .line 243
    iget v0, v7, LK/c;->a:I

    .line 244
    .line 245
    packed-switch v0, :pswitch_data_0

    .line 246
    .line 247
    .line 248
    const-string v13, "query = ?"

    .line 249
    .line 250
    const/4 v1, 0x0

    .line 251
    iget-object v10, v7, LK/c;->b:Landroid/content/ContentProviderClient;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 252
    .line 253
    if-nez v10, :cond_8

    .line 254
    .line 255
    goto :goto_6

    .line 256
    :cond_8
    const/4 v15, 0x0

    .line 257
    const/16 v16, 0x0

    .line 258
    .line 259
    move-object v11, v6

    .line 260
    :try_start_1
    invoke-virtual/range {v10 .. v16}, Landroid/content/ContentProviderClient;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 261
    .line 262
    .line 263
    move-result-object v1
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 264
    goto :goto_6

    .line 265
    :catch_0
    move-exception v0

    .line 266
    move-object v8, v0

    .line 267
    :try_start_2
    const-string v0, "FontsProvider"

    .line 268
    .line 269
    const-string v10, "Unable to query the content provider"

    .line 270
    .line 271
    invoke-static {v0, v10, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 272
    .line 273
    .line 274
    :goto_6
    move-object v9, v1

    .line 275
    goto :goto_7

    .line 276
    :pswitch_0
    const-string v13, "query = ?"

    .line 277
    .line 278
    const/4 v1, 0x0

    .line 279
    iget-object v10, v7, LK/c;->b:Landroid/content/ContentProviderClient;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 280
    .line 281
    if-nez v10, :cond_9

    .line 282
    .line 283
    goto :goto_6

    .line 284
    :cond_9
    const/4 v15, 0x0

    .line 285
    const/16 v16, 0x0

    .line 286
    .line 287
    move-object v11, v6

    .line 288
    :try_start_3
    invoke-virtual/range {v10 .. v16}, Landroid/content/ContentProviderClient;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 289
    .line 290
    .line 291
    move-result-object v1
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 292
    goto :goto_6

    .line 293
    :catch_1
    move-exception v0

    .line 294
    move-object v8, v0

    .line 295
    :try_start_4
    const-string v0, "FontsProvider"

    .line 296
    .line 297
    const-string v10, "Unable to query the content provider"

    .line 298
    .line 299
    invoke-static {v0, v10, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 300
    .line 301
    .line 302
    goto :goto_6

    .line 303
    :goto_7
    if-eqz v9, :cond_f

    .line 304
    .line 305
    invoke-interface {v9}, Landroid/database/Cursor;->getCount()I

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    if-lez v0, :cond_f

    .line 310
    .line 311
    const-string v0, "result_code"

    .line 312
    .line 313
    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    new-instance v4, Ljava/util/ArrayList;

    .line 318
    .line 319
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 320
    .line 321
    .line 322
    const-string v1, "_id"

    .line 323
    .line 324
    invoke-interface {v9, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 325
    .line 326
    .line 327
    move-result v1

    .line 328
    const-string v8, "file_id"

    .line 329
    .line 330
    invoke-interface {v9, v8}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 331
    .line 332
    .line 333
    move-result v8

    .line 334
    const-string v10, "font_ttc_index"

    .line 335
    .line 336
    invoke-interface {v9, v10}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 337
    .line 338
    .line 339
    move-result v10

    .line 340
    const-string v11, "font_weight"

    .line 341
    .line 342
    invoke-interface {v9, v11}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 343
    .line 344
    .line 345
    move-result v11

    .line 346
    const-string v12, "font_italic"

    .line 347
    .line 348
    invoke-interface {v9, v12}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 349
    .line 350
    .line 351
    move-result v12

    .line 352
    :goto_8
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    .line 353
    .line 354
    .line 355
    move-result v13

    .line 356
    if-eqz v13, :cond_f

    .line 357
    .line 358
    const/4 v13, -0x1

    .line 359
    if-eq v0, v13, :cond_a

    .line 360
    .line 361
    invoke-interface {v9, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 362
    .line 363
    .line 364
    move-result v14

    .line 365
    move/from16 v20, v14

    .line 366
    .line 367
    goto :goto_9

    .line 368
    :catchall_0
    move-exception v0

    .line 369
    goto :goto_f

    .line 370
    :cond_a
    const/16 v20, 0x0

    .line 371
    .line 372
    :goto_9
    if-eq v10, v13, :cond_b

    .line 373
    .line 374
    invoke-interface {v9, v10}, Landroid/database/Cursor;->getInt(I)I

    .line 375
    .line 376
    .line 377
    move-result v14

    .line 378
    move/from16 v17, v14

    .line 379
    .line 380
    goto :goto_a

    .line 381
    :cond_b
    const/16 v17, 0x0

    .line 382
    .line 383
    :goto_a
    if-ne v8, v13, :cond_c

    .line 384
    .line 385
    invoke-interface {v9, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 386
    .line 387
    .line 388
    move-result-wide v14

    .line 389
    invoke-static {v6, v14, v15}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    .line 390
    .line 391
    .line 392
    move-result-object v14

    .line 393
    :goto_b
    move-object/from16 v16, v14

    .line 394
    .line 395
    goto :goto_c

    .line 396
    :cond_c
    invoke-interface {v9, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 397
    .line 398
    .line 399
    move-result-wide v14

    .line 400
    invoke-static {v3, v14, v15}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    .line 401
    .line 402
    .line 403
    move-result-object v14

    .line 404
    goto :goto_b

    .line 405
    :goto_c
    if-eq v11, v13, :cond_d

    .line 406
    .line 407
    invoke-interface {v9, v11}, Landroid/database/Cursor;->getInt(I)I

    .line 408
    .line 409
    .line 410
    move-result v14

    .line 411
    move/from16 v18, v14

    .line 412
    .line 413
    goto :goto_d

    .line 414
    :cond_d
    const/16 v14, 0x190

    .line 415
    .line 416
    const/16 v18, 0x190

    .line 417
    .line 418
    :goto_d
    if-eq v12, v13, :cond_e

    .line 419
    .line 420
    invoke-interface {v9, v12}, Landroid/database/Cursor;->getInt(I)I

    .line 421
    .line 422
    .line 423
    move-result v13

    .line 424
    if-ne v13, v2, :cond_e

    .line 425
    .line 426
    const/16 v19, 0x1

    .line 427
    .line 428
    goto :goto_e

    .line 429
    :cond_e
    const/16 v19, 0x0

    .line 430
    .line 431
    :goto_e
    new-instance v13, LK/k;

    .line 432
    .line 433
    move-object v15, v13

    .line 434
    invoke-direct/range {v15 .. v20}, LK/k;-><init>(Landroid/net/Uri;IIZI)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 438
    .line 439
    .line 440
    goto :goto_8

    .line 441
    :cond_f
    if-eqz v9, :cond_10

    .line 442
    .line 443
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 444
    .line 445
    .line 446
    :cond_10
    invoke-virtual {v7}, LK/c;->a()V

    .line 447
    .line 448
    .line 449
    new-array v0, v5, [LK/k;

    .line 450
    .line 451
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    check-cast v0, [LK/k;

    .line 456
    .line 457
    new-instance v1, LK/j;

    .line 458
    .line 459
    invoke-direct {v1, v5, v0}, LK/j;-><init>(I[LK/k;)V

    .line 460
    .line 461
    .line 462
    return-object v1

    .line 463
    :goto_f
    if-eqz v9, :cond_11

    .line 464
    .line 465
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 466
    .line 467
    .line 468
    :cond_11
    invoke-virtual {v7}, LK/c;->a()V

    .line 469
    .line 470
    .line 471
    throw v0

    .line 472
    :cond_12
    new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;

    .line 473
    .line 474
    new-instance v1, Ljava/lang/StringBuilder;

    .line 475
    .line 476
    const-string v2, "Found content provider "

    .line 477
    .line 478
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    const-string v2, ", but package was not "

    .line 485
    .line 486
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 490
    .line 491
    .line 492
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    invoke-direct {v0, v1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    .line 497
    .line 498
    .line 499
    throw v0

    .line 500
    :cond_13
    new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;

    .line 501
    .line 502
    new-instance v1, Ljava/lang/StringBuilder;

    .line 503
    .line 504
    const-string v2, "No package found for authority: "

    .line 505
    .line 506
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v1

    .line 516
    invoke-direct {v0, v1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    .line 517
    .line 518
    .line 519
    throw v0

    .line 520
    nop

    .line 521
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
