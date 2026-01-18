.class public final Lg1/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final j:Ljava/util/regex/Pattern;

.field public static final k:Ljava/util/regex/Pattern;

.field public static final l:Ljava/util/regex/Pattern;

.field public static final m:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "(\\d{2,4})[^\\d]*"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lg1/q;->j:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lg1/q;->k:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    const-string v0, "(\\d{1,2})[^\\d]*"

    .line 18
    .line 19
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lg1/q;->l:Ljava/util/regex/Pattern;

    .line 24
    .line 25
    const-string v0, "(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*"

    .line 26
    .line 27
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lg1/q;->m:Ljava/util/regex/Pattern;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg1/q;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lg1/q;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-wide p3, p0, Lg1/q;->c:J

    .line 9
    .line 10
    iput-object p5, p0, Lg1/q;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p6, p0, Lg1/q;->e:Ljava/lang/String;

    .line 13
    .line 14
    iput-boolean p7, p0, Lg1/q;->f:Z

    .line 15
    .line 16
    iput-boolean p8, p0, Lg1/q;->g:Z

    .line 17
    .line 18
    iput-boolean p9, p0, Lg1/q;->i:Z

    .line 19
    .line 20
    iput-boolean p10, p0, Lg1/q;->h:Z

    .line 21
    .line 22
    return-void
.end method

.method public static a(Ljava/lang/String;IIZ)I
    .locals 3

    .line 1
    :goto_0
    if-ge p1, p2, :cond_7

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x20

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-ge v0, v1, :cond_0

    .line 11
    .line 12
    const/16 v1, 0x9

    .line 13
    .line 14
    if-ne v0, v1, :cond_5

    .line 15
    .line 16
    :cond_0
    const/16 v1, 0x7f

    .line 17
    .line 18
    if-ge v0, v1, :cond_5

    .line 19
    .line 20
    const/16 v1, 0x30

    .line 21
    .line 22
    if-lt v0, v1, :cond_1

    .line 23
    .line 24
    const/16 v1, 0x39

    .line 25
    .line 26
    if-le v0, v1, :cond_5

    .line 27
    .line 28
    :cond_1
    const/16 v1, 0x61

    .line 29
    .line 30
    if-lt v0, v1, :cond_2

    .line 31
    .line 32
    const/16 v1, 0x7a

    .line 33
    .line 34
    if-le v0, v1, :cond_5

    .line 35
    .line 36
    :cond_2
    const/16 v1, 0x41

    .line 37
    .line 38
    if-lt v0, v1, :cond_3

    .line 39
    .line 40
    const/16 v1, 0x5a

    .line 41
    .line 42
    if-le v0, v1, :cond_5

    .line 43
    .line 44
    :cond_3
    const/16 v1, 0x3a

    .line 45
    .line 46
    if-ne v0, v1, :cond_4

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_4
    const/4 v0, 0x0

    .line 50
    goto :goto_2

    .line 51
    :cond_5
    :goto_1
    const/4 v0, 0x1

    .line 52
    :goto_2
    xor-int/lit8 v1, p3, 0x1

    .line 53
    .line 54
    if-ne v0, v1, :cond_6

    .line 55
    .line 56
    return p1

    .line 57
    :cond_6
    add-int/lit8 p1, p1, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_7
    return p2
.end method

.method public static b(Ljava/lang/String;I)J
    .locals 14

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0, p1, v0}, Lg1/q;->a(Ljava/lang/String;IIZ)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    sget-object v2, Lg1/q;->m:Ljava/util/regex/Pattern;

    .line 7
    .line 8
    invoke-virtual {v2, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    const/4 v4, -0x1

    .line 13
    const/4 v5, -0x1

    .line 14
    const/4 v6, -0x1

    .line 15
    const/4 v7, -0x1

    .line 16
    const/4 v8, -0x1

    .line 17
    const/4 v9, -0x1

    .line 18
    const/4 v10, -0x1

    .line 19
    :goto_0
    const/4 v11, 0x1

    .line 20
    const/4 v12, 0x2

    .line 21
    if-ge v1, p1, :cond_4

    .line 22
    .line 23
    add-int/lit8 v13, v1, 0x1

    .line 24
    .line 25
    invoke-static {p0, v13, p1, v11}, Lg1/q;->a(Ljava/lang/String;IIZ)I

    .line 26
    .line 27
    .line 28
    move-result v13

    .line 29
    invoke-virtual {v3, v1, v13}, Ljava/util/regex/Matcher;->region(II)Ljava/util/regex/Matcher;

    .line 30
    .line 31
    .line 32
    if-ne v6, v4, :cond_0

    .line 33
    .line 34
    invoke-virtual {v3, v2}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    invoke-virtual {v3, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    invoke-virtual {v3, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    const/4 v1, 0x3

    .line 61
    invoke-virtual {v3, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v10

    .line 69
    goto :goto_1

    .line 70
    :cond_0
    if-ne v7, v4, :cond_1

    .line 71
    .line 72
    sget-object v1, Lg1/q;->l:Ljava/util/regex/Pattern;

    .line 73
    .line 74
    invoke-virtual {v3, v1}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_1

    .line 83
    .line 84
    invoke-virtual {v3, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    goto :goto_1

    .line 93
    :cond_1
    if-ne v8, v4, :cond_2

    .line 94
    .line 95
    sget-object v1, Lg1/q;->k:Ljava/util/regex/Pattern;

    .line 96
    .line 97
    invoke-virtual {v3, v1}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    .line 98
    .line 99
    .line 100
    move-result-object v12

    .line 101
    invoke-virtual {v12}, Ljava/util/regex/Matcher;->matches()Z

    .line 102
    .line 103
    .line 104
    move-result v12

    .line 105
    if-eqz v12, :cond_2

    .line 106
    .line 107
    invoke-virtual {v3, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    sget-object v11, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 112
    .line 113
    invoke-virtual {v8, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    invoke-virtual {v1}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v1, v8}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    div-int/lit8 v8, v1, 0x4

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_2
    if-ne v5, v4, :cond_3

    .line 129
    .line 130
    sget-object v1, Lg1/q;->j:Ljava/util/regex/Pattern;

    .line 131
    .line 132
    invoke-virtual {v3, v1}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    if-eqz v1, :cond_3

    .line 141
    .line 142
    invoke-virtual {v3, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    :cond_3
    :goto_1
    add-int/lit8 v13, v13, 0x1

    .line 151
    .line 152
    invoke-static {p0, v13, p1, v0}, Lg1/q;->a(Ljava/lang/String;IIZ)I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    :cond_4
    const/16 p0, 0x46

    .line 159
    .line 160
    if-lt v5, p0, :cond_5

    .line 161
    .line 162
    const/16 p0, 0x63

    .line 163
    .line 164
    if-gt v5, p0, :cond_5

    .line 165
    .line 166
    add-int/lit16 v5, v5, 0x76c

    .line 167
    .line 168
    :cond_5
    if-ltz v5, :cond_6

    .line 169
    .line 170
    const/16 p0, 0x45

    .line 171
    .line 172
    if-gt v5, p0, :cond_6

    .line 173
    .line 174
    add-int/lit16 v5, v5, 0x7d0

    .line 175
    .line 176
    :cond_6
    const/16 p0, 0x641

    .line 177
    .line 178
    if-lt v5, p0, :cond_c

    .line 179
    .line 180
    if-eq v8, v4, :cond_b

    .line 181
    .line 182
    if-lt v7, v11, :cond_a

    .line 183
    .line 184
    const/16 p0, 0x1f

    .line 185
    .line 186
    if-gt v7, p0, :cond_a

    .line 187
    .line 188
    if-ltz v6, :cond_9

    .line 189
    .line 190
    const/16 p0, 0x17

    .line 191
    .line 192
    if-gt v6, p0, :cond_9

    .line 193
    .line 194
    if-ltz v9, :cond_8

    .line 195
    .line 196
    const/16 p0, 0x3b

    .line 197
    .line 198
    if-gt v9, p0, :cond_8

    .line 199
    .line 200
    if-ltz v10, :cond_7

    .line 201
    .line 202
    if-gt v10, p0, :cond_7

    .line 203
    .line 204
    new-instance p0, Ljava/util/GregorianCalendar;

    .line 205
    .line 206
    sget-object p1, Lh1/c;->e:Ljava/util/TimeZone;

    .line 207
    .line 208
    invoke-direct {p0, p1}, Ljava/util/GregorianCalendar;-><init>(Ljava/util/TimeZone;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p0, v0}, Ljava/util/Calendar;->setLenient(Z)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0, v11, v5}, Ljava/util/Calendar;->set(II)V

    .line 215
    .line 216
    .line 217
    sub-int/2addr v8, v11

    .line 218
    invoke-virtual {p0, v12, v8}, Ljava/util/Calendar;->set(II)V

    .line 219
    .line 220
    .line 221
    const/4 p1, 0x5

    .line 222
    invoke-virtual {p0, p1, v7}, Ljava/util/Calendar;->set(II)V

    .line 223
    .line 224
    .line 225
    const/16 p1, 0xb

    .line 226
    .line 227
    invoke-virtual {p0, p1, v6}, Ljava/util/Calendar;->set(II)V

    .line 228
    .line 229
    .line 230
    const/16 p1, 0xc

    .line 231
    .line 232
    invoke-virtual {p0, p1, v9}, Ljava/util/Calendar;->set(II)V

    .line 233
    .line 234
    .line 235
    const/16 p1, 0xd

    .line 236
    .line 237
    invoke-virtual {p0, p1, v10}, Ljava/util/Calendar;->set(II)V

    .line 238
    .line 239
    .line 240
    const/16 p1, 0xe

    .line 241
    .line 242
    invoke-virtual {p0, p1, v0}, Ljava/util/Calendar;->set(II)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 246
    .line 247
    .line 248
    move-result-wide p0

    .line 249
    return-wide p0

    .line 250
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 251
    .line 252
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 253
    .line 254
    .line 255
    throw p0

    .line 256
    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 257
    .line 258
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 259
    .line 260
    .line 261
    throw p0

    .line 262
    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 263
    .line 264
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 265
    .line 266
    .line 267
    throw p0

    .line 268
    :cond_a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 269
    .line 270
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 271
    .line 272
    .line 273
    throw p0

    .line 274
    :cond_b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 275
    .line 276
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 277
    .line 278
    .line 279
    throw p0

    .line 280
    :cond_c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 281
    .line 282
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 283
    .line 284
    .line 285
    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    instance-of v0, p1, Lg1/q;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Lg1/q;

    .line 8
    .line 9
    iget-object v0, p1, Lg1/q;->a:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v2, p0, Lg1/q;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p1, Lg1/q;->b:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v2, p0, Lg1/q;->b:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p1, Lg1/q;->d:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v2, p0, Lg1/q;->d:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iget-object v0, p1, Lg1/q;->e:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v2, p0, Lg1/q;->e:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    iget-wide v2, p1, Lg1/q;->c:J

    .line 50
    .line 51
    iget-wide v4, p0, Lg1/q;->c:J

    .line 52
    .line 53
    cmp-long v0, v2, v4

    .line 54
    .line 55
    if-nez v0, :cond_1

    .line 56
    .line 57
    iget-boolean v0, p1, Lg1/q;->f:Z

    .line 58
    .line 59
    iget-boolean v2, p0, Lg1/q;->f:Z

    .line 60
    .line 61
    if-ne v0, v2, :cond_1

    .line 62
    .line 63
    iget-boolean v0, p1, Lg1/q;->g:Z

    .line 64
    .line 65
    iget-boolean v2, p0, Lg1/q;->g:Z

    .line 66
    .line 67
    if-ne v0, v2, :cond_1

    .line 68
    .line 69
    iget-boolean v0, p1, Lg1/q;->h:Z

    .line 70
    .line 71
    iget-boolean v2, p0, Lg1/q;->h:Z

    .line 72
    .line 73
    if-ne v0, v2, :cond_1

    .line 74
    .line 75
    iget-boolean p1, p1, Lg1/q;->i:Z

    .line 76
    .line 77
    iget-boolean v0, p0, Lg1/q;->i:Z

    .line 78
    .line 79
    if-ne p1, v0, :cond_1

    .line 80
    .line 81
    const/4 v1, 0x1

    .line 82
    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    iget-object v0, p0, Lg1/q;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit16 v0, v0, 0x20f

    .line 8
    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object v1, p0, Lg1/q;->b:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget-object v0, p0, Lg1/q;->d:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/2addr v0, v1

    .line 27
    mul-int/lit8 v0, v0, 0x1f

    .line 28
    .line 29
    iget-object v1, p0, Lg1/q;->e:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    add-int/2addr v1, v0

    .line 36
    mul-int/lit8 v1, v1, 0x1f

    .line 37
    .line 38
    const/16 v0, 0x20

    .line 39
    .line 40
    iget-wide v2, p0, Lg1/q;->c:J

    .line 41
    .line 42
    ushr-long v4, v2, v0

    .line 43
    .line 44
    xor-long/2addr v2, v4

    .line 45
    long-to-int v0, v2

    .line 46
    add-int/2addr v1, v0

    .line 47
    mul-int/lit8 v1, v1, 0x1f

    .line 48
    .line 49
    iget-boolean v0, p0, Lg1/q;->f:Z

    .line 50
    .line 51
    xor-int/lit8 v0, v0, 0x1

    .line 52
    .line 53
    add-int/2addr v1, v0

    .line 54
    mul-int/lit8 v1, v1, 0x1f

    .line 55
    .line 56
    iget-boolean v0, p0, Lg1/q;->g:Z

    .line 57
    .line 58
    xor-int/lit8 v0, v0, 0x1

    .line 59
    .line 60
    add-int/2addr v1, v0

    .line 61
    mul-int/lit8 v1, v1, 0x1f

    .line 62
    .line 63
    iget-boolean v0, p0, Lg1/q;->h:Z

    .line 64
    .line 65
    xor-int/lit8 v0, v0, 0x1

    .line 66
    .line 67
    add-int/2addr v1, v0

    .line 68
    mul-int/lit8 v1, v1, 0x1f

    .line 69
    .line 70
    iget-boolean v0, p0, Lg1/q;->i:Z

    .line 71
    .line 72
    xor-int/lit8 v0, v0, 0x1

    .line 73
    .line 74
    add-int/2addr v1, v0

    .line 75
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lg1/q;->a:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const/16 v1, 0x3d

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lg1/q;->b:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-boolean v1, p0, Lg1/q;->h:Z

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const-wide/high16 v1, -0x8000000000000000L

    .line 26
    .line 27
    iget-wide v3, p0, Lg1/q;->c:J

    .line 28
    .line 29
    cmp-long v5, v3, v1

    .line 30
    .line 31
    if-nez v5, :cond_0

    .line 32
    .line 33
    const-string v1, "; max-age=0"

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const-string v1, "; expires="

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    new-instance v1, Ljava/util/Date;

    .line 45
    .line 46
    invoke-direct {v1, v3, v4}, Ljava/util/Date;-><init>(J)V

    .line 47
    .line 48
    .line 49
    sget-object v2, Lk1/c;->a:LQ0/c;

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Ljava/text/DateFormat;

    .line 56
    .line 57
    invoke-virtual {v2, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    :cond_1
    :goto_0
    iget-boolean v1, p0, Lg1/q;->i:Z

    .line 65
    .line 66
    if-nez v1, :cond_2

    .line 67
    .line 68
    const-string v1, "; domain="

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    iget-object v1, p0, Lg1/q;->d:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    :cond_2
    const-string v1, "; path="

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    iget-object v1, p0, Lg1/q;->e:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-boolean v1, p0, Lg1/q;->f:Z

    .line 89
    .line 90
    if-eqz v1, :cond_3

    .line 91
    .line 92
    const-string v1, "; secure"

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    :cond_3
    iget-boolean v1, p0, Lg1/q;->g:Z

    .line 98
    .line 99
    if-eqz v1, :cond_4

    .line 100
    .line 101
    const-string v1, "; httponly"

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    return-object v0
.end method
