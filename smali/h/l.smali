.class public abstract Lh/l;
.super Landroidx/activity/n;
.source "SourceFile"

# interfaces
.implements Lh/m;


# instance fields
.field public A:Z

.field public B:Z

.field public C:Lh/D;

.field public final x:LA/b;

.field public final y:Landroidx/lifecycle/t;

.field public z:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/activity/n;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/fragment/app/t;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Landroidx/fragment/app/t;-><init>(Lh/l;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, LA/b;

    .line 10
    .line 11
    const/16 v2, 0x12

    .line 12
    .line 13
    invoke-direct {v1, v2, v0}, LA/b;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lh/l;->x:LA/b;

    .line 17
    .line 18
    new-instance v0, Landroidx/lifecycle/t;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Landroidx/lifecycle/t;-><init>(Landroidx/lifecycle/r;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lh/l;->y:Landroidx/lifecycle/t;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Lh/l;->B:Z

    .line 27
    .line 28
    iget-object v0, p0, Landroidx/activity/n;->i:Lk0/d;

    .line 29
    .line 30
    iget-object v0, v0, Lk0/d;->b:Lk0/c;

    .line 31
    .line 32
    new-instance v1, Landroidx/activity/f;

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    invoke-direct {v1, v2, p0}, Landroidx/activity/f;-><init>(ILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    const-string v2, "android:support:lifecycle"

    .line 39
    .line 40
    invoke-virtual {v0, v2, v1}, Lk0/c;->e(Ljava/lang/String;Lk0/b;)V

    .line 41
    .line 42
    .line 43
    new-instance v0, Landroidx/fragment/app/s;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/s;-><init>(Lh/l;I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0}, Landroidx/activity/n;->g(LM/a;)V

    .line 50
    .line 51
    .line 52
    new-instance v0, Landroidx/fragment/app/s;

    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/s;-><init>(Lh/l;I)V

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Landroidx/activity/n;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 59
    .line 60
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    new-instance v0, Landroidx/activity/g;

    .line 64
    .line 65
    const/4 v1, 0x1

    .line 66
    invoke-direct {v0, p0, v1}, Landroidx/activity/g;-><init>(Lh/l;I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v0}, Landroidx/activity/n;->h(Lc/b;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Landroidx/activity/n;->i:Lk0/d;

    .line 73
    .line 74
    iget-object v0, v0, Lk0/d;->b:Lk0/c;

    .line 75
    .line 76
    new-instance v1, Lh/j;

    .line 77
    .line 78
    invoke-direct {v1, p0}, Lh/j;-><init>(Lh/l;)V

    .line 79
    .line 80
    .line 81
    const-string v2, "androidx:appcompat"

    .line 82
    .line 83
    invoke-virtual {v0, v2, v1}, Lk0/c;->e(Ljava/lang/String;Lk0/b;)V

    .line 84
    .line 85
    .line 86
    new-instance v0, Lh/k;

    .line 87
    .line 88
    invoke-direct {v0, p0}, Lh/k;-><init>(Lh/l;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, v0}, Landroidx/activity/n;->h(Lc/b;)V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public static m(Landroidx/fragment/app/H;)Z
    .locals 5

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/H;->c:LA/k;

    .line 2
    .line 3
    invoke-virtual {p0}, LA/k;->i()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_5

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Landroidx/fragment/app/r;

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object v2, v1, Landroidx/fragment/app/r;->x:Landroidx/fragment/app/t;

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    iget-object v2, v2, Landroidx/fragment/app/t;->j:Lh/l;

    .line 34
    .line 35
    :goto_1
    if-eqz v2, :cond_3

    .line 36
    .line 37
    invoke-virtual {v1}, Landroidx/fragment/app/r;->g()Landroidx/fragment/app/H;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v2}, Lh/l;->m(Landroidx/fragment/app/H;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    or-int/2addr v0, v2

    .line 46
    :cond_3
    iget-object v2, v1, Landroidx/fragment/app/r;->T:Landroidx/fragment/app/O;

    .line 47
    .line 48
    sget-object v3, Landroidx/lifecycle/m;->d:Landroidx/lifecycle/m;

    .line 49
    .line 50
    const/4 v4, 0x1

    .line 51
    if-eqz v2, :cond_4

    .line 52
    .line 53
    invoke-virtual {v2}, Landroidx/fragment/app/O;->d()Landroidx/lifecycle/t;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    iget-object v2, v2, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-ltz v2, :cond_4

    .line 64
    .line 65
    iget-object v0, v1, Landroidx/fragment/app/r;->T:Landroidx/fragment/app/O;

    .line 66
    .line 67
    iget-object v0, v0, Landroidx/fragment/app/O;->h:Landroidx/lifecycle/t;

    .line 68
    .line 69
    invoke-virtual {v0}, Landroidx/lifecycle/t;->g()V

    .line 70
    .line 71
    .line 72
    const/4 v0, 0x1

    .line 73
    :cond_4
    iget-object v2, v1, Landroidx/fragment/app/r;->S:Landroidx/lifecycle/t;

    .line 74
    .line 75
    iget-object v2, v2, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    .line 76
    .line 77
    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-ltz v2, :cond_0

    .line 82
    .line 83
    iget-object v0, v1, Landroidx/fragment/app/r;->S:Landroidx/lifecycle/t;

    .line 84
    .line 85
    invoke-virtual {v0}, Landroidx/lifecycle/t;->g()V

    .line 86
    .line 87
    .line 88
    const/4 v0, 0x1

    .line 89
    goto :goto_0

    .line 90
    :cond_5
    return v0
.end method


# virtual methods
.method public final addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/activity/n;->j()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/l;->k()Lh/s;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lh/D;

    .line 9
    .line 10
    invoke-virtual {v0}, Lh/D;->u()V

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, Lh/D;->G:Landroid/view/ViewGroup;

    .line 14
    .line 15
    const v2, 0x1020002

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Landroid/view/ViewGroup;

    .line 23
    .line 24
    invoke-virtual {v1, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, v0, Lh/D;->r:Lh/z;

    .line 28
    .line 29
    iget-object p2, v0, Lh/D;->q:Landroid/view/Window;

    .line 30
    .line 31
    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p1, p2}, Lh/z;->a(Landroid/view/Window$Callback;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final attachBaseContext(Landroid/content/Context;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lh/l;->k()Lh/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lh/D;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, v0, Lh/D;->U:Z

    .line 9
    .line 10
    iget v2, v0, Lh/D;->Y:I

    .line 11
    .line 12
    const/16 v3, -0x64

    .line 13
    .line 14
    if-eq v2, v3, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget v2, Lh/s;->g:I

    .line 18
    .line 19
    :goto_0
    invoke-virtual {v0, p1, v2}, Lh/D;->B(Landroid/content/Context;I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {p1}, Lh/s;->a(Landroid/content/Context;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_7

    .line 28
    .line 29
    invoke-static {p1}, Lh/s;->a(Landroid/content/Context;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    goto :goto_4

    .line 36
    :cond_1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 37
    .line 38
    const/16 v3, 0x21

    .line 39
    .line 40
    if-lt v2, v3, :cond_2

    .line 41
    .line 42
    sget-boolean v2, Lh/s;->k:Z

    .line 43
    .line 44
    if-nez v2, :cond_7

    .line 45
    .line 46
    sget-object v2, Lh/s;->f:Lh/q;

    .line 47
    .line 48
    new-instance v3, Lh/n;

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    invoke-direct {v3, p1, v4}, Lh/n;-><init>(Landroid/content/Context;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v3}, Lh/q;->execute(Ljava/lang/Runnable;)V

    .line 55
    .line 56
    .line 57
    goto :goto_4

    .line 58
    :cond_2
    sget-object v2, Lh/s;->n:Ljava/lang/Object;

    .line 59
    .line 60
    monitor-enter v2

    .line 61
    :try_start_0
    sget-object v3, Lh/s;->h:LJ/f;

    .line 62
    .line 63
    if-nez v3, :cond_5

    .line 64
    .line 65
    sget-object v3, Lh/s;->i:LJ/f;

    .line 66
    .line 67
    if-nez v3, :cond_3

    .line 68
    .line 69
    invoke-static {p1}, LC/e;->e(Landroid/content/Context;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-static {v3}, LJ/f;->b(Ljava/lang/String;)LJ/f;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    sput-object v3, Lh/s;->i:LJ/f;

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :catchall_0
    move-exception p1

    .line 81
    goto :goto_3

    .line 82
    :cond_3
    :goto_1
    sget-object v3, Lh/s;->i:LJ/f;

    .line 83
    .line 84
    iget-object v3, v3, LJ/f;->a:LJ/h;

    .line 85
    .line 86
    invoke-interface {v3}, LJ/h;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_4

    .line 91
    .line 92
    monitor-exit v2

    .line 93
    goto :goto_4

    .line 94
    :cond_4
    sget-object v3, Lh/s;->i:LJ/f;

    .line 95
    .line 96
    sput-object v3, Lh/s;->h:LJ/f;

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_5
    sget-object v4, Lh/s;->i:LJ/f;

    .line 100
    .line 101
    invoke-virtual {v3, v4}, LJ/f;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-nez v3, :cond_6

    .line 106
    .line 107
    sget-object v3, Lh/s;->h:LJ/f;

    .line 108
    .line 109
    sput-object v3, Lh/s;->i:LJ/f;

    .line 110
    .line 111
    iget-object v3, v3, LJ/f;->a:LJ/h;

    .line 112
    .line 113
    invoke-interface {v3}, LJ/h;->b()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-static {p1, v3}, LC/e;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :cond_6
    :goto_2
    monitor-exit v2

    .line 121
    goto :goto_4

    .line 122
    :goto_3
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    throw p1

    .line 124
    :cond_7
    :goto_4
    invoke-static {p1}, Lh/D;->n(Landroid/content/Context;)LJ/f;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    instance-of v3, p1, Landroid/view/ContextThemeWrapper;

    .line 129
    .line 130
    const/4 v4, 0x0

    .line 131
    const/4 v5, 0x0

    .line 132
    if-eqz v3, :cond_8

    .line 133
    .line 134
    invoke-static {p1, v0, v2, v5, v4}, Lh/D;->r(Landroid/content/Context;ILJ/f;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    :try_start_1
    move-object v6, p1

    .line 139
    check-cast v6, Landroid/view/ContextThemeWrapper;

    .line 140
    .line 141
    invoke-virtual {v6, v3}, Landroid/view/ContextThemeWrapper;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    .line 142
    .line 143
    .line 144
    goto/16 :goto_7

    .line 145
    .line 146
    :catch_0
    nop

    .line 147
    :cond_8
    instance-of v3, p1, Lm/c;

    .line 148
    .line 149
    if-eqz v3, :cond_9

    .line 150
    .line 151
    invoke-static {p1, v0, v2, v5, v4}, Lh/D;->r(Landroid/content/Context;ILJ/f;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    :try_start_2
    move-object v4, p1

    .line 156
    check-cast v4, Lm/c;

    .line 157
    .line 158
    invoke-virtual {v4, v3}, Lm/c;->a(Landroid/content/res/Configuration;)V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1

    .line 159
    .line 160
    .line 161
    goto/16 :goto_7

    .line 162
    .line 163
    :catch_1
    nop

    .line 164
    :cond_9
    sget-boolean v3, Lh/D;->p0:Z

    .line 165
    .line 166
    if-nez v3, :cond_a

    .line 167
    .line 168
    goto/16 :goto_7

    .line 169
    .line 170
    :cond_a
    new-instance v3, Landroid/content/res/Configuration;

    .line 171
    .line 172
    invoke-direct {v3}, Landroid/content/res/Configuration;-><init>()V

    .line 173
    .line 174
    .line 175
    const/4 v4, -0x1

    .line 176
    iput v4, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 177
    .line 178
    const/4 v4, 0x0

    .line 179
    iput v4, v3, Landroid/content/res/Configuration;->fontScale:F

    .line 180
    .line 181
    invoke-virtual {p1, v3}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    iget v7, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 202
    .line 203
    iput v7, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 204
    .line 205
    invoke-virtual {v3, v6}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    .line 206
    .line 207
    .line 208
    move-result v7

    .line 209
    if-nez v7, :cond_22

    .line 210
    .line 211
    new-instance v5, Landroid/content/res/Configuration;

    .line 212
    .line 213
    invoke-direct {v5}, Landroid/content/res/Configuration;-><init>()V

    .line 214
    .line 215
    .line 216
    iput v4, v5, Landroid/content/res/Configuration;->fontScale:F

    .line 217
    .line 218
    invoke-virtual {v3, v6}, Landroid/content/res/Configuration;->diff(Landroid/content/res/Configuration;)I

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    if-nez v4, :cond_b

    .line 223
    .line 224
    goto/16 :goto_6

    .line 225
    .line 226
    :cond_b
    iget v4, v3, Landroid/content/res/Configuration;->fontScale:F

    .line 227
    .line 228
    iget v7, v6, Landroid/content/res/Configuration;->fontScale:F

    .line 229
    .line 230
    cmpl-float v4, v4, v7

    .line 231
    .line 232
    if-eqz v4, :cond_c

    .line 233
    .line 234
    iput v7, v5, Landroid/content/res/Configuration;->fontScale:F

    .line 235
    .line 236
    :cond_c
    iget v4, v3, Landroid/content/res/Configuration;->mcc:I

    .line 237
    .line 238
    iget v7, v6, Landroid/content/res/Configuration;->mcc:I

    .line 239
    .line 240
    if-eq v4, v7, :cond_d

    .line 241
    .line 242
    iput v7, v5, Landroid/content/res/Configuration;->mcc:I

    .line 243
    .line 244
    :cond_d
    iget v4, v3, Landroid/content/res/Configuration;->mnc:I

    .line 245
    .line 246
    iget v7, v6, Landroid/content/res/Configuration;->mnc:I

    .line 247
    .line 248
    if-eq v4, v7, :cond_e

    .line 249
    .line 250
    iput v7, v5, Landroid/content/res/Configuration;->mnc:I

    .line 251
    .line 252
    :cond_e
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 253
    .line 254
    const/16 v7, 0x18

    .line 255
    .line 256
    if-lt v4, v7, :cond_f

    .line 257
    .line 258
    invoke-static {v3, v6, v5}, Lh/x;->a(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    .line 259
    .line 260
    .line 261
    goto :goto_5

    .line 262
    :cond_f
    iget-object v7, v3, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 263
    .line 264
    iget-object v8, v6, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 265
    .line 266
    invoke-static {v7, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v7

    .line 270
    if-nez v7, :cond_10

    .line 271
    .line 272
    iget-object v7, v6, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 273
    .line 274
    iput-object v7, v5, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 275
    .line 276
    :cond_10
    :goto_5
    iget v7, v3, Landroid/content/res/Configuration;->touchscreen:I

    .line 277
    .line 278
    iget v8, v6, Landroid/content/res/Configuration;->touchscreen:I

    .line 279
    .line 280
    if-eq v7, v8, :cond_11

    .line 281
    .line 282
    iput v8, v5, Landroid/content/res/Configuration;->touchscreen:I

    .line 283
    .line 284
    :cond_11
    iget v7, v3, Landroid/content/res/Configuration;->keyboard:I

    .line 285
    .line 286
    iget v8, v6, Landroid/content/res/Configuration;->keyboard:I

    .line 287
    .line 288
    if-eq v7, v8, :cond_12

    .line 289
    .line 290
    iput v8, v5, Landroid/content/res/Configuration;->keyboard:I

    .line 291
    .line 292
    :cond_12
    iget v7, v3, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 293
    .line 294
    iget v8, v6, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 295
    .line 296
    if-eq v7, v8, :cond_13

    .line 297
    .line 298
    iput v8, v5, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 299
    .line 300
    :cond_13
    iget v7, v3, Landroid/content/res/Configuration;->navigation:I

    .line 301
    .line 302
    iget v8, v6, Landroid/content/res/Configuration;->navigation:I

    .line 303
    .line 304
    if-eq v7, v8, :cond_14

    .line 305
    .line 306
    iput v8, v5, Landroid/content/res/Configuration;->navigation:I

    .line 307
    .line 308
    :cond_14
    iget v7, v3, Landroid/content/res/Configuration;->navigationHidden:I

    .line 309
    .line 310
    iget v8, v6, Landroid/content/res/Configuration;->navigationHidden:I

    .line 311
    .line 312
    if-eq v7, v8, :cond_15

    .line 313
    .line 314
    iput v8, v5, Landroid/content/res/Configuration;->navigationHidden:I

    .line 315
    .line 316
    :cond_15
    iget v7, v3, Landroid/content/res/Configuration;->orientation:I

    .line 317
    .line 318
    iget v8, v6, Landroid/content/res/Configuration;->orientation:I

    .line 319
    .line 320
    if-eq v7, v8, :cond_16

    .line 321
    .line 322
    iput v8, v5, Landroid/content/res/Configuration;->orientation:I

    .line 323
    .line 324
    :cond_16
    iget v7, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 325
    .line 326
    and-int/lit8 v7, v7, 0xf

    .line 327
    .line 328
    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 329
    .line 330
    and-int/lit8 v8, v8, 0xf

    .line 331
    .line 332
    if-eq v7, v8, :cond_17

    .line 333
    .line 334
    iget v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 335
    .line 336
    or-int/2addr v7, v8

    .line 337
    iput v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 338
    .line 339
    :cond_17
    iget v7, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 340
    .line 341
    and-int/lit16 v7, v7, 0xc0

    .line 342
    .line 343
    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 344
    .line 345
    and-int/lit16 v8, v8, 0xc0

    .line 346
    .line 347
    if-eq v7, v8, :cond_18

    .line 348
    .line 349
    iget v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 350
    .line 351
    or-int/2addr v7, v8

    .line 352
    iput v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 353
    .line 354
    :cond_18
    iget v7, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 355
    .line 356
    and-int/lit8 v7, v7, 0x30

    .line 357
    .line 358
    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 359
    .line 360
    and-int/lit8 v8, v8, 0x30

    .line 361
    .line 362
    if-eq v7, v8, :cond_19

    .line 363
    .line 364
    iget v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 365
    .line 366
    or-int/2addr v7, v8

    .line 367
    iput v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 368
    .line 369
    :cond_19
    iget v7, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 370
    .line 371
    and-int/lit16 v7, v7, 0x300

    .line 372
    .line 373
    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 374
    .line 375
    and-int/lit16 v8, v8, 0x300

    .line 376
    .line 377
    if-eq v7, v8, :cond_1a

    .line 378
    .line 379
    iget v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 380
    .line 381
    or-int/2addr v7, v8

    .line 382
    iput v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 383
    .line 384
    :cond_1a
    const/16 v7, 0x1a

    .line 385
    .line 386
    if-lt v4, v7, :cond_1c

    .line 387
    .line 388
    invoke-static {v3}, LL/f;->a(Landroid/content/res/Configuration;)I

    .line 389
    .line 390
    .line 391
    move-result v4

    .line 392
    and-int/lit8 v4, v4, 0x3

    .line 393
    .line 394
    invoke-static {v6}, LL/f;->a(Landroid/content/res/Configuration;)I

    .line 395
    .line 396
    .line 397
    move-result v7

    .line 398
    and-int/lit8 v7, v7, 0x3

    .line 399
    .line 400
    if-eq v4, v7, :cond_1b

    .line 401
    .line 402
    invoke-static {v5}, LL/f;->a(Landroid/content/res/Configuration;)I

    .line 403
    .line 404
    .line 405
    move-result v4

    .line 406
    invoke-static {v6}, LL/f;->a(Landroid/content/res/Configuration;)I

    .line 407
    .line 408
    .line 409
    move-result v7

    .line 410
    and-int/lit8 v7, v7, 0x3

    .line 411
    .line 412
    or-int/2addr v4, v7

    .line 413
    invoke-static {v5, v4}, LL/f;->g(Landroid/content/res/Configuration;I)V

    .line 414
    .line 415
    .line 416
    :cond_1b
    invoke-static {v3}, LL/f;->a(Landroid/content/res/Configuration;)I

    .line 417
    .line 418
    .line 419
    move-result v4

    .line 420
    and-int/lit8 v4, v4, 0xc

    .line 421
    .line 422
    invoke-static {v6}, LL/f;->a(Landroid/content/res/Configuration;)I

    .line 423
    .line 424
    .line 425
    move-result v7

    .line 426
    and-int/lit8 v7, v7, 0xc

    .line 427
    .line 428
    if-eq v4, v7, :cond_1c

    .line 429
    .line 430
    invoke-static {v5}, LL/f;->a(Landroid/content/res/Configuration;)I

    .line 431
    .line 432
    .line 433
    move-result v4

    .line 434
    invoke-static {v6}, LL/f;->a(Landroid/content/res/Configuration;)I

    .line 435
    .line 436
    .line 437
    move-result v7

    .line 438
    and-int/lit8 v7, v7, 0xc

    .line 439
    .line 440
    or-int/2addr v4, v7

    .line 441
    invoke-static {v5, v4}, LL/f;->g(Landroid/content/res/Configuration;I)V

    .line 442
    .line 443
    .line 444
    :cond_1c
    iget v4, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 445
    .line 446
    and-int/lit8 v4, v4, 0xf

    .line 447
    .line 448
    iget v7, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 449
    .line 450
    and-int/lit8 v7, v7, 0xf

    .line 451
    .line 452
    if-eq v4, v7, :cond_1d

    .line 453
    .line 454
    iget v4, v5, Landroid/content/res/Configuration;->uiMode:I

    .line 455
    .line 456
    or-int/2addr v4, v7

    .line 457
    iput v4, v5, Landroid/content/res/Configuration;->uiMode:I

    .line 458
    .line 459
    :cond_1d
    iget v4, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 460
    .line 461
    and-int/lit8 v4, v4, 0x30

    .line 462
    .line 463
    iget v7, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 464
    .line 465
    and-int/lit8 v7, v7, 0x30

    .line 466
    .line 467
    if-eq v4, v7, :cond_1e

    .line 468
    .line 469
    iget v4, v5, Landroid/content/res/Configuration;->uiMode:I

    .line 470
    .line 471
    or-int/2addr v4, v7

    .line 472
    iput v4, v5, Landroid/content/res/Configuration;->uiMode:I

    .line 473
    .line 474
    :cond_1e
    iget v4, v3, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 475
    .line 476
    iget v7, v6, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 477
    .line 478
    if-eq v4, v7, :cond_1f

    .line 479
    .line 480
    iput v7, v5, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 481
    .line 482
    :cond_1f
    iget v4, v3, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 483
    .line 484
    iget v7, v6, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 485
    .line 486
    if-eq v4, v7, :cond_20

    .line 487
    .line 488
    iput v7, v5, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 489
    .line 490
    :cond_20
    iget v4, v3, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 491
    .line 492
    iget v7, v6, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 493
    .line 494
    if-eq v4, v7, :cond_21

    .line 495
    .line 496
    iput v7, v5, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 497
    .line 498
    :cond_21
    iget v3, v3, Landroid/content/res/Configuration;->densityDpi:I

    .line 499
    .line 500
    iget v4, v6, Landroid/content/res/Configuration;->densityDpi:I

    .line 501
    .line 502
    if-eq v3, v4, :cond_22

    .line 503
    .line 504
    iput v4, v5, Landroid/content/res/Configuration;->densityDpi:I

    .line 505
    .line 506
    :cond_22
    :goto_6
    invoke-static {p1, v0, v2, v5, v1}, Lh/D;->r(Landroid/content/Context;ILJ/f;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    new-instance v1, Lm/c;

    .line 511
    .line 512
    const v2, 0x7f11023d

    .line 513
    .line 514
    .line 515
    invoke-direct {v1, p1, v2}, Lm/c;-><init>(Landroid/content/Context;I)V

    .line 516
    .line 517
    .line 518
    invoke-virtual {v1, v0}, Lm/c;->a(Landroid/content/res/Configuration;)V

    .line 519
    .line 520
    .line 521
    :try_start_3
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 522
    .line 523
    .line 524
    move-result-object p1
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_2

    .line 525
    if-eqz p1, :cond_23

    .line 526
    .line 527
    invoke-virtual {v1}, Lm/c;->getTheme()Landroid/content/res/Resources$Theme;

    .line 528
    .line 529
    .line 530
    move-result-object p1

    .line 531
    invoke-static {p1}, LE/b;->m(Landroid/content/res/Resources$Theme;)V

    .line 532
    .line 533
    .line 534
    :catch_2
    :cond_23
    move-object p1, v1

    .line 535
    :goto_7
    invoke-super {p0, p1}, Landroid/app/Activity;->attachBaseContext(Landroid/content/Context;)V

    .line 536
    .line 537
    .line 538
    return-void
.end method

.method public final closeOptionsMenu()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh/l;->l()Lh/N;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Landroid/view/Window;->hasFeature(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-super {p0}, Landroid/app/Activity;->closeOptionsMenu()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/l;->l()Lh/N;

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1}, LC/h;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p4, :cond_5

    .line 6
    .line 7
    array-length v1, p4

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    aget-object v1, p4, v0

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    sparse-switch v2, :sswitch_data_0

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :sswitch_0
    const-string v2, "--autofill"

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 31
    .line 32
    const/16 v2, 0x1a

    .line 33
    .line 34
    if-lt v1, v2, :cond_5

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :sswitch_1
    const-string v2, "--contentcapture"

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 47
    .line 48
    const/16 v2, 0x1d

    .line 49
    .line 50
    if-lt v1, v2, :cond_5

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :sswitch_2
    const-string v2, "--list-dumpables"

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_3

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :sswitch_3
    const-string v2, "--dump-dumpable"

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-nez v1, :cond_3

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 72
    .line 73
    const/16 v2, 0x21

    .line 74
    .line 75
    if-lt v1, v2, :cond_5

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :sswitch_4
    const-string v2, "--translation"

    .line 79
    .line 80
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-nez v1, :cond_4

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 88
    .line 89
    const/16 v2, 0x1f

    .line 90
    .line 91
    if-lt v1, v2, :cond_5

    .line 92
    .line 93
    :goto_0
    return-void

    .line 94
    :cond_5
    :goto_1
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    const-string v1, "Local FragmentActivity "

    .line 98
    .line 99
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    const-string v1, " State:"

    .line 114
    .line 115
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    new-instance v1, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string v2, "  "

    .line 127
    .line 128
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    const-string v2, "mCreated="

    .line 139
    .line 140
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    iget-boolean v2, p0, Lh/l;->z:Z

    .line 144
    .line 145
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Z)V

    .line 146
    .line 147
    .line 148
    const-string v2, " mResumed="

    .line 149
    .line 150
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    iget-boolean v2, p0, Lh/l;->A:Z

    .line 154
    .line 155
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Z)V

    .line 156
    .line 157
    .line 158
    const-string v2, " mStopped="

    .line 159
    .line 160
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    iget-boolean v2, p0, Lh/l;->B:Z

    .line 164
    .line 165
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Z)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    if-eqz v2, :cond_9

    .line 173
    .line 174
    invoke-interface {p0}, Landroidx/lifecycle/Q;->c()Landroidx/lifecycle/P;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    new-instance v3, Landroid/support/v4/media/session/t;

    .line 179
    .line 180
    sget-object v4, Lc0/a;->d:LK0/e;

    .line 181
    .line 182
    invoke-direct {v3, v2, v4}, Landroid/support/v4/media/session/t;-><init>(Landroidx/lifecycle/P;Landroidx/lifecycle/O;)V

    .line 183
    .line 184
    .line 185
    const-class v2, Lc0/a;

    .line 186
    .line 187
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    if-eqz v4, :cond_8

    .line 192
    .line 193
    const-string v5, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 194
    .line 195
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    invoke-virtual {v3, v4, v2}, Landroid/support/v4/media/session/t;->k(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/M;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    check-cast v2, Lc0/a;

    .line 204
    .line 205
    iget-object v2, v2, Lc0/a;->c:Lr/l;

    .line 206
    .line 207
    iget v3, v2, Lr/l;->c:I

    .line 208
    .line 209
    if-lez v3, :cond_9

    .line 210
    .line 211
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    const-string v3, "Loaders:"

    .line 215
    .line 216
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    iget v3, v2, Lr/l;->c:I

    .line 220
    .line 221
    if-gtz v3, :cond_6

    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_6
    iget-object p1, v2, Lr/l;->b:[Ljava/lang/Object;

    .line 225
    .line 226
    aget-object p1, p1, v0

    .line 227
    .line 228
    if-nez p1, :cond_7

    .line 229
    .line 230
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    const-string p1, "  #"

    .line 234
    .line 235
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    iget-object p1, v2, Lr/l;->a:[I

    .line 239
    .line 240
    aget p1, p1, v0

    .line 241
    .line 242
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(I)V

    .line 243
    .line 244
    .line 245
    const-string p1, ": "

    .line 246
    .line 247
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    const/4 p1, 0x0

    .line 251
    throw p1

    .line 252
    :cond_7
    new-instance p1, Ljava/lang/ClassCastException;

    .line 253
    .line 254
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 255
    .line 256
    .line 257
    throw p1

    .line 258
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 259
    .line 260
    const-string p2, "Local and anonymous classes can not be ViewModels"

    .line 261
    .line 262
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    throw p1

    .line 266
    :cond_9
    :goto_2
    iget-object v0, p0, Lh/l;->x:LA/b;

    .line 267
    .line 268
    iget-object v0, v0, LA/b;->g:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v0, Landroidx/fragment/app/t;

    .line 271
    .line 272
    iget-object v0, v0, Landroidx/fragment/app/t;->i:Landroidx/fragment/app/H;

    .line 273
    .line 274
    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/H;->u(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    return-void

    .line 278
    nop

    .line 279
    :sswitch_data_0
    .sparse-switch
        -0x2673d6ef -> :sswitch_4
        0x5fd0f67 -> :sswitch_3
        0x1c2b8816 -> :sswitch_2
        0x4519f64d -> :sswitch_1
        0x56b9c952 -> :sswitch_0
    .end sparse-switch
.end method

.method public final findViewById(I)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh/l;->k()Lh/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lh/D;

    .line 6
    .line 7
    invoke-virtual {v0}, Lh/D;->u()V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Lh/D;->q:Landroid/view/Window;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final getMenuInflater()Landroid/view/MenuInflater;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lh/l;->k()Lh/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lh/D;

    .line 6
    .line 7
    iget-object v1, v0, Lh/D;->u:Lm/h;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Lh/D;->z()V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lm/h;

    .line 15
    .line 16
    iget-object v2, v0, Lh/D;->t:Lh/N;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2}, Lh/N;->W()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v2, v0, Lh/D;->p:Landroid/content/Context;

    .line 26
    .line 27
    :goto_0
    invoke-direct {v1, v2}, Lm/h;-><init>(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, v0, Lh/D;->u:Lm/h;

    .line 31
    .line 32
    :cond_1
    iget-object v0, v0, Lh/D;->u:Lm/h;

    .line 33
    .line 34
    return-object v0
.end method

.method public final getResources()Landroid/content/res/Resources;
    .locals 1

    .line 1
    sget v0, Lo/k1;->a:I

    .line 2
    .line 3
    invoke-super {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final invalidateOptionsMenu()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh/l;->k()Lh/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lh/D;

    .line 6
    .line 7
    iget-object v1, v0, Lh/D;->t:Lh/N;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lh/D;->z()V

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, Lh/D;->t:Lh/N;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1}, Lh/D;->A(I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final k()Lh/s;
    .locals 2

    .line 1
    iget-object v0, p0, Lh/l;->C:Lh/D;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/s;->f:Lh/q;

    .line 6
    .line 7
    new-instance v0, Lh/D;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1, p0, p0}, Lh/D;-><init>(Landroid/content/Context;Landroid/view/Window;Lh/m;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lh/l;->C:Lh/D;

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lh/l;->C:Lh/D;

    .line 16
    .line 17
    return-object v0
.end method

.method public final l()Lh/N;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh/l;->k()Lh/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lh/D;

    .line 6
    .line 7
    invoke-virtual {v0}, Lh/D;->z()V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Lh/D;->t:Lh/N;

    .line 11
    .line 12
    return-object v0
.end method

.method public final n()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lh/l;->x:LA/b;

    .line 5
    .line 6
    iget-object v0, v0, LA/b;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/fragment/app/t;

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/fragment/app/t;->i:Landroidx/fragment/app/H;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/fragment/app/H;->k()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lh/l;->y:Landroidx/lifecycle/t;

    .line 16
    .line 17
    sget-object v1, Landroidx/lifecycle/l;->ON_DESTROY:Landroidx/lifecycle/l;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final o(ILandroid/view/MenuItem;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/activity/n;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p2, 0x6

    .line 10
    if-ne p1, p2, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, Lh/l;->x:LA/b;

    .line 13
    .line 14
    iget-object p1, p1, LA/b;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Landroidx/fragment/app/t;

    .line 17
    .line 18
    iget-object p1, p1, Landroidx/fragment/app/t;->i:Landroidx/fragment/app/H;

    .line 19
    .line 20
    invoke-virtual {p1}, Landroidx/fragment/app/H;->i()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1

    .line 25
    :cond_1
    const/4 p1, 0x0

    .line 26
    return p1
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/l;->x:LA/b;

    .line 2
    .line 3
    invoke-virtual {v0}, LA/b;->x()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroidx/activity/n;->onActivityResult(IILandroid/content/Intent;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/n;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/l;->k()Lh/s;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lh/D;

    .line 9
    .line 10
    iget-boolean v0, p1, Lh/D;->L:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-boolean v0, p1, Lh/D;->F:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Lh/D;->z()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p1, Lh/D;->t:Lh/N;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v1, v0, Lh/N;->l:Landroid/content/Context;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/high16 v2, 0x7f050000

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {v0, v1}, Lh/N;->Y(Z)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-static {}, Lo/s;->a()Lo/s;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v1, p1, Lh/D;->p:Landroid/content/Context;

    .line 45
    .line 46
    monitor-enter v0

    .line 47
    :try_start_0
    iget-object v2, v0, Lo/s;->a:Lo/P0;

    .line 48
    .line 49
    invoke-virtual {v2, v1}, Lo/P0;->l(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    monitor-exit v0

    .line 53
    new-instance v0, Landroid/content/res/Configuration;

    .line 54
    .line 55
    iget-object v1, p1, Lh/D;->p:Landroid/content/Context;

    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-direct {v0, v1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 66
    .line 67
    .line 68
    iput-object v0, p1, Lh/D;->X:Landroid/content/res/Configuration;

    .line 69
    .line 70
    const/4 v0, 0x0

    .line 71
    invoke-virtual {p1, v0, v0}, Lh/D;->l(ZZ)Z

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :catchall_0
    move-exception p1

    .line 76
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    throw p1
.end method

.method public final onContentChanged()V
    .locals 0

    .line 1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/n;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lh/l;->y:Landroidx/lifecycle/t;

    .line 5
    .line 6
    sget-object v0, Landroidx/lifecycle/l;->ON_CREATE:Landroidx/lifecycle/l;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lh/l;->x:LA/b;

    .line 12
    .line 13
    iget-object p1, p1, LA/b;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Landroidx/fragment/app/t;

    .line 16
    .line 17
    iget-object p1, p1, Landroidx/fragment/app/t;->i:Landroidx/fragment/app/H;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p1, Landroidx/fragment/app/H;->E:Z

    .line 21
    .line 22
    iput-boolean v0, p1, Landroidx/fragment/app/H;->F:Z

    .line 23
    .line 24
    iget-object v1, p1, Landroidx/fragment/app/H;->L:Landroidx/fragment/app/J;

    .line 25
    .line 26
    iput-boolean v0, v1, Landroidx/fragment/app/J;->h:Z

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    invoke-virtual {p1, v0}, Landroidx/fragment/app/H;->t(I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/l;->x:LA/b;

    iget-object v0, v0, LA/b;->g:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/t;

    .line 2
    iget-object v0, v0, Landroidx/fragment/app/t;->i:Landroidx/fragment/app/H;

    iget-object v0, v0, Landroidx/fragment/app/H;->f:Landroidx/fragment/app/x;

    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/x;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 4
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 2

    .line 5
    iget-object v0, p0, Lh/l;->x:LA/b;

    iget-object v0, v0, LA/b;->g:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/t;

    .line 6
    iget-object v0, v0, Landroidx/fragment/app/t;->i:Landroidx/fragment/app/H;

    iget-object v0, v0, Landroidx/fragment/app/H;->f:Landroidx/fragment/app/x;

    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1, p1, p2, p3}, Landroidx/fragment/app/x;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 8
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh/l;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/l;->k()Lh/s;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lh/s;->c()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getMetaState()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {v0}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {v0}, Landroid/view/KeyEvent;->isModifierKey(I)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0, p2}, Landroid/view/View;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    const/4 p1, 0x1

    .line 62
    return p1

    .line 63
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    return p1
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 4

    .line 1
    invoke-virtual {p0, p1, p2}, Lh/l;->o(ILandroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lh/l;->l()Lh/N;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    const v1, 0x102002c

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-ne p2, v1, :cond_8

    .line 22
    .line 23
    if-eqz p1, :cond_8

    .line 24
    .line 25
    iget-object p1, p1, Lh/N;->p:Lo/m0;

    .line 26
    .line 27
    check-cast p1, Lo/f1;

    .line 28
    .line 29
    iget p1, p1, Lo/f1;->b:I

    .line 30
    .line 31
    and-int/lit8 p1, p1, 0x4

    .line 32
    .line 33
    if-eqz p1, :cond_8

    .line 34
    .line 35
    invoke-static {p0}, LC/e;->a(Lh/l;)Landroid/content/Intent;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-eqz p1, :cond_7

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Landroid/app/Activity;->shouldUpRecreateTask(Landroid/content/Intent;)Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-eqz p2, :cond_6

    .line 46
    .line 47
    new-instance p1, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-static {p0}, LC/e;->a(Lh/l;)Landroid/content/Intent;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    if-nez p2, :cond_1

    .line 57
    .line 58
    invoke-static {p0}, LC/e;->a(Lh/l;)Landroid/content/Intent;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    :cond_1
    if-eqz p2, :cond_4

    .line 63
    .line 64
    invoke-virtual {p2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    if-nez v1, :cond_2

    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {p2, v1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    :try_start_0
    invoke-static {p0, v1}, LC/e;->b(Lh/l;Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    :goto_0
    if-eqz v1, :cond_3

    .line 87
    .line 88
    invoke-virtual {p1, v3, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-static {p0, v1}, LC/e;->b(Lh/l;Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 96
    .line 97
    .line 98
    move-result-object v1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 99
    goto :goto_0

    .line 100
    :catch_0
    move-exception p1

    .line 101
    goto :goto_1

    .line 102
    :cond_3
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :goto_1
    const-string p2, "TaskStackBuilder"

    .line 107
    .line 108
    const-string v0, "Bad ComponentName while traversing activity parent metadata"

    .line 109
    .line 110
    invoke-static {p2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 111
    .line 112
    .line 113
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 114
    .line 115
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    throw p2

    .line 119
    :cond_4
    :goto_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    if-nez p2, :cond_5

    .line 124
    .line 125
    new-array p2, v2, [Landroid/content/Intent;

    .line 126
    .line 127
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    check-cast p1, [Landroid/content/Intent;

    .line 132
    .line 133
    new-instance p2, Landroid/content/Intent;

    .line 134
    .line 135
    aget-object v1, p1, v2

    .line 136
    .line 137
    invoke-direct {p2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 138
    .line 139
    .line 140
    const v1, 0x1000c000

    .line 141
    .line 142
    .line 143
    invoke-virtual {p2, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    aput-object p2, p1, v2

    .line 148
    .line 149
    const/4 p2, 0x0

    .line 150
    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->startActivities([Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 151
    .line 152
    .line 153
    :try_start_1
    invoke-virtual {p0}, Landroid/app/Activity;->finishAffinity()V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 154
    .line 155
    .line 156
    goto :goto_3

    .line 157
    :catch_1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 158
    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 162
    .line 163
    const-string p2, "No intents added to TaskStackBuilder; cannot startActivities"

    .line 164
    .line 165
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    throw p1

    .line 169
    :cond_6
    invoke-virtual {p0, p1}, Landroid/app/Activity;->navigateUpTo(Landroid/content/Intent;)Z

    .line 170
    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_7
    const/4 v0, 0x0

    .line 174
    :goto_3
    return v0

    .line 175
    :cond_8
    return v2
.end method

.method public onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lh/l;->A:Z

    .line 6
    .line 7
    iget-object v0, p0, Lh/l;->x:LA/b;

    .line 8
    .line 9
    iget-object v0, v0, LA/b;->g:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Landroidx/fragment/app/t;

    .line 12
    .line 13
    const/4 v1, 0x5

    .line 14
    iget-object v0, v0, Landroidx/fragment/app/t;->i:Landroidx/fragment/app/H;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroidx/fragment/app/H;->t(I)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lh/l;->y:Landroidx/lifecycle/t;

    .line 20
    .line 21
    sget-object v1, Landroidx/lifecycle/l;->ON_PAUSE:Landroidx/lifecycle/l;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final onPostCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onPostCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/l;->k()Lh/s;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lh/D;

    .line 9
    .line 10
    invoke-virtual {p1}, Lh/D;->u()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onPostResume()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh/l;->p()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/l;->k()Lh/s;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lh/D;

    .line 9
    .line 10
    invoke-virtual {v0}, Lh/D;->z()V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Lh/D;->t:Lh/N;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    iput-boolean v1, v0, Lh/N;->E:Z

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/l;->x:LA/b;

    .line 2
    .line 3
    invoke-virtual {v0}, LA/b;->x()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroidx/activity/n;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 1
    iget-object v0, p0, Lh/l;->x:LA/b;

    .line 2
    .line 3
    invoke-virtual {v0}, LA/b;->x()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iput-boolean v1, p0, Lh/l;->A:Z

    .line 11
    .line 12
    iget-object v0, v0, LA/b;->g:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Landroidx/fragment/app/t;

    .line 15
    .line 16
    iget-object v0, v0, Landroidx/fragment/app/t;->i:Landroidx/fragment/app/H;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroidx/fragment/app/H;->x(Z)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final onStart()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lh/l;->q()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/l;->k()Lh/s;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lh/D;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v0, v1, v2}, Lh/D;->l(ZZ)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final onStateNotSaved()V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/l;->x:LA/b;

    .line 2
    .line 3
    invoke-virtual {v0}, LA/b;->x()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onStop()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh/l;->r()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/l;->k()Lh/s;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lh/D;

    .line 9
    .line 10
    invoke-virtual {v0}, Lh/D;->z()V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Lh/D;->t:Lh/N;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-boolean v1, v0, Lh/N;->E:Z

    .line 19
    .line 20
    iget-object v0, v0, Lh/N;->D:Lm/j;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Lm/j;->a()V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final onTitleChanged(Ljava/lang/CharSequence;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onTitleChanged(Ljava/lang/CharSequence;I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/l;->k()Lh/s;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p2, p1}, Lh/s;->k(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final openOptionsMenu()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh/l;->l()Lh/N;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Landroid/view/Window;->hasFeature(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-super {p0}, Landroid/app/Activity;->openOptionsMenu()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final p()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lh/l;->y:Landroidx/lifecycle/t;

    .line 5
    .line 6
    sget-object v1, Landroidx/lifecycle/l;->ON_RESUME:Landroidx/lifecycle/l;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lh/l;->x:LA/b;

    .line 12
    .line 13
    iget-object v0, v0, LA/b;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Landroidx/fragment/app/t;

    .line 16
    .line 17
    iget-object v0, v0, Landroidx/fragment/app/t;->i:Landroidx/fragment/app/H;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    iput-boolean v1, v0, Landroidx/fragment/app/H;->E:Z

    .line 21
    .line 22
    iput-boolean v1, v0, Landroidx/fragment/app/H;->F:Z

    .line 23
    .line 24
    iget-object v2, v0, Landroidx/fragment/app/H;->L:Landroidx/fragment/app/J;

    .line 25
    .line 26
    iput-boolean v1, v2, Landroidx/fragment/app/J;->h:Z

    .line 27
    .line 28
    const/4 v1, 0x7

    .line 29
    invoke-virtual {v0, v1}, Landroidx/fragment/app/H;->t(I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final q()V
    .locals 5

    .line 1
    iget-object v0, p0, Lh/l;->x:LA/b;

    .line 2
    .line 3
    invoke-virtual {v0}, LA/b;->x()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput-boolean v1, p0, Lh/l;->B:Z

    .line 11
    .line 12
    iget-boolean v2, p0, Lh/l;->z:Z

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    iget-object v0, v0, LA/b;->g:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Landroidx/fragment/app/t;

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    iput-boolean v3, p0, Lh/l;->z:Z

    .line 22
    .line 23
    iget-object v2, v0, Landroidx/fragment/app/t;->i:Landroidx/fragment/app/H;

    .line 24
    .line 25
    iput-boolean v1, v2, Landroidx/fragment/app/H;->E:Z

    .line 26
    .line 27
    iput-boolean v1, v2, Landroidx/fragment/app/H;->F:Z

    .line 28
    .line 29
    iget-object v4, v2, Landroidx/fragment/app/H;->L:Landroidx/fragment/app/J;

    .line 30
    .line 31
    iput-boolean v1, v4, Landroidx/fragment/app/J;->h:Z

    .line 32
    .line 33
    const/4 v4, 0x4

    .line 34
    invoke-virtual {v2, v4}, Landroidx/fragment/app/H;->t(I)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v2, v0, Landroidx/fragment/app/t;->i:Landroidx/fragment/app/H;

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Landroidx/fragment/app/H;->x(Z)Z

    .line 40
    .line 41
    .line 42
    iget-object v2, p0, Lh/l;->y:Landroidx/lifecycle/t;

    .line 43
    .line 44
    sget-object v3, Landroidx/lifecycle/l;->ON_START:Landroidx/lifecycle/l;

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, v0, Landroidx/fragment/app/t;->i:Landroidx/fragment/app/H;

    .line 50
    .line 51
    iput-boolean v1, v0, Landroidx/fragment/app/H;->E:Z

    .line 52
    .line 53
    iput-boolean v1, v0, Landroidx/fragment/app/H;->F:Z

    .line 54
    .line 55
    iget-object v2, v0, Landroidx/fragment/app/H;->L:Landroidx/fragment/app/J;

    .line 56
    .line 57
    iput-boolean v1, v2, Landroidx/fragment/app/J;->h:Z

    .line 58
    .line 59
    const/4 v1, 0x5

    .line 60
    invoke-virtual {v0, v1}, Landroidx/fragment/app/H;->t(I)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final r()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lh/l;->B:Z

    .line 6
    .line 7
    :cond_0
    iget-object v1, p0, Lh/l;->x:LA/b;

    .line 8
    .line 9
    iget-object v2, v1, LA/b;->g:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Landroidx/fragment/app/t;

    .line 12
    .line 13
    iget-object v2, v2, Landroidx/fragment/app/t;->i:Landroidx/fragment/app/H;

    .line 14
    .line 15
    invoke-static {v2}, Lh/l;->m(Landroidx/fragment/app/H;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    iget-object v1, v1, LA/b;->g:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Landroidx/fragment/app/t;

    .line 24
    .line 25
    iget-object v1, v1, Landroidx/fragment/app/t;->i:Landroidx/fragment/app/H;

    .line 26
    .line 27
    iput-boolean v0, v1, Landroidx/fragment/app/H;->F:Z

    .line 28
    .line 29
    iget-object v2, v1, Landroidx/fragment/app/H;->L:Landroidx/fragment/app/J;

    .line 30
    .line 31
    iput-boolean v0, v2, Landroidx/fragment/app/J;->h:Z

    .line 32
    .line 33
    const/4 v0, 0x4

    .line 34
    invoke-virtual {v1, v0}, Landroidx/fragment/app/H;->t(I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lh/l;->y:Landroidx/lifecycle/t;

    .line 38
    .line 39
    sget-object v1, Landroidx/lifecycle/l;->ON_STOP:Landroidx/lifecycle/l;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final setContentView(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/activity/n;->j()V

    .line 2
    invoke-virtual {p0}, Lh/l;->k()Lh/s;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh/s;->h(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Landroidx/activity/n;->j()V

    .line 4
    invoke-virtual {p0}, Lh/l;->k()Lh/s;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh/s;->i(Landroid/view/View;)V

    return-void
.end method

.method public final setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 5
    invoke-virtual {p0}, Landroidx/activity/n;->j()V

    .line 6
    invoke-virtual {p0}, Lh/l;->k()Lh/s;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lh/s;->j(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final setTheme(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setTheme(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/l;->k()Lh/s;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lh/D;

    .line 9
    .line 10
    iput p1, v0, Lh/D;->Z:I

    .line 11
    .line 12
    return-void
.end method
