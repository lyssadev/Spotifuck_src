.class public final Lr1/k;
.super Lr1/x;
.source "SourceFile"


# instance fields
.field public e:Lr1/x;


# direct methods
.method public constructor <init>(Lr1/x;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lr1/k;->e:Lr1/x;

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 10
    .line 11
    const-string v0, "delegate == null"

    .line 12
    .line 13
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw p1
.end method


# virtual methods
.method public final a()Lr1/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lr1/k;->e:Lr1/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr1/x;->a()Lr1/x;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final b()Lr1/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lr1/k;->e:Lr1/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr1/x;->b()Lr1/x;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-object v0, p0, Lr1/k;->e:Lr1/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr1/x;->c()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final d(J)Lr1/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lr1/k;->e:Lr1/x;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lr1/x;->d(J)Lr1/x;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lr1/k;->e:Lr1/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr1/x;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final f()V
    .locals 1

    .line 1
    iget-object v0, p0, Lr1/k;->e:Lr1/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr1/x;->f()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final g(JLjava/util/concurrent/TimeUnit;)Lr1/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lr1/k;->e:Lr1/x;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lr1/x;->g(JLjava/util/concurrent/TimeUnit;)Lr1/x;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
