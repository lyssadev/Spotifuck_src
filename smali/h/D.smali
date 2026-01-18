.class public final Lh/D;
.super Lh/s;
.source "SourceFile"

# interfaces
.implements Ln/j;
.implements Landroid/view/LayoutInflater$Factory2;


# static fields
.field public static final n0:Lr/k;

.field public static final o0:[I

.field public static final p0:Z


# instance fields
.field public A:Landroidx/appcompat/widget/ActionBarContextView;

.field public B:Landroid/widget/PopupWindow;

.field public C:Lh/t;

.field public D:LN/Z;

.field public final E:Z

.field public F:Z

.field public G:Landroid/view/ViewGroup;

.field public H:Landroid/widget/TextView;

.field public I:Landroid/view/View;

.field public J:Z

.field public K:Z

.field public L:Z

.field public M:Z

.field public N:Z

.field public O:Z

.field public P:Z

.field public Q:Z

.field public R:[Lh/C;

.field public S:Lh/C;

.field public T:Z

.field public U:Z

.field public V:Z

.field public W:Z

.field public X:Landroid/content/res/Configuration;

.field public final Y:I

.field public Z:I

.field public a0:I

.field public b0:Z

.field public c0:Lh/A;

.field public d0:Lh/A;

.field public e0:Z

.field public f0:I

.field public final g0:Lh/t;

.field public h0:Z

.field public i0:Landroid/graphics/Rect;

.field public j0:Landroid/graphics/Rect;

.field public k0:Lh/G;

.field public l0:Landroid/window/OnBackInvokedDispatcher;

.field public m0:Landroid/window/OnBackInvokedCallback;

.field public final o:Ljava/lang/Object;

.field public final p:Landroid/content/Context;

.field public q:Landroid/view/Window;

.field public r:Lh/z;

.field public final s:Ljava/lang/Object;

.field public t:Lh/N;

.field public u:Lm/h;

.field public v:Ljava/lang/CharSequence;

.field public w:Lo/l0;

.field public x:Lh/u;

.field public y:Lh/u;

.field public z:Lm/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lr/k;

    .line 2
    .line 3
    invoke-direct {v0}, Lr/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lh/D;->n0:Lr/k;

    .line 7
    .line 8
    const v0, 0x1010054

    .line 9
    .line 10
    .line 11
    filled-new-array {v0}, [I

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lh/D;->o0:[I

    .line 16
    .line 17
    const-string v0, "robolectric"

    .line 18
    .line 19
    sget-object v1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    xor-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    sput-boolean v0, Lh/D;->p0:Z

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/Window;Lh/m;Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 p3, 0x0

    .line 5
    iput-object p3, p0, Lh/D;->D:LN/Z;

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lh/D;->E:Z

    .line 9
    .line 10
    const/16 v0, -0x64

    .line 11
    .line 12
    iput v0, p0, Lh/D;->Y:I

    .line 13
    .line 14
    new-instance v1, Lh/t;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, p0, v2}, Lh/t;-><init>(Lh/D;I)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lh/D;->g0:Lh/t;

    .line 21
    .line 22
    iput-object p1, p0, Lh/D;->p:Landroid/content/Context;

    .line 23
    .line 24
    iput-object p4, p0, Lh/D;->o:Ljava/lang/Object;

    .line 25
    .line 26
    instance-of p4, p4, Landroid/app/Dialog;

    .line 27
    .line 28
    if-eqz p4, :cond_2

    .line 29
    .line 30
    :goto_0
    if-eqz p1, :cond_1

    .line 31
    .line 32
    instance-of p4, p1, Lh/l;

    .line 33
    .line 34
    if-eqz p4, :cond_0

    .line 35
    .line 36
    check-cast p1, Lh/l;

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    instance-of p4, p1, Landroid/content/ContextWrapper;

    .line 40
    .line 41
    if-eqz p4, :cond_1

    .line 42
    .line 43
    check-cast p1, Landroid/content/ContextWrapper;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move-object p1, p3

    .line 51
    :goto_1
    if-eqz p1, :cond_2

    .line 52
    .line 53
    invoke-virtual {p1}, Lh/l;->k()Lh/s;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Lh/D;

    .line 58
    .line 59
    iget p1, p1, Lh/D;->Y:I

    .line 60
    .line 61
    iput p1, p0, Lh/D;->Y:I

    .line 62
    .line 63
    :cond_2
    iget p1, p0, Lh/D;->Y:I

    .line 64
    .line 65
    if-ne p1, v0, :cond_3

    .line 66
    .line 67
    sget-object p1, Lh/D;->n0:Lr/k;

    .line 68
    .line 69
    iget-object p4, p0, Lh/D;->o:Ljava/lang/Object;

    .line 70
    .line 71
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object p4

    .line 75
    invoke-virtual {p4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p4

    .line 79
    invoke-virtual {p1, p4, p3}, Lr/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    check-cast p3, Ljava/lang/Integer;

    .line 84
    .line 85
    if-eqz p3, :cond_3

    .line 86
    .line 87
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 88
    .line 89
    .line 90
    move-result p3

    .line 91
    iput p3, p0, Lh/D;->Y:I

    .line 92
    .line 93
    iget-object p3, p0, Lh/D;->o:Ljava/lang/Object;

    .line 94
    .line 95
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    invoke-virtual {p1, p3}, Lr/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    :cond_3
    if-eqz p2, :cond_4

    .line 107
    .line 108
    invoke-virtual {p0, p2}, Lh/D;->m(Landroid/view/Window;)V

    .line 109
    .line 110
    .line 111
    :cond_4
    invoke-static {}, Lo/s;->d()V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public static n(Landroid/content/Context;)LJ/f;
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    return-object v2

    .line 9
    :cond_0
    sget-object v1, Lh/s;->h:LJ/f;

    .line 10
    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    return-object v2

    .line 14
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, Lh/D;->x(Landroid/content/res/Configuration;)LJ/f;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    iget-object v1, v1, LJ/f;->a:LJ/h;

    .line 31
    .line 32
    const/16 v2, 0x18

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    if-lt v0, v2, :cond_6

    .line 36
    .line 37
    invoke-interface {v1}, LJ/h;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    sget-object v0, LJ/f;->b:LJ/f;

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 49
    .line 50
    .line 51
    :goto_0
    invoke-interface {v1}, LJ/h;->size()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    iget-object v4, p0, LJ/f;->a:LJ/h;

    .line 56
    .line 57
    invoke-interface {v4}, LJ/h;->size()I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    add-int/2addr v4, v2

    .line 62
    if-ge v3, v4, :cond_5

    .line 63
    .line 64
    invoke-interface {v1}, LJ/h;->size()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-ge v3, v2, :cond_3

    .line 69
    .line 70
    invoke-interface {v1, v3}, LJ/h;->get(I)Ljava/util/Locale;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    goto :goto_1

    .line 75
    :cond_3
    invoke-interface {v1}, LJ/h;->size()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    sub-int v2, v3, v2

    .line 80
    .line 81
    iget-object v4, p0, LJ/f;->a:LJ/h;

    .line 82
    .line 83
    invoke-interface {v4, v2}, LJ/h;->get(I)Ljava/util/Locale;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    :goto_1
    if-eqz v2, :cond_4

    .line 88
    .line 89
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_5
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    new-array v1, v1, [Ljava/util/Locale;

    .line 100
    .line 101
    invoke-interface {v0, v1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    check-cast v0, [Ljava/util/Locale;

    .line 106
    .line 107
    invoke-static {v0}, LJ/f;->a([Ljava/util/Locale;)LJ/f;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    goto :goto_2

    .line 112
    :cond_6
    invoke-interface {v1}, LJ/h;->isEmpty()Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_7

    .line 117
    .line 118
    sget-object v0, LJ/f;->b:LJ/f;

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_7
    invoke-interface {v1, v3}, LJ/h;->get(I)Ljava/util/Locale;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-static {v0}, Lh/w;->b(Ljava/util/Locale;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-static {v0}, LJ/f;->b(Ljava/lang/String;)LJ/f;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    :goto_2
    iget-object v1, v0, LJ/f;->a:LJ/h;

    .line 134
    .line 135
    invoke-interface {v1}, LJ/h;->isEmpty()Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-eqz v1, :cond_8

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_8
    move-object p0, v0

    .line 143
    :goto_3
    return-object p0
.end method

.method public static r(Landroid/content/Context;ILJ/f;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eq p1, v0, :cond_2

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    if-eq p1, v0, :cond_1

    .line 7
    .line 8
    if-eqz p4, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    .line 25
    .line 26
    and-int/lit8 p0, p0, 0x30

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/16 p0, 0x20

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    const/16 p0, 0x10

    .line 33
    .line 34
    :goto_0
    new-instance p1, Landroid/content/res/Configuration;

    .line 35
    .line 36
    invoke-direct {p1}, Landroid/content/res/Configuration;-><init>()V

    .line 37
    .line 38
    .line 39
    const/4 p4, 0x0

    .line 40
    iput p4, p1, Landroid/content/res/Configuration;->fontScale:F

    .line 41
    .line 42
    if-eqz p3, :cond_3

    .line 43
    .line 44
    invoke-virtual {p1, p3}, Landroid/content/res/Configuration;->setTo(Landroid/content/res/Configuration;)V

    .line 45
    .line 46
    .line 47
    :cond_3
    iget p3, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 48
    .line 49
    and-int/lit8 p3, p3, -0x31

    .line 50
    .line 51
    or-int/2addr p0, p3

    .line 52
    iput p0, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 53
    .line 54
    if-eqz p2, :cond_5

    .line 55
    .line 56
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 57
    .line 58
    const/16 p3, 0x18

    .line 59
    .line 60
    if-lt p0, p3, :cond_4

    .line 61
    .line 62
    invoke-static {p1, p2}, Lh/x;->d(Landroid/content/res/Configuration;LJ/f;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    iget-object p0, p2, LJ/f;->a:LJ/h;

    .line 67
    .line 68
    invoke-interface {p0, v1}, LJ/h;->get(I)Ljava/util/Locale;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-virtual {p1, p2}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {p0, v1}, LJ/h;->get(I)Ljava/util/Locale;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p1, p0}, Landroid/content/res/Configuration;->setLayoutDirection(Ljava/util/Locale;)V

    .line 80
    .line 81
    .line 82
    :cond_5
    :goto_1
    return-object p1
.end method

.method public static x(Landroid/content/res/Configuration;)LJ/f;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lh/x;->b(Landroid/content/res/Configuration;)LJ/f;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object p0, p0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 13
    .line 14
    invoke-static {p0}, Lh/w;->b(Ljava/util/Locale;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, LJ/f;->b(Ljava/lang/String;)LJ/f;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method


# virtual methods
.method public final A(I)V
    .locals 3

    .line 1
    iget v0, p0, Lh/D;->f0:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    shl-int p1, v1, p1

    .line 5
    .line 6
    or-int/2addr p1, v0

    .line 7
    iput p1, p0, Lh/D;->f0:I

    .line 8
    .line 9
    iget-boolean p1, p0, Lh/D;->e0:Z

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lh/D;->q:Landroid/view/Window;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v0, p0, Lh/D;->g0:Lh/t;

    .line 20
    .line 21
    sget-object v2, LN/Q;->a:Ljava/util/WeakHashMap;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    iput-boolean v1, p0, Lh/D;->e0:Z

    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final B(Landroid/content/Context;I)I
    .locals 2

    .line 1
    const/16 v0, -0x64

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq p2, v0, :cond_5

    .line 5
    .line 6
    if-eq p2, v1, :cond_4

    .line 7
    .line 8
    if-eqz p2, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    if-eq p2, v0, :cond_4

    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    if-eq p2, v0, :cond_4

    .line 15
    .line 16
    const/4 v0, 0x3

    .line 17
    if-ne p2, v0, :cond_1

    .line 18
    .line 19
    iget-object p2, p0, Lh/D;->d0:Lh/A;

    .line 20
    .line 21
    if-nez p2, :cond_0

    .line 22
    .line 23
    new-instance p2, Lh/A;

    .line 24
    .line 25
    invoke-direct {p2, p0, p1}, Lh/A;-><init>(Lh/D;Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    iput-object p2, p0, Lh/D;->d0:Lh/A;

    .line 29
    .line 30
    :cond_0
    iget-object p1, p0, Lh/D;->d0:Lh/A;

    .line 31
    .line 32
    invoke-virtual {p1}, Lh/A;->f()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    return p1

    .line 37
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string p2, "Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate."

    .line 40
    .line 41
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :cond_2
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 46
    .line 47
    const/16 v0, 0x17

    .line 48
    .line 49
    if-lt p2, v0, :cond_3

    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    const-string v0, "uimode"

    .line 56
    .line 57
    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    check-cast p2, Landroid/app/UiModeManager;

    .line 62
    .line 63
    invoke-virtual {p2}, Landroid/app/UiModeManager;->getNightMode()I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    if-nez p2, :cond_3

    .line 68
    .line 69
    return v1

    .line 70
    :cond_3
    invoke-virtual {p0, p1}, Lh/D;->w(Landroid/content/Context;)Landroidx/fragment/app/g;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p1}, Landroidx/fragment/app/g;->f()I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    return p1

    .line 79
    :cond_4
    return p2

    .line 80
    :cond_5
    return v1
.end method

.method public final C()Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lh/D;->T:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Lh/D;->T:Z

    .line 5
    .line 6
    invoke-virtual {p0, v1}, Lh/D;->y(I)Lh/C;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    iget-boolean v3, v2, Lh/C;->m:Z

    .line 11
    .line 12
    const/4 v4, 0x1

    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, v2, v4}, Lh/D;->q(Lh/C;Z)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return v4

    .line 21
    :cond_1
    iget-object v0, p0, Lh/D;->z:Lm/a;

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {v0}, Lm/a;->a()V

    .line 26
    .line 27
    .line 28
    return v4

    .line 29
    :cond_2
    invoke-virtual {p0}, Lh/D;->z()V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lh/D;->t:Lh/N;

    .line 33
    .line 34
    if-eqz v0, :cond_5

    .line 35
    .line 36
    iget-object v0, v0, Lh/N;->p:Lo/m0;

    .line 37
    .line 38
    if-eqz v0, :cond_5

    .line 39
    .line 40
    move-object v2, v0

    .line 41
    check-cast v2, Lo/f1;

    .line 42
    .line 43
    iget-object v2, v2, Lo/f1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 44
    .line 45
    iget-object v2, v2, Landroidx/appcompat/widget/Toolbar;->Q:Lo/a1;

    .line 46
    .line 47
    if-eqz v2, :cond_5

    .line 48
    .line 49
    iget-object v2, v2, Lo/a1;->g:Ln/n;

    .line 50
    .line 51
    if-eqz v2, :cond_5

    .line 52
    .line 53
    check-cast v0, Lo/f1;

    .line 54
    .line 55
    iget-object v0, v0, Lo/f1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 56
    .line 57
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->Q:Lo/a1;

    .line 58
    .line 59
    if-nez v0, :cond_3

    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    goto :goto_0

    .line 63
    :cond_3
    iget-object v0, v0, Lo/a1;->g:Ln/n;

    .line 64
    .line 65
    :goto_0
    if-eqz v0, :cond_4

    .line 66
    .line 67
    invoke-virtual {v0}, Ln/n;->collapseActionView()Z

    .line 68
    .line 69
    .line 70
    :cond_4
    return v4

    .line 71
    :cond_5
    return v1
.end method

.method public final D(Lh/C;Landroid/view/KeyEvent;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v1, Lh/C;->m:Z

    .line 6
    .line 7
    if-nez v2, :cond_1b

    .line 8
    .line 9
    iget-boolean v2, v0, Lh/D;->W:Z

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    goto/16 :goto_9

    .line 14
    .line 15
    :cond_0
    iget v2, v1, Lh/C;->a:I

    .line 16
    .line 17
    iget-object v3, v0, Lh/D;->p:Landroid/content/Context;

    .line 18
    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    iget v4, v4, Landroid/content/res/Configuration;->screenLayout:I

    .line 30
    .line 31
    and-int/lit8 v4, v4, 0xf

    .line 32
    .line 33
    const/4 v5, 0x4

    .line 34
    if-ne v4, v5, :cond_1

    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    iget-object v4, v0, Lh/D;->q:Landroid/view/Window;

    .line 38
    .line 39
    invoke-virtual {v4}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    const/4 v5, 0x1

    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    iget-object v6, v1, Lh/C;->h:Ln/l;

    .line 47
    .line 48
    invoke-interface {v4, v2, v6}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-nez v4, :cond_2

    .line 53
    .line 54
    invoke-virtual {v0, v1, v5}, Lh/D;->q(Lh/C;Z)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    const-string v4, "window"

    .line 59
    .line 60
    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    check-cast v4, Landroid/view/WindowManager;

    .line 65
    .line 66
    if-nez v4, :cond_3

    .line 67
    .line 68
    return-void

    .line 69
    :cond_3
    invoke-virtual/range {p0 .. p2}, Lh/D;->F(Lh/C;Landroid/view/KeyEvent;)Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-nez v6, :cond_4

    .line 74
    .line 75
    return-void

    .line 76
    :cond_4
    iget-object v6, v1, Lh/C;->e:Lh/B;

    .line 77
    .line 78
    const/4 v7, 0x0

    .line 79
    const/4 v8, -0x2

    .line 80
    if-eqz v6, :cond_6

    .line 81
    .line 82
    iget-boolean v9, v1, Lh/C;->n:Z

    .line 83
    .line 84
    if-eqz v9, :cond_5

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_5
    iget-object v3, v1, Lh/C;->g:Landroid/view/View;

    .line 88
    .line 89
    if-eqz v3, :cond_18

    .line 90
    .line 91
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    if-eqz v3, :cond_18

    .line 96
    .line 97
    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 98
    .line 99
    const/4 v6, -0x1

    .line 100
    if-ne v3, v6, :cond_18

    .line 101
    .line 102
    const/4 v10, -0x1

    .line 103
    goto/16 :goto_7

    .line 104
    .line 105
    :cond_6
    :goto_0
    if-nez v6, :cond_b

    .line 106
    .line 107
    invoke-virtual/range {p0 .. p0}, Lh/D;->z()V

    .line 108
    .line 109
    .line 110
    iget-object v6, v0, Lh/D;->t:Lh/N;

    .line 111
    .line 112
    if-eqz v6, :cond_7

    .line 113
    .line 114
    invoke-virtual {v6}, Lh/N;->W()Landroid/content/Context;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    goto :goto_1

    .line 119
    :cond_7
    const/4 v6, 0x0

    .line 120
    :goto_1
    if-nez v6, :cond_8

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_8
    move-object v3, v6

    .line 124
    :goto_2
    new-instance v6, Landroid/util/TypedValue;

    .line 125
    .line 126
    invoke-direct {v6}, Landroid/util/TypedValue;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    invoke-virtual {v9}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    .line 134
    .line 135
    .line 136
    move-result-object v9

    .line 137
    invoke-virtual {v3}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 138
    .line 139
    .line 140
    move-result-object v10

    .line 141
    invoke-virtual {v9, v10}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 142
    .line 143
    .line 144
    const v10, 0x7f040004

    .line 145
    .line 146
    .line 147
    invoke-virtual {v9, v10, v6, v5}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 148
    .line 149
    .line 150
    iget v10, v6, Landroid/util/TypedValue;->resourceId:I

    .line 151
    .line 152
    if-eqz v10, :cond_9

    .line 153
    .line 154
    invoke-virtual {v9, v10, v5}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 155
    .line 156
    .line 157
    :cond_9
    const v10, 0x7f040399

    .line 158
    .line 159
    .line 160
    invoke-virtual {v9, v10, v6, v5}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 161
    .line 162
    .line 163
    iget v6, v6, Landroid/util/TypedValue;->resourceId:I

    .line 164
    .line 165
    if-eqz v6, :cond_a

    .line 166
    .line 167
    invoke-virtual {v9, v6, v5}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_a
    const v6, 0x7f110231

    .line 172
    .line 173
    .line 174
    invoke-virtual {v9, v6, v5}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 175
    .line 176
    .line 177
    :goto_3
    new-instance v6, Lm/c;

    .line 178
    .line 179
    invoke-direct {v6, v3, v7}, Lm/c;-><init>(Landroid/content/Context;I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v6}, Lm/c;->getTheme()Landroid/content/res/Resources$Theme;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    invoke-virtual {v3, v9}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 187
    .line 188
    .line 189
    iput-object v6, v1, Lh/C;->j:Lm/c;

    .line 190
    .line 191
    sget-object v3, Lg/a;->j:[I

    .line 192
    .line 193
    invoke-virtual {v6, v3}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    const/16 v6, 0x56

    .line 198
    .line 199
    invoke-virtual {v3, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    iput v6, v1, Lh/C;->b:I

    .line 204
    .line 205
    invoke-virtual {v3, v5, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    iput v6, v1, Lh/C;->d:I

    .line 210
    .line 211
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 212
    .line 213
    .line 214
    new-instance v3, Lh/B;

    .line 215
    .line 216
    iget-object v6, v1, Lh/C;->j:Lm/c;

    .line 217
    .line 218
    invoke-direct {v3, v0, v6}, Lh/B;-><init>(Lh/D;Lm/c;)V

    .line 219
    .line 220
    .line 221
    iput-object v3, v1, Lh/C;->e:Lh/B;

    .line 222
    .line 223
    const/16 v3, 0x51

    .line 224
    .line 225
    iput v3, v1, Lh/C;->c:I

    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_b
    iget-boolean v3, v1, Lh/C;->n:Z

    .line 229
    .line 230
    if-eqz v3, :cond_c

    .line 231
    .line 232
    invoke-virtual {v6}, Landroid/view/ViewGroup;->getChildCount()I

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    if-lez v3, :cond_c

    .line 237
    .line 238
    iget-object v3, v1, Lh/C;->e:Lh/B;

    .line 239
    .line 240
    invoke-virtual {v3}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 241
    .line 242
    .line 243
    :cond_c
    :goto_4
    iget-object v3, v1, Lh/C;->g:Landroid/view/View;

    .line 244
    .line 245
    if-eqz v3, :cond_d

    .line 246
    .line 247
    iput-object v3, v1, Lh/C;->f:Landroid/view/View;

    .line 248
    .line 249
    goto :goto_5

    .line 250
    :cond_d
    iget-object v3, v1, Lh/C;->h:Ln/l;

    .line 251
    .line 252
    if-nez v3, :cond_e

    .line 253
    .line 254
    goto/16 :goto_8

    .line 255
    .line 256
    :cond_e
    iget-object v3, v0, Lh/D;->y:Lh/u;

    .line 257
    .line 258
    if-nez v3, :cond_f

    .line 259
    .line 260
    new-instance v3, Lh/u;

    .line 261
    .line 262
    const/4 v6, 0x3

    .line 263
    invoke-direct {v3, v0, v6}, Lh/u;-><init>(Lh/D;I)V

    .line 264
    .line 265
    .line 266
    iput-object v3, v0, Lh/D;->y:Lh/u;

    .line 267
    .line 268
    :cond_f
    iget-object v3, v0, Lh/D;->y:Lh/u;

    .line 269
    .line 270
    iget-object v6, v1, Lh/C;->i:Ln/h;

    .line 271
    .line 272
    if-nez v6, :cond_10

    .line 273
    .line 274
    new-instance v6, Ln/h;

    .line 275
    .line 276
    iget-object v9, v1, Lh/C;->j:Lm/c;

    .line 277
    .line 278
    invoke-direct {v6, v9}, Ln/h;-><init>(Landroid/content/ContextWrapper;)V

    .line 279
    .line 280
    .line 281
    iput-object v6, v1, Lh/C;->i:Ln/h;

    .line 282
    .line 283
    iput-object v3, v6, Ln/h;->j:Ln/w;

    .line 284
    .line 285
    iget-object v3, v1, Lh/C;->h:Ln/l;

    .line 286
    .line 287
    iget-object v9, v3, Ln/l;->a:Landroid/content/Context;

    .line 288
    .line 289
    invoke-virtual {v3, v6, v9}, Ln/l;->b(Ln/x;Landroid/content/Context;)V

    .line 290
    .line 291
    .line 292
    :cond_10
    iget-object v3, v1, Lh/C;->i:Ln/h;

    .line 293
    .line 294
    iget-object v6, v1, Lh/C;->e:Lh/B;

    .line 295
    .line 296
    iget-object v9, v3, Ln/h;->i:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 297
    .line 298
    if-nez v9, :cond_12

    .line 299
    .line 300
    iget-object v9, v3, Ln/h;->g:Landroid/view/LayoutInflater;

    .line 301
    .line 302
    const v10, 0x7f0c000d

    .line 303
    .line 304
    .line 305
    invoke-virtual {v9, v10, v6, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 306
    .line 307
    .line 308
    move-result-object v6

    .line 309
    check-cast v6, Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 310
    .line 311
    iput-object v6, v3, Ln/h;->i:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 312
    .line 313
    iget-object v6, v3, Ln/h;->k:Ln/g;

    .line 314
    .line 315
    if-nez v6, :cond_11

    .line 316
    .line 317
    new-instance v6, Ln/g;

    .line 318
    .line 319
    invoke-direct {v6, v3}, Ln/g;-><init>(Ln/h;)V

    .line 320
    .line 321
    .line 322
    iput-object v6, v3, Ln/h;->k:Ln/g;

    .line 323
    .line 324
    :cond_11
    iget-object v6, v3, Ln/h;->i:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 325
    .line 326
    iget-object v9, v3, Ln/h;->k:Ln/g;

    .line 327
    .line 328
    invoke-virtual {v6, v9}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 329
    .line 330
    .line 331
    iget-object v6, v3, Ln/h;->i:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 332
    .line 333
    invoke-virtual {v6, v3}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 334
    .line 335
    .line 336
    :cond_12
    iget-object v3, v3, Ln/h;->i:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 337
    .line 338
    iput-object v3, v1, Lh/C;->f:Landroid/view/View;

    .line 339
    .line 340
    if-eqz v3, :cond_1a

    .line 341
    .line 342
    :goto_5
    iget-object v3, v1, Lh/C;->f:Landroid/view/View;

    .line 343
    .line 344
    if-nez v3, :cond_13

    .line 345
    .line 346
    goto/16 :goto_8

    .line 347
    .line 348
    :cond_13
    iget-object v3, v1, Lh/C;->g:Landroid/view/View;

    .line 349
    .line 350
    if-eqz v3, :cond_14

    .line 351
    .line 352
    goto :goto_6

    .line 353
    :cond_14
    iget-object v3, v1, Lh/C;->i:Ln/h;

    .line 354
    .line 355
    iget-object v6, v3, Ln/h;->k:Ln/g;

    .line 356
    .line 357
    if-nez v6, :cond_15

    .line 358
    .line 359
    new-instance v6, Ln/g;

    .line 360
    .line 361
    invoke-direct {v6, v3}, Ln/g;-><init>(Ln/h;)V

    .line 362
    .line 363
    .line 364
    iput-object v6, v3, Ln/h;->k:Ln/g;

    .line 365
    .line 366
    :cond_15
    iget-object v3, v3, Ln/h;->k:Ln/g;

    .line 367
    .line 368
    invoke-virtual {v3}, Ln/g;->getCount()I

    .line 369
    .line 370
    .line 371
    move-result v3

    .line 372
    if-lez v3, :cond_1a

    .line 373
    .line 374
    :goto_6
    iget-object v3, v1, Lh/C;->f:Landroid/view/View;

    .line 375
    .line 376
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 377
    .line 378
    .line 379
    move-result-object v3

    .line 380
    if-nez v3, :cond_16

    .line 381
    .line 382
    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    .line 383
    .line 384
    invoke-direct {v3, v8, v8}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 385
    .line 386
    .line 387
    :cond_16
    iget v6, v1, Lh/C;->b:I

    .line 388
    .line 389
    iget-object v9, v1, Lh/C;->e:Lh/B;

    .line 390
    .line 391
    invoke-virtual {v9, v6}, Lh/B;->setBackgroundResource(I)V

    .line 392
    .line 393
    .line 394
    iget-object v6, v1, Lh/C;->f:Landroid/view/View;

    .line 395
    .line 396
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 397
    .line 398
    .line 399
    move-result-object v6

    .line 400
    instance-of v9, v6, Landroid/view/ViewGroup;

    .line 401
    .line 402
    if-eqz v9, :cond_17

    .line 403
    .line 404
    check-cast v6, Landroid/view/ViewGroup;

    .line 405
    .line 406
    iget-object v9, v1, Lh/C;->f:Landroid/view/View;

    .line 407
    .line 408
    invoke-virtual {v6, v9}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 409
    .line 410
    .line 411
    :cond_17
    iget-object v6, v1, Lh/C;->e:Lh/B;

    .line 412
    .line 413
    iget-object v9, v1, Lh/C;->f:Landroid/view/View;

    .line 414
    .line 415
    invoke-virtual {v6, v9, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 416
    .line 417
    .line 418
    iget-object v3, v1, Lh/C;->f:Landroid/view/View;

    .line 419
    .line 420
    invoke-virtual {v3}, Landroid/view/View;->hasFocus()Z

    .line 421
    .line 422
    .line 423
    move-result v3

    .line 424
    if-nez v3, :cond_18

    .line 425
    .line 426
    iget-object v3, v1, Lh/C;->f:Landroid/view/View;

    .line 427
    .line 428
    invoke-virtual {v3}, Landroid/view/View;->requestFocus()Z

    .line 429
    .line 430
    .line 431
    :cond_18
    const/4 v10, -0x2

    .line 432
    :goto_7
    iput-boolean v7, v1, Lh/C;->l:Z

    .line 433
    .line 434
    new-instance v3, Landroid/view/WindowManager$LayoutParams;

    .line 435
    .line 436
    const/4 v13, 0x0

    .line 437
    const/16 v14, 0x3ea

    .line 438
    .line 439
    const/4 v11, -0x2

    .line 440
    const/4 v12, 0x0

    .line 441
    const/high16 v15, 0x820000

    .line 442
    .line 443
    const/16 v16, -0x3

    .line 444
    .line 445
    move-object v9, v3

    .line 446
    invoke-direct/range {v9 .. v16}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIIIII)V

    .line 447
    .line 448
    .line 449
    iget v6, v1, Lh/C;->c:I

    .line 450
    .line 451
    iput v6, v3, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 452
    .line 453
    iget v6, v1, Lh/C;->d:I

    .line 454
    .line 455
    iput v6, v3, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 456
    .line 457
    iget-object v6, v1, Lh/C;->e:Lh/B;

    .line 458
    .line 459
    invoke-interface {v4, v6, v3}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 460
    .line 461
    .line 462
    iput-boolean v5, v1, Lh/C;->m:Z

    .line 463
    .line 464
    if-nez v2, :cond_19

    .line 465
    .line 466
    invoke-virtual/range {p0 .. p0}, Lh/D;->H()V

    .line 467
    .line 468
    .line 469
    :cond_19
    return-void

    .line 470
    :cond_1a
    :goto_8
    iput-boolean v5, v1, Lh/C;->n:Z

    .line 471
    .line 472
    :cond_1b
    :goto_9
    return-void
.end method

.method public final E(Lh/C;ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->isSystem()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-boolean v0, p1, Lh/C;->k:Z

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p1, p3}, Lh/D;->F(Lh/C;Landroid/view/KeyEvent;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    :cond_1
    iget-object p1, p1, Lh/C;->h:Ln/l;

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    invoke-virtual {p1, p2, p3, v0}, Ln/l;->performShortcut(ILandroid/view/KeyEvent;I)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    :cond_2
    return v1
.end method

.method public final F(Lh/C;Landroid/view/KeyEvent;)Z
    .locals 12

    .line 1
    iget-boolean v0, p0, Lh/D;->W:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-boolean v0, p1, Lh/C;->k:Z

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    return v2

    .line 13
    :cond_1
    iget-object v0, p0, Lh/D;->S:Lh/C;

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    if-eq v0, p1, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0, v0, v1}, Lh/D;->q(Lh/C;Z)V

    .line 20
    .line 21
    .line 22
    :cond_2
    iget-object v0, p0, Lh/D;->q:Landroid/view/Window;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget v3, p1, Lh/C;->a:I

    .line 29
    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    invoke-interface {v0, v3}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    iput-object v4, p1, Lh/C;->g:Landroid/view/View;

    .line 37
    .line 38
    :cond_3
    const/16 v4, 0x6c

    .line 39
    .line 40
    if-eqz v3, :cond_5

    .line 41
    .line 42
    if-ne v3, v4, :cond_4

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_4
    const/4 v5, 0x0

    .line 46
    goto :goto_1

    .line 47
    :cond_5
    :goto_0
    const/4 v5, 0x1

    .line 48
    :goto_1
    if-eqz v5, :cond_6

    .line 49
    .line 50
    iget-object v6, p0, Lh/D;->w:Lo/l0;

    .line 51
    .line 52
    if-eqz v6, :cond_6

    .line 53
    .line 54
    check-cast v6, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 55
    .line 56
    invoke-virtual {v6}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 57
    .line 58
    .line 59
    iget-object v6, v6, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j:Lo/m0;

    .line 60
    .line 61
    check-cast v6, Lo/f1;

    .line 62
    .line 63
    iput-boolean v2, v6, Lo/f1;->l:Z

    .line 64
    .line 65
    :cond_6
    iget-object v6, p1, Lh/C;->g:Landroid/view/View;

    .line 66
    .line 67
    if-nez v6, :cond_1d

    .line 68
    .line 69
    iget-object v6, p1, Lh/C;->h:Ln/l;

    .line 70
    .line 71
    const/4 v7, 0x0

    .line 72
    if-eqz v6, :cond_7

    .line 73
    .line 74
    iget-boolean v8, p1, Lh/C;->o:Z

    .line 75
    .line 76
    if-eqz v8, :cond_17

    .line 77
    .line 78
    :cond_7
    if-nez v6, :cond_10

    .line 79
    .line 80
    iget-object v6, p0, Lh/D;->p:Landroid/content/Context;

    .line 81
    .line 82
    if-eqz v3, :cond_8

    .line 83
    .line 84
    if-ne v3, v4, :cond_c

    .line 85
    .line 86
    :cond_8
    iget-object v4, p0, Lh/D;->w:Lo/l0;

    .line 87
    .line 88
    if-eqz v4, :cond_c

    .line 89
    .line 90
    new-instance v4, Landroid/util/TypedValue;

    .line 91
    .line 92
    invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v6}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    const v9, 0x7f04000b

    .line 100
    .line 101
    .line 102
    invoke-virtual {v8, v9, v4, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 103
    .line 104
    .line 105
    iget v9, v4, Landroid/util/TypedValue;->resourceId:I

    .line 106
    .line 107
    const v10, 0x7f04000c

    .line 108
    .line 109
    .line 110
    if-eqz v9, :cond_9

    .line 111
    .line 112
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    invoke-virtual {v9}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    .line 117
    .line 118
    .line 119
    move-result-object v9

    .line 120
    invoke-virtual {v9, v8}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 121
    .line 122
    .line 123
    iget v11, v4, Landroid/util/TypedValue;->resourceId:I

    .line 124
    .line 125
    invoke-virtual {v9, v11, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v9, v10, v4, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_9
    invoke-virtual {v8, v10, v4, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 133
    .line 134
    .line 135
    move-object v9, v7

    .line 136
    :goto_2
    iget v10, v4, Landroid/util/TypedValue;->resourceId:I

    .line 137
    .line 138
    if-eqz v10, :cond_b

    .line 139
    .line 140
    if-nez v9, :cond_a

    .line 141
    .line 142
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    invoke-virtual {v9}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    .line 147
    .line 148
    .line 149
    move-result-object v9

    .line 150
    invoke-virtual {v9, v8}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 151
    .line 152
    .line 153
    :cond_a
    iget v4, v4, Landroid/util/TypedValue;->resourceId:I

    .line 154
    .line 155
    invoke-virtual {v9, v4, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 156
    .line 157
    .line 158
    :cond_b
    if-eqz v9, :cond_c

    .line 159
    .line 160
    new-instance v4, Lm/c;

    .line 161
    .line 162
    invoke-direct {v4, v6, v1}, Lm/c;-><init>(Landroid/content/Context;I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v4}, Lm/c;->getTheme()Landroid/content/res/Resources$Theme;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    invoke-virtual {v6, v9}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 170
    .line 171
    .line 172
    move-object v6, v4

    .line 173
    :cond_c
    new-instance v4, Ln/l;

    .line 174
    .line 175
    invoke-direct {v4, v6}, Ln/l;-><init>(Landroid/content/Context;)V

    .line 176
    .line 177
    .line 178
    iput-object p0, v4, Ln/l;->e:Ln/j;

    .line 179
    .line 180
    iget-object v6, p1, Lh/C;->h:Ln/l;

    .line 181
    .line 182
    if-ne v4, v6, :cond_d

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_d
    if-eqz v6, :cond_e

    .line 186
    .line 187
    iget-object v8, p1, Lh/C;->i:Ln/h;

    .line 188
    .line 189
    invoke-virtual {v6, v8}, Ln/l;->r(Ln/x;)V

    .line 190
    .line 191
    .line 192
    :cond_e
    iput-object v4, p1, Lh/C;->h:Ln/l;

    .line 193
    .line 194
    iget-object v6, p1, Lh/C;->i:Ln/h;

    .line 195
    .line 196
    if-eqz v6, :cond_f

    .line 197
    .line 198
    iget-object v8, v4, Ln/l;->a:Landroid/content/Context;

    .line 199
    .line 200
    invoke-virtual {v4, v6, v8}, Ln/l;->b(Ln/x;Landroid/content/Context;)V

    .line 201
    .line 202
    .line 203
    :cond_f
    :goto_3
    iget-object v4, p1, Lh/C;->h:Ln/l;

    .line 204
    .line 205
    if-nez v4, :cond_10

    .line 206
    .line 207
    return v1

    .line 208
    :cond_10
    if-eqz v5, :cond_12

    .line 209
    .line 210
    iget-object v4, p0, Lh/D;->w:Lo/l0;

    .line 211
    .line 212
    if-eqz v4, :cond_12

    .line 213
    .line 214
    iget-object v6, p0, Lh/D;->x:Lh/u;

    .line 215
    .line 216
    if-nez v6, :cond_11

    .line 217
    .line 218
    new-instance v6, Lh/u;

    .line 219
    .line 220
    const/4 v8, 0x2

    .line 221
    invoke-direct {v6, p0, v8}, Lh/u;-><init>(Lh/D;I)V

    .line 222
    .line 223
    .line 224
    iput-object v6, p0, Lh/D;->x:Lh/u;

    .line 225
    .line 226
    :cond_11
    iget-object v6, p1, Lh/C;->h:Ln/l;

    .line 227
    .line 228
    iget-object v8, p0, Lh/D;->x:Lh/u;

    .line 229
    .line 230
    check-cast v4, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 231
    .line 232
    invoke-virtual {v4, v6, v8}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l(Ln/l;Ln/w;)V

    .line 233
    .line 234
    .line 235
    :cond_12
    iget-object v4, p1, Lh/C;->h:Ln/l;

    .line 236
    .line 237
    invoke-virtual {v4}, Ln/l;->w()V

    .line 238
    .line 239
    .line 240
    iget-object v4, p1, Lh/C;->h:Ln/l;

    .line 241
    .line 242
    invoke-interface {v0, v3, v4}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    if-nez v3, :cond_16

    .line 247
    .line 248
    iget-object p2, p1, Lh/C;->h:Ln/l;

    .line 249
    .line 250
    if-nez p2, :cond_13

    .line 251
    .line 252
    goto :goto_4

    .line 253
    :cond_13
    if-eqz p2, :cond_14

    .line 254
    .line 255
    iget-object v0, p1, Lh/C;->i:Ln/h;

    .line 256
    .line 257
    invoke-virtual {p2, v0}, Ln/l;->r(Ln/x;)V

    .line 258
    .line 259
    .line 260
    :cond_14
    iput-object v7, p1, Lh/C;->h:Ln/l;

    .line 261
    .line 262
    :goto_4
    if-eqz v5, :cond_15

    .line 263
    .line 264
    iget-object p1, p0, Lh/D;->w:Lo/l0;

    .line 265
    .line 266
    if-eqz p1, :cond_15

    .line 267
    .line 268
    iget-object p2, p0, Lh/D;->x:Lh/u;

    .line 269
    .line 270
    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 271
    .line 272
    invoke-virtual {p1, v7, p2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l(Ln/l;Ln/w;)V

    .line 273
    .line 274
    .line 275
    :cond_15
    return v1

    .line 276
    :cond_16
    iput-boolean v1, p1, Lh/C;->o:Z

    .line 277
    .line 278
    :cond_17
    iget-object v3, p1, Lh/C;->h:Ln/l;

    .line 279
    .line 280
    invoke-virtual {v3}, Ln/l;->w()V

    .line 281
    .line 282
    .line 283
    iget-object v3, p1, Lh/C;->p:Landroid/os/Bundle;

    .line 284
    .line 285
    if-eqz v3, :cond_18

    .line 286
    .line 287
    iget-object v4, p1, Lh/C;->h:Ln/l;

    .line 288
    .line 289
    invoke-virtual {v4, v3}, Ln/l;->s(Landroid/os/Bundle;)V

    .line 290
    .line 291
    .line 292
    iput-object v7, p1, Lh/C;->p:Landroid/os/Bundle;

    .line 293
    .line 294
    :cond_18
    iget-object v3, p1, Lh/C;->g:Landroid/view/View;

    .line 295
    .line 296
    iget-object v4, p1, Lh/C;->h:Ln/l;

    .line 297
    .line 298
    invoke-interface {v0, v1, v3, v4}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-nez v0, :cond_1a

    .line 303
    .line 304
    if-eqz v5, :cond_19

    .line 305
    .line 306
    iget-object p2, p0, Lh/D;->w:Lo/l0;

    .line 307
    .line 308
    if-eqz p2, :cond_19

    .line 309
    .line 310
    iget-object v0, p0, Lh/D;->x:Lh/u;

    .line 311
    .line 312
    check-cast p2, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 313
    .line 314
    invoke-virtual {p2, v7, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l(Ln/l;Ln/w;)V

    .line 315
    .line 316
    .line 317
    :cond_19
    iget-object p1, p1, Lh/C;->h:Ln/l;

    .line 318
    .line 319
    invoke-virtual {p1}, Ln/l;->v()V

    .line 320
    .line 321
    .line 322
    return v1

    .line 323
    :cond_1a
    if-eqz p2, :cond_1b

    .line 324
    .line 325
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    .line 326
    .line 327
    .line 328
    move-result p2

    .line 329
    goto :goto_5

    .line 330
    :cond_1b
    const/4 p2, -0x1

    .line 331
    :goto_5
    invoke-static {p2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    .line 332
    .line 333
    .line 334
    move-result-object p2

    .line 335
    invoke-virtual {p2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    .line 336
    .line 337
    .line 338
    move-result p2

    .line 339
    if-eq p2, v2, :cond_1c

    .line 340
    .line 341
    const/4 p2, 0x1

    .line 342
    goto :goto_6

    .line 343
    :cond_1c
    const/4 p2, 0x0

    .line 344
    :goto_6
    iget-object v0, p1, Lh/C;->h:Ln/l;

    .line 345
    .line 346
    invoke-virtual {v0, p2}, Ln/l;->setQwertyMode(Z)V

    .line 347
    .line 348
    .line 349
    iget-object p2, p1, Lh/C;->h:Ln/l;

    .line 350
    .line 351
    invoke-virtual {p2}, Ln/l;->v()V

    .line 352
    .line 353
    .line 354
    :cond_1d
    iput-boolean v2, p1, Lh/C;->k:Z

    .line 355
    .line 356
    iput-boolean v1, p1, Lh/C;->l:Z

    .line 357
    .line 358
    iput-object p1, p0, Lh/D;->S:Lh/C;

    .line 359
    .line 360
    return v2
.end method

.method public final G()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lh/D;->F:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Landroid/util/AndroidRuntimeException;

    .line 7
    .line 8
    const-string v1, "Window feature must be requested before adding content"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final H()V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    if-lt v0, v1, :cond_4

    .line 6
    .line 7
    iget-object v0, p0, Lh/D;->l0:Landroid/window/OnBackInvokedDispatcher;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-virtual {p0, v1}, Lh/D;->y(I)Lh/C;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-boolean v0, v0, Lh/C;->m:Z

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    :goto_0
    const/4 v1, 0x1

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    iget-object v0, p0, Lh/D;->z:Lm/a;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    .line 30
    .line 31
    iget-object v0, p0, Lh/D;->m0:Landroid/window/OnBackInvokedCallback;

    .line 32
    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    iget-object v0, p0, Lh/D;->l0:Landroid/window/OnBackInvokedDispatcher;

    .line 36
    .line 37
    invoke-static {v0, p0}, Lh/y;->b(Ljava/lang/Object;Lh/D;)Landroid/window/OnBackInvokedCallback;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, Lh/D;->m0:Landroid/window/OnBackInvokedCallback;

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_3
    if-nez v1, :cond_4

    .line 45
    .line 46
    iget-object v0, p0, Lh/D;->m0:Landroid/window/OnBackInvokedCallback;

    .line 47
    .line 48
    if-eqz v0, :cond_4

    .line 49
    .line 50
    iget-object v1, p0, Lh/D;->l0:Landroid/window/OnBackInvokedDispatcher;

    .line 51
    .line 52
    invoke-static {v1, v0}, Lh/y;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    iput-object v0, p0, Lh/D;->m0:Landroid/window/OnBackInvokedCallback;

    .line 57
    .line 58
    :cond_4
    :goto_2
    return-void
.end method

.method public final b()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lh/D;->U:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-virtual {p0, v1, v0}, Lh/D;->l(ZZ)Z

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lh/D;->v()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lh/D;->o:Ljava/lang/Object;

    .line 12
    .line 13
    instance-of v2, v1, Landroid/app/Activity;

    .line 14
    .line 15
    if-eqz v2, :cond_2

    .line 16
    .line 17
    :try_start_0
    check-cast v1, Landroid/app/Activity;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 18
    .line 19
    :try_start_1
    invoke-virtual {v1}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v1, v2}, LC/e;->c(Landroid/app/Activity;Landroid/content/ComponentName;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception v1

    .line 29
    :try_start_2
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 30
    .line 31
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    throw v2
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1

    .line 35
    :catch_1
    const/4 v1, 0x0

    .line 36
    :goto_0
    if-eqz v1, :cond_1

    .line 37
    .line 38
    iget-object v1, p0, Lh/D;->t:Lh/N;

    .line 39
    .line 40
    if-nez v1, :cond_0

    .line 41
    .line 42
    iput-boolean v0, p0, Lh/D;->h0:Z

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    iget-boolean v2, v1, Lh/N;->s:Z

    .line 46
    .line 47
    if-nez v2, :cond_1

    .line 48
    .line 49
    iget-object v2, v1, Lh/N;->p:Lo/m0;

    .line 50
    .line 51
    check-cast v2, Lo/f1;

    .line 52
    .line 53
    iget v3, v2, Lo/f1;->b:I

    .line 54
    .line 55
    iput-boolean v0, v1, Lh/N;->s:Z

    .line 56
    .line 57
    and-int/lit8 v1, v3, -0x5

    .line 58
    .line 59
    const/4 v3, 0x4

    .line 60
    or-int/2addr v1, v3

    .line 61
    invoke-virtual {v2, v1}, Lo/f1;->a(I)V

    .line 62
    .line 63
    .line 64
    :cond_1
    :goto_1
    sget-object v1, Lh/s;->m:Ljava/lang/Object;

    .line 65
    .line 66
    monitor-enter v1

    .line 67
    :try_start_3
    invoke-static {p0}, Lh/s;->e(Lh/D;)V

    .line 68
    .line 69
    .line 70
    sget-object v2, Lh/s;->l:Lr/c;

    .line 71
    .line 72
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 73
    .line 74
    invoke-direct {v3, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v3}, Lr/c;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    monitor-exit v1

    .line 81
    goto :goto_2

    .line 82
    :catchall_0
    move-exception v0

    .line 83
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 84
    throw v0

    .line 85
    :cond_2
    :goto_2
    new-instance v1, Landroid/content/res/Configuration;

    .line 86
    .line 87
    iget-object v2, p0, Lh/D;->p:Landroid/content/Context;

    .line 88
    .line 89
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-direct {v1, v2}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 98
    .line 99
    .line 100
    iput-object v1, p0, Lh/D;->X:Landroid/content/res/Configuration;

    .line 101
    .line 102
    iput-boolean v0, p0, Lh/D;->V:Z

    .line 103
    .line 104
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lh/D;->o:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, v0, Landroid/app/Activity;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lh/s;->m:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    invoke-static {p0}, Lh/s;->e(Lh/D;)V

    .line 11
    .line 12
    .line 13
    monitor-exit v0

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v1

    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw v1

    .line 18
    :cond_0
    :goto_0
    iget-boolean v0, p0, Lh/D;->e0:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lh/D;->q:Landroid/view/Window;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v1, p0, Lh/D;->g0:Lh/t;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 31
    .line 32
    .line 33
    :cond_1
    const/4 v0, 0x1

    .line 34
    iput-boolean v0, p0, Lh/D;->W:Z

    .line 35
    .line 36
    iget v0, p0, Lh/D;->Y:I

    .line 37
    .line 38
    const/16 v1, -0x64

    .line 39
    .line 40
    if-eq v0, v1, :cond_2

    .line 41
    .line 42
    iget-object v0, p0, Lh/D;->o:Ljava/lang/Object;

    .line 43
    .line 44
    instance-of v1, v0, Landroid/app/Activity;

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    check-cast v0, Landroid/app/Activity;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    sget-object v0, Lh/D;->n0:Lr/k;

    .line 57
    .line 58
    iget-object v1, p0, Lh/D;->o:Ljava/lang/Object;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iget v2, p0, Lh/D;->Y:I

    .line 69
    .line 70
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v0, v1, v2}, Lr/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    sget-object v0, Lh/D;->n0:Lr/k;

    .line 79
    .line 80
    iget-object v1, p0, Lh/D;->o:Ljava/lang/Object;

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v0, v1}, Lr/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    :goto_1
    iget-object v0, p0, Lh/D;->c0:Lh/A;

    .line 94
    .line 95
    if-eqz v0, :cond_3

    .line 96
    .line 97
    invoke-virtual {v0}, Landroidx/fragment/app/g;->c()V

    .line 98
    .line 99
    .line 100
    :cond_3
    iget-object v0, p0, Lh/D;->d0:Lh/A;

    .line 101
    .line 102
    if-eqz v0, :cond_4

    .line 103
    .line 104
    invoke-virtual {v0}, Landroidx/fragment/app/g;->c()V

    .line 105
    .line 106
    .line 107
    :cond_4
    return-void
.end method

.method public final d(Ln/l;Landroid/view/MenuItem;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lh/D;->q:Landroid/view/Window;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    iget-boolean v2, p0, Lh/D;->W:Z

    .line 11
    .line 12
    if-nez v2, :cond_3

    .line 13
    .line 14
    invoke-virtual {p1}, Ln/l;->k()Ln/l;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object v2, p0, Lh/D;->R:[Lh/C;

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    array-length v3, v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v3, 0x0

    .line 25
    :goto_0
    const/4 v4, 0x0

    .line 26
    :goto_1
    if-ge v4, v3, :cond_2

    .line 27
    .line 28
    aget-object v5, v2, v4

    .line 29
    .line 30
    if-eqz v5, :cond_1

    .line 31
    .line 32
    iget-object v6, v5, Lh/C;->h:Ln/l;

    .line 33
    .line 34
    if-ne v6, p1, :cond_1

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    const/4 v5, 0x0

    .line 41
    :goto_2
    if-eqz v5, :cond_3

    .line 42
    .line 43
    iget p1, v5, Lh/C;->a:I

    .line 44
    .line 45
    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    return p1

    .line 50
    :cond_3
    return v1
.end method

.method public final f(Ln/l;)V
    .locals 5

    .line 1
    iget-object p1, p0, Lh/D;->w:Lo/l0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    if-eqz p1, :cond_5

    .line 6
    .line 7
    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 10
    .line 11
    .line 12
    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j:Lo/m0;

    .line 13
    .line 14
    check-cast p1, Lo/f1;

    .line 15
    .line 16
    iget-object p1, p1, Lo/f1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_5

    .line 23
    .line 24
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->f:Landroidx/appcompat/widget/ActionMenuView;

    .line 25
    .line 26
    if-eqz p1, :cond_5

    .line 27
    .line 28
    iget-boolean p1, p1, Landroidx/appcompat/widget/ActionMenuView;->x:Z

    .line 29
    .line 30
    if-eqz p1, :cond_5

    .line 31
    .line 32
    iget-object p1, p0, Lh/D;->p:Landroid/content/Context;

    .line 33
    .line 34
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    iget-object p1, p0, Lh/D;->w:Lo/l0;

    .line 45
    .line 46
    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 47
    .line 48
    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 49
    .line 50
    .line 51
    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j:Lo/m0;

    .line 52
    .line 53
    check-cast p1, Lo/f1;

    .line 54
    .line 55
    iget-object p1, p1, Lo/f1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 56
    .line 57
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->f:Landroidx/appcompat/widget/ActionMenuView;

    .line 58
    .line 59
    if-eqz p1, :cond_5

    .line 60
    .line 61
    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->y:Lo/k;

    .line 62
    .line 63
    if-eqz p1, :cond_5

    .line 64
    .line 65
    iget-object v2, p1, Lo/k;->z:Lo/i;

    .line 66
    .line 67
    if-nez v2, :cond_0

    .line 68
    .line 69
    invoke-virtual {p1}, Lo/k;->i()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_5

    .line 74
    .line 75
    :cond_0
    iget-object p1, p0, Lh/D;->q:Landroid/view/Window;

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iget-object v2, p0, Lh/D;->w:Lo/l0;

    .line 82
    .line 83
    check-cast v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 84
    .line 85
    invoke-virtual {v2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 86
    .line 87
    .line 88
    iget-object v2, v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j:Lo/m0;

    .line 89
    .line 90
    check-cast v2, Lo/f1;

    .line 91
    .line 92
    iget-object v2, v2, Lo/f1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 93
    .line 94
    iget-object v2, v2, Landroidx/appcompat/widget/Toolbar;->f:Landroidx/appcompat/widget/ActionMenuView;

    .line 95
    .line 96
    if-eqz v2, :cond_1

    .line 97
    .line 98
    iget-object v2, v2, Landroidx/appcompat/widget/ActionMenuView;->y:Lo/k;

    .line 99
    .line 100
    if-eqz v2, :cond_1

    .line 101
    .line 102
    invoke-virtual {v2}, Lo/k;->i()Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_1

    .line 107
    .line 108
    const/4 v2, 0x1

    .line 109
    goto :goto_0

    .line 110
    :cond_1
    const/4 v2, 0x0

    .line 111
    :goto_0
    const/16 v3, 0x6c

    .line 112
    .line 113
    if-eqz v2, :cond_3

    .line 114
    .line 115
    iget-object v1, p0, Lh/D;->w:Lo/l0;

    .line 116
    .line 117
    check-cast v1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 118
    .line 119
    invoke-virtual {v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 120
    .line 121
    .line 122
    iget-object v1, v1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j:Lo/m0;

    .line 123
    .line 124
    check-cast v1, Lo/f1;

    .line 125
    .line 126
    iget-object v1, v1, Lo/f1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 127
    .line 128
    iget-object v1, v1, Landroidx/appcompat/widget/Toolbar;->f:Landroidx/appcompat/widget/ActionMenuView;

    .line 129
    .line 130
    if-eqz v1, :cond_2

    .line 131
    .line 132
    iget-object v1, v1, Landroidx/appcompat/widget/ActionMenuView;->y:Lo/k;

    .line 133
    .line 134
    if-eqz v1, :cond_2

    .line 135
    .line 136
    invoke-virtual {v1}, Lo/k;->e()Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    :cond_2
    iget-boolean v1, p0, Lh/D;->W:Z

    .line 141
    .line 142
    if-nez v1, :cond_6

    .line 143
    .line 144
    invoke-virtual {p0, v0}, Lh/D;->y(I)Lh/C;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    iget-object v0, v0, Lh/C;->h:Ln/l;

    .line 149
    .line 150
    invoke-interface {p1, v3, v0}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_3
    if-eqz p1, :cond_6

    .line 155
    .line 156
    iget-boolean v2, p0, Lh/D;->W:Z

    .line 157
    .line 158
    if-nez v2, :cond_6

    .line 159
    .line 160
    iget-boolean v2, p0, Lh/D;->e0:Z

    .line 161
    .line 162
    if-eqz v2, :cond_4

    .line 163
    .line 164
    iget v2, p0, Lh/D;->f0:I

    .line 165
    .line 166
    and-int/2addr v1, v2

    .line 167
    if-eqz v1, :cond_4

    .line 168
    .line 169
    iget-object v1, p0, Lh/D;->q:Landroid/view/Window;

    .line 170
    .line 171
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    iget-object v2, p0, Lh/D;->g0:Lh/t;

    .line 176
    .line 177
    invoke-virtual {v1, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2}, Lh/t;->run()V

    .line 181
    .line 182
    .line 183
    :cond_4
    invoke-virtual {p0, v0}, Lh/D;->y(I)Lh/C;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    iget-object v2, v1, Lh/C;->h:Ln/l;

    .line 188
    .line 189
    if-eqz v2, :cond_6

    .line 190
    .line 191
    iget-boolean v4, v1, Lh/C;->o:Z

    .line 192
    .line 193
    if-nez v4, :cond_6

    .line 194
    .line 195
    iget-object v4, v1, Lh/C;->g:Landroid/view/View;

    .line 196
    .line 197
    invoke-interface {p1, v0, v4, v2}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-eqz v0, :cond_6

    .line 202
    .line 203
    iget-object v0, v1, Lh/C;->h:Ln/l;

    .line 204
    .line 205
    invoke-interface {p1, v3, v0}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 206
    .line 207
    .line 208
    iget-object p1, p0, Lh/D;->w:Lo/l0;

    .line 209
    .line 210
    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 211
    .line 212
    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 213
    .line 214
    .line 215
    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j:Lo/m0;

    .line 216
    .line 217
    check-cast p1, Lo/f1;

    .line 218
    .line 219
    iget-object p1, p1, Lo/f1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 220
    .line 221
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->f:Landroidx/appcompat/widget/ActionMenuView;

    .line 222
    .line 223
    if-eqz p1, :cond_6

    .line 224
    .line 225
    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->y:Lo/k;

    .line 226
    .line 227
    if-eqz p1, :cond_6

    .line 228
    .line 229
    invoke-virtual {p1}, Lo/k;->l()Z

    .line 230
    .line 231
    .line 232
    goto :goto_1

    .line 233
    :cond_5
    invoke-virtual {p0, v0}, Lh/D;->y(I)Lh/C;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    iput-boolean v1, p1, Lh/C;->n:Z

    .line 238
    .line 239
    invoke-virtual {p0, p1, v0}, Lh/D;->q(Lh/C;Z)V

    .line 240
    .line 241
    .line 242
    const/4 v0, 0x0

    .line 243
    invoke-virtual {p0, p1, v0}, Lh/D;->D(Lh/C;Landroid/view/KeyEvent;)V

    .line 244
    .line 245
    .line 246
    :cond_6
    :goto_1
    return-void
.end method

.method public final g(I)Z
    .locals 5

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const/16 v1, 0x6d

    .line 4
    .line 5
    const/16 v2, 0x6c

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    const/16 p1, 0x6c

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/16 v0, 0x9

    .line 13
    .line 14
    if-ne p1, v0, :cond_1

    .line 15
    .line 16
    const/16 p1, 0x6d

    .line 17
    .line 18
    :cond_1
    :goto_0
    iget-boolean v0, p0, Lh/D;->P:Z

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    if-ne p1, v2, :cond_2

    .line 24
    .line 25
    return v3

    .line 26
    :cond_2
    iget-boolean v0, p0, Lh/D;->L:Z

    .line 27
    .line 28
    const/4 v4, 0x1

    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    if-ne p1, v4, :cond_3

    .line 32
    .line 33
    iput-boolean v3, p0, Lh/D;->L:Z

    .line 34
    .line 35
    :cond_3
    if-eq p1, v4, :cond_9

    .line 36
    .line 37
    const/4 v0, 0x2

    .line 38
    if-eq p1, v0, :cond_8

    .line 39
    .line 40
    const/4 v0, 0x5

    .line 41
    if-eq p1, v0, :cond_7

    .line 42
    .line 43
    const/16 v0, 0xa

    .line 44
    .line 45
    if-eq p1, v0, :cond_6

    .line 46
    .line 47
    if-eq p1, v2, :cond_5

    .line 48
    .line 49
    if-eq p1, v1, :cond_4

    .line 50
    .line 51
    iget-object v0, p0, Lh/D;->q:Landroid/view/Window;

    .line 52
    .line 53
    invoke-virtual {v0, p1}, Landroid/view/Window;->requestFeature(I)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    return p1

    .line 58
    :cond_4
    invoke-virtual {p0}, Lh/D;->G()V

    .line 59
    .line 60
    .line 61
    iput-boolean v4, p0, Lh/D;->M:Z

    .line 62
    .line 63
    return v4

    .line 64
    :cond_5
    invoke-virtual {p0}, Lh/D;->G()V

    .line 65
    .line 66
    .line 67
    iput-boolean v4, p0, Lh/D;->L:Z

    .line 68
    .line 69
    return v4

    .line 70
    :cond_6
    invoke-virtual {p0}, Lh/D;->G()V

    .line 71
    .line 72
    .line 73
    iput-boolean v4, p0, Lh/D;->N:Z

    .line 74
    .line 75
    return v4

    .line 76
    :cond_7
    invoke-virtual {p0}, Lh/D;->G()V

    .line 77
    .line 78
    .line 79
    iput-boolean v4, p0, Lh/D;->K:Z

    .line 80
    .line 81
    return v4

    .line 82
    :cond_8
    invoke-virtual {p0}, Lh/D;->G()V

    .line 83
    .line 84
    .line 85
    iput-boolean v4, p0, Lh/D;->J:Z

    .line 86
    .line 87
    return v4

    .line 88
    :cond_9
    invoke-virtual {p0}, Lh/D;->G()V

    .line 89
    .line 90
    .line 91
    iput-boolean v4, p0, Lh/D;->P:Z

    .line 92
    .line 93
    return v4
.end method

.method public final h(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh/D;->u()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lh/D;->G:Landroid/view/ViewGroup;

    .line 5
    .line 6
    const v1, 0x1020002

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lh/D;->p:Landroid/content/Context;

    .line 19
    .line 20
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lh/D;->r:Lh/z;

    .line 28
    .line 29
    iget-object v0, p0, Lh/D;->q:Landroid/view/Window;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p1, v0}, Lh/z;->a(Landroid/view/Window$Callback;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final i(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh/D;->u()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lh/D;->G:Landroid/view/ViewGroup;

    .line 5
    .line 6
    const v1, 0x1020002

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lh/D;->r:Lh/z;

    .line 22
    .line 23
    iget-object v0, p0, Lh/D;->q:Landroid/view/Window;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1, v0}, Lh/z;->a(Landroid/view/Window$Callback;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final j(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh/D;->u()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lh/D;->G:Landroid/view/ViewGroup;

    .line 5
    .line 6
    const v1, 0x1020002

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lh/D;->r:Lh/z;

    .line 22
    .line 23
    iget-object p2, p0, Lh/D;->q:Landroid/view/Window;

    .line 24
    .line 25
    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p1, p2}, Lh/z;->a(Landroid/view/Window$Callback;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final k(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lh/D;->v:Ljava/lang/CharSequence;

    .line 2
    .line 3
    iget-object v0, p0, Lh/D;->w:Lo/l0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Lo/l0;->setWindowTitle(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lh/D;->t:Lh/N;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, v0, Lh/N;->p:Lo/m0;

    .line 16
    .line 17
    check-cast v0, Lo/f1;

    .line 18
    .line 19
    iget-boolean v1, v0, Lo/f1;->g:Z

    .line 20
    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    iput-object p1, v0, Lo/f1;->h:Ljava/lang/CharSequence;

    .line 24
    .line 25
    iget v1, v0, Lo/f1;->b:I

    .line 26
    .line 27
    and-int/lit8 v1, v1, 0x8

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    iget-object v1, v0, Lo/f1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 32
    .line 33
    invoke-virtual {v1, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    iget-boolean v0, v0, Lo/f1;->g:Z

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0, p1}, LN/Q;->q(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget-object v0, p0, Lh/D;->H:Landroid/widget/TextView;

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    :goto_0
    return-void
.end method

.method public final l(ZZ)Z
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-boolean v0, v1, Lh/D;->W:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    iget v0, v1, Lh/D;->Y:I

    .line 10
    .line 11
    const/16 v3, -0x64

    .line 12
    .line 13
    if-eq v0, v3, :cond_1

    .line 14
    .line 15
    :goto_0
    move v3, v0

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    sget v0, Lh/s;->g:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :goto_1
    iget-object v4, v1, Lh/D;->p:Landroid/content/Context;

    .line 21
    .line 22
    invoke-virtual {v1, v4, v3}, Lh/D;->B(Landroid/content/Context;I)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 27
    .line 28
    const/16 v6, 0x21

    .line 29
    .line 30
    const/4 v7, 0x0

    .line 31
    if-ge v5, v6, :cond_2

    .line 32
    .line 33
    invoke-static {v4}, Lh/D;->n(Landroid/content/Context;)LJ/f;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    move-object v6, v7

    .line 39
    :goto_2
    if-nez p2, :cond_3

    .line 40
    .line 41
    if-eqz v6, :cond_3

    .line 42
    .line 43
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    invoke-static {v6}, Lh/D;->x(Landroid/content/res/Configuration;)LJ/f;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    :cond_3
    invoke-static {v4, v0, v6, v7, v2}, Lh/D;->r(Landroid/content/Context;ILJ/f;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-boolean v8, v1, Lh/D;->b0:Z

    .line 60
    .line 61
    iget-object v9, v1, Lh/D;->o:Ljava/lang/Object;

    .line 62
    .line 63
    const/16 v10, 0x18

    .line 64
    .line 65
    const/4 v11, 0x1

    .line 66
    if-nez v8, :cond_7

    .line 67
    .line 68
    instance-of v8, v9, Landroid/app/Activity;

    .line 69
    .line 70
    if-eqz v8, :cond_7

    .line 71
    .line 72
    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    if-nez v8, :cond_4

    .line 77
    .line 78
    const/4 v5, 0x0

    .line 79
    goto :goto_5

    .line 80
    :cond_4
    const/16 v12, 0x1d

    .line 81
    .line 82
    if-lt v5, v12, :cond_5

    .line 83
    .line 84
    const/high16 v5, 0x100c0000

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_5
    if-lt v5, v10, :cond_6

    .line 88
    .line 89
    const/high16 v5, 0xc0000

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_6
    const/4 v5, 0x0

    .line 93
    :goto_3
    :try_start_0
    new-instance v12, Landroid/content/ComponentName;

    .line 94
    .line 95
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    move-result-object v13

    .line 99
    invoke-direct {v12, v4, v13}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v8, v12, v5}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    if-eqz v5, :cond_7

    .line 107
    .line 108
    iget v5, v5, Landroid/content/pm/ActivityInfo;->configChanges:I

    .line 109
    .line 110
    iput v5, v1, Lh/D;->a0:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :catch_0
    iput v2, v1, Lh/D;->a0:I

    .line 114
    .line 115
    :cond_7
    :goto_4
    iput-boolean v11, v1, Lh/D;->b0:Z

    .line 116
    .line 117
    iget v5, v1, Lh/D;->a0:I

    .line 118
    .line 119
    :goto_5
    iget-object v8, v1, Lh/D;->X:Landroid/content/res/Configuration;

    .line 120
    .line 121
    if-nez v8, :cond_8

    .line 122
    .line 123
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    invoke-virtual {v8}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    :cond_8
    iget v12, v8, Landroid/content/res/Configuration;->uiMode:I

    .line 132
    .line 133
    and-int/lit8 v12, v12, 0x30

    .line 134
    .line 135
    iget v13, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 136
    .line 137
    and-int/lit8 v13, v13, 0x30

    .line 138
    .line 139
    invoke-static {v8}, Lh/D;->x(Landroid/content/res/Configuration;)LJ/f;

    .line 140
    .line 141
    .line 142
    move-result-object v8

    .line 143
    if-nez v6, :cond_9

    .line 144
    .line 145
    move-object v6, v7

    .line 146
    goto :goto_6

    .line 147
    :cond_9
    invoke-static {v0}, Lh/D;->x(Landroid/content/res/Configuration;)LJ/f;

    .line 148
    .line 149
    .line 150
    move-result-object v6

    .line 151
    :goto_6
    if-eq v12, v13, :cond_a

    .line 152
    .line 153
    const/16 v12, 0x200

    .line 154
    .line 155
    goto :goto_7

    .line 156
    :cond_a
    const/4 v12, 0x0

    .line 157
    :goto_7
    if-eqz v6, :cond_b

    .line 158
    .line 159
    invoke-virtual {v8, v6}, LJ/f;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v8

    .line 163
    if-nez v8, :cond_b

    .line 164
    .line 165
    or-int/lit16 v12, v12, 0x2004

    .line 166
    .line 167
    :cond_b
    not-int v8, v5

    .line 168
    and-int/2addr v8, v12

    .line 169
    const/16 v14, 0x1c

    .line 170
    .line 171
    if-eqz v8, :cond_f

    .line 172
    .line 173
    if-eqz p1, :cond_f

    .line 174
    .line 175
    iget-boolean v8, v1, Lh/D;->U:Z

    .line 176
    .line 177
    if-eqz v8, :cond_f

    .line 178
    .line 179
    sget-boolean v8, Lh/D;->p0:Z

    .line 180
    .line 181
    if-nez v8, :cond_c

    .line 182
    .line 183
    iget-boolean v8, v1, Lh/D;->V:Z

    .line 184
    .line 185
    if-eqz v8, :cond_f

    .line 186
    .line 187
    :cond_c
    instance-of v8, v9, Landroid/app/Activity;

    .line 188
    .line 189
    if-eqz v8, :cond_f

    .line 190
    .line 191
    move-object v8, v9

    .line 192
    check-cast v8, Landroid/app/Activity;

    .line 193
    .line 194
    invoke-virtual {v8}, Landroid/app/Activity;->isChild()Z

    .line 195
    .line 196
    .line 197
    move-result v15

    .line 198
    if-nez v15, :cond_f

    .line 199
    .line 200
    sget v15, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 201
    .line 202
    const/16 v11, 0x1f

    .line 203
    .line 204
    if-lt v15, v11, :cond_d

    .line 205
    .line 206
    and-int/lit16 v11, v12, 0x2000

    .line 207
    .line 208
    if-eqz v11, :cond_d

    .line 209
    .line 210
    invoke-virtual {v8}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 211
    .line 212
    .line 213
    move-result-object v11

    .line 214
    invoke-virtual {v11}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 215
    .line 216
    .line 217
    move-result-object v11

    .line 218
    invoke-virtual {v0}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    invoke-virtual {v11, v0}, Landroid/view/View;->setLayoutDirection(I)V

    .line 223
    .line 224
    .line 225
    :cond_d
    if-lt v15, v14, :cond_e

    .line 226
    .line 227
    invoke-virtual {v8}, Landroid/app/Activity;->recreate()V

    .line 228
    .line 229
    .line 230
    goto :goto_8

    .line 231
    :cond_e
    new-instance v0, Landroid/os/Handler;

    .line 232
    .line 233
    invoke-virtual {v8}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 234
    .line 235
    .line 236
    move-result-object v11

    .line 237
    invoke-direct {v0, v11}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 238
    .line 239
    .line 240
    new-instance v11, LC/a;

    .line 241
    .line 242
    const/4 v15, 0x0

    .line 243
    invoke-direct {v11, v15, v8}, LC/a;-><init>(ILjava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0, v11}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 247
    .line 248
    .line 249
    :goto_8
    const/4 v0, 0x1

    .line 250
    goto :goto_9

    .line 251
    :cond_f
    const/4 v0, 0x0

    .line 252
    :goto_9
    if-nez v0, :cond_23

    .line 253
    .line 254
    if-eqz v12, :cond_23

    .line 255
    .line 256
    and-int v0, v12, v5

    .line 257
    .line 258
    if-ne v0, v12, :cond_10

    .line 259
    .line 260
    const/4 v5, 0x1

    .line 261
    goto :goto_a

    .line 262
    :cond_10
    const/4 v5, 0x0

    .line 263
    :goto_a
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 264
    .line 265
    .line 266
    move-result-object v8

    .line 267
    new-instance v11, Landroid/content/res/Configuration;

    .line 268
    .line 269
    invoke-virtual {v8}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-direct {v11, v0}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v8}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 281
    .line 282
    and-int/lit8 v0, v0, -0x31

    .line 283
    .line 284
    or-int/2addr v0, v13

    .line 285
    iput v0, v11, Landroid/content/res/Configuration;->uiMode:I

    .line 286
    .line 287
    if-eqz v6, :cond_12

    .line 288
    .line 289
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 290
    .line 291
    if-lt v0, v10, :cond_11

    .line 292
    .line 293
    invoke-static {v11, v6}, Lh/x;->d(Landroid/content/res/Configuration;LJ/f;)V

    .line 294
    .line 295
    .line 296
    goto :goto_b

    .line 297
    :cond_11
    iget-object v0, v6, LJ/f;->a:LJ/h;

    .line 298
    .line 299
    invoke-interface {v0, v2}, LJ/h;->get(I)Ljava/util/Locale;

    .line 300
    .line 301
    .line 302
    move-result-object v13

    .line 303
    invoke-virtual {v11, v13}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    .line 304
    .line 305
    .line 306
    invoke-interface {v0, v2}, LJ/h;->get(I)Ljava/util/Locale;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-virtual {v11, v0}, Landroid/content/res/Configuration;->setLayoutDirection(Ljava/util/Locale;)V

    .line 311
    .line 312
    .line 313
    :cond_12
    :goto_b
    invoke-virtual {v8, v11, v7}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    .line 314
    .line 315
    .line 316
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 317
    .line 318
    const/16 v13, 0x1a

    .line 319
    .line 320
    const/16 v15, 0x17

    .line 321
    .line 322
    if-ge v0, v13, :cond_1f

    .line 323
    .line 324
    if-lt v0, v14, :cond_13

    .line 325
    .line 326
    goto/16 :goto_18

    .line 327
    .line 328
    :cond_13
    const-string v13, "mDrawableCache"

    .line 329
    .line 330
    const-class v14, Landroid/content/res/Resources;

    .line 331
    .line 332
    const-string v7, "ResourcesFlusher"

    .line 333
    .line 334
    if-lt v0, v10, :cond_19

    .line 335
    .line 336
    sget-boolean v0, LT0/g;->h:Z

    .line 337
    .line 338
    if-nez v0, :cond_14

    .line 339
    .line 340
    :try_start_1
    const-string v0, "mResourcesImpl"

    .line 341
    .line 342
    invoke-virtual {v14, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    sput-object v0, LT0/g;->g:Ljava/lang/reflect/Field;

    .line 347
    .line 348
    const/4 v14, 0x1

    .line 349
    invoke-virtual {v0, v14}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_1

    .line 350
    .line 351
    .line 352
    :goto_c
    const/4 v14, 0x1

    .line 353
    goto :goto_d

    .line 354
    :catch_1
    move-exception v0

    .line 355
    const-string v14, "Could not retrieve Resources#mResourcesImpl field"

    .line 356
    .line 357
    invoke-static {v7, v14, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 358
    .line 359
    .line 360
    goto :goto_c

    .line 361
    :goto_d
    sput-boolean v14, LT0/g;->h:Z

    .line 362
    .line 363
    :cond_14
    sget-object v0, LT0/g;->g:Ljava/lang/reflect/Field;

    .line 364
    .line 365
    if-nez v0, :cond_15

    .line 366
    .line 367
    goto/16 :goto_18

    .line 368
    .line 369
    :cond_15
    :try_start_2
    invoke-virtual {v0, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2

    .line 373
    move-object v8, v0

    .line 374
    goto :goto_e

    .line 375
    :catch_2
    move-exception v0

    .line 376
    move-object v8, v0

    .line 377
    const-string v0, "Could not retrieve value from Resources#mResourcesImpl"

    .line 378
    .line 379
    invoke-static {v7, v0, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 380
    .line 381
    .line 382
    const/4 v8, 0x0

    .line 383
    :goto_e
    if-nez v8, :cond_16

    .line 384
    .line 385
    goto/16 :goto_18

    .line 386
    .line 387
    :cond_16
    sget-boolean v0, LT0/g;->b:Z

    .line 388
    .line 389
    if-nez v0, :cond_17

    .line 390
    .line 391
    :try_start_3
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    invoke-virtual {v0, v13}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    sput-object v0, LT0/g;->a:Ljava/lang/reflect/Field;

    .line 400
    .line 401
    const/4 v13, 0x1

    .line 402
    invoke-virtual {v0, v13}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_3 .. :try_end_3} :catch_3

    .line 403
    .line 404
    .line 405
    :goto_f
    const/4 v13, 0x1

    .line 406
    goto :goto_10

    .line 407
    :catch_3
    move-exception v0

    .line 408
    const-string v13, "Could not retrieve ResourcesImpl#mDrawableCache field"

    .line 409
    .line 410
    invoke-static {v7, v13, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 411
    .line 412
    .line 413
    goto :goto_f

    .line 414
    :goto_10
    sput-boolean v13, LT0/g;->b:Z

    .line 415
    .line 416
    :cond_17
    sget-object v0, LT0/g;->a:Ljava/lang/reflect/Field;

    .line 417
    .line 418
    if-eqz v0, :cond_18

    .line 419
    .line 420
    :try_start_4
    invoke-virtual {v0, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v7
    :try_end_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_4 .. :try_end_4} :catch_4

    .line 424
    goto :goto_11

    .line 425
    :catch_4
    move-exception v0

    .line 426
    move-object v8, v0

    .line 427
    const-string v0, "Could not retrieve value from ResourcesImpl#mDrawableCache"

    .line 428
    .line 429
    invoke-static {v7, v0, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 430
    .line 431
    .line 432
    :cond_18
    const/4 v7, 0x0

    .line 433
    :goto_11
    if-eqz v7, :cond_1f

    .line 434
    .line 435
    invoke-static {v7}, LT0/g;->m(Ljava/lang/Object;)V

    .line 436
    .line 437
    .line 438
    goto/16 :goto_18

    .line 439
    .line 440
    :cond_19
    const-string v2, "Could not retrieve value from Resources#mDrawableCache"

    .line 441
    .line 442
    const-string v10, "Could not retrieve Resources#mDrawableCache field"

    .line 443
    .line 444
    if-lt v0, v15, :cond_1d

    .line 445
    .line 446
    sget-boolean v0, LT0/g;->b:Z

    .line 447
    .line 448
    if-nez v0, :cond_1a

    .line 449
    .line 450
    :try_start_5
    invoke-virtual {v14, v13}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    sput-object v0, LT0/g;->a:Ljava/lang/reflect/Field;
    :try_end_5
    .catch Ljava/lang/NoSuchFieldException; {:try_start_5 .. :try_end_5} :catch_6

    .line 455
    .line 456
    const/4 v13, 0x1

    .line 457
    :try_start_6
    invoke-virtual {v0, v13}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_6
    .catch Ljava/lang/NoSuchFieldException; {:try_start_6 .. :try_end_6} :catch_5

    .line 458
    .line 459
    .line 460
    goto :goto_13

    .line 461
    :catch_5
    move-exception v0

    .line 462
    goto :goto_12

    .line 463
    :catch_6
    move-exception v0

    .line 464
    const/4 v13, 0x1

    .line 465
    :goto_12
    invoke-static {v7, v10, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 466
    .line 467
    .line 468
    :goto_13
    sput-boolean v13, LT0/g;->b:Z

    .line 469
    .line 470
    :cond_1a
    sget-object v0, LT0/g;->a:Ljava/lang/reflect/Field;

    .line 471
    .line 472
    if-eqz v0, :cond_1b

    .line 473
    .line 474
    :try_start_7
    invoke-virtual {v0, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v7
    :try_end_7
    .catch Ljava/lang/IllegalAccessException; {:try_start_7 .. :try_end_7} :catch_7

    .line 478
    goto :goto_14

    .line 479
    :catch_7
    move-exception v0

    .line 480
    move-object v8, v0

    .line 481
    invoke-static {v7, v2, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 482
    .line 483
    .line 484
    :cond_1b
    const/4 v7, 0x0

    .line 485
    :goto_14
    if-nez v7, :cond_1c

    .line 486
    .line 487
    goto :goto_18

    .line 488
    :cond_1c
    invoke-static {v7}, LT0/g;->m(Ljava/lang/Object;)V

    .line 489
    .line 490
    .line 491
    goto :goto_18

    .line 492
    :cond_1d
    sget-boolean v0, LT0/g;->b:Z

    .line 493
    .line 494
    if-nez v0, :cond_1e

    .line 495
    .line 496
    :try_start_8
    invoke-virtual {v14, v13}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    sput-object v0, LT0/g;->a:Ljava/lang/reflect/Field;
    :try_end_8
    .catch Ljava/lang/NoSuchFieldException; {:try_start_8 .. :try_end_8} :catch_9

    .line 501
    .line 502
    const/4 v13, 0x1

    .line 503
    :try_start_9
    invoke-virtual {v0, v13}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_9
    .catch Ljava/lang/NoSuchFieldException; {:try_start_9 .. :try_end_9} :catch_8

    .line 504
    .line 505
    .line 506
    goto :goto_16

    .line 507
    :catch_8
    move-exception v0

    .line 508
    goto :goto_15

    .line 509
    :catch_9
    move-exception v0

    .line 510
    const/4 v13, 0x1

    .line 511
    :goto_15
    invoke-static {v7, v10, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 512
    .line 513
    .line 514
    :goto_16
    sput-boolean v13, LT0/g;->b:Z

    .line 515
    .line 516
    :cond_1e
    sget-object v0, LT0/g;->a:Ljava/lang/reflect/Field;

    .line 517
    .line 518
    if-eqz v0, :cond_1f

    .line 519
    .line 520
    :try_start_a
    invoke-virtual {v0, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    check-cast v0, Ljava/util/Map;
    :try_end_a
    .catch Ljava/lang/IllegalAccessException; {:try_start_a .. :try_end_a} :catch_a

    .line 525
    .line 526
    move-object v7, v0

    .line 527
    goto :goto_17

    .line 528
    :catch_a
    move-exception v0

    .line 529
    invoke-static {v7, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 530
    .line 531
    .line 532
    const/4 v7, 0x0

    .line 533
    :goto_17
    if-eqz v7, :cond_1f

    .line 534
    .line 535
    invoke-interface {v7}, Ljava/util/Map;->clear()V

    .line 536
    .line 537
    .line 538
    :cond_1f
    :goto_18
    iget v0, v1, Lh/D;->Z:I

    .line 539
    .line 540
    if-eqz v0, :cond_20

    .line 541
    .line 542
    invoke-virtual {v4, v0}, Landroid/content/Context;->setTheme(I)V

    .line 543
    .line 544
    .line 545
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 546
    .line 547
    if-lt v0, v15, :cond_20

    .line 548
    .line 549
    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    iget v2, v1, Lh/D;->Z:I

    .line 554
    .line 555
    const/4 v7, 0x1

    .line 556
    invoke-virtual {v0, v2, v7}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 557
    .line 558
    .line 559
    goto :goto_19

    .line 560
    :cond_20
    const/4 v7, 0x1

    .line 561
    :goto_19
    if-eqz v5, :cond_22

    .line 562
    .line 563
    instance-of v0, v9, Landroid/app/Activity;

    .line 564
    .line 565
    if-eqz v0, :cond_22

    .line 566
    .line 567
    move-object v0, v9

    .line 568
    check-cast v0, Landroid/app/Activity;

    .line 569
    .line 570
    instance-of v2, v0, Landroidx/lifecycle/r;

    .line 571
    .line 572
    if-eqz v2, :cond_21

    .line 573
    .line 574
    move-object v2, v0

    .line 575
    check-cast v2, Landroidx/lifecycle/r;

    .line 576
    .line 577
    invoke-interface {v2}, Landroidx/lifecycle/r;->d()Landroidx/lifecycle/t;

    .line 578
    .line 579
    .line 580
    move-result-object v2

    .line 581
    iget-object v2, v2, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    .line 582
    .line 583
    sget-object v5, Landroidx/lifecycle/m;->c:Landroidx/lifecycle/m;

    .line 584
    .line 585
    invoke-virtual {v2, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 586
    .line 587
    .line 588
    move-result v2

    .line 589
    if-ltz v2, :cond_22

    .line 590
    .line 591
    invoke-virtual {v0, v11}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 592
    .line 593
    .line 594
    goto :goto_1a

    .line 595
    :cond_21
    iget-boolean v2, v1, Lh/D;->V:Z

    .line 596
    .line 597
    if-eqz v2, :cond_22

    .line 598
    .line 599
    iget-boolean v2, v1, Lh/D;->W:Z

    .line 600
    .line 601
    if-nez v2, :cond_22

    .line 602
    .line 603
    invoke-virtual {v0, v11}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 604
    .line 605
    .line 606
    :cond_22
    :goto_1a
    const/4 v11, 0x1

    .line 607
    goto :goto_1b

    .line 608
    :cond_23
    move v11, v0

    .line 609
    :goto_1b
    if-eqz v11, :cond_25

    .line 610
    .line 611
    instance-of v0, v9, Lh/l;

    .line 612
    .line 613
    if-eqz v0, :cond_25

    .line 614
    .line 615
    and-int/lit16 v0, v12, 0x200

    .line 616
    .line 617
    if-eqz v0, :cond_24

    .line 618
    .line 619
    move-object v0, v9

    .line 620
    check-cast v0, Lh/l;

    .line 621
    .line 622
    :cond_24
    and-int/lit8 v0, v12, 0x4

    .line 623
    .line 624
    if-eqz v0, :cond_25

    .line 625
    .line 626
    check-cast v9, Lh/l;

    .line 627
    .line 628
    :cond_25
    if-eqz v6, :cond_27

    .line 629
    .line 630
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    invoke-static {v0}, Lh/D;->x(Landroid/content/res/Configuration;)LJ/f;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 643
    .line 644
    const/16 v5, 0x18

    .line 645
    .line 646
    if-lt v2, v5, :cond_26

    .line 647
    .line 648
    invoke-static {v0}, Lh/x;->c(LJ/f;)V

    .line 649
    .line 650
    .line 651
    goto :goto_1c

    .line 652
    :cond_26
    iget-object v0, v0, LJ/f;->a:LJ/h;

    .line 653
    .line 654
    const/4 v2, 0x0

    .line 655
    invoke-interface {v0, v2}, LJ/h;->get(I)Ljava/util/Locale;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    invoke-static {v0}, Ljava/util/Locale;->setDefault(Ljava/util/Locale;)V

    .line 660
    .line 661
    .line 662
    :cond_27
    :goto_1c
    if-nez v3, :cond_28

    .line 663
    .line 664
    invoke-virtual {v1, v4}, Lh/D;->w(Landroid/content/Context;)Landroidx/fragment/app/g;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    invoke-virtual {v0}, Landroidx/fragment/app/g;->i()V

    .line 669
    .line 670
    .line 671
    goto :goto_1d

    .line 672
    :cond_28
    iget-object v0, v1, Lh/D;->c0:Lh/A;

    .line 673
    .line 674
    if-eqz v0, :cond_29

    .line 675
    .line 676
    invoke-virtual {v0}, Landroidx/fragment/app/g;->c()V

    .line 677
    .line 678
    .line 679
    :cond_29
    :goto_1d
    const/4 v0, 0x3

    .line 680
    if-ne v3, v0, :cond_2b

    .line 681
    .line 682
    iget-object v0, v1, Lh/D;->d0:Lh/A;

    .line 683
    .line 684
    if-nez v0, :cond_2a

    .line 685
    .line 686
    new-instance v0, Lh/A;

    .line 687
    .line 688
    invoke-direct {v0, v1, v4}, Lh/A;-><init>(Lh/D;Landroid/content/Context;)V

    .line 689
    .line 690
    .line 691
    iput-object v0, v1, Lh/D;->d0:Lh/A;

    .line 692
    .line 693
    :cond_2a
    iget-object v0, v1, Lh/D;->d0:Lh/A;

    .line 694
    .line 695
    invoke-virtual {v0}, Landroidx/fragment/app/g;->i()V

    .line 696
    .line 697
    .line 698
    goto :goto_1e

    .line 699
    :cond_2b
    iget-object v0, v1, Lh/D;->d0:Lh/A;

    .line 700
    .line 701
    if-eqz v0, :cond_2c

    .line 702
    .line 703
    invoke-virtual {v0}, Landroidx/fragment/app/g;->c()V

    .line 704
    .line 705
    .line 706
    :cond_2c
    :goto_1e
    return v11
.end method

.method public final m(Landroid/view/Window;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lh/D;->q:Landroid/view/Window;

    .line 2
    .line 3
    const-string v1, "AppCompat has already installed itself into the Window"

    .line 4
    .line 5
    if-nez v0, :cond_6

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v2, v0, Lh/z;

    .line 12
    .line 13
    if-nez v2, :cond_5

    .line 14
    .line 15
    new-instance v1, Lh/z;

    .line 16
    .line 17
    invoke-direct {v1, p0, v0}, Lh/z;-><init>(Lh/D;Landroid/view/Window$Callback;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lh/D;->r:Lh/z;

    .line 21
    .line 22
    invoke-virtual {p1, v1}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    .line 23
    .line 24
    .line 25
    sget-object v0, Lh/D;->o0:[I

    .line 26
    .line 27
    iget-object v1, p0, Lh/D;->p:Landroid/content/Context;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0, v3, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    invoke-static {}, Lo/s;->a()Lo/s;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    monitor-enter v4

    .line 52
    :try_start_0
    iget-object v5, v4, Lo/s;->a:Lo/P0;

    .line 53
    .line 54
    const/4 v6, 0x1

    .line 55
    invoke-virtual {v5, v1, v3, v6}, Lo/P0;->g(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

    .line 56
    .line 57
    .line 58
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    monitor-exit v4

    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception p1

    .line 62
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    throw p1

    .line 64
    :cond_0
    move-object v1, v2

    .line 65
    :goto_0
    if-eqz v1, :cond_1

    .line 66
    .line 67
    invoke-virtual {p1, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Lh/D;->q:Landroid/view/Window;

    .line 74
    .line 75
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 76
    .line 77
    const/16 v0, 0x21

    .line 78
    .line 79
    if-lt p1, v0, :cond_4

    .line 80
    .line 81
    iget-object p1, p0, Lh/D;->l0:Landroid/window/OnBackInvokedDispatcher;

    .line 82
    .line 83
    if-nez p1, :cond_4

    .line 84
    .line 85
    if-eqz p1, :cond_2

    .line 86
    .line 87
    iget-object v0, p0, Lh/D;->m0:Landroid/window/OnBackInvokedCallback;

    .line 88
    .line 89
    if-eqz v0, :cond_2

    .line 90
    .line 91
    invoke-static {p1, v0}, Lh/y;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    iput-object v2, p0, Lh/D;->m0:Landroid/window/OnBackInvokedCallback;

    .line 95
    .line 96
    :cond_2
    iget-object p1, p0, Lh/D;->o:Ljava/lang/Object;

    .line 97
    .line 98
    instance-of v0, p1, Landroid/app/Activity;

    .line 99
    .line 100
    if-eqz v0, :cond_3

    .line 101
    .line 102
    check-cast p1, Landroid/app/Activity;

    .line 103
    .line 104
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    if-eqz v0, :cond_3

    .line 109
    .line 110
    invoke-static {p1}, Lh/y;->a(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    iput-object p1, p0, Lh/D;->l0:Landroid/window/OnBackInvokedDispatcher;

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_3
    iput-object v2, p0, Lh/D;->l0:Landroid/window/OnBackInvokedDispatcher;

    .line 118
    .line 119
    :goto_1
    invoke-virtual {p0}, Lh/D;->H()V

    .line 120
    .line 121
    .line 122
    :cond_4
    return-void

    .line 123
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 124
    .line 125
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw p1

    .line 129
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 130
    .line 131
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    throw p1
.end method

.method public final o(ILh/C;Ln/l;)V
    .locals 3

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lh/D;->R:[Lh/C;

    .line 8
    .line 9
    array-length v1, v0

    .line 10
    if-ge p1, v1, :cond_0

    .line 11
    .line 12
    aget-object p2, v0, p1

    .line 13
    .line 14
    :cond_0
    if-eqz p2, :cond_1

    .line 15
    .line 16
    iget-object p3, p2, Lh/C;->h:Ln/l;

    .line 17
    .line 18
    :cond_1
    if-eqz p2, :cond_2

    .line 19
    .line 20
    iget-boolean p2, p2, Lh/C;->m:Z

    .line 21
    .line 22
    if-nez p2, :cond_2

    .line 23
    .line 24
    return-void

    .line 25
    :cond_2
    iget-boolean p2, p0, Lh/D;->W:Z

    .line 26
    .line 27
    if-nez p2, :cond_3

    .line 28
    .line 29
    iget-object p2, p0, Lh/D;->r:Lh/z;

    .line 30
    .line 31
    iget-object v0, p0, Lh/D;->q:Landroid/view/Window;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    const/4 v2, 0x0

    .line 42
    :try_start_0
    iput-boolean v1, p2, Lh/z;->i:Z

    .line 43
    .line 44
    invoke-interface {v0, p1, p3}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    iput-boolean v2, p2, Lh/z;->i:Z

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    iput-boolean v2, p2, Lh/z;->i:Z

    .line 52
    .line 53
    throw p1

    .line 54
    :cond_3
    :goto_0
    return-void
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    const/4 v4, 0x3

    const/4 v5, -0x1

    const/4 v6, 0x4

    const/4 v7, 0x1

    .line 1
    iget-object v8, v1, Lh/D;->k0:Lh/G;

    const/4 v9, 0x0

    if-nez v8, :cond_1

    .line 2
    sget-object v8, Lg/a;->j:[I

    iget-object v10, v1, Lh/D;->p:Landroid/content/Context;

    invoke-virtual {v10, v8}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v8

    const/16 v11, 0x74

    .line 3
    invoke-virtual {v8, v11}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 4
    invoke-virtual {v8}, Landroid/content/res/TypedArray;->recycle()V

    if-nez v11, :cond_0

    .line 5
    new-instance v8, Lh/G;

    invoke-direct {v8}, Lh/G;-><init>()V

    iput-object v8, v1, Lh/D;->k0:Lh/G;

    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    invoke-virtual {v10}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v8

    invoke-virtual {v8, v11}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    .line 7
    invoke-virtual {v8, v9}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v8

    .line 8
    invoke-virtual {v8, v9}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lh/G;

    iput-object v8, v1, Lh/D;->k0:Lh/G;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 9
    :catchall_0
    new-instance v8, Lh/G;

    invoke-direct {v8}, Lh/G;-><init>()V

    iput-object v8, v1, Lh/D;->k0:Lh/G;

    .line 10
    :cond_1
    :goto_0
    iget-object v8, v1, Lh/D;->k0:Lh/G;

    .line 11
    sget v10, Lo/k1;->a:I

    .line 12
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    sget-object v10, Lg/a;->y:[I

    const/4 v15, 0x0

    invoke-virtual {v2, v3, v10, v15, v15}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v10

    .line 14
    invoke-virtual {v10, v6, v15}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v11

    .line 15
    invoke-virtual {v10}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz v11, :cond_3

    .line 16
    instance-of v10, v2, Lm/c;

    if-eqz v10, :cond_2

    move-object v10, v2

    check-cast v10, Lm/c;

    .line 17
    iget v10, v10, Lm/c;->a:I

    if-eq v10, v11, :cond_3

    .line 18
    :cond_2
    new-instance v10, Lm/c;

    invoke-direct {v10, v2, v11}, Lm/c;-><init>(Landroid/content/Context;I)V

    goto :goto_1

    :cond_3
    move-object v10, v2

    .line 19
    :goto_1
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->hashCode()I

    move-result v11

    sparse-switch v11, :sswitch_data_0

    :goto_2
    const/4 v6, -0x1

    goto/16 :goto_3

    :sswitch_0
    const-string v6, "Button"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_2

    :cond_4
    const/16 v6, 0xd

    goto/16 :goto_3

    :sswitch_1
    const-string v6, "EditText"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    goto :goto_2

    :cond_5
    const/16 v6, 0xc

    goto/16 :goto_3

    :sswitch_2
    const-string v6, "CheckBox"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    goto :goto_2

    :cond_6
    const/16 v6, 0xb

    goto/16 :goto_3

    :sswitch_3
    const-string v6, "AutoCompleteTextView"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    goto :goto_2

    :cond_7
    const/16 v6, 0xa

    goto/16 :goto_3

    :sswitch_4
    const-string v6, "ImageView"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    goto :goto_2

    :cond_8
    const/16 v6, 0x9

    goto/16 :goto_3

    :sswitch_5
    const-string v6, "ToggleButton"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_9

    goto :goto_2

    :cond_9
    const/16 v6, 0x8

    goto :goto_3

    :sswitch_6
    const-string v6, "RadioButton"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    goto :goto_2

    :cond_a
    const/4 v6, 0x7

    goto :goto_3

    :sswitch_7
    const-string v6, "Spinner"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_b

    goto :goto_2

    :cond_b
    const/4 v6, 0x6

    goto :goto_3

    :sswitch_8
    const-string v6, "SeekBar"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_c

    goto :goto_2

    :cond_c
    const/4 v6, 0x5

    goto :goto_3

    :sswitch_9
    const-string v11, "ImageButton"

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_11

    goto :goto_2

    :sswitch_a
    const-string v6, "TextView"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_d

    goto/16 :goto_2

    :cond_d
    const/4 v6, 0x3

    goto :goto_3

    :sswitch_b
    const-string v6, "MultiAutoCompleteTextView"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_e

    goto/16 :goto_2

    :cond_e
    const/4 v6, 0x2

    goto :goto_3

    :sswitch_c
    const-string v6, "CheckedTextView"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_f

    goto/16 :goto_2

    :cond_f
    const/4 v6, 0x1

    goto :goto_3

    :sswitch_d
    const-string v6, "RatingBar"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_10

    goto/16 :goto_2

    :cond_10
    const/4 v6, 0x0

    :cond_11
    :goto_3
    packed-switch v6, :pswitch_data_0

    move-object v6, v9

    goto :goto_4

    .line 20
    :pswitch_0
    invoke-virtual {v8, v10, v3}, Lh/G;->b(Landroid/content/Context;Landroid/util/AttributeSet;)Lo/p;

    move-result-object v6

    goto :goto_4

    .line 21
    :pswitch_1
    new-instance v6, Lo/u;

    .line 22
    invoke-direct {v6, v10, v3}, Lo/u;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 23
    :pswitch_2
    invoke-virtual {v8, v10, v3}, Lh/G;->c(Landroid/content/Context;Landroid/util/AttributeSet;)Lo/q;

    move-result-object v6

    goto :goto_4

    .line 24
    :pswitch_3
    invoke-virtual {v8, v10, v3}, Lh/G;->a(Landroid/content/Context;Landroid/util/AttributeSet;)Lo/o;

    move-result-object v6

    goto :goto_4

    .line 25
    :pswitch_4
    new-instance v6, Lo/y;

    .line 26
    invoke-direct {v6, v10, v3, v15}, Lo/y;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    goto :goto_4

    .line 27
    :pswitch_5
    new-instance v6, Lo/j0;

    invoke-direct {v6, v10, v3}, Lo/j0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 28
    :pswitch_6
    invoke-virtual {v8, v10, v3}, Lh/G;->d(Landroid/content/Context;Landroid/util/AttributeSet;)Lo/D;

    move-result-object v6

    goto :goto_4

    .line 29
    :pswitch_7
    new-instance v6, Lo/Q;

    invoke-direct {v6, v10, v3}, Lo/Q;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 30
    :pswitch_8
    new-instance v6, Lo/G;

    invoke-direct {v6, v10, v3}, Lo/G;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 31
    :pswitch_9
    new-instance v6, Lo/w;

    const v11, 0x7f040259

    .line 32
    invoke-direct {v6, v10, v3, v11}, Lo/w;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    goto :goto_4

    .line 33
    :pswitch_a
    invoke-virtual {v8, v10, v3}, Lh/G;->e(Landroid/content/Context;Landroid/util/AttributeSet;)Lo/d0;

    move-result-object v6

    goto :goto_4

    .line 34
    :pswitch_b
    new-instance v6, Lo/z;

    invoke-direct {v6, v10, v3}, Lo/z;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 35
    :pswitch_c
    new-instance v6, Lo/r;

    invoke-direct {v6, v10, v3}, Lo/r;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 36
    :pswitch_d
    new-instance v6, Lo/E;

    invoke-direct {v6, v10, v3}, Lo/E;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    :goto_4
    if-nez v6, :cond_16

    if-eq v2, v10, :cond_16

    .line 37
    iget-object v2, v8, Lh/G;->a:[Ljava/lang/Object;

    const-string v6, "view"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_12

    .line 38
    const-string v0, "class"

    invoke-interface {v3, v9, v0}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 39
    :cond_12
    :try_start_1
    aput-object v10, v2, v15

    .line 40
    aput-object v3, v2, v7

    const/16 v6, 0x2e

    .line 41
    invoke-virtual {v0, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    if-ne v5, v6, :cond_15

    const/4 v5, 0x0

    .line 42
    :goto_5
    sget-object v6, Lh/G;->g:[Ljava/lang/String;

    if-ge v5, v4, :cond_14

    .line 43
    aget-object v6, v6, v5

    invoke-virtual {v8, v10, v0, v6}, Lh/G;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    move-result-object v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v6, :cond_13

    .line 44
    aput-object v9, v2, v15

    .line 45
    aput-object v9, v2, v7

    move-object v9, v6

    goto :goto_7

    :cond_13
    add-int/2addr v5, v7

    goto :goto_5

    :catchall_1
    move-exception v0

    goto :goto_6

    .line 46
    :cond_14
    aput-object v9, v2, v15

    .line 47
    aput-object v9, v2, v7

    goto :goto_7

    .line 48
    :cond_15
    :try_start_2
    invoke-virtual {v8, v10, v0, v9}, Lh/G;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 49
    aput-object v9, v2, v15

    .line 50
    aput-object v9, v2, v7

    move-object v9, v0

    goto :goto_7

    .line 51
    :goto_6
    aput-object v9, v2, v15

    .line 52
    aput-object v9, v2, v7

    .line 53
    throw v0

    .line 54
    :catch_0
    aput-object v9, v2, v15

    .line 55
    aput-object v9, v2, v7

    :goto_7
    move-object v6, v9

    :cond_16
    if-eqz v6, :cond_1e

    .line 56
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 57
    instance-of v2, v0, Landroid/content/ContextWrapper;

    if-eqz v2, :cond_19

    invoke-virtual {v6}, Landroid/view/View;->hasOnClickListeners()Z

    move-result v2

    if-nez v2, :cond_17

    goto :goto_8

    .line 58
    :cond_17
    sget-object v2, Lh/G;->c:[I

    invoke-virtual {v0, v3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 59
    invoke-virtual {v0, v15}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_18

    .line 60
    new-instance v4, Lh/F;

    invoke-direct {v4, v6, v2}, Lh/F;-><init>(Landroid/view/View;Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 61
    :cond_18
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 62
    :cond_19
    :goto_8
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-le v0, v2, :cond_1a

    goto/16 :goto_a

    .line 63
    :cond_1a
    sget-object v0, Lh/G;->d:[I

    invoke-virtual {v10, v3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 64
    invoke-virtual {v0, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    const-class v5, Ljava/lang/Boolean;

    if-eqz v4, :cond_1b

    .line 65
    invoke-virtual {v0, v15, v15}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    sget-object v7, LN/Q;->a:Ljava/util/WeakHashMap;

    .line 66
    new-instance v7, LN/A;

    const v12, 0x7f0901d7

    const/16 v16, 0x3

    move-object v11, v7

    move-object v13, v5

    move v14, v15

    const/4 v8, 0x0

    move v15, v2

    .line 67
    invoke-direct/range {v11 .. v16}, LN/A;-><init>(ILjava/lang/Class;III)V

    .line 68
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v7, v6, v4}, LN/C;->d(Landroid/view/View;Ljava/lang/Object;)V

    goto :goto_9

    :cond_1b
    const/4 v8, 0x0

    .line 69
    :goto_9
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 70
    sget-object v0, Lh/G;->e:[I

    invoke-virtual {v10, v3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 71
    invoke-virtual {v0, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    if-eqz v4, :cond_1c

    .line 72
    invoke-virtual {v0, v8}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v6, v4}, LN/Q;->q(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 73
    :cond_1c
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 74
    sget-object v0, Lh/G;->f:[I

    invoke-virtual {v10, v3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 75
    invoke-virtual {v0, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_1d

    .line 76
    invoke-virtual {v0, v8, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    .line 77
    sget-object v4, LN/Q;->a:Ljava/util/WeakHashMap;

    .line 78
    new-instance v4, LN/A;

    const v12, 0x7f0901dc

    const/16 v16, 0x0

    move-object v11, v4

    move-object v13, v5

    move v14, v8

    move v15, v2

    .line 79
    invoke-direct/range {v11 .. v16}, LN/A;-><init>(ILjava/lang/Class;III)V

    .line 80
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v4, v6, v2}, LN/C;->d(Landroid/view/View;Ljava/lang/Object;)V

    .line 81
    :cond_1d
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    :cond_1e
    :goto_a
    return-object v6

    :sswitch_data_0
    .sparse-switch
        -0x7404ceea -> :sswitch_d
        -0x56c015e7 -> :sswitch_c
        -0x503aa7ad -> :sswitch_b
        -0x37f7066e -> :sswitch_a
        -0x37e04bb3 -> :sswitch_9
        -0x274065a5 -> :sswitch_8
        -0x1440b607 -> :sswitch_7
        0x2e46a6ed -> :sswitch_6
        0x2fa453c6 -> :sswitch_5
        0x431b5280 -> :sswitch_4
        0x5445f9ba -> :sswitch_3
        0x5f7507c3 -> :sswitch_2
        0x63577677 -> :sswitch_1
        0x77471352 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 82
    invoke-virtual {p0, v0, p1, p2, p3}, Lh/D;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final p(Ln/l;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lh/D;->Q:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lh/D;->Q:Z

    .line 8
    .line 9
    iget-object v0, p0, Lh/D;->w:Lo/l0;

    .line 10
    .line 11
    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j:Lo/m0;

    .line 17
    .line 18
    check-cast v0, Lo/f1;

    .line 19
    .line 20
    iget-object v0, v0, Lo/f1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 21
    .line 22
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->f:Landroidx/appcompat/widget/ActionMenuView;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->y:Lo/k;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Lo/k;->e()Z

    .line 31
    .line 32
    .line 33
    iget-object v0, v0, Lo/k;->y:Lo/g;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0}, Ln/v;->b()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    iget-object v0, v0, Ln/v;->i:Ln/t;

    .line 44
    .line 45
    invoke-interface {v0}, Ln/B;->dismiss()V

    .line 46
    .line 47
    .line 48
    :cond_1
    iget-object v0, p0, Lh/D;->q:Landroid/view/Window;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    iget-boolean v1, p0, Lh/D;->W:Z

    .line 57
    .line 58
    if-nez v1, :cond_2

    .line 59
    .line 60
    const/16 v1, 0x6c

    .line 61
    .line 62
    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    const/4 p1, 0x0

    .line 66
    iput-boolean p1, p0, Lh/D;->Q:Z

    .line 67
    .line 68
    return-void
.end method

.method public final q(Lh/C;Z)V
    .locals 3

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget v0, p1, Lh/C;->a:I

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lh/D;->w:Lo/l0;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j:Lo/m0;

    .line 17
    .line 18
    check-cast v0, Lo/f1;

    .line 19
    .line 20
    iget-object v0, v0, Lo/f1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 21
    .line 22
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->f:Landroidx/appcompat/widget/ActionMenuView;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->y:Lo/k;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0}, Lo/k;->i()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    iget-object p1, p1, Lh/C;->h:Ln/l;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lh/D;->p(Ln/l;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    iget-object v0, p0, Lh/D;->p:Landroid/content/Context;

    .line 43
    .line 44
    const-string v1, "window"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Landroid/view/WindowManager;

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    iget-boolean v2, p1, Lh/C;->m:Z

    .line 56
    .line 57
    if-eqz v2, :cond_1

    .line 58
    .line 59
    iget-object v2, p1, Lh/C;->e:Lh/B;

    .line 60
    .line 61
    if-eqz v2, :cond_1

    .line 62
    .line 63
    invoke-interface {v0, v2}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 64
    .line 65
    .line 66
    if-eqz p2, :cond_1

    .line 67
    .line 68
    iget p2, p1, Lh/C;->a:I

    .line 69
    .line 70
    invoke-virtual {p0, p2, p1, v1}, Lh/D;->o(ILh/C;Ln/l;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    const/4 p2, 0x0

    .line 74
    iput-boolean p2, p1, Lh/C;->k:Z

    .line 75
    .line 76
    iput-boolean p2, p1, Lh/C;->l:Z

    .line 77
    .line 78
    iput-boolean p2, p1, Lh/C;->m:Z

    .line 79
    .line 80
    iput-object v1, p1, Lh/C;->f:Landroid/view/View;

    .line 81
    .line 82
    const/4 p2, 0x1

    .line 83
    iput-boolean p2, p1, Lh/C;->n:Z

    .line 84
    .line 85
    iget-object p2, p0, Lh/D;->S:Lh/C;

    .line 86
    .line 87
    if-ne p2, p1, :cond_2

    .line 88
    .line 89
    iput-object v1, p0, Lh/D;->S:Lh/C;

    .line 90
    .line 91
    :cond_2
    iget p1, p1, Lh/C;->a:I

    .line 92
    .line 93
    if-nez p1, :cond_3

    .line 94
    .line 95
    invoke-virtual {p0}, Lh/D;->H()V

    .line 96
    .line 97
    .line 98
    :cond_3
    return-void
.end method

.method public final s(Landroid/view/KeyEvent;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lh/D;->o:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, LN/k;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    instance-of v0, v0, Lh/i;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lh/D;->q:Landroid/view/Window;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-static {v0, p1}, Lp0/a;->B(Landroid/view/View;Landroid/view/KeyEvent;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    return v2

    .line 27
    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/4 v1, 0x0

    .line 32
    const/16 v3, 0x52

    .line 33
    .line 34
    if-ne v0, v3, :cond_2

    .line 35
    .line 36
    iget-object v0, p0, Lh/D;->r:Lh/z;

    .line 37
    .line 38
    iget-object v4, p0, Lh/D;->q:Landroid/view/Window;

    .line 39
    .line 40
    invoke-virtual {v4}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    :try_start_0
    iput-boolean v2, v0, Lh/z;->h:Z

    .line 48
    .line 49
    invoke-interface {v4, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 50
    .line 51
    .line 52
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    iput-boolean v1, v0, Lh/z;->h:Z

    .line 54
    .line 55
    if-eqz v4, :cond_2

    .line 56
    .line 57
    return v2

    .line 58
    :catchall_0
    move-exception p1

    .line 59
    iput-boolean v1, v0, Lh/z;->h:Z

    .line 60
    .line 61
    throw p1

    .line 62
    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    const/4 v5, 0x4

    .line 71
    if-nez v4, :cond_7

    .line 72
    .line 73
    if-eq v0, v5, :cond_4

    .line 74
    .line 75
    if-eq v0, v3, :cond_3

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-nez v0, :cond_12

    .line 83
    .line 84
    invoke-virtual {p0, v1}, Lh/D;->y(I)Lh/C;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iget-boolean v1, v0, Lh/C;->m:Z

    .line 89
    .line 90
    if-nez v1, :cond_12

    .line 91
    .line 92
    invoke-virtual {p0, v0, p1}, Lh/D;->F(Lh/C;Landroid/view/KeyEvent;)Z

    .line 93
    .line 94
    .line 95
    goto/16 :goto_7

    .line 96
    .line 97
    :cond_4
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getFlags()I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    and-int/lit16 p1, p1, 0x80

    .line 102
    .line 103
    if-eqz p1, :cond_5

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_5
    const/4 v2, 0x0

    .line 107
    :goto_0
    iput-boolean v2, p0, Lh/D;->T:Z

    .line 108
    .line 109
    :cond_6
    :goto_1
    const/4 v2, 0x0

    .line 110
    goto/16 :goto_7

    .line 111
    .line 112
    :cond_7
    if-eq v0, v5, :cond_11

    .line 113
    .line 114
    if-eq v0, v3, :cond_8

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_8
    iget-object v0, p0, Lh/D;->z:Lm/a;

    .line 118
    .line 119
    if-eqz v0, :cond_9

    .line 120
    .line 121
    goto/16 :goto_7

    .line 122
    .line 123
    :cond_9
    invoke-virtual {p0, v1}, Lh/D;->y(I)Lh/C;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    iget-object v3, p0, Lh/D;->w:Lo/l0;

    .line 128
    .line 129
    iget-object v4, p0, Lh/D;->p:Landroid/content/Context;

    .line 130
    .line 131
    if-eqz v3, :cond_b

    .line 132
    .line 133
    check-cast v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 134
    .line 135
    invoke-virtual {v3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 136
    .line 137
    .line 138
    iget-object v3, v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j:Lo/m0;

    .line 139
    .line 140
    check-cast v3, Lo/f1;

    .line 141
    .line 142
    iget-object v3, v3, Lo/f1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 143
    .line 144
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    if-nez v5, :cond_b

    .line 149
    .line 150
    iget-object v3, v3, Landroidx/appcompat/widget/Toolbar;->f:Landroidx/appcompat/widget/ActionMenuView;

    .line 151
    .line 152
    if-eqz v3, :cond_b

    .line 153
    .line 154
    iget-boolean v3, v3, Landroidx/appcompat/widget/ActionMenuView;->x:Z

    .line 155
    .line 156
    if-eqz v3, :cond_b

    .line 157
    .line 158
    invoke-static {v4}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    invoke-virtual {v3}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    if-nez v3, :cond_b

    .line 167
    .line 168
    iget-object v3, p0, Lh/D;->w:Lo/l0;

    .line 169
    .line 170
    check-cast v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 171
    .line 172
    invoke-virtual {v3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 173
    .line 174
    .line 175
    iget-object v3, v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j:Lo/m0;

    .line 176
    .line 177
    check-cast v3, Lo/f1;

    .line 178
    .line 179
    iget-object v3, v3, Lo/f1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 180
    .line 181
    iget-object v3, v3, Landroidx/appcompat/widget/Toolbar;->f:Landroidx/appcompat/widget/ActionMenuView;

    .line 182
    .line 183
    if-eqz v3, :cond_a

    .line 184
    .line 185
    iget-object v3, v3, Landroidx/appcompat/widget/ActionMenuView;->y:Lo/k;

    .line 186
    .line 187
    if-eqz v3, :cond_a

    .line 188
    .line 189
    invoke-virtual {v3}, Lo/k;->i()Z

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    if-eqz v3, :cond_a

    .line 194
    .line 195
    iget-object p1, p0, Lh/D;->w:Lo/l0;

    .line 196
    .line 197
    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 198
    .line 199
    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 200
    .line 201
    .line 202
    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j:Lo/m0;

    .line 203
    .line 204
    check-cast p1, Lo/f1;

    .line 205
    .line 206
    iget-object p1, p1, Lo/f1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 207
    .line 208
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->f:Landroidx/appcompat/widget/ActionMenuView;

    .line 209
    .line 210
    if-eqz p1, :cond_e

    .line 211
    .line 212
    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->y:Lo/k;

    .line 213
    .line 214
    if-eqz p1, :cond_e

    .line 215
    .line 216
    invoke-virtual {p1}, Lo/k;->e()Z

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    if-eqz p1, :cond_e

    .line 221
    .line 222
    :goto_2
    goto :goto_4

    .line 223
    :cond_a
    iget-boolean v3, p0, Lh/D;->W:Z

    .line 224
    .line 225
    if-nez v3, :cond_e

    .line 226
    .line 227
    invoke-virtual {p0, v0, p1}, Lh/D;->F(Lh/C;Landroid/view/KeyEvent;)Z

    .line 228
    .line 229
    .line 230
    move-result p1

    .line 231
    if-eqz p1, :cond_e

    .line 232
    .line 233
    iget-object p1, p0, Lh/D;->w:Lo/l0;

    .line 234
    .line 235
    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 236
    .line 237
    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 238
    .line 239
    .line 240
    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j:Lo/m0;

    .line 241
    .line 242
    check-cast p1, Lo/f1;

    .line 243
    .line 244
    iget-object p1, p1, Lo/f1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 245
    .line 246
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->f:Landroidx/appcompat/widget/ActionMenuView;

    .line 247
    .line 248
    if-eqz p1, :cond_e

    .line 249
    .line 250
    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->y:Lo/k;

    .line 251
    .line 252
    if-eqz p1, :cond_e

    .line 253
    .line 254
    invoke-virtual {p1}, Lo/k;->l()Z

    .line 255
    .line 256
    .line 257
    move-result p1

    .line 258
    if-eqz p1, :cond_e

    .line 259
    .line 260
    goto :goto_2

    .line 261
    :cond_b
    iget-boolean v3, v0, Lh/C;->m:Z

    .line 262
    .line 263
    if-nez v3, :cond_f

    .line 264
    .line 265
    iget-boolean v5, v0, Lh/C;->l:Z

    .line 266
    .line 267
    if-eqz v5, :cond_c

    .line 268
    .line 269
    goto :goto_5

    .line 270
    :cond_c
    iget-boolean v3, v0, Lh/C;->k:Z

    .line 271
    .line 272
    if-eqz v3, :cond_e

    .line 273
    .line 274
    iget-boolean v3, v0, Lh/C;->o:Z

    .line 275
    .line 276
    if-eqz v3, :cond_d

    .line 277
    .line 278
    iput-boolean v1, v0, Lh/C;->k:Z

    .line 279
    .line 280
    invoke-virtual {p0, v0, p1}, Lh/D;->F(Lh/C;Landroid/view/KeyEvent;)Z

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    goto :goto_3

    .line 285
    :cond_d
    const/4 v3, 0x1

    .line 286
    :goto_3
    if-eqz v3, :cond_e

    .line 287
    .line 288
    invoke-virtual {p0, v0, p1}, Lh/D;->D(Lh/C;Landroid/view/KeyEvent;)V

    .line 289
    .line 290
    .line 291
    :goto_4
    const/4 p1, 0x1

    .line 292
    goto :goto_6

    .line 293
    :cond_e
    const/4 p1, 0x0

    .line 294
    goto :goto_6

    .line 295
    :cond_f
    :goto_5
    invoke-virtual {p0, v0, v2}, Lh/D;->q(Lh/C;Z)V

    .line 296
    .line 297
    .line 298
    move p1, v3

    .line 299
    :goto_6
    if-eqz p1, :cond_12

    .line 300
    .line 301
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    const-string v0, "audio"

    .line 306
    .line 307
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    check-cast p1, Landroid/media/AudioManager;

    .line 312
    .line 313
    if-eqz p1, :cond_10

    .line 314
    .line 315
    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->playSoundEffect(I)V

    .line 316
    .line 317
    .line 318
    goto :goto_7

    .line 319
    :cond_10
    const-string p1, "AppCompatDelegate"

    .line 320
    .line 321
    const-string v0, "Couldn\'t get audio manager"

    .line 322
    .line 323
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 324
    .line 325
    .line 326
    goto :goto_7

    .line 327
    :cond_11
    invoke-virtual {p0}, Lh/D;->C()Z

    .line 328
    .line 329
    .line 330
    move-result p1

    .line 331
    if-eqz p1, :cond_6

    .line 332
    .line 333
    :cond_12
    :goto_7
    return v2
.end method

.method public final t(I)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lh/D;->y(I)Lh/C;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Lh/C;->h:Ln/l;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    new-instance v1, Landroid/os/Bundle;

    .line 10
    .line 11
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v2, v0, Lh/C;->h:Ln/l;

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Ln/l;->t(Landroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/os/BaseBundle;->size()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-lez v2, :cond_0

    .line 24
    .line 25
    iput-object v1, v0, Lh/C;->p:Landroid/os/Bundle;

    .line 26
    .line 27
    :cond_0
    iget-object v1, v0, Lh/C;->h:Ln/l;

    .line 28
    .line 29
    invoke-virtual {v1}, Ln/l;->w()V

    .line 30
    .line 31
    .line 32
    iget-object v1, v0, Lh/C;->h:Ln/l;

    .line 33
    .line 34
    invoke-virtual {v1}, Ln/l;->clear()V

    .line 35
    .line 36
    .line 37
    :cond_1
    const/4 v1, 0x1

    .line 38
    iput-boolean v1, v0, Lh/C;->o:Z

    .line 39
    .line 40
    iput-boolean v1, v0, Lh/C;->n:Z

    .line 41
    .line 42
    const/16 v0, 0x6c

    .line 43
    .line 44
    if-eq p1, v0, :cond_2

    .line 45
    .line 46
    if-nez p1, :cond_3

    .line 47
    .line 48
    :cond_2
    iget-object p1, p0, Lh/D;->w:Lo/l0;

    .line 49
    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    invoke-virtual {p0, p1}, Lh/D;->y(I)Lh/C;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-boolean p1, v0, Lh/C;->k:Z

    .line 58
    .line 59
    const/4 p1, 0x0

    .line 60
    invoke-virtual {p0, v0, p1}, Lh/D;->F(Lh/C;Landroid/view/KeyEvent;)Z

    .line 61
    .line 62
    .line 63
    :cond_3
    return-void
.end method

.method public final u()V
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-boolean v2, p0, Lh/D;->F:Z

    .line 4
    .line 5
    if-nez v2, :cond_1b

    .line 6
    .line 7
    sget-object v2, Lg/a;->j:[I

    .line 8
    .line 9
    iget-object v3, p0, Lh/D;->p:Landroid/content/Context;

    .line 10
    .line 11
    invoke-virtual {v3, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    const/16 v5, 0x75

    .line 16
    .line 17
    invoke-virtual {v4, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    if-eqz v6, :cond_1a

    .line 22
    .line 23
    const/16 v6, 0x7e

    .line 24
    .line 25
    invoke-virtual {v4, v6, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    const/16 v7, 0x6c

    .line 30
    .line 31
    if-eqz v6, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lh/D;->g(I)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {v4, v5, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eqz v5, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0, v7}, Lh/D;->g(I)Z

    .line 44
    .line 45
    .line 46
    :cond_1
    :goto_0
    const/16 v5, 0x76

    .line 47
    .line 48
    invoke-virtual {v4, v5, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    const/16 v6, 0x6d

    .line 53
    .line 54
    if-eqz v5, :cond_2

    .line 55
    .line 56
    invoke-virtual {p0, v6}, Lh/D;->g(I)Z

    .line 57
    .line 58
    .line 59
    :cond_2
    const/16 v5, 0x77

    .line 60
    .line 61
    invoke-virtual {v4, v5, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_3

    .line 66
    .line 67
    const/16 v5, 0xa

    .line 68
    .line 69
    invoke-virtual {p0, v5}, Lh/D;->g(I)Z

    .line 70
    .line 71
    .line 72
    :cond_3
    invoke-virtual {v4, v1, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    iput-boolean v5, p0, Lh/D;->O:Z

    .line 77
    .line 78
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lh/D;->v()V

    .line 82
    .line 83
    .line 84
    iget-object v4, p0, Lh/D;->q:Landroid/view/Window;

    .line 85
    .line 86
    invoke-virtual {v4}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 87
    .line 88
    .line 89
    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    iget-boolean v5, p0, Lh/D;->P:Z

    .line 94
    .line 95
    const/4 v8, 0x0

    .line 96
    if-nez v5, :cond_9

    .line 97
    .line 98
    iget-boolean v5, p0, Lh/D;->O:Z

    .line 99
    .line 100
    if-eqz v5, :cond_4

    .line 101
    .line 102
    const v5, 0x7f0c000c

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4, v5, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    check-cast v4, Landroid/view/ViewGroup;

    .line 110
    .line 111
    iput-boolean v1, p0, Lh/D;->M:Z

    .line 112
    .line 113
    iput-boolean v1, p0, Lh/D;->L:Z

    .line 114
    .line 115
    goto/16 :goto_2

    .line 116
    .line 117
    :cond_4
    iget-boolean v4, p0, Lh/D;->L:Z

    .line 118
    .line 119
    if-eqz v4, :cond_8

    .line 120
    .line 121
    new-instance v4, Landroid/util/TypedValue;

    .line 122
    .line 123
    invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    const v9, 0x7f04000b

    .line 131
    .line 132
    .line 133
    invoke-virtual {v5, v9, v4, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 134
    .line 135
    .line 136
    iget v5, v4, Landroid/util/TypedValue;->resourceId:I

    .line 137
    .line 138
    if-eqz v5, :cond_5

    .line 139
    .line 140
    new-instance v5, Lm/c;

    .line 141
    .line 142
    iget v4, v4, Landroid/util/TypedValue;->resourceId:I

    .line 143
    .line 144
    invoke-direct {v5, v3, v4}, Lm/c;-><init>(Landroid/content/Context;I)V

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_5
    move-object v5, v3

    .line 149
    :goto_1
    invoke-static {v5}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    const v5, 0x7f0c0017

    .line 154
    .line 155
    .line 156
    invoke-virtual {v4, v5, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    check-cast v4, Landroid/view/ViewGroup;

    .line 161
    .line 162
    const v5, 0x7f09009a

    .line 163
    .line 164
    .line 165
    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    check-cast v5, Lo/l0;

    .line 170
    .line 171
    iput-object v5, p0, Lh/D;->w:Lo/l0;

    .line 172
    .line 173
    iget-object v9, p0, Lh/D;->q:Landroid/view/Window;

    .line 174
    .line 175
    invoke-virtual {v9}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    invoke-interface {v5, v9}, Lo/l0;->setWindowCallback(Landroid/view/Window$Callback;)V

    .line 180
    .line 181
    .line 182
    iget-boolean v5, p0, Lh/D;->M:Z

    .line 183
    .line 184
    if-eqz v5, :cond_6

    .line 185
    .line 186
    iget-object v5, p0, Lh/D;->w:Lo/l0;

    .line 187
    .line 188
    check-cast v5, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 189
    .line 190
    invoke-virtual {v5, v6}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j(I)V

    .line 191
    .line 192
    .line 193
    :cond_6
    iget-boolean v5, p0, Lh/D;->J:Z

    .line 194
    .line 195
    if-eqz v5, :cond_7

    .line 196
    .line 197
    iget-object v5, p0, Lh/D;->w:Lo/l0;

    .line 198
    .line 199
    const/4 v6, 0x2

    .line 200
    check-cast v5, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 201
    .line 202
    invoke-virtual {v5, v6}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j(I)V

    .line 203
    .line 204
    .line 205
    :cond_7
    iget-boolean v5, p0, Lh/D;->K:Z

    .line 206
    .line 207
    if-eqz v5, :cond_b

    .line 208
    .line 209
    iget-object v5, p0, Lh/D;->w:Lo/l0;

    .line 210
    .line 211
    const/4 v6, 0x5

    .line 212
    check-cast v5, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 213
    .line 214
    invoke-virtual {v5, v6}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j(I)V

    .line 215
    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_8
    move-object v4, v8

    .line 219
    goto :goto_2

    .line 220
    :cond_9
    iget-boolean v5, p0, Lh/D;->N:Z

    .line 221
    .line 222
    if-eqz v5, :cond_a

    .line 223
    .line 224
    const v5, 0x7f0c0016

    .line 225
    .line 226
    .line 227
    invoke-virtual {v4, v5, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    check-cast v4, Landroid/view/ViewGroup;

    .line 232
    .line 233
    goto :goto_2

    .line 234
    :cond_a
    const v5, 0x7f0c0015

    .line 235
    .line 236
    .line 237
    invoke-virtual {v4, v5, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    check-cast v4, Landroid/view/ViewGroup;

    .line 242
    .line 243
    :cond_b
    :goto_2
    if-eqz v4, :cond_19

    .line 244
    .line 245
    new-instance v5, Lh/u;

    .line 246
    .line 247
    invoke-direct {v5, p0, v1}, Lh/u;-><init>(Lh/D;I)V

    .line 248
    .line 249
    .line 250
    sget-object v6, LN/Q;->a:Ljava/util/WeakHashMap;

    .line 251
    .line 252
    invoke-static {v4, v5}, LN/F;->u(Landroid/view/View;LN/r;)V

    .line 253
    .line 254
    .line 255
    iget-object v5, p0, Lh/D;->w:Lo/l0;

    .line 256
    .line 257
    if-nez v5, :cond_c

    .line 258
    .line 259
    const v5, 0x7f0901f3

    .line 260
    .line 261
    .line 262
    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 263
    .line 264
    .line 265
    move-result-object v5

    .line 266
    check-cast v5, Landroid/widget/TextView;

    .line 267
    .line 268
    iput-object v5, p0, Lh/D;->H:Landroid/widget/TextView;

    .line 269
    .line 270
    :cond_c
    sget-boolean v5, Lo/n1;->a:Z

    .line 271
    .line 272
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    const-string v6, "makeOptionalFitsSystemWindows"

    .line 277
    .line 278
    invoke-virtual {v5, v6, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 279
    .line 280
    .line 281
    move-result-object v5

    .line 282
    invoke-virtual {v5}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 283
    .line 284
    .line 285
    move-result v6

    .line 286
    if-nez v6, :cond_d

    .line 287
    .line 288
    invoke-virtual {v5, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 289
    .line 290
    .line 291
    goto :goto_3

    .line 292
    :catch_0
    nop

    .line 293
    goto :goto_4

    .line 294
    :cond_d
    :goto_3
    invoke-virtual {v5, v4, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 295
    .line 296
    .line 297
    :goto_4
    const v5, 0x7f090036

    .line 298
    .line 299
    .line 300
    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 301
    .line 302
    .line 303
    move-result-object v5

    .line 304
    check-cast v5, Landroidx/appcompat/widget/ContentFrameLayout;

    .line 305
    .line 306
    iget-object v6, p0, Lh/D;->q:Landroid/view/Window;

    .line 307
    .line 308
    const v9, 0x1020002

    .line 309
    .line 310
    .line 311
    invoke-virtual {v6, v9}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 312
    .line 313
    .line 314
    move-result-object v6

    .line 315
    check-cast v6, Landroid/view/ViewGroup;

    .line 316
    .line 317
    if-eqz v6, :cond_f

    .line 318
    .line 319
    :goto_5
    invoke-virtual {v6}, Landroid/view/ViewGroup;->getChildCount()I

    .line 320
    .line 321
    .line 322
    move-result v10

    .line 323
    if-lez v10, :cond_e

    .line 324
    .line 325
    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 326
    .line 327
    .line 328
    move-result-object v10

    .line 329
    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v5, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 333
    .line 334
    .line 335
    goto :goto_5

    .line 336
    :cond_e
    const/4 v10, -0x1

    .line 337
    invoke-virtual {v6, v10}, Landroid/view/View;->setId(I)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v5, v9}, Landroid/view/View;->setId(I)V

    .line 341
    .line 342
    .line 343
    instance-of v10, v6, Landroid/widget/FrameLayout;

    .line 344
    .line 345
    if-eqz v10, :cond_f

    .line 346
    .line 347
    check-cast v6, Landroid/widget/FrameLayout;

    .line 348
    .line 349
    invoke-virtual {v6, v8}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 350
    .line 351
    .line 352
    :cond_f
    iget-object v6, p0, Lh/D;->q:Landroid/view/Window;

    .line 353
    .line 354
    invoke-virtual {v6, v4}, Landroid/view/Window;->setContentView(Landroid/view/View;)V

    .line 355
    .line 356
    .line 357
    new-instance v6, Lh/u;

    .line 358
    .line 359
    invoke-direct {v6, p0, v0}, Lh/u;-><init>(Lh/D;I)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v5, v6}, Landroidx/appcompat/widget/ContentFrameLayout;->setAttachListener(Lo/k0;)V

    .line 363
    .line 364
    .line 365
    iput-object v4, p0, Lh/D;->G:Landroid/view/ViewGroup;

    .line 366
    .line 367
    iget-object v4, p0, Lh/D;->o:Ljava/lang/Object;

    .line 368
    .line 369
    instance-of v5, v4, Landroid/app/Activity;

    .line 370
    .line 371
    if-eqz v5, :cond_10

    .line 372
    .line 373
    check-cast v4, Landroid/app/Activity;

    .line 374
    .line 375
    invoke-virtual {v4}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    .line 376
    .line 377
    .line 378
    move-result-object v4

    .line 379
    goto :goto_6

    .line 380
    :cond_10
    iget-object v4, p0, Lh/D;->v:Ljava/lang/CharSequence;

    .line 381
    .line 382
    :goto_6
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 383
    .line 384
    .line 385
    move-result v5

    .line 386
    if-nez v5, :cond_13

    .line 387
    .line 388
    iget-object v5, p0, Lh/D;->w:Lo/l0;

    .line 389
    .line 390
    if-eqz v5, :cond_11

    .line 391
    .line 392
    invoke-interface {v5, v4}, Lo/l0;->setWindowTitle(Ljava/lang/CharSequence;)V

    .line 393
    .line 394
    .line 395
    goto :goto_7

    .line 396
    :cond_11
    iget-object v5, p0, Lh/D;->t:Lh/N;

    .line 397
    .line 398
    if-eqz v5, :cond_12

    .line 399
    .line 400
    iget-object v5, v5, Lh/N;->p:Lo/m0;

    .line 401
    .line 402
    check-cast v5, Lo/f1;

    .line 403
    .line 404
    iget-boolean v6, v5, Lo/f1;->g:Z

    .line 405
    .line 406
    if-nez v6, :cond_13

    .line 407
    .line 408
    iput-object v4, v5, Lo/f1;->h:Ljava/lang/CharSequence;

    .line 409
    .line 410
    iget v6, v5, Lo/f1;->b:I

    .line 411
    .line 412
    and-int/lit8 v6, v6, 0x8

    .line 413
    .line 414
    if-eqz v6, :cond_13

    .line 415
    .line 416
    iget-object v6, v5, Lo/f1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 417
    .line 418
    invoke-virtual {v6, v4}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 419
    .line 420
    .line 421
    iget-boolean v5, v5, Lo/f1;->g:Z

    .line 422
    .line 423
    if-eqz v5, :cond_13

    .line 424
    .line 425
    invoke-virtual {v6}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 426
    .line 427
    .line 428
    move-result-object v5

    .line 429
    invoke-static {v5, v4}, LN/Q;->q(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 430
    .line 431
    .line 432
    goto :goto_7

    .line 433
    :cond_12
    iget-object v5, p0, Lh/D;->H:Landroid/widget/TextView;

    .line 434
    .line 435
    if-eqz v5, :cond_13

    .line 436
    .line 437
    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 438
    .line 439
    .line 440
    :cond_13
    :goto_7
    iget-object v4, p0, Lh/D;->G:Landroid/view/ViewGroup;

    .line 441
    .line 442
    invoke-virtual {v4, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 443
    .line 444
    .line 445
    move-result-object v4

    .line 446
    check-cast v4, Landroidx/appcompat/widget/ContentFrameLayout;

    .line 447
    .line 448
    iget-object v5, p0, Lh/D;->q:Landroid/view/Window;

    .line 449
    .line 450
    invoke-virtual {v5}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 451
    .line 452
    .line 453
    move-result-object v5

    .line 454
    invoke-virtual {v5}, Landroid/view/View;->getPaddingLeft()I

    .line 455
    .line 456
    .line 457
    move-result v6

    .line 458
    invoke-virtual {v5}, Landroid/view/View;->getPaddingTop()I

    .line 459
    .line 460
    .line 461
    move-result v8

    .line 462
    invoke-virtual {v5}, Landroid/view/View;->getPaddingRight()I

    .line 463
    .line 464
    .line 465
    move-result v9

    .line 466
    invoke-virtual {v5}, Landroid/view/View;->getPaddingBottom()I

    .line 467
    .line 468
    .line 469
    move-result v5

    .line 470
    iget-object v10, v4, Landroidx/appcompat/widget/ContentFrameLayout;->l:Landroid/graphics/Rect;

    .line 471
    .line 472
    invoke-virtual {v10, v6, v8, v9, v5}, Landroid/graphics/Rect;->set(IIII)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v4}, Landroid/view/View;->isLaidOut()Z

    .line 476
    .line 477
    .line 478
    move-result v5

    .line 479
    if-eqz v5, :cond_14

    .line 480
    .line 481
    invoke-virtual {v4}, Landroid/view/View;->requestLayout()V

    .line 482
    .line 483
    .line 484
    :cond_14
    invoke-virtual {v3, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 485
    .line 486
    .line 487
    move-result-object v2

    .line 488
    const/16 v3, 0x7c

    .line 489
    .line 490
    invoke-virtual {v4}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMajor()Landroid/util/TypedValue;

    .line 491
    .line 492
    .line 493
    move-result-object v5

    .line 494
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 495
    .line 496
    .line 497
    const/16 v3, 0x7d

    .line 498
    .line 499
    invoke-virtual {v4}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMinor()Landroid/util/TypedValue;

    .line 500
    .line 501
    .line 502
    move-result-object v5

    .line 503
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 504
    .line 505
    .line 506
    const/16 v3, 0x7a

    .line 507
    .line 508
    invoke-virtual {v2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 509
    .line 510
    .line 511
    move-result v5

    .line 512
    if-eqz v5, :cond_15

    .line 513
    .line 514
    invoke-virtual {v4}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMajor()Landroid/util/TypedValue;

    .line 515
    .line 516
    .line 517
    move-result-object v5

    .line 518
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 519
    .line 520
    .line 521
    :cond_15
    const/16 v3, 0x7b

    .line 522
    .line 523
    invoke-virtual {v2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 524
    .line 525
    .line 526
    move-result v5

    .line 527
    if-eqz v5, :cond_16

    .line 528
    .line 529
    invoke-virtual {v4}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMinor()Landroid/util/TypedValue;

    .line 530
    .line 531
    .line 532
    move-result-object v5

    .line 533
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 534
    .line 535
    .line 536
    :cond_16
    const/16 v3, 0x78

    .line 537
    .line 538
    invoke-virtual {v2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 539
    .line 540
    .line 541
    move-result v5

    .line 542
    if-eqz v5, :cond_17

    .line 543
    .line 544
    invoke-virtual {v4}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMajor()Landroid/util/TypedValue;

    .line 545
    .line 546
    .line 547
    move-result-object v5

    .line 548
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 549
    .line 550
    .line 551
    :cond_17
    const/16 v3, 0x79

    .line 552
    .line 553
    invoke-virtual {v2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 554
    .line 555
    .line 556
    move-result v5

    .line 557
    if-eqz v5, :cond_18

    .line 558
    .line 559
    invoke-virtual {v4}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMinor()Landroid/util/TypedValue;

    .line 560
    .line 561
    .line 562
    move-result-object v5

    .line 563
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 564
    .line 565
    .line 566
    :cond_18
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 567
    .line 568
    .line 569
    invoke-virtual {v4}, Landroid/view/View;->requestLayout()V

    .line 570
    .line 571
    .line 572
    iput-boolean v0, p0, Lh/D;->F:Z

    .line 573
    .line 574
    invoke-virtual {p0, v1}, Lh/D;->y(I)Lh/C;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    iget-boolean v1, p0, Lh/D;->W:Z

    .line 579
    .line 580
    if-nez v1, :cond_1b

    .line 581
    .line 582
    iget-object v0, v0, Lh/C;->h:Ln/l;

    .line 583
    .line 584
    if-nez v0, :cond_1b

    .line 585
    .line 586
    invoke-virtual {p0, v7}, Lh/D;->A(I)V

    .line 587
    .line 588
    .line 589
    goto :goto_8

    .line 590
    :cond_19
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 591
    .line 592
    new-instance v1, Ljava/lang/StringBuilder;

    .line 593
    .line 594
    const-string v2, "AppCompat does not support the current theme features: { windowActionBar: "

    .line 595
    .line 596
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 597
    .line 598
    .line 599
    iget-boolean v2, p0, Lh/D;->L:Z

    .line 600
    .line 601
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 602
    .line 603
    .line 604
    const-string v2, ", windowActionBarOverlay: "

    .line 605
    .line 606
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 607
    .line 608
    .line 609
    iget-boolean v2, p0, Lh/D;->M:Z

    .line 610
    .line 611
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 612
    .line 613
    .line 614
    const-string v2, ", android:windowIsFloating: "

    .line 615
    .line 616
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 617
    .line 618
    .line 619
    iget-boolean v2, p0, Lh/D;->O:Z

    .line 620
    .line 621
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 622
    .line 623
    .line 624
    const-string v2, ", windowActionModeOverlay: "

    .line 625
    .line 626
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 627
    .line 628
    .line 629
    iget-boolean v2, p0, Lh/D;->N:Z

    .line 630
    .line 631
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 632
    .line 633
    .line 634
    const-string v2, ", windowNoTitle: "

    .line 635
    .line 636
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 637
    .line 638
    .line 639
    iget-boolean v2, p0, Lh/D;->P:Z

    .line 640
    .line 641
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 642
    .line 643
    .line 644
    const-string v2, " }"

    .line 645
    .line 646
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 647
    .line 648
    .line 649
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v1

    .line 653
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 654
    .line 655
    .line 656
    throw v0

    .line 657
    :cond_1a
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 658
    .line 659
    .line 660
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 661
    .line 662
    const-string v1, "You need to use a Theme.AppCompat theme (or descendant) with this activity."

    .line 663
    .line 664
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 665
    .line 666
    .line 667
    throw v0

    .line 668
    :cond_1b
    :goto_8
    return-void
.end method

.method public final v()V
    .locals 2

    .line 1
    iget-object v0, p0, Lh/D;->q:Landroid/view/Window;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lh/D;->o:Ljava/lang/Object;

    .line 6
    .line 7
    instance-of v1, v0, Landroid/app/Activity;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v0, Landroid/app/Activity;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0, v0}, Lh/D;->m(Landroid/view/Window;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lh/D;->q:Landroid/view/Window;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v1, "We have not been given a Window"

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0
.end method

.method public final w(Landroid/content/Context;)Landroidx/fragment/app/g;
    .locals 3

    .line 1
    iget-object v0, p0, Lh/D;->c0:Lh/A;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Lh/A;

    .line 6
    .line 7
    sget-object v1, Landroid/support/v4/media/session/t;->f:Landroid/support/v4/media/session/t;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    new-instance v1, Landroid/support/v4/media/session/t;

    .line 16
    .line 17
    const-string v2, "location"

    .line 18
    .line 19
    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Landroid/location/LocationManager;

    .line 24
    .line 25
    invoke-direct {v1, p1, v2}, Landroid/support/v4/media/session/t;-><init>(Landroid/content/Context;Landroid/location/LocationManager;)V

    .line 26
    .line 27
    .line 28
    sput-object v1, Landroid/support/v4/media/session/t;->f:Landroid/support/v4/media/session/t;

    .line 29
    .line 30
    :cond_0
    sget-object p1, Landroid/support/v4/media/session/t;->f:Landroid/support/v4/media/session/t;

    .line 31
    .line 32
    invoke-direct {v0, p0, p1}, Lh/A;-><init>(Lh/D;Landroid/support/v4/media/session/t;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lh/D;->c0:Lh/A;

    .line 36
    .line 37
    :cond_1
    iget-object p1, p0, Lh/D;->c0:Lh/A;

    .line 38
    .line 39
    return-object p1
.end method

.method public final y(I)Lh/C;
    .locals 4

    .line 1
    iget-object v0, p0, Lh/D;->R:[Lh/C;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    array-length v2, v0

    .line 7
    if-gt v2, p1, :cond_2

    .line 8
    .line 9
    :cond_0
    add-int/lit8 v2, p1, 0x1

    .line 10
    .line 11
    new-array v2, v2, [Lh/C;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    array-length v3, v0

    .line 16
    invoke-static {v0, v1, v2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 17
    .line 18
    .line 19
    :cond_1
    iput-object v2, p0, Lh/D;->R:[Lh/C;

    .line 20
    .line 21
    move-object v0, v2

    .line 22
    :cond_2
    aget-object v2, v0, p1

    .line 23
    .line 24
    if-nez v2, :cond_3

    .line 25
    .line 26
    new-instance v2, Lh/C;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput p1, v2, Lh/C;->a:I

    .line 32
    .line 33
    iput-boolean v1, v2, Lh/C;->n:Z

    .line 34
    .line 35
    aput-object v2, v0, p1

    .line 36
    .line 37
    :cond_3
    return-object v2
.end method

.method public final z()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lh/D;->u()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lh/D;->L:Z

    .line 5
    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    iget-object v0, p0, Lh/D;->t:Lh/N;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    iget-object v0, p0, Lh/D;->o:Ljava/lang/Object;

    .line 14
    .line 15
    instance-of v1, v0, Landroid/app/Activity;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    new-instance v1, Lh/N;

    .line 20
    .line 21
    check-cast v0, Landroid/app/Activity;

    .line 22
    .line 23
    iget-boolean v2, p0, Lh/D;->M:Z

    .line 24
    .line 25
    invoke-direct {v1, v0, v2}, Lh/N;-><init>(Landroid/app/Activity;Z)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lh/D;->t:Lh/N;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    instance-of v1, v0, Landroid/app/Dialog;

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    new-instance v1, Lh/N;

    .line 36
    .line 37
    check-cast v0, Landroid/app/Dialog;

    .line 38
    .line 39
    invoke-direct {v1, v0}, Lh/N;-><init>(Landroid/app/Dialog;)V

    .line 40
    .line 41
    .line 42
    iput-object v1, p0, Lh/D;->t:Lh/N;

    .line 43
    .line 44
    :cond_2
    :goto_0
    iget-object v0, p0, Lh/D;->t:Lh/N;

    .line 45
    .line 46
    if-eqz v0, :cond_4

    .line 47
    .line 48
    iget-boolean v1, p0, Lh/D;->h0:Z

    .line 49
    .line 50
    iget-boolean v2, v0, Lh/N;->s:Z

    .line 51
    .line 52
    if-nez v2, :cond_4

    .line 53
    .line 54
    const/4 v2, 0x4

    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    const/4 v1, 0x4

    .line 58
    goto :goto_1

    .line 59
    :cond_3
    const/4 v1, 0x0

    .line 60
    :goto_1
    iget-object v3, v0, Lh/N;->p:Lo/m0;

    .line 61
    .line 62
    check-cast v3, Lo/f1;

    .line 63
    .line 64
    iget v4, v3, Lo/f1;->b:I

    .line 65
    .line 66
    const/4 v5, 0x1

    .line 67
    iput-boolean v5, v0, Lh/N;->s:Z

    .line 68
    .line 69
    and-int/lit8 v0, v1, 0x4

    .line 70
    .line 71
    and-int/lit8 v1, v4, -0x5

    .line 72
    .line 73
    or-int/2addr v0, v1

    .line 74
    invoke-virtual {v3, v0}, Lo/f1;->a(I)V

    .line 75
    .line 76
    .line 77
    :cond_4
    :goto_2
    return-void
.end method
