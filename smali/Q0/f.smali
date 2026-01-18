.class public final LQ0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final s:Ljava/lang/Object;

.field public static final t:LQ0/c;

.field public static final u:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static final v:LQ0/d;


# instance fields
.field public final a:I

.field public final b:LQ0/w;

.field public final c:LQ0/m;

.field public final d:LA/b;

.field public final e:LQ0/C;

.field public final f:Ljava/lang/String;

.field public final g:LQ0/z;

.field public h:I

.field public final i:LQ0/B;

.field public j:LQ0/n;

.field public k:Ljava/util/ArrayList;

.field public l:Landroid/graphics/Bitmap;

.field public m:Ljava/util/concurrent/Future;

.field public n:I

.field public o:Ljava/lang/Exception;

.field public p:I

.field public q:I

.field public r:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LQ0/f;->s:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, LQ0/c;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, LQ0/c;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, LQ0/f;->t:LQ0/c;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object v0, LQ0/f;->u:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 22
    .line 23
    new-instance v0, LQ0/d;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    sput-object v0, LQ0/f;->v:LQ0/d;

    .line 29
    .line 30
    return-void
.end method

.method public constructor <init>(LQ0/w;LQ0/m;LA/b;LQ0/C;LQ0/n;LQ0/B;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LQ0/f;->u:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput v0, p0, LQ0/f;->a:I

    .line 11
    .line 12
    iput-object p1, p0, LQ0/f;->b:LQ0/w;

    .line 13
    .line 14
    iput-object p2, p0, LQ0/f;->c:LQ0/m;

    .line 15
    .line 16
    iput-object p3, p0, LQ0/f;->d:LA/b;

    .line 17
    .line 18
    iput-object p4, p0, LQ0/f;->e:LQ0/C;

    .line 19
    .line 20
    iput-object p5, p0, LQ0/f;->j:LQ0/n;

    .line 21
    .line 22
    iget-object p1, p5, LQ0/n;->c:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p1, p0, LQ0/f;->f:Ljava/lang/String;

    .line 25
    .line 26
    iget-object p1, p5, LQ0/n;->b:LQ0/z;

    .line 27
    .line 28
    iput-object p1, p0, LQ0/f;->g:LQ0/z;

    .line 29
    .line 30
    iget p1, p1, LQ0/z;->c:I

    .line 31
    .line 32
    iput p1, p0, LQ0/f;->r:I

    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    iput p1, p0, LQ0/f;->h:I

    .line 36
    .line 37
    iput-object p6, p0, LQ0/f;->i:LQ0/B;

    .line 38
    .line 39
    invoke-virtual {p6}, LQ0/B;->b()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    iput p1, p0, LQ0/f;->q:I

    .line 44
    .line 45
    return-void
.end method

.method public static b(Lr1/v;LQ0/z;)Landroid/graphics/Bitmap;
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    sget-object v1, Lr1/o;->a:Ljava/util/logging/Logger;

    .line 3
    .line 4
    new-instance v1, Lr1/q;

    .line 5
    .line 6
    invoke-direct {v1, p0}, Lr1/q;-><init>(Lr1/v;)V

    .line 7
    .line 8
    .line 9
    sget-object v2, LQ0/H;->a:Lr1/h;

    .line 10
    .line 11
    const-wide/16 v3, 0x0

    .line 12
    .line 13
    invoke-virtual {v1, v3, v4, v2}, Lr1/q;->h(JLr1/h;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x0

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    sget-object v2, LQ0/H;->b:Lr1/h;

    .line 21
    .line 22
    const-wide/16 v4, 0x8

    .line 23
    .line 24
    invoke-virtual {v1, v4, v5, v2}, Lr1/q;->h(JLr1/h;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v2, 0x0

    .line 33
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    if-nez v2, :cond_2

    .line 38
    .line 39
    new-instance p0, Lr1/d;

    .line 40
    .line 41
    invoke-direct {p0, v1, v0}, Lr1/d;-><init>(Lr1/g;I)V

    .line 42
    .line 43
    .line 44
    invoke-static {p0, p1, p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    if-eqz p0, :cond_1

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_1
    new-instance p0, Ljava/io/IOException;

    .line 52
    .line 53
    const-string p1, "Failed to decode stream."

    .line 54
    .line 55
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p0

    .line 59
    :cond_2
    iget-object v0, v1, Lr1/q;->a:Lr1/e;

    .line 60
    .line 61
    :goto_1
    const-wide/16 v1, 0x2000

    .line 62
    .line 63
    invoke-interface {p0, v0, v1, v2}, Lr1/v;->e(Lr1/e;J)J

    .line 64
    .line 65
    .line 66
    move-result-wide v1

    .line 67
    const-wide/16 v4, -0x1

    .line 68
    .line 69
    cmp-long v6, v1, v4

    .line 70
    .line 71
    if-eqz v6, :cond_3

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    :try_start_0
    iget-wide v1, v0, Lr1/e;->b:J

    .line 75
    .line 76
    invoke-virtual {v0, v1, v2}, Lr1/e;->k(J)[B

    .line 77
    .line 78
    .line 79
    move-result-object p0
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    array-length v0, p0

    .line 81
    invoke-static {p0, v3, v0, p1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :catch_0
    move-exception p0

    .line 87
    new-instance p1, Ljava/lang/AssertionError;

    .line 88
    .line 89
    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    throw p1
.end method

.method public static d(LQ0/w;LQ0/m;LA/b;LQ0/C;LQ0/n;)LQ0/f;
    .locals 8

    .line 1
    iget-object v0, p4, LQ0/n;->b:LQ0/z;

    .line 2
    .line 3
    iget-object v2, p0, LQ0/w;->a:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    const/4 v4, 0x0

    .line 10
    :goto_0
    if-ge v4, v3, :cond_1

    .line 11
    .line 12
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v6

    .line 16
    check-cast v6, LQ0/B;

    .line 17
    .line 18
    invoke-virtual {v6, v0}, LQ0/B;->a(LQ0/z;)Z

    .line 19
    .line 20
    .line 21
    move-result v7

    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    new-instance v7, LQ0/f;

    .line 25
    .line 26
    move-object v0, v7

    .line 27
    move-object v1, p0

    .line 28
    move-object v2, p1

    .line 29
    move-object v3, p2

    .line 30
    move-object v4, p3

    .line 31
    move-object v5, p4

    .line 32
    invoke-direct/range {v0 .. v6}, LQ0/f;-><init>(LQ0/w;LQ0/m;LA/b;LQ0/C;LQ0/n;LQ0/B;)V

    .line 33
    .line 34
    .line 35
    return-object v7

    .line 36
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    new-instance v7, LQ0/f;

    .line 40
    .line 41
    sget-object v6, LQ0/f;->v:LQ0/d;

    .line 42
    .line 43
    move-object v0, v7

    .line 44
    move-object v1, p0

    .line 45
    move-object v2, p1

    .line 46
    move-object v3, p2

    .line 47
    move-object v4, p3

    .line 48
    move-object v5, p4

    .line 49
    invoke-direct/range {v0 .. v6}, LQ0/f;-><init>(LQ0/w;LQ0/m;LA/b;LQ0/C;LQ0/n;LQ0/B;)V

    .line 50
    .line 51
    .line 52
    return-object v7
.end method

.method public static f(LQ0/z;)V
    .locals 3

    .line 1
    iget-object p0, p0, LQ0/z;->a:Landroid/net/Uri;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :goto_0
    sget-object v0, LQ0/f;->t:LQ0/c;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/16 v2, 0x8

    .line 32
    .line 33
    add-int/2addr v1, v2

    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->ensureCapacity(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-virtual {v0, v2, v1, p0}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    iget-object v0, p0, LQ0/f;->j:LQ0/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, LQ0/f;->k:Ljava/util/ArrayList;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, LQ0/f;->m:Ljava/util/concurrent/Future;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    :cond_1
    return v1
.end method

.method public final c(LQ0/n;)V
    .locals 5

    .line 1
    iget-object v0, p0, LQ0/f;->j:LQ0/n;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-ne v0, p1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, LQ0/f;->j:LQ0/n;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, LQ0/f;->k:Ljava/util/ArrayList;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    :goto_0
    if-eqz v0, :cond_7

    .line 23
    .line 24
    iget-object p1, p1, LQ0/n;->b:LQ0/z;

    .line 25
    .line 26
    iget v0, p0, LQ0/f;->r:I

    .line 27
    .line 28
    iget p1, p1, LQ0/z;->c:I

    .line 29
    .line 30
    if-ne p1, v0, :cond_7

    .line 31
    .line 32
    iget-object p1, p0, LQ0/f;->k:Ljava/util/ArrayList;

    .line 33
    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_2

    .line 41
    .line 42
    const/4 p1, 0x1

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    const/4 p1, 0x0

    .line 45
    :goto_1
    iget-object v0, p0, LQ0/f;->j:LQ0/n;

    .line 46
    .line 47
    if-nez v0, :cond_3

    .line 48
    .line 49
    if-eqz p1, :cond_6

    .line 50
    .line 51
    :cond_3
    if-eqz v0, :cond_4

    .line 52
    .line 53
    iget-object v0, v0, LQ0/n;->b:LQ0/z;

    .line 54
    .line 55
    iget v1, v0, LQ0/z;->c:I

    .line 56
    .line 57
    :cond_4
    if-eqz p1, :cond_6

    .line 58
    .line 59
    iget-object p1, p0, LQ0/f;->k:Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    :goto_2
    if-ge v2, p1, :cond_6

    .line 66
    .line 67
    iget-object v0, p0, LQ0/f;->k:Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, LQ0/n;

    .line 74
    .line 75
    iget-object v0, v0, LQ0/n;->b:LQ0/z;

    .line 76
    .line 77
    iget v0, v0, LQ0/z;->c:I

    .line 78
    .line 79
    invoke-static {v0}, Lt/e;->a(I)I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    invoke-static {v1}, Lt/e;->a(I)I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-le v3, v4, :cond_5

    .line 88
    .line 89
    move v1, v0

    .line 90
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_6
    iput v1, p0, LQ0/f;->r:I

    .line 94
    .line 95
    :cond_7
    iget-object p1, p0, LQ0/f;->b:LQ0/w;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public final e()Landroid/graphics/Bitmap;
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, LQ0/f;->d:LA/b;

    .line 3
    .line 4
    iget-object v2, p0, LQ0/f;->f:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v1, v1, LA/b;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, LQ0/o;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, LQ0/p;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v1, v1, LQ0/p;->a:Landroid/graphics/Bitmap;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v1, v2

    .line 23
    :goto_0
    const/4 v3, 0x1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iget-object v2, p0, LQ0/f;->e:LQ0/C;

    .line 27
    .line 28
    iget-object v2, v2, LQ0/C;->b:LQ0/j;

    .line 29
    .line 30
    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 31
    .line 32
    .line 33
    iput v3, p0, LQ0/f;->n:I

    .line 34
    .line 35
    iget-object v0, p0, LQ0/f;->b:LQ0/w;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    return-object v1

    .line 41
    :cond_1
    iget v4, p0, LQ0/f;->q:I

    .line 42
    .line 43
    const/4 v5, 0x4

    .line 44
    if-nez v4, :cond_2

    .line 45
    .line 46
    const/4 v4, 0x4

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    iget v4, p0, LQ0/f;->h:I

    .line 49
    .line 50
    :goto_1
    iput v4, p0, LQ0/f;->h:I

    .line 51
    .line 52
    iget-object v6, p0, LQ0/f;->i:LQ0/B;

    .line 53
    .line 54
    iget-object v7, p0, LQ0/f;->g:LQ0/z;

    .line 55
    .line 56
    invoke-virtual {v6, v7, v4}, LQ0/B;->c(LQ0/z;I)LN0/p;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    if-eqz v4, :cond_3

    .line 61
    .line 62
    iget v1, v4, LN0/p;->a:I

    .line 63
    .line 64
    iput v1, p0, LQ0/f;->n:I

    .line 65
    .line 66
    iget v1, v4, LN0/p;->b:I

    .line 67
    .line 68
    iput v1, p0, LQ0/f;->p:I

    .line 69
    .line 70
    iget-object v1, v4, LN0/p;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v1, Landroid/graphics/Bitmap;

    .line 73
    .line 74
    if-nez v1, :cond_3

    .line 75
    .line 76
    iget-object v1, v4, LN0/p;->d:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v1, Lr1/v;

    .line 79
    .line 80
    :try_start_0
    iget-object v4, p0, LQ0/f;->g:LQ0/z;

    .line 81
    .line 82
    invoke-static {v1, v4}, LQ0/f;->b(Lr1/v;LQ0/z;)Landroid/graphics/Bitmap;

    .line 83
    .line 84
    .line 85
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    :try_start_1
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :catch_0
    nop

    .line 91
    :goto_2
    move-object v1, v4

    .line 92
    goto :goto_3

    .line 93
    :catchall_0
    move-exception v0

    .line 94
    :try_start_2
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 95
    .line 96
    .line 97
    :catch_1
    throw v0

    .line 98
    :cond_3
    :goto_3
    if-eqz v1, :cond_10

    .line 99
    .line 100
    iget-object v4, p0, LQ0/f;->b:LQ0/w;

    .line 101
    .line 102
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    iget-object v4, p0, LQ0/f;->e:LQ0/C;

    .line 106
    .line 107
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    sget-object v6, LQ0/H;->a:Lr1/h;

    .line 111
    .line 112
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    if-ltz v6, :cond_f

    .line 117
    .line 118
    iget-object v4, v4, LQ0/C;->b:LQ0/j;

    .line 119
    .line 120
    const/4 v7, 0x2

    .line 121
    invoke-virtual {v4, v7, v6, v0}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    invoke-virtual {v4, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 126
    .line 127
    .line 128
    iget-object v4, p0, LQ0/f;->g:LQ0/z;

    .line 129
    .line 130
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    iget-object v4, v4, LQ0/z;->b:Ljava/util/List;

    .line 134
    .line 135
    if-eqz v4, :cond_4

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_4
    iget v4, p0, LQ0/f;->p:I

    .line 139
    .line 140
    if-eqz v4, :cond_10

    .line 141
    .line 142
    :goto_4
    sget-object v11, LQ0/f;->s:Ljava/lang/Object;

    .line 143
    .line 144
    monitor-enter v11

    .line 145
    :try_start_3
    iget-object v4, p0, LQ0/f;->g:LQ0/z;

    .line 146
    .line 147
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    iget v4, p0, LQ0/f;->p:I

    .line 151
    .line 152
    if-eqz v4, :cond_9

    .line 153
    .line 154
    iget-object v6, p0, LQ0/f;->g:LQ0/z;

    .line 155
    .line 156
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 157
    .line 158
    .line 159
    move-result v8

    .line 160
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 161
    .line 162
    .line 163
    move-result v9

    .line 164
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    new-instance v10, Landroid/graphics/Matrix;

    .line 168
    .line 169
    invoke-direct {v10}, Landroid/graphics/Matrix;-><init>()V

    .line 170
    .line 171
    .line 172
    if-eqz v4, :cond_7

    .line 173
    .line 174
    if-eqz v4, :cond_7

    .line 175
    .line 176
    packed-switch v4, :pswitch_data_0

    .line 177
    .line 178
    .line 179
    const/4 v6, 0x0

    .line 180
    goto :goto_5

    .line 181
    :pswitch_0
    const/16 v6, 0x10e

    .line 182
    .line 183
    goto :goto_5

    .line 184
    :pswitch_1
    const/16 v6, 0x5a

    .line 185
    .line 186
    goto :goto_5

    .line 187
    :pswitch_2
    const/16 v6, 0xb4

    .line 188
    .line 189
    :goto_5
    if-eq v4, v7, :cond_5

    .line 190
    .line 191
    const/4 v7, 0x7

    .line 192
    if-eq v4, v7, :cond_5

    .line 193
    .line 194
    if-eq v4, v5, :cond_5

    .line 195
    .line 196
    const/4 v5, 0x5

    .line 197
    if-eq v4, v5, :cond_5

    .line 198
    .line 199
    const/4 v4, 0x1

    .line 200
    goto :goto_6

    .line 201
    :cond_5
    const/4 v4, -0x1

    .line 202
    :goto_6
    if-eqz v6, :cond_6

    .line 203
    .line 204
    int-to-float v5, v6

    .line 205
    invoke-virtual {v10, v5}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 206
    .line 207
    .line 208
    :cond_6
    if-eq v4, v3, :cond_7

    .line 209
    .line 210
    int-to-float v4, v4

    .line 211
    const/high16 v5, 0x3f800000    # 1.0f

    .line 212
    .line 213
    invoke-virtual {v10, v4, v5}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 214
    .line 215
    .line 216
    :cond_7
    const/4 v12, 0x1

    .line 217
    const/4 v6, 0x0

    .line 218
    const/4 v5, 0x0

    .line 219
    move-object v4, v1

    .line 220
    move v7, v8

    .line 221
    move v8, v9

    .line 222
    move-object v9, v10

    .line 223
    move v10, v12

    .line 224
    invoke-static/range {v4 .. v10}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    if-eq v4, v1, :cond_8

    .line 229
    .line 230
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 231
    .line 232
    .line 233
    move-object v1, v4

    .line 234
    :cond_8
    iget-object v4, p0, LQ0/f;->b:LQ0/w;

    .line 235
    .line 236
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    goto :goto_7

    .line 240
    :catchall_1
    move-exception v0

    .line 241
    goto :goto_b

    .line 242
    :cond_9
    :goto_7
    iget-object v4, p0, LQ0/f;->g:LQ0/z;

    .line 243
    .line 244
    iget-object v4, v4, LQ0/z;->b:Ljava/util/List;

    .line 245
    .line 246
    if-eqz v4, :cond_a

    .line 247
    .line 248
    goto :goto_8

    .line 249
    :cond_a
    const/4 v3, 0x0

    .line 250
    :goto_8
    if-eqz v3, :cond_d

    .line 251
    .line 252
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    if-gtz v3, :cond_b

    .line 257
    .line 258
    move-object v2, v1

    .line 259
    goto :goto_9

    .line 260
    :cond_b
    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 264
    if-nez v1, :cond_c

    .line 265
    .line 266
    :try_start_4
    throw v2
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 267
    :catch_2
    :try_start_5
    sget-object v1, LQ0/w;->g:LQ0/u;

    .line 268
    .line 269
    new-instance v3, LQ0/e;

    .line 270
    .line 271
    invoke-direct {v3, v0}, LQ0/e;-><init>(I)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 275
    .line 276
    .line 277
    :goto_9
    iget-object v1, p0, LQ0/f;->b:LQ0/w;

    .line 278
    .line 279
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    move-object v1, v2

    .line 283
    goto :goto_a

    .line 284
    :cond_c
    new-instance v0, Ljava/lang/ClassCastException;

    .line 285
    .line 286
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 287
    .line 288
    .line 289
    throw v0

    .line 290
    :cond_d
    :goto_a
    monitor-exit v11
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 291
    if-eqz v1, :cond_10

    .line 292
    .line 293
    iget-object v2, p0, LQ0/f;->e:LQ0/C;

    .line 294
    .line 295
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    .line 299
    .line 300
    .line 301
    move-result v3

    .line 302
    if-ltz v3, :cond_e

    .line 303
    .line 304
    iget-object v2, v2, LQ0/C;->b:LQ0/j;

    .line 305
    .line 306
    const/4 v4, 0x3

    .line 307
    invoke-virtual {v2, v4, v3, v0}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 312
    .line 313
    .line 314
    goto :goto_c

    .line 315
    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 316
    .line 317
    new-instance v2, Ljava/lang/StringBuilder;

    .line 318
    .line 319
    const-string v3, "Negative size: "

    .line 320
    .line 321
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    throw v0

    .line 335
    :goto_b
    :try_start_6
    monitor-exit v11
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 336
    throw v0

    .line 337
    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 338
    .line 339
    new-instance v2, Ljava/lang/StringBuilder;

    .line 340
    .line 341
    const-string v3, "Negative size: "

    .line 342
    .line 343
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    throw v0

    .line 357
    :cond_10
    :goto_c
    return-object v1

    .line 358
    nop

    .line 359
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, LQ0/f;->c:LQ0/m;

    .line 2
    .line 3
    const-string v1, "Picasso-Idle"

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    :try_start_0
    iget-object v3, p0, LQ0/f;->g:LQ0/z;

    .line 7
    .line 8
    invoke-static {v3}, LQ0/f;->f(LQ0/z;)V

    .line 9
    .line 10
    .line 11
    iget-object v3, p0, LQ0/f;->b:LQ0/w;

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, LQ0/f;->e()Landroid/graphics/Bitmap;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    iput-object v3, p0, LQ0/f;->l:Landroid/graphics/Bitmap;

    .line 21
    .line 22
    if-nez v3, :cond_0

    .line 23
    .line 24
    iget-object v3, v0, LQ0/m;->h:LQ0/j;

    .line 25
    .line 26
    invoke-virtual {v3, v2, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {v3, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {v0, p0}, LQ0/m;->b(LQ0/f;)V
    :try_end_0
    .catch LQ0/s; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    goto :goto_5

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    goto :goto_6

    .line 47
    :catch_0
    move-exception v3

    .line 48
    goto :goto_1

    .line 49
    :catch_1
    move-exception v3

    .line 50
    goto :goto_2

    .line 51
    :catch_2
    move-exception v2

    .line 52
    goto :goto_3

    .line 53
    :catch_3
    move-exception v3

    .line 54
    goto :goto_4

    .line 55
    :goto_1
    :try_start_1
    iput-object v3, p0, LQ0/f;->o:Ljava/lang/Exception;

    .line 56
    .line 57
    iget-object v0, v0, LQ0/m;->h:LQ0/j;

    .line 58
    .line 59
    invoke-virtual {v0, v2, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :goto_2
    new-instance v4, Ljava/io/StringWriter;

    .line 68
    .line 69
    invoke-direct {v4}, Ljava/io/StringWriter;-><init>()V

    .line 70
    .line 71
    .line 72
    iget-object v5, p0, LQ0/f;->e:LQ0/C;

    .line 73
    .line 74
    invoke-virtual {v5}, LQ0/C;->a()LQ0/D;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    new-instance v6, Ljava/io/PrintWriter;

    .line 79
    .line 80
    invoke-direct {v6, v4}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v5, v6}, LQ0/D;->a(Ljava/io/PrintWriter;)V

    .line 84
    .line 85
    .line 86
    new-instance v5, Ljava/lang/RuntimeException;

    .line 87
    .line 88
    invoke-virtual {v4}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-direct {v5, v4, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    iput-object v5, p0, LQ0/f;->o:Ljava/lang/Exception;

    .line 96
    .line 97
    iget-object v0, v0, LQ0/m;->h:LQ0/j;

    .line 98
    .line 99
    invoke-virtual {v0, v2, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :goto_3
    iput-object v2, p0, LQ0/f;->o:Ljava/lang/Exception;

    .line 108
    .line 109
    iget-object v0, v0, LQ0/m;->h:LQ0/j;

    .line 110
    .line 111
    const/4 v2, 0x5

    .line 112
    invoke-virtual {v0, v2, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    const-wide/16 v3, 0x1f4

    .line 117
    .line 118
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :goto_4
    iput-object v3, p0, LQ0/f;->o:Ljava/lang/Exception;

    .line 123
    .line 124
    iget-object v0, v0, LQ0/m;->h:LQ0/j;

    .line 125
    .line 126
    invoke-virtual {v0, v2, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :goto_5
    return-void

    .line 135
    :goto_6
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-virtual {v2, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw v0
.end method
