.class public final Lg1/D;
.super Lg1/E;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:J

.field public final c:Lr1/g;


# direct methods
.method public synthetic constructor <init>(JLr1/g;I)V
    .locals 0

    .line 1
    iput p4, p0, Lg1/D;->a:I

    iput-wide p1, p0, Lg1/D;->b:J

    iput-object p3, p0, Lg1/D;->c:Lr1/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f()J
    .locals 2

    .line 1
    iget v0, p0, Lg1/D;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, Lg1/D;->b:J

    .line 7
    .line 8
    return-wide v0

    .line 9
    :pswitch_0
    iget-wide v0, p0, Lg1/D;->b:J

    .line 10
    .line 11
    return-wide v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g()Lr1/g;
    .locals 1

    .line 1
    iget v0, p0, Lg1/D;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg1/D;->c:Lr1/g;

    .line 7
    .line 8
    check-cast v0, Lr1/q;

    .line 9
    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lg1/D;->c:Lr1/g;

    .line 12
    .line 13
    check-cast v0, Lr1/e;

    .line 14
    .line 15
    return-object v0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
