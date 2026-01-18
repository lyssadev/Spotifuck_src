.class public LK0/g;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"

# interfaces
.implements LG/g;
.implements LK0/v;


# static fields
.field public static final B:Landroid/graphics/Paint;


# instance fields
.field public final A:Z

.field public f:LK0/f;

.field public final g:[LK0/t;

.field public final h:[LK0/t;

.field public final i:Ljava/util/BitSet;

.field public j:Z

.field public final k:Landroid/graphics/Matrix;

.field public final l:Landroid/graphics/Path;

.field public final m:Landroid/graphics/Path;

.field public final n:Landroid/graphics/RectF;

.field public final o:Landroid/graphics/RectF;

.field public final p:Landroid/graphics/Region;

.field public final q:Landroid/graphics/Region;

.field public r:LK0/k;

.field public final s:Landroid/graphics/Paint;

.field public final t:Landroid/graphics/Paint;

.field public final u:LJ0/a;

.field public final v:LA/b;

.field public final w:LK0/m;

.field public x:Landroid/graphics/PorterDuffColorFilter;

.field public y:Landroid/graphics/PorterDuffColorFilter;

.field public final z:Landroid/graphics/RectF;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LK0/g;->B:Landroid/graphics/Paint;

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    .line 14
    .line 15
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->DST_OUT:Landroid/graphics/PorterDuff$Mode;

    .line 16
    .line 17
    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, LK0/k;

    invoke-direct {v0}, LK0/k;-><init>()V

    invoke-direct {p0, v0}, LK0/g;-><init>(LK0/k;)V

    return-void
.end method

.method public constructor <init>(LK0/f;)V
    .locals 5

    .line 4
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const/4 v0, 0x4

    .line 5
    new-array v1, v0, [LK0/t;

    iput-object v1, p0, LK0/g;->g:[LK0/t;

    .line 6
    new-array v0, v0, [LK0/t;

    iput-object v0, p0, LK0/g;->h:[LK0/t;

    .line 7
    new-instance v0, Ljava/util/BitSet;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    iput-object v0, p0, LK0/g;->i:Ljava/util/BitSet;

    .line 8
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, LK0/g;->k:Landroid/graphics/Matrix;

    .line 9
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, LK0/g;->l:Landroid/graphics/Path;

    .line 10
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, LK0/g;->m:Landroid/graphics/Path;

    .line 11
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, LK0/g;->n:Landroid/graphics/RectF;

    .line 12
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, LK0/g;->o:Landroid/graphics/RectF;

    .line 13
    new-instance v0, Landroid/graphics/Region;

    invoke-direct {v0}, Landroid/graphics/Region;-><init>()V

    iput-object v0, p0, LK0/g;->p:Landroid/graphics/Region;

    .line 14
    new-instance v0, Landroid/graphics/Region;

    invoke-direct {v0}, Landroid/graphics/Region;-><init>()V

    iput-object v0, p0, LK0/g;->q:Landroid/graphics/Region;

    .line 15
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, LK0/g;->s:Landroid/graphics/Paint;

    .line 16
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v2, p0, LK0/g;->t:Landroid/graphics/Paint;

    .line 17
    new-instance v3, LJ0/a;

    invoke-direct {v3}, LJ0/a;-><init>()V

    iput-object v3, p0, LK0/g;->u:LJ0/a;

    .line 18
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-virtual {v3}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    if-ne v3, v4, :cond_0

    .line 19
    sget-object v3, LK0/l;->a:LK0/m;

    goto :goto_0

    .line 20
    :cond_0
    new-instance v3, LK0/m;

    invoke-direct {v3}, LK0/m;-><init>()V

    :goto_0
    iput-object v3, p0, LK0/g;->w:LK0/m;

    .line 21
    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    iput-object v3, p0, LK0/g;->z:Landroid/graphics/RectF;

    .line 22
    iput-boolean v1, p0, LK0/g;->A:Z

    .line 23
    iput-object p1, p0, LK0/g;->f:LK0/f;

    .line 24
    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 25
    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 26
    invoke-virtual {p0}, LK0/g;->l()Z

    .line 27
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, LK0/g;->k([I)Z

    .line 28
    new-instance p1, LA/b;

    const/4 v0, 0x3

    invoke-direct {p1, v0, p0}, LA/b;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, LK0/g;->v:LA/b;

    return-void
.end method

.method public constructor <init>(LK0/k;)V
    .locals 1

    .line 3
    new-instance v0, LK0/f;

    invoke-direct {v0, p1}, LK0/f;-><init>(LK0/k;)V

    invoke-direct {p0, v0}, LK0/g;-><init>(LK0/f;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 2
    invoke-static {p1, p2, p3, p4}, LK0/k;->b(Landroid/content/Context;Landroid/util/AttributeSet;II)LK0/j;

    move-result-object p1

    invoke-virtual {p1}, LK0/j;->a()LK0/k;

    move-result-object p1

    invoke-direct {p0, p1}, LK0/g;-><init>(LK0/k;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/RectF;Landroid/graphics/Path;)V
    .locals 7

    .line 1
    iget-object v0, p0, LK0/g;->f:LK0/f;

    .line 2
    .line 3
    iget-object v2, v0, LK0/f;->a:LK0/k;

    .line 4
    .line 5
    iget v3, v0, LK0/f;->i:F

    .line 6
    .line 7
    iget-object v5, p0, LK0/g;->v:LA/b;

    .line 8
    .line 9
    iget-object v1, p0, LK0/g;->w:LK0/m;

    .line 10
    .line 11
    move-object v4, p1

    .line 12
    move-object v6, p2

    .line 13
    invoke-virtual/range {v1 .. v6}, LK0/m;->a(LK0/k;FLandroid/graphics/RectF;LA/b;Landroid/graphics/Path;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, LK0/g;->f:LK0/f;

    .line 17
    .line 18
    iget v0, v0, LK0/f;->h:F

    .line 19
    .line 20
    const/high16 v1, 0x3f800000    # 1.0f

    .line 21
    .line 22
    cmpl-float v0, v0, v1

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, LK0/g;->k:Landroid/graphics/Matrix;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, LK0/g;->f:LK0/f;

    .line 32
    .line 33
    iget v1, v1, LK0/f;->h:F

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    const/high16 v3, 0x40000000    # 2.0f

    .line 40
    .line 41
    div-float/2addr v2, v3

    .line 42
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    div-float/2addr p1, v3

    .line 47
    invoke-virtual {v0, v1, v1, v2, p1}, Landroid/graphics/Matrix;->setScale(FFFF)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    iget-object p1, p0, LK0/g;->z:Landroid/graphics/RectF;

    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    invoke-virtual {p2, p1, v0}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final b(I)I
    .locals 6

    .line 1
    iget-object v0, p0, LK0/g;->f:LK0/f;

    .line 2
    .line 3
    iget v1, v0, LK0/f;->m:F

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    add-float/2addr v1, v2

    .line 7
    iget v3, v0, LK0/f;->l:F

    .line 8
    .line 9
    add-float/2addr v1, v3

    .line 10
    iget-object v0, v0, LK0/f;->b:LD0/a;

    .line 11
    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    iget-boolean v3, v0, LD0/a;->a:Z

    .line 15
    .line 16
    if-eqz v3, :cond_3

    .line 17
    .line 18
    const/16 v3, 0xff

    .line 19
    .line 20
    invoke-static {p1, v3}, LF/a;->d(II)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    iget v5, v0, LD0/a;->d:I

    .line 25
    .line 26
    if-ne v4, v5, :cond_3

    .line 27
    .line 28
    iget v4, v0, LD0/a;->e:F

    .line 29
    .line 30
    cmpg-float v5, v4, v2

    .line 31
    .line 32
    if-lez v5, :cond_1

    .line 33
    .line 34
    cmpg-float v5, v1, v2

    .line 35
    .line 36
    if-gtz v5, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    div-float/2addr v1, v4

    .line 40
    float-to-double v4, v1

    .line 41
    invoke-static {v4, v5}, Ljava/lang/Math;->log1p(D)D

    .line 42
    .line 43
    .line 44
    move-result-wide v4

    .line 45
    double-to-float v1, v4

    .line 46
    const/high16 v4, 0x40900000    # 4.5f

    .line 47
    .line 48
    mul-float v1, v1, v4

    .line 49
    .line 50
    const/high16 v4, 0x40000000    # 2.0f

    .line 51
    .line 52
    add-float/2addr v1, v4

    .line 53
    const/high16 v4, 0x42c80000    # 100.0f

    .line 54
    .line 55
    div-float/2addr v1, v4

    .line 56
    const/high16 v4, 0x3f800000    # 1.0f

    .line 57
    .line 58
    invoke-static {v1, v4}, Ljava/lang/Math;->min(FF)F

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 64
    :goto_1
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    invoke-static {p1, v3}, LF/a;->d(II)I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    iget v3, v0, LD0/a;->b:I

    .line 73
    .line 74
    invoke-static {p1, v3, v1}, Lp0/a;->h0(IIF)I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    cmpl-float v1, v1, v2

    .line 79
    .line 80
    if-lez v1, :cond_2

    .line 81
    .line 82
    iget v0, v0, LD0/a;->c:I

    .line 83
    .line 84
    if-eqz v0, :cond_2

    .line 85
    .line 86
    sget v1, LD0/a;->f:I

    .line 87
    .line 88
    invoke-static {v0, v1}, LF/a;->d(II)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    invoke-static {v0, p1}, LF/a;->b(II)I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    :cond_2
    invoke-static {p1, v4}, LF/a;->d(II)I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    :cond_3
    return p1
.end method

.method public final c(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    iget-object v0, p0, LK0/g;->i:Ljava/util/BitSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/BitSet;->cardinality()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "g"

    .line 10
    .line 11
    const-string v1, "Compatibility shadow requested but can\'t be drawn for all operations in this shape."

    .line 12
    .line 13
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, LK0/g;->f:LK0/f;

    .line 17
    .line 18
    iget v0, v0, LK0/f;->o:I

    .line 19
    .line 20
    iget-object v1, p0, LK0/g;->l:Landroid/graphics/Path;

    .line 21
    .line 22
    iget-object v2, p0, LK0/g;->u:LJ0/a;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v0, v2, LJ0/a;->a:Landroid/graphics/Paint;

    .line 27
    .line 28
    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    const/4 v0, 0x0

    .line 32
    const/4 v3, 0x0

    .line 33
    :goto_0
    const/4 v4, 0x4

    .line 34
    if-ge v3, v4, :cond_2

    .line 35
    .line 36
    iget-object v4, p0, LK0/g;->g:[LK0/t;

    .line 37
    .line 38
    aget-object v4, v4, v3

    .line 39
    .line 40
    iget-object v5, p0, LK0/g;->f:LK0/f;

    .line 41
    .line 42
    iget v5, v5, LK0/f;->n:I

    .line 43
    .line 44
    sget-object v6, LK0/t;->b:Landroid/graphics/Matrix;

    .line 45
    .line 46
    invoke-virtual {v4, v6, v2, v5, p1}, LK0/t;->a(Landroid/graphics/Matrix;LJ0/a;ILandroid/graphics/Canvas;)V

    .line 47
    .line 48
    .line 49
    iget-object v4, p0, LK0/g;->h:[LK0/t;

    .line 50
    .line 51
    aget-object v4, v4, v3

    .line 52
    .line 53
    iget-object v5, p0, LK0/g;->f:LK0/f;

    .line 54
    .line 55
    iget v5, v5, LK0/f;->n:I

    .line 56
    .line 57
    invoke-virtual {v4, v6, v2, v5, p1}, LK0/t;->a(Landroid/graphics/Matrix;LJ0/a;ILandroid/graphics/Canvas;)V

    .line 58
    .line 59
    .line 60
    add-int/lit8 v3, v3, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    iget-boolean v2, p0, LK0/g;->A:Z

    .line 64
    .line 65
    if-eqz v2, :cond_3

    .line 66
    .line 67
    iget-object v2, p0, LK0/g;->f:LK0/f;

    .line 68
    .line 69
    iget v2, v2, LK0/f;->o:I

    .line 70
    .line 71
    int-to-double v2, v2

    .line 72
    int-to-double v4, v0

    .line 73
    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    .line 74
    .line 75
    .line 76
    move-result-wide v6

    .line 77
    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    .line 78
    .line 79
    .line 80
    move-result-wide v6

    .line 81
    mul-double v6, v6, v2

    .line 82
    .line 83
    double-to-int v0, v6

    .line 84
    iget-object v2, p0, LK0/g;->f:LK0/f;

    .line 85
    .line 86
    iget v2, v2, LK0/f;->o:I

    .line 87
    .line 88
    int-to-double v2, v2

    .line 89
    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    .line 90
    .line 91
    .line 92
    move-result-wide v4

    .line 93
    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    .line 94
    .line 95
    .line 96
    move-result-wide v4

    .line 97
    mul-double v4, v4, v2

    .line 98
    .line 99
    double-to-int v2, v4

    .line 100
    neg-int v3, v0

    .line 101
    int-to-float v3, v3

    .line 102
    neg-int v4, v2

    .line 103
    int-to-float v4, v4

    .line 104
    invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 105
    .line 106
    .line 107
    sget-object v3, LK0/g;->B:Landroid/graphics/Paint;

    .line 108
    .line 109
    invoke-virtual {p1, v1, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 110
    .line 111
    .line 112
    int-to-float v0, v0

    .line 113
    int-to-float v1, v2

    .line 114
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 115
    .line 116
    .line 117
    :cond_3
    return-void
.end method

.method public final d(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;LK0/k;Landroid/graphics/RectF;)V
    .locals 1

    .line 1
    invoke-virtual {p4, p5}, LK0/k;->d(Landroid/graphics/RectF;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p3, p4, LK0/k;->f:LK0/c;

    .line 8
    .line 9
    invoke-interface {p3, p5}, LK0/c;->a(Landroid/graphics/RectF;)F

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    iget-object p4, p0, LK0/g;->f:LK0/f;

    .line 14
    .line 15
    iget p4, p4, LK0/f;->i:F

    .line 16
    .line 17
    mul-float p3, p3, p4

    .line 18
    .line 19
    invoke-virtual {p1, p5, p3, p3, p2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p1, p3, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 19

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    iget-object v8, v6, LK0/g;->s:Landroid/graphics/Paint;

    .line 6
    .line 7
    iget-object v0, v6, LK0/g;->x:Landroid/graphics/PorterDuffColorFilter;

    .line 8
    .line 9
    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v8}, Landroid/graphics/Paint;->getAlpha()I

    .line 13
    .line 14
    .line 15
    move-result v9

    .line 16
    iget-object v0, v6, LK0/g;->f:LK0/f;

    .line 17
    .line 18
    iget v0, v0, LK0/f;->k:I

    .line 19
    .line 20
    ushr-int/lit8 v1, v0, 0x7

    .line 21
    .line 22
    add-int/2addr v0, v1

    .line 23
    mul-int v0, v0, v9

    .line 24
    .line 25
    ushr-int/lit8 v0, v0, 0x8

    .line 26
    .line 27
    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 28
    .line 29
    .line 30
    iget-object v10, v6, LK0/g;->t:Landroid/graphics/Paint;

    .line 31
    .line 32
    iget-object v0, v6, LK0/g;->y:Landroid/graphics/PorterDuffColorFilter;

    .line 33
    .line 34
    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 35
    .line 36
    .line 37
    iget-object v0, v6, LK0/g;->f:LK0/f;

    .line 38
    .line 39
    iget v0, v0, LK0/f;->j:F

    .line 40
    .line 41
    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v10}, Landroid/graphics/Paint;->getAlpha()I

    .line 45
    .line 46
    .line 47
    move-result v11

    .line 48
    iget-object v0, v6, LK0/g;->f:LK0/f;

    .line 49
    .line 50
    iget v0, v0, LK0/f;->k:I

    .line 51
    .line 52
    ushr-int/lit8 v1, v0, 0x7

    .line 53
    .line 54
    add-int/2addr v0, v1

    .line 55
    mul-int v0, v0, v11

    .line 56
    .line 57
    ushr-int/lit8 v0, v0, 0x8

    .line 58
    .line 59
    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 60
    .line 61
    .line 62
    iget-boolean v0, v6, LK0/g;->j:Z

    .line 63
    .line 64
    iget-object v3, v6, LK0/g;->l:Landroid/graphics/Path;

    .line 65
    .line 66
    const/4 v1, 0x0

    .line 67
    if-eqz v0, :cond_6

    .line 68
    .line 69
    invoke-virtual/range {p0 .. p0}, LK0/g;->g()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    const/4 v2, 0x0

    .line 74
    const/high16 v4, 0x40000000    # 2.0f

    .line 75
    .line 76
    if-eqz v0, :cond_0

    .line 77
    .line 78
    invoke-virtual {v10}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    div-float/2addr v0, v4

    .line 83
    goto :goto_0

    .line 84
    :cond_0
    const/4 v0, 0x0

    .line 85
    :goto_0
    neg-float v0, v0

    .line 86
    iget-object v5, v6, LK0/g;->f:LK0/f;

    .line 87
    .line 88
    iget-object v5, v5, LK0/f;->a:LK0/k;

    .line 89
    .line 90
    invoke-virtual {v5}, LK0/k;->e()LK0/j;

    .line 91
    .line 92
    .line 93
    move-result-object v12

    .line 94
    iget-object v13, v5, LK0/k;->e:LK0/c;

    .line 95
    .line 96
    instance-of v14, v13, LK0/h;

    .line 97
    .line 98
    if-eqz v14, :cond_1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_1
    new-instance v14, LK0/b;

    .line 102
    .line 103
    invoke-direct {v14, v0, v13}, LK0/b;-><init>(FLK0/c;)V

    .line 104
    .line 105
    .line 106
    move-object v13, v14

    .line 107
    :goto_1
    iput-object v13, v12, LK0/j;->e:LK0/c;

    .line 108
    .line 109
    iget-object v13, v5, LK0/k;->f:LK0/c;

    .line 110
    .line 111
    instance-of v14, v13, LK0/h;

    .line 112
    .line 113
    if-eqz v14, :cond_2

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_2
    new-instance v14, LK0/b;

    .line 117
    .line 118
    invoke-direct {v14, v0, v13}, LK0/b;-><init>(FLK0/c;)V

    .line 119
    .line 120
    .line 121
    move-object v13, v14

    .line 122
    :goto_2
    iput-object v13, v12, LK0/j;->f:LK0/c;

    .line 123
    .line 124
    iget-object v13, v5, LK0/k;->h:LK0/c;

    .line 125
    .line 126
    instance-of v14, v13, LK0/h;

    .line 127
    .line 128
    if-eqz v14, :cond_3

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_3
    new-instance v14, LK0/b;

    .line 132
    .line 133
    invoke-direct {v14, v0, v13}, LK0/b;-><init>(FLK0/c;)V

    .line 134
    .line 135
    .line 136
    move-object v13, v14

    .line 137
    :goto_3
    iput-object v13, v12, LK0/j;->h:LK0/c;

    .line 138
    .line 139
    iget-object v5, v5, LK0/k;->g:LK0/c;

    .line 140
    .line 141
    instance-of v13, v5, LK0/h;

    .line 142
    .line 143
    if-eqz v13, :cond_4

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_4
    new-instance v13, LK0/b;

    .line 147
    .line 148
    invoke-direct {v13, v0, v5}, LK0/b;-><init>(FLK0/c;)V

    .line 149
    .line 150
    .line 151
    move-object v5, v13

    .line 152
    :goto_4
    iput-object v5, v12, LK0/j;->g:LK0/c;

    .line 153
    .line 154
    invoke-virtual {v12}, LK0/j;->a()LK0/k;

    .line 155
    .line 156
    .line 157
    move-result-object v14

    .line 158
    iput-object v14, v6, LK0/g;->r:LK0/k;

    .line 159
    .line 160
    iget-object v0, v6, LK0/g;->f:LK0/f;

    .line 161
    .line 162
    iget v15, v0, LK0/f;->i:F

    .line 163
    .line 164
    iget-object v0, v6, LK0/g;->o:Landroid/graphics/RectF;

    .line 165
    .line 166
    invoke-virtual/range {p0 .. p0}, LK0/g;->f()Landroid/graphics/RectF;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    invoke-virtual {v0, v5}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {p0 .. p0}, LK0/g;->g()Z

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    if-eqz v5, :cond_5

    .line 178
    .line 179
    invoke-virtual {v10}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    div-float/2addr v2, v4

    .line 184
    :cond_5
    invoke-virtual {v0, v2, v2}, Landroid/graphics/RectF;->inset(FF)V

    .line 185
    .line 186
    .line 187
    iget-object v2, v6, LK0/g;->m:Landroid/graphics/Path;

    .line 188
    .line 189
    const/16 v17, 0x0

    .line 190
    .line 191
    iget-object v13, v6, LK0/g;->w:LK0/m;

    .line 192
    .line 193
    move-object/from16 v16, v0

    .line 194
    .line 195
    move-object/from16 v18, v2

    .line 196
    .line 197
    invoke-virtual/range {v13 .. v18}, LK0/m;->a(LK0/k;FLandroid/graphics/RectF;LA/b;Landroid/graphics/Path;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {p0 .. p0}, LK0/g;->f()Landroid/graphics/RectF;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-virtual {v6, v0, v3}, LK0/g;->a(Landroid/graphics/RectF;Landroid/graphics/Path;)V

    .line 205
    .line 206
    .line 207
    iput-boolean v1, v6, LK0/g;->j:Z

    .line 208
    .line 209
    :cond_6
    iget-object v0, v6, LK0/g;->f:LK0/f;

    .line 210
    .line 211
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    iget v0, v0, LK0/f;->n:I

    .line 215
    .line 216
    if-lez v0, :cond_9

    .line 217
    .line 218
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 219
    .line 220
    iget-object v2, v6, LK0/g;->f:LK0/f;

    .line 221
    .line 222
    iget-object v2, v2, LK0/f;->a:LK0/k;

    .line 223
    .line 224
    invoke-virtual/range {p0 .. p0}, LK0/g;->f()Landroid/graphics/RectF;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    invoke-virtual {v2, v4}, LK0/k;->d(Landroid/graphics/RectF;)Z

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    if-nez v2, :cond_9

    .line 233
    .line 234
    invoke-virtual {v3}, Landroid/graphics/Path;->isConvex()Z

    .line 235
    .line 236
    .line 237
    move-result v2

    .line 238
    if-nez v2, :cond_9

    .line 239
    .line 240
    const/16 v2, 0x1d

    .line 241
    .line 242
    if-ge v0, v2, :cond_9

    .line 243
    .line 244
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 245
    .line 246
    .line 247
    iget-object v0, v6, LK0/g;->f:LK0/f;

    .line 248
    .line 249
    iget v0, v0, LK0/f;->o:I

    .line 250
    .line 251
    int-to-double v4, v0

    .line 252
    int-to-double v0, v1

    .line 253
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    .line 254
    .line 255
    .line 256
    move-result-wide v12

    .line 257
    invoke-static {v12, v13}, Ljava/lang/Math;->sin(D)D

    .line 258
    .line 259
    .line 260
    move-result-wide v12

    .line 261
    mul-double v12, v12, v4

    .line 262
    .line 263
    double-to-int v2, v12

    .line 264
    iget-object v4, v6, LK0/g;->f:LK0/f;

    .line 265
    .line 266
    iget v4, v4, LK0/f;->o:I

    .line 267
    .line 268
    int-to-double v4, v4

    .line 269
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    .line 270
    .line 271
    .line 272
    move-result-wide v0

    .line 273
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    .line 274
    .line 275
    .line 276
    move-result-wide v0

    .line 277
    mul-double v0, v0, v4

    .line 278
    .line 279
    double-to-int v0, v0

    .line 280
    int-to-float v1, v2

    .line 281
    int-to-float v0, v0

    .line 282
    invoke-virtual {v7, v1, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 283
    .line 284
    .line 285
    iget-boolean v0, v6, LK0/g;->A:Z

    .line 286
    .line 287
    if-nez v0, :cond_7

    .line 288
    .line 289
    invoke-virtual/range {p0 .. p1}, LK0/g;->c(Landroid/graphics/Canvas;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    .line 293
    .line 294
    .line 295
    goto/16 :goto_5

    .line 296
    .line 297
    :cond_7
    iget-object v0, v6, LK0/g;->z:Landroid/graphics/RectF;

    .line 298
    .line 299
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 300
    .line 301
    .line 302
    move-result v1

    .line 303
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 308
    .line 309
    .line 310
    move-result v2

    .line 311
    int-to-float v2, v2

    .line 312
    sub-float/2addr v1, v2

    .line 313
    float-to-int v1, v1

    .line 314
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 315
    .line 316
    .line 317
    move-result v2

    .line 318
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    .line 323
    .line 324
    .line 325
    move-result v4

    .line 326
    int-to-float v4, v4

    .line 327
    sub-float/2addr v2, v4

    .line 328
    float-to-int v2, v2

    .line 329
    if-ltz v1, :cond_8

    .line 330
    .line 331
    if-ltz v2, :cond_8

    .line 332
    .line 333
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 334
    .line 335
    .line 336
    move-result v4

    .line 337
    float-to-int v4, v4

    .line 338
    iget-object v5, v6, LK0/g;->f:LK0/f;

    .line 339
    .line 340
    iget v5, v5, LK0/f;->n:I

    .line 341
    .line 342
    mul-int/lit8 v5, v5, 0x2

    .line 343
    .line 344
    add-int/2addr v5, v4

    .line 345
    add-int/2addr v5, v1

    .line 346
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 347
    .line 348
    .line 349
    move-result v0

    .line 350
    float-to-int v0, v0

    .line 351
    iget-object v4, v6, LK0/g;->f:LK0/f;

    .line 352
    .line 353
    iget v4, v4, LK0/f;->n:I

    .line 354
    .line 355
    mul-int/lit8 v4, v4, 0x2

    .line 356
    .line 357
    add-int/2addr v4, v0

    .line 358
    add-int/2addr v4, v2

    .line 359
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 360
    .line 361
    invoke-static {v5, v4, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    new-instance v4, Landroid/graphics/Canvas;

    .line 366
    .line 367
    invoke-direct {v4, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 371
    .line 372
    .line 373
    move-result-object v5

    .line 374
    iget v5, v5, Landroid/graphics/Rect;->left:I

    .line 375
    .line 376
    iget-object v12, v6, LK0/g;->f:LK0/f;

    .line 377
    .line 378
    iget v12, v12, LK0/f;->n:I

    .line 379
    .line 380
    sub-int/2addr v5, v12

    .line 381
    sub-int/2addr v5, v1

    .line 382
    int-to-float v1, v5

    .line 383
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 384
    .line 385
    .line 386
    move-result-object v5

    .line 387
    iget v5, v5, Landroid/graphics/Rect;->top:I

    .line 388
    .line 389
    iget-object v12, v6, LK0/g;->f:LK0/f;

    .line 390
    .line 391
    iget v12, v12, LK0/f;->n:I

    .line 392
    .line 393
    sub-int/2addr v5, v12

    .line 394
    sub-int/2addr v5, v2

    .line 395
    int-to-float v2, v5

    .line 396
    neg-float v5, v1

    .line 397
    neg-float v12, v2

    .line 398
    invoke-virtual {v4, v5, v12}, Landroid/graphics/Canvas;->translate(FF)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v6, v4}, LK0/g;->c(Landroid/graphics/Canvas;)V

    .line 402
    .line 403
    .line 404
    const/4 v4, 0x0

    .line 405
    invoke-virtual {v7, v0, v1, v2, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    .line 412
    .line 413
    .line 414
    goto :goto_5

    .line 415
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 416
    .line 417
    const-string v1, "Invalid shadow bounds. Check that the treatments result in a valid path."

    .line 418
    .line 419
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    throw v0

    .line 423
    :cond_9
    :goto_5
    iget-object v0, v6, LK0/g;->f:LK0/f;

    .line 424
    .line 425
    iget-object v1, v0, LK0/f;->p:Landroid/graphics/Paint$Style;

    .line 426
    .line 427
    sget-object v2, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    .line 428
    .line 429
    if-eq v1, v2, :cond_a

    .line 430
    .line 431
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 432
    .line 433
    if-ne v1, v2, :cond_b

    .line 434
    .line 435
    :cond_a
    iget-object v4, v0, LK0/f;->a:LK0/k;

    .line 436
    .line 437
    invoke-virtual/range {p0 .. p0}, LK0/g;->f()Landroid/graphics/RectF;

    .line 438
    .line 439
    .line 440
    move-result-object v5

    .line 441
    move-object/from16 v0, p0

    .line 442
    .line 443
    move-object/from16 v1, p1

    .line 444
    .line 445
    move-object v2, v8

    .line 446
    invoke-virtual/range {v0 .. v5}, LK0/g;->d(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;LK0/k;Landroid/graphics/RectF;)V

    .line 447
    .line 448
    .line 449
    :cond_b
    invoke-virtual/range {p0 .. p0}, LK0/g;->g()Z

    .line 450
    .line 451
    .line 452
    move-result v0

    .line 453
    if-eqz v0, :cond_c

    .line 454
    .line 455
    invoke-virtual/range {p0 .. p1}, LK0/g;->e(Landroid/graphics/Canvas;)V

    .line 456
    .line 457
    .line 458
    :cond_c
    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v10, v11}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 462
    .line 463
    .line 464
    return-void
.end method

.method public e(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    iget-object v2, p0, LK0/g;->t:Landroid/graphics/Paint;

    .line 2
    .line 3
    iget-object v3, p0, LK0/g;->m:Landroid/graphics/Path;

    .line 4
    .line 5
    iget-object v4, p0, LK0/g;->r:LK0/k;

    .line 6
    .line 7
    iget-object v5, p0, LK0/g;->o:Landroid/graphics/RectF;

    .line 8
    .line 9
    invoke-virtual {p0}, LK0/g;->f()Landroid/graphics/RectF;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v5, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, LK0/g;->g()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v2}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/high16 v1, 0x40000000    # 2.0f

    .line 27
    .line 28
    div-float/2addr v0, v1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    :goto_0
    invoke-virtual {v5, v0, v0}, Landroid/graphics/RectF;->inset(FF)V

    .line 32
    .line 33
    .line 34
    move-object v0, p0

    .line 35
    move-object v1, p1

    .line 36
    invoke-virtual/range {v0 .. v5}, LK0/g;->d(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;LK0/k;Landroid/graphics/RectF;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final f()Landroid/graphics/RectF;
    .locals 2

    .line 1
    iget-object v0, p0, LK0/g;->n:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final g()Z
    .locals 2

    .line 1
    iget-object v0, p0, LK0/g;->f:LK0/f;

    .line 2
    .line 3
    iget-object v0, v0, LK0/f;->p:Landroid/graphics/Paint$Style;

    .line 4
    .line 5
    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, LK0/g;->t:Landroid/graphics/Paint;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    cmpl-float v0, v0, v1

    .line 21
    .line 22
    if-lez v0, :cond_1

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    :goto_0
    return v0
.end method

.method public getAlpha()I
    .locals 1

    .line 1
    iget-object v0, p0, LK0/g;->f:LK0/f;

    .line 2
    .line 3
    iget v0, v0, LK0/f;->k:I

    .line 4
    .line 5
    return v0
.end method

.method public final getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/g;->f:LK0/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public getOpacity()I
    .locals 1

    .line 1
    const/4 v0, -0x3

    .line 2
    return v0
.end method

.method public getOutline(Landroid/graphics/Outline;)V
    .locals 3

    .line 1
    iget-object v0, p0, LK0/g;->f:LK0/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LK0/g;->f:LK0/f;

    .line 7
    .line 8
    iget-object v0, v0, LK0/f;->a:LK0/k;

    .line 9
    .line 10
    invoke-virtual {p0}, LK0/g;->f()Landroid/graphics/RectF;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, LK0/k;->d(Landroid/graphics/RectF;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, LK0/g;->f:LK0/f;

    .line 21
    .line 22
    iget-object v0, v0, LK0/f;->a:LK0/k;

    .line 23
    .line 24
    iget-object v0, v0, LK0/k;->e:LK0/c;

    .line 25
    .line 26
    invoke-virtual {p0}, LK0/g;->f()Landroid/graphics/RectF;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {v0, v1}, LK0/c;->a(Landroid/graphics/RectF;)F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v1, p0, LK0/g;->f:LK0/f;

    .line 35
    .line 36
    iget v1, v1, LK0/f;->i:F

    .line 37
    .line 38
    mul-float v0, v0, v1

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {p1, v1, v0}, Landroid/graphics/Outline;->setRoundRect(Landroid/graphics/Rect;F)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    invoke-virtual {p0}, LK0/g;->f()Landroid/graphics/RectF;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object v1, p0, LK0/g;->l:Landroid/graphics/Path;

    .line 53
    .line 54
    invoke-virtual {p0, v0, v1}, LK0/g;->a(Landroid/graphics/RectF;Landroid/graphics/Path;)V

    .line 55
    .line 56
    .line 57
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 58
    .line 59
    const/16 v2, 0x1e

    .line 60
    .line 61
    if-lt v0, v2, :cond_1

    .line 62
    .line 63
    invoke-static {p1, v1}, LC0/d;->a(Landroid/graphics/Outline;Landroid/graphics/Path;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    const/16 v2, 0x1d

    .line 68
    .line 69
    if-lt v0, v2, :cond_2

    .line 70
    .line 71
    :try_start_0
    invoke-static {p1, v1}, LC0/b;->a(Landroid/graphics/Outline;Landroid/graphics/Path;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    invoke-virtual {v1}, Landroid/graphics/Path;->isConvex()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_3

    .line 80
    .line 81
    invoke-static {p1, v1}, LC0/b;->a(Landroid/graphics/Outline;Landroid/graphics/Path;)V

    .line 82
    .line 83
    .line 84
    :catch_0
    :cond_3
    :goto_0
    return-void
.end method

.method public final getPadding(Landroid/graphics/Rect;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LK0/g;->f:LK0/f;

    .line 2
    .line 3
    iget-object v0, v0, LK0/f;->g:Landroid/graphics/Rect;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    return p1

    .line 12
    :cond_0
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
.end method

.method public final getTransparentRegion()Landroid/graphics/Region;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LK0/g;->p:Landroid/graphics/Region;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/graphics/Region;->set(Landroid/graphics/Rect;)Z

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LK0/g;->f()Landroid/graphics/RectF;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v2, p0, LK0/g;->l:Landroid/graphics/Path;

    .line 15
    .line 16
    invoke-virtual {p0, v0, v2}, LK0/g;->a(Landroid/graphics/RectF;Landroid/graphics/Path;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, LK0/g;->q:Landroid/graphics/Region;

    .line 20
    .line 21
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Region;->setPath(Landroid/graphics/Path;Landroid/graphics/Region;)Z

    .line 22
    .line 23
    .line 24
    sget-object v2, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    .line 25
    .line 26
    invoke-virtual {v1, v0, v2}, Landroid/graphics/Region;->op(Landroid/graphics/Region;Landroid/graphics/Region$Op;)Z

    .line 27
    .line 28
    .line 29
    return-object v1
.end method

.method public final h(Landroid/content/Context;)V
    .locals 2

    .line 1
    iget-object v0, p0, LK0/g;->f:LK0/f;

    .line 2
    .line 3
    new-instance v1, LD0/a;

    .line 4
    .line 5
    invoke-direct {v1, p1}, LD0/a;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iput-object v1, v0, LK0/f;->b:LD0/a;

    .line 9
    .line 10
    invoke-virtual {p0}, LK0/g;->m()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final i(F)V
    .locals 2

    .line 1
    iget-object v0, p0, LK0/g;->f:LK0/f;

    .line 2
    .line 3
    iget v1, v0, LK0/f;->m:F

    .line 4
    .line 5
    cmpl-float v1, v1, p1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput p1, v0, LK0/f;->m:F

    .line 10
    .line 11
    invoke-virtual {p0}, LK0/g;->m()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final invalidateSelf()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LK0/g;->j:Z

    .line 3
    .line 4
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public isStateful()Z
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    iget-object v0, p0, LK0/g;->f:LK0/f;

    .line 8
    .line 9
    iget-object v0, v0, LK0/f;->e:Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_3

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, LK0/g;->f:LK0/f;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, LK0/g;->f:LK0/f;

    .line 25
    .line 26
    iget-object v0, v0, LK0/f;->d:Landroid/content/res/ColorStateList;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    :cond_1
    iget-object v0, p0, LK0/g;->f:LK0/f;

    .line 37
    .line 38
    iget-object v0, v0, LK0/f;->c:Landroid/content/res/ColorStateList;

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const/4 v0, 0x0

    .line 50
    goto :goto_1

    .line 51
    :cond_3
    :goto_0
    const/4 v0, 0x1

    .line 52
    :goto_1
    return v0
.end method

.method public final j(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    iget-object v0, p0, LK0/g;->f:LK0/f;

    .line 2
    .line 3
    iget-object v1, v0, LK0/f;->c:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput-object p1, v0, LK0/f;->c:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, LK0/g;->onStateChange([I)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final k([I)Z
    .locals 5

    .line 1
    iget-object v0, p0, LK0/g;->f:LK0/f;

    .line 2
    .line 3
    iget-object v0, v0, LK0/f;->c:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, LK0/g;->s:Landroid/graphics/Paint;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    iget-object v3, p0, LK0/g;->f:LK0/f;

    .line 15
    .line 16
    iget-object v3, v3, LK0/f;->c:Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    invoke-virtual {v3, p1, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eq v2, v3, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    :goto_0
    iget-object v2, p0, LK0/g;->f:LK0/f;

    .line 31
    .line 32
    iget-object v2, v2, LK0/f;->d:Landroid/content/res/ColorStateList;

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    iget-object v2, p0, LK0/g;->t:Landroid/graphics/Paint;

    .line 37
    .line 38
    invoke-virtual {v2}, Landroid/graphics/Paint;->getColor()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    iget-object v4, p0, LK0/g;->f:LK0/f;

    .line 43
    .line 44
    iget-object v4, v4, LK0/f;->d:Landroid/content/res/ColorStateList;

    .line 45
    .line 46
    invoke-virtual {v4, p1, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eq v3, p1, :cond_1

    .line 51
    .line 52
    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move v1, v0

    .line 57
    :goto_1
    return v1
.end method

.method public final l()Z
    .locals 7

    .line 1
    iget-object v0, p0, LK0/g;->x:Landroid/graphics/PorterDuffColorFilter;

    .line 2
    .line 3
    iget-object v1, p0, LK0/g;->y:Landroid/graphics/PorterDuffColorFilter;

    .line 4
    .line 5
    iget-object v2, p0, LK0/g;->f:LK0/f;

    .line 6
    .line 7
    iget-object v3, v2, LK0/f;->e:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    iget-object v2, v2, LK0/f;->f:Landroid/graphics/PorterDuff$Mode;

    .line 10
    .line 11
    iget-object v4, p0, LK0/g;->s:Landroid/graphics/Paint;

    .line 12
    .line 13
    const/4 v5, 0x1

    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    const/4 v6, 0x0

    .line 24
    invoke-virtual {v3, v4, v6}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {p0, v3}, LK0/g;->b(I)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    new-instance v4, Landroid/graphics/PorterDuffColorFilter;

    .line 33
    .line 34
    invoke-direct {v4, v3, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 35
    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_1
    :goto_0
    invoke-virtual {v4}, Landroid/graphics/Paint;->getColor()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-virtual {p0, v2}, LK0/g;->b(I)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eq v3, v2, :cond_2

    .line 47
    .line 48
    new-instance v2, Landroid/graphics/PorterDuffColorFilter;

    .line 49
    .line 50
    sget-object v4, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 51
    .line 52
    invoke-direct {v2, v3, v4}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 53
    .line 54
    .line 55
    :goto_1
    move-object v4, v2

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    const/4 v2, 0x0

    .line 58
    goto :goto_1

    .line 59
    :goto_2
    iput-object v4, p0, LK0/g;->x:Landroid/graphics/PorterDuffColorFilter;

    .line 60
    .line 61
    iget-object v2, p0, LK0/g;->f:LK0/f;

    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    const/4 v2, 0x0

    .line 67
    iput-object v2, p0, LK0/g;->y:Landroid/graphics/PorterDuffColorFilter;

    .line 68
    .line 69
    iget-object v2, p0, LK0/g;->f:LK0/f;

    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object v2, p0, LK0/g;->x:Landroid/graphics/PorterDuffColorFilter;

    .line 75
    .line 76
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    iget-object v0, p0, LK0/g;->y:Landroid/graphics/PorterDuffColorFilter;

    .line 83
    .line 84
    invoke-static {v1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_3

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_3
    const/4 v5, 0x0

    .line 92
    :cond_4
    :goto_3
    return v5
.end method

.method public final m()V
    .locals 4

    .line 1
    iget-object v0, p0, LK0/g;->f:LK0/f;

    .line 2
    .line 3
    iget v1, v0, LK0/f;->m:F

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    add-float/2addr v1, v2

    .line 7
    const/high16 v2, 0x3f400000    # 0.75f

    .line 8
    .line 9
    mul-float v2, v2, v1

    .line 10
    .line 11
    float-to-double v2, v2

    .line 12
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    double-to-int v2, v2

    .line 17
    iput v2, v0, LK0/f;->n:I

    .line 18
    .line 19
    iget-object v0, p0, LK0/g;->f:LK0/f;

    .line 20
    .line 21
    const/high16 v2, 0x3e800000    # 0.25f

    .line 22
    .line 23
    mul-float v1, v1, v2

    .line 24
    .line 25
    float-to-double v1, v1

    .line 26
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 27
    .line 28
    .line 29
    move-result-wide v1

    .line 30
    double-to-int v1, v1

    .line 31
    iput v1, v0, LK0/f;->o:I

    .line 32
    .line 33
    invoke-virtual {p0}, LK0/g;->l()Z

    .line 34
    .line 35
    .line 36
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public mutate()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    new-instance v0, LK0/f;

    .line 2
    .line 3
    iget-object v1, p0, LK0/g;->f:LK0/f;

    .line 4
    .line 5
    invoke-direct {v0, v1}, LK0/f;-><init>(LK0/f;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, LK0/g;->f:LK0/f;

    .line 9
    .line 10
    return-object p0
.end method

.method public final onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LK0/g;->j:Z

    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onStateChange([I)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, LK0/g;->k([I)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, LK0/g;->l()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 17
    :goto_1
    if-eqz p1, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0}, LK0/g;->invalidateSelf()V

    .line 20
    .line 21
    .line 22
    :cond_2
    return p1
.end method

.method public setAlpha(I)V
    .locals 2

    .line 1
    iget-object v0, p0, LK0/g;->f:LK0/f;

    .line 2
    .line 3
    iget v1, v0, LK0/f;->k:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput p1, v0, LK0/f;->k:I

    .line 8
    .line 9
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 1
    iget-object p1, p0, LK0/g;->f:LK0/f;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setShapeAppearanceModel(LK0/k;)V
    .locals 1

    .line 1
    iget-object v0, p0, LK0/g;->f:LK0/f;

    .line 2
    .line 3
    iput-object p1, v0, LK0/f;->a:LK0/k;

    .line 4
    .line 5
    invoke-virtual {p0}, LK0/g;->invalidateSelf()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setTint(I)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, LK0/g;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, LK0/g;->f:LK0/f;

    .line 2
    .line 3
    iput-object p1, v0, LK0/f;->e:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    invoke-virtual {p0}, LK0/g;->l()Z

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    .line 1
    iget-object v0, p0, LK0/g;->f:LK0/f;

    .line 2
    .line 3
    iget-object v1, v0, LK0/f;->f:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput-object p1, v0, LK0/f;->f:Landroid/graphics/PorterDuff$Mode;

    .line 8
    .line 9
    invoke-virtual {p0}, LK0/g;->l()Z

    .line 10
    .line 11
    .line 12
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method
