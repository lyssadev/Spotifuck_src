.class public abstract Lh1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[B

.field public static final b:[Ljava/lang/String;

.field public static final c:Lg1/D;

.field public static final d:Ljava/nio/charset/Charset;

.field public static final e:Ljava/util/TimeZone;

.field public static final f:LA/j;

.field public static final g:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [B

    .line 3
    .line 4
    sput-object v1, Lh1/c;->a:[B

    .line 5
    .line 6
    new-array v2, v0, [Ljava/lang/String;

    .line 7
    .line 8
    sput-object v2, Lh1/c;->b:[Ljava/lang/String;

    .line 9
    .line 10
    new-instance v2, Lr1/e;

    .line 11
    .line 12
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v1, v0}, Lr1/e;->u([BI)V

    .line 16
    .line 17
    .line 18
    int-to-long v0, v0

    .line 19
    new-instance v3, Lg1/D;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-direct {v3, v0, v1, v2, v4}, Lg1/D;-><init>(JLr1/g;I)V

    .line 23
    .line 24
    .line 25
    sput-object v3, Lh1/c;->c:Lg1/D;

    .line 26
    .line 27
    const-wide/16 v2, 0x0

    .line 28
    .line 29
    cmp-long v4, v0, v2

    .line 30
    .line 31
    if-ltz v4, :cond_0

    .line 32
    .line 33
    cmp-long v4, v0, v0

    .line 34
    .line 35
    if-gtz v4, :cond_0

    .line 36
    .line 37
    cmp-long v4, v2, v0

    .line 38
    .line 39
    if-ltz v4, :cond_0

    .line 40
    .line 41
    const-string v0, "efbbbf"

    .line 42
    .line 43
    invoke-static {v0}, Lr1/h;->c(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v0, "feff"

    .line 47
    .line 48
    invoke-static {v0}, Lr1/h;->c(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string v0, "fffe"

    .line 52
    .line 53
    invoke-static {v0}, Lr1/h;->c(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string v0, "0000ffff"

    .line 57
    .line 58
    invoke-static {v0}, Lr1/h;->c(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const-string v0, "ffff0000"

    .line 62
    .line 63
    invoke-static {v0}, Lr1/h;->c(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string v0, "UTF-8"

    .line 67
    .line 68
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sput-object v0, Lh1/c;->d:Ljava/nio/charset/Charset;

    .line 73
    .line 74
    const-string v0, "ISO-8859-1"

    .line 75
    .line 76
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 77
    .line 78
    .line 79
    const-string v0, "UTF-16BE"

    .line 80
    .line 81
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 82
    .line 83
    .line 84
    const-string v0, "UTF-16LE"

    .line 85
    .line 86
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 87
    .line 88
    .line 89
    const-string v0, "UTF-32BE"

    .line 90
    .line 91
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 92
    .line 93
    .line 94
    const-string v0, "UTF-32LE"

    .line 95
    .line 96
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 97
    .line 98
    .line 99
    const-string v0, "GMT"

    .line 100
    .line 101
    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    sput-object v0, Lh1/c;->e:Ljava/util/TimeZone;

    .line 106
    .line 107
    new-instance v0, LA/j;

    .line 108
    .line 109
    const/4 v1, 0x2

    .line 110
    invoke-direct {v0, v1}, LA/j;-><init>(I)V

    .line 111
    .line 112
    .line 113
    sput-object v0, Lh1/c;->f:LA/j;

    .line 114
    .line 115
    const-string v0, "([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)"

    .line 116
    .line 117
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    sput-object v0, Lh1/c;->g:Ljava/util/regex/Pattern;

    .line 122
    .line 123
    return-void

    .line 124
    :cond_0
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 125
    .line 126
    invoke-direct {v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    .line 127
    .line 128
    .line 129
    throw v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/AssertionError;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/AssertionError;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    :catch_0
    return-object v0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    const-string v0, ":"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v0, :cond_a

    .line 11
    .line 12
    const-string v0, "["

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const-string v0, "]"

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v4, 0x1

    .line 33
    sub-int/2addr v0, v4

    .line 34
    invoke-static {p0, v4, v0}, Lh1/c;->f(Ljava/lang/String;II)Ljava/net/InetAddress;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-static {p0, v2, v0}, Lh1/c;->f(Ljava/lang/String;II)Ljava/net/InetAddress;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :goto_0
    if-nez v0, :cond_1

    .line 48
    .line 49
    return-object v3

    .line 50
    :cond_1
    invoke-virtual {v0}, Ljava/net/InetAddress;->getAddress()[B

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    array-length v3, v0

    .line 55
    const/16 v4, 0x10

    .line 56
    .line 57
    if-ne v3, v4, :cond_9

    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    const/4 v3, 0x0

    .line 61
    :goto_1
    array-length v5, v0

    .line 62
    if-ge p0, v5, :cond_4

    .line 63
    .line 64
    move v5, p0

    .line 65
    :goto_2
    if-ge v5, v4, :cond_2

    .line 66
    .line 67
    aget-byte v6, v0, v5

    .line 68
    .line 69
    if-nez v6, :cond_2

    .line 70
    .line 71
    add-int/lit8 v6, v5, 0x1

    .line 72
    .line 73
    aget-byte v6, v0, v6

    .line 74
    .line 75
    if-nez v6, :cond_2

    .line 76
    .line 77
    add-int/lit8 v5, v5, 0x2

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    sub-int v6, v5, p0

    .line 81
    .line 82
    if-le v6, v3, :cond_3

    .line 83
    .line 84
    const/4 v7, 0x4

    .line 85
    if-lt v6, v7, :cond_3

    .line 86
    .line 87
    move v1, p0

    .line 88
    move v3, v6

    .line 89
    :cond_3
    add-int/lit8 p0, v5, 0x2

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_4
    new-instance p0, Lr1/e;

    .line 93
    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    .line 96
    .line 97
    :cond_5
    :goto_3
    array-length v5, v0

    .line 98
    if-ge v2, v5, :cond_8

    .line 99
    .line 100
    const/16 v5, 0x3a

    .line 101
    .line 102
    if-ne v2, v1, :cond_6

    .line 103
    .line 104
    invoke-virtual {p0, v5}, Lr1/e;->v(I)V

    .line 105
    .line 106
    .line 107
    add-int/2addr v2, v3

    .line 108
    if-ne v2, v4, :cond_5

    .line 109
    .line 110
    invoke-virtual {p0, v5}, Lr1/e;->v(I)V

    .line 111
    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_6
    if-lez v2, :cond_7

    .line 115
    .line 116
    invoke-virtual {p0, v5}, Lr1/e;->v(I)V

    .line 117
    .line 118
    .line 119
    :cond_7
    aget-byte v5, v0, v2

    .line 120
    .line 121
    and-int/lit16 v5, v5, 0xff

    .line 122
    .line 123
    shl-int/lit8 v5, v5, 0x8

    .line 124
    .line 125
    add-int/lit8 v6, v2, 0x1

    .line 126
    .line 127
    aget-byte v6, v0, v6

    .line 128
    .line 129
    and-int/lit16 v6, v6, 0xff

    .line 130
    .line 131
    or-int/2addr v5, v6

    .line 132
    int-to-long v5, v5

    .line 133
    invoke-virtual {p0, v5, v6}, Lr1/e;->x(J)V

    .line 134
    .line 135
    .line 136
    add-int/lit8 v2, v2, 0x2

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_8
    invoke-virtual {p0}, Lr1/e;->q()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    return-object p0

    .line 144
    :cond_9
    new-instance v0, Ljava/lang/AssertionError;

    .line 145
    .line 146
    const-string v1, "Invalid IPv6 address: \'"

    .line 147
    .line 148
    const-string v2, "\'"

    .line 149
    .line 150
    invoke-static {v1, p0, v2}, LQ0/E;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    throw v0

    .line 158
    :cond_a
    :try_start_0
    invoke-static {p0}, Ljava/net/IDN;->toASCII(Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 163
    .line 164
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-eqz v0, :cond_b

    .line 173
    .line 174
    return-object v3

    .line 175
    :cond_b
    :goto_4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-ge v2, v0, :cond_f

    .line 180
    .line 181
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    const/16 v4, 0x1f

    .line 186
    .line 187
    if-le v0, v4, :cond_e

    .line 188
    .line 189
    const/16 v4, 0x7f

    .line 190
    .line 191
    if-lt v0, v4, :cond_c

    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_c
    const-string v4, " #%/:?@[\\]"

    .line 195
    .line 196
    invoke-virtual {v4, v0}, Ljava/lang/String;->indexOf(I)I

    .line 197
    .line 198
    .line 199
    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 200
    if-eq v0, v1, :cond_d

    .line 201
    .line 202
    goto :goto_5

    .line 203
    :cond_d
    add-int/lit8 v2, v2, 0x1

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_e
    :goto_5
    return-object v3

    .line 207
    :cond_f
    return-object p0

    .line 208
    :catch_0
    return-object v3
.end method

.method public static c(Ljava/io/Closeable;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catch_0
    move-exception p0

    .line 8
    throw p0

    .line 9
    :catch_1
    :cond_0
    :goto_0
    return-void
.end method

.method public static d(Ljava/net/Socket;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catch_0
    move-exception p0

    .line 8
    throw p0

    .line 9
    :catch_1
    move-exception p0

    .line 10
    invoke-static {p0}, Lh1/c;->n(Ljava/lang/AssertionError;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    throw p0

    .line 18
    :catch_2
    :cond_1
    :goto_0
    return-void
.end method

.method public static e(C)I
    .locals 2

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    if-lt p0, v0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x39

    .line 6
    .line 7
    if-gt p0, v1, :cond_0

    .line 8
    .line 9
    sub-int/2addr p0, v0

    .line 10
    return p0

    .line 11
    :cond_0
    const/16 v0, 0x61

    .line 12
    .line 13
    if-lt p0, v0, :cond_1

    .line 14
    .line 15
    const/16 v0, 0x66

    .line 16
    .line 17
    if-gt p0, v0, :cond_1

    .line 18
    .line 19
    add-int/lit8 p0, p0, -0x57

    .line 20
    .line 21
    return p0

    .line 22
    :cond_1
    const/16 v0, 0x41

    .line 23
    .line 24
    if-lt p0, v0, :cond_2

    .line 25
    .line 26
    const/16 v0, 0x46

    .line 27
    .line 28
    if-gt p0, v0, :cond_2

    .line 29
    .line 30
    add-int/lit8 p0, p0, -0x37

    .line 31
    .line 32
    return p0

    .line 33
    :cond_2
    const/4 p0, -0x1

    .line 34
    return p0
.end method

.method public static f(Ljava/lang/String;II)Ljava/net/InetAddress;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    const/16 v2, 0x10

    .line 6
    .line 7
    new-array v3, v2, [B

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, -0x1

    .line 11
    move/from16 v6, p1

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, -0x1

    .line 15
    const/4 v9, -0x1

    .line 16
    :goto_0
    const/4 v10, 0x0

    .line 17
    if-ge v6, v1, :cond_2

    .line 18
    .line 19
    if-ne v7, v2, :cond_0

    .line 20
    .line 21
    return-object v10

    .line 22
    :cond_0
    add-int/lit8 v11, v6, 0x2

    .line 23
    .line 24
    const/16 v12, 0xff

    .line 25
    .line 26
    const/4 v13, 0x2

    .line 27
    if-gt v11, v1, :cond_4

    .line 28
    .line 29
    const-string v14, "::"

    .line 30
    .line 31
    invoke-virtual {v0, v6, v14, v4, v13}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 32
    .line 33
    .line 34
    move-result v14

    .line 35
    if-eqz v14, :cond_4

    .line 36
    .line 37
    if-eq v8, v5, :cond_1

    .line 38
    .line 39
    return-object v10

    .line 40
    :cond_1
    add-int/lit8 v7, v7, 0x2

    .line 41
    .line 42
    move v8, v7

    .line 43
    if-ne v11, v1, :cond_3

    .line 44
    .line 45
    :cond_2
    :goto_1
    const/16 v0, 0x10

    .line 46
    .line 47
    goto/16 :goto_a

    .line 48
    .line 49
    :cond_3
    move v9, v11

    .line 50
    goto/16 :goto_6

    .line 51
    .line 52
    :cond_4
    if-eqz v7, :cond_5

    .line 53
    .line 54
    const-string v11, ":"

    .line 55
    .line 56
    const/4 v14, 0x1

    .line 57
    invoke-virtual {v0, v6, v11, v4, v14}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 58
    .line 59
    .line 60
    move-result v11

    .line 61
    if-eqz v11, :cond_6

    .line 62
    .line 63
    add-int/lit8 v6, v6, 0x1

    .line 64
    .line 65
    :cond_5
    move v9, v6

    .line 66
    goto/16 :goto_6

    .line 67
    .line 68
    :cond_6
    const-string v11, "."

    .line 69
    .line 70
    invoke-virtual {v0, v6, v11, v4, v14}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    if-eqz v6, :cond_11

    .line 75
    .line 76
    add-int/lit8 v6, v7, -0x2

    .line 77
    .line 78
    move v11, v6

    .line 79
    :goto_2
    if-ge v9, v1, :cond_f

    .line 80
    .line 81
    if-ne v11, v2, :cond_7

    .line 82
    .line 83
    goto :goto_5

    .line 84
    :cond_7
    if-eq v11, v6, :cond_9

    .line 85
    .line 86
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 87
    .line 88
    .line 89
    move-result v13

    .line 90
    const/16 v14, 0x2e

    .line 91
    .line 92
    if-eq v13, v14, :cond_8

    .line 93
    .line 94
    goto :goto_5

    .line 95
    :cond_8
    add-int/lit8 v9, v9, 0x1

    .line 96
    .line 97
    :cond_9
    move v13, v9

    .line 98
    const/4 v14, 0x0

    .line 99
    :goto_3
    if-ge v13, v1, :cond_d

    .line 100
    .line 101
    invoke-virtual {v0, v13}, Ljava/lang/String;->charAt(I)C

    .line 102
    .line 103
    .line 104
    move-result v15

    .line 105
    const/16 v4, 0x30

    .line 106
    .line 107
    if-lt v15, v4, :cond_d

    .line 108
    .line 109
    const/16 v2, 0x39

    .line 110
    .line 111
    if-le v15, v2, :cond_a

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_a
    if-nez v14, :cond_b

    .line 115
    .line 116
    if-eq v9, v13, :cond_b

    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_b
    mul-int/lit8 v14, v14, 0xa

    .line 120
    .line 121
    add-int/2addr v14, v15

    .line 122
    sub-int/2addr v14, v4

    .line 123
    if-le v14, v12, :cond_c

    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_c
    add-int/lit8 v13, v13, 0x1

    .line 127
    .line 128
    const/16 v2, 0x10

    .line 129
    .line 130
    const/4 v4, 0x0

    .line 131
    goto :goto_3

    .line 132
    :cond_d
    :goto_4
    sub-int v2, v13, v9

    .line 133
    .line 134
    if-nez v2, :cond_e

    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_e
    add-int/lit8 v2, v11, 0x1

    .line 138
    .line 139
    int-to-byte v4, v14

    .line 140
    aput-byte v4, v3, v11

    .line 141
    .line 142
    move v11, v2

    .line 143
    move v9, v13

    .line 144
    const/16 v2, 0x10

    .line 145
    .line 146
    const/4 v4, 0x0

    .line 147
    goto :goto_2

    .line 148
    :cond_f
    add-int/lit8 v0, v7, 0x2

    .line 149
    .line 150
    if-eq v11, v0, :cond_10

    .line 151
    .line 152
    :goto_5
    return-object v10

    .line 153
    :cond_10
    add-int/lit8 v7, v7, 0x2

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_11
    return-object v10

    .line 157
    :goto_6
    move v6, v9

    .line 158
    const/4 v2, 0x0

    .line 159
    :goto_7
    if-ge v6, v1, :cond_13

    .line 160
    .line 161
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    invoke-static {v4}, Lh1/c;->e(C)I

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    if-ne v4, v5, :cond_12

    .line 170
    .line 171
    goto :goto_8

    .line 172
    :cond_12
    shl-int/lit8 v2, v2, 0x4

    .line 173
    .line 174
    add-int/2addr v2, v4

    .line 175
    add-int/lit8 v6, v6, 0x1

    .line 176
    .line 177
    goto :goto_7

    .line 178
    :cond_13
    :goto_8
    sub-int v4, v6, v9

    .line 179
    .line 180
    if-eqz v4, :cond_15

    .line 181
    .line 182
    const/4 v11, 0x4

    .line 183
    if-le v4, v11, :cond_14

    .line 184
    .line 185
    goto :goto_9

    .line 186
    :cond_14
    add-int/lit8 v4, v7, 0x1

    .line 187
    .line 188
    ushr-int/lit8 v10, v2, 0x8

    .line 189
    .line 190
    and-int/2addr v10, v12

    .line 191
    int-to-byte v10, v10

    .line 192
    aput-byte v10, v3, v7

    .line 193
    .line 194
    add-int/2addr v7, v13

    .line 195
    and-int/lit16 v2, v2, 0xff

    .line 196
    .line 197
    int-to-byte v2, v2

    .line 198
    aput-byte v2, v3, v4

    .line 199
    .line 200
    const/16 v2, 0x10

    .line 201
    .line 202
    const/4 v4, 0x0

    .line 203
    goto/16 :goto_0

    .line 204
    .line 205
    :cond_15
    :goto_9
    return-object v10

    .line 206
    :goto_a
    if-eq v7, v0, :cond_17

    .line 207
    .line 208
    if-ne v8, v5, :cond_16

    .line 209
    .line 210
    return-object v10

    .line 211
    :cond_16
    sub-int v1, v7, v8

    .line 212
    .line 213
    rsub-int/lit8 v2, v1, 0x10

    .line 214
    .line 215
    invoke-static {v3, v8, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 216
    .line 217
    .line 218
    rsub-int/lit8 v2, v7, 0x10

    .line 219
    .line 220
    add-int/2addr v2, v8

    .line 221
    const/4 v0, 0x0

    .line 222
    invoke-static {v3, v8, v2, v0}, Ljava/util/Arrays;->fill([BIIB)V

    .line 223
    .line 224
    .line 225
    :cond_17
    :try_start_0
    invoke-static {v3}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    .line 226
    .line 227
    .line 228
    move-result-object v0
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    .line 229
    return-object v0

    .line 230
    :catch_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 231
    .line 232
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 233
    .line 234
    .line 235
    throw v0
.end method

.method public static g(Ljava/lang/String;IIC)I
    .locals 1

    .line 1
    :goto_0
    if-ge p1, p2, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ne v0, p3, :cond_0

    .line 8
    .line 9
    return p1

    .line 10
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    return p2
.end method

.method public static h(Ljava/lang/String;IILjava/lang/String;)I
    .locals 2

    .line 1
    :goto_0
    if-ge p1, p2, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p3, v0}, Ljava/lang/String;->indexOf(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x1

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    return p1

    .line 15
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    return p2
.end method

.method public static i(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-eq p0, p1, :cond_1

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 15
    :goto_1
    return p0
.end method

.method public static j(Lg1/u;Z)Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lg1/u;->d:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, ":"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v2, p0, Lg1/u;->d:Ljava/lang/String;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v0, "["

    .line 14
    .line 15
    const-string v3, "]"

    .line 16
    .line 17
    invoke-static {v0, v2, v3}, LQ0/E;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    :cond_0
    iget v0, p0, Lg1/u;->e:I

    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    iget-object p0, p0, Lg1/u;->a:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {p0}, Lg1/u;->b(Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eq v0, p0, :cond_2

    .line 32
    .line 33
    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    :cond_2
    return-object v2
.end method

.method public static k(Ljava/util/List;)Ljava/util/List;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static varargs l([Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, [Ljava/lang/Object;

    .line 6
    .line 7
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static m(Ljava/util/Comparator;[Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    array-length v1, p1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    :goto_0
    if-ge v3, v1, :cond_2

    .line 10
    .line 11
    aget-object v4, p1, v3

    .line 12
    .line 13
    array-length v5, p2

    .line 14
    const/4 v6, 0x0

    .line 15
    :goto_1
    if-ge v6, v5, :cond_1

    .line 16
    .line 17
    aget-object v7, p2, v6

    .line 18
    .line 19
    invoke-interface {p0, v4, v7}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result v7

    .line 23
    if-nez v7, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    new-array p0, p0, [Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, [Ljava/lang/String;

    .line 46
    .line 47
    return-object p0
.end method

.method public static n(Ljava/lang/AssertionError;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v0, "getsockname failed"

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    :goto_0
    return p0
.end method

.method public static o(Ljava/util/Comparator;[Ljava/lang/String;[Ljava/lang/String;)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    if-eqz p2, :cond_3

    .line 5
    .line 6
    array-length v1, p1

    .line 7
    if-eqz v1, :cond_3

    .line 8
    .line 9
    array-length v1, p2

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    array-length v1, p1

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-ge v2, v1, :cond_3

    .line 16
    .line 17
    aget-object v3, p1, v2

    .line 18
    .line 19
    array-length v4, p2

    .line 20
    const/4 v5, 0x0

    .line 21
    :goto_1
    if-ge v5, v4, :cond_2

    .line 22
    .line 23
    aget-object v6, p2, v5

    .line 24
    .line 25
    invoke-interface {p0, v3, v6}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-nez v6, :cond_1

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_3
    :goto_2
    return v0
.end method

.method public static p(Lr1/v;ILjava/util/concurrent/TimeUnit;)Z
    .locals 11

    .line 1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-interface {p0}, Lr1/v;->a()Lr1/x;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, Lr1/x;->e()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const-wide v3, 0x7fffffffffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-interface {p0}, Lr1/v;->a()Lr1/x;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2}, Lr1/x;->c()J

    .line 25
    .line 26
    .line 27
    move-result-wide v5

    .line 28
    sub-long/2addr v5, v0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-wide v5, v3

    .line 31
    :goto_0
    invoke-interface {p0}, Lr1/v;->a()Lr1/x;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    int-to-long v7, p1

    .line 36
    invoke-virtual {p2, v7, v8}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 37
    .line 38
    .line 39
    move-result-wide p1

    .line 40
    invoke-static {v5, v6, p1, p2}, Ljava/lang/Math;->min(JJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide p1

    .line 44
    add-long/2addr p1, v0

    .line 45
    invoke-virtual {v2, p1, p2}, Lr1/x;->d(J)Lr1/x;

    .line 46
    .line 47
    .line 48
    :try_start_0
    new-instance p1, Lr1/e;

    .line 49
    .line 50
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    :goto_1
    const-wide/16 v7, 0x2000

    .line 54
    .line 55
    invoke-interface {p0, p1, v7, v8}, Lr1/v;->e(Lr1/e;J)J

    .line 56
    .line 57
    .line 58
    move-result-wide v7
    :try_end_0
    .catch Ljava/io/InterruptedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    const-wide/16 v9, -0x1

    .line 60
    .line 61
    cmp-long p2, v7, v9

    .line 62
    .line 63
    if-eqz p2, :cond_1

    .line 64
    .line 65
    :try_start_1
    iget-wide v7, p1, Lr1/e;->b:J

    .line 66
    .line 67
    invoke-virtual {p1, v7, v8}, Lr1/e;->s(J)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/InterruptedIOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :catch_0
    move-exception p1

    .line 72
    :try_start_2
    new-instance p2, Ljava/lang/AssertionError;

    .line 73
    .line 74
    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    throw p2
    :try_end_2
    .catch Ljava/io/InterruptedIOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 78
    :cond_1
    cmp-long p1, v5, v3

    .line 79
    .line 80
    if-nez p1, :cond_2

    .line 81
    .line 82
    invoke-interface {p0}, Lr1/v;->a()Lr1/x;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {p0}, Lr1/x;->a()Lr1/x;

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_2
    invoke-interface {p0}, Lr1/v;->a()Lr1/x;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    add-long/2addr v0, v5

    .line 95
    invoke-virtual {p0, v0, v1}, Lr1/x;->d(J)Lr1/x;

    .line 96
    .line 97
    .line 98
    :goto_2
    const/4 p0, 0x1

    .line 99
    return p0

    .line 100
    :catchall_0
    move-exception p1

    .line 101
    goto :goto_3

    .line 102
    :catch_1
    nop

    .line 103
    goto :goto_5

    .line 104
    :goto_3
    cmp-long p2, v5, v3

    .line 105
    .line 106
    if-nez p2, :cond_3

    .line 107
    .line 108
    invoke-interface {p0}, Lr1/v;->a()Lr1/x;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-virtual {p0}, Lr1/x;->a()Lr1/x;

    .line 113
    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_3
    invoke-interface {p0}, Lr1/v;->a()Lr1/x;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    add-long/2addr v0, v5

    .line 121
    invoke-virtual {p0, v0, v1}, Lr1/x;->d(J)Lr1/x;

    .line 122
    .line 123
    .line 124
    :goto_4
    throw p1

    .line 125
    :goto_5
    cmp-long p1, v5, v3

    .line 126
    .line 127
    if-nez p1, :cond_4

    .line 128
    .line 129
    invoke-interface {p0}, Lr1/v;->a()Lr1/x;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-virtual {p0}, Lr1/x;->a()Lr1/x;

    .line 134
    .line 135
    .line 136
    goto :goto_6

    .line 137
    :cond_4
    invoke-interface {p0}, Lr1/v;->a()Lr1/x;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    add-long/2addr v0, v5

    .line 142
    invoke-virtual {p0, v0, v1}, Lr1/x;->d(J)Lr1/x;

    .line 143
    .line 144
    .line 145
    :goto_6
    const/4 p0, 0x0

    .line 146
    return p0
.end method

.method public static q(Ljava/lang/String;II)I
    .locals 2

    .line 1
    :goto_0
    if-ge p1, p2, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x9

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    const/16 v1, 0xa

    .line 12
    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    const/16 v1, 0xc

    .line 16
    .line 17
    if-eq v0, v1, :cond_0

    .line 18
    .line 19
    const/16 v1, 0xd

    .line 20
    .line 21
    if-eq v0, v1, :cond_0

    .line 22
    .line 23
    const/16 v1, 0x20

    .line 24
    .line 25
    if-eq v0, v1, :cond_0

    .line 26
    .line 27
    return p1

    .line 28
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return p2
.end method

.method public static r(Ljava/lang/String;II)I
    .locals 2

    .line 1
    add-int/lit8 p2, p2, -0x1

    .line 2
    .line 3
    :goto_0
    if-lt p2, p1, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0, p2}, Ljava/lang/String;->charAt(I)C

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x9

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    const/16 v1, 0xa

    .line 14
    .line 15
    if-eq v0, v1, :cond_0

    .line 16
    .line 17
    const/16 v1, 0xc

    .line 18
    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    const/16 v1, 0xd

    .line 22
    .line 23
    if-eq v0, v1, :cond_0

    .line 24
    .line 25
    const/16 v1, 0x20

    .line 26
    .line 27
    if-eq v0, v1, :cond_0

    .line 28
    .line 29
    add-int/lit8 p2, p2, 0x1

    .line 30
    .line 31
    return p2

    .line 32
    :cond_0
    add-int/lit8 p2, p2, -0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return p1
.end method
