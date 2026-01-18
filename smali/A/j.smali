.class public final LA/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LA/j;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    iget v3, p0, LA/j;->a:I

    .line 5
    .line 6
    packed-switch v3, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Lt/f;

    .line 10
    .line 11
    check-cast p2, Lt/f;

    .line 12
    .line 13
    iget p1, p1, Lt/f;->b:I

    .line 14
    .line 15
    iget p2, p2, Lt/f;->b:I

    .line 16
    .line 17
    sub-int/2addr p1, p2

    .line 18
    return p1

    .line 19
    :pswitch_0
    check-cast p1, Lj0/o;

    .line 20
    .line 21
    check-cast p2, Lj0/o;

    .line 22
    .line 23
    iget-object v3, p1, Lj0/o;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 24
    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    const/4 v4, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v4, 0x0

    .line 30
    :goto_0
    iget-object v5, p2, Lj0/o;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 31
    .line 32
    if-nez v5, :cond_1

    .line 33
    .line 34
    const/4 v5, 0x1

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/4 v5, 0x0

    .line 37
    :goto_1
    if-eq v4, v5, :cond_4

    .line 38
    .line 39
    if-nez v3, :cond_3

    .line 40
    .line 41
    :cond_2
    const/4 v0, 0x1

    .line 42
    :cond_3
    :goto_2
    move v2, v0

    .line 43
    goto :goto_3

    .line 44
    :cond_4
    iget-boolean v3, p1, Lj0/o;->a:Z

    .line 45
    .line 46
    iget-boolean v4, p2, Lj0/o;->a:Z

    .line 47
    .line 48
    if-eq v3, v4, :cond_5

    .line 49
    .line 50
    if-eqz v3, :cond_2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_5
    iget v0, p2, Lj0/o;->b:I

    .line 54
    .line 55
    iget v1, p1, Lj0/o;->b:I

    .line 56
    .line 57
    sub-int/2addr v0, v1

    .line 58
    if-eqz v0, :cond_6

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_6
    iget p1, p1, Lj0/o;->c:I

    .line 62
    .line 63
    iget p2, p2, Lj0/o;->c:I

    .line 64
    .line 65
    sub-int/2addr p1, p2

    .line 66
    if-eqz p1, :cond_7

    .line 67
    .line 68
    move v2, p1

    .line 69
    :cond_7
    :goto_3
    return v2

    .line 70
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 71
    .line 72
    check-cast p2, Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    return p1

    .line 79
    :pswitch_2
    check-cast p1, Landroid/view/View;

    .line 80
    .line 81
    check-cast p2, Landroid/view/View;

    .line 82
    .line 83
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    sub-int/2addr p1, p2

    .line 92
    return p1

    .line 93
    :pswitch_3
    check-cast p1, Landroid/view/View;

    .line 94
    .line 95
    check-cast p2, Landroid/view/View;

    .line 96
    .line 97
    sget-object v3, LN/Q;->a:Ljava/util/WeakHashMap;

    .line 98
    .line 99
    invoke-static {p1}, LN/F;->m(Landroid/view/View;)F

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    invoke-static {p2}, LN/F;->m(Landroid/view/View;)F

    .line 104
    .line 105
    .line 106
    move-result p2

    .line 107
    cmpl-float v3, p1, p2

    .line 108
    .line 109
    if-lez v3, :cond_8

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_8
    cmpg-float p1, p1, p2

    .line 113
    .line 114
    if-gez p1, :cond_9

    .line 115
    .line 116
    const/4 v0, 0x1

    .line 117
    goto :goto_4

    .line 118
    :cond_9
    const/4 v0, 0x0

    .line 119
    :goto_4
    return v0

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
