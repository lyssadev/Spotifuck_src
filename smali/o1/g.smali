.class public Lo1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo1/g;

.field public static final b:Ljava/util/logging/Logger;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const-class v3, Ljavax/net/ssl/SSLSocket;

    .line 6
    .line 7
    const-class v4, [B

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    :try_start_0
    const-string v6, "com.android.org.conscrypt.SSLParametersImpl"

    .line 11
    .line 12
    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    :try_start_1
    const-string v6, "org.apache.harmony.xnet.provider.jsse.SSLParametersImpl"

    .line 17
    .line 18
    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    :goto_0
    new-instance v6, Landroid/support/v4/media/session/t;

    .line 22
    .line 23
    const-string v7, "setUseSessionTickets"

    .line 24
    .line 25
    new-array v8, v1, [Ljava/lang/Class;

    .line 26
    .line 27
    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 28
    .line 29
    aput-object v9, v8, v2

    .line 30
    .line 31
    invoke-direct {v6, v5, v7, v8, v0}, Landroid/support/v4/media/session/t;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 32
    .line 33
    .line 34
    new-instance v7, Landroid/support/v4/media/session/t;

    .line 35
    .line 36
    const-string v8, "setHostname"

    .line 37
    .line 38
    new-array v9, v1, [Ljava/lang/Class;

    .line 39
    .line 40
    const-class v10, Ljava/lang/String;

    .line 41
    .line 42
    aput-object v10, v9, v2

    .line 43
    .line 44
    invoke-direct {v7, v5, v8, v9, v0}, Landroid/support/v4/media/session/t;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 45
    .line 46
    .line 47
    const-string v8, "GMSCore_OpenSSL"

    .line 48
    .line 49
    invoke-static {v8}, Ljava/security/Security;->getProvider(Ljava/lang/String;)Ljava/security/Provider;

    .line 50
    .line 51
    .line 52
    move-result-object v8
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 53
    if-eqz v8, :cond_0

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    :try_start_2
    const-string v8, "android.net.Network"

    .line 57
    .line 58
    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    .line 59
    .line 60
    .line 61
    :goto_1
    :try_start_3
    new-instance v8, Landroid/support/v4/media/session/t;

    .line 62
    .line 63
    const-string v9, "getAlpnSelectedProtocol"

    .line 64
    .line 65
    new-array v10, v2, [Ljava/lang/Class;

    .line 66
    .line 67
    invoke-direct {v8, v4, v9, v10, v0}, Landroid/support/v4/media/session/t;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 68
    .line 69
    .line 70
    new-instance v9, Landroid/support/v4/media/session/t;

    .line 71
    .line 72
    const-string v10, "setAlpnProtocols"

    .line 73
    .line 74
    new-array v11, v1, [Ljava/lang/Class;

    .line 75
    .line 76
    aput-object v4, v11, v2

    .line 77
    .line 78
    invoke-direct {v9, v5, v10, v11, v0}, Landroid/support/v4/media/session/t;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :catch_1
    nop

    .line 83
    goto :goto_3

    .line 84
    :catch_2
    move-object v8, v5

    .line 85
    move-object v9, v8

    .line 86
    :goto_2
    new-instance v0, Lo1/c;

    .line 87
    .line 88
    invoke-direct {v0, v6, v7, v8, v9}, Lo1/c;-><init>(Landroid/support/v4/media/session/t;Landroid/support/v4/media/session/t;Landroid/support/v4/media/session/t;Landroid/support/v4/media/session/t;)V
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_1

    .line 89
    .line 90
    .line 91
    goto :goto_4

    .line 92
    :goto_3
    move-object v0, v5

    .line 93
    :goto_4
    if-eqz v0, :cond_1

    .line 94
    .line 95
    goto/16 :goto_8

    .line 96
    .line 97
    :cond_1
    const-string v0, "okhttp.platform"

    .line 98
    .line 99
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    const-string v4, "conscrypt"

    .line 104
    .line 105
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_2

    .line 110
    .line 111
    const/4 v0, 0x1

    .line 112
    goto :goto_5

    .line 113
    :cond_2
    invoke-static {}, Ljava/security/Security;->getProviders()[Ljava/security/Provider;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    aget-object v0, v0, v2

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/security/Provider;->getName()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    const-string v4, "Conscrypt"

    .line 124
    .line 125
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    :goto_5
    if-eqz v0, :cond_3

    .line 130
    .line 131
    invoke-static {}, Lo1/d;->m()Lo1/d;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    if-eqz v0, :cond_3

    .line 136
    .line 137
    goto/16 :goto_8

    .line 138
    .line 139
    :cond_3
    :try_start_4
    const-class v0, Ljavax/net/ssl/SSLParameters;

    .line 140
    .line 141
    const-string v4, "setApplicationProtocols"

    .line 142
    .line 143
    new-array v6, v1, [Ljava/lang/Class;

    .line 144
    .line 145
    const-class v7, [Ljava/lang/String;

    .line 146
    .line 147
    aput-object v7, v6, v2

    .line 148
    .line 149
    invoke-virtual {v0, v4, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    const-string v4, "getApplicationProtocol"

    .line 154
    .line 155
    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    new-instance v6, Lo1/e;

    .line 160
    .line 161
    invoke-direct {v6, v0, v4}, Lo1/e;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    :try_end_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_3

    .line 162
    .line 163
    .line 164
    move-object v0, v6

    .line 165
    goto :goto_6

    .line 166
    :catch_3
    nop

    .line 167
    move-object v0, v5

    .line 168
    :goto_6
    if-eqz v0, :cond_4

    .line 169
    .line 170
    goto :goto_8

    .line 171
    :cond_4
    const-string v0, "org.eclipse.jetty.alpn.ALPN"

    .line 172
    .line 173
    :try_start_5
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    const-string v4, "org.eclipse.jetty.alpn.ALPN$Provider"

    .line 178
    .line 179
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    const-string v6, "org.eclipse.jetty.alpn.ALPN$ClientProvider"

    .line 184
    .line 185
    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    move-result-object v11

    .line 189
    const-string v6, "org.eclipse.jetty.alpn.ALPN$ServerProvider"

    .line 190
    .line 191
    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-result-object v12

    .line 195
    const-string v6, "put"

    .line 196
    .line 197
    const/4 v7, 0x2

    .line 198
    new-array v7, v7, [Ljava/lang/Class;

    .line 199
    .line 200
    aput-object v3, v7, v2

    .line 201
    .line 202
    aput-object v4, v7, v1

    .line 203
    .line 204
    invoke-virtual {v0, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    const-string v4, "get"

    .line 209
    .line 210
    new-array v6, v1, [Ljava/lang/Class;

    .line 211
    .line 212
    aput-object v3, v6, v2

    .line 213
    .line 214
    invoke-virtual {v0, v4, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 215
    .line 216
    .line 217
    move-result-object v9

    .line 218
    const-string v4, "remove"

    .line 219
    .line 220
    new-array v1, v1, [Ljava/lang/Class;

    .line 221
    .line 222
    aput-object v3, v1, v2

    .line 223
    .line 224
    invoke-virtual {v0, v4, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 225
    .line 226
    .line 227
    move-result-object v10

    .line 228
    new-instance v0, Lo1/c;

    .line 229
    .line 230
    move-object v7, v0

    .line 231
    invoke-direct/range {v7 .. v12}, Lo1/c;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V
    :try_end_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_4

    .line 232
    .line 233
    .line 234
    move-object v5, v0

    .line 235
    goto :goto_7

    .line 236
    :catch_4
    nop

    .line 237
    :goto_7
    if-eqz v5, :cond_5

    .line 238
    .line 239
    move-object v0, v5

    .line 240
    goto :goto_8

    .line 241
    :cond_5
    new-instance v0, Lo1/g;

    .line 242
    .line 243
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 244
    .line 245
    .line 246
    :goto_8
    sput-object v0, Lo1/g;->a:Lo1/g;

    .line 247
    .line 248
    const-class v0, Lg1/x;

    .line 249
    .line 250
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    sput-object v0, Lo1/g;->b:Ljava/util/logging/Logger;

    .line 259
    .line 260
    return-void
.end method

.method public static b(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-ge v2, v1, :cond_1

    .line 16
    .line 17
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Lg1/y;

    .line 22
    .line 23
    sget-object v4, Lg1/y;->b:Lg1/y;

    .line 24
    .line 25
    if-ne v3, v4, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    iget-object v3, v3, Lg1/y;->a:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-object v0
.end method


# virtual methods
.method public a(Ljavax/net/ssl/SSLSocket;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(Ljavax/net/ssl/X509TrustManager;)LT0/g;
    .locals 1

    .line 1
    new-instance v0, Lq1/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lo1/g;->d(Ljavax/net/ssl/X509TrustManager;)Lq1/d;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p1}, Lq1/a;-><init>(Lq1/d;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public d(Ljavax/net/ssl/X509TrustManager;)Lq1/d;
    .locals 1

    .line 1
    new-instance v0, Lq1/b;

    .line 2
    .line 3
    invoke-interface {p1}, Ljavax/net/ssl/X509TrustManager;->getAcceptedIssuers()[Ljava/security/cert/X509Certificate;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p1}, Lq1/b;-><init>([Ljava/security/cert/X509Certificate;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public e(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 1
    return-void
.end method

.method public f(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2, p3}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public g()Ljavax/net/ssl/SSLContext;
    .locals 3

    .line 1
    :try_start_0
    const-string v0, "TLS"

    .line 2
    .line 3
    invoke-static {v0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    .line 4
    .line 5
    .line 6
    move-result-object v0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-object v0

    .line 8
    :catch_0
    move-exception v0

    .line 9
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    const-string v2, "No TLS provider"

    .line 12
    .line 13
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    throw v1
.end method

.method public h(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public i()Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lo1/g;->b:Ljava/util/logging/Logger;

    .line 2
    .line 3
    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Throwable;

    .line 12
    .line 13
    const-string v1, "response.body().close()"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return-object v0
.end method

.method public j(Ljava/lang/String;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method public k(ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    sget-object p1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    sget-object p1, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    .line 8
    .line 9
    :goto_0
    sget-object v0, Lo1/g;->b:Ljava/util/logging/Logger;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2, p3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public l(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    const-string v0, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);"

    .line 4
    .line 5
    invoke-static {p1, v0}, LQ0/E;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    const/4 v0, 0x5

    .line 10
    check-cast p2, Ljava/lang/Throwable;

    .line 11
    .line 12
    invoke-virtual {p0, v0, p1, p2}, Lo1/g;->k(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
