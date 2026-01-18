.class public abstract LQ0/H;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr1/h;

.field public static final b:Lr1/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "RIFF"

    .line 2
    .line 3
    invoke-static {v0}, Lr1/h;->f(Ljava/lang/String;)Lr1/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LQ0/H;->a:Lr1/h;

    .line 8
    .line 9
    const-string v0, "WEBP"

    .line 10
    .line 11
    invoke-static {v0}, Lr1/h;->f(Ljava/lang/String;)Lr1/h;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, LQ0/H;->b:Lr1/h;

    .line 16
    .line 17
    return-void
.end method
