.class public final LE0/i;
.super Lp0/a;
.source "SourceFile"


# instance fields
.field public final synthetic o:I

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LE0/i;->o:I

    iput-object p2, p0, LE0/i;->p:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final L0(I)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final k0(I)V
    .locals 1

    .line 1
    iget p1, p0, LE0/i;->o:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    const/4 p1, 0x1

    .line 8
    iget-object v0, p0, LE0/i;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LE0/k;

    .line 11
    .line 12
    iput-boolean p1, v0, LE0/k;->d:Z

    .line 13
    .line 14
    iget-object p1, v0, LE0/k;->e:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, LE0/j;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    check-cast p1, Lz0/e;

    .line 25
    .line 26
    invoke-virtual {p1}, Lz0/e;->u()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, LK0/g;->invalidateSelf()V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final l0(Landroid/graphics/Typeface;Z)V
    .locals 1

    .line 1
    iget p1, p0, LE0/i;->o:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LE0/i;->p:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lcom/google/android/material/chip/Chip;

    .line 9
    .line 10
    iget-object p2, p1, Lcom/google/android/material/chip/Chip;->j:Lz0/e;

    .line 11
    .line 12
    iget-boolean v0, p2, Lz0/e;->H0:Z

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object p2, p2, Lz0/e;->J:Ljava/lang/CharSequence;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    :goto_0
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_0
    if-eqz p2, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/4 p1, 0x1

    .line 37
    iget-object p2, p0, LE0/i;->p:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p2, LE0/k;

    .line 40
    .line 41
    iput-boolean p1, p2, LE0/k;->d:Z

    .line 42
    .line 43
    iget-object p1, p2, LE0/k;->e:Ljava/lang/ref/WeakReference;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, LE0/j;

    .line 50
    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    check-cast p1, Lz0/e;

    .line 54
    .line 55
    invoke-virtual {p1}, Lz0/e;->u()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, LK0/g;->invalidateSelf()V

    .line 59
    .line 60
    .line 61
    :cond_2
    :goto_1
    return-void

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
