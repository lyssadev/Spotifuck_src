.class public final Lg0/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field public final synthetic f:Landroidx/preference/SeekBarPreference;


# direct methods
.method public constructor <init>(Landroidx/preference/SeekBarPreference;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg0/B;->f:Landroidx/preference/SeekBarPreference;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    iget-object p1, p0, Lg0/B;->f:Landroidx/preference/SeekBarPreference;

    .line 10
    .line 11
    iget-boolean v1, p1, Landroidx/preference/SeekBarPreference;->T:Z

    .line 12
    .line 13
    if-nez v1, :cond_2

    .line 14
    .line 15
    const/16 v1, 0x15

    .line 16
    .line 17
    if-eq p2, v1, :cond_1

    .line 18
    .line 19
    const/16 v1, 0x16

    .line 20
    .line 21
    if-ne p2, v1, :cond_2

    .line 22
    .line 23
    :cond_1
    return v0

    .line 24
    :cond_2
    const/16 v1, 0x17

    .line 25
    .line 26
    if-eq p2, v1, :cond_5

    .line 27
    .line 28
    const/16 v1, 0x42

    .line 29
    .line 30
    if-ne p2, v1, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget-object p1, p1, Landroidx/preference/SeekBarPreference;->R:Landroid/widget/SeekBar;

    .line 34
    .line 35
    if-nez p1, :cond_4

    .line 36
    .line 37
    const-string p1, "SeekBarPreference"

    .line 38
    .line 39
    const-string p2, "SeekBar view is null and hence cannot be adjusted."

    .line 40
    .line 41
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    return v0

    .line 45
    :cond_4
    invoke-virtual {p1, p2, p3}, Landroid/view/View;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    return p1

    .line 50
    :cond_5
    :goto_0
    return v0
.end method
