.class public final LT/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LT/k;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 14

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    iget v3, p0, LT/k;->a:I

    .line 5
    .line 6
    packed-switch v3, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance v0, Ly0/b;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 12
    .line 13
    .line 14
    const-class v1, Ly0/b;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    iput p1, v0, Ly0/b;->a:I

    .line 31
    .line 32
    return-object v0

    .line 33
    :pswitch_0
    new-instance v0, Landroidx/versionedparcelable/ParcelImpl;

    .line 34
    .line 35
    invoke-direct {v0, p1}, Landroidx/versionedparcelable/ParcelImpl;-><init>(Landroid/os/Parcel;)V

    .line 36
    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_1
    new-instance v0, Lo/O;

    .line 40
    .line 41
    invoke-direct {v0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_0

    .line 49
    .line 50
    const/4 v1, 0x1

    .line 51
    :cond_0
    iput-boolean v1, v0, Lo/O;->a:Z

    .line 52
    .line 53
    return-object v0

    .line 54
    :pswitch_2
    new-instance v0, Lj0/h0;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    iput v3, v0, Lj0/h0;->a:I

    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    iput v3, v0, Lj0/h0;->b:I

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    iput v3, v0, Lj0/h0;->c:I

    .line 76
    .line 77
    if-lez v3, :cond_1

    .line 78
    .line 79
    new-array v3, v3, [I

    .line 80
    .line 81
    iput-object v3, v0, Lj0/h0;->d:[I

    .line 82
    .line 83
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->readIntArray([I)V

    .line 84
    .line 85
    .line 86
    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    iput v3, v0, Lj0/h0;->e:I

    .line 91
    .line 92
    if-lez v3, :cond_2

    .line 93
    .line 94
    new-array v3, v3, [I

    .line 95
    .line 96
    iput-object v3, v0, Lj0/h0;->f:[I

    .line 97
    .line 98
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->readIntArray([I)V

    .line 99
    .line 100
    .line 101
    :cond_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-ne v3, v2, :cond_3

    .line 106
    .line 107
    const/4 v3, 0x1

    .line 108
    goto :goto_0

    .line 109
    :cond_3
    const/4 v3, 0x0

    .line 110
    :goto_0
    iput-boolean v3, v0, Lj0/h0;->h:Z

    .line 111
    .line 112
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-ne v3, v2, :cond_4

    .line 117
    .line 118
    const/4 v3, 0x1

    .line 119
    goto :goto_1

    .line 120
    :cond_4
    const/4 v3, 0x0

    .line 121
    :goto_1
    iput-boolean v3, v0, Lj0/h0;->i:Z

    .line 122
    .line 123
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-ne v3, v2, :cond_5

    .line 128
    .line 129
    const/4 v1, 0x1

    .line 130
    :cond_5
    iput-boolean v1, v0, Lj0/h0;->j:Z

    .line 131
    .line 132
    const-class v1, Lj0/g0;

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    iput-object p1, v0, Lj0/h0;->g:Ljava/util/ArrayList;

    .line 143
    .line 144
    return-object v0

    .line 145
    :pswitch_3
    new-instance v0, Lj0/g0;

    .line 146
    .line 147
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    iput v3, v0, Lj0/g0;->a:I

    .line 155
    .line 156
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    iput v3, v0, Lj0/g0;->b:I

    .line 161
    .line 162
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    if-ne v3, v2, :cond_6

    .line 167
    .line 168
    const/4 v1, 0x1

    .line 169
    :cond_6
    iput-boolean v1, v0, Lj0/g0;->d:Z

    .line 170
    .line 171
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-lez v1, :cond_7

    .line 176
    .line 177
    new-array v1, v1, [I

    .line 178
    .line 179
    iput-object v1, v0, Lj0/g0;->c:[I

    .line 180
    .line 181
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readIntArray([I)V

    .line 182
    .line 183
    .line 184
    :cond_7
    return-object v0

    .line 185
    :pswitch_4
    new-instance v0, Lj0/u;

    .line 186
    .line 187
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    iput v3, v0, Lj0/u;->a:I

    .line 195
    .line 196
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    iput v3, v0, Lj0/u;->b:I

    .line 201
    .line 202
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    if-ne p1, v2, :cond_8

    .line 207
    .line 208
    const/4 v1, 0x1

    .line 209
    :cond_8
    iput-boolean v1, v0, Lj0/u;->c:Z

    .line 210
    .line 211
    return-object v0

    .line 212
    :pswitch_5
    new-instance v0, Lg0/D;

    .line 213
    .line 214
    invoke-direct {v0, p1}, Lg0/D;-><init>(Landroid/os/Parcel;)V

    .line 215
    .line 216
    .line 217
    return-object v0

    .line 218
    :pswitch_6
    new-instance v0, Lg0/C;

    .line 219
    .line 220
    invoke-direct {v0, p1}, Lg0/C;-><init>(Landroid/os/Parcel;)V

    .line 221
    .line 222
    .line 223
    return-object v0

    .line 224
    :pswitch_7
    new-instance v0, Lg0/s;

    .line 225
    .line 226
    invoke-direct {v0, p1}, Lg0/s;-><init>(Landroid/os/Parcel;)V

    .line 227
    .line 228
    .line 229
    return-object v0

    .line 230
    :pswitch_8
    new-instance v0, Lg0/l;

    .line 231
    .line 232
    invoke-direct {v0, p1}, Lg0/l;-><init>(Landroid/os/Parcel;)V

    .line 233
    .line 234
    .line 235
    return-object v0

    .line 236
    :pswitch_9
    new-instance v0, Lg0/i;

    .line 237
    .line 238
    invoke-direct {v0, p1}, Lg0/i;-><init>(Landroid/os/Parcel;)V

    .line 239
    .line 240
    .line 241
    return-object v0

    .line 242
    :pswitch_a
    new-instance v0, Lg0/f;

    .line 243
    .line 244
    invoke-direct {v0, p1}, Lg0/f;-><init>(Landroid/os/Parcel;)V

    .line 245
    .line 246
    .line 247
    return-object v0

    .line 248
    :pswitch_b
    new-instance v0, Lg0/c;

    .line 249
    .line 250
    invoke-direct {v0, p1}, Lg0/c;-><init>(Landroid/os/Parcel;)V

    .line 251
    .line 252
    .line 253
    return-object v0

    .line 254
    :pswitch_c
    const-string v1, "parcel"

    .line 255
    .line 256
    invoke-static {v1, p1}, LZ0/c;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    new-instance v1, Ld/a;

    .line 260
    .line 261
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 262
    .line 263
    .line 264
    move-result v2

    .line 265
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    if-nez v3, :cond_9

    .line 270
    .line 271
    goto :goto_2

    .line 272
    :cond_9
    sget-object v0, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 273
    .line 274
    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    move-object v0, p1

    .line 279
    check-cast v0, Landroid/content/Intent;

    .line 280
    .line 281
    :goto_2
    invoke-direct {v1, v0, v2}, Ld/a;-><init>(Landroid/content/Intent;I)V

    .line 282
    .line 283
    .line 284
    return-object v1

    .line 285
    :pswitch_d
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 290
    .line 291
    .line 292
    move-result p1

    .line 293
    invoke-static {v0, p1}, Lcom/google/android/material/datepicker/n;->a(II)Lcom/google/android/material/datepicker/n;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    return-object p1

    .line 298
    :pswitch_e
    new-instance v0, Lcom/google/android/material/datepicker/d;

    .line 299
    .line 300
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    .line 301
    .line 302
    .line 303
    move-result-wide v1

    .line 304
    invoke-direct {v0, v1, v2}, Lcom/google/android/material/datepicker/d;-><init>(J)V

    .line 305
    .line 306
    .line 307
    return-object v0

    .line 308
    :pswitch_f
    const-class v0, Lcom/google/android/material/datepicker/n;

    .line 309
    .line 310
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    move-object v3, v1

    .line 319
    check-cast v3, Lcom/google/android/material/datepicker/n;

    .line 320
    .line 321
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    move-object v4, v1

    .line 330
    check-cast v4, Lcom/google/android/material/datepicker/n;

    .line 331
    .line 332
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    move-object v6, v0

    .line 341
    check-cast v6, Lcom/google/android/material/datepicker/n;

    .line 342
    .line 343
    const-class v0, Lcom/google/android/material/datepicker/d;

    .line 344
    .line 345
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    move-object v5, v0

    .line 354
    check-cast v5, Lcom/google/android/material/datepicker/d;

    .line 355
    .line 356
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 357
    .line 358
    .line 359
    move-result v7

    .line 360
    new-instance p1, Lcom/google/android/material/datepicker/b;

    .line 361
    .line 362
    move-object v2, p1

    .line 363
    invoke-direct/range {v2 .. v7}, Lcom/google/android/material/datepicker/b;-><init>(Lcom/google/android/material/datepicker/n;Lcom/google/android/material/datepicker/n;Lcom/google/android/material/datepicker/d;Lcom/google/android/material/datepicker/n;I)V

    .line 364
    .line 365
    .line 366
    return-object p1

    .line 367
    :pswitch_10
    new-instance v1, Lb/d;

    .line 368
    .line 369
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 370
    .line 371
    .line 372
    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 373
    .line 374
    .line 375
    move-result-object p1

    .line 376
    sget v2, Lb/c;->c:I

    .line 377
    .line 378
    if-nez p1, :cond_a

    .line 379
    .line 380
    goto :goto_3

    .line 381
    :cond_a
    sget-object v0, Lb/b;->a:Ljava/lang/String;

    .line 382
    .line 383
    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    if-eqz v0, :cond_b

    .line 388
    .line 389
    instance-of v2, v0, Lb/b;

    .line 390
    .line 391
    if-eqz v2, :cond_b

    .line 392
    .line 393
    check-cast v0, Lb/b;

    .line 394
    .line 395
    goto :goto_3

    .line 396
    :cond_b
    new-instance v0, Lb/a;

    .line 397
    .line 398
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 399
    .line 400
    .line 401
    iput-object p1, v0, Lb/a;->b:Landroid/os/IBinder;

    .line 402
    .line 403
    :goto_3
    iput-object v0, v1, Lb/d;->a:Lb/b;

    .line 404
    .line 405
    return-object v1

    .line 406
    :pswitch_11
    new-instance v0, Landroidx/fragment/app/L;

    .line 407
    .line 408
    invoke-direct {v0, p1}, Landroidx/fragment/app/L;-><init>(Landroid/os/Parcel;)V

    .line 409
    .line 410
    .line 411
    return-object v0

    .line 412
    :pswitch_12
    new-instance v1, Landroidx/fragment/app/I;

    .line 413
    .line 414
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 415
    .line 416
    .line 417
    iput-object v0, v1, Landroidx/fragment/app/I;->e:Ljava/lang/String;

    .line 418
    .line 419
    new-instance v0, Ljava/util/ArrayList;

    .line 420
    .line 421
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 422
    .line 423
    .line 424
    iput-object v0, v1, Landroidx/fragment/app/I;->f:Ljava/util/ArrayList;

    .line 425
    .line 426
    new-instance v0, Ljava/util/ArrayList;

    .line 427
    .line 428
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 429
    .line 430
    .line 431
    iput-object v0, v1, Landroidx/fragment/app/I;->g:Ljava/util/ArrayList;

    .line 432
    .line 433
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    iput-object v0, v1, Landroidx/fragment/app/I;->a:Ljava/util/ArrayList;

    .line 438
    .line 439
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    iput-object v0, v1, Landroidx/fragment/app/I;->b:Ljava/util/ArrayList;

    .line 444
    .line 445
    sget-object v0, Landroidx/fragment/app/b;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 446
    .line 447
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    check-cast v0, [Landroidx/fragment/app/b;

    .line 452
    .line 453
    iput-object v0, v1, Landroidx/fragment/app/I;->c:[Landroidx/fragment/app/b;

    .line 454
    .line 455
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 456
    .line 457
    .line 458
    move-result v0

    .line 459
    iput v0, v1, Landroidx/fragment/app/I;->d:I

    .line 460
    .line 461
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    iput-object v0, v1, Landroidx/fragment/app/I;->e:Ljava/lang/String;

    .line 466
    .line 467
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    iput-object v0, v1, Landroidx/fragment/app/I;->f:Ljava/util/ArrayList;

    .line 472
    .line 473
    sget-object v0, Landroidx/fragment/app/c;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 474
    .line 475
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    iput-object v0, v1, Landroidx/fragment/app/I;->g:Ljava/util/ArrayList;

    .line 480
    .line 481
    sget-object v0, Landroidx/fragment/app/E;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 482
    .line 483
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 484
    .line 485
    .line 486
    move-result-object p1

    .line 487
    iput-object p1, v1, Landroidx/fragment/app/I;->h:Ljava/util/ArrayList;

    .line 488
    .line 489
    return-object v1

    .line 490
    :pswitch_13
    new-instance v0, Landroidx/fragment/app/E;

    .line 491
    .line 492
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 493
    .line 494
    .line 495
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v1

    .line 499
    iput-object v1, v0, Landroidx/fragment/app/E;->a:Ljava/lang/String;

    .line 500
    .line 501
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 502
    .line 503
    .line 504
    move-result p1

    .line 505
    iput p1, v0, Landroidx/fragment/app/E;->b:I

    .line 506
    .line 507
    return-object v0

    .line 508
    :pswitch_14
    new-instance v0, Landroidx/fragment/app/c;

    .line 509
    .line 510
    invoke-direct {v0, p1}, Landroidx/fragment/app/c;-><init>(Landroid/os/Parcel;)V

    .line 511
    .line 512
    .line 513
    return-object v0

    .line 514
    :pswitch_15
    new-instance v0, Landroidx/fragment/app/b;

    .line 515
    .line 516
    invoke-direct {v0, p1}, Landroidx/fragment/app/b;-><init>(Landroid/os/Parcel;)V

    .line 517
    .line 518
    .line 519
    return-object v0

    .line 520
    :pswitch_16
    new-instance v0, Landroid/support/v4/media/RatingCompat;

    .line 521
    .line 522
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 523
    .line 524
    .line 525
    move-result v1

    .line 526
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    .line 527
    .line 528
    .line 529
    move-result p1

    .line 530
    invoke-direct {v0, v1, p1}, Landroid/support/v4/media/RatingCompat;-><init>(IF)V

    .line 531
    .line 532
    .line 533
    return-object v0

    .line 534
    :pswitch_17
    new-instance v0, Landroid/support/v4/media/MediaMetadataCompat;

    .line 535
    .line 536
    invoke-direct {v0, p1}, Landroid/support/v4/media/MediaMetadataCompat;-><init>(Landroid/os/Parcel;)V

    .line 537
    .line 538
    .line 539
    return-object v0

    .line 540
    :pswitch_18
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 541
    .line 542
    sget-object v2, Landroid/media/MediaDescription;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 543
    .line 544
    invoke-interface {v2, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object p1

    .line 548
    if-eqz p1, :cond_12

    .line 549
    .line 550
    check-cast p1, Landroid/media/MediaDescription;

    .line 551
    .line 552
    invoke-static {p1}, Landroid/support/v4/media/g;->g(Landroid/media/MediaDescription;)Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v3

    .line 556
    invoke-static {p1}, Landroid/support/v4/media/g;->i(Landroid/media/MediaDescription;)Ljava/lang/CharSequence;

    .line 557
    .line 558
    .line 559
    move-result-object v4

    .line 560
    invoke-static {p1}, Landroid/support/v4/media/g;->h(Landroid/media/MediaDescription;)Ljava/lang/CharSequence;

    .line 561
    .line 562
    .line 563
    move-result-object v5

    .line 564
    invoke-static {p1}, Landroid/support/v4/media/g;->c(Landroid/media/MediaDescription;)Ljava/lang/CharSequence;

    .line 565
    .line 566
    .line 567
    move-result-object v6

    .line 568
    invoke-static {p1}, Landroid/support/v4/media/g;->e(Landroid/media/MediaDescription;)Landroid/graphics/Bitmap;

    .line 569
    .line 570
    .line 571
    move-result-object v7

    .line 572
    invoke-static {p1}, Landroid/support/v4/media/g;->f(Landroid/media/MediaDescription;)Landroid/net/Uri;

    .line 573
    .line 574
    .line 575
    move-result-object v8

    .line 576
    invoke-static {p1}, Landroid/support/v4/media/g;->d(Landroid/media/MediaDescription;)Landroid/os/Bundle;

    .line 577
    .line 578
    .line 579
    move-result-object v2

    .line 580
    if-eqz v2, :cond_c

    .line 581
    .line 582
    invoke-static {v2}, Landroid/support/v4/media/session/t;->G(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 583
    .line 584
    .line 585
    move-result-object v2

    .line 586
    :cond_c
    const-string v9, "android.support.v4.media.description.MEDIA_URI"

    .line 587
    .line 588
    if-eqz v2, :cond_d

    .line 589
    .line 590
    invoke-virtual {v2, v9}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 591
    .line 592
    .line 593
    move-result-object v10

    .line 594
    check-cast v10, Landroid/net/Uri;

    .line 595
    .line 596
    goto :goto_4

    .line 597
    :cond_d
    move-object v10, v0

    .line 598
    :goto_4
    if-eqz v10, :cond_f

    .line 599
    .line 600
    const-string v11, "android.support.v4.media.description.NULL_BUNDLE_FLAG"

    .line 601
    .line 602
    invoke-virtual {v2, v11}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 603
    .line 604
    .line 605
    move-result v12

    .line 606
    if-eqz v12, :cond_e

    .line 607
    .line 608
    invoke-virtual {v2}, Landroid/os/BaseBundle;->size()I

    .line 609
    .line 610
    .line 611
    move-result v12

    .line 612
    const/4 v13, 0x2

    .line 613
    if-ne v12, v13, :cond_e

    .line 614
    .line 615
    move-object v9, v0

    .line 616
    goto :goto_5

    .line 617
    :cond_e
    invoke-virtual {v2, v9}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 618
    .line 619
    .line 620
    invoke-virtual {v2, v11}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 621
    .line 622
    .line 623
    :cond_f
    move-object v9, v2

    .line 624
    :goto_5
    if-eqz v10, :cond_10

    .line 625
    .line 626
    goto :goto_6

    .line 627
    :cond_10
    const/16 v2, 0x17

    .line 628
    .line 629
    if-lt v1, v2, :cond_11

    .line 630
    .line 631
    invoke-static {p1}, Landroid/support/v4/media/h;->a(Landroid/media/MediaDescription;)Landroid/net/Uri;

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    :cond_11
    move-object v10, v0

    .line 636
    :goto_6
    new-instance v0, Landroid/support/v4/media/MediaDescriptionCompat;

    .line 637
    .line 638
    move-object v2, v0

    .line 639
    invoke-direct/range {v2 .. v10}, Landroid/support/v4/media/MediaDescriptionCompat;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/os/Bundle;Landroid/net/Uri;)V

    .line 640
    .line 641
    .line 642
    iput-object p1, v0, Landroid/support/v4/media/MediaDescriptionCompat;->i:Landroid/media/MediaDescription;

    .line 643
    .line 644
    :cond_12
    return-object v0

    .line 645
    :pswitch_19
    new-instance v0, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 646
    .line 647
    invoke-direct {v0, p1}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;-><init>(Landroid/os/Parcel;)V

    .line 648
    .line 649
    .line 650
    return-object v0

    .line 651
    :pswitch_1a
    new-instance v0, LT/l;

    .line 652
    .line 653
    invoke-direct {v0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 654
    .line 655
    .line 656
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 657
    .line 658
    .line 659
    move-result p1

    .line 660
    iput p1, v0, LT/l;->a:I

    .line 661
    .line 662
    return-object v0

    .line 663
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
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

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LT/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p1, p1, [Ly0/b;

    .line 7
    .line 8
    return-object p1

    .line 9
    :pswitch_0
    new-array p1, p1, [Landroidx/versionedparcelable/ParcelImpl;

    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_1
    new-array p1, p1, [Lo/O;

    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_2
    new-array p1, p1, [Lj0/h0;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_3
    new-array p1, p1, [Lj0/g0;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_4
    new-array p1, p1, [Lj0/u;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_5
    new-array p1, p1, [Lg0/D;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_6
    new-array p1, p1, [Lg0/C;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_7
    new-array p1, p1, [Lg0/s;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_8
    new-array p1, p1, [Lg0/l;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_9
    new-array p1, p1, [Lg0/i;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_a
    new-array p1, p1, [Lg0/f;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_b
    new-array p1, p1, [Lg0/c;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_c
    new-array p1, p1, [Ld/a;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_d
    new-array p1, p1, [Lcom/google/android/material/datepicker/n;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_e
    new-array p1, p1, [Lcom/google/android/material/datepicker/d;

    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_f
    new-array p1, p1, [Lcom/google/android/material/datepicker/b;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_10
    new-array p1, p1, [Lb/d;

    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_11
    new-array p1, p1, [Landroidx/fragment/app/L;

    .line 61
    .line 62
    return-object p1

    .line 63
    :pswitch_12
    new-array p1, p1, [Landroidx/fragment/app/I;

    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_13
    new-array p1, p1, [Landroidx/fragment/app/E;

    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_14
    new-array p1, p1, [Landroidx/fragment/app/c;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_15
    new-array p1, p1, [Landroidx/fragment/app/b;

    .line 73
    .line 74
    return-object p1

    .line 75
    :pswitch_16
    new-array p1, p1, [Landroid/support/v4/media/RatingCompat;

    .line 76
    .line 77
    return-object p1

    .line 78
    :pswitch_17
    new-array p1, p1, [Landroid/support/v4/media/MediaMetadataCompat;

    .line 79
    .line 80
    return-object p1

    .line 81
    :pswitch_18
    new-array p1, p1, [Landroid/support/v4/media/MediaDescriptionCompat;

    .line 82
    .line 83
    return-object p1

    .line 84
    :pswitch_19
    new-array p1, p1, [Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 85
    .line 86
    return-object p1

    .line 87
    :pswitch_1a
    new-array p1, p1, [LT/l;

    .line 88
    .line 89
    return-object p1

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
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
