.class public final Lr1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr1/u;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lm1/x;Lr1/a;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lr1/a;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr1/a;->c:Ljava/lang/Object;

    iput-object p2, p0, Lr1/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lr1/x;Ljava/io/OutputStream;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lr1/a;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr1/a;->b:Ljava/lang/Object;

    iput-object p2, p0, Lr1/a;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Lr1/x;
    .locals 1

    .line 1
    iget v0, p0, Lr1/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr1/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lr1/x;

    .line 9
    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lr1/a;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lm1/x;

    .line 14
    .line 15
    return-object v0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lr1/e;J)V
    .locals 8

    .line 1
    iget v0, p0, Lr1/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-wide v1, p1, Lr1/e;->b:J

    .line 7
    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    move-wide v5, p2

    .line 11
    invoke-static/range {v1 .. v6}, Lr1/y;->a(JJJ)V

    .line 12
    .line 13
    .line 14
    :cond_0
    :goto_0
    const-wide/16 v0, 0x0

    .line 15
    .line 16
    cmp-long v2, p2, v0

    .line 17
    .line 18
    if-lez v2, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lr1/a;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lr1/x;

    .line 23
    .line 24
    invoke-virtual {v0}, Lr1/x;->f()V

    .line 25
    .line 26
    .line 27
    iget-object v0, p1, Lr1/e;->a:Lr1/r;

    .line 28
    .line 29
    iget v1, v0, Lr1/r;->c:I

    .line 30
    .line 31
    iget v2, v0, Lr1/r;->b:I

    .line 32
    .line 33
    sub-int/2addr v1, v2

    .line 34
    int-to-long v1, v1

    .line 35
    invoke-static {p2, p3, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 36
    .line 37
    .line 38
    move-result-wide v1

    .line 39
    long-to-int v2, v1

    .line 40
    iget v1, v0, Lr1/r;->b:I

    .line 41
    .line 42
    iget-object v3, p0, Lr1/a;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v3, Ljava/io/OutputStream;

    .line 45
    .line 46
    iget-object v4, v0, Lr1/r;->a:[B

    .line 47
    .line 48
    invoke-virtual {v3, v4, v1, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 49
    .line 50
    .line 51
    iget v1, v0, Lr1/r;->b:I

    .line 52
    .line 53
    add-int/2addr v1, v2

    .line 54
    iput v1, v0, Lr1/r;->b:I

    .line 55
    .line 56
    int-to-long v2, v2

    .line 57
    sub-long/2addr p2, v2

    .line 58
    iget-wide v4, p1, Lr1/e;->b:J

    .line 59
    .line 60
    sub-long/2addr v4, v2

    .line 61
    iput-wide v4, p1, Lr1/e;->b:J

    .line 62
    .line 63
    iget v2, v0, Lr1/r;->c:I

    .line 64
    .line 65
    if-ne v1, v2, :cond_0

    .line 66
    .line 67
    invoke-virtual {v0}, Lr1/r;->a()Lr1/r;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iput-object v1, p1, Lr1/e;->a:Lr1/r;

    .line 72
    .line 73
    invoke-static {v0}, Lr1/s;->a(Lr1/r;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    return-void

    .line 78
    :pswitch_0
    iget-wide v2, p1, Lr1/e;->b:J

    .line 79
    .line 80
    const-wide/16 v4, 0x0

    .line 81
    .line 82
    move-wide v6, p2

    .line 83
    invoke-static/range {v2 .. v7}, Lr1/y;->a(JJJ)V

    .line 84
    .line 85
    .line 86
    :goto_1
    const-wide/16 v0, 0x0

    .line 87
    .line 88
    cmp-long v2, p2, v0

    .line 89
    .line 90
    if-lez v2, :cond_5

    .line 91
    .line 92
    iget-object v2, p1, Lr1/e;->a:Lr1/r;

    .line 93
    .line 94
    :goto_2
    const-wide/32 v3, 0x10000

    .line 95
    .line 96
    .line 97
    cmp-long v5, v0, v3

    .line 98
    .line 99
    if-gez v5, :cond_3

    .line 100
    .line 101
    iget v3, v2, Lr1/r;->c:I

    .line 102
    .line 103
    iget v4, v2, Lr1/r;->b:I

    .line 104
    .line 105
    sub-int/2addr v3, v4

    .line 106
    int-to-long v3, v3

    .line 107
    add-long/2addr v0, v3

    .line 108
    cmp-long v3, v0, p2

    .line 109
    .line 110
    if-ltz v3, :cond_2

    .line 111
    .line 112
    move-wide v0, p2

    .line 113
    goto :goto_3

    .line 114
    :cond_2
    iget-object v2, v2, Lr1/r;->f:Lr1/r;

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_3
    :goto_3
    iget-object v2, p0, Lr1/a;->c:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v2, Lm1/x;

    .line 120
    .line 121
    invoke-virtual {v2}, Lr1/c;->i()V

    .line 122
    .line 123
    .line 124
    :try_start_0
    iget-object v3, p0, Lr1/a;->b:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v3, Lr1/a;

    .line 127
    .line 128
    invoke-virtual {v3, p1, v0, v1}, Lr1/a;->b(Lr1/e;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    .line 130
    .line 131
    sub-long/2addr p2, v0

    .line 132
    const/4 v0, 0x1

    .line 133
    invoke-virtual {v2, v0}, Lr1/c;->j(Z)V

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :catchall_0
    move-exception p1

    .line 138
    goto :goto_5

    .line 139
    :catch_0
    move-exception p1

    .line 140
    :try_start_1
    invoke-virtual {v2}, Lr1/c;->k()Z

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    if-nez p2, :cond_4

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_4
    invoke-virtual {v2, p1}, Lm1/x;->l(Ljava/io/IOException;)Ljava/io/IOException;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    :goto_4
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 152
    :goto_5
    const/4 p2, 0x0

    .line 153
    invoke-virtual {v2, p2}, Lr1/c;->j(Z)V

    .line 154
    .line 155
    .line 156
    throw p1

    .line 157
    :cond_5
    return-void

    .line 158
    nop

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final close()V
    .locals 3

    .line 1
    iget v0, p0, Lr1/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr1/a;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/io/OutputStream;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Lr1/a;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lm1/x;

    .line 17
    .line 18
    invoke-virtual {v0}, Lr1/c;->i()V

    .line 19
    .line 20
    .line 21
    :try_start_0
    iget-object v1, p0, Lr1/a;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lr1/a;

    .line 24
    .line 25
    invoke-virtual {v1}, Lr1/a;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-virtual {v0, v1}, Lr1/c;->j(Z)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception v1

    .line 34
    goto :goto_1

    .line 35
    :catch_0
    move-exception v1

    .line 36
    :try_start_1
    invoke-virtual {v0}, Lr1/c;->k()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {v0, v1}, Lm1/x;->l(Ljava/io/IOException;)Ljava/io/IOException;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    :goto_0
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    :goto_1
    const/4 v2, 0x0

    .line 49
    invoke-virtual {v0, v2}, Lr1/c;->j(Z)V

    .line 50
    .line 51
    .line 52
    throw v1

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final flush()V
    .locals 3

    .line 1
    iget v0, p0, Lr1/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr1/a;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/io/OutputStream;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Lr1/a;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lm1/x;

    .line 17
    .line 18
    invoke-virtual {v0}, Lr1/c;->i()V

    .line 19
    .line 20
    .line 21
    :try_start_0
    iget-object v1, p0, Lr1/a;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lr1/a;

    .line 24
    .line 25
    invoke-virtual {v1}, Lr1/a;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-virtual {v0, v1}, Lr1/c;->j(Z)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception v1

    .line 34
    goto :goto_1

    .line 35
    :catch_0
    move-exception v1

    .line 36
    :try_start_1
    invoke-virtual {v0}, Lr1/c;->k()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {v0, v1}, Lm1/x;->l(Ljava/io/IOException;)Ljava/io/IOException;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    :goto_0
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    :goto_1
    const/4 v2, 0x0

    .line 49
    invoke-virtual {v0, v2}, Lr1/c;->j(Z)V

    .line 50
    .line 51
    .line 52
    throw v1

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lr1/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v1, "sink("

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lr1/a;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ljava/io/OutputStream;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ")"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v1, "AsyncTimeout.sink("

    .line 33
    .line 34
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lr1/a;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Lr1/a;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ")"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    return-object v0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
