.class public final LR0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LR0/i;->f:I

    iput-object p2, p0, LR0/i;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget v0, p0, LR0/i;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LR0/i;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    .line 9
    .line 10
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->Q:Lo/a1;

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p1, p1, Lo/a1;->g:Ln/n;

    .line 17
    .line 18
    :goto_0
    if-eqz p1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Ln/n;->collapseActionView()Z

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void

    .line 24
    :pswitch_0
    iget-object p1, p0, LR0/i;->g:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Lm/a;

    .line 27
    .line 28
    invoke-virtual {p1}, Lm/a;->a()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_1
    iget-object v0, p0, LR0/i;->g:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lh/h;

    .line 35
    .line 36
    iget-object v1, v0, Lh/h;->i:Landroid/widget/Button;

    .line 37
    .line 38
    if-ne p1, v1, :cond_2

    .line 39
    .line 40
    iget-object v1, v0, Lh/h;->k:Landroid/os/Message;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    invoke-static {v1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    iget-object v1, v0, Lh/h;->l:Landroid/widget/Button;

    .line 50
    .line 51
    if-ne p1, v1, :cond_3

    .line 52
    .line 53
    iget-object v1, v0, Lh/h;->n:Landroid/os/Message;

    .line 54
    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    invoke-static {v1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    goto :goto_1

    .line 62
    :cond_3
    iget-object v1, v0, Lh/h;->o:Landroid/widget/Button;

    .line 63
    .line 64
    if-ne p1, v1, :cond_4

    .line 65
    .line 66
    iget-object p1, v0, Lh/h;->q:Landroid/os/Message;

    .line 67
    .line 68
    if-eqz p1, :cond_4

    .line 69
    .line 70
    invoke-static {p1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    goto :goto_1

    .line 75
    :cond_4
    const/4 p1, 0x0

    .line 76
    :goto_1
    if-eqz p1, :cond_5

    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 79
    .line 80
    .line 81
    :cond_5
    iget-object p1, v0, Lh/h;->F:LQ0/j;

    .line 82
    .line 83
    const/4 v1, 0x1

    .line 84
    iget-object v0, v0, Lh/h;->b:Lh/i;

    .line 85
    .line 86
    invoke-virtual {p1, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :pswitch_2
    iget-object v0, p0, LR0/i;->g:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Landroidx/preference/Preference;

    .line 97
    .line 98
    invoke-virtual {v0, p1}, Landroidx/preference/Preference;->r(Landroid/view/View;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :pswitch_3
    iget-object p1, p0, LR0/i;->g:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p1, Lcom/google/android/material/datepicker/j;

    .line 105
    .line 106
    iget v0, p1, Lcom/google/android/material/datepicker/j;->d0:I

    .line 107
    .line 108
    const/4 v1, 0x2

    .line 109
    const/4 v2, 0x1

    .line 110
    if-ne v0, v1, :cond_6

    .line 111
    .line 112
    invoke-virtual {p1, v2}, Lcom/google/android/material/datepicker/j;->L(I)V

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_6
    if-ne v0, v2, :cond_7

    .line 117
    .line 118
    invoke-virtual {p1, v1}, Lcom/google/android/material/datepicker/j;->L(I)V

    .line 119
    .line 120
    .line 121
    :cond_7
    :goto_2
    return-void

    .line 122
    :pswitch_4
    sget-object p1, Lit/deviato/spotifuck/MainActivity;->L:Landroid/widget/Switch;

    .line 123
    .line 124
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    const-string v0, "ServiceOn"

    .line 129
    .line 130
    iget-object v1, p0, LR0/i;->g:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v1, Lit/deviato/spotifuck/MainActivity;

    .line 133
    .line 134
    if-eqz p1, :cond_8

    .line 135
    .line 136
    const/4 p1, 0x1

    .line 137
    sput-boolean p1, Lit/deviato/spotifuck/AppSingleton;->m:Z

    .line 138
    .line 139
    sget-object v2, Lit/deviato/spotifuck/AppSingleton;->i:Landroid/content/SharedPreferences$Editor;

    .line 140
    .line 141
    invoke-interface {v2, v0, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 142
    .line 143
    .line 144
    sget-object p1, Lit/deviato/spotifuck/AppSingleton;->i:Landroid/content/SharedPreferences$Editor;

    .line 145
    .line 146
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 147
    .line 148
    .line 149
    sget-object p1, Lit/deviato/spotifuck/AppSingleton;->f:Landroid/content/Context;

    .line 150
    .line 151
    sget-object v0, Lit/deviato/spotifuck/MainActivity;->N:Landroid/content/Intent;

    .line 152
    .line 153
    invoke-static {p1, v0}, Lp0/a;->G0(Landroid/content/Context;Landroid/content/Intent;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1}, Lit/deviato/spotifuck/MainActivity;->s()V

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_8
    const/4 p1, 0x0

    .line 161
    sput-boolean p1, Lit/deviato/spotifuck/AppSingleton;->m:Z

    .line 162
    .line 163
    sget-object v2, Lit/deviato/spotifuck/AppSingleton;->i:Landroid/content/SharedPreferences$Editor;

    .line 164
    .line 165
    invoke-interface {v2, v0, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 166
    .line 167
    .line 168
    sget-object p1, Lit/deviato/spotifuck/AppSingleton;->i:Landroid/content/SharedPreferences$Editor;

    .line 169
    .line 170
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    sget-object p1, Lit/deviato/spotifuck/MainActivity;->H:Landroid/widget/TextView;

    .line 177
    .line 178
    const v0, 0x7f1000e8

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 182
    .line 183
    .line 184
    sget-object p1, Lit/deviato/spotifuck/MainActivity;->G:Landroid/widget/FrameLayout;

    .line 185
    .line 186
    sget-object v0, Lit/deviato/spotifuck/MainActivity;->K:Landroid/webkit/WebView;

    .line 187
    .line 188
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 189
    .line 190
    .line 191
    new-instance p1, Landroid/content/Intent;

    .line 192
    .line 193
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->f:Landroid/content/Context;

    .line 194
    .line 195
    const-class v2, Lit/deviato/spotifuck/WebService;

    .line 196
    .line 197
    invoke-direct {p1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 198
    .line 199
    .line 200
    const-string v0, "STOP_SERVICE"

    .line 201
    .line 202
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-virtual {v1, p1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 207
    .line 208
    .line 209
    :goto_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    invoke-static {}, Lit/deviato/spotifuck/MainActivity;->u()V

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    nop

    .line 217
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
