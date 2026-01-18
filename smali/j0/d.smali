.class public final Lj0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:Lj0/j;


# direct methods
.method public synthetic constructor <init>(Lj0/j;Ljava/util/ArrayList;I)V
    .locals 0

    .line 1
    iput p3, p0, Lj0/d;->a:I

    iput-object p1, p0, Lj0/d;->c:Lj0/j;

    iput-object p2, p0, Lj0/d;->b:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lj0/d;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lj0/d;->b:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    iget-object v4, v0, Lj0/d;->c:Lj0/j;

    .line 19
    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Lj0/a0;

    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v5, v3, Lj0/a0;->a:Landroid/view/View;

    .line 32
    .line 33
    invoke-virtual {v5}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    iget-object v7, v4, Lj0/j;->o:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    const/high16 v7, 0x3f800000    # 1.0f

    .line 43
    .line 44
    invoke-virtual {v6, v7}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    iget-wide v8, v4, Lj0/G;->c:J

    .line 49
    .line 50
    invoke-virtual {v7, v8, v9}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    new-instance v8, Lj0/e;

    .line 55
    .line 56
    invoke-direct {v8, v4, v3, v5, v6}, Lj0/e;-><init>(Lj0/j;Lj0/a0;Landroid/view/View;Landroid/view/ViewPropertyAnimator;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v7, v8}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v3}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 68
    .line 69
    .line 70
    iget-object v2, v4, Lj0/j;->l:Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :pswitch_0
    iget-object v1, v0, Lj0/d;->b:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    iget-object v10, v0, Lj0/d;->c:Lj0/j;

    .line 87
    .line 88
    if-eqz v3, :cond_5

    .line 89
    .line 90
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    check-cast v3, Lj0/h;

    .line 95
    .line 96
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    iget-object v4, v3, Lj0/h;->a:Lj0/a0;

    .line 100
    .line 101
    const/4 v5, 0x0

    .line 102
    if-nez v4, :cond_1

    .line 103
    .line 104
    move-object v8, v5

    .line 105
    goto :goto_2

    .line 106
    :cond_1
    iget-object v4, v4, Lj0/a0;->a:Landroid/view/View;

    .line 107
    .line 108
    move-object v8, v4

    .line 109
    :goto_2
    iget-object v4, v3, Lj0/h;->b:Lj0/a0;

    .line 110
    .line 111
    if-eqz v4, :cond_2

    .line 112
    .line 113
    iget-object v4, v4, Lj0/a0;->a:Landroid/view/View;

    .line 114
    .line 115
    move-object v11, v4

    .line 116
    goto :goto_3

    .line 117
    :cond_2
    move-object v11, v5

    .line 118
    :goto_3
    iget-object v12, v10, Lj0/j;->r:Ljava/util/ArrayList;

    .line 119
    .line 120
    iget-wide v13, v10, Lj0/G;->f:J

    .line 121
    .line 122
    const/4 v15, 0x0

    .line 123
    if-eqz v8, :cond_3

    .line 124
    .line 125
    invoke-virtual {v8}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    invoke-virtual {v4, v13, v14}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    iget-object v4, v3, Lj0/h;->a:Lj0/a0;

    .line 134
    .line 135
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    iget v4, v3, Lj0/h;->e:I

    .line 139
    .line 140
    iget v5, v3, Lj0/h;->c:I

    .line 141
    .line 142
    sub-int/2addr v4, v5

    .line 143
    int-to-float v4, v4

    .line 144
    invoke-virtual {v7, v4}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 145
    .line 146
    .line 147
    iget v4, v3, Lj0/h;->f:I

    .line 148
    .line 149
    iget v5, v3, Lj0/h;->d:I

    .line 150
    .line 151
    sub-int/2addr v4, v5

    .line 152
    int-to-float v4, v4

    .line 153
    invoke-virtual {v7, v4}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v7, v15}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 157
    .line 158
    .line 159
    move-result-object v9

    .line 160
    new-instance v6, Lj0/g;

    .line 161
    .line 162
    const/16 v16, 0x0

    .line 163
    .line 164
    move-object v4, v6

    .line 165
    move-object v5, v10

    .line 166
    move-object v15, v6

    .line 167
    move-object v6, v3

    .line 168
    move-object/from16 v17, v2

    .line 169
    .line 170
    move-object v2, v9

    .line 171
    move/from16 v9, v16

    .line 172
    .line 173
    invoke-direct/range {v4 .. v9}, Lj0/g;-><init>(Lj0/j;Lj0/h;Landroid/view/ViewPropertyAnimator;Landroid/view/View;I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2, v15}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 181
    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_3
    move-object/from16 v17, v2

    .line 185
    .line 186
    :goto_4
    if-eqz v11, :cond_4

    .line 187
    .line 188
    invoke-virtual {v11}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 189
    .line 190
    .line 191
    move-result-object v7

    .line 192
    iget-object v2, v3, Lj0/h;->b:Lj0/a0;

    .line 193
    .line 194
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    const/4 v2, 0x0

    .line 198
    invoke-virtual {v7, v2}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    invoke-virtual {v4, v2}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-virtual {v2, v13, v14}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    const/high16 v4, 0x3f800000    # 1.0f

    .line 211
    .line 212
    invoke-virtual {v2, v4}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    new-instance v12, Lj0/g;

    .line 217
    .line 218
    const/4 v9, 0x1

    .line 219
    move-object v4, v12

    .line 220
    move-object v5, v10

    .line 221
    move-object v6, v3

    .line 222
    move-object v8, v11

    .line 223
    invoke-direct/range {v4 .. v9}, Lj0/g;-><init>(Lj0/j;Lj0/h;Landroid/view/ViewPropertyAnimator;Landroid/view/View;I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2, v12}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 231
    .line 232
    .line 233
    :cond_4
    move-object/from16 v2, v17

    .line 234
    .line 235
    goto/16 :goto_1

    .line 236
    .line 237
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 238
    .line 239
    .line 240
    iget-object v2, v10, Lj0/j;->n:Ljava/util/ArrayList;

    .line 241
    .line 242
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    return-void

    .line 246
    :pswitch_1
    iget-object v1, v0, Lj0/d;->b:Ljava/util/ArrayList;

    .line 247
    .line 248
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    iget-object v5, v0, Lj0/d;->c:Lj0/j;

    .line 257
    .line 258
    if-eqz v3, :cond_8

    .line 259
    .line 260
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    check-cast v3, Lj0/i;

    .line 265
    .line 266
    iget-object v6, v3, Lj0/i;->a:Lj0/a0;

    .line 267
    .line 268
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    iget-object v8, v6, Lj0/a0;->a:Landroid/view/View;

    .line 272
    .line 273
    iget v4, v3, Lj0/i;->d:I

    .line 274
    .line 275
    iget v7, v3, Lj0/i;->b:I

    .line 276
    .line 277
    sub-int v7, v4, v7

    .line 278
    .line 279
    iget v4, v3, Lj0/i;->e:I

    .line 280
    .line 281
    iget v3, v3, Lj0/i;->c:I

    .line 282
    .line 283
    sub-int v9, v4, v3

    .line 284
    .line 285
    const/4 v3, 0x0

    .line 286
    if-eqz v7, :cond_6

    .line 287
    .line 288
    invoke-virtual {v8}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 289
    .line 290
    .line 291
    move-result-object v4

    .line 292
    invoke-virtual {v4, v3}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 293
    .line 294
    .line 295
    :cond_6
    if-eqz v9, :cond_7

    .line 296
    .line 297
    invoke-virtual {v8}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    invoke-virtual {v4, v3}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 302
    .line 303
    .line 304
    :cond_7
    invoke-virtual {v8}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 305
    .line 306
    .line 307
    move-result-object v10

    .line 308
    iget-object v3, v5, Lj0/j;->p:Ljava/util/ArrayList;

    .line 309
    .line 310
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    iget-wide v3, v5, Lj0/G;->e:J

    .line 314
    .line 315
    invoke-virtual {v10, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    new-instance v11, Lj0/f;

    .line 320
    .line 321
    move-object v4, v11

    .line 322
    invoke-direct/range {v4 .. v10}, Lj0/f;-><init>(Lj0/j;Lj0/a0;ILandroid/view/View;ILandroid/view/ViewPropertyAnimator;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v3, v11}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    invoke-virtual {v3}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 330
    .line 331
    .line 332
    goto :goto_5

    .line 333
    :cond_8
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 334
    .line 335
    .line 336
    iget-object v2, v5, Lj0/j;->m:Ljava/util/ArrayList;

    .line 337
    .line 338
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    return-void

    .line 342
    nop

    .line 343
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
