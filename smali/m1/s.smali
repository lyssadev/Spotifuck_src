.class public final Lm1/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final u:Ljava/util/concurrent/ThreadPoolExecutor;


# instance fields
.field public final a:Z

.field public final b:Lm1/o;

.field public final c:Ljava/util/LinkedHashMap;

.field public final d:Ljava/lang/String;

.field public e:I

.field public f:I

.field public g:Z

.field public final h:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field public final i:Ljava/util/concurrent/ThreadPoolExecutor;

.field public final j:Lm1/C;

.field public k:Z

.field public l:J

.field public m:J

.field public final n:LK/j;

.field public final o:LK/j;

.field public p:Z

.field public final q:Ljava/net/Socket;

.field public final r:Lm1/z;

.field public final s:Lm1/q;

.field public final t:Ljava/util/LinkedHashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v8, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 2
    .line 3
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 4
    .line 5
    new-instance v6, Ljava/util/concurrent/SynchronousQueue;

    .line 6
    .line 7
    invoke-direct {v6}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    .line 8
    .line 9
    .line 10
    sget-object v0, Lh1/c;->a:[B

    .line 11
    .line 12
    new-instance v7, Lh1/b;

    .line 13
    .line 14
    const-string v0, "OkHttp Http2Connection"

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-direct {v7, v0, v1}, Lh1/b;-><init>(Ljava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    const v2, 0x7fffffff

    .line 21
    .line 22
    .line 23
    const-wide/16 v3, 0x3c

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    move-object v0, v8

    .line 27
    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 28
    .line 29
    .line 30
    sput-object v8, Lm1/s;->u:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 31
    .line 32
    return-void
.end method

.method public constructor <init>(Lm1/m;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v2, v0, Lm1/s;->c:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    iput-wide v2, v0, Lm1/s;->l:J

    .line 18
    .line 19
    new-instance v2, LK/j;

    .line 20
    .line 21
    invoke-direct {v2}, LK/j;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v2, v0, Lm1/s;->n:LK/j;

    .line 25
    .line 26
    new-instance v3, LK/j;

    .line 27
    .line 28
    invoke-direct {v3}, LK/j;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v3, v0, Lm1/s;->o:LK/j;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    iput-boolean v4, v0, Lm1/s;->p:Z

    .line 35
    .line 36
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 37
    .line 38
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v5, v0, Lm1/s;->t:Ljava/util/LinkedHashSet;

    .line 42
    .line 43
    sget-object v5, Lm1/C;->a:Lm1/C;

    .line 44
    .line 45
    iput-object v5, v0, Lm1/s;->j:Lm1/C;

    .line 46
    .line 47
    iget-boolean v5, v1, Lm1/m;->f:Z

    .line 48
    .line 49
    iput-boolean v5, v0, Lm1/s;->a:Z

    .line 50
    .line 51
    iget-object v6, v1, Lm1/m;->e:Lm1/o;

    .line 52
    .line 53
    iput-object v6, v0, Lm1/s;->b:Lm1/o;

    .line 54
    .line 55
    const/4 v6, 0x2

    .line 56
    const/4 v7, 0x1

    .line 57
    if-eqz v5, :cond_0

    .line 58
    .line 59
    const/4 v8, 0x1

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    const/4 v8, 0x2

    .line 62
    :goto_0
    iput v8, v0, Lm1/s;->f:I

    .line 63
    .line 64
    if-eqz v5, :cond_1

    .line 65
    .line 66
    add-int/2addr v8, v6

    .line 67
    iput v8, v0, Lm1/s;->f:I

    .line 68
    .line 69
    :cond_1
    const/4 v6, 0x7

    .line 70
    if-eqz v5, :cond_2

    .line 71
    .line 72
    const/high16 v8, 0x1000000

    .line 73
    .line 74
    invoke-virtual {v2, v6, v8}, LK/j;->d(II)V

    .line 75
    .line 76
    .line 77
    :cond_2
    iget-object v2, v1, Lm1/m;->b:Ljava/lang/String;

    .line 78
    .line 79
    iput-object v2, v0, Lm1/s;->d:Ljava/lang/String;

    .line 80
    .line 81
    new-instance v8, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 82
    .line 83
    sget-object v9, Lh1/c;->a:[B

    .line 84
    .line 85
    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 86
    .line 87
    const-string v9, "OkHttp "

    .line 88
    .line 89
    const-string v10, " Writer"

    .line 90
    .line 91
    invoke-static {v9, v2, v10}, LQ0/E;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v10

    .line 95
    new-instance v11, Lh1/b;

    .line 96
    .line 97
    invoke-direct {v11, v10, v4}, Lh1/b;-><init>(Ljava/lang/String;Z)V

    .line 98
    .line 99
    .line 100
    invoke-direct {v8, v7, v11}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    .line 101
    .line 102
    .line 103
    iput-object v8, v0, Lm1/s;->h:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 104
    .line 105
    new-instance v4, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 106
    .line 107
    sget-object v17, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 108
    .line 109
    new-instance v18, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 110
    .line 111
    invoke-direct/range {v18 .. v18}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 112
    .line 113
    .line 114
    const-string v8, " Push Observer"

    .line 115
    .line 116
    invoke-static {v9, v2, v8}, LQ0/E;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    new-instance v8, Lh1/b;

    .line 121
    .line 122
    invoke-direct {v8, v2, v7}, Lh1/b;-><init>(Ljava/lang/String;Z)V

    .line 123
    .line 124
    .line 125
    const/4 v14, 0x1

    .line 126
    const-wide/16 v15, 0x3c

    .line 127
    .line 128
    const/4 v13, 0x0

    .line 129
    move-object v12, v4

    .line 130
    move-object/from16 v19, v8

    .line 131
    .line 132
    invoke-direct/range {v12 .. v19}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 133
    .line 134
    .line 135
    iput-object v4, v0, Lm1/s;->i:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 136
    .line 137
    const v2, 0xffff

    .line 138
    .line 139
    .line 140
    invoke-virtual {v3, v6, v2}, LK/j;->d(II)V

    .line 141
    .line 142
    .line 143
    const/4 v2, 0x5

    .line 144
    const/16 v4, 0x4000

    .line 145
    .line 146
    invoke-virtual {v3, v2, v4}, LK/j;->d(II)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3}, LK/j;->b()I

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    int-to-long v2, v2

    .line 154
    iput-wide v2, v0, Lm1/s;->m:J

    .line 155
    .line 156
    iget-object v2, v1, Lm1/m;->a:Ljava/net/Socket;

    .line 157
    .line 158
    iput-object v2, v0, Lm1/s;->q:Ljava/net/Socket;

    .line 159
    .line 160
    new-instance v2, Lm1/z;

    .line 161
    .line 162
    iget-object v3, v1, Lm1/m;->d:Lr1/p;

    .line 163
    .line 164
    invoke-direct {v2, v3, v5}, Lm1/z;-><init>(Lr1/p;Z)V

    .line 165
    .line 166
    .line 167
    iput-object v2, v0, Lm1/s;->r:Lm1/z;

    .line 168
    .line 169
    new-instance v2, Lm1/q;

    .line 170
    .line 171
    new-instance v3, Lm1/u;

    .line 172
    .line 173
    iget-object v1, v1, Lm1/m;->c:Lr1/q;

    .line 174
    .line 175
    invoke-direct {v3, v1, v5}, Lm1/u;-><init>(Lr1/q;Z)V

    .line 176
    .line 177
    .line 178
    invoke-direct {v2, v0, v3}, Lm1/q;-><init>(Lm1/s;Lm1/u;)V

    .line 179
    .line 180
    .line 181
    iput-object v2, v0, Lm1/s;->s:Lm1/q;

    .line 182
    .line 183
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x6

    .line 3
    invoke-virtual {p0, v0, v1}, Lm1/s;->f(II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f(II)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0, p1}, Lm1/s;->k(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3
    .line 4
    .line 5
    move-object p1, v0

    .line 6
    goto :goto_0

    .line 7
    :catch_0
    move-exception p1

    .line 8
    :goto_0
    monitor-enter p0

    .line 9
    :try_start_1
    iget-object v1, p0, Lm1/s;->c:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lm1/s;->c:Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, Lm1/s;->c:Ljava/util/LinkedHashMap;

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    new-array v1, v1, [Lm1/y;

    .line 30
    .line 31
    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, [Lm1/y;

    .line 36
    .line 37
    iget-object v1, p0, Lm1/s;->c:Ljava/util/LinkedHashMap;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_6

    .line 45
    :cond_0
    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    array-length v1, v0

    .line 49
    const/4 v2, 0x0

    .line 50
    :goto_2
    if-ge v2, v1, :cond_2

    .line 51
    .line 52
    aget-object v3, v0, v2

    .line 53
    .line 54
    :try_start_2
    invoke-virtual {v3, p2}, Lm1/y;->c(I)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 55
    .line 56
    .line 57
    goto :goto_3

    .line 58
    :catch_1
    move-exception v3

    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    move-object p1, v3

    .line 62
    :cond_1
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    :try_start_3
    iget-object p2, p0, Lm1/s;->r:Lm1/z;

    .line 66
    .line 67
    invoke-virtual {p2}, Lm1/z;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 68
    .line 69
    .line 70
    goto :goto_4

    .line 71
    :catch_2
    move-exception p2

    .line 72
    if-nez p1, :cond_3

    .line 73
    .line 74
    move-object p1, p2

    .line 75
    :cond_3
    :goto_4
    :try_start_4
    iget-object p2, p0, Lm1/s;->q:Ljava/net/Socket;

    .line 76
    .line 77
    invoke-virtual {p2}, Ljava/net/Socket;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 78
    .line 79
    .line 80
    goto :goto_5

    .line 81
    :catch_3
    move-exception p1

    .line 82
    :goto_5
    iget-object p2, p0, Lm1/s;->h:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 83
    .line 84
    invoke-virtual {p2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->shutdown()V

    .line 85
    .line 86
    .line 87
    iget-object p2, p0, Lm1/s;->i:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 88
    .line 89
    invoke-virtual {p2}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 90
    .line 91
    .line 92
    if-nez p1, :cond_4

    .line 93
    .line 94
    return-void

    .line 95
    :cond_4
    throw p1

    .line 96
    :goto_6
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 97
    throw p1
.end method

.method public final flush()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm1/s;->r:Lm1/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm1/z;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final g()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    :try_start_0
    invoke-virtual {p0, v0, v0}, Lm1/s;->f(II)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3
    .line 4
    .line 5
    :catch_0
    return-void
.end method

.method public final declared-synchronized h(I)Lm1/y;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lm1/s;->c:Ljava/util/LinkedHashMap;

    .line 3
    .line 4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lm1/y;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    monitor-exit p0

    .line 15
    return-object p1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw p1
.end method

.method public final declared-synchronized i()I
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lm1/s;->o:LK/j;

    .line 3
    .line 4
    iget v1, v0, LK/j;->f:I

    .line 5
    .line 6
    and-int/lit8 v1, v1, 0x10

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v0, v0, LK/j;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, [I

    .line 13
    .line 14
    const/4 v1, 0x4

    .line 15
    aget v0, v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const v0, 0x7fffffff

    .line 19
    .line 20
    .line 21
    :goto_0
    monitor-exit p0

    .line 22
    return v0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    throw v0
.end method

.method public final declared-synchronized j(I)Lm1/y;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lm1/s;->c:Ljava/util/LinkedHashMap;

    .line 3
    .line 4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lm1/y;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return-object p1

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw p1
.end method

.method public final k(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lm1/s;->r:Lm1/z;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    :try_start_1
    iget-boolean v1, p0, Lm1/s;->g:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 10
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    goto :goto_1

    .line 14
    :catchall_1
    move-exception p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x1

    .line 17
    :try_start_3
    iput-boolean v1, p0, Lm1/s;->g:Z

    .line 18
    .line 19
    iget v1, p0, Lm1/s;->e:I

    .line 20
    .line 21
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 22
    :try_start_4
    iget-object v2, p0, Lm1/s;->r:Lm1/z;

    .line 23
    .line 24
    sget-object v3, Lh1/c;->a:[B

    .line 25
    .line 26
    invoke-virtual {v2, v3, v1, p1}, Lm1/z;->i([BII)V

    .line 27
    .line 28
    .line 29
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 30
    return-void

    .line 31
    :goto_0
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 32
    :try_start_6
    throw p1

    .line 33
    :goto_1
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 34
    throw p1
.end method

.method public final l(IZLr1/e;J)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const-wide/16 v1, 0x0

    .line 3
    .line 4
    cmp-long v3, p4, v1

    .line 5
    .line 6
    if-nez v3, :cond_0

    .line 7
    .line 8
    iget-object p4, p0, Lm1/s;->r:Lm1/z;

    .line 9
    .line 10
    invoke-virtual {p4, p2, p1, p3, v0}, Lm1/z;->g(ZILr1/e;I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    :goto_0
    cmp-long v3, p4, v1

    .line 15
    .line 16
    if-lez v3, :cond_4

    .line 17
    .line 18
    monitor-enter p0

    .line 19
    :goto_1
    :try_start_0
    iget-wide v3, p0, Lm1/s;->m:J

    .line 20
    .line 21
    cmp-long v5, v3, v1

    .line 22
    .line 23
    if-gtz v5, :cond_2

    .line 24
    .line 25
    iget-object v3, p0, Lm1/s;->c:Ljava/util/LinkedHashMap;

    .line 26
    .line 27
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_3

    .line 43
    :cond_1
    new-instance p1, Ljava/io/IOException;

    .line 44
    .line 45
    const-string p2, "stream closed"

    .line 46
    .line 47
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    :cond_2
    :try_start_1
    invoke-static {p4, p5, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 52
    .line 53
    .line 54
    move-result-wide v3

    .line 55
    long-to-int v4, v3

    .line 56
    iget-object v3, p0, Lm1/s;->r:Lm1/z;

    .line 57
    .line 58
    iget v3, v3, Lm1/z;->d:I

    .line 59
    .line 60
    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    iget-wide v4, p0, Lm1/s;->m:J

    .line 65
    .line 66
    int-to-long v6, v3

    .line 67
    sub-long/2addr v4, v6

    .line 68
    iput-wide v4, p0, Lm1/s;->m:J

    .line 69
    .line 70
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    sub-long/2addr p4, v6

    .line 72
    iget-object v4, p0, Lm1/s;->r:Lm1/z;

    .line 73
    .line 74
    if-eqz p2, :cond_3

    .line 75
    .line 76
    cmp-long v5, p4, v1

    .line 77
    .line 78
    if-nez v5, :cond_3

    .line 79
    .line 80
    const/4 v5, 0x1

    .line 81
    goto :goto_2

    .line 82
    :cond_3
    const/4 v5, 0x0

    .line 83
    :goto_2
    invoke-virtual {v4, v5, p1, p3, v3}, Lm1/z;->g(ZILr1/e;I)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :catch_0
    :try_start_2
    new-instance p1, Ljava/io/InterruptedIOException;

    .line 88
    .line 89
    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    .line 90
    .line 91
    .line 92
    throw p1

    .line 93
    :goto_3
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 94
    throw p1

    .line 95
    :cond_4
    return-void
.end method

.method public final m(II)V
    .locals 6

    .line 1
    :try_start_0
    iget-object v0, p0, Lm1/s;->h:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 2
    .line 3
    new-instance v1, Lm1/i;

    .line 4
    .line 5
    iget-object v2, p0, Lm1/s;->d:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    const/4 v4, 0x2

    .line 12
    new-array v4, v4, [Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    aput-object v2, v4, v5

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    aput-object v3, v4, v2

    .line 19
    .line 20
    invoke-direct {v1, p0, v4, p1, p2}, Lm1/i;-><init>(Lm1/s;[Ljava/lang/Object;II)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    :catch_0
    return-void
.end method

.method public final n(IJ)V
    .locals 8

    .line 1
    :try_start_0
    iget-object v0, p0, Lm1/s;->h:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 2
    .line 3
    new-instance v7, Lm1/j;

    .line 4
    .line 5
    iget-object v1, p0, Lm1/s;->d:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const/4 v3, 0x2

    .line 12
    new-array v3, v3, [Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    aput-object v1, v3, v4

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    aput-object v2, v3, v1

    .line 19
    .line 20
    move-object v1, v7

    .line 21
    move-object v2, p0

    .line 22
    move v4, p1

    .line 23
    move-wide v5, p2

    .line 24
    invoke-direct/range {v1 .. v6}, Lm1/j;-><init>(Lm1/s;[Ljava/lang/Object;IJ)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v7}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    :catch_0
    return-void
.end method
