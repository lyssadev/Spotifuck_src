.class public abstract Lg0/r;
.super Landroidx/fragment/app/r;
.source "SourceFile"


# instance fields
.field public final Z:Lg0/q;

.field public a0:Lg0/w;

.field public b0:Landroidx/recyclerview/widget/RecyclerView;

.field public c0:Z

.field public d0:Z

.field public e0:I

.field public final f0:LQ0/j;

.field public final g0:LN0/B;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/r;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lg0/q;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lg0/q;-><init>(Lg0/r;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lg0/r;->Z:Lg0/q;

    .line 10
    .line 11
    const v0, 0x7f0c007c

    .line 12
    .line 13
    .line 14
    iput v0, p0, Lg0/r;->e0:I

    .line 15
    .line 16
    new-instance v0, LQ0/j;

    .line 17
    .line 18
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v2, 0x4

    .line 23
    invoke-direct {v0, p0, v1, v2}, LQ0/j;-><init>(Ljava/lang/Object;Landroid/os/Looper;I)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lg0/r;->f0:LQ0/j;

    .line 27
    .line 28
    new-instance v0, LN0/B;

    .line 29
    .line 30
    const/16 v1, 0x9

    .line 31
    .line 32
    invoke-direct {v0, v1, p0}, LN0/B;-><init>(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lg0/r;->g0:LN0/B;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final A()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/r;->H:Z

    .line 3
    .line 4
    iget-object v0, p0, Lg0/r;->a0:Lg0/w;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-object v1, v0, Lg0/w;->h:Lg0/r;

    .line 8
    .line 9
    iput-object v1, v0, Lg0/w;->i:Lg0/r;

    .line 10
    .line 11
    return-void
.end method

.method public final B(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string v0, "android:preferences"

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lg0/r;->a0:Lg0/w;

    .line 12
    .line 13
    iget-object v0, v0, Lg0/w;->g:Landroidx/preference/PreferenceScreen;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Landroidx/preference/PreferenceGroup;->a(Landroid/os/Bundle;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-boolean p1, p0, Lg0/r;->c0:Z

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget-object p1, p0, Lg0/r;->a0:Lg0/w;

    .line 25
    .line 26
    iget-object p1, p1, Lg0/w;->g:Landroidx/preference/PreferenceScreen;

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lg0/r;->b0:Landroidx/recyclerview/widget/RecyclerView;

    .line 31
    .line 32
    new-instance v1, Lg0/u;

    .line 33
    .line 34
    invoke-direct {v1, p1}, Lg0/u;-><init>(Landroidx/preference/PreferenceScreen;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Lj0/C;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Landroidx/preference/PreferenceGroup;->i()V

    .line 41
    .line 42
    .line 43
    :cond_1
    const/4 p1, 0x1

    .line 44
    iput-boolean p1, p0, Lg0/r;->d0:Z

    .line 45
    .line 46
    return-void
.end method

.method public abstract K(Ljava/lang/String;)V
.end method

.method public final t(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/r;->t(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroid/util/TypedValue;

    .line 5
    .line 6
    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/r;->F()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const v1, 0x7f0403bd

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-virtual {v0, v1, p1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 22
    .line 23
    .line 24
    iget p1, p1, Landroid/util/TypedValue;->resourceId:I

    .line 25
    .line 26
    if-nez p1, :cond_0

    .line 27
    .line 28
    const p1, 0x7f110161

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/r;->F()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-virtual {v0, p1, v1}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 41
    .line 42
    .line 43
    new-instance p1, Lg0/w;

    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/fragment/app/r;->F()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-direct {p1, v0}, Lg0/w;-><init>(Landroid/content/Context;)V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Lg0/r;->a0:Lg0/w;

    .line 53
    .line 54
    iput-object p0, p1, Lg0/w;->j:Lg0/r;

    .line 55
    .line 56
    iget-object p1, p0, Landroidx/fragment/app/r;->k:Landroid/os/Bundle;

    .line 57
    .line 58
    if-eqz p1, :cond_1

    .line 59
    .line 60
    const-string v0, "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT"

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    const/4 p1, 0x0

    .line 68
    :goto_0
    invoke-virtual {p0, p1}, Lg0/r;->K(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final u(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/r;->F()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lg0/z;->h:[I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const v3, 0x7f0403b7

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-virtual {v0, v2, v1, v3, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget v1, p0, Lg0/r;->e0:I

    .line 17
    .line 18
    invoke-virtual {v0, v4, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iput v1, p0, Lg0/r;->e0:I

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const/4 v3, 0x2

    .line 30
    const/4 v5, -0x1

    .line 31
    invoke-virtual {v0, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    const/4 v6, 0x3

    .line 36
    invoke-virtual {v0, v6, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/fragment/app/r;->F()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p1, v0}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iget v0, p0, Lg0/r;->e0:I

    .line 52
    .line 53
    invoke-virtual {p1, v0, p2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    const v0, 0x102003f

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    instance-of v7, v0, Landroid/view/ViewGroup;

    .line 65
    .line 66
    if-eqz v7, :cond_8

    .line 67
    .line 68
    check-cast v0, Landroid/view/ViewGroup;

    .line 69
    .line 70
    invoke-virtual {p0}, Landroidx/fragment/app/r;->F()Landroid/content/Context;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    const-string v8, "android.hardware.type.automotive"

    .line 79
    .line 80
    invoke-virtual {v7, v8}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-eqz v7, :cond_0

    .line 85
    .line 86
    const v7, 0x7f090185

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    check-cast v7, Landroidx/recyclerview/widget/RecyclerView;

    .line 94
    .line 95
    if-eqz v7, :cond_0

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_0
    const v7, 0x7f0c007e

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v7, v0, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    move-object v7, p1

    .line 106
    check-cast v7, Landroidx/recyclerview/widget/RecyclerView;

    .line 107
    .line 108
    new-instance p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 109
    .line 110
    invoke-virtual {p0}, Landroidx/fragment/app/r;->F()Landroid/content/Context;

    .line 111
    .line 112
    .line 113
    invoke-direct {p1, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v7, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lj0/K;)V

    .line 117
    .line 118
    .line 119
    new-instance p1, Lg0/x;

    .line 120
    .line 121
    invoke-direct {p1, v7}, Lg0/x;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v7, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAccessibilityDelegateCompat(Lj0/c0;)V

    .line 125
    .line 126
    .line 127
    :goto_0
    iput-object v7, p0, Lg0/r;->b0:Landroidx/recyclerview/widget/RecyclerView;

    .line 128
    .line 129
    iget-object p1, p0, Lg0/r;->Z:Lg0/q;

    .line 130
    .line 131
    invoke-virtual {v7, p1}, Landroidx/recyclerview/widget/RecyclerView;->g(Lj0/H;)V

    .line 132
    .line 133
    .line 134
    if-eqz v2, :cond_1

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    iput v1, p1, Lg0/q;->b:I

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_1
    iput v4, p1, Lg0/q;->b:I

    .line 147
    .line 148
    :goto_1
    iput-object v2, p1, Lg0/q;->a:Landroid/graphics/drawable/Drawable;

    .line 149
    .line 150
    iget-object v1, p1, Lg0/q;->d:Lg0/r;

    .line 151
    .line 152
    iget-object v2, v1, Lg0/r;->b0:Landroidx/recyclerview/widget/RecyclerView;

    .line 153
    .line 154
    iget-object v4, v2, Landroidx/recyclerview/widget/RecyclerView;->s:Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    const-string v7, "Cannot invalidate item decorations during a scroll or layout"

    .line 161
    .line 162
    if-nez v4, :cond_2

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_2
    iget-object v4, v2, Landroidx/recyclerview/widget/RecyclerView;->r:Lj0/K;

    .line 166
    .line 167
    if-eqz v4, :cond_3

    .line 168
    .line 169
    invoke-virtual {v4, v7}, Lj0/K;->c(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    :cond_3
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->N()V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 176
    .line 177
    .line 178
    :goto_2
    if-eq v3, v5, :cond_6

    .line 179
    .line 180
    iput v3, p1, Lg0/q;->b:I

    .line 181
    .line 182
    iget-object v1, v1, Lg0/r;->b0:Landroidx/recyclerview/widget/RecyclerView;

    .line 183
    .line 184
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView;->s:Ljava/util/ArrayList;

    .line 185
    .line 186
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    if-nez v2, :cond_4

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_4
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView;->r:Lj0/K;

    .line 194
    .line 195
    if-eqz v2, :cond_5

    .line 196
    .line 197
    invoke-virtual {v2, v7}, Lj0/K;->c(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    :cond_5
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->N()V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 204
    .line 205
    .line 206
    :cond_6
    :goto_3
    iput-boolean v6, p1, Lg0/q;->c:Z

    .line 207
    .line 208
    iget-object p1, p0, Lg0/r;->b0:Landroidx/recyclerview/widget/RecyclerView;

    .line 209
    .line 210
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    if-nez p1, :cond_7

    .line 215
    .line 216
    iget-object p1, p0, Lg0/r;->b0:Landroidx/recyclerview/widget/RecyclerView;

    .line 217
    .line 218
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 219
    .line 220
    .line 221
    :cond_7
    iget-object p1, p0, Lg0/r;->f0:LQ0/j;

    .line 222
    .line 223
    iget-object v0, p0, Lg0/r;->g0:LN0/B;

    .line 224
    .line 225
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 226
    .line 227
    .line 228
    return-object p2

    .line 229
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 230
    .line 231
    const-string p2, "Content has view with id attribute \'android.R.id.list_container\' that is not a ViewGroup class"

    .line 232
    .line 233
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    throw p1
.end method

.method public final v()V
    .locals 3

    .line 1
    iget-object v0, p0, Lg0/r;->f0:LQ0/j;

    .line 2
    .line 3
    iget-object v1, p0, Lg0/r;->g0:LN0/B;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 10
    .line 11
    .line 12
    iget-boolean v0, p0, Lg0/r;->c0:Z

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lg0/r;->b0:Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Lj0/C;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lg0/r;->a0:Lg0/w;

    .line 23
    .line 24
    iget-object v0, v0, Lg0/w;->g:Landroidx/preference/PreferenceScreen;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Landroidx/preference/PreferenceGroup;->m()V

    .line 29
    .line 30
    .line 31
    :cond_0
    iput-object v2, p0, Lg0/r;->b0:Landroidx/recyclerview/widget/RecyclerView;

    .line 32
    .line 33
    iput-boolean v1, p0, Landroidx/fragment/app/r;->H:Z

    .line 34
    .line 35
    return-void
.end method

.method public final y(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lg0/r;->a0:Lg0/w;

    .line 2
    .line 3
    iget-object v0, v0, Lg0/w;->g:Landroidx/preference/PreferenceScreen;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v1, Landroid/os/Bundle;

    .line 8
    .line 9
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroidx/preference/PreferenceGroup;->b(Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "android:preferences"

    .line 16
    .line 17
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final z()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/r;->H:Z

    .line 3
    .line 4
    iget-object v0, p0, Lg0/r;->a0:Lg0/w;

    .line 5
    .line 6
    iput-object p0, v0, Lg0/w;->h:Lg0/r;

    .line 7
    .line 8
    iput-object p0, v0, Lg0/w;->i:Lg0/r;

    .line 9
    .line 10
    return-void
.end method
