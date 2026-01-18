.class public Ld0/i;
.super Ld0/f;
.source "SourceFile"


# instance fields
.field public final synthetic k:Ld0/q;


# direct methods
.method public constructor <init>(Ld0/q;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld0/i;->k:Ld0/q;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Ld0/f;-><init>(Ld0/q;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final p()V
    .locals 2

    .line 1
    new-instance v0, Ld0/h;

    .line 2
    .line 3
    iget-object v1, p0, Ld0/i;->k:Ld0/q;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Ld0/h;-><init>(Ld0/i;Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, LA/k;->f:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/service/media/MediaBrowserService;->onCreate()V

    .line 11
    .line 12
    .line 13
    return-void
.end method
