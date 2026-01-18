.class public final Lx0/b;
.super Lj0/H;
.source "SourceFile"


# instance fields
.field public final a:Landroid/graphics/Paint;

.field public final b:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Paint;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lx0/b;->a:Landroid/graphics/Paint;

    .line 10
    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iput-object v1, p0, Lx0/b;->b:Ljava/util/List;

    .line 21
    .line 22
    const/high16 v1, 0x40a00000    # 5.0f

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 25
    .line 26
    .line 27
    const v1, -0xff01

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 31
    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final c(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v7, p0, Lx0/b;->a:Landroid/graphics/Paint;

    .line 3
    .line 4
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const v2, 0x7f0700ed

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {v7, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lx0/b;->b:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v8

    .line 24
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lx0/d;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    sget-object v1, LF/a;->a:Ljava/lang/ThreadLocal;

    .line 41
    .line 42
    const/high16 v1, 0x3f800000    # 1.0f

    .line 43
    .line 44
    sub-float/2addr v1, v2

    .line 45
    const v3, -0xff01

    .line 46
    .line 47
    .line 48
    invoke-static {v3}, Landroid/graphics/Color;->alpha(I)I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    int-to-float v4, v4

    .line 53
    mul-float v4, v4, v1

    .line 54
    .line 55
    const v5, -0xffff01

    .line 56
    .line 57
    .line 58
    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    int-to-float v6, v6

    .line 63
    mul-float v6, v6, v2

    .line 64
    .line 65
    add-float/2addr v6, v4

    .line 66
    invoke-static {v3}, Landroid/graphics/Color;->red(I)I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    int-to-float v4, v4

    .line 71
    mul-float v4, v4, v1

    .line 72
    .line 73
    invoke-static {v5}, Landroid/graphics/Color;->red(I)I

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    int-to-float v9, v9

    .line 78
    mul-float v9, v9, v2

    .line 79
    .line 80
    add-float/2addr v9, v4

    .line 81
    invoke-static {v3}, Landroid/graphics/Color;->green(I)I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    int-to-float v4, v4

    .line 86
    mul-float v4, v4, v1

    .line 87
    .line 88
    invoke-static {v5}, Landroid/graphics/Color;->green(I)I

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    int-to-float v10, v10

    .line 93
    mul-float v10, v10, v2

    .line 94
    .line 95
    add-float/2addr v10, v4

    .line 96
    invoke-static {v3}, Landroid/graphics/Color;->blue(I)I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    int-to-float v3, v3

    .line 101
    mul-float v3, v3, v1

    .line 102
    .line 103
    invoke-static {v5}, Landroid/graphics/Color;->blue(I)I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    int-to-float v1, v1

    .line 108
    mul-float v1, v1, v2

    .line 109
    .line 110
    add-float/2addr v1, v3

    .line 111
    float-to-int v2, v6

    .line 112
    float-to-int v3, v9

    .line 113
    float-to-int v4, v10

    .line 114
    float-to-int v1, v1

    .line 115
    invoke-static {v2, v3, v4, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    invoke-virtual {v7, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lj0/K;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    check-cast v1, Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 127
    .line 128
    invoke-virtual {v1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->A0()Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-eqz v1, :cond_0

    .line 133
    .line 134
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lj0/K;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    check-cast v1, Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 139
    .line 140
    iget-object v1, v1, Lcom/google/android/material/carousel/CarouselLayoutManager;->q:Lx0/c;

    .line 141
    .line 142
    iget v2, v1, Lx0/c;->b:I

    .line 143
    .line 144
    packed-switch v2, :pswitch_data_0

    .line 145
    .line 146
    .line 147
    iget-object v1, v1, Lx0/c;->c:Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 148
    .line 149
    invoke-virtual {v1}, Lj0/K;->G()I

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    goto :goto_1

    .line 154
    :pswitch_0
    const/4 v1, 0x0

    .line 155
    :goto_1
    int-to-float v3, v1

    .line 156
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lj0/K;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    check-cast v1, Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 161
    .line 162
    iget-object v1, v1, Lcom/google/android/material/carousel/CarouselLayoutManager;->q:Lx0/c;

    .line 163
    .line 164
    iget v2, v1, Lx0/c;->b:I

    .line 165
    .line 166
    packed-switch v2, :pswitch_data_1

    .line 167
    .line 168
    .line 169
    iget-object v1, v1, Lx0/c;->c:Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 170
    .line 171
    iget v2, v1, Lj0/K;->o:I

    .line 172
    .line 173
    invoke-virtual {v1}, Lj0/K;->D()I

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    sub-int/2addr v2, v1

    .line 178
    goto :goto_2

    .line 179
    :pswitch_1
    iget-object v1, v1, Lx0/c;->c:Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 180
    .line 181
    iget v2, v1, Lj0/K;->o:I

    .line 182
    .line 183
    :goto_2
    int-to-float v5, v2

    .line 184
    const/4 v4, 0x0

    .line 185
    move-object v1, p1

    .line 186
    move v2, v4

    .line 187
    move-object v6, v7

    .line 188
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 189
    .line 190
    .line 191
    goto/16 :goto_0

    .line 192
    .line 193
    :cond_0
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lj0/K;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    check-cast v1, Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 198
    .line 199
    iget-object v1, v1, Lcom/google/android/material/carousel/CarouselLayoutManager;->q:Lx0/c;

    .line 200
    .line 201
    iget v2, v1, Lx0/c;->b:I

    .line 202
    .line 203
    packed-switch v2, :pswitch_data_2

    .line 204
    .line 205
    .line 206
    const/4 v1, 0x0

    .line 207
    goto :goto_3

    .line 208
    :pswitch_2
    iget-object v1, v1, Lx0/c;->c:Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 209
    .line 210
    invoke-virtual {v1}, Lj0/K;->E()I

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    :goto_3
    int-to-float v2, v1

    .line 215
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lj0/K;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    check-cast v1, Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 220
    .line 221
    iget-object v1, v1, Lcom/google/android/material/carousel/CarouselLayoutManager;->q:Lx0/c;

    .line 222
    .line 223
    iget v3, v1, Lx0/c;->b:I

    .line 224
    .line 225
    packed-switch v3, :pswitch_data_3

    .line 226
    .line 227
    .line 228
    iget-object v1, v1, Lx0/c;->c:Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 229
    .line 230
    iget v1, v1, Lj0/K;->n:I

    .line 231
    .line 232
    goto :goto_4

    .line 233
    :pswitch_3
    iget-object v1, v1, Lx0/c;->c:Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 234
    .line 235
    iget v3, v1, Lj0/K;->n:I

    .line 236
    .line 237
    invoke-virtual {v1}, Lj0/K;->F()I

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    sub-int v1, v3, v1

    .line 242
    .line 243
    :goto_4
    int-to-float v4, v1

    .line 244
    const/4 v5, 0x0

    .line 245
    move-object v1, p1

    .line 246
    move v3, v5

    .line 247
    move-object v6, v7

    .line 248
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 249
    .line 250
    .line 251
    goto/16 :goto_0

    .line 252
    .line 253
    :cond_1
    return-void

    .line 254
    nop

    .line 255
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2
    .end packed-switch

    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_3
    .end packed-switch
.end method
