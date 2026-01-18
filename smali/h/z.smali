.class public final Lh/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Window$Callback;


# instance fields
.field public final f:Landroid/view/Window$Callback;

.field public g:Z

.field public h:Z

.field public i:Z

.field public final synthetic j:Lh/D;


# direct methods
.method public constructor <init>(Lh/D;Landroid/view/Window$Callback;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh/z;->j:Lh/D;

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    iput-object p2, p0, Lh/z;->f:Landroid/view/Window$Callback;

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 12
    .line 13
    const-string p2, "Window callback may not be null"

    .line 14
    .line 15
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1
.end method


# virtual methods
.method public final a(Landroid/view/Window$Callback;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lh/z;->g:Z

    .line 4
    .line 5
    invoke-interface {p1}, Landroid/view/Window$Callback;->onContentChanged()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    iput-boolean v1, p0, Lh/z;->g:Z

    .line 9
    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    iput-boolean v1, p0, Lh/z;->g:Z

    .line 13
    .line 14
    throw p1
.end method

.method public final b(ILandroid/view/Menu;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/z;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final c(ILandroid/view/Menu;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/z;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(Ljava/util/List;Landroid/view/Menu;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/z;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-static {v0, p1, p2, p3}, Lm/l;->a(Landroid/view/Window$Callback;Ljava/util/List;Landroid/view/Menu;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/z;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lh/z;->h:Z

    .line 2
    .line 3
    iget-object v1, p0, Lh/z;->f:Landroid/view/Window$Callback;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v1, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    iget-object v0, p0, Lh/z;->j:Lh/D;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lh/D;->s(Landroid/view/KeyEvent;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    invoke-interface {v1, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    goto :goto_1

    .line 29
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 30
    :goto_1
    return p1
.end method

.method public final dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lh/z;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_8

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v2, p0, Lh/z;->j:Lh/D;

    .line 15
    .line 16
    invoke-virtual {v2}, Lh/D;->z()V

    .line 17
    .line 18
    .line 19
    iget-object v3, v2, Lh/D;->t:Lh/N;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    if-eqz v3, :cond_4

    .line 23
    .line 24
    iget-object v3, v3, Lh/N;->t:Lh/M;

    .line 25
    .line 26
    if-nez v3, :cond_1

    .line 27
    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    iget-object v3, v3, Lh/M;->i:Ln/l;

    .line 31
    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getDeviceId()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    invoke-static {v5}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-virtual {v5}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-eq v5, v1, :cond_2

    .line 47
    .line 48
    const/4 v5, 0x1

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/4 v5, 0x0

    .line 51
    :goto_0
    invoke-virtual {v3, v5}, Ln/l;->setQwertyMode(Z)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v0, p1, v4}, Ln/l;->performShortcut(ILandroid/view/KeyEvent;I)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    :goto_1
    if-eqz v0, :cond_4

    .line 59
    .line 60
    :cond_3
    :goto_2
    const/4 p1, 0x1

    .line 61
    goto :goto_3

    .line 62
    :cond_4
    iget-object v0, v2, Lh/D;->S:Lh/C;

    .line 63
    .line 64
    if-eqz v0, :cond_5

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    invoke-virtual {v2, v0, v3, p1}, Lh/D;->E(Lh/C;ILandroid/view/KeyEvent;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_5

    .line 75
    .line 76
    iget-object p1, v2, Lh/D;->S:Lh/C;

    .line 77
    .line 78
    if-eqz p1, :cond_3

    .line 79
    .line 80
    iput-boolean v1, p1, Lh/C;->l:Z

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_5
    iget-object v0, v2, Lh/D;->S:Lh/C;

    .line 84
    .line 85
    if-nez v0, :cond_6

    .line 86
    .line 87
    invoke-virtual {v2, v4}, Lh/D;->y(I)Lh/C;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v2, v0, p1}, Lh/D;->F(Lh/C;Landroid/view/KeyEvent;)Z

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    invoke-virtual {v2, v0, v3, p1}, Lh/D;->E(Lh/C;ILandroid/view/KeyEvent;)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    iput-boolean v4, v0, Lh/C;->k:Z

    .line 103
    .line 104
    if-eqz p1, :cond_6

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_6
    const/4 p1, 0x0

    .line 108
    :goto_3
    if-eqz p1, :cond_7

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_7
    const/4 v1, 0x0

    .line 112
    :cond_8
    :goto_4
    return v1
.end method

.method public final dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/z;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/z;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final dispatchTrackballEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/z;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchTrackballEvent(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final e(Landroid/view/ActionMode$Callback;)Lm/e;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    new-instance v2, LA/k;

    .line 4
    .line 5
    iget-object v3, p0, Lh/z;->j:Lh/D;

    .line 6
    .line 7
    iget-object v4, v3, Lh/D;->p:Landroid/content/Context;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v4, v2, LA/k;->i:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p1, v2, LA/k;->f:Ljava/lang/Object;

    .line 15
    .line 16
    new-instance p1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, v2, LA/k;->h:Ljava/lang/Object;

    .line 22
    .line 23
    new-instance p1, Lr/k;

    .line 24
    .line 25
    invoke-direct {p1}, Lr/k;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, v2, LA/k;->g:Ljava/lang/Object;

    .line 29
    .line 30
    iget-object p1, v3, Lh/D;->z:Lm/a;

    .line 31
    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1}, Lm/a;->a()V

    .line 35
    .line 36
    .line 37
    :cond_0
    new-instance p1, LE/j;

    .line 38
    .line 39
    const/16 v4, 0xe

    .line 40
    .line 41
    invoke-direct {p1, v3, v2, v4, v0}, LE/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Lh/D;->z()V

    .line 45
    .line 46
    .line 47
    iget-object v4, v3, Lh/D;->t:Lh/N;

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    if-eqz v4, :cond_3

    .line 51
    .line 52
    iget-object v6, v4, Lh/N;->t:Lh/M;

    .line 53
    .line 54
    if-eqz v6, :cond_1

    .line 55
    .line 56
    invoke-virtual {v6}, Lh/M;->a()V

    .line 57
    .line 58
    .line 59
    :cond_1
    iget-object v6, v4, Lh/N;->n:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 60
    .line 61
    invoke-virtual {v6, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    .line 62
    .line 63
    .line 64
    iget-object v6, v4, Lh/N;->q:Landroidx/appcompat/widget/ActionBarContextView;

    .line 65
    .line 66
    invoke-virtual {v6}, Landroidx/appcompat/widget/ActionBarContextView;->e()V

    .line 67
    .line 68
    .line 69
    new-instance v6, Lh/M;

    .line 70
    .line 71
    iget-object v7, v4, Lh/N;->q:Landroidx/appcompat/widget/ActionBarContextView;

    .line 72
    .line 73
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-direct {v6, v4, v7, p1}, Lh/M;-><init>(Lh/N;Landroid/content/Context;LE/j;)V

    .line 78
    .line 79
    .line 80
    iget-object v7, v6, Lh/M;->i:Ln/l;

    .line 81
    .line 82
    invoke-virtual {v7}, Ln/l;->w()V

    .line 83
    .line 84
    .line 85
    :try_start_0
    iget-object v8, v6, Lh/M;->j:LE/j;

    .line 86
    .line 87
    iget-object v8, v8, LE/j;->g:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v8, LA/k;

    .line 90
    .line 91
    invoke-virtual {v8, v6, v7}, LA/k;->q(Lm/a;Ln/l;)Z

    .line 92
    .line 93
    .line 94
    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    invoke-virtual {v7}, Ln/l;->v()V

    .line 96
    .line 97
    .line 98
    if-eqz v8, :cond_2

    .line 99
    .line 100
    iput-object v6, v4, Lh/N;->t:Lh/M;

    .line 101
    .line 102
    invoke-virtual {v6}, Lh/M;->i()V

    .line 103
    .line 104
    .line 105
    iget-object v7, v4, Lh/N;->q:Landroidx/appcompat/widget/ActionBarContextView;

    .line 106
    .line 107
    invoke-virtual {v7, v6}, Landroidx/appcompat/widget/ActionBarContextView;->c(Lm/a;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4, v1}, Lh/N;->V(Z)V

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_2
    move-object v6, v5

    .line 115
    :goto_0
    iput-object v6, v3, Lh/D;->z:Lm/a;

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :catchall_0
    move-exception p1

    .line 119
    invoke-virtual {v7}, Ln/l;->v()V

    .line 120
    .line 121
    .line 122
    throw p1

    .line 123
    :cond_3
    :goto_1
    iget-object v4, v3, Lh/D;->z:Lm/a;

    .line 124
    .line 125
    if-nez v4, :cond_11

    .line 126
    .line 127
    iget-object v4, v3, Lh/D;->D:LN/Z;

    .line 128
    .line 129
    if-eqz v4, :cond_4

    .line 130
    .line 131
    invoke-virtual {v4}, LN/Z;->b()V

    .line 132
    .line 133
    .line 134
    :cond_4
    iget-object v4, v3, Lh/D;->z:Lm/a;

    .line 135
    .line 136
    if-eqz v4, :cond_5

    .line 137
    .line 138
    invoke-virtual {v4}, Lm/a;->a()V

    .line 139
    .line 140
    .line 141
    :cond_5
    iget-object v4, v3, Lh/D;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 142
    .line 143
    if-nez v4, :cond_a

    .line 144
    .line 145
    iget-boolean v4, v3, Lh/D;->O:Z

    .line 146
    .line 147
    iget-object v6, v3, Lh/D;->p:Landroid/content/Context;

    .line 148
    .line 149
    if-eqz v4, :cond_7

    .line 150
    .line 151
    new-instance v4, Landroid/util/TypedValue;

    .line 152
    .line 153
    invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v6}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    const v8, 0x7f04000b

    .line 161
    .line 162
    .line 163
    invoke-virtual {v7, v8, v4, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 164
    .line 165
    .line 166
    iget v8, v4, Landroid/util/TypedValue;->resourceId:I

    .line 167
    .line 168
    if-eqz v8, :cond_6

    .line 169
    .line 170
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 171
    .line 172
    .line 173
    move-result-object v8

    .line 174
    invoke-virtual {v8}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    .line 175
    .line 176
    .line 177
    move-result-object v8

    .line 178
    invoke-virtual {v8, v7}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 179
    .line 180
    .line 181
    iget v7, v4, Landroid/util/TypedValue;->resourceId:I

    .line 182
    .line 183
    invoke-virtual {v8, v7, v1}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 184
    .line 185
    .line 186
    new-instance v7, Lm/c;

    .line 187
    .line 188
    invoke-direct {v7, v6, v0}, Lm/c;-><init>(Landroid/content/Context;I)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v7}, Lm/c;->getTheme()Landroid/content/res/Resources$Theme;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    invoke-virtual {v6, v8}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 196
    .line 197
    .line 198
    move-object v6, v7

    .line 199
    :cond_6
    new-instance v7, Landroidx/appcompat/widget/ActionBarContextView;

    .line 200
    .line 201
    invoke-direct {v7, v6, v5}, Landroidx/appcompat/widget/ActionBarContextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 202
    .line 203
    .line 204
    iput-object v7, v3, Lh/D;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 205
    .line 206
    new-instance v7, Landroid/widget/PopupWindow;

    .line 207
    .line 208
    const v8, 0x7f04001a

    .line 209
    .line 210
    .line 211
    invoke-direct {v7, v6, v5, v8}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 212
    .line 213
    .line 214
    iput-object v7, v3, Lh/D;->B:Landroid/widget/PopupWindow;

    .line 215
    .line 216
    const/4 v8, 0x2

    .line 217
    invoke-static {v7, v8}, Lp0/a;->E0(Landroid/widget/PopupWindow;I)V

    .line 218
    .line 219
    .line 220
    iget-object v7, v3, Lh/D;->B:Landroid/widget/PopupWindow;

    .line 221
    .line 222
    iget-object v8, v3, Lh/D;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 223
    .line 224
    invoke-virtual {v7, v8}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 225
    .line 226
    .line 227
    iget-object v7, v3, Lh/D;->B:Landroid/widget/PopupWindow;

    .line 228
    .line 229
    const/4 v8, -0x1

    .line 230
    invoke-virtual {v7, v8}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v6}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 234
    .line 235
    .line 236
    move-result-object v7

    .line 237
    const v8, 0x7f040005

    .line 238
    .line 239
    .line 240
    invoke-virtual {v7, v8, v4, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 241
    .line 242
    .line 243
    iget v4, v4, Landroid/util/TypedValue;->data:I

    .line 244
    .line 245
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 250
    .line 251
    .line 252
    move-result-object v6

    .line 253
    invoke-static {v4, v6}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    .line 254
    .line 255
    .line 256
    move-result v4

    .line 257
    iget-object v6, v3, Lh/D;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 258
    .line 259
    invoke-virtual {v6, v4}, Landroidx/appcompat/widget/ActionBarContextView;->setContentHeight(I)V

    .line 260
    .line 261
    .line 262
    iget-object v4, v3, Lh/D;->B:Landroid/widget/PopupWindow;

    .line 263
    .line 264
    const/4 v6, -0x2

    .line 265
    invoke-virtual {v4, v6}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 266
    .line 267
    .line 268
    new-instance v4, Lh/t;

    .line 269
    .line 270
    invoke-direct {v4, v3, v1}, Lh/t;-><init>(Lh/D;I)V

    .line 271
    .line 272
    .line 273
    iput-object v4, v3, Lh/D;->C:Lh/t;

    .line 274
    .line 275
    goto :goto_4

    .line 276
    :cond_7
    iget-object v4, v3, Lh/D;->G:Landroid/view/ViewGroup;

    .line 277
    .line 278
    const v7, 0x7f090043

    .line 279
    .line 280
    .line 281
    invoke-virtual {v4, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    check-cast v4, Landroidx/appcompat/widget/ViewStubCompat;

    .line 286
    .line 287
    if-eqz v4, :cond_a

    .line 288
    .line 289
    invoke-virtual {v3}, Lh/D;->z()V

    .line 290
    .line 291
    .line 292
    iget-object v7, v3, Lh/D;->t:Lh/N;

    .line 293
    .line 294
    if-eqz v7, :cond_8

    .line 295
    .line 296
    invoke-virtual {v7}, Lh/N;->W()Landroid/content/Context;

    .line 297
    .line 298
    .line 299
    move-result-object v7

    .line 300
    goto :goto_2

    .line 301
    :cond_8
    move-object v7, v5

    .line 302
    :goto_2
    if-nez v7, :cond_9

    .line 303
    .line 304
    goto :goto_3

    .line 305
    :cond_9
    move-object v6, v7

    .line 306
    :goto_3
    invoke-static {v6}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 307
    .line 308
    .line 309
    move-result-object v6

    .line 310
    invoke-virtual {v4, v6}, Landroidx/appcompat/widget/ViewStubCompat;->setLayoutInflater(Landroid/view/LayoutInflater;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v4}, Landroidx/appcompat/widget/ViewStubCompat;->a()Landroid/view/View;

    .line 314
    .line 315
    .line 316
    move-result-object v4

    .line 317
    check-cast v4, Landroidx/appcompat/widget/ActionBarContextView;

    .line 318
    .line 319
    iput-object v4, v3, Lh/D;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 320
    .line 321
    :cond_a
    :goto_4
    iget-object v4, v3, Lh/D;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 322
    .line 323
    if-eqz v4, :cond_10

    .line 324
    .line 325
    iget-object v4, v3, Lh/D;->D:LN/Z;

    .line 326
    .line 327
    if-eqz v4, :cond_b

    .line 328
    .line 329
    invoke-virtual {v4}, LN/Z;->b()V

    .line 330
    .line 331
    .line 332
    :cond_b
    iget-object v4, v3, Lh/D;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 333
    .line 334
    invoke-virtual {v4}, Landroidx/appcompat/widget/ActionBarContextView;->e()V

    .line 335
    .line 336
    .line 337
    new-instance v4, Lm/d;

    .line 338
    .line 339
    iget-object v6, v3, Lh/D;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 340
    .line 341
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 342
    .line 343
    .line 344
    move-result-object v6

    .line 345
    iget-object v7, v3, Lh/D;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 346
    .line 347
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 348
    .line 349
    .line 350
    iput-object v6, v4, Lm/d;->h:Landroid/content/Context;

    .line 351
    .line 352
    iput-object v7, v4, Lm/d;->i:Landroidx/appcompat/widget/ActionBarContextView;

    .line 353
    .line 354
    iput-object p1, v4, Lm/d;->j:LE/j;

    .line 355
    .line 356
    new-instance v6, Ln/l;

    .line 357
    .line 358
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 359
    .line 360
    .line 361
    move-result-object v7

    .line 362
    invoke-direct {v6, v7}, Ln/l;-><init>(Landroid/content/Context;)V

    .line 363
    .line 364
    .line 365
    iput v1, v6, Ln/l;->l:I

    .line 366
    .line 367
    iput-object v6, v4, Lm/d;->m:Ln/l;

    .line 368
    .line 369
    iput-object v4, v6, Ln/l;->e:Ln/j;

    .line 370
    .line 371
    iget-object p1, p1, LE/j;->g:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast p1, LA/k;

    .line 374
    .line 375
    invoke-virtual {p1, v4, v6}, LA/k;->q(Lm/a;Ln/l;)Z

    .line 376
    .line 377
    .line 378
    move-result p1

    .line 379
    if-eqz p1, :cond_f

    .line 380
    .line 381
    invoke-virtual {v4}, Lm/d;->i()V

    .line 382
    .line 383
    .line 384
    iget-object p1, v3, Lh/D;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 385
    .line 386
    invoke-virtual {p1, v4}, Landroidx/appcompat/widget/ActionBarContextView;->c(Lm/a;)V

    .line 387
    .line 388
    .line 389
    iput-object v4, v3, Lh/D;->z:Lm/a;

    .line 390
    .line 391
    iget-boolean p1, v3, Lh/D;->F:Z

    .line 392
    .line 393
    if-eqz p1, :cond_c

    .line 394
    .line 395
    iget-object p1, v3, Lh/D;->G:Landroid/view/ViewGroup;

    .line 396
    .line 397
    if-eqz p1, :cond_c

    .line 398
    .line 399
    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    .line 400
    .line 401
    .line 402
    move-result p1

    .line 403
    if-eqz p1, :cond_c

    .line 404
    .line 405
    const/4 p1, 0x1

    .line 406
    goto :goto_5

    .line 407
    :cond_c
    const/4 p1, 0x0

    .line 408
    :goto_5
    const/high16 v4, 0x3f800000    # 1.0f

    .line 409
    .line 410
    if-eqz p1, :cond_d

    .line 411
    .line 412
    iget-object p1, v3, Lh/D;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 413
    .line 414
    const/4 v0, 0x0

    .line 415
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 416
    .line 417
    .line 418
    iget-object p1, v3, Lh/D;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 419
    .line 420
    invoke-static {p1}, LN/Q;->a(Landroid/view/View;)LN/Z;

    .line 421
    .line 422
    .line 423
    move-result-object p1

    .line 424
    invoke-virtual {p1, v4}, LN/Z;->a(F)V

    .line 425
    .line 426
    .line 427
    iput-object p1, v3, Lh/D;->D:LN/Z;

    .line 428
    .line 429
    new-instance v0, Lh/v;

    .line 430
    .line 431
    invoke-direct {v0, v1, v3}, Lh/v;-><init>(ILjava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {p1, v0}, LN/Z;->d(LN/a0;)V

    .line 435
    .line 436
    .line 437
    goto :goto_6

    .line 438
    :cond_d
    iget-object p1, v3, Lh/D;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 439
    .line 440
    invoke-virtual {p1, v4}, Landroid/view/View;->setAlpha(F)V

    .line 441
    .line 442
    .line 443
    iget-object p1, v3, Lh/D;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 444
    .line 445
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    .line 446
    .line 447
    .line 448
    iget-object p1, v3, Lh/D;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 449
    .line 450
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 451
    .line 452
    .line 453
    move-result-object p1

    .line 454
    instance-of p1, p1, Landroid/view/View;

    .line 455
    .line 456
    if-eqz p1, :cond_e

    .line 457
    .line 458
    iget-object p1, v3, Lh/D;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 459
    .line 460
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 461
    .line 462
    .line 463
    move-result-object p1

    .line 464
    check-cast p1, Landroid/view/View;

    .line 465
    .line 466
    sget-object v0, LN/Q;->a:Ljava/util/WeakHashMap;

    .line 467
    .line 468
    invoke-static {p1}, LN/D;->c(Landroid/view/View;)V

    .line 469
    .line 470
    .line 471
    :cond_e
    :goto_6
    iget-object p1, v3, Lh/D;->B:Landroid/widget/PopupWindow;

    .line 472
    .line 473
    if-eqz p1, :cond_10

    .line 474
    .line 475
    iget-object p1, v3, Lh/D;->q:Landroid/view/Window;

    .line 476
    .line 477
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 478
    .line 479
    .line 480
    move-result-object p1

    .line 481
    iget-object v0, v3, Lh/D;->C:Lh/t;

    .line 482
    .line 483
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 484
    .line 485
    .line 486
    goto :goto_7

    .line 487
    :cond_f
    iput-object v5, v3, Lh/D;->z:Lm/a;

    .line 488
    .line 489
    :cond_10
    :goto_7
    invoke-virtual {v3}, Lh/D;->H()V

    .line 490
    .line 491
    .line 492
    iget-object p1, v3, Lh/D;->z:Lm/a;

    .line 493
    .line 494
    iput-object p1, v3, Lh/D;->z:Lm/a;

    .line 495
    .line 496
    :cond_11
    invoke-virtual {v3}, Lh/D;->H()V

    .line 497
    .line 498
    .line 499
    iget-object p1, v3, Lh/D;->z:Lm/a;

    .line 500
    .line 501
    if-eqz p1, :cond_12

    .line 502
    .line 503
    invoke-virtual {v2, p1}, LA/k;->f(Lm/a;)Lm/e;

    .line 504
    .line 505
    .line 506
    move-result-object p1

    .line 507
    return-object p1

    .line 508
    :cond_12
    return-object v5
.end method

.method public final onActionModeFinished(Landroid/view/ActionMode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/z;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onActionModeFinished(Landroid/view/ActionMode;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onActionModeStarted(Landroid/view/ActionMode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/z;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onActionModeStarted(Landroid/view/ActionMode;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/z;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0}, Landroid/view/Window$Callback;->onAttachedToWindow()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onContentChanged()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lh/z;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lh/z;->f:Landroid/view/Window$Callback;

    .line 6
    .line 7
    invoke-interface {v0}, Landroid/view/Window$Callback;->onContentChanged()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    instance-of v0, p2, Ln/l;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    iget-object v0, p0, Lh/z;->f:Landroid/view/Window$Callback;

    .line 10
    .line 11
    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public final onCreatePanelView(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/z;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/z;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0}, Landroid/view/Window$Callback;->onDetachedFromWindow()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/z;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final onMenuOpened(ILandroid/view/Menu;)Z
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lh/z;->b(ILandroid/view/Menu;)Z

    .line 2
    .line 3
    .line 4
    const/16 p2, 0x6c

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iget-object v1, p0, Lh/z;->j:Lh/D;

    .line 8
    .line 9
    if-ne p1, p2, :cond_2

    .line 10
    .line 11
    invoke-virtual {v1}, Lh/D;->z()V

    .line 12
    .line 13
    .line 14
    iget-object p1, v1, Lh/D;->t:Lh/N;

    .line 15
    .line 16
    if-eqz p1, :cond_3

    .line 17
    .line 18
    iget-boolean p2, p1, Lh/N;->w:Z

    .line 19
    .line 20
    if-ne v0, p2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iput-boolean v0, p1, Lh/N;->w:Z

    .line 24
    .line 25
    iget-object p1, p1, Lh/N;->x:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-gtz p2, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 p2, 0x0

    .line 35
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance p1, Ljava/lang/ClassCastException;

    .line 43
    .line 44
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    :cond_3
    :goto_0
    return v0
.end method

.method public final onPanelClosed(ILandroid/view/Menu;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lh/z;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lh/z;->f:Landroid/view/Window$Callback;

    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0, p1, p2}, Lh/z;->c(ILandroid/view/Menu;)V

    .line 12
    .line 13
    .line 14
    const/16 p2, 0x6c

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iget-object v1, p0, Lh/z;->j:Lh/D;

    .line 18
    .line 19
    if-ne p1, p2, :cond_3

    .line 20
    .line 21
    invoke-virtual {v1}, Lh/D;->z()V

    .line 22
    .line 23
    .line 24
    iget-object p1, v1, Lh/D;->t:Lh/N;

    .line 25
    .line 26
    if-eqz p1, :cond_5

    .line 27
    .line 28
    iget-boolean p2, p1, Lh/N;->w:Z

    .line 29
    .line 30
    if-nez p2, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iput-boolean v0, p1, Lh/N;->w:Z

    .line 34
    .line 35
    iget-object p1, p1, Lh/N;->x:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-gtz p2, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    new-instance p1, Ljava/lang/ClassCastException;

    .line 52
    .line 53
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_3
    if-nez p1, :cond_4

    .line 58
    .line 59
    invoke-virtual {v1, p1}, Lh/D;->y(I)Lh/C;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget-boolean p2, p1, Lh/C;->m:Z

    .line 64
    .line 65
    if-eqz p2, :cond_5

    .line 66
    .line 67
    invoke-virtual {v1, p1, v0}, Lh/D;->q(Lh/C;Z)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    :cond_5
    :goto_0
    return-void
.end method

.method public final onPointerCaptureChanged(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/z;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lm/m;->a(Landroid/view/Window$Callback;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 3

    .line 1
    instance-of v0, p3, Ln/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Ln/l;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    const/4 v1, 0x0

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    if-eqz v0, :cond_2

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    iput-boolean v2, v0, Ln/l;->x:Z

    .line 20
    .line 21
    :cond_2
    iget-object v2, p0, Lh/z;->f:Landroid/view/Window$Callback;

    .line 22
    .line 23
    invoke-interface {v2, p1, p2, p3}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    iput-boolean v1, v0, Ln/l;->x:Z

    .line 30
    .line 31
    :cond_3
    return p1
.end method

.method public final onProvideKeyboardShortcuts(Ljava/util/List;Landroid/view/Menu;I)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lh/z;->j:Lh/D;

    .line 3
    .line 4
    invoke-virtual {v1, v0}, Lh/D;->y(I)Lh/C;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, Lh/C;->h:Ln/l;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1, v0, p3}, Lh/z;->d(Ljava/util/List;Landroid/view/Menu;I)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lh/z;->d(Ljava/util/List;Landroid/view/Menu;I)V

    .line 17
    .line 18
    .line 19
    :goto_0
    return-void
.end method

.method public final onSearchRequested()Z
    .locals 1

    .line 2
    iget-object v0, p0, Lh/z;->f:Landroid/view/Window$Callback;

    invoke-interface {v0}, Landroid/view/Window$Callback;->onSearchRequested()Z

    move-result v0

    return v0
.end method

.method public final onSearchRequested(Landroid/view/SearchEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/z;->f:Landroid/view/Window$Callback;

    invoke-static {v0, p1}, Lm/k;->a(Landroid/view/Window$Callback;Landroid/view/SearchEvent;)Z

    move-result p1

    return p1
.end method

.method public final onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/z;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/z;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onWindowFocusChanged(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onWindowStartingActionMode(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
    .locals 2

    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 5
    :cond_0
    iget-object v0, p0, Lh/z;->j:Lh/D;

    iget-boolean v0, v0, Lh/D;->E:Z

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {p0, p1}, Lh/z;->e(Landroid/view/ActionMode$Callback;)Lm/e;

    move-result-object p1

    return-object p1

    .line 7
    :cond_1
    iget-object v0, p0, Lh/z;->f:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onWindowStartingActionMode(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1
.end method

.method public final onWindowStartingActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/z;->j:Lh/D;

    iget-boolean v0, v0, Lh/D;->E:Z

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0, p1}, Lh/z;->e(Landroid/view/ActionMode$Callback;)Lm/e;

    move-result-object p1

    return-object p1

    .line 3
    :cond_1
    :goto_0
    iget-object v0, p0, Lh/z;->f:Landroid/view/Window$Callback;

    invoke-static {v0, p1, p2}, Lm/k;->b(Landroid/view/Window$Callback;Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1
.end method
