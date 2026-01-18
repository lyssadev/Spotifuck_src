.class public final LN/a;
.super Landroid/view/View$AccessibilityDelegate;
.source "SourceFile"


# instance fields
.field public final a:LN/b;


# direct methods
.method public constructor <init>(LN/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/view/View$AccessibilityDelegate;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LN/a;->a:LN/b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LN/a;->a:LN/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LN/b;->a(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;
    .locals 1

    .line 1
    iget-object v0, p0, LN/a;->a:LN/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LN/b;->b(Landroid/view/View;)LA/b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p1, LA/b;->g:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Landroid/view/accessibility/AccessibilityNodeProvider;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    return-object p1
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, LN/a;->a:LN/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LN/b;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    new-instance v3, LO/k;

    .line 7
    .line 8
    invoke-direct {v3, v1}, LO/k;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 9
    .line 10
    .line 11
    sget-object v4, LN/Q;->a:Ljava/util/WeakHashMap;

    .line 12
    .line 13
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 14
    .line 15
    const-class v5, Ljava/lang/Boolean;

    .line 16
    .line 17
    const/16 v6, 0x1c

    .line 18
    .line 19
    if-lt v4, v6, :cond_0

    .line 20
    .line 21
    invoke-static/range {p1 .. p1}, LN/J;->d(Landroid/view/View;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const v4, 0x7f0901dc

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    if-eqz v8, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v4, 0x0

    .line 45
    :goto_0
    check-cast v4, Ljava/lang/Boolean;

    .line 46
    .line 47
    const/4 v8, 0x0

    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_2

    .line 55
    .line 56
    const/4 v4, 0x1

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    const/4 v4, 0x0

    .line 59
    :goto_1
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 60
    .line 61
    if-lt v9, v6, :cond_3

    .line 62
    .line 63
    invoke-static {v1, v4}, LH0/f;->u(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    invoke-virtual {v3, v2, v4}, LO/k;->h(IZ)V

    .line 68
    .line 69
    .line 70
    :goto_2
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 71
    .line 72
    if-lt v4, v6, :cond_4

    .line 73
    .line 74
    invoke-static/range {p1 .. p1}, LN/J;->c(Landroid/view/View;)Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    goto :goto_3

    .line 83
    :cond_4
    const v4, 0x7f0901d7

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-eqz v5, :cond_5

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_5
    const/4 v4, 0x0

    .line 98
    :goto_3
    check-cast v4, Ljava/lang/Boolean;

    .line 99
    .line 100
    if-eqz v4, :cond_6

    .line 101
    .line 102
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    if-eqz v4, :cond_6

    .line 107
    .line 108
    const/4 v4, 0x1

    .line 109
    goto :goto_4

    .line 110
    :cond_6
    const/4 v4, 0x0

    .line 111
    :goto_4
    if-lt v9, v6, :cond_7

    .line 112
    .line 113
    invoke-static {v1, v4}, LH0/f;->B(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 114
    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_7
    const/4 v5, 0x2

    .line 118
    invoke-virtual {v3, v5, v4}, LO/k;->h(IZ)V

    .line 119
    .line 120
    .line 121
    :goto_5
    invoke-static/range {p1 .. p1}, LN/Q;->d(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    if-lt v9, v6, :cond_8

    .line 126
    .line 127
    invoke-static {v1, v4}, LH0/f;->t(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    .line 128
    .line 129
    .line 130
    goto :goto_6

    .line 131
    :cond_8
    invoke-virtual/range {p2 .. p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    const-string v6, "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"

    .line 136
    .line 137
    invoke-virtual {v5, v6, v4}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 138
    .line 139
    .line 140
    :goto_6
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 141
    .line 142
    const/16 v5, 0x1e

    .line 143
    .line 144
    if-lt v4, v5, :cond_9

    .line 145
    .line 146
    invoke-static/range {p1 .. p1}, LN/L;->b(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    goto :goto_7

    .line 151
    :cond_9
    const v4, 0x7f0901dd

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    const-class v6, Ljava/lang/CharSequence;

    .line 159
    .line 160
    invoke-virtual {v6, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v6

    .line 164
    if-eqz v6, :cond_a

    .line 165
    .line 166
    goto :goto_7

    .line 167
    :cond_a
    const/4 v4, 0x0

    .line 168
    :goto_7
    check-cast v4, Ljava/lang/CharSequence;

    .line 169
    .line 170
    if-lt v9, v5, :cond_b

    .line 171
    .line 172
    invoke-static {v1, v4}, LO/g;->c(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    .line 173
    .line 174
    .line 175
    :goto_8
    move-object/from16 v4, p0

    .line 176
    .line 177
    goto :goto_9

    .line 178
    :cond_b
    invoke-virtual/range {p2 .. p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    const-string v6, "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"

    .line 183
    .line 184
    invoke-virtual {v5, v6, v4}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 185
    .line 186
    .line 187
    goto :goto_8

    .line 188
    :goto_9
    iget-object v5, v4, LN/a;->a:LN/b;

    .line 189
    .line 190
    invoke-virtual {v5, v0, v3}, LN/b;->d(Landroid/view/View;LO/k;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {p2 .. p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    const/16 v6, 0x1a

    .line 198
    .line 199
    if-ge v9, v6, :cond_13

    .line 200
    .line 201
    invoke-virtual/range {p2 .. p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    const-string v9, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"

    .line 206
    .line 207
    invoke-virtual {v6, v9}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {p2 .. p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 211
    .line 212
    .line 213
    move-result-object v6

    .line 214
    const-string v10, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY"

    .line 215
    .line 216
    invoke-virtual {v6, v10}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {p2 .. p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    const-string v11, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY"

    .line 224
    .line 225
    invoke-virtual {v6, v11}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {p2 .. p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 229
    .line 230
    .line 231
    move-result-object v6

    .line 232
    const-string v12, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY"

    .line 233
    .line 234
    invoke-virtual {v6, v12}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    const v6, 0x7f0901d6

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0, v6}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v13

    .line 244
    check-cast v13, Landroid/util/SparseArray;

    .line 245
    .line 246
    if-eqz v13, :cond_e

    .line 247
    .line 248
    new-instance v14, Ljava/util/ArrayList;

    .line 249
    .line 250
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 251
    .line 252
    .line 253
    const/4 v15, 0x0

    .line 254
    :goto_a
    invoke-virtual {v13}, Landroid/util/SparseArray;->size()I

    .line 255
    .line 256
    .line 257
    move-result v7

    .line 258
    if-ge v15, v7, :cond_d

    .line 259
    .line 260
    invoke-virtual {v13, v15}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v7

    .line 264
    check-cast v7, Ljava/lang/ref/WeakReference;

    .line 265
    .line 266
    invoke-virtual {v7}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v7

    .line 270
    if-nez v7, :cond_c

    .line 271
    .line 272
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 273
    .line 274
    .line 275
    move-result-object v7

    .line 276
    invoke-virtual {v14, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    :cond_c
    add-int/2addr v15, v2

    .line 280
    goto :goto_a

    .line 281
    :cond_d
    const/4 v7, 0x0

    .line 282
    :goto_b
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 283
    .line 284
    .line 285
    move-result v15

    .line 286
    if-ge v7, v15, :cond_e

    .line 287
    .line 288
    invoke-virtual {v14, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v15

    .line 292
    check-cast v15, Ljava/lang/Integer;

    .line 293
    .line 294
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 295
    .line 296
    .line 297
    move-result v15

    .line 298
    invoke-virtual {v13, v15}, Landroid/util/SparseArray;->remove(I)V

    .line 299
    .line 300
    .line 301
    add-int/2addr v7, v2

    .line 302
    goto :goto_b

    .line 303
    :cond_e
    instance-of v7, v5, Landroid/text/Spanned;

    .line 304
    .line 305
    if-eqz v7, :cond_f

    .line 306
    .line 307
    move-object v7, v5

    .line 308
    check-cast v7, Landroid/text/Spanned;

    .line 309
    .line 310
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 311
    .line 312
    .line 313
    move-result v13

    .line 314
    const-class v14, Landroid/text/style/ClickableSpan;

    .line 315
    .line 316
    invoke-interface {v7, v8, v13, v14}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v7

    .line 320
    check-cast v7, [Landroid/text/style/ClickableSpan;

    .line 321
    .line 322
    goto :goto_c

    .line 323
    :cond_f
    const/4 v7, 0x0

    .line 324
    :goto_c
    if-eqz v7, :cond_13

    .line 325
    .line 326
    array-length v13, v7

    .line 327
    if-lez v13, :cond_13

    .line 328
    .line 329
    invoke-virtual/range {p2 .. p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    const-string v13, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY"

    .line 334
    .line 335
    const v14, 0x7f090010

    .line 336
    .line 337
    .line 338
    invoke-virtual {v1, v13, v14}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0, v6}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    check-cast v1, Landroid/util/SparseArray;

    .line 346
    .line 347
    if-nez v1, :cond_10

    .line 348
    .line 349
    new-instance v1, Landroid/util/SparseArray;

    .line 350
    .line 351
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0, v6, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    :cond_10
    const/4 v6, 0x0

    .line 358
    :goto_d
    array-length v13, v7

    .line 359
    if-ge v6, v13, :cond_13

    .line 360
    .line 361
    aget-object v13, v7, v6

    .line 362
    .line 363
    const/4 v14, 0x0

    .line 364
    :goto_e
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 365
    .line 366
    .line 367
    move-result v15

    .line 368
    if-ge v14, v15, :cond_12

    .line 369
    .line 370
    invoke-virtual {v1, v14}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v15

    .line 374
    check-cast v15, Ljava/lang/ref/WeakReference;

    .line 375
    .line 376
    invoke-virtual {v15}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v15

    .line 380
    check-cast v15, Landroid/text/style/ClickableSpan;

    .line 381
    .line 382
    invoke-virtual {v13, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result v15

    .line 386
    if-eqz v15, :cond_11

    .line 387
    .line 388
    invoke-virtual {v1, v14}, Landroid/util/SparseArray;->keyAt(I)I

    .line 389
    .line 390
    .line 391
    move-result v13

    .line 392
    goto :goto_f

    .line 393
    :cond_11
    add-int/2addr v14, v2

    .line 394
    goto :goto_e

    .line 395
    :cond_12
    sget v13, LO/k;->c:I

    .line 396
    .line 397
    add-int/lit8 v14, v13, 0x1

    .line 398
    .line 399
    sput v14, LO/k;->c:I

    .line 400
    .line 401
    :goto_f
    new-instance v14, Ljava/lang/ref/WeakReference;

    .line 402
    .line 403
    aget-object v15, v7, v6

    .line 404
    .line 405
    invoke-direct {v14, v15}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v1, v13, v14}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    aget-object v14, v7, v6

    .line 412
    .line 413
    move-object v15, v5

    .line 414
    check-cast v15, Landroid/text/Spanned;

    .line 415
    .line 416
    invoke-virtual {v3, v9}, LO/k;->c(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 417
    .line 418
    .line 419
    move-result-object v8

    .line 420
    invoke-interface {v15, v14}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 421
    .line 422
    .line 423
    move-result v16

    .line 424
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    invoke-interface {v8, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    invoke-virtual {v3, v10}, LO/k;->c(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 432
    .line 433
    .line 434
    move-result-object v2

    .line 435
    invoke-interface {v15, v14}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 436
    .line 437
    .line 438
    move-result v8

    .line 439
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 440
    .line 441
    .line 442
    move-result-object v8

    .line 443
    invoke-interface {v2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    invoke-virtual {v3, v11}, LO/k;->c(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    invoke-interface {v15, v14}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    .line 451
    .line 452
    .line 453
    move-result v8

    .line 454
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 455
    .line 456
    .line 457
    move-result-object v8

    .line 458
    invoke-interface {v2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    invoke-virtual {v3, v12}, LO/k;->c(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 466
    .line 467
    .line 468
    move-result-object v8

    .line 469
    invoke-interface {v2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    const/4 v2, 0x1

    .line 473
    add-int/2addr v6, v2

    .line 474
    const/4 v8, 0x0

    .line 475
    goto :goto_d

    .line 476
    :cond_13
    const v1, 0x7f0901d5

    .line 477
    .line 478
    .line 479
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    check-cast v0, Ljava/util/List;

    .line 484
    .line 485
    if-nez v0, :cond_14

    .line 486
    .line 487
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    :cond_14
    const/4 v8, 0x0

    .line 492
    :goto_10
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 493
    .line 494
    .line 495
    move-result v1

    .line 496
    if-ge v8, v1, :cond_15

    .line 497
    .line 498
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v1

    .line 502
    check-cast v1, LO/f;

    .line 503
    .line 504
    invoke-virtual {v3, v1}, LO/k;->b(LO/f;)V

    .line 505
    .line 506
    .line 507
    const/4 v1, 0x1

    .line 508
    add-int/2addr v8, v1

    .line 509
    goto :goto_10

    .line 510
    :cond_15
    return-void
.end method

.method public final onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, LN/a;->a:LN/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LN/b;->e(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LN/a;->a:LN/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, LN/b;->f(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LN/a;->a:LN/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, LN/b;->g(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final sendAccessibilityEvent(Landroid/view/View;I)V
    .locals 1

    .line 1
    iget-object v0, p0, LN/a;->a:LN/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LN/b;->h(Landroid/view/View;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, LN/a;->a:LN/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LN/b;->i(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
