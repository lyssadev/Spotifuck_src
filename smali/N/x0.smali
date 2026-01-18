.class public LN/x0;
.super Lp0/a;
.source "SourceFile"


# instance fields
.field public final o:Landroid/view/Window;


# direct methods
.method public constructor <init>(Landroid/view/Window;LK0/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LN/x0;->o:Landroid/view/Window;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final L0(I)V
    .locals 2

    .line 1
    iget-object v0, p0, LN/x0;->o:Landroid/view/Window;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    not-int p1, p1

    .line 12
    and-int/2addr p1, v1

    .line 13
    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
