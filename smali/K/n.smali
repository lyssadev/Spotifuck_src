.class public final LK/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, LK/n;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/view/View;LN/j0;LE/j;Landroid/animation/ValueAnimator;)V
    .locals 0

    const/4 p2, 0x1

    iput p2, p0, LK/n;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK/n;->b:Ljava/lang/Object;

    iput-object p3, p0, LK/n;->c:Ljava/lang/Object;

    iput-object p4, p0, LK/n;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/i;Ljava/util/ArrayList;Landroidx/fragment/app/S;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LK/n;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK/n;->d:Ljava/lang/Object;

    iput-object p2, p0, LK/n;->b:Ljava/lang/Object;

    iput-object p3, p0, LK/n;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, LK/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LK/n;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v1, p0, LK/n;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroidx/fragment/app/S;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, LK/n;->d:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Landroidx/fragment/app/i;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v0, v1, Landroidx/fragment/app/S;->c:Landroidx/fragment/app/r;

    .line 31
    .line 32
    iget-object v0, v0, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 33
    .line 34
    iget v1, v1, Landroidx/fragment/app/S;->a:I

    .line 35
    .line 36
    invoke-static {v0, v1}, LQ0/E;->a(Landroid/view/View;I)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void

    .line 40
    :pswitch_0
    iget-object v0, p0, LK/n;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, LE/j;

    .line 43
    .line 44
    iget-object v1, p0, LK/n;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Landroid/view/View;

    .line 47
    .line 48
    invoke-static {v1, v0}, LN/f0;->h(Landroid/view/View;LE/j;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, LK/n;->d:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Landroid/animation/ValueAnimator;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_1
    :try_start_0
    iget-object v0, p0, LK/n;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, LK/f;

    .line 62
    .line 63
    invoke-virtual {v0}, LK/f;->call()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    goto :goto_0

    .line 68
    :catch_0
    const/4 v0, 0x0

    .line 69
    :goto_0
    new-instance v1, LC/b;

    .line 70
    .line 71
    iget-object v2, p0, LK/n;->c:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v2, LK/g;

    .line 74
    .line 75
    const/4 v3, 0x4

    .line 76
    invoke-direct {v1, v2, v0, v3}, LC/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, LK/n;->d:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Landroid/os/Handler;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
