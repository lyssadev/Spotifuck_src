.class public final LQ0/t;
.super LQ0/B;
.source "SourceFile"


# instance fields
.field public final a:LA/b;

.field public final b:LQ0/C;


# direct methods
.method public constructor <init>(LA/b;LQ0/C;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LQ0/t;->a:LA/b;

    .line 5
    .line 6
    iput-object p2, p0, LQ0/t;->b:LQ0/C;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(LQ0/z;)Z
    .locals 1

    .line 1
    iget-object p1, p1, LQ0/z;->a:Landroid/net/Uri;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "http"

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    const-string v0, "https"

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 27
    :goto_1
    return p1
.end method

.method public final b()I
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    return v0
.end method

.method public final c(LQ0/z;I)LN0/p;
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x2

    .line 3
    if-eqz p2, :cond_3

    .line 4
    .line 5
    and-int/lit8 v2, p2, 0x4

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    sget-object p2, Lg1/j;->n:Lg1/j;

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    new-instance v2, Lg1/i;

    .line 13
    .line 14
    invoke-direct {v2}, Lg1/i;-><init>()V

    .line 15
    .line 16
    .line 17
    and-int/lit8 v3, p2, 0x1

    .line 18
    .line 19
    if-nez v3, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iput-boolean v0, v2, Lg1/i;->b:Z

    .line 23
    .line 24
    :goto_0
    and-int/2addr p2, v1

    .line 25
    if-nez p2, :cond_2

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    iput-boolean v0, v2, Lg1/i;->c:Z

    .line 29
    .line 30
    :goto_1
    new-instance p2, Lg1/j;

    .line 31
    .line 32
    invoke-direct {p2, v2}, Lg1/j;-><init>(Lg1/i;)V

    .line 33
    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_3
    const/4 p2, 0x0

    .line 37
    :goto_2
    new-instance v2, LA/k;

    .line 38
    .line 39
    const/4 v3, 0x5

    .line 40
    invoke-direct {v2, v3}, LA/k;-><init>(I)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p1, LQ0/z;->a:Landroid/net/Uri;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {v2, p1}, LA/k;->s(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    if-eqz p2, :cond_5

    .line 53
    .line 54
    invoke-virtual {p2}, Lg1/j;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    const-string v3, "Cache-Control"

    .line 63
    .line 64
    if-eqz p2, :cond_4

    .line 65
    .line 66
    iget-object p1, v2, LA/k;->h:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p1, LA/b;

    .line 69
    .line 70
    invoke-virtual {p1, v3}, LA/b;->B(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_4
    invoke-virtual {v2, v3, p1}, LA/k;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    :cond_5
    :goto_3
    invoke-virtual {v2}, LA/k;->b()Lg1/A;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iget-object p2, p0, LQ0/t;->a:LA/b;

    .line 82
    .line 83
    iget-object p2, p2, LA/b;->g:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p2, Lg1/x;

    .line 86
    .line 87
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    new-instance v2, Lg1/z;

    .line 91
    .line 92
    invoke-direct {v2, p2, p1}, Lg1/z;-><init>(Lg1/x;Lg1/A;)V

    .line 93
    .line 94
    .line 95
    iget-object p1, p2, Lg1/x;->d:Lg1/b;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    sget-object p1, Lg1/b;->d:Lg1/b;

    .line 101
    .line 102
    iput-object p1, v2, Lg1/z;->c:Lg1/b;

    .line 103
    .line 104
    monitor-enter v2

    .line 105
    :try_start_0
    iget-boolean p1, v2, Lg1/z;->e:Z

    .line 106
    .line 107
    if-nez p1, :cond_b

    .line 108
    .line 109
    iput-boolean v0, v2, Lg1/z;->e:Z

    .line 110
    .line 111
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 112
    sget-object p1, Lo1/g;->a:Lo1/g;

    .line 113
    .line 114
    invoke-virtual {p1}, Lo1/g;->i()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    iget-object v0, v2, Lg1/z;->b:Lk1/f;

    .line 119
    .line 120
    iput-object p1, v0, Lk1/f;->b:Ljava/lang/Object;

    .line 121
    .line 122
    iget-object p1, v2, Lg1/z;->c:Lg1/b;

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    :try_start_1
    iget-object p1, p2, Lg1/x;->a:LE/j;

    .line 128
    .line 129
    invoke-virtual {p1, v2}, LE/j;->v(Lg1/z;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2}, Lg1/z;->a()Lg1/C;

    .line 133
    .line 134
    .line 135
    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 136
    iget-object p2, p2, Lg1/x;->a:LE/j;

    .line 137
    .line 138
    invoke-virtual {p2, v2}, LE/j;->x(Lg1/z;)V

    .line 139
    .line 140
    .line 141
    iget-object p2, p1, Lg1/C;->g:Lg1/E;

    .line 142
    .line 143
    iget v0, p1, Lg1/C;->c:I

    .line 144
    .line 145
    const/16 v2, 0xc8

    .line 146
    .line 147
    if-lt v0, v2, :cond_a

    .line 148
    .line 149
    const/16 v2, 0x12c

    .line 150
    .line 151
    if-ge v0, v2, :cond_a

    .line 152
    .line 153
    iget-object p1, p1, Lg1/C;->i:Lg1/C;

    .line 154
    .line 155
    const/4 v0, 0x3

    .line 156
    if-nez p1, :cond_6

    .line 157
    .line 158
    const/4 p1, 0x3

    .line 159
    goto :goto_4

    .line 160
    :cond_6
    const/4 p1, 0x2

    .line 161
    :goto_4
    const-wide/16 v2, 0x0

    .line 162
    .line 163
    if-ne p1, v1, :cond_8

    .line 164
    .line 165
    invoke-virtual {p2}, Lg1/E;->f()J

    .line 166
    .line 167
    .line 168
    move-result-wide v4

    .line 169
    cmp-long v1, v4, v2

    .line 170
    .line 171
    if-eqz v1, :cond_7

    .line 172
    .line 173
    goto :goto_5

    .line 174
    :cond_7
    invoke-virtual {p2}, Lg1/E;->close()V

    .line 175
    .line 176
    .line 177
    new-instance p1, LQ0/r;

    .line 178
    .line 179
    const-string p2, "Received response with 0 content-length header."

    .line 180
    .line 181
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw p1

    .line 185
    :cond_8
    :goto_5
    if-ne p1, v0, :cond_9

    .line 186
    .line 187
    invoke-virtual {p2}, Lg1/E;->f()J

    .line 188
    .line 189
    .line 190
    move-result-wide v0

    .line 191
    cmp-long v4, v0, v2

    .line 192
    .line 193
    if-lez v4, :cond_9

    .line 194
    .line 195
    iget-object v0, p0, LQ0/t;->b:LQ0/C;

    .line 196
    .line 197
    invoke-virtual {p2}, Lg1/E;->f()J

    .line 198
    .line 199
    .line 200
    move-result-wide v1

    .line 201
    iget-object v0, v0, LQ0/C;->b:LQ0/j;

    .line 202
    .line 203
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    const/4 v2, 0x4

    .line 208
    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 213
    .line 214
    .line 215
    :cond_9
    new-instance v0, LN0/p;

    .line 216
    .line 217
    invoke-virtual {p2}, Lg1/E;->g()Lr1/g;

    .line 218
    .line 219
    .line 220
    move-result-object p2

    .line 221
    invoke-direct {v0, p2, p1}, LN0/p;-><init>(Lr1/v;I)V

    .line 222
    .line 223
    .line 224
    return-object v0

    .line 225
    :cond_a
    invoke-virtual {p2}, Lg1/E;->close()V

    .line 226
    .line 227
    .line 228
    new-instance p2, LQ0/s;

    .line 229
    .line 230
    iget p1, p1, Lg1/C;->c:I

    .line 231
    .line 232
    const-string v0, "HTTP "

    .line 233
    .line 234
    invoke-static {v0, p1}, LQ0/E;->e(Ljava/lang/String;I)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    throw p2

    .line 242
    :catchall_0
    move-exception p1

    .line 243
    goto :goto_6

    .line 244
    :catch_0
    move-exception p1

    .line 245
    :try_start_2
    iget-object p2, v2, Lg1/z;->c:Lg1/b;

    .line 246
    .line 247
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 251
    :goto_6
    iget-object p2, v2, Lg1/z;->a:Lg1/x;

    .line 252
    .line 253
    iget-object p2, p2, Lg1/x;->a:LE/j;

    .line 254
    .line 255
    invoke-virtual {p2, v2}, LE/j;->x(Lg1/z;)V

    .line 256
    .line 257
    .line 258
    throw p1

    .line 259
    :catchall_1
    move-exception p1

    .line 260
    goto :goto_7

    .line 261
    :cond_b
    :try_start_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 262
    .line 263
    const-string p2, "Already Executed"

    .line 264
    .line 265
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    throw p1

    .line 269
    :goto_7
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 270
    throw p1
.end method

.method public final d(Landroid/net/NetworkInfo;)Z
    .locals 0

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 13
    :goto_1
    return p1
.end method
