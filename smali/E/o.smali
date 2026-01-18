.class public final synthetic LE/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, LE/o;->a:I

    iput-object p1, p0, LE/o;->b:Ljava/lang/Object;

    iput-object p2, p0, LE/o;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LE/o;->b:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, LE/o;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget v2, p0, LE/o;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v1, Ljava/lang/Runnable;

    .line 11
    .line 12
    check-cast v0, Lh/q;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    :try_start_0
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lh/q;->a()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception v1

    .line 25
    invoke-virtual {v0}, Lh/q;->a()V

    .line 26
    .line 27
    .line 28
    throw v1

    .line 29
    :pswitch_0
    check-cast v0, Lh/l;

    .line 30
    .line 31
    check-cast v1, Landroidx/activity/A;

    .line 32
    .line 33
    sget v2, Landroidx/activity/n;->w:I

    .line 34
    .line 35
    new-instance v2, Landroidx/activity/h;

    .line 36
    .line 37
    invoke-direct {v2, v1, v0}, Landroidx/activity/h;-><init>(Landroidx/activity/A;Lh/l;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, v0, LC/h;->f:Landroidx/lifecycle/t;

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/q;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_1
    check-cast v0, LE/b;

    .line 47
    .line 48
    check-cast v1, Landroid/graphics/Typeface;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, LE/b;->j(Landroid/graphics/Typeface;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
