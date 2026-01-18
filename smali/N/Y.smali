.class public final LN/Y;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LN/Y;->a:I

    iput-object p2, p0, LN/Y;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method

.method public constructor <init>(LN/a0;Landroid/view/View;)V
    .locals 0

    const/4 p2, 0x0

    iput p2, p0, LN/Y;->a:I

    .line 2
    iput-object p1, p0, LN/Y;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget v0, p0, LN/Y;->a:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationCancel(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :sswitch_0
    const/4 p1, 0x0

    .line 11
    iget-object v0, p0, LN/Y;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 14
    .line 15
    iput-object p1, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->B:Landroid/view/ViewPropertyAnimator;

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-boolean p1, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->o:Z

    .line 19
    .line 20
    return-void

    .line 21
    :sswitch_1
    iget-object p1, p0, LN/Y;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p1, LN/a0;

    .line 24
    .line 25
    invoke-interface {p1}, LN/a0;->b()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x3 -> :sswitch_0
    .end sparse-switch
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    .line 1
    iget v0, p0, LN/Y;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LN/Y;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p1, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->h:Landroid/view/ViewPropertyAnimator;

    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    new-instance p1, Ljava/util/ArrayList;

    .line 15
    .line 16
    iget-object v0, p0, LN/Y;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lo0/f;

    .line 19
    .line 20
    iget-object v1, v0, Lo0/f;->j:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/4 v2, 0x0

    .line 30
    :goto_0
    if-ge v2, v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Ly0/a;

    .line 37
    .line 38
    iget-object v3, v3, Ly0/a;->b:Ly0/c;

    .line 39
    .line 40
    iget-object v3, v3, Ly0/c;->t:Landroid/content/res/ColorStateList;

    .line 41
    .line 42
    if-eqz v3, :cond_0

    .line 43
    .line 44
    invoke-static {v0, v3}, LG/a;->h(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    return-void

    .line 51
    :pswitch_1
    const/4 p1, 0x0

    .line 52
    iget-object v0, p0, LN/Y;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 55
    .line 56
    iput-object p1, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->B:Landroid/view/ViewPropertyAnimator;

    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    iput-boolean p1, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->o:Z

    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_2
    iget-object v0, p0, LN/Y;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Ln0/m;

    .line 65
    .line 66
    invoke-virtual {v0}, Ln0/m;->m()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, p0}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_3
    iget-object p1, p0, LN/Y;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p1, LN0/l;

    .line 76
    .line 77
    invoke-virtual {p1}, LN0/r;->q()V

    .line 78
    .line 79
    .line 80
    iget-object p1, p1, LN0/l;->r:Landroid/animation/ValueAnimator;

    .line 81
    .line 82
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :pswitch_4
    iget-object p1, p0, LN/Y;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast p1, LN/a0;

    .line 89
    .line 90
    invoke-interface {p1}, LN/a0;->a()V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 6

    .line 1
    iget v0, p0, LN/Y;->a:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :sswitch_0
    new-instance p1, Ljava/util/ArrayList;

    .line 11
    .line 12
    iget-object v0, p0, LN/Y;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lo0/f;

    .line 15
    .line 16
    iget-object v1, v0, Lo0/f;->j:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x0

    .line 26
    :goto_0
    if-ge v2, v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Ly0/a;

    .line 33
    .line 34
    iget-object v3, v3, Ly0/a;->b:Ly0/c;

    .line 35
    .line 36
    iget-object v4, v3, Ly0/c;->t:Landroid/content/res/ColorStateList;

    .line 37
    .line 38
    if-eqz v4, :cond_0

    .line 39
    .line 40
    iget-object v3, v3, Ly0/c;->x:[I

    .line 41
    .line 42
    invoke-virtual {v4}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    invoke-virtual {v4, v3, v5}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    invoke-static {v0, v3}, LG/a;->g(Landroid/graphics/drawable/Drawable;I)V

    .line 51
    .line 52
    .line 53
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    return-void

    .line 57
    :sswitch_1
    iget-object p1, p0, LN/Y;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, LN/a0;

    .line 60
    .line 61
    invoke-interface {p1}, LN/a0;->c()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x4 -> :sswitch_0
    .end sparse-switch
.end method
