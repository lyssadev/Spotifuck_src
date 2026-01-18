.class public final Lm1/r;
.super Lh1/a;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lm1/q;


# direct methods
.method public varargs constructor <init>(Lm1/q;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm1/r;->b:Lm1/q;

    .line 2
    .line 3
    const-string p1, "OkHttp %s settings"

    .line 4
    .line 5
    invoke-direct {p0, p1, p2}, Lh1/a;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm1/r;->b:Lm1/q;

    .line 2
    .line 3
    iget-object v0, v0, Lm1/q;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lm1/s;

    .line 6
    .line 7
    iget-object v1, v0, Lm1/s;->b:Lm1/o;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lm1/o;->a(Lm1/s;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
