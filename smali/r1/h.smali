.class public Lr1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Comparable;


# static fields
.field public static final d:[C

.field public static final e:Lr1/h;


# instance fields
.field public final a:[B

.field public transient b:I

.field public transient c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lr1/h;->d:[C

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    new-array v0, v0, [B

    .line 12
    .line 13
    invoke-static {v0}, Lr1/h;->i([B)Lr1/h;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lr1/h;->e:Lr1/h;

    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
    .end array-data
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr1/h;->a:[B

    .line 5
    .line 6
    return-void
.end method

.method public static b(Ljava/lang/String;)Lr1/h;
    .locals 15

    .line 1
    if-eqz p0, :cond_11

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    :goto_0
    const/16 v1, 0x9

    .line 8
    .line 9
    const/16 v2, 0x20

    .line 10
    .line 11
    const/16 v3, 0xd

    .line 12
    .line 13
    const/16 v4, 0xa

    .line 14
    .line 15
    if-lez v0, :cond_1

    .line 16
    .line 17
    add-int/lit8 v5, v0, -0x1

    .line 18
    .line 19
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    const/16 v6, 0x3d

    .line 24
    .line 25
    if-eq v5, v6, :cond_0

    .line 26
    .line 27
    if-eq v5, v4, :cond_0

    .line 28
    .line 29
    if-eq v5, v3, :cond_0

    .line 30
    .line 31
    if-eq v5, v2, :cond_0

    .line 32
    .line 33
    if-eq v5, v1, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    :goto_1
    int-to-long v5, v0

    .line 40
    const-wide/16 v7, 0x6

    .line 41
    .line 42
    mul-long v5, v5, v7

    .line 43
    .line 44
    const-wide/16 v7, 0x8

    .line 45
    .line 46
    div-long/2addr v5, v7

    .line 47
    long-to-int v6, v5

    .line 48
    new-array v5, v6, [B

    .line 49
    .line 50
    const/4 v7, 0x0

    .line 51
    const/4 v8, 0x0

    .line 52
    const/4 v9, 0x0

    .line 53
    const/4 v10, 0x0

    .line 54
    const/4 v11, 0x0

    .line 55
    :goto_2
    const/4 v12, 0x0

    .line 56
    if-ge v8, v0, :cond_b

    .line 57
    .line 58
    invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C

    .line 59
    .line 60
    .line 61
    move-result v13

    .line 62
    const/16 v14, 0x41

    .line 63
    .line 64
    if-lt v13, v14, :cond_2

    .line 65
    .line 66
    const/16 v14, 0x5a

    .line 67
    .line 68
    if-gt v13, v14, :cond_2

    .line 69
    .line 70
    add-int/lit8 v13, v13, -0x41

    .line 71
    .line 72
    goto :goto_6

    .line 73
    :cond_2
    const/16 v14, 0x61

    .line 74
    .line 75
    if-lt v13, v14, :cond_3

    .line 76
    .line 77
    const/16 v14, 0x7a

    .line 78
    .line 79
    if-gt v13, v14, :cond_3

    .line 80
    .line 81
    add-int/lit8 v13, v13, -0x47

    .line 82
    .line 83
    goto :goto_6

    .line 84
    :cond_3
    const/16 v14, 0x30

    .line 85
    .line 86
    if-lt v13, v14, :cond_4

    .line 87
    .line 88
    const/16 v14, 0x39

    .line 89
    .line 90
    if-gt v13, v14, :cond_4

    .line 91
    .line 92
    add-int/lit8 v13, v13, 0x4

    .line 93
    .line 94
    goto :goto_6

    .line 95
    :cond_4
    const/16 v14, 0x2b

    .line 96
    .line 97
    if-eq v13, v14, :cond_9

    .line 98
    .line 99
    const/16 v14, 0x2d

    .line 100
    .line 101
    if-ne v13, v14, :cond_5

    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_5
    const/16 v14, 0x2f

    .line 105
    .line 106
    if-eq v13, v14, :cond_8

    .line 107
    .line 108
    const/16 v14, 0x5f

    .line 109
    .line 110
    if-ne v13, v14, :cond_6

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_6
    if-eq v13, v4, :cond_a

    .line 114
    .line 115
    if-eq v13, v3, :cond_a

    .line 116
    .line 117
    if-eq v13, v2, :cond_a

    .line 118
    .line 119
    if-ne v13, v1, :cond_7

    .line 120
    .line 121
    goto :goto_7

    .line 122
    :cond_7
    :goto_3
    move-object v5, v12

    .line 123
    goto :goto_9

    .line 124
    :cond_8
    :goto_4
    const/16 v13, 0x3f

    .line 125
    .line 126
    goto :goto_6

    .line 127
    :cond_9
    :goto_5
    const/16 v13, 0x3e

    .line 128
    .line 129
    :goto_6
    shl-int/lit8 v10, v10, 0x6

    .line 130
    .line 131
    int-to-byte v12, v13

    .line 132
    or-int/2addr v10, v12

    .line 133
    add-int/lit8 v9, v9, 0x1

    .line 134
    .line 135
    rem-int/lit8 v12, v9, 0x4

    .line 136
    .line 137
    if-nez v12, :cond_a

    .line 138
    .line 139
    add-int/lit8 v12, v11, 0x1

    .line 140
    .line 141
    shr-int/lit8 v13, v10, 0x10

    .line 142
    .line 143
    int-to-byte v13, v13

    .line 144
    aput-byte v13, v5, v11

    .line 145
    .line 146
    add-int/lit8 v13, v11, 0x2

    .line 147
    .line 148
    shr-int/lit8 v14, v10, 0x8

    .line 149
    .line 150
    int-to-byte v14, v14

    .line 151
    aput-byte v14, v5, v12

    .line 152
    .line 153
    add-int/lit8 v11, v11, 0x3

    .line 154
    .line 155
    int-to-byte v12, v10

    .line 156
    aput-byte v12, v5, v13

    .line 157
    .line 158
    :cond_a
    :goto_7
    add-int/lit8 v8, v8, 0x1

    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_b
    rem-int/lit8 v9, v9, 0x4

    .line 162
    .line 163
    const/4 p0, 0x1

    .line 164
    if-ne v9, p0, :cond_c

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_c
    const/4 p0, 0x2

    .line 168
    if-ne v9, p0, :cond_d

    .line 169
    .line 170
    shl-int/lit8 p0, v10, 0xc

    .line 171
    .line 172
    add-int/lit8 v0, v11, 0x1

    .line 173
    .line 174
    shr-int/lit8 p0, p0, 0x10

    .line 175
    .line 176
    int-to-byte p0, p0

    .line 177
    aput-byte p0, v5, v11

    .line 178
    .line 179
    move v11, v0

    .line 180
    goto :goto_8

    .line 181
    :cond_d
    const/4 p0, 0x3

    .line 182
    if-ne v9, p0, :cond_e

    .line 183
    .line 184
    shl-int/lit8 p0, v10, 0x6

    .line 185
    .line 186
    add-int/lit8 v0, v11, 0x1

    .line 187
    .line 188
    shr-int/lit8 v1, p0, 0x10

    .line 189
    .line 190
    int-to-byte v1, v1

    .line 191
    aput-byte v1, v5, v11

    .line 192
    .line 193
    add-int/lit8 v11, v11, 0x2

    .line 194
    .line 195
    shr-int/lit8 p0, p0, 0x8

    .line 196
    .line 197
    int-to-byte p0, p0

    .line 198
    aput-byte p0, v5, v0

    .line 199
    .line 200
    :cond_e
    :goto_8
    if-ne v11, v6, :cond_f

    .line 201
    .line 202
    goto :goto_9

    .line 203
    :cond_f
    new-array p0, v11, [B

    .line 204
    .line 205
    invoke-static {v5, v7, p0, v7, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 206
    .line 207
    .line 208
    move-object v5, p0

    .line 209
    :goto_9
    if-eqz v5, :cond_10

    .line 210
    .line 211
    new-instance v12, Lr1/h;

    .line 212
    .line 213
    invoke-direct {v12, v5}, Lr1/h;-><init>([B)V

    .line 214
    .line 215
    .line 216
    :cond_10
    return-object v12

    .line 217
    :cond_11
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 218
    .line 219
    const-string v0, "base64 == null"

    .line 220
    .line 221
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    throw p0
.end method

.method public static c(Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    rem-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    div-int/lit8 v0, v0, 0x2

    .line 14
    .line 15
    new-array v1, v0, [B

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    if-ge v2, v0, :cond_0

    .line 19
    .line 20
    mul-int/lit8 v3, v2, 0x2

    .line 21
    .line 22
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    invoke-static {v4}, Lr1/h;->d(C)I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    shl-int/lit8 v4, v4, 0x4

    .line 31
    .line 32
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-static {v3}, Lr1/h;->d(C)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    add-int/2addr v3, v4

    .line 43
    int-to-byte v3, v3

    .line 44
    aput-byte v3, v1, v2

    .line 45
    .line 46
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-static {v1}, Lr1/h;->i([B)Lr1/h;

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 54
    .line 55
    const-string v1, "Unexpected hex string: "

    .line 56
    .line 57
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v0
.end method

.method public static d(C)I
    .locals 3

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
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 34
    .line 35
    new-instance v1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v2, "Unexpected hex digit: "

    .line 38
    .line 39
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v0
.end method

.method public static f(Ljava/lang/String;)Lr1/h;
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    new-instance v0, Lr1/h;

    .line 4
    .line 5
    sget-object v1, Lr1/y;->a:Ljava/nio/charset/Charset;

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Lr1/h;-><init>([B)V

    .line 12
    .line 13
    .line 14
    iput-object p0, v0, Lr1/h;->c:Ljava/lang/String;

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 18
    .line 19
    const-string v0, "s == null"

    .line 20
    .line 21
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p0
.end method

.method public static varargs i([B)Lr1/h;
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    new-instance v0, Lr1/h;

    .line 4
    .line 5
    invoke-virtual {p0}, [B->clone()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, [B

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lr1/h;-><init>([B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 16
    .line 17
    const-string v0, "data == null"

    .line 18
    .line 19
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 12

    .line 1
    sget-object v0, Lr1/s;->c:[B

    .line 2
    .line 3
    iget-object v1, p0, Lr1/h;->a:[B

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    const/4 v3, 0x2

    .line 7
    add-int/2addr v2, v3

    .line 8
    div-int/lit8 v2, v2, 0x3

    .line 9
    .line 10
    mul-int/lit8 v2, v2, 0x4

    .line 11
    .line 12
    new-array v2, v2, [B

    .line 13
    .line 14
    array-length v4, v1

    .line 15
    array-length v5, v1

    .line 16
    rem-int/lit8 v5, v5, 0x3

    .line 17
    .line 18
    sub-int/2addr v4, v5

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    :goto_0
    if-ge v5, v4, :cond_0

    .line 22
    .line 23
    add-int/lit8 v7, v6, 0x1

    .line 24
    .line 25
    aget-byte v8, v1, v5

    .line 26
    .line 27
    and-int/lit16 v8, v8, 0xff

    .line 28
    .line 29
    shr-int/2addr v8, v3

    .line 30
    aget-byte v8, v0, v8

    .line 31
    .line 32
    aput-byte v8, v2, v6

    .line 33
    .line 34
    add-int/lit8 v8, v6, 0x2

    .line 35
    .line 36
    aget-byte v9, v1, v5

    .line 37
    .line 38
    and-int/lit8 v9, v9, 0x3

    .line 39
    .line 40
    shl-int/lit8 v9, v9, 0x4

    .line 41
    .line 42
    add-int/lit8 v10, v5, 0x1

    .line 43
    .line 44
    aget-byte v11, v1, v10

    .line 45
    .line 46
    and-int/lit16 v11, v11, 0xff

    .line 47
    .line 48
    shr-int/lit8 v11, v11, 0x4

    .line 49
    .line 50
    or-int/2addr v9, v11

    .line 51
    aget-byte v9, v0, v9

    .line 52
    .line 53
    aput-byte v9, v2, v7

    .line 54
    .line 55
    add-int/lit8 v7, v6, 0x3

    .line 56
    .line 57
    aget-byte v9, v1, v10

    .line 58
    .line 59
    and-int/lit8 v9, v9, 0xf

    .line 60
    .line 61
    shl-int/2addr v9, v3

    .line 62
    add-int/lit8 v10, v5, 0x2

    .line 63
    .line 64
    aget-byte v11, v1, v10

    .line 65
    .line 66
    and-int/lit16 v11, v11, 0xff

    .line 67
    .line 68
    shr-int/lit8 v11, v11, 0x6

    .line 69
    .line 70
    or-int/2addr v9, v11

    .line 71
    aget-byte v9, v0, v9

    .line 72
    .line 73
    aput-byte v9, v2, v8

    .line 74
    .line 75
    add-int/lit8 v6, v6, 0x4

    .line 76
    .line 77
    aget-byte v8, v1, v10

    .line 78
    .line 79
    and-int/lit8 v8, v8, 0x3f

    .line 80
    .line 81
    aget-byte v8, v0, v8

    .line 82
    .line 83
    aput-byte v8, v2, v7

    .line 84
    .line 85
    add-int/lit8 v5, v5, 0x3

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    array-length v5, v1

    .line 89
    rem-int/lit8 v5, v5, 0x3

    .line 90
    .line 91
    const/4 v7, 0x1

    .line 92
    const/16 v8, 0x3d

    .line 93
    .line 94
    if-eq v5, v7, :cond_2

    .line 95
    .line 96
    if-eq v5, v3, :cond_1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    add-int/lit8 v5, v6, 0x1

    .line 100
    .line 101
    aget-byte v9, v1, v4

    .line 102
    .line 103
    and-int/lit16 v9, v9, 0xff

    .line 104
    .line 105
    shr-int/2addr v9, v3

    .line 106
    aget-byte v9, v0, v9

    .line 107
    .line 108
    aput-byte v9, v2, v6

    .line 109
    .line 110
    add-int/lit8 v9, v6, 0x2

    .line 111
    .line 112
    aget-byte v10, v1, v4

    .line 113
    .line 114
    and-int/lit8 v10, v10, 0x3

    .line 115
    .line 116
    shl-int/lit8 v10, v10, 0x4

    .line 117
    .line 118
    add-int/2addr v4, v7

    .line 119
    aget-byte v7, v1, v4

    .line 120
    .line 121
    and-int/lit16 v7, v7, 0xff

    .line 122
    .line 123
    shr-int/lit8 v7, v7, 0x4

    .line 124
    .line 125
    or-int/2addr v7, v10

    .line 126
    aget-byte v7, v0, v7

    .line 127
    .line 128
    aput-byte v7, v2, v5

    .line 129
    .line 130
    add-int/lit8 v6, v6, 0x3

    .line 131
    .line 132
    aget-byte v1, v1, v4

    .line 133
    .line 134
    and-int/lit8 v1, v1, 0xf

    .line 135
    .line 136
    shl-int/2addr v1, v3

    .line 137
    aget-byte v0, v0, v1

    .line 138
    .line 139
    aput-byte v0, v2, v9

    .line 140
    .line 141
    aput-byte v8, v2, v6

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_2
    add-int/lit8 v5, v6, 0x1

    .line 145
    .line 146
    aget-byte v7, v1, v4

    .line 147
    .line 148
    and-int/lit16 v7, v7, 0xff

    .line 149
    .line 150
    shr-int/lit8 v3, v7, 0x2

    .line 151
    .line 152
    aget-byte v3, v0, v3

    .line 153
    .line 154
    aput-byte v3, v2, v6

    .line 155
    .line 156
    add-int/lit8 v3, v6, 0x2

    .line 157
    .line 158
    aget-byte v1, v1, v4

    .line 159
    .line 160
    and-int/lit8 v1, v1, 0x3

    .line 161
    .line 162
    shl-int/lit8 v1, v1, 0x4

    .line 163
    .line 164
    aget-byte v0, v0, v1

    .line 165
    .line 166
    aput-byte v0, v2, v5

    .line 167
    .line 168
    add-int/lit8 v6, v6, 0x3

    .line 169
    .line 170
    aput-byte v8, v2, v3

    .line 171
    .line 172
    aput-byte v8, v2, v6

    .line 173
    .line 174
    :goto_1
    :try_start_0
    new-instance v0, Ljava/lang/String;

    .line 175
    .line 176
    const-string v1, "US-ASCII"

    .line 177
    .line 178
    invoke-direct {v0, v2, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 179
    .line 180
    .line 181
    return-object v0

    .line 182
    :catch_0
    move-exception v0

    .line 183
    new-instance v1, Ljava/lang/AssertionError;

    .line 184
    .line 185
    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    throw v1
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 9

    .line 1
    check-cast p1, Lr1/h;

    .line 2
    .line 3
    invoke-virtual {p0}, Lr1/h;->l()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p1}, Lr1/h;->l()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    :goto_0
    const/4 v5, 0x1

    .line 18
    const/4 v6, -0x1

    .line 19
    if-ge v4, v2, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, v4}, Lr1/h;->g(I)B

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    and-int/lit16 v7, v7, 0xff

    .line 26
    .line 27
    invoke-virtual {p1, v4}, Lr1/h;->g(I)B

    .line 28
    .line 29
    .line 30
    move-result v8

    .line 31
    and-int/lit16 v8, v8, 0xff

    .line 32
    .line 33
    if-ne v7, v8, :cond_0

    .line 34
    .line 35
    add-int/lit8 v4, v4, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    if-ge v7, v8, :cond_1

    .line 39
    .line 40
    :goto_1
    const/4 v3, -0x1

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    const/4 v3, 0x1

    .line 43
    goto :goto_2

    .line 44
    :cond_2
    if-ne v0, v1, :cond_3

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_3
    if-ge v0, v1, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :goto_2
    return v3
.end method

.method public final e(Ljava/lang/String;)Lr1/h;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lr1/h;->a:[B

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->digest([B)[B

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lr1/h;->i([B)Lr1/h;

    .line 12
    .line 13
    .line 14
    move-result-object p1
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    return-object p1

    .line 16
    :catch_0
    move-exception p1

    .line 17
    new-instance v0, Ljava/lang/AssertionError;

    .line 18
    .line 19
    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    throw v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lr1/h;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    check-cast p1, Lr1/h;

    .line 11
    .line 12
    invoke-virtual {p1}, Lr1/h;->l()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iget-object v3, p0, Lr1/h;->a:[B

    .line 17
    .line 18
    array-length v4, v3

    .line 19
    if-ne v1, v4, :cond_1

    .line 20
    .line 21
    array-length v1, v3

    .line 22
    invoke-virtual {p1, v2, v3, v2, v1}, Lr1/h;->j(I[BII)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v0, 0x0

    .line 30
    :goto_0
    return v0
.end method

.method public g(I)B
    .locals 1

    .line 1
    iget-object v0, p0, Lr1/h;->a:[B

    .line 2
    .line 3
    aget-byte p1, v0, p1

    .line 4
    .line 5
    return p1
.end method

.method public h()Ljava/lang/String;
    .locals 9

    .line 1
    iget-object v0, p0, Lr1/h;->a:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    mul-int/lit8 v1, v1, 0x2

    .line 5
    .line 6
    new-array v1, v1, [C

    .line 7
    .line 8
    array-length v2, v0

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    :goto_0
    if-ge v3, v2, :cond_0

    .line 12
    .line 13
    aget-byte v5, v0, v3

    .line 14
    .line 15
    add-int/lit8 v6, v4, 0x1

    .line 16
    .line 17
    sget-object v7, Lr1/h;->d:[C

    .line 18
    .line 19
    shr-int/lit8 v8, v5, 0x4

    .line 20
    .line 21
    and-int/lit8 v8, v8, 0xf

    .line 22
    .line 23
    aget-char v8, v7, v8

    .line 24
    .line 25
    aput-char v8, v1, v4

    .line 26
    .line 27
    add-int/lit8 v4, v4, 0x2

    .line 28
    .line 29
    and-int/lit8 v5, v5, 0xf

    .line 30
    .line 31
    aget-char v5, v7, v5

    .line 32
    .line 33
    aput-char v5, v1, v6

    .line 34
    .line 35
    add-int/lit8 v3, v3, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-instance v0, Ljava/lang/String;

    .line 39
    .line 40
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    .line 41
    .line 42
    .line 43
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Lr1/h;->b:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lr1/h;->a:[B

    .line 7
    .line 8
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iput v0, p0, Lr1/h;->b:I

    .line 13
    .line 14
    :goto_0
    return v0
.end method

.method public j(I[BII)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-ltz p1, :cond_1

    .line 4
    .line 5
    iget-object v2, p0, Lr1/h;->a:[B

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    sub-int/2addr v3, p4

    .line 9
    if-gt p1, v3, :cond_1

    .line 10
    .line 11
    if-ltz p3, :cond_1

    .line 12
    .line 13
    array-length v3, p2

    .line 14
    sub-int/2addr v3, p4

    .line 15
    if-gt p3, v3, :cond_1

    .line 16
    .line 17
    sget-object v3, Lr1/y;->a:Ljava/nio/charset/Charset;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    :goto_0
    if-ge v3, p4, :cond_2

    .line 21
    .line 22
    add-int v4, v3, p1

    .line 23
    .line 24
    aget-byte v4, v2, v4

    .line 25
    .line 26
    add-int v5, v3, p3

    .line 27
    .line 28
    aget-byte v5, p2, v5

    .line 29
    .line 30
    if-eq v4, v5, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    add-int/2addr v3, v0

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    :goto_1
    const/4 v0, 0x0

    .line 36
    :cond_2
    return v0
.end method

.method public k(Lr1/h;I)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lr1/h;->a:[B

    .line 3
    .line 4
    invoke-virtual {p1, v0, v1, v0, p2}, Lr1/h;->j(I[BII)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    return p1
.end method

.method public l()I
    .locals 1

    .line 1
    iget-object v0, p0, Lr1/h;->a:[B

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    return v0
.end method

.method public m()Lr1/h;
    .locals 4

    .line 1
    iget-object v0, p0, Lr1/h;->a:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/16 v2, 0x40

    .line 5
    .line 6
    if-gt v2, v1, :cond_1

    .line 7
    .line 8
    array-length v1, v0

    .line 9
    if-ne v2, v1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-array v1, v2, [B

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lr1/h;

    .line 19
    .line 20
    invoke-direct {v0, v1}, Lr1/h;-><init>([B)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 25
    .line 26
    new-instance v2, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v3, "endIndex > length("

    .line 29
    .line 30
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    array-length v0, v0

    .line 34
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v0, ")"

    .line 38
    .line 39
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v1
.end method

.method public n()Lr1/h;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lr1/h;->a:[B

    .line 3
    .line 4
    array-length v2, v1

    .line 5
    if-ge v0, v2, :cond_5

    .line 6
    .line 7
    aget-byte v2, v1, v0

    .line 8
    .line 9
    const/16 v3, 0x41

    .line 10
    .line 11
    if-lt v2, v3, :cond_4

    .line 12
    .line 13
    const/16 v4, 0x5a

    .line 14
    .line 15
    if-le v2, v4, :cond_0

    .line 16
    .line 17
    goto :goto_3

    .line 18
    :cond_0
    invoke-virtual {v1}, [B->clone()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, [B

    .line 23
    .line 24
    add-int/lit8 v5, v0, 0x1

    .line 25
    .line 26
    add-int/lit8 v2, v2, 0x20

    .line 27
    .line 28
    int-to-byte v2, v2

    .line 29
    aput-byte v2, v1, v0

    .line 30
    .line 31
    :goto_1
    array-length v0, v1

    .line 32
    if-ge v5, v0, :cond_3

    .line 33
    .line 34
    aget-byte v0, v1, v5

    .line 35
    .line 36
    if-lt v0, v3, :cond_2

    .line 37
    .line 38
    if-le v0, v4, :cond_1

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_1
    add-int/lit8 v0, v0, 0x20

    .line 42
    .line 43
    int-to-byte v0, v0

    .line 44
    aput-byte v0, v1, v5

    .line 45
    .line 46
    :cond_2
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_3
    new-instance v0, Lr1/h;

    .line 50
    .line 51
    invoke-direct {v0, v1}, Lr1/h;-><init>([B)V

    .line 52
    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_4
    :goto_3
    add-int/lit8 v0, v0, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_5
    return-object p0
.end method

.method public o()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lr1/h;->c:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/String;

    .line 7
    .line 8
    iget-object v1, p0, Lr1/h;->a:[B

    .line 9
    .line 10
    sget-object v2, Lr1/y;->a:Ljava/nio/charset/Charset;

    .line 11
    .line 12
    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lr1/h;->c:Ljava/lang/String;

    .line 16
    .line 17
    :goto_0
    return-object v0
.end method

.method public p(Lr1/e;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr1/h;->a:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    invoke-virtual {p1, v0, v1}, Lr1/e;->u([BI)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    .line 1
    iget-object v0, p0, Lr1/h;->a:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    const-string v0, "[size=0]"

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lr1/h;->o()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    :goto_0
    const/4 v6, -0x1

    .line 21
    const/16 v7, 0x40

    .line 22
    .line 23
    if-ge v4, v2, :cond_5

    .line 24
    .line 25
    if-ne v5, v7, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-virtual {v1, v4}, Ljava/lang/String;->codePointAt(I)I

    .line 29
    .line 30
    .line 31
    move-result v8

    .line 32
    invoke-static {v8}, Ljava/lang/Character;->isISOControl(I)Z

    .line 33
    .line 34
    .line 35
    move-result v9

    .line 36
    if-eqz v9, :cond_2

    .line 37
    .line 38
    const/16 v9, 0xa

    .line 39
    .line 40
    if-eq v8, v9, :cond_2

    .line 41
    .line 42
    const/16 v9, 0xd

    .line 43
    .line 44
    if-ne v8, v9, :cond_3

    .line 45
    .line 46
    :cond_2
    const v9, 0xfffd

    .line 47
    .line 48
    .line 49
    if-ne v8, v9, :cond_4

    .line 50
    .line 51
    :cond_3
    const/4 v4, -0x1

    .line 52
    goto :goto_1

    .line 53
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 54
    .line 55
    invoke-static {v8}, Ljava/lang/Character;->charCount(I)I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    add-int/2addr v4, v6

    .line 60
    goto :goto_0

    .line 61
    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    :goto_1
    const-string v2, "\u2026]"

    .line 66
    .line 67
    const-string v5, "[size="

    .line 68
    .line 69
    const-string v8, "]"

    .line 70
    .line 71
    if-ne v4, v6, :cond_7

    .line 72
    .line 73
    array-length v1, v0

    .line 74
    if-gt v1, v7, :cond_6

    .line 75
    .line 76
    new-instance v0, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    const-string v1, "[hex="

    .line 79
    .line 80
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lr1/h;->h()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    goto :goto_2

    .line 98
    :cond_6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    array-length v0, v0

    .line 104
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v0, " hex="

    .line 108
    .line 109
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Lr1/h;->m()Lr1/h;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0}, Lr1/h;->h()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    :goto_2
    return-object v0

    .line 131
    :cond_7
    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    const-string v6, "\\"

    .line 136
    .line 137
    const-string v7, "\\\\"

    .line 138
    .line 139
    invoke-virtual {v3, v6, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    const-string v6, "\n"

    .line 144
    .line 145
    const-string v7, "\\n"

    .line 146
    .line 147
    invoke-virtual {v3, v6, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    const-string v6, "\r"

    .line 152
    .line 153
    const-string v7, "\\r"

    .line 154
    .line 155
    invoke-virtual {v3, v6, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-ge v4, v1, :cond_8

    .line 164
    .line 165
    new-instance v1, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    array-length v0, v0

    .line 171
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string v0, " text="

    .line 175
    .line 176
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    goto :goto_3

    .line 190
    :cond_8
    const-string v0, "[text="

    .line 191
    .line 192
    invoke-static {v0, v3, v8}, LQ0/E;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    :goto_3
    return-object v0
.end method
