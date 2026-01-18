.class public final LR0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public final b:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public c:Landroidx/activity/z;

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/H;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LR0/h;->d:I

    .line 5
    iput-object p1, p0, LR0/h;->e:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LR0/h;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(Lit/deviato/spotifuck/MainActivity;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LR0/h;->d:I

    .line 4
    iput-object p1, p0, LR0/h;->e:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LR0/h;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, LR0/h;->a:Z

    .line 3
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, LR0/h;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-void
.end method
