.class public final Landroidx/lifecycle/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public b:Lq/a;

.field public c:Landroidx/lifecycle/m;

.field public final d:Ljava/lang/ref/WeakReference;

.field public e:I

.field public f:Z

.field public g:Z

.field public final h:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/r;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Landroidx/lifecycle/t;->a:Z

    .line 11
    .line 12
    new-instance v0, Lq/a;

    .line 13
    .line 14
    invoke-direct {v0}, Lq/a;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Landroidx/lifecycle/t;->b:Lq/a;

    .line 18
    .line 19
    sget-object v0, Landroidx/lifecycle/m;->b:Landroidx/lifecycle/m;

    .line 20
    .line 21
    iput-object v0, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    .line 22
    .line 23
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Landroidx/lifecycle/t;->h:Ljava/util/ArrayList;

    .line 29
    .line 30
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 31
    .line 32
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Landroidx/lifecycle/t;->d:Ljava/lang/ref/WeakReference;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/q;)V
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/t;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const-string v3, "addObserver"

    .line 6
    .line 7
    invoke-virtual {p0, v3}, Landroidx/lifecycle/t;->c(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v3, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    .line 11
    .line 12
    sget-object v4, Landroidx/lifecycle/m;->a:Landroidx/lifecycle/m;

    .line 13
    .line 14
    if-ne v3, v4, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget-object v4, Landroidx/lifecycle/m;->b:Landroidx/lifecycle/m;

    .line 18
    .line 19
    :goto_0
    new-instance v3, Landroidx/lifecycle/s;

    .line 20
    .line 21
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    sget-object v5, Landroidx/lifecycle/u;->a:Ljava/util/HashMap;

    .line 25
    .line 26
    instance-of v5, p1, Landroidx/lifecycle/p;

    .line 27
    .line 28
    instance-of v6, p1, Landroidx/lifecycle/d;

    .line 29
    .line 30
    const/4 v7, 0x0

    .line 31
    if-eqz v5, :cond_1

    .line 32
    .line 33
    if-eqz v6, :cond_1

    .line 34
    .line 35
    new-instance v5, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;

    .line 36
    .line 37
    move-object v6, p1

    .line 38
    check-cast v6, Landroidx/lifecycle/d;

    .line 39
    .line 40
    move-object v8, p1

    .line 41
    check-cast v8, Landroidx/lifecycle/p;

    .line 42
    .line 43
    invoke-direct {v5, v6, v8}, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;-><init>(Landroidx/lifecycle/d;Landroidx/lifecycle/p;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    if-eqz v6, :cond_2

    .line 48
    .line 49
    new-instance v5, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;

    .line 50
    .line 51
    move-object v6, p1

    .line 52
    check-cast v6, Landroidx/lifecycle/d;

    .line 53
    .line 54
    invoke-direct {v5, v6, v1}, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;-><init>(Landroidx/lifecycle/d;Landroidx/lifecycle/p;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    if-eqz v5, :cond_3

    .line 59
    .line 60
    move-object v5, p1

    .line 61
    check-cast v5, Landroidx/lifecycle/p;

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-static {v5}, Landroidx/lifecycle/u;->c(Ljava/lang/Class;)I

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    const/4 v8, 0x2

    .line 73
    if-ne v6, v8, :cond_6

    .line 74
    .line 75
    sget-object v6, Landroidx/lifecycle/u;->b:Ljava/util/HashMap;

    .line 76
    .line 77
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-static {v5}, LZ0/c;->b(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    check-cast v5, Ljava/util/List;

    .line 85
    .line 86
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-eq v6, v2, :cond_5

    .line 91
    .line 92
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    new-array v8, v6, [Landroidx/lifecycle/g;

    .line 97
    .line 98
    if-gtz v6, :cond_4

    .line 99
    .line 100
    new-instance v5, Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;

    .line 101
    .line 102
    invoke-direct {v5, v8}, Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;-><init>([Landroidx/lifecycle/g;)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_4
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 111
    .line 112
    invoke-static {v0, p1}, Landroidx/lifecycle/u;->a(Ljava/lang/reflect/Constructor;Landroidx/lifecycle/q;)V

    .line 113
    .line 114
    .line 115
    throw v1

    .line 116
    :cond_5
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 121
    .line 122
    invoke-static {v0, p1}, Landroidx/lifecycle/u;->a(Ljava/lang/reflect/Constructor;Landroidx/lifecycle/q;)V

    .line 123
    .line 124
    .line 125
    throw v1

    .line 126
    :cond_6
    new-instance v5, Landroidx/lifecycle/ReflectiveGenericLifecycleObserver;

    .line 127
    .line 128
    invoke-direct {v5, p1}, Landroidx/lifecycle/ReflectiveGenericLifecycleObserver;-><init>(Landroidx/lifecycle/q;)V

    .line 129
    .line 130
    .line 131
    :goto_1
    iput-object v5, v3, Landroidx/lifecycle/s;->b:Landroidx/lifecycle/p;

    .line 132
    .line 133
    iput-object v4, v3, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    .line 134
    .line 135
    iget-object v4, p0, Landroidx/lifecycle/t;->b:Lq/a;

    .line 136
    .line 137
    invoke-virtual {v4, p1}, Lq/a;->a(Ljava/lang/Object;)Lq/c;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    if-eqz v5, :cond_7

    .line 142
    .line 143
    iget-object v1, v5, Lq/c;->b:Ljava/lang/Object;

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_7
    iget-object v5, v4, Lq/a;->e:Ljava/util/HashMap;

    .line 147
    .line 148
    new-instance v6, Lq/c;

    .line 149
    .line 150
    invoke-direct {v6, p1, v3}, Lq/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    iget v8, v4, Lq/f;->d:I

    .line 154
    .line 155
    add-int/2addr v8, v2

    .line 156
    iput v8, v4, Lq/f;->d:I

    .line 157
    .line 158
    iget-object v8, v4, Lq/f;->b:Lq/c;

    .line 159
    .line 160
    if-nez v8, :cond_8

    .line 161
    .line 162
    iput-object v6, v4, Lq/f;->a:Lq/c;

    .line 163
    .line 164
    iput-object v6, v4, Lq/f;->b:Lq/c;

    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_8
    iput-object v6, v8, Lq/c;->c:Lq/c;

    .line 168
    .line 169
    iput-object v8, v6, Lq/c;->d:Lq/c;

    .line 170
    .line 171
    iput-object v6, v4, Lq/f;->b:Lq/c;

    .line 172
    .line 173
    :goto_2
    invoke-virtual {v5, p1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    :goto_3
    check-cast v1, Landroidx/lifecycle/s;

    .line 177
    .line 178
    if-eqz v1, :cond_9

    .line 179
    .line 180
    return-void

    .line 181
    :cond_9
    iget-object v1, p0, Landroidx/lifecycle/t;->d:Ljava/lang/ref/WeakReference;

    .line 182
    .line 183
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    check-cast v1, Landroidx/lifecycle/r;

    .line 188
    .line 189
    if-nez v1, :cond_a

    .line 190
    .line 191
    return-void

    .line 192
    :cond_a
    iget v4, p0, Landroidx/lifecycle/t;->e:I

    .line 193
    .line 194
    if-nez v4, :cond_b

    .line 195
    .line 196
    iget-boolean v4, p0, Landroidx/lifecycle/t;->f:Z

    .line 197
    .line 198
    if-eqz v4, :cond_c

    .line 199
    .line 200
    :cond_b
    const/4 v7, 0x1

    .line 201
    :cond_c
    invoke-virtual {p0, p1}, Landroidx/lifecycle/t;->b(Landroidx/lifecycle/q;)Landroidx/lifecycle/m;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    iget v5, p0, Landroidx/lifecycle/t;->e:I

    .line 206
    .line 207
    add-int/2addr v5, v2

    .line 208
    iput v5, p0, Landroidx/lifecycle/t;->e:I

    .line 209
    .line 210
    :goto_4
    iget-object v5, v3, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    .line 211
    .line 212
    invoke-virtual {v5, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 213
    .line 214
    .line 215
    move-result v4

    .line 216
    if-gez v4, :cond_e

    .line 217
    .line 218
    iget-object v4, p0, Landroidx/lifecycle/t;->b:Lq/a;

    .line 219
    .line 220
    iget-object v4, v4, Lq/a;->e:Ljava/util/HashMap;

    .line 221
    .line 222
    invoke-virtual {v4, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v4

    .line 226
    if-eqz v4, :cond_e

    .line 227
    .line 228
    iget-object v4, v3, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    .line 229
    .line 230
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    sget-object v4, Landroidx/lifecycle/l;->Companion:Landroidx/lifecycle/j;

    .line 234
    .line 235
    iget-object v5, v3, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    .line 236
    .line 237
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    invoke-static {v5}, Landroidx/lifecycle/j;->a(Landroidx/lifecycle/m;)Landroidx/lifecycle/l;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    if-eqz v4, :cond_d

    .line 245
    .line 246
    invoke-virtual {v3, v1, v4}, Landroidx/lifecycle/s;->a(Landroidx/lifecycle/r;Landroidx/lifecycle/l;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 250
    .line 251
    .line 252
    move-result v4

    .line 253
    sub-int/2addr v4, v2

    .line 254
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    invoke-virtual {p0, p1}, Landroidx/lifecycle/t;->b(Landroidx/lifecycle/q;)Landroidx/lifecycle/m;

    .line 258
    .line 259
    .line 260
    move-result-object v4

    .line 261
    goto :goto_4

    .line 262
    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 263
    .line 264
    new-instance v0, Ljava/lang/StringBuilder;

    .line 265
    .line 266
    const-string v1, "no event up from "

    .line 267
    .line 268
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    iget-object v1, v3, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    .line 272
    .line 273
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    throw p1

    .line 284
    :cond_e
    if-nez v7, :cond_f

    .line 285
    .line 286
    invoke-virtual {p0}, Landroidx/lifecycle/t;->h()V

    .line 287
    .line 288
    .line 289
    :cond_f
    iget p1, p0, Landroidx/lifecycle/t;->e:I

    .line 290
    .line 291
    add-int/lit8 p1, p1, -0x1

    .line 292
    .line 293
    iput p1, p0, Landroidx/lifecycle/t;->e:I

    .line 294
    .line 295
    return-void
.end method

.method public final b(Landroidx/lifecycle/q;)Landroidx/lifecycle/m;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/t;->b:Lq/a;

    .line 2
    .line 3
    iget-object v0, v0, Lq/a;->e:Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lq/c;

    .line 17
    .line 18
    iget-object p1, p1, Lq/c;->d:Lq/c;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object p1, v2

    .line 22
    :goto_0
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget-object p1, p1, Lq/c;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Landroidx/lifecycle/s;

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    iget-object p1, p1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move-object p1, v2

    .line 34
    :goto_1
    iget-object v0, p0, Landroidx/lifecycle/t;->h:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    add-int/lit8 v1, v1, -0x1

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    move-object v2, v0

    .line 53
    check-cast v2, Landroidx/lifecycle/m;

    .line 54
    .line 55
    :cond_2
    iget-object v0, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    .line 56
    .line 57
    const-string v1, "state1"

    .line 58
    .line 59
    invoke-static {v1, v0}, LZ0/c;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    if-eqz p1, :cond_3

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-gez v1, :cond_3

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    move-object p1, v0

    .line 72
    :goto_2
    if-eqz v2, :cond_4

    .line 73
    .line 74
    invoke-virtual {v2, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-gez v0, :cond_4

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_4
    move-object v2, p1

    .line 82
    :goto_3
    return-object v2
.end method

.method public final c(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/lifecycle/t;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-static {}, Lp/a;->V()Lp/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, Lp/a;->l:Lp/c;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-ne v0, v1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const-string v0, "Method "

    .line 30
    .line 31
    const-string v1, " must be called on the main thread"

    .line 32
    .line 33
    invoke-static {v0, p1, v1}, LQ0/E;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v0

    .line 47
    :cond_1
    :goto_0
    return-void
.end method

.method public final d(Landroidx/lifecycle/l;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {v0, p1}, LZ0/c;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "handleLifecycleEvent"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroidx/lifecycle/t;->c(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/lifecycle/l;->a()Landroidx/lifecycle/m;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Landroidx/lifecycle/t;->e(Landroidx/lifecycle/m;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final e(Landroidx/lifecycle/m;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    sget-object v1, Landroidx/lifecycle/m;->b:Landroidx/lifecycle/m;

    .line 7
    .line 8
    sget-object v2, Landroidx/lifecycle/m;->a:Landroidx/lifecycle/m;

    .line 9
    .line 10
    if-ne v0, v1, :cond_2

    .line 11
    .line 12
    if-eq p1, v2, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v0, "no event down from "

    .line 18
    .line 19
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, " in component "

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Landroidx/lifecycle/t;->d:Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v0

    .line 55
    :cond_2
    :goto_0
    iput-object p1, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    .line 56
    .line 57
    iget-boolean p1, p0, Landroidx/lifecycle/t;->f:Z

    .line 58
    .line 59
    const/4 v0, 0x1

    .line 60
    if-nez p1, :cond_5

    .line 61
    .line 62
    iget p1, p0, Landroidx/lifecycle/t;->e:I

    .line 63
    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    iput-boolean v0, p0, Landroidx/lifecycle/t;->f:Z

    .line 68
    .line 69
    invoke-virtual {p0}, Landroidx/lifecycle/t;->h()V

    .line 70
    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    iput-boolean p1, p0, Landroidx/lifecycle/t;->f:Z

    .line 74
    .line 75
    iget-object p1, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    .line 76
    .line 77
    if-ne p1, v2, :cond_4

    .line 78
    .line 79
    new-instance p1, Lq/a;

    .line 80
    .line 81
    invoke-direct {p1}, Lq/a;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object p1, p0, Landroidx/lifecycle/t;->b:Lq/a;

    .line 85
    .line 86
    :cond_4
    return-void

    .line 87
    :cond_5
    :goto_1
    iput-boolean v0, p0, Landroidx/lifecycle/t;->g:Z

    .line 88
    .line 89
    return-void
.end method

.method public final f(Landroidx/lifecycle/q;)V
    .locals 1

    .line 1
    const-string v0, "removeObserver"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroidx/lifecycle/t;->c(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/lifecycle/t;->b:Lq/a;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lq/a;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final g()V
    .locals 2

    .line 1
    sget-object v0, Landroidx/lifecycle/m;->c:Landroidx/lifecycle/m;

    .line 2
    .line 3
    const-string v1, "setCurrentState"

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Landroidx/lifecycle/t;->c(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroidx/lifecycle/t;->e(Landroidx/lifecycle/m;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final h()V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/t;->d:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/lifecycle/r;

    .line 8
    .line 9
    if-eqz v0, :cond_b

    .line 10
    .line 11
    :cond_0
    iget-object v1, p0, Landroidx/lifecycle/t;->b:Lq/a;

    .line 12
    .line 13
    iget v2, v1, Lq/f;->d:I

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    iget-object v1, v1, Lq/f;->a:Lq/c;

    .line 20
    .line 21
    invoke-static {v1}, LZ0/c;->b(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, v1, Lq/c;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Landroidx/lifecycle/s;

    .line 27
    .line 28
    iget-object v1, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    .line 29
    .line 30
    iget-object v2, p0, Landroidx/lifecycle/t;->b:Lq/a;

    .line 31
    .line 32
    iget-object v2, v2, Lq/f;->b:Lq/c;

    .line 33
    .line 34
    invoke-static {v2}, LZ0/c;->b(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object v2, v2, Lq/c;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, Landroidx/lifecycle/s;

    .line 40
    .line 41
    iget-object v2, v2, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    .line 42
    .line 43
    if-ne v1, v2, :cond_2

    .line 44
    .line 45
    iget-object v1, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    .line 46
    .line 47
    if-ne v1, v2, :cond_2

    .line 48
    .line 49
    :goto_0
    iput-boolean v3, p0, Landroidx/lifecycle/t;->g:Z

    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    iput-boolean v3, p0, Landroidx/lifecycle/t;->g:Z

    .line 53
    .line 54
    iget-object v1, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    .line 55
    .line 56
    iget-object v2, p0, Landroidx/lifecycle/t;->b:Lq/a;

    .line 57
    .line 58
    iget-object v2, v2, Lq/f;->a:Lq/c;

    .line 59
    .line 60
    invoke-static {v2}, LZ0/c;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object v2, v2, Lq/c;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v2, Landroidx/lifecycle/s;

    .line 66
    .line 67
    iget-object v2, v2, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-gez v1, :cond_8

    .line 74
    .line 75
    iget-object v1, p0, Landroidx/lifecycle/t;->b:Lq/a;

    .line 76
    .line 77
    new-instance v2, Lq/b;

    .line 78
    .line 79
    iget-object v3, v1, Lq/f;->b:Lq/c;

    .line 80
    .line 81
    iget-object v4, v1, Lq/f;->a:Lq/c;

    .line 82
    .line 83
    const/4 v5, 0x1

    .line 84
    invoke-direct {v2, v3, v4, v5}, Lq/b;-><init>(Lq/c;Lq/c;I)V

    .line 85
    .line 86
    .line 87
    iget-object v1, v1, Lq/f;->c:Ljava/util/WeakHashMap;

    .line 88
    .line 89
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 90
    .line 91
    invoke-virtual {v1, v2, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    :cond_3
    invoke-virtual {v2}, Lq/b;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_8

    .line 99
    .line 100
    iget-boolean v1, p0, Landroidx/lifecycle/t;->g:Z

    .line 101
    .line 102
    if-nez v1, :cond_8

    .line 103
    .line 104
    invoke-virtual {v2}, Lq/b;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    check-cast v1, Ljava/util/Map$Entry;

    .line 109
    .line 110
    const-string v3, "next()"

    .line 111
    .line 112
    invoke-static {v3, v1}, LZ0/c;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    check-cast v3, Landroidx/lifecycle/q;

    .line 120
    .line 121
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    check-cast v1, Landroidx/lifecycle/s;

    .line 126
    .line 127
    :goto_1
    iget-object v4, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    .line 128
    .line 129
    iget-object v5, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    .line 130
    .line 131
    invoke-virtual {v4, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    if-lez v4, :cond_3

    .line 136
    .line 137
    iget-boolean v4, p0, Landroidx/lifecycle/t;->g:Z

    .line 138
    .line 139
    if-nez v4, :cond_3

    .line 140
    .line 141
    iget-object v4, p0, Landroidx/lifecycle/t;->b:Lq/a;

    .line 142
    .line 143
    iget-object v4, v4, Lq/a;->e:Ljava/util/HashMap;

    .line 144
    .line 145
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    if-eqz v4, :cond_3

    .line 150
    .line 151
    sget-object v4, Landroidx/lifecycle/l;->Companion:Landroidx/lifecycle/j;

    .line 152
    .line 153
    iget-object v5, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    .line 154
    .line 155
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    const-string v4, "state"

    .line 159
    .line 160
    invoke-static {v4, v5}, LZ0/c;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    const/4 v5, 0x2

    .line 168
    if-eq v4, v5, :cond_6

    .line 169
    .line 170
    const/4 v5, 0x3

    .line 171
    if-eq v4, v5, :cond_5

    .line 172
    .line 173
    const/4 v5, 0x4

    .line 174
    if-eq v4, v5, :cond_4

    .line 175
    .line 176
    const/4 v4, 0x0

    .line 177
    goto :goto_2

    .line 178
    :cond_4
    sget-object v4, Landroidx/lifecycle/l;->ON_PAUSE:Landroidx/lifecycle/l;

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_5
    sget-object v4, Landroidx/lifecycle/l;->ON_STOP:Landroidx/lifecycle/l;

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_6
    sget-object v4, Landroidx/lifecycle/l;->ON_DESTROY:Landroidx/lifecycle/l;

    .line 185
    .line 186
    :goto_2
    if-eqz v4, :cond_7

    .line 187
    .line 188
    invoke-virtual {v4}, Landroidx/lifecycle/l;->a()Landroidx/lifecycle/m;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    iget-object v6, p0, Landroidx/lifecycle/t;->h:Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1, v0, v4}, Landroidx/lifecycle/s;->a(Landroidx/lifecycle/r;Landroidx/lifecycle/l;)V

    .line 198
    .line 199
    .line 200
    iget-object v4, p0, Landroidx/lifecycle/t;->h:Ljava/util/ArrayList;

    .line 201
    .line 202
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 203
    .line 204
    .line 205
    move-result v5

    .line 206
    add-int/lit8 v5, v5, -0x1

    .line 207
    .line 208
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    goto :goto_1

    .line 212
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 213
    .line 214
    new-instance v2, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    const-string v3, "no event down from "

    .line 217
    .line 218
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    iget-object v1, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    .line 222
    .line 223
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    throw v0

    .line 234
    :cond_8
    iget-object v1, p0, Landroidx/lifecycle/t;->b:Lq/a;

    .line 235
    .line 236
    iget-object v1, v1, Lq/f;->b:Lq/c;

    .line 237
    .line 238
    iget-boolean v2, p0, Landroidx/lifecycle/t;->g:Z

    .line 239
    .line 240
    if-nez v2, :cond_0

    .line 241
    .line 242
    if-eqz v1, :cond_0

    .line 243
    .line 244
    iget-object v2, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    .line 245
    .line 246
    iget-object v1, v1, Lq/c;->b:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v1, Landroidx/lifecycle/s;

    .line 249
    .line 250
    iget-object v1, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    .line 251
    .line 252
    invoke-virtual {v2, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    if-lez v1, :cond_0

    .line 257
    .line 258
    iget-object v1, p0, Landroidx/lifecycle/t;->b:Lq/a;

    .line 259
    .line 260
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    new-instance v2, Lq/d;

    .line 264
    .line 265
    invoke-direct {v2, v1}, Lq/d;-><init>(Lq/f;)V

    .line 266
    .line 267
    .line 268
    iget-object v1, v1, Lq/f;->c:Ljava/util/WeakHashMap;

    .line 269
    .line 270
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 271
    .line 272
    invoke-virtual {v1, v2, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    :cond_9
    invoke-virtual {v2}, Lq/d;->hasNext()Z

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    if-eqz v1, :cond_0

    .line 280
    .line 281
    iget-boolean v1, p0, Landroidx/lifecycle/t;->g:Z

    .line 282
    .line 283
    if-nez v1, :cond_0

    .line 284
    .line 285
    invoke-virtual {v2}, Lq/d;->next()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    check-cast v1, Ljava/util/Map$Entry;

    .line 290
    .line 291
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    check-cast v3, Landroidx/lifecycle/q;

    .line 296
    .line 297
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    check-cast v1, Landroidx/lifecycle/s;

    .line 302
    .line 303
    :goto_3
    iget-object v4, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    .line 304
    .line 305
    iget-object v5, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    .line 306
    .line 307
    invoke-virtual {v4, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 308
    .line 309
    .line 310
    move-result v4

    .line 311
    if-gez v4, :cond_9

    .line 312
    .line 313
    iget-boolean v4, p0, Landroidx/lifecycle/t;->g:Z

    .line 314
    .line 315
    if-nez v4, :cond_9

    .line 316
    .line 317
    iget-object v4, p0, Landroidx/lifecycle/t;->b:Lq/a;

    .line 318
    .line 319
    iget-object v4, v4, Lq/a;->e:Ljava/util/HashMap;

    .line 320
    .line 321
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result v4

    .line 325
    if-eqz v4, :cond_9

    .line 326
    .line 327
    iget-object v4, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    .line 328
    .line 329
    iget-object v5, p0, Landroidx/lifecycle/t;->h:Ljava/util/ArrayList;

    .line 330
    .line 331
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    sget-object v4, Landroidx/lifecycle/l;->Companion:Landroidx/lifecycle/j;

    .line 335
    .line 336
    iget-object v5, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    .line 337
    .line 338
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    invoke-static {v5}, Landroidx/lifecycle/j;->a(Landroidx/lifecycle/m;)Landroidx/lifecycle/l;

    .line 342
    .line 343
    .line 344
    move-result-object v4

    .line 345
    if-eqz v4, :cond_a

    .line 346
    .line 347
    invoke-virtual {v1, v0, v4}, Landroidx/lifecycle/s;->a(Landroidx/lifecycle/r;Landroidx/lifecycle/l;)V

    .line 348
    .line 349
    .line 350
    iget-object v4, p0, Landroidx/lifecycle/t;->h:Ljava/util/ArrayList;

    .line 351
    .line 352
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 353
    .line 354
    .line 355
    move-result v5

    .line 356
    add-int/lit8 v5, v5, -0x1

    .line 357
    .line 358
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    goto :goto_3

    .line 362
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 363
    .line 364
    new-instance v2, Ljava/lang/StringBuilder;

    .line 365
    .line 366
    const-string v3, "no event up from "

    .line 367
    .line 368
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    iget-object v1, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    .line 372
    .line 373
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    throw v0

    .line 384
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 385
    .line 386
    const-string v1, "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."

    .line 387
    .line 388
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    throw v0
.end method
