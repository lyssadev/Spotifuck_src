.class public final Lk1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Lj1/f;

.field public final c:Lk1/b;

.field public final d:Lj1/b;

.field public final e:I

.field public final f:Lg1/A;

.field public final g:Lg1/z;

.field public final h:Lg1/b;

.field public final i:I

.field public final j:I

.field public final k:I

.field public l:I


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Lj1/f;Lk1/b;Lj1/b;ILg1/A;Lg1/z;Lg1/b;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk1/e;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    iput-object p4, p0, Lk1/e;->d:Lj1/b;

    .line 7
    .line 8
    iput-object p2, p0, Lk1/e;->b:Lj1/f;

    .line 9
    .line 10
    iput-object p3, p0, Lk1/e;->c:Lk1/b;

    .line 11
    .line 12
    iput p5, p0, Lk1/e;->e:I

    .line 13
    .line 14
    iput-object p6, p0, Lk1/e;->f:Lg1/A;

    .line 15
    .line 16
    iput-object p7, p0, Lk1/e;->g:Lg1/z;

    .line 17
    .line 18
    iput-object p8, p0, Lk1/e;->h:Lg1/b;

    .line 19
    .line 20
    iput p9, p0, Lk1/e;->i:I

    .line 21
    .line 22
    iput p10, p0, Lk1/e;->j:I

    .line 23
    .line 24
    iput p11, p0, Lk1/e;->k:I

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a(Lg1/A;)Lg1/C;
    .locals 3

    .line 1
    iget-object v0, p0, Lk1/e;->c:Lk1/b;

    .line 2
    .line 3
    iget-object v1, p0, Lk1/e;->d:Lj1/b;

    .line 4
    .line 5
    iget-object v2, p0, Lk1/e;->b:Lj1/f;

    .line 6
    .line 7
    invoke-virtual {p0, p1, v2, v0, v1}, Lk1/e;->b(Lg1/A;Lj1/f;Lk1/b;Lj1/b;)Lg1/C;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public final b(Lg1/A;Lj1/f;Lk1/b;Lj1/b;)Lg1/C;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v13, v0, Lk1/e;->a:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget v14, v0, Lk1/e;->e:I

    .line 10
    .line 11
    if-ge v14, v1, :cond_8

    .line 12
    .line 13
    iget v1, v0, Lk1/e;->l:I

    .line 14
    .line 15
    const/4 v15, 0x1

    .line 16
    add-int/2addr v1, v15

    .line 17
    iput v1, v0, Lk1/e;->l:I

    .line 18
    .line 19
    iget-object v1, v0, Lk1/e;->c:Lk1/b;

    .line 20
    .line 21
    const-string v12, "network interceptor "

    .line 22
    .line 23
    move-object/from16 v7, p1

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    iget-object v2, v7, Lg1/A;->a:Lg1/u;

    .line 28
    .line 29
    iget-object v3, v0, Lk1/e;->d:Lj1/b;

    .line 30
    .line 31
    invoke-virtual {v3, v2}, Lj1/b;->j(Lg1/u;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    new-instance v2, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v2, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    sub-int/2addr v14, v15

    .line 46
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v3, " must retain the same host and port"

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v1

    .line 66
    :cond_1
    :goto_0
    const-string v11, " must call proceed() exactly once"

    .line 67
    .line 68
    if-eqz v1, :cond_3

    .line 69
    .line 70
    iget v1, v0, Lk1/e;->l:I

    .line 71
    .line 72
    if-gt v1, v15, :cond_2

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 76
    .line 77
    new-instance v2, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v2, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    sub-int/2addr v14, v15

    .line 83
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw v1

    .line 101
    :cond_3
    :goto_1
    new-instance v10, Lk1/e;

    .line 102
    .line 103
    add-int/lit8 v9, v14, 0x1

    .line 104
    .line 105
    iget-object v8, v0, Lk1/e;->h:Lg1/b;

    .line 106
    .line 107
    iget v6, v0, Lk1/e;->i:I

    .line 108
    .line 109
    iget-object v5, v0, Lk1/e;->g:Lg1/z;

    .line 110
    .line 111
    iget v4, v0, Lk1/e;->j:I

    .line 112
    .line 113
    iget v3, v0, Lk1/e;->k:I

    .line 114
    .line 115
    move-object v1, v10

    .line 116
    move-object v2, v13

    .line 117
    move/from16 v16, v3

    .line 118
    .line 119
    move-object/from16 v3, p2

    .line 120
    .line 121
    move/from16 v17, v4

    .line 122
    .line 123
    move-object/from16 v4, p3

    .line 124
    .line 125
    move-object/from16 v18, v5

    .line 126
    .line 127
    move-object/from16 v5, p4

    .line 128
    .line 129
    move/from16 v19, v6

    .line 130
    .line 131
    move v6, v9

    .line 132
    move-object/from16 v7, p1

    .line 133
    .line 134
    move-object/from16 v20, v8

    .line 135
    .line 136
    move-object/from16 v8, v18

    .line 137
    .line 138
    move v15, v9

    .line 139
    move-object/from16 v9, v20

    .line 140
    .line 141
    move-object v0, v10

    .line 142
    move/from16 v10, v19

    .line 143
    .line 144
    move-object/from16 v21, v11

    .line 145
    .line 146
    move/from16 v11, v17

    .line 147
    .line 148
    move-object/from16 v22, v12

    .line 149
    .line 150
    move/from16 v12, v16

    .line 151
    .line 152
    invoke-direct/range {v1 .. v12}, Lk1/e;-><init>(Ljava/util/ArrayList;Lj1/f;Lk1/b;Lj1/b;ILg1/A;Lg1/z;Lg1/b;III)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    check-cast v1, Lg1/v;

    .line 160
    .line 161
    invoke-interface {v1, v0}, Lg1/v;->a(Lk1/e;)Lg1/C;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    if-eqz p3, :cond_5

    .line 166
    .line 167
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    if-ge v15, v3, :cond_5

    .line 172
    .line 173
    iget v0, v0, Lk1/e;->l:I

    .line 174
    .line 175
    const/4 v3, 0x1

    .line 176
    if-ne v0, v3, :cond_4

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 180
    .line 181
    new-instance v2, Ljava/lang/StringBuilder;

    .line 182
    .line 183
    move-object/from16 v3, v22

    .line 184
    .line 185
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    move-object/from16 v1, v21

    .line 192
    .line 193
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    throw v0

    .line 204
    :cond_5
    :goto_2
    const-string v0, "interceptor "

    .line 205
    .line 206
    if-eqz v2, :cond_7

    .line 207
    .line 208
    iget-object v3, v2, Lg1/C;->g:Lg1/E;

    .line 209
    .line 210
    if-eqz v3, :cond_6

    .line 211
    .line 212
    return-object v2

    .line 213
    :cond_6
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 214
    .line 215
    new-instance v3, Ljava/lang/StringBuilder;

    .line 216
    .line 217
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    const-string v0, " returned a response with no body"

    .line 224
    .line 225
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw v2

    .line 236
    :cond_7
    new-instance v2, Ljava/lang/NullPointerException;

    .line 237
    .line 238
    new-instance v3, Ljava/lang/StringBuilder;

    .line 239
    .line 240
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    const-string v0, " returned null"

    .line 247
    .line 248
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-direct {v2, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    throw v2

    .line 259
    :cond_8
    new-instance v0, Ljava/lang/AssertionError;

    .line 260
    .line 261
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 262
    .line 263
    .line 264
    throw v0
.end method
