.class public final Lr1/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[B

.field public b:I

.field public c:I

.field public d:Z

.field public final e:Z

.field public f:Lr1/r;

.field public g:Lr1/r;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2000

    .line 2
    new-array v0, v0, [B

    iput-object v0, p0, Lr1/r;->a:[B

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lr1/r;->e:Z

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lr1/r;->d:Z

    return-void
.end method

.method public constructor <init>([BII)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lr1/r;->a:[B

    .line 7
    iput p2, p0, Lr1/r;->b:I

    .line 8
    iput p3, p0, Lr1/r;->c:I

    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lr1/r;->d:Z

    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Lr1/r;->e:Z

    return-void
.end method


# virtual methods
.method public final a()Lr1/r;
    .locals 4

    .line 1
    iget-object v0, p0, Lr1/r;->f:Lr1/r;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eq v0, p0, :cond_0

    .line 5
    .line 6
    move-object v2, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move-object v2, v1

    .line 9
    :goto_0
    iget-object v3, p0, Lr1/r;->g:Lr1/r;

    .line 10
    .line 11
    iput-object v0, v3, Lr1/r;->f:Lr1/r;

    .line 12
    .line 13
    iget-object v0, p0, Lr1/r;->f:Lr1/r;

    .line 14
    .line 15
    iput-object v3, v0, Lr1/r;->g:Lr1/r;

    .line 16
    .line 17
    iput-object v1, p0, Lr1/r;->f:Lr1/r;

    .line 18
    .line 19
    iput-object v1, p0, Lr1/r;->g:Lr1/r;

    .line 20
    .line 21
    return-object v2
.end method

.method public final b(Lr1/r;)V
    .locals 1

    .line 1
    iput-object p0, p1, Lr1/r;->g:Lr1/r;

    .line 2
    .line 3
    iget-object v0, p0, Lr1/r;->f:Lr1/r;

    .line 4
    .line 5
    iput-object v0, p1, Lr1/r;->f:Lr1/r;

    .line 6
    .line 7
    iget-object v0, p0, Lr1/r;->f:Lr1/r;

    .line 8
    .line 9
    iput-object p1, v0, Lr1/r;->g:Lr1/r;

    .line 10
    .line 11
    iput-object p1, p0, Lr1/r;->f:Lr1/r;

    .line 12
    .line 13
    return-void
.end method

.method public final c()Lr1/r;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lr1/r;->d:Z

    .line 3
    .line 4
    new-instance v0, Lr1/r;

    .line 5
    .line 6
    iget v1, p0, Lr1/r;->b:I

    .line 7
    .line 8
    iget v2, p0, Lr1/r;->c:I

    .line 9
    .line 10
    iget-object v3, p0, Lr1/r;->a:[B

    .line 11
    .line 12
    invoke-direct {v0, v3, v1, v2}, Lr1/r;-><init>([BII)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final d(Lr1/r;I)V
    .locals 5

    .line 1
    iget-boolean v0, p1, Lr1/r;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget v0, p1, Lr1/r;->c:I

    .line 6
    .line 7
    add-int v1, v0, p2

    .line 8
    .line 9
    const/16 v2, 0x2000

    .line 10
    .line 11
    iget-object v3, p1, Lr1/r;->a:[B

    .line 12
    .line 13
    if-le v1, v2, :cond_2

    .line 14
    .line 15
    iget-boolean v4, p1, Lr1/r;->d:Z

    .line 16
    .line 17
    if-nez v4, :cond_1

    .line 18
    .line 19
    iget v4, p1, Lr1/r;->b:I

    .line 20
    .line 21
    sub-int/2addr v1, v4

    .line 22
    if-gt v1, v2, :cond_0

    .line 23
    .line 24
    sub-int/2addr v0, v4

    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-static {v3, v4, v3, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 27
    .line 28
    .line 29
    iget v0, p1, Lr1/r;->c:I

    .line 30
    .line 31
    iget v2, p1, Lr1/r;->b:I

    .line 32
    .line 33
    sub-int/2addr v0, v2

    .line 34
    iput v0, p1, Lr1/r;->c:I

    .line 35
    .line 36
    iput v1, p1, Lr1/r;->b:I

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 46
    .line 47
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_2
    :goto_0
    iget v0, p0, Lr1/r;->b:I

    .line 52
    .line 53
    iget v1, p1, Lr1/r;->c:I

    .line 54
    .line 55
    iget-object v2, p0, Lr1/r;->a:[B

    .line 56
    .line 57
    invoke-static {v2, v0, v3, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 58
    .line 59
    .line 60
    iget v0, p1, Lr1/r;->c:I

    .line 61
    .line 62
    add-int/2addr v0, p2

    .line 63
    iput v0, p1, Lr1/r;->c:I

    .line 64
    .line 65
    iget p1, p0, Lr1/r;->b:I

    .line 66
    .line 67
    add-int/2addr p1, p2

    .line 68
    iput p1, p0, Lr1/r;->b:I

    .line 69
    .line 70
    return-void

    .line 71
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 72
    .line 73
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 74
    .line 75
    .line 76
    throw p1
.end method
