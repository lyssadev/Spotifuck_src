.class public abstract Ll1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr1/v;


# instance fields
.field public final a:Lr1/k;

.field public b:Z

.field public c:J

.field public final synthetic d:Ll1/g;


# direct methods
.method public constructor <init>(Ll1/g;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll1/a;->d:Ll1/g;

    .line 5
    .line 6
    new-instance v0, Lr1/k;

    .line 7
    .line 8
    iget-object p1, p1, Ll1/g;->c:Lr1/q;

    .line 9
    .line 10
    iget-object p1, p1, Lr1/q;->b:Lr1/v;

    .line 11
    .line 12
    invoke-interface {p1}, Lr1/v;->a()Lr1/x;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-direct {v0, p1}, Lr1/k;-><init>(Lr1/x;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Ll1/a;->a:Lr1/k;

    .line 20
    .line 21
    const-wide/16 v0, 0x0

    .line 22
    .line 23
    iput-wide v0, p0, Ll1/a;->c:J

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a()Lr1/x;
    .locals 1

    .line 1
    iget-object v0, p0, Ll1/a;->a:Lr1/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public e(Lr1/e;J)J
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Ll1/a;->d:Ll1/g;

    .line 2
    .line 3
    iget-object v0, v0, Ll1/g;->c:Lr1/q;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Lr1/q;->e(Lr1/e;J)J

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
    iget-wide v0, p0, Ll1/a;->c:J

    .line 16
    .line 17
    add-long/2addr v0, p1

    .line 18
    iput-wide v0, p0, Ll1/a;->c:J
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
    const/4 p2, 0x0

    .line 25
    invoke-virtual {p0, p2, p1}, Ll1/a;->f(ZLjava/io/IOException;)V

    .line 26
    .line 27
    .line 28
    throw p1
.end method

.method public final f(ZLjava/io/IOException;)V
    .locals 5

    .line 1
    iget-object v0, p0, Ll1/a;->d:Ll1/g;

    .line 2
    .line 3
    iget v1, v0, Ll1/g;->e:I

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    if-ne v1, v2, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 v3, 0x5

    .line 10
    if-ne v1, v3, :cond_2

    .line 11
    .line 12
    iget-object v1, p0, Ll1/a;->a:Lr1/k;

    .line 13
    .line 14
    iget-object v3, v1, Lr1/k;->e:Lr1/x;

    .line 15
    .line 16
    sget-object v4, Lr1/x;->d:Lr1/w;

    .line 17
    .line 18
    iput-object v4, v1, Lr1/k;->e:Lr1/x;

    .line 19
    .line 20
    invoke-virtual {v3}, Lr1/x;->a()Lr1/x;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Lr1/x;->b()Lr1/x;

    .line 24
    .line 25
    .line 26
    iput v2, v0, Ll1/g;->e:I

    .line 27
    .line 28
    iget-object v1, v0, Ll1/g;->b:Lj1/f;

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    xor-int/lit8 p1, p1, 0x1

    .line 33
    .line 34
    invoke-virtual {v1, p1, v0, p2}, Lj1/f;->h(ZLk1/b;Ljava/io/IOException;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void

    .line 38
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    new-instance p2, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v1, "state: "

    .line 43
    .line 44
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget v0, v0, Ll1/g;->e:I

    .line 48
    .line 49
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1
.end method
