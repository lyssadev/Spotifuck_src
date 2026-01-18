.class public abstract LJ/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x3

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x1

    .line 5
    const-class v4, Ljava/lang/String;

    .line 6
    .line 7
    const-class v5, Landroid/os/Trace;

    .line 8
    .line 9
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v7, 0x1d

    .line 12
    .line 13
    if-ge v6, v7, :cond_0

    .line 14
    .line 15
    :try_start_0
    const-string v6, "TRACE_TAG_APP"

    .line 16
    .line 17
    invoke-virtual {v5, v6}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    const/4 v7, 0x0

    .line 22
    invoke-virtual {v6, v7}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J

    .line 23
    .line 24
    .line 25
    const-string v6, "isTagEnabled"

    .line 26
    .line 27
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 28
    .line 29
    new-array v8, v3, [Ljava/lang/Class;

    .line 30
    .line 31
    aput-object v7, v8, v2

    .line 32
    .line 33
    invoke-virtual {v5, v6, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 34
    .line 35
    .line 36
    const-string v6, "asyncTraceBegin"

    .line 37
    .line 38
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 39
    .line 40
    new-array v9, v1, [Ljava/lang/Class;

    .line 41
    .line 42
    aput-object v7, v9, v2

    .line 43
    .line 44
    aput-object v4, v9, v3

    .line 45
    .line 46
    aput-object v8, v9, v0

    .line 47
    .line 48
    invoke-virtual {v5, v6, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 49
    .line 50
    .line 51
    const-string v6, "asyncTraceEnd"

    .line 52
    .line 53
    new-array v9, v1, [Ljava/lang/Class;

    .line 54
    .line 55
    aput-object v7, v9, v2

    .line 56
    .line 57
    aput-object v4, v9, v3

    .line 58
    .line 59
    aput-object v8, v9, v0

    .line 60
    .line 61
    invoke-virtual {v5, v6, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 62
    .line 63
    .line 64
    const-string v6, "traceCounter"

    .line 65
    .line 66
    new-array v1, v1, [Ljava/lang/Class;

    .line 67
    .line 68
    aput-object v7, v1, v2

    .line 69
    .line 70
    aput-object v4, v1, v3

    .line 71
    .line 72
    aput-object v8, v1, v0

    .line 73
    .line 74
    invoke-virtual {v5, v6, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    .line 76
    .line 77
    :catch_0
    :cond_0
    return-void
.end method
