.class public final Ln/f;
.super Ln/t;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public A:Z

.field public B:Ln/w;

.field public C:Landroid/view/ViewTreeObserver;

.field public D:Ln/u;

.field public E:Z

.field public final g:Landroid/content/Context;

.field public final h:I

.field public final i:I

.field public final j:Z

.field public final k:Landroid/os/Handler;

.field public final l:Ljava/util/ArrayList;

.field public final m:Ljava/util/ArrayList;

.field public final n:Ln/d;

.field public final o:LN0/o;

.field public final p:Lj0/w;

.field public q:I

.field public r:I

.field public s:Landroid/view/View;

.field public t:Landroid/view/View;

.field public u:I

.field public v:Z

.field public w:Z

.field public x:I

.field public y:I

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;IZ)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ln/f;->l:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Ln/f;->m:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Ln/d;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v0, v1, p0}, Ln/d;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Ln/f;->n:Ln/d;

    .line 25
    .line 26
    new-instance v0, LN0/o;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    invoke-direct {v0, v1, p0}, LN0/o;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Ln/f;->o:LN0/o;

    .line 33
    .line 34
    new-instance v0, Lj0/w;

    .line 35
    .line 36
    invoke-direct {v0, p0}, Lj0/w;-><init>(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Ln/f;->p:Lj0/w;

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    iput v0, p0, Ln/f;->q:I

    .line 43
    .line 44
    iput v0, p0, Ln/f;->r:I

    .line 45
    .line 46
    iput-object p1, p0, Ln/f;->g:Landroid/content/Context;

    .line 47
    .line 48
    iput-object p2, p0, Ln/f;->s:Landroid/view/View;

    .line 49
    .line 50
    iput p3, p0, Ln/f;->i:I

    .line 51
    .line 52
    iput-boolean p4, p0, Ln/f;->j:Z

    .line 53
    .line 54
    iput-boolean v0, p0, Ln/f;->z:Z

    .line 55
    .line 56
    invoke-virtual {p2}, Landroid/view/View;->getLayoutDirection()I

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    const/4 p3, 0x1

    .line 61
    if-ne p2, p3, :cond_0

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    const/4 v0, 0x1

    .line 65
    :goto_0
    iput v0, p0, Ln/f;->u:I

    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    iget p2, p2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 76
    .line 77
    div-int/lit8 p2, p2, 0x2

    .line 78
    .line 79
    const p3, 0x7f070017

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    iput p1, p0, Ln/f;->h:I

    .line 91
    .line 92
    new-instance p1, Landroid/os/Handler;

    .line 93
    .line 94
    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 95
    .line 96
    .line 97
    iput-object p1, p0, Ln/f;->k:Landroid/os/Handler;

    .line 98
    .line 99
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 3

    .line 1
    iget-object v0, p0, Ln/f;->m:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-lez v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ln/e;

    .line 15
    .line 16
    iget-object v0, v0, Ln/e;->a:Lo/M0;

    .line 17
    .line 18
    iget-object v0, v0, Lo/H0;->E:Lo/A;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    :cond_0
    return v2
.end method

.method public final b(Ln/l;Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Ln/f;->m:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    :goto_0
    if-ge v3, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Ln/e;

    .line 16
    .line 17
    iget-object v4, v4, Ln/e;->b:Ln/l;

    .line 18
    .line 19
    if-ne p1, v4, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v3, -0x1

    .line 26
    :goto_1
    if-gez v3, :cond_2

    .line 27
    .line 28
    return-void

    .line 29
    :cond_2
    add-int/lit8 v1, v3, 0x1

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-ge v1, v4, :cond_3

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Ln/e;

    .line 42
    .line 43
    iget-object v1, v1, Ln/e;->b:Ln/l;

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ln/l;->c(Z)V

    .line 46
    .line 47
    .line 48
    :cond_3
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Ln/e;

    .line 53
    .line 54
    iget-object v3, v1, Ln/e;->b:Ln/l;

    .line 55
    .line 56
    invoke-virtual {v3, p0}, Ln/l;->r(Ln/x;)V

    .line 57
    .line 58
    .line 59
    iget-boolean v3, p0, Ln/f;->E:Z

    .line 60
    .line 61
    iget-object v1, v1, Ln/e;->a:Lo/M0;

    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    if-eqz v3, :cond_5

    .line 65
    .line 66
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 67
    .line 68
    const/16 v5, 0x17

    .line 69
    .line 70
    if-lt v3, v5, :cond_4

    .line 71
    .line 72
    iget-object v3, v1, Lo/H0;->E:Lo/A;

    .line 73
    .line 74
    invoke-static {v3, v4}, Lo/J0;->b(Landroid/widget/PopupWindow;Landroid/transition/Transition;)V

    .line 75
    .line 76
    .line 77
    :cond_4
    iget-object v3, v1, Lo/H0;->E:Lo/A;

    .line 78
    .line 79
    invoke-virtual {v3, v2}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 80
    .line 81
    .line 82
    :cond_5
    invoke-virtual {v1}, Lo/H0;->dismiss()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    const/4 v3, 0x1

    .line 90
    if-lez v1, :cond_6

    .line 91
    .line 92
    add-int/lit8 v5, v1, -0x1

    .line 93
    .line 94
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    check-cast v5, Ln/e;

    .line 99
    .line 100
    iget v5, v5, Ln/e;->c:I

    .line 101
    .line 102
    iput v5, p0, Ln/f;->u:I

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_6
    iget-object v5, p0, Ln/f;->s:Landroid/view/View;

    .line 106
    .line 107
    invoke-virtual {v5}, Landroid/view/View;->getLayoutDirection()I

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    if-ne v5, v3, :cond_7

    .line 112
    .line 113
    const/4 v5, 0x0

    .line 114
    goto :goto_2

    .line 115
    :cond_7
    const/4 v5, 0x1

    .line 116
    :goto_2
    iput v5, p0, Ln/f;->u:I

    .line 117
    .line 118
    :goto_3
    if-nez v1, :cond_b

    .line 119
    .line 120
    invoke-virtual {p0}, Ln/f;->dismiss()V

    .line 121
    .line 122
    .line 123
    iget-object p2, p0, Ln/f;->B:Ln/w;

    .line 124
    .line 125
    if-eqz p2, :cond_8

    .line 126
    .line 127
    invoke-interface {p2, p1, v3}, Ln/w;->b(Ln/l;Z)V

    .line 128
    .line 129
    .line 130
    :cond_8
    iget-object p1, p0, Ln/f;->C:Landroid/view/ViewTreeObserver;

    .line 131
    .line 132
    if-eqz p1, :cond_a

    .line 133
    .line 134
    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-eqz p1, :cond_9

    .line 139
    .line 140
    iget-object p1, p0, Ln/f;->C:Landroid/view/ViewTreeObserver;

    .line 141
    .line 142
    iget-object p2, p0, Ln/f;->n:Ln/d;

    .line 143
    .line 144
    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 145
    .line 146
    .line 147
    :cond_9
    iput-object v4, p0, Ln/f;->C:Landroid/view/ViewTreeObserver;

    .line 148
    .line 149
    :cond_a
    iget-object p1, p0, Ln/f;->t:Landroid/view/View;

    .line 150
    .line 151
    iget-object p2, p0, Ln/f;->o:LN0/o;

    .line 152
    .line 153
    invoke-virtual {p1, p2}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 154
    .line 155
    .line 156
    iget-object p1, p0, Ln/f;->D:Ln/u;

    .line 157
    .line 158
    invoke-virtual {p1}, Ln/u;->onDismiss()V

    .line 159
    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_b
    if-eqz p2, :cond_c

    .line 163
    .line 164
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    check-cast p1, Ln/e;

    .line 169
    .line 170
    iget-object p1, p1, Ln/e;->b:Ln/l;

    .line 171
    .line 172
    invoke-virtual {p1, v2}, Ln/l;->c(Z)V

    .line 173
    .line 174
    .line 175
    :cond_c
    :goto_4
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, Ln/f;->m:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ln/e;

    .line 18
    .line 19
    iget-object v1, v1, Ln/e;->a:Lo/M0;

    .line 20
    .line 21
    iget-object v1, v1, Lo/H0;->h:Lo/v0;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    instance-of v2, v1, Landroid/widget/HeaderViewListAdapter;

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    check-cast v1, Landroid/widget/HeaderViewListAdapter;

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Ln/i;

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    check-cast v1, Ln/i;

    .line 41
    .line 42
    :goto_1
    invoke-virtual {v1}, Ln/i;->notifyDataSetChanged()V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    return-void
.end method

.method public final dismiss()V
    .locals 4

    .line 1
    iget-object v0, p0, Ln/f;->m:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-lez v1, :cond_1

    .line 8
    .line 9
    new-array v2, v1, [Ln/e;

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, [Ln/e;

    .line 16
    .line 17
    add-int/lit8 v1, v1, -0x1

    .line 18
    .line 19
    :goto_0
    if-ltz v1, :cond_1

    .line 20
    .line 21
    aget-object v2, v0, v1

    .line 22
    .line 23
    iget-object v3, v2, Ln/e;->a:Lo/M0;

    .line 24
    .line 25
    iget-object v3, v3, Lo/H0;->E:Lo/A;

    .line 26
    .line 27
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    iget-object v2, v2, Ln/e;->a:Lo/M0;

    .line 34
    .line 35
    invoke-virtual {v2}, Lo/H0;->dismiss()V

    .line 36
    .line 37
    .line 38
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-void
.end method

.method public final e()Lo/v0;
    .locals 2

    .line 1
    iget-object v0, p0, Ln/f;->m:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/lit8 v1, v1, -0x1

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ln/e;

    .line 22
    .line 23
    iget-object v0, v0, Ln/e;->a:Lo/M0;

    .line 24
    .line 25
    iget-object v0, v0, Lo/H0;->h:Lo/v0;

    .line 26
    .line 27
    :goto_0
    return-object v0
.end method

.method public final g(Ln/D;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Ln/f;->m:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ln/e;

    .line 19
    .line 20
    iget-object v3, v1, Ln/e;->b:Ln/l;

    .line 21
    .line 22
    if-ne p1, v3, :cond_0

    .line 23
    .line 24
    iget-object p1, v1, Ln/e;->a:Lo/M0;

    .line 25
    .line 26
    iget-object p1, p1, Lo/H0;->h:Lo/v0;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 29
    .line 30
    .line 31
    return v2

    .line 32
    :cond_1
    invoke-virtual {p1}, Ln/l;->hasVisibleItems()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Ln/f;->l(Ln/l;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Ln/f;->B:Ln/w;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-interface {v0, p1}, Ln/w;->h(Ln/l;)Z

    .line 46
    .line 47
    .line 48
    :cond_2
    return v2

    .line 49
    :cond_3
    const/4 p1, 0x0

    .line 50
    return p1
.end method

.method public final h()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final i()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ln/f;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Ln/f;->l:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ln/l;

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Ln/f;->v(Ln/l;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Ln/f;->s:Landroid/view/View;

    .line 34
    .line 35
    iput-object v0, p0, Ln/f;->t:Landroid/view/View;

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    iget-object v1, p0, Ln/f;->C:Landroid/view/ViewTreeObserver;

    .line 40
    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    const/4 v1, 0x0

    .line 46
    :goto_1
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, Ln/f;->C:Landroid/view/ViewTreeObserver;

    .line 51
    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    iget-object v1, p0, Ln/f;->n:Ln/d;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    iget-object v0, p0, Ln/f;->t:Landroid/view/View;

    .line 60
    .line 61
    iget-object v1, p0, Ln/f;->o:LN0/o;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 64
    .line 65
    .line 66
    :cond_4
    return-void
.end method

.method public final j(Ln/w;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln/f;->B:Ln/w;

    .line 2
    .line 3
    return-void
.end method

.method public final l(Ln/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln/f;->g:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p1, p0, v0}, Ln/l;->b(Ln/x;Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ln/f;->a()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Ln/f;->v(Ln/l;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Ln/f;->l:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    :goto_0
    return-void
.end method

.method public final n(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln/f;->s:Landroid/view/View;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Ln/f;->s:Landroid/view/View;

    .line 6
    .line 7
    iget v0, p0, Ln/f;->q:I

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {v0, p1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iput p1, p0, Ln/f;->r:I

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final o(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ln/f;->z:Z

    .line 2
    .line 3
    return-void
.end method

.method public final onDismiss()V
    .locals 6

    .line 1
    iget-object v0, p0, Ln/f;->m:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    :goto_0
    if-ge v3, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Ln/e;

    .line 16
    .line 17
    iget-object v5, v4, Ln/e;->a:Lo/M0;

    .line 18
    .line 19
    iget-object v5, v5, Lo/H0;->E:Lo/A;

    .line 20
    .line 21
    invoke-virtual {v5}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-nez v5, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v4, 0x0

    .line 32
    :goto_1
    if-eqz v4, :cond_2

    .line 33
    .line 34
    iget-object v0, v4, Ln/e;->b:Ln/l;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Ln/l;->c(Z)V

    .line 37
    .line 38
    .line 39
    :cond_2
    return-void
.end method

.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p3, 0x1

    .line 6
    if-ne p1, p3, :cond_0

    .line 7
    .line 8
    const/16 p1, 0x52

    .line 9
    .line 10
    if-ne p2, p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Ln/f;->dismiss()V

    .line 13
    .line 14
    .line 15
    return p3

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
.end method

.method public final p(I)V
    .locals 1

    .line 1
    iget v0, p0, Ln/f;->q:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Ln/f;->q:I

    .line 6
    .line 7
    iget-object v0, p0, Ln/f;->s:Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {p1, v0}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iput p1, p0, Ln/f;->r:I

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final q(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ln/f;->v:Z

    .line 3
    .line 4
    iput p1, p0, Ln/f;->x:I

    .line 5
    .line 6
    return-void
.end method

.method public final r(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    .line 1
    check-cast p1, Ln/u;

    .line 2
    .line 3
    iput-object p1, p0, Ln/f;->D:Ln/u;

    .line 4
    .line 5
    return-void
.end method

.method public final s(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ln/f;->A:Z

    .line 2
    .line 3
    return-void
.end method

.method public final t(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ln/f;->w:Z

    .line 3
    .line 4
    iput p1, p0, Ln/f;->y:I

    .line 5
    .line 6
    return-void
.end method

.method public final v(Ln/l;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v3, v0, Ln/f;->g:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    new-instance v5, Ln/i;

    .line 12
    .line 13
    iget-boolean v6, v0, Ln/f;->j:Z

    .line 14
    .line 15
    const v7, 0x7f0c000b

    .line 16
    .line 17
    .line 18
    invoke-direct {v5, v1, v4, v6, v7}, Ln/i;-><init>(Ln/l;Landroid/view/LayoutInflater;ZI)V

    .line 19
    .line 20
    .line 21
    invoke-virtual/range {p0 .. p0}, Ln/f;->a()Z

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    const/4 v7, 0x1

    .line 26
    if-nez v6, :cond_0

    .line 27
    .line 28
    iget-boolean v6, v0, Ln/f;->z:Z

    .line 29
    .line 30
    if-eqz v6, :cond_0

    .line 31
    .line 32
    iput-boolean v7, v5, Ln/i;->c:Z

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual/range {p0 .. p0}, Ln/f;->a()Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_1

    .line 40
    .line 41
    invoke-static/range {p1 .. p1}, Ln/t;->u(Ln/l;)Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    iput-boolean v6, v5, Ln/i;->c:Z

    .line 46
    .line 47
    :cond_1
    :goto_0
    iget v6, v0, Ln/f;->h:I

    .line 48
    .line 49
    invoke-static {v5, v3, v6}, Ln/t;->m(Landroid/widget/ListAdapter;Landroid/content/Context;I)I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    new-instance v8, Lo/M0;

    .line 54
    .line 55
    iget v9, v0, Ln/f;->i:I

    .line 56
    .line 57
    const/4 v10, 0x0

    .line 58
    invoke-direct {v8, v3, v10, v9}, Lo/H0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 59
    .line 60
    .line 61
    iget-object v3, v8, Lo/H0;->E:Lo/A;

    .line 62
    .line 63
    iget-object v9, v0, Ln/f;->p:Lj0/w;

    .line 64
    .line 65
    iput-object v9, v8, Lo/M0;->I:Lj0/w;

    .line 66
    .line 67
    iput-object v0, v8, Lo/H0;->u:Landroid/widget/AdapterView$OnItemClickListener;

    .line 68
    .line 69
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 70
    .line 71
    .line 72
    iget-object v9, v0, Ln/f;->s:Landroid/view/View;

    .line 73
    .line 74
    iput-object v9, v8, Lo/H0;->t:Landroid/view/View;

    .line 75
    .line 76
    iget v9, v0, Ln/f;->r:I

    .line 77
    .line 78
    iput v9, v8, Lo/H0;->q:I

    .line 79
    .line 80
    iput-boolean v7, v8, Lo/H0;->D:Z

    .line 81
    .line 82
    invoke-virtual {v3, v7}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 83
    .line 84
    .line 85
    const/4 v9, 0x2

    .line 86
    invoke-virtual {v3, v9}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v8, v5}, Lo/H0;->n(Landroid/widget/ListAdapter;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v8, v6}, Lo/H0;->r(I)V

    .line 93
    .line 94
    .line 95
    iget v5, v0, Ln/f;->r:I

    .line 96
    .line 97
    iput v5, v8, Lo/H0;->q:I

    .line 98
    .line 99
    iget-object v5, v0, Ln/f;->m:Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    if-lez v11, :cond_b

    .line 106
    .line 107
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 108
    .line 109
    .line 110
    move-result v11

    .line 111
    sub-int/2addr v11, v7

    .line 112
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    check-cast v11, Ln/e;

    .line 117
    .line 118
    iget-object v12, v11, Ln/e;->b:Ln/l;

    .line 119
    .line 120
    iget-object v13, v12, Ln/l;->f:Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 123
    .line 124
    .line 125
    move-result v13

    .line 126
    const/4 v14, 0x0

    .line 127
    :goto_1
    if-ge v14, v13, :cond_3

    .line 128
    .line 129
    invoke-virtual {v12, v14}, Ln/l;->getItem(I)Landroid/view/MenuItem;

    .line 130
    .line 131
    .line 132
    move-result-object v15

    .line 133
    invoke-interface {v15}, Landroid/view/MenuItem;->hasSubMenu()Z

    .line 134
    .line 135
    .line 136
    move-result v16

    .line 137
    if-eqz v16, :cond_2

    .line 138
    .line 139
    invoke-interface {v15}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    if-ne v1, v9, :cond_2

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_2
    add-int/2addr v14, v7

    .line 147
    const/4 v9, 0x2

    .line 148
    goto :goto_1

    .line 149
    :cond_3
    move-object v15, v10

    .line 150
    :goto_2
    if-nez v15, :cond_4

    .line 151
    .line 152
    move-object v2, v10

    .line 153
    goto :goto_7

    .line 154
    :cond_4
    iget-object v9, v11, Ln/e;->a:Lo/M0;

    .line 155
    .line 156
    iget-object v9, v9, Lo/H0;->h:Lo/v0;

    .line 157
    .line 158
    invoke-virtual {v9}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 159
    .line 160
    .line 161
    move-result-object v12

    .line 162
    instance-of v13, v12, Landroid/widget/HeaderViewListAdapter;

    .line 163
    .line 164
    if-eqz v13, :cond_5

    .line 165
    .line 166
    check-cast v12, Landroid/widget/HeaderViewListAdapter;

    .line 167
    .line 168
    invoke-virtual {v12}, Landroid/widget/HeaderViewListAdapter;->getHeadersCount()I

    .line 169
    .line 170
    .line 171
    move-result v13

    .line 172
    invoke-virtual {v12}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    .line 173
    .line 174
    .line 175
    move-result-object v12

    .line 176
    check-cast v12, Ln/i;

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_5
    check-cast v12, Ln/i;

    .line 180
    .line 181
    const/4 v13, 0x0

    .line 182
    :goto_3
    invoke-virtual {v12}, Ln/i;->getCount()I

    .line 183
    .line 184
    .line 185
    move-result v14

    .line 186
    const/4 v10, 0x0

    .line 187
    :goto_4
    if-ge v10, v14, :cond_7

    .line 188
    .line 189
    invoke-virtual {v12, v10}, Ln/i;->b(I)Ln/n;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    if-ne v15, v2, :cond_6

    .line 194
    .line 195
    const/4 v2, -0x1

    .line 196
    goto :goto_5

    .line 197
    :cond_6
    add-int/2addr v10, v7

    .line 198
    goto :goto_4

    .line 199
    :cond_7
    const/4 v2, -0x1

    .line 200
    const/4 v10, -0x1

    .line 201
    :goto_5
    if-ne v10, v2, :cond_9

    .line 202
    .line 203
    :cond_8
    :goto_6
    const/4 v2, 0x0

    .line 204
    goto :goto_7

    .line 205
    :cond_9
    add-int/2addr v10, v13

    .line 206
    invoke-virtual {v9}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    sub-int/2addr v10, v2

    .line 211
    if-ltz v10, :cond_8

    .line 212
    .line 213
    invoke-virtual {v9}, Landroid/view/ViewGroup;->getChildCount()I

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    if-lt v10, v2, :cond_a

    .line 218
    .line 219
    goto :goto_6

    .line 220
    :cond_a
    invoke-virtual {v9, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    goto :goto_7

    .line 225
    :cond_b
    const/4 v2, 0x0

    .line 226
    const/4 v11, 0x0

    .line 227
    :goto_7
    if-eqz v2, :cond_18

    .line 228
    .line 229
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 230
    .line 231
    const/16 v10, 0x1c

    .line 232
    .line 233
    if-gt v9, v10, :cond_c

    .line 234
    .line 235
    sget-object v9, Lo/M0;->J:Ljava/lang/reflect/Method;

    .line 236
    .line 237
    if-eqz v9, :cond_d

    .line 238
    .line 239
    :try_start_0
    new-array v10, v7, [Ljava/lang/Object;

    .line 240
    .line 241
    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 242
    .line 243
    const/4 v13, 0x0

    .line 244
    aput-object v12, v10, v13

    .line 245
    .line 246
    invoke-virtual {v9, v3, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 247
    .line 248
    .line 249
    goto :goto_8

    .line 250
    :catch_0
    nop

    .line 251
    goto :goto_8

    .line 252
    :cond_c
    const/4 v9, 0x0

    .line 253
    invoke-static {v3, v9}, Lo/K0;->a(Landroid/widget/PopupWindow;Z)V

    .line 254
    .line 255
    .line 256
    :cond_d
    :goto_8
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 257
    .line 258
    const/16 v10, 0x17

    .line 259
    .line 260
    if-lt v9, v10, :cond_e

    .line 261
    .line 262
    const/4 v10, 0x0

    .line 263
    invoke-static {v3, v10}, Lo/J0;->a(Landroid/widget/PopupWindow;Landroid/transition/Transition;)V

    .line 264
    .line 265
    .line 266
    :cond_e
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    sub-int/2addr v3, v7

    .line 271
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    check-cast v3, Ln/e;

    .line 276
    .line 277
    iget-object v3, v3, Ln/e;->a:Lo/M0;

    .line 278
    .line 279
    iget-object v3, v3, Lo/H0;->h:Lo/v0;

    .line 280
    .line 281
    const/4 v10, 0x2

    .line 282
    new-array v12, v10, [I

    .line 283
    .line 284
    invoke-virtual {v3, v12}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 285
    .line 286
    .line 287
    new-instance v10, Landroid/graphics/Rect;

    .line 288
    .line 289
    invoke-direct {v10}, Landroid/graphics/Rect;-><init>()V

    .line 290
    .line 291
    .line 292
    iget-object v13, v0, Ln/f;->t:Landroid/view/View;

    .line 293
    .line 294
    invoke-virtual {v13, v10}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 295
    .line 296
    .line 297
    iget v13, v0, Ln/f;->u:I

    .line 298
    .line 299
    if-ne v13, v7, :cond_11

    .line 300
    .line 301
    const/16 v17, 0x0

    .line 302
    .line 303
    aget v12, v12, v17

    .line 304
    .line 305
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 306
    .line 307
    .line 308
    move-result v3

    .line 309
    add-int/2addr v3, v12

    .line 310
    add-int/2addr v3, v6

    .line 311
    iget v10, v10, Landroid/graphics/Rect;->right:I

    .line 312
    .line 313
    if-le v3, v10, :cond_10

    .line 314
    .line 315
    :cond_f
    const/4 v3, 0x0

    .line 316
    goto :goto_a

    .line 317
    :cond_10
    :goto_9
    const/4 v3, 0x1

    .line 318
    goto :goto_a

    .line 319
    :cond_11
    const/16 v17, 0x0

    .line 320
    .line 321
    aget v3, v12, v17

    .line 322
    .line 323
    sub-int/2addr v3, v6

    .line 324
    if-gez v3, :cond_f

    .line 325
    .line 326
    goto :goto_9

    .line 327
    :goto_a
    if-ne v3, v7, :cond_12

    .line 328
    .line 329
    const/4 v13, 0x1

    .line 330
    goto :goto_b

    .line 331
    :cond_12
    const/4 v13, 0x0

    .line 332
    :goto_b
    iput v3, v0, Ln/f;->u:I

    .line 333
    .line 334
    const/16 v3, 0x1a

    .line 335
    .line 336
    const/4 v10, 0x5

    .line 337
    if-lt v9, v3, :cond_13

    .line 338
    .line 339
    iput-object v2, v8, Lo/H0;->t:Landroid/view/View;

    .line 340
    .line 341
    const/4 v3, 0x0

    .line 342
    const/4 v12, 0x0

    .line 343
    goto :goto_d

    .line 344
    :cond_13
    const/4 v3, 0x2

    .line 345
    new-array v9, v3, [I

    .line 346
    .line 347
    iget-object v12, v0, Ln/f;->s:Landroid/view/View;

    .line 348
    .line 349
    invoke-virtual {v12, v9}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 350
    .line 351
    .line 352
    new-array v3, v3, [I

    .line 353
    .line 354
    invoke-virtual {v2, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 355
    .line 356
    .line 357
    iget v12, v0, Ln/f;->r:I

    .line 358
    .line 359
    and-int/lit8 v12, v12, 0x7

    .line 360
    .line 361
    if-ne v12, v10, :cond_14

    .line 362
    .line 363
    const/4 v12, 0x0

    .line 364
    aget v14, v9, v12

    .line 365
    .line 366
    iget-object v15, v0, Ln/f;->s:Landroid/view/View;

    .line 367
    .line 368
    invoke-virtual {v15}, Landroid/view/View;->getWidth()I

    .line 369
    .line 370
    .line 371
    move-result v15

    .line 372
    add-int/2addr v15, v14

    .line 373
    aput v15, v9, v12

    .line 374
    .line 375
    aget v14, v3, v12

    .line 376
    .line 377
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 378
    .line 379
    .line 380
    move-result v15

    .line 381
    add-int/2addr v15, v14

    .line 382
    aput v15, v3, v12

    .line 383
    .line 384
    goto :goto_c

    .line 385
    :cond_14
    const/4 v12, 0x0

    .line 386
    :goto_c
    aget v14, v3, v12

    .line 387
    .line 388
    aget v15, v9, v12

    .line 389
    .line 390
    sub-int v12, v14, v15

    .line 391
    .line 392
    aget v3, v3, v7

    .line 393
    .line 394
    aget v9, v9, v7

    .line 395
    .line 396
    sub-int/2addr v3, v9

    .line 397
    :goto_d
    iget v9, v0, Ln/f;->r:I

    .line 398
    .line 399
    and-int/2addr v9, v10

    .line 400
    if-ne v9, v10, :cond_16

    .line 401
    .line 402
    if-eqz v13, :cond_15

    .line 403
    .line 404
    add-int/2addr v12, v6

    .line 405
    goto :goto_e

    .line 406
    :cond_15
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 407
    .line 408
    .line 409
    move-result v2

    .line 410
    sub-int/2addr v12, v2

    .line 411
    goto :goto_e

    .line 412
    :cond_16
    if-eqz v13, :cond_17

    .line 413
    .line 414
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 415
    .line 416
    .line 417
    move-result v2

    .line 418
    add-int/2addr v12, v2

    .line 419
    goto :goto_e

    .line 420
    :cond_17
    sub-int/2addr v12, v6

    .line 421
    :goto_e
    iput v12, v8, Lo/H0;->k:I

    .line 422
    .line 423
    iput-boolean v7, v8, Lo/H0;->p:Z

    .line 424
    .line 425
    iput-boolean v7, v8, Lo/H0;->o:Z

    .line 426
    .line 427
    invoke-virtual {v8, v3}, Lo/H0;->l(I)V

    .line 428
    .line 429
    .line 430
    goto :goto_10

    .line 431
    :cond_18
    iget-boolean v2, v0, Ln/f;->v:Z

    .line 432
    .line 433
    if-eqz v2, :cond_19

    .line 434
    .line 435
    iget v2, v0, Ln/f;->x:I

    .line 436
    .line 437
    iput v2, v8, Lo/H0;->k:I

    .line 438
    .line 439
    :cond_19
    iget-boolean v2, v0, Ln/f;->w:Z

    .line 440
    .line 441
    if-eqz v2, :cond_1a

    .line 442
    .line 443
    iget v2, v0, Ln/f;->y:I

    .line 444
    .line 445
    invoke-virtual {v8, v2}, Lo/H0;->l(I)V

    .line 446
    .line 447
    .line 448
    :cond_1a
    iget-object v2, v0, Ln/t;->f:Landroid/graphics/Rect;

    .line 449
    .line 450
    if-eqz v2, :cond_1b

    .line 451
    .line 452
    new-instance v10, Landroid/graphics/Rect;

    .line 453
    .line 454
    invoke-direct {v10, v2}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 455
    .line 456
    .line 457
    goto :goto_f

    .line 458
    :cond_1b
    const/4 v10, 0x0

    .line 459
    :goto_f
    iput-object v10, v8, Lo/H0;->C:Landroid/graphics/Rect;

    .line 460
    .line 461
    :goto_10
    new-instance v2, Ln/e;

    .line 462
    .line 463
    iget v3, v0, Ln/f;->u:I

    .line 464
    .line 465
    invoke-direct {v2, v8, v1, v3}, Ln/e;-><init>(Lo/M0;Ln/l;I)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    invoke-virtual {v8}, Lo/H0;->i()V

    .line 472
    .line 473
    .line 474
    iget-object v2, v8, Lo/H0;->h:Lo/v0;

    .line 475
    .line 476
    invoke-virtual {v2, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 477
    .line 478
    .line 479
    if-nez v11, :cond_1c

    .line 480
    .line 481
    iget-boolean v3, v0, Ln/f;->A:Z

    .line 482
    .line 483
    if-eqz v3, :cond_1c

    .line 484
    .line 485
    iget-object v3, v1, Ln/l;->m:Ljava/lang/CharSequence;

    .line 486
    .line 487
    if-eqz v3, :cond_1c

    .line 488
    .line 489
    const v3, 0x7f0c0012

    .line 490
    .line 491
    .line 492
    const/4 v5, 0x0

    .line 493
    invoke-virtual {v4, v3, v2, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 494
    .line 495
    .line 496
    move-result-object v3

    .line 497
    check-cast v3, Landroid/widget/FrameLayout;

    .line 498
    .line 499
    const v4, 0x1020016

    .line 500
    .line 501
    .line 502
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 503
    .line 504
    .line 505
    move-result-object v4

    .line 506
    check-cast v4, Landroid/widget/TextView;

    .line 507
    .line 508
    invoke-virtual {v3, v5}, Landroid/view/View;->setEnabled(Z)V

    .line 509
    .line 510
    .line 511
    iget-object v1, v1, Ln/l;->m:Ljava/lang/CharSequence;

    .line 512
    .line 513
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 514
    .line 515
    .line 516
    const/4 v1, 0x0

    .line 517
    invoke-virtual {v2, v3, v1, v5}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 518
    .line 519
    .line 520
    invoke-virtual {v8}, Lo/H0;->i()V

    .line 521
    .line 522
    .line 523
    :cond_1c
    return-void
.end method
