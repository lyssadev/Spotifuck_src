.class public final Lm/h;
.super Landroid/view/MenuInflater;
.source "SourceFile"


# static fields
.field public static final e:[Ljava/lang/Class;

.field public static final f:[Ljava/lang/Class;


# instance fields
.field public final a:[Ljava/lang/Object;

.field public final b:[Ljava/lang/Object;

.field public final c:Landroid/content/Context;

.field public d:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [Ljava/lang/Class;

    .line 3
    .line 4
    const-class v1, Landroid/content/Context;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sput-object v0, Lm/h;->e:[Ljava/lang/Class;

    .line 10
    .line 11
    sput-object v0, Lm/h;->f:[Ljava/lang/Class;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroid/view/MenuInflater;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm/h;->c:Landroid/content/Context;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    new-array v0, v0, [Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    aput-object p1, v0, v1

    .line 11
    .line 12
    iput-object v0, p0, Lm/h;->a:[Ljava/lang/Object;

    .line 13
    .line 14
    iput-object v0, p0, Lm/h;->b:[Ljava/lang/Object;

    .line 15
    .line 16
    return-void
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, Landroid/app/Activity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    check-cast p0, Landroid/content/ContextWrapper;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lm/h;->a(Landroid/content/Context;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :cond_1
    return-object p0
.end method


# virtual methods
.method public final b(Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    new-instance v2, Lm/g;

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    invoke-direct {v2, v0, v3}, Lm/g;-><init>(Lm/h;Landroid/view/Menu;)V

    .line 10
    .line 11
    .line 12
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    :goto_0
    const/4 v4, 0x1

    .line 17
    const-string v5, "menu"

    .line 18
    .line 19
    const/4 v6, 0x2

    .line 20
    if-ne v3, v6, :cond_1

    .line 21
    .line 22
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    if-eqz v7, :cond_0

    .line 31
    .line 32
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    new-instance v1, Ljava/lang/RuntimeException;

    .line 38
    .line 39
    const-string v2, "Expecting menu, got "

    .line 40
    .line 41
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v1

    .line 49
    :cond_1
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-ne v3, v4, :cond_18

    .line 54
    .line 55
    :goto_1
    const/4 v7, 0x0

    .line 56
    const/4 v9, 0x0

    .line 57
    const/4 v10, 0x0

    .line 58
    const/4 v11, 0x0

    .line 59
    :goto_2
    if-nez v9, :cond_17

    .line 60
    .line 61
    if-eq v3, v4, :cond_16

    .line 62
    .line 63
    const-string v12, "item"

    .line 64
    .line 65
    const-string v13, "group"

    .line 66
    .line 67
    const/4 v14, 0x3

    .line 68
    if-eq v3, v6, :cond_8

    .line 69
    .line 70
    if-eq v3, v14, :cond_3

    .line 71
    .line 72
    :cond_2
    :goto_3
    move-object/from16 v8, p1

    .line 73
    .line 74
    const/4 v4, 0x0

    .line 75
    :goto_4
    const/4 v6, 0x1

    .line 76
    goto/16 :goto_d

    .line 77
    .line 78
    :cond_3
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    if-eqz v10, :cond_4

    .line 83
    .line 84
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v14

    .line 88
    if-eqz v14, :cond_4

    .line 89
    .line 90
    move-object/from16 v8, p1

    .line 91
    .line 92
    const/4 v4, 0x0

    .line 93
    const/4 v6, 0x1

    .line 94
    const/4 v10, 0x0

    .line 95
    const/4 v11, 0x0

    .line 96
    goto/16 :goto_d

    .line 97
    .line 98
    :cond_4
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v13

    .line 102
    if-eqz v13, :cond_5

    .line 103
    .line 104
    iput v7, v2, Lm/g;->b:I

    .line 105
    .line 106
    iput v7, v2, Lm/g;->c:I

    .line 107
    .line 108
    iput v7, v2, Lm/g;->d:I

    .line 109
    .line 110
    iput v7, v2, Lm/g;->e:I

    .line 111
    .line 112
    iput-boolean v4, v2, Lm/g;->f:Z

    .line 113
    .line 114
    iput-boolean v4, v2, Lm/g;->g:Z

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_5
    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v12

    .line 121
    if-eqz v12, :cond_7

    .line 122
    .line 123
    iget-boolean v3, v2, Lm/g;->h:Z

    .line 124
    .line 125
    if-nez v3, :cond_2

    .line 126
    .line 127
    iget-object v3, v2, Lm/g;->z:Ln/o;

    .line 128
    .line 129
    if-eqz v3, :cond_6

    .line 130
    .line 131
    iget-object v3, v3, Ln/o;->b:Landroid/view/ActionProvider;

    .line 132
    .line 133
    invoke-virtual {v3}, Landroid/view/ActionProvider;->hasSubMenu()Z

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-eqz v3, :cond_6

    .line 138
    .line 139
    iput-boolean v4, v2, Lm/g;->h:Z

    .line 140
    .line 141
    iget v3, v2, Lm/g;->b:I

    .line 142
    .line 143
    iget v12, v2, Lm/g;->i:I

    .line 144
    .line 145
    iget v13, v2, Lm/g;->j:I

    .line 146
    .line 147
    iget-object v14, v2, Lm/g;->k:Ljava/lang/CharSequence;

    .line 148
    .line 149
    iget-object v15, v2, Lm/g;->a:Landroid/view/Menu;

    .line 150
    .line 151
    invoke-interface {v15, v3, v12, v13, v14}, Landroid/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    invoke-interface {v3}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    invoke-virtual {v2, v3}, Lm/g;->b(Landroid/view/MenuItem;)V

    .line 160
    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_6
    iput-boolean v4, v2, Lm/g;->h:Z

    .line 164
    .line 165
    iget v3, v2, Lm/g;->b:I

    .line 166
    .line 167
    iget v12, v2, Lm/g;->i:I

    .line 168
    .line 169
    iget v13, v2, Lm/g;->j:I

    .line 170
    .line 171
    iget-object v14, v2, Lm/g;->k:Ljava/lang/CharSequence;

    .line 172
    .line 173
    iget-object v15, v2, Lm/g;->a:Landroid/view/Menu;

    .line 174
    .line 175
    invoke-interface {v15, v3, v12, v13, v14}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-virtual {v2, v3}, Lm/g;->b(Landroid/view/MenuItem;)V

    .line 180
    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_7
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    if-eqz v3, :cond_2

    .line 188
    .line 189
    move-object/from16 v8, p1

    .line 190
    .line 191
    const/4 v4, 0x0

    .line 192
    const/4 v6, 0x1

    .line 193
    const/4 v9, 0x1

    .line 194
    goto/16 :goto_d

    .line 195
    .line 196
    :cond_8
    if-eqz v10, :cond_9

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_9
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v13

    .line 207
    const/4 v15, 0x5

    .line 208
    const/4 v8, 0x4

    .line 209
    iget-object v6, v2, Lm/g;->E:Lm/h;

    .line 210
    .line 211
    if-eqz v13, :cond_a

    .line 212
    .line 213
    iget-object v3, v6, Lm/h;->c:Landroid/content/Context;

    .line 214
    .line 215
    sget-object v6, Lg/a;->p:[I

    .line 216
    .line 217
    invoke-virtual {v3, v1, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    invoke-virtual {v3, v4, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 222
    .line 223
    .line 224
    move-result v6

    .line 225
    iput v6, v2, Lm/g;->b:I

    .line 226
    .line 227
    invoke-virtual {v3, v14, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 228
    .line 229
    .line 230
    move-result v6

    .line 231
    iput v6, v2, Lm/g;->c:I

    .line 232
    .line 233
    invoke-virtual {v3, v8, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 234
    .line 235
    .line 236
    move-result v6

    .line 237
    iput v6, v2, Lm/g;->d:I

    .line 238
    .line 239
    invoke-virtual {v3, v15, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 240
    .line 241
    .line 242
    move-result v6

    .line 243
    iput v6, v2, Lm/g;->e:I

    .line 244
    .line 245
    const/4 v6, 0x2

    .line 246
    invoke-virtual {v3, v6, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 247
    .line 248
    .line 249
    move-result v8

    .line 250
    iput-boolean v8, v2, Lm/g;->f:Z

    .line 251
    .line 252
    invoke-virtual {v3, v7, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 253
    .line 254
    .line 255
    move-result v6

    .line 256
    iput-boolean v6, v2, Lm/g;->g:Z

    .line 257
    .line 258
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 259
    .line 260
    .line 261
    goto/16 :goto_3

    .line 262
    .line 263
    :cond_a
    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v12

    .line 267
    if-eqz v12, :cond_14

    .line 268
    .line 269
    iget-object v3, v6, Lm/h;->c:Landroid/content/Context;

    .line 270
    .line 271
    sget-object v12, Lg/a;->q:[I

    .line 272
    .line 273
    invoke-virtual {v3, v1, v12}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 274
    .line 275
    .line 276
    move-result-object v12

    .line 277
    const/4 v13, 0x2

    .line 278
    invoke-virtual {v12, v13, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 279
    .line 280
    .line 281
    move-result v4

    .line 282
    iput v4, v2, Lm/g;->i:I

    .line 283
    .line 284
    iget v4, v2, Lm/g;->c:I

    .line 285
    .line 286
    invoke-virtual {v12, v15, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 287
    .line 288
    .line 289
    move-result v4

    .line 290
    iget v15, v2, Lm/g;->d:I

    .line 291
    .line 292
    const/4 v13, 0x6

    .line 293
    invoke-virtual {v12, v13, v15}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 294
    .line 295
    .line 296
    move-result v13

    .line 297
    const/high16 v15, -0x10000

    .line 298
    .line 299
    and-int/2addr v4, v15

    .line 300
    const v15, 0xffff

    .line 301
    .line 302
    .line 303
    and-int/2addr v13, v15

    .line 304
    or-int/2addr v4, v13

    .line 305
    iput v4, v2, Lm/g;->j:I

    .line 306
    .line 307
    const/4 v4, 0x7

    .line 308
    invoke-virtual {v12, v4}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 309
    .line 310
    .line 311
    move-result-object v4

    .line 312
    iput-object v4, v2, Lm/g;->k:Ljava/lang/CharSequence;

    .line 313
    .line 314
    const/16 v4, 0x8

    .line 315
    .line 316
    invoke-virtual {v12, v4}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 317
    .line 318
    .line 319
    move-result-object v4

    .line 320
    iput-object v4, v2, Lm/g;->l:Ljava/lang/CharSequence;

    .line 321
    .line 322
    invoke-virtual {v12, v7, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 323
    .line 324
    .line 325
    move-result v4

    .line 326
    iput v4, v2, Lm/g;->m:I

    .line 327
    .line 328
    const/16 v4, 0x9

    .line 329
    .line 330
    invoke-virtual {v12, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v4

    .line 334
    if-nez v4, :cond_b

    .line 335
    .line 336
    const/4 v4, 0x0

    .line 337
    goto :goto_5

    .line 338
    :cond_b
    invoke-virtual {v4, v7}, Ljava/lang/String;->charAt(I)C

    .line 339
    .line 340
    .line 341
    move-result v4

    .line 342
    :goto_5
    iput-char v4, v2, Lm/g;->n:C

    .line 343
    .line 344
    const/16 v4, 0x10

    .line 345
    .line 346
    const/16 v13, 0x1000

    .line 347
    .line 348
    invoke-virtual {v12, v4, v13}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 349
    .line 350
    .line 351
    move-result v4

    .line 352
    iput v4, v2, Lm/g;->o:I

    .line 353
    .line 354
    const/16 v4, 0xa

    .line 355
    .line 356
    invoke-virtual {v12, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    if-nez v4, :cond_c

    .line 361
    .line 362
    const/4 v4, 0x0

    .line 363
    goto :goto_6

    .line 364
    :cond_c
    invoke-virtual {v4, v7}, Ljava/lang/String;->charAt(I)C

    .line 365
    .line 366
    .line 367
    move-result v4

    .line 368
    :goto_6
    iput-char v4, v2, Lm/g;->p:C

    .line 369
    .line 370
    const/16 v4, 0x14

    .line 371
    .line 372
    invoke-virtual {v12, v4, v13}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 373
    .line 374
    .line 375
    move-result v4

    .line 376
    iput v4, v2, Lm/g;->q:I

    .line 377
    .line 378
    const/16 v4, 0xb

    .line 379
    .line 380
    invoke-virtual {v12, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 381
    .line 382
    .line 383
    move-result v13

    .line 384
    if-eqz v13, :cond_d

    .line 385
    .line 386
    invoke-virtual {v12, v4, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 387
    .line 388
    .line 389
    move-result v4

    .line 390
    iput v4, v2, Lm/g;->r:I

    .line 391
    .line 392
    goto :goto_7

    .line 393
    :cond_d
    iget v4, v2, Lm/g;->e:I

    .line 394
    .line 395
    iput v4, v2, Lm/g;->r:I

    .line 396
    .line 397
    :goto_7
    invoke-virtual {v12, v14, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 398
    .line 399
    .line 400
    move-result v4

    .line 401
    iput-boolean v4, v2, Lm/g;->s:Z

    .line 402
    .line 403
    iget-boolean v4, v2, Lm/g;->f:Z

    .line 404
    .line 405
    invoke-virtual {v12, v8, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 406
    .line 407
    .line 408
    move-result v4

    .line 409
    iput-boolean v4, v2, Lm/g;->t:Z

    .line 410
    .line 411
    iget-boolean v4, v2, Lm/g;->g:Z

    .line 412
    .line 413
    const/4 v8, 0x1

    .line 414
    invoke-virtual {v12, v8, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 415
    .line 416
    .line 417
    move-result v4

    .line 418
    iput-boolean v4, v2, Lm/g;->u:Z

    .line 419
    .line 420
    const/16 v4, 0x15

    .line 421
    .line 422
    const/4 v8, -0x1

    .line 423
    invoke-virtual {v12, v4, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 424
    .line 425
    .line 426
    move-result v4

    .line 427
    iput v4, v2, Lm/g;->v:I

    .line 428
    .line 429
    const/16 v4, 0xc

    .line 430
    .line 431
    invoke-virtual {v12, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v4

    .line 435
    iput-object v4, v2, Lm/g;->y:Ljava/lang/String;

    .line 436
    .line 437
    const/16 v4, 0xd

    .line 438
    .line 439
    invoke-virtual {v12, v4, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 440
    .line 441
    .line 442
    move-result v4

    .line 443
    iput v4, v2, Lm/g;->w:I

    .line 444
    .line 445
    const/16 v4, 0xf

    .line 446
    .line 447
    invoke-virtual {v12, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v4

    .line 451
    iput-object v4, v2, Lm/g;->x:Ljava/lang/String;

    .line 452
    .line 453
    const/16 v4, 0xe

    .line 454
    .line 455
    invoke-virtual {v12, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v4

    .line 459
    if-eqz v4, :cond_e

    .line 460
    .line 461
    const/4 v13, 0x1

    .line 462
    goto :goto_8

    .line 463
    :cond_e
    const/4 v13, 0x0

    .line 464
    :goto_8
    if-eqz v13, :cond_f

    .line 465
    .line 466
    iget v14, v2, Lm/g;->w:I

    .line 467
    .line 468
    if-nez v14, :cond_f

    .line 469
    .line 470
    iget-object v14, v2, Lm/g;->x:Ljava/lang/String;

    .line 471
    .line 472
    if-nez v14, :cond_f

    .line 473
    .line 474
    sget-object v13, Lm/h;->f:[Ljava/lang/Class;

    .line 475
    .line 476
    iget-object v6, v6, Lm/h;->b:[Ljava/lang/Object;

    .line 477
    .line 478
    invoke-virtual {v2, v4, v13, v6}, Lm/g;->a(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v4

    .line 482
    check-cast v4, Ln/o;

    .line 483
    .line 484
    iput-object v4, v2, Lm/g;->z:Ln/o;

    .line 485
    .line 486
    goto :goto_9

    .line 487
    :cond_f
    if-eqz v13, :cond_10

    .line 488
    .line 489
    const-string v4, "SupportMenuInflater"

    .line 490
    .line 491
    const-string v6, "Ignoring attribute \'actionProviderClass\'. Action view already specified."

    .line 492
    .line 493
    invoke-static {v4, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 494
    .line 495
    .line 496
    :cond_10
    const/4 v4, 0x0

    .line 497
    iput-object v4, v2, Lm/g;->z:Ln/o;

    .line 498
    .line 499
    :goto_9
    const/16 v4, 0x11

    .line 500
    .line 501
    invoke-virtual {v12, v4}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 502
    .line 503
    .line 504
    move-result-object v4

    .line 505
    iput-object v4, v2, Lm/g;->A:Ljava/lang/CharSequence;

    .line 506
    .line 507
    const/16 v4, 0x16

    .line 508
    .line 509
    invoke-virtual {v12, v4}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 510
    .line 511
    .line 512
    move-result-object v4

    .line 513
    iput-object v4, v2, Lm/g;->B:Ljava/lang/CharSequence;

    .line 514
    .line 515
    const/16 v4, 0x13

    .line 516
    .line 517
    invoke-virtual {v12, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 518
    .line 519
    .line 520
    move-result v6

    .line 521
    if-eqz v6, :cond_11

    .line 522
    .line 523
    invoke-virtual {v12, v4, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 524
    .line 525
    .line 526
    move-result v4

    .line 527
    iget-object v6, v2, Lm/g;->D:Landroid/graphics/PorterDuff$Mode;

    .line 528
    .line 529
    invoke-static {v4, v6}, Lo/p0;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 530
    .line 531
    .line 532
    move-result-object v4

    .line 533
    iput-object v4, v2, Lm/g;->D:Landroid/graphics/PorterDuff$Mode;

    .line 534
    .line 535
    goto :goto_a

    .line 536
    :cond_11
    const/4 v4, 0x0

    .line 537
    iput-object v4, v2, Lm/g;->D:Landroid/graphics/PorterDuff$Mode;

    .line 538
    .line 539
    :goto_a
    const/16 v4, 0x12

    .line 540
    .line 541
    invoke-virtual {v12, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 542
    .line 543
    .line 544
    move-result v6

    .line 545
    if-eqz v6, :cond_13

    .line 546
    .line 547
    invoke-virtual {v12, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 548
    .line 549
    .line 550
    move-result v6

    .line 551
    if-eqz v6, :cond_12

    .line 552
    .line 553
    invoke-virtual {v12, v4, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 554
    .line 555
    .line 556
    move-result v6

    .line 557
    if-eqz v6, :cond_12

    .line 558
    .line 559
    invoke-static {v3, v6}, Lp0/a;->I(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 560
    .line 561
    .line 562
    move-result-object v3

    .line 563
    if-eqz v3, :cond_12

    .line 564
    .line 565
    goto :goto_b

    .line 566
    :cond_12
    invoke-virtual {v12, v4}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 567
    .line 568
    .line 569
    move-result-object v3

    .line 570
    :goto_b
    iput-object v3, v2, Lm/g;->C:Landroid/content/res/ColorStateList;

    .line 571
    .line 572
    const/4 v4, 0x0

    .line 573
    goto :goto_c

    .line 574
    :cond_13
    const/4 v4, 0x0

    .line 575
    iput-object v4, v2, Lm/g;->C:Landroid/content/res/ColorStateList;

    .line 576
    .line 577
    :goto_c
    invoke-virtual {v12}, Landroid/content/res/TypedArray;->recycle()V

    .line 578
    .line 579
    .line 580
    iput-boolean v7, v2, Lm/g;->h:Z

    .line 581
    .line 582
    move-object/from16 v8, p1

    .line 583
    .line 584
    goto/16 :goto_4

    .line 585
    .line 586
    :cond_14
    const/4 v4, 0x0

    .line 587
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 588
    .line 589
    .line 590
    move-result v6

    .line 591
    if-eqz v6, :cond_15

    .line 592
    .line 593
    const/4 v6, 0x1

    .line 594
    iput-boolean v6, v2, Lm/g;->h:Z

    .line 595
    .line 596
    iget v3, v2, Lm/g;->b:I

    .line 597
    .line 598
    iget v8, v2, Lm/g;->i:I

    .line 599
    .line 600
    iget v12, v2, Lm/g;->j:I

    .line 601
    .line 602
    iget-object v13, v2, Lm/g;->k:Ljava/lang/CharSequence;

    .line 603
    .line 604
    iget-object v14, v2, Lm/g;->a:Landroid/view/Menu;

    .line 605
    .line 606
    invoke-interface {v14, v3, v8, v12, v13}, Landroid/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    .line 607
    .line 608
    .line 609
    move-result-object v3

    .line 610
    invoke-interface {v3}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;

    .line 611
    .line 612
    .line 613
    move-result-object v8

    .line 614
    invoke-virtual {v2, v8}, Lm/g;->b(Landroid/view/MenuItem;)V

    .line 615
    .line 616
    .line 617
    move-object/from16 v8, p1

    .line 618
    .line 619
    invoke-virtual {v0, v8, v1, v3}, Lm/h;->b(Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V

    .line 620
    .line 621
    .line 622
    goto :goto_d

    .line 623
    :cond_15
    move-object/from16 v8, p1

    .line 624
    .line 625
    const/4 v6, 0x1

    .line 626
    move-object v11, v3

    .line 627
    const/4 v10, 0x1

    .line 628
    :goto_d
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 629
    .line 630
    .line 631
    move-result v3

    .line 632
    const/4 v4, 0x1

    .line 633
    const/4 v6, 0x2

    .line 634
    goto/16 :goto_2

    .line 635
    .line 636
    :cond_16
    new-instance v1, Ljava/lang/RuntimeException;

    .line 637
    .line 638
    const-string v2, "Unexpected end of document"

    .line 639
    .line 640
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    throw v1

    .line 644
    :cond_17
    return-void

    .line 645
    :cond_18
    move-object/from16 v8, p1

    .line 646
    .line 647
    goto/16 :goto_0
.end method

.method public final inflate(ILandroid/view/Menu;)V
    .locals 5

    .line 1
    const-string v0, "Error inflating menu XML"

    .line 2
    .line 3
    instance-of v1, p2, Ln/l;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-super {p0, p1, p2}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    :try_start_0
    iget-object v3, p0, Lm/h;->c:Landroid/content/Context;

    .line 14
    .line 15
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v3, p1}, Landroid/content/res/Resources;->getLayout(I)Landroid/content/res/XmlResourceParser;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    instance-of v3, p2, Ln/l;

    .line 28
    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    move-object v3, p2

    .line 32
    check-cast v3, Ln/l;

    .line 33
    .line 34
    iget-boolean v4, v3, Ln/l;->p:Z

    .line 35
    .line 36
    if-nez v4, :cond_1

    .line 37
    .line 38
    invoke-virtual {v3}, Ln/l;->w()V

    .line 39
    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_3

    .line 45
    :catch_0
    move-exception p1

    .line 46
    goto :goto_1

    .line 47
    :catch_1
    move-exception p1

    .line 48
    goto :goto_2

    .line 49
    :cond_1
    :goto_0
    invoke-virtual {p0, v1, p1, p2}, Lm/h;->b(Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    check-cast p2, Ln/l;

    .line 55
    .line 56
    invoke-virtual {p2}, Ln/l;->v()V

    .line 57
    .line 58
    .line 59
    :cond_2
    invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->close()V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :goto_1
    :try_start_1
    new-instance v3, Landroid/view/InflateException;

    .line 64
    .line 65
    invoke-direct {v3, v0, p1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    throw v3

    .line 69
    :goto_2
    new-instance v3, Landroid/view/InflateException;

    .line 70
    .line 71
    invoke-direct {v3, v0, p1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    :goto_3
    if-eqz v2, :cond_3

    .line 76
    .line 77
    check-cast p2, Ln/l;

    .line 78
    .line 79
    invoke-virtual {p2}, Ln/l;->v()V

    .line 80
    .line 81
    .line 82
    :cond_3
    if-eqz v1, :cond_4

    .line 83
    .line 84
    invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->close()V

    .line 85
    .line 86
    .line 87
    :cond_4
    throw p1
.end method
