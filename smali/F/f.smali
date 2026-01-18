.class public final LF/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:C

.field public final b:[F


# direct methods
.method public constructor <init>(C[F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-char p1, p0, LF/f;->a:C

    .line 3
    iput-object p2, p0, LF/f;->b:[F

    return-void
.end method

.method public constructor <init>(LF/f;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iget-char v0, p1, LF/f;->a:C

    iput-char v0, p0, LF/f;->a:C

    .line 6
    iget-object p1, p1, LF/f;->b:[F

    array-length v0, p1

    invoke-static {p1, v0}, Lp0/a;->p([FI)[F

    move-result-object p1

    iput-object p1, p0, LF/f;->b:[F

    return-void
.end method

.method public static a(Landroid/graphics/Path;FFFFFFFZZ)V
    .locals 51

    move/from16 v1, p1

    move/from16 v3, p3

    move/from16 v0, p5

    move/from16 v2, p6

    move/from16 v7, p7

    move/from16 v9, p9

    float-to-double v4, v7

    .line 1
    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    .line 2
    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v10

    .line 3
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v12

    float-to-double v14, v1

    mul-double v16, v14, v10

    move/from16 v6, p2

    float-to-double v7, v6

    mul-double v18, v7, v12

    add-double v18, v18, v16

    move-wide/from16 v16, v14

    float-to-double v14, v0

    div-double v18, v18, v14

    neg-float v6, v1

    move-wide/from16 v20, v4

    float-to-double v4, v6

    mul-double v4, v4, v12

    mul-double v22, v7, v10

    add-double v22, v22, v4

    float-to-double v4, v2

    div-double v22, v22, v4

    move-wide/from16 v24, v7

    float-to-double v6, v3

    mul-double v6, v6, v10

    move/from16 v8, p4

    float-to-double v1, v8

    mul-double v26, v1, v12

    add-double v26, v26, v6

    div-double v26, v26, v14

    neg-float v6, v3

    float-to-double v6, v6

    mul-double v6, v6, v12

    mul-double v1, v1, v10

    add-double/2addr v1, v6

    div-double/2addr v1, v4

    sub-double v6, v18, v26

    sub-double v28, v22, v1

    add-double v30, v18, v26

    const-wide/high16 v32, 0x4000000000000000L    # 2.0

    div-double v30, v30, v32

    add-double v34, v22, v1

    div-double v34, v34, v32

    mul-double v36, v6, v6

    mul-double v38, v28, v28

    move-wide/from16 v40, v12

    add-double v12, v38, v36

    .line 4
    const-string v3, "PathParser"

    const-wide/16 v36, 0x0

    cmpl-double v38, v12, v36

    if-nez v38, :cond_0

    .line 5
    const-string v0, " Points are coincident"

    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const-wide/high16 v38, 0x3ff0000000000000L    # 1.0

    div-double v42, v38, v12

    const-wide/high16 v44, 0x3fd0000000000000L    # 0.25

    sub-double v42, v42, v44

    cmpg-double v44, v42, v36

    if-gez v44, :cond_1

    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Points are too far apart "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    invoke-static {v12, v13}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    const-wide v3, 0x3ffffff583a53b8eL    # 1.99999

    div-double/2addr v1, v3

    double-to-float v1, v1

    mul-float v5, v0, v1

    mul-float v6, p6, v1

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    .line 8
    invoke-static/range {v0 .. v9}, LF/f;->a(Landroid/graphics/Path;FFFFFFFZZ)V

    return-void

    .line 9
    :cond_1
    invoke-static/range {v42 .. v43}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v12

    mul-double v6, v6, v12

    mul-double v12, v12, v28

    move/from16 v0, p8

    if-ne v0, v9, :cond_2

    sub-double v30, v30, v12

    add-double v34, v34, v6

    goto :goto_0

    :cond_2
    add-double v30, v30, v12

    sub-double v34, v34, v6

    :goto_0
    sub-double v6, v22, v34

    sub-double v12, v18, v30

    .line 10
    invoke-static {v6, v7, v12, v13}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v6

    sub-double v1, v1, v34

    sub-double v12, v26, v30

    .line 11
    invoke-static {v1, v2, v12, v13}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v0

    sub-double/2addr v0, v6

    const/4 v2, 0x0

    cmpl-double v3, v0, v36

    if-ltz v3, :cond_3

    const/4 v8, 0x1

    goto :goto_1

    :cond_3
    const/4 v8, 0x0

    :goto_1
    if-eq v9, v8, :cond_5

    const-wide v8, 0x401921fb54442d18L    # 6.283185307179586

    if-lez v3, :cond_4

    sub-double/2addr v0, v8

    goto :goto_2

    :cond_4
    add-double/2addr v0, v8

    :cond_5
    :goto_2
    mul-double v30, v30, v14

    mul-double v34, v34, v4

    mul-double v8, v30, v10

    mul-double v12, v34, v40

    sub-double/2addr v8, v12

    mul-double v30, v30, v40

    mul-double v34, v34, v10

    add-double v34, v34, v30

    const-wide/high16 v10, 0x4010000000000000L    # 4.0

    mul-double v12, v0, v10

    const-wide v18, 0x400921fb54442d18L    # Math.PI

    div-double v12, v12, v18

    .line 12
    invoke-static {v12, v13}, Ljava/lang/Math;->abs(D)D

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v12

    double-to-int v3, v12

    .line 13
    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->cos(D)D

    move-result-wide v12

    .line 14
    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->sin(D)D

    move-result-wide v18

    .line 15
    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v20

    .line 16
    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v22

    neg-double v10, v14

    mul-double v26, v10, v12

    mul-double v28, v26, v22

    mul-double v30, v4, v18

    mul-double v36, v30, v20

    sub-double v28, v28, v36

    mul-double v10, v10, v18

    mul-double v22, v22, v10

    mul-double v4, v4, v12

    mul-double v20, v20, v4

    add-double v20, v20, v22

    move-wide/from16 p3, v6

    int-to-double v6, v3

    div-double/2addr v0, v6

    move-wide/from16 v6, p3

    :goto_3
    if-ge v2, v3, :cond_6

    add-double v22, v6, v0

    .line 17
    invoke-static/range {v22 .. v23}, Ljava/lang/Math;->sin(D)D

    move-result-wide v36

    .line 18
    invoke-static/range {v22 .. v23}, Ljava/lang/Math;->cos(D)D

    move-result-wide v40

    mul-double v42, v14, v12

    mul-double v42, v42, v40

    add-double v42, v42, v8

    mul-double v44, v30, v36

    move-wide/from16 p3, v0

    sub-double v0, v42, v44

    mul-double v42, v14, v18

    mul-double v42, v42, v40

    add-double v42, v42, v34

    mul-double v44, v4, v36

    move-wide/from16 p5, v8

    add-double v8, v44, v42

    mul-double v42, v26, v36

    mul-double v44, v30, v40

    sub-double v42, v42, v44

    mul-double v36, v36, v10

    mul-double v40, v40, v4

    add-double v36, v40, v36

    sub-double v6, v22, v6

    div-double v40, v6, v32

    .line 19
    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->tan(D)D

    move-result-wide v40

    .line 20
    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    const-wide/high16 v44, 0x4008000000000000L    # 3.0

    mul-double v46, v40, v44

    mul-double v46, v46, v40

    const-wide/high16 v40, 0x4010000000000000L    # 4.0

    add-double v46, v46, v40

    invoke-static/range {v46 .. v47}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v46

    sub-double v46, v46, v38

    mul-double v46, v46, v6

    div-double v46, v46, v44

    mul-double v28, v28, v46

    add-double v6, v28, v16

    mul-double v20, v20, v46

    move/from16 v16, v3

    move-wide/from16 p1, v4

    add-double v3, v20, v24

    mul-double v20, v46, v42

    move-wide/from16 p7, v10

    sub-double v10, v0, v20

    mul-double v46, v46, v36

    move-wide/from16 v20, v12

    sub-double v12, v8, v46

    const/4 v5, 0x0

    move-wide/from16 v24, v14

    move-object/from16 v14, p0

    .line 21
    invoke-virtual {v14, v5, v5}, Landroid/graphics/Path;->rLineTo(FF)V

    double-to-float v5, v6

    double-to-float v3, v3

    double-to-float v4, v10

    double-to-float v6, v12

    double-to-float v7, v0

    double-to-float v10, v8

    move-object/from16 v44, p0

    move/from16 v45, v5

    move/from16 v46, v3

    move/from16 v47, v4

    move/from16 v48, v6

    move/from16 v49, v7

    move/from16 v50, v10

    .line 22
    invoke-virtual/range {v44 .. v50}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    add-int/lit8 v2, v2, 0x1

    move-wide/from16 v4, p1

    move-wide/from16 v10, p7

    move/from16 v3, v16

    move-wide/from16 v12, v20

    move-wide/from16 v6, v22

    move-wide/from16 v14, v24

    move-wide/from16 v20, v36

    move-wide/from16 v28, v42

    move-wide/from16 v16, v0

    move-wide/from16 v24, v8

    move-wide/from16 v0, p3

    move-wide/from16 v8, p5

    goto/16 :goto_3

    :cond_6
    return-void
.end method

.method public static b([LF/f;Landroid/graphics/Path;)V
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v11, p1

    .line 4
    .line 5
    const/4 v12, 0x6

    .line 6
    new-array v13, v12, [F

    .line 7
    .line 8
    array-length v14, v0

    .line 9
    const/16 v16, 0x0

    .line 10
    .line 11
    const/16 v1, 0x6d

    .line 12
    .line 13
    const/4 v10, 0x0

    .line 14
    :goto_0
    if-ge v10, v14, :cond_21

    .line 15
    .line 16
    aget-object v9, v0, v10

    .line 17
    .line 18
    iget-char v8, v9, LF/f;->a:C

    .line 19
    .line 20
    aget v2, v13, v16

    .line 21
    .line 22
    const/16 v17, 0x1

    .line 23
    .line 24
    aget v3, v13, v17

    .line 25
    .line 26
    const/16 v18, 0x2

    .line 27
    .line 28
    aget v4, v13, v18

    .line 29
    .line 30
    const/16 v19, 0x3

    .line 31
    .line 32
    aget v5, v13, v19

    .line 33
    .line 34
    const/16 v20, 0x4

    .line 35
    .line 36
    aget v6, v13, v20

    .line 37
    .line 38
    const/16 v21, 0x5

    .line 39
    .line 40
    aget v7, v13, v21

    .line 41
    .line 42
    sparse-switch v8, :sswitch_data_0

    .line 43
    .line 44
    .line 45
    :goto_1
    const/16 v22, 0x2

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :sswitch_0
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Path;->close()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v11, v6, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 52
    .line 53
    .line 54
    move v2, v6

    .line 55
    move v4, v2

    .line 56
    move v3, v7

    .line 57
    move v5, v3

    .line 58
    goto :goto_1

    .line 59
    :sswitch_1
    const/16 v22, 0x4

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :sswitch_2
    const/16 v22, 0x1

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :sswitch_3
    const/16 v22, 0x6

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :sswitch_4
    const/16 v22, 0x7

    .line 69
    .line 70
    :goto_2
    move/from16 v23, v6

    .line 71
    .line 72
    move/from16 v24, v7

    .line 73
    .line 74
    move v7, v2

    .line 75
    move v6, v3

    .line 76
    const/4 v3, 0x0

    .line 77
    :goto_3
    iget-object v2, v9, LF/f;->b:[F

    .line 78
    .line 79
    array-length v12, v2

    .line 80
    if-ge v3, v12, :cond_20

    .line 81
    .line 82
    const/16 v12, 0x41

    .line 83
    .line 84
    if-eq v8, v12, :cond_1d

    .line 85
    .line 86
    const/16 v12, 0x43

    .line 87
    .line 88
    if-eq v8, v12, :cond_1c

    .line 89
    .line 90
    const/16 v15, 0x48

    .line 91
    .line 92
    if-eq v8, v15, :cond_1b

    .line 93
    .line 94
    const/16 v15, 0x51

    .line 95
    .line 96
    if-eq v8, v15, :cond_1a

    .line 97
    .line 98
    const/16 v12, 0x56

    .line 99
    .line 100
    if-eq v8, v12, :cond_19

    .line 101
    .line 102
    const/16 v12, 0x61

    .line 103
    .line 104
    if-eq v8, v12, :cond_16

    .line 105
    .line 106
    const/16 v12, 0x63

    .line 107
    .line 108
    if-eq v8, v12, :cond_15

    .line 109
    .line 110
    const/16 v12, 0x68

    .line 111
    .line 112
    if-eq v8, v12, :cond_14

    .line 113
    .line 114
    const/16 v12, 0x71

    .line 115
    .line 116
    if-eq v8, v12, :cond_13

    .line 117
    .line 118
    const/16 v15, 0x76

    .line 119
    .line 120
    if-eq v8, v15, :cond_12

    .line 121
    .line 122
    const/16 v15, 0x4c

    .line 123
    .line 124
    if-eq v8, v15, :cond_11

    .line 125
    .line 126
    const/16 v15, 0x4d

    .line 127
    .line 128
    if-eq v8, v15, :cond_f

    .line 129
    .line 130
    const/16 v15, 0x73

    .line 131
    .line 132
    const/16 v12, 0x53

    .line 133
    .line 134
    const/high16 v30, 0x40000000    # 2.0f

    .line 135
    .line 136
    if-eq v8, v12, :cond_c

    .line 137
    .line 138
    const/16 v12, 0x54

    .line 139
    .line 140
    if-eq v8, v12, :cond_9

    .line 141
    .line 142
    const/16 v12, 0x6c

    .line 143
    .line 144
    if-eq v8, v12, :cond_8

    .line 145
    .line 146
    const/16 v12, 0x6d

    .line 147
    .line 148
    if-eq v8, v12, :cond_6

    .line 149
    .line 150
    if-eq v8, v15, :cond_3

    .line 151
    .line 152
    const/16 v12, 0x74

    .line 153
    .line 154
    if-eq v8, v12, :cond_0

    .line 155
    .line 156
    move/from16 v32, v3

    .line 157
    .line 158
    :goto_4
    move/from16 v29, v8

    .line 159
    .line 160
    move/from16 v30, v10

    .line 161
    .line 162
    move/from16 v27, v14

    .line 163
    .line 164
    :goto_5
    move-object v14, v9

    .line 165
    goto/16 :goto_16

    .line 166
    .line 167
    :cond_0
    const/16 v15, 0x71

    .line 168
    .line 169
    if-eq v1, v15, :cond_2

    .line 170
    .line 171
    if-eq v1, v12, :cond_2

    .line 172
    .line 173
    const/16 v12, 0x51

    .line 174
    .line 175
    if-eq v1, v12, :cond_2

    .line 176
    .line 177
    const/16 v12, 0x54

    .line 178
    .line 179
    if-ne v1, v12, :cond_1

    .line 180
    .line 181
    goto :goto_6

    .line 182
    :cond_1
    const/4 v1, 0x0

    .line 183
    const/4 v15, 0x0

    .line 184
    goto :goto_7

    .line 185
    :cond_2
    :goto_6
    sub-float v15, v7, v4

    .line 186
    .line 187
    sub-float v1, v6, v5

    .line 188
    .line 189
    :goto_7
    aget v4, v2, v3

    .line 190
    .line 191
    add-int/lit8 v5, v3, 0x1

    .line 192
    .line 193
    aget v12, v2, v5

    .line 194
    .line 195
    invoke-virtual {v11, v15, v1, v4, v12}, Landroid/graphics/Path;->rQuadTo(FFFF)V

    .line 196
    .line 197
    .line 198
    add-float/2addr v15, v7

    .line 199
    add-float/2addr v1, v6

    .line 200
    aget v4, v2, v3

    .line 201
    .line 202
    add-float/2addr v7, v4

    .line 203
    aget v2, v2, v5

    .line 204
    .line 205
    add-float/2addr v6, v2

    .line 206
    move v5, v1

    .line 207
    move/from16 v32, v3

    .line 208
    .line 209
    move/from16 v29, v8

    .line 210
    .line 211
    move/from16 v30, v10

    .line 212
    .line 213
    move/from16 v27, v14

    .line 214
    .line 215
    move v4, v15

    .line 216
    goto :goto_5

    .line 217
    :cond_3
    const/16 v12, 0x63

    .line 218
    .line 219
    if-eq v1, v12, :cond_5

    .line 220
    .line 221
    if-eq v1, v15, :cond_5

    .line 222
    .line 223
    const/16 v12, 0x43

    .line 224
    .line 225
    if-eq v1, v12, :cond_5

    .line 226
    .line 227
    const/16 v12, 0x53

    .line 228
    .line 229
    if-ne v1, v12, :cond_4

    .line 230
    .line 231
    goto :goto_8

    .line 232
    :cond_4
    const/4 v4, 0x0

    .line 233
    const/16 v25, 0x0

    .line 234
    .line 235
    goto :goto_9

    .line 236
    :cond_5
    :goto_8
    sub-float v1, v7, v4

    .line 237
    .line 238
    sub-float v4, v6, v5

    .line 239
    .line 240
    move/from16 v25, v1

    .line 241
    .line 242
    :goto_9
    aget v5, v2, v3

    .line 243
    .line 244
    add-int/lit8 v12, v3, 0x1

    .line 245
    .line 246
    aget v15, v2, v12

    .line 247
    .line 248
    add-int/lit8 v26, v3, 0x2

    .line 249
    .line 250
    aget v27, v2, v26

    .line 251
    .line 252
    add-int/lit8 v28, v3, 0x3

    .line 253
    .line 254
    aget v29, v2, v28

    .line 255
    .line 256
    move-object/from16 v1, p1

    .line 257
    .line 258
    move-object/from16 v31, v2

    .line 259
    .line 260
    move/from16 v2, v25

    .line 261
    .line 262
    move/from16 v32, v3

    .line 263
    .line 264
    move v3, v4

    .line 265
    move v4, v5

    .line 266
    move v5, v15

    .line 267
    move v15, v6

    .line 268
    move/from16 v6, v27

    .line 269
    .line 270
    move v0, v7

    .line 271
    move/from16 v7, v29

    .line 272
    .line 273
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    .line 274
    .line 275
    .line 276
    aget v1, v31, v32

    .line 277
    .line 278
    add-float v7, v0, v1

    .line 279
    .line 280
    aget v1, v31, v12

    .line 281
    .line 282
    add-float v6, v15, v1

    .line 283
    .line 284
    aget v1, v31, v26

    .line 285
    .line 286
    add-float/2addr v0, v1

    .line 287
    aget v1, v31, v28

    .line 288
    .line 289
    add-float/2addr v1, v15

    .line 290
    :goto_a
    move v5, v6

    .line 291
    move v4, v7

    .line 292
    move/from16 v29, v8

    .line 293
    .line 294
    move/from16 v30, v10

    .line 295
    .line 296
    move/from16 v27, v14

    .line 297
    .line 298
    move v7, v0

    .line 299
    move v6, v1

    .line 300
    goto/16 :goto_5

    .line 301
    .line 302
    :cond_6
    move-object/from16 v31, v2

    .line 303
    .line 304
    move/from16 v32, v3

    .line 305
    .line 306
    move v15, v6

    .line 307
    move v0, v7

    .line 308
    aget v1, v31, v32

    .line 309
    .line 310
    add-float v7, v0, v1

    .line 311
    .line 312
    add-int/lit8 v3, v32, 0x1

    .line 313
    .line 314
    aget v0, v31, v3

    .line 315
    .line 316
    add-float v6, v15, v0

    .line 317
    .line 318
    if-lez v32, :cond_7

    .line 319
    .line 320
    invoke-virtual {v11, v1, v0}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 321
    .line 322
    .line 323
    goto/16 :goto_4

    .line 324
    .line 325
    :cond_7
    invoke-virtual {v11, v1, v0}, Landroid/graphics/Path;->rMoveTo(FF)V

    .line 326
    .line 327
    .line 328
    :goto_b
    move/from16 v24, v6

    .line 329
    .line 330
    move/from16 v23, v7

    .line 331
    .line 332
    goto/16 :goto_4

    .line 333
    .line 334
    :cond_8
    move-object/from16 v31, v2

    .line 335
    .line 336
    move/from16 v32, v3

    .line 337
    .line 338
    move v15, v6

    .line 339
    move v0, v7

    .line 340
    aget v1, v31, v32

    .line 341
    .line 342
    add-int/lit8 v3, v32, 0x1

    .line 343
    .line 344
    aget v2, v31, v3

    .line 345
    .line 346
    invoke-virtual {v11, v1, v2}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 347
    .line 348
    .line 349
    aget v1, v31, v32

    .line 350
    .line 351
    add-float v7, v0, v1

    .line 352
    .line 353
    aget v0, v31, v3

    .line 354
    .line 355
    add-float v6, v15, v0

    .line 356
    .line 357
    goto/16 :goto_4

    .line 358
    .line 359
    :cond_9
    move-object/from16 v31, v2

    .line 360
    .line 361
    move/from16 v32, v3

    .line 362
    .line 363
    move v15, v6

    .line 364
    move v0, v7

    .line 365
    const/16 v2, 0x71

    .line 366
    .line 367
    if-eq v1, v2, :cond_b

    .line 368
    .line 369
    const/16 v2, 0x74

    .line 370
    .line 371
    if-eq v1, v2, :cond_b

    .line 372
    .line 373
    const/16 v2, 0x51

    .line 374
    .line 375
    if-eq v1, v2, :cond_b

    .line 376
    .line 377
    const/16 v2, 0x54

    .line 378
    .line 379
    if-ne v1, v2, :cond_a

    .line 380
    .line 381
    goto :goto_c

    .line 382
    :cond_a
    move v7, v0

    .line 383
    move v6, v15

    .line 384
    goto :goto_d

    .line 385
    :cond_b
    :goto_c
    mul-float v7, v0, v30

    .line 386
    .line 387
    sub-float/2addr v7, v4

    .line 388
    mul-float v6, v15, v30

    .line 389
    .line 390
    sub-float/2addr v6, v5

    .line 391
    :goto_d
    aget v0, v31, v32

    .line 392
    .line 393
    add-int/lit8 v3, v32, 0x1

    .line 394
    .line 395
    aget v1, v31, v3

    .line 396
    .line 397
    invoke-virtual {v11, v7, v6, v0, v1}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 398
    .line 399
    .line 400
    aget v0, v31, v32

    .line 401
    .line 402
    aget v1, v31, v3

    .line 403
    .line 404
    goto :goto_a

    .line 405
    :cond_c
    move-object/from16 v31, v2

    .line 406
    .line 407
    move/from16 v32, v3

    .line 408
    .line 409
    move v12, v6

    .line 410
    move v0, v7

    .line 411
    const/16 v2, 0x63

    .line 412
    .line 413
    if-eq v1, v2, :cond_e

    .line 414
    .line 415
    if-eq v1, v15, :cond_e

    .line 416
    .line 417
    const/16 v2, 0x43

    .line 418
    .line 419
    if-eq v1, v2, :cond_e

    .line 420
    .line 421
    const/16 v2, 0x53

    .line 422
    .line 423
    if-ne v1, v2, :cond_d

    .line 424
    .line 425
    goto :goto_e

    .line 426
    :cond_d
    move v2, v0

    .line 427
    move v3, v12

    .line 428
    goto :goto_f

    .line 429
    :cond_e
    :goto_e
    mul-float v7, v0, v30

    .line 430
    .line 431
    sub-float/2addr v7, v4

    .line 432
    mul-float v6, v12, v30

    .line 433
    .line 434
    sub-float/2addr v6, v5

    .line 435
    move v3, v6

    .line 436
    move v2, v7

    .line 437
    :goto_f
    aget v4, v31, v32

    .line 438
    .line 439
    add-int/lit8 v0, v32, 0x1

    .line 440
    .line 441
    aget v5, v31, v0

    .line 442
    .line 443
    add-int/lit8 v12, v32, 0x2

    .line 444
    .line 445
    aget v6, v31, v12

    .line 446
    .line 447
    add-int/lit8 v15, v32, 0x3

    .line 448
    .line 449
    aget v7, v31, v15

    .line 450
    .line 451
    move-object/from16 v1, p1

    .line 452
    .line 453
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 454
    .line 455
    .line 456
    aget v1, v31, v32

    .line 457
    .line 458
    aget v0, v31, v0

    .line 459
    .line 460
    aget v7, v31, v12

    .line 461
    .line 462
    aget v6, v31, v15

    .line 463
    .line 464
    move v5, v0

    .line 465
    move v4, v1

    .line 466
    goto/16 :goto_4

    .line 467
    .line 468
    :cond_f
    move-object/from16 v31, v2

    .line 469
    .line 470
    move/from16 v32, v3

    .line 471
    .line 472
    aget v7, v31, v32

    .line 473
    .line 474
    add-int/lit8 v3, v32, 0x1

    .line 475
    .line 476
    aget v6, v31, v3

    .line 477
    .line 478
    if-lez v32, :cond_10

    .line 479
    .line 480
    invoke-virtual {v11, v7, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 481
    .line 482
    .line 483
    goto/16 :goto_4

    .line 484
    .line 485
    :cond_10
    invoke-virtual {v11, v7, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 486
    .line 487
    .line 488
    goto/16 :goto_b

    .line 489
    .line 490
    :cond_11
    move-object/from16 v31, v2

    .line 491
    .line 492
    move/from16 v32, v3

    .line 493
    .line 494
    aget v0, v31, v32

    .line 495
    .line 496
    add-int/lit8 v3, v32, 0x1

    .line 497
    .line 498
    aget v1, v31, v3

    .line 499
    .line 500
    invoke-virtual {v11, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 501
    .line 502
    .line 503
    aget v7, v31, v32

    .line 504
    .line 505
    aget v6, v31, v3

    .line 506
    .line 507
    goto/16 :goto_4

    .line 508
    .line 509
    :cond_12
    move-object/from16 v31, v2

    .line 510
    .line 511
    move/from16 v32, v3

    .line 512
    .line 513
    move v12, v6

    .line 514
    move v0, v7

    .line 515
    aget v1, v31, v32

    .line 516
    .line 517
    const/4 v2, 0x0

    .line 518
    invoke-virtual {v11, v2, v1}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 519
    .line 520
    .line 521
    aget v1, v31, v32

    .line 522
    .line 523
    add-float v6, v12, v1

    .line 524
    .line 525
    goto/16 :goto_4

    .line 526
    .line 527
    :cond_13
    move-object/from16 v31, v2

    .line 528
    .line 529
    move/from16 v32, v3

    .line 530
    .line 531
    move v12, v6

    .line 532
    move v0, v7

    .line 533
    aget v1, v31, v32

    .line 534
    .line 535
    add-int/lit8 v3, v32, 0x1

    .line 536
    .line 537
    aget v2, v31, v3

    .line 538
    .line 539
    add-int/lit8 v4, v32, 0x2

    .line 540
    .line 541
    aget v5, v31, v4

    .line 542
    .line 543
    add-int/lit8 v6, v32, 0x3

    .line 544
    .line 545
    aget v7, v31, v6

    .line 546
    .line 547
    invoke-virtual {v11, v1, v2, v5, v7}, Landroid/graphics/Path;->rQuadTo(FFFF)V

    .line 548
    .line 549
    .line 550
    aget v1, v31, v32

    .line 551
    .line 552
    add-float v7, v0, v1

    .line 553
    .line 554
    aget v1, v31, v3

    .line 555
    .line 556
    add-float/2addr v1, v12

    .line 557
    aget v2, v31, v4

    .line 558
    .line 559
    add-float/2addr v0, v2

    .line 560
    aget v2, v31, v6

    .line 561
    .line 562
    add-float v6, v12, v2

    .line 563
    .line 564
    move v5, v1

    .line 565
    move v4, v7

    .line 566
    move/from16 v29, v8

    .line 567
    .line 568
    move/from16 v30, v10

    .line 569
    .line 570
    move/from16 v27, v14

    .line 571
    .line 572
    move v7, v0

    .line 573
    goto/16 :goto_5

    .line 574
    .line 575
    :cond_14
    move-object/from16 v31, v2

    .line 576
    .line 577
    move/from16 v32, v3

    .line 578
    .line 579
    move v12, v6

    .line 580
    move v0, v7

    .line 581
    aget v1, v31, v32

    .line 582
    .line 583
    const/4 v2, 0x0

    .line 584
    invoke-virtual {v11, v1, v2}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 585
    .line 586
    .line 587
    aget v1, v31, v32

    .line 588
    .line 589
    add-float v7, v0, v1

    .line 590
    .line 591
    goto/16 :goto_4

    .line 592
    .line 593
    :cond_15
    move-object/from16 v31, v2

    .line 594
    .line 595
    move/from16 v32, v3

    .line 596
    .line 597
    move v12, v6

    .line 598
    move v0, v7

    .line 599
    aget v2, v31, v32

    .line 600
    .line 601
    add-int/lit8 v3, v32, 0x1

    .line 602
    .line 603
    aget v3, v31, v3

    .line 604
    .line 605
    add-int/lit8 v15, v32, 0x2

    .line 606
    .line 607
    aget v4, v31, v15

    .line 608
    .line 609
    add-int/lit8 v25, v32, 0x3

    .line 610
    .line 611
    aget v5, v31, v25

    .line 612
    .line 613
    add-int/lit8 v26, v32, 0x4

    .line 614
    .line 615
    aget v6, v31, v26

    .line 616
    .line 617
    add-int/lit8 v27, v32, 0x5

    .line 618
    .line 619
    aget v7, v31, v27

    .line 620
    .line 621
    move-object/from16 v1, p1

    .line 622
    .line 623
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    .line 624
    .line 625
    .line 626
    aget v1, v31, v15

    .line 627
    .line 628
    add-float v7, v0, v1

    .line 629
    .line 630
    aget v1, v31, v25

    .line 631
    .line 632
    add-float v6, v12, v1

    .line 633
    .line 634
    aget v1, v31, v26

    .line 635
    .line 636
    add-float/2addr v0, v1

    .line 637
    aget v1, v31, v27

    .line 638
    .line 639
    add-float/2addr v1, v12

    .line 640
    goto/16 :goto_a

    .line 641
    .line 642
    :cond_16
    move-object/from16 v31, v2

    .line 643
    .line 644
    move/from16 v32, v3

    .line 645
    .line 646
    move v12, v6

    .line 647
    move v0, v7

    .line 648
    add-int/lit8 v15, v32, 0x5

    .line 649
    .line 650
    aget v1, v31, v15

    .line 651
    .line 652
    add-float v4, v1, v0

    .line 653
    .line 654
    add-int/lit8 v26, v32, 0x6

    .line 655
    .line 656
    aget v1, v31, v26

    .line 657
    .line 658
    add-float v5, v1, v12

    .line 659
    .line 660
    aget v6, v31, v32

    .line 661
    .line 662
    add-int/lit8 v3, v32, 0x1

    .line 663
    .line 664
    aget v7, v31, v3

    .line 665
    .line 666
    add-int/lit8 v3, v32, 0x2

    .line 667
    .line 668
    aget v27, v31, v3

    .line 669
    .line 670
    add-int/lit8 v3, v32, 0x3

    .line 671
    .line 672
    aget v1, v31, v3

    .line 673
    .line 674
    const/4 v2, 0x0

    .line 675
    cmpl-float v1, v1, v2

    .line 676
    .line 677
    if-eqz v1, :cond_17

    .line 678
    .line 679
    const/16 v25, 0x1

    .line 680
    .line 681
    goto :goto_10

    .line 682
    :cond_17
    const/16 v25, 0x0

    .line 683
    .line 684
    :goto_10
    add-int/lit8 v3, v32, 0x4

    .line 685
    .line 686
    aget v1, v31, v3

    .line 687
    .line 688
    cmpl-float v1, v1, v2

    .line 689
    .line 690
    if-eqz v1, :cond_18

    .line 691
    .line 692
    const/16 v28, 0x1

    .line 693
    .line 694
    goto :goto_11

    .line 695
    :cond_18
    const/16 v28, 0x0

    .line 696
    .line 697
    :goto_11
    move-object/from16 v1, p1

    .line 698
    .line 699
    move v2, v0

    .line 700
    move v3, v12

    .line 701
    move/from16 v29, v8

    .line 702
    .line 703
    move/from16 v8, v27

    .line 704
    .line 705
    move/from16 v27, v14

    .line 706
    .line 707
    move-object v14, v9

    .line 708
    move/from16 v9, v25

    .line 709
    .line 710
    move/from16 v30, v10

    .line 711
    .line 712
    move/from16 v10, v28

    .line 713
    .line 714
    invoke-static/range {v1 .. v10}, LF/f;->a(Landroid/graphics/Path;FFFFFFFZZ)V

    .line 715
    .line 716
    .line 717
    aget v1, v31, v15

    .line 718
    .line 719
    add-float v7, v0, v1

    .line 720
    .line 721
    aget v0, v31, v26

    .line 722
    .line 723
    add-float v6, v12, v0

    .line 724
    .line 725
    :goto_12
    move v5, v6

    .line 726
    move v4, v7

    .line 727
    goto/16 :goto_16

    .line 728
    .line 729
    :cond_19
    move-object/from16 v31, v2

    .line 730
    .line 731
    move/from16 v32, v3

    .line 732
    .line 733
    move v0, v7

    .line 734
    move/from16 v29, v8

    .line 735
    .line 736
    move/from16 v30, v10

    .line 737
    .line 738
    move/from16 v27, v14

    .line 739
    .line 740
    move-object v14, v9

    .line 741
    aget v1, v31, v32

    .line 742
    .line 743
    invoke-virtual {v11, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 744
    .line 745
    .line 746
    aget v6, v31, v32

    .line 747
    .line 748
    goto/16 :goto_16

    .line 749
    .line 750
    :cond_1a
    move-object/from16 v31, v2

    .line 751
    .line 752
    move/from16 v32, v3

    .line 753
    .line 754
    move/from16 v29, v8

    .line 755
    .line 756
    move/from16 v30, v10

    .line 757
    .line 758
    move/from16 v27, v14

    .line 759
    .line 760
    move-object v14, v9

    .line 761
    aget v0, v31, v32

    .line 762
    .line 763
    add-int/lit8 v3, v32, 0x1

    .line 764
    .line 765
    aget v1, v31, v3

    .line 766
    .line 767
    add-int/lit8 v2, v32, 0x2

    .line 768
    .line 769
    aget v4, v31, v2

    .line 770
    .line 771
    add-int/lit8 v5, v32, 0x3

    .line 772
    .line 773
    aget v6, v31, v5

    .line 774
    .line 775
    invoke-virtual {v11, v0, v1, v4, v6}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 776
    .line 777
    .line 778
    aget v0, v31, v32

    .line 779
    .line 780
    aget v1, v31, v3

    .line 781
    .line 782
    aget v7, v31, v2

    .line 783
    .line 784
    aget v6, v31, v5

    .line 785
    .line 786
    :goto_13
    move v4, v0

    .line 787
    move v5, v1

    .line 788
    goto/16 :goto_16

    .line 789
    .line 790
    :cond_1b
    move-object/from16 v31, v2

    .line 791
    .line 792
    move/from16 v32, v3

    .line 793
    .line 794
    move v12, v6

    .line 795
    move/from16 v29, v8

    .line 796
    .line 797
    move/from16 v30, v10

    .line 798
    .line 799
    move/from16 v27, v14

    .line 800
    .line 801
    move-object v14, v9

    .line 802
    aget v0, v31, v32

    .line 803
    .line 804
    invoke-virtual {v11, v0, v12}, Landroid/graphics/Path;->lineTo(FF)V

    .line 805
    .line 806
    .line 807
    aget v7, v31, v32

    .line 808
    .line 809
    goto/16 :goto_16

    .line 810
    .line 811
    :cond_1c
    move-object/from16 v31, v2

    .line 812
    .line 813
    move/from16 v32, v3

    .line 814
    .line 815
    move/from16 v29, v8

    .line 816
    .line 817
    move/from16 v30, v10

    .line 818
    .line 819
    move/from16 v27, v14

    .line 820
    .line 821
    move-object v14, v9

    .line 822
    aget v2, v31, v32

    .line 823
    .line 824
    add-int/lit8 v3, v32, 0x1

    .line 825
    .line 826
    aget v3, v31, v3

    .line 827
    .line 828
    add-int/lit8 v0, v32, 0x2

    .line 829
    .line 830
    aget v4, v31, v0

    .line 831
    .line 832
    add-int/lit8 v8, v32, 0x3

    .line 833
    .line 834
    aget v5, v31, v8

    .line 835
    .line 836
    add-int/lit8 v9, v32, 0x4

    .line 837
    .line 838
    aget v6, v31, v9

    .line 839
    .line 840
    add-int/lit8 v10, v32, 0x5

    .line 841
    .line 842
    aget v7, v31, v10

    .line 843
    .line 844
    move-object/from16 v1, p1

    .line 845
    .line 846
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 847
    .line 848
    .line 849
    aget v7, v31, v9

    .line 850
    .line 851
    aget v6, v31, v10

    .line 852
    .line 853
    aget v0, v31, v0

    .line 854
    .line 855
    aget v1, v31, v8

    .line 856
    .line 857
    goto :goto_13

    .line 858
    :cond_1d
    move-object/from16 v31, v2

    .line 859
    .line 860
    move/from16 v32, v3

    .line 861
    .line 862
    move v12, v6

    .line 863
    move v0, v7

    .line 864
    move/from16 v29, v8

    .line 865
    .line 866
    move/from16 v30, v10

    .line 867
    .line 868
    move/from16 v27, v14

    .line 869
    .line 870
    move-object v14, v9

    .line 871
    add-int/lit8 v15, v32, 0x5

    .line 872
    .line 873
    aget v4, v31, v15

    .line 874
    .line 875
    add-int/lit8 v26, v32, 0x6

    .line 876
    .line 877
    aget v5, v31, v26

    .line 878
    .line 879
    aget v6, v31, v32

    .line 880
    .line 881
    add-int/lit8 v3, v32, 0x1

    .line 882
    .line 883
    aget v7, v31, v3

    .line 884
    .line 885
    add-int/lit8 v3, v32, 0x2

    .line 886
    .line 887
    aget v8, v31, v3

    .line 888
    .line 889
    add-int/lit8 v3, v32, 0x3

    .line 890
    .line 891
    aget v1, v31, v3

    .line 892
    .line 893
    const/4 v2, 0x0

    .line 894
    cmpl-float v1, v1, v2

    .line 895
    .line 896
    if-eqz v1, :cond_1e

    .line 897
    .line 898
    const/4 v9, 0x1

    .line 899
    goto :goto_14

    .line 900
    :cond_1e
    const/4 v9, 0x0

    .line 901
    :goto_14
    add-int/lit8 v3, v32, 0x4

    .line 902
    .line 903
    aget v1, v31, v3

    .line 904
    .line 905
    cmpl-float v1, v1, v2

    .line 906
    .line 907
    if-eqz v1, :cond_1f

    .line 908
    .line 909
    const/4 v10, 0x1

    .line 910
    goto :goto_15

    .line 911
    :cond_1f
    const/4 v10, 0x0

    .line 912
    :goto_15
    move-object/from16 v1, p1

    .line 913
    .line 914
    move v2, v0

    .line 915
    move v3, v12

    .line 916
    invoke-static/range {v1 .. v10}, LF/f;->a(Landroid/graphics/Path;FFFFFFFZZ)V

    .line 917
    .line 918
    .line 919
    aget v7, v31, v15

    .line 920
    .line 921
    aget v6, v31, v26

    .line 922
    .line 923
    goto/16 :goto_12

    .line 924
    .line 925
    :goto_16
    add-int v3, v32, v22

    .line 926
    .line 927
    move-object/from16 v0, p0

    .line 928
    .line 929
    move-object v9, v14

    .line 930
    move/from16 v14, v27

    .line 931
    .line 932
    move/from16 v1, v29

    .line 933
    .line 934
    move v8, v1

    .line 935
    move/from16 v10, v30

    .line 936
    .line 937
    const/4 v12, 0x6

    .line 938
    goto/16 :goto_3

    .line 939
    .line 940
    :cond_20
    move v12, v6

    .line 941
    move v0, v7

    .line 942
    move/from16 v30, v10

    .line 943
    .line 944
    move/from16 v27, v14

    .line 945
    .line 946
    move-object v14, v9

    .line 947
    aput v0, v13, v16

    .line 948
    .line 949
    aput v12, v13, v17

    .line 950
    .line 951
    aput v4, v13, v18

    .line 952
    .line 953
    aput v5, v13, v19

    .line 954
    .line 955
    aput v23, v13, v20

    .line 956
    .line 957
    aput v24, v13, v21

    .line 958
    .line 959
    iget-char v1, v14, LF/f;->a:C

    .line 960
    .line 961
    add-int/lit8 v10, v30, 0x1

    .line 962
    .line 963
    move-object/from16 v0, p0

    .line 964
    .line 965
    move/from16 v14, v27

    .line 966
    .line 967
    const/4 v12, 0x6

    .line 968
    goto/16 :goto_0

    .line 969
    .line 970
    :cond_21
    return-void

    .line 971
    :sswitch_data_0
    .sparse-switch
        0x41 -> :sswitch_4
        0x43 -> :sswitch_3
        0x48 -> :sswitch_2
        0x51 -> :sswitch_1
        0x53 -> :sswitch_1
        0x56 -> :sswitch_2
        0x5a -> :sswitch_0
        0x61 -> :sswitch_4
        0x63 -> :sswitch_3
        0x68 -> :sswitch_2
        0x71 -> :sswitch_1
        0x73 -> :sswitch_1
        0x76 -> :sswitch_2
        0x7a -> :sswitch_0
    .end sparse-switch
.end method
