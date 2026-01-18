.class public final Lh/A;
.super Landroidx/fragment/app/g;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public final synthetic d:Lh/D;

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lh/D;Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lh/A;->c:I

    .line 3
    iput-object p1, p0, Lh/A;->d:Lh/D;

    invoke-direct {p0, p1}, Landroidx/fragment/app/g;-><init>(Lh/D;)V

    .line 4
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "power"

    .line 5
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/PowerManager;

    iput-object p1, p0, Lh/A;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lh/D;Landroid/support/v4/media/session/t;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lh/A;->c:I

    .line 1
    iput-object p1, p0, Lh/A;->d:Lh/D;

    invoke-direct {p0, p1}, Landroidx/fragment/app/g;-><init>(Lh/D;)V

    .line 2
    iput-object p2, p0, Lh/A;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final e()Landroid/content/IntentFilter;
    .locals 2

    .line 1
    iget v0, p0, Lh/A;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/content/IntentFilter;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "android.intent.action.TIME_SET"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v1, "android.intent.action.TIMEZONE_CHANGED"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v1, "android.intent.action.TIME_TICK"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_0
    new-instance v0, Landroid/content/IntentFilter;

    .line 28
    .line 29
    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v1, "android.os.action.POWER_SAVE_MODE_CHANGED"

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f()I
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lh/A;->c:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lh/A;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Landroid/support/v4/media/session/t;

    .line 11
    .line 12
    iget-object v2, v1, Landroid/support/v4/media/session/t;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lh/K;

    .line 15
    .line 16
    iget-wide v3, v2, Lh/K;->b:J

    .line 17
    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 19
    .line 20
    .line 21
    move-result-wide v5

    .line 22
    const/4 v7, 0x1

    .line 23
    cmp-long v8, v3, v5

    .line 24
    .line 25
    if-lez v8, :cond_0

    .line 26
    .line 27
    iget-boolean v1, v2, Lh/K;->a:Z

    .line 28
    .line 29
    goto/16 :goto_7

    .line 30
    .line 31
    :cond_0
    iget-object v3, v1, Landroid/support/v4/media/session/t;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, Landroid/content/Context;

    .line 34
    .line 35
    const-string v4, "android.permission.ACCESS_COARSE_LOCATION"

    .line 36
    .line 37
    invoke-static {v3, v4}, Lp0/a;->k(Landroid/content/Context;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    const/4 v5, 0x0

    .line 42
    iget-object v1, v1, Landroid/support/v4/media/session/t;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Landroid/location/LocationManager;

    .line 45
    .line 46
    if-nez v4, :cond_1

    .line 47
    .line 48
    const-string v4, "network"

    .line 49
    .line 50
    :try_start_0
    invoke-virtual {v1, v4}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    if-eqz v6, :cond_1

    .line 55
    .line 56
    invoke-virtual {v1, v4}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    .line 57
    .line 58
    .line 59
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    goto :goto_0

    .line 61
    :catch_0
    nop

    .line 62
    :cond_1
    move-object v4, v5

    .line 63
    :goto_0
    const-string v6, "android.permission.ACCESS_FINE_LOCATION"

    .line 64
    .line 65
    invoke-static {v3, v6}, Lp0/a;->k(Landroid/content/Context;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-nez v3, :cond_2

    .line 70
    .line 71
    const-string v3, "gps"

    .line 72
    .line 73
    :try_start_1
    invoke-virtual {v1, v3}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-eqz v6, :cond_2

    .line 78
    .line 79
    invoke-virtual {v1, v3}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    .line 80
    .line 81
    .line 82
    move-result-object v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 83
    goto :goto_1

    .line 84
    :catch_1
    nop

    .line 85
    :cond_2
    :goto_1
    if-eqz v5, :cond_3

    .line 86
    .line 87
    if-eqz v4, :cond_3

    .line 88
    .line 89
    invoke-virtual {v5}, Landroid/location/Location;->getTime()J

    .line 90
    .line 91
    .line 92
    move-result-wide v8

    .line 93
    invoke-virtual {v4}, Landroid/location/Location;->getTime()J

    .line 94
    .line 95
    .line 96
    move-result-wide v10

    .line 97
    cmp-long v1, v8, v10

    .line 98
    .line 99
    if-lez v1, :cond_4

    .line 100
    .line 101
    :goto_2
    move-object v4, v5

    .line 102
    goto :goto_3

    .line 103
    :cond_3
    if-eqz v5, :cond_4

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_4
    :goto_3
    const/4 v1, 0x0

    .line 107
    if-eqz v4, :cond_b

    .line 108
    .line 109
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 110
    .line 111
    .line 112
    move-result-wide v5

    .line 113
    sget-object v3, Lh/J;->d:Lh/J;

    .line 114
    .line 115
    if-nez v3, :cond_5

    .line 116
    .line 117
    new-instance v3, Lh/J;

    .line 118
    .line 119
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 120
    .line 121
    .line 122
    sput-object v3, Lh/J;->d:Lh/J;

    .line 123
    .line 124
    :cond_5
    sget-object v3, Lh/J;->d:Lh/J;

    .line 125
    .line 126
    const-wide/32 v15, 0x5265c00

    .line 127
    .line 128
    .line 129
    sub-long v9, v5, v15

    .line 130
    .line 131
    invoke-virtual {v4}, Landroid/location/Location;->getLatitude()D

    .line 132
    .line 133
    .line 134
    move-result-wide v11

    .line 135
    invoke-virtual {v4}, Landroid/location/Location;->getLongitude()D

    .line 136
    .line 137
    .line 138
    move-result-wide v13

    .line 139
    move-object v8, v3

    .line 140
    invoke-virtual/range {v8 .. v14}, Lh/J;->a(JDD)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v4}, Landroid/location/Location;->getLatitude()D

    .line 144
    .line 145
    .line 146
    move-result-wide v11

    .line 147
    invoke-virtual {v4}, Landroid/location/Location;->getLongitude()D

    .line 148
    .line 149
    .line 150
    move-result-wide v13

    .line 151
    move-wide v9, v5

    .line 152
    invoke-virtual/range {v8 .. v14}, Lh/J;->a(JDD)V

    .line 153
    .line 154
    .line 155
    iget v8, v3, Lh/J;->c:I

    .line 156
    .line 157
    if-ne v8, v7, :cond_6

    .line 158
    .line 159
    const/4 v1, 0x1

    .line 160
    :cond_6
    iget-wide v13, v3, Lh/J;->b:J

    .line 161
    .line 162
    iget-wide v11, v3, Lh/J;->a:J

    .line 163
    .line 164
    add-long v9, v5, v15

    .line 165
    .line 166
    invoke-virtual {v4}, Landroid/location/Location;->getLatitude()D

    .line 167
    .line 168
    .line 169
    move-result-wide v15

    .line 170
    invoke-virtual {v4}, Landroid/location/Location;->getLongitude()D

    .line 171
    .line 172
    .line 173
    move-result-wide v17

    .line 174
    move-object v8, v3

    .line 175
    move-wide/from16 v19, v11

    .line 176
    .line 177
    move-wide v11, v15

    .line 178
    move-wide v15, v13

    .line 179
    move-wide/from16 v13, v17

    .line 180
    .line 181
    invoke-virtual/range {v8 .. v14}, Lh/J;->a(JDD)V

    .line 182
    .line 183
    .line 184
    iget-wide v13, v3, Lh/J;->b:J

    .line 185
    .line 186
    const-wide/16 v3, -0x1

    .line 187
    .line 188
    cmp-long v8, v15, v3

    .line 189
    .line 190
    if-eqz v8, :cond_a

    .line 191
    .line 192
    cmp-long v8, v19, v3

    .line 193
    .line 194
    if-nez v8, :cond_7

    .line 195
    .line 196
    goto :goto_5

    .line 197
    :cond_7
    cmp-long v3, v5, v19

    .line 198
    .line 199
    if-lez v3, :cond_8

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_8
    cmp-long v3, v5, v15

    .line 203
    .line 204
    if-lez v3, :cond_9

    .line 205
    .line 206
    move-wide/from16 v13, v19

    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_9
    move-wide v13, v15

    .line 210
    :goto_4
    const-wide/32 v3, 0xea60

    .line 211
    .line 212
    .line 213
    add-long/2addr v13, v3

    .line 214
    goto :goto_6

    .line 215
    :cond_a
    :goto_5
    const-wide/32 v3, 0x2932e00

    .line 216
    .line 217
    .line 218
    add-long v13, v5, v3

    .line 219
    .line 220
    :goto_6
    iput-boolean v1, v2, Lh/K;->a:Z

    .line 221
    .line 222
    iput-wide v13, v2, Lh/K;->b:J

    .line 223
    .line 224
    goto :goto_7

    .line 225
    :cond_b
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    const/16 v3, 0xb

    .line 230
    .line 231
    invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    const/4 v3, 0x6

    .line 236
    if-lt v2, v3, :cond_c

    .line 237
    .line 238
    const/16 v3, 0x16

    .line 239
    .line 240
    if-lt v2, v3, :cond_d

    .line 241
    .line 242
    :cond_c
    const/4 v1, 0x1

    .line 243
    :cond_d
    :goto_7
    if-eqz v1, :cond_e

    .line 244
    .line 245
    const/4 v7, 0x2

    .line 246
    :cond_e
    return v7

    .line 247
    :pswitch_0
    iget-object v1, v0, Lh/A;->e:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v1, Landroid/os/PowerManager;

    .line 250
    .line 251
    invoke-static {v1}, Lh/w;->a(Landroid/os/PowerManager;)Z

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    if-eqz v1, :cond_f

    .line 256
    .line 257
    const/4 v1, 0x2

    .line 258
    goto :goto_8

    .line 259
    :cond_f
    const/4 v1, 0x1

    .line 260
    :goto_8
    return v1

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h()V
    .locals 2

    .line 1
    iget v0, p0, Lh/A;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iget-object v1, p0, Lh/A;->d:Lh/D;

    .line 8
    .line 9
    invoke-virtual {v1, v0, v0}, Lh/D;->l(ZZ)Z

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    const/4 v0, 0x1

    .line 14
    iget-object v1, p0, Lh/A;->d:Lh/D;

    .line 15
    .line 16
    invoke-virtual {v1, v0, v0}, Lh/D;->l(ZZ)Z

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
