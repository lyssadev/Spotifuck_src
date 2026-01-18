.class public final LE0/a;
.super LN/b;
.source "SourceFile"


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LE0/a;->d:I

    iput-object p2, p0, LE0/a;->e:Ljava/lang/Object;

    invoke-direct {p0}, LN/b;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget v0, p0, LE0/a;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, LN/b;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-super {p0, p1, p2}, LN/b;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, LE0/a;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Lcom/google/android/material/internal/CheckableImageButton;

    .line 16
    .line 17
    iget-boolean p1, p1, Lcom/google/android/material/internal/CheckableImageButton;->i:Z

    .line 18
    .line 19
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setChecked(Z)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Landroid/view/View;LO/k;)V
    .locals 7

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, LN/b;->a:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    iget-object v3, p0, LE0/a;->e:Ljava/lang/Object;

    .line 6
    .line 7
    iget v4, p0, LE0/a;->d:I

    .line 8
    .line 9
    packed-switch v4, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v4, p2, LO/k;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 13
    .line 14
    invoke-virtual {v2, p1, v4}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 15
    .line 16
    .line 17
    sget v2, Lcom/google/android/material/button/MaterialButtonToggleGroup;->p:I

    .line 18
    .line 19
    check-cast v3, Lcom/google/android/material/button/MaterialButtonToggleGroup;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    instance-of v2, p1, Lcom/google/android/material/button/MaterialButton;

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    const/4 v2, 0x0

    .line 31
    const/4 v5, 0x0

    .line 32
    :goto_0
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-ge v2, v6, :cond_3

    .line 37
    .line 38
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    if-ne v6, p1, :cond_1

    .line 43
    .line 44
    move v0, v5

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    instance-of v6, v6, Lcom/google/android/material/button/MaterialButton;

    .line 51
    .line 52
    if-eqz v6, :cond_2

    .line 53
    .line 54
    invoke-virtual {v3, v2}, Lcom/google/android/material/button/MaterialButtonToggleGroup;->c(I)Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-eqz v6, :cond_2

    .line 59
    .line 60
    add-int/2addr v5, v1

    .line 61
    :cond_2
    add-int/2addr v2, v1

    .line 62
    goto :goto_0

    .line 63
    :cond_3
    :goto_1
    check-cast p1, Lcom/google/android/material/button/MaterialButton;

    .line 64
    .line 65
    iget-boolean p1, p1, Lcom/google/android/material/button/MaterialButton;->t:Z

    .line 66
    .line 67
    invoke-static {p1, v4, v1, v0, v1}, LO/j;->a(ZIIII)LO/j;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p2, p1}, LO/k;->i(LO/j;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_0
    check-cast v3, Lg0/x;

    .line 76
    .line 77
    iget-object v1, v3, Lg0/x;->g:Lj0/b0;

    .line 78
    .line 79
    invoke-virtual {v1, p1, p2}, Lj0/b0;->d(Landroid/view/View;LO/k;)V

    .line 80
    .line 81
    .line 82
    iget-object p2, v3, Lg0/x;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 83
    .line 84
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lj0/a0;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-eqz p1, :cond_5

    .line 92
    .line 93
    iget-object v1, p1, Lj0/a0;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 94
    .line 95
    if-nez v1, :cond_4

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView;->F(Lj0/a0;)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    :cond_5
    :goto_2
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Lj0/C;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    instance-of p2, p1, Lg0/u;

    .line 107
    .line 108
    if-nez p2, :cond_6

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_6
    check-cast p1, Lg0/u;

    .line 112
    .line 113
    invoke-virtual {p1, v0}, Lg0/u;->i(I)Landroidx/preference/Preference;

    .line 114
    .line 115
    .line 116
    :goto_3
    return-void

    .line 117
    :pswitch_1
    iget-object v0, p2, LO/k;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 118
    .line 119
    invoke-virtual {v2, p1, v0}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 120
    .line 121
    .line 122
    check-cast v3, Lcom/google/android/material/datepicker/j;

    .line 123
    .line 124
    iget-object p1, v3, Lcom/google/android/material/datepicker/j;->k0:Landroid/view/View;

    .line 125
    .line 126
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-nez p1, :cond_7

    .line 131
    .line 132
    invoke-virtual {v3}, Landroidx/fragment/app/r;->k()Landroid/content/res/Resources;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    const v0, 0x7f1000c5

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    goto :goto_4

    .line 144
    :cond_7
    invoke-virtual {v3}, Landroidx/fragment/app/r;->k()Landroid/content/res/Resources;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    const v0, 0x7f1000c3

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    :goto_4
    invoke-virtual {p2, p1}, LO/k;->j(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :pswitch_2
    iget-object p2, p2, LO/k;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 160
    .line 161
    invoke-virtual {v2, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 162
    .line 163
    .line 164
    check-cast v3, Lcom/google/android/material/internal/NavigationMenuItemView;

    .line 165
    .line 166
    iget-boolean p1, v3, Lcom/google/android/material/internal/NavigationMenuItemView;->C:Z

    .line 167
    .line 168
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :pswitch_3
    iget-object p2, p2, LO/k;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 173
    .line 174
    invoke-virtual {v2, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 175
    .line 176
    .line 177
    check-cast v3, Lcom/google/android/material/internal/CheckableImageButton;

    .line 178
    .line 179
    iget-boolean p1, v3, Lcom/google/android/material/internal/CheckableImageButton;->j:Z

    .line 180
    .line 181
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    .line 182
    .line 183
    .line 184
    iget-boolean p1, v3, Lcom/google/android/material/internal/CheckableImageButton;->i:Z

    .line 185
    .line 186
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    .line 187
    .line 188
    .line 189
    return-void

    .line 190
    nop

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public g(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 1

    .line 1
    iget v0, p0, LE0/a;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, LN/b;->g(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    iget-object v0, p0, LE0/a;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lg0/x;

    .line 14
    .line 15
    iget-object v0, v0, Lg0/x;->g:Lj0/b0;

    .line 16
    .line 17
    invoke-virtual {v0, p1, p2, p3}, Lj0/b0;->g(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
