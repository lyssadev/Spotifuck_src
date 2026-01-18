.class public final Lg1/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public final a:Lg1/x;

.field public final b:Lk1/f;

.field public c:Lg1/b;

.field public final d:Lg1/A;

.field public e:Z


# direct methods
.method public constructor <init>(Lg1/x;Lg1/A;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg1/z;->a:Lg1/x;

    .line 5
    .line 6
    iput-object p2, p0, Lg1/z;->d:Lg1/A;

    .line 7
    .line 8
    new-instance p2, Lk1/f;

    .line 9
    .line 10
    invoke-direct {p2, p1}, Lk1/f;-><init>(Lg1/x;)V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Lg1/z;->b:Lk1/f;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a()Lg1/C;
    .locals 14

    .line 1
    new-instance v1, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg1/z;->a:Lg1/x;

    .line 7
    .line 8
    iget-object v2, v0, Lg1/x;->b:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lg1/z;->b:Lk1/f;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    new-instance v2, Li1/b;

    .line 19
    .line 20
    iget-object v3, v0, Lg1/x;->f:Lg1/b;

    .line 21
    .line 22
    const/4 v4, 0x2

    .line 23
    invoke-direct {v2, v4, v3}, Li1/b;-><init>(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    new-instance v2, Li1/b;

    .line 30
    .line 31
    iget-object v3, v0, Lg1/x;->g:Lg1/h;

    .line 32
    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    iget-object v3, v3, Lg1/h;->a:LA/b;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v3, 0x0

    .line 39
    :goto_0
    const/4 v4, 0x0

    .line 40
    invoke-direct {v2, v4, v3}, Li1/b;-><init>(ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    new-instance v2, Li1/b;

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    invoke-direct {v2, v3, v0}, Li1/b;-><init>(ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    iget-object v2, v0, Lg1/x;->c:Ljava/util/List;

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 58
    .line 59
    .line 60
    new-instance v2, Lk1/a;

    .line 61
    .line 62
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    new-instance v12, Lk1/e;

    .line 69
    .line 70
    iget-object v8, p0, Lg1/z;->c:Lg1/b;

    .line 71
    .line 72
    iget-object v13, p0, Lg1/z;->d:Lg1/A;

    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    const/4 v3, 0x0

    .line 76
    const/4 v4, 0x0

    .line 77
    const/4 v5, 0x0

    .line 78
    iget v9, v0, Lg1/x;->t:I

    .line 79
    .line 80
    iget v10, v0, Lg1/x;->u:I

    .line 81
    .line 82
    iget v11, v0, Lg1/x;->v:I

    .line 83
    .line 84
    move-object v0, v12

    .line 85
    move-object v6, v13

    .line 86
    move-object v7, p0

    .line 87
    invoke-direct/range {v0 .. v11}, Lk1/e;-><init>(Ljava/util/ArrayList;Lj1/f;Lk1/b;Lj1/b;ILg1/A;Lg1/z;Lg1/b;III)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v12, v13}, Lk1/e;->a(Lg1/A;)Lg1/C;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    return-object v0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lg1/z;->d:Lg1/A;

    .line 2
    .line 3
    new-instance v1, Lg1/z;

    .line 4
    .line 5
    iget-object v2, p0, Lg1/z;->a:Lg1/x;

    .line 6
    .line 7
    invoke-direct {v1, v2, v0}, Lg1/z;-><init>(Lg1/x;Lg1/A;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, v2, Lg1/x;->d:Lg1/b;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    sget-object v0, Lg1/b;->d:Lg1/b;

    .line 16
    .line 17
    iput-object v0, v1, Lg1/z;->c:Lg1/b;

    .line 18
    .line 19
    return-object v1
.end method
