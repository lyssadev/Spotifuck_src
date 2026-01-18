.class public final Lv/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/HashSet;

.field public b:I

.field public c:Z

.field public final d:Lv/d;

.field public final e:I

.field public f:Lv/c;

.field public g:I

.field public h:I

.field public i:Lt/f;


# direct methods
.method public constructor <init>(Lv/d;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lv/c;->a:Ljava/util/HashSet;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lv/c;->g:I

    .line 9
    .line 10
    const/high16 v0, -0x80000000

    .line 11
    .line 12
    iput v0, p0, Lv/c;->h:I

    .line 13
    .line 14
    iput-object p1, p0, Lv/c;->d:Lv/d;

    .line 15
    .line 16
    iput p2, p0, Lv/c;->e:I

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(Lv/c;I)V
    .locals 2

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, p1, p2, v0, v1}, Lv/c;->b(Lv/c;IIZ)Z

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final b(Lv/c;IIZ)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p0}, Lv/c;->j()V

    .line 5
    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    if-nez p4, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lv/c;->i(Lv/c;)Z

    .line 11
    .line 12
    .line 13
    move-result p4

    .line 14
    if-nez p4, :cond_1

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    return p1

    .line 18
    :cond_1
    iput-object p1, p0, Lv/c;->f:Lv/c;

    .line 19
    .line 20
    iget-object p4, p1, Lv/c;->a:Ljava/util/HashSet;

    .line 21
    .line 22
    if-nez p4, :cond_2

    .line 23
    .line 24
    new-instance p4, Ljava/util/HashSet;

    .line 25
    .line 26
    invoke-direct {p4}, Ljava/util/HashSet;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p4, p1, Lv/c;->a:Ljava/util/HashSet;

    .line 30
    .line 31
    :cond_2
    iget-object p1, p0, Lv/c;->f:Lv/c;

    .line 32
    .line 33
    iget-object p1, p1, Lv/c;->a:Ljava/util/HashSet;

    .line 34
    .line 35
    if-eqz p1, :cond_3

    .line 36
    .line 37
    invoke-virtual {p1, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    :cond_3
    iput p2, p0, Lv/c;->g:I

    .line 41
    .line 42
    iput p3, p0, Lv/c;->h:I

    .line 43
    .line 44
    return v0
.end method

.method public final c(ILjava/util/ArrayList;Lw/n;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv/c;->a:Ljava/util/HashSet;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lv/c;

    .line 20
    .line 21
    iget-object v1, v1, Lv/c;->d:Lv/d;

    .line 22
    .line 23
    invoke-static {v1, p1, p2, p3}, Lw/h;->b(Lv/d;ILjava/util/ArrayList;Lw/n;)Lw/n;

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public final d()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lv/c;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    iget v0, p0, Lv/c;->b:I

    .line 8
    .line 9
    return v0
.end method

.method public final e()I
    .locals 3

    .line 1
    iget-object v0, p0, Lv/c;->d:Lv/d;

    .line 2
    .line 3
    iget v0, v0, Lv/d;->g0:I

    .line 4
    .line 5
    const/16 v1, 0x8

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_0
    iget v0, p0, Lv/c;->h:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    if-eq v0, v2, :cond_1

    .line 16
    .line 17
    iget-object v2, p0, Lv/c;->f:Lv/c;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    iget-object v2, v2, Lv/c;->d:Lv/d;

    .line 22
    .line 23
    iget v2, v2, Lv/d;->g0:I

    .line 24
    .line 25
    if-ne v2, v1, :cond_1

    .line 26
    .line 27
    return v0

    .line 28
    :cond_1
    iget v0, p0, Lv/c;->g:I

    .line 29
    .line 30
    return v0
.end method

.method public final f()Lv/c;
    .locals 3

    .line 1
    iget v0, p0, Lv/c;->e:I

    .line 2
    .line 3
    invoke-static {v0}, Lt/e;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object v2, p0, Lv/c;->d:Lv/d;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljava/lang/AssertionError;

    .line 13
    .line 14
    invoke-static {v0}, LQ0/E;->i(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    throw v1

    .line 22
    :pswitch_0
    iget-object v0, v2, Lv/d;->J:Lv/c;

    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_1
    iget-object v0, v2, Lv/d;->I:Lv/c;

    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_2
    iget-object v0, v2, Lv/d;->L:Lv/c;

    .line 29
    .line 30
    return-object v0

    .line 31
    :pswitch_3
    iget-object v0, v2, Lv/d;->K:Lv/c;

    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_4
    const/4 v0, 0x0

    .line 35
    return-object v0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method public final g()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lv/c;->a:Ljava/util/HashSet;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_2

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lv/c;

    .line 22
    .line 23
    invoke-virtual {v2}, Lv/c;->f()Lv/c;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Lv/c;->h()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    return v0

    .line 35
    :cond_2
    return v1
.end method

.method public final h()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lv/c;->f:Lv/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    return v0
.end method

.method public final i(Lv/c;)Z
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x6

    .line 6
    iget v2, p0, Lv/c;->e:I

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    iget-object v4, p1, Lv/c;->d:Lv/d;

    .line 10
    .line 11
    iget p1, p1, Lv/c;->e:I

    .line 12
    .line 13
    if-ne p1, v2, :cond_3

    .line 14
    .line 15
    if-ne v2, v1, :cond_2

    .line 16
    .line 17
    iget-boolean p1, v4, Lv/d;->E:Z

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    iget-object p1, p0, Lv/c;->d:Lv/d;

    .line 22
    .line 23
    iget-boolean p1, p1, Lv/d;->E:Z

    .line 24
    .line 25
    if-nez p1, :cond_2

    .line 26
    .line 27
    :cond_1
    return v0

    .line 28
    :cond_2
    return v3

    .line 29
    :cond_3
    invoke-static {v2}, Lt/e;->a(I)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    const/4 v6, 0x4

    .line 34
    const/4 v7, 0x2

    .line 35
    const/16 v8, 0x9

    .line 36
    .line 37
    const/16 v9, 0x8

    .line 38
    .line 39
    packed-switch v5, :pswitch_data_0

    .line 40
    .line 41
    .line 42
    new-instance p1, Ljava/lang/AssertionError;

    .line 43
    .line 44
    invoke-static {v2}, LQ0/E;->i(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :pswitch_0
    if-eq p1, v1, :cond_4

    .line 53
    .line 54
    if-eq p1, v9, :cond_4

    .line 55
    .line 56
    if-eq p1, v8, :cond_4

    .line 57
    .line 58
    const/4 v0, 0x1

    .line 59
    :cond_4
    return v0

    .line 60
    :pswitch_1
    if-eq p1, v7, :cond_6

    .line 61
    .line 62
    if-ne p1, v6, :cond_5

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_5
    return v3

    .line 66
    :cond_6
    :goto_0
    return v0

    .line 67
    :pswitch_2
    const/4 v1, 0x3

    .line 68
    if-eq p1, v1, :cond_8

    .line 69
    .line 70
    const/4 v1, 0x5

    .line 71
    if-ne p1, v1, :cond_7

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_7
    const/4 v1, 0x0

    .line 75
    goto :goto_2

    .line 76
    :cond_8
    :goto_1
    const/4 v1, 0x1

    .line 77
    :goto_2
    instance-of v2, v4, Lv/h;

    .line 78
    .line 79
    if-eqz v2, :cond_b

    .line 80
    .line 81
    if-nez v1, :cond_9

    .line 82
    .line 83
    if-ne p1, v8, :cond_a

    .line 84
    .line 85
    :cond_9
    const/4 v0, 0x1

    .line 86
    :cond_a
    move v1, v0

    .line 87
    :cond_b
    return v1

    .line 88
    :pswitch_3
    if-eq p1, v7, :cond_d

    .line 89
    .line 90
    if-ne p1, v6, :cond_c

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_c
    const/4 v1, 0x0

    .line 94
    goto :goto_4

    .line 95
    :cond_d
    :goto_3
    const/4 v1, 0x1

    .line 96
    :goto_4
    instance-of v2, v4, Lv/h;

    .line 97
    .line 98
    if-eqz v2, :cond_10

    .line 99
    .line 100
    if-nez v1, :cond_e

    .line 101
    .line 102
    if-ne p1, v9, :cond_f

    .line 103
    .line 104
    :cond_e
    const/4 v0, 0x1

    .line 105
    :cond_f
    move v1, v0

    .line 106
    :cond_10
    return v1

    .line 107
    :pswitch_4
    return v0

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method public final j()V
    .locals 2

    .line 1
    iget-object v0, p0, Lv/c;->f:Lv/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, v0, Lv/c;->a:Ljava/util/HashSet;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lv/c;->f:Lv/c;

    .line 14
    .line 15
    iget-object v0, v0, Lv/c;->a:Ljava/util/HashSet;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lv/c;->f:Lv/c;

    .line 24
    .line 25
    iput-object v1, v0, Lv/c;->a:Ljava/util/HashSet;

    .line 26
    .line 27
    :cond_0
    iput-object v1, p0, Lv/c;->a:Ljava/util/HashSet;

    .line 28
    .line 29
    iput-object v1, p0, Lv/c;->f:Lv/c;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput v0, p0, Lv/c;->g:I

    .line 33
    .line 34
    const/high16 v1, -0x80000000

    .line 35
    .line 36
    iput v1, p0, Lv/c;->h:I

    .line 37
    .line 38
    iput-boolean v0, p0, Lv/c;->c:Z

    .line 39
    .line 40
    iput v0, p0, Lv/c;->b:I

    .line 41
    .line 42
    return-void
.end method

.method public final k()V
    .locals 2

    .line 1
    iget-object v0, p0, Lv/c;->i:Lt/f;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lt/f;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1}, Lt/f;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lv/c;->i:Lt/f;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {v0}, Lt/f;->c()V

    .line 15
    .line 16
    .line 17
    :goto_0
    return-void
.end method

.method public final l(I)V
    .locals 0

    .line 1
    iput p1, p0, Lv/c;->b:I

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lv/c;->c:Z

    .line 5
    .line 6
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lv/c;->d:Lv/d;

    .line 7
    .line 8
    iget-object v1, v1, Lv/d;->h0:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ":"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lv/c;->e:I

    .line 19
    .line 20
    invoke-static {v1}, LQ0/E;->i(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
.end method
