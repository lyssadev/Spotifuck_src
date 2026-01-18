.class public final Lk1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg1/v;


# virtual methods
.method public final a(Lk1/e;)Lg1/C;
    .locals 8

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p1, Lk1/e;->h:Lg1/b;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v2, p1, Lk1/e;->c:Lk1/b;

    .line 11
    .line 12
    iget-object v3, p1, Lk1/e;->f:Lg1/A;

    .line 13
    .line 14
    invoke-interface {v2, v3}, Lk1/b;->b(Lg1/A;)V

    .line 15
    .line 16
    .line 17
    iget-object v4, v3, Lg1/A;->b:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v4}, LT0/g;->H(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    iget-object p1, p1, Lk1/e;->b:Lj1/f;

    .line 24
    .line 25
    invoke-interface {v2}, Lk1/b;->c()V

    .line 26
    .line 27
    .line 28
    invoke-interface {v2, v4}, Lk1/b;->f(Z)Lg1/B;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    iput-object v3, v5, Lg1/B;->a:Lg1/A;

    .line 33
    .line 34
    invoke-virtual {p1}, Lj1/f;->a()Lj1/b;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    iget-object v6, v6, Lj1/b;->f:Lg1/r;

    .line 39
    .line 40
    iput-object v6, v5, Lg1/B;->e:Lg1/r;

    .line 41
    .line 42
    iput-wide v0, v5, Lg1/B;->k:J

    .line 43
    .line 44
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 45
    .line 46
    .line 47
    move-result-wide v6

    .line 48
    iput-wide v6, v5, Lg1/B;->l:J

    .line 49
    .line 50
    invoke-virtual {v5}, Lg1/B;->a()Lg1/C;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    const/16 v6, 0x64

    .line 55
    .line 56
    iget v7, v5, Lg1/C;->c:I

    .line 57
    .line 58
    if-ne v7, v6, :cond_0

    .line 59
    .line 60
    invoke-interface {v2, v4}, Lk1/b;->f(Z)Lg1/B;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    iput-object v3, v4, Lg1/B;->a:Lg1/A;

    .line 65
    .line 66
    invoke-virtual {p1}, Lj1/f;->a()Lj1/b;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    iget-object v3, v3, Lj1/b;->f:Lg1/r;

    .line 71
    .line 72
    iput-object v3, v4, Lg1/B;->e:Lg1/r;

    .line 73
    .line 74
    iput-wide v0, v4, Lg1/B;->k:J

    .line 75
    .line 76
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 77
    .line 78
    .line 79
    move-result-wide v0

    .line 80
    iput-wide v0, v4, Lg1/B;->l:J

    .line 81
    .line 82
    invoke-virtual {v4}, Lg1/B;->a()Lg1/C;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    iget v7, v5, Lg1/C;->c:I

    .line 87
    .line 88
    :cond_0
    invoke-virtual {v5}, Lg1/C;->h()Lg1/B;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-interface {v2, v5}, Lk1/b;->e(Lg1/C;)Lg1/D;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    iput-object v1, v0, Lg1/B;->g:Lg1/E;

    .line 97
    .line 98
    invoke-virtual {v0}, Lg1/B;->a()Lg1/C;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    iget-object v1, v0, Lg1/C;->a:Lg1/A;

    .line 103
    .line 104
    iget-object v1, v1, Lg1/A;->c:Lg1/s;

    .line 105
    .line 106
    const-string v2, "Connection"

    .line 107
    .line 108
    invoke-virtual {v1, v2}, Lg1/s;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    const-string v3, "close"

    .line 113
    .line 114
    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-nez v1, :cond_1

    .line 119
    .line 120
    invoke-virtual {v0, v2}, Lg1/C;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-eqz v1, :cond_2

    .line 129
    .line 130
    :cond_1
    invoke-virtual {p1}, Lj1/f;->e()V

    .line 131
    .line 132
    .line 133
    :cond_2
    const/16 p1, 0xcc

    .line 134
    .line 135
    if-eq v7, p1, :cond_3

    .line 136
    .line 137
    const/16 p1, 0xcd

    .line 138
    .line 139
    if-ne v7, p1, :cond_4

    .line 140
    .line 141
    :cond_3
    iget-object p1, v0, Lg1/C;->g:Lg1/E;

    .line 142
    .line 143
    invoke-virtual {p1}, Lg1/E;->f()J

    .line 144
    .line 145
    .line 146
    move-result-wide v1

    .line 147
    const-wide/16 v3, 0x0

    .line 148
    .line 149
    cmp-long v5, v1, v3

    .line 150
    .line 151
    if-gtz v5, :cond_5

    .line 152
    .line 153
    :cond_4
    return-object v0

    .line 154
    :cond_5
    new-instance v0, Ljava/net/ProtocolException;

    .line 155
    .line 156
    new-instance v1, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    const-string v2, "HTTP "

    .line 159
    .line 160
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    const-string v2, " had non-zero Content-Length: "

    .line 167
    .line 168
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1}, Lg1/E;->f()J

    .line 172
    .line 173
    .line 174
    move-result-wide v2

    .line 175
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-direct {v0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw v0
.end method
