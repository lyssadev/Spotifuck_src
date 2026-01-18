.class public final synthetic Lh/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/k;


# instance fields
.field public final synthetic f:Lh/i;


# direct methods
.method public synthetic constructor <init>(Lh/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh/E;->f:Lh/i;

    return-void
.end method


# virtual methods
.method public final e(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/E;->f:Lh/i;

    invoke-virtual {v0, p1}, Lh/i;->j(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
