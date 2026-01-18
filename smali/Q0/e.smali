.class public final LQ0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LQ0/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget v1, p0, LQ0/e;->a:I

    .line 3
    .line 4
    packed-switch v1, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    :try_start_0
    const-string v1, "EmojiCompat.EmojiCompatInitializer.run"

    .line 8
    .line 9
    sget v2, LJ/k;->a:I

    .line 10
    .line 11
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    sget-object v1, Landroidx/emoji2/text/j;->k:Landroidx/emoji2/text/j;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    :cond_0
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-static {}, Landroidx/emoji2/text/j;->a()Landroidx/emoji2/text/j;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Landroidx/emoji2/text/j;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    :goto_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :goto_1
    sget v1, LJ/k;->a:I

    .line 36
    .line 37
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 38
    .line 39
    .line 40
    throw v0

    .line 41
    :pswitch_0
    sget-object v1, Lit/deviato/spotifuck/AppSingleton;->g:Ljava/lang/ref/WeakReference;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Lit/deviato/spotifuck/MainActivity;

    .line 48
    .line 49
    const v2, 0x7f10007b

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-static {v2}, LR0/f;->deferMessage(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    new-instance v2, LR0/a;

    .line 60
    .line 61
    const/4 v3, 0x4

    .line 62
    invoke-direct {v2, v1, v3}, LR0/a;-><init>(Lit/deviato/spotifuck/MainActivity;I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 66
    .line 67
    .line 68
    sput v0, Lit/deviato/spotifuck/AppSingleton;->A:I

    .line 69
    .line 70
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->i:Landroid/content/SharedPreferences$Editor;

    .line 71
    .line 72
    const-string v1, "AutoSleep"

    .line 73
    .line 74
    const-string v2, "0"

    .line 75
    .line 76
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 77
    .line 78
    .line 79
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->i:Landroid/content/SharedPreferences$Editor;

    .line 80
    .line 81
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 82
    .line 83
    .line 84
    sget-object v0, Lit/deviato/spotifuck/WebService;->n:Landroid/support/v4/media/session/t;

    .line 85
    .line 86
    invoke-static {}, Lit/deviato/spotifuck/AppSingleton;->a()V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :pswitch_1
    sget-object v0, Lit/deviato/spotifuck/AppSingleton;->g:Ljava/lang/ref/WeakReference;

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    check-cast v0, Lit/deviato/spotifuck/MainActivity;

    .line 97
    .line 98
    const v1, 0x7f10007a

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-static {v1}, LR0/f;->deferMessage(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    new-instance v1, LR0/a;

    .line 109
    .line 110
    const/4 v2, 0x3

    .line 111
    invoke-direct {v1, v0, v2}, LR0/a;-><init>(Lit/deviato/spotifuck/MainActivity;I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 115
    .line 116
    .line 117
    sget-object v0, Lit/deviato/spotifuck/WebService;->n:Landroid/support/v4/media/session/t;

    .line 118
    .line 119
    invoke-static {}, Lit/deviato/spotifuck/AppSingleton;->a()V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :pswitch_2
    new-instance v0, Ljava/lang/RuntimeException;

    .line 124
    .line 125
    const/4 v0, 0x0

    .line 126
    throw v0

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
