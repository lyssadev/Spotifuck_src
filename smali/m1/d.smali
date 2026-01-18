.class public final Lm1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lr1/e;

.field public b:I

.field public c:Z

.field public d:I

.field public e:[Lm1/b;

.field public f:I

.field public g:I

.field public h:I


# direct methods
.method public constructor <init>(Lr1/e;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, 0x7fffffff

    .line 5
    .line 6
    .line 7
    iput v0, p0, Lm1/d;->b:I

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    new-array v0, v0, [Lm1/b;

    .line 12
    .line 13
    iput-object v0, p0, Lm1/d;->e:[Lm1/b;

    .line 14
    .line 15
    const/4 v0, 0x7

    .line 16
    iput v0, p0, Lm1/d;->f:I

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput v0, p0, Lm1/d;->g:I

    .line 20
    .line 21
    iput v0, p0, Lm1/d;->h:I

    .line 22
    .line 23
    const/16 v0, 0x1000

    .line 24
    .line 25
    iput v0, p0, Lm1/d;->d:I

    .line 26
    .line 27
    iput-object p1, p0, Lm1/d;->a:Lr1/e;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 4

    .line 1
    if-lez p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lm1/d;->e:[Lm1/b;

    .line 4
    .line 5
    array-length v0, v0

    .line 6
    add-int/lit8 v0, v0, -0x1

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    iget v2, p0, Lm1/d;->f:I

    .line 10
    .line 11
    if-lt v0, v2, :cond_0

    .line 12
    .line 13
    if-lez p1, :cond_0

    .line 14
    .line 15
    iget-object v2, p0, Lm1/d;->e:[Lm1/b;

    .line 16
    .line 17
    aget-object v2, v2, v0

    .line 18
    .line 19
    iget v2, v2, Lm1/b;->c:I

    .line 20
    .line 21
    sub-int/2addr p1, v2

    .line 22
    iget v3, p0, Lm1/d;->h:I

    .line 23
    .line 24
    sub-int/2addr v3, v2

    .line 25
    iput v3, p0, Lm1/d;->h:I

    .line 26
    .line 27
    iget v2, p0, Lm1/d;->g:I

    .line 28
    .line 29
    add-int/lit8 v2, v2, -0x1

    .line 30
    .line 31
    iput v2, p0, Lm1/d;->g:I

    .line 32
    .line 33
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    add-int/lit8 v0, v0, -0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object p1, p0, Lm1/d;->e:[Lm1/b;

    .line 39
    .line 40
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    add-int v0, v2, v1

    .line 43
    .line 44
    iget v3, p0, Lm1/d;->g:I

    .line 45
    .line 46
    invoke-static {p1, v2, p1, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lm1/d;->e:[Lm1/b;

    .line 50
    .line 51
    iget v0, p0, Lm1/d;->f:I

    .line 52
    .line 53
    add-int/lit8 v0, v0, 0x1

    .line 54
    .line 55
    add-int v2, v0, v1

    .line 56
    .line 57
    const/4 v3, 0x0

    .line 58
    invoke-static {p1, v0, v2, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget p1, p0, Lm1/d;->f:I

    .line 62
    .line 63
    add-int/2addr p1, v1

    .line 64
    iput p1, p0, Lm1/d;->f:I

    .line 65
    .line 66
    :cond_1
    return-void
.end method

.method public final b(Lm1/b;)V
    .locals 6

    .line 1
    iget v0, p0, Lm1/d;->d:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget v2, p1, Lm1/b;->c:I

    .line 5
    .line 6
    if-le v2, v0, :cond_0

    .line 7
    .line 8
    iget-object p1, p0, Lm1/d;->e:[Lm1/b;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-static {p1, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lm1/d;->e:[Lm1/b;

    .line 15
    .line 16
    array-length p1, p1

    .line 17
    add-int/lit8 p1, p1, -0x1

    .line 18
    .line 19
    iput p1, p0, Lm1/d;->f:I

    .line 20
    .line 21
    iput v1, p0, Lm1/d;->g:I

    .line 22
    .line 23
    iput v1, p0, Lm1/d;->h:I

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    iget v3, p0, Lm1/d;->h:I

    .line 27
    .line 28
    add-int/2addr v3, v2

    .line 29
    sub-int/2addr v3, v0

    .line 30
    invoke-virtual {p0, v3}, Lm1/d;->a(I)V

    .line 31
    .line 32
    .line 33
    iget v0, p0, Lm1/d;->g:I

    .line 34
    .line 35
    add-int/lit8 v0, v0, 0x1

    .line 36
    .line 37
    iget-object v3, p0, Lm1/d;->e:[Lm1/b;

    .line 38
    .line 39
    array-length v4, v3

    .line 40
    if-le v0, v4, :cond_1

    .line 41
    .line 42
    array-length v0, v3

    .line 43
    mul-int/lit8 v0, v0, 0x2

    .line 44
    .line 45
    new-array v0, v0, [Lm1/b;

    .line 46
    .line 47
    array-length v4, v3

    .line 48
    array-length v5, v3

    .line 49
    invoke-static {v3, v1, v0, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lm1/d;->e:[Lm1/b;

    .line 53
    .line 54
    array-length v1, v1

    .line 55
    add-int/lit8 v1, v1, -0x1

    .line 56
    .line 57
    iput v1, p0, Lm1/d;->f:I

    .line 58
    .line 59
    iput-object v0, p0, Lm1/d;->e:[Lm1/b;

    .line 60
    .line 61
    :cond_1
    iget v0, p0, Lm1/d;->f:I

    .line 62
    .line 63
    add-int/lit8 v1, v0, -0x1

    .line 64
    .line 65
    iput v1, p0, Lm1/d;->f:I

    .line 66
    .line 67
    iget-object v1, p0, Lm1/d;->e:[Lm1/b;

    .line 68
    .line 69
    aput-object p1, v1, v0

    .line 70
    .line 71
    iget p1, p0, Lm1/d;->g:I

    .line 72
    .line 73
    add-int/lit8 p1, p1, 0x1

    .line 74
    .line 75
    iput p1, p0, Lm1/d;->g:I

    .line 76
    .line 77
    iget p1, p0, Lm1/d;->h:I

    .line 78
    .line 79
    add-int/2addr p1, v2

    .line 80
    iput p1, p0, Lm1/d;->h:I

    .line 81
    .line 82
    return-void
.end method

.method public final c(Lr1/h;)V
    .locals 11

    .line 1
    sget-object v0, Lm1/B;->d:Lm1/B;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    move-wide v4, v0

    .line 10
    const/4 v3, 0x0

    .line 11
    :goto_0
    invoke-virtual {p1}, Lr1/h;->l()I

    .line 12
    .line 13
    .line 14
    move-result v6

    .line 15
    const/16 v7, 0xff

    .line 16
    .line 17
    if-ge v3, v6, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1, v3}, Lr1/h;->g(I)B

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    and-int/2addr v6, v7

    .line 24
    sget-object v7, Lm1/B;->c:[B

    .line 25
    .line 26
    aget-byte v6, v7, v6

    .line 27
    .line 28
    int-to-long v6, v6

    .line 29
    add-long/2addr v4, v6

    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const-wide/16 v8, 0x7

    .line 34
    .line 35
    add-long/2addr v4, v8

    .line 36
    const/4 v3, 0x3

    .line 37
    shr-long v3, v4, v3

    .line 38
    .line 39
    long-to-int v4, v3

    .line 40
    invoke-virtual {p1}, Lr1/h;->l()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    iget-object v5, p0, Lm1/d;->a:Lr1/e;

    .line 45
    .line 46
    const/16 v6, 0x7f

    .line 47
    .line 48
    if-ge v4, v3, :cond_4

    .line 49
    .line 50
    new-instance v3, Lr1/e;

    .line 51
    .line 52
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 53
    .line 54
    .line 55
    sget-object v4, Lm1/B;->d:Lm1/B;

    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    :goto_1
    invoke-virtual {p1}, Lr1/h;->l()I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    if-ge v2, v8, :cond_2

    .line 66
    .line 67
    invoke-virtual {p1, v2}, Lr1/h;->g(I)B

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    and-int/2addr v8, v7

    .line 72
    sget-object v9, Lm1/B;->b:[I

    .line 73
    .line 74
    aget v9, v9, v8

    .line 75
    .line 76
    sget-object v10, Lm1/B;->c:[B

    .line 77
    .line 78
    aget-byte v8, v10, v8

    .line 79
    .line 80
    shl-long/2addr v0, v8

    .line 81
    int-to-long v9, v9

    .line 82
    or-long/2addr v0, v9

    .line 83
    add-int/2addr v4, v8

    .line 84
    :goto_2
    const/16 v8, 0x8

    .line 85
    .line 86
    if-lt v4, v8, :cond_1

    .line 87
    .line 88
    add-int/lit8 v4, v4, -0x8

    .line 89
    .line 90
    shr-long v8, v0, v4

    .line 91
    .line 92
    long-to-int v9, v8

    .line 93
    invoke-virtual {v3, v9}, Lr1/e;->v(I)V

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_2
    if-lez v4, :cond_3

    .line 101
    .line 102
    rsub-int/lit8 p1, v4, 0x8

    .line 103
    .line 104
    shl-long/2addr v0, p1

    .line 105
    ushr-int p1, v7, v4

    .line 106
    .line 107
    int-to-long v7, p1

    .line 108
    or-long/2addr v0, v7

    .line 109
    long-to-int p1, v0

    .line 110
    invoke-virtual {v3, p1}, Lr1/e;->v(I)V

    .line 111
    .line 112
    .line 113
    :cond_3
    new-instance p1, Lr1/h;

    .line 114
    .line 115
    :try_start_0
    iget-wide v0, v3, Lr1/e;->b:J

    .line 116
    .line 117
    invoke-virtual {v3, v0, v1}, Lr1/e;->k(J)[B

    .line 118
    .line 119
    .line 120
    move-result-object v0
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    invoke-direct {p1, v0}, Lr1/h;-><init>([B)V

    .line 122
    .line 123
    .line 124
    array-length v0, v0

    .line 125
    const/16 v1, 0x80

    .line 126
    .line 127
    invoke-virtual {p0, v0, v6, v1}, Lm1/d;->d(III)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v5}, Lr1/h;->p(Lr1/e;)V

    .line 131
    .line 132
    .line 133
    goto :goto_3

    .line 134
    :catch_0
    move-exception p1

    .line 135
    new-instance v0, Ljava/lang/AssertionError;

    .line 136
    .line 137
    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    throw v0

    .line 141
    :cond_4
    invoke-virtual {p1}, Lr1/h;->l()I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    invoke-virtual {p0, v0, v6, v2}, Lm1/d;->d(III)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1, v5}, Lr1/h;->p(Lr1/e;)V

    .line 149
    .line 150
    .line 151
    :goto_3
    return-void
.end method

.method public final d(III)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm1/d;->a:Lr1/e;

    .line 2
    .line 3
    if-ge p1, p2, :cond_0

    .line 4
    .line 5
    or-int/2addr p1, p3

    .line 6
    invoke-virtual {v0, p1}, Lr1/e;->v(I)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    or-int/2addr p3, p2

    .line 11
    invoke-virtual {v0, p3}, Lr1/e;->v(I)V

    .line 12
    .line 13
    .line 14
    sub-int/2addr p1, p2

    .line 15
    :goto_0
    const/16 p2, 0x80

    .line 16
    .line 17
    if-lt p1, p2, :cond_1

    .line 18
    .line 19
    and-int/lit8 p3, p1, 0x7f

    .line 20
    .line 21
    or-int/2addr p2, p3

    .line 22
    invoke-virtual {v0, p2}, Lr1/e;->v(I)V

    .line 23
    .line 24
    .line 25
    ushr-int/lit8 p1, p1, 0x7

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-virtual {v0, p1}, Lr1/e;->v(I)V

    .line 29
    .line 30
    .line 31
    return-void
.end method
