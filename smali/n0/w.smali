.class public abstract Ln0/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LK0/e;

.field public static final b:Ln0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Ln0/E;

    .line 8
    .line 9
    const/16 v1, 0x19

    .line 10
    .line 11
    invoke-direct {v0, v1}, LK0/e;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Ln0/w;->a:LK0/e;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/16 v1, 0x17

    .line 18
    .line 19
    if-lt v0, v1, :cond_1

    .line 20
    .line 21
    new-instance v0, Ln0/D;

    .line 22
    .line 23
    const/16 v1, 0x19

    .line 24
    .line 25
    invoke-direct {v0, v1}, LK0/e;-><init>(I)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Ln0/w;->a:LK0/e;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/16 v1, 0x16

    .line 32
    .line 33
    if-lt v0, v1, :cond_2

    .line 34
    .line 35
    new-instance v0, Ln0/B;

    .line 36
    .line 37
    const/16 v1, 0x19

    .line 38
    .line 39
    invoke-direct {v0, v1}, LK0/e;-><init>(I)V

    .line 40
    .line 41
    .line 42
    sput-object v0, Ln0/w;->a:LK0/e;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    new-instance v0, LK0/e;

    .line 46
    .line 47
    const/16 v1, 0x19

    .line 48
    .line 49
    invoke-direct {v0, v1}, LK0/e;-><init>(I)V

    .line 50
    .line 51
    .line 52
    sput-object v0, Ln0/w;->a:LK0/e;

    .line 53
    .line 54
    :goto_0
    new-instance v0, Ln0/b;

    .line 55
    .line 56
    const-class v1, Ljava/lang/Float;

    .line 57
    .line 58
    const-string v2, "translationAlpha"

    .line 59
    .line 60
    const/4 v3, 0x5

    .line 61
    invoke-direct {v0, v1, v2, v3}, Ln0/b;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    .line 62
    .line 63
    .line 64
    sput-object v0, Ln0/w;->b:Ln0/b;

    .line 65
    .line 66
    new-instance v0, Ln0/b;

    .line 67
    .line 68
    const-class v1, Landroid/graphics/Rect;

    .line 69
    .line 70
    const-string v2, "clipBounds"

    .line 71
    .line 72
    const/4 v3, 0x6

    .line 73
    invoke-direct {v0, v1, v2, v3}, Ln0/b;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public static a(Landroid/view/View;IIII)V
    .locals 6

    .line 1
    sget-object v0, Ln0/w;->a:LK0/e;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move v2, p1

    .line 5
    move v3, p2

    .line 6
    move v4, p3

    .line 7
    move v5, p4

    .line 8
    invoke-virtual/range {v0 .. v5}, LK0/e;->n(Landroid/view/View;IIII)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static b(Landroid/view/View;I)V
    .locals 1

    .line 1
    sget-object v0, Ln0/w;->a:LK0/e;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, LK0/e;->p(Landroid/view/View;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
