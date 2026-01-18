.class public final Lg1/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Lg1/p;

.field public static final f:Lg1/p;


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:[Ljava/lang/String;

.field public final d:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    const/16 v0, 0xd

    .line 2
    .line 3
    new-array v1, v0, [Lg1/m;

    .line 4
    .line 5
    sget-object v2, Lg1/m;->k:Lg1/m;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    aput-object v2, v1, v3

    .line 9
    .line 10
    sget-object v2, Lg1/m;->m:Lg1/m;

    .line 11
    .line 12
    const/4 v4, 0x1

    .line 13
    aput-object v2, v1, v4

    .line 14
    .line 15
    sget-object v2, Lg1/m;->l:Lg1/m;

    .line 16
    .line 17
    const/4 v5, 0x2

    .line 18
    aput-object v2, v1, v5

    .line 19
    .line 20
    sget-object v2, Lg1/m;->n:Lg1/m;

    .line 21
    .line 22
    const/4 v6, 0x3

    .line 23
    aput-object v2, v1, v6

    .line 24
    .line 25
    sget-object v2, Lg1/m;->p:Lg1/m;

    .line 26
    .line 27
    const/4 v7, 0x4

    .line 28
    aput-object v2, v1, v7

    .line 29
    .line 30
    sget-object v2, Lg1/m;->o:Lg1/m;

    .line 31
    .line 32
    const/4 v8, 0x5

    .line 33
    aput-object v2, v1, v8

    .line 34
    .line 35
    sget-object v2, Lg1/m;->i:Lg1/m;

    .line 36
    .line 37
    const/4 v8, 0x6

    .line 38
    aput-object v2, v1, v8

    .line 39
    .line 40
    sget-object v2, Lg1/m;->j:Lg1/m;

    .line 41
    .line 42
    const/4 v8, 0x7

    .line 43
    aput-object v2, v1, v8

    .line 44
    .line 45
    sget-object v2, Lg1/m;->g:Lg1/m;

    .line 46
    .line 47
    const/16 v8, 0x8

    .line 48
    .line 49
    aput-object v2, v1, v8

    .line 50
    .line 51
    sget-object v2, Lg1/m;->h:Lg1/m;

    .line 52
    .line 53
    const/16 v8, 0x9

    .line 54
    .line 55
    aput-object v2, v1, v8

    .line 56
    .line 57
    sget-object v2, Lg1/m;->e:Lg1/m;

    .line 58
    .line 59
    const/16 v8, 0xa

    .line 60
    .line 61
    aput-object v2, v1, v8

    .line 62
    .line 63
    sget-object v2, Lg1/m;->f:Lg1/m;

    .line 64
    .line 65
    const/16 v8, 0xb

    .line 66
    .line 67
    aput-object v2, v1, v8

    .line 68
    .line 69
    sget-object v2, Lg1/m;->d:Lg1/m;

    .line 70
    .line 71
    const/16 v8, 0xc

    .line 72
    .line 73
    aput-object v2, v1, v8

    .line 74
    .line 75
    new-instance v2, Lg1/o;

    .line 76
    .line 77
    invoke-direct {v2, v4}, Lg1/o;-><init>(Z)V

    .line 78
    .line 79
    .line 80
    new-array v8, v0, [Ljava/lang/String;

    .line 81
    .line 82
    const/4 v9, 0x0

    .line 83
    :goto_0
    if-ge v9, v0, :cond_0

    .line 84
    .line 85
    aget-object v10, v1, v9

    .line 86
    .line 87
    iget-object v10, v10, Lg1/m;->a:Ljava/lang/String;

    .line 88
    .line 89
    aput-object v10, v8, v9

    .line 90
    .line 91
    add-int/2addr v9, v4

    .line 92
    goto :goto_0

    .line 93
    :cond_0
    invoke-virtual {v2, v8}, Lg1/o;->a([Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    sget-object v0, Lg1/G;->e:Lg1/G;

    .line 97
    .line 98
    new-array v1, v7, [Lg1/G;

    .line 99
    .line 100
    sget-object v7, Lg1/G;->b:Lg1/G;

    .line 101
    .line 102
    aput-object v7, v1, v3

    .line 103
    .line 104
    sget-object v7, Lg1/G;->c:Lg1/G;

    .line 105
    .line 106
    aput-object v7, v1, v4

    .line 107
    .line 108
    sget-object v7, Lg1/G;->d:Lg1/G;

    .line 109
    .line 110
    aput-object v7, v1, v5

    .line 111
    .line 112
    aput-object v0, v1, v6

    .line 113
    .line 114
    invoke-virtual {v2, v1}, Lg1/o;->b([Lg1/G;)V

    .line 115
    .line 116
    .line 117
    iget-boolean v1, v2, Lg1/o;->a:Z

    .line 118
    .line 119
    const-string v5, "no TLS extensions for cleartext connections"

    .line 120
    .line 121
    if-eqz v1, :cond_2

    .line 122
    .line 123
    iput-boolean v4, v2, Lg1/o;->b:Z

    .line 124
    .line 125
    new-instance v1, Lg1/p;

    .line 126
    .line 127
    invoke-direct {v1, v2}, Lg1/p;-><init>(Lg1/o;)V

    .line 128
    .line 129
    .line 130
    sput-object v1, Lg1/p;->e:Lg1/p;

    .line 131
    .line 132
    new-instance v2, Lg1/o;

    .line 133
    .line 134
    invoke-direct {v2, v1}, Lg1/o;-><init>(Lg1/p;)V

    .line 135
    .line 136
    .line 137
    new-array v1, v4, [Lg1/G;

    .line 138
    .line 139
    aput-object v0, v1, v3

    .line 140
    .line 141
    invoke-virtual {v2, v1}, Lg1/o;->b([Lg1/G;)V

    .line 142
    .line 143
    .line 144
    iget-boolean v0, v2, Lg1/o;->a:Z

    .line 145
    .line 146
    if-eqz v0, :cond_1

    .line 147
    .line 148
    iput-boolean v4, v2, Lg1/o;->b:Z

    .line 149
    .line 150
    new-instance v0, Lg1/p;

    .line 151
    .line 152
    invoke-direct {v0, v2}, Lg1/p;-><init>(Lg1/o;)V

    .line 153
    .line 154
    .line 155
    new-instance v0, Lg1/o;

    .line 156
    .line 157
    invoke-direct {v0, v3}, Lg1/o;-><init>(Z)V

    .line 158
    .line 159
    .line 160
    new-instance v1, Lg1/p;

    .line 161
    .line 162
    invoke-direct {v1, v0}, Lg1/p;-><init>(Lg1/o;)V

    .line 163
    .line 164
    .line 165
    sput-object v1, Lg1/p;->f:Lg1/p;

    .line 166
    .line 167
    return-void

    .line 168
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 169
    .line 170
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw v0

    .line 174
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 175
    .line 176
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw v0
.end method

.method public constructor <init>(Lg1/o;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p1, Lg1/o;->a:Z

    .line 5
    .line 6
    iput-boolean v0, p0, Lg1/p;->a:Z

    .line 7
    .line 8
    iget-object v0, p1, Lg1/o;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, [Ljava/lang/String;

    .line 11
    .line 12
    iput-object v0, p0, Lg1/p;->c:[Ljava/lang/String;

    .line 13
    .line 14
    iget-object v0, p1, Lg1/o;->d:Ljava/io/Serializable;

    .line 15
    .line 16
    check-cast v0, [Ljava/lang/String;

    .line 17
    .line 18
    iput-object v0, p0, Lg1/p;->d:[Ljava/lang/String;

    .line 19
    .line 20
    iget-boolean p1, p1, Lg1/o;->b:Z

    .line 21
    .line 22
    iput-boolean p1, p0, Lg1/p;->b:Z

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(Ljavax/net/ssl/SSLSocket;)Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lg1/p;->a:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v0, p0, Lg1/p;->d:[Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    sget-object v2, Lh1/c;->f:LA/j;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-static {v2, v0, v3}, Lh1/c;->o(Ljava/util/Comparator;[Ljava/lang/String;[Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    return v1

    .line 24
    :cond_1
    iget-object v0, p0, Lg1/p;->c:[Ljava/lang/String;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    sget-object v2, Lg1/m;->b:Lg1/l;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {v2, v0, p1}, Lh1/c;->o(Ljava/util/Comparator;[Ljava/lang/String;[Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-nez p1, :cond_2

    .line 39
    .line 40
    return v1

    .line 41
    :cond_2
    const/4 p1, 0x1

    .line 42
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    instance-of v0, p1, Lg1/p;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v0, 0x1

    .line 8
    if-ne p1, p0, :cond_1

    .line 9
    .line 10
    return v0

    .line 11
    :cond_1
    check-cast p1, Lg1/p;

    .line 12
    .line 13
    iget-boolean v2, p1, Lg1/p;->a:Z

    .line 14
    .line 15
    iget-boolean v3, p0, Lg1/p;->a:Z

    .line 16
    .line 17
    if-eq v3, v2, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    if-eqz v3, :cond_5

    .line 21
    .line 22
    iget-object v2, p0, Lg1/p;->c:[Ljava/lang/String;

    .line 23
    .line 24
    iget-object v3, p1, Lg1/p;->c:[Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    iget-object v2, p0, Lg1/p;->d:[Ljava/lang/String;

    .line 34
    .line 35
    iget-object v3, p1, Lg1/p;->d:[Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    iget-boolean v2, p0, Lg1/p;->b:Z

    .line 45
    .line 46
    iget-boolean p1, p1, Lg1/p;->b:Z

    .line 47
    .line 48
    if-eq v2, p1, :cond_5

    .line 49
    .line 50
    return v1

    .line 51
    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lg1/p;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lg1/p;->c:[Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/16 v1, 0x20f

    .line 12
    .line 13
    add-int/2addr v1, v0

    .line 14
    mul-int/lit8 v1, v1, 0x1f

    .line 15
    .line 16
    iget-object v0, p0, Lg1/p;->d:[Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    add-int/2addr v1, v0

    .line 23
    mul-int/lit8 v1, v1, 0x1f

    .line 24
    .line 25
    iget-boolean v0, p0, Lg1/p;->b:Z

    .line 26
    .line 27
    xor-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    add-int/2addr v1, v0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/16 v1, 0x11

    .line 32
    .line 33
    :goto_0
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget-boolean v0, p0, Lg1/p;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "ConnectionSpec()"

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const-string v0, "[all enabled]"

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iget-object v2, p0, Lg1/p;->c:[Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    new-instance v3, Ljava/util/ArrayList;

    .line 16
    .line 17
    array-length v4, v2

    .line 18
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    array-length v4, v2

    .line 22
    const/4 v5, 0x0

    .line 23
    :goto_0
    if-ge v5, v4, :cond_1

    .line 24
    .line 25
    aget-object v6, v2, v5

    .line 26
    .line 27
    invoke-static {v6}, Lg1/m;->a(Ljava/lang/String;)Lg1/m;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    add-int/lit8 v5, v5, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move-object v2, v0

    .line 47
    :goto_1
    iget-object v3, p0, Lg1/p;->d:[Ljava/lang/String;

    .line 48
    .line 49
    if-eqz v3, :cond_4

    .line 50
    .line 51
    new-instance v0, Ljava/util/ArrayList;

    .line 52
    .line 53
    array-length v4, v3

    .line 54
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 55
    .line 56
    .line 57
    array-length v4, v3

    .line 58
    :goto_2
    if-ge v1, v4, :cond_3

    .line 59
    .line 60
    aget-object v5, v3, v1

    .line 61
    .line 62
    invoke-static {v5}, Lg1/G;->a(Ljava/lang/String;)Lg1/G;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    add-int/lit8 v1, v1, 0x1

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    const-string v3, "ConnectionSpec(cipherSuites="

    .line 83
    .line 84
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v2, ", tlsVersions="

    .line 91
    .line 92
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v0, ", supportsTlsExtensions="

    .line 99
    .line 100
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    iget-boolean v0, p0, Lg1/p;->b:Z

    .line 104
    .line 105
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v0, ")"

    .line 109
    .line 110
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    return-object v0
.end method
