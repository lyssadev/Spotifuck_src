.class public final Landroid/support/v4/media/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic b:I


# instance fields
.field public final a:Landroid/support/v4/media/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "MediaBrowserCompat"

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/ComponentName;Lf0/b;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1a

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    new-instance v0, Landroid/support/v4/media/e;

    .line 11
    .line 12
    invoke-direct {v0, p1, p2, p3}, Landroid/support/v4/media/c;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Lf0/b;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Landroid/support/v4/media/f;->a:Landroid/support/v4/media/c;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 v1, 0x17

    .line 19
    .line 20
    if-lt v0, v1, :cond_1

    .line 21
    .line 22
    new-instance v0, Landroid/support/v4/media/d;

    .line 23
    .line 24
    invoke-direct {v0, p1, p2, p3}, Landroid/support/v4/media/c;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Lf0/b;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Landroid/support/v4/media/f;->a:Landroid/support/v4/media/c;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    new-instance v0, Landroid/support/v4/media/c;

    .line 31
    .line 32
    invoke-direct {v0, p1, p2, p3}, Landroid/support/v4/media/c;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Lf0/b;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Landroid/support/v4/media/f;->a:Landroid/support/v4/media/c;

    .line 36
    .line 37
    :goto_0
    return-void
.end method
