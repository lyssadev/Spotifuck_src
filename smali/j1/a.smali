.class public final Lj1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;

.field public b:I

.field public c:Z

.field public d:Z


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lj1/a;->b:I

    .line 6
    .line 7
    iput-object p1, p0, Lj1/a;->a:Ljava/util/List;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Ljavax/net/ssl/SSLSocket;)Lg1/p;
    .locals 13

    .line 1
    const/4 v0, 0x1

    .line 2
    iget v1, p0, Lj1/a;->b:I

    .line 3
    .line 4
    iget-object v2, p0, Lj1/a;->a:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    :goto_0
    if-ge v1, v3, :cond_1

    .line 11
    .line 12
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    check-cast v4, Lg1/p;

    .line 17
    .line 18
    invoke-virtual {v4, p1}, Lg1/p;->a(Ljavax/net/ssl/SSLSocket;)Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-eqz v5, :cond_0

    .line 23
    .line 24
    add-int/2addr v1, v0

    .line 25
    iput v1, p0, Lj1/a;->b:I

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    add-int/2addr v1, v0

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v4, 0x0

    .line 31
    :goto_1
    if-eqz v4, :cond_b

    .line 32
    .line 33
    iget v1, p0, Lj1/a;->b:I

    .line 34
    .line 35
    :goto_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    const/4 v5, 0x0

    .line 40
    if-ge v1, v3, :cond_3

    .line 41
    .line 42
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Lg1/p;

    .line 47
    .line 48
    invoke-virtual {v3, p1}, Lg1/p;->a(Ljavax/net/ssl/SSLSocket;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    goto :goto_3

    .line 56
    :cond_2
    add-int/2addr v1, v0

    .line 57
    goto :goto_2

    .line 58
    :cond_3
    const/4 v1, 0x0

    .line 59
    :goto_3
    iput-boolean v1, p0, Lj1/a;->c:Z

    .line 60
    .line 61
    sget-object v1, Lg1/b;->e:Lg1/b;

    .line 62
    .line 63
    iget-boolean v2, p0, Lj1/a;->d:Z

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget-object v1, v4, Lg1/p;->c:[Ljava/lang/String;

    .line 69
    .line 70
    if-eqz v1, :cond_4

    .line 71
    .line 72
    sget-object v3, Lg1/m;->b:Lg1/l;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-static {v3, v6, v1}, Lh1/c;->m(Ljava/util/Comparator;[Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    goto :goto_4

    .line 83
    :cond_4
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    :goto_4
    iget-object v3, v4, Lg1/p;->d:[Ljava/lang/String;

    .line 88
    .line 89
    if-eqz v3, :cond_5

    .line 90
    .line 91
    sget-object v6, Lh1/c;->f:LA/j;

    .line 92
    .line 93
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    invoke-static {v6, v7, v3}, Lh1/c;->m(Ljava/util/Comparator;[Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    goto :goto_5

    .line 102
    :cond_5
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    :goto_5
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getSupportedCipherSuites()[Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    sget-object v7, Lg1/m;->b:Lg1/l;

    .line 111
    .line 112
    sget-object v8, Lh1/c;->a:[B

    .line 113
    .line 114
    array-length v8, v6

    .line 115
    const/4 v9, 0x0

    .line 116
    :goto_6
    const/4 v10, -0x1

    .line 117
    if-ge v9, v8, :cond_7

    .line 118
    .line 119
    aget-object v11, v6, v9

    .line 120
    .line 121
    const-string v12, "TLS_FALLBACK_SCSV"

    .line 122
    .line 123
    invoke-virtual {v7, v11, v12}, Lg1/l;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 124
    .line 125
    .line 126
    move-result v11

    .line 127
    if-nez v11, :cond_6

    .line 128
    .line 129
    goto :goto_7

    .line 130
    :cond_6
    add-int/2addr v9, v0

    .line 131
    goto :goto_6

    .line 132
    :cond_7
    const/4 v9, -0x1

    .line 133
    :goto_7
    if-eqz v2, :cond_8

    .line 134
    .line 135
    if-eq v9, v10, :cond_8

    .line 136
    .line 137
    aget-object v2, v6, v9

    .line 138
    .line 139
    array-length v6, v1

    .line 140
    add-int/2addr v0, v6

    .line 141
    new-array v0, v0, [Ljava/lang/String;

    .line 142
    .line 143
    array-length v7, v1

    .line 144
    invoke-static {v1, v5, v0, v5, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 145
    .line 146
    .line 147
    aput-object v2, v0, v6

    .line 148
    .line 149
    move-object v1, v0

    .line 150
    :cond_8
    new-instance v0, Lg1/o;

    .line 151
    .line 152
    invoke-direct {v0, v4}, Lg1/o;-><init>(Lg1/p;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v1}, Lg1/o;->a([Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v3}, Lg1/o;->c([Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    new-instance v1, Lg1/p;

    .line 162
    .line 163
    invoke-direct {v1, v0}, Lg1/p;-><init>(Lg1/o;)V

    .line 164
    .line 165
    .line 166
    iget-object v0, v1, Lg1/p;->d:[Ljava/lang/String;

    .line 167
    .line 168
    if-eqz v0, :cond_9

    .line 169
    .line 170
    invoke-virtual {p1, v0}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    :cond_9
    iget-object v0, v1, Lg1/p;->c:[Ljava/lang/String;

    .line 174
    .line 175
    if-eqz v0, :cond_a

    .line 176
    .line 177
    invoke-virtual {p1, v0}, Ljavax/net/ssl/SSLSocket;->setEnabledCipherSuites([Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    :cond_a
    return-object v4

    .line 181
    :cond_b
    new-instance v0, Ljava/net/UnknownServiceException;

    .line 182
    .line 183
    new-instance v1, Ljava/lang/StringBuilder;

    .line 184
    .line 185
    const-string v3, "Unable to find acceptable protocols. isFallback="

    .line 186
    .line 187
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    iget-boolean v3, p0, Lj1/a;->d:Z

    .line 191
    .line 192
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    const-string v3, ", modes="

    .line 196
    .line 197
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    const-string v2, ", supported protocols="

    .line 204
    .line 205
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    invoke-direct {v0, p1}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw v0
.end method
