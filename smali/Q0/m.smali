.class public final LQ0/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LQ0/y;

.field public final c:LA/b;

.field public final d:Ljava/util/LinkedHashMap;

.field public final e:Ljava/util/WeakHashMap;

.field public final f:Ljava/util/WeakHashMap;

.field public final g:Ljava/util/LinkedHashSet;

.field public final h:LQ0/j;

.field public final i:LQ0/u;

.field public final j:LA/b;

.field public final k:LQ0/C;

.field public final l:Ljava/util/ArrayList;

.field public final m:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;LQ0/y;LQ0/u;LA/b;LA/b;LQ0/C;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v2, LQ0/k;

    .line 7
    .line 8
    const-string v3, "Picasso-Dispatcher"

    .line 9
    .line 10
    const/16 v4, 0xa

    .line 11
    .line 12
    invoke-direct {v2, v3, v4}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    sget-object v4, LQ0/H;->a:Lr1/h;

    .line 23
    .line 24
    new-instance v4, LQ0/u;

    .line 25
    .line 26
    invoke-direct {v4, v3, v1}, LQ0/u;-><init>(Landroid/os/Looper;I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    const-wide/16 v5, 0x3e8

    .line 34
    .line 35
    invoke-virtual {v4, v3, v5, v6}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, LQ0/m;->a:Landroid/content/Context;

    .line 39
    .line 40
    iput-object p2, p0, LQ0/m;->b:LQ0/y;

    .line 41
    .line 42
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 43
    .line 44
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p2, p0, LQ0/m;->d:Ljava/util/LinkedHashMap;

    .line 48
    .line 49
    new-instance p2, Ljava/util/WeakHashMap;

    .line 50
    .line 51
    invoke-direct {p2}, Ljava/util/WeakHashMap;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object p2, p0, LQ0/m;->e:Ljava/util/WeakHashMap;

    .line 55
    .line 56
    new-instance p2, Ljava/util/WeakHashMap;

    .line 57
    .line 58
    invoke-direct {p2}, Ljava/util/WeakHashMap;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object p2, p0, LQ0/m;->f:Ljava/util/WeakHashMap;

    .line 62
    .line 63
    new-instance p2, Ljava/util/LinkedHashSet;

    .line 64
    .line 65
    invoke-direct {p2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 66
    .line 67
    .line 68
    iput-object p2, p0, LQ0/m;->g:Ljava/util/LinkedHashSet;

    .line 69
    .line 70
    new-instance p2, LQ0/j;

    .line 71
    .line 72
    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-direct {p2, v2, p0, v0}, LQ0/j;-><init>(Landroid/os/Looper;Ljava/lang/Object;I)V

    .line 77
    .line 78
    .line 79
    iput-object p2, p0, LQ0/m;->h:LQ0/j;

    .line 80
    .line 81
    iput-object p4, p0, LQ0/m;->c:LA/b;

    .line 82
    .line 83
    iput-object p3, p0, LQ0/m;->i:LQ0/u;

    .line 84
    .line 85
    iput-object p5, p0, LQ0/m;->j:LA/b;

    .line 86
    .line 87
    iput-object p6, p0, LQ0/m;->k:LQ0/C;

    .line 88
    .line 89
    new-instance p2, Ljava/util/ArrayList;

    .line 90
    .line 91
    const/4 p3, 0x4

    .line 92
    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 93
    .line 94
    .line 95
    iput-object p2, p0, LQ0/m;->l:Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    :try_start_0
    const-string p3, "airplane_mode_on"

    .line 102
    .line 103
    invoke-static {p2, p3, v0}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :catch_0
    nop

    .line 108
    :goto_0
    const-string p2, "android.permission.ACCESS_NETWORK_STATE"

    .line 109
    .line 110
    invoke-virtual {p1, p2}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-nez p1, :cond_0

    .line 115
    .line 116
    const/4 v0, 0x1

    .line 117
    :cond_0
    iput-boolean v0, p0, LQ0/m;->m:Z

    .line 118
    .line 119
    new-instance p1, LQ0/l;

    .line 120
    .line 121
    invoke-direct {p1, p0}, LQ0/l;-><init>(LQ0/m;)V

    .line 122
    .line 123
    .line 124
    new-instance p2, Landroid/content/IntentFilter;

    .line 125
    .line 126
    invoke-direct {p2}, Landroid/content/IntentFilter;-><init>()V

    .line 127
    .line 128
    .line 129
    const-string p3, "android.intent.action.AIRPLANE_MODE"

    .line 130
    .line 131
    invoke-virtual {p2, p3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    iget-object p3, p1, LQ0/l;->b:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast p3, LQ0/m;

    .line 137
    .line 138
    iget-boolean p4, p3, LQ0/m;->m:Z

    .line 139
    .line 140
    if-eqz p4, :cond_1

    .line 141
    .line 142
    const-string p4, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 143
    .line 144
    invoke-virtual {p2, p4}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    :cond_1
    iget-object p3, p3, LQ0/m;->a:Landroid/content/Context;

    .line 148
    .line 149
    invoke-virtual {p3, p1, p2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 150
    .line 151
    .line 152
    return-void
.end method


# virtual methods
.method public final a(LQ0/f;)V
    .locals 3

    .line 1
    iget-object v0, p1, LQ0/f;->m:Ljava/util/concurrent/Future;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v0, p1, LQ0/f;->l:Landroid/graphics/Bitmap;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    .line 17
    .line 18
    .line 19
    :cond_1
    iget-object v0, p0, LQ0/m;->l:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, LQ0/m;->h:LQ0/j;

    .line 25
    .line 26
    const/4 v0, 0x7

    .line 27
    invoke-virtual {p1, v0}, Landroid/os/Handler;->hasMessages(I)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    const-wide/16 v1, 0xc8

    .line 34
    .line 35
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 36
    .line 37
    .line 38
    :cond_2
    return-void
.end method

.method public final b(LQ0/f;)V
    .locals 2

    .line 1
    const/4 v0, 0x4

    .line 2
    iget-object v1, p0, LQ0/m;->h:LQ0/j;

    .line 3
    .line 4
    invoke-virtual {v1, v0, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {v1, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final c(LQ0/f;Z)V
    .locals 1

    .line 1
    iget-object p2, p1, LQ0/f;->b:LQ0/w;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, LQ0/m;->d:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    iget-object v0, p1, LQ0/f;->f:Ljava/lang/String;

    .line 9
    .line 10
    invoke-interface {p2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, LQ0/m;->a(LQ0/f;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final d(LQ0/n;Z)V
    .locals 6

    .line 1
    iget-object v0, p0, LQ0/m;->g:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    iget-object v1, p1, LQ0/n;->d:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p1, LQ0/n;->a:LQ0/w;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object p2, p0, LQ0/m;->f:Ljava/util/WeakHashMap;

    .line 14
    .line 15
    invoke-virtual {p1}, LQ0/n;->a()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p2, v0, p1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    iget-object v0, p0, LQ0/m;->d:Ljava/util/LinkedHashMap;

    .line 27
    .line 28
    iget-object v2, p1, LQ0/n;->c:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, LQ0/f;

    .line 35
    .line 36
    if-eqz v3, :cond_4

    .line 37
    .line 38
    iget-object p2, v3, LQ0/f;->b:LQ0/w;

    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object p2, v3, LQ0/f;->j:LQ0/n;

    .line 44
    .line 45
    if-nez p2, :cond_1

    .line 46
    .line 47
    iput-object p1, v3, LQ0/f;->j:LQ0/n;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    iget-object p2, v3, LQ0/f;->k:Ljava/util/ArrayList;

    .line 51
    .line 52
    if-nez p2, :cond_2

    .line 53
    .line 54
    new-instance p2, Ljava/util/ArrayList;

    .line 55
    .line 56
    const/4 v0, 0x3

    .line 57
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 58
    .line 59
    .line 60
    iput-object p2, v3, LQ0/f;->k:Ljava/util/ArrayList;

    .line 61
    .line 62
    :cond_2
    iget-object p2, v3, LQ0/f;->k:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    iget-object p1, p1, LQ0/n;->b:LQ0/z;

    .line 68
    .line 69
    iget p1, p1, LQ0/z;->c:I

    .line 70
    .line 71
    invoke-static {p1}, Lt/e;->a(I)I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    iget v0, v3, LQ0/f;->r:I

    .line 76
    .line 77
    invoke-static {v0}, Lt/e;->a(I)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-le p2, v0, :cond_3

    .line 82
    .line 83
    iput p1, v3, LQ0/f;->r:I

    .line 84
    .line 85
    :cond_3
    :goto_0
    return-void

    .line 86
    :cond_4
    iget-object v3, p0, LQ0/m;->b:LQ0/y;

    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/util/concurrent/ThreadPoolExecutor;->isShutdown()Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_5

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_5
    iget-object v4, p0, LQ0/m;->j:LA/b;

    .line 99
    .line 100
    iget-object v5, p0, LQ0/m;->k:LQ0/C;

    .line 101
    .line 102
    invoke-static {v1, p0, v4, v5, p1}, LQ0/f;->d(LQ0/w;LQ0/m;LA/b;LQ0/C;LQ0/n;)LQ0/f;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-virtual {v3, v4}, LQ0/y;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    iput-object v3, v4, LQ0/f;->m:Ljava/util/concurrent/Future;

    .line 111
    .line 112
    invoke-interface {v0, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    if-eqz p2, :cond_6

    .line 116
    .line 117
    iget-object p2, p0, LQ0/m;->e:Ljava/util/WeakHashMap;

    .line 118
    .line 119
    invoke-virtual {p1}, LQ0/n;->a()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {p2, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    return-void
.end method
