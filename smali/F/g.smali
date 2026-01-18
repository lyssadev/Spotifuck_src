.class public abstract LF/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp0/a;

.field public static final b:Lr/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, LF/l;

    .line 8
    .line 9
    invoke-direct {v0}, Lp0/a;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v0, LF/g;->a:Lp0/a;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/16 v1, 0x1c

    .line 16
    .line 17
    if-lt v0, v1, :cond_1

    .line 18
    .line 19
    new-instance v0, LF/k;

    .line 20
    .line 21
    invoke-direct {v0}, LF/j;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v0, LF/g;->a:Lp0/a;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/16 v1, 0x1a

    .line 28
    .line 29
    if-lt v0, v1, :cond_2

    .line 30
    .line 31
    new-instance v0, LF/j;

    .line 32
    .line 33
    invoke-direct {v0}, LF/j;-><init>()V

    .line 34
    .line 35
    .line 36
    sput-object v0, LF/g;->a:Lp0/a;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    const/16 v1, 0x18

    .line 40
    .line 41
    if-lt v0, v1, :cond_4

    .line 42
    .line 43
    sget-object v0, LF/i;->q:Ljava/lang/reflect/Method;

    .line 44
    .line 45
    if-nez v0, :cond_3

    .line 46
    .line 47
    const-string v1, "TypefaceCompatApi24Impl"

    .line 48
    .line 49
    const-string v2, "Unable to collect necessary private methods.Fallback to legacy implementation."

    .line 50
    .line 51
    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    :cond_3
    if-eqz v0, :cond_4

    .line 55
    .line 56
    new-instance v0, LF/i;

    .line 57
    .line 58
    invoke-direct {v0}, Lp0/a;-><init>()V

    .line 59
    .line 60
    .line 61
    sput-object v0, LF/g;->a:Lp0/a;

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_4
    new-instance v0, LF/h;

    .line 65
    .line 66
    invoke-direct {v0}, Lp0/a;-><init>()V

    .line 67
    .line 68
    .line 69
    sput-object v0, LF/g;->a:Lp0/a;

    .line 70
    .line 71
    :goto_0
    new-instance v0, Lr/f;

    .line 72
    .line 73
    const/16 v1, 0x10

    .line 74
    .line 75
    invoke-direct {v0, v1}, Lr/f;-><init>(I)V

    .line 76
    .line 77
    .line 78
    sput-object v0, LF/g;->b:Lr/f;

    .line 79
    .line 80
    return-void
.end method

.method public static a(Landroid/content/Context;LE/f;Landroid/content/res/Resources;ILjava/lang/String;IILE/b;Z)Landroid/graphics/Typeface;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v7, p6

    move-object/from16 v2, p7

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    .line 1
    instance-of v5, v1, LE/i;

    const/4 v10, -0x3

    if-eqz v5, :cond_d

    .line 2
    check-cast v1, LE/i;

    .line 3
    iget-object v5, v1, LE/i;->d:Ljava/lang/String;

    const/4 v11, 0x0

    if-eqz v5, :cond_1

    .line 4
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    invoke-static {v5, v9}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v5

    .line 6
    sget-object v6, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-static {v6, v9}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v6

    if-eqz v5, :cond_1

    .line 7
    invoke-virtual {v5, v6}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    move-object v5, v11

    :goto_1
    if-eqz v5, :cond_3

    if-eqz v2, :cond_2

    .line 8
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 9
    new-instance v1, LE/o;

    invoke-direct {v1, v2, v5, v9}, LE/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_2
    return-object v5

    :cond_3
    if-eqz p8, :cond_5

    .line 10
    iget v5, v1, LE/i;->c:I

    if-nez v5, :cond_4

    :goto_2
    const/4 v5, 0x1

    goto :goto_3

    :cond_4
    const/4 v5, 0x0

    goto :goto_3

    :cond_5
    if-nez v2, :cond_4

    goto :goto_2

    :goto_3
    const/4 v6, -0x1

    if-eqz p8, :cond_6

    .line 11
    iget v12, v1, LE/i;->b:I

    goto :goto_4

    :cond_6
    const/4 v12, -0x1

    .line 12
    :goto_4
    new-instance v13, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v14

    invoke-direct {v13, v14}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 13
    new-instance v14, LA/b;

    .line 14
    invoke-direct {v14, v4}, LA/b;-><init>(I)V

    .line 15
    iput-object v2, v14, LA/b;->g:Ljava/lang/Object;

    .line 16
    iget-object v15, v1, LE/i;->a:LK/e;

    .line 17
    new-instance v2, LE/j;

    invoke-direct {v2, v14, v13, v4}, LE/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    if-eqz v5, :cond_9

    .line 18
    sget-object v1, LK/i;->a:Lr/f;

    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v15, LK/e;->e:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "-"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 20
    sget-object v1, LK/i;->a:Lr/f;

    invoke-virtual {v1, v4}, Lr/f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    if-eqz v1, :cond_7

    .line 21
    new-instance v0, LC/b;

    invoke-direct {v0, v14, v1, v3}, LC/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v13, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    move-object v11, v1

    goto/16 :goto_8

    :cond_7
    if-ne v12, v6, :cond_8

    .line 22
    invoke-static {v4, v0, v15, v7}, LK/i;->a(Ljava/lang/String;Landroid/content/Context;LK/e;I)LK/h;

    move-result-object v0

    .line 23
    invoke-virtual {v2, v0}, LE/j;->G(LK/h;)V

    .line 24
    iget-object v11, v0, LK/h;->a:Landroid/graphics/Typeface;

    goto/16 :goto_8

    .line 25
    :cond_8
    new-instance v8, LK/f;

    const/4 v6, 0x0

    move-object v1, v8

    move-object v13, v2

    move-object v2, v4

    move-object/from16 v3, p0

    move-object v4, v15

    move/from16 v5, p6

    invoke-direct/range {v1 .. v6}, LK/f;-><init>(Ljava/lang/String;Landroid/content/Context;LK/e;II)V

    .line 26
    :try_start_0
    sget-object v0, LK/i;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 27
    invoke-interface {v0, v8}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_3

    int-to-long v1, v12

    .line 28
    :try_start_1
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_2

    .line 29
    :try_start_2
    check-cast v0, LK/h;

    .line 30
    invoke-virtual {v13, v0}, LE/j;->G(LK/h;)V

    .line 31
    iget-object v11, v0, LK/h;->a:Landroid/graphics/Typeface;

    goto/16 :goto_8

    :catch_0
    move-exception v0

    goto :goto_5

    :catch_1
    move-exception v0

    goto :goto_6

    .line 32
    :catch_2
    new-instance v0, Ljava/lang/InterruptedException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 33
    :goto_5
    throw v0

    .line 34
    :goto_6
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_3

    .line 35
    :catch_3
    new-instance v0, LK/a;

    iget-object v1, v13, LE/j;->g:Ljava/lang/Object;

    check-cast v1, LA/b;

    invoke-direct {v0, v10, v9, v1}, LK/a;-><init>(IILjava/lang/Object;)V

    iget-object v1, v13, LE/j;->h:Ljava/lang/Object;

    check-cast v1, Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_8

    :cond_9
    move-object v1, v2

    .line 36
    sget-object v2, LK/i;->a:Lr/f;

    .line 37
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v15, LK/e;->e:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "-"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 38
    sget-object v2, LK/i;->a:Lr/f;

    invoke-virtual {v2, v10}, Lr/f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Typeface;

    if-eqz v2, :cond_a

    .line 39
    new-instance v0, LC/b;

    invoke-direct {v0, v14, v2, v3}, LC/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v13, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    move-object v11, v2

    goto :goto_8

    .line 40
    :cond_a
    new-instance v2, LK/g;

    invoke-direct {v2, v9, v1}, LK/g;-><init>(ILjava/lang/Object;)V

    .line 41
    sget-object v3, LK/i;->c:Ljava/lang/Object;

    monitor-enter v3

    .line 42
    :try_start_3
    sget-object v1, LK/i;->d:Lr/k;

    .line 43
    invoke-virtual {v1, v10, v11}, Lr/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 44
    check-cast v4, Ljava/util/ArrayList;

    if-eqz v4, :cond_b

    .line 45
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    monitor-exit v3

    goto :goto_8

    :catchall_0
    move-exception v0

    goto :goto_9

    .line 47
    :cond_b
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 48
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    invoke-virtual {v1, v10, v4}, Lr/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 51
    new-instance v9, LK/f;

    const/4 v6, 0x1

    move-object v1, v9

    move-object v2, v10

    move-object/from16 v3, p0

    move-object v4, v15

    move/from16 v5, p6

    invoke-direct/range {v1 .. v6}, LK/f;-><init>(Ljava/lang/String;Landroid/content/Context;LK/e;II)V

    .line 52
    sget-object v0, LK/i;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 53
    new-instance v1, LK/g;

    invoke-direct {v1, v8, v10}, LK/g;-><init>(ILjava/lang/Object;)V

    .line 54
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    if-nez v2, :cond_c

    .line 55
    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    goto :goto_7

    .line 56
    :cond_c
    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    .line 57
    :goto_7
    new-instance v3, LK/n;

    .line 58
    invoke-direct {v3}, LK/n;-><init>()V

    .line 59
    iput-object v9, v3, LK/n;->b:Ljava/lang/Object;

    .line 60
    iput-object v1, v3, LK/n;->c:Ljava/lang/Object;

    .line 61
    iput-object v2, v3, LK/n;->d:Ljava/lang/Object;

    .line 62
    invoke-virtual {v0, v3}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    :goto_8
    move-object/from16 v4, p2

    goto :goto_a

    .line 63
    :goto_9
    :try_start_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0

    .line 64
    :cond_d
    sget-object v3, LF/g;->a:Lp0/a;

    check-cast v1, LE/g;

    move-object/from16 v4, p2

    invoke-virtual {v3, v0, v1, v4, v7}, Lp0/a;->t(Landroid/content/Context;LE/g;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;

    move-result-object v11

    if-eqz v2, :cond_f

    if-eqz v11, :cond_e

    .line 65
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 66
    new-instance v1, LE/o;

    invoke-direct {v1, v2, v11, v9}, LE/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_a

    .line 67
    :cond_e
    invoke-virtual {v2, v10}, LE/b;->a(I)V

    :cond_f
    :goto_a
    if-eqz v11, :cond_10

    .line 68
    sget-object v0, LF/g;->b:Lr/f;

    invoke-static/range {p2 .. p6}, LF/g;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v11}, Lr/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_10
    return-object v11
.end method

.method public static b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x2d

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method
