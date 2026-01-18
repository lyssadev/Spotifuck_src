.class public final Lm1/i;
.super Lh1/a;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Lm1/s;


# direct methods
.method public varargs constructor <init>(Lm1/s;[Ljava/lang/Object;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm1/i;->d:Lm1/s;

    .line 2
    .line 3
    iput p3, p0, Lm1/i;->b:I

    .line 4
    .line 5
    iput p4, p0, Lm1/i;->c:I

    .line 6
    .line 7
    const-string p1, "OkHttp %s stream %d"

    .line 8
    .line 9
    invoke-direct {p0, p1, p2}, Lh1/a;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lm1/i;->d:Lm1/s;

    .line 2
    .line 3
    :try_start_0
    iget v1, p0, Lm1/i;->b:I

    .line 4
    .line 5
    iget v2, p0, Lm1/i;->c:I

    .line 6
    .line 7
    iget-object v3, v0, Lm1/s;->r:Lm1/z;

    .line 8
    .line 9
    invoke-virtual {v3, v1, v2}, Lm1/z;->l(II)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catch_0
    invoke-virtual {v0}, Lm1/s;->g()V

    .line 14
    .line 15
    .line 16
    :goto_0
    return-void
.end method
