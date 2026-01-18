.class public final Ld0/b;
.super Ld0/k;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Ld0/b;->e:I

    iput-object p2, p0, Ld0/b;->f:Ljava/lang/Object;

    invoke-direct {p0, p1}, Ld0/k;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget v0, p0, Ld0/b;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ld0/k;->a()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object v0, p0, Ld0/b;->f:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, LA/b;

    .line 13
    .line 14
    iget-object v0, v0, LA/b;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Landroid/service/media/MediaBrowserService$Result;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/service/media/MediaBrowserService$Result;->detach()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    iget v0, p0, Ld0/b;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/16 v0, 0x18

    .line 11
    .line 12
    if-lt p1, v0, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 45
    .line 46
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-virtual {v1, v2, v3}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->writeToParcel(Landroid/os/Parcel;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move-object p1, v0

    .line 59
    :goto_1
    iget-object v0, p0, Ld0/b;->f:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, LA/b;

    .line 62
    .line 63
    invoke-virtual {v0, p1}, LA/b;->D(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_0
    iget v0, p0, Ld0/k;->d:I

    .line 68
    .line 69
    and-int/lit8 v0, v0, 0x4

    .line 70
    .line 71
    iget-object v1, p0, Ld0/b;->f:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, Lb/d;

    .line 74
    .line 75
    if-nez v0, :cond_4

    .line 76
    .line 77
    if-nez p1, :cond_3

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    new-instance v0, Landroid/os/Bundle;

    .line 81
    .line 82
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 83
    .line 84
    .line 85
    const/4 v2, 0x0

    .line 86
    new-array v3, v2, [Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 87
    .line 88
    invoke-interface {p1, v3}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    check-cast p1, [Landroid/os/Parcelable;

    .line 93
    .line 94
    const-string v3, "search_results"

    .line 95
    .line 96
    invoke-virtual {v0, v3, p1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, v2, v0}, Lb/d;->b(ILandroid/os/Bundle;)V

    .line 100
    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_4
    :goto_2
    const/4 p1, -0x1

    .line 104
    const/4 v0, 0x0

    .line 105
    invoke-virtual {v1, p1, v0}, Lb/d;->b(ILandroid/os/Bundle;)V

    .line 106
    .line 107
    .line 108
    :goto_3
    return-void

    .line 109
    :pswitch_1
    check-cast p1, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 110
    .line 111
    iget v0, p0, Ld0/k;->d:I

    .line 112
    .line 113
    and-int/lit8 v0, v0, 0x2

    .line 114
    .line 115
    iget-object v1, p0, Ld0/b;->f:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v1, Lb/d;

    .line 118
    .line 119
    if-eqz v0, :cond_5

    .line 120
    .line 121
    const/4 p1, -0x1

    .line 122
    const/4 v0, 0x0

    .line 123
    invoke-virtual {v1, p1, v0}, Lb/d;->b(ILandroid/os/Bundle;)V

    .line 124
    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_5
    new-instance v0, Landroid/os/Bundle;

    .line 128
    .line 129
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 130
    .line 131
    .line 132
    const-string v2, "media_item"

    .line 133
    .line 134
    invoke-virtual {v0, v2, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 135
    .line 136
    .line 137
    const/4 p1, 0x0

    .line 138
    invoke-virtual {v1, p1, v0}, Lb/d;->b(ILandroid/os/Bundle;)V

    .line 139
    .line 140
    .line 141
    :goto_4
    return-void

    .line 142
    nop

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
