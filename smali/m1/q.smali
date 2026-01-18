.class public final Lm1/q;
.super Lh1/a;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lm1/q;[Ljava/lang/Object;LK/j;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lm1/q;->b:I

    .line 5
    iput-object p1, p0, Lm1/q;->c:Ljava/lang/Object;

    iput-object p3, p0, Lm1/q;->d:Ljava/lang/Object;

    const-string p1, "OkHttp %s ACK Settings"

    invoke-direct {p0, p1, p2}, Lh1/a;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lm1/q;[Ljava/lang/Object;Lm1/y;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lm1/q;->b:I

    .line 4
    iput-object p1, p0, Lm1/q;->c:Ljava/lang/Object;

    iput-object p3, p0, Lm1/q;->d:Ljava/lang/Object;

    const-string p1, "OkHttp %s stream %d"

    invoke-direct {p0, p1, p2}, Lh1/a;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lm1/s;Lm1/u;)V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, Lm1/q;->b:I

    const/4 v0, 0x0

    .line 1
    iput-object p1, p0, Lm1/q;->c:Ljava/lang/Object;

    .line 2
    iget-object p1, p1, Lm1/s;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v0

    const-string p1, "OkHttp %s"

    invoke-direct {p0, p1, v1}, Lh1/a;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3
    iput-object p2, p0, Lm1/q;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    iget-object v1, p0, Lm1/q;->d:Ljava/lang/Object;

    .line 3
    .line 4
    iget-object v2, p0, Lm1/q;->c:Ljava/lang/Object;

    .line 5
    .line 6
    iget v3, p0, Lm1/q;->b:I

    .line 7
    .line 8
    packed-switch v3, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast v2, Lm1/s;

    .line 12
    .line 13
    check-cast v1, Lm1/u;

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {v1, p0}, Lm1/u;->h(Lm1/q;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    const/4 v3, 0x0

    .line 19
    invoke-virtual {v1, v3, p0}, Lm1/u;->g(ZLm1/q;)Z

    .line 20
    .line 21
    .line 22
    move-result v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x1

    .line 27
    const/4 v3, 0x6

    .line 28
    :try_start_1
    invoke-virtual {v2, v0, v3}, Lm1/s;->f(II)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 29
    .line 30
    .line 31
    :catch_0
    :goto_1
    invoke-static {v1}, Lh1/c;->c(Ljava/io/Closeable;)V

    .line 32
    .line 33
    .line 34
    goto :goto_2

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    const/4 v3, 0x3

    .line 37
    :try_start_2
    invoke-virtual {v2, v3, v3}, Lm1/s;->f(II)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 38
    .line 39
    .line 40
    :catch_1
    invoke-static {v1}, Lh1/c;->c(Ljava/io/Closeable;)V

    .line 41
    .line 42
    .line 43
    throw v0

    .line 44
    :catch_2
    :try_start_3
    invoke-virtual {v2, v0, v0}, Lm1/s;->f(II)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :goto_2
    return-void

    .line 49
    :pswitch_0
    check-cast v2, Lm1/q;

    .line 50
    .line 51
    :try_start_4
    iget-object v0, v2, Lm1/q;->c:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lm1/s;

    .line 54
    .line 55
    iget-object v0, v0, Lm1/s;->r:Lm1/z;

    .line 56
    .line 57
    check-cast v1, LK/j;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Lm1/z;->f(LK/j;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 60
    .line 61
    .line 62
    goto :goto_3

    .line 63
    :catch_3
    iget-object v0, v2, Lm1/q;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, Lm1/s;

    .line 66
    .line 67
    sget-object v1, Lm1/s;->u:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 68
    .line 69
    invoke-virtual {v0}, Lm1/s;->g()V

    .line 70
    .line 71
    .line 72
    :goto_3
    return-void

    .line 73
    :pswitch_1
    check-cast v1, Lm1/y;

    .line 74
    .line 75
    check-cast v2, Lm1/q;

    .line 76
    .line 77
    :try_start_5
    iget-object v3, v2, Lm1/q;->c:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v3, Lm1/s;

    .line 80
    .line 81
    iget-object v3, v3, Lm1/s;->b:Lm1/o;

    .line 82
    .line 83
    invoke-virtual {v3, v1}, Lm1/o;->b(Lm1/y;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 84
    .line 85
    .line 86
    goto :goto_4

    .line 87
    :catch_4
    move-exception v3

    .line 88
    sget-object v4, Lo1/g;->a:Lo1/g;

    .line 89
    .line 90
    new-instance v5, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    const-string v6, "Http2Connection.Listener failure for "

    .line 93
    .line 94
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    iget-object v2, v2, Lm1/q;->c:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v2, Lm1/s;

    .line 100
    .line 101
    iget-object v2, v2, Lm1/s;->d:Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    const/4 v5, 0x4

    .line 111
    invoke-virtual {v4, v5, v2, v3}, Lo1/g;->k(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    :try_start_6
    invoke-virtual {v1, v0}, Lm1/y;->c(I)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 115
    .line 116
    .line 117
    :catch_5
    :goto_4
    return-void

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
