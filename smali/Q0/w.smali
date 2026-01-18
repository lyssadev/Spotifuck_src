.class public final LQ0/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final g:LQ0/u;

.field public static volatile h:LQ0/w;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:LQ0/m;

.field public final c:LA/b;

.field public final d:LQ0/C;

.field public final e:Ljava/util/WeakHashMap;

.field public final f:Ljava/util/WeakHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LQ0/u;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v0, v1, v2}, LQ0/u;-><init>(Landroid/os/Looper;I)V

    .line 9
    .line 10
    .line 11
    sput-object v0, LQ0/w;->g:LQ0/u;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    sput-object v0, LQ0/w;->h:LQ0/w;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LQ0/m;LA/b;LQ0/C;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LQ0/w;->b:LQ0/m;

    .line 5
    .line 6
    iput-object p3, p0, LQ0/w;->c:LA/b;

    .line 7
    .line 8
    new-instance p3, Ljava/util/ArrayList;

    .line 9
    .line 10
    const/4 v0, 0x7

    .line 11
    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v0, LQ0/h;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-direct {v0, p1, v1}, LQ0/h;-><init>(Landroid/content/Context;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    new-instance v0, LQ0/g;

    .line 24
    .line 25
    invoke-direct {v0, p1}, LQ0/g;-><init>(Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    new-instance v0, LQ0/q;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-direct {v0, p1, v1}, LQ0/q;-><init>(Landroid/content/Context;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    new-instance v0, LQ0/h;

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    invoke-direct {v0, p1, v1}, LQ0/h;-><init>(Landroid/content/Context;I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    new-instance v0, LQ0/b;

    .line 50
    .line 51
    invoke-direct {v0, p1}, LQ0/b;-><init>(Landroid/content/Context;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    new-instance v0, LQ0/q;

    .line 58
    .line 59
    const/4 v1, 0x1

    .line 60
    invoke-direct {v0, p1, v1}, LQ0/q;-><init>(Landroid/content/Context;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    new-instance p1, LQ0/t;

    .line 67
    .line 68
    iget-object p2, p2, LQ0/m;->c:LA/b;

    .line 69
    .line 70
    invoke-direct {p1, p2, p4}, LQ0/t;-><init>(LA/b;LQ0/C;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    invoke-static {p3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iput-object p1, p0, LQ0/w;->a:Ljava/util/List;

    .line 81
    .line 82
    iput-object p4, p0, LQ0/w;->d:LQ0/C;

    .line 83
    .line 84
    new-instance p1, Ljava/util/WeakHashMap;

    .line 85
    .line 86
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 87
    .line 88
    .line 89
    iput-object p1, p0, LQ0/w;->e:Ljava/util/WeakHashMap;

    .line 90
    .line 91
    new-instance p1, Ljava/util/WeakHashMap;

    .line 92
    .line 93
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 94
    .line 95
    .line 96
    iput-object p1, p0, LQ0/w;->f:Ljava/util/WeakHashMap;

    .line 97
    .line 98
    new-instance p1, Ljava/lang/ref/ReferenceQueue;

    .line 99
    .line 100
    invoke-direct {p1}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    .line 101
    .line 102
    .line 103
    new-instance p2, LQ0/v;

    .line 104
    .line 105
    sget-object p3, LQ0/w;->g:LQ0/u;

    .line 106
    .line 107
    invoke-direct {p2, p1, p3}, LQ0/v;-><init>(Ljava/lang/ref/ReferenceQueue;LQ0/u;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public static c()LQ0/w;
    .locals 18

    .line 1
    sget-object v0, LQ0/w;->h:LQ0/w;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    const-class v1, LQ0/w;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    sget-object v0, LQ0/w;->h:LQ0/w;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    sget-object v0, Lcom/squareup/picasso/PicassoProvider;->f:Landroid/content/Context;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v6, LA/b;

    .line 21
    .line 22
    const/16 v2, 0x9

    .line 23
    .line 24
    invoke-direct {v6, v0, v2}, LA/b;-><init>(Landroid/content/Context;I)V

    .line 25
    .line 26
    .line 27
    new-instance v9, LA/b;

    .line 28
    .line 29
    const/16 v2, 0x8

    .line 30
    .line 31
    invoke-direct {v9, v0, v2}, LA/b;-><init>(Landroid/content/Context;I)V

    .line 32
    .line 33
    .line 34
    new-instance v4, LQ0/y;

    .line 35
    .line 36
    sget-object v15, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 37
    .line 38
    new-instance v16, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 39
    .line 40
    invoke-direct/range {v16 .. v16}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    .line 41
    .line 42
    .line 43
    new-instance v17, LQ0/G;

    .line 44
    .line 45
    invoke-direct/range {v17 .. v17}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    const/4 v11, 0x3

    .line 49
    const/4 v12, 0x3

    .line 50
    const-wide/16 v13, 0x0

    .line 51
    .line 52
    move-object v10, v4

    .line 53
    invoke-direct/range {v10 .. v17}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 54
    .line 55
    .line 56
    new-instance v10, LQ0/C;

    .line 57
    .line 58
    invoke-direct {v10, v9}, LQ0/C;-><init>(LA/b;)V

    .line 59
    .line 60
    .line 61
    new-instance v11, LQ0/m;

    .line 62
    .line 63
    sget-object v5, LQ0/w;->g:LQ0/u;

    .line 64
    .line 65
    move-object v2, v11

    .line 66
    move-object v3, v0

    .line 67
    move-object v7, v9

    .line 68
    move-object v8, v10

    .line 69
    invoke-direct/range {v2 .. v8}, LQ0/m;-><init>(Landroid/content/Context;LQ0/y;LQ0/u;LA/b;LA/b;LQ0/C;)V

    .line 70
    .line 71
    .line 72
    new-instance v2, LQ0/w;

    .line 73
    .line 74
    invoke-direct {v2, v0, v11, v9, v10}, LQ0/w;-><init>(Landroid/content/Context;LQ0/m;LA/b;LQ0/C;)V

    .line 75
    .line 76
    .line 77
    sput-object v2, LQ0/w;->h:LQ0/w;

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :catchall_0
    move-exception v0

    .line 81
    goto :goto_1

    .line 82
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 83
    .line 84
    const-string v2, "context == null"

    .line 85
    .line 86
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw v0

    .line 90
    :cond_1
    :goto_0
    monitor-exit v1

    .line 91
    goto :goto_2

    .line 92
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    throw v0

    .line 94
    :cond_2
    :goto_2
    sget-object v0, LQ0/w;->h:LQ0/w;

    .line 95
    .line 96
    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    .line 1
    sget-object v0, LQ0/H;->a:Lr1/h;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-ne v0, v1, :cond_3

    .line 16
    .line 17
    iget-object v0, p0, LQ0/w;->e:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, LQ0/n;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    iput-boolean v1, v0, LQ0/n;->f:Z

    .line 29
    .line 30
    iget-object v1, p0, LQ0/w;->b:LQ0/m;

    .line 31
    .line 32
    const/4 v2, 0x2

    .line 33
    iget-object v1, v1, LQ0/m;->h:LQ0/j;

    .line 34
    .line 35
    invoke-virtual {v1, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 40
    .line 41
    .line 42
    :cond_0
    instance-of v0, p1, Landroid/widget/ImageView;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    check-cast p1, Landroid/widget/ImageView;

    .line 47
    .line 48
    iget-object v0, p0, LQ0/w;->f:Ljava/util/WeakHashMap;

    .line 49
    .line 50
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-nez p1, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    new-instance p1, Ljava/lang/ClassCastException;

    .line 58
    .line 59
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :cond_2
    :goto_0
    return-void

    .line 64
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 65
    .line 66
    const-string v0, "Method call should happen from the main thread."

    .line 67
    .line 68
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p1
.end method

.method public final b(Landroid/graphics/Bitmap;ILQ0/n;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    iget-boolean p4, p3, LQ0/n;->f:Z

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-boolean p4, p3, LQ0/n;->e:Z

    .line 7
    .line 8
    if-nez p4, :cond_1

    .line 9
    .line 10
    iget-object p4, p0, LQ0/w;->e:Ljava/util/WeakHashMap;

    .line 11
    .line 12
    invoke-virtual {p3}, LQ0/n;->a()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    invoke-virtual {p4, p3}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :cond_1
    if-eqz p1, :cond_3

    .line 20
    .line 21
    if-eqz p2, :cond_2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    .line 25
    .line 26
    const-string p2, "LoadedFrom cannot be null."

    .line 27
    .line 28
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_3
    :goto_0
    return-void
.end method
