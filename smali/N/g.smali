.class public final synthetic LN/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN0/E;
.implements LN/r;
.implements Ln0/l;


# instance fields
.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LN/g;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ln0/k;Ln0/m;)V
    .locals 1

    .line 1
    iget v0, p0, LN/g;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ln0/k;->d()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-interface {p1}, Ln0/k;->a()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_1
    invoke-interface {p1, p2}, Ln0/k;->g(Ln0/m;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_2
    invoke-interface {p1, p2}, Ln0/k;->c(Ln0/m;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_3
    invoke-interface {p1, p2}, Ln0/k;->f(Ln0/m;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public l(Landroid/view/View;LN/w0;)LN/w0;
    .locals 4

    .line 1
    sget-object v0, Lit/deviato/spotifuck/MainActivity;->F:Lit/deviato/spotifuck/LockableHScrollView;

    .line 2
    .line 3
    iget-object v0, p2, LN/w0;->a:LN/u0;

    .line 4
    .line 5
    const/4 v1, 0x7

    .line 6
    invoke-virtual {v0, v1}, LN/u0;->f(I)LF/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget v1, v0, LF/c;->a:I

    .line 11
    .line 12
    iget v2, v0, LF/c;->c:I

    .line 13
    .line 14
    iget v3, v0, LF/c;->d:I

    .line 15
    .line 16
    iget v0, v0, LF/c;->b:I

    .line 17
    .line 18
    invoke-virtual {p1, v1, v0, v2, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 19
    .line 20
    .line 21
    return-object p2
.end method
