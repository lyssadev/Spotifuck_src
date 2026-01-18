.class public Landroid/support/v4/media/session/q;
.super Landroid/support/v4/media/session/p;
.source "SourceFile"


# virtual methods
.method public final c()Ld0/r;
    .locals 5

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/session/o;->a:Landroid/media/session/MediaSession;

    .line 2
    .line 3
    invoke-static {v0}, LH0/f;->f(Landroid/media/session/MediaSession;)Landroid/media/session/MediaSessionManager$RemoteUserInfo;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ld0/r;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, LH0/f;->q(Landroid/media/session/MediaSessionManager$RemoteUserInfo;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    new-instance v2, Ld0/s;

    .line 25
    .line 26
    invoke-static {v0}, LH0/f;->q(Landroid/media/session/MediaSessionManager$RemoteUserInfo;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-static {v0}, LH0/f;->b(Landroid/media/session/MediaSessionManager$RemoteUserInfo;)I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    invoke-static {v0}, LH0/f;->x(Landroid/media/session/MediaSessionManager$RemoteUserInfo;)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-direct {v2, v3, v4, v0}, Ld0/t;-><init>(Ljava/lang/String;II)V

    .line 39
    .line 40
    .line 41
    iput-object v2, v1, Ld0/r;->a:Ld0/t;

    .line 42
    .line 43
    return-object v1

    .line 44
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 45
    .line 46
    const-string v1, "packageName should be nonempty"

    .line 47
    .line 48
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v0

    .line 52
    :cond_1
    new-instance v0, Ljava/lang/NullPointerException;

    .line 53
    .line 54
    const-string v1, "package shouldn\'t be null"

    .line 55
    .line 56
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v0
.end method

.method public final f(Ld0/r;)V
    .locals 0

    .line 1
    return-void
.end method
