.class public final Landroidx/activity/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# instance fields
.field public final synthetic a:Landroidx/activity/u;

.field public final synthetic b:Landroidx/activity/u;

.field public final synthetic c:Landroidx/activity/v;

.field public final synthetic d:Landroidx/activity/v;


# direct methods
.method public constructor <init>(Landroidx/activity/u;Landroidx/activity/u;Landroidx/activity/v;Landroidx/activity/v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/activity/x;->a:Landroidx/activity/u;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/activity/x;->b:Landroidx/activity/u;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/activity/x;->c:Landroidx/activity/v;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/activity/x;->d:Landroidx/activity/v;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onBackCancelled()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/activity/x;->d:Landroidx/activity/v;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/activity/v;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onBackInvoked()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/activity/x;->c:Landroidx/activity/v;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/activity/v;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onBackProgressed(Landroid/window/BackEvent;)V
    .locals 2

    .line 1
    const-string v0, "backEvent"

    .line 2
    .line 3
    invoke-static {v0, p1}, LZ0/c;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/activity/x;->b:Landroidx/activity/u;

    .line 7
    .line 8
    new-instance v1, Landroidx/activity/b;

    .line 9
    .line 10
    invoke-direct {v1, p1}, Landroidx/activity/b;-><init>(Landroid/window/BackEvent;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroidx/activity/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onBackStarted(Landroid/window/BackEvent;)V
    .locals 2

    .line 1
    const-string v0, "backEvent"

    .line 2
    .line 3
    invoke-static {v0, p1}, LZ0/c;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/activity/x;->a:Landroidx/activity/u;

    .line 7
    .line 8
    new-instance v1, Landroidx/activity/b;

    .line 9
    .line 10
    invoke-direct {v1, p1}, Landroidx/activity/b;-><init>(Landroid/window/BackEvent;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroidx/activity/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method
