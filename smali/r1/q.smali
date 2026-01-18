.class public final Lr1/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr1/g;


# instance fields
.field public final a:Lr1/e;

.field public final b:Lr1/v;

.field public c:Z


# direct methods
.method public constructor <init>(Lr1/v;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lr1/e;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lr1/q;->a:Lr1/e;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iput-object p1, p0, Lr1/q;->b:Lr1/v;

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 17
    .line 18
    const-string v0, "source == null"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1
.end method


# virtual methods
.method public final a()Lr1/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lr1/q;->b:Lr1/v;

    .line 2
    .line 3
    invoke-interface {v0}, Lr1/v;->a()Lr1/x;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final close()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lr1/q;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lr1/q;->c:Z

    .line 8
    .line 9
    iget-object v0, p0, Lr1/q;->b:Lr1/v;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lr1/q;->a:Lr1/e;

    .line 15
    .line 16
    :try_start_0
    iget-wide v1, v0, Lr1/e;->b:J

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Lr1/e;->s(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :catch_0
    move-exception v0

    .line 23
    new-instance v1, Ljava/lang/AssertionError;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    throw v1
.end method

.method public final e(Lr1/e;J)J
    .locals 6

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    cmp-long v2, p2, v0

    .line 6
    .line 7
    if-ltz v2, :cond_2

    .line 8
    .line 9
    iget-boolean v2, p0, Lr1/q;->c:Z

    .line 10
    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    iget-object v2, p0, Lr1/q;->a:Lr1/e;

    .line 14
    .line 15
    iget-wide v3, v2, Lr1/e;->b:J

    .line 16
    .line 17
    cmp-long v5, v3, v0

    .line 18
    .line 19
    if-nez v5, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lr1/q;->b:Lr1/v;

    .line 22
    .line 23
    const-wide/16 v3, 0x2000

    .line 24
    .line 25
    invoke-interface {v0, v2, v3, v4}, Lr1/v;->e(Lr1/e;J)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    const-wide/16 v3, -0x1

    .line 30
    .line 31
    cmp-long v5, v0, v3

    .line 32
    .line 33
    if-nez v5, :cond_0

    .line 34
    .line 35
    return-wide v3

    .line 36
    :cond_0
    iget-wide v0, v2, Lr1/e;->b:J

    .line 37
    .line 38
    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 39
    .line 40
    .line 41
    move-result-wide p2

    .line 42
    invoke-virtual {v2, p1, p2, p3}, Lr1/e;->e(Lr1/e;J)J

    .line 43
    .line 44
    .line 45
    move-result-wide p1

    .line 46
    return-wide p1

    .line 47
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string p2, "closed"

    .line 50
    .line 51
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 56
    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const-string v1, "byteCount < 0: "

    .line 60
    .line 61
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p1

    .line 75
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 76
    .line 77
    const-string p2, "sink == null"

    .line 78
    .line 79
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p1
.end method

.method public final f()Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lr1/q;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lr1/q;->a:Lr1/e;

    .line 6
    .line 7
    invoke-virtual {v0}, Lr1/e;->g()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lr1/q;->b:Lr1/v;

    .line 14
    .line 15
    const-wide/16 v2, 0x2000

    .line 16
    .line 17
    invoke-interface {v1, v0, v2, v3}, Lr1/v;->e(Lr1/e;J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    const-wide/16 v2, -0x1

    .line 22
    .line 23
    cmp-long v4, v0, v2

    .line 24
    .line 25
    if-nez v4, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    :goto_0
    return v0

    .line 31
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v1, "closed"

    .line 34
    .line 35
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0
.end method

.method public final g(BJJ)J
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p4

    .line 4
    .line 5
    iget-boolean v3, v0, Lr1/q;->c:Z

    .line 6
    .line 7
    if-nez v3, :cond_f

    .line 8
    .line 9
    const-wide/16 v3, 0x0

    .line 10
    .line 11
    cmp-long v5, v1, v3

    .line 12
    .line 13
    if-ltz v5, :cond_e

    .line 14
    .line 15
    :goto_0
    cmp-long v7, v3, v1

    .line 16
    .line 17
    if-gez v7, :cond_d

    .line 18
    .line 19
    iget-object v7, v0, Lr1/q;->a:Lr1/e;

    .line 20
    .line 21
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const-wide/16 v8, 0x0

    .line 25
    .line 26
    cmp-long v10, v3, v8

    .line 27
    .line 28
    if-ltz v10, :cond_c

    .line 29
    .line 30
    cmp-long v10, v1, v3

    .line 31
    .line 32
    if-ltz v10, :cond_c

    .line 33
    .line 34
    iget-wide v10, v7, Lr1/e;->b:J

    .line 35
    .line 36
    cmp-long v12, v1, v10

    .line 37
    .line 38
    if-lez v12, :cond_0

    .line 39
    .line 40
    move-wide v12, v10

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    move-wide v12, v1

    .line 43
    :goto_1
    cmp-long v16, v3, v12

    .line 44
    .line 45
    if-nez v16, :cond_2

    .line 46
    .line 47
    :cond_1
    :goto_2
    move/from16 v6, p1

    .line 48
    .line 49
    move-wide/from16 v18, v3

    .line 50
    .line 51
    const-wide/16 v3, -0x1

    .line 52
    .line 53
    const-wide/16 v14, -0x1

    .line 54
    .line 55
    goto/16 :goto_7

    .line 56
    .line 57
    :cond_2
    iget-object v8, v7, Lr1/e;->a:Lr1/r;

    .line 58
    .line 59
    if-nez v8, :cond_3

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    sub-long v16, v10, v3

    .line 63
    .line 64
    cmp-long v9, v16, v3

    .line 65
    .line 66
    if-gez v9, :cond_5

    .line 67
    .line 68
    :goto_3
    cmp-long v9, v10, v3

    .line 69
    .line 70
    if-lez v9, :cond_4

    .line 71
    .line 72
    iget-object v8, v8, Lr1/r;->g:Lr1/r;

    .line 73
    .line 74
    iget v9, v8, Lr1/r;->c:I

    .line 75
    .line 76
    iget v14, v8, Lr1/r;->b:I

    .line 77
    .line 78
    sub-int/2addr v9, v14

    .line 79
    int-to-long v14, v9

    .line 80
    sub-long/2addr v10, v14

    .line 81
    goto :goto_3

    .line 82
    :cond_4
    move-wide v14, v3

    .line 83
    goto :goto_5

    .line 84
    :cond_5
    move-object v10, v8

    .line 85
    const-wide/16 v8, 0x0

    .line 86
    .line 87
    :goto_4
    iget v11, v10, Lr1/r;->c:I

    .line 88
    .line 89
    iget v14, v10, Lr1/r;->b:I

    .line 90
    .line 91
    sub-int/2addr v11, v14

    .line 92
    int-to-long v14, v11

    .line 93
    add-long/2addr v14, v8

    .line 94
    cmp-long v11, v14, v3

    .line 95
    .line 96
    if-gez v11, :cond_6

    .line 97
    .line 98
    iget-object v10, v10, Lr1/r;->f:Lr1/r;

    .line 99
    .line 100
    move-wide v8, v14

    .line 101
    goto :goto_4

    .line 102
    :cond_6
    move-wide v14, v3

    .line 103
    move-wide/from16 v20, v8

    .line 104
    .line 105
    move-object v8, v10

    .line 106
    move-wide/from16 v10, v20

    .line 107
    .line 108
    :goto_5
    cmp-long v9, v10, v12

    .line 109
    .line 110
    if-gez v9, :cond_1

    .line 111
    .line 112
    iget-object v9, v8, Lr1/r;->a:[B

    .line 113
    .line 114
    iget v5, v8, Lr1/r;->c:I

    .line 115
    .line 116
    int-to-long v5, v5

    .line 117
    move-wide/from16 v18, v3

    .line 118
    .line 119
    iget v3, v8, Lr1/r;->b:I

    .line 120
    .line 121
    int-to-long v3, v3

    .line 122
    add-long/2addr v3, v12

    .line 123
    sub-long/2addr v3, v10

    .line 124
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 125
    .line 126
    .line 127
    move-result-wide v3

    .line 128
    long-to-int v4, v3

    .line 129
    iget v3, v8, Lr1/r;->b:I

    .line 130
    .line 131
    int-to-long v5, v3

    .line 132
    add-long/2addr v5, v14

    .line 133
    sub-long/2addr v5, v10

    .line 134
    long-to-int v3, v5

    .line 135
    :goto_6
    if-ge v3, v4, :cond_8

    .line 136
    .line 137
    aget-byte v5, v9, v3

    .line 138
    .line 139
    move/from16 v6, p1

    .line 140
    .line 141
    if-ne v5, v6, :cond_7

    .line 142
    .line 143
    iget v4, v8, Lr1/r;->b:I

    .line 144
    .line 145
    sub-int/2addr v3, v4

    .line 146
    int-to-long v3, v3

    .line 147
    add-long v14, v3, v10

    .line 148
    .line 149
    const-wide/16 v3, -0x1

    .line 150
    .line 151
    goto :goto_7

    .line 152
    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 153
    .line 154
    goto :goto_6

    .line 155
    :cond_8
    move/from16 v6, p1

    .line 156
    .line 157
    iget v3, v8, Lr1/r;->c:I

    .line 158
    .line 159
    iget v4, v8, Lr1/r;->b:I

    .line 160
    .line 161
    sub-int/2addr v3, v4

    .line 162
    int-to-long v3, v3

    .line 163
    add-long v14, v10, v3

    .line 164
    .line 165
    iget-object v8, v8, Lr1/r;->f:Lr1/r;

    .line 166
    .line 167
    move-wide v10, v14

    .line 168
    move-wide/from16 v3, v18

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :goto_7
    cmp-long v5, v14, v3

    .line 172
    .line 173
    if-eqz v5, :cond_9

    .line 174
    .line 175
    return-wide v14

    .line 176
    :cond_9
    iget-wide v8, v7, Lr1/e;->b:J

    .line 177
    .line 178
    cmp-long v5, v8, v1

    .line 179
    .line 180
    if-gez v5, :cond_b

    .line 181
    .line 182
    iget-object v5, v0, Lr1/q;->b:Lr1/v;

    .line 183
    .line 184
    const-wide/16 v10, 0x2000

    .line 185
    .line 186
    invoke-interface {v5, v7, v10, v11}, Lr1/v;->e(Lr1/e;J)J

    .line 187
    .line 188
    .line 189
    move-result-wide v10

    .line 190
    cmp-long v5, v10, v3

    .line 191
    .line 192
    if-nez v5, :cond_a

    .line 193
    .line 194
    goto :goto_8

    .line 195
    :cond_a
    move-wide/from16 v10, v18

    .line 196
    .line 197
    invoke-static {v10, v11, v8, v9}, Ljava/lang/Math;->max(JJ)J

    .line 198
    .line 199
    .line 200
    move-result-wide v3

    .line 201
    goto/16 :goto_0

    .line 202
    .line 203
    :cond_b
    :goto_8
    return-wide v3

    .line 204
    :cond_c
    move-wide v10, v3

    .line 205
    new-instance v3, Ljava/lang/IllegalArgumentException;

    .line 206
    .line 207
    iget-wide v4, v7, Lr1/e;->b:J

    .line 208
    .line 209
    new-instance v6, Ljava/lang/StringBuilder;

    .line 210
    .line 211
    const-string v7, "size="

    .line 212
    .line 213
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    const-string v4, " fromIndex="

    .line 220
    .line 221
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v6, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    const-string v4, " toIndex="

    .line 228
    .line 229
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v6, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-direct {v3, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    throw v3

    .line 243
    :cond_d
    const-wide/16 v1, -0x1

    .line 244
    .line 245
    return-wide v1

    .line 246
    :cond_e
    new-instance v3, Ljava/lang/IllegalArgumentException;

    .line 247
    .line 248
    new-instance v4, Ljava/lang/StringBuilder;

    .line 249
    .line 250
    const-string v5, "fromIndex=0 toIndex="

    .line 251
    .line 252
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    invoke-direct {v3, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    throw v3

    .line 266
    :cond_f
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 267
    .line 268
    const-string v2, "closed"

    .line 269
    .line 270
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    throw v1
.end method

.method public final h(JLr1/h;)Z
    .locals 7

    .line 1
    iget-object v0, p3, Lr1/h;->a:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    iget-boolean v2, p0, Lr1/q;->c:Z

    .line 5
    .line 6
    if-nez v2, :cond_5

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    cmp-long v5, p1, v2

    .line 12
    .line 13
    if-ltz v5, :cond_4

    .line 14
    .line 15
    if-ltz v1, :cond_4

    .line 16
    .line 17
    array-length v0, v0

    .line 18
    if-ge v0, v1, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    if-ge v0, v1, :cond_3

    .line 23
    .line 24
    int-to-long v2, v0

    .line 25
    add-long/2addr v2, p1

    .line 26
    const-wide/16 v5, 0x1

    .line 27
    .line 28
    add-long/2addr v5, v2

    .line 29
    invoke-virtual {p0, v5, v6}, Lr1/q;->o(J)Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-nez v5, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    iget-object v5, p0, Lr1/q;->a:Lr1/e;

    .line 37
    .line 38
    invoke-virtual {v5, v2, v3}, Lr1/e;->h(J)B

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    iget-object v3, p3, Lr1/h;->a:[B

    .line 43
    .line 44
    aget-byte v3, v3, v0

    .line 45
    .line 46
    if-eq v2, v3, :cond_2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    const/4 v4, 0x1

    .line 53
    :cond_4
    :goto_1
    return v4

    .line 54
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string p2, "closed"

    .line 57
    .line 58
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1
.end method

.method public final i()B
    .locals 2

    .line 1
    const-wide/16 v0, 0x1

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lr1/q;->p(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr1/q;->a:Lr1/e;

    .line 7
    .line 8
    invoke-virtual {v0}, Lr1/e;->j()B

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final isOpen()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr1/q;->c:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    return v0
.end method

.method public final j(J)Lr1/h;
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lr1/q;->p(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lr1/q;->a:Lr1/e;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance v1, Lr1/h;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Lr1/e;->k(J)[B

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-direct {v1, p1}, Lr1/h;-><init>([B)V

    .line 16
    .line 17
    .line 18
    return-object v1
.end method

.method public final k([B)V
    .locals 9

    .line 1
    iget-object v0, p0, Lr1/q;->a:Lr1/e;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    :try_start_0
    array-length v3, p1

    .line 6
    int-to-long v3, v3

    .line 7
    invoke-virtual {p0, v3, v4}, Lr1/q;->p(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    :goto_0
    array-length v3, p1

    .line 11
    if-ge v2, v3, :cond_1

    .line 12
    .line 13
    array-length v3, p1

    .line 14
    sub-int/2addr v3, v2

    .line 15
    invoke-virtual {v0, p1, v2, v3}, Lr1/e;->i([BII)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eq v3, v1, :cond_0

    .line 20
    .line 21
    add-int/2addr v2, v3

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    return-void

    .line 30
    :catch_0
    move-exception v3

    .line 31
    :goto_1
    iget-wide v4, v0, Lr1/e;->b:J

    .line 32
    .line 33
    const-wide/16 v6, 0x0

    .line 34
    .line 35
    cmp-long v8, v4, v6

    .line 36
    .line 37
    if-lez v8, :cond_3

    .line 38
    .line 39
    long-to-int v5, v4

    .line 40
    invoke-virtual {v0, p1, v2, v5}, Lr1/e;->i([BII)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eq v4, v1, :cond_2

    .line 45
    .line 46
    add-int/2addr v2, v4

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    .line 49
    .line 50
    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_3
    throw v3
.end method

.method public final l()I
    .locals 2

    .line 1
    const-wide/16 v0, 0x4

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lr1/q;->p(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr1/q;->a:Lr1/e;

    .line 7
    .line 8
    invoke-virtual {v0}, Lr1/e;->n()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final m()S
    .locals 2

    .line 1
    const-wide/16 v0, 0x2

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lr1/q;->p(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr1/q;->a:Lr1/e;

    .line 7
    .line 8
    invoke-virtual {v0}, Lr1/e;->o()S

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final n(J)Ljava/lang/String;
    .locals 22

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    move-wide/from16 v8, p1

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    cmp-long v2, v8, v0

    .line 8
    .line 9
    if-ltz v2, :cond_3

    .line 10
    .line 11
    const-wide/16 v10, 0x1

    .line 12
    .line 13
    const-wide v12, 0x7fffffffffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    cmp-long v0, v8, v12

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    move-wide v14, v12

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    add-long v0, v8, v10

    .line 25
    .line 26
    move-wide v14, v0

    .line 27
    :goto_0
    const/16 v2, 0xa

    .line 28
    .line 29
    const-wide/16 v3, 0x0

    .line 30
    .line 31
    move-object/from16 v1, p0

    .line 32
    .line 33
    move-wide v5, v14

    .line 34
    invoke-virtual/range {v1 .. v6}, Lr1/q;->g(BJJ)J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    iget-object v2, v7, Lr1/q;->a:Lr1/e;

    .line 39
    .line 40
    const-wide/16 v3, -0x1

    .line 41
    .line 42
    cmp-long v5, v0, v3

    .line 43
    .line 44
    if-eqz v5, :cond_1

    .line 45
    .line 46
    invoke-virtual {v2, v0, v1}, Lr1/e;->r(J)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0

    .line 51
    :cond_1
    cmp-long v0, v14, v12

    .line 52
    .line 53
    if-gez v0, :cond_2

    .line 54
    .line 55
    invoke-virtual {v7, v14, v15}, Lr1/q;->o(J)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    sub-long v0, v14, v10

    .line 62
    .line 63
    invoke-virtual {v2, v0, v1}, Lr1/e;->h(J)B

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    const/16 v1, 0xd

    .line 68
    .line 69
    if-ne v0, v1, :cond_2

    .line 70
    .line 71
    add-long/2addr v10, v14

    .line 72
    invoke-virtual {v7, v10, v11}, Lr1/q;->o(J)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_2

    .line 77
    .line 78
    invoke-virtual {v2, v14, v15}, Lr1/e;->h(J)B

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    const/16 v1, 0xa

    .line 83
    .line 84
    if-ne v0, v1, :cond_2

    .line 85
    .line 86
    invoke-virtual {v2, v14, v15}, Lr1/e;->r(J)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    return-object v0

    .line 91
    :cond_2
    new-instance v0, Lr1/e;

    .line 92
    .line 93
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 94
    .line 95
    .line 96
    iget-wide v3, v2, Lr1/e;->b:J

    .line 97
    .line 98
    const-wide/16 v5, 0x20

    .line 99
    .line 100
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 101
    .line 102
    .line 103
    move-result-wide v20

    .line 104
    const-wide/16 v18, 0x0

    .line 105
    .line 106
    move-object/from16 v16, v2

    .line 107
    .line 108
    move-object/from16 v17, v0

    .line 109
    .line 110
    invoke-virtual/range {v16 .. v21}, Lr1/e;->f(Lr1/e;JJ)V

    .line 111
    .line 112
    .line 113
    new-instance v1, Ljava/io/EOFException;

    .line 114
    .line 115
    new-instance v3, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    const-string v4, "\\n not found: limit="

    .line 118
    .line 119
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    iget-wide v4, v2, Lr1/e;->b:J

    .line 123
    .line 124
    invoke-static {v4, v5, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 125
    .line 126
    .line 127
    move-result-wide v4

    .line 128
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string v2, " content="

    .line 132
    .line 133
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    new-instance v2, Lr1/h;

    .line 137
    .line 138
    :try_start_0
    iget-wide v4, v0, Lr1/e;->b:J

    .line 139
    .line 140
    invoke-virtual {v0, v4, v5}, Lr1/e;->k(J)[B

    .line 141
    .line 142
    .line 143
    move-result-object v0
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 144
    invoke-direct {v2, v0}, Lr1/h;-><init>([B)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2}, Lr1/h;->h()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const/16 v0, 0x2026

    .line 155
    .line 156
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-direct {v1, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw v1

    .line 167
    :catch_0
    move-exception v0

    .line 168
    new-instance v1, Ljava/lang/AssertionError;

    .line 169
    .line 170
    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    throw v1

    .line 174
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 175
    .line 176
    new-instance v1, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    const-string v2, "limit < 0: "

    .line 179
    .line 180
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    throw v0
.end method

.method public final o(J)Z
    .locals 5

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-ltz v2, :cond_3

    .line 6
    .line 7
    iget-boolean v0, p0, Lr1/q;->c:Z

    .line 8
    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lr1/q;->a:Lr1/e;

    .line 12
    .line 13
    iget-wide v1, v0, Lr1/e;->b:J

    .line 14
    .line 15
    cmp-long v3, v1, p1

    .line 16
    .line 17
    if-gez v3, :cond_1

    .line 18
    .line 19
    iget-object v1, p0, Lr1/q;->b:Lr1/v;

    .line 20
    .line 21
    const-wide/16 v2, 0x2000

    .line 22
    .line 23
    invoke-interface {v1, v0, v2, v3}, Lr1/v;->e(Lr1/e;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    const-wide/16 v2, -0x1

    .line 28
    .line 29
    cmp-long v4, v0, v2

    .line 30
    .line 31
    if-nez v4, :cond_0

    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    return p1

    .line 35
    :cond_1
    const/4 p1, 0x1

    .line 36
    return p1

    .line 37
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string p2, "closed"

    .line 40
    .line 41
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 46
    .line 47
    new-instance v1, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v2, "byteCount < 0: "

    .line 50
    .line 51
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v0
.end method

.method public final p(J)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lr1/q;->o(J)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public final q(J)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lr1/q;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    :goto_0
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    cmp-long v2, p1, v0

    .line 8
    .line 9
    if-lez v2, :cond_2

    .line 10
    .line 11
    iget-object v2, p0, Lr1/q;->a:Lr1/e;

    .line 12
    .line 13
    iget-wide v3, v2, Lr1/e;->b:J

    .line 14
    .line 15
    cmp-long v5, v3, v0

    .line 16
    .line 17
    if-nez v5, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lr1/q;->b:Lr1/v;

    .line 20
    .line 21
    const-wide/16 v3, 0x2000

    .line 22
    .line 23
    invoke-interface {v0, v2, v3, v4}, Lr1/v;->e(Lr1/e;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    const-wide/16 v3, -0x1

    .line 28
    .line 29
    cmp-long v5, v0, v3

    .line 30
    .line 31
    if-eqz v5, :cond_0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :cond_1
    :goto_1
    iget-wide v0, v2, Lr1/e;->b:J

    .line 41
    .line 42
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    invoke-virtual {v2, v0, v1}, Lr1/e;->s(J)V

    .line 47
    .line 48
    .line 49
    sub-long/2addr p1, v0

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    return-void

    .line 52
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string p2, "closed"

    .line 55
    .line 56
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1
.end method

.method public final read(Ljava/nio/ByteBuffer;)I
    .locals 6

    .line 1
    iget-object v0, p0, Lr1/q;->a:Lr1/e;

    .line 2
    .line 3
    iget-wide v1, v0, Lr1/e;->b:J

    .line 4
    .line 5
    const-wide/16 v3, 0x0

    .line 6
    .line 7
    cmp-long v5, v1, v3

    .line 8
    .line 9
    if-nez v5, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lr1/q;->b:Lr1/v;

    .line 12
    .line 13
    const-wide/16 v2, 0x2000

    .line 14
    .line 15
    invoke-interface {v1, v0, v2, v3}, Lr1/v;->e(Lr1/e;J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    const-wide/16 v3, -0x1

    .line 20
    .line 21
    cmp-long v5, v1, v3

    .line 22
    .line 23
    if-nez v5, :cond_0

    .line 24
    .line 25
    const/4 p1, -0x1

    .line 26
    return p1

    .line 27
    :cond_0
    invoke-virtual {v0, p1}, Lr1/e;->read(Ljava/nio/ByteBuffer;)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "buffer("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lr1/q;->b:Lr1/v;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ")"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method
