.class public Landroidx/media/AudioAttributesImplBase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/media/AudioAttributesImpl;


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Landroidx/media/AudioAttributesImplBase;->a:I

    .line 6
    .line 7
    iput v0, p0, Landroidx/media/AudioAttributesImplBase;->b:I

    .line 8
    .line 9
    iput v0, p0, Landroidx/media/AudioAttributesImplBase;->c:I

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    iput v0, p0, Landroidx/media/AudioAttributesImplBase;->d:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 10

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x1

    .line 3
    instance-of v2, p1, Landroidx/media/AudioAttributesImplBase;

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    if-nez v2, :cond_0

    .line 7
    .line 8
    return v3

    .line 9
    :cond_0
    check-cast p1, Landroidx/media/AudioAttributesImplBase;

    .line 10
    .line 11
    iget v2, p0, Landroidx/media/AudioAttributesImplBase;->b:I

    .line 12
    .line 13
    iget v4, p1, Landroidx/media/AudioAttributesImplBase;->b:I

    .line 14
    .line 15
    if-ne v2, v4, :cond_6

    .line 16
    .line 17
    iget v2, p0, Landroidx/media/AudioAttributesImplBase;->c:I

    .line 18
    .line 19
    iget v4, p1, Landroidx/media/AudioAttributesImplBase;->c:I

    .line 20
    .line 21
    iget v5, p1, Landroidx/media/AudioAttributesImplBase;->d:I

    .line 22
    .line 23
    const/4 v6, -0x1

    .line 24
    const/4 v7, 0x6

    .line 25
    const/4 v8, 0x7

    .line 26
    if-eq v5, v6, :cond_1

    .line 27
    .line 28
    move v6, v5

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget v6, p1, Landroidx/media/AudioAttributesImplBase;->a:I

    .line 31
    .line 32
    sget v9, Landroidx/media/AudioAttributesCompat;->b:I

    .line 33
    .line 34
    and-int/lit8 v9, v4, 0x1

    .line 35
    .line 36
    if-ne v9, v1, :cond_2

    .line 37
    .line 38
    const/4 v6, 0x7

    .line 39
    goto :goto_0

    .line 40
    :cond_2
    and-int/lit8 v9, v4, 0x4

    .line 41
    .line 42
    if-ne v9, v0, :cond_3

    .line 43
    .line 44
    const/4 v6, 0x6

    .line 45
    goto :goto_0

    .line 46
    :cond_3
    packed-switch v6, :pswitch_data_0

    .line 47
    .line 48
    .line 49
    :pswitch_0
    const/4 v6, 0x3

    .line 50
    goto :goto_0

    .line 51
    :pswitch_1
    const/4 v6, 0x1

    .line 52
    goto :goto_0

    .line 53
    :pswitch_2
    const/16 v6, 0xa

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :pswitch_3
    const/4 v6, 0x2

    .line 57
    goto :goto_0

    .line 58
    :pswitch_4
    const/4 v6, 0x5

    .line 59
    goto :goto_0

    .line 60
    :pswitch_5
    const/4 v6, 0x4

    .line 61
    goto :goto_0

    .line 62
    :pswitch_6
    const/16 v6, 0x8

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :pswitch_7
    const/4 v6, 0x0

    .line 66
    :goto_0
    if-ne v6, v7, :cond_4

    .line 67
    .line 68
    or-int/2addr v4, v0

    .line 69
    goto :goto_1

    .line 70
    :cond_4
    if-ne v6, v8, :cond_5

    .line 71
    .line 72
    or-int/2addr v4, v1

    .line 73
    :cond_5
    :goto_1
    and-int/lit16 v0, v4, 0x111

    .line 74
    .line 75
    if-ne v2, v0, :cond_6

    .line 76
    .line 77
    iget v0, p0, Landroidx/media/AudioAttributesImplBase;->a:I

    .line 78
    .line 79
    iget p1, p1, Landroidx/media/AudioAttributesImplBase;->a:I

    .line 80
    .line 81
    if-ne v0, p1, :cond_6

    .line 82
    .line 83
    iget p1, p0, Landroidx/media/AudioAttributesImplBase;->d:I

    .line 84
    .line 85
    if-ne p1, v5, :cond_6

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_6
    const/4 v1, 0x0

    .line 89
    :goto_2
    return v1

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    iget v0, p0, Landroidx/media/AudioAttributesImplBase;->b:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Landroidx/media/AudioAttributesImplBase;->c:I

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v2, p0, Landroidx/media/AudioAttributesImplBase;->a:I

    .line 14
    .line 15
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget v3, p0, Landroidx/media/AudioAttributesImplBase;->d:I

    .line 20
    .line 21
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const/4 v4, 0x4

    .line 26
    new-array v4, v4, [Ljava/lang/Object;

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    aput-object v0, v4, v5

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    aput-object v1, v4, v0

    .line 33
    .line 34
    const/4 v0, 0x2

    .line 35
    aput-object v2, v4, v0

    .line 36
    .line 37
    const/4 v0, 0x3

    .line 38
    aput-object v3, v4, v0

    .line 39
    .line 40
    invoke-static {v4}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "AudioAttributesCompat:"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Landroidx/media/AudioAttributesImplBase;->d:I

    .line 9
    .line 10
    const/4 v2, -0x1

    .line 11
    if-eq v1, v2, :cond_0

    .line 12
    .line 13
    const-string v1, " stream="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Landroidx/media/AudioAttributesImplBase;->d:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, " derived"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    :cond_0
    const-string v1, " usage="

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget v1, p0, Landroidx/media/AudioAttributesImplBase;->a:I

    .line 34
    .line 35
    sget v2, Landroidx/media/AudioAttributesCompat;->b:I

    .line 36
    .line 37
    packed-switch v1, :pswitch_data_0

    .line 38
    .line 39
    .line 40
    :pswitch_0
    const-string v2, "unknown usage "

    .line 41
    .line 42
    invoke-static {v2, v1}, LQ0/E;->e(Ljava/lang/String;I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    goto :goto_0

    .line 47
    :pswitch_1
    const-string v1, "USAGE_ASSISTANT"

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :pswitch_2
    const-string v1, "USAGE_GAME"

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :pswitch_3
    const-string v1, "USAGE_ASSISTANCE_SONIFICATION"

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :pswitch_4
    const-string v1, "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE"

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :pswitch_5
    const-string v1, "USAGE_ASSISTANCE_ACCESSIBILITY"

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :pswitch_6
    const-string v1, "USAGE_NOTIFICATION_EVENT"

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :pswitch_7
    const-string v1, "USAGE_NOTIFICATION_COMMUNICATION_DELAYED"

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :pswitch_8
    const-string v1, "USAGE_NOTIFICATION_COMMUNICATION_INSTANT"

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :pswitch_9
    const-string v1, "USAGE_NOTIFICATION_COMMUNICATION_REQUEST"

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :pswitch_a
    const-string v1, "USAGE_NOTIFICATION_RINGTONE"

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :pswitch_b
    const-string v1, "USAGE_NOTIFICATION"

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :pswitch_c
    const-string v1, "USAGE_ALARM"

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :pswitch_d
    const-string v1, "USAGE_VOICE_COMMUNICATION_SIGNALLING"

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :pswitch_e
    const-string v1, "USAGE_VOICE_COMMUNICATION"

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :pswitch_f
    const-string v1, "USAGE_MEDIA"

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :pswitch_10
    const-string v1, "USAGE_UNKNOWN"

    .line 93
    .line 94
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v1, " content="

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    iget v1, p0, Landroidx/media/AudioAttributesImplBase;->b:I

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v1, " flags=0x"

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    iget v1, p0, Landroidx/media/AudioAttributesImplBase;->c:I

    .line 113
    .line 114
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    return-object v0

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
