.class public final LN/d0;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LN/j0;Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LN/d0;->a:I

    .line 1
    iput-object p1, p0, LN/d0;->b:Ljava/lang/Object;

    iput-object p2, p0, LN/d0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method

.method public constructor <init>(Ln0/m;Lr/b;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LN/d0;->a:I

    .line 2
    iput-object p1, p0, LN/d0;->c:Ljava/lang/Object;

    iput-object p2, p0, LN/d0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget v0, p0, LN/d0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LN/d0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lr/b;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lr/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, LN/d0;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ln0/m;

    .line 16
    .line 17
    iget-object v0, v0, Ln0/m;->n:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    iget-object p1, p0, LN/d0;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, LN/j0;

    .line 26
    .line 27
    iget-object p1, p1, LN/j0;->a:LN/i0;

    .line 28
    .line 29
    const/high16 v0, 0x3f800000    # 1.0f

    .line 30
    .line 31
    invoke-virtual {p1, v0}, LN/i0;->d(F)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, LN/d0;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Landroid/view/View;

    .line 37
    .line 38
    invoke-static {p1}, LN/f0;->e(Landroid/view/View;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget v0, p0, LN/d0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object v0, p0, LN/d0;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ln0/m;

    .line 13
    .line 14
    iget-object v0, v0, Ln0/m;->n:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
