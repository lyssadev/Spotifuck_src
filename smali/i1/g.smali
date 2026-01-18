.class public final Li1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# static fields
.field public static final u:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Ln1/a;

.field public final b:Ljava/io/File;

.field public final c:Ljava/io/File;

.field public final d:Ljava/io/File;

.field public final e:Ljava/io/File;

.field public final f:I

.field public final g:J

.field public final h:I

.field public i:J

.field public j:Lr1/p;

.field public final k:Ljava/util/LinkedHashMap;

.field public l:I

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:J

.field public final s:Ljava/util/concurrent/ThreadPoolExecutor;

.field public final t:LN0/B;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "[a-z0-9_-]{1,120}"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Li1/g;->u:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/io/File;JLjava/util/concurrent/ThreadPoolExecutor;)V
    .locals 7

    .line 1
    sget-object v0, Ln1/a;->a:Ln1/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    iput-wide v1, p0, Li1/g;->i:J

    .line 9
    .line 10
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    const/4 v4, 0x1

    .line 13
    const/4 v5, 0x0

    .line 14
    const/high16 v6, 0x3f400000    # 0.75f

    .line 15
    .line 16
    invoke-direct {v3, v5, v6, v4}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    .line 17
    .line 18
    .line 19
    iput-object v3, p0, Li1/g;->k:Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    iput-wide v1, p0, Li1/g;->r:J

    .line 22
    .line 23
    new-instance v1, LN0/B;

    .line 24
    .line 25
    const/16 v2, 0xc

    .line 26
    .line 27
    invoke-direct {v1, v2, p0}, LN0/B;-><init>(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Li1/g;->t:LN0/B;

    .line 31
    .line 32
    iput-object v0, p0, Li1/g;->a:Ln1/a;

    .line 33
    .line 34
    iput-object p1, p0, Li1/g;->b:Ljava/io/File;

    .line 35
    .line 36
    const v0, 0x31191

    .line 37
    .line 38
    .line 39
    iput v0, p0, Li1/g;->f:I

    .line 40
    .line 41
    new-instance v0, Ljava/io/File;

    .line 42
    .line 43
    const-string v1, "journal"

    .line 44
    .line 45
    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Li1/g;->c:Ljava/io/File;

    .line 49
    .line 50
    new-instance v0, Ljava/io/File;

    .line 51
    .line 52
    const-string v1, "journal.tmp"

    .line 53
    .line 54
    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, Li1/g;->d:Ljava/io/File;

    .line 58
    .line 59
    new-instance v0, Ljava/io/File;

    .line 60
    .line 61
    const-string v1, "journal.bkp"

    .line 62
    .line 63
    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iput-object v0, p0, Li1/g;->e:Ljava/io/File;

    .line 67
    .line 68
    const/4 p1, 0x2

    .line 69
    iput p1, p0, Li1/g;->h:I

    .line 70
    .line 71
    iput-wide p2, p0, Li1/g;->g:J

    .line 72
    .line 73
    iput-object p4, p0, Li1/g;->s:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 74
    .line 75
    return-void
.end method

.method public static t(Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Li1/g;->u:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    const-string v1, "keys must match regex [a-z0-9_-]{1,120}: \""

    .line 17
    .line 18
    const-string v2, "\""

    .line 19
    .line 20
    invoke-static {v1, p0, v2}, LQ0/E;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v0
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Li1/g;->n:Z

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-boolean v0, p0, Li1/g;->o:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    iget-object v0, p0, Li1/g;->k:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v2, p0, Li1/g;->k:Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/util/AbstractMap;->size()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    new-array v2, v2, [Li1/e;

    .line 25
    .line 26
    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, [Li1/e;

    .line 31
    .line 32
    array-length v2, v0

    .line 33
    const/4 v3, 0x0

    .line 34
    :goto_0
    if-ge v3, v2, :cond_2

    .line 35
    .line 36
    aget-object v4, v0, v3

    .line 37
    .line 38
    iget-object v4, v4, Li1/e;->f:Li1/d;

    .line 39
    .line 40
    if-eqz v4, :cond_1

    .line 41
    .line 42
    invoke-virtual {v4}, Li1/d;->a()V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    goto :goto_3

    .line 48
    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-virtual {p0}, Li1/g;->s()V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Li1/g;->j:Lr1/p;

    .line 55
    .line 56
    invoke-virtual {v0}, Lr1/p;->close()V

    .line 57
    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    iput-object v0, p0, Li1/g;->j:Lr1/p;

    .line 61
    .line 62
    iput-boolean v1, p0, Li1/g;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    monitor-exit p0

    .line 65
    return-void

    .line 66
    :cond_3
    :goto_2
    :try_start_1
    iput-boolean v1, p0, Li1/g;->o:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    .line 68
    monitor-exit p0

    .line 69
    return-void

    .line 70
    :goto_3
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 71
    throw v0
.end method

.method public final declared-synchronized f()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Li1/g;->k()Z

    .line 3
    .line 4
    .line 5
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    const-string v1, "cache is closed"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw v0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    throw v0
.end method

.method public final declared-synchronized flush()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Li1/g;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Li1/g;->f()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Li1/g;->s()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Li1/g;->j:Lr1/p;

    .line 15
    .line 16
    invoke-virtual {v0}, Lr1/p;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    .line 18
    .line 19
    monitor-exit p0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 23
    throw v0
.end method

.method public final declared-synchronized g(Li1/d;Z)V
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p1, Li1/d;->a:Li1/e;

    .line 3
    .line 4
    iget-object v1, v0, Li1/e;->f:Li1/d;

    .line 5
    .line 6
    if-ne v1, p1, :cond_b

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz p2, :cond_2

    .line 10
    .line 11
    iget-boolean v2, v0, Li1/e;->e:Z

    .line 12
    .line 13
    if-nez v2, :cond_2

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    iget v3, p0, Li1/g;->h:I

    .line 17
    .line 18
    if-ge v2, v3, :cond_2

    .line 19
    .line 20
    iget-object v3, p1, Li1/d;->b:[Z

    .line 21
    .line 22
    aget-boolean v3, v3, v2

    .line 23
    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    iget-object v3, p0, Li1/g;->a:Ln1/a;

    .line 27
    .line 28
    iget-object v4, v0, Li1/e;->d:[Ljava/io/File;

    .line 29
    .line 30
    aget-object v4, v4, v2

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_0

    .line 40
    .line 41
    invoke-virtual {p1}, Li1/d;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    monitor-exit p0

    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto/16 :goto_5

    .line 48
    .line 49
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    :try_start_1
    invoke-virtual {p1}, Li1/d;->a()V

    .line 53
    .line 54
    .line 55
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    new-instance p2, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    const-string v0, "Newly created entry didn\'t create value for index "

    .line 63
    .line 64
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p1

    .line 78
    :cond_2
    const/4 p1, 0x0

    .line 79
    :goto_1
    iget v2, p0, Li1/g;->h:I

    .line 80
    .line 81
    if-ge p1, v2, :cond_5

    .line 82
    .line 83
    iget-object v2, v0, Li1/e;->d:[Ljava/io/File;

    .line 84
    .line 85
    aget-object v2, v2, p1

    .line 86
    .line 87
    if-eqz p2, :cond_3

    .line 88
    .line 89
    iget-object v3, p0, Li1/g;->a:Ln1/a;

    .line 90
    .line 91
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-eqz v3, :cond_4

    .line 99
    .line 100
    iget-object v3, v0, Li1/e;->c:[Ljava/io/File;

    .line 101
    .line 102
    aget-object v3, v3, p1

    .line 103
    .line 104
    iget-object v4, p0, Li1/g;->a:Ln1/a;

    .line 105
    .line 106
    invoke-virtual {v4, v2, v3}, Ln1/a;->c(Ljava/io/File;Ljava/io/File;)V

    .line 107
    .line 108
    .line 109
    iget-object v2, v0, Li1/e;->b:[J

    .line 110
    .line 111
    aget-wide v4, v2, p1

    .line 112
    .line 113
    iget-object v2, p0, Li1/g;->a:Ln1/a;

    .line 114
    .line 115
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3}, Ljava/io/File;->length()J

    .line 119
    .line 120
    .line 121
    move-result-wide v2

    .line 122
    iget-object v6, v0, Li1/e;->b:[J

    .line 123
    .line 124
    aput-wide v2, v6, p1

    .line 125
    .line 126
    iget-wide v6, p0, Li1/g;->i:J

    .line 127
    .line 128
    sub-long/2addr v6, v4

    .line 129
    add-long/2addr v6, v2

    .line 130
    iput-wide v6, p0, Li1/g;->i:J

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_3
    iget-object v3, p0, Li1/g;->a:Ln1/a;

    .line 134
    .line 135
    invoke-virtual {v3, v2}, Ln1/a;->a(Ljava/io/File;)V

    .line 136
    .line 137
    .line 138
    :cond_4
    :goto_2
    add-int/lit8 p1, p1, 0x1

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_5
    iget p1, p0, Li1/g;->l:I

    .line 142
    .line 143
    const/4 v2, 0x1

    .line 144
    add-int/2addr p1, v2

    .line 145
    iput p1, p0, Li1/g;->l:I

    .line 146
    .line 147
    const/4 p1, 0x0

    .line 148
    iput-object p1, v0, Li1/e;->f:Li1/d;

    .line 149
    .line 150
    iget-boolean p1, v0, Li1/e;->e:Z

    .line 151
    .line 152
    or-int/2addr p1, p2

    .line 153
    const/16 v3, 0x20

    .line 154
    .line 155
    const/16 v4, 0xa

    .line 156
    .line 157
    if-eqz p1, :cond_7

    .line 158
    .line 159
    iput-boolean v2, v0, Li1/e;->e:Z

    .line 160
    .line 161
    iget-object p1, p0, Li1/g;->j:Lr1/p;

    .line 162
    .line 163
    const-string v2, "CLEAN"

    .line 164
    .line 165
    invoke-virtual {p1, v2}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1, v3}, Lr1/p;->d(I)Lr1/f;

    .line 169
    .line 170
    .line 171
    iget-object p1, p0, Li1/g;->j:Lr1/p;

    .line 172
    .line 173
    iget-object v2, v0, Li1/e;->a:Ljava/lang/String;

    .line 174
    .line 175
    invoke-virtual {p1, v2}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 176
    .line 177
    .line 178
    iget-object p1, p0, Li1/g;->j:Lr1/p;

    .line 179
    .line 180
    iget-object v2, v0, Li1/e;->b:[J

    .line 181
    .line 182
    array-length v5, v2

    .line 183
    :goto_3
    if-ge v1, v5, :cond_6

    .line 184
    .line 185
    aget-wide v6, v2, v1

    .line 186
    .line 187
    invoke-virtual {p1, v3}, Lr1/p;->d(I)Lr1/f;

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1, v6, v7}, Lr1/p;->h(J)Lr1/f;

    .line 191
    .line 192
    .line 193
    add-int/lit8 v1, v1, 0x1

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_6
    iget-object p1, p0, Li1/g;->j:Lr1/p;

    .line 197
    .line 198
    invoke-virtual {p1, v4}, Lr1/p;->d(I)Lr1/f;

    .line 199
    .line 200
    .line 201
    if-eqz p2, :cond_8

    .line 202
    .line 203
    iget-wide p1, p0, Li1/g;->r:J

    .line 204
    .line 205
    const-wide/16 v1, 0x1

    .line 206
    .line 207
    add-long/2addr v1, p1

    .line 208
    iput-wide v1, p0, Li1/g;->r:J

    .line 209
    .line 210
    iput-wide p1, v0, Li1/e;->g:J

    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_7
    iget-object p1, p0, Li1/g;->k:Ljava/util/LinkedHashMap;

    .line 214
    .line 215
    iget-object p2, v0, Li1/e;->a:Ljava/lang/String;

    .line 216
    .line 217
    invoke-virtual {p1, p2}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    iget-object p1, p0, Li1/g;->j:Lr1/p;

    .line 221
    .line 222
    const-string p2, "REMOVE"

    .line 223
    .line 224
    invoke-virtual {p1, p2}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1, v3}, Lr1/p;->d(I)Lr1/f;

    .line 228
    .line 229
    .line 230
    iget-object p1, p0, Li1/g;->j:Lr1/p;

    .line 231
    .line 232
    iget-object p2, v0, Li1/e;->a:Ljava/lang/String;

    .line 233
    .line 234
    invoke-virtual {p1, p2}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 235
    .line 236
    .line 237
    iget-object p1, p0, Li1/g;->j:Lr1/p;

    .line 238
    .line 239
    invoke-virtual {p1, v4}, Lr1/p;->d(I)Lr1/f;

    .line 240
    .line 241
    .line 242
    :cond_8
    :goto_4
    iget-object p1, p0, Li1/g;->j:Lr1/p;

    .line 243
    .line 244
    invoke-virtual {p1}, Lr1/p;->flush()V

    .line 245
    .line 246
    .line 247
    iget-wide p1, p0, Li1/g;->i:J

    .line 248
    .line 249
    iget-wide v0, p0, Li1/g;->g:J

    .line 250
    .line 251
    cmp-long v2, p1, v0

    .line 252
    .line 253
    if-gtz v2, :cond_9

    .line 254
    .line 255
    invoke-virtual {p0}, Li1/g;->l()Z

    .line 256
    .line 257
    .line 258
    move-result p1

    .line 259
    if-eqz p1, :cond_a

    .line 260
    .line 261
    :cond_9
    iget-object p1, p0, Li1/g;->s:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 262
    .line 263
    iget-object p2, p0, Li1/g;->t:LN0/B;

    .line 264
    .line 265
    invoke-virtual {p1, p2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 266
    .line 267
    .line 268
    :cond_a
    monitor-exit p0

    .line 269
    return-void

    .line 270
    :cond_b
    :try_start_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 271
    .line 272
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 273
    .line 274
    .line 275
    throw p1

    .line 276
    :goto_5
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 277
    throw p1
.end method

.method public final declared-synchronized h(Ljava/lang/String;J)Li1/d;
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Li1/g;->j()V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Li1/g;->f()V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Li1/g;->t(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Li1/g;->k:Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Li1/e;

    .line 18
    .line 19
    const-wide/16 v1, -0x1

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    cmp-long v4, p2, v1

    .line 23
    .line 24
    if-eqz v4, :cond_1

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget-wide v1, v0, Li1/e;->g:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    cmp-long v4, v1, p2

    .line 31
    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    goto :goto_2

    .line 37
    :cond_0
    :goto_0
    monitor-exit p0

    .line 38
    return-object v3

    .line 39
    :cond_1
    if-eqz v0, :cond_2

    .line 40
    .line 41
    :try_start_1
    iget-object p2, v0, Li1/e;->f:Li1/d;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    .line 43
    if-eqz p2, :cond_2

    .line 44
    .line 45
    monitor-exit p0

    .line 46
    return-object v3

    .line 47
    :cond_2
    :try_start_2
    iget-boolean p2, p0, Li1/g;->p:Z

    .line 48
    .line 49
    if-nez p2, :cond_6

    .line 50
    .line 51
    iget-boolean p2, p0, Li1/g;->q:Z

    .line 52
    .line 53
    if-eqz p2, :cond_3

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    iget-object p2, p0, Li1/g;->j:Lr1/p;

    .line 57
    .line 58
    const-string p3, "DIRTY"

    .line 59
    .line 60
    invoke-virtual {p2, p3}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 61
    .line 62
    .line 63
    const/16 p3, 0x20

    .line 64
    .line 65
    invoke-virtual {p2, p3}, Lr1/p;->d(I)Lr1/f;

    .line 66
    .line 67
    .line 68
    invoke-interface {p2, p1}, Lr1/f;->c(Ljava/lang/String;)Lr1/f;

    .line 69
    .line 70
    .line 71
    const/16 p3, 0xa

    .line 72
    .line 73
    invoke-interface {p2, p3}, Lr1/f;->d(I)Lr1/f;

    .line 74
    .line 75
    .line 76
    iget-object p2, p0, Li1/g;->j:Lr1/p;

    .line 77
    .line 78
    invoke-virtual {p2}, Lr1/p;->flush()V

    .line 79
    .line 80
    .line 81
    iget-boolean p2, p0, Li1/g;->m:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 82
    .line 83
    if-eqz p2, :cond_4

    .line 84
    .line 85
    monitor-exit p0

    .line 86
    return-object v3

    .line 87
    :cond_4
    if-nez v0, :cond_5

    .line 88
    .line 89
    :try_start_3
    new-instance v0, Li1/e;

    .line 90
    .line 91
    invoke-direct {v0, p0, p1}, Li1/e;-><init>(Li1/g;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iget-object p2, p0, Li1/g;->k:Ljava/util/LinkedHashMap;

    .line 95
    .line 96
    invoke-virtual {p2, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    :cond_5
    new-instance p1, Li1/d;

    .line 100
    .line 101
    invoke-direct {p1, p0, v0}, Li1/d;-><init>(Li1/g;Li1/e;)V

    .line 102
    .line 103
    .line 104
    iput-object p1, v0, Li1/e;->f:Li1/d;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 105
    .line 106
    monitor-exit p0

    .line 107
    return-object p1

    .line 108
    :cond_6
    :goto_1
    :try_start_4
    iget-object p1, p0, Li1/g;->s:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 109
    .line 110
    iget-object p2, p0, Li1/g;->t:LN0/B;

    .line 111
    .line 112
    invoke-virtual {p1, p2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 113
    .line 114
    .line 115
    monitor-exit p0

    .line 116
    return-object v3

    .line 117
    :goto_2
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 118
    throw p1
.end method

.method public final declared-synchronized i(Ljava/lang/String;)Li1/f;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Li1/g;->j()V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Li1/g;->f()V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Li1/g;->t(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Li1/g;->k:Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Li1/e;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    iget-boolean v2, v0, Li1/e;->e:Z

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-virtual {v0}, Li1/e;->a()Li1/f;

    .line 28
    .line 29
    .line 30
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    monitor-exit p0

    .line 34
    return-object v1

    .line 35
    :cond_1
    :try_start_1
    iget v1, p0, Li1/g;->l:I

    .line 36
    .line 37
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    iput v1, p0, Li1/g;->l:I

    .line 40
    .line 41
    iget-object v1, p0, Li1/g;->j:Lr1/p;

    .line 42
    .line 43
    const-string v2, "READ"

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 46
    .line 47
    .line 48
    const/16 v2, 0x20

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Lr1/p;->d(I)Lr1/f;

    .line 51
    .line 52
    .line 53
    invoke-interface {v1, p1}, Lr1/f;->c(Ljava/lang/String;)Lr1/f;

    .line 54
    .line 55
    .line 56
    const/16 p1, 0xa

    .line 57
    .line 58
    invoke-interface {v1, p1}, Lr1/f;->d(I)Lr1/f;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Li1/g;->l()Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    iget-object p1, p0, Li1/g;->s:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 68
    .line 69
    iget-object v1, p0, Li1/g;->t:LN0/B;

    .line 70
    .line 71
    invoke-virtual {p1, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :catchall_0
    move-exception p1

    .line 76
    goto :goto_2

    .line 77
    :cond_2
    :goto_0
    monitor-exit p0

    .line 78
    return-object v0

    .line 79
    :cond_3
    :goto_1
    monitor-exit p0

    .line 80
    return-object v1

    .line 81
    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 82
    throw p1
.end method

.method public final declared-synchronized j()V
    .locals 5

    .line 1
    const-string v0, "DiskLruCache "

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Li1/g;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_1
    iget-object v1, p0, Li1/g;->a:Ln1/a;

    .line 11
    .line 12
    iget-object v2, p0, Li1/g;->e:Ljava/io/File;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, Li1/g;->a:Ln1/a;

    .line 24
    .line 25
    iget-object v2, p0, Li1/g;->c:Ljava/io/File;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    iget-object v1, p0, Li1/g;->a:Ln1/a;

    .line 37
    .line 38
    iget-object v2, p0, Li1/g;->e:Ljava/io/File;

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ln1/a;->a(Ljava/io/File;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    goto :goto_2

    .line 46
    :cond_1
    iget-object v1, p0, Li1/g;->a:Ln1/a;

    .line 47
    .line 48
    iget-object v2, p0, Li1/g;->e:Ljava/io/File;

    .line 49
    .line 50
    iget-object v3, p0, Li1/g;->c:Ljava/io/File;

    .line 51
    .line 52
    invoke-virtual {v1, v2, v3}, Ln1/a;->c(Ljava/io/File;Ljava/io/File;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    :goto_0
    iget-object v1, p0, Li1/g;->a:Ln1/a;

    .line 56
    .line 57
    iget-object v2, p0, Li1/g;->c:Ljava/io/File;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 63
    .line 64
    .line 65
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    const/4 v2, 0x1

    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    :try_start_2
    invoke-virtual {p0}, Li1/g;->o()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Li1/g;->n()V

    .line 73
    .line 74
    .line 75
    iput-boolean v2, p0, Li1/g;->n:Z
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 76
    .line 77
    monitor-exit p0

    .line 78
    return-void

    .line 79
    :catch_0
    move-exception v1

    .line 80
    :try_start_3
    sget-object v3, Lo1/g;->a:Lo1/g;

    .line 81
    .line 82
    new-instance v4, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Li1/g;->b:Ljava/io/File;

    .line 88
    .line 89
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v0, " is corrupt: "

    .line 93
    .line 94
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v0, ", removing"

    .line 105
    .line 106
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    const/4 v4, 0x5

    .line 114
    invoke-virtual {v3, v4, v0, v1}, Lo1/g;->k(ILjava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 115
    .line 116
    .line 117
    const/4 v0, 0x0

    .line 118
    :try_start_4
    invoke-virtual {p0}, Li1/g;->close()V

    .line 119
    .line 120
    .line 121
    iget-object v1, p0, Li1/g;->b:Ljava/io/File;

    .line 122
    .line 123
    iget-object v3, p0, Li1/g;->a:Ln1/a;

    .line 124
    .line 125
    invoke-virtual {v3, v1}, Ln1/a;->b(Ljava/io/File;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 126
    .line 127
    .line 128
    :try_start_5
    iput-boolean v0, p0, Li1/g;->o:Z

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :catchall_1
    move-exception v1

    .line 132
    iput-boolean v0, p0, Li1/g;->o:Z

    .line 133
    .line 134
    throw v1

    .line 135
    :cond_3
    :goto_1
    invoke-virtual {p0}, Li1/g;->q()V

    .line 136
    .line 137
    .line 138
    iput-boolean v2, p0, Li1/g;->n:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 139
    .line 140
    monitor-exit p0

    .line 141
    return-void

    .line 142
    :goto_2
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 143
    throw v0
.end method

.method public final declared-synchronized k()Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Li1/g;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method

.method public final l()Z
    .locals 2

    .line 1
    iget v0, p0, Li1/g;->l:I

    .line 2
    .line 3
    const/16 v1, 0x7d0

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Li1/g;->k:Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-lt v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    return v0
.end method

.method public final m()Lr1/p;
    .locals 5

    .line 1
    iget-object v0, p0, Li1/g;->c:Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Li1/g;->a:Ln1/a;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    :try_start_0
    sget-object v2, Lr1/o;->a:Ljava/util/logging/Logger;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v2, Ljava/io/FileOutputStream;

    .line 14
    .line 15
    invoke-direct {v2, v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    .line 16
    .line 17
    .line 18
    new-instance v3, Lr1/x;

    .line 19
    .line 20
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance v4, Lr1/a;

    .line 24
    .line 25
    invoke-direct {v4, v3, v2}, Lr1/a;-><init>(Lr1/x;Ljava/io/OutputStream;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 30
    .line 31
    const-string v3, "file == null"

    .line 32
    .line 33
    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v2
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    :catch_0
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 42
    .line 43
    .line 44
    sget-object v2, Lr1/o;->a:Ljava/util/logging/Logger;

    .line 45
    .line 46
    new-instance v2, Ljava/io/FileOutputStream;

    .line 47
    .line 48
    invoke-direct {v2, v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    .line 49
    .line 50
    .line 51
    new-instance v0, Lr1/x;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    new-instance v4, Lr1/a;

    .line 57
    .line 58
    invoke-direct {v4, v0, v2}, Lr1/a;-><init>(Lr1/x;Ljava/io/OutputStream;)V

    .line 59
    .line 60
    .line 61
    :goto_0
    new-instance v0, Li1/c;

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    invoke-direct {v0, p0, v4, v1}, Li1/c;-><init>(Ljava/lang/Object;Lr1/a;I)V

    .line 65
    .line 66
    .line 67
    new-instance v1, Lr1/p;

    .line 68
    .line 69
    invoke-direct {v1, v0}, Lr1/p;-><init>(Lr1/u;)V

    .line 70
    .line 71
    .line 72
    return-object v1
.end method

.method public final n()V
    .locals 10

    .line 1
    iget-object v0, p0, Li1/g;->d:Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Li1/g;->a:Ln1/a;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ln1/a;->a(Ljava/io/File;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Li1/g;->k:Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_3

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Li1/e;

    .line 29
    .line 30
    iget-object v3, v2, Li1/e;->f:Li1/d;

    .line 31
    .line 32
    iget v4, p0, Li1/g;->h:I

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    if-nez v3, :cond_1

    .line 36
    .line 37
    :goto_1
    if-ge v5, v4, :cond_0

    .line 38
    .line 39
    iget-wide v6, p0, Li1/g;->i:J

    .line 40
    .line 41
    iget-object v3, v2, Li1/e;->b:[J

    .line 42
    .line 43
    aget-wide v8, v3, v5

    .line 44
    .line 45
    add-long/2addr v6, v8

    .line 46
    iput-wide v6, p0, Li1/g;->i:J

    .line 47
    .line 48
    add-int/lit8 v5, v5, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const/4 v3, 0x0

    .line 52
    iput-object v3, v2, Li1/e;->f:Li1/d;

    .line 53
    .line 54
    :goto_2
    if-ge v5, v4, :cond_2

    .line 55
    .line 56
    iget-object v3, v2, Li1/e;->c:[Ljava/io/File;

    .line 57
    .line 58
    aget-object v3, v3, v5

    .line 59
    .line 60
    invoke-virtual {v1, v3}, Ln1/a;->a(Ljava/io/File;)V

    .line 61
    .line 62
    .line 63
    iget-object v3, v2, Li1/e;->d:[Ljava/io/File;

    .line 64
    .line 65
    aget-object v3, v3, v5

    .line 66
    .line 67
    invoke-virtual {v1, v3}, Ln1/a;->a(Ljava/io/File;)V

    .line 68
    .line 69
    .line 70
    add-int/lit8 v5, v5, 0x1

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    return-void
.end method

.method public final o()V
    .locals 11

    .line 1
    const-string v0, ", "

    .line 2
    .line 3
    const-string v1, "unexpected journal header: ["

    .line 4
    .line 5
    iget-object v2, p0, Li1/g;->c:Ljava/io/File;

    .line 6
    .line 7
    iget-object v3, p0, Li1/g;->a:Ln1/a;

    .line 8
    .line 9
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v3, Lr1/o;->a:Ljava/util/logging/Logger;

    .line 13
    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    new-instance v3, Ljava/io/FileInputStream;

    .line 17
    .line 18
    invoke-direct {v3, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v3}, Lr1/o;->b(Ljava/io/InputStream;)Lr1/b;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    new-instance v3, Lr1/q;

    .line 26
    .line 27
    invoke-direct {v3, v2}, Lr1/q;-><init>(Lr1/v;)V

    .line 28
    .line 29
    .line 30
    const-wide v4, 0x7fffffffffffffffL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    :try_start_0
    invoke-virtual {v3, v4, v5}, Lr1/q;->n(J)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v3, v4, v5}, Lr1/q;->n(J)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-virtual {v3, v4, v5}, Lr1/q;->n(J)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    invoke-virtual {v3, v4, v5}, Lr1/q;->n(J)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v8

    .line 51
    invoke-virtual {v3, v4, v5}, Lr1/q;->n(J)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    const-string v10, "libcore.io.DiskLruCache"

    .line 56
    .line 57
    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v10

    .line 61
    if-eqz v10, :cond_1

    .line 62
    .line 63
    const-string v10, "1"

    .line 64
    .line 65
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v10

    .line 69
    if-eqz v10, :cond_1

    .line 70
    .line 71
    iget v10, p0, Li1/g;->f:I

    .line 72
    .line 73
    invoke-static {v10}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    if-eqz v7, :cond_1

    .line 82
    .line 83
    iget v7, p0, Li1/g;->h:I

    .line 84
    .line 85
    invoke-static {v7}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    if-eqz v7, :cond_1

    .line 94
    .line 95
    const-string v7, ""

    .line 96
    .line 97
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    if-eqz v7, :cond_1

    .line 102
    .line 103
    const/4 v0, 0x0

    .line 104
    :goto_0
    :try_start_1
    invoke-virtual {v3, v4, v5}, Lr1/q;->n(J)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {p0, v1}, Li1/g;->p(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 109
    .line 110
    .line 111
    add-int/lit8 v0, v0, 0x1

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :catchall_0
    move-exception v0

    .line 115
    goto :goto_2

    .line 116
    :catch_0
    :try_start_2
    iget-object v1, p0, Li1/g;->k:Ljava/util/LinkedHashMap;

    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    sub-int/2addr v0, v1

    .line 123
    iput v0, p0, Li1/g;->l:I

    .line 124
    .line 125
    invoke-virtual {v3}, Lr1/q;->f()Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-nez v0, :cond_0

    .line 130
    .line 131
    invoke-virtual {p0}, Li1/g;->q()V

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_0
    invoke-virtual {p0}, Li1/g;->m()Lr1/p;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    iput-object v0, p0, Li1/g;->j:Lr1/p;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 140
    .line 141
    :goto_1
    invoke-static {v3}, Lh1/c;->c(Ljava/io/Closeable;)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_1
    :try_start_3
    new-instance v4, Ljava/io/IOException;

    .line 146
    .line 147
    new-instance v5, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const-string v0, "]"

    .line 174
    .line 175
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-direct {v4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 186
    :goto_2
    invoke-static {v3}, Lh1/c;->c(Ljava/io/Closeable;)V

    .line 187
    .line 188
    .line 189
    throw v0

    .line 190
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 191
    .line 192
    const-string v1, "file == null"

    .line 193
    .line 194
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw v0
.end method

.method public final p(Ljava/lang/String;)V
    .locals 7

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const-string v2, "unexpected journal line: "

    .line 8
    .line 9
    const/4 v3, -0x1

    .line 10
    if-eq v1, v3, :cond_8

    .line 11
    .line 12
    add-int/lit8 v4, v1, 0x1

    .line 13
    .line 14
    invoke-virtual {p1, v0, v4}, Ljava/lang/String;->indexOf(II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v5, p0, Li1/g;->k:Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    if-ne v0, v3, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const/4 v6, 0x6

    .line 27
    if-ne v1, v6, :cond_1

    .line 28
    .line 29
    const-string v6, "REMOVE"

    .line 30
    .line 31
    invoke-virtual {p1, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    if-eqz v6, :cond_1

    .line 36
    .line 37
    invoke-virtual {v5, v4}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    invoke-virtual {p1, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    :cond_1
    invoke-virtual {v5, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    check-cast v6, Li1/e;

    .line 50
    .line 51
    if-nez v6, :cond_2

    .line 52
    .line 53
    new-instance v6, Li1/e;

    .line 54
    .line 55
    invoke-direct {v6, p0, v4}, Li1/e;-><init>(Li1/g;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5, v4, v6}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    :cond_2
    const/4 v4, 0x5

    .line 62
    if-eq v0, v3, :cond_4

    .line 63
    .line 64
    if-ne v1, v4, :cond_4

    .line 65
    .line 66
    const-string v5, "CLEAN"

    .line 67
    .line 68
    invoke-virtual {p1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-eqz v5, :cond_4

    .line 73
    .line 74
    const/4 v1, 0x1

    .line 75
    add-int/2addr v0, v1

    .line 76
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    const-string v0, " "

    .line 81
    .line 82
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iput-boolean v1, v6, Li1/e;->e:Z

    .line 87
    .line 88
    const/4 v0, 0x0

    .line 89
    iput-object v0, v6, Li1/e;->f:Li1/d;

    .line 90
    .line 91
    array-length v0, p1

    .line 92
    iget-object v1, v6, Li1/e;->h:Li1/g;

    .line 93
    .line 94
    iget v1, v1, Li1/g;->h:I

    .line 95
    .line 96
    if-ne v0, v1, :cond_3

    .line 97
    .line 98
    const/4 v0, 0x0

    .line 99
    :goto_0
    :try_start_0
    array-length v1, p1

    .line 100
    if-ge v0, v1, :cond_6

    .line 101
    .line 102
    iget-object v1, v6, Li1/e;->b:[J

    .line 103
    .line 104
    aget-object v3, p1, v0

    .line 105
    .line 106
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 107
    .line 108
    .line 109
    move-result-wide v3

    .line 110
    aput-wide v3, v1, v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 111
    .line 112
    add-int/lit8 v0, v0, 0x1

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :catch_0
    new-instance v0, Ljava/io/IOException;

    .line 116
    .line 117
    new-instance v1, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw v0

    .line 137
    :cond_3
    new-instance v0, Ljava/io/IOException;

    .line 138
    .line 139
    new-instance v1, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw v0

    .line 159
    :cond_4
    if-ne v0, v3, :cond_5

    .line 160
    .line 161
    if-ne v1, v4, :cond_5

    .line 162
    .line 163
    const-string v4, "DIRTY"

    .line 164
    .line 165
    invoke-virtual {p1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    if-eqz v4, :cond_5

    .line 170
    .line 171
    new-instance p1, Li1/d;

    .line 172
    .line 173
    invoke-direct {p1, p0, v6}, Li1/d;-><init>(Li1/g;Li1/e;)V

    .line 174
    .line 175
    .line 176
    iput-object p1, v6, Li1/e;->f:Li1/d;

    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_5
    if-ne v0, v3, :cond_7

    .line 180
    .line 181
    const/4 v0, 0x4

    .line 182
    if-ne v1, v0, :cond_7

    .line 183
    .line 184
    const-string v0, "READ"

    .line 185
    .line 186
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    if-eqz v0, :cond_7

    .line 191
    .line 192
    :cond_6
    :goto_1
    return-void

    .line 193
    :cond_7
    new-instance v0, Ljava/io/IOException;

    .line 194
    .line 195
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw v0

    .line 203
    :cond_8
    new-instance v0, Ljava/io/IOException;

    .line 204
    .line 205
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw v0
.end method

.method public final declared-synchronized q()V
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Li1/g;->j:Lr1/p;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Lr1/p;->close()V

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    goto/16 :goto_5

    .line 12
    .line 13
    :cond_0
    :goto_0
    iget-object v0, p0, Li1/g;->a:Ln1/a;

    .line 14
    .line 15
    iget-object v1, p0, Li1/g;->d:Ljava/io/File;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    :try_start_1
    sget-object v0, Lr1/o;->a:Ljava/util/logging/Logger;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    new-instance v0, Ljava/io/FileOutputStream;

    .line 25
    .line 26
    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 27
    .line 28
    .line 29
    new-instance v2, Lr1/x;

    .line 30
    .line 31
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance v3, Lr1/a;

    .line 35
    .line 36
    invoke-direct {v3, v2, v0}, Lr1/a;-><init>(Lr1/x;Ljava/io/OutputStream;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 41
    .line 42
    const-string v2, "file == null"

    .line 43
    .line 44
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v0
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    :catch_0
    :try_start_2
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 53
    .line 54
    .line 55
    sget-object v0, Lr1/o;->a:Ljava/util/logging/Logger;

    .line 56
    .line 57
    new-instance v0, Ljava/io/FileOutputStream;

    .line 58
    .line 59
    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 60
    .line 61
    .line 62
    new-instance v1, Lr1/x;

    .line 63
    .line 64
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    new-instance v3, Lr1/a;

    .line 68
    .line 69
    invoke-direct {v3, v1, v0}, Lr1/a;-><init>(Lr1/x;Ljava/io/OutputStream;)V

    .line 70
    .line 71
    .line 72
    :goto_1
    new-instance v0, Lr1/p;

    .line 73
    .line 74
    invoke-direct {v0, v3}, Lr1/p;-><init>(Lr1/u;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 75
    .line 76
    .line 77
    :try_start_3
    const-string v1, "libcore.io.DiskLruCache"

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 80
    .line 81
    .line 82
    const/16 v1, 0xa

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Lr1/p;->d(I)Lr1/f;

    .line 85
    .line 86
    .line 87
    const-string v2, "1"

    .line 88
    .line 89
    invoke-virtual {v0, v2}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1}, Lr1/p;->d(I)Lr1/f;

    .line 93
    .line 94
    .line 95
    iget v2, p0, Li1/g;->f:I

    .line 96
    .line 97
    int-to-long v2, v2

    .line 98
    invoke-virtual {v0, v2, v3}, Lr1/p;->h(J)Lr1/f;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v1}, Lr1/p;->d(I)Lr1/f;

    .line 102
    .line 103
    .line 104
    iget v2, p0, Li1/g;->h:I

    .line 105
    .line 106
    int-to-long v2, v2

    .line 107
    invoke-virtual {v0, v2, v3}, Lr1/p;->h(J)Lr1/f;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v1}, Lr1/p;->d(I)Lr1/f;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v1}, Lr1/p;->d(I)Lr1/f;

    .line 114
    .line 115
    .line 116
    iget-object v2, p0, Li1/g;->k:Ljava/util/LinkedHashMap;

    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    const/4 v4, 0x0

    .line 131
    if-eqz v3, :cond_4

    .line 132
    .line 133
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    check-cast v3, Li1/e;

    .line 138
    .line 139
    iget-object v5, v3, Li1/e;->f:Li1/d;

    .line 140
    .line 141
    const/16 v6, 0x20

    .line 142
    .line 143
    if-eqz v5, :cond_2

    .line 144
    .line 145
    const-string v4, "DIRTY"

    .line 146
    .line 147
    invoke-virtual {v0, v4}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v6}, Lr1/p;->d(I)Lr1/f;

    .line 151
    .line 152
    .line 153
    iget-object v3, v3, Li1/e;->a:Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {v0, v3}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v1}, Lr1/p;->d(I)Lr1/f;

    .line 159
    .line 160
    .line 161
    goto :goto_2

    .line 162
    :catchall_1
    move-exception v1

    .line 163
    goto :goto_4

    .line 164
    :cond_2
    const-string v5, "CLEAN"

    .line 165
    .line 166
    invoke-virtual {v0, v5}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v6}, Lr1/p;->d(I)Lr1/f;

    .line 170
    .line 171
    .line 172
    iget-object v5, v3, Li1/e;->a:Ljava/lang/String;

    .line 173
    .line 174
    invoke-virtual {v0, v5}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 175
    .line 176
    .line 177
    iget-object v3, v3, Li1/e;->b:[J

    .line 178
    .line 179
    array-length v5, v3

    .line 180
    :goto_3
    if-ge v4, v5, :cond_3

    .line 181
    .line 182
    aget-wide v7, v3, v4

    .line 183
    .line 184
    invoke-virtual {v0, v6}, Lr1/p;->d(I)Lr1/f;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v7, v8}, Lr1/p;->h(J)Lr1/f;

    .line 188
    .line 189
    .line 190
    add-int/lit8 v4, v4, 0x1

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_3
    invoke-virtual {v0, v1}, Lr1/p;->d(I)Lr1/f;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 194
    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_4
    :try_start_4
    invoke-virtual {v0}, Lr1/p;->close()V

    .line 198
    .line 199
    .line 200
    iget-object v0, p0, Li1/g;->a:Ln1/a;

    .line 201
    .line 202
    iget-object v1, p0, Li1/g;->c:Ljava/io/File;

    .line 203
    .line 204
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-eqz v0, :cond_5

    .line 212
    .line 213
    iget-object v0, p0, Li1/g;->a:Ln1/a;

    .line 214
    .line 215
    iget-object v1, p0, Li1/g;->c:Ljava/io/File;

    .line 216
    .line 217
    iget-object v2, p0, Li1/g;->e:Ljava/io/File;

    .line 218
    .line 219
    invoke-virtual {v0, v1, v2}, Ln1/a;->c(Ljava/io/File;Ljava/io/File;)V

    .line 220
    .line 221
    .line 222
    :cond_5
    iget-object v0, p0, Li1/g;->a:Ln1/a;

    .line 223
    .line 224
    iget-object v1, p0, Li1/g;->d:Ljava/io/File;

    .line 225
    .line 226
    iget-object v2, p0, Li1/g;->c:Ljava/io/File;

    .line 227
    .line 228
    invoke-virtual {v0, v1, v2}, Ln1/a;->c(Ljava/io/File;Ljava/io/File;)V

    .line 229
    .line 230
    .line 231
    iget-object v0, p0, Li1/g;->a:Ln1/a;

    .line 232
    .line 233
    iget-object v1, p0, Li1/g;->e:Ljava/io/File;

    .line 234
    .line 235
    invoke-virtual {v0, v1}, Ln1/a;->a(Ljava/io/File;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {p0}, Li1/g;->m()Lr1/p;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    iput-object v0, p0, Li1/g;->j:Lr1/p;

    .line 243
    .line 244
    iput-boolean v4, p0, Li1/g;->m:Z

    .line 245
    .line 246
    iput-boolean v4, p0, Li1/g;->q:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 247
    .line 248
    monitor-exit p0

    .line 249
    return-void

    .line 250
    :goto_4
    :try_start_5
    invoke-virtual {v0}, Lr1/p;->close()V

    .line 251
    .line 252
    .line 253
    throw v1

    .line 254
    :goto_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 255
    throw v0
.end method

.method public final r(Li1/e;)V
    .locals 6

    .line 1
    iget-object v0, p1, Li1/e;->f:Li1/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Li1/d;->c()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    iget v1, p0, Li1/g;->h:I

    .line 10
    .line 11
    if-ge v0, v1, :cond_1

    .line 12
    .line 13
    iget-object v1, p1, Li1/e;->c:[Ljava/io/File;

    .line 14
    .line 15
    aget-object v1, v1, v0

    .line 16
    .line 17
    iget-object v2, p0, Li1/g;->a:Ln1/a;

    .line 18
    .line 19
    invoke-virtual {v2, v1}, Ln1/a;->a(Ljava/io/File;)V

    .line 20
    .line 21
    .line 22
    iget-wide v1, p0, Li1/g;->i:J

    .line 23
    .line 24
    iget-object v3, p1, Li1/e;->b:[J

    .line 25
    .line 26
    aget-wide v4, v3, v0

    .line 27
    .line 28
    sub-long/2addr v1, v4

    .line 29
    iput-wide v1, p0, Li1/g;->i:J

    .line 30
    .line 31
    const-wide/16 v1, 0x0

    .line 32
    .line 33
    aput-wide v1, v3, v0

    .line 34
    .line 35
    add-int/lit8 v0, v0, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iget v0, p0, Li1/g;->l:I

    .line 39
    .line 40
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    iput v0, p0, Li1/g;->l:I

    .line 43
    .line 44
    iget-object v0, p0, Li1/g;->j:Lr1/p;

    .line 45
    .line 46
    const-string v1, "REMOVE"

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 49
    .line 50
    .line 51
    const/16 v1, 0x20

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Lr1/p;->d(I)Lr1/f;

    .line 54
    .line 55
    .line 56
    iget-object p1, p1, Li1/e;->a:Ljava/lang/String;

    .line 57
    .line 58
    invoke-interface {v0, p1}, Lr1/f;->c(Ljava/lang/String;)Lr1/f;

    .line 59
    .line 60
    .line 61
    const/16 v1, 0xa

    .line 62
    .line 63
    invoke-interface {v0, v1}, Lr1/f;->d(I)Lr1/f;

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Li1/g;->k:Ljava/util/LinkedHashMap;

    .line 67
    .line 68
    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Li1/g;->l()Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_2

    .line 76
    .line 77
    iget-object p1, p0, Li1/g;->s:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 78
    .line 79
    iget-object v0, p0, Li1/g;->t:LN0/B;

    .line 80
    .line 81
    invoke-virtual {p1, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    return-void
.end method

.method public final s()V
    .locals 5

    .line 1
    :goto_0
    iget-wide v0, p0, Li1/g;->i:J

    .line 2
    .line 3
    iget-wide v2, p0, Li1/g;->g:J

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    if-lez v4, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Li1/g;->k:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Li1/e;

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Li1/g;->r(Li1/e;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    iput-boolean v0, p0, Li1/g;->p:Z

    .line 31
    .line 32
    return-void
.end method
