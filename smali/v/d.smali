.class public Lv/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:I

.field public B:F

.field public final C:[I

.field public D:F

.field public E:Z

.field public F:Z

.field public G:I

.field public H:I

.field public final I:Lv/c;

.field public final J:Lv/c;

.field public final K:Lv/c;

.field public final L:Lv/c;

.field public final M:Lv/c;

.field public final N:Lv/c;

.field public final O:Lv/c;

.field public final P:Lv/c;

.field public final Q:[Lv/c;

.field public final R:Ljava/util/ArrayList;

.field public final S:[Z

.field public T:Lv/d;

.field public U:I

.field public V:I

.field public W:F

.field public X:I

.field public Y:I

.field public Z:I

.field public a:Z

.field public a0:I

.field public b:Lw/c;

.field public b0:I

.field public c:Lw/c;

.field public c0:I

.field public d:Lw/k;

.field public d0:F

.field public e:Lw/m;

.field public e0:F

.field public final f:[Z

.field public f0:Landroid/view/View;

.field public g:Z

.field public g0:I

.field public h:I

.field public h0:Ljava/lang/String;

.field public i:I

.field public i0:I

.field public j:Ljava/lang/String;

.field public j0:I

.field public k:Z

.field public final k0:[F

.field public l:Z

.field public final l0:[Lv/d;

.field public m:Z

.field public final m0:[Lv/d;

.field public n:Z

.field public n0:I

.field public o:I

.field public o0:I

.field public p:I

.field public final p0:[I

.field public q:I

.field public r:I

.field public s:I

.field public final t:[I

.field public u:I

.field public v:I

.field public w:F

.field public x:I

.field public y:I

.field public z:F


# direct methods
.method public constructor <init>()V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const/4 v2, 0x5

    .line 5
    const/4 v3, 0x4

    .line 6
    const/4 v4, 0x3

    .line 7
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    iput-boolean v5, v0, Lv/d;->a:Z

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    iput-object v6, v0, Lv/d;->d:Lw/k;

    .line 15
    .line 16
    iput-object v6, v0, Lv/d;->e:Lw/m;

    .line 17
    .line 18
    const/4 v7, 0x1

    .line 19
    const/4 v8, 0x2

    .line 20
    new-array v9, v8, [Z

    .line 21
    .line 22
    fill-array-data v9, :array_0

    .line 23
    .line 24
    .line 25
    iput-object v9, v0, Lv/d;->f:[Z

    .line 26
    .line 27
    iput-boolean v7, v0, Lv/d;->g:Z

    .line 28
    .line 29
    const/4 v9, -0x1

    .line 30
    iput v9, v0, Lv/d;->h:I

    .line 31
    .line 32
    iput v9, v0, Lv/d;->i:I

    .line 33
    .line 34
    new-instance v10, Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-boolean v5, v0, Lv/d;->k:Z

    .line 40
    .line 41
    iput-boolean v5, v0, Lv/d;->l:Z

    .line 42
    .line 43
    iput-boolean v5, v0, Lv/d;->m:Z

    .line 44
    .line 45
    iput-boolean v5, v0, Lv/d;->n:Z

    .line 46
    .line 47
    iput v9, v0, Lv/d;->o:I

    .line 48
    .line 49
    iput v9, v0, Lv/d;->p:I

    .line 50
    .line 51
    iput v5, v0, Lv/d;->q:I

    .line 52
    .line 53
    iput v5, v0, Lv/d;->r:I

    .line 54
    .line 55
    iput v5, v0, Lv/d;->s:I

    .line 56
    .line 57
    new-array v10, v8, [I

    .line 58
    .line 59
    iput-object v10, v0, Lv/d;->t:[I

    .line 60
    .line 61
    iput v5, v0, Lv/d;->u:I

    .line 62
    .line 63
    iput v5, v0, Lv/d;->v:I

    .line 64
    .line 65
    const/high16 v10, 0x3f800000    # 1.0f

    .line 66
    .line 67
    iput v10, v0, Lv/d;->w:F

    .line 68
    .line 69
    iput v5, v0, Lv/d;->x:I

    .line 70
    .line 71
    iput v5, v0, Lv/d;->y:I

    .line 72
    .line 73
    iput v10, v0, Lv/d;->z:F

    .line 74
    .line 75
    iput v9, v0, Lv/d;->A:I

    .line 76
    .line 77
    iput v10, v0, Lv/d;->B:F

    .line 78
    .line 79
    const v10, 0x7fffffff

    .line 80
    .line 81
    .line 82
    filled-new-array {v10, v10}, [I

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    iput-object v10, v0, Lv/d;->C:[I

    .line 87
    .line 88
    const/high16 v10, 0x7fc00000    # Float.NaN

    .line 89
    .line 90
    iput v10, v0, Lv/d;->D:F

    .line 91
    .line 92
    iput-boolean v5, v0, Lv/d;->E:Z

    .line 93
    .line 94
    iput-boolean v5, v0, Lv/d;->F:Z

    .line 95
    .line 96
    iput v5, v0, Lv/d;->G:I

    .line 97
    .line 98
    iput v5, v0, Lv/d;->H:I

    .line 99
    .line 100
    new-instance v10, Lv/c;

    .line 101
    .line 102
    invoke-direct {v10, v0, v8}, Lv/c;-><init>(Lv/d;I)V

    .line 103
    .line 104
    .line 105
    iput-object v10, v0, Lv/d;->I:Lv/c;

    .line 106
    .line 107
    new-instance v11, Lv/c;

    .line 108
    .line 109
    invoke-direct {v11, v0, v4}, Lv/c;-><init>(Lv/d;I)V

    .line 110
    .line 111
    .line 112
    iput-object v11, v0, Lv/d;->J:Lv/c;

    .line 113
    .line 114
    new-instance v12, Lv/c;

    .line 115
    .line 116
    invoke-direct {v12, v0, v3}, Lv/c;-><init>(Lv/d;I)V

    .line 117
    .line 118
    .line 119
    iput-object v12, v0, Lv/d;->K:Lv/c;

    .line 120
    .line 121
    new-instance v13, Lv/c;

    .line 122
    .line 123
    invoke-direct {v13, v0, v2}, Lv/c;-><init>(Lv/d;I)V

    .line 124
    .line 125
    .line 126
    iput-object v13, v0, Lv/d;->L:Lv/c;

    .line 127
    .line 128
    new-instance v14, Lv/c;

    .line 129
    .line 130
    invoke-direct {v14, v0, v1}, Lv/c;-><init>(Lv/d;I)V

    .line 131
    .line 132
    .line 133
    iput-object v14, v0, Lv/d;->M:Lv/c;

    .line 134
    .line 135
    new-instance v15, Lv/c;

    .line 136
    .line 137
    const/16 v9, 0x8

    .line 138
    .line 139
    invoke-direct {v15, v0, v9}, Lv/c;-><init>(Lv/d;I)V

    .line 140
    .line 141
    .line 142
    iput-object v15, v0, Lv/d;->N:Lv/c;

    .line 143
    .line 144
    new-instance v9, Lv/c;

    .line 145
    .line 146
    const/16 v6, 0x9

    .line 147
    .line 148
    invoke-direct {v9, v0, v6}, Lv/c;-><init>(Lv/d;I)V

    .line 149
    .line 150
    .line 151
    iput-object v9, v0, Lv/d;->O:Lv/c;

    .line 152
    .line 153
    new-instance v6, Lv/c;

    .line 154
    .line 155
    const/4 v2, 0x7

    .line 156
    invoke-direct {v6, v0, v2}, Lv/c;-><init>(Lv/d;I)V

    .line 157
    .line 158
    .line 159
    iput-object v6, v0, Lv/d;->P:Lv/c;

    .line 160
    .line 161
    new-array v1, v1, [Lv/c;

    .line 162
    .line 163
    aput-object v10, v1, v5

    .line 164
    .line 165
    aput-object v12, v1, v7

    .line 166
    .line 167
    aput-object v11, v1, v8

    .line 168
    .line 169
    aput-object v13, v1, v4

    .line 170
    .line 171
    aput-object v14, v1, v3

    .line 172
    .line 173
    const/4 v2, 0x5

    .line 174
    aput-object v6, v1, v2

    .line 175
    .line 176
    iput-object v1, v0, Lv/d;->Q:[Lv/c;

    .line 177
    .line 178
    new-instance v1, Ljava/util/ArrayList;

    .line 179
    .line 180
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 181
    .line 182
    .line 183
    iput-object v1, v0, Lv/d;->R:Ljava/util/ArrayList;

    .line 184
    .line 185
    new-array v2, v8, [Z

    .line 186
    .line 187
    iput-object v2, v0, Lv/d;->S:[Z

    .line 188
    .line 189
    filled-new-array {v7, v7}, [I

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    iput-object v2, v0, Lv/d;->p0:[I

    .line 194
    .line 195
    const/4 v2, 0x0

    .line 196
    iput-object v2, v0, Lv/d;->T:Lv/d;

    .line 197
    .line 198
    iput v5, v0, Lv/d;->U:I

    .line 199
    .line 200
    iput v5, v0, Lv/d;->V:I

    .line 201
    .line 202
    const/4 v2, 0x0

    .line 203
    iput v2, v0, Lv/d;->W:F

    .line 204
    .line 205
    const/4 v2, -0x1

    .line 206
    iput v2, v0, Lv/d;->X:I

    .line 207
    .line 208
    iput v5, v0, Lv/d;->Y:I

    .line 209
    .line 210
    iput v5, v0, Lv/d;->Z:I

    .line 211
    .line 212
    iput v5, v0, Lv/d;->a0:I

    .line 213
    .line 214
    const/high16 v2, 0x3f000000    # 0.5f

    .line 215
    .line 216
    iput v2, v0, Lv/d;->d0:F

    .line 217
    .line 218
    iput v2, v0, Lv/d;->e0:F

    .line 219
    .line 220
    iput v5, v0, Lv/d;->g0:I

    .line 221
    .line 222
    const/4 v2, 0x0

    .line 223
    iput-object v2, v0, Lv/d;->h0:Ljava/lang/String;

    .line 224
    .line 225
    iput v5, v0, Lv/d;->i0:I

    .line 226
    .line 227
    iput v5, v0, Lv/d;->j0:I

    .line 228
    .line 229
    new-array v3, v8, [F

    .line 230
    .line 231
    fill-array-data v3, :array_1

    .line 232
    .line 233
    .line 234
    iput-object v3, v0, Lv/d;->k0:[F

    .line 235
    .line 236
    new-array v3, v8, [Lv/d;

    .line 237
    .line 238
    aput-object v2, v3, v5

    .line 239
    .line 240
    aput-object v2, v3, v7

    .line 241
    .line 242
    iput-object v3, v0, Lv/d;->l0:[Lv/d;

    .line 243
    .line 244
    new-array v3, v8, [Lv/d;

    .line 245
    .line 246
    aput-object v2, v3, v5

    .line 247
    .line 248
    aput-object v2, v3, v7

    .line 249
    .line 250
    iput-object v3, v0, Lv/d;->m0:[Lv/d;

    .line 251
    .line 252
    const/4 v2, -0x1

    .line 253
    iput v2, v0, Lv/d;->n0:I

    .line 254
    .line 255
    iput v2, v0, Lv/d;->o0:I

    .line 256
    .line 257
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    invoke-virtual {v1, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    return-void

    .line 282
    nop

    .line 283
    :array_0
    .array-data 1
        0x1t
        0x1t
    .end array-data

    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    nop

    .line 289
    :array_1
    .array-data 4
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
    .end array-data
.end method

.method public static G(IILjava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 0

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    const-string p1, " :   "

    .line 8
    .line 9
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string p0, ",\n"

    .line 16
    .line 17
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static H(Ljava/lang/StringBuilder;Ljava/lang/String;FF)V
    .locals 0

    .line 1
    cmpl-float p3, p2, p3

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string p1, " :   "

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p1, ",\n"

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static o(Ljava/lang/StringBuilder;Ljava/lang/String;IIIIIFI)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    const-string p1, " :  {\n"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p1, 0x1

    if-eq p8, p1, :cond_3

    const/4 p1, 0x2

    if-eq p8, p1, :cond_2

    const/4 p1, 0x3

    if-eq p8, p1, :cond_1

    const/4 p1, 0x4

    if-ne p8, p1, :cond_0

    .line 3
    const-string p1, "MATCH_PARENT"

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    throw p0

    :cond_1
    const-string p1, "MATCH_CONSTRAINT"

    goto :goto_0

    :cond_2
    const-string p1, "WRAP_CONTENT"

    goto :goto_0

    :cond_3
    const-string p1, "FIXED"

    .line 4
    :goto_0
    const-string p8, "FIXED"

    invoke-virtual {p8, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p8

    if-eqz p8, :cond_4

    goto :goto_1

    .line 5
    :cond_4
    const-string p8, "      behavior"

    invoke-virtual {p0, p8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    const-string p8, " :   "

    invoke-virtual {p0, p8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    const-string p1, ",\n"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    :goto_1
    const-string p1, "      size"

    const/4 p8, 0x0

    invoke-static {p2, p8, p1, p0}, Lv/d;->G(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 10
    const-string p1, "      min"

    invoke-static {p3, p8, p1, p0}, Lv/d;->G(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 11
    const-string p1, "      max"

    const p2, 0x7fffffff

    invoke-static {p4, p2, p1, p0}, Lv/d;->G(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 12
    const-string p1, "      matchMin"

    invoke-static {p5, p8, p1, p0}, Lv/d;->G(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 13
    const-string p1, "      matchDef"

    invoke-static {p6, p8, p1, p0}, Lv/d;->G(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 14
    const-string p1, "      matchPercent"

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p0, p1, p7, p2}, Lv/d;->H(Ljava/lang/StringBuilder;Ljava/lang/String;FF)V

    .line 15
    const-string p1, "    },\n"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static p(Ljava/lang/StringBuilder;Ljava/lang/String;Lv/c;)V
    .locals 2

    .line 1
    iget-object v0, p2, Lv/c;->f:Lv/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string v0, "    "

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p1, " : [ \'"

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object p1, p2, Lv/c;->f:Lv/c;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p1, "\'"

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget p1, p2, Lv/c;->h:I

    .line 30
    .line 31
    const/high16 v0, -0x80000000

    .line 32
    .line 33
    if-ne p1, v0, :cond_1

    .line 34
    .line 35
    iget p1, p2, Lv/c;->g:I

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    :cond_1
    const-string p1, ","

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    iget v1, p2, Lv/c;->g:I

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget v1, p2, Lv/c;->h:I

    .line 50
    .line 51
    if-eq v1, v0, :cond_2

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget p2, p2, Lv/c;->h:I

    .line 57
    .line 58
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    :cond_2
    const-string p1, " ] ,\n"

    .line 65
    .line 66
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    return-void
.end method


# virtual methods
.method public A()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lv/d;->k:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lv/d;->I:Lv/c;

    .line 6
    .line 7
    iget-boolean v0, v0, Lv/c;->c:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lv/d;->K:Lv/c;

    .line 12
    .line 13
    iget-boolean v0, v0, Lv/c;->c:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 21
    :goto_1
    return v0
.end method

.method public B()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lv/d;->l:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lv/d;->J:Lv/c;

    .line 6
    .line 7
    iget-boolean v0, v0, Lv/c;->c:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lv/d;->L:Lv/c;

    .line 12
    .line 13
    iget-boolean v0, v0, Lv/c;->c:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 21
    :goto_1
    return v0
.end method

.method public C()V
    .locals 5

    .line 1
    iget-object v0, p0, Lv/d;->I:Lv/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv/c;->j()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv/d;->J:Lv/c;

    .line 7
    .line 8
    invoke-virtual {v0}, Lv/c;->j()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lv/d;->K:Lv/c;

    .line 12
    .line 13
    invoke-virtual {v0}, Lv/c;->j()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lv/d;->L:Lv/c;

    .line 17
    .line 18
    invoke-virtual {v0}, Lv/c;->j()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lv/d;->M:Lv/c;

    .line 22
    .line 23
    invoke-virtual {v0}, Lv/c;->j()V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lv/d;->N:Lv/c;

    .line 27
    .line 28
    invoke-virtual {v0}, Lv/c;->j()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lv/d;->O:Lv/c;

    .line 32
    .line 33
    invoke-virtual {v0}, Lv/c;->j()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lv/d;->P:Lv/c;

    .line 37
    .line 38
    invoke-virtual {v0}, Lv/c;->j()V

    .line 39
    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    iput-object v0, p0, Lv/d;->T:Lv/d;

    .line 43
    .line 44
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 45
    .line 46
    iput v1, p0, Lv/d;->D:F

    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    iput v1, p0, Lv/d;->U:I

    .line 50
    .line 51
    iput v1, p0, Lv/d;->V:I

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    iput v2, p0, Lv/d;->W:F

    .line 55
    .line 56
    const/4 v2, -0x1

    .line 57
    iput v2, p0, Lv/d;->X:I

    .line 58
    .line 59
    iput v1, p0, Lv/d;->Y:I

    .line 60
    .line 61
    iput v1, p0, Lv/d;->Z:I

    .line 62
    .line 63
    iput v1, p0, Lv/d;->a0:I

    .line 64
    .line 65
    iput v1, p0, Lv/d;->b0:I

    .line 66
    .line 67
    iput v1, p0, Lv/d;->c0:I

    .line 68
    .line 69
    const/high16 v3, 0x3f000000    # 0.5f

    .line 70
    .line 71
    iput v3, p0, Lv/d;->d0:F

    .line 72
    .line 73
    iput v3, p0, Lv/d;->e0:F

    .line 74
    .line 75
    iget-object v3, p0, Lv/d;->p0:[I

    .line 76
    .line 77
    const/4 v4, 0x1

    .line 78
    aput v4, v3, v1

    .line 79
    .line 80
    aput v4, v3, v4

    .line 81
    .line 82
    iput-object v0, p0, Lv/d;->f0:Landroid/view/View;

    .line 83
    .line 84
    iput v1, p0, Lv/d;->g0:I

    .line 85
    .line 86
    iput v1, p0, Lv/d;->i0:I

    .line 87
    .line 88
    iput v1, p0, Lv/d;->j0:I

    .line 89
    .line 90
    iget-object v0, p0, Lv/d;->k0:[F

    .line 91
    .line 92
    const/high16 v3, -0x40800000    # -1.0f

    .line 93
    .line 94
    aput v3, v0, v1

    .line 95
    .line 96
    aput v3, v0, v4

    .line 97
    .line 98
    iput v2, p0, Lv/d;->o:I

    .line 99
    .line 100
    iput v2, p0, Lv/d;->p:I

    .line 101
    .line 102
    iget-object v0, p0, Lv/d;->C:[I

    .line 103
    .line 104
    const v3, 0x7fffffff

    .line 105
    .line 106
    .line 107
    aput v3, v0, v1

    .line 108
    .line 109
    aput v3, v0, v4

    .line 110
    .line 111
    iput v1, p0, Lv/d;->r:I

    .line 112
    .line 113
    iput v1, p0, Lv/d;->s:I

    .line 114
    .line 115
    const/high16 v0, 0x3f800000    # 1.0f

    .line 116
    .line 117
    iput v0, p0, Lv/d;->w:F

    .line 118
    .line 119
    iput v0, p0, Lv/d;->z:F

    .line 120
    .line 121
    iput v3, p0, Lv/d;->v:I

    .line 122
    .line 123
    iput v3, p0, Lv/d;->y:I

    .line 124
    .line 125
    iput v1, p0, Lv/d;->u:I

    .line 126
    .line 127
    iput v1, p0, Lv/d;->x:I

    .line 128
    .line 129
    iput v2, p0, Lv/d;->A:I

    .line 130
    .line 131
    iput v0, p0, Lv/d;->B:F

    .line 132
    .line 133
    iget-object v0, p0, Lv/d;->f:[Z

    .line 134
    .line 135
    aput-boolean v4, v0, v1

    .line 136
    .line 137
    aput-boolean v4, v0, v4

    .line 138
    .line 139
    iput-boolean v1, p0, Lv/d;->F:Z

    .line 140
    .line 141
    iget-object v0, p0, Lv/d;->S:[Z

    .line 142
    .line 143
    aput-boolean v1, v0, v1

    .line 144
    .line 145
    aput-boolean v1, v0, v4

    .line 146
    .line 147
    iput-boolean v4, p0, Lv/d;->g:Z

    .line 148
    .line 149
    iget-object v0, p0, Lv/d;->t:[I

    .line 150
    .line 151
    aput v1, v0, v1

    .line 152
    .line 153
    aput v1, v0, v4

    .line 154
    .line 155
    iput v2, p0, Lv/d;->h:I

    .line 156
    .line 157
    iput v2, p0, Lv/d;->i:I

    .line 158
    .line 159
    return-void
.end method

.method public final D()V
    .locals 4

    .line 1
    iget-object v0, p0, Lv/d;->T:Lv/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    instance-of v1, v0, Lv/e;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lv/e;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lv/d;->R:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    :goto_0
    if-ge v2, v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Lv/c;

    .line 28
    .line 29
    invoke-virtual {v3}, Lv/c;->j()V

    .line 30
    .line 31
    .line 32
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-void
.end method

.method public final E()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lv/d;->k:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lv/d;->l:Z

    .line 5
    .line 6
    iput-boolean v0, p0, Lv/d;->m:Z

    .line 7
    .line 8
    iput-boolean v0, p0, Lv/d;->n:Z

    .line 9
    .line 10
    iget-object v1, p0, Lv/d;->R:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_0
    if-ge v3, v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, Lv/c;

    .line 24
    .line 25
    iput-boolean v0, v4, Lv/c;->c:Z

    .line 26
    .line 27
    iput v0, v4, Lv/c;->b:I

    .line 28
    .line 29
    add-int/lit8 v3, v3, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
.end method

.method public F(Landroid/support/v4/media/session/t;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lv/d;->I:Lv/c;

    .line 2
    .line 3
    invoke-virtual {p1}, Lv/c;->k()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lv/d;->J:Lv/c;

    .line 7
    .line 8
    invoke-virtual {p1}, Lv/c;->k()V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lv/d;->K:Lv/c;

    .line 12
    .line 13
    invoke-virtual {p1}, Lv/c;->k()V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lv/d;->L:Lv/c;

    .line 17
    .line 18
    invoke-virtual {p1}, Lv/c;->k()V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lv/d;->M:Lv/c;

    .line 22
    .line 23
    invoke-virtual {p1}, Lv/c;->k()V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lv/d;->P:Lv/c;

    .line 27
    .line 28
    invoke-virtual {p1}, Lv/c;->k()V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lv/d;->N:Lv/c;

    .line 32
    .line 33
    invoke-virtual {p1}, Lv/c;->k()V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lv/d;->O:Lv/c;

    .line 37
    .line 38
    invoke-virtual {p1}, Lv/c;->k()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final I(I)V
    .locals 0

    .line 1
    iput p1, p0, Lv/d;->a0:I

    .line 2
    .line 3
    if-lez p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    :goto_0
    iput-boolean p1, p0, Lv/d;->E:Z

    .line 9
    .line 10
    return-void
.end method

.method public final J(II)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lv/d;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lv/d;->I:Lv/c;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lv/c;->l(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lv/d;->K:Lv/c;

    .line 12
    .line 13
    invoke-virtual {v0, p2}, Lv/c;->l(I)V

    .line 14
    .line 15
    .line 16
    iput p1, p0, Lv/d;->Y:I

    .line 17
    .line 18
    sub-int/2addr p2, p1

    .line 19
    iput p2, p0, Lv/d;->U:I

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, Lv/d;->k:Z

    .line 23
    .line 24
    return-void
.end method

.method public final K(II)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lv/d;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lv/d;->J:Lv/c;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lv/c;->l(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lv/d;->L:Lv/c;

    .line 12
    .line 13
    invoke-virtual {v0, p2}, Lv/c;->l(I)V

    .line 14
    .line 15
    .line 16
    iput p1, p0, Lv/d;->Z:I

    .line 17
    .line 18
    sub-int/2addr p2, p1

    .line 19
    iput p2, p0, Lv/d;->V:I

    .line 20
    .line 21
    iget-boolean p2, p0, Lv/d;->E:Z

    .line 22
    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    iget p2, p0, Lv/d;->a0:I

    .line 26
    .line 27
    add-int/2addr p1, p2

    .line 28
    iget-object p2, p0, Lv/d;->M:Lv/c;

    .line 29
    .line 30
    invoke-virtual {p2, p1}, Lv/c;->l(I)V

    .line 31
    .line 32
    .line 33
    :cond_1
    const/4 p1, 0x1

    .line 34
    iput-boolean p1, p0, Lv/d;->l:Z

    .line 35
    .line 36
    return-void
.end method

.method public final L(I)V
    .locals 1

    .line 1
    iput p1, p0, Lv/d;->V:I

    .line 2
    .line 3
    iget v0, p0, Lv/d;->c0:I

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    iput v0, p0, Lv/d;->V:I

    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public final M(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv/d;->p0:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aput p1, v0, v1

    .line 5
    .line 6
    return-void
.end method

.method public final N(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv/d;->p0:[I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aput p1, v0, v1

    .line 5
    .line 6
    return-void
.end method

.method public final O(I)V
    .locals 1

    .line 1
    iput p1, p0, Lv/d;->U:I

    .line 2
    .line 3
    iget v0, p0, Lv/d;->b0:I

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    iput v0, p0, Lv/d;->U:I

    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public P(ZZ)V
    .locals 7

    .line 1
    iget-object v0, p0, Lv/d;->d:Lw/k;

    .line 2
    .line 3
    iget-boolean v1, v0, Lw/o;->g:Z

    .line 4
    .line 5
    and-int/2addr p1, v1

    .line 6
    iget-object v1, p0, Lv/d;->e:Lw/m;

    .line 7
    .line 8
    iget-boolean v2, v1, Lw/o;->g:Z

    .line 9
    .line 10
    and-int/2addr p2, v2

    .line 11
    iget-object v2, v0, Lw/o;->h:Lw/f;

    .line 12
    .line 13
    iget v2, v2, Lw/f;->g:I

    .line 14
    .line 15
    iget-object v3, v1, Lw/o;->h:Lw/f;

    .line 16
    .line 17
    iget v3, v3, Lw/f;->g:I

    .line 18
    .line 19
    iget-object v0, v0, Lw/o;->i:Lw/f;

    .line 20
    .line 21
    iget v0, v0, Lw/f;->g:I

    .line 22
    .line 23
    iget-object v1, v1, Lw/o;->i:Lw/f;

    .line 24
    .line 25
    iget v1, v1, Lw/f;->g:I

    .line 26
    .line 27
    sub-int v4, v0, v2

    .line 28
    .line 29
    sub-int v5, v1, v3

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    if-ltz v4, :cond_0

    .line 33
    .line 34
    if-ltz v5, :cond_0

    .line 35
    .line 36
    const/high16 v4, -0x80000000

    .line 37
    .line 38
    if-eq v2, v4, :cond_0

    .line 39
    .line 40
    const v5, 0x7fffffff

    .line 41
    .line 42
    .line 43
    if-eq v2, v5, :cond_0

    .line 44
    .line 45
    if-eq v3, v4, :cond_0

    .line 46
    .line 47
    if-eq v3, v5, :cond_0

    .line 48
    .line 49
    if-eq v0, v4, :cond_0

    .line 50
    .line 51
    if-eq v0, v5, :cond_0

    .line 52
    .line 53
    if-eq v1, v4, :cond_0

    .line 54
    .line 55
    if-ne v1, v5, :cond_1

    .line 56
    .line 57
    :cond_0
    const/4 v0, 0x0

    .line 58
    const/4 v1, 0x0

    .line 59
    const/4 v2, 0x0

    .line 60
    const/4 v3, 0x0

    .line 61
    :cond_1
    sub-int/2addr v0, v2

    .line 62
    sub-int/2addr v1, v3

    .line 63
    if-eqz p1, :cond_2

    .line 64
    .line 65
    iput v2, p0, Lv/d;->Y:I

    .line 66
    .line 67
    :cond_2
    if-eqz p2, :cond_3

    .line 68
    .line 69
    iput v3, p0, Lv/d;->Z:I

    .line 70
    .line 71
    :cond_3
    iget v2, p0, Lv/d;->g0:I

    .line 72
    .line 73
    const/16 v3, 0x8

    .line 74
    .line 75
    if-ne v2, v3, :cond_4

    .line 76
    .line 77
    iput v6, p0, Lv/d;->U:I

    .line 78
    .line 79
    iput v6, p0, Lv/d;->V:I

    .line 80
    .line 81
    return-void

    .line 82
    :cond_4
    iget-object v2, p0, Lv/d;->p0:[I

    .line 83
    .line 84
    const/4 v3, 0x1

    .line 85
    if-eqz p1, :cond_6

    .line 86
    .line 87
    aget p1, v2, v6

    .line 88
    .line 89
    if-ne p1, v3, :cond_5

    .line 90
    .line 91
    iget p1, p0, Lv/d;->U:I

    .line 92
    .line 93
    if-ge v0, p1, :cond_5

    .line 94
    .line 95
    move v0, p1

    .line 96
    :cond_5
    iput v0, p0, Lv/d;->U:I

    .line 97
    .line 98
    iget p1, p0, Lv/d;->b0:I

    .line 99
    .line 100
    if-ge v0, p1, :cond_6

    .line 101
    .line 102
    iput p1, p0, Lv/d;->U:I

    .line 103
    .line 104
    :cond_6
    if-eqz p2, :cond_8

    .line 105
    .line 106
    aget p1, v2, v3

    .line 107
    .line 108
    if-ne p1, v3, :cond_7

    .line 109
    .line 110
    iget p1, p0, Lv/d;->V:I

    .line 111
    .line 112
    if-ge v1, p1, :cond_7

    .line 113
    .line 114
    move v1, p1

    .line 115
    :cond_7
    iput v1, p0, Lv/d;->V:I

    .line 116
    .line 117
    iget p1, p0, Lv/d;->c0:I

    .line 118
    .line 119
    if-ge v1, p1, :cond_8

    .line 120
    .line 121
    iput p1, p0, Lv/d;->V:I

    .line 122
    .line 123
    :cond_8
    return-void
.end method

.method public Q(Lt/c;Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Lv/d;->I:Lv/c;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lt/c;->n(Ljava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iget-object v0, p0, Lv/d;->J:Lv/c;

    .line 11
    .line 12
    invoke-static {v0}, Lt/c;->n(Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v1, p0, Lv/d;->K:Lv/c;

    .line 17
    .line 18
    invoke-static {v1}, Lt/c;->n(Ljava/lang/Object;)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iget-object v2, p0, Lv/d;->L:Lv/c;

    .line 23
    .line 24
    invoke-static {v2}, Lt/c;->n(Ljava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz p2, :cond_0

    .line 29
    .line 30
    iget-object v3, p0, Lv/d;->d:Lw/k;

    .line 31
    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    iget-object v4, v3, Lw/o;->h:Lw/f;

    .line 35
    .line 36
    iget-boolean v5, v4, Lw/f;->j:Z

    .line 37
    .line 38
    if-eqz v5, :cond_0

    .line 39
    .line 40
    iget-object v3, v3, Lw/o;->i:Lw/f;

    .line 41
    .line 42
    iget-boolean v5, v3, Lw/f;->j:Z

    .line 43
    .line 44
    if-eqz v5, :cond_0

    .line 45
    .line 46
    iget p1, v4, Lw/f;->g:I

    .line 47
    .line 48
    iget v1, v3, Lw/f;->g:I

    .line 49
    .line 50
    :cond_0
    if-eqz p2, :cond_1

    .line 51
    .line 52
    iget-object p2, p0, Lv/d;->e:Lw/m;

    .line 53
    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    iget-object v3, p2, Lw/o;->h:Lw/f;

    .line 57
    .line 58
    iget-boolean v4, v3, Lw/f;->j:Z

    .line 59
    .line 60
    if-eqz v4, :cond_1

    .line 61
    .line 62
    iget-object p2, p2, Lw/o;->i:Lw/f;

    .line 63
    .line 64
    iget-boolean v4, p2, Lw/f;->j:Z

    .line 65
    .line 66
    if-eqz v4, :cond_1

    .line 67
    .line 68
    iget v0, v3, Lw/f;->g:I

    .line 69
    .line 70
    iget v2, p2, Lw/f;->g:I

    .line 71
    .line 72
    :cond_1
    sub-int p2, v1, p1

    .line 73
    .line 74
    sub-int v3, v2, v0

    .line 75
    .line 76
    const/4 v4, 0x0

    .line 77
    if-ltz p2, :cond_2

    .line 78
    .line 79
    if-ltz v3, :cond_2

    .line 80
    .line 81
    const/high16 p2, -0x80000000

    .line 82
    .line 83
    if-eq p1, p2, :cond_2

    .line 84
    .line 85
    const v3, 0x7fffffff

    .line 86
    .line 87
    .line 88
    if-eq p1, v3, :cond_2

    .line 89
    .line 90
    if-eq v0, p2, :cond_2

    .line 91
    .line 92
    if-eq v0, v3, :cond_2

    .line 93
    .line 94
    if-eq v1, p2, :cond_2

    .line 95
    .line 96
    if-eq v1, v3, :cond_2

    .line 97
    .line 98
    if-eq v2, p2, :cond_2

    .line 99
    .line 100
    if-ne v2, v3, :cond_3

    .line 101
    .line 102
    :cond_2
    const/4 p1, 0x0

    .line 103
    const/4 v0, 0x0

    .line 104
    const/4 v1, 0x0

    .line 105
    const/4 v2, 0x0

    .line 106
    :cond_3
    sub-int/2addr v1, p1

    .line 107
    sub-int/2addr v2, v0

    .line 108
    iput p1, p0, Lv/d;->Y:I

    .line 109
    .line 110
    iput v0, p0, Lv/d;->Z:I

    .line 111
    .line 112
    iget p1, p0, Lv/d;->g0:I

    .line 113
    .line 114
    const/16 p2, 0x8

    .line 115
    .line 116
    if-ne p1, p2, :cond_4

    .line 117
    .line 118
    iput v4, p0, Lv/d;->U:I

    .line 119
    .line 120
    iput v4, p0, Lv/d;->V:I

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_4
    iget-object p1, p0, Lv/d;->p0:[I

    .line 124
    .line 125
    aget p2, p1, v4

    .line 126
    .line 127
    const/4 v0, 0x1

    .line 128
    if-ne p2, v0, :cond_5

    .line 129
    .line 130
    iget v3, p0, Lv/d;->U:I

    .line 131
    .line 132
    if-ge v1, v3, :cond_5

    .line 133
    .line 134
    move v1, v3

    .line 135
    :cond_5
    aget v3, p1, v0

    .line 136
    .line 137
    if-ne v3, v0, :cond_6

    .line 138
    .line 139
    iget v3, p0, Lv/d;->V:I

    .line 140
    .line 141
    if-ge v2, v3, :cond_6

    .line 142
    .line 143
    move v2, v3

    .line 144
    :cond_6
    iput v1, p0, Lv/d;->U:I

    .line 145
    .line 146
    iput v2, p0, Lv/d;->V:I

    .line 147
    .line 148
    iget v3, p0, Lv/d;->c0:I

    .line 149
    .line 150
    if-ge v2, v3, :cond_7

    .line 151
    .line 152
    iput v3, p0, Lv/d;->V:I

    .line 153
    .line 154
    :cond_7
    iget v3, p0, Lv/d;->b0:I

    .line 155
    .line 156
    if-ge v1, v3, :cond_8

    .line 157
    .line 158
    iput v3, p0, Lv/d;->U:I

    .line 159
    .line 160
    :cond_8
    iget v3, p0, Lv/d;->v:I

    .line 161
    .line 162
    const/4 v4, 0x3

    .line 163
    if-lez v3, :cond_9

    .line 164
    .line 165
    if-ne p2, v4, :cond_9

    .line 166
    .line 167
    iget p2, p0, Lv/d;->U:I

    .line 168
    .line 169
    invoke-static {p2, v3}, Ljava/lang/Math;->min(II)I

    .line 170
    .line 171
    .line 172
    move-result p2

    .line 173
    iput p2, p0, Lv/d;->U:I

    .line 174
    .line 175
    :cond_9
    iget p2, p0, Lv/d;->y:I

    .line 176
    .line 177
    if-lez p2, :cond_a

    .line 178
    .line 179
    aget p1, p1, v0

    .line 180
    .line 181
    if-ne p1, v4, :cond_a

    .line 182
    .line 183
    iget p1, p0, Lv/d;->V:I

    .line 184
    .line 185
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    iput p1, p0, Lv/d;->V:I

    .line 190
    .line 191
    :cond_a
    iget p1, p0, Lv/d;->U:I

    .line 192
    .line 193
    if-eq v1, p1, :cond_b

    .line 194
    .line 195
    iput p1, p0, Lv/d;->h:I

    .line 196
    .line 197
    :cond_b
    iget p1, p0, Lv/d;->V:I

    .line 198
    .line 199
    if-eq v2, p1, :cond_c

    .line 200
    .line 201
    iput p1, p0, Lv/d;->i:I

    .line 202
    .line 203
    :cond_c
    :goto_0
    return-void
.end method

.method public final a(Lv/e;Lt/c;Ljava/util/HashSet;IZ)V
    .locals 7

    .line 1
    if-eqz p5, :cond_1

    .line 2
    .line 3
    invoke-virtual {p3, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p5

    .line 7
    if-nez p5, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-static {p1, p2, p0}, Lv/j;->b(Lv/e;Lt/c;Lv/d;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p3, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    const/16 p5, 0x40

    .line 17
    .line 18
    invoke-virtual {p1, p5}, Lv/e;->W(I)Z

    .line 19
    .line 20
    .line 21
    move-result p5

    .line 22
    invoke-virtual {p0, p2, p5}, Lv/d;->b(Lt/c;Z)V

    .line 23
    .line 24
    .line 25
    :cond_1
    if-nez p4, :cond_3

    .line 26
    .line 27
    iget-object p5, p0, Lv/d;->I:Lv/c;

    .line 28
    .line 29
    iget-object p5, p5, Lv/c;->a:Ljava/util/HashSet;

    .line 30
    .line 31
    if-eqz p5, :cond_2

    .line 32
    .line 33
    invoke-virtual {p5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p5

    .line 37
    :goto_0
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lv/c;

    .line 48
    .line 49
    iget-object v1, v0, Lv/c;->d:Lv/d;

    .line 50
    .line 51
    const/4 v6, 0x1

    .line 52
    move-object v2, p1

    .line 53
    move-object v3, p2

    .line 54
    move-object v4, p3

    .line 55
    move v5, p4

    .line 56
    invoke-virtual/range {v1 .. v6}, Lv/d;->a(Lv/e;Lt/c;Ljava/util/HashSet;IZ)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    iget-object p5, p0, Lv/d;->K:Lv/c;

    .line 61
    .line 62
    iget-object p5, p5, Lv/c;->a:Ljava/util/HashSet;

    .line 63
    .line 64
    if-eqz p5, :cond_6

    .line 65
    .line 66
    invoke-virtual {p5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object p5

    .line 70
    :goto_1
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_6

    .line 75
    .line 76
    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Lv/c;

    .line 81
    .line 82
    iget-object v1, v0, Lv/c;->d:Lv/d;

    .line 83
    .line 84
    const/4 v6, 0x1

    .line 85
    move-object v2, p1

    .line 86
    move-object v3, p2

    .line 87
    move-object v4, p3

    .line 88
    move v5, p4

    .line 89
    invoke-virtual/range {v1 .. v6}, Lv/d;->a(Lv/e;Lt/c;Ljava/util/HashSet;IZ)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    iget-object p5, p0, Lv/d;->J:Lv/c;

    .line 94
    .line 95
    iget-object p5, p5, Lv/c;->a:Ljava/util/HashSet;

    .line 96
    .line 97
    if-eqz p5, :cond_4

    .line 98
    .line 99
    invoke-virtual {p5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object p5

    .line 103
    :goto_2
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_4

    .line 108
    .line 109
    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, Lv/c;

    .line 114
    .line 115
    iget-object v1, v0, Lv/c;->d:Lv/d;

    .line 116
    .line 117
    const/4 v6, 0x1

    .line 118
    move-object v2, p1

    .line 119
    move-object v3, p2

    .line 120
    move-object v4, p3

    .line 121
    move v5, p4

    .line 122
    invoke-virtual/range {v1 .. v6}, Lv/d;->a(Lv/e;Lt/c;Ljava/util/HashSet;IZ)V

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_4
    iget-object p5, p0, Lv/d;->L:Lv/c;

    .line 127
    .line 128
    iget-object p5, p5, Lv/c;->a:Ljava/util/HashSet;

    .line 129
    .line 130
    if-eqz p5, :cond_5

    .line 131
    .line 132
    invoke-virtual {p5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object p5

    .line 136
    :goto_3
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_5

    .line 141
    .line 142
    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    check-cast v0, Lv/c;

    .line 147
    .line 148
    iget-object v1, v0, Lv/c;->d:Lv/d;

    .line 149
    .line 150
    const/4 v6, 0x1

    .line 151
    move-object v2, p1

    .line 152
    move-object v3, p2

    .line 153
    move-object v4, p3

    .line 154
    move v5, p4

    .line 155
    invoke-virtual/range {v1 .. v6}, Lv/d;->a(Lv/e;Lt/c;Ljava/util/HashSet;IZ)V

    .line 156
    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_5
    iget-object p5, p0, Lv/d;->M:Lv/c;

    .line 160
    .line 161
    iget-object p5, p5, Lv/c;->a:Ljava/util/HashSet;

    .line 162
    .line 163
    if-eqz p5, :cond_6

    .line 164
    .line 165
    invoke-virtual {p5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object p5

    .line 169
    :goto_4
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-eqz v0, :cond_6

    .line 174
    .line 175
    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    check-cast v0, Lv/c;

    .line 180
    .line 181
    iget-object v1, v0, Lv/c;->d:Lv/d;

    .line 182
    .line 183
    const/4 v6, 0x1

    .line 184
    move-object v2, p1

    .line 185
    move-object v3, p2

    .line 186
    move-object v4, p3

    .line 187
    move v5, p4

    .line 188
    :try_start_0
    invoke-virtual/range {v1 .. v6}, Lv/d;->a(Lv/e;Lt/c;Ljava/util/HashSet;IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 189
    .line 190
    .line 191
    goto :goto_4

    .line 192
    :catchall_0
    move-exception p1

    .line 193
    throw p1

    .line 194
    :cond_6
    return-void
.end method

.method public b(Lt/c;Z)V
    .locals 58

    .line 1
    move-object/from16 v15, p0

    .line 2
    .line 3
    move-object/from16 v14, p1

    .line 4
    .line 5
    iget-object v0, v15, Lv/d;->I:Lv/c;

    .line 6
    .line 7
    invoke-virtual {v14, v0}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    .line 8
    .line 9
    .line 10
    move-result-object v13

    .line 11
    iget-object v1, v15, Lv/d;->K:Lv/c;

    .line 12
    .line 13
    invoke-virtual {v14, v1}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    .line 14
    .line 15
    .line 16
    move-result-object v12

    .line 17
    iget-object v2, v15, Lv/d;->J:Lv/c;

    .line 18
    .line 19
    invoke-virtual {v14, v2}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    .line 20
    .line 21
    .line 22
    move-result-object v9

    .line 23
    iget-object v8, v15, Lv/d;->L:Lv/c;

    .line 24
    .line 25
    invoke-virtual {v14, v8}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    iget-object v6, v15, Lv/d;->M:Lv/c;

    .line 30
    .line 31
    invoke-virtual {v14, v6}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    iget-object v3, v15, Lv/d;->T:Lv/d;

    .line 36
    .line 37
    const/4 v4, 0x2

    .line 38
    const/4 v11, 0x0

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    iget-object v3, v3, Lv/d;->p0:[I

    .line 42
    .line 43
    aget v10, v3, v11

    .line 44
    .line 45
    if-ne v10, v4, :cond_0

    .line 46
    .line 47
    const/4 v10, 0x1

    .line 48
    const/16 v18, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const/4 v10, 0x1

    .line 52
    const/16 v18, 0x0

    .line 53
    .line 54
    :goto_0
    aget v3, v3, v10

    .line 55
    .line 56
    if-ne v3, v4, :cond_1

    .line 57
    .line 58
    const/4 v3, 0x1

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    const/4 v3, 0x0

    .line 61
    :goto_1
    iget v11, v15, Lv/d;->q:I

    .line 62
    .line 63
    if-eq v11, v10, :cond_4

    .line 64
    .line 65
    if-eq v11, v4, :cond_3

    .line 66
    .line 67
    const/4 v10, 0x3

    .line 68
    if-eq v11, v10, :cond_2

    .line 69
    .line 70
    move/from16 v28, v3

    .line 71
    .line 72
    move/from16 v29, v18

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_2
    const/16 v28, 0x0

    .line 76
    .line 77
    :goto_2
    const/16 v29, 0x0

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_3
    move/from16 v28, v3

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    move/from16 v29, v18

    .line 84
    .line 85
    const/16 v28, 0x0

    .line 86
    .line 87
    :goto_3
    iget v3, v15, Lv/d;->g0:I

    .line 88
    .line 89
    iget-object v10, v15, Lv/d;->S:[Z

    .line 90
    .line 91
    const/16 v11, 0x8

    .line 92
    .line 93
    if-ne v3, v11, :cond_8

    .line 94
    .line 95
    iget-object v3, v15, Lv/d;->R:Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    const/4 v11, 0x0

    .line 102
    :goto_4
    if-ge v11, v4, :cond_7

    .line 103
    .line 104
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v21

    .line 108
    move-object/from16 v22, v3

    .line 109
    .line 110
    move-object/from16 v3, v21

    .line 111
    .line 112
    check-cast v3, Lv/c;

    .line 113
    .line 114
    iget-object v3, v3, Lv/c;->a:Ljava/util/HashSet;

    .line 115
    .line 116
    if-nez v3, :cond_5

    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_5
    invoke-virtual {v3}, Ljava/util/HashSet;->size()I

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    if-lez v3, :cond_6

    .line 124
    .line 125
    goto :goto_6

    .line 126
    :cond_6
    :goto_5
    add-int/lit8 v11, v11, 0x1

    .line 127
    .line 128
    move-object/from16 v3, v22

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_7
    const/4 v3, 0x0

    .line 132
    aget-boolean v4, v10, v3

    .line 133
    .line 134
    if-nez v4, :cond_8

    .line 135
    .line 136
    const/4 v3, 0x1

    .line 137
    aget-boolean v4, v10, v3

    .line 138
    .line 139
    if-nez v4, :cond_8

    .line 140
    .line 141
    return-void

    .line 142
    :cond_8
    :goto_6
    iget-boolean v3, v15, Lv/d;->k:Z

    .line 143
    .line 144
    if-nez v3, :cond_9

    .line 145
    .line 146
    iget-boolean v4, v15, Lv/d;->l:Z

    .line 147
    .line 148
    if-eqz v4, :cond_14

    .line 149
    .line 150
    :cond_9
    if-eqz v3, :cond_d

    .line 151
    .line 152
    iget v3, v15, Lv/d;->Y:I

    .line 153
    .line 154
    invoke-virtual {v14, v13, v3}, Lt/c;->d(Lt/f;I)V

    .line 155
    .line 156
    .line 157
    iget v3, v15, Lv/d;->Y:I

    .line 158
    .line 159
    iget v4, v15, Lv/d;->U:I

    .line 160
    .line 161
    add-int/2addr v3, v4

    .line 162
    invoke-virtual {v14, v12, v3}, Lt/c;->d(Lt/f;I)V

    .line 163
    .line 164
    .line 165
    if-eqz v29, :cond_d

    .line 166
    .line 167
    iget-object v3, v15, Lv/d;->T:Lv/d;

    .line 168
    .line 169
    if-eqz v3, :cond_d

    .line 170
    .line 171
    check-cast v3, Lv/e;

    .line 172
    .line 173
    iget-object v4, v3, Lv/e;->H0:Ljava/lang/ref/WeakReference;

    .line 174
    .line 175
    if-eqz v4, :cond_a

    .line 176
    .line 177
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    if-eqz v4, :cond_a

    .line 182
    .line 183
    invoke-virtual {v0}, Lv/c;->d()I

    .line 184
    .line 185
    .line 186
    move-result v4

    .line 187
    iget-object v11, v3, Lv/e;->H0:Ljava/lang/ref/WeakReference;

    .line 188
    .line 189
    invoke-virtual {v11}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v11

    .line 193
    check-cast v11, Lv/c;

    .line 194
    .line 195
    invoke-virtual {v11}, Lv/c;->d()I

    .line 196
    .line 197
    .line 198
    move-result v11

    .line 199
    if-le v4, v11, :cond_b

    .line 200
    .line 201
    :cond_a
    new-instance v4, Ljava/lang/ref/WeakReference;

    .line 202
    .line 203
    invoke-direct {v4, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    iput-object v4, v3, Lv/e;->H0:Ljava/lang/ref/WeakReference;

    .line 207
    .line 208
    :cond_b
    iget-object v4, v3, Lv/e;->J0:Ljava/lang/ref/WeakReference;

    .line 209
    .line 210
    if-eqz v4, :cond_c

    .line 211
    .line 212
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    if-eqz v4, :cond_c

    .line 217
    .line 218
    invoke-virtual {v1}, Lv/c;->d()I

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    iget-object v11, v3, Lv/e;->J0:Ljava/lang/ref/WeakReference;

    .line 223
    .line 224
    invoke-virtual {v11}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v11

    .line 228
    check-cast v11, Lv/c;

    .line 229
    .line 230
    invoke-virtual {v11}, Lv/c;->d()I

    .line 231
    .line 232
    .line 233
    move-result v11

    .line 234
    if-le v4, v11, :cond_d

    .line 235
    .line 236
    :cond_c
    new-instance v4, Ljava/lang/ref/WeakReference;

    .line 237
    .line 238
    invoke-direct {v4, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    iput-object v4, v3, Lv/e;->J0:Ljava/lang/ref/WeakReference;

    .line 242
    .line 243
    :cond_d
    iget-boolean v3, v15, Lv/d;->l:Z

    .line 244
    .line 245
    if-eqz v3, :cond_13

    .line 246
    .line 247
    iget v3, v15, Lv/d;->Z:I

    .line 248
    .line 249
    invoke-virtual {v14, v9, v3}, Lt/c;->d(Lt/f;I)V

    .line 250
    .line 251
    .line 252
    iget v3, v15, Lv/d;->Z:I

    .line 253
    .line 254
    iget v4, v15, Lv/d;->V:I

    .line 255
    .line 256
    add-int/2addr v3, v4

    .line 257
    invoke-virtual {v14, v7, v3}, Lt/c;->d(Lt/f;I)V

    .line 258
    .line 259
    .line 260
    iget-object v3, v6, Lv/c;->a:Ljava/util/HashSet;

    .line 261
    .line 262
    if-nez v3, :cond_e

    .line 263
    .line 264
    goto :goto_7

    .line 265
    :cond_e
    invoke-virtual {v3}, Ljava/util/HashSet;->size()I

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    if-lez v3, :cond_f

    .line 270
    .line 271
    iget v3, v15, Lv/d;->Z:I

    .line 272
    .line 273
    iget v4, v15, Lv/d;->a0:I

    .line 274
    .line 275
    add-int/2addr v3, v4

    .line 276
    invoke-virtual {v14, v5, v3}, Lt/c;->d(Lt/f;I)V

    .line 277
    .line 278
    .line 279
    :cond_f
    :goto_7
    if-eqz v28, :cond_13

    .line 280
    .line 281
    iget-object v3, v15, Lv/d;->T:Lv/d;

    .line 282
    .line 283
    if-eqz v3, :cond_13

    .line 284
    .line 285
    check-cast v3, Lv/e;

    .line 286
    .line 287
    iget-object v4, v3, Lv/e;->G0:Ljava/lang/ref/WeakReference;

    .line 288
    .line 289
    if-eqz v4, :cond_10

    .line 290
    .line 291
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    if-eqz v4, :cond_10

    .line 296
    .line 297
    invoke-virtual {v2}, Lv/c;->d()I

    .line 298
    .line 299
    .line 300
    move-result v4

    .line 301
    iget-object v11, v3, Lv/e;->G0:Ljava/lang/ref/WeakReference;

    .line 302
    .line 303
    invoke-virtual {v11}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v11

    .line 307
    check-cast v11, Lv/c;

    .line 308
    .line 309
    invoke-virtual {v11}, Lv/c;->d()I

    .line 310
    .line 311
    .line 312
    move-result v11

    .line 313
    if-le v4, v11, :cond_11

    .line 314
    .line 315
    :cond_10
    new-instance v4, Ljava/lang/ref/WeakReference;

    .line 316
    .line 317
    invoke-direct {v4, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    iput-object v4, v3, Lv/e;->G0:Ljava/lang/ref/WeakReference;

    .line 321
    .line 322
    :cond_11
    iget-object v4, v3, Lv/e;->I0:Ljava/lang/ref/WeakReference;

    .line 323
    .line 324
    if-eqz v4, :cond_12

    .line 325
    .line 326
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v4

    .line 330
    if-eqz v4, :cond_12

    .line 331
    .line 332
    invoke-virtual {v8}, Lv/c;->d()I

    .line 333
    .line 334
    .line 335
    move-result v4

    .line 336
    iget-object v11, v3, Lv/e;->I0:Ljava/lang/ref/WeakReference;

    .line 337
    .line 338
    invoke-virtual {v11}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v11

    .line 342
    check-cast v11, Lv/c;

    .line 343
    .line 344
    invoke-virtual {v11}, Lv/c;->d()I

    .line 345
    .line 346
    .line 347
    move-result v11

    .line 348
    if-le v4, v11, :cond_13

    .line 349
    .line 350
    :cond_12
    new-instance v4, Ljava/lang/ref/WeakReference;

    .line 351
    .line 352
    invoke-direct {v4, v8}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    iput-object v4, v3, Lv/e;->I0:Ljava/lang/ref/WeakReference;

    .line 356
    .line 357
    :cond_13
    iget-boolean v3, v15, Lv/d;->k:Z

    .line 358
    .line 359
    if-eqz v3, :cond_14

    .line 360
    .line 361
    iget-boolean v3, v15, Lv/d;->l:Z

    .line 362
    .line 363
    if-eqz v3, :cond_14

    .line 364
    .line 365
    const/4 v3, 0x0

    .line 366
    iput-boolean v3, v15, Lv/d;->k:Z

    .line 367
    .line 368
    iput-boolean v3, v15, Lv/d;->l:Z

    .line 369
    .line 370
    return-void

    .line 371
    :cond_14
    iget-object v4, v15, Lv/d;->f:[Z

    .line 372
    .line 373
    if-eqz p2, :cond_18

    .line 374
    .line 375
    iget-object v3, v15, Lv/d;->d:Lw/k;

    .line 376
    .line 377
    if-eqz v3, :cond_18

    .line 378
    .line 379
    iget-object v11, v15, Lv/d;->e:Lw/m;

    .line 380
    .line 381
    if-eqz v11, :cond_18

    .line 382
    .line 383
    move-object/from16 v21, v10

    .line 384
    .line 385
    iget-object v10, v3, Lw/o;->h:Lw/f;

    .line 386
    .line 387
    move-object/from16 v22, v6

    .line 388
    .line 389
    iget-boolean v6, v10, Lw/f;->j:Z

    .line 390
    .line 391
    if-eqz v6, :cond_17

    .line 392
    .line 393
    iget-object v3, v3, Lw/o;->i:Lw/f;

    .line 394
    .line 395
    iget-boolean v3, v3, Lw/f;->j:Z

    .line 396
    .line 397
    if-eqz v3, :cond_17

    .line 398
    .line 399
    iget-object v3, v11, Lw/o;->h:Lw/f;

    .line 400
    .line 401
    iget-boolean v3, v3, Lw/f;->j:Z

    .line 402
    .line 403
    if-eqz v3, :cond_17

    .line 404
    .line 405
    iget-object v3, v11, Lw/o;->i:Lw/f;

    .line 406
    .line 407
    iget-boolean v3, v3, Lw/f;->j:Z

    .line 408
    .line 409
    if-eqz v3, :cond_17

    .line 410
    .line 411
    iget v0, v10, Lw/f;->g:I

    .line 412
    .line 413
    invoke-virtual {v14, v13, v0}, Lt/c;->d(Lt/f;I)V

    .line 414
    .line 415
    .line 416
    iget-object v0, v15, Lv/d;->d:Lw/k;

    .line 417
    .line 418
    iget-object v0, v0, Lw/o;->i:Lw/f;

    .line 419
    .line 420
    iget v0, v0, Lw/f;->g:I

    .line 421
    .line 422
    invoke-virtual {v14, v12, v0}, Lt/c;->d(Lt/f;I)V

    .line 423
    .line 424
    .line 425
    iget-object v0, v15, Lv/d;->e:Lw/m;

    .line 426
    .line 427
    iget-object v0, v0, Lw/o;->h:Lw/f;

    .line 428
    .line 429
    iget v0, v0, Lw/f;->g:I

    .line 430
    .line 431
    invoke-virtual {v14, v9, v0}, Lt/c;->d(Lt/f;I)V

    .line 432
    .line 433
    .line 434
    iget-object v0, v15, Lv/d;->e:Lw/m;

    .line 435
    .line 436
    iget-object v0, v0, Lw/o;->i:Lw/f;

    .line 437
    .line 438
    iget v0, v0, Lw/f;->g:I

    .line 439
    .line 440
    invoke-virtual {v14, v7, v0}, Lt/c;->d(Lt/f;I)V

    .line 441
    .line 442
    .line 443
    iget-object v0, v15, Lv/d;->e:Lw/m;

    .line 444
    .line 445
    iget-object v0, v0, Lw/m;->k:Lw/f;

    .line 446
    .line 447
    iget v0, v0, Lw/f;->g:I

    .line 448
    .line 449
    invoke-virtual {v14, v5, v0}, Lt/c;->d(Lt/f;I)V

    .line 450
    .line 451
    .line 452
    iget-object v0, v15, Lv/d;->T:Lv/d;

    .line 453
    .line 454
    if-eqz v0, :cond_16

    .line 455
    .line 456
    if-eqz v29, :cond_15

    .line 457
    .line 458
    const/4 v0, 0x0

    .line 459
    aget-boolean v1, v4, v0

    .line 460
    .line 461
    if-eqz v1, :cond_15

    .line 462
    .line 463
    invoke-virtual/range {p0 .. p0}, Lv/d;->x()Z

    .line 464
    .line 465
    .line 466
    move-result v1

    .line 467
    if-nez v1, :cond_15

    .line 468
    .line 469
    iget-object v1, v15, Lv/d;->T:Lv/d;

    .line 470
    .line 471
    iget-object v1, v1, Lv/d;->K:Lv/c;

    .line 472
    .line 473
    invoke-virtual {v14, v1}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    .line 474
    .line 475
    .line 476
    move-result-object v1

    .line 477
    const/16 v2, 0x8

    .line 478
    .line 479
    invoke-virtual {v14, v1, v12, v0, v2}, Lt/c;->f(Lt/f;Lt/f;II)V

    .line 480
    .line 481
    .line 482
    :cond_15
    if-eqz v28, :cond_16

    .line 483
    .line 484
    const/4 v0, 0x1

    .line 485
    aget-boolean v0, v4, v0

    .line 486
    .line 487
    if-eqz v0, :cond_16

    .line 488
    .line 489
    invoke-virtual/range {p0 .. p0}, Lv/d;->y()Z

    .line 490
    .line 491
    .line 492
    move-result v0

    .line 493
    if-nez v0, :cond_16

    .line 494
    .line 495
    iget-object v0, v15, Lv/d;->T:Lv/d;

    .line 496
    .line 497
    iget-object v0, v0, Lv/d;->L:Lv/c;

    .line 498
    .line 499
    invoke-virtual {v14, v0}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    const/16 v1, 0x8

    .line 504
    .line 505
    const/4 v3, 0x0

    .line 506
    invoke-virtual {v14, v0, v7, v3, v1}, Lt/c;->f(Lt/f;Lt/f;II)V

    .line 507
    .line 508
    .line 509
    goto :goto_8

    .line 510
    :cond_16
    const/4 v3, 0x0

    .line 511
    :goto_8
    iput-boolean v3, v15, Lv/d;->k:Z

    .line 512
    .line 513
    iput-boolean v3, v15, Lv/d;->l:Z

    .line 514
    .line 515
    return-void

    .line 516
    :cond_17
    :goto_9
    const/4 v3, 0x0

    .line 517
    goto :goto_a

    .line 518
    :cond_18
    move-object/from16 v22, v6

    .line 519
    .line 520
    move-object/from16 v21, v10

    .line 521
    .line 522
    goto :goto_9

    .line 523
    :goto_a
    iget-object v6, v15, Lv/d;->T:Lv/d;

    .line 524
    .line 525
    if-eqz v6, :cond_1d

    .line 526
    .line 527
    invoke-virtual {v15, v3}, Lv/d;->w(I)Z

    .line 528
    .line 529
    .line 530
    move-result v6

    .line 531
    if-eqz v6, :cond_19

    .line 532
    .line 533
    iget-object v6, v15, Lv/d;->T:Lv/d;

    .line 534
    .line 535
    check-cast v6, Lv/e;

    .line 536
    .line 537
    invoke-virtual {v6, v15, v3}, Lv/e;->R(Lv/d;I)V

    .line 538
    .line 539
    .line 540
    const/4 v3, 0x1

    .line 541
    :goto_b
    const/4 v6, 0x1

    .line 542
    goto :goto_c

    .line 543
    :cond_19
    invoke-virtual/range {p0 .. p0}, Lv/d;->x()Z

    .line 544
    .line 545
    .line 546
    move-result v3

    .line 547
    goto :goto_b

    .line 548
    :goto_c
    invoke-virtual {v15, v6}, Lv/d;->w(I)Z

    .line 549
    .line 550
    .line 551
    move-result v10

    .line 552
    if-eqz v10, :cond_1a

    .line 553
    .line 554
    iget-object v10, v15, Lv/d;->T:Lv/d;

    .line 555
    .line 556
    check-cast v10, Lv/e;

    .line 557
    .line 558
    invoke-virtual {v10, v15, v6}, Lv/e;->R(Lv/d;I)V

    .line 559
    .line 560
    .line 561
    const/4 v6, 0x1

    .line 562
    goto :goto_d

    .line 563
    :cond_1a
    invoke-virtual/range {p0 .. p0}, Lv/d;->y()Z

    .line 564
    .line 565
    .line 566
    move-result v6

    .line 567
    :goto_d
    if-nez v3, :cond_1b

    .line 568
    .line 569
    if-eqz v29, :cond_1b

    .line 570
    .line 571
    iget v10, v15, Lv/d;->g0:I

    .line 572
    .line 573
    const/16 v11, 0x8

    .line 574
    .line 575
    if-eq v10, v11, :cond_1b

    .line 576
    .line 577
    iget-object v10, v0, Lv/c;->f:Lv/c;

    .line 578
    .line 579
    if-nez v10, :cond_1b

    .line 580
    .line 581
    iget-object v10, v1, Lv/c;->f:Lv/c;

    .line 582
    .line 583
    if-nez v10, :cond_1b

    .line 584
    .line 585
    iget-object v10, v15, Lv/d;->T:Lv/d;

    .line 586
    .line 587
    iget-object v10, v10, Lv/d;->K:Lv/c;

    .line 588
    .line 589
    invoke-virtual {v14, v10}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    .line 590
    .line 591
    .line 592
    move-result-object v10

    .line 593
    move/from16 v23, v3

    .line 594
    .line 595
    const/4 v3, 0x0

    .line 596
    const/4 v11, 0x1

    .line 597
    invoke-virtual {v14, v10, v12, v3, v11}, Lt/c;->f(Lt/f;Lt/f;II)V

    .line 598
    .line 599
    .line 600
    goto :goto_e

    .line 601
    :cond_1b
    move/from16 v23, v3

    .line 602
    .line 603
    :goto_e
    if-nez v6, :cond_1c

    .line 604
    .line 605
    if-eqz v28, :cond_1c

    .line 606
    .line 607
    iget v3, v15, Lv/d;->g0:I

    .line 608
    .line 609
    const/16 v10, 0x8

    .line 610
    .line 611
    if-eq v3, v10, :cond_1c

    .line 612
    .line 613
    iget-object v3, v2, Lv/c;->f:Lv/c;

    .line 614
    .line 615
    if-nez v3, :cond_1c

    .line 616
    .line 617
    iget-object v3, v8, Lv/c;->f:Lv/c;

    .line 618
    .line 619
    if-nez v3, :cond_1c

    .line 620
    .line 621
    if-nez v22, :cond_1c

    .line 622
    .line 623
    iget-object v3, v15, Lv/d;->T:Lv/d;

    .line 624
    .line 625
    iget-object v3, v3, Lv/d;->L:Lv/c;

    .line 626
    .line 627
    invoke-virtual {v14, v3}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    .line 628
    .line 629
    .line 630
    move-result-object v3

    .line 631
    const/4 v10, 0x1

    .line 632
    const/4 v11, 0x0

    .line 633
    invoke-virtual {v14, v3, v7, v11, v10}, Lt/c;->f(Lt/f;Lt/f;II)V

    .line 634
    .line 635
    .line 636
    :cond_1c
    move/from16 v30, v6

    .line 637
    .line 638
    move/from16 v31, v23

    .line 639
    .line 640
    goto :goto_f

    .line 641
    :cond_1d
    const/16 v30, 0x0

    .line 642
    .line 643
    const/16 v31, 0x0

    .line 644
    .line 645
    :goto_f
    iget v3, v15, Lv/d;->U:I

    .line 646
    .line 647
    iget v6, v15, Lv/d;->b0:I

    .line 648
    .line 649
    if-ge v3, v6, :cond_1e

    .line 650
    .line 651
    goto :goto_10

    .line 652
    :cond_1e
    move v6, v3

    .line 653
    :goto_10
    iget v10, v15, Lv/d;->V:I

    .line 654
    .line 655
    iget v11, v15, Lv/d;->c0:I

    .line 656
    .line 657
    move-object/from16 v23, v9

    .line 658
    .line 659
    if-ge v10, v11, :cond_1f

    .line 660
    .line 661
    goto :goto_11

    .line 662
    :cond_1f
    move v11, v10

    .line 663
    :goto_11
    iget-object v9, v15, Lv/d;->p0:[I

    .line 664
    .line 665
    move-object/from16 v27, v5

    .line 666
    .line 667
    const/16 v19, 0x0

    .line 668
    .line 669
    aget v5, v9, v19

    .line 670
    .line 671
    move/from16 v24, v6

    .line 672
    .line 673
    const/4 v6, 0x3

    .line 674
    move-object/from16 v32, v7

    .line 675
    .line 676
    const/16 v16, 0x1

    .line 677
    .line 678
    if-eq v5, v6, :cond_20

    .line 679
    .line 680
    const/16 v25, 0x1

    .line 681
    .line 682
    goto :goto_12

    .line 683
    :cond_20
    const/16 v25, 0x0

    .line 684
    .line 685
    :goto_12
    aget v7, v9, v16

    .line 686
    .line 687
    move/from16 v26, v11

    .line 688
    .line 689
    if-eq v7, v6, :cond_21

    .line 690
    .line 691
    const/4 v6, 0x1

    .line 692
    goto :goto_13

    .line 693
    :cond_21
    const/4 v6, 0x0

    .line 694
    :goto_13
    iget v11, v15, Lv/d;->X:I

    .line 695
    .line 696
    iput v11, v15, Lv/d;->A:I

    .line 697
    .line 698
    move-object/from16 v33, v4

    .line 699
    .line 700
    iget v4, v15, Lv/d;->W:F

    .line 701
    .line 702
    iput v4, v15, Lv/d;->B:F

    .line 703
    .line 704
    move-object/from16 v34, v12

    .line 705
    .line 706
    iget v12, v15, Lv/d;->r:I

    .line 707
    .line 708
    move-object/from16 v35, v13

    .line 709
    .line 710
    iget v13, v15, Lv/d;->s:I

    .line 711
    .line 712
    const/16 v37, 0x0

    .line 713
    .line 714
    cmpl-float v37, v4, v37

    .line 715
    .line 716
    if-lez v37, :cond_35

    .line 717
    .line 718
    iget v14, v15, Lv/d;->g0:I

    .line 719
    .line 720
    move-object/from16 v39, v9

    .line 721
    .line 722
    const/16 v9, 0x8

    .line 723
    .line 724
    if-eq v14, v9, :cond_34

    .line 725
    .line 726
    const/4 v9, 0x3

    .line 727
    if-ne v5, v9, :cond_22

    .line 728
    .line 729
    if-nez v12, :cond_22

    .line 730
    .line 731
    const/4 v12, 0x3

    .line 732
    :cond_22
    if-ne v7, v9, :cond_23

    .line 733
    .line 734
    if-nez v13, :cond_23

    .line 735
    .line 736
    const/4 v13, 0x3

    .line 737
    :cond_23
    if-ne v5, v9, :cond_2f

    .line 738
    .line 739
    if-ne v7, v9, :cond_2f

    .line 740
    .line 741
    if-ne v12, v9, :cond_2f

    .line 742
    .line 743
    if-ne v13, v9, :cond_2f

    .line 744
    .line 745
    const/4 v9, -0x1

    .line 746
    if-ne v11, v9, :cond_25

    .line 747
    .line 748
    if-eqz v25, :cond_24

    .line 749
    .line 750
    if-nez v6, :cond_24

    .line 751
    .line 752
    const/4 v3, 0x0

    .line 753
    iput v3, v15, Lv/d;->A:I

    .line 754
    .line 755
    goto :goto_14

    .line 756
    :cond_24
    if-nez v25, :cond_25

    .line 757
    .line 758
    if-eqz v6, :cond_25

    .line 759
    .line 760
    const/4 v3, 0x1

    .line 761
    iput v3, v15, Lv/d;->A:I

    .line 762
    .line 763
    if-ne v11, v9, :cond_25

    .line 764
    .line 765
    const/high16 v3, 0x3f800000    # 1.0f

    .line 766
    .line 767
    div-float v14, v3, v4

    .line 768
    .line 769
    iput v14, v15, Lv/d;->B:F

    .line 770
    .line 771
    :cond_25
    :goto_14
    iget v3, v15, Lv/d;->A:I

    .line 772
    .line 773
    if-nez v3, :cond_27

    .line 774
    .line 775
    invoke-virtual {v2}, Lv/c;->h()Z

    .line 776
    .line 777
    .line 778
    move-result v3

    .line 779
    if-eqz v3, :cond_26

    .line 780
    .line 781
    invoke-virtual {v8}, Lv/c;->h()Z

    .line 782
    .line 783
    .line 784
    move-result v3

    .line 785
    if-nez v3, :cond_27

    .line 786
    .line 787
    :cond_26
    const/4 v3, 0x1

    .line 788
    goto :goto_15

    .line 789
    :cond_27
    const/4 v3, 0x1

    .line 790
    goto :goto_16

    .line 791
    :goto_15
    iput v3, v15, Lv/d;->A:I

    .line 792
    .line 793
    goto :goto_17

    .line 794
    :goto_16
    iget v4, v15, Lv/d;->A:I

    .line 795
    .line 796
    if-ne v4, v3, :cond_29

    .line 797
    .line 798
    invoke-virtual {v0}, Lv/c;->h()Z

    .line 799
    .line 800
    .line 801
    move-result v3

    .line 802
    if-eqz v3, :cond_28

    .line 803
    .line 804
    invoke-virtual {v1}, Lv/c;->h()Z

    .line 805
    .line 806
    .line 807
    move-result v3

    .line 808
    if-nez v3, :cond_29

    .line 809
    .line 810
    :cond_28
    const/4 v3, 0x0

    .line 811
    iput v3, v15, Lv/d;->A:I

    .line 812
    .line 813
    :cond_29
    :goto_17
    iget v3, v15, Lv/d;->A:I

    .line 814
    .line 815
    const/4 v4, -0x1

    .line 816
    if-ne v3, v4, :cond_2c

    .line 817
    .line 818
    invoke-virtual {v2}, Lv/c;->h()Z

    .line 819
    .line 820
    .line 821
    move-result v3

    .line 822
    if-eqz v3, :cond_2a

    .line 823
    .line 824
    invoke-virtual {v8}, Lv/c;->h()Z

    .line 825
    .line 826
    .line 827
    move-result v3

    .line 828
    if-eqz v3, :cond_2a

    .line 829
    .line 830
    invoke-virtual {v0}, Lv/c;->h()Z

    .line 831
    .line 832
    .line 833
    move-result v3

    .line 834
    if-eqz v3, :cond_2a

    .line 835
    .line 836
    invoke-virtual {v1}, Lv/c;->h()Z

    .line 837
    .line 838
    .line 839
    move-result v3

    .line 840
    if-nez v3, :cond_2c

    .line 841
    .line 842
    :cond_2a
    invoke-virtual {v2}, Lv/c;->h()Z

    .line 843
    .line 844
    .line 845
    move-result v2

    .line 846
    if-eqz v2, :cond_2b

    .line 847
    .line 848
    invoke-virtual {v8}, Lv/c;->h()Z

    .line 849
    .line 850
    .line 851
    move-result v2

    .line 852
    if-eqz v2, :cond_2b

    .line 853
    .line 854
    const/4 v2, 0x0

    .line 855
    iput v2, v15, Lv/d;->A:I

    .line 856
    .line 857
    goto :goto_18

    .line 858
    :cond_2b
    invoke-virtual {v0}, Lv/c;->h()Z

    .line 859
    .line 860
    .line 861
    move-result v0

    .line 862
    if-eqz v0, :cond_2c

    .line 863
    .line 864
    invoke-virtual {v1}, Lv/c;->h()Z

    .line 865
    .line 866
    .line 867
    move-result v0

    .line 868
    if-eqz v0, :cond_2c

    .line 869
    .line 870
    iget v0, v15, Lv/d;->B:F

    .line 871
    .line 872
    const/high16 v1, 0x3f800000    # 1.0f

    .line 873
    .line 874
    div-float v14, v1, v0

    .line 875
    .line 876
    iput v14, v15, Lv/d;->B:F

    .line 877
    .line 878
    const/4 v0, 0x1

    .line 879
    iput v0, v15, Lv/d;->A:I

    .line 880
    .line 881
    :cond_2c
    :goto_18
    iget v0, v15, Lv/d;->A:I

    .line 882
    .line 883
    const/4 v1, -0x1

    .line 884
    if-ne v0, v1, :cond_2e

    .line 885
    .line 886
    iget v0, v15, Lv/d;->u:I

    .line 887
    .line 888
    if-lez v0, :cond_2d

    .line 889
    .line 890
    iget v1, v15, Lv/d;->x:I

    .line 891
    .line 892
    if-nez v1, :cond_2d

    .line 893
    .line 894
    const/4 v1, 0x0

    .line 895
    iput v1, v15, Lv/d;->A:I

    .line 896
    .line 897
    goto :goto_19

    .line 898
    :cond_2d
    if-nez v0, :cond_2e

    .line 899
    .line 900
    iget v0, v15, Lv/d;->x:I

    .line 901
    .line 902
    if-lez v0, :cond_2e

    .line 903
    .line 904
    iget v0, v15, Lv/d;->B:F

    .line 905
    .line 906
    const/high16 v1, 0x3f800000    # 1.0f

    .line 907
    .line 908
    div-float v14, v1, v0

    .line 909
    .line 910
    iput v14, v15, Lv/d;->B:F

    .line 911
    .line 912
    const/4 v0, 0x1

    .line 913
    iput v0, v15, Lv/d;->A:I

    .line 914
    .line 915
    :cond_2e
    :goto_19
    const/high16 v14, 0x3f800000    # 1.0f

    .line 916
    .line 917
    goto :goto_1b

    .line 918
    :cond_2f
    const/4 v0, 0x3

    .line 919
    if-ne v5, v0, :cond_31

    .line 920
    .line 921
    if-ne v12, v0, :cond_31

    .line 922
    .line 923
    const/4 v1, 0x0

    .line 924
    iput v1, v15, Lv/d;->A:I

    .line 925
    .line 926
    int-to-float v1, v10

    .line 927
    mul-float v4, v4, v1

    .line 928
    .line 929
    float-to-int v6, v4

    .line 930
    if-eq v7, v0, :cond_30

    .line 931
    .line 932
    move/from16 v41, v13

    .line 933
    .line 934
    move/from16 v40, v26

    .line 935
    .line 936
    const/high16 v14, 0x3f800000    # 1.0f

    .line 937
    .line 938
    const/16 v38, 0x0

    .line 939
    .line 940
    const/16 v42, 0x4

    .line 941
    .line 942
    goto :goto_1e

    .line 943
    :cond_30
    move/from16 v42, v12

    .line 944
    .line 945
    move/from16 v41, v13

    .line 946
    .line 947
    move/from16 v40, v26

    .line 948
    .line 949
    const/high16 v14, 0x3f800000    # 1.0f

    .line 950
    .line 951
    :goto_1a
    const/16 v38, 0x1

    .line 952
    .line 953
    goto :goto_1e

    .line 954
    :cond_31
    if-ne v7, v0, :cond_2e

    .line 955
    .line 956
    if-ne v13, v0, :cond_2e

    .line 957
    .line 958
    const/4 v1, 0x1

    .line 959
    iput v1, v15, Lv/d;->A:I

    .line 960
    .line 961
    const/4 v1, -0x1

    .line 962
    const/high16 v14, 0x3f800000    # 1.0f

    .line 963
    .line 964
    if-ne v11, v1, :cond_32

    .line 965
    .line 966
    div-float v1, v14, v4

    .line 967
    .line 968
    iput v1, v15, Lv/d;->B:F

    .line 969
    .line 970
    :cond_32
    iget v1, v15, Lv/d;->B:F

    .line 971
    .line 972
    int-to-float v2, v3

    .line 973
    mul-float v1, v1, v2

    .line 974
    .line 975
    float-to-int v11, v1

    .line 976
    move/from16 v40, v11

    .line 977
    .line 978
    move/from16 v42, v12

    .line 979
    .line 980
    if-eq v5, v0, :cond_33

    .line 981
    .line 982
    move/from16 v6, v24

    .line 983
    .line 984
    const/16 v38, 0x0

    .line 985
    .line 986
    const/16 v41, 0x4

    .line 987
    .line 988
    goto :goto_1e

    .line 989
    :cond_33
    move/from16 v41, v13

    .line 990
    .line 991
    move/from16 v6, v24

    .line 992
    .line 993
    goto :goto_1a

    .line 994
    :goto_1b
    move/from16 v42, v12

    .line 995
    .line 996
    move/from16 v41, v13

    .line 997
    .line 998
    move/from16 v6, v24

    .line 999
    .line 1000
    move/from16 v40, v26

    .line 1001
    .line 1002
    goto :goto_1a

    .line 1003
    :cond_34
    :goto_1c
    const/high16 v14, 0x3f800000    # 1.0f

    .line 1004
    .line 1005
    goto :goto_1d

    .line 1006
    :cond_35
    move-object/from16 v39, v9

    .line 1007
    .line 1008
    goto :goto_1c

    .line 1009
    :goto_1d
    move/from16 v42, v12

    .line 1010
    .line 1011
    move/from16 v41, v13

    .line 1012
    .line 1013
    move/from16 v6, v24

    .line 1014
    .line 1015
    move/from16 v40, v26

    .line 1016
    .line 1017
    const/16 v38, 0x0

    .line 1018
    .line 1019
    :goto_1e
    iget-object v0, v15, Lv/d;->t:[I

    .line 1020
    .line 1021
    const/4 v1, 0x0

    .line 1022
    aput v42, v0, v1

    .line 1023
    .line 1024
    const/4 v1, 0x1

    .line 1025
    aput v41, v0, v1

    .line 1026
    .line 1027
    if-eqz v38, :cond_37

    .line 1028
    .line 1029
    iget v0, v15, Lv/d;->A:I

    .line 1030
    .line 1031
    const/4 v1, -0x1

    .line 1032
    if-eqz v0, :cond_36

    .line 1033
    .line 1034
    if-ne v0, v1, :cond_38

    .line 1035
    .line 1036
    :cond_36
    const/16 v37, 0x1

    .line 1037
    .line 1038
    goto :goto_1f

    .line 1039
    :cond_37
    const/4 v1, -0x1

    .line 1040
    :cond_38
    const/16 v37, 0x0

    .line 1041
    .line 1042
    :goto_1f
    if-eqz v38, :cond_3a

    .line 1043
    .line 1044
    iget v0, v15, Lv/d;->A:I

    .line 1045
    .line 1046
    const/4 v2, 0x1

    .line 1047
    if-eq v0, v2, :cond_39

    .line 1048
    .line 1049
    if-ne v0, v1, :cond_3a

    .line 1050
    .line 1051
    :cond_39
    const/4 v0, 0x0

    .line 1052
    const/16 v43, 0x1

    .line 1053
    .line 1054
    goto :goto_20

    .line 1055
    :cond_3a
    const/4 v0, 0x0

    .line 1056
    const/16 v43, 0x0

    .line 1057
    .line 1058
    :goto_20
    aget v1, v39, v0

    .line 1059
    .line 1060
    const/4 v0, 0x2

    .line 1061
    if-ne v1, v0, :cond_3b

    .line 1062
    .line 1063
    instance-of v0, v15, Lv/e;

    .line 1064
    .line 1065
    if-eqz v0, :cond_3b

    .line 1066
    .line 1067
    const/4 v9, 0x1

    .line 1068
    goto :goto_21

    .line 1069
    :cond_3b
    const/4 v9, 0x0

    .line 1070
    :goto_21
    if-eqz v9, :cond_3c

    .line 1071
    .line 1072
    const/4 v13, 0x0

    .line 1073
    goto :goto_22

    .line 1074
    :cond_3c
    move v13, v6

    .line 1075
    :goto_22
    iget-object v12, v15, Lv/d;->P:Lv/c;

    .line 1076
    .line 1077
    invoke-virtual {v12}, Lv/c;->h()Z

    .line 1078
    .line 1079
    .line 1080
    move-result v0

    .line 1081
    const/4 v1, 0x1

    .line 1082
    xor-int/lit8 v44, v0, 0x1

    .line 1083
    .line 1084
    const/4 v0, 0x0

    .line 1085
    aget-boolean v45, v21, v0

    .line 1086
    .line 1087
    aget-boolean v46, v21, v1

    .line 1088
    .line 1089
    iget v0, v15, Lv/d;->o:I

    .line 1090
    .line 1091
    iget-object v7, v15, Lv/d;->C:[I

    .line 1092
    .line 1093
    const/16 v47, 0x0

    .line 1094
    .line 1095
    const/4 v4, 0x2

    .line 1096
    if-eq v0, v4, :cond_41

    .line 1097
    .line 1098
    iget-boolean v0, v15, Lv/d;->k:Z

    .line 1099
    .line 1100
    if-nez v0, :cond_41

    .line 1101
    .line 1102
    if-eqz p2, :cond_3d

    .line 1103
    .line 1104
    iget-object v0, v15, Lv/d;->d:Lw/k;

    .line 1105
    .line 1106
    if-eqz v0, :cond_3d

    .line 1107
    .line 1108
    iget-object v1, v0, Lw/o;->h:Lw/f;

    .line 1109
    .line 1110
    iget-boolean v2, v1, Lw/f;->j:Z

    .line 1111
    .line 1112
    if-eqz v2, :cond_3d

    .line 1113
    .line 1114
    iget-object v0, v0, Lw/o;->i:Lw/f;

    .line 1115
    .line 1116
    iget-boolean v0, v0, Lw/f;->j:Z

    .line 1117
    .line 1118
    if-nez v0, :cond_3e

    .line 1119
    .line 1120
    :cond_3d
    move-object/from16 v6, p1

    .line 1121
    .line 1122
    move-object/from16 v1, v34

    .line 1123
    .line 1124
    move-object/from16 v5, v35

    .line 1125
    .line 1126
    const/4 v3, 0x4

    .line 1127
    const/16 v11, 0x8

    .line 1128
    .line 1129
    goto :goto_24

    .line 1130
    :cond_3e
    if-eqz p2, :cond_40

    .line 1131
    .line 1132
    iget v0, v1, Lw/f;->g:I

    .line 1133
    .line 1134
    move-object/from16 v6, p1

    .line 1135
    .line 1136
    move-object/from16 v5, v35

    .line 1137
    .line 1138
    const/4 v3, 0x4

    .line 1139
    invoke-virtual {v6, v5, v0}, Lt/c;->d(Lt/f;I)V

    .line 1140
    .line 1141
    .line 1142
    iget-object v0, v15, Lv/d;->d:Lw/k;

    .line 1143
    .line 1144
    iget-object v0, v0, Lw/o;->i:Lw/f;

    .line 1145
    .line 1146
    iget v0, v0, Lw/f;->g:I

    .line 1147
    .line 1148
    move-object/from16 v1, v34

    .line 1149
    .line 1150
    invoke-virtual {v6, v1, v0}, Lt/c;->d(Lt/f;I)V

    .line 1151
    .line 1152
    .line 1153
    iget-object v0, v15, Lv/d;->T:Lv/d;

    .line 1154
    .line 1155
    if-eqz v0, :cond_3f

    .line 1156
    .line 1157
    if-eqz v29, :cond_3f

    .line 1158
    .line 1159
    const/4 v0, 0x0

    .line 1160
    aget-boolean v2, v33, v0

    .line 1161
    .line 1162
    if-eqz v2, :cond_3f

    .line 1163
    .line 1164
    invoke-virtual/range {p0 .. p0}, Lv/d;->x()Z

    .line 1165
    .line 1166
    .line 1167
    move-result v2

    .line 1168
    if-nez v2, :cond_3f

    .line 1169
    .line 1170
    iget-object v2, v15, Lv/d;->T:Lv/d;

    .line 1171
    .line 1172
    iget-object v2, v2, Lv/d;->K:Lv/c;

    .line 1173
    .line 1174
    invoke-virtual {v6, v2}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v2

    .line 1178
    const/16 v11, 0x8

    .line 1179
    .line 1180
    invoke-virtual {v6, v2, v1, v0, v11}, Lt/c;->f(Lt/f;Lt/f;II)V

    .line 1181
    .line 1182
    .line 1183
    :cond_3f
    move-object/from16 v54, v1

    .line 1184
    .line 1185
    move-object/from16 v55, v5

    .line 1186
    .line 1187
    move-object/from16 v52, v8

    .line 1188
    .line 1189
    move-object/from16 v36, v12

    .line 1190
    .line 1191
    move-object/from16 v50, v22

    .line 1192
    .line 1193
    move-object/from16 v53, v23

    .line 1194
    .line 1195
    move-object/from16 v49, v27

    .line 1196
    .line 1197
    move-object/from16 v51, v32

    .line 1198
    .line 1199
    :goto_23
    move-object/from16 v32, v7

    .line 1200
    .line 1201
    goto/16 :goto_29

    .line 1202
    .line 1203
    :cond_40
    move-object/from16 v6, p1

    .line 1204
    .line 1205
    :cond_41
    move-object/from16 v52, v8

    .line 1206
    .line 1207
    move-object/from16 v36, v12

    .line 1208
    .line 1209
    move-object/from16 v50, v22

    .line 1210
    .line 1211
    move-object/from16 v53, v23

    .line 1212
    .line 1213
    move-object/from16 v49, v27

    .line 1214
    .line 1215
    move-object/from16 v51, v32

    .line 1216
    .line 1217
    move-object/from16 v54, v34

    .line 1218
    .line 1219
    move-object/from16 v55, v35

    .line 1220
    .line 1221
    goto :goto_23

    .line 1222
    :goto_24
    iget-object v0, v15, Lv/d;->T:Lv/d;

    .line 1223
    .line 1224
    if-eqz v0, :cond_42

    .line 1225
    .line 1226
    iget-object v0, v0, Lv/d;->K:Lv/c;

    .line 1227
    .line 1228
    invoke-virtual {v6, v0}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v0

    .line 1232
    move-object/from16 v18, v0

    .line 1233
    .line 1234
    goto :goto_25

    .line 1235
    :cond_42
    move-object/from16 v18, v47

    .line 1236
    .line 1237
    :goto_25
    iget-object v0, v15, Lv/d;->T:Lv/d;

    .line 1238
    .line 1239
    if-eqz v0, :cond_43

    .line 1240
    .line 1241
    iget-object v0, v0, Lv/d;->I:Lv/c;

    .line 1242
    .line 1243
    invoke-virtual {v6, v0}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v0

    .line 1247
    move-object/from16 v19, v0

    .line 1248
    .line 1249
    :goto_26
    const/4 v0, 0x0

    .line 1250
    goto :goto_27

    .line 1251
    :cond_43
    move-object/from16 v19, v47

    .line 1252
    .line 1253
    goto :goto_26

    .line 1254
    :goto_27
    aget-boolean v20, v33, v0

    .line 1255
    .line 1256
    aget v21, v39, v0

    .line 1257
    .line 1258
    iget v2, v15, Lv/d;->Y:I

    .line 1259
    .line 1260
    iget v10, v15, Lv/d;->b0:I

    .line 1261
    .line 1262
    aget v34, v7, v0

    .line 1263
    .line 1264
    move/from16 v35, v2

    .line 1265
    .line 1266
    iget v2, v15, Lv/d;->d0:F

    .line 1267
    .line 1268
    const/16 v17, 0x1

    .line 1269
    .line 1270
    aget v0, v39, v17

    .line 1271
    .line 1272
    const/4 v3, 0x3

    .line 1273
    if-ne v0, v3, :cond_44

    .line 1274
    .line 1275
    const/16 v48, 0x1

    .line 1276
    .line 1277
    goto :goto_28

    .line 1278
    :cond_44
    const/16 v48, 0x0

    .line 1279
    .line 1280
    :goto_28
    iget v0, v15, Lv/d;->u:I

    .line 1281
    .line 1282
    move/from16 v24, v0

    .line 1283
    .line 1284
    iget v0, v15, Lv/d;->v:I

    .line 1285
    .line 1286
    move/from16 v25, v0

    .line 1287
    .line 1288
    iget v0, v15, Lv/d;->w:F

    .line 1289
    .line 1290
    move/from16 v26, v0

    .line 1291
    .line 1292
    iget-object v0, v15, Lv/d;->I:Lv/c;

    .line 1293
    .line 1294
    move/from16 v16, v10

    .line 1295
    .line 1296
    move-object v10, v0

    .line 1297
    iget-object v0, v15, Lv/d;->K:Lv/c;

    .line 1298
    .line 1299
    const/4 v3, 0x0

    .line 1300
    move-object v11, v0

    .line 1301
    const/4 v0, 0x1

    .line 1302
    move/from16 v17, v35

    .line 1303
    .line 1304
    move/from16 v35, v2

    .line 1305
    .line 1306
    move v2, v0

    .line 1307
    move-object/from16 v0, p0

    .line 1308
    .line 1309
    move-object/from16 v36, v1

    .line 1310
    .line 1311
    move-object/from16 v1, p1

    .line 1312
    .line 1313
    move/from16 v3, v29

    .line 1314
    .line 1315
    move/from16 v4, v28

    .line 1316
    .line 1317
    move-object/from16 v49, v27

    .line 1318
    .line 1319
    move-object/from16 v27, v5

    .line 1320
    .line 1321
    move/from16 v5, v20

    .line 1322
    .line 1323
    move-object/from16 v50, v22

    .line 1324
    .line 1325
    move-object/from16 v6, v19

    .line 1326
    .line 1327
    move-object/from16 v51, v32

    .line 1328
    .line 1329
    move-object/from16 v32, v7

    .line 1330
    .line 1331
    move-object/from16 v7, v18

    .line 1332
    .line 1333
    move-object/from16 v52, v8

    .line 1334
    .line 1335
    move/from16 v8, v21

    .line 1336
    .line 1337
    move-object/from16 v53, v23

    .line 1338
    .line 1339
    move-object/from16 v54, v36

    .line 1340
    .line 1341
    move-object/from16 v36, v12

    .line 1342
    .line 1343
    move/from16 v12, v17

    .line 1344
    .line 1345
    move-object/from16 v55, v27

    .line 1346
    .line 1347
    move/from16 v14, v16

    .line 1348
    .line 1349
    move/from16 v15, v34

    .line 1350
    .line 1351
    move/from16 v16, v35

    .line 1352
    .line 1353
    move/from16 v17, v37

    .line 1354
    .line 1355
    move/from16 v18, v48

    .line 1356
    .line 1357
    move/from16 v19, v31

    .line 1358
    .line 1359
    move/from16 v20, v30

    .line 1360
    .line 1361
    move/from16 v21, v45

    .line 1362
    .line 1363
    move/from16 v22, v42

    .line 1364
    .line 1365
    move/from16 v23, v41

    .line 1366
    .line 1367
    move/from16 v27, v44

    .line 1368
    .line 1369
    invoke-virtual/range {v0 .. v27}, Lv/d;->d(Lt/c;ZZZZLt/f;Lt/f;IZLv/c;Lv/c;IIIIFZZZZZIIIIFZ)V

    .line 1370
    .line 1371
    .line 1372
    :goto_29
    if-eqz p2, :cond_48

    .line 1373
    .line 1374
    move-object/from16 v15, p0

    .line 1375
    .line 1376
    iget-object v0, v15, Lv/d;->e:Lw/m;

    .line 1377
    .line 1378
    if-eqz v0, :cond_47

    .line 1379
    .line 1380
    iget-object v1, v0, Lw/o;->h:Lw/f;

    .line 1381
    .line 1382
    iget-boolean v2, v1, Lw/f;->j:Z

    .line 1383
    .line 1384
    if-eqz v2, :cond_47

    .line 1385
    .line 1386
    iget-object v0, v0, Lw/o;->i:Lw/f;

    .line 1387
    .line 1388
    iget-boolean v0, v0, Lw/f;->j:Z

    .line 1389
    .line 1390
    if-eqz v0, :cond_47

    .line 1391
    .line 1392
    iget v0, v1, Lw/f;->g:I

    .line 1393
    .line 1394
    move-object/from16 v14, p1

    .line 1395
    .line 1396
    move-object/from16 v13, v53

    .line 1397
    .line 1398
    invoke-virtual {v14, v13, v0}, Lt/c;->d(Lt/f;I)V

    .line 1399
    .line 1400
    .line 1401
    iget-object v0, v15, Lv/d;->e:Lw/m;

    .line 1402
    .line 1403
    iget-object v0, v0, Lw/o;->i:Lw/f;

    .line 1404
    .line 1405
    iget v0, v0, Lw/f;->g:I

    .line 1406
    .line 1407
    move-object/from16 v12, v51

    .line 1408
    .line 1409
    invoke-virtual {v14, v12, v0}, Lt/c;->d(Lt/f;I)V

    .line 1410
    .line 1411
    .line 1412
    iget-object v0, v15, Lv/d;->e:Lw/m;

    .line 1413
    .line 1414
    iget-object v0, v0, Lw/m;->k:Lw/f;

    .line 1415
    .line 1416
    iget v0, v0, Lw/f;->g:I

    .line 1417
    .line 1418
    move-object/from16 v1, v49

    .line 1419
    .line 1420
    invoke-virtual {v14, v1, v0}, Lt/c;->d(Lt/f;I)V

    .line 1421
    .line 1422
    .line 1423
    iget-object v0, v15, Lv/d;->T:Lv/d;

    .line 1424
    .line 1425
    if-eqz v0, :cond_46

    .line 1426
    .line 1427
    if-nez v30, :cond_46

    .line 1428
    .line 1429
    if-eqz v28, :cond_46

    .line 1430
    .line 1431
    const/4 v9, 0x1

    .line 1432
    aget-boolean v2, v33, v9

    .line 1433
    .line 1434
    if-eqz v2, :cond_45

    .line 1435
    .line 1436
    iget-object v0, v0, Lv/d;->L:Lv/c;

    .line 1437
    .line 1438
    invoke-virtual {v14, v0}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v0

    .line 1442
    const/16 v2, 0x8

    .line 1443
    .line 1444
    const/4 v8, 0x0

    .line 1445
    invoke-virtual {v14, v0, v12, v8, v2}, Lt/c;->f(Lt/f;Lt/f;II)V

    .line 1446
    .line 1447
    .line 1448
    goto :goto_2a

    .line 1449
    :cond_45
    const/16 v2, 0x8

    .line 1450
    .line 1451
    const/4 v8, 0x0

    .line 1452
    goto :goto_2a

    .line 1453
    :cond_46
    const/16 v2, 0x8

    .line 1454
    .line 1455
    const/4 v8, 0x0

    .line 1456
    const/4 v9, 0x1

    .line 1457
    :goto_2a
    const/4 v10, 0x0

    .line 1458
    goto :goto_2c

    .line 1459
    :cond_47
    move-object/from16 v14, p1

    .line 1460
    .line 1461
    move-object/from16 v1, v49

    .line 1462
    .line 1463
    move-object/from16 v12, v51

    .line 1464
    .line 1465
    move-object/from16 v13, v53

    .line 1466
    .line 1467
    const/16 v2, 0x8

    .line 1468
    .line 1469
    const/4 v8, 0x0

    .line 1470
    const/4 v9, 0x1

    .line 1471
    goto :goto_2b

    .line 1472
    :cond_48
    const/16 v2, 0x8

    .line 1473
    .line 1474
    const/4 v8, 0x0

    .line 1475
    const/4 v9, 0x1

    .line 1476
    move-object/from16 v15, p0

    .line 1477
    .line 1478
    move-object/from16 v14, p1

    .line 1479
    .line 1480
    move-object/from16 v1, v49

    .line 1481
    .line 1482
    move-object/from16 v12, v51

    .line 1483
    .line 1484
    move-object/from16 v13, v53

    .line 1485
    .line 1486
    :goto_2b
    const/4 v10, 0x1

    .line 1487
    :goto_2c
    iget v0, v15, Lv/d;->p:I

    .line 1488
    .line 1489
    const/4 v7, 0x2

    .line 1490
    if-ne v0, v7, :cond_49

    .line 1491
    .line 1492
    const/4 v11, 0x0

    .line 1493
    goto :goto_2d

    .line 1494
    :cond_49
    move v11, v10

    .line 1495
    :goto_2d
    const/4 v6, 0x5

    .line 1496
    if-eqz v11, :cond_54

    .line 1497
    .line 1498
    iget-boolean v0, v15, Lv/d;->l:Z

    .line 1499
    .line 1500
    if-nez v0, :cond_54

    .line 1501
    .line 1502
    aget v0, v39, v9

    .line 1503
    .line 1504
    if-ne v0, v7, :cond_4a

    .line 1505
    .line 1506
    instance-of v0, v15, Lv/e;

    .line 1507
    .line 1508
    if-eqz v0, :cond_4a

    .line 1509
    .line 1510
    const/16 v16, 0x1

    .line 1511
    .line 1512
    goto :goto_2e

    .line 1513
    :cond_4a
    const/16 v16, 0x0

    .line 1514
    .line 1515
    :goto_2e
    if-eqz v16, :cond_4b

    .line 1516
    .line 1517
    const/16 v40, 0x0

    .line 1518
    .line 1519
    :cond_4b
    iget-object v0, v15, Lv/d;->T:Lv/d;

    .line 1520
    .line 1521
    if-eqz v0, :cond_4c

    .line 1522
    .line 1523
    iget-object v0, v0, Lv/d;->L:Lv/c;

    .line 1524
    .line 1525
    invoke-virtual {v14, v0}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v0

    .line 1529
    move-object v5, v0

    .line 1530
    goto :goto_2f

    .line 1531
    :cond_4c
    move-object/from16 v5, v47

    .line 1532
    .line 1533
    :goto_2f
    iget-object v0, v15, Lv/d;->T:Lv/d;

    .line 1534
    .line 1535
    if-eqz v0, :cond_4d

    .line 1536
    .line 1537
    iget-object v0, v0, Lv/d;->J:Lv/c;

    .line 1538
    .line 1539
    invoke-virtual {v14, v0}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    .line 1540
    .line 1541
    .line 1542
    move-result-object v0

    .line 1543
    move-object/from16 v47, v0

    .line 1544
    .line 1545
    :cond_4d
    iget v0, v15, Lv/d;->a0:I

    .line 1546
    .line 1547
    if-gtz v0, :cond_4e

    .line 1548
    .line 1549
    iget v3, v15, Lv/d;->g0:I

    .line 1550
    .line 1551
    if-ne v3, v2, :cond_52

    .line 1552
    .line 1553
    :cond_4e
    move-object/from16 v3, v50

    .line 1554
    .line 1555
    iget-object v4, v3, Lv/c;->f:Lv/c;

    .line 1556
    .line 1557
    if-eqz v4, :cond_50

    .line 1558
    .line 1559
    invoke-virtual {v14, v1, v13, v0, v2}, Lt/c;->e(Lt/f;Lt/f;II)V

    .line 1560
    .line 1561
    .line 1562
    iget-object v0, v3, Lv/c;->f:Lv/c;

    .line 1563
    .line 1564
    invoke-virtual {v14, v0}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v0

    .line 1568
    invoke-virtual {v3}, Lv/c;->e()I

    .line 1569
    .line 1570
    .line 1571
    move-result v3

    .line 1572
    invoke-virtual {v14, v1, v0, v3, v2}, Lt/c;->e(Lt/f;Lt/f;II)V

    .line 1573
    .line 1574
    .line 1575
    if-eqz v28, :cond_4f

    .line 1576
    .line 1577
    move-object/from16 v0, v52

    .line 1578
    .line 1579
    invoke-virtual {v14, v0}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    .line 1580
    .line 1581
    .line 1582
    move-result-object v0

    .line 1583
    invoke-virtual {v14, v5, v0, v8, v6}, Lt/c;->f(Lt/f;Lt/f;II)V

    .line 1584
    .line 1585
    .line 1586
    :cond_4f
    const/16 v27, 0x0

    .line 1587
    .line 1588
    goto :goto_31

    .line 1589
    :cond_50
    iget v4, v15, Lv/d;->g0:I

    .line 1590
    .line 1591
    if-ne v4, v2, :cond_51

    .line 1592
    .line 1593
    invoke-virtual {v3}, Lv/c;->e()I

    .line 1594
    .line 1595
    .line 1596
    move-result v0

    .line 1597
    invoke-virtual {v14, v1, v13, v0, v2}, Lt/c;->e(Lt/f;Lt/f;II)V

    .line 1598
    .line 1599
    .line 1600
    goto :goto_30

    .line 1601
    :cond_51
    invoke-virtual {v14, v1, v13, v0, v2}, Lt/c;->e(Lt/f;Lt/f;II)V

    .line 1602
    .line 1603
    .line 1604
    :cond_52
    :goto_30
    move/from16 v27, v44

    .line 1605
    .line 1606
    :goto_31
    aget-boolean v17, v33, v9

    .line 1607
    .line 1608
    aget v18, v39, v9

    .line 1609
    .line 1610
    iget v4, v15, Lv/d;->Z:I

    .line 1611
    .line 1612
    iget v3, v15, Lv/d;->c0:I

    .line 1613
    .line 1614
    aget v19, v32, v9

    .line 1615
    .line 1616
    iget v1, v15, Lv/d;->e0:F

    .line 1617
    .line 1618
    aget v0, v39, v8

    .line 1619
    .line 1620
    const/4 v2, 0x3

    .line 1621
    if-ne v0, v2, :cond_53

    .line 1622
    .line 1623
    const/16 v20, 0x1

    .line 1624
    .line 1625
    goto :goto_32

    .line 1626
    :cond_53
    const/16 v20, 0x0

    .line 1627
    .line 1628
    :goto_32
    iget v0, v15, Lv/d;->x:I

    .line 1629
    .line 1630
    move/from16 v24, v0

    .line 1631
    .line 1632
    iget v0, v15, Lv/d;->y:I

    .line 1633
    .line 1634
    move/from16 v25, v0

    .line 1635
    .line 1636
    iget v0, v15, Lv/d;->z:F

    .line 1637
    .line 1638
    move/from16 v26, v0

    .line 1639
    .line 1640
    iget-object v10, v15, Lv/d;->J:Lv/c;

    .line 1641
    .line 1642
    iget-object v11, v15, Lv/d;->L:Lv/c;

    .line 1643
    .line 1644
    const/4 v0, 0x0

    .line 1645
    move v2, v0

    .line 1646
    move-object/from16 v0, p0

    .line 1647
    .line 1648
    move/from16 v21, v1

    .line 1649
    .line 1650
    move-object/from16 v1, p1

    .line 1651
    .line 1652
    move/from16 v22, v3

    .line 1653
    .line 1654
    move/from16 v3, v28

    .line 1655
    .line 1656
    move/from16 v23, v4

    .line 1657
    .line 1658
    move/from16 v4, v29

    .line 1659
    .line 1660
    move-object/from16 v28, v5

    .line 1661
    .line 1662
    move/from16 v5, v17

    .line 1663
    .line 1664
    move-object/from16 v6, v47

    .line 1665
    .line 1666
    move-object/from16 v7, v28

    .line 1667
    .line 1668
    move/from16 v8, v18

    .line 1669
    .line 1670
    move/from16 v9, v16

    .line 1671
    .line 1672
    move-object/from16 v56, v12

    .line 1673
    .line 1674
    move/from16 v12, v23

    .line 1675
    .line 1676
    move-object/from16 v57, v13

    .line 1677
    .line 1678
    move/from16 v13, v40

    .line 1679
    .line 1680
    move/from16 v14, v22

    .line 1681
    .line 1682
    move/from16 v15, v19

    .line 1683
    .line 1684
    move/from16 v16, v21

    .line 1685
    .line 1686
    move/from16 v17, v43

    .line 1687
    .line 1688
    move/from16 v18, v20

    .line 1689
    .line 1690
    move/from16 v19, v30

    .line 1691
    .line 1692
    move/from16 v20, v31

    .line 1693
    .line 1694
    move/from16 v21, v46

    .line 1695
    .line 1696
    move/from16 v22, v41

    .line 1697
    .line 1698
    move/from16 v23, v42

    .line 1699
    .line 1700
    invoke-virtual/range {v0 .. v27}, Lv/d;->d(Lt/c;ZZZZLt/f;Lt/f;IZLv/c;Lv/c;IIIIFZZZZZIIIIFZ)V

    .line 1701
    .line 1702
    .line 1703
    goto :goto_33

    .line 1704
    :cond_54
    move-object/from16 v56, v12

    .line 1705
    .line 1706
    move-object/from16 v57, v13

    .line 1707
    .line 1708
    :goto_33
    move-object/from16 v0, p0

    .line 1709
    .line 1710
    if-eqz v38, :cond_56

    .line 1711
    .line 1712
    iget v1, v0, Lv/d;->A:I

    .line 1713
    .line 1714
    const/high16 v2, -0x40800000    # -1.0f

    .line 1715
    .line 1716
    const/4 v3, 0x1

    .line 1717
    if-ne v1, v3, :cond_55

    .line 1718
    .line 1719
    iget v1, v0, Lv/d;->B:F

    .line 1720
    .line 1721
    invoke-virtual/range {p1 .. p1}, Lt/c;->l()Lt/b;

    .line 1722
    .line 1723
    .line 1724
    move-result-object v3

    .line 1725
    iget-object v4, v3, Lt/b;->d:Lt/a;

    .line 1726
    .line 1727
    move-object/from16 v5, v56

    .line 1728
    .line 1729
    invoke-virtual {v4, v5, v2}, Lt/a;->g(Lt/f;F)V

    .line 1730
    .line 1731
    .line 1732
    iget-object v2, v3, Lt/b;->d:Lt/a;

    .line 1733
    .line 1734
    move-object/from16 v4, v57

    .line 1735
    .line 1736
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1737
    .line 1738
    invoke-virtual {v2, v4, v6}, Lt/a;->g(Lt/f;F)V

    .line 1739
    .line 1740
    .line 1741
    iget-object v2, v3, Lt/b;->d:Lt/a;

    .line 1742
    .line 1743
    move-object/from16 v7, v54

    .line 1744
    .line 1745
    invoke-virtual {v2, v7, v1}, Lt/a;->g(Lt/f;F)V

    .line 1746
    .line 1747
    .line 1748
    iget-object v2, v3, Lt/b;->d:Lt/a;

    .line 1749
    .line 1750
    neg-float v1, v1

    .line 1751
    move-object/from16 v8, v55

    .line 1752
    .line 1753
    invoke-virtual {v2, v8, v1}, Lt/a;->g(Lt/f;F)V

    .line 1754
    .line 1755
    .line 1756
    move-object/from16 v1, p1

    .line 1757
    .line 1758
    invoke-virtual {v1, v3}, Lt/c;->c(Lt/b;)V

    .line 1759
    .line 1760
    .line 1761
    goto :goto_34

    .line 1762
    :cond_55
    move-object/from16 v1, p1

    .line 1763
    .line 1764
    move-object/from16 v7, v54

    .line 1765
    .line 1766
    move-object/from16 v8, v55

    .line 1767
    .line 1768
    move-object/from16 v5, v56

    .line 1769
    .line 1770
    move-object/from16 v4, v57

    .line 1771
    .line 1772
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1773
    .line 1774
    iget v3, v0, Lv/d;->B:F

    .line 1775
    .line 1776
    invoke-virtual/range {p1 .. p1}, Lt/c;->l()Lt/b;

    .line 1777
    .line 1778
    .line 1779
    move-result-object v9

    .line 1780
    iget-object v10, v9, Lt/b;->d:Lt/a;

    .line 1781
    .line 1782
    invoke-virtual {v10, v7, v2}, Lt/a;->g(Lt/f;F)V

    .line 1783
    .line 1784
    .line 1785
    iget-object v2, v9, Lt/b;->d:Lt/a;

    .line 1786
    .line 1787
    invoke-virtual {v2, v8, v6}, Lt/a;->g(Lt/f;F)V

    .line 1788
    .line 1789
    .line 1790
    iget-object v2, v9, Lt/b;->d:Lt/a;

    .line 1791
    .line 1792
    invoke-virtual {v2, v5, v3}, Lt/a;->g(Lt/f;F)V

    .line 1793
    .line 1794
    .line 1795
    iget-object v2, v9, Lt/b;->d:Lt/a;

    .line 1796
    .line 1797
    neg-float v3, v3

    .line 1798
    invoke-virtual {v2, v4, v3}, Lt/a;->g(Lt/f;F)V

    .line 1799
    .line 1800
    .line 1801
    invoke-virtual {v1, v9}, Lt/c;->c(Lt/b;)V

    .line 1802
    .line 1803
    .line 1804
    goto :goto_34

    .line 1805
    :cond_56
    move-object/from16 v1, p1

    .line 1806
    .line 1807
    :goto_34
    invoke-virtual/range {v36 .. v36}, Lv/c;->h()Z

    .line 1808
    .line 1809
    .line 1810
    move-result v2

    .line 1811
    if-eqz v2, :cond_57

    .line 1812
    .line 1813
    move-object/from16 v2, v36

    .line 1814
    .line 1815
    iget-object v3, v2, Lv/c;->f:Lv/c;

    .line 1816
    .line 1817
    iget-object v3, v3, Lv/c;->d:Lv/d;

    .line 1818
    .line 1819
    iget v4, v0, Lv/d;->D:F

    .line 1820
    .line 1821
    const/high16 v5, 0x42b40000    # 90.0f

    .line 1822
    .line 1823
    add-float/2addr v4, v5

    .line 1824
    float-to-double v4, v4

    .line 1825
    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    .line 1826
    .line 1827
    .line 1828
    move-result-wide v4

    .line 1829
    double-to-float v4, v4

    .line 1830
    invoke-virtual {v2}, Lv/c;->e()I

    .line 1831
    .line 1832
    .line 1833
    move-result v2

    .line 1834
    const/4 v5, 0x2

    .line 1835
    invoke-virtual {v0, v5}, Lv/d;->i(I)Lv/c;

    .line 1836
    .line 1837
    .line 1838
    move-result-object v6

    .line 1839
    invoke-virtual {v1, v6}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    .line 1840
    .line 1841
    .line 1842
    move-result-object v6

    .line 1843
    const/4 v7, 0x3

    .line 1844
    invoke-virtual {v0, v7}, Lv/d;->i(I)Lv/c;

    .line 1845
    .line 1846
    .line 1847
    move-result-object v8

    .line 1848
    invoke-virtual {v1, v8}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    .line 1849
    .line 1850
    .line 1851
    move-result-object v8

    .line 1852
    const/4 v9, 0x4

    .line 1853
    invoke-virtual {v0, v9}, Lv/d;->i(I)Lv/c;

    .line 1854
    .line 1855
    .line 1856
    move-result-object v10

    .line 1857
    invoke-virtual {v1, v10}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    .line 1858
    .line 1859
    .line 1860
    move-result-object v10

    .line 1861
    const/4 v11, 0x5

    .line 1862
    invoke-virtual {v0, v11}, Lv/d;->i(I)Lv/c;

    .line 1863
    .line 1864
    .line 1865
    move-result-object v12

    .line 1866
    invoke-virtual {v1, v12}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    .line 1867
    .line 1868
    .line 1869
    move-result-object v12

    .line 1870
    invoke-virtual {v3, v5}, Lv/d;->i(I)Lv/c;

    .line 1871
    .line 1872
    .line 1873
    move-result-object v5

    .line 1874
    invoke-virtual {v1, v5}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    .line 1875
    .line 1876
    .line 1877
    move-result-object v5

    .line 1878
    invoke-virtual {v3, v7}, Lv/d;->i(I)Lv/c;

    .line 1879
    .line 1880
    .line 1881
    move-result-object v7

    .line 1882
    invoke-virtual {v1, v7}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    .line 1883
    .line 1884
    .line 1885
    move-result-object v7

    .line 1886
    invoke-virtual {v3, v9}, Lv/d;->i(I)Lv/c;

    .line 1887
    .line 1888
    .line 1889
    move-result-object v9

    .line 1890
    invoke-virtual {v1, v9}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    .line 1891
    .line 1892
    .line 1893
    move-result-object v9

    .line 1894
    invoke-virtual {v3, v11}, Lv/d;->i(I)Lv/c;

    .line 1895
    .line 1896
    .line 1897
    move-result-object v3

    .line 1898
    invoke-virtual {v1, v3}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    .line 1899
    .line 1900
    .line 1901
    move-result-object v3

    .line 1902
    invoke-virtual/range {p1 .. p1}, Lt/c;->l()Lt/b;

    .line 1903
    .line 1904
    .line 1905
    move-result-object v11

    .line 1906
    float-to-double v13, v4

    .line 1907
    invoke-static {v13, v14}, Ljava/lang/Math;->sin(D)D

    .line 1908
    .line 1909
    .line 1910
    move-result-wide v15

    .line 1911
    move-object v4, v9

    .line 1912
    move-object/from16 p2, v10

    .line 1913
    .line 1914
    int-to-double v9, v2

    .line 1915
    move-object/from16 v17, v4

    .line 1916
    .line 1917
    move-object v2, v5

    .line 1918
    mul-double v4, v15, v9

    .line 1919
    .line 1920
    double-to-float v4, v4

    .line 1921
    iget-object v5, v11, Lt/b;->d:Lt/a;

    .line 1922
    .line 1923
    const/high16 v15, 0x3f000000    # 0.5f

    .line 1924
    .line 1925
    invoke-virtual {v5, v7, v15}, Lt/a;->g(Lt/f;F)V

    .line 1926
    .line 1927
    .line 1928
    iget-object v5, v11, Lt/b;->d:Lt/a;

    .line 1929
    .line 1930
    invoke-virtual {v5, v3, v15}, Lt/a;->g(Lt/f;F)V

    .line 1931
    .line 1932
    .line 1933
    iget-object v3, v11, Lt/b;->d:Lt/a;

    .line 1934
    .line 1935
    const/high16 v5, -0x41000000    # -0.5f

    .line 1936
    .line 1937
    invoke-virtual {v3, v8, v5}, Lt/a;->g(Lt/f;F)V

    .line 1938
    .line 1939
    .line 1940
    iget-object v3, v11, Lt/b;->d:Lt/a;

    .line 1941
    .line 1942
    invoke-virtual {v3, v12, v5}, Lt/a;->g(Lt/f;F)V

    .line 1943
    .line 1944
    .line 1945
    neg-float v3, v4

    .line 1946
    iput v3, v11, Lt/b;->b:F

    .line 1947
    .line 1948
    invoke-virtual {v1, v11}, Lt/c;->c(Lt/b;)V

    .line 1949
    .line 1950
    .line 1951
    invoke-virtual/range {p1 .. p1}, Lt/c;->l()Lt/b;

    .line 1952
    .line 1953
    .line 1954
    move-result-object v3

    .line 1955
    invoke-static {v13, v14}, Ljava/lang/Math;->cos(D)D

    .line 1956
    .line 1957
    .line 1958
    move-result-wide v7

    .line 1959
    mul-double v7, v7, v9

    .line 1960
    .line 1961
    double-to-float v4, v7

    .line 1962
    iget-object v7, v3, Lt/b;->d:Lt/a;

    .line 1963
    .line 1964
    invoke-virtual {v7, v2, v15}, Lt/a;->g(Lt/f;F)V

    .line 1965
    .line 1966
    .line 1967
    iget-object v2, v3, Lt/b;->d:Lt/a;

    .line 1968
    .line 1969
    move-object/from16 v7, v17

    .line 1970
    .line 1971
    invoke-virtual {v2, v7, v15}, Lt/a;->g(Lt/f;F)V

    .line 1972
    .line 1973
    .line 1974
    iget-object v2, v3, Lt/b;->d:Lt/a;

    .line 1975
    .line 1976
    invoke-virtual {v2, v6, v5}, Lt/a;->g(Lt/f;F)V

    .line 1977
    .line 1978
    .line 1979
    iget-object v2, v3, Lt/b;->d:Lt/a;

    .line 1980
    .line 1981
    move-object/from16 v6, p2

    .line 1982
    .line 1983
    invoke-virtual {v2, v6, v5}, Lt/a;->g(Lt/f;F)V

    .line 1984
    .line 1985
    .line 1986
    neg-float v2, v4

    .line 1987
    iput v2, v3, Lt/b;->b:F

    .line 1988
    .line 1989
    invoke-virtual {v1, v3}, Lt/c;->c(Lt/b;)V

    .line 1990
    .line 1991
    .line 1992
    :cond_57
    const/4 v1, 0x0

    .line 1993
    iput-boolean v1, v0, Lv/d;->k:Z

    .line 1994
    .line 1995
    iput-boolean v1, v0, Lv/d;->l:Z

    .line 1996
    .line 1997
    return-void
.end method

.method public c()Z
    .locals 2

    .line 1
    iget v0, p0, Lv/d;->g0:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    return v0
.end method

.method public final d(Lt/c;ZZZZLt/f;Lt/f;IZLv/c;Lv/c;IIIIFZZZZZIIIIFZ)V
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    move-object/from16 v11, p6

    move-object/from16 v12, p7

    move-object/from16 v13, p10

    move-object/from16 v14, p11

    move/from16 v15, p14

    move/from16 v1, p15

    move/from16 v2, p23

    move/from16 v3, p24

    move/from16 v4, p25

    move/from16 v5, p26

    .line 1
    invoke-virtual {v10, v13}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    move-result-object v9

    .line 2
    invoke-virtual {v10, v14}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    move-result-object v8

    .line 3
    iget-object v6, v13, Lv/c;->f:Lv/c;

    .line 4
    invoke-virtual {v10, v6}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    move-result-object v7

    .line 5
    iget-object v6, v14, Lv/c;->f:Lv/c;

    .line 6
    invoke-virtual {v10, v6}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    move-result-object v6

    .line 7
    invoke-virtual/range {p10 .. p10}, Lv/c;->h()Z

    move-result v16

    .line 8
    invoke-virtual/range {p11 .. p11}, Lv/c;->h()Z

    move-result v17

    .line 9
    iget-object v12, v0, Lv/d;->P:Lv/c;

    invoke-virtual {v12}, Lv/c;->h()Z

    move-result v12

    if-eqz v17, :cond_0

    add-int/lit8 v18, v16, 0x1

    goto :goto_0

    :cond_0
    move/from16 v18, v16

    :goto_0
    if-eqz v12, :cond_1

    add-int/lit8 v18, v18, 0x1

    :cond_1
    move/from16 v2, v18

    if-eqz p17, :cond_2

    const/4 v14, 0x3

    goto :goto_1

    :cond_2
    move/from16 v14, p22

    .line 10
    :goto_1
    invoke-static/range {p8 .. p8}, Lt/e;->a(I)I

    move-result v11

    move-object/from16 v19, v6

    const/4 v6, 0x1

    if-eqz v11, :cond_3

    if-eq v11, v6, :cond_3

    const/4 v6, 0x2

    if-eq v11, v6, :cond_4

    :cond_3
    const/4 v6, 0x0

    goto :goto_2

    :cond_4
    const/4 v6, 0x4

    if-eq v14, v6, :cond_3

    const/4 v6, 0x1

    .line 11
    :goto_2
    iget v11, v0, Lv/d;->h:I

    const/4 v5, -0x1

    if-eq v11, v5, :cond_5

    if-eqz p2, :cond_5

    .line 12
    iput v5, v0, Lv/d;->h:I

    const/16 p13, 0x0

    goto :goto_3

    :cond_5
    move/from16 v11, p13

    move/from16 p13, v6

    .line 13
    :goto_3
    iget v6, v0, Lv/d;->i:I

    if-eq v6, v5, :cond_6

    if-nez p2, :cond_6

    .line 14
    iput v5, v0, Lv/d;->i:I

    move v11, v6

    const/4 v6, 0x0

    goto :goto_4

    :cond_6
    move/from16 v6, p13

    .line 15
    :goto_4
    iget v5, v0, Lv/d;->g0:I

    move/from16 p13, v11

    const/16 v11, 0x8

    if-ne v5, v11, :cond_7

    const/4 v5, 0x0

    const/4 v6, 0x0

    goto :goto_5

    :cond_7
    move/from16 v5, p13

    :goto_5
    if-eqz p27, :cond_8

    if-nez v16, :cond_9

    if-nez v17, :cond_9

    if-nez v12, :cond_9

    move/from16 v11, p12

    .line 16
    invoke-virtual {v10, v9, v11}, Lt/c;->d(Lt/f;I)V

    :cond_8
    move/from16 v22, v12

    const/16 v12, 0x8

    goto :goto_6

    :cond_9
    if-eqz v16, :cond_8

    if-nez v17, :cond_8

    .line 17
    invoke-virtual/range {p10 .. p10}, Lv/c;->e()I

    move-result v11

    move/from16 v22, v12

    const/16 v12, 0x8

    .line 18
    invoke-virtual {v10, v9, v7, v11, v12}, Lt/c;->e(Lt/f;Lt/f;II)V

    :goto_6
    if-nez v6, :cond_d

    if-eqz p9, :cond_b

    const/4 v11, 0x3

    const/4 v12, 0x0

    .line 19
    invoke-virtual {v10, v8, v9, v12, v11}, Lt/c;->e(Lt/f;Lt/f;II)V

    const/16 v11, 0x8

    if-lez v15, :cond_a

    .line 20
    invoke-virtual {v10, v8, v9, v15, v11}, Lt/c;->f(Lt/f;Lt/f;II)V

    :cond_a
    const v5, 0x7fffffff

    if-ge v1, v5, :cond_c

    .line 21
    invoke-virtual {v10, v8, v9, v1, v11}, Lt/c;->g(Lt/f;Lt/f;II)V

    goto :goto_7

    :cond_b
    const/16 v11, 0x8

    const/4 v12, 0x0

    .line 22
    invoke-virtual {v10, v8, v9, v5, v11}, Lt/c;->e(Lt/f;Lt/f;II)V

    :cond_c
    :goto_7
    move/from16 v11, p5

    move/from16 v23, v2

    move v12, v3

    move/from16 v24, v6

    goto/16 :goto_c

    :cond_d
    const/4 v1, 0x2

    const/4 v12, 0x0

    if-eq v2, v1, :cond_10

    if-nez p17, :cond_10

    const/4 v1, 0x1

    if-eq v14, v1, :cond_e

    if-nez v14, :cond_10

    .line 23
    :cond_e
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-lez v4, :cond_f

    .line 24
    invoke-static {v4, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_f
    const/16 v5, 0x8

    .line 25
    invoke-virtual {v10, v8, v9, v1, v5}, Lt/c;->e(Lt/f;Lt/f;II)V

    move/from16 v11, p5

    move/from16 v23, v2

    move v12, v3

    const/16 v24, 0x0

    goto/16 :goto_c

    :cond_10
    const/4 v1, -0x2

    if-ne v3, v1, :cond_11

    move v3, v5

    :cond_11
    if-ne v4, v1, :cond_12

    move v4, v5

    :cond_12
    if-lez v5, :cond_13

    const/4 v1, 0x1

    if-eq v14, v1, :cond_13

    const/4 v5, 0x0

    :cond_13
    const/16 v1, 0x8

    if-lez v3, :cond_14

    .line 26
    invoke-virtual {v10, v8, v9, v3, v1}, Lt/c;->f(Lt/f;Lt/f;II)V

    .line 27
    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    move-result v5

    :cond_14
    const/4 v11, 0x1

    if-lez v4, :cond_16

    if-eqz p3, :cond_15

    if-ne v14, v11, :cond_15

    goto :goto_8

    .line 28
    :cond_15
    invoke-virtual {v10, v8, v9, v4, v1}, Lt/c;->g(Lt/f;Lt/f;II)V

    .line 29
    :goto_8
    invoke-static {v5, v4}, Ljava/lang/Math;->min(II)I

    move-result v5

    :cond_16
    if-ne v14, v11, :cond_19

    if-eqz p3, :cond_17

    .line 30
    invoke-virtual {v10, v8, v9, v5, v1}, Lt/c;->e(Lt/f;Lt/f;II)V

    const/4 v11, 0x5

    goto :goto_7

    :cond_17
    if-eqz p19, :cond_18

    const/4 v11, 0x5

    .line 31
    invoke-virtual {v10, v8, v9, v5, v11}, Lt/c;->e(Lt/f;Lt/f;II)V

    .line 32
    invoke-virtual {v10, v8, v9, v5, v1}, Lt/c;->g(Lt/f;Lt/f;II)V

    goto :goto_7

    :cond_18
    const/4 v11, 0x5

    .line 33
    invoke-virtual {v10, v8, v9, v5, v11}, Lt/c;->e(Lt/f;Lt/f;II)V

    .line 34
    invoke-virtual {v10, v8, v9, v5, v1}, Lt/c;->g(Lt/f;Lt/f;II)V

    goto :goto_7

    :cond_19
    const/4 v1, 0x2

    const/4 v11, 0x5

    if-ne v14, v1, :cond_1d

    .line 35
    iget v5, v13, Lv/c;->e:I

    const/4 v12, 0x3

    if-eq v5, v12, :cond_1a

    if-ne v5, v11, :cond_1b

    :cond_1a
    const/4 v11, 0x4

    goto :goto_9

    .line 36
    :cond_1b
    iget-object v5, v0, Lv/d;->T:Lv/d;

    .line 37
    invoke-virtual {v5, v1}, Lv/d;->i(I)Lv/c;

    move-result-object v5

    .line 38
    invoke-virtual {v10, v5}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    move-result-object v1

    .line 39
    iget-object v5, v0, Lv/d;->T:Lv/d;

    const/4 v11, 0x4

    .line 40
    invoke-virtual {v5, v11}, Lv/d;->i(I)Lv/c;

    move-result-object v5

    .line 41
    invoke-virtual {v10, v5}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    move-result-object v5

    goto :goto_a

    .line 42
    :goto_9
    iget-object v1, v0, Lv/d;->T:Lv/d;

    const/4 v5, 0x3

    .line 43
    invoke-virtual {v1, v5}, Lv/d;->i(I)Lv/c;

    move-result-object v1

    .line 44
    invoke-virtual {v10, v1}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    move-result-object v1

    .line 45
    iget-object v12, v0, Lv/d;->T:Lv/d;

    const/4 v5, 0x5

    .line 46
    invoke-virtual {v12, v5}, Lv/d;->i(I)Lv/c;

    move-result-object v12

    .line 47
    invoke-virtual {v10, v12}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    move-result-object v5

    .line 48
    :goto_a
    invoke-virtual/range {p1 .. p1}, Lt/c;->l()Lt/b;

    move-result-object v12

    .line 49
    iget-object v11, v12, Lt/b;->d:Lt/a;

    move/from16 v23, v2

    const/high16 v2, -0x40800000    # -1.0f

    invoke-virtual {v11, v8, v2}, Lt/a;->g(Lt/f;F)V

    .line 50
    iget-object v2, v12, Lt/b;->d:Lt/a;

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-virtual {v2, v9, v11}, Lt/a;->g(Lt/f;F)V

    .line 51
    iget-object v2, v12, Lt/b;->d:Lt/a;

    move/from16 v11, p26

    invoke-virtual {v2, v5, v11}, Lt/a;->g(Lt/f;F)V

    .line 52
    iget-object v2, v12, Lt/b;->d:Lt/a;

    neg-float v5, v11

    invoke-virtual {v2, v1, v5}, Lt/a;->g(Lt/f;F)V

    .line 53
    invoke-virtual {v10, v12}, Lt/c;->c(Lt/b;)V

    if-eqz p3, :cond_1c

    const/4 v5, 0x0

    goto :goto_b

    :cond_1c
    move v5, v6

    :goto_b
    move/from16 v11, p5

    move v12, v3

    move/from16 v24, v5

    goto :goto_c

    :cond_1d
    move/from16 v23, v2

    move v12, v3

    move/from16 v24, v6

    const/4 v11, 0x1

    :goto_c
    if-eqz p27, :cond_59

    if-eqz p19, :cond_1e

    move-object/from16 v2, p6

    move-object/from16 v4, p7

    move-object v3, v8

    move-object v13, v9

    move/from16 p5, v11

    move/from16 v1, v23

    const/4 v5, 0x2

    const/16 v29, 0x1

    goto/16 :goto_2d

    :cond_1e
    if-nez v16, :cond_1f

    if-nez v17, :cond_1f

    if-nez v22, :cond_1f

    move-object/from16 v14, p11

    move-object v3, v8

    move/from16 p5, v11

    move-object/from16 v1, v19

    :goto_d
    const/4 v4, 0x5

    goto/16 :goto_2a

    :cond_1f
    if-eqz v16, :cond_21

    if-nez v17, :cond_21

    .line 54
    iget-object v1, v13, Lv/c;->f:Lv/c;

    iget-object v1, v1, Lv/c;->d:Lv/d;

    if-eqz p3, :cond_20

    .line 55
    instance-of v1, v1, Lv/a;

    if-eqz v1, :cond_20

    const/16 v1, 0x8

    goto :goto_e

    :cond_20
    const/4 v1, 0x5

    :goto_e
    move-object/from16 v14, p11

    move-object v3, v8

    move/from16 p5, v11

    move v11, v1

    move-object/from16 v1, v19

    move/from16 v19, p3

    goto/16 :goto_2b

    :cond_21
    if-nez v16, :cond_23

    if-eqz v17, :cond_23

    .line 56
    invoke-virtual/range {p11 .. p11}, Lv/c;->e()I

    move-result v1

    neg-int v1, v1

    move-object/from16 v6, v19

    const/16 v2, 0x8

    .line 57
    invoke-virtual {v10, v8, v6, v1, v2}, Lt/c;->e(Lt/f;Lt/f;II)V

    if-eqz p3, :cond_22

    move-object/from16 v5, p6

    const/4 v1, 0x0

    const/4 v2, 0x5

    .line 58
    invoke-virtual {v10, v9, v5, v1, v2}, Lt/c;->f(Lt/f;Lt/f;II)V

    :cond_22
    move-object/from16 v14, p11

    move-object v1, v6

    move-object v3, v8

    move/from16 p5, v11

    goto :goto_d

    :cond_23
    move-object/from16 v5, p6

    move-object/from16 v6, v19

    if-eqz v16, :cond_22

    if-eqz v17, :cond_22

    .line 59
    iget-object v1, v13, Lv/c;->f:Lv/c;

    iget-object v3, v1, Lv/c;->d:Lv/d;

    move-object/from16 v2, p11

    .line 60
    iget-object v1, v2, Lv/c;->f:Lv/c;

    iget-object v1, v1, Lv/c;->d:Lv/d;

    .line 61
    iget-object v13, v0, Lv/d;->T:Lv/d;

    const/16 v16, 0x6

    if-eqz v24, :cond_38

    if-nez v14, :cond_28

    if-nez v4, :cond_25

    if-nez v12, :cond_25

    .line 62
    iget-boolean v4, v7, Lt/f;->f:Z

    if-eqz v4, :cond_24

    iget-boolean v4, v6, Lt/f;->f:Z

    if-eqz v4, :cond_24

    .line 63
    invoke-virtual/range {p10 .. p10}, Lv/c;->e()I

    move-result v1

    const/16 v3, 0x8

    .line 64
    invoke-virtual {v10, v9, v7, v1, v3}, Lt/c;->e(Lt/f;Lt/f;II)V

    .line 65
    invoke-virtual/range {p11 .. p11}, Lv/c;->e()I

    move-result v1

    neg-int v1, v1

    .line 66
    invoke-virtual {v10, v8, v6, v1, v3}, Lt/c;->e(Lt/f;Lt/f;II)V

    return-void

    :cond_24
    const/16 p2, 0x8

    const/16 v17, 0x0

    const/16 v19, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x8

    goto :goto_f

    :cond_25
    const/16 p2, 0x5

    const/16 v17, 0x1

    const/16 v19, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x5

    .line 67
    :goto_f
    instance-of v4, v3, Lv/a;

    if-nez v4, :cond_27

    instance-of v4, v1, Lv/a;

    if-eqz v4, :cond_26

    goto :goto_12

    :cond_26
    move/from16 v4, p2

    move/from16 v20, v21

    move/from16 v23, v22

    const/4 v15, 0x1

    const/16 v22, 0x6

    :goto_10
    move/from16 v21, v19

    move/from16 v19, v17

    move/from16 v17, v14

    :goto_11
    move-object/from16 v14, p7

    goto/16 :goto_1d

    :cond_27
    :goto_12
    move/from16 v4, p2

    move/from16 v20, v21

    const/4 v15, 0x1

    const/16 v22, 0x6

    const/16 v23, 0x4

    goto :goto_10

    :cond_28
    const/4 v15, 0x2

    if-ne v14, v15, :cond_2b

    .line 68
    instance-of v4, v3, Lv/a;

    if-nez v4, :cond_2a

    instance-of v4, v1, Lv/a;

    if-eqz v4, :cond_29

    goto :goto_13

    :cond_29
    move/from16 v17, v14

    const/4 v4, 0x5

    const/4 v15, 0x1

    const/16 v19, 0x1

    const/16 v20, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x6

    const/16 v23, 0x5

    goto :goto_11

    :cond_2a
    :goto_13
    move/from16 v17, v14

    const/4 v4, 0x5

    :goto_14
    const/4 v15, 0x1

    const/16 v19, 0x1

    const/16 v20, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x6

    const/16 v23, 0x4

    goto :goto_11

    :cond_2b
    const/4 v15, 0x1

    if-ne v14, v15, :cond_2c

    move/from16 v17, v14

    const/16 v4, 0x8

    goto :goto_14

    :cond_2c
    const/4 v15, 0x3

    if-ne v14, v15, :cond_37

    .line 69
    iget v15, v0, Lv/d;->A:I

    move/from16 v17, v14

    const/4 v14, -0x1

    if-ne v15, v14, :cond_2f

    if-eqz p20, :cond_2e

    move-object/from16 v14, p7

    const/16 v4, 0x8

    const/4 v15, 0x1

    const/16 v19, 0x1

    const/16 v20, 0x1

    const/16 v21, 0x1

    if-eqz p3, :cond_2d

    const/16 v22, 0x5

    :goto_15
    const/16 v23, 0x5

    goto/16 :goto_1d

    :cond_2d
    const/16 v22, 0x4

    goto :goto_15

    :cond_2e
    move-object/from16 v14, p7

    const/16 v4, 0x8

    const/4 v15, 0x1

    const/16 v19, 0x1

    const/16 v20, 0x1

    const/16 v21, 0x1

    const/16 v22, 0x8

    goto :goto_15

    :cond_2f
    if-eqz p17, :cond_32

    move/from16 v14, p23

    const/4 v15, 0x2

    if-eq v14, v15, :cond_31

    const/4 v15, 0x1

    if-ne v14, v15, :cond_30

    goto :goto_16

    :cond_30
    const/16 v4, 0x8

    const/4 v14, 0x5

    goto :goto_17

    :cond_31
    const/4 v15, 0x1

    :goto_16
    const/4 v4, 0x5

    const/4 v14, 0x4

    :goto_17
    move/from16 v23, v14

    const/16 v19, 0x1

    const/16 v20, 0x1

    const/16 v21, 0x1

    const/16 v22, 0x6

    goto/16 :goto_11

    :cond_32
    const/4 v15, 0x1

    if-lez v4, :cond_33

    move-object/from16 v14, p7

    const/4 v4, 0x5

    const/16 v19, 0x1

    const/16 v20, 0x1

    const/16 v21, 0x1

    const/16 v22, 0x6

    goto :goto_15

    :cond_33
    if-nez v4, :cond_36

    if-nez v12, :cond_36

    if-nez p20, :cond_34

    move-object/from16 v14, p7

    const/4 v4, 0x5

    const/16 v19, 0x1

    const/16 v20, 0x1

    const/16 v21, 0x1

    const/16 v22, 0x6

    const/16 v23, 0x8

    goto/16 :goto_1d

    :cond_34
    if-eq v3, v13, :cond_35

    if-eq v1, v13, :cond_35

    const/4 v4, 0x4

    goto :goto_18

    :cond_35
    const/4 v4, 0x5

    :goto_18
    move-object/from16 v14, p7

    :goto_19
    const/16 v19, 0x1

    const/16 v20, 0x1

    const/16 v21, 0x1

    :goto_1a
    const/16 v22, 0x6

    const/16 v23, 0x4

    goto :goto_1d

    :cond_36
    move-object/from16 v14, p7

    const/4 v4, 0x5

    goto :goto_19

    :cond_37
    move/from16 v17, v14

    const/4 v15, 0x1

    move-object/from16 v14, p7

    const/4 v4, 0x5

    const/16 v19, 0x0

    const/16 v20, 0x0

    :goto_1b
    const/16 v21, 0x0

    goto :goto_1a

    :cond_38
    move/from16 v17, v14

    const/4 v15, 0x1

    .line 70
    iget-boolean v4, v7, Lt/f;->f:Z

    if-eqz v4, :cond_3b

    iget-boolean v4, v6, Lt/f;->f:Z

    if-eqz v4, :cond_3b

    .line 71
    invoke-virtual/range {p10 .. p10}, Lv/c;->e()I

    move-result v1

    .line 72
    invoke-virtual/range {p11 .. p11}, Lv/c;->e()I

    move-result v3

    const/16 v4, 0x8

    move-object/from16 p17, p1

    move-object/from16 p18, v9

    move-object/from16 p19, v7

    move/from16 p20, v1

    move/from16 p21, p16

    move-object/from16 p22, v6

    move-object/from16 p23, v8

    move/from16 p24, v3

    move/from16 p25, v4

    .line 73
    invoke-virtual/range {p17 .. p25}, Lt/c;->b(Lt/f;Lt/f;IFLt/f;Lt/f;II)V

    if-eqz p3, :cond_3a

    if-eqz v11, :cond_3a

    .line 74
    iget-object v1, v2, Lv/c;->f:Lv/c;

    if-eqz v1, :cond_39

    .line 75
    invoke-virtual/range {p11 .. p11}, Lv/c;->e()I

    move-result v5

    move-object/from16 v14, p7

    goto :goto_1c

    :cond_39
    move-object/from16 v14, p7

    const/4 v5, 0x0

    :goto_1c
    if-eq v6, v14, :cond_3a

    const/4 v1, 0x5

    .line 76
    invoke-virtual {v10, v14, v8, v5, v1}, Lt/c;->f(Lt/f;Lt/f;II)V

    :cond_3a
    return-void

    :cond_3b
    move-object/from16 v14, p7

    const/4 v4, 0x5

    const/16 v19, 0x1

    const/16 v20, 0x1

    goto :goto_1b

    :goto_1d
    if-eqz v20, :cond_3c

    if-ne v7, v6, :cond_3c

    if-eq v3, v13, :cond_3c

    const/16 v20, 0x0

    const/16 v25, 0x0

    goto :goto_1e

    :cond_3c
    const/16 v25, 0x1

    :goto_1e
    if-eqz v19, :cond_3e

    if-nez v24, :cond_3d

    if-nez p18, :cond_3d

    if-nez p20, :cond_3d

    if-ne v7, v5, :cond_3d

    if-ne v6, v14, :cond_3d

    const/16 v19, 0x0

    const/16 v22, 0x8

    const/16 v25, 0x0

    const/16 v26, 0x8

    goto :goto_1f

    :cond_3d
    move/from16 v19, p3

    move/from16 v26, v22

    move/from16 v22, v4

    .line 77
    :goto_1f
    invoke-virtual/range {p10 .. p10}, Lv/c;->e()I

    move-result v4

    .line 78
    invoke-virtual/range {p11 .. p11}, Lv/c;->e()I

    move-result v27

    move-object v15, v1

    move-object/from16 v1, p1

    move-object v14, v2

    move-object v2, v9

    move/from16 p5, v11

    move-object v11, v3

    move-object v3, v7

    move/from16 p9, v12

    move-object v12, v5

    move/from16 v5, p16

    move-object/from16 p2, v6

    const/16 v28, 0x4

    const/16 v29, 0x1

    move-object v12, v7

    move-object v7, v8

    move-object/from16 p8, v13

    move-object v13, v8

    move/from16 v8, v27

    move-object/from16 v27, v13

    move-object v13, v9

    move/from16 v9, v26

    .line 79
    invoke-virtual/range {v1 .. v9}, Lt/c;->b(Lt/f;Lt/f;IFLt/f;Lt/f;II)V

    move/from16 v4, v22

    :goto_20
    move/from16 v6, v25

    goto :goto_21

    :cond_3e
    move-object v15, v1

    move-object v14, v2

    move-object/from16 p2, v6

    move-object/from16 v27, v8

    move/from16 p5, v11

    move/from16 p9, v12

    move-object/from16 p8, v13

    const/16 v28, 0x4

    const/16 v29, 0x1

    move-object v11, v3

    move-object v12, v7

    move-object v13, v9

    move/from16 v19, p3

    goto :goto_20

    .line 80
    :goto_21
    iget v1, v0, Lv/d;->g0:I

    const/16 v2, 0x8

    if-ne v1, v2, :cond_41

    .line 81
    iget-object v1, v14, Lv/c;->a:Ljava/util/HashSet;

    if-nez v1, :cond_3f

    goto :goto_22

    .line 82
    :cond_3f
    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    move-result v1

    if-lez v1, :cond_40

    goto :goto_23

    :cond_40
    :goto_22
    return-void

    :cond_41
    :goto_23
    move-object/from16 v1, p2

    if-eqz v20, :cond_44

    if-eqz v19, :cond_43

    if-eq v12, v1, :cond_43

    if-nez v24, :cond_43

    .line 83
    instance-of v2, v11, Lv/a;

    if-nez v2, :cond_42

    instance-of v2, v15, Lv/a;

    if-eqz v2, :cond_43

    :cond_42
    const/4 v4, 0x6

    .line 84
    :cond_43
    invoke-virtual/range {p10 .. p10}, Lv/c;->e()I

    move-result v2

    .line 85
    invoke-virtual {v10, v13, v12, v2, v4}, Lt/c;->f(Lt/f;Lt/f;II)V

    .line 86
    invoke-virtual/range {p11 .. p11}, Lv/c;->e()I

    move-result v2

    neg-int v2, v2

    move-object/from16 v3, v27

    invoke-virtual {v10, v3, v1, v2, v4}, Lt/c;->g(Lt/f;Lt/f;II)V

    goto :goto_24

    :cond_44
    move-object/from16 v3, v27

    :goto_24
    if-eqz v19, :cond_45

    if-eqz p21, :cond_45

    .line 87
    instance-of v2, v11, Lv/a;

    if-nez v2, :cond_45

    instance-of v2, v15, Lv/a;

    if-nez v2, :cond_45

    move-object/from16 v2, p8

    if-eq v15, v2, :cond_46

    const/4 v4, 0x6

    const/4 v5, 0x6

    const/4 v6, 0x1

    goto :goto_25

    :cond_45
    move-object/from16 v2, p8

    :cond_46
    move/from16 v5, v23

    :goto_25
    if-eqz v6, :cond_52

    if-eqz v21, :cond_4f

    if-eqz p20, :cond_47

    if-eqz p4, :cond_4f

    :cond_47
    if-eq v11, v2, :cond_49

    if-ne v15, v2, :cond_48

    goto :goto_26

    :cond_48
    move/from16 v16, v5

    .line 88
    :cond_49
    :goto_26
    instance-of v6, v11, Lv/h;

    if-nez v6, :cond_4a

    instance-of v6, v15, Lv/h;

    if-eqz v6, :cond_4b

    :cond_4a
    const/16 v16, 0x5

    .line 89
    :cond_4b
    instance-of v6, v11, Lv/a;

    if-nez v6, :cond_4c

    instance-of v6, v15, Lv/a;

    if-eqz v6, :cond_4d

    :cond_4c
    const/16 v16, 0x5

    :cond_4d
    if-eqz p20, :cond_4e

    const/4 v6, 0x5

    goto :goto_27

    :cond_4e
    move/from16 v6, v16

    .line 90
    :goto_27
    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    :cond_4f
    move v6, v5

    if-eqz v19, :cond_51

    .line 91
    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    if-eqz p17, :cond_51

    if-nez p20, :cond_51

    if-eq v11, v2, :cond_50

    if-ne v15, v2, :cond_51

    :cond_50
    const/4 v6, 0x4

    .line 92
    :cond_51
    invoke-virtual/range {p10 .. p10}, Lv/c;->e()I

    move-result v2

    .line 93
    invoke-virtual {v10, v13, v12, v2, v6}, Lt/c;->e(Lt/f;Lt/f;II)V

    .line 94
    invoke-virtual/range {p11 .. p11}, Lv/c;->e()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {v10, v3, v1, v2, v6}, Lt/c;->e(Lt/f;Lt/f;II)V

    :cond_52
    if-eqz v19, :cond_54

    move-object/from16 v2, p6

    move-object v4, v12

    if-ne v2, v4, :cond_53

    .line 95
    invoke-virtual/range {p10 .. p10}, Lv/c;->e()I

    move-result v5

    goto :goto_28

    :cond_53
    const/4 v5, 0x0

    :goto_28
    if-eq v4, v2, :cond_54

    const/4 v4, 0x5

    .line 96
    invoke-virtual {v10, v13, v2, v5, v4}, Lt/c;->f(Lt/f;Lt/f;II)V

    :cond_54
    if-eqz v19, :cond_55

    if-eqz v24, :cond_55

    if-nez p14, :cond_55

    if-nez p9, :cond_55

    if-eqz v24, :cond_56

    move/from16 v4, v17

    const/4 v2, 0x3

    if-ne v4, v2, :cond_56

    const/4 v2, 0x0

    const/16 v4, 0x8

    .line 97
    invoke-virtual {v10, v3, v13, v2, v4}, Lt/c;->f(Lt/f;Lt/f;II)V

    :cond_55
    const/4 v4, 0x5

    goto :goto_29

    :cond_56
    const/4 v2, 0x0

    const/4 v4, 0x5

    .line 98
    invoke-virtual {v10, v3, v13, v2, v4}, Lt/c;->f(Lt/f;Lt/f;II)V

    :goto_29
    const/4 v11, 0x5

    goto :goto_2b

    :goto_2a
    move/from16 v19, p3

    goto :goto_29

    :goto_2b
    if-eqz v19, :cond_58

    if-eqz p5, :cond_58

    .line 99
    iget-object v2, v14, Lv/c;->f:Lv/c;

    if-eqz v2, :cond_57

    .line 100
    invoke-virtual/range {p11 .. p11}, Lv/c;->e()I

    move-result v5

    move-object/from16 v4, p7

    goto :goto_2c

    :cond_57
    move-object/from16 v4, p7

    const/4 v5, 0x0

    :goto_2c
    if-eq v1, v4, :cond_58

    .line 101
    invoke-virtual {v10, v4, v3, v5, v11}, Lt/c;->f(Lt/f;Lt/f;II)V

    :cond_58
    return-void

    :cond_59
    move-object/from16 v2, p6

    move-object/from16 v4, p7

    move-object v3, v8

    move-object v13, v9

    move/from16 p5, v11

    move/from16 v1, v23

    const/16 v29, 0x1

    const/4 v5, 0x2

    :goto_2d
    if-ge v1, v5, :cond_5e

    if-eqz p3, :cond_5e

    if-eqz p5, :cond_5e

    const/4 v1, 0x0

    const/16 v5, 0x8

    .line 102
    invoke-virtual {v10, v13, v2, v1, v5}, Lt/c;->f(Lt/f;Lt/f;II)V

    .line 103
    iget-object v1, v0, Lv/d;->M:Lv/c;

    if-nez p2, :cond_5b

    iget-object v2, v1, Lv/c;->f:Lv/c;

    if-nez v2, :cond_5a

    goto :goto_2e

    :cond_5a
    const/4 v6, 0x0

    goto :goto_2f

    :cond_5b
    :goto_2e
    const/4 v6, 0x1

    :goto_2f
    if-nez p2, :cond_5d

    .line 104
    iget-object v1, v1, Lv/c;->f:Lv/c;

    if-eqz v1, :cond_5d

    .line 105
    iget-object v1, v1, Lv/c;->d:Lv/d;

    iget v2, v1, Lv/d;->W:F

    const/4 v5, 0x0

    cmpl-float v2, v2, v5

    if-eqz v2, :cond_5c

    iget-object v1, v1, Lv/d;->p0:[I

    const/4 v2, 0x0

    aget v5, v1, v2

    const/4 v2, 0x3

    if-ne v5, v2, :cond_5c

    aget v1, v1, v29

    if-ne v1, v2, :cond_5c

    const/4 v6, 0x1

    goto :goto_30

    :cond_5c
    const/4 v6, 0x0

    :cond_5d
    :goto_30
    if-eqz v6, :cond_5e

    const/4 v1, 0x0

    const/16 v2, 0x8

    .line 106
    invoke-virtual {v10, v4, v3, v1, v2}, Lt/c;->f(Lt/f;Lt/f;II)V

    :cond_5e
    return-void
.end method

.method public final e(ILv/d;II)V
    .locals 10

    .line 1
    const/4 v0, 0x7

    .line 2
    const/16 v1, 0x9

    .line 3
    .line 4
    const/16 v2, 0x8

    .line 5
    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x3

    .line 8
    const/4 v5, 0x4

    .line 9
    const/4 v6, 0x5

    .line 10
    const/4 v7, 0x0

    .line 11
    if-ne p1, v0, :cond_c

    .line 12
    .line 13
    if-ne p3, v0, :cond_8

    .line 14
    .line 15
    invoke-virtual {p0, v3}, Lv/d;->i(I)Lv/c;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p0, v5}, Lv/d;->i(I)Lv/c;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    invoke-virtual {p0, v4}, Lv/d;->i(I)Lv/c;

    .line 24
    .line 25
    .line 26
    move-result-object p4

    .line 27
    invoke-virtual {p0, v6}, Lv/d;->i(I)Lv/c;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    const/4 v9, 0x1

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1}, Lv/c;->h()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-nez p1, :cond_1

    .line 39
    .line 40
    :cond_0
    if-eqz p3, :cond_2

    .line 41
    .line 42
    invoke-virtual {p3}, Lv/c;->h()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    :cond_1
    const/4 p1, 0x0

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-virtual {p0, v3, p2, v3, v7}, Lv/d;->e(ILv/d;II)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v5, p2, v5, v7}, Lv/d;->e(ILv/d;II)V

    .line 54
    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    :goto_0
    if-eqz p4, :cond_3

    .line 58
    .line 59
    invoke-virtual {p4}, Lv/c;->h()Z

    .line 60
    .line 61
    .line 62
    move-result p3

    .line 63
    if-nez p3, :cond_4

    .line 64
    .line 65
    :cond_3
    if-eqz v8, :cond_5

    .line 66
    .line 67
    invoke-virtual {v8}, Lv/c;->h()Z

    .line 68
    .line 69
    .line 70
    move-result p3

    .line 71
    if-eqz p3, :cond_5

    .line 72
    .line 73
    :cond_4
    const/4 v9, 0x0

    .line 74
    goto :goto_1

    .line 75
    :cond_5
    invoke-virtual {p0, v4, p2, v4, v7}, Lv/d;->e(ILv/d;II)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v6, p2, v6, v7}, Lv/d;->e(ILv/d;II)V

    .line 79
    .line 80
    .line 81
    :goto_1
    if-eqz p1, :cond_6

    .line 82
    .line 83
    if-eqz v9, :cond_6

    .line 84
    .line 85
    invoke-virtual {p0, v0}, Lv/d;->i(I)Lv/c;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p2, v0}, Lv/d;->i(I)Lv/c;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-virtual {p1, p2, v7}, Lv/c;->a(Lv/c;I)V

    .line 94
    .line 95
    .line 96
    goto/16 :goto_5

    .line 97
    .line 98
    :cond_6
    if-eqz p1, :cond_7

    .line 99
    .line 100
    invoke-virtual {p0, v2}, Lv/d;->i(I)Lv/c;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p2, v2}, Lv/d;->i(I)Lv/c;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-virtual {p1, p2, v7}, Lv/c;->a(Lv/c;I)V

    .line 109
    .line 110
    .line 111
    goto/16 :goto_5

    .line 112
    .line 113
    :cond_7
    if-eqz v9, :cond_1c

    .line 114
    .line 115
    invoke-virtual {p0, v1}, Lv/d;->i(I)Lv/c;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {p2, v1}, Lv/d;->i(I)Lv/c;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-virtual {p1, p2, v7}, Lv/c;->a(Lv/c;I)V

    .line 124
    .line 125
    .line 126
    goto/16 :goto_5

    .line 127
    .line 128
    :cond_8
    if-eq p3, v3, :cond_b

    .line 129
    .line 130
    if-ne p3, v5, :cond_9

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_9
    if-eq p3, v4, :cond_a

    .line 134
    .line 135
    if-ne p3, v6, :cond_1c

    .line 136
    .line 137
    :cond_a
    invoke-virtual {p0, v4, p2, p3, v7}, Lv/d;->e(ILv/d;II)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, v6, p2, p3, v7}, Lv/d;->e(ILv/d;II)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0, v0}, Lv/d;->i(I)Lv/c;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-virtual {p2, p3}, Lv/d;->i(I)Lv/c;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    invoke-virtual {p1, p2, v7}, Lv/c;->a(Lv/c;I)V

    .line 152
    .line 153
    .line 154
    goto/16 :goto_5

    .line 155
    .line 156
    :cond_b
    :goto_2
    invoke-virtual {p0, v3, p2, p3, v7}, Lv/d;->e(ILv/d;II)V

    .line 157
    .line 158
    .line 159
    :try_start_0
    invoke-virtual {p0, v5, p2, p3, v7}, Lv/d;->e(ILv/d;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0, v0}, Lv/d;->i(I)Lv/c;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-virtual {p2, p3}, Lv/d;->i(I)Lv/c;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    invoke-virtual {p1, p2, v7}, Lv/c;->a(Lv/c;I)V

    .line 171
    .line 172
    .line 173
    goto/16 :goto_5

    .line 174
    .line 175
    :catchall_0
    move-exception p1

    .line 176
    throw p1

    .line 177
    :cond_c
    if-ne p1, v2, :cond_e

    .line 178
    .line 179
    if-eq p3, v3, :cond_d

    .line 180
    .line 181
    if-ne p3, v5, :cond_e

    .line 182
    .line 183
    :cond_d
    invoke-virtual {p0, v3}, Lv/d;->i(I)Lv/c;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    invoke-virtual {p2, p3}, Lv/d;->i(I)Lv/c;

    .line 188
    .line 189
    .line 190
    move-result-object p2

    .line 191
    invoke-virtual {p0, v5}, Lv/d;->i(I)Lv/c;

    .line 192
    .line 193
    .line 194
    move-result-object p3

    .line 195
    invoke-virtual {p1, p2, v7}, Lv/c;->a(Lv/c;I)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p3, p2, v7}, Lv/c;->a(Lv/c;I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0, v2}, Lv/d;->i(I)Lv/c;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-virtual {p1, p2, v7}, Lv/c;->a(Lv/c;I)V

    .line 206
    .line 207
    .line 208
    goto/16 :goto_5

    .line 209
    .line 210
    :cond_e
    if-ne p1, v1, :cond_10

    .line 211
    .line 212
    if-eq p3, v4, :cond_f

    .line 213
    .line 214
    if-ne p3, v6, :cond_10

    .line 215
    .line 216
    :cond_f
    invoke-virtual {p2, p3}, Lv/d;->i(I)Lv/c;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-virtual {p0, v4}, Lv/d;->i(I)Lv/c;

    .line 221
    .line 222
    .line 223
    move-result-object p2

    .line 224
    invoke-virtual {p2, p1, v7}, Lv/c;->a(Lv/c;I)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p0, v6}, Lv/d;->i(I)Lv/c;

    .line 228
    .line 229
    .line 230
    move-result-object p2

    .line 231
    invoke-virtual {p2, p1, v7}, Lv/c;->a(Lv/c;I)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p0, v1}, Lv/d;->i(I)Lv/c;

    .line 235
    .line 236
    .line 237
    move-result-object p2

    .line 238
    invoke-virtual {p2, p1, v7}, Lv/c;->a(Lv/c;I)V

    .line 239
    .line 240
    .line 241
    goto/16 :goto_5

    .line 242
    .line 243
    :cond_10
    if-ne p1, v2, :cond_11

    .line 244
    .line 245
    if-ne p3, v2, :cond_11

    .line 246
    .line 247
    invoke-virtual {p0, v3}, Lv/d;->i(I)Lv/c;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    invoke-virtual {p2, v3}, Lv/d;->i(I)Lv/c;

    .line 252
    .line 253
    .line 254
    move-result-object p4

    .line 255
    invoke-virtual {p1, p4, v7}, Lv/c;->a(Lv/c;I)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {p0, v5}, Lv/d;->i(I)Lv/c;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    invoke-virtual {p2, v5}, Lv/d;->i(I)Lv/c;

    .line 263
    .line 264
    .line 265
    move-result-object p4

    .line 266
    invoke-virtual {p1, p4, v7}, Lv/c;->a(Lv/c;I)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {p0, v2}, Lv/d;->i(I)Lv/c;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    invoke-virtual {p2, p3}, Lv/d;->i(I)Lv/c;

    .line 274
    .line 275
    .line 276
    move-result-object p2

    .line 277
    invoke-virtual {p1, p2, v7}, Lv/c;->a(Lv/c;I)V

    .line 278
    .line 279
    .line 280
    goto/16 :goto_5

    .line 281
    .line 282
    :cond_11
    if-ne p1, v1, :cond_12

    .line 283
    .line 284
    if-ne p3, v1, :cond_12

    .line 285
    .line 286
    invoke-virtual {p0, v4}, Lv/d;->i(I)Lv/c;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    invoke-virtual {p2, v4}, Lv/d;->i(I)Lv/c;

    .line 291
    .line 292
    .line 293
    move-result-object p4

    .line 294
    invoke-virtual {p1, p4, v7}, Lv/c;->a(Lv/c;I)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {p0, v6}, Lv/d;->i(I)Lv/c;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    invoke-virtual {p2, v6}, Lv/d;->i(I)Lv/c;

    .line 302
    .line 303
    .line 304
    move-result-object p4

    .line 305
    invoke-virtual {p1, p4, v7}, Lv/c;->a(Lv/c;I)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {p0, v1}, Lv/d;->i(I)Lv/c;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    invoke-virtual {p2, p3}, Lv/d;->i(I)Lv/c;

    .line 313
    .line 314
    .line 315
    move-result-object p2

    .line 316
    invoke-virtual {p1, p2, v7}, Lv/c;->a(Lv/c;I)V

    .line 317
    .line 318
    .line 319
    goto/16 :goto_5

    .line 320
    .line 321
    :cond_12
    invoke-virtual {p0, p1}, Lv/d;->i(I)Lv/c;

    .line 322
    .line 323
    .line 324
    move-result-object v7

    .line 325
    invoke-virtual {p2, p3}, Lv/d;->i(I)Lv/c;

    .line 326
    .line 327
    .line 328
    move-result-object p2

    .line 329
    invoke-virtual {v7, p2}, Lv/c;->i(Lv/c;)Z

    .line 330
    .line 331
    .line 332
    move-result p3

    .line 333
    if-eqz p3, :cond_1c

    .line 334
    .line 335
    const/4 p3, 0x6

    .line 336
    if-ne p1, p3, :cond_14

    .line 337
    .line 338
    invoke-virtual {p0, v4}, Lv/d;->i(I)Lv/c;

    .line 339
    .line 340
    .line 341
    move-result-object p1

    .line 342
    invoke-virtual {p0, v6}, Lv/d;->i(I)Lv/c;

    .line 343
    .line 344
    .line 345
    move-result-object p3

    .line 346
    if-eqz p1, :cond_13

    .line 347
    .line 348
    invoke-virtual {p1}, Lv/c;->j()V

    .line 349
    .line 350
    .line 351
    :cond_13
    if-eqz p3, :cond_1b

    .line 352
    .line 353
    invoke-virtual {p3}, Lv/c;->j()V

    .line 354
    .line 355
    .line 356
    goto :goto_4

    .line 357
    :cond_14
    if-eq p1, v4, :cond_18

    .line 358
    .line 359
    if-ne p1, v6, :cond_15

    .line 360
    .line 361
    goto :goto_3

    .line 362
    :cond_15
    if-eq p1, v3, :cond_16

    .line 363
    .line 364
    if-ne p1, v5, :cond_1b

    .line 365
    .line 366
    :cond_16
    invoke-virtual {p0, v0}, Lv/d;->i(I)Lv/c;

    .line 367
    .line 368
    .line 369
    move-result-object p3

    .line 370
    iget-object v0, p3, Lv/c;->f:Lv/c;

    .line 371
    .line 372
    if-eq v0, p2, :cond_17

    .line 373
    .line 374
    invoke-virtual {p3}, Lv/c;->j()V

    .line 375
    .line 376
    .line 377
    :cond_17
    invoke-virtual {p0, p1}, Lv/d;->i(I)Lv/c;

    .line 378
    .line 379
    .line 380
    move-result-object p1

    .line 381
    invoke-virtual {p1}, Lv/c;->f()Lv/c;

    .line 382
    .line 383
    .line 384
    move-result-object p1

    .line 385
    invoke-virtual {p0, v2}, Lv/d;->i(I)Lv/c;

    .line 386
    .line 387
    .line 388
    move-result-object p3

    .line 389
    invoke-virtual {p3}, Lv/c;->h()Z

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    if-eqz v0, :cond_1b

    .line 394
    .line 395
    invoke-virtual {p1}, Lv/c;->j()V

    .line 396
    .line 397
    .line 398
    invoke-virtual {p3}, Lv/c;->j()V

    .line 399
    .line 400
    .line 401
    goto :goto_4

    .line 402
    :cond_18
    :goto_3
    invoke-virtual {p0, p3}, Lv/d;->i(I)Lv/c;

    .line 403
    .line 404
    .line 405
    move-result-object p3

    .line 406
    if-eqz p3, :cond_19

    .line 407
    .line 408
    invoke-virtual {p3}, Lv/c;->j()V

    .line 409
    .line 410
    .line 411
    :cond_19
    invoke-virtual {p0, v0}, Lv/d;->i(I)Lv/c;

    .line 412
    .line 413
    .line 414
    move-result-object p3

    .line 415
    iget-object v0, p3, Lv/c;->f:Lv/c;

    .line 416
    .line 417
    if-eq v0, p2, :cond_1a

    .line 418
    .line 419
    invoke-virtual {p3}, Lv/c;->j()V

    .line 420
    .line 421
    .line 422
    :cond_1a
    invoke-virtual {p0, p1}, Lv/d;->i(I)Lv/c;

    .line 423
    .line 424
    .line 425
    move-result-object p1

    .line 426
    invoke-virtual {p1}, Lv/c;->f()Lv/c;

    .line 427
    .line 428
    .line 429
    move-result-object p1

    .line 430
    invoke-virtual {p0, v1}, Lv/d;->i(I)Lv/c;

    .line 431
    .line 432
    .line 433
    move-result-object p3

    .line 434
    invoke-virtual {p3}, Lv/c;->h()Z

    .line 435
    .line 436
    .line 437
    move-result v0

    .line 438
    if-eqz v0, :cond_1b

    .line 439
    .line 440
    invoke-virtual {p1}, Lv/c;->j()V

    .line 441
    .line 442
    .line 443
    invoke-virtual {p3}, Lv/c;->j()V

    .line 444
    .line 445
    .line 446
    :cond_1b
    :goto_4
    invoke-virtual {v7, p2, p4}, Lv/c;->a(Lv/c;I)V

    .line 447
    .line 448
    .line 449
    :cond_1c
    :goto_5
    return-void
.end method

.method public final f(Lv/c;Lv/c;I)V
    .locals 1

    .line 1
    iget-object v0, p1, Lv/c;->d:Lv/d;

    .line 2
    .line 3
    if-ne v0, p0, :cond_0

    .line 4
    .line 5
    iget-object v0, p2, Lv/c;->d:Lv/d;

    .line 6
    .line 7
    iget p1, p1, Lv/c;->e:I

    .line 8
    .line 9
    iget p2, p2, Lv/c;->e:I

    .line 10
    .line 11
    invoke-virtual {p0, p1, v0, p2, p3}, Lv/d;->e(ILv/d;II)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final g(Lt/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv/d;->I:Lv/c;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv/d;->J:Lv/c;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lv/d;->K:Lv/c;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lv/d;->L:Lv/c;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    .line 19
    .line 20
    .line 21
    iget v0, p0, Lv/d;->a0:I

    .line 22
    .line 23
    if-lez v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Lv/d;->M:Lv/c;

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Lt/c;->k(Ljava/lang/Object;)Lt/f;

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public final h()V
    .locals 4

    .line 1
    iget-object v0, p0, Lv/d;->d:Lw/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lw/k;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lw/o;-><init>(Lv/d;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lw/o;->h:Lw/f;

    .line 11
    .line 12
    const/4 v2, 0x4

    .line 13
    iput v2, v1, Lw/f;->e:I

    .line 14
    .line 15
    iget-object v1, v0, Lw/o;->i:Lw/f;

    .line 16
    .line 17
    const/4 v2, 0x5

    .line 18
    iput v2, v1, Lw/f;->e:I

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    iput v1, v0, Lw/o;->f:I

    .line 22
    .line 23
    iput-object v0, p0, Lv/d;->d:Lw/k;

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lv/d;->e:Lw/m;

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    new-instance v0, Lw/m;

    .line 30
    .line 31
    invoke-direct {v0, p0}, Lw/o;-><init>(Lv/d;)V

    .line 32
    .line 33
    .line 34
    new-instance v1, Lw/f;

    .line 35
    .line 36
    invoke-direct {v1, v0}, Lw/f;-><init>(Lw/o;)V

    .line 37
    .line 38
    .line 39
    iput-object v1, v0, Lw/m;->k:Lw/f;

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    iput-object v2, v0, Lw/m;->l:Lw/a;

    .line 43
    .line 44
    iget-object v2, v0, Lw/o;->h:Lw/f;

    .line 45
    .line 46
    const/4 v3, 0x6

    .line 47
    iput v3, v2, Lw/f;->e:I

    .line 48
    .line 49
    iget-object v2, v0, Lw/o;->i:Lw/f;

    .line 50
    .line 51
    const/4 v3, 0x7

    .line 52
    iput v3, v2, Lw/f;->e:I

    .line 53
    .line 54
    const/16 v2, 0x8

    .line 55
    .line 56
    iput v2, v1, Lw/f;->e:I

    .line 57
    .line 58
    const/4 v1, 0x1

    .line 59
    iput v1, v0, Lw/o;->f:I

    .line 60
    .line 61
    iput-object v0, p0, Lv/d;->e:Lw/m;

    .line 62
    .line 63
    :cond_1
    return-void
.end method

.method public i(I)Lv/c;
    .locals 1

    .line 1
    invoke-static {p1}, Lt/e;->a(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljava/lang/AssertionError;

    .line 9
    .line 10
    invoke-static {p1}, LQ0/E;->i(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    throw v0

    .line 18
    :pswitch_0
    iget-object p1, p0, Lv/d;->O:Lv/c;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_1
    iget-object p1, p0, Lv/d;->N:Lv/c;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_2
    iget-object p1, p0, Lv/d;->P:Lv/c;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_3
    iget-object p1, p0, Lv/d;->M:Lv/c;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_4
    iget-object p1, p0, Lv/d;->L:Lv/c;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_5
    iget-object p1, p0, Lv/d;->K:Lv/c;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_6
    iget-object p1, p0, Lv/d;->J:Lv/c;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_7
    iget-object p1, p0, Lv/d;->I:Lv/c;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_8
    const/4 p1, 0x0

    .line 43
    return-object p1

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final j(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lv/d;->p0:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    aget p1, v0, v1

    .line 7
    .line 8
    return p1

    .line 9
    :cond_0
    const/4 v2, 0x1

    .line 10
    if-ne p1, v2, :cond_1

    .line 11
    .line 12
    aget p1, v0, v2

    .line 13
    .line 14
    return p1

    .line 15
    :cond_1
    return v1
.end method

.method public final k()I
    .locals 2

    .line 1
    iget v0, p0, Lv/d;->g0:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_0
    iget v0, p0, Lv/d;->V:I

    .line 10
    .line 11
    return v0
.end method

.method public final l(I)Lv/d;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lv/d;->K:Lv/c;

    .line 4
    .line 5
    iget-object v0, p1, Lv/c;->f:Lv/c;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v1, v0, Lv/c;->f:Lv/c;

    .line 10
    .line 11
    if-ne v1, p1, :cond_1

    .line 12
    .line 13
    iget-object p1, v0, Lv/c;->d:Lv/d;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    const/4 v0, 0x1

    .line 17
    if-ne p1, v0, :cond_1

    .line 18
    .line 19
    iget-object p1, p0, Lv/d;->L:Lv/c;

    .line 20
    .line 21
    iget-object v0, p1, Lv/c;->f:Lv/c;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v1, v0, Lv/c;->f:Lv/c;

    .line 26
    .line 27
    if-ne v1, p1, :cond_1

    .line 28
    .line 29
    iget-object p1, v0, Lv/c;->d:Lv/d;

    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_1
    const/4 p1, 0x0

    .line 33
    return-object p1
.end method

.method public final m(I)Lv/d;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lv/d;->I:Lv/c;

    .line 4
    .line 5
    iget-object v0, p1, Lv/c;->f:Lv/c;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v1, v0, Lv/c;->f:Lv/c;

    .line 10
    .line 11
    if-ne v1, p1, :cond_1

    .line 12
    .line 13
    iget-object p1, v0, Lv/c;->d:Lv/d;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    const/4 v0, 0x1

    .line 17
    if-ne p1, v0, :cond_1

    .line 18
    .line 19
    iget-object p1, p0, Lv/d;->J:Lv/c;

    .line 20
    .line 21
    iget-object v0, p1, Lv/c;->f:Lv/c;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v1, v0, Lv/c;->f:Lv/c;

    .line 26
    .line 27
    if-ne v1, p1, :cond_1

    .line 28
    .line 29
    iget-object p1, v0, Lv/c;->d:Lv/d;

    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_1
    const/4 p1, 0x0

    .line 33
    return-object p1
.end method

.method public n(Ljava/lang/StringBuilder;)V
    .locals 15

    .line 1
    move-object v0, p0

    .line 2
    move-object/from16 v10, p1

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "  "

    .line 7
    .line 8
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v2, v0, Lv/d;->j:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v2, ":{\n"

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v2, "    actualWidth:"

    .line 31
    .line 32
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget v2, v0, Lv/d;->U:I

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v1, "\n"

    .line 48
    .line 49
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    new-instance v2, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v3, "    actualHeight:"

    .line 55
    .line 56
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iget v3, v0, Lv/d;->V:I

    .line 60
    .line 61
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    new-instance v2, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-string v3, "    actualLeft:"

    .line 77
    .line 78
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget v3, v0, Lv/d;->Y:I

    .line 82
    .line 83
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    new-instance v2, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    const-string v3, "    actualTop:"

    .line 99
    .line 100
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    iget v3, v0, Lv/d;->Z:I

    .line 104
    .line 105
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string v1, "left"

    .line 119
    .line 120
    iget-object v2, v0, Lv/d;->I:Lv/c;

    .line 121
    .line 122
    invoke-static {v10, v1, v2}, Lv/d;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Lv/c;)V

    .line 123
    .line 124
    .line 125
    const-string v1, "top"

    .line 126
    .line 127
    iget-object v2, v0, Lv/d;->J:Lv/c;

    .line 128
    .line 129
    invoke-static {v10, v1, v2}, Lv/d;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Lv/c;)V

    .line 130
    .line 131
    .line 132
    const-string v1, "right"

    .line 133
    .line 134
    iget-object v2, v0, Lv/d;->K:Lv/c;

    .line 135
    .line 136
    invoke-static {v10, v1, v2}, Lv/d;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Lv/c;)V

    .line 137
    .line 138
    .line 139
    const-string v1, "bottom"

    .line 140
    .line 141
    iget-object v2, v0, Lv/d;->L:Lv/c;

    .line 142
    .line 143
    invoke-static {v10, v1, v2}, Lv/d;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Lv/c;)V

    .line 144
    .line 145
    .line 146
    const-string v1, "baseline"

    .line 147
    .line 148
    iget-object v2, v0, Lv/d;->M:Lv/c;

    .line 149
    .line 150
    invoke-static {v10, v1, v2}, Lv/d;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Lv/c;)V

    .line 151
    .line 152
    .line 153
    const-string v1, "centerX"

    .line 154
    .line 155
    iget-object v2, v0, Lv/d;->N:Lv/c;

    .line 156
    .line 157
    invoke-static {v10, v1, v2}, Lv/d;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Lv/c;)V

    .line 158
    .line 159
    .line 160
    const-string v1, "centerY"

    .line 161
    .line 162
    iget-object v2, v0, Lv/d;->O:Lv/c;

    .line 163
    .line 164
    invoke-static {v10, v1, v2}, Lv/d;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Lv/c;)V

    .line 165
    .line 166
    .line 167
    iget v3, v0, Lv/d;->U:I

    .line 168
    .line 169
    iget v4, v0, Lv/d;->b0:I

    .line 170
    .line 171
    iget-object v11, v0, Lv/d;->C:[I

    .line 172
    .line 173
    const/4 v12, 0x0

    .line 174
    aget v5, v11, v12

    .line 175
    .line 176
    iget v6, v0, Lv/d;->u:I

    .line 177
    .line 178
    iget v7, v0, Lv/d;->r:I

    .line 179
    .line 180
    iget v8, v0, Lv/d;->w:F

    .line 181
    .line 182
    iget-object v13, v0, Lv/d;->p0:[I

    .line 183
    .line 184
    aget v9, v13, v12

    .line 185
    .line 186
    iget-object v14, v0, Lv/d;->k0:[F

    .line 187
    .line 188
    aget v1, v14, v12

    .line 189
    .line 190
    const-string v2, "    width"

    .line 191
    .line 192
    move-object/from16 v1, p1

    .line 193
    .line 194
    invoke-static/range {v1 .. v9}, Lv/d;->o(Ljava/lang/StringBuilder;Ljava/lang/String;IIIIIFI)V

    .line 195
    .line 196
    .line 197
    iget v3, v0, Lv/d;->V:I

    .line 198
    .line 199
    iget v4, v0, Lv/d;->c0:I

    .line 200
    .line 201
    const/4 v1, 0x1

    .line 202
    aget v5, v11, v1

    .line 203
    .line 204
    iget v6, v0, Lv/d;->x:I

    .line 205
    .line 206
    iget v7, v0, Lv/d;->s:I

    .line 207
    .line 208
    iget v8, v0, Lv/d;->z:F

    .line 209
    .line 210
    aget v9, v13, v1

    .line 211
    .line 212
    aget v1, v14, v1

    .line 213
    .line 214
    const-string v2, "    height"

    .line 215
    .line 216
    move-object/from16 v1, p1

    .line 217
    .line 218
    invoke-static/range {v1 .. v9}, Lv/d;->o(Ljava/lang/StringBuilder;Ljava/lang/String;IIIIIFI)V

    .line 219
    .line 220
    .line 221
    iget v1, v0, Lv/d;->W:F

    .line 222
    .line 223
    iget v2, v0, Lv/d;->X:I

    .line 224
    .line 225
    const/4 v3, 0x0

    .line 226
    cmpl-float v3, v1, v3

    .line 227
    .line 228
    if-nez v3, :cond_0

    .line 229
    .line 230
    goto :goto_0

    .line 231
    :cond_0
    const-string v3, "    dimensionRatio"

    .line 232
    .line 233
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    const-string v3, " :  ["

    .line 237
    .line 238
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    const-string v1, ","

    .line 245
    .line 246
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    const-string v1, ""

    .line 253
    .line 254
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    const-string v1, "],\n"

    .line 258
    .line 259
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    :goto_0
    iget v1, v0, Lv/d;->d0:F

    .line 263
    .line 264
    const-string v2, "    horizontalBias"

    .line 265
    .line 266
    const/high16 v3, 0x3f000000    # 0.5f

    .line 267
    .line 268
    invoke-static {v10, v2, v1, v3}, Lv/d;->H(Ljava/lang/StringBuilder;Ljava/lang/String;FF)V

    .line 269
    .line 270
    .line 271
    const-string v1, "    verticalBias"

    .line 272
    .line 273
    iget v2, v0, Lv/d;->e0:F

    .line 274
    .line 275
    invoke-static {v10, v1, v2, v3}, Lv/d;->H(Ljava/lang/StringBuilder;Ljava/lang/String;FF)V

    .line 276
    .line 277
    .line 278
    const-string v1, "    horizontalChainStyle"

    .line 279
    .line 280
    iget v2, v0, Lv/d;->i0:I

    .line 281
    .line 282
    invoke-static {v2, v12, v1, v10}, Lv/d;->G(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 283
    .line 284
    .line 285
    const-string v1, "    verticalChainStyle"

    .line 286
    .line 287
    iget v2, v0, Lv/d;->j0:I

    .line 288
    .line 289
    invoke-static {v2, v12, v1, v10}, Lv/d;->G(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 290
    .line 291
    .line 292
    const-string v1, "  }"

    .line 293
    .line 294
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    return-void
.end method

.method public final q()I
    .locals 2

    .line 1
    iget v0, p0, Lv/d;->g0:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_0
    iget v0, p0, Lv/d;->U:I

    .line 10
    .line 11
    return v0
.end method

.method public final r()I
    .locals 2

    .line 1
    iget-object v0, p0, Lv/d;->T:Lv/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    instance-of v1, v0, Lv/e;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lv/e;

    .line 10
    .line 11
    iget v0, v0, Lv/e;->x0:I

    .line 12
    .line 13
    iget v1, p0, Lv/d;->Y:I

    .line 14
    .line 15
    add-int/2addr v0, v1

    .line 16
    return v0

    .line 17
    :cond_0
    iget v0, p0, Lv/d;->Y:I

    .line 18
    .line 19
    return v0
.end method

.method public final s()I
    .locals 2

    .line 1
    iget-object v0, p0, Lv/d;->T:Lv/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    instance-of v1, v0, Lv/e;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lv/e;

    .line 10
    .line 11
    iget v0, v0, Lv/e;->y0:I

    .line 12
    .line 13
    iget v1, p0, Lv/d;->Z:I

    .line 14
    .line 15
    add-int/2addr v0, v1

    .line 16
    return v0

    .line 17
    :cond_0
    iget v0, p0, Lv/d;->Z:I

    .line 18
    .line 19
    return v0
.end method

.method public final t(I)Z
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    if-nez p1, :cond_3

    .line 5
    .line 6
    iget-object p1, p0, Lv/d;->I:Lv/c;

    .line 7
    .line 8
    iget-object p1, p1, Lv/c;->f:Lv/c;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    iget-object v3, p0, Lv/d;->K:Lv/c;

    .line 16
    .line 17
    iget-object v3, v3, Lv/c;->f:Lv/c;

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const/4 v3, 0x0

    .line 24
    :goto_1
    add-int/2addr p1, v3

    .line 25
    if-ge p1, v0, :cond_2

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    :cond_2
    return v1

    .line 29
    :cond_3
    iget-object p1, p0, Lv/d;->J:Lv/c;

    .line 30
    .line 31
    iget-object p1, p1, Lv/c;->f:Lv/c;

    .line 32
    .line 33
    if-eqz p1, :cond_4

    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    goto :goto_2

    .line 37
    :cond_4
    const/4 p1, 0x0

    .line 38
    :goto_2
    iget-object v3, p0, Lv/d;->L:Lv/c;

    .line 39
    .line 40
    iget-object v3, v3, Lv/c;->f:Lv/c;

    .line 41
    .line 42
    if-eqz v3, :cond_5

    .line 43
    .line 44
    const/4 v3, 0x1

    .line 45
    goto :goto_3

    .line 46
    :cond_5
    const/4 v3, 0x0

    .line 47
    :goto_3
    add-int/2addr p1, v3

    .line 48
    iget-object v3, p0, Lv/d;->M:Lv/c;

    .line 49
    .line 50
    iget-object v3, v3, Lv/c;->f:Lv/c;

    .line 51
    .line 52
    if-eqz v3, :cond_6

    .line 53
    .line 54
    const/4 v3, 0x1

    .line 55
    goto :goto_4

    .line 56
    :cond_6
    const/4 v3, 0x0

    .line 57
    :goto_4
    add-int/2addr p1, v3

    .line 58
    if-ge p1, v0, :cond_7

    .line 59
    .line 60
    const/4 v1, 0x1

    .line 61
    :cond_7
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, ""

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lv/d;->h0:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v2, "id: "

    .line 18
    .line 19
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Lv/d;->h0:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v2, " "

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v1, "("

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    iget v1, p0, Lv/d;->Y:I

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v1, ", "

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget v1, p0, Lv/d;->Z:I

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v1, ") - ("

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    iget v1, p0, Lv/d;->U:I

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v1, " x "

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    iget v1, p0, Lv/d;->V:I

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v1, ")"

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    return-object v0
.end method

.method public final u(II)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    iget-object p1, p0, Lv/d;->I:Lv/c;

    .line 6
    .line 7
    iget-object v2, p1, Lv/c;->f:Lv/c;

    .line 8
    .line 9
    if-eqz v2, :cond_3

    .line 10
    .line 11
    iget-boolean v2, v2, Lv/c;->c:Z

    .line 12
    .line 13
    if-eqz v2, :cond_3

    .line 14
    .line 15
    iget-object v2, p0, Lv/d;->K:Lv/c;

    .line 16
    .line 17
    iget-object v3, v2, Lv/c;->f:Lv/c;

    .line 18
    .line 19
    if-eqz v3, :cond_3

    .line 20
    .line 21
    iget-boolean v4, v3, Lv/c;->c:Z

    .line 22
    .line 23
    if-eqz v4, :cond_3

    .line 24
    .line 25
    invoke-virtual {v3}, Lv/c;->d()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-virtual {v2}, Lv/c;->e()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    sub-int/2addr v3, v2

    .line 34
    iget-object v2, p1, Lv/c;->f:Lv/c;

    .line 35
    .line 36
    invoke-virtual {v2}, Lv/c;->d()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-virtual {p1}, Lv/c;->e()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    add-int/2addr p1, v2

    .line 45
    sub-int/2addr v3, p1

    .line 46
    if-lt v3, p2, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const/4 v0, 0x0

    .line 50
    :goto_0
    return v0

    .line 51
    :cond_1
    iget-object p1, p0, Lv/d;->J:Lv/c;

    .line 52
    .line 53
    iget-object v2, p1, Lv/c;->f:Lv/c;

    .line 54
    .line 55
    if-eqz v2, :cond_3

    .line 56
    .line 57
    iget-boolean v2, v2, Lv/c;->c:Z

    .line 58
    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    iget-object v2, p0, Lv/d;->L:Lv/c;

    .line 62
    .line 63
    iget-object v3, v2, Lv/c;->f:Lv/c;

    .line 64
    .line 65
    if-eqz v3, :cond_3

    .line 66
    .line 67
    iget-boolean v4, v3, Lv/c;->c:Z

    .line 68
    .line 69
    if-eqz v4, :cond_3

    .line 70
    .line 71
    invoke-virtual {v3}, Lv/c;->d()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    invoke-virtual {v2}, Lv/c;->e()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    sub-int/2addr v3, v2

    .line 80
    iget-object v2, p1, Lv/c;->f:Lv/c;

    .line 81
    .line 82
    invoke-virtual {v2}, Lv/c;->d()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    invoke-virtual {p1}, Lv/c;->e()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    add-int/2addr p1, v2

    .line 91
    sub-int/2addr v3, p1

    .line 92
    if-lt v3, p2, :cond_2

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    const/4 v0, 0x0

    .line 96
    :goto_1
    return v0

    .line 97
    :cond_3
    return v1
.end method

.method public final v(IIIILv/d;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lv/d;->i(I)Lv/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p5, p2}, Lv/d;->i(I)Lv/c;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const/4 p5, 0x1

    .line 10
    invoke-virtual {p1, p2, p3, p4, p5}, Lv/c;->b(Lv/c;IIZ)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final w(I)Z
    .locals 3

    .line 1
    mul-int/lit8 p1, p1, 0x2

    .line 2
    .line 3
    iget-object v0, p0, Lv/d;->Q:[Lv/c;

    .line 4
    .line 5
    aget-object v1, v0, p1

    .line 6
    .line 7
    iget-object v2, v1, Lv/c;->f:Lv/c;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    iget-object v2, v2, Lv/c;->f:Lv/c;

    .line 12
    .line 13
    if-eq v2, v1, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    add-int/2addr p1, v1

    .line 17
    aget-object p1, v0, p1

    .line 18
    .line 19
    iget-object v0, p1, Lv/c;->f:Lv/c;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, v0, Lv/c;->f:Lv/c;

    .line 24
    .line 25
    if-ne v0, p1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v1, 0x0

    .line 29
    :goto_0
    return v1
.end method

.method public final x()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lv/d;->I:Lv/c;

    .line 2
    .line 3
    iget-object v1, v0, Lv/c;->f:Lv/c;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v1, Lv/c;->f:Lv/c;

    .line 8
    .line 9
    if-eq v1, v0, :cond_1

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lv/d;->K:Lv/c;

    .line 12
    .line 13
    iget-object v1, v0, Lv/c;->f:Lv/c;

    .line 14
    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    iget-object v1, v1, Lv/c;->f:Lv/c;

    .line 18
    .line 19
    if-ne v1, v0, :cond_2

    .line 20
    .line 21
    :cond_1
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_2
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public final y()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lv/d;->J:Lv/c;

    .line 2
    .line 3
    iget-object v1, v0, Lv/c;->f:Lv/c;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v1, Lv/c;->f:Lv/c;

    .line 8
    .line 9
    if-eq v1, v0, :cond_1

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lv/d;->L:Lv/c;

    .line 12
    .line 13
    iget-object v1, v0, Lv/c;->f:Lv/c;

    .line 14
    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    iget-object v1, v1, Lv/c;->f:Lv/c;

    .line 18
    .line 19
    if-ne v1, v0, :cond_2

    .line 20
    .line 21
    :cond_1
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_2
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public final z()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lv/d;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lv/d;->g0:I

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    return v0
.end method
