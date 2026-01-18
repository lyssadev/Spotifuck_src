.class public final Lb0/c;
.super Lb0/b;
.source "SourceFile"


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    sget-object p1, Lb0/a;->b:Lb0/a;

    invoke-direct {p0, p1}, Lb0/c;-><init>(Lb0/b;)V

    return-void
.end method

.method public constructor <init>(Lb0/b;)V
    .locals 1

    const-string v0, "initialExtras"

    invoke-static {v0, p1}, LZ0/c;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2
    invoke-direct {p0}, Lb0/b;-><init>()V

    .line 3
    iget-object v0, p0, Lb0/b;->a:Ljava/util/LinkedHashMap;

    iget-object p1, p1, Lb0/b;->a:Ljava/util/LinkedHashMap;

    .line 4
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method
