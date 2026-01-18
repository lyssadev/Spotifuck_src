.class public final Lm1/l;
.super Lh1/a;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lr1/e;

.field public final synthetic d:I

.field public final synthetic e:Lm1/s;


# direct methods
.method public varargs constructor <init>(Lm1/s;[Ljava/lang/Object;ILr1/e;IZ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm1/l;->e:Lm1/s;

    .line 2
    .line 3
    iput p3, p0, Lm1/l;->b:I

    .line 4
    .line 5
    iput-object p4, p0, Lm1/l;->c:Lr1/e;

    .line 6
    .line 7
    iput p5, p0, Lm1/l;->d:I

    .line 8
    .line 9
    const-string p1, "OkHttp %s Push Data[%s]"

    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Lh1/a;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lm1/l;->e:Lm1/s;

    .line 2
    .line 3
    iget-object v0, v0, Lm1/s;->j:Lm1/C;

    .line 4
    .line 5
    iget-object v1, p0, Lm1/l;->c:Lr1/e;

    .line 6
    .line 7
    iget v2, p0, Lm1/l;->d:I

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    int-to-long v2, v2

    .line 13
    invoke-virtual {v1, v2, v3}, Lr1/e;->s(J)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lm1/l;->e:Lm1/s;

    .line 17
    .line 18
    iget-object v0, v0, Lm1/s;->r:Lm1/z;

    .line 19
    .line 20
    iget v1, p0, Lm1/l;->b:I

    .line 21
    .line 22
    const/4 v2, 0x6

    .line 23
    invoke-virtual {v0, v1, v2}, Lm1/z;->l(II)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lm1/l;->e:Lm1/s;

    .line 27
    .line 28
    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    :try_start_1
    iget-object v1, p0, Lm1/l;->e:Lm1/s;

    .line 30
    .line 31
    iget-object v1, v1, Lm1/s;->t:Ljava/util/LinkedHashSet;

    .line 32
    .line 33
    iget v2, p0, Lm1/l;->b:I

    .line 34
    .line 35
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    monitor-exit v0

    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v1

    .line 45
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 47
    :catch_0
    :goto_0
    return-void
.end method
