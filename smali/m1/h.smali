.class public final Lm1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk1/b;


# static fields
.field public static final e:Ljava/util/List;

.field public static final f:Ljava/util/List;


# instance fields
.field public final a:Lk1/e;

.field public final b:Lj1/f;

.field public final c:Lm1/s;

.field public d:Lm1/y;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {v0}, Lr1/h;->f(Ljava/lang/String;)Lr1/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "host"

    .line 8
    .line 9
    invoke-static {v1}, Lr1/h;->f(Ljava/lang/String;)Lr1/h;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "keep-alive"

    .line 14
    .line 15
    invoke-static {v2}, Lr1/h;->f(Ljava/lang/String;)Lr1/h;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "proxy-connection"

    .line 20
    .line 21
    invoke-static {v3}, Lr1/h;->f(Ljava/lang/String;)Lr1/h;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const-string v4, "transfer-encoding"

    .line 26
    .line 27
    invoke-static {v4}, Lr1/h;->f(Ljava/lang/String;)Lr1/h;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    const-string v5, "te"

    .line 32
    .line 33
    invoke-static {v5}, Lr1/h;->f(Ljava/lang/String;)Lr1/h;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    const-string v6, "encoding"

    .line 38
    .line 39
    invoke-static {v6}, Lr1/h;->f(Ljava/lang/String;)Lr1/h;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    const-string v7, "upgrade"

    .line 44
    .line 45
    invoke-static {v7}, Lr1/h;->f(Ljava/lang/String;)Lr1/h;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    const/16 v8, 0xc

    .line 50
    .line 51
    new-array v8, v8, [Lr1/h;

    .line 52
    .line 53
    const/4 v9, 0x0

    .line 54
    aput-object v0, v8, v9

    .line 55
    .line 56
    const/4 v10, 0x1

    .line 57
    aput-object v1, v8, v10

    .line 58
    .line 59
    const/4 v11, 0x2

    .line 60
    aput-object v2, v8, v11

    .line 61
    .line 62
    const/4 v12, 0x3

    .line 63
    aput-object v3, v8, v12

    .line 64
    .line 65
    const/4 v13, 0x4

    .line 66
    aput-object v5, v8, v13

    .line 67
    .line 68
    const/4 v14, 0x5

    .line 69
    aput-object v4, v8, v14

    .line 70
    .line 71
    const/4 v15, 0x6

    .line 72
    aput-object v6, v8, v15

    .line 73
    .line 74
    const/16 v16, 0x7

    .line 75
    .line 76
    aput-object v7, v8, v16

    .line 77
    .line 78
    sget-object v17, Lm1/b;->f:Lr1/h;

    .line 79
    .line 80
    const/16 v15, 0x8

    .line 81
    .line 82
    aput-object v17, v8, v15

    .line 83
    .line 84
    sget-object v17, Lm1/b;->g:Lr1/h;

    .line 85
    .line 86
    const/16 v18, 0x9

    .line 87
    .line 88
    aput-object v17, v8, v18

    .line 89
    .line 90
    sget-object v17, Lm1/b;->h:Lr1/h;

    .line 91
    .line 92
    const/16 v18, 0xa

    .line 93
    .line 94
    aput-object v17, v8, v18

    .line 95
    .line 96
    sget-object v17, Lm1/b;->i:Lr1/h;

    .line 97
    .line 98
    const/16 v18, 0xb

    .line 99
    .line 100
    aput-object v17, v8, v18

    .line 101
    .line 102
    invoke-static {v8}, Lh1/c;->l([Ljava/lang/Object;)Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    sput-object v8, Lm1/h;->e:Ljava/util/List;

    .line 107
    .line 108
    new-array v8, v15, [Lr1/h;

    .line 109
    .line 110
    aput-object v0, v8, v9

    .line 111
    .line 112
    aput-object v1, v8, v10

    .line 113
    .line 114
    aput-object v2, v8, v11

    .line 115
    .line 116
    aput-object v3, v8, v12

    .line 117
    .line 118
    aput-object v5, v8, v13

    .line 119
    .line 120
    aput-object v4, v8, v14

    .line 121
    .line 122
    const/4 v0, 0x6

    .line 123
    aput-object v6, v8, v0

    .line 124
    .line 125
    aput-object v7, v8, v16

    .line 126
    .line 127
    invoke-static {v8}, Lh1/c;->l([Ljava/lang/Object;)Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    sput-object v0, Lm1/h;->f:Ljava/util/List;

    .line 132
    .line 133
    return-void
.end method

.method public constructor <init>(Lk1/e;Lj1/f;Lm1/s;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm1/h;->a:Lk1/e;

    .line 5
    .line 6
    iput-object p2, p0, Lm1/h;->b:Lj1/f;

    .line 7
    .line 8
    iput-object p3, p0, Lm1/h;->c:Lm1/s;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Lg1/A;J)Lr1/u;
    .locals 0

    .line 1
    iget-object p1, p0, Lm1/h;->d:Lm1/y;

    .line 2
    .line 3
    invoke-virtual {p1}, Lm1/y;->e()Lm1/v;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final b(Lg1/A;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lm1/h;->d:Lm1/y;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iget-object v1, p1, Lg1/A;->c:Lg1/s;

    .line 11
    .line 12
    new-instance v8, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v1}, Lg1/s;->d()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    add-int/lit8 v2, v2, 0x4

    .line 19
    .line 20
    invoke-direct {v8, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    new-instance v2, Lm1/b;

    .line 24
    .line 25
    sget-object v3, Lm1/b;->f:Lr1/h;

    .line 26
    .line 27
    iget-object v4, p1, Lg1/A;->b:Ljava/lang/String;

    .line 28
    .line 29
    invoke-direct {v2, v3, v4}, Lm1/b;-><init>(Lr1/h;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    new-instance v2, Lm1/b;

    .line 36
    .line 37
    sget-object v3, Lm1/b;->g:Lr1/h;

    .line 38
    .line 39
    iget-object v4, p1, Lg1/A;->a:Lg1/u;

    .line 40
    .line 41
    invoke-static {v4}, LT0/g;->J(Lg1/u;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-direct {v2, v3, v5}, Lm1/b;-><init>(Lr1/h;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    iget-object p1, p1, Lg1/A;->c:Lg1/s;

    .line 52
    .line 53
    const-string v2, "Host"

    .line 54
    .line 55
    invoke-virtual {p1, v2}, Lg1/s;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    new-instance v2, Lm1/b;

    .line 62
    .line 63
    sget-object v3, Lm1/b;->i:Lr1/h;

    .line 64
    .line 65
    invoke-direct {v2, v3, p1}, Lm1/b;-><init>(Lr1/h;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    :cond_1
    new-instance p1, Lm1/b;

    .line 72
    .line 73
    sget-object v2, Lm1/b;->h:Lr1/h;

    .line 74
    .line 75
    iget-object v3, v4, Lg1/u;->a:Ljava/lang/String;

    .line 76
    .line 77
    invoke-direct {p1, v2, v3}, Lm1/b;-><init>(Lr1/h;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v8, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Lg1/s;->d()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    const/4 v2, 0x0

    .line 88
    :goto_0
    if-ge v2, p1, :cond_3

    .line 89
    .line 90
    invoke-virtual {v1, v2}, Lg1/s;->b(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 95
    .line 96
    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-static {v3}, Lr1/h;->f(Ljava/lang/String;)Lr1/h;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    sget-object v4, Lm1/h;->e:Ljava/util/List;

    .line 105
    .line 106
    invoke-interface {v4, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    if-nez v4, :cond_2

    .line 111
    .line 112
    new-instance v4, Lm1/b;

    .line 113
    .line 114
    invoke-virtual {v1, v2}, Lg1/s;->e(I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    invoke-direct {v4, v3, v5}, Lm1/b;-><init>(Lr1/h;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_3
    iget-object p1, p0, Lm1/h;->c:Lm1/s;

    .line 128
    .line 129
    xor-int/lit8 v0, v0, 0x1

    .line 130
    .line 131
    iget-object v1, p1, Lm1/s;->r:Lm1/z;

    .line 132
    .line 133
    monitor-enter v1

    .line 134
    :try_start_0
    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 135
    :try_start_1
    iget v2, p1, Lm1/s;->f:I

    .line 136
    .line 137
    const v3, 0x3fffffff    # 1.9999999f

    .line 138
    .line 139
    .line 140
    if-le v2, v3, :cond_4

    .line 141
    .line 142
    const/4 v2, 0x5

    .line 143
    invoke-virtual {p1, v2}, Lm1/s;->k(I)V

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :catchall_0
    move-exception v0

    .line 148
    goto :goto_2

    .line 149
    :cond_4
    :goto_1
    iget-boolean v2, p1, Lm1/s;->g:Z

    .line 150
    .line 151
    if-nez v2, :cond_6

    .line 152
    .line 153
    iget v9, p1, Lm1/s;->f:I

    .line 154
    .line 155
    add-int/lit8 v2, v9, 0x2

    .line 156
    .line 157
    iput v2, p1, Lm1/s;->f:I

    .line 158
    .line 159
    new-instance v10, Lm1/y;

    .line 160
    .line 161
    const/4 v6, 0x0

    .line 162
    move-object v2, v10

    .line 163
    move v3, v9

    .line 164
    move-object v4, p1

    .line 165
    move v5, v0

    .line 166
    move-object v7, v8

    .line 167
    invoke-direct/range {v2 .. v7}, Lm1/y;-><init>(ILm1/s;ZZLjava/util/ArrayList;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v10}, Lm1/y;->g()Z

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    if-eqz v2, :cond_5

    .line 175
    .line 176
    iget-object v2, p1, Lm1/s;->c:Ljava/util/LinkedHashMap;

    .line 177
    .line 178
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    invoke-interface {v2, v3, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    :cond_5
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 186
    :try_start_2
    iget-object v2, p1, Lm1/s;->r:Lm1/z;

    .line 187
    .line 188
    invoke-virtual {v2, v0, v9, v8}, Lm1/z;->n(ZILjava/util/ArrayList;)V

    .line 189
    .line 190
    .line 191
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 192
    iget-object p1, p1, Lm1/s;->r:Lm1/z;

    .line 193
    .line 194
    invoke-virtual {p1}, Lm1/z;->flush()V

    .line 195
    .line 196
    .line 197
    iput-object v10, p0, Lm1/h;->d:Lm1/y;

    .line 198
    .line 199
    iget-object p1, v10, Lm1/y;->i:Lm1/x;

    .line 200
    .line 201
    iget-object v0, p0, Lm1/h;->a:Lk1/e;

    .line 202
    .line 203
    iget v0, v0, Lk1/e;->j:I

    .line 204
    .line 205
    int-to-long v0, v0

    .line 206
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 207
    .line 208
    invoke-virtual {p1, v0, v1, v2}, Lr1/x;->g(JLjava/util/concurrent/TimeUnit;)Lr1/x;

    .line 209
    .line 210
    .line 211
    iget-object p1, p0, Lm1/h;->d:Lm1/y;

    .line 212
    .line 213
    iget-object p1, p1, Lm1/y;->j:Lm1/x;

    .line 214
    .line 215
    iget-object v0, p0, Lm1/h;->a:Lk1/e;

    .line 216
    .line 217
    iget v0, v0, Lk1/e;->k:I

    .line 218
    .line 219
    int-to-long v0, v0

    .line 220
    invoke-virtual {p1, v0, v1, v2}, Lr1/x;->g(JLjava/util/concurrent/TimeUnit;)Lr1/x;

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :catchall_1
    move-exception p1

    .line 225
    goto :goto_3

    .line 226
    :cond_6
    :try_start_3
    new-instance v0, Lm1/a;

    .line 227
    .line 228
    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    .line 229
    .line 230
    .line 231
    throw v0

    .line 232
    :goto_2
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 233
    :try_start_4
    throw v0

    .line 234
    :goto_3
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 235
    throw p1
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm1/h;->d:Lm1/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm1/y;->e()Lm1/v;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lm1/v;->close()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm1/h;->c:Lm1/s;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm1/s;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e(Lg1/C;)Lg1/D;
    .locals 4

    .line 1
    iget-object v0, p0, Lm1/h;->b:Lj1/f;

    .line 2
    .line 3
    iget-object v0, v0, Lj1/f;->e:Lg1/b;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v0, "Content-Type"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lg1/C;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lk1/d;->a(Lg1/C;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    new-instance p1, Lm1/g;

    .line 18
    .line 19
    iget-object v2, p0, Lm1/h;->d:Lm1/y;

    .line 20
    .line 21
    iget-object v2, v2, Lm1/y;->g:Lm1/w;

    .line 22
    .line 23
    invoke-direct {p1, p0, v2}, Lm1/g;-><init>(Lm1/h;Lm1/w;)V

    .line 24
    .line 25
    .line 26
    new-instance v2, Lg1/D;

    .line 27
    .line 28
    sget-object v3, Lr1/o;->a:Ljava/util/logging/Logger;

    .line 29
    .line 30
    new-instance v3, Lr1/q;

    .line 31
    .line 32
    invoke-direct {v3, p1}, Lr1/q;-><init>(Lr1/v;)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    invoke-direct {v2, v0, v1, v3, p1}, Lg1/D;-><init>(JLr1/g;I)V

    .line 37
    .line 38
    .line 39
    return-object v2
.end method

.method public final f(Z)Lg1/B;
    .locals 9

    .line 1
    iget-object v0, p0, Lm1/h;->d:Lm1/y;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {v0}, Lm1/y;->f()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_8

    .line 9
    .line 10
    iget-object v1, v0, Lm1/y;->i:Lm1/x;

    .line 11
    .line 12
    invoke-virtual {v1}, Lr1/c;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    .line 14
    .line 15
    :goto_0
    :try_start_1
    iget-object v1, v0, Lm1/y;->e:Ljava/util/ArrayList;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    iget v1, v0, Lm1/y;->k:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catch_0
    :try_start_3
    new-instance p1, Ljava/io/InterruptedIOException;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    .line 30
    .line 31
    .line 32
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto/16 :goto_3

    .line 35
    .line 36
    :cond_0
    :try_start_4
    iget-object v1, v0, Lm1/y;->i:Lm1/x;

    .line 37
    .line 38
    invoke-virtual {v1}, Lm1/x;->n()V

    .line 39
    .line 40
    .line 41
    iget-object v1, v0, Lm1/y;->e:Ljava/util/ArrayList;

    .line 42
    .line 43
    if-eqz v1, :cond_7

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    iput-object v2, v0, Lm1/y;->e:Ljava/util/ArrayList;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 47
    .line 48
    monitor-exit v0

    .line 49
    new-instance v0, LA/b;

    .line 50
    .line 51
    const/16 v3, 0x1b

    .line 52
    .line 53
    invoke-direct {v0, v3}, LA/b;-><init>(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    const/4 v4, 0x0

    .line 61
    move-object v5, v2

    .line 62
    :goto_1
    const/16 v6, 0x64

    .line 63
    .line 64
    if-ge v4, v3, :cond_4

    .line 65
    .line 66
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    check-cast v7, Lm1/b;

    .line 71
    .line 72
    if-nez v7, :cond_1

    .line 73
    .line 74
    if-eqz v5, :cond_3

    .line 75
    .line 76
    iget v7, v5, LE/d;->b:I

    .line 77
    .line 78
    if-ne v7, v6, :cond_3

    .line 79
    .line 80
    new-instance v0, LA/b;

    .line 81
    .line 82
    const/16 v5, 0x1b

    .line 83
    .line 84
    invoke-direct {v0, v5}, LA/b;-><init>(I)V

    .line 85
    .line 86
    .line 87
    move-object v5, v2

    .line 88
    goto :goto_2

    .line 89
    :cond_1
    iget-object v6, v7, Lm1/b;->b:Lr1/h;

    .line 90
    .line 91
    invoke-virtual {v6}, Lr1/h;->o()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    sget-object v8, Lm1/b;->e:Lr1/h;

    .line 96
    .line 97
    iget-object v7, v7, Lm1/b;->a:Lr1/h;

    .line 98
    .line 99
    invoke-virtual {v7, v8}, Lr1/h;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    if-eqz v8, :cond_2

    .line 104
    .line 105
    new-instance v5, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    const-string v7, "HTTP/1.1 "

    .line 108
    .line 109
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    invoke-static {v5}, LE/d;->c(Ljava/lang/String;)LE/d;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    goto :goto_2

    .line 124
    :cond_2
    sget-object v8, Lm1/h;->f:Ljava/util/List;

    .line 125
    .line 126
    invoke-interface {v8, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v8

    .line 130
    if-nez v8, :cond_3

    .line 131
    .line 132
    sget-object v8, Lg1/b;->e:Lg1/b;

    .line 133
    .line 134
    invoke-virtual {v7}, Lr1/h;->o()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v7, v6}, LA/b;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    :cond_3
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_4
    if-eqz v5, :cond_6

    .line 148
    .line 149
    new-instance v1, Lg1/B;

    .line 150
    .line 151
    invoke-direct {v1}, Lg1/B;-><init>()V

    .line 152
    .line 153
    .line 154
    sget-object v3, Lg1/y;->e:Lg1/y;

    .line 155
    .line 156
    iput-object v3, v1, Lg1/B;->b:Lg1/y;

    .line 157
    .line 158
    iget v3, v5, LE/d;->b:I

    .line 159
    .line 160
    iput v3, v1, Lg1/B;->c:I

    .line 161
    .line 162
    iget-object v3, v5, LE/d;->d:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v3, Ljava/lang/String;

    .line 165
    .line 166
    iput-object v3, v1, Lg1/B;->d:Ljava/lang/String;

    .line 167
    .line 168
    iget-object v0, v0, LA/b;->g:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v0, Ljava/util/ArrayList;

    .line 171
    .line 172
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    new-array v3, v3, [Ljava/lang/String;

    .line 177
    .line 178
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    check-cast v0, [Ljava/lang/String;

    .line 183
    .line 184
    new-instance v3, LA/b;

    .line 185
    .line 186
    const/16 v4, 0x1b

    .line 187
    .line 188
    invoke-direct {v3, v4}, LA/b;-><init>(I)V

    .line 189
    .line 190
    .line 191
    iget-object v4, v3, LA/b;->g:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v4, Ljava/util/ArrayList;

    .line 194
    .line 195
    invoke-static {v4, v0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    iput-object v3, v1, Lg1/B;->f:LA/b;

    .line 199
    .line 200
    if-eqz p1, :cond_5

    .line 201
    .line 202
    sget-object p1, Lg1/b;->e:Lg1/b;

    .line 203
    .line 204
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    iget p1, v1, Lg1/B;->c:I

    .line 208
    .line 209
    if-ne p1, v6, :cond_5

    .line 210
    .line 211
    return-object v2

    .line 212
    :cond_5
    return-object v1

    .line 213
    :cond_6
    new-instance p1, Ljava/net/ProtocolException;

    .line 214
    .line 215
    const-string v0, "Expected \':status\' header not present"

    .line 216
    .line 217
    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    throw p1

    .line 221
    :cond_7
    :try_start_5
    new-instance p1, Lm1/D;

    .line 222
    .line 223
    iget v1, v0, Lm1/y;->k:I

    .line 224
    .line 225
    invoke-direct {p1, v1}, Lm1/D;-><init>(I)V

    .line 226
    .line 227
    .line 228
    throw p1

    .line 229
    :catchall_1
    move-exception p1

    .line 230
    goto :goto_4

    .line 231
    :goto_3
    iget-object v1, v0, Lm1/y;->i:Lm1/x;

    .line 232
    .line 233
    invoke-virtual {v1}, Lm1/x;->n()V

    .line 234
    .line 235
    .line 236
    throw p1

    .line 237
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 238
    .line 239
    const-string v1, "servers cannot read response headers"

    .line 240
    .line 241
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    throw p1

    .line 245
    :goto_4
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 246
    throw p1
.end method
