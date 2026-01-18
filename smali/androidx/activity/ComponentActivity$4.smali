.class public final Landroidx/activity/ComponentActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/p;


# instance fields
.field public final synthetic a:Lh/l;


# direct methods
.method public constructor <init>(Lh/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/activity/ComponentActivity$4;->a:Lh/l;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Landroidx/lifecycle/r;Landroidx/lifecycle/l;)V
    .locals 0

    .line 1
    sget p1, Landroidx/activity/n;->w:I

    .line 2
    .line 3
    iget-object p1, p0, Landroidx/activity/ComponentActivity$4;->a:Lh/l;

    .line 4
    .line 5
    iget-object p2, p1, Landroidx/activity/n;->j:Landroidx/lifecycle/P;

    .line 6
    .line 7
    if-nez p2, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    check-cast p2, Landroidx/activity/j;

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    iget-object p2, p2, Landroidx/activity/j;->a:Landroidx/lifecycle/P;

    .line 18
    .line 19
    iput-object p2, p1, Landroidx/activity/n;->j:Landroidx/lifecycle/P;

    .line 20
    .line 21
    :cond_0
    iget-object p2, p1, Landroidx/activity/n;->j:Landroidx/lifecycle/P;

    .line 22
    .line 23
    if-nez p2, :cond_1

    .line 24
    .line 25
    new-instance p2, Landroidx/lifecycle/P;

    .line 26
    .line 27
    invoke-direct {p2}, Landroidx/lifecycle/P;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p2, p1, Landroidx/activity/n;->j:Landroidx/lifecycle/P;

    .line 31
    .line 32
    :cond_1
    iget-object p1, p1, LC/h;->f:Landroidx/lifecycle/t;

    .line 33
    .line 34
    invoke-virtual {p1, p0}, Landroidx/lifecycle/t;->f(Landroidx/lifecycle/q;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method
