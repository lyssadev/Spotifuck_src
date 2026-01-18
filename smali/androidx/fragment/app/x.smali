.class public final Landroidx/fragment/app/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/LayoutInflater$Factory2;


# instance fields
.field public final f:Landroidx/fragment/app/H;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/H;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/x;->f:Landroidx/fragment/app/H;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 10

    .line 2
    const-class v0, Landroidx/fragment/app/FragmentContainerView;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/x;->f:Landroidx/fragment/app/H;

    if-eqz v0, :cond_0

    .line 3
    new-instance p1, Landroidx/fragment/app/FragmentContainerView;

    invoke-direct {p1, p3, p4, v1}, Landroidx/fragment/app/FragmentContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/H;)V

    return-object p1

    .line 4
    :cond_0
    const-string v0, "fragment"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x0

    if-nez p2, :cond_1

    return-object v0

    .line 5
    :cond_1
    const-string p2, "class"

    invoke-interface {p4, v0, p2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 6
    sget-object v2, LY/a;->a:[I

    invoke-virtual {p3, p4, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    const/4 v3, 0x0

    if-nez p2, :cond_2

    .line 7
    invoke-virtual {v2, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    :cond_2
    const/4 v4, 0x1

    const/4 v5, -0x1

    .line 8
    invoke-virtual {v2, v4, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v6

    const/4 v7, 0x2

    .line 9
    invoke-virtual {v2, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 10
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz p2, :cond_15

    .line 11
    invoke-virtual {p3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    .line 12
    :try_start_0
    invoke-static {v2, p2}, Landroidx/fragment/app/B;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    .line 13
    const-class v9, Landroidx/fragment/app/r;

    invoke-virtual {v9, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_3

    goto/16 :goto_7

    :cond_3
    if-eqz p1, :cond_4

    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v3

    :cond_4
    if-ne v3, v5, :cond_6

    if-ne v6, v5, :cond_6

    if-eqz v8, :cond_5

    goto :goto_1

    .line 15
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ": Must specify unique android:id, android:tag, or have a parent with an id for "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_1
    if-eq v6, v5, :cond_7

    .line 16
    invoke-virtual {v1, v6}, Landroidx/fragment/app/H;->z(I)Landroidx/fragment/app/r;

    move-result-object v2

    goto :goto_2

    :cond_7
    move-object v2, v0

    :goto_2
    if-nez v2, :cond_8

    if-eqz v8, :cond_8

    .line 17
    invoke-virtual {v1, v8}, Landroidx/fragment/app/H;->A(Ljava/lang/String;)Landroidx/fragment/app/r;

    move-result-object v2

    :cond_8
    if-nez v2, :cond_9

    if-eq v3, v5, :cond_9

    .line 18
    invoke-virtual {v1, v3}, Landroidx/fragment/app/H;->z(I)Landroidx/fragment/app/r;

    move-result-object v2

    .line 19
    :cond_9
    const-string v5, "FragmentManager"

    if-nez v2, :cond_d

    .line 20
    invoke-virtual {v1}, Landroidx/fragment/app/H;->C()Landroidx/fragment/app/B;

    move-result-object p4

    .line 21
    invoke-virtual {p3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 22
    invoke-virtual {p4, p2}, Landroidx/fragment/app/B;->a(Ljava/lang/String;)Landroidx/fragment/app/r;

    move-result-object v2

    .line 23
    iput-boolean v4, v2, Landroidx/fragment/app/r;->r:Z

    if-eqz v6, :cond_a

    move p3, v6

    goto :goto_3

    :cond_a
    move p3, v3

    .line 24
    :goto_3
    iput p3, v2, Landroidx/fragment/app/r;->A:I

    .line 25
    iput v3, v2, Landroidx/fragment/app/r;->B:I

    .line 26
    iput-object v8, v2, Landroidx/fragment/app/r;->C:Ljava/lang/String;

    .line 27
    iput-boolean v4, v2, Landroidx/fragment/app/r;->s:Z

    .line 28
    iput-object v1, v2, Landroidx/fragment/app/r;->w:Landroidx/fragment/app/H;

    .line 29
    iget-object p3, v1, Landroidx/fragment/app/H;->t:Landroidx/fragment/app/t;

    .line 30
    iput-object p3, v2, Landroidx/fragment/app/r;->x:Landroidx/fragment/app/t;

    .line 31
    iget-object p4, p3, Landroidx/fragment/app/t;->g:Lh/l;

    .line 32
    iput-boolean v4, v2, Landroidx/fragment/app/r;->H:Z

    if-nez p3, :cond_b

    goto :goto_4

    .line 33
    :cond_b
    iget-object v0, p3, Landroidx/fragment/app/t;->f:Lh/l;

    :goto_4
    if-eqz v0, :cond_c

    .line 34
    iput-boolean v4, v2, Landroidx/fragment/app/r;->H:Z

    .line 35
    :cond_c
    invoke-virtual {v1, v2}, Landroidx/fragment/app/H;->a(Landroidx/fragment/app/r;)Landroidx/fragment/app/M;

    move-result-object p3

    .line 36
    invoke-static {v5, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p4

    if-eqz p4, :cond_10

    .line 37
    invoke-virtual {v2}, Landroidx/fragment/app/r;->toString()Ljava/lang/String;

    .line 38
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    goto :goto_6

    .line 39
    :cond_d
    iget-boolean p3, v2, Landroidx/fragment/app/r;->s:Z

    if-nez p3, :cond_14

    .line 40
    iput-boolean v4, v2, Landroidx/fragment/app/r;->s:Z

    .line 41
    iput-object v1, v2, Landroidx/fragment/app/r;->w:Landroidx/fragment/app/H;

    .line 42
    iget-object p3, v1, Landroidx/fragment/app/H;->t:Landroidx/fragment/app/t;

    .line 43
    iput-object p3, v2, Landroidx/fragment/app/r;->x:Landroidx/fragment/app/t;

    .line 44
    iget-object p4, p3, Landroidx/fragment/app/t;->g:Lh/l;

    .line 45
    iput-boolean v4, v2, Landroidx/fragment/app/r;->H:Z

    if-nez p3, :cond_e

    goto :goto_5

    .line 46
    :cond_e
    iget-object v0, p3, Landroidx/fragment/app/t;->f:Lh/l;

    :goto_5
    if-eqz v0, :cond_f

    .line 47
    iput-boolean v4, v2, Landroidx/fragment/app/r;->H:Z

    .line 48
    :cond_f
    invoke-virtual {v1, v2}, Landroidx/fragment/app/H;->f(Landroidx/fragment/app/r;)Landroidx/fragment/app/M;

    move-result-object p3

    .line 49
    invoke-static {v5, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p4

    if-eqz p4, :cond_10

    .line 50
    invoke-virtual {v2}, Landroidx/fragment/app/r;->toString()Ljava/lang/String;

    .line 51
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 52
    :cond_10
    :goto_6
    check-cast p1, Landroid/view/ViewGroup;

    sget-object p4, LZ/d;->a:LZ/c;

    .line 53
    new-instance p4, LZ/a;

    .line 54
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Attempting to use <fragment> tag to add fragment "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " to container "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 55
    invoke-direct {p4, v2, v0}, LZ/f;-><init>(Landroidx/fragment/app/r;Ljava/lang/String;)V

    .line 56
    invoke-static {p4}, LZ/d;->b(LZ/f;)V

    .line 57
    invoke-static {v2}, LZ/d;->a(Landroidx/fragment/app/r;)LZ/c;

    move-result-object p4

    .line 58
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    iput-object p1, v2, Landroidx/fragment/app/r;->I:Landroid/view/ViewGroup;

    .line 60
    invoke-virtual {p3}, Landroidx/fragment/app/M;->k()V

    .line 61
    invoke-virtual {p3}, Landroidx/fragment/app/M;->j()V

    .line 62
    iget-object p1, v2, Landroidx/fragment/app/r;->J:Landroid/view/View;

    if-eqz p1, :cond_13

    if-eqz v6, :cond_11

    .line 63
    invoke-virtual {p1, v6}, Landroid/view/View;->setId(I)V

    .line 64
    :cond_11
    iget-object p1, v2, Landroidx/fragment/app/r;->J:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_12

    .line 65
    iget-object p1, v2, Landroidx/fragment/app/r;->J:Landroid/view/View;

    invoke-virtual {p1, v8}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 66
    :cond_12
    iget-object p1, v2, Landroidx/fragment/app/r;->J:Landroid/view/View;

    new-instance p2, Landroidx/fragment/app/w;

    invoke-direct {p2, p0, p3}, Landroidx/fragment/app/w;-><init>(Landroidx/fragment/app/x;Landroidx/fragment/app/M;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 67
    iget-object p1, v2, Landroidx/fragment/app/r;->J:Landroid/view/View;

    return-object p1

    .line 68
    :cond_13
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p3, "Fragment "

    const-string p4, " did not create a view."

    .line 69
    invoke-static {p3, p2, p4}, LQ0/E;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 70
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 71
    :cond_14
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ": Duplicate id 0x"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ", tag "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ", or parent id 0x"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " with another fragment for "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_15
    :goto_7
    return-object v0
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/fragment/app/x;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
