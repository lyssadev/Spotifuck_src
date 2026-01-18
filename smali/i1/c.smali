.class public final Li1/c;
.super Lr1/i;
.source "SourceFile"


# instance fields
.field public b:Z

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lr1/a;I)V
    .locals 0

    .line 1
    iput p3, p0, Li1/c;->c:I

    iput-object p1, p0, Li1/c;->d:Ljava/lang/Object;

    invoke-direct {p0, p2}, Lr1/i;-><init>(Lr1/u;)V

    return-void
.end method


# virtual methods
.method public final b(Lr1/e;J)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Li1/c;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1, p2, p3}, Lr1/e;->s(J)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Lr1/i;->b(Lr1/e;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catch_0
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Li1/c;->b:Z

    .line 15
    .line 16
    invoke-virtual {p0}, Li1/c;->f()V

    .line 17
    .line 18
    .line 19
    :goto_0
    return-void
.end method

.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Li1/c;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    :try_start_0
    invoke-super {p0}, Lr1/i;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catch_0
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Li1/c;->b:Z

    .line 12
    .line 13
    invoke-virtual {p0}, Li1/c;->f()V

    .line 14
    .line 15
    .line 16
    :goto_0
    return-void
.end method

.method public final f()V
    .locals 2

    .line 1
    iget v0, p0, Li1/c;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li1/c;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Li1/d;

    .line 9
    .line 10
    iget-object v0, v0, Li1/d;->d:Li1/g;

    .line 11
    .line 12
    monitor-enter v0

    .line 13
    :try_start_0
    iget-object v1, p0, Li1/c;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Li1/d;

    .line 16
    .line 17
    invoke-virtual {v1}, Li1/d;->c()V

    .line 18
    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception v1

    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw v1

    .line 25
    :pswitch_0
    iget-object v0, p0, Li1/c;->d:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Li1/g;

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    iput-boolean v1, v0, Li1/g;->m:Z

    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final flush()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Li1/c;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    :try_start_0
    invoke-super {p0}, Lr1/i;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catch_0
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Li1/c;->b:Z

    .line 12
    .line 13
    invoke-virtual {p0}, Li1/c;->f()V

    .line 14
    .line 15
    .line 16
    :goto_0
    return-void
.end method
