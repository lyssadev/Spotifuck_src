.class public Landroidx/preference/SeekBarPreference;
.super Landroidx/preference/Preference;
.source "SourceFile"


# instance fields
.field public M:I

.field public N:I

.field public O:I

.field public P:I

.field public Q:Z

.field public R:Landroid/widget/SeekBar;

.field public S:Landroid/widget/TextView;

.field public final T:Z

.field public final U:Z

.field public final V:Z

.field public final W:Lg0/A;

.field public final X:Lg0/B;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 1
    const v0, 0x7f0403ec

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2, v0}, Landroidx/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lg0/A;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Lg0/A;-><init>(Landroidx/preference/SeekBarPreference;)V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Landroidx/preference/SeekBarPreference;->W:Lg0/A;

    .line 13
    .line 14
    new-instance v1, Lg0/B;

    .line 15
    .line 16
    invoke-direct {v1, p0}, Lg0/B;-><init>(Landroidx/preference/SeekBarPreference;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Landroidx/preference/SeekBarPreference;->X:Lg0/B;

    .line 20
    .line 21
    sget-object v1, Lg0/z;->k:[I

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-virtual {p1, p2, v1, v0, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 p2, 0x3

    .line 29
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    iput p2, p0, Landroidx/preference/SeekBarPreference;->N:I

    .line 34
    .line 35
    const/4 p2, 0x1

    .line 36
    const/16 v0, 0x64

    .line 37
    .line 38
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget v1, p0, Landroidx/preference/SeekBarPreference;->N:I

    .line 43
    .line 44
    if-ge v0, v1, :cond_0

    .line 45
    .line 46
    move v0, v1

    .line 47
    :cond_0
    iget v1, p0, Landroidx/preference/SeekBarPreference;->O:I

    .line 48
    .line 49
    if-eq v0, v1, :cond_1

    .line 50
    .line 51
    iput v0, p0, Landroidx/preference/SeekBarPreference;->O:I

    .line 52
    .line 53
    invoke-virtual {p0}, Landroidx/preference/Preference;->g()V

    .line 54
    .line 55
    .line 56
    :cond_1
    const/4 v0, 0x4

    .line 57
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iget v1, p0, Landroidx/preference/SeekBarPreference;->P:I

    .line 62
    .line 63
    if-eq v0, v1, :cond_2

    .line 64
    .line 65
    iget v1, p0, Landroidx/preference/SeekBarPreference;->O:I

    .line 66
    .line 67
    iget v3, p0, Landroidx/preference/SeekBarPreference;->N:I

    .line 68
    .line 69
    sub-int/2addr v1, v3

    .line 70
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iput v0, p0, Landroidx/preference/SeekBarPreference;->P:I

    .line 79
    .line 80
    invoke-virtual {p0}, Landroidx/preference/Preference;->g()V

    .line 81
    .line 82
    .line 83
    :cond_2
    const/4 v0, 0x2

    .line 84
    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    iput-boolean p2, p0, Landroidx/preference/SeekBarPreference;->T:Z

    .line 89
    .line 90
    const/4 p2, 0x5

    .line 91
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    iput-boolean p2, p0, Landroidx/preference/SeekBarPreference;->U:Z

    .line 96
    .line 97
    const/4 p2, 0x6

    .line 98
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    iput-boolean p2, p0, Landroidx/preference/SeekBarPreference;->V:Z

    .line 103
    .line 104
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 105
    .line 106
    .line 107
    return-void
.end method


# virtual methods
.method public final k(Lg0/y;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/preference/Preference;->k(Lg0/y;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/preference/SeekBarPreference;->X:Lg0/B;

    .line 5
    .line 6
    iget-object v1, p1, Lj0/a0;->a:Landroid/view/View;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 9
    .line 10
    .line 11
    const v0, 0x7f0901a3

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lg0/y;->r(I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Landroid/widget/SeekBar;

    .line 19
    .line 20
    iput-object v0, p0, Landroidx/preference/SeekBarPreference;->R:Landroid/widget/SeekBar;

    .line 21
    .line 22
    const v0, 0x7f0901a4

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lg0/y;->r(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Landroid/widget/TextView;

    .line 30
    .line 31
    iput-object p1, p0, Landroidx/preference/SeekBarPreference;->S:Landroid/widget/TextView;

    .line 32
    .line 33
    iget-boolean v0, p0, Landroidx/preference/SeekBarPreference;->U:Z

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/16 v0, 0x8

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    iput-object p1, p0, Landroidx/preference/SeekBarPreference;->S:Landroid/widget/TextView;

    .line 49
    .line 50
    :goto_0
    iget-object p1, p0, Landroidx/preference/SeekBarPreference;->R:Landroid/widget/SeekBar;

    .line 51
    .line 52
    if-nez p1, :cond_1

    .line 53
    .line 54
    const-string p1, "SeekBarPreference"

    .line 55
    .line 56
    const-string v0, "SeekBar view is null in onBindViewHolder."

    .line 57
    .line 58
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    iget-object v0, p0, Landroidx/preference/SeekBarPreference;->W:Lg0/A;

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Landroidx/preference/SeekBarPreference;->R:Landroid/widget/SeekBar;

    .line 68
    .line 69
    iget v0, p0, Landroidx/preference/SeekBarPreference;->O:I

    .line 70
    .line 71
    iget v1, p0, Landroidx/preference/SeekBarPreference;->N:I

    .line 72
    .line 73
    sub-int/2addr v0, v1

    .line 74
    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 75
    .line 76
    .line 77
    iget p1, p0, Landroidx/preference/SeekBarPreference;->P:I

    .line 78
    .line 79
    if-eqz p1, :cond_2

    .line 80
    .line 81
    iget-object v0, p0, Landroidx/preference/SeekBarPreference;->R:Landroid/widget/SeekBar;

    .line 82
    .line 83
    invoke-virtual {v0, p1}, Landroid/widget/AbsSeekBar;->setKeyProgressIncrement(I)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    iget-object p1, p0, Landroidx/preference/SeekBarPreference;->R:Landroid/widget/SeekBar;

    .line 88
    .line 89
    invoke-virtual {p1}, Landroid/widget/AbsSeekBar;->getKeyProgressIncrement()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    iput p1, p0, Landroidx/preference/SeekBarPreference;->P:I

    .line 94
    .line 95
    :goto_1
    iget-object p1, p0, Landroidx/preference/SeekBarPreference;->R:Landroid/widget/SeekBar;

    .line 96
    .line 97
    iget v0, p0, Landroidx/preference/SeekBarPreference;->M:I

    .line 98
    .line 99
    iget v1, p0, Landroidx/preference/SeekBarPreference;->N:I

    .line 100
    .line 101
    sub-int/2addr v0, v1

    .line 102
    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 103
    .line 104
    .line 105
    iget p1, p0, Landroidx/preference/SeekBarPreference;->M:I

    .line 106
    .line 107
    iget-object v0, p0, Landroidx/preference/SeekBarPreference;->S:Landroid/widget/TextView;

    .line 108
    .line 109
    if-eqz v0, :cond_3

    .line 110
    .line 111
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 116
    .line 117
    .line 118
    :cond_3
    iget-object p1, p0, Landroidx/preference/SeekBarPreference;->R:Landroid/widget/SeekBar;

    .line 119
    .line 120
    invoke-virtual {p0}, Landroidx/preference/Preference;->f()Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public final n(Landroid/content/res/TypedArray;I)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public final o(Landroid/os/Parcelable;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lg0/C;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-super {p0, p1}, Landroidx/preference/Preference;->o(Landroid/os/Parcelable;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    check-cast p1, Lg0/C;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-super {p0, v0}, Landroidx/preference/Preference;->o(Landroid/os/Parcelable;)V

    .line 24
    .line 25
    .line 26
    iget v0, p1, Lg0/C;->a:I

    .line 27
    .line 28
    iput v0, p0, Landroidx/preference/SeekBarPreference;->M:I

    .line 29
    .line 30
    iget v0, p1, Lg0/C;->b:I

    .line 31
    .line 32
    iput v0, p0, Landroidx/preference/SeekBarPreference;->N:I

    .line 33
    .line 34
    iget p1, p1, Lg0/C;->c:I

    .line 35
    .line 36
    iput p1, p0, Landroidx/preference/SeekBarPreference;->O:I

    .line 37
    .line 38
    invoke-virtual {p0}, Landroidx/preference/Preference;->g()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final p()Landroid/os/Parcelable;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/preference/Preference;->I:Z

    .line 3
    .line 4
    sget-object v0, Landroid/view/AbsSavedState;->EMPTY_STATE:Landroid/view/AbsSavedState;

    .line 5
    .line 6
    iget-boolean v1, p0, Landroidx/preference/Preference;->q:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    new-instance v1, Lg0/C;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Lg0/C;-><init>(Landroid/view/AbsSavedState;)V

    .line 14
    .line 15
    .line 16
    iget v0, p0, Landroidx/preference/SeekBarPreference;->M:I

    .line 17
    .line 18
    iput v0, v1, Lg0/C;->a:I

    .line 19
    .line 20
    iget v0, p0, Landroidx/preference/SeekBarPreference;->N:I

    .line 21
    .line 22
    iput v0, v1, Lg0/C;->b:I

    .line 23
    .line 24
    iget v0, p0, Landroidx/preference/SeekBarPreference;->O:I

    .line 25
    .line 26
    iput v0, v1, Lg0/C;->c:I

    .line 27
    .line 28
    return-object v1
.end method

.method public final q(Ljava/lang/Object;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    :cond_0
    check-cast p1, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-virtual {p0}, Landroidx/preference/Preference;->v()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget-object v0, p0, Landroidx/preference/Preference;->b:Lg0/w;

    .line 22
    .line 23
    invoke-virtual {v0}, Lg0/w;->c()Landroid/content/SharedPreferences;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v1, p0, Landroidx/preference/Preference;->k:Ljava/lang/String;

    .line 28
    .line 29
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    :goto_0
    const/4 v0, 0x1

    .line 34
    invoke-virtual {p0, p1, v0}, Landroidx/preference/SeekBarPreference;->w(IZ)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final w(IZ)V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/preference/SeekBarPreference;->N:I

    .line 2
    .line 3
    if-ge p1, v0, :cond_0

    .line 4
    .line 5
    move p1, v0

    .line 6
    :cond_0
    iget v0, p0, Landroidx/preference/SeekBarPreference;->O:I

    .line 7
    .line 8
    if-le p1, v0, :cond_1

    .line 9
    .line 10
    move p1, v0

    .line 11
    :cond_1
    iget v0, p0, Landroidx/preference/SeekBarPreference;->M:I

    .line 12
    .line 13
    if-eq p1, v0, :cond_7

    .line 14
    .line 15
    iput p1, p0, Landroidx/preference/SeekBarPreference;->M:I

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/preference/SeekBarPreference;->S:Landroid/widget/TextView;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    :cond_2
    invoke-virtual {p0}, Landroidx/preference/Preference;->v()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_3
    not-int v0, p1

    .line 36
    invoke-virtual {p0}, Landroidx/preference/Preference;->v()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_4

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_4
    iget-object v1, p0, Landroidx/preference/Preference;->b:Lg0/w;

    .line 44
    .line 45
    invoke-virtual {v1}, Lg0/w;->c()Landroid/content/SharedPreferences;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iget-object v2, p0, Landroidx/preference/Preference;->k:Ljava/lang/String;

    .line 50
    .line 51
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    :goto_0
    if-ne p1, v0, :cond_5

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_5
    iget-object v0, p0, Landroidx/preference/Preference;->b:Lg0/w;

    .line 59
    .line 60
    invoke-virtual {v0}, Lg0/w;->a()Landroid/content/SharedPreferences$Editor;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v1, p0, Landroidx/preference/Preference;->k:Ljava/lang/String;

    .line 65
    .line 66
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Landroidx/preference/Preference;->b:Lg0/w;

    .line 70
    .line 71
    iget-boolean p1, p1, Lg0/w;->e:Z

    .line 72
    .line 73
    if-nez p1, :cond_6

    .line 74
    .line 75
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 76
    .line 77
    .line 78
    :cond_6
    :goto_1
    if-eqz p2, :cond_7

    .line 79
    .line 80
    invoke-virtual {p0}, Landroidx/preference/Preference;->g()V

    .line 81
    .line 82
    .line 83
    :cond_7
    return-void
.end method
