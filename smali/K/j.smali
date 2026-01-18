.class public final LK/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO/u;


# instance fields
.field public f:I

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xa

    .line 2
    new-array v0, v0, [I

    iput-object v0, p0, LK/j;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(I[LK/k;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput p1, p0, LK/j;->f:I

    .line 10
    iput-object p2, p0, LK/j;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    const/4 v0, 0x0

    .line 3
    invoke-static {p1, v0}, Lh/i;->h(Landroid/content/Context;I)I

    move-result v0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v1, Lh/f;

    new-instance v2, Landroid/view/ContextThemeWrapper;

    .line 6
    invoke-static {p1, v0}, Lh/i;->h(Landroid/content/Context;I)I

    move-result v3

    invoke-direct {v2, p1, v3}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    invoke-direct {v1, v2}, Lh/f;-><init>(Landroid/view/ContextThemeWrapper;)V

    iput-object v1, p0, LK/j;->g:Ljava/lang/Object;

    .line 7
    iput v0, p0, LK/j;->f:I

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;I)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK/j;->g:Ljava/lang/Object;

    iput p2, p0, LK/j;->f:I

    return-void
.end method


# virtual methods
.method public a()Lh/i;
    .locals 14

    .line 1
    new-instance v0, Lh/i;

    .line 2
    .line 3
    iget-object v1, p0, LK/j;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lh/f;

    .line 6
    .line 7
    iget-object v2, v1, Lh/f;->a:Landroid/view/ContextThemeWrapper;

    .line 8
    .line 9
    iget v3, p0, LK/j;->f:I

    .line 10
    .line 11
    invoke-direct {v0, v2, v3}, Lh/i;-><init>(Landroid/view/ContextThemeWrapper;I)V

    .line 12
    .line 13
    .line 14
    iget-object v2, v1, Lh/f;->e:Landroid/view/View;

    .line 15
    .line 16
    iget-object v8, v0, Lh/i;->k:Lh/h;

    .line 17
    .line 18
    const/4 v9, 0x0

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    iput-object v2, v8, Lh/h;->w:Landroid/view/View;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v2, v1, Lh/f;->d:Ljava/lang/CharSequence;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    iput-object v2, v8, Lh/h;->d:Ljava/lang/CharSequence;

    .line 29
    .line 30
    iget-object v3, v8, Lh/h;->u:Landroid/widget/TextView;

    .line 31
    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object v2, v1, Lh/f;->c:Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    iput-object v2, v8, Lh/h;->s:Landroid/graphics/drawable/Drawable;

    .line 42
    .line 43
    iget-object v3, v8, Lh/h;->t:Landroid/widget/ImageView;

    .line 44
    .line 45
    if-eqz v3, :cond_2

    .line 46
    .line 47
    invoke-virtual {v3, v9}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    iget-object v3, v8, Lh/h;->t:Landroid/widget/ImageView;

    .line 51
    .line 52
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    :goto_0
    iget-object v2, v1, Lh/f;->f:Ljava/lang/CharSequence;

    .line 56
    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    iput-object v2, v8, Lh/h;->e:Ljava/lang/CharSequence;

    .line 60
    .line 61
    iget-object v3, v8, Lh/h;->v:Landroid/widget/TextView;

    .line 62
    .line 63
    if-eqz v3, :cond_3

    .line 64
    .line 65
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    .line 67
    .line 68
    :cond_3
    iget-object v2, v1, Lh/f;->g:Ljava/lang/CharSequence;

    .line 69
    .line 70
    if-nez v2, :cond_4

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    iget-object v3, v1, Lh/f;->h:Landroid/content/DialogInterface$OnClickListener;

    .line 74
    .line 75
    const/4 v4, -0x1

    .line 76
    invoke-virtual {v8, v4, v2, v3}, Lh/h;->d(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 77
    .line 78
    .line 79
    :goto_1
    iget-object v2, v1, Lh/f;->i:Ljava/lang/CharSequence;

    .line 80
    .line 81
    if-nez v2, :cond_5

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_5
    iget-object v3, v1, Lh/f;->j:Landroid/content/DialogInterface$OnClickListener;

    .line 85
    .line 86
    const/4 v4, -0x2

    .line 87
    invoke-virtual {v8, v4, v2, v3}, Lh/h;->d(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 88
    .line 89
    .line 90
    :goto_2
    iget-object v2, v1, Lh/f;->l:[Ljava/lang/CharSequence;

    .line 91
    .line 92
    const/4 v10, 0x1

    .line 93
    const/4 v11, 0x0

    .line 94
    if-nez v2, :cond_6

    .line 95
    .line 96
    iget-object v2, v1, Lh/f;->m:Ljava/lang/Object;

    .line 97
    .line 98
    if-eqz v2, :cond_e

    .line 99
    .line 100
    :cond_6
    iget v2, v8, Lh/h;->A:I

    .line 101
    .line 102
    iget-object v3, v1, Lh/f;->b:Landroid/view/LayoutInflater;

    .line 103
    .line 104
    invoke-virtual {v3, v2, v11}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    move-object v12, v2

    .line 109
    check-cast v12, Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 110
    .line 111
    iget-boolean v2, v1, Lh/f;->q:Z

    .line 112
    .line 113
    iget-object v4, v1, Lh/f;->a:Landroid/view/ContextThemeWrapper;

    .line 114
    .line 115
    if-eqz v2, :cond_7

    .line 116
    .line 117
    new-instance v13, Lh/c;

    .line 118
    .line 119
    iget-object v6, v1, Lh/f;->l:[Ljava/lang/CharSequence;

    .line 120
    .line 121
    iget v5, v8, Lh/h;->B:I

    .line 122
    .line 123
    move-object v2, v13

    .line 124
    move-object v3, v1

    .line 125
    move-object v7, v12

    .line 126
    invoke-direct/range {v2 .. v7}, Lh/c;-><init>(Lh/f;Landroid/view/ContextThemeWrapper;I[Ljava/lang/CharSequence;Landroidx/appcompat/app/AlertController$RecycleListView;)V

    .line 127
    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_7
    iget-boolean v2, v1, Lh/f;->r:Z

    .line 131
    .line 132
    if-eqz v2, :cond_8

    .line 133
    .line 134
    iget v2, v8, Lh/h;->C:I

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_8
    iget v2, v8, Lh/h;->D:I

    .line 138
    .line 139
    :goto_3
    iget-object v13, v1, Lh/f;->m:Ljava/lang/Object;

    .line 140
    .line 141
    if-eqz v13, :cond_9

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_9
    new-instance v13, Lh/g;

    .line 145
    .line 146
    iget-object v3, v1, Lh/f;->l:[Ljava/lang/CharSequence;

    .line 147
    .line 148
    const v5, 0x1020014

    .line 149
    .line 150
    .line 151
    invoke-direct {v13, v4, v2, v5, v3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :goto_4
    iput-object v13, v8, Lh/h;->x:Landroid/widget/ListAdapter;

    .line 155
    .line 156
    iget v2, v1, Lh/f;->s:I

    .line 157
    .line 158
    iput v2, v8, Lh/h;->y:I

    .line 159
    .line 160
    iget-object v2, v1, Lh/f;->n:Landroid/content/DialogInterface$OnClickListener;

    .line 161
    .line 162
    if-eqz v2, :cond_a

    .line 163
    .line 164
    new-instance v2, Lh/d;

    .line 165
    .line 166
    invoke-direct {v2, v1, v8}, Lh/d;-><init>(Lh/f;Lh/h;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v12, v2}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 170
    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_a
    iget-object v2, v1, Lh/f;->t:Lg0/j;

    .line 174
    .line 175
    if-eqz v2, :cond_b

    .line 176
    .line 177
    new-instance v2, Lh/e;

    .line 178
    .line 179
    invoke-direct {v2, v1, v12, v8}, Lh/e;-><init>(Lh/f;Landroidx/appcompat/app/AlertController$RecycleListView;Lh/h;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v12, v2}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 183
    .line 184
    .line 185
    :cond_b
    :goto_5
    iget-boolean v2, v1, Lh/f;->r:Z

    .line 186
    .line 187
    if-eqz v2, :cond_c

    .line 188
    .line 189
    invoke-virtual {v12, v10}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    .line 190
    .line 191
    .line 192
    goto :goto_6

    .line 193
    :cond_c
    iget-boolean v2, v1, Lh/f;->q:Z

    .line 194
    .line 195
    if-eqz v2, :cond_d

    .line 196
    .line 197
    const/4 v2, 0x2

    .line 198
    invoke-virtual {v12, v2}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    .line 199
    .line 200
    .line 201
    :cond_d
    :goto_6
    iput-object v12, v8, Lh/h;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 202
    .line 203
    :cond_e
    iget-object v2, v1, Lh/f;->o:Landroid/view/View;

    .line 204
    .line 205
    if-eqz v2, :cond_f

    .line 206
    .line 207
    iput-object v2, v8, Lh/h;->g:Landroid/view/View;

    .line 208
    .line 209
    iput-boolean v9, v8, Lh/h;->h:Z

    .line 210
    .line 211
    :cond_f
    invoke-virtual {v0, v10}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0, v10}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0, v11}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0, v11}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 221
    .line 222
    .line 223
    iget-object v1, v1, Lh/f;->k:Ln/m;

    .line 224
    .line 225
    if-eqz v1, :cond_10

    .line 226
    .line 227
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 228
    .line 229
    .line 230
    :cond_10
    return-object v0
.end method

.method public b()I
    .locals 2

    .line 1
    iget v0, p0, LK/j;->f:I

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0x80

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LK/j;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, [I

    .line 10
    .line 11
    const/4 v1, 0x7

    .line 12
    aget v0, v0, v1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const v0, 0xffff

    .line 16
    .line 17
    .line 18
    :goto_0
    return v0
.end method

.method public c(Landroid/view/View;)Z
    .locals 1

    .line 1
    iget-object p1, p0, LK/j;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 4
    .line 5
    iget v0, p0, LK/j;->f:I

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->B(I)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    return p1
.end method

.method public d(II)V
    .locals 3

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, LK/j;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, [I

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    if-lt p1, v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x1

    .line 12
    shl-int/2addr v1, p1

    .line 13
    iget v2, p0, LK/j;->f:I

    .line 14
    .line 15
    or-int/2addr v1, v2

    .line 16
    iput v1, p0, LK/j;->f:I

    .line 17
    .line 18
    aput p2, v0, p1

    .line 19
    .line 20
    :cond_1
    :goto_0
    return-void
.end method
