.class public final LQ0/C;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LA/b;

.field public final b:LQ0/j;

.field public c:J

.field public d:J

.field public e:J

.field public f:J

.field public g:J

.field public h:J

.field public i:J

.field public j:J

.field public k:I

.field public l:I

.field public m:I


# direct methods
.method public constructor <init>(LA/b;)V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, LQ0/C;->a:LA/b;

    .line 6
    .line 7
    new-instance p1, Landroid/os/HandlerThread;

    .line 8
    .line 9
    const-string v1, "Picasso-Stats"

    .line 10
    .line 11
    const/16 v2, 0xa

    .line 12
    .line 13
    invoke-direct {p1, v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget-object v2, LQ0/H;->a:Lr1/h;

    .line 24
    .line 25
    new-instance v2, LQ0/u;

    .line 26
    .line 27
    invoke-direct {v2, v1, v0}, LQ0/u;-><init>(Landroid/os/Looper;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-wide/16 v3, 0x3e8

    .line 35
    .line 36
    invoke-virtual {v2, v1, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 37
    .line 38
    .line 39
    new-instance v1, LQ0/j;

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {v1, p1, p0, v0}, LQ0/j;-><init>(Landroid/os/Looper;Ljava/lang/Object;I)V

    .line 46
    .line 47
    .line 48
    iput-object v1, p0, LQ0/C;->b:LQ0/j;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final a()LQ0/D;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v25, LQ0/D;

    .line 4
    .line 5
    iget-object v1, v0, LQ0/C;->a:LA/b;

    .line 6
    .line 7
    iget-object v2, v1, LA/b;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, LQ0/o;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroid/util/LruCache;->maxSize()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    iget-object v1, v1, LA/b;->g:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, LQ0/o;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/util/LruCache;->size()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    iget-wide v4, v0, LQ0/C;->c:J

    .line 24
    .line 25
    iget-wide v6, v0, LQ0/C;->d:J

    .line 26
    .line 27
    iget-wide v8, v0, LQ0/C;->e:J

    .line 28
    .line 29
    iget-wide v10, v0, LQ0/C;->f:J

    .line 30
    .line 31
    iget-wide v12, v0, LQ0/C;->g:J

    .line 32
    .line 33
    iget-wide v14, v0, LQ0/C;->h:J

    .line 34
    .line 35
    move-wide/from16 v26, v4

    .line 36
    .line 37
    iget-wide v4, v0, LQ0/C;->i:J

    .line 38
    .line 39
    move-wide/from16 v16, v4

    .line 40
    .line 41
    iget-wide v4, v0, LQ0/C;->j:J

    .line 42
    .line 43
    move-wide/from16 v18, v4

    .line 44
    .line 45
    iget v1, v0, LQ0/C;->k:I

    .line 46
    .line 47
    move/from16 v20, v1

    .line 48
    .line 49
    iget v1, v0, LQ0/C;->l:I

    .line 50
    .line 51
    move/from16 v21, v1

    .line 52
    .line 53
    iget v1, v0, LQ0/C;->m:I

    .line 54
    .line 55
    move/from16 v22, v1

    .line 56
    .line 57
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 58
    .line 59
    .line 60
    move-result-wide v23

    .line 61
    move-object/from16 v1, v25

    .line 62
    .line 63
    move-wide/from16 v4, v26

    .line 64
    .line 65
    invoke-direct/range {v1 .. v24}, LQ0/D;-><init>(IIJJJJJJJJIIIJ)V

    .line 66
    .line 67
    .line 68
    return-object v25
.end method
