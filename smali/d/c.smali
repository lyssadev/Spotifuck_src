.class public final Ld/c;
.super LZ0/d;
.source "SourceFile"

# interfaces
.implements LY0/a;


# static fields
.field public static final a:Ld/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ld/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LZ0/d;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ld/c;->a:Ld/c;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lb1/d;->a:Lb1/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lb1/d;->b:Lb1/d;

    .line 7
    .line 8
    invoke-virtual {v0}, Lb1/d;->a()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/high16 v1, 0x10000

    .line 13
    .line 14
    add-int/2addr v0, v1

    .line 15
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method
