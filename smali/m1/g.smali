.class public final Lm1/g;
.super Lr1/j;
.source "SourceFile"


# instance fields
.field public b:Z

.field public c:J

.field public final synthetic d:Lm1/h;


# direct methods
.method public constructor <init>(Lm1/h;Lm1/w;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm1/g;->d:Lm1/h;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lr1/j;-><init>(Lr1/v;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lm1/g;->b:Z

    .line 8
    .line 9
    const-wide/16 p1, 0x0

    .line 10
    .line 11
    iput-wide p1, p0, Lm1/g;->c:J

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 1
    invoke-super {p0}, Lr1/j;->close()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lm1/g;->b:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lm1/g;->b:Z

    .line 11
    .line 12
    iget-object v0, p0, Lm1/g;->d:Lm1/h;

    .line 13
    .line 14
    iget-object v1, v0, Lm1/h;->b:Lj1/f;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-virtual {v1, v2, v0, v3}, Lj1/f;->h(ZLk1/b;Ljava/io/IOException;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    return-void
.end method

.method public final e(Lr1/e;J)J
    .locals 2

    .line 1
    :try_start_0
    iget-object p2, p0, Lr1/j;->a:Lr1/v;

    .line 2
    .line 3
    const-wide/16 v0, 0x2000

    .line 4
    .line 5
    invoke-interface {p2, p1, v0, v1}, Lr1/v;->e(Lr1/e;J)J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    cmp-long p3, p1, v0

    .line 12
    .line 13
    if-lez p3, :cond_0

    .line 14
    .line 15
    iget-wide v0, p0, Lm1/g;->c:J

    .line 16
    .line 17
    add-long/2addr v0, p1

    .line 18
    iput-wide v0, p0, Lm1/g;->c:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catch_0
    move-exception p1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    return-wide p1

    .line 24
    :goto_1
    iget-boolean p2, p0, Lm1/g;->b:Z

    .line 25
    .line 26
    if-eqz p2, :cond_1

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_1
    const/4 p2, 0x1

    .line 30
    iput-boolean p2, p0, Lm1/g;->b:Z

    .line 31
    .line 32
    iget-object p2, p0, Lm1/g;->d:Lm1/h;

    .line 33
    .line 34
    iget-object p3, p2, Lm1/h;->b:Lj1/f;

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    invoke-virtual {p3, v0, p2, p1}, Lj1/f;->h(ZLk1/b;Ljava/io/IOException;)V

    .line 38
    .line 39
    .line 40
    :goto_2
    throw p1
.end method
