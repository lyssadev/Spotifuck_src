.class public Lit/deviato/spotifuck/SettingsActivity$a;
.super Lg0/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lit/deviato/spotifuck/SettingsActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lg0/r;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/String;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lg0/r;->a0:Lg0/w;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/r;->F()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x1

    .line 10
    iput-boolean v2, v0, Lg0/w;->e:Z

    .line 11
    .line 12
    new-instance v3, Lg0/v;

    .line 13
    .line 14
    invoke-direct {v3, v1, v0}, Lg0/v;-><init>(Landroid/content/Context;Lg0/w;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const v4, 0x7f130004

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :try_start_0
    invoke-virtual {v3, v1}, Lg0/v;->c(Landroid/content/res/XmlResourceParser;)Landroidx/preference/PreferenceGroup;

    .line 29
    .line 30
    .line 31
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->close()V

    .line 33
    .line 34
    .line 35
    check-cast v3, Landroidx/preference/PreferenceScreen;

    .line 36
    .line 37
    invoke-virtual {v3, v0}, Landroidx/preference/Preference;->j(Lg0/w;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, v0, Lg0/w;->d:Landroid/content/SharedPreferences$Editor;

    .line 41
    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 45
    .line 46
    .line 47
    :cond_0
    const/4 v1, 0x0

    .line 48
    iput-boolean v1, v0, Lg0/w;->e:Z

    .line 49
    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    invoke-virtual {v3, p1}, Landroidx/preference/PreferenceGroup;->w(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    instance-of v0, v3, Landroidx/preference/PreferenceScreen;

    .line 57
    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 62
    .line 63
    const-string v1, "Preference object with key "

    .line 64
    .line 65
    const-string v2, " is not a PreferenceScreen"

    .line 66
    .line 67
    invoke-static {v1, p1, v2}, LQ0/E;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v0

    .line 75
    :cond_2
    :goto_0
    check-cast v3, Landroidx/preference/PreferenceScreen;

    .line 76
    .line 77
    iget-object p1, p0, Lg0/r;->a0:Lg0/w;

    .line 78
    .line 79
    iget-object v0, p1, Lg0/w;->g:Landroidx/preference/PreferenceScreen;

    .line 80
    .line 81
    if-eq v3, v0, :cond_5

    .line 82
    .line 83
    if-eqz v0, :cond_3

    .line 84
    .line 85
    invoke-virtual {v0}, Landroidx/preference/PreferenceGroup;->m()V

    .line 86
    .line 87
    .line 88
    :cond_3
    iput-object v3, p1, Lg0/w;->g:Landroidx/preference/PreferenceScreen;

    .line 89
    .line 90
    if-eqz v3, :cond_5

    .line 91
    .line 92
    iput-boolean v2, p0, Lg0/r;->c0:Z

    .line 93
    .line 94
    iget-boolean p1, p0, Lg0/r;->d0:Z

    .line 95
    .line 96
    if-eqz p1, :cond_5

    .line 97
    .line 98
    iget-object p1, p0, Lg0/r;->f0:LQ0/j;

    .line 99
    .line 100
    invoke-virtual {p1, v2}, Landroid/os/Handler;->hasMessages(I)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_4

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_4
    invoke-virtual {p1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 112
    .line 113
    .line 114
    :cond_5
    :goto_1
    iget-object p1, p0, Lg0/r;->a0:Lg0/w;

    .line 115
    .line 116
    const/4 v0, 0x0

    .line 117
    if-nez p1, :cond_6

    .line 118
    .line 119
    :goto_2
    move-object p1, v0

    .line 120
    goto :goto_3

    .line 121
    :cond_6
    iget-object p1, p1, Lg0/w;->g:Landroidx/preference/PreferenceScreen;

    .line 122
    .line 123
    if-nez p1, :cond_7

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_7
    const-string v1, "ClearCache"

    .line 127
    .line 128
    invoke-virtual {p1, v1}, Landroidx/preference/PreferenceGroup;->w(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    :goto_3
    new-instance v1, LR0/j;

    .line 133
    .line 134
    const/4 v2, 0x0

    .line 135
    invoke-direct {v1, p0, v2}, LR0/j;-><init>(Lit/deviato/spotifuck/SettingsActivity$a;I)V

    .line 136
    .line 137
    .line 138
    iput-object v1, p1, Landroidx/preference/Preference;->e:Lg0/m;

    .line 139
    .line 140
    iget-object p1, p0, Lg0/r;->a0:Lg0/w;

    .line 141
    .line 142
    if-nez p1, :cond_8

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_8
    iget-object p1, p1, Lg0/w;->g:Landroidx/preference/PreferenceScreen;

    .line 146
    .line 147
    if-nez p1, :cond_9

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_9
    const-string v0, "ClearData"

    .line 151
    .line 152
    invoke-virtual {p1, v0}, Landroidx/preference/PreferenceGroup;->w(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    :goto_4
    new-instance p1, LR0/j;

    .line 157
    .line 158
    const/4 v1, 0x1

    .line 159
    invoke-direct {p1, p0, v1}, LR0/j;-><init>(Lit/deviato/spotifuck/SettingsActivity$a;I)V

    .line 160
    .line 161
    .line 162
    iput-object p1, v0, Landroidx/preference/Preference;->e:Lg0/m;

    .line 163
    .line 164
    return-void

    .line 165
    :catchall_0
    move-exception p1

    .line 166
    invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->close()V

    .line 167
    .line 168
    .line 169
    throw p1

    .line 170
    :cond_a
    new-instance p1, Ljava/lang/RuntimeException;

    .line 171
    .line 172
    const-string v0, "This should be called after super.onCreate."

    .line 173
    .line 174
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw p1
.end method
