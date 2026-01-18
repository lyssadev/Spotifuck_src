.class public Lit/deviato/spotifuck/MainActivity;
.super Lh/l;
.source "SourceFile"


# static fields
.field public static F:Lit/deviato/spotifuck/LockableHScrollView; = null

.field public static G:Landroid/widget/FrameLayout; = null

.field public static H:Landroid/widget/TextView; = null

.field public static I:Landroid/widget/TextView; = null

.field public static J:Landroid/widget/TextView; = null

.field public static K:Landroid/webkit/WebView; = null

.field public static L:Landroid/widget/Switch; = null

.field public static M:Landroid/widget/ProgressBar; = null

.field public static N:Landroid/content/Intent; = null

.field public static O:I = 0x0

.field public static P:Z = false

.field public static Q:Z

.field public static R:Z

.field public static S:Z


# instance fields
.field public final D:Landroid/os/Handler;

.field public final E:LR0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-boolean v0, Lit/deviato/spotifuck/AppSingleton;->u:Z

    .line 2
    .line 3
    sput-boolean v0, Lit/deviato/spotifuck/MainActivity;->Q:Z

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    sput-boolean v0, Lit/deviato/spotifuck/MainActivity;->R:Z

    .line 7
    .line 8
    sput-boolean v0, Lit/deviato/spotifuck/MainActivity;->S:Z

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lh/l;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lit/deviato/spotifuck/MainActivity;->D:Landroid/os/Handler;

    .line 10
    .line 11
    new-instance v0, LR0/a;

    .line 12
    .line 13
    const/4 v1, 0x5

    .line 14
    invoke-direct {v0, v1}, LR0/a;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lit/deviato/spotifuck/MainActivity;->E:LR0/a;

    .line 18
    .line 19
    return-void
.end method

.method public static t(Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Lit/deviato/spotifuck/MainActivity;->M:Landroid/widget/ProgressBar;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lit/deviato/spotifuck/MainActivity;->J:Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    sget-object p0, Lit/deviato/spotifuck/MainActivity;->J:Landroid/widget/TextView;

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lit/deviato/spotifuck/MainActivity;->J:Landroid/widget/TextView;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->bringToFront()V

    .line 20
    .line 21
    .line 22
    new-instance p0, Landroid/os/Handler;

    .line 23
    .line 24
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 29
    .line 30
    .line 31
    new-instance v0, LR0/a;

    .line 32
    .line 33
    const/4 v1, 0x6

    .line 34
    invoke-direct {v0, v1}, LR0/a;-><init>(I)V

    .line 35
    .line 36
    .line 37
    const-wide/16 v1, 0x9c4

    .line 38
    .line 39
    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public static u()V
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    const v1, -0x10100a0

    .line 3
    .line 4
    .line 5
    const v2, 0x10100a0

    .line 6
    .line 7
    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x0

    .line 10
    sget-object v5, Lit/deviato/spotifuck/MainActivity;->L:Landroid/widget/Switch;

    .line 11
    .line 12
    invoke-virtual {v5}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    const/4 v6, -0x1

    .line 17
    const/4 v7, 0x4

    .line 18
    const v8, -0x333334

    .line 19
    .line 20
    .line 21
    const/16 v9, 0x17

    .line 22
    .line 23
    if-eqz v5, :cond_1

    .line 24
    .line 25
    sget-boolean v5, Lit/deviato/spotifuck/AppSingleton;->B:Z

    .line 26
    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    sget-object v5, Lit/deviato/spotifuck/MainActivity;->M:Landroid/widget/ProgressBar;

    .line 30
    .line 31
    invoke-virtual {v5, v7}, Landroid/view/View;->setVisibility(I)V

    .line 32
    .line 33
    .line 34
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 35
    .line 36
    if-lt v5, v9, :cond_2

    .line 37
    .line 38
    new-instance v5, Landroid/content/res/ColorStateList;

    .line 39
    .line 40
    new-array v3, v3, [[I

    .line 41
    .line 42
    filled-new-array {v2}, [I

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    aput-object v2, v3, v4

    .line 47
    .line 48
    filled-new-array {v1}, [I

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    aput-object v1, v3, v0

    .line 53
    .line 54
    const-string v0, "#00C8F0"

    .line 55
    .line 56
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    filled-new-array {v0, v8}, [I

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-direct {v5, v3, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 65
    .line 66
    .line 67
    sget-object v0, Lit/deviato/spotifuck/MainActivity;->L:Landroid/widget/Switch;

    .line 68
    .line 69
    invoke-static {v0, v5}, LC0/a;->t(Landroid/widget/Switch;Landroid/content/res/ColorStateList;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    sget-object v5, Lit/deviato/spotifuck/MainActivity;->M:Landroid/widget/ProgressBar;

    .line 74
    .line 75
    invoke-virtual {v5, v4}, Landroid/view/View;->setVisibility(I)V

    .line 76
    .line 77
    .line 78
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 79
    .line 80
    if-lt v5, v9, :cond_2

    .line 81
    .line 82
    new-instance v5, Landroid/content/res/ColorStateList;

    .line 83
    .line 84
    new-array v3, v3, [[I

    .line 85
    .line 86
    filled-new-array {v2}, [I

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    aput-object v2, v3, v4

    .line 91
    .line 92
    filled-new-array {v1}, [I

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    aput-object v1, v3, v0

    .line 97
    .line 98
    filled-new-array {v6, v8}, [I

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-direct {v5, v3, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 103
    .line 104
    .line 105
    sget-object v0, Lit/deviato/spotifuck/MainActivity;->L:Landroid/widget/Switch;

    .line 106
    .line 107
    invoke-static {v0, v5}, LC0/a;->t(Landroid/widget/Switch;Landroid/content/res/ColorStateList;)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_1
    sget-object v5, Lit/deviato/spotifuck/MainActivity;->M:Landroid/widget/ProgressBar;

    .line 112
    .line 113
    invoke-virtual {v5, v7}, Landroid/view/View;->setVisibility(I)V

    .line 114
    .line 115
    .line 116
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 117
    .line 118
    if-lt v5, v9, :cond_2

    .line 119
    .line 120
    new-instance v5, Landroid/content/res/ColorStateList;

    .line 121
    .line 122
    new-array v3, v3, [[I

    .line 123
    .line 124
    filled-new-array {v2}, [I

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    aput-object v2, v3, v4

    .line 129
    .line 130
    filled-new-array {v1}, [I

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    aput-object v1, v3, v0

    .line 135
    .line 136
    filled-new-array {v6, v8}, [I

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-direct {v5, v3, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 141
    .line 142
    .line 143
    sget-object v0, Lit/deviato/spotifuck/MainActivity;->L:Landroid/widget/Switch;

    .line 144
    .line 145
    invoke-static {v0, v5}, LC0/a;->t(Landroid/widget/Switch;Landroid/content/res/ColorStateList;)V

    .line 146
    .line 147
    .line 148
    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Lh/l;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    sget-boolean p1, Lit/deviato/spotifuck/AppSingleton;->u:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    new-instance p1, Ljava/util/Locale;

    .line 9
    .line 10
    const-string v0, "en"

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Ljava/util/Locale;->setDefault(Ljava/util/Locale;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    sput-object p1, Lit/deviato/spotifuck/AppSingleton;->g:Ljava/lang/ref/WeakReference;

    .line 24
    .line 25
    const p1, 0x7f0c001c

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lh/l;->setContentView(I)V

    .line 29
    .line 30
    .line 31
    const p1, 0x7f090109

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lh/l;->findViewById(I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-instance v0, LN/g;

    .line 39
    .line 40
    const/4 v1, 0x2

    .line 41
    invoke-direct {v0, v1}, LN/g;-><init>(I)V

    .line 42
    .line 43
    .line 44
    sget-object v1, LN/Q;->a:Ljava/util/WeakHashMap;

    .line 45
    .line 46
    invoke-static {p1, v0}, LN/F;->u(Landroid/view/View;LN/r;)V

    .line 47
    .line 48
    .line 49
    new-instance p1, Landroid/content/Intent;

    .line 50
    .line 51
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->f:Landroid/content/Context;

    .line 52
    .line 53
    const-class v1, Lit/deviato/spotifuck/WebService;

    .line 54
    .line 55
    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 56
    .line 57
    .line 58
    sput-object p1, Lit/deviato/spotifuck/MainActivity;->N:Landroid/content/Intent;

    .line 59
    .line 60
    invoke-virtual {p0}, Landroidx/activity/n;->i()Landroidx/activity/A;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    new-instance v0, LR0/h;

    .line 65
    .line 66
    invoke-direct {v0, p0}, LR0/h;-><init>(Lit/deviato/spotifuck/MainActivity;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, p0, v0}, Landroidx/activity/A;->a(Landroidx/lifecycle/r;LR0/h;)V

    .line 70
    .line 71
    .line 72
    const p1, 0x7f0900e1

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, p1}, Lh/l;->findViewById(I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Lit/deviato/spotifuck/LockableHScrollView;

    .line 80
    .line 81
    sput-object p1, Lit/deviato/spotifuck/MainActivity;->F:Lit/deviato/spotifuck/LockableHScrollView;

    .line 82
    .line 83
    const p1, 0x7f090219

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, p1}, Lh/l;->findViewById(I)Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, Landroid/widget/FrameLayout;

    .line 91
    .line 92
    sput-object p1, Lit/deviato/spotifuck/MainActivity;->G:Landroid/widget/FrameLayout;

    .line 93
    .line 94
    const p1, 0x7f0900d5

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, p1}, Lh/l;->findViewById(I)Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, Landroid/widget/TextView;

    .line 102
    .line 103
    sput-object p1, Lit/deviato/spotifuck/MainActivity;->H:Landroid/widget/TextView;

    .line 104
    .line 105
    const p1, 0x7f0900d6

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, p1}, Lh/l;->findViewById(I)Landroid/view/View;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    check-cast p1, Landroid/widget/TextView;

    .line 113
    .line 114
    sput-object p1, Lit/deviato/spotifuck/MainActivity;->I:Landroid/widget/TextView;

    .line 115
    .line 116
    const p1, 0x7f090206

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, p1}, Lh/l;->findViewById(I)Landroid/view/View;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    check-cast p1, Landroid/widget/TextView;

    .line 124
    .line 125
    sput-object p1, Lit/deviato/spotifuck/MainActivity;->J:Landroid/widget/TextView;

    .line 126
    .line 127
    new-instance p1, Landroid/webkit/WebView;

    .line 128
    .line 129
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->f:Landroid/content/Context;

    .line 130
    .line 131
    invoke-direct {p1, v0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-virtual {p1}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    const-string v0, "Chrome/"

    .line 143
    .line 144
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    const/4 v1, -0x1

    .line 149
    if-eq v0, v1, :cond_2

    .line 150
    .line 151
    const-string v2, " "

    .line 152
    .line 153
    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-ne v2, v1, :cond_1

    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    :cond_1
    sget-object v1, Lit/deviato/spotifuck/MainActivity;->I:Landroid/widget/TextView;

    .line 164
    .line 165
    new-instance v3, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    const-string v4, "WebView v."

    .line 168
    .line 169
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    add-int/lit8 v0, v0, 0x7

    .line 173
    .line 174
    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 186
    .line 187
    .line 188
    :cond_2
    const p1, 0x7f09017f

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0, p1}, Lh/l;->findViewById(I)Landroid/view/View;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    check-cast p1, Landroid/widget/ProgressBar;

    .line 196
    .line 197
    sput-object p1, Lit/deviato/spotifuck/MainActivity;->M:Landroid/widget/ProgressBar;

    .line 198
    .line 199
    const p1, 0x7f090067

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0, p1}, Lh/l;->findViewById(I)Landroid/view/View;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    check-cast p1, Landroid/widget/ImageView;

    .line 207
    .line 208
    new-instance v0, LN0/a;

    .line 209
    .line 210
    const/4 v1, 0x3

    .line 211
    invoke-direct {v0, v1, p0}, LN0/a;-><init>(ILjava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 215
    .line 216
    .line 217
    const p1, 0x7f0901d2

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0, p1}, Lh/l;->findViewById(I)Landroid/view/View;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    check-cast p1, Landroid/widget/Switch;

    .line 225
    .line 226
    sput-object p1, Lit/deviato/spotifuck/MainActivity;->L:Landroid/widget/Switch;

    .line 227
    .line 228
    sget-boolean p1, Lit/deviato/spotifuck/AppSingleton;->m:Z

    .line 229
    .line 230
    if-eqz p1, :cond_3

    .line 231
    .line 232
    sget-object p1, Lit/deviato/spotifuck/MainActivity;->L:Landroid/widget/Switch;

    .line 233
    .line 234
    const/4 v0, 0x1

    .line 235
    invoke-virtual {p1, v0}, Landroid/widget/Switch;->setChecked(Z)V

    .line 236
    .line 237
    .line 238
    sget-object p1, Lit/deviato/spotifuck/AppSingleton;->f:Landroid/content/Context;

    .line 239
    .line 240
    sget-object v0, Lit/deviato/spotifuck/MainActivity;->N:Landroid/content/Intent;

    .line 241
    .line 242
    invoke-static {p1, v0}, Lp0/a;->G0(Landroid/content/Context;Landroid/content/Intent;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p0}, Lit/deviato/spotifuck/MainActivity;->s()V

    .line 246
    .line 247
    .line 248
    :cond_3
    invoke-static {}, Lit/deviato/spotifuck/MainActivity;->u()V

    .line 249
    .line 250
    .line 251
    sget-object p1, Lit/deviato/spotifuck/MainActivity;->L:Landroid/widget/Switch;

    .line 252
    .line 253
    new-instance v0, LR0/i;

    .line 254
    .line 255
    const/4 v1, 0x0

    .line 256
    invoke-direct {v0, v1, p0}, LR0/i;-><init>(ILjava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 260
    .line 261
    .line 262
    return-void
.end method

.method public final onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Lh/l;->onDestroy()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lit/deviato/spotifuck/AppSingleton;->g:Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    return-void
.end method

.method public final onResume()V
    .locals 6

    .line 1
    invoke-super {p0}, Lh/l;->onResume()V

    .line 2
    .line 3
    .line 4
    sget-boolean v0, Lit/deviato/spotifuck/AppSingleton;->t:Z

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/16 v0, 0xd

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 16
    .line 17
    .line 18
    :goto_0
    sget-object v0, Lit/deviato/spotifuck/WebService;->t:Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    sget-object v0, Lit/deviato/spotifuck/MainActivity;->K:Landroid/webkit/WebView;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    sget-object v0, Lit/deviato/spotifuck/MainActivity;->G:Landroid/widget/FrameLayout;

    .line 35
    .line 36
    sget-object v2, Lit/deviato/spotifuck/MainActivity;->K:Landroid/webkit/WebView;

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 39
    .line 40
    .line 41
    new-instance v0, Landroid/os/Handler;

    .line 42
    .line 43
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 48
    .line 49
    .line 50
    new-instance v2, LR0/g;

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    invoke-direct {v2, p0, v3}, LR0/g;-><init>(Lit/deviato/spotifuck/MainActivity;I)V

    .line 54
    .line 55
    .line 56
    const-wide/16 v3, 0xc8

    .line 57
    .line 58
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 59
    .line 60
    .line 61
    :cond_1
    sget-boolean v0, Lit/deviato/spotifuck/AppSingleton;->u:Z

    .line 62
    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    new-instance v0, Ljava/util/Locale;

    .line 66
    .line 67
    const-string v2, "en"

    .line 68
    .line 69
    invoke-direct {v0, v2}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v0}, Ljava/util/Locale;->setDefault(Ljava/util/Locale;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    sget-boolean v0, Lit/deviato/spotifuck/MainActivity;->Q:Z

    .line 76
    .line 77
    sget-boolean v2, Lit/deviato/spotifuck/AppSingleton;->u:Z

    .line 78
    .line 79
    if-eq v0, v2, :cond_3

    .line 80
    .line 81
    sput-boolean v1, Lit/deviato/spotifuck/MainActivity;->R:Z

    .line 82
    .line 83
    :cond_3
    sput-boolean v2, Lit/deviato/spotifuck/MainActivity;->Q:Z

    .line 84
    .line 85
    sget-boolean v0, Lit/deviato/spotifuck/MainActivity;->R:Z

    .line 86
    .line 87
    const/4 v2, 0x0

    .line 88
    if-eqz v0, :cond_4

    .line 89
    .line 90
    sput-boolean v2, Lit/deviato/spotifuck/MainActivity;->R:Z

    .line 91
    .line 92
    new-instance v0, Landroid/webkit/WebView;

    .line 93
    .line 94
    sget-object v3, Lit/deviato/spotifuck/AppSingleton;->f:Landroid/content/Context;

    .line 95
    .line 96
    invoke-direct {v0, v3}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->clearCache(Z)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Landroid/webkit/WebView;->clearHistory()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Landroid/webkit/WebView;->clearFormData()V

    .line 106
    .line 107
    .line 108
    invoke-static {}, Landroid/webkit/WebStorage;->getInstance()Landroid/webkit/WebStorage;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v0}, Landroid/webkit/WebStorage;->deleteAllData()V

    .line 113
    .line 114
    .line 115
    sget-boolean v0, Lit/deviato/spotifuck/AppSingleton;->m:Z

    .line 116
    .line 117
    if-eqz v0, :cond_4

    .line 118
    .line 119
    sget-object v0, Lit/deviato/spotifuck/MainActivity;->K:Landroid/webkit/WebView;

    .line 120
    .line 121
    invoke-virtual {v0}, Landroid/webkit/WebView;->reload()V

    .line 122
    .line 123
    .line 124
    const v0, 0x7f1000e7

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-static {v0}, Lit/deviato/spotifuck/MainActivity;->t(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    :cond_4
    sget-boolean v0, Lit/deviato/spotifuck/MainActivity;->S:Z

    .line 135
    .line 136
    if-eqz v0, :cond_7

    .line 137
    .line 138
    sput-boolean v2, Lit/deviato/spotifuck/MainActivity;->S:Z

    .line 139
    .line 140
    sget-object v0, Lit/deviato/spotifuck/WebService;->t:Ljava/lang/Boolean;

    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_5

    .line 147
    .line 148
    sget-object v3, Lit/deviato/spotifuck/MainActivity;->H:Landroid/widget/TextView;

    .line 149
    .line 150
    const v4, 0x7f1000e8

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(I)V

    .line 154
    .line 155
    .line 156
    sget-object v3, Lit/deviato/spotifuck/MainActivity;->G:Landroid/widget/FrameLayout;

    .line 157
    .line 158
    sget-object v4, Lit/deviato/spotifuck/MainActivity;->K:Landroid/webkit/WebView;

    .line 159
    .line 160
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 161
    .line 162
    .line 163
    new-instance v3, Landroid/content/Intent;

    .line 164
    .line 165
    sget-object v4, Lit/deviato/spotifuck/AppSingleton;->f:Landroid/content/Context;

    .line 166
    .line 167
    const-class v5, Lit/deviato/spotifuck/WebService;

    .line 168
    .line 169
    invoke-direct {v3, v4, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 170
    .line 171
    .line 172
    const-string v4, "STOP_SERVICE"

    .line 173
    .line 174
    invoke-virtual {v3, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    invoke-virtual {p0, v3}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 179
    .line 180
    .line 181
    :cond_5
    new-instance v3, Landroid/webkit/WebView;

    .line 182
    .line 183
    sget-object v4, Lit/deviato/spotifuck/AppSingleton;->f:Landroid/content/Context;

    .line 184
    .line 185
    invoke-direct {v3, v4}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v3, v1}, Landroid/webkit/WebView;->clearCache(Z)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3}, Landroid/webkit/WebView;->clearHistory()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3}, Landroid/webkit/WebView;->clearFormData()V

    .line 195
    .line 196
    .line 197
    invoke-static {}, Landroid/webkit/WebStorage;->getInstance()Landroid/webkit/WebStorage;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-virtual {v1}, Landroid/webkit/WebStorage;->deleteAllData()V

    .line 202
    .line 203
    .line 204
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    const/4 v3, 0x0

    .line 209
    invoke-virtual {v1, v3}, Landroid/webkit/CookieManager;->removeAllCookies(Landroid/webkit/ValueCallback;)V

    .line 210
    .line 211
    .line 212
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-virtual {v1}, Landroid/webkit/CookieManager;->flush()V

    .line 217
    .line 218
    .line 219
    sput-boolean v2, Lit/deviato/spotifuck/AppSingleton;->n:Z

    .line 220
    .line 221
    sget-object v1, Lit/deviato/spotifuck/AppSingleton;->i:Landroid/content/SharedPreferences$Editor;

    .line 222
    .line 223
    const-string v3, "LoggedIn"

    .line 224
    .line 225
    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 226
    .line 227
    .line 228
    sget-object v1, Lit/deviato/spotifuck/AppSingleton;->i:Landroid/content/SharedPreferences$Editor;

    .line 229
    .line 230
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 231
    .line 232
    .line 233
    if-eqz v0, :cond_6

    .line 234
    .line 235
    new-instance v0, Landroid/os/Handler;

    .line 236
    .line 237
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 242
    .line 243
    .line 244
    new-instance v1, LR0/g;

    .line 245
    .line 246
    const/4 v3, 0x1

    .line 247
    invoke-direct {v1, p0, v3}, LR0/g;-><init>(Lit/deviato/spotifuck/MainActivity;I)V

    .line 248
    .line 249
    .line 250
    const-wide/16 v3, 0x258

    .line 251
    .line 252
    invoke-virtual {v0, v1, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 253
    .line 254
    .line 255
    :cond_6
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->f:Landroid/content/Context;

    .line 256
    .line 257
    const-string v1, "All Cookies Deleted!"

    .line 258
    .line 259
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 264
    .line 265
    .line 266
    :cond_7
    return-void
.end method

.method public final s()V
    .locals 4

    .line 1
    sget-object v0, Lit/deviato/spotifuck/MainActivity;->H:Landroid/widget/TextView;

    .line 2
    .line 3
    const v1, 0x7f1000e3

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lit/deviato/spotifuck/AppSingleton;->b()Landroid/webkit/WebView;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lit/deviato/spotifuck/MainActivity;->K:Landroid/webkit/WebView;

    .line 14
    .line 15
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->l:Ljava/lang/String;

    .line 16
    .line 17
    const-string v1, "bigwindow"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    sget-object v0, Lit/deviato/spotifuck/MainActivity;->F:Lit/deviato/spotifuck/LockableHScrollView;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-virtual {v0, v1}, Lit/deviato/spotifuck/LockableHScrollView;->setScrollingEnabled(Z)V

    .line 29
    .line 30
    .line 31
    const/16 v0, 0x640

    .line 32
    .line 33
    sput v0, Lit/deviato/spotifuck/MainActivity;->O:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    sget-object v0, Lit/deviato/spotifuck/MainActivity;->F:Lit/deviato/spotifuck/LockableHScrollView;

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-virtual {v0, v1}, Lit/deviato/spotifuck/LockableHScrollView;->setScrollingEnabled(Z)V

    .line 40
    .line 41
    .line 42
    new-instance v0, Landroid/util/DisplayMetrics;

    .line 43
    .line 44
    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 56
    .line 57
    .line 58
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 59
    .line 60
    sput v0, Lit/deviato/spotifuck/MainActivity;->O:I

    .line 61
    .line 62
    :goto_0
    sget-object v0, Lit/deviato/spotifuck/MainActivity;->K:Landroid/webkit/WebView;

    .line 63
    .line 64
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 65
    .line 66
    sget v2, Lit/deviato/spotifuck/MainActivity;->O:I

    .line 67
    .line 68
    const/4 v3, -0x1

    .line 69
    invoke-direct {v1, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 73
    .line 74
    .line 75
    sget-object v0, Lit/deviato/spotifuck/MainActivity;->K:Landroid/webkit/WebView;

    .line 76
    .line 77
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    if-eqz v0, :cond_1

    .line 82
    .line 83
    sget-object v0, Lit/deviato/spotifuck/MainActivity;->K:Landroid/webkit/WebView;

    .line 84
    .line 85
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Landroid/view/ViewGroup;

    .line 90
    .line 91
    sget-object v1, Lit/deviato/spotifuck/MainActivity;->K:Landroid/webkit/WebView;

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 94
    .line 95
    .line 96
    :cond_1
    sget-object v0, Lit/deviato/spotifuck/MainActivity;->G:Landroid/widget/FrameLayout;

    .line 97
    .line 98
    sget-object v1, Lit/deviato/spotifuck/MainActivity;->K:Landroid/webkit/WebView;

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 101
    .line 102
    .line 103
    return-void
.end method
