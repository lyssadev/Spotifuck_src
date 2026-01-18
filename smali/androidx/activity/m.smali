.class public final Landroidx/activity/m;
.super LZ0/d;
.source "SourceFile"

# interfaces
.implements LY0/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/lifecycle/Q;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/Q;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/activity/m;->a:I

    iput-object p1, p0, Landroidx/activity/m;->b:Landroidx/lifecycle/Q;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LZ0/d;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Landroidx/activity/m;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/activity/m;->b:Landroidx/lifecycle/Q;

    .line 7
    .line 8
    new-instance v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    sget-object v2, LZ0/f;->a:LZ0/g;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v2, LZ0/b;

    .line 19
    .line 20
    const-class v3, Landroidx/lifecycle/K;

    .line 21
    .line 22
    invoke-direct {v2, v3}, LZ0/b;-><init>(Ljava/lang/Class;)V

    .line 23
    .line 24
    .line 25
    new-instance v4, Lb0/d;

    .line 26
    .line 27
    invoke-interface {v2}, LZ0/a;->a()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const-string v5, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>"

    .line 32
    .line 33
    invoke-static {v5, v2}, LZ0/c;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v4, v2}, Lb0/d;-><init>(Ljava/lang/Class;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    new-instance v2, LA/b;

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    new-array v4, v4, [Lb0/d;

    .line 46
    .line 47
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, [Lb0/d;

    .line 52
    .line 53
    array-length v4, v1

    .line 54
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, [Lb0/d;

    .line 59
    .line 60
    invoke-direct {v2, v1}, LA/b;-><init>([Lb0/d;)V

    .line 61
    .line 62
    .line 63
    new-instance v1, Landroid/support/v4/media/session/t;

    .line 64
    .line 65
    invoke-interface {v0}, Landroidx/lifecycle/Q;->c()Landroidx/lifecycle/P;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    instance-of v5, v0, Landroidx/lifecycle/h;

    .line 70
    .line 71
    if-eqz v5, :cond_0

    .line 72
    .line 73
    check-cast v0, Landroidx/lifecycle/h;

    .line 74
    .line 75
    invoke-interface {v0}, Landroidx/lifecycle/h;->a()Lb0/c;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    goto :goto_0

    .line 80
    :cond_0
    sget-object v0, Lb0/a;->b:Lb0/a;

    .line 81
    .line 82
    :goto_0
    invoke-direct {v1, v4, v2, v0}, Landroid/support/v4/media/session/t;-><init>(Landroidx/lifecycle/P;Landroidx/lifecycle/O;Lb0/b;)V

    .line 83
    .line 84
    .line 85
    const-string v0, "androidx.lifecycle.internal.SavedStateHandlesVM"

    .line 86
    .line 87
    invoke-virtual {v1, v0, v3}, Landroid/support/v4/media/session/t;->k(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/M;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, Landroidx/lifecycle/K;

    .line 92
    .line 93
    return-object v0

    .line 94
    :pswitch_0
    new-instance v0, Landroidx/activity/A;

    .line 95
    .line 96
    new-instance v1, Landroidx/activity/d;

    .line 97
    .line 98
    iget-object v2, p0, Landroidx/activity/m;->b:Landroidx/lifecycle/Q;

    .line 99
    .line 100
    check-cast v2, Lh/l;

    .line 101
    .line 102
    const/4 v3, 0x1

    .line 103
    invoke-direct {v1, v2, v3}, Landroidx/activity/d;-><init>(Lh/l;I)V

    .line 104
    .line 105
    .line 106
    invoke-direct {v0, v1}, Landroidx/activity/A;-><init>(Ljava/lang/Runnable;)V

    .line 107
    .line 108
    .line 109
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 110
    .line 111
    const/16 v3, 0x21

    .line 112
    .line 113
    if-lt v1, v3, :cond_2

    .line 114
    .line 115
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-static {v1, v3}, LZ0/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-nez v1, :cond_1

    .line 128
    .line 129
    new-instance v1, Landroid/os/Handler;

    .line 130
    .line 131
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-direct {v1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 136
    .line 137
    .line 138
    new-instance v3, LE/o;

    .line 139
    .line 140
    const/4 v4, 0x1

    .line 141
    invoke-direct {v3, v2, v0, v4}, LE/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_1
    new-instance v1, Landroidx/activity/h;

    .line 149
    .line 150
    invoke-direct {v1, v0, v2}, Landroidx/activity/h;-><init>(Landroidx/activity/A;Lh/l;)V

    .line 151
    .line 152
    .line 153
    iget-object v2, v2, LC/h;->f:Landroidx/lifecycle/t;

    .line 154
    .line 155
    invoke-virtual {v2, v1}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/q;)V

    .line 156
    .line 157
    .line 158
    :cond_2
    :goto_1
    return-object v0

    .line 159
    :pswitch_1
    new-instance v0, Landroidx/activity/p;

    .line 160
    .line 161
    iget-object v1, p0, Landroidx/activity/m;->b:Landroidx/lifecycle/Q;

    .line 162
    .line 163
    check-cast v1, Lh/l;

    .line 164
    .line 165
    new-instance v2, Landroidx/activity/m;

    .line 166
    .line 167
    const/4 v3, 0x0

    .line 168
    invoke-direct {v2, v1, v3}, Landroidx/activity/m;-><init>(Landroidx/lifecycle/Q;I)V

    .line 169
    .line 170
    .line 171
    iget-object v1, v1, Landroidx/activity/n;->k:Landroidx/activity/k;

    .line 172
    .line 173
    invoke-direct {v0, v1, v2}, Landroidx/activity/p;-><init>(Landroidx/activity/k;Landroidx/activity/m;)V

    .line 174
    .line 175
    .line 176
    return-object v0

    .line 177
    :pswitch_2
    iget-object v0, p0, Landroidx/activity/m;->b:Landroidx/lifecycle/Q;

    .line 178
    .line 179
    check-cast v0, Lh/l;

    .line 180
    .line 181
    invoke-virtual {v0}, Landroidx/activity/n;->reportFullyDrawn()V

    .line 182
    .line 183
    .line 184
    sget-object v0, LS0/c;->c:LS0/c;

    .line 185
    .line 186
    return-object v0

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
