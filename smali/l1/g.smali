.class public final Ll1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk1/b;


# instance fields
.field public final a:Lg1/x;

.field public final b:Lj1/f;

.field public final c:Lr1/q;

.field public final d:Lr1/p;

.field public e:I

.field public f:J


# direct methods
.method public constructor <init>(Lg1/x;Lj1/f;Lr1/q;Lr1/p;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Ll1/g;->e:I

    .line 6
    .line 7
    const-wide/32 v0, 0x40000

    .line 8
    .line 9
    .line 10
    iput-wide v0, p0, Ll1/g;->f:J

    .line 11
    .line 12
    iput-object p1, p0, Ll1/g;->a:Lg1/x;

    .line 13
    .line 14
    iput-object p2, p0, Ll1/g;->b:Lj1/f;

    .line 15
    .line 16
    iput-object p3, p0, Ll1/g;->c:Lr1/q;

    .line 17
    .line 18
    iput-object p4, p0, Ll1/g;->d:Lr1/p;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(Lg1/A;J)Lr1/u;
    .locals 5

    .line 1
    iget-object p1, p1, Lg1/A;->c:Lg1/s;

    .line 2
    .line 3
    const-string v0, "Transfer-Encoding"

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lg1/s;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v0, "chunked"

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const-string v0, "state: "

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    const/4 v2, 0x1

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    iget p1, p0, Ll1/g;->e:I

    .line 22
    .line 23
    if-ne p1, v2, :cond_0

    .line 24
    .line 25
    iput v1, p0, Ll1/g;->e:I

    .line 26
    .line 27
    new-instance p1, Ll1/b;

    .line 28
    .line 29
    invoke-direct {p1, p0}, Ll1/b;-><init>(Ll1/g;)V

    .line 30
    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    new-instance p2, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget p3, p0, Ll1/g;->e:I

    .line 41
    .line 42
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_1
    const-wide/16 v3, -0x1

    .line 54
    .line 55
    cmp-long p1, p2, v3

    .line 56
    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    iget p1, p0, Ll1/g;->e:I

    .line 60
    .line 61
    if-ne p1, v2, :cond_2

    .line 62
    .line 63
    iput v1, p0, Ll1/g;->e:I

    .line 64
    .line 65
    new-instance p1, Ll1/d;

    .line 66
    .line 67
    invoke-direct {p1, p0, p2, p3}, Ll1/d;-><init>(Ll1/g;J)V

    .line 68
    .line 69
    .line 70
    return-object p1

    .line 71
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 72
    .line 73
    new-instance p2, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget p3, p0, Ll1/g;->e:I

    .line 79
    .line 80
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw p1

    .line 91
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 92
    .line 93
    const-string p2, "Cannot stream a request body without chunked encoding or a known content length!"

    .line 94
    .line 95
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw p1
.end method

.method public final b(Lg1/A;)V
    .locals 5

    .line 1
    iget-object v0, p0, Ll1/g;->b:Lj1/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lj1/f;->a()Lj1/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lj1/b;->c:Lg1/F;

    .line 8
    .line 9
    iget-object v0, v0, Lg1/F;->b:Ljava/net/Proxy;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    iget-object v2, p1, Lg1/A;->b:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v2, 0x20

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v2, p1, Lg1/A;->a:Lg1/u;

    .line 31
    .line 32
    iget-object v3, v2, Lg1/u;->a:Ljava/lang/String;

    .line 33
    .line 34
    const-string v4, "https"

    .line 35
    .line 36
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-nez v3, :cond_0

    .line 41
    .line 42
    sget-object v3, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 43
    .line 44
    if-ne v0, v3, :cond_0

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-static {v2}, LT0/g;->J(Lg1/u;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    :goto_0
    const-string v0, " HTTP/1.1"

    .line 58
    .line 59
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-object p1, p1, Lg1/A;->c:Lg1/s;

    .line 67
    .line 68
    invoke-virtual {p0, p1, v0}, Ll1/g;->h(Lg1/s;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-object v0, p0, Ll1/g;->d:Lr1/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr1/p;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d()V
    .locals 1

    .line 1
    iget-object v0, p0, Ll1/g;->d:Lr1/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr1/p;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e(Lg1/C;)Lg1/D;
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Ll1/g;->b:Lj1/f;

    .line 3
    .line 4
    iget-object v2, v1, Lj1/f;->e:Lg1/b;

    .line 5
    .line 6
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const-string v2, "Content-Type"

    .line 10
    .line 11
    invoke-virtual {p1, v2}, Lg1/C;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lk1/d;->b(Lg1/C;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    const-wide/16 v1, 0x0

    .line 21
    .line 22
    invoke-virtual {p0, v1, v2}, Ll1/g;->g(J)Ll1/e;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance v3, Lg1/D;

    .line 27
    .line 28
    sget-object v4, Lr1/o;->a:Ljava/util/logging/Logger;

    .line 29
    .line 30
    new-instance v4, Lr1/q;

    .line 31
    .line 32
    invoke-direct {v4, p1}, Lr1/q;-><init>(Lr1/v;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v1, v2, v4, v0}, Lg1/D;-><init>(JLr1/g;I)V

    .line 36
    .line 37
    .line 38
    return-object v3

    .line 39
    :cond_0
    const-string v2, "Transfer-Encoding"

    .line 40
    .line 41
    invoke-virtual {p1, v2}, Lg1/C;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const-string v3, "chunked"

    .line 46
    .line 47
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    const-string v3, "state: "

    .line 52
    .line 53
    const/4 v4, 0x5

    .line 54
    const/4 v5, 0x4

    .line 55
    const-wide/16 v6, -0x1

    .line 56
    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    iget-object p1, p1, Lg1/C;->a:Lg1/A;

    .line 60
    .line 61
    iget-object p1, p1, Lg1/A;->a:Lg1/u;

    .line 62
    .line 63
    iget v1, p0, Ll1/g;->e:I

    .line 64
    .line 65
    if-ne v1, v5, :cond_1

    .line 66
    .line 67
    iput v4, p0, Ll1/g;->e:I

    .line 68
    .line 69
    new-instance v1, Ll1/c;

    .line 70
    .line 71
    invoke-direct {v1, p0, p1}, Ll1/c;-><init>(Ll1/g;Lg1/u;)V

    .line 72
    .line 73
    .line 74
    new-instance p1, Lg1/D;

    .line 75
    .line 76
    sget-object v2, Lr1/o;->a:Ljava/util/logging/Logger;

    .line 77
    .line 78
    new-instance v2, Lr1/q;

    .line 79
    .line 80
    invoke-direct {v2, v1}, Lr1/q;-><init>(Lr1/v;)V

    .line 81
    .line 82
    .line 83
    invoke-direct {p1, v6, v7, v2, v0}, Lg1/D;-><init>(JLr1/g;I)V

    .line 84
    .line 85
    .line 86
    return-object p1

    .line 87
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 88
    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iget v1, p0, Ll1/g;->e:I

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw p1

    .line 107
    :cond_2
    invoke-static {p1}, Lk1/d;->a(Lg1/C;)J

    .line 108
    .line 109
    .line 110
    move-result-wide v8

    .line 111
    cmp-long p1, v8, v6

    .line 112
    .line 113
    if-eqz p1, :cond_3

    .line 114
    .line 115
    invoke-virtual {p0, v8, v9}, Ll1/g;->g(J)Ll1/e;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    new-instance v1, Lg1/D;

    .line 120
    .line 121
    sget-object v2, Lr1/o;->a:Ljava/util/logging/Logger;

    .line 122
    .line 123
    new-instance v2, Lr1/q;

    .line 124
    .line 125
    invoke-direct {v2, p1}, Lr1/q;-><init>(Lr1/v;)V

    .line 126
    .line 127
    .line 128
    invoke-direct {v1, v8, v9, v2, v0}, Lg1/D;-><init>(JLr1/g;I)V

    .line 129
    .line 130
    .line 131
    return-object v1

    .line 132
    :cond_3
    new-instance p1, Lg1/D;

    .line 133
    .line 134
    iget v2, p0, Ll1/g;->e:I

    .line 135
    .line 136
    if-ne v2, v5, :cond_4

    .line 137
    .line 138
    iput v4, p0, Ll1/g;->e:I

    .line 139
    .line 140
    invoke-virtual {v1}, Lj1/f;->e()V

    .line 141
    .line 142
    .line 143
    new-instance v1, Ll1/f;

    .line 144
    .line 145
    invoke-direct {v1, p0}, Ll1/a;-><init>(Ll1/g;)V

    .line 146
    .line 147
    .line 148
    sget-object v2, Lr1/o;->a:Ljava/util/logging/Logger;

    .line 149
    .line 150
    new-instance v2, Lr1/q;

    .line 151
    .line 152
    invoke-direct {v2, v1}, Lr1/q;-><init>(Lr1/v;)V

    .line 153
    .line 154
    .line 155
    invoke-direct {p1, v6, v7, v2, v0}, Lg1/D;-><init>(JLr1/g;I)V

    .line 156
    .line 157
    .line 158
    return-object p1

    .line 159
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 160
    .line 161
    new-instance v0, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    iget v1, p0, Ll1/g;->e:I

    .line 167
    .line 168
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw p1
.end method

.method public final f(Z)Lg1/B;
    .locals 10

    .line 1
    iget-object v0, p0, Ll1/g;->c:Lr1/q;

    .line 2
    .line 3
    iget v1, p0, Ll1/g;->e:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x3

    .line 7
    if-eq v1, v2, :cond_1

    .line 8
    .line 9
    if-ne v1, v3, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v1, "state: "

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget v1, p0, Ll1/g;->e:I

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :cond_1
    :goto_0
    :try_start_0
    iget-wide v1, p0, Ll1/g;->f:J

    .line 35
    .line 36
    invoke-virtual {v0, v1, v2}, Lr1/q;->n(J)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-wide v4, p0, Ll1/g;->f:J

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    int-to-long v6, v2

    .line 47
    sub-long/2addr v4, v6

    .line 48
    iput-wide v4, p0, Ll1/g;->f:J

    .line 49
    .line 50
    invoke-static {v1}, LE/d;->c(Ljava/lang/String;)LE/d;

    .line 51
    .line 52
    .line 53
    move-result-object v1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    iget v2, v1, LE/d;->b:I

    .line 55
    .line 56
    :try_start_1
    new-instance v4, Lg1/B;

    .line 57
    .line 58
    invoke-direct {v4}, Lg1/B;-><init>()V

    .line 59
    .line 60
    .line 61
    iget-object v5, v1, LE/d;->c:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v5, Lg1/y;

    .line 64
    .line 65
    iput-object v5, v4, Lg1/B;->b:Lg1/y;

    .line 66
    .line 67
    iput v2, v4, Lg1/B;->c:I

    .line 68
    .line 69
    iget-object v1, v1, LE/d;->d:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, Ljava/lang/String;

    .line 72
    .line 73
    iput-object v1, v4, Lg1/B;->d:Ljava/lang/String;

    .line 74
    .line 75
    new-instance v1, LA/b;

    .line 76
    .line 77
    const/16 v5, 0x1b

    .line 78
    .line 79
    invoke-direct {v1, v5}, LA/b;-><init>(I)V

    .line 80
    .line 81
    .line 82
    :goto_1
    iget-wide v5, p0, Ll1/g;->f:J

    .line 83
    .line 84
    invoke-virtual {v0, v5, v6}, Lr1/q;->n(J)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    iget-wide v6, p0, Ll1/g;->f:J

    .line 89
    .line 90
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    int-to-long v8, v8

    .line 95
    sub-long/2addr v6, v8

    .line 96
    iput-wide v6, p0, Ll1/g;->f:J

    .line 97
    .line 98
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    if-eqz v6, :cond_2

    .line 103
    .line 104
    sget-object v6, Lg1/b;->e:Lg1/b;

    .line 105
    .line 106
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, v5}, LA/b;->q(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_2
    iget-object v0, v1, LA/b;->g:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v0, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    new-array v1, v1, [Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    check-cast v0, [Ljava/lang/String;

    .line 128
    .line 129
    new-instance v1, LA/b;

    .line 130
    .line 131
    const/16 v5, 0x1b

    .line 132
    .line 133
    invoke-direct {v1, v5}, LA/b;-><init>(I)V

    .line 134
    .line 135
    .line 136
    iget-object v5, v1, LA/b;->g:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v5, Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-static {v5, v0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    iput-object v1, v4, Lg1/B;->f:LA/b;

    .line 144
    .line 145
    const/16 v0, 0x64

    .line 146
    .line 147
    if-eqz p1, :cond_3

    .line 148
    .line 149
    if-ne v2, v0, :cond_3

    .line 150
    .line 151
    const/4 p1, 0x0

    .line 152
    return-object p1

    .line 153
    :cond_3
    if-ne v2, v0, :cond_4

    .line 154
    .line 155
    iput v3, p0, Ll1/g;->e:I

    .line 156
    .line 157
    return-object v4

    .line 158
    :catch_0
    move-exception p1

    .line 159
    goto :goto_2

    .line 160
    :cond_4
    const/4 p1, 0x4

    .line 161
    iput p1, p0, Ll1/g;->e:I
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0

    .line 162
    .line 163
    return-object v4

    .line 164
    :goto_2
    new-instance v0, Ljava/io/IOException;

    .line 165
    .line 166
    new-instance v1, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    const-string v2, "unexpected end of stream on "

    .line 169
    .line 170
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    iget-object v2, p0, Ll1/g;->b:Lj1/f;

    .line 174
    .line 175
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 186
    .line 187
    .line 188
    throw v0
.end method

.method public final g(J)Ll1/e;
    .locals 4

    .line 1
    iget v0, p0, Ll1/g;->e:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-ne v0, v1, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x5

    .line 7
    iput v0, p0, Ll1/g;->e:I

    .line 8
    .line 9
    new-instance v0, Ll1/e;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Ll1/a;-><init>(Ll1/g;)V

    .line 12
    .line 13
    .line 14
    iput-wide p1, v0, Ll1/e;->e:J

    .line 15
    .line 16
    const-wide/16 v1, 0x0

    .line 17
    .line 18
    cmp-long v3, p1, v1

    .line 19
    .line 20
    if-nez v3, :cond_0

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    const/4 p2, 0x0

    .line 24
    invoke-virtual {v0, p1, p2}, Ll1/a;->f(ZLjava/io/IOException;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-object v0

    .line 28
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    new-instance p2, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v0, "state: "

    .line 33
    .line 34
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget v0, p0, Ll1/g;->e:I

    .line 38
    .line 39
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1
.end method

.method public final h(Lg1/s;Ljava/lang/String;)V
    .locals 4

    .line 1
    iget v0, p0, Ll1/g;->e:I

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Ll1/g;->d:Lr1/p;

    .line 6
    .line 7
    invoke-virtual {v0, p2}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 8
    .line 9
    .line 10
    const-string p2, "\r\n"

    .line 11
    .line 12
    invoke-virtual {v0, p2}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lg1/s;->d()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    :goto_0
    if-ge v2, v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1, v2}, Lg1/s;->b(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v0, v3}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 27
    .line 28
    .line 29
    const-string v3, ": "

    .line 30
    .line 31
    invoke-virtual {v0, v3}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v2}, Lg1/s;->e(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-interface {v0, v3}, Lr1/f;->c(Ljava/lang/String;)Lr1/f;

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, p2}, Lr1/f;->c(Ljava/lang/String;)Lr1/f;

    .line 42
    .line 43
    .line 44
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {v0, p2}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    iput p1, p0, Ll1/g;->e:I

    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    new-instance p2, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    const-string v0, "state: "

    .line 59
    .line 60
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iget v0, p0, Ll1/g;->e:I

    .line 64
    .line 65
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p1
.end method
