.class public final Lo0/l;
.super Lo0/m;
.source "SourceFile"


# instance fields
.field public final a:Landroid/graphics/Matrix;

.field public final b:Ljava/util/ArrayList;

.field public c:F

.field public d:F

.field public e:F

.field public f:F

.field public g:F

.field public h:F

.field public i:F

.field public final j:Landroid/graphics/Matrix;

.field public k:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lo0/l;->a:Landroid/graphics/Matrix;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo0/l;->b:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lo0/l;->c:F

    .line 5
    iput v0, p0, Lo0/l;->d:F

    .line 6
    iput v0, p0, Lo0/l;->e:F

    const/high16 v1, 0x3f800000    # 1.0f

    .line 7
    iput v1, p0, Lo0/l;->f:F

    .line 8
    iput v1, p0, Lo0/l;->g:F

    .line 9
    iput v0, p0, Lo0/l;->h:F

    .line 10
    iput v0, p0, Lo0/l;->i:F

    .line 11
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lo0/l;->j:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lo0/l;->k:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lo0/l;Lr/b;)V
    .locals 6

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lo0/l;->a:Landroid/graphics/Matrix;

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo0/l;->b:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 16
    iput v0, p0, Lo0/l;->c:F

    .line 17
    iput v0, p0, Lo0/l;->d:F

    .line 18
    iput v0, p0, Lo0/l;->e:F

    const/high16 v1, 0x3f800000    # 1.0f

    .line 19
    iput v1, p0, Lo0/l;->f:F

    .line 20
    iput v1, p0, Lo0/l;->g:F

    .line 21
    iput v0, p0, Lo0/l;->h:F

    .line 22
    iput v0, p0, Lo0/l;->i:F

    .line 23
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    iput-object v2, p0, Lo0/l;->j:Landroid/graphics/Matrix;

    const/4 v3, 0x0

    .line 24
    iput-object v3, p0, Lo0/l;->k:Ljava/lang/String;

    .line 25
    iget v3, p1, Lo0/l;->c:F

    iput v3, p0, Lo0/l;->c:F

    .line 26
    iget v3, p1, Lo0/l;->d:F

    iput v3, p0, Lo0/l;->d:F

    .line 27
    iget v3, p1, Lo0/l;->e:F

    iput v3, p0, Lo0/l;->e:F

    .line 28
    iget v3, p1, Lo0/l;->f:F

    iput v3, p0, Lo0/l;->f:F

    .line 29
    iget v3, p1, Lo0/l;->g:F

    iput v3, p0, Lo0/l;->g:F

    .line 30
    iget v3, p1, Lo0/l;->h:F

    iput v3, p0, Lo0/l;->h:F

    .line 31
    iget v3, p1, Lo0/l;->i:F

    iput v3, p0, Lo0/l;->i:F

    .line 32
    iget-object v3, p1, Lo0/l;->k:Ljava/lang/String;

    iput-object v3, p0, Lo0/l;->k:Ljava/lang/String;

    if-eqz v3, :cond_0

    .line 33
    invoke-virtual {p2, v3, p0}, Lr/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    :cond_0
    iget-object v3, p1, Lo0/l;->j:Landroid/graphics/Matrix;

    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 35
    iget-object p1, p1, Lo0/l;->b:Ljava/util/ArrayList;

    const/4 v2, 0x0

    .line 36
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_5

    .line 37
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    .line 38
    instance-of v4, v3, Lo0/l;

    if-eqz v4, :cond_1

    .line 39
    check-cast v3, Lo0/l;

    .line 40
    iget-object v4, p0, Lo0/l;->b:Ljava/util/ArrayList;

    new-instance v5, Lo0/l;

    invoke-direct {v5, v3, p2}, Lo0/l;-><init>(Lo0/l;Lr/b;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 41
    :cond_1
    instance-of v4, v3, Lo0/k;

    if-eqz v4, :cond_2

    .line 42
    new-instance v4, Lo0/k;

    check-cast v3, Lo0/k;

    .line 43
    invoke-direct {v4, v3}, Lo0/n;-><init>(Lo0/n;)V

    .line 44
    iput v0, v4, Lo0/k;->e:F

    .line 45
    iput v1, v4, Lo0/k;->g:F

    .line 46
    iput v1, v4, Lo0/k;->h:F

    .line 47
    iput v0, v4, Lo0/k;->i:F

    .line 48
    iput v1, v4, Lo0/k;->j:F

    .line 49
    iput v0, v4, Lo0/k;->k:F

    .line 50
    sget-object v5, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    iput-object v5, v4, Lo0/k;->l:Landroid/graphics/Paint$Cap;

    .line 51
    sget-object v5, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    iput-object v5, v4, Lo0/k;->m:Landroid/graphics/Paint$Join;

    const/high16 v5, 0x40800000    # 4.0f

    .line 52
    iput v5, v4, Lo0/k;->n:F

    .line 53
    iget-object v5, v3, Lo0/k;->d:LE/d;

    iput-object v5, v4, Lo0/k;->d:LE/d;

    .line 54
    iget v5, v3, Lo0/k;->e:F

    iput v5, v4, Lo0/k;->e:F

    .line 55
    iget v5, v3, Lo0/k;->g:F

    iput v5, v4, Lo0/k;->g:F

    .line 56
    iget-object v5, v3, Lo0/k;->f:LE/d;

    iput-object v5, v4, Lo0/k;->f:LE/d;

    .line 57
    iget v5, v3, Lo0/n;->c:I

    iput v5, v4, Lo0/n;->c:I

    .line 58
    iget v5, v3, Lo0/k;->h:F

    iput v5, v4, Lo0/k;->h:F

    .line 59
    iget v5, v3, Lo0/k;->i:F

    iput v5, v4, Lo0/k;->i:F

    .line 60
    iget v5, v3, Lo0/k;->j:F

    iput v5, v4, Lo0/k;->j:F

    .line 61
    iget v5, v3, Lo0/k;->k:F

    iput v5, v4, Lo0/k;->k:F

    .line 62
    iget-object v5, v3, Lo0/k;->l:Landroid/graphics/Paint$Cap;

    iput-object v5, v4, Lo0/k;->l:Landroid/graphics/Paint$Cap;

    .line 63
    iget-object v5, v3, Lo0/k;->m:Landroid/graphics/Paint$Join;

    iput-object v5, v4, Lo0/k;->m:Landroid/graphics/Paint$Join;

    .line 64
    iget v3, v3, Lo0/k;->n:F

    iput v3, v4, Lo0/k;->n:F

    goto :goto_1

    .line 65
    :cond_2
    instance-of v4, v3, Lo0/j;

    if-eqz v4, :cond_4

    .line 66
    new-instance v4, Lo0/j;

    check-cast v3, Lo0/j;

    .line 67
    invoke-direct {v4, v3}, Lo0/n;-><init>(Lo0/n;)V

    .line 68
    :goto_1
    iget-object v3, p0, Lo0/l;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    iget-object v3, v4, Lo0/n;->b:Ljava/lang/String;

    if-eqz v3, :cond_3

    .line 70
    invoke-virtual {p2, v3, v4}, Lr/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 71
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unknown object in the tree!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    iget-object v2, p0, Lo0/l;->b:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    if-ge v1, v3, :cond_1

    .line 10
    .line 11
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Lo0/m;

    .line 16
    .line 17
    invoke-virtual {v2}, Lo0/m;->a()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    return v0

    .line 25
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return v0
.end method

.method public final b([I)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    iget-object v2, p0, Lo0/l;->b:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    if-ge v0, v3, :cond_0

    .line 10
    .line 11
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Lo0/m;

    .line 16
    .line 17
    invoke-virtual {v2, p1}, Lo0/m;->b([I)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    or-int/2addr v1, v2

    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return v1
.end method

.method public final c()V
    .locals 4

    .line 1
    iget-object v0, p0, Lo0/l;->j:Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lo0/l;->d:F

    .line 7
    .line 8
    neg-float v1, v1

    .line 9
    iget v2, p0, Lo0/l;->e:F

    .line 10
    .line 11
    neg-float v2, v2

    .line 12
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 13
    .line 14
    .line 15
    iget v1, p0, Lo0/l;->f:F

    .line 16
    .line 17
    iget v2, p0, Lo0/l;->g:F

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 20
    .line 21
    .line 22
    iget v1, p0, Lo0/l;->c:F

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-virtual {v0, v1, v2, v2}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 26
    .line 27
    .line 28
    iget v1, p0, Lo0/l;->h:F

    .line 29
    .line 30
    iget v2, p0, Lo0/l;->d:F

    .line 31
    .line 32
    add-float/2addr v1, v2

    .line 33
    iget v2, p0, Lo0/l;->i:F

    .line 34
    .line 35
    iget v3, p0, Lo0/l;->e:F

    .line 36
    .line 37
    add-float/2addr v2, v3

    .line 38
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public getGroupName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lo0/l;->k:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLocalMatrix()Landroid/graphics/Matrix;
    .locals 1

    .line 1
    iget-object v0, p0, Lo0/l;->j:Landroid/graphics/Matrix;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPivotX()F
    .locals 1

    .line 1
    iget v0, p0, Lo0/l;->d:F

    .line 2
    .line 3
    return v0
.end method

.method public getPivotY()F
    .locals 1

    .line 1
    iget v0, p0, Lo0/l;->e:F

    .line 2
    .line 3
    return v0
.end method

.method public getRotation()F
    .locals 1

    .line 1
    iget v0, p0, Lo0/l;->c:F

    .line 2
    .line 3
    return v0
.end method

.method public getScaleX()F
    .locals 1

    .line 1
    iget v0, p0, Lo0/l;->f:F

    .line 2
    .line 3
    return v0
.end method

.method public getScaleY()F
    .locals 1

    .line 1
    iget v0, p0, Lo0/l;->g:F

    .line 2
    .line 3
    return v0
.end method

.method public getTranslateX()F
    .locals 1

    .line 1
    iget v0, p0, Lo0/l;->h:F

    .line 2
    .line 3
    return v0
.end method

.method public getTranslateY()F
    .locals 1

    .line 1
    iget v0, p0, Lo0/l;->i:F

    .line 2
    .line 3
    return v0
.end method

.method public setPivotX(F)V
    .locals 1

    .line 1
    iget v0, p0, Lo0/l;->d:F

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lo0/l;->d:F

    .line 8
    .line 9
    invoke-virtual {p0}, Lo0/l;->c()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setPivotY(F)V
    .locals 1

    .line 1
    iget v0, p0, Lo0/l;->e:F

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lo0/l;->e:F

    .line 8
    .line 9
    invoke-virtual {p0}, Lo0/l;->c()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setRotation(F)V
    .locals 1

    .line 1
    iget v0, p0, Lo0/l;->c:F

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lo0/l;->c:F

    .line 8
    .line 9
    invoke-virtual {p0}, Lo0/l;->c()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setScaleX(F)V
    .locals 1

    .line 1
    iget v0, p0, Lo0/l;->f:F

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lo0/l;->f:F

    .line 8
    .line 9
    invoke-virtual {p0}, Lo0/l;->c()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setScaleY(F)V
    .locals 1

    .line 1
    iget v0, p0, Lo0/l;->g:F

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lo0/l;->g:F

    .line 8
    .line 9
    invoke-virtual {p0}, Lo0/l;->c()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setTranslateX(F)V
    .locals 1

    .line 1
    iget v0, p0, Lo0/l;->h:F

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lo0/l;->h:F

    .line 8
    .line 9
    invoke-virtual {p0}, Lo0/l;->c()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setTranslateY(F)V
    .locals 1

    .line 1
    iget v0, p0, Lo0/l;->i:F

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lo0/l;->i:F

    .line 8
    .line 9
    invoke-virtual {p0}, Lo0/l;->c()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
