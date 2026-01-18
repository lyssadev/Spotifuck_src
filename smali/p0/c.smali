.class public final Lp0/c;
.super Lp0/b;
.source "SourceFile"


# instance fields
.field public final d:Landroid/util/SparseIntArray;

.field public final e:Landroid/os/Parcel;

.field public final f:I

.field public final g:I

.field public final h:Ljava/lang/String;

.field public i:I

.field public j:I

.field public k:I


# direct methods
.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v2

    invoke-virtual {p1}, Landroid/os/Parcel;->dataSize()I

    move-result v3

    new-instance v5, Lr/b;

    .line 2
    invoke-direct {v5}, Lr/k;-><init>()V

    .line 3
    new-instance v6, Lr/b;

    .line 4
    invoke-direct {v6}, Lr/k;-><init>()V

    .line 5
    new-instance v7, Lr/b;

    .line 6
    invoke-direct {v7}, Lr/k;-><init>()V

    .line 7
    const-string v4, ""

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v7}, Lp0/c;-><init>(Landroid/os/Parcel;IILjava/lang/String;Lr/b;Lr/b;Lr/b;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;IILjava/lang/String;Lr/b;Lr/b;Lr/b;)V
    .locals 0

    .line 8
    invoke-direct {p0, p5, p6, p7}, Lp0/b;-><init>(Lr/b;Lr/b;Lr/b;)V

    .line 9
    new-instance p5, Landroid/util/SparseIntArray;

    invoke-direct {p5}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p5, p0, Lp0/c;->d:Landroid/util/SparseIntArray;

    const/4 p5, -0x1

    .line 10
    iput p5, p0, Lp0/c;->i:I

    .line 11
    iput p5, p0, Lp0/c;->k:I

    .line 12
    iput-object p1, p0, Lp0/c;->e:Landroid/os/Parcel;

    .line 13
    iput p2, p0, Lp0/c;->f:I

    .line 14
    iput p3, p0, Lp0/c;->g:I

    .line 15
    iput p2, p0, Lp0/c;->j:I

    .line 16
    iput-object p4, p0, Lp0/c;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Lp0/c;
    .locals 9

    .line 1
    new-instance v8, Lp0/c;

    .line 2
    .line 3
    iget-object v1, p0, Lp0/c;->e:Landroid/os/Parcel;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    iget v0, p0, Lp0/c;->j:I

    .line 10
    .line 11
    iget v3, p0, Lp0/c;->f:I

    .line 12
    .line 13
    if-ne v0, v3, :cond_0

    .line 14
    .line 15
    iget v0, p0, Lp0/c;->g:I

    .line 16
    .line 17
    :cond_0
    move v3, v0

    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-object v4, p0, Lp0/c;->h:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v4, "  "

    .line 29
    .line 30
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget-object v6, p0, Lp0/b;->b:Lr/b;

    .line 38
    .line 39
    iget-object v7, p0, Lp0/b;->c:Lr/b;

    .line 40
    .line 41
    iget-object v5, p0, Lp0/b;->a:Lr/b;

    .line 42
    .line 43
    move-object v0, v8

    .line 44
    invoke-direct/range {v0 .. v7}, Lp0/c;-><init>(Landroid/os/Parcel;IILjava/lang/String;Lr/b;Lr/b;Lr/b;)V

    .line 45
    .line 46
    .line 47
    return-object v8
.end method

.method public final e(I)Z
    .locals 4

    .line 1
    :goto_0
    iget v0, p0, Lp0/c;->j:I

    .line 2
    .line 3
    iget v1, p0, Lp0/c;->g:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-ge v0, v1, :cond_2

    .line 8
    .line 9
    iget v0, p0, Lp0/c;->k:I

    .line 10
    .line 11
    if-ne v0, p1, :cond_0

    .line 12
    .line 13
    return v3

    .line 14
    :cond_0
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-lez v0, :cond_1

    .line 27
    .line 28
    return v2

    .line 29
    :cond_1
    iget v0, p0, Lp0/c;->j:I

    .line 30
    .line 31
    iget-object v1, p0, Lp0/c;->e:Landroid/os/Parcel;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    iput v1, p0, Lp0/c;->k:I

    .line 45
    .line 46
    iget v1, p0, Lp0/c;->j:I

    .line 47
    .line 48
    add-int/2addr v1, v0

    .line 49
    iput v1, p0, Lp0/c;->j:I

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    iget v0, p0, Lp0/c;->k:I

    .line 53
    .line 54
    if-ne v0, p1, :cond_3

    .line 55
    .line 56
    const/4 v2, 0x1

    .line 57
    :cond_3
    return v2
.end method

.method public final i(I)V
    .locals 5

    .line 1
    iget v0, p0, Lp0/c;->i:I

    .line 2
    .line 3
    iget-object v1, p0, Lp0/c;->d:Landroid/util/SparseIntArray;

    .line 4
    .line 5
    iget-object v2, p0, Lp0/c;->e:Landroid/os/Parcel;

    .line 6
    .line 7
    if-ltz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Landroid/util/SparseIntArray;->get(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {v2}, Landroid/os/Parcel;->dataPosition()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    sub-int v4, v3, v0

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iput p1, p0, Lp0/c;->i:I

    .line 29
    .line 30
    invoke-virtual {v2}, Landroid/os/Parcel;->dataPosition()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {v1, p1, v0}, Landroid/util/SparseIntArray;->put(II)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 42
    .line 43
    .line 44
    return-void
.end method
