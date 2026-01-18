.class public abstract Lo/A0;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# instance fields
.field public f:Z

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:F

.field public m:Z

.field public n:[I

.field public o:[I

.field public p:Landroid/graphics/drawable/Drawable;

.field public q:I

.field public r:I

.field public s:I

.field public t:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 10

    .line 1
    const/4 v5, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v5}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    .line 4
    .line 5
    const/4 v6, 0x1

    .line 6
    iput-boolean v6, p0, Lo/A0;->f:Z

    .line 7
    .line 8
    const/4 v7, -0x1

    .line 9
    iput v7, p0, Lo/A0;->g:I

    .line 10
    .line 11
    const/4 v8, 0x0

    .line 12
    iput v8, p0, Lo/A0;->h:I

    .line 13
    .line 14
    const v0, 0x800033

    .line 15
    .line 16
    .line 17
    iput v0, p0, Lo/A0;->j:I

    .line 18
    .line 19
    sget-object v2, Lg/a;->n:[I

    .line 20
    .line 21
    invoke-static {p1, p2, v2, v5}, Landroid/support/v4/media/session/t;->A(Landroid/content/Context;Landroid/util/AttributeSet;[II)Landroid/support/v4/media/session/t;

    .line 22
    .line 23
    .line 24
    move-result-object v9

    .line 25
    iget-object v0, v9, Landroid/support/v4/media/session/t;->c:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v4, v0

    .line 28
    check-cast v4, Landroid/content/res/TypedArray;

    .line 29
    .line 30
    move-object v0, p0

    .line 31
    move-object v1, p1

    .line 32
    move-object v3, p2

    .line 33
    invoke-static/range {v0 .. v5}, LN/Q;->o(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 34
    .line 35
    .line 36
    iget-object p1, v9, Landroid/support/v4/media/session/t;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, Landroid/content/res/TypedArray;

    .line 39
    .line 40
    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-ltz p2, :cond_0

    .line 45
    .line 46
    invoke-virtual {p0, p2}, Lo/A0;->setOrientation(I)V

    .line 47
    .line 48
    .line 49
    :cond_0
    invoke-virtual {p1, v8, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    if-ltz p2, :cond_1

    .line 54
    .line 55
    invoke-virtual {p0, p2}, Lo/A0;->setGravity(I)V

    .line 56
    .line 57
    .line 58
    :cond_1
    const/4 p2, 0x2

    .line 59
    invoke-virtual {p1, p2, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    if-nez p2, :cond_2

    .line 64
    .line 65
    invoke-virtual {p0, p2}, Lo/A0;->setBaselineAligned(Z)V

    .line 66
    .line 67
    .line 68
    :cond_2
    const/4 p2, 0x4

    .line 69
    const/high16 v0, -0x40800000    # -1.0f

    .line 70
    .line 71
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    iput p2, p0, Lo/A0;->l:F

    .line 76
    .line 77
    const/4 p2, 0x3

    .line 78
    invoke-virtual {p1, p2, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    iput p2, p0, Lo/A0;->g:I

    .line 83
    .line 84
    const/4 p2, 0x7

    .line 85
    invoke-virtual {p1, p2, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    iput-boolean p2, p0, Lo/A0;->m:Z

    .line 90
    .line 91
    const/4 p2, 0x5

    .line 92
    invoke-virtual {v9, p2}, Landroid/support/v4/media/session/t;->o(I)Landroid/graphics/drawable/Drawable;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-virtual {p0, p2}, Lo/A0;->setDividerDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 97
    .line 98
    .line 99
    const/16 p2, 0x8

    .line 100
    .line 101
    invoke-virtual {p1, p2, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    iput p2, p0, Lo/A0;->s:I

    .line 106
    .line 107
    const/4 p2, 0x6

    .line 108
    invoke-virtual {p1, p2, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    iput p1, p0, Lo/A0;->t:I

    .line 113
    .line 114
    invoke-virtual {v9}, Landroid/support/v4/media/session/t;->C()V

    .line 115
    .line 116
    .line 117
    return-void
.end method


# virtual methods
.method public checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    .line 1
    instance-of p1, p1, Lo/z0;

    .line 2
    .line 3
    return p1
.end method

.method public final d(Landroid/graphics/Canvas;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lo/A0;->p:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget v2, p0, Lo/A0;->t:I

    .line 8
    .line 9
    add-int/2addr v1, v2

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    sub-int/2addr v2, v3

    .line 19
    iget v3, p0, Lo/A0;->t:I

    .line 20
    .line 21
    sub-int/2addr v2, v3

    .line 22
    iget v3, p0, Lo/A0;->r:I

    .line 23
    .line 24
    add-int/2addr v3, p2

    .line 25
    invoke-virtual {v0, v1, p2, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 26
    .line 27
    .line 28
    iget-object p2, p0, Lo/A0;->p:Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final e(Landroid/graphics/Canvas;I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lo/A0;->p:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget v2, p0, Lo/A0;->t:I

    .line 8
    .line 9
    add-int/2addr v1, v2

    .line 10
    iget v2, p0, Lo/A0;->q:I

    .line 11
    .line 12
    add-int/2addr v2, p2

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    sub-int/2addr v3, v4

    .line 22
    iget v4, p0, Lo/A0;->t:I

    .line 23
    .line 24
    sub-int/2addr v3, v4

    .line 25
    invoke-virtual {v0, p2, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 26
    .line 27
    .line 28
    iget-object p2, p0, Lo/A0;->p:Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public f()Lo/z0;
    .locals 3

    .line 1
    iget v0, p0, Lo/A0;->i:I

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lo/z0;

    .line 7
    .line 8
    invoke-direct {v0, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v2, 0x1

    .line 13
    if-ne v0, v2, :cond_1

    .line 14
    .line 15
    new-instance v0, Lo/z0;

    .line 16
    .line 17
    const/4 v2, -0x1

    .line 18
    invoke-direct {v0, v2, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    return-object v0
.end method

.method public g(Landroid/util/AttributeSet;)Lo/z0;
    .locals 2

    .line 1
    new-instance v0, Lo/z0;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lo/A0;->f()Lo/z0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lo/A0;->g(Landroid/util/AttributeSet;)Lo/z0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lo/A0;->h(Landroid/view/ViewGroup$LayoutParams;)Lo/z0;

    move-result-object p1

    return-object p1
.end method

.method public getBaseline()I
    .locals 5

    .line 1
    iget v0, p0, Lo/A0;->g:I

    .line 2
    .line 3
    if-gez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0}, Landroid/view/ViewGroup;->getBaseline()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget v1, p0, Lo/A0;->g:I

    .line 15
    .line 16
    if-le v0, v1, :cond_6

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Landroid/view/View;->getBaseline()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, -0x1

    .line 27
    if-ne v1, v2, :cond_2

    .line 28
    .line 29
    iget v0, p0, Lo/A0;->g:I

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    return v2

    .line 34
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 35
    .line 36
    const-string v1, "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn\'t know how to get its baseline."

    .line 37
    .line 38
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0

    .line 42
    :cond_2
    iget v2, p0, Lo/A0;->h:I

    .line 43
    .line 44
    iget v3, p0, Lo/A0;->i:I

    .line 45
    .line 46
    const/4 v4, 0x1

    .line 47
    if-ne v3, v4, :cond_5

    .line 48
    .line 49
    iget v3, p0, Lo/A0;->j:I

    .line 50
    .line 51
    and-int/lit8 v3, v3, 0x70

    .line 52
    .line 53
    const/16 v4, 0x30

    .line 54
    .line 55
    if-eq v3, v4, :cond_5

    .line 56
    .line 57
    const/16 v4, 0x10

    .line 58
    .line 59
    if-eq v3, v4, :cond_4

    .line 60
    .line 61
    const/16 v4, 0x50

    .line 62
    .line 63
    if-eq v3, v4, :cond_3

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    sub-int/2addr v2, v3

    .line 75
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    sub-int/2addr v2, v3

    .line 80
    iget v3, p0, Lo/A0;->k:I

    .line 81
    .line 82
    sub-int/2addr v2, v3

    .line 83
    goto :goto_0

    .line 84
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    sub-int/2addr v3, v4

    .line 93
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    sub-int/2addr v3, v4

    .line 98
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    sub-int/2addr v3, v4

    .line 103
    iget v4, p0, Lo/A0;->k:I

    .line 104
    .line 105
    sub-int/2addr v3, v4

    .line 106
    div-int/lit8 v3, v3, 0x2

    .line 107
    .line 108
    add-int/2addr v2, v3

    .line 109
    :cond_5
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, Lo/z0;

    .line 114
    .line 115
    iget v0, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 116
    .line 117
    add-int/2addr v2, v0

    .line 118
    add-int/2addr v2, v1

    .line 119
    return v2

    .line 120
    :cond_6
    new-instance v0, Ljava/lang/RuntimeException;

    .line 121
    .line 122
    const-string v1, "mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds."

    .line 123
    .line 124
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw v0
.end method

.method public getBaselineAlignedChildIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lo/A0;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public getDividerDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lo/A0;->p:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDividerPadding()I
    .locals 1

    .line 1
    iget v0, p0, Lo/A0;->t:I

    .line 2
    .line 3
    return v0
.end method

.method public getDividerWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lo/A0;->q:I

    .line 2
    .line 3
    return v0
.end method

.method public getGravity()I
    .locals 1

    .line 1
    iget v0, p0, Lo/A0;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public getOrientation()I
    .locals 1

    .line 1
    iget v0, p0, Lo/A0;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public getShowDividers()I
    .locals 1

    .line 1
    iget v0, p0, Lo/A0;->s:I

    .line 2
    .line 3
    return v0
.end method

.method public getVirtualChildCount()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public getWeightSum()F
    .locals 1

    .line 1
    iget v0, p0, Lo/A0;->l:F

    .line 2
    .line 3
    return v0
.end method

.method public h(Landroid/view/ViewGroup$LayoutParams;)Lo/z0;
    .locals 1

    .line 1
    instance-of v0, p1, Lo/z0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lo/z0;

    .line 6
    .line 7
    check-cast p1, Lo/z0;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    new-instance v0, Lo/z0;

    .line 18
    .line 19
    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_1
    new-instance v0, Lo/z0;

    .line 26
    .line 27
    invoke-direct {v0, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public final i(I)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    iget p1, p0, Lo/A0;->s:I

    .line 6
    .line 7
    and-int/2addr p1, v1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    :cond_0
    return v0

    .line 12
    :cond_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-ne p1, v2, :cond_3

    .line 17
    .line 18
    iget p1, p0, Lo/A0;->s:I

    .line 19
    .line 20
    and-int/lit8 p1, p1, 0x4

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    :cond_2
    return v0

    .line 26
    :cond_3
    iget v2, p0, Lo/A0;->s:I

    .line 27
    .line 28
    and-int/lit8 v2, v2, 0x2

    .line 29
    .line 30
    if-eqz v2, :cond_5

    .line 31
    .line 32
    sub-int/2addr p1, v1

    .line 33
    :goto_0
    if-ltz p1, :cond_5

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/16 v3, 0x8

    .line 44
    .line 45
    if-eq v2, v3, :cond_4

    .line 46
    .line 47
    const/4 v0, 0x1

    .line 48
    goto :goto_1

    .line 49
    :cond_4
    add-int/lit8 p1, p1, -0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_5
    :goto_1
    return v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Lo/A0;->p:Landroid/graphics/drawable/Drawable;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget v1, p0, Lo/A0;->i:I

    .line 8
    .line 9
    const/16 v2, 0x8

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-ne v1, v0, :cond_4

    .line 13
    .line 14
    invoke-virtual {p0}, Lo/A0;->getVirtualChildCount()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    :goto_0
    if-ge v3, v1, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    if-eqz v4, :cond_1

    .line 25
    .line 26
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-eq v5, v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0, v3}, Lo/A0;->i(I)Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-eqz v5, :cond_1

    .line 37
    .line 38
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    check-cast v5, Lo/z0;

    .line 43
    .line 44
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    iget v5, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 49
    .line 50
    sub-int/2addr v4, v5

    .line 51
    iget v5, p0, Lo/A0;->r:I

    .line 52
    .line 53
    sub-int/2addr v4, v5

    .line 54
    invoke-virtual {p0, p1, v4}, Lo/A0;->d(Landroid/graphics/Canvas;I)V

    .line 55
    .line 56
    .line 57
    :cond_1
    add-int/2addr v3, v0

    .line 58
    goto :goto_0

    .line 59
    :cond_2
    invoke-virtual {p0, v1}, Lo/A0;->i(I)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_c

    .line 64
    .line 65
    sub-int/2addr v1, v0

    .line 66
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-nez v0, :cond_3

    .line 71
    .line 72
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    sub-int/2addr v0, v1

    .line 81
    iget v1, p0, Lo/A0;->r:I

    .line 82
    .line 83
    sub-int/2addr v0, v1

    .line 84
    goto :goto_1

    .line 85
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    check-cast v1, Lo/z0;

    .line 90
    .line 91
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    iget v1, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 96
    .line 97
    add-int/2addr v0, v1

    .line 98
    :goto_1
    invoke-virtual {p0, p1, v0}, Lo/A0;->d(Landroid/graphics/Canvas;I)V

    .line 99
    .line 100
    .line 101
    goto/16 :goto_6

    .line 102
    .line 103
    :cond_4
    invoke-virtual {p0}, Lo/A0;->getVirtualChildCount()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    sget-boolean v4, Lo/n1;->a:Z

    .line 108
    .line 109
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-ne v4, v0, :cond_5

    .line 114
    .line 115
    const/4 v4, 0x1

    .line 116
    goto :goto_2

    .line 117
    :cond_5
    const/4 v4, 0x0

    .line 118
    :goto_2
    if-ge v3, v1, :cond_8

    .line 119
    .line 120
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    if-eqz v5, :cond_7

    .line 125
    .line 126
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    if-eq v6, v2, :cond_7

    .line 131
    .line 132
    invoke-virtual {p0, v3}, Lo/A0;->i(I)Z

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    if-eqz v6, :cond_7

    .line 137
    .line 138
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    check-cast v6, Lo/z0;

    .line 143
    .line 144
    if-eqz v4, :cond_6

    .line 145
    .line 146
    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    iget v6, v6, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 151
    .line 152
    add-int/2addr v5, v6

    .line 153
    goto :goto_3

    .line 154
    :cond_6
    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    iget v6, v6, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 159
    .line 160
    sub-int/2addr v5, v6

    .line 161
    iget v6, p0, Lo/A0;->q:I

    .line 162
    .line 163
    sub-int/2addr v5, v6

    .line 164
    :goto_3
    invoke-virtual {p0, p1, v5}, Lo/A0;->e(Landroid/graphics/Canvas;I)V

    .line 165
    .line 166
    .line 167
    :cond_7
    add-int/2addr v3, v0

    .line 168
    goto :goto_2

    .line 169
    :cond_8
    invoke-virtual {p0, v1}, Lo/A0;->i(I)Z

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    if-eqz v2, :cond_c

    .line 174
    .line 175
    sub-int/2addr v1, v0

    .line 176
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    if-nez v0, :cond_a

    .line 181
    .line 182
    if-eqz v4, :cond_9

    .line 183
    .line 184
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    goto :goto_5

    .line 189
    :cond_9
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    sub-int/2addr v0, v1

    .line 198
    iget v1, p0, Lo/A0;->q:I

    .line 199
    .line 200
    :goto_4
    sub-int/2addr v0, v1

    .line 201
    goto :goto_5

    .line 202
    :cond_a
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    check-cast v1, Lo/z0;

    .line 207
    .line 208
    if-eqz v4, :cond_b

    .line 209
    .line 210
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    iget v1, v1, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 215
    .line 216
    sub-int/2addr v0, v1

    .line 217
    iget v1, p0, Lo/A0;->q:I

    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_b
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    iget v1, v1, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 225
    .line 226
    add-int/2addr v0, v1

    .line 227
    :goto_5
    invoke-virtual {p0, p1, v0}, Lo/A0;->e(Landroid/graphics/Canvas;I)V

    .line 228
    .line 229
    .line 230
    :cond_c
    :goto_6
    return-void
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "androidx.appcompat.widget.LinearLayoutCompat"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "androidx.appcompat.widget.LinearLayoutCompat"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lo/A0;->i:I

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    const/16 v3, 0x8

    .line 7
    .line 8
    const/16 v5, 0x50

    .line 9
    .line 10
    const/4 v6, 0x2

    .line 11
    const/16 v7, 0x10

    .line 12
    .line 13
    const v8, 0x800007

    .line 14
    .line 15
    .line 16
    const/4 v9, 0x1

    .line 17
    if-ne v1, v9, :cond_8

    .line 18
    .line 19
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    sub-int v10, p4, p2

    .line 24
    .line 25
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    .line 26
    .line 27
    .line 28
    move-result v11

    .line 29
    sub-int v11, v10, v11

    .line 30
    .line 31
    sub-int/2addr v10, v1

    .line 32
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    .line 33
    .line 34
    .line 35
    move-result v12

    .line 36
    sub-int/2addr v10, v12

    .line 37
    invoke-virtual/range {p0 .. p0}, Lo/A0;->getVirtualChildCount()I

    .line 38
    .line 39
    .line 40
    move-result v12

    .line 41
    iget v13, v0, Lo/A0;->j:I

    .line 42
    .line 43
    and-int/lit8 v14, v13, 0x70

    .line 44
    .line 45
    and-int/2addr v8, v13

    .line 46
    if-eq v14, v7, :cond_1

    .line 47
    .line 48
    if-eq v14, v5, :cond_0

    .line 49
    .line 50
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    add-int v5, v5, p5

    .line 60
    .line 61
    sub-int v5, v5, p3

    .line 62
    .line 63
    iget v7, v0, Lo/A0;->k:I

    .line 64
    .line 65
    sub-int/2addr v5, v7

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    sub-int v7, p5, p3

    .line 72
    .line 73
    iget v13, v0, Lo/A0;->k:I

    .line 74
    .line 75
    sub-int/2addr v7, v13

    .line 76
    div-int/2addr v7, v6

    .line 77
    add-int/2addr v5, v7

    .line 78
    :goto_0
    const/4 v4, 0x0

    .line 79
    :goto_1
    if-ge v4, v12, :cond_17

    .line 80
    .line 81
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    if-nez v7, :cond_2

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_2
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    if-eq v13, v3, :cond_7

    .line 93
    .line 94
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    .line 95
    .line 96
    .line 97
    move-result v13

    .line 98
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    .line 99
    .line 100
    .line 101
    move-result v14

    .line 102
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 103
    .line 104
    .line 105
    move-result-object v15

    .line 106
    check-cast v15, Lo/z0;

    .line 107
    .line 108
    iget v3, v15, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 109
    .line 110
    if-gez v3, :cond_3

    .line 111
    .line 112
    move v3, v8

    .line 113
    :cond_3
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getLayoutDirection()I

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    invoke-static {v3, v6}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    and-int/lit8 v3, v3, 0x7

    .line 122
    .line 123
    if-eq v3, v9, :cond_5

    .line 124
    .line 125
    if-eq v3, v2, :cond_4

    .line 126
    .line 127
    iget v3, v15, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 128
    .line 129
    add-int/2addr v3, v1

    .line 130
    goto :goto_3

    .line 131
    :cond_4
    sub-int v3, v11, v13

    .line 132
    .line 133
    iget v6, v15, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 134
    .line 135
    :goto_2
    sub-int/2addr v3, v6

    .line 136
    goto :goto_3

    .line 137
    :cond_5
    sub-int v3, v10, v13

    .line 138
    .line 139
    const/4 v6, 0x2

    .line 140
    div-int/2addr v3, v6

    .line 141
    add-int/2addr v3, v1

    .line 142
    iget v6, v15, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 143
    .line 144
    add-int/2addr v3, v6

    .line 145
    iget v6, v15, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :goto_3
    invoke-virtual {v0, v4}, Lo/A0;->i(I)Z

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    if-eqz v6, :cond_6

    .line 153
    .line 154
    iget v6, v0, Lo/A0;->r:I

    .line 155
    .line 156
    add-int/2addr v5, v6

    .line 157
    :cond_6
    iget v6, v15, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 158
    .line 159
    add-int/2addr v5, v6

    .line 160
    add-int/2addr v13, v3

    .line 161
    add-int v6, v5, v14

    .line 162
    .line 163
    invoke-virtual {v7, v3, v5, v13, v6}, Landroid/view/View;->layout(IIII)V

    .line 164
    .line 165
    .line 166
    iget v3, v15, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 167
    .line 168
    add-int/2addr v14, v3

    .line 169
    add-int/2addr v14, v5

    .line 170
    move v5, v14

    .line 171
    :cond_7
    :goto_4
    add-int/2addr v4, v9

    .line 172
    const/16 v3, 0x8

    .line 173
    .line 174
    const/4 v6, 0x2

    .line 175
    goto :goto_1

    .line 176
    :cond_8
    sget-boolean v1, Lo/n1;->a:Z

    .line 177
    .line 178
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getLayoutDirection()I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-ne v1, v9, :cond_9

    .line 183
    .line 184
    const/4 v1, 0x1

    .line 185
    goto :goto_5

    .line 186
    :cond_9
    const/4 v1, 0x0

    .line 187
    :goto_5
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    sub-int v6, p5, p3

    .line 192
    .line 193
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    .line 194
    .line 195
    .line 196
    move-result v10

    .line 197
    sub-int v10, v6, v10

    .line 198
    .line 199
    sub-int/2addr v6, v3

    .line 200
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    .line 201
    .line 202
    .line 203
    move-result v11

    .line 204
    sub-int/2addr v6, v11

    .line 205
    invoke-virtual/range {p0 .. p0}, Lo/A0;->getVirtualChildCount()I

    .line 206
    .line 207
    .line 208
    move-result v11

    .line 209
    iget v12, v0, Lo/A0;->j:I

    .line 210
    .line 211
    and-int/2addr v8, v12

    .line 212
    and-int/lit8 v12, v12, 0x70

    .line 213
    .line 214
    iget-boolean v13, v0, Lo/A0;->f:Z

    .line 215
    .line 216
    iget-object v14, v0, Lo/A0;->n:[I

    .line 217
    .line 218
    iget-object v15, v0, Lo/A0;->o:[I

    .line 219
    .line 220
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getLayoutDirection()I

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    invoke-static {v8, v4}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 225
    .line 226
    .line 227
    move-result v4

    .line 228
    if-eq v4, v9, :cond_b

    .line 229
    .line 230
    if-eq v4, v2, :cond_a

    .line 231
    .line 232
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    goto :goto_6

    .line 237
    :cond_a
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    add-int v2, v2, p4

    .line 242
    .line 243
    sub-int v2, v2, p2

    .line 244
    .line 245
    iget v4, v0, Lo/A0;->k:I

    .line 246
    .line 247
    sub-int/2addr v2, v4

    .line 248
    goto :goto_6

    .line 249
    :cond_b
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    .line 250
    .line 251
    .line 252
    move-result v2

    .line 253
    sub-int v4, p4, p2

    .line 254
    .line 255
    iget v8, v0, Lo/A0;->k:I

    .line 256
    .line 257
    sub-int/2addr v4, v8

    .line 258
    const/4 v8, 0x2

    .line 259
    div-int/2addr v4, v8

    .line 260
    add-int/2addr v2, v4

    .line 261
    :goto_6
    if-eqz v1, :cond_c

    .line 262
    .line 263
    add-int/lit8 v1, v11, -0x1

    .line 264
    .line 265
    const/4 v8, -0x1

    .line 266
    goto :goto_7

    .line 267
    :cond_c
    const/4 v1, 0x0

    .line 268
    const/4 v8, 0x1

    .line 269
    :goto_7
    const/4 v9, 0x0

    .line 270
    :goto_8
    if-ge v9, v11, :cond_17

    .line 271
    .line 272
    mul-int v17, v8, v9

    .line 273
    .line 274
    add-int v5, v17, v1

    .line 275
    .line 276
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 277
    .line 278
    .line 279
    move-result-object v7

    .line 280
    if-nez v7, :cond_d

    .line 281
    .line 282
    move/from16 p3, v1

    .line 283
    .line 284
    move/from16 p4, v8

    .line 285
    .line 286
    move/from16 p5, v11

    .line 287
    .line 288
    move/from16 v19, v12

    .line 289
    .line 290
    const/4 v1, 0x1

    .line 291
    const/4 v12, -0x1

    .line 292
    goto/16 :goto_c

    .line 293
    .line 294
    :cond_d
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 295
    .line 296
    .line 297
    move-result v4

    .line 298
    move/from16 p3, v1

    .line 299
    .line 300
    const/16 v1, 0x8

    .line 301
    .line 302
    if-eq v4, v1, :cond_16

    .line 303
    .line 304
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    .line 305
    .line 306
    .line 307
    move-result v4

    .line 308
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    .line 309
    .line 310
    .line 311
    move-result v18

    .line 312
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 313
    .line 314
    .line 315
    move-result-object v19

    .line 316
    move-object/from16 v1, v19

    .line 317
    .line 318
    check-cast v1, Lo/z0;

    .line 319
    .line 320
    move/from16 p4, v8

    .line 321
    .line 322
    if-eqz v13, :cond_e

    .line 323
    .line 324
    iget v8, v1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 325
    .line 326
    move/from16 p5, v11

    .line 327
    .line 328
    const/4 v11, -0x1

    .line 329
    if-eq v8, v11, :cond_f

    .line 330
    .line 331
    invoke-virtual {v7}, Landroid/view/View;->getBaseline()I

    .line 332
    .line 333
    .line 334
    move-result v11

    .line 335
    goto :goto_9

    .line 336
    :cond_e
    move/from16 p5, v11

    .line 337
    .line 338
    :cond_f
    const/4 v11, -0x1

    .line 339
    :goto_9
    iget v8, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 340
    .line 341
    if-gez v8, :cond_10

    .line 342
    .line 343
    move v8, v12

    .line 344
    :cond_10
    and-int/lit8 v8, v8, 0x70

    .line 345
    .line 346
    move/from16 v19, v12

    .line 347
    .line 348
    const/16 v12, 0x10

    .line 349
    .line 350
    if-eq v8, v12, :cond_13

    .line 351
    .line 352
    const/16 v12, 0x30

    .line 353
    .line 354
    if-eq v8, v12, :cond_12

    .line 355
    .line 356
    const/16 v12, 0x50

    .line 357
    .line 358
    if-eq v8, v12, :cond_11

    .line 359
    .line 360
    move v8, v3

    .line 361
    const/4 v12, -0x1

    .line 362
    goto :goto_a

    .line 363
    :cond_11
    sub-int v8, v10, v18

    .line 364
    .line 365
    iget v12, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 366
    .line 367
    sub-int/2addr v8, v12

    .line 368
    const/4 v12, -0x1

    .line 369
    if-eq v11, v12, :cond_14

    .line 370
    .line 371
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    .line 372
    .line 373
    .line 374
    move-result v20

    .line 375
    sub-int v20, v20, v11

    .line 376
    .line 377
    const/4 v11, 0x2

    .line 378
    aget v21, v15, v11

    .line 379
    .line 380
    sub-int v21, v21, v20

    .line 381
    .line 382
    sub-int v8, v8, v21

    .line 383
    .line 384
    goto :goto_a

    .line 385
    :cond_12
    const/4 v12, -0x1

    .line 386
    iget v8, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 387
    .line 388
    add-int/2addr v8, v3

    .line 389
    if-eq v11, v12, :cond_14

    .line 390
    .line 391
    const/16 v16, 0x1

    .line 392
    .line 393
    aget v20, v14, v16

    .line 394
    .line 395
    sub-int v20, v20, v11

    .line 396
    .line 397
    add-int v8, v20, v8

    .line 398
    .line 399
    goto :goto_a

    .line 400
    :cond_13
    const/4 v12, -0x1

    .line 401
    sub-int v8, v6, v18

    .line 402
    .line 403
    const/4 v11, 0x2

    .line 404
    div-int/2addr v8, v11

    .line 405
    add-int/2addr v8, v3

    .line 406
    iget v11, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 407
    .line 408
    add-int/2addr v8, v11

    .line 409
    iget v11, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 410
    .line 411
    sub-int/2addr v8, v11

    .line 412
    :cond_14
    :goto_a
    invoke-virtual {v0, v5}, Lo/A0;->i(I)Z

    .line 413
    .line 414
    .line 415
    move-result v5

    .line 416
    if-eqz v5, :cond_15

    .line 417
    .line 418
    iget v5, v0, Lo/A0;->q:I

    .line 419
    .line 420
    add-int/2addr v2, v5

    .line 421
    :cond_15
    iget v5, v1, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 422
    .line 423
    add-int/2addr v2, v5

    .line 424
    add-int v5, v2, v4

    .line 425
    .line 426
    add-int v11, v8, v18

    .line 427
    .line 428
    invoke-virtual {v7, v2, v8, v5, v11}, Landroid/view/View;->layout(IIII)V

    .line 429
    .line 430
    .line 431
    iget v1, v1, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 432
    .line 433
    add-int/2addr v4, v1

    .line 434
    add-int/2addr v4, v2

    .line 435
    move v2, v4

    .line 436
    :goto_b
    const/4 v1, 0x1

    .line 437
    goto :goto_c

    .line 438
    :cond_16
    move/from16 p4, v8

    .line 439
    .line 440
    move/from16 p5, v11

    .line 441
    .line 442
    move/from16 v19, v12

    .line 443
    .line 444
    const/4 v12, -0x1

    .line 445
    goto :goto_b

    .line 446
    :goto_c
    add-int/2addr v9, v1

    .line 447
    move/from16 v1, p3

    .line 448
    .line 449
    move/from16 v8, p4

    .line 450
    .line 451
    move/from16 v11, p5

    .line 452
    .line 453
    move/from16 v12, v19

    .line 454
    .line 455
    const/16 v5, 0x50

    .line 456
    .line 457
    const/16 v7, 0x10

    .line 458
    .line 459
    goto/16 :goto_8

    .line 460
    .line 461
    :cond_17
    return-void
.end method

.method public onMeasure(II)V
    .locals 37

    move-object/from16 v6, p0

    move/from16 v7, p1

    move/from16 v8, p2

    .line 1
    iget v0, v6, Lo/A0;->i:I

    const/4 v10, -0x2

    const/high16 v11, 0x40000000    # 2.0f

    const/16 v12, 0x8

    const/high16 v14, -0x80000000

    const/4 v15, 0x0

    const/4 v5, 0x0

    const/4 v4, 0x1

    if-ne v0, v4, :cond_28

    .line 2
    iput v5, v6, Lo/A0;->k:I

    .line 3
    invoke-virtual/range {p0 .. p0}, Lo/A0;->getVirtualChildCount()I

    move-result v3

    .line 4
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    .line 5
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 6
    iget v0, v6, Lo/A0;->g:I

    .line 7
    iget-boolean v9, v6, Lo/A0;->m:Z

    const/4 v13, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x1

    const/16 v25, 0x0

    :goto_0
    if-ge v13, v3, :cond_10

    .line 8
    invoke-virtual {v6, v13}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v26

    if-nez v26, :cond_0

    .line 9
    iget v4, v6, Lo/A0;->k:I

    iput v4, v6, Lo/A0;->k:I

    :goto_1
    move v10, v0

    move/from16 v29, v1

    move v1, v2

    move/from16 v31, v3

    move/from16 v3, v22

    const/16 v27, 0x1

    goto/16 :goto_d

    .line 10
    :cond_0
    invoke-virtual/range {v26 .. v26}, Landroid/view/View;->getVisibility()I

    move-result v4

    if-ne v4, v12, :cond_1

    goto :goto_1

    .line 11
    :cond_1
    invoke-virtual {v6, v13}, Lo/A0;->i(I)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 12
    iget v4, v6, Lo/A0;->k:I

    iget v5, v6, Lo/A0;->r:I

    add-int/2addr v4, v5

    iput v4, v6, Lo/A0;->k:I

    .line 13
    :cond_2
    invoke-virtual/range {v26 .. v26}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lo/z0;

    .line 14
    iget v4, v5, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    add-float v17, v17, v4

    if-ne v1, v11, :cond_3

    .line 15
    iget v12, v5, Landroid/widget/LinearLayout$LayoutParams;->height:I

    if-nez v12, :cond_3

    cmpl-float v12, v4, v15

    if-lez v12, :cond_3

    .line 16
    iget v4, v6, Lo/A0;->k:I

    .line 17
    iget v12, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v12, v4

    iget v11, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v12, v11

    invoke-static {v4, v12}, Ljava/lang/Math;->max(II)I

    move-result v4

    iput v4, v6, Lo/A0;->k:I

    move v10, v0

    move/from16 v29, v1

    move/from16 v30, v2

    move/from16 v31, v3

    move-object v15, v5

    const/4 v4, 0x1

    const/16 v27, 0x1

    goto :goto_4

    .line 18
    :cond_3
    iget v11, v5, Landroid/widget/LinearLayout$LayoutParams;->height:I

    if-nez v11, :cond_4

    cmpl-float v4, v4, v15

    if-lez v4, :cond_4

    .line 19
    iput v10, v5, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v11, 0x0

    goto :goto_2

    :cond_4
    const/high16 v11, -0x80000000

    :goto_2
    cmpl-float v4, v17, v15

    if-nez v4, :cond_5

    .line 20
    iget v4, v6, Lo/A0;->k:I

    move v12, v4

    goto :goto_3

    :cond_5
    const/4 v12, 0x0

    :goto_3
    const/4 v4, 0x0

    move v10, v0

    move-object/from16 v0, p0

    move/from16 v29, v1

    move-object/from16 v1, v26

    move/from16 v30, v2

    move/from16 v2, p1

    move/from16 v31, v3

    move v3, v4

    const/16 v27, 0x1

    move/from16 v4, p2

    move-object v15, v5

    move v5, v12

    .line 21
    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    if-eq v11, v14, :cond_6

    .line 22
    iput v11, v15, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 23
    :cond_6
    invoke-virtual/range {v26 .. v26}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    .line 24
    iget v1, v6, Lo/A0;->k:I

    add-int v2, v1, v0

    .line 25
    iget v3, v15, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v2, v3

    iget v3, v15, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v2, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v6, Lo/A0;->k:I

    move/from16 v5, v21

    if-eqz v9, :cond_7

    .line 26
    invoke-static {v0, v5}, Ljava/lang/Math;->max(II)I

    move-result v21

    :cond_7
    move/from16 v4, v20

    :goto_4
    if-ltz v10, :cond_8

    add-int/lit8 v0, v13, 0x1

    if-ne v10, v0, :cond_8

    .line 27
    iget v0, v6, Lo/A0;->k:I

    iput v0, v6, Lo/A0;->h:I

    :cond_8
    if-ge v13, v10, :cond_9

    .line 28
    iget v0, v15, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-gtz v0, :cond_a

    :cond_9
    move/from16 v1, v30

    const/high16 v0, 0x40000000    # 2.0f

    goto :goto_5

    .line 29
    :cond_a
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won\'t work.  Either remove the weight, or don\'t set mBaselineAlignedChildIndex."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_5
    if-eq v1, v0, :cond_b

    .line 30
    iget v0, v15, Landroid/widget/LinearLayout$LayoutParams;->width:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_b

    const/4 v5, 0x1

    const/16 v25, 0x1

    goto :goto_6

    :cond_b
    const/4 v5, 0x0

    .line 31
    :goto_6
    iget v0, v15, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    iget v2, v15, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v0, v2

    .line 32
    invoke-virtual/range {v26 .. v26}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    add-int/2addr v2, v0

    move/from16 v3, v22

    .line 33
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 34
    invoke-virtual/range {v26 .. v26}, Landroid/view/View;->getMeasuredState()I

    move-result v11

    move/from16 v12, v23

    .line 35
    invoke-static {v12, v11}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v11

    if-eqz v24, :cond_c

    .line 36
    iget v12, v15, Landroid/widget/LinearLayout$LayoutParams;->width:I

    const/4 v14, -0x1

    if-ne v12, v14, :cond_c

    const/4 v12, 0x1

    goto :goto_7

    :cond_c
    const/4 v12, 0x0

    .line 37
    :goto_7
    iget v14, v15, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    const/4 v15, 0x0

    cmpl-float v14, v14, v15

    if-lez v14, :cond_e

    if-eqz v5, :cond_d

    :goto_8
    move/from16 v14, v19

    goto :goto_9

    :cond_d
    move v0, v2

    goto :goto_8

    .line 38
    :goto_9
    invoke-static {v14, v0}, Ljava/lang/Math;->max(II)I

    move-result v19

    goto :goto_c

    :cond_e
    move/from16 v14, v19

    if-eqz v5, :cond_f

    :goto_a
    move/from16 v2, v18

    goto :goto_b

    :cond_f
    move v0, v2

    goto :goto_a

    .line 39
    :goto_b
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v18

    move/from16 v19, v14

    :goto_c
    move/from16 v20, v4

    move/from16 v23, v11

    move/from16 v24, v12

    :goto_d
    add-int/lit8 v13, v13, 0x1

    move v2, v1

    move/from16 v22, v3

    move v0, v10

    move/from16 v1, v29

    move/from16 v3, v31

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v10, -0x2

    const/high16 v11, 0x40000000    # 2.0f

    const/16 v12, 0x8

    const/high16 v14, -0x80000000

    const/4 v15, 0x0

    goto/16 :goto_0

    :cond_10
    move/from16 v29, v1

    move v1, v2

    move/from16 v31, v3

    move/from16 v2, v18

    move/from16 v14, v19

    move/from16 v5, v21

    move/from16 v3, v22

    move/from16 v12, v23

    const/16 v27, 0x1

    .line 40
    iget v0, v6, Lo/A0;->k:I

    move/from16 v10, v31

    if-lez v0, :cond_11

    invoke-virtual {v6, v10}, Lo/A0;->i(I)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 41
    iget v0, v6, Lo/A0;->k:I

    iget v4, v6, Lo/A0;->r:I

    add-int/2addr v0, v4

    iput v0, v6, Lo/A0;->k:I

    :cond_11
    move/from16 v4, v29

    if-eqz v9, :cond_15

    const/high16 v0, -0x80000000

    if-eq v4, v0, :cond_12

    if-nez v4, :cond_15

    :cond_12
    const/4 v11, 0x0

    .line 42
    iput v11, v6, Lo/A0;->k:I

    const/4 v0, 0x0

    :goto_e
    if-ge v0, v10, :cond_15

    .line 43
    invoke-virtual {v6, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v13

    if-nez v13, :cond_13

    .line 44
    iget v13, v6, Lo/A0;->k:I

    iput v13, v6, Lo/A0;->k:I

    goto :goto_f

    .line 45
    :cond_13
    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    move-result v15

    const/16 v11, 0x8

    if-ne v15, v11, :cond_14

    goto :goto_f

    .line 46
    :cond_14
    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v11

    check-cast v11, Lo/z0;

    .line 47
    iget v13, v6, Lo/A0;->k:I

    add-int v21, v13, v5

    .line 48
    iget v15, v11, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int v21, v21, v15

    iget v11, v11, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int v11, v21, v11

    invoke-static {v13, v11}, Ljava/lang/Math;->max(II)I

    move-result v11

    iput v11, v6, Lo/A0;->k:I

    :goto_f
    add-int/lit8 v0, v0, 0x1

    const/4 v11, 0x0

    goto :goto_e

    .line 49
    :cond_15
    iget v0, v6, Lo/A0;->k:I

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v11

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v13

    add-int/2addr v13, v11

    add-int/2addr v13, v0

    iput v13, v6, Lo/A0;->k:I

    .line 50
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-static {v13, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/4 v11, 0x0

    .line 51
    invoke-static {v0, v8, v11}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v0

    const v11, 0xffffff

    and-int/2addr v11, v0

    .line 52
    iget v13, v6, Lo/A0;->k:I

    sub-int/2addr v11, v13

    if-nez v20, :cond_1a

    if-eqz v11, :cond_16

    const/4 v13, 0x0

    cmpl-float v15, v17, v13

    if-lez v15, :cond_16

    goto :goto_13

    .line 53
    :cond_16
    invoke-static {v2, v14}, Ljava/lang/Math;->max(II)I

    move-result v2

    if-eqz v9, :cond_19

    const/high16 v9, 0x40000000    # 2.0f

    if-eq v4, v9, :cond_19

    const/4 v4, 0x0

    :goto_10
    if-ge v4, v10, :cond_19

    .line 54
    invoke-virtual {v6, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v9

    if-eqz v9, :cond_18

    .line 55
    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    move-result v11

    const/16 v13, 0x8

    if-ne v11, v13, :cond_17

    goto :goto_11

    .line 56
    :cond_17
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v11

    check-cast v11, Lo/z0;

    .line 57
    iget v11, v11, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    const/4 v13, 0x0

    cmpl-float v11, v11, v13

    if-lez v11, :cond_18

    .line 58
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredWidth()I

    move-result v11

    const/high16 v13, 0x40000000    # 2.0f

    invoke-static {v11, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v11

    .line 59
    invoke-static {v5, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v14

    .line 60
    invoke-virtual {v9, v11, v14}, Landroid/view/View;->measure(II)V

    :cond_18
    :goto_11
    add-int/lit8 v4, v4, 0x1

    goto :goto_10

    :cond_19
    :goto_12
    move/from16 v22, v3

    goto/16 :goto_1b

    .line 61
    :cond_1a
    :goto_13
    iget v5, v6, Lo/A0;->l:F

    const/4 v9, 0x0

    cmpl-float v13, v5, v9

    if-lez v13, :cond_1b

    move/from16 v17, v5

    :cond_1b
    const/4 v5, 0x0

    .line 62
    iput v5, v6, Lo/A0;->k:I

    const/4 v5, 0x0

    :goto_14
    if-ge v5, v10, :cond_25

    .line 63
    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v9

    .line 64
    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    move-result v13

    const/16 v14, 0x8

    if-ne v13, v14, :cond_1c

    move/from16 v29, v4

    goto/16 :goto_1a

    .line 65
    :cond_1c
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v13

    check-cast v13, Lo/z0;

    .line 66
    iget v14, v13, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    const/4 v15, 0x0

    cmpl-float v16, v14, v15

    if-lez v16, :cond_21

    int-to-float v15, v11

    mul-float v15, v15, v14

    div-float v15, v15, v17

    float-to-int v15, v15

    sub-float v17, v17, v14

    sub-int/2addr v11, v15

    .line 67
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v14

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v16

    add-int v16, v16, v14

    iget v14, v13, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int v16, v16, v14

    iget v14, v13, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int v14, v16, v14

    move/from16 v16, v11

    iget v11, v13, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 68
    invoke-static {v7, v14, v11}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v11

    .line 69
    iget v14, v13, Landroid/widget/LinearLayout$LayoutParams;->height:I

    if-nez v14, :cond_1f

    const/high16 v14, 0x40000000    # 2.0f

    if-eq v4, v14, :cond_1d

    goto :goto_16

    :cond_1d
    if-lez v15, :cond_1e

    goto :goto_15

    :cond_1e
    const/4 v15, 0x0

    .line 70
    :goto_15
    invoke-static {v15, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v15

    .line 71
    invoke-virtual {v9, v11, v15}, Landroid/view/View;->measure(II)V

    goto :goto_17

    :cond_1f
    const/high16 v14, 0x40000000    # 2.0f

    .line 72
    :goto_16
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredHeight()I

    move-result v18

    add-int v15, v18, v15

    if-gez v15, :cond_20

    const/4 v15, 0x0

    .line 73
    :cond_20
    invoke-static {v15, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v15

    .line 74
    invoke-virtual {v9, v11, v15}, Landroid/view/View;->measure(II)V

    .line 75
    :goto_17
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredState()I

    move-result v11

    and-int/lit16 v11, v11, -0x100

    .line 76
    invoke-static {v12, v11}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v12

    move/from16 v11, v16

    .line 77
    :cond_21
    iget v14, v13, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    iget v15, v13, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v14, v15

    .line 78
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredWidth()I

    move-result v15

    add-int/2addr v15, v14

    .line 79
    invoke-static {v3, v15}, Ljava/lang/Math;->max(II)I

    move-result v3

    move/from16 v16, v3

    const/high16 v3, 0x40000000    # 2.0f

    if-eq v1, v3, :cond_22

    .line 80
    iget v3, v13, Landroid/widget/LinearLayout$LayoutParams;->width:I

    move/from16 v29, v4

    const/4 v4, -0x1

    if-ne v3, v4, :cond_23

    goto :goto_18

    :cond_22
    move/from16 v29, v4

    const/4 v4, -0x1

    :cond_23
    move v14, v15

    .line 81
    :goto_18
    invoke-static {v2, v14}, Ljava/lang/Math;->max(II)I

    move-result v2

    if-eqz v24, :cond_24

    .line 82
    iget v3, v13, Landroid/widget/LinearLayout$LayoutParams;->width:I

    if-ne v3, v4, :cond_24

    const/4 v3, 0x1

    goto :goto_19

    :cond_24
    const/4 v3, 0x0

    .line 83
    :goto_19
    iget v4, v6, Lo/A0;->k:I

    .line 84
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    add-int/2addr v9, v4

    iget v14, v13, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v9, v14

    iget v13, v13, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v9, v13

    invoke-static {v4, v9}, Ljava/lang/Math;->max(II)I

    move-result v4

    iput v4, v6, Lo/A0;->k:I

    move/from16 v24, v3

    move/from16 v3, v16

    :goto_1a
    add-int/lit8 v5, v5, 0x1

    move/from16 v4, v29

    goto/16 :goto_14

    .line 85
    :cond_25
    iget v4, v6, Lo/A0;->k:I

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v9

    add-int/2addr v9, v5

    add-int/2addr v9, v4

    iput v9, v6, Lo/A0;->k:I

    goto/16 :goto_12

    :goto_1b
    if-nez v24, :cond_26

    const/high16 v3, 0x40000000    # 2.0f

    if-eq v1, v3, :cond_26

    goto :goto_1c

    :cond_26
    move/from16 v2, v22

    .line 86
    :goto_1c
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    add-int/2addr v3, v1

    add-int/2addr v3, v2

    .line 87
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    move-result v1

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 88
    invoke-static {v1, v7, v12}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v1

    invoke-virtual {v6, v1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    if-eqz v25, :cond_62

    .line 89
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    const/4 v9, 0x0

    :goto_1d
    if-ge v9, v10, :cond_62

    .line 90
    invoke-virtual {v6, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 91
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v2, 0x8

    if-eq v0, v2, :cond_27

    .line 92
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/z0;

    .line 93
    iget v0, v11, Landroid/widget/LinearLayout$LayoutParams;->width:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_27

    .line 94
    iget v12, v11, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 95
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iput v0, v11, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move v2, v7

    move/from16 v4, p2

    .line 96
    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 97
    iput v12, v11, Landroid/widget/LinearLayout$LayoutParams;->height:I

    :cond_27
    add-int/lit8 v9, v9, 0x1

    goto :goto_1d

    :cond_28
    const/4 v0, 0x0

    const/16 v27, 0x1

    .line 98
    iput v0, v6, Lo/A0;->k:I

    .line 99
    invoke-virtual/range {p0 .. p0}, Lo/A0;->getVirtualChildCount()I

    move-result v9

    .line 100
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v10

    .line 101
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v11

    .line 102
    iget-object v0, v6, Lo/A0;->n:[I

    const/4 v12, 0x4

    if-eqz v0, :cond_29

    iget-object v0, v6, Lo/A0;->o:[I

    if-nez v0, :cond_2a

    .line 103
    :cond_29
    new-array v0, v12, [I

    iput-object v0, v6, Lo/A0;->n:[I

    .line 104
    new-array v0, v12, [I

    iput-object v0, v6, Lo/A0;->o:[I

    .line 105
    :cond_2a
    iget-object v13, v6, Lo/A0;->n:[I

    .line 106
    iget-object v14, v6, Lo/A0;->o:[I

    const/4 v15, 0x3

    const/4 v0, -0x1

    .line 107
    aput v0, v13, v15

    const/16 v17, 0x2

    aput v0, v13, v17

    aput v0, v13, v27

    const/4 v1, 0x0

    aput v0, v13, v1

    .line 108
    aput v0, v14, v15

    aput v0, v14, v17

    aput v0, v14, v27

    aput v0, v14, v1

    .line 109
    iget-boolean v5, v6, Lo/A0;->f:Z

    .line 110
    iget-boolean v4, v6, Lo/A0;->m:Z

    const/high16 v0, 0x40000000    # 2.0f

    if-ne v10, v0, :cond_2b

    const/16 v18, 0x1

    goto :goto_1e

    :cond_2b
    const/16 v18, 0x0

    :goto_1e
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v19, 0x1

    const/16 v21, 0x0

    const/16 v24, 0x0

    :goto_1f
    if-ge v3, v9, :cond_3f

    .line 111
    invoke-virtual {v6, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    if-nez v7, :cond_2c

    .line 112
    iget v7, v6, Lo/A0;->k:I

    iput v7, v6, Lo/A0;->k:I

    move/from16 v25, v3

    move/from16 v26, v4

    move/from16 v30, v5

    goto/16 :goto_2c

    :cond_2c
    move/from16 v25, v0

    .line 113
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    move-result v0

    move/from16 v26, v2

    const/16 v2, 0x8

    if-ne v0, v2, :cond_2d

    move/from16 v30, v5

    move/from16 v0, v25

    move/from16 v2, v26

    move/from16 v25, v3

    move/from16 v26, v4

    goto/16 :goto_2c

    .line 114
    :cond_2d
    invoke-virtual {v6, v3}, Lo/A0;->i(I)Z

    move-result v0

    if-eqz v0, :cond_2e

    .line 115
    iget v0, v6, Lo/A0;->k:I

    iget v2, v6, Lo/A0;->q:I

    add-int/2addr v0, v2

    iput v0, v6, Lo/A0;->k:I

    .line 116
    :cond_2e
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/z0;

    .line 117
    iget v0, v2, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    add-float v29, v1, v0

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v10, v1, :cond_31

    .line 118
    iget v1, v2, Landroid/widget/LinearLayout$LayoutParams;->width:I

    if-nez v1, :cond_31

    const/4 v1, 0x0

    cmpl-float v30, v0, v1

    if-lez v30, :cond_31

    if-eqz v18, :cond_2f

    .line 119
    iget v0, v6, Lo/A0;->k:I

    iget v1, v2, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    move/from16 v30, v3

    iget v3, v2, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v1, v3

    add-int/2addr v1, v0

    iput v1, v6, Lo/A0;->k:I

    goto :goto_20

    :cond_2f
    move/from16 v30, v3

    .line 120
    iget v0, v6, Lo/A0;->k:I

    .line 121
    iget v1, v2, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v1, v0

    iget v3, v2, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v1, v3

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, v6, Lo/A0;->k:I

    :goto_20
    if-eqz v5, :cond_30

    const/4 v0, 0x0

    .line 122
    invoke-static {v0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 123
    invoke-virtual {v7, v1, v1}, Landroid/view/View;->measure(II)V

    move-object v0, v2

    move/from16 v33, v25

    move/from16 v34, v26

    move/from16 v25, v30

    move/from16 v26, v4

    move/from16 v30, v5

    goto/16 :goto_25

    :cond_30
    move-object v0, v2

    move/from16 v33, v25

    move/from16 v34, v26

    move/from16 v25, v30

    const/high16 v1, 0x40000000    # 2.0f

    move/from16 v26, v4

    move/from16 v30, v5

    const/4 v4, 0x1

    goto/16 :goto_26

    :cond_31
    move/from16 v30, v3

    .line 124
    iget v1, v2, Landroid/widget/LinearLayout$LayoutParams;->width:I

    if-nez v1, :cond_32

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_33

    const/4 v0, -0x2

    .line 125
    iput v0, v2, Landroid/widget/LinearLayout$LayoutParams;->width:I

    const/4 v3, 0x0

    goto :goto_21

    :cond_32
    const/4 v1, 0x0

    :cond_33
    const/high16 v3, -0x80000000

    :goto_21
    cmpl-float v0, v29, v1

    if-nez v0, :cond_34

    .line 126
    iget v0, v6, Lo/A0;->k:I

    move/from16 v31, v0

    goto :goto_22

    :cond_34
    const/16 v31, 0x0

    :goto_22
    const/16 v32, 0x0

    move/from16 v1, v25

    move-object/from16 v0, p0

    move/from16 v33, v1

    move-object v1, v7

    move-object/from16 v35, v2

    move/from16 v34, v26

    move/from16 v2, p1

    move/from16 v36, v3

    move/from16 v25, v30

    move/from16 v3, v31

    move/from16 v26, v4

    move/from16 v4, p2

    move/from16 v30, v5

    move/from16 v5, v32

    .line 127
    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    move/from16 v1, v36

    const/high16 v0, -0x80000000

    if-eq v1, v0, :cond_35

    move-object/from16 v0, v35

    .line 128
    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->width:I

    goto :goto_23

    :cond_35
    move-object/from16 v0, v35

    .line 129
    :goto_23
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    if-eqz v18, :cond_36

    .line 130
    iget v2, v6, Lo/A0;->k:I

    iget v3, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v3, v1

    iget v4, v0, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v3, v4

    add-int/2addr v3, v2

    .line 131
    iput v3, v6, Lo/A0;->k:I

    goto :goto_24

    .line 132
    :cond_36
    iget v2, v6, Lo/A0;->k:I

    add-int v3, v2, v1

    .line 133
    iget v4, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v3, v4

    iget v4, v0, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v3, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iput v2, v6, Lo/A0;->k:I

    :goto_24
    if-eqz v26, :cond_37

    .line 134
    invoke-static {v1, v12}, Ljava/lang/Math;->max(II)I

    move-result v12

    :cond_37
    :goto_25
    move/from16 v4, v21

    const/high16 v1, 0x40000000    # 2.0f

    :goto_26
    if-eq v11, v1, :cond_38

    .line 135
    iget v1, v0, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_38

    const/4 v5, 0x1

    const/16 v24, 0x1

    goto :goto_27

    :cond_38
    const/4 v5, 0x0

    .line 136
    :goto_27
    iget v1, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    iget v2, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v1, v2

    .line 137
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    add-int/2addr v2, v1

    .line 138
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredState()I

    move-result v3

    invoke-static {v8, v3}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v3

    if-eqz v30, :cond_3a

    .line 139
    invoke-virtual {v7}, Landroid/view/View;->getBaseline()I

    move-result v7

    const/4 v8, -0x1

    if-eq v7, v8, :cond_3a

    .line 140
    iget v8, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    if-gez v8, :cond_39

    iget v8, v6, Lo/A0;->j:I

    :cond_39
    and-int/lit8 v8, v8, 0x70

    const/16 v21, 0x4

    shr-int/lit8 v8, v8, 0x4

    const/16 v21, -0x2

    and-int/lit8 v8, v8, -0x2

    shr-int/lit8 v8, v8, 0x1

    move/from16 v21, v1

    .line 141
    aget v1, v13, v8

    invoke-static {v1, v7}, Ljava/lang/Math;->max(II)I

    move-result v1

    aput v1, v13, v8

    .line 142
    aget v1, v14, v8

    sub-int v7, v2, v7

    invoke-static {v1, v7}, Ljava/lang/Math;->max(II)I

    move-result v1

    aput v1, v14, v8

    :goto_28
    move/from16 v7, v34

    goto :goto_29

    :cond_3a
    move/from16 v21, v1

    goto :goto_28

    .line 143
    :goto_29
    invoke-static {v7, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-eqz v19, :cond_3b

    .line 144
    iget v7, v0, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v8, -0x1

    if-ne v7, v8, :cond_3b

    const/4 v7, 0x1

    goto :goto_2a

    :cond_3b
    const/4 v7, 0x0

    .line 145
    :goto_2a
    iget v0, v0, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    const/4 v8, 0x0

    cmpl-float v0, v0, v8

    if-lez v0, :cond_3d

    if-eqz v5, :cond_3c

    move/from16 v2, v21

    .line 146
    :cond_3c
    invoke-static {v15, v2}, Ljava/lang/Math;->max(II)I

    move-result v15

    move/from16 v0, v33

    goto :goto_2b

    :cond_3d
    if-eqz v5, :cond_3e

    move/from16 v2, v21

    :cond_3e
    move/from16 v0, v33

    .line 147
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    :goto_2b
    move v2, v1

    move v8, v3

    move/from16 v21, v4

    move/from16 v19, v7

    move/from16 v1, v29

    :goto_2c
    add-int/lit8 v3, v25, 0x1

    move/from16 v7, p1

    move/from16 v4, v26

    move/from16 v5, v30

    goto/16 :goto_1f

    :cond_3f
    move v7, v2

    move/from16 v26, v4

    move/from16 v30, v5

    .line 148
    iget v2, v6, Lo/A0;->k:I

    if-lez v2, :cond_40

    invoke-virtual {v6, v9}, Lo/A0;->i(I)Z

    move-result v2

    if-eqz v2, :cond_40

    .line 149
    iget v2, v6, Lo/A0;->k:I

    iget v3, v6, Lo/A0;->q:I

    add-int/2addr v2, v3

    iput v2, v6, Lo/A0;->k:I

    .line 150
    :cond_40
    aget v2, v13, v27

    const/4 v3, -0x1

    if-ne v2, v3, :cond_42

    const/4 v4, 0x0

    aget v5, v13, v4

    if-ne v5, v3, :cond_42

    aget v4, v13, v17

    if-ne v4, v3, :cond_42

    const/4 v4, 0x3

    aget v5, v13, v4

    if-eq v5, v3, :cond_41

    goto :goto_2d

    :cond_41
    move v2, v7

    move/from16 v25, v8

    goto :goto_2e

    :cond_42
    const/4 v4, 0x3

    .line 151
    :goto_2d
    aget v3, v13, v4

    const/4 v5, 0x0

    aget v4, v13, v5

    aget v5, v13, v17

    .line 152
    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 153
    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 154
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    const/4 v3, 0x3

    .line 155
    aget v4, v14, v3

    const/4 v3, 0x0

    aget v5, v14, v3

    aget v3, v14, v27

    move/from16 v25, v8

    aget v8, v14, v17

    .line 156
    invoke-static {v3, v8}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 157
    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 158
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    add-int/2addr v3, v2

    .line 159
    invoke-static {v7, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    :goto_2e
    if-eqz v26, :cond_47

    const/high16 v3, -0x80000000

    if-eq v10, v3, :cond_43

    if-nez v10, :cond_47

    :cond_43
    const/4 v3, 0x0

    .line 160
    iput v3, v6, Lo/A0;->k:I

    const/4 v5, 0x0

    :goto_2f
    if-ge v5, v9, :cond_47

    .line 161
    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    if-nez v3, :cond_44

    .line 162
    iget v3, v6, Lo/A0;->k:I

    iput v3, v6, Lo/A0;->k:I

    goto :goto_30

    .line 163
    :cond_44
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v4

    const/16 v7, 0x8

    if-ne v4, v7, :cond_45

    goto :goto_30

    .line 164
    :cond_45
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Lo/z0;

    if-eqz v18, :cond_46

    .line 165
    iget v4, v6, Lo/A0;->k:I

    iget v7, v3, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v7, v12

    iget v3, v3, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v7, v3

    add-int/2addr v7, v4

    .line 166
    iput v7, v6, Lo/A0;->k:I

    goto :goto_30

    .line 167
    :cond_46
    iget v4, v6, Lo/A0;->k:I

    add-int v7, v4, v12

    .line 168
    iget v8, v3, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v7, v8

    iget v3, v3, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v7, v3

    invoke-static {v4, v7}, Ljava/lang/Math;->max(II)I

    move-result v3

    iput v3, v6, Lo/A0;->k:I

    :goto_30
    add-int/lit8 v5, v5, 0x1

    goto :goto_2f

    .line 169
    :cond_47
    iget v3, v6, Lo/A0;->k:I

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v5

    add-int/2addr v5, v4

    add-int/2addr v5, v3

    iput v5, v6, Lo/A0;->k:I

    .line 170
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    move-result v3

    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    move/from16 v7, p1

    const/4 v4, 0x0

    .line 171
    invoke-static {v3, v7, v4}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v3

    const v4, 0xffffff

    and-int/2addr v4, v3

    .line 172
    iget v5, v6, Lo/A0;->k:I

    sub-int/2addr v4, v5

    if-nez v21, :cond_4c

    if-eqz v4, :cond_48

    const/4 v8, 0x0

    cmpl-float v16, v1, v8

    if-lez v16, :cond_48

    goto :goto_33

    .line 173
    :cond_48
    invoke-static {v0, v15}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-eqz v26, :cond_4b

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v10, v1, :cond_4b

    const/4 v1, 0x0

    :goto_31
    if-ge v1, v9, :cond_4b

    .line 174
    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_4a

    .line 175
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v8

    const/16 v10, 0x8

    if-ne v8, v10, :cond_49

    goto :goto_32

    .line 176
    :cond_49
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    check-cast v8, Lo/z0;

    .line 177
    iget v8, v8, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    const/4 v10, 0x0

    cmpl-float v8, v8, v10

    if-lez v8, :cond_4a

    const/high16 v8, 0x40000000    # 2.0f

    .line 178
    invoke-static {v12, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    .line 179
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v13

    invoke-static {v13, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v13

    .line 180
    invoke-virtual {v4, v10, v13}, Landroid/view/View;->measure(II)V

    :cond_4a
    :goto_32
    add-int/lit8 v1, v1, 0x1

    goto :goto_31

    :cond_4b
    move/from16 v4, p2

    move/from16 v22, v9

    const/4 v8, 0x0

    goto/16 :goto_42

    .line 181
    :cond_4c
    :goto_33
    iget v2, v6, Lo/A0;->l:F

    const/4 v8, 0x0

    cmpl-float v12, v2, v8

    if-lez v12, :cond_4d

    move v1, v2

    :cond_4d
    const/4 v2, -0x1

    const/4 v8, 0x3

    .line 182
    aput v2, v13, v8

    aput v2, v13, v17

    aput v2, v13, v27

    const/4 v12, 0x0

    aput v2, v13, v12

    .line 183
    aput v2, v14, v8

    aput v2, v14, v17

    aput v2, v14, v27

    aput v2, v14, v12

    .line 184
    iput v12, v6, Lo/A0;->k:I

    move/from16 v12, v25

    const/4 v2, -0x1

    const/4 v8, 0x0

    :goto_34
    if-ge v8, v9, :cond_5c

    .line 185
    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v15

    if-eqz v15, :cond_4e

    .line 186
    invoke-virtual {v15}, Landroid/view/View;->getVisibility()I

    move-result v5

    const/16 v7, 0x8

    if-ne v5, v7, :cond_4f

    :cond_4e
    move v7, v4

    move/from16 v22, v9

    const/16 v21, 0x0

    const/16 v23, 0x4

    const/16 v28, -0x2

    move/from16 v4, p2

    goto/16 :goto_3f

    .line 187
    :cond_4f
    invoke-virtual {v15}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Lo/z0;

    .line 188
    iget v7, v5, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    const/16 v21, 0x0

    cmpl-float v22, v7, v21

    if-lez v22, :cond_54

    move/from16 v22, v9

    int-to-float v9, v4

    mul-float v9, v9, v7

    div-float/2addr v9, v1

    float-to-int v9, v9

    sub-float/2addr v1, v7

    sub-int/2addr v4, v9

    .line 189
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v25

    add-int v25, v25, v7

    iget v7, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int v25, v25, v7

    iget v7, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int v7, v25, v7

    move/from16 v25, v1

    iget v1, v5, Landroid/widget/LinearLayout$LayoutParams;->height:I

    move/from16 v26, v4

    move/from16 v4, p2

    .line 190
    invoke-static {v4, v7, v1}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v1

    .line 191
    iget v7, v5, Landroid/widget/LinearLayout$LayoutParams;->width:I

    if-nez v7, :cond_52

    const/high16 v7, 0x40000000    # 2.0f

    if-eq v10, v7, :cond_50

    goto :goto_36

    :cond_50
    if-lez v9, :cond_51

    goto :goto_35

    :cond_51
    const/4 v9, 0x0

    .line 192
    :goto_35
    invoke-static {v9, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v9

    invoke-virtual {v15, v9, v1}, Landroid/view/View;->measure(II)V

    goto :goto_37

    :cond_52
    const/high16 v7, 0x40000000    # 2.0f

    .line 193
    :goto_36
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredWidth()I

    move-result v28

    add-int v9, v28, v9

    if-gez v9, :cond_53

    const/4 v9, 0x0

    .line 194
    :cond_53
    invoke-static {v9, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v9

    .line 195
    invoke-virtual {v15, v9, v1}, Landroid/view/View;->measure(II)V

    .line 196
    :goto_37
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredState()I

    move-result v1

    const/high16 v7, -0x1000000

    and-int/2addr v1, v7

    .line 197
    invoke-static {v12, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v12

    move/from16 v1, v25

    move/from16 v7, v26

    goto :goto_38

    :cond_54
    move v7, v4

    move/from16 v22, v9

    move/from16 v4, p2

    :goto_38
    if-eqz v18, :cond_55

    .line 198
    iget v9, v6, Lo/A0;->k:I

    invoke-virtual {v15}, Landroid/view/View;->getMeasuredWidth()I

    move-result v25

    move/from16 v26, v1

    iget v1, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int v25, v25, v1

    iget v1, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int v25, v25, v1

    add-int v1, v25, v9

    .line 199
    iput v1, v6, Lo/A0;->k:I

    move/from16 v25, v7

    :goto_39
    const/high16 v1, 0x40000000    # 2.0f

    goto :goto_3a

    :cond_55
    move/from16 v26, v1

    .line 200
    iget v1, v6, Lo/A0;->k:I

    .line 201
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    add-int/2addr v9, v1

    move/from16 v25, v7

    iget v7, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v9, v7

    iget v7, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v9, v7

    invoke-static {v1, v9}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v6, Lo/A0;->k:I

    goto :goto_39

    :goto_3a
    if-eq v11, v1, :cond_56

    .line 202
    iget v1, v5, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v7, -0x1

    if-ne v1, v7, :cond_56

    const/4 v1, 0x1

    goto :goto_3b

    :cond_56
    const/4 v1, 0x0

    .line 203
    :goto_3b
    iget v7, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    iget v9, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v7, v9

    .line 204
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    add-int/2addr v9, v7

    .line 205
    invoke-static {v2, v9}, Ljava/lang/Math;->max(II)I

    move-result v2

    if-eqz v1, :cond_57

    goto :goto_3c

    :cond_57
    move v7, v9

    .line 206
    :goto_3c
    invoke-static {v0, v7}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-eqz v19, :cond_58

    .line 207
    iget v1, v5, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v7, -0x1

    if-ne v1, v7, :cond_59

    const/4 v1, 0x1

    goto :goto_3d

    :cond_58
    const/4 v7, -0x1

    :cond_59
    const/4 v1, 0x0

    :goto_3d
    if-eqz v30, :cond_5b

    .line 208
    invoke-virtual {v15}, Landroid/view/View;->getBaseline()I

    move-result v15

    if-eq v15, v7, :cond_5b

    .line 209
    iget v5, v5, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    if-gez v5, :cond_5a

    iget v5, v6, Lo/A0;->j:I

    :cond_5a
    and-int/lit8 v5, v5, 0x70

    const/16 v23, 0x4

    shr-int/lit8 v5, v5, 0x4

    const/16 v28, -0x2

    and-int/lit8 v5, v5, -0x2

    shr-int/lit8 v5, v5, 0x1

    .line 210
    aget v7, v13, v5

    invoke-static {v7, v15}, Ljava/lang/Math;->max(II)I

    move-result v7

    aput v7, v13, v5

    .line 211
    aget v7, v14, v5

    sub-int/2addr v9, v15

    invoke-static {v7, v9}, Ljava/lang/Math;->max(II)I

    move-result v7

    aput v7, v14, v5

    goto :goto_3e

    :cond_5b
    const/16 v23, 0x4

    const/16 v28, -0x2

    :goto_3e
    move/from16 v19, v1

    move/from16 v7, v25

    move/from16 v1, v26

    :goto_3f
    add-int/lit8 v8, v8, 0x1

    move v4, v7

    move/from16 v9, v22

    move/from16 v7, p1

    goto/16 :goto_34

    :cond_5c
    move/from16 v4, p2

    move/from16 v22, v9

    .line 212
    iget v1, v6, Lo/A0;->k:I

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v7

    add-int/2addr v7, v5

    add-int/2addr v7, v1

    iput v7, v6, Lo/A0;->k:I

    .line 213
    aget v1, v13, v27

    const/4 v5, -0x1

    if-ne v1, v5, :cond_5e

    const/4 v7, 0x0

    aget v8, v13, v7

    if-ne v8, v5, :cond_5e

    aget v7, v13, v17

    if-ne v7, v5, :cond_5e

    const/4 v7, 0x3

    aget v8, v13, v7

    if-eq v8, v5, :cond_5d

    goto :goto_40

    :cond_5d
    const/4 v8, 0x0

    goto :goto_41

    :cond_5e
    const/4 v7, 0x3

    .line 214
    :goto_40
    aget v5, v13, v7

    const/4 v8, 0x0

    aget v9, v13, v8

    aget v10, v13, v17

    .line 215
    invoke-static {v1, v10}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 216
    invoke-static {v9, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 217
    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 218
    aget v5, v14, v7

    aget v7, v14, v8

    aget v9, v14, v27

    aget v10, v14, v17

    .line 219
    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    move-result v9

    .line 220
    invoke-static {v7, v9}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 221
    invoke-static {v5, v7}, Ljava/lang/Math;->max(II)I

    move-result v5

    add-int/2addr v5, v1

    .line 222
    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    move-result v1

    move v2, v1

    :goto_41
    move/from16 v25, v12

    :goto_42
    if-nez v19, :cond_5f

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v11, v1, :cond_5f

    goto :goto_43

    :cond_5f
    move v0, v2

    .line 223
    :goto_43
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    add-int/2addr v2, v1

    add-int/2addr v2, v0

    .line 224
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/high16 v1, -0x1000000

    and-int v1, v25, v1

    or-int/2addr v1, v3

    shl-int/lit8 v2, v25, 0x10

    .line 225
    invoke-static {v0, v4, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v0

    .line 226
    invoke-virtual {v6, v1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    if-eqz v24, :cond_62

    .line 227
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    move/from16 v9, v22

    :goto_44
    if-ge v8, v9, :cond_62

    .line 228
    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 229
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v10, 0x8

    if-eq v0, v10, :cond_60

    .line 230
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/z0;

    .line 231
    iget v0, v11, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v12, -0x1

    if-ne v0, v12, :cond_61

    .line 232
    iget v13, v11, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 233
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iput v0, v11, Landroid/widget/LinearLayout$LayoutParams;->width:I

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move/from16 v2, p1

    move v4, v7

    .line 234
    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 235
    iput v13, v11, Landroid/widget/LinearLayout$LayoutParams;->width:I

    goto :goto_45

    :cond_60
    const/4 v12, -0x1

    :cond_61
    :goto_45
    add-int/lit8 v8, v8, 0x1

    goto :goto_44

    :cond_62
    return-void
.end method

.method public setBaselineAligned(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lo/A0;->f:Z

    .line 2
    .line 3
    return-void
.end method

.method public setBaselineAlignedChildIndex(I)V
    .locals 2

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ge p1, v0, :cond_0

    .line 8
    .line 9
    iput p1, p0, Lo/A0;->g:I

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v1, "base aligned child index out of range (0, "

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ")"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1
.end method

.method public setDividerDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lo/A0;->p:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-object p1, p0, Lo/A0;->p:Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iput v1, p0, Lo/A0;->q:I

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iput v1, p0, Lo/A0;->r:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iput v0, p0, Lo/A0;->q:I

    .line 25
    .line 26
    iput v0, p0, Lo/A0;->r:I

    .line 27
    .line 28
    :goto_0
    if-nez p1, :cond_2

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    :cond_2
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public setDividerPadding(I)V
    .locals 0

    .line 1
    iput p1, p0, Lo/A0;->t:I

    .line 2
    .line 3
    return-void
.end method

.method public setGravity(I)V
    .locals 1

    .line 1
    iget v0, p0, Lo/A0;->j:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_2

    .line 4
    .line 5
    const v0, 0x800007

    .line 6
    .line 7
    .line 8
    and-int/2addr v0, p1

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const v0, 0x800003

    .line 12
    .line 13
    .line 14
    or-int/2addr p1, v0

    .line 15
    :cond_0
    and-int/lit8 v0, p1, 0x70

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    or-int/lit8 p1, p1, 0x30

    .line 20
    .line 21
    :cond_1
    iput p1, p0, Lo/A0;->j:I

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 24
    .line 25
    .line 26
    :cond_2
    return-void
.end method

.method public setHorizontalGravity(I)V
    .locals 2

    .line 1
    const v0, 0x800007

    .line 2
    .line 3
    .line 4
    and-int/2addr p1, v0

    .line 5
    iget v1, p0, Lo/A0;->j:I

    .line 6
    .line 7
    and-int/2addr v0, v1

    .line 8
    if-eq v0, p1, :cond_0

    .line 9
    .line 10
    const v0, -0x800008

    .line 11
    .line 12
    .line 13
    and-int/2addr v0, v1

    .line 14
    or-int/2addr p1, v0

    .line 15
    iput p1, p0, Lo/A0;->j:I

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public setMeasureWithLargestChildEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lo/A0;->m:Z

    .line 2
    .line 3
    return-void
.end method

.method public setOrientation(I)V
    .locals 1

    .line 1
    iget v0, p0, Lo/A0;->i:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lo/A0;->i:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setShowDividers(I)V
    .locals 1

    .line 1
    iget v0, p0, Lo/A0;->s:I

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput p1, p0, Lo/A0;->s:I

    .line 9
    .line 10
    return-void
.end method

.method public setVerticalGravity(I)V
    .locals 2

    .line 1
    and-int/lit8 p1, p1, 0x70

    .line 2
    .line 3
    iget v0, p0, Lo/A0;->j:I

    .line 4
    .line 5
    and-int/lit8 v1, v0, 0x70

    .line 6
    .line 7
    if-eq v1, p1, :cond_0

    .line 8
    .line 9
    and-int/lit8 v0, v0, -0x71

    .line 10
    .line 11
    or-int/2addr p1, v0

    .line 12
    iput p1, p0, Lo/A0;->j:I

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public setWeightSum(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    iput p1, p0, Lo/A0;->l:F

    .line 7
    .line 8
    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method
