.class public abstract LC/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Class;

.field public static final b:Ljava/lang/reflect/Field;

.field public static final c:Ljava/lang/reflect/Field;

.field public static final d:Ljava/lang/reflect/Method;

.field public static final e:Ljava/lang/reflect/Method;

.field public static final f:Ljava/lang/reflect/Method;

.field public static final g:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    const/4 v0, 0x3

    .line 2
    const-class v1, Landroid/os/IBinder;

    .line 3
    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x1

    .line 7
    const-class v5, Landroid/app/Activity;

    .line 8
    .line 9
    new-instance v6, Landroid/os/Handler;

    .line 10
    .line 11
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object v7

    .line 15
    invoke-direct {v6, v7}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 16
    .line 17
    .line 18
    sput-object v6, LC/d;->g:Landroid/os/Handler;

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    :try_start_0
    const-string v7, "android.app.ActivityThread"

    .line 22
    .line 23
    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-object v7, v6

    .line 29
    :goto_0
    sput-object v7, LC/d;->a:Ljava/lang/Class;

    .line 30
    .line 31
    :try_start_1
    const-string v7, "mMainThread"

    .line 32
    .line 33
    invoke-virtual {v5, v7}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    invoke-virtual {v7, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :catchall_1
    move-object v7, v6

    .line 42
    :goto_1
    sput-object v7, LC/d;->b:Ljava/lang/reflect/Field;

    .line 43
    .line 44
    :try_start_2
    const-string v7, "mToken"

    .line 45
    .line 46
    invoke-virtual {v5, v7}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-virtual {v5, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :catchall_2
    move-object v5, v6

    .line 55
    :goto_2
    sput-object v5, LC/d;->c:Ljava/lang/reflect/Field;

    .line 56
    .line 57
    sget-object v5, LC/d;->a:Ljava/lang/Class;

    .line 58
    .line 59
    const-string v7, "performStopActivity"

    .line 60
    .line 61
    if-nez v5, :cond_0

    .line 62
    .line 63
    :catchall_3
    move-object v5, v6

    .line 64
    goto :goto_3

    .line 65
    :cond_0
    :try_start_3
    new-array v8, v0, [Ljava/lang/Class;

    .line 66
    .line 67
    aput-object v1, v8, v3

    .line 68
    .line 69
    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 70
    .line 71
    aput-object v9, v8, v4

    .line 72
    .line 73
    const-class v9, Ljava/lang/String;

    .line 74
    .line 75
    aput-object v9, v8, v2

    .line 76
    .line 77
    invoke-virtual {v5, v7, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-virtual {v5, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 82
    .line 83
    .line 84
    :goto_3
    sput-object v5, LC/d;->d:Ljava/lang/reflect/Method;

    .line 85
    .line 86
    sget-object v5, LC/d;->a:Ljava/lang/Class;

    .line 87
    .line 88
    if-nez v5, :cond_1

    .line 89
    .line 90
    :catchall_4
    move-object v5, v6

    .line 91
    goto :goto_4

    .line 92
    :cond_1
    :try_start_4
    new-array v8, v2, [Ljava/lang/Class;

    .line 93
    .line 94
    aput-object v1, v8, v3

    .line 95
    .line 96
    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 97
    .line 98
    aput-object v9, v8, v4

    .line 99
    .line 100
    invoke-virtual {v5, v7, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    invoke-virtual {v5, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 105
    .line 106
    .line 107
    :goto_4
    sput-object v5, LC/d;->e:Ljava/lang/reflect/Method;

    .line 108
    .line 109
    sget-object v5, LC/d;->a:Ljava/lang/Class;

    .line 110
    .line 111
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 112
    .line 113
    const/16 v8, 0x1a

    .line 114
    .line 115
    if-eq v7, v8, :cond_2

    .line 116
    .line 117
    const/16 v8, 0x1b

    .line 118
    .line 119
    if-ne v7, v8, :cond_4

    .line 120
    .line 121
    :cond_2
    if-nez v5, :cond_3

    .line 122
    .line 123
    goto :goto_5

    .line 124
    :cond_3
    :try_start_5
    const-string v7, "requestRelaunchActivity"

    .line 125
    .line 126
    const/16 v8, 0x9

    .line 127
    .line 128
    new-array v8, v8, [Ljava/lang/Class;

    .line 129
    .line 130
    aput-object v1, v8, v3

    .line 131
    .line 132
    const-class v1, Ljava/util/List;

    .line 133
    .line 134
    aput-object v1, v8, v4

    .line 135
    .line 136
    aput-object v1, v8, v2

    .line 137
    .line 138
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 139
    .line 140
    aput-object v1, v8, v0

    .line 141
    .line 142
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 143
    .line 144
    const/4 v1, 0x4

    .line 145
    aput-object v0, v8, v1

    .line 146
    .line 147
    const-class v1, Landroid/content/res/Configuration;

    .line 148
    .line 149
    const/4 v2, 0x5

    .line 150
    aput-object v1, v8, v2

    .line 151
    .line 152
    const/4 v2, 0x6

    .line 153
    aput-object v1, v8, v2

    .line 154
    .line 155
    const/4 v1, 0x7

    .line 156
    aput-object v0, v8, v1

    .line 157
    .line 158
    const/16 v1, 0x8

    .line 159
    .line 160
    aput-object v0, v8, v1

    .line 161
    .line 162
    invoke-virtual {v5, v7, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {v0, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 167
    .line 168
    .line 169
    move-object v6, v0

    .line 170
    :catchall_5
    :cond_4
    :goto_5
    sput-object v6, LC/d;->f:Ljava/lang/reflect/Method;

    .line 171
    .line 172
    return-void
.end method
