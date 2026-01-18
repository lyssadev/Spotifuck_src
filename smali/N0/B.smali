.class public final LN0/B;
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
    iput p1, p0, LN0/B;->a:I

    iput-object p2, p0, LN0/B;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 5

    .line 1
    iget-object v0, p0, LN0/B;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li1/g;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, LN0/B;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Li1/g;

    .line 9
    .line 10
    iget-boolean v2, v1, Li1/g;->n:Z

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    xor-int/2addr v2, v3

    .line 14
    iget-boolean v4, v1, Li1/g;->o:Z

    .line 15
    .line 16
    or-int/2addr v2, v4

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    goto :goto_2

    .line 23
    :cond_0
    :try_start_1
    invoke-virtual {v1}, Li1/g;->s()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catch_0
    :try_start_2
    iget-object v1, p0, LN0/B;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Li1/g;

    .line 30
    .line 31
    iput-boolean v3, v1, Li1/g;->p:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 32
    .line 33
    :goto_0
    :try_start_3
    iget-object v1, p0, LN0/B;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, Li1/g;

    .line 36
    .line 37
    invoke-virtual {v1}, Li1/g;->l()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    iget-object v1, p0, LN0/B;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Li1/g;

    .line 46
    .line 47
    invoke-virtual {v1}, Li1/g;->q()V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, LN0/B;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Li1/g;

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    iput v2, v1, Li1/g;->l:I
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :catch_1
    :try_start_4
    iget-object v1, p0, LN0/B;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, Li1/g;

    .line 61
    .line 62
    iput-boolean v3, v1, Li1/g;->q:Z

    .line 63
    .line 64
    sget-object v2, Lr1/o;->a:Ljava/util/logging/Logger;

    .line 65
    .line 66
    new-instance v2, Lr1/n;

    .line 67
    .line 68
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 69
    .line 70
    .line 71
    new-instance v3, Lr1/p;

    .line 72
    .line 73
    invoke-direct {v3, v2}, Lr1/p;-><init>(Lr1/u;)V

    .line 74
    .line 75
    .line 76
    iput-object v3, v1, Li1/g;->j:Lr1/p;

    .line 77
    .line 78
    :cond_1
    :goto_1
    monitor-exit v0

    .line 79
    return-void

    .line 80
    :goto_2
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 81
    throw v1
.end method


# virtual methods
.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    const-wide/16 v4, -0x1

    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    const/4 v6, 0x1

    .line 9
    const/4 v7, 0x0

    .line 10
    iget v8, v1, LN0/B;->a:I

    .line 11
    .line 12
    packed-switch v8, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v2, v1, LN0/B;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, LL0/e;

    .line 18
    .line 19
    iput-boolean v7, v2, LL0/e;->c:Z

    .line 20
    .line 21
    iget-object v3, v2, LL0/e;->e:LA/c;

    .line 22
    .line 23
    check-cast v3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 24
    .line 25
    iget-object v4, v3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->M:LV/e;

    .line 26
    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    invoke-virtual {v4}, LV/e;->f()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    iget v0, v2, LL0/e;->b:I

    .line 36
    .line 37
    invoke-virtual {v2, v0}, LL0/e;->a(I)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget v4, v3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:I

    .line 42
    .line 43
    if-ne v4, v0, :cond_1

    .line 44
    .line 45
    iget v0, v2, LL0/e;->b:I

    .line 46
    .line 47
    invoke-virtual {v3, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->C(I)V

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_0
    return-void

    .line 51
    :pswitch_0
    iget-object v0, v1, LN0/B;->b:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 54
    .line 55
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->f:Landroidx/appcompat/widget/ActionMenuView;

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->y:Lo/k;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    invoke-virtual {v0}, Lo/k;->l()Z

    .line 64
    .line 65
    .line 66
    :cond_2
    return-void

    .line 67
    :pswitch_1
    iget-object v0, v1, LN0/B;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 70
    .line 71
    iget-boolean v2, v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->k:Z

    .line 72
    .line 73
    if-eqz v2, :cond_3

    .line 74
    .line 75
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    const-string v3, "input_method"

    .line 80
    .line 81
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 86
    .line 87
    invoke-virtual {v2, v0, v7}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 88
    .line 89
    .line 90
    iput-boolean v7, v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->k:Z

    .line 91
    .line 92
    :cond_3
    return-void

    .line 93
    :pswitch_2
    const/4 v0, 0x0

    .line 94
    iget-object v2, v1, LN0/B;->b:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v2, Lo/v0;

    .line 97
    .line 98
    iput-object v0, v2, Lo/v0;->q:LN0/B;

    .line 99
    .line 100
    invoke-virtual {v2}, Lo/v0;->drawableStateChanged()V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :pswitch_3
    iget-object v0, v1, LN0/B;->b:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 107
    .line 108
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->B0()Z

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :pswitch_4
    iget-object v2, v1, LN0/B;->b:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v2, Lj0/m;

    .line 115
    .line 116
    iget v3, v2, Lj0/m;->A:I

    .line 117
    .line 118
    iget-object v4, v2, Lj0/m;->z:Landroid/animation/ValueAnimator;

    .line 119
    .line 120
    if-eq v3, v6, :cond_4

    .line 121
    .line 122
    if-eq v3, v0, :cond_5

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_4
    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->cancel()V

    .line 126
    .line 127
    .line 128
    :cond_5
    const/4 v3, 0x3

    .line 129
    iput v3, v2, Lj0/m;->A:I

    .line 130
    .line 131
    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    check-cast v2, Ljava/lang/Float;

    .line 136
    .line 137
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    new-array v0, v0, [F

    .line 142
    .line 143
    aput v2, v0, v7

    .line 144
    .line 145
    const/4 v2, 0x0

    .line 146
    aput v2, v0, v6

    .line 147
    .line 148
    invoke-virtual {v4, v0}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 149
    .line 150
    .line 151
    const/16 v0, 0x1f4

    .line 152
    .line 153
    int-to-long v2, v0

    .line 154
    invoke-virtual {v4, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->start()V

    .line 158
    .line 159
    .line 160
    :goto_1
    return-void

    .line 161
    :pswitch_5
    iget-object v0, v1, LN0/B;->b:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v0, Lj/e;

    .line 164
    .line 165
    invoke-virtual {v0, v6}, Lj/g;->a(Z)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :pswitch_6
    invoke-direct/range {p0 .. p0}, LN0/B;->a()V

    .line 173
    .line 174
    .line 175
    return-void

    .line 176
    :cond_6
    :goto_2
    :pswitch_7
    iget-object v0, v1, LN0/B;->b:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v0, Lg1/n;

    .line 179
    .line 180
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 181
    .line 182
    .line 183
    move-result-wide v6

    .line 184
    invoke-virtual {v0, v6, v7}, Lg1/n;->a(J)J

    .line 185
    .line 186
    .line 187
    move-result-wide v6

    .line 188
    cmp-long v0, v6, v4

    .line 189
    .line 190
    if-nez v0, :cond_7

    .line 191
    .line 192
    return-void

    .line 193
    :cond_7
    cmp-long v0, v6, v2

    .line 194
    .line 195
    if-lez v0, :cond_6

    .line 196
    .line 197
    const-wide/32 v8, 0xf4240

    .line 198
    .line 199
    .line 200
    div-long v10, v6, v8

    .line 201
    .line 202
    mul-long v8, v8, v10

    .line 203
    .line 204
    sub-long/2addr v6, v8

    .line 205
    iget-object v0, v1, LN0/B;->b:Ljava/lang/Object;

    .line 206
    .line 207
    move-object v8, v0

    .line 208
    check-cast v8, Lg1/n;

    .line 209
    .line 210
    monitor-enter v8

    .line 211
    :try_start_0
    iget-object v0, v1, LN0/B;->b:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v0, Lg1/n;

    .line 214
    .line 215
    long-to-int v7, v6

    .line 216
    invoke-virtual {v0, v10, v11, v7}, Ljava/lang/Object;->wait(JI)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 217
    .line 218
    .line 219
    goto :goto_3

    .line 220
    :catchall_0
    move-exception v0

    .line 221
    goto :goto_4

    .line 222
    :catch_0
    :goto_3
    :try_start_1
    monitor-exit v8

    .line 223
    goto :goto_2

    .line 224
    :goto_4
    monitor-exit v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 225
    throw v0

    .line 226
    :pswitch_8
    iget-object v0, v1, LN0/B;->b:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v0, Lg0/u;

    .line 229
    .line 230
    invoke-virtual {v0}, Lg0/u;->k()V

    .line 231
    .line 232
    .line 233
    return-void

    .line 234
    :pswitch_9
    iget-object v0, v1, LN0/B;->b:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v0, Lg0/r;

    .line 237
    .line 238
    iget-object v0, v0, Lg0/r;->b0:Landroidx/recyclerview/widget/RecyclerView;

    .line 239
    .line 240
    invoke-virtual {v0, v0}, Landroid/view/ViewGroup;->focusableViewAvailable(Landroid/view/View;)V

    .line 241
    .line 242
    .line 243
    return-void

    .line 244
    :pswitch_a
    iget-object v0, v1, LN0/B;->b:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v0, Lg0/d;

    .line 247
    .line 248
    invoke-virtual {v0}, Lg0/d;->P()V

    .line 249
    .line 250
    .line 251
    return-void

    .line 252
    :pswitch_b
    iget-object v0, v1, LN0/B;->b:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v0, Ld0/c;

    .line 255
    .line 256
    iget-object v2, v0, Ld0/c;->g:Ld0/q;

    .line 257
    .line 258
    iget-object v2, v2, Ld0/q;->j:Lr/b;

    .line 259
    .line 260
    iget-object v0, v0, Ld0/c;->d:LA/b;

    .line 261
    .line 262
    iget-object v0, v0, LA/b;->g:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v0, Landroid/os/Messenger;

    .line 265
    .line 266
    invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    invoke-virtual {v2, v0}, Lr/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    return-void

    .line 274
    :pswitch_c
    iget-object v0, v1, LN0/B;->b:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v0, Landroidx/fragment/app/H;

    .line 277
    .line 278
    invoke-virtual {v0, v6}, Landroidx/fragment/app/H;->x(Z)Z

    .line 279
    .line 280
    .line 281
    return-void

    .line 282
    :pswitch_d
    iget-object v0, v1, LN0/B;->b:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v0, Landroidx/fragment/app/m;

    .line 285
    .line 286
    iget-object v2, v0, Landroidx/fragment/app/m;->a0:Landroidx/fragment/app/k;

    .line 287
    .line 288
    iget-object v0, v0, Landroidx/fragment/app/m;->i0:Landroid/app/Dialog;

    .line 289
    .line 290
    invoke-virtual {v2, v0}, Landroidx/fragment/app/k;->onDismiss(Landroid/content/DialogInterface;)V

    .line 291
    .line 292
    .line 293
    return-void

    .line 294
    :pswitch_e
    iget-object v0, v1, LN0/B;->b:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v0, Landroidx/fragment/app/e;

    .line 297
    .line 298
    iget-object v2, v0, Landroidx/fragment/app/e;->b:Landroid/view/ViewGroup;

    .line 299
    .line 300
    iget-object v3, v0, Landroidx/fragment/app/e;->c:Landroid/view/View;

    .line 301
    .line 302
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 303
    .line 304
    .line 305
    iget-object v0, v0, Landroidx/fragment/app/e;->d:Landroidx/fragment/app/f;

    .line 306
    .line 307
    invoke-virtual {v0}, Landroidx/fragment/app/g;->d()V

    .line 308
    .line 309
    .line 310
    return-void

    .line 311
    :pswitch_f
    iget-object v0, v1, LN0/B;->b:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v0, LV/e;

    .line 314
    .line 315
    invoke-virtual {v0, v7}, LV/e;->n(I)V

    .line 316
    .line 317
    .line 318
    return-void

    .line 319
    :pswitch_10
    iget-object v0, v1, LN0/B;->b:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v0, LT/g;

    .line 322
    .line 323
    iget-boolean v6, v0, LT/g;->t:Z

    .line 324
    .line 325
    if-nez v6, :cond_8

    .line 326
    .line 327
    goto/16 :goto_6

    .line 328
    .line 329
    :cond_8
    iget-boolean v6, v0, LT/g;->r:Z

    .line 330
    .line 331
    iget-object v8, v0, LT/g;->f:LT/a;

    .line 332
    .line 333
    if-eqz v6, :cond_9

    .line 334
    .line 335
    iput-boolean v7, v0, LT/g;->r:Z

    .line 336
    .line 337
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 338
    .line 339
    .line 340
    move-result-wide v9

    .line 341
    iput-wide v9, v8, LT/a;->e:J

    .line 342
    .line 343
    iput-wide v4, v8, LT/a;->g:J

    .line 344
    .line 345
    iput-wide v9, v8, LT/a;->f:J

    .line 346
    .line 347
    const/high16 v4, 0x3f000000    # 0.5f

    .line 348
    .line 349
    iput v4, v8, LT/a;->h:F

    .line 350
    .line 351
    :cond_9
    iget-wide v4, v8, LT/a;->g:J

    .line 352
    .line 353
    cmp-long v6, v4, v2

    .line 354
    .line 355
    if-lez v6, :cond_a

    .line 356
    .line 357
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 358
    .line 359
    .line 360
    move-result-wide v4

    .line 361
    iget-wide v9, v8, LT/a;->g:J

    .line 362
    .line 363
    iget v6, v8, LT/a;->i:I

    .line 364
    .line 365
    int-to-long v11, v6

    .line 366
    add-long/2addr v9, v11

    .line 367
    cmp-long v6, v4, v9

    .line 368
    .line 369
    if-lez v6, :cond_a

    .line 370
    .line 371
    goto :goto_5

    .line 372
    :cond_a
    invoke-virtual {v0}, LT/g;->e()Z

    .line 373
    .line 374
    .line 375
    move-result v4

    .line 376
    if-nez v4, :cond_b

    .line 377
    .line 378
    :goto_5
    iput-boolean v7, v0, LT/g;->t:Z

    .line 379
    .line 380
    goto :goto_6

    .line 381
    :cond_b
    iget-boolean v4, v0, LT/g;->s:Z

    .line 382
    .line 383
    iget-object v5, v0, LT/g;->h:Landroid/widget/ListView;

    .line 384
    .line 385
    if-eqz v4, :cond_c

    .line 386
    .line 387
    iput-boolean v7, v0, LT/g;->s:Z

    .line 388
    .line 389
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 390
    .line 391
    .line 392
    move-result-wide v11

    .line 393
    const/4 v15, 0x0

    .line 394
    const/16 v16, 0x0

    .line 395
    .line 396
    const/4 v13, 0x3

    .line 397
    const/4 v14, 0x0

    .line 398
    move-wide v9, v11

    .line 399
    invoke-static/range {v9 .. v16}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 400
    .line 401
    .line 402
    move-result-object v4

    .line 403
    invoke-virtual {v5, v4}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 404
    .line 405
    .line 406
    invoke-virtual {v4}, Landroid/view/MotionEvent;->recycle()V

    .line 407
    .line 408
    .line 409
    :cond_c
    iget-wide v6, v8, LT/a;->f:J

    .line 410
    .line 411
    cmp-long v4, v6, v2

    .line 412
    .line 413
    if-eqz v4, :cond_d

    .line 414
    .line 415
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 416
    .line 417
    .line 418
    move-result-wide v2

    .line 419
    invoke-virtual {v8, v2, v3}, LT/a;->a(J)F

    .line 420
    .line 421
    .line 422
    move-result v4

    .line 423
    const/high16 v6, -0x3f800000    # -4.0f

    .line 424
    .line 425
    mul-float v6, v6, v4

    .line 426
    .line 427
    mul-float v6, v6, v4

    .line 428
    .line 429
    const/high16 v7, 0x40800000    # 4.0f

    .line 430
    .line 431
    mul-float v4, v4, v7

    .line 432
    .line 433
    add-float/2addr v4, v6

    .line 434
    iget-wide v6, v8, LT/a;->f:J

    .line 435
    .line 436
    sub-long v6, v2, v6

    .line 437
    .line 438
    iput-wide v2, v8, LT/a;->f:J

    .line 439
    .line 440
    long-to-float v2, v6

    .line 441
    mul-float v2, v2, v4

    .line 442
    .line 443
    iget v3, v8, LT/a;->d:F

    .line 444
    .line 445
    mul-float v2, v2, v3

    .line 446
    .line 447
    float-to-int v2, v2

    .line 448
    iget-object v0, v0, LT/g;->v:Lo/v0;

    .line 449
    .line 450
    invoke-virtual {v0, v2}, Landroid/widget/AbsListView;->scrollListBy(I)V

    .line 451
    .line 452
    .line 453
    sget-object v0, LN/Q;->a:Ljava/util/WeakHashMap;

    .line 454
    .line 455
    invoke-virtual {v5, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 456
    .line 457
    .line 458
    :goto_6
    return-void

    .line 459
    :cond_d
    new-instance v0, Ljava/lang/RuntimeException;

    .line 460
    .line 461
    const-string v2, "Cannot compute scroll delta before calling start()"

    .line 462
    .line 463
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    throw v0

    .line 467
    :pswitch_11
    new-instance v0, Ljava/lang/RuntimeException;

    .line 468
    .line 469
    iget-object v2, v1, LN0/B;->b:Ljava/lang/Object;

    .line 470
    .line 471
    check-cast v2, Ljava/lang/Exception;

    .line 472
    .line 473
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 474
    .line 475
    .line 476
    throw v0

    .line 477
    :pswitch_12
    iget-object v0, v1, LN0/B;->b:Ljava/lang/Object;

    .line 478
    .line 479
    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    .line 480
    .line 481
    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->h:LN0/q;

    .line 482
    .line 483
    iget-object v0, v0, LN0/q;->l:Lcom/google/android/material/internal/CheckableImageButton;

    .line 484
    .line 485
    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    .line 486
    .line 487
    .line 488
    invoke-virtual {v0}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    .line 489
    .line 490
    .line 491
    return-void

    .line 492
    nop

    .line 493
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
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
