.class public final Ld0/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Ld0/o;->a:I

    iput-object p1, p0, Ld0/o;->e:Ljava/lang/Object;

    iput-object p2, p0, Ld0/o;->b:Ljava/lang/Object;

    iput-object p3, p0, Ld0/o;->c:Ljava/lang/Object;

    iput-object p4, p0, Ld0/o;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Ld0/o;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ld0/o;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ln/e;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Ld0/o;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lj0/w;

    .line 15
    .line 16
    iget-object v2, v1, Lj0/w;->f:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Ln/f;

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    iput-boolean v3, v2, Ln/f;->E:Z

    .line 22
    .line 23
    iget-object v0, v0, Ln/e;->b:Ln/l;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-virtual {v0, v2}, Ln/l;->c(Z)V

    .line 27
    .line 28
    .line 29
    iget-object v0, v1, Lj0/w;->f:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Ln/f;

    .line 32
    .line 33
    iput-boolean v2, v0, Ln/f;->E:Z

    .line 34
    .line 35
    :cond_0
    iget-object v0, p0, Ld0/o;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Ln/n;

    .line 38
    .line 39
    invoke-virtual {v0}, Ln/n;->isEnabled()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    invoke-virtual {v0}, Ln/n;->hasSubMenu()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    iget-object v1, p0, Ld0/o;->d:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, Ln/l;

    .line 54
    .line 55
    const/4 v2, 0x4

    .line 56
    const/4 v3, 0x0

    .line 57
    invoke-virtual {v1, v0, v3, v2}, Ln/l;->q(Landroid/view/MenuItem;Ln/x;I)Z

    .line 58
    .line 59
    .line 60
    :cond_1
    return-void

    .line 61
    :pswitch_0
    iget-object v0, p0, Ld0/o;->b:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, LA/b;

    .line 64
    .line 65
    iget-object v0, v0, LA/b;->g:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Landroid/os/Messenger;

    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iget-object v1, p0, Ld0/o;->e:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, LA/b;

    .line 76
    .line 77
    iget-object v2, v1, LA/b;->g:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v2, Ld0/q;

    .line 80
    .line 81
    iget-object v2, v2, Ld0/q;->j:Lr/b;

    .line 82
    .line 83
    const/4 v3, 0x0

    .line 84
    invoke-virtual {v2, v0, v3}, Lr/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Ld0/c;

    .line 89
    .line 90
    const-string v2, "MBServiceCompat"

    .line 91
    .line 92
    iget-object v3, p0, Ld0/o;->c:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v3, Ljava/lang/String;

    .line 95
    .line 96
    if-nez v0, :cond_2

    .line 97
    .line 98
    new-instance v0, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    const-string v1, "removeSubscription for callback that isn\'t registered id="

    .line 101
    .line 102
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_2
    iget-object v1, v1, LA/b;->g:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v1, Ld0/q;

    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    iget-object v0, v0, Ld0/c;->e:Ljava/util/HashMap;

    .line 124
    .line 125
    iget-object v1, p0, Ld0/o;->d:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v1, Landroid/os/IBinder;

    .line 128
    .line 129
    const/4 v4, 0x0

    .line 130
    const/4 v5, 0x1

    .line 131
    if-nez v1, :cond_3

    .line 132
    .line 133
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    if-eqz v0, :cond_6

    .line 138
    .line 139
    const/4 v4, 0x1

    .line 140
    goto :goto_1

    .line 141
    :cond_3
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    check-cast v6, Ljava/util/List;

    .line 146
    .line 147
    if-eqz v6, :cond_6

    .line 148
    .line 149
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    :cond_4
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v8

    .line 157
    if-eqz v8, :cond_5

    .line 158
    .line 159
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    check-cast v8, LM/b;

    .line 164
    .line 165
    iget-object v8, v8, LM/b;->a:Ljava/lang/Object;

    .line 166
    .line 167
    if-ne v1, v8, :cond_4

    .line 168
    .line 169
    invoke-interface {v7}, Ljava/util/Iterator;->remove()V

    .line 170
    .line 171
    .line 172
    const/4 v4, 0x1

    .line 173
    goto :goto_0

    .line 174
    :cond_5
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    if-nez v1, :cond_6

    .line 179
    .line 180
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    :cond_6
    :goto_1
    if-nez v4, :cond_7

    .line 184
    .line 185
    new-instance v0, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    const-string v1, "removeSubscription called for "

    .line 188
    .line 189
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    const-string v1, " which is not subscribed"

    .line 196
    .line 197
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 205
    .line 206
    .line 207
    :cond_7
    :goto_2
    return-void

    .line 208
    nop

    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
