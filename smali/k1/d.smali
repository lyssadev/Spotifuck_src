.class public abstract Lk1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, " +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static a(Lg1/C;)J
    .locals 2

    .line 1
    const-string v0, "Content-Length"

    .line 2
    .line 3
    iget-object p0, p0, Lg1/C;->f:Lg1/s;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lg1/s;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-wide/16 v0, -0x1

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    :catch_0
    :goto_0
    return-wide v0
.end method

.method public static b(Lg1/C;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lg1/C;->a:Lg1/A;

    .line 2
    .line 3
    iget-object v0, v0, Lg1/A;->b:Ljava/lang/String;

    .line 4
    .line 5
    const-string v1, "HEAD"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    const/16 v0, 0x64

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    iget v3, p0, Lg1/C;->c:I

    .line 19
    .line 20
    if-lt v3, v0, :cond_1

    .line 21
    .line 22
    const/16 v0, 0xc8

    .line 23
    .line 24
    if-lt v3, v0, :cond_2

    .line 25
    .line 26
    :cond_1
    const/16 v0, 0xcc

    .line 27
    .line 28
    if-eq v3, v0, :cond_2

    .line 29
    .line 30
    const/16 v0, 0x130

    .line 31
    .line 32
    if-eq v3, v0, :cond_2

    .line 33
    .line 34
    return v2

    .line 35
    :cond_2
    invoke-static {p0}, Lk1/d;->a(Lg1/C;)J

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    const-wide/16 v5, -0x1

    .line 40
    .line 41
    cmp-long v0, v3, v5

    .line 42
    .line 43
    if-nez v0, :cond_4

    .line 44
    .line 45
    const-string v0, "Transfer-Encoding"

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Lg1/C;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const-string v0, "chunked"

    .line 52
    .line 53
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-eqz p0, :cond_3

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    return v1

    .line 61
    :cond_4
    :goto_0
    return v2
.end method

.method public static c(Ljava/lang/String;I)I
    .locals 3

    .line 1
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    const-wide/32 v0, 0x7fffffff

    .line 6
    .line 7
    .line 8
    cmp-long v2, p0, v0

    .line 9
    .line 10
    if-lez v2, :cond_0

    .line 11
    .line 12
    const p0, 0x7fffffff

    .line 13
    .line 14
    .line 15
    return p0

    .line 16
    :cond_0
    const-wide/16 v0, 0x0

    .line 17
    .line 18
    cmp-long v2, p0, v0

    .line 19
    .line 20
    if-gez v2, :cond_1

    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return p0

    .line 24
    :cond_1
    long-to-int p1, p0

    .line 25
    :catch_0
    return p1
.end method

.method public static d(Lg1/b;Lg1/u;Lg1/s;)V
    .locals 32

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    sget-object v0, Lg1/b;->b:Lg1/b;

    .line 4
    .line 5
    move-object/from16 v3, p0

    .line 6
    .line 7
    if-ne v3, v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    sget-object v0, Lg1/q;->j:Ljava/util/regex/Pattern;

    .line 11
    .line 12
    const-string v0, "Set-Cookie"

    .line 13
    .line 14
    move-object/from16 v4, p2

    .line 15
    .line 16
    invoke-virtual {v4, v0}, Lg1/s;->f(Ljava/lang/String;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v8, 0x0

    .line 26
    const/4 v9, 0x0

    .line 27
    :goto_0
    if-ge v8, v5, :cond_3d

    .line 28
    .line 29
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    move-object v10, v0

    .line 34
    check-cast v10, Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 37
    .line 38
    .line 39
    move-result-wide v11

    .line 40
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v13

    .line 44
    const/16 v14, 0x3b

    .line 45
    .line 46
    invoke-static {v10, v6, v13, v14}, Lh1/c;->g(Ljava/lang/String;IIC)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    const/16 v15, 0x3d

    .line 51
    .line 52
    invoke-static {v10, v6, v0, v15}, Lh1/c;->g(Ljava/lang/String;IIC)I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-ne v7, v0, :cond_1

    .line 57
    .line 58
    :goto_1
    move-object/from16 v16, v4

    .line 59
    .line 60
    move/from16 v28, v5

    .line 61
    .line 62
    :goto_2
    const/4 v0, 0x0

    .line 63
    const/4 v5, 0x0

    .line 64
    goto/16 :goto_29

    .line 65
    .line 66
    :cond_1
    invoke-static {v10, v6, v7}, Lh1/c;->q(Ljava/lang/String;II)I

    .line 67
    .line 68
    .line 69
    move-result v15

    .line 70
    invoke-static {v10, v15, v7}, Lh1/c;->r(Ljava/lang/String;II)I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    invoke-virtual {v10, v15, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result v15

    .line 82
    if-nez v15, :cond_5

    .line 83
    .line 84
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 85
    .line 86
    .line 87
    move-result v15

    .line 88
    const/4 v14, 0x0

    .line 89
    :goto_3
    if-ge v14, v15, :cond_4

    .line 90
    .line 91
    invoke-virtual {v6, v14}, Ljava/lang/String;->charAt(I)C

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    const/16 v3, 0x1f

    .line 96
    .line 97
    if-le v2, v3, :cond_2

    .line 98
    .line 99
    const/16 v3, 0x7f

    .line 100
    .line 101
    if-lt v2, v3, :cond_3

    .line 102
    .line 103
    :cond_2
    const/4 v2, 0x1

    .line 104
    goto :goto_4

    .line 105
    :cond_3
    const/4 v2, 0x1

    .line 106
    add-int/2addr v14, v2

    .line 107
    move-object/from16 v3, p0

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :goto_4
    const/4 v3, -0x1

    .line 111
    goto :goto_5

    .line 112
    :cond_4
    const/4 v2, 0x1

    .line 113
    const/4 v3, -0x1

    .line 114
    const/4 v14, -0x1

    .line 115
    :goto_5
    if-eq v14, v3, :cond_6

    .line 116
    .line 117
    :cond_5
    move-object/from16 v16, v4

    .line 118
    .line 119
    goto/16 :goto_28

    .line 120
    .line 121
    :cond_6
    add-int/2addr v7, v2

    .line 122
    invoke-static {v10, v7, v0}, Lh1/c;->q(Ljava/lang/String;II)I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    invoke-static {v10, v2, v0}, Lh1/c;->r(Ljava/lang/String;II)I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    invoke-virtual {v10, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    const/4 v7, 0x0

    .line 139
    :goto_6
    if-ge v7, v3, :cond_9

    .line 140
    .line 141
    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    .line 142
    .line 143
    .line 144
    move-result v14

    .line 145
    const/16 v15, 0x1f

    .line 146
    .line 147
    if-le v14, v15, :cond_7

    .line 148
    .line 149
    const/16 v15, 0x7f

    .line 150
    .line 151
    if-lt v14, v15, :cond_8

    .line 152
    .line 153
    :cond_7
    const/4 v14, 0x1

    .line 154
    goto :goto_7

    .line 155
    :cond_8
    const/4 v14, 0x1

    .line 156
    add-int/2addr v7, v14

    .line 157
    goto :goto_6

    .line 158
    :goto_7
    move v3, v7

    .line 159
    :goto_8
    const/4 v7, -0x1

    .line 160
    goto :goto_9

    .line 161
    :cond_9
    const/4 v14, 0x1

    .line 162
    const/4 v3, -0x1

    .line 163
    goto :goto_8

    .line 164
    :goto_9
    if-eq v3, v7, :cond_a

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_a
    add-int/2addr v0, v14

    .line 168
    const-wide v18, 0xe677d21fdbffL

    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    move-wide/from16 v22, v18

    .line 174
    .line 175
    const/4 v3, 0x0

    .line 176
    const/4 v7, 0x0

    .line 177
    const-wide/16 v20, -0x1

    .line 178
    .line 179
    const/16 v24, 0x0

    .line 180
    .line 181
    const/16 v25, 0x0

    .line 182
    .line 183
    const/16 v26, 0x1

    .line 184
    .line 185
    const/16 v27, 0x0

    .line 186
    .line 187
    :goto_a
    const-wide v28, 0x7fffffffffffffffL

    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    const-wide/high16 v30, -0x8000000000000000L

    .line 193
    .line 194
    if-ge v0, v13, :cond_18

    .line 195
    .line 196
    const/16 v14, 0x3b

    .line 197
    .line 198
    invoke-static {v10, v0, v13, v14}, Lh1/c;->g(Ljava/lang/String;IIC)I

    .line 199
    .line 200
    .line 201
    move-result v15

    .line 202
    move-object/from16 v16, v4

    .line 203
    .line 204
    const/16 v14, 0x3d

    .line 205
    .line 206
    invoke-static {v10, v0, v15, v14}, Lh1/c;->g(Ljava/lang/String;IIC)I

    .line 207
    .line 208
    .line 209
    move-result v4

    .line 210
    invoke-static {v10, v0, v4}, Lh1/c;->q(Ljava/lang/String;II)I

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    invoke-static {v10, v0, v4}, Lh1/c;->r(Ljava/lang/String;II)I

    .line 215
    .line 216
    .line 217
    move-result v14

    .line 218
    invoke-virtual {v10, v0, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    if-ge v4, v15, :cond_b

    .line 223
    .line 224
    const/4 v14, 0x1

    .line 225
    add-int/2addr v4, v14

    .line 226
    invoke-static {v10, v4, v15}, Lh1/c;->q(Ljava/lang/String;II)I

    .line 227
    .line 228
    .line 229
    move-result v4

    .line 230
    invoke-static {v10, v4, v15}, Lh1/c;->r(Ljava/lang/String;II)I

    .line 231
    .line 232
    .line 233
    move-result v14

    .line 234
    invoke-virtual {v10, v4, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    goto :goto_b

    .line 239
    :cond_b
    const-string v4, ""

    .line 240
    .line 241
    :goto_b
    const-string v14, "expires"

    .line 242
    .line 243
    invoke-virtual {v0, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 244
    .line 245
    .line 246
    move-result v14

    .line 247
    if-eqz v14, :cond_c

    .line 248
    .line 249
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    invoke-static {v4, v0}, Lg1/q;->b(Ljava/lang/String;I)J

    .line 254
    .line 255
    .line 256
    move-result-wide v22
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 257
    :goto_c
    const/4 v4, 0x1

    .line 258
    const/16 v27, 0x1

    .line 259
    .line 260
    goto/16 :goto_e

    .line 261
    .line 262
    :cond_c
    const-string v14, "max-age"

    .line 263
    .line 264
    invoke-virtual {v0, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 265
    .line 266
    .line 267
    move-result v14

    .line 268
    if-eqz v14, :cond_10

    .line 269
    .line 270
    :try_start_1
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 271
    .line 272
    .line 273
    move-result-wide v20
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 274
    const-wide/16 v28, 0x0

    .line 275
    .line 276
    cmp-long v0, v20, v28

    .line 277
    .line 278
    if-gtz v0, :cond_d

    .line 279
    .line 280
    goto :goto_d

    .line 281
    :cond_d
    move-wide/from16 v30, v20

    .line 282
    .line 283
    :goto_d
    move-wide/from16 v20, v30

    .line 284
    .line 285
    goto :goto_c

    .line 286
    :catch_0
    move-exception v0

    .line 287
    move-object v14, v0

    .line 288
    :try_start_2
    const-string v0, "-?\\d+"

    .line 289
    .line 290
    invoke-virtual {v4, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    if-eqz v0, :cond_f

    .line 295
    .line 296
    const-string v0, "-"

    .line 297
    .line 298
    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-eqz v0, :cond_e

    .line 303
    .line 304
    move-wide/from16 v28, v30

    .line 305
    .line 306
    :cond_e
    move-wide/from16 v20, v28

    .line 307
    .line 308
    goto :goto_c

    .line 309
    :cond_f
    throw v14
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    .line 310
    :cond_10
    const-string v14, "domain"

    .line 311
    .line 312
    invoke-virtual {v0, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 313
    .line 314
    .line 315
    move-result v14

    .line 316
    if-eqz v14, :cond_14

    .line 317
    .line 318
    :try_start_3
    const-string v0, "."

    .line 319
    .line 320
    invoke-virtual {v4, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 321
    .line 322
    .line 323
    move-result v14

    .line 324
    if-nez v14, :cond_13

    .line 325
    .line 326
    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    if-eqz v0, :cond_11

    .line 331
    .line 332
    const/4 v14, 0x1

    .line 333
    invoke-virtual {v4, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v4

    .line 337
    :cond_11
    invoke-static {v4}, Lh1/c;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    if-eqz v0, :cond_12

    .line 342
    .line 343
    move-object v3, v0

    .line 344
    const/4 v4, 0x1

    .line 345
    const/16 v26, 0x0

    .line 346
    .line 347
    goto :goto_e

    .line 348
    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 349
    .line 350
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 351
    .line 352
    .line 353
    throw v0

    .line 354
    :cond_13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 355
    .line 356
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 357
    .line 358
    .line 359
    throw v0
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_1

    .line 360
    :cond_14
    const-string v14, "path"

    .line 361
    .line 362
    invoke-virtual {v0, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 363
    .line 364
    .line 365
    move-result v14

    .line 366
    if-eqz v14, :cond_16

    .line 367
    .line 368
    move-object v7, v4

    .line 369
    :catch_1
    :cond_15
    const/4 v4, 0x1

    .line 370
    goto :goto_e

    .line 371
    :cond_16
    const-string v4, "secure"

    .line 372
    .line 373
    invoke-virtual {v0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 374
    .line 375
    .line 376
    move-result v4

    .line 377
    if-eqz v4, :cond_17

    .line 378
    .line 379
    const/4 v4, 0x1

    .line 380
    const/16 v24, 0x1

    .line 381
    .line 382
    goto :goto_e

    .line 383
    :cond_17
    const-string v4, "httponly"

    .line 384
    .line 385
    invoke-virtual {v0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 386
    .line 387
    .line 388
    move-result v0

    .line 389
    if-eqz v0, :cond_15

    .line 390
    .line 391
    const/4 v4, 0x1

    .line 392
    const/16 v25, 0x1

    .line 393
    .line 394
    :goto_e
    add-int/lit8 v0, v15, 0x1

    .line 395
    .line 396
    move-object/from16 v4, v16

    .line 397
    .line 398
    goto/16 :goto_a

    .line 399
    .line 400
    :cond_18
    move-object/from16 v16, v4

    .line 401
    .line 402
    cmp-long v0, v20, v30

    .line 403
    .line 404
    if-nez v0, :cond_19

    .line 405
    .line 406
    move-wide/from16 v20, v30

    .line 407
    .line 408
    goto :goto_10

    .line 409
    :cond_19
    const-wide/16 v13, -0x1

    .line 410
    .line 411
    cmp-long v0, v20, v13

    .line 412
    .line 413
    if-eqz v0, :cond_1d

    .line 414
    .line 415
    const-wide v13, 0x20c49ba5e353f7L

    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    cmp-long v0, v20, v13

    .line 421
    .line 422
    if-gtz v0, :cond_1a

    .line 423
    .line 424
    const-wide/16 v13, 0x3e8

    .line 425
    .line 426
    mul-long v28, v20, v13

    .line 427
    .line 428
    :cond_1a
    add-long v28, v11, v28

    .line 429
    .line 430
    cmp-long v0, v28, v11

    .line 431
    .line 432
    if-ltz v0, :cond_1c

    .line 433
    .line 434
    cmp-long v0, v28, v18

    .line 435
    .line 436
    if-lez v0, :cond_1b

    .line 437
    .line 438
    goto :goto_f

    .line 439
    :cond_1b
    move-wide/from16 v20, v28

    .line 440
    .line 441
    goto :goto_10

    .line 442
    :cond_1c
    :goto_f
    move-wide/from16 v20, v18

    .line 443
    .line 444
    goto :goto_10

    .line 445
    :cond_1d
    move-wide/from16 v20, v22

    .line 446
    .line 447
    :goto_10
    iget-object v0, v1, Lg1/u;->d:Ljava/lang/String;

    .line 448
    .line 449
    const/16 v4, 0x2e

    .line 450
    .line 451
    if-nez v3, :cond_1e

    .line 452
    .line 453
    move-object v3, v0

    .line 454
    goto :goto_11

    .line 455
    :cond_1e
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    move-result v10

    .line 459
    if-eqz v10, :cond_1f

    .line 460
    .line 461
    goto :goto_11

    .line 462
    :cond_1f
    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 463
    .line 464
    .line 465
    move-result v10

    .line 466
    if-eqz v10, :cond_3a

    .line 467
    .line 468
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 469
    .line 470
    .line 471
    move-result v10

    .line 472
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 473
    .line 474
    .line 475
    move-result v11

    .line 476
    sub-int/2addr v10, v11

    .line 477
    const/4 v11, 0x1

    .line 478
    sub-int/2addr v10, v11

    .line 479
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    .line 480
    .line 481
    .line 482
    move-result v10

    .line 483
    if-ne v10, v4, :cond_3a

    .line 484
    .line 485
    sget-object v10, Lh1/c;->g:Ljava/util/regex/Pattern;

    .line 486
    .line 487
    invoke-virtual {v10, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 488
    .line 489
    .line 490
    move-result-object v10

    .line 491
    invoke-virtual {v10}, Ljava/util/regex/Matcher;->matches()Z

    .line 492
    .line 493
    .line 494
    move-result v10

    .line 495
    if-nez v10, :cond_3a

    .line 496
    .line 497
    :goto_11
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 498
    .line 499
    .line 500
    move-result v0

    .line 501
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 502
    .line 503
    .line 504
    move-result v10

    .line 505
    if-eq v0, v10, :cond_35

    .line 506
    .line 507
    sget-object v10, Lp1/a;->h:Lp1/a;

    .line 508
    .line 509
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    invoke-static {v3}, Ljava/net/IDN;->toUnicode(Ljava/lang/String;)Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    const-string v11, "\\."

    .line 517
    .line 518
    invoke-virtual {v0, v11}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v11

    .line 522
    iget-object v0, v10, Lp1/a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 523
    .line 524
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 525
    .line 526
    .line 527
    move-result v0

    .line 528
    if-nez v0, :cond_21

    .line 529
    .line 530
    iget-object v0, v10, Lp1/a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 531
    .line 532
    const/4 v12, 0x0

    .line 533
    const/4 v13, 0x1

    .line 534
    invoke-virtual {v0, v12, v13}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 535
    .line 536
    .line 537
    move-result v0

    .line 538
    if-eqz v0, :cond_21

    .line 539
    .line 540
    const/4 v12, 0x0

    .line 541
    :goto_12
    :try_start_4
    invoke-virtual {v10}, Lp1/a;->b()V
    :try_end_4
    .catch Ljava/io/InterruptedIOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 542
    .line 543
    .line 544
    if-eqz v12, :cond_22

    .line 545
    .line 546
    :goto_13
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 551
    .line 552
    .line 553
    goto :goto_15

    .line 554
    :catchall_0
    move-exception v0

    .line 555
    goto :goto_14

    .line 556
    :catch_2
    move-exception v0

    .line 557
    move-object v13, v0

    .line 558
    :try_start_5
    sget-object v0, Lo1/g;->a:Lo1/g;

    .line 559
    .line 560
    const-string v14, "Failed to read public suffix list"

    .line 561
    .line 562
    const/4 v15, 0x5

    .line 563
    invoke-virtual {v0, v15, v14, v13}, Lo1/g;->k(ILjava/lang/String;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 564
    .line 565
    .line 566
    if-eqz v12, :cond_22

    .line 567
    .line 568
    goto :goto_13

    .line 569
    :goto_14
    if-eqz v12, :cond_20

    .line 570
    .line 571
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 572
    .line 573
    .line 574
    move-result-object v1

    .line 575
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 576
    .line 577
    .line 578
    :cond_20
    throw v0

    .line 579
    :catch_3
    const/4 v12, 0x1

    .line 580
    goto :goto_12

    .line 581
    :cond_21
    :try_start_6
    iget-object v0, v10, Lp1/a;->b:Ljava/util/concurrent/CountDownLatch;

    .line 582
    .line 583
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_4

    .line 584
    .line 585
    .line 586
    :catch_4
    :cond_22
    :goto_15
    monitor-enter v10

    .line 587
    :try_start_7
    iget-object v0, v10, Lp1/a;->c:[B

    .line 588
    .line 589
    if-eqz v0, :cond_34

    .line 590
    .line 591
    monitor-exit v10
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 592
    array-length v0, v11

    .line 593
    new-array v12, v0, [[B

    .line 594
    .line 595
    const/4 v13, 0x0

    .line 596
    :goto_16
    array-length v14, v11

    .line 597
    if-ge v13, v14, :cond_23

    .line 598
    .line 599
    aget-object v14, v11, v13

    .line 600
    .line 601
    sget-object v15, Lh1/c;->d:Ljava/nio/charset/Charset;

    .line 602
    .line 603
    invoke-virtual {v14, v15}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 604
    .line 605
    .line 606
    move-result-object v14

    .line 607
    aput-object v14, v12, v13

    .line 608
    .line 609
    const/4 v14, 0x1

    .line 610
    add-int/2addr v13, v14

    .line 611
    goto :goto_16

    .line 612
    :cond_23
    const/4 v14, 0x1

    .line 613
    const/4 v13, 0x0

    .line 614
    :goto_17
    if-ge v13, v0, :cond_25

    .line 615
    .line 616
    iget-object v15, v10, Lp1/a;->c:[B

    .line 617
    .line 618
    invoke-static {v15, v12, v13}, Lp1/a;->a([B[[BI)Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v15

    .line 622
    if-eqz v15, :cond_24

    .line 623
    .line 624
    goto :goto_18

    .line 625
    :cond_24
    add-int/2addr v13, v14

    .line 626
    goto :goto_17

    .line 627
    :cond_25
    const/4 v15, 0x0

    .line 628
    :goto_18
    if-le v0, v14, :cond_27

    .line 629
    .line 630
    invoke-virtual {v12}, [[B->clone()Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    move-result-object v13

    .line 634
    check-cast v13, [[B

    .line 635
    .line 636
    move/from16 v28, v5

    .line 637
    .line 638
    const/4 v4, 0x0

    .line 639
    :goto_19
    array-length v5, v13

    .line 640
    sub-int/2addr v5, v14

    .line 641
    if-ge v4, v5, :cond_28

    .line 642
    .line 643
    sget-object v5, Lp1/a;->e:[B

    .line 644
    .line 645
    aput-object v5, v13, v4

    .line 646
    .line 647
    iget-object v5, v10, Lp1/a;->c:[B

    .line 648
    .line 649
    invoke-static {v5, v13, v4}, Lp1/a;->a([B[[BI)Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v5

    .line 653
    if-eqz v5, :cond_26

    .line 654
    .line 655
    goto :goto_1a

    .line 656
    :cond_26
    add-int/2addr v4, v14

    .line 657
    goto :goto_19

    .line 658
    :cond_27
    move/from16 v28, v5

    .line 659
    .line 660
    :cond_28
    const/4 v5, 0x0

    .line 661
    :goto_1a
    if-eqz v5, :cond_2a

    .line 662
    .line 663
    const/4 v4, 0x0

    .line 664
    :goto_1b
    add-int/lit8 v13, v0, -0x1

    .line 665
    .line 666
    if-ge v4, v13, :cond_2a

    .line 667
    .line 668
    iget-object v13, v10, Lp1/a;->d:[B

    .line 669
    .line 670
    invoke-static {v13, v12, v4}, Lp1/a;->a([B[[BI)Ljava/lang/String;

    .line 671
    .line 672
    .line 673
    move-result-object v13

    .line 674
    if-eqz v13, :cond_29

    .line 675
    .line 676
    goto :goto_1c

    .line 677
    :cond_29
    add-int/2addr v4, v14

    .line 678
    goto :goto_1b

    .line 679
    :cond_2a
    const/4 v13, 0x0

    .line 680
    :goto_1c
    if-eqz v13, :cond_2b

    .line 681
    .line 682
    const-string v0, "!"

    .line 683
    .line 684
    invoke-virtual {v0, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    const-string v4, "\\."

    .line 689
    .line 690
    invoke-virtual {v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    goto :goto_1f

    .line 695
    :cond_2b
    if-nez v15, :cond_2c

    .line 696
    .line 697
    if-nez v5, :cond_2c

    .line 698
    .line 699
    sget-object v0, Lp1/a;->g:[Ljava/lang/String;

    .line 700
    .line 701
    goto :goto_1f

    .line 702
    :cond_2c
    if-eqz v15, :cond_2d

    .line 703
    .line 704
    const-string v0, "\\."

    .line 705
    .line 706
    invoke-virtual {v15, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v0

    .line 710
    goto :goto_1d

    .line 711
    :cond_2d
    sget-object v0, Lp1/a;->f:[Ljava/lang/String;

    .line 712
    .line 713
    :goto_1d
    if-eqz v5, :cond_2e

    .line 714
    .line 715
    const-string v4, "\\."

    .line 716
    .line 717
    invoke-virtual {v5, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 718
    .line 719
    .line 720
    move-result-object v4

    .line 721
    goto :goto_1e

    .line 722
    :cond_2e
    sget-object v4, Lp1/a;->f:[Ljava/lang/String;

    .line 723
    .line 724
    :goto_1e
    array-length v5, v0

    .line 725
    array-length v10, v4

    .line 726
    if-le v5, v10, :cond_2f

    .line 727
    .line 728
    goto :goto_1f

    .line 729
    :cond_2f
    move-object v0, v4

    .line 730
    :goto_1f
    array-length v4, v11

    .line 731
    array-length v5, v0

    .line 732
    const/16 v10, 0x21

    .line 733
    .line 734
    if-ne v4, v5, :cond_30

    .line 735
    .line 736
    const/4 v4, 0x0

    .line 737
    aget-object v5, v0, v4

    .line 738
    .line 739
    invoke-virtual {v5, v4}, Ljava/lang/String;->charAt(I)C

    .line 740
    .line 741
    .line 742
    move-result v5

    .line 743
    if-eq v5, v10, :cond_31

    .line 744
    .line 745
    const/4 v0, 0x0

    .line 746
    goto :goto_23

    .line 747
    :cond_30
    const/4 v4, 0x0

    .line 748
    :cond_31
    aget-object v5, v0, v4

    .line 749
    .line 750
    invoke-virtual {v5, v4}, Ljava/lang/String;->charAt(I)C

    .line 751
    .line 752
    .line 753
    move-result v5

    .line 754
    if-ne v5, v10, :cond_32

    .line 755
    .line 756
    array-length v4, v11

    .line 757
    array-length v0, v0

    .line 758
    :goto_20
    sub-int/2addr v4, v0

    .line 759
    goto :goto_21

    .line 760
    :cond_32
    array-length v4, v11

    .line 761
    array-length v0, v0

    .line 762
    const/4 v5, 0x1

    .line 763
    add-int/2addr v0, v5

    .line 764
    goto :goto_20

    .line 765
    :goto_21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 766
    .line 767
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 768
    .line 769
    .line 770
    const-string v5, "\\."

    .line 771
    .line 772
    invoke-virtual {v3, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 773
    .line 774
    .line 775
    move-result-object v5

    .line 776
    :goto_22
    array-length v10, v5

    .line 777
    if-ge v4, v10, :cond_33

    .line 778
    .line 779
    aget-object v10, v5, v4

    .line 780
    .line 781
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 782
    .line 783
    .line 784
    const/16 v10, 0x2e

    .line 785
    .line 786
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 787
    .line 788
    .line 789
    const/4 v11, 0x1

    .line 790
    add-int/2addr v4, v11

    .line 791
    goto :goto_22

    .line 792
    :cond_33
    const/4 v11, 0x1

    .line 793
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 794
    .line 795
    .line 796
    move-result v4

    .line 797
    sub-int/2addr v4, v11

    .line 798
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 799
    .line 800
    .line 801
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 802
    .line 803
    .line 804
    move-result-object v0

    .line 805
    :goto_23
    if-nez v0, :cond_36

    .line 806
    .line 807
    goto/16 :goto_2

    .line 808
    .line 809
    :catchall_1
    move-exception v0

    .line 810
    goto :goto_24

    .line 811
    :cond_34
    :try_start_8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 812
    .line 813
    const-string v1, "Unable to load publicsuffixes.gz resource from the classpath."

    .line 814
    .line 815
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 816
    .line 817
    .line 818
    throw v0

    .line 819
    :goto_24
    monitor-exit v10
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 820
    throw v0

    .line 821
    :cond_35
    move/from16 v28, v5

    .line 822
    .line 823
    :cond_36
    if-eqz v7, :cond_38

    .line 824
    .line 825
    const-string v0, "/"

    .line 826
    .line 827
    invoke-virtual {v7, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 828
    .line 829
    .line 830
    move-result v0

    .line 831
    if-nez v0, :cond_37

    .line 832
    .line 833
    goto :goto_25

    .line 834
    :cond_37
    move-object/from16 v23, v7

    .line 835
    .line 836
    const/4 v5, 0x0

    .line 837
    goto :goto_27

    .line 838
    :cond_38
    :goto_25
    iget-object v0, v1, Lg1/u;->a:Ljava/lang/String;

    .line 839
    .line 840
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 841
    .line 842
    .line 843
    move-result v0

    .line 844
    add-int/lit8 v0, v0, 0x3

    .line 845
    .line 846
    iget-object v4, v1, Lg1/u;->h:Ljava/lang/String;

    .line 847
    .line 848
    const/16 v5, 0x2f

    .line 849
    .line 850
    invoke-virtual {v4, v5, v0}, Ljava/lang/String;->indexOf(II)I

    .line 851
    .line 852
    .line 853
    move-result v0

    .line 854
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 855
    .line 856
    .line 857
    move-result v7

    .line 858
    const-string v10, "?#"

    .line 859
    .line 860
    invoke-static {v4, v0, v7, v10}, Lh1/c;->h(Ljava/lang/String;IILjava/lang/String;)I

    .line 861
    .line 862
    .line 863
    move-result v7

    .line 864
    invoke-virtual {v4, v0, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 865
    .line 866
    .line 867
    move-result-object v0

    .line 868
    invoke-virtual {v0, v5}, Ljava/lang/String;->lastIndexOf(I)I

    .line 869
    .line 870
    .line 871
    move-result v4

    .line 872
    const/4 v5, 0x0

    .line 873
    if-eqz v4, :cond_39

    .line 874
    .line 875
    invoke-virtual {v0, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 876
    .line 877
    .line 878
    move-result-object v0

    .line 879
    goto :goto_26

    .line 880
    :cond_39
    const-string v0, "/"

    .line 881
    .line 882
    :goto_26
    move-object/from16 v23, v0

    .line 883
    .line 884
    :goto_27
    new-instance v0, Lg1/q;

    .line 885
    .line 886
    move-object/from16 v17, v0

    .line 887
    .line 888
    move-object/from16 v18, v6

    .line 889
    .line 890
    move-object/from16 v19, v2

    .line 891
    .line 892
    move-object/from16 v22, v3

    .line 893
    .line 894
    invoke-direct/range {v17 .. v27}, Lg1/q;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V

    .line 895
    .line 896
    .line 897
    goto :goto_29

    .line 898
    :cond_3a
    :goto_28
    move/from16 v28, v5

    .line 899
    .line 900
    const/4 v5, 0x0

    .line 901
    const/4 v0, 0x0

    .line 902
    :goto_29
    if-nez v0, :cond_3b

    .line 903
    .line 904
    :goto_2a
    const/4 v2, 0x1

    .line 905
    goto :goto_2b

    .line 906
    :cond_3b
    if-nez v9, :cond_3c

    .line 907
    .line 908
    new-instance v9, Ljava/util/ArrayList;

    .line 909
    .line 910
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 911
    .line 912
    .line 913
    :cond_3c
    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 914
    .line 915
    .line 916
    goto :goto_2a

    .line 917
    :goto_2b
    add-int/2addr v8, v2

    .line 918
    const/4 v6, 0x0

    .line 919
    move-object/from16 v3, p0

    .line 920
    .line 921
    move-object/from16 v4, v16

    .line 922
    .line 923
    move/from16 v5, v28

    .line 924
    .line 925
    goto/16 :goto_0

    .line 926
    .line 927
    :cond_3d
    if-eqz v9, :cond_3e

    .line 928
    .line 929
    invoke-static {v9}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 930
    .line 931
    .line 932
    move-result-object v0

    .line 933
    goto :goto_2c

    .line 934
    :cond_3e
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 935
    .line 936
    .line 937
    move-result-object v0

    .line 938
    :goto_2c
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 939
    .line 940
    .line 941
    move-result v0

    .line 942
    if-eqz v0, :cond_3f

    .line 943
    .line 944
    return-void

    .line 945
    :cond_3f
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 946
    .line 947
    .line 948
    return-void
.end method

.method public static e(Ljava/lang/String;ILjava/lang/String;)I
    .locals 2

    .line 1
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ge p1, v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, -0x1

    .line 16
    if-eq v0, v1, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    :goto_1
    return p1
.end method

.method public static f(Lg1/s;)Ljava/util/Set;
    .locals 8

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lg1/s;->d()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    :goto_0
    if-ge v3, v1, :cond_3

    .line 12
    .line 13
    const-string v4, "Vary"

    .line 14
    .line 15
    invoke-virtual {p0, v3}, Lg1/s;->b(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-nez v4, :cond_0

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_0
    invoke-virtual {p0, v3}, Lg1/s;->e(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    new-instance v0, Ljava/util/TreeSet;

    .line 37
    .line 38
    sget-object v5, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    .line 39
    .line 40
    invoke-direct {v0, v5}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    const-string v5, ","

    .line 44
    .line 45
    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    array-length v5, v4

    .line 50
    const/4 v6, 0x0

    .line 51
    :goto_1
    if-ge v6, v5, :cond_2

    .line 52
    .line 53
    aget-object v7, v4, v6

    .line 54
    .line 55
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    invoke-interface {v0, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    add-int/lit8 v6, v6, 0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    return-object v0
.end method
