.class public final synthetic LR0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LR0/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lit/deviato/spotifuck/MainActivity;I)V
    .locals 0

    .line 2
    iput p2, p0, LR0/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/16 v1, 0x8

    .line 3
    .line 4
    iget v2, p0, LR0/a;->a:I

    .line 5
    .line 6
    packed-switch v2, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, Lit/deviato/spotifuck/MainActivity;->M:Landroid/widget/ProgressBar;

    .line 10
    .line 11
    const/4 v2, 0x4

    .line 12
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    sget-object v0, Lit/deviato/spotifuck/MainActivity;->J:Landroid/widget/TextView;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    sput-boolean v0, Lit/deviato/spotifuck/MainActivity;->P:Z

    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_1
    sget-object v0, Lit/deviato/spotifuck/MainActivity;->L:Landroid/widget/Switch;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_2
    sget-object v0, Lit/deviato/spotifuck/MainActivity;->L:Landroid/widget/Switch;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_3
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->j:LR0/c;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/view/View;->dispatchWindowVisibilityChanged(I)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_4
    sget-object v1, Lit/deviato/spotifuck/AppSingleton;->j:LR0/c;

    .line 43
    .line 44
    invoke-virtual {v1, v0}, Landroid/view/View;->dispatchWindowVisibilityChanged(I)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_5
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->f:Landroid/content/Context;

    .line 49
    .line 50
    invoke-static {}, Lit/deviato/spotifuck/MainActivity;->u()V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
