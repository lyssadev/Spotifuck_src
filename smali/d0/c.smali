.class public final Ld0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:I

.field public final d:LA/b;

.field public final e:Ljava/util/HashMap;

.field public f:Landroid/support/v4/media/i;

.field public final synthetic g:Ld0/q;


# direct methods
.method public constructor <init>(Ld0/q;Ljava/lang/String;IILA/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld0/c;->g:Ld0/q;

    .line 5
    .line 6
    new-instance p1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Ld0/c;->e:Ljava/util/HashMap;

    .line 12
    .line 13
    iput-object p2, p0, Ld0/c;->a:Ljava/lang/String;

    .line 14
    .line 15
    iput p3, p0, Ld0/c;->b:I

    .line 16
    .line 17
    iput p4, p0, Ld0/c;->c:I

    .line 18
    .line 19
    if-eqz p2, :cond_2

    .line 20
    .line 21
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 28
    .line 29
    const/16 v0, 0x1c

    .line 30
    .line 31
    if-lt p1, v0, :cond_0

    .line 32
    .line 33
    invoke-static {p2, p3, p4}, LH0/f;->v(Ljava/lang/String;II)V

    .line 34
    .line 35
    .line 36
    :cond_0
    iput-object p5, p0, Ld0/c;->d:LA/b;

    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 40
    .line 41
    const-string p2, "packageName should be nonempty"

    .line 42
    .line 43
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1

    .line 47
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 48
    .line 49
    const-string p2, "package shouldn\'t be null"

    .line 50
    .line 51
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1
.end method


# virtual methods
.method public final binderDied()V
    .locals 3

    .line 1
    iget-object v0, p0, Ld0/c;->g:Ld0/q;

    .line 2
    .line 3
    iget-object v0, v0, Ld0/q;->k:LQ0/j;

    .line 4
    .line 5
    new-instance v1, LN0/B;

    .line 6
    .line 7
    const/4 v2, 0x7

    .line 8
    invoke-direct {v1, v2, p0}, LN0/B;-><init>(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method
