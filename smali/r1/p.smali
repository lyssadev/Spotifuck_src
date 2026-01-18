.class public final Lr1/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr1/f;


# instance fields
.field public final a:Lr1/e;

.field public final b:Lr1/u;

.field public c:Z


# direct methods
.method public constructor <init>(Lr1/u;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lr1/e;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lr1/p;->a:Lr1/e;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iput-object p1, p0, Lr1/p;->b:Lr1/u;

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 17
    .line 18
    const-string v0, "sink == null"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1
.end method


# virtual methods
.method public final a()Lr1/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lr1/p;->b:Lr1/u;

    .line 2
    .line 3
    invoke-interface {v0}, Lr1/u;->a()Lr1/x;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final b(Lr1/e;J)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr1/p;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lr1/p;->a:Lr1/e;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2, p3}, Lr1/e;->b(Lr1/e;J)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lr1/p;->f()Lr1/f;

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string p2, "closed"

    .line 17
    .line 18
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1
.end method

.method public final c(Ljava/lang/String;)Lr1/f;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lr1/p;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lr1/p;->a:Lr1/e;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v0, p1, v2, v1}, Lr1/e;->y(Ljava/lang/String;II)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lr1/p;->f()Lr1/f;

    .line 16
    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "closed"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1
.end method

.method public final close()V
    .locals 7

    .line 1
    iget-object v0, p0, Lr1/p;->b:Lr1/u;

    .line 2
    .line 3
    iget-boolean v1, p0, Lr1/p;->c:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    iget-object v1, p0, Lr1/p;->a:Lr1/e;

    .line 9
    .line 10
    iget-wide v2, v1, Lr1/e;->b:J

    .line 11
    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    cmp-long v6, v2, v4

    .line 15
    .line 16
    if-lez v6, :cond_1

    .line 17
    .line 18
    invoke-interface {v0, v1, v2, v3}, Lr1/u;->b(Lr1/e;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception v1

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 25
    :goto_1
    :try_start_1
    invoke-interface {v0}, Lr1/u;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 26
    .line 27
    .line 28
    goto :goto_2

    .line 29
    :catchall_1
    move-exception v0

    .line 30
    if-nez v1, :cond_2

    .line 31
    .line 32
    move-object v1, v0

    .line 33
    :cond_2
    :goto_2
    const/4 v0, 0x1

    .line 34
    iput-boolean v0, p0, Lr1/p;->c:Z

    .line 35
    .line 36
    if-nez v1, :cond_3

    .line 37
    .line 38
    return-void

    .line 39
    :cond_3
    sget-object v0, Lr1/y;->a:Ljava/nio/charset/Charset;

    .line 40
    .line 41
    throw v1
.end method

.method public final d(I)Lr1/f;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr1/p;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lr1/p;->a:Lr1/e;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lr1/e;->v(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lr1/p;->f()Lr1/f;

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "closed"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1
.end method

.method public final f()Lr1/f;
    .locals 8

    .line 1
    iget-boolean v0, p0, Lr1/p;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Lr1/p;->a:Lr1/e;

    .line 6
    .line 7
    iget-wide v1, v0, Lr1/e;->b:J

    .line 8
    .line 9
    const-wide/16 v3, 0x0

    .line 10
    .line 11
    cmp-long v5, v1, v3

    .line 12
    .line 13
    if-nez v5, :cond_0

    .line 14
    .line 15
    move-wide v1, v3

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v5, v0, Lr1/e;->a:Lr1/r;

    .line 18
    .line 19
    iget-object v5, v5, Lr1/r;->g:Lr1/r;

    .line 20
    .line 21
    iget v6, v5, Lr1/r;->c:I

    .line 22
    .line 23
    const/16 v7, 0x2000

    .line 24
    .line 25
    if-ge v6, v7, :cond_1

    .line 26
    .line 27
    iget-boolean v7, v5, Lr1/r;->e:Z

    .line 28
    .line 29
    if-eqz v7, :cond_1

    .line 30
    .line 31
    iget v5, v5, Lr1/r;->b:I

    .line 32
    .line 33
    sub-int/2addr v6, v5

    .line 34
    int-to-long v5, v6

    .line 35
    sub-long/2addr v1, v5

    .line 36
    :cond_1
    :goto_0
    cmp-long v5, v1, v3

    .line 37
    .line 38
    if-lez v5, :cond_2

    .line 39
    .line 40
    iget-object v3, p0, Lr1/p;->b:Lr1/u;

    .line 41
    .line 42
    invoke-interface {v3, v0, v1, v2}, Lr1/u;->b(Lr1/e;J)V

    .line 43
    .line 44
    .line 45
    :cond_2
    return-object p0

    .line 46
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string v1, "closed"

    .line 49
    .line 50
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v0
.end method

.method public final flush()V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lr1/p;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lr1/p;->a:Lr1/e;

    .line 6
    .line 7
    iget-wide v1, v0, Lr1/e;->b:J

    .line 8
    .line 9
    const-wide/16 v3, 0x0

    .line 10
    .line 11
    iget-object v5, p0, Lr1/p;->b:Lr1/u;

    .line 12
    .line 13
    cmp-long v6, v1, v3

    .line 14
    .line 15
    if-lez v6, :cond_0

    .line 16
    .line 17
    invoke-interface {v5, v0, v1, v2}, Lr1/u;->b(Lr1/e;J)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-interface {v5}, Lr1/u;->flush()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v1, "closed"

    .line 27
    .line 28
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0
.end method

.method public final g([B)Lr1/f;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lr1/p;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lr1/p;->a:Lr1/e;

    .line 6
    .line 7
    array-length v1, p1

    .line 8
    invoke-virtual {v0, p1, v1}, Lr1/e;->u([BI)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lr1/p;->f()Lr1/f;

    .line 12
    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const-string v0, "closed"

    .line 18
    .line 19
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public final h(J)Lr1/f;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr1/p;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lr1/p;->a:Lr1/e;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Lr1/e;->w(J)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lr1/p;->f()Lr1/f;

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string p2, "closed"

    .line 17
    .line 18
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1
.end method

.method public final i(I)Lr1/f;
    .locals 8

    .line 1
    iget-boolean v0, p0, Lr1/p;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lr1/p;->a:Lr1/e;

    .line 6
    .line 7
    const/4 v1, 0x4

    .line 8
    invoke-virtual {v0, v1}, Lr1/e;->t(I)Lr1/r;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    iget v3, v2, Lr1/r;->c:I

    .line 13
    .line 14
    add-int/lit8 v4, v3, 0x1

    .line 15
    .line 16
    ushr-int/lit8 v5, p1, 0x18

    .line 17
    .line 18
    and-int/lit16 v5, v5, 0xff

    .line 19
    .line 20
    int-to-byte v5, v5

    .line 21
    iget-object v6, v2, Lr1/r;->a:[B

    .line 22
    .line 23
    aput-byte v5, v6, v3

    .line 24
    .line 25
    add-int/lit8 v5, v3, 0x2

    .line 26
    .line 27
    ushr-int/lit8 v7, p1, 0x10

    .line 28
    .line 29
    and-int/lit16 v7, v7, 0xff

    .line 30
    .line 31
    int-to-byte v7, v7

    .line 32
    aput-byte v7, v6, v4

    .line 33
    .line 34
    add-int/lit8 v4, v3, 0x3

    .line 35
    .line 36
    ushr-int/lit8 v7, p1, 0x8

    .line 37
    .line 38
    and-int/lit16 v7, v7, 0xff

    .line 39
    .line 40
    int-to-byte v7, v7

    .line 41
    aput-byte v7, v6, v5

    .line 42
    .line 43
    add-int/2addr v3, v1

    .line 44
    and-int/lit16 p1, p1, 0xff

    .line 45
    .line 46
    int-to-byte p1, p1

    .line 47
    aput-byte p1, v6, v4

    .line 48
    .line 49
    iput v3, v2, Lr1/r;->c:I

    .line 50
    .line 51
    iget-wide v1, v0, Lr1/e;->b:J

    .line 52
    .line 53
    const-wide/16 v3, 0x4

    .line 54
    .line 55
    add-long/2addr v1, v3

    .line 56
    iput-wide v1, v0, Lr1/e;->b:J

    .line 57
    .line 58
    invoke-virtual {p0}, Lr1/p;->f()Lr1/f;

    .line 59
    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string v0, "closed"

    .line 65
    .line 66
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p1
.end method

.method public final isOpen()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr1/p;->c:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "buffer("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lr1/p;->b:Lr1/u;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ")"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method public final write(Ljava/nio/ByteBuffer;)I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr1/p;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lr1/p;->a:Lr1/e;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lr1/e;->write(Ljava/nio/ByteBuffer;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {p0}, Lr1/p;->f()Lr1/f;

    .line 12
    .line 13
    .line 14
    return p1

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const-string v0, "closed"

    .line 18
    .line 19
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method
