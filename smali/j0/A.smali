.class public final Lj0/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public synthetic constructor <init>(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 0

    .line 1
    iput p2, p0, Lj0/A;->a:I

    iput-object p1, p0, Lj0/A;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v3, v0, Lj0/A;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    iget v4, v0, Lj0/A;->a:I

    .line 6
    .line 7
    packed-switch v4, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v4, v3, Landroidx/recyclerview/widget/RecyclerView;->O:Lj0/G;

    .line 11
    .line 12
    if-eqz v4, :cond_b

    .line 13
    .line 14
    check-cast v4, Lj0/j;

    .line 15
    .line 16
    iget-object v5, v4, Lj0/j;->h:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    iget-object v7, v4, Lj0/j;->j:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v8

    .line 28
    iget-object v9, v4, Lj0/j;->k:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v10

    .line 34
    iget-object v11, v4, Lj0/j;->i:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v12

    .line 40
    if-eqz v6, :cond_0

    .line 41
    .line 42
    if-eqz v8, :cond_0

    .line 43
    .line 44
    if-eqz v12, :cond_0

    .line 45
    .line 46
    if-eqz v10, :cond_0

    .line 47
    .line 48
    goto/16 :goto_6

    .line 49
    .line 50
    :cond_0
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v13

    .line 54
    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v14

    .line 58
    iget-wide v1, v4, Lj0/G;->d:J

    .line 59
    .line 60
    if-eqz v14, :cond_1

    .line 61
    .line 62
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v14

    .line 66
    check-cast v14, Lj0/a0;

    .line 67
    .line 68
    iget-object v15, v14, Lj0/a0;->a:Landroid/view/View;

    .line 69
    .line 70
    invoke-virtual {v15}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    move-object/from16 v16, v13

    .line 75
    .line 76
    iget-object v13, v4, Lj0/j;->q:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    const/4 v2, 0x0

    .line 86
    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    new-instance v2, Lj0/e;

    .line 91
    .line 92
    invoke-direct {v2, v4, v14, v0, v15}, Lj0/e;-><init>(Lj0/j;Lj0/a0;Landroid/view/ViewPropertyAnimator;Landroid/view/View;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 100
    .line 101
    .line 102
    move-object/from16 v0, p0

    .line 103
    .line 104
    move-object/from16 v13, v16

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 108
    .line 109
    .line 110
    if-nez v8, :cond_3

    .line 111
    .line 112
    new-instance v0, Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 118
    .line 119
    .line 120
    iget-object v5, v4, Lj0/j;->m:Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    .line 126
    .line 127
    .line 128
    new-instance v5, Lj0/d;

    .line 129
    .line 130
    const/4 v7, 0x0

    .line 131
    invoke-direct {v5, v4, v0, v7}, Lj0/d;-><init>(Lj0/j;Ljava/util/ArrayList;I)V

    .line 132
    .line 133
    .line 134
    if-nez v6, :cond_2

    .line 135
    .line 136
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    check-cast v0, Lj0/i;

    .line 141
    .line 142
    iget-object v0, v0, Lj0/i;->a:Lj0/a0;

    .line 143
    .line 144
    iget-object v0, v0, Lj0/a0;->a:Landroid/view/View;

    .line 145
    .line 146
    sget-object v7, LN/Q;->a:Ljava/util/WeakHashMap;

    .line 147
    .line 148
    invoke-virtual {v0, v5, v1, v2}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_2
    invoke-virtual {v5}, Lj0/d;->run()V

    .line 153
    .line 154
    .line 155
    :cond_3
    :goto_1
    if-nez v10, :cond_5

    .line 156
    .line 157
    new-instance v0, Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 163
    .line 164
    .line 165
    iget-object v5, v4, Lj0/j;->n:Ljava/util/ArrayList;

    .line 166
    .line 167
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    .line 171
    .line 172
    .line 173
    new-instance v5, Lj0/d;

    .line 174
    .line 175
    const/4 v7, 0x1

    .line 176
    invoke-direct {v5, v4, v0, v7}, Lj0/d;-><init>(Lj0/j;Ljava/util/ArrayList;I)V

    .line 177
    .line 178
    .line 179
    if-nez v6, :cond_4

    .line 180
    .line 181
    const/4 v7, 0x0

    .line 182
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    check-cast v0, Lj0/h;

    .line 187
    .line 188
    iget-object v0, v0, Lj0/h;->a:Lj0/a0;

    .line 189
    .line 190
    iget-object v0, v0, Lj0/a0;->a:Landroid/view/View;

    .line 191
    .line 192
    sget-object v7, LN/Q;->a:Ljava/util/WeakHashMap;

    .line 193
    .line 194
    invoke-virtual {v0, v5, v1, v2}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    .line 195
    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_4
    invoke-virtual {v5}, Lj0/d;->run()V

    .line 199
    .line 200
    .line 201
    :cond_5
    :goto_2
    if-nez v12, :cond_b

    .line 202
    .line 203
    new-instance v0, Ljava/util/ArrayList;

    .line 204
    .line 205
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 209
    .line 210
    .line 211
    iget-object v5, v4, Lj0/j;->l:Ljava/util/ArrayList;

    .line 212
    .line 213
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    .line 217
    .line 218
    .line 219
    new-instance v5, Lj0/d;

    .line 220
    .line 221
    const/4 v7, 0x2

    .line 222
    invoke-direct {v5, v4, v0, v7}, Lj0/d;-><init>(Lj0/j;Ljava/util/ArrayList;I)V

    .line 223
    .line 224
    .line 225
    if-eqz v6, :cond_7

    .line 226
    .line 227
    if-eqz v8, :cond_7

    .line 228
    .line 229
    if-nez v10, :cond_6

    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_6
    invoke-virtual {v5}, Lj0/d;->run()V

    .line 233
    .line 234
    .line 235
    goto :goto_6

    .line 236
    :cond_7
    :goto_3
    const-wide/16 v11, 0x0

    .line 237
    .line 238
    if-nez v6, :cond_8

    .line 239
    .line 240
    goto :goto_4

    .line 241
    :cond_8
    move-wide v1, v11

    .line 242
    :goto_4
    if-nez v8, :cond_9

    .line 243
    .line 244
    iget-wide v6, v4, Lj0/G;->e:J

    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_9
    move-wide v6, v11

    .line 248
    :goto_5
    if-nez v10, :cond_a

    .line 249
    .line 250
    iget-wide v11, v4, Lj0/G;->f:J

    .line 251
    .line 252
    :cond_a
    invoke-static {v6, v7, v11, v12}, Ljava/lang/Math;->max(JJ)J

    .line 253
    .line 254
    .line 255
    move-result-wide v6

    .line 256
    add-long/2addr v6, v1

    .line 257
    const/4 v1, 0x0

    .line 258
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    check-cast v0, Lj0/a0;

    .line 263
    .line 264
    iget-object v0, v0, Lj0/a0;->a:Landroid/view/View;

    .line 265
    .line 266
    sget-object v1, LN/Q;->a:Ljava/util/WeakHashMap;

    .line 267
    .line 268
    invoke-virtual {v0, v5, v6, v7}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    .line 269
    .line 270
    .line 271
    :cond_b
    :goto_6
    const/4 v0, 0x0

    .line 272
    iput-boolean v0, v3, Landroidx/recyclerview/widget/RecyclerView;->p0:Z

    .line 273
    .line 274
    return-void

    .line 275
    :pswitch_0
    iget-boolean v0, v3, Landroidx/recyclerview/widget/RecyclerView;->x:Z

    .line 276
    .line 277
    if-eqz v0, :cond_f

    .line 278
    .line 279
    invoke-virtual {v3}, Landroid/view/View;->isLayoutRequested()Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-eqz v0, :cond_c

    .line 284
    .line 285
    goto :goto_7

    .line 286
    :cond_c
    iget-boolean v0, v3, Landroidx/recyclerview/widget/RecyclerView;->v:Z

    .line 287
    .line 288
    if-nez v0, :cond_d

    .line 289
    .line 290
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 291
    .line 292
    .line 293
    goto :goto_7

    .line 294
    :cond_d
    iget-boolean v0, v3, Landroidx/recyclerview/widget/RecyclerView;->A:Z

    .line 295
    .line 296
    if-eqz v0, :cond_e

    .line 297
    .line 298
    const/4 v0, 0x1

    .line 299
    iput-boolean v0, v3, Landroidx/recyclerview/widget/RecyclerView;->z:Z

    .line 300
    .line 301
    goto :goto_7

    .line 302
    :cond_e
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->m()V

    .line 303
    .line 304
    .line 305
    :cond_f
    :goto_7
    return-void

    .line 306
    nop

    .line 307
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
