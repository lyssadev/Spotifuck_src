.class public final synthetic LR0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/webkit/ValueCallback;


# instance fields
.field public final synthetic a:Lit/deviato/spotifuck/WebService;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ld0/k;


# direct methods
.method public synthetic constructor <init>(Lit/deviato/spotifuck/WebService;Ljava/lang/String;Ld0/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR0/m;->a:Lit/deviato/spotifuck/WebService;

    iput-object p2, p0, LR0/m;->b:Ljava/lang/String;

    iput-object p3, p0, LR0/m;->c:Ld0/k;

    return-void
.end method


# virtual methods
.method public final onReceiveValue(Ljava/lang/Object;)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, LR0/m;->b:Ljava/lang/String;

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    check-cast v2, Ljava/lang/String;

    .line 8
    .line 9
    sget-object v3, Lit/deviato/spotifuck/WebService;->n:Landroid/support/v4/media/session/t;

    .line 10
    .line 11
    iget-object v3, v1, LR0/m;->a:Lit/deviato/spotifuck/WebService;

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const-string v4, "\""

    .line 17
    .line 18
    const-string v5, ""

    .line 19
    .line 20
    new-instance v6, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    if-eqz v2, :cond_3

    .line 26
    .line 27
    const-string v7, "null"

    .line 28
    .line 29
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    if-nez v7, :cond_3

    .line 34
    .line 35
    :try_start_0
    const-string v7, "^\"|\"$"

    .line 36
    .line 37
    invoke-virtual {v2, v7, v5}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const-string v7, "\\\""

    .line 42
    .line 43
    invoke-virtual {v2, v7, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    new-instance v7, Lorg/json/JSONArray;

    .line 48
    .line 49
    invoke-direct {v7, v2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    :goto_0
    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    if-ge v2, v8, :cond_3

    .line 58
    .line 59
    invoke-virtual {v7, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    const-string v9, "id"

    .line 64
    .line 65
    const/4 v10, 0x0

    .line 66
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v12

    .line 70
    const-string v9, "name"

    .line 71
    .line 72
    const-string v11, "Sconosciuto"

    .line 73
    .line 74
    invoke-virtual {v8, v9, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v13

    .line 78
    const-string v9, "image"

    .line 79
    .line 80
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    const-string v11, "artists"

    .line 85
    .line 86
    invoke-virtual {v8, v11}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    if-eqz v8, :cond_0

    .line 91
    .line 92
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    .line 93
    .line 94
    .line 95
    move-result v11

    .line 96
    if-lez v11, :cond_0

    .line 97
    .line 98
    new-instance v11, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    const v14, 0x7f100002

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v14

    .line 110
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v14, " "

    .line 114
    .line 115
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string v14, ", "

    .line 119
    .line 120
    invoke-virtual {v8, v14}, Lorg/json/JSONArray;->join(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    invoke-virtual {v8, v4, v5}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    :goto_1
    move-object v14, v8

    .line 136
    goto :goto_2

    .line 137
    :catch_0
    move-exception v0

    .line 138
    goto :goto_3

    .line 139
    :cond_0
    const-string v8, "podcasts"

    .line 140
    .line 141
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    if-eqz v8, :cond_1

    .line 146
    .line 147
    const-string v8, "Podcast"

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_1
    move-object v8, v5

    .line 151
    goto :goto_1

    .line 152
    :goto_2
    if-eqz v9, :cond_2

    .line 153
    .line 154
    invoke-static {v9}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 155
    .line 156
    .line 157
    move-result-object v10

    .line 158
    :cond_2
    move-object/from16 v17, v10

    .line 159
    .line 160
    new-instance v8, Landroid/support/v4/media/MediaDescriptionCompat;

    .line 161
    .line 162
    const/16 v16, 0x0

    .line 163
    .line 164
    const/4 v15, 0x0

    .line 165
    const/16 v19, 0x0

    .line 166
    .line 167
    const/16 v18, 0x0

    .line 168
    .line 169
    move-object v11, v8

    .line 170
    invoke-direct/range {v11 .. v19}, Landroid/support/v4/media/MediaDescriptionCompat;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/os/Bundle;Landroid/net/Uri;)V

    .line 171
    .line 172
    .line 173
    new-instance v9, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 174
    .line 175
    const/4 v10, 0x2

    .line 176
    invoke-direct {v9, v8, v10}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;-><init>(Landroid/support/v4/media/MediaDescriptionCompat;I)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 180
    .line 181
    .line 182
    add-int/lit8 v2, v2, 0x1

    .line 183
    .line 184
    goto/16 :goto_0

    .line 185
    .line 186
    :goto_3
    const-string v2, "Spotifuck"

    .line 187
    .line 188
    const-string v3, "Errore parsing JSON"

    .line 189
    .line 190
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 191
    .line 192
    .line 193
    :cond_3
    iget-object v0, v1, LR0/m;->c:Ld0/k;

    .line 194
    .line 195
    invoke-virtual {v0, v6}, Ld0/k;->d(Ljava/util/ArrayList;)V

    .line 196
    .line 197
    .line 198
    return-void
.end method
