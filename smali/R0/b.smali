.class public final synthetic LR0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/webkit/ValueCallback;


# instance fields
.field public final synthetic a:LR0/c;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(LR0/c;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR0/b;->a:LR0/c;

    iput p2, p0, LR0/b;->b:I

    return-void
.end method


# virtual methods
.method public final onReceiveValue(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, LR0/b;->b:I

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, LR0/b;->a:LR0/c;

    invoke-static {v1, v0, p1}, LR0/c;->a(LR0/c;ILjava/lang/String;)V

    return-void
.end method
