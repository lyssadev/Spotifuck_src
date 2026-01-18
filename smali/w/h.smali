.class public abstract Lw/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lw/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lw/b;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lw/h;->a:Lw/b;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Lv/d;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lv/d;->p0:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget v2, v0, v1

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    aget v0, v0, v3

    .line 8
    .line 9
    iget-object v4, p0, Lv/d;->T:Lv/d;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    check-cast v4, Lv/e;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v4, 0x0

    .line 17
    :goto_0
    if-eqz v4, :cond_1

    .line 18
    .line 19
    iget-object v5, v4, Lv/d;->p0:[I

    .line 20
    .line 21
    aget v5, v5, v1

    .line 22
    .line 23
    :cond_1
    if-eqz v4, :cond_2

    .line 24
    .line 25
    iget-object v4, v4, Lv/d;->p0:[I

    .line 26
    .line 27
    aget v4, v4, v3

    .line 28
    .line 29
    :cond_2
    const/4 v4, 0x3

    .line 30
    const/4 v5, 0x2

    .line 31
    const/4 v6, 0x0

    .line 32
    if-eq v2, v3, :cond_5

    .line 33
    .line 34
    invoke-virtual {p0}, Lv/d;->A()Z

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    if-nez v7, :cond_5

    .line 39
    .line 40
    if-eq v2, v5, :cond_5

    .line 41
    .line 42
    if-ne v2, v4, :cond_3

    .line 43
    .line 44
    iget v7, p0, Lv/d;->r:I

    .line 45
    .line 46
    if-nez v7, :cond_3

    .line 47
    .line 48
    iget v7, p0, Lv/d;->W:F

    .line 49
    .line 50
    cmpl-float v7, v7, v6

    .line 51
    .line 52
    if-nez v7, :cond_3

    .line 53
    .line 54
    invoke-virtual {p0, v1}, Lv/d;->t(I)Z

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    if-nez v7, :cond_5

    .line 59
    .line 60
    :cond_3
    if-ne v2, v4, :cond_4

    .line 61
    .line 62
    iget v2, p0, Lv/d;->r:I

    .line 63
    .line 64
    if-ne v2, v3, :cond_4

    .line 65
    .line 66
    invoke-virtual {p0}, Lv/d;->q()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-virtual {p0, v1, v2}, Lv/d;->u(II)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_4

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    const/4 v2, 0x0

    .line 78
    goto :goto_2

    .line 79
    :cond_5
    :goto_1
    const/4 v2, 0x1

    .line 80
    :goto_2
    if-eq v0, v3, :cond_8

    .line 81
    .line 82
    invoke-virtual {p0}, Lv/d;->B()Z

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    if-nez v7, :cond_8

    .line 87
    .line 88
    if-eq v0, v5, :cond_8

    .line 89
    .line 90
    if-ne v0, v4, :cond_6

    .line 91
    .line 92
    iget v5, p0, Lv/d;->s:I

    .line 93
    .line 94
    if-nez v5, :cond_6

    .line 95
    .line 96
    iget v5, p0, Lv/d;->W:F

    .line 97
    .line 98
    cmpl-float v5, v5, v6

    .line 99
    .line 100
    if-nez v5, :cond_6

    .line 101
    .line 102
    invoke-virtual {p0, v3}, Lv/d;->t(I)Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-nez v5, :cond_8

    .line 107
    .line 108
    :cond_6
    if-ne v0, v4, :cond_7

    .line 109
    .line 110
    iget v0, p0, Lv/d;->s:I

    .line 111
    .line 112
    if-ne v0, v3, :cond_7

    .line 113
    .line 114
    invoke-virtual {p0}, Lv/d;->k()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    invoke-virtual {p0, v3, v0}, Lv/d;->u(II)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_7

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_7
    const/4 v0, 0x0

    .line 126
    goto :goto_4

    .line 127
    :cond_8
    :goto_3
    const/4 v0, 0x1

    .line 128
    :goto_4
    iget p0, p0, Lv/d;->W:F

    .line 129
    .line 130
    cmpl-float p0, p0, v6

    .line 131
    .line 132
    if-lez p0, :cond_a

    .line 133
    .line 134
    if-nez v2, :cond_9

    .line 135
    .line 136
    if-eqz v0, :cond_a

    .line 137
    .line 138
    :cond_9
    return v3

    .line 139
    :cond_a
    if-eqz v2, :cond_b

    .line 140
    .line 141
    if-eqz v0, :cond_b

    .line 142
    .line 143
    const/4 v1, 0x1

    .line 144
    :cond_b
    return v1
.end method

.method public static b(Lv/d;ILjava/util/ArrayList;Lw/n;)Lw/n;
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget v0, p0, Lv/d;->n0:I

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget v0, p0, Lv/d;->o0:I

    .line 7
    .line 8
    :goto_0
    const/4 v1, 0x0

    .line 9
    const/4 v2, -0x1

    .line 10
    if-eq v0, v2, :cond_4

    .line 11
    .line 12
    if-eqz p3, :cond_1

    .line 13
    .line 14
    iget v3, p3, Lw/n;->b:I

    .line 15
    .line 16
    if-eq v0, v3, :cond_4

    .line 17
    .line 18
    :cond_1
    const/4 v3, 0x0

    .line 19
    :goto_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-ge v3, v4, :cond_5

    .line 24
    .line 25
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Lw/n;

    .line 30
    .line 31
    iget v5, v4, Lw/n;->b:I

    .line 32
    .line 33
    if-ne v5, v0, :cond_3

    .line 34
    .line 35
    if-eqz p3, :cond_2

    .line 36
    .line 37
    invoke-virtual {p3, p1, v4}, Lw/n;->c(ILw/n;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_2
    move-object p3, v4

    .line 44
    goto :goto_2

    .line 45
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_4
    if-eq v0, v2, :cond_5

    .line 49
    .line 50
    return-object p3

    .line 51
    :cond_5
    :goto_2
    const/4 v0, 0x1

    .line 52
    if-nez p3, :cond_c

    .line 53
    .line 54
    instance-of v3, p0, Lv/i;

    .line 55
    .line 56
    if-eqz v3, :cond_a

    .line 57
    .line 58
    move-object v3, p0

    .line 59
    check-cast v3, Lv/i;

    .line 60
    .line 61
    const/4 v4, 0x0

    .line 62
    :goto_3
    iget v5, v3, Lv/i;->r0:I

    .line 63
    .line 64
    if-ge v4, v5, :cond_8

    .line 65
    .line 66
    iget-object v5, v3, Lv/i;->q0:[Lv/d;

    .line 67
    .line 68
    aget-object v5, v5, v4

    .line 69
    .line 70
    if-nez p1, :cond_6

    .line 71
    .line 72
    iget v6, v5, Lv/d;->n0:I

    .line 73
    .line 74
    if-eq v6, v2, :cond_6

    .line 75
    .line 76
    goto :goto_4

    .line 77
    :cond_6
    if-ne p1, v0, :cond_7

    .line 78
    .line 79
    iget v6, v5, Lv/d;->o0:I

    .line 80
    .line 81
    if-eq v6, v2, :cond_7

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_8
    const/4 v6, -0x1

    .line 88
    :goto_4
    if-eq v6, v2, :cond_a

    .line 89
    .line 90
    const/4 v3, 0x0

    .line 91
    :goto_5
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-ge v3, v4, :cond_a

    .line 96
    .line 97
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    check-cast v4, Lw/n;

    .line 102
    .line 103
    iget v5, v4, Lw/n;->b:I

    .line 104
    .line 105
    if-ne v5, v6, :cond_9

    .line 106
    .line 107
    move-object p3, v4

    .line 108
    goto :goto_6

    .line 109
    :cond_9
    add-int/lit8 v3, v3, 0x1

    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_a
    :goto_6
    if-nez p3, :cond_b

    .line 113
    .line 114
    new-instance p3, Lw/n;

    .line 115
    .line 116
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 117
    .line 118
    .line 119
    new-instance v3, Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 122
    .line 123
    .line 124
    iput-object v3, p3, Lw/n;->a:Ljava/util/ArrayList;

    .line 125
    .line 126
    const/4 v3, 0x0

    .line 127
    iput-object v3, p3, Lw/n;->d:Ljava/util/ArrayList;

    .line 128
    .line 129
    iput v2, p3, Lw/n;->e:I

    .line 130
    .line 131
    sget v2, Lw/n;->f:I

    .line 132
    .line 133
    add-int/lit8 v3, v2, 0x1

    .line 134
    .line 135
    sput v3, Lw/n;->f:I

    .line 136
    .line 137
    iput v2, p3, Lw/n;->b:I

    .line 138
    .line 139
    iput p1, p3, Lw/n;->c:I

    .line 140
    .line 141
    :cond_b
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    :cond_c
    iget-object v2, p3, Lw/n;->a:Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    if-eqz v3, :cond_d

    .line 151
    .line 152
    goto :goto_8

    .line 153
    :cond_d
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    instance-of v2, p0, Lv/h;

    .line 157
    .line 158
    if-eqz v2, :cond_f

    .line 159
    .line 160
    move-object v2, p0

    .line 161
    check-cast v2, Lv/h;

    .line 162
    .line 163
    iget-object v3, v2, Lv/h;->t0:Lv/c;

    .line 164
    .line 165
    iget v2, v2, Lv/h;->u0:I

    .line 166
    .line 167
    if-nez v2, :cond_e

    .line 168
    .line 169
    const/4 v1, 0x1

    .line 170
    :cond_e
    invoke-virtual {v3, v1, p2, p3}, Lv/c;->c(ILjava/util/ArrayList;Lw/n;)V

    .line 171
    .line 172
    .line 173
    :cond_f
    iget v0, p3, Lw/n;->b:I

    .line 174
    .line 175
    if-nez p1, :cond_10

    .line 176
    .line 177
    iput v0, p0, Lv/d;->n0:I

    .line 178
    .line 179
    iget-object v0, p0, Lv/d;->I:Lv/c;

    .line 180
    .line 181
    invoke-virtual {v0, p1, p2, p3}, Lv/c;->c(ILjava/util/ArrayList;Lw/n;)V

    .line 182
    .line 183
    .line 184
    iget-object v0, p0, Lv/d;->K:Lv/c;

    .line 185
    .line 186
    invoke-virtual {v0, p1, p2, p3}, Lv/c;->c(ILjava/util/ArrayList;Lw/n;)V

    .line 187
    .line 188
    .line 189
    goto :goto_7

    .line 190
    :cond_10
    iput v0, p0, Lv/d;->o0:I

    .line 191
    .line 192
    iget-object v0, p0, Lv/d;->J:Lv/c;

    .line 193
    .line 194
    invoke-virtual {v0, p1, p2, p3}, Lv/c;->c(ILjava/util/ArrayList;Lw/n;)V

    .line 195
    .line 196
    .line 197
    iget-object v0, p0, Lv/d;->M:Lv/c;

    .line 198
    .line 199
    invoke-virtual {v0, p1, p2, p3}, Lv/c;->c(ILjava/util/ArrayList;Lw/n;)V

    .line 200
    .line 201
    .line 202
    iget-object v0, p0, Lv/d;->L:Lv/c;

    .line 203
    .line 204
    invoke-virtual {v0, p1, p2, p3}, Lv/c;->c(ILjava/util/ArrayList;Lw/n;)V

    .line 205
    .line 206
    .line 207
    :goto_7
    iget-object p0, p0, Lv/d;->P:Lv/c;

    .line 208
    .line 209
    invoke-virtual {p0, p1, p2, p3}, Lv/c;->c(ILjava/util/ArrayList;Lw/n;)V

    .line 210
    .line 211
    .line 212
    :goto_8
    return-object p3
.end method

.method public static c(ILv/d;Ly/f;Z)V
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    iget-boolean v3, v0, Lv/d;->m:Z

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    instance-of v3, v0, Lv/e;

    .line 13
    .line 14
    if-nez v3, :cond_1

    .line 15
    .line 16
    invoke-virtual/range {p1 .. p1}, Lv/d;->z()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, Lw/h;->a(Lv/d;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    new-instance v3, Lw/b;

    .line 29
    .line 30
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1, v3}, Lv/e;->V(Lv/d;Ly/f;Lw/b;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    const/4 v3, 0x2

    .line 37
    invoke-virtual {v0, v3}, Lv/d;->i(I)Lv/c;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    const/4 v4, 0x4

    .line 42
    invoke-virtual {v0, v4}, Lv/d;->i(I)Lv/c;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v3}, Lv/c;->d()I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    invoke-virtual {v4}, Lv/c;->d()I

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    iget-object v7, v3, Lv/c;->a:Ljava/util/HashSet;

    .line 55
    .line 56
    const/4 v9, 0x0

    .line 57
    if-eqz v7, :cond_d

    .line 58
    .line 59
    iget-boolean v3, v3, Lv/c;->c:Z

    .line 60
    .line 61
    if-eqz v3, :cond_d

    .line 62
    .line 63
    invoke-virtual {v7}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    if-eqz v7, :cond_d

    .line 72
    .line 73
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    check-cast v7, Lv/c;

    .line 78
    .line 79
    iget-object v13, v7, Lv/c;->d:Lv/d;

    .line 80
    .line 81
    add-int/lit8 v14, p0, 0x1

    .line 82
    .line 83
    invoke-static {v13}, Lw/h;->a(Lv/d;)Z

    .line 84
    .line 85
    .line 86
    move-result v15

    .line 87
    invoke-virtual {v13}, Lv/d;->z()Z

    .line 88
    .line 89
    .line 90
    move-result v16

    .line 91
    if-eqz v16, :cond_2

    .line 92
    .line 93
    if-eqz v15, :cond_2

    .line 94
    .line 95
    new-instance v8, Lw/b;

    .line 96
    .line 97
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-static {v13, v1, v8}, Lv/e;->V(Lv/d;Ly/f;Lw/b;)V

    .line 101
    .line 102
    .line 103
    :cond_2
    iget-object v8, v13, Lv/d;->I:Lv/c;

    .line 104
    .line 105
    iget-object v10, v13, Lv/d;->K:Lv/c;

    .line 106
    .line 107
    if-ne v7, v8, :cond_3

    .line 108
    .line 109
    iget-object v11, v10, Lv/c;->f:Lv/c;

    .line 110
    .line 111
    if-eqz v11, :cond_3

    .line 112
    .line 113
    iget-boolean v11, v11, Lv/c;->c:Z

    .line 114
    .line 115
    if-nez v11, :cond_4

    .line 116
    .line 117
    :cond_3
    if-ne v7, v10, :cond_5

    .line 118
    .line 119
    iget-object v11, v8, Lv/c;->f:Lv/c;

    .line 120
    .line 121
    if-eqz v11, :cond_5

    .line 122
    .line 123
    iget-boolean v11, v11, Lv/c;->c:Z

    .line 124
    .line 125
    if-eqz v11, :cond_5

    .line 126
    .line 127
    :cond_4
    const/4 v11, 0x1

    .line 128
    goto :goto_1

    .line 129
    :cond_5
    const/4 v11, 0x0

    .line 130
    :goto_1
    iget-object v12, v13, Lv/d;->p0:[I

    .line 131
    .line 132
    aget v12, v12, v9

    .line 133
    .line 134
    const/4 v9, 0x3

    .line 135
    if-ne v12, v9, :cond_8

    .line 136
    .line 137
    if-eqz v15, :cond_6

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_6
    if-ne v12, v9, :cond_9

    .line 141
    .line 142
    iget v7, v13, Lv/d;->v:I

    .line 143
    .line 144
    if-ltz v7, :cond_9

    .line 145
    .line 146
    iget v7, v13, Lv/d;->u:I

    .line 147
    .line 148
    if-ltz v7, :cond_9

    .line 149
    .line 150
    iget v7, v13, Lv/d;->g0:I

    .line 151
    .line 152
    const/16 v8, 0x8

    .line 153
    .line 154
    if-eq v7, v8, :cond_7

    .line 155
    .line 156
    iget v7, v13, Lv/d;->r:I

    .line 157
    .line 158
    if-nez v7, :cond_9

    .line 159
    .line 160
    iget v7, v13, Lv/d;->W:F

    .line 161
    .line 162
    const/4 v8, 0x0

    .line 163
    cmpl-float v7, v7, v8

    .line 164
    .line 165
    if-nez v7, :cond_9

    .line 166
    .line 167
    :cond_7
    invoke-virtual {v13}, Lv/d;->x()Z

    .line 168
    .line 169
    .line 170
    move-result v7

    .line 171
    if-nez v7, :cond_9

    .line 172
    .line 173
    iget-boolean v7, v13, Lv/d;->F:Z

    .line 174
    .line 175
    if-nez v7, :cond_9

    .line 176
    .line 177
    if-eqz v11, :cond_9

    .line 178
    .line 179
    invoke-virtual {v13}, Lv/d;->x()Z

    .line 180
    .line 181
    .line 182
    move-result v7

    .line 183
    if-nez v7, :cond_9

    .line 184
    .line 185
    invoke-static {v14, v0, v1, v13, v2}, Lw/h;->e(ILv/d;Ly/f;Lv/d;Z)V

    .line 186
    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_8
    :goto_2
    invoke-virtual {v13}, Lv/d;->z()Z

    .line 190
    .line 191
    .line 192
    move-result v9

    .line 193
    if-eqz v9, :cond_a

    .line 194
    .line 195
    :cond_9
    :goto_3
    const/4 v9, 0x0

    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :cond_a
    if-ne v7, v8, :cond_b

    .line 199
    .line 200
    iget-object v9, v10, Lv/c;->f:Lv/c;

    .line 201
    .line 202
    if-nez v9, :cond_b

    .line 203
    .line 204
    invoke-virtual {v8}, Lv/c;->e()I

    .line 205
    .line 206
    .line 207
    move-result v7

    .line 208
    add-int/2addr v7, v5

    .line 209
    invoke-virtual {v13}, Lv/d;->q()I

    .line 210
    .line 211
    .line 212
    move-result v8

    .line 213
    add-int/2addr v8, v7

    .line 214
    invoke-virtual {v13, v7, v8}, Lv/d;->J(II)V

    .line 215
    .line 216
    .line 217
    invoke-static {v14, v13, v1, v2}, Lw/h;->c(ILv/d;Ly/f;Z)V

    .line 218
    .line 219
    .line 220
    goto :goto_3

    .line 221
    :cond_b
    if-ne v7, v10, :cond_c

    .line 222
    .line 223
    iget-object v7, v8, Lv/c;->f:Lv/c;

    .line 224
    .line 225
    if-nez v7, :cond_c

    .line 226
    .line 227
    invoke-virtual {v10}, Lv/c;->e()I

    .line 228
    .line 229
    .line 230
    move-result v7

    .line 231
    sub-int v7, v5, v7

    .line 232
    .line 233
    invoke-virtual {v13}, Lv/d;->q()I

    .line 234
    .line 235
    .line 236
    move-result v8

    .line 237
    sub-int v8, v7, v8

    .line 238
    .line 239
    invoke-virtual {v13, v8, v7}, Lv/d;->J(II)V

    .line 240
    .line 241
    .line 242
    invoke-static {v14, v13, v1, v2}, Lw/h;->c(ILv/d;Ly/f;Z)V

    .line 243
    .line 244
    .line 245
    goto :goto_3

    .line 246
    :cond_c
    if-eqz v11, :cond_9

    .line 247
    .line 248
    invoke-virtual {v13}, Lv/d;->x()Z

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    if-nez v7, :cond_9

    .line 253
    .line 254
    invoke-static {v14, v13, v1, v2}, Lw/h;->d(ILv/d;Ly/f;Z)V

    .line 255
    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_d
    instance-of v3, v0, Lv/h;

    .line 259
    .line 260
    if-eqz v3, :cond_e

    .line 261
    .line 262
    return-void

    .line 263
    :cond_e
    iget-object v3, v4, Lv/c;->a:Ljava/util/HashSet;

    .line 264
    .line 265
    if-eqz v3, :cond_1c

    .line 266
    .line 267
    iget-boolean v4, v4, Lv/c;->c:Z

    .line 268
    .line 269
    if-eqz v4, :cond_1c

    .line 270
    .line 271
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    :cond_f
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 276
    .line 277
    .line 278
    move-result v4

    .line 279
    if-eqz v4, :cond_1c

    .line 280
    .line 281
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    check-cast v4, Lv/c;

    .line 286
    .line 287
    iget-object v5, v4, Lv/c;->d:Lv/d;

    .line 288
    .line 289
    const/4 v7, 0x1

    .line 290
    add-int/lit8 v8, p0, 0x1

    .line 291
    .line 292
    invoke-static {v5}, Lw/h;->a(Lv/d;)Z

    .line 293
    .line 294
    .line 295
    move-result v7

    .line 296
    invoke-virtual {v5}, Lv/d;->z()Z

    .line 297
    .line 298
    .line 299
    move-result v9

    .line 300
    if-eqz v9, :cond_10

    .line 301
    .line 302
    if-eqz v7, :cond_10

    .line 303
    .line 304
    new-instance v9, Lw/b;

    .line 305
    .line 306
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 307
    .line 308
    .line 309
    invoke-static {v5, v1, v9}, Lv/e;->V(Lv/d;Ly/f;Lw/b;)V

    .line 310
    .line 311
    .line 312
    :cond_10
    iget-object v9, v5, Lv/d;->I:Lv/c;

    .line 313
    .line 314
    iget-object v10, v5, Lv/d;->K:Lv/c;

    .line 315
    .line 316
    if-ne v4, v9, :cond_11

    .line 317
    .line 318
    iget-object v11, v10, Lv/c;->f:Lv/c;

    .line 319
    .line 320
    if-eqz v11, :cond_11

    .line 321
    .line 322
    iget-boolean v11, v11, Lv/c;->c:Z

    .line 323
    .line 324
    if-nez v11, :cond_12

    .line 325
    .line 326
    :cond_11
    if-ne v4, v10, :cond_13

    .line 327
    .line 328
    iget-object v11, v9, Lv/c;->f:Lv/c;

    .line 329
    .line 330
    if-eqz v11, :cond_13

    .line 331
    .line 332
    iget-boolean v11, v11, Lv/c;->c:Z

    .line 333
    .line 334
    if-eqz v11, :cond_13

    .line 335
    .line 336
    :cond_12
    const/4 v11, 0x1

    .line 337
    goto :goto_5

    .line 338
    :cond_13
    const/4 v11, 0x0

    .line 339
    :goto_5
    iget-object v12, v5, Lv/d;->p0:[I

    .line 340
    .line 341
    const/4 v13, 0x0

    .line 342
    aget v12, v12, v13

    .line 343
    .line 344
    const/4 v14, 0x3

    .line 345
    if-ne v12, v14, :cond_14

    .line 346
    .line 347
    if-eqz v7, :cond_15

    .line 348
    .line 349
    :cond_14
    const/16 v7, 0x8

    .line 350
    .line 351
    const/4 v12, 0x0

    .line 352
    goto :goto_8

    .line 353
    :cond_15
    if-ne v12, v14, :cond_18

    .line 354
    .line 355
    iget v4, v5, Lv/d;->v:I

    .line 356
    .line 357
    if-ltz v4, :cond_18

    .line 358
    .line 359
    iget v4, v5, Lv/d;->u:I

    .line 360
    .line 361
    if-ltz v4, :cond_18

    .line 362
    .line 363
    iget v4, v5, Lv/d;->g0:I

    .line 364
    .line 365
    const/16 v7, 0x8

    .line 366
    .line 367
    if-eq v4, v7, :cond_17

    .line 368
    .line 369
    iget v4, v5, Lv/d;->r:I

    .line 370
    .line 371
    if-nez v4, :cond_16

    .line 372
    .line 373
    iget v4, v5, Lv/d;->W:F

    .line 374
    .line 375
    const/4 v12, 0x0

    .line 376
    cmpl-float v4, v4, v12

    .line 377
    .line 378
    if-nez v4, :cond_f

    .line 379
    .line 380
    goto :goto_7

    .line 381
    :cond_16
    :goto_6
    const/4 v12, 0x0

    .line 382
    goto :goto_4

    .line 383
    :cond_17
    const/4 v12, 0x0

    .line 384
    :goto_7
    invoke-virtual {v5}, Lv/d;->x()Z

    .line 385
    .line 386
    .line 387
    move-result v4

    .line 388
    if-nez v4, :cond_f

    .line 389
    .line 390
    iget-boolean v4, v5, Lv/d;->F:Z

    .line 391
    .line 392
    if-nez v4, :cond_f

    .line 393
    .line 394
    if-eqz v11, :cond_f

    .line 395
    .line 396
    invoke-virtual {v5}, Lv/d;->x()Z

    .line 397
    .line 398
    .line 399
    move-result v4

    .line 400
    if-nez v4, :cond_f

    .line 401
    .line 402
    invoke-static {v8, v0, v1, v5, v2}, Lw/h;->e(ILv/d;Ly/f;Lv/d;Z)V

    .line 403
    .line 404
    .line 405
    goto/16 :goto_4

    .line 406
    .line 407
    :cond_18
    const/16 v7, 0x8

    .line 408
    .line 409
    goto :goto_6

    .line 410
    :goto_8
    invoke-virtual {v5}, Lv/d;->z()Z

    .line 411
    .line 412
    .line 413
    move-result v15

    .line 414
    if-eqz v15, :cond_19

    .line 415
    .line 416
    goto/16 :goto_4

    .line 417
    .line 418
    :cond_19
    if-ne v4, v9, :cond_1a

    .line 419
    .line 420
    iget-object v15, v10, Lv/c;->f:Lv/c;

    .line 421
    .line 422
    if-nez v15, :cond_1a

    .line 423
    .line 424
    invoke-virtual {v9}, Lv/c;->e()I

    .line 425
    .line 426
    .line 427
    move-result v4

    .line 428
    add-int/2addr v4, v6

    .line 429
    invoke-virtual {v5}, Lv/d;->q()I

    .line 430
    .line 431
    .line 432
    move-result v9

    .line 433
    add-int/2addr v9, v4

    .line 434
    invoke-virtual {v5, v4, v9}, Lv/d;->J(II)V

    .line 435
    .line 436
    .line 437
    invoke-static {v8, v5, v1, v2}, Lw/h;->c(ILv/d;Ly/f;Z)V

    .line 438
    .line 439
    .line 440
    goto/16 :goto_4

    .line 441
    .line 442
    :cond_1a
    if-ne v4, v10, :cond_1b

    .line 443
    .line 444
    iget-object v4, v9, Lv/c;->f:Lv/c;

    .line 445
    .line 446
    if-nez v4, :cond_1b

    .line 447
    .line 448
    invoke-virtual {v10}, Lv/c;->e()I

    .line 449
    .line 450
    .line 451
    move-result v4

    .line 452
    sub-int v4, v6, v4

    .line 453
    .line 454
    invoke-virtual {v5}, Lv/d;->q()I

    .line 455
    .line 456
    .line 457
    move-result v9

    .line 458
    sub-int v9, v4, v9

    .line 459
    .line 460
    invoke-virtual {v5, v9, v4}, Lv/d;->J(II)V

    .line 461
    .line 462
    .line 463
    invoke-static {v8, v5, v1, v2}, Lw/h;->c(ILv/d;Ly/f;Z)V

    .line 464
    .line 465
    .line 466
    goto/16 :goto_4

    .line 467
    .line 468
    :cond_1b
    if-eqz v11, :cond_f

    .line 469
    .line 470
    invoke-virtual {v5}, Lv/d;->x()Z

    .line 471
    .line 472
    .line 473
    move-result v4

    .line 474
    if-nez v4, :cond_f

    .line 475
    .line 476
    invoke-static {v8, v5, v1, v2}, Lw/h;->d(ILv/d;Ly/f;Z)V

    .line 477
    .line 478
    .line 479
    goto/16 :goto_4

    .line 480
    .line 481
    :cond_1c
    const/4 v1, 0x1

    .line 482
    iput-boolean v1, v0, Lv/d;->m:Z

    .line 483
    .line 484
    return-void
.end method

.method public static d(ILv/d;Ly/f;Z)V
    .locals 6

    .line 1
    iget v0, p1, Lv/d;->d0:F

    .line 2
    .line 3
    iget-object v1, p1, Lv/d;->I:Lv/c;

    .line 4
    .line 5
    iget-object v2, v1, Lv/c;->f:Lv/c;

    .line 6
    .line 7
    invoke-virtual {v2}, Lv/c;->d()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    iget-object v3, p1, Lv/d;->K:Lv/c;

    .line 12
    .line 13
    iget-object v4, v3, Lv/c;->f:Lv/c;

    .line 14
    .line 15
    invoke-virtual {v4}, Lv/c;->d()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-virtual {v1}, Lv/c;->e()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    add-int/2addr v1, v2

    .line 24
    invoke-virtual {v3}, Lv/c;->e()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    sub-int v3, v4, v3

    .line 29
    .line 30
    const/high16 v5, 0x3f000000    # 0.5f

    .line 31
    .line 32
    if-ne v2, v4, :cond_0

    .line 33
    .line 34
    const/high16 v0, 0x3f000000    # 0.5f

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v2, v1

    .line 38
    move v4, v3

    .line 39
    :goto_0
    invoke-virtual {p1}, Lv/d;->q()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    sub-int v3, v4, v2

    .line 44
    .line 45
    sub-int/2addr v3, v1

    .line 46
    if-le v2, v4, :cond_1

    .line 47
    .line 48
    sub-int v3, v2, v4

    .line 49
    .line 50
    sub-int/2addr v3, v1

    .line 51
    :cond_1
    if-lez v3, :cond_2

    .line 52
    .line 53
    int-to-float v3, v3

    .line 54
    mul-float v0, v0, v3

    .line 55
    .line 56
    add-float/2addr v0, v5

    .line 57
    :goto_1
    float-to-int v0, v0

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    int-to-float v3, v3

    .line 60
    mul-float v0, v0, v3

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :goto_2
    add-int/2addr v0, v2

    .line 64
    add-int v3, v0, v1

    .line 65
    .line 66
    if-le v2, v4, :cond_3

    .line 67
    .line 68
    sub-int v3, v0, v1

    .line 69
    .line 70
    :cond_3
    invoke-virtual {p1, v0, v3}, Lv/d;->J(II)V

    .line 71
    .line 72
    .line 73
    add-int/lit8 p0, p0, 0x1

    .line 74
    .line 75
    invoke-static {p0, p1, p2, p3}, Lw/h;->c(ILv/d;Ly/f;Z)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public static e(ILv/d;Ly/f;Lv/d;Z)V
    .locals 7

    .line 1
    iget v0, p3, Lv/d;->d0:F

    .line 2
    .line 3
    iget-object v1, p3, Lv/d;->I:Lv/c;

    .line 4
    .line 5
    iget-object v2, v1, Lv/c;->f:Lv/c;

    .line 6
    .line 7
    invoke-virtual {v2}, Lv/c;->d()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {v1}, Lv/c;->e()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v2

    .line 16
    iget-object v2, p3, Lv/d;->K:Lv/c;

    .line 17
    .line 18
    iget-object v3, v2, Lv/c;->f:Lv/c;

    .line 19
    .line 20
    invoke-virtual {v3}, Lv/c;->d()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {v2}, Lv/c;->e()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    sub-int/2addr v3, v2

    .line 29
    if-lt v3, v1, :cond_4

    .line 30
    .line 31
    invoke-virtual {p3}, Lv/d;->q()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    iget v4, p3, Lv/d;->g0:I

    .line 36
    .line 37
    const/16 v5, 0x8

    .line 38
    .line 39
    const/high16 v6, 0x3f000000    # 0.5f

    .line 40
    .line 41
    if-eq v4, v5, :cond_3

    .line 42
    .line 43
    iget v4, p3, Lv/d;->r:I

    .line 44
    .line 45
    const/4 v5, 0x2

    .line 46
    if-ne v4, v5, :cond_1

    .line 47
    .line 48
    instance-of v2, p1, Lv/e;

    .line 49
    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    invoke-virtual {p1}, Lv/d;->q()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget-object p1, p1, Lv/d;->T:Lv/d;

    .line 58
    .line 59
    invoke-virtual {p1}, Lv/d;->q()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    :goto_0
    iget v2, p3, Lv/d;->d0:F

    .line 64
    .line 65
    mul-float v2, v2, v6

    .line 66
    .line 67
    int-to-float p1, p1

    .line 68
    mul-float v2, v2, p1

    .line 69
    .line 70
    float-to-int v2, v2

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    if-nez v4, :cond_2

    .line 73
    .line 74
    sub-int v2, v3, v1

    .line 75
    .line 76
    :cond_2
    :goto_1
    iget p1, p3, Lv/d;->u:I

    .line 77
    .line 78
    invoke-static {p1, v2}, Ljava/lang/Math;->max(II)I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    iget p1, p3, Lv/d;->v:I

    .line 83
    .line 84
    if-lez p1, :cond_3

    .line 85
    .line 86
    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    :cond_3
    sub-int/2addr v3, v1

    .line 91
    sub-int/2addr v3, v2

    .line 92
    int-to-float p1, v3

    .line 93
    mul-float v0, v0, p1

    .line 94
    .line 95
    add-float/2addr v0, v6

    .line 96
    float-to-int p1, v0

    .line 97
    add-int/2addr v1, p1

    .line 98
    add-int/2addr v2, v1

    .line 99
    invoke-virtual {p3, v1, v2}, Lv/d;->J(II)V

    .line 100
    .line 101
    .line 102
    add-int/lit8 p0, p0, 0x1

    .line 103
    .line 104
    invoke-static {p0, p3, p2, p4}, Lw/h;->c(ILv/d;Ly/f;Z)V

    .line 105
    .line 106
    .line 107
    :cond_4
    return-void
.end method

.method public static f(ILv/d;Ly/f;)V
    .locals 6

    .line 1
    iget v0, p1, Lv/d;->e0:F

    .line 2
    .line 3
    iget-object v1, p1, Lv/d;->J:Lv/c;

    .line 4
    .line 5
    iget-object v2, v1, Lv/c;->f:Lv/c;

    .line 6
    .line 7
    invoke-virtual {v2}, Lv/c;->d()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    iget-object v3, p1, Lv/d;->L:Lv/c;

    .line 12
    .line 13
    iget-object v4, v3, Lv/c;->f:Lv/c;

    .line 14
    .line 15
    invoke-virtual {v4}, Lv/c;->d()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-virtual {v1}, Lv/c;->e()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    add-int/2addr v1, v2

    .line 24
    invoke-virtual {v3}, Lv/c;->e()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    sub-int v3, v4, v3

    .line 29
    .line 30
    const/high16 v5, 0x3f000000    # 0.5f

    .line 31
    .line 32
    if-ne v2, v4, :cond_0

    .line 33
    .line 34
    const/high16 v0, 0x3f000000    # 0.5f

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v2, v1

    .line 38
    move v4, v3

    .line 39
    :goto_0
    invoke-virtual {p1}, Lv/d;->k()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    sub-int v3, v4, v2

    .line 44
    .line 45
    sub-int/2addr v3, v1

    .line 46
    if-le v2, v4, :cond_1

    .line 47
    .line 48
    sub-int v3, v2, v4

    .line 49
    .line 50
    sub-int/2addr v3, v1

    .line 51
    :cond_1
    if-lez v3, :cond_2

    .line 52
    .line 53
    int-to-float v3, v3

    .line 54
    mul-float v0, v0, v3

    .line 55
    .line 56
    add-float/2addr v0, v5

    .line 57
    :goto_1
    float-to-int v0, v0

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    int-to-float v3, v3

    .line 60
    mul-float v0, v0, v3

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :goto_2
    add-int v3, v2, v0

    .line 64
    .line 65
    add-int v5, v3, v1

    .line 66
    .line 67
    if-le v2, v4, :cond_3

    .line 68
    .line 69
    sub-int v3, v2, v0

    .line 70
    .line 71
    sub-int v5, v3, v1

    .line 72
    .line 73
    :cond_3
    invoke-virtual {p1, v3, v5}, Lv/d;->K(II)V

    .line 74
    .line 75
    .line 76
    add-int/lit8 p0, p0, 0x1

    .line 77
    .line 78
    invoke-static {p0, p1, p2}, Lw/h;->i(ILv/d;Ly/f;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public static g(ILv/d;Ly/f;Lv/d;)V
    .locals 7

    .line 1
    iget v0, p3, Lv/d;->e0:F

    .line 2
    .line 3
    iget-object v1, p3, Lv/d;->J:Lv/c;

    .line 4
    .line 5
    iget-object v2, v1, Lv/c;->f:Lv/c;

    .line 6
    .line 7
    invoke-virtual {v2}, Lv/c;->d()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {v1}, Lv/c;->e()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v2

    .line 16
    iget-object v2, p3, Lv/d;->L:Lv/c;

    .line 17
    .line 18
    iget-object v3, v2, Lv/c;->f:Lv/c;

    .line 19
    .line 20
    invoke-virtual {v3}, Lv/c;->d()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {v2}, Lv/c;->e()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    sub-int/2addr v3, v2

    .line 29
    if-lt v3, v1, :cond_4

    .line 30
    .line 31
    invoke-virtual {p3}, Lv/d;->k()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    iget v4, p3, Lv/d;->g0:I

    .line 36
    .line 37
    const/16 v5, 0x8

    .line 38
    .line 39
    const/high16 v6, 0x3f000000    # 0.5f

    .line 40
    .line 41
    if-eq v4, v5, :cond_3

    .line 42
    .line 43
    iget v4, p3, Lv/d;->s:I

    .line 44
    .line 45
    const/4 v5, 0x2

    .line 46
    if-ne v4, v5, :cond_1

    .line 47
    .line 48
    instance-of v2, p1, Lv/e;

    .line 49
    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    invoke-virtual {p1}, Lv/d;->k()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget-object p1, p1, Lv/d;->T:Lv/d;

    .line 58
    .line 59
    invoke-virtual {p1}, Lv/d;->k()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    :goto_0
    mul-float v2, v0, v6

    .line 64
    .line 65
    int-to-float p1, p1

    .line 66
    mul-float v2, v2, p1

    .line 67
    .line 68
    float-to-int v2, v2

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    if-nez v4, :cond_2

    .line 71
    .line 72
    sub-int v2, v3, v1

    .line 73
    .line 74
    :cond_2
    :goto_1
    iget p1, p3, Lv/d;->x:I

    .line 75
    .line 76
    invoke-static {p1, v2}, Ljava/lang/Math;->max(II)I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    iget p1, p3, Lv/d;->y:I

    .line 81
    .line 82
    if-lez p1, :cond_3

    .line 83
    .line 84
    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    :cond_3
    sub-int/2addr v3, v1

    .line 89
    sub-int/2addr v3, v2

    .line 90
    int-to-float p1, v3

    .line 91
    mul-float v0, v0, p1

    .line 92
    .line 93
    add-float/2addr v0, v6

    .line 94
    float-to-int p1, v0

    .line 95
    add-int/2addr v1, p1

    .line 96
    add-int/2addr v2, v1

    .line 97
    invoke-virtual {p3, v1, v2}, Lv/d;->K(II)V

    .line 98
    .line 99
    .line 100
    add-int/lit8 p0, p0, 0x1

    .line 101
    .line 102
    invoke-static {p0, p3, p2}, Lw/h;->i(ILv/d;Ly/f;)V

    .line 103
    .line 104
    .line 105
    :cond_4
    return-void
.end method

.method public static h(IIII)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x4

    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x0

    .line 5
    if-eq p2, v0, :cond_1

    .line 6
    .line 7
    if-eq p2, v2, :cond_1

    .line 8
    .line 9
    if-ne p2, v1, :cond_0

    .line 10
    .line 11
    if-eq p0, v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    :goto_1
    if-eq p3, v0, :cond_3

    .line 18
    .line 19
    if-eq p3, v2, :cond_3

    .line 20
    .line 21
    if-ne p3, v1, :cond_2

    .line 22
    .line 23
    if-eq p1, v2, :cond_2

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_2
    const/4 p1, 0x0

    .line 27
    goto :goto_3

    .line 28
    :cond_3
    :goto_2
    const/4 p1, 0x1

    .line 29
    :goto_3
    if-nez p0, :cond_5

    .line 30
    .line 31
    if-eqz p1, :cond_4

    .line 32
    .line 33
    goto :goto_4

    .line 34
    :cond_4
    return v3

    .line 35
    :cond_5
    :goto_4
    return v0
.end method

.method public static i(ILv/d;Ly/f;)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-boolean v2, v0, Lv/d;->n:Z

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    instance-of v2, v0, Lv/e;

    .line 11
    .line 12
    if-nez v2, :cond_1

    .line 13
    .line 14
    invoke-virtual/range {p1 .. p1}, Lv/d;->z()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-static/range {p1 .. p1}, Lw/h;->a(Lv/d;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    new-instance v2, Lw/b;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v1, v2}, Lv/e;->V(Lv/d;Ly/f;Lw/b;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    const/4 v2, 0x3

    .line 35
    invoke-virtual {v0, v2}, Lv/d;->i(I)Lv/c;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    const/4 v4, 0x5

    .line 40
    invoke-virtual {v0, v4}, Lv/d;->i(I)Lv/c;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v3}, Lv/c;->d()I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    invoke-virtual {v4}, Lv/c;->d()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    iget-object v7, v3, Lv/c;->a:Ljava/util/HashSet;

    .line 53
    .line 54
    const/4 v8, 0x1

    .line 55
    if-eqz v7, :cond_d

    .line 56
    .line 57
    iget-boolean v3, v3, Lv/c;->c:Z

    .line 58
    .line 59
    if-eqz v3, :cond_d

    .line 60
    .line 61
    invoke-virtual {v7}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    if-eqz v7, :cond_d

    .line 70
    .line 71
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    check-cast v7, Lv/c;

    .line 76
    .line 77
    iget-object v12, v7, Lv/c;->d:Lv/d;

    .line 78
    .line 79
    add-int/lit8 v13, p0, 0x1

    .line 80
    .line 81
    invoke-static {v12}, Lw/h;->a(Lv/d;)Z

    .line 82
    .line 83
    .line 84
    move-result v14

    .line 85
    invoke-virtual {v12}, Lv/d;->z()Z

    .line 86
    .line 87
    .line 88
    move-result v15

    .line 89
    if-eqz v15, :cond_3

    .line 90
    .line 91
    if-eqz v14, :cond_3

    .line 92
    .line 93
    new-instance v15, Lw/b;

    .line 94
    .line 95
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-static {v12, v1, v15}, Lv/e;->V(Lv/d;Ly/f;Lw/b;)V

    .line 99
    .line 100
    .line 101
    :cond_3
    iget-object v15, v12, Lv/d;->J:Lv/c;

    .line 102
    .line 103
    iget-object v9, v12, Lv/d;->L:Lv/c;

    .line 104
    .line 105
    if-ne v7, v15, :cond_4

    .line 106
    .line 107
    iget-object v10, v9, Lv/c;->f:Lv/c;

    .line 108
    .line 109
    if-eqz v10, :cond_4

    .line 110
    .line 111
    iget-boolean v10, v10, Lv/c;->c:Z

    .line 112
    .line 113
    if-nez v10, :cond_5

    .line 114
    .line 115
    :cond_4
    if-ne v7, v9, :cond_6

    .line 116
    .line 117
    iget-object v10, v15, Lv/c;->f:Lv/c;

    .line 118
    .line 119
    if-eqz v10, :cond_6

    .line 120
    .line 121
    iget-boolean v10, v10, Lv/c;->c:Z

    .line 122
    .line 123
    if-eqz v10, :cond_6

    .line 124
    .line 125
    :cond_5
    const/4 v10, 0x1

    .line 126
    goto :goto_1

    .line 127
    :cond_6
    const/4 v10, 0x0

    .line 128
    :goto_1
    iget-object v11, v12, Lv/d;->p0:[I

    .line 129
    .line 130
    aget v11, v11, v8

    .line 131
    .line 132
    if-ne v11, v2, :cond_9

    .line 133
    .line 134
    if-eqz v14, :cond_7

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_7
    if-ne v11, v2, :cond_2

    .line 138
    .line 139
    iget v7, v12, Lv/d;->y:I

    .line 140
    .line 141
    if-ltz v7, :cond_2

    .line 142
    .line 143
    iget v7, v12, Lv/d;->x:I

    .line 144
    .line 145
    if-ltz v7, :cond_2

    .line 146
    .line 147
    iget v7, v12, Lv/d;->g0:I

    .line 148
    .line 149
    const/16 v9, 0x8

    .line 150
    .line 151
    if-eq v7, v9, :cond_8

    .line 152
    .line 153
    iget v7, v12, Lv/d;->s:I

    .line 154
    .line 155
    if-nez v7, :cond_2

    .line 156
    .line 157
    iget v7, v12, Lv/d;->W:F

    .line 158
    .line 159
    const/4 v9, 0x0

    .line 160
    cmpl-float v7, v7, v9

    .line 161
    .line 162
    if-nez v7, :cond_2

    .line 163
    .line 164
    :cond_8
    invoke-virtual {v12}, Lv/d;->y()Z

    .line 165
    .line 166
    .line 167
    move-result v7

    .line 168
    if-nez v7, :cond_2

    .line 169
    .line 170
    iget-boolean v7, v12, Lv/d;->F:Z

    .line 171
    .line 172
    if-nez v7, :cond_2

    .line 173
    .line 174
    if-eqz v10, :cond_2

    .line 175
    .line 176
    invoke-virtual {v12}, Lv/d;->y()Z

    .line 177
    .line 178
    .line 179
    move-result v7

    .line 180
    if-nez v7, :cond_2

    .line 181
    .line 182
    invoke-static {v13, v0, v1, v12}, Lw/h;->g(ILv/d;Ly/f;Lv/d;)V

    .line 183
    .line 184
    .line 185
    goto :goto_0

    .line 186
    :cond_9
    :goto_2
    invoke-virtual {v12}, Lv/d;->z()Z

    .line 187
    .line 188
    .line 189
    move-result v11

    .line 190
    if-eqz v11, :cond_a

    .line 191
    .line 192
    goto :goto_0

    .line 193
    :cond_a
    if-ne v7, v15, :cond_b

    .line 194
    .line 195
    iget-object v11, v9, Lv/c;->f:Lv/c;

    .line 196
    .line 197
    if-nez v11, :cond_b

    .line 198
    .line 199
    invoke-virtual {v15}, Lv/c;->e()I

    .line 200
    .line 201
    .line 202
    move-result v7

    .line 203
    add-int/2addr v7, v5

    .line 204
    invoke-virtual {v12}, Lv/d;->k()I

    .line 205
    .line 206
    .line 207
    move-result v9

    .line 208
    add-int/2addr v9, v7

    .line 209
    invoke-virtual {v12, v7, v9}, Lv/d;->K(II)V

    .line 210
    .line 211
    .line 212
    invoke-static {v13, v12, v1}, Lw/h;->i(ILv/d;Ly/f;)V

    .line 213
    .line 214
    .line 215
    goto/16 :goto_0

    .line 216
    .line 217
    :cond_b
    if-ne v7, v9, :cond_c

    .line 218
    .line 219
    iget-object v7, v15, Lv/c;->f:Lv/c;

    .line 220
    .line 221
    if-nez v7, :cond_c

    .line 222
    .line 223
    invoke-virtual {v9}, Lv/c;->e()I

    .line 224
    .line 225
    .line 226
    move-result v7

    .line 227
    sub-int v7, v5, v7

    .line 228
    .line 229
    invoke-virtual {v12}, Lv/d;->k()I

    .line 230
    .line 231
    .line 232
    move-result v9

    .line 233
    sub-int v9, v7, v9

    .line 234
    .line 235
    invoke-virtual {v12, v9, v7}, Lv/d;->K(II)V

    .line 236
    .line 237
    .line 238
    invoke-static {v13, v12, v1}, Lw/h;->i(ILv/d;Ly/f;)V

    .line 239
    .line 240
    .line 241
    goto/16 :goto_0

    .line 242
    .line 243
    :cond_c
    if-eqz v10, :cond_2

    .line 244
    .line 245
    invoke-virtual {v12}, Lv/d;->y()Z

    .line 246
    .line 247
    .line 248
    move-result v7

    .line 249
    if-nez v7, :cond_2

    .line 250
    .line 251
    invoke-static {v13, v12, v1}, Lw/h;->f(ILv/d;Ly/f;)V

    .line 252
    .line 253
    .line 254
    goto/16 :goto_0

    .line 255
    .line 256
    :cond_d
    instance-of v3, v0, Lv/h;

    .line 257
    .line 258
    if-eqz v3, :cond_e

    .line 259
    .line 260
    return-void

    .line 261
    :cond_e
    iget-object v3, v4, Lv/c;->a:Ljava/util/HashSet;

    .line 262
    .line 263
    if-eqz v3, :cond_1c

    .line 264
    .line 265
    iget-boolean v4, v4, Lv/c;->c:Z

    .line 266
    .line 267
    if-eqz v4, :cond_1c

    .line 268
    .line 269
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    :cond_f
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 274
    .line 275
    .line 276
    move-result v4

    .line 277
    if-eqz v4, :cond_1c

    .line 278
    .line 279
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    check-cast v4, Lv/c;

    .line 284
    .line 285
    iget-object v5, v4, Lv/c;->d:Lv/d;

    .line 286
    .line 287
    add-int/lit8 v7, p0, 0x1

    .line 288
    .line 289
    invoke-static {v5}, Lw/h;->a(Lv/d;)Z

    .line 290
    .line 291
    .line 292
    move-result v9

    .line 293
    invoke-virtual {v5}, Lv/d;->z()Z

    .line 294
    .line 295
    .line 296
    move-result v10

    .line 297
    if-eqz v10, :cond_10

    .line 298
    .line 299
    if-eqz v9, :cond_10

    .line 300
    .line 301
    new-instance v10, Lw/b;

    .line 302
    .line 303
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 304
    .line 305
    .line 306
    invoke-static {v5, v1, v10}, Lv/e;->V(Lv/d;Ly/f;Lw/b;)V

    .line 307
    .line 308
    .line 309
    :cond_10
    iget-object v10, v5, Lv/d;->J:Lv/c;

    .line 310
    .line 311
    iget-object v11, v5, Lv/d;->L:Lv/c;

    .line 312
    .line 313
    if-ne v4, v10, :cond_11

    .line 314
    .line 315
    iget-object v12, v11, Lv/c;->f:Lv/c;

    .line 316
    .line 317
    if-eqz v12, :cond_11

    .line 318
    .line 319
    iget-boolean v12, v12, Lv/c;->c:Z

    .line 320
    .line 321
    if-nez v12, :cond_12

    .line 322
    .line 323
    :cond_11
    if-ne v4, v11, :cond_13

    .line 324
    .line 325
    iget-object v12, v10, Lv/c;->f:Lv/c;

    .line 326
    .line 327
    if-eqz v12, :cond_13

    .line 328
    .line 329
    iget-boolean v12, v12, Lv/c;->c:Z

    .line 330
    .line 331
    if-eqz v12, :cond_13

    .line 332
    .line 333
    :cond_12
    const/4 v12, 0x1

    .line 334
    goto :goto_4

    .line 335
    :cond_13
    const/4 v12, 0x0

    .line 336
    :goto_4
    iget-object v13, v5, Lv/d;->p0:[I

    .line 337
    .line 338
    aget v13, v13, v8

    .line 339
    .line 340
    if-ne v13, v2, :cond_14

    .line 341
    .line 342
    if-eqz v9, :cond_15

    .line 343
    .line 344
    :cond_14
    const/16 v9, 0x8

    .line 345
    .line 346
    const/4 v13, 0x0

    .line 347
    goto :goto_7

    .line 348
    :cond_15
    if-ne v13, v2, :cond_18

    .line 349
    .line 350
    iget v4, v5, Lv/d;->y:I

    .line 351
    .line 352
    if-ltz v4, :cond_18

    .line 353
    .line 354
    iget v4, v5, Lv/d;->x:I

    .line 355
    .line 356
    if-ltz v4, :cond_18

    .line 357
    .line 358
    iget v4, v5, Lv/d;->g0:I

    .line 359
    .line 360
    const/16 v9, 0x8

    .line 361
    .line 362
    if-eq v4, v9, :cond_17

    .line 363
    .line 364
    iget v4, v5, Lv/d;->s:I

    .line 365
    .line 366
    if-nez v4, :cond_16

    .line 367
    .line 368
    iget v4, v5, Lv/d;->W:F

    .line 369
    .line 370
    const/4 v13, 0x0

    .line 371
    cmpl-float v4, v4, v13

    .line 372
    .line 373
    if-nez v4, :cond_f

    .line 374
    .line 375
    goto :goto_6

    .line 376
    :cond_16
    :goto_5
    const/4 v13, 0x0

    .line 377
    goto :goto_3

    .line 378
    :cond_17
    const/4 v13, 0x0

    .line 379
    :goto_6
    invoke-virtual {v5}, Lv/d;->y()Z

    .line 380
    .line 381
    .line 382
    move-result v4

    .line 383
    if-nez v4, :cond_f

    .line 384
    .line 385
    iget-boolean v4, v5, Lv/d;->F:Z

    .line 386
    .line 387
    if-nez v4, :cond_f

    .line 388
    .line 389
    if-eqz v12, :cond_f

    .line 390
    .line 391
    invoke-virtual {v5}, Lv/d;->y()Z

    .line 392
    .line 393
    .line 394
    move-result v4

    .line 395
    if-nez v4, :cond_f

    .line 396
    .line 397
    invoke-static {v7, v0, v1, v5}, Lw/h;->g(ILv/d;Ly/f;Lv/d;)V

    .line 398
    .line 399
    .line 400
    goto :goto_3

    .line 401
    :cond_18
    const/16 v9, 0x8

    .line 402
    .line 403
    goto :goto_5

    .line 404
    :goto_7
    invoke-virtual {v5}, Lv/d;->z()Z

    .line 405
    .line 406
    .line 407
    move-result v14

    .line 408
    if-eqz v14, :cond_19

    .line 409
    .line 410
    goto/16 :goto_3

    .line 411
    .line 412
    :cond_19
    if-ne v4, v10, :cond_1a

    .line 413
    .line 414
    iget-object v14, v11, Lv/c;->f:Lv/c;

    .line 415
    .line 416
    if-nez v14, :cond_1a

    .line 417
    .line 418
    invoke-virtual {v10}, Lv/c;->e()I

    .line 419
    .line 420
    .line 421
    move-result v4

    .line 422
    add-int/2addr v4, v6

    .line 423
    invoke-virtual {v5}, Lv/d;->k()I

    .line 424
    .line 425
    .line 426
    move-result v10

    .line 427
    add-int/2addr v10, v4

    .line 428
    invoke-virtual {v5, v4, v10}, Lv/d;->K(II)V

    .line 429
    .line 430
    .line 431
    invoke-static {v7, v5, v1}, Lw/h;->i(ILv/d;Ly/f;)V

    .line 432
    .line 433
    .line 434
    goto/16 :goto_3

    .line 435
    .line 436
    :cond_1a
    if-ne v4, v11, :cond_1b

    .line 437
    .line 438
    iget-object v4, v10, Lv/c;->f:Lv/c;

    .line 439
    .line 440
    if-nez v4, :cond_1b

    .line 441
    .line 442
    invoke-virtual {v11}, Lv/c;->e()I

    .line 443
    .line 444
    .line 445
    move-result v4

    .line 446
    sub-int v4, v6, v4

    .line 447
    .line 448
    invoke-virtual {v5}, Lv/d;->k()I

    .line 449
    .line 450
    .line 451
    move-result v10

    .line 452
    sub-int v10, v4, v10

    .line 453
    .line 454
    invoke-virtual {v5, v10, v4}, Lv/d;->K(II)V

    .line 455
    .line 456
    .line 457
    invoke-static {v7, v5, v1}, Lw/h;->i(ILv/d;Ly/f;)V

    .line 458
    .line 459
    .line 460
    goto/16 :goto_3

    .line 461
    .line 462
    :cond_1b
    if-eqz v12, :cond_f

    .line 463
    .line 464
    invoke-virtual {v5}, Lv/d;->y()Z

    .line 465
    .line 466
    .line 467
    move-result v4

    .line 468
    if-nez v4, :cond_f

    .line 469
    .line 470
    invoke-static {v7, v5, v1}, Lw/h;->f(ILv/d;Ly/f;)V

    .line 471
    .line 472
    .line 473
    goto/16 :goto_3

    .line 474
    .line 475
    :cond_1c
    const/4 v3, 0x6

    .line 476
    invoke-virtual {v0, v3}, Lv/d;->i(I)Lv/c;

    .line 477
    .line 478
    .line 479
    move-result-object v3

    .line 480
    iget-object v4, v3, Lv/c;->a:Ljava/util/HashSet;

    .line 481
    .line 482
    if-eqz v4, :cond_22

    .line 483
    .line 484
    iget-boolean v4, v3, Lv/c;->c:Z

    .line 485
    .line 486
    if-eqz v4, :cond_22

    .line 487
    .line 488
    invoke-virtual {v3}, Lv/c;->d()I

    .line 489
    .line 490
    .line 491
    move-result v4

    .line 492
    iget-object v3, v3, Lv/c;->a:Ljava/util/HashSet;

    .line 493
    .line 494
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 495
    .line 496
    .line 497
    move-result-object v3

    .line 498
    :cond_1d
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 499
    .line 500
    .line 501
    move-result v5

    .line 502
    if-eqz v5, :cond_22

    .line 503
    .line 504
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v5

    .line 508
    check-cast v5, Lv/c;

    .line 509
    .line 510
    iget-object v6, v5, Lv/c;->d:Lv/d;

    .line 511
    .line 512
    add-int/lit8 v7, p0, 0x1

    .line 513
    .line 514
    invoke-static {v6}, Lw/h;->a(Lv/d;)Z

    .line 515
    .line 516
    .line 517
    move-result v9

    .line 518
    invoke-virtual {v6}, Lv/d;->z()Z

    .line 519
    .line 520
    .line 521
    move-result v10

    .line 522
    if-eqz v10, :cond_1e

    .line 523
    .line 524
    if-eqz v9, :cond_1e

    .line 525
    .line 526
    new-instance v10, Lw/b;

    .line 527
    .line 528
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 529
    .line 530
    .line 531
    invoke-static {v6, v1, v10}, Lv/e;->V(Lv/d;Ly/f;Lw/b;)V

    .line 532
    .line 533
    .line 534
    :cond_1e
    iget-object v10, v6, Lv/d;->p0:[I

    .line 535
    .line 536
    aget v10, v10, v8

    .line 537
    .line 538
    if-ne v10, v2, :cond_1f

    .line 539
    .line 540
    if-eqz v9, :cond_1d

    .line 541
    .line 542
    :cond_1f
    invoke-virtual {v6}, Lv/d;->z()Z

    .line 543
    .line 544
    .line 545
    move-result v9

    .line 546
    if-eqz v9, :cond_20

    .line 547
    .line 548
    goto :goto_8

    .line 549
    :cond_20
    iget-object v9, v6, Lv/d;->M:Lv/c;

    .line 550
    .line 551
    if-ne v5, v9, :cond_1d

    .line 552
    .line 553
    invoke-virtual {v5}, Lv/c;->e()I

    .line 554
    .line 555
    .line 556
    move-result v5

    .line 557
    add-int/2addr v5, v4

    .line 558
    iget-boolean v10, v6, Lv/d;->E:Z

    .line 559
    .line 560
    if-nez v10, :cond_21

    .line 561
    .line 562
    goto :goto_9

    .line 563
    :cond_21
    iget v10, v6, Lv/d;->a0:I

    .line 564
    .line 565
    sub-int v10, v5, v10

    .line 566
    .line 567
    iget v11, v6, Lv/d;->V:I

    .line 568
    .line 569
    add-int/2addr v11, v10

    .line 570
    iput v10, v6, Lv/d;->Z:I

    .line 571
    .line 572
    iget-object v12, v6, Lv/d;->J:Lv/c;

    .line 573
    .line 574
    invoke-virtual {v12, v10}, Lv/c;->l(I)V

    .line 575
    .line 576
    .line 577
    iget-object v10, v6, Lv/d;->L:Lv/c;

    .line 578
    .line 579
    invoke-virtual {v10, v11}, Lv/c;->l(I)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v9, v5}, Lv/c;->l(I)V

    .line 583
    .line 584
    .line 585
    iput-boolean v8, v6, Lv/d;->l:Z

    .line 586
    .line 587
    :goto_9
    :try_start_0
    invoke-static {v7, v6, v1}, Lw/h;->i(ILv/d;Ly/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 588
    .line 589
    .line 590
    goto :goto_8

    .line 591
    :catchall_0
    move-exception v0

    .line 592
    move-object v1, v0

    .line 593
    throw v1

    .line 594
    :cond_22
    iput-boolean v8, v0, Lv/d;->n:Z

    .line 595
    .line 596
    return-void
.end method
