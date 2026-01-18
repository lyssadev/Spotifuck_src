.class public final Lo/Z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/TextView;

.field public b:Lg1/o;

.field public c:Lg1/o;

.field public d:Lg1/o;

.field public e:Lg1/o;

.field public f:Lg1/o;

.field public g:Lg1/o;

.field public h:Lg1/o;

.field public final i:Lo/i0;

.field public j:I

.field public k:I

.field public l:Landroid/graphics/Typeface;

.field public m:Z


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lo/Z;->j:I

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lo/Z;->k:I

    .line 9
    .line 10
    iput-object p1, p0, Lo/Z;->a:Landroid/widget/TextView;

    .line 11
    .line 12
    new-instance v0, Lo/i0;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Lo/i0;-><init>(Landroid/widget/TextView;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lo/Z;->i:Lo/i0;

    .line 18
    .line 19
    return-void
.end method

.method public static c(Landroid/content/Context;Lo/s;I)Lg1/o;
    .locals 1

    .line 1
    monitor-enter p1

    .line 2
    :try_start_0
    iget-object v0, p1, Lo/s;->a:Lo/P0;

    .line 3
    .line 4
    invoke-virtual {v0, p0, p2}, Lo/P0;->i(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 5
    .line 6
    .line 7
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit p1

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    new-instance p1, Lg1/o;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 p2, 0x1

    .line 17
    iput-boolean p2, p1, Lg1/o;->b:Z

    .line 18
    .line 19
    iput-object p0, p1, Lg1/o;->c:Ljava/lang/Object;

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw p0
.end method

.method public static h(Landroid/view/inputmethod/EditorInfo;Landroid/view/inputmethod/InputConnection;Landroid/widget/TextView;)V
    .locals 11

    .line 1
    const/16 v0, 0x800

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v4, 0x1e

    .line 8
    .line 9
    if-ge v3, v4, :cond_d

    .line 10
    .line 11
    if-eqz p1, :cond_d

    .line 12
    .line 13
    invoke-virtual {p2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-lt v3, v4, :cond_0

    .line 18
    .line 19
    invoke-static {p0, p1}, LS/b;->a(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    goto/16 :goto_6

    .line 23
    .line 24
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    if-lt v3, v4, :cond_1

    .line 28
    .line 29
    invoke-static {p0, p1}, LS/b;->a(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    goto/16 :goto_6

    .line 33
    .line 34
    :cond_1
    iget p2, p0, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    .line 35
    .line 36
    iget v3, p0, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    .line 37
    .line 38
    if-le p2, v3, :cond_2

    .line 39
    .line 40
    move v4, v3

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    move v4, p2

    .line 43
    :goto_0
    if-le p2, v3, :cond_3

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_3
    move p2, v3

    .line 47
    :goto_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const/4 v5, 0x0

    .line 52
    if-ltz v4, :cond_c

    .line 53
    .line 54
    if-le p2, v3, :cond_4

    .line 55
    .line 56
    goto/16 :goto_5

    .line 57
    .line 58
    :cond_4
    iget v6, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 59
    .line 60
    and-int/lit16 v6, v6, 0xfff

    .line 61
    .line 62
    const/16 v7, 0x81

    .line 63
    .line 64
    if-eq v6, v7, :cond_b

    .line 65
    .line 66
    const/16 v7, 0xe1

    .line 67
    .line 68
    if-eq v6, v7, :cond_b

    .line 69
    .line 70
    const/16 v7, 0x12

    .line 71
    .line 72
    if-ne v6, v7, :cond_5

    .line 73
    .line 74
    goto/16 :goto_4

    .line 75
    .line 76
    :cond_5
    if-gt v3, v0, :cond_6

    .line 77
    .line 78
    invoke-static {p0, p1, v4, p2}, LS/c;->a(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    .line 79
    .line 80
    .line 81
    goto/16 :goto_6

    .line 82
    .line 83
    :cond_6
    sub-int v3, p2, v4

    .line 84
    .line 85
    const/16 v5, 0x400

    .line 86
    .line 87
    if-le v3, v5, :cond_7

    .line 88
    .line 89
    const/4 v5, 0x0

    .line 90
    goto :goto_2

    .line 91
    :cond_7
    move v5, v3

    .line 92
    :goto_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    sub-int/2addr v6, p2

    .line 97
    sub-int/2addr v0, v5

    .line 98
    const-wide v7, 0x3fe999999999999aL    # 0.8

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    int-to-double v9, v0

    .line 104
    mul-double v9, v9, v7

    .line 105
    .line 106
    double-to-int v7, v9

    .line 107
    invoke-static {v4, v7}, Ljava/lang/Math;->min(II)I

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    sub-int v7, v0, v7

    .line 112
    .line 113
    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    sub-int/2addr v0, v6

    .line 118
    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    sub-int/2addr v4, v0

    .line 123
    invoke-interface {p1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    invoke-static {v7}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    if-eqz v7, :cond_8

    .line 132
    .line 133
    add-int/2addr v4, v2

    .line 134
    sub-int/2addr v0, v2

    .line 135
    :cond_8
    add-int v7, p2, v6

    .line 136
    .line 137
    sub-int/2addr v7, v2

    .line 138
    invoke-interface {p1, v7}, Ljava/lang/CharSequence;->charAt(I)C

    .line 139
    .line 140
    .line 141
    move-result v7

    .line 142
    invoke-static {v7}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    if-eqz v7, :cond_9

    .line 147
    .line 148
    sub-int/2addr v6, v2

    .line 149
    :cond_9
    add-int v7, v0, v5

    .line 150
    .line 151
    add-int v8, v7, v6

    .line 152
    .line 153
    if-eq v5, v3, :cond_a

    .line 154
    .line 155
    add-int v3, v4, v0

    .line 156
    .line 157
    invoke-interface {p1, v4, v3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    add-int/2addr v6, p2

    .line 162
    invoke-interface {p1, p2, v6}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    const/4 p2, 0x2

    .line 167
    new-array p2, p2, [Ljava/lang/CharSequence;

    .line 168
    .line 169
    aput-object v3, p2, v1

    .line 170
    .line 171
    aput-object p1, p2, v2

    .line 172
    .line 173
    invoke-static {p2}, Landroid/text/TextUtils;->concat([Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    goto :goto_3

    .line 178
    :cond_a
    add-int/2addr v8, v4

    .line 179
    invoke-interface {p1, v4, v8}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    :goto_3
    invoke-static {p0, p1, v0, v7}, LS/c;->a(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    .line 184
    .line 185
    .line 186
    goto :goto_6

    .line 187
    :cond_b
    :goto_4
    invoke-static {p0, v5, v1, v1}, LS/c;->a(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    .line 188
    .line 189
    .line 190
    goto :goto_6

    .line 191
    :cond_c
    :goto_5
    invoke-static {p0, v5, v1, v1}, LS/c;->a(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    .line 192
    .line 193
    .line 194
    :cond_d
    :goto_6
    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/drawable/Drawable;Lg1/o;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lo/Z;->a:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p1, p2, v0}, Lo/s;->e(Landroid/graphics/drawable/Drawable;Lg1/o;[I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 6

    .line 1
    iget-object v0, p0, Lo/Z;->b:Lg1/o;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, Lo/Z;->a:Landroid/widget/TextView;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lo/Z;->c:Lg1/o;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lo/Z;->d:Lg1/o;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lo/Z;->e:Lg1/o;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    :cond_0
    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    aget-object v4, v0, v2

    .line 26
    .line 27
    iget-object v5, p0, Lo/Z;->b:Lg1/o;

    .line 28
    .line 29
    invoke-virtual {p0, v4, v5}, Lo/Z;->a(Landroid/graphics/drawable/Drawable;Lg1/o;)V

    .line 30
    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    aget-object v4, v0, v4

    .line 34
    .line 35
    iget-object v5, p0, Lo/Z;->c:Lg1/o;

    .line 36
    .line 37
    invoke-virtual {p0, v4, v5}, Lo/Z;->a(Landroid/graphics/drawable/Drawable;Lg1/o;)V

    .line 38
    .line 39
    .line 40
    aget-object v4, v0, v1

    .line 41
    .line 42
    iget-object v5, p0, Lo/Z;->d:Lg1/o;

    .line 43
    .line 44
    invoke-virtual {p0, v4, v5}, Lo/Z;->a(Landroid/graphics/drawable/Drawable;Lg1/o;)V

    .line 45
    .line 46
    .line 47
    const/4 v4, 0x3

    .line 48
    aget-object v0, v0, v4

    .line 49
    .line 50
    iget-object v4, p0, Lo/Z;->e:Lg1/o;

    .line 51
    .line 52
    invoke-virtual {p0, v0, v4}, Lo/Z;->a(Landroid/graphics/drawable/Drawable;Lg1/o;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    iget-object v0, p0, Lo/Z;->f:Lg1/o;

    .line 56
    .line 57
    if-nez v0, :cond_2

    .line 58
    .line 59
    iget-object v0, p0, Lo/Z;->g:Lg1/o;

    .line 60
    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    :cond_2
    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    aget-object v2, v0, v2

    .line 68
    .line 69
    iget-object v3, p0, Lo/Z;->f:Lg1/o;

    .line 70
    .line 71
    invoke-virtual {p0, v2, v3}, Lo/Z;->a(Landroid/graphics/drawable/Drawable;Lg1/o;)V

    .line 72
    .line 73
    .line 74
    aget-object v0, v0, v1

    .line 75
    .line 76
    iget-object v1, p0, Lo/Z;->g:Lg1/o;

    .line 77
    .line 78
    invoke-virtual {p0, v0, v1}, Lo/Z;->a(Landroid/graphics/drawable/Drawable;Lg1/o;)V

    .line 79
    .line 80
    .line 81
    :cond_3
    return-void
.end method

.method public final d()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lo/Z;->h:Lg1/o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lg1/o;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    return-object v0
.end method

.method public final e()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 1
    iget-object v0, p0, Lo/Z;->h:Lg1/o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lg1/o;->d:Ljava/io/Serializable;

    .line 6
    .line 7
    check-cast v0, Landroid/graphics/PorterDuff$Mode;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    return-object v0
.end method

.method public final f(Landroid/util/AttributeSet;I)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move/from16 v8, p2

    .line 6
    .line 7
    iget-object v9, v0, Lo/Z;->a:Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v10

    .line 13
    invoke-static {}, Lo/s;->a()Lo/s;

    .line 14
    .line 15
    .line 16
    move-result-object v11

    .line 17
    sget-object v3, Lg/a;->h:[I

    .line 18
    .line 19
    invoke-static {v10, v7, v3, v8}, Landroid/support/v4/media/session/t;->A(Landroid/content/Context;Landroid/util/AttributeSet;[II)Landroid/support/v4/media/session/t;

    .line 20
    .line 21
    .line 22
    move-result-object v12

    .line 23
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget-object v1, v12, Landroid/support/v4/media/session/t;->c:Ljava/lang/Object;

    .line 28
    .line 29
    move-object v5, v1

    .line 30
    check-cast v5, Landroid/content/res/TypedArray;

    .line 31
    .line 32
    move-object v1, v9

    .line 33
    move-object/from16 v4, p1

    .line 34
    .line 35
    move/from16 v6, p2

    .line 36
    .line 37
    invoke-static/range {v1 .. v6}, LN/Q;->o(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 38
    .line 39
    .line 40
    iget-object v1, v12, Landroid/support/v4/media/session/t;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Landroid/content/res/TypedArray;

    .line 43
    .line 44
    const/4 v13, 0x0

    .line 45
    const/4 v14, -0x1

    .line 46
    invoke-virtual {v1, v13, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    const/4 v15, 0x3

    .line 51
    invoke-virtual {v1, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_0

    .line 56
    .line 57
    invoke-virtual {v1, v15, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-static {v10, v11, v3}, Lo/Z;->c(Landroid/content/Context;Lo/s;I)Lg1/o;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    iput-object v3, v0, Lo/Z;->b:Lg1/o;

    .line 66
    .line 67
    :cond_0
    const/4 v6, 0x1

    .line 68
    invoke-virtual {v1, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_1

    .line 73
    .line 74
    invoke-virtual {v1, v6, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    invoke-static {v10, v11, v3}, Lo/Z;->c(Landroid/content/Context;Lo/s;I)Lg1/o;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    iput-object v3, v0, Lo/Z;->c:Lg1/o;

    .line 83
    .line 84
    :cond_1
    const/4 v5, 0x4

    .line 85
    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-eqz v3, :cond_2

    .line 90
    .line 91
    invoke-virtual {v1, v5, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    invoke-static {v10, v11, v3}, Lo/Z;->c(Landroid/content/Context;Lo/s;I)Lg1/o;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    iput-object v3, v0, Lo/Z;->d:Lg1/o;

    .line 100
    .line 101
    :cond_2
    const/4 v4, 0x2

    .line 102
    invoke-virtual {v1, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-eqz v3, :cond_3

    .line 107
    .line 108
    invoke-virtual {v1, v4, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    invoke-static {v10, v11, v3}, Lo/Z;->c(Landroid/content/Context;Lo/s;I)Lg1/o;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    iput-object v3, v0, Lo/Z;->e:Lg1/o;

    .line 117
    .line 118
    :cond_3
    const/4 v3, 0x5

    .line 119
    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 120
    .line 121
    .line 122
    move-result v16

    .line 123
    if-eqz v16, :cond_4

    .line 124
    .line 125
    invoke-virtual {v1, v3, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    invoke-static {v10, v11, v4}, Lo/Z;->c(Landroid/content/Context;Lo/s;I)Lg1/o;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    iput-object v4, v0, Lo/Z;->f:Lg1/o;

    .line 134
    .line 135
    :cond_4
    const/4 v4, 0x6

    .line 136
    invoke-virtual {v1, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 137
    .line 138
    .line 139
    move-result v17

    .line 140
    if-eqz v17, :cond_5

    .line 141
    .line 142
    invoke-virtual {v1, v4, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    invoke-static {v10, v11, v1}, Lo/Z;->c(Landroid/content/Context;Lo/s;I)Lg1/o;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    iput-object v1, v0, Lo/Z;->g:Lg1/o;

    .line 151
    .line 152
    :cond_5
    invoke-virtual {v12}, Landroid/support/v4/media/session/t;->C()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v9}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    instance-of v1, v1, Landroid/text/method/PasswordTransformationMethod;

    .line 160
    .line 161
    sget-object v12, Lg/a;->w:[I

    .line 162
    .line 163
    const/16 v6, 0x17

    .line 164
    .line 165
    const/16 v4, 0xe

    .line 166
    .line 167
    if-eq v2, v14, :cond_d

    .line 168
    .line 169
    new-instance v3, Landroid/support/v4/media/session/t;

    .line 170
    .line 171
    invoke-virtual {v10, v2, v12}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-direct {v3, v10, v2}, Landroid/support/v4/media/session/t;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 176
    .line 177
    .line 178
    if-nez v1, :cond_6

    .line 179
    .line 180
    invoke-virtual {v2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 181
    .line 182
    .line 183
    move-result v22

    .line 184
    if-eqz v22, :cond_6

    .line 185
    .line 186
    invoke-virtual {v2, v4, v13}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 187
    .line 188
    .line 189
    move-result v22

    .line 190
    const/16 v23, 0x1

    .line 191
    .line 192
    goto :goto_0

    .line 193
    :cond_6
    const/16 v22, 0x0

    .line 194
    .line 195
    const/16 v23, 0x0

    .line 196
    .line 197
    :goto_0
    invoke-virtual {v0, v10, v3}, Lo/Z;->n(Landroid/content/Context;Landroid/support/v4/media/session/t;)V

    .line 198
    .line 199
    .line 200
    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 201
    .line 202
    if-ge v14, v6, :cond_a

    .line 203
    .line 204
    invoke-virtual {v2, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 205
    .line 206
    .line 207
    move-result v24

    .line 208
    if-eqz v24, :cond_7

    .line 209
    .line 210
    invoke-virtual {v3, v15}, Landroid/support/v4/media/session/t;->n(I)Landroid/content/res/ColorStateList;

    .line 211
    .line 212
    .line 213
    move-result-object v24

    .line 214
    goto :goto_1

    .line 215
    :cond_7
    const/16 v24, 0x0

    .line 216
    .line 217
    :goto_1
    invoke-virtual {v2, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 218
    .line 219
    .line 220
    move-result v25

    .line 221
    if-eqz v25, :cond_8

    .line 222
    .line 223
    invoke-virtual {v3, v5}, Landroid/support/v4/media/session/t;->n(I)Landroid/content/res/ColorStateList;

    .line 224
    .line 225
    .line 226
    move-result-object v25

    .line 227
    const/4 v5, 0x5

    .line 228
    goto :goto_2

    .line 229
    :cond_8
    const/4 v5, 0x5

    .line 230
    const/16 v25, 0x0

    .line 231
    .line 232
    :goto_2
    invoke-virtual {v2, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 233
    .line 234
    .line 235
    move-result v17

    .line 236
    if-eqz v17, :cond_9

    .line 237
    .line 238
    invoke-virtual {v3, v5}, Landroid/support/v4/media/session/t;->n(I)Landroid/content/res/ColorStateList;

    .line 239
    .line 240
    .line 241
    move-result-object v26

    .line 242
    const/16 v5, 0xf

    .line 243
    .line 244
    goto :goto_4

    .line 245
    :cond_9
    const/16 v5, 0xf

    .line 246
    .line 247
    :goto_3
    const/16 v26, 0x0

    .line 248
    .line 249
    goto :goto_4

    .line 250
    :cond_a
    const/16 v5, 0xf

    .line 251
    .line 252
    const/16 v24, 0x0

    .line 253
    .line 254
    const/16 v25, 0x0

    .line 255
    .line 256
    goto :goto_3

    .line 257
    :goto_4
    invoke-virtual {v2, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 258
    .line 259
    .line 260
    move-result v20

    .line 261
    if-eqz v20, :cond_b

    .line 262
    .line 263
    invoke-virtual {v2, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v27

    .line 267
    const/16 v5, 0x1a

    .line 268
    .line 269
    goto :goto_5

    .line 270
    :cond_b
    const/16 v5, 0x1a

    .line 271
    .line 272
    const/16 v27, 0x0

    .line 273
    .line 274
    :goto_5
    if-lt v14, v5, :cond_c

    .line 275
    .line 276
    const/16 v5, 0xd

    .line 277
    .line 278
    invoke-virtual {v2, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 279
    .line 280
    .line 281
    move-result v14

    .line 282
    if-eqz v14, :cond_c

    .line 283
    .line 284
    invoke-virtual {v2, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    goto :goto_6

    .line 289
    :cond_c
    const/4 v2, 0x0

    .line 290
    :goto_6
    invoke-virtual {v3}, Landroid/support/v4/media/session/t;->C()V

    .line 291
    .line 292
    .line 293
    goto :goto_7

    .line 294
    :cond_d
    const/4 v2, 0x0

    .line 295
    const/16 v22, 0x0

    .line 296
    .line 297
    const/16 v23, 0x0

    .line 298
    .line 299
    const/16 v24, 0x0

    .line 300
    .line 301
    const/16 v25, 0x0

    .line 302
    .line 303
    const/16 v26, 0x0

    .line 304
    .line 305
    const/16 v27, 0x0

    .line 306
    .line 307
    :goto_7
    new-instance v3, Landroid/support/v4/media/session/t;

    .line 308
    .line 309
    invoke-virtual {v10, v7, v12, v8, v13}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 310
    .line 311
    .line 312
    move-result-object v5

    .line 313
    invoke-direct {v3, v10, v5}, Landroid/support/v4/media/session/t;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 314
    .line 315
    .line 316
    if-nez v1, :cond_e

    .line 317
    .line 318
    invoke-virtual {v5, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 319
    .line 320
    .line 321
    move-result v12

    .line 322
    if-eqz v12, :cond_e

    .line 323
    .line 324
    invoke-virtual {v5, v4, v13}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 325
    .line 326
    .line 327
    move-result v22

    .line 328
    move/from16 v4, v22

    .line 329
    .line 330
    const/16 v23, 0x1

    .line 331
    .line 332
    goto :goto_8

    .line 333
    :cond_e
    move/from16 v4, v22

    .line 334
    .line 335
    :goto_8
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 336
    .line 337
    if-ge v12, v6, :cond_11

    .line 338
    .line 339
    invoke-virtual {v5, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 340
    .line 341
    .line 342
    move-result v6

    .line 343
    if-eqz v6, :cond_f

    .line 344
    .line 345
    invoke-virtual {v3, v15}, Landroid/support/v4/media/session/t;->n(I)Landroid/content/res/ColorStateList;

    .line 346
    .line 347
    .line 348
    move-result-object v24

    .line 349
    :cond_f
    const/4 v6, 0x4

    .line 350
    invoke-virtual {v5, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 351
    .line 352
    .line 353
    move-result v14

    .line 354
    if-eqz v14, :cond_10

    .line 355
    .line 356
    invoke-virtual {v3, v6}, Landroid/support/v4/media/session/t;->n(I)Landroid/content/res/ColorStateList;

    .line 357
    .line 358
    .line 359
    move-result-object v25

    .line 360
    :cond_10
    const/4 v14, 0x5

    .line 361
    invoke-virtual {v5, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 362
    .line 363
    .line 364
    move-result v17

    .line 365
    if-eqz v17, :cond_11

    .line 366
    .line 367
    invoke-virtual {v3, v14}, Landroid/support/v4/media/session/t;->n(I)Landroid/content/res/ColorStateList;

    .line 368
    .line 369
    .line 370
    move-result-object v26

    .line 371
    :cond_11
    move-object/from16 v6, v24

    .line 372
    .line 373
    move-object/from16 v14, v25

    .line 374
    .line 375
    move-object/from16 v15, v26

    .line 376
    .line 377
    const/16 v13, 0xf

    .line 378
    .line 379
    invoke-virtual {v5, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 380
    .line 381
    .line 382
    move-result v24

    .line 383
    if-eqz v24, :cond_12

    .line 384
    .line 385
    invoke-virtual {v5, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v27

    .line 389
    :cond_12
    move-object/from16 v19, v2

    .line 390
    .line 391
    move-object/from16 v13, v27

    .line 392
    .line 393
    const/16 v2, 0x1a

    .line 394
    .line 395
    if-lt v12, v2, :cond_14

    .line 396
    .line 397
    const/16 v2, 0xd

    .line 398
    .line 399
    invoke-virtual {v5, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 400
    .line 401
    .line 402
    move-result v21

    .line 403
    if-eqz v21, :cond_13

    .line 404
    .line 405
    invoke-virtual {v5, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v19

    .line 409
    :cond_13
    :goto_9
    move-object/from16 v2, v19

    .line 410
    .line 411
    move-object/from16 v19, v11

    .line 412
    .line 413
    goto :goto_a

    .line 414
    :cond_14
    const/16 v2, 0xd

    .line 415
    .line 416
    goto :goto_9

    .line 417
    :goto_a
    const/16 v11, 0x1c

    .line 418
    .line 419
    if-lt v12, v11, :cond_15

    .line 420
    .line 421
    const/4 v11, 0x0

    .line 422
    invoke-virtual {v5, v11}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 423
    .line 424
    .line 425
    move-result v22

    .line 426
    if-eqz v22, :cond_15

    .line 427
    .line 428
    const/4 v7, -0x1

    .line 429
    invoke-virtual {v5, v11, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 430
    .line 431
    .line 432
    move-result v5

    .line 433
    if-nez v5, :cond_15

    .line 434
    .line 435
    const/4 v5, 0x0

    .line 436
    invoke-virtual {v9, v11, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 437
    .line 438
    .line 439
    :cond_15
    invoke-virtual {v0, v10, v3}, Lo/Z;->n(Landroid/content/Context;Landroid/support/v4/media/session/t;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v3}, Landroid/support/v4/media/session/t;->C()V

    .line 443
    .line 444
    .line 445
    if-eqz v6, :cond_16

    .line 446
    .line 447
    invoke-virtual {v9, v6}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 448
    .line 449
    .line 450
    :cond_16
    if-eqz v14, :cond_17

    .line 451
    .line 452
    invoke-virtual {v9, v14}, Landroid/widget/TextView;->setHintTextColor(Landroid/content/res/ColorStateList;)V

    .line 453
    .line 454
    .line 455
    :cond_17
    if-eqz v15, :cond_18

    .line 456
    .line 457
    invoke-virtual {v9, v15}, Landroid/widget/TextView;->setLinkTextColor(Landroid/content/res/ColorStateList;)V

    .line 458
    .line 459
    .line 460
    :cond_18
    if-nez v1, :cond_19

    .line 461
    .line 462
    if-eqz v23, :cond_19

    .line 463
    .line 464
    invoke-virtual {v9, v4}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 465
    .line 466
    .line 467
    :cond_19
    iget-object v1, v0, Lo/Z;->l:Landroid/graphics/Typeface;

    .line 468
    .line 469
    if-eqz v1, :cond_1b

    .line 470
    .line 471
    iget v3, v0, Lo/Z;->k:I

    .line 472
    .line 473
    const/4 v4, -0x1

    .line 474
    if-ne v3, v4, :cond_1a

    .line 475
    .line 476
    iget v3, v0, Lo/Z;->j:I

    .line 477
    .line 478
    invoke-virtual {v9, v1, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 479
    .line 480
    .line 481
    goto :goto_b

    .line 482
    :cond_1a
    invoke-virtual {v9, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 483
    .line 484
    .line 485
    :cond_1b
    :goto_b
    if-eqz v2, :cond_1c

    .line 486
    .line 487
    invoke-static {v9, v2}, Lo/X;->d(Landroid/widget/TextView;Ljava/lang/String;)Z

    .line 488
    .line 489
    .line 490
    :cond_1c
    const/16 v7, 0x18

    .line 491
    .line 492
    if-eqz v13, :cond_1d

    .line 493
    .line 494
    if-lt v12, v7, :cond_1e

    .line 495
    .line 496
    invoke-static {v13}, Lo/W;->a(Ljava/lang/String;)Landroid/os/LocaleList;

    .line 497
    .line 498
    .line 499
    move-result-object v1

    .line 500
    invoke-static {v9, v1}, Lo/W;->b(Landroid/widget/TextView;Landroid/os/LocaleList;)V

    .line 501
    .line 502
    .line 503
    :cond_1d
    const/4 v2, 0x0

    .line 504
    goto :goto_c

    .line 505
    :cond_1e
    const-string v1, ","

    .line 506
    .line 507
    invoke-virtual {v13, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v1

    .line 511
    const/4 v2, 0x0

    .line 512
    aget-object v1, v1, v2

    .line 513
    .line 514
    invoke-static {v1}, Lo/V;->a(Ljava/lang/String;)Ljava/util/Locale;

    .line 515
    .line 516
    .line 517
    move-result-object v1

    .line 518
    invoke-virtual {v9, v1}, Landroid/widget/TextView;->setTextLocale(Ljava/util/Locale;)V

    .line 519
    .line 520
    .line 521
    :goto_c
    sget-object v11, Lg/a;->i:[I

    .line 522
    .line 523
    iget-object v12, v0, Lo/Z;->i:Lo/i0;

    .line 524
    .line 525
    iget-object v13, v12, Lo/i0;->j:Landroid/content/Context;

    .line 526
    .line 527
    move-object/from16 v14, p1

    .line 528
    .line 529
    invoke-virtual {v13, v14, v11, v8, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 530
    .line 531
    .line 532
    move-result-object v15

    .line 533
    iget-object v1, v12, Lo/i0;->i:Landroid/widget/TextView;

    .line 534
    .line 535
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 536
    .line 537
    .line 538
    move-result-object v2

    .line 539
    const/16 v3, 0xd

    .line 540
    .line 541
    const/16 v4, 0xf

    .line 542
    .line 543
    const/4 v5, 0x5

    .line 544
    const/4 v6, 0x0

    .line 545
    const/16 v7, 0xd

    .line 546
    .line 547
    move-object v3, v11

    .line 548
    const/4 v7, 0x2

    .line 549
    move-object/from16 v4, p1

    .line 550
    .line 551
    const/4 v7, 0x5

    .line 552
    move-object v5, v15

    .line 553
    move/from16 v6, p2

    .line 554
    .line 555
    invoke-static/range {v1 .. v6}, LN/Q;->o(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 556
    .line 557
    .line 558
    invoke-virtual {v15, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 559
    .line 560
    .line 561
    move-result v1

    .line 562
    if-eqz v1, :cond_1f

    .line 563
    .line 564
    const/4 v1, 0x0

    .line 565
    invoke-virtual {v15, v7, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 566
    .line 567
    .line 568
    move-result v2

    .line 569
    iput v2, v12, Lo/i0;->a:I

    .line 570
    .line 571
    :cond_1f
    const/4 v1, 0x4

    .line 572
    invoke-virtual {v15, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 573
    .line 574
    .line 575
    move-result v2

    .line 576
    const/high16 v3, -0x40800000    # -1.0f

    .line 577
    .line 578
    if-eqz v2, :cond_20

    .line 579
    .line 580
    invoke-virtual {v15, v1, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 581
    .line 582
    .line 583
    move-result v1

    .line 584
    :goto_d
    const/4 v2, 0x2

    .line 585
    goto :goto_e

    .line 586
    :cond_20
    const/high16 v1, -0x40800000    # -1.0f

    .line 587
    .line 588
    goto :goto_d

    .line 589
    :goto_e
    invoke-virtual {v15, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 590
    .line 591
    .line 592
    move-result v4

    .line 593
    if-eqz v4, :cond_21

    .line 594
    .line 595
    invoke-virtual {v15, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 596
    .line 597
    .line 598
    move-result v4

    .line 599
    const/4 v2, 0x1

    .line 600
    goto :goto_f

    .line 601
    :cond_21
    const/4 v2, 0x1

    .line 602
    const/high16 v4, -0x40800000    # -1.0f

    .line 603
    .line 604
    :goto_f
    invoke-virtual {v15, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 605
    .line 606
    .line 607
    move-result v5

    .line 608
    if-eqz v5, :cond_22

    .line 609
    .line 610
    invoke-virtual {v15, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 611
    .line 612
    .line 613
    move-result v5

    .line 614
    :goto_10
    const/4 v6, 0x3

    .line 615
    goto :goto_11

    .line 616
    :cond_22
    const/high16 v5, -0x40800000    # -1.0f

    .line 617
    .line 618
    goto :goto_10

    .line 619
    :goto_11
    invoke-virtual {v15, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 620
    .line 621
    .line 622
    move-result v8

    .line 623
    if-eqz v8, :cond_25

    .line 624
    .line 625
    const/4 v8, 0x0

    .line 626
    invoke-virtual {v15, v6, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 627
    .line 628
    .line 629
    move-result v7

    .line 630
    if-lez v7, :cond_25

    .line 631
    .line 632
    invoke-virtual {v15}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 633
    .line 634
    .line 635
    move-result-object v6

    .line 636
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    .line 637
    .line 638
    .line 639
    move-result-object v6

    .line 640
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->length()I

    .line 641
    .line 642
    .line 643
    move-result v7

    .line 644
    new-array v8, v7, [I

    .line 645
    .line 646
    if-lez v7, :cond_24

    .line 647
    .line 648
    const/4 v3, 0x0

    .line 649
    :goto_12
    if-ge v3, v7, :cond_23

    .line 650
    .line 651
    const/4 v2, -0x1

    .line 652
    invoke-virtual {v6, v3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 653
    .line 654
    .line 655
    move-result v18

    .line 656
    aput v18, v8, v3

    .line 657
    .line 658
    add-int/lit8 v3, v3, 0x1

    .line 659
    .line 660
    const/4 v2, 0x1

    .line 661
    goto :goto_12

    .line 662
    :cond_23
    invoke-static {v8}, Lo/i0;->b([I)[I

    .line 663
    .line 664
    .line 665
    move-result-object v2

    .line 666
    iput-object v2, v12, Lo/i0;->f:[I

    .line 667
    .line 668
    invoke-virtual {v12}, Lo/i0;->i()Z

    .line 669
    .line 670
    .line 671
    :cond_24
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 672
    .line 673
    .line 674
    :cond_25
    invoke-virtual {v15}, Landroid/content/res/TypedArray;->recycle()V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v12}, Lo/i0;->j()Z

    .line 678
    .line 679
    .line 680
    move-result v2

    .line 681
    if-eqz v2, :cond_2a

    .line 682
    .line 683
    iget v2, v12, Lo/i0;->a:I

    .line 684
    .line 685
    const/4 v3, 0x1

    .line 686
    if-ne v2, v3, :cond_2b

    .line 687
    .line 688
    iget-boolean v2, v12, Lo/i0;->g:Z

    .line 689
    .line 690
    if-nez v2, :cond_29

    .line 691
    .line 692
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 693
    .line 694
    .line 695
    move-result-object v2

    .line 696
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 697
    .line 698
    .line 699
    move-result-object v2

    .line 700
    const/high16 v3, -0x40800000    # -1.0f

    .line 701
    .line 702
    cmpl-float v6, v4, v3

    .line 703
    .line 704
    if-nez v6, :cond_26

    .line 705
    .line 706
    const/high16 v4, 0x41400000    # 12.0f

    .line 707
    .line 708
    const/4 v6, 0x2

    .line 709
    invoke-static {v6, v4, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 710
    .line 711
    .line 712
    move-result v4

    .line 713
    goto :goto_13

    .line 714
    :cond_26
    const/4 v6, 0x2

    .line 715
    :goto_13
    cmpl-float v7, v5, v3

    .line 716
    .line 717
    if-nez v7, :cond_27

    .line 718
    .line 719
    const/high16 v5, 0x42e00000    # 112.0f

    .line 720
    .line 721
    invoke-static {v6, v5, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 722
    .line 723
    .line 724
    move-result v5

    .line 725
    :cond_27
    cmpl-float v2, v1, v3

    .line 726
    .line 727
    if-nez v2, :cond_28

    .line 728
    .line 729
    const/high16 v1, 0x3f800000    # 1.0f

    .line 730
    .line 731
    :cond_28
    invoke-virtual {v12, v4, v5, v1}, Lo/i0;->k(FFF)V

    .line 732
    .line 733
    .line 734
    :cond_29
    invoke-virtual {v12}, Lo/i0;->h()Z

    .line 735
    .line 736
    .line 737
    goto :goto_14

    .line 738
    :cond_2a
    const/4 v1, 0x0

    .line 739
    iput v1, v12, Lo/i0;->a:I

    .line 740
    .line 741
    :cond_2b
    :goto_14
    sget-boolean v1, Lo/n1;->c:Z

    .line 742
    .line 743
    if-eqz v1, :cond_2d

    .line 744
    .line 745
    iget v1, v12, Lo/i0;->a:I

    .line 746
    .line 747
    if-eqz v1, :cond_2d

    .line 748
    .line 749
    iget-object v1, v12, Lo/i0;->f:[I

    .line 750
    .line 751
    array-length v2, v1

    .line 752
    if-lez v2, :cond_2d

    .line 753
    .line 754
    invoke-static {v9}, Lo/X;->a(Landroid/widget/TextView;)I

    .line 755
    .line 756
    .line 757
    move-result v2

    .line 758
    int-to-float v2, v2

    .line 759
    const/high16 v3, -0x40800000    # -1.0f

    .line 760
    .line 761
    cmpl-float v2, v2, v3

    .line 762
    .line 763
    if-eqz v2, :cond_2c

    .line 764
    .line 765
    iget v1, v12, Lo/i0;->d:F

    .line 766
    .line 767
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 768
    .line 769
    .line 770
    move-result v1

    .line 771
    iget v2, v12, Lo/i0;->e:F

    .line 772
    .line 773
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 774
    .line 775
    .line 776
    move-result v2

    .line 777
    iget v3, v12, Lo/i0;->c:F

    .line 778
    .line 779
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 780
    .line 781
    .line 782
    move-result v3

    .line 783
    const/4 v4, 0x0

    .line 784
    invoke-static {v9, v1, v2, v3, v4}, Lo/X;->b(Landroid/widget/TextView;IIII)V

    .line 785
    .line 786
    .line 787
    goto :goto_15

    .line 788
    :cond_2c
    const/4 v4, 0x0

    .line 789
    invoke-static {v9, v1, v4}, Lo/X;->c(Landroid/widget/TextView;[II)V

    .line 790
    .line 791
    .line 792
    :cond_2d
    :goto_15
    invoke-virtual {v10, v14, v11}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 793
    .line 794
    .line 795
    move-result-object v1

    .line 796
    const/16 v2, 0x8

    .line 797
    .line 798
    const/4 v3, -0x1

    .line 799
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 800
    .line 801
    .line 802
    move-result v2

    .line 803
    move-object/from16 v4, v19

    .line 804
    .line 805
    if-eq v2, v3, :cond_2e

    .line 806
    .line 807
    invoke-virtual {v4, v10, v2}, Lo/s;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 808
    .line 809
    .line 810
    move-result-object v2

    .line 811
    :goto_16
    const/16 v5, 0xd

    .line 812
    .line 813
    goto :goto_17

    .line 814
    :cond_2e
    const/4 v2, 0x0

    .line 815
    goto :goto_16

    .line 816
    :goto_17
    invoke-virtual {v1, v5, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 817
    .line 818
    .line 819
    move-result v5

    .line 820
    if-eq v5, v3, :cond_2f

    .line 821
    .line 822
    invoke-virtual {v4, v10, v5}, Lo/s;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 823
    .line 824
    .line 825
    move-result-object v5

    .line 826
    goto :goto_18

    .line 827
    :cond_2f
    const/4 v5, 0x0

    .line 828
    :goto_18
    const/16 v6, 0x9

    .line 829
    .line 830
    invoke-virtual {v1, v6, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 831
    .line 832
    .line 833
    move-result v6

    .line 834
    if-eq v6, v3, :cond_30

    .line 835
    .line 836
    invoke-virtual {v4, v10, v6}, Lo/s;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 837
    .line 838
    .line 839
    move-result-object v6

    .line 840
    :goto_19
    const/4 v7, 0x6

    .line 841
    goto :goto_1a

    .line 842
    :cond_30
    const/4 v6, 0x0

    .line 843
    goto :goto_19

    .line 844
    :goto_1a
    invoke-virtual {v1, v7, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 845
    .line 846
    .line 847
    move-result v7

    .line 848
    if-eq v7, v3, :cond_31

    .line 849
    .line 850
    invoke-virtual {v4, v10, v7}, Lo/s;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 851
    .line 852
    .line 853
    move-result-object v7

    .line 854
    goto :goto_1b

    .line 855
    :cond_31
    const/4 v7, 0x0

    .line 856
    :goto_1b
    const/16 v8, 0xa

    .line 857
    .line 858
    invoke-virtual {v1, v8, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 859
    .line 860
    .line 861
    move-result v8

    .line 862
    if-eq v8, v3, :cond_32

    .line 863
    .line 864
    invoke-virtual {v4, v10, v8}, Lo/s;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 865
    .line 866
    .line 867
    move-result-object v8

    .line 868
    goto :goto_1c

    .line 869
    :cond_32
    const/4 v8, 0x0

    .line 870
    :goto_1c
    const/4 v11, 0x7

    .line 871
    invoke-virtual {v1, v11, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 872
    .line 873
    .line 874
    move-result v11

    .line 875
    if-eq v11, v3, :cond_33

    .line 876
    .line 877
    invoke-virtual {v4, v10, v11}, Lo/s;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 878
    .line 879
    .line 880
    move-result-object v3

    .line 881
    goto :goto_1d

    .line 882
    :cond_33
    const/4 v3, 0x0

    .line 883
    :goto_1d
    if-nez v8, :cond_3e

    .line 884
    .line 885
    if-eqz v3, :cond_34

    .line 886
    .line 887
    goto :goto_26

    .line 888
    :cond_34
    if-nez v2, :cond_35

    .line 889
    .line 890
    if-nez v5, :cond_35

    .line 891
    .line 892
    if-nez v6, :cond_35

    .line 893
    .line 894
    if-eqz v7, :cond_43

    .line 895
    .line 896
    :cond_35
    invoke-virtual {v9}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 897
    .line 898
    .line 899
    move-result-object v3

    .line 900
    const/4 v4, 0x0

    .line 901
    aget-object v8, v3, v4

    .line 902
    .line 903
    if-nez v8, :cond_36

    .line 904
    .line 905
    const/4 v11, 0x2

    .line 906
    aget-object v12, v3, v11

    .line 907
    .line 908
    if-eqz v12, :cond_37

    .line 909
    .line 910
    :cond_36
    const/4 v4, 0x3

    .line 911
    goto :goto_22

    .line 912
    :cond_37
    invoke-virtual {v9}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    .line 913
    .line 914
    .line 915
    move-result-object v3

    .line 916
    if-eqz v2, :cond_38

    .line 917
    .line 918
    goto :goto_1e

    .line 919
    :cond_38
    aget-object v2, v3, v4

    .line 920
    .line 921
    :goto_1e
    if-eqz v5, :cond_39

    .line 922
    .line 923
    goto :goto_1f

    .line 924
    :cond_39
    const/4 v4, 0x1

    .line 925
    aget-object v5, v3, v4

    .line 926
    .line 927
    :goto_1f
    if-eqz v6, :cond_3a

    .line 928
    .line 929
    goto :goto_20

    .line 930
    :cond_3a
    const/4 v4, 0x2

    .line 931
    aget-object v6, v3, v4

    .line 932
    .line 933
    :goto_20
    if-eqz v7, :cond_3b

    .line 934
    .line 935
    goto :goto_21

    .line 936
    :cond_3b
    const/4 v4, 0x3

    .line 937
    aget-object v7, v3, v4

    .line 938
    .line 939
    :goto_21
    invoke-virtual {v9, v2, v5, v6, v7}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 940
    .line 941
    .line 942
    goto :goto_2b

    .line 943
    :goto_22
    if-eqz v5, :cond_3c

    .line 944
    .line 945
    goto :goto_23

    .line 946
    :cond_3c
    const/4 v2, 0x1

    .line 947
    aget-object v5, v3, v2

    .line 948
    .line 949
    :goto_23
    if-eqz v7, :cond_3d

    .line 950
    .line 951
    :goto_24
    const/4 v2, 0x2

    .line 952
    goto :goto_25

    .line 953
    :cond_3d
    aget-object v7, v3, v4

    .line 954
    .line 955
    goto :goto_24

    .line 956
    :goto_25
    aget-object v2, v3, v2

    .line 957
    .line 958
    invoke-virtual {v9, v8, v5, v2, v7}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 959
    .line 960
    .line 961
    goto :goto_2b

    .line 962
    :cond_3e
    :goto_26
    invoke-virtual {v9}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 963
    .line 964
    .line 965
    move-result-object v2

    .line 966
    if-eqz v8, :cond_3f

    .line 967
    .line 968
    goto :goto_27

    .line 969
    :cond_3f
    const/4 v4, 0x0

    .line 970
    aget-object v8, v2, v4

    .line 971
    .line 972
    :goto_27
    if-eqz v5, :cond_40

    .line 973
    .line 974
    goto :goto_28

    .line 975
    :cond_40
    const/4 v4, 0x1

    .line 976
    aget-object v5, v2, v4

    .line 977
    .line 978
    :goto_28
    if-eqz v3, :cond_41

    .line 979
    .line 980
    goto :goto_29

    .line 981
    :cond_41
    const/4 v3, 0x2

    .line 982
    aget-object v3, v2, v3

    .line 983
    .line 984
    :goto_29
    if-eqz v7, :cond_42

    .line 985
    .line 986
    goto :goto_2a

    .line 987
    :cond_42
    const/4 v4, 0x3

    .line 988
    aget-object v7, v2, v4

    .line 989
    .line 990
    :goto_2a
    invoke-virtual {v9, v8, v5, v3, v7}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 991
    .line 992
    .line 993
    :cond_43
    :goto_2b
    const/16 v2, 0xb

    .line 994
    .line 995
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 996
    .line 997
    .line 998
    move-result v3

    .line 999
    if-eqz v3, :cond_46

    .line 1000
    .line 1001
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 1002
    .line 1003
    .line 1004
    move-result v3

    .line 1005
    if-eqz v3, :cond_44

    .line 1006
    .line 1007
    const/4 v3, 0x0

    .line 1008
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 1009
    .line 1010
    .line 1011
    move-result v3

    .line 1012
    if-eqz v3, :cond_44

    .line 1013
    .line 1014
    invoke-static {v10, v3}, Lp0/a;->I(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v3

    .line 1018
    if-eqz v3, :cond_44

    .line 1019
    .line 1020
    goto :goto_2c

    .line 1021
    :cond_44
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v3

    .line 1025
    :goto_2c
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1026
    .line 1027
    const/16 v4, 0x18

    .line 1028
    .line 1029
    if-lt v2, v4, :cond_45

    .line 1030
    .line 1031
    invoke-static {v9, v3}, LT/n;->f(Landroid/widget/TextView;Landroid/content/res/ColorStateList;)V

    .line 1032
    .line 1033
    .line 1034
    goto :goto_2d

    .line 1035
    :cond_45
    instance-of v2, v9, LT/u;

    .line 1036
    .line 1037
    if-eqz v2, :cond_46

    .line 1038
    .line 1039
    move-object v2, v9

    .line 1040
    check-cast v2, LT/u;

    .line 1041
    .line 1042
    invoke-interface {v2, v3}, LT/u;->setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V

    .line 1043
    .line 1044
    .line 1045
    :cond_46
    :goto_2d
    const/16 v2, 0xc

    .line 1046
    .line 1047
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 1048
    .line 1049
    .line 1050
    move-result v3

    .line 1051
    if-eqz v3, :cond_48

    .line 1052
    .line 1053
    const/4 v3, -0x1

    .line 1054
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 1055
    .line 1056
    .line 1057
    move-result v2

    .line 1058
    const/4 v3, 0x0

    .line 1059
    invoke-static {v2, v3}, Lo/p0;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v2

    .line 1063
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1064
    .line 1065
    const/16 v4, 0x18

    .line 1066
    .line 1067
    if-lt v3, v4, :cond_47

    .line 1068
    .line 1069
    invoke-static {v9, v2}, LT/n;->g(Landroid/widget/TextView;Landroid/graphics/PorterDuff$Mode;)V

    .line 1070
    .line 1071
    .line 1072
    goto :goto_2e

    .line 1073
    :cond_47
    instance-of v3, v9, LT/u;

    .line 1074
    .line 1075
    if-eqz v3, :cond_48

    .line 1076
    .line 1077
    move-object v3, v9

    .line 1078
    check-cast v3, LT/u;

    .line 1079
    .line 1080
    invoke-interface {v3, v2}, LT/u;->setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 1081
    .line 1082
    .line 1083
    :cond_48
    :goto_2e
    const/4 v2, -0x1

    .line 1084
    const/16 v3, 0xf

    .line 1085
    .line 1086
    invoke-virtual {v1, v3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 1087
    .line 1088
    .line 1089
    move-result v3

    .line 1090
    const/16 v4, 0x12

    .line 1091
    .line 1092
    invoke-virtual {v1, v4, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 1093
    .line 1094
    .line 1095
    move-result v4

    .line 1096
    const/16 v2, 0x13

    .line 1097
    .line 1098
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 1099
    .line 1100
    .line 1101
    move-result v5

    .line 1102
    if-eqz v5, :cond_4a

    .line 1103
    .line 1104
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v5

    .line 1108
    if-eqz v5, :cond_49

    .line 1109
    .line 1110
    iget v6, v5, Landroid/util/TypedValue;->type:I

    .line 1111
    .line 1112
    const/4 v7, 0x5

    .line 1113
    if-ne v6, v7, :cond_49

    .line 1114
    .line 1115
    iget v2, v5, Landroid/util/TypedValue;->data:I

    .line 1116
    .line 1117
    and-int/lit8 v7, v2, 0xf

    .line 1118
    .line 1119
    invoke-static {v2}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 1120
    .line 1121
    .line 1122
    move-result v2

    .line 1123
    move v5, v7

    .line 1124
    const/4 v7, -0x1

    .line 1125
    goto :goto_30

    .line 1126
    :cond_49
    const/4 v7, -0x1

    .line 1127
    invoke-virtual {v1, v2, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 1128
    .line 1129
    .line 1130
    move-result v2

    .line 1131
    int-to-float v2, v2

    .line 1132
    :goto_2f
    const/4 v5, -0x1

    .line 1133
    goto :goto_30

    .line 1134
    :cond_4a
    const/4 v7, -0x1

    .line 1135
    const/high16 v2, -0x40800000    # -1.0f

    .line 1136
    .line 1137
    goto :goto_2f

    .line 1138
    :goto_30
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 1139
    .line 1140
    .line 1141
    if-eq v3, v7, :cond_4b

    .line 1142
    .line 1143
    invoke-static {v9, v3}, Lp0/a;->v0(Landroid/widget/TextView;I)V

    .line 1144
    .line 1145
    .line 1146
    :cond_4b
    if-eq v4, v7, :cond_4c

    .line 1147
    .line 1148
    invoke-static {v9, v4}, Lp0/a;->x0(Landroid/widget/TextView;I)V

    .line 1149
    .line 1150
    .line 1151
    :cond_4c
    const/high16 v1, -0x40800000    # -1.0f

    .line 1152
    .line 1153
    cmpl-float v1, v2, v1

    .line 1154
    .line 1155
    if-eqz v1, :cond_4f

    .line 1156
    .line 1157
    if-ne v5, v7, :cond_4d

    .line 1158
    .line 1159
    float-to-int v1, v2

    .line 1160
    invoke-static {v9, v1}, Lp0/a;->z0(Landroid/widget/TextView;I)V

    .line 1161
    .line 1162
    .line 1163
    goto :goto_31

    .line 1164
    :cond_4d
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1165
    .line 1166
    const/16 v3, 0x22

    .line 1167
    .line 1168
    if-lt v1, v3, :cond_4e

    .line 1169
    .line 1170
    invoke-static {v9, v5, v2}, LT/q;->a(Landroid/widget/TextView;IF)V

    .line 1171
    .line 1172
    .line 1173
    goto :goto_31

    .line 1174
    :cond_4e
    invoke-virtual {v9}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v1

    .line 1178
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v1

    .line 1182
    invoke-static {v5, v2, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 1183
    .line 1184
    .line 1185
    move-result v1

    .line 1186
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 1187
    .line 1188
    .line 1189
    move-result v1

    .line 1190
    invoke-static {v9, v1}, Lp0/a;->z0(Landroid/widget/TextView;I)V

    .line 1191
    .line 1192
    .line 1193
    :cond_4f
    :goto_31
    return-void
.end method

.method public final g(Landroid/content/Context;I)V
    .locals 6

    .line 1
    sget-object v0, Lg/a;->w:[I

    .line 2
    .line 3
    new-instance v1, Landroid/support/v4/media/session/t;

    .line 4
    .line 5
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-direct {v1, p1, p2}, Landroid/support/v4/media/session/t;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 10
    .line 11
    .line 12
    const/16 v0, 0xe

    .line 13
    .line 14
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    iget-object v3, p0, Lo/Z;->a:Landroid/widget/TextView;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p2, v0, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 28
    .line 29
    .line 30
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 31
    .line 32
    const/16 v2, 0x17

    .line 33
    .line 34
    if-ge v0, v2, :cond_3

    .line 35
    .line 36
    const/4 v2, 0x3

    .line 37
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eqz v5, :cond_1

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Landroid/support/v4/media/session/t;->n(I)Landroid/content/res/ColorStateList;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    const/4 v2, 0x5

    .line 53
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_2

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Landroid/support/v4/media/session/t;->n(I)Landroid/content/res/ColorStateList;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setLinkTextColor(Landroid/content/res/ColorStateList;)V

    .line 66
    .line 67
    .line 68
    :cond_2
    const/4 v2, 0x4

    .line 69
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eqz v5, :cond_3

    .line 74
    .line 75
    invoke-virtual {v1, v2}, Landroid/support/v4/media/session/t;->n(I)Landroid/content/res/ColorStateList;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    if-eqz v2, :cond_3

    .line 80
    .line 81
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setHintTextColor(Landroid/content/res/ColorStateList;)V

    .line 82
    .line 83
    .line 84
    :cond_3
    invoke-virtual {p2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_4

    .line 89
    .line 90
    const/4 v2, -0x1

    .line 91
    invoke-virtual {p2, v4, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-nez v2, :cond_4

    .line 96
    .line 97
    const/4 v2, 0x0

    .line 98
    invoke-virtual {v3, v4, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 99
    .line 100
    .line 101
    :cond_4
    invoke-virtual {p0, p1, v1}, Lo/Z;->n(Landroid/content/Context;Landroid/support/v4/media/session/t;)V

    .line 102
    .line 103
    .line 104
    const/16 p1, 0x1a

    .line 105
    .line 106
    if-lt v0, p1, :cond_5

    .line 107
    .line 108
    const/16 p1, 0xd

    .line 109
    .line 110
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_5

    .line 115
    .line 116
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-eqz p1, :cond_5

    .line 121
    .line 122
    invoke-static {v3, p1}, Lo/X;->d(Landroid/widget/TextView;Ljava/lang/String;)Z

    .line 123
    .line 124
    .line 125
    :cond_5
    invoke-virtual {v1}, Landroid/support/v4/media/session/t;->C()V

    .line 126
    .line 127
    .line 128
    iget-object p1, p0, Lo/Z;->l:Landroid/graphics/Typeface;

    .line 129
    .line 130
    if-eqz p1, :cond_6

    .line 131
    .line 132
    iget p2, p0, Lo/Z;->j:I

    .line 133
    .line 134
    invoke-virtual {v3, p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 135
    .line 136
    .line 137
    :cond_6
    return-void
.end method

.method public final i(IIII)V
    .locals 2

    .line 1
    iget-object v0, p0, Lo/Z;->i:Lo/i0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lo/i0;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v1, v0, Lo/i0;->j:Landroid/content/Context;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    int-to-float p1, p1

    .line 20
    invoke-static {p4, p1, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    int-to-float p2, p2

    .line 25
    invoke-static {p4, p2, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    int-to-float p3, p3

    .line 30
    invoke-static {p4, p3, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    invoke-virtual {v0, p1, p2, p3}, Lo/i0;->k(FFF)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lo/i0;->h()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    invoke-virtual {v0}, Lo/i0;->a()V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
.end method

.method public final j([II)V
    .locals 6

    .line 1
    iget-object v0, p0, Lo/Z;->i:Lo/i0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lo/i0;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_4

    .line 8
    .line 9
    array-length v1, p1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-lez v1, :cond_3

    .line 12
    .line 13
    new-array v3, v1, [I

    .line 14
    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([II)[I

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    iget-object v4, v0, Lo/i0;->j:Landroid/content/Context;

    .line 23
    .line 24
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    :goto_0
    if-ge v2, v1, :cond_1

    .line 33
    .line 34
    aget v5, p1, v2

    .line 35
    .line 36
    int-to-float v5, v5

    .line 37
    invoke-static {p2, v5, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    aput v5, v3, v2

    .line 46
    .line 47
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    :goto_1
    invoke-static {v3}, Lo/i0;->b([I)[I

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    iput-object p2, v0, Lo/i0;->f:[I

    .line 55
    .line 56
    invoke-virtual {v0}, Lo/i0;->i()Z

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    if-eqz p2, :cond_2

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 64
    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v1, "None of the preset sizes is valid: "

    .line 68
    .line 69
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-static {p1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p2

    .line 87
    :cond_3
    iput-boolean v2, v0, Lo/i0;->g:Z

    .line 88
    .line 89
    :goto_2
    invoke-virtual {v0}, Lo/i0;->h()Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_4

    .line 94
    .line 95
    invoke-virtual {v0}, Lo/i0;->a()V

    .line 96
    .line 97
    .line 98
    :cond_4
    return-void
.end method

.method public final k(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lo/Z;->i:Lo/i0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lo/i0;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-ne p1, v1, :cond_0

    .line 13
    .line 14
    iget-object p1, v0, Lo/i0;->j:Landroid/content/Context;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const/high16 v1, 0x41400000    # 12.0f

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    invoke-static {v2, v1, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/high16 v3, 0x42e00000    # 112.0f

    .line 32
    .line 33
    invoke-static {v2, v3, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    const/high16 v2, 0x3f800000    # 1.0f

    .line 38
    .line 39
    invoke-virtual {v0, v1, p1, v2}, Lo/i0;->k(FFF)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lo/i0;->h()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    invoke-virtual {v0}, Lo/i0;->a()V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 53
    .line 54
    const-string v1, "Unknown auto-size text type: "

    .line 55
    .line 56
    invoke-static {v1, p1}, LQ0/E;->e(Ljava/lang/String;I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0

    .line 64
    :cond_1
    const/4 p1, 0x0

    .line 65
    iput p1, v0, Lo/i0;->a:I

    .line 66
    .line 67
    const/high16 v1, -0x40800000    # -1.0f

    .line 68
    .line 69
    iput v1, v0, Lo/i0;->d:F

    .line 70
    .line 71
    iput v1, v0, Lo/i0;->e:F

    .line 72
    .line 73
    iput v1, v0, Lo/i0;->c:F

    .line 74
    .line 75
    new-array v1, p1, [I

    .line 76
    .line 77
    iput-object v1, v0, Lo/i0;->f:[I

    .line 78
    .line 79
    iput-boolean p1, v0, Lo/i0;->b:Z

    .line 80
    .line 81
    :cond_2
    :goto_0
    return-void
.end method

.method public final l(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo/Z;->h:Lg1/o;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lg1/o;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lo/Z;->h:Lg1/o;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lo/Z;->h:Lg1/o;

    .line 13
    .line 14
    iput-object p1, v0, Lg1/o;->c:Ljava/lang/Object;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    :goto_0
    iput-boolean p1, v0, Lg1/o;->b:Z

    .line 22
    .line 23
    iput-object v0, p0, Lo/Z;->b:Lg1/o;

    .line 24
    .line 25
    iput-object v0, p0, Lo/Z;->c:Lg1/o;

    .line 26
    .line 27
    iput-object v0, p0, Lo/Z;->d:Lg1/o;

    .line 28
    .line 29
    iput-object v0, p0, Lo/Z;->e:Lg1/o;

    .line 30
    .line 31
    iput-object v0, p0, Lo/Z;->f:Lg1/o;

    .line 32
    .line 33
    iput-object v0, p0, Lo/Z;->g:Lg1/o;

    .line 34
    .line 35
    return-void
.end method

.method public final m(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo/Z;->h:Lg1/o;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lg1/o;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lo/Z;->h:Lg1/o;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lo/Z;->h:Lg1/o;

    .line 13
    .line 14
    iput-object p1, v0, Lg1/o;->d:Ljava/io/Serializable;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    :goto_0
    iput-boolean p1, v0, Lg1/o;->a:Z

    .line 22
    .line 23
    iput-object v0, p0, Lo/Z;->b:Lg1/o;

    .line 24
    .line 25
    iput-object v0, p0, Lo/Z;->c:Lg1/o;

    .line 26
    .line 27
    iput-object v0, p0, Lo/Z;->d:Lg1/o;

    .line 28
    .line 29
    iput-object v0, p0, Lo/Z;->e:Lg1/o;

    .line 30
    .line 31
    iput-object v0, p0, Lo/Z;->f:Lg1/o;

    .line 32
    .line 33
    iput-object v0, p0, Lo/Z;->g:Lg1/o;

    .line 34
    .line 35
    return-void
.end method

.method public final n(Landroid/content/Context;Landroid/support/v4/media/session/t;)V
    .locals 11

    .line 1
    iget v0, p0, Lo/Z;->j:I

    .line 2
    .line 3
    iget-object v1, p2, Landroid/support/v4/media/session/t;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/content/res/TypedArray;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iput v0, p0, Lo/Z;->j:I

    .line 13
    .line 14
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 15
    .line 16
    const/16 v3, 0x1c

    .line 17
    .line 18
    const/4 v4, -0x1

    .line 19
    if-lt v0, v3, :cond_0

    .line 20
    .line 21
    const/16 v5, 0xb

    .line 22
    .line 23
    invoke-virtual {v1, v5, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    iput v5, p0, Lo/Z;->k:I

    .line 28
    .line 29
    if-eq v5, v4, :cond_0

    .line 30
    .line 31
    iget v5, p0, Lo/Z;->j:I

    .line 32
    .line 33
    and-int/2addr v5, v2

    .line 34
    iput v5, p0, Lo/Z;->j:I

    .line 35
    .line 36
    :cond_0
    const/16 v5, 0xa

    .line 37
    .line 38
    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    const/16 v7, 0xc

    .line 43
    .line 44
    const/4 v8, 0x0

    .line 45
    const/4 v9, 0x1

    .line 46
    if-nez v6, :cond_6

    .line 47
    .line 48
    invoke-virtual {v1, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-virtual {v1, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_5

    .line 60
    .line 61
    iput-boolean v8, p0, Lo/Z;->m:Z

    .line 62
    .line 63
    invoke-virtual {v1, v9, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eq p1, v9, :cond_4

    .line 68
    .line 69
    if-eq p1, v2, :cond_3

    .line 70
    .line 71
    const/4 p2, 0x3

    .line 72
    if-eq p1, p2, :cond_2

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    .line 76
    .line 77
    iput-object p1, p0, Lo/Z;->l:Landroid/graphics/Typeface;

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    .line 81
    .line 82
    iput-object p1, p0, Lo/Z;->l:Landroid/graphics/Typeface;

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_4
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    .line 86
    .line 87
    iput-object p1, p0, Lo/Z;->l:Landroid/graphics/Typeface;

    .line 88
    .line 89
    :cond_5
    :goto_0
    return-void

    .line 90
    :cond_6
    :goto_1
    const/4 v6, 0x0

    .line 91
    iput-object v6, p0, Lo/Z;->l:Landroid/graphics/Typeface;

    .line 92
    .line 93
    invoke-virtual {v1, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    if-eqz v6, :cond_7

    .line 98
    .line 99
    const/16 v5, 0xc

    .line 100
    .line 101
    :cond_7
    iget v6, p0, Lo/Z;->k:I

    .line 102
    .line 103
    iget v7, p0, Lo/Z;->j:I

    .line 104
    .line 105
    invoke-virtual {p1}, Landroid/content/Context;->isRestricted()Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-nez p1, :cond_c

    .line 110
    .line 111
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 112
    .line 113
    iget-object v10, p0, Lo/Z;->a:Landroid/widget/TextView;

    .line 114
    .line 115
    invoke-direct {p1, v10}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    new-instance v10, Lo/T;

    .line 119
    .line 120
    invoke-direct {v10, p0, v6, v7, p1}, Lo/T;-><init>(Lo/Z;IILjava/lang/ref/WeakReference;)V

    .line 121
    .line 122
    .line 123
    :try_start_0
    iget p1, p0, Lo/Z;->j:I

    .line 124
    .line 125
    invoke-virtual {p2, v5, p1, v10}, Landroid/support/v4/media/session/t;->q(IILo/T;)Landroid/graphics/Typeface;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    if-eqz p1, :cond_a

    .line 130
    .line 131
    if-lt v0, v3, :cond_9

    .line 132
    .line 133
    iget p2, p0, Lo/Z;->k:I

    .line 134
    .line 135
    if-eq p2, v4, :cond_9

    .line 136
    .line 137
    invoke-static {p1, v8}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iget p2, p0, Lo/Z;->k:I

    .line 142
    .line 143
    iget v0, p0, Lo/Z;->j:I

    .line 144
    .line 145
    and-int/2addr v0, v2

    .line 146
    if-eqz v0, :cond_8

    .line 147
    .line 148
    const/4 v0, 0x1

    .line 149
    goto :goto_2

    .line 150
    :cond_8
    const/4 v0, 0x0

    .line 151
    :goto_2
    invoke-static {p1, p2, v0}, Lo/Y;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    iput-object p1, p0, Lo/Z;->l:Landroid/graphics/Typeface;

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :catch_0
    nop

    .line 159
    goto :goto_5

    .line 160
    :cond_9
    iput-object p1, p0, Lo/Z;->l:Landroid/graphics/Typeface;

    .line 161
    .line 162
    :cond_a
    :goto_3
    iget-object p1, p0, Lo/Z;->l:Landroid/graphics/Typeface;

    .line 163
    .line 164
    if-nez p1, :cond_b

    .line 165
    .line 166
    const/4 p1, 0x1

    .line 167
    goto :goto_4

    .line 168
    :cond_b
    const/4 p1, 0x0

    .line 169
    :goto_4
    iput-boolean p1, p0, Lo/Z;->m:Z
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 170
    .line 171
    :cond_c
    :goto_5
    iget-object p1, p0, Lo/Z;->l:Landroid/graphics/Typeface;

    .line 172
    .line 173
    if-nez p1, :cond_f

    .line 174
    .line 175
    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    if-eqz p1, :cond_f

    .line 180
    .line 181
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 182
    .line 183
    if-lt p2, v3, :cond_e

    .line 184
    .line 185
    iget p2, p0, Lo/Z;->k:I

    .line 186
    .line 187
    if-eq p2, v4, :cond_e

    .line 188
    .line 189
    invoke-static {p1, v8}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    iget p2, p0, Lo/Z;->k:I

    .line 194
    .line 195
    iget v0, p0, Lo/Z;->j:I

    .line 196
    .line 197
    and-int/2addr v0, v2

    .line 198
    if-eqz v0, :cond_d

    .line 199
    .line 200
    const/4 v8, 0x1

    .line 201
    :cond_d
    invoke-static {p1, p2, v8}, Lo/Y;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    iput-object p1, p0, Lo/Z;->l:Landroid/graphics/Typeface;

    .line 206
    .line 207
    goto :goto_6

    .line 208
    :cond_e
    iget p2, p0, Lo/Z;->j:I

    .line 209
    .line 210
    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    iput-object p1, p0, Lo/Z;->l:Landroid/graphics/Typeface;

    .line 215
    .line 216
    :cond_f
    :goto_6
    return-void
.end method
