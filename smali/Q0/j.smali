.class public final LQ0/j;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LQ0/j;->a:I

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Looper;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p3, p0, LQ0/j;->a:I

    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, LQ0/j;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Landroid/os/Looper;I)V
    .locals 0

    .line 3
    iput p3, p0, LQ0/j;->a:I

    iput-object p1, p0, LQ0/j;->b:Ljava/lang/Object;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    :goto_0
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, 0x2

    .line 8
    const/4 v5, -0x1

    .line 9
    const/4 v6, 0x0

    .line 10
    const/4 v7, 0x0

    .line 11
    const/16 v8, 0x19

    .line 12
    .line 13
    const/4 v9, 0x1

    .line 14
    iget v10, v1, LQ0/j;->a:I

    .line 15
    .line 16
    packed-switch v10, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    iget v2, v0, Landroid/os/Message;->what:I

    .line 20
    .line 21
    const/4 v3, -0x3

    .line 22
    if-eq v2, v3, :cond_1

    .line 23
    .line 24
    const/4 v3, -0x2

    .line 25
    if-eq v2, v3, :cond_1

    .line 26
    .line 27
    if-eq v2, v5, :cond_1

    .line 28
    .line 29
    if-eq v2, v9, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Landroid/content/DialogInterface;

    .line 35
    .line 36
    invoke-interface {v0}, Landroid/content/DialogInterface;->dismiss()V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    iget-object v2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, Landroid/content/DialogInterface$OnClickListener;

    .line 43
    .line 44
    iget-object v3, v1, LQ0/j;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Landroid/content/DialogInterface;

    .line 53
    .line 54
    iget v0, v0, Landroid/os/Message;->what:I

    .line 55
    .line 56
    invoke-interface {v2, v3, v0}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    .line 57
    .line 58
    .line 59
    :goto_0
    return-void

    .line 60
    :pswitch_0
    iget v0, v0, Landroid/os/Message;->what:I

    .line 61
    .line 62
    if-eq v0, v9, :cond_2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    iget-object v0, v1, LQ0/j;->b:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Lg0/r;

    .line 68
    .line 69
    iget-object v2, v0, Lg0/r;->a0:Lg0/w;

    .line 70
    .line 71
    iget-object v2, v2, Lg0/w;->g:Landroidx/preference/PreferenceScreen;

    .line 72
    .line 73
    if-eqz v2, :cond_3

    .line 74
    .line 75
    iget-object v0, v0, Lg0/r;->b0:Landroidx/recyclerview/widget/RecyclerView;

    .line 76
    .line 77
    new-instance v3, Lg0/u;

    .line 78
    .line 79
    invoke-direct {v3, v2}, Lg0/u;-><init>(Landroidx/preference/PreferenceScreen;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Lj0/C;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Landroidx/preference/PreferenceGroup;->i()V

    .line 86
    .line 87
    .line 88
    :cond_3
    :goto_1
    return-void

    .line 89
    :pswitch_1
    iget-object v2, v1, LQ0/j;->b:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v2, Ld0/q;

    .line 92
    .line 93
    if-eqz v2, :cond_a

    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual/range {p1 .. p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    iget v4, v0, Landroid/os/Message;->what:I

    .line 103
    .line 104
    const-string v5, "data_callback_token"

    .line 105
    .line 106
    const-string v6, "data_calling_uid"

    .line 107
    .line 108
    const-string v10, "data_calling_pid"

    .line 109
    .line 110
    const-string v11, "data_package_name"

    .line 111
    .line 112
    const-string v12, "data_root_hints"

    .line 113
    .line 114
    const-string v13, "data_media_item_id"

    .line 115
    .line 116
    const-string v14, "data_result_receiver"

    .line 117
    .line 118
    iget-object v2, v2, Ld0/q;->g:LA/b;

    .line 119
    .line 120
    packed-switch v4, :pswitch_data_1

    .line 121
    .line 122
    .line 123
    new-instance v2, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    const-string v3, "Unhandled message: "

    .line 126
    .line 127
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v3, "\n  Service version: 2\n  Client version: "

    .line 134
    .line 135
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 139
    .line 140
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    const-string v2, "MBServiceCompat"

    .line 148
    .line 149
    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    goto/16 :goto_3

    .line 153
    .line 154
    :pswitch_2
    const-string v4, "data_custom_action_extras"

    .line 155
    .line 156
    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 157
    .line 158
    .line 159
    move-result-object v19

    .line 160
    invoke-static/range {v19 .. v19}, Landroid/support/v4/media/session/t;->j(Landroid/os/Bundle;)V

    .line 161
    .line 162
    .line 163
    const-string v4, "data_custom_action"

    .line 164
    .line 165
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v18

    .line 169
    invoke-virtual {v3, v14}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    move-object/from16 v20, v3

    .line 174
    .line 175
    check-cast v20, Lb/d;

    .line 176
    .line 177
    new-instance v3, LA/b;

    .line 178
    .line 179
    iget-object v0, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 180
    .line 181
    invoke-direct {v3, v8, v0}, LA/b;-><init>(ILjava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-static/range {v18 .. v18}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-nez v0, :cond_b

    .line 192
    .line 193
    if-nez v20, :cond_4

    .line 194
    .line 195
    goto/16 :goto_3

    .line 196
    .line 197
    :cond_4
    iget-object v0, v2, LA/b;->g:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v0, Ld0/q;

    .line 200
    .line 201
    iget-object v0, v0, Ld0/q;->k:LQ0/j;

    .line 202
    .line 203
    new-instance v4, Ld0/n;

    .line 204
    .line 205
    move-object v15, v4

    .line 206
    move-object/from16 v16, v2

    .line 207
    .line 208
    move-object/from16 v17, v3

    .line 209
    .line 210
    invoke-direct/range {v15 .. v20}, Ld0/n;-><init>(LA/b;LA/b;Ljava/lang/String;Landroid/os/Bundle;Lb/d;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0, v4}, LQ0/j;->a(Ljava/lang/Runnable;)V

    .line 214
    .line 215
    .line 216
    goto/16 :goto_3

    .line 217
    .line 218
    :pswitch_3
    const-string v4, "data_search_extras"

    .line 219
    .line 220
    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 221
    .line 222
    .line 223
    move-result-object v19

    .line 224
    invoke-static/range {v19 .. v19}, Landroid/support/v4/media/session/t;->j(Landroid/os/Bundle;)V

    .line 225
    .line 226
    .line 227
    const-string v4, "data_search_query"

    .line 228
    .line 229
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v18

    .line 233
    invoke-virtual {v3, v14}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    move-object/from16 v20, v3

    .line 238
    .line 239
    check-cast v20, Lb/d;

    .line 240
    .line 241
    new-instance v3, LA/b;

    .line 242
    .line 243
    iget-object v0, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 244
    .line 245
    invoke-direct {v3, v8, v0}, LA/b;-><init>(ILjava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    invoke-static/range {v18 .. v18}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    if-nez v0, :cond_b

    .line 256
    .line 257
    if-nez v20, :cond_5

    .line 258
    .line 259
    goto/16 :goto_3

    .line 260
    .line 261
    :cond_5
    iget-object v0, v2, LA/b;->g:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v0, Ld0/q;

    .line 264
    .line 265
    iget-object v0, v0, Ld0/q;->k:LQ0/j;

    .line 266
    .line 267
    new-instance v4, Ld0/p;

    .line 268
    .line 269
    move-object v15, v4

    .line 270
    move-object/from16 v16, v2

    .line 271
    .line 272
    move-object/from16 v17, v3

    .line 273
    .line 274
    invoke-direct/range {v15 .. v20}, Ld0/p;-><init>(LA/b;LA/b;Ljava/lang/String;Landroid/os/Bundle;Lb/d;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v0, v4}, LQ0/j;->a(Ljava/lang/Runnable;)V

    .line 278
    .line 279
    .line 280
    goto/16 :goto_3

    .line 281
    .line 282
    :pswitch_4
    new-instance v3, LA/b;

    .line 283
    .line 284
    iget-object v0, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 285
    .line 286
    invoke-direct {v3, v8, v0}, LA/b;-><init>(ILjava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    iget-object v0, v2, LA/b;->g:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v0, Ld0/q;

    .line 292
    .line 293
    iget-object v0, v0, Ld0/q;->k:LQ0/j;

    .line 294
    .line 295
    new-instance v4, Ld0/m;

    .line 296
    .line 297
    invoke-direct {v4, v2, v3, v9}, Ld0/m;-><init>(LA/b;LA/b;I)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0, v4}, LQ0/j;->a(Ljava/lang/Runnable;)V

    .line 301
    .line 302
    .line 303
    goto/16 :goto_3

    .line 304
    .line 305
    :pswitch_5
    invoke-virtual {v3, v12}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 306
    .line 307
    .line 308
    move-result-object v21

    .line 309
    invoke-static/range {v21 .. v21}, Landroid/support/v4/media/session/t;->j(Landroid/os/Bundle;)V

    .line 310
    .line 311
    .line 312
    new-instance v4, LA/b;

    .line 313
    .line 314
    iget-object v0, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 315
    .line 316
    invoke-direct {v4, v8, v0}, LA/b;-><init>(ILjava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v3, v11}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v19

    .line 323
    invoke-virtual {v3, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 324
    .line 325
    .line 326
    move-result v20

    .line 327
    invoke-virtual {v3, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 328
    .line 329
    .line 330
    move-result v18

    .line 331
    iget-object v0, v2, LA/b;->g:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v0, Ld0/q;

    .line 334
    .line 335
    iget-object v0, v0, Ld0/q;->k:LQ0/j;

    .line 336
    .line 337
    new-instance v3, Ld0/l;

    .line 338
    .line 339
    move-object v15, v3

    .line 340
    move-object/from16 v16, v2

    .line 341
    .line 342
    move-object/from16 v17, v4

    .line 343
    .line 344
    invoke-direct/range {v15 .. v21}, Ld0/l;-><init>(LA/b;LA/b;ILjava/lang/String;ILandroid/os/Bundle;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v0, v3}, LQ0/j;->a(Ljava/lang/Runnable;)V

    .line 348
    .line 349
    .line 350
    goto/16 :goto_3

    .line 351
    .line 352
    :pswitch_6
    invoke-virtual {v3, v13}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v4

    .line 356
    invoke-virtual {v3, v14}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 357
    .line 358
    .line 359
    move-result-object v3

    .line 360
    check-cast v3, Lb/d;

    .line 361
    .line 362
    new-instance v5, LA/b;

    .line 363
    .line 364
    iget-object v0, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 365
    .line 366
    invoke-direct {v5, v8, v0}, LA/b;-><init>(ILjava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 373
    .line 374
    .line 375
    move-result v0

    .line 376
    if-nez v0, :cond_b

    .line 377
    .line 378
    if-nez v3, :cond_6

    .line 379
    .line 380
    goto/16 :goto_3

    .line 381
    .line 382
    :cond_6
    iget-object v0, v2, LA/b;->g:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast v0, Ld0/q;

    .line 385
    .line 386
    iget-object v0, v0, Ld0/q;->k:LQ0/j;

    .line 387
    .line 388
    new-instance v6, Ld0/p;

    .line 389
    .line 390
    invoke-direct {v6, v2, v5, v4, v3}, Ld0/p;-><init>(LA/b;LA/b;Ljava/lang/String;Lb/d;)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v0, v6}, LQ0/j;->a(Ljava/lang/Runnable;)V

    .line 394
    .line 395
    .line 396
    goto/16 :goto_3

    .line 397
    .line 398
    :pswitch_7
    invoke-virtual {v3, v13}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v18

    .line 402
    invoke-virtual {v3, v5}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    .line 403
    .line 404
    .line 405
    move-result-object v19

    .line 406
    new-instance v3, LA/b;

    .line 407
    .line 408
    iget-object v0, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 409
    .line 410
    invoke-direct {v3, v8, v0}, LA/b;-><init>(ILjava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    iget-object v0, v2, LA/b;->g:Ljava/lang/Object;

    .line 414
    .line 415
    check-cast v0, Ld0/q;

    .line 416
    .line 417
    iget-object v0, v0, Ld0/q;->k:LQ0/j;

    .line 418
    .line 419
    new-instance v4, Ld0/o;

    .line 420
    .line 421
    const/16 v20, 0x0

    .line 422
    .line 423
    move-object v15, v4

    .line 424
    move-object/from16 v16, v2

    .line 425
    .line 426
    move-object/from16 v17, v3

    .line 427
    .line 428
    invoke-direct/range {v15 .. v20}, Ld0/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v0, v4}, LQ0/j;->a(Ljava/lang/Runnable;)V

    .line 432
    .line 433
    .line 434
    goto/16 :goto_3

    .line 435
    .line 436
    :pswitch_8
    const-string v4, "data_options"

    .line 437
    .line 438
    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 439
    .line 440
    .line 441
    move-result-object v20

    .line 442
    invoke-static/range {v20 .. v20}, Landroid/support/v4/media/session/t;->j(Landroid/os/Bundle;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v3, v13}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v18

    .line 449
    invoke-virtual {v3, v5}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    .line 450
    .line 451
    .line 452
    move-result-object v19

    .line 453
    new-instance v3, LA/b;

    .line 454
    .line 455
    iget-object v0, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 456
    .line 457
    invoke-direct {v3, v8, v0}, LA/b;-><init>(ILjava/lang/Object;)V

    .line 458
    .line 459
    .line 460
    iget-object v0, v2, LA/b;->g:Ljava/lang/Object;

    .line 461
    .line 462
    check-cast v0, Ld0/q;

    .line 463
    .line 464
    iget-object v0, v0, Ld0/q;->k:LQ0/j;

    .line 465
    .line 466
    new-instance v4, Ld0/n;

    .line 467
    .line 468
    move-object v15, v4

    .line 469
    move-object/from16 v16, v2

    .line 470
    .line 471
    move-object/from16 v17, v3

    .line 472
    .line 473
    invoke-direct/range {v15 .. v20}, Ld0/n;-><init>(LA/b;LA/b;Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v0, v4}, LQ0/j;->a(Ljava/lang/Runnable;)V

    .line 477
    .line 478
    .line 479
    goto/16 :goto_3

    .line 480
    .line 481
    :pswitch_9
    new-instance v3, LA/b;

    .line 482
    .line 483
    iget-object v0, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 484
    .line 485
    invoke-direct {v3, v8, v0}, LA/b;-><init>(ILjava/lang/Object;)V

    .line 486
    .line 487
    .line 488
    iget-object v0, v2, LA/b;->g:Ljava/lang/Object;

    .line 489
    .line 490
    check-cast v0, Ld0/q;

    .line 491
    .line 492
    iget-object v0, v0, Ld0/q;->k:LQ0/j;

    .line 493
    .line 494
    new-instance v4, Ld0/m;

    .line 495
    .line 496
    invoke-direct {v4, v2, v3, v7}, Ld0/m;-><init>(LA/b;LA/b;I)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v0, v4}, LQ0/j;->a(Ljava/lang/Runnable;)V

    .line 500
    .line 501
    .line 502
    goto :goto_3

    .line 503
    :pswitch_a
    invoke-virtual {v3, v12}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 504
    .line 505
    .line 506
    move-result-object v21

    .line 507
    invoke-static/range {v21 .. v21}, Landroid/support/v4/media/session/t;->j(Landroid/os/Bundle;)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v3, v11}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v4

    .line 514
    invoke-virtual {v3, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 515
    .line 516
    .line 517
    move-result v19

    .line 518
    invoke-virtual {v3, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 519
    .line 520
    .line 521
    move-result v3

    .line 522
    new-instance v5, LA/b;

    .line 523
    .line 524
    iget-object v0, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 525
    .line 526
    invoke-direct {v5, v8, v0}, LA/b;-><init>(ILjava/lang/Object;)V

    .line 527
    .line 528
    .line 529
    iget-object v0, v2, LA/b;->g:Ljava/lang/Object;

    .line 530
    .line 531
    check-cast v0, Ld0/q;

    .line 532
    .line 533
    if-eqz v4, :cond_8

    .line 534
    .line 535
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 536
    .line 537
    .line 538
    move-result-object v6

    .line 539
    invoke-virtual {v6, v3}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v6

    .line 543
    array-length v8, v6

    .line 544
    :goto_2
    if-ge v7, v8, :cond_9

    .line 545
    .line 546
    aget-object v10, v6, v7

    .line 547
    .line 548
    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 549
    .line 550
    .line 551
    move-result v10

    .line 552
    if-eqz v10, :cond_7

    .line 553
    .line 554
    new-instance v6, Ld0/l;

    .line 555
    .line 556
    move-object v15, v6

    .line 557
    move-object/from16 v16, v2

    .line 558
    .line 559
    move-object/from16 v17, v5

    .line 560
    .line 561
    move-object/from16 v18, v4

    .line 562
    .line 563
    move/from16 v20, v3

    .line 564
    .line 565
    invoke-direct/range {v15 .. v21}, Ld0/l;-><init>(LA/b;LA/b;Ljava/lang/String;IILandroid/os/Bundle;)V

    .line 566
    .line 567
    .line 568
    iget-object v0, v0, Ld0/q;->k:LQ0/j;

    .line 569
    .line 570
    invoke-virtual {v0, v6}, LQ0/j;->a(Ljava/lang/Runnable;)V

    .line 571
    .line 572
    .line 573
    goto :goto_3

    .line 574
    :cond_7
    add-int/2addr v7, v9

    .line 575
    goto :goto_2

    .line 576
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 577
    .line 578
    .line 579
    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 580
    .line 581
    new-instance v2, Ljava/lang/StringBuilder;

    .line 582
    .line 583
    const-string v5, "Package/uid mismatch: uid="

    .line 584
    .line 585
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 589
    .line 590
    .line 591
    const-string v3, " package="

    .line 592
    .line 593
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 594
    .line 595
    .line 596
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object v2

    .line 603
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 604
    .line 605
    .line 606
    throw v0

    .line 607
    :cond_a
    invoke-virtual {v1, v6}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 608
    .line 609
    .line 610
    :cond_b
    :goto_3
    return-void

    .line 611
    :pswitch_b
    iget v2, v0, Landroid/os/Message;->what:I

    .line 612
    .line 613
    if-ne v2, v9, :cond_d

    .line 614
    .line 615
    iget-object v2, v1, LQ0/j;->b:Ljava/lang/Object;

    .line 616
    .line 617
    check-cast v2, LR0/o;

    .line 618
    .line 619
    iget-object v2, v2, LR0/o;->a:Ljava/lang/Object;

    .line 620
    .line 621
    monitor-enter v2

    .line 622
    :try_start_0
    iget-object v3, v1, LQ0/j;->b:Ljava/lang/Object;

    .line 623
    .line 624
    check-cast v3, LR0/o;

    .line 625
    .line 626
    iget-object v3, v3, LR0/o;->d:Ljava/lang/ref/WeakReference;

    .line 627
    .line 628
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v3

    .line 632
    check-cast v3, Landroid/support/v4/media/session/o;

    .line 633
    .line 634
    iget-object v4, v1, LQ0/j;->b:Ljava/lang/Object;

    .line 635
    .line 636
    check-cast v4, LR0/o;

    .line 637
    .line 638
    iget-object v5, v4, LR0/o;->e:LQ0/j;

    .line 639
    .line 640
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 641
    if-eqz v3, :cond_d

    .line 642
    .line 643
    invoke-virtual {v3}, Landroid/support/v4/media/session/o;->b()LR0/o;

    .line 644
    .line 645
    .line 646
    move-result-object v2

    .line 647
    if-ne v4, v2, :cond_d

    .line 648
    .line 649
    if-nez v5, :cond_c

    .line 650
    .line 651
    goto :goto_4

    .line 652
    :cond_c
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 653
    .line 654
    check-cast v0, Ld0/r;

    .line 655
    .line 656
    invoke-virtual {v3, v0}, Landroid/support/v4/media/session/o;->f(Ld0/r;)V

    .line 657
    .line 658
    .line 659
    iget-object v0, v1, LQ0/j;->b:Ljava/lang/Object;

    .line 660
    .line 661
    check-cast v0, LR0/o;

    .line 662
    .line 663
    invoke-virtual {v0, v3, v5}, LR0/o;->a(Landroid/support/v4/media/session/o;Landroid/os/Handler;)V

    .line 664
    .line 665
    .line 666
    invoke-virtual {v3, v6}, Landroid/support/v4/media/session/o;->f(Ld0/r;)V

    .line 667
    .line 668
    .line 669
    goto :goto_4

    .line 670
    :catchall_0
    move-exception v0

    .line 671
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 672
    throw v0

    .line 673
    :cond_d
    :goto_4
    return-void

    .line 674
    :pswitch_c
    iget v5, v0, Landroid/os/Message;->what:I

    .line 675
    .line 676
    const-wide/16 v6, 0x1

    .line 677
    .line 678
    iget-object v8, v1, LQ0/j;->b:Ljava/lang/Object;

    .line 679
    .line 680
    check-cast v8, LQ0/C;

    .line 681
    .line 682
    if-eqz v5, :cond_12

    .line 683
    .line 684
    if-eq v5, v9, :cond_11

    .line 685
    .line 686
    if-eq v5, v4, :cond_10

    .line 687
    .line 688
    if-eq v5, v3, :cond_f

    .line 689
    .line 690
    if-eq v5, v2, :cond_e

    .line 691
    .line 692
    sget-object v2, LQ0/w;->g:LQ0/u;

    .line 693
    .line 694
    new-instance v3, LQ0/i;

    .line 695
    .line 696
    invoke-direct {v3, v0, v9}, LQ0/i;-><init>(Landroid/os/Message;I)V

    .line 697
    .line 698
    .line 699
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 700
    .line 701
    .line 702
    goto :goto_5

    .line 703
    :cond_e
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 704
    .line 705
    check-cast v0, Ljava/lang/Long;

    .line 706
    .line 707
    iget v2, v8, LQ0/C;->k:I

    .line 708
    .line 709
    add-int/2addr v2, v9

    .line 710
    iput v2, v8, LQ0/C;->k:I

    .line 711
    .line 712
    iget-wide v2, v8, LQ0/C;->e:J

    .line 713
    .line 714
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 715
    .line 716
    .line 717
    move-result-wide v4

    .line 718
    add-long/2addr v4, v2

    .line 719
    iput-wide v4, v8, LQ0/C;->e:J

    .line 720
    .line 721
    iget v0, v8, LQ0/C;->k:I

    .line 722
    .line 723
    int-to-long v2, v0

    .line 724
    div-long/2addr v4, v2

    .line 725
    iput-wide v4, v8, LQ0/C;->h:J

    .line 726
    .line 727
    goto :goto_5

    .line 728
    :cond_f
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 729
    .line 730
    int-to-long v2, v0

    .line 731
    iget v0, v8, LQ0/C;->m:I

    .line 732
    .line 733
    add-int/2addr v0, v9

    .line 734
    iput v0, v8, LQ0/C;->m:I

    .line 735
    .line 736
    iget-wide v4, v8, LQ0/C;->g:J

    .line 737
    .line 738
    add-long/2addr v4, v2

    .line 739
    iput-wide v4, v8, LQ0/C;->g:J

    .line 740
    .line 741
    iget v0, v8, LQ0/C;->l:I

    .line 742
    .line 743
    int-to-long v2, v0

    .line 744
    div-long/2addr v4, v2

    .line 745
    iput-wide v4, v8, LQ0/C;->j:J

    .line 746
    .line 747
    goto :goto_5

    .line 748
    :cond_10
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 749
    .line 750
    int-to-long v2, v0

    .line 751
    iget v0, v8, LQ0/C;->l:I

    .line 752
    .line 753
    add-int/2addr v0, v9

    .line 754
    iput v0, v8, LQ0/C;->l:I

    .line 755
    .line 756
    iget-wide v4, v8, LQ0/C;->f:J

    .line 757
    .line 758
    add-long/2addr v4, v2

    .line 759
    iput-wide v4, v8, LQ0/C;->f:J

    .line 760
    .line 761
    int-to-long v2, v0

    .line 762
    div-long/2addr v4, v2

    .line 763
    iput-wide v4, v8, LQ0/C;->i:J

    .line 764
    .line 765
    goto :goto_5

    .line 766
    :cond_11
    iget-wide v2, v8, LQ0/C;->d:J

    .line 767
    .line 768
    add-long/2addr v2, v6

    .line 769
    iput-wide v2, v8, LQ0/C;->d:J

    .line 770
    .line 771
    goto :goto_5

    .line 772
    :cond_12
    iget-wide v2, v8, LQ0/C;->c:J

    .line 773
    .line 774
    add-long/2addr v2, v6

    .line 775
    iput-wide v2, v8, LQ0/C;->c:J

    .line 776
    .line 777
    :goto_5
    return-void

    .line 778
    :pswitch_d
    iget v8, v0, Landroid/os/Message;->what:I

    .line 779
    .line 780
    iget-object v10, v1, LQ0/j;->b:Ljava/lang/Object;

    .line 781
    .line 782
    check-cast v10, LQ0/m;

    .line 783
    .line 784
    packed-switch v8, :pswitch_data_2

    .line 785
    .line 786
    .line 787
    :pswitch_e
    sget-object v2, LQ0/w;->g:LQ0/u;

    .line 788
    .line 789
    new-instance v3, LQ0/i;

    .line 790
    .line 791
    invoke-direct {v3, v0, v7}, LQ0/i;-><init>(Landroid/os/Message;I)V

    .line 792
    .line 793
    .line 794
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 795
    .line 796
    .line 797
    goto/16 :goto_12

    .line 798
    .line 799
    :pswitch_f
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 800
    .line 801
    iget-object v2, v10, LQ0/m;->g:Ljava/util/LinkedHashSet;

    .line 802
    .line 803
    invoke-interface {v2, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 804
    .line 805
    .line 806
    move-result v2

    .line 807
    if-nez v2, :cond_13

    .line 808
    .line 809
    goto/16 :goto_12

    .line 810
    .line 811
    :cond_13
    iget-object v2, v10, LQ0/m;->f:Ljava/util/WeakHashMap;

    .line 812
    .line 813
    invoke-virtual {v2}, Ljava/util/WeakHashMap;->values()Ljava/util/Collection;

    .line 814
    .line 815
    .line 816
    move-result-object v2

    .line 817
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 818
    .line 819
    .line 820
    move-result-object v2

    .line 821
    :cond_14
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 822
    .line 823
    .line 824
    move-result v3

    .line 825
    if-eqz v3, :cond_16

    .line 826
    .line 827
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 828
    .line 829
    .line 830
    move-result-object v3

    .line 831
    check-cast v3, LQ0/n;

    .line 832
    .line 833
    iget-object v4, v3, LQ0/n;->d:Ljava/lang/Object;

    .line 834
    .line 835
    invoke-virtual {v4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 836
    .line 837
    .line 838
    move-result v4

    .line 839
    if-eqz v4, :cond_14

    .line 840
    .line 841
    if-nez v6, :cond_15

    .line 842
    .line 843
    new-instance v6, Ljava/util/ArrayList;

    .line 844
    .line 845
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 846
    .line 847
    .line 848
    :cond_15
    invoke-interface {v6, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 849
    .line 850
    .line 851
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 852
    .line 853
    .line 854
    goto :goto_6

    .line 855
    :cond_16
    if-eqz v6, :cond_32

    .line 856
    .line 857
    const/16 v0, 0xd

    .line 858
    .line 859
    iget-object v2, v10, LQ0/m;->i:LQ0/u;

    .line 860
    .line 861
    invoke-virtual {v2, v0, v6}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 862
    .line 863
    .line 864
    move-result-object v0

    .line 865
    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 866
    .line 867
    .line 868
    goto/16 :goto_12

    .line 869
    .line 870
    :pswitch_10
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 871
    .line 872
    iget-object v2, v10, LQ0/m;->g:Ljava/util/LinkedHashSet;

    .line 873
    .line 874
    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 875
    .line 876
    .line 877
    move-result v2

    .line 878
    if-nez v2, :cond_17

    .line 879
    .line 880
    goto/16 :goto_12

    .line 881
    .line 882
    :cond_17
    iget-object v2, v10, LQ0/m;->d:Ljava/util/LinkedHashMap;

    .line 883
    .line 884
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 885
    .line 886
    .line 887
    move-result-object v2

    .line 888
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 889
    .line 890
    .line 891
    move-result-object v2

    .line 892
    :cond_18
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 893
    .line 894
    .line 895
    move-result v3

    .line 896
    if-eqz v3, :cond_32

    .line 897
    .line 898
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 899
    .line 900
    .line 901
    move-result-object v3

    .line 902
    check-cast v3, LQ0/f;

    .line 903
    .line 904
    iget-object v4, v3, LQ0/f;->b:LQ0/w;

    .line 905
    .line 906
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 907
    .line 908
    .line 909
    iget-object v4, v3, LQ0/f;->j:LQ0/n;

    .line 910
    .line 911
    iget-object v6, v3, LQ0/f;->k:Ljava/util/ArrayList;

    .line 912
    .line 913
    if-eqz v6, :cond_19

    .line 914
    .line 915
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 916
    .line 917
    .line 918
    move-result v8

    .line 919
    if-nez v8, :cond_19

    .line 920
    .line 921
    const/4 v8, 0x1

    .line 922
    goto :goto_8

    .line 923
    :cond_19
    const/4 v8, 0x0

    .line 924
    :goto_8
    if-nez v4, :cond_1a

    .line 925
    .line 926
    if-nez v8, :cond_1a

    .line 927
    .line 928
    goto :goto_7

    .line 929
    :cond_1a
    iget-object v11, v10, LQ0/m;->f:Ljava/util/WeakHashMap;

    .line 930
    .line 931
    if-eqz v4, :cond_1b

    .line 932
    .line 933
    iget-object v12, v4, LQ0/n;->d:Ljava/lang/Object;

    .line 934
    .line 935
    invoke-virtual {v12, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 936
    .line 937
    .line 938
    move-result v12

    .line 939
    if-eqz v12, :cond_1b

    .line 940
    .line 941
    invoke-virtual {v3, v4}, LQ0/f;->c(LQ0/n;)V

    .line 942
    .line 943
    .line 944
    invoke-virtual {v4}, LQ0/n;->a()Ljava/lang/Object;

    .line 945
    .line 946
    .line 947
    move-result-object v12

    .line 948
    invoke-virtual {v11, v12, v4}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    :cond_1b
    if-eqz v8, :cond_1d

    .line 952
    .line 953
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 954
    .line 955
    .line 956
    move-result v4

    .line 957
    sub-int/2addr v4, v9

    .line 958
    :goto_9
    if-ltz v4, :cond_1d

    .line 959
    .line 960
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 961
    .line 962
    .line 963
    move-result-object v8

    .line 964
    check-cast v8, LQ0/n;

    .line 965
    .line 966
    iget-object v12, v8, LQ0/n;->d:Ljava/lang/Object;

    .line 967
    .line 968
    invoke-virtual {v12, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 969
    .line 970
    .line 971
    move-result v12

    .line 972
    if-nez v12, :cond_1c

    .line 973
    .line 974
    goto :goto_a

    .line 975
    :cond_1c
    invoke-virtual {v3, v8}, LQ0/f;->c(LQ0/n;)V

    .line 976
    .line 977
    .line 978
    invoke-virtual {v8}, LQ0/n;->a()Ljava/lang/Object;

    .line 979
    .line 980
    .line 981
    move-result-object v12

    .line 982
    invoke-virtual {v11, v12, v8}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 983
    .line 984
    .line 985
    :goto_a
    add-int/2addr v4, v5

    .line 986
    goto :goto_9

    .line 987
    :cond_1d
    invoke-virtual {v3}, LQ0/f;->a()Z

    .line 988
    .line 989
    .line 990
    move-result v3

    .line 991
    if-eqz v3, :cond_18

    .line 992
    .line 993
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 994
    .line 995
    .line 996
    goto :goto_7

    .line 997
    :pswitch_11
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 998
    .line 999
    .line 1000
    goto/16 :goto_12

    .line 1001
    .line 1002
    :pswitch_12
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1003
    .line 1004
    check-cast v0, Landroid/net/NetworkInfo;

    .line 1005
    .line 1006
    iget-object v5, v10, LQ0/m;->b:LQ0/y;

    .line 1007
    .line 1008
    instance-of v6, v5, LQ0/y;

    .line 1009
    .line 1010
    if-eqz v6, :cond_22

    .line 1011
    .line 1012
    if-eqz v0, :cond_21

    .line 1013
    .line 1014
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    .line 1018
    .line 1019
    .line 1020
    move-result v6

    .line 1021
    if-nez v6, :cond_1e

    .line 1022
    .line 1023
    goto :goto_b

    .line 1024
    :cond_1e
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    .line 1025
    .line 1026
    .line 1027
    move-result v6

    .line 1028
    if-eqz v6, :cond_20

    .line 1029
    .line 1030
    if-eq v6, v9, :cond_1f

    .line 1031
    .line 1032
    const/4 v4, 0x6

    .line 1033
    if-eq v6, v4, :cond_1f

    .line 1034
    .line 1035
    const/16 v4, 0x9

    .line 1036
    .line 1037
    if-eq v6, v4, :cond_1f

    .line 1038
    .line 1039
    invoke-virtual {v5, v3}, LQ0/y;->f(I)V

    .line 1040
    .line 1041
    .line 1042
    goto :goto_c

    .line 1043
    :cond_1f
    invoke-virtual {v5, v2}, LQ0/y;->f(I)V

    .line 1044
    .line 1045
    .line 1046
    goto :goto_c

    .line 1047
    :cond_20
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getSubtype()I

    .line 1048
    .line 1049
    .line 1050
    move-result v2

    .line 1051
    packed-switch v2, :pswitch_data_3

    .line 1052
    .line 1053
    .line 1054
    packed-switch v2, :pswitch_data_4

    .line 1055
    .line 1056
    .line 1057
    invoke-virtual {v5, v3}, LQ0/y;->f(I)V

    .line 1058
    .line 1059
    .line 1060
    goto :goto_c

    .line 1061
    :pswitch_13
    invoke-virtual {v5, v3}, LQ0/y;->f(I)V

    .line 1062
    .line 1063
    .line 1064
    goto :goto_c

    .line 1065
    :pswitch_14
    invoke-virtual {v5, v4}, LQ0/y;->f(I)V

    .line 1066
    .line 1067
    .line 1068
    goto :goto_c

    .line 1069
    :pswitch_15
    invoke-virtual {v5, v9}, LQ0/y;->f(I)V

    .line 1070
    .line 1071
    .line 1072
    goto :goto_c

    .line 1073
    :cond_21
    :goto_b
    invoke-virtual {v5, v3}, LQ0/y;->f(I)V

    .line 1074
    .line 1075
    .line 1076
    :cond_22
    :goto_c
    if-eqz v0, :cond_32

    .line 1077
    .line 1078
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 1079
    .line 1080
    .line 1081
    move-result v0

    .line 1082
    if-eqz v0, :cond_32

    .line 1083
    .line 1084
    iget-object v0, v10, LQ0/m;->e:Ljava/util/WeakHashMap;

    .line 1085
    .line 1086
    invoke-virtual {v0}, Ljava/util/WeakHashMap;->isEmpty()Z

    .line 1087
    .line 1088
    .line 1089
    move-result v2

    .line 1090
    if-nez v2, :cond_32

    .line 1091
    .line 1092
    invoke-virtual {v0}, Ljava/util/WeakHashMap;->values()Ljava/util/Collection;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v0

    .line 1096
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v0

    .line 1100
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1101
    .line 1102
    .line 1103
    move-result v2

    .line 1104
    if-eqz v2, :cond_32

    .line 1105
    .line 1106
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v2

    .line 1110
    check-cast v2, LQ0/n;

    .line 1111
    .line 1112
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 1113
    .line 1114
    .line 1115
    iget-object v3, v2, LQ0/n;->a:LQ0/w;

    .line 1116
    .line 1117
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1118
    .line 1119
    .line 1120
    invoke-virtual {v10, v2, v7}, LQ0/m;->d(LQ0/n;Z)V

    .line 1121
    .line 1122
    .line 1123
    goto :goto_d

    .line 1124
    :pswitch_16
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1125
    .line 1126
    .line 1127
    new-instance v0, Ljava/util/ArrayList;

    .line 1128
    .line 1129
    iget-object v2, v10, LQ0/m;->l:Ljava/util/ArrayList;

    .line 1130
    .line 1131
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1132
    .line 1133
    .line 1134
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 1135
    .line 1136
    .line 1137
    const/16 v2, 0x8

    .line 1138
    .line 1139
    iget-object v3, v10, LQ0/m;->i:LQ0/u;

    .line 1140
    .line 1141
    invoke-virtual {v3, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v2

    .line 1145
    invoke-virtual {v3, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1146
    .line 1147
    .line 1148
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1149
    .line 1150
    .line 1151
    move-result v2

    .line 1152
    if-eqz v2, :cond_23

    .line 1153
    .line 1154
    goto/16 :goto_12

    .line 1155
    .line 1156
    :cond_23
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v0

    .line 1160
    check-cast v0, LQ0/f;

    .line 1161
    .line 1162
    iget-object v0, v0, LQ0/f;->b:LQ0/w;

    .line 1163
    .line 1164
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1165
    .line 1166
    .line 1167
    goto/16 :goto_12

    .line 1168
    .line 1169
    :pswitch_17
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1170
    .line 1171
    check-cast v0, LQ0/f;

    .line 1172
    .line 1173
    invoke-virtual {v10, v0, v7}, LQ0/m;->c(LQ0/f;Z)V

    .line 1174
    .line 1175
    .line 1176
    goto/16 :goto_12

    .line 1177
    .line 1178
    :pswitch_18
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1179
    .line 1180
    check-cast v0, LQ0/f;

    .line 1181
    .line 1182
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1183
    .line 1184
    .line 1185
    iget-object v2, v0, LQ0/f;->m:Ljava/util/concurrent/Future;

    .line 1186
    .line 1187
    if-eqz v2, :cond_24

    .line 1188
    .line 1189
    invoke-interface {v2}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 1190
    .line 1191
    .line 1192
    move-result v2

    .line 1193
    if-eqz v2, :cond_24

    .line 1194
    .line 1195
    goto/16 :goto_12

    .line 1196
    .line 1197
    :cond_24
    iget-object v2, v10, LQ0/m;->b:LQ0/y;

    .line 1198
    .line 1199
    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->isShutdown()Z

    .line 1200
    .line 1201
    .line 1202
    move-result v3

    .line 1203
    if-eqz v3, :cond_25

    .line 1204
    .line 1205
    invoke-virtual {v10, v0, v7}, LQ0/m;->c(LQ0/f;Z)V

    .line 1206
    .line 1207
    .line 1208
    goto/16 :goto_12

    .line 1209
    .line 1210
    :cond_25
    iget-boolean v3, v10, LQ0/m;->m:Z

    .line 1211
    .line 1212
    if-eqz v3, :cond_26

    .line 1213
    .line 1214
    sget-object v4, LQ0/H;->a:Lr1/h;

    .line 1215
    .line 1216
    const-string v4, "connectivity"

    .line 1217
    .line 1218
    iget-object v5, v10, LQ0/m;->a:Landroid/content/Context;

    .line 1219
    .line 1220
    invoke-virtual {v5, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v4

    .line 1224
    check-cast v4, Landroid/net/ConnectivityManager;

    .line 1225
    .line 1226
    invoke-virtual {v4}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v6

    .line 1230
    :cond_26
    iget v4, v0, LQ0/f;->q:I

    .line 1231
    .line 1232
    iget-object v5, v0, LQ0/f;->i:LQ0/B;

    .line 1233
    .line 1234
    if-lez v4, :cond_27

    .line 1235
    .line 1236
    sub-int/2addr v4, v9

    .line 1237
    iput v4, v0, LQ0/f;->q:I

    .line 1238
    .line 1239
    invoke-virtual {v5, v6}, LQ0/B;->d(Landroid/net/NetworkInfo;)Z

    .line 1240
    .line 1241
    .line 1242
    move-result v4

    .line 1243
    goto :goto_e

    .line 1244
    :cond_27
    const/4 v4, 0x0

    .line 1245
    :goto_e
    if-eqz v4, :cond_29

    .line 1246
    .line 1247
    iget-object v3, v0, LQ0/f;->b:LQ0/w;

    .line 1248
    .line 1249
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1250
    .line 1251
    .line 1252
    iget-object v3, v0, LQ0/f;->o:Ljava/lang/Exception;

    .line 1253
    .line 1254
    instance-of v3, v3, LQ0/r;

    .line 1255
    .line 1256
    if-eqz v3, :cond_28

    .line 1257
    .line 1258
    iget v3, v0, LQ0/f;->h:I

    .line 1259
    .line 1260
    or-int/2addr v3, v9

    .line 1261
    iput v3, v0, LQ0/f;->h:I

    .line 1262
    .line 1263
    :cond_28
    invoke-virtual {v2, v0}, LQ0/y;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v2

    .line 1267
    iput-object v2, v0, LQ0/f;->m:Ljava/util/concurrent/Future;

    .line 1268
    .line 1269
    goto/16 :goto_12

    .line 1270
    .line 1271
    :cond_29
    if-eqz v3, :cond_2a

    .line 1272
    .line 1273
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1274
    .line 1275
    .line 1276
    instance-of v2, v5, LQ0/t;

    .line 1277
    .line 1278
    if-eqz v2, :cond_2a

    .line 1279
    .line 1280
    const/4 v2, 0x1

    .line 1281
    goto :goto_f

    .line 1282
    :cond_2a
    const/4 v2, 0x0

    .line 1283
    :goto_f
    invoke-virtual {v10, v0, v2}, LQ0/m;->c(LQ0/f;Z)V

    .line 1284
    .line 1285
    .line 1286
    if-eqz v2, :cond_32

    .line 1287
    .line 1288
    iget-object v2, v0, LQ0/f;->j:LQ0/n;

    .line 1289
    .line 1290
    iget-object v3, v10, LQ0/m;->e:Ljava/util/WeakHashMap;

    .line 1291
    .line 1292
    if-eqz v2, :cond_2b

    .line 1293
    .line 1294
    invoke-virtual {v2}, LQ0/n;->a()Ljava/lang/Object;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v4

    .line 1298
    if-eqz v4, :cond_2b

    .line 1299
    .line 1300
    iput-boolean v9, v2, LQ0/n;->e:Z

    .line 1301
    .line 1302
    invoke-virtual {v3, v4, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1303
    .line 1304
    .line 1305
    :cond_2b
    iget-object v0, v0, LQ0/f;->k:Ljava/util/ArrayList;

    .line 1306
    .line 1307
    if-eqz v0, :cond_32

    .line 1308
    .line 1309
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1310
    .line 1311
    .line 1312
    move-result v2

    .line 1313
    :goto_10
    if-ge v7, v2, :cond_32

    .line 1314
    .line 1315
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v4

    .line 1319
    check-cast v4, LQ0/n;

    .line 1320
    .line 1321
    invoke-virtual {v4}, LQ0/n;->a()Ljava/lang/Object;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v5

    .line 1325
    if-eqz v5, :cond_2c

    .line 1326
    .line 1327
    iput-boolean v9, v4, LQ0/n;->e:Z

    .line 1328
    .line 1329
    invoke-virtual {v3, v5, v4}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1330
    .line 1331
    .line 1332
    :cond_2c
    add-int/2addr v7, v9

    .line 1333
    goto :goto_10

    .line 1334
    :pswitch_19
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1335
    .line 1336
    check-cast v0, LQ0/f;

    .line 1337
    .line 1338
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1339
    .line 1340
    .line 1341
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1342
    .line 1343
    .line 1344
    iget-object v2, v0, LQ0/f;->l:Landroid/graphics/Bitmap;

    .line 1345
    .line 1346
    iget-object v3, v10, LQ0/m;->j:LA/b;

    .line 1347
    .line 1348
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1349
    .line 1350
    .line 1351
    iget-object v4, v0, LQ0/f;->f:Ljava/lang/String;

    .line 1352
    .line 1353
    if-eqz v4, :cond_2f

    .line 1354
    .line 1355
    if-eqz v2, :cond_2f

    .line 1356
    .line 1357
    sget-object v5, LQ0/H;->a:Lr1/h;

    .line 1358
    .line 1359
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    .line 1360
    .line 1361
    .line 1362
    move-result v5

    .line 1363
    if-ltz v5, :cond_2e

    .line 1364
    .line 1365
    iget-object v3, v3, LA/b;->g:Ljava/lang/Object;

    .line 1366
    .line 1367
    check-cast v3, LQ0/o;

    .line 1368
    .line 1369
    invoke-virtual {v3}, Landroid/util/LruCache;->maxSize()I

    .line 1370
    .line 1371
    .line 1372
    move-result v6

    .line 1373
    if-le v5, v6, :cond_2d

    .line 1374
    .line 1375
    invoke-virtual {v3, v4}, Landroid/util/LruCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1376
    .line 1377
    .line 1378
    goto :goto_11

    .line 1379
    :cond_2d
    new-instance v6, LQ0/p;

    .line 1380
    .line 1381
    invoke-direct {v6, v2, v5}, LQ0/p;-><init>(Landroid/graphics/Bitmap;I)V

    .line 1382
    .line 1383
    .line 1384
    invoke-virtual {v3, v4, v6}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1385
    .line 1386
    .line 1387
    :goto_11
    iget-object v2, v10, LQ0/m;->d:Ljava/util/LinkedHashMap;

    .line 1388
    .line 1389
    invoke-interface {v2, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1390
    .line 1391
    .line 1392
    invoke-virtual {v10, v0}, LQ0/m;->a(LQ0/f;)V

    .line 1393
    .line 1394
    .line 1395
    iget-object v0, v0, LQ0/f;->b:LQ0/w;

    .line 1396
    .line 1397
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1398
    .line 1399
    .line 1400
    goto :goto_12

    .line 1401
    :cond_2e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1402
    .line 1403
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1404
    .line 1405
    const-string v4, "Negative size: "

    .line 1406
    .line 1407
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1408
    .line 1409
    .line 1410
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1411
    .line 1412
    .line 1413
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v2

    .line 1417
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1418
    .line 1419
    .line 1420
    throw v0

    .line 1421
    :cond_2f
    new-instance v0, Ljava/lang/NullPointerException;

    .line 1422
    .line 1423
    const-string v2, "key == null || bitmap == null"

    .line 1424
    .line 1425
    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 1426
    .line 1427
    .line 1428
    throw v0

    .line 1429
    :pswitch_1a
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1430
    .line 1431
    check-cast v0, LQ0/n;

    .line 1432
    .line 1433
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1434
    .line 1435
    .line 1436
    iget-object v2, v0, LQ0/n;->c:Ljava/lang/String;

    .line 1437
    .line 1438
    iget-object v3, v10, LQ0/m;->d:Ljava/util/LinkedHashMap;

    .line 1439
    .line 1440
    invoke-virtual {v3, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v4

    .line 1444
    check-cast v4, LQ0/f;

    .line 1445
    .line 1446
    iget-object v5, v0, LQ0/n;->a:LQ0/w;

    .line 1447
    .line 1448
    if-eqz v4, :cond_30

    .line 1449
    .line 1450
    invoke-virtual {v4, v0}, LQ0/f;->c(LQ0/n;)V

    .line 1451
    .line 1452
    .line 1453
    invoke-virtual {v4}, LQ0/f;->a()Z

    .line 1454
    .line 1455
    .line 1456
    move-result v4

    .line 1457
    if-eqz v4, :cond_30

    .line 1458
    .line 1459
    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1460
    .line 1461
    .line 1462
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1463
    .line 1464
    .line 1465
    :cond_30
    iget-object v2, v10, LQ0/m;->g:Ljava/util/LinkedHashSet;

    .line 1466
    .line 1467
    iget-object v3, v0, LQ0/n;->d:Ljava/lang/Object;

    .line 1468
    .line 1469
    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1470
    .line 1471
    .line 1472
    move-result v2

    .line 1473
    if-eqz v2, :cond_31

    .line 1474
    .line 1475
    iget-object v2, v10, LQ0/m;->f:Ljava/util/WeakHashMap;

    .line 1476
    .line 1477
    invoke-virtual {v0}, LQ0/n;->a()Ljava/lang/Object;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v3

    .line 1481
    invoke-virtual {v2, v3}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1482
    .line 1483
    .line 1484
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1485
    .line 1486
    .line 1487
    :cond_31
    iget-object v2, v10, LQ0/m;->e:Ljava/util/WeakHashMap;

    .line 1488
    .line 1489
    invoke-virtual {v0}, LQ0/n;->a()Ljava/lang/Object;

    .line 1490
    .line 1491
    .line 1492
    move-result-object v0

    .line 1493
    invoke-virtual {v2, v0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v0

    .line 1497
    check-cast v0, LQ0/n;

    .line 1498
    .line 1499
    if-eqz v0, :cond_32

    .line 1500
    .line 1501
    iget-object v0, v0, LQ0/n;->a:LQ0/w;

    .line 1502
    .line 1503
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1504
    .line 1505
    .line 1506
    goto :goto_12

    .line 1507
    :pswitch_1b
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1508
    .line 1509
    check-cast v0, LQ0/n;

    .line 1510
    .line 1511
    invoke-virtual {v10, v0, v9}, LQ0/m;->d(LQ0/n;Z)V

    .line 1512
    .line 1513
    .line 1514
    :cond_32
    :goto_12
    return-void

    .line 1515
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch

    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_1b
        :pswitch_1a
        :pswitch_e
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_e
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
    .end packed-switch

    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_15
        :pswitch_15
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
    .end packed-switch

    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    :pswitch_data_4
    .packed-switch 0xc
        :pswitch_14
        :pswitch_13
        :pswitch_13
        :pswitch_13
    .end packed-switch
.end method

.method public sendMessageAtTime(Landroid/os/Message;J)Z
    .locals 3

    .line 1
    iget v0, p0, LQ0/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroid/os/Handler;->sendMessageAtTime(Landroid/os/Message;J)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-class v1, Landroid/support/v4/media/f;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 22
    .line 23
    .line 24
    const-string v1, "data_calling_uid"

    .line 25
    .line 26
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 31
    .line 32
    .line 33
    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const-string v2, "data_calling_pid"

    .line 38
    .line 39
    if-lez v1, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_1

    .line 50
    .line 51
    const/4 v1, -0x1

    .line 52
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 53
    .line 54
    .line 55
    :cond_1
    :goto_0
    invoke-super {p0, p1, p2, p3}, Landroid/os/Handler;->sendMessageAtTime(Landroid/os/Message;J)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    return p1

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
