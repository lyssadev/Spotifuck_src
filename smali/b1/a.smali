.class public abstract Lb1/a;
.super Lb1/d;
.source "SourceFile"


# virtual methods
.method public final a()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lb1/a;->b()Ljava/util/Random;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/high16 v1, 0x7fff0000

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public abstract b()Ljava/util/Random;
.end method
