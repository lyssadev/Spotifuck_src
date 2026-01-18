.class public final LK0/p;
.super LK0/t;
.source "SourceFile"


# instance fields
.field public final c:LK0/r;

.field public final d:F

.field public final e:F


# direct methods
.method public constructor <init>(LK0/r;FF)V
    .locals 0

    .line 1
    invoke-direct {p0}, LK0/t;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LK0/p;->c:LK0/r;

    .line 5
    .line 6
    iput p2, p0, LK0/p;->d:F

    .line 7
    .line 8
    iput p3, p0, LK0/p;->e:F

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Matrix;LJ0/a;ILandroid/graphics/Canvas;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    iget-object v4, v0, LK0/p;->c:LK0/r;

    .line 10
    .line 11
    iget v5, v4, LK0/r;->c:F

    .line 12
    .line 13
    iget v6, v0, LK0/p;->e:F

    .line 14
    .line 15
    sub-float/2addr v5, v6

    .line 16
    iget v4, v4, LK0/r;->b:F

    .line 17
    .line 18
    iget v7, v0, LK0/p;->d:F

    .line 19
    .line 20
    sub-float/2addr v4, v7

    .line 21
    new-instance v8, Landroid/graphics/RectF;

    .line 22
    .line 23
    float-to-double v9, v5

    .line 24
    float-to-double v4, v4

    .line 25
    invoke-static {v9, v10, v4, v5}, Ljava/lang/Math;->hypot(DD)D

    .line 26
    .line 27
    .line 28
    move-result-wide v4

    .line 29
    double-to-float v4, v4

    .line 30
    const/4 v5, 0x0

    .line 31
    invoke-direct {v8, v5, v5, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 32
    .line 33
    .line 34
    iget-object v4, v0, LK0/t;->a:Landroid/graphics/Matrix;

    .line 35
    .line 36
    move-object/from16 v9, p1

    .line 37
    .line 38
    invoke-virtual {v4, v9}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4, v7, v6}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 42
    .line 43
    .line 44
    invoke-virtual/range {p0 .. p0}, LK0/p;->b()F

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    invoke-virtual {v4, v6}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 49
    .line 50
    .line 51
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iget v6, v8, Landroid/graphics/RectF;->bottom:F

    .line 55
    .line 56
    int-to-float v7, v2

    .line 57
    add-float/2addr v6, v7

    .line 58
    iput v6, v8, Landroid/graphics/RectF;->bottom:F

    .line 59
    .line 60
    neg-int v2, v2

    .line 61
    int-to-float v2, v2

    .line 62
    invoke-virtual {v8, v5, v2}, Landroid/graphics/RectF;->offset(FF)V

    .line 63
    .line 64
    .line 65
    sget-object v14, LJ0/a;->i:[I

    .line 66
    .line 67
    const/4 v2, 0x0

    .line 68
    iget v5, v1, LJ0/a;->f:I

    .line 69
    .line 70
    aput v5, v14, v2

    .line 71
    .line 72
    const/4 v2, 0x1

    .line 73
    iget v5, v1, LJ0/a;->e:I

    .line 74
    .line 75
    aput v5, v14, v2

    .line 76
    .line 77
    const/4 v2, 0x2

    .line 78
    iget v5, v1, LJ0/a;->d:I

    .line 79
    .line 80
    aput v5, v14, v2

    .line 81
    .line 82
    iget-object v1, v1, LJ0/a;->c:Landroid/graphics/Paint;

    .line 83
    .line 84
    new-instance v2, Landroid/graphics/LinearGradient;

    .line 85
    .line 86
    iget v12, v8, Landroid/graphics/RectF;->left:F

    .line 87
    .line 88
    iget v11, v8, Landroid/graphics/RectF;->top:F

    .line 89
    .line 90
    iget v13, v8, Landroid/graphics/RectF;->bottom:F

    .line 91
    .line 92
    sget-object v15, LJ0/a;->j:[F

    .line 93
    .line 94
    sget-object v16, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 95
    .line 96
    move-object v9, v2

    .line 97
    move v10, v12

    .line 98
    invoke-direct/range {v9 .. v16}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 102
    .line 103
    .line 104
    invoke-virtual/range {p4 .. p4}, Landroid/graphics/Canvas;->save()I

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3, v4}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3, v8, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {p4 .. p4}, Landroid/graphics/Canvas;->restore()V

    .line 114
    .line 115
    .line 116
    return-void
.end method

.method public final b()F
    .locals 3

    .line 1
    iget-object v0, p0, LK0/p;->c:LK0/r;

    .line 2
    .line 3
    iget v1, v0, LK0/r;->c:F

    .line 4
    .line 5
    iget v2, p0, LK0/p;->e:F

    .line 6
    .line 7
    sub-float/2addr v1, v2

    .line 8
    iget v0, v0, LK0/r;->b:F

    .line 9
    .line 10
    iget v2, p0, LK0/p;->d:F

    .line 11
    .line 12
    sub-float/2addr v0, v2

    .line 13
    div-float/2addr v1, v0

    .line 14
    float-to-double v0, v1

    .line 15
    invoke-static {v0, v1}, Ljava/lang/Math;->atan(D)D

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    invoke-static {v0, v1}, Ljava/lang/Math;->toDegrees(D)D

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    double-to-float v0, v0

    .line 24
    return v0
.end method
