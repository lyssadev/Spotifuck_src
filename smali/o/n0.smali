.class public abstract Lo/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Z

.field public static final b:Ljava/lang/reflect/Method;

.field public static final c:Ljava/lang/reflect/Field;

.field public static final d:Ljava/lang/reflect/Field;

.field public static final e:Ljava/lang/reflect/Field;

.field public static final f:Ljava/lang/reflect/Field;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    :try_start_0
    const-string v3, "android.graphics.Insets"

    .line 5
    .line 6
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    const-class v4, Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    const-string v5, "getOpticalInsets"

    .line 13
    .line 14
    invoke-virtual {v4, v5, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 15
    .line 16
    .line 17
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_a
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_9
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_8

    .line 18
    :try_start_1
    const-string v5, "left"

    .line 19
    .line 20
    invoke-virtual {v3, v5}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 21
    .line 22
    .line 23
    move-result-object v5
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_5

    .line 24
    :try_start_2
    const-string v6, "top"

    .line 25
    .line 26
    invoke-virtual {v3, v6}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 27
    .line 28
    .line 29
    move-result-object v6
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_2

    .line 30
    :try_start_3
    const-string v7, "right"

    .line 31
    .line 32
    invoke-virtual {v3, v7}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 33
    .line 34
    .line 35
    move-result-object v7
    :try_end_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_3 .. :try_end_3} :catch_1

    .line 36
    :try_start_4
    const-string v8, "bottom"

    .line 37
    .line 38
    invoke-virtual {v3, v8}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 39
    .line 40
    .line 41
    move-result-object v3
    :try_end_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_4 .. :try_end_4} :catch_0

    .line 42
    const/4 v8, 0x1

    .line 43
    goto :goto_5

    .line 44
    :catch_0
    nop

    .line 45
    goto :goto_4

    .line 46
    :catch_1
    nop

    .line 47
    move-object v7, v1

    .line 48
    goto :goto_4

    .line 49
    :catch_2
    nop

    .line 50
    move-object v6, v1

    .line 51
    :goto_0
    move-object v7, v6

    .line 52
    goto :goto_4

    .line 53
    :catch_3
    nop

    .line 54
    move-object v6, v1

    .line 55
    goto :goto_0

    .line 56
    :catch_4
    nop

    .line 57
    move-object v6, v1

    .line 58
    goto :goto_0

    .line 59
    :catch_5
    nop

    .line 60
    move-object v5, v1

    .line 61
    :goto_1
    move-object v6, v5

    .line 62
    goto :goto_0

    .line 63
    :catch_6
    nop

    .line 64
    move-object v5, v1

    .line 65
    :goto_2
    move-object v6, v5

    .line 66
    goto :goto_0

    .line 67
    :catch_7
    nop

    .line 68
    move-object v5, v1

    .line 69
    :goto_3
    move-object v6, v5

    .line 70
    goto :goto_0

    .line 71
    :catch_8
    nop

    .line 72
    move-object v4, v1

    .line 73
    move-object v5, v4

    .line 74
    goto :goto_1

    .line 75
    :catch_9
    nop

    .line 76
    move-object v4, v1

    .line 77
    move-object v5, v4

    .line 78
    goto :goto_2

    .line 79
    :catch_a
    nop

    .line 80
    move-object v4, v1

    .line 81
    move-object v5, v4

    .line 82
    goto :goto_3

    .line 83
    :goto_4
    move-object v3, v1

    .line 84
    const/4 v8, 0x0

    .line 85
    :goto_5
    if-eqz v8, :cond_0

    .line 86
    .line 87
    sput-object v4, Lo/n0;->b:Ljava/lang/reflect/Method;

    .line 88
    .line 89
    sput-object v5, Lo/n0;->c:Ljava/lang/reflect/Field;

    .line 90
    .line 91
    sput-object v6, Lo/n0;->d:Ljava/lang/reflect/Field;

    .line 92
    .line 93
    sput-object v7, Lo/n0;->e:Ljava/lang/reflect/Field;

    .line 94
    .line 95
    sput-object v3, Lo/n0;->f:Ljava/lang/reflect/Field;

    .line 96
    .line 97
    sput-boolean v0, Lo/n0;->a:Z

    .line 98
    .line 99
    goto :goto_6

    .line 100
    :cond_0
    sput-object v1, Lo/n0;->b:Ljava/lang/reflect/Method;

    .line 101
    .line 102
    sput-object v1, Lo/n0;->c:Ljava/lang/reflect/Field;

    .line 103
    .line 104
    sput-object v1, Lo/n0;->d:Ljava/lang/reflect/Field;

    .line 105
    .line 106
    sput-object v1, Lo/n0;->e:Ljava/lang/reflect/Field;

    .line 107
    .line 108
    sput-object v1, Lo/n0;->f:Ljava/lang/reflect/Field;

    .line 109
    .line 110
    sput-boolean v2, Lo/n0;->a:Z

    .line 111
    .line 112
    :goto_6
    return-void
.end method
