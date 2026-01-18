.class public abstract Landroid/support/v4/media/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/media/Rating;)F
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/Rating;->getPercentRating()F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static b(Landroid/media/Rating;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/Rating;->getRatingStyle()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static c(Landroid/media/Rating;)F
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/Rating;->getStarRating()F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static d(Landroid/media/Rating;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/Rating;->hasHeart()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static e(Landroid/media/Rating;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/Rating;->isRated()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static f(Landroid/media/Rating;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/Rating;->isThumbUp()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static g(Z)Landroid/media/Rating;
    .locals 0

    .line 1
    invoke-static {p0}, Landroid/media/Rating;->newHeartRating(Z)Landroid/media/Rating;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static h(F)Landroid/media/Rating;
    .locals 0

    .line 1
    invoke-static {p0}, Landroid/media/Rating;->newPercentageRating(F)Landroid/media/Rating;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static i(IF)Landroid/media/Rating;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroid/media/Rating;->newStarRating(IF)Landroid/media/Rating;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static j(Z)Landroid/media/Rating;
    .locals 0

    .line 1
    invoke-static {p0}, Landroid/media/Rating;->newThumbRating(Z)Landroid/media/Rating;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static k(I)Landroid/media/Rating;
    .locals 0

    .line 1
    invoke-static {p0}, Landroid/media/Rating;->newUnratedRating(I)Landroid/media/Rating;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
