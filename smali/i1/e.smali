.class public final Li1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:[J

.field public final c:[Ljava/io/File;

.field public final d:[Ljava/io/File;

.field public e:Z

.field public f:Li1/d;

.field public g:J

.field public final synthetic h:Li1/g;


# direct methods
.method public constructor <init>(Li1/g;Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li1/e;->h:Li1/g;

    .line 5
    .line 6
    iput-object p2, p0, Li1/e;->a:Ljava/lang/String;

    .line 7
    .line 8
    iget v0, p1, Li1/g;->h:I

    .line 9
    .line 10
    new-array v1, v0, [J

    .line 11
    .line 12
    iput-object v1, p0, Li1/e;->b:[J

    .line 13
    .line 14
    new-array v1, v0, [Ljava/io/File;

    .line 15
    .line 16
    iput-object v1, p0, Li1/e;->c:[Ljava/io/File;

    .line 17
    .line 18
    new-array v0, v0, [Ljava/io/File;

    .line 19
    .line 20
    iput-object v0, p0, Li1/e;->d:[Ljava/io/File;

    .line 21
    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/16 p2, 0x2e

    .line 28
    .line 29
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    const/4 v1, 0x0

    .line 37
    :goto_0
    iget v2, p1, Li1/g;->h:I

    .line 38
    .line 39
    if-ge v1, v2, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, Li1/e;->c:[Ljava/io/File;

    .line 45
    .line 46
    new-instance v3, Ljava/io/File;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    iget-object v5, p1, Li1/g;->b:Ljava/io/File;

    .line 53
    .line 54
    invoke-direct {v3, v5, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    aput-object v3, v2, v1

    .line 58
    .line 59
    const-string v2, ".tmp"

    .line 60
    .line 61
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    iget-object v2, p0, Li1/e;->d:[Ljava/io/File;

    .line 65
    .line 66
    new-instance v3, Ljava/io/File;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-direct {v3, v5, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    aput-object v3, v2, v1

    .line 76
    .line 77
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 78
    .line 79
    .line 80
    add-int/lit8 v1, v1, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Li1/f;
    .locals 10

    .line 1
    iget-object v6, p0, Li1/e;->h:Li1/g;

    .line 2
    .line 3
    invoke-static {v6}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    iget v0, v6, Li1/g;->h:I

    .line 10
    .line 11
    new-array v7, v0, [Lr1/v;

    .line 12
    .line 13
    const/4 v8, 0x0

    .line 14
    const/4 v0, 0x0

    .line 15
    :goto_0
    :try_start_0
    iget v1, v6, Li1/g;->h:I

    .line 16
    .line 17
    if-ge v0, v1, :cond_1

    .line 18
    .line 19
    iget-object v1, v6, Li1/g;->a:Ln1/a;

    .line 20
    .line 21
    iget-object v2, p0, Li1/e;->c:[Ljava/io/File;

    .line 22
    .line 23
    aget-object v2, v2, v0

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    sget-object v1, Lr1/o;->a:Ljava/util/logging/Logger;

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    new-instance v1, Ljava/io/FileInputStream;

    .line 33
    .line 34
    invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v1}, Lr1/o;->b(Ljava/io/InputStream;)Lr1/b;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    aput-object v1, v7, v0

    .line 42
    .line 43
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 47
    .line 48
    const-string v1, "file == null"

    .line 49
    .line 50
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v0

    .line 54
    :catch_0
    nop

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    new-instance v9, Li1/f;

    .line 57
    .line 58
    iget-object v2, p0, Li1/e;->a:Ljava/lang/String;

    .line 59
    .line 60
    iget-wide v3, p0, Li1/e;->g:J

    .line 61
    .line 62
    move-object v0, v9

    .line 63
    move-object v1, v6

    .line 64
    move-object v5, v7

    .line 65
    invoke-direct/range {v0 .. v5}, Li1/f;-><init>(Li1/g;Ljava/lang/String;J[Lr1/v;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    .line 67
    .line 68
    return-object v9

    .line 69
    :goto_1
    iget v0, v6, Li1/g;->h:I

    .line 70
    .line 71
    if-ge v8, v0, :cond_2

    .line 72
    .line 73
    aget-object v0, v7, v8

    .line 74
    .line 75
    if-eqz v0, :cond_2

    .line 76
    .line 77
    invoke-static {v0}, Lh1/c;->c(Ljava/io/Closeable;)V

    .line 78
    .line 79
    .line 80
    add-int/lit8 v8, v8, 0x1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    :try_start_1
    invoke-virtual {v6, p0}, Li1/g;->r(Li1/e;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 84
    .line 85
    .line 86
    :catch_1
    const/4 v0, 0x0

    .line 87
    return-object v0

    .line 88
    :cond_3
    new-instance v0, Ljava/lang/AssertionError;

    .line 89
    .line 90
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 91
    .line 92
    .line 93
    throw v0
.end method
