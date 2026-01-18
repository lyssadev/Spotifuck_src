.class public final Landroidx/fragment/app/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic f:Landroidx/fragment/app/M;

.field public final synthetic g:Landroidx/fragment/app/x;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/x;Landroidx/fragment/app/M;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/w;->g:Landroidx/fragment/app/x;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/fragment/app/w;->f:Landroidx/fragment/app/M;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/fragment/app/w;->f:Landroidx/fragment/app/M;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/fragment/app/M;->k()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Landroidx/fragment/app/M;->c:Landroidx/fragment/app/r;

    .line 7
    .line 8
    iget-object p1, p1, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Landroid/view/ViewGroup;

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/fragment/app/w;->g:Landroidx/fragment/app/x;

    .line 17
    .line 18
    iget-object v0, v0, Landroidx/fragment/app/x;->f:Landroidx/fragment/app/H;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroidx/fragment/app/H;->D()LK0/e;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {p1, v0}, Landroidx/fragment/app/i;->f(Landroid/view/ViewGroup;LK0/e;)Landroidx/fragment/app/i;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Landroidx/fragment/app/i;->e()V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method
