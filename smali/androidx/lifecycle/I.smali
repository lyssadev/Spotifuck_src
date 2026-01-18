.class public abstract Landroidx/lifecycle/I;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/lifecycle/N;

.field public static final b:Landroidx/lifecycle/N;

.field public static final c:Landroidx/lifecycle/N;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/lifecycle/N;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/lifecycle/I;->a:Landroidx/lifecycle/N;

    .line 7
    .line 8
    new-instance v0, Landroidx/lifecycle/N;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Landroidx/lifecycle/I;->b:Landroidx/lifecycle/N;

    .line 14
    .line 15
    new-instance v0, Landroidx/lifecycle/N;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Landroidx/lifecycle/I;->c:Landroidx/lifecycle/N;

    .line 21
    .line 22
    return-void
.end method

.method public static a(Landroid/app/Activity;Landroidx/lifecycle/l;)V
    .locals 1

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {v0, p0}, LZ0/c;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "event"

    .line 7
    .line 8
    invoke-static {v0, p1}, LZ0/c;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    instance-of v0, p0, Landroidx/lifecycle/r;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast p0, Landroidx/lifecycle/r;

    .line 16
    .line 17
    invoke-interface {p0}, Landroidx/lifecycle/r;->d()Landroidx/lifecycle/t;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    instance-of v0, p0, Landroidx/lifecycle/t;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public static final b(Lk0/e;)V
    .locals 4

    .line 1
    invoke-interface {p0}, Landroidx/lifecycle/r;->d()Landroidx/lifecycle/t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    .line 6
    .line 7
    sget-object v1, Landroidx/lifecycle/m;->b:Landroidx/lifecycle/m;

    .line 8
    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    sget-object v1, Landroidx/lifecycle/m;->c:Landroidx/lifecycle/m;

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    const-string v0, "Failed requirement."

    .line 19
    .line 20
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p0

    .line 24
    :cond_1
    :goto_0
    invoke-interface {p0}, Lk0/e;->b()Lk0/c;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v0, v0, Lk0/c;->d:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lq/f;

    .line 31
    .line 32
    invoke-virtual {v0}, Lq/f;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :cond_2
    move-object v1, v0

    .line 37
    check-cast v1, Lq/b;

    .line 38
    .line 39
    invoke-virtual {v1}, Lq/b;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    invoke-virtual {v1}, Lq/b;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Ljava/util/Map$Entry;

    .line 50
    .line 51
    const-string v2, "components"

    .line 52
    .line 53
    invoke-static {v2, v1}, LZ0/c;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Ljava/lang/String;

    .line 61
    .line 62
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, Lk0/b;

    .line 67
    .line 68
    const-string v3, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    .line 69
    .line 70
    invoke-static {v2, v3}, LZ0/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_2

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    const/4 v1, 0x0

    .line 78
    :goto_1
    if-nez v1, :cond_4

    .line 79
    .line 80
    new-instance v0, Landroidx/lifecycle/J;

    .line 81
    .line 82
    invoke-interface {p0}, Lk0/e;->b()Lk0/c;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    move-object v2, p0

    .line 87
    check-cast v2, Landroidx/lifecycle/Q;

    .line 88
    .line 89
    invoke-direct {v0, v1, v2}, Landroidx/lifecycle/J;-><init>(Lk0/c;Landroidx/lifecycle/Q;)V

    .line 90
    .line 91
    .line 92
    invoke-interface {p0}, Lk0/e;->b()Lk0/c;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    const-string v2, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    .line 97
    .line 98
    invoke-virtual {v1, v2, v0}, Lk0/c;->e(Ljava/lang/String;Lk0/b;)V

    .line 99
    .line 100
    .line 101
    invoke-interface {p0}, Landroidx/lifecycle/r;->d()Landroidx/lifecycle/t;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    new-instance v1, Landroidx/lifecycle/SavedStateHandleAttacher;

    .line 106
    .line 107
    invoke-direct {v1, v0}, Landroidx/lifecycle/SavedStateHandleAttacher;-><init>(Landroidx/lifecycle/J;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v1}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/q;)V

    .line 111
    .line 112
    .line 113
    :cond_4
    return-void
.end method

.method public static c(Landroid/app/Activity;)V
    .locals 3

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {v0, p0}, LZ0/c;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x1d

    .line 9
    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    sget-object v0, Landroidx/lifecycle/E;->Companion:Landroidx/lifecycle/D;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v0, Landroidx/lifecycle/E;

    .line 18
    .line 19
    invoke-direct {v0}, Landroidx/lifecycle/E;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-static {p0, v0}, LA/a;->l(Landroid/app/Activity;Landroidx/lifecycle/E;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string v0, "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-nez v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    new-instance v2, Landroidx/lifecycle/F;

    .line 42
    .line 43
    invoke-direct {v2}, Landroid/app/Fragment;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v2, v0}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/app/FragmentManager;->executePendingTransactions()Z

    .line 54
    .line 55
    .line 56
    :cond_1
    return-void
.end method
