.class public Lr1/c;
.super Lr1/x;
.source "SourceFile"


# static fields
.field public static final h:J

.field public static final i:J

.field public static j:Lr1/c;


# instance fields
.field public e:Z

.field public f:Lr1/c;

.field public g:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    const-wide/16 v1, 0x3c

    .line 4
    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    sput-wide v0, Lr1/c;->h:J

    .line 10
    .line 11
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 12
    .line 13
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    sput-wide v0, Lr1/c;->i:J

    .line 18
    .line 19
    return-void
.end method

.method public static h()Lr1/c;
    .locals 9

    .line 1
    sget-object v0, Lr1/c;->j:Lr1/c;

    .line 2
    .line 3
    iget-object v0, v0, Lr1/c;->f:Lr1/c;

    .line 4
    .line 5
    const-class v1, Lr1/c;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 11
    .line 12
    .line 13
    move-result-wide v3

    .line 14
    sget-wide v5, Lr1/c;->h:J

    .line 15
    .line 16
    invoke-virtual {v1, v5, v6}, Ljava/lang/Object;->wait(J)V

    .line 17
    .line 18
    .line 19
    sget-object v0, Lr1/c;->j:Lr1/c;

    .line 20
    .line 21
    iget-object v0, v0, Lr1/c;->f:Lr1/c;

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    sub-long/2addr v0, v3

    .line 30
    sget-wide v3, Lr1/c;->i:J

    .line 31
    .line 32
    cmp-long v5, v0, v3

    .line 33
    .line 34
    if-ltz v5, :cond_0

    .line 35
    .line 36
    sget-object v2, Lr1/c;->j:Lr1/c;

    .line 37
    .line 38
    :cond_0
    return-object v2

    .line 39
    :cond_1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    iget-wide v5, v0, Lr1/c;->g:J

    .line 44
    .line 45
    sub-long/2addr v5, v3

    .line 46
    const-wide/16 v3, 0x0

    .line 47
    .line 48
    cmp-long v7, v5, v3

    .line 49
    .line 50
    if-lez v7, :cond_2

    .line 51
    .line 52
    const-wide/32 v3, 0xf4240

    .line 53
    .line 54
    .line 55
    div-long v7, v5, v3

    .line 56
    .line 57
    mul-long v3, v3, v7

    .line 58
    .line 59
    sub-long/2addr v5, v3

    .line 60
    long-to-int v0, v5

    .line 61
    invoke-virtual {v1, v7, v8, v0}, Ljava/lang/Object;->wait(JI)V

    .line 62
    .line 63
    .line 64
    return-object v2

    .line 65
    :cond_2
    sget-object v1, Lr1/c;->j:Lr1/c;

    .line 66
    .line 67
    iget-object v3, v0, Lr1/c;->f:Lr1/c;

    .line 68
    .line 69
    iput-object v3, v1, Lr1/c;->f:Lr1/c;

    .line 70
    .line 71
    iput-object v2, v0, Lr1/c;->f:Lr1/c;

    .line 72
    .line 73
    return-object v0
.end method


# virtual methods
.method public final i()V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lr1/c;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_8

    .line 4
    .line 5
    iget-wide v0, p0, Lr1/x;->c:J

    .line 6
    .line 7
    iget-boolean v2, p0, Lr1/x;->a:Z

    .line 8
    .line 9
    const-wide/16 v3, 0x0

    .line 10
    .line 11
    cmp-long v5, v0, v3

    .line 12
    .line 13
    if-nez v5, :cond_0

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const/4 v3, 0x1

    .line 19
    iput-boolean v3, p0, Lr1/c;->e:Z

    .line 20
    .line 21
    const-class v4, Lr1/c;

    .line 22
    .line 23
    monitor-enter v4

    .line 24
    :try_start_0
    sget-object v6, Lr1/c;->j:Lr1/c;

    .line 25
    .line 26
    if-nez v6, :cond_1

    .line 27
    .line 28
    new-instance v6, Lr1/c;

    .line 29
    .line 30
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    sput-object v6, Lr1/c;->j:Lr1/c;

    .line 34
    .line 35
    new-instance v6, LQ0/F;

    .line 36
    .line 37
    const-string v7, "Okio Watchdog"

    .line 38
    .line 39
    invoke-direct {v6, v7}, LQ0/F;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v6, v3}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v6}, Ljava/lang/Thread;->start()V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception v0

    .line 50
    goto :goto_4

    .line 51
    :cond_1
    :goto_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 52
    .line 53
    .line 54
    move-result-wide v6

    .line 55
    if-eqz v5, :cond_2

    .line 56
    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    invoke-virtual {p0}, Lr1/x;->c()J

    .line 60
    .line 61
    .line 62
    move-result-wide v2

    .line 63
    sub-long/2addr v2, v6

    .line 64
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 65
    .line 66
    .line 67
    move-result-wide v0

    .line 68
    add-long/2addr v0, v6

    .line 69
    iput-wide v0, p0, Lr1/c;->g:J

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    if-eqz v5, :cond_3

    .line 73
    .line 74
    add-long/2addr v0, v6

    .line 75
    iput-wide v0, p0, Lr1/c;->g:J

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    if-eqz v2, :cond_7

    .line 79
    .line 80
    invoke-virtual {p0}, Lr1/x;->c()J

    .line 81
    .line 82
    .line 83
    move-result-wide v0

    .line 84
    iput-wide v0, p0, Lr1/c;->g:J

    .line 85
    .line 86
    :goto_1
    iget-wide v0, p0, Lr1/c;->g:J

    .line 87
    .line 88
    sub-long/2addr v0, v6

    .line 89
    sget-object v2, Lr1/c;->j:Lr1/c;

    .line 90
    .line 91
    :goto_2
    iget-object v3, v2, Lr1/c;->f:Lr1/c;

    .line 92
    .line 93
    if-eqz v3, :cond_5

    .line 94
    .line 95
    iget-wide v8, v3, Lr1/c;->g:J

    .line 96
    .line 97
    sub-long/2addr v8, v6

    .line 98
    cmp-long v5, v0, v8

    .line 99
    .line 100
    if-gez v5, :cond_4

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_4
    move-object v2, v3

    .line 104
    goto :goto_2

    .line 105
    :cond_5
    :goto_3
    iput-object v3, p0, Lr1/c;->f:Lr1/c;

    .line 106
    .line 107
    iput-object p0, v2, Lr1/c;->f:Lr1/c;

    .line 108
    .line 109
    sget-object v0, Lr1/c;->j:Lr1/c;

    .line 110
    .line 111
    if-ne v2, v0, :cond_6

    .line 112
    .line 113
    const-class v0, Lr1/c;

    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/Object;->notify()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    .line 117
    .line 118
    :cond_6
    monitor-exit v4

    .line 119
    return-void

    .line 120
    :cond_7
    :try_start_1
    new-instance v0, Ljava/lang/AssertionError;

    .line 121
    .line 122
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 123
    .line 124
    .line 125
    throw v0

    .line 126
    :goto_4
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 127
    throw v0

    .line 128
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 129
    .line 130
    const-string v1, "Unbalanced enter/exit"

    .line 131
    .line 132
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw v0
.end method

.method public final j(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lr1/c;->k()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    invoke-virtual {p0, p1}, Lr1/c;->l(Ljava/io/IOException;)Ljava/io/IOException;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    throw p1

    .line 16
    :cond_1
    :goto_0
    return-void
.end method

.method public final k()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lr1/c;->e:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iput-boolean v1, p0, Lr1/c;->e:Z

    .line 8
    .line 9
    const-class v0, Lr1/c;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    sget-object v2, Lr1/c;->j:Lr1/c;

    .line 13
    .line 14
    :goto_0
    if-eqz v2, :cond_2

    .line 15
    .line 16
    iget-object v3, v2, Lr1/c;->f:Lr1/c;

    .line 17
    .line 18
    if-ne v3, p0, :cond_1

    .line 19
    .line 20
    iget-object v3, p0, Lr1/c;->f:Lr1/c;

    .line 21
    .line 22
    iput-object v3, v2, Lr1/c;->f:Lr1/c;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    iput-object v2, p0, Lr1/c;->f:Lr1/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    monitor-exit v0

    .line 28
    goto :goto_1

    .line 29
    :catchall_0
    move-exception v1

    .line 30
    goto :goto_2

    .line 31
    :cond_1
    move-object v2, v3

    .line 32
    goto :goto_0

    .line 33
    :cond_2
    monitor-exit v0

    .line 34
    const/4 v1, 0x1

    .line 35
    :goto_1
    return v1

    .line 36
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    throw v1
.end method

.method public l(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 2
    .line 3
    const-string v1, "timeout"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 11
    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public m()V
    .locals 0

    .line 1
    return-void
.end method
