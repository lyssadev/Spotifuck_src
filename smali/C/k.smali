.class public final LC/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lit/deviato/spotifuck/WebService;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/ArrayList;

.field public e:Ljava/lang/CharSequence;

.field public f:Ljava/lang/CharSequence;

.field public g:Landroid/app/PendingIntent;

.field public h:Landroidx/core/graphics/drawable/IconCompat;

.field public i:I

.field public final j:Z

.field public k:Landroid/support/v4/media/session/t;

.field public l:Z

.field public m:Landroid/os/Bundle;

.field public n:I

.field public final o:Ljava/lang/String;

.field public final p:Z

.field public final q:Landroid/app/Notification;

.field public final r:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lit/deviato/spotifuck/WebService;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LC/k;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LC/k;->c:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, LC/k;->d:Ljava/util/ArrayList;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, LC/k;->j:Z

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    iput v1, p0, LC/k;->n:I

    .line 30
    .line 31
    new-instance v2, Landroid/app/Notification;

    .line 32
    .line 33
    invoke-direct {v2}, Landroid/app/Notification;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v2, p0, LC/k;->q:Landroid/app/Notification;

    .line 37
    .line 38
    iput-object p1, p0, LC/k;->a:Lit/deviato/spotifuck/WebService;

    .line 39
    .line 40
    const-string p1, "SpotifuckChannel"

    .line 41
    .line 42
    iput-object p1, p0, LC/k;->o:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 45
    .line 46
    .line 47
    move-result-wide v3

    .line 48
    iput-wide v3, v2, Landroid/app/Notification;->when:J

    .line 49
    .line 50
    const/4 p1, -0x1

    .line 51
    iput p1, v2, Landroid/app/Notification;->audioStreamType:I

    .line 52
    .line 53
    iput v1, p0, LC/k;->i:I

    .line 54
    .line 55
    new-instance p1, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, LC/k;->r:Ljava/util/ArrayList;

    .line 61
    .line 62
    iput-boolean v0, p0, LC/k;->p:Z

    .line 63
    .line 64
    return-void
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/16 v1, 0x1400

    .line 9
    .line 10
    if-le v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_1
    return-object p0
.end method


# virtual methods
.method public final a()Landroid/app/Notification;
    .locals 19

    move-object/from16 v0, p0

    .line 1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 3
    iget-object v2, v0, LC/k;->a:Lit/deviato/spotifuck/WebService;

    .line 4
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v4, v0, LC/k;->o:Ljava/lang/String;

    const/16 v5, 0x1a

    if-lt v3, v5, :cond_0

    .line 5
    invoke-static {v2, v4}, LC/p;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/Notification$Builder;

    move-result-object v6

    goto :goto_0

    .line 6
    :cond_0
    new-instance v6, Landroid/app/Notification$Builder;

    iget-object v7, v0, LC/k;->a:Lit/deviato/spotifuck/WebService;

    invoke-direct {v6, v7}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    .line 7
    :goto_0
    iget-object v7, v0, LC/k;->q:Landroid/app/Notification;

    .line 8
    iget-wide v8, v7, Landroid/app/Notification;->when:J

    invoke-virtual {v6, v8, v9}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    move-result-object v8

    iget v9, v7, Landroid/app/Notification;->icon:I

    iget v10, v7, Landroid/app/Notification;->iconLevel:I

    .line 9
    invoke-virtual {v8, v9, v10}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;

    move-result-object v8

    iget-object v9, v7, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 10
    invoke-virtual {v8, v9}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v8

    iget-object v9, v7, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    const/4 v10, 0x0

    .line 11
    invoke-virtual {v8, v9, v10}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v8

    iget-object v9, v7, Landroid/app/Notification;->vibrate:[J

    .line 12
    invoke-virtual {v8, v9}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    move-result-object v8

    iget v9, v7, Landroid/app/Notification;->ledARGB:I

    iget v11, v7, Landroid/app/Notification;->ledOnMS:I

    iget v12, v7, Landroid/app/Notification;->ledOffMS:I

    .line 13
    invoke-virtual {v8, v9, v11, v12}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    move-result-object v8

    iget v9, v7, Landroid/app/Notification;->flags:I

    and-int/lit8 v9, v9, 0x2

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eqz v9, :cond_1

    const/4 v9, 0x1

    goto :goto_1

    :cond_1
    const/4 v9, 0x0

    .line 14
    :goto_1
    invoke-virtual {v8, v9}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    move-result-object v8

    iget v9, v7, Landroid/app/Notification;->flags:I

    and-int/lit8 v9, v9, 0x8

    if-eqz v9, :cond_2

    const/4 v9, 0x1

    goto :goto_2

    :cond_2
    const/4 v9, 0x0

    .line 15
    :goto_2
    invoke-virtual {v8, v9}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    move-result-object v8

    iget v9, v7, Landroid/app/Notification;->flags:I

    and-int/lit8 v9, v9, 0x10

    if-eqz v9, :cond_3

    const/4 v9, 0x1

    goto :goto_3

    :cond_3
    const/4 v9, 0x0

    .line 16
    :goto_3
    invoke-virtual {v8, v9}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    move-result-object v8

    iget v9, v7, Landroid/app/Notification;->defaults:I

    .line 17
    invoke-virtual {v8, v9}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    move-result-object v8

    iget-object v9, v0, LC/k;->e:Ljava/lang/CharSequence;

    .line 18
    invoke-virtual {v8, v9}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v8

    iget-object v9, v0, LC/k;->f:Ljava/lang/CharSequence;

    .line 19
    invoke-virtual {v8, v9}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v8

    .line 20
    invoke-virtual {v8, v10}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v8

    iget-object v9, v0, LC/k;->g:Landroid/app/PendingIntent;

    .line 21
    invoke-virtual {v8, v9}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v8

    iget-object v9, v7, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 22
    invoke-virtual {v8, v9}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v8

    iget v9, v7, Landroid/app/Notification;->flags:I

    and-int/lit16 v9, v9, 0x80

    if-eqz v9, :cond_4

    const/4 v9, 0x1

    goto :goto_4

    :cond_4
    const/4 v9, 0x0

    .line 23
    :goto_4
    invoke-virtual {v8, v10, v9}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;

    move-result-object v8

    .line 24
    invoke-virtual {v8, v11}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;

    move-result-object v8

    .line 25
    invoke-virtual {v8, v11, v11, v11}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;

    const/16 v8, 0x17

    if-ge v3, v8, :cond_a

    .line 26
    iget-object v2, v0, LC/k;->h:Landroidx/core/graphics/drawable/IconCompat;

    if-nez v2, :cond_6

    :cond_5
    move-object v2, v10

    goto :goto_5

    .line 27
    :cond_6
    iget v9, v2, Landroidx/core/graphics/drawable/IconCompat;->a:I

    const/4 v13, -0x1

    if-ne v9, v13, :cond_7

    if-lt v3, v8, :cond_7

    .line 28
    iget-object v2, v2, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    instance-of v3, v2, Landroid/graphics/Bitmap;

    if-eqz v3, :cond_5

    .line 29
    check-cast v2, Landroid/graphics/Bitmap;

    goto :goto_5

    :cond_7
    if-ne v9, v12, :cond_8

    .line 30
    iget-object v2, v2, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    check-cast v2, Landroid/graphics/Bitmap;

    goto :goto_5

    :cond_8
    const/4 v3, 0x5

    if-ne v9, v3, :cond_9

    .line 31
    iget-object v2, v2, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    check-cast v2, Landroid/graphics/Bitmap;

    invoke-static {v2, v12}, Landroidx/core/graphics/drawable/IconCompat;->a(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 32
    :goto_5
    invoke-virtual {v6, v2}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;

    goto :goto_7

    .line 33
    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "called getBitmap() on "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 34
    :cond_a
    iget-object v3, v0, LC/k;->h:Landroidx/core/graphics/drawable/IconCompat;

    if-nez v3, :cond_b

    move-object v2, v10

    goto :goto_6

    :cond_b
    invoke-virtual {v3, v2}, Landroidx/core/graphics/drawable/IconCompat;->e(Lit/deviato/spotifuck/WebService;)Landroid/graphics/drawable/Icon;

    move-result-object v2

    .line 35
    :goto_6
    invoke-static {v6, v2}, LC/n;->b(Landroid/app/Notification$Builder;Landroid/graphics/drawable/Icon;)Landroid/app/Notification$Builder;

    .line 36
    :goto_7
    invoke-virtual {v6, v10}, Landroid/app/Notification$Builder;->setSubText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 37
    invoke-virtual {v2, v11}, Landroid/app/Notification$Builder;->setUsesChronometer(Z)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 38
    iget v3, v0, LC/k;->i:I

    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 39
    iget-object v2, v0, LC/k;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/16 v9, 0x18

    const-string v14, "android.support.allowGeneratedReplies"

    const-string v15, ""

    if-eqz v3, :cond_15

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LC/j;

    .line 40
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 41
    iget-object v12, v3, LC/j;->b:Landroidx/core/graphics/drawable/IconCompat;

    if-nez v12, :cond_c

    .line 42
    iget v12, v3, LC/j;->e:I

    if-eqz v12, :cond_c

    .line 43
    invoke-static {v10, v15, v12}, Landroidx/core/graphics/drawable/IconCompat;->b(Landroid/content/res/Resources;Ljava/lang/String;I)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v12

    iput-object v12, v3, LC/j;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 44
    :cond_c
    iget-object v12, v3, LC/j;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 45
    iget-object v15, v3, LC/j;->g:Landroid/app/PendingIntent;

    iget-object v13, v3, LC/j;->f:Ljava/lang/CharSequence;

    if-lt v5, v8, :cond_e

    if-eqz v12, :cond_d

    .line 46
    invoke-virtual {v12, v10}, Landroidx/core/graphics/drawable/IconCompat;->e(Lit/deviato/spotifuck/WebService;)Landroid/graphics/drawable/Icon;

    move-result-object v12

    goto :goto_9

    :cond_d
    move-object v12, v10

    .line 47
    :goto_9
    invoke-static {v12, v13, v15}, LC/n;->a(Landroid/graphics/drawable/Icon;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Action$Builder;

    move-result-object v12

    goto :goto_b

    :cond_e
    if-eqz v12, :cond_f

    .line 48
    invoke-virtual {v12}, Landroidx/core/graphics/drawable/IconCompat;->c()I

    move-result v12

    goto :goto_a

    :cond_f
    const/4 v12, 0x0

    .line 49
    :goto_a
    invoke-static {v12, v13, v15}, LC/l;->e(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Action$Builder;

    move-result-object v12

    .line 50
    :goto_b
    iget-object v13, v3, LC/j;->a:Landroid/os/Bundle;

    if-eqz v13, :cond_10

    .line 51
    new-instance v15, Landroid/os/Bundle;

    invoke-direct {v15, v13}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    goto :goto_c

    .line 52
    :cond_10
    new-instance v15, Landroid/os/Bundle;

    invoke-direct {v15}, Landroid/os/Bundle;-><init>()V

    .line 53
    :goto_c
    iget-boolean v13, v3, LC/j;->c:Z

    invoke-virtual {v15, v14, v13}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    if-lt v5, v9, :cond_11

    .line 54
    invoke-static {v12, v13}, LC/o;->a(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    .line 55
    :cond_11
    const-string v9, "android.support.action.semanticAction"

    invoke-virtual {v15, v9, v11}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const/16 v9, 0x1c

    if-lt v5, v9, :cond_12

    .line 56
    invoke-static {v12, v11}, LC/q;->b(Landroid/app/Notification$Action$Builder;I)Landroid/app/Notification$Action$Builder;

    :cond_12
    const/16 v9, 0x1d

    if-lt v5, v9, :cond_13

    .line 57
    invoke-static {v12, v11}, LC/r;->c(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    :cond_13
    const/16 v9, 0x1f

    if-lt v5, v9, :cond_14

    .line 58
    invoke-static {v12, v11}, LC/s;->a(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    .line 59
    :cond_14
    const-string v5, "android.support.action.showsUserInterface"

    iget-boolean v3, v3, LC/j;->d:Z

    invoke-virtual {v15, v5, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 60
    invoke-static {v12, v15}, LC/l;->b(Landroid/app/Notification$Action$Builder;Landroid/os/Bundle;)Landroid/app/Notification$Action$Builder;

    .line 61
    invoke-static {v12}, LC/l;->d(Landroid/app/Notification$Action$Builder;)Landroid/app/Notification$Action;

    move-result-object v3

    invoke-static {v6, v3}, LC/l;->a(Landroid/app/Notification$Builder;Landroid/app/Notification$Action;)Landroid/app/Notification$Builder;

    const/16 v5, 0x1a

    goto/16 :goto_8

    .line 62
    :cond_15
    iget-object v2, v0, LC/k;->m:Landroid/os/Bundle;

    if-eqz v2, :cond_16

    .line 63
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 64
    :cond_16
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 65
    iget-boolean v3, v0, LC/k;->j:Z

    invoke-virtual {v6, v3}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 66
    invoke-static {v6, v11}, LC/l;->i(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    .line 67
    invoke-static {v6, v10}, LC/l;->g(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 68
    invoke-static {v6, v10}, LC/l;->j(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 69
    invoke-static {v6, v11}, LC/l;->h(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    .line 70
    invoke-static {v6, v10}, LC/m;->b(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 71
    invoke-static {v6, v11}, LC/m;->c(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 72
    iget v3, v0, LC/k;->n:I

    invoke-static {v6, v3}, LC/m;->f(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 73
    invoke-static {v6, v10}, LC/m;->d(Landroid/app/Notification$Builder;Landroid/app/Notification;)Landroid/app/Notification$Builder;

    .line 74
    iget-object v3, v7, Landroid/app/Notification;->sound:Landroid/net/Uri;

    iget-object v5, v7, Landroid/app/Notification;->audioAttributes:Landroid/media/AudioAttributes;

    invoke-static {v6, v3, v5}, LC/m;->e(Landroid/app/Notification$Builder;Landroid/net/Uri;Ljava/lang/Object;)Landroid/app/Notification$Builder;

    .line 75
    iget-object v3, v0, LC/k;->r:Ljava/util/ArrayList;

    iget-object v5, v0, LC/k;->c:Ljava/util/ArrayList;

    const/16 v7, 0x1c

    if-ge v2, v7, :cond_1b

    if-nez v5, :cond_17

    move-object v2, v10

    goto :goto_d

    .line 76
    :cond_17
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-direct {v2, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 77
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_1a

    :goto_d
    if-nez v2, :cond_18

    goto :goto_e

    :cond_18
    if-nez v3, :cond_19

    move-object v3, v2

    goto :goto_e

    .line 78
    :cond_19
    new-instance v7, Lr/c;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v8

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v12

    add-int/2addr v12, v8

    invoke-direct {v7, v12}, Lr/c;-><init>(I)V

    .line 79
    invoke-virtual {v7, v2}, Lr/c;->addAll(Ljava/util/Collection;)Z

    .line 80
    invoke-virtual {v7, v3}, Lr/c;->addAll(Ljava/util/Collection;)Z

    .line 81
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_e

    .line 82
    :cond_1a
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    new-instance v1, Ljava/lang/ClassCastException;

    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    throw v1

    :cond_1b
    :goto_e
    if-eqz v3, :cond_1c

    .line 85
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1c

    .line 86
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 87
    invoke-static {v6, v3}, LC/m;->a(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    goto :goto_f

    .line 88
    :cond_1c
    iget-object v2, v0, LC/k;->d:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_24

    .line 89
    iget-object v3, v0, LC/k;->m:Landroid/os/Bundle;

    if-nez v3, :cond_1d

    .line 90
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    iput-object v3, v0, LC/k;->m:Landroid/os/Bundle;

    .line 91
    :cond_1d
    iget-object v3, v0, LC/k;->m:Landroid/os/Bundle;

    .line 92
    const-string v7, "android.car.EXTENSIONS"

    invoke-virtual {v3, v7}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v3

    if-nez v3, :cond_1e

    .line 93
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 94
    :cond_1e
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8, v3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 95
    new-instance v12, Landroid/os/Bundle;

    invoke-direct {v12}, Landroid/os/Bundle;-><init>()V

    const/4 v13, 0x0

    .line 96
    :goto_10
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ge v13, v9, :cond_22

    .line 97
    invoke-static {v13}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v9

    .line 98
    invoke-virtual {v2, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v11, v16

    check-cast v11, LC/j;

    .line 99
    new-instance v10, Landroid/os/Bundle;

    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    move-object/from16 v17, v2

    .line 100
    iget-object v2, v11, LC/j;->b:Landroidx/core/graphics/drawable/IconCompat;

    if-nez v2, :cond_1f

    .line 101
    iget v2, v11, LC/j;->e:I

    if-eqz v2, :cond_1f

    move-object/from16 v18, v5

    const/4 v5, 0x0

    .line 102
    invoke-static {v5, v15, v2}, Landroidx/core/graphics/drawable/IconCompat;->b(Landroid/content/res/Resources;Ljava/lang/String;I)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v2

    iput-object v2, v11, LC/j;->b:Landroidx/core/graphics/drawable/IconCompat;

    goto :goto_11

    :cond_1f
    move-object/from16 v18, v5

    .line 103
    :goto_11
    iget-object v2, v11, LC/j;->b:Landroidx/core/graphics/drawable/IconCompat;

    if-eqz v2, :cond_20

    .line 104
    invoke-virtual {v2}, Landroidx/core/graphics/drawable/IconCompat;->c()I

    move-result v2

    goto :goto_12

    :cond_20
    const/4 v2, 0x0

    :goto_12
    const-string v5, "icon"

    invoke-virtual {v10, v5, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 105
    const-string v2, "title"

    iget-object v5, v11, LC/j;->f:Ljava/lang/CharSequence;

    invoke-virtual {v10, v2, v5}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 106
    const-string v2, "actionIntent"

    iget-object v5, v11, LC/j;->g:Landroid/app/PendingIntent;

    invoke-virtual {v10, v2, v5}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 107
    iget-object v2, v11, LC/j;->a:Landroid/os/Bundle;

    if-eqz v2, :cond_21

    .line 108
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5, v2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    goto :goto_13

    .line 109
    :cond_21
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 110
    :goto_13
    iget-boolean v2, v11, LC/j;->c:Z

    invoke-virtual {v5, v14, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 111
    const-string v2, "extras"

    invoke-virtual {v10, v2, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 112
    const-string v2, "remoteInputs"

    const/4 v5, 0x0

    invoke-virtual {v10, v2, v5}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 113
    const-string v2, "showsUserInterface"

    iget-boolean v5, v11, LC/j;->d:Z

    invoke-virtual {v10, v2, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 114
    const-string v2, "semanticAction"

    const/4 v5, 0x0

    invoke-virtual {v10, v2, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 115
    invoke-virtual {v12, v9, v10}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v2, v17

    move-object/from16 v5, v18

    const/4 v10, 0x0

    const/4 v11, 0x0

    goto/16 :goto_10

    :cond_22
    move-object/from16 v18, v5

    .line 116
    const-string v2, "invisible_actions"

    invoke-virtual {v3, v2, v12}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 117
    invoke-virtual {v8, v2, v12}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 118
    iget-object v2, v0, LC/k;->m:Landroid/os/Bundle;

    if-nez v2, :cond_23

    .line 119
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    iput-object v2, v0, LC/k;->m:Landroid/os/Bundle;

    .line 120
    :cond_23
    iget-object v2, v0, LC/k;->m:Landroid/os/Bundle;

    .line 121
    invoke-virtual {v2, v7, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 122
    invoke-virtual {v1, v7, v8}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_14

    :cond_24
    move-object/from16 v18, v5

    .line 123
    :goto_14
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x18

    if-lt v2, v3, :cond_25

    .line 124
    iget-object v3, v0, LC/k;->m:Landroid/os/Bundle;

    invoke-virtual {v6, v3}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    const/4 v3, 0x0

    .line 125
    invoke-static {v6, v3}, LC/o;->e(Landroid/app/Notification$Builder;[Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    :goto_15
    const/16 v5, 0x1a

    goto :goto_16

    :cond_25
    const/4 v3, 0x0

    goto :goto_15

    :goto_16
    if-lt v2, v5, :cond_27

    const/4 v5, 0x0

    .line 126
    invoke-static {v6, v5}, LC/p;->b(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 127
    invoke-static {v6, v3}, LC/p;->e(Landroid/app/Notification$Builder;Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 128
    invoke-static {v6, v3}, LC/p;->f(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    const-wide/16 v7, 0x0

    .line 129
    invoke-static {v6, v7, v8}, LC/p;->g(Landroid/app/Notification$Builder;J)Landroid/app/Notification$Builder;

    .line 130
    invoke-static {v6, v5}, LC/p;->d(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 131
    iget-boolean v7, v0, LC/k;->l:Z

    if-eqz v7, :cond_26

    .line 132
    invoke-static {v6, v5}, LC/p;->c(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    .line 133
    :cond_26
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_27

    .line 134
    invoke-virtual {v6, v3}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    move-result-object v4

    .line 135
    invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    move-result-object v4

    .line 136
    invoke-virtual {v4, v5, v5, v5}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    move-result-object v4

    .line 137
    invoke-virtual {v4, v3}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    :cond_27
    const/16 v3, 0x1c

    if-lt v2, v3, :cond_28

    .line 138
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_29

    :cond_28
    const/16 v3, 0x1d

    goto :goto_17

    :cond_29
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 139
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    new-instance v1, Ljava/lang/ClassCastException;

    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    throw v1

    :goto_17
    if-lt v2, v3, :cond_2a

    .line 141
    iget-boolean v2, v0, LC/k;->p:Z

    invoke-static {v6, v2}, LC/r;->a(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    const/4 v2, 0x0

    .line 142
    invoke-static {v6, v2}, LC/r;->b(Landroid/app/Notification$Builder;Landroid/app/Notification$BubbleMetadata;)Landroid/app/Notification$Builder;

    goto :goto_18

    :cond_2a
    const/4 v2, 0x0

    .line 143
    :goto_18
    iget-object v3, v0, LC/k;->k:Landroid/support/v4/media/session/t;

    if-eqz v3, :cond_2c

    .line 144
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x22

    if-lt v4, v5, :cond_2b

    .line 145
    invoke-static {}, Le0/a;->a()Landroid/app/Notification$MediaStyle;

    move-result-object v4

    .line 146
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v7, 0x0

    .line 147
    invoke-static {v4, v2, v7, v2, v5}, Le0/b;->a(Landroid/app/Notification$MediaStyle;Ljava/lang/CharSequence;ILandroid/app/PendingIntent;Ljava/lang/Boolean;)Landroid/app/Notification$MediaStyle;

    move-result-object v2

    iget-object v4, v3, Landroid/support/v4/media/session/t;->c:Ljava/lang/Object;

    check-cast v4, [I

    iget-object v5, v3, Landroid/support/v4/media/session/t;->d:Ljava/lang/Object;

    check-cast v5, Landroid/support/v4/media/session/MediaSessionCompat$Token;

    invoke-static {v2, v4, v5}, Le0/a;->b(Landroid/app/Notification$MediaStyle;[ILandroid/support/v4/media/session/MediaSessionCompat$Token;)Landroid/app/Notification$MediaStyle;

    move-result-object v2

    .line 148
    invoke-static {v6, v2}, Le0/a;->d(Landroid/app/Notification$Builder;Landroid/app/Notification$MediaStyle;)V

    goto :goto_19

    .line 149
    :cond_2b
    invoke-static {}, Le0/a;->a()Landroid/app/Notification$MediaStyle;

    move-result-object v2

    iget-object v4, v3, Landroid/support/v4/media/session/t;->c:Ljava/lang/Object;

    check-cast v4, [I

    iget-object v5, v3, Landroid/support/v4/media/session/t;->d:Ljava/lang/Object;

    check-cast v5, Landroid/support/v4/media/session/MediaSessionCompat$Token;

    invoke-static {v2, v4, v5}, Le0/a;->b(Landroid/app/Notification$MediaStyle;[ILandroid/support/v4/media/session/MediaSessionCompat$Token;)Landroid/app/Notification$MediaStyle;

    move-result-object v2

    .line 150
    invoke-static {v6, v2}, Le0/a;->d(Landroid/app/Notification$Builder;Landroid/app/Notification$MediaStyle;)V

    .line 151
    :cond_2c
    :goto_19
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1a

    if-lt v2, v4, :cond_2d

    .line 152
    invoke-virtual {v6}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v1

    goto :goto_1a

    :cond_2d
    const/16 v4, 0x18

    if-lt v2, v4, :cond_2e

    .line 153
    invoke-virtual {v6}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v1

    goto :goto_1a

    .line 154
    :cond_2e
    invoke-virtual {v6, v1}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 155
    invoke-virtual {v6}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v1

    :goto_1a
    if-eqz v3, :cond_2f

    .line 156
    iget-object v2, v0, LC/k;->k:Landroid/support/v4/media/session/t;

    .line 157
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_2f
    if-eqz v3, :cond_30

    .line 158
    iget-object v2, v1, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    :cond_30
    return-object v1
.end method

.method public final c(Landroid/support/v4/media/session/t;)V
    .locals 1

    .line 1
    iget-object v0, p0, LC/k;->k:Landroid/support/v4/media/session/t;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, LC/k;->k:Landroid/support/v4/media/session/t;

    .line 6
    .line 7
    iget-object v0, p1, Landroid/support/v4/media/session/t;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, LC/k;

    .line 10
    .line 11
    if-eq v0, p0, :cond_0

    .line 12
    .line 13
    iput-object p0, p1, Landroid/support/v4/media/session/t;->b:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, LC/k;->c(Landroid/support/v4/media/session/t;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method
