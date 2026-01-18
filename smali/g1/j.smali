.class public final Lg1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final n:Lg1/j;


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:I

.field public final d:I

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:I

.field public final i:I

.field public final j:Z

.field public final k:Z

.field public final l:Z

.field public m:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lg1/i;

    .line 2
    .line 3
    invoke-direct {v0}, Lg1/i;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Lg1/i;->b:Z

    .line 8
    .line 9
    new-instance v2, Lg1/j;

    .line 10
    .line 11
    invoke-direct {v2, v0}, Lg1/j;-><init>(Lg1/i;)V

    .line 12
    .line 13
    .line 14
    new-instance v0, Lg1/i;

    .line 15
    .line 16
    invoke-direct {v0}, Lg1/i;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-boolean v1, v0, Lg1/i;->d:Z

    .line 20
    .line 21
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 22
    .line 23
    const v2, 0x7fffffff

    .line 24
    .line 25
    .line 26
    int-to-long v3, v2

    .line 27
    invoke-virtual {v1, v3, v4}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    const-wide/32 v5, 0x7fffffff

    .line 32
    .line 33
    .line 34
    cmp-long v1, v3, v5

    .line 35
    .line 36
    if-lez v1, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    long-to-int v2, v3

    .line 40
    :goto_0
    iput v2, v0, Lg1/i;->a:I

    .line 41
    .line 42
    new-instance v1, Lg1/j;

    .line 43
    .line 44
    invoke-direct {v1, v0}, Lg1/j;-><init>(Lg1/i;)V

    .line 45
    .line 46
    .line 47
    sput-object v1, Lg1/j;->n:Lg1/j;

    .line 48
    .line 49
    return-void
.end method

.method public constructor <init>(Lg1/i;)V
    .locals 3

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iget-boolean v0, p1, Lg1/i;->b:Z

    iput-boolean v0, p0, Lg1/j;->a:Z

    .line 17
    iget-boolean v0, p1, Lg1/i;->c:Z

    iput-boolean v0, p0, Lg1/j;->b:Z

    const/4 v0, -0x1

    .line 18
    iput v0, p0, Lg1/j;->c:I

    .line 19
    iput v0, p0, Lg1/j;->d:I

    const/4 v1, 0x0

    .line 20
    iput-boolean v1, p0, Lg1/j;->e:Z

    .line 21
    iput-boolean v1, p0, Lg1/j;->f:Z

    .line 22
    iput-boolean v1, p0, Lg1/j;->g:Z

    .line 23
    iget v2, p1, Lg1/i;->a:I

    iput v2, p0, Lg1/j;->h:I

    .line 24
    iput v0, p0, Lg1/j;->i:I

    .line 25
    iget-boolean p1, p1, Lg1/i;->d:Z

    iput-boolean p1, p0, Lg1/j;->j:Z

    .line 26
    iput-boolean v1, p0, Lg1/j;->k:Z

    .line 27
    iput-boolean v1, p0, Lg1/j;->l:Z

    return-void
.end method

.method public constructor <init>(ZZIIZZZIIZZZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lg1/j;->a:Z

    .line 3
    iput-boolean p2, p0, Lg1/j;->b:Z

    .line 4
    iput p3, p0, Lg1/j;->c:I

    .line 5
    iput p4, p0, Lg1/j;->d:I

    .line 6
    iput-boolean p5, p0, Lg1/j;->e:Z

    .line 7
    iput-boolean p6, p0, Lg1/j;->f:Z

    .line 8
    iput-boolean p7, p0, Lg1/j;->g:Z

    .line 9
    iput p8, p0, Lg1/j;->h:I

    .line 10
    iput p9, p0, Lg1/j;->i:I

    .line 11
    iput-boolean p10, p0, Lg1/j;->j:Z

    .line 12
    iput-boolean p11, p0, Lg1/j;->k:Z

    .line 13
    iput-boolean p12, p0, Lg1/j;->l:Z

    .line 14
    iput-object p13, p0, Lg1/j;->m:Ljava/lang/String;

    return-void
.end method

.method public static a(Lg1/s;)Lg1/j;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Lg1/s;->d()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v6, 0x0

    .line 8
    const/4 v7, 0x1

    .line 9
    const/4 v8, 0x0

    .line 10
    const/4 v9, 0x0

    .line 11
    const/4 v10, 0x0

    .line 12
    const/4 v11, -0x1

    .line 13
    const/4 v12, -0x1

    .line 14
    const/4 v13, 0x0

    .line 15
    const/4 v14, 0x0

    .line 16
    const/4 v15, 0x0

    .line 17
    const/16 v16, -0x1

    .line 18
    .line 19
    const/16 v17, -0x1

    .line 20
    .line 21
    const/16 v18, 0x0

    .line 22
    .line 23
    const/16 v19, 0x0

    .line 24
    .line 25
    const/16 v20, 0x0

    .line 26
    .line 27
    :goto_0
    if-ge v6, v1, :cond_13

    .line 28
    .line 29
    invoke-virtual {v0, v6}, Lg1/s;->b(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v0, v6}, Lg1/s;->e(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    const-string v3, "Cache-Control"

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    if-eqz v8, :cond_0

    .line 46
    .line 47
    :goto_1
    const/4 v7, 0x0

    .line 48
    goto :goto_2

    .line 49
    :cond_0
    move-object v8, v5

    .line 50
    goto :goto_2

    .line 51
    :cond_1
    const-string v3, "Pragma"

    .line 52
    .line 53
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_12

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :goto_2
    const/4 v2, 0x0

    .line 61
    :goto_3
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-ge v2, v3, :cond_12

    .line 66
    .line 67
    const-string v3, "=,;"

    .line 68
    .line 69
    invoke-static {v5, v2, v3}, Lk1/d;->e(Ljava/lang/String;ILjava/lang/String;)I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-virtual {v5, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-eq v3, v4, :cond_2

    .line 86
    .line 87
    invoke-virtual {v5, v3}, Ljava/lang/String;->charAt(I)C

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    const/16 v0, 0x2c

    .line 92
    .line 93
    if-eq v4, v0, :cond_2

    .line 94
    .line 95
    invoke-virtual {v5, v3}, Ljava/lang/String;->charAt(I)C

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    const/16 v4, 0x3b

    .line 100
    .line 101
    if-ne v0, v4, :cond_3

    .line 102
    .line 103
    :cond_2
    const/4 v4, 0x1

    .line 104
    goto :goto_6

    .line 105
    :goto_4
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-ge v3, v0, :cond_4

    .line 110
    .line 111
    invoke-virtual {v5, v3}, Ljava/lang/String;->charAt(I)C

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    const/16 v4, 0x20

    .line 116
    .line 117
    if-eq v0, v4, :cond_3

    .line 118
    .line 119
    const/16 v4, 0x9

    .line 120
    .line 121
    if-eq v0, v4, :cond_3

    .line 122
    .line 123
    goto :goto_5

    .line 124
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_4
    :goto_5
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-ge v3, v0, :cond_5

    .line 132
    .line 133
    invoke-virtual {v5, v3}, Ljava/lang/String;->charAt(I)C

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    const/16 v4, 0x22

    .line 138
    .line 139
    if-ne v0, v4, :cond_5

    .line 140
    .line 141
    add-int/lit8 v3, v3, 0x1

    .line 142
    .line 143
    const-string v0, "\""

    .line 144
    .line 145
    invoke-static {v5, v3, v0}, Lk1/d;->e(Ljava/lang/String;ILjava/lang/String;)I

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    invoke-virtual {v5, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    const/4 v4, 0x1

    .line 154
    add-int/2addr v0, v4

    .line 155
    goto :goto_7

    .line 156
    :cond_5
    const/4 v4, 0x1

    .line 157
    const-string v0, ",;"

    .line 158
    .line 159
    invoke-static {v5, v3, v0}, Lk1/d;->e(Ljava/lang/String;ILjava/lang/String;)I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    invoke-virtual {v5, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    goto :goto_7

    .line 172
    :goto_6
    add-int/lit8 v3, v3, 0x1

    .line 173
    .line 174
    move v0, v3

    .line 175
    const/4 v3, 0x0

    .line 176
    :goto_7
    const-string v4, "no-cache"

    .line 177
    .line 178
    invoke-virtual {v4, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    if-eqz v4, :cond_6

    .line 183
    .line 184
    const/4 v4, -0x1

    .line 185
    const/4 v9, 0x1

    .line 186
    goto/16 :goto_8

    .line 187
    .line 188
    :cond_6
    const-string v4, "no-store"

    .line 189
    .line 190
    invoke-virtual {v4, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    if-eqz v4, :cond_7

    .line 195
    .line 196
    const/4 v4, -0x1

    .line 197
    const/4 v10, 0x1

    .line 198
    goto/16 :goto_8

    .line 199
    .line 200
    :cond_7
    const-string v4, "max-age"

    .line 201
    .line 202
    invoke-virtual {v4, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    if-eqz v4, :cond_8

    .line 207
    .line 208
    const/4 v4, -0x1

    .line 209
    invoke-static {v3, v4}, Lk1/d;->c(Ljava/lang/String;I)I

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    move v11, v2

    .line 214
    goto/16 :goto_8

    .line 215
    .line 216
    :cond_8
    const-string v4, "s-maxage"

    .line 217
    .line 218
    invoke-virtual {v4, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    if-eqz v4, :cond_9

    .line 223
    .line 224
    const/4 v4, -0x1

    .line 225
    invoke-static {v3, v4}, Lk1/d;->c(Ljava/lang/String;I)I

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    move v12, v2

    .line 230
    goto/16 :goto_8

    .line 231
    .line 232
    :cond_9
    const-string v4, "private"

    .line 233
    .line 234
    invoke-virtual {v4, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 235
    .line 236
    .line 237
    move-result v4

    .line 238
    if-eqz v4, :cond_a

    .line 239
    .line 240
    const/4 v4, -0x1

    .line 241
    const/4 v13, 0x1

    .line 242
    goto :goto_8

    .line 243
    :cond_a
    const-string v4, "public"

    .line 244
    .line 245
    invoke-virtual {v4, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 246
    .line 247
    .line 248
    move-result v4

    .line 249
    if-eqz v4, :cond_b

    .line 250
    .line 251
    const/4 v4, -0x1

    .line 252
    const/4 v14, 0x1

    .line 253
    goto :goto_8

    .line 254
    :cond_b
    const-string v4, "must-revalidate"

    .line 255
    .line 256
    invoke-virtual {v4, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 257
    .line 258
    .line 259
    move-result v4

    .line 260
    if-eqz v4, :cond_c

    .line 261
    .line 262
    const/4 v4, -0x1

    .line 263
    const/4 v15, 0x1

    .line 264
    goto :goto_8

    .line 265
    :cond_c
    const-string v4, "max-stale"

    .line 266
    .line 267
    invoke-virtual {v4, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 268
    .line 269
    .line 270
    move-result v4

    .line 271
    if-eqz v4, :cond_d

    .line 272
    .line 273
    const v2, 0x7fffffff

    .line 274
    .line 275
    .line 276
    invoke-static {v3, v2}, Lk1/d;->c(Ljava/lang/String;I)I

    .line 277
    .line 278
    .line 279
    move-result v2

    .line 280
    move/from16 v16, v2

    .line 281
    .line 282
    const/4 v4, -0x1

    .line 283
    goto :goto_8

    .line 284
    :cond_d
    const-string v4, "min-fresh"

    .line 285
    .line 286
    invoke-virtual {v4, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 287
    .line 288
    .line 289
    move-result v4

    .line 290
    if-eqz v4, :cond_e

    .line 291
    .line 292
    const/4 v4, -0x1

    .line 293
    invoke-static {v3, v4}, Lk1/d;->c(Ljava/lang/String;I)I

    .line 294
    .line 295
    .line 296
    move-result v2

    .line 297
    move/from16 v17, v2

    .line 298
    .line 299
    goto :goto_8

    .line 300
    :cond_e
    const/4 v4, -0x1

    .line 301
    const-string v3, "only-if-cached"

    .line 302
    .line 303
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 304
    .line 305
    .line 306
    move-result v3

    .line 307
    if-eqz v3, :cond_f

    .line 308
    .line 309
    const/16 v18, 0x1

    .line 310
    .line 311
    goto :goto_8

    .line 312
    :cond_f
    const-string v3, "no-transform"

    .line 313
    .line 314
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 315
    .line 316
    .line 317
    move-result v3

    .line 318
    if-eqz v3, :cond_10

    .line 319
    .line 320
    const/16 v19, 0x1

    .line 321
    .line 322
    goto :goto_8

    .line 323
    :cond_10
    const-string v3, "immutable"

    .line 324
    .line 325
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 326
    .line 327
    .line 328
    move-result v2

    .line 329
    if-eqz v2, :cond_11

    .line 330
    .line 331
    const/16 v20, 0x1

    .line 332
    .line 333
    :cond_11
    :goto_8
    move v2, v0

    .line 334
    move-object/from16 v0, p0

    .line 335
    .line 336
    goto/16 :goto_3

    .line 337
    .line 338
    :cond_12
    const/4 v4, -0x1

    .line 339
    add-int/lit8 v6, v6, 0x1

    .line 340
    .line 341
    move-object/from16 v0, p0

    .line 342
    .line 343
    goto/16 :goto_0

    .line 344
    .line 345
    :cond_13
    if-nez v7, :cond_14

    .line 346
    .line 347
    const/16 v21, 0x0

    .line 348
    .line 349
    goto :goto_9

    .line 350
    :cond_14
    move-object/from16 v21, v8

    .line 351
    .line 352
    :goto_9
    new-instance v0, Lg1/j;

    .line 353
    .line 354
    move-object v8, v0

    .line 355
    invoke-direct/range {v8 .. v21}, Lg1/j;-><init>(ZZIIZZZIIZZZLjava/lang/String;)V

    .line 356
    .line 357
    .line 358
    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lg1/j;->m:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_1

    .line 6
    .line 7
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    iget-boolean v1, p0, Lg1/j;->a:Z

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    const-string v1, "no-cache, "

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    :cond_1
    iget-boolean v1, p0, Lg1/j;->b:Z

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    const-string v1, "no-store, "

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    :cond_2
    iget v1, p0, Lg1/j;->c:I

    .line 31
    .line 32
    const-string v2, ", "

    .line 33
    .line 34
    const/4 v3, -0x1

    .line 35
    if-eq v1, v3, :cond_3

    .line 36
    .line 37
    const-string v4, "max-age="

    .line 38
    .line 39
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    :cond_3
    iget v1, p0, Lg1/j;->d:I

    .line 49
    .line 50
    if-eq v1, v3, :cond_4

    .line 51
    .line 52
    const-string v4, "s-maxage="

    .line 53
    .line 54
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    :cond_4
    iget-boolean v1, p0, Lg1/j;->e:Z

    .line 64
    .line 65
    if-eqz v1, :cond_5

    .line 66
    .line 67
    const-string v1, "private, "

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    :cond_5
    iget-boolean v1, p0, Lg1/j;->f:Z

    .line 73
    .line 74
    if-eqz v1, :cond_6

    .line 75
    .line 76
    const-string v1, "public, "

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    :cond_6
    iget-boolean v1, p0, Lg1/j;->g:Z

    .line 82
    .line 83
    if-eqz v1, :cond_7

    .line 84
    .line 85
    const-string v1, "must-revalidate, "

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    :cond_7
    iget v1, p0, Lg1/j;->h:I

    .line 91
    .line 92
    if-eq v1, v3, :cond_8

    .line 93
    .line 94
    const-string v4, "max-stale="

    .line 95
    .line 96
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    :cond_8
    iget v1, p0, Lg1/j;->i:I

    .line 106
    .line 107
    if-eq v1, v3, :cond_9

    .line 108
    .line 109
    const-string v3, "min-fresh="

    .line 110
    .line 111
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    :cond_9
    iget-boolean v1, p0, Lg1/j;->j:Z

    .line 121
    .line 122
    if-eqz v1, :cond_a

    .line 123
    .line 124
    const-string v1, "only-if-cached, "

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    :cond_a
    iget-boolean v1, p0, Lg1/j;->k:Z

    .line 130
    .line 131
    if-eqz v1, :cond_b

    .line 132
    .line 133
    const-string v1, "no-transform, "

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    :cond_b
    iget-boolean v1, p0, Lg1/j;->l:Z

    .line 139
    .line 140
    if-eqz v1, :cond_c

    .line 141
    .line 142
    const-string v1, "immutable, "

    .line 143
    .line 144
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    :cond_c
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    if-nez v1, :cond_d

    .line 152
    .line 153
    const-string v0, ""

    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_d
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    add-int/lit8 v1, v1, -0x2

    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    :goto_0
    iput-object v0, p0, Lg1/j;->m:Ljava/lang/String;

    .line 174
    .line 175
    :goto_1
    return-object v0
.end method
