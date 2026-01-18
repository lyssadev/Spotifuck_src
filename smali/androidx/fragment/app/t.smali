.class public final Landroidx/fragment/app/t;
.super Landroidx/fragment/app/v;
.source "SourceFile"

# interfaces
.implements LD/f;
.implements LD/g;
.implements LC/t;
.implements LC/u;
.implements Landroidx/lifecycle/Q;
.implements Landroidx/activity/B;
.implements Ld/d;
.implements Lk0/e;
.implements Landroidx/fragment/app/K;
.implements LN/l;


# instance fields
.field public final f:Lh/l;

.field public final g:Lh/l;

.field public final h:Landroid/os/Handler;

.field public final i:Landroidx/fragment/app/H;

.field public final synthetic j:Lh/l;


# direct methods
.method public constructor <init>(Lh/l;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/t;->j:Lh/l;

    .line 5
    .line 6
    new-instance v0, Landroid/os/Handler;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Landroidx/fragment/app/H;

    .line 12
    .line 13
    invoke-direct {v1}, Landroidx/fragment/app/H;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Landroidx/fragment/app/t;->i:Landroidx/fragment/app/H;

    .line 17
    .line 18
    iput-object p1, p0, Landroidx/fragment/app/t;->f:Lh/l;

    .line 19
    .line 20
    iput-object p1, p0, Landroidx/fragment/app/t;->g:Lh/l;

    .line 21
    .line 22
    iput-object v0, p0, Landroidx/fragment/app/t;->h:Landroid/os/Handler;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    return-void
.end method

.method public final b()Lk0/c;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/t;->j:Lh/l;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/activity/n;->i:Lk0/d;

    .line 4
    .line 5
    iget-object v0, v0, Lk0/d;->b:Lk0/c;

    .line 6
    .line 7
    return-object v0
.end method

.method public final c()Landroidx/lifecycle/P;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/t;->j:Lh/l;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/activity/n;->c()Landroidx/lifecycle/P;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final d()Landroidx/lifecycle/t;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/t;->j:Lh/l;

    .line 2
    .line 3
    iget-object v0, v0, Lh/l;->y:Landroidx/lifecycle/t;

    .line 4
    .line 5
    return-object v0
.end method

.method public final e(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/t;->j:Lh/l;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lh/l;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final f()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/t;->j:Lh/l;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    return v0
.end method
