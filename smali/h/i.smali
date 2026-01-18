.class public final Lh/i;
.super Landroidx/activity/o;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface;
.implements Lh/m;


# instance fields
.field public i:Lh/D;

.field public final j:Lh/E;

.field public final k:Lh/h;


# direct methods
.method public constructor <init>(Landroid/view/ContextThemeWrapper;I)V
    .locals 4

    .line 1
    invoke-static {p1, p2}, Lh/i;->h(Landroid/content/Context;I)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x1

    .line 6
    const v1, 0x7f04018c

    .line 7
    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    new-instance v2, Landroid/util/TypedValue;

    .line 12
    .line 13
    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v3, v1, v2, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 21
    .line 22
    .line 23
    iget v2, v2, Landroid/util/TypedValue;->resourceId:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v2, p2

    .line 27
    :goto_0
    invoke-direct {p0, p1, v2}, Landroidx/activity/o;-><init>(Landroid/content/Context;I)V

    .line 28
    .line 29
    .line 30
    new-instance v2, Lh/E;

    .line 31
    .line 32
    invoke-direct {v2, p0}, Lh/E;-><init>(Lh/i;)V

    .line 33
    .line 34
    .line 35
    iput-object v2, p0, Lh/i;->j:Lh/E;

    .line 36
    .line 37
    invoke-virtual {p0}, Lh/i;->f()Lh/s;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    if-nez p2, :cond_1

    .line 42
    .line 43
    new-instance p2, Landroid/util/TypedValue;

    .line 44
    .line 45
    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p1, v1, p2, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 53
    .line 54
    .line 55
    iget p2, p2, Landroid/util/TypedValue;->resourceId:I

    .line 56
    .line 57
    :cond_1
    move-object p1, v2

    .line 58
    check-cast p1, Lh/D;

    .line 59
    .line 60
    iput p2, p1, Lh/D;->Z:I

    .line 61
    .line 62
    invoke-virtual {v2}, Lh/s;->b()V

    .line 63
    .line 64
    .line 65
    new-instance p1, Lh/h;

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-direct {p1, p2, p0, v0}, Lh/h;-><init>(Landroid/content/Context;Lh/i;Landroid/view/Window;)V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Lh/i;->k:Lh/h;

    .line 79
    .line 80
    return-void
.end method

.method public static h(Landroid/content/Context;I)I
    .locals 2

    .line 1
    ushr-int/lit8 v0, p1, 0x18

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0xff

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    return p1

    .line 9
    :cond_0
    new-instance p1, Landroid/util/TypedValue;

    .line 10
    .line 11
    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const v0, 0x7f04002f

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0, p1, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 22
    .line 23
    .line 24
    iget p0, p1, Landroid/util/TypedValue;->resourceId:I

    .line 25
    .line 26
    return p0
.end method


# virtual methods
.method public final addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/activity/o;->e()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/i;->f()Lh/s;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lh/D;

    .line 9
    .line 10
    invoke-virtual {v0}, Lh/D;->u()V

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, Lh/D;->G:Landroid/view/ViewGroup;

    .line 14
    .line 15
    const v2, 0x1020002

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Landroid/view/ViewGroup;

    .line 23
    .line 24
    invoke-virtual {v1, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, v0, Lh/D;->r:Lh/z;

    .line 28
    .line 29
    iget-object p2, v0, Lh/D;->q:Landroid/view/Window;

    .line 30
    .line 31
    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p1, p2}, Lh/z;->a(Landroid/view/Window$Callback;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final dismiss()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/i;->f()Lh/s;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lh/s;->c()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lh/i;->j:Lh/E;

    .line 10
    .line 11
    invoke-static {v1, v0, p0, p1}, Lp0/a;->C(LN/k;Landroid/view/View;Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public final f()Lh/s;
    .locals 3

    .line 1
    iget-object v0, p0, Lh/i;->i:Lh/D;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/s;->f:Lh/q;

    .line 6
    .line 7
    new-instance v0, Lh/D;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {v0, v1, v2, p0, p0}, Lh/D;-><init>(Landroid/content/Context;Landroid/view/Window;Lh/m;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lh/i;->i:Lh/D;

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lh/i;->i:Lh/D;

    .line 23
    .line 24
    return-object v0
.end method

.method public final findViewById(I)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh/i;->f()Lh/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lh/D;

    .line 6
    .line 7
    invoke-virtual {v0}, Lh/D;->u()V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Lh/D;->q:Landroid/view/Window;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final g(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lh/i;->f()Lh/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lh/D;

    .line 6
    .line 7
    iget-object v1, v0, Lh/D;->p:Landroid/content/Context;

    .line 8
    .line 9
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v1}, Landroid/view/LayoutInflater;->getFactory2()Landroid/view/LayoutInflater$Factory2;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    instance-of v0, v0, Lh/D;

    .line 28
    .line 29
    :goto_0
    invoke-super {p0, p1}, Landroidx/activity/o;->onCreate(Landroid/os/Bundle;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lh/i;->f()Lh/s;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Lh/s;->b()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final i(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/i;->f()Lh/s;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p1}, Lh/s;->k(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final invalidateOptionsMenu()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh/i;->f()Lh/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lh/D;

    .line 6
    .line 7
    iget-object v1, v0, Lh/D;->t:Lh/N;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lh/D;->z()V

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, Lh/D;->t:Lh/N;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1}, Lh/D;->A(I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final j(Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 18

    .line 1
    const/4 v2, 0x0

    .line 2
    invoke-virtual/range {p0 .. p1}, Lh/i;->g(Landroid/os/Bundle;)V

    .line 3
    .line 4
    .line 5
    move-object/from16 v4, p0

    .line 6
    .line 7
    iget-object v5, v4, Lh/i;->k:Lh/h;

    .line 8
    .line 9
    iget-object v6, v5, Lh/h;->b:Lh/i;

    .line 10
    .line 11
    iget v7, v5, Lh/h;->z:I

    .line 12
    .line 13
    invoke-virtual {v6, v7}, Lh/i;->setContentView(I)V

    .line 14
    .line 15
    .line 16
    iget-object v6, v5, Lh/h;->c:Landroid/view/Window;

    .line 17
    .line 18
    const v7, 0x7f090170

    .line 19
    .line 20
    .line 21
    invoke-virtual {v6, v7}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    const v8, 0x7f0901f9

    .line 26
    .line 27
    .line 28
    invoke-virtual {v7, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v9

    .line 32
    const v10, 0x7f09008a

    .line 33
    .line 34
    .line 35
    invoke-virtual {v7, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v11

    .line 39
    const v12, 0x7f09006d

    .line 40
    .line 41
    .line 42
    invoke-virtual {v7, v12}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v13

    .line 46
    const v14, 0x7f090095

    .line 47
    .line 48
    .line 49
    invoke-virtual {v7, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    check-cast v7, Landroid/view/ViewGroup;

    .line 54
    .line 55
    iget-object v14, v5, Lh/h;->g:Landroid/view/View;

    .line 56
    .line 57
    if-eqz v14, :cond_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    const/4 v14, 0x0

    .line 61
    :goto_0
    if-eqz v14, :cond_1

    .line 62
    .line 63
    const/16 v16, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    const/16 v16, 0x0

    .line 67
    .line 68
    :goto_1
    if-eqz v16, :cond_2

    .line 69
    .line 70
    invoke-static {v14}, Lh/h;->a(Landroid/view/View;)Z

    .line 71
    .line 72
    .line 73
    move-result v17

    .line 74
    if-nez v17, :cond_3

    .line 75
    .line 76
    :cond_2
    const/high16 v15, 0x20000

    .line 77
    .line 78
    invoke-virtual {v6, v15, v15}, Landroid/view/Window;->setFlags(II)V

    .line 79
    .line 80
    .line 81
    :cond_3
    const/4 v15, -0x1

    .line 82
    const/16 v3, 0x8

    .line 83
    .line 84
    if-eqz v16, :cond_5

    .line 85
    .line 86
    const v0, 0x7f090094

    .line 87
    .line 88
    .line 89
    invoke-virtual {v6, v0}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, Landroid/widget/FrameLayout;

    .line 94
    .line 95
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    .line 96
    .line 97
    invoke-direct {v1, v15, v15}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v14, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 101
    .line 102
    .line 103
    iget-boolean v1, v5, Lh/h;->h:Z

    .line 104
    .line 105
    if-eqz v1, :cond_4

    .line 106
    .line 107
    invoke-virtual {v0, v2, v2, v2, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 108
    .line 109
    .line 110
    :cond_4
    iget-object v0, v5, Lh/h;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 111
    .line 112
    if-eqz v0, :cond_6

    .line 113
    .line 114
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    check-cast v0, Lo/z0;

    .line 119
    .line 120
    const/4 v1, 0x0

    .line 121
    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_5
    invoke-virtual {v7, v3}, Landroid/view/View;->setVisibility(I)V

    .line 125
    .line 126
    .line 127
    :cond_6
    :goto_2
    invoke-virtual {v7, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v7, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {v7, v12}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    invoke-static {v0, v9}, Lh/h;->c(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-static {v1, v11}, Lh/h;->c(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-static {v8, v13}, Lh/h;->c(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    .line 148
    .line 149
    .line 150
    move-result-object v8

    .line 151
    const v9, 0x7f090197

    .line 152
    .line 153
    .line 154
    invoke-virtual {v6, v9}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    check-cast v9, Landroidx/core/widget/NestedScrollView;

    .line 159
    .line 160
    iput-object v9, v5, Lh/h;->r:Landroidx/core/widget/NestedScrollView;

    .line 161
    .line 162
    invoke-virtual {v9, v2}, Landroid/view/View;->setFocusable(Z)V

    .line 163
    .line 164
    .line 165
    iget-object v9, v5, Lh/h;->r:Landroidx/core/widget/NestedScrollView;

    .line 166
    .line 167
    invoke-virtual {v9, v2}, Landroidx/core/widget/NestedScrollView;->setNestedScrollingEnabled(Z)V

    .line 168
    .line 169
    .line 170
    const v9, 0x102000b

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 174
    .line 175
    .line 176
    move-result-object v9

    .line 177
    check-cast v9, Landroid/widget/TextView;

    .line 178
    .line 179
    iput-object v9, v5, Lh/h;->v:Landroid/widget/TextView;

    .line 180
    .line 181
    if-nez v9, :cond_7

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_7
    iget-object v10, v5, Lh/h;->e:Ljava/lang/CharSequence;

    .line 185
    .line 186
    if-eqz v10, :cond_8

    .line 187
    .line 188
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 189
    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_8
    invoke-virtual {v9, v3}, Landroid/view/View;->setVisibility(I)V

    .line 193
    .line 194
    .line 195
    iget-object v9, v5, Lh/h;->r:Landroidx/core/widget/NestedScrollView;

    .line 196
    .line 197
    iget-object v10, v5, Lh/h;->v:Landroid/widget/TextView;

    .line 198
    .line 199
    invoke-virtual {v9, v10}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 200
    .line 201
    .line 202
    iget-object v9, v5, Lh/h;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 203
    .line 204
    if-eqz v9, :cond_9

    .line 205
    .line 206
    iget-object v9, v5, Lh/h;->r:Landroidx/core/widget/NestedScrollView;

    .line 207
    .line 208
    invoke-virtual {v9}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 209
    .line 210
    .line 211
    move-result-object v9

    .line 212
    check-cast v9, Landroid/view/ViewGroup;

    .line 213
    .line 214
    iget-object v10, v5, Lh/h;->r:Landroidx/core/widget/NestedScrollView;

    .line 215
    .line 216
    invoke-virtual {v9, v10}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 217
    .line 218
    .line 219
    move-result v10

    .line 220
    invoke-virtual {v9, v10}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 221
    .line 222
    .line 223
    iget-object v11, v5, Lh/h;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 224
    .line 225
    new-instance v12, Landroid/view/ViewGroup$LayoutParams;

    .line 226
    .line 227
    invoke-direct {v12, v15, v15}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v9, v11, v10, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 231
    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_9
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 235
    .line 236
    .line 237
    :goto_3
    const v9, 0x1020019

    .line 238
    .line 239
    .line 240
    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 241
    .line 242
    .line 243
    move-result-object v9

    .line 244
    check-cast v9, Landroid/widget/Button;

    .line 245
    .line 246
    iput-object v9, v5, Lh/h;->i:Landroid/widget/Button;

    .line 247
    .line 248
    iget-object v10, v5, Lh/h;->G:LR0/i;

    .line 249
    .line 250
    invoke-virtual {v9, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 251
    .line 252
    .line 253
    iget-object v9, v5, Lh/h;->j:Ljava/lang/CharSequence;

    .line 254
    .line 255
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 256
    .line 257
    .line 258
    move-result v9

    .line 259
    if-eqz v9, :cond_a

    .line 260
    .line 261
    iget-object v9, v5, Lh/h;->i:Landroid/widget/Button;

    .line 262
    .line 263
    invoke-virtual {v9, v3}, Landroid/view/View;->setVisibility(I)V

    .line 264
    .line 265
    .line 266
    const/4 v9, 0x0

    .line 267
    goto :goto_4

    .line 268
    :cond_a
    iget-object v9, v5, Lh/h;->i:Landroid/widget/Button;

    .line 269
    .line 270
    iget-object v11, v5, Lh/h;->j:Ljava/lang/CharSequence;

    .line 271
    .line 272
    invoke-virtual {v9, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 273
    .line 274
    .line 275
    iget-object v9, v5, Lh/h;->i:Landroid/widget/Button;

    .line 276
    .line 277
    invoke-virtual {v9, v2}, Landroid/view/View;->setVisibility(I)V

    .line 278
    .line 279
    .line 280
    const/4 v9, 0x1

    .line 281
    :goto_4
    const v11, 0x102001a

    .line 282
    .line 283
    .line 284
    invoke-virtual {v8, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 285
    .line 286
    .line 287
    move-result-object v11

    .line 288
    check-cast v11, Landroid/widget/Button;

    .line 289
    .line 290
    iput-object v11, v5, Lh/h;->l:Landroid/widget/Button;

    .line 291
    .line 292
    invoke-virtual {v11, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 293
    .line 294
    .line 295
    iget-object v11, v5, Lh/h;->m:Ljava/lang/CharSequence;

    .line 296
    .line 297
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 298
    .line 299
    .line 300
    move-result v11

    .line 301
    if-eqz v11, :cond_b

    .line 302
    .line 303
    iget-object v11, v5, Lh/h;->l:Landroid/widget/Button;

    .line 304
    .line 305
    invoke-virtual {v11, v3}, Landroid/view/View;->setVisibility(I)V

    .line 306
    .line 307
    .line 308
    goto :goto_5

    .line 309
    :cond_b
    iget-object v11, v5, Lh/h;->l:Landroid/widget/Button;

    .line 310
    .line 311
    iget-object v12, v5, Lh/h;->m:Ljava/lang/CharSequence;

    .line 312
    .line 313
    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 314
    .line 315
    .line 316
    iget-object v11, v5, Lh/h;->l:Landroid/widget/Button;

    .line 317
    .line 318
    invoke-virtual {v11, v2}, Landroid/view/View;->setVisibility(I)V

    .line 319
    .line 320
    .line 321
    const/4 v11, 0x2

    .line 322
    or-int/2addr v9, v11

    .line 323
    :goto_5
    const v11, 0x102001b

    .line 324
    .line 325
    .line 326
    invoke-virtual {v8, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 327
    .line 328
    .line 329
    move-result-object v11

    .line 330
    check-cast v11, Landroid/widget/Button;

    .line 331
    .line 332
    iput-object v11, v5, Lh/h;->o:Landroid/widget/Button;

    .line 333
    .line 334
    invoke-virtual {v11, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 335
    .line 336
    .line 337
    iget-object v10, v5, Lh/h;->p:Ljava/lang/CharSequence;

    .line 338
    .line 339
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 340
    .line 341
    .line 342
    move-result v10

    .line 343
    if-eqz v10, :cond_c

    .line 344
    .line 345
    iget-object v10, v5, Lh/h;->o:Landroid/widget/Button;

    .line 346
    .line 347
    invoke-virtual {v10, v3}, Landroid/view/View;->setVisibility(I)V

    .line 348
    .line 349
    .line 350
    goto :goto_6

    .line 351
    :cond_c
    iget-object v10, v5, Lh/h;->o:Landroid/widget/Button;

    .line 352
    .line 353
    iget-object v11, v5, Lh/h;->p:Ljava/lang/CharSequence;

    .line 354
    .line 355
    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 356
    .line 357
    .line 358
    iget-object v10, v5, Lh/h;->o:Landroid/widget/Button;

    .line 359
    .line 360
    invoke-virtual {v10, v2}, Landroid/view/View;->setVisibility(I)V

    .line 361
    .line 362
    .line 363
    const/4 v10, 0x4

    .line 364
    or-int/2addr v9, v10

    .line 365
    :goto_6
    new-instance v10, Landroid/util/TypedValue;

    .line 366
    .line 367
    invoke-direct {v10}, Landroid/util/TypedValue;-><init>()V

    .line 368
    .line 369
    .line 370
    iget-object v11, v5, Lh/h;->a:Landroid/content/Context;

    .line 371
    .line 372
    invoke-virtual {v11}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 373
    .line 374
    .line 375
    move-result-object v11

    .line 376
    const v12, 0x7f04002d

    .line 377
    .line 378
    .line 379
    const/4 v13, 0x1

    .line 380
    invoke-virtual {v11, v12, v10, v13}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 381
    .line 382
    .line 383
    iget v10, v10, Landroid/util/TypedValue;->data:I

    .line 384
    .line 385
    if-eqz v10, :cond_f

    .line 386
    .line 387
    const/high16 v10, 0x3f000000    # 0.5f

    .line 388
    .line 389
    if-ne v9, v13, :cond_d

    .line 390
    .line 391
    iget-object v11, v5, Lh/h;->i:Landroid/widget/Button;

    .line 392
    .line 393
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 394
    .line 395
    .line 396
    move-result-object v12

    .line 397
    check-cast v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 398
    .line 399
    iput v13, v12, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 400
    .line 401
    iput v10, v12, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 402
    .line 403
    invoke-virtual {v11, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 404
    .line 405
    .line 406
    goto :goto_7

    .line 407
    :cond_d
    const/4 v11, 0x2

    .line 408
    if-ne v9, v11, :cond_e

    .line 409
    .line 410
    iget-object v11, v5, Lh/h;->l:Landroid/widget/Button;

    .line 411
    .line 412
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 413
    .line 414
    .line 415
    move-result-object v12

    .line 416
    check-cast v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 417
    .line 418
    iput v13, v12, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 419
    .line 420
    iput v10, v12, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 421
    .line 422
    invoke-virtual {v11, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 423
    .line 424
    .line 425
    goto :goto_7

    .line 426
    :cond_e
    const/4 v11, 0x4

    .line 427
    if-ne v9, v11, :cond_f

    .line 428
    .line 429
    iget-object v11, v5, Lh/h;->o:Landroid/widget/Button;

    .line 430
    .line 431
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 432
    .line 433
    .line 434
    move-result-object v12

    .line 435
    check-cast v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 436
    .line 437
    iput v13, v12, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 438
    .line 439
    iput v10, v12, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 440
    .line 441
    invoke-virtual {v11, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 442
    .line 443
    .line 444
    :cond_f
    :goto_7
    if-eqz v9, :cond_10

    .line 445
    .line 446
    goto :goto_8

    .line 447
    :cond_10
    invoke-virtual {v8, v3}, Landroid/view/View;->setVisibility(I)V

    .line 448
    .line 449
    .line 450
    :goto_8
    iget-object v9, v5, Lh/h;->w:Landroid/view/View;

    .line 451
    .line 452
    const v10, 0x7f0901f5

    .line 453
    .line 454
    .line 455
    if-eqz v9, :cond_11

    .line 456
    .line 457
    new-instance v9, Landroid/view/ViewGroup$LayoutParams;

    .line 458
    .line 459
    const/4 v11, -0x2

    .line 460
    invoke-direct {v9, v15, v11}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 461
    .line 462
    .line 463
    iget-object v11, v5, Lh/h;->w:Landroid/view/View;

    .line 464
    .line 465
    invoke-virtual {v0, v11, v2, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v6, v10}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 469
    .line 470
    .line 471
    move-result-object v9

    .line 472
    invoke-virtual {v9, v3}, Landroid/view/View;->setVisibility(I)V

    .line 473
    .line 474
    .line 475
    goto :goto_9

    .line 476
    :cond_11
    const v9, 0x1020006

    .line 477
    .line 478
    .line 479
    invoke-virtual {v6, v9}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 480
    .line 481
    .line 482
    move-result-object v9

    .line 483
    check-cast v9, Landroid/widget/ImageView;

    .line 484
    .line 485
    iput-object v9, v5, Lh/h;->t:Landroid/widget/ImageView;

    .line 486
    .line 487
    iget-object v9, v5, Lh/h;->d:Ljava/lang/CharSequence;

    .line 488
    .line 489
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 490
    .line 491
    .line 492
    move-result v9

    .line 493
    if-nez v9, :cond_13

    .line 494
    .line 495
    iget-boolean v9, v5, Lh/h;->E:Z

    .line 496
    .line 497
    if-eqz v9, :cond_13

    .line 498
    .line 499
    const v9, 0x7f090049

    .line 500
    .line 501
    .line 502
    invoke-virtual {v6, v9}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 503
    .line 504
    .line 505
    move-result-object v9

    .line 506
    check-cast v9, Landroid/widget/TextView;

    .line 507
    .line 508
    iput-object v9, v5, Lh/h;->u:Landroid/widget/TextView;

    .line 509
    .line 510
    iget-object v10, v5, Lh/h;->d:Ljava/lang/CharSequence;

    .line 511
    .line 512
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 513
    .line 514
    .line 515
    iget-object v9, v5, Lh/h;->s:Landroid/graphics/drawable/Drawable;

    .line 516
    .line 517
    if-eqz v9, :cond_12

    .line 518
    .line 519
    iget-object v10, v5, Lh/h;->t:Landroid/widget/ImageView;

    .line 520
    .line 521
    invoke-virtual {v10, v9}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 522
    .line 523
    .line 524
    goto :goto_9

    .line 525
    :cond_12
    iget-object v9, v5, Lh/h;->u:Landroid/widget/TextView;

    .line 526
    .line 527
    iget-object v10, v5, Lh/h;->t:Landroid/widget/ImageView;

    .line 528
    .line 529
    invoke-virtual {v10}, Landroid/view/View;->getPaddingLeft()I

    .line 530
    .line 531
    .line 532
    move-result v10

    .line 533
    iget-object v11, v5, Lh/h;->t:Landroid/widget/ImageView;

    .line 534
    .line 535
    invoke-virtual {v11}, Landroid/view/View;->getPaddingTop()I

    .line 536
    .line 537
    .line 538
    move-result v11

    .line 539
    iget-object v12, v5, Lh/h;->t:Landroid/widget/ImageView;

    .line 540
    .line 541
    invoke-virtual {v12}, Landroid/view/View;->getPaddingRight()I

    .line 542
    .line 543
    .line 544
    move-result v12

    .line 545
    iget-object v13, v5, Lh/h;->t:Landroid/widget/ImageView;

    .line 546
    .line 547
    invoke-virtual {v13}, Landroid/view/View;->getPaddingBottom()I

    .line 548
    .line 549
    .line 550
    move-result v13

    .line 551
    invoke-virtual {v9, v10, v11, v12, v13}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 552
    .line 553
    .line 554
    iget-object v9, v5, Lh/h;->t:Landroid/widget/ImageView;

    .line 555
    .line 556
    invoke-virtual {v9, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 557
    .line 558
    .line 559
    goto :goto_9

    .line 560
    :cond_13
    invoke-virtual {v6, v10}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 561
    .line 562
    .line 563
    move-result-object v9

    .line 564
    invoke-virtual {v9, v3}, Landroid/view/View;->setVisibility(I)V

    .line 565
    .line 566
    .line 567
    iget-object v9, v5, Lh/h;->t:Landroid/widget/ImageView;

    .line 568
    .line 569
    invoke-virtual {v9, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 573
    .line 574
    .line 575
    :goto_9
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 576
    .line 577
    .line 578
    move-result v7

    .line 579
    if-eq v7, v3, :cond_14

    .line 580
    .line 581
    const/4 v7, 0x1

    .line 582
    goto :goto_a

    .line 583
    :cond_14
    const/4 v7, 0x0

    .line 584
    :goto_a
    if-eqz v0, :cond_15

    .line 585
    .line 586
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 587
    .line 588
    .line 589
    move-result v9

    .line 590
    if-eq v9, v3, :cond_15

    .line 591
    .line 592
    const/4 v9, 0x1

    .line 593
    goto :goto_b

    .line 594
    :cond_15
    const/4 v9, 0x0

    .line 595
    :goto_b
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    .line 596
    .line 597
    .line 598
    move-result v8

    .line 599
    if-eq v8, v3, :cond_16

    .line 600
    .line 601
    const/4 v3, 0x1

    .line 602
    goto :goto_c

    .line 603
    :cond_16
    const/4 v3, 0x0

    .line 604
    :goto_c
    if-nez v3, :cond_17

    .line 605
    .line 606
    const v8, 0x7f0901e5

    .line 607
    .line 608
    .line 609
    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 610
    .line 611
    .line 612
    move-result-object v8

    .line 613
    if-eqz v8, :cond_17

    .line 614
    .line 615
    invoke-virtual {v8, v2}, Landroid/view/View;->setVisibility(I)V

    .line 616
    .line 617
    .line 618
    :cond_17
    if-eqz v9, :cond_1b

    .line 619
    .line 620
    iget-object v8, v5, Lh/h;->r:Landroidx/core/widget/NestedScrollView;

    .line 621
    .line 622
    if-eqz v8, :cond_18

    .line 623
    .line 624
    const/4 v10, 0x1

    .line 625
    invoke-virtual {v8, v10}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 626
    .line 627
    .line 628
    :cond_18
    iget-object v8, v5, Lh/h;->e:Ljava/lang/CharSequence;

    .line 629
    .line 630
    if-nez v8, :cond_1a

    .line 631
    .line 632
    iget-object v8, v5, Lh/h;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 633
    .line 634
    if-eqz v8, :cond_19

    .line 635
    .line 636
    goto :goto_d

    .line 637
    :cond_19
    const/4 v0, 0x0

    .line 638
    goto :goto_e

    .line 639
    :cond_1a
    :goto_d
    const v8, 0x7f0901f4

    .line 640
    .line 641
    .line 642
    invoke-virtual {v0, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    :goto_e
    if-eqz v0, :cond_1c

    .line 647
    .line 648
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 649
    .line 650
    .line 651
    goto :goto_f

    .line 652
    :cond_1b
    const v0, 0x7f0901e6

    .line 653
    .line 654
    .line 655
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    if-eqz v0, :cond_1c

    .line 660
    .line 661
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 662
    .line 663
    .line 664
    :cond_1c
    :goto_f
    iget-object v0, v5, Lh/h;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 665
    .line 666
    instance-of v8, v0, Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 667
    .line 668
    if-eqz v8, :cond_20

    .line 669
    .line 670
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 671
    .line 672
    .line 673
    if-eqz v3, :cond_1d

    .line 674
    .line 675
    if-nez v9, :cond_20

    .line 676
    .line 677
    :cond_1d
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 678
    .line 679
    .line 680
    move-result v8

    .line 681
    if-eqz v9, :cond_1e

    .line 682
    .line 683
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 684
    .line 685
    .line 686
    move-result v10

    .line 687
    goto :goto_10

    .line 688
    :cond_1e
    iget v10, v0, Landroidx/appcompat/app/AlertController$RecycleListView;->f:I

    .line 689
    .line 690
    :goto_10
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 691
    .line 692
    .line 693
    move-result v11

    .line 694
    if-eqz v3, :cond_1f

    .line 695
    .line 696
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 697
    .line 698
    .line 699
    move-result v12

    .line 700
    goto :goto_11

    .line 701
    :cond_1f
    iget v12, v0, Landroidx/appcompat/app/AlertController$RecycleListView;->g:I

    .line 702
    .line 703
    :goto_11
    invoke-virtual {v0, v8, v10, v11, v12}, Landroid/view/View;->setPadding(IIII)V

    .line 704
    .line 705
    .line 706
    :cond_20
    if-nez v7, :cond_2c

    .line 707
    .line 708
    iget-object v0, v5, Lh/h;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 709
    .line 710
    if-eqz v0, :cond_21

    .line 711
    .line 712
    goto :goto_12

    .line 713
    :cond_21
    iget-object v0, v5, Lh/h;->r:Landroidx/core/widget/NestedScrollView;

    .line 714
    .line 715
    :goto_12
    if-eqz v0, :cond_2c

    .line 716
    .line 717
    if-eqz v3, :cond_22

    .line 718
    .line 719
    const/4 v11, 0x2

    .line 720
    goto :goto_13

    .line 721
    :cond_22
    const/4 v11, 0x0

    .line 722
    :goto_13
    or-int v3, v9, v11

    .line 723
    .line 724
    const v7, 0x7f090196

    .line 725
    .line 726
    .line 727
    invoke-virtual {v6, v7}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 728
    .line 729
    .line 730
    move-result-object v7

    .line 731
    const v8, 0x7f090195

    .line 732
    .line 733
    .line 734
    invoke-virtual {v6, v8}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 735
    .line 736
    .line 737
    move-result-object v6

    .line 738
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 739
    .line 740
    const/16 v9, 0x17

    .line 741
    .line 742
    if-lt v8, v9, :cond_25

    .line 743
    .line 744
    sget-object v2, LN/Q;->a:Ljava/util/WeakHashMap;

    .line 745
    .line 746
    if-lt v8, v9, :cond_23

    .line 747
    .line 748
    const/4 v2, 0x3

    .line 749
    invoke-static {v0, v3, v2}, LN/G;->d(Landroid/view/View;II)V

    .line 750
    .line 751
    .line 752
    :cond_23
    if-eqz v7, :cond_24

    .line 753
    .line 754
    invoke-virtual {v1, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 755
    .line 756
    .line 757
    :cond_24
    if-eqz v6, :cond_2c

    .line 758
    .line 759
    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 760
    .line 761
    .line 762
    goto :goto_14

    .line 763
    :cond_25
    if-eqz v7, :cond_26

    .line 764
    .line 765
    const/4 v0, 0x1

    .line 766
    and-int/lit8 v8, v3, 0x1

    .line 767
    .line 768
    if-nez v8, :cond_26

    .line 769
    .line 770
    invoke-virtual {v1, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 771
    .line 772
    .line 773
    const/4 v7, 0x0

    .line 774
    :cond_26
    if-eqz v6, :cond_27

    .line 775
    .line 776
    const/4 v0, 0x2

    .line 777
    and-int/2addr v0, v3

    .line 778
    if-nez v0, :cond_27

    .line 779
    .line 780
    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 781
    .line 782
    .line 783
    const/4 v6, 0x0

    .line 784
    :cond_27
    if-nez v7, :cond_28

    .line 785
    .line 786
    if-eqz v6, :cond_2c

    .line 787
    .line 788
    :cond_28
    iget-object v0, v5, Lh/h;->e:Ljava/lang/CharSequence;

    .line 789
    .line 790
    if-eqz v0, :cond_29

    .line 791
    .line 792
    iget-object v0, v5, Lh/h;->r:Landroidx/core/widget/NestedScrollView;

    .line 793
    .line 794
    new-instance v1, LE/j;

    .line 795
    .line 796
    const/16 v3, 0xd

    .line 797
    .line 798
    invoke-direct {v1, v7, v6, v3}, LE/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 799
    .line 800
    .line 801
    invoke-virtual {v0, v1}, Landroidx/core/widget/NestedScrollView;->setOnScrollChangeListener(LT/j;)V

    .line 802
    .line 803
    .line 804
    iget-object v0, v5, Lh/h;->r:Landroidx/core/widget/NestedScrollView;

    .line 805
    .line 806
    new-instance v1, Lh/a;

    .line 807
    .line 808
    invoke-direct {v1, v5, v7, v6, v2}, Lh/a;-><init>(Lh/h;Landroid/view/View;Landroid/view/View;I)V

    .line 809
    .line 810
    .line 811
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 812
    .line 813
    .line 814
    goto :goto_14

    .line 815
    :cond_29
    iget-object v0, v5, Lh/h;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 816
    .line 817
    if-eqz v0, :cond_2a

    .line 818
    .line 819
    new-instance v1, Lh/b;

    .line 820
    .line 821
    invoke-direct {v1, v7, v6}, Lh/b;-><init>(Landroid/view/View;Landroid/view/View;)V

    .line 822
    .line 823
    .line 824
    invoke-virtual {v0, v1}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 825
    .line 826
    .line 827
    iget-object v0, v5, Lh/h;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 828
    .line 829
    new-instance v1, Lh/a;

    .line 830
    .line 831
    const/4 v2, 0x1

    .line 832
    invoke-direct {v1, v5, v7, v6, v2}, Lh/a;-><init>(Lh/h;Landroid/view/View;Landroid/view/View;I)V

    .line 833
    .line 834
    .line 835
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 836
    .line 837
    .line 838
    goto :goto_14

    .line 839
    :cond_2a
    if-eqz v7, :cond_2b

    .line 840
    .line 841
    invoke-virtual {v1, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 842
    .line 843
    .line 844
    :cond_2b
    if-eqz v6, :cond_2c

    .line 845
    .line 846
    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 847
    .line 848
    .line 849
    :cond_2c
    :goto_14
    iget-object v0, v5, Lh/h;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 850
    .line 851
    if-eqz v0, :cond_2d

    .line 852
    .line 853
    iget-object v1, v5, Lh/h;->x:Landroid/widget/ListAdapter;

    .line 854
    .line 855
    if-eqz v1, :cond_2d

    .line 856
    .line 857
    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 858
    .line 859
    .line 860
    iget v1, v5, Lh/h;->y:I

    .line 861
    .line 862
    if-le v1, v15, :cond_2d

    .line 863
    .line 864
    const/4 v2, 0x1

    .line 865
    invoke-virtual {v0, v1, v2}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    .line 866
    .line 867
    .line 868
    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    .line 869
    .line 870
    .line 871
    :cond_2d
    return-void
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/i;->k:Lh/h;

    .line 2
    .line 3
    iget-object v0, v0, Lh/h;->r:Landroidx/core/widget/NestedScrollView;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p2}, Landroidx/core/widget/NestedScrollView;->i(Landroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1
.end method

.method public final onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/i;->k:Lh/h;

    .line 2
    .line 3
    iget-object v0, v0, Lh/h;->r:Landroidx/core/widget/NestedScrollView;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p2}, Landroidx/core/widget/NestedScrollView;->i(Landroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyUp(ILandroid/view/KeyEvent;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1
.end method

.method public final onStop()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/activity/o;->onStop()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/i;->f()Lh/s;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lh/D;

    .line 9
    .line 10
    invoke-virtual {v0}, Lh/D;->z()V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Lh/D;->t:Lh/N;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-boolean v1, v0, Lh/N;->E:Z

    .line 19
    .line 20
    iget-object v0, v0, Lh/N;->D:Lm/j;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Lm/j;->a()V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final setContentView(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/activity/o;->e()V

    .line 2
    invoke-virtual {p0}, Lh/i;->f()Lh/s;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh/s;->h(I)V

    return-void
.end method

.method public final setContentView(Landroid/view/View;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Landroidx/activity/o;->e()V

    .line 4
    invoke-virtual {p0}, Lh/i;->f()Lh/s;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh/s;->i(Landroid/view/View;)V

    return-void
.end method

.method public final setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 5
    invoke-virtual {p0}, Landroidx/activity/o;->e()V

    .line 6
    invoke-virtual {p0}, Lh/i;->f()Lh/s;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lh/s;->j(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final setTitle(I)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(I)V

    .line 2
    invoke-virtual {p0}, Lh/i;->f()Lh/s;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lh/s;->k(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 3
    invoke-virtual {p0, p1}, Lh/i;->i(Ljava/lang/CharSequence;)V

    .line 4
    iget-object v0, p0, Lh/i;->k:Lh/h;

    iput-object p1, v0, Lh/h;->d:Ljava/lang/CharSequence;

    .line 5
    iget-object v0, v0, Lh/h;->u:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method
