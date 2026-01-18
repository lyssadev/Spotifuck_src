.class public final Ld0/a;
.super Ld0/k;
.source "SourceFile"


# instance fields
.field public final synthetic e:Ld0/c;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Landroid/os/Bundle;

.field public final synthetic h:Ld0/q;


# direct methods
.method public constructor <init>(Ld0/q;Ljava/lang/Object;Ld0/c;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld0/a;->h:Ld0/q;

    .line 2
    .line 3
    iput-object p3, p0, Ld0/a;->e:Ld0/c;

    .line 4
    .line 5
    iput-object p4, p0, Ld0/a;->f:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p5, p0, Ld0/a;->g:Landroid/os/Bundle;

    .line 8
    .line 9
    invoke-direct {p0, p2}, Ld0/k;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final c(Ljava/util/ArrayList;)V
    .locals 6

    .line 1
    iget-object v0, p0, Ld0/a;->f:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Ld0/a;->h:Ld0/q;

    .line 4
    .line 5
    iget-object v1, v1, Ld0/q;->j:Lr/b;

    .line 6
    .line 7
    iget-object v2, p0, Ld0/a;->e:Ld0/c;

    .line 8
    .line 9
    iget-object v3, v2, Ld0/c;->d:LA/b;

    .line 10
    .line 11
    iget-object v4, v3, LA/b;->g:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v4, Landroid/os/Messenger;

    .line 14
    .line 15
    invoke-virtual {v4}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const/4 v5, 0x0

    .line 20
    invoke-virtual {v1, v4, v5}, Lr/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eq v1, v2, :cond_0

    .line 25
    .line 26
    sget p1, Ld0/q;->m:I

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget v1, p0, Ld0/k;->d:I

    .line 30
    .line 31
    and-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    iget-object v4, p0, Ld0/a;->g:Landroid/os/Bundle;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-static {p1, v4}, Ld0/q;->a(Ljava/util/List;Landroid/os/Bundle;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    :cond_1
    :try_start_0
    invoke-virtual {v3, v0, p1, v4}, LA/b;->y(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catch_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v1, "Calling onLoadChildren() failed for id="

    .line 48
    .line 49
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v0, " package="

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget-object v0, v2, Ld0/c;->a:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    const-string v0, "MBServiceCompat"

    .line 70
    .line 71
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    :goto_0
    return-void
.end method
