.class public Lg0/k;
.super Lg0/p;
.source "SourceFile"


# instance fields
.field public final v0:Ljava/util/HashSet;

.field public w0:Z

.field public x0:[Ljava/lang/CharSequence;

.field public y0:[Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lg0/p;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lg0/k;->v0:Ljava/util/HashSet;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final N(Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-boolean p1, p0, Lg0/k;->w0:Z

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lg0/p;->L()Landroidx/preference/DialogPreference;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Landroidx/preference/MultiSelectListPreference;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lg0/k;->v0:Ljava/util/HashSet;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroidx/preference/MultiSelectListPreference;->w(Ljava/util/Set;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    iput-boolean p1, p0, Lg0/k;->w0:Z

    .line 23
    .line 24
    return-void
.end method

.method public final O(LK/j;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lg0/k;->y0:[Ljava/lang/CharSequence;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    new-array v1, v0, [Z

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v0, :cond_0

    .line 8
    .line 9
    iget-object v3, p0, Lg0/k;->v0:Ljava/util/HashSet;

    .line 10
    .line 11
    iget-object v4, p0, Lg0/k;->y0:[Ljava/lang/CharSequence;

    .line 12
    .line 13
    aget-object v4, v4, v2

    .line 14
    .line 15
    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v3, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    aput-boolean v3, v1, v2

    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object v0, p0, Lg0/k;->x0:[Ljava/lang/CharSequence;

    .line 29
    .line 30
    new-instance v2, Lg0/j;

    .line 31
    .line 32
    invoke-direct {v2, p0}, Lg0/j;-><init>(Lg0/k;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p1, LK/j;->g:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Lh/f;

    .line 38
    .line 39
    iput-object v0, p1, Lh/f;->l:[Ljava/lang/CharSequence;

    .line 40
    .line 41
    iput-object v2, p1, Lh/f;->t:Lg0/j;

    .line 42
    .line 43
    iput-object v1, p1, Lh/f;->p:[Z

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    iput-boolean v0, p1, Lh/f;->q:Z

    .line 47
    .line 48
    return-void
.end method

.method public final t(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Lg0/p;->t(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lg0/k;->v0:Ljava/util/HashSet;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Lg0/p;->L()Landroidx/preference/DialogPreference;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Landroidx/preference/MultiSelectListPreference;

    .line 14
    .line 15
    iget-object v2, p1, Landroidx/preference/MultiSelectListPreference;->S:[Ljava/lang/CharSequence;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    iget-object v2, p1, Landroidx/preference/MultiSelectListPreference;->T:[Ljava/lang/CharSequence;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 24
    .line 25
    .line 26
    iget-object v3, p1, Landroidx/preference/MultiSelectListPreference;->U:Ljava/util/HashSet;

    .line 27
    .line 28
    invoke-interface {v0, v3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 29
    .line 30
    .line 31
    iput-boolean v1, p0, Lg0/k;->w0:Z

    .line 32
    .line 33
    iget-object p1, p1, Landroidx/preference/MultiSelectListPreference;->S:[Ljava/lang/CharSequence;

    .line 34
    .line 35
    iput-object p1, p0, Lg0/k;->x0:[Ljava/lang/CharSequence;

    .line 36
    .line 37
    iput-object v2, p0, Lg0/k;->y0:[Ljava/lang/CharSequence;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string v0, "MultiSelectListPreference requires an entries array and an entryValues array."

    .line 43
    .line 44
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 49
    .line 50
    .line 51
    const-string v2, "MultiSelectListPreferenceDialogFragmentCompat.values"

    .line 52
    .line 53
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-interface {v0, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 58
    .line 59
    .line 60
    const-string v0, "MultiSelectListPreferenceDialogFragmentCompat.changed"

    .line 61
    .line 62
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iput-boolean v0, p0, Lg0/k;->w0:Z

    .line 67
    .line 68
    const-string v0, "MultiSelectListPreferenceDialogFragmentCompat.entries"

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequenceArray(Ljava/lang/String;)[Ljava/lang/CharSequence;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iput-object v0, p0, Lg0/k;->x0:[Ljava/lang/CharSequence;

    .line 75
    .line 76
    const-string v0, "MultiSelectListPreferenceDialogFragmentCompat.entryValues"

    .line 77
    .line 78
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequenceArray(Ljava/lang/String;)[Ljava/lang/CharSequence;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iput-object p1, p0, Lg0/k;->y0:[Ljava/lang/CharSequence;

    .line 83
    .line 84
    :goto_0
    return-void
.end method

.method public final y(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lg0/p;->y(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    iget-object v1, p0, Lg0/k;->v0:Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 9
    .line 10
    .line 11
    const-string v1, "MultiSelectListPreferenceDialogFragmentCompat.values"

    .line 12
    .line 13
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "MultiSelectListPreferenceDialogFragmentCompat.changed"

    .line 17
    .line 18
    iget-boolean v1, p0, Lg0/k;->w0:Z

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "MultiSelectListPreferenceDialogFragmentCompat.entries"

    .line 24
    .line 25
    iget-object v1, p0, Lg0/k;->x0:[Ljava/lang/CharSequence;

    .line 26
    .line 27
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequenceArray(Ljava/lang/String;[Ljava/lang/CharSequence;)V

    .line 28
    .line 29
    .line 30
    const-string v0, "MultiSelectListPreferenceDialogFragmentCompat.entryValues"

    .line 31
    .line 32
    iget-object v1, p0, Lg0/k;->y0:[Ljava/lang/CharSequence;

    .line 33
    .line 34
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequenceArray(Ljava/lang/String;[Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method
