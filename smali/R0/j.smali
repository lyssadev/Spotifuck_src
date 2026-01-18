.class public final synthetic LR0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/m;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lit/deviato/spotifuck/SettingsActivity$a;


# direct methods
.method public synthetic constructor <init>(Lit/deviato/spotifuck/SettingsActivity$a;I)V
    .locals 0

    .line 1
    iput p2, p0, LR0/j;->f:I

    iput-object p1, p0, LR0/j;->g:Lit/deviato/spotifuck/SettingsActivity$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/preference/Preference;)V
    .locals 5

    .line 1
    iget p1, p0, LR0/j;->f:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, LK/j;

    .line 7
    .line 8
    iget-object v0, p0, LR0/j;->g:Lit/deviato/spotifuck/SettingsActivity$a;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/fragment/app/r;->F()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {p1, v1}, LK/j;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p1, LK/j;->g:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lh/f;

    .line 20
    .line 21
    iget-object v2, v1, Lh/f;->a:Landroid/view/ContextThemeWrapper;

    .line 22
    .line 23
    const v3, 0x7f100038

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v3}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iput-object v2, v1, Lh/f;->d:Ljava/lang/CharSequence;

    .line 31
    .line 32
    iget-object v2, v1, Lh/f;->a:Landroid/view/ContextThemeWrapper;

    .line 33
    .line 34
    const v3, 0x7f100037

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v3}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    iput-object v3, v1, Lh/f;->f:Ljava/lang/CharSequence;

    .line 42
    .line 43
    new-instance v3, LR0/k;

    .line 44
    .line 45
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    const v4, 0x7f100036

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v4}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    iput-object v4, v1, Lh/f;->i:Ljava/lang/CharSequence;

    .line 56
    .line 57
    iput-object v3, v1, Lh/f;->j:Landroid/content/DialogInterface$OnClickListener;

    .line 58
    .line 59
    new-instance v3, LR0/l;

    .line 60
    .line 61
    invoke-direct {v3, v0}, LR0/l;-><init>(Lit/deviato/spotifuck/SettingsActivity$a;)V

    .line 62
    .line 63
    .line 64
    const v0, 0x7f100039

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v0}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, v1, Lh/f;->g:Ljava/lang/CharSequence;

    .line 72
    .line 73
    iput-object v3, v1, Lh/f;->h:Landroid/content/DialogInterface$OnClickListener;

    .line 74
    .line 75
    invoke-virtual {p1}, LK/j;->a()Lh/i;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_0
    iget-object p1, p0, LR0/j;->g:Lit/deviato/spotifuck/SettingsActivity$a;

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    const/4 v0, 0x1

    .line 89
    sput-boolean v0, Lit/deviato/spotifuck/MainActivity;->R:Z

    .line 90
    .line 91
    invoke-virtual {p1}, Landroidx/fragment/app/r;->E()Lh/l;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
