.class public final LR0/n;
.super Landroid/media/AudioDeviceCallback;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/media/AudioDeviceCallback;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onAudioDevicesAdded([Landroid/media/AudioDeviceInfo;)V
    .locals 6

    .line 1
    sget-object v0, Lit/deviato/spotifuck/WebService;->t:Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_5

    .line 8
    .line 9
    sget-boolean v0, Lit/deviato/spotifuck/AppSingleton;->B:Z

    .line 10
    .line 11
    if-eqz v0, :cond_5

    .line 12
    .line 13
    sget-object v0, Lit/deviato/spotifuck/WebService;->n:Landroid/support/v4/media/session/t;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    iget-object v0, v0, Landroid/support/v4/media/session/t;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, LA/b;

    .line 21
    .line 22
    invoke-virtual {v0}, LA/b;->w()Landroid/support/v4/media/session/i;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    array-length v1, p1

    .line 27
    const/4 v2, 0x0

    .line 28
    :goto_0
    if-ge v2, v1, :cond_5

    .line 29
    .line 30
    aget-object v3, p1, v2

    .line 31
    .line 32
    invoke-static {v3}, LC0/a;->b(Landroid/media/AudioDeviceInfo;)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    sget-boolean v4, Lit/deviato/spotifuck/AppSingleton;->v:Z

    .line 37
    .line 38
    iget-object v5, v0, Landroid/support/v4/media/session/i;->a:Landroid/media/session/MediaController$TransportControls;

    .line 39
    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    const/4 v4, 0x3

    .line 43
    if-eq v3, v4, :cond_1

    .line 44
    .line 45
    const/4 v4, 0x4

    .line 46
    if-ne v3, v4, :cond_2

    .line 47
    .line 48
    :cond_1
    invoke-virtual {v5}, Landroid/media/session/MediaController$TransportControls;->play()V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    sget-boolean v4, Lit/deviato/spotifuck/AppSingleton;->x:Z

    .line 53
    .line 54
    if-eqz v4, :cond_4

    .line 55
    .line 56
    const/16 v4, 0x8

    .line 57
    .line 58
    if-eq v3, v4, :cond_3

    .line 59
    .line 60
    const/4 v4, 0x7

    .line 61
    if-eq v3, v4, :cond_3

    .line 62
    .line 63
    const/16 v4, 0x1a

    .line 64
    .line 65
    if-eq v3, v4, :cond_3

    .line 66
    .line 67
    const/16 v4, 0x1b

    .line 68
    .line 69
    if-ne v3, v4, :cond_4

    .line 70
    .line 71
    :cond_3
    invoke-virtual {v5}, Landroid/media/session/MediaController$TransportControls;->play()V

    .line 72
    .line 73
    .line 74
    :cond_4
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_5
    :goto_2
    return-void
.end method

.method public final onAudioDevicesRemoved([Landroid/media/AudioDeviceInfo;)V
    .locals 6

    .line 1
    sget-object v0, Lit/deviato/spotifuck/WebService;->t:Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_5

    .line 8
    .line 9
    sget-boolean v0, Lit/deviato/spotifuck/AppSingleton;->B:Z

    .line 10
    .line 11
    if-eqz v0, :cond_5

    .line 12
    .line 13
    sget-object v0, Lit/deviato/spotifuck/WebService;->n:Landroid/support/v4/media/session/t;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    iget-object v0, v0, Landroid/support/v4/media/session/t;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, LA/b;

    .line 21
    .line 22
    invoke-virtual {v0}, LA/b;->w()Landroid/support/v4/media/session/i;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    array-length v1, p1

    .line 27
    const/4 v2, 0x0

    .line 28
    :goto_0
    if-ge v2, v1, :cond_5

    .line 29
    .line 30
    aget-object v3, p1, v2

    .line 31
    .line 32
    invoke-static {v3}, LC0/a;->b(Landroid/media/AudioDeviceInfo;)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    sget-boolean v4, Lit/deviato/spotifuck/AppSingleton;->w:Z

    .line 37
    .line 38
    iget-object v5, v0, Landroid/support/v4/media/session/i;->a:Landroid/media/session/MediaController$TransportControls;

    .line 39
    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    const/4 v4, 0x3

    .line 43
    if-eq v3, v4, :cond_1

    .line 44
    .line 45
    const/4 v4, 0x4

    .line 46
    if-ne v3, v4, :cond_2

    .line 47
    .line 48
    :cond_1
    invoke-virtual {v5}, Landroid/media/session/MediaController$TransportControls;->pause()V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    sget-boolean v4, Lit/deviato/spotifuck/AppSingleton;->y:Z

    .line 53
    .line 54
    if-eqz v4, :cond_4

    .line 55
    .line 56
    const/16 v4, 0x8

    .line 57
    .line 58
    if-eq v3, v4, :cond_3

    .line 59
    .line 60
    const/4 v4, 0x7

    .line 61
    if-eq v3, v4, :cond_3

    .line 62
    .line 63
    const/16 v4, 0x1a

    .line 64
    .line 65
    if-eq v3, v4, :cond_3

    .line 66
    .line 67
    const/16 v4, 0x1b

    .line 68
    .line 69
    if-ne v3, v4, :cond_4

    .line 70
    .line 71
    :cond_3
    invoke-virtual {v5}, Landroid/media/session/MediaController$TransportControls;->pause()V

    .line 72
    .line 73
    .line 74
    :cond_4
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_5
    :goto_2
    return-void
.end method
