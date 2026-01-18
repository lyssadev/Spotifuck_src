.class public Landroidx/constraintlayout/widget/ConstraintLayout;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# static fields
.field public static u:Ly/s;


# instance fields
.field public final f:Landroid/util/SparseArray;

.field public final g:Ljava/util/ArrayList;

.field public final h:Lv/e;

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:Z

.field public n:I

.field public o:Ly/n;

.field public p:LE/j;

.field public q:I

.field public r:Ljava/util/HashMap;

.field public final s:Landroid/util/SparseArray;

.field public final t:Ly/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:Landroid/util/SparseArray;

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:Ljava/util/ArrayList;

    .line 4
    new-instance p1, Lv/e;

    invoke-direct {p1}, Lv/e;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Lv/e;

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    .line 6
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    const v0, 0x7fffffff

    .line 7
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    .line 8
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Z

    const/16 v0, 0x101

    .line 10
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:I

    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Ly/n;

    .line 12
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:LE/j;

    const/4 v0, -0x1

    .line 13
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->q:I

    .line 14
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->r:Ljava/util/HashMap;

    .line 15
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->s:Landroid/util/SparseArray;

    .line 16
    new-instance v0, Ly/f;

    invoke-direct {v0, p0, p0}, Ly/f;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;)V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->t:Ly/f;

    .line 17
    invoke-virtual {p0, p2, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->i(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 18
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 19
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:Landroid/util/SparseArray;

    .line 20
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:Ljava/util/ArrayList;

    .line 21
    new-instance p1, Lv/e;

    invoke-direct {p1}, Lv/e;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Lv/e;

    const/4 p1, 0x0

    .line 22
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    .line 23
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    const p1, 0x7fffffff

    .line 24
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    .line 25
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    const/4 p1, 0x1

    .line 26
    iput-boolean p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Z

    const/16 p1, 0x101

    .line 27
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:I

    const/4 p1, 0x0

    .line 28
    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Ly/n;

    .line 29
    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:LE/j;

    const/4 p1, -0x1

    .line 30
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->q:I

    .line 31
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->r:Ljava/util/HashMap;

    .line 32
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->s:Landroid/util/SparseArray;

    .line 33
    new-instance p1, Ly/f;

    invoke-direct {p1, p0, p0}, Ly/f;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->t:Ly/f;

    .line 34
    invoke-virtual {p0, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;->i(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static g()Ly/e;
    .locals 8

    .line 1
    new-instance v0, Ly/e;

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 5
    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    iput v1, v0, Ly/e;->a:I

    .line 9
    .line 10
    iput v1, v0, Ly/e;->b:I

    .line 11
    .line 12
    const/high16 v2, -0x40800000    # -1.0f

    .line 13
    .line 14
    iput v2, v0, Ly/e;->c:F

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    iput-boolean v3, v0, Ly/e;->d:Z

    .line 18
    .line 19
    iput v1, v0, Ly/e;->e:I

    .line 20
    .line 21
    iput v1, v0, Ly/e;->f:I

    .line 22
    .line 23
    iput v1, v0, Ly/e;->g:I

    .line 24
    .line 25
    iput v1, v0, Ly/e;->h:I

    .line 26
    .line 27
    iput v1, v0, Ly/e;->i:I

    .line 28
    .line 29
    iput v1, v0, Ly/e;->j:I

    .line 30
    .line 31
    iput v1, v0, Ly/e;->k:I

    .line 32
    .line 33
    iput v1, v0, Ly/e;->l:I

    .line 34
    .line 35
    iput v1, v0, Ly/e;->m:I

    .line 36
    .line 37
    iput v1, v0, Ly/e;->n:I

    .line 38
    .line 39
    iput v1, v0, Ly/e;->o:I

    .line 40
    .line 41
    iput v1, v0, Ly/e;->p:I

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    iput v4, v0, Ly/e;->q:I

    .line 45
    .line 46
    const/4 v5, 0x0

    .line 47
    iput v5, v0, Ly/e;->r:F

    .line 48
    .line 49
    iput v1, v0, Ly/e;->s:I

    .line 50
    .line 51
    iput v1, v0, Ly/e;->t:I

    .line 52
    .line 53
    iput v1, v0, Ly/e;->u:I

    .line 54
    .line 55
    iput v1, v0, Ly/e;->v:I

    .line 56
    .line 57
    const/high16 v5, -0x80000000

    .line 58
    .line 59
    iput v5, v0, Ly/e;->w:I

    .line 60
    .line 61
    iput v5, v0, Ly/e;->x:I

    .line 62
    .line 63
    iput v5, v0, Ly/e;->y:I

    .line 64
    .line 65
    iput v5, v0, Ly/e;->z:I

    .line 66
    .line 67
    iput v5, v0, Ly/e;->A:I

    .line 68
    .line 69
    iput v5, v0, Ly/e;->B:I

    .line 70
    .line 71
    iput v5, v0, Ly/e;->C:I

    .line 72
    .line 73
    iput v4, v0, Ly/e;->D:I

    .line 74
    .line 75
    const/high16 v6, 0x3f000000    # 0.5f

    .line 76
    .line 77
    iput v6, v0, Ly/e;->E:F

    .line 78
    .line 79
    iput v6, v0, Ly/e;->F:F

    .line 80
    .line 81
    const/4 v7, 0x0

    .line 82
    iput-object v7, v0, Ly/e;->G:Ljava/lang/String;

    .line 83
    .line 84
    iput v2, v0, Ly/e;->H:F

    .line 85
    .line 86
    iput v2, v0, Ly/e;->I:F

    .line 87
    .line 88
    iput v4, v0, Ly/e;->J:I

    .line 89
    .line 90
    iput v4, v0, Ly/e;->K:I

    .line 91
    .line 92
    iput v4, v0, Ly/e;->L:I

    .line 93
    .line 94
    iput v4, v0, Ly/e;->M:I

    .line 95
    .line 96
    iput v4, v0, Ly/e;->N:I

    .line 97
    .line 98
    iput v4, v0, Ly/e;->O:I

    .line 99
    .line 100
    iput v4, v0, Ly/e;->P:I

    .line 101
    .line 102
    iput v4, v0, Ly/e;->Q:I

    .line 103
    .line 104
    const/high16 v2, 0x3f800000    # 1.0f

    .line 105
    .line 106
    iput v2, v0, Ly/e;->R:F

    .line 107
    .line 108
    iput v2, v0, Ly/e;->S:F

    .line 109
    .line 110
    iput v1, v0, Ly/e;->T:I

    .line 111
    .line 112
    iput v1, v0, Ly/e;->U:I

    .line 113
    .line 114
    iput v1, v0, Ly/e;->V:I

    .line 115
    .line 116
    iput-boolean v4, v0, Ly/e;->W:Z

    .line 117
    .line 118
    iput-boolean v4, v0, Ly/e;->X:Z

    .line 119
    .line 120
    iput-object v7, v0, Ly/e;->Y:Ljava/lang/String;

    .line 121
    .line 122
    iput v4, v0, Ly/e;->Z:I

    .line 123
    .line 124
    iput-boolean v3, v0, Ly/e;->a0:Z

    .line 125
    .line 126
    iput-boolean v3, v0, Ly/e;->b0:Z

    .line 127
    .line 128
    iput-boolean v4, v0, Ly/e;->c0:Z

    .line 129
    .line 130
    iput-boolean v4, v0, Ly/e;->d0:Z

    .line 131
    .line 132
    iput-boolean v4, v0, Ly/e;->e0:Z

    .line 133
    .line 134
    iput v1, v0, Ly/e;->f0:I

    .line 135
    .line 136
    iput v1, v0, Ly/e;->g0:I

    .line 137
    .line 138
    iput v1, v0, Ly/e;->h0:I

    .line 139
    .line 140
    iput v1, v0, Ly/e;->i0:I

    .line 141
    .line 142
    iput v5, v0, Ly/e;->j0:I

    .line 143
    .line 144
    iput v5, v0, Ly/e;->k0:I

    .line 145
    .line 146
    iput v6, v0, Ly/e;->l0:F

    .line 147
    .line 148
    new-instance v1, Lv/d;

    .line 149
    .line 150
    invoke-direct {v1}, Lv/d;-><init>()V

    .line 151
    .line 152
    .line 153
    iput-object v1, v0, Ly/e;->p0:Lv/d;

    .line 154
    .line 155
    return-object v0
.end method

.method private getPaddingWidth()I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    add-int/2addr v2, v0

    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    add-int/2addr v1, v0

    .line 36
    if-lez v1, :cond_0

    .line 37
    .line 38
    move v2, v1

    .line 39
    :cond_0
    return v2
.end method

.method public static getSharedValues()Ly/s;
    .locals 2

    .line 1
    sget-object v0, Landroidx/constraintlayout/widget/ConstraintLayout;->u:Ly/s;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ly/s;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/util/SparseIntArray;

    .line 11
    .line 12
    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v1, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Landroidx/constraintlayout/widget/ConstraintLayout;->u:Ly/s;

    .line 21
    .line 22
    :cond_0
    sget-object v0, Landroidx/constraintlayout/widget/ConstraintLayout;->u:Ly/s;

    .line 23
    .line 24
    return-object v0
.end method


# virtual methods
.method public final checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    .line 1
    instance-of p1, p1, Ly/e;

    .line 2
    .line 3
    return p1
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:Ljava/util/ArrayList;

    .line 5
    .line 6
    if-eqz v2, :cond_0

    .line 7
    .line 8
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-lez v3, :cond_0

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    :goto_0
    if-ge v4, v3, :cond_0

    .line 16
    .line 17
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    check-cast v5, Ly/c;

    .line 22
    .line 23
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    add-int/lit8 v4, v4, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->isInEditMode()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    int-to-float v2, v2

    .line 43
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    int-to-float v3, v3

    .line 48
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    const/4 v5, 0x0

    .line 53
    :goto_1
    if-ge v5, v4, :cond_3

    .line 54
    .line 55
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    const/16 v8, 0x8

    .line 64
    .line 65
    if-ne v7, v8, :cond_1

    .line 66
    .line 67
    goto/16 :goto_2

    .line 68
    .line 69
    :cond_1
    invoke-virtual {v6}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    if-eqz v6, :cond_2

    .line 74
    .line 75
    instance-of v7, v6, Ljava/lang/String;

    .line 76
    .line 77
    if-eqz v7, :cond_2

    .line 78
    .line 79
    check-cast v6, Ljava/lang/String;

    .line 80
    .line 81
    const-string v7, ","

    .line 82
    .line 83
    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    array-length v7, v6

    .line 88
    const/4 v8, 0x4

    .line 89
    if-ne v7, v8, :cond_2

    .line 90
    .line 91
    aget-object v7, v6, v1

    .line 92
    .line 93
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    const/4 v8, 0x1

    .line 98
    aget-object v8, v6, v8

    .line 99
    .line 100
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    const/4 v9, 0x2

    .line 105
    aget-object v9, v6, v9

    .line 106
    .line 107
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    const/4 v10, 0x3

    .line 112
    aget-object v6, v6, v10

    .line 113
    .line 114
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    int-to-float v7, v7

    .line 119
    const/high16 v10, 0x44870000    # 1080.0f

    .line 120
    .line 121
    div-float/2addr v7, v10

    .line 122
    mul-float v7, v7, v2

    .line 123
    .line 124
    float-to-int v7, v7

    .line 125
    int-to-float v8, v8

    .line 126
    const/high16 v11, 0x44f00000    # 1920.0f

    .line 127
    .line 128
    div-float/2addr v8, v11

    .line 129
    mul-float v8, v8, v3

    .line 130
    .line 131
    float-to-int v8, v8

    .line 132
    int-to-float v9, v9

    .line 133
    div-float/2addr v9, v10

    .line 134
    mul-float v9, v9, v2

    .line 135
    .line 136
    float-to-int v9, v9

    .line 137
    int-to-float v6, v6

    .line 138
    div-float/2addr v6, v11

    .line 139
    mul-float v6, v6, v3

    .line 140
    .line 141
    float-to-int v6, v6

    .line 142
    new-instance v15, Landroid/graphics/Paint;

    .line 143
    .line 144
    invoke-direct {v15}, Landroid/graphics/Paint;-><init>()V

    .line 145
    .line 146
    .line 147
    const/high16 v10, -0x10000

    .line 148
    .line 149
    invoke-virtual {v15, v10}, Landroid/graphics/Paint;->setColor(I)V

    .line 150
    .line 151
    .line 152
    int-to-float v14, v7

    .line 153
    int-to-float v13, v8

    .line 154
    add-int/2addr v7, v9

    .line 155
    int-to-float v7, v7

    .line 156
    move-object/from16 v10, p1

    .line 157
    .line 158
    move v11, v14

    .line 159
    move v12, v13

    .line 160
    move v9, v13

    .line 161
    move v13, v7

    .line 162
    move/from16 v16, v14

    .line 163
    .line 164
    move v14, v9

    .line 165
    move-object/from16 v17, v15

    .line 166
    .line 167
    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 168
    .line 169
    .line 170
    add-int/2addr v8, v6

    .line 171
    int-to-float v6, v8

    .line 172
    move v11, v7

    .line 173
    move v12, v9

    .line 174
    move v14, v6

    .line 175
    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 176
    .line 177
    .line 178
    move v12, v6

    .line 179
    move/from16 v13, v16

    .line 180
    .line 181
    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 182
    .line 183
    .line 184
    move/from16 v11, v16

    .line 185
    .line 186
    move v14, v9

    .line 187
    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 188
    .line 189
    .line 190
    const v8, -0xff0100

    .line 191
    .line 192
    .line 193
    invoke-virtual {v15, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 194
    .line 195
    .line 196
    move v12, v9

    .line 197
    move v13, v7

    .line 198
    move v14, v6

    .line 199
    move-object v8, v15

    .line 200
    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 201
    .line 202
    .line 203
    move v12, v6

    .line 204
    move v14, v9

    .line 205
    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 206
    .line 207
    .line 208
    :cond_2
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 209
    .line 210
    goto/16 :goto_1

    .line 211
    .line 212
    :cond_3
    return-void
.end method

.method public final forceLayout()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Z

    .line 3
    .line 4
    invoke-super {p0}, Landroid/view/ViewGroup;->forceLayout()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/constraintlayout/widget/ConstraintLayout;->g()Ly/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 12

    .line 1
    new-instance v0, Ly/e;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 2
    invoke-direct {v0, v1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v2, -0x1

    .line 3
    iput v2, v0, Ly/e;->a:I

    .line 4
    iput v2, v0, Ly/e;->b:I

    const/high16 v3, -0x40800000    # -1.0f

    .line 5
    iput v3, v0, Ly/e;->c:F

    const/4 v4, 0x1

    .line 6
    iput-boolean v4, v0, Ly/e;->d:Z

    .line 7
    iput v2, v0, Ly/e;->e:I

    .line 8
    iput v2, v0, Ly/e;->f:I

    .line 9
    iput v2, v0, Ly/e;->g:I

    .line 10
    iput v2, v0, Ly/e;->h:I

    .line 11
    iput v2, v0, Ly/e;->i:I

    .line 12
    iput v2, v0, Ly/e;->j:I

    .line 13
    iput v2, v0, Ly/e;->k:I

    .line 14
    iput v2, v0, Ly/e;->l:I

    .line 15
    iput v2, v0, Ly/e;->m:I

    .line 16
    iput v2, v0, Ly/e;->n:I

    .line 17
    iput v2, v0, Ly/e;->o:I

    .line 18
    iput v2, v0, Ly/e;->p:I

    const/4 v5, 0x0

    .line 19
    iput v5, v0, Ly/e;->q:I

    const/4 v6, 0x0

    .line 20
    iput v6, v0, Ly/e;->r:F

    .line 21
    iput v2, v0, Ly/e;->s:I

    .line 22
    iput v2, v0, Ly/e;->t:I

    .line 23
    iput v2, v0, Ly/e;->u:I

    .line 24
    iput v2, v0, Ly/e;->v:I

    const/high16 v7, -0x80000000

    .line 25
    iput v7, v0, Ly/e;->w:I

    .line 26
    iput v7, v0, Ly/e;->x:I

    .line 27
    iput v7, v0, Ly/e;->y:I

    .line 28
    iput v7, v0, Ly/e;->z:I

    .line 29
    iput v7, v0, Ly/e;->A:I

    .line 30
    iput v7, v0, Ly/e;->B:I

    .line 31
    iput v7, v0, Ly/e;->C:I

    .line 32
    iput v5, v0, Ly/e;->D:I

    const/high16 v8, 0x3f000000    # 0.5f

    .line 33
    iput v8, v0, Ly/e;->E:F

    .line 34
    iput v8, v0, Ly/e;->F:F

    const/4 v9, 0x0

    .line 35
    iput-object v9, v0, Ly/e;->G:Ljava/lang/String;

    .line 36
    iput v3, v0, Ly/e;->H:F

    .line 37
    iput v3, v0, Ly/e;->I:F

    .line 38
    iput v5, v0, Ly/e;->J:I

    .line 39
    iput v5, v0, Ly/e;->K:I

    .line 40
    iput v5, v0, Ly/e;->L:I

    .line 41
    iput v5, v0, Ly/e;->M:I

    .line 42
    iput v5, v0, Ly/e;->N:I

    .line 43
    iput v5, v0, Ly/e;->O:I

    .line 44
    iput v5, v0, Ly/e;->P:I

    .line 45
    iput v5, v0, Ly/e;->Q:I

    const/high16 v3, 0x3f800000    # 1.0f

    .line 46
    iput v3, v0, Ly/e;->R:F

    .line 47
    iput v3, v0, Ly/e;->S:F

    .line 48
    iput v2, v0, Ly/e;->T:I

    .line 49
    iput v2, v0, Ly/e;->U:I

    .line 50
    iput v2, v0, Ly/e;->V:I

    .line 51
    iput-boolean v5, v0, Ly/e;->W:Z

    .line 52
    iput-boolean v5, v0, Ly/e;->X:Z

    .line 53
    iput-object v9, v0, Ly/e;->Y:Ljava/lang/String;

    .line 54
    iput v5, v0, Ly/e;->Z:I

    .line 55
    iput-boolean v4, v0, Ly/e;->a0:Z

    .line 56
    iput-boolean v4, v0, Ly/e;->b0:Z

    .line 57
    iput-boolean v5, v0, Ly/e;->c0:Z

    .line 58
    iput-boolean v5, v0, Ly/e;->d0:Z

    .line 59
    iput-boolean v5, v0, Ly/e;->e0:Z

    .line 60
    iput v2, v0, Ly/e;->f0:I

    .line 61
    iput v2, v0, Ly/e;->g0:I

    .line 62
    iput v2, v0, Ly/e;->h0:I

    .line 63
    iput v2, v0, Ly/e;->i0:I

    .line 64
    iput v7, v0, Ly/e;->j0:I

    .line 65
    iput v7, v0, Ly/e;->k0:I

    .line 66
    iput v8, v0, Ly/e;->l0:F

    .line 67
    new-instance v3, Lv/d;

    invoke-direct {v3}, Lv/d;-><init>()V

    iput-object v3, v0, Ly/e;->p0:Lv/d;

    .line 68
    sget-object v3, Ly/r;->b:[I

    invoke-virtual {v1, p1, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 69
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    .line 70
    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v7

    .line 71
    sget-object v8, Ly/d;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v8, v7}, Landroid/util/SparseIntArray;->get(I)I

    move-result v8

    .line 72
    const-string v9, "ConstraintLayout"

    const/4 v10, 0x2

    const/4 v11, -0x2

    packed-switch v8, :pswitch_data_0

    packed-switch v8, :pswitch_data_1

    packed-switch v8, :pswitch_data_2

    goto/16 :goto_1

    .line 73
    :pswitch_0
    iget-boolean v8, v0, Ly/e;->d:Z

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    iput-boolean v7, v0, Ly/e;->d:Z

    goto/16 :goto_1

    .line 74
    :pswitch_1
    iget v8, v0, Ly/e;->Z:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ly/e;->Z:I

    goto/16 :goto_1

    .line 75
    :pswitch_2
    invoke-static {v0, p1, v7, v4}, Ly/n;->g(Ljava/lang/Object;Landroid/content/res/TypedArray;II)V

    goto/16 :goto_1

    .line 76
    :pswitch_3
    invoke-static {v0, p1, v7, v5}, Ly/n;->g(Ljava/lang/Object;Landroid/content/res/TypedArray;II)V

    goto/16 :goto_1

    .line 77
    :pswitch_4
    iget v8, v0, Ly/e;->C:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Ly/e;->C:I

    goto/16 :goto_1

    .line 78
    :pswitch_5
    iget v8, v0, Ly/e;->D:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Ly/e;->D:I

    goto/16 :goto_1

    .line 79
    :pswitch_6
    iget v8, v0, Ly/e;->o:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ly/e;->o:I

    if-ne v8, v2, :cond_0

    .line 80
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ly/e;->o:I

    goto/16 :goto_1

    .line 81
    :pswitch_7
    iget v8, v0, Ly/e;->n:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ly/e;->n:I

    if-ne v8, v2, :cond_0

    .line 82
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ly/e;->n:I

    goto/16 :goto_1

    .line 83
    :pswitch_8
    invoke-virtual {p1, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v0, Ly/e;->Y:Ljava/lang/String;

    goto/16 :goto_1

    .line 84
    :pswitch_9
    iget v8, v0, Ly/e;->U:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v7

    iput v7, v0, Ly/e;->U:I

    goto/16 :goto_1

    .line 85
    :pswitch_a
    iget v8, v0, Ly/e;->T:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v7

    iput v7, v0, Ly/e;->T:I

    goto/16 :goto_1

    .line 86
    :pswitch_b
    invoke-virtual {p1, v7, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ly/e;->K:I

    goto/16 :goto_1

    .line 87
    :pswitch_c
    invoke-virtual {p1, v7, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ly/e;->J:I

    goto/16 :goto_1

    .line 88
    :pswitch_d
    iget v8, v0, Ly/e;->I:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    iput v7, v0, Ly/e;->I:F

    goto/16 :goto_1

    .line 89
    :pswitch_e
    iget v8, v0, Ly/e;->H:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    iput v7, v0, Ly/e;->H:F

    goto/16 :goto_1

    .line 90
    :pswitch_f
    invoke-virtual {p1, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v0, v7}, Ly/n;->h(Ly/e;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 91
    :pswitch_10
    iget v8, v0, Ly/e;->S:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->max(FF)F

    move-result v7

    iput v7, v0, Ly/e;->S:F

    .line 92
    iput v10, v0, Ly/e;->M:I

    goto/16 :goto_1

    .line 93
    :pswitch_11
    :try_start_0
    iget v8, v0, Ly/e;->Q:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v8

    iput v8, v0, Ly/e;->Q:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1

    :catch_0
    nop

    .line 94
    iget v8, v0, Ly/e;->Q:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    if-ne v7, v11, :cond_0

    .line 95
    iput v11, v0, Ly/e;->Q:I

    goto/16 :goto_1

    .line 96
    :pswitch_12
    :try_start_1
    iget v8, v0, Ly/e;->O:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v8

    iput v8, v0, Ly/e;->O:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_1

    :catch_1
    nop

    .line 97
    iget v8, v0, Ly/e;->O:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    if-ne v7, v11, :cond_0

    .line 98
    iput v11, v0, Ly/e;->O:I

    goto/16 :goto_1

    .line 99
    :pswitch_13
    iget v8, v0, Ly/e;->R:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->max(FF)F

    move-result v7

    iput v7, v0, Ly/e;->R:F

    .line 100
    iput v10, v0, Ly/e;->L:I

    goto/16 :goto_1

    .line 101
    :pswitch_14
    :try_start_2
    iget v8, v0, Ly/e;->P:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v8

    iput v8, v0, Ly/e;->P:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_1

    :catch_2
    nop

    .line 102
    iget v8, v0, Ly/e;->P:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    if-ne v7, v11, :cond_0

    .line 103
    iput v11, v0, Ly/e;->P:I

    goto/16 :goto_1

    .line 104
    :pswitch_15
    :try_start_3
    iget v8, v0, Ly/e;->N:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v8

    iput v8, v0, Ly/e;->N:I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto/16 :goto_1

    :catch_3
    nop

    .line 105
    iget v8, v0, Ly/e;->N:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    if-ne v7, v11, :cond_0

    .line 106
    iput v11, v0, Ly/e;->N:I

    goto/16 :goto_1

    .line 107
    :pswitch_16
    invoke-virtual {p1, v7, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ly/e;->M:I

    if-ne v7, v4, :cond_0

    .line 108
    const-string v7, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."

    invoke-static {v9, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_1

    .line 109
    :pswitch_17
    invoke-virtual {p1, v7, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ly/e;->L:I

    if-ne v7, v4, :cond_0

    .line 110
    const-string v7, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."

    invoke-static {v9, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_1

    .line 111
    :pswitch_18
    iget v8, v0, Ly/e;->F:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    iput v7, v0, Ly/e;->F:F

    goto/16 :goto_1

    .line 112
    :pswitch_19
    iget v8, v0, Ly/e;->E:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    iput v7, v0, Ly/e;->E:F

    goto/16 :goto_1

    .line 113
    :pswitch_1a
    iget-boolean v8, v0, Ly/e;->X:Z

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    iput-boolean v7, v0, Ly/e;->X:Z

    goto/16 :goto_1

    .line 114
    :pswitch_1b
    iget-boolean v8, v0, Ly/e;->W:Z

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    iput-boolean v7, v0, Ly/e;->W:Z

    goto/16 :goto_1

    .line 115
    :pswitch_1c
    iget v8, v0, Ly/e;->B:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Ly/e;->B:I

    goto/16 :goto_1

    .line 116
    :pswitch_1d
    iget v8, v0, Ly/e;->A:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Ly/e;->A:I

    goto/16 :goto_1

    .line 117
    :pswitch_1e
    iget v8, v0, Ly/e;->z:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Ly/e;->z:I

    goto/16 :goto_1

    .line 118
    :pswitch_1f
    iget v8, v0, Ly/e;->y:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Ly/e;->y:I

    goto/16 :goto_1

    .line 119
    :pswitch_20
    iget v8, v0, Ly/e;->x:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Ly/e;->x:I

    goto/16 :goto_1

    .line 120
    :pswitch_21
    iget v8, v0, Ly/e;->w:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Ly/e;->w:I

    goto/16 :goto_1

    .line 121
    :pswitch_22
    iget v8, v0, Ly/e;->v:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ly/e;->v:I

    if-ne v8, v2, :cond_0

    .line 122
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ly/e;->v:I

    goto/16 :goto_1

    .line 123
    :pswitch_23
    iget v8, v0, Ly/e;->u:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ly/e;->u:I

    if-ne v8, v2, :cond_0

    .line 124
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ly/e;->u:I

    goto/16 :goto_1

    .line 125
    :pswitch_24
    iget v8, v0, Ly/e;->t:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ly/e;->t:I

    if-ne v8, v2, :cond_0

    .line 126
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ly/e;->t:I

    goto/16 :goto_1

    .line 127
    :pswitch_25
    iget v8, v0, Ly/e;->s:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ly/e;->s:I

    if-ne v8, v2, :cond_0

    .line 128
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ly/e;->s:I

    goto/16 :goto_1

    .line 129
    :pswitch_26
    iget v8, v0, Ly/e;->m:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ly/e;->m:I

    if-ne v8, v2, :cond_0

    .line 130
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ly/e;->m:I

    goto/16 :goto_1

    .line 131
    :pswitch_27
    iget v8, v0, Ly/e;->l:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ly/e;->l:I

    if-ne v8, v2, :cond_0

    .line 132
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ly/e;->l:I

    goto/16 :goto_1

    .line 133
    :pswitch_28
    iget v8, v0, Ly/e;->k:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ly/e;->k:I

    if-ne v8, v2, :cond_0

    .line 134
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ly/e;->k:I

    goto/16 :goto_1

    .line 135
    :pswitch_29
    iget v8, v0, Ly/e;->j:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ly/e;->j:I

    if-ne v8, v2, :cond_0

    .line 136
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ly/e;->j:I

    goto/16 :goto_1

    .line 137
    :pswitch_2a
    iget v8, v0, Ly/e;->i:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ly/e;->i:I

    if-ne v8, v2, :cond_0

    .line 138
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ly/e;->i:I

    goto/16 :goto_1

    .line 139
    :pswitch_2b
    iget v8, v0, Ly/e;->h:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ly/e;->h:I

    if-ne v8, v2, :cond_0

    .line 140
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ly/e;->h:I

    goto/16 :goto_1

    .line 141
    :pswitch_2c
    iget v8, v0, Ly/e;->g:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ly/e;->g:I

    if-ne v8, v2, :cond_0

    .line 142
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ly/e;->g:I

    goto/16 :goto_1

    .line 143
    :pswitch_2d
    iget v8, v0, Ly/e;->f:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ly/e;->f:I

    if-ne v8, v2, :cond_0

    .line 144
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ly/e;->f:I

    goto :goto_1

    .line 145
    :pswitch_2e
    iget v8, v0, Ly/e;->e:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ly/e;->e:I

    if-ne v8, v2, :cond_0

    .line 146
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ly/e;->e:I

    goto :goto_1

    .line 147
    :pswitch_2f
    iget v8, v0, Ly/e;->c:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    iput v7, v0, Ly/e;->c:F

    goto :goto_1

    .line 148
    :pswitch_30
    iget v8, v0, Ly/e;->b:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v7

    iput v7, v0, Ly/e;->b:I

    goto :goto_1

    .line 149
    :pswitch_31
    iget v8, v0, Ly/e;->a:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v7

    iput v7, v0, Ly/e;->a:I

    goto :goto_1

    .line 150
    :pswitch_32
    iget v8, v0, Ly/e;->r:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    const/high16 v8, 0x43b40000    # 360.0f

    rem-float/2addr v7, v8

    iput v7, v0, Ly/e;->r:F

    cmpg-float v9, v7, v6

    if-gez v9, :cond_0

    sub-float v7, v8, v7

    rem-float/2addr v7, v8

    .line 151
    iput v7, v0, Ly/e;->r:F

    goto :goto_1

    .line 152
    :pswitch_33
    iget v8, v0, Ly/e;->q:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Ly/e;->q:I

    goto :goto_1

    .line 153
    :pswitch_34
    iget v8, v0, Ly/e;->p:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ly/e;->p:I

    if-ne v8, v2, :cond_0

    .line 154
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ly/e;->p:I

    goto :goto_1

    .line 155
    :pswitch_35
    iget v8, v0, Ly/e;->V:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ly/e;->V:I

    :cond_0
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 156
    :cond_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 157
    invoke-virtual {v0}, Ly/e;->a()V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2c
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x40
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 8

    .line 158
    new-instance v0, Ly/e;

    .line 159
    invoke-direct {v0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v1, -0x1

    .line 160
    iput v1, v0, Ly/e;->a:I

    .line 161
    iput v1, v0, Ly/e;->b:I

    const/high16 v2, -0x40800000    # -1.0f

    .line 162
    iput v2, v0, Ly/e;->c:F

    const/4 v3, 0x1

    .line 163
    iput-boolean v3, v0, Ly/e;->d:Z

    .line 164
    iput v1, v0, Ly/e;->e:I

    .line 165
    iput v1, v0, Ly/e;->f:I

    .line 166
    iput v1, v0, Ly/e;->g:I

    .line 167
    iput v1, v0, Ly/e;->h:I

    .line 168
    iput v1, v0, Ly/e;->i:I

    .line 169
    iput v1, v0, Ly/e;->j:I

    .line 170
    iput v1, v0, Ly/e;->k:I

    .line 171
    iput v1, v0, Ly/e;->l:I

    .line 172
    iput v1, v0, Ly/e;->m:I

    .line 173
    iput v1, v0, Ly/e;->n:I

    .line 174
    iput v1, v0, Ly/e;->o:I

    .line 175
    iput v1, v0, Ly/e;->p:I

    const/4 v4, 0x0

    .line 176
    iput v4, v0, Ly/e;->q:I

    const/4 v5, 0x0

    .line 177
    iput v5, v0, Ly/e;->r:F

    .line 178
    iput v1, v0, Ly/e;->s:I

    .line 179
    iput v1, v0, Ly/e;->t:I

    .line 180
    iput v1, v0, Ly/e;->u:I

    .line 181
    iput v1, v0, Ly/e;->v:I

    const/high16 v5, -0x80000000

    .line 182
    iput v5, v0, Ly/e;->w:I

    .line 183
    iput v5, v0, Ly/e;->x:I

    .line 184
    iput v5, v0, Ly/e;->y:I

    .line 185
    iput v5, v0, Ly/e;->z:I

    .line 186
    iput v5, v0, Ly/e;->A:I

    .line 187
    iput v5, v0, Ly/e;->B:I

    .line 188
    iput v5, v0, Ly/e;->C:I

    .line 189
    iput v4, v0, Ly/e;->D:I

    const/high16 v6, 0x3f000000    # 0.5f

    .line 190
    iput v6, v0, Ly/e;->E:F

    .line 191
    iput v6, v0, Ly/e;->F:F

    const/4 v7, 0x0

    .line 192
    iput-object v7, v0, Ly/e;->G:Ljava/lang/String;

    .line 193
    iput v2, v0, Ly/e;->H:F

    .line 194
    iput v2, v0, Ly/e;->I:F

    .line 195
    iput v4, v0, Ly/e;->J:I

    .line 196
    iput v4, v0, Ly/e;->K:I

    .line 197
    iput v4, v0, Ly/e;->L:I

    .line 198
    iput v4, v0, Ly/e;->M:I

    .line 199
    iput v4, v0, Ly/e;->N:I

    .line 200
    iput v4, v0, Ly/e;->O:I

    .line 201
    iput v4, v0, Ly/e;->P:I

    .line 202
    iput v4, v0, Ly/e;->Q:I

    const/high16 v2, 0x3f800000    # 1.0f

    .line 203
    iput v2, v0, Ly/e;->R:F

    .line 204
    iput v2, v0, Ly/e;->S:F

    .line 205
    iput v1, v0, Ly/e;->T:I

    .line 206
    iput v1, v0, Ly/e;->U:I

    .line 207
    iput v1, v0, Ly/e;->V:I

    .line 208
    iput-boolean v4, v0, Ly/e;->W:Z

    .line 209
    iput-boolean v4, v0, Ly/e;->X:Z

    .line 210
    iput-object v7, v0, Ly/e;->Y:Ljava/lang/String;

    .line 211
    iput v4, v0, Ly/e;->Z:I

    .line 212
    iput-boolean v3, v0, Ly/e;->a0:Z

    .line 213
    iput-boolean v3, v0, Ly/e;->b0:Z

    .line 214
    iput-boolean v4, v0, Ly/e;->c0:Z

    .line 215
    iput-boolean v4, v0, Ly/e;->d0:Z

    .line 216
    iput-boolean v4, v0, Ly/e;->e0:Z

    .line 217
    iput v1, v0, Ly/e;->f0:I

    .line 218
    iput v1, v0, Ly/e;->g0:I

    .line 219
    iput v1, v0, Ly/e;->h0:I

    .line 220
    iput v1, v0, Ly/e;->i0:I

    .line 221
    iput v5, v0, Ly/e;->j0:I

    .line 222
    iput v5, v0, Ly/e;->k0:I

    .line 223
    iput v6, v0, Ly/e;->l0:F

    .line 224
    new-instance v1, Lv/d;

    invoke-direct {v1}, Lv/d;-><init>()V

    iput-object v1, v0, Ly/e;->p0:Lv/d;

    .line 225
    instance-of v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v1, :cond_0

    .line 226
    move-object v1, p1

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 227
    iget v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 228
    iget v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 229
    iget v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 230
    iget v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 231
    invoke-virtual {v1}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 232
    invoke-virtual {v1}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 233
    :cond_0
    instance-of v1, p1, Ly/e;

    if-nez v1, :cond_1

    goto/16 :goto_0

    .line 234
    :cond_1
    check-cast p1, Ly/e;

    .line 235
    iget v1, p1, Ly/e;->a:I

    iput v1, v0, Ly/e;->a:I

    .line 236
    iget v1, p1, Ly/e;->b:I

    iput v1, v0, Ly/e;->b:I

    .line 237
    iget v1, p1, Ly/e;->c:F

    iput v1, v0, Ly/e;->c:F

    .line 238
    iget-boolean v1, p1, Ly/e;->d:Z

    iput-boolean v1, v0, Ly/e;->d:Z

    .line 239
    iget v1, p1, Ly/e;->e:I

    iput v1, v0, Ly/e;->e:I

    .line 240
    iget v1, p1, Ly/e;->f:I

    iput v1, v0, Ly/e;->f:I

    .line 241
    iget v1, p1, Ly/e;->g:I

    iput v1, v0, Ly/e;->g:I

    .line 242
    iget v1, p1, Ly/e;->h:I

    iput v1, v0, Ly/e;->h:I

    .line 243
    iget v1, p1, Ly/e;->i:I

    iput v1, v0, Ly/e;->i:I

    .line 244
    iget v1, p1, Ly/e;->j:I

    iput v1, v0, Ly/e;->j:I

    .line 245
    iget v1, p1, Ly/e;->k:I

    iput v1, v0, Ly/e;->k:I

    .line 246
    iget v1, p1, Ly/e;->l:I

    iput v1, v0, Ly/e;->l:I

    .line 247
    iget v1, p1, Ly/e;->m:I

    iput v1, v0, Ly/e;->m:I

    .line 248
    iget v1, p1, Ly/e;->n:I

    iput v1, v0, Ly/e;->n:I

    .line 249
    iget v1, p1, Ly/e;->o:I

    iput v1, v0, Ly/e;->o:I

    .line 250
    iget v1, p1, Ly/e;->p:I

    iput v1, v0, Ly/e;->p:I

    .line 251
    iget v1, p1, Ly/e;->q:I

    iput v1, v0, Ly/e;->q:I

    .line 252
    iget v1, p1, Ly/e;->r:F

    iput v1, v0, Ly/e;->r:F

    .line 253
    iget v1, p1, Ly/e;->s:I

    iput v1, v0, Ly/e;->s:I

    .line 254
    iget v1, p1, Ly/e;->t:I

    iput v1, v0, Ly/e;->t:I

    .line 255
    iget v1, p1, Ly/e;->u:I

    iput v1, v0, Ly/e;->u:I

    .line 256
    iget v1, p1, Ly/e;->v:I

    iput v1, v0, Ly/e;->v:I

    .line 257
    iget v1, p1, Ly/e;->w:I

    iput v1, v0, Ly/e;->w:I

    .line 258
    iget v1, p1, Ly/e;->x:I

    iput v1, v0, Ly/e;->x:I

    .line 259
    iget v1, p1, Ly/e;->y:I

    iput v1, v0, Ly/e;->y:I

    .line 260
    iget v1, p1, Ly/e;->z:I

    iput v1, v0, Ly/e;->z:I

    .line 261
    iget v1, p1, Ly/e;->A:I

    iput v1, v0, Ly/e;->A:I

    .line 262
    iget v1, p1, Ly/e;->B:I

    iput v1, v0, Ly/e;->B:I

    .line 263
    iget v1, p1, Ly/e;->C:I

    iput v1, v0, Ly/e;->C:I

    .line 264
    iget v1, p1, Ly/e;->D:I

    iput v1, v0, Ly/e;->D:I

    .line 265
    iget v1, p1, Ly/e;->E:F

    iput v1, v0, Ly/e;->E:F

    .line 266
    iget v1, p1, Ly/e;->F:F

    iput v1, v0, Ly/e;->F:F

    .line 267
    iget-object v1, p1, Ly/e;->G:Ljava/lang/String;

    iput-object v1, v0, Ly/e;->G:Ljava/lang/String;

    .line 268
    iget v1, p1, Ly/e;->H:F

    iput v1, v0, Ly/e;->H:F

    .line 269
    iget v1, p1, Ly/e;->I:F

    iput v1, v0, Ly/e;->I:F

    .line 270
    iget v1, p1, Ly/e;->J:I

    iput v1, v0, Ly/e;->J:I

    .line 271
    iget v1, p1, Ly/e;->K:I

    iput v1, v0, Ly/e;->K:I

    .line 272
    iget-boolean v1, p1, Ly/e;->W:Z

    iput-boolean v1, v0, Ly/e;->W:Z

    .line 273
    iget-boolean v1, p1, Ly/e;->X:Z

    iput-boolean v1, v0, Ly/e;->X:Z

    .line 274
    iget v1, p1, Ly/e;->L:I

    iput v1, v0, Ly/e;->L:I

    .line 275
    iget v1, p1, Ly/e;->M:I

    iput v1, v0, Ly/e;->M:I

    .line 276
    iget v1, p1, Ly/e;->N:I

    iput v1, v0, Ly/e;->N:I

    .line 277
    iget v1, p1, Ly/e;->P:I

    iput v1, v0, Ly/e;->P:I

    .line 278
    iget v1, p1, Ly/e;->O:I

    iput v1, v0, Ly/e;->O:I

    .line 279
    iget v1, p1, Ly/e;->Q:I

    iput v1, v0, Ly/e;->Q:I

    .line 280
    iget v1, p1, Ly/e;->R:F

    iput v1, v0, Ly/e;->R:F

    .line 281
    iget v1, p1, Ly/e;->S:F

    iput v1, v0, Ly/e;->S:F

    .line 282
    iget v1, p1, Ly/e;->T:I

    iput v1, v0, Ly/e;->T:I

    .line 283
    iget v1, p1, Ly/e;->U:I

    iput v1, v0, Ly/e;->U:I

    .line 284
    iget v1, p1, Ly/e;->V:I

    iput v1, v0, Ly/e;->V:I

    .line 285
    iget-boolean v1, p1, Ly/e;->a0:Z

    iput-boolean v1, v0, Ly/e;->a0:Z

    .line 286
    iget-boolean v1, p1, Ly/e;->b0:Z

    iput-boolean v1, v0, Ly/e;->b0:Z

    .line 287
    iget-boolean v1, p1, Ly/e;->c0:Z

    iput-boolean v1, v0, Ly/e;->c0:Z

    .line 288
    iget-boolean v1, p1, Ly/e;->d0:Z

    iput-boolean v1, v0, Ly/e;->d0:Z

    .line 289
    iget v1, p1, Ly/e;->f0:I

    iput v1, v0, Ly/e;->f0:I

    .line 290
    iget v1, p1, Ly/e;->g0:I

    iput v1, v0, Ly/e;->g0:I

    .line 291
    iget v1, p1, Ly/e;->h0:I

    iput v1, v0, Ly/e;->h0:I

    .line 292
    iget v1, p1, Ly/e;->i0:I

    iput v1, v0, Ly/e;->i0:I

    .line 293
    iget v1, p1, Ly/e;->j0:I

    iput v1, v0, Ly/e;->j0:I

    .line 294
    iget v1, p1, Ly/e;->k0:I

    iput v1, v0, Ly/e;->k0:I

    .line 295
    iget v1, p1, Ly/e;->l0:F

    iput v1, v0, Ly/e;->l0:F

    .line 296
    iget-object v1, p1, Ly/e;->Y:Ljava/lang/String;

    iput-object v1, v0, Ly/e;->Y:Ljava/lang/String;

    .line 297
    iget v1, p1, Ly/e;->Z:I

    iput v1, v0, Ly/e;->Z:I

    .line 298
    iget-object p1, p1, Ly/e;->p0:Lv/d;

    iput-object p1, v0, Ly/e;->p0:Lv/d;

    :goto_0
    return-object v0
.end method

.method public getMaxHeight()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public getMaxWidth()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public getMinHeight()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public getMinWidth()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public getOptimizationLevel()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Lv/e;

    .line 2
    .line 3
    iget v0, v0, Lv/e;->D0:I

    .line 4
    .line 5
    return v0
.end method

.method public getSceneString()Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Lv/e;

    .line 7
    .line 8
    iget-object v2, v1, Lv/d;->j:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v3, -0x1

    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eq v2, v3, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iput-object v2, v1, Lv/d;->j:Ljava/lang/String;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const-string v2, "parent"

    .line 35
    .line 36
    iput-object v2, v1, Lv/d;->j:Ljava/lang/String;

    .line 37
    .line 38
    :cond_1
    :goto_0
    iget-object v2, v1, Lv/d;->h0:Ljava/lang/String;

    .line 39
    .line 40
    if-nez v2, :cond_2

    .line 41
    .line 42
    iget-object v2, v1, Lv/d;->j:Ljava/lang/String;

    .line 43
    .line 44
    iput-object v2, v1, Lv/d;->h0:Ljava/lang/String;

    .line 45
    .line 46
    :cond_2
    iget-object v2, v1, Lv/e;->q0:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_5

    .line 57
    .line 58
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    check-cast v4, Lv/d;

    .line 63
    .line 64
    iget-object v5, v4, Lv/d;->f0:Landroid/view/View;

    .line 65
    .line 66
    if-eqz v5, :cond_3

    .line 67
    .line 68
    iget-object v6, v4, Lv/d;->j:Ljava/lang/String;

    .line 69
    .line 70
    if-nez v6, :cond_4

    .line 71
    .line 72
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-eq v5, v3, :cond_4

    .line 77
    .line 78
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-virtual {v6, v5}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    iput-object v5, v4, Lv/d;->j:Ljava/lang/String;

    .line 91
    .line 92
    :cond_4
    iget-object v5, v4, Lv/d;->h0:Ljava/lang/String;

    .line 93
    .line 94
    if-nez v5, :cond_3

    .line 95
    .line 96
    iget-object v5, v4, Lv/d;->j:Ljava/lang/String;

    .line 97
    .line 98
    iput-object v5, v4, Lv/d;->h0:Ljava/lang/String;

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_5
    invoke-virtual {v1, v0}, Lv/e;->n(Ljava/lang/StringBuilder;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    return-object v0
.end method

.method public final h(Landroid/view/View;)Lv/d;
    .locals 1

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Lv/e;

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    if-eqz p1, :cond_2

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    instance-of v0, v0, Ly/e;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Ly/e;

    .line 21
    .line 22
    iget-object p1, p1, Ly/e;->p0:Lv/d;

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    instance-of v0, v0, Ly/e;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Ly/e;

    .line 49
    .line 50
    iget-object p1, p1, Ly/e;->p0:Lv/d;

    .line 51
    .line 52
    return-object p1

    .line 53
    :cond_2
    const/4 p1, 0x0

    .line 54
    return-object p1
.end method

.method public final i(Landroid/util/AttributeSet;I)V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Lv/e;

    .line 2
    .line 3
    iput-object p0, v0, Lv/d;->f0:Landroid/view/View;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->t:Ly/f;

    .line 6
    .line 7
    iput-object v1, v0, Lv/e;->u0:Ly/f;

    .line 8
    .line 9
    iget-object v2, v0, Lv/e;->s0:Lw/e;

    .line 10
    .line 11
    iput-object v1, v2, Lw/e;->f:Ly/f;

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:Landroid/util/SparseArray;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v1, v2, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    iput-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Ly/n;

    .line 24
    .line 25
    if-eqz p1, :cond_8

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sget-object v3, Ly/r;->b:[I

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-virtual {v2, p1, v3, p2, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    const/4 v2, 0x0

    .line 43
    :goto_0
    if-ge v2, p2, :cond_7

    .line 44
    .line 45
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    const/16 v5, 0x10

    .line 50
    .line 51
    if-ne v3, v5, :cond_0

    .line 52
    .line 53
    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    .line 54
    .line 55
    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_0
    const/16 v5, 0x11

    .line 63
    .line 64
    if-ne v3, v5, :cond_1

    .line 65
    .line 66
    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    .line 67
    .line 68
    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_1
    const/16 v5, 0xe

    .line 76
    .line 77
    if-ne v3, v5, :cond_2

    .line 78
    .line 79
    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    .line 80
    .line 81
    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_2
    const/16 v5, 0xf

    .line 89
    .line 90
    if-ne v3, v5, :cond_3

    .line 91
    .line 92
    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    .line 93
    .line 94
    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_3
    const/16 v5, 0x71

    .line 102
    .line 103
    if-ne v3, v5, :cond_4

    .line 104
    .line 105
    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:I

    .line 106
    .line 107
    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:I

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_4
    const/16 v5, 0x38

    .line 115
    .line 116
    if-ne v3, v5, :cond_5

    .line 117
    .line 118
    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-eqz v3, :cond_6

    .line 123
    .line 124
    :try_start_0
    invoke-virtual {p0, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->j(I)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :catch_0
    iput-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:LE/j;

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_5
    const/16 v5, 0x22

    .line 132
    .line 133
    if-ne v3, v5, :cond_6

    .line 134
    .line 135
    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    :try_start_1
    new-instance v5, Ly/n;

    .line 140
    .line 141
    invoke-direct {v5}, Ly/n;-><init>()V

    .line 142
    .line 143
    .line 144
    iput-object v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Ly/n;

    .line 145
    .line 146
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    invoke-virtual {v5, v6, v3}, Ly/n;->e(Landroid/content/Context;I)V
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :catch_1
    iput-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Ly/n;

    .line 155
    .line 156
    :goto_1
    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->q:I

    .line 157
    .line 158
    :cond_6
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 162
    .line 163
    .line 164
    :cond_8
    iget p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:I

    .line 165
    .line 166
    iput p1, v0, Lv/e;->D0:I

    .line 167
    .line 168
    const/16 p1, 0x200

    .line 169
    .line 170
    invoke-virtual {v0, p1}, Lv/e;->W(I)Z

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    sput-boolean p1, Lt/c;->q:Z

    .line 175
    .line 176
    return-void
.end method

.method public final j(I)V
    .locals 12

    .line 1
    new-instance v0, LE/j;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/16 v2, 0x15

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v0, v2, v3}, LE/j;-><init>(IZ)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Landroid/util/SparseArray;

    .line 14
    .line 15
    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v2, v0, LE/j;->g:Ljava/lang/Object;

    .line 19
    .line 20
    new-instance v2, Landroid/util/SparseArray;

    .line 21
    .line 22
    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v2, v0, LE/j;->h:Ljava/lang/Object;

    .line 26
    .line 27
    const-string v2, "Error parsing resource: "

    .line 28
    .line 29
    const-string v3, "ConstraintLayoutStates"

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v4, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    :try_start_0
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    const/4 v6, 0x0

    .line 44
    :goto_0
    const/4 v7, 0x1

    .line 45
    if-eq v5, v7, :cond_6

    .line 46
    .line 47
    const/4 v8, 0x2

    .line 48
    if-eq v5, v8, :cond_0

    .line 49
    .line 50
    goto/16 :goto_3

    .line 51
    .line 52
    :cond_0
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    const/4 v10, 0x4

    .line 61
    const/4 v11, 0x3

    .line 62
    sparse-switch v9, :sswitch_data_0

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :sswitch_0
    const-string v7, "Variant"

    .line 67
    .line 68
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-eqz v5, :cond_1

    .line 73
    .line 74
    const/4 v7, 0x3

    .line 75
    goto :goto_2

    .line 76
    :catch_0
    move-exception v1

    .line 77
    goto :goto_4

    .line 78
    :catch_1
    move-exception v1

    .line 79
    goto/16 :goto_5

    .line 80
    .line 81
    :sswitch_1
    const-string v7, "layoutDescription"

    .line 82
    .line 83
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_1

    .line 88
    .line 89
    const/4 v7, 0x0

    .line 90
    goto :goto_2

    .line 91
    :sswitch_2
    const-string v9, "StateSet"

    .line 92
    .line 93
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-eqz v5, :cond_1

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :sswitch_3
    const-string v7, "State"

    .line 101
    .line 102
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-eqz v5, :cond_1

    .line 107
    .line 108
    const/4 v7, 0x2

    .line 109
    goto :goto_2

    .line 110
    :sswitch_4
    const-string v7, "ConstraintSet"

    .line 111
    .line 112
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    if-eqz v5, :cond_1

    .line 117
    .line 118
    const/4 v7, 0x4

    .line 119
    goto :goto_2

    .line 120
    :cond_1
    :goto_1
    const/4 v7, -0x1

    .line 121
    :goto_2
    if-eq v7, v8, :cond_4

    .line 122
    .line 123
    if-eq v7, v11, :cond_3

    .line 124
    .line 125
    if-eq v7, v10, :cond_2

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_2
    invoke-virtual {v0, v1, v4}, LE/j;->H(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_3
    new-instance v5, Ly/g;

    .line 133
    .line 134
    invoke-direct {v5, v1, v4}, Ly/g;-><init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    .line 135
    .line 136
    .line 137
    if-eqz v6, :cond_5

    .line 138
    .line 139
    iget-object v7, v6, Lm1/A;->c:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v7, Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_4
    new-instance v5, Lm1/A;

    .line 148
    .line 149
    invoke-direct {v5, v1, v4}, Lm1/A;-><init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    .line 150
    .line 151
    .line 152
    iget-object v6, v0, LE/j;->g:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v6, Landroid/util/SparseArray;

    .line 155
    .line 156
    iget v7, v5, Lm1/A;->a:I

    .line 157
    .line 158
    invoke-virtual {v6, v7, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    move-object v6, v5

    .line 162
    :cond_5
    :goto_3
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 163
    .line 164
    .line 165
    move-result v5
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 166
    goto :goto_0

    .line 167
    :goto_4
    new-instance v4, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-static {v3, p1, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 180
    .line 181
    .line 182
    goto :goto_6

    .line 183
    :goto_5
    new-instance v4, Ljava/lang/StringBuilder;

    .line 184
    .line 185
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-static {v3, p1, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 196
    .line 197
    .line 198
    :cond_6
    :goto_6
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:LE/j;

    .line 199
    .line 200
    return-void

    .line 201
    :sswitch_data_0
    .sparse-switch
        -0x50764adb -> :sswitch_4
        0x4c7d471 -> :sswitch_3
        0x526c4e31 -> :sswitch_2
        0x62ce7272 -> :sswitch_1
        0x7155a865 -> :sswitch_0
    .end sparse-switch
.end method

.method public final k(Lv/e;III)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    .line 1
    invoke-static/range {p3 .. p3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    .line 2
    invoke-static/range {p3 .. p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    .line 3
    invoke-static/range {p4 .. p4}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v5

    .line 4
    invoke-static/range {p4 .. p4}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v6

    .line 5
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    const/4 v8, 0x0

    invoke-static {v8, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 6
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    add-int v10, v7, v9

    .line 7
    invoke-direct/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getPaddingWidth()I

    move-result v11

    .line 8
    iget-object v12, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->t:Ly/f;

    iput v7, v12, Ly/f;->b:I

    .line 9
    iput v9, v12, Ly/f;->c:I

    .line 10
    iput v11, v12, Ly/f;->d:I

    .line 11
    iput v10, v12, Ly/f;->e:I

    move/from16 v9, p3

    .line 12
    iput v9, v12, Ly/f;->f:I

    move/from16 v9, p4

    .line 13
    iput v9, v12, Ly/f;->g:I

    .line 14
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingStart()I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    .line 15
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingEnd()I

    move-result v13

    invoke-static {v8, v13}, Ljava/lang/Math;->max(II)I

    move-result v13

    const/4 v14, 0x1

    if-gtz v9, :cond_1

    if-lez v13, :cond_0

    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    goto :goto_1

    .line 17
    :cond_1
    :goto_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v15

    invoke-virtual {v15}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v15

    iget v15, v15, Landroid/content/pm/ApplicationInfo;->flags:I

    const/high16 v16, 0x400000

    and-int v15, v15, v16

    if-eqz v15, :cond_2

    .line 18
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v15

    if-ne v14, v15, :cond_2

    move v9, v13

    :cond_2
    :goto_1
    sub-int/2addr v4, v11

    sub-int/2addr v6, v10

    .line 19
    iget v10, v12, Ly/f;->e:I

    .line 20
    iget v11, v12, Ly/f;->d:I

    .line 21
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v12

    const/high16 v15, 0x40000000    # 2.0f

    const/high16 v13, -0x80000000

    if-eq v3, v13, :cond_6

    if-eqz v3, :cond_4

    if-eq v3, v15, :cond_3

    :goto_2
    const/16 v17, 0x0

    goto :goto_5

    .line 22
    :cond_3
    iget v14, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    sub-int/2addr v14, v11

    invoke-static {v14, v4}, Ljava/lang/Math;->min(II)I

    move-result v14

    move/from16 v17, v14

    const/4 v14, 0x1

    goto :goto_5

    :cond_4
    if-nez v12, :cond_5

    .line 23
    iget v14, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    invoke-static {v8, v14}, Ljava/lang/Math;->max(II)I

    move-result v14

    :goto_3
    move/from16 v17, v14

    :goto_4
    const/4 v14, 0x2

    goto :goto_5

    :cond_5
    const/4 v14, 0x2

    goto :goto_2

    :cond_6
    if-nez v12, :cond_7

    .line 24
    iget v14, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    invoke-static {v8, v14}, Ljava/lang/Math;->max(II)I

    move-result v14

    goto :goto_3

    :cond_7
    move/from16 v17, v4

    goto :goto_4

    :goto_5
    if-eq v5, v13, :cond_b

    if-eqz v5, :cond_9

    if-eq v5, v15, :cond_8

    const/4 v12, 0x1

    :goto_6
    const/4 v13, 0x0

    goto :goto_9

    .line 25
    :cond_8
    iget v12, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    sub-int/2addr v12, v10

    invoke-static {v12, v6}, Ljava/lang/Math;->min(II)I

    move-result v12

    move v13, v12

    const/4 v12, 0x1

    goto :goto_9

    :cond_9
    if-nez v12, :cond_a

    .line 26
    iget v12, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    invoke-static {v8, v12}, Ljava/lang/Math;->max(II)I

    move-result v12

    :goto_7
    move v13, v12

    :goto_8
    const/4 v12, 0x2

    goto :goto_9

    :cond_a
    const/4 v12, 0x2

    goto :goto_6

    :cond_b
    if-nez v12, :cond_c

    .line 27
    iget v12, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    invoke-static {v8, v12}, Ljava/lang/Math;->max(II)I

    move-result v12

    goto :goto_7

    :cond_c
    move v13, v6

    goto :goto_8

    .line 28
    :goto_9
    invoke-virtual/range {p1 .. p1}, Lv/d;->q()I

    move-result v15

    iget-object v8, v1, Lv/e;->s0:Lw/e;

    move/from16 v19, v6

    move/from16 v6, v17

    if-ne v6, v15, :cond_d

    invoke-virtual/range {p1 .. p1}, Lv/d;->k()I

    move-result v15

    if-eq v13, v15, :cond_e

    :cond_d
    const/4 v15, 0x1

    goto :goto_b

    :cond_e
    :goto_a
    const/4 v15, 0x0

    goto :goto_c

    .line 29
    :goto_b
    iput-boolean v15, v8, Lw/e;->c:Z

    goto :goto_a

    .line 30
    :goto_c
    iput v15, v1, Lv/d;->Y:I

    .line 31
    iput v15, v1, Lv/d;->Z:I

    .line 32
    iget v15, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    sub-int/2addr v15, v11

    move-object/from16 v17, v8

    .line 33
    iget-object v8, v1, Lv/d;->C:[I

    move/from16 v20, v4

    const/4 v4, 0x0

    aput v15, v8, v4

    .line 34
    iget v15, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    sub-int/2addr v15, v10

    const/16 v18, 0x1

    .line 35
    aput v15, v8, v18

    .line 36
    iput v4, v1, Lv/d;->b0:I

    .line 37
    iput v4, v1, Lv/d;->c0:I

    .line 38
    invoke-virtual {v1, v14}, Lv/d;->M(I)V

    .line 39
    invoke-virtual {v1, v6}, Lv/d;->O(I)V

    .line 40
    invoke-virtual {v1, v12}, Lv/d;->N(I)V

    .line 41
    invoke-virtual {v1, v13}, Lv/d;->L(I)V

    .line 42
    iget v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    sub-int/2addr v6, v11

    if-gez v6, :cond_f

    .line 43
    iput v4, v1, Lv/d;->b0:I

    goto :goto_d

    .line 44
    :cond_f
    iput v6, v1, Lv/d;->b0:I

    .line 45
    :goto_d
    iget v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    sub-int/2addr v6, v10

    if-gez v6, :cond_10

    .line 46
    iput v4, v1, Lv/d;->c0:I

    goto :goto_e

    .line 47
    :cond_10
    iput v6, v1, Lv/d;->c0:I

    .line 48
    :goto_e
    iput v9, v1, Lv/e;->x0:I

    .line 49
    iput v7, v1, Lv/e;->y0:I

    .line 50
    iget-object v4, v1, Lv/e;->r0:Landroid/support/v4/media/session/t;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    iget-object v6, v1, Lv/e;->u0:Ly/f;

    .line 52
    iget-object v7, v1, Lv/e;->q0:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    .line 53
    invoke-virtual/range {p1 .. p1}, Lv/d;->q()I

    move-result v9

    .line 54
    invoke-virtual/range {p1 .. p1}, Lv/d;->k()I

    move-result v10

    const/16 v11, 0x80

    .line 55
    invoke-static {v2, v11}, Lv/j;->c(II)Z

    move-result v11

    const/16 v12, 0x40

    if-nez v11, :cond_12

    .line 56
    invoke-static {v2, v12}, Lv/j;->c(II)Z

    move-result v2

    if-eqz v2, :cond_11

    goto :goto_f

    :cond_11
    const/4 v2, 0x0

    goto :goto_10

    :cond_12
    :goto_f
    const/4 v2, 0x1

    :goto_10
    const/4 v13, 0x3

    if-eqz v2, :cond_1b

    const/4 v15, 0x0

    :goto_11
    if-ge v15, v7, :cond_1b

    .line 57
    iget-object v12, v1, Lv/e;->q0:Ljava/util/ArrayList;

    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lv/d;

    .line 58
    iget-object v14, v12, Lv/d;->p0:[I

    const/16 v18, 0x0

    .line 59
    aget v0, v14, v18

    if-ne v0, v13, :cond_13

    const/4 v0, 0x1

    :goto_12
    const/16 v22, 0x1

    goto :goto_13

    :cond_13
    const/4 v0, 0x0

    goto :goto_12

    .line 60
    :goto_13
    aget v14, v14, v22

    if-ne v14, v13, :cond_14

    const/4 v14, 0x1

    goto :goto_14

    :cond_14
    const/4 v14, 0x0

    :goto_14
    if-eqz v0, :cond_15

    if-eqz v14, :cond_15

    .line 61
    iget v0, v12, Lv/d;->W:F

    const/4 v14, 0x0

    cmpl-float v0, v0, v14

    if-lez v0, :cond_15

    const/4 v0, 0x1

    goto :goto_15

    :cond_15
    const/4 v0, 0x0

    .line 62
    :goto_15
    invoke-virtual {v12}, Lv/d;->x()Z

    move-result v14

    if-eqz v14, :cond_17

    if-eqz v0, :cond_17

    :cond_16
    :goto_16
    const/high16 v0, 0x40000000    # 2.0f

    const/4 v2, 0x0

    goto :goto_17

    .line 63
    :cond_17
    invoke-virtual {v12}, Lv/d;->y()Z

    move-result v14

    if-eqz v14, :cond_18

    if-eqz v0, :cond_18

    goto :goto_16

    .line 64
    :cond_18
    instance-of v0, v12, Lv/g;

    if-eqz v0, :cond_19

    goto :goto_16

    .line 65
    :cond_19
    invoke-virtual {v12}, Lv/d;->x()Z

    move-result v0

    if-nez v0, :cond_16

    .line 66
    invoke-virtual {v12}, Lv/d;->y()Z

    move-result v0

    if-eqz v0, :cond_1a

    goto :goto_16

    :cond_1a
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v0, p0

    const/16 v12, 0x40

    goto :goto_11

    :cond_1b
    const/high16 v0, 0x40000000    # 2.0f

    :goto_17
    if-ne v3, v0, :cond_1c

    if-eq v5, v0, :cond_1d

    :cond_1c
    if-eqz v11, :cond_1e

    :cond_1d
    const/4 v0, 0x1

    goto :goto_18

    :cond_1e
    const/4 v0, 0x0

    :goto_18
    and-int/2addr v0, v2

    if-eqz v0, :cond_3d

    const/4 v12, 0x0

    .line 67
    aget v14, v8, v12

    move/from16 v12, v20

    .line 68
    invoke-static {v14, v12}, Ljava/lang/Math;->min(II)I

    move-result v12

    const/4 v14, 0x1

    .line 69
    aget v8, v8, v14

    move/from16 v15, v19

    .line 70
    invoke-static {v8, v15}, Ljava/lang/Math;->min(II)I

    move-result v8

    const/high16 v15, 0x40000000    # 2.0f

    if-ne v3, v15, :cond_1f

    .line 71
    invoke-virtual/range {p1 .. p1}, Lv/d;->q()I

    move-result v13

    if-eq v13, v12, :cond_1f

    .line 72
    invoke-virtual {v1, v12}, Lv/d;->O(I)V

    .line 73
    iget-object v12, v1, Lv/e;->s0:Lw/e;

    iput-boolean v14, v12, Lw/e;->b:Z

    :cond_1f
    if-ne v5, v15, :cond_20

    .line 74
    invoke-virtual/range {p1 .. p1}, Lv/d;->k()I

    move-result v12

    if-eq v12, v8, :cond_20

    .line 75
    invoke-virtual {v1, v8}, Lv/d;->L(I)V

    .line 76
    iget-object v8, v1, Lv/e;->s0:Lw/e;

    iput-boolean v14, v8, Lw/e;->b:Z

    :cond_20
    if-ne v3, v15, :cond_36

    if-ne v5, v15, :cond_36

    move-object/from16 v8, v17

    .line 77
    iget-boolean v12, v8, Lw/e;->b:Z

    .line 78
    iget-object v13, v8, Lw/e;->a:Lv/e;

    if-nez v12, :cond_22

    iget-boolean v12, v8, Lw/e;->c:Z

    if-eqz v12, :cond_21

    goto :goto_19

    :cond_21
    const/4 v15, 0x0

    goto :goto_1b

    .line 79
    :cond_22
    :goto_19
    iget-object v12, v13, Lv/e;->q0:Ljava/util/ArrayList;

    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_1a
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_23

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lv/d;

    .line 80
    invoke-virtual {v14}, Lv/d;->h()V

    const/4 v15, 0x0

    .line 81
    iput-boolean v15, v14, Lv/d;->a:Z

    .line 82
    iget-object v2, v14, Lv/d;->d:Lw/k;

    invoke-virtual {v2}, Lw/k;->n()V

    .line 83
    iget-object v2, v14, Lv/d;->e:Lw/m;

    invoke-virtual {v2}, Lw/m;->m()V

    goto :goto_1a

    :cond_23
    const/4 v15, 0x0

    .line 84
    invoke-virtual {v13}, Lv/d;->h()V

    .line 85
    iput-boolean v15, v13, Lv/d;->a:Z

    .line 86
    iget-object v2, v13, Lv/d;->d:Lw/k;

    invoke-virtual {v2}, Lw/k;->n()V

    .line 87
    iget-object v2, v13, Lv/d;->e:Lw/m;

    invoke-virtual {v2}, Lw/m;->m()V

    .line 88
    iput-boolean v15, v8, Lw/e;->c:Z

    .line 89
    :goto_1b
    iget-object v2, v8, Lw/e;->d:Lv/e;

    invoke-virtual {v8, v2}, Lw/e;->b(Lv/e;)V

    .line 90
    iput v15, v13, Lv/d;->Y:I

    .line 91
    iput v15, v13, Lv/d;->Z:I

    .line 92
    invoke-virtual {v13, v15}, Lv/d;->j(I)I

    move-result v2

    const/4 v12, 0x1

    .line 93
    invoke-virtual {v13, v12}, Lv/d;->j(I)I

    move-result v14

    .line 94
    iget-boolean v12, v8, Lw/e;->b:Z

    if-eqz v12, :cond_24

    .line 95
    invoke-virtual {v8}, Lw/e;->c()V

    .line 96
    :cond_24
    invoke-virtual {v13}, Lv/d;->r()I

    move-result v12

    .line 97
    invoke-virtual {v13}, Lv/d;->s()I

    move-result v15

    move/from16 v20, v0

    .line 98
    iget-object v0, v13, Lv/d;->d:Lw/k;

    iget-object v0, v0, Lw/o;->h:Lw/f;

    invoke-virtual {v0, v12}, Lw/f;->d(I)V

    .line 99
    iget-object v0, v13, Lv/d;->e:Lw/m;

    iget-object v0, v0, Lw/o;->h:Lw/f;

    invoke-virtual {v0, v15}, Lw/f;->d(I)V

    .line 100
    invoke-virtual {v8}, Lw/e;->g()V

    .line 101
    iget-object v0, v8, Lw/e;->e:Ljava/util/ArrayList;

    move-object/from16 v22, v6

    const/4 v6, 0x2

    if-eq v2, v6, :cond_27

    if-ne v14, v6, :cond_25

    goto :goto_1c

    :cond_25
    move/from16 v23, v9

    :cond_26
    const/4 v6, 0x1

    goto :goto_1e

    :cond_27
    :goto_1c
    if-eqz v11, :cond_29

    .line 102
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_28
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v23

    if-eqz v23, :cond_29

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v23

    check-cast v23, Lw/o;

    .line 103
    invoke-virtual/range {v23 .. v23}, Lw/o;->k()Z

    move-result v23

    if-nez v23, :cond_28

    const/4 v11, 0x0

    :cond_29
    if-eqz v11, :cond_2a

    const/4 v6, 0x2

    if-ne v2, v6, :cond_2a

    const/4 v6, 0x1

    .line 104
    invoke-virtual {v13, v6}, Lv/d;->M(I)V

    move/from16 v23, v9

    const/4 v6, 0x0

    .line 105
    invoke-virtual {v8, v13, v6}, Lw/e;->d(Lv/e;I)I

    move-result v9

    invoke-virtual {v13, v9}, Lv/d;->O(I)V

    .line 106
    iget-object v6, v13, Lv/d;->d:Lw/k;

    iget-object v6, v6, Lw/o;->e:Lw/g;

    invoke-virtual {v13}, Lv/d;->q()I

    move-result v9

    invoke-virtual {v6, v9}, Lw/g;->d(I)V

    goto :goto_1d

    :cond_2a
    move/from16 v23, v9

    :goto_1d
    if-eqz v11, :cond_26

    const/4 v6, 0x2

    if-ne v14, v6, :cond_26

    const/4 v6, 0x1

    .line 107
    invoke-virtual {v13, v6}, Lv/d;->N(I)V

    .line 108
    invoke-virtual {v8, v13, v6}, Lw/e;->d(Lv/e;I)I

    move-result v9

    invoke-virtual {v13, v9}, Lv/d;->L(I)V

    .line 109
    iget-object v9, v13, Lv/d;->e:Lw/m;

    iget-object v9, v9, Lw/o;->e:Lw/g;

    invoke-virtual {v13}, Lv/d;->k()I

    move-result v11

    invoke-virtual {v9, v11}, Lw/g;->d(I)V

    .line 110
    :goto_1e
    iget-object v9, v13, Lv/d;->p0:[I

    move/from16 v24, v10

    const/4 v11, 0x0

    aget v10, v9, v11

    if-eq v10, v6, :cond_2c

    const/4 v6, 0x4

    if-ne v10, v6, :cond_2b

    goto :goto_1f

    :cond_2b
    const/4 v6, 0x0

    goto :goto_20

    .line 111
    :cond_2c
    :goto_1f
    invoke-virtual {v13}, Lv/d;->q()I

    move-result v6

    add-int/2addr v6, v12

    .line 112
    iget-object v10, v13, Lv/d;->d:Lw/k;

    iget-object v10, v10, Lw/o;->i:Lw/f;

    invoke-virtual {v10, v6}, Lw/f;->d(I)V

    .line 113
    iget-object v10, v13, Lv/d;->d:Lw/k;

    iget-object v10, v10, Lw/o;->e:Lw/g;

    sub-int/2addr v6, v12

    invoke-virtual {v10, v6}, Lw/g;->d(I)V

    .line 114
    invoke-virtual {v8}, Lw/e;->g()V

    const/4 v6, 0x1

    .line 115
    aget v9, v9, v6

    if-eq v9, v6, :cond_2d

    const/4 v6, 0x4

    if-ne v9, v6, :cond_2e

    .line 116
    :cond_2d
    invoke-virtual {v13}, Lv/d;->k()I

    move-result v6

    add-int/2addr v6, v15

    .line 117
    iget-object v9, v13, Lv/d;->e:Lw/m;

    iget-object v9, v9, Lw/o;->i:Lw/f;

    invoke-virtual {v9, v6}, Lw/f;->d(I)V

    .line 118
    iget-object v9, v13, Lv/d;->e:Lw/m;

    iget-object v9, v9, Lw/o;->e:Lw/g;

    sub-int/2addr v6, v15

    invoke-virtual {v9, v6}, Lw/g;->d(I)V

    .line 119
    :cond_2e
    invoke-virtual {v8}, Lw/e;->g()V

    const/4 v6, 0x1

    .line 120
    :goto_20
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_21
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_30

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lw/o;

    .line 121
    iget-object v10, v9, Lw/o;->b:Lv/d;

    if-ne v10, v13, :cond_2f

    iget-boolean v10, v9, Lw/o;->g:Z

    if-nez v10, :cond_2f

    goto :goto_21

    .line 122
    :cond_2f
    invoke-virtual {v9}, Lw/o;->e()V

    goto :goto_21

    .line 123
    :cond_30
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_31
    :goto_22
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_35

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lw/o;

    if-nez v6, :cond_32

    .line 124
    iget-object v9, v8, Lw/o;->b:Lv/d;

    if-ne v9, v13, :cond_32

    goto :goto_22

    .line 125
    :cond_32
    iget-object v9, v8, Lw/o;->h:Lw/f;

    iget-boolean v9, v9, Lw/f;->j:Z

    if-nez v9, :cond_33

    :goto_23
    const/4 v0, 0x0

    goto :goto_24

    .line 126
    :cond_33
    iget-object v9, v8, Lw/o;->i:Lw/f;

    iget-boolean v9, v9, Lw/f;->j:Z

    if-nez v9, :cond_34

    instance-of v9, v8, Lw/i;

    if-nez v9, :cond_34

    goto :goto_23

    .line 127
    :cond_34
    iget-object v9, v8, Lw/o;->e:Lw/g;

    iget-boolean v9, v9, Lw/f;->j:Z

    if-nez v9, :cond_31

    instance-of v9, v8, Lw/c;

    if-nez v9, :cond_31

    instance-of v8, v8, Lw/i;

    if-nez v8, :cond_31

    goto :goto_23

    :cond_35
    const/4 v0, 0x1

    .line 128
    :goto_24
    invoke-virtual {v13, v2}, Lv/d;->M(I)V

    .line 129
    invoke-virtual {v13, v14}, Lv/d;->N(I)V

    move v6, v0

    const/high16 v0, 0x40000000    # 2.0f

    const/4 v2, 0x2

    goto/16 :goto_28

    :cond_36
    move/from16 v20, v0

    move-object/from16 v22, v6

    move/from16 v23, v9

    move/from16 v24, v10

    move-object/from16 v8, v17

    .line 130
    iget-boolean v0, v8, Lw/e;->b:Z

    .line 131
    iget-object v2, v8, Lw/e;->a:Lv/e;

    if-eqz v0, :cond_38

    .line 132
    iget-object v0, v2, Lv/e;->q0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_25
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_37

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lv/d;

    .line 133
    invoke-virtual {v6}, Lv/d;->h()V

    const/4 v9, 0x0

    .line 134
    iput-boolean v9, v6, Lv/d;->a:Z

    .line 135
    iget-object v10, v6, Lv/d;->d:Lw/k;

    iget-object v12, v10, Lw/o;->e:Lw/g;

    iput-boolean v9, v12, Lw/f;->j:Z

    .line 136
    iput-boolean v9, v10, Lw/o;->g:Z

    .line 137
    invoke-virtual {v10}, Lw/k;->n()V

    .line 138
    iget-object v6, v6, Lv/d;->e:Lw/m;

    iget-object v10, v6, Lw/o;->e:Lw/g;

    iput-boolean v9, v10, Lw/f;->j:Z

    .line 139
    iput-boolean v9, v6, Lw/o;->g:Z

    .line 140
    invoke-virtual {v6}, Lw/m;->m()V

    goto :goto_25

    :cond_37
    const/4 v9, 0x0

    .line 141
    invoke-virtual {v2}, Lv/d;->h()V

    .line 142
    iput-boolean v9, v2, Lv/d;->a:Z

    .line 143
    iget-object v0, v2, Lv/d;->d:Lw/k;

    iget-object v6, v0, Lw/o;->e:Lw/g;

    iput-boolean v9, v6, Lw/f;->j:Z

    .line 144
    iput-boolean v9, v0, Lw/o;->g:Z

    .line 145
    invoke-virtual {v0}, Lw/k;->n()V

    .line 146
    iget-object v0, v2, Lv/d;->e:Lw/m;

    iget-object v6, v0, Lw/o;->e:Lw/g;

    iput-boolean v9, v6, Lw/f;->j:Z

    .line 147
    iput-boolean v9, v0, Lw/o;->g:Z

    .line 148
    invoke-virtual {v0}, Lw/m;->m()V

    .line 149
    invoke-virtual {v8}, Lw/e;->c()V

    goto :goto_26

    :cond_38
    const/4 v9, 0x0

    .line 150
    :goto_26
    iget-object v0, v8, Lw/e;->d:Lv/e;

    invoke-virtual {v8, v0}, Lw/e;->b(Lv/e;)V

    .line 151
    iput v9, v2, Lv/d;->Y:I

    .line 152
    iput v9, v2, Lv/d;->Z:I

    .line 153
    iget-object v0, v2, Lv/d;->d:Lw/k;

    iget-object v0, v0, Lw/o;->h:Lw/f;

    invoke-virtual {v0, v9}, Lw/f;->d(I)V

    .line 154
    iget-object v0, v2, Lv/d;->e:Lw/m;

    iget-object v0, v0, Lw/o;->h:Lw/f;

    invoke-virtual {v0, v9}, Lw/f;->d(I)V

    const/high16 v0, 0x40000000    # 2.0f

    if-ne v3, v0, :cond_39

    .line 155
    invoke-virtual {v1, v9, v11}, Lv/e;->T(IZ)Z

    move-result v2

    move v6, v2

    const/4 v2, 0x1

    goto :goto_27

    :cond_39
    const/4 v2, 0x0

    const/4 v6, 0x1

    :goto_27
    if-ne v5, v0, :cond_3a

    const/4 v8, 0x1

    .line 156
    invoke-virtual {v1, v8, v11}, Lv/e;->T(IZ)Z

    move-result v9

    and-int/2addr v6, v9

    add-int/lit8 v2, v2, 0x1

    :cond_3a
    :goto_28
    if-eqz v6, :cond_3e

    if-ne v3, v0, :cond_3b

    const/4 v3, 0x1

    goto :goto_29

    :cond_3b
    const/4 v3, 0x0

    :goto_29
    if-ne v5, v0, :cond_3c

    const/4 v0, 0x1

    goto :goto_2a

    :cond_3c
    const/4 v0, 0x0

    .line 157
    :goto_2a
    invoke-virtual {v1, v3, v0}, Lv/e;->P(ZZ)V

    goto :goto_2b

    :cond_3d
    move/from16 v20, v0

    move-object/from16 v22, v6

    move/from16 v23, v9

    move/from16 v24, v10

    const/4 v2, 0x0

    const/4 v6, 0x0

    :cond_3e
    :goto_2b
    if-eqz v6, :cond_3f

    const/4 v0, 0x2

    if-eq v2, v0, :cond_67

    .line 158
    :cond_3f
    iget v0, v1, Lv/e;->D0:I

    if-lez v7, :cond_4e

    .line 159
    iget-object v2, v1, Lv/e;->q0:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/16 v3, 0x40

    .line 160
    invoke-virtual {v1, v3}, Lv/e;->W(I)Z

    move-result v3

    .line 161
    iget-object v5, v1, Lv/e;->u0:Ly/f;

    const/4 v15, 0x0

    :goto_2c
    if-ge v15, v2, :cond_4c

    .line 162
    iget-object v6, v1, Lv/e;->q0:Ljava/util/ArrayList;

    invoke-virtual {v6, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lv/d;

    .line 163
    instance-of v8, v6, Lv/h;

    if-eqz v8, :cond_40

    :goto_2d
    const/4 v8, 0x3

    const/4 v10, 0x0

    goto/16 :goto_32

    .line 164
    :cond_40
    instance-of v8, v6, Lv/a;

    if-eqz v8, :cond_41

    goto :goto_2d

    .line 165
    :cond_41
    iget-boolean v8, v6, Lv/d;->F:Z

    if-eqz v8, :cond_42

    goto :goto_2d

    :cond_42
    if-eqz v3, :cond_43

    .line 166
    iget-object v8, v6, Lv/d;->d:Lw/k;

    if-eqz v8, :cond_43

    iget-object v9, v6, Lv/d;->e:Lw/m;

    if-eqz v9, :cond_43

    iget-object v8, v8, Lw/o;->e:Lw/g;

    iget-boolean v8, v8, Lw/f;->j:Z

    if-eqz v8, :cond_43

    iget-object v8, v9, Lw/o;->e:Lw/g;

    iget-boolean v8, v8, Lw/f;->j:Z

    if-eqz v8, :cond_43

    goto :goto_2d

    :cond_43
    const/4 v8, 0x0

    .line 167
    invoke-virtual {v6, v8}, Lv/d;->j(I)I

    move-result v9

    const/4 v8, 0x1

    .line 168
    invoke-virtual {v6, v8}, Lv/d;->j(I)I

    move-result v10

    const/4 v11, 0x3

    if-ne v9, v11, :cond_44

    .line 169
    iget v12, v6, Lv/d;->r:I

    if-eq v12, v8, :cond_44

    if-ne v10, v11, :cond_44

    iget v11, v6, Lv/d;->s:I

    if-eq v11, v8, :cond_44

    const/4 v11, 0x1

    goto :goto_2e

    :cond_44
    const/4 v11, 0x0

    :goto_2e
    if-nez v11, :cond_49

    .line 170
    invoke-virtual {v1, v8}, Lv/e;->W(I)Z

    move-result v12

    if-eqz v12, :cond_49

    instance-of v8, v6, Lv/g;

    if-nez v8, :cond_49

    const/4 v8, 0x3

    if-ne v9, v8, :cond_45

    .line 171
    iget v12, v6, Lv/d;->r:I

    if-nez v12, :cond_45

    if-eq v10, v8, :cond_45

    .line 172
    invoke-virtual {v6}, Lv/d;->x()Z

    move-result v12

    if-nez v12, :cond_45

    const/4 v11, 0x1

    :cond_45
    if-ne v10, v8, :cond_46

    .line 173
    iget v12, v6, Lv/d;->s:I

    if-nez v12, :cond_46

    if-eq v9, v8, :cond_46

    .line 174
    invoke-virtual {v6}, Lv/d;->x()Z

    move-result v12

    if-nez v12, :cond_46

    const/4 v11, 0x1

    :cond_46
    if-eq v9, v8, :cond_48

    if-ne v10, v8, :cond_47

    goto :goto_30

    :cond_47
    :goto_2f
    const/4 v10, 0x0

    goto :goto_31

    .line 175
    :cond_48
    :goto_30
    iget v9, v6, Lv/d;->W:F

    const/4 v10, 0x0

    cmpl-float v9, v9, v10

    if-lez v9, :cond_4a

    const/4 v11, 0x1

    goto :goto_31

    :cond_49
    const/4 v8, 0x3

    goto :goto_2f

    :cond_4a
    :goto_31
    if-eqz v11, :cond_4b

    goto :goto_32

    :cond_4b
    const/4 v9, 0x0

    .line 176
    invoke-virtual {v4, v9, v6, v5}, Landroid/support/v4/media/session/t;->z(ILv/d;Ly/f;)Z

    :goto_32
    add-int/lit8 v15, v15, 0x1

    goto/16 :goto_2c

    .line 177
    :cond_4c
    iget-object v2, v5, Ly/f;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 178
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    const/4 v15, 0x0

    :goto_33
    if-ge v15, v3, :cond_4d

    .line 179
    invoke-virtual {v2, v15}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    add-int/lit8 v15, v15, 0x1

    goto :goto_33

    .line 180
    :cond_4d
    iget-object v2, v2, Landroidx/constraintlayout/widget/ConstraintLayout;->g:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_4e

    const/4 v15, 0x0

    :goto_34
    if-ge v15, v3, :cond_4e

    .line 181
    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly/c;

    .line 182
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v15, v15, 0x1

    goto :goto_34

    .line 183
    :cond_4e
    invoke-virtual {v4, v1}, Landroid/support/v4/media/session/t;->H(Lv/e;)V

    .line 184
    iget-object v2, v4, Landroid/support/v4/media/session/t;->d:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    move/from16 v5, v23

    move/from16 v6, v24

    const/4 v15, 0x0

    if-lez v7, :cond_4f

    .line 185
    invoke-virtual {v4, v1, v15, v5, v6}, Landroid/support/v4/media/session/t;->E(Lv/e;III)V

    :cond_4f
    if-lez v3, :cond_66

    .line 186
    iget-object v7, v1, Lv/d;->p0:[I

    aget v8, v7, v15

    const/4 v9, 0x2

    if-ne v8, v9, :cond_50

    const/4 v8, 0x1

    :goto_35
    const/4 v10, 0x1

    goto :goto_36

    :cond_50
    const/4 v8, 0x0

    goto :goto_35

    .line 187
    :goto_36
    aget v7, v7, v10

    if-ne v7, v9, :cond_51

    const/4 v7, 0x1

    goto :goto_37

    :cond_51
    const/4 v7, 0x0

    .line 188
    :goto_37
    invoke-virtual/range {p1 .. p1}, Lv/d;->q()I

    move-result v9

    .line 189
    iget-object v10, v4, Landroid/support/v4/media/session/t;->c:Ljava/lang/Object;

    check-cast v10, Lv/e;

    iget v11, v10, Lv/d;->b0:I

    .line 190
    invoke-static {v9, v11}, Ljava/lang/Math;->max(II)I

    move-result v9

    .line 191
    invoke-virtual/range {p1 .. p1}, Lv/d;->k()I

    move-result v11

    .line 192
    iget v10, v10, Lv/d;->c0:I

    .line 193
    invoke-static {v11, v10}, Ljava/lang/Math;->max(II)I

    move-result v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_38
    if-ge v11, v3, :cond_57

    .line 194
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lv/d;

    .line 195
    instance-of v15, v14, Lv/g;

    if-nez v15, :cond_52

    move/from16 v16, v0

    move-object/from16 v1, v22

    goto/16 :goto_3a

    .line 196
    :cond_52
    invoke-virtual {v14}, Lv/d;->q()I

    move-result v15

    .line 197
    invoke-virtual {v14}, Lv/d;->k()I

    move-result v13

    move/from16 v16, v0

    move-object/from16 v1, v22

    const/4 v0, 0x1

    .line 198
    invoke-virtual {v4, v0, v14, v1}, Landroid/support/v4/media/session/t;->z(ILv/d;Ly/f;)Z

    move-result v19

    or-int v0, v12, v19

    .line 199
    invoke-virtual {v14}, Lv/d;->q()I

    move-result v12

    move/from16 v19, v0

    .line 200
    invoke-virtual {v14}, Lv/d;->k()I

    move-result v0

    if-eq v12, v15, :cond_54

    .line 201
    invoke-virtual {v14, v12}, Lv/d;->O(I)V

    if-eqz v8, :cond_53

    .line 202
    invoke-virtual {v14}, Lv/d;->r()I

    move-result v12

    .line 203
    iget v15, v14, Lv/d;->U:I

    add-int/2addr v12, v15

    if-le v12, v9, :cond_53

    .line 204
    invoke-virtual {v14}, Lv/d;->r()I

    move-result v12

    iget v15, v14, Lv/d;->U:I

    add-int/2addr v12, v15

    const/4 v15, 0x4

    .line 205
    invoke-virtual {v14, v15}, Lv/d;->i(I)Lv/c;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lv/c;->e()I

    move-result v15

    add-int/2addr v15, v12

    .line 206
    invoke-static {v9, v15}, Ljava/lang/Math;->max(II)I

    move-result v9

    :cond_53
    const/4 v15, 0x1

    goto :goto_39

    :cond_54
    move/from16 v15, v19

    :goto_39
    if-eq v0, v13, :cond_56

    .line 207
    invoke-virtual {v14, v0}, Lv/d;->L(I)V

    if-eqz v7, :cond_55

    .line 208
    invoke-virtual {v14}, Lv/d;->s()I

    move-result v0

    .line 209
    iget v12, v14, Lv/d;->V:I

    add-int/2addr v0, v12

    if-le v0, v10, :cond_55

    .line 210
    invoke-virtual {v14}, Lv/d;->s()I

    move-result v0

    iget v12, v14, Lv/d;->V:I

    add-int/2addr v0, v12

    const/4 v12, 0x5

    .line 211
    invoke-virtual {v14, v12}, Lv/d;->i(I)Lv/c;

    move-result-object v12

    invoke-virtual {v12}, Lv/c;->e()I

    move-result v12

    add-int/2addr v12, v0

    .line 212
    invoke-static {v10, v12}, Ljava/lang/Math;->max(II)I

    move-result v10

    :cond_55
    const/4 v15, 0x1

    .line 213
    :cond_56
    check-cast v14, Lv/g;

    .line 214
    iget-boolean v0, v14, Lv/g;->y0:Z

    or-int/2addr v0, v15

    move v12, v0

    :goto_3a
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v22, v1

    move/from16 v0, v16

    const/4 v15, 0x0

    move-object/from16 v1, p1

    goto/16 :goto_38

    :cond_57
    move/from16 v16, v0

    move-object/from16 v1, v22

    const/4 v0, 0x0

    :goto_3b
    const/4 v15, 0x2

    if-ge v0, v15, :cond_65

    const/4 v11, 0x0

    :goto_3c
    if-ge v11, v3, :cond_64

    .line 215
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lv/d;

    .line 216
    instance-of v14, v13, Lv/i;

    if-eqz v14, :cond_58

    instance-of v14, v13, Lv/g;

    if-eqz v14, :cond_5c

    :cond_58
    instance-of v14, v13, Lv/h;

    if-eqz v14, :cond_59

    goto :goto_3d

    .line 217
    :cond_59
    iget v14, v13, Lv/d;->g0:I

    const/16 v15, 0x8

    if-ne v14, v15, :cond_5a

    goto :goto_3d

    :cond_5a
    if-eqz v20, :cond_5b

    .line 218
    iget-object v14, v13, Lv/d;->d:Lw/k;

    iget-object v14, v14, Lw/o;->e:Lw/g;

    iget-boolean v14, v14, Lw/f;->j:Z

    if-eqz v14, :cond_5b

    iget-object v14, v13, Lv/d;->e:Lw/m;

    iget-object v14, v14, Lw/o;->e:Lw/g;

    iget-boolean v14, v14, Lw/f;->j:Z

    if-eqz v14, :cond_5b

    goto :goto_3d

    .line 219
    :cond_5b
    instance-of v14, v13, Lv/g;

    if-eqz v14, :cond_5d

    :cond_5c
    :goto_3d
    move-object/from16 v22, v1

    move-object/from16 v19, v2

    move/from16 v21, v3

    const/4 v14, 0x4

    const/4 v15, 0x5

    goto/16 :goto_42

    .line 220
    :cond_5d
    invoke-virtual {v13}, Lv/d;->q()I

    move-result v14

    .line 221
    invoke-virtual {v13}, Lv/d;->k()I

    move-result v15

    move-object/from16 v19, v2

    .line 222
    iget v2, v13, Lv/d;->a0:I

    move/from16 v21, v3

    const/4 v3, 0x1

    if-ne v0, v3, :cond_5e

    const/4 v3, 0x2

    .line 223
    :cond_5e
    invoke-virtual {v4, v3, v13, v1}, Landroid/support/v4/media/session/t;->z(ILv/d;Ly/f;)Z

    move-result v3

    or-int/2addr v3, v12

    .line 224
    invoke-virtual {v13}, Lv/d;->q()I

    move-result v12

    move-object/from16 v22, v1

    .line 225
    invoke-virtual {v13}, Lv/d;->k()I

    move-result v1

    if-eq v12, v14, :cond_60

    .line 226
    invoke-virtual {v13, v12}, Lv/d;->O(I)V

    if-eqz v8, :cond_5f

    .line 227
    invoke-virtual {v13}, Lv/d;->r()I

    move-result v3

    iget v12, v13, Lv/d;->U:I

    add-int/2addr v3, v12

    if-le v3, v9, :cond_5f

    .line 228
    invoke-virtual {v13}, Lv/d;->r()I

    move-result v3

    iget v12, v13, Lv/d;->U:I

    add-int/2addr v3, v12

    const/4 v14, 0x4

    .line 229
    invoke-virtual {v13, v14}, Lv/d;->i(I)Lv/c;

    move-result-object v12

    invoke-virtual {v12}, Lv/c;->e()I

    move-result v12

    add-int/2addr v12, v3

    .line 230
    invoke-static {v9, v12}, Ljava/lang/Math;->max(II)I

    move-result v9

    goto :goto_3e

    :cond_5f
    const/4 v14, 0x4

    :goto_3e
    const/4 v3, 0x1

    goto :goto_3f

    :cond_60
    const/4 v14, 0x4

    :goto_3f
    if-eq v1, v15, :cond_62

    .line 231
    invoke-virtual {v13, v1}, Lv/d;->L(I)V

    if-eqz v7, :cond_61

    .line 232
    invoke-virtual {v13}, Lv/d;->s()I

    move-result v1

    iget v3, v13, Lv/d;->V:I

    add-int/2addr v1, v3

    if-le v1, v10, :cond_61

    .line 233
    invoke-virtual {v13}, Lv/d;->s()I

    move-result v1

    iget v3, v13, Lv/d;->V:I

    add-int/2addr v1, v3

    const/4 v15, 0x5

    .line 234
    invoke-virtual {v13, v15}, Lv/d;->i(I)Lv/c;

    move-result-object v3

    .line 235
    invoke-virtual {v3}, Lv/c;->e()I

    move-result v3

    add-int/2addr v3, v1

    .line 236
    invoke-static {v10, v3}, Ljava/lang/Math;->max(II)I

    move-result v10

    goto :goto_40

    :cond_61
    const/4 v15, 0x5

    :goto_40
    const/4 v3, 0x1

    goto :goto_41

    :cond_62
    const/4 v15, 0x5

    .line 237
    :goto_41
    iget-boolean v1, v13, Lv/d;->E:Z

    if-eqz v1, :cond_63

    .line 238
    iget v1, v13, Lv/d;->a0:I

    if-eq v2, v1, :cond_63

    const/4 v12, 0x1

    goto :goto_42

    :cond_63
    move v12, v3

    :goto_42
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v2, v19

    move/from16 v3, v21

    move-object/from16 v1, v22

    const/4 v15, 0x2

    goto/16 :goto_3c

    :cond_64
    move-object/from16 v22, v1

    move-object/from16 v19, v2

    move/from16 v21, v3

    const/4 v14, 0x4

    const/4 v15, 0x5

    if-eqz v12, :cond_65

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v1, p1

    move-object/from16 v2, v22

    .line 239
    invoke-virtual {v4, v1, v0, v5, v6}, Landroid/support/v4/media/session/t;->E(Lv/e;III)V

    move-object v1, v2

    move-object/from16 v2, v19

    move/from16 v3, v21

    const/4 v12, 0x0

    goto/16 :goto_3b

    :cond_65
    move-object/from16 v1, p1

    move/from16 v0, v16

    .line 240
    :cond_66
    iput v0, v1, Lv/e;->D0:I

    const/16 v0, 0x200

    .line 241
    invoke-virtual {v1, v0}, Lv/e;->W(I)Z

    move-result v0

    sput-boolean v0, Lt/c;->q:Z

    :cond_67
    return-void
.end method

.method public final l(Lv/d;Ly/e;Landroid/util/SparseArray;II)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {p3, p4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    check-cast p3, Lv/d;

    .line 14
    .line 15
    if-eqz p3, :cond_1

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 20
    .line 21
    .line 22
    move-result-object p4

    .line 23
    instance-of p4, p4, Ly/e;

    .line 24
    .line 25
    if-eqz p4, :cond_1

    .line 26
    .line 27
    const/4 p4, 0x1

    .line 28
    iput-boolean p4, p2, Ly/e;->c0:Z

    .line 29
    .line 30
    const/4 v1, 0x6

    .line 31
    if-ne p5, v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ly/e;

    .line 38
    .line 39
    iput-boolean p4, v0, Ly/e;->c0:Z

    .line 40
    .line 41
    iget-object v0, v0, Ly/e;->p0:Lv/d;

    .line 42
    .line 43
    iput-boolean p4, v0, Lv/d;->E:Z

    .line 44
    .line 45
    :cond_0
    invoke-virtual {p1, v1}, Lv/d;->i(I)Lv/c;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p3, p5}, Lv/d;->i(I)Lv/c;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    iget p5, p2, Ly/e;->D:I

    .line 54
    .line 55
    iget p2, p2, Ly/e;->C:I

    .line 56
    .line 57
    invoke-virtual {v0, p3, p5, p2, p4}, Lv/c;->b(Lv/c;IIZ)Z

    .line 58
    .line 59
    .line 60
    iput-boolean p4, p1, Lv/d;->E:Z

    .line 61
    .line 62
    const/4 p2, 0x3

    .line 63
    invoke-virtual {p1, p2}, Lv/d;->i(I)Lv/c;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-virtual {p2}, Lv/c;->j()V

    .line 68
    .line 69
    .line 70
    const/4 p2, 0x5

    .line 71
    invoke-virtual {p1, p2}, Lv/d;->i(I)Lv/c;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1}, Lv/c;->j()V

    .line 76
    .line 77
    .line 78
    :cond_1
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    const/4 p3, 0x0

    .line 10
    const/4 p4, 0x0

    .line 11
    :goto_0
    if-ge p4, p1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p5

    .line 17
    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ly/e;

    .line 22
    .line 23
    iget-object v1, v0, Ly/e;->p0:Lv/d;

    .line 24
    .line 25
    invoke-virtual {p5}, Landroid/view/View;->getVisibility()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/16 v3, 0x8

    .line 30
    .line 31
    if-ne v2, v3, :cond_0

    .line 32
    .line 33
    iget-boolean v2, v0, Ly/e;->d0:Z

    .line 34
    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    iget-boolean v0, v0, Ly/e;->e0:Z

    .line 38
    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    if-nez p2, :cond_0

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    invoke-virtual {v1}, Lv/d;->r()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-virtual {v1}, Lv/d;->s()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {v1}, Lv/d;->q()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    add-int/2addr v3, v0

    .line 57
    invoke-virtual {v1}, Lv/d;->k()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    add-int/2addr v1, v2

    .line 62
    invoke-virtual {p5, v0, v2, v3, v1}, Landroid/view/View;->layout(IIII)V

    .line 63
    .line 64
    .line 65
    :goto_1
    add-int/lit8 p4, p4, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-lez p2, :cond_2

    .line 75
    .line 76
    :goto_2
    if-ge p3, p2, :cond_2

    .line 77
    .line 78
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p4

    .line 82
    check-cast p4, Ly/c;

    .line 83
    .line 84
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    add-int/lit8 p3, p3, 0x1

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_2
    return-void
.end method

.method public onMeasure(II)V
    .locals 23

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move/from16 v7, p1

    .line 4
    .line 5
    move/from16 v8, p2

    .line 6
    .line 7
    iget-boolean v0, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Z

    .line 8
    .line 9
    iput-boolean v0, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Z

    .line 10
    .line 11
    const/4 v9, 0x0

    .line 12
    const/4 v10, 0x1

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    :goto_0
    if-ge v1, v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Landroid/view/View;->isLayoutRequested()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    iput-boolean v10, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Z

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    :goto_1
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 47
    .line 48
    const/high16 v1, 0x400000

    .line 49
    .line 50
    and-int/2addr v0, v1

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getLayoutDirection()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-ne v10, v0, :cond_2

    .line 58
    .line 59
    const/4 v0, 0x1

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    const/4 v0, 0x0

    .line 62
    :goto_2
    iget-object v11, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Lv/e;

    .line 63
    .line 64
    iput-boolean v0, v11, Lv/e;->v0:Z

    .line 65
    .line 66
    iget-boolean v0, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Z

    .line 67
    .line 68
    if-eqz v0, :cond_4d

    .line 69
    .line 70
    iput-boolean v9, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Z

    .line 71
    .line 72
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    const/4 v1, 0x0

    .line 77
    :goto_3
    if-ge v1, v0, :cond_4

    .line 78
    .line 79
    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v2}, Landroid/view/View;->isLayoutRequested()Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_3

    .line 88
    .line 89
    const/4 v12, 0x1

    .line 90
    goto :goto_4

    .line 91
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_4
    const/4 v12, 0x0

    .line 95
    :goto_4
    if-eqz v12, :cond_4c

    .line 96
    .line 97
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->isInEditMode()Z

    .line 98
    .line 99
    .line 100
    move-result v13

    .line 101
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 102
    .line 103
    .line 104
    move-result v14

    .line 105
    const/4 v0, 0x0

    .line 106
    :goto_5
    if-ge v0, v14, :cond_6

    .line 107
    .line 108
    invoke-virtual {v6, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v6, v1}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(Landroid/view/View;)Lv/d;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    if-nez v1, :cond_5

    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_5
    invoke-virtual {v1}, Lv/d;->C()V

    .line 120
    .line 121
    .line 122
    :goto_6
    add-int/lit8 v0, v0, 0x1

    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_6
    const/4 v0, 0x0

    .line 126
    const/4 v15, -0x1

    .line 127
    if-eqz v13, :cond_f

    .line 128
    .line 129
    const/4 v1, 0x0

    .line 130
    :goto_7
    if-ge v1, v14, :cond_f

    .line 131
    .line 132
    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    instance-of v5, v3, Ljava/lang/String;

    .line 157
    .line 158
    if-eqz v5, :cond_9

    .line 159
    .line 160
    iget-object v5, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->r:Ljava/util/HashMap;

    .line 161
    .line 162
    if-nez v5, :cond_7

    .line 163
    .line 164
    new-instance v5, Ljava/util/HashMap;

    .line 165
    .line 166
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 167
    .line 168
    .line 169
    iput-object v5, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->r:Ljava/util/HashMap;

    .line 170
    .line 171
    :cond_7
    const-string v5, "/"

    .line 172
    .line 173
    invoke-virtual {v3, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    if-eq v5, v15, :cond_8

    .line 178
    .line 179
    add-int/lit8 v5, v5, 0x1

    .line 180
    .line 181
    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    goto :goto_8

    .line 186
    :cond_8
    move-object v5, v3

    .line 187
    :goto_8
    iget-object v10, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->r:Ljava/util/HashMap;

    .line 188
    .line 189
    invoke-virtual {v10, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    :cond_9
    const/16 v4, 0x2f

    .line 193
    .line 194
    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(I)I

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    if-eq v4, v15, :cond_a

    .line 199
    .line 200
    add-int/lit8 v4, v4, 0x1

    .line 201
    .line 202
    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    :cond_a
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    if-nez v2, :cond_b

    .line 211
    .line 212
    :goto_9
    move-object v2, v11

    .line 213
    goto :goto_a

    .line 214
    :cond_b
    iget-object v4, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->f:Landroid/util/SparseArray;

    .line 215
    .line 216
    invoke-virtual {v4, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    check-cast v4, Landroid/view/View;

    .line 221
    .line 222
    if-nez v4, :cond_c

    .line 223
    .line 224
    invoke-virtual {v6, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    if-eqz v4, :cond_c

    .line 229
    .line 230
    if-eq v4, v6, :cond_c

    .line 231
    .line 232
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    if-ne v2, v6, :cond_c

    .line 237
    .line 238
    invoke-virtual {v6, v4}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewAdded(Landroid/view/View;)V

    .line 239
    .line 240
    .line 241
    :cond_c
    if-ne v4, v6, :cond_d

    .line 242
    .line 243
    goto :goto_9

    .line 244
    :cond_d
    if-nez v4, :cond_e

    .line 245
    .line 246
    move-object v2, v0

    .line 247
    goto :goto_a

    .line 248
    :cond_e
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    check-cast v2, Ly/e;

    .line 253
    .line 254
    iget-object v2, v2, Ly/e;->p0:Lv/d;

    .line 255
    .line 256
    :goto_a
    iput-object v3, v2, Lv/d;->h0:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 257
    .line 258
    :catch_0
    add-int/lit8 v1, v1, 0x1

    .line 259
    .line 260
    const/4 v10, 0x1

    .line 261
    goto/16 :goto_7

    .line 262
    .line 263
    :cond_f
    iget v1, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->q:I

    .line 264
    .line 265
    if-eq v1, v15, :cond_10

    .line 266
    .line 267
    const/4 v1, 0x0

    .line 268
    :goto_b
    if-ge v1, v14, :cond_10

    .line 269
    .line 270
    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 275
    .line 276
    .line 277
    add-int/lit8 v1, v1, 0x1

    .line 278
    .line 279
    goto :goto_b

    .line 280
    :cond_10
    iget-object v1, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Ly/n;

    .line 281
    .line 282
    if-eqz v1, :cond_11

    .line 283
    .line 284
    invoke-virtual {v1, v6}, Ly/n;->a(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 285
    .line 286
    .line 287
    :cond_11
    iget-object v1, v11, Lv/e;->q0:Ljava/util/ArrayList;

    .line 288
    .line 289
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 290
    .line 291
    .line 292
    iget-object v1, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->g:Ljava/util/ArrayList;

    .line 293
    .line 294
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    if-lez v2, :cond_19

    .line 299
    .line 300
    const/4 v3, 0x0

    .line 301
    :goto_c
    if-ge v3, v2, :cond_19

    .line 302
    .line 303
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    check-cast v4, Ly/c;

    .line 308
    .line 309
    invoke-virtual {v4}, Landroid/view/View;->isInEditMode()Z

    .line 310
    .line 311
    .line 312
    move-result v5

    .line 313
    if-eqz v5, :cond_12

    .line 314
    .line 315
    iget-object v5, v4, Ly/c;->j:Ljava/lang/String;

    .line 316
    .line 317
    invoke-virtual {v4, v5}, Ly/c;->setIds(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    :cond_12
    iget-object v5, v4, Ly/c;->i:Lv/i;

    .line 321
    .line 322
    if-nez v5, :cond_13

    .line 323
    .line 324
    move-object/from16 v17, v1

    .line 325
    .line 326
    goto/16 :goto_10

    .line 327
    .line 328
    :cond_13
    iput v9, v5, Lv/i;->r0:I

    .line 329
    .line 330
    iget-object v5, v5, Lv/i;->q0:[Lv/d;

    .line 331
    .line 332
    invoke-static {v5, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    const/4 v5, 0x0

    .line 336
    :goto_d
    iget v0, v4, Ly/c;->g:I

    .line 337
    .line 338
    if-ge v5, v0, :cond_18

    .line 339
    .line 340
    iget-object v0, v4, Ly/c;->f:[I

    .line 341
    .line 342
    aget v0, v0, v5

    .line 343
    .line 344
    iget-object v15, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->f:Landroid/util/SparseArray;

    .line 345
    .line 346
    invoke-virtual {v15, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v15

    .line 350
    check-cast v15, Landroid/view/View;

    .line 351
    .line 352
    if-nez v15, :cond_14

    .line 353
    .line 354
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    iget-object v9, v4, Ly/c;->l:Ljava/util/HashMap;

    .line 359
    .line 360
    invoke-virtual {v9, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    check-cast v0, Ljava/lang/String;

    .line 365
    .line 366
    invoke-virtual {v4, v6, v0}, Ly/c;->f(Landroidx/constraintlayout/widget/ConstraintLayout;Ljava/lang/String;)I

    .line 367
    .line 368
    .line 369
    move-result v10

    .line 370
    if-eqz v10, :cond_14

    .line 371
    .line 372
    iget-object v15, v4, Ly/c;->f:[I

    .line 373
    .line 374
    aput v10, v15, v5

    .line 375
    .line 376
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 377
    .line 378
    .line 379
    move-result-object v15

    .line 380
    invoke-virtual {v9, v15, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    iget-object v0, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->f:Landroid/util/SparseArray;

    .line 384
    .line 385
    invoke-virtual {v0, v10}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    move-object v15, v0

    .line 390
    check-cast v15, Landroid/view/View;

    .line 391
    .line 392
    :cond_14
    if-eqz v15, :cond_17

    .line 393
    .line 394
    iget-object v0, v4, Ly/c;->i:Lv/i;

    .line 395
    .line 396
    invoke-virtual {v6, v15}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(Landroid/view/View;)Lv/d;

    .line 397
    .line 398
    .line 399
    move-result-object v9

    .line 400
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    if-eq v9, v0, :cond_17

    .line 404
    .line 405
    if-nez v9, :cond_15

    .line 406
    .line 407
    goto :goto_e

    .line 408
    :cond_15
    iget v10, v0, Lv/i;->r0:I

    .line 409
    .line 410
    const/4 v15, 0x1

    .line 411
    add-int/2addr v10, v15

    .line 412
    iget-object v15, v0, Lv/i;->q0:[Lv/d;

    .line 413
    .line 414
    move-object/from16 v17, v1

    .line 415
    .line 416
    array-length v1, v15

    .line 417
    if-le v10, v1, :cond_16

    .line 418
    .line 419
    array-length v1, v15

    .line 420
    const/4 v10, 0x2

    .line 421
    mul-int/lit8 v1, v1, 0x2

    .line 422
    .line 423
    invoke-static {v15, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    check-cast v1, [Lv/d;

    .line 428
    .line 429
    iput-object v1, v0, Lv/i;->q0:[Lv/d;

    .line 430
    .line 431
    :cond_16
    iget-object v1, v0, Lv/i;->q0:[Lv/d;

    .line 432
    .line 433
    iget v10, v0, Lv/i;->r0:I

    .line 434
    .line 435
    aput-object v9, v1, v10

    .line 436
    .line 437
    const/4 v1, 0x1

    .line 438
    add-int/2addr v10, v1

    .line 439
    iput v10, v0, Lv/i;->r0:I

    .line 440
    .line 441
    goto :goto_f

    .line 442
    :cond_17
    :goto_e
    move-object/from16 v17, v1

    .line 443
    .line 444
    :goto_f
    add-int/lit8 v5, v5, 0x1

    .line 445
    .line 446
    move-object/from16 v1, v17

    .line 447
    .line 448
    const/4 v9, 0x0

    .line 449
    const/4 v15, -0x1

    .line 450
    goto :goto_d

    .line 451
    :cond_18
    move-object/from16 v17, v1

    .line 452
    .line 453
    iget-object v0, v4, Ly/c;->i:Lv/i;

    .line 454
    .line 455
    invoke-virtual {v0}, Lv/i;->S()V

    .line 456
    .line 457
    .line 458
    :goto_10
    add-int/lit8 v3, v3, 0x1

    .line 459
    .line 460
    move-object/from16 v1, v17

    .line 461
    .line 462
    const/4 v0, 0x0

    .line 463
    const/4 v9, 0x0

    .line 464
    const/4 v15, -0x1

    .line 465
    goto/16 :goto_c

    .line 466
    .line 467
    :cond_19
    const/4 v0, 0x0

    .line 468
    :goto_11
    if-ge v0, v14, :cond_1a

    .line 469
    .line 470
    invoke-virtual {v6, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 471
    .line 472
    .line 473
    add-int/lit8 v0, v0, 0x1

    .line 474
    .line 475
    goto :goto_11

    .line 476
    :cond_1a
    iget-object v9, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->s:Landroid/util/SparseArray;

    .line 477
    .line 478
    invoke-virtual {v9}, Landroid/util/SparseArray;->clear()V

    .line 479
    .line 480
    .line 481
    const/4 v0, 0x0

    .line 482
    invoke-virtual {v9, v0, v11}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getId()I

    .line 486
    .line 487
    .line 488
    move-result v0

    .line 489
    invoke-virtual {v9, v0, v11}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 490
    .line 491
    .line 492
    const/4 v0, 0x0

    .line 493
    :goto_12
    if-ge v0, v14, :cond_1b

    .line 494
    .line 495
    invoke-virtual {v6, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 496
    .line 497
    .line 498
    move-result-object v1

    .line 499
    invoke-virtual {v6, v1}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(Landroid/view/View;)Lv/d;

    .line 500
    .line 501
    .line 502
    move-result-object v2

    .line 503
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 504
    .line 505
    .line 506
    move-result v1

    .line 507
    invoke-virtual {v9, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 508
    .line 509
    .line 510
    add-int/lit8 v0, v0, 0x1

    .line 511
    .line 512
    goto :goto_12

    .line 513
    :cond_1b
    const/4 v10, 0x0

    .line 514
    :goto_13
    if-ge v10, v14, :cond_4c

    .line 515
    .line 516
    invoke-virtual {v6, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    invoke-virtual {v6, v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(Landroid/view/View;)Lv/d;

    .line 521
    .line 522
    .line 523
    move-result-object v15

    .line 524
    if-nez v15, :cond_1d

    .line 525
    .line 526
    :cond_1c
    :goto_14
    move/from16 v16, v14

    .line 527
    .line 528
    const/4 v0, 0x2

    .line 529
    const/4 v3, 0x1

    .line 530
    const/4 v4, -0x1

    .line 531
    goto/16 :goto_2a

    .line 532
    .line 533
    :cond_1d
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    move-object v5, v1

    .line 538
    check-cast v5, Ly/e;

    .line 539
    .line 540
    iget-object v1, v11, Lv/e;->q0:Ljava/util/ArrayList;

    .line 541
    .line 542
    invoke-virtual {v1, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 543
    .line 544
    .line 545
    iget-object v1, v15, Lv/d;->T:Lv/d;

    .line 546
    .line 547
    if-eqz v1, :cond_1e

    .line 548
    .line 549
    check-cast v1, Lv/e;

    .line 550
    .line 551
    iget-object v1, v1, Lv/e;->q0:Ljava/util/ArrayList;

    .line 552
    .line 553
    invoke-virtual {v1, v15}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    invoke-virtual {v15}, Lv/d;->C()V

    .line 557
    .line 558
    .line 559
    :cond_1e
    iput-object v11, v15, Lv/d;->T:Lv/d;

    .line 560
    .line 561
    invoke-virtual {v5}, Ly/e;->a()V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 565
    .line 566
    .line 567
    move-result v1

    .line 568
    iput v1, v15, Lv/d;->g0:I

    .line 569
    .line 570
    iput-object v0, v15, Lv/d;->f0:Landroid/view/View;

    .line 571
    .line 572
    instance-of v1, v0, Ly/c;

    .line 573
    .line 574
    if-eqz v1, :cond_1f

    .line 575
    .line 576
    check-cast v0, Ly/c;

    .line 577
    .line 578
    iget-boolean v1, v11, Lv/e;->v0:Z

    .line 579
    .line 580
    invoke-virtual {v0, v15, v1}, Ly/c;->h(Lv/d;Z)V

    .line 581
    .line 582
    .line 583
    :cond_1f
    iget-boolean v0, v5, Ly/e;->d0:Z

    .line 584
    .line 585
    if-eqz v0, :cond_23

    .line 586
    .line 587
    check-cast v15, Lv/h;

    .line 588
    .line 589
    iget v0, v5, Ly/e;->m0:I

    .line 590
    .line 591
    iget v1, v5, Ly/e;->n0:I

    .line 592
    .line 593
    iget v2, v5, Ly/e;->o0:F

    .line 594
    .line 595
    const/high16 v3, -0x40800000    # -1.0f

    .line 596
    .line 597
    cmpl-float v4, v2, v3

    .line 598
    .line 599
    if-eqz v4, :cond_21

    .line 600
    .line 601
    if-lez v4, :cond_20

    .line 602
    .line 603
    iput v2, v15, Lv/h;->q0:F

    .line 604
    .line 605
    const/4 v2, -0x1

    .line 606
    iput v2, v15, Lv/h;->r0:I

    .line 607
    .line 608
    iput v2, v15, Lv/h;->s0:I

    .line 609
    .line 610
    goto :goto_14

    .line 611
    :cond_20
    const/4 v2, -0x1

    .line 612
    goto :goto_14

    .line 613
    :cond_21
    const/4 v2, -0x1

    .line 614
    if-eq v0, v2, :cond_22

    .line 615
    .line 616
    if-le v0, v2, :cond_1c

    .line 617
    .line 618
    iput v3, v15, Lv/h;->q0:F

    .line 619
    .line 620
    iput v0, v15, Lv/h;->r0:I

    .line 621
    .line 622
    iput v2, v15, Lv/h;->s0:I

    .line 623
    .line 624
    goto :goto_14

    .line 625
    :cond_22
    if-eq v1, v2, :cond_1c

    .line 626
    .line 627
    if-le v1, v2, :cond_1c

    .line 628
    .line 629
    iput v3, v15, Lv/h;->q0:F

    .line 630
    .line 631
    iput v2, v15, Lv/h;->r0:I

    .line 632
    .line 633
    iput v1, v15, Lv/h;->s0:I

    .line 634
    .line 635
    goto :goto_14

    .line 636
    :cond_23
    iget v0, v5, Ly/e;->f0:I

    .line 637
    .line 638
    iget v1, v5, Ly/e;->g0:I

    .line 639
    .line 640
    iget v2, v5, Ly/e;->h0:I

    .line 641
    .line 642
    iget v3, v5, Ly/e;->i0:I

    .line 643
    .line 644
    iget v4, v5, Ly/e;->j0:I

    .line 645
    .line 646
    move/from16 v16, v14

    .line 647
    .line 648
    iget v14, v5, Ly/e;->k0:I

    .line 649
    .line 650
    iget v7, v5, Ly/e;->l0:F

    .line 651
    .line 652
    iget v8, v5, Ly/e;->p:I

    .line 653
    .line 654
    const/4 v6, -0x1

    .line 655
    if-eq v8, v6, :cond_25

    .line 656
    .line 657
    invoke-virtual {v9, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    move-object/from16 v22, v0

    .line 662
    .line 663
    check-cast v22, Lv/d;

    .line 664
    .line 665
    if-eqz v22, :cond_24

    .line 666
    .line 667
    iget v0, v5, Ly/e;->r:F

    .line 668
    .line 669
    iget v1, v5, Ly/e;->q:I

    .line 670
    .line 671
    const/16 v19, 0x7

    .line 672
    .line 673
    const/16 v21, 0x0

    .line 674
    .line 675
    move-object/from16 v17, v15

    .line 676
    .line 677
    move/from16 v18, v19

    .line 678
    .line 679
    move/from16 v20, v1

    .line 680
    .line 681
    invoke-virtual/range {v17 .. v22}, Lv/d;->v(IIIILv/d;)V

    .line 682
    .line 683
    .line 684
    iput v0, v15, Lv/d;->D:F

    .line 685
    .line 686
    :cond_24
    move-object v14, v5

    .line 687
    goto/16 :goto_1c

    .line 688
    .line 689
    :cond_25
    if-eq v0, v6, :cond_27

    .line 690
    .line 691
    invoke-virtual {v9, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    move-object/from16 v22, v0

    .line 696
    .line 697
    check-cast v22, Lv/d;

    .line 698
    .line 699
    if-eqz v22, :cond_26

    .line 700
    .line 701
    iget v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 702
    .line 703
    move-object/from16 v17, v15

    .line 704
    .line 705
    const/4 v1, 0x2

    .line 706
    move/from16 v18, v1

    .line 707
    .line 708
    move/from16 v19, v1

    .line 709
    .line 710
    move/from16 v20, v0

    .line 711
    .line 712
    move/from16 v21, v4

    .line 713
    .line 714
    invoke-virtual/range {v17 .. v22}, Lv/d;->v(IIIILv/d;)V

    .line 715
    .line 716
    .line 717
    :cond_26
    :goto_15
    const/4 v0, -0x1

    .line 718
    goto :goto_16

    .line 719
    :cond_27
    const/4 v0, -0x1

    .line 720
    if-eq v1, v0, :cond_28

    .line 721
    .line 722
    invoke-virtual {v9, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    move-result-object v0

    .line 726
    move-object/from16 v22, v0

    .line 727
    .line 728
    check-cast v22, Lv/d;

    .line 729
    .line 730
    if-eqz v22, :cond_26

    .line 731
    .line 732
    iget v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 733
    .line 734
    move-object/from16 v17, v15

    .line 735
    .line 736
    const/4 v1, 0x2

    .line 737
    move/from16 v18, v1

    .line 738
    .line 739
    const/4 v1, 0x4

    .line 740
    move/from16 v19, v1

    .line 741
    .line 742
    move/from16 v20, v0

    .line 743
    .line 744
    move/from16 v21, v4

    .line 745
    .line 746
    invoke-virtual/range {v17 .. v22}, Lv/d;->v(IIIILv/d;)V

    .line 747
    .line 748
    .line 749
    goto :goto_15

    .line 750
    :cond_28
    :goto_16
    if-eq v2, v0, :cond_29

    .line 751
    .line 752
    invoke-virtual {v9, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object v0

    .line 756
    move-object/from16 v22, v0

    .line 757
    .line 758
    check-cast v22, Lv/d;

    .line 759
    .line 760
    if-eqz v22, :cond_2a

    .line 761
    .line 762
    iget v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 763
    .line 764
    move-object/from16 v17, v15

    .line 765
    .line 766
    const/4 v1, 0x4

    .line 767
    move/from16 v18, v1

    .line 768
    .line 769
    const/4 v1, 0x2

    .line 770
    move/from16 v19, v1

    .line 771
    .line 772
    move/from16 v20, v0

    .line 773
    .line 774
    move/from16 v21, v14

    .line 775
    .line 776
    invoke-virtual/range {v17 .. v22}, Lv/d;->v(IIIILv/d;)V

    .line 777
    .line 778
    .line 779
    goto :goto_17

    .line 780
    :cond_29
    if-eq v3, v0, :cond_2a

    .line 781
    .line 782
    invoke-virtual {v9, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 783
    .line 784
    .line 785
    move-result-object v0

    .line 786
    move-object/from16 v22, v0

    .line 787
    .line 788
    check-cast v22, Lv/d;

    .line 789
    .line 790
    if-eqz v22, :cond_2a

    .line 791
    .line 792
    iget v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 793
    .line 794
    move-object/from16 v17, v15

    .line 795
    .line 796
    const/4 v1, 0x4

    .line 797
    move/from16 v18, v1

    .line 798
    .line 799
    move/from16 v19, v1

    .line 800
    .line 801
    move/from16 v20, v0

    .line 802
    .line 803
    move/from16 v21, v14

    .line 804
    .line 805
    invoke-virtual/range {v17 .. v22}, Lv/d;->v(IIIILv/d;)V

    .line 806
    .line 807
    .line 808
    :cond_2a
    :goto_17
    iget v0, v5, Ly/e;->i:I

    .line 809
    .line 810
    const/4 v1, -0x1

    .line 811
    if-eq v0, v1, :cond_2b

    .line 812
    .line 813
    invoke-virtual {v9, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    move-object/from16 v22, v0

    .line 818
    .line 819
    check-cast v22, Lv/d;

    .line 820
    .line 821
    if-eqz v22, :cond_2c

    .line 822
    .line 823
    iget v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 824
    .line 825
    iget v1, v5, Ly/e;->x:I

    .line 826
    .line 827
    move-object/from16 v17, v15

    .line 828
    .line 829
    const/4 v2, 0x3

    .line 830
    move/from16 v18, v2

    .line 831
    .line 832
    move/from16 v19, v2

    .line 833
    .line 834
    move/from16 v20, v0

    .line 835
    .line 836
    move/from16 v21, v1

    .line 837
    .line 838
    invoke-virtual/range {v17 .. v22}, Lv/d;->v(IIIILv/d;)V

    .line 839
    .line 840
    .line 841
    goto :goto_18

    .line 842
    :cond_2b
    iget v0, v5, Ly/e;->j:I

    .line 843
    .line 844
    const/4 v1, -0x1

    .line 845
    if-eq v0, v1, :cond_2c

    .line 846
    .line 847
    invoke-virtual {v9, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    move-result-object v0

    .line 851
    move-object/from16 v22, v0

    .line 852
    .line 853
    check-cast v22, Lv/d;

    .line 854
    .line 855
    if-eqz v22, :cond_2c

    .line 856
    .line 857
    iget v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 858
    .line 859
    iget v1, v5, Ly/e;->x:I

    .line 860
    .line 861
    move-object/from16 v17, v15

    .line 862
    .line 863
    const/4 v2, 0x3

    .line 864
    move/from16 v18, v2

    .line 865
    .line 866
    const/4 v2, 0x5

    .line 867
    move/from16 v19, v2

    .line 868
    .line 869
    move/from16 v20, v0

    .line 870
    .line 871
    move/from16 v21, v1

    .line 872
    .line 873
    invoke-virtual/range {v17 .. v22}, Lv/d;->v(IIIILv/d;)V

    .line 874
    .line 875
    .line 876
    :cond_2c
    :goto_18
    iget v0, v5, Ly/e;->k:I

    .line 877
    .line 878
    const/4 v1, -0x1

    .line 879
    if-eq v0, v1, :cond_2d

    .line 880
    .line 881
    invoke-virtual {v9, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 882
    .line 883
    .line 884
    move-result-object v0

    .line 885
    move-object/from16 v22, v0

    .line 886
    .line 887
    check-cast v22, Lv/d;

    .line 888
    .line 889
    if-eqz v22, :cond_2e

    .line 890
    .line 891
    iget v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 892
    .line 893
    iget v1, v5, Ly/e;->z:I

    .line 894
    .line 895
    move-object/from16 v17, v15

    .line 896
    .line 897
    const/4 v2, 0x5

    .line 898
    move/from16 v18, v2

    .line 899
    .line 900
    const/4 v2, 0x3

    .line 901
    move/from16 v19, v2

    .line 902
    .line 903
    move/from16 v20, v0

    .line 904
    .line 905
    move/from16 v21, v1

    .line 906
    .line 907
    invoke-virtual/range {v17 .. v22}, Lv/d;->v(IIIILv/d;)V

    .line 908
    .line 909
    .line 910
    goto :goto_19

    .line 911
    :cond_2d
    iget v0, v5, Ly/e;->l:I

    .line 912
    .line 913
    const/4 v1, -0x1

    .line 914
    if-eq v0, v1, :cond_2e

    .line 915
    .line 916
    invoke-virtual {v9, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 917
    .line 918
    .line 919
    move-result-object v0

    .line 920
    move-object/from16 v22, v0

    .line 921
    .line 922
    check-cast v22, Lv/d;

    .line 923
    .line 924
    if-eqz v22, :cond_2e

    .line 925
    .line 926
    iget v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 927
    .line 928
    iget v1, v5, Ly/e;->z:I

    .line 929
    .line 930
    move-object/from16 v17, v15

    .line 931
    .line 932
    const/4 v2, 0x5

    .line 933
    move/from16 v18, v2

    .line 934
    .line 935
    move/from16 v19, v2

    .line 936
    .line 937
    move/from16 v20, v0

    .line 938
    .line 939
    move/from16 v21, v1

    .line 940
    .line 941
    invoke-virtual/range {v17 .. v22}, Lv/d;->v(IIIILv/d;)V

    .line 942
    .line 943
    .line 944
    :cond_2e
    :goto_19
    iget v4, v5, Ly/e;->m:I

    .line 945
    .line 946
    const/4 v6, -0x1

    .line 947
    if-eq v4, v6, :cond_30

    .line 948
    .line 949
    const/4 v8, 0x6

    .line 950
    move-object/from16 v0, p0

    .line 951
    .line 952
    move-object v1, v15

    .line 953
    move-object v2, v5

    .line 954
    move-object v3, v9

    .line 955
    move-object v14, v5

    .line 956
    move v5, v8

    .line 957
    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->l(Lv/d;Ly/e;Landroid/util/SparseArray;II)V

    .line 958
    .line 959
    .line 960
    :cond_2f
    :goto_1a
    const/4 v0, 0x0

    .line 961
    goto :goto_1b

    .line 962
    :cond_30
    move-object v14, v5

    .line 963
    iget v4, v14, Ly/e;->n:I

    .line 964
    .line 965
    if-eq v4, v6, :cond_31

    .line 966
    .line 967
    move-object/from16 v0, p0

    .line 968
    .line 969
    move-object v1, v15

    .line 970
    move-object v2, v14

    .line 971
    move-object v3, v9

    .line 972
    const/4 v8, 0x3

    .line 973
    move v5, v8

    .line 974
    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->l(Lv/d;Ly/e;Landroid/util/SparseArray;II)V

    .line 975
    .line 976
    .line 977
    goto :goto_1a

    .line 978
    :cond_31
    iget v4, v14, Ly/e;->o:I

    .line 979
    .line 980
    if-eq v4, v6, :cond_2f

    .line 981
    .line 982
    move-object/from16 v0, p0

    .line 983
    .line 984
    move-object v1, v15

    .line 985
    move-object v2, v14

    .line 986
    move-object v3, v9

    .line 987
    const/4 v6, 0x5

    .line 988
    move v5, v6

    .line 989
    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->l(Lv/d;Ly/e;Landroid/util/SparseArray;II)V

    .line 990
    .line 991
    .line 992
    goto :goto_1a

    .line 993
    :goto_1b
    cmpl-float v1, v7, v0

    .line 994
    .line 995
    if-ltz v1, :cond_32

    .line 996
    .line 997
    iput v7, v15, Lv/d;->d0:F

    .line 998
    .line 999
    :cond_32
    iget v1, v14, Ly/e;->F:F

    .line 1000
    .line 1001
    cmpl-float v2, v1, v0

    .line 1002
    .line 1003
    if-ltz v2, :cond_33

    .line 1004
    .line 1005
    iput v1, v15, Lv/d;->e0:F

    .line 1006
    .line 1007
    :cond_33
    :goto_1c
    if-eqz v13, :cond_35

    .line 1008
    .line 1009
    iget v0, v14, Ly/e;->T:I

    .line 1010
    .line 1011
    const/4 v1, -0x1

    .line 1012
    if-ne v0, v1, :cond_34

    .line 1013
    .line 1014
    iget v2, v14, Ly/e;->U:I

    .line 1015
    .line 1016
    if-eq v2, v1, :cond_35

    .line 1017
    .line 1018
    :cond_34
    iget v1, v14, Ly/e;->U:I

    .line 1019
    .line 1020
    iput v0, v15, Lv/d;->Y:I

    .line 1021
    .line 1022
    iput v1, v15, Lv/d;->Z:I

    .line 1023
    .line 1024
    :cond_35
    iget-boolean v0, v14, Ly/e;->a0:Z

    .line 1025
    .line 1026
    const/4 v1, 0x3

    .line 1027
    const/4 v2, 0x4

    .line 1028
    const/4 v3, -0x2

    .line 1029
    if-nez v0, :cond_38

    .line 1030
    .line 1031
    iget v0, v14, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 1032
    .line 1033
    const/4 v4, -0x1

    .line 1034
    if-ne v0, v4, :cond_37

    .line 1035
    .line 1036
    iget-boolean v0, v14, Ly/e;->W:Z

    .line 1037
    .line 1038
    if-eqz v0, :cond_36

    .line 1039
    .line 1040
    invoke-virtual {v15, v1}, Lv/d;->M(I)V

    .line 1041
    .line 1042
    .line 1043
    :goto_1d
    const/4 v0, 0x2

    .line 1044
    goto :goto_1e

    .line 1045
    :cond_36
    invoke-virtual {v15, v2}, Lv/d;->M(I)V

    .line 1046
    .line 1047
    .line 1048
    goto :goto_1d

    .line 1049
    :goto_1e
    invoke-virtual {v15, v0}, Lv/d;->i(I)Lv/c;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v0

    .line 1053
    iget v4, v14, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 1054
    .line 1055
    iput v4, v0, Lv/c;->g:I

    .line 1056
    .line 1057
    const/4 v0, 0x4

    .line 1058
    invoke-virtual {v15, v0}, Lv/d;->i(I)Lv/c;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v0

    .line 1062
    iget v4, v14, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 1063
    .line 1064
    iput v4, v0, Lv/c;->g:I

    .line 1065
    .line 1066
    goto :goto_1f

    .line 1067
    :cond_37
    invoke-virtual {v15, v1}, Lv/d;->M(I)V

    .line 1068
    .line 1069
    .line 1070
    const/4 v0, 0x0

    .line 1071
    invoke-virtual {v15, v0}, Lv/d;->O(I)V

    .line 1072
    .line 1073
    .line 1074
    goto :goto_1f

    .line 1075
    :cond_38
    const/4 v0, 0x1

    .line 1076
    invoke-virtual {v15, v0}, Lv/d;->M(I)V

    .line 1077
    .line 1078
    .line 1079
    iget v0, v14, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 1080
    .line 1081
    invoke-virtual {v15, v0}, Lv/d;->O(I)V

    .line 1082
    .line 1083
    .line 1084
    iget v0, v14, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 1085
    .line 1086
    if-ne v0, v3, :cond_39

    .line 1087
    .line 1088
    const/4 v0, 0x2

    .line 1089
    invoke-virtual {v15, v0}, Lv/d;->M(I)V

    .line 1090
    .line 1091
    .line 1092
    :cond_39
    :goto_1f
    iget-boolean v0, v14, Ly/e;->b0:Z

    .line 1093
    .line 1094
    if-nez v0, :cond_3c

    .line 1095
    .line 1096
    iget v0, v14, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 1097
    .line 1098
    const/4 v4, -0x1

    .line 1099
    if-ne v0, v4, :cond_3b

    .line 1100
    .line 1101
    iget-boolean v0, v14, Ly/e;->X:Z

    .line 1102
    .line 1103
    if-eqz v0, :cond_3a

    .line 1104
    .line 1105
    invoke-virtual {v15, v1}, Lv/d;->N(I)V

    .line 1106
    .line 1107
    .line 1108
    :goto_20
    const/4 v0, 0x3

    .line 1109
    goto :goto_21

    .line 1110
    :cond_3a
    invoke-virtual {v15, v2}, Lv/d;->N(I)V

    .line 1111
    .line 1112
    .line 1113
    goto :goto_20

    .line 1114
    :goto_21
    invoke-virtual {v15, v0}, Lv/d;->i(I)Lv/c;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v0

    .line 1118
    iget v2, v14, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 1119
    .line 1120
    iput v2, v0, Lv/c;->g:I

    .line 1121
    .line 1122
    const/4 v0, 0x5

    .line 1123
    invoke-virtual {v15, v0}, Lv/d;->i(I)Lv/c;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v0

    .line 1127
    iget v2, v14, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 1128
    .line 1129
    iput v2, v0, Lv/c;->g:I

    .line 1130
    .line 1131
    goto :goto_22

    .line 1132
    :cond_3b
    invoke-virtual {v15, v1}, Lv/d;->N(I)V

    .line 1133
    .line 1134
    .line 1135
    const/4 v0, 0x0

    .line 1136
    invoke-virtual {v15, v0}, Lv/d;->L(I)V

    .line 1137
    .line 1138
    .line 1139
    goto :goto_22

    .line 1140
    :cond_3c
    const/4 v0, 0x1

    .line 1141
    const/4 v4, -0x1

    .line 1142
    invoke-virtual {v15, v0}, Lv/d;->N(I)V

    .line 1143
    .line 1144
    .line 1145
    iget v0, v14, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 1146
    .line 1147
    invoke-virtual {v15, v0}, Lv/d;->L(I)V

    .line 1148
    .line 1149
    .line 1150
    iget v0, v14, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 1151
    .line 1152
    if-ne v0, v3, :cond_3d

    .line 1153
    .line 1154
    const/4 v0, 0x2

    .line 1155
    invoke-virtual {v15, v0}, Lv/d;->N(I)V

    .line 1156
    .line 1157
    .line 1158
    :cond_3d
    :goto_22
    iget-object v0, v14, Ly/e;->G:Ljava/lang/String;

    .line 1159
    .line 1160
    if-eqz v0, :cond_3e

    .line 1161
    .line 1162
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1163
    .line 1164
    .line 1165
    move-result v2

    .line 1166
    if-nez v2, :cond_3f

    .line 1167
    .line 1168
    :cond_3e
    const/4 v2, 0x0

    .line 1169
    goto/16 :goto_28

    .line 1170
    .line 1171
    :cond_3f
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1172
    .line 1173
    .line 1174
    move-result v2

    .line 1175
    const/16 v3, 0x2c

    .line 1176
    .line 1177
    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(I)I

    .line 1178
    .line 1179
    .line 1180
    move-result v3

    .line 1181
    if-lez v3, :cond_42

    .line 1182
    .line 1183
    add-int/lit8 v5, v2, -0x1

    .line 1184
    .line 1185
    if-ge v3, v5, :cond_42

    .line 1186
    .line 1187
    const/4 v5, 0x0

    .line 1188
    invoke-virtual {v0, v5, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v6

    .line 1192
    const-string v5, "W"

    .line 1193
    .line 1194
    invoke-virtual {v6, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1195
    .line 1196
    .line 1197
    move-result v5

    .line 1198
    if-eqz v5, :cond_40

    .line 1199
    .line 1200
    const/4 v5, 0x0

    .line 1201
    goto :goto_23

    .line 1202
    :cond_40
    const-string v5, "H"

    .line 1203
    .line 1204
    invoke-virtual {v6, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1205
    .line 1206
    .line 1207
    move-result v5

    .line 1208
    if-eqz v5, :cond_41

    .line 1209
    .line 1210
    const/4 v5, 0x1

    .line 1211
    goto :goto_23

    .line 1212
    :cond_41
    const/4 v5, -0x1

    .line 1213
    :goto_23
    add-int/lit8 v3, v3, 0x1

    .line 1214
    .line 1215
    goto :goto_24

    .line 1216
    :cond_42
    const/4 v3, 0x0

    .line 1217
    const/4 v5, -0x1

    .line 1218
    :goto_24
    const/16 v6, 0x3a

    .line 1219
    .line 1220
    invoke-virtual {v0, v6}, Ljava/lang/String;->indexOf(I)I

    .line 1221
    .line 1222
    .line 1223
    move-result v6

    .line 1224
    if-ltz v6, :cond_44

    .line 1225
    .line 1226
    add-int/lit8 v2, v2, -0x1

    .line 1227
    .line 1228
    if-ge v6, v2, :cond_44

    .line 1229
    .line 1230
    invoke-virtual {v0, v3, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v2

    .line 1234
    add-int/lit8 v6, v6, 0x1

    .line 1235
    .line 1236
    invoke-virtual {v0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v0

    .line 1240
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1241
    .line 1242
    .line 1243
    move-result v3

    .line 1244
    if-lez v3, :cond_45

    .line 1245
    .line 1246
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1247
    .line 1248
    .line 1249
    move-result v3

    .line 1250
    if-lez v3, :cond_45

    .line 1251
    .line 1252
    :try_start_1
    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 1253
    .line 1254
    .line 1255
    move-result v2

    .line 1256
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 1257
    .line 1258
    .line 1259
    move-result v0

    .line 1260
    const/4 v3, 0x0

    .line 1261
    cmpl-float v6, v2, v3

    .line 1262
    .line 1263
    if-lez v6, :cond_45

    .line 1264
    .line 1265
    cmpl-float v6, v0, v3

    .line 1266
    .line 1267
    if-lez v6, :cond_45

    .line 1268
    .line 1269
    const/4 v3, 0x1

    .line 1270
    if-ne v5, v3, :cond_43

    .line 1271
    .line 1272
    div-float/2addr v0, v2

    .line 1273
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 1274
    .line 1275
    .line 1276
    move-result v0

    .line 1277
    goto :goto_25

    .line 1278
    :catch_1
    nop

    .line 1279
    goto :goto_26

    .line 1280
    :cond_43
    div-float/2addr v2, v0

    .line 1281
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 1282
    .line 1283
    .line 1284
    move-result v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1285
    :goto_25
    const/4 v2, 0x0

    .line 1286
    goto :goto_27

    .line 1287
    :cond_44
    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v0

    .line 1291
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1292
    .line 1293
    .line 1294
    move-result v2

    .line 1295
    if-lez v2, :cond_45

    .line 1296
    .line 1297
    :try_start_2
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 1298
    .line 1299
    .line 1300
    move-result v0
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    .line 1301
    goto :goto_25

    .line 1302
    :catch_2
    nop

    .line 1303
    :cond_45
    :goto_26
    const/4 v0, 0x0

    .line 1304
    goto :goto_25

    .line 1305
    :goto_27
    cmpl-float v3, v0, v2

    .line 1306
    .line 1307
    if-lez v3, :cond_46

    .line 1308
    .line 1309
    iput v0, v15, Lv/d;->W:F

    .line 1310
    .line 1311
    iput v5, v15, Lv/d;->X:I

    .line 1312
    .line 1313
    goto :goto_29

    .line 1314
    :goto_28
    iput v2, v15, Lv/d;->W:F

    .line 1315
    .line 1316
    :cond_46
    :goto_29
    iget v0, v14, Ly/e;->H:F

    .line 1317
    .line 1318
    iget-object v2, v15, Lv/d;->k0:[F

    .line 1319
    .line 1320
    const/4 v3, 0x0

    .line 1321
    aput v0, v2, v3

    .line 1322
    .line 1323
    iget v0, v14, Ly/e;->I:F

    .line 1324
    .line 1325
    const/4 v3, 0x1

    .line 1326
    aput v0, v2, v3

    .line 1327
    .line 1328
    iget v0, v14, Ly/e;->J:I

    .line 1329
    .line 1330
    iput v0, v15, Lv/d;->i0:I

    .line 1331
    .line 1332
    iget v0, v14, Ly/e;->K:I

    .line 1333
    .line 1334
    iput v0, v15, Lv/d;->j0:I

    .line 1335
    .line 1336
    iget v0, v14, Ly/e;->Z:I

    .line 1337
    .line 1338
    if-ltz v0, :cond_47

    .line 1339
    .line 1340
    if-gt v0, v1, :cond_47

    .line 1341
    .line 1342
    iput v0, v15, Lv/d;->q:I

    .line 1343
    .line 1344
    :cond_47
    iget v0, v14, Ly/e;->L:I

    .line 1345
    .line 1346
    iget v1, v14, Ly/e;->N:I

    .line 1347
    .line 1348
    iget v2, v14, Ly/e;->P:I

    .line 1349
    .line 1350
    iget v5, v14, Ly/e;->R:F

    .line 1351
    .line 1352
    iput v0, v15, Lv/d;->r:I

    .line 1353
    .line 1354
    iput v1, v15, Lv/d;->u:I

    .line 1355
    .line 1356
    const v1, 0x7fffffff

    .line 1357
    .line 1358
    .line 1359
    if-ne v2, v1, :cond_48

    .line 1360
    .line 1361
    const/4 v2, 0x0

    .line 1362
    :cond_48
    iput v2, v15, Lv/d;->v:I

    .line 1363
    .line 1364
    iput v5, v15, Lv/d;->w:F

    .line 1365
    .line 1366
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1367
    .line 1368
    const/4 v6, 0x0

    .line 1369
    cmpl-float v7, v5, v6

    .line 1370
    .line 1371
    if-lez v7, :cond_49

    .line 1372
    .line 1373
    cmpg-float v5, v5, v2

    .line 1374
    .line 1375
    if-gez v5, :cond_49

    .line 1376
    .line 1377
    if-nez v0, :cond_49

    .line 1378
    .line 1379
    const/4 v0, 0x2

    .line 1380
    iput v0, v15, Lv/d;->r:I

    .line 1381
    .line 1382
    :cond_49
    iget v0, v14, Ly/e;->M:I

    .line 1383
    .line 1384
    iget v5, v14, Ly/e;->O:I

    .line 1385
    .line 1386
    iget v6, v14, Ly/e;->Q:I

    .line 1387
    .line 1388
    iget v7, v14, Ly/e;->S:F

    .line 1389
    .line 1390
    iput v0, v15, Lv/d;->s:I

    .line 1391
    .line 1392
    iput v5, v15, Lv/d;->x:I

    .line 1393
    .line 1394
    if-ne v6, v1, :cond_4a

    .line 1395
    .line 1396
    const/4 v6, 0x0

    .line 1397
    :cond_4a
    iput v6, v15, Lv/d;->y:I

    .line 1398
    .line 1399
    iput v7, v15, Lv/d;->z:F

    .line 1400
    .line 1401
    const/4 v1, 0x0

    .line 1402
    cmpl-float v1, v7, v1

    .line 1403
    .line 1404
    if-lez v1, :cond_4b

    .line 1405
    .line 1406
    cmpg-float v1, v7, v2

    .line 1407
    .line 1408
    if-gez v1, :cond_4b

    .line 1409
    .line 1410
    if-nez v0, :cond_4b

    .line 1411
    .line 1412
    const/4 v0, 0x2

    .line 1413
    iput v0, v15, Lv/d;->s:I

    .line 1414
    .line 1415
    goto :goto_2a

    .line 1416
    :cond_4b
    const/4 v0, 0x2

    .line 1417
    :goto_2a
    add-int/lit8 v10, v10, 0x1

    .line 1418
    .line 1419
    move-object/from16 v6, p0

    .line 1420
    .line 1421
    move/from16 v7, p1

    .line 1422
    .line 1423
    move/from16 v8, p2

    .line 1424
    .line 1425
    move/from16 v14, v16

    .line 1426
    .line 1427
    goto/16 :goto_13

    .line 1428
    .line 1429
    :cond_4c
    if-eqz v12, :cond_4d

    .line 1430
    .line 1431
    iget-object v0, v11, Lv/e;->r0:Landroid/support/v4/media/session/t;

    .line 1432
    .line 1433
    invoke-virtual {v0, v11}, Landroid/support/v4/media/session/t;->H(Lv/e;)V

    .line 1434
    .line 1435
    .line 1436
    :cond_4d
    iget-object v0, v11, Lv/e;->w0:Lt/c;

    .line 1437
    .line 1438
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1439
    .line 1440
    .line 1441
    move-object/from16 v0, p0

    .line 1442
    .line 1443
    iget v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:I

    .line 1444
    .line 1445
    move/from16 v2, p1

    .line 1446
    .line 1447
    move/from16 v3, p2

    .line 1448
    .line 1449
    invoke-virtual {v0, v11, v1, v2, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->k(Lv/e;III)V

    .line 1450
    .line 1451
    .line 1452
    invoke-virtual {v11}, Lv/d;->q()I

    .line 1453
    .line 1454
    .line 1455
    move-result v1

    .line 1456
    invoke-virtual {v11}, Lv/d;->k()I

    .line 1457
    .line 1458
    .line 1459
    move-result v4

    .line 1460
    iget-boolean v5, v11, Lv/e;->E0:Z

    .line 1461
    .line 1462
    iget-boolean v6, v11, Lv/e;->F0:Z

    .line 1463
    .line 1464
    iget-object v7, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->t:Ly/f;

    .line 1465
    .line 1466
    iget v8, v7, Ly/f;->e:I

    .line 1467
    .line 1468
    iget v7, v7, Ly/f;->d:I

    .line 1469
    .line 1470
    add-int/2addr v1, v7

    .line 1471
    add-int/2addr v4, v8

    .line 1472
    const/4 v7, 0x0

    .line 1473
    invoke-static {v1, v2, v7}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 1474
    .line 1475
    .line 1476
    move-result v1

    .line 1477
    invoke-static {v4, v3, v7}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 1478
    .line 1479
    .line 1480
    move-result v2

    .line 1481
    const v3, 0xffffff

    .line 1482
    .line 1483
    .line 1484
    and-int/2addr v1, v3

    .line 1485
    and-int/2addr v2, v3

    .line 1486
    iget v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    .line 1487
    .line 1488
    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    .line 1489
    .line 1490
    .line 1491
    move-result v1

    .line 1492
    iget v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    .line 1493
    .line 1494
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    .line 1495
    .line 1496
    .line 1497
    move-result v2

    .line 1498
    const/high16 v3, 0x1000000

    .line 1499
    .line 1500
    if-eqz v5, :cond_4e

    .line 1501
    .line 1502
    or-int/2addr v1, v3

    .line 1503
    :cond_4e
    if-eqz v6, :cond_4f

    .line 1504
    .line 1505
    or-int/2addr v2, v3

    .line 1506
    :cond_4f
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 1507
    .line 1508
    .line 1509
    return-void
.end method

.method public final onViewAdded(Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewAdded(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(Landroid/view/View;)Lv/d;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    instance-of v1, p1, Ly/p;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    instance-of v0, v0, Lv/h;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ly/e;

    .line 22
    .line 23
    new-instance v1, Lv/h;

    .line 24
    .line 25
    invoke-direct {v1}, Lv/h;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v1, v0, Ly/e;->p0:Lv/d;

    .line 29
    .line 30
    iput-boolean v2, v0, Ly/e;->d0:Z

    .line 31
    .line 32
    iget v0, v0, Ly/e;->V:I

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Lv/h;->S(I)V

    .line 35
    .line 36
    .line 37
    :cond_0
    instance-of v0, p1, Ly/c;

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    move-object v0, p1

    .line 42
    check-cast v0, Ly/c;

    .line 43
    .line 44
    invoke-virtual {v0}, Ly/c;->i()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Ly/e;

    .line 52
    .line 53
    iput-boolean v2, v1, Ly/e;->e0:Z

    .line 54
    .line 55
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-nez v3, :cond_1

    .line 62
    .line 63
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:Landroid/util/SparseArray;

    .line 71
    .line 72
    invoke-virtual {v1, v0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iput-boolean v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Z

    .line 76
    .line 77
    return-void
.end method

.method public onViewRemoved(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewRemoved(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:Landroid/util/SparseArray;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->remove(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(Landroid/view/View;)Lv/d;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Lv/e;

    .line 18
    .line 19
    iget-object v1, v1, Lv/e;->q0:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lv/d;->C()V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x1

    .line 33
    iput-boolean p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Z

    .line 34
    .line 35
    return-void
.end method

.method public final requestLayout()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Z

    .line 3
    .line 4
    invoke-super {p0}, Landroid/view/ViewGroup;->requestLayout()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setConstraintSet(Ly/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Ly/n;

    .line 2
    .line 3
    return-void
.end method

.method public setId(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:Landroid/util/SparseArray;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->remove(I)V

    .line 8
    .line 9
    .line 10
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setId(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {v1, p1, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public setMaxHeight(I)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setMaxWidth(I)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setMinHeight(I)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setMinWidth(I)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setOnConstraintsChanged(Ly/o;)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:LE/j;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setOptimizationLevel(I)V
    .locals 1

    .line 1
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:I

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Lv/e;

    .line 4
    .line 5
    iput p1, v0, Lv/e;->D0:I

    .line 6
    .line 7
    const/16 p1, 0x200

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lv/e;->W(I)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    sput-boolean p1, Lt/c;->q:Z

    .line 14
    .line 15
    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
