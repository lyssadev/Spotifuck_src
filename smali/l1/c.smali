.class public final Ll1/c;
.super Ll1/a;
.source "SourceFile"


# instance fields
.field public final e:Lg1/u;

.field public f:J

.field public g:Z

.field public final synthetic h:Ll1/g;


# direct methods
.method public constructor <init>(Ll1/g;Lg1/u;)V
    .locals 2

    .line 1
    iput-object p1, p0, Ll1/c;->h:Ll1/g;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Ll1/a;-><init>(Ll1/g;)V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, -0x1

    .line 7
    .line 8
    iput-wide v0, p0, Ll1/c;->f:J

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    iput-boolean p1, p0, Ll1/c;->g:Z

    .line 12
    .line 13
    iput-object p2, p0, Ll1/c;->e:Lg1/u;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Ll1/a;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-boolean v0, p0, Ll1/c;->g:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 11
    .line 12
    const/16 v1, 0x64

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    :try_start_0
    invoke-static {p0, v1, v0}, Lh1/c;->p(Lr1/v;ILjava/util/concurrent/TimeUnit;)Z

    .line 16
    .line 17
    .line 18
    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    goto :goto_0

    .line 20
    :catch_0
    nop

    .line 21
    const/4 v0, 0x0

    .line 22
    :goto_0
    if-nez v0, :cond_1

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-virtual {p0, v2, v0}, Ll1/a;->f(ZLjava/io/IOException;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    const/4 v0, 0x1

    .line 29
    iput-boolean v0, p0, Ll1/a;->b:Z

    .line 30
    .line 31
    return-void
.end method

.method public final e(Lr1/e;J)J
    .locals 15

    .line 1
    move-object v1, p0

    .line 2
    const-wide v2, 0x7fffffffffffffffL

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    iget-boolean v5, v1, Ll1/a;->b:Z

    .line 10
    .line 11
    if-nez v5, :cond_10

    .line 12
    .line 13
    iget-boolean v5, v1, Ll1/c;->g:Z

    .line 14
    .line 15
    const-wide/16 v6, -0x1

    .line 16
    .line 17
    if-nez v5, :cond_0

    .line 18
    .line 19
    return-wide v6

    .line 20
    :cond_0
    iget-wide v8, v1, Ll1/c;->f:J

    .line 21
    .line 22
    const-wide/16 v10, 0x0

    .line 23
    .line 24
    cmp-long v5, v8, v10

    .line 25
    .line 26
    if-eqz v5, :cond_2

    .line 27
    .line 28
    cmp-long v5, v8, v6

    .line 29
    .line 30
    if-nez v5, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move-wide v2, v6

    .line 34
    goto/16 :goto_6

    .line 35
    .line 36
    :cond_2
    :goto_0
    const-string v5, "expected chunk size and optional extensions but was \""

    .line 37
    .line 38
    iget-object v12, v1, Ll1/c;->h:Ll1/g;

    .line 39
    .line 40
    cmp-long v13, v8, v6

    .line 41
    .line 42
    if-eqz v13, :cond_3

    .line 43
    .line 44
    iget-object v8, v12, Ll1/g;->c:Lr1/q;

    .line 45
    .line 46
    invoke-virtual {v8, v2, v3}, Lr1/q;->n(J)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    :cond_3
    :try_start_0
    iget-object v8, v12, Ll1/g;->c:Lr1/q;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    iget-object v9, v12, Ll1/g;->c:Lr1/q;

    .line 52
    .line 53
    const-wide/16 v13, 0x1

    .line 54
    .line 55
    :try_start_1
    invoke-virtual {v8, v13, v14}, Lr1/q;->p(J)V

    .line 56
    .line 57
    .line 58
    const/4 v13, 0x0

    .line 59
    :goto_1
    add-int/lit8 v14, v13, 0x1

    .line 60
    .line 61
    int-to-long v6, v14

    .line 62
    invoke-virtual {v8, v6, v7}, Lr1/q;->o(J)Z

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    iget-object v7, v8, Lr1/q;->a:Lr1/e;

    .line 67
    .line 68
    if-eqz v6, :cond_9

    .line 69
    .line 70
    int-to-long v10, v13

    .line 71
    invoke-virtual {v7, v10, v11}, Lr1/e;->h(J)B

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    const/16 v10, 0x30

    .line 76
    .line 77
    if-lt v6, v10, :cond_4

    .line 78
    .line 79
    const/16 v10, 0x39

    .line 80
    .line 81
    if-le v6, v10, :cond_6

    .line 82
    .line 83
    :cond_4
    const/16 v10, 0x61

    .line 84
    .line 85
    if-lt v6, v10, :cond_5

    .line 86
    .line 87
    const/16 v10, 0x66

    .line 88
    .line 89
    if-le v6, v10, :cond_6

    .line 90
    .line 91
    :cond_5
    const/16 v10, 0x41

    .line 92
    .line 93
    if-lt v6, v10, :cond_7

    .line 94
    .line 95
    const/16 v10, 0x46

    .line 96
    .line 97
    if-le v6, v10, :cond_6

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_6
    move v13, v14

    .line 101
    const-wide/16 v6, -0x1

    .line 102
    .line 103
    const-wide/16 v10, 0x0

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_7
    :goto_2
    if-eqz v13, :cond_8

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_8
    new-instance v2, Ljava/lang/NumberFormatException;

    .line 110
    .line 111
    invoke-static {v6}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    new-array v4, v4, [Ljava/lang/Object;

    .line 116
    .line 117
    aput-object v3, v4, v0

    .line 118
    .line 119
    const-string v0, "Expected leading [0-9a-fA-F] character but was %#x"

    .line 120
    .line 121
    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-direct {v2, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw v2

    .line 129
    :cond_9
    :goto_3
    invoke-virtual {v7}, Lr1/e;->m()J

    .line 130
    .line 131
    .line 132
    move-result-wide v6

    .line 133
    iput-wide v6, v1, Ll1/c;->f:J

    .line 134
    .line 135
    invoke-virtual {v9, v2, v3}, Lr1/q;->n(J)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    iget-wide v6, v1, Ll1/c;->f:J

    .line 144
    .line 145
    const-wide/16 v10, 0x0

    .line 146
    .line 147
    cmp-long v3, v6, v10

    .line 148
    .line 149
    if-ltz v3, :cond_f

    .line 150
    .line 151
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    if-nez v3, :cond_a

    .line 156
    .line 157
    const-string v3, ";"

    .line 158
    .line 159
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 160
    .line 161
    .line 162
    move-result v3
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 163
    if-eqz v3, :cond_f

    .line 164
    .line 165
    goto :goto_4

    .line 166
    :catch_0
    move-exception v0

    .line 167
    goto/16 :goto_7

    .line 168
    .line 169
    :cond_a
    :goto_4
    iget-wide v2, v1, Ll1/c;->f:J

    .line 170
    .line 171
    const-wide/16 v5, 0x0

    .line 172
    .line 173
    cmp-long v7, v2, v5

    .line 174
    .line 175
    if-nez v7, :cond_c

    .line 176
    .line 177
    iput-boolean v0, v1, Ll1/c;->g:Z

    .line 178
    .line 179
    iget-object v2, v12, Ll1/g;->a:Lg1/x;

    .line 180
    .line 181
    iget-object v2, v2, Lg1/x;->f:Lg1/b;

    .line 182
    .line 183
    new-instance v3, LA/b;

    .line 184
    .line 185
    const/16 v5, 0x1b

    .line 186
    .line 187
    invoke-direct {v3, v5}, LA/b;-><init>(I)V

    .line 188
    .line 189
    .line 190
    :goto_5
    iget-wide v5, v12, Ll1/g;->f:J

    .line 191
    .line 192
    invoke-virtual {v9, v5, v6}, Lr1/q;->n(J)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    iget-wide v6, v12, Ll1/g;->f:J

    .line 197
    .line 198
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 199
    .line 200
    .line 201
    move-result v8

    .line 202
    int-to-long v10, v8

    .line 203
    sub-long/2addr v6, v10

    .line 204
    iput-wide v6, v12, Ll1/g;->f:J

    .line 205
    .line 206
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 207
    .line 208
    .line 209
    move-result v6

    .line 210
    if-eqz v6, :cond_b

    .line 211
    .line 212
    sget-object v6, Lg1/b;->e:Lg1/b;

    .line 213
    .line 214
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v3, v5}, LA/b;->q(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    goto :goto_5

    .line 221
    :cond_b
    new-instance v5, Lg1/s;

    .line 222
    .line 223
    invoke-direct {v5, v3}, Lg1/s;-><init>(LA/b;)V

    .line 224
    .line 225
    .line 226
    iget-object v3, v1, Ll1/c;->e:Lg1/u;

    .line 227
    .line 228
    invoke-static {v2, v3, v5}, Lk1/d;->d(Lg1/b;Lg1/u;Lg1/s;)V

    .line 229
    .line 230
    .line 231
    const/4 v2, 0x0

    .line 232
    invoke-virtual {p0, v4, v2}, Ll1/a;->f(ZLjava/io/IOException;)V

    .line 233
    .line 234
    .line 235
    :cond_c
    iget-boolean v2, v1, Ll1/c;->g:Z

    .line 236
    .line 237
    if-nez v2, :cond_d

    .line 238
    .line 239
    const-wide/16 v2, -0x1

    .line 240
    .line 241
    return-wide v2

    .line 242
    :cond_d
    const-wide/16 v2, -0x1

    .line 243
    .line 244
    :goto_6
    iget-wide v4, v1, Ll1/c;->f:J

    .line 245
    .line 246
    const-wide/16 v6, 0x2000

    .line 247
    .line 248
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 249
    .line 250
    .line 251
    move-result-wide v4

    .line 252
    move-object/from16 v6, p1

    .line 253
    .line 254
    invoke-super {p0, v6, v4, v5}, Ll1/a;->e(Lr1/e;J)J

    .line 255
    .line 256
    .line 257
    move-result-wide v4

    .line 258
    cmp-long v6, v4, v2

    .line 259
    .line 260
    if-eqz v6, :cond_e

    .line 261
    .line 262
    iget-wide v2, v1, Ll1/c;->f:J

    .line 263
    .line 264
    sub-long/2addr v2, v4

    .line 265
    iput-wide v2, v1, Ll1/c;->f:J

    .line 266
    .line 267
    return-wide v4

    .line 268
    :cond_e
    new-instance v2, Ljava/net/ProtocolException;

    .line 269
    .line 270
    const-string v3, "unexpected end of stream"

    .line 271
    .line 272
    invoke-direct {v2, v3}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {p0, v0, v2}, Ll1/a;->f(ZLjava/io/IOException;)V

    .line 276
    .line 277
    .line 278
    throw v2

    .line 279
    :cond_f
    :try_start_2
    new-instance v0, Ljava/net/ProtocolException;

    .line 280
    .line 281
    new-instance v3, Ljava/lang/StringBuilder;

    .line 282
    .line 283
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    iget-wide v4, v1, Ll1/c;->f:J

    .line 287
    .line 288
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    const-string v2, "\""

    .line 295
    .line 296
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    invoke-direct {v0, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    throw v0
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0

    .line 307
    :goto_7
    new-instance v2, Ljava/net/ProtocolException;

    .line 308
    .line 309
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    invoke-direct {v2, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    throw v2

    .line 317
    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 318
    .line 319
    const-string v2, "closed"

    .line 320
    .line 321
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    throw v0
.end method
