.class public final Landroidx/emoji2/text/v;
.super Landroid/text/style/ReplacementSpan;
.source "SourceFile"


# instance fields
.field public final a:Landroid/graphics/Paint$FontMetricsInt;

.field public final b:Landroidx/emoji2/text/u;

.field public c:S

.field public d:F

.field public e:Landroid/text/TextPaint;


# direct methods
.method public constructor <init>(Landroidx/emoji2/text/u;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Paint$FontMetricsInt;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Paint$FontMetricsInt;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/emoji2/text/v;->a:Landroid/graphics/Paint$FontMetricsInt;

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    iput-short v0, p0, Landroidx/emoji2/text/v;->c:S

    .line 13
    .line 14
    const/high16 v0, 0x3f800000    # 1.0f

    .line 15
    .line 16
    iput v0, p0, Landroidx/emoji2/text/v;->d:F

    .line 17
    .line 18
    const-string v0, "rasterizer cannot be null"

    .line 19
    .line 20
    invoke-static {v0, p1}, Lp0/a;->j(Ljava/lang/String;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Landroidx/emoji2/text/v;->b:Landroidx/emoji2/text/u;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 13

    move-object v0, p0

    move-object v1, p2

    move-object/from16 v2, p9

    .line 1
    instance-of v3, v1, Landroid/text/Spanned;

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    .line 2
    check-cast v1, Landroid/text/Spanned;

    .line 3
    const-class v3, Landroid/text/style/CharacterStyle;

    move/from16 v5, p3

    move/from16 v6, p4

    invoke-interface {v1, v5, v6, v3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/text/style/CharacterStyle;

    .line 4
    array-length v3, v1

    if-eqz v3, :cond_2

    array-length v3, v1

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-ne v3, v5, :cond_0

    aget-object v3, v1, v6

    if-ne v3, v0, :cond_0

    goto :goto_1

    .line 5
    :cond_0
    iget-object v3, v0, Landroidx/emoji2/text/v;->e:Landroid/text/TextPaint;

    if-nez v3, :cond_1

    .line 6
    new-instance v3, Landroid/text/TextPaint;

    invoke-direct {v3}, Landroid/text/TextPaint;-><init>()V

    .line 7
    iput-object v3, v0, Landroidx/emoji2/text/v;->e:Landroid/text/TextPaint;

    :cond_1
    move-object v4, v3

    .line 8
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    .line 9
    :goto_0
    array-length v3, v1

    if-ge v6, v3, :cond_4

    .line 10
    aget-object v3, v1, v6

    invoke-virtual {v3, v4}, Landroid/text/style/CharacterStyle;->updateDrawState(Landroid/text/TextPaint;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 11
    :cond_2
    :goto_1
    instance-of v1, v2, Landroid/text/TextPaint;

    if-eqz v1, :cond_4

    .line 12
    move-object v4, v2

    check-cast v4, Landroid/text/TextPaint;

    goto :goto_2

    .line 13
    :cond_3
    instance-of v1, v2, Landroid/text/TextPaint;

    if-eqz v1, :cond_4

    .line 14
    move-object v4, v2

    check-cast v4, Landroid/text/TextPaint;

    :cond_4
    :goto_2
    if-eqz v4, :cond_5

    .line 15
    iget v1, v4, Landroid/text/TextPaint;->bgColor:I

    if-eqz v1, :cond_5

    .line 16
    iget-short v1, v0, Landroidx/emoji2/text/v;->c:S

    int-to-float v1, v1

    add-float v8, p5, v1

    move/from16 v1, p6

    int-to-float v7, v1

    move/from16 v1, p8

    int-to-float v9, v1

    .line 17
    invoke-virtual {v4}, Landroid/graphics/Paint;->getColor()I

    move-result v1

    .line 18
    invoke-virtual {v4}, Landroid/graphics/Paint;->getStyle()Landroid/graphics/Paint$Style;

    move-result-object v3

    .line 19
    iget v5, v4, Landroid/text/TextPaint;->bgColor:I

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 20
    sget-object v5, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    move-object v5, p1

    move/from16 v6, p5

    move-object v10, v4

    .line 21
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 22
    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 23
    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 24
    :cond_5
    invoke-static {}, Landroidx/emoji2/text/j;->a()Landroidx/emoji2/text/j;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v1, p7

    int-to-float v10, v1

    if-eqz v4, :cond_6

    move-object v2, v4

    .line 25
    :cond_6
    iget-object v1, v0, Landroidx/emoji2/text/v;->b:Landroidx/emoji2/text/u;

    iget-object v3, v1, Landroidx/emoji2/text/u;->b:LA/k;

    .line 26
    iget-object v4, v3, LA/k;->i:Ljava/lang/Object;

    check-cast v4, Landroid/graphics/Typeface;

    .line 27
    invoke-virtual {v2}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v12

    .line 28
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 29
    iget v1, v1, Landroidx/emoji2/text/u;->a:I

    mul-int/lit8 v7, v1, 0x2

    const/4 v8, 0x2

    .line 30
    iget-object v1, v3, LA/k;->g:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, [C

    move-object v5, p1

    move/from16 v9, p5

    move-object v11, v2

    invoke-virtual/range {v5 .. v11}, Landroid/graphics/Canvas;->drawText([CIIFFLandroid/graphics/Paint;)V

    .line 31
    invoke-virtual {v2, v12}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    return-void
.end method

.method public final getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 4

    .line 1
    iget-object p2, p0, Landroidx/emoji2/text/v;->a:Landroid/graphics/Paint$FontMetricsInt;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->getFontMetricsInt(Landroid/graphics/Paint$FontMetricsInt;)I

    .line 4
    .line 5
    .line 6
    iget p1, p2, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 7
    .line 8
    iget p3, p2, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 9
    .line 10
    sub-int/2addr p1, p3

    .line 11
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    int-to-float p1, p1

    .line 16
    const/high16 p3, 0x3f800000    # 1.0f

    .line 17
    .line 18
    mul-float p1, p1, p3

    .line 19
    .line 20
    iget-object p3, p0, Landroidx/emoji2/text/v;->b:Landroidx/emoji2/text/u;

    .line 21
    .line 22
    invoke-virtual {p3}, Landroidx/emoji2/text/u;->c()LW/a;

    .line 23
    .line 24
    .line 25
    move-result-object p4

    .line 26
    const/16 v0, 0xe

    .line 27
    .line 28
    invoke-virtual {p4, v0}, LN/C;->a(I)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/4 v2, 0x0

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    iget-object v3, p4, LN/C;->d:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v3, Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    iget p4, p4, LN/C;->a:I

    .line 40
    .line 41
    add-int/2addr v1, p4

    .line 42
    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 43
    .line 44
    .line 45
    move-result p4

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/4 p4, 0x0

    .line 48
    :goto_0
    int-to-float p4, p4

    .line 49
    div-float/2addr p1, p4

    .line 50
    iput p1, p0, Landroidx/emoji2/text/v;->d:F

    .line 51
    .line 52
    invoke-virtual {p3}, Landroidx/emoji2/text/u;->c()LW/a;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1, v0}, LN/C;->a(I)I

    .line 57
    .line 58
    .line 59
    move-result p4

    .line 60
    if-eqz p4, :cond_1

    .line 61
    .line 62
    iget-object v0, p1, LN/C;->d:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    iget p1, p1, LN/C;->a:I

    .line 67
    .line 68
    add-int/2addr p4, p1

    .line 69
    invoke-virtual {v0, p4}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 70
    .line 71
    .line 72
    :cond_1
    invoke-virtual {p3}, Landroidx/emoji2/text/u;->c()LW/a;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    const/16 p3, 0xc

    .line 77
    .line 78
    invoke-virtual {p1, p3}, LN/C;->a(I)I

    .line 79
    .line 80
    .line 81
    move-result p3

    .line 82
    if-eqz p3, :cond_2

    .line 83
    .line 84
    iget-object p4, p1, LN/C;->d:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p4, Ljava/nio/ByteBuffer;

    .line 87
    .line 88
    iget p1, p1, LN/C;->a:I

    .line 89
    .line 90
    add-int/2addr p3, p1

    .line 91
    invoke-virtual {p4, p3}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    :cond_2
    int-to-float p1, v2

    .line 96
    iget p3, p0, Landroidx/emoji2/text/v;->d:F

    .line 97
    .line 98
    mul-float p1, p1, p3

    .line 99
    .line 100
    float-to-int p1, p1

    .line 101
    int-to-short p1, p1

    .line 102
    iput-short p1, p0, Landroidx/emoji2/text/v;->c:S

    .line 103
    .line 104
    if-eqz p5, :cond_3

    .line 105
    .line 106
    iget p3, p2, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 107
    .line 108
    iput p3, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 109
    .line 110
    iget p3, p2, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 111
    .line 112
    iput p3, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 113
    .line 114
    iget p3, p2, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 115
    .line 116
    iput p3, p5, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 117
    .line 118
    iget p2, p2, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 119
    .line 120
    iput p2, p5, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 121
    .line 122
    :cond_3
    return p1
.end method
