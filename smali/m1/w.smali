.class public final Lm1/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr1/v;


# instance fields
.field public final a:Lr1/e;

.field public final b:Lr1/e;

.field public final c:J

.field public d:Z

.field public e:Z

.field public final synthetic f:Lm1/y;


# direct methods
.method public constructor <init>(Lm1/y;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm1/w;->f:Lm1/y;

    .line 5
    .line 6
    new-instance p1, Lr1/e;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lm1/w;->a:Lr1/e;

    .line 12
    .line 13
    new-instance p1, Lr1/e;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lm1/w;->b:Lr1/e;

    .line 19
    .line 20
    iput-wide p2, p0, Lm1/w;->c:J

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a()Lr1/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lm1/w;->f:Lm1/y;

    .line 2
    .line 3
    iget-object v0, v0, Lm1/y;->i:Lm1/x;

    .line 4
    .line 5
    return-object v0
.end method

.method public final close()V
    .locals 4

    .line 1
    iget-object v0, p0, Lm1/w;->f:Lm1/y;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Lm1/w;->d:Z

    .line 6
    .line 7
    iget-object v1, p0, Lm1/w;->b:Lr1/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    :try_start_1
    iget-wide v2, v1, Lr1/e;->b:J

    .line 10
    .line 11
    invoke-virtual {v1, v2, v3}, Lr1/e;->s(J)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    .line 13
    .line 14
    :try_start_2
    iget-object v1, p0, Lm1/w;->f:Lm1/y;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 17
    .line 18
    .line 19
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 20
    iget-object v0, p0, Lm1/w;->f:Lm1/y;

    .line 21
    .line 22
    invoke-virtual {v0}, Lm1/y;->a()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception v1

    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception v1

    .line 29
    :try_start_3
    new-instance v2, Ljava/lang/AssertionError;

    .line 30
    .line 31
    invoke-direct {v2, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    throw v2

    .line 35
    :goto_0
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 36
    throw v1
.end method

.method public final e(Lr1/e;J)J
    .locals 8

    .line 1
    iget-object p2, p0, Lm1/w;->f:Lm1/y;

    .line 2
    .line 3
    monitor-enter p2

    .line 4
    :try_start_0
    iget-object p3, p0, Lm1/w;->f:Lm1/y;

    .line 5
    .line 6
    iget-object v0, p3, Lm1/y;->i:Lm1/x;

    .line 7
    .line 8
    invoke-virtual {v0}, Lr1/c;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    .line 10
    .line 11
    :goto_0
    :try_start_1
    iget-object v0, p0, Lm1/w;->b:Lr1/e;

    .line 12
    .line 13
    iget-wide v0, v0, Lr1/e;->b:J

    .line 14
    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    cmp-long v4, v0, v2

    .line 18
    .line 19
    if-nez v4, :cond_0

    .line 20
    .line 21
    iget-boolean v0, p0, Lm1/w;->e:Z

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    iget-boolean v0, p0, Lm1/w;->d:Z

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    iget v0, p3, Lm1/y;->k:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    :try_start_2
    invoke-virtual {p3}, Ljava/lang/Object;->wait()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catch_0
    :try_start_3
    new-instance p1, Ljava/io/InterruptedIOException;

    .line 38
    .line 39
    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    .line 40
    .line 41
    .line 42
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto/16 :goto_3

    .line 45
    .line 46
    :cond_0
    :try_start_4
    iget-object p3, p3, Lm1/y;->i:Lm1/x;

    .line 47
    .line 48
    invoke-virtual {p3}, Lm1/x;->n()V

    .line 49
    .line 50
    .line 51
    iget-boolean p3, p0, Lm1/w;->d:Z

    .line 52
    .line 53
    if-nez p3, :cond_5

    .line 54
    .line 55
    iget-object p3, p0, Lm1/w;->f:Lm1/y;

    .line 56
    .line 57
    iget v0, p3, Lm1/y;->k:I

    .line 58
    .line 59
    if-nez v0, :cond_4

    .line 60
    .line 61
    iget-object p3, p0, Lm1/w;->b:Lr1/e;

    .line 62
    .line 63
    iget-wide v0, p3, Lr1/e;->b:J

    .line 64
    .line 65
    cmp-long v4, v0, v2

    .line 66
    .line 67
    if-nez v4, :cond_1

    .line 68
    .line 69
    monitor-exit p2

    .line 70
    const-wide/16 p1, -0x1

    .line 71
    .line 72
    return-wide p1

    .line 73
    :catchall_1
    move-exception p1

    .line 74
    goto/16 :goto_4

    .line 75
    .line 76
    :cond_1
    const-wide/16 v4, 0x2000

    .line 77
    .line 78
    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 79
    .line 80
    .line 81
    move-result-wide v0

    .line 82
    invoke-virtual {p3, p1, v0, v1}, Lr1/e;->e(Lr1/e;J)J

    .line 83
    .line 84
    .line 85
    move-result-wide v0

    .line 86
    iget-object p1, p0, Lm1/w;->f:Lm1/y;

    .line 87
    .line 88
    iget-wide v4, p1, Lm1/y;->a:J

    .line 89
    .line 90
    add-long/2addr v4, v0

    .line 91
    iput-wide v4, p1, Lm1/y;->a:J

    .line 92
    .line 93
    iget-object p1, p1, Lm1/y;->d:Lm1/s;

    .line 94
    .line 95
    iget-object p1, p1, Lm1/s;->n:LK/j;

    .line 96
    .line 97
    invoke-virtual {p1}, LK/j;->b()I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    div-int/lit8 p1, p1, 0x2

    .line 102
    .line 103
    int-to-long v6, p1

    .line 104
    cmp-long p1, v4, v6

    .line 105
    .line 106
    if-ltz p1, :cond_2

    .line 107
    .line 108
    iget-object p1, p0, Lm1/w;->f:Lm1/y;

    .line 109
    .line 110
    iget-object p3, p1, Lm1/y;->d:Lm1/s;

    .line 111
    .line 112
    iget v4, p1, Lm1/y;->c:I

    .line 113
    .line 114
    iget-wide v5, p1, Lm1/y;->a:J

    .line 115
    .line 116
    invoke-virtual {p3, v4, v5, v6}, Lm1/s;->n(IJ)V

    .line 117
    .line 118
    .line 119
    iget-object p1, p0, Lm1/w;->f:Lm1/y;

    .line 120
    .line 121
    iput-wide v2, p1, Lm1/y;->a:J

    .line 122
    .line 123
    :cond_2
    monitor-exit p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 124
    iget-object p1, p0, Lm1/w;->f:Lm1/y;

    .line 125
    .line 126
    iget-object p1, p1, Lm1/y;->d:Lm1/s;

    .line 127
    .line 128
    monitor-enter p1

    .line 129
    :try_start_5
    iget-object p2, p0, Lm1/w;->f:Lm1/y;

    .line 130
    .line 131
    iget-object p2, p2, Lm1/y;->d:Lm1/s;

    .line 132
    .line 133
    iget-wide v4, p2, Lm1/s;->l:J

    .line 134
    .line 135
    add-long/2addr v4, v0

    .line 136
    iput-wide v4, p2, Lm1/s;->l:J

    .line 137
    .line 138
    iget-object p2, p2, Lm1/s;->n:LK/j;

    .line 139
    .line 140
    invoke-virtual {p2}, LK/j;->b()I

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    div-int/lit8 p2, p2, 0x2

    .line 145
    .line 146
    int-to-long p2, p2

    .line 147
    cmp-long v6, v4, p2

    .line 148
    .line 149
    if-ltz v6, :cond_3

    .line 150
    .line 151
    iget-object p2, p0, Lm1/w;->f:Lm1/y;

    .line 152
    .line 153
    iget-object p2, p2, Lm1/y;->d:Lm1/s;

    .line 154
    .line 155
    iget-wide v4, p2, Lm1/s;->l:J

    .line 156
    .line 157
    const/4 p3, 0x0

    .line 158
    invoke-virtual {p2, p3, v4, v5}, Lm1/s;->n(IJ)V

    .line 159
    .line 160
    .line 161
    iget-object p2, p0, Lm1/w;->f:Lm1/y;

    .line 162
    .line 163
    iget-object p2, p2, Lm1/y;->d:Lm1/s;

    .line 164
    .line 165
    iput-wide v2, p2, Lm1/s;->l:J

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :catchall_2
    move-exception p2

    .line 169
    goto :goto_2

    .line 170
    :cond_3
    :goto_1
    monitor-exit p1

    .line 171
    return-wide v0

    .line 172
    :goto_2
    monitor-exit p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 173
    throw p2

    .line 174
    :cond_4
    :try_start_6
    new-instance p1, Lm1/D;

    .line 175
    .line 176
    iget p3, p3, Lm1/y;->k:I

    .line 177
    .line 178
    invoke-direct {p1, p3}, Lm1/D;-><init>(I)V

    .line 179
    .line 180
    .line 181
    throw p1

    .line 182
    :cond_5
    new-instance p1, Ljava/io/IOException;

    .line 183
    .line 184
    const-string p3, "stream closed"

    .line 185
    .line 186
    invoke-direct {p1, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    throw p1

    .line 190
    :goto_3
    iget-object p3, p3, Lm1/y;->i:Lm1/x;

    .line 191
    .line 192
    invoke-virtual {p3}, Lm1/x;->n()V

    .line 193
    .line 194
    .line 195
    throw p1

    .line 196
    :goto_4
    monitor-exit p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 197
    throw p1
.end method
