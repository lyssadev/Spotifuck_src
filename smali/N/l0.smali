.class public final LN/l0;
.super LN/o0;
.source "SourceFile"


# static fields
.field public static e:Ljava/lang/reflect/Field; = null

.field public static f:Z = false

.field public static g:Ljava/lang/reflect/Constructor; = null

.field public static h:Z = false


# instance fields
.field public c:Landroid/view/WindowInsets;

.field public d:LF/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LN/o0;-><init>()V

    .line 2
    invoke-static {}, LN/l0;->i()Landroid/view/WindowInsets;

    move-result-object v0

    iput-object v0, p0, LN/l0;->c:Landroid/view/WindowInsets;

    return-void
.end method

.method public constructor <init>(LN/w0;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, LN/o0;-><init>(LN/w0;)V

    .line 4
    invoke-virtual {p1}, LN/w0;->f()Landroid/view/WindowInsets;

    move-result-object p1

    iput-object p1, p0, LN/l0;->c:Landroid/view/WindowInsets;

    return-void
.end method

.method private static i()Landroid/view/WindowInsets;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    sget-boolean v1, LN/l0;->f:Z

    .line 3
    .line 4
    const/4 v2, 0x1

    .line 5
    const-class v3, Landroid/view/WindowInsets;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    :try_start_0
    const-string v1, "CONSUMED"

    .line 10
    .line 11
    invoke-virtual {v3, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sput-object v1, LN/l0;->e:Ljava/lang/reflect/Field;
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    :catch_0
    sput-boolean v2, LN/l0;->f:Z

    .line 18
    .line 19
    :cond_0
    sget-object v1, LN/l0;->e:Ljava/lang/reflect/Field;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    :try_start_1
    invoke-virtual {v1, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Landroid/view/WindowInsets;

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    new-instance v5, Landroid/view/WindowInsets;

    .line 33
    .line 34
    invoke-direct {v5, v1}, Landroid/view/WindowInsets;-><init>(Landroid/view/WindowInsets;)V
    :try_end_1
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_1 .. :try_end_1} :catch_1

    .line 35
    .line 36
    .line 37
    return-object v5

    .line 38
    :catch_1
    nop

    .line 39
    :cond_1
    sget-boolean v1, LN/l0;->h:Z

    .line 40
    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    :try_start_2
    new-array v1, v2, [Ljava/lang/Class;

    .line 44
    .line 45
    const-class v5, Landroid/graphics/Rect;

    .line 46
    .line 47
    aput-object v5, v1, v0

    .line 48
    .line 49
    invoke-virtual {v3, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    sput-object v1, LN/l0;->g:Ljava/lang/reflect/Constructor;
    :try_end_2
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_2 .. :try_end_2} :catch_2

    .line 54
    .line 55
    :catch_2
    sput-boolean v2, LN/l0;->h:Z

    .line 56
    .line 57
    :cond_2
    sget-object v1, LN/l0;->g:Ljava/lang/reflect/Constructor;

    .line 58
    .line 59
    if-eqz v1, :cond_3

    .line 60
    .line 61
    :try_start_3
    new-instance v3, Landroid/graphics/Rect;

    .line 62
    .line 63
    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 64
    .line 65
    .line 66
    new-array v2, v2, [Ljava/lang/Object;

    .line 67
    .line 68
    aput-object v3, v2, v0

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Landroid/view/WindowInsets;
    :try_end_3
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_3 .. :try_end_3} :catch_3

    .line 75
    .line 76
    return-object v0

    .line 77
    :catch_3
    :cond_3
    return-object v4
.end method


# virtual methods
.method public b()LN/w0;
    .locals 3

    .line 1
    invoke-virtual {p0}, LN/o0;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LN/l0;->c:Landroid/view/WindowInsets;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {v1, v0}, LN/w0;->g(Landroid/view/View;Landroid/view/WindowInsets;)LN/w0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, LN/o0;->b:[LF/c;

    .line 12
    .line 13
    iget-object v2, v0, LN/w0;->a:LN/u0;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, LN/u0;->o([LF/c;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, LN/l0;->d:LF/c;

    .line 19
    .line 20
    invoke-virtual {v2, v1}, LN/u0;->q(LF/c;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public e(LF/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN/l0;->d:LF/c;

    .line 2
    .line 3
    return-void
.end method

.method public g(LF/c;)V
    .locals 4

    .line 1
    iget-object v0, p0, LN/l0;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, p1, LF/c;->a:I

    .line 6
    .line 7
    iget v2, p1, LF/c;->c:I

    .line 8
    .line 9
    iget v3, p1, LF/c;->d:I

    .line 10
    .line 11
    iget p1, p1, LF/c;->b:I

    .line 12
    .line 13
    invoke-virtual {v0, v1, p1, v2, v3}, Landroid/view/WindowInsets;->replaceSystemWindowInsets(IIII)Landroid/view/WindowInsets;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, LN/l0;->c:Landroid/view/WindowInsets;

    .line 18
    .line 19
    :cond_0
    return-void
.end method
