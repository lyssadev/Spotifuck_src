.class public final LN0/g;
.super LK0/f;
.source "SourceFile"


# instance fields
.field public final q:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(LK0/k;Landroid/graphics/RectF;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LK0/f;-><init>(LK0/k;)V

    .line 2
    iput-object p2, p0, LN0/g;->q:Landroid/graphics/RectF;

    return-void
.end method

.method public constructor <init>(LN0/g;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, LK0/f;-><init>(LK0/f;)V

    .line 4
    iget-object p1, p1, LN0/g;->q:Landroid/graphics/RectF;

    iput-object p1, p0, LN0/g;->q:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    new-instance v0, LN0/h;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LK0/g;-><init>(LK0/f;)V

    .line 4
    .line 5
    .line 6
    iput-object p0, v0, LN0/h;->C:LN0/g;

    .line 7
    .line 8
    invoke-virtual {v0}, LK0/g;->invalidateSelf()V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
