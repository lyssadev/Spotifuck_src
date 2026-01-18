.class public abstract Ls0/a;
.super LA/c;
.source "SourceFile"


# instance fields
.field public a:Lcom/google/android/material/datepicker/k;


# virtual methods
.method public g(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Ls0/a;->r(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Ls0/a;->a:Lcom/google/android/material/datepicker/k;

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    new-instance p1, Lcom/google/android/material/datepicker/k;

    .line 9
    .line 10
    invoke-direct {p1, p2}, Lcom/google/android/material/datepicker/k;-><init>(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Ls0/a;->a:Lcom/google/android/material/datepicker/k;

    .line 14
    .line 15
    :cond_0
    iget-object p1, p0, Ls0/a;->a:Lcom/google/android/material/datepicker/k;

    .line 16
    .line 17
    iget-object p2, p1, Lcom/google/android/material/datepicker/k;->f:Landroid/view/View;

    .line 18
    .line 19
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    iput p3, p1, Lcom/google/android/material/datepicker/k;->g:I

    .line 24
    .line 25
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    iput p2, p1, Lcom/google/android/material/datepicker/k;->h:I

    .line 30
    .line 31
    iget-object p1, p0, Ls0/a;->a:Lcom/google/android/material/datepicker/k;

    .line 32
    .line 33
    iget-object p2, p1, Lcom/google/android/material/datepicker/k;->f:Landroid/view/View;

    .line 34
    .line 35
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 36
    .line 37
    .line 38
    move-result p3

    .line 39
    iget v0, p1, Lcom/google/android/material/datepicker/k;->g:I

    .line 40
    .line 41
    sub-int/2addr p3, v0

    .line 42
    rsub-int/lit8 p3, p3, 0x0

    .line 43
    .line 44
    invoke-static {p2, p3}, LN/Q;->k(Landroid/view/View;I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    .line 48
    .line 49
    .line 50
    move-result p3

    .line 51
    iget p1, p1, Lcom/google/android/material/datepicker/k;->h:I

    .line 52
    .line 53
    sub-int/2addr p3, p1

    .line 54
    rsub-int/lit8 p1, p3, 0x0

    .line 55
    .line 56
    invoke-static {p2, p1}, LN/Q;->j(Landroid/view/View;I)V

    .line 57
    .line 58
    .line 59
    const/4 p1, 0x1

    .line 60
    return p1
.end method

.method public r(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->q(Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
