.class public final Lg0/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field public final synthetic a:Landroidx/preference/SeekBarPreference;


# direct methods
.method public constructor <init>(Landroidx/preference/SeekBarPreference;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg0/A;->a:Landroidx/preference/SeekBarPreference;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg0/A;->a:Landroidx/preference/SeekBarPreference;

    .line 2
    .line 3
    if-eqz p3, :cond_1

    .line 4
    .line 5
    iget-boolean p3, v0, Landroidx/preference/SeekBarPreference;->V:Z

    .line 6
    .line 7
    if-nez p3, :cond_0

    .line 8
    .line 9
    iget-boolean p3, v0, Landroidx/preference/SeekBarPreference;->Q:Z

    .line 10
    .line 11
    if-nez p3, :cond_1

    .line 12
    .line 13
    :cond_0
    iget p2, v0, Landroidx/preference/SeekBarPreference;->N:I

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/widget/ProgressBar;->getProgress()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    add-int/2addr p1, p2

    .line 20
    iget p2, v0, Landroidx/preference/SeekBarPreference;->M:I

    .line 21
    .line 22
    if-eq p1, p2, :cond_2

    .line 23
    .line 24
    const/4 p2, 0x0

    .line 25
    invoke-virtual {v0, p1, p2}, Landroidx/preference/SeekBarPreference;->w(IZ)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget p1, v0, Landroidx/preference/SeekBarPreference;->N:I

    .line 30
    .line 31
    add-int/2addr p2, p1

    .line 32
    iget-object p1, v0, Landroidx/preference/SeekBarPreference;->S:Landroid/widget/TextView;

    .line 33
    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    :goto_0
    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lg0/A;->a:Landroidx/preference/SeekBarPreference;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p1, Landroidx/preference/SeekBarPreference;->Q:Z

    .line 5
    .line 6
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lg0/A;->a:Landroidx/preference/SeekBarPreference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, Landroidx/preference/SeekBarPreference;->Q:Z

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/widget/ProgressBar;->getProgress()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    iget v3, v0, Landroidx/preference/SeekBarPreference;->N:I

    .line 11
    .line 12
    add-int/2addr v2, v3

    .line 13
    iget v4, v0, Landroidx/preference/SeekBarPreference;->M:I

    .line 14
    .line 15
    if-eq v2, v4, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/widget/ProgressBar;->getProgress()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    add-int/2addr p1, v3

    .line 22
    iget v2, v0, Landroidx/preference/SeekBarPreference;->M:I

    .line 23
    .line 24
    if-eq p1, v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0, p1, v1}, Landroidx/preference/SeekBarPreference;->w(IZ)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method
