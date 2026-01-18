.class public final Lm1/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J

.field public b:J

.field public final c:I

.field public final d:Lm1/s;

.field public e:Ljava/util/ArrayList;

.field public f:Z

.field public final g:Lm1/w;

.field public final h:Lm1/v;

.field public final i:Lm1/x;

.field public final j:Lm1/x;

.field public k:I


# direct methods
.method public constructor <init>(ILm1/s;ZZLjava/util/ArrayList;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lm1/y;->a:J

    .line 7
    .line 8
    new-instance p5, Lm1/x;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-direct {p5, v0, p0}, Lm1/x;-><init>(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object p5, p0, Lm1/y;->i:Lm1/x;

    .line 15
    .line 16
    new-instance p5, Lm1/x;

    .line 17
    .line 18
    invoke-direct {p5, v0, p0}, Lm1/x;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iput-object p5, p0, Lm1/y;->j:Lm1/x;

    .line 22
    .line 23
    const/4 p5, 0x0

    .line 24
    iput p5, p0, Lm1/y;->k:I

    .line 25
    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    iput p1, p0, Lm1/y;->c:I

    .line 29
    .line 30
    iput-object p2, p0, Lm1/y;->d:Lm1/s;

    .line 31
    .line 32
    iget-object p1, p2, Lm1/s;->o:LK/j;

    .line 33
    .line 34
    invoke-virtual {p1}, LK/j;->b()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    int-to-long v0, p1

    .line 39
    iput-wide v0, p0, Lm1/y;->b:J

    .line 40
    .line 41
    new-instance p1, Lm1/w;

    .line 42
    .line 43
    iget-object p2, p2, Lm1/s;->n:LK/j;

    .line 44
    .line 45
    invoke-virtual {p2}, LK/j;->b()I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    int-to-long v0, p2

    .line 50
    invoke-direct {p1, p0, v0, v1}, Lm1/w;-><init>(Lm1/y;J)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lm1/y;->g:Lm1/w;

    .line 54
    .line 55
    new-instance p2, Lm1/v;

    .line 56
    .line 57
    invoke-direct {p2, p0}, Lm1/v;-><init>(Lm1/y;)V

    .line 58
    .line 59
    .line 60
    iput-object p2, p0, Lm1/y;->h:Lm1/v;

    .line 61
    .line 62
    iput-boolean p4, p1, Lm1/w;->e:Z

    .line 63
    .line 64
    iput-boolean p3, p2, Lm1/v;->c:Z

    .line 65
    .line 66
    return-void

    .line 67
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 68
    .line 69
    const-string p2, "connection == null"

    .line 70
    .line 71
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p1
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lm1/y;->g:Lm1/w;

    .line 3
    .line 4
    iget-boolean v1, v0, Lm1/w;->e:Z

    .line 5
    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    iget-boolean v0, v0, Lm1/w;->d:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lm1/y;->h:Lm1/v;

    .line 13
    .line 14
    iget-boolean v1, v0, Lm1/v;->c:Z

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    iget-boolean v0, v0, Lm1/v;->b:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto :goto_3

    .line 25
    :cond_0
    :goto_0
    const/4 v0, 0x1

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/4 v0, 0x0

    .line 28
    :goto_1
    invoke-virtual {p0}, Lm1/y;->g()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    const/4 v0, 0x6

    .line 36
    invoke-virtual {p0, v0}, Lm1/y;->c(I)V

    .line 37
    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_2
    if-nez v1, :cond_3

    .line 41
    .line 42
    iget-object v0, p0, Lm1/y;->d:Lm1/s;

    .line 43
    .line 44
    iget v1, p0, Lm1/y;->c:I

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lm1/s;->j(I)Lm1/y;

    .line 47
    .line 48
    .line 49
    :cond_3
    :goto_2
    return-void

    .line 50
    :goto_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    throw v0
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm1/y;->h:Lm1/v;

    .line 2
    .line 3
    iget-boolean v1, v0, Lm1/v;->b:Z

    .line 4
    .line 5
    if-nez v1, :cond_2

    .line 6
    .line 7
    iget-boolean v0, v0, Lm1/v;->c:Z

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget v0, p0, Lm1/y;->k:I

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance v0, Lm1/D;

    .line 17
    .line 18
    iget v1, p0, Lm1/y;->k:I

    .line 19
    .line 20
    invoke-direct {v0, v1}, Lm1/D;-><init>(I)V

    .line 21
    .line 22
    .line 23
    throw v0

    .line 24
    :cond_1
    new-instance v0, Ljava/io/IOException;

    .line 25
    .line 26
    const-string v1, "stream finished"

    .line 27
    .line 28
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :cond_2
    new-instance v0, Ljava/io/IOException;

    .line 33
    .line 34
    const-string v1, "stream closed"

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0
.end method

.method public final c(I)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lm1/y;->d(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lm1/y;->d:Lm1/s;

    .line 9
    .line 10
    iget-object v0, v0, Lm1/s;->r:Lm1/z;

    .line 11
    .line 12
    iget v1, p0, Lm1/y;->c:I

    .line 13
    .line 14
    invoke-virtual {v0, v1, p1}, Lm1/z;->l(II)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final d(I)Z
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lm1/y;->k:I

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return v1

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lm1/y;->g:Lm1/w;

    .line 12
    .line 13
    iget-boolean v0, v0, Lm1/w;->e:Z

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lm1/y;->h:Lm1/v;

    .line 18
    .line 19
    iget-boolean v0, v0, Lm1/v;->c:Z

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    monitor-exit p0

    .line 24
    return v1

    .line 25
    :cond_1
    iput p1, p0, Lm1/y;->k:I

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 28
    .line 29
    .line 30
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    iget-object p1, p0, Lm1/y;->d:Lm1/s;

    .line 32
    .line 33
    iget v0, p0, Lm1/y;->c:I

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Lm1/s;->j(I)Lm1/y;

    .line 36
    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    return p1

    .line 40
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    throw p1
.end method

.method public final e()Lm1/v;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lm1/y;->f:Z

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {p0}, Lm1/y;->f()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string v1, "reply before requesting the sink"

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    iget-object v0, p0, Lm1/y;->h:Lm1/v;

    .line 25
    .line 26
    return-object v0

    .line 27
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw v0
.end method

.method public final f()Z
    .locals 4

    .line 1
    iget v0, p0, Lm1/y;->c:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget-object v3, p0, Lm1/y;->d:Lm1/s;

    .line 12
    .line 13
    iget-boolean v3, v3, Lm1/s;->a:Z

    .line 14
    .line 15
    if-ne v3, v0, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    const/4 v1, 0x0

    .line 19
    :goto_1
    return v1
.end method

.method public final declared-synchronized g()Z
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lm1/y;->k:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return v1

    .line 9
    :cond_0
    :try_start_1
    iget-object v0, p0, Lm1/y;->g:Lm1/w;

    .line 10
    .line 11
    iget-boolean v2, v0, Lm1/w;->e:Z

    .line 12
    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    iget-boolean v0, v0, Lm1/w;->d:Z

    .line 16
    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    :goto_0
    iget-object v0, p0, Lm1/y;->h:Lm1/v;

    .line 23
    .line 24
    iget-boolean v2, v0, Lm1/v;->c:Z

    .line 25
    .line 26
    if-nez v2, :cond_2

    .line 27
    .line 28
    iget-boolean v0, v0, Lm1/v;->b:Z

    .line 29
    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    :cond_2
    iget-boolean v0, p0, Lm1/y;->f:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    monitor-exit p0

    .line 37
    return v1

    .line 38
    :cond_3
    monitor-exit p0

    .line 39
    const/4 v0, 0x1

    .line 40
    return v0

    .line 41
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 42
    throw v0
.end method

.method public final h()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lm1/y;->g:Lm1/w;

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    iput-boolean v1, v0, Lm1/w;->e:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Lm1/y;->g()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 12
    .line 13
    .line 14
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lm1/y;->d:Lm1/s;

    .line 18
    .line 19
    iget v1, p0, Lm1/y;->c:I

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lm1/s;->j(I)Lm1/y;

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    throw v0
.end method

.method public final i(Ljava/util/ArrayList;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x1

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lm1/y;->f:Z

    .line 4
    .line 5
    iget-object v1, p0, Lm1/y;->e:Ljava/util/ArrayList;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lm1/y;->e:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p0}, Lm1/y;->g()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, Lm1/y;->e:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 29
    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 36
    .line 37
    .line 38
    iput-object v1, p0, Lm1/y;->e:Ljava/util/ArrayList;

    .line 39
    .line 40
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    iget-object p1, p0, Lm1/y;->d:Lm1/s;

    .line 44
    .line 45
    iget v0, p0, Lm1/y;->c:I

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Lm1/s;->j(I)Lm1/y;

    .line 48
    .line 49
    .line 50
    :cond_1
    return-void

    .line 51
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    throw p1
.end method

.method public final declared-synchronized j(I)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lm1/y;->k:I

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iput p1, p0, Lm1/y;->k:I

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    :goto_0
    monitor-exit p0

    .line 15
    return-void

    .line 16
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    throw p1
.end method
