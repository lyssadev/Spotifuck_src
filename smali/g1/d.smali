.class public final Lg1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Li1/d;

.field public final b:Lr1/u;

.field public final c:Lg1/c;

.field public d:Z

.field public final synthetic e:Lg1/h;


# direct methods
.method public constructor <init>(Lg1/h;Li1/d;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg1/d;->e:Lg1/h;

    .line 5
    .line 6
    iput-object p2, p0, Lg1/d;->a:Li1/d;

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    invoke-virtual {p2, p1}, Li1/d;->d(I)Lr1/u;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lg1/d;->b:Lr1/u;

    .line 14
    .line 15
    new-instance v0, Lg1/c;

    .line 16
    .line 17
    invoke-direct {v0, p0, p1, p2}, Lg1/c;-><init>(Lg1/d;Lr1/u;Li1/d;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lg1/d;->c:Lg1/c;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg1/d;->e:Lg1/h;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lg1/d;->d:Z

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
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x1

    .line 13
    iput-boolean v1, p0, Lg1/d;->d:Z

    .line 14
    .line 15
    iget-object v1, p0, Lg1/d;->e:Lg1/h;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    iget-object v0, p0, Lg1/d;->b:Lr1/u;

    .line 22
    .line 23
    invoke-static {v0}, Lh1/c;->c(Ljava/io/Closeable;)V

    .line 24
    .line 25
    .line 26
    :try_start_1
    iget-object v0, p0, Lg1/d;->a:Li1/d;

    .line 27
    .line 28
    invoke-virtual {v0}, Li1/d;->a()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 29
    .line 30
    .line 31
    :catch_0
    return-void

    .line 32
    :goto_0
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 33
    throw v1
.end method
