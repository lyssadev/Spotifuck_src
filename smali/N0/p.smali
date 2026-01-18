.class public final LN0/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LN0/q;Landroid/support/v4/media/session/t;)V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, LN0/p;->c:Ljava/lang/Object;

    .line 12
    iput-object p1, p0, LN0/p;->d:Ljava/lang/Object;

    .line 13
    iget-object p1, p2, Landroid/support/v4/media/session/t;->c:Ljava/lang/Object;

    check-cast p1, Landroid/content/res/TypedArray;

    const/16 p2, 0x1c

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    .line 14
    iput p2, p0, LN0/p;->a:I

    const/16 p2, 0x34

    .line 15
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    .line 16
    iput p1, p0, LN0/p;->b:I

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;Lr1/v;II)V
    .locals 3

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    const/4 v0, 0x1

    :cond_1
    if-eq v2, v0, :cond_3

    .line 4
    iput-object p1, p0, LN0/p;->c:Ljava/lang/Object;

    .line 5
    iput-object p2, p0, LN0/p;->d:Ljava/lang/Object;

    .line 6
    const-string p1, "loadedFrom == null"

    if-eqz p3, :cond_2

    iput p3, p0, LN0/p;->a:I

    .line 7
    iput p4, p0, LN0/p;->b:I

    return-void

    .line 8
    :cond_2
    new-instance p2, Ljava/lang/NullPointerException;

    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 9
    :cond_3
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public constructor <init>(Lr1/v;I)V
    .locals 2

    .line 1
    sget-object v0, LQ0/H;->a:Lr1/h;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v1, p1, p2, v0}, LN0/p;-><init>(Landroid/graphics/Bitmap;Lr1/v;II)V

    return-void

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "source == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
