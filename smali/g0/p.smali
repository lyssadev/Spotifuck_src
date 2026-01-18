.class public abstract Lg0/p;
.super Landroidx/fragment/app/m;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public n0:Landroidx/preference/DialogPreference;

.field public o0:Ljava/lang/CharSequence;

.field public p0:Ljava/lang/CharSequence;

.field public q0:Ljava/lang/CharSequence;

.field public r0:Ljava/lang/CharSequence;

.field public s0:I

.field public t0:Landroid/graphics/drawable/BitmapDrawable;

.field public u0:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/m;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final K()Landroid/app/Dialog;
    .locals 5

    .line 1
    const/4 v0, -0x2

    .line 2
    iput v0, p0, Lg0/p;->u0:I

    .line 3
    .line 4
    new-instance v0, LK/j;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/r;->F()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, LK/j;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lg0/p;->o0:Ljava/lang/CharSequence;

    .line 14
    .line 15
    iget-object v2, v0, LK/j;->g:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Lh/f;

    .line 18
    .line 19
    iput-object v1, v2, Lh/f;->d:Ljava/lang/CharSequence;

    .line 20
    .line 21
    iget-object v1, p0, Lg0/p;->t0:Landroid/graphics/drawable/BitmapDrawable;

    .line 22
    .line 23
    iput-object v1, v2, Lh/f;->c:Landroid/graphics/drawable/Drawable;

    .line 24
    .line 25
    iget-object v1, p0, Lg0/p;->p0:Ljava/lang/CharSequence;

    .line 26
    .line 27
    iput-object v1, v2, Lh/f;->g:Ljava/lang/CharSequence;

    .line 28
    .line 29
    iput-object p0, v2, Lh/f;->h:Landroid/content/DialogInterface$OnClickListener;

    .line 30
    .line 31
    iget-object v1, p0, Lg0/p;->q0:Ljava/lang/CharSequence;

    .line 32
    .line 33
    iput-object v1, v2, Lh/f;->i:Ljava/lang/CharSequence;

    .line 34
    .line 35
    iput-object p0, v2, Lh/f;->j:Landroid/content/DialogInterface$OnClickListener;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroidx/fragment/app/r;->F()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    iget v1, p0, Lg0/p;->s0:I

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    if-nez v1, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    iget-object v4, p0, Landroidx/fragment/app/r;->O:Landroid/view/LayoutInflater;

    .line 47
    .line 48
    if-nez v4, :cond_1

    .line 49
    .line 50
    invoke-virtual {p0, v3}, Landroidx/fragment/app/m;->x(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    iput-object v4, p0, Landroidx/fragment/app/r;->O:Landroid/view/LayoutInflater;

    .line 55
    .line 56
    :cond_1
    invoke-virtual {v4, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    :goto_0
    if-eqz v3, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0, v3}, Lg0/p;->M(Landroid/view/View;)V

    .line 63
    .line 64
    .line 65
    iput-object v3, v2, Lh/f;->o:Landroid/view/View;

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    iget-object v1, p0, Lg0/p;->r0:Ljava/lang/CharSequence;

    .line 69
    .line 70
    iput-object v1, v2, Lh/f;->f:Ljava/lang/CharSequence;

    .line 71
    .line 72
    :goto_1
    invoke-virtual {p0, v0}, Lg0/p;->O(LK/j;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, LK/j;->a()Lh/i;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    instance-of v1, p0, Lg0/d;

    .line 80
    .line 81
    if-eqz v1, :cond_4

    .line 82
    .line 83
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 88
    .line 89
    const/16 v3, 0x1e

    .line 90
    .line 91
    if-lt v2, v3, :cond_3

    .line 92
    .line 93
    invoke-static {v1}, Lg0/o;->a(Landroid/view/Window;)V

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_3
    move-object v1, p0

    .line 98
    check-cast v1, Lg0/d;

    .line 99
    .line 100
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 101
    .line 102
    .line 103
    move-result-wide v2

    .line 104
    iput-wide v2, v1, Lg0/d;->y0:J

    .line 105
    .line 106
    invoke-virtual {v1}, Lg0/d;->P()V

    .line 107
    .line 108
    .line 109
    :cond_4
    :goto_2
    return-object v0
.end method

.method public final L()Landroidx/preference/DialogPreference;
    .locals 3

    .line 1
    iget-object v0, p0, Lg0/p;->n0:Landroidx/preference/DialogPreference;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/fragment/app/r;->k:Landroid/os/Bundle;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    const-string v1, "key"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-virtual {p0, v1}, Landroidx/fragment/app/r;->l(Z)Landroidx/fragment/app/r;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lg0/r;

    .line 21
    .line 22
    iget-object v1, v1, Lg0/r;->a0:Lg0/w;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object v1, v1, Lg0/w;->g:Landroidx/preference/PreferenceScreen;

    .line 29
    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {v1, v0}, Landroidx/preference/PreferenceGroup;->w(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    :goto_0
    check-cast v2, Landroidx/preference/DialogPreference;

    .line 38
    .line 39
    iput-object v2, p0, Lg0/p;->n0:Landroidx/preference/DialogPreference;

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v2, "Fragment "

    .line 47
    .line 48
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v2, " does not have any arguments."

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v0

    .line 67
    :cond_3
    :goto_1
    iget-object v0, p0, Lg0/p;->n0:Landroidx/preference/DialogPreference;

    .line 68
    .line 69
    return-object v0
.end method

.method public M(Landroid/view/View;)V
    .locals 2

    .line 1
    const v0, 0x102000b

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_2

    .line 9
    .line 10
    iget-object v0, p0, Lg0/p;->r0:Ljava/lang/CharSequence;

    .line 11
    .line 12
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    instance-of v1, p1, Landroid/widget/TextView;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    move-object v1, p1

    .line 23
    check-cast v1, Landroid/widget/TextView;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/16 v0, 0x8

    .line 31
    .line 32
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eq v1, v0, :cond_2

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 39
    .line 40
    .line 41
    :cond_2
    return-void
.end method

.method public abstract N(Z)V
.end method

.method public O(LK/j;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    iput p2, p0, Lg0/p;->u0:I

    .line 2
    .line 3
    return-void
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/m;->onDismiss(Landroid/content/DialogInterface;)V

    .line 2
    .line 3
    .line 4
    iget p1, p0, Lg0/p;->u0:I

    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    invoke-virtual {p0, p1}, Lg0/p;->N(Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public t(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/m;->t(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, v0}, Landroidx/fragment/app/r;->l(Z)Landroidx/fragment/app/r;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Lg0/r;

    .line 10
    .line 11
    if-eqz v1, :cond_7

    .line 12
    .line 13
    check-cast v0, Lg0/r;

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/fragment/app/r;->k:Landroid/os/Bundle;

    .line 16
    .line 17
    if-eqz v1, :cond_6

    .line 18
    .line 19
    const-string v2, "key"

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const/4 v2, 0x0

    .line 26
    if-nez p1, :cond_4

    .line 27
    .line 28
    iget-object p1, v0, Lg0/r;->a0:Lg0/w;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object p1, p1, Lg0/w;->g:Landroidx/preference/PreferenceScreen;

    .line 35
    .line 36
    if-nez p1, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-virtual {p1, v1}, Landroidx/preference/PreferenceGroup;->w(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :goto_0
    check-cast v0, Landroidx/preference/DialogPreference;

    .line 44
    .line 45
    iput-object v0, p0, Lg0/p;->n0:Landroidx/preference/DialogPreference;

    .line 46
    .line 47
    iget-object p1, v0, Landroidx/preference/DialogPreference;->M:Ljava/lang/CharSequence;

    .line 48
    .line 49
    iput-object p1, p0, Lg0/p;->o0:Ljava/lang/CharSequence;

    .line 50
    .line 51
    iget-object p1, v0, Landroidx/preference/DialogPreference;->P:Ljava/lang/String;

    .line 52
    .line 53
    iput-object p1, p0, Lg0/p;->p0:Ljava/lang/CharSequence;

    .line 54
    .line 55
    iget-object p1, v0, Landroidx/preference/DialogPreference;->Q:Ljava/lang/String;

    .line 56
    .line 57
    iput-object p1, p0, Lg0/p;->q0:Ljava/lang/CharSequence;

    .line 58
    .line 59
    iget-object p1, v0, Landroidx/preference/DialogPreference;->N:Ljava/lang/String;

    .line 60
    .line 61
    iput-object p1, p0, Lg0/p;->r0:Ljava/lang/CharSequence;

    .line 62
    .line 63
    iget p1, v0, Landroidx/preference/DialogPreference;->R:I

    .line 64
    .line 65
    iput p1, p0, Lg0/p;->s0:I

    .line 66
    .line 67
    iget-object p1, v0, Landroidx/preference/DialogPreference;->O:Landroid/graphics/drawable/Drawable;

    .line 68
    .line 69
    if-eqz p1, :cond_3

    .line 70
    .line 71
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 72
    .line 73
    if-eqz v0, :cond_2

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 85
    .line 86
    invoke-static {v0, v1, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    new-instance v1, Landroid/graphics/Canvas;

    .line 91
    .line 92
    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Landroid/graphics/Canvas;->getWidth()I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    invoke-virtual {v1}, Landroid/graphics/Canvas;->getHeight()I

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    invoke-virtual {p1, v2, v2, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 107
    .line 108
    .line 109
    new-instance p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 110
    .line 111
    invoke-virtual {p0}, Landroidx/fragment/app/r;->k()Landroid/content/res/Resources;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-direct {p1, v1, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 116
    .line 117
    .line 118
    iput-object p1, p0, Lg0/p;->t0:Landroid/graphics/drawable/BitmapDrawable;

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_3
    :goto_1
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 122
    .line 123
    iput-object p1, p0, Lg0/p;->t0:Landroid/graphics/drawable/BitmapDrawable;

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_4
    const-string v0, "PreferenceDialogFragment.title"

    .line 127
    .line 128
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    iput-object v0, p0, Lg0/p;->o0:Ljava/lang/CharSequence;

    .line 133
    .line 134
    const-string v0, "PreferenceDialogFragment.positiveText"

    .line 135
    .line 136
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    iput-object v0, p0, Lg0/p;->p0:Ljava/lang/CharSequence;

    .line 141
    .line 142
    const-string v0, "PreferenceDialogFragment.negativeText"

    .line 143
    .line 144
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    iput-object v0, p0, Lg0/p;->q0:Ljava/lang/CharSequence;

    .line 149
    .line 150
    const-string v0, "PreferenceDialogFragment.message"

    .line 151
    .line 152
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    iput-object v0, p0, Lg0/p;->r0:Ljava/lang/CharSequence;

    .line 157
    .line 158
    const-string v0, "PreferenceDialogFragment.layout"

    .line 159
    .line 160
    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    iput v0, p0, Lg0/p;->s0:I

    .line 165
    .line 166
    const-string v0, "PreferenceDialogFragment.icon"

    .line 167
    .line 168
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    check-cast p1, Landroid/graphics/Bitmap;

    .line 173
    .line 174
    if-eqz p1, :cond_5

    .line 175
    .line 176
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 177
    .line 178
    invoke-virtual {p0}, Landroidx/fragment/app/r;->k()Landroid/content/res/Resources;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-direct {v0, v1, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 183
    .line 184
    .line 185
    iput-object v0, p0, Lg0/p;->t0:Landroid/graphics/drawable/BitmapDrawable;

    .line 186
    .line 187
    :cond_5
    :goto_2
    return-void

    .line 188
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 189
    .line 190
    new-instance v0, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    const-string v1, "Fragment "

    .line 193
    .line 194
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    const-string v1, " does not have any arguments."

    .line 201
    .line 202
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw p1

    .line 213
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 214
    .line 215
    const-string v0, "Target fragment must implement TargetFragment interface"

    .line 216
    .line 217
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    throw p1
.end method

.method public y(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/m;->y(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "PreferenceDialogFragment.title"

    .line 5
    .line 6
    iget-object v1, p0, Lg0/p;->o0:Ljava/lang/CharSequence;

    .line 7
    .line 8
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "PreferenceDialogFragment.positiveText"

    .line 12
    .line 13
    iget-object v1, p0, Lg0/p;->p0:Ljava/lang/CharSequence;

    .line 14
    .line 15
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    const-string v0, "PreferenceDialogFragment.negativeText"

    .line 19
    .line 20
    iget-object v1, p0, Lg0/p;->q0:Ljava/lang/CharSequence;

    .line 21
    .line 22
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    const-string v0, "PreferenceDialogFragment.message"

    .line 26
    .line 27
    iget-object v1, p0, Lg0/p;->r0:Ljava/lang/CharSequence;

    .line 28
    .line 29
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    const-string v0, "PreferenceDialogFragment.layout"

    .line 33
    .line 34
    iget v1, p0, Lg0/p;->s0:I

    .line 35
    .line 36
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lg0/p;->t0:Landroid/graphics/drawable/BitmapDrawable;

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    const-string v1, "PreferenceDialogFragment.icon"

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void
.end method
