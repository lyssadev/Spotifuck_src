.class public final Landroidx/fragment/app/M;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LE/j;

.field public final b:LA/k;

.field public final c:Landroidx/fragment/app/r;

.field public d:Z

.field public e:I


# direct methods
.method public constructor <init>(LE/j;LA/k;Landroidx/fragment/app/r;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/M;->d:Z

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Landroidx/fragment/app/M;->e:I

    .line 4
    iput-object p1, p0, Landroidx/fragment/app/M;->a:LE/j;

    .line 5
    iput-object p2, p0, Landroidx/fragment/app/M;->b:LA/k;

    .line 6
    iput-object p3, p0, Landroidx/fragment/app/M;->c:Landroidx/fragment/app/r;

    return-void
.end method

.method public constructor <init>(LE/j;LA/k;Landroidx/fragment/app/r;Landroidx/fragment/app/L;)V
    .locals 2

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 34
    iput-boolean v0, p0, Landroidx/fragment/app/M;->d:Z

    const/4 v1, -0x1

    .line 35
    iput v1, p0, Landroidx/fragment/app/M;->e:I

    .line 36
    iput-object p1, p0, Landroidx/fragment/app/M;->a:LE/j;

    .line 37
    iput-object p2, p0, Landroidx/fragment/app/M;->b:LA/k;

    .line 38
    iput-object p3, p0, Landroidx/fragment/app/M;->c:Landroidx/fragment/app/r;

    const/4 p1, 0x0

    .line 39
    iput-object p1, p3, Landroidx/fragment/app/r;->h:Landroid/util/SparseArray;

    .line 40
    iput-object p1, p3, Landroidx/fragment/app/r;->i:Landroid/os/Bundle;

    .line 41
    iput v0, p3, Landroidx/fragment/app/r;->v:I

    .line 42
    iput-boolean v0, p3, Landroidx/fragment/app/r;->s:Z

    .line 43
    iput-boolean v0, p3, Landroidx/fragment/app/r;->p:Z

    .line 44
    iget-object p2, p3, Landroidx/fragment/app/r;->l:Landroidx/fragment/app/r;

    if-eqz p2, :cond_0

    iget-object p2, p2, Landroidx/fragment/app/r;->j:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    iput-object p2, p3, Landroidx/fragment/app/r;->m:Ljava/lang/String;

    .line 45
    iput-object p1, p3, Landroidx/fragment/app/r;->l:Landroidx/fragment/app/r;

    .line 46
    iget-object p1, p4, Landroidx/fragment/app/L;->m:Landroid/os/Bundle;

    if-eqz p1, :cond_1

    .line 47
    iput-object p1, p3, Landroidx/fragment/app/r;->g:Landroid/os/Bundle;

    goto :goto_1

    .line 48
    :cond_1
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    iput-object p1, p3, Landroidx/fragment/app/r;->g:Landroid/os/Bundle;

    :goto_1
    return-void
.end method

.method public constructor <init>(LE/j;LA/k;Ljava/lang/ClassLoader;Landroidx/fragment/app/B;Landroidx/fragment/app/L;)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Landroidx/fragment/app/M;->d:Z

    const/4 v0, -0x1

    .line 9
    iput v0, p0, Landroidx/fragment/app/M;->e:I

    .line 10
    iput-object p1, p0, Landroidx/fragment/app/M;->a:LE/j;

    .line 11
    iput-object p2, p0, Landroidx/fragment/app/M;->b:LA/k;

    .line 12
    iget-object p1, p5, Landroidx/fragment/app/L;->a:Ljava/lang/String;

    invoke-virtual {p4, p1}, Landroidx/fragment/app/B;->a(Ljava/lang/String;)Landroidx/fragment/app/r;

    move-result-object p1

    .line 13
    iget-object p2, p5, Landroidx/fragment/app/L;->j:Landroid/os/Bundle;

    if-eqz p2, :cond_0

    .line 14
    invoke-virtual {p2, p3}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 15
    :cond_0
    invoke-virtual {p1, p2}, Landroidx/fragment/app/r;->I(Landroid/os/Bundle;)V

    .line 16
    iget-object p2, p5, Landroidx/fragment/app/L;->b:Ljava/lang/String;

    iput-object p2, p1, Landroidx/fragment/app/r;->j:Ljava/lang/String;

    .line 17
    iget-boolean p2, p5, Landroidx/fragment/app/L;->c:Z

    iput-boolean p2, p1, Landroidx/fragment/app/r;->r:Z

    const/4 p2, 0x1

    .line 18
    iput-boolean p2, p1, Landroidx/fragment/app/r;->t:Z

    .line 19
    iget p2, p5, Landroidx/fragment/app/L;->d:I

    iput p2, p1, Landroidx/fragment/app/r;->A:I

    .line 20
    iget p2, p5, Landroidx/fragment/app/L;->e:I

    iput p2, p1, Landroidx/fragment/app/r;->B:I

    .line 21
    iget-object p2, p5, Landroidx/fragment/app/L;->f:Ljava/lang/String;

    iput-object p2, p1, Landroidx/fragment/app/r;->C:Ljava/lang/String;

    .line 22
    iget-boolean p2, p5, Landroidx/fragment/app/L;->g:Z

    iput-boolean p2, p1, Landroidx/fragment/app/r;->F:Z

    .line 23
    iget-boolean p2, p5, Landroidx/fragment/app/L;->h:Z

    iput-boolean p2, p1, Landroidx/fragment/app/r;->q:Z

    .line 24
    iget-boolean p2, p5, Landroidx/fragment/app/L;->i:Z

    iput-boolean p2, p1, Landroidx/fragment/app/r;->E:Z

    .line 25
    iget-boolean p2, p5, Landroidx/fragment/app/L;->k:Z

    iput-boolean p2, p1, Landroidx/fragment/app/r;->D:Z

    .line 26
    invoke-static {}, Landroidx/lifecycle/m;->values()[Landroidx/lifecycle/m;

    move-result-object p2

    iget p3, p5, Landroidx/fragment/app/L;->l:I

    aget-object p2, p2, p3

    iput-object p2, p1, Landroidx/fragment/app/r;->R:Landroidx/lifecycle/m;

    .line 27
    iget-object p2, p5, Landroidx/fragment/app/L;->m:Landroid/os/Bundle;

    if-eqz p2, :cond_1

    .line 28
    iput-object p2, p1, Landroidx/fragment/app/r;->g:Landroid/os/Bundle;

    goto :goto_0

    .line 29
    :cond_1
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    iput-object p2, p1, Landroidx/fragment/app/r;->g:Landroid/os/Bundle;

    .line 30
    :goto_0
    iput-object p1, p0, Landroidx/fragment/app/M;->c:Landroidx/fragment/app/r;

    .line 31
    const-string p2, "FragmentManager"

    const/4 p3, 0x2

    invoke-static {p2, p3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 32
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_2
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    const-string v0, "FragmentManager"

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    iget-object v3, p0, Landroidx/fragment/app/M;->c:Landroidx/fragment/app/r;

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v2, v3, Landroidx/fragment/app/r;->g:Landroid/os/Bundle;

    .line 16
    .line 17
    iget-object v2, v3, Landroidx/fragment/app/r;->y:Landroidx/fragment/app/H;

    .line 18
    .line 19
    invoke-virtual {v2}, Landroidx/fragment/app/H;->K()V

    .line 20
    .line 21
    .line 22
    iput v1, v3, Landroidx/fragment/app/r;->f:I

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    iput-boolean v2, v3, Landroidx/fragment/app/r;->H:Z

    .line 26
    .line 27
    invoke-virtual {v3}, Landroidx/fragment/app/r;->r()V

    .line 28
    .line 29
    .line 30
    iget-boolean v4, v3, Landroidx/fragment/app/r;->H:Z

    .line 31
    .line 32
    const-string v5, "Fragment "

    .line 33
    .line 34
    if-eqz v4, :cond_6

    .line 35
    .line 36
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    invoke-virtual {v3}, Landroidx/fragment/app/r;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    :cond_1
    iget-object v0, v3, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    if-eqz v0, :cond_5

    .line 49
    .line 50
    iget-object v4, v3, Landroidx/fragment/app/r;->g:Landroid/os/Bundle;

    .line 51
    .line 52
    iget-object v6, v3, Landroidx/fragment/app/r;->h:Landroid/util/SparseArray;

    .line 53
    .line 54
    if-eqz v6, :cond_2

    .line 55
    .line 56
    invoke-virtual {v0, v6}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    .line 57
    .line 58
    .line 59
    iput-object v1, v3, Landroidx/fragment/app/r;->h:Landroid/util/SparseArray;

    .line 60
    .line 61
    :cond_2
    iget-object v0, v3, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 62
    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    iget-object v0, v3, Landroidx/fragment/app/r;->T:Landroidx/fragment/app/O;

    .line 66
    .line 67
    iget-object v6, v3, Landroidx/fragment/app/r;->i:Landroid/os/Bundle;

    .line 68
    .line 69
    iget-object v0, v0, Landroidx/fragment/app/O;->i:Lk0/d;

    .line 70
    .line 71
    invoke-virtual {v0, v6}, Lk0/d;->b(Landroid/os/Bundle;)V

    .line 72
    .line 73
    .line 74
    iput-object v1, v3, Landroidx/fragment/app/r;->i:Landroid/os/Bundle;

    .line 75
    .line 76
    :cond_3
    iput-boolean v2, v3, Landroidx/fragment/app/r;->H:Z

    .line 77
    .line 78
    invoke-virtual {v3, v4}, Landroidx/fragment/app/r;->C(Landroid/os/Bundle;)V

    .line 79
    .line 80
    .line 81
    iget-boolean v0, v3, Landroidx/fragment/app/r;->H:Z

    .line 82
    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    iget-object v0, v3, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 86
    .line 87
    if-eqz v0, :cond_5

    .line 88
    .line 89
    iget-object v0, v3, Landroidx/fragment/app/r;->T:Landroidx/fragment/app/O;

    .line 90
    .line 91
    sget-object v4, Landroidx/lifecycle/l;->ON_CREATE:Landroidx/lifecycle/l;

    .line 92
    .line 93
    invoke-virtual {v0, v4}, Landroidx/fragment/app/O;->e(Landroidx/lifecycle/l;)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_4
    new-instance v0, Landroidx/fragment/app/T;

    .line 98
    .line 99
    new-instance v1, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v2, " did not call through to super.onViewStateRestored()"

    .line 108
    .line 109
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw v0

    .line 120
    :cond_5
    :goto_0
    iput-object v1, v3, Landroidx/fragment/app/r;->g:Landroid/os/Bundle;

    .line 121
    .line 122
    iget-object v0, v3, Landroidx/fragment/app/r;->y:Landroidx/fragment/app/H;

    .line 123
    .line 124
    iput-boolean v2, v0, Landroidx/fragment/app/H;->E:Z

    .line 125
    .line 126
    iput-boolean v2, v0, Landroidx/fragment/app/H;->F:Z

    .line 127
    .line 128
    iget-object v1, v0, Landroidx/fragment/app/H;->L:Landroidx/fragment/app/J;

    .line 129
    .line 130
    iput-boolean v2, v1, Landroidx/fragment/app/J;->h:Z

    .line 131
    .line 132
    const/4 v1, 0x4

    .line 133
    invoke-virtual {v0, v1}, Landroidx/fragment/app/H;->t(I)V

    .line 134
    .line 135
    .line 136
    iget-object v0, p0, Landroidx/fragment/app/M;->a:LE/j;

    .line 137
    .line 138
    invoke-virtual {v0, v2}, LE/j;->d(Z)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_6
    new-instance v0, Landroidx/fragment/app/T;

    .line 143
    .line 144
    new-instance v1, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v2, " did not call through to super.onActivityCreated()"

    .line 153
    .line 154
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw v0
.end method

.method public final b()V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/M;->b:LA/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/fragment/app/M;->c:Landroidx/fragment/app/r;

    .line 7
    .line 8
    iget-object v2, v1, Landroidx/fragment/app/r;->I:Landroid/view/ViewGroup;

    .line 9
    .line 10
    const/4 v3, -0x1

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    iget-object v0, v0, LA/k;->h:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    add-int/lit8 v5, v4, -0x1

    .line 23
    .line 24
    :goto_0
    if-ltz v5, :cond_2

    .line 25
    .line 26
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    check-cast v6, Landroidx/fragment/app/r;

    .line 31
    .line 32
    iget-object v7, v6, Landroidx/fragment/app/r;->I:Landroid/view/ViewGroup;

    .line 33
    .line 34
    if-ne v7, v2, :cond_1

    .line 35
    .line 36
    iget-object v6, v6, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 37
    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    add-int/lit8 v3, v0, 0x1

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_1
    add-int/lit8 v5, v5, -0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-ge v4, v5, :cond_4

    .line 57
    .line 58
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    check-cast v5, Landroidx/fragment/app/r;

    .line 63
    .line 64
    iget-object v6, v5, Landroidx/fragment/app/r;->I:Landroid/view/ViewGroup;

    .line 65
    .line 66
    if-ne v6, v2, :cond_3

    .line 67
    .line 68
    iget-object v5, v5, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 69
    .line 70
    if-eqz v5, :cond_3

    .line 71
    .line 72
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    goto :goto_2

    .line 77
    :cond_3
    goto :goto_1

    .line 78
    :cond_4
    :goto_2
    iget-object v0, v1, Landroidx/fragment/app/r;->I:Landroid/view/ViewGroup;

    .line 79
    .line 80
    iget-object v1, v1, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 81
    .line 82
    invoke-virtual {v0, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public final c()V
    .locals 7

    .line 1
    const-string v0, "FragmentManager"

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget-object v1, p0, Landroidx/fragment/app/M;->c:Landroidx/fragment/app/r;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/r;->l:Landroidx/fragment/app/r;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const-string v3, " that does not belong to this FragmentManager!"

    .line 19
    .line 20
    const-string v4, " declared target fragment "

    .line 21
    .line 22
    iget-object v5, p0, Landroidx/fragment/app/M;->b:LA/k;

    .line 23
    .line 24
    const-string v6, "Fragment "

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    iget-object v0, v0, Landroidx/fragment/app/r;->j:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v5, v5, LA/k;->f:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v5, Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-virtual {v5, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Landroidx/fragment/app/M;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    iget-object v3, v1, Landroidx/fragment/app/r;->l:Landroidx/fragment/app/r;

    .line 43
    .line 44
    iget-object v3, v3, Landroidx/fragment/app/r;->j:Ljava/lang/String;

    .line 45
    .line 46
    iput-object v3, v1, Landroidx/fragment/app/r;->m:Ljava/lang/String;

    .line 47
    .line 48
    iput-object v2, v1, Landroidx/fragment/app/r;->l:Landroidx/fragment/app/r;

    .line 49
    .line 50
    move-object v2, v0

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    new-instance v2, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget-object v1, v1, Landroidx/fragment/app/r;->l:Landroidx/fragment/app/r;

    .line 66
    .line 67
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v0

    .line 81
    :cond_2
    iget-object v0, v1, Landroidx/fragment/app/r;->m:Ljava/lang/String;

    .line 82
    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    iget-object v2, v5, LA/k;->f:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v2, Ljava/util/HashMap;

    .line 88
    .line 89
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    move-object v2, v0

    .line 94
    check-cast v2, Landroidx/fragment/app/M;

    .line 95
    .line 96
    if-eqz v2, :cond_3

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 100
    .line 101
    new-instance v2, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    iget-object v1, v1, Landroidx/fragment/app/r;->m:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw v0

    .line 128
    :cond_4
    :goto_0
    if-eqz v2, :cond_5

    .line 129
    .line 130
    invoke-virtual {v2}, Landroidx/fragment/app/M;->k()V

    .line 131
    .line 132
    .line 133
    :cond_5
    iget-object v0, v1, Landroidx/fragment/app/r;->w:Landroidx/fragment/app/H;

    .line 134
    .line 135
    iget-object v2, v0, Landroidx/fragment/app/H;->t:Landroidx/fragment/app/t;

    .line 136
    .line 137
    iput-object v2, v1, Landroidx/fragment/app/r;->x:Landroidx/fragment/app/t;

    .line 138
    .line 139
    iget-object v0, v0, Landroidx/fragment/app/H;->v:Landroidx/fragment/app/r;

    .line 140
    .line 141
    iput-object v0, v1, Landroidx/fragment/app/r;->z:Landroidx/fragment/app/r;

    .line 142
    .line 143
    iget-object v0, p0, Landroidx/fragment/app/M;->a:LE/j;

    .line 144
    .line 145
    const/4 v2, 0x0

    .line 146
    invoke-virtual {v0, v2}, LE/j;->k(Z)V

    .line 147
    .line 148
    .line 149
    iget-object v3, v1, Landroidx/fragment/app/r;->W:Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    if-eqz v5, :cond_6

    .line 160
    .line 161
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    check-cast v5, Landroidx/fragment/app/n;

    .line 166
    .line 167
    invoke-virtual {v5}, Landroidx/fragment/app/n;->a()V

    .line 168
    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_6
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 172
    .line 173
    .line 174
    iget-object v3, v1, Landroidx/fragment/app/r;->y:Landroidx/fragment/app/H;

    .line 175
    .line 176
    iget-object v4, v1, Landroidx/fragment/app/r;->x:Landroidx/fragment/app/t;

    .line 177
    .line 178
    invoke-virtual {v1}, Landroidx/fragment/app/r;->e()Landroidx/fragment/app/v;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    invoke-virtual {v3, v4, v5, v1}, Landroidx/fragment/app/H;->b(Landroidx/fragment/app/t;Landroidx/fragment/app/v;Landroidx/fragment/app/r;)V

    .line 183
    .line 184
    .line 185
    iput v2, v1, Landroidx/fragment/app/r;->f:I

    .line 186
    .line 187
    iput-boolean v2, v1, Landroidx/fragment/app/r;->H:Z

    .line 188
    .line 189
    iget-object v3, v1, Landroidx/fragment/app/r;->x:Landroidx/fragment/app/t;

    .line 190
    .line 191
    iget-object v3, v3, Landroidx/fragment/app/t;->g:Lh/l;

    .line 192
    .line 193
    invoke-virtual {v1, v3}, Landroidx/fragment/app/r;->s(Lh/l;)V

    .line 194
    .line 195
    .line 196
    iget-boolean v3, v1, Landroidx/fragment/app/r;->H:Z

    .line 197
    .line 198
    if-eqz v3, :cond_8

    .line 199
    .line 200
    iget-object v3, v1, Landroidx/fragment/app/r;->w:Landroidx/fragment/app/H;

    .line 201
    .line 202
    iget-object v3, v3, Landroidx/fragment/app/H;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 203
    .line 204
    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    if-eqz v4, :cond_7

    .line 213
    .line 214
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    check-cast v4, Landroidx/fragment/app/K;

    .line 219
    .line 220
    invoke-interface {v4}, Landroidx/fragment/app/K;->a()V

    .line 221
    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_7
    iget-object v1, v1, Landroidx/fragment/app/r;->y:Landroidx/fragment/app/H;

    .line 225
    .line 226
    iput-boolean v2, v1, Landroidx/fragment/app/H;->E:Z

    .line 227
    .line 228
    iput-boolean v2, v1, Landroidx/fragment/app/H;->F:Z

    .line 229
    .line 230
    iget-object v3, v1, Landroidx/fragment/app/H;->L:Landroidx/fragment/app/J;

    .line 231
    .line 232
    iput-boolean v2, v3, Landroidx/fragment/app/J;->h:Z

    .line 233
    .line 234
    invoke-virtual {v1, v2}, Landroidx/fragment/app/H;->t(I)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0, v2}, LE/j;->e(Z)V

    .line 238
    .line 239
    .line 240
    return-void

    .line 241
    :cond_8
    new-instance v0, Landroidx/fragment/app/T;

    .line 242
    .line 243
    new-instance v2, Ljava/lang/StringBuilder;

    .line 244
    .line 245
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    const-string v1, " did not call through to super.onAttach()"

    .line 252
    .line 253
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    throw v0
.end method

.method public final d()I
    .locals 12

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/M;->c:Landroidx/fragment/app/r;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/fragment/app/r;->w:Landroidx/fragment/app/H;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget v0, v0, Landroidx/fragment/app/r;->f:I

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    iget v1, p0, Landroidx/fragment/app/M;->e:I

    .line 11
    .line 12
    iget-object v2, v0, Landroidx/fragment/app/r;->R:Landroidx/lifecycle/m;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x1

    .line 19
    const/4 v4, 0x2

    .line 20
    const/4 v5, 0x3

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v7, 0x5

    .line 23
    const/4 v8, -0x1

    .line 24
    const/4 v9, 0x4

    .line 25
    if-eq v2, v3, :cond_3

    .line 26
    .line 27
    if-eq v2, v4, :cond_2

    .line 28
    .line 29
    if-eq v2, v5, :cond_1

    .line 30
    .line 31
    if-eq v2, v9, :cond_4

    .line 32
    .line 33
    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    goto :goto_0

    .line 48
    :cond_3
    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    :cond_4
    :goto_0
    iget-boolean v2, v0, Landroidx/fragment/app/r;->r:Z

    .line 53
    .line 54
    if-eqz v2, :cond_7

    .line 55
    .line 56
    iget-boolean v2, v0, Landroidx/fragment/app/r;->s:Z

    .line 57
    .line 58
    if-eqz v2, :cond_5

    .line 59
    .line 60
    iget v1, p0, Landroidx/fragment/app/M;->e:I

    .line 61
    .line 62
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    iget-object v2, v0, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 67
    .line 68
    if-eqz v2, :cond_7

    .line 69
    .line 70
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    if-nez v2, :cond_7

    .line 75
    .line 76
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    goto :goto_1

    .line 81
    :cond_5
    iget v2, p0, Landroidx/fragment/app/M;->e:I

    .line 82
    .line 83
    if-ge v2, v9, :cond_6

    .line 84
    .line 85
    iget v2, v0, Landroidx/fragment/app/r;->f:I

    .line 86
    .line 87
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    goto :goto_1

    .line 92
    :cond_6
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    :cond_7
    :goto_1
    iget-boolean v2, v0, Landroidx/fragment/app/r;->p:Z

    .line 97
    .line 98
    if-nez v2, :cond_8

    .line 99
    .line 100
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    :cond_8
    iget-object v2, v0, Landroidx/fragment/app/r;->I:Landroid/view/ViewGroup;

    .line 105
    .line 106
    if-eqz v2, :cond_d

    .line 107
    .line 108
    invoke-virtual {v0}, Landroidx/fragment/app/r;->j()Landroidx/fragment/app/H;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    invoke-virtual {v10}, Landroidx/fragment/app/H;->D()LK0/e;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    invoke-static {v2, v10}, Landroidx/fragment/app/i;->f(Landroid/view/ViewGroup;LK0/e;)Landroidx/fragment/app/i;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v0}, Landroidx/fragment/app/i;->d(Landroidx/fragment/app/r;)Landroidx/fragment/app/S;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    if-eqz v10, :cond_9

    .line 128
    .line 129
    iget v6, v10, Landroidx/fragment/app/S;->b:I

    .line 130
    .line 131
    :cond_9
    iget-object v2, v2, Landroidx/fragment/app/i;->c:Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    :cond_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v10

    .line 141
    if-eqz v10, :cond_b

    .line 142
    .line 143
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v10

    .line 147
    check-cast v10, Landroidx/fragment/app/S;

    .line 148
    .line 149
    iget-object v11, v10, Landroidx/fragment/app/S;->c:Landroidx/fragment/app/r;

    .line 150
    .line 151
    invoke-virtual {v11, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v11

    .line 155
    if-eqz v11, :cond_a

    .line 156
    .line 157
    iget-boolean v11, v10, Landroidx/fragment/app/S;->f:Z

    .line 158
    .line 159
    if-nez v11, :cond_a

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_b
    const/4 v10, 0x0

    .line 163
    :goto_2
    if-eqz v10, :cond_d

    .line 164
    .line 165
    if-eqz v6, :cond_c

    .line 166
    .line 167
    if-ne v6, v3, :cond_d

    .line 168
    .line 169
    :cond_c
    iget v2, v10, Landroidx/fragment/app/S;->b:I

    .line 170
    .line 171
    move v6, v2

    .line 172
    :cond_d
    if-ne v6, v4, :cond_e

    .line 173
    .line 174
    const/4 v2, 0x6

    .line 175
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    goto :goto_3

    .line 180
    :cond_e
    if-ne v6, v5, :cond_f

    .line 181
    .line 182
    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    goto :goto_3

    .line 187
    :cond_f
    iget-boolean v2, v0, Landroidx/fragment/app/r;->q:Z

    .line 188
    .line 189
    if-eqz v2, :cond_11

    .line 190
    .line 191
    invoke-virtual {v0}, Landroidx/fragment/app/r;->q()Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    if-eqz v2, :cond_10

    .line 196
    .line 197
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    goto :goto_3

    .line 202
    :cond_10
    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    :cond_11
    :goto_3
    iget-boolean v2, v0, Landroidx/fragment/app/r;->K:Z

    .line 207
    .line 208
    if-eqz v2, :cond_12

    .line 209
    .line 210
    iget v2, v0, Landroidx/fragment/app/r;->f:I

    .line 211
    .line 212
    if-ge v2, v7, :cond_12

    .line 213
    .line 214
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    :cond_12
    const-string v2, "FragmentManager"

    .line 219
    .line 220
    invoke-static {v2, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    if-eqz v2, :cond_13

    .line 225
    .line 226
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    :cond_13
    return v1
.end method

.method public final e()V
    .locals 7

    .line 1
    const-string v0, "FragmentManager"

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget-object v1, p0, Landroidx/fragment/app/M;->c:Landroidx/fragment/app/r;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-boolean v0, v1, Landroidx/fragment/app/r;->P:Z

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x1

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    iget-object v0, p0, Landroidx/fragment/app/M;->a:LE/j;

    .line 22
    .line 23
    invoke-virtual {v0, v2}, LE/j;->n(Z)V

    .line 24
    .line 25
    .line 26
    iget-object v4, v1, Landroidx/fragment/app/r;->g:Landroid/os/Bundle;

    .line 27
    .line 28
    iget-object v5, v1, Landroidx/fragment/app/r;->y:Landroidx/fragment/app/H;

    .line 29
    .line 30
    invoke-virtual {v5}, Landroidx/fragment/app/H;->K()V

    .line 31
    .line 32
    .line 33
    iput v3, v1, Landroidx/fragment/app/r;->f:I

    .line 34
    .line 35
    iput-boolean v2, v1, Landroidx/fragment/app/r;->H:Z

    .line 36
    .line 37
    iget-object v5, v1, Landroidx/fragment/app/r;->S:Landroidx/lifecycle/t;

    .line 38
    .line 39
    new-instance v6, Landroidx/fragment/app/Fragment$6;

    .line 40
    .line 41
    invoke-direct {v6, v1}, Landroidx/fragment/app/Fragment$6;-><init>(Landroidx/fragment/app/r;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v5, v6}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/q;)V

    .line 45
    .line 46
    .line 47
    iget-object v5, v1, Landroidx/fragment/app/r;->V:Lk0/d;

    .line 48
    .line 49
    invoke-virtual {v5, v4}, Lk0/d;->b(Landroid/os/Bundle;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v4}, Landroidx/fragment/app/r;->t(Landroid/os/Bundle;)V

    .line 53
    .line 54
    .line 55
    iput-boolean v3, v1, Landroidx/fragment/app/r;->P:Z

    .line 56
    .line 57
    iget-boolean v3, v1, Landroidx/fragment/app/r;->H:Z

    .line 58
    .line 59
    if-eqz v3, :cond_1

    .line 60
    .line 61
    iget-object v1, v1, Landroidx/fragment/app/r;->S:Landroidx/lifecycle/t;

    .line 62
    .line 63
    sget-object v3, Landroidx/lifecycle/l;->ON_CREATE:Landroidx/lifecycle/l;

    .line 64
    .line 65
    invoke-virtual {v1, v3}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v2}, LE/j;->f(Z)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    new-instance v0, Landroidx/fragment/app/T;

    .line 73
    .line 74
    new-instance v2, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-string v3, "Fragment "

    .line 77
    .line 78
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v1, " did not call through to super.onCreate()"

    .line 85
    .line 86
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw v0

    .line 97
    :cond_2
    iget-object v0, v1, Landroidx/fragment/app/r;->g:Landroid/os/Bundle;

    .line 98
    .line 99
    if-eqz v0, :cond_3

    .line 100
    .line 101
    const-string v4, "android:support:fragments"

    .line 102
    .line 103
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    if-eqz v0, :cond_3

    .line 108
    .line 109
    iget-object v4, v1, Landroidx/fragment/app/r;->y:Landroidx/fragment/app/H;

    .line 110
    .line 111
    invoke-virtual {v4, v0}, Landroidx/fragment/app/H;->Q(Landroid/os/Parcelable;)V

    .line 112
    .line 113
    .line 114
    iget-object v0, v1, Landroidx/fragment/app/r;->y:Landroidx/fragment/app/H;

    .line 115
    .line 116
    iput-boolean v2, v0, Landroidx/fragment/app/H;->E:Z

    .line 117
    .line 118
    iput-boolean v2, v0, Landroidx/fragment/app/H;->F:Z

    .line 119
    .line 120
    iget-object v4, v0, Landroidx/fragment/app/H;->L:Landroidx/fragment/app/J;

    .line 121
    .line 122
    iput-boolean v2, v4, Landroidx/fragment/app/J;->h:Z

    .line 123
    .line 124
    invoke-virtual {v0, v3}, Landroidx/fragment/app/H;->t(I)V

    .line 125
    .line 126
    .line 127
    :cond_3
    iput v3, v1, Landroidx/fragment/app/r;->f:I

    .line 128
    .line 129
    :goto_0
    return-void
.end method

.method public final f()V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/M;->c:Landroidx/fragment/app/r;

    .line 2
    .line 3
    iget-boolean v1, v0, Landroidx/fragment/app/r;->r:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v1, 0x3

    .line 9
    const-string v2, "FragmentManager"

    .line 10
    .line 11
    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    :cond_1
    iget-object v1, v0, Landroidx/fragment/app/r;->g:Landroid/os/Bundle;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroidx/fragment/app/r;->x(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iput-object v1, v0, Landroidx/fragment/app/r;->O:Landroid/view/LayoutInflater;

    .line 27
    .line 28
    iget-object v3, v0, Landroidx/fragment/app/r;->I:Landroid/view/ViewGroup;

    .line 29
    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    goto/16 :goto_1

    .line 33
    .line 34
    :cond_2
    iget v3, v0, Landroidx/fragment/app/r;->B:I

    .line 35
    .line 36
    if-eqz v3, :cond_6

    .line 37
    .line 38
    const/4 v4, -0x1

    .line 39
    if-eq v3, v4, :cond_5

    .line 40
    .line 41
    iget-object v4, v0, Landroidx/fragment/app/r;->w:Landroidx/fragment/app/H;

    .line 42
    .line 43
    iget-object v4, v4, Landroidx/fragment/app/H;->u:Landroidx/fragment/app/v;

    .line 44
    .line 45
    invoke-virtual {v4, v3}, Landroidx/fragment/app/v;->e(I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, Landroid/view/ViewGroup;

    .line 50
    .line 51
    if-nez v3, :cond_4

    .line 52
    .line 53
    iget-boolean v4, v0, Landroidx/fragment/app/r;->t:Z

    .line 54
    .line 55
    if-eqz v4, :cond_3

    .line 56
    .line 57
    goto/16 :goto_1

    .line 58
    .line 59
    :cond_3
    :try_start_0
    invoke-virtual {v0}, Landroidx/fragment/app/r;->k()Landroid/content/res/Resources;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iget v2, v0, Landroidx/fragment/app/r;->B:I

    .line 64
    .line 65
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    goto :goto_0

    .line 70
    :catch_0
    const-string v1, "unknown"

    .line 71
    .line 72
    :goto_0
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 73
    .line 74
    new-instance v3, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-string v4, "No view found for id 0x"

    .line 77
    .line 78
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget v4, v0, Landroidx/fragment/app/r;->B:I

    .line 82
    .line 83
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v4, " ("

    .line 91
    .line 92
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v1, ") for fragment "

    .line 99
    .line 100
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw v2

    .line 114
    :cond_4
    instance-of v4, v3, Landroidx/fragment/app/FragmentContainerView;

    .line 115
    .line 116
    if-nez v4, :cond_7

    .line 117
    .line 118
    sget-object v4, LZ/d;->a:LZ/c;

    .line 119
    .line 120
    new-instance v4, LZ/a;

    .line 121
    .line 122
    new-instance v5, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    const-string v6, "Attempting to add fragment "

    .line 125
    .line 126
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string v6, " to container "

    .line 133
    .line 134
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string v6, " which is not a FragmentContainerView"

    .line 141
    .line 142
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    invoke-direct {v4, v0, v5}, LZ/f;-><init>(Landroidx/fragment/app/r;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-static {v4}, LZ/d;->b(LZ/f;)V

    .line 153
    .line 154
    .line 155
    invoke-static {v0}, LZ/d;->a(Landroidx/fragment/app/r;)LZ/c;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 164
    .line 165
    new-instance v2, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    const-string v3, "Cannot create fragment "

    .line 168
    .line 169
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    const-string v0, " for a container view with no id"

    .line 176
    .line 177
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    throw v1

    .line 188
    :cond_6
    const/4 v3, 0x0

    .line 189
    :cond_7
    :goto_1
    iput-object v3, v0, Landroidx/fragment/app/r;->I:Landroid/view/ViewGroup;

    .line 190
    .line 191
    iget-object v4, v0, Landroidx/fragment/app/r;->g:Landroid/os/Bundle;

    .line 192
    .line 193
    invoke-virtual {v0, v1, v3, v4}, Landroidx/fragment/app/r;->D(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 194
    .line 195
    .line 196
    iget-object v1, v0, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 197
    .line 198
    const/4 v4, 0x2

    .line 199
    if-eqz v1, :cond_c

    .line 200
    .line 201
    const/4 v5, 0x0

    .line 202
    invoke-virtual {v1, v5}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    .line 203
    .line 204
    .line 205
    iget-object v1, v0, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 206
    .line 207
    const v6, 0x7f0900d4

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1, v6, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    if-eqz v3, :cond_8

    .line 214
    .line 215
    invoke-virtual {p0}, Landroidx/fragment/app/M;->b()V

    .line 216
    .line 217
    .line 218
    :cond_8
    iget-boolean v1, v0, Landroidx/fragment/app/r;->D:Z

    .line 219
    .line 220
    if-eqz v1, :cond_9

    .line 221
    .line 222
    iget-object v1, v0, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 223
    .line 224
    const/16 v3, 0x8

    .line 225
    .line 226
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 227
    .line 228
    .line 229
    :cond_9
    iget-object v1, v0, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 230
    .line 231
    sget-object v3, LN/Q;->a:Ljava/util/WeakHashMap;

    .line 232
    .line 233
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    if-eqz v1, :cond_a

    .line 238
    .line 239
    iget-object v1, v0, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 240
    .line 241
    invoke-static {v1}, LN/D;->c(Landroid/view/View;)V

    .line 242
    .line 243
    .line 244
    goto :goto_2

    .line 245
    :cond_a
    iget-object v1, v0, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 246
    .line 247
    new-instance v3, LN0/o;

    .line 248
    .line 249
    const/4 v6, 0x1

    .line 250
    invoke-direct {v3, v6, v1}, LN0/o;-><init>(ILjava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1, v3}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 254
    .line 255
    .line 256
    :goto_2
    iget-object v1, v0, Landroidx/fragment/app/r;->g:Landroid/os/Bundle;

    .line 257
    .line 258
    invoke-virtual {v0, v1}, Landroidx/fragment/app/r;->B(Landroid/os/Bundle;)V

    .line 259
    .line 260
    .line 261
    iget-object v1, v0, Landroidx/fragment/app/r;->y:Landroidx/fragment/app/H;

    .line 262
    .line 263
    invoke-virtual {v1, v4}, Landroidx/fragment/app/H;->t(I)V

    .line 264
    .line 265
    .line 266
    iget-object v1, p0, Landroidx/fragment/app/M;->a:LE/j;

    .line 267
    .line 268
    invoke-virtual {v1, v5}, LE/j;->s(Z)V

    .line 269
    .line 270
    .line 271
    iget-object v1, v0, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 272
    .line 273
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    iget-object v3, v0, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 278
    .line 279
    invoke-virtual {v3}, Landroid/view/View;->getAlpha()F

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    invoke-virtual {v0}, Landroidx/fragment/app/r;->f()Landroidx/fragment/app/p;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    iput v3, v5, Landroidx/fragment/app/p;->j:F

    .line 288
    .line 289
    iget-object v3, v0, Landroidx/fragment/app/r;->I:Landroid/view/ViewGroup;

    .line 290
    .line 291
    if-eqz v3, :cond_c

    .line 292
    .line 293
    if-nez v1, :cond_c

    .line 294
    .line 295
    iget-object v1, v0, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 296
    .line 297
    invoke-virtual {v1}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    if-eqz v1, :cond_b

    .line 302
    .line 303
    invoke-virtual {v0}, Landroidx/fragment/app/r;->f()Landroidx/fragment/app/p;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    iput-object v1, v3, Landroidx/fragment/app/p;->k:Landroid/view/View;

    .line 308
    .line 309
    invoke-static {v2, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 310
    .line 311
    .line 312
    move-result v2

    .line 313
    if-eqz v2, :cond_b

    .line 314
    .line 315
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    :cond_b
    iget-object v1, v0, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 322
    .line 323
    const/4 v2, 0x0

    .line 324
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 325
    .line 326
    .line 327
    :cond_c
    iput v4, v0, Landroidx/fragment/app/r;->f:I

    .line 328
    .line 329
    return-void
.end method

.method public final g()V
    .locals 10

    .line 1
    const-string v0, "FragmentManager"

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    iget-object v3, p0, Landroidx/fragment/app/M;->c:Landroidx/fragment/app/r;

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-boolean v2, v3, Landroidx/fragment/app/r;->q:Z

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    const/4 v5, 0x0

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v3}, Landroidx/fragment/app/r;->q()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v2, 0x0

    .line 30
    :goto_0
    iget-object v6, p0, Landroidx/fragment/app/M;->b:LA/k;

    .line 31
    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    iget-object v7, v3, Landroidx/fragment/app/r;->j:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v8, v6, LA/k;->g:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v8, Ljava/util/HashMap;

    .line 39
    .line 40
    invoke-virtual {v8, v7}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    check-cast v7, Landroidx/fragment/app/L;

    .line 45
    .line 46
    :cond_2
    if-nez v2, :cond_7

    .line 47
    .line 48
    iget-object v7, v6, LA/k;->i:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v7, Landroidx/fragment/app/J;

    .line 51
    .line 52
    iget-object v8, v7, Landroidx/fragment/app/J;->c:Ljava/util/HashMap;

    .line 53
    .line 54
    iget-object v9, v3, Landroidx/fragment/app/r;->j:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v8, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    if-nez v8, :cond_4

    .line 61
    .line 62
    :cond_3
    const/4 v7, 0x1

    .line 63
    goto :goto_1

    .line 64
    :cond_4
    iget-boolean v8, v7, Landroidx/fragment/app/J;->f:Z

    .line 65
    .line 66
    if-eqz v8, :cond_3

    .line 67
    .line 68
    iget-boolean v7, v7, Landroidx/fragment/app/J;->g:Z

    .line 69
    .line 70
    :goto_1
    if-eqz v7, :cond_5

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_5
    iget-object v0, v3, Landroidx/fragment/app/r;->m:Ljava/lang/String;

    .line 74
    .line 75
    if-eqz v0, :cond_6

    .line 76
    .line 77
    invoke-virtual {v6, v0}, LA/k;->d(Ljava/lang/String;)Landroidx/fragment/app/r;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    if-eqz v0, :cond_6

    .line 82
    .line 83
    iget-boolean v1, v0, Landroidx/fragment/app/r;->F:Z

    .line 84
    .line 85
    if-eqz v1, :cond_6

    .line 86
    .line 87
    iput-object v0, v3, Landroidx/fragment/app/r;->l:Landroidx/fragment/app/r;

    .line 88
    .line 89
    :cond_6
    iput v5, v3, Landroidx/fragment/app/r;->f:I

    .line 90
    .line 91
    goto/16 :goto_6

    .line 92
    .line 93
    :cond_7
    :goto_2
    iget-object v7, v3, Landroidx/fragment/app/r;->x:Landroidx/fragment/app/t;

    .line 94
    .line 95
    instance-of v8, v7, Landroidx/lifecycle/Q;

    .line 96
    .line 97
    if-eqz v8, :cond_8

    .line 98
    .line 99
    iget-object v7, v6, LA/k;->i:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v7, Landroidx/fragment/app/J;

    .line 102
    .line 103
    iget-boolean v7, v7, Landroidx/fragment/app/J;->g:Z

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_8
    iget-object v7, v7, Landroidx/fragment/app/t;->g:Lh/l;

    .line 107
    .line 108
    instance-of v8, v7, Landroid/app/Activity;

    .line 109
    .line 110
    if-eqz v8, :cond_9

    .line 111
    .line 112
    invoke-virtual {v7}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    xor-int/2addr v7, v4

    .line 117
    goto :goto_3

    .line 118
    :cond_9
    const/4 v7, 0x1

    .line 119
    :goto_3
    if-eqz v2, :cond_a

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_a
    if-eqz v7, :cond_c

    .line 123
    .line 124
    :goto_4
    iget-object v2, v6, LA/k;->i:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v2, Landroidx/fragment/app/J;

    .line 127
    .line 128
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_b

    .line 136
    .line 137
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    :cond_b
    iget-object v0, v3, Landroidx/fragment/app/r;->j:Ljava/lang/String;

    .line 141
    .line 142
    invoke-virtual {v2, v0}, Landroidx/fragment/app/J;->c(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    :cond_c
    iget-object v0, v3, Landroidx/fragment/app/r;->y:Landroidx/fragment/app/H;

    .line 146
    .line 147
    invoke-virtual {v0}, Landroidx/fragment/app/H;->k()V

    .line 148
    .line 149
    .line 150
    iget-object v0, v3, Landroidx/fragment/app/r;->S:Landroidx/lifecycle/t;

    .line 151
    .line 152
    sget-object v1, Landroidx/lifecycle/l;->ON_DESTROY:Landroidx/lifecycle/l;

    .line 153
    .line 154
    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    .line 155
    .line 156
    .line 157
    iput v5, v3, Landroidx/fragment/app/r;->f:I

    .line 158
    .line 159
    iput-boolean v5, v3, Landroidx/fragment/app/r;->P:Z

    .line 160
    .line 161
    iput-boolean v4, v3, Landroidx/fragment/app/r;->H:Z

    .line 162
    .line 163
    iget-object v0, p0, Landroidx/fragment/app/M;->a:LE/j;

    .line 164
    .line 165
    invoke-virtual {v0, v5}, LE/j;->g(Z)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v6}, LA/k;->g()Ljava/util/ArrayList;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    :cond_d
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    if-eqz v1, :cond_e

    .line 181
    .line 182
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    check-cast v1, Landroidx/fragment/app/M;

    .line 187
    .line 188
    if-eqz v1, :cond_d

    .line 189
    .line 190
    iget-object v2, v3, Landroidx/fragment/app/r;->j:Ljava/lang/String;

    .line 191
    .line 192
    iget-object v1, v1, Landroidx/fragment/app/M;->c:Landroidx/fragment/app/r;

    .line 193
    .line 194
    iget-object v4, v1, Landroidx/fragment/app/r;->m:Ljava/lang/String;

    .line 195
    .line 196
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-eqz v2, :cond_d

    .line 201
    .line 202
    iput-object v3, v1, Landroidx/fragment/app/r;->l:Landroidx/fragment/app/r;

    .line 203
    .line 204
    const/4 v2, 0x0

    .line 205
    iput-object v2, v1, Landroidx/fragment/app/r;->m:Ljava/lang/String;

    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_e
    iget-object v0, v3, Landroidx/fragment/app/r;->m:Ljava/lang/String;

    .line 209
    .line 210
    if-eqz v0, :cond_f

    .line 211
    .line 212
    invoke-virtual {v6, v0}, LA/k;->d(Ljava/lang/String;)Landroidx/fragment/app/r;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    iput-object v0, v3, Landroidx/fragment/app/r;->l:Landroidx/fragment/app/r;

    .line 217
    .line 218
    :cond_f
    invoke-virtual {v6, p0}, LA/k;->l(Landroidx/fragment/app/M;)V

    .line 219
    .line 220
    .line 221
    :goto_6
    return-void
.end method

.method public final h()V
    .locals 6

    .line 1
    const-string v0, "FragmentManager"

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget-object v1, p0, Landroidx/fragment/app/M;->c:Landroidx/fragment/app/r;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/r;->I:Landroid/view/ViewGroup;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v2, v1, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-object v0, v1, Landroidx/fragment/app/r;->y:Landroidx/fragment/app/H;

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    invoke-virtual {v0, v2}, Landroidx/fragment/app/H;->t(I)V

    .line 30
    .line 31
    .line 32
    iget-object v0, v1, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    iget-object v0, v1, Landroidx/fragment/app/r;->T:Landroidx/fragment/app/O;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroidx/fragment/app/O;->d()Landroidx/lifecycle/t;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v0, v0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    .line 43
    .line 44
    sget-object v3, Landroidx/lifecycle/m;->c:Landroidx/lifecycle/m;

    .line 45
    .line 46
    invoke-virtual {v0, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-ltz v0, :cond_2

    .line 51
    .line 52
    iget-object v0, v1, Landroidx/fragment/app/r;->T:Landroidx/fragment/app/O;

    .line 53
    .line 54
    sget-object v3, Landroidx/lifecycle/l;->ON_DESTROY:Landroidx/lifecycle/l;

    .line 55
    .line 56
    invoke-virtual {v0, v3}, Landroidx/fragment/app/O;->e(Landroidx/lifecycle/l;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    iput v2, v1, Landroidx/fragment/app/r;->f:I

    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    iput-boolean v0, v1, Landroidx/fragment/app/r;->H:Z

    .line 63
    .line 64
    invoke-virtual {v1}, Landroidx/fragment/app/r;->v()V

    .line 65
    .line 66
    .line 67
    iget-boolean v2, v1, Landroidx/fragment/app/r;->H:Z

    .line 68
    .line 69
    if-eqz v2, :cond_5

    .line 70
    .line 71
    invoke-interface {v1}, Landroidx/lifecycle/Q;->c()Landroidx/lifecycle/P;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    new-instance v3, Landroid/support/v4/media/session/t;

    .line 76
    .line 77
    sget-object v4, Lc0/a;->d:LK0/e;

    .line 78
    .line 79
    invoke-direct {v3, v2, v4}, Landroid/support/v4/media/session/t;-><init>(Landroidx/lifecycle/P;Landroidx/lifecycle/O;)V

    .line 80
    .line 81
    .line 82
    const-class v2, Lc0/a;

    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    if-eqz v4, :cond_4

    .line 89
    .line 90
    const-string v5, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 91
    .line 92
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-virtual {v3, v4, v2}, Landroid/support/v4/media/session/t;->k(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/M;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    check-cast v2, Lc0/a;

    .line 101
    .line 102
    iget-object v2, v2, Lc0/a;->c:Lr/l;

    .line 103
    .line 104
    iget v3, v2, Lr/l;->c:I

    .line 105
    .line 106
    if-gtz v3, :cond_3

    .line 107
    .line 108
    iput-boolean v0, v1, Landroidx/fragment/app/r;->u:Z

    .line 109
    .line 110
    iget-object v2, p0, Landroidx/fragment/app/M;->a:LE/j;

    .line 111
    .line 112
    invoke-virtual {v2, v0}, LE/j;->t(Z)V

    .line 113
    .line 114
    .line 115
    const/4 v2, 0x0

    .line 116
    iput-object v2, v1, Landroidx/fragment/app/r;->I:Landroid/view/ViewGroup;

    .line 117
    .line 118
    iput-object v2, v1, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 119
    .line 120
    iput-object v2, v1, Landroidx/fragment/app/r;->T:Landroidx/fragment/app/O;

    .line 121
    .line 122
    iget-object v3, v1, Landroidx/fragment/app/r;->U:Landroidx/lifecycle/x;

    .line 123
    .line 124
    invoke-virtual {v3, v2}, Landroidx/lifecycle/x;->e(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    iput-boolean v0, v1, Landroidx/fragment/app/r;->s:Z

    .line 128
    .line 129
    return-void

    .line 130
    :cond_3
    iget-object v1, v2, Lr/l;->b:[Ljava/lang/Object;

    .line 131
    .line 132
    aget-object v0, v1, v0

    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    new-instance v0, Ljava/lang/ClassCastException;

    .line 138
    .line 139
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 140
    .line 141
    .line 142
    throw v0

    .line 143
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 144
    .line 145
    const-string v1, "Local and anonymous classes can not be ViewModels"

    .line 146
    .line 147
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw v0

    .line 151
    :cond_5
    new-instance v0, Landroidx/fragment/app/T;

    .line 152
    .line 153
    new-instance v2, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    const-string v3, "Fragment "

    .line 156
    .line 157
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    const-string v1, " did not call through to super.onDestroyView()"

    .line 164
    .line 165
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    throw v0
.end method

.method public final i()V
    .locals 8

    .line 1
    const-string v0, "FragmentManager"

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    iget-object v3, p0, Landroidx/fragment/app/M;->c:Landroidx/fragment/app/r;

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    :cond_0
    const/4 v2, -0x1

    .line 16
    iput v2, v3, Landroidx/fragment/app/r;->f:I

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    iput-boolean v4, v3, Landroidx/fragment/app/r;->H:Z

    .line 20
    .line 21
    invoke-virtual {v3}, Landroidx/fragment/app/r;->w()V

    .line 22
    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    iput-object v5, v3, Landroidx/fragment/app/r;->O:Landroid/view/LayoutInflater;

    .line 26
    .line 27
    iget-boolean v6, v3, Landroidx/fragment/app/r;->H:Z

    .line 28
    .line 29
    if-eqz v6, :cond_7

    .line 30
    .line 31
    iget-object v6, v3, Landroidx/fragment/app/r;->y:Landroidx/fragment/app/H;

    .line 32
    .line 33
    iget-boolean v7, v6, Landroidx/fragment/app/H;->G:Z

    .line 34
    .line 35
    if-nez v7, :cond_1

    .line 36
    .line 37
    invoke-virtual {v6}, Landroidx/fragment/app/H;->k()V

    .line 38
    .line 39
    .line 40
    new-instance v6, Landroidx/fragment/app/H;

    .line 41
    .line 42
    invoke-direct {v6}, Landroidx/fragment/app/H;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v6, v3, Landroidx/fragment/app/r;->y:Landroidx/fragment/app/H;

    .line 46
    .line 47
    :cond_1
    iget-object v6, p0, Landroidx/fragment/app/M;->a:LE/j;

    .line 48
    .line 49
    invoke-virtual {v6, v4}, LE/j;->i(Z)V

    .line 50
    .line 51
    .line 52
    iput v2, v3, Landroidx/fragment/app/r;->f:I

    .line 53
    .line 54
    iput-object v5, v3, Landroidx/fragment/app/r;->x:Landroidx/fragment/app/t;

    .line 55
    .line 56
    iput-object v5, v3, Landroidx/fragment/app/r;->z:Landroidx/fragment/app/r;

    .line 57
    .line 58
    iput-object v5, v3, Landroidx/fragment/app/r;->w:Landroidx/fragment/app/H;

    .line 59
    .line 60
    iget-boolean v2, v3, Landroidx/fragment/app/r;->q:Z

    .line 61
    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    invoke-virtual {v3}, Landroidx/fragment/app/r;->q()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-nez v2, :cond_2

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    iget-object v2, p0, Landroidx/fragment/app/M;->b:LA/k;

    .line 72
    .line 73
    iget-object v2, v2, LA/k;->i:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v2, Landroidx/fragment/app/J;

    .line 76
    .line 77
    iget-object v4, v2, Landroidx/fragment/app/J;->c:Ljava/util/HashMap;

    .line 78
    .line 79
    iget-object v5, v3, Landroidx/fragment/app/r;->j:Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    const/4 v5, 0x1

    .line 86
    if-nez v4, :cond_3

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    iget-boolean v4, v2, Landroidx/fragment/app/J;->f:Z

    .line 90
    .line 91
    if-eqz v4, :cond_4

    .line 92
    .line 93
    iget-boolean v5, v2, Landroidx/fragment/app/J;->g:Z

    .line 94
    .line 95
    :cond_4
    :goto_0
    if-eqz v5, :cond_6

    .line 96
    .line 97
    :goto_1
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_5

    .line 102
    .line 103
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    :cond_5
    invoke-virtual {v3}, Landroidx/fragment/app/r;->n()V

    .line 107
    .line 108
    .line 109
    :cond_6
    return-void

    .line 110
    :cond_7
    new-instance v0, Landroidx/fragment/app/T;

    .line 111
    .line 112
    new-instance v1, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    const-string v2, "Fragment "

    .line 115
    .line 116
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const-string v2, " did not call through to super.onDetach()"

    .line 123
    .line 124
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    throw v0
.end method

.method public final j()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/M;->c:Landroidx/fragment/app/r;

    .line 2
    .line 3
    iget-boolean v1, v0, Landroidx/fragment/app/r;->r:Z

    .line 4
    .line 5
    if-eqz v1, :cond_2

    .line 6
    .line 7
    iget-boolean v1, v0, Landroidx/fragment/app/r;->s:Z

    .line 8
    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    iget-boolean v1, v0, Landroidx/fragment/app/r;->u:Z

    .line 12
    .line 13
    if-nez v1, :cond_2

    .line 14
    .line 15
    const-string v1, "FragmentManager"

    .line 16
    .line 17
    const/4 v2, 0x3

    .line 18
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object v1, v0, Landroidx/fragment/app/r;->g:Landroid/os/Bundle;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroidx/fragment/app/r;->x(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iput-object v1, v0, Landroidx/fragment/app/r;->O:Landroid/view/LayoutInflater;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    iget-object v3, v0, Landroidx/fragment/app/r;->g:Landroid/os/Bundle;

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2, v3}, Landroidx/fragment/app/r;->D(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 39
    .line 40
    .line 41
    iget-object v1, v0, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    invoke-virtual {v1, v2}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    .line 47
    .line 48
    .line 49
    iget-object v1, v0, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 50
    .line 51
    const v3, 0x7f0900d4

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v3, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-boolean v1, v0, Landroidx/fragment/app/r;->D:Z

    .line 58
    .line 59
    if-eqz v1, :cond_1

    .line 60
    .line 61
    iget-object v1, v0, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 62
    .line 63
    const/16 v3, 0x8

    .line 64
    .line 65
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 66
    .line 67
    .line 68
    :cond_1
    iget-object v1, v0, Landroidx/fragment/app/r;->g:Landroid/os/Bundle;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Landroidx/fragment/app/r;->B(Landroid/os/Bundle;)V

    .line 71
    .line 72
    .line 73
    iget-object v1, v0, Landroidx/fragment/app/r;->y:Landroidx/fragment/app/H;

    .line 74
    .line 75
    const/4 v3, 0x2

    .line 76
    invoke-virtual {v1, v3}, Landroidx/fragment/app/H;->t(I)V

    .line 77
    .line 78
    .line 79
    iget-object v1, p0, Landroidx/fragment/app/M;->a:LE/j;

    .line 80
    .line 81
    invoke-virtual {v1, v2}, LE/j;->s(Z)V

    .line 82
    .line 83
    .line 84
    iput v3, v0, Landroidx/fragment/app/r;->f:I

    .line 85
    .line 86
    :cond_2
    return-void
.end method

.method public final k()V
    .locals 10

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/M;->b:LA/k;

    .line 2
    .line 3
    iget-boolean v1, p0, Landroidx/fragment/app/M;->d:Z

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const-string v3, "FragmentManager"

    .line 7
    .line 8
    iget-object v4, p0, Landroidx/fragment/app/M;->c:Landroidx/fragment/app/r;

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-static {v3, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void

    .line 22
    :cond_1
    const/4 v1, 0x1

    .line 23
    const/4 v5, 0x0

    .line 24
    :try_start_0
    iput-boolean v1, p0, Landroidx/fragment/app/M;->d:Z

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/M;->d()I

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    iget v8, v4, Landroidx/fragment/app/r;->f:I

    .line 32
    .line 33
    const/4 v9, 0x3

    .line 34
    if-eq v7, v8, :cond_9

    .line 35
    .line 36
    if-le v7, v8, :cond_4

    .line 37
    .line 38
    add-int/lit8 v8, v8, 0x1

    .line 39
    .line 40
    packed-switch v8, :pswitch_data_0

    .line 41
    .line 42
    .line 43
    goto/16 :goto_1

    .line 44
    .line 45
    :pswitch_0
    invoke-virtual {p0}, Landroidx/fragment/app/M;->n()V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_1

    .line 49
    .line 50
    :catchall_0
    move-exception v0

    .line 51
    goto/16 :goto_3

    .line 52
    .line 53
    :pswitch_1
    const/4 v6, 0x6

    .line 54
    iput v6, v4, Landroidx/fragment/app/r;->f:I

    .line 55
    .line 56
    goto/16 :goto_1

    .line 57
    .line 58
    :pswitch_2
    invoke-virtual {p0}, Landroidx/fragment/app/M;->p()V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_1

    .line 62
    .line 63
    :pswitch_3
    iget-object v6, v4, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 64
    .line 65
    if-eqz v6, :cond_3

    .line 66
    .line 67
    iget-object v6, v4, Landroidx/fragment/app/r;->I:Landroid/view/ViewGroup;

    .line 68
    .line 69
    if-eqz v6, :cond_3

    .line 70
    .line 71
    invoke-virtual {v4}, Landroidx/fragment/app/r;->j()Landroidx/fragment/app/H;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    invoke-virtual {v7}, Landroidx/fragment/app/H;->D()LK0/e;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    invoke-static {v6, v7}, Landroidx/fragment/app/i;->f(Landroid/view/ViewGroup;LK0/e;)Landroidx/fragment/app/i;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    iget-object v7, v4, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 84
    .line 85
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    invoke-static {v7}, LQ0/E;->b(I)I

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-static {v3, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    if-eqz v8, :cond_2

    .line 101
    .line 102
    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    :cond_2
    invoke-virtual {v6, v7, v2, p0}, Landroidx/fragment/app/i;->a(IILandroidx/fragment/app/M;)V

    .line 106
    .line 107
    .line 108
    :cond_3
    const/4 v6, 0x4

    .line 109
    iput v6, v4, Landroidx/fragment/app/r;->f:I

    .line 110
    .line 111
    goto/16 :goto_1

    .line 112
    .line 113
    :pswitch_4
    invoke-virtual {p0}, Landroidx/fragment/app/M;->a()V

    .line 114
    .line 115
    .line 116
    goto/16 :goto_1

    .line 117
    .line 118
    :pswitch_5
    invoke-virtual {p0}, Landroidx/fragment/app/M;->j()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Landroidx/fragment/app/M;->f()V

    .line 122
    .line 123
    .line 124
    goto/16 :goto_1

    .line 125
    .line 126
    :pswitch_6
    invoke-virtual {p0}, Landroidx/fragment/app/M;->e()V

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :pswitch_7
    invoke-virtual {p0}, Landroidx/fragment/app/M;->c()V

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_4
    add-int/lit8 v8, v8, -0x1

    .line 135
    .line 136
    packed-switch v8, :pswitch_data_1

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :pswitch_8
    invoke-virtual {p0}, Landroidx/fragment/app/M;->l()V

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :pswitch_9
    const/4 v6, 0x5

    .line 145
    iput v6, v4, Landroidx/fragment/app/r;->f:I

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :pswitch_a
    invoke-virtual {p0}, Landroidx/fragment/app/M;->q()V

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :pswitch_b
    invoke-static {v3, v9}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    if-eqz v6, :cond_5

    .line 157
    .line 158
    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    :cond_5
    iget-object v6, v4, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 162
    .line 163
    if-eqz v6, :cond_6

    .line 164
    .line 165
    iget-object v6, v4, Landroidx/fragment/app/r;->h:Landroid/util/SparseArray;

    .line 166
    .line 167
    if-nez v6, :cond_6

    .line 168
    .line 169
    invoke-virtual {p0}, Landroidx/fragment/app/M;->o()V

    .line 170
    .line 171
    .line 172
    :cond_6
    iget-object v6, v4, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 173
    .line 174
    if-eqz v6, :cond_8

    .line 175
    .line 176
    iget-object v6, v4, Landroidx/fragment/app/r;->I:Landroid/view/ViewGroup;

    .line 177
    .line 178
    if-eqz v6, :cond_8

    .line 179
    .line 180
    invoke-virtual {v4}, Landroidx/fragment/app/r;->j()Landroidx/fragment/app/H;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    invoke-virtual {v7}, Landroidx/fragment/app/H;->D()LK0/e;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    invoke-static {v6, v7}, Landroidx/fragment/app/i;->f(Landroid/view/ViewGroup;LK0/e;)Landroidx/fragment/app/i;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-static {v3, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 196
    .line 197
    .line 198
    move-result v7

    .line 199
    if-eqz v7, :cond_7

    .line 200
    .line 201
    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    :cond_7
    invoke-virtual {v6, v1, v9, p0}, Landroidx/fragment/app/i;->a(IILandroidx/fragment/app/M;)V

    .line 205
    .line 206
    .line 207
    :cond_8
    iput v9, v4, Landroidx/fragment/app/r;->f:I

    .line 208
    .line 209
    goto :goto_1

    .line 210
    :pswitch_c
    iput-boolean v5, v4, Landroidx/fragment/app/r;->s:Z

    .line 211
    .line 212
    iput v2, v4, Landroidx/fragment/app/r;->f:I

    .line 213
    .line 214
    goto :goto_1

    .line 215
    :pswitch_d
    invoke-virtual {p0}, Landroidx/fragment/app/M;->h()V

    .line 216
    .line 217
    .line 218
    iput v1, v4, Landroidx/fragment/app/r;->f:I

    .line 219
    .line 220
    goto :goto_1

    .line 221
    :pswitch_e
    invoke-virtual {p0}, Landroidx/fragment/app/M;->g()V

    .line 222
    .line 223
    .line 224
    goto :goto_1

    .line 225
    :pswitch_f
    invoke-virtual {p0}, Landroidx/fragment/app/M;->i()V

    .line 226
    .line 227
    .line 228
    :goto_1
    const/4 v6, 0x1

    .line 229
    goto/16 :goto_0

    .line 230
    .line 231
    :cond_9
    if-nez v6, :cond_d

    .line 232
    .line 233
    const/4 v6, -0x1

    .line 234
    if-ne v8, v6, :cond_d

    .line 235
    .line 236
    iget-boolean v6, v4, Landroidx/fragment/app/r;->q:Z

    .line 237
    .line 238
    if-eqz v6, :cond_d

    .line 239
    .line 240
    invoke-virtual {v4}, Landroidx/fragment/app/r;->q()Z

    .line 241
    .line 242
    .line 243
    move-result v6

    .line 244
    if-nez v6, :cond_d

    .line 245
    .line 246
    invoke-static {v3, v9}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 247
    .line 248
    .line 249
    move-result v6

    .line 250
    if-eqz v6, :cond_a

    .line 251
    .line 252
    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    :cond_a
    iget-object v6, v0, LA/k;->i:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v6, Landroidx/fragment/app/J;

    .line 258
    .line 259
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    invoke-static {v3, v9}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 263
    .line 264
    .line 265
    move-result v7

    .line 266
    if-eqz v7, :cond_b

    .line 267
    .line 268
    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    :cond_b
    iget-object v7, v4, Landroidx/fragment/app/r;->j:Ljava/lang/String;

    .line 272
    .line 273
    invoke-virtual {v6, v7}, Landroidx/fragment/app/J;->c(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0, p0}, LA/k;->l(Landroidx/fragment/app/M;)V

    .line 277
    .line 278
    .line 279
    invoke-static {v3, v9}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-eqz v0, :cond_c

    .line 284
    .line 285
    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    :cond_c
    invoke-virtual {v4}, Landroidx/fragment/app/r;->n()V

    .line 289
    .line 290
    .line 291
    :cond_d
    iget-boolean v0, v4, Landroidx/fragment/app/r;->N:Z

    .line 292
    .line 293
    if-eqz v0, :cond_13

    .line 294
    .line 295
    iget-object v0, v4, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 296
    .line 297
    if-eqz v0, :cond_11

    .line 298
    .line 299
    iget-object v0, v4, Landroidx/fragment/app/r;->I:Landroid/view/ViewGroup;

    .line 300
    .line 301
    if-eqz v0, :cond_11

    .line 302
    .line 303
    invoke-virtual {v4}, Landroidx/fragment/app/r;->j()Landroidx/fragment/app/H;

    .line 304
    .line 305
    .line 306
    move-result-object v6

    .line 307
    invoke-virtual {v6}, Landroidx/fragment/app/H;->D()LK0/e;

    .line 308
    .line 309
    .line 310
    move-result-object v6

    .line 311
    invoke-static {v0, v6}, Landroidx/fragment/app/i;->f(Landroid/view/ViewGroup;LK0/e;)Landroidx/fragment/app/i;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    iget-boolean v6, v4, Landroidx/fragment/app/r;->D:Z

    .line 316
    .line 317
    if-eqz v6, :cond_f

    .line 318
    .line 319
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    invoke-static {v3, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 323
    .line 324
    .line 325
    move-result v2

    .line 326
    if-eqz v2, :cond_e

    .line 327
    .line 328
    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    :cond_e
    invoke-virtual {v0, v9, v1, p0}, Landroidx/fragment/app/i;->a(IILandroidx/fragment/app/M;)V

    .line 332
    .line 333
    .line 334
    goto :goto_2

    .line 335
    :cond_f
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    invoke-static {v3, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    if-eqz v3, :cond_10

    .line 343
    .line 344
    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    :cond_10
    invoke-virtual {v0, v2, v1, p0}, Landroidx/fragment/app/i;->a(IILandroidx/fragment/app/M;)V

    .line 348
    .line 349
    .line 350
    :cond_11
    :goto_2
    iget-object v0, v4, Landroidx/fragment/app/r;->w:Landroidx/fragment/app/H;

    .line 351
    .line 352
    if-eqz v0, :cond_12

    .line 353
    .line 354
    iget-boolean v2, v4, Landroidx/fragment/app/r;->p:Z

    .line 355
    .line 356
    if-eqz v2, :cond_12

    .line 357
    .line 358
    invoke-static {v4}, Landroidx/fragment/app/H;->F(Landroidx/fragment/app/r;)Z

    .line 359
    .line 360
    .line 361
    move-result v2

    .line 362
    if-eqz v2, :cond_12

    .line 363
    .line 364
    iput-boolean v1, v0, Landroidx/fragment/app/H;->D:Z

    .line 365
    .line 366
    :cond_12
    iput-boolean v5, v4, Landroidx/fragment/app/r;->N:Z

    .line 367
    .line 368
    iget-object v0, v4, Landroidx/fragment/app/r;->y:Landroidx/fragment/app/H;

    .line 369
    .line 370
    invoke-virtual {v0}, Landroidx/fragment/app/H;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 371
    .line 372
    .line 373
    :cond_13
    iput-boolean v5, p0, Landroidx/fragment/app/M;->d:Z

    .line 374
    .line 375
    return-void

    .line 376
    :goto_3
    iput-boolean v5, p0, Landroidx/fragment/app/M;->d:Z

    .line 377
    .line 378
    throw v0

    .line 379
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    :pswitch_data_1
    .packed-switch -0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method

.method public final l()V
    .locals 3

    .line 1
    const-string v0, "FragmentManager"

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget-object v1, p0, Landroidx/fragment/app/M;->c:Landroidx/fragment/app/r;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/r;->y:Landroidx/fragment/app/H;

    .line 16
    .line 17
    const/4 v2, 0x5

    .line 18
    invoke-virtual {v0, v2}, Landroidx/fragment/app/H;->t(I)V

    .line 19
    .line 20
    .line 21
    iget-object v0, v1, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v0, v1, Landroidx/fragment/app/r;->T:Landroidx/fragment/app/O;

    .line 26
    .line 27
    sget-object v2, Landroidx/lifecycle/l;->ON_PAUSE:Landroidx/lifecycle/l;

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Landroidx/fragment/app/O;->e(Landroidx/lifecycle/l;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    iget-object v0, v1, Landroidx/fragment/app/r;->S:Landroidx/lifecycle/t;

    .line 33
    .line 34
    sget-object v2, Landroidx/lifecycle/l;->ON_PAUSE:Landroidx/lifecycle/l;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x6

    .line 40
    iput v0, v1, Landroidx/fragment/app/r;->f:I

    .line 41
    .line 42
    const/4 v0, 0x1

    .line 43
    iput-boolean v0, v1, Landroidx/fragment/app/r;->H:Z

    .line 44
    .line 45
    iget-object v0, p0, Landroidx/fragment/app/M;->a:LE/j;

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-virtual {v0, v1}, LE/j;->j(Z)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final m(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/M;->c:Landroidx/fragment/app/r;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/fragment/app/r;->g:Landroid/os/Bundle;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {v1, p1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, v0, Landroidx/fragment/app/r;->g:Landroid/os/Bundle;

    .line 12
    .line 13
    const-string v1, "android:view_state"

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, v0, Landroidx/fragment/app/r;->h:Landroid/util/SparseArray;

    .line 20
    .line 21
    iget-object p1, v0, Landroidx/fragment/app/r;->g:Landroid/os/Bundle;

    .line 22
    .line 23
    const-string v1, "android:view_registry_state"

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, v0, Landroidx/fragment/app/r;->i:Landroid/os/Bundle;

    .line 30
    .line 31
    iget-object p1, v0, Landroidx/fragment/app/r;->g:Landroid/os/Bundle;

    .line 32
    .line 33
    const-string v1, "android:target_state"

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, v0, Landroidx/fragment/app/r;->m:Ljava/lang/String;

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    iget-object p1, v0, Landroidx/fragment/app/r;->g:Landroid/os/Bundle;

    .line 44
    .line 45
    const-string v1, "android:target_req_state"

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    iput p1, v0, Landroidx/fragment/app/r;->n:I

    .line 53
    .line 54
    :cond_1
    iget-object p1, v0, Landroidx/fragment/app/r;->g:Landroid/os/Bundle;

    .line 55
    .line 56
    const-string v1, "android:user_visible_hint"

    .line 57
    .line 58
    const/4 v2, 0x1

    .line 59
    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    iput-boolean p1, v0, Landroidx/fragment/app/r;->L:Z

    .line 64
    .line 65
    if-nez p1, :cond_2

    .line 66
    .line 67
    iput-boolean v2, v0, Landroidx/fragment/app/r;->K:Z

    .line 68
    .line 69
    :cond_2
    return-void
.end method

.method public final n()V
    .locals 6

    .line 1
    const/4 v0, 0x3

    .line 2
    const-string v1, "FragmentManager"

    .line 3
    .line 4
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget-object v2, p0, Landroidx/fragment/app/M;->c:Landroidx/fragment/app/r;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, v2, Landroidx/fragment/app/r;->M:Landroidx/fragment/app/p;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    move-object v0, v3

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget-object v0, v0, Landroidx/fragment/app/p;->k:Landroid/view/View;

    .line 23
    .line 24
    :goto_0
    if-eqz v0, :cond_4

    .line 25
    .line 26
    iget-object v4, v2, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 27
    .line 28
    if-ne v0, v4, :cond_2

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    :goto_1
    if-eqz v4, :cond_4

    .line 36
    .line 37
    iget-object v5, v2, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 38
    .line 39
    if-ne v4, v5, :cond_3

    .line 40
    .line 41
    :goto_2
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 42
    .line 43
    .line 44
    const/4 v4, 0x2

    .line 45
    invoke-static {v1, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_4

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    iget-object v0, v2, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_3
    invoke-interface {v4}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    goto :goto_1

    .line 72
    :cond_4
    :goto_3
    invoke-virtual {v2}, Landroidx/fragment/app/r;->f()Landroidx/fragment/app/p;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iput-object v3, v0, Landroidx/fragment/app/p;->k:Landroid/view/View;

    .line 77
    .line 78
    iget-object v0, v2, Landroidx/fragment/app/r;->y:Landroidx/fragment/app/H;

    .line 79
    .line 80
    invoke-virtual {v0}, Landroidx/fragment/app/H;->K()V

    .line 81
    .line 82
    .line 83
    iget-object v0, v2, Landroidx/fragment/app/r;->y:Landroidx/fragment/app/H;

    .line 84
    .line 85
    const/4 v1, 0x1

    .line 86
    invoke-virtual {v0, v1}, Landroidx/fragment/app/H;->x(Z)Z

    .line 87
    .line 88
    .line 89
    const/4 v0, 0x7

    .line 90
    iput v0, v2, Landroidx/fragment/app/r;->f:I

    .line 91
    .line 92
    iput-boolean v1, v2, Landroidx/fragment/app/r;->H:Z

    .line 93
    .line 94
    iget-object v1, v2, Landroidx/fragment/app/r;->S:Landroidx/lifecycle/t;

    .line 95
    .line 96
    sget-object v4, Landroidx/lifecycle/l;->ON_RESUME:Landroidx/lifecycle/l;

    .line 97
    .line 98
    invoke-virtual {v1, v4}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    .line 99
    .line 100
    .line 101
    iget-object v1, v2, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 102
    .line 103
    if-eqz v1, :cond_5

    .line 104
    .line 105
    iget-object v1, v2, Landroidx/fragment/app/r;->T:Landroidx/fragment/app/O;

    .line 106
    .line 107
    iget-object v1, v1, Landroidx/fragment/app/O;->h:Landroidx/lifecycle/t;

    .line 108
    .line 109
    invoke-virtual {v1, v4}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    .line 110
    .line 111
    .line 112
    :cond_5
    iget-object v1, v2, Landroidx/fragment/app/r;->y:Landroidx/fragment/app/H;

    .line 113
    .line 114
    const/4 v4, 0x0

    .line 115
    iput-boolean v4, v1, Landroidx/fragment/app/H;->E:Z

    .line 116
    .line 117
    iput-boolean v4, v1, Landroidx/fragment/app/H;->F:Z

    .line 118
    .line 119
    iget-object v5, v1, Landroidx/fragment/app/H;->L:Landroidx/fragment/app/J;

    .line 120
    .line 121
    iput-boolean v4, v5, Landroidx/fragment/app/J;->h:Z

    .line 122
    .line 123
    invoke-virtual {v1, v0}, Landroidx/fragment/app/H;->t(I)V

    .line 124
    .line 125
    .line 126
    iget-object v0, p0, Landroidx/fragment/app/M;->a:LE/j;

    .line 127
    .line 128
    invoke-virtual {v0, v4}, LE/j;->o(Z)V

    .line 129
    .line 130
    .line 131
    iput-object v3, v2, Landroidx/fragment/app/r;->g:Landroid/os/Bundle;

    .line 132
    .line 133
    iput-object v3, v2, Landroidx/fragment/app/r;->h:Landroid/util/SparseArray;

    .line 134
    .line 135
    iput-object v3, v2, Landroidx/fragment/app/r;->i:Landroid/os/Bundle;

    .line 136
    .line 137
    return-void
.end method

.method public final o()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/M;->c:Landroidx/fragment/app/r;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string v1, "FragmentManager"

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    iget-object v1, v0, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 21
    .line 22
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    :cond_1
    new-instance v1, Landroid/util/SparseArray;

    .line 26
    .line 27
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 28
    .line 29
    .line 30
    iget-object v2, v0, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 31
    .line 32
    invoke-virtual {v2, v1}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-lez v2, :cond_2

    .line 40
    .line 41
    iput-object v1, v0, Landroidx/fragment/app/r;->h:Landroid/util/SparseArray;

    .line 42
    .line 43
    :cond_2
    new-instance v1, Landroid/os/Bundle;

    .line 44
    .line 45
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 46
    .line 47
    .line 48
    iget-object v2, v0, Landroidx/fragment/app/r;->T:Landroidx/fragment/app/O;

    .line 49
    .line 50
    iget-object v2, v2, Landroidx/fragment/app/O;->i:Lk0/d;

    .line 51
    .line 52
    invoke-virtual {v2, v1}, Lk0/d;->c(Landroid/os/Bundle;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_3

    .line 60
    .line 61
    iput-object v1, v0, Landroidx/fragment/app/r;->i:Landroid/os/Bundle;

    .line 62
    .line 63
    :cond_3
    return-void
.end method

.method public final p()V
    .locals 5

    .line 1
    const-string v0, "FragmentManager"

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget-object v1, p0, Landroidx/fragment/app/M;->c:Landroidx/fragment/app/r;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/r;->y:Landroidx/fragment/app/H;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/fragment/app/H;->K()V

    .line 18
    .line 19
    .line 20
    iget-object v0, v1, Landroidx/fragment/app/r;->y:Landroidx/fragment/app/H;

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-virtual {v0, v2}, Landroidx/fragment/app/H;->x(Z)Z

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x5

    .line 27
    iput v0, v1, Landroidx/fragment/app/r;->f:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    iput-boolean v2, v1, Landroidx/fragment/app/r;->H:Z

    .line 31
    .line 32
    invoke-virtual {v1}, Landroidx/fragment/app/r;->z()V

    .line 33
    .line 34
    .line 35
    iget-boolean v3, v1, Landroidx/fragment/app/r;->H:Z

    .line 36
    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    iget-object v3, v1, Landroidx/fragment/app/r;->S:Landroidx/lifecycle/t;

    .line 40
    .line 41
    sget-object v4, Landroidx/lifecycle/l;->ON_START:Landroidx/lifecycle/l;

    .line 42
    .line 43
    invoke-virtual {v3, v4}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    .line 44
    .line 45
    .line 46
    iget-object v3, v1, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 47
    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    iget-object v3, v1, Landroidx/fragment/app/r;->T:Landroidx/fragment/app/O;

    .line 51
    .line 52
    iget-object v3, v3, Landroidx/fragment/app/O;->h:Landroidx/lifecycle/t;

    .line 53
    .line 54
    invoke-virtual {v3, v4}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    iget-object v1, v1, Landroidx/fragment/app/r;->y:Landroidx/fragment/app/H;

    .line 58
    .line 59
    iput-boolean v2, v1, Landroidx/fragment/app/H;->E:Z

    .line 60
    .line 61
    iput-boolean v2, v1, Landroidx/fragment/app/H;->F:Z

    .line 62
    .line 63
    iget-object v3, v1, Landroidx/fragment/app/H;->L:Landroidx/fragment/app/J;

    .line 64
    .line 65
    iput-boolean v2, v3, Landroidx/fragment/app/J;->h:Z

    .line 66
    .line 67
    invoke-virtual {v1, v0}, Landroidx/fragment/app/H;->t(I)V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Landroidx/fragment/app/M;->a:LE/j;

    .line 71
    .line 72
    invoke-virtual {v0, v2}, LE/j;->q(Z)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_2
    new-instance v0, Landroidx/fragment/app/T;

    .line 77
    .line 78
    new-instance v2, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    const-string v3, "Fragment "

    .line 81
    .line 82
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v1, " did not call through to super.onStart()"

    .line 89
    .line 90
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw v0
.end method

.method public final q()V
    .locals 4

    .line 1
    const-string v0, "FragmentManager"

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget-object v1, p0, Landroidx/fragment/app/M;->c:Landroidx/fragment/app/r;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/r;->y:Landroidx/fragment/app/H;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    iput-boolean v2, v0, Landroidx/fragment/app/H;->F:Z

    .line 19
    .line 20
    iget-object v3, v0, Landroidx/fragment/app/H;->L:Landroidx/fragment/app/J;

    .line 21
    .line 22
    iput-boolean v2, v3, Landroidx/fragment/app/J;->h:Z

    .line 23
    .line 24
    const/4 v2, 0x4

    .line 25
    invoke-virtual {v0, v2}, Landroidx/fragment/app/H;->t(I)V

    .line 26
    .line 27
    .line 28
    iget-object v0, v1, Landroidx/fragment/app/r;->J:Landroid/view/View;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-object v0, v1, Landroidx/fragment/app/r;->T:Landroidx/fragment/app/O;

    .line 33
    .line 34
    sget-object v3, Landroidx/lifecycle/l;->ON_STOP:Landroidx/lifecycle/l;

    .line 35
    .line 36
    invoke-virtual {v0, v3}, Landroidx/fragment/app/O;->e(Landroidx/lifecycle/l;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    iget-object v0, v1, Landroidx/fragment/app/r;->S:Landroidx/lifecycle/t;

    .line 40
    .line 41
    sget-object v3, Landroidx/lifecycle/l;->ON_STOP:Landroidx/lifecycle/l;

    .line 42
    .line 43
    invoke-virtual {v0, v3}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    .line 44
    .line 45
    .line 46
    iput v2, v1, Landroidx/fragment/app/r;->f:I

    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    iput-boolean v0, v1, Landroidx/fragment/app/r;->H:Z

    .line 50
    .line 51
    invoke-virtual {v1}, Landroidx/fragment/app/r;->A()V

    .line 52
    .line 53
    .line 54
    iget-boolean v2, v1, Landroidx/fragment/app/r;->H:Z

    .line 55
    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    iget-object v1, p0, Landroidx/fragment/app/M;->a:LE/j;

    .line 59
    .line 60
    invoke-virtual {v1, v0}, LE/j;->r(Z)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    new-instance v0, Landroidx/fragment/app/T;

    .line 65
    .line 66
    new-instance v2, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v3, "Fragment "

    .line 69
    .line 70
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v1, " did not call through to super.onStop()"

    .line 77
    .line 78
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v0
.end method
