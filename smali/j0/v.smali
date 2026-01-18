.class public Lj0/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Landroidx/recyclerview/widget/RecyclerView;

.field public c:Lj0/K;

.field public d:Z

.field public e:Z

.field public f:Landroid/view/View;

.field public final g:Lj0/V;

.field public h:Z

.field public final i:Landroid/view/animation/LinearInterpolator;

.field public final j:Landroid/view/animation/DecelerateInterpolator;

.field public k:Landroid/graphics/PointF;

.field public final l:Landroid/util/DisplayMetrics;

.field public m:Z

.field public n:F

.field public o:I

.field public p:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lj0/v;->a:I

    .line 6
    .line 7
    new-instance v1, Lj0/V;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput v0, v1, Lj0/V;->d:I

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, v1, Lj0/V;->f:Z

    .line 16
    .line 17
    iput v0, v1, Lj0/V;->g:I

    .line 18
    .line 19
    iput v0, v1, Lj0/V;->a:I

    .line 20
    .line 21
    iput v0, v1, Lj0/V;->b:I

    .line 22
    .line 23
    const/high16 v2, -0x80000000

    .line 24
    .line 25
    iput v2, v1, Lj0/V;->c:I

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    iput-object v2, v1, Lj0/V;->e:Landroid/view/animation/Interpolator;

    .line 29
    .line 30
    iput-object v1, p0, Lj0/v;->g:Lj0/V;

    .line 31
    .line 32
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    .line 33
    .line 34
    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Lj0/v;->i:Landroid/view/animation/LinearInterpolator;

    .line 38
    .line 39
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    .line 40
    .line 41
    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lj0/v;->j:Landroid/view/animation/DecelerateInterpolator;

    .line 45
    .line 46
    iput-boolean v0, p0, Lj0/v;->m:Z

    .line 47
    .line 48
    iput v0, p0, Lj0/v;->o:I

    .line 49
    .line 50
    iput v0, p0, Lj0/v;->p:I

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iput-object p1, p0, Lj0/v;->l:Landroid/util/DisplayMetrics;

    .line 61
    .line 62
    return-void
.end method

.method public static a(IIIII)I
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eq p4, v0, :cond_4

    .line 3
    .line 4
    if-eqz p4, :cond_1

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    if-ne p4, p0, :cond_0

    .line 8
    .line 9
    sub-int/2addr p3, p1

    .line 10
    return p3

    .line 11
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 12
    .line 13
    const-string p1, "snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_"

    .line 14
    .line 15
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p0

    .line 19
    :cond_1
    sub-int/2addr p2, p0

    .line 20
    if-lez p2, :cond_2

    .line 21
    .line 22
    return p2

    .line 23
    :cond_2
    sub-int/2addr p3, p1

    .line 24
    if-gez p3, :cond_3

    .line 25
    .line 26
    return p3

    .line 27
    :cond_3
    const/4 p0, 0x0

    .line 28
    return p0

    .line 29
    :cond_4
    sub-int/2addr p2, p0

    .line 30
    return p2
.end method


# virtual methods
.method public b(Landroid/view/View;I)I
    .locals 4

    .line 1
    iget-object v0, p0, Lj0/v;->c:Lj0/K;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lj0/K;->d()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lj0/L;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Lj0/L;

    .line 27
    .line 28
    iget-object v3, v3, Lj0/L;->b:Landroid/graphics/Rect;

    .line 29
    .line 30
    iget v3, v3, Landroid/graphics/Rect;->left:I

    .line 31
    .line 32
    sub-int/2addr v2, v3

    .line 33
    iget v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 34
    .line 35
    sub-int/2addr v2, v3

    .line 36
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lj0/L;

    .line 45
    .line 46
    iget-object p1, p1, Lj0/L;->b:Landroid/graphics/Rect;

    .line 47
    .line 48
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 49
    .line 50
    add-int/2addr v3, p1

    .line 51
    iget p1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 52
    .line 53
    add-int/2addr v3, p1

    .line 54
    invoke-virtual {v0}, Lj0/K;->E()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    iget v1, v0, Lj0/K;->n:I

    .line 59
    .line 60
    invoke-virtual {v0}, Lj0/K;->F()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    sub-int/2addr v1, v0

    .line 65
    invoke-static {v2, v3, p1, v1, p2}, Lj0/v;->a(IIIII)I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    return p1

    .line 70
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 71
    return p1
.end method

.method public c(Landroid/view/View;I)I
    .locals 4

    .line 1
    iget-object v0, p0, Lj0/v;->c:Lj0/K;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lj0/K;->e()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lj0/L;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Lj0/L;

    .line 27
    .line 28
    iget-object v3, v3, Lj0/L;->b:Landroid/graphics/Rect;

    .line 29
    .line 30
    iget v3, v3, Landroid/graphics/Rect;->top:I

    .line 31
    .line 32
    sub-int/2addr v2, v3

    .line 33
    iget v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 34
    .line 35
    sub-int/2addr v2, v3

    .line 36
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lj0/L;

    .line 45
    .line 46
    iget-object p1, p1, Lj0/L;->b:Landroid/graphics/Rect;

    .line 47
    .line 48
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 49
    .line 50
    add-int/2addr v3, p1

    .line 51
    iget p1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 52
    .line 53
    add-int/2addr v3, p1

    .line 54
    invoke-virtual {v0}, Lj0/K;->G()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    iget v1, v0, Lj0/K;->o:I

    .line 59
    .line 60
    invoke-virtual {v0}, Lj0/K;->D()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    sub-int/2addr v1, v0

    .line 65
    invoke-static {v2, v3, p1, v1, p2}, Lj0/v;->a(IIIII)I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    return p1

    .line 70
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 71
    return p1
.end method

.method public d(Landroid/util/DisplayMetrics;)F
    .locals 1

    .line 1
    iget p1, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 2
    .line 3
    int-to-float p1, p1

    .line 4
    const/high16 v0, 0x41c80000    # 25.0f

    .line 5
    .line 6
    div-float/2addr v0, p1

    .line 7
    return v0
.end method

.method public e(I)I
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    iget-boolean v0, p0, Lj0/v;->m:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lj0/v;->l:Landroid/util/DisplayMetrics;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lj0/v;->d(Landroid/util/DisplayMetrics;)F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput v0, p0, Lj0/v;->n:F

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Lj0/v;->m:Z

    .line 20
    .line 21
    :cond_0
    iget v0, p0, Lj0/v;->n:F

    .line 22
    .line 23
    mul-float p1, p1, v0

    .line 24
    .line 25
    float-to-double v0, p1

    .line 26
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    double-to-int p1, v0

    .line 31
    return p1
.end method

.method public f(I)Landroid/graphics/PointF;
    .locals 2

    .line 1
    iget-object v0, p0, Lj0/v;->c:Lj0/K;

    .line 2
    .line 3
    instance-of v1, v0, Lj0/W;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lj0/W;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Lj0/W;->a(I)Landroid/graphics/PointF;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v0, "You should override computeScrollVectorForPosition when the LayoutManager does not implement "

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-class v0, Lj0/W;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string v0, "RecyclerView"

    .line 35
    .line 36
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    return-object p1
.end method

.method public final g(II)V
    .locals 8

    .line 1
    iget-object v0, p0, Lj0/v;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget v1, p0, Lj0/v;->a:I

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    if-eq v1, v2, :cond_0

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lj0/v;->i()V

    .line 11
    .line 12
    .line 13
    :cond_1
    iget-boolean v1, p0, Lj0/v;->d:Z

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    if-eqz v1, :cond_3

    .line 18
    .line 19
    iget-object v1, p0, Lj0/v;->f:Landroid/view/View;

    .line 20
    .line 21
    if-nez v1, :cond_3

    .line 22
    .line 23
    iget-object v1, p0, Lj0/v;->c:Lj0/K;

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    iget v1, p0, Lj0/v;->a:I

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lj0/v;->f(I)Landroid/graphics/PointF;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    iget v5, v1, Landroid/graphics/PointF;->x:F

    .line 36
    .line 37
    cmpl-float v6, v5, v4

    .line 38
    .line 39
    if-nez v6, :cond_2

    .line 40
    .line 41
    iget v6, v1, Landroid/graphics/PointF;->y:F

    .line 42
    .line 43
    cmpl-float v6, v6, v4

    .line 44
    .line 45
    if-eqz v6, :cond_3

    .line 46
    .line 47
    :cond_2
    invoke-static {v5}, Ljava/lang/Math;->signum(F)F

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    float-to-int v5, v5

    .line 52
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 53
    .line 54
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    float-to-int v1, v1

    .line 59
    invoke-virtual {v0, v5, v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->Z(II[I)V

    .line 60
    .line 61
    .line 62
    :cond_3
    const/4 v1, 0x0

    .line 63
    iput-boolean v1, p0, Lj0/v;->d:Z

    .line 64
    .line 65
    iget-object v5, p0, Lj0/v;->f:Landroid/view/View;

    .line 66
    .line 67
    iget-object v6, p0, Lj0/v;->g:Lj0/V;

    .line 68
    .line 69
    if-eqz v5, :cond_6

    .line 70
    .line 71
    iget-object v7, p0, Lj0/v;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 72
    .line 73
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-static {v5}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lj0/a0;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    if-eqz v5, :cond_4

    .line 81
    .line 82
    invoke-virtual {v5}, Lj0/a0;->b()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    :cond_4
    iget v5, p0, Lj0/v;->a:I

    .line 87
    .line 88
    if-ne v2, v5, :cond_5

    .line 89
    .line 90
    iget-object v2, p0, Lj0/v;->f:Landroid/view/View;

    .line 91
    .line 92
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->j0:Lj0/X;

    .line 93
    .line 94
    invoke-virtual {p0, v2, v6}, Lj0/v;->h(Landroid/view/View;Lj0/V;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v6, v0}, Lj0/V;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Lj0/v;->i()V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_5
    const-string v2, "RecyclerView"

    .line 105
    .line 106
    const-string v5, "Passed over target position while smooth scrolling."

    .line 107
    .line 108
    invoke-static {v2, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    iput-object v3, p0, Lj0/v;->f:Landroid/view/View;

    .line 112
    .line 113
    :cond_6
    :goto_0
    iget-boolean v2, p0, Lj0/v;->e:Z

    .line 114
    .line 115
    if-eqz v2, :cond_e

    .line 116
    .line 117
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->j0:Lj0/X;

    .line 118
    .line 119
    iget-object v2, p0, Lj0/v;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 120
    .line 121
    iget-object v2, v2, Landroidx/recyclerview/widget/RecyclerView;->r:Lj0/K;

    .line 122
    .line 123
    invoke-virtual {v2}, Lj0/K;->v()I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    const/4 v3, 0x1

    .line 128
    if-nez v2, :cond_7

    .line 129
    .line 130
    invoke-virtual {p0}, Lj0/v;->i()V

    .line 131
    .line 132
    .line 133
    goto/16 :goto_2

    .line 134
    .line 135
    :cond_7
    iget v2, p0, Lj0/v;->o:I

    .line 136
    .line 137
    sub-int p1, v2, p1

    .line 138
    .line 139
    mul-int v2, v2, p1

    .line 140
    .line 141
    if-gtz v2, :cond_8

    .line 142
    .line 143
    const/4 p1, 0x0

    .line 144
    :cond_8
    iput p1, p0, Lj0/v;->o:I

    .line 145
    .line 146
    iget v2, p0, Lj0/v;->p:I

    .line 147
    .line 148
    sub-int p2, v2, p2

    .line 149
    .line 150
    mul-int v2, v2, p2

    .line 151
    .line 152
    if-gtz v2, :cond_9

    .line 153
    .line 154
    const/4 p2, 0x0

    .line 155
    :cond_9
    iput p2, p0, Lj0/v;->p:I

    .line 156
    .line 157
    if-nez p1, :cond_c

    .line 158
    .line 159
    if-nez p2, :cond_c

    .line 160
    .line 161
    iget p1, p0, Lj0/v;->a:I

    .line 162
    .line 163
    invoke-virtual {p0, p1}, Lj0/v;->f(I)Landroid/graphics/PointF;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    if-eqz p1, :cond_b

    .line 168
    .line 169
    iget p2, p1, Landroid/graphics/PointF;->x:F

    .line 170
    .line 171
    cmpl-float v2, p2, v4

    .line 172
    .line 173
    if-nez v2, :cond_a

    .line 174
    .line 175
    iget v2, p1, Landroid/graphics/PointF;->y:F

    .line 176
    .line 177
    cmpl-float v2, v2, v4

    .line 178
    .line 179
    if-nez v2, :cond_a

    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_a
    mul-float p2, p2, p2

    .line 183
    .line 184
    iget v2, p1, Landroid/graphics/PointF;->y:F

    .line 185
    .line 186
    mul-float v2, v2, v2

    .line 187
    .line 188
    add-float/2addr v2, p2

    .line 189
    float-to-double v4, v2

    .line 190
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    .line 191
    .line 192
    .line 193
    move-result-wide v4

    .line 194
    double-to-float p2, v4

    .line 195
    iget v2, p1, Landroid/graphics/PointF;->x:F

    .line 196
    .line 197
    div-float/2addr v2, p2

    .line 198
    iput v2, p1, Landroid/graphics/PointF;->x:F

    .line 199
    .line 200
    iget v4, p1, Landroid/graphics/PointF;->y:F

    .line 201
    .line 202
    div-float/2addr v4, p2

    .line 203
    iput v4, p1, Landroid/graphics/PointF;->y:F

    .line 204
    .line 205
    iput-object p1, p0, Lj0/v;->k:Landroid/graphics/PointF;

    .line 206
    .line 207
    const p1, 0x461c4000    # 10000.0f

    .line 208
    .line 209
    .line 210
    mul-float v2, v2, p1

    .line 211
    .line 212
    float-to-int p2, v2

    .line 213
    iput p2, p0, Lj0/v;->o:I

    .line 214
    .line 215
    mul-float v4, v4, p1

    .line 216
    .line 217
    float-to-int p1, v4

    .line 218
    iput p1, p0, Lj0/v;->p:I

    .line 219
    .line 220
    const/16 p1, 0x2710

    .line 221
    .line 222
    invoke-virtual {p0, p1}, Lj0/v;->e(I)I

    .line 223
    .line 224
    .line 225
    move-result p1

    .line 226
    iget p2, p0, Lj0/v;->o:I

    .line 227
    .line 228
    int-to-float p2, p2

    .line 229
    const v2, 0x3f99999a    # 1.2f

    .line 230
    .line 231
    .line 232
    mul-float p2, p2, v2

    .line 233
    .line 234
    float-to-int p2, p2

    .line 235
    iget v4, p0, Lj0/v;->p:I

    .line 236
    .line 237
    int-to-float v4, v4

    .line 238
    mul-float v4, v4, v2

    .line 239
    .line 240
    float-to-int v4, v4

    .line 241
    int-to-float p1, p1

    .line 242
    mul-float p1, p1, v2

    .line 243
    .line 244
    float-to-int p1, p1

    .line 245
    iget-object v2, p0, Lj0/v;->i:Landroid/view/animation/LinearInterpolator;

    .line 246
    .line 247
    iput p2, v6, Lj0/V;->a:I

    .line 248
    .line 249
    iput v4, v6, Lj0/V;->b:I

    .line 250
    .line 251
    iput p1, v6, Lj0/V;->c:I

    .line 252
    .line 253
    iput-object v2, v6, Lj0/V;->e:Landroid/view/animation/Interpolator;

    .line 254
    .line 255
    iput-boolean v3, v6, Lj0/V;->f:Z

    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_b
    :goto_1
    iget p1, p0, Lj0/v;->a:I

    .line 259
    .line 260
    iput p1, v6, Lj0/V;->d:I

    .line 261
    .line 262
    invoke-virtual {p0}, Lj0/v;->i()V

    .line 263
    .line 264
    .line 265
    :cond_c
    :goto_2
    iget p1, v6, Lj0/V;->d:I

    .line 266
    .line 267
    if-ltz p1, :cond_d

    .line 268
    .line 269
    const/4 v1, 0x1

    .line 270
    :cond_d
    invoke-virtual {v6, v0}, Lj0/V;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 271
    .line 272
    .line 273
    if-eqz v1, :cond_e

    .line 274
    .line 275
    iget-boolean p1, p0, Lj0/v;->e:Z

    .line 276
    .line 277
    if-eqz p1, :cond_e

    .line 278
    .line 279
    iput-boolean v3, p0, Lj0/v;->d:Z

    .line 280
    .line 281
    iget-object p1, v0, Landroidx/recyclerview/widget/RecyclerView;->g0:Lj0/Z;

    .line 282
    .line 283
    invoke-virtual {p1}, Lj0/Z;->a()V

    .line 284
    .line 285
    .line 286
    :cond_e
    return-void
.end method

.method public h(Landroid/view/View;Lj0/V;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lj0/v;->k:Landroid/graphics/PointF;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, -0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget v0, v0, Landroid/graphics/PointF;->x:F

    .line 10
    .line 11
    cmpl-float v0, v0, v4

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    if-lez v0, :cond_1

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    const/4 v0, -0x1

    .line 21
    goto :goto_1

    .line 22
    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 23
    :goto_1
    invoke-virtual {p0, p1, v0}, Lj0/v;->b(Landroid/view/View;I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-object v5, p0, Lj0/v;->k:Landroid/graphics/PointF;

    .line 28
    .line 29
    if-eqz v5, :cond_5

    .line 30
    .line 31
    iget v5, v5, Landroid/graphics/PointF;->y:F

    .line 32
    .line 33
    cmpl-float v4, v5, v4

    .line 34
    .line 35
    if-nez v4, :cond_3

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_3
    if-lez v4, :cond_4

    .line 39
    .line 40
    const/4 v2, 0x1

    .line 41
    goto :goto_2

    .line 42
    :cond_4
    const/4 v2, -0x1

    .line 43
    :cond_5
    :goto_2
    invoke-virtual {p0, p1, v2}, Lj0/v;->c(Landroid/view/View;I)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    mul-int v2, v0, v0

    .line 48
    .line 49
    mul-int v3, p1, p1

    .line 50
    .line 51
    add-int/2addr v3, v2

    .line 52
    int-to-double v2, v3

    .line 53
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 54
    .line 55
    .line 56
    move-result-wide v2

    .line 57
    double-to-int v2, v2

    .line 58
    invoke-virtual {p0, v2}, Lj0/v;->e(I)I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    int-to-double v2, v2

    .line 63
    const-wide v4, 0x3fd57a786c22680aL    # 0.3356

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    div-double/2addr v2, v4

    .line 69
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 70
    .line 71
    .line 72
    move-result-wide v2

    .line 73
    double-to-int v2, v2

    .line 74
    if-lez v2, :cond_6

    .line 75
    .line 76
    neg-int v0, v0

    .line 77
    neg-int p1, p1

    .line 78
    iget-object v3, p0, Lj0/v;->j:Landroid/view/animation/DecelerateInterpolator;

    .line 79
    .line 80
    iput v0, p2, Lj0/V;->a:I

    .line 81
    .line 82
    iput p1, p2, Lj0/V;->b:I

    .line 83
    .line 84
    iput v2, p2, Lj0/V;->c:I

    .line 85
    .line 86
    iput-object v3, p2, Lj0/V;->e:Landroid/view/animation/Interpolator;

    .line 87
    .line 88
    iput-boolean v1, p2, Lj0/V;->f:Z

    .line 89
    .line 90
    :cond_6
    return-void
.end method

.method public final i()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lj0/v;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lj0/v;->e:Z

    .line 8
    .line 9
    iput v0, p0, Lj0/v;->p:I

    .line 10
    .line 11
    iput v0, p0, Lj0/v;->o:I

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput-object v1, p0, Lj0/v;->k:Landroid/graphics/PointF;

    .line 15
    .line 16
    iget-object v2, p0, Lj0/v;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    iget-object v2, v2, Landroidx/recyclerview/widget/RecyclerView;->j0:Lj0/X;

    .line 19
    .line 20
    const/4 v3, -0x1

    .line 21
    iput v3, v2, Lj0/X;->a:I

    .line 22
    .line 23
    iput-object v1, p0, Lj0/v;->f:Landroid/view/View;

    .line 24
    .line 25
    iput v3, p0, Lj0/v;->a:I

    .line 26
    .line 27
    iput-boolean v0, p0, Lj0/v;->d:Z

    .line 28
    .line 29
    iget-object v0, p0, Lj0/v;->c:Lj0/K;

    .line 30
    .line 31
    iget-object v2, v0, Lj0/K;->e:Lj0/v;

    .line 32
    .line 33
    if-ne v2, p0, :cond_1

    .line 34
    .line 35
    iput-object v1, v0, Lj0/K;->e:Lj0/v;

    .line 36
    .line 37
    :cond_1
    iput-object v1, p0, Lj0/v;->c:Lj0/K;

    .line 38
    .line 39
    iput-object v1, p0, Lj0/v;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 40
    .line 41
    return-void
.end method
