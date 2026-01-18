.class public abstract Lb1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lb1/c;

.field public static final b:Lb1/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lb1/c;

    .line 2
    .line 3
    invoke-direct {v0}, Lb1/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lb1/d;->a:Lb1/c;

    .line 7
    .line 8
    sget-object v0, LU0/b;->a:LU0/a;

    .line 9
    .line 10
    invoke-virtual {v0}, LU0/a;->a()Lb1/d;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lb1/d;->b:Lb1/d;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public abstract a()I
.end method
