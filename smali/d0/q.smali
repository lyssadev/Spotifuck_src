.class public abstract Ld0/q;
.super Landroid/app/Service;
.source "SourceFile"


# static fields
.field public static final synthetic m:I


# instance fields
.field public f:LA/k;

.field public final g:LA/b;

.field public final h:Ld0/c;

.field public final i:Ljava/util/ArrayList;

.field public final j:Lr/b;

.field public final k:LQ0/j;

.field public l:Landroid/support/v4/media/session/MediaSessionCompat$Token;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "MBServiceCompat"

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LA/b;

    .line 5
    .line 6
    const/16 v1, 0x18

    .line 7
    .line 8
    invoke-direct {v0, v1, p0}, LA/b;-><init>(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Ld0/q;->g:LA/b;

    .line 12
    .line 13
    new-instance v0, Ld0/c;

    .line 14
    .line 15
    const/4 v5, -0x1

    .line 16
    const/4 v6, -0x1

    .line 17
    const-string v4, "android.media.session.MediaController"

    .line 18
    .line 19
    const/4 v7, 0x0

    .line 20
    move-object v2, v0

    .line 21
    move-object v3, p0

    .line 22
    invoke-direct/range {v2 .. v7}, Ld0/c;-><init>(Ld0/q;Ljava/lang/String;IILA/b;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Ld0/q;->h:Ld0/c;

    .line 26
    .line 27
    new-instance v0, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Ld0/q;->i:Ljava/util/ArrayList;

    .line 33
    .line 34
    new-instance v0, Lr/b;

    .line 35
    .line 36
    invoke-direct {v0}, Lr/k;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Ld0/q;->j:Lr/b;

    .line 40
    .line 41
    new-instance v0, LQ0/j;

    .line 42
    .line 43
    const/4 v1, 0x3

    .line 44
    invoke-direct {v0, v1}, LQ0/j;-><init>(I)V

    .line 45
    .line 46
    .line 47
    iput-object p0, v0, LQ0/j;->b:Ljava/lang/Object;

    .line 48
    .line 49
    iput-object v0, p0, Ld0/q;->k:LQ0/j;

    .line 50
    .line 51
    return-void
.end method

.method public static a(Ljava/util/List;Landroid/os/Bundle;)Ljava/util/List;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    const-string v0, "android.media.browse.extra.PAGE"

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const-string v2, "android.media.browse.extra.PAGE_SIZE"

    .line 13
    .line 14
    invoke-virtual {p1, v2, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-ne v0, v1, :cond_1

    .line 19
    .line 20
    if-ne p1, v1, :cond_1

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    mul-int v1, p1, v0

    .line 24
    .line 25
    add-int v2, v1, p1

    .line 26
    .line 27
    if-ltz v0, :cond_4

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    if-lt p1, v0, :cond_4

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-lt v1, p1, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-le v2, p1, :cond_3

    .line 44
    .line 45
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    :cond_3
    invoke-interface {p0, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_4
    :goto_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method


# virtual methods
.method public abstract b(Ljava/lang/String;Ld0/k;)V
.end method

.method public final dump(Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .line 1
    iget-object v0, p0, Ld0/q;->f:LA/k;

    .line 2
    .line 3
    iget-object v0, v0, LA/k;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ld0/d;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/service/media/MediaBrowserService;->onBind(Landroid/content/Intent;)Landroid/os/IBinder;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public onCreate()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1c

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    new-instance v0, Ld0/j;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Ld0/i;-><init>(Ld0/q;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Ld0/q;->f:LA/k;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 v1, 0x1a

    .line 19
    .line 20
    if-lt v0, v1, :cond_1

    .line 21
    .line 22
    new-instance v0, Ld0/i;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Ld0/i;-><init>(Ld0/q;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Ld0/q;->f:LA/k;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/16 v1, 0x17

    .line 31
    .line 32
    if-lt v0, v1, :cond_2

    .line 33
    .line 34
    new-instance v0, Ld0/f;

    .line 35
    .line 36
    invoke-direct {v0, p0}, Ld0/f;-><init>(Ld0/q;)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Ld0/q;->f:LA/k;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    new-instance v0, LA/k;

    .line 43
    .line 44
    invoke-direct {v0, p0}, LA/k;-><init>(Ld0/q;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Ld0/q;->f:LA/k;

    .line 48
    .line 49
    :goto_0
    iget-object v0, p0, Ld0/q;->f:LA/k;

    .line 50
    .line 51
    invoke-virtual {v0}, LA/k;->p()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Ld0/q;->k:LQ0/j;

    .line 3
    .line 4
    iput-object v0, v1, LQ0/j;->b:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method
