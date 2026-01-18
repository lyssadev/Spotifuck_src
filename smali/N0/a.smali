.class public final synthetic LN0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LN0/a;->f:I

    iput-object p2, p0, LN0/a;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    const/4 p1, 0x0

    .line 2
    iget-object v0, p0, LN0/a;->g:Ljava/lang/Object;

    .line 3
    .line 4
    iget v1, p0, LN0/a;->f:I

    .line 5
    .line 6
    packed-switch v1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast v0, Lcom/google/android/material/datepicker/l;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/android/material/datepicker/l;->L()V

    .line 12
    .line 13
    .line 14
    throw p1

    .line 15
    :pswitch_0
    sget-object p1, Lit/deviato/spotifuck/MainActivity;->F:Lit/deviato/spotifuck/LockableHScrollView;

    .line 16
    .line 17
    check-cast v0, Lit/deviato/spotifuck/MainActivity;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    new-instance p1, Landroid/content/Intent;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-class v2, Lit/deviato/spotifuck/SettingsActivity;

    .line 29
    .line 30
    invoke-direct {p1, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_1
    check-cast v0, LN0/y;

    .line 38
    .line 39
    iget-object v1, v0, LN0/y;->f:Landroid/widget/EditText;

    .line 40
    .line 41
    if-nez v1, :cond_0

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    invoke-virtual {v1}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    iget-object v2, v0, LN0/y;->f:Landroid/widget/EditText;

    .line 49
    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    invoke-virtual {v2}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    instance-of v2, v2, Landroid/text/method/PasswordTransformationMethod;

    .line 57
    .line 58
    if-eqz v2, :cond_1

    .line 59
    .line 60
    iget-object v2, v0, LN0/y;->f:Landroid/widget/EditText;

    .line 61
    .line 62
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    iget-object p1, v0, LN0/y;->f:Landroid/widget/EditText;

    .line 67
    .line 68
    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 73
    .line 74
    .line 75
    :goto_0
    if-ltz v1, :cond_2

    .line 76
    .line 77
    iget-object p1, v0, LN0/y;->f:Landroid/widget/EditText;

    .line 78
    .line 79
    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 80
    .line 81
    .line 82
    :cond_2
    invoke-virtual {v0}, LN0/r;->q()V

    .line 83
    .line 84
    .line 85
    :goto_1
    return-void

    .line 86
    :pswitch_2
    check-cast v0, LN0/l;

    .line 87
    .line 88
    invoke-virtual {v0}, LN0/l;->u()V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :pswitch_3
    check-cast v0, LN0/e;

    .line 93
    .line 94
    iget-object p1, v0, LN0/e;->i:Landroid/widget/EditText;

    .line 95
    .line 96
    if-nez p1, :cond_3

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_3
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    if-eqz p1, :cond_4

    .line 104
    .line 105
    invoke-interface {p1}, Landroid/text/Editable;->clear()V

    .line 106
    .line 107
    .line 108
    :cond_4
    invoke-virtual {v0}, LN0/r;->q()V

    .line 109
    .line 110
    .line 111
    :goto_2
    return-void

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
