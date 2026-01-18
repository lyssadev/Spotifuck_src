.class public final Lb1/b;
.super Lb1/a;
.source "SourceFile"


# instance fields
.field public final c:LQ0/c;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lb1/d;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LQ0/c;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1}, LQ0/c;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lb1/b;->c:LQ0/c;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b()Ljava/util/Random;
    .locals 2

    .line 1
    iget-object v0, p0, Lb1/b;->c:LQ0/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "implStorage.get()"

    .line 8
    .line 9
    invoke-static {v1, v0}, LZ0/c;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Ljava/util/Random;

    .line 13
    .line 14
    return-object v0
.end method
