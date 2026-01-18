.class public final synthetic Landroidx/emoji2/text/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:LA/b;

.field public final synthetic b:LT0/g;

.field public final synthetic c:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method public synthetic constructor <init>(LA/b;LT0/g;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/emoji2/text/k;->a:LA/b;

    iput-object p2, p0, Landroidx/emoji2/text/k;->b:LT0/g;

    iput-object p3, p0, Landroidx/emoji2/text/k;->c:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/k;->a:LA/b;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/emoji2/text/k;->b:LT0/g;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/emoji2/text/k;->c:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    :try_start_0
    iget-object v0, v0, LA/b;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroid/content/Context;

    .line 13
    .line 14
    invoke-static {v0}, LT0/g;->l(Landroid/content/Context;)Landroidx/emoji2/text/q;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v3, v0, Landroidx/emoji2/text/g;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v3, Landroidx/emoji2/text/i;

    .line 23
    .line 24
    check-cast v3, Landroidx/emoji2/text/p;

    .line 25
    .line 26
    iget-object v4, v3, Landroidx/emoji2/text/p;->i:Ljava/lang/Object;

    .line 27
    .line 28
    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    :try_start_1
    iput-object v2, v3, Landroidx/emoji2/text/p;->k:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 30
    .line 31
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 32
    :try_start_2
    iget-object v0, v0, Landroidx/emoji2/text/g;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Landroidx/emoji2/text/i;

    .line 35
    .line 36
    new-instance v3, Landroidx/emoji2/text/l;

    .line 37
    .line 38
    invoke-direct {v3, v1, v2}, Landroidx/emoji2/text/l;-><init>(LT0/g;Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, v3}, Landroidx/emoji2/text/i;->o(LT0/g;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    goto :goto_0

    .line 47
    :catchall_1
    move-exception v0

    .line 48
    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 49
    :try_start_4
    throw v0

    .line 50
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 51
    .line 52
    const-string v3, "EmojiCompat font provider not available on this device."

    .line 53
    .line 54
    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 58
    :goto_0
    invoke-virtual {v1, v0}, LT0/g;->A(Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 62
    .line 63
    .line 64
    :goto_1
    return-void
.end method
