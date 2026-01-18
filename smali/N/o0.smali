.class public abstract LN/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LN/w0;

.field public b:[LF/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, LN/w0;

    invoke-direct {v0}, LN/w0;-><init>()V

    invoke-direct {p0, v0}, LN/o0;-><init>(LN/w0;)V

    return-void
.end method

.method public constructor <init>(LN/w0;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LN/o0;->a:LN/w0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget-object v0, p0, LN/o0;->b:[LF/c;

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    aget-object v1, v0, v1

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    aget-object v0, v0, v2

    .line 10
    .line 11
    iget-object v3, p0, LN/o0;->a:LN/w0;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, v3, LN/w0;->a:LN/u0;

    .line 16
    .line 17
    const/4 v4, 0x2

    .line 18
    invoke-virtual {v0, v4}, LN/u0;->f(I)LF/c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_0
    if-nez v1, :cond_1

    .line 23
    .line 24
    iget-object v1, v3, LN/w0;->a:LN/u0;

    .line 25
    .line 26
    invoke-virtual {v1, v2}, LN/u0;->f(I)LF/c;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    :cond_1
    invoke-static {v1, v0}, LF/c;->a(LF/c;LF/c;)LF/c;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p0, v0}, LN/o0;->g(LF/c;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, LN/o0;->b:[LF/c;

    .line 38
    .line 39
    const/4 v1, 0x4

    .line 40
    aget-object v0, v0, v1

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0, v0}, LN/o0;->f(LF/c;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    iget-object v0, p0, LN/o0;->b:[LF/c;

    .line 48
    .line 49
    const/4 v1, 0x5

    .line 50
    aget-object v0, v0, v1

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    invoke-virtual {p0, v0}, LN/o0;->d(LF/c;)V

    .line 55
    .line 56
    .line 57
    :cond_3
    iget-object v0, p0, LN/o0;->b:[LF/c;

    .line 58
    .line 59
    const/4 v1, 0x6

    .line 60
    aget-object v0, v0, v1

    .line 61
    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    invoke-virtual {p0, v0}, LN/o0;->h(LF/c;)V

    .line 65
    .line 66
    .line 67
    :cond_4
    return-void
.end method

.method public abstract b()LN/w0;
.end method

.method public c(ILF/c;)V
    .locals 7

    .line 1
    iget-object v0, p0, LN/o0;->b:[LF/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x9

    .line 6
    .line 7
    new-array v0, v0, [LF/c;

    .line 8
    .line 9
    iput-object v0, p0, LN/o0;->b:[LF/c;

    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x1

    .line 12
    const/4 v1, 0x1

    .line 13
    :goto_0
    const/16 v2, 0x100

    .line 14
    .line 15
    if-gt v1, v2, :cond_b

    .line 16
    .line 17
    and-int v3, p1, v1

    .line 18
    .line 19
    if-nez v3, :cond_1

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_1
    iget-object v3, p0, LN/o0;->b:[LF/c;

    .line 23
    .line 24
    if-eq v1, v0, :cond_9

    .line 25
    .line 26
    const/4 v4, 0x2

    .line 27
    if-eq v1, v4, :cond_8

    .line 28
    .line 29
    const/4 v5, 0x4

    .line 30
    if-eq v1, v5, :cond_a

    .line 31
    .line 32
    const/16 v4, 0x8

    .line 33
    .line 34
    if-eq v1, v4, :cond_7

    .line 35
    .line 36
    const/16 v6, 0x10

    .line 37
    .line 38
    if-eq v1, v6, :cond_6

    .line 39
    .line 40
    const/16 v5, 0x20

    .line 41
    .line 42
    if-eq v1, v5, :cond_5

    .line 43
    .line 44
    const/16 v5, 0x40

    .line 45
    .line 46
    if-eq v1, v5, :cond_4

    .line 47
    .line 48
    const/16 v5, 0x80

    .line 49
    .line 50
    if-eq v1, v5, :cond_3

    .line 51
    .line 52
    if-ne v1, v2, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 56
    .line 57
    const-string p2, "type needs to be >= FIRST and <= LAST, type="

    .line 58
    .line 59
    invoke-static {p2, v1}, LQ0/E;->e(Ljava/lang/String;I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p1

    .line 67
    :cond_3
    const/4 v4, 0x7

    .line 68
    goto :goto_1

    .line 69
    :cond_4
    const/4 v4, 0x6

    .line 70
    goto :goto_1

    .line 71
    :cond_5
    const/4 v4, 0x5

    .line 72
    goto :goto_1

    .line 73
    :cond_6
    const/4 v4, 0x4

    .line 74
    goto :goto_1

    .line 75
    :cond_7
    const/4 v4, 0x3

    .line 76
    goto :goto_1

    .line 77
    :cond_8
    const/4 v4, 0x1

    .line 78
    goto :goto_1

    .line 79
    :cond_9
    const/4 v4, 0x0

    .line 80
    :cond_a
    :goto_1
    aput-object p2, v3, v4

    .line 81
    .line 82
    :goto_2
    shl-int/lit8 v1, v1, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_b
    return-void
.end method

.method public d(LF/c;)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract e(LF/c;)V
.end method

.method public f(LF/c;)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract g(LF/c;)V
.end method

.method public h(LF/c;)V
    .locals 0

    .line 1
    return-void
.end method
