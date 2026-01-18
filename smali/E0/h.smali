.class public final LE0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final l:I

.field public static m:Z

.field public static n:Ljava/lang/reflect/Constructor;

.field public static o:Landroid/text/TextDirectionHeuristic;


# instance fields
.field public a:Ljava/lang/CharSequence;

.field public final b:Landroid/text/TextPaint;

.field public final c:I

.field public d:I

.field public e:Landroid/text/Layout$Alignment;

.field public f:I

.field public g:F

.field public h:I

.field public i:Z

.field public j:Z

.field public k:Landroid/text/TextUtils$TruncateAt;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    sput v0, LE0/h;->l:I

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE0/h;->a:Ljava/lang/CharSequence;

    .line 5
    .line 6
    iput-object p2, p0, LE0/h;->b:Landroid/text/TextPaint;

    .line 7
    .line 8
    iput p3, p0, LE0/h;->c:I

    .line 9
    .line 10
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, LE0/h;->d:I

    .line 15
    .line 16
    sget-object p1, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 17
    .line 18
    iput-object p1, p0, LE0/h;->e:Landroid/text/Layout$Alignment;

    .line 19
    .line 20
    const p1, 0x7fffffff

    .line 21
    .line 22
    .line 23
    iput p1, p0, LE0/h;->f:I

    .line 24
    .line 25
    const/high16 p1, 0x3f800000    # 1.0f

    .line 26
    .line 27
    iput p1, p0, LE0/h;->g:F

    .line 28
    .line 29
    sget p1, LE0/h;->l:I

    .line 30
    .line 31
    iput p1, p0, LE0/h;->h:I

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    iput-boolean p1, p0, LE0/h;->i:Z

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    iput-object p1, p0, LE0/h;->k:Landroid/text/TextUtils$TruncateAt;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final a()Landroid/text/StaticLayout;
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v6, 0x7

    .line 4
    const/4 v7, 0x6

    .line 5
    const/4 v8, 0x5

    .line 6
    const/4 v9, 0x4

    .line 7
    const/4 v10, 0x3

    .line 8
    const/4 v11, 0x2

    .line 9
    const/16 v12, 0xd

    .line 10
    .line 11
    const/4 v13, 0x1

    .line 12
    const/4 v14, 0x0

    .line 13
    iget-object v15, v1, LE0/h;->a:Ljava/lang/CharSequence;

    .line 14
    .line 15
    if-nez v15, :cond_0

    .line 16
    .line 17
    const-string v15, ""

    .line 18
    .line 19
    iput-object v15, v1, LE0/h;->a:Ljava/lang/CharSequence;

    .line 20
    .line 21
    :cond_0
    iget v15, v1, LE0/h;->c:I

    .line 22
    .line 23
    invoke-static {v14, v15}, Ljava/lang/Math;->max(II)I

    .line 24
    .line 25
    .line 26
    move-result v15

    .line 27
    iget-object v0, v1, LE0/h;->a:Ljava/lang/CharSequence;

    .line 28
    .line 29
    iget v2, v1, LE0/h;->f:I

    .line 30
    .line 31
    iget-object v3, v1, LE0/h;->b:Landroid/text/TextPaint;

    .line 32
    .line 33
    if-ne v2, v13, :cond_1

    .line 34
    .line 35
    int-to-float v2, v15

    .line 36
    iget-object v4, v1, LE0/h;->k:Landroid/text/TextUtils$TruncateAt;

    .line 37
    .line 38
    invoke-static {v0, v3, v2, v4}, Landroid/text/TextUtils;->ellipsize(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    :cond_1
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    iget v4, v1, LE0/h;->d:I

    .line 47
    .line 48
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    iput v2, v1, LE0/h;->d:I

    .line 53
    .line 54
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 55
    .line 56
    const/high16 v18, 0x3f800000    # 1.0f

    .line 57
    .line 58
    const/16 v5, 0x17

    .line 59
    .line 60
    if-lt v4, v5, :cond_7

    .line 61
    .line 62
    iget-boolean v4, v1, LE0/h;->j:Z

    .line 63
    .line 64
    if-eqz v4, :cond_2

    .line 65
    .line 66
    iget v4, v1, LE0/h;->f:I

    .line 67
    .line 68
    if-ne v4, v13, :cond_2

    .line 69
    .line 70
    sget-object v4, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 71
    .line 72
    iput-object v4, v1, LE0/h;->e:Landroid/text/Layout$Alignment;

    .line 73
    .line 74
    :cond_2
    invoke-static {v0, v2, v3, v15}, LC0/a;->d(Ljava/lang/CharSequence;ILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iget-object v2, v1, LE0/h;->e:Landroid/text/Layout$Alignment;

    .line 79
    .line 80
    invoke-static {v0, v2}, LC0/a;->p(Landroid/text/StaticLayout$Builder;Landroid/text/Layout$Alignment;)V

    .line 81
    .line 82
    .line 83
    iget-boolean v2, v1, LE0/h;->i:Z

    .line 84
    .line 85
    invoke-static {v0, v2}, LC0/a;->s(Landroid/text/StaticLayout$Builder;Z)V

    .line 86
    .line 87
    .line 88
    iget-boolean v2, v1, LE0/h;->j:Z

    .line 89
    .line 90
    if-eqz v2, :cond_3

    .line 91
    .line 92
    sget-object v2, Landroid/text/TextDirectionHeuristics;->RTL:Landroid/text/TextDirectionHeuristic;

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_3
    sget-object v2, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    .line 96
    .line 97
    :goto_0
    invoke-static {v0, v2}, LC0/a;->q(Landroid/text/StaticLayout$Builder;Landroid/text/TextDirectionHeuristic;)V

    .line 98
    .line 99
    .line 100
    iget-object v2, v1, LE0/h;->k:Landroid/text/TextUtils$TruncateAt;

    .line 101
    .line 102
    if-eqz v2, :cond_4

    .line 103
    .line 104
    invoke-static {v0, v2}, LC0/a;->r(Landroid/text/StaticLayout$Builder;Landroid/text/TextUtils$TruncateAt;)V

    .line 105
    .line 106
    .line 107
    :cond_4
    iget v2, v1, LE0/h;->f:I

    .line 108
    .line 109
    invoke-static {v0, v2}, LC0/a;->o(Landroid/text/StaticLayout$Builder;I)V

    .line 110
    .line 111
    .line 112
    iget v2, v1, LE0/h;->g:F

    .line 113
    .line 114
    cmpl-float v3, v2, v18

    .line 115
    .line 116
    if-eqz v3, :cond_5

    .line 117
    .line 118
    invoke-static {v0, v2}, LC0/a;->n(Landroid/text/StaticLayout$Builder;F)V

    .line 119
    .line 120
    .line 121
    :cond_5
    iget v2, v1, LE0/h;->f:I

    .line 122
    .line 123
    if-le v2, v13, :cond_6

    .line 124
    .line 125
    iget v2, v1, LE0/h;->h:I

    .line 126
    .line 127
    invoke-static {v0, v2}, LC0/a;->y(Landroid/text/StaticLayout$Builder;I)V

    .line 128
    .line 129
    .line 130
    :cond_6
    invoke-static {v0}, LC0/a;->e(Landroid/text/StaticLayout$Builder;)Landroid/text/StaticLayout;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    return-object v0

    .line 135
    :cond_7
    sget-boolean v2, LE0/h;->m:Z

    .line 136
    .line 137
    if-eqz v2, :cond_8

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_8
    :try_start_0
    iget-boolean v2, v1, LE0/h;->j:Z

    .line 141
    .line 142
    if-eqz v2, :cond_9

    .line 143
    .line 144
    if-lt v4, v5, :cond_9

    .line 145
    .line 146
    const/4 v2, 0x1

    .line 147
    goto :goto_1

    .line 148
    :cond_9
    const/4 v2, 0x0

    .line 149
    :goto_1
    if-eqz v2, :cond_a

    .line 150
    .line 151
    sget-object v2, Landroid/text/TextDirectionHeuristics;->RTL:Landroid/text/TextDirectionHeuristic;

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :catch_0
    move-exception v0

    .line 155
    goto/16 :goto_4

    .line 156
    .line 157
    :cond_a
    sget-object v2, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    .line 158
    .line 159
    :goto_2
    sput-object v2, LE0/h;->o:Landroid/text/TextDirectionHeuristic;

    .line 160
    .line 161
    new-array v2, v12, [Ljava/lang/Class;

    .line 162
    .line 163
    const-class v4, Ljava/lang/CharSequence;

    .line 164
    .line 165
    aput-object v4, v2, v14

    .line 166
    .line 167
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 168
    .line 169
    aput-object v4, v2, v13

    .line 170
    .line 171
    aput-object v4, v2, v11

    .line 172
    .line 173
    const-class v5, Landroid/text/TextPaint;

    .line 174
    .line 175
    aput-object v5, v2, v10

    .line 176
    .line 177
    aput-object v4, v2, v9

    .line 178
    .line 179
    const-class v5, Landroid/text/Layout$Alignment;

    .line 180
    .line 181
    aput-object v5, v2, v8

    .line 182
    .line 183
    const-class v5, Landroid/text/TextDirectionHeuristic;

    .line 184
    .line 185
    aput-object v5, v2, v7

    .line 186
    .line 187
    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 188
    .line 189
    aput-object v5, v2, v6

    .line 190
    .line 191
    const/16 v19, 0x8

    .line 192
    .line 193
    aput-object v5, v2, v19

    .line 194
    .line 195
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 196
    .line 197
    const/16 v17, 0x9

    .line 198
    .line 199
    aput-object v5, v2, v17

    .line 200
    .line 201
    const-class v5, Landroid/text/TextUtils$TruncateAt;

    .line 202
    .line 203
    const/16 v16, 0xa

    .line 204
    .line 205
    aput-object v5, v2, v16

    .line 206
    .line 207
    const/16 v5, 0xb

    .line 208
    .line 209
    aput-object v4, v2, v5

    .line 210
    .line 211
    const/16 v5, 0xc

    .line 212
    .line 213
    aput-object v4, v2, v5

    .line 214
    .line 215
    const-class v4, Landroid/text/StaticLayout;

    .line 216
    .line 217
    invoke-virtual {v4, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    sput-object v2, LE0/h;->n:Ljava/lang/reflect/Constructor;

    .line 222
    .line 223
    invoke-virtual {v2, v13}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 224
    .line 225
    .line 226
    sput-boolean v13, LE0/h;->m:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 227
    .line 228
    :goto_3
    :try_start_1
    sget-object v2, LE0/h;->n:Ljava/lang/reflect/Constructor;

    .line 229
    .line 230
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    iget v5, v1, LE0/h;->d:I

    .line 238
    .line 239
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 244
    .line 245
    .line 246
    move-result-object v20

    .line 247
    iget-object v6, v1, LE0/h;->e:Landroid/text/Layout$Alignment;

    .line 248
    .line 249
    sget-object v21, LE0/h;->o:Landroid/text/TextDirectionHeuristic;

    .line 250
    .line 251
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 255
    .line 256
    .line 257
    move-result-object v18

    .line 258
    const/16 v22, 0x0

    .line 259
    .line 260
    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 261
    .line 262
    .line 263
    move-result-object v22

    .line 264
    iget-boolean v7, v1, LE0/h;->i:Z

    .line 265
    .line 266
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 267
    .line 268
    .line 269
    move-result-object v7

    .line 270
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 271
    .line 272
    .line 273
    move-result-object v15

    .line 274
    iget v8, v1, LE0/h;->f:I

    .line 275
    .line 276
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 277
    .line 278
    .line 279
    move-result-object v8

    .line 280
    new-array v12, v12, [Ljava/lang/Object;

    .line 281
    .line 282
    aput-object v0, v12, v14

    .line 283
    .line 284
    aput-object v4, v12, v13

    .line 285
    .line 286
    aput-object v5, v12, v11

    .line 287
    .line 288
    aput-object v3, v12, v10

    .line 289
    .line 290
    aput-object v20, v12, v9

    .line 291
    .line 292
    const/4 v0, 0x5

    .line 293
    aput-object v6, v12, v0

    .line 294
    .line 295
    const/4 v0, 0x6

    .line 296
    aput-object v21, v12, v0

    .line 297
    .line 298
    const/4 v0, 0x7

    .line 299
    aput-object v18, v12, v0

    .line 300
    .line 301
    const/16 v0, 0x8

    .line 302
    .line 303
    aput-object v22, v12, v0

    .line 304
    .line 305
    const/16 v0, 0x9

    .line 306
    .line 307
    aput-object v7, v12, v0

    .line 308
    .line 309
    const/4 v0, 0x0

    .line 310
    const/16 v3, 0xa

    .line 311
    .line 312
    aput-object v0, v12, v3

    .line 313
    .line 314
    const/16 v0, 0xb

    .line 315
    .line 316
    aput-object v15, v12, v0

    .line 317
    .line 318
    const/16 v0, 0xc

    .line 319
    .line 320
    aput-object v8, v12, v0

    .line 321
    .line 322
    invoke-virtual {v2, v12}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    check-cast v0, Landroid/text/StaticLayout;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 327
    .line 328
    return-object v0

    .line 329
    :catch_1
    move-exception v0

    .line 330
    new-instance v2, LE0/g;

    .line 331
    .line 332
    invoke-direct {v2, v0}, LE0/g;-><init>(Ljava/lang/Exception;)V

    .line 333
    .line 334
    .line 335
    throw v2

    .line 336
    :goto_4
    new-instance v2, LE0/g;

    .line 337
    .line 338
    invoke-direct {v2, v0}, LE0/g;-><init>(Ljava/lang/Exception;)V

    .line 339
    .line 340
    .line 341
    throw v2
.end method
