.class public abstract Lr0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroid/view/animation/LinearInterpolator;

.field public static final b:La0/a;

.field public static final c:La0/a;

.field public static final d:La0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/view/animation/LinearInterpolator;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lr0/a;->a:Landroid/view/animation/LinearInterpolator;

    .line 7
    .line 8
    new-instance v0, La0/a;

    .line 9
    .line 10
    sget-object v1, La0/a;->d:[F

    .line 11
    .line 12
    invoke-direct {v0, v1}, La0/b;-><init>([F)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lr0/a;->b:La0/a;

    .line 16
    .line 17
    new-instance v0, La0/a;

    .line 18
    .line 19
    invoke-direct {v0}, La0/a;-><init>()V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lr0/a;->c:La0/a;

    .line 23
    .line 24
    new-instance v0, La0/a;

    .line 25
    .line 26
    sget-object v1, La0/a;->e:[F

    .line 27
    .line 28
    invoke-direct {v0, v1}, La0/b;-><init>([F)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lr0/a;->d:La0/a;

    .line 32
    .line 33
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    .line 34
    .line 35
    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static a(FFF)F
    .locals 0

    .line 1
    sub-float/2addr p1, p0

    .line 2
    mul-float p1, p1, p2

    .line 3
    .line 4
    add-float/2addr p1, p0

    .line 5
    return p1
.end method

.method public static b(FFFFF)F
    .locals 1

    .line 1
    cmpg-float v0, p4, p2

    .line 2
    .line 3
    if-gtz v0, :cond_0

    .line 4
    .line 5
    return p0

    .line 6
    :cond_0
    cmpl-float v0, p4, p3

    .line 7
    .line 8
    if-ltz v0, :cond_1

    .line 9
    .line 10
    return p1

    .line 11
    :cond_1
    sub-float/2addr p4, p2

    .line 12
    sub-float/2addr p3, p2

    .line 13
    div-float/2addr p4, p3

    .line 14
    invoke-static {p0, p1, p4}, Lr0/a;->a(FFF)F

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method public static c(IIF)I
    .locals 0

    .line 1
    sub-int/2addr p1, p0

    .line 2
    int-to-float p1, p1

    .line 3
    mul-float p2, p2, p1

    .line 4
    .line 5
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    add-int/2addr p1, p0

    .line 10
    return p1
.end method
