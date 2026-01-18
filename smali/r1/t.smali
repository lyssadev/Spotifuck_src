.class public final Lr1/t;
.super Lr1/h;
.source "SourceFile"


# instance fields
.field public final transient f:[[B

.field public final transient g:[I


# direct methods
.method public constructor <init>(Lr1/e;I)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lr1/h;-><init>([B)V

    .line 3
    .line 4
    .line 5
    iget-wide v1, p1, Lr1/e;->b:J

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    int-to-long v5, p2

    .line 10
    invoke-static/range {v1 .. v6}, Lr1/y;->a(JJJ)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p1, Lr1/e;->a:Lr1/r;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    :goto_0
    if-ge v2, p2, :cond_1

    .line 19
    .line 20
    iget v4, v0, Lr1/r;->c:I

    .line 21
    .line 22
    iget v5, v0, Lr1/r;->b:I

    .line 23
    .line 24
    if-eq v4, v5, :cond_0

    .line 25
    .line 26
    sub-int/2addr v4, v5

    .line 27
    add-int/2addr v2, v4

    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    iget-object v0, v0, Lr1/r;->f:Lr1/r;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    .line 34
    .line 35
    const-string p2, "s.limit == s.pos"

    .line 36
    .line 37
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    throw p1

    .line 41
    :cond_1
    new-array v0, v3, [[B

    .line 42
    .line 43
    iput-object v0, p0, Lr1/t;->f:[[B

    .line 44
    .line 45
    mul-int/lit8 v3, v3, 0x2

    .line 46
    .line 47
    new-array v0, v3, [I

    .line 48
    .line 49
    iput-object v0, p0, Lr1/t;->g:[I

    .line 50
    .line 51
    iget-object p1, p1, Lr1/e;->a:Lr1/r;

    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    :goto_1
    if-ge v1, p2, :cond_3

    .line 55
    .line 56
    iget-object v2, p0, Lr1/t;->f:[[B

    .line 57
    .line 58
    iget-object v3, p1, Lr1/r;->a:[B

    .line 59
    .line 60
    aput-object v3, v2, v0

    .line 61
    .line 62
    iget v3, p1, Lr1/r;->c:I

    .line 63
    .line 64
    iget v4, p1, Lr1/r;->b:I

    .line 65
    .line 66
    sub-int/2addr v3, v4

    .line 67
    add-int/2addr v3, v1

    .line 68
    if-le v3, p2, :cond_2

    .line 69
    .line 70
    move v1, p2

    .line 71
    goto :goto_2

    .line 72
    :cond_2
    move v1, v3

    .line 73
    :goto_2
    iget-object v3, p0, Lr1/t;->g:[I

    .line 74
    .line 75
    aput v1, v3, v0

    .line 76
    .line 77
    array-length v2, v2

    .line 78
    add-int/2addr v2, v0

    .line 79
    aput v4, v3, v2

    .line 80
    .line 81
    const/4 v2, 0x1

    .line 82
    iput-boolean v2, p1, Lr1/r;->d:Z

    .line 83
    .line 84
    add-int/lit8 v0, v0, 0x1

    .line 85
    .line 86
    iget-object p1, p1, Lr1/r;->f:Lr1/r;

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

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
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p1, Lr1/h;

    .line 10
    .line 11
    invoke-virtual {p1}, Lr1/h;->l()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {p0}, Lr1/t;->l()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-ne v1, v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Lr1/t;->l()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {p0, p1, v1}, Lr1/t;->k(Lr1/h;I)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v0, 0x0

    .line 33
    :goto_0
    return v0
.end method

.method public final g(I)B
    .locals 9

    .line 1
    iget-object v0, p0, Lr1/t;->f:[[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    add-int/lit8 v1, v1, -0x1

    .line 5
    .line 6
    iget-object v2, p0, Lr1/t;->g:[I

    .line 7
    .line 8
    aget v1, v2, v1

    .line 9
    .line 10
    int-to-long v3, v1

    .line 11
    int-to-long v5, p1

    .line 12
    const-wide/16 v7, 0x1

    .line 13
    .line 14
    invoke-static/range {v3 .. v8}, Lr1/y;->a(JJJ)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lr1/t;->q(I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    add-int/lit8 v3, v1, -0x1

    .line 26
    .line 27
    aget v3, v2, v3

    .line 28
    .line 29
    :goto_0
    array-length v4, v0

    .line 30
    add-int/2addr v4, v1

    .line 31
    aget v2, v2, v4

    .line 32
    .line 33
    aget-object v0, v0, v1

    .line 34
    .line 35
    sub-int/2addr p1, v3

    .line 36
    add-int/2addr p1, v2

    .line 37
    aget-byte p1, v0, p1

    .line 38
    .line 39
    return p1
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lr1/t;->r()Lr1/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lr1/h;->h()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final hashCode()I
    .locals 9

    .line 1
    iget v0, p0, Lr1/h;->b:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    iget-object v0, p0, Lr1/t;->f:[[B

    .line 7
    .line 8
    array-length v1, v0

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x1

    .line 13
    :goto_0
    if-ge v2, v1, :cond_2

    .line 14
    .line 15
    aget-object v5, v0, v2

    .line 16
    .line 17
    add-int v6, v1, v2

    .line 18
    .line 19
    iget-object v7, p0, Lr1/t;->g:[I

    .line 20
    .line 21
    aget v6, v7, v6

    .line 22
    .line 23
    aget v7, v7, v2

    .line 24
    .line 25
    sub-int v3, v7, v3

    .line 26
    .line 27
    add-int/2addr v3, v6

    .line 28
    :goto_1
    if-ge v6, v3, :cond_1

    .line 29
    .line 30
    mul-int/lit8 v4, v4, 0x1f

    .line 31
    .line 32
    aget-byte v8, v5, v6

    .line 33
    .line 34
    add-int/2addr v4, v8

    .line 35
    add-int/lit8 v6, v6, 0x1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    move v3, v7

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    iput v4, p0, Lr1/h;->b:I

    .line 43
    .line 44
    return v4
.end method

.method public final j(I[BII)Z
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-ltz p1, :cond_5

    .line 4
    .line 5
    invoke-virtual {p0}, Lr1/t;->l()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    sub-int/2addr v2, p4

    .line 10
    if-gt p1, v2, :cond_5

    .line 11
    .line 12
    if-ltz p3, :cond_5

    .line 13
    .line 14
    array-length v2, p2

    .line 15
    sub-int/2addr v2, p4

    .line 16
    if-le p3, v2, :cond_0

    .line 17
    .line 18
    goto :goto_3

    .line 19
    :cond_0
    invoke-virtual {p0, p1}, Lr1/t;->q(I)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    :goto_0
    if-lez p4, :cond_4

    .line 24
    .line 25
    iget-object v3, p0, Lr1/t;->g:[I

    .line 26
    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    add-int/lit8 v4, v2, -0x1

    .line 32
    .line 33
    aget v4, v3, v4

    .line 34
    .line 35
    :goto_1
    aget v5, v3, v2

    .line 36
    .line 37
    sub-int/2addr v5, v4

    .line 38
    add-int/2addr v5, v4

    .line 39
    sub-int/2addr v5, p1

    .line 40
    invoke-static {p4, v5}, Ljava/lang/Math;->min(II)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    iget-object v6, p0, Lr1/t;->f:[[B

    .line 45
    .line 46
    array-length v7, v6

    .line 47
    add-int/2addr v7, v2

    .line 48
    aget v3, v3, v7

    .line 49
    .line 50
    sub-int v4, p1, v4

    .line 51
    .line 52
    add-int/2addr v4, v3

    .line 53
    aget-object v3, v6, v2

    .line 54
    .line 55
    sget-object v6, Lr1/y;->a:Ljava/nio/charset/Charset;

    .line 56
    .line 57
    const/4 v6, 0x0

    .line 58
    :goto_2
    if-ge v6, v5, :cond_3

    .line 59
    .line 60
    add-int v7, v6, v4

    .line 61
    .line 62
    aget-byte v7, v3, v7

    .line 63
    .line 64
    add-int v8, v6, p3

    .line 65
    .line 66
    aget-byte v8, p2, v8

    .line 67
    .line 68
    if-eq v7, v8, :cond_2

    .line 69
    .line 70
    return v1

    .line 71
    :cond_2
    add-int/2addr v6, v0

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    add-int/2addr p1, v5

    .line 74
    add-int/2addr p3, v5

    .line 75
    sub-int/2addr p4, v5

    .line 76
    add-int/2addr v2, v0

    .line 77
    goto :goto_0

    .line 78
    :cond_4
    return v0

    .line 79
    :cond_5
    :goto_3
    return v1
.end method

.method public final k(Lr1/h;I)Z
    .locals 9

    .line 1
    invoke-virtual {p0}, Lr1/t;->l()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sub-int/2addr v0, p2

    .line 6
    const/4 v1, 0x0

    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    return v1

    .line 10
    :cond_0
    invoke-virtual {p0, v1}, Lr1/t;->q(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    :goto_0
    if-lez p2, :cond_3

    .line 17
    .line 18
    iget-object v4, p0, Lr1/t;->g:[I

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    add-int/lit8 v5, v0, -0x1

    .line 25
    .line 26
    aget v5, v4, v5

    .line 27
    .line 28
    :goto_1
    aget v6, v4, v0

    .line 29
    .line 30
    sub-int/2addr v6, v5

    .line 31
    add-int/2addr v6, v5

    .line 32
    sub-int/2addr v6, v2

    .line 33
    invoke-static {p2, v6}, Ljava/lang/Math;->min(II)I

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    iget-object v7, p0, Lr1/t;->f:[[B

    .line 38
    .line 39
    array-length v8, v7

    .line 40
    add-int/2addr v8, v0

    .line 41
    aget v4, v4, v8

    .line 42
    .line 43
    sub-int v5, v2, v5

    .line 44
    .line 45
    add-int/2addr v5, v4

    .line 46
    aget-object v4, v7, v0

    .line 47
    .line 48
    invoke-virtual {p1, v3, v4, v5, v6}, Lr1/h;->j(I[BII)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-nez v4, :cond_2

    .line 53
    .line 54
    return v1

    .line 55
    :cond_2
    add-int/2addr v2, v6

    .line 56
    add-int/2addr v3, v6

    .line 57
    sub-int/2addr p2, v6

    .line 58
    add-int/lit8 v0, v0, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    const/4 p1, 0x1

    .line 62
    return p1
.end method

.method public final l()I
    .locals 2

    .line 1
    iget-object v0, p0, Lr1/t;->f:[[B

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    add-int/lit8 v0, v0, -0x1

    .line 5
    .line 6
    iget-object v1, p0, Lr1/t;->g:[I

    .line 7
    .line 8
    aget v0, v1, v0

    .line 9
    .line 10
    return v0
.end method

.method public final m()Lr1/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lr1/t;->r()Lr1/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lr1/h;->m()Lr1/h;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final n()Lr1/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lr1/t;->r()Lr1/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lr1/h;->n()Lr1/h;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final o()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lr1/t;->r()Lr1/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lr1/h;->o()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final p(Lr1/e;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lr1/t;->f:[[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    :goto_0
    if-ge v2, v1, :cond_1

    .line 7
    .line 8
    add-int v4, v1, v2

    .line 9
    .line 10
    iget-object v5, p0, Lr1/t;->g:[I

    .line 11
    .line 12
    aget v4, v5, v4

    .line 13
    .line 14
    aget v5, v5, v2

    .line 15
    .line 16
    new-instance v6, Lr1/r;

    .line 17
    .line 18
    aget-object v7, v0, v2

    .line 19
    .line 20
    add-int v8, v4, v5

    .line 21
    .line 22
    sub-int/2addr v8, v3

    .line 23
    invoke-direct {v6, v7, v4, v8}, Lr1/r;-><init>([BII)V

    .line 24
    .line 25
    .line 26
    iget-object v3, p1, Lr1/e;->a:Lr1/r;

    .line 27
    .line 28
    if-nez v3, :cond_0

    .line 29
    .line 30
    iput-object v6, v6, Lr1/r;->g:Lr1/r;

    .line 31
    .line 32
    iput-object v6, v6, Lr1/r;->f:Lr1/r;

    .line 33
    .line 34
    iput-object v6, p1, Lr1/e;->a:Lr1/r;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    iget-object v3, v3, Lr1/r;->g:Lr1/r;

    .line 38
    .line 39
    invoke-virtual {v3, v6}, Lr1/r;->b(Lr1/r;)V

    .line 40
    .line 41
    .line 42
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    move v3, v5

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iget-wide v0, p1, Lr1/e;->b:J

    .line 47
    .line 48
    int-to-long v2, v3

    .line 49
    add-long/2addr v0, v2

    .line 50
    iput-wide v0, p1, Lr1/e;->b:J

    .line 51
    .line 52
    return-void
.end method

.method public final q(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lr1/t;->f:[[B

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    add-int/lit8 p1, p1, 0x1

    .line 5
    .line 6
    iget-object v1, p0, Lr1/t;->g:[I

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {v1, v2, v0, p1}, Ljava/util/Arrays;->binarySearch([IIII)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-ltz p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    not-int p1, p1

    .line 17
    :goto_0
    return p1
.end method

.method public final r()Lr1/h;
    .locals 11

    .line 1
    new-instance v0, Lr1/h;

    .line 2
    .line 3
    iget-object v1, p0, Lr1/t;->f:[[B

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    add-int/lit8 v2, v2, -0x1

    .line 7
    .line 8
    iget-object v3, p0, Lr1/t;->g:[I

    .line 9
    .line 10
    aget v2, v3, v2

    .line 11
    .line 12
    new-array v2, v2, [B

    .line 13
    .line 14
    array-length v4, v1

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    :goto_0
    if-ge v5, v4, :cond_0

    .line 18
    .line 19
    add-int v7, v4, v5

    .line 20
    .line 21
    aget v7, v3, v7

    .line 22
    .line 23
    aget v8, v3, v5

    .line 24
    .line 25
    aget-object v9, v1, v5

    .line 26
    .line 27
    sub-int v10, v8, v6

    .line 28
    .line 29
    invoke-static {v9, v7, v2, v6, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 30
    .line 31
    .line 32
    add-int/lit8 v5, v5, 0x1

    .line 33
    .line 34
    move v6, v8

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-direct {v0, v2}, Lr1/h;-><init>([B)V

    .line 37
    .line 38
    .line 39
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lr1/t;->r()Lr1/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lr1/h;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
