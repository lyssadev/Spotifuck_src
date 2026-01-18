.class public final Lm1/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr1/v;


# instance fields
.field public final a:Lr1/q;

.field public b:I

.field public c:B

.field public d:I

.field public e:I

.field public f:S


# direct methods
.method public constructor <init>(Lr1/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm1/t;->a:Lr1/q;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Lr1/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lm1/t;->a:Lr1/q;

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
    .locals 0

    .line 1
    return-void
.end method

.method public final e(Lr1/e;J)J
    .locals 7

    .line 1
    const/4 p2, 0x1

    .line 2
    const/4 p3, 0x0

    .line 3
    :goto_0
    iget v0, p0, Lm1/t;->e:I

    .line 4
    .line 5
    const-wide/16 v1, -0x1

    .line 6
    .line 7
    iget-object v3, p0, Lm1/t;->a:Lr1/q;

    .line 8
    .line 9
    if-nez v0, :cond_4

    .line 10
    .line 11
    iget-short v0, p0, Lm1/t;->f:S

    .line 12
    .line 13
    int-to-long v4, v0

    .line 14
    invoke-virtual {v3, v4, v5}, Lr1/q;->q(J)V

    .line 15
    .line 16
    .line 17
    iput-short p3, p0, Lm1/t;->f:S

    .line 18
    .line 19
    iget-byte v0, p0, Lm1/t;->c:B

    .line 20
    .line 21
    and-int/lit8 v0, v0, 0x4

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    return-wide v1

    .line 26
    :cond_0
    iget v0, p0, Lm1/t;->d:I

    .line 27
    .line 28
    invoke-static {v3}, Lm1/u;->m(Lr1/q;)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iput v1, p0, Lm1/t;->e:I

    .line 33
    .line 34
    iput v1, p0, Lm1/t;->b:I

    .line 35
    .line 36
    invoke-virtual {v3}, Lr1/q;->i()B

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    and-int/lit16 v1, v1, 0xff

    .line 41
    .line 42
    int-to-byte v1, v1

    .line 43
    invoke-virtual {v3}, Lr1/q;->i()B

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    and-int/lit16 v2, v2, 0xff

    .line 48
    .line 49
    int-to-byte v2, v2

    .line 50
    iput-byte v2, p0, Lm1/t;->c:B

    .line 51
    .line 52
    sget-object v2, Lm1/u;->e:Ljava/util/logging/Logger;

    .line 53
    .line 54
    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 55
    .line 56
    invoke-virtual {v2, v4}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_1

    .line 61
    .line 62
    iget v4, p0, Lm1/t;->d:I

    .line 63
    .line 64
    iget v5, p0, Lm1/t;->b:I

    .line 65
    .line 66
    iget-byte v6, p0, Lm1/t;->c:B

    .line 67
    .line 68
    invoke-static {p2, v4, v5, v1, v6}, Lm1/f;->a(ZIIBB)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v2, v4}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    invoke-virtual {v3}, Lr1/q;->l()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    const v3, 0x7fffffff

    .line 80
    .line 81
    .line 82
    and-int/2addr v2, v3

    .line 83
    iput v2, p0, Lm1/t;->d:I

    .line 84
    .line 85
    const/16 v3, 0x9

    .line 86
    .line 87
    const/4 v4, 0x0

    .line 88
    if-ne v1, v3, :cond_3

    .line 89
    .line 90
    if-ne v2, v0, :cond_2

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    new-array p1, p3, [Ljava/lang/Object;

    .line 94
    .line 95
    const-string p2, "TYPE_CONTINUATION streamId changed"

    .line 96
    .line 97
    invoke-static {p2, p1}, Lm1/f;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    throw v4

    .line 101
    :cond_3
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    new-array p2, p2, [Ljava/lang/Object;

    .line 106
    .line 107
    aput-object p1, p2, p3

    .line 108
    .line 109
    const-string p1, "%s != TYPE_CONTINUATION"

    .line 110
    .line 111
    invoke-static {p1, p2}, Lm1/f;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    throw v4

    .line 115
    :cond_4
    int-to-long p2, v0

    .line 116
    const-wide/16 v4, 0x2000

    .line 117
    .line 118
    invoke-static {v4, v5, p2, p3}, Ljava/lang/Math;->min(JJ)J

    .line 119
    .line 120
    .line 121
    move-result-wide p2

    .line 122
    invoke-virtual {v3, p1, p2, p3}, Lr1/q;->e(Lr1/e;J)J

    .line 123
    .line 124
    .line 125
    move-result-wide p1

    .line 126
    cmp-long p3, p1, v1

    .line 127
    .line 128
    if-nez p3, :cond_5

    .line 129
    .line 130
    return-wide v1

    .line 131
    :cond_5
    iget p3, p0, Lm1/t;->e:I

    .line 132
    .line 133
    int-to-long v0, p3

    .line 134
    sub-long/2addr v0, p1

    .line 135
    long-to-int p3, v0

    .line 136
    iput p3, p0, Lm1/t;->e:I

    .line 137
    .line 138
    return-wide p1
.end method
