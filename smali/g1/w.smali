.class public final Lg1/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LE/j;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public final d:Lg1/b;

.field public final e:Ljava/net/ProxySelector;

.field public final f:Lg1/b;

.field public g:Lg1/h;

.field public final h:Ljavax/net/SocketFactory;

.field public final i:Lq1/c;

.field public final j:Lg1/k;

.field public final k:Lg1/b;

.field public final l:Lg1/b;

.field public final m:Lg1/n;

.field public final n:Lg1/b;

.field public final o:Z

.field public final p:Z

.field public final q:Z

.field public final r:I

.field public final s:I

.field public final t:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lg1/w;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lg1/w;->c:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, LE/j;

    .line 19
    .line 20
    const/16 v1, 0xc

    .line 21
    .line 22
    invoke-direct {v0, v1}, LE/j;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lg1/w;->a:LE/j;

    .line 26
    .line 27
    sget-object v0, Lg1/x;->w:Ljava/util/List;

    .line 28
    .line 29
    sget-object v0, Lg1/x;->w:Ljava/util/List;

    .line 30
    .line 31
    new-instance v0, Lg1/b;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lg1/w;->d:Lg1/b;

    .line 37
    .line 38
    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Lg1/w;->e:Ljava/net/ProxySelector;

    .line 43
    .line 44
    sget-object v0, Lg1/b;->b:Lg1/b;

    .line 45
    .line 46
    iput-object v0, p0, Lg1/w;->f:Lg1/b;

    .line 47
    .line 48
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Lg1/w;->h:Ljavax/net/SocketFactory;

    .line 53
    .line 54
    sget-object v0, Lq1/c;->a:Lq1/c;

    .line 55
    .line 56
    iput-object v0, p0, Lg1/w;->i:Lq1/c;

    .line 57
    .line 58
    sget-object v0, Lg1/k;->c:Lg1/k;

    .line 59
    .line 60
    iput-object v0, p0, Lg1/w;->j:Lg1/k;

    .line 61
    .line 62
    sget-object v0, Lg1/b;->a:Lg1/b;

    .line 63
    .line 64
    iput-object v0, p0, Lg1/w;->k:Lg1/b;

    .line 65
    .line 66
    iput-object v0, p0, Lg1/w;->l:Lg1/b;

    .line 67
    .line 68
    new-instance v0, Lg1/n;

    .line 69
    .line 70
    invoke-direct {v0}, Lg1/n;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object v0, p0, Lg1/w;->m:Lg1/n;

    .line 74
    .line 75
    sget-object v0, Lg1/b;->c:Lg1/b;

    .line 76
    .line 77
    iput-object v0, p0, Lg1/w;->n:Lg1/b;

    .line 78
    .line 79
    const/4 v0, 0x1

    .line 80
    iput-boolean v0, p0, Lg1/w;->o:Z

    .line 81
    .line 82
    iput-boolean v0, p0, Lg1/w;->p:Z

    .line 83
    .line 84
    iput-boolean v0, p0, Lg1/w;->q:Z

    .line 85
    .line 86
    const/16 v0, 0x2710

    .line 87
    .line 88
    iput v0, p0, Lg1/w;->r:I

    .line 89
    .line 90
    iput v0, p0, Lg1/w;->s:I

    .line 91
    .line 92
    iput v0, p0, Lg1/w;->t:I

    .line 93
    .line 94
    return-void
.end method
