.class public final Ld0/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LA/b;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lb/d;

.field public final synthetic e:LA/b;


# direct methods
.method public constructor <init>(LA/b;LA/b;Ljava/lang/String;Landroid/os/Bundle;Lb/d;)V
    .locals 0

    const/4 p4, 0x1

    iput p4, p0, Ld0/p;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/p;->e:LA/b;

    iput-object p2, p0, Ld0/p;->b:LA/b;

    iput-object p3, p0, Ld0/p;->c:Ljava/lang/String;

    iput-object p5, p0, Ld0/p;->d:Lb/d;

    return-void
.end method

.method public constructor <init>(LA/b;LA/b;Ljava/lang/String;Lb/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ld0/p;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/p;->e:LA/b;

    iput-object p2, p0, Ld0/p;->b:LA/b;

    iput-object p3, p0, Ld0/p;->c:Ljava/lang/String;

    iput-object p4, p0, Ld0/p;->d:Lb/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Ld0/p;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ld0/p;->b:LA/b;

    .line 7
    .line 8
    iget-object v0, v0, LA/b;->g:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroid/os/Messenger;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, Ld0/p;->e:LA/b;

    .line 17
    .line 18
    iget-object v2, v1, LA/b;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Ld0/q;

    .line 21
    .line 22
    iget-object v2, v2, Ld0/q;->j:Lr/b;

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-virtual {v2, v0, v3}, Lr/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ld0/c;

    .line 30
    .line 31
    iget-object v2, p0, Ld0/p;->c:Ljava/lang/String;

    .line 32
    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v1, "search for callback that isn\'t registered query="

    .line 38
    .line 39
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-string v1, "MBServiceCompat"

    .line 50
    .line 51
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    iget-object v0, v1, LA/b;->g:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Ld0/q;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance v0, Ld0/b;

    .line 63
    .line 64
    iget-object v1, p0, Ld0/p;->d:Lb/d;

    .line 65
    .line 66
    const/4 v4, 0x1

    .line 67
    invoke-direct {v0, v2, v1, v4}, Ld0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 68
    .line 69
    .line 70
    const/4 v1, 0x4

    .line 71
    iput v1, v0, Ld0/k;->d:I

    .line 72
    .line 73
    invoke-virtual {v0, v3}, Ld0/k;->d(Ljava/util/ArrayList;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ld0/k;->b()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_1

    .line 81
    .line 82
    :goto_0
    return-void

    .line 83
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 84
    .line 85
    new-instance v1, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    const-string v3, "onSearch must call detach() or sendResult() before returning for query="

    .line 88
    .line 89
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw v0

    .line 103
    :pswitch_0
    iget-object v0, p0, Ld0/p;->b:LA/b;

    .line 104
    .line 105
    iget-object v0, v0, LA/b;->g:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, Landroid/os/Messenger;

    .line 108
    .line 109
    invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iget-object v1, p0, Ld0/p;->e:LA/b;

    .line 114
    .line 115
    iget-object v2, v1, LA/b;->g:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v2, Ld0/q;

    .line 118
    .line 119
    iget-object v2, v2, Ld0/q;->j:Lr/b;

    .line 120
    .line 121
    const/4 v3, 0x0

    .line 122
    invoke-virtual {v2, v0, v3}, Lr/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    check-cast v0, Ld0/c;

    .line 127
    .line 128
    iget-object v2, p0, Ld0/p;->c:Ljava/lang/String;

    .line 129
    .line 130
    if-nez v0, :cond_2

    .line 131
    .line 132
    new-instance v0, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    const-string v1, "getMediaItem for callback that isn\'t registered id="

    .line 135
    .line 136
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    const-string v1, "MBServiceCompat"

    .line 147
    .line 148
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_2
    iget-object v0, v1, LA/b;->g:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v0, Ld0/q;

    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    new-instance v0, Ld0/b;

    .line 160
    .line 161
    iget-object v1, p0, Ld0/p;->d:Lb/d;

    .line 162
    .line 163
    const/4 v4, 0x0

    .line 164
    invoke-direct {v0, v2, v1, v4}, Ld0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 165
    .line 166
    .line 167
    const/4 v1, 0x2

    .line 168
    iput v1, v0, Ld0/k;->d:I

    .line 169
    .line 170
    invoke-virtual {v0, v3}, Ld0/k;->d(Ljava/util/ArrayList;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0}, Ld0/k;->b()Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-eqz v0, :cond_3

    .line 178
    .line 179
    :goto_1
    return-void

    .line 180
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 181
    .line 182
    new-instance v1, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    const-string v3, "onLoadItem must call detach() or sendResult() before returning for id="

    .line 185
    .line 186
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    throw v0

    .line 200
    nop

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
