.class public final Lj0/Q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/List;

.field public e:I

.field public f:I

.field public g:Lj0/P;

.field public final synthetic h:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj0/Q;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lj0/Q;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lj0/Q;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lj0/Q;->c:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lj0/Q;->d:Ljava/util/List;

    .line 28
    .line 29
    const/4 p1, 0x2

    .line 30
    iput p1, p0, Lj0/Q;->e:I

    .line 31
    .line 32
    iput p1, p0, Lj0/Q;->f:I

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a(Lj0/a0;Z)V
    .locals 5

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->j(Lj0/a0;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj0/Q;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    .line 6
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->q0:Lj0/c0;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v1}, Lj0/c0;->j()LN/b;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    instance-of v3, v1, Lj0/b0;

    .line 16
    .line 17
    iget-object v4, p1, Lj0/a0;->a:Landroid/view/View;

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    check-cast v1, Lj0/b0;

    .line 22
    .line 23
    iget-object v1, v1, Lj0/b0;->e:Ljava/util/WeakHashMap;

    .line 24
    .line 25
    invoke-virtual {v1, v4}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, LN/b;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-object v1, v2

    .line 33
    :goto_0
    invoke-static {v4, v1}, LN/Q;->p(Landroid/view/View;LN/b;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    if-eqz p2, :cond_2

    .line 37
    .line 38
    iget-object p2, v0, Landroidx/recyclerview/widget/RecyclerView;->j0:Lj0/X;

    .line 39
    .line 40
    if-eqz p2, :cond_2

    .line 41
    .line 42
    iget-object p2, v0, Landroidx/recyclerview/widget/RecyclerView;->k:LE/j;

    .line 43
    .line 44
    invoke-virtual {p2, p1}, LE/j;->K(Lj0/a0;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    iput-object v2, p1, Lj0/a0;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 48
    .line 49
    invoke-virtual {p0}, Lj0/Q;->c()Lj0/P;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget v0, p1, Lj0/a0;->f:I

    .line 57
    .line 58
    invoke-virtual {p2, v0}, Lj0/P;->a(I)Lj0/O;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    iget-object v1, v1, Lj0/O;->a:Ljava/util/ArrayList;

    .line 63
    .line 64
    iget-object p2, p2, Lj0/P;->a:Landroid/util/SparseArray;

    .line 65
    .line 66
    invoke-virtual {p2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    check-cast p2, Lj0/O;

    .line 71
    .line 72
    iget p2, p2, Lj0/O;->b:I

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-gt p2, v0, :cond_3

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    invoke-virtual {p1}, Lj0/a0;->n()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    :goto_1
    return-void
.end method

.method public final b(I)I
    .locals 4

    .line 1
    iget-object v0, p0, Lj0/Q;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    if-ltz p1, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->j0:Lj0/X;

    .line 6
    .line 7
    invoke-virtual {v1}, Lj0/X;->b()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ge p1, v1, :cond_1

    .line 12
    .line 13
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->j0:Lj0/X;

    .line 14
    .line 15
    iget-boolean v1, v1, Lj0/X;->g:Z

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    return p1

    .line 20
    :cond_0
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->i:Lj0/b;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {v0, p1, v1}, Lj0/b;->g(II)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1

    .line 28
    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    .line 29
    .line 30
    new-instance v2, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v3, "invalid position "

    .line 33
    .line 34
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p1, ". State item count is "

    .line 41
    .line 42
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object p1, v0, Landroidx/recyclerview/widget/RecyclerView;->j0:Lj0/X;

    .line 46
    .line 47
    invoke-virtual {p1}, Lj0/X;->b()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v1
.end method

.method public final c()Lj0/P;
    .locals 2

    .line 1
    iget-object v0, p0, Lj0/Q;->g:Lj0/P;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lj0/P;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/util/SparseArray;

    .line 11
    .line 12
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v1, v0, Lj0/P;->a:Landroid/util/SparseArray;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput v1, v0, Lj0/P;->b:I

    .line 19
    .line 20
    iput-object v0, p0, Lj0/Q;->g:Lj0/P;

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lj0/Q;->g:Lj0/P;

    .line 23
    .line 24
    return-object v0
.end method

.method public final d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lj0/Q;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    :goto_0
    if-ltz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lj0/Q;->e(I)V

    .line 12
    .line 13
    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 18
    .line 19
    .line 20
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->C0:Z

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, Lj0/Q;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 25
    .line 26
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->i0:Lj0/n;

    .line 27
    .line 28
    iget-object v1, v0, Lj0/n;->c:[I

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    const/4 v2, -0x1

    .line 33
    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([II)V

    .line 34
    .line 35
    .line 36
    :cond_1
    const/4 v1, 0x0

    .line 37
    iput v1, v0, Lj0/n;->d:I

    .line 38
    .line 39
    :cond_2
    return-void
.end method

.method public final e(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lj0/Q;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lj0/a0;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-virtual {p0, v1, v2}, Lj0/Q;->a(Lj0/a0;Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final f(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lj0/a0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lj0/a0;->k()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lj0/Q;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v2, p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0}, Lj0/a0;->j()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    iget-object p1, v0, Lj0/a0;->n:Lj0/Q;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lj0/Q;->j(Lj0/a0;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {v0}, Lj0/a0;->q()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    iget p1, v0, Lj0/a0;->j:I

    .line 36
    .line 37
    and-int/lit8 p1, p1, -0x21

    .line 38
    .line 39
    iput p1, v0, Lj0/a0;->j:I

    .line 40
    .line 41
    :cond_2
    :goto_0
    invoke-virtual {p0, v0}, Lj0/Q;->g(Lj0/a0;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, v2, Landroidx/recyclerview/widget/RecyclerView;->O:Lj0/G;

    .line 45
    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    invoke-virtual {v0}, Lj0/a0;->h()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-nez p1, :cond_3

    .line 53
    .line 54
    iget-object p1, v2, Landroidx/recyclerview/widget/RecyclerView;->O:Lj0/G;

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Lj0/G;->d(Lj0/a0;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    return-void
.end method

.method public final g(Lj0/a0;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Lj0/a0;->j()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    iget-object v3, p0, Lj0/Q;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    iget-object v4, p1, Lj0/a0;->a:Landroid/view/View;

    .line 10
    .line 11
    if-nez v0, :cond_e

    .line 12
    .line 13
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto/16 :goto_7

    .line 20
    .line 21
    :cond_0
    invoke-virtual {p1}, Lj0/a0;->k()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_d

    .line 26
    .line 27
    invoke-virtual {p1}, Lj0/a0;->p()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_c

    .line 32
    .line 33
    iget v0, p1, Lj0/a0;->j:I

    .line 34
    .line 35
    and-int/lit8 v0, v0, 0x10

    .line 36
    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    sget-object v0, LN/Q;->a:Ljava/util/WeakHashMap;

    .line 40
    .line 41
    invoke-virtual {v4}, Landroid/view/View;->hasTransientState()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    const/4 v0, 0x1

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    const/4 v0, 0x0

    .line 50
    :goto_0
    iget-object v4, v3, Landroidx/recyclerview/widget/RecyclerView;->q:Lj0/C;

    .line 51
    .line 52
    invoke-virtual {p1}, Lj0/a0;->h()Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_a

    .line 57
    .line 58
    iget v4, p0, Lj0/Q;->f:I

    .line 59
    .line 60
    if-lez v4, :cond_8

    .line 61
    .line 62
    const/16 v4, 0x20e

    .line 63
    .line 64
    invoke-virtual {p1, v4}, Lj0/a0;->d(I)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-nez v4, :cond_8

    .line 69
    .line 70
    iget-object v4, p0, Lj0/Q;->c:Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    iget v6, p0, Lj0/Q;->f:I

    .line 77
    .line 78
    if-lt v5, v6, :cond_2

    .line 79
    .line 80
    if-lez v5, :cond_2

    .line 81
    .line 82
    invoke-virtual {p0, v1}, Lj0/Q;->e(I)V

    .line 83
    .line 84
    .line 85
    add-int/lit8 v5, v5, -0x1

    .line 86
    .line 87
    :cond_2
    sget-boolean v6, Landroidx/recyclerview/widget/RecyclerView;->C0:Z

    .line 88
    .line 89
    if-eqz v6, :cond_7

    .line 90
    .line 91
    if-lez v5, :cond_7

    .line 92
    .line 93
    iget-object v6, v3, Landroidx/recyclerview/widget/RecyclerView;->i0:Lj0/n;

    .line 94
    .line 95
    iget v7, p1, Lj0/a0;->c:I

    .line 96
    .line 97
    iget-object v8, v6, Lj0/n;->c:[I

    .line 98
    .line 99
    if-eqz v8, :cond_4

    .line 100
    .line 101
    iget v8, v6, Lj0/n;->d:I

    .line 102
    .line 103
    mul-int/lit8 v8, v8, 0x2

    .line 104
    .line 105
    const/4 v9, 0x0

    .line 106
    :goto_1
    if-ge v9, v8, :cond_4

    .line 107
    .line 108
    iget-object v10, v6, Lj0/n;->c:[I

    .line 109
    .line 110
    aget v10, v10, v9

    .line 111
    .line 112
    if-ne v10, v7, :cond_3

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_3
    add-int/lit8 v9, v9, 0x2

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_4
    sub-int/2addr v5, v2

    .line 119
    :goto_2
    if-ltz v5, :cond_6

    .line 120
    .line 121
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    check-cast v6, Lj0/a0;

    .line 126
    .line 127
    iget v6, v6, Lj0/a0;->c:I

    .line 128
    .line 129
    iget-object v7, v3, Landroidx/recyclerview/widget/RecyclerView;->i0:Lj0/n;

    .line 130
    .line 131
    iget-object v8, v7, Lj0/n;->c:[I

    .line 132
    .line 133
    if-eqz v8, :cond_6

    .line 134
    .line 135
    iget v8, v7, Lj0/n;->d:I

    .line 136
    .line 137
    mul-int/lit8 v8, v8, 0x2

    .line 138
    .line 139
    const/4 v9, 0x0

    .line 140
    :goto_3
    if-ge v9, v8, :cond_6

    .line 141
    .line 142
    iget-object v10, v7, Lj0/n;->c:[I

    .line 143
    .line 144
    aget v10, v10, v9

    .line 145
    .line 146
    if-ne v10, v6, :cond_5

    .line 147
    .line 148
    add-int/lit8 v5, v5, -0x1

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_5
    add-int/lit8 v9, v9, 0x2

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_6
    add-int/2addr v5, v2

    .line 155
    :cond_7
    :goto_4
    invoke-virtual {v4, v5, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    const/4 v4, 0x1

    .line 159
    goto :goto_5

    .line 160
    :cond_8
    const/4 v4, 0x0

    .line 161
    :goto_5
    if-nez v4, :cond_9

    .line 162
    .line 163
    invoke-virtual {p0, p1, v2}, Lj0/Q;->a(Lj0/a0;Z)V

    .line 164
    .line 165
    .line 166
    move v1, v4

    .line 167
    goto :goto_6

    .line 168
    :cond_9
    move v1, v4

    .line 169
    :cond_a
    const/4 v2, 0x0

    .line 170
    :goto_6
    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView;->k:LE/j;

    .line 171
    .line 172
    invoke-virtual {v3, p1}, LE/j;->K(Lj0/a0;)V

    .line 173
    .line 174
    .line 175
    if-nez v1, :cond_b

    .line 176
    .line 177
    if-nez v2, :cond_b

    .line 178
    .line 179
    if-eqz v0, :cond_b

    .line 180
    .line 181
    const/4 v0, 0x0

    .line 182
    iput-object v0, p1, Lj0/a0;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 183
    .line 184
    :cond_b
    return-void

    .line 185
    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 186
    .line 187
    new-instance v0, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    const-string v1, "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."

    .line 190
    .line 191
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw p1

    .line 209
    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 210
    .line 211
    new-instance v1, Ljava/lang/StringBuilder;

    .line 212
    .line 213
    const-string v2, "Tmp detached view should be removed from RecyclerView before it can be recycled: "

    .line 214
    .line 215
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw v0

    .line 236
    :cond_e
    :goto_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 237
    .line 238
    new-instance v5, Ljava/lang/StringBuilder;

    .line 239
    .line 240
    const-string v6, "Scrapped or attached views may not be recycled. isScrap:"

    .line 241
    .line 242
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1}, Lj0/a0;->j()Z

    .line 246
    .line 247
    .line 248
    move-result p1

    .line 249
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    const-string p1, " isAttached:"

    .line 253
    .line 254
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    if-eqz p1, :cond_f

    .line 262
    .line 263
    const/4 v1, 0x1

    .line 264
    :cond_f
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    throw v0
.end method

.method public final h(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lj0/a0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/16 v0, 0xc

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lj0/a0;->d(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Lj0/Q;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 12
    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p1}, Lj0/a0;->l()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->O:Lj0/G;

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {p1}, Lj0/a0;->c()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v0, Lj0/j;

    .line 30
    .line 31
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    iget-boolean v0, v0, Lj0/j;->g:Z

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-virtual {p1}, Lj0/a0;->g()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget-object v0, p0, Lj0/Q;->b:Ljava/util/ArrayList;

    .line 49
    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    new-instance v0, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, Lj0/Q;->b:Ljava/util/ArrayList;

    .line 58
    .line 59
    :cond_1
    iput-object p0, p1, Lj0/a0;->n:Lj0/Q;

    .line 60
    .line 61
    const/4 v0, 0x1

    .line 62
    iput-boolean v0, p1, Lj0/a0;->o:Z

    .line 63
    .line 64
    iget-object v0, p0, Lj0/Q;->b:Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_2
    :goto_0
    invoke-virtual {p1}, Lj0/a0;->g()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    invoke-virtual {p1}, Lj0/a0;->i()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_4

    .line 81
    .line 82
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->q:Lj0/C;

    .line 83
    .line 84
    iget-boolean v0, v0, Lj0/C;->b:Z

    .line 85
    .line 86
    if-eqz v0, :cond_3

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 90
    .line 91
    new-instance v0, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    const-string v2, "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."

    .line 94
    .line 95
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw p1

    .line 113
    :cond_4
    :goto_1
    iput-object p0, p1, Lj0/a0;->n:Lj0/Q;

    .line 114
    .line 115
    const/4 v0, 0x0

    .line 116
    iput-boolean v0, p1, Lj0/a0;->o:Z

    .line 117
    .line 118
    iget-object v0, p0, Lj0/Q;->a:Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    :goto_2
    return-void
.end method

.method public final i(IJ)Lj0/a0;
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p1

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, v1, Lj0/Q;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    if-ltz v0, :cond_47

    .line 10
    .line 11
    iget-object v5, v4, Landroidx/recyclerview/widget/RecyclerView;->j0:Lj0/X;

    .line 12
    .line 13
    invoke-virtual {v5}, Lj0/X;->b()I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    if-ge v0, v5, :cond_47

    .line 18
    .line 19
    iget-object v5, v4, Landroidx/recyclerview/widget/RecyclerView;->j0:Lj0/X;

    .line 20
    .line 21
    iget-boolean v6, v5, Lj0/X;->g:Z

    .line 22
    .line 23
    const/4 v8, 0x0

    .line 24
    const/16 v9, 0x20

    .line 25
    .line 26
    if-eqz v6, :cond_6

    .line 27
    .line 28
    iget-object v6, v1, Lj0/Q;->b:Ljava/util/ArrayList;

    .line 29
    .line 30
    if-eqz v6, :cond_4

    .line 31
    .line 32
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-nez v6, :cond_0

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_0
    const/4 v10, 0x0

    .line 40
    :goto_0
    if-ge v10, v6, :cond_2

    .line 41
    .line 42
    iget-object v11, v1, Lj0/Q;->b:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v11

    .line 48
    check-cast v11, Lj0/a0;

    .line 49
    .line 50
    invoke-virtual {v11}, Lj0/a0;->q()Z

    .line 51
    .line 52
    .line 53
    move-result v12

    .line 54
    if-nez v12, :cond_1

    .line 55
    .line 56
    invoke-virtual {v11}, Lj0/a0;->b()I

    .line 57
    .line 58
    .line 59
    move-result v12

    .line 60
    if-ne v12, v0, :cond_1

    .line 61
    .line 62
    invoke-virtual {v11, v9}, Lj0/a0;->a(I)V

    .line 63
    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_1
    add-int/2addr v10, v3

    .line 67
    goto :goto_0

    .line 68
    :cond_2
    iget-object v10, v4, Landroidx/recyclerview/widget/RecyclerView;->q:Lj0/C;

    .line 69
    .line 70
    iget-boolean v10, v10, Lj0/C;->b:Z

    .line 71
    .line 72
    if-eqz v10, :cond_4

    .line 73
    .line 74
    iget-object v10, v4, Landroidx/recyclerview/widget/RecyclerView;->i:Lj0/b;

    .line 75
    .line 76
    invoke-virtual {v10, v0, v8}, Lj0/b;->g(II)I

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    if-lez v10, :cond_4

    .line 81
    .line 82
    iget-object v11, v4, Landroidx/recyclerview/widget/RecyclerView;->q:Lj0/C;

    .line 83
    .line 84
    invoke-virtual {v11}, Lj0/C;->a()I

    .line 85
    .line 86
    .line 87
    move-result v11

    .line 88
    if-ge v10, v11, :cond_4

    .line 89
    .line 90
    iget-object v11, v4, Landroidx/recyclerview/widget/RecyclerView;->q:Lj0/C;

    .line 91
    .line 92
    invoke-virtual {v11, v10}, Lj0/C;->b(I)J

    .line 93
    .line 94
    .line 95
    move-result-wide v10

    .line 96
    const/4 v12, 0x0

    .line 97
    :goto_1
    if-ge v12, v6, :cond_4

    .line 98
    .line 99
    iget-object v13, v1, Lj0/Q;->b:Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-virtual {v13, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v13

    .line 105
    check-cast v13, Lj0/a0;

    .line 106
    .line 107
    invoke-virtual {v13}, Lj0/a0;->q()Z

    .line 108
    .line 109
    .line 110
    move-result v14

    .line 111
    if-nez v14, :cond_3

    .line 112
    .line 113
    iget-wide v14, v13, Lj0/a0;->e:J

    .line 114
    .line 115
    cmp-long v16, v14, v10

    .line 116
    .line 117
    if-nez v16, :cond_3

    .line 118
    .line 119
    invoke-virtual {v13, v9}, Lj0/a0;->a(I)V

    .line 120
    .line 121
    .line 122
    move-object v11, v13

    .line 123
    goto :goto_3

    .line 124
    :cond_3
    add-int/2addr v12, v3

    .line 125
    goto :goto_1

    .line 126
    :cond_4
    :goto_2
    const/4 v11, 0x0

    .line 127
    :goto_3
    if-eqz v11, :cond_5

    .line 128
    .line 129
    const/4 v6, 0x1

    .line 130
    goto :goto_4

    .line 131
    :cond_5
    const/4 v6, 0x0

    .line 132
    goto :goto_4

    .line 133
    :cond_6
    const/4 v6, 0x0

    .line 134
    const/4 v11, 0x0

    .line 135
    :goto_4
    iget-object v10, v1, Lj0/Q;->c:Ljava/util/ArrayList;

    .line 136
    .line 137
    iget-object v12, v1, Lj0/Q;->a:Ljava/util/ArrayList;

    .line 138
    .line 139
    if-nez v11, :cond_1c

    .line 140
    .line 141
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 142
    .line 143
    .line 144
    move-result v11

    .line 145
    const/4 v13, 0x0

    .line 146
    :goto_5
    if-ge v13, v11, :cond_9

    .line 147
    .line 148
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v14

    .line 152
    check-cast v14, Lj0/a0;

    .line 153
    .line 154
    invoke-virtual {v14}, Lj0/a0;->q()Z

    .line 155
    .line 156
    .line 157
    move-result v15

    .line 158
    if-nez v15, :cond_8

    .line 159
    .line 160
    invoke-virtual {v14}, Lj0/a0;->b()I

    .line 161
    .line 162
    .line 163
    move-result v15

    .line 164
    if-ne v15, v0, :cond_8

    .line 165
    .line 166
    invoke-virtual {v14}, Lj0/a0;->g()Z

    .line 167
    .line 168
    .line 169
    move-result v15

    .line 170
    if-nez v15, :cond_8

    .line 171
    .line 172
    iget-boolean v15, v5, Lj0/X;->g:Z

    .line 173
    .line 174
    if-nez v15, :cond_7

    .line 175
    .line 176
    invoke-virtual {v14}, Lj0/a0;->i()Z

    .line 177
    .line 178
    .line 179
    move-result v15

    .line 180
    if-nez v15, :cond_8

    .line 181
    .line 182
    :cond_7
    invoke-virtual {v14, v9}, Lj0/a0;->a(I)V

    .line 183
    .line 184
    .line 185
    move-object v11, v14

    .line 186
    goto/16 :goto_b

    .line 187
    .line 188
    :cond_8
    add-int/2addr v13, v3

    .line 189
    goto :goto_5

    .line 190
    :cond_9
    iget-object v11, v4, Landroidx/recyclerview/widget/RecyclerView;->j:Landroid/support/v4/media/session/t;

    .line 191
    .line 192
    iget-object v11, v11, Landroid/support/v4/media/session/t;->d:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v11, Ljava/util/ArrayList;

    .line 195
    .line 196
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 197
    .line 198
    .line 199
    move-result v13

    .line 200
    const/4 v14, 0x0

    .line 201
    :goto_6
    if-ge v14, v13, :cond_b

    .line 202
    .line 203
    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v15

    .line 207
    check-cast v15, Landroid/view/View;

    .line 208
    .line 209
    invoke-static {v15}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lj0/a0;

    .line 210
    .line 211
    .line 212
    move-result-object v16

    .line 213
    invoke-virtual/range {v16 .. v16}, Lj0/a0;->b()I

    .line 214
    .line 215
    .line 216
    move-result v7

    .line 217
    if-ne v7, v0, :cond_a

    .line 218
    .line 219
    invoke-virtual/range {v16 .. v16}, Lj0/a0;->g()Z

    .line 220
    .line 221
    .line 222
    move-result v7

    .line 223
    if-nez v7, :cond_a

    .line 224
    .line 225
    invoke-virtual/range {v16 .. v16}, Lj0/a0;->i()Z

    .line 226
    .line 227
    .line 228
    move-result v7

    .line 229
    if-nez v7, :cond_a

    .line 230
    .line 231
    goto :goto_7

    .line 232
    :cond_a
    add-int/2addr v14, v3

    .line 233
    goto :goto_6

    .line 234
    :cond_b
    const/4 v15, 0x0

    .line 235
    :goto_7
    if-eqz v15, :cond_11

    .line 236
    .line 237
    invoke-static {v15}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lj0/a0;

    .line 238
    .line 239
    .line 240
    move-result-object v7

    .line 241
    iget-object v11, v4, Landroidx/recyclerview/widget/RecyclerView;->j:Landroid/support/v4/media/session/t;

    .line 242
    .line 243
    iget-object v13, v11, Landroid/support/v4/media/session/t;->b:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v13, Lj0/B;

    .line 246
    .line 247
    iget-object v13, v13, Lj0/B;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 248
    .line 249
    invoke-virtual {v13, v15}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 250
    .line 251
    .line 252
    move-result v13

    .line 253
    if-ltz v13, :cond_10

    .line 254
    .line 255
    iget-object v14, v11, Landroid/support/v4/media/session/t;->c:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v14, Lj0/c;

    .line 258
    .line 259
    invoke-virtual {v14, v13}, Lj0/c;->d(I)Z

    .line 260
    .line 261
    .line 262
    move-result v16

    .line 263
    if-eqz v16, :cond_f

    .line 264
    .line 265
    invoke-virtual {v14, v13}, Lj0/c;->a(I)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v11, v15}, Landroid/support/v4/media/session/t;->F(Landroid/view/View;)V

    .line 269
    .line 270
    .line 271
    iget-object v11, v4, Landroidx/recyclerview/widget/RecyclerView;->j:Landroid/support/v4/media/session/t;

    .line 272
    .line 273
    iget-object v13, v11, Landroid/support/v4/media/session/t;->b:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v13, Lj0/B;

    .line 276
    .line 277
    iget-object v13, v13, Lj0/B;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 278
    .line 279
    invoke-virtual {v13, v15}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 280
    .line 281
    .line 282
    move-result v13

    .line 283
    if-ne v13, v2, :cond_c

    .line 284
    .line 285
    :goto_8
    const/4 v13, -0x1

    .line 286
    goto :goto_9

    .line 287
    :cond_c
    iget-object v11, v11, Landroid/support/v4/media/session/t;->c:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v11, Lj0/c;

    .line 290
    .line 291
    invoke-virtual {v11, v13}, Lj0/c;->d(I)Z

    .line 292
    .line 293
    .line 294
    move-result v14

    .line 295
    if-eqz v14, :cond_d

    .line 296
    .line 297
    goto :goto_8

    .line 298
    :cond_d
    invoke-virtual {v11, v13}, Lj0/c;->b(I)I

    .line 299
    .line 300
    .line 301
    move-result v11

    .line 302
    sub-int/2addr v13, v11

    .line 303
    :goto_9
    if-eq v13, v2, :cond_e

    .line 304
    .line 305
    iget-object v11, v4, Landroidx/recyclerview/widget/RecyclerView;->j:Landroid/support/v4/media/session/t;

    .line 306
    .line 307
    invoke-virtual {v11, v13}, Landroid/support/v4/media/session/t;->i(I)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v1, v15}, Lj0/Q;->h(Landroid/view/View;)V

    .line 311
    .line 312
    .line 313
    const/16 v11, 0x2020

    .line 314
    .line 315
    invoke-virtual {v7, v11}, Lj0/a0;->a(I)V

    .line 316
    .line 317
    .line 318
    move-object v11, v7

    .line 319
    goto :goto_b

    .line 320
    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 321
    .line 322
    new-instance v2, Ljava/lang/StringBuilder;

    .line 323
    .line 324
    const-string v3, "layout index should not be -1 after unhiding a view:"

    .line 325
    .line 326
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    throw v0

    .line 347
    :cond_f
    new-instance v0, Ljava/lang/RuntimeException;

    .line 348
    .line 349
    new-instance v2, Ljava/lang/StringBuilder;

    .line 350
    .line 351
    const-string v3, "trying to unhide a view that was not hidden"

    .line 352
    .line 353
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    throw v0

    .line 367
    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 368
    .line 369
    new-instance v2, Ljava/lang/StringBuilder;

    .line 370
    .line 371
    const-string v3, "view is not a child, cannot hide "

    .line 372
    .line 373
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    throw v0

    .line 387
    :cond_11
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 388
    .line 389
    .line 390
    move-result v7

    .line 391
    const/4 v11, 0x0

    .line 392
    :goto_a
    if-ge v11, v7, :cond_13

    .line 393
    .line 394
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v13

    .line 398
    check-cast v13, Lj0/a0;

    .line 399
    .line 400
    invoke-virtual {v13}, Lj0/a0;->g()Z

    .line 401
    .line 402
    .line 403
    move-result v14

    .line 404
    if-nez v14, :cond_12

    .line 405
    .line 406
    invoke-virtual {v13}, Lj0/a0;->b()I

    .line 407
    .line 408
    .line 409
    move-result v14

    .line 410
    if-ne v14, v0, :cond_12

    .line 411
    .line 412
    invoke-virtual {v13}, Lj0/a0;->e()Z

    .line 413
    .line 414
    .line 415
    move-result v14

    .line 416
    if-nez v14, :cond_12

    .line 417
    .line 418
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-object v11, v13

    .line 422
    goto :goto_b

    .line 423
    :cond_12
    add-int/2addr v11, v3

    .line 424
    goto :goto_a

    .line 425
    :cond_13
    const/4 v11, 0x0

    .line 426
    :goto_b
    if-eqz v11, :cond_1c

    .line 427
    .line 428
    invoke-virtual {v11}, Lj0/a0;->i()Z

    .line 429
    .line 430
    .line 431
    move-result v7

    .line 432
    if-eqz v7, :cond_14

    .line 433
    .line 434
    iget-boolean v7, v5, Lj0/X;->g:Z

    .line 435
    .line 436
    goto :goto_c

    .line 437
    :cond_14
    iget v7, v11, Lj0/a0;->c:I

    .line 438
    .line 439
    if-ltz v7, :cond_1b

    .line 440
    .line 441
    iget-object v13, v4, Landroidx/recyclerview/widget/RecyclerView;->q:Lj0/C;

    .line 442
    .line 443
    invoke-virtual {v13}, Lj0/C;->a()I

    .line 444
    .line 445
    .line 446
    move-result v13

    .line 447
    if-ge v7, v13, :cond_1b

    .line 448
    .line 449
    iget-boolean v7, v5, Lj0/X;->g:Z

    .line 450
    .line 451
    if-nez v7, :cond_16

    .line 452
    .line 453
    iget-object v7, v4, Landroidx/recyclerview/widget/RecyclerView;->q:Lj0/C;

    .line 454
    .line 455
    iget v13, v11, Lj0/a0;->c:I

    .line 456
    .line 457
    invoke-virtual {v7, v13}, Lj0/C;->c(I)I

    .line 458
    .line 459
    .line 460
    move-result v7

    .line 461
    iget v13, v11, Lj0/a0;->f:I

    .line 462
    .line 463
    if-eq v7, v13, :cond_16

    .line 464
    .line 465
    :cond_15
    const/4 v7, 0x0

    .line 466
    goto :goto_c

    .line 467
    :cond_16
    iget-object v7, v4, Landroidx/recyclerview/widget/RecyclerView;->q:Lj0/C;

    .line 468
    .line 469
    iget-boolean v13, v7, Lj0/C;->b:Z

    .line 470
    .line 471
    if-eqz v13, :cond_17

    .line 472
    .line 473
    iget-wide v13, v11, Lj0/a0;->e:J

    .line 474
    .line 475
    iget v15, v11, Lj0/a0;->c:I

    .line 476
    .line 477
    invoke-virtual {v7, v15}, Lj0/C;->b(I)J

    .line 478
    .line 479
    .line 480
    move-result-wide v15

    .line 481
    cmp-long v7, v13, v15

    .line 482
    .line 483
    if-nez v7, :cond_15

    .line 484
    .line 485
    :cond_17
    const/4 v7, 0x1

    .line 486
    :goto_c
    if-nez v7, :cond_1a

    .line 487
    .line 488
    const/4 v7, 0x4

    .line 489
    invoke-virtual {v11, v7}, Lj0/a0;->a(I)V

    .line 490
    .line 491
    .line 492
    invoke-virtual {v11}, Lj0/a0;->j()Z

    .line 493
    .line 494
    .line 495
    move-result v7

    .line 496
    if-eqz v7, :cond_18

    .line 497
    .line 498
    iget-object v7, v11, Lj0/a0;->a:Landroid/view/View;

    .line 499
    .line 500
    invoke-virtual {v4, v7, v8}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 501
    .line 502
    .line 503
    iget-object v7, v11, Lj0/a0;->n:Lj0/Q;

    .line 504
    .line 505
    invoke-virtual {v7, v11}, Lj0/Q;->j(Lj0/a0;)V

    .line 506
    .line 507
    .line 508
    goto :goto_d

    .line 509
    :cond_18
    invoke-virtual {v11}, Lj0/a0;->q()Z

    .line 510
    .line 511
    .line 512
    move-result v7

    .line 513
    if-eqz v7, :cond_19

    .line 514
    .line 515
    iget v7, v11, Lj0/a0;->j:I

    .line 516
    .line 517
    and-int/lit8 v7, v7, -0x21

    .line 518
    .line 519
    iput v7, v11, Lj0/a0;->j:I

    .line 520
    .line 521
    :cond_19
    :goto_d
    invoke-virtual {v1, v11}, Lj0/Q;->g(Lj0/a0;)V

    .line 522
    .line 523
    .line 524
    const/4 v11, 0x0

    .line 525
    goto :goto_e

    .line 526
    :cond_1a
    const/4 v6, 0x1

    .line 527
    goto :goto_e

    .line 528
    :cond_1b
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 529
    .line 530
    new-instance v2, Ljava/lang/StringBuilder;

    .line 531
    .line 532
    const-string v3, "Inconsistency detected. Invalid view holder adapter position"

    .line 533
    .line 534
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v3

    .line 544
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 545
    .line 546
    .line 547
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v2

    .line 551
    invoke-direct {v0, v2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 552
    .line 553
    .line 554
    throw v0

    .line 555
    :cond_1c
    :goto_e
    const-wide/16 v18, 0x0

    .line 556
    .line 557
    const-wide v20, 0x7fffffffffffffffL

    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    if-nez v11, :cond_2f

    .line 563
    .line 564
    iget-object v7, v4, Landroidx/recyclerview/widget/RecyclerView;->i:Lj0/b;

    .line 565
    .line 566
    invoke-virtual {v7, v0, v8}, Lj0/b;->g(II)I

    .line 567
    .line 568
    .line 569
    move-result v7

    .line 570
    if-ltz v7, :cond_30

    .line 571
    .line 572
    iget-object v13, v4, Landroidx/recyclerview/widget/RecyclerView;->q:Lj0/C;

    .line 573
    .line 574
    invoke-virtual {v13}, Lj0/C;->a()I

    .line 575
    .line 576
    .line 577
    move-result v13

    .line 578
    if-ge v7, v13, :cond_30

    .line 579
    .line 580
    iget-object v13, v4, Landroidx/recyclerview/widget/RecyclerView;->q:Lj0/C;

    .line 581
    .line 582
    invoke-virtual {v13, v7}, Lj0/C;->c(I)I

    .line 583
    .line 584
    .line 585
    move-result v13

    .line 586
    iget-object v14, v4, Landroidx/recyclerview/widget/RecyclerView;->q:Lj0/C;

    .line 587
    .line 588
    iget-boolean v15, v14, Lj0/C;->b:Z

    .line 589
    .line 590
    if-eqz v15, :cond_24

    .line 591
    .line 592
    invoke-virtual {v14, v7}, Lj0/C;->b(I)J

    .line 593
    .line 594
    .line 595
    move-result-wide v14

    .line 596
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 597
    .line 598
    .line 599
    move-result v11

    .line 600
    sub-int/2addr v11, v3

    .line 601
    :goto_f
    if-ltz v11, :cond_20

    .line 602
    .line 603
    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v16

    .line 607
    move-object/from16 v3, v16

    .line 608
    .line 609
    check-cast v3, Lj0/a0;

    .line 610
    .line 611
    iget-wide v8, v3, Lj0/a0;->e:J

    .line 612
    .line 613
    cmp-long v24, v8, v14

    .line 614
    .line 615
    if-nez v24, :cond_1f

    .line 616
    .line 617
    invoke-virtual {v3}, Lj0/a0;->q()Z

    .line 618
    .line 619
    .line 620
    move-result v8

    .line 621
    if-nez v8, :cond_1f

    .line 622
    .line 623
    iget v8, v3, Lj0/a0;->f:I

    .line 624
    .line 625
    if-ne v13, v8, :cond_1e

    .line 626
    .line 627
    const/16 v8, 0x20

    .line 628
    .line 629
    invoke-virtual {v3, v8}, Lj0/a0;->a(I)V

    .line 630
    .line 631
    .line 632
    invoke-virtual {v3}, Lj0/a0;->i()Z

    .line 633
    .line 634
    .line 635
    move-result v8

    .line 636
    if-eqz v8, :cond_1d

    .line 637
    .line 638
    iget-boolean v8, v5, Lj0/X;->g:Z

    .line 639
    .line 640
    if-nez v8, :cond_1d

    .line 641
    .line 642
    iget v8, v3, Lj0/a0;->j:I

    .line 643
    .line 644
    and-int/lit8 v8, v8, -0xf

    .line 645
    .line 646
    or-int/lit8 v8, v8, 0x2

    .line 647
    .line 648
    iput v8, v3, Lj0/a0;->j:I

    .line 649
    .line 650
    :cond_1d
    move-object v11, v3

    .line 651
    goto :goto_11

    .line 652
    :cond_1e
    const/16 v8, 0x20

    .line 653
    .line 654
    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    iget-object v3, v3, Lj0/a0;->a:Landroid/view/View;

    .line 658
    .line 659
    const/4 v9, 0x0

    .line 660
    invoke-virtual {v4, v3, v9}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 661
    .line 662
    .line 663
    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lj0/a0;

    .line 664
    .line 665
    .line 666
    move-result-object v3

    .line 667
    const/4 v8, 0x0

    .line 668
    iput-object v8, v3, Lj0/a0;->n:Lj0/Q;

    .line 669
    .line 670
    iput-boolean v9, v3, Lj0/a0;->o:Z

    .line 671
    .line 672
    iget v8, v3, Lj0/a0;->j:I

    .line 673
    .line 674
    and-int/lit8 v8, v8, -0x21

    .line 675
    .line 676
    iput v8, v3, Lj0/a0;->j:I

    .line 677
    .line 678
    invoke-virtual {v1, v3}, Lj0/Q;->g(Lj0/a0;)V

    .line 679
    .line 680
    .line 681
    :cond_1f
    add-int/2addr v11, v2

    .line 682
    const/4 v3, 0x1

    .line 683
    const/4 v8, 0x0

    .line 684
    const/16 v9, 0x20

    .line 685
    .line 686
    goto :goto_f

    .line 687
    :cond_20
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 688
    .line 689
    .line 690
    move-result v3

    .line 691
    const/4 v8, 0x1

    .line 692
    sub-int/2addr v3, v8

    .line 693
    :goto_10
    if-ltz v3, :cond_22

    .line 694
    .line 695
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object v8

    .line 699
    check-cast v8, Lj0/a0;

    .line 700
    .line 701
    iget-wide v11, v8, Lj0/a0;->e:J

    .line 702
    .line 703
    cmp-long v9, v11, v14

    .line 704
    .line 705
    if-nez v9, :cond_23

    .line 706
    .line 707
    invoke-virtual {v8}, Lj0/a0;->e()Z

    .line 708
    .line 709
    .line 710
    move-result v9

    .line 711
    if-nez v9, :cond_23

    .line 712
    .line 713
    iget v9, v8, Lj0/a0;->f:I

    .line 714
    .line 715
    if-ne v13, v9, :cond_21

    .line 716
    .line 717
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-object v11, v8

    .line 721
    goto :goto_11

    .line 722
    :cond_21
    invoke-virtual {v1, v3}, Lj0/Q;->e(I)V

    .line 723
    .line 724
    .line 725
    :cond_22
    const/4 v11, 0x0

    .line 726
    goto :goto_11

    .line 727
    :cond_23
    add-int/2addr v3, v2

    .line 728
    goto :goto_10

    .line 729
    :goto_11
    if-eqz v11, :cond_24

    .line 730
    .line 731
    iput v7, v11, Lj0/a0;->c:I

    .line 732
    .line 733
    const/4 v6, 0x1

    .line 734
    :cond_24
    if-nez v11, :cond_28

    .line 735
    .line 736
    invoke-virtual/range {p0 .. p0}, Lj0/Q;->c()Lj0/P;

    .line 737
    .line 738
    .line 739
    move-result-object v3

    .line 740
    iget-object v3, v3, Lj0/P;->a:Landroid/util/SparseArray;

    .line 741
    .line 742
    invoke-virtual {v3, v13}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v3

    .line 746
    check-cast v3, Lj0/O;

    .line 747
    .line 748
    if-eqz v3, :cond_26

    .line 749
    .line 750
    iget-object v3, v3, Lj0/O;->a:Ljava/util/ArrayList;

    .line 751
    .line 752
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 753
    .line 754
    .line 755
    move-result v7

    .line 756
    if-nez v7, :cond_26

    .line 757
    .line 758
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 759
    .line 760
    .line 761
    move-result v7

    .line 762
    const/4 v8, 0x1

    .line 763
    sub-int/2addr v7, v8

    .line 764
    :goto_12
    if-ltz v7, :cond_26

    .line 765
    .line 766
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v8

    .line 770
    check-cast v8, Lj0/a0;

    .line 771
    .line 772
    invoke-virtual {v8}, Lj0/a0;->e()Z

    .line 773
    .line 774
    .line 775
    move-result v8

    .line 776
    if-nez v8, :cond_25

    .line 777
    .line 778
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 779
    .line 780
    .line 781
    move-result-object v2

    .line 782
    move-object v8, v2

    .line 783
    check-cast v8, Lj0/a0;

    .line 784
    .line 785
    goto :goto_13

    .line 786
    :cond_25
    add-int/2addr v7, v2

    .line 787
    goto :goto_12

    .line 788
    :cond_26
    const/4 v8, 0x0

    .line 789
    :goto_13
    if-eqz v8, :cond_27

    .line 790
    .line 791
    invoke-virtual {v8}, Lj0/a0;->n()V

    .line 792
    .line 793
    .line 794
    sget-object v2, Landroidx/recyclerview/widget/RecyclerView;->z0:[I

    .line 795
    .line 796
    :cond_27
    move-object v11, v8

    .line 797
    :cond_28
    if-nez v11, :cond_2f

    .line 798
    .line 799
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 800
    .line 801
    .line 802
    move-result-wide v2

    .line 803
    cmp-long v7, p2, v20

    .line 804
    .line 805
    if-eqz v7, :cond_2b

    .line 806
    .line 807
    iget-object v7, v1, Lj0/Q;->g:Lj0/P;

    .line 808
    .line 809
    invoke-virtual {v7, v13}, Lj0/P;->a(I)Lj0/O;

    .line 810
    .line 811
    .line 812
    move-result-object v7

    .line 813
    iget-wide v7, v7, Lj0/O;->c:J

    .line 814
    .line 815
    cmp-long v9, v7, v18

    .line 816
    .line 817
    if-eqz v9, :cond_2a

    .line 818
    .line 819
    add-long/2addr v7, v2

    .line 820
    cmp-long v9, v7, p2

    .line 821
    .line 822
    if-gez v9, :cond_29

    .line 823
    .line 824
    goto :goto_14

    .line 825
    :cond_29
    const/4 v7, 0x0

    .line 826
    goto :goto_15

    .line 827
    :cond_2a
    :goto_14
    const/4 v7, 0x1

    .line 828
    :goto_15
    if-nez v7, :cond_2b

    .line 829
    .line 830
    const/4 v8, 0x0

    .line 831
    return-object v8

    .line 832
    :cond_2b
    const/4 v8, 0x0

    .line 833
    iget-object v7, v4, Landroidx/recyclerview/widget/RecyclerView;->q:Lj0/C;

    .line 834
    .line 835
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 836
    .line 837
    .line 838
    :try_start_0
    const-string v9, "RV CreateView"

    .line 839
    .line 840
    sget v10, LJ/k;->a:I

    .line 841
    .line 842
    invoke-static {v9}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 843
    .line 844
    .line 845
    invoke-virtual {v7, v4, v13}, Lj0/C;->e(Landroid/view/ViewGroup;I)Lj0/a0;

    .line 846
    .line 847
    .line 848
    move-result-object v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 849
    iget-object v7, v11, Lj0/a0;->a:Landroid/view/View;

    .line 850
    .line 851
    :try_start_1
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 852
    .line 853
    .line 854
    move-result-object v9

    .line 855
    if-nez v9, :cond_2e

    .line 856
    .line 857
    iput v13, v11, Lj0/a0;->f:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 858
    .line 859
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 860
    .line 861
    .line 862
    sget-boolean v9, Landroidx/recyclerview/widget/RecyclerView;->C0:Z

    .line 863
    .line 864
    if-eqz v9, :cond_2c

    .line 865
    .line 866
    invoke-static {v7}, Landroidx/recyclerview/widget/RecyclerView;->D(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;

    .line 867
    .line 868
    .line 869
    move-result-object v7

    .line 870
    if-eqz v7, :cond_2c

    .line 871
    .line 872
    new-instance v9, Ljava/lang/ref/WeakReference;

    .line 873
    .line 874
    invoke-direct {v9, v7}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 875
    .line 876
    .line 877
    iput-object v9, v11, Lj0/a0;->b:Ljava/lang/ref/WeakReference;

    .line 878
    .line 879
    :cond_2c
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 880
    .line 881
    .line 882
    move-result-wide v9

    .line 883
    iget-object v7, v1, Lj0/Q;->g:Lj0/P;

    .line 884
    .line 885
    sub-long/2addr v9, v2

    .line 886
    invoke-virtual {v7, v13}, Lj0/P;->a(I)Lj0/O;

    .line 887
    .line 888
    .line 889
    move-result-object v2

    .line 890
    iget-wide v12, v2, Lj0/O;->c:J

    .line 891
    .line 892
    cmp-long v3, v12, v18

    .line 893
    .line 894
    if-nez v3, :cond_2d

    .line 895
    .line 896
    goto :goto_16

    .line 897
    :cond_2d
    const-wide/16 v14, 0x4

    .line 898
    .line 899
    div-long/2addr v12, v14

    .line 900
    const-wide/16 v22, 0x3

    .line 901
    .line 902
    mul-long v12, v12, v22

    .line 903
    .line 904
    div-long/2addr v9, v14

    .line 905
    add-long/2addr v9, v12

    .line 906
    :goto_16
    iput-wide v9, v2, Lj0/O;->c:J

    .line 907
    .line 908
    goto :goto_18

    .line 909
    :catchall_0
    move-exception v0

    .line 910
    goto :goto_17

    .line 911
    :cond_2e
    :try_start_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 912
    .line 913
    const-string v2, "ViewHolder views must not be attached when created. Ensure that you are not passing \'true\' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"

    .line 914
    .line 915
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 916
    .line 917
    .line 918
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 919
    :goto_17
    sget v2, LJ/k;->a:I

    .line 920
    .line 921
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 922
    .line 923
    .line 924
    throw v0

    .line 925
    :cond_2f
    const/4 v8, 0x0

    .line 926
    goto :goto_18

    .line 927
    :cond_30
    new-instance v2, Ljava/lang/IndexOutOfBoundsException;

    .line 928
    .line 929
    new-instance v3, Ljava/lang/StringBuilder;

    .line 930
    .line 931
    const-string v6, "Inconsistency detected. Invalid item position "

    .line 932
    .line 933
    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 934
    .line 935
    .line 936
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 937
    .line 938
    .line 939
    const-string v0, "(offset:"

    .line 940
    .line 941
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 942
    .line 943
    .line 944
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 945
    .line 946
    .line 947
    const-string v0, ").state:"

    .line 948
    .line 949
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 950
    .line 951
    .line 952
    invoke-virtual {v5}, Lj0/X;->b()I

    .line 953
    .line 954
    .line 955
    move-result v0

    .line 956
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 957
    .line 958
    .line 959
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 960
    .line 961
    .line 962
    move-result-object v0

    .line 963
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 964
    .line 965
    .line 966
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 967
    .line 968
    .line 969
    move-result-object v0

    .line 970
    invoke-direct {v2, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 971
    .line 972
    .line 973
    throw v2

    .line 974
    :goto_18
    if-eqz v6, :cond_31

    .line 975
    .line 976
    iget-boolean v2, v5, Lj0/X;->g:Z

    .line 977
    .line 978
    if-nez v2, :cond_31

    .line 979
    .line 980
    const/16 v2, 0x2000

    .line 981
    .line 982
    invoke-virtual {v11, v2}, Lj0/a0;->d(I)Z

    .line 983
    .line 984
    .line 985
    move-result v2

    .line 986
    if-eqz v2, :cond_31

    .line 987
    .line 988
    iget v2, v11, Lj0/a0;->j:I

    .line 989
    .line 990
    and-int/lit16 v2, v2, -0x2001

    .line 991
    .line 992
    iput v2, v11, Lj0/a0;->j:I

    .line 993
    .line 994
    iget-boolean v2, v5, Lj0/X;->j:Z

    .line 995
    .line 996
    if-eqz v2, :cond_31

    .line 997
    .line 998
    invoke-static {v11}, Lj0/G;->b(Lj0/a0;)V

    .line 999
    .line 1000
    .line 1001
    iget-object v2, v4, Landroidx/recyclerview/widget/RecyclerView;->O:Lj0/G;

    .line 1002
    .line 1003
    invoke-virtual {v11}, Lj0/a0;->c()Ljava/util/List;

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1007
    .line 1008
    .line 1009
    new-instance v2, LN/q;

    .line 1010
    .line 1011
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual {v2, v11}, LN/q;->a(Lj0/a0;)V

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual {v4, v11, v2}, Landroidx/recyclerview/widget/RecyclerView;->V(Lj0/a0;LN/q;)V

    .line 1018
    .line 1019
    .line 1020
    :cond_31
    iget-boolean v2, v5, Lj0/X;->g:Z

    .line 1021
    .line 1022
    iget-object v3, v11, Lj0/a0;->a:Landroid/view/View;

    .line 1023
    .line 1024
    if-eqz v2, :cond_32

    .line 1025
    .line 1026
    invoke-virtual {v11}, Lj0/a0;->f()Z

    .line 1027
    .line 1028
    .line 1029
    move-result v2

    .line 1030
    if-eqz v2, :cond_32

    .line 1031
    .line 1032
    iput v0, v11, Lj0/a0;->g:I

    .line 1033
    .line 1034
    goto :goto_1a

    .line 1035
    :cond_32
    invoke-virtual {v11}, Lj0/a0;->f()Z

    .line 1036
    .line 1037
    .line 1038
    move-result v2

    .line 1039
    if-eqz v2, :cond_35

    .line 1040
    .line 1041
    iget v2, v11, Lj0/a0;->j:I

    .line 1042
    .line 1043
    and-int/lit8 v2, v2, 0x2

    .line 1044
    .line 1045
    if-eqz v2, :cond_33

    .line 1046
    .line 1047
    const/4 v2, 0x1

    .line 1048
    goto :goto_19

    .line 1049
    :cond_33
    const/4 v2, 0x0

    .line 1050
    :goto_19
    if-nez v2, :cond_35

    .line 1051
    .line 1052
    invoke-virtual {v11}, Lj0/a0;->g()Z

    .line 1053
    .line 1054
    .line 1055
    move-result v2

    .line 1056
    if-eqz v2, :cond_34

    .line 1057
    .line 1058
    goto :goto_1b

    .line 1059
    :cond_34
    :goto_1a
    const/4 v2, 0x1

    .line 1060
    const/4 v9, 0x0

    .line 1061
    const/16 v16, 0x0

    .line 1062
    .line 1063
    goto/16 :goto_23

    .line 1064
    .line 1065
    :cond_35
    :goto_1b
    iget-object v2, v4, Landroidx/recyclerview/widget/RecyclerView;->i:Lj0/b;

    .line 1066
    .line 1067
    const/4 v9, 0x0

    .line 1068
    invoke-virtual {v2, v0, v9}, Lj0/b;->g(II)I

    .line 1069
    .line 1070
    .line 1071
    move-result v2

    .line 1072
    iput-object v4, v11, Lj0/a0;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 1073
    .line 1074
    iget v7, v11, Lj0/a0;->f:I

    .line 1075
    .line 1076
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 1077
    .line 1078
    .line 1079
    move-result-wide v12

    .line 1080
    cmp-long v10, p2, v20

    .line 1081
    .line 1082
    if-eqz v10, :cond_37

    .line 1083
    .line 1084
    iget-object v10, v1, Lj0/Q;->g:Lj0/P;

    .line 1085
    .line 1086
    invoke-virtual {v10, v7}, Lj0/P;->a(I)Lj0/O;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v7

    .line 1090
    iget-wide v14, v7, Lj0/O;->d:J

    .line 1091
    .line 1092
    cmp-long v7, v14, v18

    .line 1093
    .line 1094
    if-eqz v7, :cond_37

    .line 1095
    .line 1096
    add-long/2addr v14, v12

    .line 1097
    cmp-long v7, v14, p2

    .line 1098
    .line 1099
    if-gez v7, :cond_36

    .line 1100
    .line 1101
    goto :goto_1c

    .line 1102
    :cond_36
    const/4 v0, 0x0

    .line 1103
    const/4 v2, 0x1

    .line 1104
    goto/16 :goto_22

    .line 1105
    .line 1106
    :cond_37
    :goto_1c
    iget-object v7, v4, Landroidx/recyclerview/widget/RecyclerView;->q:Lj0/C;

    .line 1107
    .line 1108
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1109
    .line 1110
    .line 1111
    iput v2, v11, Lj0/a0;->c:I

    .line 1112
    .line 1113
    iget-boolean v10, v7, Lj0/C;->b:Z

    .line 1114
    .line 1115
    if-eqz v10, :cond_38

    .line 1116
    .line 1117
    invoke-virtual {v7, v2}, Lj0/C;->b(I)J

    .line 1118
    .line 1119
    .line 1120
    move-result-wide v14

    .line 1121
    iput-wide v14, v11, Lj0/a0;->e:J

    .line 1122
    .line 1123
    :cond_38
    iget v10, v11, Lj0/a0;->j:I

    .line 1124
    .line 1125
    and-int/lit16 v10, v10, -0x208

    .line 1126
    .line 1127
    const/4 v14, 0x1

    .line 1128
    or-int/2addr v10, v14

    .line 1129
    iput v10, v11, Lj0/a0;->j:I

    .line 1130
    .line 1131
    sget v10, LJ/k;->a:I

    .line 1132
    .line 1133
    const-string v10, "RV OnBindView"

    .line 1134
    .line 1135
    invoke-static {v10}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1136
    .line 1137
    .line 1138
    invoke-virtual {v11}, Lj0/a0;->c()Ljava/util/List;

    .line 1139
    .line 1140
    .line 1141
    invoke-virtual {v7, v11, v2}, Lj0/C;->d(Lj0/a0;I)V

    .line 1142
    .line 1143
    .line 1144
    iget-object v2, v11, Lj0/a0;->k:Ljava/util/ArrayList;

    .line 1145
    .line 1146
    if-eqz v2, :cond_39

    .line 1147
    .line 1148
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 1149
    .line 1150
    .line 1151
    :cond_39
    iget v2, v11, Lj0/a0;->j:I

    .line 1152
    .line 1153
    and-int/lit16 v2, v2, -0x401

    .line 1154
    .line 1155
    iput v2, v11, Lj0/a0;->j:I

    .line 1156
    .line 1157
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v2

    .line 1161
    instance-of v7, v2, Lj0/L;

    .line 1162
    .line 1163
    if-eqz v7, :cond_3a

    .line 1164
    .line 1165
    check-cast v2, Lj0/L;

    .line 1166
    .line 1167
    const/4 v7, 0x1

    .line 1168
    iput-boolean v7, v2, Lj0/L;->c:Z

    .line 1169
    .line 1170
    :cond_3a
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1171
    .line 1172
    .line 1173
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 1174
    .line 1175
    .line 1176
    move-result-wide v14

    .line 1177
    iget-object v2, v1, Lj0/Q;->g:Lj0/P;

    .line 1178
    .line 1179
    iget v7, v11, Lj0/a0;->f:I

    .line 1180
    .line 1181
    sub-long/2addr v14, v12

    .line 1182
    invoke-virtual {v2, v7}, Lj0/P;->a(I)Lj0/O;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v2

    .line 1186
    iget-wide v12, v2, Lj0/O;->d:J

    .line 1187
    .line 1188
    cmp-long v7, v12, v18

    .line 1189
    .line 1190
    if-nez v7, :cond_3b

    .line 1191
    .line 1192
    goto :goto_1d

    .line 1193
    :cond_3b
    const-wide/16 v16, 0x4

    .line 1194
    .line 1195
    div-long v12, v12, v16

    .line 1196
    .line 1197
    const-wide/16 v18, 0x3

    .line 1198
    .line 1199
    mul-long v12, v12, v18

    .line 1200
    .line 1201
    div-long v14, v14, v16

    .line 1202
    .line 1203
    add-long/2addr v14, v12

    .line 1204
    :goto_1d
    iput-wide v14, v2, Lj0/O;->d:J

    .line 1205
    .line 1206
    iget-object v2, v4, Landroidx/recyclerview/widget/RecyclerView;->E:Landroid/view/accessibility/AccessibilityManager;

    .line 1207
    .line 1208
    if-eqz v2, :cond_3c

    .line 1209
    .line 1210
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 1211
    .line 1212
    .line 1213
    move-result v2

    .line 1214
    if-eqz v2, :cond_3c

    .line 1215
    .line 1216
    const/4 v2, 0x1

    .line 1217
    goto :goto_1e

    .line 1218
    :cond_3c
    const/4 v2, 0x0

    .line 1219
    :goto_1e
    if-eqz v2, :cond_42

    .line 1220
    .line 1221
    sget-object v2, LN/Q;->a:Ljava/util/WeakHashMap;

    .line 1222
    .line 1223
    invoke-virtual {v3}, Landroid/view/View;->getImportantForAccessibility()I

    .line 1224
    .line 1225
    .line 1226
    move-result v2

    .line 1227
    if-nez v2, :cond_3d

    .line 1228
    .line 1229
    const/4 v2, 0x1

    .line 1230
    invoke-virtual {v3, v2}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 1231
    .line 1232
    .line 1233
    goto :goto_1f

    .line 1234
    :cond_3d
    const/4 v2, 0x1

    .line 1235
    :goto_1f
    iget-object v7, v4, Landroidx/recyclerview/widget/RecyclerView;->q0:Lj0/c0;

    .line 1236
    .line 1237
    if-nez v7, :cond_3e

    .line 1238
    .line 1239
    goto :goto_21

    .line 1240
    :cond_3e
    invoke-virtual {v7}, Lj0/c0;->j()LN/b;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v7

    .line 1244
    instance-of v10, v7, Lj0/b0;

    .line 1245
    .line 1246
    if-eqz v10, :cond_41

    .line 1247
    .line 1248
    move-object v10, v7

    .line 1249
    check-cast v10, Lj0/b0;

    .line 1250
    .line 1251
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1252
    .line 1253
    .line 1254
    invoke-static {v3}, LN/Q;->c(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v12

    .line 1258
    if-nez v12, :cond_3f

    .line 1259
    .line 1260
    goto :goto_20

    .line 1261
    :cond_3f
    instance-of v8, v12, LN/a;

    .line 1262
    .line 1263
    if-eqz v8, :cond_40

    .line 1264
    .line 1265
    check-cast v12, LN/a;

    .line 1266
    .line 1267
    iget-object v8, v12, LN/a;->a:LN/b;

    .line 1268
    .line 1269
    goto :goto_20

    .line 1270
    :cond_40
    new-instance v8, LN/b;

    .line 1271
    .line 1272
    invoke-direct {v8, v12}, LN/b;-><init>(Landroid/view/View$AccessibilityDelegate;)V

    .line 1273
    .line 1274
    .line 1275
    :goto_20
    if-eqz v8, :cond_41

    .line 1276
    .line 1277
    if-eq v8, v10, :cond_41

    .line 1278
    .line 1279
    iget-object v10, v10, Lj0/b0;->e:Ljava/util/WeakHashMap;

    .line 1280
    .line 1281
    invoke-virtual {v10, v3, v8}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1282
    .line 1283
    .line 1284
    :cond_41
    invoke-static {v3, v7}, LN/Q;->p(Landroid/view/View;LN/b;)V

    .line 1285
    .line 1286
    .line 1287
    goto :goto_21

    .line 1288
    :cond_42
    const/4 v2, 0x1

    .line 1289
    :goto_21
    iget-boolean v5, v5, Lj0/X;->g:Z

    .line 1290
    .line 1291
    if-eqz v5, :cond_43

    .line 1292
    .line 1293
    iput v0, v11, Lj0/a0;->g:I

    .line 1294
    .line 1295
    :cond_43
    const/4 v0, 0x1

    .line 1296
    :goto_22
    move/from16 v16, v0

    .line 1297
    .line 1298
    :goto_23
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v0

    .line 1302
    if-nez v0, :cond_44

    .line 1303
    .line 1304
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v0

    .line 1308
    check-cast v0, Lj0/L;

    .line 1309
    .line 1310
    invoke-virtual {v3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1311
    .line 1312
    .line 1313
    goto :goto_24

    .line 1314
    :cond_44
    invoke-virtual {v4, v0}, Landroidx/recyclerview/widget/RecyclerView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    .line 1315
    .line 1316
    .line 1317
    move-result v5

    .line 1318
    if-nez v5, :cond_45

    .line 1319
    .line 1320
    invoke-virtual {v4, v0}, Landroidx/recyclerview/widget/RecyclerView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v0

    .line 1324
    check-cast v0, Lj0/L;

    .line 1325
    .line 1326
    invoke-virtual {v3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1327
    .line 1328
    .line 1329
    goto :goto_24

    .line 1330
    :cond_45
    check-cast v0, Lj0/L;

    .line 1331
    .line 1332
    :goto_24
    iput-object v11, v0, Lj0/L;->a:Lj0/a0;

    .line 1333
    .line 1334
    if-eqz v6, :cond_46

    .line 1335
    .line 1336
    if-eqz v16, :cond_46

    .line 1337
    .line 1338
    const/4 v3, 0x1

    .line 1339
    goto :goto_25

    .line 1340
    :cond_46
    const/4 v3, 0x0

    .line 1341
    :goto_25
    iput-boolean v3, v0, Lj0/L;->d:Z

    .line 1342
    .line 1343
    return-object v11

    .line 1344
    :cond_47
    new-instance v2, Ljava/lang/IndexOutOfBoundsException;

    .line 1345
    .line 1346
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1347
    .line 1348
    const-string v5, "Invalid item position "

    .line 1349
    .line 1350
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1351
    .line 1352
    .line 1353
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1354
    .line 1355
    .line 1356
    const-string v5, "("

    .line 1357
    .line 1358
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1359
    .line 1360
    .line 1361
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1362
    .line 1363
    .line 1364
    const-string v0, "). Item count:"

    .line 1365
    .line 1366
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1367
    .line 1368
    .line 1369
    iget-object v0, v4, Landroidx/recyclerview/widget/RecyclerView;->j0:Lj0/X;

    .line 1370
    .line 1371
    invoke-virtual {v0}, Lj0/X;->b()I

    .line 1372
    .line 1373
    .line 1374
    move-result v0

    .line 1375
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1376
    .line 1377
    .line 1378
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v0

    .line 1382
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1383
    .line 1384
    .line 1385
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v0

    .line 1389
    invoke-direct {v2, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 1390
    .line 1391
    .line 1392
    throw v2
.end method

.method public final j(Lj0/a0;)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Lj0/a0;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lj0/Q;->b:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lj0/Q;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    :goto_0
    const/4 v0, 0x0

    .line 17
    iput-object v0, p1, Lj0/a0;->n:Lj0/Q;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p1, Lj0/a0;->o:Z

    .line 21
    .line 22
    iget v0, p1, Lj0/a0;->j:I

    .line 23
    .line 24
    and-int/lit8 v0, v0, -0x21

    .line 25
    .line 26
    iput v0, p1, Lj0/a0;->j:I

    .line 27
    .line 28
    return-void
.end method

.method public final k()V
    .locals 4

    .line 1
    iget-object v0, p0, Lj0/Q;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->r:Lj0/K;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v0, v0, Lj0/K;->j:I

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget v1, p0, Lj0/Q;->e:I

    .line 12
    .line 13
    add-int/2addr v1, v0

    .line 14
    iput v1, p0, Lj0/Q;->f:I

    .line 15
    .line 16
    iget-object v0, p0, Lj0/Q;->c:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    add-int/lit8 v1, v1, -0x1

    .line 23
    .line 24
    :goto_1
    if-ltz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    iget v3, p0, Lj0/Q;->f:I

    .line 31
    .line 32
    if-le v2, v3, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Lj0/Q;->e(I)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v1, v1, -0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    return-void
.end method
