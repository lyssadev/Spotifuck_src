.class public final Ln0/f;
.super Ln0/m;
.source "SourceFile"


# static fields
.field public static final A:[Ljava/lang/String;

.field public static final B:Ln0/b;

.field public static final C:Ln0/b;

.field public static final D:Ln0/b;

.field public static final E:Ln0/b;

.field public static final F:Ln0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-string v0, "android:changeBounds:clip"

    .line 2
    .line 3
    const-string v1, "android:changeBounds:parent"

    .line 4
    .line 5
    const-string v2, "android:changeBounds:bounds"

    .line 6
    .line 7
    const-string v3, "android:changeBounds:windowX"

    .line 8
    .line 9
    const-string v4, "android:changeBounds:windowY"

    .line 10
    .line 11
    filled-new-array {v2, v0, v1, v3, v4}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Ln0/f;->A:[Ljava/lang/String;

    .line 16
    .line 17
    new-instance v0, Ln0/b;

    .line 18
    .line 19
    const-class v1, Landroid/graphics/PointF;

    .line 20
    .line 21
    const-string v2, "topLeft"

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-direct {v0, v1, v2, v3}, Ln0/b;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Ln0/f;->B:Ln0/b;

    .line 28
    .line 29
    new-instance v0, Ln0/b;

    .line 30
    .line 31
    const-string v3, "bottomRight"

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    invoke-direct {v0, v1, v3, v4}, Ln0/b;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    sput-object v0, Ln0/f;->C:Ln0/b;

    .line 38
    .line 39
    new-instance v0, Ln0/b;

    .line 40
    .line 41
    const/4 v4, 0x2

    .line 42
    invoke-direct {v0, v1, v3, v4}, Ln0/b;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    sput-object v0, Ln0/f;->D:Ln0/b;

    .line 46
    .line 47
    new-instance v0, Ln0/b;

    .line 48
    .line 49
    const/4 v3, 0x3

    .line 50
    invoke-direct {v0, v1, v2, v3}, Ln0/b;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Ln0/f;->E:Ln0/b;

    .line 54
    .line 55
    new-instance v0, Ln0/b;

    .line 56
    .line 57
    const-string v2, "position"

    .line 58
    .line 59
    const/4 v3, 0x4

    .line 60
    invoke-direct {v0, v1, v2, v3}, Ln0/b;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    .line 61
    .line 62
    .line 63
    sput-object v0, Ln0/f;->F:Ln0/b;

    .line 64
    .line 65
    return-void
.end method

.method public static I(Ln0/u;)V
    .locals 6

    .line 1
    iget-object v0, p0, Ln0/u;->b:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    :cond_0
    iget-object v1, p0, Ln0/u;->a:Ljava/util/HashMap;

    .line 22
    .line 23
    new-instance v2, Landroid/graphics/Rect;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-direct {v2, v3, v4, v5, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 42
    .line 43
    .line 44
    const-string v0, "android:changeBounds:bounds"

    .line 45
    .line 46
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, Ln0/u;->b:Landroid/view/View;

    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    const-string v0, "android:changeBounds:parent"

    .line 56
    .line 57
    invoke-virtual {v1, v0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    :cond_1
    return-void
.end method


# virtual methods
.method public final d(Ln0/u;)V
    .locals 0

    .line 1
    invoke-static {p1}, Ln0/f;->I(Ln0/u;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final g(Ln0/u;)V
    .locals 0

    .line 1
    invoke-static {p1}, Ln0/f;->I(Ln0/u;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final k(Landroid/widget/FrameLayout;Ln0/u;Ln0/u;)Landroid/animation/Animator;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    if-nez v2, :cond_1

    .line 10
    .line 11
    :cond_0
    move-object v1, v0

    .line 12
    const/4 v0, 0x0

    .line 13
    goto/16 :goto_8

    .line 14
    .line 15
    :cond_1
    iget-object v1, v1, Ln0/u;->a:Ljava/util/HashMap;

    .line 16
    .line 17
    iget-object v7, v2, Ln0/u;->a:Ljava/util/HashMap;

    .line 18
    .line 19
    const-string v8, "android:changeBounds:parent"

    .line 20
    .line 21
    invoke-virtual {v1, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v9

    .line 25
    check-cast v9, Landroid/view/ViewGroup;

    .line 26
    .line 27
    invoke-virtual {v7, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    check-cast v8, Landroid/view/ViewGroup;

    .line 32
    .line 33
    if-eqz v9, :cond_2

    .line 34
    .line 35
    if-nez v8, :cond_3

    .line 36
    .line 37
    :cond_2
    move-object v1, v0

    .line 38
    const/4 v0, 0x0

    .line 39
    goto/16 :goto_8

    .line 40
    .line 41
    :cond_3
    const-string v8, "android:changeBounds:bounds"

    .line 42
    .line 43
    invoke-virtual {v1, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    check-cast v9, Landroid/graphics/Rect;

    .line 48
    .line 49
    invoke-virtual {v7, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    check-cast v8, Landroid/graphics/Rect;

    .line 54
    .line 55
    iget v10, v9, Landroid/graphics/Rect;->left:I

    .line 56
    .line 57
    iget v11, v8, Landroid/graphics/Rect;->left:I

    .line 58
    .line 59
    iget v12, v9, Landroid/graphics/Rect;->top:I

    .line 60
    .line 61
    iget v13, v8, Landroid/graphics/Rect;->top:I

    .line 62
    .line 63
    iget v14, v9, Landroid/graphics/Rect;->right:I

    .line 64
    .line 65
    iget v15, v8, Landroid/graphics/Rect;->right:I

    .line 66
    .line 67
    iget v9, v9, Landroid/graphics/Rect;->bottom:I

    .line 68
    .line 69
    iget v8, v8, Landroid/graphics/Rect;->bottom:I

    .line 70
    .line 71
    sub-int v6, v14, v10

    .line 72
    .line 73
    sub-int v4, v9, v12

    .line 74
    .line 75
    sub-int v3, v15, v11

    .line 76
    .line 77
    sub-int v5, v8, v13

    .line 78
    .line 79
    const-string v0, "android:changeBounds:clip"

    .line 80
    .line 81
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    check-cast v1, Landroid/graphics/Rect;

    .line 86
    .line 87
    invoke-virtual {v7, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, Landroid/graphics/Rect;

    .line 92
    .line 93
    if-eqz v6, :cond_4

    .line 94
    .line 95
    if-nez v4, :cond_5

    .line 96
    .line 97
    :cond_4
    if-eqz v3, :cond_9

    .line 98
    .line 99
    if-eqz v5, :cond_9

    .line 100
    .line 101
    :cond_5
    if-ne v10, v11, :cond_7

    .line 102
    .line 103
    if-eq v12, v13, :cond_6

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_6
    const/4 v7, 0x0

    .line 107
    goto :goto_1

    .line 108
    :cond_7
    :goto_0
    const/4 v7, 0x1

    .line 109
    :goto_1
    if-ne v14, v15, :cond_8

    .line 110
    .line 111
    if-eq v9, v8, :cond_a

    .line 112
    .line 113
    :cond_8
    const/16 v16, 0x1

    .line 114
    .line 115
    add-int/lit8 v7, v7, 0x1

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_9
    const/4 v7, 0x0

    .line 119
    :cond_a
    :goto_2
    if-eqz v1, :cond_c

    .line 120
    .line 121
    invoke-virtual {v1, v0}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v17

    .line 125
    if-eqz v17, :cond_b

    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_b
    :goto_3
    const/4 v0, 0x1

    .line 129
    goto :goto_5

    .line 130
    :cond_c
    :goto_4
    if-nez v1, :cond_d

    .line 131
    .line 132
    if-eqz v0, :cond_d

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :goto_5
    add-int/2addr v7, v0

    .line 136
    :cond_d
    if-lez v7, :cond_13

    .line 137
    .line 138
    iget-object v0, v2, Ln0/u;->b:Landroid/view/View;

    .line 139
    .line 140
    invoke-static {v0, v10, v12, v14, v9}, Ln0/w;->a(Landroid/view/View;IIII)V

    .line 141
    .line 142
    .line 143
    const/4 v1, 0x2

    .line 144
    if-ne v7, v1, :cond_f

    .line 145
    .line 146
    if-ne v6, v3, :cond_e

    .line 147
    .line 148
    if-ne v4, v5, :cond_e

    .line 149
    .line 150
    move-object/from16 v1, p0

    .line 151
    .line 152
    iget-object v2, v1, Ln0/m;->v:LK0/e;

    .line 153
    .line 154
    int-to-float v3, v10

    .line 155
    int-to-float v4, v12

    .line 156
    int-to-float v5, v11

    .line 157
    int-to-float v6, v13

    .line 158
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-static {v3, v4, v5, v6}, LK0/e;->c(FFFF)Landroid/graphics/Path;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    sget-object v3, Ln0/f;->F:Ln0/b;

    .line 166
    .line 167
    invoke-static {v0, v3, v2}, Ln0/i;->a(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    goto/16 :goto_7

    .line 172
    .line 173
    :cond_e
    move-object/from16 v1, p0

    .line 174
    .line 175
    new-instance v2, Ln0/e;

    .line 176
    .line 177
    invoke-direct {v2, v0}, Ln0/e;-><init>(Landroid/view/View;)V

    .line 178
    .line 179
    .line 180
    iget-object v3, v1, Ln0/m;->v:LK0/e;

    .line 181
    .line 182
    int-to-float v4, v10

    .line 183
    int-to-float v5, v12

    .line 184
    int-to-float v6, v11

    .line 185
    int-to-float v7, v13

    .line 186
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-static {v4, v5, v6, v7}, LK0/e;->c(FFFF)Landroid/graphics/Path;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    sget-object v4, Ln0/f;->B:Ln0/b;

    .line 194
    .line 195
    invoke-static {v2, v4, v3}, Ln0/i;->a(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    iget-object v4, v1, Ln0/m;->v:LK0/e;

    .line 200
    .line 201
    int-to-float v5, v14

    .line 202
    int-to-float v6, v9

    .line 203
    int-to-float v7, v15

    .line 204
    int-to-float v8, v8

    .line 205
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-static {v5, v6, v7, v8}, LK0/e;->c(FFFF)Landroid/graphics/Path;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    sget-object v5, Ln0/f;->C:Ln0/b;

    .line 213
    .line 214
    invoke-static {v2, v5, v4}, Ln0/i;->a(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    new-instance v5, Landroid/animation/AnimatorSet;

    .line 219
    .line 220
    invoke-direct {v5}, Landroid/animation/AnimatorSet;-><init>()V

    .line 221
    .line 222
    .line 223
    const/4 v6, 0x2

    .line 224
    new-array v6, v6, [Landroid/animation/Animator;

    .line 225
    .line 226
    const/4 v7, 0x0

    .line 227
    aput-object v3, v6, v7

    .line 228
    .line 229
    const/4 v3, 0x1

    .line 230
    aput-object v4, v6, v3

    .line 231
    .line 232
    invoke-virtual {v5, v6}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 233
    .line 234
    .line 235
    new-instance v3, Ln0/c;

    .line 236
    .line 237
    invoke-direct {v3, v2}, Ln0/c;-><init>(Ln0/e;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v5, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 241
    .line 242
    .line 243
    move-object v2, v5

    .line 244
    goto :goto_7

    .line 245
    :cond_f
    move-object/from16 v1, p0

    .line 246
    .line 247
    if-ne v10, v11, :cond_11

    .line 248
    .line 249
    if-eq v12, v13, :cond_10

    .line 250
    .line 251
    goto :goto_6

    .line 252
    :cond_10
    iget-object v2, v1, Ln0/m;->v:LK0/e;

    .line 253
    .line 254
    int-to-float v3, v14

    .line 255
    int-to-float v4, v9

    .line 256
    int-to-float v5, v15

    .line 257
    int-to-float v6, v8

    .line 258
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-static {v3, v4, v5, v6}, LK0/e;->c(FFFF)Landroid/graphics/Path;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    sget-object v3, Ln0/f;->D:Ln0/b;

    .line 266
    .line 267
    invoke-static {v0, v3, v2}, Ln0/i;->a(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    goto :goto_7

    .line 272
    :cond_11
    :goto_6
    iget-object v2, v1, Ln0/m;->v:LK0/e;

    .line 273
    .line 274
    int-to-float v3, v10

    .line 275
    int-to-float v4, v12

    .line 276
    int-to-float v5, v11

    .line 277
    int-to-float v6, v13

    .line 278
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    invoke-static {v3, v4, v5, v6}, LK0/e;->c(FFFF)Landroid/graphics/Path;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    sget-object v3, Ln0/f;->E:Ln0/b;

    .line 286
    .line 287
    invoke-static {v0, v3, v2}, Ln0/i;->a(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    :goto_7
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    instance-of v3, v3, Landroid/view/ViewGroup;

    .line 296
    .line 297
    if-eqz v3, :cond_12

    .line 298
    .line 299
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    check-cast v0, Landroid/view/ViewGroup;

    .line 304
    .line 305
    const/4 v3, 0x1

    .line 306
    invoke-static {v0, v3}, LT0/g;->Q(Landroid/view/ViewGroup;Z)V

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {p0 .. p0}, Ln0/m;->o()Ln0/m;

    .line 310
    .line 311
    .line 312
    move-result-object v3

    .line 313
    new-instance v4, Ln0/d;

    .line 314
    .line 315
    invoke-direct {v4, v0}, Ln0/d;-><init>(Landroid/view/ViewGroup;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v3, v4}, Ln0/m;->a(Ln0/k;)V

    .line 319
    .line 320
    .line 321
    :cond_12
    return-object v2

    .line 322
    :cond_13
    move-object/from16 v1, p0

    .line 323
    .line 324
    const/4 v0, 0x0

    .line 325
    :goto_8
    return-object v0
.end method

.method public final q()[Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Ln0/f;->A:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
