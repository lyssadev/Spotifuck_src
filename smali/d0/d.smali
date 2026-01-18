.class public Ld0/d;
.super Landroid/service/media/MediaBrowserService;
.source "SourceFile"


# instance fields
.field public final synthetic f:LA/k;


# direct methods
.method public constructor <init>(LA/k;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld0/d;->f:LA/k;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/service/media/MediaBrowserService;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p2}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final onGetRoot(Ljava/lang/String;ILandroid/os/Bundle;)Landroid/service/media/MediaBrowserService$BrowserRoot;
    .locals 12

    .line 1
    invoke-static {p3}, Landroid/support/v4/media/session/t;->j(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance v1, Landroid/os/Bundle;

    .line 10
    .line 11
    invoke-direct {v1, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    :goto_0
    iget-object p3, p0, Ld0/d;->f:LA/k;

    .line 15
    .line 16
    iget-object v2, p3, LA/k;->i:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Ld0/q;

    .line 19
    .line 20
    const/4 v3, -0x1

    .line 21
    if-eqz v1, :cond_3

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    const-string v5, "extra_client_version"

    .line 25
    .line 26
    invoke-virtual {v1, v5, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_3

    .line 31
    .line 32
    invoke-virtual {v1, v5}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance v4, Landroid/os/Messenger;

    .line 36
    .line 37
    iget-object v5, v2, Ld0/q;->k:LQ0/j;

    .line 38
    .line 39
    invoke-direct {v4, v5}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    .line 40
    .line 41
    .line 42
    iput-object v4, p3, LA/k;->g:Ljava/lang/Object;

    .line 43
    .line 44
    new-instance v4, Landroid/os/Bundle;

    .line 45
    .line 46
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 47
    .line 48
    .line 49
    const-string v5, "extra_service_version"

    .line 50
    .line 51
    const/4 v6, 0x2

    .line 52
    invoke-virtual {v4, v5, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 53
    .line 54
    .line 55
    iget-object v5, p3, LA/k;->g:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v5, Landroid/os/Messenger;

    .line 58
    .line 59
    invoke-virtual {v5}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    const-string v6, "extra_messenger"

    .line 64
    .line 65
    invoke-virtual {v4, v6, v5}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 66
    .line 67
    .line 68
    iget-object v5, v2, Ld0/q;->l:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 69
    .line 70
    if-eqz v5, :cond_2

    .line 71
    .line 72
    invoke-virtual {v5}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->a()Landroid/support/v4/media/session/d;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    if-nez v5, :cond_1

    .line 77
    .line 78
    move-object v5, v0

    .line 79
    goto :goto_1

    .line 80
    :cond_1
    invoke-interface {v5}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    :goto_1
    const-string v6, "extra_session_binder"

    .line 85
    .line 86
    invoke-virtual {v4, v6, v5}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_2
    iget-object v5, p3, LA/k;->h:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v5, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    :goto_2
    const-string v5, "extra_calling_pid"

    .line 98
    .line 99
    invoke-virtual {v1, v5, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    invoke-virtual {v1, v5}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    move v9, v3

    .line 107
    goto :goto_3

    .line 108
    :cond_3
    move-object v4, v0

    .line 109
    const/4 v9, -0x1

    .line 110
    :goto_3
    new-instance v1, Ld0/c;

    .line 111
    .line 112
    iget-object v3, p3, LA/k;->i:Ljava/lang/Object;

    .line 113
    .line 114
    move-object v7, v3

    .line 115
    check-cast v7, Ld0/q;

    .line 116
    .line 117
    const/4 v11, 0x0

    .line 118
    move-object v6, v1

    .line 119
    move-object v8, p1

    .line 120
    move v10, p2

    .line 121
    invoke-direct/range {v6 .. v11}, Ld0/c;-><init>(Ld0/q;Ljava/lang/String;IILA/b;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    iget-object p1, p3, LA/k;->g:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast p1, Landroid/os/Messenger;

    .line 130
    .line 131
    if-eqz p1, :cond_4

    .line 132
    .line 133
    iget-object p1, v2, Ld0/q;->i:Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    :cond_4
    if-nez v4, :cond_5

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_5
    move-object v0, v4

    .line 142
    :goto_4
    new-instance p1, Landroid/service/media/MediaBrowserService$BrowserRoot;

    .line 143
    .line 144
    const-string p2, "sfroot"

    .line 145
    .line 146
    invoke-direct {p1, p2, v0}, Landroid/service/media/MediaBrowserService$BrowserRoot;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 147
    .line 148
    .line 149
    return-object p1
.end method

.method public final onLoadChildren(Ljava/lang/String;Landroid/service/media/MediaBrowserService$Result;)V
    .locals 3

    .line 1
    new-instance v0, LA/b;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LA/b;-><init>(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p2, p0, Ld0/d;->f:LA/k;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v1, Ld0/b;

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    invoke-direct {v1, p1, v0, v2}, Ld0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    iget-object p2, p2, LA/k;->i:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p2, Ld0/q;

    .line 22
    .line 23
    iget-object v0, p2, Ld0/q;->h:Ld0/c;

    .line 24
    .line 25
    invoke-virtual {p2, p1, v1}, Ld0/q;->b(Ljava/lang/String;Ld0/k;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method
