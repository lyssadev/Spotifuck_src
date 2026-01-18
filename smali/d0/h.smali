.class public final Ld0/h;
.super Ld0/e;
.source "SourceFile"


# instance fields
.field public final synthetic h:Ld0/i;


# direct methods
.method public constructor <init>(Ld0/i;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld0/h;->h:Ld0/i;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ld0/e;-><init>(Ld0/f;Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onLoadChildren(Ljava/lang/String;Landroid/service/media/MediaBrowserService$Result;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-static {p3}, Landroid/support/v4/media/session/t;->j(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ld0/h;->h:Ld0/i;

    .line 5
    .line 6
    iget-object v1, v0, Ld0/i;->k:Ld0/q;

    .line 7
    .line 8
    iget-object v2, v1, Ld0/q;->h:Ld0/c;

    .line 9
    .line 10
    new-instance v2, LA/b;

    .line 11
    .line 12
    const/16 v3, 0x17

    .line 13
    .line 14
    invoke-direct {v2, v3, p2}, LA/b;-><init>(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    new-instance p2, Ld0/g;

    .line 18
    .line 19
    invoke-direct {p2, v0, p1, v2, p3}, Ld0/g;-><init>(Ld0/i;Ljava/lang/String;LA/b;Landroid/os/Bundle;)V

    .line 20
    .line 21
    .line 22
    const/4 p3, 0x1

    .line 23
    iput p3, p2, Ld0/k;->d:I

    .line 24
    .line 25
    invoke-virtual {v1, p1, p2}, Ld0/q;->b(Ljava/lang/String;Ld0/k;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, v0, Ld0/i;->k:Ld0/q;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    return-void
.end method
