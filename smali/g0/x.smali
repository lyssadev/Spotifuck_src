.class public final Lg0/x;
.super Lj0/c0;
.source "SourceFile"


# instance fields
.field public final f:Landroidx/recyclerview/widget/RecyclerView;

.field public final g:Lj0/b0;

.field public final h:LE0/a;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lj0/c0;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj0/c0;->e:Lj0/b0;

    .line 5
    .line 6
    iput-object v0, p0, Lg0/x;->g:Lj0/b0;

    .line 7
    .line 8
    new-instance v0, LE0/a;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, v1, p0}, LE0/a;-><init>(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lg0/x;->h:LE0/a;

    .line 15
    .line 16
    iput-object p1, p0, Lg0/x;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final j()LN/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lg0/x;->h:LE0/a;

    .line 2
    .line 3
    return-object v0
.end method
