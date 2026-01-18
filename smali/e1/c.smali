.class public final Le1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le1/d;


# instance fields
.field public final a:Le1/e;


# direct methods
.method public constructor <init>(Le1/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le1/c;->a:Le1/e;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Le1/b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Le1/b;-><init>(Le1/c;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
