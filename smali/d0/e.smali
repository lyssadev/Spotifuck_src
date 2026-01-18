.class public Ld0/e;
.super Ld0/d;
.source "SourceFile"


# instance fields
.field public final synthetic g:Ld0/f;


# direct methods
.method public constructor <init>(Ld0/f;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld0/e;->g:Ld0/f;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ld0/d;-><init>(LA/k;Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onLoadItem(Ljava/lang/String;Landroid/service/media/MediaBrowserService$Result;)V
    .locals 1

    .line 1
    new-instance p1, LA/b;

    .line 2
    .line 3
    const/16 v0, 0x17

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, LA/b;-><init>(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p2, p0, Ld0/e;->g:Ld0/f;

    .line 9
    .line 10
    iget-object p2, p2, Ld0/f;->j:Ld0/q;

    .line 11
    .line 12
    iget-object p2, p2, Ld0/q;->h:Ld0/c;

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-virtual {p1, p2}, LA/b;->D(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
