.class public final Lj1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lg1/a;

.field public b:LK/j;

.field public c:Lg1/F;

.field public final d:Lg1/n;

.field public final e:Lg1/b;

.field public final f:Ljava/lang/Object;

.field public final g:Lj1/d;

.field public h:I

.field public i:Lj1/b;

.field public j:Z

.field public k:Z

.field public l:Lk1/b;


# direct methods
.method public constructor <init>(Lg1/n;Lg1/a;Lg1/z;Lg1/b;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj1/f;->d:Lg1/n;

    .line 5
    .line 6
    iput-object p2, p0, Lj1/f;->a:Lg1/a;

    .line 7
    .line 8
    iput-object p4, p0, Lj1/f;->e:Lg1/b;

    .line 9
    .line 10
    new-instance v0, Lj1/d;

    .line 11
    .line 12
    sget-object v1, Lg1/b;->e:Lg1/b;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object p1, p1, Lg1/n;->e:Lj0/w;

    .line 18
    .line 19
    invoke-direct {v0, p2, p1, p3, p4}, Lj1/d;-><init>(Lg1/a;Lj0/w;Lg1/z;Lg1/b;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lj1/f;->g:Lj1/d;

    .line 23
    .line 24
    iput-object p5, p0, Lj1/f;->f:Ljava/lang/Object;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final declared-synchronized a()Lj1/b;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lj1/f;->i:Lj1/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method

.method public final b(ZZZ)Ljava/net/Socket;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p3, :cond_0

    .line 3
    .line 4
    iput-object v0, p0, Lj1/f;->l:Lk1/b;

    .line 5
    .line 6
    :cond_0
    const/4 p3, 0x1

    .line 7
    if-eqz p2, :cond_1

    .line 8
    .line 9
    iput-boolean p3, p0, Lj1/f;->k:Z

    .line 10
    .line 11
    :cond_1
    iget-object p2, p0, Lj1/f;->i:Lj1/b;

    .line 12
    .line 13
    if-eqz p2, :cond_9

    .line 14
    .line 15
    if-eqz p1, :cond_2

    .line 16
    .line 17
    iput-boolean p3, p2, Lj1/b;->k:Z

    .line 18
    .line 19
    :cond_2
    iget-object p1, p0, Lj1/f;->l:Lk1/b;

    .line 20
    .line 21
    if-nez p1, :cond_9

    .line 22
    .line 23
    iget-boolean p1, p0, Lj1/f;->k:Z

    .line 24
    .line 25
    if-nez p1, :cond_3

    .line 26
    .line 27
    iget-boolean p1, p2, Lj1/b;->k:Z

    .line 28
    .line 29
    if-eqz p1, :cond_9

    .line 30
    .line 31
    :cond_3
    iget-object p1, p2, Lj1/b;->n:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    const/4 p3, 0x0

    .line 38
    :goto_0
    if-ge p3, p2, :cond_8

    .line 39
    .line 40
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Ljava/lang/ref/Reference;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-ne v1, p0, :cond_7

    .line 51
    .line 52
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lj1/f;->i:Lj1/b;

    .line 56
    .line 57
    iget-object p1, p1, Lj1/b;->n:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_6

    .line 64
    .line 65
    iget-object p1, p0, Lj1/f;->i:Lj1/b;

    .line 66
    .line 67
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 68
    .line 69
    .line 70
    move-result-wide p2

    .line 71
    iput-wide p2, p1, Lj1/b;->o:J

    .line 72
    .line 73
    sget-object p1, Lg1/b;->e:Lg1/b;

    .line 74
    .line 75
    iget-object p2, p0, Lj1/f;->i:Lj1/b;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Lj1/f;->d:Lg1/n;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    iget-boolean p3, p2, Lj1/b;->k:Z

    .line 86
    .line 87
    if-nez p3, :cond_5

    .line 88
    .line 89
    iget p3, p1, Lg1/n;->a:I

    .line 90
    .line 91
    if-nez p3, :cond_4

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_5
    :goto_1
    iget-object p1, p1, Lg1/n;->d:Ljava/util/ArrayDeque;

    .line 99
    .line 100
    invoke-virtual {p1, p2}, Ljava/util/ArrayDeque;->remove(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    iget-object p1, p0, Lj1/f;->i:Lj1/b;

    .line 104
    .line 105
    iget-object p1, p1, Lj1/b;->e:Ljava/net/Socket;

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_6
    :goto_2
    move-object p1, v0

    .line 109
    :goto_3
    iput-object v0, p0, Lj1/f;->i:Lj1/b;

    .line 110
    .line 111
    move-object v0, p1

    .line 112
    goto :goto_4

    .line 113
    :cond_7
    add-int/lit8 p3, p3, 0x1

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 117
    .line 118
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 119
    .line 120
    .line 121
    throw p1

    .line 122
    :cond_9
    :goto_4
    return-object v0
.end method

.method public final c(IIIZ)Lj1/b;
    .locals 15

    .line 1
    move-object v1, p0

    .line 2
    iget-object v2, v1, Lj1/f;->d:Lg1/n;

    .line 3
    .line 4
    monitor-enter v2

    .line 5
    :try_start_0
    iget-boolean v0, v1, Lj1/f;->k:Z

    .line 6
    .line 7
    if-nez v0, :cond_16

    .line 8
    .line 9
    iget-object v0, v1, Lj1/f;->l:Lk1/b;

    .line 10
    .line 11
    if-nez v0, :cond_15

    .line 12
    .line 13
    iget-object v0, v1, Lj1/f;->i:Lj1/b;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x1

    .line 17
    const/4 v5, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-boolean v6, v0, Lj1/b;->k:Z

    .line 21
    .line 22
    if-eqz v6, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0, v3, v3, v4}, Lj1/f;->b(ZZZ)Ljava/net/Socket;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v6, v5

    .line 30
    :goto_0
    iget-object v7, v1, Lj1/f;->i:Lj1/b;

    .line 31
    .line 32
    if-eqz v7, :cond_1

    .line 33
    .line 34
    move-object v0, v5

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move-object v7, v5

    .line 37
    :goto_1
    iget-boolean v8, v1, Lj1/f;->j:Z

    .line 38
    .line 39
    if-nez v8, :cond_2

    .line 40
    .line 41
    move-object v0, v5

    .line 42
    :cond_2
    if-nez v7, :cond_4

    .line 43
    .line 44
    sget-object v8, Lg1/b;->e:Lg1/b;

    .line 45
    .line 46
    iget-object v9, v1, Lj1/f;->d:Lg1/n;

    .line 47
    .line 48
    iget-object v10, v1, Lj1/f;->a:Lg1/a;

    .line 49
    .line 50
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-static {v9, v10, p0, v5}, Lg1/b;->b(Lg1/n;Lg1/a;Lj1/f;Lg1/F;)V

    .line 54
    .line 55
    .line 56
    iget-object v8, v1, Lj1/f;->i:Lj1/b;

    .line 57
    .line 58
    if-eqz v8, :cond_3

    .line 59
    .line 60
    move-object v7, v8

    .line 61
    const/4 v9, 0x1

    .line 62
    move-object v8, v5

    .line 63
    goto :goto_3

    .line 64
    :cond_3
    iget-object v8, v1, Lj1/f;->c:Lg1/F;

    .line 65
    .line 66
    :goto_2
    const/4 v9, 0x0

    .line 67
    goto :goto_3

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    goto/16 :goto_e

    .line 70
    .line 71
    :cond_4
    move-object v8, v5

    .line 72
    goto :goto_2

    .line 73
    :goto_3
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    invoke-static {v6}, Lh1/c;->d(Ljava/net/Socket;)V

    .line 75
    .line 76
    .line 77
    if-eqz v0, :cond_5

    .line 78
    .line 79
    iget-object v0, v1, Lj1/f;->e:Lg1/b;

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    :cond_5
    if-eqz v9, :cond_6

    .line 85
    .line 86
    iget-object v0, v1, Lj1/f;->e:Lg1/b;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    :cond_6
    if-eqz v7, :cond_7

    .line 92
    .line 93
    return-object v7

    .line 94
    :cond_7
    if-nez v8, :cond_9

    .line 95
    .line 96
    iget-object v0, v1, Lj1/f;->b:LK/j;

    .line 97
    .line 98
    if-eqz v0, :cond_8

    .line 99
    .line 100
    iget v2, v0, LK/j;->f:I

    .line 101
    .line 102
    iget-object v0, v0, LK/j;->g:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-ge v2, v0, :cond_8

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_8
    iget-object v0, v1, Lj1/f;->g:Lj1/d;

    .line 114
    .line 115
    invoke-virtual {v0}, Lj1/d;->b()LK/j;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iput-object v0, v1, Lj1/f;->b:LK/j;

    .line 120
    .line 121
    const/4 v0, 0x1

    .line 122
    goto :goto_5

    .line 123
    :cond_9
    :goto_4
    const/4 v0, 0x0

    .line 124
    :goto_5
    iget-object v6, v1, Lj1/f;->d:Lg1/n;

    .line 125
    .line 126
    monitor-enter v6

    .line 127
    if-eqz v0, :cond_b

    .line 128
    .line 129
    :try_start_1
    iget-object v0, v1, Lj1/f;->b:LK/j;

    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    new-instance v2, Ljava/util/ArrayList;

    .line 135
    .line 136
    iget-object v0, v0, LK/j;->g:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v0, Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    const/4 v10, 0x0

    .line 148
    :goto_6
    if-ge v10, v0, :cond_b

    .line 149
    .line 150
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v11

    .line 154
    check-cast v11, Lg1/F;

    .line 155
    .line 156
    sget-object v12, Lg1/b;->e:Lg1/b;

    .line 157
    .line 158
    iget-object v13, v1, Lj1/f;->d:Lg1/n;

    .line 159
    .line 160
    iget-object v14, v1, Lj1/f;->a:Lg1/a;

    .line 161
    .line 162
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    invoke-static {v13, v14, p0, v11}, Lg1/b;->b(Lg1/n;Lg1/a;Lj1/f;Lg1/F;)V

    .line 166
    .line 167
    .line 168
    iget-object v12, v1, Lj1/f;->i:Lj1/b;

    .line 169
    .line 170
    if-eqz v12, :cond_a

    .line 171
    .line 172
    iput-object v11, v1, Lj1/f;->c:Lg1/F;

    .line 173
    .line 174
    move-object v7, v12

    .line 175
    const/4 v9, 0x1

    .line 176
    goto :goto_7

    .line 177
    :catchall_1
    move-exception v0

    .line 178
    goto/16 :goto_d

    .line 179
    .line 180
    :cond_a
    add-int/lit8 v10, v10, 0x1

    .line 181
    .line 182
    goto :goto_6

    .line 183
    :cond_b
    :goto_7
    if-nez v9, :cond_f

    .line 184
    .line 185
    if-nez v8, :cond_e

    .line 186
    .line 187
    iget-object v0, v1, Lj1/f;->b:LK/j;

    .line 188
    .line 189
    iget v2, v0, LK/j;->f:I

    .line 190
    .line 191
    iget-object v7, v0, LK/j;->g:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v7, Ljava/util/ArrayList;

    .line 194
    .line 195
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 196
    .line 197
    .line 198
    move-result v7

    .line 199
    if-ge v2, v7, :cond_c

    .line 200
    .line 201
    const/4 v2, 0x1

    .line 202
    goto :goto_8

    .line 203
    :cond_c
    const/4 v2, 0x0

    .line 204
    :goto_8
    if-eqz v2, :cond_d

    .line 205
    .line 206
    iget v2, v0, LK/j;->f:I

    .line 207
    .line 208
    add-int/lit8 v7, v2, 0x1

    .line 209
    .line 210
    iput v7, v0, LK/j;->f:I

    .line 211
    .line 212
    iget-object v0, v0, LK/j;->g:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v0, Ljava/util/ArrayList;

    .line 215
    .line 216
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    move-object v8, v0

    .line 221
    check-cast v8, Lg1/F;

    .line 222
    .line 223
    goto :goto_9

    .line 224
    :cond_d
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 225
    .line 226
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 227
    .line 228
    .line 229
    throw v0

    .line 230
    :cond_e
    :goto_9
    iput-object v8, v1, Lj1/f;->c:Lg1/F;

    .line 231
    .line 232
    iput v3, v1, Lj1/f;->h:I

    .line 233
    .line 234
    new-instance v7, Lj1/b;

    .line 235
    .line 236
    iget-object v0, v1, Lj1/f;->d:Lg1/n;

    .line 237
    .line 238
    invoke-direct {v7, v0, v8}, Lj1/b;-><init>(Lg1/n;Lg1/F;)V

    .line 239
    .line 240
    .line 241
    iget-object v0, v1, Lj1/f;->i:Lj1/b;

    .line 242
    .line 243
    if-nez v0, :cond_10

    .line 244
    .line 245
    iput-object v7, v1, Lj1/f;->i:Lj1/b;

    .line 246
    .line 247
    iput-boolean v3, v1, Lj1/f;->j:Z

    .line 248
    .line 249
    iget-object v0, v7, Lj1/b;->n:Ljava/util/ArrayList;

    .line 250
    .line 251
    new-instance v2, Lj1/e;

    .line 252
    .line 253
    iget-object v8, v1, Lj1/f;->f:Ljava/lang/Object;

    .line 254
    .line 255
    invoke-direct {v2, p0, v8}, Lj1/e;-><init>(Lj1/f;Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    :cond_f
    move-object v0, v7

    .line 262
    goto :goto_a

    .line 263
    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 264
    .line 265
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 266
    .line 267
    .line 268
    throw v0

    .line 269
    :goto_a
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 270
    if-eqz v9, :cond_11

    .line 271
    .line 272
    iget-object v2, v1, Lj1/f;->e:Lg1/b;

    .line 273
    .line 274
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    return-object v0

    .line 278
    :cond_11
    iget-object v12, v1, Lj1/f;->e:Lg1/b;

    .line 279
    .line 280
    move-object v7, v0

    .line 281
    move/from16 v8, p1

    .line 282
    .line 283
    move/from16 v9, p2

    .line 284
    .line 285
    move/from16 v10, p3

    .line 286
    .line 287
    move/from16 v11, p4

    .line 288
    .line 289
    invoke-virtual/range {v7 .. v12}, Lj1/b;->c(IIIZLg1/b;)V

    .line 290
    .line 291
    .line 292
    sget-object v2, Lg1/b;->e:Lg1/b;

    .line 293
    .line 294
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    iget-object v2, v1, Lj1/f;->d:Lg1/n;

    .line 298
    .line 299
    iget-object v2, v2, Lg1/n;->e:Lj0/w;

    .line 300
    .line 301
    iget-object v6, v0, Lj1/b;->c:Lg1/F;

    .line 302
    .line 303
    invoke-virtual {v2, v6}, Lj0/w;->j(Lg1/F;)V

    .line 304
    .line 305
    .line 306
    iget-object v2, v1, Lj1/f;->d:Lg1/n;

    .line 307
    .line 308
    monitor-enter v2

    .line 309
    :try_start_2
    iput-boolean v4, v1, Lj1/f;->j:Z

    .line 310
    .line 311
    sget-object v6, Lg1/b;->e:Lg1/b;

    .line 312
    .line 313
    iget-object v7, v1, Lj1/f;->d:Lg1/n;

    .line 314
    .line 315
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    iget-boolean v6, v7, Lg1/n;->f:Z

    .line 319
    .line 320
    if-nez v6, :cond_12

    .line 321
    .line 322
    iput-boolean v4, v7, Lg1/n;->f:Z

    .line 323
    .line 324
    sget-object v6, Lg1/n;->g:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 325
    .line 326
    iget-object v8, v7, Lg1/n;->c:LN0/B;

    .line 327
    .line 328
    invoke-virtual {v6, v8}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 329
    .line 330
    .line 331
    :cond_12
    iget-object v6, v7, Lg1/n;->d:Ljava/util/ArrayDeque;

    .line 332
    .line 333
    invoke-virtual {v6, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    iget-object v6, v0, Lj1/b;->h:Lm1/s;

    .line 337
    .line 338
    if-eqz v6, :cond_13

    .line 339
    .line 340
    const/4 v3, 0x1

    .line 341
    :cond_13
    if-eqz v3, :cond_14

    .line 342
    .line 343
    sget-object v0, Lg1/b;->e:Lg1/b;

    .line 344
    .line 345
    iget-object v3, v1, Lj1/f;->d:Lg1/n;

    .line 346
    .line 347
    iget-object v4, v1, Lj1/f;->a:Lg1/a;

    .line 348
    .line 349
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    invoke-static {v3, v4, p0}, Lg1/b;->a(Lg1/n;Lg1/a;Lj1/f;)Ljava/net/Socket;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    iget-object v0, v1, Lj1/f;->i:Lj1/b;

    .line 357
    .line 358
    goto :goto_b

    .line 359
    :catchall_2
    move-exception v0

    .line 360
    goto :goto_c

    .line 361
    :cond_14
    :goto_b
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 362
    invoke-static {v5}, Lh1/c;->d(Ljava/net/Socket;)V

    .line 363
    .line 364
    .line 365
    iget-object v2, v1, Lj1/f;->e:Lg1/b;

    .line 366
    .line 367
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    return-object v0

    .line 371
    :goto_c
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 372
    throw v0

    .line 373
    :goto_d
    :try_start_4
    monitor-exit v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 374
    throw v0

    .line 375
    :cond_15
    :try_start_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 376
    .line 377
    const-string v3, "codec != null"

    .line 378
    .line 379
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    throw v0

    .line 383
    :cond_16
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 384
    .line 385
    const-string v3, "released"

    .line 386
    .line 387
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    throw v0

    .line 391
    :goto_e
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 392
    throw v0
.end method

.method public final d(IIIZZ)Lj1/b;
    .locals 3

    .line 1
    :goto_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lj1/f;->c(IIIZ)Lj1/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lj1/f;->d:Lg1/n;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iget v2, v0, Lj1/b;->l:I

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    monitor-exit v1

    .line 13
    return-object v0

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    invoke-virtual {v0, p5}, Lj1/b;->h(Z)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Lj1/f;->e()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    return-object v0

    .line 28
    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    throw p1
.end method

.method public final e()V
    .locals 4

    .line 1
    iget-object v0, p0, Lj1/f;->d:Lg1/n;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lj1/f;->i:Lj1/b;

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-virtual {p0, v2, v3, v3}, Lj1/f;->b(ZZZ)Ljava/net/Socket;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    iget-object v3, p0, Lj1/f;->i:Lj1/b;

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    invoke-static {v2}, Lh1/c;->d(Ljava/net/Socket;)V

    .line 19
    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Lj1/f;->e:Lg1/b;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void

    .line 29
    :catchall_0
    move-exception v1

    .line 30
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    throw v1
.end method

.method public final f()V
    .locals 4

    .line 1
    iget-object v0, p0, Lj1/f;->d:Lg1/n;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lj1/f;->i:Lj1/b;

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-virtual {p0, v3, v2, v3}, Lj1/f;->b(ZZZ)Ljava/net/Socket;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    iget-object v3, p0, Lj1/f;->i:Lj1/b;

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    invoke-static {v2}, Lh1/c;->d(Ljava/net/Socket;)V

    .line 19
    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Lj1/f;->e:Lg1/b;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void

    .line 29
    :catchall_0
    move-exception v1

    .line 30
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    throw v1
.end method

.method public final g(Ljava/io/IOException;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lj1/f;->d:Lg1/n;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    instance-of v1, p1, Lm1/D;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    check-cast p1, Lm1/D;

    .line 12
    .line 13
    iget p1, p1, Lm1/D;->a:I

    .line 14
    .line 15
    const/4 v1, 0x5

    .line 16
    if-ne p1, v1, :cond_0

    .line 17
    .line 18
    iget v5, p0, Lj1/f;->h:I

    .line 19
    .line 20
    add-int/2addr v5, v3

    .line 21
    iput v5, p0, Lj1/f;->h:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_5

    .line 26
    :cond_0
    :goto_0
    if-ne p1, v1, :cond_1

    .line 27
    .line 28
    iget p1, p0, Lj1/f;->h:I

    .line 29
    .line 30
    if-le p1, v3, :cond_7

    .line 31
    .line 32
    :cond_1
    iput-object v4, p0, Lj1/f;->c:Lg1/F;

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_2
    iget-object v1, p0, Lj1/f;->i:Lj1/b;

    .line 36
    .line 37
    if-eqz v1, :cond_7

    .line 38
    .line 39
    iget-object v5, v1, Lj1/b;->h:Lm1/s;

    .line 40
    .line 41
    if-eqz v5, :cond_3

    .line 42
    .line 43
    const/4 v5, 0x1

    .line 44
    goto :goto_1

    .line 45
    :cond_3
    const/4 v5, 0x0

    .line 46
    :goto_1
    if-eqz v5, :cond_4

    .line 47
    .line 48
    instance-of v5, p1, Lm1/a;

    .line 49
    .line 50
    if-eqz v5, :cond_7

    .line 51
    .line 52
    :cond_4
    iget v1, v1, Lj1/b;->l:I

    .line 53
    .line 54
    if-nez v1, :cond_6

    .line 55
    .line 56
    iget-object v1, p0, Lj1/f;->c:Lg1/F;

    .line 57
    .line 58
    if-eqz v1, :cond_5

    .line 59
    .line 60
    if-eqz p1, :cond_5

    .line 61
    .line 62
    iget-object v5, p0, Lj1/f;->g:Lj1/d;

    .line 63
    .line 64
    invoke-virtual {v5, v1, p1}, Lj1/d;->a(Lg1/F;Ljava/io/IOException;)V

    .line 65
    .line 66
    .line 67
    :cond_5
    iput-object v4, p0, Lj1/f;->c:Lg1/F;

    .line 68
    .line 69
    :cond_6
    :goto_2
    const/4 p1, 0x1

    .line 70
    goto :goto_3

    .line 71
    :cond_7
    const/4 p1, 0x0

    .line 72
    :goto_3
    iget-object v1, p0, Lj1/f;->i:Lj1/b;

    .line 73
    .line 74
    invoke-virtual {p0, p1, v2, v3}, Lj1/f;->b(ZZZ)Ljava/net/Socket;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget-object v2, p0, Lj1/f;->i:Lj1/b;

    .line 79
    .line 80
    if-nez v2, :cond_9

    .line 81
    .line 82
    iget-boolean v2, p0, Lj1/f;->j:Z

    .line 83
    .line 84
    if-nez v2, :cond_8

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_8
    move-object v4, v1

    .line 88
    :cond_9
    :goto_4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    invoke-static {p1}, Lh1/c;->d(Ljava/net/Socket;)V

    .line 90
    .line 91
    .line 92
    if-eqz v4, :cond_a

    .line 93
    .line 94
    iget-object p1, p0, Lj1/f;->e:Lg1/b;

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    :cond_a
    return-void

    .line 100
    :goto_5
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    throw p1
.end method

.method public final h(ZLk1/b;Ljava/io/IOException;)V
    .locals 3

    .line 1
    const-string v0, "expected "

    .line 2
    .line 3
    iget-object v1, p0, Lj1/f;->e:Lg1/b;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lj1/f;->d:Lg1/n;

    .line 9
    .line 10
    monitor-enter v1

    .line 11
    if-eqz p2, :cond_5

    .line 12
    .line 13
    :try_start_0
    iget-object v2, p0, Lj1/f;->l:Lk1/b;

    .line 14
    .line 15
    if-ne p2, v2, :cond_5

    .line 16
    .line 17
    const/4 p2, 0x1

    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lj1/f;->i:Lj1/b;

    .line 21
    .line 22
    iget v2, v0, Lj1/b;->l:I

    .line 23
    .line 24
    add-int/2addr v2, p2

    .line 25
    iput v2, v0, Lj1/b;->l:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto :goto_2

    .line 30
    :cond_0
    :goto_0
    iget-object v0, p0, Lj1/f;->i:Lj1/b;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-virtual {p0, p1, v2, p2}, Lj1/f;->b(ZZZ)Ljava/net/Socket;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object p2, p0, Lj1/f;->i:Lj1/b;

    .line 38
    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    :cond_1
    iget-boolean p2, p0, Lj1/f;->k:Z

    .line 43
    .line 44
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    invoke-static {p1}, Lh1/c;->d(Ljava/net/Socket;)V

    .line 46
    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    iget-object p1, p0, Lj1/f;->e:Lg1/b;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    :cond_2
    if-eqz p3, :cond_3

    .line 56
    .line 57
    iget-object p1, p0, Lj1/f;->e:Lg1/b;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    if-eqz p2, :cond_4

    .line 64
    .line 65
    iget-object p1, p0, Lj1/f;->e:Lg1/b;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    :cond_4
    :goto_1
    return-void

    .line 71
    :cond_5
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 72
    .line 73
    new-instance p3, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Lj1/f;->l:Lk1/b;

    .line 79
    .line 80
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v0, " but was "

    .line 84
    .line 85
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw p1

    .line 99
    :goto_2
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lj1/f;->a()Lj1/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lj1/b;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lj1/f;->a:Lg1/a;

    .line 13
    .line 14
    invoke-virtual {v0}, Lg1/a;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    return-object v0
.end method
