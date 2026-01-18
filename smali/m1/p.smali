.class public final Lm1/p;
.super Lh1/a;
.source "SourceFile"


# instance fields
.field public final b:Z

.field public final c:I

.field public final d:I

.field public final synthetic e:Lm1/s;


# direct methods
.method public constructor <init>(Lm1/s;ZII)V
    .locals 4

    .line 1
    iput-object p1, p0, Lm1/p;->e:Lm1/s;

    .line 2
    .line 3
    iget-object p1, p1, Lm1/s;->d:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x3

    .line 14
    new-array v2, v2, [Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    aput-object p1, v2, v3

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    aput-object v0, v2, p1

    .line 21
    .line 22
    const/4 p1, 0x2

    .line 23
    aput-object v1, v2, p1

    .line 24
    .line 25
    const-string p1, "OkHttp %s ping %08x%08x"

    .line 26
    .line 27
    invoke-direct {p0, p1, v2}, Lh1/a;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iput-boolean p2, p0, Lm1/p;->b:Z

    .line 31
    .line 32
    iput p3, p0, Lm1/p;->c:I

    .line 33
    .line 34
    iput p4, p0, Lm1/p;->d:I

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    iget-object v0, p0, Lm1/p;->e:Lm1/s;

    .line 2
    .line 3
    iget-boolean v1, p0, Lm1/p;->b:Z

    .line 4
    .line 5
    iget v2, p0, Lm1/p;->c:I

    .line 6
    .line 7
    iget v3, p0, Lm1/p;->d:I

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    iget-boolean v4, v0, Lm1/s;->k:Z

    .line 13
    .line 14
    const/4 v5, 0x1

    .line 15
    iput-boolean v5, v0, Lm1/s;->k:Z

    .line 16
    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    if-eqz v4, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Lm1/s;->g()V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v1

    .line 25
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw v1

    .line 27
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    :cond_1
    :try_start_2
    iget-object v4, v0, Lm1/s;->r:Lm1/z;

    .line 31
    .line 32
    invoke-virtual {v4, v2, v3, v1}, Lm1/z;->k(IIZ)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catch_0
    invoke-virtual {v0}, Lm1/s;->g()V

    .line 37
    .line 38
    .line 39
    :goto_0
    return-void
.end method
