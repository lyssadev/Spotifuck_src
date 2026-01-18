.class public final Lcom/google/android/material/datepicker/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lcom/google/android/material/datepicker/r;

.field public final synthetic h:Lcom/google/android/material/datepicker/j;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/datepicker/j;Lcom/google/android/material/datepicker/r;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/google/android/material/datepicker/f;->f:I

    iput-object p1, p0, Lcom/google/android/material/datepicker/f;->h:Lcom/google/android/material/datepicker/j;

    iput-object p2, p0, Lcom/google/android/material/datepicker/f;->g:Lcom/google/android/material/datepicker/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget p1, p0, Lcom/google/android/material/datepicker/f;->f:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/google/android/material/datepicker/f;->h:Lcom/google/android/material/datepicker/j;

    .line 7
    .line 8
    iget-object v0, p1, Lcom/google/android/material/datepicker/j;->g0:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lj0/K;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 15
    .line 16
    invoke-virtual {v0}, Lj0/K;->v()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-virtual {v0, v2, v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->M0(IIZ)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    const/4 v0, -0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v0}, Lj0/K;->H(Landroid/view/View;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    :goto_0
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    iget-object v1, p1, Lcom/google/android/material/datepicker/j;->g0:Landroidx/recyclerview/widget/RecyclerView;

    .line 36
    .line 37
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Lj0/C;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Lj0/C;->a()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-ge v0, v1, :cond_1

    .line 46
    .line 47
    iget-object v1, p0, Lcom/google/android/material/datepicker/f;->g:Lcom/google/android/material/datepicker/r;

    .line 48
    .line 49
    iget-object v1, v1, Lcom/google/android/material/datepicker/r;->c:Lcom/google/android/material/datepicker/b;

    .line 50
    .line 51
    iget-object v1, v1, Lcom/google/android/material/datepicker/b;->a:Lcom/google/android/material/datepicker/n;

    .line 52
    .line 53
    iget-object v1, v1, Lcom/google/android/material/datepicker/n;->a:Ljava/util/Calendar;

    .line 54
    .line 55
    invoke-static {v1}, Lcom/google/android/material/datepicker/v;->a(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const/4 v2, 0x2

    .line 60
    invoke-virtual {v1, v2, v0}, Ljava/util/Calendar;->add(II)V

    .line 61
    .line 62
    .line 63
    new-instance v0, Lcom/google/android/material/datepicker/n;

    .line 64
    .line 65
    invoke-direct {v0, v1}, Lcom/google/android/material/datepicker/n;-><init>(Ljava/util/Calendar;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v0}, Lcom/google/android/material/datepicker/j;->K(Lcom/google/android/material/datepicker/n;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    return-void

    .line 72
    :pswitch_0
    iget-object p1, p0, Lcom/google/android/material/datepicker/f;->h:Lcom/google/android/material/datepicker/j;

    .line 73
    .line 74
    iget-object v0, p1, Lcom/google/android/material/datepicker/j;->g0:Landroidx/recyclerview/widget/RecyclerView;

    .line 75
    .line 76
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lj0/K;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 81
    .line 82
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->K0()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    add-int/lit8 v0, v0, -0x1

    .line 87
    .line 88
    if-ltz v0, :cond_2

    .line 89
    .line 90
    iget-object v1, p0, Lcom/google/android/material/datepicker/f;->g:Lcom/google/android/material/datepicker/r;

    .line 91
    .line 92
    iget-object v1, v1, Lcom/google/android/material/datepicker/r;->c:Lcom/google/android/material/datepicker/b;

    .line 93
    .line 94
    iget-object v1, v1, Lcom/google/android/material/datepicker/b;->a:Lcom/google/android/material/datepicker/n;

    .line 95
    .line 96
    iget-object v1, v1, Lcom/google/android/material/datepicker/n;->a:Ljava/util/Calendar;

    .line 97
    .line 98
    invoke-static {v1}, Lcom/google/android/material/datepicker/v;->a(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    const/4 v2, 0x2

    .line 103
    invoke-virtual {v1, v2, v0}, Ljava/util/Calendar;->add(II)V

    .line 104
    .line 105
    .line 106
    new-instance v0, Lcom/google/android/material/datepicker/n;

    .line 107
    .line 108
    invoke-direct {v0, v1}, Lcom/google/android/material/datepicker/n;-><init>(Ljava/util/Calendar;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v0}, Lcom/google/android/material/datepicker/j;->K(Lcom/google/android/material/datepicker/n;)V

    .line 112
    .line 113
    .line 114
    :cond_2
    return-void

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
