.class public final Lj1/b;
.super Lm1/o;
.source "SourceFile"


# instance fields
.field public final b:Lg1/n;

.field public final c:Lg1/F;

.field public d:Ljava/net/Socket;

.field public e:Ljava/net/Socket;

.field public f:Lg1/r;

.field public g:Lg1/y;

.field public h:Lm1/s;

.field public i:Lr1/q;

.field public j:Lr1/p;

.field public k:Z

.field public l:I

.field public m:I

.field public final n:Ljava/util/ArrayList;

.field public o:J


# direct methods
.method public constructor <init>(Lg1/n;Lg1/F;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput v0, p0, Lj1/b;->m:I

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lj1/b;->n:Ljava/util/ArrayList;

    .line 13
    .line 14
    const-wide v0, 0x7fffffffffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    iput-wide v0, p0, Lj1/b;->o:J

    .line 20
    .line 21
    iput-object p1, p0, Lj1/b;->b:Lg1/n;

    .line 22
    .line 23
    iput-object p2, p0, Lj1/b;->c:Lg1/F;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(Lm1/s;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lj1/b;->b:Lg1/n;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p1}, Lm1/s;->i()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iput p1, p0, Lj1/b;->m:I

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw p1
.end method

.method public final b(Lm1/y;)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-virtual {p1, v0}, Lm1/y;->c(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final c(IIIZLg1/b;)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, Lj1/b;->g:Lg1/y;

    .line 4
    .line 5
    if-nez v2, :cond_e

    .line 6
    .line 7
    iget-object v2, p0, Lj1/b;->c:Lg1/F;

    .line 8
    .line 9
    iget-object v2, v2, Lg1/F;->a:Lg1/a;

    .line 10
    .line 11
    iget-object v3, v2, Lg1/a;->f:Ljava/util/List;

    .line 12
    .line 13
    new-instance v4, Lj1/a;

    .line 14
    .line 15
    invoke-direct {v4, v3}, Lj1/a;-><init>(Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    iget-object v2, v2, Lg1/a;->h:Ljavax/net/ssl/SSLSocketFactory;

    .line 19
    .line 20
    if-nez v2, :cond_2

    .line 21
    .line 22
    sget-object v2, Lg1/p;->f:Lg1/p;

    .line 23
    .line 24
    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    iget-object v2, p0, Lj1/b;->c:Lg1/F;

    .line 31
    .line 32
    iget-object v2, v2, Lg1/F;->a:Lg1/a;

    .line 33
    .line 34
    iget-object v2, v2, Lg1/a;->a:Lg1/u;

    .line 35
    .line 36
    iget-object v2, v2, Lg1/u;->d:Ljava/lang/String;

    .line 37
    .line 38
    sget-object v3, Lo1/g;->a:Lo1/g;

    .line 39
    .line 40
    invoke-virtual {v3, v2}, Lo1/g;->j(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    new-instance p1, Lj1/c;

    .line 48
    .line 49
    new-instance p2, Ljava/net/UnknownServiceException;

    .line 50
    .line 51
    const-string p3, "CLEARTEXT communication to "

    .line 52
    .line 53
    const-string p4, " not permitted by network security policy"

    .line 54
    .line 55
    invoke-static {p3, v2, p4}, LQ0/E;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    invoke-direct {p2, p3}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-direct {p1, p2}, Lj1/c;-><init>(Ljava/io/IOException;)V

    .line 63
    .line 64
    .line 65
    throw p1

    .line 66
    :cond_1
    new-instance p1, Lj1/c;

    .line 67
    .line 68
    new-instance p2, Ljava/net/UnknownServiceException;

    .line 69
    .line 70
    const-string p3, "CLEARTEXT communication not enabled for client"

    .line 71
    .line 72
    invoke-direct {p2, p3}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-direct {p1, p2}, Lj1/c;-><init>(Ljava/io/IOException;)V

    .line 76
    .line 77
    .line 78
    throw p1

    .line 79
    :cond_2
    :goto_0
    const/4 v2, 0x0

    .line 80
    move-object v3, v2

    .line 81
    :cond_3
    :goto_1
    :try_start_0
    iget-object v5, p0, Lj1/b;->c:Lg1/F;

    .line 82
    .line 83
    iget-object v6, v5, Lg1/F;->a:Lg1/a;

    .line 84
    .line 85
    iget-object v6, v6, Lg1/a;->h:Ljavax/net/ssl/SSLSocketFactory;

    .line 86
    .line 87
    if-eqz v6, :cond_4

    .line 88
    .line 89
    iget-object v5, v5, Lg1/F;->b:Ljava/net/Proxy;

    .line 90
    .line 91
    invoke-virtual {v5}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    sget-object v6, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 96
    .line 97
    if-ne v5, v6, :cond_4

    .line 98
    .line 99
    const/4 v5, 0x1

    .line 100
    goto :goto_2

    .line 101
    :cond_4
    const/4 v5, 0x0

    .line 102
    :goto_2
    if-eqz v5, :cond_5

    .line 103
    .line 104
    invoke-virtual {p0, p1, p2, p3, p5}, Lj1/b;->e(IIILg1/b;)V

    .line 105
    .line 106
    .line 107
    iget-object v5, p0, Lj1/b;->d:Ljava/net/Socket;

    .line 108
    .line 109
    if-nez v5, :cond_6

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :catch_0
    move-exception v5

    .line 113
    goto :goto_6

    .line 114
    :cond_5
    invoke-virtual {p0, p1, p2, p5}, Lj1/b;->d(IILg1/b;)V

    .line 115
    .line 116
    .line 117
    :cond_6
    invoke-virtual {p0, v4, p5}, Lj1/b;->f(Lj1/a;Lg1/b;)V

    .line 118
    .line 119
    .line 120
    iget-object v5, p0, Lj1/b;->c:Lg1/F;

    .line 121
    .line 122
    iget-object v5, v5, Lg1/F;->c:Ljava/net/InetSocketAddress;

    .line 123
    .line 124
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 125
    .line 126
    .line 127
    :goto_3
    iget-object p1, p0, Lj1/b;->c:Lg1/F;

    .line 128
    .line 129
    iget-object p2, p1, Lg1/F;->a:Lg1/a;

    .line 130
    .line 131
    iget-object p2, p2, Lg1/a;->h:Ljavax/net/ssl/SSLSocketFactory;

    .line 132
    .line 133
    if-eqz p2, :cond_8

    .line 134
    .line 135
    iget-object p1, p1, Lg1/F;->b:Ljava/net/Proxy;

    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    sget-object p2, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 142
    .line 143
    if-ne p1, p2, :cond_8

    .line 144
    .line 145
    iget-object p1, p0, Lj1/b;->d:Ljava/net/Socket;

    .line 146
    .line 147
    if-eqz p1, :cond_7

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_7
    new-instance p1, Ljava/net/ProtocolException;

    .line 151
    .line 152
    const-string p2, "Too many tunnel connections attempted: 21"

    .line 153
    .line 154
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    new-instance p2, Lj1/c;

    .line 158
    .line 159
    invoke-direct {p2, p1}, Lj1/c;-><init>(Ljava/io/IOException;)V

    .line 160
    .line 161
    .line 162
    throw p2

    .line 163
    :cond_8
    :goto_4
    iget-object p1, p0, Lj1/b;->h:Lm1/s;

    .line 164
    .line 165
    if-eqz p1, :cond_9

    .line 166
    .line 167
    iget-object p1, p0, Lj1/b;->b:Lg1/n;

    .line 168
    .line 169
    monitor-enter p1

    .line 170
    :try_start_1
    iget-object p2, p0, Lj1/b;->h:Lm1/s;

    .line 171
    .line 172
    invoke-virtual {p2}, Lm1/s;->i()I

    .line 173
    .line 174
    .line 175
    move-result p2

    .line 176
    iput p2, p0, Lj1/b;->m:I

    .line 177
    .line 178
    monitor-exit p1

    .line 179
    goto :goto_5

    .line 180
    :catchall_0
    move-exception p2

    .line 181
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 182
    throw p2

    .line 183
    :cond_9
    :goto_5
    return-void

    .line 184
    :goto_6
    iget-object v6, p0, Lj1/b;->e:Ljava/net/Socket;

    .line 185
    .line 186
    invoke-static {v6}, Lh1/c;->d(Ljava/net/Socket;)V

    .line 187
    .line 188
    .line 189
    iget-object v6, p0, Lj1/b;->d:Ljava/net/Socket;

    .line 190
    .line 191
    invoke-static {v6}, Lh1/c;->d(Ljava/net/Socket;)V

    .line 192
    .line 193
    .line 194
    iput-object v2, p0, Lj1/b;->e:Ljava/net/Socket;

    .line 195
    .line 196
    iput-object v2, p0, Lj1/b;->d:Ljava/net/Socket;

    .line 197
    .line 198
    iput-object v2, p0, Lj1/b;->i:Lr1/q;

    .line 199
    .line 200
    iput-object v2, p0, Lj1/b;->j:Lr1/p;

    .line 201
    .line 202
    iput-object v2, p0, Lj1/b;->f:Lg1/r;

    .line 203
    .line 204
    iput-object v2, p0, Lj1/b;->g:Lg1/y;

    .line 205
    .line 206
    iput-object v2, p0, Lj1/b;->h:Lm1/s;

    .line 207
    .line 208
    iget-object v6, p0, Lj1/b;->c:Lg1/F;

    .line 209
    .line 210
    iget-object v6, v6, Lg1/F;->c:Ljava/net/InetSocketAddress;

    .line 211
    .line 212
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    if-nez v3, :cond_a

    .line 216
    .line 217
    new-instance v3, Lj1/c;

    .line 218
    .line 219
    invoke-direct {v3, v5}, Lj1/c;-><init>(Ljava/io/IOException;)V

    .line 220
    .line 221
    .line 222
    goto :goto_7

    .line 223
    :cond_a
    iget-object v6, v3, Lj1/c;->a:Ljava/io/IOException;

    .line 224
    .line 225
    sget-object v7, Lj1/c;->b:Ljava/lang/reflect/Method;

    .line 226
    .line 227
    if-eqz v7, :cond_b

    .line 228
    .line 229
    :try_start_2
    new-array v8, v1, [Ljava/lang/Object;

    .line 230
    .line 231
    aput-object v6, v8, v0

    .line 232
    .line 233
    invoke-virtual {v7, v5, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_1

    .line 234
    .line 235
    .line 236
    :catch_1
    :cond_b
    iput-object v5, v3, Lj1/c;->a:Ljava/io/IOException;

    .line 237
    .line 238
    :goto_7
    if-eqz p4, :cond_d

    .line 239
    .line 240
    iput-boolean v1, v4, Lj1/a;->d:Z

    .line 241
    .line 242
    iget-boolean v6, v4, Lj1/a;->c:Z

    .line 243
    .line 244
    if-eqz v6, :cond_d

    .line 245
    .line 246
    instance-of v6, v5, Ljava/net/ProtocolException;

    .line 247
    .line 248
    if-nez v6, :cond_d

    .line 249
    .line 250
    instance-of v6, v5, Ljava/io/InterruptedIOException;

    .line 251
    .line 252
    if-nez v6, :cond_d

    .line 253
    .line 254
    instance-of v6, v5, Ljavax/net/ssl/SSLHandshakeException;

    .line 255
    .line 256
    if-eqz v6, :cond_c

    .line 257
    .line 258
    invoke-virtual {v5}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 259
    .line 260
    .line 261
    move-result-object v7

    .line 262
    instance-of v7, v7, Ljava/security/cert/CertificateException;

    .line 263
    .line 264
    if-nez v7, :cond_d

    .line 265
    .line 266
    :cond_c
    instance-of v7, v5, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 267
    .line 268
    if-nez v7, :cond_d

    .line 269
    .line 270
    if-nez v6, :cond_3

    .line 271
    .line 272
    instance-of v5, v5, Ljavax/net/ssl/SSLProtocolException;

    .line 273
    .line 274
    if-eqz v5, :cond_d

    .line 275
    .line 276
    goto/16 :goto_1

    .line 277
    .line 278
    :cond_d
    throw v3

    .line 279
    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 280
    .line 281
    const-string p2, "already connected"

    .line 282
    .line 283
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    throw p1
.end method

.method public final d(IILg1/b;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lj1/b;->c:Lg1/F;

    .line 2
    .line 3
    iget-object v1, v0, Lg1/F;->b:Ljava/net/Proxy;

    .line 4
    .line 5
    iget-object v2, v0, Lg1/F;->c:Ljava/net/InetSocketAddress;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    sget-object v4, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 12
    .line 13
    if-eq v3, v4, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    sget-object v4, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 20
    .line 21
    if-ne v3, v4, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v0, Ljava/net/Socket;

    .line 25
    .line 26
    invoke-direct {v0, v1}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    iget-object v0, v0, Lg1/F;->a:Lg1/a;

    .line 31
    .line 32
    iget-object v0, v0, Lg1/a;->c:Ljavax/net/SocketFactory;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :goto_1
    iput-object v0, p0, Lj1/b;->d:Ljava/net/Socket;

    .line 39
    .line 40
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object p3, p0, Lj1/b;->d:Ljava/net/Socket;

    .line 44
    .line 45
    invoke-virtual {p3, p2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 46
    .line 47
    .line 48
    :try_start_0
    sget-object p2, Lo1/g;->a:Lo1/g;

    .line 49
    .line 50
    iget-object p3, p0, Lj1/b;->d:Ljava/net/Socket;

    .line 51
    .line 52
    invoke-virtual {p2, p3, v2, p1}, Lo1/g;->f(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_1

    .line 53
    .line 54
    .line 55
    :try_start_1
    iget-object p1, p0, Lj1/b;->d:Ljava/net/Socket;

    .line 56
    .line 57
    invoke-static {p1}, Lr1/o;->c(Ljava/net/Socket;)Lr1/b;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    new-instance p2, Lr1/q;

    .line 62
    .line 63
    invoke-direct {p2, p1}, Lr1/q;-><init>(Lr1/v;)V

    .line 64
    .line 65
    .line 66
    iput-object p2, p0, Lj1/b;->i:Lr1/q;

    .line 67
    .line 68
    iget-object p1, p0, Lj1/b;->d:Ljava/net/Socket;

    .line 69
    .line 70
    invoke-static {p1}, Lr1/o;->a(Ljava/net/Socket;)Lr1/a;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    new-instance p2, Lr1/p;

    .line 75
    .line 76
    invoke-direct {p2, p1}, Lr1/p;-><init>(Lr1/u;)V

    .line 77
    .line 78
    .line 79
    iput-object p2, p0, Lj1/b;->j:Lr1/p;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :catch_0
    move-exception p1

    .line 83
    const-string p2, "throw with null exception"

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p3

    .line 89
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    if-nez p2, :cond_2

    .line 94
    .line 95
    :goto_2
    return-void

    .line 96
    :cond_2
    new-instance p2, Ljava/io/IOException;

    .line 97
    .line 98
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    throw p2

    .line 102
    :catch_1
    move-exception p1

    .line 103
    new-instance p2, Ljava/net/ConnectException;

    .line 104
    .line 105
    new-instance p3, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    const-string v0, "Failed to connect to "

    .line 108
    .line 109
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p3

    .line 119
    invoke-direct {p2, p3}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 123
    .line 124
    .line 125
    throw p2
.end method

.method public final e(IIILg1/b;)V
    .locals 6

    .line 1
    new-instance v0, LA/k;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, LA/k;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lj1/b;->c:Lg1/F;

    .line 8
    .line 9
    iget-object v2, v1, Lg1/F;->a:Lg1/a;

    .line 10
    .line 11
    iget-object v2, v2, Lg1/a;->a:Lg1/u;

    .line 12
    .line 13
    if-eqz v2, :cond_4

    .line 14
    .line 15
    iput-object v2, v0, LA/k;->f:Ljava/lang/Object;

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-static {v2, v3}, Lh1/c;->j(Lg1/u;Z)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const-string v4, "Host"

    .line 23
    .line 24
    invoke-virtual {v0, v4, v2}, LA/k;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string v2, "Proxy-Connection"

    .line 28
    .line 29
    const-string v4, "Keep-Alive"

    .line 30
    .line 31
    invoke-virtual {v0, v2, v4}, LA/k;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v2, "User-Agent"

    .line 35
    .line 36
    const-string v4, "okhttp/3.10.0"

    .line 37
    .line 38
    invoke-virtual {v0, v2, v4}, LA/k;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, LA/k;->b()Lg1/A;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p0, p1, p2, p4}, Lj1/b;->d(IILg1/b;)V

    .line 46
    .line 47
    .line 48
    new-instance p1, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    const-string p4, "CONNECT "

    .line 51
    .line 52
    invoke-direct {p1, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iget-object p4, v0, Lg1/A;->a:Lg1/u;

    .line 56
    .line 57
    invoke-static {p4, v3}, Lh1/c;->j(Lg1/u;Z)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p4

    .line 61
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string p4, " HTTP/1.1"

    .line 65
    .line 66
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    new-instance p4, Ll1/g;

    .line 74
    .line 75
    iget-object v2, p0, Lj1/b;->i:Lr1/q;

    .line 76
    .line 77
    iget-object v3, p0, Lj1/b;->j:Lr1/p;

    .line 78
    .line 79
    const/4 v4, 0x0

    .line 80
    invoke-direct {p4, v4, v4, v2, v3}, Ll1/g;-><init>(Lg1/x;Lj1/f;Lr1/q;Lr1/p;)V

    .line 81
    .line 82
    .line 83
    iget-object v2, v2, Lr1/q;->b:Lr1/v;

    .line 84
    .line 85
    invoke-interface {v2}, Lr1/v;->a()Lr1/x;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    int-to-long v3, p2

    .line 90
    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 91
    .line 92
    invoke-virtual {v2, v3, v4, p2}, Lr1/x;->g(JLjava/util/concurrent/TimeUnit;)Lr1/x;

    .line 93
    .line 94
    .line 95
    iget-object v2, p0, Lj1/b;->j:Lr1/p;

    .line 96
    .line 97
    iget-object v2, v2, Lr1/p;->b:Lr1/u;

    .line 98
    .line 99
    invoke-interface {v2}, Lr1/u;->a()Lr1/x;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    int-to-long v3, p3

    .line 104
    invoke-virtual {v2, v3, v4, p2}, Lr1/x;->g(JLjava/util/concurrent/TimeUnit;)Lr1/x;

    .line 105
    .line 106
    .line 107
    iget-object p3, v0, Lg1/A;->c:Lg1/s;

    .line 108
    .line 109
    invoke-virtual {p4, p3, p1}, Ll1/g;->h(Lg1/s;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p4}, Ll1/g;->c()V

    .line 113
    .line 114
    .line 115
    const/4 p1, 0x0

    .line 116
    invoke-virtual {p4, p1}, Ll1/g;->f(Z)Lg1/B;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    iput-object v0, p1, Lg1/B;->a:Lg1/A;

    .line 121
    .line 122
    invoke-virtual {p1}, Lg1/B;->a()Lg1/C;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-static {p1}, Lk1/d;->a(Lg1/C;)J

    .line 127
    .line 128
    .line 129
    move-result-wide v2

    .line 130
    const-wide/16 v4, -0x1

    .line 131
    .line 132
    cmp-long p3, v2, v4

    .line 133
    .line 134
    if-nez p3, :cond_0

    .line 135
    .line 136
    const-wide/16 v2, 0x0

    .line 137
    .line 138
    :cond_0
    invoke-virtual {p4, v2, v3}, Ll1/g;->g(J)Ll1/e;

    .line 139
    .line 140
    .line 141
    move-result-object p3

    .line 142
    const p4, 0x7fffffff

    .line 143
    .line 144
    .line 145
    invoke-static {p3, p4, p2}, Lh1/c;->p(Lr1/v;ILjava/util/concurrent/TimeUnit;)Z

    .line 146
    .line 147
    .line 148
    invoke-virtual {p3}, Ll1/e;->close()V

    .line 149
    .line 150
    .line 151
    const/16 p2, 0xc8

    .line 152
    .line 153
    iget p1, p1, Lg1/C;->c:I

    .line 154
    .line 155
    if-eq p1, p2, :cond_2

    .line 156
    .line 157
    const/16 p2, 0x197

    .line 158
    .line 159
    if-ne p1, p2, :cond_1

    .line 160
    .line 161
    iget-object p1, v1, Lg1/F;->a:Lg1/a;

    .line 162
    .line 163
    iget-object p1, p1, Lg1/a;->d:Lg1/b;

    .line 164
    .line 165
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    new-instance p1, Ljava/io/IOException;

    .line 169
    .line 170
    const-string p2, "Failed to authenticate with proxy"

    .line 171
    .line 172
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    throw p1

    .line 176
    :cond_1
    new-instance p2, Ljava/io/IOException;

    .line 177
    .line 178
    const-string p3, "Unexpected response code for CONNECT: "

    .line 179
    .line 180
    invoke-static {p3, p1}, LQ0/E;->e(Ljava/lang/String;I)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    throw p2

    .line 188
    :cond_2
    iget-object p1, p0, Lj1/b;->i:Lr1/q;

    .line 189
    .line 190
    iget-object p1, p1, Lr1/q;->a:Lr1/e;

    .line 191
    .line 192
    invoke-virtual {p1}, Lr1/e;->g()Z

    .line 193
    .line 194
    .line 195
    move-result p1

    .line 196
    if-eqz p1, :cond_3

    .line 197
    .line 198
    iget-object p1, p0, Lj1/b;->j:Lr1/p;

    .line 199
    .line 200
    iget-object p1, p1, Lr1/p;->a:Lr1/e;

    .line 201
    .line 202
    invoke-virtual {p1}, Lr1/e;->g()Z

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    if-eqz p1, :cond_3

    .line 207
    .line 208
    return-void

    .line 209
    :cond_3
    new-instance p1, Ljava/io/IOException;

    .line 210
    .line 211
    const-string p2, "TLS tunnel buffered too many bytes!"

    .line 212
    .line 213
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    throw p1

    .line 217
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    .line 218
    .line 219
    const-string p2, "url == null"

    .line 220
    .line 221
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    throw p1
.end method

.method public final f(Lj1/a;Lg1/b;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lj1/b;->c:Lg1/F;

    .line 2
    .line 3
    iget-object v0, v0, Lg1/F;->a:Lg1/a;

    .line 4
    .line 5
    iget-object v0, v0, Lg1/a;->h:Ljavax/net/ssl/SSLSocketFactory;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object p1, Lg1/y;->c:Lg1/y;

    .line 10
    .line 11
    iput-object p1, p0, Lj1/b;->g:Lg1/y;

    .line 12
    .line 13
    iget-object p1, p0, Lj1/b;->d:Ljava/net/Socket;

    .line 14
    .line 15
    iput-object p1, p0, Lj1/b;->e:Ljava/net/Socket;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const-string p2, "Hostname "

    .line 22
    .line 23
    iget-object v0, p0, Lj1/b;->c:Lg1/F;

    .line 24
    .line 25
    iget-object v0, v0, Lg1/F;->a:Lg1/a;

    .line 26
    .line 27
    iget-object v1, v0, Lg1/a;->h:Ljavax/net/ssl/SSLSocketFactory;

    .line 28
    .line 29
    iget-object v2, v0, Lg1/a;->a:Lg1/u;

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    :try_start_0
    iget-object v4, p0, Lj1/b;->d:Ljava/net/Socket;

    .line 33
    .line 34
    iget-object v5, v2, Lg1/u;->d:Ljava/lang/String;

    .line 35
    .line 36
    iget v6, v2, Lg1/u;->e:I

    .line 37
    .line 38
    const/4 v7, 0x1

    .line 39
    invoke-virtual {v1, v4, v5, v6, v7}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Ljavax/net/ssl/SSLSocket;
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 44
    .line 45
    :try_start_1
    invoke-virtual {p1, v1}, Lj1/a;->a(Ljavax/net/ssl/SSLSocket;)Lg1/p;

    .line 46
    .line 47
    .line 48
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/AssertionError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    iget-boolean p1, p1, Lg1/p;->b:Z

    .line 50
    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    :try_start_2
    sget-object v4, Lo1/g;->a:Lo1/g;

    .line 54
    .line 55
    iget-object v5, v2, Lg1/u;->d:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v6, v0, Lg1/a;->e:Ljava/util/List;

    .line 58
    .line 59
    invoke-virtual {v4, v1, v5, v6}, Lo1/g;->e(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    move-object v3, v1

    .line 65
    goto/16 :goto_7

    .line 66
    .line 67
    :catch_0
    move-exception p1

    .line 68
    move-object v3, v1

    .line 69
    goto/16 :goto_6

    .line 70
    .line 71
    :cond_1
    :goto_0
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-interface {v4}, Ljavax/net/ssl/SSLSession;->getProtocol()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    const-string v6, "NONE"

    .line 83
    .line 84
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-nez v5, :cond_a

    .line 89
    .line 90
    const-string v5, "SSL_NULL_WITH_NULL_NULL"

    .line 91
    .line 92
    invoke-interface {v4}, Ljavax/net/ssl/SSLSession;->getCipherSuite()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-nez v5, :cond_a

    .line 101
    .line 102
    invoke-static {v4}, Lg1/r;->a(Ljavax/net/ssl/SSLSession;)Lg1/r;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    iget-object v6, v0, Lg1/a;->i:Lq1/c;

    .line 107
    .line 108
    iget-object v8, v2, Lg1/u;->d:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {v6, v8, v4}, Lq1/c;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    .line 111
    .line 112
    .line 113
    move-result v4
    :try_end_2
    .catch Ljava/lang/AssertionError; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 114
    iget-object v6, v5, Lg1/r;->c:Ljava/util/List;

    .line 115
    .line 116
    const/4 v8, 0x0

    .line 117
    if-eqz v4, :cond_9

    .line 118
    .line 119
    :try_start_3
    iget-object p2, v0, Lg1/a;->j:Lg1/k;

    .line 120
    .line 121
    iget-object v0, v2, Lg1/u;->d:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {p2, v0, v6}, Lg1/k;->a(Ljava/lang/String;Ljava/util/List;)V

    .line 124
    .line 125
    .line 126
    if-eqz p1, :cond_2

    .line 127
    .line 128
    sget-object p1, Lo1/g;->a:Lo1/g;

    .line 129
    .line 130
    invoke-virtual {p1, v1}, Lo1/g;->h(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    :cond_2
    iput-object v1, p0, Lj1/b;->e:Ljava/net/Socket;

    .line 135
    .line 136
    invoke-static {v1}, Lr1/o;->c(Ljava/net/Socket;)Lr1/b;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    new-instance p2, Lr1/q;

    .line 141
    .line 142
    invoke-direct {p2, p1}, Lr1/q;-><init>(Lr1/v;)V

    .line 143
    .line 144
    .line 145
    iput-object p2, p0, Lj1/b;->i:Lr1/q;

    .line 146
    .line 147
    iget-object p1, p0, Lj1/b;->e:Ljava/net/Socket;

    .line 148
    .line 149
    invoke-static {p1}, Lr1/o;->a(Ljava/net/Socket;)Lr1/a;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    new-instance p2, Lr1/p;

    .line 154
    .line 155
    invoke-direct {p2, p1}, Lr1/p;-><init>(Lr1/u;)V

    .line 156
    .line 157
    .line 158
    iput-object p2, p0, Lj1/b;->j:Lr1/p;

    .line 159
    .line 160
    iput-object v5, p0, Lj1/b;->f:Lg1/r;

    .line 161
    .line 162
    if-eqz v3, :cond_3

    .line 163
    .line 164
    invoke-static {v3}, Lg1/y;->a(Ljava/lang/String;)Lg1/y;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    goto :goto_1

    .line 169
    :cond_3
    sget-object p1, Lg1/y;->c:Lg1/y;

    .line 170
    .line 171
    :goto_1
    iput-object p1, p0, Lj1/b;->g:Lg1/y;
    :try_end_3
    .catch Ljava/lang/AssertionError; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 172
    .line 173
    sget-object p1, Lo1/g;->a:Lo1/g;

    .line 174
    .line 175
    invoke-virtual {p1, v1}, Lo1/g;->a(Ljavax/net/ssl/SSLSocket;)V

    .line 176
    .line 177
    .line 178
    iget-object p1, p0, Lj1/b;->g:Lg1/y;

    .line 179
    .line 180
    sget-object p2, Lg1/y;->e:Lg1/y;

    .line 181
    .line 182
    if-ne p1, p2, :cond_8

    .line 183
    .line 184
    iget-object p1, p0, Lj1/b;->e:Ljava/net/Socket;

    .line 185
    .line 186
    invoke-virtual {p1, v8}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 187
    .line 188
    .line 189
    new-instance p1, Lm1/m;

    .line 190
    .line 191
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 192
    .line 193
    .line 194
    sget-object p2, Lm1/o;->a:Lm1/n;

    .line 195
    .line 196
    iput-object p2, p1, Lm1/m;->e:Lm1/o;

    .line 197
    .line 198
    iput-boolean v7, p1, Lm1/m;->f:Z

    .line 199
    .line 200
    iget-object p2, p0, Lj1/b;->e:Ljava/net/Socket;

    .line 201
    .line 202
    iget-object v0, p0, Lj1/b;->c:Lg1/F;

    .line 203
    .line 204
    iget-object v0, v0, Lg1/F;->a:Lg1/a;

    .line 205
    .line 206
    iget-object v0, v0, Lg1/a;->a:Lg1/u;

    .line 207
    .line 208
    iget-object v0, v0, Lg1/u;->d:Ljava/lang/String;

    .line 209
    .line 210
    iget-object v1, p0, Lj1/b;->i:Lr1/q;

    .line 211
    .line 212
    iget-object v2, p0, Lj1/b;->j:Lr1/p;

    .line 213
    .line 214
    iput-object p2, p1, Lm1/m;->a:Ljava/net/Socket;

    .line 215
    .line 216
    iput-object v0, p1, Lm1/m;->b:Ljava/lang/String;

    .line 217
    .line 218
    iput-object v1, p1, Lm1/m;->c:Lr1/q;

    .line 219
    .line 220
    iput-object v2, p1, Lm1/m;->d:Lr1/p;

    .line 221
    .line 222
    iput-object p0, p1, Lm1/m;->e:Lm1/o;

    .line 223
    .line 224
    new-instance p2, Lm1/s;

    .line 225
    .line 226
    invoke-direct {p2, p1}, Lm1/s;-><init>(Lm1/m;)V

    .line 227
    .line 228
    .line 229
    iput-object p2, p0, Lj1/b;->h:Lm1/s;

    .line 230
    .line 231
    iget-object p1, p2, Lm1/s;->r:Lm1/z;

    .line 232
    .line 233
    const-string v0, ">> CONNECTION "

    .line 234
    .line 235
    monitor-enter p1

    .line 236
    :try_start_4
    iget-boolean v1, p1, Lm1/z;->e:Z

    .line 237
    .line 238
    if-nez v1, :cond_7

    .line 239
    .line 240
    iget-boolean v1, p1, Lm1/z;->b:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 241
    .line 242
    if-nez v1, :cond_4

    .line 243
    .line 244
    monitor-exit p1

    .line 245
    goto :goto_3

    .line 246
    :cond_4
    :try_start_5
    sget-object v1, Lm1/z;->g:Ljava/util/logging/Logger;

    .line 247
    .line 248
    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 249
    .line 250
    invoke-virtual {v1, v2}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 251
    .line 252
    .line 253
    move-result v2

    .line 254
    if-eqz v2, :cond_5

    .line 255
    .line 256
    sget-object v2, Lm1/f;->a:Lr1/h;

    .line 257
    .line 258
    invoke-virtual {v2}, Lr1/h;->h()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    sget-object v3, Lh1/c;->a:[B

    .line 263
    .line 264
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 265
    .line 266
    new-instance v3, Ljava/lang/StringBuilder;

    .line 267
    .line 268
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-virtual {v1, v0}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    goto :goto_2

    .line 282
    :catchall_1
    move-exception p2

    .line 283
    goto :goto_4

    .line 284
    :cond_5
    :goto_2
    iget-object v0, p1, Lm1/z;->a:Lr1/p;

    .line 285
    .line 286
    sget-object v1, Lm1/f;->a:Lr1/h;

    .line 287
    .line 288
    iget-object v1, v1, Lr1/h;->a:[B

    .line 289
    .line 290
    invoke-virtual {v1}, [B->clone()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    check-cast v1, [B

    .line 295
    .line 296
    invoke-virtual {v0, v1}, Lr1/p;->g([B)Lr1/f;

    .line 297
    .line 298
    .line 299
    iget-object v0, p1, Lm1/z;->a:Lr1/p;

    .line 300
    .line 301
    invoke-virtual {v0}, Lr1/p;->flush()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 302
    .line 303
    .line 304
    monitor-exit p1

    .line 305
    :goto_3
    iget-object p1, p2, Lm1/s;->r:Lm1/z;

    .line 306
    .line 307
    iget-object v0, p2, Lm1/s;->n:LK/j;

    .line 308
    .line 309
    invoke-virtual {p1, v0}, Lm1/z;->m(LK/j;)V

    .line 310
    .line 311
    .line 312
    iget-object p1, p2, Lm1/s;->n:LK/j;

    .line 313
    .line 314
    invoke-virtual {p1}, LK/j;->b()I

    .line 315
    .line 316
    .line 317
    move-result p1

    .line 318
    const v0, 0xffff

    .line 319
    .line 320
    .line 321
    if-eq p1, v0, :cond_6

    .line 322
    .line 323
    iget-object v1, p2, Lm1/s;->r:Lm1/z;

    .line 324
    .line 325
    sub-int/2addr p1, v0

    .line 326
    int-to-long v2, p1

    .line 327
    invoke-virtual {v1, v8, v2, v3}, Lm1/z;->o(IJ)V

    .line 328
    .line 329
    .line 330
    :cond_6
    new-instance p1, Ljava/lang/Thread;

    .line 331
    .line 332
    iget-object p2, p2, Lm1/s;->s:Lm1/q;

    .line 333
    .line 334
    invoke-direct {p1, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 338
    .line 339
    .line 340
    goto :goto_5

    .line 341
    :cond_7
    :try_start_6
    new-instance p2, Ljava/io/IOException;

    .line 342
    .line 343
    const-string v0, "closed"

    .line 344
    .line 345
    invoke-direct {p2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    throw p2

    .line 349
    :goto_4
    monitor-exit p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 350
    throw p2

    .line 351
    :cond_8
    :goto_5
    return-void

    .line 352
    :cond_9
    :try_start_7
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object p1

    .line 356
    check-cast p1, Ljava/security/cert/X509Certificate;

    .line 357
    .line 358
    new-instance v0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 359
    .line 360
    new-instance v3, Ljava/lang/StringBuilder;

    .line 361
    .line 362
    invoke-direct {v3, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    iget-object p2, v2, Lg1/u;->d:Ljava/lang/String;

    .line 366
    .line 367
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    const-string p2, " not verified:\n    certificate: "

    .line 371
    .line 372
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-static {p1}, Lg1/k;->b(Ljava/security/cert/X509Certificate;)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object p2

    .line 379
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    const-string p2, "\n    DN: "

    .line 383
    .line 384
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    .line 388
    .line 389
    .line 390
    move-result-object p2

    .line 391
    invoke-interface {p2}, Ljava/security/Principal;->getName()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object p2

    .line 395
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    const-string p2, "\n    subjectAltNames: "

    .line 399
    .line 400
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    invoke-static {p1}, Lq1/c;->a(Ljava/security/cert/X509Certificate;)Ljava/util/ArrayList;

    .line 404
    .line 405
    .line 406
    move-result-object p1

    .line 407
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object p1

    .line 414
    invoke-direct {v0, p1}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    throw v0

    .line 418
    :cond_a
    new-instance p1, Ljava/io/IOException;

    .line 419
    .line 420
    const-string p2, "a valid ssl session was not established"

    .line 421
    .line 422
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    throw p1
    :try_end_7
    .catch Ljava/lang/AssertionError; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 426
    :catchall_2
    move-exception p1

    .line 427
    goto :goto_7

    .line 428
    :catch_1
    move-exception p1

    .line 429
    :goto_6
    :try_start_8
    invoke-static {p1}, Lh1/c;->n(Ljava/lang/AssertionError;)Z

    .line 430
    .line 431
    .line 432
    move-result p2

    .line 433
    if-eqz p2, :cond_b

    .line 434
    .line 435
    new-instance p2, Ljava/io/IOException;

    .line 436
    .line 437
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 438
    .line 439
    .line 440
    throw p2

    .line 441
    :cond_b
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 442
    :goto_7
    if-eqz v3, :cond_c

    .line 443
    .line 444
    sget-object p2, Lo1/g;->a:Lo1/g;

    .line 445
    .line 446
    invoke-virtual {p2, v3}, Lo1/g;->a(Ljavax/net/ssl/SSLSocket;)V

    .line 447
    .line 448
    .line 449
    :cond_c
    invoke-static {v3}, Lh1/c;->d(Ljava/net/Socket;)V

    .line 450
    .line 451
    .line 452
    throw p1
.end method

.method public final g(Lg1/a;Lg1/F;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lj1/b;->n:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lj1/b;->m:I

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-ge v0, v1, :cond_a

    .line 11
    .line 12
    iget-boolean v0, p0, Lj1/b;->k:Z

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget-object v0, Lg1/b;->e:Lg1/b;

    .line 18
    .line 19
    iget-object v1, p0, Lj1/b;->c:Lg1/F;

    .line 20
    .line 21
    iget-object v3, v1, Lg1/F;->a:Lg1/a;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3, p1}, Lg1/a;->a(Lg1/a;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    return v2

    .line 33
    :cond_1
    iget-object v0, p1, Lg1/a;->a:Lg1/u;

    .line 34
    .line 35
    iget-object v3, v0, Lg1/u;->d:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v4, v1, Lg1/F;->a:Lg1/a;

    .line 38
    .line 39
    iget-object v4, v4, Lg1/a;->a:Lg1/u;

    .line 40
    .line 41
    iget-object v4, v4, Lg1/u;->d:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    const/4 v4, 0x1

    .line 48
    if-eqz v3, :cond_2

    .line 49
    .line 50
    return v4

    .line 51
    :cond_2
    iget-object v3, p0, Lj1/b;->h:Lm1/s;

    .line 52
    .line 53
    if-nez v3, :cond_3

    .line 54
    .line 55
    return v2

    .line 56
    :cond_3
    if-nez p2, :cond_4

    .line 57
    .line 58
    return v2

    .line 59
    :cond_4
    iget-object v3, p2, Lg1/F;->b:Ljava/net/Proxy;

    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    sget-object v5, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 66
    .line 67
    if-eq v3, v5, :cond_5

    .line 68
    .line 69
    return v2

    .line 70
    :cond_5
    iget-object v3, v1, Lg1/F;->b:Ljava/net/Proxy;

    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    if-eq v3, v5, :cond_6

    .line 77
    .line 78
    return v2

    .line 79
    :cond_6
    iget-object v3, p2, Lg1/F;->c:Ljava/net/InetSocketAddress;

    .line 80
    .line 81
    iget-object v1, v1, Lg1/F;->c:Ljava/net/InetSocketAddress;

    .line 82
    .line 83
    invoke-virtual {v1, v3}, Ljava/net/InetSocketAddress;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_7

    .line 88
    .line 89
    return v2

    .line 90
    :cond_7
    iget-object p2, p2, Lg1/F;->a:Lg1/a;

    .line 91
    .line 92
    iget-object p2, p2, Lg1/a;->i:Lq1/c;

    .line 93
    .line 94
    sget-object v1, Lq1/c;->a:Lq1/c;

    .line 95
    .line 96
    if-eq p2, v1, :cond_8

    .line 97
    .line 98
    return v2

    .line 99
    :cond_8
    invoke-virtual {p0, v0}, Lj1/b;->j(Lg1/u;)Z

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    if-nez p2, :cond_9

    .line 104
    .line 105
    return v2

    .line 106
    :cond_9
    :try_start_0
    iget-object p1, p1, Lg1/a;->j:Lg1/k;

    .line 107
    .line 108
    iget-object p2, v0, Lg1/u;->d:Ljava/lang/String;

    .line 109
    .line 110
    iget-object v0, p0, Lj1/b;->f:Lg1/r;

    .line 111
    .line 112
    iget-object v0, v0, Lg1/r;->c:Ljava/util/List;

    .line 113
    .line 114
    invoke-virtual {p1, p2, v0}, Lg1/k;->a(Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 115
    .line 116
    .line 117
    return v4

    .line 118
    :catch_0
    :cond_a
    :goto_0
    return v2
.end method

.method public final h(Z)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lj1/b;->e:Ljava/net/Socket;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/Socket;->isClosed()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_4

    .line 9
    .line 10
    iget-object v0, p0, Lj1/b;->e:Ljava/net/Socket;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/net/Socket;->isInputShutdown()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_4

    .line 17
    .line 18
    iget-object v0, p0, Lj1/b;->e:Ljava/net/Socket;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/net/Socket;->isOutputShutdown()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v0, p0, Lj1/b;->h:Lm1/s;

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    monitor-enter v0

    .line 33
    :try_start_0
    iget-boolean p1, v0, Lm1/s;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    monitor-exit v0

    .line 36
    xor-int/2addr p1, v2

    .line 37
    return p1

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    throw p1

    .line 41
    :cond_1
    if-eqz p1, :cond_3

    .line 42
    .line 43
    :try_start_2
    iget-object p1, p0, Lj1/b;->e:Ljava/net/Socket;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/net/Socket;->getSoTimeout()I

    .line 46
    .line 47
    .line 48
    move-result p1
    :try_end_2
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 49
    :try_start_3
    iget-object v0, p0, Lj1/b;->e:Ljava/net/Socket;

    .line 50
    .line 51
    invoke-virtual {v0, v2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lj1/b;->i:Lr1/q;

    .line 55
    .line 56
    invoke-virtual {v0}, Lr1/q;->f()Z

    .line 57
    .line 58
    .line 59
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    :try_start_4
    iget-object v0, p0, Lj1/b;->e:Ljava/net/Socket;

    .line 63
    .line 64
    invoke-virtual {v0, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 65
    .line 66
    .line 67
    return v1

    .line 68
    :cond_2
    iget-object v0, p0, Lj1/b;->e:Ljava/net/Socket;

    .line 69
    .line 70
    invoke-virtual {v0, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 71
    .line 72
    .line 73
    return v2

    .line 74
    :catchall_1
    move-exception v0

    .line 75
    iget-object v3, p0, Lj1/b;->e:Ljava/net/Socket;

    .line 76
    .line 77
    invoke-virtual {v3, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 78
    .line 79
    .line 80
    throw v0
    :try_end_4
    .catch Ljava/net/SocketTimeoutException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 81
    :catch_0
    return v1

    .line 82
    :catch_1
    :cond_3
    return v2

    .line 83
    :cond_4
    :goto_0
    return v1
.end method

.method public final i(Lg1/x;Lk1/e;Lj1/f;)Lk1/b;
    .locals 4

    .line 1
    iget-object v0, p0, Lj1/b;->h:Lm1/s;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance p1, Lm1/h;

    .line 6
    .line 7
    iget-object v0, p0, Lj1/b;->h:Lm1/s;

    .line 8
    .line 9
    invoke-direct {p1, p2, p3, v0}, Lm1/h;-><init>(Lk1/e;Lj1/f;Lm1/s;)V

    .line 10
    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_0
    iget-object v0, p0, Lj1/b;->e:Ljava/net/Socket;

    .line 14
    .line 15
    iget v1, p2, Lk1/e;->j:I

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lj1/b;->i:Lr1/q;

    .line 21
    .line 22
    iget-object v0, v0, Lr1/q;->b:Lr1/v;

    .line 23
    .line 24
    invoke-interface {v0}, Lr1/v;->a()Lr1/x;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    int-to-long v1, v1

    .line 29
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2, v3}, Lr1/x;->g(JLjava/util/concurrent/TimeUnit;)Lr1/x;

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lj1/b;->j:Lr1/p;

    .line 35
    .line 36
    iget-object v0, v0, Lr1/p;->b:Lr1/u;

    .line 37
    .line 38
    invoke-interface {v0}, Lr1/u;->a()Lr1/x;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget p2, p2, Lk1/e;->k:I

    .line 43
    .line 44
    int-to-long v1, p2

    .line 45
    invoke-virtual {v0, v1, v2, v3}, Lr1/x;->g(JLjava/util/concurrent/TimeUnit;)Lr1/x;

    .line 46
    .line 47
    .line 48
    new-instance p2, Ll1/g;

    .line 49
    .line 50
    iget-object v0, p0, Lj1/b;->i:Lr1/q;

    .line 51
    .line 52
    iget-object v1, p0, Lj1/b;->j:Lr1/p;

    .line 53
    .line 54
    invoke-direct {p2, p1, p3, v0, v1}, Ll1/g;-><init>(Lg1/x;Lj1/f;Lr1/q;Lr1/p;)V

    .line 55
    .line 56
    .line 57
    return-object p2
.end method

.method public final j(Lg1/u;)Z
    .locals 4

    .line 1
    iget v0, p1, Lg1/u;->e:I

    .line 2
    .line 3
    iget-object v1, p0, Lj1/b;->c:Lg1/F;

    .line 4
    .line 5
    iget-object v1, v1, Lg1/F;->a:Lg1/a;

    .line 6
    .line 7
    iget-object v1, v1, Lg1/a;->a:Lg1/u;

    .line 8
    .line 9
    iget v2, v1, Lg1/u;->e:I

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-eq v0, v2, :cond_0

    .line 13
    .line 14
    return v3

    .line 15
    :cond_0
    iget-object p1, p1, Lg1/u;->d:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v0, v1, Lg1/u;->d:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x1

    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    iget-object v0, p0, Lj1/b;->f:Lg1/r;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object v0, v0, Lg1/r;->c:Ljava/util/List;

    .line 31
    .line 32
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 37
    .line 38
    invoke-static {p1, v0}, Lq1/c;->c(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    const/4 v3, 0x1

    .line 45
    :cond_1
    return v3

    .line 46
    :cond_2
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Connection{"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lj1/b;->c:Lg1/F;

    .line 9
    .line 10
    iget-object v2, v1, Lg1/F;->a:Lg1/a;

    .line 11
    .line 12
    iget-object v2, v2, Lg1/a;->a:Lg1/u;

    .line 13
    .line 14
    iget-object v2, v2, Lg1/u;->d:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v2, ":"

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v2, v1, Lg1/F;->a:Lg1/a;

    .line 25
    .line 26
    iget-object v2, v2, Lg1/a;->a:Lg1/u;

    .line 27
    .line 28
    iget v2, v2, Lg1/u;->e:I

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v2, ", proxy="

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v2, v1, Lg1/F;->b:Ljava/net/Proxy;

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v2, " hostAddress="

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, v1, Lg1/F;->c:Ljava/net/InetSocketAddress;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, " cipherSuite="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lj1/b;->f:Lg1/r;

    .line 59
    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    iget-object v1, v1, Lg1/r;->b:Lg1/m;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    const-string v1, "none"

    .line 66
    .line 67
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v1, " protocol="

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, Lj1/b;->g:Lg1/y;

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const/16 v1, 0x7d

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    return-object v0
.end method
