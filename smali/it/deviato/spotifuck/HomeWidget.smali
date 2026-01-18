.class public Lit/deviato/spotifuck/HomeWidget;
.super Landroid/appwidget/AppWidgetProvider;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/appwidget/AppWidgetProvider;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-class v1, Lit/deviato/spotifuck/WebService$MediaActionReceiver;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/high16 v1, 0xc000000

    .line 16
    .line 17
    invoke-static {p0, p1, v0, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method


# virtual methods
.method public final onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V
    .locals 7

    .line 1
    if-eqz p3, :cond_4

    .line 2
    .line 3
    array-length v0, p3

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_3

    .line 7
    .line 8
    :cond_0
    new-instance v0, Landroid/widget/RemoteViews;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const v2, 0x7f0c002e

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    sget-object v1, Lit/deviato/spotifuck/WebService;->t:Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const v2, 0x7f090068

    .line 27
    .line 28
    .line 29
    const v3, 0x7f09006c

    .line 30
    .line 31
    .line 32
    const v4, 0x7f09006a

    .line 33
    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    sget-object v5, Lit/deviato/spotifuck/WebService;->w:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v5, " - "

    .line 48
    .line 49
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    sget-object v5, Lit/deviato/spotifuck/WebService;->x:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const v5, 0x7f090208

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v5, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 65
    .line 66
    .line 67
    const v1, 0x7f0900f1

    .line 68
    .line 69
    .line 70
    sget-object v5, Lit/deviato/spotifuck/WebService;->v:Landroid/graphics/Bitmap;

    .line 71
    .line 72
    invoke-virtual {v0, v1, v5}, Landroid/widget/RemoteViews;->setImageViewBitmap(ILandroid/graphics/Bitmap;)V

    .line 73
    .line 74
    .line 75
    sget-boolean v1, Lit/deviato/spotifuck/WebService;->D:Z

    .line 76
    .line 77
    if-eqz v1, :cond_1

    .line 78
    .line 79
    const v1, 0x7f0800f1

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    const v1, 0x7f0800f2

    .line 84
    .line 85
    .line 86
    :goto_0
    invoke-virtual {v0, v4, v1}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    .line 87
    .line 88
    .line 89
    sget v1, Lit/deviato/spotifuck/WebService;->C:I

    .line 90
    .line 91
    invoke-virtual {v0, v3, v1}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    .line 92
    .line 93
    .line 94
    sget-boolean v1, Lit/deviato/spotifuck/WebService;->E:Z

    .line 95
    .line 96
    if-eqz v1, :cond_2

    .line 97
    .line 98
    const v1, 0x7f080090

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_2
    const v1, 0x7f08008f

    .line 103
    .line 104
    .line 105
    :goto_1
    invoke-virtual {v0, v2, v1}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    .line 106
    .line 107
    .line 108
    :cond_3
    new-instance v1, Landroid/content/Intent;

    .line 109
    .line 110
    const-class v5, Lit/deviato/spotifuck/MainActivity;

    .line 111
    .line 112
    invoke-direct {v1, p1, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 113
    .line 114
    .line 115
    const/high16 v5, 0x10000000

    .line 116
    .line 117
    invoke-virtual {v1, v5}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 118
    .line 119
    .line 120
    const/16 v5, 0x29a

    .line 121
    .line 122
    const/high16 v6, 0xc000000

    .line 123
    .line 124
    invoke-static {p1, v5, v1, v6}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    const v5, 0x7f09021b

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v5, v1}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 132
    .line 133
    .line 134
    const-string v1, "WIDGET_PLAYPAUSE"

    .line 135
    .line 136
    invoke-static {p1, v1}, Lit/deviato/spotifuck/HomeWidget;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {v0, v4, v1}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 141
    .line 142
    .line 143
    const-string v1, "WIDGET_PREV"

    .line 144
    .line 145
    invoke-static {p1, v1}, Lit/deviato/spotifuck/HomeWidget;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    const v4, 0x7f09006b

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v4, v1}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 153
    .line 154
    .line 155
    const-string v1, "WIDGET_NEXT"

    .line 156
    .line 157
    invoke-static {p1, v1}, Lit/deviato/spotifuck/HomeWidget;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    const v4, 0x7f090069

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v4, v1}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 165
    .line 166
    .line 167
    const-string v1, "REPEAT_ACTION"

    .line 168
    .line 169
    invoke-static {p1, v1}, Lit/deviato/spotifuck/HomeWidget;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-virtual {v0, v3, v1}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 174
    .line 175
    .line 176
    const-string v1, "ADDTOFAV_ACTION"

    .line 177
    .line 178
    invoke-static {p1, v1}, Lit/deviato/spotifuck/HomeWidget;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-virtual {v0, v2, p1}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 183
    .line 184
    .line 185
    array-length p1, p3

    .line 186
    const/4 v1, 0x0

    .line 187
    :goto_2
    if-ge v1, p1, :cond_4

    .line 188
    .line 189
    aget v2, p3, v1

    .line 190
    .line 191
    invoke-virtual {p2, v2, v0}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(ILandroid/widget/RemoteViews;)V

    .line 192
    .line 193
    .line 194
    add-int/lit8 v1, v1, 0x1

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_4
    :goto_3
    return-void
.end method
