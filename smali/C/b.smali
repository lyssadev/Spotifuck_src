.class public final LC/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/material/behavior/SwipeDismissBehavior;Landroid/view/View;Z)V
    .locals 0

    const/4 p3, 0x6

    iput p3, p0, LC/b;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC/b;->c:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, LC/b;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, LC/b;->a:I

    iput-object p1, p0, LC/b;->b:Ljava/lang/Object;

    iput-object p2, p0, LC/b;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 2
    iput p3, p0, LC/b;->a:I

    iput-object p1, p0, LC/b;->c:Ljava/lang/Object;

    iput-object p2, p0, LC/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    iget-object v3, p0, LC/b;->b:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v4, p0, LC/b;->c:Ljava/lang/Object;

    .line 7
    .line 8
    iget v5, p0, LC/b;->a:I

    .line 9
    .line 10
    packed-switch v5, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v4, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    .line 14
    .line 15
    iget-object v0, v4, Lcom/google/android/material/behavior/SwipeDismissBehavior;->a:LV/e;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, LV/e;->f()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    sget-object v0, LN/Q;->a:Ljava/util/WeakHashMap;

    .line 26
    .line 27
    check-cast v3, Landroid/view/View;

    .line 28
    .line 29
    invoke-virtual {v3, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void

    .line 33
    :pswitch_0
    check-cast v4, LA/k;

    .line 34
    .line 35
    iget-object v0, v4, LA/k;->h:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    check-cast v3, Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 44
    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    invoke-virtual {v3}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->a()Landroid/support/v4/media/session/d;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-eqz v5, :cond_1

    .line 62
    .line 63
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    check-cast v5, Landroid/os/Bundle;

    .line 68
    .line 69
    invoke-interface {v1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    const-string v7, "extra_session_binder"

    .line 74
    .line 75
    invoke-virtual {v5, v7, v6}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 80
    .line 81
    .line 82
    :cond_2
    iget-object v0, v4, LA/k;->f:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Ld0/d;

    .line 85
    .line 86
    iget-object v1, v3, Landroid/support/v4/media/session/MediaSessionCompat$Token;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v1, Landroid/media/session/MediaSession$Token;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Landroid/service/media/MediaBrowserService;->setSessionToken(Landroid/media/session/MediaSession$Token;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :pswitch_1
    check-cast v3, LK/g;

    .line 95
    .line 96
    invoke-virtual {v3, v4}, LK/g;->a(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :pswitch_2
    check-cast v3, LA/b;

    .line 101
    .line 102
    iget-object v0, v3, LA/b;->g:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, LE/b;

    .line 105
    .line 106
    if-eqz v0, :cond_3

    .line 107
    .line 108
    check-cast v4, Landroid/graphics/Typeface;

    .line 109
    .line 110
    invoke-virtual {v0, v4}, LE/b;->j(Landroid/graphics/Typeface;)V

    .line 111
    .line 112
    .line 113
    :cond_3
    return-void

    .line 114
    :pswitch_3
    :try_start_0
    sget-object v5, LC/d;->d:Ljava/lang/reflect/Method;

    .line 115
    .line 116
    if-eqz v5, :cond_4

    .line 117
    .line 118
    const/4 v6, 0x3

    .line 119
    new-array v6, v6, [Ljava/lang/Object;

    .line 120
    .line 121
    aput-object v3, v6, v2

    .line 122
    .line 123
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 124
    .line 125
    aput-object v2, v6, v1

    .line 126
    .line 127
    const-string v1, "AppCompat recreation"

    .line 128
    .line 129
    aput-object v1, v6, v0

    .line 130
    .line 131
    invoke-virtual {v5, v4, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    goto :goto_3

    .line 135
    :catchall_0
    move-exception v0

    .line 136
    goto :goto_1

    .line 137
    :catch_0
    move-exception v0

    .line 138
    goto :goto_2

    .line 139
    :cond_4
    sget-object v5, LC/d;->e:Ljava/lang/reflect/Method;

    .line 140
    .line 141
    new-array v0, v0, [Ljava/lang/Object;

    .line 142
    .line 143
    aput-object v3, v0, v2

    .line 144
    .line 145
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 146
    .line 147
    aput-object v2, v0, v1

    .line 148
    .line 149
    invoke-virtual {v5, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 150
    .line 151
    .line 152
    goto :goto_3

    .line 153
    :goto_1
    const-string v1, "ActivityRecreator"

    .line 154
    .line 155
    const-string v2, "Exception while invoking performStopActivity"

    .line 156
    .line 157
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 158
    .line 159
    .line 160
    goto :goto_3

    .line 161
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    const-class v2, Ljava/lang/RuntimeException;

    .line 166
    .line 167
    if-ne v1, v2, :cond_6

    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    if-eqz v1, :cond_6

    .line 174
    .line 175
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    const-string v2, "Unable to stop"

    .line 180
    .line 181
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-nez v1, :cond_5

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_5
    throw v0

    .line 189
    :cond_6
    :goto_3
    return-void

    .line 190
    :pswitch_4
    check-cast v4, Landroid/app/Application;

    .line 191
    .line 192
    check-cast v3, LC/c;

    .line 193
    .line 194
    invoke-virtual {v4, v3}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :pswitch_5
    check-cast v3, LC/c;

    .line 199
    .line 200
    iput-object v4, v3, LC/c;->a:Ljava/lang/Object;

    .line 201
    .line 202
    return-void

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
