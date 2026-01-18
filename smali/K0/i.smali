.class public final LK0/i;
.super Lp0/a;
.source "SourceFile"


# virtual methods
.method public final M(LK0/u;FF)V
    .locals 6

    .line 1
    mul-float v0, p3, p2

    .line 2
    .line 3
    const/high16 v1, 0x43340000    # 180.0f

    .line 4
    .line 5
    const/high16 v2, 0x42b40000    # 90.0f

    .line 6
    .line 7
    invoke-virtual {p1, v0, v1, v2}, LK0/u;->d(FFF)V

    .line 8
    .line 9
    .line 10
    const/high16 v0, 0x40000000    # 2.0f

    .line 11
    .line 12
    mul-float p3, p3, v0

    .line 13
    .line 14
    mul-float p3, p3, p2

    .line 15
    .line 16
    new-instance p2, LK0/q;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-direct {p2, v3, v3, p3, p3}, LK0/q;-><init>(FFFF)V

    .line 20
    .line 21
    .line 22
    iput v1, p2, LK0/q;->f:F

    .line 23
    .line 24
    iput v2, p2, LK0/q;->g:F

    .line 25
    .line 26
    iget-object v2, p1, LK0/u;->f:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    new-instance v2, LK0/o;

    .line 32
    .line 33
    invoke-direct {v2, p2}, LK0/o;-><init>(LK0/q;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v1}, LK0/u;->a(F)V

    .line 37
    .line 38
    .line 39
    iget-object p2, p1, LK0/u;->g:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    const/high16 p2, 0x43870000    # 270.0f

    .line 45
    .line 46
    iput p2, p1, LK0/u;->d:F

    .line 47
    .line 48
    add-float v1, v3, p3

    .line 49
    .line 50
    const/high16 v2, 0x3f000000    # 0.5f

    .line 51
    .line 52
    mul-float v1, v1, v2

    .line 53
    .line 54
    sub-float/2addr p3, v3

    .line 55
    div-float/2addr p3, v0

    .line 56
    float-to-double v2, p2

    .line 57
    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    .line 58
    .line 59
    .line 60
    move-result-wide v4

    .line 61
    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    .line 62
    .line 63
    .line 64
    move-result-wide v4

    .line 65
    double-to-float p2, v4

    .line 66
    mul-float p2, p2, p3

    .line 67
    .line 68
    add-float/2addr p2, v1

    .line 69
    iput p2, p1, LK0/u;->b:F

    .line 70
    .line 71
    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    .line 72
    .line 73
    .line 74
    move-result-wide v2

    .line 75
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 76
    .line 77
    .line 78
    move-result-wide v2

    .line 79
    double-to-float p2, v2

    .line 80
    mul-float p3, p3, p2

    .line 81
    .line 82
    add-float/2addr p3, v1

    .line 83
    iput p3, p1, LK0/u;->c:F

    .line 84
    .line 85
    return-void
.end method
