.class public final LQ0/u;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(Landroid/os/Looper;I)V
    .locals 0

    .line 1
    iput p2, p0, LQ0/u;->a:I

    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 12

    .line 1
    iget v0, p0, LQ0/u;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-wide/16 v0, 0x3e8

    .line 11
    .line 12
    invoke-virtual {p0, p1, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget v0, p1, Landroid/os/Message;->what:I

    .line 17
    .line 18
    const/4 v1, 0x3

    .line 19
    if-eq v0, v1, :cond_a

    .line 20
    .line 21
    const/16 v1, 0x8

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x1

    .line 25
    if-eq v0, v1, :cond_5

    .line 26
    .line 27
    const/16 v1, 0xd

    .line 28
    .line 29
    if-ne v0, v1, :cond_4

    .line 30
    .line 31
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/4 v1, 0x0

    .line 40
    :goto_0
    if-ge v1, v0, :cond_b

    .line 41
    .line 42
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, LQ0/n;

    .line 47
    .line 48
    iget-object v5, v4, LQ0/n;->a:LQ0/w;

    .line 49
    .line 50
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    iget-object v6, v5, LQ0/w;->c:LA/b;

    .line 54
    .line 55
    iget-object v6, v6, LA/b;->g:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v6, LQ0/o;

    .line 58
    .line 59
    iget-object v7, v4, LQ0/n;->c:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v6, v7}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    check-cast v6, LQ0/p;

    .line 66
    .line 67
    const/4 v7, 0x0

    .line 68
    if-eqz v6, :cond_0

    .line 69
    .line 70
    iget-object v6, v6, LQ0/p;->a:Landroid/graphics/Bitmap;

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_0
    move-object v6, v7

    .line 74
    :goto_1
    iget-object v8, v5, LQ0/w;->d:LQ0/C;

    .line 75
    .line 76
    if-eqz v6, :cond_1

    .line 77
    .line 78
    iget-object v8, v8, LQ0/C;->b:LQ0/j;

    .line 79
    .line 80
    invoke-virtual {v8, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_1
    iget-object v8, v8, LQ0/C;->b:LQ0/j;

    .line 85
    .line 86
    invoke-virtual {v8, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 87
    .line 88
    .line 89
    :goto_2
    if-eqz v6, :cond_2

    .line 90
    .line 91
    invoke-virtual {v5, v6, v3, v4, v7}, LQ0/w;->b(Landroid/graphics/Bitmap;ILQ0/n;Ljava/lang/Exception;)V

    .line 92
    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_2
    invoke-virtual {v4}, LQ0/n;->a()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    if-eqz v6, :cond_3

    .line 100
    .line 101
    iget-object v7, v5, LQ0/w;->e:Ljava/util/WeakHashMap;

    .line 102
    .line 103
    invoke-virtual {v7, v6}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    if-eq v8, v4, :cond_3

    .line 108
    .line 109
    invoke-virtual {v5, v6}, LQ0/w;->a(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v7, v6, v4}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    :cond_3
    iget-object v5, v5, LQ0/w;->b:LQ0/m;

    .line 116
    .line 117
    iget-object v5, v5, LQ0/m;->h:LQ0/j;

    .line 118
    .line 119
    invoke-virtual {v5, v3, v4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-virtual {v5, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 124
    .line 125
    .line 126
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_4
    new-instance v0, Ljava/lang/AssertionError;

    .line 130
    .line 131
    new-instance v1, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    const-string v2, "Unknown handler message received: "

    .line 134
    .line 135
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    iget p1, p1, Landroid/os/Message;->what:I

    .line 139
    .line 140
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    throw v0

    .line 151
    :cond_5
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast p1, Ljava/util/List;

    .line 154
    .line 155
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    const/4 v1, 0x0

    .line 160
    :goto_4
    if-ge v1, v0, :cond_b

    .line 161
    .line 162
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    check-cast v4, LQ0/f;

    .line 167
    .line 168
    iget-object v5, v4, LQ0/f;->b:LQ0/w;

    .line 169
    .line 170
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    iget-object v6, v4, LQ0/f;->j:LQ0/n;

    .line 174
    .line 175
    iget-object v7, v4, LQ0/f;->k:Ljava/util/ArrayList;

    .line 176
    .line 177
    if-eqz v7, :cond_6

    .line 178
    .line 179
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 180
    .line 181
    .line 182
    move-result v8

    .line 183
    if-nez v8, :cond_6

    .line 184
    .line 185
    const/4 v8, 0x1

    .line 186
    goto :goto_5

    .line 187
    :cond_6
    const/4 v8, 0x0

    .line 188
    :goto_5
    if-nez v6, :cond_7

    .line 189
    .line 190
    if-eqz v8, :cond_9

    .line 191
    .line 192
    :cond_7
    iget-object v9, v4, LQ0/f;->g:LQ0/z;

    .line 193
    .line 194
    iget-object v9, v9, LQ0/z;->a:Landroid/net/Uri;

    .line 195
    .line 196
    iget-object v9, v4, LQ0/f;->o:Ljava/lang/Exception;

    .line 197
    .line 198
    iget-object v10, v4, LQ0/f;->l:Landroid/graphics/Bitmap;

    .line 199
    .line 200
    iget v4, v4, LQ0/f;->n:I

    .line 201
    .line 202
    if-eqz v6, :cond_8

    .line 203
    .line 204
    invoke-virtual {v5, v10, v4, v6, v9}, LQ0/w;->b(Landroid/graphics/Bitmap;ILQ0/n;Ljava/lang/Exception;)V

    .line 205
    .line 206
    .line 207
    :cond_8
    if-eqz v8, :cond_9

    .line 208
    .line 209
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 210
    .line 211
    .line 212
    move-result v6

    .line 213
    const/4 v8, 0x0

    .line 214
    :goto_6
    if-ge v8, v6, :cond_9

    .line 215
    .line 216
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v11

    .line 220
    check-cast v11, LQ0/n;

    .line 221
    .line 222
    invoke-virtual {v5, v10, v4, v11, v9}, LQ0/w;->b(Landroid/graphics/Bitmap;ILQ0/n;Ljava/lang/Exception;)V

    .line 223
    .line 224
    .line 225
    add-int/lit8 v8, v8, 0x1

    .line 226
    .line 227
    goto :goto_6

    .line 228
    :cond_9
    add-int/lit8 v1, v1, 0x1

    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast p1, LQ0/n;

    .line 234
    .line 235
    iget-object v0, p1, LQ0/n;->a:LQ0/w;

    .line 236
    .line 237
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    iget-object v0, p1, LQ0/n;->a:LQ0/w;

    .line 241
    .line 242
    invoke-virtual {p1}, LQ0/n;->a()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    invoke-virtual {v0, p1}, LQ0/w;->a(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    :cond_b
    return-void

    .line 250
    nop

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
