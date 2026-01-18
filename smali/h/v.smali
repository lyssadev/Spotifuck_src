.class public final Lh/v;
.super Lp0/a;
.source "SourceFile"


# instance fields
.field public final synthetic o:I

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lh/v;->o:I

    iput-object p2, p0, Lh/v;->p:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lh/v;->p:Ljava/lang/Object;

    .line 5
    .line 6
    iget v3, p0, Lh/v;->o:I

    .line 7
    .line 8
    packed-switch v3, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast v2, LE/j;

    .line 12
    .line 13
    iget-object v0, v2, LE/j;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lh/D;

    .line 16
    .line 17
    iget-object v0, v0, Lh/D;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 18
    .line 19
    const/16 v3, 0x8

    .line 20
    .line 21
    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    iget-object v0, v2, LE/j;->h:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lh/D;

    .line 27
    .line 28
    iget-object v2, v0, Lh/D;->B:Landroid/widget/PopupWindow;

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    invoke-virtual {v2}, Landroid/widget/PopupWindow;->dismiss()V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object v2, v0, Lh/D;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 37
    .line 38
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    instance-of v2, v2, Landroid/view/View;

    .line 43
    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    iget-object v2, v0, Lh/D;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 47
    .line 48
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, Landroid/view/View;

    .line 53
    .line 54
    sget-object v3, LN/Q;->a:Ljava/util/WeakHashMap;

    .line 55
    .line 56
    invoke-static {v2}, LN/D;->c(Landroid/view/View;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    :goto_0
    iget-object v2, v0, Lh/D;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 60
    .line 61
    invoke-virtual {v2}, Landroidx/appcompat/widget/ActionBarContextView;->e()V

    .line 62
    .line 63
    .line 64
    iget-object v2, v0, Lh/D;->D:LN/Z;

    .line 65
    .line 66
    invoke-virtual {v2, v1}, LN/Z;->d(LN/a0;)V

    .line 67
    .line 68
    .line 69
    iput-object v1, v0, Lh/D;->D:LN/Z;

    .line 70
    .line 71
    iget-object v0, v0, Lh/D;->G:Landroid/view/ViewGroup;

    .line 72
    .line 73
    sget-object v1, LN/Q;->a:Ljava/util/WeakHashMap;

    .line 74
    .line 75
    invoke-static {v0}, LN/D;->c(Landroid/view/View;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :pswitch_0
    check-cast v2, Lh/D;

    .line 80
    .line 81
    iget-object v3, v2, Lh/D;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 82
    .line 83
    invoke-virtual {v3, v0}, Landroid/view/View;->setAlpha(F)V

    .line 84
    .line 85
    .line 86
    iget-object v0, v2, Lh/D;->D:LN/Z;

    .line 87
    .line 88
    invoke-virtual {v0, v1}, LN/Z;->d(LN/a0;)V

    .line 89
    .line 90
    .line 91
    iput-object v1, v2, Lh/D;->D:LN/Z;

    .line 92
    .line 93
    return-void

    .line 94
    :pswitch_1
    check-cast v2, Lh/t;

    .line 95
    .line 96
    iget-object v3, v2, Lh/t;->b:Lh/D;

    .line 97
    .line 98
    iget-object v3, v3, Lh/D;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 99
    .line 100
    invoke-virtual {v3, v0}, Landroid/view/View;->setAlpha(F)V

    .line 101
    .line 102
    .line 103
    iget-object v0, v2, Lh/t;->b:Lh/D;

    .line 104
    .line 105
    iget-object v2, v0, Lh/D;->D:LN/Z;

    .line 106
    .line 107
    invoke-virtual {v2, v1}, LN/Z;->d(LN/a0;)V

    .line 108
    .line 109
    .line 110
    iput-object v1, v0, Lh/D;->D:LN/Z;

    .line 111
    .line 112
    return-void

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lh/v;->p:Ljava/lang/Object;

    .line 3
    .line 4
    iget v2, p0, Lh/v;->o:I

    .line 5
    .line 6
    packed-switch v2, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    check-cast v1, Lh/D;

    .line 11
    .line 12
    iget-object v2, v1, Lh/D;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 13
    .line 14
    invoke-virtual {v2, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    iget-object v0, v1, Lh/D;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    instance-of v0, v0, Landroid/view/View;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, v1, Lh/D;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Landroid/view/View;

    .line 34
    .line 35
    sget-object v1, LN/Q;->a:Ljava/util/WeakHashMap;

    .line 36
    .line 37
    invoke-static {v0}, LN/D;->c(Landroid/view/View;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void

    .line 41
    :pswitch_1
    check-cast v1, Lh/t;

    .line 42
    .line 43
    iget-object v1, v1, Lh/t;->b:Lh/D;

    .line 44
    .line 45
    iget-object v1, v1, Lh/D;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 46
    .line 47
    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
