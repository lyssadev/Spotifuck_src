.class public final Lg1/A;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lg1/u;

.field public final b:Ljava/lang/String;

.field public final c:Lg1/s;

.field public final d:Ljava/lang/Object;

.field public volatile e:Lg1/j;


# direct methods
.method public constructor <init>(LA/k;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, LA/k;->f:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lg1/u;

    .line 7
    .line 8
    iput-object v0, p0, Lg1/A;->a:Lg1/u;

    .line 9
    .line 10
    iget-object v0, p1, LA/k;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ljava/lang/String;

    .line 13
    .line 14
    iput-object v0, p0, Lg1/A;->b:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v0, p1, LA/k;->h:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, LA/b;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v1, Lg1/s;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lg1/s;-><init>(LA/b;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lg1/A;->c:Lg1/s;

    .line 29
    .line 30
    iget-object p1, p1, LA/k;->i:Ljava/lang/Object;

    .line 31
    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object p1, p0

    .line 36
    :goto_0
    iput-object p1, p0, Lg1/A;->d:Ljava/lang/Object;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final a()LA/k;
    .locals 2

    .line 1
    new-instance v0, LA/k;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lg1/A;->a:Lg1/u;

    .line 7
    .line 8
    iput-object v1, v0, LA/k;->f:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v1, p0, Lg1/A;->b:Ljava/lang/String;

    .line 11
    .line 12
    iput-object v1, v0, LA/k;->g:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v1, p0, Lg1/A;->d:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object v1, v0, LA/k;->i:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v1, p0, Lg1/A;->c:Lg1/s;

    .line 19
    .line 20
    invoke-virtual {v1}, Lg1/s;->c()LA/b;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iput-object v1, v0, LA/k;->h:Ljava/lang/Object;

    .line 25
    .line 26
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Request{method="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lg1/A;->b:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", url="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lg1/A;->a:Lg1/u;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", tag="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lg1/A;->d:Ljava/lang/Object;

    .line 29
    .line 30
    if-eq v1, p0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v1, 0x0

    .line 34
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const/16 v1, 0x7d

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0
.end method
