.class public final Lj0/B;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public synthetic constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj0/B;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lj0/a;)V
    .locals 3

    .line 1
    iget v0, p1, Lj0/a;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Lj0/B;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    .line 6
    if-eq v0, v1, :cond_3

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-eq v0, v1, :cond_2

    .line 10
    .line 11
    const/4 v1, 0x4

    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    if-eq v0, v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, v2, Landroidx/recyclerview/widget/RecyclerView;->r:Lj0/K;

    .line 20
    .line 21
    iget v1, p1, Lj0/a;->b:I

    .line 22
    .line 23
    iget p1, p1, Lj0/a;->d:I

    .line 24
    .line 25
    invoke-virtual {v0, v1, p1}, Lj0/K;->Y(II)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-object v0, v2, Landroidx/recyclerview/widget/RecyclerView;->r:Lj0/K;

    .line 30
    .line 31
    iget v1, p1, Lj0/a;->b:I

    .line 32
    .line 33
    iget p1, p1, Lj0/a;->d:I

    .line 34
    .line 35
    invoke-virtual {v0, v1, p1}, Lj0/K;->a0(II)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    iget-object v0, v2, Landroidx/recyclerview/widget/RecyclerView;->r:Lj0/K;

    .line 40
    .line 41
    iget v1, p1, Lj0/a;->b:I

    .line 42
    .line 43
    iget p1, p1, Lj0/a;->d:I

    .line 44
    .line 45
    invoke-virtual {v0, v1, p1}, Lj0/K;->Z(II)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    iget-object v0, v2, Landroidx/recyclerview/widget/RecyclerView;->r:Lj0/K;

    .line 50
    .line 51
    iget v1, p1, Lj0/a;->b:I

    .line 52
    .line 53
    iget p1, p1, Lj0/a;->d:I

    .line 54
    .line 55
    invoke-virtual {v0, v1, p1}, Lj0/K;->W(II)V

    .line 56
    .line 57
    .line 58
    :goto_0
    return-void
.end method

.method public b(I)Lj0/a0;
    .locals 7

    .line 1
    iget-object v0, p0, Lj0/B;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->j:Landroid/support/v4/media/session/t;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/support/v4/media/session/t;->u()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    move-object v4, v2

    .line 12
    :goto_0
    if-ge v3, v1, :cond_3

    .line 13
    .line 14
    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->j:Landroid/support/v4/media/session/t;

    .line 15
    .line 16
    invoke-virtual {v5, v3}, Landroid/support/v4/media/session/t;->t(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    invoke-static {v5}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lj0/a0;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    if-eqz v5, :cond_2

    .line 25
    .line 26
    invoke-virtual {v5}, Lj0/a0;->i()Z

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    if-nez v6, :cond_2

    .line 31
    .line 32
    iget v6, v5, Lj0/a0;->c:I

    .line 33
    .line 34
    if-eq v6, p1, :cond_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->j:Landroid/support/v4/media/session/t;

    .line 38
    .line 39
    iget-object v4, v4, Landroid/support/v4/media/session/t;->d:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v4, Ljava/util/ArrayList;

    .line 42
    .line 43
    iget-object v6, v5, Lj0/a0;->a:Landroid/view/View;

    .line 44
    .line 45
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_1

    .line 50
    .line 51
    move-object v4, v5

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move-object v4, v5

    .line 54
    goto :goto_2

    .line 55
    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    :goto_2
    if-nez v4, :cond_4

    .line 59
    .line 60
    return-object v2

    .line 61
    :cond_4
    iget-object p1, v0, Landroidx/recyclerview/widget/RecyclerView;->j:Landroid/support/v4/media/session/t;

    .line 62
    .line 63
    iget-object p1, p1, Landroid/support/v4/media/session/t;->d:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, Ljava/util/ArrayList;

    .line 66
    .line 67
    iget-object v0, v4, Lj0/a0;->a:Landroid/view/View;

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_5

    .line 74
    .line 75
    return-object v2

    .line 76
    :cond_5
    return-object v4
.end method

.method public c(IILjava/lang/Object;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lj0/B;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->j:Landroid/support/v4/media/session/t;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/support/v4/media/session/t;->u()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr p2, p1

    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    const/4 v3, 0x1

    .line 12
    const/4 v4, 0x2

    .line 13
    if-ge v2, v1, :cond_5

    .line 14
    .line 15
    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->j:Landroid/support/v4/media/session/t;

    .line 16
    .line 17
    invoke-virtual {v5, v2}, Landroid/support/v4/media/session/t;->t(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-static {v5}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lj0/a0;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    if-eqz v6, :cond_4

    .line 26
    .line 27
    invoke-virtual {v6}, Lj0/a0;->p()Z

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    if-eqz v7, :cond_0

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_0
    iget v7, v6, Lj0/a0;->c:I

    .line 35
    .line 36
    if-lt v7, p1, :cond_4

    .line 37
    .line 38
    if-ge v7, p2, :cond_4

    .line 39
    .line 40
    invoke-virtual {v6, v4}, Lj0/a0;->a(I)V

    .line 41
    .line 42
    .line 43
    const/16 v4, 0x400

    .line 44
    .line 45
    if-nez p3, :cond_1

    .line 46
    .line 47
    invoke-virtual {v6, v4}, Lj0/a0;->a(I)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    iget v7, v6, Lj0/a0;->j:I

    .line 52
    .line 53
    and-int/2addr v4, v7

    .line 54
    if-nez v4, :cond_3

    .line 55
    .line 56
    iget-object v4, v6, Lj0/a0;->k:Ljava/util/ArrayList;

    .line 57
    .line 58
    if-nez v4, :cond_2

    .line 59
    .line 60
    new-instance v4, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v4, v6, Lj0/a0;->k:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    iput-object v4, v6, Lj0/a0;->l:Ljava/util/List;

    .line 72
    .line 73
    :cond_2
    iget-object v4, v6, Lj0/a0;->k:Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    :cond_3
    :goto_1
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    check-cast v4, Lj0/L;

    .line 83
    .line 84
    iput-boolean v3, v4, Lj0/L;->c:Z

    .line 85
    .line 86
    :cond_4
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_5
    iget-object p3, v0, Landroidx/recyclerview/widget/RecyclerView;->g:Lj0/Q;

    .line 90
    .line 91
    iget-object v1, p3, Lj0/Q;->c:Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    sub-int/2addr v2, v3

    .line 98
    :goto_3
    if-ltz v2, :cond_8

    .line 99
    .line 100
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    check-cast v5, Lj0/a0;

    .line 105
    .line 106
    if-nez v5, :cond_6

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_6
    iget v6, v5, Lj0/a0;->c:I

    .line 110
    .line 111
    if-lt v6, p1, :cond_7

    .line 112
    .line 113
    if-ge v6, p2, :cond_7

    .line 114
    .line 115
    invoke-virtual {v5, v4}, Lj0/a0;->a(I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p3, v2}, Lj0/Q;->e(I)V

    .line 119
    .line 120
    .line 121
    :cond_7
    :goto_4
    add-int/lit8 v2, v2, -0x1

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_8
    iput-boolean v3, v0, Landroidx/recyclerview/widget/RecyclerView;->n0:Z

    .line 125
    .line 126
    return-void
.end method

.method public d(II)V
    .locals 7

    .line 1
    iget-object v0, p0, Lj0/B;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->j:Landroid/support/v4/media/session/t;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/support/v4/media/session/t;->u()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    :goto_0
    const/4 v4, 0x1

    .line 12
    if-ge v3, v1, :cond_1

    .line 13
    .line 14
    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->j:Landroid/support/v4/media/session/t;

    .line 15
    .line 16
    invoke-virtual {v5, v3}, Landroid/support/v4/media/session/t;->t(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    invoke-static {v5}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lj0/a0;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    invoke-virtual {v5}, Lj0/a0;->p()Z

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    if-nez v6, :cond_0

    .line 31
    .line 32
    iget v6, v5, Lj0/a0;->c:I

    .line 33
    .line 34
    if-lt v6, p1, :cond_0

    .line 35
    .line 36
    invoke-virtual {v5, p2, v2}, Lj0/a0;->m(IZ)V

    .line 37
    .line 38
    .line 39
    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->j0:Lj0/X;

    .line 40
    .line 41
    iput-boolean v4, v5, Lj0/X;->f:Z

    .line 42
    .line 43
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->g:Lj0/Q;

    .line 47
    .line 48
    iget-object v1, v1, Lj0/Q;->c:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    :goto_1
    if-ge v2, v3, :cond_3

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    check-cast v5, Lj0/a0;

    .line 61
    .line 62
    if-eqz v5, :cond_2

    .line 63
    .line 64
    iget v6, v5, Lj0/a0;->c:I

    .line 65
    .line 66
    if-lt v6, p1, :cond_2

    .line 67
    .line 68
    invoke-virtual {v5, p2, v4}, Lj0/a0;->m(IZ)V

    .line 69
    .line 70
    .line 71
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 75
    .line 76
    .line 77
    iput-boolean v4, v0, Landroidx/recyclerview/widget/RecyclerView;->m0:Z

    .line 78
    .line 79
    return-void
.end method

.method public e(II)V
    .locals 11

    .line 1
    iget-object v0, p0, Lj0/B;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->j:Landroid/support/v4/media/session/t;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/support/v4/media/session/t;->u()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, -0x1

    .line 11
    if-ge p1, p2, :cond_0

    .line 12
    .line 13
    move v4, p1

    .line 14
    move v5, p2

    .line 15
    const/4 v6, -0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v5, p1

    .line 18
    move v4, p2

    .line 19
    const/4 v6, 0x1

    .line 20
    :goto_0
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    :goto_1
    if-ge v8, v1, :cond_4

    .line 23
    .line 24
    iget-object v9, v0, Landroidx/recyclerview/widget/RecyclerView;->j:Landroid/support/v4/media/session/t;

    .line 25
    .line 26
    invoke-virtual {v9, v8}, Landroid/support/v4/media/session/t;->t(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v9

    .line 30
    invoke-static {v9}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lj0/a0;

    .line 31
    .line 32
    .line 33
    move-result-object v9

    .line 34
    if-eqz v9, :cond_3

    .line 35
    .line 36
    iget v10, v9, Lj0/a0;->c:I

    .line 37
    .line 38
    if-lt v10, v4, :cond_3

    .line 39
    .line 40
    if-le v10, v5, :cond_1

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_1
    if-ne v10, p1, :cond_2

    .line 44
    .line 45
    sub-int v10, p2, p1

    .line 46
    .line 47
    invoke-virtual {v9, v10, v7}, Lj0/a0;->m(IZ)V

    .line 48
    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    invoke-virtual {v9, v6, v7}, Lj0/a0;->m(IZ)V

    .line 52
    .line 53
    .line 54
    :goto_2
    iget-object v9, v0, Landroidx/recyclerview/widget/RecyclerView;->j0:Lj0/X;

    .line 55
    .line 56
    iput-boolean v2, v9, Lj0/X;->f:Z

    .line 57
    .line 58
    :cond_3
    :goto_3
    add-int/lit8 v8, v8, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_4
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->g:Lj0/Q;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    if-ge p1, p2, :cond_5

    .line 67
    .line 68
    move v4, p1

    .line 69
    move v5, p2

    .line 70
    goto :goto_4

    .line 71
    :cond_5
    move v5, p1

    .line 72
    move v4, p2

    .line 73
    const/4 v3, 0x1

    .line 74
    :goto_4
    iget-object v1, v1, Lj0/Q;->c:Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    const/4 v8, 0x0

    .line 81
    :goto_5
    if-ge v8, v6, :cond_9

    .line 82
    .line 83
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    check-cast v9, Lj0/a0;

    .line 88
    .line 89
    if-eqz v9, :cond_8

    .line 90
    .line 91
    iget v10, v9, Lj0/a0;->c:I

    .line 92
    .line 93
    if-lt v10, v4, :cond_8

    .line 94
    .line 95
    if-le v10, v5, :cond_6

    .line 96
    .line 97
    goto :goto_6

    .line 98
    :cond_6
    if-ne v10, p1, :cond_7

    .line 99
    .line 100
    sub-int v10, p2, p1

    .line 101
    .line 102
    invoke-virtual {v9, v10, v7}, Lj0/a0;->m(IZ)V

    .line 103
    .line 104
    .line 105
    goto :goto_6

    .line 106
    :cond_7
    invoke-virtual {v9, v3, v7}, Lj0/a0;->m(IZ)V

    .line 107
    .line 108
    .line 109
    :cond_8
    :goto_6
    add-int/lit8 v8, v8, 0x1

    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_9
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 113
    .line 114
    .line 115
    iput-boolean v2, v0, Landroidx/recyclerview/widget/RecyclerView;->m0:Z

    .line 116
    .line 117
    return-void
.end method

.method public f(Lj0/a0;LN/q;LN/q;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lj0/B;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p1, v1}, Lj0/a0;->o(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->O:Lj0/G;

    .line 11
    .line 12
    move-object v2, v1

    .line 13
    check-cast v2, Lj0/j;

    .line 14
    .line 15
    if-eqz p2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget v4, p2, LN/q;->a:I

    .line 21
    .line 22
    iget v6, p3, LN/q;->a:I

    .line 23
    .line 24
    if-ne v4, v6, :cond_0

    .line 25
    .line 26
    iget v1, p2, LN/q;->b:I

    .line 27
    .line 28
    iget v3, p3, LN/q;->b:I

    .line 29
    .line 30
    if-eq v1, v3, :cond_1

    .line 31
    .line 32
    :cond_0
    iget v5, p2, LN/q;->b:I

    .line 33
    .line 34
    iget v7, p3, LN/q;->b:I

    .line 35
    .line 36
    move-object v3, p1

    .line 37
    invoke-virtual/range {v2 .. v7}, Lj0/j;->g(Lj0/a0;IIII)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {v2, p1}, Lj0/j;->l(Lj0/a0;)V

    .line 43
    .line 44
    .line 45
    iget-object p2, p1, Lj0/a0;->a:Landroid/view/View;

    .line 46
    .line 47
    const/4 p3, 0x0

    .line 48
    invoke-virtual {p2, p3}, Landroid/view/View;->setAlpha(F)V

    .line 49
    .line 50
    .line 51
    iget-object p2, v2, Lj0/j;->i:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    :goto_0
    if-eqz p1, :cond_2

    .line 58
    .line 59
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->S()V

    .line 60
    .line 61
    .line 62
    :cond_2
    return-void
.end method

.method public g(Lj0/a0;LN/q;LN/q;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lj0/B;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->g:Lj0/Q;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Lj0/Q;->j(Lj0/a0;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->f(Lj0/a0;)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {p1, v1}, Lj0/a0;->o(Z)V

    .line 13
    .line 14
    .line 15
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->O:Lj0/G;

    .line 16
    .line 17
    move-object v2, v1

    .line 18
    check-cast v2, Lj0/j;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget v4, p2, LN/q;->a:I

    .line 24
    .line 25
    iget v5, p2, LN/q;->b:I

    .line 26
    .line 27
    iget-object p2, p1, Lj0/a0;->a:Landroid/view/View;

    .line 28
    .line 29
    if-nez p3, :cond_0

    .line 30
    .line 31
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    :goto_0
    move v6, v1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    iget v1, p3, LN/q;->a:I

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :goto_1
    if-nez p3, :cond_1

    .line 41
    .line 42
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 43
    .line 44
    .line 45
    move-result p3

    .line 46
    :goto_2
    move v7, p3

    .line 47
    goto :goto_3

    .line 48
    :cond_1
    iget p3, p3, LN/q;->b:I

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :goto_3
    invoke-virtual {p1}, Lj0/a0;->i()Z

    .line 52
    .line 53
    .line 54
    move-result p3

    .line 55
    if-nez p3, :cond_3

    .line 56
    .line 57
    if-ne v4, v6, :cond_2

    .line 58
    .line 59
    if-eq v5, v7, :cond_3

    .line 60
    .line 61
    :cond_2
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 62
    .line 63
    .line 64
    move-result p3

    .line 65
    add-int/2addr p3, v6

    .line 66
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    add-int/2addr v1, v7

    .line 71
    invoke-virtual {p2, v6, v7, p3, v1}, Landroid/view/View;->layout(IIII)V

    .line 72
    .line 73
    .line 74
    move-object v3, p1

    .line 75
    invoke-virtual/range {v2 .. v7}, Lj0/j;->g(Lj0/a0;IIII)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    goto :goto_4

    .line 80
    :cond_3
    invoke-virtual {v2, p1}, Lj0/j;->l(Lj0/a0;)V

    .line 81
    .line 82
    .line 83
    iget-object p2, v2, Lj0/j;->h:Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    const/4 p1, 0x1

    .line 89
    :goto_4
    if-eqz p1, :cond_4

    .line 90
    .line 91
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->S()V

    .line 92
    .line 93
    .line 94
    :cond_4
    return-void
.end method

.method public h(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lj0/B;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lj0/a0;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/view/View;->clearAnimation()V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
