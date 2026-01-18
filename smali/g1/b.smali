.class public final Lg1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lg1/b;

.field public static final b:Lg1/b;

.field public static final c:Lg1/b;

.field public static final d:Lg1/b;

.field public static e:Lg1/b;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lg1/b;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lg1/b;->a:Lg1/b;

    .line 7
    .line 8
    new-instance v0, Lg1/b;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lg1/b;->b:Lg1/b;

    .line 14
    .line 15
    new-instance v0, Lg1/b;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lg1/b;->c:Lg1/b;

    .line 21
    .line 22
    new-instance v0, Lg1/b;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lg1/b;->d:Lg1/b;

    .line 28
    .line 29
    return-void
.end method

.method public static a(Lg1/n;Lg1/a;Lj1/f;)Ljava/net/Socket;
    .locals 2

    .line 1
    iget-object p0, p0, Lg1/n;->d:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lj1/b;

    .line 19
    .line 20
    invoke-virtual {v0, p1, v1}, Lj1/b;->g(Lg1/a;Lg1/F;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iget-object v1, v0, Lj1/b;->h:Lm1/s;

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-virtual {p2}, Lj1/f;->a()Lj1/b;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-eq v0, v1, :cond_0

    .line 35
    .line 36
    iget-object p0, p2, Lj1/f;->l:Lk1/b;

    .line 37
    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    iget-object p0, p2, Lj1/f;->i:Lj1/b;

    .line 41
    .line 42
    iget-object p0, p0, Lj1/b;->n:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    const/4 p1, 0x1

    .line 49
    if-ne p0, p1, :cond_1

    .line 50
    .line 51
    iget-object p0, p2, Lj1/f;->i:Lj1/b;

    .line 52
    .line 53
    iget-object p0, p0, Lj1/b;->n:Ljava/util/ArrayList;

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, Ljava/lang/ref/Reference;

    .line 61
    .line 62
    invoke-virtual {p2, p1, v1, v1}, Lj1/f;->b(ZZZ)Ljava/net/Socket;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iput-object v0, p2, Lj1/f;->i:Lj1/b;

    .line 67
    .line 68
    iget-object p1, v0, Lj1/b;->n:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 75
    .line 76
    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 77
    .line 78
    .line 79
    throw p0

    .line 80
    :cond_2
    :goto_0
    return-object v1
.end method

.method public static b(Lg1/n;Lg1/a;Lj1/f;Lg1/F;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lg1/n;->d:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lj1/b;

    .line 18
    .line 19
    invoke-virtual {v0, p1, p3}, Lj1/b;->g(Lg1/a;Lg1/F;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object p0, p2, Lj1/f;->i:Lj1/b;

    .line 26
    .line 27
    if-nez p0, :cond_1

    .line 28
    .line 29
    iput-object v0, p2, Lj1/f;->i:Lj1/b;

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    iput-boolean p0, p2, Lj1/f;->j:Z

    .line 33
    .line 34
    iget-object p0, v0, Lj1/b;->n:Ljava/util/ArrayList;

    .line 35
    .line 36
    new-instance p1, Lj1/e;

    .line 37
    .line 38
    iget-object p3, p2, Lj1/f;->f:Ljava/lang/Object;

    .line 39
    .line 40
    invoke-direct {p1, p2, p3}, Lj1/e;-><init>(Lj1/f;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 50
    .line 51
    .line 52
    throw p0

    .line 53
    :cond_2
    :goto_0
    return-void
.end method
