.class public Landroidx/recyclerview/widget/LinearLayoutManager;
.super Lj0/K;
.source "SourceFile"

# interfaces
.implements Lj0/W;


# instance fields
.field public final A:Lj0/s;

.field public final B:Lg1/i;

.field public final C:I

.field public final D:[I

.field public p:I

.field public q:Lj0/t;

.field public r:Landroidx/emoji2/text/g;

.field public s:Z

.field public final t:Z

.field public u:Z

.field public v:Z

.field public final w:Z

.field public x:I

.field public y:I

.field public z:Lj0/u;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lj0/K;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    const/4 v1, 0x0

    .line 3
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->t:Z

    .line 4
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 5
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->v:Z

    .line 6
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->w:Z

    const/4 v0, -0x1

    .line 7
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    const/high16 v0, -0x80000000

    .line 8
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lj0/u;

    .line 10
    new-instance v2, Lj0/s;

    invoke-direct {v2}, Lj0/s;-><init>()V

    iput-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->A:Lj0/s;

    .line 11
    new-instance v2, Lg1/i;

    .line 12
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->B:Lg1/i;

    const/4 v2, 0x2

    .line 14
    iput v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->C:I

    .line 15
    new-array v2, v2, [I

    iput-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->D:[I

    .line 16
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->Z0(I)V

    .line 17
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->c(Ljava/lang/String;)V

    .line 18
    iget-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->t:Z

    if-nez p1, :cond_0

    goto :goto_0

    .line 19
    :cond_0
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->t:Z

    .line 20
    invoke-virtual {p0}, Lj0/K;->l0()V

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 2

    .line 21
    invoke-direct {p0}, Lj0/K;-><init>()V

    const/4 v0, 0x1

    .line 22
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    const/4 v1, 0x0

    .line 23
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->t:Z

    .line 24
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 25
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->v:Z

    .line 26
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->w:Z

    const/4 v0, -0x1

    .line 27
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    const/high16 v0, -0x80000000

    .line 28
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    const/4 v0, 0x0

    .line 29
    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lj0/u;

    .line 30
    new-instance v1, Lj0/s;

    invoke-direct {v1}, Lj0/s;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->A:Lj0/s;

    .line 31
    new-instance v1, Lg1/i;

    .line 32
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->B:Lg1/i;

    const/4 v1, 0x2

    .line 34
    iput v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->C:I

    .line 35
    new-array v1, v1, [I

    iput-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->D:[I

    .line 36
    invoke-static {p1, p2, p3, p4}, Lj0/K;->I(Landroid/content/Context;Landroid/util/AttributeSet;II)Lj0/J;

    move-result-object p1

    .line 37
    iget p2, p1, Lj0/J;->a:I

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->Z0(I)V

    .line 38
    iget-boolean p2, p1, Lj0/J;->c:Z

    .line 39
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->c(Ljava/lang/String;)V

    .line 40
    iget-boolean p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->t:Z

    if-ne p2, p3, :cond_0

    goto :goto_0

    .line 41
    :cond_0
    iput-boolean p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->t:Z

    .line 42
    invoke-virtual {p0}, Lj0/K;->l0()V

    .line 43
    :goto_0
    iget-boolean p1, p1, Lj0/J;->d:Z

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->a1(Z)V

    return-void
.end method


# virtual methods
.method public A0(Lj0/X;[I)V
    .locals 3

    .line 1
    iget p1, p1, Lj0/X;->a:I

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/emoji2/text/g;->l()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 16
    .line 17
    iget v2, v2, Lj0/t;->f:I

    .line 18
    .line 19
    if-ne v2, v0, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v0, p1

    .line 24
    const/4 p1, 0x0

    .line 25
    :goto_1
    aput p1, p2, v1

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    aput v0, p2, p1

    .line 29
    .line 30
    return-void
.end method

.method public B0(Lj0/X;Lj0/t;Lj0/n;)V
    .locals 1

    .line 1
    iget v0, p2, Lj0/t;->d:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lj0/X;->b()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-ge v0, p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iget p2, p2, Lj0/t;->g:I

    .line 13
    .line 14
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {p3, v0, p1}, Lj0/n;->a(II)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final C0(Lj0/X;)I
    .locals 6

    .line 1
    invoke-virtual {p0}, Lj0/K;->v()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->G0()V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 13
    .line 14
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->w:Z

    .line 15
    .line 16
    xor-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->J0(Z)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->I0(Z)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    iget-boolean v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->w:Z

    .line 27
    .line 28
    move-object v0, p1

    .line 29
    move-object v4, p0

    .line 30
    invoke-static/range {v0 .. v5}, LT0/g;->i(Lj0/X;Landroidx/emoji2/text/g;Landroid/view/View;Landroid/view/View;Lj0/K;Z)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1
.end method

.method public final D0(Lj0/X;)I
    .locals 7

    .line 1
    invoke-virtual {p0}, Lj0/K;->v()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->G0()V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 13
    .line 14
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->w:Z

    .line 15
    .line 16
    xor-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->J0(Z)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->I0(Z)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    iget-boolean v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->w:Z

    .line 27
    .line 28
    iget-boolean v6, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 29
    .line 30
    move-object v0, p1

    .line 31
    move-object v4, p0

    .line 32
    invoke-static/range {v0 .. v6}, LT0/g;->j(Lj0/X;Landroidx/emoji2/text/g;Landroid/view/View;Landroid/view/View;Lj0/K;ZZ)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    return p1
.end method

.method public final E0(Lj0/X;)I
    .locals 6

    .line 1
    invoke-virtual {p0}, Lj0/K;->v()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->G0()V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 13
    .line 14
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->w:Z

    .line 15
    .line 16
    xor-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->J0(Z)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->I0(Z)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    iget-boolean v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->w:Z

    .line 27
    .line 28
    move-object v0, p1

    .line 29
    move-object v4, p0

    .line 30
    invoke-static/range {v0 .. v5}, LT0/g;->k(Lj0/X;Landroidx/emoji2/text/g;Landroid/view/View;Landroid/view/View;Lj0/K;Z)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1
.end method

.method public final F0(I)I
    .locals 4

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eq p1, v1, :cond_b

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    if-eq p1, v2, :cond_8

    .line 7
    .line 8
    const/16 v2, 0x11

    .line 9
    .line 10
    const/high16 v3, -0x80000000

    .line 11
    .line 12
    if-eq p1, v2, :cond_6

    .line 13
    .line 14
    const/16 v2, 0x21

    .line 15
    .line 16
    if-eq p1, v2, :cond_4

    .line 17
    .line 18
    const/16 v0, 0x42

    .line 19
    .line 20
    if-eq p1, v0, :cond_2

    .line 21
    .line 22
    const/16 v0, 0x82

    .line 23
    .line 24
    if-eq p1, v0, :cond_0

    .line 25
    .line 26
    return v3

    .line 27
    :cond_0
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 28
    .line 29
    if-ne p1, v1, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/high16 v1, -0x80000000

    .line 33
    .line 34
    :goto_0
    return v1

    .line 35
    :cond_2
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 36
    .line 37
    if-nez p1, :cond_3

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_3
    const/high16 v1, -0x80000000

    .line 41
    .line 42
    :goto_1
    return v1

    .line 43
    :cond_4
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 44
    .line 45
    if-ne p1, v1, :cond_5

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_5
    const/high16 v0, -0x80000000

    .line 49
    .line 50
    :goto_2
    return v0

    .line 51
    :cond_6
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 52
    .line 53
    if-nez p1, :cond_7

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_7
    const/high16 v0, -0x80000000

    .line 57
    .line 58
    :goto_3
    return v0

    .line 59
    :cond_8
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 60
    .line 61
    if-ne p1, v1, :cond_9

    .line 62
    .line 63
    return v1

    .line 64
    :cond_9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->S0()Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_a

    .line 69
    .line 70
    return v0

    .line 71
    :cond_a
    return v1

    .line 72
    :cond_b
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 73
    .line 74
    if-ne p1, v1, :cond_c

    .line 75
    .line 76
    return v0

    .line 77
    :cond_c
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->S0()Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_d

    .line 82
    .line 83
    return v1

    .line 84
    :cond_d
    return v0
.end method

.method public final G0()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lj0/t;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    iput-boolean v1, v0, Lj0/t;->a:Z

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput v1, v0, Lj0/t;->h:I

    .line 15
    .line 16
    iput v1, v0, Lj0/t;->i:I

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    iput-object v1, v0, Lj0/t;->k:Ljava/util/List;

    .line 20
    .line 21
    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final H0(Lj0/Q;Lj0/t;Lj0/X;Z)I
    .locals 7

    .line 1
    iget v0, p2, Lj0/t;->c:I

    .line 2
    .line 3
    iget v1, p2, Lj0/t;->g:I

    .line 4
    .line 5
    const/high16 v2, -0x80000000

    .line 6
    .line 7
    if-eq v1, v2, :cond_1

    .line 8
    .line 9
    if-gez v0, :cond_0

    .line 10
    .line 11
    add-int/2addr v1, v0

    .line 12
    iput v1, p2, Lj0/t;->g:I

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->V0(Lj0/Q;Lj0/t;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    iget v1, p2, Lj0/t;->c:I

    .line 18
    .line 19
    iget v3, p2, Lj0/t;->h:I

    .line 20
    .line 21
    add-int/2addr v1, v3

    .line 22
    :cond_2
    iget-boolean v3, p2, Lj0/t;->l:Z

    .line 23
    .line 24
    if-nez v3, :cond_3

    .line 25
    .line 26
    if-lez v1, :cond_9

    .line 27
    .line 28
    :cond_3
    iget v3, p2, Lj0/t;->d:I

    .line 29
    .line 30
    if-ltz v3, :cond_9

    .line 31
    .line 32
    invoke-virtual {p3}, Lj0/X;->b()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-ge v3, v4, :cond_9

    .line 37
    .line 38
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->B:Lg1/i;

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    iput v4, v3, Lg1/i;->a:I

    .line 42
    .line 43
    iput-boolean v4, v3, Lg1/i;->b:Z

    .line 44
    .line 45
    iput-boolean v4, v3, Lg1/i;->c:Z

    .line 46
    .line 47
    iput-boolean v4, v3, Lg1/i;->d:Z

    .line 48
    .line 49
    invoke-virtual {p0, p1, p3, p2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->T0(Lj0/Q;Lj0/X;Lj0/t;Lg1/i;)V

    .line 50
    .line 51
    .line 52
    iget-boolean v4, v3, Lg1/i;->b:Z

    .line 53
    .line 54
    if-eqz v4, :cond_4

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_4
    iget v4, p2, Lj0/t;->b:I

    .line 58
    .line 59
    iget v5, v3, Lg1/i;->a:I

    .line 60
    .line 61
    iget v6, p2, Lj0/t;->f:I

    .line 62
    .line 63
    mul-int v6, v6, v5

    .line 64
    .line 65
    add-int/2addr v6, v4

    .line 66
    iput v6, p2, Lj0/t;->b:I

    .line 67
    .line 68
    iget-boolean v4, v3, Lg1/i;->c:Z

    .line 69
    .line 70
    if-eqz v4, :cond_5

    .line 71
    .line 72
    iget-object v4, p2, Lj0/t;->k:Ljava/util/List;

    .line 73
    .line 74
    if-nez v4, :cond_5

    .line 75
    .line 76
    iget-boolean v4, p3, Lj0/X;->g:Z

    .line 77
    .line 78
    if-nez v4, :cond_6

    .line 79
    .line 80
    :cond_5
    iget v4, p2, Lj0/t;->c:I

    .line 81
    .line 82
    sub-int/2addr v4, v5

    .line 83
    iput v4, p2, Lj0/t;->c:I

    .line 84
    .line 85
    sub-int/2addr v1, v5

    .line 86
    :cond_6
    iget v4, p2, Lj0/t;->g:I

    .line 87
    .line 88
    if-eq v4, v2, :cond_8

    .line 89
    .line 90
    add-int/2addr v4, v5

    .line 91
    iput v4, p2, Lj0/t;->g:I

    .line 92
    .line 93
    iget v5, p2, Lj0/t;->c:I

    .line 94
    .line 95
    if-gez v5, :cond_7

    .line 96
    .line 97
    add-int/2addr v4, v5

    .line 98
    iput v4, p2, Lj0/t;->g:I

    .line 99
    .line 100
    :cond_7
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->V0(Lj0/Q;Lj0/t;)V

    .line 101
    .line 102
    .line 103
    :cond_8
    if-eqz p4, :cond_2

    .line 104
    .line 105
    iget-boolean v3, v3, Lg1/i;->d:Z

    .line 106
    .line 107
    if-eqz v3, :cond_2

    .line 108
    .line 109
    :cond_9
    :goto_0
    iget p1, p2, Lj0/t;->c:I

    .line 110
    .line 111
    sub-int/2addr v0, p1

    .line 112
    return v0
.end method

.method public final I0(Z)Landroid/view/View;
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0}, Lj0/K;->v()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {p0, v0, v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->M0(IIZ)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :cond_0
    invoke-virtual {p0}, Lj0/K;->v()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    add-int/lit8 v0, v0, -0x1

    .line 20
    .line 21
    const/4 v1, -0x1

    .line 22
    invoke-virtual {p0, v0, v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->M0(IIZ)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method

.method public final J0(Z)Landroid/view/View;
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lj0/K;->v()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    const/4 v1, -0x1

    .line 12
    invoke-virtual {p0, v0, v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->M0(IIZ)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p0}, Lj0/K;->v()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {p0, v0, v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->M0(IIZ)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method

.method public final K0()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lj0/K;->v()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {p0, v0, v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->M0(IIZ)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {v0}, Lj0/K;->H(Landroid/view/View;)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    :goto_0
    return v1
.end method

.method public final L()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public final L0(II)Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->G0()V

    .line 2
    .line 3
    .line 4
    if-le p2, p1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    if-ge p2, p1, :cond_3

    .line 8
    .line 9
    :goto_0
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lj0/K;->u(I)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Landroidx/emoji2/text/g;->e(Landroid/view/View;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroidx/emoji2/text/g;->k()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-ge v0, v1, :cond_1

    .line 26
    .line 27
    const/16 v0, 0x4104

    .line 28
    .line 29
    const/16 v1, 0x4004

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const/16 v0, 0x1041

    .line 33
    .line 34
    const/16 v1, 0x1001

    .line 35
    .line 36
    :goto_1
    iget v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 37
    .line 38
    if-nez v2, :cond_2

    .line 39
    .line 40
    iget-object v2, p0, Lj0/K;->c:LE/j;

    .line 41
    .line 42
    invoke-virtual {v2, p1, p2, v0, v1}, LE/j;->w(IIII)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    iget-object v2, p0, Lj0/K;->d:LE/j;

    .line 48
    .line 49
    invoke-virtual {v2, p1, p2, v0, v1}, LE/j;->w(IIII)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    :goto_2
    return-object p1

    .line 54
    :cond_3
    invoke-virtual {p0, p1}, Lj0/K;->u(I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    return-object p1
.end method

.method public final M0(IIZ)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->G0()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x140

    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    const/16 p3, 0x6003

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/16 p3, 0x140

    .line 12
    .line 13
    :goto_0
    iget v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 14
    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    iget-object v1, p0, Lj0/K;->c:LE/j;

    .line 18
    .line 19
    invoke-virtual {v1, p1, p2, p3, v0}, LE/j;->w(IIII)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    iget-object v1, p0, Lj0/K;->d:LE/j;

    .line 25
    .line 26
    invoke-virtual {v1, p1, p2, p3, v0}, LE/j;->w(IIII)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :goto_1
    return-object p1
.end method

.method public N0(Lj0/Q;Lj0/X;III)Landroid/view/View;
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->G0()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/emoji2/text/g;->k()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iget-object p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 11
    .line 12
    invoke-virtual {p2}, Landroidx/emoji2/text/g;->g()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    if-le p4, p3, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, -0x1

    .line 21
    :goto_0
    const/4 v1, 0x0

    .line 22
    move-object v2, v1

    .line 23
    :goto_1
    if-eq p3, p4, :cond_5

    .line 24
    .line 25
    invoke-virtual {p0, p3}, Lj0/K;->u(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-static {v3}, Lj0/K;->H(Landroid/view/View;)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-ltz v4, :cond_4

    .line 34
    .line 35
    if-ge v4, p5, :cond_4

    .line 36
    .line 37
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Lj0/L;

    .line 42
    .line 43
    iget-object v4, v4, Lj0/L;->a:Lj0/a0;

    .line 44
    .line 45
    invoke-virtual {v4}, Lj0/a0;->i()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_1

    .line 50
    .line 51
    if-nez v2, :cond_4

    .line 52
    .line 53
    move-object v2, v3

    .line 54
    goto :goto_3

    .line 55
    :cond_1
    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 56
    .line 57
    invoke-virtual {v4, v3}, Landroidx/emoji2/text/g;->e(Landroid/view/View;)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-ge v4, p2, :cond_3

    .line 62
    .line 63
    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 64
    .line 65
    invoke-virtual {v4, v3}, Landroidx/emoji2/text/g;->b(Landroid/view/View;)I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-ge v4, p1, :cond_2

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    return-object v3

    .line 73
    :cond_3
    :goto_2
    if-nez v1, :cond_4

    .line 74
    .line 75
    move-object v1, v3

    .line 76
    :cond_4
    :goto_3
    add-int/2addr p3, v0

    .line 77
    goto :goto_1

    .line 78
    :cond_5
    if-eqz v1, :cond_6

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_6
    move-object v1, v2

    .line 82
    :goto_4
    return-object v1
.end method

.method public final O0(ILj0/Q;Lj0/X;Z)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/emoji2/text/g;->g()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sub-int/2addr v0, p1

    .line 8
    if-lez v0, :cond_1

    .line 9
    .line 10
    neg-int v0, v0

    .line 11
    invoke-virtual {p0, v0, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->Y0(ILj0/Q;Lj0/X;)I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    neg-int p2, p2

    .line 16
    add-int/2addr p1, p2

    .line 17
    if-eqz p4, :cond_0

    .line 18
    .line 19
    iget-object p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 20
    .line 21
    invoke-virtual {p3}, Landroidx/emoji2/text/g;->g()I

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    sub-int/2addr p3, p1

    .line 26
    if-lez p3, :cond_0

    .line 27
    .line 28
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 29
    .line 30
    invoke-virtual {p1, p3}, Landroidx/emoji2/text/g;->p(I)V

    .line 31
    .line 32
    .line 33
    add-int/2addr p3, p2

    .line 34
    return p3

    .line 35
    :cond_0
    return p2

    .line 36
    :cond_1
    const/4 p1, 0x0

    .line 37
    return p1
.end method

.method public final P0(ILj0/Q;Lj0/X;Z)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/emoji2/text/g;->k()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sub-int v0, p1, v0

    .line 8
    .line 9
    if-lez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0, v0, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->Y0(ILj0/Q;Lj0/X;)I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    neg-int p2, p2

    .line 16
    add-int/2addr p1, p2

    .line 17
    if-eqz p4, :cond_0

    .line 18
    .line 19
    iget-object p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 20
    .line 21
    invoke-virtual {p3}, Landroidx/emoji2/text/g;->k()I

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    sub-int/2addr p1, p3

    .line 26
    if-lez p1, :cond_0

    .line 27
    .line 28
    iget-object p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 29
    .line 30
    neg-int p4, p1

    .line 31
    invoke-virtual {p3, p4}, Landroidx/emoji2/text/g;->p(I)V

    .line 32
    .line 33
    .line 34
    sub-int/2addr p2, p1

    .line 35
    :cond_0
    return p2

    .line 36
    :cond_1
    const/4 p1, 0x0

    .line 37
    return p1
.end method

.method public final Q0()Landroid/view/View;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0}, Lj0/K;->v()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    :goto_0
    invoke-virtual {p0, v0}, Lj0/K;->u(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public final R(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final R0()Landroid/view/View;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lj0/K;->v()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-virtual {p0, v0}, Lj0/K;->u(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public S(Landroid/view/View;ILj0/Q;Lj0/X;)Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->X0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lj0/K;->v()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    const/4 v0, 0x0

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->F0(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/high16 p2, -0x80000000

    .line 17
    .line 18
    if-ne p1, p2, :cond_1

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->G0()V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 25
    .line 26
    invoke-virtual {v1}, Landroidx/emoji2/text/g;->l()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    int-to-float v1, v1

    .line 31
    const v2, 0x3eaaaaab

    .line 32
    .line 33
    .line 34
    mul-float v1, v1, v2

    .line 35
    .line 36
    float-to-int v1, v1

    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-virtual {p0, p1, v1, v2, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->b1(IIZLj0/X;)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 42
    .line 43
    iput p2, v1, Lj0/t;->g:I

    .line 44
    .line 45
    iput-boolean v2, v1, Lj0/t;->a:Z

    .line 46
    .line 47
    const/4 p2, 0x1

    .line 48
    invoke-virtual {p0, p3, v1, p4, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->H0(Lj0/Q;Lj0/t;Lj0/X;Z)I

    .line 49
    .line 50
    .line 51
    const/4 p3, -0x1

    .line 52
    if-ne p1, p3, :cond_3

    .line 53
    .line 54
    iget-boolean p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 55
    .line 56
    if-eqz p4, :cond_2

    .line 57
    .line 58
    invoke-virtual {p0}, Lj0/K;->v()I

    .line 59
    .line 60
    .line 61
    move-result p4

    .line 62
    sub-int/2addr p4, p2

    .line 63
    invoke-virtual {p0, p4, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->L0(II)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    goto :goto_0

    .line 68
    :cond_2
    invoke-virtual {p0}, Lj0/K;->v()I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    invoke-virtual {p0, v2, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->L0(II)Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    goto :goto_0

    .line 77
    :cond_3
    iget-boolean p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 78
    .line 79
    if-eqz p4, :cond_4

    .line 80
    .line 81
    invoke-virtual {p0}, Lj0/K;->v()I

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    invoke-virtual {p0, v2, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->L0(II)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    goto :goto_0

    .line 90
    :cond_4
    invoke-virtual {p0}, Lj0/K;->v()I

    .line 91
    .line 92
    .line 93
    move-result p4

    .line 94
    sub-int/2addr p4, p2

    .line 95
    invoke-virtual {p0, p4, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->L0(II)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    :goto_0
    if-ne p1, p3, :cond_5

    .line 100
    .line 101
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->R0()Landroid/view/View;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    goto :goto_1

    .line 106
    :cond_5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->Q0()Landroid/view/View;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->hasFocusable()Z

    .line 111
    .line 112
    .line 113
    move-result p3

    .line 114
    if-eqz p3, :cond_7

    .line 115
    .line 116
    if-nez p2, :cond_6

    .line 117
    .line 118
    return-object v0

    .line 119
    :cond_6
    return-object p1

    .line 120
    :cond_7
    return-object p2
.end method

.method public final S0()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lj0/K;->C()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    :goto_0
    return v1
.end method

.method public final T(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lj0/K;->T(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lj0/K;->v()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-lez v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Lj0/K;->v()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p0, v1, v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->M0(IIZ)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const/4 v0, -0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {v0}, Lj0/K;->H(Landroid/view/View;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->K0()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method

.method public T0(Lj0/Q;Lj0/X;Lj0/t;Lg1/i;)V
    .locals 11

    .line 1
    invoke-virtual {p3, p1}, Lj0/t;->b(Lj0/Q;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 p2, 0x1

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    iput-boolean p2, p4, Lg1/i;->b:Z

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lj0/L;

    .line 16
    .line 17
    iget-object v1, p3, Lj0/t;->k:Ljava/util/List;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, -0x1

    .line 21
    if-nez v1, :cond_3

    .line 22
    .line 23
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 24
    .line 25
    iget v4, p3, Lj0/t;->f:I

    .line 26
    .line 27
    if-ne v4, v3, :cond_1

    .line 28
    .line 29
    const/4 v4, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v4, 0x0

    .line 32
    :goto_0
    if-ne v1, v4, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0, p1, v3, v2}, Lj0/K;->b(Landroid/view/View;IZ)V

    .line 35
    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    invoke-virtual {p0, p1, v2, v2}, Lj0/K;->b(Landroid/view/View;IZ)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_3
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 43
    .line 44
    iget v4, p3, Lj0/t;->f:I

    .line 45
    .line 46
    if-ne v4, v3, :cond_4

    .line 47
    .line 48
    const/4 v4, 0x1

    .line 49
    goto :goto_1

    .line 50
    :cond_4
    const/4 v4, 0x0

    .line 51
    :goto_1
    if-ne v1, v4, :cond_5

    .line 52
    .line 53
    invoke-virtual {p0, p1, v3, p2}, Lj0/K;->b(Landroid/view/View;IZ)V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_5
    invoke-virtual {p0, p1, v2, p2}, Lj0/K;->b(Landroid/view/View;IZ)V

    .line 58
    .line 59
    .line 60
    :goto_2
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Lj0/L;

    .line 65
    .line 66
    iget-object v2, p0, Lj0/K;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 67
    .line 68
    invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/RecyclerView;->J(Landroid/view/View;)Landroid/graphics/Rect;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    iget v4, v2, Landroid/graphics/Rect;->left:I

    .line 73
    .line 74
    iget v5, v2, Landroid/graphics/Rect;->right:I

    .line 75
    .line 76
    add-int/2addr v4, v5

    .line 77
    iget v5, v2, Landroid/graphics/Rect;->top:I

    .line 78
    .line 79
    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    .line 80
    .line 81
    add-int/2addr v5, v2

    .line 82
    iget v2, p0, Lj0/K;->n:I

    .line 83
    .line 84
    iget v6, p0, Lj0/K;->l:I

    .line 85
    .line 86
    invoke-virtual {p0}, Lj0/K;->E()I

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    invoke-virtual {p0}, Lj0/K;->F()I

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    add-int/2addr v8, v7

    .line 95
    iget v7, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 96
    .line 97
    add-int/2addr v8, v7

    .line 98
    iget v7, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 99
    .line 100
    add-int/2addr v8, v7

    .line 101
    add-int/2addr v8, v4

    .line 102
    iget v4, v1, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 103
    .line 104
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->d()Z

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    invoke-static {v7, v2, v6, v8, v4}, Lj0/K;->w(ZIIII)I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    iget v4, p0, Lj0/K;->o:I

    .line 113
    .line 114
    iget v6, p0, Lj0/K;->m:I

    .line 115
    .line 116
    invoke-virtual {p0}, Lj0/K;->G()I

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    invoke-virtual {p0}, Lj0/K;->D()I

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    add-int/2addr v8, v7

    .line 125
    iget v7, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 126
    .line 127
    add-int/2addr v8, v7

    .line 128
    iget v7, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 129
    .line 130
    add-int/2addr v8, v7

    .line 131
    add-int/2addr v8, v5

    .line 132
    iget v5, v1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 133
    .line 134
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->e()Z

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    invoke-static {v7, v4, v6, v8, v5}, Lj0/K;->w(ZIIII)I

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    invoke-virtual {p0, p1, v2, v4, v1}, Lj0/K;->u0(Landroid/view/View;IILj0/L;)Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-eqz v1, :cond_6

    .line 147
    .line 148
    invoke-virtual {p1, v2, v4}, Landroid/view/View;->measure(II)V

    .line 149
    .line 150
    .line 151
    :cond_6
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 152
    .line 153
    invoke-virtual {v1, p1}, Landroidx/emoji2/text/g;->c(Landroid/view/View;)I

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    iput v1, p4, Lg1/i;->a:I

    .line 158
    .line 159
    iget v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 160
    .line 161
    if-ne v1, p2, :cond_9

    .line 162
    .line 163
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->S0()Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-eqz v1, :cond_7

    .line 168
    .line 169
    iget v1, p0, Lj0/K;->n:I

    .line 170
    .line 171
    invoke-virtual {p0}, Lj0/K;->F()I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    sub-int/2addr v1, v2

    .line 176
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 177
    .line 178
    invoke-virtual {v2, p1}, Landroidx/emoji2/text/g;->d(Landroid/view/View;)I

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    sub-int v2, v1, v2

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_7
    invoke-virtual {p0}, Lj0/K;->E()I

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 190
    .line 191
    invoke-virtual {v1, p1}, Landroidx/emoji2/text/g;->d(Landroid/view/View;)I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    add-int/2addr v1, v2

    .line 196
    :goto_3
    iget v4, p3, Lj0/t;->f:I

    .line 197
    .line 198
    if-ne v4, v3, :cond_8

    .line 199
    .line 200
    iget p3, p3, Lj0/t;->b:I

    .line 201
    .line 202
    iget v3, p4, Lg1/i;->a:I

    .line 203
    .line 204
    sub-int v3, p3, v3

    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_8
    iget v3, p3, Lj0/t;->b:I

    .line 208
    .line 209
    iget p3, p4, Lg1/i;->a:I

    .line 210
    .line 211
    add-int/2addr p3, v3

    .line 212
    goto :goto_4

    .line 213
    :cond_9
    invoke-virtual {p0}, Lj0/K;->G()I

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 218
    .line 219
    invoke-virtual {v2, p1}, Landroidx/emoji2/text/g;->d(Landroid/view/View;)I

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    add-int/2addr v2, v1

    .line 224
    iget v4, p3, Lj0/t;->f:I

    .line 225
    .line 226
    if-ne v4, v3, :cond_a

    .line 227
    .line 228
    iget p3, p3, Lj0/t;->b:I

    .line 229
    .line 230
    iget v3, p4, Lg1/i;->a:I

    .line 231
    .line 232
    sub-int v3, p3, v3

    .line 233
    .line 234
    move v9, v1

    .line 235
    move v1, p3

    .line 236
    move p3, v2

    .line 237
    move v2, v3

    .line 238
    move v3, v9

    .line 239
    goto :goto_4

    .line 240
    :cond_a
    iget p3, p3, Lj0/t;->b:I

    .line 241
    .line 242
    iget v3, p4, Lg1/i;->a:I

    .line 243
    .line 244
    add-int/2addr v3, p3

    .line 245
    move v9, v2

    .line 246
    move v2, p3

    .line 247
    move p3, v9

    .line 248
    move v10, v3

    .line 249
    move v3, v1

    .line 250
    move v1, v10

    .line 251
    :goto_4
    invoke-static {p1, v2, v3, v1, p3}, Lj0/K;->N(Landroid/view/View;IIII)V

    .line 252
    .line 253
    .line 254
    iget-object p3, v0, Lj0/L;->a:Lj0/a0;

    .line 255
    .line 256
    invoke-virtual {p3}, Lj0/a0;->i()Z

    .line 257
    .line 258
    .line 259
    move-result p3

    .line 260
    if-nez p3, :cond_b

    .line 261
    .line 262
    iget-object p3, v0, Lj0/L;->a:Lj0/a0;

    .line 263
    .line 264
    invoke-virtual {p3}, Lj0/a0;->l()Z

    .line 265
    .line 266
    .line 267
    move-result p3

    .line 268
    if-eqz p3, :cond_c

    .line 269
    .line 270
    :cond_b
    iput-boolean p2, p4, Lg1/i;->c:Z

    .line 271
    .line 272
    :cond_c
    invoke-virtual {p1}, Landroid/view/View;->hasFocusable()Z

    .line 273
    .line 274
    .line 275
    move-result p1

    .line 276
    iput-boolean p1, p4, Lg1/i;->d:Z

    .line 277
    .line 278
    return-void
.end method

.method public U0(Lj0/Q;Lj0/X;Lj0/s;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final V0(Lj0/Q;Lj0/t;)V
    .locals 5

    .line 1
    iget-boolean v0, p2, Lj0/t;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_e

    .line 4
    .line 5
    iget-boolean v0, p2, Lj0/t;->l:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_8

    .line 10
    .line 11
    :cond_0
    iget v0, p2, Lj0/t;->g:I

    .line 12
    .line 13
    iget v1, p2, Lj0/t;->i:I

    .line 14
    .line 15
    iget p2, p2, Lj0/t;->f:I

    .line 16
    .line 17
    const/4 v2, -0x1

    .line 18
    const/4 v3, 0x0

    .line 19
    if-ne p2, v2, :cond_7

    .line 20
    .line 21
    invoke-virtual {p0}, Lj0/K;->v()I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-gez v0, :cond_1

    .line 26
    .line 27
    goto/16 :goto_8

    .line 28
    .line 29
    :cond_1
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 30
    .line 31
    invoke-virtual {v2}, Landroidx/emoji2/text/g;->f()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    sub-int/2addr v2, v0

    .line 36
    add-int/2addr v2, v1

    .line 37
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 38
    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    :goto_0
    if-ge v0, p2, :cond_e

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Lj0/K;->u(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 49
    .line 50
    invoke-virtual {v4, v1}, Landroidx/emoji2/text/g;->e(Landroid/view/View;)I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-lt v4, v2, :cond_3

    .line 55
    .line 56
    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 57
    .line 58
    invoke-virtual {v4, v1}, Landroidx/emoji2/text/g;->o(Landroid/view/View;)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-ge v1, v2, :cond_2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    :goto_1
    invoke-virtual {p0, p1, v3, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->W0(Lj0/Q;II)V

    .line 69
    .line 70
    .line 71
    goto/16 :goto_8

    .line 72
    .line 73
    :cond_4
    add-int/lit8 p2, p2, -0x1

    .line 74
    .line 75
    move v0, p2

    .line 76
    :goto_2
    if-ltz v0, :cond_e

    .line 77
    .line 78
    invoke-virtual {p0, v0}, Lj0/K;->u(I)Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 83
    .line 84
    invoke-virtual {v3, v1}, Landroidx/emoji2/text/g;->e(Landroid/view/View;)I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-lt v3, v2, :cond_6

    .line 89
    .line 90
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 91
    .line 92
    invoke-virtual {v3, v1}, Landroidx/emoji2/text/g;->o(Landroid/view/View;)I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-ge v1, v2, :cond_5

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_5
    add-int/lit8 v0, v0, -0x1

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_6
    :goto_3
    invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->W0(Lj0/Q;II)V

    .line 103
    .line 104
    .line 105
    goto :goto_8

    .line 106
    :cond_7
    if-gez v0, :cond_8

    .line 107
    .line 108
    goto :goto_8

    .line 109
    :cond_8
    sub-int/2addr v0, v1

    .line 110
    invoke-virtual {p0}, Lj0/K;->v()I

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 115
    .line 116
    if-eqz v1, :cond_b

    .line 117
    .line 118
    add-int/lit8 p2, p2, -0x1

    .line 119
    .line 120
    move v1, p2

    .line 121
    :goto_4
    if-ltz v1, :cond_e

    .line 122
    .line 123
    invoke-virtual {p0, v1}, Lj0/K;->u(I)Landroid/view/View;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 128
    .line 129
    invoke-virtual {v3, v2}, Landroidx/emoji2/text/g;->b(Landroid/view/View;)I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    if-gt v3, v0, :cond_a

    .line 134
    .line 135
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 136
    .line 137
    invoke-virtual {v3, v2}, Landroidx/emoji2/text/g;->n(Landroid/view/View;)I

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-le v2, v0, :cond_9

    .line 142
    .line 143
    goto :goto_5

    .line 144
    :cond_9
    add-int/lit8 v1, v1, -0x1

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_a
    :goto_5
    invoke-virtual {p0, p1, p2, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->W0(Lj0/Q;II)V

    .line 148
    .line 149
    .line 150
    goto :goto_8

    .line 151
    :cond_b
    const/4 v1, 0x0

    .line 152
    :goto_6
    if-ge v1, p2, :cond_e

    .line 153
    .line 154
    invoke-virtual {p0, v1}, Lj0/K;->u(I)Landroid/view/View;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 159
    .line 160
    invoke-virtual {v4, v2}, Landroidx/emoji2/text/g;->b(Landroid/view/View;)I

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    if-gt v4, v0, :cond_d

    .line 165
    .line 166
    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 167
    .line 168
    invoke-virtual {v4, v2}, Landroidx/emoji2/text/g;->n(Landroid/view/View;)I

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-le v2, v0, :cond_c

    .line 173
    .line 174
    goto :goto_7

    .line 175
    :cond_c
    add-int/lit8 v1, v1, 0x1

    .line 176
    .line 177
    goto :goto_6

    .line 178
    :cond_d
    :goto_7
    invoke-virtual {p0, p1, v3, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->W0(Lj0/Q;II)V

    .line 179
    .line 180
    .line 181
    :cond_e
    :goto_8
    return-void
.end method

.method public final W0(Lj0/Q;II)V
    .locals 1

    .line 1
    if-ne p2, p3, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    if-le p3, p2, :cond_1

    .line 5
    .line 6
    add-int/lit8 p3, p3, -0x1

    .line 7
    .line 8
    :goto_0
    if-lt p3, p2, :cond_2

    .line 9
    .line 10
    invoke-virtual {p0, p3}, Lj0/K;->u(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0, p3}, Lj0/K;->j0(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lj0/Q;->f(Landroid/view/View;)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 p3, p3, -0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    :goto_1
    if-le p2, p3, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0, p2}, Lj0/K;->u(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p0, p2}, Lj0/K;->j0(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Lj0/Q;->f(Landroid/view/View;)V

    .line 33
    .line 34
    .line 35
    add-int/lit8 p2, p2, -0x1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    return-void
.end method

.method public final X0()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->S0()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->t:Z

    .line 14
    .line 15
    xor-int/2addr v0, v1

    .line 16
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    :goto_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->t:Z

    .line 20
    .line 21
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 22
    .line 23
    :goto_1
    return-void
.end method

.method public final Y0(ILj0/Q;Lj0/X;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Lj0/K;->v()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->G0()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    iput-boolean v2, v0, Lj0/t;->a:Z

    .line 18
    .line 19
    if-lez p1, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v0, -0x1

    .line 24
    :goto_0
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {p0, v0, v3, v2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->b1(IIZLj0/X;)V

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 32
    .line 33
    iget v4, v2, Lj0/t;->g:I

    .line 34
    .line 35
    invoke-virtual {p0, p2, v2, p3, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->H0(Lj0/Q;Lj0/t;Lj0/X;Z)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    add-int/2addr p2, v4

    .line 40
    if-gez p2, :cond_2

    .line 41
    .line 42
    return v1

    .line 43
    :cond_2
    if-le v3, p2, :cond_3

    .line 44
    .line 45
    mul-int p1, v0, p2

    .line 46
    .line 47
    :cond_3
    iget-object p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 48
    .line 49
    neg-int p3, p1

    .line 50
    invoke-virtual {p2, p3}, Landroidx/emoji2/text/g;->p(I)V

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 54
    .line 55
    iput p1, p2, Lj0/t;->j:I

    .line 56
    .line 57
    return p1

    .line 58
    :cond_4
    :goto_1
    return v1
.end method

.method public final Z0(I)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 8
    .line 9
    const-string v1, "invalid orientation:"

    .line 10
    .line 11
    invoke-static {v1, p1}, LQ0/E;->e(Ljava/lang/String;I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw v0

    .line 19
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->c(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 24
    .line 25
    if-ne p1, v0, :cond_2

    .line 26
    .line 27
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 28
    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    :cond_2
    invoke-static {p0, p1}, Landroidx/emoji2/text/g;->a(Lj0/K;I)Landroidx/emoji2/text/g;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 36
    .line 37
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->A:Lj0/s;

    .line 38
    .line 39
    iput-object v0, v1, Lj0/s;->a:Landroidx/emoji2/text/g;

    .line 40
    .line 41
    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 42
    .line 43
    invoke-virtual {p0}, Lj0/K;->l0()V

    .line 44
    .line 45
    .line 46
    :cond_3
    return-void
.end method

.method public final a(I)Landroid/graphics/PointF;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lj0/K;->v()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0}, Lj0/K;->u(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1}, Lj0/K;->H(Landroid/view/View;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x1

    .line 19
    if-ge p1, v1, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    :cond_1
    iget-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 23
    .line 24
    if-eq v0, p1, :cond_2

    .line 25
    .line 26
    const/4 v2, -0x1

    .line 27
    :cond_2
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    if-nez p1, :cond_3

    .line 31
    .line 32
    new-instance p1, Landroid/graphics/PointF;

    .line 33
    .line 34
    int-to-float v1, v2

    .line 35
    invoke-direct {p1, v1, v0}, Landroid/graphics/PointF;-><init>(FF)V

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_3
    new-instance p1, Landroid/graphics/PointF;

    .line 40
    .line 41
    int-to-float v1, v2

    .line 42
    invoke-direct {p1, v0, v1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 43
    .line 44
    .line 45
    return-object p1
.end method

.method public a1(Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->c(Ljava/lang/String;)V

    .line 3
    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->v:Z

    .line 6
    .line 7
    if-ne v0, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iput-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->v:Z

    .line 11
    .line 12
    invoke-virtual {p0}, Lj0/K;->l0()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public b0(Lj0/Q;Lj0/X;)V
    .locals 17

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v8, p2

    .line 6
    .line 7
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lj0/u;

    .line 8
    .line 9
    const/4 v9, -0x1

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 13
    .line 14
    if-eq v0, v9, :cond_1

    .line 15
    .line 16
    :cond_0
    invoke-virtual/range {p2 .. p2}, Lj0/X;->b()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-virtual/range {p0 .. p1}, Lj0/K;->g0(Lj0/Q;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lj0/u;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    iget v0, v0, Lj0/u;->a:I

    .line 31
    .line 32
    if-ltz v0, :cond_2

    .line 33
    .line 34
    iput v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 35
    .line 36
    :cond_2
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->G0()V

    .line 37
    .line 38
    .line 39
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 40
    .line 41
    const/4 v10, 0x0

    .line 42
    iput-boolean v10, v0, Lj0/t;->a:Z

    .line 43
    .line 44
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->X0()V

    .line 45
    .line 46
    .line 47
    iget-object v0, v6, Lj0/K;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 48
    .line 49
    if-nez v0, :cond_4

    .line 50
    .line 51
    :cond_3
    :goto_0
    const/4 v0, 0x0

    .line 52
    goto :goto_1

    .line 53
    :cond_4
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    iget-object v1, v6, Lj0/K;->a:Landroid/support/v4/media/session/t;

    .line 60
    .line 61
    iget-object v1, v1, Landroid/support/v4/media/session/t;->d:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_5

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_5
    :goto_1
    iget-object v12, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->A:Lj0/s;

    .line 73
    .line 74
    iget-boolean v1, v12, Lj0/s;->e:Z

    .line 75
    .line 76
    const/4 v13, 0x1

    .line 77
    const/high16 v14, -0x80000000

    .line 78
    .line 79
    if-eqz v1, :cond_8

    .line 80
    .line 81
    iget v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 82
    .line 83
    if-ne v1, v9, :cond_8

    .line 84
    .line 85
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lj0/u;

    .line 86
    .line 87
    if-eqz v1, :cond_6

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_6
    if-eqz v0, :cond_27

    .line 91
    .line 92
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 93
    .line 94
    invoke-virtual {v1, v0}, Landroidx/emoji2/text/g;->e(Landroid/view/View;)I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    iget-object v2, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 99
    .line 100
    invoke-virtual {v2}, Landroidx/emoji2/text/g;->g()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-ge v1, v2, :cond_7

    .line 105
    .line 106
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 107
    .line 108
    invoke-virtual {v1, v0}, Landroidx/emoji2/text/g;->b(Landroid/view/View;)I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    iget-object v2, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 113
    .line 114
    invoke-virtual {v2}, Landroidx/emoji2/text/g;->k()I

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-gt v1, v2, :cond_27

    .line 119
    .line 120
    :cond_7
    invoke-static {v0}, Lj0/K;->H(Landroid/view/View;)I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    invoke-virtual {v12, v0, v1}, Lj0/s;->c(Landroid/view/View;I)V

    .line 125
    .line 126
    .line 127
    goto/16 :goto_f

    .line 128
    .line 129
    :cond_8
    :goto_2
    invoke-virtual {v12}, Lj0/s;->d()V

    .line 130
    .line 131
    .line 132
    iget-boolean v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 133
    .line 134
    iget-boolean v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->v:Z

    .line 135
    .line 136
    xor-int/2addr v0, v1

    .line 137
    iput-boolean v0, v12, Lj0/s;->d:Z

    .line 138
    .line 139
    iget-boolean v0, v8, Lj0/X;->g:Z

    .line 140
    .line 141
    if-nez v0, :cond_18

    .line 142
    .line 143
    iget v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 144
    .line 145
    if-ne v0, v9, :cond_9

    .line 146
    .line 147
    goto/16 :goto_7

    .line 148
    .line 149
    :cond_9
    if-ltz v0, :cond_17

    .line 150
    .line 151
    invoke-virtual/range {p2 .. p2}, Lj0/X;->b()I

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-lt v0, v1, :cond_a

    .line 156
    .line 157
    goto/16 :goto_6

    .line 158
    .line 159
    :cond_a
    iget v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 160
    .line 161
    iput v0, v12, Lj0/s;->b:I

    .line 162
    .line 163
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lj0/u;

    .line 164
    .line 165
    if-eqz v1, :cond_c

    .line 166
    .line 167
    iget v2, v1, Lj0/u;->a:I

    .line 168
    .line 169
    if-ltz v2, :cond_c

    .line 170
    .line 171
    iget-boolean v0, v1, Lj0/u;->c:Z

    .line 172
    .line 173
    iput-boolean v0, v12, Lj0/s;->d:Z

    .line 174
    .line 175
    if-eqz v0, :cond_b

    .line 176
    .line 177
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 178
    .line 179
    invoke-virtual {v0}, Landroidx/emoji2/text/g;->g()I

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lj0/u;

    .line 184
    .line 185
    iget v1, v1, Lj0/u;->b:I

    .line 186
    .line 187
    sub-int/2addr v0, v1

    .line 188
    iput v0, v12, Lj0/s;->c:I

    .line 189
    .line 190
    goto/16 :goto_e

    .line 191
    .line 192
    :cond_b
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 193
    .line 194
    invoke-virtual {v0}, Landroidx/emoji2/text/g;->k()I

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lj0/u;

    .line 199
    .line 200
    iget v1, v1, Lj0/u;->b:I

    .line 201
    .line 202
    add-int/2addr v0, v1

    .line 203
    iput v0, v12, Lj0/s;->c:I

    .line 204
    .line 205
    goto/16 :goto_e

    .line 206
    .line 207
    :cond_c
    iget v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    .line 208
    .line 209
    if-ne v1, v14, :cond_15

    .line 210
    .line 211
    invoke-virtual {v6, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->q(I)Landroid/view/View;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    if-eqz v0, :cond_11

    .line 216
    .line 217
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 218
    .line 219
    invoke-virtual {v1, v0}, Landroidx/emoji2/text/g;->c(Landroid/view/View;)I

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    iget-object v2, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 224
    .line 225
    invoke-virtual {v2}, Landroidx/emoji2/text/g;->l()I

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    if-le v1, v2, :cond_d

    .line 230
    .line 231
    invoke-virtual {v12}, Lj0/s;->a()V

    .line 232
    .line 233
    .line 234
    goto/16 :goto_e

    .line 235
    .line 236
    :cond_d
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 237
    .line 238
    invoke-virtual {v1, v0}, Landroidx/emoji2/text/g;->e(Landroid/view/View;)I

    .line 239
    .line 240
    .line 241
    move-result v1

    .line 242
    iget-object v2, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 243
    .line 244
    invoke-virtual {v2}, Landroidx/emoji2/text/g;->k()I

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    sub-int/2addr v1, v2

    .line 249
    if-gez v1, :cond_e

    .line 250
    .line 251
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 252
    .line 253
    invoke-virtual {v0}, Landroidx/emoji2/text/g;->k()I

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    iput v0, v12, Lj0/s;->c:I

    .line 258
    .line 259
    iput-boolean v10, v12, Lj0/s;->d:Z

    .line 260
    .line 261
    goto/16 :goto_e

    .line 262
    .line 263
    :cond_e
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 264
    .line 265
    invoke-virtual {v1}, Landroidx/emoji2/text/g;->g()I

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    iget-object v2, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 270
    .line 271
    invoke-virtual {v2, v0}, Landroidx/emoji2/text/g;->b(Landroid/view/View;)I

    .line 272
    .line 273
    .line 274
    move-result v2

    .line 275
    sub-int/2addr v1, v2

    .line 276
    if-gez v1, :cond_f

    .line 277
    .line 278
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 279
    .line 280
    invoke-virtual {v0}, Landroidx/emoji2/text/g;->g()I

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    iput v0, v12, Lj0/s;->c:I

    .line 285
    .line 286
    iput-boolean v13, v12, Lj0/s;->d:Z

    .line 287
    .line 288
    goto/16 :goto_e

    .line 289
    .line 290
    :cond_f
    iget-boolean v1, v12, Lj0/s;->d:Z

    .line 291
    .line 292
    if-eqz v1, :cond_10

    .line 293
    .line 294
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 295
    .line 296
    invoke-virtual {v1, v0}, Landroidx/emoji2/text/g;->b(Landroid/view/View;)I

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 301
    .line 302
    invoke-virtual {v1}, Landroidx/emoji2/text/g;->m()I

    .line 303
    .line 304
    .line 305
    move-result v1

    .line 306
    add-int/2addr v1, v0

    .line 307
    goto :goto_3

    .line 308
    :cond_10
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 309
    .line 310
    invoke-virtual {v1, v0}, Landroidx/emoji2/text/g;->e(Landroid/view/View;)I

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    :goto_3
    iput v1, v12, Lj0/s;->c:I

    .line 315
    .line 316
    goto/16 :goto_e

    .line 317
    .line 318
    :cond_11
    invoke-virtual/range {p0 .. p0}, Lj0/K;->v()I

    .line 319
    .line 320
    .line 321
    move-result v0

    .line 322
    if-lez v0, :cond_14

    .line 323
    .line 324
    invoke-virtual {v6, v10}, Lj0/K;->u(I)Landroid/view/View;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    invoke-static {v0}, Lj0/K;->H(Landroid/view/View;)I

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    iget v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 333
    .line 334
    if-ge v1, v0, :cond_12

    .line 335
    .line 336
    const/4 v0, 0x1

    .line 337
    goto :goto_4

    .line 338
    :cond_12
    const/4 v0, 0x0

    .line 339
    :goto_4
    iget-boolean v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 340
    .line 341
    if-ne v0, v1, :cond_13

    .line 342
    .line 343
    const/4 v0, 0x1

    .line 344
    goto :goto_5

    .line 345
    :cond_13
    const/4 v0, 0x0

    .line 346
    :goto_5
    iput-boolean v0, v12, Lj0/s;->d:Z

    .line 347
    .line 348
    :cond_14
    invoke-virtual {v12}, Lj0/s;->a()V

    .line 349
    .line 350
    .line 351
    goto/16 :goto_e

    .line 352
    .line 353
    :cond_15
    iget-boolean v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 354
    .line 355
    iput-boolean v0, v12, Lj0/s;->d:Z

    .line 356
    .line 357
    if-eqz v0, :cond_16

    .line 358
    .line 359
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 360
    .line 361
    invoke-virtual {v0}, Landroidx/emoji2/text/g;->g()I

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    iget v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    .line 366
    .line 367
    sub-int/2addr v0, v1

    .line 368
    iput v0, v12, Lj0/s;->c:I

    .line 369
    .line 370
    goto/16 :goto_e

    .line 371
    .line 372
    :cond_16
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 373
    .line 374
    invoke-virtual {v0}, Landroidx/emoji2/text/g;->k()I

    .line 375
    .line 376
    .line 377
    move-result v0

    .line 378
    iget v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    .line 379
    .line 380
    add-int/2addr v0, v1

    .line 381
    iput v0, v12, Lj0/s;->c:I

    .line 382
    .line 383
    goto/16 :goto_e

    .line 384
    .line 385
    :cond_17
    :goto_6
    iput v9, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 386
    .line 387
    iput v14, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    .line 388
    .line 389
    :cond_18
    :goto_7
    invoke-virtual/range {p0 .. p0}, Lj0/K;->v()I

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    if-nez v0, :cond_19

    .line 394
    .line 395
    goto/16 :goto_c

    .line 396
    .line 397
    :cond_19
    iget-object v0, v6, Lj0/K;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 398
    .line 399
    if-nez v0, :cond_1b

    .line 400
    .line 401
    :cond_1a
    :goto_8
    const/4 v0, 0x0

    .line 402
    goto :goto_9

    .line 403
    :cond_1b
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    if-eqz v0, :cond_1a

    .line 408
    .line 409
    iget-object v1, v6, Lj0/K;->a:Landroid/support/v4/media/session/t;

    .line 410
    .line 411
    iget-object v1, v1, Landroid/support/v4/media/session/t;->d:Ljava/lang/Object;

    .line 412
    .line 413
    check-cast v1, Ljava/util/ArrayList;

    .line 414
    .line 415
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result v1

    .line 419
    if-eqz v1, :cond_1c

    .line 420
    .line 421
    goto :goto_8

    .line 422
    :cond_1c
    :goto_9
    if-eqz v0, :cond_1d

    .line 423
    .line 424
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    check-cast v1, Lj0/L;

    .line 429
    .line 430
    iget-object v2, v1, Lj0/L;->a:Lj0/a0;

    .line 431
    .line 432
    invoke-virtual {v2}, Lj0/a0;->i()Z

    .line 433
    .line 434
    .line 435
    move-result v2

    .line 436
    if-nez v2, :cond_1d

    .line 437
    .line 438
    iget-object v2, v1, Lj0/L;->a:Lj0/a0;

    .line 439
    .line 440
    invoke-virtual {v2}, Lj0/a0;->b()I

    .line 441
    .line 442
    .line 443
    move-result v2

    .line 444
    if-ltz v2, :cond_1d

    .line 445
    .line 446
    iget-object v1, v1, Lj0/L;->a:Lj0/a0;

    .line 447
    .line 448
    invoke-virtual {v1}, Lj0/a0;->b()I

    .line 449
    .line 450
    .line 451
    move-result v1

    .line 452
    invoke-virtual/range {p2 .. p2}, Lj0/X;->b()I

    .line 453
    .line 454
    .line 455
    move-result v2

    .line 456
    if-ge v1, v2, :cond_1d

    .line 457
    .line 458
    invoke-static {v0}, Lj0/K;->H(Landroid/view/View;)I

    .line 459
    .line 460
    .line 461
    move-result v1

    .line 462
    invoke-virtual {v12, v0, v1}, Lj0/s;->c(Landroid/view/View;I)V

    .line 463
    .line 464
    .line 465
    goto/16 :goto_e

    .line 466
    .line 467
    :cond_1d
    iget-boolean v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->s:Z

    .line 468
    .line 469
    iget-boolean v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->v:Z

    .line 470
    .line 471
    if-eq v0, v1, :cond_1e

    .line 472
    .line 473
    goto/16 :goto_c

    .line 474
    .line 475
    :cond_1e
    iget-boolean v0, v12, Lj0/s;->d:Z

    .line 476
    .line 477
    if-eqz v0, :cond_20

    .line 478
    .line 479
    iget-boolean v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 480
    .line 481
    if-eqz v0, :cond_1f

    .line 482
    .line 483
    invoke-virtual/range {p0 .. p0}, Lj0/K;->v()I

    .line 484
    .line 485
    .line 486
    move-result v4

    .line 487
    invoke-virtual/range {p2 .. p2}, Lj0/X;->b()I

    .line 488
    .line 489
    .line 490
    move-result v5

    .line 491
    const/4 v3, 0x0

    .line 492
    move-object/from16 v0, p0

    .line 493
    .line 494
    move-object/from16 v1, p1

    .line 495
    .line 496
    move-object/from16 v2, p2

    .line 497
    .line 498
    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->N0(Lj0/Q;Lj0/X;III)Landroid/view/View;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    goto :goto_a

    .line 503
    :cond_1f
    invoke-virtual/range {p0 .. p0}, Lj0/K;->v()I

    .line 504
    .line 505
    .line 506
    move-result v0

    .line 507
    add-int/lit8 v3, v0, -0x1

    .line 508
    .line 509
    invoke-virtual/range {p2 .. p2}, Lj0/X;->b()I

    .line 510
    .line 511
    .line 512
    move-result v5

    .line 513
    const/4 v4, -0x1

    .line 514
    move-object/from16 v0, p0

    .line 515
    .line 516
    move-object/from16 v1, p1

    .line 517
    .line 518
    move-object/from16 v2, p2

    .line 519
    .line 520
    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->N0(Lj0/Q;Lj0/X;III)Landroid/view/View;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    goto :goto_a

    .line 525
    :cond_20
    iget-boolean v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 526
    .line 527
    if-eqz v0, :cond_21

    .line 528
    .line 529
    invoke-virtual/range {p0 .. p0}, Lj0/K;->v()I

    .line 530
    .line 531
    .line 532
    move-result v0

    .line 533
    add-int/lit8 v3, v0, -0x1

    .line 534
    .line 535
    invoke-virtual/range {p2 .. p2}, Lj0/X;->b()I

    .line 536
    .line 537
    .line 538
    move-result v5

    .line 539
    const/4 v4, -0x1

    .line 540
    move-object/from16 v0, p0

    .line 541
    .line 542
    move-object/from16 v1, p1

    .line 543
    .line 544
    move-object/from16 v2, p2

    .line 545
    .line 546
    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->N0(Lj0/Q;Lj0/X;III)Landroid/view/View;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    goto :goto_a

    .line 551
    :cond_21
    invoke-virtual/range {p0 .. p0}, Lj0/K;->v()I

    .line 552
    .line 553
    .line 554
    move-result v4

    .line 555
    invoke-virtual/range {p2 .. p2}, Lj0/X;->b()I

    .line 556
    .line 557
    .line 558
    move-result v5

    .line 559
    const/4 v3, 0x0

    .line 560
    move-object/from16 v0, p0

    .line 561
    .line 562
    move-object/from16 v1, p1

    .line 563
    .line 564
    move-object/from16 v2, p2

    .line 565
    .line 566
    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->N0(Lj0/Q;Lj0/X;III)Landroid/view/View;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    :goto_a
    if-eqz v0, :cond_24

    .line 571
    .line 572
    invoke-static {v0}, Lj0/K;->H(Landroid/view/View;)I

    .line 573
    .line 574
    .line 575
    move-result v1

    .line 576
    invoke-virtual {v12, v0, v1}, Lj0/s;->b(Landroid/view/View;I)V

    .line 577
    .line 578
    .line 579
    iget-boolean v1, v8, Lj0/X;->g:Z

    .line 580
    .line 581
    if-nez v1, :cond_26

    .line 582
    .line 583
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->z0()Z

    .line 584
    .line 585
    .line 586
    move-result v1

    .line 587
    if-eqz v1, :cond_26

    .line 588
    .line 589
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 590
    .line 591
    invoke-virtual {v1, v0}, Landroidx/emoji2/text/g;->e(Landroid/view/View;)I

    .line 592
    .line 593
    .line 594
    move-result v1

    .line 595
    iget-object v2, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 596
    .line 597
    invoke-virtual {v2}, Landroidx/emoji2/text/g;->g()I

    .line 598
    .line 599
    .line 600
    move-result v2

    .line 601
    if-ge v1, v2, :cond_22

    .line 602
    .line 603
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 604
    .line 605
    invoke-virtual {v1, v0}, Landroidx/emoji2/text/g;->b(Landroid/view/View;)I

    .line 606
    .line 607
    .line 608
    move-result v0

    .line 609
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 610
    .line 611
    invoke-virtual {v1}, Landroidx/emoji2/text/g;->k()I

    .line 612
    .line 613
    .line 614
    move-result v1

    .line 615
    if-ge v0, v1, :cond_26

    .line 616
    .line 617
    :cond_22
    iget-boolean v0, v12, Lj0/s;->d:Z

    .line 618
    .line 619
    if-eqz v0, :cond_23

    .line 620
    .line 621
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 622
    .line 623
    invoke-virtual {v0}, Landroidx/emoji2/text/g;->g()I

    .line 624
    .line 625
    .line 626
    move-result v0

    .line 627
    goto :goto_b

    .line 628
    :cond_23
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 629
    .line 630
    invoke-virtual {v0}, Landroidx/emoji2/text/g;->k()I

    .line 631
    .line 632
    .line 633
    move-result v0

    .line 634
    :goto_b
    iput v0, v12, Lj0/s;->c:I

    .line 635
    .line 636
    goto :goto_e

    .line 637
    :cond_24
    :goto_c
    invoke-virtual {v12}, Lj0/s;->a()V

    .line 638
    .line 639
    .line 640
    iget-boolean v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->v:Z

    .line 641
    .line 642
    if-eqz v0, :cond_25

    .line 643
    .line 644
    invoke-virtual/range {p2 .. p2}, Lj0/X;->b()I

    .line 645
    .line 646
    .line 647
    move-result v0

    .line 648
    sub-int/2addr v0, v13

    .line 649
    goto :goto_d

    .line 650
    :cond_25
    const/4 v0, 0x0

    .line 651
    :goto_d
    iput v0, v12, Lj0/s;->b:I

    .line 652
    .line 653
    :cond_26
    :goto_e
    iput-boolean v13, v12, Lj0/s;->e:Z

    .line 654
    .line 655
    :cond_27
    :goto_f
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 656
    .line 657
    iget v1, v0, Lj0/t;->j:I

    .line 658
    .line 659
    if-ltz v1, :cond_28

    .line 660
    .line 661
    const/4 v1, 0x1

    .line 662
    goto :goto_10

    .line 663
    :cond_28
    const/4 v1, -0x1

    .line 664
    :goto_10
    iput v1, v0, Lj0/t;->f:I

    .line 665
    .line 666
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->D:[I

    .line 667
    .line 668
    aput v10, v0, v10

    .line 669
    .line 670
    aput v10, v0, v13

    .line 671
    .line 672
    invoke-virtual {v6, v8, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->A0(Lj0/X;[I)V

    .line 673
    .line 674
    .line 675
    aget v1, v0, v10

    .line 676
    .line 677
    invoke-static {v10, v1}, Ljava/lang/Math;->max(II)I

    .line 678
    .line 679
    .line 680
    move-result v1

    .line 681
    iget-object v2, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 682
    .line 683
    invoke-virtual {v2}, Landroidx/emoji2/text/g;->k()I

    .line 684
    .line 685
    .line 686
    move-result v2

    .line 687
    add-int/2addr v2, v1

    .line 688
    aget v0, v0, v13

    .line 689
    .line 690
    invoke-static {v10, v0}, Ljava/lang/Math;->max(II)I

    .line 691
    .line 692
    .line 693
    move-result v0

    .line 694
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 695
    .line 696
    invoke-virtual {v1}, Landroidx/emoji2/text/g;->h()I

    .line 697
    .line 698
    .line 699
    move-result v1

    .line 700
    add-int/2addr v1, v0

    .line 701
    iget-boolean v0, v8, Lj0/X;->g:Z

    .line 702
    .line 703
    if-eqz v0, :cond_2b

    .line 704
    .line 705
    iget v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 706
    .line 707
    if-eq v0, v9, :cond_2b

    .line 708
    .line 709
    iget v3, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    .line 710
    .line 711
    if-eq v3, v14, :cond_2b

    .line 712
    .line 713
    invoke-virtual {v6, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->q(I)Landroid/view/View;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    if-eqz v0, :cond_2b

    .line 718
    .line 719
    iget-boolean v3, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 720
    .line 721
    if-eqz v3, :cond_29

    .line 722
    .line 723
    iget-object v3, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 724
    .line 725
    invoke-virtual {v3}, Landroidx/emoji2/text/g;->g()I

    .line 726
    .line 727
    .line 728
    move-result v3

    .line 729
    iget-object v4, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 730
    .line 731
    invoke-virtual {v4, v0}, Landroidx/emoji2/text/g;->b(Landroid/view/View;)I

    .line 732
    .line 733
    .line 734
    move-result v0

    .line 735
    sub-int/2addr v3, v0

    .line 736
    iget v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    .line 737
    .line 738
    :goto_11
    sub-int/2addr v3, v0

    .line 739
    goto :goto_12

    .line 740
    :cond_29
    iget-object v3, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 741
    .line 742
    invoke-virtual {v3, v0}, Landroidx/emoji2/text/g;->e(Landroid/view/View;)I

    .line 743
    .line 744
    .line 745
    move-result v0

    .line 746
    iget-object v3, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 747
    .line 748
    invoke-virtual {v3}, Landroidx/emoji2/text/g;->k()I

    .line 749
    .line 750
    .line 751
    move-result v3

    .line 752
    sub-int/2addr v0, v3

    .line 753
    iget v3, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    .line 754
    .line 755
    goto :goto_11

    .line 756
    :goto_12
    if-lez v3, :cond_2a

    .line 757
    .line 758
    add-int/2addr v2, v3

    .line 759
    goto :goto_13

    .line 760
    :cond_2a
    sub-int/2addr v1, v3

    .line 761
    :cond_2b
    :goto_13
    iget-boolean v0, v12, Lj0/s;->d:Z

    .line 762
    .line 763
    if-eqz v0, :cond_2d

    .line 764
    .line 765
    iget-boolean v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 766
    .line 767
    if-eqz v0, :cond_2e

    .line 768
    .line 769
    :cond_2c
    const/4 v9, 0x1

    .line 770
    goto :goto_14

    .line 771
    :cond_2d
    iget-boolean v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 772
    .line 773
    if-eqz v0, :cond_2c

    .line 774
    .line 775
    :cond_2e
    :goto_14
    invoke-virtual {v6, v7, v8, v12, v9}, Landroidx/recyclerview/widget/LinearLayoutManager;->U0(Lj0/Q;Lj0/X;Lj0/s;I)V

    .line 776
    .line 777
    .line 778
    invoke-virtual/range {p0 .. p1}, Lj0/K;->p(Lj0/Q;)V

    .line 779
    .line 780
    .line 781
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 782
    .line 783
    iget-object v3, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 784
    .line 785
    invoke-virtual {v3}, Landroidx/emoji2/text/g;->i()I

    .line 786
    .line 787
    .line 788
    move-result v3

    .line 789
    if-nez v3, :cond_2f

    .line 790
    .line 791
    iget-object v3, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 792
    .line 793
    invoke-virtual {v3}, Landroidx/emoji2/text/g;->f()I

    .line 794
    .line 795
    .line 796
    move-result v3

    .line 797
    if-nez v3, :cond_2f

    .line 798
    .line 799
    const/4 v3, 0x1

    .line 800
    goto :goto_15

    .line 801
    :cond_2f
    const/4 v3, 0x0

    .line 802
    :goto_15
    iput-boolean v3, v0, Lj0/t;->l:Z

    .line 803
    .line 804
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 805
    .line 806
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 807
    .line 808
    .line 809
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 810
    .line 811
    iput v10, v0, Lj0/t;->i:I

    .line 812
    .line 813
    iget-boolean v0, v12, Lj0/s;->d:Z

    .line 814
    .line 815
    if-eqz v0, :cond_31

    .line 816
    .line 817
    iget v0, v12, Lj0/s;->b:I

    .line 818
    .line 819
    iget v3, v12, Lj0/s;->c:I

    .line 820
    .line 821
    invoke-virtual {v6, v0, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->d1(II)V

    .line 822
    .line 823
    .line 824
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 825
    .line 826
    iput v2, v0, Lj0/t;->h:I

    .line 827
    .line 828
    invoke-virtual {v6, v7, v0, v8, v10}, Landroidx/recyclerview/widget/LinearLayoutManager;->H0(Lj0/Q;Lj0/t;Lj0/X;Z)I

    .line 829
    .line 830
    .line 831
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 832
    .line 833
    iget v2, v0, Lj0/t;->b:I

    .line 834
    .line 835
    iget v3, v0, Lj0/t;->d:I

    .line 836
    .line 837
    iget v0, v0, Lj0/t;->c:I

    .line 838
    .line 839
    if-lez v0, :cond_30

    .line 840
    .line 841
    add-int/2addr v1, v0

    .line 842
    :cond_30
    iget v0, v12, Lj0/s;->b:I

    .line 843
    .line 844
    iget v4, v12, Lj0/s;->c:I

    .line 845
    .line 846
    invoke-virtual {v6, v0, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;->c1(II)V

    .line 847
    .line 848
    .line 849
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 850
    .line 851
    iput v1, v0, Lj0/t;->h:I

    .line 852
    .line 853
    iget v1, v0, Lj0/t;->d:I

    .line 854
    .line 855
    iget v4, v0, Lj0/t;->e:I

    .line 856
    .line 857
    add-int/2addr v1, v4

    .line 858
    iput v1, v0, Lj0/t;->d:I

    .line 859
    .line 860
    invoke-virtual {v6, v7, v0, v8, v10}, Landroidx/recyclerview/widget/LinearLayoutManager;->H0(Lj0/Q;Lj0/t;Lj0/X;Z)I

    .line 861
    .line 862
    .line 863
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 864
    .line 865
    iget v1, v0, Lj0/t;->b:I

    .line 866
    .line 867
    iget v0, v0, Lj0/t;->c:I

    .line 868
    .line 869
    if-lez v0, :cond_33

    .line 870
    .line 871
    invoke-virtual {v6, v3, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->d1(II)V

    .line 872
    .line 873
    .line 874
    iget-object v2, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 875
    .line 876
    iput v0, v2, Lj0/t;->h:I

    .line 877
    .line 878
    invoke-virtual {v6, v7, v2, v8, v10}, Landroidx/recyclerview/widget/LinearLayoutManager;->H0(Lj0/Q;Lj0/t;Lj0/X;Z)I

    .line 879
    .line 880
    .line 881
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 882
    .line 883
    iget v2, v0, Lj0/t;->b:I

    .line 884
    .line 885
    goto :goto_16

    .line 886
    :cond_31
    iget v0, v12, Lj0/s;->b:I

    .line 887
    .line 888
    iget v3, v12, Lj0/s;->c:I

    .line 889
    .line 890
    invoke-virtual {v6, v0, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->c1(II)V

    .line 891
    .line 892
    .line 893
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 894
    .line 895
    iput v1, v0, Lj0/t;->h:I

    .line 896
    .line 897
    invoke-virtual {v6, v7, v0, v8, v10}, Landroidx/recyclerview/widget/LinearLayoutManager;->H0(Lj0/Q;Lj0/t;Lj0/X;Z)I

    .line 898
    .line 899
    .line 900
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 901
    .line 902
    iget v1, v0, Lj0/t;->b:I

    .line 903
    .line 904
    iget v3, v0, Lj0/t;->d:I

    .line 905
    .line 906
    iget v0, v0, Lj0/t;->c:I

    .line 907
    .line 908
    if-lez v0, :cond_32

    .line 909
    .line 910
    add-int/2addr v2, v0

    .line 911
    :cond_32
    iget v0, v12, Lj0/s;->b:I

    .line 912
    .line 913
    iget v4, v12, Lj0/s;->c:I

    .line 914
    .line 915
    invoke-virtual {v6, v0, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;->d1(II)V

    .line 916
    .line 917
    .line 918
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 919
    .line 920
    iput v2, v0, Lj0/t;->h:I

    .line 921
    .line 922
    iget v2, v0, Lj0/t;->d:I

    .line 923
    .line 924
    iget v4, v0, Lj0/t;->e:I

    .line 925
    .line 926
    add-int/2addr v2, v4

    .line 927
    iput v2, v0, Lj0/t;->d:I

    .line 928
    .line 929
    invoke-virtual {v6, v7, v0, v8, v10}, Landroidx/recyclerview/widget/LinearLayoutManager;->H0(Lj0/Q;Lj0/t;Lj0/X;Z)I

    .line 930
    .line 931
    .line 932
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 933
    .line 934
    iget v2, v0, Lj0/t;->b:I

    .line 935
    .line 936
    iget v0, v0, Lj0/t;->c:I

    .line 937
    .line 938
    if-lez v0, :cond_33

    .line 939
    .line 940
    invoke-virtual {v6, v3, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->c1(II)V

    .line 941
    .line 942
    .line 943
    iget-object v1, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 944
    .line 945
    iput v0, v1, Lj0/t;->h:I

    .line 946
    .line 947
    invoke-virtual {v6, v7, v1, v8, v10}, Landroidx/recyclerview/widget/LinearLayoutManager;->H0(Lj0/Q;Lj0/t;Lj0/X;Z)I

    .line 948
    .line 949
    .line 950
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 951
    .line 952
    iget v1, v0, Lj0/t;->b:I

    .line 953
    .line 954
    :cond_33
    :goto_16
    invoke-virtual/range {p0 .. p0}, Lj0/K;->v()I

    .line 955
    .line 956
    .line 957
    move-result v0

    .line 958
    if-lez v0, :cond_35

    .line 959
    .line 960
    iget-boolean v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 961
    .line 962
    iget-boolean v3, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->v:Z

    .line 963
    .line 964
    xor-int/2addr v0, v3

    .line 965
    if-eqz v0, :cond_34

    .line 966
    .line 967
    invoke-virtual {v6, v1, v7, v8, v13}, Landroidx/recyclerview/widget/LinearLayoutManager;->O0(ILj0/Q;Lj0/X;Z)I

    .line 968
    .line 969
    .line 970
    move-result v0

    .line 971
    add-int/2addr v2, v0

    .line 972
    add-int/2addr v1, v0

    .line 973
    invoke-virtual {v6, v2, v7, v8, v10}, Landroidx/recyclerview/widget/LinearLayoutManager;->P0(ILj0/Q;Lj0/X;Z)I

    .line 974
    .line 975
    .line 976
    move-result v0

    .line 977
    :goto_17
    add-int/2addr v2, v0

    .line 978
    add-int/2addr v1, v0

    .line 979
    goto :goto_18

    .line 980
    :cond_34
    invoke-virtual {v6, v2, v7, v8, v13}, Landroidx/recyclerview/widget/LinearLayoutManager;->P0(ILj0/Q;Lj0/X;Z)I

    .line 981
    .line 982
    .line 983
    move-result v0

    .line 984
    add-int/2addr v2, v0

    .line 985
    add-int/2addr v1, v0

    .line 986
    invoke-virtual {v6, v1, v7, v8, v10}, Landroidx/recyclerview/widget/LinearLayoutManager;->O0(ILj0/Q;Lj0/X;Z)I

    .line 987
    .line 988
    .line 989
    move-result v0

    .line 990
    goto :goto_17

    .line 991
    :cond_35
    :goto_18
    iget-boolean v0, v8, Lj0/X;->k:Z

    .line 992
    .line 993
    if-eqz v0, :cond_3d

    .line 994
    .line 995
    invoke-virtual/range {p0 .. p0}, Lj0/K;->v()I

    .line 996
    .line 997
    .line 998
    move-result v0

    .line 999
    if-eqz v0, :cond_3d

    .line 1000
    .line 1001
    iget-boolean v0, v8, Lj0/X;->g:Z

    .line 1002
    .line 1003
    if-nez v0, :cond_3d

    .line 1004
    .line 1005
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->z0()Z

    .line 1006
    .line 1007
    .line 1008
    move-result v0

    .line 1009
    if-nez v0, :cond_36

    .line 1010
    .line 1011
    goto/16 :goto_1d

    .line 1012
    .line 1013
    :cond_36
    iget-object v0, v7, Lj0/Q;->d:Ljava/util/List;

    .line 1014
    .line 1015
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1016
    .line 1017
    .line 1018
    move-result v3

    .line 1019
    invoke-virtual {v6, v10}, Lj0/K;->u(I)Landroid/view/View;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v4

    .line 1023
    invoke-static {v4}, Lj0/K;->H(Landroid/view/View;)I

    .line 1024
    .line 1025
    .line 1026
    move-result v4

    .line 1027
    const/4 v5, 0x0

    .line 1028
    const/4 v9, 0x0

    .line 1029
    const/4 v14, 0x0

    .line 1030
    :goto_19
    if-ge v5, v3, :cond_3a

    .line 1031
    .line 1032
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v15

    .line 1036
    check-cast v15, Lj0/a0;

    .line 1037
    .line 1038
    invoke-virtual {v15}, Lj0/a0;->i()Z

    .line 1039
    .line 1040
    .line 1041
    move-result v16

    .line 1042
    if-eqz v16, :cond_37

    .line 1043
    .line 1044
    goto :goto_1b

    .line 1045
    :cond_37
    invoke-virtual {v15}, Lj0/a0;->b()I

    .line 1046
    .line 1047
    .line 1048
    move-result v13

    .line 1049
    if-ge v13, v4, :cond_38

    .line 1050
    .line 1051
    const/4 v13, 0x1

    .line 1052
    goto :goto_1a

    .line 1053
    :cond_38
    const/4 v13, 0x0

    .line 1054
    :goto_1a
    iget-boolean v11, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 1055
    .line 1056
    iget-object v15, v15, Lj0/a0;->a:Landroid/view/View;

    .line 1057
    .line 1058
    if-eq v13, v11, :cond_39

    .line 1059
    .line 1060
    iget-object v11, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 1061
    .line 1062
    invoke-virtual {v11, v15}, Landroidx/emoji2/text/g;->c(Landroid/view/View;)I

    .line 1063
    .line 1064
    .line 1065
    move-result v11

    .line 1066
    add-int/2addr v9, v11

    .line 1067
    goto :goto_1b

    .line 1068
    :cond_39
    iget-object v11, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 1069
    .line 1070
    invoke-virtual {v11, v15}, Landroidx/emoji2/text/g;->c(Landroid/view/View;)I

    .line 1071
    .line 1072
    .line 1073
    move-result v11

    .line 1074
    add-int/2addr v14, v11

    .line 1075
    :goto_1b
    add-int/lit8 v5, v5, 0x1

    .line 1076
    .line 1077
    const/4 v13, 0x1

    .line 1078
    goto :goto_19

    .line 1079
    :cond_3a
    iget-object v3, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 1080
    .line 1081
    iput-object v0, v3, Lj0/t;->k:Ljava/util/List;

    .line 1082
    .line 1083
    if-lez v9, :cond_3b

    .line 1084
    .line 1085
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->R0()Landroid/view/View;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v0

    .line 1089
    invoke-static {v0}, Lj0/K;->H(Landroid/view/View;)I

    .line 1090
    .line 1091
    .line 1092
    move-result v0

    .line 1093
    invoke-virtual {v6, v0, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->d1(II)V

    .line 1094
    .line 1095
    .line 1096
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 1097
    .line 1098
    iput v9, v0, Lj0/t;->h:I

    .line 1099
    .line 1100
    iput v10, v0, Lj0/t;->c:I

    .line 1101
    .line 1102
    const/4 v2, 0x0

    .line 1103
    invoke-virtual {v0, v2}, Lj0/t;->a(Landroid/view/View;)V

    .line 1104
    .line 1105
    .line 1106
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 1107
    .line 1108
    invoke-virtual {v6, v7, v0, v8, v10}, Landroidx/recyclerview/widget/LinearLayoutManager;->H0(Lj0/Q;Lj0/t;Lj0/X;Z)I

    .line 1109
    .line 1110
    .line 1111
    :cond_3b
    if-lez v14, :cond_3c

    .line 1112
    .line 1113
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->Q0()Landroid/view/View;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v0

    .line 1117
    invoke-static {v0}, Lj0/K;->H(Landroid/view/View;)I

    .line 1118
    .line 1119
    .line 1120
    move-result v0

    .line 1121
    invoke-virtual {v6, v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->c1(II)V

    .line 1122
    .line 1123
    .line 1124
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 1125
    .line 1126
    iput v14, v0, Lj0/t;->h:I

    .line 1127
    .line 1128
    iput v10, v0, Lj0/t;->c:I

    .line 1129
    .line 1130
    const/4 v1, 0x0

    .line 1131
    invoke-virtual {v0, v1}, Lj0/t;->a(Landroid/view/View;)V

    .line 1132
    .line 1133
    .line 1134
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 1135
    .line 1136
    invoke-virtual {v6, v7, v0, v8, v10}, Landroidx/recyclerview/widget/LinearLayoutManager;->H0(Lj0/Q;Lj0/t;Lj0/X;Z)I

    .line 1137
    .line 1138
    .line 1139
    goto :goto_1c

    .line 1140
    :cond_3c
    const/4 v1, 0x0

    .line 1141
    :goto_1c
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 1142
    .line 1143
    iput-object v1, v0, Lj0/t;->k:Ljava/util/List;

    .line 1144
    .line 1145
    :cond_3d
    :goto_1d
    iget-boolean v0, v8, Lj0/X;->g:Z

    .line 1146
    .line 1147
    if-nez v0, :cond_3e

    .line 1148
    .line 1149
    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 1150
    .line 1151
    invoke-virtual {v0}, Landroidx/emoji2/text/g;->l()I

    .line 1152
    .line 1153
    .line 1154
    move-result v1

    .line 1155
    iput v1, v0, Landroidx/emoji2/text/g;->a:I

    .line 1156
    .line 1157
    goto :goto_1e

    .line 1158
    :cond_3e
    invoke-virtual {v12}, Lj0/s;->d()V

    .line 1159
    .line 1160
    .line 1161
    :goto_1e
    iget-boolean v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->v:Z

    .line 1162
    .line 1163
    iput-boolean v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->s:Z

    .line 1164
    .line 1165
    return-void
.end method

.method public final b1(IIZLj0/X;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/emoji2/text/g;->i()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroidx/emoji2/text/g;->f()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v1, 0x0

    .line 24
    :goto_0
    iput-boolean v1, v0, Lj0/t;->l:Z

    .line 25
    .line 26
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 27
    .line 28
    iput p1, v0, Lj0/t;->f:I

    .line 29
    .line 30
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->D:[I

    .line 31
    .line 32
    aput v2, v0, v2

    .line 33
    .line 34
    aput v2, v0, v3

    .line 35
    .line 36
    invoke-virtual {p0, p4, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->A0(Lj0/X;[I)V

    .line 37
    .line 38
    .line 39
    aget p4, v0, v2

    .line 40
    .line 41
    invoke-static {v2, p4}, Ljava/lang/Math;->max(II)I

    .line 42
    .line 43
    .line 44
    move-result p4

    .line 45
    aget v0, v0, v3

    .line 46
    .line 47
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-ne p1, v3, :cond_1

    .line 52
    .line 53
    const/4 v2, 0x1

    .line 54
    :cond_1
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 55
    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    move v1, v0

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move v1, p4

    .line 61
    :goto_1
    iput v1, p1, Lj0/t;->h:I

    .line 62
    .line 63
    if-eqz v2, :cond_3

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    move p4, v0

    .line 67
    :goto_2
    iput p4, p1, Lj0/t;->i:I

    .line 68
    .line 69
    const/4 p4, -0x1

    .line 70
    if-eqz v2, :cond_5

    .line 71
    .line 72
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 73
    .line 74
    invoke-virtual {v0}, Landroidx/emoji2/text/g;->h()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    add-int/2addr v0, v1

    .line 79
    iput v0, p1, Lj0/t;->h:I

    .line 80
    .line 81
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->Q0()Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 86
    .line 87
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 88
    .line 89
    if-eqz v1, :cond_4

    .line 90
    .line 91
    const/4 v3, -0x1

    .line 92
    :cond_4
    iput v3, v0, Lj0/t;->e:I

    .line 93
    .line 94
    invoke-static {p1}, Lj0/K;->H(Landroid/view/View;)I

    .line 95
    .line 96
    .line 97
    move-result p4

    .line 98
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 99
    .line 100
    iget v2, v1, Lj0/t;->e:I

    .line 101
    .line 102
    add-int/2addr p4, v2

    .line 103
    iput p4, v0, Lj0/t;->d:I

    .line 104
    .line 105
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 106
    .line 107
    invoke-virtual {p4, p1}, Landroidx/emoji2/text/g;->b(Landroid/view/View;)I

    .line 108
    .line 109
    .line 110
    move-result p4

    .line 111
    iput p4, v1, Lj0/t;->b:I

    .line 112
    .line 113
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 114
    .line 115
    invoke-virtual {p4, p1}, Landroidx/emoji2/text/g;->b(Landroid/view/View;)I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 120
    .line 121
    invoke-virtual {p4}, Landroidx/emoji2/text/g;->g()I

    .line 122
    .line 123
    .line 124
    move-result p4

    .line 125
    sub-int/2addr p1, p4

    .line 126
    goto :goto_4

    .line 127
    :cond_5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->R0()Landroid/view/View;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 132
    .line 133
    iget v1, v0, Lj0/t;->h:I

    .line 134
    .line 135
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 136
    .line 137
    invoke-virtual {v2}, Landroidx/emoji2/text/g;->k()I

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    add-int/2addr v2, v1

    .line 142
    iput v2, v0, Lj0/t;->h:I

    .line 143
    .line 144
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 145
    .line 146
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 147
    .line 148
    if-eqz v1, :cond_6

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_6
    const/4 v3, -0x1

    .line 152
    :goto_3
    iput v3, v0, Lj0/t;->e:I

    .line 153
    .line 154
    invoke-static {p1}, Lj0/K;->H(Landroid/view/View;)I

    .line 155
    .line 156
    .line 157
    move-result p4

    .line 158
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 159
    .line 160
    iget v2, v1, Lj0/t;->e:I

    .line 161
    .line 162
    add-int/2addr p4, v2

    .line 163
    iput p4, v0, Lj0/t;->d:I

    .line 164
    .line 165
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 166
    .line 167
    invoke-virtual {p4, p1}, Landroidx/emoji2/text/g;->e(Landroid/view/View;)I

    .line 168
    .line 169
    .line 170
    move-result p4

    .line 171
    iput p4, v1, Lj0/t;->b:I

    .line 172
    .line 173
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 174
    .line 175
    invoke-virtual {p4, p1}, Landroidx/emoji2/text/g;->e(Landroid/view/View;)I

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    neg-int p1, p1

    .line 180
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 181
    .line 182
    invoke-virtual {p4}, Landroidx/emoji2/text/g;->k()I

    .line 183
    .line 184
    .line 185
    move-result p4

    .line 186
    add-int/2addr p1, p4

    .line 187
    :goto_4
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 188
    .line 189
    iput p2, p4, Lj0/t;->c:I

    .line 190
    .line 191
    if-eqz p3, :cond_7

    .line 192
    .line 193
    sub-int/2addr p2, p1

    .line 194
    iput p2, p4, Lj0/t;->c:I

    .line 195
    .line 196
    :cond_7
    iput p1, p4, Lj0/t;->g:I

    .line 197
    .line 198
    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lj0/u;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Lj0/K;->c(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public c0(Lj0/X;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lj0/u;

    .line 3
    .line 4
    const/4 p1, -0x1

    .line 5
    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 6
    .line 7
    const/high16 p1, -0x80000000

    .line 8
    .line 9
    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    .line 10
    .line 11
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->A:Lj0/s;

    .line 12
    .line 13
    invoke-virtual {p1}, Lj0/s;->d()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final c1(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/emoji2/text/g;->g()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr v1, p2

    .line 10
    iput v1, v0, Lj0/t;->c:I

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 13
    .line 14
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v1, 0x1

    .line 22
    :goto_0
    iput v1, v0, Lj0/t;->e:I

    .line 23
    .line 24
    iput p1, v0, Lj0/t;->d:I

    .line 25
    .line 26
    iput v2, v0, Lj0/t;->f:I

    .line 27
    .line 28
    iput p2, v0, Lj0/t;->b:I

    .line 29
    .line 30
    const/high16 p1, -0x80000000

    .line 31
    .line 32
    iput p1, v0, Lj0/t;->g:I

    .line 33
    .line 34
    return-void
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    return v0
.end method

.method public final d0(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lj0/u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lj0/u;

    .line 6
    .line 7
    iput-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lj0/u;

    .line 8
    .line 9
    invoke-virtual {p0}, Lj0/K;->l0()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final d1(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/emoji2/text/g;->k()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int v1, p2, v1

    .line 10
    .line 11
    iput v1, v0, Lj0/t;->c:I

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 14
    .line 15
    iput p1, v0, Lj0/t;->d:I

    .line 16
    .line 17
    iget-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p1, -0x1

    .line 25
    :goto_0
    iput p1, v0, Lj0/t;->e:I

    .line 26
    .line 27
    iput v1, v0, Lj0/t;->f:I

    .line 28
    .line 29
    iput p2, v0, Lj0/t;->b:I

    .line 30
    .line 31
    const/high16 p1, -0x80000000

    .line 32
    .line 33
    iput p1, v0, Lj0/t;->g:I

    .line 34
    .line 35
    return-void
.end method

.method public final e()Z
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v1, 0x0

    .line 8
    :goto_0
    return v1
.end method

.method public final e0()Landroid/os/Parcelable;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lj0/u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lj0/u;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iget v2, v0, Lj0/u;->a:I

    .line 11
    .line 12
    iput v2, v1, Lj0/u;->a:I

    .line 13
    .line 14
    iget v2, v0, Lj0/u;->b:I

    .line 15
    .line 16
    iput v2, v1, Lj0/u;->b:I

    .line 17
    .line 18
    iget-boolean v0, v0, Lj0/u;->c:Z

    .line 19
    .line 20
    iput-boolean v0, v1, Lj0/u;->c:Z

    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_0
    new-instance v0, Lj0/u;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lj0/K;->v()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-lez v1, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->G0()V

    .line 35
    .line 36
    .line 37
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:Z

    .line 38
    .line 39
    iget-boolean v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 40
    .line 41
    xor-int/2addr v1, v2

    .line 42
    iput-boolean v1, v0, Lj0/u;->c:Z

    .line 43
    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->Q0()Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 51
    .line 52
    invoke-virtual {v2}, Landroidx/emoji2/text/g;->g()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 57
    .line 58
    invoke-virtual {v3, v1}, Landroidx/emoji2/text/g;->b(Landroid/view/View;)I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    sub-int/2addr v2, v3

    .line 63
    iput v2, v0, Lj0/u;->b:I

    .line 64
    .line 65
    invoke-static {v1}, Lj0/K;->H(Landroid/view/View;)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    iput v1, v0, Lj0/u;->a:I

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->R0()Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-static {v1}, Lj0/K;->H(Landroid/view/View;)I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    iput v2, v0, Lj0/u;->a:I

    .line 81
    .line 82
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 83
    .line 84
    invoke-virtual {v2, v1}, Landroidx/emoji2/text/g;->e(Landroid/view/View;)I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 89
    .line 90
    invoke-virtual {v2}, Landroidx/emoji2/text/g;->k()I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    sub-int/2addr v1, v2

    .line 95
    iput v1, v0, Lj0/u;->b:I

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    const/4 v1, -0x1

    .line 99
    iput v1, v0, Lj0/u;->a:I

    .line 100
    .line 101
    :goto_0
    return-object v0
.end method

.method public final h(IILj0/X;Lj0/n;)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    move p1, p2

    .line 7
    :goto_0
    invoke-virtual {p0}, Lj0/K;->v()I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-eqz p2, :cond_3

    .line 12
    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->G0()V

    .line 17
    .line 18
    .line 19
    const/4 p2, 0x1

    .line 20
    if-lez p1, :cond_2

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    goto :goto_1

    .line 24
    :cond_2
    const/4 v0, -0x1

    .line 25
    :goto_1
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->b1(IIZLj0/X;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lj0/t;

    .line 33
    .line 34
    invoke-virtual {p0, p3, p1, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->B0(Lj0/X;Lj0/t;Lj0/n;)V

    .line 35
    .line 36
    .line 37
    :cond_3
    :goto_2
    return-void
.end method

.method public final i(ILj0/n;)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lj0/u;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v3, v0, Lj0/u;->a:I

    .line 8
    .line 9
    if-ltz v3, :cond_0

    .line 10
    .line 11
    iget-boolean v0, v0, Lj0/u;->c:Z

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->X0()V

    .line 15
    .line 16
    .line 17
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 18
    .line 19
    iget v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 20
    .line 21
    if-ne v3, v1, :cond_2

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    add-int/lit8 v3, p1, -0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 v3, 0x0

    .line 29
    :cond_2
    :goto_0
    if-eqz v0, :cond_3

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_3
    const/4 v1, 0x1

    .line 33
    :goto_1
    const/4 v0, 0x0

    .line 34
    :goto_2
    iget v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->C:I

    .line 35
    .line 36
    if-ge v0, v4, :cond_4

    .line 37
    .line 38
    if-ltz v3, :cond_4

    .line 39
    .line 40
    if-ge v3, p1, :cond_4

    .line 41
    .line 42
    invoke-virtual {p2, v3, v2}, Lj0/n;->a(II)V

    .line 43
    .line 44
    .line 45
    add-int/2addr v3, v1

    .line 46
    add-int/lit8 v0, v0, 0x1

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_4
    return-void
.end method

.method public final j(Lj0/X;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->C0(Lj0/X;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public k(Lj0/X;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->D0(Lj0/X;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public l(Lj0/X;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->E0(Lj0/X;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final m(Lj0/X;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->C0(Lj0/X;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public m0(ILj0/Q;Lj0/X;)I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return p1

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->Y0(ILj0/Q;Lj0/X;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public n(Lj0/X;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->D0(Lj0/X;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final n0(I)V
    .locals 1

    .line 1
    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 2
    .line 3
    const/high16 p1, -0x80000000

    .line 4
    .line 5
    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    .line 6
    .line 7
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lj0/u;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    iput v0, p1, Lj0/u;->a:I

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lj0/K;->l0()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public o(Lj0/X;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->E0(Lj0/X;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public o0(ILj0/Q;Lj0/X;)I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->Y0(ILj0/Q;Lj0/X;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final q(I)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lj0/K;->v()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p0, v1}, Lj0/K;->u(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1}, Lj0/K;->H(Landroid/view/View;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    sub-int v1, p1, v1

    .line 19
    .line 20
    if-ltz v1, :cond_1

    .line 21
    .line 22
    if-ge v1, v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Lj0/K;->u(I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lj0/K;->H(Landroid/view/View;)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-ne v1, p1, :cond_1

    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_1
    invoke-super {p0, p1}, Lj0/K;->q(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1
.end method

.method public r()Lj0/L;
    .locals 2

    .line 1
    new-instance v0, Lj0/L;

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    invoke-direct {v0, v1, v1}, Lj0/L;-><init>(II)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final v0()Z
    .locals 5

    .line 1
    iget v0, p0, Lj0/K;->m:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/high16 v2, 0x40000000    # 2.0f

    .line 5
    .line 6
    if-eq v0, v2, :cond_1

    .line 7
    .line 8
    iget v0, p0, Lj0/K;->l:I

    .line 9
    .line 10
    if-eq v0, v2, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Lj0/K;->v()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_0
    if-ge v2, v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Lj0/K;->u(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget v4, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 28
    .line 29
    if-gez v4, :cond_0

    .line 30
    .line 31
    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 32
    .line 33
    if-gez v3, :cond_0

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    :goto_1
    return v1
.end method

.method public x0(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 1

    .line 1
    new-instance v0, Lj0/v;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p1}, Lj0/v;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iput p2, v0, Lj0/v;->a:I

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lj0/K;->y0(Lj0/v;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public z0()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lj0/u;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:Z

    .line 6
    .line 7
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->v:Z

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    return v0
.end method
