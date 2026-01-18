.class public abstract LE/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/ThreadLocal;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LE/c;->a:Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x2

    .line 10
    if-eq v1, v2, :cond_0

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    if-eq v1, v3, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    if-ne v1, v2, :cond_1

    .line 17
    .line 18
    invoke-static {p0, p1, v0, p2}, LE/c;->b(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    new-instance p0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 24
    .line 25
    const-string p1, "No start tag found"

    .line 26
    .line 27
    invoke-direct {p0, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p0
.end method

.method public static b(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;
    .locals 34

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    .line 1
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v3

    .line 2
    const-string v4, "selector"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_23

    .line 3
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v3

    const/4 v4, 0x1

    add-int/2addr v3, v4

    const/16 v5, 0x14

    .line 4
    new-array v6, v5, [[I

    .line 5
    new-array v5, v5, [I

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 6
    :goto_0
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v9

    if-eq v9, v4, :cond_22

    .line 7
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v10

    const/4 v11, 0x3

    if-ge v10, v3, :cond_0

    if-eq v9, v11, :cond_22

    :cond_0
    const/4 v12, 0x2

    if-ne v9, v12, :cond_1

    if-gt v10, v3, :cond_1

    .line 8
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v9

    const-string v10, "item"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2

    :cond_1
    move/from16 v30, v3

    const/16 v16, 0x1

    goto/16 :goto_1b

    .line 9
    :cond_2
    sget-object v9, LB/a;->a:[I

    if-nez v2, :cond_3

    .line 10
    invoke-virtual {v0, v1, v9}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v9

    goto :goto_1

    .line 11
    :cond_3
    invoke-virtual {v2, v1, v9, v7, v7}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v9

    :goto_1
    const/4 v10, -0x1

    .line 12
    invoke-virtual {v9, v7, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v13

    const v14, -0xff01

    const/16 v15, 0x1f

    if-eq v13, v10, :cond_6

    .line 13
    sget-object v10, LE/c;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v10}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Landroid/util/TypedValue;

    if-nez v16, :cond_4

    .line 14
    new-instance v12, Landroid/util/TypedValue;

    invoke-direct {v12}, Landroid/util/TypedValue;-><init>()V

    .line 15
    invoke-virtual {v10, v12}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    move-object/from16 v12, v16

    .line 16
    :goto_2
    invoke-virtual {v0, v13, v12, v4}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 17
    iget v10, v12, Landroid/util/TypedValue;->type:I

    const/16 v12, 0x1c

    if-lt v10, v12, :cond_5

    if-gt v10, v15, :cond_5

    goto :goto_3

    .line 18
    :cond_5
    :try_start_0
    invoke-virtual {v0, v13}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v10

    invoke-static {v0, v10, v2}, LE/c;->a(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v10
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    .line 19
    :catch_0
    invoke-virtual {v9, v7, v14}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v10

    goto :goto_4

    .line 20
    :cond_6
    :goto_3
    invoke-virtual {v9, v7, v14}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v10

    .line 21
    :goto_4
    invoke-virtual {v9, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v12

    const/high16 v13, 0x3f800000    # 1.0f

    if-eqz v12, :cond_7

    .line 22
    invoke-virtual {v9, v4, v13}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v11

    goto :goto_5

    .line 23
    :cond_7
    invoke-virtual {v9, v11}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v12

    if-eqz v12, :cond_8

    .line 24
    invoke-virtual {v9, v11, v13}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v11

    goto :goto_5

    :cond_8
    const/high16 v11, 0x3f800000    # 1.0f

    .line 25
    :goto_5
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v14, 0x4

    const/high16 v4, -0x40800000    # -1.0f

    if-lt v12, v15, :cond_9

    const/4 v12, 0x2

    .line 26
    invoke-virtual {v9, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v15

    if-eqz v15, :cond_9

    .line 27
    invoke-virtual {v9, v12, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v4

    goto :goto_6

    .line 28
    :cond_9
    invoke-virtual {v9, v14, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v4

    .line 29
    :goto_6
    invoke-virtual {v9}, Landroid/content/res/TypedArray;->recycle()V

    .line 30
    invoke-interface/range {p2 .. p2}, Landroid/util/AttributeSet;->getAttributeCount()I

    move-result v9

    .line 31
    new-array v12, v9, [I

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_7
    if-ge v15, v9, :cond_c

    .line 32
    invoke-interface {v1, v15}, Landroid/util/AttributeSet;->getAttributeNameResource(I)I

    move-result v13

    const v7, 0x10101a5

    if-eq v13, v7, :cond_b

    const v7, 0x101031f

    if-eq v13, v7, :cond_b

    const v7, 0x7f040034

    if-eq v13, v7, :cond_b

    const v7, 0x7f040290

    if-eq v13, v7, :cond_b

    add-int/lit8 v7, v14, 0x1

    const/4 v0, 0x0

    .line 33
    invoke-interface {v1, v15, v0}, Landroid/util/AttributeSet;->getAttributeBooleanValue(IZ)Z

    move-result v19

    if-eqz v19, :cond_a

    goto :goto_8

    :cond_a
    neg-int v13, v13

    .line 34
    :goto_8
    aput v13, v12, v14

    move v14, v7

    :cond_b
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v0, p0

    const/4 v7, 0x0

    const/high16 v13, 0x3f800000    # 1.0f

    goto :goto_7

    .line 35
    :cond_c
    invoke-static {v12, v14}, Landroid/util/StateSet;->trimStateSet([II)[I

    move-result-object v0

    const/high16 v7, 0x42c80000    # 100.0f

    const/4 v9, 0x0

    cmpl-float v12, v4, v9

    if-ltz v12, :cond_d

    cmpg-float v12, v4, v7

    if-gtz v12, :cond_d

    const/4 v12, 0x1

    :goto_9
    const/high16 v13, 0x3f800000    # 1.0f

    goto :goto_a

    :cond_d
    const/4 v12, 0x0

    goto :goto_9

    :goto_a
    cmpl-float v14, v11, v13

    if-nez v14, :cond_e

    if-nez v12, :cond_e

    move/from16 v30, v3

    const/16 v16, 0x1

    goto/16 :goto_18

    .line 36
    :cond_e
    invoke-static {v10}, Landroid/graphics/Color;->alpha(I)I

    move-result v13

    int-to-float v13, v13

    mul-float v13, v13, v11

    const/high16 v11, 0x3f000000    # 0.5f

    add-float/2addr v13, v11

    float-to-int v11, v13

    const/16 v13, 0xff

    const/4 v14, 0x0

    .line 37
    invoke-static {v11, v14, v13}, Lp0/a;->l(III)I

    move-result v11

    if-eqz v12, :cond_1d

    .line 38
    invoke-static {v10}, LE/a;->a(I)LE/a;

    move-result-object v10

    .line 39
    sget-object v12, LE/s;->k:LE/s;

    .line 40
    iget v13, v10, LE/a;->b:F

    float-to-double v14, v13

    const-wide/high16 v19, 0x3ff0000000000000L    # 1.0

    cmpg-double v21, v14, v19

    if-ltz v21, :cond_f

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v14

    int-to-double v14, v14

    const-wide/16 v19, 0x0

    cmpg-double v21, v14, v19

    if-lez v21, :cond_f

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v14

    int-to-double v14, v14

    const-wide/high16 v19, 0x4059000000000000L    # 100.0

    cmpl-double v21, v14, v19

    if-ltz v21, :cond_10

    :cond_f
    move/from16 v30, v3

    const/16 v16, 0x1

    goto/16 :goto_16

    .line 41
    :cond_10
    iget v10, v10, LE/a;->a:F

    cmpg-float v14, v10, v9

    if-gez v14, :cond_11

    const/4 v10, 0x0

    goto :goto_b

    :cond_11
    const/high16 v14, 0x43b40000    # 360.0f

    invoke-static {v14, v10}, Ljava/lang/Math;->min(FF)F

    move-result v10

    :goto_b
    move v15, v13

    const/4 v14, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    :goto_c
    sub-float v22, v20, v13

    .line 42
    invoke-static/range {v22 .. v22}, Ljava/lang/Math;->abs(F)F

    move-result v22

    const v23, 0x3ecccccd    # 0.4f

    cmpl-float v22, v22, v23

    if-ltz v22, :cond_1b

    const/high16 v22, 0x447a0000    # 1000.0f

    const/high16 v23, 0x447a0000    # 1000.0f

    const/16 v24, 0x0

    const/high16 v25, 0x42c80000    # 100.0f

    const/16 v26, 0x0

    :goto_d
    sub-float v27, v24, v25

    .line 43
    invoke-static/range {v27 .. v27}, Ljava/lang/Math;->abs(F)F

    move-result v27

    const v28, 0x3c23d70a    # 0.01f

    const/high16 v29, 0x40000000    # 2.0f

    cmpl-float v27, v27, v28

    if-lez v27, :cond_17

    sub-float v27, v25, v24

    div-float v27, v27, v29

    add-float v9, v27, v24

    .line 44
    invoke-static {v9, v15, v10}, LE/a;->b(FFF)LE/a;

    move-result-object v7

    .line 45
    sget-object v1, LE/s;->k:LE/s;

    invoke-virtual {v7, v1}, LE/a;->c(LE/s;)I

    move-result v1

    .line 46
    invoke-static {v1}, Landroid/graphics/Color;->red(I)I

    move-result v7

    invoke-static {v7}, LE/b;->g(I)F

    move-result v7

    .line 47
    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    move-result v30

    invoke-static/range {v30 .. v30}, LE/b;->g(I)F

    move-result v30

    .line 48
    invoke-static {v1}, Landroid/graphics/Color;->blue(I)I

    move-result v31

    invoke-static/range {v31 .. v31}, LE/b;->g(I)F

    move-result v31

    .line 49
    sget-object v32, LE/b;->d:[[F

    const/16 v16, 0x1

    .line 50
    aget-object v32, v32, v16

    const/16 v18, 0x0

    aget v33, v32, v18

    mul-float v7, v7, v33

    aget v33, v32, v16

    mul-float v30, v30, v33

    add-float v30, v30, v7

    const/4 v7, 0x2

    aget v17, v32, v7

    mul-float v31, v31, v17

    add-float v31, v31, v30

    const/high16 v17, 0x42c80000    # 100.0f

    div-float v7, v31, v17

    const v30, 0x3c111aa7

    cmpg-float v30, v7, v30

    if-gtz v30, :cond_12

    const v30, 0x4461d2f7

    mul-float v7, v7, v30

    move/from16 v30, v3

    goto :goto_e

    :cond_12
    move/from16 v30, v3

    float-to-double v2, v7

    .line 51
    invoke-static {v2, v3}, Ljava/lang/Math;->cbrt(D)D

    move-result-wide v2

    double-to-float v2, v2

    const/high16 v3, 0x42e80000    # 116.0f

    mul-float v2, v2, v3

    const/high16 v3, 0x41800000    # 16.0f

    sub-float v7, v2, v3

    :goto_e
    sub-float v2, v4, v7

    .line 52
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const v3, 0x3e4ccccd    # 0.2f

    cmpg-float v3, v2, v3

    if-gez v3, :cond_14

    .line 53
    invoke-static {v1}, LE/a;->a(I)LE/a;

    move-result-object v1

    .line 54
    iget v3, v1, LE/a;->c:F

    move/from16 v31, v2

    iget v2, v1, LE/a;->b:F

    invoke-static {v3, v2, v10}, LE/a;->b(FFF)LE/a;

    move-result-object v2

    .line 55
    iget v3, v1, LE/a;->d:F

    move/from16 v32, v9

    iget v9, v2, LE/a;->d:F

    sub-float/2addr v3, v9

    .line 56
    iget v9, v1, LE/a;->e:F

    move/from16 v33, v10

    iget v10, v2, LE/a;->e:F

    sub-float/2addr v9, v10

    .line 57
    iget v10, v1, LE/a;->f:F

    iget v2, v2, LE/a;->f:F

    sub-float/2addr v10, v2

    mul-float v3, v3, v3

    mul-float v9, v9, v9

    add-float/2addr v9, v3

    mul-float v10, v10, v10

    add-float/2addr v10, v9

    float-to-double v2, v10

    .line 58
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    const-wide v9, 0x3fe428f5c28f5c29L    # 0.63

    .line 59
    invoke-static {v2, v3, v9, v10}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    const-wide v9, 0x3ff68f5c28f5c28fL    # 1.41

    mul-double v2, v2, v9

    double-to-float v2, v2

    const/high16 v3, 0x3f800000    # 1.0f

    cmpg-float v9, v2, v3

    if-gtz v9, :cond_13

    move-object/from16 v26, v1

    move/from16 v23, v2

    move/from16 v22, v31

    :cond_13
    :goto_f
    const/4 v1, 0x0

    goto :goto_10

    :cond_14
    move/from16 v32, v9

    move/from16 v33, v10

    const/high16 v3, 0x3f800000    # 1.0f

    goto :goto_f

    :goto_10
    cmpl-float v2, v22, v1

    if-nez v2, :cond_15

    cmpl-float v2, v23, v1

    if-nez v2, :cond_15

    :goto_11
    move-object/from16 v2, v26

    goto :goto_13

    :cond_15
    cmpg-float v2, v7, v4

    if-gez v2, :cond_16

    move/from16 v24, v32

    goto :goto_12

    :cond_16
    move/from16 v25, v32

    :goto_12
    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move/from16 v3, v30

    move/from16 v10, v33

    const/high16 v7, 0x42c80000    # 100.0f

    const/4 v9, 0x0

    goto/16 :goto_d

    :cond_17
    move/from16 v30, v3

    move/from16 v33, v10

    const/4 v1, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    const/16 v16, 0x1

    const/high16 v17, 0x42c80000    # 100.0f

    goto :goto_11

    :goto_13
    if-eqz v19, :cond_19

    if-eqz v2, :cond_18

    .line 60
    invoke-virtual {v2, v12}, LE/a;->c(LE/s;)I

    move-result v1

    :goto_14
    move v10, v1

    goto :goto_17

    :cond_18
    sub-float v2, v13, v20

    div-float v2, v2, v29

    add-float v15, v2, v20

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move/from16 v3, v30

    move/from16 v10, v33

    const/high16 v7, 0x42c80000    # 100.0f

    const/4 v9, 0x0

    const/16 v19, 0x0

    goto/16 :goto_c

    :cond_19
    if-nez v2, :cond_1a

    move v13, v15

    goto :goto_15

    :cond_1a
    move-object v14, v2

    move/from16 v20, v15

    :goto_15
    sub-float v2, v13, v20

    div-float v2, v2, v29

    add-float v15, v2, v20

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move/from16 v3, v30

    move/from16 v10, v33

    const/high16 v7, 0x42c80000    # 100.0f

    const/4 v9, 0x0

    goto/16 :goto_c

    :cond_1b
    move/from16 v30, v3

    const/16 v16, 0x1

    if-nez v14, :cond_1c

    .line 61
    invoke-static {v4}, LE/b;->f(F)I

    move-result v1

    goto :goto_14

    .line 62
    :cond_1c
    invoke-virtual {v14, v12}, LE/a;->c(LE/s;)I

    move-result v1

    goto :goto_14

    .line 63
    :goto_16
    invoke-static {v4}, LE/b;->f(F)I

    move-result v1

    goto :goto_14

    :cond_1d
    move/from16 v30, v3

    const/16 v16, 0x1

    :goto_17
    const v1, 0xffffff

    and-int/2addr v1, v10

    shl-int/lit8 v2, v11, 0x18

    or-int v10, v1, v2

    :goto_18
    add-int/lit8 v1, v8, 0x1

    .line 64
    array-length v2, v5

    const/16 v3, 0x8

    if-le v1, v2, :cond_1f

    const/4 v2, 0x4

    if-gt v8, v2, :cond_1e

    const/16 v2, 0x8

    goto :goto_19

    :cond_1e
    mul-int/lit8 v2, v8, 0x2

    .line 65
    :goto_19
    new-array v2, v2, [I

    const/4 v4, 0x0

    .line 66
    invoke-static {v5, v4, v2, v4, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v5, v2

    .line 67
    :cond_1f
    aput v10, v5, v8

    .line 68
    array-length v2, v6

    if-le v1, v2, :cond_21

    .line 69
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v2

    const/4 v4, 0x4

    if-gt v8, v4, :cond_20

    goto :goto_1a

    :cond_20
    mul-int/lit8 v3, v8, 0x2

    :goto_1a
    invoke-static {v2, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    .line 70
    invoke-static {v6, v3, v2, v3, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v6, v2

    .line 71
    :cond_21
    aput-object v0, v6, v8

    .line 72
    check-cast v6, [[I

    move-object/from16 v0, p0

    move-object/from16 v2, p3

    move v8, v1

    move/from16 v3, v30

    const/4 v4, 0x1

    const/4 v7, 0x0

    move-object/from16 v1, p2

    goto/16 :goto_0

    :goto_1b
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move/from16 v3, v30

    const/4 v4, 0x1

    const/4 v7, 0x0

    goto/16 :goto_0

    .line 73
    :cond_22
    new-array v0, v8, [I

    .line 74
    new-array v1, v8, [[I

    const/4 v2, 0x0

    .line 75
    invoke-static {v5, v2, v0, v2, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 76
    invoke-static {v6, v2, v1, v2, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 77
    new-instance v2, Landroid/content/res/ColorStateList;

    invoke-direct {v2, v1, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    return-object v2

    .line 78
    :cond_23
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": invalid color state list tag "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
