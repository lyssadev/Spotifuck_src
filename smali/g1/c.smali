.class public final Lg1/c;
.super Lr1/i;
.source "SourceFile"


# instance fields
.field public final synthetic b:Li1/d;

.field public final synthetic c:Lg1/d;


# direct methods
.method public constructor <init>(Lg1/d;Lr1/u;Li1/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg1/c;->c:Lg1/d;

    .line 2
    .line 3
    iput-object p3, p0, Lg1/c;->b:Li1/d;

    .line 4
    .line 5
    invoke-direct {p0, p2}, Lr1/i;-><init>(Lr1/u;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 1
    iget-object v0, p0, Lg1/c;->c:Lg1/d;

    .line 2
    .line 3
    iget-object v0, v0, Lg1/d;->e:Lg1/h;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lg1/c;->c:Lg1/d;

    .line 7
    .line 8
    iget-boolean v2, v1, Lg1/d;->d:Z

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v2, 0x1

    .line 17
    iput-boolean v2, v1, Lg1/d;->d:Z

    .line 18
    .line 19
    iget-object v1, v1, Lg1/d;->e:Lg1/h;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    invoke-super {p0}, Lr1/i;->close()V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lg1/c;->b:Li1/d;

    .line 29
    .line 30
    invoke-virtual {v0}, Li1/d;->b()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    throw v1
.end method
