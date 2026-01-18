.class public final LN0/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LN0/v;->f:I

    iput-object p2, p0, LN0/v;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 8

    .line 1
    iget p1, p0, LN0/v;->f:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LN0/v;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lo/N;

    .line 9
    .line 10
    iget-object p4, p1, Lo/N;->M:Lo/Q;

    .line 11
    .line 12
    invoke-virtual {p4, p3}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 13
    .line 14
    .line 15
    iget-object p4, p1, Lo/N;->M:Lo/Q;

    .line 16
    .line 17
    invoke-virtual {p4}, Landroid/widget/AdapterView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    .line 18
    .line 19
    .line 20
    move-result-object p5

    .line 21
    if-eqz p5, :cond_0

    .line 22
    .line 23
    iget-object p5, p1, Lo/N;->J:Lo/L;

    .line 24
    .line 25
    invoke-virtual {p5, p3}, Lo/L;->getItemId(I)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    invoke-virtual {p4, p2, p3, v0, v1}, Landroid/widget/AdapterView;->performItemClick(Landroid/view/View;IJ)Z

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {p1}, Lo/H0;->dismiss()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_0
    const/4 p1, 0x0

    .line 37
    iget-object v0, p0, LN0/v;->g:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, LN0/x;

    .line 40
    .line 41
    if-gez p3, :cond_2

    .line 42
    .line 43
    iget-object v1, v0, LN0/x;->j:Lo/H0;

    .line 44
    .line 45
    iget-object v2, v1, Lo/H0;->E:Lo/A;

    .line 46
    .line 47
    invoke-virtual {v2}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-nez v2, :cond_1

    .line 52
    .line 53
    move-object v1, p1

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    iget-object v1, v1, Lo/H0;->h:Lo/v0;

    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/widget/AdapterView;->getSelectedItem()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    goto :goto_0

    .line 62
    :cond_2
    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getAdapter()Landroid/widget/ListAdapter;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-interface {v1, p3}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    :goto_0
    invoke-static {v0, v1}, LN0/x;->a(LN0/x;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    iget-object v0, v0, LN0/x;->j:Lo/H0;

    .line 78
    .line 79
    if-eqz v2, :cond_8

    .line 80
    .line 81
    if-eqz p2, :cond_4

    .line 82
    .line 83
    if-gez p3, :cond_3

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    :goto_1
    move-object v4, p2

    .line 87
    move v5, p3

    .line 88
    move-wide v6, p4

    .line 89
    goto :goto_6

    .line 90
    :cond_4
    :goto_2
    iget-object p2, v0, Lo/H0;->E:Lo/A;

    .line 91
    .line 92
    invoke-virtual {p2}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    if-nez p2, :cond_5

    .line 97
    .line 98
    :goto_3
    move-object p2, p1

    .line 99
    goto :goto_4

    .line 100
    :cond_5
    iget-object p1, v0, Lo/H0;->h:Lo/v0;

    .line 101
    .line 102
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedView()Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    goto :goto_3

    .line 107
    :goto_4
    iget-object p1, v0, Lo/H0;->E:Lo/A;

    .line 108
    .line 109
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-nez p1, :cond_6

    .line 114
    .line 115
    const/4 p1, -0x1

    .line 116
    const/4 p3, -0x1

    .line 117
    goto :goto_5

    .line 118
    :cond_6
    iget-object p1, v0, Lo/H0;->h:Lo/v0;

    .line 119
    .line 120
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    move p3, p1

    .line 125
    :goto_5
    iget-object p1, v0, Lo/H0;->E:Lo/A;

    .line 126
    .line 127
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    if-nez p1, :cond_7

    .line 132
    .line 133
    const-wide/high16 p4, -0x8000000000000000L

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_7
    iget-object p1, v0, Lo/H0;->h:Lo/v0;

    .line 137
    .line 138
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedItemId()J

    .line 139
    .line 140
    .line 141
    move-result-wide p4

    .line 142
    goto :goto_1

    .line 143
    :goto_6
    iget-object v3, v0, Lo/H0;->h:Lo/v0;

    .line 144
    .line 145
    invoke-interface/range {v2 .. v7}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 146
    .line 147
    .line 148
    :cond_8
    invoke-virtual {v0}, Lo/H0;->dismiss()V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    nop

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
