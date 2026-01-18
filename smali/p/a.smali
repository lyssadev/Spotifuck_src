.class public final Lp/a;
.super LT0/g;
.source "SourceFile"


# static fields
.field public static volatile m:Lp/a;


# instance fields
.field public final l:Lp/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lp/c;

    .line 5
    .line 6
    invoke-direct {v0}, Lp/c;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lp/a;->l:Lp/c;

    .line 10
    .line 11
    return-void
.end method

.method public static V()Lp/a;
    .locals 2

    .line 1
    sget-object v0, Lp/a;->m:Lp/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lp/a;->m:Lp/a;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const-class v0, Lp/a;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    sget-object v1, Lp/a;->m:Lp/a;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    new-instance v1, Lp/a;

    .line 16
    .line 17
    invoke-direct {v1}, Lp/a;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v1, Lp/a;->m:Lp/a;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    sget-object v0, Lp/a;->m:Lp/a;

    .line 27
    .line 28
    return-object v0

    .line 29
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw v1
.end method
