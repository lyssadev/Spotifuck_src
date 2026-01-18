.class public final Lcom/google/android/material/datepicker/q;
.super Lj0/a0;
.source "SourceFile"


# instance fields
.field public final t:Landroid/widget/TextView;

.field public final u:Lcom/google/android/material/datepicker/MaterialCalendarGridView;


# direct methods
.method public constructor <init>(Landroid/widget/LinearLayout;Z)V
    .locals 8

    .line 1
    invoke-direct {p0, p1}, Lj0/a0;-><init>(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    const v0, 0x7f09012d

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/widget/TextView;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/google/android/material/datepicker/q;->t:Landroid/widget/TextView;

    .line 14
    .line 15
    sget-object v1, LN/Q;->a:Ljava/util/WeakHashMap;

    .line 16
    .line 17
    new-instance v1, LN/A;

    .line 18
    .line 19
    const-class v4, Ljava/lang/Boolean;

    .line 20
    .line 21
    const/16 v6, 0x1c

    .line 22
    .line 23
    const v3, 0x7f0901d7

    .line 24
    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v7, 0x3

    .line 28
    move-object v2, v1

    .line 29
    invoke-direct/range {v2 .. v7}, LN/A;-><init>(ILjava/lang/Class;III)V

    .line 30
    .line 31
    .line 32
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, LN/C;->d(Landroid/view/View;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    const v1, 0x7f090128

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    .line 45
    .line 46
    iput-object p1, p0, Lcom/google/android/material/datepicker/q;->u:Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    .line 47
    .line 48
    if-nez p2, :cond_0

    .line 49
    .line 50
    const/16 p1, 0x8

    .line 51
    .line 52
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 53
    .line 54
    .line 55
    :cond_0
    return-void
.end method
