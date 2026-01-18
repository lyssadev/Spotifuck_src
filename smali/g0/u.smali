.class public final Lg0/u;
.super Lj0/C;
.source "SourceFile"


# instance fields
.field public final c:Landroidx/preference/PreferenceScreen;

.field public d:Ljava/util/ArrayList;

.field public e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;

.field public final g:Landroid/os/Handler;

.field public final h:LN0/B;


# direct methods
.method public constructor <init>(Landroidx/preference/PreferenceScreen;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lj0/C;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LN0/B;

    .line 5
    .line 6
    const/16 v1, 0xa

    .line 7
    .line 8
    invoke-direct {v0, v1, p0}, LN0/B;-><init>(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lg0/u;->h:LN0/B;

    .line 12
    .line 13
    iput-object p1, p0, Lg0/u;->c:Landroidx/preference/PreferenceScreen;

    .line 14
    .line 15
    new-instance v0, Landroid/os/Handler;

    .line 16
    .line 17
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lg0/u;->g:Landroid/os/Handler;

    .line 25
    .line 26
    iput-object p0, p1, Landroidx/preference/Preference;->F:Lg0/u;

    .line 27
    .line 28
    new-instance v0, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lg0/u;->d:Ljava/util/ArrayList;

    .line 34
    .line 35
    new-instance v0, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lg0/u;->e:Ljava/util/ArrayList;

    .line 41
    .line 42
    new-instance v0, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lg0/u;->f:Ljava/util/ArrayList;

    .line 48
    .line 49
    iget-boolean p1, p1, Landroidx/preference/PreferenceScreen;->S:Z

    .line 50
    .line 51
    invoke-virtual {p0, p1}, Lj0/C;->f(Z)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lg0/u;->k()V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public static j(Landroidx/preference/PreferenceGroup;)Z
    .locals 1

    .line 1
    iget p0, p0, Landroidx/preference/PreferenceGroup;->R:I

    .line 2
    .line 3
    const v0, 0x7fffffff

    .line 4
    .line 5
    .line 6
    if-eq p0, v0, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    return p0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-object v0, p0, Lg0/u;->e:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final b(I)J
    .locals 2

    .line 1
    iget-boolean v0, p0, Lj0/C;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-wide/16 v0, -0x1

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    invoke-virtual {p0, p1}, Lg0/u;->i(I)Landroidx/preference/Preference;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Landroidx/preference/Preference;->c()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0
.end method

.method public final c(I)I
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lg0/u;->i(I)Landroidx/preference/Preference;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lg0/t;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Lg0/t;-><init>(Landroidx/preference/Preference;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lg0/u;->f:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, -0x1

    .line 17
    if-eq v1, v2, :cond_0

    .line 18
    .line 19
    return v1

    .line 20
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    return v1
.end method

.method public final d(Lj0/a0;I)V
    .locals 3

    .line 1
    check-cast p1, Lg0/y;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lg0/u;->i(I)Landroidx/preference/Preference;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget-object v0, p1, Lj0/a0;->a:Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p1, Lg0/y;->t:Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    if-eq v1, v2, :cond_0

    .line 16
    .line 17
    sget-object v1, LN/Q;->a:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    const v0, 0x1020016

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lg0/y;->r(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Landroid/widget/TextView;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v1, p1, Lg0/y;->u:Landroid/content/res/ColorStateList;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_1

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-virtual {p2, p1}, Landroidx/preference/Preference;->k(Lg0/y;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final e(Landroid/view/ViewGroup;I)Lj0/a0;
    .locals 5

    .line 1
    iget-object v0, p0, Lg0/u;->f:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Lg0/t;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sget-object v2, Lg0/z;->a:[I

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-virtual {v1, v3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    if-nez v3, :cond_0

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    const v4, 0x1080062

    .line 40
    .line 41
    .line 42
    invoke-static {v3, v4}, LT0/g;->n(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    :cond_0
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 47
    .line 48
    .line 49
    iget v1, p2, Lg0/t;->a:I

    .line 50
    .line 51
    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    if-nez v1, :cond_1

    .line 60
    .line 61
    sget-object v1, LN/Q;->a:Ljava/util/WeakHashMap;

    .line 62
    .line 63
    invoke-virtual {p1, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 64
    .line 65
    .line 66
    :cond_1
    const v1, 0x1020018

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, Landroid/view/ViewGroup;

    .line 74
    .line 75
    if-eqz v1, :cond_3

    .line 76
    .line 77
    iget p2, p2, Lg0/t;->b:I

    .line 78
    .line 79
    if-eqz p2, :cond_2

    .line 80
    .line 81
    invoke-virtual {v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    const/16 p2, 0x8

    .line 86
    .line 87
    invoke-virtual {v1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 88
    .line 89
    .line 90
    :cond_3
    :goto_0
    new-instance p2, Lg0/y;

    .line 91
    .line 92
    invoke-direct {p2, p1}, Lg0/y;-><init>(Landroid/view/View;)V

    .line 93
    .line 94
    .line 95
    return-object p2
.end method

.method public final g(Landroidx/preference/PreferenceGroup;)Ljava/util/ArrayList;
    .locals 14

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    new-instance v2, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v3, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v4, p1, Landroidx/preference/PreferenceGroup;->N:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    :goto_0
    if-ge v5, v4, :cond_a

    .line 22
    .line 23
    invoke-virtual {p1, v5}, Landroidx/preference/PreferenceGroup;->x(I)Landroidx/preference/Preference;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    iget-boolean v8, v7, Landroidx/preference/Preference;->v:Z

    .line 28
    .line 29
    if-nez v8, :cond_0

    .line 30
    .line 31
    goto :goto_7

    .line 32
    :cond_0
    invoke-static {p1}, Lg0/u;->j(Landroidx/preference/PreferenceGroup;)Z

    .line 33
    .line 34
    .line 35
    move-result v8

    .line 36
    if-eqz v8, :cond_2

    .line 37
    .line 38
    iget v8, p1, Landroidx/preference/PreferenceGroup;->R:I

    .line 39
    .line 40
    if-ge v6, v8, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    :goto_1
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    :goto_2
    instance-of v8, v7, Landroidx/preference/PreferenceGroup;

    .line 51
    .line 52
    if-nez v8, :cond_3

    .line 53
    .line 54
    add-int/2addr v6, v1

    .line 55
    goto :goto_7

    .line 56
    :cond_3
    check-cast v7, Landroidx/preference/PreferenceGroup;

    .line 57
    .line 58
    instance-of v8, v7, Landroidx/preference/PreferenceScreen;

    .line 59
    .line 60
    if-eqz v8, :cond_4

    .line 61
    .line 62
    goto :goto_7

    .line 63
    :cond_4
    invoke-static {p1}, Lg0/u;->j(Landroidx/preference/PreferenceGroup;)Z

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    if-eqz v8, :cond_6

    .line 68
    .line 69
    invoke-static {v7}, Lg0/u;->j(Landroidx/preference/PreferenceGroup;)Z

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    if-nez v8, :cond_5

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    const-string v0, "Nesting an expandable group inside of another expandable group is not supported!"

    .line 79
    .line 80
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p1

    .line 84
    :cond_6
    :goto_3
    invoke-virtual {p0, v7}, Lg0/u;->g(Landroidx/preference/PreferenceGroup;)Ljava/util/ArrayList;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    if-eqz v8, :cond_9

    .line 97
    .line 98
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    check-cast v8, Landroidx/preference/Preference;

    .line 103
    .line 104
    invoke-static {p1}, Lg0/u;->j(Landroidx/preference/PreferenceGroup;)Z

    .line 105
    .line 106
    .line 107
    move-result v9

    .line 108
    if-eqz v9, :cond_8

    .line 109
    .line 110
    iget v9, p1, Landroidx/preference/PreferenceGroup;->R:I

    .line 111
    .line 112
    if-ge v6, v9, :cond_7

    .line 113
    .line 114
    goto :goto_5

    .line 115
    :cond_7
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_8
    :goto_5
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    :goto_6
    add-int/2addr v6, v1

    .line 123
    goto :goto_4

    .line 124
    :cond_9
    :goto_7
    add-int/2addr v5, v1

    .line 125
    goto :goto_0

    .line 126
    :cond_a
    invoke-static {p1}, Lg0/u;->j(Landroidx/preference/PreferenceGroup;)Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-eqz v4, :cond_15

    .line 131
    .line 132
    iget v4, p1, Landroidx/preference/PreferenceGroup;->R:I

    .line 133
    .line 134
    if-le v6, v4, :cond_15

    .line 135
    .line 136
    new-instance v4, Lg0/e;

    .line 137
    .line 138
    iget-wide v5, p1, Landroidx/preference/Preference;->c:J

    .line 139
    .line 140
    iget-object v7, p1, Landroidx/preference/Preference;->a:Landroid/content/Context;

    .line 141
    .line 142
    const/4 v8, 0x0

    .line 143
    invoke-direct {v4, v7, v8}, Landroidx/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 144
    .line 145
    .line 146
    const v7, 0x7f0c002d

    .line 147
    .line 148
    .line 149
    iput v7, v4, Landroidx/preference/Preference;->D:I

    .line 150
    .line 151
    iget-object v7, v4, Landroidx/preference/Preference;->a:Landroid/content/Context;

    .line 152
    .line 153
    const v9, 0x7f080094

    .line 154
    .line 155
    .line 156
    invoke-static {v7, v9}, LT0/g;->n(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 157
    .line 158
    .line 159
    move-result-object v10

    .line 160
    iget-object v11, v4, Landroidx/preference/Preference;->j:Landroid/graphics/drawable/Drawable;

    .line 161
    .line 162
    if-eq v11, v10, :cond_b

    .line 163
    .line 164
    iput-object v10, v4, Landroidx/preference/Preference;->j:Landroid/graphics/drawable/Drawable;

    .line 165
    .line 166
    iput v0, v4, Landroidx/preference/Preference;->i:I

    .line 167
    .line 168
    invoke-virtual {v4}, Landroidx/preference/Preference;->g()V

    .line 169
    .line 170
    .line 171
    :cond_b
    iput v9, v4, Landroidx/preference/Preference;->i:I

    .line 172
    .line 173
    const v9, 0x7f10003c

    .line 174
    .line 175
    .line 176
    invoke-virtual {v7, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v9

    .line 180
    iget-object v10, v4, Landroidx/preference/Preference;->g:Ljava/lang/CharSequence;

    .line 181
    .line 182
    invoke-static {v9, v10}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    if-nez v10, :cond_c

    .line 187
    .line 188
    iput-object v9, v4, Landroidx/preference/Preference;->g:Ljava/lang/CharSequence;

    .line 189
    .line 190
    invoke-virtual {v4}, Landroidx/preference/Preference;->g()V

    .line 191
    .line 192
    .line 193
    :cond_c
    iget v9, v4, Landroidx/preference/Preference;->f:I

    .line 194
    .line 195
    const/16 v10, 0x3e7

    .line 196
    .line 197
    if-eq v10, v9, :cond_d

    .line 198
    .line 199
    iput v10, v4, Landroidx/preference/Preference;->f:I

    .line 200
    .line 201
    iget-object v9, v4, Landroidx/preference/Preference;->F:Lg0/u;

    .line 202
    .line 203
    if-eqz v9, :cond_d

    .line 204
    .line 205
    iget-object v10, v9, Lg0/u;->g:Landroid/os/Handler;

    .line 206
    .line 207
    iget-object v9, v9, Lg0/u;->h:LN0/B;

    .line 208
    .line 209
    invoke-virtual {v10, v9}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v10, v9}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 213
    .line 214
    .line 215
    :cond_d
    new-instance v9, Ljava/util/ArrayList;

    .line 216
    .line 217
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    :cond_e
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 225
    .line 226
    .line 227
    move-result v10

    .line 228
    if-eqz v10, :cond_12

    .line 229
    .line 230
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v10

    .line 234
    check-cast v10, Landroidx/preference/Preference;

    .line 235
    .line 236
    iget-object v11, v10, Landroidx/preference/Preference;->g:Ljava/lang/CharSequence;

    .line 237
    .line 238
    instance-of v12, v10, Landroidx/preference/PreferenceGroup;

    .line 239
    .line 240
    if-eqz v12, :cond_f

    .line 241
    .line 242
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 243
    .line 244
    .line 245
    move-result v13

    .line 246
    if-nez v13, :cond_f

    .line 247
    .line 248
    move-object v13, v10

    .line 249
    check-cast v13, Landroidx/preference/PreferenceGroup;

    .line 250
    .line 251
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    :cond_f
    iget-object v13, v10, Landroidx/preference/Preference;->H:Landroidx/preference/PreferenceGroup;

    .line 255
    .line 256
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v13

    .line 260
    if-eqz v13, :cond_10

    .line 261
    .line 262
    if-eqz v12, :cond_e

    .line 263
    .line 264
    check-cast v10, Landroidx/preference/PreferenceGroup;

    .line 265
    .line 266
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    goto :goto_8

    .line 270
    :cond_10
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 271
    .line 272
    .line 273
    move-result v10

    .line 274
    if-nez v10, :cond_e

    .line 275
    .line 276
    if-nez v8, :cond_11

    .line 277
    .line 278
    move-object v8, v11

    .line 279
    goto :goto_8

    .line 280
    :cond_11
    const/4 v10, 0x2

    .line 281
    new-array v10, v10, [Ljava/lang/Object;

    .line 282
    .line 283
    aput-object v8, v10, v0

    .line 284
    .line 285
    aput-object v11, v10, v1

    .line 286
    .line 287
    const v8, 0x7f1000e0

    .line 288
    .line 289
    .line 290
    invoke-virtual {v7, v8, v10}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v8

    .line 294
    goto :goto_8

    .line 295
    :cond_12
    iget-object v1, v4, Landroidx/preference/Preference;->K:LK0/e;

    .line 296
    .line 297
    if-nez v1, :cond_14

    .line 298
    .line 299
    iget-object v1, v4, Landroidx/preference/Preference;->h:Ljava/lang/CharSequence;

    .line 300
    .line 301
    invoke-static {v1, v8}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 302
    .line 303
    .line 304
    move-result v1

    .line 305
    if-nez v1, :cond_13

    .line 306
    .line 307
    iput-object v8, v4, Landroidx/preference/Preference;->h:Ljava/lang/CharSequence;

    .line 308
    .line 309
    invoke-virtual {v4}, Landroidx/preference/Preference;->g()V

    .line 310
    .line 311
    .line 312
    :cond_13
    const-wide/32 v7, 0xf4240

    .line 313
    .line 314
    .line 315
    add-long/2addr v5, v7

    .line 316
    iput-wide v5, v4, Lg0/e;->M:J

    .line 317
    .line 318
    new-instance v1, LE/j;

    .line 319
    .line 320
    const/16 v3, 0xb

    .line 321
    .line 322
    invoke-direct {v1, p0, p1, v3, v0}, LE/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 323
    .line 324
    .line 325
    iput-object v1, v4, Landroidx/preference/Preference;->e:Lg0/m;

    .line 326
    .line 327
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    goto :goto_9

    .line 331
    :cond_14
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 332
    .line 333
    const-string v0, "Preference already has a SummaryProvider set."

    .line 334
    .line 335
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    throw p1

    .line 339
    :cond_15
    :goto_9
    return-object v2
.end method

.method public final h(Ljava/util/ArrayList;Landroidx/preference/PreferenceGroup;)V
    .locals 5

    .line 1
    monitor-enter p2

    .line 2
    :try_start_0
    iget-object v0, p2, Landroidx/preference/PreferenceGroup;->N:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 5
    .line 6
    .line 7
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    iget-object v0, p2, Landroidx/preference/PreferenceGroup;->N:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    if-ge v1, v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p2, v1}, Landroidx/preference/PreferenceGroup;->x(I)Landroidx/preference/Preference;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    new-instance v3, Lg0/t;

    .line 25
    .line 26
    invoke-direct {v3, v2}, Lg0/t;-><init>(Landroidx/preference/Preference;)V

    .line 27
    .line 28
    .line 29
    iget-object v4, p0, Lg0/u;->f:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-nez v4, :cond_0

    .line 36
    .line 37
    iget-object v4, p0, Lg0/u;->f:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    :cond_0
    instance-of v3, v2, Landroidx/preference/PreferenceGroup;

    .line 43
    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    move-object v3, v2

    .line 47
    check-cast v3, Landroidx/preference/PreferenceGroup;

    .line 48
    .line 49
    instance-of v4, v3, Landroidx/preference/PreferenceScreen;

    .line 50
    .line 51
    if-nez v4, :cond_1

    .line 52
    .line 53
    invoke-virtual {p0, p1, v3}, Lg0/u;->h(Ljava/util/ArrayList;Landroidx/preference/PreferenceGroup;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    iput-object p0, v2, Landroidx/preference/Preference;->F:Lg0/u;

    .line 57
    .line 58
    add-int/lit8 v1, v1, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    return-void

    .line 62
    :catchall_0
    move-exception p1

    .line 63
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    throw p1
.end method

.method public final i(I)Landroidx/preference/Preference;
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lg0/u;->e:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lt p1, v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lg0/u;->e:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Landroidx/preference/Preference;

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 22
    return-object p1
.end method

.method public final k()V
    .locals 3

    .line 1
    iget-object v0, p0, Lg0/u;->d:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroidx/preference/Preference;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    iput-object v2, v1, Landroidx/preference/Preference;->F:Lg0/u;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Lg0/u;->d:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    new-instance v1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Lg0/u;->d:Ljava/util/ArrayList;

    .line 35
    .line 36
    iget-object v0, p0, Lg0/u;->c:Landroidx/preference/PreferenceScreen;

    .line 37
    .line 38
    invoke-virtual {p0, v1, v0}, Lg0/u;->h(Ljava/util/ArrayList;Landroidx/preference/PreferenceGroup;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lg0/u;->g(Landroidx/preference/PreferenceGroup;)Ljava/util/ArrayList;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, Lg0/u;->e:Ljava/util/ArrayList;

    .line 46
    .line 47
    iget-object v0, p0, Lj0/C;->a:Lj0/D;

    .line 48
    .line 49
    invoke-virtual {v0}, Lj0/D;->b()V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lg0/u;->d:Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_1

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, Landroidx/preference/Preference;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    return-void
.end method
