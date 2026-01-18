.class public final Li1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Li1/e;

.field public final b:[Z

.field public c:Z

.field public final synthetic d:Li1/g;


# direct methods
.method public constructor <init>(Li1/g;Li1/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li1/d;->d:Li1/g;

    .line 5
    .line 6
    iput-object p2, p0, Li1/d;->a:Li1/e;

    .line 7
    .line 8
    iget-boolean p2, p2, Li1/e;->e:Z

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget p1, p1, Li1/g;->h:I

    .line 15
    .line 16
    new-array p1, p1, [Z

    .line 17
    .line 18
    :goto_0
    iput-object p1, p0, Li1/d;->b:[Z

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Li1/d;->d:Li1/g;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Li1/d;->c:Z

    .line 5
    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    iget-object v1, p0, Li1/d;->a:Li1/e;

    .line 9
    .line 10
    iget-object v1, v1, Li1/e;->f:Li1/d;

    .line 11
    .line 12
    if-ne v1, p0, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Li1/d;->d:Li1/g;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {v1, p0, v2}, Li1/g;->g(Li1/d;Z)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    const/4 v1, 0x1

    .line 24
    iput-boolean v1, p0, Li1/d;->c:Z

    .line 25
    .line 26
    monitor-exit v0

    .line 27
    return-void

    .line 28
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 31
    .line 32
    .line 33
    throw v1

    .line 34
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    throw v1
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Li1/d;->d:Li1/g;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Li1/d;->c:Z

    .line 5
    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    iget-object v1, p0, Li1/d;->a:Li1/e;

    .line 9
    .line 10
    iget-object v1, v1, Li1/e;->f:Li1/d;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-ne v1, p0, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Li1/d;->d:Li1/g;

    .line 16
    .line 17
    invoke-virtual {v1, p0, v2}, Li1/g;->g(Li1/d;Z)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    iput-boolean v2, p0, Li1/d;->c:Z

    .line 24
    .line 25
    monitor-exit v0

    .line 26
    return-void

    .line 27
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 30
    .line 31
    .line 32
    throw v1

    .line 33
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    throw v1
.end method

.method public final c()V
    .locals 4

    .line 1
    iget-object v0, p0, Li1/d;->a:Li1/e;

    .line 2
    .line 3
    iget-object v1, v0, Li1/e;->f:Li1/d;

    .line 4
    .line 5
    if-ne v1, p0, :cond_1

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    iget-object v2, p0, Li1/d;->d:Li1/g;

    .line 9
    .line 10
    iget v3, v2, Li1/g;->h:I

    .line 11
    .line 12
    if-ge v1, v3, :cond_0

    .line 13
    .line 14
    :try_start_0
    iget-object v2, v2, Li1/g;->a:Ln1/a;

    .line 15
    .line 16
    iget-object v3, v0, Li1/e;->d:[Ljava/io/File;

    .line 17
    .line 18
    aget-object v3, v3, v1

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Ln1/a;->a(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    :catch_0
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    iput-object v1, v0, Li1/e;->f:Li1/d;

    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public final d(I)Lr1/u;
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Li1/d;->d:Li1/g;

    .line 3
    .line 4
    monitor-enter v1

    .line 5
    :try_start_0
    iget-boolean v2, p0, Li1/d;->c:Z

    .line 6
    .line 7
    if-nez v2, :cond_3

    .line 8
    .line 9
    iget-object v2, p0, Li1/d;->a:Li1/e;

    .line 10
    .line 11
    iget-object v3, v2, Li1/e;->f:Li1/d;

    .line 12
    .line 13
    if-eq v3, p0, :cond_0

    .line 14
    .line 15
    sget-object p1, Lr1/o;->a:Ljava/util/logging/Logger;

    .line 16
    .line 17
    new-instance p1, Lr1/n;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    monitor-exit v1

    .line 23
    return-object p1

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget-boolean v3, v2, Li1/e;->e:Z

    .line 27
    .line 28
    if-nez v3, :cond_1

    .line 29
    .line 30
    iget-object v3, p0, Li1/d;->b:[Z

    .line 31
    .line 32
    aput-boolean v0, v3, p1

    .line 33
    .line 34
    :cond_1
    iget-object v2, v2, Li1/e;->d:[Ljava/io/File;

    .line 35
    .line 36
    aget-object p1, v2, p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    :try_start_1
    iget-object v2, p0, Li1/d;->d:Li1/g;

    .line 39
    .line 40
    iget-object v2, v2, Li1/g;->a:Ln1/a;

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    .line 44
    .line 45
    :try_start_2
    sget-object v2, Lr1/o;->a:Ljava/util/logging/Logger;

    .line 46
    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    new-instance v2, Ljava/io/FileOutputStream;

    .line 50
    .line 51
    invoke-direct {v2, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 52
    .line 53
    .line 54
    new-instance v3, Lr1/x;

    .line 55
    .line 56
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 57
    .line 58
    .line 59
    new-instance v4, Lr1/a;

    .line 60
    .line 61
    invoke-direct {v4, v3, v2}, Lr1/a;-><init>(Lr1/x;Ljava/io/OutputStream;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 66
    .line 67
    const-string v3, "file == null"

    .line 68
    .line 69
    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v2
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 73
    :catch_0
    :try_start_3
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 78
    .line 79
    .line 80
    sget-object v2, Lr1/o;->a:Ljava/util/logging/Logger;

    .line 81
    .line 82
    new-instance v2, Ljava/io/FileOutputStream;

    .line 83
    .line 84
    invoke-direct {v2, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 85
    .line 86
    .line 87
    new-instance p1, Lr1/x;

    .line 88
    .line 89
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 90
    .line 91
    .line 92
    new-instance v4, Lr1/a;

    .line 93
    .line 94
    invoke-direct {v4, p1, v2}, Lr1/a;-><init>(Lr1/x;Ljava/io/OutputStream;)V
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 95
    .line 96
    .line 97
    :goto_0
    :try_start_4
    new-instance p1, Li1/c;

    .line 98
    .line 99
    invoke-direct {p1, p0, v4, v0}, Li1/c;-><init>(Ljava/lang/Object;Lr1/a;I)V

    .line 100
    .line 101
    .line 102
    monitor-exit v1

    .line 103
    return-object p1

    .line 104
    :catch_1
    sget-object p1, Lr1/o;->a:Ljava/util/logging/Logger;

    .line 105
    .line 106
    new-instance p1, Lr1/n;

    .line 107
    .line 108
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 109
    .line 110
    .line 111
    monitor-exit v1

    .line 112
    return-object p1

    .line 113
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 114
    .line 115
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 116
    .line 117
    .line 118
    throw p1

    .line 119
    :goto_1
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 120
    throw p1
.end method
