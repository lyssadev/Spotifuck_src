.class Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
.super Landroid/os/ResultReceiver;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/ref/WeakReference;


# virtual methods
.method public final onReceiveResult(ILandroid/os/Bundle;)V
    .locals 6

    .line 1
    iget-object p1, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroid/support/v4/media/session/f;

    .line 8
    .line 9
    if-eqz p1, :cond_5

    .line 10
    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    iget-object v0, p1, Landroid/support/v4/media/session/f;->b:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v0

    .line 17
    :try_start_0
    iget-object v1, p1, Landroid/support/v4/media/session/f;->e:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 18
    .line 19
    const-string v2, "android.support.v4.media.session.EXTRA_BINDER"

    .line 20
    .line 21
    invoke-virtual {p2, v2}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    sget v3, Landroid/support/v4/media/session/n;->c:I

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    move-object v4, v3

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const-string v4, "android.support.v4.media.session.IMediaSession"

    .line 33
    .line 34
    invoke-interface {v2, v4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    instance-of v5, v4, Landroid/support/v4/media/session/d;

    .line 41
    .line 42
    if-eqz v5, :cond_2

    .line 43
    .line 44
    check-cast v4, Landroid/support/v4/media/session/d;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    new-instance v4, Landroid/support/v4/media/session/c;

    .line 48
    .line 49
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object v2, v4, Landroid/support/v4/media/session/c;->b:Landroid/os/IBinder;

    .line 53
    .line 54
    :goto_0
    invoke-virtual {v1, v4}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->b(Landroid/support/v4/media/session/d;)V

    .line 55
    .line 56
    .line 57
    iget-object v1, p1, Landroid/support/v4/media/session/f;->e:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 58
    .line 59
    const-string v2, "android.support.v4.media.session.SESSION_TOKEN2"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    :try_start_1
    invoke-virtual {p2, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    check-cast p2, Landroid/os/Bundle;

    .line 66
    .line 67
    if-nez p2, :cond_3

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    const-class v2, Lp0/a;

    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {p2, v2}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 77
    .line 78
    .line 79
    const-string v2, "a"

    .line 80
    .line 81
    invoke-virtual {p2, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    instance-of v2, p2, Landroidx/versionedparcelable/ParcelImpl;

    .line 86
    .line 87
    if-eqz v2, :cond_4

    .line 88
    .line 89
    check-cast p2, Landroidx/versionedparcelable/ParcelImpl;

    .line 90
    .line 91
    iget-object v3, p2, Landroidx/versionedparcelable/ParcelImpl;->a:Lp0/d;

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_4
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 95
    .line 96
    const-string v2, "Invalid parcel"

    .line 97
    .line 98
    invoke-direct {p2, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p2
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 102
    :catch_0
    :goto_1
    :try_start_2
    invoke-virtual {v1, v3}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->c(Lp0/d;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Landroid/support/v4/media/session/f;->a()V

    .line 106
    .line 107
    .line 108
    monitor-exit v0

    .line 109
    return-void

    .line 110
    :catchall_0
    move-exception p1

    .line 111
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 112
    throw p1

    .line 113
    :cond_5
    :goto_2
    return-void
.end method
