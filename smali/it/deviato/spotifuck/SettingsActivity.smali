.class public Lit/deviato/spotifuck/SettingsActivity;
.super Lh/l;
.source "SourceFile"

# interfaces
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lit/deviato/spotifuck/SettingsActivity$a;
    }
.end annotation


# static fields
.field public static D:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lh/l;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lit/deviato/spotifuck/SettingsActivity;->D:Landroid/content/SharedPreferences;

    .line 6
    .line 7
    invoke-super {p0, p1}, Lh/l;->onCreate(Landroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    const v0, 0x7f0c0087

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lh/l;->setContentView(I)V

    .line 14
    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Lh/l;->x:LA/b;

    .line 19
    .line 20
    iget-object p1, p1, LA/b;->g:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Landroidx/fragment/app/t;

    .line 23
    .line 24
    iget-object p1, p1, Landroidx/fragment/app/t;->i:Landroidx/fragment/app/H;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    new-instance v0, Landroidx/fragment/app/a;

    .line 30
    .line 31
    invoke-direct {v0, p1}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/H;)V

    .line 32
    .line 33
    .line 34
    new-instance p1, Lit/deviato/spotifuck/SettingsActivity$a;

    .line 35
    .line 36
    invoke-direct {p1}, Lit/deviato/spotifuck/SettingsActivity$a;-><init>()V

    .line 37
    .line 38
    .line 39
    const/4 v1, 0x2

    .line 40
    const/4 v2, 0x0

    .line 41
    const v3, 0x7f0901a8

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v3, p1, v2, v1}, Landroidx/fragment/app/a;->e(ILandroidx/fragment/app/r;Ljava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    invoke-virtual {v0, p1}, Landroidx/fragment/app/a;->d(Z)I

    .line 49
    .line 50
    .line 51
    :cond_0
    invoke-virtual {p0}, Lh/l;->l()Lh/N;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-eqz p1, :cond_1

    .line 56
    .line 57
    iget-object v0, p1, Lh/N;->p:Lo/m0;

    .line 58
    .line 59
    check-cast v0, Lo/f1;

    .line 60
    .line 61
    iget v1, v0, Lo/f1;->b:I

    .line 62
    .line 63
    const/4 v2, 0x1

    .line 64
    iput-boolean v2, p1, Lh/N;->s:Z

    .line 65
    .line 66
    and-int/lit8 p1, v1, -0x5

    .line 67
    .line 68
    const/4 v1, 0x4

    .line 69
    or-int/2addr p1, v1

    .line 70
    invoke-virtual {v0, p1}, Lo/f1;->a(I)V

    .line 71
    .line 72
    .line 73
    :cond_1
    return-void
.end method

.method public final onPause()V
    .locals 1

    .line 1
    invoke-super {p0}, Lh/l;->onPause()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lit/deviato/spotifuck/SettingsActivity;->D:Landroid/content/SharedPreferences;

    .line 5
    .line 6
    invoke-interface {v0, p0}, Landroid/content/SharedPreferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Lh/l;->onResume()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lit/deviato/spotifuck/SettingsActivity;->D:Landroid/content/SharedPreferences;

    .line 5
    .line 6
    invoke-interface {v0, p0}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 20

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const-string v2, "GuiMode"

    .line 6
    .line 7
    const-string v3, "Amoled"

    .line 8
    .line 9
    const-string v4, "AutoShut"

    .line 10
    .line 11
    const-string v5, "ForceEn"

    .line 12
    .line 13
    const-string v6, "CloseNowPlay"

    .line 14
    .line 15
    const-string v7, "AndAuto"

    .line 16
    .line 17
    const-string v8, "APlayMode"

    .line 18
    .line 19
    const-string v9, "ForcePortrait"

    .line 20
    .line 21
    const-string v10, "HPAS"

    .line 22
    .line 23
    const-string v11, "HPAP"

    .line 24
    .line 25
    const-string v12, "BTAS"

    .line 26
    .line 27
    const-string v13, "BTAP"

    .line 28
    .line 29
    const-string v14, "TakeControl"

    .line 30
    .line 31
    const-string v15, "AutoSleep"

    .line 32
    .line 33
    const-string v0, "SwipeStop"

    .line 34
    .line 35
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-object/from16 v16, v0

    .line 39
    .line 40
    const-string v0, "0"

    .line 41
    .line 42
    move-object/from16 v17, v0

    .line 43
    .line 44
    const/16 v18, -0x1

    .line 45
    .line 46
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->hashCode()I

    .line 47
    .line 48
    .line 49
    move-result v19

    .line 50
    sparse-switch v19, :sswitch_data_0

    .line 51
    .line 52
    .line 53
    :goto_0
    move-object/from16 v0, v16

    .line 54
    .line 55
    goto/16 :goto_1

    .line 56
    .line 57
    :sswitch_0
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_0

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    const/16 v18, 0xe

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :sswitch_1
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-nez v1, :cond_1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    const/16 v18, 0xd

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :sswitch_2
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-nez v1, :cond_2

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    const/16 v18, 0xc

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :sswitch_3
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-nez v1, :cond_3

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    const/16 v18, 0xb

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :sswitch_4
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-nez v1, :cond_4

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_4
    const/16 v18, 0xa

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :sswitch_5
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-nez v1, :cond_5

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_5
    const/16 v18, 0x9

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :sswitch_6
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-nez v1, :cond_6

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_6
    const/16 v18, 0x8

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :sswitch_7
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-nez v1, :cond_7

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_7
    const/16 v18, 0x7

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :sswitch_8
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-nez v1, :cond_8

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_8
    const/16 v18, 0x6

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :sswitch_9
    invoke-virtual {v1, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    if-nez v1, :cond_9

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_9
    const/16 v18, 0x5

    .line 155
    .line 156
    goto :goto_0

    .line 157
    :sswitch_a
    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-nez v1, :cond_a

    .line 162
    .line 163
    goto :goto_0

    .line 164
    :cond_a
    const/16 v18, 0x4

    .line 165
    .line 166
    goto :goto_0

    .line 167
    :sswitch_b
    invoke-virtual {v1, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    if-nez v1, :cond_b

    .line 172
    .line 173
    goto :goto_0

    .line 174
    :cond_b
    const/16 v18, 0x3

    .line 175
    .line 176
    goto :goto_0

    .line 177
    :sswitch_c
    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-nez v1, :cond_c

    .line 182
    .line 183
    goto/16 :goto_0

    .line 184
    .line 185
    :cond_c
    const/16 v18, 0x2

    .line 186
    .line 187
    goto/16 :goto_0

    .line 188
    .line 189
    :sswitch_d
    invoke-virtual {v1, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    if-nez v1, :cond_d

    .line 194
    .line 195
    goto/16 :goto_0

    .line 196
    .line 197
    :cond_d
    move-object/from16 v0, v16

    .line 198
    .line 199
    const/16 v18, 0x1

    .line 200
    .line 201
    goto :goto_1

    .line 202
    :sswitch_e
    move-object/from16 v0, v16

    .line 203
    .line 204
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    if-nez v1, :cond_e

    .line 209
    .line 210
    goto :goto_1

    .line 211
    :cond_e
    const/16 v18, 0x0

    .line 212
    .line 213
    :goto_1
    packed-switch v18, :pswitch_data_0

    .line 214
    .line 215
    .line 216
    goto/16 :goto_2

    .line 217
    .line 218
    :pswitch_0
    const-string v0, "csshack"

    .line 219
    .line 220
    move-object/from16 v1, p1

    .line 221
    .line 222
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    sput-object v0, Lit/deviato/spotifuck/AppSingleton;->l:Ljava/lang/String;

    .line 227
    .line 228
    goto/16 :goto_2

    .line 229
    .line 230
    :pswitch_1
    move-object/from16 v1, p1

    .line 231
    .line 232
    const/4 v0, 0x0

    .line 233
    invoke-interface {v1, v3, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    sput-boolean v0, Lit/deviato/spotifuck/AppSingleton;->q:Z

    .line 238
    .line 239
    goto/16 :goto_2

    .line 240
    .line 241
    :pswitch_2
    move-object/from16 v1, p1

    .line 242
    .line 243
    move-object/from16 v0, v17

    .line 244
    .line 245
    invoke-interface {v1, v4, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    sput v0, Lit/deviato/spotifuck/AppSingleton;->z:I

    .line 254
    .line 255
    sget-boolean v0, Lit/deviato/spotifuck/WebService;->D:Z

    .line 256
    .line 257
    const/4 v2, 0x1

    .line 258
    xor-int/2addr v0, v2

    .line 259
    invoke-static {v0}, LR0/f;->manageTShut(Z)V

    .line 260
    .line 261
    .line 262
    goto/16 :goto_2

    .line 263
    .line 264
    :pswitch_3
    move-object/from16 v1, p1

    .line 265
    .line 266
    const/4 v0, 0x0

    .line 267
    invoke-interface {v1, v5, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    sput-boolean v0, Lit/deviato/spotifuck/AppSingleton;->u:Z

    .line 272
    .line 273
    goto/16 :goto_2

    .line 274
    .line 275
    :pswitch_4
    move-object/from16 v1, p1

    .line 276
    .line 277
    const/4 v2, 0x1

    .line 278
    invoke-interface {v1, v6, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    sput-boolean v0, Lit/deviato/spotifuck/AppSingleton;->p:Z

    .line 283
    .line 284
    goto/16 :goto_2

    .line 285
    .line 286
    :pswitch_5
    move-object/from16 v1, p1

    .line 287
    .line 288
    const/4 v2, 0x1

    .line 289
    invoke-interface {v1, v7, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    sput-boolean v0, Lit/deviato/spotifuck/AppSingleton;->r:Z

    .line 294
    .line 295
    goto/16 :goto_2

    .line 296
    .line 297
    :pswitch_6
    move-object/from16 v1, p1

    .line 298
    .line 299
    const-string v0, "disabled"

    .line 300
    .line 301
    invoke-interface {v1, v8, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    sput-object v0, Lit/deviato/spotifuck/AppSingleton;->k:Ljava/lang/String;

    .line 306
    .line 307
    goto :goto_2

    .line 308
    :pswitch_7
    move-object/from16 v1, p1

    .line 309
    .line 310
    const/4 v0, 0x0

    .line 311
    invoke-interface {v1, v9, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    sput-boolean v0, Lit/deviato/spotifuck/AppSingleton;->t:Z

    .line 316
    .line 317
    goto :goto_2

    .line 318
    :pswitch_8
    move-object/from16 v1, p1

    .line 319
    .line 320
    const/4 v0, 0x0

    .line 321
    invoke-interface {v1, v10, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    sput-boolean v0, Lit/deviato/spotifuck/AppSingleton;->w:Z

    .line 326
    .line 327
    goto :goto_2

    .line 328
    :pswitch_9
    move-object/from16 v1, p1

    .line 329
    .line 330
    const/4 v0, 0x0

    .line 331
    invoke-interface {v1, v11, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 332
    .line 333
    .line 334
    move-result v0

    .line 335
    sput-boolean v0, Lit/deviato/spotifuck/AppSingleton;->v:Z

    .line 336
    .line 337
    goto :goto_2

    .line 338
    :pswitch_a
    move-object/from16 v1, p1

    .line 339
    .line 340
    const/4 v0, 0x0

    .line 341
    invoke-interface {v1, v12, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 342
    .line 343
    .line 344
    move-result v0

    .line 345
    sput-boolean v0, Lit/deviato/spotifuck/AppSingleton;->y:Z

    .line 346
    .line 347
    goto :goto_2

    .line 348
    :pswitch_b
    move-object/from16 v1, p1

    .line 349
    .line 350
    const/4 v0, 0x0

    .line 351
    invoke-interface {v1, v13, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 352
    .line 353
    .line 354
    move-result v0

    .line 355
    sput-boolean v0, Lit/deviato/spotifuck/AppSingleton;->x:Z

    .line 356
    .line 357
    goto :goto_2

    .line 358
    :pswitch_c
    move-object/from16 v1, p1

    .line 359
    .line 360
    const/4 v0, 0x1

    .line 361
    invoke-interface {v1, v14, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    sput-boolean v0, Lit/deviato/spotifuck/AppSingleton;->o:Z

    .line 366
    .line 367
    goto :goto_2

    .line 368
    :pswitch_d
    move-object/from16 v1, p1

    .line 369
    .line 370
    move-object/from16 v0, v17

    .line 371
    .line 372
    invoke-interface {v1, v15, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    sput v0, Lit/deviato/spotifuck/AppSingleton;->A:I

    .line 381
    .line 382
    sget-boolean v0, Lit/deviato/spotifuck/WebService;->D:Z

    .line 383
    .line 384
    invoke-static {v0}, LR0/f;->manageTSleep(Z)V

    .line 385
    .line 386
    .line 387
    goto :goto_2

    .line 388
    :pswitch_e
    move-object/from16 v1, p1

    .line 389
    .line 390
    move-object v2, v0

    .line 391
    const/4 v0, 0x1

    .line 392
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    sput-boolean v0, Lit/deviato/spotifuck/AppSingleton;->s:Z

    .line 397
    .line 398
    :goto_2
    return-void

    .line 399
    :sswitch_data_0
    .sparse-switch
        -0x2ce051c4 -> :sswitch_e
        -0x263549b8 -> :sswitch_d
        -0x4c0654a -> :sswitch_c
        0x1f4401 -> :sswitch_b
        0x1f4404 -> :sswitch_a
        0x21ef37 -> :sswitch_9
        0x21ef3a -> :sswitch_8
        0x26abf86 -> :sswitch_7
        0x19331258 -> :sswitch_6
        0x2fcaa006 -> :sswitch_5
        0x38a93632 -> :sswitch_4
        0x3ad31cd4 -> :sswitch_3
        0x599b2223 -> :sswitch_2
        0x751f1988 -> :sswitch_1
        0x796dc15e -> :sswitch_0
    .end sparse-switch

    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    :pswitch_data_0
    .packed-switch 0x0
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
