.class public Lo/H0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln/B;


# static fields
.field public static final F:Ljava/lang/reflect/Method;

.field public static final G:Ljava/lang/reflect/Method;

.field public static final H:Ljava/lang/reflect/Method;


# instance fields
.field public final A:Landroid/os/Handler;

.field public final B:Landroid/graphics/Rect;

.field public C:Landroid/graphics/Rect;

.field public D:Z

.field public final E:Lo/A;

.field public final f:Landroid/content/Context;

.field public g:Landroid/widget/ListAdapter;

.field public h:Lo/v0;

.field public final i:I

.field public j:I

.field public k:I

.field public l:I

.field public final m:I

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:I

.field public final r:I

.field public s:Lo/E0;

.field public t:Landroid/view/View;

.field public u:Landroid/widget/AdapterView$OnItemClickListener;

.field public v:Landroid/widget/AdapterView$OnItemSelectedListener;

.field public final w:Lo/D0;

.field public final x:Lo/G0;

.field public final y:Lo/F0;

.field public final z:Lo/D0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v3, 0x1c

    .line 6
    .line 7
    const-class v4, Landroid/widget/PopupWindow;

    .line 8
    .line 9
    if-gt v2, v3, :cond_0

    .line 10
    .line 11
    :try_start_0
    const-string v2, "setClipToScreenEnabled"

    .line 12
    .line 13
    new-array v3, v1, [Ljava/lang/Class;

    .line 14
    .line 15
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 16
    .line 17
    aput-object v5, v3, v0

    .line 18
    .line 19
    invoke-virtual {v4, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    sput-object v2, Lo/H0;->F:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    :catch_0
    :try_start_1
    const-string v2, "setEpicenterBounds"

    .line 26
    .line 27
    new-array v3, v1, [Ljava/lang/Class;

    .line 28
    .line 29
    const-class v5, Landroid/graphics/Rect;

    .line 30
    .line 31
    aput-object v5, v3, v0

    .line 32
    .line 33
    invoke-virtual {v4, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    sput-object v2, Lo/H0;->H:Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catch_1
    nop

    .line 41
    :cond_0
    :goto_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 42
    .line 43
    const/16 v3, 0x17

    .line 44
    .line 45
    if-gt v2, v3, :cond_1

    .line 46
    .line 47
    :try_start_2
    const-string v2, "getMaxAvailableHeight"

    .line 48
    .line 49
    const/4 v3, 0x3

    .line 50
    new-array v3, v3, [Ljava/lang/Class;

    .line 51
    .line 52
    const-class v5, Landroid/view/View;

    .line 53
    .line 54
    aput-object v5, v3, v0

    .line 55
    .line 56
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 57
    .line 58
    aput-object v0, v3, v1

    .line 59
    .line 60
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 61
    .line 62
    const/4 v1, 0x2

    .line 63
    aput-object v0, v3, v1

    .line 64
    .line 65
    invoke-virtual {v4, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sput-object v0, Lo/H0;->G:Ljava/lang/reflect/Method;
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_2

    .line 70
    .line 71
    :catch_2
    :cond_1
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x2

    .line 5
    iput v0, p0, Lo/H0;->i:I

    .line 6
    .line 7
    iput v0, p0, Lo/H0;->j:I

    .line 8
    .line 9
    const/16 v0, 0x3ea

    .line 10
    .line 11
    iput v0, p0, Lo/H0;->m:I

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput v0, p0, Lo/H0;->q:I

    .line 15
    .line 16
    const v1, 0x7fffffff

    .line 17
    .line 18
    .line 19
    iput v1, p0, Lo/H0;->r:I

    .line 20
    .line 21
    new-instance v1, Lo/D0;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-direct {v1, p0, v2}, Lo/D0;-><init>(Lo/H0;I)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Lo/H0;->w:Lo/D0;

    .line 28
    .line 29
    new-instance v1, Lo/G0;

    .line 30
    .line 31
    invoke-direct {v1, p0}, Lo/G0;-><init>(Lo/H0;)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Lo/H0;->x:Lo/G0;

    .line 35
    .line 36
    new-instance v1, Lo/F0;

    .line 37
    .line 38
    invoke-direct {v1, p0}, Lo/F0;-><init>(Lo/H0;)V

    .line 39
    .line 40
    .line 41
    iput-object v1, p0, Lo/H0;->y:Lo/F0;

    .line 42
    .line 43
    new-instance v1, Lo/D0;

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    invoke-direct {v1, p0, v2}, Lo/D0;-><init>(Lo/H0;I)V

    .line 47
    .line 48
    .line 49
    iput-object v1, p0, Lo/H0;->z:Lo/D0;

    .line 50
    .line 51
    new-instance v1, Landroid/graphics/Rect;

    .line 52
    .line 53
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v1, p0, Lo/H0;->B:Landroid/graphics/Rect;

    .line 57
    .line 58
    iput-object p1, p0, Lo/H0;->f:Landroid/content/Context;

    .line 59
    .line 60
    new-instance v1, Landroid/os/Handler;

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 67
    .line 68
    .line 69
    iput-object v1, p0, Lo/H0;->A:Landroid/os/Handler;

    .line 70
    .line 71
    sget-object v1, Lg/a;->o:[I

    .line 72
    .line 73
    invoke-virtual {p1, p2, v1, p3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v1, v0, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    iput v2, p0, Lo/H0;->k:I

    .line 82
    .line 83
    const/4 v2, 0x1

    .line 84
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    iput v3, p0, Lo/H0;->l:I

    .line 89
    .line 90
    if-eqz v3, :cond_0

    .line 91
    .line 92
    iput-boolean v2, p0, Lo/H0;->n:Z

    .line 93
    .line 94
    :cond_0
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 95
    .line 96
    .line 97
    new-instance v1, Lo/A;

    .line 98
    .line 99
    invoke-direct {v1, p1, p2, p3, v0}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 100
    .line 101
    .line 102
    sget-object v3, Lg/a;->s:[I

    .line 103
    .line 104
    invoke-virtual {p1, p2, v3, p3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    const/4 p3, 0x2

    .line 109
    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-eqz v3, :cond_1

    .line 114
    .line 115
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 116
    .line 117
    .line 118
    move-result p3

    .line 119
    invoke-static {v1, p3}, Lp0/a;->A0(Lo/A;Z)V

    .line 120
    .line 121
    .line 122
    :cond_1
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 123
    .line 124
    .line 125
    move-result p3

    .line 126
    if-eqz p3, :cond_2

    .line 127
    .line 128
    invoke-virtual {p2, v0, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 129
    .line 130
    .line 131
    move-result p3

    .line 132
    if-eqz p3, :cond_2

    .line 133
    .line 134
    invoke-static {p1, p3}, LT0/g;->n(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    goto :goto_0

    .line 139
    :cond_2
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    :goto_0
    invoke-virtual {v1, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 147
    .line 148
    .line 149
    iput-object v1, p0, Lo/H0;->E:Lo/A;

    .line 150
    .line 151
    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 152
    .line 153
    .line 154
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lo/H0;->E:Lo/A;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final c(I)V
    .locals 0

    .line 1
    iput p1, p0, Lo/H0;->k:I

    .line 2
    .line 3
    return-void
.end method

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, Lo/H0;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public final dismiss()V
    .locals 2

    .line 1
    iget-object v0, p0, Lo/H0;->E:Lo/A;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    iput-object v1, p0, Lo/H0;->h:Lo/v0;

    .line 11
    .line 12
    iget-object v0, p0, Lo/H0;->A:Landroid/os/Handler;

    .line 13
    .line 14
    iget-object v1, p0, Lo/H0;->w:Lo/D0;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final e()Lo/v0;
    .locals 1

    .line 1
    iget-object v0, p0, Lo/H0;->h:Lo/v0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()V
    .locals 13

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    iget-object v3, p0, Lo/H0;->h:Lo/v0;

    .line 5
    .line 6
    iget-object v4, p0, Lo/H0;->E:Lo/A;

    .line 7
    .line 8
    iget-object v5, p0, Lo/H0;->f:Landroid/content/Context;

    .line 9
    .line 10
    if-nez v3, :cond_1

    .line 11
    .line 12
    iget-boolean v3, p0, Lo/H0;->D:Z

    .line 13
    .line 14
    xor-int/2addr v3, v2

    .line 15
    invoke-virtual {p0, v5, v3}, Lo/H0;->q(Landroid/content/Context;Z)Lo/v0;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iput-object v3, p0, Lo/H0;->h:Lo/v0;

    .line 20
    .line 21
    iget-object v6, p0, Lo/H0;->g:Landroid/widget/ListAdapter;

    .line 22
    .line 23
    invoke-virtual {v3, v6}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 24
    .line 25
    .line 26
    iget-object v3, p0, Lo/H0;->h:Lo/v0;

    .line 27
    .line 28
    iget-object v6, p0, Lo/H0;->u:Landroid/widget/AdapterView$OnItemClickListener;

    .line 29
    .line 30
    invoke-virtual {v3, v6}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 31
    .line 32
    .line 33
    iget-object v3, p0, Lo/H0;->h:Lo/v0;

    .line 34
    .line 35
    invoke-virtual {v3, v2}, Landroid/view/View;->setFocusable(Z)V

    .line 36
    .line 37
    .line 38
    iget-object v3, p0, Lo/H0;->h:Lo/v0;

    .line 39
    .line 40
    invoke-virtual {v3, v2}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 41
    .line 42
    .line 43
    iget-object v3, p0, Lo/H0;->h:Lo/v0;

    .line 44
    .line 45
    new-instance v6, Lg0/b;

    .line 46
    .line 47
    invoke-direct {v6, v2, p0}, Lg0/b;-><init>(ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v6}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 51
    .line 52
    .line 53
    iget-object v3, p0, Lo/H0;->h:Lo/v0;

    .line 54
    .line 55
    iget-object v6, p0, Lo/H0;->y:Lo/F0;

    .line 56
    .line 57
    invoke-virtual {v3, v6}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 58
    .line 59
    .line 60
    iget-object v3, p0, Lo/H0;->v:Landroid/widget/AdapterView$OnItemSelectedListener;

    .line 61
    .line 62
    if-eqz v3, :cond_0

    .line 63
    .line 64
    iget-object v6, p0, Lo/H0;->h:Lo/v0;

    .line 65
    .line 66
    invoke-virtual {v6, v3}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 67
    .line 68
    .line 69
    :cond_0
    iget-object v3, p0, Lo/H0;->h:Lo/v0;

    .line 70
    .line 71
    invoke-virtual {v4, v3}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    invoke-virtual {v4}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    check-cast v3, Landroid/view/ViewGroup;

    .line 80
    .line 81
    :goto_0
    invoke-virtual {v4}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    iget-object v6, p0, Lo/H0;->B:Landroid/graphics/Rect;

    .line 86
    .line 87
    if-eqz v3, :cond_2

    .line 88
    .line 89
    invoke-virtual {v3, v6}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 90
    .line 91
    .line 92
    iget v3, v6, Landroid/graphics/Rect;->top:I

    .line 93
    .line 94
    iget v7, v6, Landroid/graphics/Rect;->bottom:I

    .line 95
    .line 96
    add-int/2addr v7, v3

    .line 97
    iget-boolean v8, p0, Lo/H0;->n:Z

    .line 98
    .line 99
    if-nez v8, :cond_3

    .line 100
    .line 101
    neg-int v3, v3

    .line 102
    iput v3, p0, Lo/H0;->l:I

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_2
    invoke-virtual {v6}, Landroid/graphics/Rect;->setEmpty()V

    .line 106
    .line 107
    .line 108
    const/4 v7, 0x0

    .line 109
    :cond_3
    :goto_1
    invoke-virtual {v4}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-ne v3, v0, :cond_4

    .line 114
    .line 115
    const/4 v3, 0x1

    .line 116
    goto :goto_2

    .line 117
    :cond_4
    const/4 v3, 0x0

    .line 118
    :goto_2
    iget-object v8, p0, Lo/H0;->t:Landroid/view/View;

    .line 119
    .line 120
    iget v9, p0, Lo/H0;->l:I

    .line 121
    .line 122
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 123
    .line 124
    const/16 v11, 0x17

    .line 125
    .line 126
    if-gt v10, v11, :cond_6

    .line 127
    .line 128
    sget-object v10, Lo/H0;->G:Ljava/lang/reflect/Method;

    .line 129
    .line 130
    if-eqz v10, :cond_5

    .line 131
    .line 132
    :try_start_0
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v11

    .line 136
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    const/4 v12, 0x3

    .line 141
    new-array v12, v12, [Ljava/lang/Object;

    .line 142
    .line 143
    aput-object v8, v12, v1

    .line 144
    .line 145
    aput-object v11, v12, v2

    .line 146
    .line 147
    aput-object v3, v12, v0

    .line 148
    .line 149
    invoke-virtual {v10, v4, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    check-cast v3, Ljava/lang/Integer;

    .line 154
    .line 155
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 156
    .line 157
    .line 158
    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 159
    goto :goto_3

    .line 160
    :catch_0
    :cond_5
    invoke-virtual {v4, v8, v9}, Landroid/widget/PopupWindow;->getMaxAvailableHeight(Landroid/view/View;I)I

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    goto :goto_3

    .line 165
    :cond_6
    invoke-static {v4, v8, v9, v3}, Lo/B0;->a(Landroid/widget/PopupWindow;Landroid/view/View;IZ)I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    :goto_3
    iget v8, p0, Lo/H0;->i:I

    .line 170
    .line 171
    const/4 v9, -0x2

    .line 172
    const/4 v10, -0x1

    .line 173
    if-ne v8, v10, :cond_7

    .line 174
    .line 175
    add-int/2addr v3, v7

    .line 176
    goto :goto_6

    .line 177
    :cond_7
    iget v11, p0, Lo/H0;->j:I

    .line 178
    .line 179
    if-eq v11, v9, :cond_9

    .line 180
    .line 181
    const/high16 v12, 0x40000000    # 2.0f

    .line 182
    .line 183
    if-eq v11, v10, :cond_8

    .line 184
    .line 185
    invoke-static {v11, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    goto :goto_4

    .line 190
    :cond_8
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 199
    .line 200
    iget v11, v6, Landroid/graphics/Rect;->left:I

    .line 201
    .line 202
    iget v6, v6, Landroid/graphics/Rect;->right:I

    .line 203
    .line 204
    add-int/2addr v11, v6

    .line 205
    sub-int/2addr v5, v11

    .line 206
    invoke-static {v5, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 207
    .line 208
    .line 209
    move-result v5

    .line 210
    goto :goto_4

    .line 211
    :cond_9
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 220
    .line 221
    iget v11, v6, Landroid/graphics/Rect;->left:I

    .line 222
    .line 223
    iget v6, v6, Landroid/graphics/Rect;->right:I

    .line 224
    .line 225
    add-int/2addr v11, v6

    .line 226
    sub-int/2addr v5, v11

    .line 227
    const/high16 v6, -0x80000000

    .line 228
    .line 229
    invoke-static {v5, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    :goto_4
    iget-object v6, p0, Lo/H0;->h:Lo/v0;

    .line 234
    .line 235
    invoke-virtual {v6, v5, v3}, Lo/v0;->a(II)I

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    if-lez v3, :cond_a

    .line 240
    .line 241
    iget-object v5, p0, Lo/H0;->h:Lo/v0;

    .line 242
    .line 243
    invoke-virtual {v5}, Landroid/view/View;->getPaddingTop()I

    .line 244
    .line 245
    .line 246
    move-result v5

    .line 247
    iget-object v6, p0, Lo/H0;->h:Lo/v0;

    .line 248
    .line 249
    invoke-virtual {v6}, Landroid/view/View;->getPaddingBottom()I

    .line 250
    .line 251
    .line 252
    move-result v6

    .line 253
    add-int/2addr v6, v5

    .line 254
    add-int/2addr v6, v7

    .line 255
    goto :goto_5

    .line 256
    :cond_a
    const/4 v6, 0x0

    .line 257
    :goto_5
    add-int/2addr v3, v6

    .line 258
    :goto_6
    iget-object v5, p0, Lo/H0;->E:Lo/A;

    .line 259
    .line 260
    invoke-virtual {v5}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    .line 261
    .line 262
    .line 263
    move-result v5

    .line 264
    if-ne v5, v0, :cond_b

    .line 265
    .line 266
    const/4 v0, 0x1

    .line 267
    goto :goto_7

    .line 268
    :cond_b
    const/4 v0, 0x0

    .line 269
    :goto_7
    iget v5, p0, Lo/H0;->m:I

    .line 270
    .line 271
    invoke-static {v4, v5}, Lp0/a;->E0(Landroid/widget/PopupWindow;I)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v4}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 275
    .line 276
    .line 277
    move-result v5

    .line 278
    if-eqz v5, :cond_17

    .line 279
    .line 280
    iget-object v5, p0, Lo/H0;->t:Landroid/view/View;

    .line 281
    .line 282
    invoke-virtual {v5}, Landroid/view/View;->isAttachedToWindow()Z

    .line 283
    .line 284
    .line 285
    move-result v5

    .line 286
    if-nez v5, :cond_c

    .line 287
    .line 288
    return-void

    .line 289
    :cond_c
    iget v5, p0, Lo/H0;->j:I

    .line 290
    .line 291
    if-ne v5, v10, :cond_d

    .line 292
    .line 293
    const/4 v5, -0x1

    .line 294
    goto :goto_8

    .line 295
    :cond_d
    if-ne v5, v9, :cond_e

    .line 296
    .line 297
    iget-object v5, p0, Lo/H0;->t:Landroid/view/View;

    .line 298
    .line 299
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 300
    .line 301
    .line 302
    move-result v5

    .line 303
    :cond_e
    :goto_8
    if-ne v8, v10, :cond_13

    .line 304
    .line 305
    if-eqz v0, :cond_f

    .line 306
    .line 307
    move v8, v3

    .line 308
    goto :goto_9

    .line 309
    :cond_f
    const/4 v8, -0x1

    .line 310
    :goto_9
    if-eqz v0, :cond_11

    .line 311
    .line 312
    iget v0, p0, Lo/H0;->j:I

    .line 313
    .line 314
    if-ne v0, v10, :cond_10

    .line 315
    .line 316
    const/4 v0, -0x1

    .line 317
    goto :goto_a

    .line 318
    :cond_10
    const/4 v0, 0x0

    .line 319
    :goto_a
    invoke-virtual {v4, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v4, v1}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 323
    .line 324
    .line 325
    goto :goto_b

    .line 326
    :cond_11
    iget v0, p0, Lo/H0;->j:I

    .line 327
    .line 328
    if-ne v0, v10, :cond_12

    .line 329
    .line 330
    const/4 v1, -0x1

    .line 331
    :cond_12
    invoke-virtual {v4, v1}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v4, v10}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 335
    .line 336
    .line 337
    goto :goto_b

    .line 338
    :cond_13
    if-ne v8, v9, :cond_14

    .line 339
    .line 340
    move v8, v3

    .line 341
    :cond_14
    :goto_b
    invoke-virtual {v4, v2}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 342
    .line 343
    .line 344
    iget-object v0, p0, Lo/H0;->t:Landroid/view/View;

    .line 345
    .line 346
    iget v6, p0, Lo/H0;->k:I

    .line 347
    .line 348
    iget v7, p0, Lo/H0;->l:I

    .line 349
    .line 350
    if-gez v5, :cond_15

    .line 351
    .line 352
    const/4 v1, -0x1

    .line 353
    goto :goto_c

    .line 354
    :cond_15
    move v1, v5

    .line 355
    :goto_c
    if-gez v8, :cond_16

    .line 356
    .line 357
    const/4 v9, -0x1

    .line 358
    goto :goto_d

    .line 359
    :cond_16
    move v9, v8

    .line 360
    :goto_d
    move-object v5, v0

    .line 361
    move v8, v1

    .line 362
    invoke-virtual/range {v4 .. v9}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    .line 363
    .line 364
    .line 365
    goto/16 :goto_12

    .line 366
    .line 367
    :cond_17
    iget v0, p0, Lo/H0;->j:I

    .line 368
    .line 369
    if-ne v0, v10, :cond_18

    .line 370
    .line 371
    const/4 v0, -0x1

    .line 372
    goto :goto_e

    .line 373
    :cond_18
    if-ne v0, v9, :cond_19

    .line 374
    .line 375
    iget-object v0, p0, Lo/H0;->t:Landroid/view/View;

    .line 376
    .line 377
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 378
    .line 379
    .line 380
    move-result v0

    .line 381
    :cond_19
    :goto_e
    if-ne v8, v10, :cond_1a

    .line 382
    .line 383
    const/4 v8, -0x1

    .line 384
    goto :goto_f

    .line 385
    :cond_1a
    if-ne v8, v9, :cond_1b

    .line 386
    .line 387
    move v8, v3

    .line 388
    :cond_1b
    :goto_f
    invoke-virtual {v4, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v4, v8}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 392
    .line 393
    .line 394
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 395
    .line 396
    const/16 v3, 0x1c

    .line 397
    .line 398
    if-gt v0, v3, :cond_1c

    .line 399
    .line 400
    sget-object v0, Lo/H0;->F:Ljava/lang/reflect/Method;

    .line 401
    .line 402
    if-eqz v0, :cond_1d

    .line 403
    .line 404
    :try_start_1
    new-array v5, v2, [Ljava/lang/Object;

    .line 405
    .line 406
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 407
    .line 408
    aput-object v6, v5, v1

    .line 409
    .line 410
    invoke-virtual {v0, v4, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 411
    .line 412
    .line 413
    goto :goto_10

    .line 414
    :catch_1
    nop

    .line 415
    goto :goto_10

    .line 416
    :cond_1c
    invoke-static {v4, v2}, Lo/C0;->b(Landroid/widget/PopupWindow;Z)V

    .line 417
    .line 418
    .line 419
    :cond_1d
    :goto_10
    invoke-virtual {v4, v2}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 420
    .line 421
    .line 422
    iget-object v0, p0, Lo/H0;->x:Lo/G0;

    .line 423
    .line 424
    invoke-virtual {v4, v0}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    .line 425
    .line 426
    .line 427
    iget-boolean v0, p0, Lo/H0;->p:Z

    .line 428
    .line 429
    if-eqz v0, :cond_1e

    .line 430
    .line 431
    iget-boolean v0, p0, Lo/H0;->o:Z

    .line 432
    .line 433
    invoke-static {v4, v0}, Lp0/a;->A0(Lo/A;Z)V

    .line 434
    .line 435
    .line 436
    :cond_1e
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 437
    .line 438
    if-gt v0, v3, :cond_1f

    .line 439
    .line 440
    sget-object v0, Lo/H0;->H:Ljava/lang/reflect/Method;

    .line 441
    .line 442
    if-eqz v0, :cond_20

    .line 443
    .line 444
    :try_start_2
    iget-object v3, p0, Lo/H0;->C:Landroid/graphics/Rect;

    .line 445
    .line 446
    new-array v5, v2, [Ljava/lang/Object;

    .line 447
    .line 448
    aput-object v3, v5, v1

    .line 449
    .line 450
    invoke-virtual {v0, v4, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 451
    .line 452
    .line 453
    goto :goto_11

    .line 454
    :catch_2
    move-exception v0

    .line 455
    const-string v1, "ListPopupWindow"

    .line 456
    .line 457
    const-string v3, "Could not invoke setEpicenterBounds on PopupWindow"

    .line 458
    .line 459
    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 460
    .line 461
    .line 462
    goto :goto_11

    .line 463
    :cond_1f
    iget-object v0, p0, Lo/H0;->C:Landroid/graphics/Rect;

    .line 464
    .line 465
    invoke-static {v4, v0}, Lo/C0;->a(Landroid/widget/PopupWindow;Landroid/graphics/Rect;)V

    .line 466
    .line 467
    .line 468
    :cond_20
    :goto_11
    iget-object v0, p0, Lo/H0;->t:Landroid/view/View;

    .line 469
    .line 470
    iget v1, p0, Lo/H0;->k:I

    .line 471
    .line 472
    iget v3, p0, Lo/H0;->l:I

    .line 473
    .line 474
    iget v5, p0, Lo/H0;->q:I

    .line 475
    .line 476
    invoke-virtual {v4, v0, v1, v3, v5}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;III)V

    .line 477
    .line 478
    .line 479
    iget-object v0, p0, Lo/H0;->h:Lo/v0;

    .line 480
    .line 481
    invoke-virtual {v0, v10}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 482
    .line 483
    .line 484
    iget-boolean v0, p0, Lo/H0;->D:Z

    .line 485
    .line 486
    if-eqz v0, :cond_21

    .line 487
    .line 488
    iget-object v0, p0, Lo/H0;->h:Lo/v0;

    .line 489
    .line 490
    invoke-virtual {v0}, Lo/v0;->isInTouchMode()Z

    .line 491
    .line 492
    .line 493
    move-result v0

    .line 494
    if-eqz v0, :cond_22

    .line 495
    .line 496
    :cond_21
    iget-object v0, p0, Lo/H0;->h:Lo/v0;

    .line 497
    .line 498
    if-eqz v0, :cond_22

    .line 499
    .line 500
    invoke-virtual {v0, v2}, Lo/v0;->setListSelectionHidden(Z)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 504
    .line 505
    .line 506
    :cond_22
    iget-boolean v0, p0, Lo/H0;->D:Z

    .line 507
    .line 508
    if-nez v0, :cond_23

    .line 509
    .line 510
    iget-object v0, p0, Lo/H0;->A:Landroid/os/Handler;

    .line 511
    .line 512
    iget-object v1, p0, Lo/H0;->z:Lo/D0;

    .line 513
    .line 514
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 515
    .line 516
    .line 517
    :cond_23
    :goto_12
    return-void
.end method

.method public final j()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lo/H0;->n:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    iget v0, p0, Lo/H0;->l:I

    .line 8
    .line 9
    return v0
.end method

.method public final k(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo/H0;->E:Lo/A;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final l(I)V
    .locals 0

    .line 1
    iput p1, p0, Lo/H0;->l:I

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lo/H0;->n:Z

    .line 5
    .line 6
    return-void
.end method

.method public final m()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lo/H0;->E:Lo/A;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public n(Landroid/widget/ListAdapter;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lo/H0;->s:Lo/E0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lo/E0;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lo/E0;-><init>(Lo/H0;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lo/H0;->s:Lo/E0;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v1, p0, Lo/H0;->g:Landroid/widget/ListAdapter;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v1, v0}, Landroid/widget/Adapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    :goto_0
    iput-object p1, p0, Lo/H0;->g:Landroid/widget/ListAdapter;

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, Lo/H0;->s:Lo/E0;

    .line 25
    .line 26
    invoke-interface {p1, v0}, Landroid/widget/Adapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 27
    .line 28
    .line 29
    :cond_2
    iget-object p1, p0, Lo/H0;->h:Lo/v0;

    .line 30
    .line 31
    if-eqz p1, :cond_3

    .line 32
    .line 33
    iget-object v0, p0, Lo/H0;->g:Landroid/widget/ListAdapter;

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 36
    .line 37
    .line 38
    :cond_3
    return-void
.end method

.method public q(Landroid/content/Context;Z)Lo/v0;
    .locals 1

    .line 1
    new-instance v0, Lo/v0;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lo/v0;-><init>(Landroid/content/Context;Z)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final r(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lo/H0;->E:Lo/A;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lo/H0;->B:Landroid/graphics/Rect;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 12
    .line 13
    .line 14
    iget v0, v1, Landroid/graphics/Rect;->left:I

    .line 15
    .line 16
    iget v1, v1, Landroid/graphics/Rect;->right:I

    .line 17
    .line 18
    add-int/2addr v0, v1

    .line 19
    add-int/2addr v0, p1

    .line 20
    iput v0, p0, Lo/H0;->j:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iput p1, p0, Lo/H0;->j:I

    .line 24
    .line 25
    :goto_0
    return-void
.end method
