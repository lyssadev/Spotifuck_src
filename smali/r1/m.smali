.class public final Lr1/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr1/v;


# instance fields
.field public final a:Lr1/q;

.field public final b:Ljava/util/zip/Inflater;

.field public c:I

.field public d:Z


# direct methods
.method public constructor <init>(Lr1/q;Ljava/util/zip/Inflater;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr1/m;->a:Lr1/q;

    .line 5
    .line 6
    iput-object p2, p0, Lr1/m;->b:Ljava/util/zip/Inflater;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Lr1/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lr1/m;->a:Lr1/q;

    .line 2
    .line 3
    iget-object v0, v0, Lr1/q;->b:Lr1/v;

    .line 4
    .line 5
    invoke-interface {v0}, Lr1/v;->a()Lr1/x;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr1/m;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lr1/m;->b:Ljava/util/zip/Inflater;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lr1/m;->d:Z

    .line 13
    .line 14
    iget-object v0, p0, Lr1/m;->a:Lr1/q;

    .line 15
    .line 16
    invoke-virtual {v0}, Lr1/q;->close()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final e(Lr1/e;J)J
    .locals 7

    .line 1
    iget-boolean p2, p0, Lr1/m;->d:Z

    .line 2
    .line 3
    if-nez p2, :cond_a

    .line 4
    .line 5
    :goto_0
    iget-object p2, p0, Lr1/m;->b:Ljava/util/zip/Inflater;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/util/zip/Inflater;->needsInput()Z

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    iget-object v0, p0, Lr1/m;->a:Lr1/q;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-nez p3, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    iget p3, p0, Lr1/m;->c:I

    .line 19
    .line 20
    if-nez p3, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    invoke-virtual {p2}, Ljava/util/zip/Inflater;->getRemaining()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    sub-int/2addr p3, v3

    .line 28
    iget v3, p0, Lr1/m;->c:I

    .line 29
    .line 30
    sub-int/2addr v3, p3

    .line 31
    iput v3, p0, Lr1/m;->c:I

    .line 32
    .line 33
    int-to-long v3, p3

    .line 34
    invoke-virtual {v0, v3, v4}, Lr1/q;->q(J)V

    .line 35
    .line 36
    .line 37
    :goto_1
    invoke-virtual {p2}, Ljava/util/zip/Inflater;->getRemaining()I

    .line 38
    .line 39
    .line 40
    move-result p3

    .line 41
    if-nez p3, :cond_9

    .line 42
    .line 43
    invoke-virtual {v0}, Lr1/q;->f()Z

    .line 44
    .line 45
    .line 46
    move-result p3

    .line 47
    if-eqz p3, :cond_2

    .line 48
    .line 49
    const/4 v2, 0x1

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    iget-object p3, v0, Lr1/q;->a:Lr1/e;

    .line 52
    .line 53
    iget-object p3, p3, Lr1/e;->a:Lr1/r;

    .line 54
    .line 55
    iget v3, p3, Lr1/r;->c:I

    .line 56
    .line 57
    iget v4, p3, Lr1/r;->b:I

    .line 58
    .line 59
    sub-int/2addr v3, v4

    .line 60
    iput v3, p0, Lr1/m;->c:I

    .line 61
    .line 62
    iget-object p3, p3, Lr1/r;->a:[B

    .line 63
    .line 64
    invoke-virtual {p2, p3, v4, v3}, Ljava/util/zip/Inflater;->setInput([BII)V

    .line 65
    .line 66
    .line 67
    :goto_2
    :try_start_0
    invoke-virtual {p1, v1}, Lr1/e;->t(I)Lr1/r;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    iget v1, p3, Lr1/r;->c:I

    .line 72
    .line 73
    rsub-int v1, v1, 0x2000

    .line 74
    .line 75
    int-to-long v3, v1

    .line 76
    const-wide/16 v5, 0x2000

    .line 77
    .line 78
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 79
    .line 80
    .line 81
    move-result-wide v3

    .line 82
    long-to-int v1, v3

    .line 83
    iget-object v3, p3, Lr1/r;->a:[B

    .line 84
    .line 85
    iget v4, p3, Lr1/r;->c:I

    .line 86
    .line 87
    invoke-virtual {p2, v3, v4, v1}, Ljava/util/zip/Inflater;->inflate([BII)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-lez v1, :cond_3

    .line 92
    .line 93
    iget p2, p3, Lr1/r;->c:I

    .line 94
    .line 95
    add-int/2addr p2, v1

    .line 96
    iput p2, p3, Lr1/r;->c:I

    .line 97
    .line 98
    iget-wide p2, p1, Lr1/e;->b:J

    .line 99
    .line 100
    int-to-long v0, v1

    .line 101
    add-long/2addr p2, v0

    .line 102
    iput-wide p2, p1, Lr1/e;->b:J

    .line 103
    .line 104
    return-wide v0

    .line 105
    :catch_0
    move-exception p1

    .line 106
    goto :goto_5

    .line 107
    :cond_3
    invoke-virtual {p2}, Ljava/util/zip/Inflater;->finished()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-nez v1, :cond_6

    .line 112
    .line 113
    invoke-virtual {p2}, Ljava/util/zip/Inflater;->needsDictionary()Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-eqz v1, :cond_4

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_4
    if-nez v2, :cond_5

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_5
    new-instance p1, Ljava/io/EOFException;

    .line 124
    .line 125
    const-string p2, "source exhausted prematurely"

    .line 126
    .line 127
    invoke-direct {p1, p2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw p1

    .line 131
    :cond_6
    :goto_3
    iget v1, p0, Lr1/m;->c:I

    .line 132
    .line 133
    if-nez v1, :cond_7

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_7
    invoke-virtual {p2}, Ljava/util/zip/Inflater;->getRemaining()I

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    sub-int/2addr v1, p2

    .line 141
    iget p2, p0, Lr1/m;->c:I

    .line 142
    .line 143
    sub-int/2addr p2, v1

    .line 144
    iput p2, p0, Lr1/m;->c:I

    .line 145
    .line 146
    int-to-long v1, v1

    .line 147
    invoke-virtual {v0, v1, v2}, Lr1/q;->q(J)V

    .line 148
    .line 149
    .line 150
    :goto_4
    iget p2, p3, Lr1/r;->b:I

    .line 151
    .line 152
    iget v0, p3, Lr1/r;->c:I

    .line 153
    .line 154
    if-ne p2, v0, :cond_8

    .line 155
    .line 156
    invoke-virtual {p3}, Lr1/r;->a()Lr1/r;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    iput-object p2, p1, Lr1/e;->a:Lr1/r;

    .line 161
    .line 162
    invoke-static {p3}, Lr1/s;->a(Lr1/r;)V
    :try_end_0
    .catch Ljava/util/zip/DataFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 163
    .line 164
    .line 165
    :cond_8
    const-wide/16 p1, -0x1

    .line 166
    .line 167
    return-wide p1

    .line 168
    :goto_5
    new-instance p2, Ljava/io/IOException;

    .line 169
    .line 170
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 171
    .line 172
    .line 173
    throw p2

    .line 174
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 175
    .line 176
    const-string p2, "?"

    .line 177
    .line 178
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw p1

    .line 182
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 183
    .line 184
    const-string p2, "closed"

    .line 185
    .line 186
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    throw p1
.end method
