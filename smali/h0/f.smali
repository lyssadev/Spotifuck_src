.class public abstract Lh0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LK0/e;

.field public static final b:[B

.field public static final c:[B

.field public static final d:[B

.field public static final e:[B

.field public static final f:[B

.field public static final g:[B

.field public static final h:[B

.field public static final i:[B

.field public static final j:[B


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    new-instance v1, LK0/e;

    .line 3
    .line 4
    const/16 v2, 0x14

    .line 5
    .line 6
    invoke-direct {v1, v2}, LK0/e;-><init>(I)V

    .line 7
    .line 8
    .line 9
    sput-object v1, Lh0/f;->a:LK0/e;

    .line 10
    .line 11
    new-array v1, v0, [B

    .line 12
    .line 13
    fill-array-data v1, :array_0

    .line 14
    .line 15
    .line 16
    sput-object v1, Lh0/f;->b:[B

    .line 17
    .line 18
    new-array v1, v0, [B

    .line 19
    .line 20
    fill-array-data v1, :array_1

    .line 21
    .line 22
    .line 23
    sput-object v1, Lh0/f;->c:[B

    .line 24
    .line 25
    new-array v1, v0, [B

    .line 26
    .line 27
    fill-array-data v1, :array_2

    .line 28
    .line 29
    .line 30
    sput-object v1, Lh0/f;->d:[B

    .line 31
    .line 32
    new-array v1, v0, [B

    .line 33
    .line 34
    fill-array-data v1, :array_3

    .line 35
    .line 36
    .line 37
    sput-object v1, Lh0/f;->e:[B

    .line 38
    .line 39
    new-array v1, v0, [B

    .line 40
    .line 41
    fill-array-data v1, :array_4

    .line 42
    .line 43
    .line 44
    sput-object v1, Lh0/f;->f:[B

    .line 45
    .line 46
    new-array v1, v0, [B

    .line 47
    .line 48
    fill-array-data v1, :array_5

    .line 49
    .line 50
    .line 51
    sput-object v1, Lh0/f;->g:[B

    .line 52
    .line 53
    new-array v1, v0, [B

    .line 54
    .line 55
    fill-array-data v1, :array_6

    .line 56
    .line 57
    .line 58
    sput-object v1, Lh0/f;->h:[B

    .line 59
    .line 60
    new-array v1, v0, [B

    .line 61
    .line 62
    fill-array-data v1, :array_7

    .line 63
    .line 64
    .line 65
    sput-object v1, Lh0/f;->i:[B

    .line 66
    .line 67
    new-array v0, v0, [B

    .line 68
    .line 69
    fill-array-data v0, :array_8

    .line 70
    .line 71
    .line 72
    sput-object v0, Lh0/f;->j:[B

    .line 73
    .line 74
    return-void

    .line 75
    :array_0
    .array-data 1
        0x70t
        0x72t
        0x6ft
        0x0t
    .end array-data

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    :array_1
    .array-data 1
        0x70t
        0x72t
        0x6dt
        0x0t
    .end array-data

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    :array_2
    .array-data 1
        0x30t
        0x31t
        0x35t
        0x0t
    .end array-data

    .line 88
    .line 89
    :array_3
    .array-data 1
        0x30t
        0x31t
        0x30t
        0x0t
    .end array-data

    :array_4
    .array-data 1
        0x30t
        0x30t
        0x39t
        0x0t
    .end array-data

    :array_5
    .array-data 1
        0x30t
        0x30t
        0x35t
        0x0t
    .end array-data

    :array_6
    .array-data 1
        0x30t
        0x30t
        0x31t
        0x0t
    .end array-data

    :array_7
    .array-data 1
        0x30t
        0x30t
        0x31t
        0x0t
    .end array-data

    :array_8
    .array-data 1
        0x30t
        0x30t
        0x32t
        0x0t
    .end array-data
.end method

.method public static a([B)[B
    .locals 3

    .line 1
    new-instance v0, Ljava/util/zip/Deflater;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Ljava/util/zip/Deflater;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 10
    .line 11
    .line 12
    :try_start_0
    new-instance v2, Ljava/util/zip/DeflaterOutputStream;

    .line 13
    .line 14
    invoke-direct {v2, v1, v0}, Ljava/util/zip/DeflaterOutputStream;-><init>(Ljava/io/OutputStream;Ljava/util/zip/Deflater;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    :try_start_1
    invoke-virtual {v2, p0}, Ljava/io/OutputStream;->write([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 18
    .line 19
    .line 20
    :try_start_2
    invoke-virtual {v2}, Ljava/util/zip/DeflaterOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/zip/Deflater;->end()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto :goto_1

    .line 33
    :catchall_1
    move-exception p0

    .line 34
    :try_start_3
    invoke-virtual {v2}, Ljava/util/zip/DeflaterOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_2
    move-exception v1

    .line 39
    :try_start_4
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 43
    :goto_1
    invoke-virtual {v0}, Ljava/util/zip/Deflater;->end()V

    .line 44
    .line 45
    .line 46
    throw p0
.end method

.method public static b([Lh0/c;[B)[B
    .locals 8

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x0

    .line 5
    :goto_0
    if-ge v2, v0, :cond_0

    .line 6
    .line 7
    aget-object v4, p0, v2

    .line 8
    .line 9
    iget-object v5, v4, Lh0/c;->a:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v6, v4, Lh0/c;->b:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v5, v6, p1}, Lh0/f;->d(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 18
    .line 19
    invoke-virtual {v5, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    array-length v5, v5

    .line 24
    add-int/lit8 v5, v5, 0x10

    .line 25
    .line 26
    iget v6, v4, Lh0/c;->e:I

    .line 27
    .line 28
    mul-int/lit8 v6, v6, 0x2

    .line 29
    .line 30
    add-int/2addr v6, v5

    .line 31
    iget v5, v4, Lh0/c;->f:I

    .line 32
    .line 33
    add-int/2addr v6, v5

    .line 34
    iget v4, v4, Lh0/c;->g:I

    .line 35
    .line 36
    mul-int/lit8 v4, v4, 0x2

    .line 37
    .line 38
    add-int/lit8 v4, v4, 0x7

    .line 39
    .line 40
    and-int/lit8 v4, v4, -0x8

    .line 41
    .line 42
    div-int/lit8 v4, v4, 0x8

    .line 43
    .line 44
    add-int/2addr v4, v6

    .line 45
    add-int/2addr v3, v4

    .line 46
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 50
    .line 51
    invoke-direct {v0, v3}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 52
    .line 53
    .line 54
    sget-object v2, Lh0/f;->f:[B

    .line 55
    .line 56
    invoke-static {p1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_1

    .line 61
    .line 62
    array-length v2, p0

    .line 63
    :goto_1
    if-ge v1, v2, :cond_3

    .line 64
    .line 65
    aget-object v4, p0, v1

    .line 66
    .line 67
    iget-object v5, v4, Lh0/c;->a:Ljava/lang/String;

    .line 68
    .line 69
    iget-object v6, v4, Lh0/c;->b:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v5, v6, p1}, Lh0/f;->d(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-static {v0, v4, v5}, Lh0/f;->q(Ljava/io/ByteArrayOutputStream;Lh0/c;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v0, v4}, Lh0/f;->p(Ljava/io/ByteArrayOutputStream;Lh0/c;)V

    .line 79
    .line 80
    .line 81
    add-int/lit8 v1, v1, 0x1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    array-length v2, p0

    .line 85
    const/4 v4, 0x0

    .line 86
    :goto_2
    if-ge v4, v2, :cond_2

    .line 87
    .line 88
    aget-object v5, p0, v4

    .line 89
    .line 90
    iget-object v6, v5, Lh0/c;->a:Ljava/lang/String;

    .line 91
    .line 92
    iget-object v7, v5, Lh0/c;->b:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v6, v7, p1}, Lh0/f;->d(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    invoke-static {v0, v5, v6}, Lh0/f;->q(Ljava/io/ByteArrayOutputStream;Lh0/c;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    add-int/lit8 v4, v4, 0x1

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_2
    array-length p1, p0

    .line 105
    :goto_3
    if-ge v1, p1, :cond_3

    .line 106
    .line 107
    aget-object v2, p0, v1

    .line 108
    .line 109
    invoke-static {v0, v2}, Lh0/f;->p(Ljava/io/ByteArrayOutputStream;Lh0/c;)V

    .line 110
    .line 111
    .line 112
    add-int/lit8 v1, v1, 0x1

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_3
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    if-ne p0, v3, :cond_4

    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0

    .line 126
    :cond_4
    new-instance p0, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    const-string p1, "The bytes saved do not match expectation. actual="

    .line 129
    .line 130
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string p1, " expected="

    .line 141
    .line 142
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 153
    .line 154
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw p1
.end method

.method public static c(Ljava/io/File;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/4 v0, 0x0

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    return v0

    .line 16
    :cond_0
    array-length v2, p0

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x1

    .line 19
    :goto_0
    if-ge v3, v2, :cond_2

    .line 20
    .line 21
    aget-object v5, p0, v3

    .line 22
    .line 23
    invoke-static {v5}, Lh0/f;->c(Ljava/io/File;)Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_1

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    const/4 v4, 0x1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/4 v4, 0x0

    .line 34
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    return v4

    .line 38
    :cond_3
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 39
    .line 40
    .line 41
    return v1
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;
    .locals 6

    .line 1
    sget-object v0, Lh0/f;->h:[B

    .line 2
    .line 3
    invoke-static {p2, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    sget-object v2, Lh0/f;->g:[B

    .line 8
    .line 9
    const-string v3, "!"

    .line 10
    .line 11
    const-string v4, ":"

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    :goto_0
    move-object v1, v4

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    invoke-static {p2, v2}, Ljava/util/Arrays;->equals([B[B)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move-object v1, v3

    .line 25
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-gtz v5, :cond_4

    .line 30
    .line 31
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    invoke-virtual {p1, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_3

    .line 47
    .line 48
    invoke-virtual {p1, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :cond_3
    :goto_2
    return-object p1

    .line 53
    :cond_4
    const-string v5, "classes.dex"

    .line 54
    .line 55
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-eqz v5, :cond_5

    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_5
    invoke-virtual {p1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-nez v5, :cond_a

    .line 67
    .line 68
    invoke-virtual {p1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-eqz v5, :cond_6

    .line 73
    .line 74
    goto :goto_5

    .line 75
    :cond_6
    const-string v1, ".apk"

    .line 76
    .line 77
    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_7

    .line 82
    .line 83
    return-object p1

    .line 84
    :cond_7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-static {p2, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-eqz p0, :cond_8

    .line 97
    .line 98
    :goto_3
    move-object v3, v4

    .line 99
    goto :goto_4

    .line 100
    :cond_8
    invoke-static {p2, v2}, Ljava/util/Arrays;->equals([B[B)Z

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    if-eqz p0, :cond_9

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_9
    :goto_4
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0

    .line 118
    :cond_a
    :goto_5
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    if-eqz p0, :cond_b

    .line 123
    .line 124
    invoke-virtual {p1, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    goto :goto_6

    .line 129
    :cond_b
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    if-eqz p0, :cond_c

    .line 134
    .line 135
    invoke-virtual {p1, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    :cond_c
    :goto_6
    return-object p1
.end method

.method public static e(Landroid/content/pm/PackageInfo;Ljava/io/File;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    const-string v1, "profileinstaller_profileWrittenFor_lastUpdateTime.dat"

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    new-instance p1, Ljava/io/DataOutputStream;

    .line 9
    .line 10
    new-instance v1, Ljava/io/FileOutputStream;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p1, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    :try_start_1
    iget-wide v0, p0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    .line 22
    .line 23
    :try_start_2
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    :try_start_3
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_1
    move-exception p1

    .line 33
    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    throw p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 37
    :catch_0
    :goto_1
    return-void
.end method

.method public static f(Ljava/io/InputStream;I)[B
    .locals 3

    .line 1
    new-array v0, p1, [B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :goto_0
    if-ge v1, p1, :cond_1

    .line 5
    .line 6
    sub-int v2, p1, v1

    .line 7
    .line 8
    invoke-virtual {p0, v0, v1, v2}, Ljava/io/InputStream;->read([BII)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-ltz v2, :cond_0

    .line 13
    .line 14
    add-int/2addr v1, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string p0, "Not enough bytes to read: "

    .line 17
    .line 18
    invoke-static {p0, p1}, LQ0/E;->e(Ljava/lang/String;I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    return-object v0
.end method

.method public static g(Ljava/io/ByteArrayInputStream;I)[I
    .locals 5

    .line 1
    new-array v0, p1, [I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v1, p1, :cond_0

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    invoke-static {p0, v3}, Lh0/f;->m(Ljava/io/InputStream;I)J

    .line 9
    .line 10
    .line 11
    move-result-wide v3

    .line 12
    long-to-int v4, v3

    .line 13
    add-int/2addr v2, v4

    .line 14
    aput v2, v0, v1

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-object v0
.end method

.method public static h(Ljava/io/FileInputStream;II)[B
    .locals 8

    .line 1
    new-instance v0, Ljava/util/zip/Inflater;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/zip/Inflater;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-array v1, p2, [B

    .line 7
    .line 8
    const/16 v2, 0x800

    .line 9
    .line 10
    new-array v2, v2, [B

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    :goto_0
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->finished()Z

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    if-nez v6, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->needsDictionary()Z

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    if-nez v6, :cond_1

    .line 26
    .line 27
    if-ge v4, p1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, v2}, Ljava/io/InputStream;->read([B)I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-ltz v6, :cond_0

    .line 34
    .line 35
    invoke-virtual {v0, v2, v3, v6}, Ljava/util/zip/Inflater;->setInput([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    sub-int v7, p2, v5

    .line 39
    .line 40
    :try_start_1
    invoke-virtual {v0, v1, v5, v7}, Ljava/util/zip/Inflater;->inflate([BII)I

    .line 41
    .line 42
    .line 43
    move-result v7
    :try_end_1
    .catch Ljava/util/zip/DataFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    add-int/2addr v5, v7

    .line 45
    add-int/2addr v4, v6

    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    goto :goto_1

    .line 49
    :catch_0
    move-exception p0

    .line 50
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string p2, "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "

    .line 66
    .line 67
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string p1, " bytes"

    .line 74
    .line 75
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 83
    .line 84
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p1

    .line 88
    :cond_1
    if-ne v4, p1, :cond_3

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->finished()Z

    .line 91
    .line 92
    .line 93
    move-result p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 94
    if-eqz p0, :cond_2

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    .line 97
    .line 98
    .line 99
    return-object v1

    .line 100
    :cond_2
    :try_start_3
    const-string p0, "Inflater did not finish"

    .line 101
    .line 102
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 103
    .line 104
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw p1

    .line 108
    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    const-string p2, "Didn\'t read enough bytes during decompression. expected="

    .line 114
    .line 115
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string p1, " actual="

    .line 122
    .line 123
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 134
    .line 135
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 139
    :goto_1
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    .line 140
    .line 141
    .line 142
    throw p0
.end method

.method public static i(Ljava/io/FileInputStream;[B[B[Lh0/c;)[Lh0/c;
    .locals 6

    .line 1
    sget-object v0, Lh0/f;->i:[B

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const-string v2, "Unsupported meta version"

    .line 8
    .line 9
    const-string v3, "Content found after the end of file"

    .line 10
    .line 11
    const/4 v4, 0x4

    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    sget-object v1, Lh0/f;->d:[B

    .line 15
    .line 16
    invoke-static {v1, p2}, Ljava/util/Arrays;->equals([B[B)Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-nez p2, :cond_2

    .line 21
    .line 22
    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    invoke-static {p0, p1}, Lh0/f;->m(Ljava/io/InputStream;I)J

    .line 30
    .line 31
    .line 32
    move-result-wide p1

    .line 33
    long-to-int p2, p1

    .line 34
    invoke-static {p0, v4}, Lh0/f;->m(Ljava/io/InputStream;I)J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    invoke-static {p0, v4}, Lh0/f;->m(Ljava/io/InputStream;I)J

    .line 39
    .line 40
    .line 41
    move-result-wide v4

    .line 42
    long-to-int p1, v4

    .line 43
    long-to-int v1, v0

    .line 44
    invoke-static {p0, p1, v1}, Lh0/f;->h(Ljava/io/FileInputStream;II)[B

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-gtz p0, :cond_0

    .line 53
    .line 54
    new-instance p0, Ljava/io/ByteArrayInputStream;

    .line 55
    .line 56
    invoke-direct {p0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 57
    .line 58
    .line 59
    :try_start_0
    invoke-static {p0, p2, p3}, Lh0/f;->j(Ljava/io/ByteArrayInputStream;I[Lh0/c;)[Lh0/c;

    .line 60
    .line 61
    .line 62
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 64
    .line 65
    .line 66
    return-object p1

    .line 67
    :catchall_0
    move-exception p1

    .line 68
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :catchall_1
    move-exception p0

    .line 73
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    :goto_0
    throw p1

    .line 77
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 78
    .line 79
    invoke-direct {p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p0

    .line 83
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 84
    .line 85
    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p0

    .line 89
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 90
    .line 91
    const-string p1, "Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher"

    .line 92
    .line 93
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p0

    .line 97
    :cond_3
    sget-object v0, Lh0/f;->j:[B

    .line 98
    .line 99
    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-eqz p1, :cond_5

    .line 104
    .line 105
    const/4 p1, 0x2

    .line 106
    invoke-static {p0, p1}, Lh0/f;->m(Ljava/io/InputStream;I)J

    .line 107
    .line 108
    .line 109
    move-result-wide v0

    .line 110
    long-to-int p1, v0

    .line 111
    invoke-static {p0, v4}, Lh0/f;->m(Ljava/io/InputStream;I)J

    .line 112
    .line 113
    .line 114
    move-result-wide v0

    .line 115
    invoke-static {p0, v4}, Lh0/f;->m(Ljava/io/InputStream;I)J

    .line 116
    .line 117
    .line 118
    move-result-wide v4

    .line 119
    long-to-int v2, v4

    .line 120
    long-to-int v1, v0

    .line 121
    invoke-static {p0, v2, v1}, Lh0/f;->h(Ljava/io/FileInputStream;II)[B

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    if-gtz p0, :cond_4

    .line 130
    .line 131
    new-instance p0, Ljava/io/ByteArrayInputStream;

    .line 132
    .line 133
    invoke-direct {p0, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 134
    .line 135
    .line 136
    :try_start_2
    invoke-static {p0, p2, p1, p3}, Lh0/f;->k(Ljava/io/ByteArrayInputStream;[BI[Lh0/c;)[Lh0/c;

    .line 137
    .line 138
    .line 139
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 140
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 141
    .line 142
    .line 143
    return-object p1

    .line 144
    :catchall_2
    move-exception p1

    .line 145
    :try_start_3
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :catchall_3
    move-exception p0

    .line 150
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 151
    .line 152
    .line 153
    :goto_1
    throw p1

    .line 154
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 155
    .line 156
    invoke-direct {p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw p0

    .line 160
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 161
    .line 162
    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw p0
.end method

.method public static j(Ljava/io/ByteArrayInputStream;I[Lh0/c;)[Lh0/c;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-array p0, v1, [Lh0/c;

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    array-length v0, p2

    .line 12
    if-ne p1, v0, :cond_4

    .line 13
    .line 14
    new-array v0, p1, [Ljava/lang/String;

    .line 15
    .line 16
    new-array v2, p1, [I

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    :goto_0
    if-ge v3, p1, :cond_1

    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    invoke-static {p0, v4}, Lh0/f;->m(Ljava/io/InputStream;I)J

    .line 23
    .line 24
    .line 25
    move-result-wide v5

    .line 26
    long-to-int v6, v5

    .line 27
    invoke-static {p0, v4}, Lh0/f;->m(Ljava/io/InputStream;I)J

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    long-to-int v5, v4

    .line 32
    aput v5, v2, v3

    .line 33
    .line 34
    new-instance v4, Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {p0, v6}, Lh0/f;->f(Ljava/io/InputStream;I)[B

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 41
    .line 42
    invoke-direct {v4, v5, v6}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 43
    .line 44
    .line 45
    aput-object v4, v0, v3

    .line 46
    .line 47
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    :goto_1
    if-ge v1, p1, :cond_3

    .line 51
    .line 52
    aget-object v3, p2, v1

    .line 53
    .line 54
    iget-object v4, v3, Lh0/c;->b:Ljava/lang/String;

    .line 55
    .line 56
    aget-object v5, v0, v1

    .line 57
    .line 58
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_2

    .line 63
    .line 64
    aget v4, v2, v1

    .line 65
    .line 66
    iput v4, v3, Lh0/c;->e:I

    .line 67
    .line 68
    invoke-static {p0, v4}, Lh0/f;->g(Ljava/io/ByteArrayInputStream;I)[I

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    iput-object v4, v3, Lh0/c;->h:[I

    .line 73
    .line 74
    add-int/lit8 v1, v1, 0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 78
    .line 79
    const-string p1, "Order of dexfiles in metadata did not match baseline"

    .line 80
    .line 81
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p0

    .line 85
    :cond_3
    return-object p2

    .line 86
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 87
    .line 88
    const-string p1, "Mismatched number of dex files found in metadata"

    .line 89
    .line 90
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw p0
.end method

.method public static k(Ljava/io/ByteArrayInputStream;[BI[Lh0/c;)[Lh0/c;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-array p0, v1, [Lh0/c;

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    array-length v0, p3

    .line 12
    if-ne p2, v0, :cond_9

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-ge v0, p2, :cond_8

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    invoke-static {p0, v2}, Lh0/f;->m(Ljava/io/InputStream;I)J

    .line 19
    .line 20
    .line 21
    invoke-static {p0, v2}, Lh0/f;->m(Ljava/io/InputStream;I)J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    long-to-int v4, v3

    .line 26
    new-instance v3, Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {p0, v4}, Lh0/f;->f(Ljava/io/InputStream;I)[B

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 33
    .line 34
    invoke-direct {v3, v4, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 35
    .line 36
    .line 37
    const/4 v4, 0x4

    .line 38
    invoke-static {p0, v4}, Lh0/f;->m(Ljava/io/InputStream;I)J

    .line 39
    .line 40
    .line 41
    move-result-wide v4

    .line 42
    invoke-static {p0, v2}, Lh0/f;->m(Ljava/io/InputStream;I)J

    .line 43
    .line 44
    .line 45
    move-result-wide v6

    .line 46
    long-to-int v2, v6

    .line 47
    array-length v6, p3

    .line 48
    const/4 v7, 0x0

    .line 49
    if-gtz v6, :cond_1

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_1
    const-string v6, "!"

    .line 53
    .line 54
    invoke-virtual {v3, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-gez v6, :cond_2

    .line 59
    .line 60
    const-string v6, ":"

    .line 61
    .line 62
    invoke-virtual {v3, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    :cond_2
    if-lez v6, :cond_3

    .line 67
    .line 68
    add-int/lit8 v6, v6, 0x1

    .line 69
    .line 70
    invoke-virtual {v3, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    goto :goto_1

    .line 75
    :cond_3
    move-object v6, v3

    .line 76
    :goto_1
    const/4 v8, 0x0

    .line 77
    :goto_2
    array-length v9, p3

    .line 78
    if-ge v8, v9, :cond_5

    .line 79
    .line 80
    aget-object v9, p3, v8

    .line 81
    .line 82
    iget-object v9, v9, Lh0/c;->b:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v9

    .line 88
    if-eqz v9, :cond_4

    .line 89
    .line 90
    aget-object v7, p3, v8

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_4
    add-int/lit8 v8, v8, 0x1

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_5
    :goto_3
    if-eqz v7, :cond_7

    .line 97
    .line 98
    iput-wide v4, v7, Lh0/c;->d:J

    .line 99
    .line 100
    invoke-static {p0, v2}, Lh0/f;->g(Ljava/io/ByteArrayInputStream;I)[I

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    sget-object v4, Lh0/f;->h:[B

    .line 105
    .line 106
    invoke-static {p1, v4}, Ljava/util/Arrays;->equals([B[B)Z

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    if-eqz v4, :cond_6

    .line 111
    .line 112
    iput v2, v7, Lh0/c;->e:I

    .line 113
    .line 114
    iput-object v3, v7, Lh0/c;->h:[I

    .line 115
    .line 116
    :cond_6
    add-int/lit8 v0, v0, 0x1

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_7
    const-string p0, "Missing profile key: "

    .line 120
    .line 121
    invoke-virtual {p0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 126
    .line 127
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw p1

    .line 131
    :cond_8
    return-object p3

    .line 132
    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 133
    .line 134
    const-string p1, "Mismatched number of dex files found in metadata"

    .line 135
    .line 136
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw p0
.end method

.method public static l(Ljava/io/FileInputStream;[BLjava/lang/String;)[Lh0/c;
    .locals 5

    .line 1
    sget-object v0, Lh0/f;->e:[B

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-static {p0, p1}, Lh0/f;->m(Ljava/io/InputStream;I)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    long-to-int p1, v0

    .line 15
    const/4 v0, 0x4

    .line 16
    invoke-static {p0, v0}, Lh0/f;->m(Ljava/io/InputStream;I)J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    invoke-static {p0, v0}, Lh0/f;->m(Ljava/io/InputStream;I)J

    .line 21
    .line 22
    .line 23
    move-result-wide v3

    .line 24
    long-to-int v0, v3

    .line 25
    long-to-int v2, v1

    .line 26
    invoke-static {p0, v0, v2}, Lh0/f;->h(Ljava/io/FileInputStream;II)[B

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-gtz p0, :cond_0

    .line 35
    .line 36
    new-instance p0, Ljava/io/ByteArrayInputStream;

    .line 37
    .line 38
    invoke-direct {p0, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 39
    .line 40
    .line 41
    :try_start_0
    invoke-static {p0, p2, p1}, Lh0/f;->n(Ljava/io/ByteArrayInputStream;Ljava/lang/String;I)[Lh0/c;

    .line 42
    .line 43
    .line 44
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 46
    .line 47
    .line 48
    return-object p1

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_1
    move-exception p0

    .line 55
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    :goto_0
    throw p1

    .line 59
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string p1, "Content found after the end of file"

    .line 62
    .line 63
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p0

    .line 67
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 68
    .line 69
    const-string p1, "Unsupported version"

    .line 70
    .line 71
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p0
.end method

.method public static m(Ljava/io/InputStream;I)J
    .locals 6

    .line 1
    invoke-static {p0, p1}, Lh0/f;->f(Ljava/io/InputStream;I)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, p1, :cond_0

    .line 9
    .line 10
    aget-byte v3, p0, v2

    .line 11
    .line 12
    and-int/lit16 v3, v3, 0xff

    .line 13
    .line 14
    int-to-long v3, v3

    .line 15
    mul-int/lit8 v5, v2, 0x8

    .line 16
    .line 17
    shl-long/2addr v3, v5

    .line 18
    add-long/2addr v0, v3

    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-wide v0
.end method

.method public static n(Ljava/io/ByteArrayInputStream;Ljava/lang/String;I)[Lh0/c;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p0}, Ljava/io/InputStream;->available()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    new-array v0, v3, [Lh0/c;

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    new-array v2, v1, [Lh0/c;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    :goto_0
    const/4 v5, 0x2

    .line 19
    if-ge v4, v1, :cond_1

    .line 20
    .line 21
    invoke-static {v0, v5}, Lh0/f;->m(Ljava/io/InputStream;I)J

    .line 22
    .line 23
    .line 24
    move-result-wide v6

    .line 25
    long-to-int v7, v6

    .line 26
    invoke-static {v0, v5}, Lh0/f;->m(Ljava/io/InputStream;I)J

    .line 27
    .line 28
    .line 29
    move-result-wide v5

    .line 30
    long-to-int v13, v5

    .line 31
    const/4 v5, 0x4

    .line 32
    invoke-static {v0, v5}, Lh0/f;->m(Ljava/io/InputStream;I)J

    .line 33
    .line 34
    .line 35
    move-result-wide v8

    .line 36
    invoke-static {v0, v5}, Lh0/f;->m(Ljava/io/InputStream;I)J

    .line 37
    .line 38
    .line 39
    move-result-wide v11

    .line 40
    invoke-static {v0, v5}, Lh0/f;->m(Ljava/io/InputStream;I)J

    .line 41
    .line 42
    .line 43
    move-result-wide v5

    .line 44
    new-instance v18, Lh0/c;

    .line 45
    .line 46
    new-instance v10, Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0, v7}, Lh0/f;->f(Ljava/io/InputStream;I)[B

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    sget-object v14, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 53
    .line 54
    invoke-direct {v10, v7, v14}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 55
    .line 56
    .line 57
    long-to-int v14, v8

    .line 58
    long-to-int v15, v5

    .line 59
    new-array v5, v13, [I

    .line 60
    .line 61
    new-instance v17, Ljava/util/TreeMap;

    .line 62
    .line 63
    invoke-direct/range {v17 .. v17}, Ljava/util/TreeMap;-><init>()V

    .line 64
    .line 65
    .line 66
    move-object/from16 v8, v18

    .line 67
    .line 68
    move-object/from16 v9, p1

    .line 69
    .line 70
    move-object/from16 v16, v5

    .line 71
    .line 72
    invoke-direct/range {v8 .. v17}, Lh0/c;-><init>(Ljava/lang/String;Ljava/lang/String;JIII[ILjava/util/TreeMap;)V

    .line 73
    .line 74
    .line 75
    aput-object v18, v2, v4

    .line 76
    .line 77
    add-int/lit8 v4, v4, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    const/4 v4, 0x0

    .line 81
    :goto_1
    if-ge v4, v1, :cond_e

    .line 82
    .line 83
    aget-object v6, v2, v4

    .line 84
    .line 85
    invoke-virtual/range {p0 .. p0}, Ljava/io/InputStream;->available()I

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    iget v8, v6, Lh0/c;->f:I

    .line 90
    .line 91
    sub-int/2addr v7, v8

    .line 92
    const/4 v8, 0x0

    .line 93
    :cond_2
    invoke-virtual/range {p0 .. p0}, Ljava/io/InputStream;->available()I

    .line 94
    .line 95
    .line 96
    move-result v9

    .line 97
    iget-object v10, v6, Lh0/c;->i:Ljava/util/TreeMap;

    .line 98
    .line 99
    const/4 v11, 0x7

    .line 100
    if-le v9, v7, :cond_7

    .line 101
    .line 102
    invoke-static {v0, v5}, Lh0/f;->m(Ljava/io/InputStream;I)J

    .line 103
    .line 104
    .line 105
    move-result-wide v12

    .line 106
    long-to-int v9, v12

    .line 107
    add-int/2addr v8, v9

    .line 108
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    const/4 v12, 0x1

    .line 113
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object v13

    .line 117
    invoke-virtual {v10, v9, v13}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    invoke-static {v0, v5}, Lh0/f;->m(Ljava/io/InputStream;I)J

    .line 121
    .line 122
    .line 123
    move-result-wide v9

    .line 124
    long-to-int v10, v9

    .line 125
    :goto_2
    if-lez v10, :cond_2

    .line 126
    .line 127
    invoke-static {v0, v5}, Lh0/f;->m(Ljava/io/InputStream;I)J

    .line 128
    .line 129
    .line 130
    invoke-static {v0, v12}, Lh0/f;->m(Ljava/io/InputStream;I)J

    .line 131
    .line 132
    .line 133
    move-result-wide v13

    .line 134
    long-to-int v9, v13

    .line 135
    const/4 v13, 0x6

    .line 136
    if-ne v9, v13, :cond_3

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_3
    if-ne v9, v11, :cond_4

    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_4
    :goto_3
    if-lez v9, :cond_6

    .line 143
    .line 144
    invoke-static {v0, v12}, Lh0/f;->m(Ljava/io/InputStream;I)J

    .line 145
    .line 146
    .line 147
    invoke-static {v0, v12}, Lh0/f;->m(Ljava/io/InputStream;I)J

    .line 148
    .line 149
    .line 150
    move-result-wide v13

    .line 151
    long-to-int v14, v13

    .line 152
    :goto_4
    if-lez v14, :cond_5

    .line 153
    .line 154
    invoke-static {v0, v5}, Lh0/f;->m(Ljava/io/InputStream;I)J

    .line 155
    .line 156
    .line 157
    add-int/lit8 v14, v14, -0x1

    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_5
    add-int/lit8 v9, v9, -0x1

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_6
    :goto_5
    add-int/lit8 v10, v10, -0x1

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_7
    invoke-virtual/range {p0 .. p0}, Ljava/io/InputStream;->available()I

    .line 167
    .line 168
    .line 169
    move-result v8

    .line 170
    if-ne v8, v7, :cond_d

    .line 171
    .line 172
    iget v7, v6, Lh0/c;->e:I

    .line 173
    .line 174
    invoke-static {v0, v7}, Lh0/f;->g(Ljava/io/ByteArrayInputStream;I)[I

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    iput-object v7, v6, Lh0/c;->h:[I

    .line 179
    .line 180
    iget v6, v6, Lh0/c;->g:I

    .line 181
    .line 182
    mul-int/lit8 v7, v6, 0x2

    .line 183
    .line 184
    add-int/2addr v7, v11

    .line 185
    and-int/lit8 v7, v7, -0x8

    .line 186
    .line 187
    div-int/lit8 v7, v7, 0x8

    .line 188
    .line 189
    invoke-static {v0, v7}, Lh0/f;->f(Ljava/io/InputStream;I)[B

    .line 190
    .line 191
    .line 192
    move-result-object v7

    .line 193
    invoke-static {v7}, Ljava/util/BitSet;->valueOf([B)Ljava/util/BitSet;

    .line 194
    .line 195
    .line 196
    move-result-object v7

    .line 197
    const/4 v8, 0x0

    .line 198
    :goto_6
    if-ge v8, v6, :cond_c

    .line 199
    .line 200
    invoke-virtual {v7, v8}, Ljava/util/BitSet;->get(I)Z

    .line 201
    .line 202
    .line 203
    move-result v9

    .line 204
    if-eqz v9, :cond_8

    .line 205
    .line 206
    const/4 v9, 0x2

    .line 207
    goto :goto_7

    .line 208
    :cond_8
    const/4 v9, 0x0

    .line 209
    :goto_7
    add-int v11, v8, v6

    .line 210
    .line 211
    invoke-virtual {v7, v11}, Ljava/util/BitSet;->get(I)Z

    .line 212
    .line 213
    .line 214
    move-result v11

    .line 215
    if-eqz v11, :cond_9

    .line 216
    .line 217
    or-int/lit8 v9, v9, 0x4

    .line 218
    .line 219
    :cond_9
    if-eqz v9, :cond_b

    .line 220
    .line 221
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 222
    .line 223
    .line 224
    move-result-object v11

    .line 225
    invoke-virtual {v10, v11}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v11

    .line 229
    check-cast v11, Ljava/lang/Integer;

    .line 230
    .line 231
    if-nez v11, :cond_a

    .line 232
    .line 233
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 234
    .line 235
    .line 236
    move-result-object v11

    .line 237
    :cond_a
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 238
    .line 239
    .line 240
    move-result-object v12

    .line 241
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 242
    .line 243
    .line 244
    move-result v11

    .line 245
    or-int/2addr v9, v11

    .line 246
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 247
    .line 248
    .line 249
    move-result-object v9

    .line 250
    invoke-virtual {v10, v12, v9}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    :cond_b
    add-int/lit8 v8, v8, 0x1

    .line 254
    .line 255
    goto :goto_6

    .line 256
    :cond_c
    add-int/lit8 v4, v4, 0x1

    .line 257
    .line 258
    goto/16 :goto_1

    .line 259
    .line 260
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 261
    .line 262
    const-string v1, "Read too much data during profile line parse"

    .line 263
    .line 264
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    throw v0

    .line 268
    :cond_e
    return-object v2
.end method

.method public static o(Ljava/io/ByteArrayOutputStream;[B[Lh0/c;)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    sget-object v3, Lh0/f;->d:[B

    .line 8
    .line 9
    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    const/4 v5, 0x4

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v7, 0x1

    .line 16
    if-eqz v4, :cond_10

    .line 17
    .line 18
    new-instance v1, Ljava/util/ArrayList;

    .line 19
    .line 20
    const/4 v4, 0x3

    .line 21
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    new-instance v8, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v8, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 27
    .line 28
    .line 29
    new-instance v9, Ljava/io/ByteArrayOutputStream;

    .line 30
    .line 31
    invoke-direct {v9}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 32
    .line 33
    .line 34
    :try_start_0
    array-length v10, v2

    .line 35
    invoke-static {v9, v10}, Lh0/f;->v(Ljava/io/ByteArrayOutputStream;I)V

    .line 36
    .line 37
    .line 38
    const/4 v10, 0x2

    .line 39
    const/4 v11, 0x0

    .line 40
    const/4 v12, 0x2

    .line 41
    :goto_0
    array-length v13, v2

    .line 42
    if-ge v11, v13, :cond_0

    .line 43
    .line 44
    aget-object v13, v2, v11

    .line 45
    .line 46
    iget-wide v14, v13, Lh0/c;->c:J

    .line 47
    .line 48
    invoke-static {v9, v14, v15, v5}, Lh0/f;->u(Ljava/io/ByteArrayOutputStream;JI)V

    .line 49
    .line 50
    .line 51
    iget-wide v14, v13, Lh0/c;->d:J

    .line 52
    .line 53
    invoke-static {v9, v14, v15, v5}, Lh0/f;->u(Ljava/io/ByteArrayOutputStream;JI)V

    .line 54
    .line 55
    .line 56
    iget v14, v13, Lh0/c;->g:I

    .line 57
    .line 58
    int-to-long v14, v14

    .line 59
    invoke-static {v9, v14, v15, v5}, Lh0/f;->u(Ljava/io/ByteArrayOutputStream;JI)V

    .line 60
    .line 61
    .line 62
    iget-object v14, v13, Lh0/c;->a:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v13, v13, Lh0/c;->b:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v14, v13, v3}, Lh0/f;->d(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v13

    .line 70
    add-int/lit8 v12, v12, 0xe

    .line 71
    .line 72
    sget-object v14, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 73
    .line 74
    invoke-virtual {v13, v14}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 75
    .line 76
    .line 77
    move-result-object v15

    .line 78
    array-length v15, v15

    .line 79
    invoke-static {v9, v15}, Lh0/f;->v(Ljava/io/ByteArrayOutputStream;I)V

    .line 80
    .line 81
    .line 82
    add-int/2addr v12, v15

    .line 83
    invoke-virtual {v13, v14}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 84
    .line 85
    .line 86
    move-result-object v13

    .line 87
    invoke-virtual {v9, v13}, Ljava/io/OutputStream;->write([B)V

    .line 88
    .line 89
    .line 90
    add-int/lit8 v11, v11, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :goto_1
    move-object v1, v0

    .line 94
    goto/16 :goto_13

    .line 95
    .line 96
    :catchall_0
    move-exception v0

    .line 97
    goto :goto_1

    .line 98
    :cond_0
    invoke-virtual {v9}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    array-length v11, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    const-string v13, ", does not match actual size "

    .line 104
    .line 105
    const-string v14, "Expected size "

    .line 106
    .line 107
    if-ne v12, v11, :cond_f

    .line 108
    .line 109
    :try_start_1
    new-instance v11, Lh0/k;

    .line 110
    .line 111
    invoke-direct {v11, v7, v3, v6}, Lh0/k;-><init>(I[BZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 112
    .line 113
    .line 114
    invoke-virtual {v9}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    .line 121
    .line 122
    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 123
    .line 124
    .line 125
    const/4 v9, 0x0

    .line 126
    const/4 v11, 0x0

    .line 127
    :goto_2
    :try_start_2
    array-length v12, v2

    .line 128
    if-ge v9, v12, :cond_2

    .line 129
    .line 130
    aget-object v12, v2, v9

    .line 131
    .line 132
    invoke-static {v3, v9}, Lh0/f;->v(Ljava/io/ByteArrayOutputStream;I)V

    .line 133
    .line 134
    .line 135
    add-int/lit8 v11, v11, 0x4

    .line 136
    .line 137
    iget v15, v12, Lh0/c;->e:I

    .line 138
    .line 139
    invoke-static {v3, v15}, Lh0/f;->v(Ljava/io/ByteArrayOutputStream;I)V

    .line 140
    .line 141
    .line 142
    iget v15, v12, Lh0/c;->e:I

    .line 143
    .line 144
    mul-int/lit8 v15, v15, 0x2

    .line 145
    .line 146
    add-int/2addr v11, v15

    .line 147
    iget-object v12, v12, Lh0/c;->h:[I

    .line 148
    .line 149
    array-length v15, v12

    .line 150
    const/16 v16, 0x0

    .line 151
    .line 152
    :goto_3
    if-ge v6, v15, :cond_1

    .line 153
    .line 154
    aget v17, v12, v6

    .line 155
    .line 156
    sub-int v5, v17, v16

    .line 157
    .line 158
    invoke-static {v3, v5}, Lh0/f;->v(Ljava/io/ByteArrayOutputStream;I)V

    .line 159
    .line 160
    .line 161
    add-int/lit8 v6, v6, 0x1

    .line 162
    .line 163
    move/from16 v16, v17

    .line 164
    .line 165
    const/4 v5, 0x4

    .line 166
    goto :goto_3

    .line 167
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 168
    .line 169
    const/4 v5, 0x4

    .line 170
    const/4 v6, 0x0

    .line 171
    goto :goto_2

    .line 172
    :goto_4
    move-object v1, v0

    .line 173
    goto/16 :goto_11

    .line 174
    .line 175
    :catchall_1
    move-exception v0

    .line 176
    goto :goto_4

    .line 177
    :cond_2
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    array-length v6, v5

    .line 182
    if-ne v11, v6, :cond_e

    .line 183
    .line 184
    new-instance v6, Lh0/k;

    .line 185
    .line 186
    invoke-direct {v6, v4, v5, v7}, Lh0/k;-><init>(I[BZ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 187
    .line 188
    .line 189
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    .line 196
    .line 197
    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 198
    .line 199
    .line 200
    const/4 v4, 0x0

    .line 201
    const/4 v5, 0x0

    .line 202
    :goto_5
    :try_start_3
    array-length v6, v2

    .line 203
    if-ge v4, v6, :cond_4

    .line 204
    .line 205
    aget-object v6, v2, v4

    .line 206
    .line 207
    iget-object v9, v6, Lh0/c;->i:Ljava/util/TreeMap;

    .line 208
    .line 209
    invoke-virtual {v9}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 210
    .line 211
    .line 212
    move-result-object v9

    .line 213
    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    const/4 v11, 0x0

    .line 218
    :goto_6
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result v12

    .line 222
    if-eqz v12, :cond_3

    .line 223
    .line 224
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v12

    .line 228
    check-cast v12, Ljava/util/Map$Entry;

    .line 229
    .line 230
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v12

    .line 234
    check-cast v12, Ljava/lang/Integer;

    .line 235
    .line 236
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 237
    .line 238
    .line 239
    move-result v12

    .line 240
    or-int/2addr v11, v12

    .line 241
    goto :goto_6

    .line 242
    :cond_3
    new-instance v9, Ljava/io/ByteArrayOutputStream;

    .line 243
    .line 244
    invoke-direct {v9}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 245
    .line 246
    .line 247
    :try_start_4
    invoke-static {v9, v11, v6}, Lh0/f;->r(Ljava/io/ByteArrayOutputStream;ILh0/c;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v9}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 251
    .line 252
    .line 253
    move-result-object v12
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 254
    :try_start_5
    invoke-virtual {v9}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 255
    .line 256
    .line 257
    new-instance v9, Ljava/io/ByteArrayOutputStream;

    .line 258
    .line 259
    invoke-direct {v9}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 260
    .line 261
    .line 262
    :try_start_6
    invoke-static {v9, v6}, Lh0/f;->s(Ljava/io/ByteArrayOutputStream;Lh0/c;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v9}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 266
    .line 267
    .line 268
    move-result-object v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 269
    :try_start_7
    invoke-virtual {v9}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 270
    .line 271
    .line 272
    invoke-static {v3, v4}, Lh0/f;->v(Ljava/io/ByteArrayOutputStream;I)V

    .line 273
    .line 274
    .line 275
    array-length v9, v12

    .line 276
    add-int/2addr v9, v10

    .line 277
    array-length v15, v6

    .line 278
    add-int/2addr v9, v15

    .line 279
    add-int/lit8 v5, v5, 0x6

    .line 280
    .line 281
    move-object/from16 p1, v8

    .line 282
    .line 283
    int-to-long v7, v9

    .line 284
    const/4 v10, 0x4

    .line 285
    invoke-static {v3, v7, v8, v10}, Lh0/f;->u(Ljava/io/ByteArrayOutputStream;JI)V

    .line 286
    .line 287
    .line 288
    invoke-static {v3, v11}, Lh0/f;->v(Ljava/io/ByteArrayOutputStream;I)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v3, v12}, Ljava/io/OutputStream;->write([B)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v3, v6}, Ljava/io/OutputStream;->write([B)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 295
    .line 296
    .line 297
    add-int/2addr v5, v9

    .line 298
    add-int/lit8 v4, v4, 0x1

    .line 299
    .line 300
    move-object/from16 v8, p1

    .line 301
    .line 302
    const/4 v7, 0x1

    .line 303
    const/4 v10, 0x2

    .line 304
    goto :goto_5

    .line 305
    :catchall_2
    move-exception v0

    .line 306
    move-object v1, v0

    .line 307
    goto/16 :goto_f

    .line 308
    .line 309
    :catchall_3
    move-exception v0

    .line 310
    move-object v1, v0

    .line 311
    :try_start_8
    invoke-virtual {v9}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 312
    .line 313
    .line 314
    goto :goto_7

    .line 315
    :catchall_4
    move-exception v0

    .line 316
    move-object v2, v0

    .line 317
    :try_start_9
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 318
    .line 319
    .line 320
    :goto_7
    throw v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 321
    :catchall_5
    move-exception v0

    .line 322
    move-object v1, v0

    .line 323
    :try_start_a
    invoke-virtual {v9}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 324
    .line 325
    .line 326
    goto :goto_8

    .line 327
    :catchall_6
    move-exception v0

    .line 328
    move-object v2, v0

    .line 329
    :try_start_b
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 330
    .line 331
    .line 332
    :goto_8
    throw v1

    .line 333
    :cond_4
    move-object/from16 p1, v8

    .line 334
    .line 335
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    array-length v4, v2

    .line 340
    if-ne v5, v4, :cond_d

    .line 341
    .line 342
    new-instance v4, Lh0/k;

    .line 343
    .line 344
    const/4 v5, 0x4

    .line 345
    const/4 v6, 0x1

    .line 346
    invoke-direct {v4, v5, v2, v6}, Lh0/k;-><init>(I[BZ)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 347
    .line 348
    .line 349
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    int-to-long v2, v5

    .line 356
    add-long/2addr v2, v2

    .line 357
    const-wide/16 v4, 0x4

    .line 358
    .line 359
    add-long/2addr v2, v4

    .line 360
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 361
    .line 362
    .line 363
    move-result v4

    .line 364
    mul-int/lit8 v4, v4, 0x10

    .line 365
    .line 366
    int-to-long v4, v4

    .line 367
    add-long/2addr v2, v4

    .line 368
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 369
    .line 370
    .line 371
    move-result v4

    .line 372
    int-to-long v4, v4

    .line 373
    const/4 v6, 0x4

    .line 374
    invoke-static {v0, v4, v5, v6}, Lh0/f;->u(Ljava/io/ByteArrayOutputStream;JI)V

    .line 375
    .line 376
    .line 377
    const/4 v4, 0x0

    .line 378
    :goto_9
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 379
    .line 380
    .line 381
    move-result v5

    .line 382
    if-ge v4, v5, :cond_b

    .line 383
    .line 384
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v5

    .line 388
    check-cast v5, Lh0/k;

    .line 389
    .line 390
    iget v6, v5, Lh0/k;->a:I

    .line 391
    .line 392
    const/4 v7, 0x1

    .line 393
    if-eq v6, v7, :cond_9

    .line 394
    .line 395
    const/4 v7, 0x2

    .line 396
    if-eq v6, v7, :cond_8

    .line 397
    .line 398
    const/4 v7, 0x3

    .line 399
    if-eq v6, v7, :cond_7

    .line 400
    .line 401
    const/4 v7, 0x4

    .line 402
    if-eq v6, v7, :cond_6

    .line 403
    .line 404
    const/4 v7, 0x5

    .line 405
    if-ne v6, v7, :cond_5

    .line 406
    .line 407
    const-wide/16 v6, 0x4

    .line 408
    .line 409
    :goto_a
    const/4 v8, 0x4

    .line 410
    goto :goto_b

    .line 411
    :cond_5
    const/4 v0, 0x0

    .line 412
    throw v0

    .line 413
    :cond_6
    const-wide/16 v6, 0x3

    .line 414
    .line 415
    goto :goto_a

    .line 416
    :cond_7
    const-wide/16 v6, 0x2

    .line 417
    .line 418
    goto :goto_a

    .line 419
    :cond_8
    const-wide/16 v6, 0x1

    .line 420
    .line 421
    goto :goto_a

    .line 422
    :cond_9
    const-wide/16 v6, 0x0

    .line 423
    .line 424
    goto :goto_a

    .line 425
    :goto_b
    invoke-static {v0, v6, v7, v8}, Lh0/f;->u(Ljava/io/ByteArrayOutputStream;JI)V

    .line 426
    .line 427
    .line 428
    invoke-static {v0, v2, v3, v8}, Lh0/f;->u(Ljava/io/ByteArrayOutputStream;JI)V

    .line 429
    .line 430
    .line 431
    iget-object v6, v5, Lh0/k;->b:[B

    .line 432
    .line 433
    iget-boolean v5, v5, Lh0/k;->c:Z

    .line 434
    .line 435
    if-eqz v5, :cond_a

    .line 436
    .line 437
    array-length v5, v6

    .line 438
    int-to-long v7, v5

    .line 439
    invoke-static {v6}, Lh0/f;->a([B)[B

    .line 440
    .line 441
    .line 442
    move-result-object v5

    .line 443
    move-object/from16 v9, p1

    .line 444
    .line 445
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    array-length v6, v5

    .line 449
    int-to-long v10, v6

    .line 450
    const/4 v12, 0x4

    .line 451
    invoke-static {v0, v10, v11, v12}, Lh0/f;->u(Ljava/io/ByteArrayOutputStream;JI)V

    .line 452
    .line 453
    .line 454
    invoke-static {v0, v7, v8, v12}, Lh0/f;->u(Ljava/io/ByteArrayOutputStream;JI)V

    .line 455
    .line 456
    .line 457
    array-length v5, v5

    .line 458
    :goto_c
    int-to-long v5, v5

    .line 459
    add-long/2addr v2, v5

    .line 460
    goto :goto_d

    .line 461
    :cond_a
    move-object/from16 v9, p1

    .line 462
    .line 463
    const/4 v12, 0x4

    .line 464
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 465
    .line 466
    .line 467
    array-length v5, v6

    .line 468
    int-to-long v7, v5

    .line 469
    invoke-static {v0, v7, v8, v12}, Lh0/f;->u(Ljava/io/ByteArrayOutputStream;JI)V

    .line 470
    .line 471
    .line 472
    const-wide/16 v7, 0x0

    .line 473
    .line 474
    invoke-static {v0, v7, v8, v12}, Lh0/f;->u(Ljava/io/ByteArrayOutputStream;JI)V

    .line 475
    .line 476
    .line 477
    array-length v5, v6

    .line 478
    goto :goto_c

    .line 479
    :goto_d
    add-int/lit8 v4, v4, 0x1

    .line 480
    .line 481
    move-object/from16 p1, v9

    .line 482
    .line 483
    goto :goto_9

    .line 484
    :cond_b
    move-object/from16 v9, p1

    .line 485
    .line 486
    const/4 v6, 0x0

    .line 487
    :goto_e
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 488
    .line 489
    .line 490
    move-result v1

    .line 491
    if-ge v6, v1, :cond_c

    .line 492
    .line 493
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v1

    .line 497
    check-cast v1, [B

    .line 498
    .line 499
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 500
    .line 501
    .line 502
    add-int/lit8 v6, v6, 0x1

    .line 503
    .line 504
    goto :goto_e

    .line 505
    :cond_c
    const/4 v1, 0x1

    .line 506
    return v1

    .line 507
    :cond_d
    :try_start_c
    new-instance v0, Ljava/lang/StringBuilder;

    .line 508
    .line 509
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 516
    .line 517
    .line 518
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 519
    .line 520
    .line 521
    array-length v1, v2

    .line 522
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 530
    .line 531
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    throw v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 535
    :goto_f
    :try_start_d
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 536
    .line 537
    .line 538
    goto :goto_10

    .line 539
    :catchall_7
    move-exception v0

    .line 540
    move-object v2, v0

    .line 541
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 542
    .line 543
    .line 544
    :goto_10
    throw v1

    .line 545
    :cond_e
    :try_start_e
    new-instance v0, Ljava/lang/StringBuilder;

    .line 546
    .line 547
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 551
    .line 552
    .line 553
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 554
    .line 555
    .line 556
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 557
    .line 558
    .line 559
    array-length v1, v5

    .line 560
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 568
    .line 569
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 570
    .line 571
    .line 572
    throw v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 573
    :goto_11
    :try_start_f
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    .line 574
    .line 575
    .line 576
    goto :goto_12

    .line 577
    :catchall_8
    move-exception v0

    .line 578
    move-object v2, v0

    .line 579
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 580
    .line 581
    .line 582
    :goto_12
    throw v1

    .line 583
    :cond_f
    :try_start_10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 584
    .line 585
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 592
    .line 593
    .line 594
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 595
    .line 596
    .line 597
    array-length v1, v3

    .line 598
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 606
    .line 607
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 608
    .line 609
    .line 610
    throw v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 611
    :goto_13
    :try_start_11
    invoke-virtual {v9}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_9

    .line 612
    .line 613
    .line 614
    goto :goto_14

    .line 615
    :catchall_9
    move-exception v0

    .line 616
    move-object v2, v0

    .line 617
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 618
    .line 619
    .line 620
    :goto_14
    throw v1

    .line 621
    :cond_10
    sget-object v3, Lh0/f;->e:[B

    .line 622
    .line 623
    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 624
    .line 625
    .line 626
    move-result v4

    .line 627
    if-eqz v4, :cond_11

    .line 628
    .line 629
    invoke-static {v2, v3}, Lh0/f;->b([Lh0/c;[B)[B

    .line 630
    .line 631
    .line 632
    move-result-object v1

    .line 633
    array-length v2, v2

    .line 634
    int-to-long v2, v2

    .line 635
    const/4 v4, 0x1

    .line 636
    invoke-static {v0, v2, v3, v4}, Lh0/f;->u(Ljava/io/ByteArrayOutputStream;JI)V

    .line 637
    .line 638
    .line 639
    array-length v2, v1

    .line 640
    int-to-long v2, v2

    .line 641
    const/4 v4, 0x4

    .line 642
    invoke-static {v0, v2, v3, v4}, Lh0/f;->u(Ljava/io/ByteArrayOutputStream;JI)V

    .line 643
    .line 644
    .line 645
    invoke-static {v1}, Lh0/f;->a([B)[B

    .line 646
    .line 647
    .line 648
    move-result-object v1

    .line 649
    array-length v2, v1

    .line 650
    int-to-long v2, v2

    .line 651
    invoke-static {v0, v2, v3, v4}, Lh0/f;->u(Ljava/io/ByteArrayOutputStream;JI)V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 655
    .line 656
    .line 657
    const/4 v3, 0x1

    .line 658
    return v3

    .line 659
    :cond_11
    const/4 v3, 0x1

    .line 660
    sget-object v4, Lh0/f;->g:[B

    .line 661
    .line 662
    invoke-static {v1, v4}, Ljava/util/Arrays;->equals([B[B)Z

    .line 663
    .line 664
    .line 665
    move-result v5

    .line 666
    if-eqz v5, :cond_15

    .line 667
    .line 668
    array-length v1, v2

    .line 669
    int-to-long v5, v1

    .line 670
    invoke-static {v0, v5, v6, v3}, Lh0/f;->u(Ljava/io/ByteArrayOutputStream;JI)V

    .line 671
    .line 672
    .line 673
    array-length v1, v2

    .line 674
    const/4 v3, 0x0

    .line 675
    :goto_15
    if-ge v3, v1, :cond_14

    .line 676
    .line 677
    aget-object v5, v2, v3

    .line 678
    .line 679
    iget-object v6, v5, Lh0/c;->i:Ljava/util/TreeMap;

    .line 680
    .line 681
    invoke-virtual {v6}, Ljava/util/TreeMap;->size()I

    .line 682
    .line 683
    .line 684
    move-result v6

    .line 685
    const/4 v7, 0x4

    .line 686
    mul-int/lit8 v6, v6, 0x4

    .line 687
    .line 688
    iget-object v7, v5, Lh0/c;->b:Ljava/lang/String;

    .line 689
    .line 690
    iget-object v8, v5, Lh0/c;->a:Ljava/lang/String;

    .line 691
    .line 692
    invoke-static {v8, v7, v4}, Lh0/f;->d(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object v7

    .line 696
    sget-object v8, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 697
    .line 698
    invoke-virtual {v7, v8}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 699
    .line 700
    .line 701
    move-result-object v9

    .line 702
    array-length v9, v9

    .line 703
    invoke-static {v0, v9}, Lh0/f;->v(Ljava/io/ByteArrayOutputStream;I)V

    .line 704
    .line 705
    .line 706
    iget-object v9, v5, Lh0/c;->h:[I

    .line 707
    .line 708
    array-length v9, v9

    .line 709
    invoke-static {v0, v9}, Lh0/f;->v(Ljava/io/ByteArrayOutputStream;I)V

    .line 710
    .line 711
    .line 712
    int-to-long v9, v6

    .line 713
    const/4 v6, 0x4

    .line 714
    invoke-static {v0, v9, v10, v6}, Lh0/f;->u(Ljava/io/ByteArrayOutputStream;JI)V

    .line 715
    .line 716
    .line 717
    iget-wide v9, v5, Lh0/c;->c:J

    .line 718
    .line 719
    invoke-static {v0, v9, v10, v6}, Lh0/f;->u(Ljava/io/ByteArrayOutputStream;JI)V

    .line 720
    .line 721
    .line 722
    invoke-virtual {v7, v8}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 723
    .line 724
    .line 725
    move-result-object v6

    .line 726
    invoke-virtual {v0, v6}, Ljava/io/OutputStream;->write([B)V

    .line 727
    .line 728
    .line 729
    iget-object v6, v5, Lh0/c;->i:Ljava/util/TreeMap;

    .line 730
    .line 731
    invoke-virtual {v6}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 732
    .line 733
    .line 734
    move-result-object v6

    .line 735
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 736
    .line 737
    .line 738
    move-result-object v6

    .line 739
    :goto_16
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 740
    .line 741
    .line 742
    move-result v7

    .line 743
    if-eqz v7, :cond_12

    .line 744
    .line 745
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v7

    .line 749
    check-cast v7, Ljava/lang/Integer;

    .line 750
    .line 751
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 752
    .line 753
    .line 754
    move-result v7

    .line 755
    invoke-static {v0, v7}, Lh0/f;->v(Ljava/io/ByteArrayOutputStream;I)V

    .line 756
    .line 757
    .line 758
    const/4 v7, 0x0

    .line 759
    invoke-static {v0, v7}, Lh0/f;->v(Ljava/io/ByteArrayOutputStream;I)V

    .line 760
    .line 761
    .line 762
    goto :goto_16

    .line 763
    :cond_12
    iget-object v5, v5, Lh0/c;->h:[I

    .line 764
    .line 765
    array-length v6, v5

    .line 766
    const/4 v7, 0x0

    .line 767
    :goto_17
    if-ge v7, v6, :cond_13

    .line 768
    .line 769
    aget v8, v5, v7

    .line 770
    .line 771
    invoke-static {v0, v8}, Lh0/f;->v(Ljava/io/ByteArrayOutputStream;I)V

    .line 772
    .line 773
    .line 774
    add-int/lit8 v7, v7, 0x1

    .line 775
    .line 776
    goto :goto_17

    .line 777
    :cond_13
    add-int/lit8 v3, v3, 0x1

    .line 778
    .line 779
    goto :goto_15

    .line 780
    :cond_14
    const/4 v3, 0x1

    .line 781
    return v3

    .line 782
    :cond_15
    sget-object v4, Lh0/f;->f:[B

    .line 783
    .line 784
    invoke-static {v1, v4}, Ljava/util/Arrays;->equals([B[B)Z

    .line 785
    .line 786
    .line 787
    move-result v5

    .line 788
    if-eqz v5, :cond_16

    .line 789
    .line 790
    invoke-static {v2, v4}, Lh0/f;->b([Lh0/c;[B)[B

    .line 791
    .line 792
    .line 793
    move-result-object v1

    .line 794
    array-length v2, v2

    .line 795
    int-to-long v4, v2

    .line 796
    invoke-static {v0, v4, v5, v3}, Lh0/f;->u(Ljava/io/ByteArrayOutputStream;JI)V

    .line 797
    .line 798
    .line 799
    array-length v2, v1

    .line 800
    int-to-long v2, v2

    .line 801
    const/4 v4, 0x4

    .line 802
    invoke-static {v0, v2, v3, v4}, Lh0/f;->u(Ljava/io/ByteArrayOutputStream;JI)V

    .line 803
    .line 804
    .line 805
    invoke-static {v1}, Lh0/f;->a([B)[B

    .line 806
    .line 807
    .line 808
    move-result-object v1

    .line 809
    array-length v2, v1

    .line 810
    int-to-long v2, v2

    .line 811
    invoke-static {v0, v2, v3, v4}, Lh0/f;->u(Ljava/io/ByteArrayOutputStream;JI)V

    .line 812
    .line 813
    .line 814
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 815
    .line 816
    .line 817
    const/4 v0, 0x1

    .line 818
    return v0

    .line 819
    :cond_16
    sget-object v3, Lh0/f;->h:[B

    .line 820
    .line 821
    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 822
    .line 823
    .line 824
    move-result v1

    .line 825
    if-eqz v1, :cond_1a

    .line 826
    .line 827
    array-length v1, v2

    .line 828
    invoke-static {v0, v1}, Lh0/f;->v(Ljava/io/ByteArrayOutputStream;I)V

    .line 829
    .line 830
    .line 831
    array-length v1, v2

    .line 832
    const/4 v7, 0x0

    .line 833
    :goto_18
    if-ge v7, v1, :cond_19

    .line 834
    .line 835
    aget-object v4, v2, v7

    .line 836
    .line 837
    iget-object v5, v4, Lh0/c;->a:Ljava/lang/String;

    .line 838
    .line 839
    iget-object v6, v4, Lh0/c;->b:Ljava/lang/String;

    .line 840
    .line 841
    invoke-static {v5, v6, v3}, Lh0/f;->d(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;

    .line 842
    .line 843
    .line 844
    move-result-object v5

    .line 845
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 846
    .line 847
    invoke-virtual {v5, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 848
    .line 849
    .line 850
    move-result-object v8

    .line 851
    array-length v8, v8

    .line 852
    invoke-static {v0, v8}, Lh0/f;->v(Ljava/io/ByteArrayOutputStream;I)V

    .line 853
    .line 854
    .line 855
    iget-object v8, v4, Lh0/c;->i:Ljava/util/TreeMap;

    .line 856
    .line 857
    invoke-virtual {v8}, Ljava/util/TreeMap;->size()I

    .line 858
    .line 859
    .line 860
    move-result v9

    .line 861
    invoke-static {v0, v9}, Lh0/f;->v(Ljava/io/ByteArrayOutputStream;I)V

    .line 862
    .line 863
    .line 864
    iget-object v9, v4, Lh0/c;->h:[I

    .line 865
    .line 866
    array-length v9, v9

    .line 867
    invoke-static {v0, v9}, Lh0/f;->v(Ljava/io/ByteArrayOutputStream;I)V

    .line 868
    .line 869
    .line 870
    iget-wide v9, v4, Lh0/c;->c:J

    .line 871
    .line 872
    const/4 v11, 0x4

    .line 873
    invoke-static {v0, v9, v10, v11}, Lh0/f;->u(Ljava/io/ByteArrayOutputStream;JI)V

    .line 874
    .line 875
    .line 876
    invoke-virtual {v5, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 877
    .line 878
    .line 879
    move-result-object v5

    .line 880
    invoke-virtual {v0, v5}, Ljava/io/OutputStream;->write([B)V

    .line 881
    .line 882
    .line 883
    invoke-virtual {v8}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 884
    .line 885
    .line 886
    move-result-object v5

    .line 887
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 888
    .line 889
    .line 890
    move-result-object v5

    .line 891
    :goto_19
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 892
    .line 893
    .line 894
    move-result v6

    .line 895
    if-eqz v6, :cond_17

    .line 896
    .line 897
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 898
    .line 899
    .line 900
    move-result-object v6

    .line 901
    check-cast v6, Ljava/lang/Integer;

    .line 902
    .line 903
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 904
    .line 905
    .line 906
    move-result v6

    .line 907
    invoke-static {v0, v6}, Lh0/f;->v(Ljava/io/ByteArrayOutputStream;I)V

    .line 908
    .line 909
    .line 910
    goto :goto_19

    .line 911
    :cond_17
    iget-object v4, v4, Lh0/c;->h:[I

    .line 912
    .line 913
    array-length v5, v4

    .line 914
    const/4 v6, 0x0

    .line 915
    :goto_1a
    if-ge v6, v5, :cond_18

    .line 916
    .line 917
    aget v8, v4, v6

    .line 918
    .line 919
    invoke-static {v0, v8}, Lh0/f;->v(Ljava/io/ByteArrayOutputStream;I)V

    .line 920
    .line 921
    .line 922
    add-int/lit8 v6, v6, 0x1

    .line 923
    .line 924
    goto :goto_1a

    .line 925
    :cond_18
    add-int/lit8 v7, v7, 0x1

    .line 926
    .line 927
    goto :goto_18

    .line 928
    :cond_19
    const/4 v4, 0x1

    .line 929
    return v4

    .line 930
    :cond_1a
    const/4 v0, 0x0

    .line 931
    return v0
.end method

.method public static p(Ljava/io/ByteArrayOutputStream;Lh0/c;)V
    .locals 8

    .line 1
    invoke-static {p0, p1}, Lh0/f;->s(Ljava/io/ByteArrayOutputStream;Lh0/c;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lh0/c;->h:[I

    .line 5
    .line 6
    array-length v1, v0

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget v4, v0, v2

    .line 12
    .line 13
    sub-int v3, v4, v3

    .line 14
    .line 15
    invoke-static {p0, v3}, Lh0/f;->v(Ljava/io/ByteArrayOutputStream;I)V

    .line 16
    .line 17
    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    move v3, v4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget v0, p1, Lh0/c;->g:I

    .line 23
    .line 24
    mul-int/lit8 v1, v0, 0x2

    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x7

    .line 27
    .line 28
    and-int/lit8 v1, v1, -0x8

    .line 29
    .line 30
    div-int/lit8 v1, v1, 0x8

    .line 31
    .line 32
    new-array v1, v1, [B

    .line 33
    .line 34
    iget-object p1, p1, Lh0/c;->i:Ljava/util/TreeMap;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Ljava/util/Map$Entry;

    .line 55
    .line 56
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Ljava/lang/Integer;

    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Ljava/lang/Integer;

    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    and-int/lit8 v4, v2, 0x2

    .line 77
    .line 78
    const/4 v5, 0x1

    .line 79
    if-eqz v4, :cond_2

    .line 80
    .line 81
    div-int/lit8 v4, v3, 0x8

    .line 82
    .line 83
    aget-byte v6, v1, v4

    .line 84
    .line 85
    rem-int/lit8 v7, v3, 0x8

    .line 86
    .line 87
    shl-int v7, v5, v7

    .line 88
    .line 89
    or-int/2addr v6, v7

    .line 90
    int-to-byte v6, v6

    .line 91
    aput-byte v6, v1, v4

    .line 92
    .line 93
    :cond_2
    and-int/lit8 v2, v2, 0x4

    .line 94
    .line 95
    if-eqz v2, :cond_1

    .line 96
    .line 97
    add-int/2addr v3, v0

    .line 98
    div-int/lit8 v2, v3, 0x8

    .line 99
    .line 100
    aget-byte v4, v1, v2

    .line 101
    .line 102
    rem-int/lit8 v3, v3, 0x8

    .line 103
    .line 104
    shl-int v3, v5, v3

    .line 105
    .line 106
    or-int/2addr v3, v4

    .line 107
    int-to-byte v3, v3

    .line 108
    aput-byte v3, v1, v2

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_3
    invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public static q(Ljava/io/ByteArrayOutputStream;Lh0/c;Ljava/lang/String;)V
    .locals 4

    .line 1
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    array-length v1, v1

    .line 8
    invoke-static {p0, v1}, Lh0/f;->v(Ljava/io/ByteArrayOutputStream;I)V

    .line 9
    .line 10
    .line 11
    iget v1, p1, Lh0/c;->e:I

    .line 12
    .line 13
    invoke-static {p0, v1}, Lh0/f;->v(Ljava/io/ByteArrayOutputStream;I)V

    .line 14
    .line 15
    .line 16
    iget v1, p1, Lh0/c;->f:I

    .line 17
    .line 18
    int-to-long v1, v1

    .line 19
    const/4 v3, 0x4

    .line 20
    invoke-static {p0, v1, v2, v3}, Lh0/f;->u(Ljava/io/ByteArrayOutputStream;JI)V

    .line 21
    .line 22
    .line 23
    iget-wide v1, p1, Lh0/c;->c:J

    .line 24
    .line 25
    invoke-static {p0, v1, v2, v3}, Lh0/f;->u(Ljava/io/ByteArrayOutputStream;JI)V

    .line 26
    .line 27
    .line 28
    iget p1, p1, Lh0/c;->g:I

    .line 29
    .line 30
    int-to-long v1, p1

    .line 31
    invoke-static {p0, v1, v2, v3}, Lh0/f;->u(Ljava/io/ByteArrayOutputStream;JI)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public static r(Ljava/io/ByteArrayOutputStream;ILh0/c;)V
    .locals 10

    .line 1
    and-int/lit8 v0, p1, -0x2

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->bitCount(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p2, Lh0/c;->g:I

    .line 8
    .line 9
    mul-int v0, v0, v1

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x7

    .line 12
    .line 13
    and-int/lit8 v0, v0, -0x8

    .line 14
    .line 15
    div-int/lit8 v0, v0, 0x8

    .line 16
    .line 17
    new-array v0, v0, [B

    .line 18
    .line 19
    iget-object p2, p2, Lh0/c;->i:Ljava/util/TreeMap;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_4

    .line 34
    .line 35
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Ljava/util/Map$Entry;

    .line 40
    .line 41
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Ljava/lang/Integer;

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    const/4 v4, 0x1

    .line 62
    const/4 v5, 0x0

    .line 63
    const/4 v6, 0x1

    .line 64
    :goto_0
    const/4 v7, 0x4

    .line 65
    if-gt v6, v7, :cond_0

    .line 66
    .line 67
    if-ne v6, v4, :cond_1

    .line 68
    .line 69
    :goto_1
    shl-int/lit8 v6, v6, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    and-int v7, v6, p1

    .line 73
    .line 74
    if-nez v7, :cond_2

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    and-int v7, v6, v2

    .line 78
    .line 79
    if-ne v7, v6, :cond_3

    .line 80
    .line 81
    mul-int v7, v5, v1

    .line 82
    .line 83
    add-int/2addr v7, v3

    .line 84
    div-int/lit8 v8, v7, 0x8

    .line 85
    .line 86
    aget-byte v9, v0, v8

    .line 87
    .line 88
    rem-int/lit8 v7, v7, 0x8

    .line 89
    .line 90
    shl-int v7, v4, v7

    .line 91
    .line 92
    or-int/2addr v7, v9

    .line 93
    int-to-byte v7, v7

    .line 94
    aput-byte v7, v0, v8

    .line 95
    .line 96
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public static s(Ljava/io/ByteArrayOutputStream;Lh0/c;)V
    .locals 4

    .line 1
    iget-object p1, p1, Lh0/c;->i:Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v0, 0x0

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Ljava/util/Map$Entry;

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    and-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    if-nez v2, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    sub-int v1, v3, v1

    .line 51
    .line 52
    invoke-static {p0, v1}, Lh0/f;->v(Ljava/io/ByteArrayOutputStream;I)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v0}, Lh0/f;->v(Ljava/io/ByteArrayOutputStream;I)V

    .line 56
    .line 57
    .line 58
    move v1, v3

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    return-void
.end method

.method public static t(Landroid/content/Context;Ljava/util/concurrent/Executor;Lh0/e;Z)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v8, p2

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 18
    .line 19
    .line 20
    move-result-object v9

    .line 21
    new-instance v0, Ljava/io/File;

    .line 22
    .line 23
    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 24
    .line 25
    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const/4 v11, 0x0

    .line 37
    :try_start_0
    invoke-virtual {v0, v2, v11}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 38
    .line 39
    .line 40
    move-result-object v12
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_13

    .line 41
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 42
    .line 43
    .line 44
    move-result-object v13

    .line 45
    const/4 v14, 0x0

    .line 46
    const/4 v15, 0x1

    .line 47
    if-nez p3, :cond_4

    .line 48
    .line 49
    new-instance v0, Ljava/io/File;

    .line 50
    .line 51
    const-string v3, "profileinstaller_profileWrittenFor_lastUpdateTime.dat"

    .line 52
    .line 53
    invoke-direct {v0, v13, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-nez v3, :cond_0

    .line 61
    .line 62
    :goto_0
    const/4 v0, 0x0

    .line 63
    goto :goto_3

    .line 64
    :cond_0
    :try_start_1
    new-instance v3, Ljava/io/DataInputStream;

    .line 65
    .line 66
    new-instance v4, Ljava/io/FileInputStream;

    .line 67
    .line 68
    invoke-direct {v4, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 69
    .line 70
    .line 71
    invoke-direct {v3, v4}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 72
    .line 73
    .line 74
    :try_start_2
    invoke-virtual {v3}, Ljava/io/DataInputStream;->readLong()J

    .line 75
    .line 76
    .line 77
    move-result-wide v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 78
    :try_start_3
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 79
    .line 80
    .line 81
    iget-wide v10, v12, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 82
    .line 83
    cmp-long v0, v4, v10

    .line 84
    .line 85
    if-nez v0, :cond_1

    .line 86
    .line 87
    const/4 v0, 0x1

    .line 88
    goto :goto_1

    .line 89
    :cond_1
    const/4 v0, 0x0

    .line 90
    :goto_1
    if-eqz v0, :cond_2

    .line 91
    .line 92
    const/4 v3, 0x2

    .line 93
    invoke-interface {v8, v3, v14}, Lh0/e;->k(ILjava/io/Serializable;)V

    .line 94
    .line 95
    .line 96
    goto :goto_3

    .line 97
    :catch_0
    nop

    .line 98
    goto :goto_0

    .line 99
    :catchall_0
    move-exception v0

    .line 100
    move-object v4, v0

    .line 101
    :try_start_4
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :catchall_1
    move-exception v0

    .line 106
    move-object v3, v0

    .line 107
    :try_start_5
    invoke-virtual {v4, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    :goto_2
    throw v4
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 111
    :cond_2
    :goto_3
    if-nez v0, :cond_3

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_3
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    const/4 v2, 0x0

    .line 118
    invoke-static {v1, v2}, Lh0/j;->c(Landroid/content/Context;Z)V

    .line 119
    .line 120
    .line 121
    goto/16 :goto_3b

    .line 122
    .line 123
    :cond_4
    :goto_4
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    new-instance v0, Ljava/io/File;

    .line 127
    .line 128
    new-instance v3, Ljava/io/File;

    .line 129
    .line 130
    const-string v4, "/data/misc/profiles/cur/0"

    .line 131
    .line 132
    invoke-direct {v3, v4, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    const-string v2, "primary.prof"

    .line 136
    .line 137
    invoke-direct {v0, v3, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    new-instance v10, Lh0/b;

    .line 141
    .line 142
    const-string v11, "dexopt/baseline.prof"

    .line 143
    .line 144
    move-object v2, v10

    .line 145
    move-object v3, v9

    .line 146
    move-object/from16 v4, p1

    .line 147
    .line 148
    move-object/from16 v5, p2

    .line 149
    .line 150
    move-object v7, v0

    .line 151
    invoke-direct/range {v2 .. v7}, Lh0/b;-><init>(Landroid/content/res/AssetManager;Ljava/util/concurrent/Executor;Lh0/e;Ljava/lang/String;Ljava/io/File;)V

    .line 152
    .line 153
    .line 154
    iget-object v2, v10, Lh0/b;->c:[B

    .line 155
    .line 156
    if-nez v2, :cond_5

    .line 157
    .line 158
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 159
    .line 160
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    const/4 v2, 0x3

    .line 165
    invoke-virtual {v10, v2, v0}, Lh0/b;->b(ILjava/io/Serializable;)V

    .line 166
    .line 167
    .line 168
    :goto_5
    const/4 v6, 0x1

    .line 169
    goto/16 :goto_38

    .line 170
    .line 171
    :cond_5
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    const/4 v4, 0x4

    .line 176
    if-eqz v3, :cond_6

    .line 177
    .line 178
    invoke-virtual {v0}, Ljava/io/File;->canWrite()Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-nez v0, :cond_7

    .line 183
    .line 184
    invoke-virtual {v10, v4, v14}, Lh0/b;->b(ILjava/io/Serializable;)V

    .line 185
    .line 186
    .line 187
    goto :goto_5

    .line 188
    :cond_6
    :try_start_6
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-nez v0, :cond_7

    .line 193
    .line 194
    invoke-virtual {v10, v4, v14}, Lh0/b;->b(ILjava/io/Serializable;)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1

    .line 195
    .line 196
    .line 197
    goto :goto_5

    .line 198
    :catch_1
    const/4 v6, 0x1

    .line 199
    goto/16 :goto_37

    .line 200
    .line 201
    :cond_7
    iput-boolean v15, v10, Lh0/b;->f:Z

    .line 202
    .line 203
    sget-object v3, Lh0/f;->b:[B

    .line 204
    .line 205
    const/4 v5, 0x6

    .line 206
    :try_start_7
    invoke-virtual {v10, v9, v11}, Lh0/b;->a(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;

    .line 207
    .line 208
    .line 209
    move-result-object v0
    :try_end_7
    .catch Ljava/io/FileNotFoundException; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2

    .line 210
    move-object v6, v0

    .line 211
    goto :goto_7

    .line 212
    :catch_2
    move-exception v0

    .line 213
    move-object v6, v0

    .line 214
    const/4 v7, 0x7

    .line 215
    invoke-interface {v8, v7, v6}, Lh0/e;->k(ILjava/io/Serializable;)V

    .line 216
    .line 217
    .line 218
    goto :goto_6

    .line 219
    :catch_3
    move-exception v0

    .line 220
    move-object v6, v0

    .line 221
    invoke-interface {v8, v5, v6}, Lh0/e;->k(ILjava/io/Serializable;)V

    .line 222
    .line 223
    .line 224
    :goto_6
    move-object v6, v14

    .line 225
    :goto_7
    const-string v7, "Invalid magic"

    .line 226
    .line 227
    const/16 v11, 0x8

    .line 228
    .line 229
    if-eqz v6, :cond_9

    .line 230
    .line 231
    :try_start_8
    invoke-static {v6, v4}, Lh0/f;->f(Ljava/io/InputStream;I)[B

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-static {v3, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    if-eqz v0, :cond_8

    .line 240
    .line 241
    invoke-static {v6, v4}, Lh0/f;->f(Ljava/io/InputStream;I)[B

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    iget-object v5, v10, Lh0/b;->e:Ljava/lang/String;

    .line 246
    .line 247
    invoke-static {v6, v0, v5}, Lh0/f;->l(Ljava/io/FileInputStream;[BLjava/lang/String;)[Lh0/c;

    .line 248
    .line 249
    .line 250
    move-result-object v5
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_6
    .catch Ljava/lang/IllegalStateException; {:try_start_8 .. :try_end_8} :catch_5
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 251
    :try_start_9
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4

    .line 252
    .line 253
    .line 254
    goto :goto_e

    .line 255
    :catch_4
    move-exception v0

    .line 256
    move-object v6, v0

    .line 257
    const/4 v15, 0x7

    .line 258
    invoke-interface {v8, v15, v6}, Lh0/e;->k(ILjava/io/Serializable;)V

    .line 259
    .line 260
    .line 261
    goto :goto_e

    .line 262
    :goto_8
    move-object v1, v0

    .line 263
    goto :goto_f

    .line 264
    :goto_9
    const/4 v15, 0x7

    .line 265
    goto :goto_c

    .line 266
    :catchall_2
    move-exception v0

    .line 267
    goto :goto_8

    .line 268
    :catch_5
    move-exception v0

    .line 269
    goto :goto_a

    .line 270
    :catch_6
    move-exception v0

    .line 271
    goto :goto_9

    .line 272
    :cond_8
    :try_start_a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 273
    .line 274
    invoke-direct {v0, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    throw v0
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_6
    .catch Ljava/lang/IllegalStateException; {:try_start_a .. :try_end_a} :catch_5
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 278
    :goto_a
    :try_start_b
    invoke-interface {v8, v11, v0}, Lh0/e;->k(ILjava/io/Serializable;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 279
    .line 280
    .line 281
    :try_start_c
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_7

    .line 282
    .line 283
    .line 284
    goto :goto_d

    .line 285
    :catch_7
    move-exception v0

    .line 286
    move-object v5, v0

    .line 287
    const/4 v15, 0x7

    .line 288
    :goto_b
    invoke-interface {v8, v15, v5}, Lh0/e;->k(ILjava/io/Serializable;)V

    .line 289
    .line 290
    .line 291
    goto :goto_d

    .line 292
    :catchall_3
    move-exception v0

    .line 293
    const/4 v15, 0x7

    .line 294
    goto :goto_8

    .line 295
    :goto_c
    :try_start_d
    invoke-interface {v8, v15, v0}, Lh0/e;->k(ILjava/io/Serializable;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 296
    .line 297
    .line 298
    :try_start_e
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_8

    .line 299
    .line 300
    .line 301
    goto :goto_d

    .line 302
    :catch_8
    move-exception v0

    .line 303
    move-object v5, v0

    .line 304
    goto :goto_b

    .line 305
    :goto_d
    move-object v5, v14

    .line 306
    :goto_e
    iput-object v5, v10, Lh0/b;->g:[Lh0/c;

    .line 307
    .line 308
    goto :goto_11

    .line 309
    :goto_f
    :try_start_f
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_9

    .line 310
    .line 311
    .line 312
    goto :goto_10

    .line 313
    :catch_9
    move-exception v0

    .line 314
    move-object v2, v0

    .line 315
    const/4 v3, 0x7

    .line 316
    invoke-interface {v8, v3, v2}, Lh0/e;->k(ILjava/io/Serializable;)V

    .line 317
    .line 318
    .line 319
    :goto_10
    throw v1

    .line 320
    :cond_9
    :goto_11
    iget-object v0, v10, Lh0/b;->g:[Lh0/c;

    .line 321
    .line 322
    if-eqz v0, :cond_10

    .line 323
    .line 324
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 325
    .line 326
    const/16 v6, 0x18

    .line 327
    .line 328
    if-ge v5, v6, :cond_a

    .line 329
    .line 330
    goto/16 :goto_1a

    .line 331
    .line 332
    :cond_a
    const/16 v15, 0x1f

    .line 333
    .line 334
    if-lt v5, v15, :cond_b

    .line 335
    .line 336
    goto :goto_12

    .line 337
    :cond_b
    if-eq v5, v6, :cond_c

    .line 338
    .line 339
    const/16 v6, 0x19

    .line 340
    .line 341
    if-eq v5, v6, :cond_c

    .line 342
    .line 343
    goto :goto_1a

    .line 344
    :cond_c
    :goto_12
    :try_start_10
    const-string v5, "dexopt/baseline.profm"

    .line 345
    .line 346
    invoke-virtual {v10, v9, v5}, Lh0/b;->a(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;

    .line 347
    .line 348
    .line 349
    move-result-object v5
    :try_end_10
    .catch Ljava/io/FileNotFoundException; {:try_start_10 .. :try_end_10} :catch_c
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_b
    .catch Ljava/lang/IllegalStateException; {:try_start_10 .. :try_end_10} :catch_a

    .line 350
    if-eqz v5, :cond_e

    .line 351
    .line 352
    :try_start_11
    sget-object v6, Lh0/f;->c:[B

    .line 353
    .line 354
    invoke-static {v5, v4}, Lh0/f;->f(Ljava/io/InputStream;I)[B

    .line 355
    .line 356
    .line 357
    move-result-object v9

    .line 358
    invoke-static {v6, v9}, Ljava/util/Arrays;->equals([B[B)Z

    .line 359
    .line 360
    .line 361
    move-result v6

    .line 362
    if-eqz v6, :cond_d

    .line 363
    .line 364
    invoke-static {v5, v4}, Lh0/f;->f(Ljava/io/InputStream;I)[B

    .line 365
    .line 366
    .line 367
    move-result-object v4

    .line 368
    invoke-static {v5, v4, v2, v0}, Lh0/f;->i(Ljava/io/FileInputStream;[B[B[Lh0/c;)[Lh0/c;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    iput-object v0, v10, Lh0/b;->g:[Lh0/c;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    .line 373
    .line 374
    :try_start_12
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_12
    .catch Ljava/io/FileNotFoundException; {:try_start_12 .. :try_end_12} :catch_c
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_b
    .catch Ljava/lang/IllegalStateException; {:try_start_12 .. :try_end_12} :catch_a

    .line 375
    .line 376
    .line 377
    move-object v0, v10

    .line 378
    goto :goto_19

    .line 379
    :catch_a
    move-exception v0

    .line 380
    goto :goto_15

    .line 381
    :catch_b
    move-exception v0

    .line 382
    const/4 v2, 0x7

    .line 383
    goto :goto_16

    .line 384
    :catch_c
    move-exception v0

    .line 385
    goto :goto_17

    .line 386
    :catchall_4
    move-exception v0

    .line 387
    move-object v2, v0

    .line 388
    goto :goto_13

    .line 389
    :cond_d
    :try_start_13
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 390
    .line 391
    invoke-direct {v0, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    throw v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_4

    .line 395
    :goto_13
    :try_start_14
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_5

    .line 396
    .line 397
    .line 398
    goto :goto_14

    .line 399
    :catchall_5
    move-exception v0

    .line 400
    move-object v4, v0

    .line 401
    :try_start_15
    invoke-virtual {v2, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 402
    .line 403
    .line 404
    :goto_14
    throw v2

    .line 405
    :cond_e
    if-eqz v5, :cond_f

    .line 406
    .line 407
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_15
    .catch Ljava/io/FileNotFoundException; {:try_start_15 .. :try_end_15} :catch_c
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_b
    .catch Ljava/lang/IllegalStateException; {:try_start_15 .. :try_end_15} :catch_a

    .line 408
    .line 409
    .line 410
    goto :goto_18

    .line 411
    :goto_15
    iput-object v14, v10, Lh0/b;->g:[Lh0/c;

    .line 412
    .line 413
    invoke-interface {v8, v11, v0}, Lh0/e;->k(ILjava/io/Serializable;)V

    .line 414
    .line 415
    .line 416
    goto :goto_18

    .line 417
    :goto_16
    invoke-interface {v8, v2, v0}, Lh0/e;->k(ILjava/io/Serializable;)V

    .line 418
    .line 419
    .line 420
    goto :goto_18

    .line 421
    :goto_17
    const/16 v2, 0x9

    .line 422
    .line 423
    invoke-interface {v8, v2, v0}, Lh0/e;->k(ILjava/io/Serializable;)V

    .line 424
    .line 425
    .line 426
    :cond_f
    :goto_18
    move-object v0, v14

    .line 427
    :goto_19
    if-eqz v0, :cond_10

    .line 428
    .line 429
    move-object v10, v0

    .line 430
    :cond_10
    :goto_1a
    iget-object v2, v10, Lh0/b;->b:Lh0/e;

    .line 431
    .line 432
    iget-object v0, v10, Lh0/b;->g:[Lh0/c;

    .line 433
    .line 434
    const-string v4, "This device doesn\'t support aot. Did you call deviceSupportsAotProfile()?"

    .line 435
    .line 436
    if-eqz v0, :cond_14

    .line 437
    .line 438
    iget-object v5, v10, Lh0/b;->c:[B

    .line 439
    .line 440
    if-nez v5, :cond_11

    .line 441
    .line 442
    goto :goto_20

    .line 443
    :cond_11
    iget-boolean v6, v10, Lh0/b;->f:Z

    .line 444
    .line 445
    if-eqz v6, :cond_13

    .line 446
    .line 447
    :try_start_16
    new-instance v6, Ljava/io/ByteArrayOutputStream;

    .line 448
    .line 449
    invoke-direct {v6}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_16
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_e
    .catch Ljava/lang/IllegalStateException; {:try_start_16 .. :try_end_16} :catch_d

    .line 450
    .line 451
    .line 452
    :try_start_17
    invoke-virtual {v6, v3}, Ljava/io/OutputStream;->write([B)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v6, v5}, Ljava/io/OutputStream;->write([B)V

    .line 456
    .line 457
    .line 458
    invoke-static {v6, v5, v0}, Lh0/f;->o(Ljava/io/ByteArrayOutputStream;[B[Lh0/c;)Z

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    if-nez v0, :cond_12

    .line 463
    .line 464
    const/4 v0, 0x5

    .line 465
    invoke-interface {v2, v0, v14}, Lh0/e;->k(ILjava/io/Serializable;)V

    .line 466
    .line 467
    .line 468
    iput-object v14, v10, Lh0/b;->g:[Lh0/c;
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_6

    .line 469
    .line 470
    :try_start_18
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_18
    .catch Ljava/io/IOException; {:try_start_18 .. :try_end_18} :catch_e
    .catch Ljava/lang/IllegalStateException; {:try_start_18 .. :try_end_18} :catch_d

    .line 471
    .line 472
    .line 473
    goto :goto_20

    .line 474
    :catch_d
    move-exception v0

    .line 475
    goto :goto_1d

    .line 476
    :catch_e
    move-exception v0

    .line 477
    const/4 v3, 0x7

    .line 478
    goto :goto_1e

    .line 479
    :catchall_6
    move-exception v0

    .line 480
    move-object v3, v0

    .line 481
    goto :goto_1b

    .line 482
    :cond_12
    :try_start_19
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    iput-object v0, v10, Lh0/b;->h:[B
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_6

    .line 487
    .line 488
    :try_start_1a
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1a
    .catch Ljava/io/IOException; {:try_start_1a .. :try_end_1a} :catch_e
    .catch Ljava/lang/IllegalStateException; {:try_start_1a .. :try_end_1a} :catch_d

    .line 489
    .line 490
    .line 491
    goto :goto_1f

    .line 492
    :goto_1b
    :try_start_1b
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_7

    .line 493
    .line 494
    .line 495
    goto :goto_1c

    .line 496
    :catchall_7
    move-exception v0

    .line 497
    move-object v5, v0

    .line 498
    :try_start_1c
    invoke-virtual {v3, v5}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 499
    .line 500
    .line 501
    :goto_1c
    throw v3
    :try_end_1c
    .catch Ljava/io/IOException; {:try_start_1c .. :try_end_1c} :catch_e
    .catch Ljava/lang/IllegalStateException; {:try_start_1c .. :try_end_1c} :catch_d

    .line 502
    :goto_1d
    invoke-interface {v2, v11, v0}, Lh0/e;->k(ILjava/io/Serializable;)V

    .line 503
    .line 504
    .line 505
    goto :goto_1f

    .line 506
    :goto_1e
    invoke-interface {v2, v3, v0}, Lh0/e;->k(ILjava/io/Serializable;)V

    .line 507
    .line 508
    .line 509
    :goto_1f
    iput-object v14, v10, Lh0/b;->g:[Lh0/c;

    .line 510
    .line 511
    goto :goto_20

    .line 512
    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 513
    .line 514
    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 515
    .line 516
    .line 517
    throw v0

    .line 518
    :cond_14
    :goto_20
    iget-object v0, v10, Lh0/b;->h:[B

    .line 519
    .line 520
    if-nez v0, :cond_15

    .line 521
    .line 522
    const/4 v2, 0x0

    .line 523
    const/4 v6, 0x1

    .line 524
    goto/16 :goto_35

    .line 525
    .line 526
    :cond_15
    iget-boolean v2, v10, Lh0/b;->f:Z

    .line 527
    .line 528
    if-eqz v2, :cond_1a

    .line 529
    .line 530
    :try_start_1d
    new-instance v2, Ljava/io/ByteArrayInputStream;

    .line 531
    .line 532
    invoke-direct {v2, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V
    :try_end_1d
    .catch Ljava/io/FileNotFoundException; {:try_start_1d .. :try_end_1d} :catch_12
    .catch Ljava/io/IOException; {:try_start_1d .. :try_end_1d} :catch_11
    .catchall {:try_start_1d .. :try_end_1d} :catchall_8

    .line 533
    .line 534
    .line 535
    :try_start_1e
    new-instance v3, Ljava/io/FileOutputStream;

    .line 536
    .line 537
    iget-object v0, v10, Lh0/b;->d:Ljava/io/File;

    .line 538
    .line 539
    invoke-direct {v3, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_13

    .line 540
    .line 541
    .line 542
    :try_start_1f
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 543
    .line 544
    .line 545
    move-result-object v4
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_11

    .line 546
    :try_start_20
    invoke-virtual {v4}, Ljava/nio/channels/FileChannel;->tryLock()Ljava/nio/channels/FileLock;

    .line 547
    .line 548
    .line 549
    move-result-object v5
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_f

    .line 550
    if-eqz v5, :cond_17

    .line 551
    .line 552
    :try_start_21
    invoke-virtual {v5}, Ljava/nio/channels/FileLock;->isValid()Z

    .line 553
    .line 554
    .line 555
    move-result v0

    .line 556
    if-eqz v0, :cond_17

    .line 557
    .line 558
    const/16 v0, 0x200

    .line 559
    .line 560
    new-array v0, v0, [B

    .line 561
    .line 562
    :goto_21
    invoke-virtual {v2, v0}, Ljava/io/InputStream;->read([B)I

    .line 563
    .line 564
    .line 565
    move-result v6

    .line 566
    if-lez v6, :cond_16

    .line 567
    .line 568
    const/4 v7, 0x0

    .line 569
    invoke-virtual {v3, v0, v7, v6}, Ljava/io/OutputStream;->write([BII)V
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_d

    .line 570
    .line 571
    .line 572
    goto :goto_21

    .line 573
    :cond_16
    const/4 v6, 0x1

    .line 574
    :try_start_22
    invoke-virtual {v10, v6, v14}, Lh0/b;->b(ILjava/io/Serializable;)V
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_c

    .line 575
    .line 576
    .line 577
    :try_start_23
    invoke-virtual {v5}, Ljava/nio/channels/FileLock;->close()V
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_b

    .line 578
    .line 579
    .line 580
    :try_start_24
    invoke-virtual {v4}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_a

    .line 581
    .line 582
    .line 583
    :try_start_25
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_9

    .line 584
    .line 585
    .line 586
    :try_start_26
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_26
    .catch Ljava/io/FileNotFoundException; {:try_start_26 .. :try_end_26} :catch_10
    .catch Ljava/io/IOException; {:try_start_26 .. :try_end_26} :catch_f
    .catchall {:try_start_26 .. :try_end_26} :catchall_8

    .line 587
    .line 588
    .line 589
    iput-object v14, v10, Lh0/b;->h:[B

    .line 590
    .line 591
    iput-object v14, v10, Lh0/b;->g:[Lh0/c;

    .line 592
    .line 593
    const/4 v2, 0x1

    .line 594
    goto/16 :goto_35

    .line 595
    .line 596
    :catchall_8
    move-exception v0

    .line 597
    goto/16 :goto_36

    .line 598
    .line 599
    :catch_f
    move-exception v0

    .line 600
    :goto_22
    const/4 v2, 0x7

    .line 601
    goto/16 :goto_31

    .line 602
    .line 603
    :catch_10
    move-exception v0

    .line 604
    :goto_23
    const/4 v2, 0x6

    .line 605
    goto/16 :goto_33

    .line 606
    .line 607
    :catchall_9
    move-exception v0

    .line 608
    :goto_24
    move-object v3, v0

    .line 609
    goto :goto_2f

    .line 610
    :catchall_a
    move-exception v0

    .line 611
    :goto_25
    move-object v4, v0

    .line 612
    goto :goto_2d

    .line 613
    :catchall_b
    move-exception v0

    .line 614
    :goto_26
    move-object v5, v0

    .line 615
    goto :goto_2b

    .line 616
    :catchall_c
    move-exception v0

    .line 617
    :goto_27
    move-object v7, v0

    .line 618
    goto :goto_29

    .line 619
    :cond_17
    const/4 v6, 0x1

    .line 620
    goto :goto_28

    .line 621
    :catchall_d
    move-exception v0

    .line 622
    const/4 v6, 0x1

    .line 623
    goto :goto_27

    .line 624
    :goto_28
    :try_start_27
    new-instance v0, Ljava/io/IOException;

    .line 625
    .line 626
    const-string v7, "Unable to acquire a lock on the underlying file channel."

    .line 627
    .line 628
    invoke-direct {v0, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 629
    .line 630
    .line 631
    throw v0
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_c

    .line 632
    :goto_29
    if-eqz v5, :cond_18

    .line 633
    .line 634
    :try_start_28
    invoke-virtual {v5}, Ljava/nio/channels/FileLock;->close()V
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_e

    .line 635
    .line 636
    .line 637
    goto :goto_2a

    .line 638
    :catchall_e
    move-exception v0

    .line 639
    move-object v5, v0

    .line 640
    :try_start_29
    invoke-virtual {v7, v5}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 641
    .line 642
    .line 643
    :cond_18
    :goto_2a
    throw v7
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_b

    .line 644
    :catchall_f
    move-exception v0

    .line 645
    const/4 v6, 0x1

    .line 646
    goto :goto_26

    .line 647
    :goto_2b
    if-eqz v4, :cond_19

    .line 648
    .line 649
    :try_start_2a
    invoke-virtual {v4}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_10

    .line 650
    .line 651
    .line 652
    goto :goto_2c

    .line 653
    :catchall_10
    move-exception v0

    .line 654
    move-object v4, v0

    .line 655
    :try_start_2b
    invoke-virtual {v5, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 656
    .line 657
    .line 658
    :cond_19
    :goto_2c
    throw v5
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_a

    .line 659
    :catchall_11
    move-exception v0

    .line 660
    const/4 v6, 0x1

    .line 661
    goto :goto_25

    .line 662
    :goto_2d
    :try_start_2c
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_2c
    .catchall {:try_start_2c .. :try_end_2c} :catchall_12

    .line 663
    .line 664
    .line 665
    goto :goto_2e

    .line 666
    :catchall_12
    move-exception v0

    .line 667
    move-object v3, v0

    .line 668
    :try_start_2d
    invoke-virtual {v4, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 669
    .line 670
    .line 671
    :goto_2e
    throw v4
    :try_end_2d
    .catchall {:try_start_2d .. :try_end_2d} :catchall_9

    .line 672
    :catchall_13
    move-exception v0

    .line 673
    const/4 v6, 0x1

    .line 674
    goto :goto_24

    .line 675
    :goto_2f
    :try_start_2e
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_2e
    .catchall {:try_start_2e .. :try_end_2e} :catchall_14

    .line 676
    .line 677
    .line 678
    goto :goto_30

    .line 679
    :catchall_14
    move-exception v0

    .line 680
    move-object v2, v0

    .line 681
    :try_start_2f
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 682
    .line 683
    .line 684
    :goto_30
    throw v3
    :try_end_2f
    .catch Ljava/io/FileNotFoundException; {:try_start_2f .. :try_end_2f} :catch_10
    .catch Ljava/io/IOException; {:try_start_2f .. :try_end_2f} :catch_f
    .catchall {:try_start_2f .. :try_end_2f} :catchall_8

    .line 685
    :catch_11
    move-exception v0

    .line 686
    const/4 v6, 0x1

    .line 687
    goto :goto_22

    .line 688
    :catch_12
    move-exception v0

    .line 689
    const/4 v6, 0x1

    .line 690
    goto :goto_23

    .line 691
    :goto_31
    :try_start_30
    invoke-virtual {v10, v2, v0}, Lh0/b;->b(ILjava/io/Serializable;)V
    :try_end_30
    .catchall {:try_start_30 .. :try_end_30} :catchall_8

    .line 692
    .line 693
    .line 694
    :goto_32
    iput-object v14, v10, Lh0/b;->h:[B

    .line 695
    .line 696
    iput-object v14, v10, Lh0/b;->g:[Lh0/c;

    .line 697
    .line 698
    goto :goto_34

    .line 699
    :goto_33
    :try_start_31
    invoke-virtual {v10, v2, v0}, Lh0/b;->b(ILjava/io/Serializable;)V
    :try_end_31
    .catchall {:try_start_31 .. :try_end_31} :catchall_8

    .line 700
    .line 701
    .line 702
    goto :goto_32

    .line 703
    :goto_34
    const/4 v2, 0x0

    .line 704
    :goto_35
    if-eqz v2, :cond_1b

    .line 705
    .line 706
    invoke-static {v12, v13}, Lh0/f;->e(Landroid/content/pm/PackageInfo;Ljava/io/File;)V

    .line 707
    .line 708
    .line 709
    goto :goto_39

    .line 710
    :goto_36
    iput-object v14, v10, Lh0/b;->h:[B

    .line 711
    .line 712
    iput-object v14, v10, Lh0/b;->g:[Lh0/c;

    .line 713
    .line 714
    throw v0

    .line 715
    :cond_1a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 716
    .line 717
    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 718
    .line 719
    .line 720
    throw v0

    .line 721
    :goto_37
    invoke-virtual {v10, v4, v14}, Lh0/b;->b(ILjava/io/Serializable;)V

    .line 722
    .line 723
    .line 724
    :goto_38
    const/4 v2, 0x0

    .line 725
    :cond_1b
    :goto_39
    if-eqz v2, :cond_1c

    .line 726
    .line 727
    if-eqz p3, :cond_1c

    .line 728
    .line 729
    const/4 v11, 0x1

    .line 730
    goto :goto_3a

    .line 731
    :cond_1c
    const/4 v11, 0x0

    .line 732
    :goto_3a
    invoke-static {v1, v11}, Lh0/j;->c(Landroid/content/Context;Z)V

    .line 733
    .line 734
    .line 735
    :goto_3b
    return-void

    .line 736
    :catch_13
    move-exception v0

    .line 737
    move-object v2, v0

    .line 738
    const/4 v3, 0x7

    .line 739
    invoke-interface {v8, v3, v2}, Lh0/e;->k(ILjava/io/Serializable;)V

    .line 740
    .line 741
    .line 742
    const/4 v2, 0x0

    .line 743
    invoke-static {v1, v2}, Lh0/j;->c(Landroid/content/Context;Z)V

    .line 744
    .line 745
    .line 746
    return-void
.end method

.method public static u(Ljava/io/ByteArrayOutputStream;JI)V
    .locals 6

    .line 1
    new-array v0, p3, [B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :goto_0
    if-ge v1, p3, :cond_0

    .line 5
    .line 6
    mul-int/lit8 v2, v1, 0x8

    .line 7
    .line 8
    shr-long v2, p1, v2

    .line 9
    .line 10
    const-wide/16 v4, 0xff

    .line 11
    .line 12
    and-long/2addr v2, v4

    .line 13
    long-to-int v3, v2

    .line 14
    int-to-byte v2, v3

    .line 15
    aput-byte v2, v0, v1

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static v(Ljava/io/ByteArrayOutputStream;I)V
    .locals 2

    .line 1
    int-to-long v0, p1

    .line 2
    const/4 p1, 0x2

    .line 3
    invoke-static {p0, v0, v1, p1}, Lh0/f;->u(Ljava/io/ByteArrayOutputStream;JI)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
