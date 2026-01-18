.class public final Lw/m;
.super Lw/o;
.source "SourceFile"


# instance fields
.field public k:Lw/f;

.field public l:Lw/a;


# virtual methods
.method public final a(Lw/d;)V
    .locals 10

    .line 1
    iget p1, p0, Lw/o;->j:I

    .line 2
    .line 3
    invoke-static {p1}, Lt/e;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x1

    .line 8
    const/4 v1, 0x3

    .line 9
    if-eq p1, v1, :cond_e

    .line 10
    .line 11
    iget-object p1, p0, Lw/o;->e:Lw/g;

    .line 12
    .line 13
    iget-boolean v2, p1, Lw/f;->c:Z

    .line 14
    .line 15
    const/high16 v3, 0x3f000000    # 0.5f

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    if-eqz v2, :cond_5

    .line 19
    .line 20
    iget-boolean v2, p1, Lw/f;->j:Z

    .line 21
    .line 22
    if-nez v2, :cond_5

    .line 23
    .line 24
    iget v2, p0, Lw/o;->d:I

    .line 25
    .line 26
    if-ne v2, v1, :cond_5

    .line 27
    .line 28
    iget-object v2, p0, Lw/o;->b:Lv/d;

    .line 29
    .line 30
    iget v5, v2, Lv/d;->s:I

    .line 31
    .line 32
    const/4 v6, 0x2

    .line 33
    if-eq v5, v6, :cond_4

    .line 34
    .line 35
    if-eq v5, v1, :cond_0

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_0
    iget-object v5, v2, Lv/d;->d:Lw/k;

    .line 39
    .line 40
    iget-object v5, v5, Lw/o;->e:Lw/g;

    .line 41
    .line 42
    iget-boolean v6, v5, Lw/f;->j:Z

    .line 43
    .line 44
    if-eqz v6, :cond_5

    .line 45
    .line 46
    iget v6, v2, Lv/d;->X:I

    .line 47
    .line 48
    const/4 v7, -0x1

    .line 49
    if-eq v6, v7, :cond_3

    .line 50
    .line 51
    if-eqz v6, :cond_2

    .line 52
    .line 53
    if-eq v6, v0, :cond_1

    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    goto :goto_2

    .line 57
    :cond_1
    iget v5, v5, Lw/f;->g:I

    .line 58
    .line 59
    int-to-float v5, v5

    .line 60
    iget v2, v2, Lv/d;->W:F

    .line 61
    .line 62
    :goto_0
    div-float/2addr v5, v2

    .line 63
    :goto_1
    add-float/2addr v5, v3

    .line 64
    float-to-int v2, v5

    .line 65
    goto :goto_2

    .line 66
    :cond_2
    iget v5, v5, Lw/f;->g:I

    .line 67
    .line 68
    int-to-float v5, v5

    .line 69
    iget v2, v2, Lv/d;->W:F

    .line 70
    .line 71
    mul-float v5, v5, v2

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    iget v5, v5, Lw/f;->g:I

    .line 75
    .line 76
    int-to-float v5, v5

    .line 77
    iget v2, v2, Lv/d;->W:F

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :goto_2
    invoke-virtual {p1, v2}, Lw/g;->d(I)V

    .line 81
    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_4
    iget-object v5, v2, Lv/d;->T:Lv/d;

    .line 85
    .line 86
    if-eqz v5, :cond_5

    .line 87
    .line 88
    iget-object v5, v5, Lv/d;->e:Lw/m;

    .line 89
    .line 90
    iget-object v5, v5, Lw/o;->e:Lw/g;

    .line 91
    .line 92
    iget-boolean v6, v5, Lw/f;->j:Z

    .line 93
    .line 94
    if-eqz v6, :cond_5

    .line 95
    .line 96
    iget v2, v2, Lv/d;->z:F

    .line 97
    .line 98
    iget v5, v5, Lw/f;->g:I

    .line 99
    .line 100
    int-to-float v5, v5

    .line 101
    mul-float v5, v5, v2

    .line 102
    .line 103
    add-float/2addr v5, v3

    .line 104
    float-to-int v2, v5

    .line 105
    invoke-virtual {p1, v2}, Lw/g;->d(I)V

    .line 106
    .line 107
    .line 108
    :cond_5
    :goto_3
    iget-object v2, p0, Lw/o;->h:Lw/f;

    .line 109
    .line 110
    iget-boolean v5, v2, Lw/f;->c:Z

    .line 111
    .line 112
    if-eqz v5, :cond_d

    .line 113
    .line 114
    iget-object v5, p0, Lw/o;->i:Lw/f;

    .line 115
    .line 116
    iget-boolean v6, v5, Lw/f;->c:Z

    .line 117
    .line 118
    if-nez v6, :cond_6

    .line 119
    .line 120
    goto/16 :goto_6

    .line 121
    .line 122
    :cond_6
    iget-boolean v6, v2, Lw/f;->j:Z

    .line 123
    .line 124
    if-eqz v6, :cond_7

    .line 125
    .line 126
    iget-boolean v6, v5, Lw/f;->j:Z

    .line 127
    .line 128
    if-eqz v6, :cond_7

    .line 129
    .line 130
    iget-boolean v6, p1, Lw/f;->j:Z

    .line 131
    .line 132
    if-eqz v6, :cond_7

    .line 133
    .line 134
    return-void

    .line 135
    :cond_7
    iget-boolean v6, p1, Lw/f;->j:Z

    .line 136
    .line 137
    if-nez v6, :cond_8

    .line 138
    .line 139
    iget v6, p0, Lw/o;->d:I

    .line 140
    .line 141
    if-ne v6, v1, :cond_8

    .line 142
    .line 143
    iget-object v6, p0, Lw/o;->b:Lv/d;

    .line 144
    .line 145
    iget v7, v6, Lv/d;->r:I

    .line 146
    .line 147
    if-nez v7, :cond_8

    .line 148
    .line 149
    invoke-virtual {v6}, Lv/d;->y()Z

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    if-nez v6, :cond_8

    .line 154
    .line 155
    iget-object v0, v2, Lw/f;->l:Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    check-cast v0, Lw/f;

    .line 162
    .line 163
    iget-object v1, v5, Lw/f;->l:Ljava/util/ArrayList;

    .line 164
    .line 165
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    check-cast v1, Lw/f;

    .line 170
    .line 171
    iget v0, v0, Lw/f;->g:I

    .line 172
    .line 173
    iget v3, v2, Lw/f;->f:I

    .line 174
    .line 175
    add-int/2addr v0, v3

    .line 176
    iget v1, v1, Lw/f;->g:I

    .line 177
    .line 178
    iget v3, v5, Lw/f;->f:I

    .line 179
    .line 180
    add-int/2addr v1, v3

    .line 181
    sub-int v3, v1, v0

    .line 182
    .line 183
    invoke-virtual {v2, v0}, Lw/f;->d(I)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v5, v1}, Lw/f;->d(I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1, v3}, Lw/g;->d(I)V

    .line 190
    .line 191
    .line 192
    return-void

    .line 193
    :cond_8
    iget-boolean v6, p1, Lw/f;->j:Z

    .line 194
    .line 195
    if-nez v6, :cond_a

    .line 196
    .line 197
    iget v6, p0, Lw/o;->d:I

    .line 198
    .line 199
    if-ne v6, v1, :cond_a

    .line 200
    .line 201
    iget v1, p0, Lw/o;->a:I

    .line 202
    .line 203
    if-ne v1, v0, :cond_a

    .line 204
    .line 205
    iget-object v0, v2, Lw/f;->l:Ljava/util/ArrayList;

    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-lez v0, :cond_a

    .line 212
    .line 213
    iget-object v0, v5, Lw/f;->l:Ljava/util/ArrayList;

    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-lez v0, :cond_a

    .line 220
    .line 221
    iget-object v0, v2, Lw/f;->l:Ljava/util/ArrayList;

    .line 222
    .line 223
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    check-cast v0, Lw/f;

    .line 228
    .line 229
    iget-object v1, v5, Lw/f;->l:Ljava/util/ArrayList;

    .line 230
    .line 231
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    check-cast v1, Lw/f;

    .line 236
    .line 237
    iget v0, v0, Lw/f;->g:I

    .line 238
    .line 239
    iget v6, v2, Lw/f;->f:I

    .line 240
    .line 241
    add-int/2addr v0, v6

    .line 242
    iget v1, v1, Lw/f;->g:I

    .line 243
    .line 244
    iget v6, v5, Lw/f;->f:I

    .line 245
    .line 246
    add-int/2addr v1, v6

    .line 247
    sub-int/2addr v1, v0

    .line 248
    iget v0, p1, Lw/g;->m:I

    .line 249
    .line 250
    if-ge v1, v0, :cond_9

    .line 251
    .line 252
    invoke-virtual {p1, v1}, Lw/g;->d(I)V

    .line 253
    .line 254
    .line 255
    goto :goto_4

    .line 256
    :cond_9
    invoke-virtual {p1, v0}, Lw/g;->d(I)V

    .line 257
    .line 258
    .line 259
    :cond_a
    :goto_4
    iget-boolean v0, p1, Lw/f;->j:Z

    .line 260
    .line 261
    if-nez v0, :cond_b

    .line 262
    .line 263
    return-void

    .line 264
    :cond_b
    iget-object v0, v2, Lw/f;->l:Ljava/util/ArrayList;

    .line 265
    .line 266
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    if-lez v0, :cond_d

    .line 271
    .line 272
    iget-object v0, v5, Lw/f;->l:Ljava/util/ArrayList;

    .line 273
    .line 274
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    if-lez v0, :cond_d

    .line 279
    .line 280
    iget-object v0, v2, Lw/f;->l:Ljava/util/ArrayList;

    .line 281
    .line 282
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    check-cast v0, Lw/f;

    .line 287
    .line 288
    iget-object v1, v5, Lw/f;->l:Ljava/util/ArrayList;

    .line 289
    .line 290
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    check-cast v1, Lw/f;

    .line 295
    .line 296
    iget v4, v0, Lw/f;->g:I

    .line 297
    .line 298
    iget v6, v2, Lw/f;->f:I

    .line 299
    .line 300
    add-int/2addr v6, v4

    .line 301
    iget v7, v1, Lw/f;->g:I

    .line 302
    .line 303
    iget v8, v5, Lw/f;->f:I

    .line 304
    .line 305
    add-int/2addr v8, v7

    .line 306
    iget-object v9, p0, Lw/o;->b:Lv/d;

    .line 307
    .line 308
    iget v9, v9, Lv/d;->e0:F

    .line 309
    .line 310
    if-ne v0, v1, :cond_c

    .line 311
    .line 312
    const/high16 v9, 0x3f000000    # 0.5f

    .line 313
    .line 314
    goto :goto_5

    .line 315
    :cond_c
    move v4, v6

    .line 316
    move v7, v8

    .line 317
    :goto_5
    sub-int/2addr v7, v4

    .line 318
    iget v0, p1, Lw/f;->g:I

    .line 319
    .line 320
    sub-int/2addr v7, v0

    .line 321
    int-to-float v0, v4

    .line 322
    add-float/2addr v0, v3

    .line 323
    int-to-float v1, v7

    .line 324
    mul-float v1, v1, v9

    .line 325
    .line 326
    add-float/2addr v1, v0

    .line 327
    float-to-int v0, v1

    .line 328
    invoke-virtual {v2, v0}, Lw/f;->d(I)V

    .line 329
    .line 330
    .line 331
    iget v0, v2, Lw/f;->g:I

    .line 332
    .line 333
    iget p1, p1, Lw/f;->g:I

    .line 334
    .line 335
    add-int/2addr v0, p1

    .line 336
    invoke-virtual {v5, v0}, Lw/f;->d(I)V

    .line 337
    .line 338
    .line 339
    :cond_d
    :goto_6
    return-void

    .line 340
    :cond_e
    iget-object p1, p0, Lw/o;->b:Lv/d;

    .line 341
    .line 342
    iget-object v1, p1, Lv/d;->J:Lv/c;

    .line 343
    .line 344
    iget-object p1, p1, Lv/d;->L:Lv/c;

    .line 345
    .line 346
    invoke-virtual {p0, v1, p1, v0}, Lw/o;->l(Lv/c;Lv/c;I)V

    .line 347
    .line 348
    .line 349
    return-void
.end method

.method public final d()V
    .locals 14

    .line 1
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 2
    .line 3
    iget-boolean v1, v0, Lv/d;->a:Z

    .line 4
    .line 5
    iget-object v2, p0, Lw/o;->e:Lw/g;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lv/d;->k()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {v2, v0}, Lw/g;->d(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-boolean v0, v2, Lw/f;->j:Z

    .line 17
    .line 18
    iget-object v1, p0, Lw/o;->i:Lw/f;

    .line 19
    .line 20
    iget-object v3, p0, Lw/o;->h:Lw/f;

    .line 21
    .line 22
    const/4 v4, 0x3

    .line 23
    const/4 v5, 0x1

    .line 24
    const/4 v6, 0x4

    .line 25
    if-nez v0, :cond_3

    .line 26
    .line 27
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 28
    .line 29
    iget-object v7, v0, Lv/d;->p0:[I

    .line 30
    .line 31
    aget v7, v7, v5

    .line 32
    .line 33
    iput v7, p0, Lw/o;->d:I

    .line 34
    .line 35
    iget-boolean v0, v0, Lv/d;->E:Z

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    new-instance v0, Lw/a;

    .line 40
    .line 41
    invoke-direct {v0, p0}, Lw/g;-><init>(Lw/o;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lw/m;->l:Lw/a;

    .line 45
    .line 46
    :cond_1
    iget v0, p0, Lw/o;->d:I

    .line 47
    .line 48
    if-eq v0, v4, :cond_4

    .line 49
    .line 50
    if-ne v0, v6, :cond_2

    .line 51
    .line 52
    iget-object v7, p0, Lw/o;->b:Lv/d;

    .line 53
    .line 54
    iget-object v7, v7, Lv/d;->T:Lv/d;

    .line 55
    .line 56
    if-eqz v7, :cond_2

    .line 57
    .line 58
    iget-object v8, v7, Lv/d;->p0:[I

    .line 59
    .line 60
    aget v8, v8, v5

    .line 61
    .line 62
    if-ne v8, v5, :cond_2

    .line 63
    .line 64
    invoke-virtual {v7}, Lv/d;->k()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget-object v4, p0, Lw/o;->b:Lv/d;

    .line 69
    .line 70
    iget-object v4, v4, Lv/d;->J:Lv/c;

    .line 71
    .line 72
    invoke-virtual {v4}, Lv/c;->e()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    sub-int/2addr v0, v4

    .line 77
    iget-object v4, p0, Lw/o;->b:Lv/d;

    .line 78
    .line 79
    iget-object v4, v4, Lv/d;->L:Lv/c;

    .line 80
    .line 81
    invoke-virtual {v4}, Lv/c;->e()I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    sub-int/2addr v0, v4

    .line 86
    iget-object v4, v7, Lv/d;->e:Lw/m;

    .line 87
    .line 88
    iget-object v4, v4, Lw/o;->h:Lw/f;

    .line 89
    .line 90
    iget-object v5, p0, Lw/o;->b:Lv/d;

    .line 91
    .line 92
    iget-object v5, v5, Lv/d;->J:Lv/c;

    .line 93
    .line 94
    invoke-virtual {v5}, Lv/c;->e()I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    invoke-static {v3, v4, v5}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 99
    .line 100
    .line 101
    iget-object v3, v7, Lv/d;->e:Lw/m;

    .line 102
    .line 103
    iget-object v3, v3, Lw/o;->i:Lw/f;

    .line 104
    .line 105
    iget-object v4, p0, Lw/o;->b:Lv/d;

    .line 106
    .line 107
    iget-object v4, v4, Lv/d;->L:Lv/c;

    .line 108
    .line 109
    invoke-virtual {v4}, Lv/c;->e()I

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    neg-int v4, v4

    .line 114
    invoke-static {v1, v3, v4}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v0}, Lw/g;->d(I)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_2
    if-ne v0, v5, :cond_4

    .line 122
    .line 123
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 124
    .line 125
    invoke-virtual {v0}, Lv/d;->k()I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    invoke-virtual {v2, v0}, Lw/g;->d(I)V

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_3
    iget v0, p0, Lw/o;->d:I

    .line 134
    .line 135
    if-ne v0, v6, :cond_4

    .line 136
    .line 137
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 138
    .line 139
    iget-object v7, v0, Lv/d;->T:Lv/d;

    .line 140
    .line 141
    if-eqz v7, :cond_4

    .line 142
    .line 143
    iget-object v8, v7, Lv/d;->p0:[I

    .line 144
    .line 145
    aget v8, v8, v5

    .line 146
    .line 147
    if-ne v8, v5, :cond_4

    .line 148
    .line 149
    iget-object v2, v7, Lv/d;->e:Lw/m;

    .line 150
    .line 151
    iget-object v2, v2, Lw/o;->h:Lw/f;

    .line 152
    .line 153
    iget-object v0, v0, Lv/d;->J:Lv/c;

    .line 154
    .line 155
    invoke-virtual {v0}, Lv/c;->e()I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    invoke-static {v3, v2, v0}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 160
    .line 161
    .line 162
    iget-object v0, v7, Lv/d;->e:Lw/m;

    .line 163
    .line 164
    iget-object v0, v0, Lw/o;->i:Lw/f;

    .line 165
    .line 166
    iget-object v2, p0, Lw/o;->b:Lv/d;

    .line 167
    .line 168
    iget-object v2, v2, Lv/d;->L:Lv/c;

    .line 169
    .line 170
    invoke-virtual {v2}, Lv/c;->e()I

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    neg-int v2, v2

    .line 175
    invoke-static {v1, v0, v2}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :cond_4
    :goto_0
    iget-boolean v0, v2, Lw/f;->j:Z

    .line 180
    .line 181
    iget-object v7, p0, Lw/m;->k:Lw/f;

    .line 182
    .line 183
    const/4 v8, 0x0

    .line 184
    const/4 v9, 0x2

    .line 185
    if-eqz v0, :cond_d

    .line 186
    .line 187
    iget-object v10, p0, Lw/o;->b:Lv/d;

    .line 188
    .line 189
    iget-boolean v11, v10, Lv/d;->a:Z

    .line 190
    .line 191
    if-eqz v11, :cond_d

    .line 192
    .line 193
    iget-object v0, v10, Lv/d;->Q:[Lv/c;

    .line 194
    .line 195
    aget-object v11, v0, v9

    .line 196
    .line 197
    iget-object v12, v11, Lv/c;->f:Lv/c;

    .line 198
    .line 199
    if-eqz v12, :cond_8

    .line 200
    .line 201
    aget-object v13, v0, v4

    .line 202
    .line 203
    iget-object v13, v13, Lv/c;->f:Lv/c;

    .line 204
    .line 205
    if-eqz v13, :cond_8

    .line 206
    .line 207
    invoke-virtual {v10}, Lv/d;->y()Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-eqz v0, :cond_5

    .line 212
    .line 213
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 214
    .line 215
    iget-object v0, v0, Lv/d;->Q:[Lv/c;

    .line 216
    .line 217
    aget-object v0, v0, v9

    .line 218
    .line 219
    invoke-virtual {v0}, Lv/c;->e()I

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    iput v0, v3, Lw/f;->f:I

    .line 224
    .line 225
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 226
    .line 227
    iget-object v0, v0, Lv/d;->Q:[Lv/c;

    .line 228
    .line 229
    aget-object v0, v0, v4

    .line 230
    .line 231
    invoke-virtual {v0}, Lv/c;->e()I

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    neg-int v0, v0

    .line 236
    iput v0, v1, Lw/f;->f:I

    .line 237
    .line 238
    goto :goto_1

    .line 239
    :cond_5
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 240
    .line 241
    iget-object v0, v0, Lv/d;->Q:[Lv/c;

    .line 242
    .line 243
    aget-object v0, v0, v9

    .line 244
    .line 245
    invoke-static {v0}, Lw/o;->h(Lv/c;)Lw/f;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    if-eqz v0, :cond_6

    .line 250
    .line 251
    iget-object v2, p0, Lw/o;->b:Lv/d;

    .line 252
    .line 253
    iget-object v2, v2, Lv/d;->Q:[Lv/c;

    .line 254
    .line 255
    aget-object v2, v2, v9

    .line 256
    .line 257
    invoke-virtual {v2}, Lv/c;->e()I

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    invoke-static {v3, v0, v2}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 262
    .line 263
    .line 264
    :cond_6
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 265
    .line 266
    iget-object v0, v0, Lv/d;->Q:[Lv/c;

    .line 267
    .line 268
    aget-object v0, v0, v4

    .line 269
    .line 270
    invoke-static {v0}, Lw/o;->h(Lv/c;)Lw/f;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    if-eqz v0, :cond_7

    .line 275
    .line 276
    iget-object v2, p0, Lw/o;->b:Lv/d;

    .line 277
    .line 278
    iget-object v2, v2, Lv/d;->Q:[Lv/c;

    .line 279
    .line 280
    aget-object v2, v2, v4

    .line 281
    .line 282
    invoke-virtual {v2}, Lv/c;->e()I

    .line 283
    .line 284
    .line 285
    move-result v2

    .line 286
    neg-int v2, v2

    .line 287
    invoke-static {v1, v0, v2}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 288
    .line 289
    .line 290
    :cond_7
    iput-boolean v5, v3, Lw/f;->b:Z

    .line 291
    .line 292
    iput-boolean v5, v1, Lw/f;->b:Z

    .line 293
    .line 294
    :goto_1
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 295
    .line 296
    iget-boolean v1, v0, Lv/d;->E:Z

    .line 297
    .line 298
    if-eqz v1, :cond_1e

    .line 299
    .line 300
    iget v0, v0, Lv/d;->a0:I

    .line 301
    .line 302
    invoke-static {v7, v3, v0}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 303
    .line 304
    .line 305
    goto/16 :goto_5

    .line 306
    .line 307
    :cond_8
    if-eqz v12, :cond_9

    .line 308
    .line 309
    invoke-static {v11}, Lw/o;->h(Lv/c;)Lw/f;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    if-eqz v0, :cond_1e

    .line 314
    .line 315
    iget-object v4, p0, Lw/o;->b:Lv/d;

    .line 316
    .line 317
    iget-object v4, v4, Lv/d;->Q:[Lv/c;

    .line 318
    .line 319
    aget-object v4, v4, v9

    .line 320
    .line 321
    invoke-virtual {v4}, Lv/c;->e()I

    .line 322
    .line 323
    .line 324
    move-result v4

    .line 325
    invoke-static {v3, v0, v4}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 326
    .line 327
    .line 328
    iget v0, v2, Lw/f;->g:I

    .line 329
    .line 330
    invoke-static {v1, v3, v0}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 331
    .line 332
    .line 333
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 334
    .line 335
    iget-boolean v1, v0, Lv/d;->E:Z

    .line 336
    .line 337
    if-eqz v1, :cond_1e

    .line 338
    .line 339
    iget v0, v0, Lv/d;->a0:I

    .line 340
    .line 341
    invoke-static {v7, v3, v0}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 342
    .line 343
    .line 344
    goto/16 :goto_5

    .line 345
    .line 346
    :cond_9
    aget-object v5, v0, v4

    .line 347
    .line 348
    iget-object v9, v5, Lv/c;->f:Lv/c;

    .line 349
    .line 350
    if-eqz v9, :cond_b

    .line 351
    .line 352
    invoke-static {v5}, Lw/o;->h(Lv/c;)Lw/f;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    if-eqz v0, :cond_a

    .line 357
    .line 358
    iget-object v5, p0, Lw/o;->b:Lv/d;

    .line 359
    .line 360
    iget-object v5, v5, Lv/d;->Q:[Lv/c;

    .line 361
    .line 362
    aget-object v4, v5, v4

    .line 363
    .line 364
    invoke-virtual {v4}, Lv/c;->e()I

    .line 365
    .line 366
    .line 367
    move-result v4

    .line 368
    neg-int v4, v4

    .line 369
    invoke-static {v1, v0, v4}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 370
    .line 371
    .line 372
    iget v0, v2, Lw/f;->g:I

    .line 373
    .line 374
    neg-int v0, v0

    .line 375
    invoke-static {v3, v1, v0}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 376
    .line 377
    .line 378
    :cond_a
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 379
    .line 380
    iget-boolean v1, v0, Lv/d;->E:Z

    .line 381
    .line 382
    if-eqz v1, :cond_1e

    .line 383
    .line 384
    iget v0, v0, Lv/d;->a0:I

    .line 385
    .line 386
    invoke-static {v7, v3, v0}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 387
    .line 388
    .line 389
    goto/16 :goto_5

    .line 390
    .line 391
    :cond_b
    aget-object v0, v0, v6

    .line 392
    .line 393
    iget-object v4, v0, Lv/c;->f:Lv/c;

    .line 394
    .line 395
    if-eqz v4, :cond_c

    .line 396
    .line 397
    invoke-static {v0}, Lw/o;->h(Lv/c;)Lw/f;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    if-eqz v0, :cond_1e

    .line 402
    .line 403
    invoke-static {v7, v0, v8}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 404
    .line 405
    .line 406
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 407
    .line 408
    iget v0, v0, Lv/d;->a0:I

    .line 409
    .line 410
    neg-int v0, v0

    .line 411
    invoke-static {v3, v7, v0}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 412
    .line 413
    .line 414
    iget v0, v2, Lw/f;->g:I

    .line 415
    .line 416
    invoke-static {v1, v3, v0}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 417
    .line 418
    .line 419
    goto/16 :goto_5

    .line 420
    .line 421
    :cond_c
    instance-of v0, v10, Lv/i;

    .line 422
    .line 423
    if-nez v0, :cond_1e

    .line 424
    .line 425
    iget-object v0, v10, Lv/d;->T:Lv/d;

    .line 426
    .line 427
    if-eqz v0, :cond_1e

    .line 428
    .line 429
    const/4 v0, 0x7

    .line 430
    invoke-virtual {v10, v0}, Lv/d;->i(I)Lv/c;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    iget-object v0, v0, Lv/c;->f:Lv/c;

    .line 435
    .line 436
    if-nez v0, :cond_1e

    .line 437
    .line 438
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 439
    .line 440
    iget-object v4, v0, Lv/d;->T:Lv/d;

    .line 441
    .line 442
    iget-object v4, v4, Lv/d;->e:Lw/m;

    .line 443
    .line 444
    iget-object v4, v4, Lw/o;->h:Lw/f;

    .line 445
    .line 446
    invoke-virtual {v0}, Lv/d;->s()I

    .line 447
    .line 448
    .line 449
    move-result v0

    .line 450
    invoke-static {v3, v4, v0}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 451
    .line 452
    .line 453
    iget v0, v2, Lw/f;->g:I

    .line 454
    .line 455
    invoke-static {v1, v3, v0}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 456
    .line 457
    .line 458
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 459
    .line 460
    iget-boolean v1, v0, Lv/d;->E:Z

    .line 461
    .line 462
    if-eqz v1, :cond_1e

    .line 463
    .line 464
    iget v0, v0, Lv/d;->a0:I

    .line 465
    .line 466
    invoke-static {v7, v3, v0}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 467
    .line 468
    .line 469
    goto/16 :goto_5

    .line 470
    .line 471
    :cond_d
    if-nez v0, :cond_12

    .line 472
    .line 473
    iget v0, p0, Lw/o;->d:I

    .line 474
    .line 475
    if-ne v0, v4, :cond_12

    .line 476
    .line 477
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 478
    .line 479
    iget v10, v0, Lv/d;->s:I

    .line 480
    .line 481
    if-eq v10, v9, :cond_10

    .line 482
    .line 483
    if-eq v10, v4, :cond_e

    .line 484
    .line 485
    goto :goto_2

    .line 486
    :cond_e
    invoke-virtual {v0}, Lv/d;->y()Z

    .line 487
    .line 488
    .line 489
    move-result v0

    .line 490
    if-nez v0, :cond_13

    .line 491
    .line 492
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 493
    .line 494
    iget v10, v0, Lv/d;->r:I

    .line 495
    .line 496
    if-ne v10, v4, :cond_f

    .line 497
    .line 498
    goto :goto_2

    .line 499
    :cond_f
    iget-object v0, v0, Lv/d;->d:Lw/k;

    .line 500
    .line 501
    iget-object v0, v0, Lw/o;->e:Lw/g;

    .line 502
    .line 503
    iget-object v10, v2, Lw/f;->l:Ljava/util/ArrayList;

    .line 504
    .line 505
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 506
    .line 507
    .line 508
    iget-object v0, v0, Lw/f;->k:Ljava/util/ArrayList;

    .line 509
    .line 510
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    iput-boolean v5, v2, Lw/f;->b:Z

    .line 514
    .line 515
    iget-object v0, v2, Lw/f;->k:Ljava/util/ArrayList;

    .line 516
    .line 517
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    iget-object v0, v2, Lw/f;->k:Ljava/util/ArrayList;

    .line 521
    .line 522
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 523
    .line 524
    .line 525
    goto :goto_2

    .line 526
    :cond_10
    iget-object v0, v0, Lv/d;->T:Lv/d;

    .line 527
    .line 528
    if-nez v0, :cond_11

    .line 529
    .line 530
    goto :goto_2

    .line 531
    :cond_11
    iget-object v0, v0, Lv/d;->e:Lw/m;

    .line 532
    .line 533
    iget-object v0, v0, Lw/o;->e:Lw/g;

    .line 534
    .line 535
    iget-object v10, v2, Lw/f;->l:Ljava/util/ArrayList;

    .line 536
    .line 537
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 538
    .line 539
    .line 540
    iget-object v0, v0, Lw/f;->k:Ljava/util/ArrayList;

    .line 541
    .line 542
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 543
    .line 544
    .line 545
    iput-boolean v5, v2, Lw/f;->b:Z

    .line 546
    .line 547
    iget-object v0, v2, Lw/f;->k:Ljava/util/ArrayList;

    .line 548
    .line 549
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 550
    .line 551
    .line 552
    iget-object v0, v2, Lw/f;->k:Ljava/util/ArrayList;

    .line 553
    .line 554
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    goto :goto_2

    .line 558
    :cond_12
    invoke-virtual {v2, p0}, Lw/f;->b(Lw/o;)V

    .line 559
    .line 560
    .line 561
    :cond_13
    :goto_2
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 562
    .line 563
    iget-object v10, v0, Lv/d;->Q:[Lv/c;

    .line 564
    .line 565
    aget-object v11, v10, v9

    .line 566
    .line 567
    iget-object v12, v11, Lv/c;->f:Lv/c;

    .line 568
    .line 569
    if-eqz v12, :cond_17

    .line 570
    .line 571
    aget-object v13, v10, v4

    .line 572
    .line 573
    iget-object v13, v13, Lv/c;->f:Lv/c;

    .line 574
    .line 575
    if-eqz v13, :cond_17

    .line 576
    .line 577
    invoke-virtual {v0}, Lv/d;->y()Z

    .line 578
    .line 579
    .line 580
    move-result v0

    .line 581
    if-eqz v0, :cond_14

    .line 582
    .line 583
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 584
    .line 585
    iget-object v0, v0, Lv/d;->Q:[Lv/c;

    .line 586
    .line 587
    aget-object v0, v0, v9

    .line 588
    .line 589
    invoke-virtual {v0}, Lv/c;->e()I

    .line 590
    .line 591
    .line 592
    move-result v0

    .line 593
    iput v0, v3, Lw/f;->f:I

    .line 594
    .line 595
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 596
    .line 597
    iget-object v0, v0, Lv/d;->Q:[Lv/c;

    .line 598
    .line 599
    aget-object v0, v0, v4

    .line 600
    .line 601
    invoke-virtual {v0}, Lv/c;->e()I

    .line 602
    .line 603
    .line 604
    move-result v0

    .line 605
    neg-int v0, v0

    .line 606
    iput v0, v1, Lw/f;->f:I

    .line 607
    .line 608
    goto :goto_3

    .line 609
    :cond_14
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 610
    .line 611
    iget-object v0, v0, Lv/d;->Q:[Lv/c;

    .line 612
    .line 613
    aget-object v0, v0, v9

    .line 614
    .line 615
    invoke-static {v0}, Lw/o;->h(Lv/c;)Lw/f;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    iget-object v1, p0, Lw/o;->b:Lv/d;

    .line 620
    .line 621
    iget-object v1, v1, Lv/d;->Q:[Lv/c;

    .line 622
    .line 623
    aget-object v1, v1, v4

    .line 624
    .line 625
    invoke-static {v1}, Lw/o;->h(Lv/c;)Lw/f;

    .line 626
    .line 627
    .line 628
    move-result-object v1

    .line 629
    if-eqz v0, :cond_15

    .line 630
    .line 631
    invoke-virtual {v0, p0}, Lw/f;->b(Lw/o;)V

    .line 632
    .line 633
    .line 634
    :cond_15
    if-eqz v1, :cond_16

    .line 635
    .line 636
    invoke-virtual {v1, p0}, Lw/f;->b(Lw/o;)V

    .line 637
    .line 638
    .line 639
    :cond_16
    iput v6, p0, Lw/o;->j:I

    .line 640
    .line 641
    :goto_3
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 642
    .line 643
    iget-boolean v0, v0, Lv/d;->E:Z

    .line 644
    .line 645
    if-eqz v0, :cond_1d

    .line 646
    .line 647
    iget-object v0, p0, Lw/m;->l:Lw/a;

    .line 648
    .line 649
    invoke-virtual {p0, v7, v3, v5, v0}, Lw/o;->c(Lw/f;Lw/f;ILw/g;)V

    .line 650
    .line 651
    .line 652
    goto/16 :goto_4

    .line 653
    .line 654
    :cond_17
    const/4 v13, 0x0

    .line 655
    if-eqz v12, :cond_19

    .line 656
    .line 657
    invoke-static {v11}, Lw/o;->h(Lv/c;)Lw/f;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    if-eqz v0, :cond_1d

    .line 662
    .line 663
    iget-object v6, p0, Lw/o;->b:Lv/d;

    .line 664
    .line 665
    iget-object v6, v6, Lv/d;->Q:[Lv/c;

    .line 666
    .line 667
    aget-object v6, v6, v9

    .line 668
    .line 669
    invoke-virtual {v6}, Lv/c;->e()I

    .line 670
    .line 671
    .line 672
    move-result v6

    .line 673
    invoke-static {v3, v0, v6}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 674
    .line 675
    .line 676
    invoke-virtual {p0, v1, v3, v5, v2}, Lw/o;->c(Lw/f;Lw/f;ILw/g;)V

    .line 677
    .line 678
    .line 679
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 680
    .line 681
    iget-boolean v0, v0, Lv/d;->E:Z

    .line 682
    .line 683
    if-eqz v0, :cond_18

    .line 684
    .line 685
    iget-object v0, p0, Lw/m;->l:Lw/a;

    .line 686
    .line 687
    invoke-virtual {p0, v7, v3, v5, v0}, Lw/o;->c(Lw/f;Lw/f;ILw/g;)V

    .line 688
    .line 689
    .line 690
    :cond_18
    iget v0, p0, Lw/o;->d:I

    .line 691
    .line 692
    if-ne v0, v4, :cond_1d

    .line 693
    .line 694
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 695
    .line 696
    iget v1, v0, Lv/d;->W:F

    .line 697
    .line 698
    cmpl-float v1, v1, v13

    .line 699
    .line 700
    if-lez v1, :cond_1d

    .line 701
    .line 702
    iget-object v0, v0, Lv/d;->d:Lw/k;

    .line 703
    .line 704
    iget v1, v0, Lw/o;->d:I

    .line 705
    .line 706
    if-ne v1, v4, :cond_1d

    .line 707
    .line 708
    iget-object v0, v0, Lw/o;->e:Lw/g;

    .line 709
    .line 710
    iget-object v0, v0, Lw/f;->k:Ljava/util/ArrayList;

    .line 711
    .line 712
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 713
    .line 714
    .line 715
    iget-object v0, v2, Lw/f;->l:Ljava/util/ArrayList;

    .line 716
    .line 717
    iget-object v1, p0, Lw/o;->b:Lv/d;

    .line 718
    .line 719
    iget-object v1, v1, Lv/d;->d:Lw/k;

    .line 720
    .line 721
    iget-object v1, v1, Lw/o;->e:Lw/g;

    .line 722
    .line 723
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 724
    .line 725
    .line 726
    iput-object p0, v2, Lw/f;->a:Lw/o;

    .line 727
    .line 728
    goto/16 :goto_4

    .line 729
    .line 730
    :cond_19
    aget-object v9, v10, v4

    .line 731
    .line 732
    iget-object v11, v9, Lv/c;->f:Lv/c;

    .line 733
    .line 734
    const/4 v12, -0x1

    .line 735
    if-eqz v11, :cond_1a

    .line 736
    .line 737
    invoke-static {v9}, Lw/o;->h(Lv/c;)Lw/f;

    .line 738
    .line 739
    .line 740
    move-result-object v0

    .line 741
    if-eqz v0, :cond_1d

    .line 742
    .line 743
    iget-object v6, p0, Lw/o;->b:Lv/d;

    .line 744
    .line 745
    iget-object v6, v6, Lv/d;->Q:[Lv/c;

    .line 746
    .line 747
    aget-object v4, v6, v4

    .line 748
    .line 749
    invoke-virtual {v4}, Lv/c;->e()I

    .line 750
    .line 751
    .line 752
    move-result v4

    .line 753
    neg-int v4, v4

    .line 754
    invoke-static {v1, v0, v4}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 755
    .line 756
    .line 757
    invoke-virtual {p0, v3, v1, v12, v2}, Lw/o;->c(Lw/f;Lw/f;ILw/g;)V

    .line 758
    .line 759
    .line 760
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 761
    .line 762
    iget-boolean v0, v0, Lv/d;->E:Z

    .line 763
    .line 764
    if-eqz v0, :cond_1d

    .line 765
    .line 766
    iget-object v0, p0, Lw/m;->l:Lw/a;

    .line 767
    .line 768
    invoke-virtual {p0, v7, v3, v5, v0}, Lw/o;->c(Lw/f;Lw/f;ILw/g;)V

    .line 769
    .line 770
    .line 771
    goto :goto_4

    .line 772
    :cond_1a
    aget-object v6, v10, v6

    .line 773
    .line 774
    iget-object v9, v6, Lv/c;->f:Lv/c;

    .line 775
    .line 776
    if-eqz v9, :cond_1b

    .line 777
    .line 778
    invoke-static {v6}, Lw/o;->h(Lv/c;)Lw/f;

    .line 779
    .line 780
    .line 781
    move-result-object v0

    .line 782
    if-eqz v0, :cond_1d

    .line 783
    .line 784
    invoke-static {v7, v0, v8}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 785
    .line 786
    .line 787
    iget-object v0, p0, Lw/m;->l:Lw/a;

    .line 788
    .line 789
    invoke-virtual {p0, v3, v7, v12, v0}, Lw/o;->c(Lw/f;Lw/f;ILw/g;)V

    .line 790
    .line 791
    .line 792
    invoke-virtual {p0, v1, v3, v5, v2}, Lw/o;->c(Lw/f;Lw/f;ILw/g;)V

    .line 793
    .line 794
    .line 795
    goto :goto_4

    .line 796
    :cond_1b
    instance-of v6, v0, Lv/i;

    .line 797
    .line 798
    if-nez v6, :cond_1d

    .line 799
    .line 800
    iget-object v6, v0, Lv/d;->T:Lv/d;

    .line 801
    .line 802
    if-eqz v6, :cond_1d

    .line 803
    .line 804
    iget-object v6, v6, Lv/d;->e:Lw/m;

    .line 805
    .line 806
    iget-object v6, v6, Lw/o;->h:Lw/f;

    .line 807
    .line 808
    invoke-virtual {v0}, Lv/d;->s()I

    .line 809
    .line 810
    .line 811
    move-result v0

    .line 812
    invoke-static {v3, v6, v0}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 813
    .line 814
    .line 815
    invoke-virtual {p0, v1, v3, v5, v2}, Lw/o;->c(Lw/f;Lw/f;ILw/g;)V

    .line 816
    .line 817
    .line 818
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 819
    .line 820
    iget-boolean v0, v0, Lv/d;->E:Z

    .line 821
    .line 822
    if-eqz v0, :cond_1c

    .line 823
    .line 824
    iget-object v0, p0, Lw/m;->l:Lw/a;

    .line 825
    .line 826
    invoke-virtual {p0, v7, v3, v5, v0}, Lw/o;->c(Lw/f;Lw/f;ILw/g;)V

    .line 827
    .line 828
    .line 829
    :cond_1c
    iget v0, p0, Lw/o;->d:I

    .line 830
    .line 831
    if-ne v0, v4, :cond_1d

    .line 832
    .line 833
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 834
    .line 835
    iget v1, v0, Lv/d;->W:F

    .line 836
    .line 837
    cmpl-float v1, v1, v13

    .line 838
    .line 839
    if-lez v1, :cond_1d

    .line 840
    .line 841
    iget-object v0, v0, Lv/d;->d:Lw/k;

    .line 842
    .line 843
    iget v1, v0, Lw/o;->d:I

    .line 844
    .line 845
    if-ne v1, v4, :cond_1d

    .line 846
    .line 847
    iget-object v0, v0, Lw/o;->e:Lw/g;

    .line 848
    .line 849
    iget-object v0, v0, Lw/f;->k:Ljava/util/ArrayList;

    .line 850
    .line 851
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 852
    .line 853
    .line 854
    iget-object v0, v2, Lw/f;->l:Ljava/util/ArrayList;

    .line 855
    .line 856
    iget-object v1, p0, Lw/o;->b:Lv/d;

    .line 857
    .line 858
    iget-object v1, v1, Lv/d;->d:Lw/k;

    .line 859
    .line 860
    iget-object v1, v1, Lw/o;->e:Lw/g;

    .line 861
    .line 862
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 863
    .line 864
    .line 865
    iput-object p0, v2, Lw/f;->a:Lw/o;

    .line 866
    .line 867
    :cond_1d
    :goto_4
    iget-object v0, v2, Lw/f;->l:Ljava/util/ArrayList;

    .line 868
    .line 869
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 870
    .line 871
    .line 872
    move-result v0

    .line 873
    if-nez v0, :cond_1e

    .line 874
    .line 875
    iput-boolean v5, v2, Lw/f;->c:Z

    .line 876
    .line 877
    :cond_1e
    :goto_5
    return-void
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw/o;->h:Lw/f;

    .line 2
    .line 3
    iget-boolean v1, v0, Lw/f;->j:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lw/o;->b:Lv/d;

    .line 8
    .line 9
    iget v0, v0, Lw/f;->g:I

    .line 10
    .line 11
    iput v0, v1, Lv/d;->Z:I

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final f()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lw/o;->c:Lw/l;

    .line 3
    .line 4
    iget-object v0, p0, Lw/o;->h:Lw/f;

    .line 5
    .line 6
    invoke-virtual {v0}, Lw/f;->c()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lw/o;->i:Lw/f;

    .line 10
    .line 11
    invoke-virtual {v0}, Lw/f;->c()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lw/m;->k:Lw/f;

    .line 15
    .line 16
    invoke-virtual {v0}, Lw/f;->c()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lw/o;->e:Lw/g;

    .line 20
    .line 21
    invoke-virtual {v0}, Lw/f;->c()V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, Lw/o;->g:Z

    .line 26
    .line 27
    return-void
.end method

.method public final k()Z
    .locals 3

    .line 1
    iget v0, p0, Lw/o;->d:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 8
    .line 9
    iget v0, v0, Lv/d;->s:I

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return v2

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_1
    return v2
.end method

.method public final m()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lw/o;->g:Z

    .line 3
    .line 4
    iget-object v1, p0, Lw/o;->h:Lw/f;

    .line 5
    .line 6
    invoke-virtual {v1}, Lw/f;->c()V

    .line 7
    .line 8
    .line 9
    iput-boolean v0, v1, Lw/f;->j:Z

    .line 10
    .line 11
    iget-object v1, p0, Lw/o;->i:Lw/f;

    .line 12
    .line 13
    invoke-virtual {v1}, Lw/f;->c()V

    .line 14
    .line 15
    .line 16
    iput-boolean v0, v1, Lw/f;->j:Z

    .line 17
    .line 18
    iget-object v1, p0, Lw/m;->k:Lw/f;

    .line 19
    .line 20
    invoke-virtual {v1}, Lw/f;->c()V

    .line 21
    .line 22
    .line 23
    iput-boolean v0, v1, Lw/f;->j:Z

    .line 24
    .line 25
    iget-object v1, p0, Lw/o;->e:Lw/g;

    .line 26
    .line 27
    iput-boolean v0, v1, Lw/f;->j:Z

    .line 28
    .line 29
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "VerticalRun "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lw/o;->b:Lv/d;

    .line 9
    .line 10
    iget-object v1, v1, Lv/d;->h0:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method
