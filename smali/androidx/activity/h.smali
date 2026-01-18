.class public final synthetic Landroidx/activity/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/p;


# instance fields
.field public final synthetic a:Landroidx/activity/A;

.field public final synthetic b:Lh/l;


# direct methods
.method public synthetic constructor <init>(Landroidx/activity/A;Lh/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/activity/h;->a:Landroidx/activity/A;

    iput-object p2, p0, Landroidx/activity/h;->b:Lh/l;

    return-void
.end method


# virtual methods
.method public final b(Landroidx/lifecycle/r;Landroidx/lifecycle/l;)V
    .locals 0

    .line 1
    sget-object p1, Landroidx/lifecycle/l;->ON_CREATE:Landroidx/lifecycle/l;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/activity/h;->b:Lh/l;

    .line 6
    .line 7
    invoke-static {p1}, Landroidx/activity/i;->a(Lh/l;)Landroid/window/OnBackInvokedDispatcher;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p2, p0, Landroidx/activity/h;->a:Landroidx/activity/A;

    .line 12
    .line 13
    iput-object p1, p2, Landroidx/activity/A;->e:Landroid/window/OnBackInvokedDispatcher;

    .line 14
    .line 15
    iget-boolean p1, p2, Landroidx/activity/A;->g:Z

    .line 16
    .line 17
    invoke-virtual {p2, p1}, Landroidx/activity/A;->d(Z)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method
