.class public final Lg1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# instance fields
.field public final a:LA/b;

.field public final b:Li1/g;


# direct methods
.method public constructor <init>(Ljava/io/File;J)V
    .locals 11

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LA/b;

    .line 5
    .line 6
    const/16 v1, 0x1a

    .line 7
    .line 8
    invoke-direct {v0, v1, p0}, LA/b;-><init>(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lg1/h;->a:LA/b;

    .line 12
    .line 13
    sget-object v0, Li1/g;->u:Ljava/util/regex/Pattern;

    .line 14
    .line 15
    const-wide/16 v0, 0x0

    .line 16
    .line 17
    cmp-long v2, p2, v0

    .line 18
    .line 19
    if-lez v2, :cond_0

    .line 20
    .line 21
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 22
    .line 23
    sget-object v8, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 24
    .line 25
    new-instance v9, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 26
    .line 27
    invoke-direct {v9}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 28
    .line 29
    .line 30
    sget-object v1, Lh1/c;->a:[B

    .line 31
    .line 32
    new-instance v10, Lh1/b;

    .line 33
    .line 34
    const-string v1, "OkHttp DiskLruCache"

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    invoke-direct {v10, v1, v2}, Lh1/b;-><init>(Ljava/lang/String;Z)V

    .line 38
    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    const/4 v5, 0x1

    .line 42
    const-wide/16 v6, 0x3c

    .line 43
    .line 44
    move-object v3, v0

    .line 45
    invoke-direct/range {v3 .. v10}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 46
    .line 47
    .line 48
    new-instance v1, Li1/g;

    .line 49
    .line 50
    invoke-direct {v1, p1, p2, p3, v0}, Li1/g;-><init>(Ljava/io/File;JLjava/util/concurrent/ThreadPoolExecutor;)V

    .line 51
    .line 52
    .line 53
    iput-object v1, p0, Lg1/h;->b:Li1/g;

    .line 54
    .line 55
    return-void

    .line 56
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 57
    .line 58
    const-string p2, "maxSize <= 0"

    .line 59
    .line 60
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1
.end method

.method public static f(Lr1/q;)I
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const-string v2, "expected an int but was \""

    .line 4
    .line 5
    const-wide/16 v3, 0x1

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p0, v3, v4}, Lr1/q;->p(J)V

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    :goto_0
    add-int/lit8 v4, v3, 0x1

    .line 12
    .line 13
    int-to-long v5, v4

    .line 14
    invoke-virtual {p0, v5, v6}, Lr1/q;->o(J)Z

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    iget-object v6, p0, Lr1/q;->a:Lr1/e;

    .line 19
    .line 20
    if-eqz v5, :cond_4

    .line 21
    .line 22
    int-to-long v7, v3

    .line 23
    invoke-virtual {v6, v7, v8}, Lr1/e;->h(J)B

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    const/16 v7, 0x30

    .line 28
    .line 29
    if-lt v5, v7, :cond_0

    .line 30
    .line 31
    const/16 v7, 0x39

    .line 32
    .line 33
    if-le v5, v7, :cond_1

    .line 34
    .line 35
    :cond_0
    if-nez v3, :cond_2

    .line 36
    .line 37
    const/16 v7, 0x2d

    .line 38
    .line 39
    if-eq v5, v7, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move v3, v4

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    :goto_1
    if-eqz v3, :cond_3

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_3
    new-instance p0, Ljava/lang/NumberFormatException;

    .line 48
    .line 49
    invoke-static {v5}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    new-array v0, v0, [Ljava/lang/Object;

    .line 54
    .line 55
    aput-object v2, v0, v1

    .line 56
    .line 57
    const-string v1, "Expected leading [0-9] or \'-\' character but was %#x"

    .line 58
    .line 59
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-direct {p0, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p0

    .line 67
    :cond_4
    :goto_2
    invoke-virtual {v6}, Lr1/e;->l()J

    .line 68
    .line 69
    .line 70
    move-result-wide v0

    .line 71
    const-wide v3, 0x7fffffffffffffffL

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v3, v4}, Lr1/q;->n(J)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    const-wide/16 v3, 0x0

    .line 81
    .line 82
    cmp-long v5, v0, v3

    .line 83
    .line 84
    if-ltz v5, :cond_5

    .line 85
    .line 86
    const-wide/32 v3, 0x7fffffff

    .line 87
    .line 88
    .line 89
    cmp-long v5, v0, v3

    .line 90
    .line 91
    if-gtz v5, :cond_5

    .line 92
    .line 93
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-eqz v3, :cond_5

    .line 98
    .line 99
    long-to-int p0, v0

    .line 100
    return p0

    .line 101
    :catch_0
    move-exception p0

    .line 102
    goto :goto_3

    .line 103
    :cond_5
    new-instance v3, Ljava/io/IOException;

    .line 104
    .line 105
    new-instance v4, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string p0, "\""

    .line 117
    .line 118
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-direct {v3, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw v3
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 129
    :goto_3
    new-instance v0, Ljava/io/IOException;

    .line 130
    .line 131
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lg1/h;->b:Li1/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Li1/g;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final flush()V
    .locals 1

    .line 1
    iget-object v0, p0, Lg1/h;->b:Li1/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Li1/g;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final g(Lg1/A;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lg1/h;->b:Li1/g;

    .line 2
    .line 3
    iget-object p1, p1, Lg1/A;->a:Lg1/u;

    .line 4
    .line 5
    iget-object p1, p1, Lg1/u;->h:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {p1}, Lr1/h;->f(Ljava/lang/String;)Lr1/h;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v1, "MD5"

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Lr1/h;->e(Ljava/lang/String;)Lr1/h;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lr1/h;->h()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    monitor-enter v0

    .line 22
    :try_start_0
    invoke-virtual {v0}, Li1/g;->j()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Li1/g;->f()V

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Li1/g;->t(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, v0, Li1/g;->k:Ljava/util/LinkedHashMap;

    .line 32
    .line 33
    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Li1/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    if-nez p1, :cond_0

    .line 40
    .line 41
    monitor-exit v0

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    :try_start_1
    invoke-virtual {v0, p1}, Li1/g;->r(Li1/e;)V

    .line 44
    .line 45
    .line 46
    iget-wide v1, v0, Li1/g;->i:J

    .line 47
    .line 48
    iget-wide v3, v0, Li1/g;->g:J

    .line 49
    .line 50
    cmp-long p1, v1, v3

    .line 51
    .line 52
    if-gtz p1, :cond_1

    .line 53
    .line 54
    const/4 p1, 0x0

    .line 55
    iput-boolean p1, v0, Li1/g;->p:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catchall_0
    move-exception p1

    .line 59
    goto :goto_2

    .line 60
    :cond_1
    :goto_0
    monitor-exit v0

    .line 61
    :goto_1
    return-void

    .line 62
    :goto_2
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 63
    throw p1
.end method
