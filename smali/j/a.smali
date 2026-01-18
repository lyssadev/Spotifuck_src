.class public final Lj/a;
.super LT0/g;
.source "SourceFile"


# instance fields
.field public final synthetic l:I

.field public final m:Landroid/graphics/drawable/Animatable;


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/drawable/Animatable;I)V
    .locals 0

    .line 1
    iput p2, p0, Lj/a;->l:I

    iput-object p1, p0, Lj/a;->m:Landroid/graphics/drawable/Animatable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final O()V
    .locals 1

    .line 1
    iget v0, p0, Lj/a;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lj/a;->m:Landroid/graphics/drawable/Animatable;

    .line 7
    .line 8
    check-cast v0, Lo0/f;

    .line 9
    .line 10
    invoke-virtual {v0}, Lo0/f;->start()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Lj/a;->m:Landroid/graphics/drawable/Animatable;

    .line 15
    .line 16
    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->start()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final P()V
    .locals 1

    .line 1
    iget v0, p0, Lj/a;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lj/a;->m:Landroid/graphics/drawable/Animatable;

    .line 7
    .line 8
    check-cast v0, Lo0/f;

    .line 9
    .line 10
    invoke-virtual {v0}, Lo0/f;->stop()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Lj/a;->m:Landroid/graphics/drawable/Animatable;

    .line 15
    .line 16
    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->stop()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
