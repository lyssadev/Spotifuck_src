.class public final Lg1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final k:Ljava/lang/String;

.field public static final l:Ljava/lang/String;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lg1/s;

.field public final c:Ljava/lang/String;

.field public final d:Lg1/y;

.field public final e:I

.field public final f:Ljava/lang/String;

.field public final g:Lg1/s;

.field public final h:Lg1/r;

.field public final i:J

.field public final j:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lo1/g;->a:Lo1/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v1, "OkHttp-Sent-Millis"

    .line 7
    .line 8
    sput-object v1, Lg1/g;->k:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v0, "OkHttp-Received-Millis"

    .line 14
    .line 15
    sput-object v0, Lg1/g;->l:Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Lg1/C;)V
    .locals 9

    const/16 v0, 0x1b

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iget-object v1, p1, Lg1/C;->a:Lg1/A;

    iget-object v2, v1, Lg1/A;->a:Lg1/u;

    .line 52
    iget-object v2, v2, Lg1/u;->h:Ljava/lang/String;

    .line 53
    iput-object v2, p0, Lg1/g;->a:Ljava/lang/String;

    .line 54
    sget v2, Lk1/d;->a:I

    .line 55
    iget-object v2, p1, Lg1/C;->h:Lg1/C;

    iget-object v2, v2, Lg1/C;->a:Lg1/A;

    .line 56
    iget-object v2, v2, Lg1/A;->c:Lg1/s;

    .line 57
    iget-object v3, p1, Lg1/C;->f:Lg1/s;

    invoke-static {v3}, Lk1/d;->f(Lg1/s;)Ljava/util/Set;

    move-result-object v4

    .line 58
    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_0

    new-instance v2, LA/b;

    invoke-direct {v2, v0}, LA/b;-><init>(I)V

    .line 59
    new-instance v0, Lg1/s;

    invoke-direct {v0, v2}, Lg1/s;-><init>(LA/b;)V

    goto :goto_1

    .line 60
    :cond_0
    new-instance v5, LA/b;

    invoke-direct {v5, v0}, LA/b;-><init>(I)V

    .line 61
    invoke-virtual {v2}, Lg1/s;->d()I

    move-result v0

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v0, :cond_2

    .line 62
    invoke-virtual {v2, v6}, Lg1/s;->b(I)Ljava/lang/String;

    move-result-object v7

    .line 63
    invoke-interface {v4, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 64
    invoke-virtual {v2, v6}, Lg1/s;->e(I)Ljava/lang/String;

    move-result-object v8

    .line 65
    invoke-static {v7, v8}, LA/b;->s(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    invoke-virtual {v5, v7, v8}, LA/b;->r(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 67
    :cond_2
    new-instance v0, Lg1/s;

    invoke-direct {v0, v5}, Lg1/s;-><init>(LA/b;)V

    .line 68
    :goto_1
    iput-object v0, p0, Lg1/g;->b:Lg1/s;

    .line 69
    iget-object v0, v1, Lg1/A;->b:Ljava/lang/String;

    .line 70
    iput-object v0, p0, Lg1/g;->c:Ljava/lang/String;

    .line 71
    iget-object v0, p1, Lg1/C;->b:Lg1/y;

    iput-object v0, p0, Lg1/g;->d:Lg1/y;

    .line 72
    iget v0, p1, Lg1/C;->c:I

    iput v0, p0, Lg1/g;->e:I

    .line 73
    iget-object v0, p1, Lg1/C;->d:Ljava/lang/String;

    iput-object v0, p0, Lg1/g;->f:Ljava/lang/String;

    .line 74
    iput-object v3, p0, Lg1/g;->g:Lg1/s;

    .line 75
    iget-object v0, p1, Lg1/C;->e:Lg1/r;

    iput-object v0, p0, Lg1/g;->h:Lg1/r;

    .line 76
    iget-wide v0, p1, Lg1/C;->k:J

    iput-wide v0, p0, Lg1/g;->i:J

    .line 77
    iget-wide v0, p1, Lg1/C;->l:J

    iput-wide v0, p0, Lg1/g;->j:J

    return-void
.end method

.method public constructor <init>(Lr1/v;)V
    .locals 10

    const/16 v0, 0x1b

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    :try_start_0
    sget-object v1, Lr1/o;->a:Ljava/util/logging/Logger;

    .line 3
    new-instance v1, Lr1/q;

    invoke-direct {v1, p1}, Lr1/q;-><init>(Lr1/v;)V

    const-wide v2, 0x7fffffffffffffffL

    .line 4
    invoke-virtual {v1, v2, v3}, Lr1/q;->n(J)Ljava/lang/String;

    move-result-object v4

    .line 5
    iput-object v4, p0, Lg1/g;->a:Ljava/lang/String;

    .line 6
    invoke-virtual {v1, v2, v3}, Lr1/q;->n(J)Ljava/lang/String;

    move-result-object v4

    .line 7
    iput-object v4, p0, Lg1/g;->c:Ljava/lang/String;

    .line 8
    new-instance v4, LA/b;

    invoke-direct {v4, v0}, LA/b;-><init>(I)V

    .line 9
    invoke-static {v1}, Lg1/h;->f(Lr1/q;)I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v5, :cond_0

    .line 10
    invoke-virtual {v1, v2, v3}, Lr1/q;->n(J)Ljava/lang/String;

    move-result-object v8

    .line 11
    invoke-virtual {v4, v8}, LA/b;->q(Ljava/lang/String;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    .line 12
    :cond_0
    new-instance v5, Lg1/s;

    invoke-direct {v5, v4}, Lg1/s;-><init>(LA/b;)V

    .line 13
    iput-object v5, p0, Lg1/g;->b:Lg1/s;

    .line 14
    invoke-virtual {v1, v2, v3}, Lr1/q;->n(J)Ljava/lang/String;

    move-result-object v4

    .line 15
    invoke-static {v4}, LE/d;->c(Ljava/lang/String;)LE/d;

    move-result-object v4

    .line 16
    iget-object v5, v4, LE/d;->c:Ljava/lang/Object;

    check-cast v5, Lg1/y;

    iput-object v5, p0, Lg1/g;->d:Lg1/y;

    .line 17
    iget v5, v4, LE/d;->b:I

    iput v5, p0, Lg1/g;->e:I

    .line 18
    iget-object v4, v4, LE/d;->d:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iput-object v4, p0, Lg1/g;->f:Ljava/lang/String;

    .line 19
    new-instance v4, LA/b;

    invoke-direct {v4, v0}, LA/b;-><init>(I)V

    .line 20
    invoke-static {v1}, Lg1/h;->f(Lr1/q;)I

    move-result v0

    :goto_1
    if-ge v6, v0, :cond_1

    .line 21
    invoke-virtual {v1, v2, v3}, Lr1/q;->n(J)Ljava/lang/String;

    move-result-object v5

    .line 22
    invoke-virtual {v4, v5}, LA/b;->q(Ljava/lang/String;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 23
    :cond_1
    sget-object v0, Lg1/g;->k:Ljava/lang/String;

    invoke-virtual {v4, v0}, LA/b;->v(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 24
    sget-object v6, Lg1/g;->l:Ljava/lang/String;

    invoke-virtual {v4, v6}, LA/b;->v(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 25
    invoke-virtual {v4, v0}, LA/b;->B(Ljava/lang/String;)V

    .line 26
    invoke-virtual {v4, v6}, LA/b;->B(Ljava/lang/String;)V

    const-wide/16 v8, 0x0

    if-eqz v5, :cond_2

    .line 27
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    goto :goto_2

    :cond_2
    move-wide v5, v8

    .line 28
    :goto_2
    iput-wide v5, p0, Lg1/g;->i:J

    if-eqz v7, :cond_3

    .line 29
    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v8

    .line 30
    :cond_3
    iput-wide v8, p0, Lg1/g;->j:J

    .line 31
    new-instance v0, Lg1/s;

    invoke-direct {v0, v4}, Lg1/s;-><init>(LA/b;)V

    .line 32
    iput-object v0, p0, Lg1/g;->g:Lg1/s;

    .line 33
    iget-object v0, p0, Lg1/g;->a:Ljava/lang/String;

    const-string v4, "https://"

    invoke-virtual {v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 34
    invoke-virtual {v1, v2, v3}, Lr1/q;->n(J)Ljava/lang/String;

    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-gtz v4, :cond_5

    .line 36
    invoke-virtual {v1, v2, v3}, Lr1/q;->n(J)Ljava/lang/String;

    move-result-object v0

    .line 37
    invoke-static {v0}, Lg1/m;->a(Ljava/lang/String;)Lg1/m;

    move-result-object v0

    .line 38
    invoke-static {v1}, Lg1/g;->a(Lr1/q;)Ljava/util/List;

    move-result-object v4

    .line 39
    invoke-static {v1}, Lg1/g;->a(Lr1/q;)Ljava/util/List;

    move-result-object v5

    .line 40
    invoke-virtual {v1}, Lr1/q;->f()Z

    move-result v6

    if-nez v6, :cond_4

    .line 41
    invoke-virtual {v1, v2, v3}, Lr1/q;->n(J)Ljava/lang/String;

    move-result-object v1

    .line 42
    invoke-static {v1}, Lg1/G;->a(Ljava/lang/String;)Lg1/G;

    move-result-object v1

    goto :goto_3

    .line 43
    :cond_4
    sget-object v1, Lg1/G;->f:Lg1/G;

    .line 44
    :goto_3
    new-instance v2, Lg1/r;

    invoke-static {v4}, Lh1/c;->k(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    .line 45
    invoke-static {v5}, Lh1/c;->k(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    invoke-direct {v2, v1, v0, v3, v4}, Lg1/r;-><init>(Lg1/G;Lg1/m;Ljava/util/List;Ljava/util/List;)V

    .line 46
    iput-object v2, p0, Lg1/g;->h:Lg1/r;

    goto :goto_4

    .line 47
    :cond_5
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "expected \"\" but was \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6
    const/4 v0, 0x0

    .line 48
    iput-object v0, p0, Lg1/g;->h:Lg1/r;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    :goto_4
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    return-void

    :goto_5
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    throw v0
.end method

.method public static a(Lr1/q;)Ljava/util/List;
    .locals 7

    .line 1
    invoke-static {p0}, Lg1/h;->f(Lr1/q;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_0
    :try_start_0
    const-string v1, "X.509"

    .line 14
    .line 15
    invoke-static {v1}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v2, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    :goto_0
    if-ge v3, v0, :cond_2

    .line 26
    .line 27
    const-wide v4, 0x7fffffffffffffffL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v4, v5}, Lr1/q;->n(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    new-instance v5, Lr1/e;

    .line 37
    .line 38
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-static {v4}, Lr1/h;->b(Ljava/lang/String;)Lr1/h;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    if-eqz v4, :cond_1

    .line 46
    .line 47
    invoke-virtual {v4, v5}, Lr1/h;->p(Lr1/e;)V

    .line 48
    .line 49
    .line 50
    new-instance v4, Lr1/d;

    .line 51
    .line 52
    const/4 v6, 0x0

    .line 53
    invoke-direct {v4, v5, v6}, Lr1/d;-><init>(Lr1/g;I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v4}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    add-int/lit8 v3, v3, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :catch_0
    move-exception p0

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 69
    .line 70
    const-string v0, "byteString == null"

    .line 71
    .line 72
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p0
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    :cond_2
    return-object v2

    .line 77
    :goto_1
    new-instance v0, Ljava/io/IOException;

    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v0
.end method

.method public static b(Lr1/p;Ljava/util/List;)V
    .locals 4

    .line 1
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-long v0, v0

    .line 6
    invoke-virtual {p0, v0, v1}, Lr1/p;->h(J)Lr1/f;

    .line 7
    .line 8
    .line 9
    const/16 v0, 0xa

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lr1/p;->d(I)Lr1/f;

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    :goto_0
    if-ge v2, v1, :cond_0

    .line 20
    .line 21
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Ljava/security/cert/Certificate;

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/security/cert/Certificate;->getEncoded()[B

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-static {v3}, Lr1/h;->i([B)Lr1/h;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v3}, Lr1/h;->a()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {p0, v3}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0}, Lr1/p;->d(I)Lr1/f;
    :try_end_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catch_0
    move-exception p0

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    return-void

    .line 51
    :goto_1
    new-instance p1, Ljava/io/IOException;

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1
.end method


# virtual methods
.method public final c(Li1/d;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Li1/d;->d(I)Lr1/u;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    sget-object v1, Lr1/o;->a:Ljava/util/logging/Logger;

    .line 7
    .line 8
    new-instance v1, Lr1/p;

    .line 9
    .line 10
    invoke-direct {v1, p1}, Lr1/p;-><init>(Lr1/u;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lg1/g;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 16
    .line 17
    .line 18
    const/16 v2, 0xa

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Lr1/p;->d(I)Lr1/f;

    .line 21
    .line 22
    .line 23
    iget-object v3, p0, Lg1/g;->c:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v1, v3}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Lr1/p;->d(I)Lr1/f;

    .line 29
    .line 30
    .line 31
    iget-object v3, p0, Lg1/g;->b:Lg1/s;

    .line 32
    .line 33
    invoke-virtual {v3}, Lg1/s;->d()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    int-to-long v4, v4

    .line 38
    invoke-virtual {v1, v4, v5}, Lr1/p;->h(J)Lr1/f;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v2}, Lr1/p;->d(I)Lr1/f;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Lg1/s;->d()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    const/4 v5, 0x0

    .line 49
    :goto_0
    const-string v6, ": "

    .line 50
    .line 51
    if-ge v5, v4, :cond_0

    .line 52
    .line 53
    invoke-virtual {v3, v5}, Lg1/s;->b(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    invoke-virtual {v1, v7}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v6}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3, v5}, Lg1/s;->e(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-virtual {v1, v6}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v2}, Lr1/p;->d(I)Lr1/f;

    .line 71
    .line 72
    .line 73
    add-int/lit8 v5, v5, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    sget-object v4, Lg1/y;->b:Lg1/y;

    .line 82
    .line 83
    iget-object v5, p0, Lg1/g;->d:Lg1/y;

    .line 84
    .line 85
    if-ne v5, v4, :cond_1

    .line 86
    .line 87
    const-string v4, "HTTP/1.0"

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_1
    const-string v4, "HTTP/1.1"

    .line 91
    .line 92
    :goto_1
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const/16 v4, 0x20

    .line 96
    .line 97
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    iget v5, p0, Lg1/g;->e:I

    .line 101
    .line 102
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    iget-object v5, p0, Lg1/g;->f:Ljava/lang/String;

    .line 106
    .line 107
    if-eqz v5, :cond_2

    .line 108
    .line 109
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    :cond_2
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-virtual {v1, v3}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v2}, Lr1/p;->d(I)Lr1/f;

    .line 123
    .line 124
    .line 125
    iget-object v3, p0, Lg1/g;->g:Lg1/s;

    .line 126
    .line 127
    invoke-virtual {v3}, Lg1/s;->d()I

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    add-int/lit8 v4, v4, 0x2

    .line 132
    .line 133
    int-to-long v4, v4

    .line 134
    invoke-virtual {v1, v4, v5}, Lr1/p;->h(J)Lr1/f;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v2}, Lr1/p;->d(I)Lr1/f;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v3}, Lg1/s;->d()I

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    :goto_2
    if-ge v0, v4, :cond_3

    .line 145
    .line 146
    invoke-virtual {v3, v0}, Lg1/s;->b(I)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    invoke-virtual {v1, v5}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, v6}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3, v0}, Lg1/s;->e(I)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    invoke-virtual {v1, v5}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1, v2}, Lr1/p;->d(I)Lr1/f;

    .line 164
    .line 165
    .line 166
    add-int/lit8 v0, v0, 0x1

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_3
    sget-object v0, Lg1/g;->k:Ljava/lang/String;

    .line 170
    .line 171
    invoke-virtual {v1, v0}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1, v6}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 175
    .line 176
    .line 177
    iget-wide v3, p0, Lg1/g;->i:J

    .line 178
    .line 179
    invoke-virtual {v1, v3, v4}, Lr1/p;->h(J)Lr1/f;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1, v2}, Lr1/p;->d(I)Lr1/f;

    .line 183
    .line 184
    .line 185
    sget-object v0, Lg1/g;->l:Ljava/lang/String;

    .line 186
    .line 187
    invoke-virtual {v1, v0}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, v6}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 191
    .line 192
    .line 193
    iget-wide v3, p0, Lg1/g;->j:J

    .line 194
    .line 195
    invoke-virtual {v1, v3, v4}, Lr1/p;->h(J)Lr1/f;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1, v2}, Lr1/p;->d(I)Lr1/f;

    .line 199
    .line 200
    .line 201
    const-string v0, "https://"

    .line 202
    .line 203
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    if-eqz p1, :cond_4

    .line 208
    .line 209
    invoke-virtual {v1, v2}, Lr1/p;->d(I)Lr1/f;

    .line 210
    .line 211
    .line 212
    iget-object p1, p0, Lg1/g;->h:Lg1/r;

    .line 213
    .line 214
    iget-object v0, p1, Lg1/r;->b:Lg1/m;

    .line 215
    .line 216
    iget-object v0, v0, Lg1/m;->a:Ljava/lang/String;

    .line 217
    .line 218
    invoke-virtual {v1, v0}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1, v2}, Lr1/p;->d(I)Lr1/f;

    .line 222
    .line 223
    .line 224
    iget-object v0, p1, Lg1/r;->c:Ljava/util/List;

    .line 225
    .line 226
    invoke-static {v1, v0}, Lg1/g;->b(Lr1/p;Ljava/util/List;)V

    .line 227
    .line 228
    .line 229
    iget-object v0, p1, Lg1/r;->d:Ljava/util/List;

    .line 230
    .line 231
    invoke-static {v1, v0}, Lg1/g;->b(Lr1/p;Ljava/util/List;)V

    .line 232
    .line 233
    .line 234
    iget-object p1, p1, Lg1/r;->a:Lg1/G;

    .line 235
    .line 236
    iget-object p1, p1, Lg1/G;->a:Ljava/lang/String;

    .line 237
    .line 238
    invoke-virtual {v1, p1}, Lr1/p;->c(Ljava/lang/String;)Lr1/f;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1, v2}, Lr1/p;->d(I)Lr1/f;

    .line 242
    .line 243
    .line 244
    :cond_4
    invoke-virtual {v1}, Lr1/p;->close()V

    .line 245
    .line 246
    .line 247
    return-void
.end method
