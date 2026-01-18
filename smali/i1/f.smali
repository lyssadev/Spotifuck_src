.class public final Li1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:J

.field public final c:[Lr1/v;

.field public final synthetic d:Li1/g;


# direct methods
.method public constructor <init>(Li1/g;Ljava/lang/String;J[Lr1/v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li1/f;->d:Li1/g;

    .line 5
    .line 6
    iput-object p2, p0, Li1/f;->a:Ljava/lang/String;

    .line 7
    .line 8
    iput-wide p3, p0, Li1/f;->b:J

    .line 9
    .line 10
    iput-object p5, p0, Li1/f;->c:[Lr1/v;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 1
    iget-object v0, p0, Li1/f;->c:[Lr1/v;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_0

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-static {v3}, Lh1/c;->c(Ljava/io/Closeable;)V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method
