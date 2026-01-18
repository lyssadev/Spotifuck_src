.class public final Lp1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:[B

.field public static final f:[Ljava/lang/String;

.field public static final g:[Ljava/lang/String;

.field public static final h:Lp1/a;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final b:Ljava/util/concurrent/CountDownLatch;

.field public c:[B

.field public d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    const/16 v1, 0x2a

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-byte v1, v0, v2

    .line 8
    .line 9
    sput-object v0, Lp1/a;->e:[B

    .line 10
    .line 11
    new-array v0, v2, [Ljava/lang/String;

    .line 12
    .line 13
    sput-object v0, Lp1/a;->f:[Ljava/lang/String;

    .line 14
    .line 15
    const-string v0, "*"

    .line 16
    .line 17
    filled-new-array {v0}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lp1/a;->g:[Ljava/lang/String;

    .line 22
    .line 23
    new-instance v0, Lp1/a;

    .line 24
    .line 25
    invoke-direct {v0}, Lp1/a;-><init>()V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lp1/a;->h:Lp1/a;

    .line 29
    .line 30
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lp1/a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lp1/a;->b:Ljava/util/concurrent/CountDownLatch;

    .line 19
    .line 20
    return-void
.end method

.method public static a([B[[BI)Ljava/lang/String;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    array-length v2, v0

    .line 6
    const/4 v4, 0x0

    .line 7
    :goto_0
    if-ge v4, v2, :cond_c

    .line 8
    .line 9
    add-int v5, v4, v2

    .line 10
    .line 11
    div-int/lit8 v5, v5, 0x2

    .line 12
    .line 13
    :goto_1
    const/4 v6, -0x1

    .line 14
    const/16 v7, 0xa

    .line 15
    .line 16
    if-le v5, v6, :cond_0

    .line 17
    .line 18
    aget-byte v8, v0, v5

    .line 19
    .line 20
    if-eq v8, v7, :cond_0

    .line 21
    .line 22
    add-int/lit8 v5, v5, -0x1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    add-int/lit8 v8, v5, 0x1

    .line 26
    .line 27
    const/4 v9, 0x1

    .line 28
    const/4 v10, 0x1

    .line 29
    :goto_2
    add-int v11, v8, v10

    .line 30
    .line 31
    aget-byte v12, v0, v11

    .line 32
    .line 33
    if-eq v12, v7, :cond_1

    .line 34
    .line 35
    add-int/lit8 v10, v10, 0x1

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_1
    sub-int v7, v11, v8

    .line 39
    .line 40
    move/from16 v12, p2

    .line 41
    .line 42
    const/4 v10, 0x0

    .line 43
    const/4 v13, 0x0

    .line 44
    const/4 v14, 0x0

    .line 45
    :goto_3
    if-eqz v10, :cond_2

    .line 46
    .line 47
    const/16 v10, 0x2e

    .line 48
    .line 49
    const/4 v15, 0x0

    .line 50
    goto :goto_4

    .line 51
    :cond_2
    aget-object v15, v1, v12

    .line 52
    .line 53
    aget-byte v15, v15, v13

    .line 54
    .line 55
    and-int/lit16 v15, v15, 0xff

    .line 56
    .line 57
    move/from16 v17, v15

    .line 58
    .line 59
    move v15, v10

    .line 60
    move/from16 v10, v17

    .line 61
    .line 62
    :goto_4
    add-int v16, v8, v14

    .line 63
    .line 64
    aget-byte v3, v0, v16

    .line 65
    .line 66
    and-int/lit16 v3, v3, 0xff

    .line 67
    .line 68
    sub-int/2addr v10, v3

    .line 69
    if-eqz v10, :cond_3

    .line 70
    .line 71
    goto :goto_5

    .line 72
    :cond_3
    add-int/lit8 v14, v14, 0x1

    .line 73
    .line 74
    add-int/lit8 v13, v13, 0x1

    .line 75
    .line 76
    if-ne v14, v7, :cond_4

    .line 77
    .line 78
    goto :goto_5

    .line 79
    :cond_4
    aget-object v3, v1, v12

    .line 80
    .line 81
    array-length v3, v3

    .line 82
    if-ne v3, v13, :cond_b

    .line 83
    .line 84
    array-length v3, v1

    .line 85
    sub-int/2addr v3, v9

    .line 86
    if-ne v12, v3, :cond_a

    .line 87
    .line 88
    :goto_5
    if-gez v10, :cond_5

    .line 89
    .line 90
    :goto_6
    move v2, v5

    .line 91
    goto :goto_0

    .line 92
    :cond_5
    if-lez v10, :cond_6

    .line 93
    .line 94
    :goto_7
    add-int/lit8 v4, v11, 0x1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_6
    sub-int v3, v7, v14

    .line 98
    .line 99
    aget-object v6, v1, v12

    .line 100
    .line 101
    array-length v6, v6

    .line 102
    sub-int/2addr v6, v13

    .line 103
    :goto_8
    add-int/lit8 v12, v12, 0x1

    .line 104
    .line 105
    array-length v9, v1

    .line 106
    if-ge v12, v9, :cond_7

    .line 107
    .line 108
    aget-object v9, v1, v12

    .line 109
    .line 110
    array-length v9, v9

    .line 111
    add-int/2addr v6, v9

    .line 112
    goto :goto_8

    .line 113
    :cond_7
    if-ge v6, v3, :cond_8

    .line 114
    .line 115
    goto :goto_6

    .line 116
    :cond_8
    if-le v6, v3, :cond_9

    .line 117
    .line 118
    goto :goto_7

    .line 119
    :cond_9
    new-instance v1, Ljava/lang/String;

    .line 120
    .line 121
    sget-object v2, Lh1/c;->d:Ljava/nio/charset/Charset;

    .line 122
    .line 123
    invoke-direct {v1, v0, v8, v7, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 124
    .line 125
    .line 126
    goto :goto_9

    .line 127
    :cond_a
    add-int/lit8 v12, v12, 0x1

    .line 128
    .line 129
    const/4 v10, 0x1

    .line 130
    const/4 v13, -0x1

    .line 131
    goto :goto_3

    .line 132
    :cond_b
    move v10, v15

    .line 133
    goto :goto_3

    .line 134
    :cond_c
    const/4 v1, 0x0

    .line 135
    :goto_9
    return-object v1
.end method


# virtual methods
.method public final b()V
    .locals 3

    .line 1
    const-class v0, Lp1/a;

    .line 2
    .line 3
    const-string v1, "publicsuffixes.gz"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v1, Lr1/l;

    .line 13
    .line 14
    invoke-static {v0}, Lr1/o;->b(Ljava/io/InputStream;)Lr1/b;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-direct {v1, v0}, Lr1/l;-><init>(Lr1/v;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lr1/q;

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lr1/q;-><init>(Lr1/v;)V

    .line 24
    .line 25
    .line 26
    :try_start_0
    invoke-virtual {v0}, Lr1/q;->l()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    new-array v1, v1, [B

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lr1/q;->k([B)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lr1/q;->l()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    new-array v2, v2, [B

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Lr1/q;->k([B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Lh1/c;->c(Ljava/io/Closeable;)V

    .line 45
    .line 46
    .line 47
    monitor-enter p0

    .line 48
    :try_start_1
    iput-object v1, p0, Lp1/a;->c:[B

    .line 49
    .line 50
    iput-object v2, p0, Lp1/a;->d:[B

    .line 51
    .line 52
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    iget-object v0, p0, Lp1/a;->b:Ljava/util/concurrent/CountDownLatch;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 61
    throw v0

    .line 62
    :catchall_1
    move-exception v1

    .line 63
    invoke-static {v0}, Lh1/c;->c(Ljava/io/Closeable;)V

    .line 64
    .line 65
    .line 66
    throw v1
.end method
