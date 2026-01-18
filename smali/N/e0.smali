.class public final LN/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# instance fields
.field public final a:LN/d;

.field public b:LN/w0;


# direct methods
.method public constructor <init>(Landroid/view/View;LN/d;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LN/e0;->a:LN/d;

    .line 5
    .line 6
    invoke-static {p1}, LN/Q;->h(Landroid/view/View;)LN/w0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_2

    .line 11
    .line 12
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v0, 0x1e

    .line 15
    .line 16
    if-lt p2, v0, :cond_0

    .line 17
    .line 18
    new-instance p2, LN/n0;

    .line 19
    .line 20
    invoke-direct {p2, p1}, LN/n0;-><init>(LN/w0;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/16 v0, 0x1d

    .line 25
    .line 26
    if-lt p2, v0, :cond_1

    .line 27
    .line 28
    new-instance p2, LN/m0;

    .line 29
    .line 30
    invoke-direct {p2, p1}, LN/m0;-><init>(LN/w0;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    new-instance p2, LN/l0;

    .line 35
    .line 36
    invoke-direct {p2, p1}, LN/l0;-><init>(LN/w0;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-virtual {p2}, LN/o0;->b()LN/w0;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    const/4 p1, 0x0

    .line 45
    :goto_1
    iput-object p1, p0, LN/e0;->b:LN/w0;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v8, p2

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->isLaidOut()Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-nez v3, :cond_0

    .line 15
    .line 16
    invoke-static/range {p1 .. p2}, LN/w0;->g(Landroid/view/View;Landroid/view/WindowInsets;)LN/w0;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iput-object v1, v0, LN/e0;->b:LN/w0;

    .line 21
    .line 22
    invoke-static/range {p1 .. p2}, LN/f0;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    return-object v1

    .line 27
    :cond_0
    invoke-static/range {p1 .. p2}, LN/w0;->g(Landroid/view/View;Landroid/view/WindowInsets;)LN/w0;

    .line 28
    .line 29
    .line 30
    move-result-object v9

    .line 31
    iget-object v3, v0, LN/e0;->b:LN/w0;

    .line 32
    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    invoke-static/range {p1 .. p1}, LN/Q;->h(Landroid/view/View;)LN/w0;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    iput-object v3, v0, LN/e0;->b:LN/w0;

    .line 40
    .line 41
    :cond_1
    iget-object v3, v0, LN/e0;->b:LN/w0;

    .line 42
    .line 43
    if-nez v3, :cond_2

    .line 44
    .line 45
    iput-object v9, v0, LN/e0;->b:LN/w0;

    .line 46
    .line 47
    invoke-static/range {p1 .. p2}, LN/f0;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    return-object v1

    .line 52
    :cond_2
    invoke-static/range {p1 .. p1}, LN/f0;->j(Landroid/view/View;)LN/d;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    if-eqz v3, :cond_3

    .line 57
    .line 58
    iget-object v3, v3, LN/d;->g:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v3, Landroid/view/WindowInsets;

    .line 61
    .line 62
    invoke-static {v3, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_3

    .line 67
    .line 68
    invoke-static/range {p1 .. p2}, LN/f0;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    return-object v1

    .line 73
    :cond_3
    iget-object v3, v0, LN/e0;->b:LN/w0;

    .line 74
    .line 75
    const/4 v5, 0x0

    .line 76
    const/4 v6, 0x1

    .line 77
    :goto_0
    iget-object v10, v9, LN/w0;->a:LN/u0;

    .line 78
    .line 79
    const/16 v11, 0x100

    .line 80
    .line 81
    if-gt v6, v11, :cond_5

    .line 82
    .line 83
    invoke-virtual {v10, v6}, LN/u0;->f(I)LF/c;

    .line 84
    .line 85
    .line 86
    move-result-object v10

    .line 87
    iget-object v11, v3, LN/w0;->a:LN/u0;

    .line 88
    .line 89
    invoke-virtual {v11, v6}, LN/u0;->f(I)LF/c;

    .line 90
    .line 91
    .line 92
    move-result-object v11

    .line 93
    invoke-virtual {v10, v11}, LF/c;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v10

    .line 97
    if-nez v10, :cond_4

    .line 98
    .line 99
    or-int/2addr v5, v6

    .line 100
    :cond_4
    shl-int/2addr v6, v2

    .line 101
    goto :goto_0

    .line 102
    :cond_5
    if-nez v5, :cond_6

    .line 103
    .line 104
    invoke-static/range {p1 .. p2}, LN/f0;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    return-object v1

    .line 109
    :cond_6
    iget-object v6, v0, LN/e0;->b:LN/w0;

    .line 110
    .line 111
    and-int/lit8 v2, v5, 0x8

    .line 112
    .line 113
    if-eqz v2, :cond_8

    .line 114
    .line 115
    invoke-virtual {v10, v1}, LN/u0;->f(I)LF/c;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    iget v2, v2, LF/c;->d:I

    .line 120
    .line 121
    iget-object v3, v6, LN/w0;->a:LN/u0;

    .line 122
    .line 123
    invoke-virtual {v3, v1}, LN/u0;->f(I)LF/c;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    iget v1, v1, LF/c;->d:I

    .line 128
    .line 129
    if-le v2, v1, :cond_7

    .line 130
    .line 131
    sget-object v1, LN/f0;->e:Landroid/view/animation/PathInterpolator;

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_7
    sget-object v1, LN/f0;->f:La0/a;

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_8
    sget-object v1, LN/f0;->g:Landroid/view/animation/DecelerateInterpolator;

    .line 138
    .line 139
    :goto_1
    new-instance v11, LN/j0;

    .line 140
    .line 141
    const-wide/16 v2, 0xa0

    .line 142
    .line 143
    invoke-direct {v11, v5, v1, v2, v3}, LN/j0;-><init>(ILandroid/view/animation/Interpolator;J)V

    .line 144
    .line 145
    .line 146
    iget-object v1, v11, LN/j0;->a:LN/i0;

    .line 147
    .line 148
    const/4 v2, 0x0

    .line 149
    invoke-virtual {v1, v2}, LN/i0;->d(F)V

    .line 150
    .line 151
    .line 152
    const/4 v1, 0x2

    .line 153
    new-array v1, v1, [F

    .line 154
    .line 155
    fill-array-data v1, :array_0

    .line 156
    .line 157
    .line 158
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    iget-object v2, v11, LN/j0;->a:LN/i0;

    .line 163
    .line 164
    invoke-virtual {v2}, LN/i0;->a()J

    .line 165
    .line 166
    .line 167
    move-result-wide v2

    .line 168
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 169
    .line 170
    .line 171
    move-result-object v12

    .line 172
    invoke-virtual {v10, v5}, LN/u0;->f(I)LF/c;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    iget-object v2, v6, LN/w0;->a:LN/u0;

    .line 177
    .line 178
    invoke-virtual {v2, v5}, LN/u0;->f(I)LF/c;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    iget v3, v1, LF/c;->a:I

    .line 183
    .line 184
    iget v10, v2, LF/c;->a:I

    .line 185
    .line 186
    invoke-static {v3, v10}, Ljava/lang/Math;->min(II)I

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    iget v10, v1, LF/c;->b:I

    .line 191
    .line 192
    iget v13, v2, LF/c;->b:I

    .line 193
    .line 194
    invoke-static {v10, v13}, Ljava/lang/Math;->min(II)I

    .line 195
    .line 196
    .line 197
    move-result v14

    .line 198
    iget v15, v1, LF/c;->c:I

    .line 199
    .line 200
    iget v4, v2, LF/c;->c:I

    .line 201
    .line 202
    invoke-static {v15, v4}, Ljava/lang/Math;->min(II)I

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    move-object/from16 v16, v12

    .line 207
    .line 208
    iget v12, v1, LF/c;->d:I

    .line 209
    .line 210
    move/from16 v17, v5

    .line 211
    .line 212
    iget v5, v2, LF/c;->d:I

    .line 213
    .line 214
    move-object/from16 v18, v6

    .line 215
    .line 216
    invoke-static {v12, v5}, Ljava/lang/Math;->min(II)I

    .line 217
    .line 218
    .line 219
    move-result v6

    .line 220
    invoke-static {v3, v14, v0, v6}, LF/c;->b(IIII)LF/c;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    iget v1, v1, LF/c;->a:I

    .line 225
    .line 226
    iget v2, v2, LF/c;->a:I

    .line 227
    .line 228
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    invoke-static {v10, v13}, Ljava/lang/Math;->max(II)I

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    invoke-static {v15, v4}, Ljava/lang/Math;->max(II)I

    .line 237
    .line 238
    .line 239
    move-result v3

    .line 240
    invoke-static {v12, v5}, Ljava/lang/Math;->max(II)I

    .line 241
    .line 242
    .line 243
    move-result v4

    .line 244
    invoke-static {v1, v2, v3, v4}, LF/c;->b(IIII)LF/c;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    new-instance v10, LE/j;

    .line 249
    .line 250
    const/4 v2, 0x3

    .line 251
    invoke-direct {v10, v0, v1, v2}, LE/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 252
    .line 253
    .line 254
    const/4 v0, 0x0

    .line 255
    invoke-static {v7, v8, v0}, LN/f0;->f(Landroid/view/View;Landroid/view/WindowInsets;Z)V

    .line 256
    .line 257
    .line 258
    new-instance v0, LN/c0;

    .line 259
    .line 260
    move-object v1, v0

    .line 261
    move-object v2, v11

    .line 262
    move-object v3, v9

    .line 263
    move-object/from16 v4, v18

    .line 264
    .line 265
    move/from16 v5, v17

    .line 266
    .line 267
    move-object/from16 v6, p1

    .line 268
    .line 269
    invoke-direct/range {v1 .. v6}, LN/c0;-><init>(LN/j0;LN/w0;LN/w0;ILandroid/view/View;)V

    .line 270
    .line 271
    .line 272
    move-object/from16 v1, v16

    .line 273
    .line 274
    invoke-virtual {v1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 275
    .line 276
    .line 277
    new-instance v0, LN/d0;

    .line 278
    .line 279
    invoke-direct {v0, v11, v7}, LN/d0;-><init>(LN/j0;Landroid/view/View;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 283
    .line 284
    .line 285
    new-instance v0, LK/n;

    .line 286
    .line 287
    invoke-direct {v0, v7, v11, v10, v1}, LK/n;-><init>(Landroid/view/View;LN/j0;LE/j;Landroid/animation/ValueAnimator;)V

    .line 288
    .line 289
    .line 290
    invoke-static {v7, v0}, LN/u;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 291
    .line 292
    .line 293
    move-object/from16 v0, p0

    .line 294
    .line 295
    iput-object v9, v0, LN/e0;->b:LN/w0;

    .line 296
    .line 297
    invoke-static/range {p1 .. p2}, LN/f0;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    return-object v1

    .line 302
    nop

    .line 303
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method
