.class public Landroid/support/v4/media/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/media/browse/MediaBrowser;

.field public final c:Landroid/os/Bundle;

.field public final d:Landroid/support/v4/media/a;

.field public final e:Lr/b;

.field public f:LE/j;

.field public g:Landroid/os/Messenger;

.field public h:Landroid/support/v4/media/session/MediaSessionCompat$Token;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/ComponentName;Lf0/b;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/support/v4/media/a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Landroid/support/v4/media/a;-><init>(Landroid/support/v4/media/c;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroid/support/v4/media/c;->d:Landroid/support/v4/media/a;

    .line 10
    .line 11
    new-instance v0, Lr/b;

    .line 12
    .line 13
    invoke-direct {v0}, Lr/k;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroid/support/v4/media/c;->e:Lr/b;

    .line 17
    .line 18
    iput-object p1, p0, Landroid/support/v4/media/c;->a:Landroid/content/Context;

    .line 19
    .line 20
    new-instance v0, Landroid/os/Bundle;

    .line 21
    .line 22
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Landroid/support/v4/media/c;->c:Landroid/os/Bundle;

    .line 26
    .line 27
    const-string v1, "extra_client_version"

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 31
    .line 32
    .line 33
    const-string v1, "extra_calling_pid"

    .line 34
    .line 35
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 40
    .line 41
    .line 42
    iput-object p0, p3, Lf0/b;->b:Ljava/lang/Object;

    .line 43
    .line 44
    new-instance v1, Landroid/media/browse/MediaBrowser;

    .line 45
    .line 46
    iget-object p3, p3, Lf0/b;->a:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p3, Landroid/support/v4/media/b;

    .line 49
    .line 50
    invoke-direct {v1, p1, p2, p3, v0}, Landroid/media/browse/MediaBrowser;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Landroid/media/browse/MediaBrowser$ConnectionCallback;Landroid/os/Bundle;)V

    .line 51
    .line 52
    .line 53
    iput-object v1, p0, Landroid/support/v4/media/c;->b:Landroid/media/browse/MediaBrowser;

    .line 54
    .line 55
    return-void
.end method
