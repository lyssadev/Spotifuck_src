.class public final LQ0/A;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field public final a:LQ0/w;

.field public final b:LK/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LQ0/A;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(LQ0/w;Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, LQ0/A;->a:LQ0/w;

    .line 8
    .line 9
    new-instance p1, LK/j;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p2, p1, LK/j;->g:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p1, p0, LQ0/A;->b:LK/j;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/Bitmap;
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 2
    .line 3
    .line 4
    sget-object v0, LQ0/H;->a:Lr1/h;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eq v0, v1, :cond_3

    .line 19
    .line 20
    iget-object v0, p0, LQ0/A;->b:LK/j;

    .line 21
    .line 22
    iget-object v1, v0, LK/j;->g:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Landroid/net/Uri;

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    return-object v0

    .line 30
    :cond_0
    sget-object v1, LQ0/A;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 33
    .line 34
    .line 35
    iget v1, v0, LK/j;->f:I

    .line 36
    .line 37
    if-nez v1, :cond_1

    .line 38
    .line 39
    const/4 v1, 0x2

    .line 40
    iput v1, v0, LK/j;->f:I

    .line 41
    .line 42
    :cond_1
    new-instance v1, LQ0/z;

    .line 43
    .line 44
    iget v2, v0, LK/j;->f:I

    .line 45
    .line 46
    iget-object v0, v0, LK/j;->g:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Landroid/net/Uri;

    .line 49
    .line 50
    invoke-direct {v1, v0, v2}, LQ0/z;-><init>(Landroid/net/Uri;I)V

    .line 51
    .line 52
    .line 53
    iget-object v2, p0, LQ0/A;->a:LQ0/w;

    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    new-instance v3, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    const/16 v4, 0x32

    .line 64
    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    add-int/2addr v5, v4

    .line 76
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->ensureCapacity(I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->ensureCapacity(I)V

    .line 84
    .line 85
    .line 86
    const/4 v0, 0x0

    .line 87
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    :goto_0
    const/16 v0, 0xa

    .line 91
    .line 92
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    new-instance v3, LQ0/n;

    .line 100
    .line 101
    invoke-direct {v3, v2, v1, v0}, LQ0/n;-><init>(LQ0/w;LQ0/z;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    iget-object v0, v2, LQ0/w;->b:LQ0/m;

    .line 105
    .line 106
    iget-object v1, v2, LQ0/w;->c:LA/b;

    .line 107
    .line 108
    iget-object v4, v2, LQ0/w;->d:LQ0/C;

    .line 109
    .line 110
    invoke-static {v2, v0, v1, v4, v3}, LQ0/f;->d(LQ0/w;LQ0/m;LA/b;LQ0/C;LQ0/n;)LQ0/f;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v0}, LQ0/f;->e()Landroid/graphics/Bitmap;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    return-object v0

    .line 119
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 120
    .line 121
    const-string v1, "Method call should not happen from the main thread."

    .line 122
    .line 123
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw v0
.end method
