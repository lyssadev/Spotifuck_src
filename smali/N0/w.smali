.class public final LN0/w;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"


# instance fields
.field public a:Landroid/content/res/ColorStateList;

.field public b:Landroid/content/res/ColorStateList;

.field public final synthetic c:LN0/x;


# direct methods
.method public constructor <init>(LN0/x;Landroid/content/Context;I[Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN0/w;->c:LN0/x;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3, p4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LN0/w;->a()V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 9

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    iget-object v3, p0, LN0/w;->c:LN0/x;

    .line 5
    .line 6
    iget-object v4, v3, LN0/x;->q:Landroid/content/res/ColorStateList;

    .line 7
    .line 8
    if-eqz v4, :cond_0

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v5, 0x0

    .line 13
    :goto_0
    const/4 v6, 0x0

    .line 14
    if-nez v5, :cond_1

    .line 15
    .line 16
    move-object v5, v6

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    const v5, 0x10100a7

    .line 19
    .line 20
    .line 21
    filled-new-array {v5}, [I

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-virtual {v4, v5, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    filled-new-array {v4, v2}, [I

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    new-array v7, v2, [I

    .line 34
    .line 35
    new-array v8, v0, [[I

    .line 36
    .line 37
    aput-object v5, v8, v2

    .line 38
    .line 39
    aput-object v7, v8, v1

    .line 40
    .line 41
    new-instance v5, Landroid/content/res/ColorStateList;

    .line 42
    .line 43
    invoke-direct {v5, v8, v4}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 44
    .line 45
    .line 46
    :goto_1
    iput-object v5, p0, LN0/w;->b:Landroid/content/res/ColorStateList;

    .line 47
    .line 48
    iget v4, v3, LN0/x;->p:I

    .line 49
    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    iget-object v4, v3, LN0/x;->q:Landroid/content/res/ColorStateList;

    .line 53
    .line 54
    if-eqz v4, :cond_2

    .line 55
    .line 56
    const v4, 0x1010367

    .line 57
    .line 58
    .line 59
    const v5, -0x10100a7

    .line 60
    .line 61
    .line 62
    filled-new-array {v4, v5}, [I

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    const v6, 0x10100a1

    .line 67
    .line 68
    .line 69
    filled-new-array {v6, v5}, [I

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    iget-object v6, v3, LN0/x;->q:Landroid/content/res/ColorStateList;

    .line 74
    .line 75
    invoke-virtual {v6, v5, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    iget-object v7, v3, LN0/x;->q:Landroid/content/res/ColorStateList;

    .line 80
    .line 81
    invoke-virtual {v7, v4, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    iget v8, v3, LN0/x;->p:I

    .line 86
    .line 87
    invoke-static {v6, v8}, LF/a;->b(II)I

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    iget v8, v3, LN0/x;->p:I

    .line 92
    .line 93
    invoke-static {v7, v8}, LF/a;->b(II)I

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    iget v3, v3, LN0/x;->p:I

    .line 98
    .line 99
    filled-new-array {v6, v7, v3}, [I

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    new-array v6, v2, [I

    .line 104
    .line 105
    const/4 v7, 0x3

    .line 106
    new-array v7, v7, [[I

    .line 107
    .line 108
    aput-object v5, v7, v2

    .line 109
    .line 110
    aput-object v4, v7, v1

    .line 111
    .line 112
    aput-object v6, v7, v0

    .line 113
    .line 114
    new-instance v6, Landroid/content/res/ColorStateList;

    .line 115
    .line 116
    invoke-direct {v6, v7, v3}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 117
    .line 118
    .line 119
    :cond_2
    iput-object v6, p0, LN0/w;->a:Landroid/content/res/ColorStateList;

    .line 120
    .line 121
    return-void
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/widget/ArrayAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    instance-of p2, p1, Landroid/widget/TextView;

    .line 6
    .line 7
    if-eqz p2, :cond_2

    .line 8
    .line 9
    move-object p2, p1

    .line 10
    check-cast p2, Landroid/widget/TextView;

    .line 11
    .line 12
    iget-object p3, p0, LN0/w;->c:LN0/x;

    .line 13
    .line 14
    invoke-virtual {p3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v1, 0x0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget v0, p3, LN0/x;->p:I

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 38
    .line 39
    iget p3, p3, LN0/x;->p:I

    .line 40
    .line 41
    invoke-direct {v0, p3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 42
    .line 43
    .line 44
    iget-object p3, p0, LN0/w;->b:Landroid/content/res/ColorStateList;

    .line 45
    .line 46
    if-eqz p3, :cond_0

    .line 47
    .line 48
    iget-object p3, p0, LN0/w;->a:Landroid/content/res/ColorStateList;

    .line 49
    .line 50
    invoke-static {v0, p3}, LG/a;->h(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 51
    .line 52
    .line 53
    new-instance p3, Landroid/graphics/drawable/RippleDrawable;

    .line 54
    .line 55
    iget-object v2, p0, LN0/w;->b:Landroid/content/res/ColorStateList;

    .line 56
    .line 57
    invoke-direct {p3, v2, v0, v1}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 58
    .line 59
    .line 60
    move-object v1, p3

    .line 61
    goto :goto_0

    .line 62
    :cond_0
    move-object v1, v0

    .line 63
    :cond_1
    :goto_0
    sget-object p3, LN/Q;->a:Ljava/util/WeakHashMap;

    .line 64
    .line 65
    invoke-virtual {p2, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 66
    .line 67
    .line 68
    :cond_2
    return-object p1
.end method
