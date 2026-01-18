.class public final Li1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr1/v;


# instance fields
.field public a:Z

.field public final synthetic b:Lr1/g;

.field public final synthetic c:Lg1/d;

.field public final synthetic d:Lr1/p;


# direct methods
.method public constructor <init>(Lr1/g;Lg1/d;Lr1/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li1/a;->b:Lr1/g;

    .line 5
    .line 6
    iput-object p2, p0, Li1/a;->c:Lg1/d;

    .line 7
    .line 8
    iput-object p3, p0, Li1/a;->d:Lr1/p;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Lr1/x;
    .locals 1

    .line 1
    iget-object v0, p0, Li1/a;->b:Lr1/g;

    .line 2
    .line 3
    invoke-interface {v0}, Lr1/v;->a()Lr1/x;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final close()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Li1/a;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 6
    .line 7
    const/16 v1, 0x64

    .line 8
    .line 9
    :try_start_0
    invoke-static {p0, v1, v0}, Lh1/c;->p(Lr1/v;ILjava/util/concurrent/TimeUnit;)Z

    .line 10
    .line 11
    .line 12
    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    goto :goto_0

    .line 14
    :catch_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Li1/a;->a:Z

    .line 19
    .line 20
    iget-object v0, p0, Li1/a;->c:Lg1/d;

    .line 21
    .line 22
    invoke-virtual {v0}, Lg1/d;->a()V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Li1/a;->b:Lr1/g;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final e(Lr1/e;J)J
    .locals 8

    .line 1
    const/4 p2, 0x1

    .line 2
    :try_start_0
    iget-object p3, p0, Li1/a;->b:Lr1/g;

    .line 3
    .line 4
    const-wide/16 v0, 0x2000

    .line 5
    .line 6
    invoke-interface {p3, p1, v0, v1}, Lr1/v;->e(Lr1/e;J)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    iget-object p3, p0, Li1/a;->d:Lr1/p;

    .line 11
    .line 12
    const-wide/16 v2, -0x1

    .line 13
    .line 14
    cmp-long v4, v0, v2

    .line 15
    .line 16
    if-nez v4, :cond_1

    .line 17
    .line 18
    iget-boolean p1, p0, Li1/a;->a:Z

    .line 19
    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    iput-boolean p2, p0, Li1/a;->a:Z

    .line 23
    .line 24
    invoke-virtual {p3}, Lr1/p;->close()V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-wide v2

    .line 28
    :cond_1
    iget-object v3, p3, Lr1/p;->a:Lr1/e;

    .line 29
    .line 30
    iget-wide v4, p1, Lr1/e;->b:J

    .line 31
    .line 32
    sub-long/2addr v4, v0

    .line 33
    move-object v2, p1

    .line 34
    move-wide v6, v0

    .line 35
    invoke-virtual/range {v2 .. v7}, Lr1/e;->f(Lr1/e;JJ)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p3}, Lr1/p;->f()Lr1/f;

    .line 39
    .line 40
    .line 41
    return-wide v0

    .line 42
    :catch_0
    move-exception p1

    .line 43
    iget-boolean p3, p0, Li1/a;->a:Z

    .line 44
    .line 45
    if-nez p3, :cond_2

    .line 46
    .line 47
    iput-boolean p2, p0, Li1/a;->a:Z

    .line 48
    .line 49
    iget-object p2, p0, Li1/a;->c:Lg1/d;

    .line 50
    .line 51
    invoke-virtual {p2}, Lg1/d;->a()V

    .line 52
    .line 53
    .line 54
    :cond_2
    throw p1
.end method
