.class public LN/s0;
.super LN/r0;
.source "SourceFile"


# instance fields
.field public n:LF/c;

.field public o:LF/c;

.field public p:LF/c;


# direct methods
.method public constructor <init>(LN/w0;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LN/r0;-><init>(LN/w0;Landroid/view/WindowInsets;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, LN/s0;->n:LF/c;

    .line 6
    .line 7
    iput-object p1, p0, LN/s0;->o:LF/c;

    .line 8
    .line 9
    iput-object p1, p0, LN/s0;->p:LF/c;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public g()LF/c;
    .locals 1

    .line 1
    iget-object v0, p0, LN/s0;->o:LF/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LN/p0;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, LA/a;->u(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, LF/c;->c(Landroid/graphics/Insets;)LF/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, LN/s0;->o:LF/c;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, LN/s0;->o:LF/c;

    .line 18
    .line 19
    return-object v0
.end method

.method public i()LF/c;
    .locals 1

    .line 1
    iget-object v0, p0, LN/s0;->n:LF/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LN/p0;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, LA/a;->y(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, LF/c;->c(Landroid/graphics/Insets;)LF/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, LN/s0;->n:LF/c;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, LN/s0;->n:LF/c;

    .line 18
    .line 19
    return-object v0
.end method

.method public k()LF/c;
    .locals 1

    .line 1
    iget-object v0, p0, LN/s0;->p:LF/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LN/p0;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, LA/a;->c(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, LF/c;->c(Landroid/graphics/Insets;)LF/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, LN/s0;->p:LF/c;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, LN/s0;->p:LF/c;

    .line 18
    .line 19
    return-object v0
.end method

.method public l(IIII)LN/w0;
    .locals 1

    .line 1
    iget-object v0, p0, LN/p0;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {v0, p1, p2, p3, p4}, LA/a;->j(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 p2, 0x0

    .line 8
    invoke-static {p2, p1}, LN/w0;->g(Landroid/view/View;Landroid/view/WindowInsets;)LN/w0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public q(LF/c;)V
    .locals 0

    .line 1
    return-void
.end method
