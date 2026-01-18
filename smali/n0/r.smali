.class public final Ln0/r;
.super Ln0/n;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Ln0/m;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Ln0/r;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ln0/m;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ln0/r;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Ln0/r;->b:Ln0/m;

    return-void
.end method


# virtual methods
.method public final b(Ln0/m;)V
    .locals 2

    .line 1
    iget v0, p0, Ln0/r;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ln0/r;->b:Ln0/m;

    .line 7
    .line 8
    check-cast v0, Ln0/a;

    .line 9
    .line 10
    iget v1, v0, Ln0/a;->C:I

    .line 11
    .line 12
    add-int/lit8 v1, v1, -0x1

    .line 13
    .line 14
    iput v1, v0, Ln0/a;->C:I

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    iput-boolean v1, v0, Ln0/a;->D:Z

    .line 20
    .line 21
    invoke-virtual {v0}, Ln0/m;->m()V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p1, p0}, Ln0/m;->x(Ln0/k;)Ln0/m;

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    iget-object v0, p0, Ln0/r;->b:Ln0/m;

    .line 29
    .line 30
    invoke-virtual {v0}, Ln0/m;->z()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p0}, Ln0/m;->x(Ln0/k;)Ln0/m;

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public e(Ln0/m;)V
    .locals 1

    .line 1
    iget p1, p0, Ln0/r;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p1, p0, Ln0/r;->b:Ln0/m;

    .line 8
    .line 9
    check-cast p1, Ln0/a;

    .line 10
    .line 11
    iget-boolean v0, p1, Ln0/a;->D:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Ln0/m;->G()V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p1, Ln0/a;->D:Z

    .line 20
    .line 21
    :cond_0
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
