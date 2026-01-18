.class public Lit/deviato/spotifuck/WebService$MediaActionReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lit/deviato/spotifuck/WebService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MediaActionReceiver"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 1
    const/4 p1, 0x2

    .line 2
    const/4 v0, 0x1

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, -0x1

    .line 5
    sget-object v3, Lit/deviato/spotifuck/WebService;->t:Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_d

    .line 12
    .line 13
    sget-boolean v3, Lit/deviato/spotifuck/AppSingleton;->B:Z

    .line 14
    .line 15
    if-eqz v3, :cond_d

    .line 16
    .line 17
    sget-object v3, Lit/deviato/spotifuck/WebService;->n:Landroid/support/v4/media/session/t;

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    goto/16 :goto_3

    .line 22
    .line 23
    :cond_0
    iget-object v3, v3, Landroid/support/v4/media/session/t;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, LA/b;

    .line 26
    .line 27
    invoke-virtual {v3}, LA/b;->w()Landroid/support/v4/media/session/i;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v3, v3, Landroid/support/v4/media/session/i;->a:Landroid/media/session/MediaController$TransportControls;

    .line 39
    .line 40
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    sparse-switch v5, :sswitch_data_0

    .line 45
    .line 46
    .line 47
    :goto_0
    const/4 v5, -0x1

    .line 48
    goto :goto_1

    .line 49
    :sswitch_0
    const-string v5, "WIDGET_PREV"

    .line 50
    .line 51
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-nez v5, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const/4 v5, 0x6

    .line 59
    goto :goto_1

    .line 60
    :sswitch_1
    const-string v5, "WIDGET_NEXT"

    .line 61
    .line 62
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-nez v5, :cond_2

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    const/4 v5, 0x5

    .line 70
    goto :goto_1

    .line 71
    :sswitch_2
    const-string v5, "WIDGET_PLAYPAUSE"

    .line 72
    .line 73
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-nez v5, :cond_3

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    const/4 v5, 0x4

    .line 81
    goto :goto_1

    .line 82
    :sswitch_3
    const-string v5, "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"

    .line 83
    .line 84
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-nez v5, :cond_4

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_4
    const/4 v5, 0x3

    .line 92
    goto :goto_1

    .line 93
    :sswitch_4
    const-string v5, "ADDTOFAV_ACTION"

    .line 94
    .line 95
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-nez v5, :cond_5

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_5
    const/4 v5, 0x2

    .line 103
    goto :goto_1

    .line 104
    :sswitch_5
    const-string v5, "REPEAT_ACTION"

    .line 105
    .line 106
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    if-nez v5, :cond_6

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_6
    const/4 v5, 0x1

    .line 114
    goto :goto_1

    .line 115
    :sswitch_6
    const-string v5, "android.intent.action.HEADSET_PLUG"

    .line 116
    .line 117
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    if-nez v5, :cond_7

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_7
    const/4 v5, 0x0

    .line 125
    :goto_1
    packed-switch v5, :pswitch_data_0

    .line 126
    .line 127
    .line 128
    goto/16 :goto_3

    .line 129
    .line 130
    :pswitch_0
    invoke-virtual {v3}, Landroid/media/session/MediaController$TransportControls;->skipToPrevious()V

    .line 131
    .line 132
    .line 133
    goto :goto_3

    .line 134
    :pswitch_1
    invoke-virtual {v3}, Landroid/media/session/MediaController$TransportControls;->skipToNext()V

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :pswitch_2
    const-string v0, "android.bluetooth.profile.extra.STATE"

    .line 139
    .line 140
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    sget-boolean v0, Lit/deviato/spotifuck/AppSingleton;->x:Z

    .line 145
    .line 146
    if-eqz v0, :cond_8

    .line 147
    .line 148
    if-ne p2, p1, :cond_8

    .line 149
    .line 150
    invoke-virtual {v3}, Landroid/media/session/MediaController$TransportControls;->play()V

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_8
    sget-boolean p1, Lit/deviato/spotifuck/AppSingleton;->y:Z

    .line 155
    .line 156
    if-eqz p1, :cond_9

    .line 157
    .line 158
    if-nez p2, :cond_9

    .line 159
    .line 160
    invoke-virtual {v3}, Landroid/media/session/MediaController$TransportControls;->pause()V

    .line 161
    .line 162
    .line 163
    :cond_9
    :goto_2
    :pswitch_3
    sget-boolean p1, Lit/deviato/spotifuck/WebService;->D:Z

    .line 164
    .line 165
    if-eqz p1, :cond_a

    .line 166
    .line 167
    invoke-virtual {v3}, Landroid/media/session/MediaController$TransportControls;->pause()V

    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_a
    invoke-virtual {v3}, Landroid/media/session/MediaController$TransportControls;->play()V

    .line 172
    .line 173
    .line 174
    goto :goto_3

    .line 175
    :pswitch_4
    const-string p1, "android.support.v4.media.session.action.FOLLOW"

    .line 176
    .line 177
    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    if-nez p1, :cond_b

    .line 182
    .line 183
    const-string p1, "android.support.v4.media.session.action.UNFOLLOW"

    .line 184
    .line 185
    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    if-nez p1, :cond_b

    .line 190
    .line 191
    const/4 p1, 0x0

    .line 192
    invoke-virtual {v3, v4, p1}, Landroid/media/session/MediaController$TransportControls;->sendCustomAction(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 193
    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 197
    .line 198
    const-string p2, "An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action "

    .line 199
    .line 200
    const-string v0, "."

    .line 201
    .line 202
    invoke-static {p2, v4, v0}, LQ0/E;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw p1

    .line 210
    :pswitch_5
    const-string p1, "state"

    .line 211
    .line 212
    invoke-virtual {p2, p1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 213
    .line 214
    .line 215
    move-result p1

    .line 216
    sget-boolean p2, Lit/deviato/spotifuck/AppSingleton;->v:Z

    .line 217
    .line 218
    if-eqz p2, :cond_c

    .line 219
    .line 220
    if-ne p1, v0, :cond_c

    .line 221
    .line 222
    invoke-virtual {v3}, Landroid/media/session/MediaController$TransportControls;->play()V

    .line 223
    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_c
    sget-boolean p2, Lit/deviato/spotifuck/AppSingleton;->w:Z

    .line 227
    .line 228
    if-eqz p2, :cond_d

    .line 229
    .line 230
    if-nez p1, :cond_d

    .line 231
    .line 232
    invoke-virtual {v3}, Landroid/media/session/MediaController$TransportControls;->pause()V

    .line 233
    .line 234
    .line 235
    :cond_d
    :goto_3
    return-void

    .line 236
    nop

    .line 237
    :sswitch_data_0
    .sparse-switch
        -0x63ecb970 -> :sswitch_6
        -0x586da6a6 -> :sswitch_5
        0xe974fb6 -> :sswitch_4
        0x2083ec2d -> :sswitch_3
        0x39a7cee7 -> :sswitch_2
        0x4b0f380e -> :sswitch_1
        0x4b104f4e -> :sswitch_0
    .end sparse-switch

    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
