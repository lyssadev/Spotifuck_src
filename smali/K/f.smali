.class public final LK/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:LK/e;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroid/content/Context;LK/e;II)V
    .locals 0

    .line 1
    iput p5, p0, LK/f;->a:I

    iput-object p1, p0, LK/f;->b:Ljava/lang/String;

    iput-object p2, p0, LK/f;->c:Landroid/content/Context;

    iput-object p3, p0, LK/f;->d:LK/e;

    iput p4, p0, LK/f;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LK/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, LK/f;->b:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v1, p0, LK/f;->c:Landroid/content/Context;

    .line 9
    .line 10
    iget-object v2, p0, LK/f;->d:LK/e;

    .line 11
    .line 12
    iget v3, p0, LK/f;->e:I

    .line 13
    .line 14
    invoke-static {v0, v1, v2, v3}, LK/i;->a(Ljava/lang/String;Landroid/content/Context;LK/e;I)LK/h;

    .line 15
    .line 16
    .line 17
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    new-instance v0, LK/h;

    .line 20
    .line 21
    const/4 v1, -0x3

    .line 22
    invoke-direct {v0, v1}, LK/h;-><init>(I)V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-object v0

    .line 26
    :pswitch_0
    iget-object v0, p0, LK/f;->b:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v1, p0, LK/f;->c:Landroid/content/Context;

    .line 29
    .line 30
    iget-object v2, p0, LK/f;->d:LK/e;

    .line 31
    .line 32
    iget v3, p0, LK/f;->e:I

    .line 33
    .line 34
    invoke-static {v0, v1, v2, v3}, LK/i;->a(Ljava/lang/String;Landroid/content/Context;LK/e;I)LK/h;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    return-object v0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
