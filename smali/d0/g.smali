.class public final Ld0/g;
.super Ld0/k;
.source "SourceFile"


# instance fields
.field public final synthetic e:LA/b;

.field public final synthetic f:Landroid/os/Bundle;

.field public final synthetic g:Ld0/i;


# direct methods
.method public constructor <init>(Ld0/i;Ljava/lang/String;LA/b;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld0/g;->g:Ld0/i;

    .line 2
    .line 3
    iput-object p3, p0, Ld0/g;->e:LA/b;

    .line 4
    .line 5
    iput-object p4, p0, Ld0/g;->f:Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-direct {p0, p2}, Ld0/k;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Ld0/g;->e:LA/b;

    .line 2
    .line 3
    iget-object v0, v0, LA/b;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/service/media/MediaBrowserService$Result;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/service/media/MediaBrowserService$Result;->detach()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final c(Ljava/util/ArrayList;)V
    .locals 5

    .line 1
    iget-object v0, p0, Ld0/g;->e:LA/b;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {v0, p1}, LA/b;->D(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    iget v1, p0, Ld0/k;->d:I

    .line 11
    .line 12
    and-int/lit8 v1, v1, 0x1

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget-object v1, p0, Ld0/g;->g:Ld0/i;

    .line 17
    .line 18
    iget-object v1, v1, Ld0/i;->k:Ld0/q;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Ld0/g;->f:Landroid/os/Bundle;

    .line 24
    .line 25
    invoke-static {p1, v1}, Ld0/q;->a(Ljava/util/List;Landroid/os/Bundle;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 53
    .line 54
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    const/4 v4, 0x0

    .line 59
    invoke-virtual {v2, v3, v4}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->writeToParcel(Landroid/os/Parcel;I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    invoke-virtual {v0, v1}, LA/b;->D(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :goto_1
    return-void
.end method
