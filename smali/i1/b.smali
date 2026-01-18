.class public final Li1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg1/v;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Li1/b;->a:I

    iput-object p2, p0, Li1/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b(Lk1/e;)Lg1/C;
    .locals 9

    .line 1
    iget-object v0, p1, Lk1/e;->f:Lg1/A;

    .line 2
    .line 3
    iget-object v7, p1, Lk1/e;->b:Lj1/f;

    .line 4
    .line 5
    iget-object v1, v0, Lg1/A;->b:Ljava/lang/String;

    .line 6
    .line 7
    const-string v2, "GET"

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    xor-int/lit8 v6, v1, 0x1

    .line 14
    .line 15
    iget-object v1, p0, Li1/b;->b:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v8, v1

    .line 18
    check-cast v8, Lg1/x;

    .line 19
    .line 20
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget v2, p1, Lk1/e;->i:I

    .line 24
    .line 25
    iget v3, p1, Lk1/e;->j:I

    .line 26
    .line 27
    iget v4, p1, Lk1/e;->k:I

    .line 28
    .line 29
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-boolean v5, v8, Lg1/x;->s:Z

    .line 33
    .line 34
    move-object v1, v7

    .line 35
    :try_start_0
    invoke-virtual/range {v1 .. v6}, Lj1/f;->d(IIIZZ)Lj1/b;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1, v8, p1, v7}, Lj1/b;->i(Lg1/x;Lk1/e;Lj1/f;)Lk1/b;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget-object v2, v7, Lj1/f;->d:Lg1/n;

    .line 44
    .line 45
    monitor-enter v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    :try_start_1
    iput-object v1, v7, Lj1/f;->l:Lk1/b;

    .line 47
    .line 48
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    invoke-virtual {v7}, Lj1/f;->a()Lj1/b;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {p1, v0, v7, v1, v2}, Lk1/e;->b(Lg1/A;Lj1/f;Lk1/b;Lj1/b;)Lg1/C;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1

    .line 58
    :catchall_0
    move-exception p1

    .line 59
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 60
    :try_start_3
    throw p1
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 61
    :catch_0
    move-exception p1

    .line 62
    new-instance v0, Lj1/c;

    .line 63
    .line 64
    invoke-direct {v0, p1}, Lj1/c;-><init>(Ljava/io/IOException;)V

    .line 65
    .line 66
    .line 67
    throw v0
.end method

.method public static c(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "Connection"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "Keep-Alive"

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const-string v0, "Proxy-Authenticate"

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    const-string v0, "Proxy-Authorization"

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    const-string v0, "TE"

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    const-string v0, "Trailers"

    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_0

    .line 48
    .line 49
    const-string v0, "Transfer-Encoding"

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_0

    .line 56
    .line 57
    const-string v0, "Upgrade"

    .line 58
    .line 59
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_0

    .line 64
    .line 65
    const/4 p0, 0x1

    .line 66
    goto :goto_0

    .line 67
    :cond_0
    const/4 p0, 0x0

    .line 68
    :goto_0
    return p0
.end method

.method public static d(Lg1/C;)Lg1/C;
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lg1/C;->g:Lg1/E;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lg1/C;->h()Lg1/B;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lg1/B;->g:Lg1/E;

    .line 13
    .line 14
    invoke-virtual {p0}, Lg1/B;->a()Lg1/C;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_0
    return-object p0
.end method


# virtual methods
.method public final a(Lk1/e;)Lg1/C;
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const/4 v4, 0x0

    .line 6
    iget v8, v1, Li1/b;->a:I

    .line 7
    .line 8
    packed-switch v8, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v7, v0, Lk1/e;->f:Lg1/A;

    .line 12
    .line 13
    invoke-virtual {v7}, Lg1/A;->a()LA/k;

    .line 14
    .line 15
    .line 16
    move-result-object v8

    .line 17
    const-string v9, "Content-Length"

    .line 18
    .line 19
    iget-object v10, v7, Lg1/A;->c:Lg1/s;

    .line 20
    .line 21
    const-string v11, "Host"

    .line 22
    .line 23
    invoke-virtual {v10, v11}, Lg1/s;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v12

    .line 27
    iget-object v13, v7, Lg1/A;->a:Lg1/u;

    .line 28
    .line 29
    if-nez v12, :cond_0

    .line 30
    .line 31
    invoke-static {v13, v4}, Lh1/c;->j(Lg1/u;Z)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v12

    .line 35
    invoke-virtual {v8, v11, v12}, LA/k;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    const-string v11, "Connection"

    .line 39
    .line 40
    invoke-virtual {v10, v11}, Lg1/s;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v12

    .line 44
    if-nez v12, :cond_1

    .line 45
    .line 46
    const-string v12, "Keep-Alive"

    .line 47
    .line 48
    invoke-virtual {v8, v11, v12}, LA/k;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    const-string v11, "Accept-Encoding"

    .line 52
    .line 53
    invoke-virtual {v10, v11}, Lg1/s;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v12

    .line 57
    const-string v14, "gzip"

    .line 58
    .line 59
    if-nez v12, :cond_2

    .line 60
    .line 61
    const-string v12, "Range"

    .line 62
    .line 63
    invoke-virtual {v10, v12}, Lg1/s;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v12

    .line 67
    if-nez v12, :cond_2

    .line 68
    .line 69
    invoke-virtual {v8, v11, v14}, LA/k;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const/4 v11, 0x1

    .line 73
    goto :goto_0

    .line 74
    :cond_2
    const/4 v11, 0x0

    .line 75
    :goto_0
    iget-object v12, v1, Li1/b;->b:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v12, Lg1/b;

    .line 78
    .line 79
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v15

    .line 86
    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v16

    .line 90
    if-nez v16, :cond_5

    .line 91
    .line 92
    new-instance v4, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    const/4 v3, 0x0

    .line 102
    :goto_1
    if-ge v3, v2, :cond_4

    .line 103
    .line 104
    if-lez v3, :cond_3

    .line 105
    .line 106
    const-string v5, "; "

    .line 107
    .line 108
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    :cond_3
    invoke-interface {v15, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    check-cast v5, Lg1/q;

    .line 116
    .line 117
    iget-object v6, v5, Lg1/q;->a:Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const/16 v6, 0x3d

    .line 123
    .line 124
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    iget-object v5, v5, Lg1/q;->b:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const/4 v5, 0x1

    .line 133
    add-int/2addr v3, v5

    .line 134
    goto :goto_1

    .line 135
    :cond_4
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    const-string v3, "Cookie"

    .line 140
    .line 141
    invoke-virtual {v8, v3, v2}, LA/k;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    :cond_5
    const-string v2, "User-Agent"

    .line 145
    .line 146
    invoke-virtual {v10, v2}, Lg1/s;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    if-nez v3, :cond_6

    .line 151
    .line 152
    const-string v3, "okhttp/3.10.0"

    .line 153
    .line 154
    invoke-virtual {v8, v2, v3}, LA/k;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :cond_6
    invoke-virtual {v8}, LA/k;->b()Lg1/A;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-virtual {v0, v2}, Lk1/e;->a(Lg1/A;)Lg1/C;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    iget-object v2, v0, Lg1/C;->f:Lg1/s;

    .line 166
    .line 167
    invoke-static {v12, v13, v2}, Lk1/d;->d(Lg1/b;Lg1/u;Lg1/s;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Lg1/C;->h()Lg1/B;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    iput-object v7, v3, Lg1/B;->a:Lg1/A;

    .line 175
    .line 176
    if-eqz v11, :cond_7

    .line 177
    .line 178
    const-string v4, "Content-Encoding"

    .line 179
    .line 180
    invoke-virtual {v0, v4}, Lg1/C;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    invoke-virtual {v14, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 185
    .line 186
    .line 187
    move-result v5

    .line 188
    if-eqz v5, :cond_7

    .line 189
    .line 190
    invoke-static {v0}, Lk1/d;->b(Lg1/C;)Z

    .line 191
    .line 192
    .line 193
    move-result v5

    .line 194
    if-eqz v5, :cond_7

    .line 195
    .line 196
    new-instance v5, Lr1/l;

    .line 197
    .line 198
    iget-object v6, v0, Lg1/C;->g:Lg1/E;

    .line 199
    .line 200
    invoke-virtual {v6}, Lg1/E;->g()Lr1/g;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    invoke-direct {v5, v6}, Lr1/l;-><init>(Lr1/v;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v2}, Lg1/s;->c()LA/b;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-virtual {v2, v4}, LA/b;->B(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2, v9}, LA/b;->B(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    iget-object v2, v2, LA/b;->g:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v2, Ljava/util/ArrayList;

    .line 220
    .line 221
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    new-array v4, v4, [Ljava/lang/String;

    .line 226
    .line 227
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    check-cast v2, [Ljava/lang/String;

    .line 232
    .line 233
    new-instance v4, LA/b;

    .line 234
    .line 235
    const/16 v6, 0x1b

    .line 236
    .line 237
    invoke-direct {v4, v6}, LA/b;-><init>(I)V

    .line 238
    .line 239
    .line 240
    iget-object v6, v4, LA/b;->g:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v6, Ljava/util/ArrayList;

    .line 243
    .line 244
    invoke-static {v6, v2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    iput-object v4, v3, Lg1/B;->f:LA/b;

    .line 248
    .line 249
    const-string v2, "Content-Type"

    .line 250
    .line 251
    invoke-virtual {v0, v2}, Lg1/C;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    new-instance v0, Lg1/D;

    .line 255
    .line 256
    sget-object v2, Lr1/o;->a:Ljava/util/logging/Logger;

    .line 257
    .line 258
    new-instance v2, Lr1/q;

    .line 259
    .line 260
    invoke-direct {v2, v5}, Lr1/q;-><init>(Lr1/v;)V

    .line 261
    .line 262
    .line 263
    const/4 v4, 0x1

    .line 264
    const-wide/16 v5, -0x1

    .line 265
    .line 266
    invoke-direct {v0, v5, v6, v2, v4}, Lg1/D;-><init>(JLr1/g;I)V

    .line 267
    .line 268
    .line 269
    iput-object v0, v3, Lg1/B;->g:Lg1/E;

    .line 270
    .line 271
    :cond_7
    invoke-virtual {v3}, Lg1/B;->a()Lg1/C;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    return-object v0

    .line 276
    :pswitch_0
    invoke-direct/range {p0 .. p1}, Li1/b;->b(Lk1/e;)Lg1/C;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    return-object v0

    .line 281
    :pswitch_1
    iget-object v2, v1, Li1/b;->b:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v2, LA/b;

    .line 284
    .line 285
    const/4 v3, 0x0

    .line 286
    if-eqz v2, :cond_b

    .line 287
    .line 288
    iget-object v4, v0, Lk1/e;->f:Lg1/A;

    .line 289
    .line 290
    iget-object v2, v2, LA/b;->g:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v2, Lg1/h;

    .line 293
    .line 294
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    iget-object v5, v4, Lg1/A;->a:Lg1/u;

    .line 298
    .line 299
    iget-object v5, v5, Lg1/u;->h:Ljava/lang/String;

    .line 300
    .line 301
    invoke-static {v5}, Lr1/h;->f(Ljava/lang/String;)Lr1/h;

    .line 302
    .line 303
    .line 304
    move-result-object v5

    .line 305
    const-string v6, "MD5"

    .line 306
    .line 307
    invoke-virtual {v5, v6}, Lr1/h;->e(Ljava/lang/String;)Lr1/h;

    .line 308
    .line 309
    .line 310
    move-result-object v5

    .line 311
    invoke-virtual {v5}, Lr1/h;->h()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v5

    .line 315
    :try_start_0
    iget-object v2, v2, Lg1/h;->b:Li1/g;

    .line 316
    .line 317
    invoke-virtual {v2, v5}, Li1/g;->i(Ljava/lang/String;)Li1/f;

    .line 318
    .line 319
    .line 320
    move-result-object v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    .line 321
    if-nez v2, :cond_8

    .line 322
    .line 323
    move-object v2, v3

    .line 324
    const/4 v8, 0x0

    .line 325
    goto/16 :goto_3

    .line 326
    .line 327
    :cond_8
    :try_start_1
    new-instance v5, Lg1/g;

    .line 328
    .line 329
    iget-object v6, v2, Li1/f;->c:[Lr1/v;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 330
    .line 331
    const/4 v8, 0x0

    .line 332
    :try_start_2
    aget-object v6, v6, v8

    .line 333
    .line 334
    invoke-direct {v5, v6}, Lg1/g;-><init>(Lr1/v;)V

    .line 335
    .line 336
    .line 337
    iget-object v6, v5, Lg1/g;->b:Lg1/s;

    .line 338
    .line 339
    iget-object v9, v5, Lg1/g;->c:Ljava/lang/String;

    .line 340
    .line 341
    iget-object v10, v5, Lg1/g;->a:Ljava/lang/String;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 342
    .line 343
    const-string v11, "Content-Type"

    .line 344
    .line 345
    iget-object v12, v5, Lg1/g;->g:Lg1/s;

    .line 346
    .line 347
    invoke-virtual {v12, v11}, Lg1/s;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    const-string v11, "Content-Length"

    .line 351
    .line 352
    invoke-virtual {v12, v11}, Lg1/s;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v11

    .line 356
    new-instance v13, LA/k;

    .line 357
    .line 358
    const/4 v14, 0x5

    .line 359
    invoke-direct {v13, v14}, LA/k;-><init>(I)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v13, v10}, LA/k;->s(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v13, v9, v3}, LA/k;->n(Ljava/lang/String;LT0/g;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v6}, Lg1/s;->c()LA/b;

    .line 369
    .line 370
    .line 371
    move-result-object v14

    .line 372
    iput-object v14, v13, LA/k;->h:Ljava/lang/Object;

    .line 373
    .line 374
    invoke-virtual {v13}, LA/k;->b()Lg1/A;

    .line 375
    .line 376
    .line 377
    move-result-object v13

    .line 378
    new-instance v14, Lg1/B;

    .line 379
    .line 380
    invoke-direct {v14}, Lg1/B;-><init>()V

    .line 381
    .line 382
    .line 383
    iput-object v13, v14, Lg1/B;->a:Lg1/A;

    .line 384
    .line 385
    iget-object v13, v5, Lg1/g;->d:Lg1/y;

    .line 386
    .line 387
    iput-object v13, v14, Lg1/B;->b:Lg1/y;

    .line 388
    .line 389
    iget v13, v5, Lg1/g;->e:I

    .line 390
    .line 391
    iput v13, v14, Lg1/B;->c:I

    .line 392
    .line 393
    iget-object v13, v5, Lg1/g;->f:Ljava/lang/String;

    .line 394
    .line 395
    iput-object v13, v14, Lg1/B;->d:Ljava/lang/String;

    .line 396
    .line 397
    invoke-virtual {v12}, Lg1/s;->c()LA/b;

    .line 398
    .line 399
    .line 400
    move-result-object v12

    .line 401
    iput-object v12, v14, Lg1/B;->f:LA/b;

    .line 402
    .line 403
    new-instance v12, Lg1/f;

    .line 404
    .line 405
    invoke-direct {v12, v2, v11}, Lg1/f;-><init>(Li1/f;Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    iput-object v12, v14, Lg1/B;->g:Lg1/E;

    .line 409
    .line 410
    iget-object v2, v5, Lg1/g;->h:Lg1/r;

    .line 411
    .line 412
    iput-object v2, v14, Lg1/B;->e:Lg1/r;

    .line 413
    .line 414
    iget-wide v11, v5, Lg1/g;->i:J

    .line 415
    .line 416
    iput-wide v11, v14, Lg1/B;->k:J

    .line 417
    .line 418
    iget-wide v11, v5, Lg1/g;->j:J

    .line 419
    .line 420
    iput-wide v11, v14, Lg1/B;->l:J

    .line 421
    .line 422
    invoke-virtual {v14}, Lg1/B;->a()Lg1/C;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    iget-object v5, v4, Lg1/A;->a:Lg1/u;

    .line 427
    .line 428
    iget-object v5, v5, Lg1/u;->h:Ljava/lang/String;

    .line 429
    .line 430
    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    move-result v5

    .line 434
    if-eqz v5, :cond_a

    .line 435
    .line 436
    iget-object v5, v4, Lg1/A;->b:Ljava/lang/String;

    .line 437
    .line 438
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    move-result v5

    .line 442
    if-eqz v5, :cond_a

    .line 443
    .line 444
    sget v5, Lk1/d;->a:I

    .line 445
    .line 446
    iget-object v5, v2, Lg1/C;->f:Lg1/s;

    .line 447
    .line 448
    invoke-static {v5}, Lk1/d;->f(Lg1/s;)Ljava/util/Set;

    .line 449
    .line 450
    .line 451
    move-result-object v5

    .line 452
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 453
    .line 454
    .line 455
    move-result-object v5

    .line 456
    :cond_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 457
    .line 458
    .line 459
    move-result v9

    .line 460
    if-eqz v9, :cond_c

    .line 461
    .line 462
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v9

    .line 466
    check-cast v9, Ljava/lang/String;

    .line 467
    .line 468
    invoke-virtual {v6, v9}, Lg1/s;->f(Ljava/lang/String;)Ljava/util/List;

    .line 469
    .line 470
    .line 471
    move-result-object v10

    .line 472
    iget-object v11, v4, Lg1/A;->c:Lg1/s;

    .line 473
    .line 474
    invoke-virtual {v11, v9}, Lg1/s;->f(Ljava/lang/String;)Ljava/util/List;

    .line 475
    .line 476
    .line 477
    move-result-object v9

    .line 478
    invoke-static {v10, v9}, Lh1/c;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 479
    .line 480
    .line 481
    move-result v9

    .line 482
    if-nez v9, :cond_9

    .line 483
    .line 484
    :cond_a
    iget-object v2, v2, Lg1/C;->g:Lg1/E;

    .line 485
    .line 486
    invoke-static {v2}, Lh1/c;->c(Ljava/io/Closeable;)V

    .line 487
    .line 488
    .line 489
    goto :goto_2

    .line 490
    :catch_0
    const/4 v8, 0x0

    .line 491
    :catch_1
    invoke-static {v2}, Lh1/c;->c(Ljava/io/Closeable;)V

    .line 492
    .line 493
    .line 494
    goto :goto_2

    .line 495
    :catch_2
    :cond_b
    const/4 v8, 0x0

    .line 496
    :goto_2
    move-object v2, v3

    .line 497
    :cond_c
    :goto_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 498
    .line 499
    .line 500
    move-result-wide v4

    .line 501
    iget-object v6, v0, Lk1/e;->f:Lg1/A;

    .line 502
    .line 503
    if-eqz v2, :cond_13

    .line 504
    .line 505
    iget-wide v12, v2, Lg1/C;->k:J

    .line 506
    .line 507
    iget-wide v14, v2, Lg1/C;->l:J

    .line 508
    .line 509
    iget-object v8, v2, Lg1/C;->f:Lg1/s;

    .line 510
    .line 511
    invoke-virtual {v8}, Lg1/s;->d()I

    .line 512
    .line 513
    .line 514
    move-result v10

    .line 515
    move-object/from16 v17, v3

    .line 516
    .line 517
    move-object/from16 v19, v17

    .line 518
    .line 519
    move-object/from16 v20, v19

    .line 520
    .line 521
    move-object/from16 v21, v20

    .line 522
    .line 523
    move-object/from16 v22, v21

    .line 524
    .line 525
    move-object/from16 v23, v22

    .line 526
    .line 527
    const/4 v11, 0x0

    .line 528
    const/16 v18, -0x1

    .line 529
    .line 530
    :goto_4
    if-ge v11, v10, :cond_12

    .line 531
    .line 532
    invoke-virtual {v8, v11}, Lg1/s;->b(I)Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v3

    .line 536
    invoke-virtual {v8, v11}, Lg1/s;->e(I)Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v7

    .line 540
    const-string v9, "Date"

    .line 541
    .line 542
    invoke-virtual {v9, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 543
    .line 544
    .line 545
    move-result v9

    .line 546
    if-eqz v9, :cond_e

    .line 547
    .line 548
    invoke-static {v7}, Lk1/c;->a(Ljava/lang/String;)Ljava/util/Date;

    .line 549
    .line 550
    .line 551
    move-result-object v17

    .line 552
    move-object/from16 v23, v7

    .line 553
    .line 554
    :cond_d
    :goto_5
    const/4 v3, 0x1

    .line 555
    goto :goto_6

    .line 556
    :cond_e
    const-string v9, "Expires"

    .line 557
    .line 558
    invoke-virtual {v9, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 559
    .line 560
    .line 561
    move-result v9

    .line 562
    if-eqz v9, :cond_f

    .line 563
    .line 564
    invoke-static {v7}, Lk1/c;->a(Ljava/lang/String;)Ljava/util/Date;

    .line 565
    .line 566
    .line 567
    move-result-object v20

    .line 568
    goto :goto_5

    .line 569
    :cond_f
    const-string v9, "Last-Modified"

    .line 570
    .line 571
    invoke-virtual {v9, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 572
    .line 573
    .line 574
    move-result v9

    .line 575
    if-eqz v9, :cond_10

    .line 576
    .line 577
    invoke-static {v7}, Lk1/c;->a(Ljava/lang/String;)Ljava/util/Date;

    .line 578
    .line 579
    .line 580
    move-result-object v19

    .line 581
    move-object/from16 v22, v7

    .line 582
    .line 583
    goto :goto_5

    .line 584
    :cond_10
    const-string v9, "ETag"

    .line 585
    .line 586
    invoke-virtual {v9, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 587
    .line 588
    .line 589
    move-result v9

    .line 590
    if-eqz v9, :cond_11

    .line 591
    .line 592
    move-object/from16 v21, v7

    .line 593
    .line 594
    goto :goto_5

    .line 595
    :cond_11
    const-string v9, "Age"

    .line 596
    .line 597
    invoke-virtual {v9, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 598
    .line 599
    .line 600
    move-result v3

    .line 601
    if-eqz v3, :cond_d

    .line 602
    .line 603
    const/4 v3, -0x1

    .line 604
    invoke-static {v7, v3}, Lk1/d;->c(Ljava/lang/String;I)I

    .line 605
    .line 606
    .line 607
    move-result v18

    .line 608
    goto :goto_5

    .line 609
    :goto_6
    add-int/2addr v11, v3

    .line 610
    const/4 v3, 0x0

    .line 611
    goto :goto_4

    .line 612
    :cond_12
    move/from16 v3, v18

    .line 613
    .line 614
    goto :goto_7

    .line 615
    :cond_13
    const/4 v3, -0x1

    .line 616
    const-wide/16 v12, 0x0

    .line 617
    .line 618
    const-wide/16 v14, 0x0

    .line 619
    .line 620
    const/16 v17, 0x0

    .line 621
    .line 622
    const/16 v19, 0x0

    .line 623
    .line 624
    const/16 v20, 0x0

    .line 625
    .line 626
    const/16 v21, 0x0

    .line 627
    .line 628
    const/16 v22, 0x0

    .line 629
    .line 630
    const/16 v23, 0x0

    .line 631
    .line 632
    :goto_7
    if-nez v2, :cond_14

    .line 633
    .line 634
    new-instance v3, LE/j;

    .line 635
    .line 636
    const/4 v4, 0x0

    .line 637
    const/16 v5, 0xf

    .line 638
    .line 639
    invoke-direct {v3, v6, v4, v5}, LE/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 640
    .line 641
    .line 642
    :goto_8
    move-object v7, v6

    .line 643
    goto/16 :goto_14

    .line 644
    .line 645
    :cond_14
    iget-object v7, v6, Lg1/A;->a:Lg1/u;

    .line 646
    .line 647
    iget-object v7, v7, Lg1/u;->a:Ljava/lang/String;

    .line 648
    .line 649
    const-string v8, "https"

    .line 650
    .line 651
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 652
    .line 653
    .line 654
    move-result v7

    .line 655
    if-eqz v7, :cond_15

    .line 656
    .line 657
    iget-object v7, v2, Lg1/C;->e:Lg1/r;

    .line 658
    .line 659
    if-nez v7, :cond_15

    .line 660
    .line 661
    new-instance v3, LE/j;

    .line 662
    .line 663
    const/4 v7, 0x0

    .line 664
    const/16 v8, 0xf

    .line 665
    .line 666
    invoke-direct {v3, v6, v7, v8}, LE/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 667
    .line 668
    .line 669
    goto :goto_8

    .line 670
    :cond_15
    const/4 v7, 0x0

    .line 671
    const/16 v8, 0xf

    .line 672
    .line 673
    invoke-static {v2, v6}, LE/j;->A(Lg1/C;Lg1/A;)Z

    .line 674
    .line 675
    .line 676
    move-result v9

    .line 677
    if-nez v9, :cond_16

    .line 678
    .line 679
    new-instance v3, LE/j;

    .line 680
    .line 681
    invoke-direct {v3, v6, v7, v8}, LE/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 682
    .line 683
    .line 684
    goto :goto_8

    .line 685
    :cond_16
    iget-object v7, v6, Lg1/A;->e:Lg1/j;

    .line 686
    .line 687
    if-eqz v7, :cond_17

    .line 688
    .line 689
    goto :goto_9

    .line 690
    :cond_17
    iget-object v7, v6, Lg1/A;->c:Lg1/s;

    .line 691
    .line 692
    invoke-static {v7}, Lg1/j;->a(Lg1/s;)Lg1/j;

    .line 693
    .line 694
    .line 695
    move-result-object v7

    .line 696
    iput-object v7, v6, Lg1/A;->e:Lg1/j;

    .line 697
    .line 698
    :goto_9
    iget-boolean v8, v7, Lg1/j;->a:Z

    .line 699
    .line 700
    if-nez v8, :cond_2d

    .line 701
    .line 702
    iget-object v8, v6, Lg1/A;->c:Lg1/s;

    .line 703
    .line 704
    const-string v9, "If-Modified-Since"

    .line 705
    .line 706
    invoke-virtual {v8, v9}, Lg1/s;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v10

    .line 710
    if-nez v10, :cond_2d

    .line 711
    .line 712
    const-string v10, "If-None-Match"

    .line 713
    .line 714
    invoke-virtual {v8, v10}, Lg1/s;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 715
    .line 716
    .line 717
    move-result-object v11

    .line 718
    if-eqz v11, :cond_18

    .line 719
    .line 720
    goto/16 :goto_13

    .line 721
    .line 722
    :cond_18
    invoke-virtual {v2}, Lg1/C;->f()Lg1/j;

    .line 723
    .line 724
    .line 725
    move-result-object v11

    .line 726
    move-object/from16 v18, v9

    .line 727
    .line 728
    iget-boolean v9, v11, Lg1/j;->l:Z

    .line 729
    .line 730
    if-eqz v9, :cond_19

    .line 731
    .line 732
    new-instance v3, LE/j;

    .line 733
    .line 734
    const/4 v4, 0x0

    .line 735
    const/16 v5, 0xf

    .line 736
    .line 737
    invoke-direct {v3, v4, v2, v5}, LE/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 738
    .line 739
    .line 740
    goto :goto_8

    .line 741
    :cond_19
    if-eqz v17, :cond_1a

    .line 742
    .line 743
    invoke-virtual/range {v17 .. v17}, Ljava/util/Date;->getTime()J

    .line 744
    .line 745
    .line 746
    move-result-wide v24

    .line 747
    move-object/from16 v26, v10

    .line 748
    .line 749
    sub-long v9, v14, v24

    .line 750
    .line 751
    const-wide/16 v0, 0x0

    .line 752
    .line 753
    invoke-static {v0, v1, v9, v10}, Ljava/lang/Math;->max(JJ)J

    .line 754
    .line 755
    .line 756
    move-result-wide v9

    .line 757
    const/4 v0, -0x1

    .line 758
    goto :goto_a

    .line 759
    :cond_1a
    move-object/from16 v26, v10

    .line 760
    .line 761
    const/4 v0, -0x1

    .line 762
    const-wide/16 v9, 0x0

    .line 763
    .line 764
    :goto_a
    if-eq v3, v0, :cond_1b

    .line 765
    .line 766
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 767
    .line 768
    move-object v1, v6

    .line 769
    move-object/from16 v24, v7

    .line 770
    .line 771
    int-to-long v6, v3

    .line 772
    invoke-virtual {v0, v6, v7}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 773
    .line 774
    .line 775
    move-result-wide v6

    .line 776
    invoke-static {v9, v10, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 777
    .line 778
    .line 779
    move-result-wide v9

    .line 780
    goto :goto_b

    .line 781
    :cond_1b
    move-object v1, v6

    .line 782
    move-object/from16 v24, v7

    .line 783
    .line 784
    :goto_b
    sub-long v6, v14, v12

    .line 785
    .line 786
    sub-long/2addr v4, v14

    .line 787
    add-long/2addr v9, v6

    .line 788
    add-long/2addr v9, v4

    .line 789
    invoke-virtual {v2}, Lg1/C;->f()Lg1/j;

    .line 790
    .line 791
    .line 792
    move-result-object v0

    .line 793
    iget v0, v0, Lg1/j;->c:I

    .line 794
    .line 795
    const/4 v3, -0x1

    .line 796
    if-eq v0, v3, :cond_1c

    .line 797
    .line 798
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 799
    .line 800
    int-to-long v4, v0

    .line 801
    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 802
    .line 803
    .line 804
    move-result-wide v3

    .line 805
    :goto_c
    move-wide v5, v3

    .line 806
    move-object/from16 v7, v24

    .line 807
    .line 808
    const-wide/16 v3, 0x0

    .line 809
    .line 810
    goto :goto_f

    .line 811
    :cond_1c
    if-eqz v20, :cond_1f

    .line 812
    .line 813
    if-eqz v17, :cond_1d

    .line 814
    .line 815
    invoke-virtual/range {v17 .. v17}, Ljava/util/Date;->getTime()J

    .line 816
    .line 817
    .line 818
    move-result-wide v14

    .line 819
    :cond_1d
    invoke-virtual/range {v20 .. v20}, Ljava/util/Date;->getTime()J

    .line 820
    .line 821
    .line 822
    move-result-wide v3

    .line 823
    sub-long/2addr v3, v14

    .line 824
    const-wide/16 v5, 0x0

    .line 825
    .line 826
    cmp-long v0, v3, v5

    .line 827
    .line 828
    if-lez v0, :cond_1e

    .line 829
    .line 830
    goto :goto_c

    .line 831
    :cond_1e
    const-wide/16 v3, 0x0

    .line 832
    .line 833
    goto :goto_c

    .line 834
    :cond_1f
    if-eqz v19, :cond_22

    .line 835
    .line 836
    iget-object v0, v2, Lg1/C;->a:Lg1/A;

    .line 837
    .line 838
    iget-object v0, v0, Lg1/A;->a:Lg1/u;

    .line 839
    .line 840
    iget-object v0, v0, Lg1/u;->f:Ljava/util/List;

    .line 841
    .line 842
    if-nez v0, :cond_20

    .line 843
    .line 844
    const/4 v0, 0x0

    .line 845
    goto :goto_d

    .line 846
    :cond_20
    new-instance v3, Ljava/lang/StringBuilder;

    .line 847
    .line 848
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 849
    .line 850
    .line 851
    invoke-static {v3, v0}, Lg1/u;->g(Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 852
    .line 853
    .line 854
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 855
    .line 856
    .line 857
    move-result-object v0

    .line 858
    :goto_d
    if-nez v0, :cond_22

    .line 859
    .line 860
    if-eqz v17, :cond_21

    .line 861
    .line 862
    invoke-virtual/range {v17 .. v17}, Ljava/util/Date;->getTime()J

    .line 863
    .line 864
    .line 865
    move-result-wide v12

    .line 866
    :cond_21
    invoke-virtual/range {v19 .. v19}, Ljava/util/Date;->getTime()J

    .line 867
    .line 868
    .line 869
    move-result-wide v3

    .line 870
    sub-long/2addr v12, v3

    .line 871
    const-wide/16 v3, 0x0

    .line 872
    .line 873
    cmp-long v0, v12, v3

    .line 874
    .line 875
    if-lez v0, :cond_23

    .line 876
    .line 877
    const-wide/16 v5, 0xa

    .line 878
    .line 879
    div-long v5, v12, v5

    .line 880
    .line 881
    :goto_e
    move-object/from16 v7, v24

    .line 882
    .line 883
    goto :goto_f

    .line 884
    :cond_22
    const-wide/16 v3, 0x0

    .line 885
    .line 886
    :cond_23
    move-wide v5, v3

    .line 887
    goto :goto_e

    .line 888
    :goto_f
    iget v0, v7, Lg1/j;->c:I

    .line 889
    .line 890
    const/4 v12, -0x1

    .line 891
    if-eq v0, v12, :cond_24

    .line 892
    .line 893
    sget-object v13, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 894
    .line 895
    int-to-long v14, v0

    .line 896
    invoke-virtual {v13, v14, v15}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 897
    .line 898
    .line 899
    move-result-wide v13

    .line 900
    invoke-static {v5, v6, v13, v14}, Ljava/lang/Math;->min(JJ)J

    .line 901
    .line 902
    .line 903
    move-result-wide v5

    .line 904
    :cond_24
    iget v0, v7, Lg1/j;->i:I

    .line 905
    .line 906
    if-eq v0, v12, :cond_25

    .line 907
    .line 908
    sget-object v13, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 909
    .line 910
    int-to-long v14, v0

    .line 911
    invoke-virtual {v13, v14, v15}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 912
    .line 913
    .line 914
    move-result-wide v13

    .line 915
    goto :goto_10

    .line 916
    :cond_25
    move-wide v13, v3

    .line 917
    :goto_10
    iget-boolean v0, v11, Lg1/j;->g:Z

    .line 918
    .line 919
    if-nez v0, :cond_26

    .line 920
    .line 921
    iget v0, v7, Lg1/j;->h:I

    .line 922
    .line 923
    if-eq v0, v12, :cond_26

    .line 924
    .line 925
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 926
    .line 927
    move-object v7, v1

    .line 928
    int-to-long v0, v0

    .line 929
    invoke-virtual {v3, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 930
    .line 931
    .line 932
    move-result-wide v0

    .line 933
    goto :goto_11

    .line 934
    :cond_26
    move-object v7, v1

    .line 935
    move-wide v0, v3

    .line 936
    :goto_11
    iget-boolean v3, v11, Lg1/j;->a:Z

    .line 937
    .line 938
    if-nez v3, :cond_29

    .line 939
    .line 940
    add-long/2addr v13, v9

    .line 941
    add-long/2addr v0, v5

    .line 942
    cmp-long v3, v13, v0

    .line 943
    .line 944
    if-gez v3, :cond_29

    .line 945
    .line 946
    invoke-virtual {v2}, Lg1/C;->h()Lg1/B;

    .line 947
    .line 948
    .line 949
    move-result-object v0

    .line 950
    const-string v1, "Warning"

    .line 951
    .line 952
    cmp-long v3, v13, v5

    .line 953
    .line 954
    if-ltz v3, :cond_27

    .line 955
    .line 956
    iget-object v3, v0, Lg1/B;->f:LA/b;

    .line 957
    .line 958
    const-string v4, "110 HttpURLConnection \"Response is stale\""

    .line 959
    .line 960
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 961
    .line 962
    .line 963
    invoke-static {v1, v4}, LA/b;->s(Ljava/lang/String;Ljava/lang/String;)V

    .line 964
    .line 965
    .line 966
    invoke-virtual {v3, v1, v4}, LA/b;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 967
    .line 968
    .line 969
    :cond_27
    const-wide/32 v3, 0x5265c00

    .line 970
    .line 971
    .line 972
    cmp-long v5, v9, v3

    .line 973
    .line 974
    if-lez v5, :cond_28

    .line 975
    .line 976
    invoke-virtual {v2}, Lg1/C;->f()Lg1/j;

    .line 977
    .line 978
    .line 979
    move-result-object v3

    .line 980
    iget v3, v3, Lg1/j;->c:I

    .line 981
    .line 982
    const/4 v4, -0x1

    .line 983
    if-ne v3, v4, :cond_28

    .line 984
    .line 985
    if-nez v20, :cond_28

    .line 986
    .line 987
    iget-object v3, v0, Lg1/B;->f:LA/b;

    .line 988
    .line 989
    const-string v4, "113 HttpURLConnection \"Heuristic expiration\""

    .line 990
    .line 991
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 992
    .line 993
    .line 994
    invoke-static {v1, v4}, LA/b;->s(Ljava/lang/String;Ljava/lang/String;)V

    .line 995
    .line 996
    .line 997
    invoke-virtual {v3, v1, v4}, LA/b;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 998
    .line 999
    .line 1000
    :cond_28
    new-instance v3, LE/j;

    .line 1001
    .line 1002
    invoke-virtual {v0}, Lg1/B;->a()Lg1/C;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v0

    .line 1006
    const/4 v1, 0x0

    .line 1007
    const/16 v4, 0xf

    .line 1008
    .line 1009
    invoke-direct {v3, v1, v0, v4}, LE/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1010
    .line 1011
    .line 1012
    goto :goto_14

    .line 1013
    :cond_29
    if-eqz v21, :cond_2a

    .line 1014
    .line 1015
    move-object/from16 v0, v21

    .line 1016
    .line 1017
    move-object/from16 v9, v26

    .line 1018
    .line 1019
    goto :goto_12

    .line 1020
    :cond_2a
    if-eqz v19, :cond_2b

    .line 1021
    .line 1022
    move-object/from16 v9, v18

    .line 1023
    .line 1024
    move-object/from16 v0, v22

    .line 1025
    .line 1026
    goto :goto_12

    .line 1027
    :cond_2b
    if-eqz v17, :cond_2c

    .line 1028
    .line 1029
    move-object/from16 v9, v18

    .line 1030
    .line 1031
    move-object/from16 v0, v23

    .line 1032
    .line 1033
    :goto_12
    invoke-virtual {v8}, Lg1/s;->c()LA/b;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v1

    .line 1037
    sget-object v3, Lg1/b;->e:Lg1/b;

    .line 1038
    .line 1039
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual {v1, v9, v0}, LA/b;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual {v7}, Lg1/A;->a()LA/k;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v0

    .line 1049
    iget-object v1, v1, LA/b;->g:Ljava/lang/Object;

    .line 1050
    .line 1051
    check-cast v1, Ljava/util/ArrayList;

    .line 1052
    .line 1053
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 1054
    .line 1055
    .line 1056
    move-result v3

    .line 1057
    new-array v3, v3, [Ljava/lang/String;

    .line 1058
    .line 1059
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v1

    .line 1063
    check-cast v1, [Ljava/lang/String;

    .line 1064
    .line 1065
    new-instance v3, LA/b;

    .line 1066
    .line 1067
    const/16 v4, 0x1b

    .line 1068
    .line 1069
    invoke-direct {v3, v4}, LA/b;-><init>(I)V

    .line 1070
    .line 1071
    .line 1072
    iget-object v4, v3, LA/b;->g:Ljava/lang/Object;

    .line 1073
    .line 1074
    check-cast v4, Ljava/util/ArrayList;

    .line 1075
    .line 1076
    invoke-static {v4, v1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 1077
    .line 1078
    .line 1079
    iput-object v3, v0, LA/k;->h:Ljava/lang/Object;

    .line 1080
    .line 1081
    invoke-virtual {v0}, LA/k;->b()Lg1/A;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v0

    .line 1085
    new-instance v3, LE/j;

    .line 1086
    .line 1087
    const/16 v1, 0xf

    .line 1088
    .line 1089
    invoke-direct {v3, v0, v2, v1}, LE/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1090
    .line 1091
    .line 1092
    goto :goto_14

    .line 1093
    :cond_2c
    const/16 v1, 0xf

    .line 1094
    .line 1095
    new-instance v3, LE/j;

    .line 1096
    .line 1097
    const/4 v0, 0x0

    .line 1098
    invoke-direct {v3, v7, v0, v1}, LE/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1099
    .line 1100
    .line 1101
    goto :goto_14

    .line 1102
    :cond_2d
    :goto_13
    move-object v7, v6

    .line 1103
    const/4 v0, 0x0

    .line 1104
    const/16 v1, 0xf

    .line 1105
    .line 1106
    new-instance v3, LE/j;

    .line 1107
    .line 1108
    invoke-direct {v3, v7, v0, v1}, LE/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1109
    .line 1110
    .line 1111
    :goto_14
    iget-object v0, v3, LE/j;->g:Ljava/lang/Object;

    .line 1112
    .line 1113
    check-cast v0, Lg1/A;

    .line 1114
    .line 1115
    if-eqz v0, :cond_2f

    .line 1116
    .line 1117
    iget-object v0, v7, Lg1/A;->e:Lg1/j;

    .line 1118
    .line 1119
    if-eqz v0, :cond_2e

    .line 1120
    .line 1121
    goto :goto_15

    .line 1122
    :cond_2e
    iget-object v0, v7, Lg1/A;->c:Lg1/s;

    .line 1123
    .line 1124
    invoke-static {v0}, Lg1/j;->a(Lg1/s;)Lg1/j;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v0

    .line 1128
    iput-object v0, v7, Lg1/A;->e:Lg1/j;

    .line 1129
    .line 1130
    :goto_15
    iget-boolean v0, v0, Lg1/j;->j:Z

    .line 1131
    .line 1132
    if-eqz v0, :cond_2f

    .line 1133
    .line 1134
    new-instance v3, LE/j;

    .line 1135
    .line 1136
    const/16 v0, 0xf

    .line 1137
    .line 1138
    const/4 v4, 0x0

    .line 1139
    invoke-direct {v3, v4, v4, v0}, LE/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1140
    .line 1141
    .line 1142
    goto :goto_16

    .line 1143
    :cond_2f
    const/4 v4, 0x0

    .line 1144
    :goto_16
    iget-object v0, v3, LE/j;->g:Ljava/lang/Object;

    .line 1145
    .line 1146
    check-cast v0, Lg1/A;

    .line 1147
    .line 1148
    iget-object v1, v3, LE/j;->h:Ljava/lang/Object;

    .line 1149
    .line 1150
    check-cast v1, Lg1/C;

    .line 1151
    .line 1152
    move-object/from16 v3, p0

    .line 1153
    .line 1154
    iget-object v5, v3, Li1/b;->b:Ljava/lang/Object;

    .line 1155
    .line 1156
    check-cast v5, LA/b;

    .line 1157
    .line 1158
    if-eqz v5, :cond_30

    .line 1159
    .line 1160
    iget-object v5, v5, LA/b;->g:Ljava/lang/Object;

    .line 1161
    .line 1162
    check-cast v5, Lg1/h;

    .line 1163
    .line 1164
    monitor-enter v5

    .line 1165
    monitor-exit v5

    .line 1166
    :cond_30
    if-eqz v2, :cond_31

    .line 1167
    .line 1168
    if-nez v1, :cond_31

    .line 1169
    .line 1170
    iget-object v5, v2, Lg1/C;->g:Lg1/E;

    .line 1171
    .line 1172
    invoke-static {v5}, Lh1/c;->c(Ljava/io/Closeable;)V

    .line 1173
    .line 1174
    .line 1175
    :cond_31
    if-nez v0, :cond_32

    .line 1176
    .line 1177
    if-nez v1, :cond_32

    .line 1178
    .line 1179
    new-instance v0, Lg1/B;

    .line 1180
    .line 1181
    invoke-direct {v0}, Lg1/B;-><init>()V

    .line 1182
    .line 1183
    .line 1184
    move-object/from16 v5, p1

    .line 1185
    .line 1186
    iget-object v1, v5, Lk1/e;->f:Lg1/A;

    .line 1187
    .line 1188
    iput-object v1, v0, Lg1/B;->a:Lg1/A;

    .line 1189
    .line 1190
    sget-object v1, Lg1/y;->c:Lg1/y;

    .line 1191
    .line 1192
    iput-object v1, v0, Lg1/B;->b:Lg1/y;

    .line 1193
    .line 1194
    const/16 v1, 0x1f8

    .line 1195
    .line 1196
    iput v1, v0, Lg1/B;->c:I

    .line 1197
    .line 1198
    const-string v1, "Unsatisfiable Request (only-if-cached)"

    .line 1199
    .line 1200
    iput-object v1, v0, Lg1/B;->d:Ljava/lang/String;

    .line 1201
    .line 1202
    sget-object v1, Lh1/c;->c:Lg1/D;

    .line 1203
    .line 1204
    iput-object v1, v0, Lg1/B;->g:Lg1/E;

    .line 1205
    .line 1206
    const-wide/16 v1, -0x1

    .line 1207
    .line 1208
    iput-wide v1, v0, Lg1/B;->k:J

    .line 1209
    .line 1210
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1211
    .line 1212
    .line 1213
    move-result-wide v1

    .line 1214
    iput-wide v1, v0, Lg1/B;->l:J

    .line 1215
    .line 1216
    invoke-virtual {v0}, Lg1/B;->a()Lg1/C;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v0

    .line 1220
    goto/16 :goto_21

    .line 1221
    .line 1222
    :cond_32
    move-object/from16 v5, p1

    .line 1223
    .line 1224
    if-nez v0, :cond_34

    .line 1225
    .line 1226
    invoke-virtual {v1}, Lg1/C;->h()Lg1/B;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v0

    .line 1230
    invoke-static {v1}, Li1/b;->d(Lg1/C;)Lg1/C;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v1

    .line 1234
    if-eqz v1, :cond_33

    .line 1235
    .line 1236
    const-string v2, "cacheResponse"

    .line 1237
    .line 1238
    invoke-static {v2, v1}, Lg1/B;->b(Ljava/lang/String;Lg1/C;)V

    .line 1239
    .line 1240
    .line 1241
    :cond_33
    iput-object v1, v0, Lg1/B;->i:Lg1/C;

    .line 1242
    .line 1243
    invoke-virtual {v0}, Lg1/B;->a()Lg1/C;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v0

    .line 1247
    goto/16 :goto_21

    .line 1248
    .line 1249
    :cond_34
    :try_start_3
    invoke-virtual {v5, v0}, Lk1/e;->a(Lg1/A;)Lg1/C;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1253
    if-eqz v1, :cond_40

    .line 1254
    .line 1255
    iget v5, v2, Lg1/C;->c:I

    .line 1256
    .line 1257
    const/16 v6, 0x130

    .line 1258
    .line 1259
    if-ne v5, v6, :cond_3f

    .line 1260
    .line 1261
    invoke-virtual {v1}, Lg1/C;->h()Lg1/B;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v0

    .line 1265
    iget-object v5, v1, Lg1/C;->f:Lg1/s;

    .line 1266
    .line 1267
    iget-object v6, v2, Lg1/C;->f:Lg1/s;

    .line 1268
    .line 1269
    new-instance v7, Ljava/util/ArrayList;

    .line 1270
    .line 1271
    const/16 v8, 0x14

    .line 1272
    .line 1273
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 1274
    .line 1275
    .line 1276
    invoke-virtual {v5}, Lg1/s;->d()I

    .line 1277
    .line 1278
    .line 1279
    move-result v8

    .line 1280
    const/4 v9, 0x0

    .line 1281
    :goto_17
    if-ge v9, v8, :cond_39

    .line 1282
    .line 1283
    invoke-virtual {v5, v9}, Lg1/s;->b(I)Ljava/lang/String;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v10

    .line 1287
    invoke-virtual {v5, v9}, Lg1/s;->e(I)Ljava/lang/String;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v11

    .line 1291
    const-string v12, "Warning"

    .line 1292
    .line 1293
    invoke-virtual {v12, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1294
    .line 1295
    .line 1296
    move-result v12

    .line 1297
    if-eqz v12, :cond_36

    .line 1298
    .line 1299
    const-string v12, "1"

    .line 1300
    .line 1301
    invoke-virtual {v11, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1302
    .line 1303
    .line 1304
    move-result v12

    .line 1305
    if-eqz v12, :cond_36

    .line 1306
    .line 1307
    :cond_35
    :goto_18
    const/4 v10, 0x1

    .line 1308
    goto :goto_1a

    .line 1309
    :cond_36
    const-string v12, "Content-Length"

    .line 1310
    .line 1311
    invoke-virtual {v12, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1312
    .line 1313
    .line 1314
    move-result v12

    .line 1315
    if-nez v12, :cond_38

    .line 1316
    .line 1317
    const-string v12, "Content-Encoding"

    .line 1318
    .line 1319
    invoke-virtual {v12, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1320
    .line 1321
    .line 1322
    move-result v12

    .line 1323
    if-nez v12, :cond_38

    .line 1324
    .line 1325
    const-string v12, "Content-Type"

    .line 1326
    .line 1327
    invoke-virtual {v12, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1328
    .line 1329
    .line 1330
    move-result v12

    .line 1331
    if-eqz v12, :cond_37

    .line 1332
    .line 1333
    goto :goto_19

    .line 1334
    :cond_37
    invoke-static {v10}, Li1/b;->c(Ljava/lang/String;)Z

    .line 1335
    .line 1336
    .line 1337
    move-result v12

    .line 1338
    if-eqz v12, :cond_38

    .line 1339
    .line 1340
    invoke-virtual {v6, v10}, Lg1/s;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v12

    .line 1344
    if-nez v12, :cond_35

    .line 1345
    .line 1346
    :cond_38
    :goto_19
    sget-object v12, Lg1/b;->e:Lg1/b;

    .line 1347
    .line 1348
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1349
    .line 1350
    .line 1351
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1352
    .line 1353
    .line 1354
    invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v10

    .line 1358
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1359
    .line 1360
    .line 1361
    goto :goto_18

    .line 1362
    :goto_1a
    add-int/2addr v9, v10

    .line 1363
    goto :goto_17

    .line 1364
    :cond_39
    invoke-virtual {v6}, Lg1/s;->d()I

    .line 1365
    .line 1366
    .line 1367
    move-result v5

    .line 1368
    const/4 v8, 0x0

    .line 1369
    :goto_1b
    if-ge v8, v5, :cond_3c

    .line 1370
    .line 1371
    invoke-virtual {v6, v8}, Lg1/s;->b(I)Ljava/lang/String;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v9

    .line 1375
    const-string v10, "Content-Length"

    .line 1376
    .line 1377
    invoke-virtual {v10, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1378
    .line 1379
    .line 1380
    move-result v10

    .line 1381
    if-nez v10, :cond_3b

    .line 1382
    .line 1383
    const-string v10, "Content-Encoding"

    .line 1384
    .line 1385
    invoke-virtual {v10, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1386
    .line 1387
    .line 1388
    move-result v10

    .line 1389
    if-nez v10, :cond_3b

    .line 1390
    .line 1391
    const-string v10, "Content-Type"

    .line 1392
    .line 1393
    invoke-virtual {v10, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1394
    .line 1395
    .line 1396
    move-result v10

    .line 1397
    if-eqz v10, :cond_3a

    .line 1398
    .line 1399
    goto :goto_1c

    .line 1400
    :cond_3a
    invoke-static {v9}, Li1/b;->c(Ljava/lang/String;)Z

    .line 1401
    .line 1402
    .line 1403
    move-result v10

    .line 1404
    if-eqz v10, :cond_3b

    .line 1405
    .line 1406
    sget-object v10, Lg1/b;->e:Lg1/b;

    .line 1407
    .line 1408
    invoke-virtual {v6, v8}, Lg1/s;->e(I)Ljava/lang/String;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v11

    .line 1412
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1413
    .line 1414
    .line 1415
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1416
    .line 1417
    .line 1418
    invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v9

    .line 1422
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1423
    .line 1424
    .line 1425
    :cond_3b
    :goto_1c
    const/4 v9, 0x1

    .line 1426
    add-int/2addr v8, v9

    .line 1427
    goto :goto_1b

    .line 1428
    :cond_3c
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 1429
    .line 1430
    .line 1431
    move-result v5

    .line 1432
    new-array v5, v5, [Ljava/lang/String;

    .line 1433
    .line 1434
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v5

    .line 1438
    check-cast v5, [Ljava/lang/String;

    .line 1439
    .line 1440
    new-instance v6, LA/b;

    .line 1441
    .line 1442
    const/16 v7, 0x1b

    .line 1443
    .line 1444
    invoke-direct {v6, v7}, LA/b;-><init>(I)V

    .line 1445
    .line 1446
    .line 1447
    iget-object v7, v6, LA/b;->g:Ljava/lang/Object;

    .line 1448
    .line 1449
    check-cast v7, Ljava/util/ArrayList;

    .line 1450
    .line 1451
    invoke-static {v7, v5}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 1452
    .line 1453
    .line 1454
    iput-object v6, v0, Lg1/B;->f:LA/b;

    .line 1455
    .line 1456
    iget-wide v5, v2, Lg1/C;->k:J

    .line 1457
    .line 1458
    iput-wide v5, v0, Lg1/B;->k:J

    .line 1459
    .line 1460
    iget-wide v5, v2, Lg1/C;->l:J

    .line 1461
    .line 1462
    iput-wide v5, v0, Lg1/B;->l:J

    .line 1463
    .line 1464
    invoke-static {v1}, Li1/b;->d(Lg1/C;)Lg1/C;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v5

    .line 1468
    if-eqz v5, :cond_3d

    .line 1469
    .line 1470
    const-string v6, "cacheResponse"

    .line 1471
    .line 1472
    invoke-static {v6, v5}, Lg1/B;->b(Ljava/lang/String;Lg1/C;)V

    .line 1473
    .line 1474
    .line 1475
    :cond_3d
    iput-object v5, v0, Lg1/B;->i:Lg1/C;

    .line 1476
    .line 1477
    invoke-static {v2}, Li1/b;->d(Lg1/C;)Lg1/C;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v5

    .line 1481
    if-eqz v5, :cond_3e

    .line 1482
    .line 1483
    const-string v6, "networkResponse"

    .line 1484
    .line 1485
    invoke-static {v6, v5}, Lg1/B;->b(Ljava/lang/String;Lg1/C;)V

    .line 1486
    .line 1487
    .line 1488
    :cond_3e
    iput-object v5, v0, Lg1/B;->h:Lg1/C;

    .line 1489
    .line 1490
    invoke-virtual {v0}, Lg1/B;->a()Lg1/C;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v0

    .line 1494
    iget-object v2, v2, Lg1/C;->g:Lg1/E;

    .line 1495
    .line 1496
    invoke-virtual {v2}, Lg1/E;->close()V

    .line 1497
    .line 1498
    .line 1499
    iget-object v2, v3, Li1/b;->b:Ljava/lang/Object;

    .line 1500
    .line 1501
    check-cast v2, LA/b;

    .line 1502
    .line 1503
    invoke-virtual {v2}, LA/b;->E()V

    .line 1504
    .line 1505
    .line 1506
    iget-object v2, v3, Li1/b;->b:Ljava/lang/Object;

    .line 1507
    .line 1508
    check-cast v2, LA/b;

    .line 1509
    .line 1510
    iget-object v2, v2, LA/b;->g:Ljava/lang/Object;

    .line 1511
    .line 1512
    check-cast v2, Lg1/h;

    .line 1513
    .line 1514
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1515
    .line 1516
    .line 1517
    new-instance v2, Lg1/g;

    .line 1518
    .line 1519
    invoke-direct {v2, v0}, Lg1/g;-><init>(Lg1/C;)V

    .line 1520
    .line 1521
    .line 1522
    iget-object v1, v1, Lg1/C;->g:Lg1/E;

    .line 1523
    .line 1524
    check-cast v1, Lg1/f;

    .line 1525
    .line 1526
    iget-object v1, v1, Lg1/f;->a:Li1/f;

    .line 1527
    .line 1528
    :try_start_4
    iget-object v5, v1, Li1/f;->a:Ljava/lang/String;

    .line 1529
    .line 1530
    iget-wide v6, v1, Li1/f;->b:J

    .line 1531
    .line 1532
    iget-object v1, v1, Li1/f;->d:Li1/g;

    .line 1533
    .line 1534
    invoke-virtual {v1, v5, v6, v7}, Li1/g;->h(Ljava/lang/String;J)Li1/d;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4

    .line 1538
    if-eqz v1, :cond_4c

    .line 1539
    .line 1540
    :try_start_5
    invoke-virtual {v2, v1}, Lg1/g;->c(Li1/d;)V

    .line 1541
    .line 1542
    .line 1543
    invoke-virtual {v1}, Li1/d;->b()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 1544
    .line 1545
    .line 1546
    goto/16 :goto_21

    .line 1547
    .line 1548
    :catch_3
    nop

    .line 1549
    goto :goto_1d

    .line 1550
    :catch_4
    nop

    .line 1551
    move-object v1, v4

    .line 1552
    :goto_1d
    if-eqz v1, :cond_4c

    .line 1553
    .line 1554
    :try_start_6
    invoke-virtual {v1}, Li1/d;->a()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_9

    .line 1555
    .line 1556
    .line 1557
    goto/16 :goto_21

    .line 1558
    .line 1559
    :cond_3f
    iget-object v5, v1, Lg1/C;->g:Lg1/E;

    .line 1560
    .line 1561
    invoke-static {v5}, Lh1/c;->c(Ljava/io/Closeable;)V

    .line 1562
    .line 1563
    .line 1564
    :cond_40
    invoke-virtual {v2}, Lg1/C;->h()Lg1/B;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v5

    .line 1568
    invoke-static {v1}, Li1/b;->d(Lg1/C;)Lg1/C;

    .line 1569
    .line 1570
    .line 1571
    move-result-object v1

    .line 1572
    if-eqz v1, :cond_41

    .line 1573
    .line 1574
    const-string v6, "cacheResponse"

    .line 1575
    .line 1576
    invoke-static {v6, v1}, Lg1/B;->b(Ljava/lang/String;Lg1/C;)V

    .line 1577
    .line 1578
    .line 1579
    :cond_41
    iput-object v1, v5, Lg1/B;->i:Lg1/C;

    .line 1580
    .line 1581
    invoke-static {v2}, Li1/b;->d(Lg1/C;)Lg1/C;

    .line 1582
    .line 1583
    .line 1584
    move-result-object v1

    .line 1585
    if-eqz v1, :cond_42

    .line 1586
    .line 1587
    const-string v2, "networkResponse"

    .line 1588
    .line 1589
    invoke-static {v2, v1}, Lg1/B;->b(Ljava/lang/String;Lg1/C;)V

    .line 1590
    .line 1591
    .line 1592
    :cond_42
    iput-object v1, v5, Lg1/B;->h:Lg1/C;

    .line 1593
    .line 1594
    invoke-virtual {v5}, Lg1/B;->a()Lg1/C;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v1

    .line 1598
    iget-object v2, v3, Li1/b;->b:Ljava/lang/Object;

    .line 1599
    .line 1600
    check-cast v2, LA/b;

    .line 1601
    .line 1602
    if-eqz v2, :cond_4b

    .line 1603
    .line 1604
    invoke-static {v1}, Lk1/d;->b(Lg1/C;)Z

    .line 1605
    .line 1606
    .line 1607
    move-result v2

    .line 1608
    if-eqz v2, :cond_4a

    .line 1609
    .line 1610
    invoke-static {v1, v0}, LE/j;->A(Lg1/C;Lg1/A;)Z

    .line 1611
    .line 1612
    .line 1613
    move-result v2

    .line 1614
    if-eqz v2, :cond_4a

    .line 1615
    .line 1616
    iget-object v0, v3, Li1/b;->b:Ljava/lang/Object;

    .line 1617
    .line 1618
    check-cast v0, LA/b;

    .line 1619
    .line 1620
    iget-object v0, v0, LA/b;->g:Ljava/lang/Object;

    .line 1621
    .line 1622
    check-cast v0, Lg1/h;

    .line 1623
    .line 1624
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1625
    .line 1626
    .line 1627
    iget-object v2, v1, Lg1/C;->a:Lg1/A;

    .line 1628
    .line 1629
    iget-object v2, v2, Lg1/A;->b:Ljava/lang/String;

    .line 1630
    .line 1631
    invoke-static {v2}, LT0/g;->t(Ljava/lang/String;)Z

    .line 1632
    .line 1633
    .line 1634
    move-result v5

    .line 1635
    iget-object v6, v1, Lg1/C;->a:Lg1/A;

    .line 1636
    .line 1637
    if-eqz v5, :cond_43

    .line 1638
    .line 1639
    :try_start_7
    invoke-virtual {v0, v6}, Lg1/h;->g(Lg1/A;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    .line 1640
    .line 1641
    .line 1642
    goto :goto_1f

    .line 1643
    :catch_5
    nop

    .line 1644
    goto :goto_1f

    .line 1645
    :cond_43
    const-string v5, "GET"

    .line 1646
    .line 1647
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1648
    .line 1649
    .line 1650
    move-result v2

    .line 1651
    if-nez v2, :cond_44

    .line 1652
    .line 1653
    goto :goto_1f

    .line 1654
    :cond_44
    iget-object v2, v1, Lg1/C;->f:Lg1/s;

    .line 1655
    .line 1656
    invoke-static {v2}, Lk1/d;->f(Lg1/s;)Ljava/util/Set;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v2

    .line 1660
    const-string v5, "*"

    .line 1661
    .line 1662
    invoke-interface {v2, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1663
    .line 1664
    .line 1665
    move-result v2

    .line 1666
    if-eqz v2, :cond_45

    .line 1667
    .line 1668
    goto :goto_1f

    .line 1669
    :cond_45
    new-instance v2, Lg1/g;

    .line 1670
    .line 1671
    invoke-direct {v2, v1}, Lg1/g;-><init>(Lg1/C;)V

    .line 1672
    .line 1673
    .line 1674
    :try_start_8
    iget-object v5, v0, Lg1/h;->b:Li1/g;

    .line 1675
    .line 1676
    iget-object v6, v6, Lg1/A;->a:Lg1/u;

    .line 1677
    .line 1678
    iget-object v6, v6, Lg1/u;->h:Ljava/lang/String;

    .line 1679
    .line 1680
    invoke-static {v6}, Lr1/h;->f(Ljava/lang/String;)Lr1/h;

    .line 1681
    .line 1682
    .line 1683
    move-result-object v6

    .line 1684
    const-string v7, "MD5"

    .line 1685
    .line 1686
    invoke-virtual {v6, v7}, Lr1/h;->e(Ljava/lang/String;)Lr1/h;

    .line 1687
    .line 1688
    .line 1689
    move-result-object v6

    .line 1690
    invoke-virtual {v6}, Lr1/h;->h()Ljava/lang/String;

    .line 1691
    .line 1692
    .line 1693
    move-result-object v6

    .line 1694
    const-wide/16 v7, -0x1

    .line 1695
    .line 1696
    invoke-virtual {v5, v6, v7, v8}, Li1/g;->h(Ljava/lang/String;J)Li1/d;

    .line 1697
    .line 1698
    .line 1699
    move-result-object v5
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_7

    .line 1700
    if-nez v5, :cond_46

    .line 1701
    .line 1702
    goto :goto_1f

    .line 1703
    :cond_46
    :try_start_9
    invoke-virtual {v2, v5}, Lg1/g;->c(Li1/d;)V

    .line 1704
    .line 1705
    .line 1706
    new-instance v2, Lg1/d;

    .line 1707
    .line 1708
    invoke-direct {v2, v0, v5}, Lg1/d;-><init>(Lg1/h;Li1/d;)V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_6

    .line 1709
    .line 1710
    .line 1711
    move-object v4, v2

    .line 1712
    goto :goto_1f

    .line 1713
    :catch_6
    nop

    .line 1714
    goto :goto_1e

    .line 1715
    :catch_7
    nop

    .line 1716
    move-object v5, v4

    .line 1717
    :goto_1e
    if-eqz v5, :cond_47

    .line 1718
    .line 1719
    :try_start_a
    invoke-virtual {v5}, Li1/d;->a()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_5

    .line 1720
    .line 1721
    .line 1722
    :cond_47
    :goto_1f
    if-nez v4, :cond_48

    .line 1723
    .line 1724
    goto :goto_20

    .line 1725
    :cond_48
    iget-object v0, v4, Lg1/d;->c:Lg1/c;

    .line 1726
    .line 1727
    if-nez v0, :cond_49

    .line 1728
    .line 1729
    goto :goto_20

    .line 1730
    :cond_49
    iget-object v2, v1, Lg1/C;->g:Lg1/E;

    .line 1731
    .line 1732
    invoke-virtual {v2}, Lg1/E;->g()Lr1/g;

    .line 1733
    .line 1734
    .line 1735
    move-result-object v2

    .line 1736
    sget-object v5, Lr1/o;->a:Ljava/util/logging/Logger;

    .line 1737
    .line 1738
    new-instance v5, Lr1/p;

    .line 1739
    .line 1740
    invoke-direct {v5, v0}, Lr1/p;-><init>(Lr1/u;)V

    .line 1741
    .line 1742
    .line 1743
    new-instance v0, Li1/a;

    .line 1744
    .line 1745
    invoke-direct {v0, v2, v4, v5}, Li1/a;-><init>(Lr1/g;Lg1/d;Lr1/p;)V

    .line 1746
    .line 1747
    .line 1748
    const-string v2, "Content-Type"

    .line 1749
    .line 1750
    invoke-virtual {v1, v2}, Lg1/C;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 1751
    .line 1752
    .line 1753
    iget-object v2, v1, Lg1/C;->g:Lg1/E;

    .line 1754
    .line 1755
    invoke-virtual {v2}, Lg1/E;->f()J

    .line 1756
    .line 1757
    .line 1758
    move-result-wide v4

    .line 1759
    invoke-virtual {v1}, Lg1/C;->h()Lg1/B;

    .line 1760
    .line 1761
    .line 1762
    move-result-object v1

    .line 1763
    new-instance v2, Lg1/D;

    .line 1764
    .line 1765
    new-instance v6, Lr1/q;

    .line 1766
    .line 1767
    invoke-direct {v6, v0}, Lr1/q;-><init>(Lr1/v;)V

    .line 1768
    .line 1769
    .line 1770
    const/4 v0, 0x1

    .line 1771
    invoke-direct {v2, v4, v5, v6, v0}, Lg1/D;-><init>(JLr1/g;I)V

    .line 1772
    .line 1773
    .line 1774
    iput-object v2, v1, Lg1/B;->g:Lg1/E;

    .line 1775
    .line 1776
    invoke-virtual {v1}, Lg1/B;->a()Lg1/C;

    .line 1777
    .line 1778
    .line 1779
    move-result-object v0

    .line 1780
    goto :goto_21

    .line 1781
    :cond_4a
    iget-object v2, v0, Lg1/A;->b:Ljava/lang/String;

    .line 1782
    .line 1783
    invoke-static {v2}, LT0/g;->t(Ljava/lang/String;)Z

    .line 1784
    .line 1785
    .line 1786
    move-result v2

    .line 1787
    if-eqz v2, :cond_4b

    .line 1788
    .line 1789
    :try_start_b
    iget-object v2, v3, Li1/b;->b:Ljava/lang/Object;

    .line 1790
    .line 1791
    check-cast v2, LA/b;

    .line 1792
    .line 1793
    iget-object v2, v2, LA/b;->g:Ljava/lang/Object;

    .line 1794
    .line 1795
    check-cast v2, Lg1/h;

    .line 1796
    .line 1797
    invoke-virtual {v2, v0}, Lg1/h;->g(Lg1/A;)V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_8

    .line 1798
    .line 1799
    .line 1800
    :catch_8
    :cond_4b
    :goto_20
    move-object v0, v1

    .line 1801
    :catch_9
    :cond_4c
    :goto_21
    return-object v0

    .line 1802
    :catchall_0
    move-exception v0

    .line 1803
    move-object v1, v0

    .line 1804
    if-eqz v2, :cond_4d

    .line 1805
    .line 1806
    iget-object v0, v2, Lg1/C;->g:Lg1/E;

    .line 1807
    .line 1808
    invoke-static {v0}, Lh1/c;->c(Ljava/io/Closeable;)V

    .line 1809
    .line 1810
    .line 1811
    :cond_4d
    throw v1

    .line 1812
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
