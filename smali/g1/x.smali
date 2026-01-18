.class public final Lg1/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final w:Ljava/util/List;

.field public static final x:Ljava/util/List;


# instance fields
.field public final a:LE/j;

.field public final b:Ljava/util/List;

.field public final c:Ljava/util/List;

.field public final d:Lg1/b;

.field public final e:Ljava/net/ProxySelector;

.field public final f:Lg1/b;

.field public final g:Lg1/h;

.field public final h:Ljavax/net/SocketFactory;

.field public final i:Ljavax/net/ssl/SSLSocketFactory;

.field public final j:LT0/g;

.field public final k:Lq1/c;

.field public final l:Lg1/k;

.field public final m:Lg1/b;

.field public final n:Lg1/b;

.field public final o:Lg1/n;

.field public final p:Lg1/b;

.field public final q:Z

.field public final r:Z

.field public final s:Z

.field public final t:I

.field public final u:I

.field public final v:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [Lg1/y;

    .line 3
    .line 4
    sget-object v2, Lg1/y;->e:Lg1/y;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    aput-object v2, v1, v3

    .line 8
    .line 9
    sget-object v2, Lg1/y;->c:Lg1/y;

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    aput-object v2, v1, v4

    .line 13
    .line 14
    invoke-static {v1}, Lh1/c;->l([Ljava/lang/Object;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sput-object v1, Lg1/x;->w:Ljava/util/List;

    .line 19
    .line 20
    new-array v0, v0, [Lg1/p;

    .line 21
    .line 22
    sget-object v1, Lg1/p;->e:Lg1/p;

    .line 23
    .line 24
    aput-object v1, v0, v3

    .line 25
    .line 26
    sget-object v1, Lg1/p;->f:Lg1/p;

    .line 27
    .line 28
    aput-object v1, v0, v4

    .line 29
    .line 30
    invoke-static {v0}, Lh1/c;->l([Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Lg1/x;->x:Ljava/util/List;

    .line 35
    .line 36
    new-instance v0, Lg1/b;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lg1/b;->e:Lg1/b;

    .line 42
    .line 43
    return-void
.end method

.method public constructor <init>(Lg1/w;)V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "No System TLS"

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iget-object v2, p1, Lg1/w;->a:LE/j;

    .line 8
    .line 9
    iput-object v2, p0, Lg1/x;->a:LE/j;

    .line 10
    .line 11
    iget-object v2, p1, Lg1/w;->b:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-static {v2}, Lh1/c;->k(Ljava/util/List;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iput-object v2, p0, Lg1/x;->b:Ljava/util/List;

    .line 18
    .line 19
    iget-object v2, p1, Lg1/w;->c:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-static {v2}, Lh1/c;->k(Ljava/util/List;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iput-object v2, p0, Lg1/x;->c:Ljava/util/List;

    .line 26
    .line 27
    iget-object v2, p1, Lg1/w;->d:Lg1/b;

    .line 28
    .line 29
    iput-object v2, p0, Lg1/x;->d:Lg1/b;

    .line 30
    .line 31
    iget-object v2, p1, Lg1/w;->e:Ljava/net/ProxySelector;

    .line 32
    .line 33
    iput-object v2, p0, Lg1/x;->e:Ljava/net/ProxySelector;

    .line 34
    .line 35
    iget-object v2, p1, Lg1/w;->f:Lg1/b;

    .line 36
    .line 37
    iput-object v2, p0, Lg1/x;->f:Lg1/b;

    .line 38
    .line 39
    iget-object v2, p1, Lg1/w;->g:Lg1/h;

    .line 40
    .line 41
    iput-object v2, p0, Lg1/x;->g:Lg1/h;

    .line 42
    .line 43
    iget-object v2, p1, Lg1/w;->h:Ljavax/net/SocketFactory;

    .line 44
    .line 45
    iput-object v2, p0, Lg1/x;->h:Ljavax/net/SocketFactory;

    .line 46
    .line 47
    sget-object v2, Lg1/x;->x:Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    const/4 v3, 0x0

    .line 54
    :cond_0
    const/4 v4, 0x0

    .line 55
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-eqz v5, :cond_2

    .line 60
    .line 61
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    check-cast v5, Lg1/p;

    .line 66
    .line 67
    if-nez v4, :cond_1

    .line 68
    .line 69
    iget-boolean v4, v5, Lg1/p;->a:Z

    .line 70
    .line 71
    if-eqz v4, :cond_0

    .line 72
    .line 73
    :cond_1
    const/4 v4, 0x1

    .line 74
    goto :goto_0

    .line 75
    :cond_2
    const/4 v2, 0x0

    .line 76
    if-nez v4, :cond_3

    .line 77
    .line 78
    iput-object v2, p0, Lg1/x;->i:Ljavax/net/ssl/SSLSocketFactory;

    .line 79
    .line 80
    iput-object v2, p0, Lg1/x;->j:LT0/g;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    const-string v4, "Unexpected default trust managers:"

    .line 84
    .line 85
    :try_start_0
    invoke-static {}, Ljavax/net/ssl/TrustManagerFactory;->getDefaultAlgorithm()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    invoke-static {v5}, Ljavax/net/ssl/TrustManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-virtual {v5, v2}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    array-length v6, v5

    .line 101
    if-ne v6, v0, :cond_7

    .line 102
    .line 103
    aget-object v6, v5, v3

    .line 104
    .line 105
    instance-of v7, v6, Ljavax/net/ssl/X509TrustManager;

    .line 106
    .line 107
    if-eqz v7, :cond_7

    .line 108
    .line 109
    check-cast v6, Ljavax/net/ssl/X509TrustManager;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1

    .line 110
    .line 111
    :try_start_1
    sget-object v4, Lo1/g;->a:Lo1/g;

    .line 112
    .line 113
    invoke-virtual {v4}, Lo1/g;->g()Ljavax/net/ssl/SSLContext;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    new-array v0, v0, [Ljavax/net/ssl/TrustManager;

    .line 118
    .line 119
    aput-object v6, v0, v3

    .line 120
    .line 121
    invoke-virtual {v5, v2, v0, v2}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v5}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    .line 125
    .line 126
    .line 127
    move-result-object v0
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_0

    .line 128
    iput-object v0, p0, Lg1/x;->i:Ljavax/net/ssl/SSLSocketFactory;

    .line 129
    .line 130
    invoke-virtual {v4, v6}, Lo1/g;->c(Ljavax/net/ssl/X509TrustManager;)LT0/g;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    iput-object v0, p0, Lg1/x;->j:LT0/g;

    .line 135
    .line 136
    :goto_1
    iget-object v0, p1, Lg1/w;->i:Lq1/c;

    .line 137
    .line 138
    iput-object v0, p0, Lg1/x;->k:Lq1/c;

    .line 139
    .line 140
    iget-object v0, p0, Lg1/x;->j:LT0/g;

    .line 141
    .line 142
    iget-object v1, p1, Lg1/w;->j:Lg1/k;

    .line 143
    .line 144
    iget-object v3, v1, Lg1/k;->b:LT0/g;

    .line 145
    .line 146
    invoke-static {v3, v0}, Lh1/c;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    if-eqz v3, :cond_4

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_4
    new-instance v3, Lg1/k;

    .line 154
    .line 155
    iget-object v1, v1, Lg1/k;->a:Ljava/util/LinkedHashSet;

    .line 156
    .line 157
    invoke-direct {v3, v1, v0}, Lg1/k;-><init>(Ljava/util/LinkedHashSet;LT0/g;)V

    .line 158
    .line 159
    .line 160
    move-object v1, v3

    .line 161
    :goto_2
    iput-object v1, p0, Lg1/x;->l:Lg1/k;

    .line 162
    .line 163
    iget-object v0, p1, Lg1/w;->k:Lg1/b;

    .line 164
    .line 165
    iput-object v0, p0, Lg1/x;->m:Lg1/b;

    .line 166
    .line 167
    iget-object v0, p1, Lg1/w;->l:Lg1/b;

    .line 168
    .line 169
    iput-object v0, p0, Lg1/x;->n:Lg1/b;

    .line 170
    .line 171
    iget-object v0, p1, Lg1/w;->m:Lg1/n;

    .line 172
    .line 173
    iput-object v0, p0, Lg1/x;->o:Lg1/n;

    .line 174
    .line 175
    iget-object v0, p1, Lg1/w;->n:Lg1/b;

    .line 176
    .line 177
    iput-object v0, p0, Lg1/x;->p:Lg1/b;

    .line 178
    .line 179
    iget-boolean v0, p1, Lg1/w;->o:Z

    .line 180
    .line 181
    iput-boolean v0, p0, Lg1/x;->q:Z

    .line 182
    .line 183
    iget-boolean v0, p1, Lg1/w;->p:Z

    .line 184
    .line 185
    iput-boolean v0, p0, Lg1/x;->r:Z

    .line 186
    .line 187
    iget-boolean v0, p1, Lg1/w;->q:Z

    .line 188
    .line 189
    iput-boolean v0, p0, Lg1/x;->s:Z

    .line 190
    .line 191
    iget v0, p1, Lg1/w;->r:I

    .line 192
    .line 193
    iput v0, p0, Lg1/x;->t:I

    .line 194
    .line 195
    iget v0, p1, Lg1/w;->s:I

    .line 196
    .line 197
    iput v0, p0, Lg1/x;->u:I

    .line 198
    .line 199
    iget p1, p1, Lg1/w;->t:I

    .line 200
    .line 201
    iput p1, p0, Lg1/x;->v:I

    .line 202
    .line 203
    iget-object p1, p0, Lg1/x;->b:Ljava/util/List;

    .line 204
    .line 205
    invoke-interface {p1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    if-nez p1, :cond_6

    .line 210
    .line 211
    iget-object p1, p0, Lg1/x;->c:Ljava/util/List;

    .line 212
    .line 213
    invoke-interface {p1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    if-nez p1, :cond_5

    .line 218
    .line 219
    return-void

    .line 220
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 221
    .line 222
    new-instance v0, Ljava/lang/StringBuilder;

    .line 223
    .line 224
    const-string v1, "Null network interceptor: "

    .line 225
    .line 226
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    iget-object v1, p0, Lg1/x;->c:Ljava/util/List;

    .line 230
    .line 231
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    throw p1

    .line 242
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 243
    .line 244
    new-instance v0, Ljava/lang/StringBuilder;

    .line 245
    .line 246
    const-string v1, "Null interceptor: "

    .line 247
    .line 248
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    iget-object v1, p0, Lg1/x;->b:Ljava/util/List;

    .line 252
    .line 253
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    throw p1

    .line 264
    :catch_0
    move-exception p1

    .line 265
    invoke-static {v1, p1}, Lh1/c;->a(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/AssertionError;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    throw p1

    .line 270
    :catch_1
    move-exception p1

    .line 271
    goto :goto_3

    .line 272
    :cond_7
    :try_start_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 273
    .line 274
    new-instance v0, Ljava/lang/StringBuilder;

    .line 275
    .line 276
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    invoke-static {v5}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    throw p1
    :try_end_2
    .catch Ljava/security/GeneralSecurityException; {:try_start_2 .. :try_end_2} :catch_1

    .line 294
    :goto_3
    invoke-static {v1, p1}, Lh1/c;->a(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/AssertionError;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    throw p1
.end method
