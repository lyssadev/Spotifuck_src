.class public final Lv/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Lv/d;

.field public c:I

.field public d:Lv/c;

.field public e:Lv/c;

.field public f:Lv/c;

.field public g:Lv/c;

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public final synthetic r:Lv/g;


# direct methods
.method public constructor <init>(Lv/g;ILv/c;Lv/c;Lv/c;Lv/c;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv/f;->r:Lv/g;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lv/f;->b:Lv/d;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lv/f;->c:I

    .line 11
    .line 12
    iput v0, p0, Lv/f;->h:I

    .line 13
    .line 14
    iput v0, p0, Lv/f;->i:I

    .line 15
    .line 16
    iput v0, p0, Lv/f;->j:I

    .line 17
    .line 18
    iput v0, p0, Lv/f;->k:I

    .line 19
    .line 20
    iput v0, p0, Lv/f;->l:I

    .line 21
    .line 22
    iput v0, p0, Lv/f;->m:I

    .line 23
    .line 24
    iput v0, p0, Lv/f;->n:I

    .line 25
    .line 26
    iput v0, p0, Lv/f;->o:I

    .line 27
    .line 28
    iput v0, p0, Lv/f;->p:I

    .line 29
    .line 30
    iput v0, p0, Lv/f;->q:I

    .line 31
    .line 32
    iput p2, p0, Lv/f;->a:I

    .line 33
    .line 34
    iput-object p3, p0, Lv/f;->d:Lv/c;

    .line 35
    .line 36
    iput-object p4, p0, Lv/f;->e:Lv/c;

    .line 37
    .line 38
    iput-object p5, p0, Lv/f;->f:Lv/c;

    .line 39
    .line 40
    iput-object p6, p0, Lv/f;->g:Lv/c;

    .line 41
    .line 42
    iget p2, p1, Lv/g;->w0:I

    .line 43
    .line 44
    iput p2, p0, Lv/f;->h:I

    .line 45
    .line 46
    iget p2, p1, Lv/g;->s0:I

    .line 47
    .line 48
    iput p2, p0, Lv/f;->i:I

    .line 49
    .line 50
    iget p2, p1, Lv/g;->x0:I

    .line 51
    .line 52
    iput p2, p0, Lv/f;->j:I

    .line 53
    .line 54
    iget p1, p1, Lv/g;->t0:I

    .line 55
    .line 56
    iput p1, p0, Lv/f;->k:I

    .line 57
    .line 58
    iput p7, p0, Lv/f;->q:I

    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public final a(Lv/d;)V
    .locals 8

    .line 1
    iget v0, p0, Lv/f;->a:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v5, p0, Lv/f;->r:Lv/g;

    .line 9
    .line 10
    if-nez v0, :cond_3

    .line 11
    .line 12
    iget v0, p0, Lv/f;->q:I

    .line 13
    .line 14
    invoke-virtual {v5, p1, v0}, Lv/g;->U(Lv/d;I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v6, p1, Lv/d;->p0:[I

    .line 19
    .line 20
    aget v6, v6, v4

    .line 21
    .line 22
    if-ne v6, v2, :cond_0

    .line 23
    .line 24
    iget v0, p0, Lv/f;->p:I

    .line 25
    .line 26
    add-int/2addr v0, v3

    .line 27
    iput v0, p0, Lv/f;->p:I

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    :cond_0
    iget v2, v5, Lv/g;->P0:I

    .line 31
    .line 32
    iget v6, p1, Lv/d;->g0:I

    .line 33
    .line 34
    if-ne v6, v1, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move v4, v2

    .line 38
    :goto_0
    iget v1, p0, Lv/f;->l:I

    .line 39
    .line 40
    add-int/2addr v0, v4

    .line 41
    add-int/2addr v0, v1

    .line 42
    iput v0, p0, Lv/f;->l:I

    .line 43
    .line 44
    iget v0, p0, Lv/f;->q:I

    .line 45
    .line 46
    invoke-virtual {v5, p1, v0}, Lv/g;->T(Lv/d;I)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v1, p0, Lv/f;->b:Lv/d;

    .line 51
    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    iget v1, p0, Lv/f;->c:I

    .line 55
    .line 56
    if-ge v1, v0, :cond_7

    .line 57
    .line 58
    :cond_2
    iput-object p1, p0, Lv/f;->b:Lv/d;

    .line 59
    .line 60
    iput v0, p0, Lv/f;->c:I

    .line 61
    .line 62
    iput v0, p0, Lv/f;->m:I

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    iget v0, p0, Lv/f;->q:I

    .line 66
    .line 67
    invoke-virtual {v5, p1, v0}, Lv/g;->U(Lv/d;I)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    iget v6, p0, Lv/f;->q:I

    .line 72
    .line 73
    invoke-virtual {v5, p1, v6}, Lv/g;->T(Lv/d;I)I

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    iget-object v7, p1, Lv/d;->p0:[I

    .line 78
    .line 79
    aget v7, v7, v3

    .line 80
    .line 81
    if-ne v7, v2, :cond_4

    .line 82
    .line 83
    iget v2, p0, Lv/f;->p:I

    .line 84
    .line 85
    add-int/2addr v2, v3

    .line 86
    iput v2, p0, Lv/f;->p:I

    .line 87
    .line 88
    const/4 v6, 0x0

    .line 89
    :cond_4
    iget v2, v5, Lv/g;->Q0:I

    .line 90
    .line 91
    iget v5, p1, Lv/d;->g0:I

    .line 92
    .line 93
    if-ne v5, v1, :cond_5

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_5
    move v4, v2

    .line 97
    :goto_1
    iget v1, p0, Lv/f;->m:I

    .line 98
    .line 99
    add-int/2addr v6, v4

    .line 100
    add-int/2addr v6, v1

    .line 101
    iput v6, p0, Lv/f;->m:I

    .line 102
    .line 103
    iget-object v1, p0, Lv/f;->b:Lv/d;

    .line 104
    .line 105
    if-eqz v1, :cond_6

    .line 106
    .line 107
    iget v1, p0, Lv/f;->c:I

    .line 108
    .line 109
    if-ge v1, v0, :cond_7

    .line 110
    .line 111
    :cond_6
    iput-object p1, p0, Lv/f;->b:Lv/d;

    .line 112
    .line 113
    iput v0, p0, Lv/f;->c:I

    .line 114
    .line 115
    iput v0, p0, Lv/f;->l:I

    .line 116
    .line 117
    :cond_7
    :goto_2
    iget p1, p0, Lv/f;->o:I

    .line 118
    .line 119
    add-int/2addr p1, v3

    .line 120
    iput p1, p0, Lv/f;->o:I

    .line 121
    .line 122
    return-void
.end method

.method public final b(IZZ)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lv/f;->o:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    :goto_0
    iget-object v4, v0, Lv/f;->r:Lv/g;

    .line 8
    .line 9
    if-ge v3, v1, :cond_2

    .line 10
    .line 11
    iget v5, v0, Lv/f;->n:I

    .line 12
    .line 13
    add-int/2addr v5, v3

    .line 14
    iget v6, v4, Lv/g;->b1:I

    .line 15
    .line 16
    if-lt v5, v6, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    iget-object v4, v4, Lv/g;->a1:[Lv/d;

    .line 20
    .line 21
    aget-object v4, v4, v5

    .line 22
    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    invoke-virtual {v4}, Lv/d;->D()V

    .line 26
    .line 27
    .line 28
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    :goto_1
    if-eqz v1, :cond_3c

    .line 32
    .line 33
    iget-object v3, v0, Lv/f;->b:Lv/d;

    .line 34
    .line 35
    if-nez v3, :cond_3

    .line 36
    .line 37
    goto/16 :goto_1a

    .line 38
    .line 39
    :cond_3
    if-eqz p3, :cond_4

    .line 40
    .line 41
    if-nez p1, :cond_4

    .line 42
    .line 43
    const/4 v5, 0x1

    .line 44
    goto :goto_2

    .line 45
    :cond_4
    const/4 v5, 0x0

    .line 46
    :goto_2
    const/4 v6, -0x1

    .line 47
    const/4 v7, 0x0

    .line 48
    const/4 v8, -0x1

    .line 49
    const/4 v9, -0x1

    .line 50
    :goto_3
    if-ge v7, v1, :cond_9

    .line 51
    .line 52
    if-eqz p2, :cond_5

    .line 53
    .line 54
    add-int/lit8 v10, v1, -0x1

    .line 55
    .line 56
    sub-int/2addr v10, v7

    .line 57
    goto :goto_4

    .line 58
    :cond_5
    move v10, v7

    .line 59
    :goto_4
    iget v11, v0, Lv/f;->n:I

    .line 60
    .line 61
    add-int/2addr v11, v10

    .line 62
    iget v10, v4, Lv/g;->b1:I

    .line 63
    .line 64
    if-lt v11, v10, :cond_6

    .line 65
    .line 66
    goto :goto_5

    .line 67
    :cond_6
    iget-object v10, v4, Lv/g;->a1:[Lv/d;

    .line 68
    .line 69
    aget-object v10, v10, v11

    .line 70
    .line 71
    if-eqz v10, :cond_8

    .line 72
    .line 73
    iget v10, v10, Lv/d;->g0:I

    .line 74
    .line 75
    if-nez v10, :cond_8

    .line 76
    .line 77
    if-ne v8, v6, :cond_7

    .line 78
    .line 79
    move v8, v7

    .line 80
    :cond_7
    move v9, v7

    .line 81
    :cond_8
    add-int/lit8 v7, v7, 0x1

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_9
    :goto_5
    iget v7, v0, Lv/f;->a:I

    .line 85
    .line 86
    if-nez v7, :cond_24

    .line 87
    .line 88
    iget-object v7, v0, Lv/f;->b:Lv/d;

    .line 89
    .line 90
    iget v11, v4, Lv/g;->E0:I

    .line 91
    .line 92
    iput v11, v7, Lv/d;->j0:I

    .line 93
    .line 94
    iget v11, v0, Lv/f;->i:I

    .line 95
    .line 96
    if-lez p1, :cond_a

    .line 97
    .line 98
    iget v12, v4, Lv/g;->Q0:I

    .line 99
    .line 100
    add-int/2addr v11, v12

    .line 101
    :cond_a
    iget-object v12, v0, Lv/f;->e:Lv/c;

    .line 102
    .line 103
    iget-object v13, v7, Lv/d;->J:Lv/c;

    .line 104
    .line 105
    invoke-virtual {v13, v12, v11}, Lv/c;->a(Lv/c;I)V

    .line 106
    .line 107
    .line 108
    iget-object v11, v7, Lv/d;->L:Lv/c;

    .line 109
    .line 110
    if-eqz p3, :cond_b

    .line 111
    .line 112
    iget-object v12, v0, Lv/f;->g:Lv/c;

    .line 113
    .line 114
    iget v14, v0, Lv/f;->k:I

    .line 115
    .line 116
    invoke-virtual {v11, v12, v14}, Lv/c;->a(Lv/c;I)V

    .line 117
    .line 118
    .line 119
    :cond_b
    if-lez p1, :cond_c

    .line 120
    .line 121
    iget-object v12, v0, Lv/f;->e:Lv/c;

    .line 122
    .line 123
    iget-object v12, v12, Lv/c;->d:Lv/d;

    .line 124
    .line 125
    iget-object v12, v12, Lv/d;->L:Lv/c;

    .line 126
    .line 127
    invoke-virtual {v12, v13, v2}, Lv/c;->a(Lv/c;I)V

    .line 128
    .line 129
    .line 130
    :cond_c
    iget v12, v4, Lv/g;->S0:I

    .line 131
    .line 132
    const/4 v14, 0x3

    .line 133
    if-ne v12, v14, :cond_10

    .line 134
    .line 135
    iget-boolean v12, v7, Lv/d;->E:Z

    .line 136
    .line 137
    if-nez v12, :cond_10

    .line 138
    .line 139
    const/4 v12, 0x0

    .line 140
    :goto_6
    if-ge v12, v1, :cond_10

    .line 141
    .line 142
    if-eqz p2, :cond_d

    .line 143
    .line 144
    add-int/lit8 v15, v1, -0x1

    .line 145
    .line 146
    sub-int/2addr v15, v12

    .line 147
    goto :goto_7

    .line 148
    :cond_d
    move v15, v12

    .line 149
    :goto_7
    iget v10, v0, Lv/f;->n:I

    .line 150
    .line 151
    add-int/2addr v10, v15

    .line 152
    iget v15, v4, Lv/g;->b1:I

    .line 153
    .line 154
    if-lt v10, v15, :cond_e

    .line 155
    .line 156
    goto :goto_8

    .line 157
    :cond_e
    iget-object v15, v4, Lv/g;->a1:[Lv/d;

    .line 158
    .line 159
    aget-object v10, v15, v10

    .line 160
    .line 161
    iget-boolean v15, v10, Lv/d;->E:Z

    .line 162
    .line 163
    if-eqz v15, :cond_f

    .line 164
    .line 165
    goto :goto_9

    .line 166
    :cond_f
    add-int/lit8 v12, v12, 0x1

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_10
    :goto_8
    move-object v10, v7

    .line 170
    :goto_9
    const/4 v12, 0x0

    .line 171
    const/4 v15, 0x0

    .line 172
    :goto_a
    if-ge v15, v1, :cond_3c

    .line 173
    .line 174
    if-eqz p2, :cond_11

    .line 175
    .line 176
    add-int/lit8 v16, v1, -0x1

    .line 177
    .line 178
    sub-int v16, v16, v15

    .line 179
    .line 180
    goto :goto_b

    .line 181
    :cond_11
    move/from16 v16, v15

    .line 182
    .line 183
    :goto_b
    iget v14, v0, Lv/f;->n:I

    .line 184
    .line 185
    add-int v14, v14, v16

    .line 186
    .line 187
    iget v3, v4, Lv/g;->b1:I

    .line 188
    .line 189
    if-lt v14, v3, :cond_12

    .line 190
    .line 191
    goto/16 :goto_1a

    .line 192
    .line 193
    :cond_12
    iget-object v3, v4, Lv/g;->a1:[Lv/d;

    .line 194
    .line 195
    aget-object v3, v3, v14

    .line 196
    .line 197
    if-nez v3, :cond_13

    .line 198
    .line 199
    move/from16 v17, v1

    .line 200
    .line 201
    const/4 v2, 0x3

    .line 202
    goto/16 :goto_11

    .line 203
    .line 204
    :cond_13
    iget-object v14, v3, Lv/d;->I:Lv/c;

    .line 205
    .line 206
    if-nez v15, :cond_14

    .line 207
    .line 208
    iget-object v2, v0, Lv/f;->d:Lv/c;

    .line 209
    .line 210
    iget v6, v0, Lv/f;->h:I

    .line 211
    .line 212
    invoke-virtual {v3, v14, v2, v6}, Lv/d;->f(Lv/c;Lv/c;I)V

    .line 213
    .line 214
    .line 215
    :cond_14
    if-nez v16, :cond_1b

    .line 216
    .line 217
    iget v2, v4, Lv/g;->D0:I

    .line 218
    .line 219
    const/high16 v6, 0x3f800000    # 1.0f

    .line 220
    .line 221
    if-eqz p2, :cond_15

    .line 222
    .line 223
    move/from16 v16, v2

    .line 224
    .line 225
    iget v2, v4, Lv/g;->J0:F

    .line 226
    .line 227
    sub-float v2, v6, v2

    .line 228
    .line 229
    goto :goto_c

    .line 230
    :cond_15
    move/from16 v16, v2

    .line 231
    .line 232
    iget v2, v4, Lv/g;->J0:F

    .line 233
    .line 234
    :goto_c
    iget v6, v0, Lv/f;->n:I

    .line 235
    .line 236
    if-nez v6, :cond_17

    .line 237
    .line 238
    iget v6, v4, Lv/g;->F0:I

    .line 239
    .line 240
    move/from16 v18, v2

    .line 241
    .line 242
    const/4 v2, -0x1

    .line 243
    if-eq v6, v2, :cond_18

    .line 244
    .line 245
    if-eqz p2, :cond_16

    .line 246
    .line 247
    iget v2, v4, Lv/g;->L0:F

    .line 248
    .line 249
    const/high16 v16, 0x3f800000    # 1.0f

    .line 250
    .line 251
    sub-float v2, v16, v2

    .line 252
    .line 253
    goto :goto_d

    .line 254
    :cond_16
    iget v2, v4, Lv/g;->L0:F

    .line 255
    .line 256
    :goto_d
    move/from16 v19, v6

    .line 257
    .line 258
    move v6, v2

    .line 259
    move/from16 v2, v19

    .line 260
    .line 261
    goto :goto_e

    .line 262
    :cond_17
    move/from16 v18, v2

    .line 263
    .line 264
    :cond_18
    if-eqz p3, :cond_1a

    .line 265
    .line 266
    iget v2, v4, Lv/g;->H0:I

    .line 267
    .line 268
    const/4 v6, -0x1

    .line 269
    if-eq v2, v6, :cond_1a

    .line 270
    .line 271
    if-eqz p2, :cond_19

    .line 272
    .line 273
    iget v6, v4, Lv/g;->N0:F

    .line 274
    .line 275
    const/high16 v16, 0x3f800000    # 1.0f

    .line 276
    .line 277
    sub-float v6, v16, v6

    .line 278
    .line 279
    goto :goto_e

    .line 280
    :cond_19
    iget v6, v4, Lv/g;->N0:F

    .line 281
    .line 282
    goto :goto_e

    .line 283
    :cond_1a
    move/from16 v2, v16

    .line 284
    .line 285
    move/from16 v6, v18

    .line 286
    .line 287
    :goto_e
    iput v2, v3, Lv/d;->i0:I

    .line 288
    .line 289
    iput v6, v3, Lv/d;->d0:F

    .line 290
    .line 291
    :cond_1b
    add-int/lit8 v2, v1, -0x1

    .line 292
    .line 293
    if-ne v15, v2, :cond_1c

    .line 294
    .line 295
    iget-object v2, v0, Lv/f;->f:Lv/c;

    .line 296
    .line 297
    iget v6, v0, Lv/f;->j:I

    .line 298
    .line 299
    move/from16 v17, v1

    .line 300
    .line 301
    iget-object v1, v3, Lv/d;->K:Lv/c;

    .line 302
    .line 303
    invoke-virtual {v3, v1, v2, v6}, Lv/d;->f(Lv/c;Lv/c;I)V

    .line 304
    .line 305
    .line 306
    goto :goto_f

    .line 307
    :cond_1c
    move/from16 v17, v1

    .line 308
    .line 309
    :goto_f
    if-eqz v12, :cond_1e

    .line 310
    .line 311
    iget v1, v4, Lv/g;->P0:I

    .line 312
    .line 313
    iget-object v2, v12, Lv/d;->K:Lv/c;

    .line 314
    .line 315
    invoke-virtual {v14, v2, v1}, Lv/c;->a(Lv/c;I)V

    .line 316
    .line 317
    .line 318
    if-ne v15, v8, :cond_1d

    .line 319
    .line 320
    iget v1, v0, Lv/f;->h:I

    .line 321
    .line 322
    invoke-virtual {v14}, Lv/c;->h()Z

    .line 323
    .line 324
    .line 325
    move-result v6

    .line 326
    if-eqz v6, :cond_1d

    .line 327
    .line 328
    iput v1, v14, Lv/c;->h:I

    .line 329
    .line 330
    :cond_1d
    const/4 v1, 0x0

    .line 331
    invoke-virtual {v2, v14, v1}, Lv/c;->a(Lv/c;I)V

    .line 332
    .line 333
    .line 334
    const/4 v1, 0x1

    .line 335
    add-int/lit8 v6, v9, 0x1

    .line 336
    .line 337
    if-ne v15, v6, :cond_1e

    .line 338
    .line 339
    iget v1, v0, Lv/f;->j:I

    .line 340
    .line 341
    invoke-virtual {v2}, Lv/c;->h()Z

    .line 342
    .line 343
    .line 344
    move-result v6

    .line 345
    if-eqz v6, :cond_1e

    .line 346
    .line 347
    iput v1, v2, Lv/c;->h:I

    .line 348
    .line 349
    :cond_1e
    if-eq v3, v7, :cond_23

    .line 350
    .line 351
    iget v1, v4, Lv/g;->S0:I

    .line 352
    .line 353
    const/4 v2, 0x3

    .line 354
    if-ne v1, v2, :cond_1f

    .line 355
    .line 356
    iget-boolean v6, v10, Lv/d;->E:Z

    .line 357
    .line 358
    if-eqz v6, :cond_1f

    .line 359
    .line 360
    if-eq v3, v10, :cond_1f

    .line 361
    .line 362
    iget-boolean v6, v3, Lv/d;->E:Z

    .line 363
    .line 364
    if-eqz v6, :cond_1f

    .line 365
    .line 366
    iget-object v1, v3, Lv/d;->M:Lv/c;

    .line 367
    .line 368
    iget-object v6, v10, Lv/d;->M:Lv/c;

    .line 369
    .line 370
    const/4 v12, 0x0

    .line 371
    invoke-virtual {v1, v6, v12}, Lv/c;->a(Lv/c;I)V

    .line 372
    .line 373
    .line 374
    goto :goto_10

    .line 375
    :cond_1f
    iget-object v6, v3, Lv/d;->J:Lv/c;

    .line 376
    .line 377
    if-eqz v1, :cond_22

    .line 378
    .line 379
    iget-object v12, v3, Lv/d;->L:Lv/c;

    .line 380
    .line 381
    const/4 v14, 0x1

    .line 382
    if-eq v1, v14, :cond_21

    .line 383
    .line 384
    if-eqz v5, :cond_20

    .line 385
    .line 386
    iget-object v1, v0, Lv/f;->e:Lv/c;

    .line 387
    .line 388
    iget v14, v0, Lv/f;->i:I

    .line 389
    .line 390
    invoke-virtual {v6, v1, v14}, Lv/c;->a(Lv/c;I)V

    .line 391
    .line 392
    .line 393
    iget-object v1, v0, Lv/f;->g:Lv/c;

    .line 394
    .line 395
    iget v6, v0, Lv/f;->k:I

    .line 396
    .line 397
    invoke-virtual {v12, v1, v6}, Lv/c;->a(Lv/c;I)V

    .line 398
    .line 399
    .line 400
    goto :goto_10

    .line 401
    :cond_20
    const/4 v1, 0x0

    .line 402
    invoke-virtual {v6, v13, v1}, Lv/c;->a(Lv/c;I)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v12, v11, v1}, Lv/c;->a(Lv/c;I)V

    .line 406
    .line 407
    .line 408
    goto :goto_10

    .line 409
    :cond_21
    const/4 v1, 0x0

    .line 410
    invoke-virtual {v12, v11, v1}, Lv/c;->a(Lv/c;I)V

    .line 411
    .line 412
    .line 413
    goto :goto_10

    .line 414
    :cond_22
    const/4 v1, 0x0

    .line 415
    invoke-virtual {v6, v13, v1}, Lv/c;->a(Lv/c;I)V

    .line 416
    .line 417
    .line 418
    goto :goto_10

    .line 419
    :cond_23
    const/4 v2, 0x3

    .line 420
    :goto_10
    move-object v12, v3

    .line 421
    :goto_11
    add-int/lit8 v15, v15, 0x1

    .line 422
    .line 423
    move/from16 v1, v17

    .line 424
    .line 425
    const/4 v2, 0x0

    .line 426
    const/4 v6, -0x1

    .line 427
    const/4 v14, 0x3

    .line 428
    goto/16 :goto_a

    .line 429
    .line 430
    :cond_24
    move/from16 v17, v1

    .line 431
    .line 432
    iget-object v1, v0, Lv/f;->b:Lv/d;

    .line 433
    .line 434
    iget v2, v4, Lv/g;->D0:I

    .line 435
    .line 436
    iput v2, v1, Lv/d;->i0:I

    .line 437
    .line 438
    iget v2, v0, Lv/f;->h:I

    .line 439
    .line 440
    if-lez p1, :cond_25

    .line 441
    .line 442
    iget v3, v4, Lv/g;->P0:I

    .line 443
    .line 444
    add-int/2addr v2, v3

    .line 445
    :cond_25
    iget-object v3, v1, Lv/d;->I:Lv/c;

    .line 446
    .line 447
    iget-object v6, v1, Lv/d;->K:Lv/c;

    .line 448
    .line 449
    if-eqz p2, :cond_27

    .line 450
    .line 451
    iget-object v7, v0, Lv/f;->f:Lv/c;

    .line 452
    .line 453
    invoke-virtual {v6, v7, v2}, Lv/c;->a(Lv/c;I)V

    .line 454
    .line 455
    .line 456
    if-eqz p3, :cond_26

    .line 457
    .line 458
    iget-object v2, v0, Lv/f;->d:Lv/c;

    .line 459
    .line 460
    iget v7, v0, Lv/f;->j:I

    .line 461
    .line 462
    invoke-virtual {v3, v2, v7}, Lv/c;->a(Lv/c;I)V

    .line 463
    .line 464
    .line 465
    :cond_26
    if-lez p1, :cond_29

    .line 466
    .line 467
    iget-object v2, v0, Lv/f;->f:Lv/c;

    .line 468
    .line 469
    iget-object v2, v2, Lv/c;->d:Lv/d;

    .line 470
    .line 471
    iget-object v2, v2, Lv/d;->I:Lv/c;

    .line 472
    .line 473
    const/4 v7, 0x0

    .line 474
    invoke-virtual {v2, v6, v7}, Lv/c;->a(Lv/c;I)V

    .line 475
    .line 476
    .line 477
    goto :goto_12

    .line 478
    :cond_27
    iget-object v7, v0, Lv/f;->d:Lv/c;

    .line 479
    .line 480
    invoke-virtual {v3, v7, v2}, Lv/c;->a(Lv/c;I)V

    .line 481
    .line 482
    .line 483
    if-eqz p3, :cond_28

    .line 484
    .line 485
    iget-object v2, v0, Lv/f;->f:Lv/c;

    .line 486
    .line 487
    iget v7, v0, Lv/f;->j:I

    .line 488
    .line 489
    invoke-virtual {v6, v2, v7}, Lv/c;->a(Lv/c;I)V

    .line 490
    .line 491
    .line 492
    :cond_28
    if-lez p1, :cond_29

    .line 493
    .line 494
    iget-object v2, v0, Lv/f;->d:Lv/c;

    .line 495
    .line 496
    iget-object v2, v2, Lv/c;->d:Lv/d;

    .line 497
    .line 498
    iget-object v2, v2, Lv/d;->K:Lv/c;

    .line 499
    .line 500
    const/4 v7, 0x0

    .line 501
    invoke-virtual {v2, v3, v7}, Lv/c;->a(Lv/c;I)V

    .line 502
    .line 503
    .line 504
    :cond_29
    :goto_12
    move/from16 v7, v17

    .line 505
    .line 506
    const/4 v2, 0x0

    .line 507
    const/4 v10, 0x0

    .line 508
    :goto_13
    if-ge v2, v7, :cond_3c

    .line 509
    .line 510
    iget v11, v0, Lv/f;->n:I

    .line 511
    .line 512
    add-int/2addr v11, v2

    .line 513
    iget v12, v4, Lv/g;->b1:I

    .line 514
    .line 515
    if-lt v11, v12, :cond_2a

    .line 516
    .line 517
    goto/16 :goto_1a

    .line 518
    .line 519
    :cond_2a
    iget-object v12, v4, Lv/g;->a1:[Lv/d;

    .line 520
    .line 521
    aget-object v11, v12, v11

    .line 522
    .line 523
    if-nez v11, :cond_2b

    .line 524
    .line 525
    const/4 v13, 0x0

    .line 526
    const/4 v15, 0x1

    .line 527
    goto/16 :goto_19

    .line 528
    .line 529
    :cond_2b
    iget-object v12, v11, Lv/d;->J:Lv/c;

    .line 530
    .line 531
    if-nez v2, :cond_2f

    .line 532
    .line 533
    iget-object v13, v0, Lv/f;->e:Lv/c;

    .line 534
    .line 535
    iget v14, v0, Lv/f;->i:I

    .line 536
    .line 537
    invoke-virtual {v11, v12, v13, v14}, Lv/d;->f(Lv/c;Lv/c;I)V

    .line 538
    .line 539
    .line 540
    iget v13, v4, Lv/g;->E0:I

    .line 541
    .line 542
    iget v14, v4, Lv/g;->K0:F

    .line 543
    .line 544
    iget v15, v0, Lv/f;->n:I

    .line 545
    .line 546
    if-nez v15, :cond_2c

    .line 547
    .line 548
    iget v15, v4, Lv/g;->G0:I

    .line 549
    .line 550
    move/from16 v16, v13

    .line 551
    .line 552
    const/4 v13, -0x1

    .line 553
    if-eq v15, v13, :cond_2d

    .line 554
    .line 555
    iget v14, v4, Lv/g;->M0:F

    .line 556
    .line 557
    goto :goto_14

    .line 558
    :cond_2c
    move/from16 v16, v13

    .line 559
    .line 560
    const/4 v13, -0x1

    .line 561
    :cond_2d
    if-eqz p3, :cond_2e

    .line 562
    .line 563
    iget v15, v4, Lv/g;->I0:I

    .line 564
    .line 565
    if-eq v15, v13, :cond_2e

    .line 566
    .line 567
    iget v14, v4, Lv/g;->O0:F

    .line 568
    .line 569
    goto :goto_14

    .line 570
    :cond_2e
    move/from16 v15, v16

    .line 571
    .line 572
    :goto_14
    iput v15, v11, Lv/d;->j0:I

    .line 573
    .line 574
    iput v14, v11, Lv/d;->e0:F

    .line 575
    .line 576
    goto :goto_15

    .line 577
    :cond_2f
    const/4 v13, -0x1

    .line 578
    :goto_15
    add-int/lit8 v14, v7, -0x1

    .line 579
    .line 580
    if-ne v2, v14, :cond_30

    .line 581
    .line 582
    iget-object v14, v0, Lv/f;->g:Lv/c;

    .line 583
    .line 584
    iget v15, v0, Lv/f;->k:I

    .line 585
    .line 586
    iget-object v13, v11, Lv/d;->L:Lv/c;

    .line 587
    .line 588
    invoke-virtual {v11, v13, v14, v15}, Lv/d;->f(Lv/c;Lv/c;I)V

    .line 589
    .line 590
    .line 591
    :cond_30
    if-eqz v10, :cond_32

    .line 592
    .line 593
    iget v13, v4, Lv/g;->Q0:I

    .line 594
    .line 595
    iget-object v10, v10, Lv/d;->L:Lv/c;

    .line 596
    .line 597
    invoke-virtual {v12, v10, v13}, Lv/c;->a(Lv/c;I)V

    .line 598
    .line 599
    .line 600
    if-ne v2, v8, :cond_31

    .line 601
    .line 602
    iget v13, v0, Lv/f;->i:I

    .line 603
    .line 604
    invoke-virtual {v12}, Lv/c;->h()Z

    .line 605
    .line 606
    .line 607
    move-result v14

    .line 608
    if-eqz v14, :cond_31

    .line 609
    .line 610
    iput v13, v12, Lv/c;->h:I

    .line 611
    .line 612
    :cond_31
    const/4 v13, 0x0

    .line 613
    invoke-virtual {v10, v12, v13}, Lv/c;->a(Lv/c;I)V

    .line 614
    .line 615
    .line 616
    const/4 v12, 0x1

    .line 617
    add-int/lit8 v13, v9, 0x1

    .line 618
    .line 619
    if-ne v2, v13, :cond_32

    .line 620
    .line 621
    iget v12, v0, Lv/f;->k:I

    .line 622
    .line 623
    invoke-virtual {v10}, Lv/c;->h()Z

    .line 624
    .line 625
    .line 626
    move-result v13

    .line 627
    if-eqz v13, :cond_32

    .line 628
    .line 629
    iput v12, v10, Lv/c;->h:I

    .line 630
    .line 631
    :cond_32
    if-eq v11, v1, :cond_36

    .line 632
    .line 633
    iget-object v10, v11, Lv/d;->K:Lv/c;

    .line 634
    .line 635
    iget-object v12, v11, Lv/d;->I:Lv/c;

    .line 636
    .line 637
    const/4 v13, 0x2

    .line 638
    if-eqz p2, :cond_37

    .line 639
    .line 640
    iget v14, v4, Lv/g;->R0:I

    .line 641
    .line 642
    if-eqz v14, :cond_35

    .line 643
    .line 644
    const/4 v15, 0x1

    .line 645
    if-eq v14, v15, :cond_34

    .line 646
    .line 647
    if-eq v14, v13, :cond_33

    .line 648
    .line 649
    goto :goto_16

    .line 650
    :cond_33
    const/4 v13, 0x0

    .line 651
    invoke-virtual {v12, v3, v13}, Lv/c;->a(Lv/c;I)V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v10, v6, v13}, Lv/c;->a(Lv/c;I)V

    .line 655
    .line 656
    .line 657
    goto :goto_16

    .line 658
    :cond_34
    const/4 v13, 0x0

    .line 659
    invoke-virtual {v12, v3, v13}, Lv/c;->a(Lv/c;I)V

    .line 660
    .line 661
    .line 662
    goto :goto_16

    .line 663
    :cond_35
    const/4 v13, 0x0

    .line 664
    invoke-virtual {v10, v6, v13}, Lv/c;->a(Lv/c;I)V

    .line 665
    .line 666
    .line 667
    :cond_36
    :goto_16
    const/4 v13, 0x0

    .line 668
    const/4 v15, 0x1

    .line 669
    goto :goto_18

    .line 670
    :cond_37
    iget v14, v4, Lv/g;->R0:I

    .line 671
    .line 672
    if-eqz v14, :cond_3b

    .line 673
    .line 674
    const/4 v15, 0x1

    .line 675
    if-eq v14, v15, :cond_3a

    .line 676
    .line 677
    if-eq v14, v13, :cond_38

    .line 678
    .line 679
    :goto_17
    const/4 v13, 0x0

    .line 680
    goto :goto_18

    .line 681
    :cond_38
    if-eqz v5, :cond_39

    .line 682
    .line 683
    iget-object v13, v0, Lv/f;->d:Lv/c;

    .line 684
    .line 685
    iget v14, v0, Lv/f;->h:I

    .line 686
    .line 687
    invoke-virtual {v12, v13, v14}, Lv/c;->a(Lv/c;I)V

    .line 688
    .line 689
    .line 690
    iget-object v12, v0, Lv/f;->f:Lv/c;

    .line 691
    .line 692
    iget v13, v0, Lv/f;->j:I

    .line 693
    .line 694
    invoke-virtual {v10, v12, v13}, Lv/c;->a(Lv/c;I)V

    .line 695
    .line 696
    .line 697
    goto :goto_17

    .line 698
    :cond_39
    const/4 v13, 0x0

    .line 699
    invoke-virtual {v12, v3, v13}, Lv/c;->a(Lv/c;I)V

    .line 700
    .line 701
    .line 702
    invoke-virtual {v10, v6, v13}, Lv/c;->a(Lv/c;I)V

    .line 703
    .line 704
    .line 705
    goto :goto_18

    .line 706
    :cond_3a
    const/4 v13, 0x0

    .line 707
    invoke-virtual {v10, v6, v13}, Lv/c;->a(Lv/c;I)V

    .line 708
    .line 709
    .line 710
    goto :goto_18

    .line 711
    :cond_3b
    const/4 v13, 0x0

    .line 712
    const/4 v15, 0x1

    .line 713
    invoke-virtual {v12, v3, v13}, Lv/c;->a(Lv/c;I)V

    .line 714
    .line 715
    .line 716
    :goto_18
    move-object v10, v11

    .line 717
    :goto_19
    add-int/lit8 v2, v2, 0x1

    .line 718
    .line 719
    goto/16 :goto_13

    .line 720
    .line 721
    :cond_3c
    :goto_1a
    return-void
.end method

.method public final c()I
    .locals 2

    .line 1
    iget v0, p0, Lv/f;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lv/f;->m:I

    .line 7
    .line 8
    iget-object v1, p0, Lv/f;->r:Lv/g;

    .line 9
    .line 10
    iget v1, v1, Lv/g;->Q0:I

    .line 11
    .line 12
    sub-int/2addr v0, v1

    .line 13
    return v0

    .line 14
    :cond_0
    iget v0, p0, Lv/f;->m:I

    .line 15
    .line 16
    return v0
.end method

.method public final d()I
    .locals 2

    .line 1
    iget v0, p0, Lv/f;->a:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lv/f;->l:I

    .line 6
    .line 7
    iget-object v1, p0, Lv/f;->r:Lv/g;

    .line 8
    .line 9
    iget v1, v1, Lv/g;->P0:I

    .line 10
    .line 11
    sub-int/2addr v0, v1

    .line 12
    return v0

    .line 13
    :cond_0
    iget v0, p0, Lv/f;->l:I

    .line 14
    .line 15
    return v0
.end method

.method public final e(I)V
    .locals 10

    .line 1
    iget v0, p0, Lv/f;->p:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v1, p0, Lv/f;->o:I

    .line 7
    .line 8
    div-int/2addr p1, v0

    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v8, 0x0

    .line 11
    :goto_0
    iget-object v2, p0, Lv/f;->r:Lv/g;

    .line 12
    .line 13
    if-ge v8, v1, :cond_4

    .line 14
    .line 15
    iget v3, p0, Lv/f;->n:I

    .line 16
    .line 17
    add-int/2addr v3, v8

    .line 18
    iget v4, v2, Lv/g;->b1:I

    .line 19
    .line 20
    if-lt v3, v4, :cond_1

    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_1
    iget-object v4, v2, Lv/g;->a1:[Lv/d;

    .line 24
    .line 25
    aget-object v7, v4, v3

    .line 26
    .line 27
    iget v3, p0, Lv/f;->a:I

    .line 28
    .line 29
    const/4 v4, 0x1

    .line 30
    const/4 v5, 0x1

    .line 31
    const/4 v6, 0x3

    .line 32
    if-nez v3, :cond_2

    .line 33
    .line 34
    if-eqz v7, :cond_3

    .line 35
    .line 36
    iget-object v3, v7, Lv/d;->p0:[I

    .line 37
    .line 38
    aget v9, v3, v0

    .line 39
    .line 40
    if-ne v9, v6, :cond_3

    .line 41
    .line 42
    iget v6, v7, Lv/d;->r:I

    .line 43
    .line 44
    if-nez v6, :cond_3

    .line 45
    .line 46
    aget v6, v3, v4

    .line 47
    .line 48
    invoke-virtual {v7}, Lv/d;->k()I

    .line 49
    .line 50
    .line 51
    move-result v9

    .line 52
    move v3, v5

    .line 53
    move v4, p1

    .line 54
    move v5, v6

    .line 55
    move v6, v9

    .line 56
    invoke-virtual/range {v2 .. v7}, Lv/g;->V(IIIILv/d;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    if-eqz v7, :cond_3

    .line 61
    .line 62
    iget-object v3, v7, Lv/d;->p0:[I

    .line 63
    .line 64
    aget v4, v3, v4

    .line 65
    .line 66
    if-ne v4, v6, :cond_3

    .line 67
    .line 68
    iget v4, v7, Lv/d;->s:I

    .line 69
    .line 70
    if-nez v4, :cond_3

    .line 71
    .line 72
    aget v3, v3, v0

    .line 73
    .line 74
    invoke-virtual {v7}, Lv/d;->q()I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    move v6, p1

    .line 79
    invoke-virtual/range {v2 .. v7}, Lv/g;->V(IIIILv/d;)V

    .line 80
    .line 81
    .line 82
    :cond_3
    :goto_1
    add-int/lit8 v8, v8, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_4
    :goto_2
    iput v0, p0, Lv/f;->l:I

    .line 86
    .line 87
    iput v0, p0, Lv/f;->m:I

    .line 88
    .line 89
    const/4 p1, 0x0

    .line 90
    iput-object p1, p0, Lv/f;->b:Lv/d;

    .line 91
    .line 92
    iput v0, p0, Lv/f;->c:I

    .line 93
    .line 94
    iget p1, p0, Lv/f;->o:I

    .line 95
    .line 96
    const/4 v1, 0x0

    .line 97
    :goto_3
    if-ge v1, p1, :cond_c

    .line 98
    .line 99
    iget v3, p0, Lv/f;->n:I

    .line 100
    .line 101
    add-int/2addr v3, v1

    .line 102
    iget v4, v2, Lv/g;->b1:I

    .line 103
    .line 104
    if-lt v3, v4, :cond_5

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_5
    iget-object v4, v2, Lv/g;->a1:[Lv/d;

    .line 108
    .line 109
    aget-object v3, v4, v3

    .line 110
    .line 111
    iget v4, p0, Lv/f;->a:I

    .line 112
    .line 113
    const/16 v5, 0x8

    .line 114
    .line 115
    if-nez v4, :cond_8

    .line 116
    .line 117
    invoke-virtual {v3}, Lv/d;->q()I

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    iget v6, v2, Lv/g;->P0:I

    .line 122
    .line 123
    iget v7, v3, Lv/d;->g0:I

    .line 124
    .line 125
    if-ne v7, v5, :cond_6

    .line 126
    .line 127
    const/4 v6, 0x0

    .line 128
    :cond_6
    iget v5, p0, Lv/f;->l:I

    .line 129
    .line 130
    add-int/2addr v4, v6

    .line 131
    add-int/2addr v4, v5

    .line 132
    iput v4, p0, Lv/f;->l:I

    .line 133
    .line 134
    iget v4, p0, Lv/f;->q:I

    .line 135
    .line 136
    invoke-virtual {v2, v3, v4}, Lv/g;->T(Lv/d;I)I

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    iget-object v5, p0, Lv/f;->b:Lv/d;

    .line 141
    .line 142
    if-eqz v5, :cond_7

    .line 143
    .line 144
    iget v5, p0, Lv/f;->c:I

    .line 145
    .line 146
    if-ge v5, v4, :cond_b

    .line 147
    .line 148
    :cond_7
    iput-object v3, p0, Lv/f;->b:Lv/d;

    .line 149
    .line 150
    iput v4, p0, Lv/f;->c:I

    .line 151
    .line 152
    iput v4, p0, Lv/f;->m:I

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_8
    iget v4, p0, Lv/f;->q:I

    .line 156
    .line 157
    invoke-virtual {v2, v3, v4}, Lv/g;->U(Lv/d;I)I

    .line 158
    .line 159
    .line 160
    move-result v4

    .line 161
    iget v6, p0, Lv/f;->q:I

    .line 162
    .line 163
    invoke-virtual {v2, v3, v6}, Lv/g;->T(Lv/d;I)I

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    iget v7, v2, Lv/g;->Q0:I

    .line 168
    .line 169
    iget v8, v3, Lv/d;->g0:I

    .line 170
    .line 171
    if-ne v8, v5, :cond_9

    .line 172
    .line 173
    const/4 v7, 0x0

    .line 174
    :cond_9
    iget v5, p0, Lv/f;->m:I

    .line 175
    .line 176
    add-int/2addr v6, v7

    .line 177
    add-int/2addr v6, v5

    .line 178
    iput v6, p0, Lv/f;->m:I

    .line 179
    .line 180
    iget-object v5, p0, Lv/f;->b:Lv/d;

    .line 181
    .line 182
    if-eqz v5, :cond_a

    .line 183
    .line 184
    iget v5, p0, Lv/f;->c:I

    .line 185
    .line 186
    if-ge v5, v4, :cond_b

    .line 187
    .line 188
    :cond_a
    iput-object v3, p0, Lv/f;->b:Lv/d;

    .line 189
    .line 190
    iput v4, p0, Lv/f;->c:I

    .line 191
    .line 192
    iput v4, p0, Lv/f;->l:I

    .line 193
    .line 194
    :cond_b
    :goto_4
    add-int/lit8 v1, v1, 0x1

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_c
    :goto_5
    return-void
.end method

.method public final f(ILv/c;Lv/c;Lv/c;Lv/c;IIIII)V
    .locals 0

    .line 1
    iput p1, p0, Lv/f;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lv/f;->d:Lv/c;

    .line 4
    .line 5
    iput-object p3, p0, Lv/f;->e:Lv/c;

    .line 6
    .line 7
    iput-object p4, p0, Lv/f;->f:Lv/c;

    .line 8
    .line 9
    iput-object p5, p0, Lv/f;->g:Lv/c;

    .line 10
    .line 11
    iput p6, p0, Lv/f;->h:I

    .line 12
    .line 13
    iput p7, p0, Lv/f;->i:I

    .line 14
    .line 15
    iput p8, p0, Lv/f;->j:I

    .line 16
    .line 17
    iput p9, p0, Lv/f;->k:I

    .line 18
    .line 19
    iput p10, p0, Lv/f;->q:I

    .line 20
    .line 21
    return-void
.end method
