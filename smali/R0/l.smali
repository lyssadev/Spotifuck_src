.class public final synthetic LR0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic f:Lit/deviato/spotifuck/SettingsActivity$a;


# direct methods
.method public synthetic constructor <init>(Lit/deviato/spotifuck/SettingsActivity$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR0/l;->f:Lit/deviato/spotifuck/SettingsActivity$a;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    iget-object p1, p0, LR0/l;->f:Lit/deviato/spotifuck/SettingsActivity$a;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 p2, 0x1

    .line 7
    sput-boolean p2, Lit/deviato/spotifuck/MainActivity;->S:Z

    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/fragment/app/r;->E()Lh/l;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 14
    .line 15
    .line 16
    return-void
.end method
