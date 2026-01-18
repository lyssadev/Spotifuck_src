.class public final Lo/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;
.implements Landroid/view/View$OnHoverListener;
.implements Landroid/view/View$OnAttachStateChangeListener;


# static fields
.field public static p:Lo/i1;

.field public static q:Lo/i1;


# instance fields
.field public final f:Landroid/view/View;

.field public final g:Ljava/lang/CharSequence;

.field public final h:I

.field public final i:Lo/h1;

.field public final j:Lo/h1;

.field public k:I

.field public l:I

.field public m:Lo/j1;

.field public n:Z

.field public o:Z


# direct methods
.method public constructor <init>(Landroid/view/View;Ljava/lang/CharSequence;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lo/h1;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lo/h1;-><init>(Lo/i1;I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lo/i1;->i:Lo/h1;

    .line 11
    .line 12
    new-instance v0, Lo/h1;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, p0, v1}, Lo/h1;-><init>(Lo/i1;I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lo/i1;->j:Lo/h1;

    .line 19
    .line 20
    iput-object p1, p0, Lo/i1;->f:Landroid/view/View;

    .line 21
    .line 22
    iput-object p2, p0, Lo/i1;->g:Ljava/lang/CharSequence;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-static {p2}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    sget-object v0, LN/V;->a:Ljava/lang/reflect/Method;

    .line 33
    .line 34
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 35
    .line 36
    const/16 v2, 0x1c

    .line 37
    .line 38
    if-lt v0, v2, :cond_0

    .line 39
    .line 40
    invoke-static {p2}, LN/T;->a(Landroid/view/ViewConfiguration;)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    div-int/lit8 p2, p2, 0x2

    .line 50
    .line 51
    :goto_0
    iput p2, p0, Lo/i1;->h:I

    .line 52
    .line 53
    iput-boolean v1, p0, Lo/i1;->o:Z

    .line 54
    .line 55
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnHoverListener(Landroid/view/View$OnHoverListener;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public static b(Lo/i1;)V
    .locals 3

    .line 1
    sget-object v0, Lo/i1;->p:Lo/i1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, v0, Lo/i1;->i:Lo/h1;

    .line 6
    .line 7
    iget-object v0, v0, Lo/i1;->f:Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 10
    .line 11
    .line 12
    :cond_0
    sput-object p0, Lo/i1;->p:Lo/i1;

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lo/i1;->i:Lo/h1;

    .line 17
    .line 18
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    int-to-long v1, v1

    .line 23
    iget-object p0, p0, Lo/i1;->f:Landroid/view/View;

    .line 24
    .line 25
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    sget-object v0, Lo/i1;->q:Lo/i1;

    .line 2
    .line 3
    iget-object v1, p0, Lo/i1;->f:Landroid/view/View;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v0, p0, :cond_2

    .line 7
    .line 8
    sput-object v2, Lo/i1;->q:Lo/i1;

    .line 9
    .line 10
    iget-object v0, p0, Lo/i1;->m:Lo/j1;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v3, v0, Lo/j1;->b:Landroid/view/View;

    .line 15
    .line 16
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    iget-object v0, v0, Lo/j1;->a:Landroid/content/Context;

    .line 23
    .line 24
    const-string v4, "window"

    .line 25
    .line 26
    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Landroid/view/WindowManager;

    .line 31
    .line 32
    invoke-interface {v0, v3}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    iput-object v2, p0, Lo/i1;->m:Lo/j1;

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    iput-boolean v0, p0, Lo/i1;->o:Z

    .line 39
    .line 40
    invoke-virtual {v1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const-string v0, "TooltipCompatHandler"

    .line 45
    .line 46
    const-string v3, "sActiveHandler.mPopup == null"

    .line 47
    .line 48
    invoke-static {v0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    :cond_2
    :goto_0
    sget-object v0, Lo/i1;->p:Lo/i1;

    .line 52
    .line 53
    if-ne v0, p0, :cond_3

    .line 54
    .line 55
    invoke-static {v2}, Lo/i1;->b(Lo/i1;)V

    .line 56
    .line 57
    .line 58
    :cond_3
    iget-object v0, p0, Lo/i1;->j:Lo/h1;

    .line 59
    .line 60
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final c(Z)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lo/i1;->f:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/4 v2, 0x0

    .line 13
    invoke-static {v2}, Lo/i1;->b(Lo/i1;)V

    .line 14
    .line 15
    .line 16
    sget-object v2, Lo/i1;->q:Lo/i1;

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {v2}, Lo/i1;->a()V

    .line 21
    .line 22
    .line 23
    :cond_1
    sput-object v0, Lo/i1;->q:Lo/i1;

    .line 24
    .line 25
    move/from16 v2, p1

    .line 26
    .line 27
    iput-boolean v2, v0, Lo/i1;->n:Z

    .line 28
    .line 29
    new-instance v2, Lo/j1;

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-direct {v2, v3}, Lo/j1;-><init>(Landroid/content/Context;)V

    .line 36
    .line 37
    .line 38
    iput-object v2, v0, Lo/i1;->m:Lo/j1;

    .line 39
    .line 40
    iget v3, v0, Lo/i1;->k:I

    .line 41
    .line 42
    iget v4, v0, Lo/i1;->l:I

    .line 43
    .line 44
    iget-boolean v5, v0, Lo/i1;->n:Z

    .line 45
    .line 46
    iget-object v6, v2, Lo/j1;->b:Landroid/view/View;

    .line 47
    .line 48
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    const-string v8, "window"

    .line 53
    .line 54
    iget-object v9, v2, Lo/j1;->a:Landroid/content/Context;

    .line 55
    .line 56
    if-eqz v7, :cond_2

    .line 57
    .line 58
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    if-eqz v7, :cond_2

    .line 63
    .line 64
    invoke-virtual {v9, v8}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    check-cast v7, Landroid/view/WindowManager;

    .line 69
    .line 70
    invoke-interface {v7, v6}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    iget-object v7, v2, Lo/j1;->c:Landroid/widget/TextView;

    .line 74
    .line 75
    iget-object v10, v0, Lo/i1;->g:Ljava/lang/CharSequence;

    .line 76
    .line 77
    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 78
    .line 79
    .line 80
    iget-object v7, v2, Lo/j1;->d:Landroid/view/WindowManager$LayoutParams;

    .line 81
    .line 82
    invoke-virtual {v1}, Landroid/view/View;->getApplicationWindowToken()Landroid/os/IBinder;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    iput-object v10, v7, Landroid/view/WindowManager$LayoutParams;->token:Landroid/os/IBinder;

    .line 87
    .line 88
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 89
    .line 90
    .line 91
    move-result-object v10

    .line 92
    const v11, 0x7f070326

    .line 93
    .line 94
    .line 95
    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 96
    .line 97
    .line 98
    move-result v10

    .line 99
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 100
    .line 101
    .line 102
    move-result v11

    .line 103
    const/4 v12, 0x2

    .line 104
    if-lt v11, v10, :cond_3

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_3
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    div-int/2addr v3, v12

    .line 112
    :goto_0
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 113
    .line 114
    .line 115
    move-result v11

    .line 116
    if-lt v11, v10, :cond_4

    .line 117
    .line 118
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 119
    .line 120
    .line 121
    move-result-object v10

    .line 122
    const v11, 0x7f070325

    .line 123
    .line 124
    .line 125
    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 126
    .line 127
    .line 128
    move-result v10

    .line 129
    add-int v11, v4, v10

    .line 130
    .line 131
    sub-int/2addr v4, v10

    .line 132
    goto :goto_1

    .line 133
    :cond_4
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 134
    .line 135
    .line 136
    move-result v11

    .line 137
    const/4 v4, 0x0

    .line 138
    :goto_1
    const/16 v10, 0x31

    .line 139
    .line 140
    iput v10, v7, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 141
    .line 142
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 143
    .line 144
    .line 145
    move-result-object v10

    .line 146
    if-eqz v5, :cond_5

    .line 147
    .line 148
    const v14, 0x7f070329

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_5
    const v14, 0x7f070328

    .line 153
    .line 154
    .line 155
    :goto_2
    invoke-virtual {v10, v14}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 156
    .line 157
    .line 158
    move-result v10

    .line 159
    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 160
    .line 161
    .line 162
    move-result-object v14

    .line 163
    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 164
    .line 165
    .line 166
    move-result-object v15

    .line 167
    instance-of v13, v15, Landroid/view/WindowManager$LayoutParams;

    .line 168
    .line 169
    if-eqz v13, :cond_6

    .line 170
    .line 171
    check-cast v15, Landroid/view/WindowManager$LayoutParams;

    .line 172
    .line 173
    iget v13, v15, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 174
    .line 175
    if-ne v13, v12, :cond_6

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_6
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 179
    .line 180
    .line 181
    move-result-object v13

    .line 182
    :goto_3
    instance-of v15, v13, Landroid/content/ContextWrapper;

    .line 183
    .line 184
    if-eqz v15, :cond_8

    .line 185
    .line 186
    instance-of v15, v13, Landroid/app/Activity;

    .line 187
    .line 188
    if-eqz v15, :cond_7

    .line 189
    .line 190
    check-cast v13, Landroid/app/Activity;

    .line 191
    .line 192
    invoke-virtual {v13}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 193
    .line 194
    .line 195
    move-result-object v13

    .line 196
    invoke-virtual {v13}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 197
    .line 198
    .line 199
    move-result-object v14

    .line 200
    goto :goto_4

    .line 201
    :cond_7
    check-cast v13, Landroid/content/ContextWrapper;

    .line 202
    .line 203
    invoke-virtual {v13}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 204
    .line 205
    .line 206
    move-result-object v13

    .line 207
    goto :goto_3

    .line 208
    :cond_8
    :goto_4
    if-nez v14, :cond_9

    .line 209
    .line 210
    const-string v2, "TooltipPopup"

    .line 211
    .line 212
    const-string v3, "Cannot find app view"

    .line 213
    .line 214
    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 215
    .line 216
    .line 217
    move-object v0, v8

    .line 218
    goto/16 :goto_8

    .line 219
    .line 220
    :cond_9
    iget-object v15, v2, Lo/j1;->e:Landroid/graphics/Rect;

    .line 221
    .line 222
    invoke-virtual {v14, v15}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 223
    .line 224
    .line 225
    iget v12, v15, Landroid/graphics/Rect;->left:I

    .line 226
    .line 227
    if-gez v12, :cond_b

    .line 228
    .line 229
    iget v12, v15, Landroid/graphics/Rect;->top:I

    .line 230
    .line 231
    if-gez v12, :cond_b

    .line 232
    .line 233
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 234
    .line 235
    .line 236
    move-result-object v12

    .line 237
    const-string v13, "dimen"

    .line 238
    .line 239
    const-string v0, "android"

    .line 240
    .line 241
    move-object/from16 v17, v8

    .line 242
    .line 243
    const-string v8, "status_bar_height"

    .line 244
    .line 245
    invoke-virtual {v12, v8, v13, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    if-eqz v0, :cond_a

    .line 250
    .line 251
    invoke-virtual {v12, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    goto :goto_5

    .line 256
    :cond_a
    const/4 v0, 0x0

    .line 257
    :goto_5
    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 258
    .line 259
    .line 260
    move-result-object v8

    .line 261
    iget v12, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 262
    .line 263
    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 264
    .line 265
    const/4 v13, 0x0

    .line 266
    invoke-virtual {v15, v13, v0, v12, v8}, Landroid/graphics/Rect;->set(IIII)V

    .line 267
    .line 268
    .line 269
    goto :goto_6

    .line 270
    :cond_b
    move-object/from16 v17, v8

    .line 271
    .line 272
    const/4 v13, 0x0

    .line 273
    :goto_6
    iget-object v0, v2, Lo/j1;->g:[I

    .line 274
    .line 275
    invoke-virtual {v14, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 276
    .line 277
    .line 278
    iget-object v2, v2, Lo/j1;->f:[I

    .line 279
    .line 280
    invoke-virtual {v1, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 281
    .line 282
    .line 283
    aget v8, v2, v13

    .line 284
    .line 285
    aget v12, v0, v13

    .line 286
    .line 287
    sub-int/2addr v8, v12

    .line 288
    aput v8, v2, v13

    .line 289
    .line 290
    const/4 v12, 0x1

    .line 291
    aget v16, v2, v12

    .line 292
    .line 293
    aget v0, v0, v12

    .line 294
    .line 295
    sub-int v16, v16, v0

    .line 296
    .line 297
    aput v16, v2, v12

    .line 298
    .line 299
    add-int/2addr v8, v3

    .line 300
    invoke-virtual {v14}, Landroid/view/View;->getWidth()I

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    const/4 v3, 0x2

    .line 305
    div-int/2addr v0, v3

    .line 306
    sub-int/2addr v8, v0

    .line 307
    iput v8, v7, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 308
    .line 309
    invoke-static {v13, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    invoke-virtual {v6, v0, v0}, Landroid/view/View;->measure(II)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    .line 317
    .line 318
    .line 319
    move-result v0

    .line 320
    aget v2, v2, v12

    .line 321
    .line 322
    add-int/2addr v4, v2

    .line 323
    sub-int/2addr v4, v10

    .line 324
    sub-int/2addr v4, v0

    .line 325
    add-int/2addr v2, v11

    .line 326
    add-int/2addr v2, v10

    .line 327
    if-eqz v5, :cond_d

    .line 328
    .line 329
    if-ltz v4, :cond_c

    .line 330
    .line 331
    iput v4, v7, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 332
    .line 333
    goto :goto_7

    .line 334
    :cond_c
    iput v2, v7, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 335
    .line 336
    goto :goto_7

    .line 337
    :cond_d
    add-int/2addr v0, v2

    .line 338
    invoke-virtual {v15}, Landroid/graphics/Rect;->height()I

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    if-gt v0, v3, :cond_e

    .line 343
    .line 344
    iput v2, v7, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 345
    .line 346
    goto :goto_7

    .line 347
    :cond_e
    iput v4, v7, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 348
    .line 349
    :goto_7
    move-object/from16 v0, v17

    .line 350
    .line 351
    :goto_8
    invoke-virtual {v9, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    check-cast v0, Landroid/view/WindowManager;

    .line 356
    .line 357
    invoke-interface {v0, v6, v7}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 358
    .line 359
    .line 360
    move-object/from16 v0, p0

    .line 361
    .line 362
    invoke-virtual {v1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 363
    .line 364
    .line 365
    iget-boolean v2, v0, Lo/i1;->n:Z

    .line 366
    .line 367
    if-eqz v2, :cond_f

    .line 368
    .line 369
    const-wide/16 v2, 0x9c4

    .line 370
    .line 371
    goto :goto_a

    .line 372
    :cond_f
    sget-object v2, LN/Q;->a:Ljava/util/WeakHashMap;

    .line 373
    .line 374
    invoke-virtual {v1}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 375
    .line 376
    .line 377
    move-result v2

    .line 378
    const/4 v3, 0x1

    .line 379
    and-int/2addr v2, v3

    .line 380
    if-ne v2, v3, :cond_10

    .line 381
    .line 382
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 383
    .line 384
    .line 385
    move-result v2

    .line 386
    int-to-long v2, v2

    .line 387
    const-wide/16 v4, 0xbb8

    .line 388
    .line 389
    :goto_9
    sub-long v2, v4, v2

    .line 390
    .line 391
    goto :goto_a

    .line 392
    :cond_10
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 393
    .line 394
    .line 395
    move-result v2

    .line 396
    int-to-long v2, v2

    .line 397
    const-wide/16 v4, 0x3a98

    .line 398
    .line 399
    goto :goto_9

    .line 400
    :goto_a
    iget-object v4, v0, Lo/i1;->j:Lo/h1;

    .line 401
    .line 402
    invoke-virtual {v1, v4}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 403
    .line 404
    .line 405
    invoke-virtual {v1, v4, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 406
    .line 407
    .line 408
    return-void
.end method

.method public final onHover(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    iget-object p1, p0, Lo/i1;->m:Lo/j1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-boolean p1, p0, Lo/i1;->n:Z

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    return v0

    .line 11
    :cond_0
    iget-object p1, p0, Lo/i1;->f:Landroid/view/View;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "accessibility"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Landroid/view/accessibility/AccessibilityManager;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    return v0

    .line 38
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v2, 0x7

    .line 43
    if-eq v1, v2, :cond_3

    .line 44
    .line 45
    const/16 p1, 0xa

    .line 46
    .line 47
    if-eq v1, p1, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/4 p1, 0x1

    .line 51
    iput-boolean p1, p0, Lo/i1;->o:Z

    .line 52
    .line 53
    invoke-virtual {p0}, Lo/i1;->a()V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_5

    .line 62
    .line 63
    iget-object p1, p0, Lo/i1;->m:Lo/j1;

    .line 64
    .line 65
    if-nez p1, :cond_5

    .line 66
    .line 67
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    float-to-int p1, p1

    .line 72
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    float-to-int p2, p2

    .line 77
    iget-boolean v1, p0, Lo/i1;->o:Z

    .line 78
    .line 79
    if-nez v1, :cond_4

    .line 80
    .line 81
    iget v1, p0, Lo/i1;->k:I

    .line 82
    .line 83
    sub-int v1, p1, v1

    .line 84
    .line 85
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    iget v2, p0, Lo/i1;->h:I

    .line 90
    .line 91
    if-gt v1, v2, :cond_4

    .line 92
    .line 93
    iget v1, p0, Lo/i1;->l:I

    .line 94
    .line 95
    sub-int v1, p2, v1

    .line 96
    .line 97
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-le v1, v2, :cond_5

    .line 102
    .line 103
    :cond_4
    iput p1, p0, Lo/i1;->k:I

    .line 104
    .line 105
    iput p2, p0, Lo/i1;->l:I

    .line 106
    .line 107
    iput-boolean v0, p0, Lo/i1;->o:Z

    .line 108
    .line 109
    invoke-static {p0}, Lo/i1;->b(Lo/i1;)V

    .line 110
    .line 111
    .line 112
    :cond_5
    :goto_0
    return v0
.end method

.method public final onLongClick(Landroid/view/View;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    div-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    iput v0, p0, Lo/i1;->k:I

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    div-int/lit8 p1, p1, 0x2

    .line 14
    .line 15
    iput p1, p0, Lo/i1;->l:I

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-virtual {p0, p1}, Lo/i1;->c(Z)V

    .line 19
    .line 20
    .line 21
    return p1
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lo/i1;->a()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
