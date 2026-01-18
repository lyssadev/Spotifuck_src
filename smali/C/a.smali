.class public final synthetic LC/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LC/a;->a:I

    iput-object p2, p0, LC/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lit/deviato/spotifuck/MainActivity;Ljava/lang/String;)V
    .locals 0

    .line 2
    const/4 p1, 0x7

    iput p1, p0, LC/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LC/a;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x1

    .line 5
    iget v4, p0, LC/a;->a:I

    .line 6
    .line 7
    packed-switch v4, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LC/a;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 13
    .line 14
    invoke-virtual {v0}, Lj0/K;->l0()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, LC/a;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lcom/google/android/material/timepicker/e;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/google/android/material/timepicker/e;->m()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    iget-object v0, p0, LC/a;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Landroidx/lifecycle/C;

    .line 29
    .line 30
    const-string v1, "this$0"

    .line 31
    .line 32
    invoke-static {v1, v0}, LZ0/c;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget v1, v0, Landroidx/lifecycle/C;->g:I

    .line 36
    .line 37
    iget-object v2, v0, Landroidx/lifecycle/C;->k:Landroidx/lifecycle/t;

    .line 38
    .line 39
    if-nez v1, :cond_0

    .line 40
    .line 41
    iput-boolean v3, v0, Landroidx/lifecycle/C;->h:Z

    .line 42
    .line 43
    sget-object v1, Landroidx/lifecycle/l;->ON_PAUSE:Landroidx/lifecycle/l;

    .line 44
    .line 45
    invoke-virtual {v2, v1}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    iget v1, v0, Landroidx/lifecycle/C;->f:I

    .line 49
    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    iget-boolean v1, v0, Landroidx/lifecycle/C;->h:Z

    .line 53
    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    sget-object v1, Landroidx/lifecycle/l;->ON_STOP:Landroidx/lifecycle/l;

    .line 57
    .line 58
    invoke-virtual {v2, v1}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    .line 59
    .line 60
    .line 61
    iput-boolean v3, v0, Landroidx/lifecycle/C;->i:Z

    .line 62
    .line 63
    :cond_1
    return-void

    .line 64
    :pswitch_2
    iget-object v1, p0, LC/a;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v1, Landroidx/emoji2/text/p;

    .line 67
    .line 68
    const-string v4, "fetchFonts result is not OK. ("

    .line 69
    .line 70
    iget-object v5, v1, Landroidx/emoji2/text/p;->i:Ljava/lang/Object;

    .line 71
    .line 72
    monitor-enter v5

    .line 73
    :try_start_0
    iget-object v6, v1, Landroidx/emoji2/text/p;->m:LT0/g;

    .line 74
    .line 75
    if-nez v6, :cond_2

    .line 76
    .line 77
    monitor-exit v5

    .line 78
    goto/16 :goto_5

    .line 79
    .line 80
    :catchall_0
    move-exception v0

    .line 81
    goto/16 :goto_7

    .line 82
    .line 83
    :cond_2
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    :try_start_1
    invoke-virtual {v1}, Landroidx/emoji2/text/p;->c()LK/k;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    iget v6, v5, LK/k;->e:I

    .line 89
    .line 90
    if-ne v6, v0, :cond_3

    .line 91
    .line 92
    iget-object v0, v1, Landroidx/emoji2/text/p;->i:Ljava/lang/Object;

    .line 93
    .line 94
    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 95
    :try_start_2
    monitor-exit v0

    .line 96
    goto :goto_0

    .line 97
    :catchall_1
    move-exception v2

    .line 98
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 99
    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 100
    :catchall_2
    move-exception v0

    .line 101
    goto/16 :goto_3

    .line 102
    .line 103
    :cond_3
    :goto_0
    if-nez v6, :cond_6

    .line 104
    .line 105
    :try_start_4
    const-string v0, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    .line 106
    .line 107
    sget v4, LJ/k;->a:I

    .line 108
    .line 109
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    iget-object v0, v1, Landroidx/emoji2/text/p;->h:LK0/e;

    .line 113
    .line 114
    iget-object v4, v1, Landroidx/emoji2/text/p;->f:Landroid/content/Context;

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    new-array v0, v3, [LK/k;

    .line 120
    .line 121
    aput-object v5, v0, v2

    .line 122
    .line 123
    sget-object v3, LF/g;->a:Lp0/a;

    .line 124
    .line 125
    invoke-virtual {v3, v4, v0, v2}, Lp0/a;->u(Landroid/content/Context;[LK/k;I)Landroid/graphics/Typeface;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    iget-object v2, v1, Landroidx/emoji2/text/p;->f:Landroid/content/Context;

    .line 130
    .line 131
    iget-object v3, v5, LK/k;->a:Landroid/net/Uri;

    .line 132
    .line 133
    invoke-static {v2, v3}, Lp0/a;->j0(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    .line 134
    .line 135
    .line 136
    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 137
    if-eqz v2, :cond_5

    .line 138
    .line 139
    if-eqz v0, :cond_5

    .line 140
    .line 141
    :try_start_5
    const-string v3, "EmojiCompat.MetadataRepo.create"

    .line 142
    .line 143
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    new-instance v3, LA/k;

    .line 147
    .line 148
    invoke-static {v2}, LT0/g;->I(Ljava/nio/MappedByteBuffer;)LW/b;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-direct {v3, v0, v2}, LA/k;-><init>(Landroid/graphics/Typeface;LW/b;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 153
    .line 154
    .line 155
    :try_start_6
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 156
    .line 157
    .line 158
    :try_start_7
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 159
    .line 160
    .line 161
    iget-object v0, v1, Landroidx/emoji2/text/p;->i:Ljava/lang/Object;

    .line 162
    .line 163
    monitor-enter v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 164
    :try_start_8
    iget-object v2, v1, Landroidx/emoji2/text/p;->m:LT0/g;

    .line 165
    .line 166
    if-eqz v2, :cond_4

    .line 167
    .line 168
    invoke-virtual {v2, v3}, LT0/g;->B(LA/k;)V

    .line 169
    .line 170
    .line 171
    goto :goto_1

    .line 172
    :catchall_3
    move-exception v2

    .line 173
    goto :goto_2

    .line 174
    :cond_4
    :goto_1
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 175
    :try_start_9
    invoke-virtual {v1}, Landroidx/emoji2/text/p;->a()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 176
    .line 177
    .line 178
    goto :goto_5

    .line 179
    :goto_2
    :try_start_a
    monitor-exit v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 180
    :try_start_b
    throw v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 181
    :catchall_4
    move-exception v0

    .line 182
    :try_start_c
    sget v2, LJ/k;->a:I

    .line 183
    .line 184
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 185
    .line 186
    .line 187
    throw v0

    .line 188
    :cond_5
    new-instance v0, Ljava/lang/RuntimeException;

    .line 189
    .line 190
    const-string v2, "Unable to open file."

    .line 191
    .line 192
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 196
    :catchall_5
    move-exception v0

    .line 197
    :try_start_d
    sget v2, LJ/k;->a:I

    .line 198
    .line 199
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 200
    .line 201
    .line 202
    throw v0

    .line 203
    :cond_6
    new-instance v0, Ljava/lang/RuntimeException;

    .line 204
    .line 205
    new-instance v2, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    const-string v3, ")"

    .line 214
    .line 215
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 226
    :goto_3
    iget-object v2, v1, Landroidx/emoji2/text/p;->i:Ljava/lang/Object;

    .line 227
    .line 228
    monitor-enter v2

    .line 229
    :try_start_e
    iget-object v3, v1, Landroidx/emoji2/text/p;->m:LT0/g;

    .line 230
    .line 231
    if-eqz v3, :cond_7

    .line 232
    .line 233
    invoke-virtual {v3, v0}, LT0/g;->A(Ljava/lang/Throwable;)V

    .line 234
    .line 235
    .line 236
    goto :goto_4

    .line 237
    :catchall_6
    move-exception v0

    .line 238
    goto :goto_6

    .line 239
    :cond_7
    :goto_4
    monitor-exit v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 240
    invoke-virtual {v1}, Landroidx/emoji2/text/p;->a()V

    .line 241
    .line 242
    .line 243
    :goto_5
    return-void

    .line 244
    :goto_6
    :try_start_f
    monitor-exit v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 245
    throw v0

    .line 246
    :goto_7
    :try_start_10
    monitor-exit v5
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 247
    throw v0

    .line 248
    :pswitch_3
    iget-object v0, p0, LC/a;->b:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v0, Landroidx/activity/o;

    .line 251
    .line 252
    invoke-static {v0}, Landroidx/activity/o;->a(Landroidx/activity/o;)V

    .line 253
    .line 254
    .line 255
    return-void

    .line 256
    :pswitch_4
    iget-object v0, p0, LC/a;->b:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v0, Landroidx/activity/k;

    .line 259
    .line 260
    iget-object v2, v0, Landroidx/activity/k;->b:Ljava/lang/Runnable;

    .line 261
    .line 262
    if-eqz v2, :cond_8

    .line 263
    .line 264
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 265
    .line 266
    .line 267
    iput-object v1, v0, Landroidx/activity/k;->b:Ljava/lang/Runnable;

    .line 268
    .line 269
    :cond_8
    return-void

    .line 270
    :pswitch_5
    iget-object v0, p0, LC/a;->b:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v0, Ljava/lang/String;

    .line 273
    .line 274
    invoke-static {v0}, Lit/deviato/spotifuck/MainActivity;->t(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    return-void

    .line 278
    :pswitch_6
    iget-object v0, p0, LC/a;->b:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v0, Landroid/webkit/PermissionRequest;

    .line 281
    .line 282
    invoke-virtual {v0}, Landroid/webkit/PermissionRequest;->getResources()[Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    const-string v2, "android.webkit.resource.PROTECTED_MEDIA_ID"

    .line 291
    .line 292
    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v1

    .line 296
    if-eqz v1, :cond_9

    .line 297
    .line 298
    invoke-virtual {v0}, Landroid/webkit/PermissionRequest;->getResources()[Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    invoke-virtual {v0, v1}, Landroid/webkit/PermissionRequest;->grant([Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    goto :goto_8

    .line 306
    :cond_9
    invoke-virtual {v0}, Landroid/webkit/PermissionRequest;->deny()V

    .line 307
    .line 308
    .line 309
    :goto_8
    return-void

    .line 310
    :pswitch_7
    iget-object v0, p0, LC/a;->b:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    .line 313
    .line 314
    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->i:Landroid/widget/EditText;

    .line 315
    .line 316
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 317
    .line 318
    .line 319
    return-void

    .line 320
    :pswitch_8
    iget-object v0, p0, LC/a;->b:Ljava/lang/Object;

    .line 321
    .line 322
    check-cast v0, LN0/l;

    .line 323
    .line 324
    iget-object v1, v0, LN0/l;->h:Landroid/widget/AutoCompleteTextView;

    .line 325
    .line 326
    invoke-virtual {v1}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    invoke-virtual {v0, v1}, LN0/l;->t(Z)V

    .line 331
    .line 332
    .line 333
    iput-boolean v1, v0, LN0/l;->m:Z

    .line 334
    .line 335
    return-void

    .line 336
    :pswitch_9
    iget-object v0, p0, LC/a;->b:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v0, LN0/e;

    .line 339
    .line 340
    invoke-virtual {v0, v3}, LN0/e;->t(Z)V

    .line 341
    .line 342
    .line 343
    return-void

    .line 344
    :pswitch_a
    iget-object v1, p0, LC/a;->b:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v1, LL0/e;

    .line 347
    .line 348
    iput-boolean v2, v1, LL0/e;->c:Z

    .line 349
    .line 350
    iget-object v2, v1, LL0/e;->e:LA/c;

    .line 351
    .line 352
    check-cast v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 353
    .line 354
    iget-object v3, v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->i:LV/e;

    .line 355
    .line 356
    if-eqz v3, :cond_a

    .line 357
    .line 358
    invoke-virtual {v3}, LV/e;->f()Z

    .line 359
    .line 360
    .line 361
    move-result v3

    .line 362
    if-eqz v3, :cond_a

    .line 363
    .line 364
    iget v0, v1, LL0/e;->b:I

    .line 365
    .line 366
    invoke-virtual {v1, v0}, LL0/e;->a(I)V

    .line 367
    .line 368
    .line 369
    goto :goto_9

    .line 370
    :cond_a
    iget v3, v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    .line 371
    .line 372
    if-ne v3, v0, :cond_b

    .line 373
    .line 374
    iget v0, v1, LL0/e;->b:I

    .line 375
    .line 376
    invoke-virtual {v2, v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->r(I)V

    .line 377
    .line 378
    .line 379
    :cond_b
    :goto_9
    return-void

    .line 380
    :pswitch_b
    iget-object v0, p0, LC/a;->b:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast v0, Landroid/view/View;

    .line 383
    .line 384
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 389
    .line 390
    const-class v5, Landroid/view/inputmethod/InputMethodManager;

    .line 391
    .line 392
    const/16 v6, 0x17

    .line 393
    .line 394
    if-lt v4, v6, :cond_c

    .line 395
    .line 396
    invoke-static {v2, v5}, LD/b;->b(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    goto :goto_b

    .line 401
    :cond_c
    if-lt v4, v6, :cond_d

    .line 402
    .line 403
    invoke-static {v2, v5}, LD/b;->c(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v4

    .line 407
    goto :goto_a

    .line 408
    :cond_d
    sget-object v4, LD/e;->a:Ljava/util/HashMap;

    .line 409
    .line 410
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v4

    .line 414
    check-cast v4, Ljava/lang/String;

    .line 415
    .line 416
    :goto_a
    if-eqz v4, :cond_e

    .line 417
    .line 418
    invoke-virtual {v2, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    :cond_e
    :goto_b
    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 423
    .line 424
    invoke-virtual {v1, v0, v3}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 425
    .line 426
    .line 427
    return-void

    .line 428
    :pswitch_c
    iget-object v4, p0, LC/a;->b:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast v4, Landroid/app/Activity;

    .line 431
    .line 432
    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    .line 433
    .line 434
    .line 435
    move-result v5

    .line 436
    if-nez v5, :cond_19

    .line 437
    .line 438
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 439
    .line 440
    const/16 v6, 0x1c

    .line 441
    .line 442
    if-lt v5, v6, :cond_f

    .line 443
    .line 444
    sget-object v0, LC/d;->a:Ljava/lang/Class;

    .line 445
    .line 446
    invoke-virtual {v4}, Landroid/app/Activity;->recreate()V

    .line 447
    .line 448
    .line 449
    goto/16 :goto_13

    .line 450
    .line 451
    :cond_f
    sget-object v6, LC/d;->a:Ljava/lang/Class;

    .line 452
    .line 453
    const/16 v6, 0x1b

    .line 454
    .line 455
    const/16 v7, 0x1a

    .line 456
    .line 457
    if-eq v5, v7, :cond_11

    .line 458
    .line 459
    if-ne v5, v6, :cond_10

    .line 460
    .line 461
    goto :goto_c

    .line 462
    :cond_10
    const/4 v8, 0x0

    .line 463
    goto :goto_d

    .line 464
    :cond_11
    :goto_c
    const/4 v8, 0x1

    .line 465
    :goto_d
    sget-object v9, LC/d;->f:Ljava/lang/reflect/Method;

    .line 466
    .line 467
    if-eqz v8, :cond_12

    .line 468
    .line 469
    if-nez v9, :cond_12

    .line 470
    .line 471
    goto/16 :goto_12

    .line 472
    .line 473
    :cond_12
    sget-object v8, LC/d;->e:Ljava/lang/reflect/Method;

    .line 474
    .line 475
    if-nez v8, :cond_13

    .line 476
    .line 477
    sget-object v8, LC/d;->d:Ljava/lang/reflect/Method;

    .line 478
    .line 479
    if-nez v8, :cond_13

    .line 480
    .line 481
    goto/16 :goto_12

    .line 482
    .line 483
    :cond_13
    :try_start_11
    sget-object v8, LC/d;->c:Ljava/lang/reflect/Field;

    .line 484
    .line 485
    invoke-virtual {v8, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v8

    .line 489
    if-nez v8, :cond_14

    .line 490
    .line 491
    goto :goto_12

    .line 492
    :cond_14
    sget-object v10, LC/d;->b:Ljava/lang/reflect/Field;

    .line 493
    .line 494
    invoke-virtual {v10, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v10

    .line 498
    if-nez v10, :cond_15

    .line 499
    .line 500
    goto :goto_12

    .line 501
    :cond_15
    invoke-virtual {v4}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 502
    .line 503
    .line 504
    move-result-object v11

    .line 505
    new-instance v12, LC/c;

    .line 506
    .line 507
    invoke-direct {v12, v4}, LC/c;-><init>(Landroid/app/Activity;)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v11, v12}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    .line 511
    .line 512
    .line 513
    sget-object v13, LC/d;->g:Landroid/os/Handler;

    .line 514
    .line 515
    :try_start_12
    new-instance v14, LC/b;

    .line 516
    .line 517
    invoke-direct {v14, v12, v8, v2}, LC/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 518
    .line 519
    .line 520
    invoke-virtual {v13, v14}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_8

    .line 521
    .line 522
    .line 523
    if-eq v5, v7, :cond_17

    .line 524
    .line 525
    if-ne v5, v6, :cond_16

    .line 526
    .line 527
    goto :goto_e

    .line 528
    :cond_16
    const/4 v5, 0x0

    .line 529
    goto :goto_f

    .line 530
    :cond_17
    :goto_e
    const/4 v5, 0x1

    .line 531
    :goto_f
    if-eqz v5, :cond_18

    .line 532
    .line 533
    :try_start_13
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 534
    .line 535
    .line 536
    move-result-object v5

    .line 537
    const/16 v6, 0x9

    .line 538
    .line 539
    new-array v6, v6, [Ljava/lang/Object;

    .line 540
    .line 541
    aput-object v8, v6, v2

    .line 542
    .line 543
    aput-object v1, v6, v3

    .line 544
    .line 545
    aput-object v1, v6, v0

    .line 546
    .line 547
    const/4 v0, 0x3

    .line 548
    aput-object v5, v6, v0

    .line 549
    .line 550
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 551
    .line 552
    const/4 v5, 0x4

    .line 553
    aput-object v0, v6, v5

    .line 554
    .line 555
    const/4 v5, 0x5

    .line 556
    aput-object v1, v6, v5

    .line 557
    .line 558
    const/4 v5, 0x6

    .line 559
    aput-object v1, v6, v5

    .line 560
    .line 561
    const/4 v1, 0x7

    .line 562
    aput-object v0, v6, v1

    .line 563
    .line 564
    const/16 v1, 0x8

    .line 565
    .line 566
    aput-object v0, v6, v1

    .line 567
    .line 568
    invoke-virtual {v9, v10, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    goto :goto_10

    .line 572
    :catchall_7
    move-exception v0

    .line 573
    goto :goto_11

    .line 574
    :cond_18
    invoke-virtual {v4}, Landroid/app/Activity;->recreate()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_7

    .line 575
    .line 576
    .line 577
    :goto_10
    :try_start_14
    new-instance v0, LC/b;

    .line 578
    .line 579
    invoke-direct {v0, v11, v12, v3, v2}, LC/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v13, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 583
    .line 584
    .line 585
    goto :goto_13

    .line 586
    :goto_11
    new-instance v1, LC/b;

    .line 587
    .line 588
    invoke-direct {v1, v11, v12, v3, v2}, LC/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v13, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 592
    .line 593
    .line 594
    throw v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_8

    .line 595
    :catchall_8
    :goto_12
    invoke-virtual {v4}, Landroid/app/Activity;->recreate()V

    .line 596
    .line 597
    .line 598
    :cond_19
    :goto_13
    return-void

    .line 599
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
