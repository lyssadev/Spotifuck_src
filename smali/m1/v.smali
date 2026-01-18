.class public final Lm1/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr1/u;


# instance fields
.field public final a:Lr1/e;

.field public b:Z

.field public c:Z

.field public final synthetic d:Lm1/y;


# direct methods
.method public constructor <init>(Lm1/y;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm1/v;->d:Lm1/y;

    .line 5
    .line 6
    new-instance p1, Lr1/e;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lm1/v;->a:Lr1/e;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()Lr1/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lm1/v;->d:Lm1/y;

    .line 2
    .line 3
    iget-object v0, v0, Lm1/y;->j:Lm1/x;

    .line 4
    .line 5
    return-object v0
.end method

.method public final b(Lr1/e;J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lm1/v;->a:Lr1/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lr1/e;->b(Lr1/e;J)V

    .line 4
    .line 5
    .line 6
    :goto_0
    iget-wide p1, v0, Lr1/e;->b:J

    .line 7
    .line 8
    const-wide/16 v1, 0x4000

    .line 9
    .line 10
    cmp-long p3, p1, v1

    .line 11
    .line 12
    if-ltz p3, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    invoke-virtual {p0, p1}, Lm1/v;->f(Z)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public final close()V
    .locals 13

    .line 1
    iget-object v0, p0, Lm1/v;->d:Lm1/y;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lm1/v;->b:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception v1

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    iget-object v0, p0, Lm1/v;->d:Lm1/y;

    .line 14
    .line 15
    iget-object v1, v0, Lm1/y;->h:Lm1/v;

    .line 16
    .line 17
    iget-boolean v1, v1, Lm1/v;->c:Z

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    iget-object v1, p0, Lm1/v;->a:Lr1/e;

    .line 23
    .line 24
    iget-wide v3, v1, Lr1/e;->b:J

    .line 25
    .line 26
    const-wide/16 v5, 0x0

    .line 27
    .line 28
    cmp-long v1, v3, v5

    .line 29
    .line 30
    if-lez v1, :cond_1

    .line 31
    .line 32
    :goto_0
    iget-object v0, p0, Lm1/v;->a:Lr1/e;

    .line 33
    .line 34
    iget-wide v0, v0, Lr1/e;->b:J

    .line 35
    .line 36
    cmp-long v3, v0, v5

    .line 37
    .line 38
    if-lez v3, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0, v2}, Lm1/v;->f(Z)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iget-object v7, v0, Lm1/y;->d:Lm1/s;

    .line 45
    .line 46
    iget v8, v0, Lm1/y;->c:I

    .line 47
    .line 48
    const-wide/16 v11, 0x0

    .line 49
    .line 50
    const/4 v9, 0x1

    .line 51
    const/4 v10, 0x0

    .line 52
    invoke-virtual/range {v7 .. v12}, Lm1/s;->l(IZLr1/e;J)V

    .line 53
    .line 54
    .line 55
    :cond_2
    iget-object v1, p0, Lm1/v;->d:Lm1/y;

    .line 56
    .line 57
    monitor-enter v1

    .line 58
    :try_start_1
    iput-boolean v2, p0, Lm1/v;->b:Z

    .line 59
    .line 60
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 61
    iget-object v0, p0, Lm1/v;->d:Lm1/y;

    .line 62
    .line 63
    iget-object v0, v0, Lm1/y;->d:Lm1/s;

    .line 64
    .line 65
    invoke-virtual {v0}, Lm1/s;->flush()V

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lm1/v;->d:Lm1/y;

    .line 69
    .line 70
    invoke-virtual {v0}, Lm1/y;->a()V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :catchall_1
    move-exception v0

    .line 75
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 76
    throw v0

    .line 77
    :goto_1
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 78
    throw v1
.end method

.method public final f(Z)V
    .locals 11

    .line 1
    iget-object v0, p0, Lm1/v;->d:Lm1/y;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lm1/v;->d:Lm1/y;

    .line 5
    .line 6
    iget-object v1, v1, Lm1/y;->j:Lm1/x;

    .line 7
    .line 8
    invoke-virtual {v1}, Lr1/c;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 9
    .line 10
    .line 11
    :goto_0
    :try_start_1
    iget-object v1, p0, Lm1/v;->d:Lm1/y;

    .line 12
    .line 13
    iget-wide v2, v1, Lm1/y;->b:J

    .line 14
    .line 15
    const-wide/16 v4, 0x0

    .line 16
    .line 17
    cmp-long v6, v2, v4

    .line 18
    .line 19
    if-gtz v6, :cond_0

    .line 20
    .line 21
    iget-boolean v2, p0, Lm1/v;->c:Z

    .line 22
    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    iget-boolean v2, p0, Lm1/v;->b:Z

    .line 26
    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    iget v2, v1, Lm1/y;->k:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catch_0
    :try_start_3
    new-instance p1, Ljava/io/InterruptedIOException;

    .line 38
    .line 39
    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    .line 40
    .line 41
    .line 42
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_3

    .line 45
    :cond_0
    :try_start_4
    iget-object v1, v1, Lm1/y;->j:Lm1/x;

    .line 46
    .line 47
    invoke-virtual {v1}, Lm1/x;->n()V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lm1/v;->d:Lm1/y;

    .line 51
    .line 52
    invoke-virtual {v1}, Lm1/y;->b()V

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lm1/v;->d:Lm1/y;

    .line 56
    .line 57
    iget-wide v1, v1, Lm1/y;->b:J

    .line 58
    .line 59
    iget-object v3, p0, Lm1/v;->a:Lr1/e;

    .line 60
    .line 61
    iget-wide v3, v3, Lr1/e;->b:J

    .line 62
    .line 63
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 64
    .line 65
    .line 66
    move-result-wide v9

    .line 67
    iget-object v1, p0, Lm1/v;->d:Lm1/y;

    .line 68
    .line 69
    iget-wide v2, v1, Lm1/y;->b:J

    .line 70
    .line 71
    sub-long/2addr v2, v9

    .line 72
    iput-wide v2, v1, Lm1/y;->b:J

    .line 73
    .line 74
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 75
    iget-object v0, v1, Lm1/y;->j:Lm1/x;

    .line 76
    .line 77
    invoke-virtual {v0}, Lr1/c;->i()V

    .line 78
    .line 79
    .line 80
    :try_start_5
    iget-object v0, p0, Lm1/v;->d:Lm1/y;

    .line 81
    .line 82
    iget-object v5, v0, Lm1/y;->d:Lm1/s;

    .line 83
    .line 84
    iget v6, v0, Lm1/y;->c:I

    .line 85
    .line 86
    if-eqz p1, :cond_1

    .line 87
    .line 88
    iget-object p1, p0, Lm1/v;->a:Lr1/e;

    .line 89
    .line 90
    iget-wide v0, p1, Lr1/e;->b:J

    .line 91
    .line 92
    cmp-long p1, v9, v0

    .line 93
    .line 94
    if-nez p1, :cond_1

    .line 95
    .line 96
    const/4 p1, 0x1

    .line 97
    const/4 v7, 0x1

    .line 98
    goto :goto_1

    .line 99
    :catchall_1
    move-exception p1

    .line 100
    goto :goto_2

    .line 101
    :cond_1
    const/4 p1, 0x0

    .line 102
    const/4 v7, 0x0

    .line 103
    :goto_1
    iget-object v8, p0, Lm1/v;->a:Lr1/e;

    .line 104
    .line 105
    invoke-virtual/range {v5 .. v10}, Lm1/s;->l(IZLr1/e;J)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 106
    .line 107
    .line 108
    iget-object p1, p0, Lm1/v;->d:Lm1/y;

    .line 109
    .line 110
    iget-object p1, p1, Lm1/y;->j:Lm1/x;

    .line 111
    .line 112
    invoke-virtual {p1}, Lm1/x;->n()V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :goto_2
    iget-object v0, p0, Lm1/v;->d:Lm1/y;

    .line 117
    .line 118
    iget-object v0, v0, Lm1/y;->j:Lm1/x;

    .line 119
    .line 120
    invoke-virtual {v0}, Lm1/x;->n()V

    .line 121
    .line 122
    .line 123
    throw p1

    .line 124
    :catchall_2
    move-exception p1

    .line 125
    goto :goto_4

    .line 126
    :goto_3
    :try_start_6
    iget-object v1, p0, Lm1/v;->d:Lm1/y;

    .line 127
    .line 128
    iget-object v1, v1, Lm1/y;->j:Lm1/x;

    .line 129
    .line 130
    invoke-virtual {v1}, Lm1/x;->n()V

    .line 131
    .line 132
    .line 133
    throw p1

    .line 134
    :goto_4
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 135
    throw p1
.end method

.method public final flush()V
    .locals 5

    .line 1
    iget-object v0, p0, Lm1/v;->d:Lm1/y;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lm1/v;->d:Lm1/y;

    .line 5
    .line 6
    invoke-virtual {v1}, Lm1/y;->b()V

    .line 7
    .line 8
    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    :goto_0
    iget-object v0, p0, Lm1/v;->a:Lr1/e;

    .line 11
    .line 12
    iget-wide v0, v0, Lr1/e;->b:J

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    cmp-long v4, v0, v2

    .line 17
    .line 18
    if-lez v4, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p0, v0}, Lm1/v;->f(Z)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lm1/v;->d:Lm1/y;

    .line 25
    .line 26
    iget-object v0, v0, Lm1/y;->d:Lm1/s;

    .line 27
    .line 28
    invoke-virtual {v0}, Lm1/s;->flush()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void

    .line 33
    :catchall_0
    move-exception v1

    .line 34
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    throw v1
.end method
