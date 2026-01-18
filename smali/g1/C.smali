.class public final Lg1/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final a:Lg1/A;

.field public final b:Lg1/y;

.field public final c:I

.field public final d:Ljava/lang/String;

.field public final e:Lg1/r;

.field public final f:Lg1/s;

.field public final g:Lg1/E;

.field public final h:Lg1/C;

.field public final i:Lg1/C;

.field public final j:Lg1/C;

.field public final k:J

.field public final l:J

.field public volatile m:Lg1/j;


# direct methods
.method public constructor <init>(Lg1/B;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lg1/B;->a:Lg1/A;

    .line 5
    .line 6
    iput-object v0, p0, Lg1/C;->a:Lg1/A;

    .line 7
    .line 8
    iget-object v0, p1, Lg1/B;->b:Lg1/y;

    .line 9
    .line 10
    iput-object v0, p0, Lg1/C;->b:Lg1/y;

    .line 11
    .line 12
    iget v0, p1, Lg1/B;->c:I

    .line 13
    .line 14
    iput v0, p0, Lg1/C;->c:I

    .line 15
    .line 16
    iget-object v0, p1, Lg1/B;->d:Ljava/lang/String;

    .line 17
    .line 18
    iput-object v0, p0, Lg1/C;->d:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v0, p1, Lg1/B;->e:Lg1/r;

    .line 21
    .line 22
    iput-object v0, p0, Lg1/C;->e:Lg1/r;

    .line 23
    .line 24
    iget-object v0, p1, Lg1/B;->f:LA/b;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    new-instance v1, Lg1/s;

    .line 30
    .line 31
    invoke-direct {v1, v0}, Lg1/s;-><init>(LA/b;)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Lg1/C;->f:Lg1/s;

    .line 35
    .line 36
    iget-object v0, p1, Lg1/B;->g:Lg1/E;

    .line 37
    .line 38
    iput-object v0, p0, Lg1/C;->g:Lg1/E;

    .line 39
    .line 40
    iget-object v0, p1, Lg1/B;->h:Lg1/C;

    .line 41
    .line 42
    iput-object v0, p0, Lg1/C;->h:Lg1/C;

    .line 43
    .line 44
    iget-object v0, p1, Lg1/B;->i:Lg1/C;

    .line 45
    .line 46
    iput-object v0, p0, Lg1/C;->i:Lg1/C;

    .line 47
    .line 48
    iget-object v0, p1, Lg1/B;->j:Lg1/C;

    .line 49
    .line 50
    iput-object v0, p0, Lg1/C;->j:Lg1/C;

    .line 51
    .line 52
    iget-wide v0, p1, Lg1/B;->k:J

    .line 53
    .line 54
    iput-wide v0, p0, Lg1/C;->k:J

    .line 55
    .line 56
    iget-wide v0, p1, Lg1/B;->l:J

    .line 57
    .line 58
    iput-wide v0, p0, Lg1/C;->l:J

    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg1/C;->g:Lg1/E;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lg1/E;->close()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    const-string v1, "response is not eligible for a body and must not be closed"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw v0
.end method

.method public final f()Lg1/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lg1/C;->m:Lg1/j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lg1/C;->f:Lg1/s;

    .line 7
    .line 8
    invoke-static {v0}, Lg1/j;->a(Lg1/s;)Lg1/j;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lg1/C;->m:Lg1/j;

    .line 13
    .line 14
    :goto_0
    return-object v0
.end method

.method public final g(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lg1/C;->f:Lg1/s;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lg1/s;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    :goto_0
    return-object p1
.end method

.method public final h()Lg1/B;
    .locals 3

    .line 1
    new-instance v0, Lg1/B;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lg1/C;->a:Lg1/A;

    .line 7
    .line 8
    iput-object v1, v0, Lg1/B;->a:Lg1/A;

    .line 9
    .line 10
    iget-object v1, p0, Lg1/C;->b:Lg1/y;

    .line 11
    .line 12
    iput-object v1, v0, Lg1/B;->b:Lg1/y;

    .line 13
    .line 14
    iget v1, p0, Lg1/C;->c:I

    .line 15
    .line 16
    iput v1, v0, Lg1/B;->c:I

    .line 17
    .line 18
    iget-object v1, p0, Lg1/C;->d:Ljava/lang/String;

    .line 19
    .line 20
    iput-object v1, v0, Lg1/B;->d:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v1, p0, Lg1/C;->e:Lg1/r;

    .line 23
    .line 24
    iput-object v1, v0, Lg1/B;->e:Lg1/r;

    .line 25
    .line 26
    iget-object v1, p0, Lg1/C;->f:Lg1/s;

    .line 27
    .line 28
    invoke-virtual {v1}, Lg1/s;->c()LA/b;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iput-object v1, v0, Lg1/B;->f:LA/b;

    .line 33
    .line 34
    iget-object v1, p0, Lg1/C;->g:Lg1/E;

    .line 35
    .line 36
    iput-object v1, v0, Lg1/B;->g:Lg1/E;

    .line 37
    .line 38
    iget-object v1, p0, Lg1/C;->h:Lg1/C;

    .line 39
    .line 40
    iput-object v1, v0, Lg1/B;->h:Lg1/C;

    .line 41
    .line 42
    iget-object v1, p0, Lg1/C;->i:Lg1/C;

    .line 43
    .line 44
    iput-object v1, v0, Lg1/B;->i:Lg1/C;

    .line 45
    .line 46
    iget-object v1, p0, Lg1/C;->j:Lg1/C;

    .line 47
    .line 48
    iput-object v1, v0, Lg1/B;->j:Lg1/C;

    .line 49
    .line 50
    iget-wide v1, p0, Lg1/C;->k:J

    .line 51
    .line 52
    iput-wide v1, v0, Lg1/B;->k:J

    .line 53
    .line 54
    iget-wide v1, p0, Lg1/C;->l:J

    .line 55
    .line 56
    iput-wide v1, v0, Lg1/B;->l:J

    .line 57
    .line 58
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Response{protocol="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lg1/C;->b:Lg1/y;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", code="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lg1/C;->c:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", message="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lg1/C;->d:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", url="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lg1/C;->a:Lg1/A;

    .line 39
    .line 40
    iget-object v1, v1, Lg1/A;->a:Lg1/u;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const/16 v1, 0x7d

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    return-object v0
.end method
