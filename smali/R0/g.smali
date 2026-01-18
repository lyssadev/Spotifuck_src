.class public final synthetic LR0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lit/deviato/spotifuck/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lit/deviato/spotifuck/MainActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, LR0/g;->a:I

    iput-object p1, p0, LR0/g;->b:Lit/deviato/spotifuck/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LR0/g;->b:Lit/deviato/spotifuck/MainActivity;

    .line 2
    .line 3
    iget v1, p0, LR0/g;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v1, Lit/deviato/spotifuck/MainActivity;->F:Lit/deviato/spotifuck/LockableHScrollView;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object v1, Lit/deviato/spotifuck/AppSingleton;->f:Landroid/content/Context;

    .line 14
    .line 15
    sget-object v2, Lit/deviato/spotifuck/MainActivity;->N:Landroid/content/Intent;

    .line 16
    .line 17
    invoke-static {v1, v2}, Lp0/a;->G0(Landroid/content/Context;Landroid/content/Intent;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lit/deviato/spotifuck/MainActivity;->s()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    sget-object v1, Lit/deviato/spotifuck/MainActivity;->F:Lit/deviato/spotifuck/LockableHScrollView;

    .line 25
    .line 26
    invoke-virtual {v0}, Lit/deviato/spotifuck/MainActivity;->s()V

    .line 27
    .line 28
    .line 29
    sget-object v0, Lit/deviato/spotifuck/MainActivity;->K:Landroid/webkit/WebView;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
