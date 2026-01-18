.class public final Lj1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lg1/a;

.field public final b:Lj0/w;

.field public final c:Lg1/b;

.field public final d:Ljava/util/List;

.field public e:I

.field public f:Ljava/util/List;

.field public final g:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lg1/a;Lj0/w;Lg1/z;Lg1/b;)V
    .locals 1

    .line 1
    const/4 p3, 0x0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    .line 4
    .line 5
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lj1/d;->d:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lj1/d;->f:Ljava/util/List;

    .line 16
    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lj1/d;->g:Ljava/util/ArrayList;

    .line 23
    .line 24
    iput-object p1, p0, Lj1/d;->a:Lg1/a;

    .line 25
    .line 26
    iput-object p2, p0, Lj1/d;->b:Lj0/w;

    .line 27
    .line 28
    iput-object p4, p0, Lj1/d;->c:Lg1/b;

    .line 29
    .line 30
    iget-object p2, p1, Lg1/a;->a:Lg1/u;

    .line 31
    .line 32
    invoke-virtual {p2}, Lg1/u;->l()Ljava/net/URI;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    iget-object p1, p1, Lg1/a;->g:Ljava/net/ProxySelector;

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Ljava/net/ProxySelector;->select(Ljava/net/URI;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-nez p2, :cond_0

    .line 49
    .line 50
    invoke-static {p1}, Lh1/c;->k(Ljava/util/List;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const/4 p1, 0x1

    .line 56
    new-array p1, p1, [Ljava/net/Proxy;

    .line 57
    .line 58
    sget-object p2, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    .line 59
    .line 60
    aput-object p2, p1, p3

    .line 61
    .line 62
    invoke-static {p1}, Lh1/c;->l([Ljava/lang/Object;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    :goto_0
    iput-object p1, p0, Lj1/d;->d:Ljava/util/List;

    .line 67
    .line 68
    iput p3, p0, Lj1/d;->e:I

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final a(Lg1/F;Ljava/io/IOException;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lg1/F;->b:Ljava/net/Proxy;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lj1/d;->a:Lg1/a;

    .line 12
    .line 13
    iget-object v1, v0, Lg1/a;->g:Ljava/net/ProxySelector;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v0, v0, Lg1/a;->a:Lg1/u;

    .line 18
    .line 19
    invoke-virtual {v0}, Lg1/u;->l()Ljava/net/URI;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v2, p1, Lg1/F;->b:Ljava/net/Proxy;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v0, v2, p2}, Ljava/net/ProxySelector;->connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-object p2, p0, Lj1/d;->b:Lj0/w;

    .line 33
    .line 34
    monitor-enter p2

    .line 35
    :try_start_0
    iget-object v0, p2, Lj0/w;->f:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Ljava/util/LinkedHashSet;

    .line 38
    .line 39
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    monitor-exit p2

    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    throw p1
.end method

.method public final b()LK/j;
    .locals 10

    .line 1
    iget v0, p0, Lj1/d;->e:I

    .line 2
    .line 3
    iget-object v1, p0, Lj1/d;->d:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lj1/d;->g:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_11

    .line 19
    .line 20
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    :cond_1
    iget v1, p0, Lj1/d;->e:I

    .line 26
    .line 27
    iget-object v2, p0, Lj1/d;->d:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-ge v1, v2, :cond_f

    .line 34
    .line 35
    iget v1, p0, Lj1/d;->e:I

    .line 36
    .line 37
    iget-object v2, p0, Lj1/d;->d:Ljava/util/List;

    .line 38
    .line 39
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/4 v3, 0x0

    .line 44
    const/4 v4, 0x1

    .line 45
    if-ge v1, v2, :cond_2

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    const/4 v1, 0x0

    .line 50
    :goto_1
    iget-object v2, p0, Lj1/d;->a:Lg1/a;

    .line 51
    .line 52
    const-string v5, "No route to "

    .line 53
    .line 54
    if-eqz v1, :cond_e

    .line 55
    .line 56
    iget-object v1, p0, Lj1/d;->d:Ljava/util/List;

    .line 57
    .line 58
    iget v6, p0, Lj1/d;->e:I

    .line 59
    .line 60
    add-int/lit8 v7, v6, 0x1

    .line 61
    .line 62
    iput v7, p0, Lj1/d;->e:I

    .line 63
    .line 64
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, Ljava/net/Proxy;

    .line 69
    .line 70
    new-instance v6, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object v6, p0, Lj1/d;->f:Ljava/util/List;

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    sget-object v7, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 82
    .line 83
    if-eq v6, v7, :cond_6

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    sget-object v7, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    .line 90
    .line 91
    if-ne v6, v7, :cond_3

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_3
    invoke-virtual {v1}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    instance-of v7, v6, Ljava/net/InetSocketAddress;

    .line 99
    .line 100
    if-eqz v7, :cond_5

    .line 101
    .line 102
    check-cast v6, Ljava/net/InetSocketAddress;

    .line 103
    .line 104
    invoke-virtual {v6}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    if-nez v7, :cond_4

    .line 109
    .line 110
    invoke-virtual {v6}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    goto :goto_2

    .line 115
    :cond_4
    invoke-virtual {v7}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    :goto_2
    invoke-virtual {v6}, Ljava/net/InetSocketAddress;->getPort()I

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    goto :goto_4

    .line 124
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 125
    .line 126
    new-instance v1, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    const-string v2, "Proxy.address() is not an InetSocketAddress: "

    .line 129
    .line 130
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw v0

    .line 148
    :cond_6
    :goto_3
    iget-object v6, v2, Lg1/a;->a:Lg1/u;

    .line 149
    .line 150
    iget-object v7, v6, Lg1/u;->d:Ljava/lang/String;

    .line 151
    .line 152
    iget v6, v6, Lg1/u;->e:I

    .line 153
    .line 154
    :goto_4
    if-lt v6, v4, :cond_d

    .line 155
    .line 156
    const v4, 0xffff

    .line 157
    .line 158
    .line 159
    if-gt v6, v4, :cond_d

    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    sget-object v5, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    .line 166
    .line 167
    if-ne v4, v5, :cond_7

    .line 168
    .line 169
    iget-object v2, p0, Lj1/d;->f:Ljava/util/List;

    .line 170
    .line 171
    invoke-static {v7, v6}, Ljava/net/InetSocketAddress;->createUnresolved(Ljava/lang/String;I)Ljava/net/InetSocketAddress;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    goto :goto_6

    .line 179
    :cond_7
    iget-object v4, p0, Lj1/d;->c:Lg1/b;

    .line 180
    .line 181
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    iget-object v4, v2, Lg1/a;->b:Lg1/b;

    .line 185
    .line 186
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    if-eqz v7, :cond_c

    .line 190
    .line 191
    :try_start_0
    invoke-static {v7}, Ljava/net/InetAddress;->getAllByName(Ljava/lang/String;)[Ljava/net/InetAddress;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 196
    .line 197
    .line 198
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 199
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    if-nez v5, :cond_b

    .line 204
    .line 205
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    const/4 v5, 0x0

    .line 210
    :goto_5
    if-ge v5, v2, :cond_8

    .line 211
    .line 212
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v7

    .line 216
    check-cast v7, Ljava/net/InetAddress;

    .line 217
    .line 218
    iget-object v8, p0, Lj1/d;->f:Ljava/util/List;

    .line 219
    .line 220
    new-instance v9, Ljava/net/InetSocketAddress;

    .line 221
    .line 222
    invoke-direct {v9, v7, v6}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 223
    .line 224
    .line 225
    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    add-int/lit8 v5, v5, 0x1

    .line 229
    .line 230
    goto :goto_5

    .line 231
    :cond_8
    :goto_6
    iget-object v2, p0, Lj1/d;->f:Ljava/util/List;

    .line 232
    .line 233
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    :goto_7
    if-ge v3, v2, :cond_a

    .line 238
    .line 239
    new-instance v4, Lg1/F;

    .line 240
    .line 241
    iget-object v5, p0, Lj1/d;->a:Lg1/a;

    .line 242
    .line 243
    iget-object v6, p0, Lj1/d;->f:Ljava/util/List;

    .line 244
    .line 245
    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    check-cast v6, Ljava/net/InetSocketAddress;

    .line 250
    .line 251
    invoke-direct {v4, v5, v1, v6}, Lg1/F;-><init>(Lg1/a;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V

    .line 252
    .line 253
    .line 254
    iget-object v5, p0, Lj1/d;->b:Lj0/w;

    .line 255
    .line 256
    monitor-enter v5

    .line 257
    :try_start_1
    iget-object v6, v5, Lj0/w;->f:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v6, Ljava/util/LinkedHashSet;

    .line 260
    .line 261
    invoke-interface {v6, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 265
    monitor-exit v5

    .line 266
    if-eqz v6, :cond_9

    .line 267
    .line 268
    iget-object v5, p0, Lj1/d;->g:Ljava/util/ArrayList;

    .line 269
    .line 270
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    goto :goto_8

    .line 274
    :cond_9
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    :goto_8
    add-int/lit8 v3, v3, 0x1

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :catchall_0
    move-exception v0

    .line 281
    :try_start_2
    monitor-exit v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 282
    throw v0

    .line 283
    :cond_a
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    if-nez v1, :cond_1

    .line 288
    .line 289
    goto :goto_9

    .line 290
    :cond_b
    new-instance v0, Ljava/net/UnknownHostException;

    .line 291
    .line 292
    new-instance v1, Ljava/lang/StringBuilder;

    .line 293
    .line 294
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 295
    .line 296
    .line 297
    iget-object v2, v2, Lg1/a;->b:Lg1/b;

    .line 298
    .line 299
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    const-string v2, " returned no addresses for "

    .line 303
    .line 304
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    invoke-direct {v0, v1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    throw v0

    .line 318
    :catch_0
    move-exception v0

    .line 319
    new-instance v1, Ljava/net/UnknownHostException;

    .line 320
    .line 321
    const-string v2, "Broken system behaviour for dns lookup of "

    .line 322
    .line 323
    invoke-virtual {v2, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    invoke-direct {v1, v2}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 331
    .line 332
    .line 333
    throw v1

    .line 334
    :cond_c
    new-instance v0, Ljava/net/UnknownHostException;

    .line 335
    .line 336
    const-string v1, "hostname == null"

    .line 337
    .line 338
    invoke-direct {v0, v1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    throw v0

    .line 342
    :cond_d
    new-instance v0, Ljava/net/SocketException;

    .line 343
    .line 344
    new-instance v1, Ljava/lang/StringBuilder;

    .line 345
    .line 346
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    const-string v2, ":"

    .line 353
    .line 354
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    const-string v2, "; port is out of range"

    .line 361
    .line 362
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    invoke-direct {v0, v1}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    throw v0

    .line 373
    :cond_e
    new-instance v0, Ljava/net/SocketException;

    .line 374
    .line 375
    new-instance v1, Ljava/lang/StringBuilder;

    .line 376
    .line 377
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    iget-object v2, v2, Lg1/a;->a:Lg1/u;

    .line 381
    .line 382
    iget-object v2, v2, Lg1/u;->d:Ljava/lang/String;

    .line 383
    .line 384
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    const-string v2, "; exhausted proxy configurations: "

    .line 388
    .line 389
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    iget-object v2, p0, Lj1/d;->d:Ljava/util/List;

    .line 393
    .line 394
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    invoke-direct {v0, v1}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    throw v0

    .line 405
    :cond_f
    :goto_9
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 406
    .line 407
    .line 408
    move-result v1

    .line 409
    if-eqz v1, :cond_10

    .line 410
    .line 411
    iget-object v1, p0, Lj1/d;->g:Ljava/util/ArrayList;

    .line 412
    .line 413
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 414
    .line 415
    .line 416
    iget-object v1, p0, Lj1/d;->g:Ljava/util/ArrayList;

    .line 417
    .line 418
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 419
    .line 420
    .line 421
    :cond_10
    new-instance v1, LK/j;

    .line 422
    .line 423
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 424
    .line 425
    .line 426
    const/4 v2, 0x0

    .line 427
    iput v2, v1, LK/j;->f:I

    .line 428
    .line 429
    iput-object v0, v1, LK/j;->g:Ljava/lang/Object;

    .line 430
    .line 431
    return-object v1

    .line 432
    :cond_11
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 433
    .line 434
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 435
    .line 436
    .line 437
    throw v0
.end method
