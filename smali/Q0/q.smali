.class public final LQ0/q;
.super LQ0/h;
.source "SourceFile"


# static fields
.field public static final d:[Ljava/lang/String;


# instance fields
.field public final synthetic c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "orientation"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LQ0/q;->d:[Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p2, p0, LQ0/q;->c:I

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, LQ0/h;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public final a(LQ0/z;)Z
    .locals 2

    .line 1
    iget v0, p0, LQ0/q;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, LQ0/z;->a:Landroid/net/Uri;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v0, "file"

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    :pswitch_0
    iget-object p1, p1, LQ0/z;->a:Landroid/net/Uri;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "content"

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    const-string v0, "media"

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/4 p1, 0x0

    .line 48
    :goto_0
    return p1

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(LQ0/z;I)LN0/p;
    .locals 9

    .line 1
    iget p2, p0, LQ0/q;->c:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, LQ0/h;->b:Landroid/content/Context;

    .line 7
    .line 8
    invoke-virtual {p2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    iget-object v0, p1, LQ0/z;->a:Landroid/net/Uri;

    .line 13
    .line 14
    invoke-virtual {p2, v0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-static {p2}, Lr1/o;->b(Ljava/io/InputStream;)Lr1/b;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    new-instance v0, LN0/p;

    .line 23
    .line 24
    new-instance v1, La/e;

    .line 25
    .line 26
    iget-object p1, p1, LQ0/z;->a:Landroid/net/Uri;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-direct {v1, p1}, La/e;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string p1, "Orientation"

    .line 36
    .line 37
    invoke-virtual {v1, p1}, La/e;->d(Ljava/lang/String;)La/b;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const/4 v2, 0x1

    .line 42
    if-nez p1, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    :try_start_0
    iget-object v1, v1, La/e;->d:Ljava/nio/ByteOrder;

    .line 46
    .line 47
    invoke-virtual {p1, v1}, La/b;->e(Ljava/nio/ByteOrder;)I

    .line 48
    .line 49
    .line 50
    move-result v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    :catch_0
    :goto_0
    const/4 p1, 0x0

    .line 52
    const/4 v1, 0x2

    .line 53
    invoke-direct {v0, p1, p2, v1, v2}, LN0/p;-><init>(Landroid/graphics/Bitmap;Lr1/v;II)V

    .line 54
    .line 55
    .line 56
    return-object v0

    .line 57
    :pswitch_0
    iget-object p2, p0, LQ0/h;->b:Landroid/content/Context;

    .line 58
    .line 59
    invoke-virtual {p2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    iget-object v1, p1, LQ0/z;->a:Landroid/net/Uri;

    .line 64
    .line 65
    const/4 v7, 0x0

    .line 66
    const/4 v8, 0x0

    .line 67
    :try_start_1
    sget-object v2, LQ0/q;->d:[Ljava/lang/String;

    .line 68
    .line 69
    const/4 v3, 0x0

    .line 70
    const/4 v4, 0x0

    .line 71
    const/4 v5, 0x0

    .line 72
    move-object v0, v6

    .line 73
    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 74
    .line 75
    .line 76
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    :try_start_2
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-nez v1, :cond_1

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_1
    invoke-interface {v0, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 87
    .line 88
    .line 89
    move-result v7
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 90
    :goto_1
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 91
    .line 92
    .line 93
    goto :goto_5

    .line 94
    :catchall_0
    move-exception p1

    .line 95
    move-object v8, v0

    .line 96
    goto :goto_3

    .line 97
    :catch_1
    nop

    .line 98
    goto :goto_4

    .line 99
    :cond_2
    :goto_2
    if-eqz v0, :cond_4

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :catchall_1
    move-exception p1

    .line 103
    goto :goto_3

    .line 104
    :catch_2
    nop

    .line 105
    move-object v0, v8

    .line 106
    goto :goto_4

    .line 107
    :goto_3
    if-eqz v8, :cond_3

    .line 108
    .line 109
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 110
    .line 111
    .line 112
    :cond_3
    throw p1

    .line 113
    :goto_4
    if-eqz v0, :cond_4

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_4
    :goto_5
    iget-object p1, p1, LQ0/z;->a:Landroid/net/Uri;

    .line 117
    .line 118
    invoke-virtual {v6, p1}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    if-eqz v0, :cond_5

    .line 123
    .line 124
    const-string v1, "video/"

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    :cond_5
    invoke-virtual {p2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    invoke-virtual {p2, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-static {p1}, Lr1/o;->b(Ljava/io/InputStream;)Lr1/b;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    new-instance p2, LN0/p;

    .line 143
    .line 144
    const/4 v0, 0x2

    .line 145
    invoke-direct {p2, v8, p1, v0, v7}, LN0/p;-><init>(Landroid/graphics/Bitmap;Lr1/v;II)V

    .line 146
    .line 147
    .line 148
    return-object p2

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
