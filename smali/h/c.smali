.class public final Lh/c;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroidx/appcompat/app/AlertController$RecycleListView;

.field public final synthetic b:Lh/f;


# direct methods
.method public constructor <init>(Lh/f;Landroid/view/ContextThemeWrapper;I[Ljava/lang/CharSequence;Landroidx/appcompat/app/AlertController$RecycleListView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh/c;->b:Lh/f;

    .line 2
    .line 3
    iput-object p5, p0, Lh/c;->a:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 4
    .line 5
    const p1, 0x1020014

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p2, p3, p1, p4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/widget/ArrayAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object p3, p0, Lh/c;->b:Lh/f;

    .line 6
    .line 7
    iget-object p3, p3, Lh/f;->p:[Z

    .line 8
    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    aget-boolean p3, p3, p1

    .line 12
    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    iget-object p3, p0, Lh/c;->a:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-virtual {p3, p1, v0}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-object p2
.end method
