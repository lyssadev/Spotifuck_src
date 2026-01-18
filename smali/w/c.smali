.class public final Lw/c;
.super Lw/o;
.source "SourceFile"


# instance fields
.field public final k:Ljava/util/ArrayList;

.field public l:I


# direct methods
.method public constructor <init>(Lv/d;I)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Lw/o;-><init>(Lv/d;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lw/c;->k:Ljava/util/ArrayList;

    .line 10
    .line 11
    iput p2, p0, Lw/o;->f:I

    .line 12
    .line 13
    iget-object p1, p0, Lw/o;->b:Lv/d;

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Lv/d;->m(I)Lv/d;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    :goto_0
    move-object v3, p2

    .line 20
    move-object p2, p1

    .line 21
    move-object p1, v3

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    iget p2, p0, Lw/o;->f:I

    .line 25
    .line 26
    invoke-virtual {p1, p2}, Lv/d;->m(I)Lv/d;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iput-object p2, p0, Lw/o;->b:Lv/d;

    .line 32
    .line 33
    iget p1, p0, Lw/o;->f:I

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    const/4 v1, 0x1

    .line 37
    if-nez p1, :cond_1

    .line 38
    .line 39
    iget-object p1, p2, Lv/d;->d:Lw/k;

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    if-ne p1, v1, :cond_2

    .line 43
    .line 44
    iget-object p1, p2, Lv/d;->e:Lw/m;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move-object p1, v0

    .line 48
    :goto_1
    iget-object v2, p0, Lw/c;->k:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    iget p1, p0, Lw/o;->f:I

    .line 54
    .line 55
    invoke-virtual {p2, p1}, Lv/d;->l(I)Lv/d;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    :goto_2
    if-eqz p1, :cond_5

    .line 60
    .line 61
    iget p2, p0, Lw/o;->f:I

    .line 62
    .line 63
    if-nez p2, :cond_3

    .line 64
    .line 65
    iget-object p2, p1, Lv/d;->d:Lw/k;

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_3
    if-ne p2, v1, :cond_4

    .line 69
    .line 70
    iget-object p2, p1, Lv/d;->e:Lw/m;

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_4
    move-object p2, v0

    .line 74
    :goto_3
    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    iget p2, p0, Lw/o;->f:I

    .line 78
    .line 79
    invoke-virtual {p1, p2}, Lv/d;->l(I)Lv/d;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    goto :goto_2

    .line 84
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    :cond_6
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    if-eqz p2, :cond_8

    .line 93
    .line 94
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    check-cast p2, Lw/o;

    .line 99
    .line 100
    iget v0, p0, Lw/o;->f:I

    .line 101
    .line 102
    if-nez v0, :cond_7

    .line 103
    .line 104
    iget-object p2, p2, Lw/o;->b:Lv/d;

    .line 105
    .line 106
    iput-object p0, p2, Lv/d;->b:Lw/c;

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_7
    if-ne v0, v1, :cond_6

    .line 110
    .line 111
    iget-object p2, p2, Lw/o;->b:Lv/d;

    .line 112
    .line 113
    iput-object p0, p2, Lv/d;->c:Lw/c;

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_8
    iget p1, p0, Lw/o;->f:I

    .line 117
    .line 118
    if-nez p1, :cond_9

    .line 119
    .line 120
    iget-object p1, p0, Lw/o;->b:Lv/d;

    .line 121
    .line 122
    iget-object p1, p1, Lv/d;->T:Lv/d;

    .line 123
    .line 124
    check-cast p1, Lv/e;

    .line 125
    .line 126
    iget-boolean p1, p1, Lv/e;->v0:Z

    .line 127
    .line 128
    if-eqz p1, :cond_9

    .line 129
    .line 130
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-le p1, v1, :cond_9

    .line 135
    .line 136
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    sub-int/2addr p1, v1

    .line 141
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    check-cast p1, Lw/o;

    .line 146
    .line 147
    iget-object p1, p1, Lw/o;->b:Lv/d;

    .line 148
    .line 149
    iput-object p1, p0, Lw/o;->b:Lv/d;

    .line 150
    .line 151
    :cond_9
    iget p1, p0, Lw/o;->f:I

    .line 152
    .line 153
    if-nez p1, :cond_a

    .line 154
    .line 155
    iget-object p1, p0, Lw/o;->b:Lv/d;

    .line 156
    .line 157
    iget p1, p1, Lv/d;->i0:I

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_a
    iget-object p1, p0, Lw/o;->b:Lv/d;

    .line 161
    .line 162
    iget p1, p1, Lv/d;->j0:I

    .line 163
    .line 164
    :goto_5
    iput p1, p0, Lw/c;->l:I

    .line 165
    .line 166
    return-void
.end method


# virtual methods
.method public final a(Lw/d;)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lw/o;->h:Lw/f;

    .line 4
    .line 5
    iget-boolean v2, v1, Lw/f;->j:Z

    .line 6
    .line 7
    if-eqz v2, :cond_56

    .line 8
    .line 9
    iget-object v2, v0, Lw/o;->i:Lw/f;

    .line 10
    .line 11
    iget-boolean v3, v2, Lw/f;->j:Z

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    goto/16 :goto_33

    .line 16
    .line 17
    :cond_0
    iget-object v3, v0, Lw/o;->b:Lv/d;

    .line 18
    .line 19
    iget-object v3, v3, Lv/d;->T:Lv/d;

    .line 20
    .line 21
    instance-of v4, v3, Lv/e;

    .line 22
    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    check-cast v3, Lv/e;

    .line 26
    .line 27
    iget-boolean v3, v3, Lv/e;->v0:Z

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v3, 0x0

    .line 31
    :goto_0
    iget v4, v2, Lw/f;->g:I

    .line 32
    .line 33
    iget v6, v1, Lw/f;->g:I

    .line 34
    .line 35
    sub-int/2addr v4, v6

    .line 36
    iget-object v6, v0, Lw/c;->k:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    const/4 v8, 0x0

    .line 43
    :goto_1
    const/4 v9, -0x1

    .line 44
    const/16 v10, 0x8

    .line 45
    .line 46
    if-ge v8, v7, :cond_2

    .line 47
    .line 48
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v11

    .line 52
    check-cast v11, Lw/o;

    .line 53
    .line 54
    iget-object v11, v11, Lw/o;->b:Lv/d;

    .line 55
    .line 56
    iget v11, v11, Lv/d;->g0:I

    .line 57
    .line 58
    if-ne v11, v10, :cond_3

    .line 59
    .line 60
    add-int/lit8 v8, v8, 0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    const/4 v8, -0x1

    .line 64
    :cond_3
    add-int/lit8 v11, v7, -0x1

    .line 65
    .line 66
    move v12, v11

    .line 67
    :goto_2
    if-ltz v12, :cond_5

    .line 68
    .line 69
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v13

    .line 73
    check-cast v13, Lw/o;

    .line 74
    .line 75
    iget-object v13, v13, Lw/o;->b:Lv/d;

    .line 76
    .line 77
    iget v13, v13, Lv/d;->g0:I

    .line 78
    .line 79
    if-ne v13, v10, :cond_4

    .line 80
    .line 81
    add-int/lit8 v12, v12, -0x1

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    move v9, v12

    .line 85
    :cond_5
    const/4 v12, 0x0

    .line 86
    :goto_3
    const/4 v5, 0x2

    .line 87
    if-ge v12, v5, :cond_14

    .line 88
    .line 89
    const/4 v5, 0x0

    .line 90
    const/4 v14, 0x0

    .line 91
    const/16 v17, 0x0

    .line 92
    .line 93
    const/16 v18, 0x0

    .line 94
    .line 95
    const/16 v19, 0x0

    .line 96
    .line 97
    :goto_4
    if-ge v5, v7, :cond_11

    .line 98
    .line 99
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v20

    .line 103
    move-object/from16 v13, v20

    .line 104
    .line 105
    check-cast v13, Lw/o;

    .line 106
    .line 107
    iget-object v15, v13, Lw/o;->b:Lv/d;

    .line 108
    .line 109
    move-object/from16 v21, v6

    .line 110
    .line 111
    iget v6, v15, Lv/d;->g0:I

    .line 112
    .line 113
    if-ne v6, v10, :cond_6

    .line 114
    .line 115
    move/from16 v23, v8

    .line 116
    .line 117
    goto/16 :goto_a

    .line 118
    .line 119
    :cond_6
    add-int/lit8 v18, v18, 0x1

    .line 120
    .line 121
    if-lez v5, :cond_7

    .line 122
    .line 123
    if-lt v5, v8, :cond_7

    .line 124
    .line 125
    iget-object v6, v13, Lw/o;->h:Lw/f;

    .line 126
    .line 127
    iget v6, v6, Lw/f;->f:I

    .line 128
    .line 129
    add-int/2addr v14, v6

    .line 130
    :cond_7
    iget-object v6, v13, Lw/o;->e:Lw/g;

    .line 131
    .line 132
    iget v10, v6, Lw/f;->g:I

    .line 133
    .line 134
    move/from16 v22, v10

    .line 135
    .line 136
    iget v10, v13, Lw/o;->d:I

    .line 137
    .line 138
    move/from16 v23, v8

    .line 139
    .line 140
    const/4 v8, 0x3

    .line 141
    if-eq v10, v8, :cond_8

    .line 142
    .line 143
    const/4 v8, 0x1

    .line 144
    goto :goto_5

    .line 145
    :cond_8
    const/4 v8, 0x0

    .line 146
    :goto_5
    if-eqz v8, :cond_b

    .line 147
    .line 148
    iget v6, v0, Lw/o;->f:I

    .line 149
    .line 150
    if-nez v6, :cond_9

    .line 151
    .line 152
    iget-object v10, v15, Lv/d;->d:Lw/k;

    .line 153
    .line 154
    iget-object v10, v10, Lw/o;->e:Lw/g;

    .line 155
    .line 156
    iget-boolean v10, v10, Lw/f;->j:Z

    .line 157
    .line 158
    if-nez v10, :cond_9

    .line 159
    .line 160
    return-void

    .line 161
    :cond_9
    const/4 v10, 0x1

    .line 162
    if-ne v6, v10, :cond_a

    .line 163
    .line 164
    iget-object v6, v15, Lv/d;->e:Lw/m;

    .line 165
    .line 166
    iget-object v6, v6, Lw/o;->e:Lw/g;

    .line 167
    .line 168
    iget-boolean v6, v6, Lw/f;->j:Z

    .line 169
    .line 170
    if-nez v6, :cond_a

    .line 171
    .line 172
    return-void

    .line 173
    :cond_a
    move/from16 v24, v8

    .line 174
    .line 175
    goto :goto_7

    .line 176
    :cond_b
    move/from16 v24, v8

    .line 177
    .line 178
    const/4 v10, 0x1

    .line 179
    iget v8, v13, Lw/o;->a:I

    .line 180
    .line 181
    if-ne v8, v10, :cond_c

    .line 182
    .line 183
    if-nez v12, :cond_c

    .line 184
    .line 185
    iget v10, v6, Lw/g;->m:I

    .line 186
    .line 187
    add-int/lit8 v17, v17, 0x1

    .line 188
    .line 189
    :goto_6
    const/16 v24, 0x1

    .line 190
    .line 191
    goto :goto_8

    .line 192
    :cond_c
    iget-boolean v6, v6, Lw/f;->j:Z

    .line 193
    .line 194
    if-eqz v6, :cond_d

    .line 195
    .line 196
    move/from16 v10, v22

    .line 197
    .line 198
    goto :goto_6

    .line 199
    :cond_d
    :goto_7
    move/from16 v10, v22

    .line 200
    .line 201
    :goto_8
    if-nez v24, :cond_e

    .line 202
    .line 203
    add-int/lit8 v17, v17, 0x1

    .line 204
    .line 205
    iget-object v6, v15, Lv/d;->k0:[F

    .line 206
    .line 207
    iget v8, v0, Lw/o;->f:I

    .line 208
    .line 209
    aget v6, v6, v8

    .line 210
    .line 211
    const/4 v8, 0x0

    .line 212
    cmpl-float v10, v6, v8

    .line 213
    .line 214
    if-ltz v10, :cond_f

    .line 215
    .line 216
    add-float v19, v19, v6

    .line 217
    .line 218
    goto :goto_9

    .line 219
    :cond_e
    add-int/2addr v14, v10

    .line 220
    :cond_f
    :goto_9
    if-ge v5, v11, :cond_10

    .line 221
    .line 222
    if-ge v5, v9, :cond_10

    .line 223
    .line 224
    iget-object v6, v13, Lw/o;->i:Lw/f;

    .line 225
    .line 226
    iget v6, v6, Lw/f;->f:I

    .line 227
    .line 228
    neg-int v6, v6

    .line 229
    add-int/2addr v14, v6

    .line 230
    :cond_10
    :goto_a
    add-int/lit8 v5, v5, 0x1

    .line 231
    .line 232
    move-object/from16 v6, v21

    .line 233
    .line 234
    move/from16 v8, v23

    .line 235
    .line 236
    const/16 v10, 0x8

    .line 237
    .line 238
    goto/16 :goto_4

    .line 239
    .line 240
    :cond_11
    move-object/from16 v21, v6

    .line 241
    .line 242
    move/from16 v23, v8

    .line 243
    .line 244
    if-lt v14, v4, :cond_13

    .line 245
    .line 246
    if-nez v17, :cond_12

    .line 247
    .line 248
    goto :goto_b

    .line 249
    :cond_12
    add-int/lit8 v12, v12, 0x1

    .line 250
    .line 251
    move-object/from16 v6, v21

    .line 252
    .line 253
    move/from16 v8, v23

    .line 254
    .line 255
    const/16 v10, 0x8

    .line 256
    .line 257
    goto/16 :goto_3

    .line 258
    .line 259
    :cond_13
    :goto_b
    move/from16 v5, v17

    .line 260
    .line 261
    move/from16 v6, v18

    .line 262
    .line 263
    goto :goto_c

    .line 264
    :cond_14
    move-object/from16 v21, v6

    .line 265
    .line 266
    move/from16 v23, v8

    .line 267
    .line 268
    const/4 v5, 0x0

    .line 269
    const/4 v6, 0x0

    .line 270
    const/4 v14, 0x0

    .line 271
    const/16 v19, 0x0

    .line 272
    .line 273
    :goto_c
    iget v1, v1, Lw/f;->g:I

    .line 274
    .line 275
    if-eqz v3, :cond_15

    .line 276
    .line 277
    iget v1, v2, Lw/f;->g:I

    .line 278
    .line 279
    :cond_15
    const/high16 v2, 0x3f000000    # 0.5f

    .line 280
    .line 281
    if-le v14, v4, :cond_17

    .line 282
    .line 283
    const/high16 v8, 0x40000000    # 2.0f

    .line 284
    .line 285
    if-eqz v3, :cond_16

    .line 286
    .line 287
    sub-int v10, v14, v4

    .line 288
    .line 289
    int-to-float v10, v10

    .line 290
    div-float/2addr v10, v8

    .line 291
    add-float/2addr v10, v2

    .line 292
    float-to-int v8, v10

    .line 293
    add-int/2addr v1, v8

    .line 294
    goto :goto_d

    .line 295
    :cond_16
    sub-int v10, v14, v4

    .line 296
    .line 297
    int-to-float v10, v10

    .line 298
    div-float/2addr v10, v8

    .line 299
    add-float/2addr v10, v2

    .line 300
    float-to-int v8, v10

    .line 301
    sub-int/2addr v1, v8

    .line 302
    :cond_17
    :goto_d
    if-lez v5, :cond_26

    .line 303
    .line 304
    sub-int v8, v4, v14

    .line 305
    .line 306
    int-to-float v8, v8

    .line 307
    int-to-float v10, v5

    .line 308
    div-float v10, v8, v10

    .line 309
    .line 310
    add-float/2addr v10, v2

    .line 311
    float-to-int v10, v10

    .line 312
    const/4 v12, 0x0

    .line 313
    const/4 v13, 0x0

    .line 314
    :goto_e
    if-ge v12, v7, :cond_1f

    .line 315
    .line 316
    move-object/from16 v15, v21

    .line 317
    .line 318
    invoke-virtual {v15, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v17

    .line 322
    move-object/from16 v2, v17

    .line 323
    .line 324
    check-cast v2, Lw/o;

    .line 325
    .line 326
    move/from16 v17, v10

    .line 327
    .line 328
    iget-object v10, v2, Lw/o;->b:Lv/d;

    .line 329
    .line 330
    move/from16 v21, v14

    .line 331
    .line 332
    iget v14, v10, Lv/d;->g0:I

    .line 333
    .line 334
    move/from16 v22, v1

    .line 335
    .line 336
    const/16 v1, 0x8

    .line 337
    .line 338
    if-ne v14, v1, :cond_19

    .line 339
    .line 340
    :cond_18
    move/from16 v24, v3

    .line 341
    .line 342
    move/from16 v25, v8

    .line 343
    .line 344
    goto :goto_12

    .line 345
    :cond_19
    iget v1, v2, Lw/o;->d:I

    .line 346
    .line 347
    const/4 v14, 0x3

    .line 348
    if-ne v1, v14, :cond_18

    .line 349
    .line 350
    iget-object v1, v2, Lw/o;->e:Lw/g;

    .line 351
    .line 352
    iget-boolean v14, v1, Lw/f;->j:Z

    .line 353
    .line 354
    if-nez v14, :cond_18

    .line 355
    .line 356
    const/4 v14, 0x0

    .line 357
    cmpl-float v16, v19, v14

    .line 358
    .line 359
    if-lez v16, :cond_1a

    .line 360
    .line 361
    iget-object v14, v10, Lv/d;->k0:[F

    .line 362
    .line 363
    move/from16 v24, v3

    .line 364
    .line 365
    iget v3, v0, Lw/o;->f:I

    .line 366
    .line 367
    aget v3, v14, v3

    .line 368
    .line 369
    mul-float v3, v3, v8

    .line 370
    .line 371
    div-float v3, v3, v19

    .line 372
    .line 373
    const/high16 v14, 0x3f000000    # 0.5f

    .line 374
    .line 375
    add-float/2addr v3, v14

    .line 376
    float-to-int v3, v3

    .line 377
    goto :goto_f

    .line 378
    :cond_1a
    move/from16 v24, v3

    .line 379
    .line 380
    move/from16 v3, v17

    .line 381
    .line 382
    :goto_f
    iget v14, v0, Lw/o;->f:I

    .line 383
    .line 384
    if-nez v14, :cond_1b

    .line 385
    .line 386
    iget v14, v10, Lv/d;->v:I

    .line 387
    .line 388
    iget v10, v10, Lv/d;->u:I

    .line 389
    .line 390
    goto :goto_10

    .line 391
    :cond_1b
    iget v14, v10, Lv/d;->y:I

    .line 392
    .line 393
    iget v10, v10, Lv/d;->x:I

    .line 394
    .line 395
    :goto_10
    iget v2, v2, Lw/o;->a:I

    .line 396
    .line 397
    move/from16 v25, v8

    .line 398
    .line 399
    const/4 v8, 0x1

    .line 400
    if-ne v2, v8, :cond_1c

    .line 401
    .line 402
    iget v2, v1, Lw/g;->m:I

    .line 403
    .line 404
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    .line 405
    .line 406
    .line 407
    move-result v2

    .line 408
    goto :goto_11

    .line 409
    :cond_1c
    move v2, v3

    .line 410
    :goto_11
    invoke-static {v10, v2}, Ljava/lang/Math;->max(II)I

    .line 411
    .line 412
    .line 413
    move-result v2

    .line 414
    if-lez v14, :cond_1d

    .line 415
    .line 416
    invoke-static {v14, v2}, Ljava/lang/Math;->min(II)I

    .line 417
    .line 418
    .line 419
    move-result v2

    .line 420
    :cond_1d
    if-eq v2, v3, :cond_1e

    .line 421
    .line 422
    add-int/lit8 v13, v13, 0x1

    .line 423
    .line 424
    move v3, v2

    .line 425
    :cond_1e
    invoke-virtual {v1, v3}, Lw/g;->d(I)V

    .line 426
    .line 427
    .line 428
    :goto_12
    add-int/lit8 v12, v12, 0x1

    .line 429
    .line 430
    move/from16 v10, v17

    .line 431
    .line 432
    move/from16 v14, v21

    .line 433
    .line 434
    move/from16 v1, v22

    .line 435
    .line 436
    move/from16 v3, v24

    .line 437
    .line 438
    move/from16 v8, v25

    .line 439
    .line 440
    const/high16 v2, 0x3f000000    # 0.5f

    .line 441
    .line 442
    move-object/from16 v21, v15

    .line 443
    .line 444
    goto/16 :goto_e

    .line 445
    .line 446
    :cond_1f
    move/from16 v22, v1

    .line 447
    .line 448
    move/from16 v24, v3

    .line 449
    .line 450
    move-object/from16 v15, v21

    .line 451
    .line 452
    move/from16 v21, v14

    .line 453
    .line 454
    if-lez v13, :cond_24

    .line 455
    .line 456
    sub-int/2addr v5, v13

    .line 457
    const/4 v1, 0x0

    .line 458
    const/4 v14, 0x0

    .line 459
    :goto_13
    if-ge v1, v7, :cond_23

    .line 460
    .line 461
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    check-cast v2, Lw/o;

    .line 466
    .line 467
    iget-object v3, v2, Lw/o;->b:Lv/d;

    .line 468
    .line 469
    iget v3, v3, Lv/d;->g0:I

    .line 470
    .line 471
    const/16 v8, 0x8

    .line 472
    .line 473
    if-ne v3, v8, :cond_20

    .line 474
    .line 475
    move/from16 v8, v23

    .line 476
    .line 477
    goto :goto_14

    .line 478
    :cond_20
    move/from16 v8, v23

    .line 479
    .line 480
    if-lez v1, :cond_21

    .line 481
    .line 482
    if-lt v1, v8, :cond_21

    .line 483
    .line 484
    iget-object v3, v2, Lw/o;->h:Lw/f;

    .line 485
    .line 486
    iget v3, v3, Lw/f;->f:I

    .line 487
    .line 488
    add-int/2addr v14, v3

    .line 489
    :cond_21
    iget-object v3, v2, Lw/o;->e:Lw/g;

    .line 490
    .line 491
    iget v3, v3, Lw/f;->g:I

    .line 492
    .line 493
    add-int/2addr v14, v3

    .line 494
    if-ge v1, v11, :cond_22

    .line 495
    .line 496
    if-ge v1, v9, :cond_22

    .line 497
    .line 498
    iget-object v2, v2, Lw/o;->i:Lw/f;

    .line 499
    .line 500
    iget v2, v2, Lw/f;->f:I

    .line 501
    .line 502
    neg-int v2, v2

    .line 503
    add-int/2addr v14, v2

    .line 504
    :cond_22
    :goto_14
    add-int/lit8 v1, v1, 0x1

    .line 505
    .line 506
    move/from16 v23, v8

    .line 507
    .line 508
    goto :goto_13

    .line 509
    :cond_23
    move/from16 v8, v23

    .line 510
    .line 511
    goto :goto_15

    .line 512
    :cond_24
    move/from16 v8, v23

    .line 513
    .line 514
    move/from16 v14, v21

    .line 515
    .line 516
    :goto_15
    iget v1, v0, Lw/c;->l:I

    .line 517
    .line 518
    const/4 v2, 0x2

    .line 519
    if-ne v1, v2, :cond_25

    .line 520
    .line 521
    if-nez v13, :cond_25

    .line 522
    .line 523
    const/4 v1, 0x0

    .line 524
    iput v1, v0, Lw/c;->l:I

    .line 525
    .line 526
    goto :goto_16

    .line 527
    :cond_25
    const/4 v1, 0x0

    .line 528
    goto :goto_16

    .line 529
    :cond_26
    move/from16 v22, v1

    .line 530
    .line 531
    move/from16 v24, v3

    .line 532
    .line 533
    move-object/from16 v15, v21

    .line 534
    .line 535
    move/from16 v8, v23

    .line 536
    .line 537
    const/4 v1, 0x0

    .line 538
    const/4 v2, 0x2

    .line 539
    move/from16 v21, v14

    .line 540
    .line 541
    :goto_16
    if-le v14, v4, :cond_27

    .line 542
    .line 543
    iput v2, v0, Lw/c;->l:I

    .line 544
    .line 545
    :cond_27
    if-lez v6, :cond_28

    .line 546
    .line 547
    if-nez v5, :cond_28

    .line 548
    .line 549
    if-ne v8, v9, :cond_28

    .line 550
    .line 551
    iput v2, v0, Lw/c;->l:I

    .line 552
    .line 553
    :cond_28
    iget v2, v0, Lw/c;->l:I

    .line 554
    .line 555
    const/4 v3, 0x1

    .line 556
    if-ne v2, v3, :cond_38

    .line 557
    .line 558
    if-le v6, v3, :cond_29

    .line 559
    .line 560
    sub-int/2addr v4, v14

    .line 561
    sub-int/2addr v6, v3

    .line 562
    div-int/2addr v4, v6

    .line 563
    goto :goto_17

    .line 564
    :cond_29
    if-ne v6, v3, :cond_2a

    .line 565
    .line 566
    sub-int/2addr v4, v14

    .line 567
    const/4 v2, 0x2

    .line 568
    div-int/2addr v4, v2

    .line 569
    goto :goto_17

    .line 570
    :cond_2a
    const/4 v4, 0x0

    .line 571
    :goto_17
    if-lez v5, :cond_2b

    .line 572
    .line 573
    const/4 v4, 0x0

    .line 574
    :cond_2b
    move/from16 v1, v22

    .line 575
    .line 576
    const/4 v5, 0x0

    .line 577
    :goto_18
    if-ge v5, v7, :cond_56

    .line 578
    .line 579
    if-eqz v24, :cond_2c

    .line 580
    .line 581
    add-int/lit8 v2, v5, 0x1

    .line 582
    .line 583
    sub-int v2, v7, v2

    .line 584
    .line 585
    goto :goto_19

    .line 586
    :cond_2c
    move v2, v5

    .line 587
    :goto_19
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    check-cast v2, Lw/o;

    .line 592
    .line 593
    iget-object v3, v2, Lw/o;->b:Lv/d;

    .line 594
    .line 595
    iget v3, v3, Lv/d;->g0:I

    .line 596
    .line 597
    iget-object v6, v2, Lw/o;->i:Lw/f;

    .line 598
    .line 599
    iget-object v10, v2, Lw/o;->h:Lw/f;

    .line 600
    .line 601
    const/16 v12, 0x8

    .line 602
    .line 603
    if-ne v3, v12, :cond_2d

    .line 604
    .line 605
    invoke-virtual {v10, v1}, Lw/f;->d(I)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v6, v1}, Lw/f;->d(I)V

    .line 609
    .line 610
    .line 611
    goto :goto_20

    .line 612
    :cond_2d
    if-lez v5, :cond_2f

    .line 613
    .line 614
    if-eqz v24, :cond_2e

    .line 615
    .line 616
    sub-int/2addr v1, v4

    .line 617
    goto :goto_1a

    .line 618
    :cond_2e
    add-int/2addr v1, v4

    .line 619
    :cond_2f
    :goto_1a
    if-lez v5, :cond_31

    .line 620
    .line 621
    if-lt v5, v8, :cond_31

    .line 622
    .line 623
    if-eqz v24, :cond_30

    .line 624
    .line 625
    iget v3, v10, Lw/f;->f:I

    .line 626
    .line 627
    sub-int/2addr v1, v3

    .line 628
    goto :goto_1b

    .line 629
    :cond_30
    iget v3, v10, Lw/f;->f:I

    .line 630
    .line 631
    add-int/2addr v1, v3

    .line 632
    :cond_31
    :goto_1b
    if-eqz v24, :cond_32

    .line 633
    .line 634
    invoke-virtual {v6, v1}, Lw/f;->d(I)V

    .line 635
    .line 636
    .line 637
    goto :goto_1c

    .line 638
    :cond_32
    invoke-virtual {v10, v1}, Lw/f;->d(I)V

    .line 639
    .line 640
    .line 641
    :goto_1c
    iget-object v3, v2, Lw/o;->e:Lw/g;

    .line 642
    .line 643
    iget v12, v3, Lw/f;->g:I

    .line 644
    .line 645
    iget v13, v2, Lw/o;->d:I

    .line 646
    .line 647
    const/4 v14, 0x3

    .line 648
    if-ne v13, v14, :cond_33

    .line 649
    .line 650
    iget v13, v2, Lw/o;->a:I

    .line 651
    .line 652
    const/4 v14, 0x1

    .line 653
    if-ne v13, v14, :cond_33

    .line 654
    .line 655
    iget v12, v3, Lw/g;->m:I

    .line 656
    .line 657
    :cond_33
    if-eqz v24, :cond_34

    .line 658
    .line 659
    sub-int/2addr v1, v12

    .line 660
    goto :goto_1d

    .line 661
    :cond_34
    add-int/2addr v1, v12

    .line 662
    :goto_1d
    if-eqz v24, :cond_35

    .line 663
    .line 664
    invoke-virtual {v10, v1}, Lw/f;->d(I)V

    .line 665
    .line 666
    .line 667
    :goto_1e
    const/4 v3, 0x1

    .line 668
    goto :goto_1f

    .line 669
    :cond_35
    invoke-virtual {v6, v1}, Lw/f;->d(I)V

    .line 670
    .line 671
    .line 672
    goto :goto_1e

    .line 673
    :goto_1f
    iput-boolean v3, v2, Lw/o;->g:Z

    .line 674
    .line 675
    if-ge v5, v11, :cond_37

    .line 676
    .line 677
    if-ge v5, v9, :cond_37

    .line 678
    .line 679
    if-eqz v24, :cond_36

    .line 680
    .line 681
    iget v2, v6, Lw/f;->f:I

    .line 682
    .line 683
    neg-int v2, v2

    .line 684
    sub-int/2addr v1, v2

    .line 685
    goto :goto_20

    .line 686
    :cond_36
    iget v2, v6, Lw/f;->f:I

    .line 687
    .line 688
    neg-int v2, v2

    .line 689
    add-int/2addr v1, v2

    .line 690
    :cond_37
    :goto_20
    add-int/lit8 v5, v5, 0x1

    .line 691
    .line 692
    goto :goto_18

    .line 693
    :cond_38
    if-nez v2, :cond_45

    .line 694
    .line 695
    sub-int/2addr v4, v14

    .line 696
    const/4 v2, 0x1

    .line 697
    add-int/2addr v6, v2

    .line 698
    div-int/2addr v4, v6

    .line 699
    if-lez v5, :cond_39

    .line 700
    .line 701
    const/4 v4, 0x0

    .line 702
    :cond_39
    move/from16 v1, v22

    .line 703
    .line 704
    const/4 v5, 0x0

    .line 705
    :goto_21
    if-ge v5, v7, :cond_56

    .line 706
    .line 707
    if-eqz v24, :cond_3a

    .line 708
    .line 709
    add-int/lit8 v2, v5, 0x1

    .line 710
    .line 711
    sub-int v2, v7, v2

    .line 712
    .line 713
    goto :goto_22

    .line 714
    :cond_3a
    move v2, v5

    .line 715
    :goto_22
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v2

    .line 719
    check-cast v2, Lw/o;

    .line 720
    .line 721
    iget-object v3, v2, Lw/o;->b:Lv/d;

    .line 722
    .line 723
    iget v3, v3, Lv/d;->g0:I

    .line 724
    .line 725
    iget-object v6, v2, Lw/o;->i:Lw/f;

    .line 726
    .line 727
    iget-object v10, v2, Lw/o;->h:Lw/f;

    .line 728
    .line 729
    const/16 v12, 0x8

    .line 730
    .line 731
    if-ne v3, v12, :cond_3b

    .line 732
    .line 733
    invoke-virtual {v10, v1}, Lw/f;->d(I)V

    .line 734
    .line 735
    .line 736
    invoke-virtual {v6, v1}, Lw/f;->d(I)V

    .line 737
    .line 738
    .line 739
    goto :goto_28

    .line 740
    :cond_3b
    if-eqz v24, :cond_3c

    .line 741
    .line 742
    sub-int/2addr v1, v4

    .line 743
    goto :goto_23

    .line 744
    :cond_3c
    add-int/2addr v1, v4

    .line 745
    :goto_23
    if-lez v5, :cond_3e

    .line 746
    .line 747
    if-lt v5, v8, :cond_3e

    .line 748
    .line 749
    if-eqz v24, :cond_3d

    .line 750
    .line 751
    iget v3, v10, Lw/f;->f:I

    .line 752
    .line 753
    sub-int/2addr v1, v3

    .line 754
    goto :goto_24

    .line 755
    :cond_3d
    iget v3, v10, Lw/f;->f:I

    .line 756
    .line 757
    add-int/2addr v1, v3

    .line 758
    :cond_3e
    :goto_24
    if-eqz v24, :cond_3f

    .line 759
    .line 760
    invoke-virtual {v6, v1}, Lw/f;->d(I)V

    .line 761
    .line 762
    .line 763
    goto :goto_25

    .line 764
    :cond_3f
    invoke-virtual {v10, v1}, Lw/f;->d(I)V

    .line 765
    .line 766
    .line 767
    :goto_25
    iget-object v3, v2, Lw/o;->e:Lw/g;

    .line 768
    .line 769
    iget v12, v3, Lw/f;->g:I

    .line 770
    .line 771
    iget v13, v2, Lw/o;->d:I

    .line 772
    .line 773
    const/4 v14, 0x3

    .line 774
    if-ne v13, v14, :cond_40

    .line 775
    .line 776
    iget v2, v2, Lw/o;->a:I

    .line 777
    .line 778
    const/4 v13, 0x1

    .line 779
    if-ne v2, v13, :cond_40

    .line 780
    .line 781
    iget v2, v3, Lw/g;->m:I

    .line 782
    .line 783
    invoke-static {v12, v2}, Ljava/lang/Math;->min(II)I

    .line 784
    .line 785
    .line 786
    move-result v12

    .line 787
    :cond_40
    if-eqz v24, :cond_41

    .line 788
    .line 789
    sub-int/2addr v1, v12

    .line 790
    goto :goto_26

    .line 791
    :cond_41
    add-int/2addr v1, v12

    .line 792
    :goto_26
    if-eqz v24, :cond_42

    .line 793
    .line 794
    invoke-virtual {v10, v1}, Lw/f;->d(I)V

    .line 795
    .line 796
    .line 797
    goto :goto_27

    .line 798
    :cond_42
    invoke-virtual {v6, v1}, Lw/f;->d(I)V

    .line 799
    .line 800
    .line 801
    :goto_27
    if-ge v5, v11, :cond_44

    .line 802
    .line 803
    if-ge v5, v9, :cond_44

    .line 804
    .line 805
    if-eqz v24, :cond_43

    .line 806
    .line 807
    iget v2, v6, Lw/f;->f:I

    .line 808
    .line 809
    neg-int v2, v2

    .line 810
    sub-int/2addr v1, v2

    .line 811
    goto :goto_28

    .line 812
    :cond_43
    iget v2, v6, Lw/f;->f:I

    .line 813
    .line 814
    neg-int v2, v2

    .line 815
    add-int/2addr v1, v2

    .line 816
    :cond_44
    :goto_28
    add-int/lit8 v5, v5, 0x1

    .line 817
    .line 818
    goto :goto_21

    .line 819
    :cond_45
    const/4 v3, 0x2

    .line 820
    if-ne v2, v3, :cond_56

    .line 821
    .line 822
    iget v2, v0, Lw/o;->f:I

    .line 823
    .line 824
    if-nez v2, :cond_46

    .line 825
    .line 826
    iget-object v2, v0, Lw/o;->b:Lv/d;

    .line 827
    .line 828
    iget v2, v2, Lv/d;->d0:F

    .line 829
    .line 830
    goto :goto_29

    .line 831
    :cond_46
    iget-object v2, v0, Lw/o;->b:Lv/d;

    .line 832
    .line 833
    iget v2, v2, Lv/d;->e0:F

    .line 834
    .line 835
    :goto_29
    if-eqz v24, :cond_47

    .line 836
    .line 837
    const/high16 v3, 0x3f800000    # 1.0f

    .line 838
    .line 839
    sub-float v2, v3, v2

    .line 840
    .line 841
    :cond_47
    sub-int/2addr v4, v14

    .line 842
    int-to-float v3, v4

    .line 843
    mul-float v3, v3, v2

    .line 844
    .line 845
    const/high16 v2, 0x3f000000    # 0.5f

    .line 846
    .line 847
    add-float/2addr v3, v2

    .line 848
    float-to-int v2, v3

    .line 849
    if-ltz v2, :cond_48

    .line 850
    .line 851
    if-lez v5, :cond_49

    .line 852
    .line 853
    :cond_48
    const/4 v2, 0x0

    .line 854
    :cond_49
    if-eqz v24, :cond_4a

    .line 855
    .line 856
    sub-int v2, v22, v2

    .line 857
    .line 858
    goto :goto_2a

    .line 859
    :cond_4a
    add-int v2, v22, v2

    .line 860
    .line 861
    :goto_2a
    const/4 v5, 0x0

    .line 862
    :goto_2b
    if-ge v5, v7, :cond_56

    .line 863
    .line 864
    if-eqz v24, :cond_4b

    .line 865
    .line 866
    add-int/lit8 v1, v5, 0x1

    .line 867
    .line 868
    sub-int v1, v7, v1

    .line 869
    .line 870
    goto :goto_2c

    .line 871
    :cond_4b
    move v1, v5

    .line 872
    :goto_2c
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 873
    .line 874
    .line 875
    move-result-object v1

    .line 876
    check-cast v1, Lw/o;

    .line 877
    .line 878
    iget-object v3, v1, Lw/o;->b:Lv/d;

    .line 879
    .line 880
    iget v3, v3, Lv/d;->g0:I

    .line 881
    .line 882
    iget-object v4, v1, Lw/o;->i:Lw/f;

    .line 883
    .line 884
    iget-object v6, v1, Lw/o;->h:Lw/f;

    .line 885
    .line 886
    const/16 v10, 0x8

    .line 887
    .line 888
    if-ne v3, v10, :cond_4c

    .line 889
    .line 890
    invoke-virtual {v6, v2}, Lw/f;->d(I)V

    .line 891
    .line 892
    .line 893
    invoke-virtual {v4, v2}, Lw/f;->d(I)V

    .line 894
    .line 895
    .line 896
    const/4 v13, 0x1

    .line 897
    const/4 v14, 0x3

    .line 898
    goto :goto_32

    .line 899
    :cond_4c
    if-lez v5, :cond_4e

    .line 900
    .line 901
    if-lt v5, v8, :cond_4e

    .line 902
    .line 903
    if-eqz v24, :cond_4d

    .line 904
    .line 905
    iget v3, v6, Lw/f;->f:I

    .line 906
    .line 907
    sub-int/2addr v2, v3

    .line 908
    goto :goto_2d

    .line 909
    :cond_4d
    iget v3, v6, Lw/f;->f:I

    .line 910
    .line 911
    add-int/2addr v2, v3

    .line 912
    :cond_4e
    :goto_2d
    if-eqz v24, :cond_4f

    .line 913
    .line 914
    invoke-virtual {v4, v2}, Lw/f;->d(I)V

    .line 915
    .line 916
    .line 917
    goto :goto_2e

    .line 918
    :cond_4f
    invoke-virtual {v6, v2}, Lw/f;->d(I)V

    .line 919
    .line 920
    .line 921
    :goto_2e
    iget-object v3, v1, Lw/o;->e:Lw/g;

    .line 922
    .line 923
    iget v12, v3, Lw/f;->g:I

    .line 924
    .line 925
    iget v13, v1, Lw/o;->d:I

    .line 926
    .line 927
    const/4 v14, 0x3

    .line 928
    if-ne v13, v14, :cond_50

    .line 929
    .line 930
    iget v1, v1, Lw/o;->a:I

    .line 931
    .line 932
    const/4 v13, 0x1

    .line 933
    if-ne v1, v13, :cond_51

    .line 934
    .line 935
    iget v12, v3, Lw/g;->m:I

    .line 936
    .line 937
    goto :goto_2f

    .line 938
    :cond_50
    const/4 v13, 0x1

    .line 939
    :cond_51
    :goto_2f
    if-eqz v24, :cond_52

    .line 940
    .line 941
    sub-int/2addr v2, v12

    .line 942
    goto :goto_30

    .line 943
    :cond_52
    add-int/2addr v2, v12

    .line 944
    :goto_30
    if-eqz v24, :cond_53

    .line 945
    .line 946
    invoke-virtual {v6, v2}, Lw/f;->d(I)V

    .line 947
    .line 948
    .line 949
    goto :goto_31

    .line 950
    :cond_53
    invoke-virtual {v4, v2}, Lw/f;->d(I)V

    .line 951
    .line 952
    .line 953
    :goto_31
    if-ge v5, v11, :cond_55

    .line 954
    .line 955
    if-ge v5, v9, :cond_55

    .line 956
    .line 957
    if-eqz v24, :cond_54

    .line 958
    .line 959
    iget v1, v4, Lw/f;->f:I

    .line 960
    .line 961
    neg-int v1, v1

    .line 962
    sub-int/2addr v2, v1

    .line 963
    goto :goto_32

    .line 964
    :cond_54
    iget v1, v4, Lw/f;->f:I

    .line 965
    .line 966
    neg-int v1, v1

    .line 967
    add-int/2addr v2, v1

    .line 968
    :cond_55
    :goto_32
    add-int/lit8 v5, v5, 0x1

    .line 969
    .line 970
    goto :goto_2b

    .line 971
    :cond_56
    :goto_33
    return-void
.end method

.method public final d()V
    .locals 7

    .line 1
    iget-object v0, p0, Lw/c;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lw/o;

    .line 18
    .line 19
    invoke-virtual {v2}, Lw/o;->d()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v2, 0x1

    .line 28
    if-ge v1, v2, :cond_1

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    const/4 v3, 0x0

    .line 32
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Lw/o;

    .line 37
    .line 38
    iget-object v4, v4, Lw/o;->b:Lv/d;

    .line 39
    .line 40
    sub-int/2addr v1, v2

    .line 41
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lw/o;

    .line 46
    .line 47
    iget-object v0, v0, Lw/o;->b:Lv/d;

    .line 48
    .line 49
    iget v1, p0, Lw/o;->f:I

    .line 50
    .line 51
    iget-object v5, p0, Lw/o;->i:Lw/f;

    .line 52
    .line 53
    iget-object v6, p0, Lw/o;->h:Lw/f;

    .line 54
    .line 55
    if-nez v1, :cond_5

    .line 56
    .line 57
    iget-object v1, v4, Lv/d;->I:Lv/c;

    .line 58
    .line 59
    iget-object v0, v0, Lv/d;->K:Lv/c;

    .line 60
    .line 61
    invoke-static {v1, v3}, Lw/o;->i(Lv/c;I)Lw/f;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v1}, Lv/c;->e()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-virtual {p0}, Lw/c;->m()Lv/d;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    if-eqz v4, :cond_2

    .line 74
    .line 75
    iget-object v1, v4, Lv/d;->I:Lv/c;

    .line 76
    .line 77
    invoke-virtual {v1}, Lv/c;->e()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    :cond_2
    if-eqz v2, :cond_3

    .line 82
    .line 83
    invoke-static {v6, v2, v1}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 84
    .line 85
    .line 86
    :cond_3
    invoke-static {v0, v3}, Lw/o;->i(Lv/c;I)Lw/f;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v0}, Lv/c;->e()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    invoke-virtual {p0}, Lw/c;->n()Lv/d;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    if-eqz v2, :cond_4

    .line 99
    .line 100
    iget-object v0, v2, Lv/d;->K:Lv/c;

    .line 101
    .line 102
    invoke-virtual {v0}, Lv/c;->e()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    :cond_4
    if-eqz v1, :cond_9

    .line 107
    .line 108
    neg-int v0, v0

    .line 109
    invoke-static {v5, v1, v0}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_5
    iget-object v1, v4, Lv/d;->J:Lv/c;

    .line 114
    .line 115
    iget-object v0, v0, Lv/d;->L:Lv/c;

    .line 116
    .line 117
    invoke-static {v1, v2}, Lw/o;->i(Lv/c;I)Lw/f;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-virtual {v1}, Lv/c;->e()I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    invoke-virtual {p0}, Lw/c;->m()Lv/d;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    if-eqz v4, :cond_6

    .line 130
    .line 131
    iget-object v1, v4, Lv/d;->J:Lv/c;

    .line 132
    .line 133
    invoke-virtual {v1}, Lv/c;->e()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    :cond_6
    if-eqz v3, :cond_7

    .line 138
    .line 139
    invoke-static {v6, v3, v1}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 140
    .line 141
    .line 142
    :cond_7
    invoke-static {v0, v2}, Lw/o;->i(Lv/c;I)Lw/f;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-virtual {v0}, Lv/c;->e()I

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    invoke-virtual {p0}, Lw/c;->n()Lv/d;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    if-eqz v2, :cond_8

    .line 155
    .line 156
    iget-object v0, v2, Lv/d;->L:Lv/c;

    .line 157
    .line 158
    invoke-virtual {v0}, Lv/c;->e()I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    :cond_8
    if-eqz v1, :cond_9

    .line 163
    .line 164
    neg-int v0, v0

    .line 165
    invoke-static {v5, v1, v0}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 166
    .line 167
    .line 168
    :cond_9
    :goto_1
    iput-object p0, v6, Lw/f;->a:Lw/o;

    .line 169
    .line 170
    iput-object p0, v5, Lw/f;->a:Lw/o;

    .line 171
    .line 172
    return-void
.end method

.method public final e()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lw/c;->k:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-ge v0, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lw/o;

    .line 15
    .line 16
    invoke-virtual {v1}, Lw/o;->e()V

    .line 17
    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method

.method public final f()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lw/o;->c:Lw/l;

    .line 3
    .line 4
    iget-object v0, p0, Lw/c;->k:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lw/o;

    .line 21
    .line 22
    invoke-virtual {v1}, Lw/o;->f()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method public final j()J
    .locals 8

    .line 1
    iget-object v0, p0, Lw/c;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    :goto_0
    if-ge v4, v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    check-cast v5, Lw/o;

    .line 17
    .line 18
    iget-object v6, v5, Lw/o;->h:Lw/f;

    .line 19
    .line 20
    iget v6, v6, Lw/f;->f:I

    .line 21
    .line 22
    int-to-long v6, v6

    .line 23
    add-long/2addr v2, v6

    .line 24
    invoke-virtual {v5}, Lw/o;->j()J

    .line 25
    .line 26
    .line 27
    move-result-wide v6

    .line 28
    add-long/2addr v6, v2

    .line 29
    iget-object v2, v5, Lw/o;->i:Lw/f;

    .line 30
    .line 31
    iget v2, v2, Lw/f;->f:I

    .line 32
    .line 33
    int-to-long v2, v2

    .line 34
    add-long/2addr v2, v6

    .line 35
    add-int/lit8 v4, v4, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-wide v2
.end method

.method public final k()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lw/c;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    :goto_0
    if-ge v3, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Lw/o;

    .line 16
    .line 17
    invoke-virtual {v4}, Lw/o;->k()Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-nez v4, :cond_0

    .line 22
    .line 23
    return v2

    .line 24
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v0, 0x1

    .line 28
    return v0
.end method

.method public final m()Lv/d;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lw/c;->k:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-ge v0, v2, :cond_1

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lw/o;

    .line 15
    .line 16
    iget-object v1, v1, Lw/o;->b:Lv/d;

    .line 17
    .line 18
    iget v2, v1, Lv/d;->g0:I

    .line 19
    .line 20
    const/16 v3, 0x8

    .line 21
    .line 22
    if-eq v2, v3, :cond_0

    .line 23
    .line 24
    return-object v1

    .line 25
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 v0, 0x0

    .line 29
    return-object v0
.end method

.method public final n()Lv/d;
    .locals 5

    .line 1
    iget-object v0, p0, Lw/c;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    :goto_0
    if-ltz v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Lw/o;

    .line 16
    .line 17
    iget-object v2, v2, Lw/o;->b:Lv/d;

    .line 18
    .line 19
    iget v3, v2, Lv/d;->g0:I

    .line 20
    .line 21
    const/16 v4, 0x8

    .line 22
    .line 23
    if-eq v3, v4, :cond_0

    .line 24
    .line 25
    return-object v2

    .line 26
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v0, 0x0

    .line 30
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ChainRun "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lw/o;->f:I

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    const-string v1, "horizontal : "

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v1, "vertical : "

    .line 16
    .line 17
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lw/c;->k:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Lw/o;

    .line 37
    .line 38
    const-string v3, "<"

    .line 39
    .line 40
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v2, "> "

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0
.end method
