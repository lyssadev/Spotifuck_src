.class public final Lg1/f;
.super Lg1/E;
.source "SourceFile"


# instance fields
.field public final a:Li1/f;

.field public final b:Lr1/q;

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Li1/f;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg1/f;->a:Li1/f;

    .line 5
    .line 6
    iput-object p2, p0, Lg1/f;->c:Ljava/lang/String;

    .line 7
    .line 8
    iget-object p2, p1, Li1/f;->c:[Lr1/v;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    aget-object p2, p2, v0

    .line 12
    .line 13
    new-instance v0, Lg1/e;

    .line 14
    .line 15
    invoke-direct {v0, p2, p1}, Lg1/e;-><init>(Lr1/v;Li1/f;)V

    .line 16
    .line 17
    .line 18
    sget-object p1, Lr1/o;->a:Ljava/util/logging/Logger;

    .line 19
    .line 20
    new-instance p1, Lr1/q;

    .line 21
    .line 22
    invoke-direct {p1, v0}, Lr1/q;-><init>(Lr1/v;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lg1/f;->b:Lr1/q;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final f()J
    .locals 3

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    :try_start_0
    iget-object v2, p0, Lg1/f;->c:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    :catch_0
    :cond_0
    return-wide v0
.end method

.method public final g()Lr1/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lg1/f;->b:Lr1/q;

    .line 2
    .line 3
    return-object v0
.end method
