.class public final Ln0/b;
.super Landroid/util/Property;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Class;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Ln0/b;->a:I

    invoke-direct {p0, p1, p2}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Ln0/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroidx/appcompat/widget/SwitchCompat;

    .line 7
    .line 8
    iget p1, p1, Landroidx/appcompat/widget/SwitchCompat;->E:F

    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :pswitch_0
    check-cast p1, Landroid/view/View;

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getClipBounds()Landroid/graphics/Rect;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :pswitch_1
    check-cast p1, Landroid/view/View;

    .line 23
    .line 24
    sget-object v0, Ln0/w;->a:LK0/e;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, LK0/e;->f(Landroid/view/View;)F

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :pswitch_2
    check-cast p1, Landroid/view/View;

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    return-object p1

    .line 39
    :pswitch_3
    check-cast p1, Landroid/view/View;

    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    return-object p1

    .line 43
    :pswitch_4
    check-cast p1, Landroid/view/View;

    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    return-object p1

    .line 47
    :pswitch_5
    check-cast p1, Ln0/e;

    .line 48
    .line 49
    const/4 p1, 0x0

    .line 50
    return-object p1

    .line 51
    :pswitch_6
    check-cast p1, Ln0/e;

    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    return-object p1

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, Ln0/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroidx/appcompat/widget/SwitchCompat;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Float;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/SwitchCompat;->setThumbPosition(F)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    check-cast p1, Landroid/view/View;

    .line 19
    .line 20
    check-cast p2, Landroid/graphics/Rect;

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    check-cast p1, Landroid/view/View;

    .line 27
    .line 28
    check-cast p2, Ljava/lang/Float;

    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    sget-object v0, Ln0/w;->a:LK0/e;

    .line 35
    .line 36
    invoke-virtual {v0, p1, p2}, LK0/e;->o(Landroid/view/View;F)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_2
    check-cast p1, Landroid/view/View;

    .line 41
    .line 42
    check-cast p2, Landroid/graphics/PointF;

    .line 43
    .line 44
    iget v0, p2, Landroid/graphics/PointF;->x:F

    .line 45
    .line 46
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 51
    .line 52
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    add-int/2addr v1, v0

    .line 61
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    add-int/2addr v2, p2

    .line 66
    invoke-static {p1, v0, p2, v1, v2}, Ln0/w;->a(Landroid/view/View;IIII)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :pswitch_3
    check-cast p1, Landroid/view/View;

    .line 71
    .line 72
    check-cast p2, Landroid/graphics/PointF;

    .line 73
    .line 74
    iget v0, p2, Landroid/graphics/PointF;->x:F

    .line 75
    .line 76
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 81
    .line 82
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    invoke-static {p1, v0, p2, v1, v2}, Ln0/w;->a(Landroid/view/View;IIII)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :pswitch_4
    check-cast p1, Landroid/view/View;

    .line 99
    .line 100
    check-cast p2, Landroid/graphics/PointF;

    .line 101
    .line 102
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    iget v2, p2, Landroid/graphics/PointF;->x:F

    .line 111
    .line 112
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 117
    .line 118
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    invoke-static {p1, v0, v1, v2, p2}, Ln0/w;->a(Landroid/view/View;IIII)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :pswitch_5
    check-cast p1, Ln0/e;

    .line 127
    .line 128
    check-cast p2, Landroid/graphics/PointF;

    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    iget v0, p2, Landroid/graphics/PointF;->x:F

    .line 134
    .line 135
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    iput v0, p1, Ln0/e;->c:I

    .line 140
    .line 141
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 142
    .line 143
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 144
    .line 145
    .line 146
    move-result p2

    .line 147
    iput p2, p1, Ln0/e;->d:I

    .line 148
    .line 149
    iget v0, p1, Ln0/e;->g:I

    .line 150
    .line 151
    add-int/lit8 v0, v0, 0x1

    .line 152
    .line 153
    iput v0, p1, Ln0/e;->g:I

    .line 154
    .line 155
    iget v1, p1, Ln0/e;->f:I

    .line 156
    .line 157
    if-ne v1, v0, :cond_0

    .line 158
    .line 159
    iget v0, p1, Ln0/e;->a:I

    .line 160
    .line 161
    iget v1, p1, Ln0/e;->b:I

    .line 162
    .line 163
    iget v2, p1, Ln0/e;->c:I

    .line 164
    .line 165
    iget-object v3, p1, Ln0/e;->e:Landroid/view/View;

    .line 166
    .line 167
    invoke-static {v3, v0, v1, v2, p2}, Ln0/w;->a(Landroid/view/View;IIII)V

    .line 168
    .line 169
    .line 170
    const/4 p2, 0x0

    .line 171
    iput p2, p1, Ln0/e;->f:I

    .line 172
    .line 173
    iput p2, p1, Ln0/e;->g:I

    .line 174
    .line 175
    :cond_0
    return-void

    .line 176
    :pswitch_6
    check-cast p1, Ln0/e;

    .line 177
    .line 178
    check-cast p2, Landroid/graphics/PointF;

    .line 179
    .line 180
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    iget v0, p2, Landroid/graphics/PointF;->x:F

    .line 184
    .line 185
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    iput v0, p1, Ln0/e;->a:I

    .line 190
    .line 191
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 192
    .line 193
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 194
    .line 195
    .line 196
    move-result p2

    .line 197
    iput p2, p1, Ln0/e;->b:I

    .line 198
    .line 199
    iget v0, p1, Ln0/e;->f:I

    .line 200
    .line 201
    add-int/lit8 v0, v0, 0x1

    .line 202
    .line 203
    iput v0, p1, Ln0/e;->f:I

    .line 204
    .line 205
    iget v1, p1, Ln0/e;->g:I

    .line 206
    .line 207
    if-ne v0, v1, :cond_1

    .line 208
    .line 209
    iget v0, p1, Ln0/e;->a:I

    .line 210
    .line 211
    iget v1, p1, Ln0/e;->c:I

    .line 212
    .line 213
    iget v2, p1, Ln0/e;->d:I

    .line 214
    .line 215
    iget-object v3, p1, Ln0/e;->e:Landroid/view/View;

    .line 216
    .line 217
    invoke-static {v3, v0, p2, v1, v2}, Ln0/w;->a(Landroid/view/View;IIII)V

    .line 218
    .line 219
    .line 220
    const/4 p2, 0x0

    .line 221
    iput p2, p1, Ln0/e;->f:I

    .line 222
    .line 223
    iput p2, p1, Ln0/e;->g:I

    .line 224
    .line 225
    :cond_1
    return-void

    .line 226
    nop

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
