.class public final Lm1/j;
.super Lh1/a;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:J

.field public final synthetic d:Lm1/s;


# direct methods
.method public varargs constructor <init>(Lm1/s;[Ljava/lang/Object;IJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm1/j;->d:Lm1/s;

    .line 2
    .line 3
    iput p3, p0, Lm1/j;->b:I

    .line 4
    .line 5
    iput-wide p4, p0, Lm1/j;->c:J

    .line 6
    .line 7
    const-string p1, "OkHttp Window Update %s stream %d"

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
    .locals 5

    .line 1
    iget-object v0, p0, Lm1/j;->d:Lm1/s;

    .line 2
    .line 3
    :try_start_0
    iget-object v1, v0, Lm1/s;->r:Lm1/z;

    .line 4
    .line 5
    iget v2, p0, Lm1/j;->b:I

    .line 6
    .line 7
    iget-wide v3, p0, Lm1/j;->c:J

    .line 8
    .line 9
    invoke-virtual {v1, v2, v3, v4}, Lm1/z;->o(IJ)V
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
