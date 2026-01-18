.class public final Ln/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln/x;
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public f:Landroid/content/Context;

.field public g:Landroid/view/LayoutInflater;

.field public h:Ln/l;

.field public i:Landroidx/appcompat/view/menu/ExpandedMenuView;

.field public j:Ln/w;

.field public k:Ln/g;


# direct methods
.method public constructor <init>(Landroid/content/ContextWrapper;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln/h;->f:Landroid/content/Context;

    .line 5
    .line 6
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Ln/h;->g:Landroid/view/LayoutInflater;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(Ln/l;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln/h;->j:Ln/w;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Ln/w;->b(Ln/l;Z)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-object v0, p0, Ln/h;->k:Ln/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ln/g;->notifyDataSetChanged()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final d(Ln/n;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public final f(Landroid/content/Context;Ln/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln/h;->f:Landroid/content/Context;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Ln/h;->f:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v0, p0, Ln/h;->g:Landroid/view/LayoutInflater;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Ln/h;->g:Landroid/view/LayoutInflater;

    .line 16
    .line 17
    :cond_0
    iput-object p2, p0, Ln/h;->h:Ln/l;

    .line 18
    .line 19
    iget-object p1, p0, Ln/h;->k:Ln/g;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Ln/g;->notifyDataSetChanged()V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public final g(Ln/D;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Ln/l;->hasVisibleItems()Z

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
    new-instance v0, Ln/m;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, Ln/m;->f:Ln/D;

    .line 15
    .line 16
    new-instance v1, LK/j;

    .line 17
    .line 18
    iget-object v2, p1, Ln/l;->a:Landroid/content/Context;

    .line 19
    .line 20
    invoke-direct {v1, v2}, LK/j;-><init>(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    new-instance v3, Ln/h;

    .line 24
    .line 25
    iget-object v4, v1, LK/j;->g:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v4, Lh/f;

    .line 28
    .line 29
    iget-object v5, v4, Lh/f;->a:Landroid/view/ContextThemeWrapper;

    .line 30
    .line 31
    invoke-direct {v3, v5}, Ln/h;-><init>(Landroid/content/ContextWrapper;)V

    .line 32
    .line 33
    .line 34
    iput-object v3, v0, Ln/m;->h:Ln/h;

    .line 35
    .line 36
    iput-object v0, v3, Ln/h;->j:Ln/w;

    .line 37
    .line 38
    invoke-virtual {p1, v3, v2}, Ln/l;->b(Ln/x;Landroid/content/Context;)V

    .line 39
    .line 40
    .line 41
    iget-object v2, v0, Ln/m;->h:Ln/h;

    .line 42
    .line 43
    iget-object v3, v2, Ln/h;->k:Ln/g;

    .line 44
    .line 45
    if-nez v3, :cond_1

    .line 46
    .line 47
    new-instance v3, Ln/g;

    .line 48
    .line 49
    invoke-direct {v3, v2}, Ln/g;-><init>(Ln/h;)V

    .line 50
    .line 51
    .line 52
    iput-object v3, v2, Ln/h;->k:Ln/g;

    .line 53
    .line 54
    :cond_1
    iget-object v2, v2, Ln/h;->k:Ln/g;

    .line 55
    .line 56
    iput-object v2, v4, Lh/f;->m:Ljava/lang/Object;

    .line 57
    .line 58
    iput-object v0, v4, Lh/f;->n:Landroid/content/DialogInterface$OnClickListener;

    .line 59
    .line 60
    iget-object v2, p1, Ln/l;->o:Landroid/view/View;

    .line 61
    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    iput-object v2, v4, Lh/f;->e:Landroid/view/View;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    iget-object v2, p1, Ln/l;->n:Landroid/graphics/drawable/Drawable;

    .line 68
    .line 69
    iput-object v2, v4, Lh/f;->c:Landroid/graphics/drawable/Drawable;

    .line 70
    .line 71
    iget-object v2, p1, Ln/l;->m:Ljava/lang/CharSequence;

    .line 72
    .line 73
    iput-object v2, v4, Lh/f;->d:Ljava/lang/CharSequence;

    .line 74
    .line 75
    :goto_0
    iput-object v0, v4, Lh/f;->k:Ln/m;

    .line 76
    .line 77
    invoke-virtual {v1}, LK/j;->a()Lh/i;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    iput-object v1, v0, Ln/m;->g:Lh/i;

    .line 82
    .line 83
    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 84
    .line 85
    .line 86
    iget-object v1, v0, Ln/m;->g:Lh/i;

    .line 87
    .line 88
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    const/16 v2, 0x3eb

    .line 97
    .line 98
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 99
    .line 100
    iget v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 101
    .line 102
    const/high16 v3, 0x20000

    .line 103
    .line 104
    or-int/2addr v2, v3

    .line 105
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 106
    .line 107
    iget-object v0, v0, Ln/m;->g:Lh/i;

    .line 108
    .line 109
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 110
    .line 111
    .line 112
    iget-object v0, p0, Ln/h;->j:Ln/w;

    .line 113
    .line 114
    if-eqz v0, :cond_3

    .line 115
    .line 116
    invoke-interface {v0, p1}, Ln/w;->h(Ln/l;)Z

    .line 117
    .line 118
    .line 119
    :cond_3
    const/4 p1, 0x1

    .line 120
    return p1
.end method

.method public final h()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final j(Ln/w;)V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final k(Ln/n;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1
    iget-object p1, p0, Ln/h;->h:Ln/l;

    .line 2
    .line 3
    iget-object p2, p0, Ln/h;->k:Ln/g;

    .line 4
    .line 5
    invoke-virtual {p2, p3}, Ln/g;->b(I)Ln/n;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const/4 p3, 0x0

    .line 10
    invoke-virtual {p1, p2, p0, p3}, Ln/l;->q(Landroid/view/MenuItem;Ln/x;I)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method
