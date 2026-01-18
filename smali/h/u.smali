.class public final Lh/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/r;
.implements Lo/k0;
.implements Ln/w;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lh/D;


# direct methods
.method public synthetic constructor <init>(Lh/D;I)V
    .locals 0

    .line 1
    iput p2, p0, Lh/u;->f:I

    iput-object p1, p0, Lh/u;->g:Lh/D;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ln/l;Z)V
    .locals 9

    .line 1
    iget v0, p0, Lh/u;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ln/l;->k()Ln/l;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eq v0, p1, :cond_0

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v3, 0x0

    .line 17
    :goto_0
    if-eqz v3, :cond_1

    .line 18
    .line 19
    move-object p1, v0

    .line 20
    :cond_1
    iget-object v4, p0, Lh/u;->g:Lh/D;

    .line 21
    .line 22
    iget-object v5, v4, Lh/D;->R:[Lh/C;

    .line 23
    .line 24
    if-eqz v5, :cond_2

    .line 25
    .line 26
    array-length v6, v5

    .line 27
    goto :goto_1

    .line 28
    :cond_2
    const/4 v6, 0x0

    .line 29
    :goto_1
    if-ge v1, v6, :cond_4

    .line 30
    .line 31
    aget-object v7, v5, v1

    .line 32
    .line 33
    if-eqz v7, :cond_3

    .line 34
    .line 35
    iget-object v8, v7, Lh/C;->h:Ln/l;

    .line 36
    .line 37
    if-ne v8, p1, :cond_3

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_4
    const/4 v7, 0x0

    .line 44
    :goto_2
    if-eqz v7, :cond_6

    .line 45
    .line 46
    if-eqz v3, :cond_5

    .line 47
    .line 48
    iget p1, v7, Lh/C;->a:I

    .line 49
    .line 50
    invoke-virtual {v4, p1, v7, v0}, Lh/D;->o(ILh/C;Ln/l;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v7, v2}, Lh/D;->q(Lh/C;Z)V

    .line 54
    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_5
    invoke-virtual {v4, v7, p2}, Lh/D;->q(Lh/C;Z)V

    .line 58
    .line 59
    .line 60
    :cond_6
    :goto_3
    return-void

    .line 61
    :pswitch_0
    iget-object p2, p0, Lh/u;->g:Lh/D;

    .line 62
    .line 63
    invoke-virtual {p2, p1}, Lh/D;->p(Ln/l;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public h(Ln/l;)Z
    .locals 2

    .line 1
    iget v0, p0, Lh/u;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ln/l;->k()Ln/l;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lh/u;->g:Lh/D;

    .line 13
    .line 14
    iget-boolean v1, v0, Lh/D;->L:Z

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object v1, v0, Lh/D;->q:Landroid/view/Window;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iget-boolean v0, v0, Lh/D;->W:Z

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    const/16 v0, 0x6c

    .line 31
    .line 32
    invoke-interface {v1, v0, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 33
    .line 34
    .line 35
    :cond_0
    const/4 p1, 0x1

    .line 36
    return p1

    .line 37
    :pswitch_0
    iget-object v0, p0, Lh/u;->g:Lh/D;

    .line 38
    .line 39
    iget-object v0, v0, Lh/D;->q:Landroid/view/Window;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    const/16 v1, 0x6c

    .line 48
    .line 49
    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 50
    .line 51
    .line 52
    :cond_1
    const/4 p1, 0x1

    .line 53
    return p1

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public l(Landroid/view/View;LN/w0;)LN/w0;
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-virtual/range {p2 .. p2}, LN/w0;->d()I

    .line 8
    .line 9
    .line 10
    move-result v5

    .line 11
    move-object/from16 v6, p0

    .line 12
    .line 13
    iget-object v7, v6, Lh/u;->g:Lh/D;

    .line 14
    .line 15
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual/range {p2 .. p2}, LN/w0;->d()I

    .line 19
    .line 20
    .line 21
    move-result v8

    .line 22
    iget-object v9, v7, Lh/D;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 23
    .line 24
    const/16 v10, 0x1d

    .line 25
    .line 26
    if-eqz v9, :cond_11

    .line 27
    .line 28
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 29
    .line 30
    .line 31
    move-result-object v9

    .line 32
    instance-of v9, v9, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 33
    .line 34
    if-eqz v9, :cond_11

    .line 35
    .line 36
    iget-object v9, v7, Lh/D;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 37
    .line 38
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 39
    .line 40
    .line 41
    move-result-object v9

    .line 42
    check-cast v9, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 43
    .line 44
    iget-object v12, v7, Lh/D;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 45
    .line 46
    invoke-virtual {v12}, Landroid/view/View;->isShown()Z

    .line 47
    .line 48
    .line 49
    move-result v12

    .line 50
    if-eqz v12, :cond_f

    .line 51
    .line 52
    iget-object v12, v7, Lh/D;->i0:Landroid/graphics/Rect;

    .line 53
    .line 54
    if-nez v12, :cond_0

    .line 55
    .line 56
    new-instance v12, Landroid/graphics/Rect;

    .line 57
    .line 58
    invoke-direct {v12}, Landroid/graphics/Rect;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object v12, v7, Lh/D;->i0:Landroid/graphics/Rect;

    .line 62
    .line 63
    new-instance v12, Landroid/graphics/Rect;

    .line 64
    .line 65
    invoke-direct {v12}, Landroid/graphics/Rect;-><init>()V

    .line 66
    .line 67
    .line 68
    iput-object v12, v7, Lh/D;->j0:Landroid/graphics/Rect;

    .line 69
    .line 70
    :cond_0
    iget-object v12, v7, Lh/D;->i0:Landroid/graphics/Rect;

    .line 71
    .line 72
    iget-object v13, v7, Lh/D;->j0:Landroid/graphics/Rect;

    .line 73
    .line 74
    invoke-virtual/range {p2 .. p2}, LN/w0;->b()I

    .line 75
    .line 76
    .line 77
    move-result v14

    .line 78
    invoke-virtual/range {p2 .. p2}, LN/w0;->d()I

    .line 79
    .line 80
    .line 81
    move-result v15

    .line 82
    invoke-virtual/range {p2 .. p2}, LN/w0;->c()I

    .line 83
    .line 84
    .line 85
    move-result v11

    .line 86
    invoke-virtual/range {p2 .. p2}, LN/w0;->a()I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    invoke-virtual {v12, v14, v15, v11, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 91
    .line 92
    .line 93
    iget-object v4, v7, Lh/D;->G:Landroid/view/ViewGroup;

    .line 94
    .line 95
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 96
    .line 97
    if-lt v11, v10, :cond_1

    .line 98
    .line 99
    sget-boolean v2, Lo/n1;->a:Z

    .line 100
    .line 101
    invoke-static {v4, v12, v13}, Lo/m1;->a(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_1
    sget-boolean v11, Lo/n1;->a:Z

    .line 106
    .line 107
    if-nez v11, :cond_2

    .line 108
    .line 109
    sput-boolean v3, Lo/n1;->a:Z

    .line 110
    .line 111
    :try_start_0
    const-class v11, Landroid/view/View;

    .line 112
    .line 113
    const-string v14, "computeFitSystemWindows"

    .line 114
    .line 115
    new-array v15, v2, [Ljava/lang/Class;

    .line 116
    .line 117
    const-class v17, Landroid/graphics/Rect;

    .line 118
    .line 119
    const/16 v16, 0x0

    .line 120
    .line 121
    aput-object v17, v15, v16

    .line 122
    .line 123
    aput-object v17, v15, v3

    .line 124
    .line 125
    invoke-virtual {v11, v14, v15}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 126
    .line 127
    .line 128
    move-result-object v11

    .line 129
    sput-object v11, Lo/n1;->b:Ljava/lang/reflect/Method;

    .line 130
    .line 131
    invoke-virtual {v11}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 132
    .line 133
    .line 134
    move-result v11

    .line 135
    if-nez v11, :cond_2

    .line 136
    .line 137
    sget-object v11, Lo/n1;->b:Ljava/lang/reflect/Method;

    .line 138
    .line 139
    invoke-virtual {v11, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 140
    .line 141
    .line 142
    goto :goto_0

    .line 143
    :catch_0
    nop

    .line 144
    :cond_2
    :goto_0
    sget-object v11, Lo/n1;->b:Ljava/lang/reflect/Method;

    .line 145
    .line 146
    if-eqz v11, :cond_3

    .line 147
    .line 148
    :try_start_1
    new-array v2, v2, [Ljava/lang/Object;

    .line 149
    .line 150
    const/4 v14, 0x0

    .line 151
    aput-object v12, v2, v14

    .line 152
    .line 153
    aput-object v13, v2, v3

    .line 154
    .line 155
    invoke-virtual {v11, v4, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 156
    .line 157
    .line 158
    goto :goto_1

    .line 159
    :catch_1
    nop

    .line 160
    :cond_3
    :goto_1
    iget v2, v12, Landroid/graphics/Rect;->top:I

    .line 161
    .line 162
    iget v4, v12, Landroid/graphics/Rect;->left:I

    .line 163
    .line 164
    iget v11, v12, Landroid/graphics/Rect;->right:I

    .line 165
    .line 166
    iget-object v12, v7, Lh/D;->G:Landroid/view/ViewGroup;

    .line 167
    .line 168
    invoke-static {v12}, LN/Q;->h(Landroid/view/View;)LN/w0;

    .line 169
    .line 170
    .line 171
    move-result-object v12

    .line 172
    if-nez v12, :cond_4

    .line 173
    .line 174
    const/4 v13, 0x0

    .line 175
    goto :goto_2

    .line 176
    :cond_4
    invoke-virtual {v12}, LN/w0;->b()I

    .line 177
    .line 178
    .line 179
    move-result v13

    .line 180
    :goto_2
    if-nez v12, :cond_5

    .line 181
    .line 182
    const/4 v12, 0x0

    .line 183
    goto :goto_3

    .line 184
    :cond_5
    invoke-virtual {v12}, LN/w0;->c()I

    .line 185
    .line 186
    .line 187
    move-result v12

    .line 188
    :goto_3
    iget v14, v9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 189
    .line 190
    if-ne v14, v2, :cond_7

    .line 191
    .line 192
    iget v14, v9, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 193
    .line 194
    if-ne v14, v4, :cond_7

    .line 195
    .line 196
    iget v14, v9, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 197
    .line 198
    if-eq v14, v11, :cond_6

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_6
    const/4 v4, 0x0

    .line 202
    goto :goto_5

    .line 203
    :cond_7
    :goto_4
    iput v2, v9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 204
    .line 205
    iput v4, v9, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 206
    .line 207
    iput v11, v9, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 208
    .line 209
    const/4 v4, 0x1

    .line 210
    :goto_5
    iget-object v11, v7, Lh/D;->p:Landroid/content/Context;

    .line 211
    .line 212
    if-lez v2, :cond_8

    .line 213
    .line 214
    iget-object v2, v7, Lh/D;->I:Landroid/view/View;

    .line 215
    .line 216
    if-nez v2, :cond_8

    .line 217
    .line 218
    new-instance v2, Landroid/view/View;

    .line 219
    .line 220
    invoke-direct {v2, v11}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 221
    .line 222
    .line 223
    iput-object v2, v7, Lh/D;->I:Landroid/view/View;

    .line 224
    .line 225
    const/16 v14, 0x8

    .line 226
    .line 227
    invoke-virtual {v2, v14}, Landroid/view/View;->setVisibility(I)V

    .line 228
    .line 229
    .line 230
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 231
    .line 232
    iget v15, v9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 233
    .line 234
    const/16 v3, 0x33

    .line 235
    .line 236
    const/4 v14, -0x1

    .line 237
    invoke-direct {v2, v14, v15, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 238
    .line 239
    .line 240
    iput v13, v2, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 241
    .line 242
    iput v12, v2, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 243
    .line 244
    iget-object v3, v7, Lh/D;->G:Landroid/view/ViewGroup;

    .line 245
    .line 246
    iget-object v12, v7, Lh/D;->I:Landroid/view/View;

    .line 247
    .line 248
    invoke-virtual {v3, v12, v14, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 249
    .line 250
    .line 251
    goto :goto_6

    .line 252
    :cond_8
    iget-object v2, v7, Lh/D;->I:Landroid/view/View;

    .line 253
    .line 254
    if-eqz v2, :cond_a

    .line 255
    .line 256
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 261
    .line 262
    iget v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 263
    .line 264
    iget v14, v9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 265
    .line 266
    if-ne v3, v14, :cond_9

    .line 267
    .line 268
    iget v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 269
    .line 270
    if-ne v3, v13, :cond_9

    .line 271
    .line 272
    iget v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 273
    .line 274
    if-eq v3, v12, :cond_a

    .line 275
    .line 276
    :cond_9
    iput v14, v2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 277
    .line 278
    iput v13, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 279
    .line 280
    iput v12, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 281
    .line 282
    iget-object v3, v7, Lh/D;->I:Landroid/view/View;

    .line 283
    .line 284
    invoke-virtual {v3, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 285
    .line 286
    .line 287
    :cond_a
    :goto_6
    iget-object v2, v7, Lh/D;->I:Landroid/view/View;

    .line 288
    .line 289
    if-eqz v2, :cond_b

    .line 290
    .line 291
    const/4 v3, 0x1

    .line 292
    goto :goto_7

    .line 293
    :cond_b
    const/4 v3, 0x0

    .line 294
    :goto_7
    if-eqz v3, :cond_d

    .line 295
    .line 296
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 297
    .line 298
    .line 299
    move-result v2

    .line 300
    if-eqz v2, :cond_d

    .line 301
    .line 302
    iget-object v2, v7, Lh/D;->I:Landroid/view/View;

    .line 303
    .line 304
    invoke-virtual {v2}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 305
    .line 306
    .line 307
    move-result v12

    .line 308
    and-int/lit16 v12, v12, 0x2000

    .line 309
    .line 310
    if-eqz v12, :cond_c

    .line 311
    .line 312
    const v12, 0x7f060006

    .line 313
    .line 314
    .line 315
    invoke-static {v11, v12}, Lp0/a;->F(Landroid/content/Context;I)I

    .line 316
    .line 317
    .line 318
    move-result v11

    .line 319
    goto :goto_8

    .line 320
    :cond_c
    const v12, 0x7f060005

    .line 321
    .line 322
    .line 323
    invoke-static {v11, v12}, Lp0/a;->F(Landroid/content/Context;I)I

    .line 324
    .line 325
    .line 326
    move-result v11

    .line 327
    :goto_8
    invoke-virtual {v2, v11}, Landroid/view/View;->setBackgroundColor(I)V

    .line 328
    .line 329
    .line 330
    :cond_d
    iget-boolean v2, v7, Lh/D;->N:Z

    .line 331
    .line 332
    if-nez v2, :cond_e

    .line 333
    .line 334
    if-eqz v3, :cond_e

    .line 335
    .line 336
    const/4 v8, 0x0

    .line 337
    :cond_e
    move/from16 v16, v3

    .line 338
    .line 339
    move v3, v4

    .line 340
    const/4 v2, 0x0

    .line 341
    goto :goto_a

    .line 342
    :cond_f
    iget v2, v9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 343
    .line 344
    if-eqz v2, :cond_10

    .line 345
    .line 346
    const/4 v2, 0x0

    .line 347
    iput v2, v9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 348
    .line 349
    const/4 v3, 0x1

    .line 350
    :goto_9
    const/16 v16, 0x0

    .line 351
    .line 352
    goto :goto_a

    .line 353
    :cond_10
    const/4 v2, 0x0

    .line 354
    const/4 v3, 0x0

    .line 355
    goto :goto_9

    .line 356
    :goto_a
    if-eqz v3, :cond_12

    .line 357
    .line 358
    iget-object v3, v7, Lh/D;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 359
    .line 360
    invoke-virtual {v3, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 361
    .line 362
    .line 363
    goto :goto_b

    .line 364
    :cond_11
    const/4 v2, 0x0

    .line 365
    const/16 v16, 0x0

    .line 366
    .line 367
    :cond_12
    :goto_b
    iget-object v3, v7, Lh/D;->I:Landroid/view/View;

    .line 368
    .line 369
    if-eqz v3, :cond_14

    .line 370
    .line 371
    if-eqz v16, :cond_13

    .line 372
    .line 373
    const/4 v4, 0x0

    .line 374
    goto :goto_c

    .line 375
    :cond_13
    const/16 v4, 0x8

    .line 376
    .line 377
    :goto_c
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 378
    .line 379
    .line 380
    :cond_14
    if-eq v5, v8, :cond_17

    .line 381
    .line 382
    invoke-virtual/range {p2 .. p2}, LN/w0;->b()I

    .line 383
    .line 384
    .line 385
    move-result v2

    .line 386
    invoke-virtual/range {p2 .. p2}, LN/w0;->c()I

    .line 387
    .line 388
    .line 389
    move-result v3

    .line 390
    invoke-virtual/range {p2 .. p2}, LN/w0;->a()I

    .line 391
    .line 392
    .line 393
    move-result v4

    .line 394
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 395
    .line 396
    const/16 v7, 0x1e

    .line 397
    .line 398
    if-lt v5, v7, :cond_15

    .line 399
    .line 400
    new-instance v5, LN/n0;

    .line 401
    .line 402
    invoke-direct {v5, v1}, LN/n0;-><init>(LN/w0;)V

    .line 403
    .line 404
    .line 405
    goto :goto_d

    .line 406
    :cond_15
    if-lt v5, v10, :cond_16

    .line 407
    .line 408
    new-instance v5, LN/m0;

    .line 409
    .line 410
    invoke-direct {v5, v1}, LN/m0;-><init>(LN/w0;)V

    .line 411
    .line 412
    .line 413
    goto :goto_d

    .line 414
    :cond_16
    new-instance v5, LN/l0;

    .line 415
    .line 416
    invoke-direct {v5, v1}, LN/l0;-><init>(LN/w0;)V

    .line 417
    .line 418
    .line 419
    :goto_d
    invoke-static {v2, v8, v3, v4}, LF/c;->b(IIII)LF/c;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    invoke-virtual {v5, v1}, LN/o0;->g(LF/c;)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v5}, LN/o0;->b()LN/w0;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    :cond_17
    sget-object v2, LN/Q;->a:Ljava/util/WeakHashMap;

    .line 431
    .line 432
    invoke-virtual {v1}, LN/w0;->f()Landroid/view/WindowInsets;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    if-eqz v2, :cond_18

    .line 437
    .line 438
    invoke-static {v0, v2}, LN/D;->b(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 439
    .line 440
    .line 441
    move-result-object v3

    .line 442
    invoke-virtual {v3, v2}, Landroid/view/WindowInsets;->equals(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    move-result v2

    .line 446
    if-nez v2, :cond_18

    .line 447
    .line 448
    invoke-static {v0, v3}, LN/w0;->g(Landroid/view/View;Landroid/view/WindowInsets;)LN/w0;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    :cond_18
    return-object v1
.end method
