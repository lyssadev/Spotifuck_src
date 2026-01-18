.class public final LN0/D;
.super LN/b;
.source "SourceFile"


# instance fields
.field public final d:Lcom/google/android/material/textfield/TextInputLayout;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LN/b;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LN0/D;->d:Lcom/google/android/material/textfield/TextInputLayout;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final d(Landroid/view/View;LO/k;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, LN/b;->a:Landroid/view/View$AccessibilityDelegate;

    .line 6
    .line 7
    iget-object v3, v1, LO/k;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 8
    .line 9
    move-object/from16 v4, p1

    .line 10
    .line 11
    invoke-virtual {v2, v4, v3}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 12
    .line 13
    .line 14
    iget-object v2, v0, LN0/D;->d:Lcom/google/android/material/textfield/TextInputLayout;

    .line 15
    .line 16
    invoke-virtual {v2}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    invoke-virtual {v4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v4, 0x0

    .line 28
    :goto_0
    invoke-virtual {v2}, Lcom/google/android/material/textfield/TextInputLayout;->getHint()Ljava/lang/CharSequence;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-virtual {v2}, Lcom/google/android/material/textfield/TextInputLayout;->getError()Ljava/lang/CharSequence;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-virtual {v2}, Lcom/google/android/material/textfield/TextInputLayout;->getPlaceholderText()Ljava/lang/CharSequence;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    invoke-virtual {v2}, Lcom/google/android/material/textfield/TextInputLayout;->getCounterMaxLength()I

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    invoke-virtual {v2}, Lcom/google/android/material/textfield/TextInputLayout;->getCounterOverflowDescription()Ljava/lang/CharSequence;

    .line 45
    .line 46
    .line 47
    move-result-object v9

    .line 48
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 49
    .line 50
    .line 51
    move-result v10

    .line 52
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v11

    .line 56
    iget-boolean v12, v2, Lcom/google/android/material/textfield/TextInputLayout;->z0:Z

    .line 57
    .line 58
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result v13

    .line 62
    if-eqz v13, :cond_2

    .line 63
    .line 64
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 65
    .line 66
    .line 67
    move-result v14

    .line 68
    if-nez v14, :cond_1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    const/4 v14, 0x0

    .line 72
    goto :goto_2

    .line 73
    :cond_2
    :goto_1
    const/4 v14, 0x1

    .line 74
    :goto_2
    if-nez v11, :cond_3

    .line 75
    .line 76
    invoke-interface {v5}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    goto :goto_3

    .line 81
    :cond_3
    const-string v5, ""

    .line 82
    .line 83
    :goto_3
    iget-object v11, v2, Lcom/google/android/material/textfield/TextInputLayout;->g:LN0/z;

    .line 84
    .line 85
    iget-object v15, v11, LN0/z;->g:Lo/d0;

    .line 86
    .line 87
    invoke-virtual {v15}, Landroid/view/View;->getVisibility()I

    .line 88
    .line 89
    .line 90
    move-result v16

    .line 91
    const/16 v0, 0x16

    .line 92
    .line 93
    if-nez v16, :cond_4

    .line 94
    .line 95
    invoke-virtual {v3, v15}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLabelFor(Landroid/view/View;)V

    .line 96
    .line 97
    .line 98
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 99
    .line 100
    if-lt v11, v0, :cond_5

    .line 101
    .line 102
    invoke-static {v15, v3}, LD/d;->d(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 103
    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_4
    sget v15, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 107
    .line 108
    if-lt v15, v0, :cond_5

    .line 109
    .line 110
    iget-object v0, v11, LN0/z;->i:Lcom/google/android/material/internal/CheckableImageButton;

    .line 111
    .line 112
    invoke-static {v0, v3}, LD/d;->d(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 113
    .line 114
    .line 115
    :cond_5
    :goto_4
    const-string v0, ", "

    .line 116
    .line 117
    if-nez v10, :cond_6

    .line 118
    .line 119
    invoke-virtual {v1, v4}, LO/k;->k(Ljava/lang/CharSequence;)V

    .line 120
    .line 121
    .line 122
    goto :goto_5

    .line 123
    :cond_6
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 124
    .line 125
    .line 126
    move-result v11

    .line 127
    if-nez v11, :cond_7

    .line 128
    .line 129
    invoke-virtual {v1, v5}, LO/k;->k(Ljava/lang/CharSequence;)V

    .line 130
    .line 131
    .line 132
    if-nez v12, :cond_8

    .line 133
    .line 134
    if-eqz v7, :cond_8

    .line 135
    .line 136
    new-instance v11, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    invoke-virtual {v1, v7}, LO/k;->k(Ljava/lang/CharSequence;)V

    .line 155
    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_7
    if-eqz v7, :cond_8

    .line 159
    .line 160
    invoke-virtual {v1, v7}, LO/k;->k(Ljava/lang/CharSequence;)V

    .line 161
    .line 162
    .line 163
    :cond_8
    :goto_5
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    if-nez v7, :cond_c

    .line 168
    .line 169
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 170
    .line 171
    const/16 v11, 0x1a

    .line 172
    .line 173
    if-lt v7, v11, :cond_9

    .line 174
    .line 175
    invoke-virtual {v1, v5}, LO/k;->j(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    goto :goto_6

    .line 179
    :cond_9
    if-nez v10, :cond_a

    .line 180
    .line 181
    new-instance v12, Ljava/lang/StringBuilder;

    .line 182
    .line 183
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    :cond_a
    invoke-virtual {v1, v5}, LO/k;->k(Ljava/lang/CharSequence;)V

    .line 200
    .line 201
    .line 202
    :goto_6
    if-lt v7, v11, :cond_b

    .line 203
    .line 204
    invoke-static {v3, v10}, LL/f;->j(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 205
    .line 206
    .line 207
    goto :goto_7

    .line 208
    :cond_b
    const/4 v0, 0x4

    .line 209
    invoke-virtual {v1, v0, v10}, LO/k;->h(IZ)V

    .line 210
    .line 211
    .line 212
    :cond_c
    :goto_7
    if-eqz v4, :cond_d

    .line 213
    .line 214
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-ne v0, v8, :cond_d

    .line 219
    .line 220
    goto :goto_8

    .line 221
    :cond_d
    const/4 v8, -0x1

    .line 222
    :goto_8
    invoke-virtual {v3, v8}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMaxTextLength(I)V

    .line 223
    .line 224
    .line 225
    if-eqz v14, :cond_f

    .line 226
    .line 227
    if-nez v13, :cond_e

    .line 228
    .line 229
    goto :goto_9

    .line 230
    :cond_e
    move-object v6, v9

    .line 231
    :goto_9
    invoke-virtual {v3, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setError(Ljava/lang/CharSequence;)V

    .line 232
    .line 233
    .line 234
    :cond_f
    iget-object v0, v2, Lcom/google/android/material/textfield/TextInputLayout;->o:LN0/u;

    .line 235
    .line 236
    iget-object v0, v0, LN0/u;->y:Lo/d0;

    .line 237
    .line 238
    if-eqz v0, :cond_10

    .line 239
    .line 240
    invoke-virtual {v3, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLabelFor(Landroid/view/View;)V

    .line 241
    .line 242
    .line 243
    :cond_10
    iget-object v0, v2, Lcom/google/android/material/textfield/TextInputLayout;->h:LN0/q;

    .line 244
    .line 245
    invoke-virtual {v0}, LN0/q;->b()LN0/r;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-virtual {v0, v1}, LN0/r;->n(LO/k;)V

    .line 250
    .line 251
    .line 252
    return-void
.end method

.method public final e(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, LN/b;->e(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LN0/D;->d:Lcom/google/android/material/textfield/TextInputLayout;

    .line 5
    .line 6
    iget-object p1, p1, Lcom/google/android/material/textfield/TextInputLayout;->h:LN0/q;

    .line 7
    .line 8
    invoke-virtual {p1}, LN0/q;->b()LN0/r;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1, p2}, LN0/r;->o(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
