.class public final La/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final j:[I

.field public static final k:[I

.field public static final l:[B

.field public static final m:[B

.field public static final n:[B

.field public static final o:[Ljava/lang/String;

.field public static final p:[I

.field public static final q:[B

.field public static final r:La/c;

.field public static final s:[[La/c;

.field public static final t:[La/c;

.field public static final u:[Ljava/util/HashMap;

.field public static final v:[Ljava/util/HashMap;

.field public static final w:Ljava/util/HashSet;

.field public static final x:Ljava/util/HashMap;

.field public static final y:Ljava/nio/charset/Charset;

.field public static final z:[B


# instance fields
.field public final a:Ljava/lang/String;

.field public b:I

.field public final c:[Ljava/util/HashMap;

.field public d:Ljava/nio/ByteOrder;

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I


# direct methods
.method static constructor <clinit>()V
    .locals 112

    const/4 v0, 0x1

    .line 1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x6

    .line 2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v6, 0x8

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x4

    new-array v9, v8, [Ljava/lang/Integer;

    const/4 v10, 0x0

    aput-object v1, v9, v10

    aput-object v3, v9, v0

    const/4 v3, 0x2

    aput-object v5, v9, v3

    aput-object v7, v9, v4

    .line 3
    invoke-static {v9}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 4
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/4 v11, 0x7

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/4 v14, 0x5

    .line 5
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    new-array v11, v8, [Ljava/lang/Integer;

    aput-object v9, v11, v10

    aput-object v12, v11, v0

    aput-object v13, v11, v3

    aput-object v15, v11, v4

    .line 6
    invoke-static {v11}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 7
    filled-new-array {v6, v6, v6}, [I

    move-result-object v11

    sput-object v11, La/e;->j:[I

    .line 8
    filled-new-array {v6}, [I

    move-result-object v11

    sput-object v11, La/e;->k:[I

    .line 9
    new-array v11, v4, [B

    fill-array-data v11, :array_0

    sput-object v11, La/e;->l:[B

    .line 10
    new-array v11, v2, [B

    fill-array-data v11, :array_1

    sput-object v11, La/e;->m:[B

    const/16 v11, 0xa

    .line 11
    new-array v13, v11, [B

    fill-array-data v13, :array_2

    sput-object v13, La/e;->n:[B

    .line 12
    const-string v25, "SLONG"

    const-string v26, "SRATIONAL"

    const-string v16, ""

    const-string v17, "BYTE"

    const-string v18, "STRING"

    const-string v19, "USHORT"

    const-string v20, "ULONG"

    const-string v21, "URATIONAL"

    const-string v22, "SBYTE"

    const-string v23, "UNDEFINED"

    const-string v24, "SSHORT"

    const-string v27, "SINGLE"

    const-string v28, "DOUBLE"

    filled-new-array/range {v16 .. v28}, [Ljava/lang/String;

    move-result-object v13

    sput-object v13, La/e;->o:[Ljava/lang/String;

    const/16 v13, 0xe

    .line 13
    new-array v11, v13, [I

    fill-array-data v11, :array_3

    sput-object v11, La/e;->p:[I

    .line 14
    new-array v11, v6, [B

    fill-array-data v11, :array_4

    sput-object v11, La/e;->q:[B

    .line 15
    new-instance v11, La/c;

    const-string v13, "NewSubfileType"

    const/16 v6, 0xfe

    invoke-direct {v11, v13, v6, v8}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v6, La/c;

    const-string v0, "SubfileType"

    const/16 v10, 0xff

    invoke-direct {v6, v0, v10, v8}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v10, La/c;

    const-string v2, "ImageWidth"

    const/16 v8, 0x100

    invoke-direct {v10, v2, v8}, La/c;-><init>(Ljava/lang/String;I)V

    new-instance v2, La/c;

    const-string v8, "ImageLength"

    const/16 v14, 0x101

    invoke-direct {v2, v8, v14}, La/c;-><init>(Ljava/lang/String;I)V

    new-instance v8, La/c;

    const-string v14, "BitsPerSample"

    const/16 v3, 0x102

    invoke-direct {v8, v14, v3, v4}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v3, La/c;

    move-object/from16 v29, v7

    const-string v7, "Compression"

    move-object/from16 v30, v12

    const/16 v12, 0x103

    invoke-direct {v3, v7, v12, v4}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v12, La/c;

    move-object/from16 v32, v5

    const-string v5, "PhotometricInterpretation"

    move-object/from16 v33, v9

    const/16 v9, 0x106

    invoke-direct {v12, v5, v9, v4}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v9, La/c;

    const-string v4, "ImageDescription"

    move-object/from16 v35, v1

    const/16 v1, 0x10e

    move-object/from16 v36, v15

    const/4 v15, 0x2

    invoke-direct {v9, v4, v1, v15}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v1, La/c;

    move-object/from16 v38, v4

    const-string v4, "Make"

    move-object/from16 v39, v5

    const/16 v5, 0x10f

    invoke-direct {v1, v4, v5, v15}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v5, La/c;

    move-object/from16 v41, v4

    const-string v4, "Model"

    move-object/from16 v42, v7

    const/16 v7, 0x110

    invoke-direct {v5, v4, v7, v15}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v15, La/c;

    const-string v7, "StripOffsets"

    move-object/from16 v44, v4

    const/16 v4, 0x111

    invoke-direct {v15, v7, v4}, La/c;-><init>(Ljava/lang/String;I)V

    new-instance v4, La/c;

    move-object/from16 v45, v7

    const-string v7, "Orientation"

    move-object/from16 v46, v14

    const/16 v14, 0x112

    move-object/from16 v47, v0

    const/4 v0, 0x3

    invoke-direct {v4, v7, v14, v0}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v14, La/c;

    move-object/from16 v49, v7

    const-string v7, "SamplesPerPixel"

    move-object/from16 v50, v13

    const/16 v13, 0x115

    invoke-direct {v14, v7, v13, v0}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v13, "RowsPerStrip"

    move-object/from16 v52, v7

    const/16 v7, 0x116

    invoke-direct {v0, v13, v7}, La/c;-><init>(Ljava/lang/String;I)V

    new-instance v7, La/c;

    const-string v13, "StripByteCounts"

    move-object/from16 v53, v0

    const/16 v0, 0x117

    invoke-direct {v7, v13, v0}, La/c;-><init>(Ljava/lang/String;I)V

    new-instance v0, La/c;

    const-string v13, "XResolution"

    move-object/from16 v54, v7

    const/16 v7, 0x11a

    move-object/from16 v55, v14

    const/4 v14, 0x5

    invoke-direct {v0, v13, v7, v14}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v7, La/c;

    const-string v13, "YResolution"

    move-object/from16 v56, v0

    const/16 v0, 0x11b

    invoke-direct {v7, v13, v0, v14}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v13, "PlanarConfiguration"

    const/16 v14, 0x11c

    move-object/from16 v57, v7

    const/4 v7, 0x3

    invoke-direct {v0, v13, v14, v7}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v13, La/c;

    const-string v14, "ResolutionUnit"

    move-object/from16 v58, v0

    const/16 v0, 0x128

    invoke-direct {v13, v14, v0, v7}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v14, "TransferFunction"

    move-object/from16 v59, v13

    const/16 v13, 0x12d

    invoke-direct {v0, v14, v13, v7}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v7, La/c;

    const-string v13, "Software"

    const/16 v14, 0x131

    move-object/from16 v60, v0

    const/4 v0, 0x2

    invoke-direct {v7, v13, v14, v0}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v13, La/c;

    const-string v14, "DateTime"

    move-object/from16 v61, v7

    const/16 v7, 0x132

    invoke-direct {v13, v14, v7, v0}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v7, La/c;

    const-string v14, "Artist"

    move-object/from16 v62, v13

    const/16 v13, 0x13b

    invoke-direct {v7, v14, v13, v0}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v13, "WhitePoint"

    const/16 v14, 0x13e

    move-object/from16 v63, v7

    const/4 v7, 0x5

    invoke-direct {v0, v13, v14, v7}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v13, La/c;

    const-string v14, "PrimaryChromaticities"

    move-object/from16 v64, v0

    const/16 v0, 0x13f

    invoke-direct {v13, v14, v0, v7}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v7, "SubIFDPointer"

    const/16 v14, 0x14a

    move-object/from16 v65, v13

    const/4 v13, 0x4

    invoke-direct {v0, v7, v14, v13}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v14, La/c;

    move-object/from16 v66, v7

    const-string v7, "JPEGInterchangeFormat"

    move-object/from16 v67, v0

    const/16 v0, 0x201

    invoke-direct {v14, v7, v0, v13}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v7, "JPEGInterchangeFormatLength"

    move-object/from16 v68, v14

    const/16 v14, 0x202

    invoke-direct {v0, v7, v14, v13}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v7, La/c;

    const-string v13, "YCbCrCoefficients"

    const/16 v14, 0x211

    move-object/from16 v69, v0

    const/4 v0, 0x5

    invoke-direct {v7, v13, v14, v0}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v13, "YCbCrSubSampling"

    const/16 v14, 0x212

    move-object/from16 v70, v7

    const/4 v7, 0x3

    invoke-direct {v0, v13, v14, v7}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v13, La/c;

    const-string v14, "YCbCrPositioning"

    move-object/from16 v71, v0

    const/16 v0, 0x213

    invoke-direct {v13, v14, v0, v7}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v7, "ReferenceBlackWhite"

    const/16 v14, 0x214

    move-object/from16 v72, v13

    const/4 v13, 0x5

    invoke-direct {v0, v7, v14, v13}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v7, La/c;

    const-string v13, "Copyright"

    const v14, 0x8298

    move-object/from16 v73, v0

    const/4 v0, 0x2

    invoke-direct {v7, v13, v14, v0}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v13, "ExifIFDPointer"

    const v14, 0x8769

    move-object/from16 v74, v7

    const/4 v7, 0x4

    invoke-direct {v0, v13, v14, v7}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v14, La/c;

    move-object/from16 v75, v13

    const-string v13, "GPSInfoIFDPointer"

    move-object/from16 v76, v0

    const v0, 0x8825

    invoke-direct {v14, v13, v0, v7}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    move-object/from16 v77, v13

    const-string v13, "SensorTopBorder"

    invoke-direct {v0, v13, v7, v7}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v13, La/c;

    move-object/from16 v78, v0

    const-string v0, "SensorLeftBorder"

    move-object/from16 v79, v14

    const/4 v14, 0x5

    invoke-direct {v13, v0, v14, v7}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v14, "SensorBottomBorder"

    move-object/from16 v80, v13

    const/4 v13, 0x6

    invoke-direct {v0, v14, v13, v7}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v13, La/c;

    const-string v14, "SensorRightBorder"

    move-object/from16 v81, v0

    const/4 v0, 0x7

    invoke-direct {v13, v14, v0, v7}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v7, La/c;

    const-string v14, "ISO"

    const/16 v0, 0x17

    move-object/from16 v82, v13

    const/4 v13, 0x3

    invoke-direct {v7, v14, v0, v13}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v14, La/c;

    const-string v0, "JpgFromRaw"

    const/16 v13, 0x2e

    move-object/from16 v83, v7

    const/4 v7, 0x7

    invoke-direct {v14, v0, v13, v7}, La/c;-><init>(Ljava/lang/String;II)V

    const/16 v0, 0x29

    new-array v0, v0, [La/c;

    const/4 v13, 0x0

    aput-object v11, v0, v13

    const/4 v11, 0x1

    aput-object v6, v0, v11

    const/4 v6, 0x2

    aput-object v10, v0, v6

    const/4 v6, 0x3

    aput-object v2, v0, v6

    const/4 v2, 0x4

    aput-object v8, v0, v2

    const/4 v2, 0x5

    aput-object v3, v0, v2

    const/4 v2, 0x6

    aput-object v12, v0, v2

    aput-object v9, v0, v7

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const/16 v1, 0x9

    aput-object v5, v0, v1

    const/16 v2, 0xa

    aput-object v15, v0, v2

    const/16 v2, 0xb

    aput-object v4, v0, v2

    const/16 v3, 0xc

    aput-object v55, v0, v3

    const/16 v4, 0xd

    aput-object v53, v0, v4

    const/16 v5, 0xe

    aput-object v54, v0, v5

    const/16 v5, 0xf

    aput-object v56, v0, v5

    const/16 v6, 0x10

    aput-object v57, v0, v6

    const/16 v7, 0x11

    aput-object v58, v0, v7

    const/16 v8, 0x12

    aput-object v59, v0, v8

    const/16 v9, 0x13

    aput-object v60, v0, v9

    const/16 v10, 0x14

    aput-object v61, v0, v10

    const/16 v11, 0x15

    aput-object v62, v0, v11

    const/16 v11, 0x16

    aput-object v63, v0, v11

    const/16 v11, 0x17

    aput-object v64, v0, v11

    const/16 v11, 0x18

    aput-object v65, v0, v11

    const/16 v11, 0x19

    aput-object v67, v0, v11

    const/16 v11, 0x1a

    aput-object v68, v0, v11

    const/16 v11, 0x1b

    aput-object v69, v0, v11

    const/16 v11, 0x1c

    aput-object v70, v0, v11

    const/16 v11, 0x1d

    aput-object v71, v0, v11

    const/16 v11, 0x1e

    aput-object v72, v0, v11

    const/16 v11, 0x1f

    aput-object v73, v0, v11

    const/16 v11, 0x20

    aput-object v74, v0, v11

    const/16 v11, 0x21

    aput-object v76, v0, v11

    const/16 v11, 0x22

    aput-object v79, v0, v11

    const/16 v11, 0x23

    aput-object v78, v0, v11

    const/16 v11, 0x24

    aput-object v80, v0, v11

    const/16 v11, 0x25

    aput-object v81, v0, v11

    const/16 v11, 0x26

    aput-object v82, v0, v11

    const/16 v11, 0x27

    aput-object v83, v0, v11

    const/16 v11, 0x28

    aput-object v14, v0, v11

    .line 16
    new-instance v11, La/c;

    const-string v12, "ExposureTime"

    const v13, 0x829a

    const/4 v14, 0x5

    invoke-direct {v11, v12, v13, v14}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v12, La/c;

    const-string v13, "FNumber"

    const v15, 0x829d

    invoke-direct {v12, v13, v15, v14}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v13, La/c;

    const-string v14, "ExposureProgram"

    const v15, 0x8822

    const/4 v10, 0x3

    invoke-direct {v13, v14, v15, v10}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v14, La/c;

    const-string v15, "SpectralSensitivity"

    const v9, 0x8824

    const/4 v8, 0x2

    invoke-direct {v14, v15, v9, v8}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v8, La/c;

    const-string v9, "PhotographicSensitivity"

    const v15, 0x8827

    invoke-direct {v8, v9, v15, v10}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v9, La/c;

    const-string v10, "OECF"

    const v15, 0x8828

    const/4 v7, 0x7

    invoke-direct {v9, v10, v15, v7}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v7, La/c;

    const-string v10, "ExifVersion"

    const v15, 0x9000

    const/4 v6, 0x2

    invoke-direct {v7, v10, v15, v6}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v10, La/c;

    const-string v15, "DateTimeOriginal"

    const v5, 0x9003

    invoke-direct {v10, v15, v5, v6}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v5, La/c;

    const-string v15, "DateTimeDigitized"

    const v4, 0x9004

    invoke-direct {v5, v15, v4, v6}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v4, La/c;

    const-string v6, "ComponentsConfiguration"

    const v15, 0x9101

    const/4 v3, 0x7

    invoke-direct {v4, v6, v15, v3}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v3, La/c;

    const-string v6, "CompressedBitsPerPixel"

    const v15, 0x9102

    const/4 v2, 0x5

    invoke-direct {v3, v6, v15, v2}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v6, La/c;

    const-string v15, "ShutterSpeedValue"

    const v1, 0x9201

    const/16 v2, 0xa

    invoke-direct {v6, v15, v1, v2}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v1, La/c;

    const-string v15, "ApertureValue"

    const v2, 0x9202

    move-object/from16 v63, v0

    const/4 v0, 0x5

    invoke-direct {v1, v15, v2, v0}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v2, "BrightnessValue"

    const v15, 0x9203

    move-object/from16 v64, v1

    const/16 v1, 0xa

    invoke-direct {v0, v2, v15, v1}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v2, La/c;

    const-string v15, "ExposureBiasValue"

    move-object/from16 v65, v0

    const v0, 0x9204

    invoke-direct {v2, v15, v0, v1}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v1, "MaxApertureValue"

    const v15, 0x9205

    move-object/from16 v67, v2

    const/4 v2, 0x5

    invoke-direct {v0, v1, v15, v2}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v1, La/c;

    const-string v15, "SubjectDistance"

    move-object/from16 v68, v0

    const v0, 0x9206

    invoke-direct {v1, v15, v0, v2}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v2, "MeteringMode"

    const v15, 0x9207

    move-object/from16 v69, v1

    const/4 v1, 0x3

    invoke-direct {v0, v2, v15, v1}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v2, La/c;

    const-string v15, "LightSource"

    move-object/from16 v70, v0

    const v0, 0x9208

    invoke-direct {v2, v15, v0, v1}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v15, "Flash"

    move-object/from16 v71, v2

    const v2, 0x9209

    invoke-direct {v0, v15, v2, v1}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v2, La/c;

    const-string v15, "FocalLength"

    const v1, 0x920a

    move-object/from16 v72, v0

    const/4 v0, 0x5

    invoke-direct {v2, v15, v1, v0}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v1, "SubjectArea"

    const v15, 0x9214

    move-object/from16 v73, v2

    const/4 v2, 0x3

    invoke-direct {v0, v1, v15, v2}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v1, La/c;

    const-string v2, "MakerNote"

    const v15, 0x927c

    move-object/from16 v74, v0

    const/4 v0, 0x7

    invoke-direct {v1, v2, v15, v0}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v2, La/c;

    const-string v15, "UserComment"

    move-object/from16 v76, v1

    const v1, 0x9286

    invoke-direct {v2, v15, v1, v0}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v1, "SubSecTime"

    const v15, 0x9290

    move-object/from16 v78, v2

    const/4 v2, 0x2

    invoke-direct {v0, v1, v15, v2}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v1, La/c;

    const-string v15, "SubSecTimeOriginal"

    move-object/from16 v79, v0

    const v0, 0x9291

    invoke-direct {v1, v15, v0, v2}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v15, "SubSecTimeDigitized"

    move-object/from16 v80, v1

    const v1, 0x9292

    invoke-direct {v0, v15, v1, v2}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v1, La/c;

    const-string v2, "FlashpixVersion"

    const v15, 0xa000

    move-object/from16 v81, v0

    const/4 v0, 0x7

    invoke-direct {v1, v2, v15, v0}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v2, "ColorSpace"

    const v15, 0xa001

    move-object/from16 v82, v1

    const/4 v1, 0x3

    invoke-direct {v0, v2, v15, v1}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v1, La/c;

    const-string v2, "PixelXDimension"

    const v15, 0xa002

    invoke-direct {v1, v2, v15}, La/c;-><init>(Ljava/lang/String;I)V

    new-instance v2, La/c;

    const-string v15, "PixelYDimension"

    move-object/from16 v83, v1

    const v1, 0xa003

    invoke-direct {v2, v15, v1}, La/c;-><init>(Ljava/lang/String;I)V

    new-instance v1, La/c;

    const-string v15, "RelatedSoundFile"

    move-object/from16 v84, v2

    const v2, 0xa004

    move-object/from16 v85, v0

    const/4 v0, 0x2

    invoke-direct {v1, v15, v2, v0}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v2, "InteroperabilityIFDPointer"

    const v15, 0xa005

    move-object/from16 v86, v1

    const/4 v1, 0x4

    invoke-direct {v0, v2, v15, v1}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v1, La/c;

    const-string v2, "FlashEnergy"

    const v15, 0xa20b

    move-object/from16 v87, v0

    const/4 v0, 0x5

    invoke-direct {v1, v2, v15, v0}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v2, La/c;

    const-string v15, "SpatialFrequencyResponse"

    const v0, 0xa20c

    move-object/from16 v88, v1

    const/4 v1, 0x7

    invoke-direct {v2, v15, v0, v1}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v1, "FocalPlaneXResolution"

    const v15, 0xa20e

    move-object/from16 v89, v2

    const/4 v2, 0x5

    invoke-direct {v0, v1, v15, v2}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v1, La/c;

    const-string v15, "FocalPlaneYResolution"

    move-object/from16 v90, v0

    const v0, 0xa20f

    invoke-direct {v1, v15, v0, v2}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v2, "FocalPlaneResolutionUnit"

    const v15, 0xa210

    move-object/from16 v91, v1

    const/4 v1, 0x3

    invoke-direct {v0, v2, v15, v1}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v2, La/c;

    const-string v15, "SubjectLocation"

    move-object/from16 v92, v0

    const v0, 0xa214

    invoke-direct {v2, v15, v0, v1}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v15, "ExposureIndex"

    const v1, 0xa215

    move-object/from16 v93, v2

    const/4 v2, 0x5

    invoke-direct {v0, v15, v1, v2}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v1, La/c;

    const-string v2, "SensingMethod"

    const v15, 0xa217

    move-object/from16 v94, v0

    const/4 v0, 0x3

    invoke-direct {v1, v2, v15, v0}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v2, "FileSource"

    const v15, 0xa300

    move-object/from16 v95, v1

    const/4 v1, 0x7

    invoke-direct {v0, v2, v15, v1}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v2, La/c;

    const-string v15, "SceneType"

    move-object/from16 v96, v0

    const v0, 0xa301

    invoke-direct {v2, v15, v0, v1}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v15, "CFAPattern"

    move-object/from16 v97, v2

    const v2, 0xa302

    invoke-direct {v0, v15, v2, v1}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v1, La/c;

    const-string v2, "CustomRendered"

    const v15, 0xa401

    move-object/from16 v98, v0

    const/4 v0, 0x3

    invoke-direct {v1, v2, v15, v0}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v2, La/c;

    const-string v15, "ExposureMode"

    move-object/from16 v99, v1

    const v1, 0xa402

    invoke-direct {v2, v15, v1, v0}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v1, La/c;

    const-string v15, "WhiteBalance"

    move-object/from16 v100, v2

    const v2, 0xa403

    invoke-direct {v1, v15, v2, v0}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v2, La/c;

    const-string v15, "DigitalZoomRatio"

    const v0, 0xa404

    move-object/from16 v101, v1

    const/4 v1, 0x5

    invoke-direct {v2, v15, v0, v1}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v1, "FocalLengthIn35mmFilm"

    const v15, 0xa405

    move-object/from16 v102, v2

    const/4 v2, 0x3

    invoke-direct {v0, v1, v15, v2}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v1, La/c;

    const-string v15, "SceneCaptureType"

    move-object/from16 v103, v0

    const v0, 0xa406

    invoke-direct {v1, v15, v0, v2}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v15, "GainControl"

    move-object/from16 v104, v1

    const v1, 0xa407

    invoke-direct {v0, v15, v1, v2}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v1, La/c;

    const-string v15, "Contrast"

    move-object/from16 v105, v0

    const v0, 0xa408

    invoke-direct {v1, v15, v0, v2}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v15, "Saturation"

    move-object/from16 v106, v1

    const v1, 0xa409

    invoke-direct {v0, v15, v1, v2}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v1, La/c;

    const-string v15, "Sharpness"

    move-object/from16 v107, v0

    const v0, 0xa40a

    invoke-direct {v1, v15, v0, v2}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v15, "DeviceSettingDescription"

    const v2, 0xa40b

    move-object/from16 v108, v1

    const/4 v1, 0x7

    invoke-direct {v0, v15, v2, v1}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v1, La/c;

    const-string v2, "SubjectDistanceRange"

    const v15, 0xa40c

    move-object/from16 v109, v0

    const/4 v0, 0x3

    invoke-direct {v1, v2, v15, v0}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v2, "ImageUniqueID"

    const v15, 0xa420

    move-object/from16 v110, v1

    const/4 v1, 0x2

    invoke-direct {v0, v2, v15, v1}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v1, La/c;

    const-string v2, "DNGVersion"

    const v15, 0xc612

    move-object/from16 v111, v0

    const/4 v0, 0x1

    invoke-direct {v1, v2, v15, v0}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v2, La/c;

    const-string v15, "DefaultCropSize"

    const v0, 0xc620

    invoke-direct {v2, v15, v0}, La/c;-><init>(Ljava/lang/String;I)V

    const/16 v0, 0x3b

    new-array v0, v0, [La/c;

    const/4 v15, 0x0

    aput-object v11, v0, v15

    const/4 v11, 0x1

    aput-object v12, v0, v11

    const/4 v11, 0x2

    aput-object v13, v0, v11

    const/4 v11, 0x3

    aput-object v14, v0, v11

    const/4 v11, 0x4

    aput-object v8, v0, v11

    const/4 v8, 0x5

    aput-object v9, v0, v8

    const/4 v8, 0x6

    aput-object v7, v0, v8

    const/4 v7, 0x7

    aput-object v10, v0, v7

    const/16 v7, 0x8

    aput-object v5, v0, v7

    const/16 v5, 0x9

    aput-object v4, v0, v5

    const/16 v4, 0xa

    aput-object v3, v0, v4

    const/16 v3, 0xb

    aput-object v6, v0, v3

    const/16 v3, 0xc

    aput-object v64, v0, v3

    const/16 v3, 0xd

    aput-object v65, v0, v3

    const/16 v3, 0xe

    aput-object v67, v0, v3

    const/16 v3, 0xf

    aput-object v68, v0, v3

    const/16 v3, 0x10

    aput-object v69, v0, v3

    const/16 v3, 0x11

    aput-object v70, v0, v3

    const/16 v3, 0x12

    aput-object v71, v0, v3

    const/16 v3, 0x13

    aput-object v72, v0, v3

    const/16 v3, 0x14

    aput-object v73, v0, v3

    const/16 v3, 0x15

    aput-object v74, v0, v3

    const/16 v3, 0x16

    aput-object v76, v0, v3

    const/16 v3, 0x17

    aput-object v78, v0, v3

    const/16 v3, 0x18

    aput-object v79, v0, v3

    const/16 v3, 0x19

    aput-object v80, v0, v3

    const/16 v3, 0x1a

    aput-object v81, v0, v3

    const/16 v3, 0x1b

    aput-object v82, v0, v3

    const/16 v3, 0x1c

    aput-object v85, v0, v3

    const/16 v3, 0x1d

    aput-object v83, v0, v3

    const/16 v3, 0x1e

    aput-object v84, v0, v3

    const/16 v3, 0x1f

    aput-object v86, v0, v3

    const/16 v3, 0x20

    aput-object v87, v0, v3

    const/16 v3, 0x21

    aput-object v88, v0, v3

    const/16 v3, 0x22

    aput-object v89, v0, v3

    const/16 v3, 0x23

    aput-object v90, v0, v3

    const/16 v3, 0x24

    aput-object v91, v0, v3

    const/16 v3, 0x25

    aput-object v92, v0, v3

    const/16 v3, 0x26

    aput-object v93, v0, v3

    const/16 v3, 0x27

    aput-object v94, v0, v3

    const/16 v3, 0x28

    aput-object v95, v0, v3

    const/16 v3, 0x29

    aput-object v96, v0, v3

    const/16 v3, 0x2a

    aput-object v97, v0, v3

    const/16 v3, 0x2b

    aput-object v98, v0, v3

    const/16 v3, 0x2c

    aput-object v99, v0, v3

    const/16 v3, 0x2d

    aput-object v100, v0, v3

    const/16 v3, 0x2e

    aput-object v101, v0, v3

    const/16 v3, 0x2f

    aput-object v102, v0, v3

    const/16 v3, 0x30

    aput-object v103, v0, v3

    const/16 v3, 0x31

    aput-object v104, v0, v3

    const/16 v3, 0x32

    aput-object v105, v0, v3

    const/16 v3, 0x33

    aput-object v106, v0, v3

    const/16 v3, 0x34

    aput-object v107, v0, v3

    const/16 v3, 0x35

    aput-object v108, v0, v3

    const/16 v3, 0x36

    aput-object v109, v0, v3

    const/16 v3, 0x37

    aput-object v110, v0, v3

    const/16 v3, 0x38

    aput-object v111, v0, v3

    const/16 v3, 0x39

    aput-object v1, v0, v3

    const/16 v1, 0x3a

    aput-object v2, v0, v1

    .line 17
    new-instance v1, La/c;

    const-string v2, "GPSVersionID"

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v1, v2, v4, v3}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v2, La/c;

    const-string v4, "GPSLatitudeRef"

    const/4 v5, 0x2

    invoke-direct {v2, v4, v3, v5}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v3, La/c;

    const-string v4, "GPSLatitude"

    const/4 v6, 0x5

    invoke-direct {v3, v4, v5, v6}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v4, La/c;

    const-string v7, "GPSLongitudeRef"

    const/4 v8, 0x3

    invoke-direct {v4, v7, v8, v5}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v5, La/c;

    const-string v7, "GPSLongitude"

    const/4 v8, 0x4

    invoke-direct {v5, v7, v8, v6}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v7, La/c;

    const-string v8, "GPSAltitudeRef"

    const/4 v9, 0x1

    invoke-direct {v7, v8, v6, v9}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v8, La/c;

    const-string v9, "GPSAltitude"

    const/4 v10, 0x6

    invoke-direct {v8, v9, v10, v6}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v9, La/c;

    const-string v10, "GPSTimeStamp"

    const/4 v11, 0x7

    invoke-direct {v9, v10, v11, v6}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v6, La/c;

    const-string v10, "GPSSatellites"

    const/16 v11, 0x8

    const/4 v12, 0x2

    invoke-direct {v6, v10, v11, v12}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v10, La/c;

    const-string v11, "GPSStatus"

    const/16 v13, 0x9

    invoke-direct {v10, v11, v13, v12}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v11, La/c;

    const-string v13, "GPSMeasureMode"

    const/16 v14, 0xa

    invoke-direct {v11, v13, v14, v12}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v13, La/c;

    const-string v14, "GPSDOP"

    const/16 v12, 0xb

    const/4 v15, 0x5

    invoke-direct {v13, v14, v12, v15}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v12, La/c;

    const-string v14, "GPSSpeedRef"

    move-object/from16 v64, v0

    const/4 v15, 0x2

    const/16 v0, 0xc

    invoke-direct {v12, v14, v0, v15}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v14, "GPSSpeed"

    move-object/from16 v65, v12

    const/16 v12, 0xd

    const/4 v15, 0x5

    invoke-direct {v0, v14, v12, v15}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v12, La/c;

    const-string v14, "GPSTrackRef"

    move-object/from16 v67, v0

    const/16 v0, 0xe

    const/4 v15, 0x2

    invoke-direct {v12, v14, v0, v15}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v14, "GPSTrack"

    move-object/from16 v68, v12

    const/16 v12, 0xf

    const/4 v15, 0x5

    invoke-direct {v0, v14, v12, v15}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v12, La/c;

    const-string v14, "GPSImgDirectionRef"

    move-object/from16 v69, v0

    const/16 v0, 0x10

    const/4 v15, 0x2

    invoke-direct {v12, v14, v0, v15}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v14, "GPSImgDirection"

    move-object/from16 v70, v12

    const/16 v12, 0x11

    const/4 v15, 0x5

    invoke-direct {v0, v14, v12, v15}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v12, La/c;

    const-string v14, "GPSMapDatum"

    move-object/from16 v71, v0

    const/16 v0, 0x12

    const/4 v15, 0x2

    invoke-direct {v12, v14, v0, v15}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v14, "GPSDestLatitudeRef"

    move-object/from16 v72, v12

    const/16 v12, 0x13

    invoke-direct {v0, v14, v12, v15}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v12, La/c;

    const-string v14, "GPSDestLatitude"

    move-object/from16 v73, v0

    const/16 v0, 0x14

    const/4 v15, 0x5

    invoke-direct {v12, v14, v0, v15}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v14, "GPSDestLongitudeRef"

    const/16 v15, 0x15

    move-object/from16 v74, v12

    const/4 v12, 0x2

    invoke-direct {v0, v14, v15, v12}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v14, La/c;

    const-string v15, "GPSDestLongitude"

    const/16 v12, 0x16

    move-object/from16 v76, v0

    const/4 v0, 0x5

    invoke-direct {v14, v15, v12, v0}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v12, La/c;

    const-string v15, "GPSDestBearingRef"

    move-object/from16 v78, v14

    const/16 v0, 0x17

    const/4 v14, 0x2

    invoke-direct {v12, v15, v0, v14}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v15, "GPSDestBearing"

    const/16 v14, 0x18

    move-object/from16 v79, v12

    const/4 v12, 0x5

    invoke-direct {v0, v15, v14, v12}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v14, La/c;

    const-string v15, "GPSDestDistanceRef"

    const/16 v12, 0x19

    move-object/from16 v80, v0

    const/4 v0, 0x2

    invoke-direct {v14, v15, v12, v0}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v12, "GPSDestDistance"

    const/16 v15, 0x1a

    move-object/from16 v81, v14

    const/4 v14, 0x5

    invoke-direct {v0, v12, v15, v14}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v12, La/c;

    const-string v14, "GPSProcessingMethod"

    const/16 v15, 0x1b

    move-object/from16 v82, v0

    const/4 v0, 0x7

    invoke-direct {v12, v14, v15, v0}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v14, La/c;

    const-string v15, "GPSAreaInformation"

    move-object/from16 v83, v12

    const/16 v12, 0x1c

    invoke-direct {v14, v15, v12, v0}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v12, "GPSDateStamp"

    const/16 v15, 0x1d

    move-object/from16 v84, v14

    const/4 v14, 0x2

    invoke-direct {v0, v12, v15, v14}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v12, La/c;

    const-string v15, "GPSDifferential"

    const/16 v14, 0x1e

    move-object/from16 v85, v0

    const/4 v0, 0x3

    invoke-direct {v12, v15, v14, v0}, La/c;-><init>(Ljava/lang/String;II)V

    const/16 v14, 0x1f

    new-array v14, v14, [La/c;

    const/4 v15, 0x0

    aput-object v1, v14, v15

    const/4 v1, 0x1

    aput-object v2, v14, v1

    const/4 v1, 0x2

    aput-object v3, v14, v1

    aput-object v4, v14, v0

    const/4 v0, 0x4

    aput-object v5, v14, v0

    const/4 v0, 0x5

    aput-object v7, v14, v0

    const/4 v0, 0x6

    aput-object v8, v14, v0

    const/4 v0, 0x7

    aput-object v9, v14, v0

    const/16 v0, 0x8

    aput-object v6, v14, v0

    const/16 v0, 0x9

    aput-object v10, v14, v0

    const/16 v0, 0xa

    aput-object v11, v14, v0

    const/16 v0, 0xb

    aput-object v13, v14, v0

    const/16 v0, 0xc

    aput-object v65, v14, v0

    const/16 v0, 0xd

    aput-object v67, v14, v0

    const/16 v0, 0xe

    aput-object v68, v14, v0

    const/16 v0, 0xf

    aput-object v69, v14, v0

    const/16 v0, 0x10

    aput-object v70, v14, v0

    const/16 v0, 0x11

    aput-object v71, v14, v0

    const/16 v0, 0x12

    aput-object v72, v14, v0

    const/16 v0, 0x13

    aput-object v73, v14, v0

    const/16 v0, 0x14

    aput-object v74, v14, v0

    const/16 v0, 0x15

    aput-object v76, v14, v0

    const/16 v0, 0x16

    aput-object v78, v14, v0

    const/16 v0, 0x17

    aput-object v79, v14, v0

    const/16 v0, 0x18

    aput-object v80, v14, v0

    const/16 v0, 0x19

    aput-object v81, v14, v0

    const/16 v0, 0x1a

    aput-object v82, v14, v0

    const/16 v0, 0x1b

    aput-object v83, v14, v0

    const/16 v0, 0x1c

    aput-object v84, v14, v0

    const/16 v0, 0x1d

    aput-object v85, v14, v0

    const/16 v0, 0x1e

    aput-object v12, v14, v0

    .line 18
    new-instance v0, La/c;

    const-string v1, "InteroperabilityIndex"

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, La/c;-><init>(Ljava/lang/String;II)V

    new-array v1, v2, [La/c;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    .line 19
    new-instance v0, La/c;

    move-object/from16 v2, v50

    const/16 v3, 0xfe

    const/4 v4, 0x4

    invoke-direct {v0, v2, v3, v4}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v2, La/c;

    move-object/from16 v3, v47

    const/16 v5, 0xff

    invoke-direct {v2, v3, v5, v4}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v3, La/c;

    const-string v4, "ThumbnailImageWidth"

    const/16 v5, 0x100

    invoke-direct {v3, v4, v5}, La/c;-><init>(Ljava/lang/String;I)V

    new-instance v4, La/c;

    const-string v5, "ThumbnailImageLength"

    const/16 v6, 0x101

    invoke-direct {v4, v5, v6}, La/c;-><init>(Ljava/lang/String;I)V

    new-instance v5, La/c;

    move-object/from16 v7, v46

    const/4 v6, 0x3

    const/16 v8, 0x102

    invoke-direct {v5, v7, v8, v6}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v7, La/c;

    move-object/from16 v8, v42

    const/16 v9, 0x103

    invoke-direct {v7, v8, v9, v6}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v8, La/c;

    move-object/from16 v9, v39

    const/16 v10, 0x106

    invoke-direct {v8, v9, v10, v6}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v9, La/c;

    move-object/from16 v10, v38

    const/16 v11, 0x10e

    const/4 v12, 0x2

    invoke-direct {v9, v10, v11, v12}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v10, La/c;

    move-object/from16 v11, v41

    const/16 v13, 0x10f

    invoke-direct {v10, v11, v13, v12}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v11, La/c;

    move-object/from16 v13, v44

    const/16 v15, 0x110

    invoke-direct {v11, v13, v15, v12}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v12, La/c;

    move-object/from16 v13, v45

    const/16 v15, 0x111

    invoke-direct {v12, v13, v15}, La/c;-><init>(Ljava/lang/String;I)V

    new-instance v15, La/c;

    move-object/from16 v19, v1

    move-object/from16 v22, v14

    move-object/from16 v1, v49

    const/16 v14, 0x112

    invoke-direct {v15, v1, v14, v6}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v1, La/c;

    move-object/from16 v14, v52

    const/16 v13, 0x115

    invoke-direct {v1, v14, v13, v6}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v6, La/c;

    const-string v13, "RowsPerStrip"

    const/16 v14, 0x116

    invoke-direct {v6, v13, v14}, La/c;-><init>(Ljava/lang/String;I)V

    new-instance v13, La/c;

    const-string v14, "StripByteCounts"

    move-object/from16 v31, v6

    const/16 v6, 0x117

    invoke-direct {v13, v14, v6}, La/c;-><init>(Ljava/lang/String;I)V

    new-instance v6, La/c;

    const-string v14, "XResolution"

    move-object/from16 v34, v13

    const/16 v13, 0x11a

    move-object/from16 v37, v1

    const/4 v1, 0x5

    invoke-direct {v6, v14, v13, v1}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v13, La/c;

    const-string v14, "YResolution"

    move-object/from16 v38, v6

    const/16 v6, 0x11b

    invoke-direct {v13, v14, v6, v1}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v1, La/c;

    const-string v6, "PlanarConfiguration"

    const/16 v14, 0x11c

    move-object/from16 v39, v13

    const/4 v13, 0x3

    invoke-direct {v1, v6, v14, v13}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v6, La/c;

    const-string v14, "ResolutionUnit"

    move-object/from16 v40, v1

    const/16 v1, 0x128

    invoke-direct {v6, v14, v1, v13}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v1, La/c;

    const-string v14, "TransferFunction"

    move-object/from16 v41, v6

    const/16 v6, 0x12d

    invoke-direct {v1, v14, v6, v13}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v6, La/c;

    const-string v13, "Software"

    const/16 v14, 0x131

    move-object/from16 v42, v1

    const/4 v1, 0x2

    invoke-direct {v6, v13, v14, v1}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v13, La/c;

    const-string v14, "DateTime"

    move-object/from16 v43, v6

    const/16 v6, 0x132

    invoke-direct {v13, v14, v6, v1}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v6, La/c;

    const-string v14, "Artist"

    move-object/from16 v44, v13

    const/16 v13, 0x13b

    invoke-direct {v6, v14, v13, v1}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v1, La/c;

    const-string v13, "WhitePoint"

    const/16 v14, 0x13e

    move-object/from16 v46, v6

    const/4 v6, 0x5

    invoke-direct {v1, v13, v14, v6}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v13, La/c;

    const-string v14, "PrimaryChromaticities"

    move-object/from16 v47, v1

    const/16 v1, 0x13f

    invoke-direct {v13, v14, v1, v6}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v1, La/c;

    move-object/from16 v48, v13

    move-object/from16 v6, v66

    const/4 v13, 0x4

    const/16 v14, 0x14a

    invoke-direct {v1, v6, v14, v13}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v14, La/c;

    const-string v6, "JPEGInterchangeFormat"

    move-object/from16 v49, v1

    const/16 v1, 0x201

    invoke-direct {v14, v6, v1, v13}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v1, La/c;

    const-string v6, "JPEGInterchangeFormatLength"

    move-object/from16 v50, v14

    const/16 v14, 0x202

    invoke-direct {v1, v6, v14, v13}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v6, La/c;

    const-string v13, "YCbCrCoefficients"

    const/16 v14, 0x211

    move-object/from16 v51, v1

    const/4 v1, 0x5

    invoke-direct {v6, v13, v14, v1}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v1, La/c;

    const-string v13, "YCbCrSubSampling"

    const/16 v14, 0x212

    move-object/from16 v52, v6

    const/4 v6, 0x3

    invoke-direct {v1, v13, v14, v6}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v13, La/c;

    const-string v14, "YCbCrPositioning"

    move-object/from16 v65, v1

    const/16 v1, 0x213

    invoke-direct {v13, v14, v1, v6}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v1, La/c;

    const-string v6, "ReferenceBlackWhite"

    const/16 v14, 0x214

    move-object/from16 v67, v13

    const/4 v13, 0x5

    invoke-direct {v1, v6, v14, v13}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v6, La/c;

    const-string v13, "Copyright"

    const v14, 0x8298

    move-object/from16 v68, v1

    const/4 v1, 0x2

    invoke-direct {v6, v13, v14, v1}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v1, La/c;

    move-object/from16 v69, v6

    move-object/from16 v13, v75

    const/4 v6, 0x4

    const v14, 0x8769

    invoke-direct {v1, v13, v14, v6}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v14, La/c;

    move-object/from16 v70, v1

    move-object/from16 v13, v77

    const v1, 0x8825

    invoke-direct {v14, v13, v1, v6}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v1, La/c;

    const-string v6, "DNGVersion"

    const v13, 0xc612

    move-object/from16 v71, v14

    const/4 v14, 0x1

    invoke-direct {v1, v6, v13, v14}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v6, La/c;

    const-string v13, "DefaultCropSize"

    const v14, 0xc620

    invoke-direct {v6, v13, v14}, La/c;-><init>(Ljava/lang/String;I)V

    const/16 v13, 0x25

    new-array v13, v13, [La/c;

    const/4 v14, 0x0

    aput-object v0, v13, v14

    const/4 v0, 0x1

    aput-object v2, v13, v0

    const/4 v0, 0x2

    aput-object v3, v13, v0

    const/4 v0, 0x3

    aput-object v4, v13, v0

    const/4 v0, 0x4

    aput-object v5, v13, v0

    const/4 v0, 0x5

    aput-object v7, v13, v0

    const/4 v0, 0x6

    aput-object v8, v13, v0

    const/4 v0, 0x7

    aput-object v9, v13, v0

    const/16 v0, 0x8

    aput-object v10, v13, v0

    const/16 v0, 0x9

    aput-object v11, v13, v0

    const/16 v0, 0xa

    aput-object v12, v13, v0

    const/16 v0, 0xb

    aput-object v15, v13, v0

    const/16 v0, 0xc

    aput-object v37, v13, v0

    const/16 v0, 0xd

    aput-object v31, v13, v0

    const/16 v0, 0xe

    aput-object v34, v13, v0

    const/16 v0, 0xf

    aput-object v38, v13, v0

    const/16 v0, 0x10

    aput-object v39, v13, v0

    const/16 v0, 0x11

    aput-object v40, v13, v0

    const/16 v0, 0x12

    aput-object v41, v13, v0

    const/16 v0, 0x13

    aput-object v42, v13, v0

    const/16 v0, 0x14

    aput-object v43, v13, v0

    const/16 v0, 0x15

    aput-object v44, v13, v0

    const/16 v0, 0x16

    aput-object v46, v13, v0

    const/16 v0, 0x17

    aput-object v47, v13, v0

    const/16 v0, 0x18

    aput-object v48, v13, v0

    const/16 v0, 0x19

    aput-object v49, v13, v0

    const/16 v0, 0x1a

    aput-object v50, v13, v0

    const/16 v0, 0x1b

    aput-object v51, v13, v0

    const/16 v0, 0x1c

    aput-object v52, v13, v0

    const/16 v0, 0x1d

    aput-object v65, v13, v0

    const/16 v0, 0x1e

    aput-object v67, v13, v0

    const/16 v0, 0x1f

    aput-object v68, v13, v0

    const/16 v0, 0x20

    aput-object v69, v13, v0

    const/16 v0, 0x21

    aput-object v70, v13, v0

    const/16 v0, 0x22

    aput-object v71, v13, v0

    const/16 v0, 0x23

    aput-object v1, v13, v0

    const/16 v0, 0x24

    aput-object v6, v13, v0

    .line 20
    new-instance v0, La/c;

    move-object/from16 v2, v45

    const/4 v1, 0x3

    const/16 v3, 0x111

    invoke-direct {v0, v2, v3, v1}, La/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, La/e;->r:La/c;

    .line 21
    new-instance v0, La/c;

    const-string v1, "ThumbnailImage"

    const/4 v2, 0x7

    const/16 v3, 0x100

    invoke-direct {v0, v1, v3, v2}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v1, La/c;

    const-string v2, "CameraSettingsIFDPointer"

    const/16 v3, 0x2020

    const/4 v4, 0x4

    invoke-direct {v1, v2, v3, v4}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v2, La/c;

    const-string v3, "ImageProcessingIFDPointer"

    const/16 v5, 0x2040

    invoke-direct {v2, v3, v5, v4}, La/c;-><init>(Ljava/lang/String;II)V

    const/4 v3, 0x3

    new-array v5, v3, [La/c;

    const/4 v3, 0x0

    aput-object v0, v5, v3

    const/4 v0, 0x1

    aput-object v1, v5, v0

    const/4 v1, 0x2

    aput-object v2, v5, v1

    .line 22
    new-instance v2, La/c;

    const-string v6, "PreviewImageStart"

    const/16 v7, 0x101

    invoke-direct {v2, v6, v7, v4}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v6, La/c;

    const-string v7, "PreviewImageLength"

    const/16 v8, 0x102

    invoke-direct {v6, v7, v8, v4}, La/c;-><init>(Ljava/lang/String;II)V

    new-array v4, v1, [La/c;

    aput-object v2, v4, v3

    aput-object v6, v4, v0

    .line 23
    new-instance v1, La/c;

    const-string v2, "AspectFrame"

    const/16 v6, 0x1113

    const/4 v7, 0x3

    invoke-direct {v1, v2, v6, v7}, La/c;-><init>(Ljava/lang/String;II)V

    new-array v2, v0, [La/c;

    aput-object v1, v2, v3

    .line 24
    new-instance v1, La/c;

    const-string v6, "ColorSpace"

    const/16 v8, 0x37

    invoke-direct {v1, v6, v8, v7}, La/c;-><init>(Ljava/lang/String;II)V

    new-array v6, v0, [La/c;

    aput-object v1, v6, v3

    const/16 v1, 0xa

    .line 25
    new-array v8, v1, [[La/c;

    aput-object v63, v8, v3

    aput-object v64, v8, v0

    const/4 v0, 0x2

    aput-object v22, v8, v0

    aput-object v19, v8, v7

    const/4 v0, 0x4

    aput-object v13, v8, v0

    const/4 v1, 0x5

    aput-object v63, v8, v1

    const/4 v1, 0x6

    aput-object v5, v8, v1

    const/4 v1, 0x7

    aput-object v4, v8, v1

    const/16 v1, 0x8

    aput-object v2, v8, v1

    const/16 v1, 0x9

    aput-object v6, v8, v1

    sput-object v8, La/e;->s:[[La/c;

    .line 26
    new-instance v1, La/c;

    move-object/from16 v2, v66

    const/16 v3, 0x14a

    invoke-direct {v1, v2, v3, v0}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v2, La/c;

    move-object/from16 v3, v75

    const v4, 0x8769

    invoke-direct {v2, v3, v4, v0}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v3, La/c;

    move-object/from16 v4, v77

    const v5, 0x8825

    invoke-direct {v3, v4, v5, v0}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v4, La/c;

    const-string v5, "InteroperabilityIFDPointer"

    const v6, 0xa005

    invoke-direct {v4, v5, v6, v0}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v0, La/c;

    const-string v5, "CameraSettingsIFDPointer"

    const/16 v6, 0x2020

    const/4 v7, 0x1

    invoke-direct {v0, v5, v6, v7}, La/c;-><init>(Ljava/lang/String;II)V

    new-instance v5, La/c;

    const-string v6, "ImageProcessingIFDPointer"

    const/16 v8, 0x2040

    invoke-direct {v5, v6, v8, v7}, La/c;-><init>(Ljava/lang/String;II)V

    const/4 v6, 0x6

    new-array v6, v6, [La/c;

    const/4 v8, 0x0

    aput-object v1, v6, v8

    aput-object v2, v6, v7

    const/4 v1, 0x2

    aput-object v3, v6, v1

    const/4 v1, 0x3

    aput-object v4, v6, v1

    const/4 v1, 0x4

    aput-object v0, v6, v1

    const/4 v0, 0x5

    aput-object v5, v6, v0

    sput-object v6, La/e;->t:[La/c;

    const/16 v0, 0xa

    .line 27
    new-array v1, v0, [Ljava/util/HashMap;

    sput-object v1, La/e;->u:[Ljava/util/HashMap;

    .line 28
    new-array v0, v0, [Ljava/util/HashMap;

    sput-object v0, La/e;->v:[Ljava/util/HashMap;

    .line 29
    new-instance v0, Ljava/util/HashSet;

    const-string v1, "DigitalZoomRatio"

    const-string v2, "ExposureTime"

    const-string v3, "FNumber"

    const-string v4, "SubjectDistance"

    const-string v5, "GPSTimeStamp"

    filled-new-array {v3, v1, v2, v4, v5}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, La/e;->w:Ljava/util/HashSet;

    .line 30
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, La/e;->x:Ljava/util/HashMap;

    .line 31
    const-string v0, "US-ASCII"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, La/e;->y:Ljava/nio/charset/Charset;

    .line 32
    const-string v1, "Exif\u0000\u0000"

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    sput-object v0, La/e;->z:[B

    .line 33
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy:MM:dd HH:mm:ss"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 34
    const-string v1, "UTC"

    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    const/4 v13, 0x0

    .line 35
    :goto_0
    sget-object v0, La/e;->s:[[La/c;

    array-length v1, v0

    if-ge v13, v1, :cond_1

    .line 36
    sget-object v1, La/e;->u:[Ljava/util/HashMap;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    aput-object v2, v1, v13

    .line 37
    sget-object v1, La/e;->v:[Ljava/util/HashMap;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    aput-object v2, v1, v13

    .line 38
    aget-object v0, v0, v13

    array-length v1, v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 39
    sget-object v4, La/e;->u:[Ljava/util/HashMap;

    aget-object v4, v4, v13

    iget v5, v3, La/c;->a:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    sget-object v4, La/e;->v:[Ljava/util/HashMap;

    aget-object v4, v4, v13

    iget-object v5, v3, La/c;->b:Ljava/lang/String;

    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x1

    add-int/2addr v2, v3

    goto :goto_1

    :cond_0
    const/4 v3, 0x1

    add-int/2addr v13, v3

    goto :goto_0

    :cond_1
    const/4 v3, 0x1

    .line 41
    sget-object v0, La/e;->x:Ljava/util/HashMap;

    sget-object v1, La/e;->t:[La/c;

    const/4 v2, 0x0

    aget-object v2, v1, v2

    iget v2, v2, La/c;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v4, v36

    invoke-virtual {v0, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    aget-object v2, v1, v3

    iget v2, v2, La/c;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v3, v35

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x2

    .line 43
    aget-object v2, v1, v2

    iget v2, v2, La/c;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v3, v33

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x3

    .line 44
    aget-object v2, v1, v2

    iget v2, v2, La/c;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v3, v32

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x4

    .line 45
    aget-object v2, v1, v2

    iget v2, v2, La/c;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v3, v30

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x5

    .line 46
    aget-object v1, v1, v2

    iget v1, v1, La/c;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v29

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    const-string v0, ".*[1-9].*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 48
    const-string v0, "^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$"

    .line 49
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    return-void

    nop

    :array_0
    .array-data 1
        -0x1t
        -0x28t
        -0x1t
    .end array-data

    :array_1
    .array-data 1
        0x4ft
        0x4ct
        0x59t
        0x4dt
        0x50t
        0x0t
    .end array-data

    nop

    :array_2
    .array-data 1
        0x4ft
        0x4ct
        0x59t
        0x4dt
        0x50t
        0x55t
        0x53t
        0x0t
        0x49t
        0x49t
    .end array-data

    nop

    :array_3
    .array-data 4
        0x0
        0x1
        0x1
        0x2
        0x4
        0x8
        0x1
        0x1
        0x2
        0x4
        0x8
        0x4
        0x8
        0x1
    .end array-data

    :array_4
    .array-data 1
        0x41t
        0x53t
        0x43t
        0x49t
        0x49t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/e;->s:[[La/c;

    .line 5
    .line 6
    array-length v0, v0

    .line 7
    new-array v0, v0, [Ljava/util/HashMap;

    .line 8
    .line 9
    iput-object v0, p0, La/e;->c:[Ljava/util/HashMap;

    .line 10
    .line 11
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 12
    .line 13
    iput-object v0, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    iput-object p1, p0, La/e;->a:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    .line 21
    .line 22
    invoke-direct {v1, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 23
    .line 24
    .line 25
    :try_start_1
    invoke-virtual {p0, v1}, La/e;->m(Ljava/io/FileInputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    .line 27
    .line 28
    :try_start_2
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 29
    .line 30
    .line 31
    :catch_0
    return-void

    .line 32
    :catch_1
    move-exception p1

    .line 33
    throw p1

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    move-object v0, v1

    .line 36
    goto :goto_0

    .line 37
    :catchall_1
    move-exception p1

    .line 38
    :goto_0
    if-eqz v0, :cond_0

    .line 39
    .line 40
    :try_start_3
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :catch_2
    move-exception p1

    .line 45
    throw p1

    .line 46
    :catch_3
    :cond_0
    :goto_1
    throw p1

    .line 47
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 48
    .line 49
    const-string v0, "filename cannot be null"

    .line 50
    .line 51
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1
.end method

.method public static b(Ljava/io/Serializable;)[J
    .locals 4

    .line 1
    instance-of v0, p0, [I

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p0, [I

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    new-array v0, v0, [J

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    array-length v2, p0

    .line 12
    if-ge v1, v2, :cond_0

    .line 13
    .line 14
    aget v2, p0, v1

    .line 15
    .line 16
    int-to-long v2, v2

    .line 17
    aput-wide v2, v0, v1

    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-object v0

    .line 23
    :cond_1
    instance-of v0, p0, [J

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    check-cast p0, [J

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_2
    const/4 p0, 0x0

    .line 31
    return-object p0
.end method

.method public static o(La/a;)Ljava/nio/ByteOrder;
    .locals 3

    .line 1
    invoke-virtual {p0}, La/a;->readShort()S

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0x4949

    .line 6
    .line 7
    if-eq p0, v0, :cond_1

    .line 8
    .line 9
    const/16 v0, 0x4d4d

    .line 10
    .line 11
    if-ne p0, v0, :cond_0

    .line 12
    .line 13
    sget-object p0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 17
    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v2, "Invalid byte order: "

    .line 21
    .line 22
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0

    .line 40
    :cond_1
    sget-object p0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 41
    .line 42
    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 8

    .line 1
    const-string v0, "DateTimeOriginal"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, La/e;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, La/e;->c:[Ljava/util/HashMap;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-string v3, "DateTime"

    .line 13
    .line 14
    invoke-virtual {p0, v3}, La/e;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    if-nez v4, :cond_0

    .line 19
    .line 20
    aget-object v4, v1, v2

    .line 21
    .line 22
    const-string v5, "\u0000"

    .line 23
    .line 24
    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v5, La/e;->y:Ljava/nio/charset/Charset;

    .line 29
    .line 30
    invoke-virtual {v0, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v5, La/b;

    .line 35
    .line 36
    array-length v6, v0

    .line 37
    const/4 v7, 0x2

    .line 38
    invoke-direct {v5, v0, v7, v6}, La/b;-><init>([BII)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_0
    const-string v0, "ImageWidth"

    .line 45
    .line 46
    invoke-virtual {p0, v0}, La/e;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const-wide/16 v4, 0x0

    .line 51
    .line 52
    if-nez v3, :cond_1

    .line 53
    .line 54
    aget-object v3, v1, v2

    .line 55
    .line 56
    iget-object v6, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 57
    .line 58
    invoke-static {v4, v5, v6}, La/b;->a(JLjava/nio/ByteOrder;)La/b;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-virtual {v3, v0, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    :cond_1
    const-string v0, "ImageLength"

    .line 66
    .line 67
    invoke-virtual {p0, v0}, La/e;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    if-nez v3, :cond_2

    .line 72
    .line 73
    aget-object v3, v1, v2

    .line 74
    .line 75
    iget-object v6, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 76
    .line 77
    invoke-static {v4, v5, v6}, La/b;->a(JLjava/nio/ByteOrder;)La/b;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-virtual {v3, v0, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    :cond_2
    const-string v0, "Orientation"

    .line 85
    .line 86
    invoke-virtual {p0, v0}, La/e;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    if-nez v3, :cond_3

    .line 91
    .line 92
    aget-object v2, v1, v2

    .line 93
    .line 94
    iget-object v3, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 95
    .line 96
    invoke-static {v4, v5, v3}, La/b;->a(JLjava/nio/ByteOrder;)La/b;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    :cond_3
    const-string v0, "LightSource"

    .line 104
    .line 105
    invoke-virtual {p0, v0}, La/e;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    if-nez v2, :cond_4

    .line 110
    .line 111
    const/4 v2, 0x1

    .line 112
    aget-object v1, v1, v2

    .line 113
    .line 114
    iget-object v2, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 115
    .line 116
    invoke-static {v4, v5, v2}, La/b;->a(JLjava/nio/ByteOrder;)La/b;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    :cond_4
    return-void
.end method

.method public final c(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x3

    .line 5
    invoke-virtual {p0, p1}, La/e;->d(Ljava/lang/String;)La/b;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    const/4 v5, 0x0

    .line 10
    if-eqz v4, :cond_5

    .line 11
    .line 12
    sget-object v6, La/e;->w:Ljava/util/HashSet;

    .line 13
    .line 14
    invoke-virtual {v6, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v6

    .line 18
    if-nez v6, :cond_0

    .line 19
    .line 20
    iget-object p1, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 21
    .line 22
    invoke-virtual {v4, p1}, La/b;->f(Ljava/nio/ByteOrder;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_0
    const-string v6, "GPSTimeStamp"

    .line 28
    .line 29
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_4

    .line 34
    .line 35
    const/4 p1, 0x5

    .line 36
    const-string v6, "ExifInterface"

    .line 37
    .line 38
    iget v7, v4, La/b;->a:I

    .line 39
    .line 40
    if-eq v7, p1, :cond_1

    .line 41
    .line 42
    const/16 p1, 0xa

    .line 43
    .line 44
    if-eq v7, p1, :cond_1

    .line 45
    .line 46
    new-instance p1, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v0, "GPS Timestamp format is not rational. format="

    .line 49
    .line 50
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {v6, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    return-object v5

    .line 64
    :cond_1
    iget-object p1, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 65
    .line 66
    invoke-virtual {v4, p1}, La/b;->g(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, [La/d;

    .line 71
    .line 72
    if-eqz p1, :cond_3

    .line 73
    .line 74
    array-length v4, p1

    .line 75
    if-eq v4, v3, :cond_2

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    aget-object v4, p1, v2

    .line 79
    .line 80
    iget-wide v5, v4, La/d;->a:J

    .line 81
    .line 82
    long-to-float v5, v5

    .line 83
    iget-wide v6, v4, La/d;->b:J

    .line 84
    .line 85
    long-to-float v4, v6

    .line 86
    div-float/2addr v5, v4

    .line 87
    float-to-int v4, v5

    .line 88
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    aget-object v5, p1, v1

    .line 93
    .line 94
    iget-wide v6, v5, La/d;->a:J

    .line 95
    .line 96
    long-to-float v6, v6

    .line 97
    iget-wide v7, v5, La/d;->b:J

    .line 98
    .line 99
    long-to-float v5, v7

    .line 100
    div-float/2addr v6, v5

    .line 101
    float-to-int v5, v6

    .line 102
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    aget-object p1, p1, v0

    .line 107
    .line 108
    iget-wide v6, p1, La/d;->a:J

    .line 109
    .line 110
    long-to-float v6, v6

    .line 111
    iget-wide v7, p1, La/d;->b:J

    .line 112
    .line 113
    long-to-float p1, v7

    .line 114
    div-float/2addr v6, p1

    .line 115
    float-to-int p1, v6

    .line 116
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    new-array v3, v3, [Ljava/lang/Object;

    .line 121
    .line 122
    aput-object v4, v3, v2

    .line 123
    .line 124
    aput-object v5, v3, v1

    .line 125
    .line 126
    aput-object p1, v3, v0

    .line 127
    .line 128
    const-string p1, "%02d:%02d:%02d"

    .line 129
    .line 130
    invoke-static {p1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    return-object p1

    .line 135
    :cond_3
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    const-string v1, "Invalid GPS Timestamp array. array="

    .line 138
    .line 139
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-static {v6, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 154
    .line 155
    .line 156
    return-object v5

    .line 157
    :cond_4
    :try_start_0
    iget-object p1, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 158
    .line 159
    invoke-virtual {v4, p1}, La/b;->d(Ljava/nio/ByteOrder;)D

    .line 160
    .line 161
    .line 162
    move-result-wide v0

    .line 163
    invoke-static {v0, v1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 167
    return-object p1

    .line 168
    :catch_0
    :cond_5
    return-object v5
.end method

.method public final d(Ljava/lang/String;)La/b;
    .locals 2

    .line 1
    const-string v0, "ISOSpeedRatings"

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string p1, "PhotographicSensitivity"

    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    sget-object v1, La/e;->s:[[La/c;

    .line 13
    .line 14
    array-length v1, v1

    .line 15
    if-ge v0, v1, :cond_2

    .line 16
    .line 17
    iget-object v1, p0, La/e;->c:[Ljava/util/HashMap;

    .line 18
    .line 19
    aget-object v1, v1, v0

    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, La/b;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    return-object v1

    .line 30
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    const/4 p1, 0x0

    .line 34
    return-object p1
.end method

.method public final e(La/a;II)V
    .locals 11

    .line 1
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 2
    .line 3
    iput-object v0, p1, La/a;->b:Ljava/nio/ByteOrder;

    .line 4
    .line 5
    int-to-long v0, p2

    .line 6
    invoke-virtual {p1, v0, v1}, La/a;->f(J)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, La/a;->readByte()B

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const-string v1, "Invalid marker: "

    .line 14
    .line 15
    const/4 v2, -0x1

    .line 16
    if-ne v0, v2, :cond_11

    .line 17
    .line 18
    invoke-virtual {p1}, La/a;->readByte()B

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/16 v4, -0x28

    .line 23
    .line 24
    if-ne v3, v4, :cond_10

    .line 25
    .line 26
    const/4 v0, 0x2

    .line 27
    add-int/2addr p2, v0

    .line 28
    :goto_0
    invoke-virtual {p1}, La/a;->readByte()B

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-ne v1, v2, :cond_f

    .line 33
    .line 34
    invoke-virtual {p1}, La/a;->readByte()B

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const/16 v3, -0x27

    .line 39
    .line 40
    if-eq v1, v3, :cond_e

    .line 41
    .line 42
    const/16 v3, -0x26

    .line 43
    .line 44
    if-ne v1, v3, :cond_0

    .line 45
    .line 46
    goto/16 :goto_3

    .line 47
    .line 48
    :cond_0
    invoke-virtual {p1}, La/a;->readUnsignedShort()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    add-int/lit8 v4, v3, -0x2

    .line 53
    .line 54
    add-int/lit8 v5, p2, 0x4

    .line 55
    .line 56
    const-string v6, "Invalid length"

    .line 57
    .line 58
    if-ltz v4, :cond_d

    .line 59
    .line 60
    const/16 v7, -0x1f

    .line 61
    .line 62
    const/4 v8, 0x0

    .line 63
    const-string v9, "Invalid exif"

    .line 64
    .line 65
    if-eq v1, v7, :cond_5

    .line 66
    .line 67
    iget-object p2, p0, La/e;->c:[Ljava/util/HashMap;

    .line 68
    .line 69
    const/4 v7, -0x2

    .line 70
    const/4 v10, 0x1

    .line 71
    if-eq v1, v7, :cond_2

    .line 72
    .line 73
    packed-switch v1, :pswitch_data_0

    .line 74
    .line 75
    .line 76
    packed-switch v1, :pswitch_data_1

    .line 77
    .line 78
    .line 79
    packed-switch v1, :pswitch_data_2

    .line 80
    .line 81
    .line 82
    packed-switch v1, :pswitch_data_3

    .line 83
    .line 84
    .line 85
    goto/16 :goto_2

    .line 86
    .line 87
    :pswitch_0
    invoke-virtual {p1, v10}, La/a;->skipBytes(I)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-ne v1, v10, :cond_1

    .line 92
    .line 93
    aget-object v1, p2, p3

    .line 94
    .line 95
    invoke-virtual {p1}, La/a;->readUnsignedShort()I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    int-to-long v7, v4

    .line 100
    iget-object v4, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 101
    .line 102
    invoke-static {v7, v8, v4}, La/b;->a(JLjava/nio/ByteOrder;)La/b;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    const-string v7, "ImageLength"

    .line 107
    .line 108
    invoke-virtual {v1, v7, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    aget-object p2, p2, p3

    .line 112
    .line 113
    invoke-virtual {p1}, La/a;->readUnsignedShort()I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    int-to-long v7, v1

    .line 118
    iget-object v1, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 119
    .line 120
    invoke-static {v7, v8, v1}, La/b;->a(JLjava/nio/ByteOrder;)La/b;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    const-string v4, "ImageWidth"

    .line 125
    .line 126
    invoke-virtual {p2, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    add-int/lit8 v4, v3, -0x7

    .line 130
    .line 131
    goto/16 :goto_2

    .line 132
    .line 133
    :cond_1
    new-instance p1, Ljava/io/IOException;

    .line 134
    .line 135
    const-string p2, "Invalid SOFx"

    .line 136
    .line 137
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    throw p1

    .line 141
    :cond_2
    new-array v1, v4, [B

    .line 142
    .line 143
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-ne v3, v4, :cond_4

    .line 148
    .line 149
    const-string v3, "UserComment"

    .line 150
    .line 151
    invoke-virtual {p0, v3}, La/e;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    if-nez v4, :cond_3

    .line 156
    .line 157
    aget-object p2, p2, v10

    .line 158
    .line 159
    new-instance v4, Ljava/lang/String;

    .line 160
    .line 161
    sget-object v7, La/e;->y:Ljava/nio/charset/Charset;

    .line 162
    .line 163
    invoke-direct {v4, v1, v7}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 164
    .line 165
    .line 166
    const-string v1, "\u0000"

    .line 167
    .line 168
    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-virtual {v1, v7}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    new-instance v4, La/b;

    .line 177
    .line 178
    array-length v7, v1

    .line 179
    invoke-direct {v4, v1, v0, v7}, La/b;-><init>([BII)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    :cond_3
    :goto_1
    const/4 v4, 0x0

    .line 186
    goto :goto_2

    .line 187
    :cond_4
    new-instance p1, Ljava/io/IOException;

    .line 188
    .line 189
    invoke-direct {p1, v9}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    throw p1

    .line 193
    :cond_5
    const/4 v1, 0x6

    .line 194
    if-ge v4, v1, :cond_6

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_6
    new-array v4, v1, [B

    .line 198
    .line 199
    invoke-virtual {p1, v4}, Ljava/io/InputStream;->read([B)I

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    if-ne v5, v1, :cond_c

    .line 204
    .line 205
    add-int/lit8 v5, p2, 0xa

    .line 206
    .line 207
    add-int/lit8 p2, v3, -0x8

    .line 208
    .line 209
    sget-object v1, La/e;->z:[B

    .line 210
    .line 211
    invoke-static {v4, v1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    if-nez v1, :cond_7

    .line 216
    .line 217
    move v4, p2

    .line 218
    goto :goto_2

    .line 219
    :cond_7
    if-lez p2, :cond_b

    .line 220
    .line 221
    iput v5, p0, La/e;->e:I

    .line 222
    .line 223
    new-array v1, p2, [B

    .line 224
    .line 225
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    if-ne v3, p2, :cond_a

    .line 230
    .line 231
    add-int/2addr v5, p2

    .line 232
    new-instance v3, La/a;

    .line 233
    .line 234
    invoke-direct {v3, v1}, La/a;-><init>([B)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p0, v3, p2}, La/e;->n(La/a;I)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {p0, v3, p3}, La/e;->p(La/a;I)V

    .line 241
    .line 242
    .line 243
    goto :goto_1

    .line 244
    :goto_2
    if-ltz v4, :cond_9

    .line 245
    .line 246
    invoke-virtual {p1, v4}, La/a;->skipBytes(I)I

    .line 247
    .line 248
    .line 249
    move-result p2

    .line 250
    if-ne p2, v4, :cond_8

    .line 251
    .line 252
    add-int p2, v5, v4

    .line 253
    .line 254
    goto/16 :goto_0

    .line 255
    .line 256
    :cond_8
    new-instance p1, Ljava/io/IOException;

    .line 257
    .line 258
    const-string p2, "Invalid JPEG segment"

    .line 259
    .line 260
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    throw p1

    .line 264
    :cond_9
    new-instance p1, Ljava/io/IOException;

    .line 265
    .line 266
    invoke-direct {p1, v6}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    throw p1

    .line 270
    :cond_a
    new-instance p1, Ljava/io/IOException;

    .line 271
    .line 272
    invoke-direct {p1, v9}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    throw p1

    .line 276
    :cond_b
    new-instance p1, Ljava/io/IOException;

    .line 277
    .line 278
    invoke-direct {p1, v9}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    throw p1

    .line 282
    :cond_c
    new-instance p1, Ljava/io/IOException;

    .line 283
    .line 284
    invoke-direct {p1, v9}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    throw p1

    .line 288
    :cond_d
    new-instance p1, Ljava/io/IOException;

    .line 289
    .line 290
    invoke-direct {p1, v6}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    throw p1

    .line 294
    :cond_e
    :goto_3
    iget-object p2, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 295
    .line 296
    iput-object p2, p1, La/a;->b:Ljava/nio/ByteOrder;

    .line 297
    .line 298
    return-void

    .line 299
    :cond_f
    new-instance p1, Ljava/io/IOException;

    .line 300
    .line 301
    new-instance p2, Ljava/lang/StringBuilder;

    .line 302
    .line 303
    const-string p3, "Invalid marker:"

    .line 304
    .line 305
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    and-int/lit16 p3, v1, 0xff

    .line 309
    .line 310
    invoke-static {p3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object p3

    .line 314
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object p2

    .line 321
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    throw p1

    .line 325
    :cond_10
    new-instance p1, Ljava/io/IOException;

    .line 326
    .line 327
    new-instance p2, Ljava/lang/StringBuilder;

    .line 328
    .line 329
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    and-int/lit16 p3, v0, 0xff

    .line 333
    .line 334
    invoke-static {p3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object p3

    .line 338
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object p2

    .line 345
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    throw p1

    .line 349
    :cond_11
    new-instance p1, Ljava/io/IOException;

    .line 350
    .line 351
    new-instance p2, Ljava/lang/StringBuilder;

    .line 352
    .line 353
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    and-int/lit16 p3, v0, 0xff

    .line 357
    .line 358
    invoke-static {p3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object p3

    .line 362
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object p2

    .line 369
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    throw p1

    .line 373
    :pswitch_data_0
    .packed-switch -0x40
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    :pswitch_data_1
    .packed-switch -0x3b
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    :pswitch_data_2
    .packed-switch -0x37
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    :pswitch_data_3
    .packed-switch -0x33
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Ljava/io/BufferedInputStream;)I
    .locals 5

    .line 1
    const/16 v0, 0x1388

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/io/BufferedInputStream;->mark(I)V

    .line 4
    .line 5
    .line 6
    new-array v0, v0, [B

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->read([B)I

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/io/BufferedInputStream;->reset()V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    sget-object v2, La/e;->l:[B

    .line 17
    .line 18
    array-length v3, v2

    .line 19
    if-ge v1, v3, :cond_6

    .line 20
    .line 21
    aget-byte v3, v0, v1

    .line 22
    .line 23
    aget-byte v2, v2, v1

    .line 24
    .line 25
    if-eq v3, v2, :cond_5

    .line 26
    .line 27
    const-string v1, "FUJIFILMCCD-RAW"

    .line 28
    .line 29
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const/4 v2, 0x0

    .line 38
    :goto_1
    array-length v3, v1

    .line 39
    if-ge v2, v3, :cond_4

    .line 40
    .line 41
    aget-byte v3, v0, v2

    .line 42
    .line 43
    aget-byte v4, v1, v2

    .line 44
    .line 45
    if-eq v3, v4, :cond_3

    .line 46
    .line 47
    new-instance v1, La/a;

    .line 48
    .line 49
    invoke-direct {v1, v0}, La/a;-><init>([B)V

    .line 50
    .line 51
    .line 52
    invoke-static {v1}, La/e;->o(La/a;)Ljava/nio/ByteOrder;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iput-object v2, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 57
    .line 58
    iput-object v2, v1, La/a;->b:Ljava/nio/ByteOrder;

    .line 59
    .line 60
    invoke-virtual {v1}, La/a;->readShort()S

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 65
    .line 66
    .line 67
    const/16 v1, 0x4f52

    .line 68
    .line 69
    if-eq v2, v1, :cond_2

    .line 70
    .line 71
    const/16 v1, 0x5352

    .line 72
    .line 73
    if-ne v2, v1, :cond_0

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_0
    new-instance v1, La/a;

    .line 77
    .line 78
    invoke-direct {v1, v0}, La/a;-><init>([B)V

    .line 79
    .line 80
    .line 81
    invoke-static {v1}, La/e;->o(La/a;)Ljava/nio/ByteOrder;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 86
    .line 87
    iput-object v0, v1, La/a;->b:Ljava/nio/ByteOrder;

    .line 88
    .line 89
    invoke-virtual {v1}, La/a;->readShort()S

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 94
    .line 95
    .line 96
    const/16 v1, 0x55

    .line 97
    .line 98
    if-ne v0, v1, :cond_1

    .line 99
    .line 100
    const/16 p1, 0xa

    .line 101
    .line 102
    :cond_1
    return p1

    .line 103
    :cond_2
    :goto_2
    const/4 p1, 0x7

    .line 104
    return p1

    .line 105
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_4
    const/16 p1, 0x9

    .line 109
    .line 110
    return p1

    .line 111
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_6
    const/4 p1, 0x4

    .line 115
    return p1
.end method

.method public final g(La/a;)V
    .locals 6

    .line 1
    invoke-virtual {p0, p1}, La/e;->i(La/a;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/e;->c:[Ljava/util/HashMap;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    aget-object v1, p1, v0

    .line 8
    .line 9
    const-string v2, "MakerNote"

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, La/b;

    .line 16
    .line 17
    if-eqz v1, :cond_6

    .line 18
    .line 19
    new-instance v2, La/a;

    .line 20
    .line 21
    iget-object v1, v1, La/b;->c:[B

    .line 22
    .line 23
    invoke-direct {v2, v1}, La/a;-><init>([B)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 27
    .line 28
    iput-object v1, v2, La/a;->b:Ljava/nio/ByteOrder;

    .line 29
    .line 30
    sget-object v1, La/e;->m:[B

    .line 31
    .line 32
    array-length v3, v1

    .line 33
    new-array v3, v3, [B

    .line 34
    .line 35
    invoke-virtual {v2, v3}, La/a;->readFully([B)V

    .line 36
    .line 37
    .line 38
    const-wide/16 v4, 0x0

    .line 39
    .line 40
    invoke-virtual {v2, v4, v5}, La/a;->f(J)V

    .line 41
    .line 42
    .line 43
    sget-object v4, La/e;->n:[B

    .line 44
    .line 45
    array-length v5, v4

    .line 46
    new-array v5, v5, [B

    .line 47
    .line 48
    invoke-virtual {v2, v5}, La/a;->readFully([B)V

    .line 49
    .line 50
    .line 51
    invoke-static {v3, v1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_0

    .line 56
    .line 57
    const-wide/16 v3, 0x8

    .line 58
    .line 59
    invoke-virtual {v2, v3, v4}, La/a;->f(J)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    invoke-static {v5, v4}, Ljava/util/Arrays;->equals([B[B)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_1

    .line 68
    .line 69
    const-wide/16 v3, 0xc

    .line 70
    .line 71
    invoke-virtual {v2, v3, v4}, La/a;->f(J)V

    .line 72
    .line 73
    .line 74
    :cond_1
    :goto_0
    const/4 v1, 0x6

    .line 75
    invoke-virtual {p0, v2, v1}, La/e;->p(La/a;I)V

    .line 76
    .line 77
    .line 78
    const/4 v1, 0x7

    .line 79
    aget-object v2, p1, v1

    .line 80
    .line 81
    const-string v3, "PreviewImageStart"

    .line 82
    .line 83
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, La/b;

    .line 88
    .line 89
    aget-object v1, p1, v1

    .line 90
    .line 91
    const-string v3, "PreviewImageLength"

    .line 92
    .line 93
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, La/b;

    .line 98
    .line 99
    if-eqz v2, :cond_2

    .line 100
    .line 101
    if-eqz v1, :cond_2

    .line 102
    .line 103
    const/4 v3, 0x5

    .line 104
    aget-object v4, p1, v3

    .line 105
    .line 106
    const-string v5, "JPEGInterchangeFormat"

    .line 107
    .line 108
    invoke-virtual {v4, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    aget-object v2, p1, v3

    .line 112
    .line 113
    const-string v3, "JPEGInterchangeFormatLength"

    .line 114
    .line 115
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    :cond_2
    const/16 v1, 0x8

    .line 119
    .line 120
    aget-object v1, p1, v1

    .line 121
    .line 122
    const-string v2, "AspectFrame"

    .line 123
    .line 124
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    check-cast v1, La/b;

    .line 129
    .line 130
    if-eqz v1, :cond_6

    .line 131
    .line 132
    iget-object v2, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 133
    .line 134
    invoke-virtual {v1, v2}, La/b;->g(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    check-cast v1, [I

    .line 139
    .line 140
    if-eqz v1, :cond_5

    .line 141
    .line 142
    array-length v2, v1

    .line 143
    const/4 v3, 0x4

    .line 144
    if-eq v2, v3, :cond_3

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_3
    const/4 v2, 0x2

    .line 148
    aget v2, v1, v2

    .line 149
    .line 150
    const/4 v3, 0x0

    .line 151
    aget v4, v1, v3

    .line 152
    .line 153
    if-le v2, v4, :cond_6

    .line 154
    .line 155
    const/4 v5, 0x3

    .line 156
    aget v5, v1, v5

    .line 157
    .line 158
    aget v1, v1, v0

    .line 159
    .line 160
    if-le v5, v1, :cond_6

    .line 161
    .line 162
    sub-int/2addr v2, v4

    .line 163
    add-int/2addr v2, v0

    .line 164
    sub-int/2addr v5, v1

    .line 165
    add-int/2addr v5, v0

    .line 166
    if-ge v2, v5, :cond_4

    .line 167
    .line 168
    add-int/2addr v2, v5

    .line 169
    sub-int v5, v2, v5

    .line 170
    .line 171
    sub-int/2addr v2, v5

    .line 172
    :cond_4
    iget-object v0, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 173
    .line 174
    invoke-static {v2, v0}, La/b;->c(ILjava/nio/ByteOrder;)La/b;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    iget-object v1, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 179
    .line 180
    invoke-static {v5, v1}, La/b;->c(ILjava/nio/ByteOrder;)La/b;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    aget-object v2, p1, v3

    .line 185
    .line 186
    const-string v4, "ImageWidth"

    .line 187
    .line 188
    invoke-virtual {v2, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    aget-object p1, p1, v3

    .line 192
    .line 193
    const-string v0, "ImageLength"

    .line 194
    .line 195
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_5
    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    const-string v0, "Invalid aspect frame values. frame="

    .line 202
    .line 203
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    invoke-static {v1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    const-string v0, "ExifInterface"

    .line 218
    .line 219
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 220
    .line 221
    .line 222
    :cond_6
    :goto_2
    return-void
.end method

.method public final h(La/a;)V
    .locals 6

    .line 1
    const/16 v0, 0x54

    .line 2
    .line 3
    invoke-virtual {p1, v0}, La/a;->skipBytes(I)I

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x4

    .line 7
    new-array v1, v0, [B

    .line 8
    .line 9
    new-array v2, v0, [B

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, La/a;->skipBytes(I)I

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v2}, Ljava/io/InputStream;->read([B)I

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-static {v2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    const/4 v2, 0x5

    .line 37
    invoke-virtual {p0, p1, v0, v2}, La/e;->e(La/a;II)V

    .line 38
    .line 39
    .line 40
    int-to-long v0, v1

    .line 41
    invoke-virtual {p1, v0, v1}, La/a;->f(J)V

    .line 42
    .line 43
    .line 44
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 45
    .line 46
    iput-object v0, p1, La/a;->b:Ljava/nio/ByteOrder;

    .line 47
    .line 48
    invoke-virtual {p1}, La/a;->readInt()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const/4 v1, 0x0

    .line 53
    const/4 v2, 0x0

    .line 54
    :goto_0
    if-ge v2, v0, :cond_1

    .line 55
    .line 56
    invoke-virtual {p1}, La/a;->readUnsignedShort()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    invoke-virtual {p1}, La/a;->readUnsignedShort()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    sget-object v5, La/e;->r:La/c;

    .line 65
    .line 66
    iget v5, v5, La/c;->a:I

    .line 67
    .line 68
    if-ne v3, v5, :cond_0

    .line 69
    .line 70
    invoke-virtual {p1}, La/a;->readShort()S

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-virtual {p1}, La/a;->readShort()S

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    iget-object v2, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 79
    .line 80
    invoke-static {v0, v2}, La/b;->c(ILjava/nio/ByteOrder;)La/b;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iget-object v2, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 85
    .line 86
    invoke-static {p1, v2}, La/b;->c(ILjava/nio/ByteOrder;)La/b;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iget-object v2, p0, La/e;->c:[Ljava/util/HashMap;

    .line 91
    .line 92
    aget-object v3, v2, v1

    .line 93
    .line 94
    const-string v4, "ImageLength"

    .line 95
    .line 96
    invoke-virtual {v3, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    aget-object v0, v2, v1

    .line 100
    .line 101
    const-string v1, "ImageWidth"

    .line 102
    .line 103
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_0
    invoke-virtual {p1, v4}, La/a;->skipBytes(I)I

    .line 108
    .line 109
    .line 110
    add-int/lit8 v2, v2, 0x1

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_1
    return-void
.end method

.method public final i(La/a;)V
    .locals 8

    .line 1
    iget-object v0, p1, La/a;->a:Ljava/io/DataInputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0, p1, v0}, La/e;->n(La/a;I)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, p1, v0}, La/e;->p(La/a;I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1, v0}, La/e;->s(La/a;I)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x5

    .line 18
    invoke-virtual {p0, p1, v1}, La/e;->s(La/a;I)V

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x4

    .line 22
    invoke-virtual {p0, p1, v2}, La/e;->s(La/a;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0, v1}, La/e;->r(II)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0, v2}, La/e;->r(II)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v1, v2}, La/e;->r(II)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, La/e;->c:[Ljava/util/HashMap;

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    aget-object v4, p1, v3

    .line 38
    .line 39
    const-string v5, "PixelXDimension"

    .line 40
    .line 41
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, La/b;

    .line 46
    .line 47
    aget-object v5, p1, v3

    .line 48
    .line 49
    const-string v6, "PixelYDimension"

    .line 50
    .line 51
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    check-cast v5, La/b;

    .line 56
    .line 57
    if-eqz v4, :cond_0

    .line 58
    .line 59
    if-eqz v5, :cond_0

    .line 60
    .line 61
    aget-object v6, p1, v0

    .line 62
    .line 63
    const-string v7, "ImageWidth"

    .line 64
    .line 65
    invoke-virtual {v6, v7, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    aget-object v0, p1, v0

    .line 69
    .line 70
    const-string v4, "ImageLength"

    .line 71
    .line 72
    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    :cond_0
    aget-object v0, p1, v2

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_1

    .line 82
    .line 83
    aget-object v0, p1, v1

    .line 84
    .line 85
    invoke-virtual {p0, v0}, La/e;->l(Ljava/util/HashMap;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_1

    .line 90
    .line 91
    aget-object v0, p1, v1

    .line 92
    .line 93
    aput-object v0, p1, v2

    .line 94
    .line 95
    new-instance v0, Ljava/util/HashMap;

    .line 96
    .line 97
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 98
    .line 99
    .line 100
    aput-object v0, p1, v1

    .line 101
    .line 102
    :cond_1
    aget-object v0, p1, v2

    .line 103
    .line 104
    invoke-virtual {p0, v0}, La/e;->l(Ljava/util/HashMap;)Z

    .line 105
    .line 106
    .line 107
    iget v0, p0, La/e;->b:I

    .line 108
    .line 109
    const/16 v1, 0x8

    .line 110
    .line 111
    if-ne v0, v1, :cond_2

    .line 112
    .line 113
    aget-object v0, p1, v3

    .line 114
    .line 115
    const-string v1, "MakerNote"

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    check-cast v0, La/b;

    .line 122
    .line 123
    if-eqz v0, :cond_2

    .line 124
    .line 125
    new-instance v1, La/a;

    .line 126
    .line 127
    iget-object v0, v0, La/b;->c:[B

    .line 128
    .line 129
    invoke-direct {v1, v0}, La/a;-><init>([B)V

    .line 130
    .line 131
    .line 132
    iget-object v0, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 133
    .line 134
    iput-object v0, v1, La/a;->b:Ljava/nio/ByteOrder;

    .line 135
    .line 136
    const-wide/16 v4, 0x6

    .line 137
    .line 138
    invoke-virtual {v1, v4, v5}, La/a;->f(J)V

    .line 139
    .line 140
    .line 141
    const/16 v0, 0x9

    .line 142
    .line 143
    invoke-virtual {p0, v1, v0}, La/e;->p(La/a;I)V

    .line 144
    .line 145
    .line 146
    aget-object v0, p1, v0

    .line 147
    .line 148
    const-string v1, "ColorSpace"

    .line 149
    .line 150
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    check-cast v0, La/b;

    .line 155
    .line 156
    if-eqz v0, :cond_2

    .line 157
    .line 158
    aget-object p1, p1, v3

    .line 159
    .line 160
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    :cond_2
    return-void
.end method

.method public final j(La/a;)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, La/e;->i(La/a;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/e;->c:[Ljava/util/HashMap;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aget-object v2, v0, v1

    .line 8
    .line 9
    const-string v3, "JpgFromRaw"

    .line 10
    .line 11
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, La/b;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    iget v2, p0, La/e;->i:I

    .line 20
    .line 21
    const/4 v3, 0x5

    .line 22
    invoke-virtual {p0, p1, v2, v3}, La/e;->e(La/a;II)V

    .line 23
    .line 24
    .line 25
    :cond_0
    aget-object p1, v0, v1

    .line 26
    .line 27
    const-string v1, "ISO"

    .line 28
    .line 29
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, La/b;

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    aget-object v2, v0, v1

    .line 37
    .line 38
    const-string v3, "PhotographicSensitivity"

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, La/b;

    .line 45
    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    if-nez v2, :cond_1

    .line 49
    .line 50
    aget-object v0, v0, v1

    .line 51
    .line 52
    invoke-virtual {v0, v3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    :cond_1
    return-void
.end method

.method public final k(La/a;Ljava/util/HashMap;)V
    .locals 3

    .line 1
    const-string v0, "JPEGInterchangeFormat"

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/b;

    .line 8
    .line 9
    const-string v1, "JPEGInterchangeFormatLength"

    .line 10
    .line 11
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, La/b;

    .line 16
    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    if-eqz p2, :cond_3

    .line 20
    .line 21
    iget-object v1, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, La/b;->e(Ljava/nio/ByteOrder;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-object v1, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 28
    .line 29
    invoke-virtual {p2, v1}, La/b;->e(Ljava/nio/ByteOrder;)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    iget-object v1, p1, La/a;->a:Ljava/io/DataInputStream;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    sub-int/2addr v1, v0

    .line 40
    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    iget v1, p0, La/e;->b:I

    .line 45
    .line 46
    const/4 v2, 0x4

    .line 47
    if-eq v1, v2, :cond_1

    .line 48
    .line 49
    const/16 v2, 0x9

    .line 50
    .line 51
    if-eq v1, v2, :cond_1

    .line 52
    .line 53
    const/16 v2, 0xa

    .line 54
    .line 55
    if-ne v1, v2, :cond_0

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_0
    const/4 v2, 0x7

    .line 59
    if-ne v1, v2, :cond_2

    .line 60
    .line 61
    iget v1, p0, La/e;->f:I

    .line 62
    .line 63
    :goto_0
    add-int/2addr v0, v1

    .line 64
    goto :goto_2

    .line 65
    :cond_1
    :goto_1
    iget v1, p0, La/e;->e:I

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    :goto_2
    if-lez v0, :cond_3

    .line 69
    .line 70
    if-lez p2, :cond_3

    .line 71
    .line 72
    iget-object v1, p0, La/e;->a:Ljava/lang/String;

    .line 73
    .line 74
    if-nez v1, :cond_3

    .line 75
    .line 76
    new-array p2, p2, [B

    .line 77
    .line 78
    int-to-long v0, v0

    .line 79
    invoke-virtual {p1, v0, v1}, La/a;->f(J)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, p2}, La/a;->readFully([B)V

    .line 83
    .line 84
    .line 85
    :cond_3
    return-void
.end method

.method public final l(Ljava/util/HashMap;)Z
    .locals 2

    .line 1
    const-string v0, "ImageLength"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/b;

    .line 8
    .line 9
    const-string v1, "ImageWidth"

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, La/b;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, La/b;->e(Ljava/nio/ByteOrder;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-object v1, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 28
    .line 29
    invoke-virtual {p1, v1}, La/b;->e(Ljava/nio/ByteOrder;)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    const/16 v1, 0x200

    .line 34
    .line 35
    if-gt v0, v1, :cond_0

    .line 36
    .line 37
    if-gt p1, v1, :cond_0

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    return p1

    .line 41
    :cond_0
    const/4 p1, 0x0

    .line 42
    return p1
.end method

.method public final m(Ljava/io/FileInputStream;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    :try_start_0
    sget-object v2, La/e;->s:[[La/c;

    .line 4
    .line 5
    array-length v2, v2

    .line 6
    if-ge v1, v2, :cond_0

    .line 7
    .line 8
    iget-object v2, p0, La/e;->c:[Ljava/util/HashMap;

    .line 9
    .line 10
    new-instance v3, Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    aput-object v3, v2, v1

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    goto :goto_2

    .line 22
    :cond_0
    new-instance v1, Ljava/io/BufferedInputStream;

    .line 23
    .line 24
    const/16 v2, 0x1388

    .line 25
    .line 26
    invoke-direct {v1, p1, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v1}, La/e;->f(Ljava/io/BufferedInputStream;)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iput p1, p0, La/e;->b:I

    .line 34
    .line 35
    new-instance p1, La/a;

    .line 36
    .line 37
    invoke-direct {p1, v1}, La/a;-><init>(Ljava/io/InputStream;)V

    .line 38
    .line 39
    .line 40
    iget v1, p0, La/e;->b:I

    .line 41
    .line 42
    packed-switch v1, :pswitch_data_0

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :pswitch_0
    invoke-virtual {p0, p1}, La/e;->j(La/a;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :pswitch_1
    invoke-virtual {p0, p1}, La/e;->h(La/a;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :pswitch_2
    invoke-virtual {p0, p1}, La/e;->g(La/a;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :pswitch_3
    invoke-virtual {p0, p1, v0, v0}, La/e;->e(La/a;II)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :pswitch_4
    invoke-virtual {p0, p1}, La/e;->i(La/a;)V

    .line 63
    .line 64
    .line 65
    :goto_1
    invoke-virtual {p0, p1}, La/e;->q(La/a;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    .line 68
    :catch_0
    invoke-virtual {p0}, La/e;->a()V

    .line 69
    .line 70
    .line 71
    goto :goto_3

    .line 72
    :goto_2
    invoke-virtual {p0}, La/e;->a()V

    .line 73
    .line 74
    .line 75
    throw p1

    .line 76
    :goto_3
    return-void

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_2
        :pswitch_4
        :pswitch_1
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method

.method public final n(La/a;I)V
    .locals 3

    .line 1
    invoke-static {p1}, La/e;->o(La/a;)Ljava/nio/ByteOrder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 6
    .line 7
    iput-object v0, p1, La/a;->b:Ljava/nio/ByteOrder;

    .line 8
    .line 9
    invoke-virtual {p1}, La/a;->readUnsignedShort()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v1, p0, La/e;->b:I

    .line 14
    .line 15
    const/4 v2, 0x7

    .line 16
    if-eq v1, v2, :cond_1

    .line 17
    .line 18
    const/16 v2, 0xa

    .line 19
    .line 20
    if-eq v1, v2, :cond_1

    .line 21
    .line 22
    const/16 v1, 0x2a

    .line 23
    .line 24
    if-ne v0, v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance p1, Ljava/io/IOException;

    .line 28
    .line 29
    new-instance p2, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v1, "Invalid start code: "

    .line 32
    .line 33
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_1
    :goto_0
    invoke-virtual {p1}, La/a;->readInt()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    const/16 v1, 0x8

    .line 56
    .line 57
    if-lt v0, v1, :cond_4

    .line 58
    .line 59
    if-ge v0, p2, :cond_4

    .line 60
    .line 61
    add-int/lit8 v0, v0, -0x8

    .line 62
    .line 63
    if-lez v0, :cond_3

    .line 64
    .line 65
    invoke-virtual {p1, v0}, La/a;->skipBytes(I)I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-ne p1, v0, :cond_2

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    new-instance p1, Ljava/io/IOException;

    .line 73
    .line 74
    const-string p2, "Couldn\'t jump to first Ifd: "

    .line 75
    .line 76
    invoke-static {p2, v0}, LQ0/E;->e(Ljava/lang/String;I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p1

    .line 84
    :cond_3
    :goto_1
    return-void

    .line 85
    :cond_4
    new-instance p1, Ljava/io/IOException;

    .line 86
    .line 87
    const-string p2, "Invalid first Ifd offset: "

    .line 88
    .line 89
    invoke-static {p2, v0}, LQ0/E;->e(Ljava/lang/String;I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p1
.end method

.method public final p(La/a;I)V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    iget v3, v1, La/a;->d:I

    .line 8
    .line 9
    add-int/lit8 v3, v3, 0x2

    .line 10
    .line 11
    iget v4, v1, La/a;->c:I

    .line 12
    .line 13
    if-le v3, v4, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual/range {p1 .. p1}, La/a;->readShort()S

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    iget v5, v1, La/a;->d:I

    .line 21
    .line 22
    mul-int/lit8 v6, v3, 0xc

    .line 23
    .line 24
    add-int/2addr v6, v5

    .line 25
    if-le v6, v4, :cond_1

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    const/4 v6, 0x0

    .line 29
    :goto_0
    iget-object v7, v0, La/e;->c:[Ljava/util/HashMap;

    .line 30
    .line 31
    if-ge v6, v3, :cond_24

    .line 32
    .line 33
    invoke-virtual/range {p1 .. p1}, La/a;->readUnsignedShort()I

    .line 34
    .line 35
    .line 36
    move-result v10

    .line 37
    invoke-virtual/range {p1 .. p1}, La/a;->readUnsignedShort()I

    .line 38
    .line 39
    .line 40
    move-result v11

    .line 41
    invoke-virtual/range {p1 .. p1}, La/a;->readInt()I

    .line 42
    .line 43
    .line 44
    move-result v12

    .line 45
    iget v13, v1, La/a;->d:I

    .line 46
    .line 47
    int-to-long v13, v13

    .line 48
    const-wide/16 v15, 0x4

    .line 49
    .line 50
    add-long/2addr v13, v15

    .line 51
    sget-object v17, La/e;->u:[Ljava/util/HashMap;

    .line 52
    .line 53
    aget-object v5, v17, v2

    .line 54
    .line 55
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v15

    .line 59
    invoke-virtual {v5, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    check-cast v5, La/c;

    .line 64
    .line 65
    const-wide/16 v20, 0x0

    .line 66
    .line 67
    const-string v8, "ExifInterface"

    .line 68
    .line 69
    if-nez v5, :cond_2

    .line 70
    .line 71
    new-instance v9, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const-string v15, "Skip the tag entry since tag number is not defined: "

    .line 74
    .line 75
    invoke-direct {v9, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    invoke-static {v8, v9}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    move/from16 v23, v3

    .line 89
    .line 90
    move/from16 v24, v6

    .line 91
    .line 92
    move v15, v10

    .line 93
    move v6, v4

    .line 94
    goto/16 :goto_9

    .line 95
    .line 96
    :cond_2
    if-lez v11, :cond_3

    .line 97
    .line 98
    sget-object v9, La/e;->p:[I

    .line 99
    .line 100
    array-length v15, v9

    .line 101
    if-lt v11, v15, :cond_4

    .line 102
    .line 103
    :cond_3
    move/from16 v23, v3

    .line 104
    .line 105
    move/from16 v24, v6

    .line 106
    .line 107
    move v15, v10

    .line 108
    move v6, v4

    .line 109
    goto/16 :goto_8

    .line 110
    .line 111
    :cond_4
    iget v15, v5, La/c;->c:I

    .line 112
    .line 113
    move/from16 v23, v3

    .line 114
    .line 115
    const/4 v3, 0x7

    .line 116
    if-eq v15, v3, :cond_6

    .line 117
    .line 118
    if-ne v11, v3, :cond_5

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_5
    if-eq v15, v11, :cond_6

    .line 122
    .line 123
    iget v3, v5, La/c;->d:I

    .line 124
    .line 125
    if-ne v3, v11, :cond_7

    .line 126
    .line 127
    :cond_6
    :goto_1
    move/from16 v24, v6

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_7
    move/from16 v24, v6

    .line 131
    .line 132
    const/4 v6, 0x4

    .line 133
    if-eq v15, v6, :cond_8

    .line 134
    .line 135
    if-ne v3, v6, :cond_9

    .line 136
    .line 137
    :cond_8
    const/4 v6, 0x3

    .line 138
    goto :goto_2

    .line 139
    :cond_9
    const/16 v6, 0x9

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :goto_2
    if-ne v11, v6, :cond_9

    .line 143
    .line 144
    :goto_3
    const/4 v3, 0x7

    .line 145
    goto :goto_5

    .line 146
    :goto_4
    if-eq v15, v6, :cond_a

    .line 147
    .line 148
    if-ne v3, v6, :cond_b

    .line 149
    .line 150
    :cond_a
    const/16 v6, 0x8

    .line 151
    .line 152
    if-ne v11, v6, :cond_b

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_b
    const/16 v6, 0xc

    .line 156
    .line 157
    if-eq v15, v6, :cond_c

    .line 158
    .line 159
    if-ne v3, v6, :cond_d

    .line 160
    .line 161
    :cond_c
    const/16 v3, 0xb

    .line 162
    .line 163
    if-ne v11, v3, :cond_d

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_d
    new-instance v3, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    const-string v6, "Skip the tag entry since data format ("

    .line 169
    .line 170
    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    sget-object v6, La/e;->o:[Ljava/lang/String;

    .line 174
    .line 175
    aget-object v6, v6, v11

    .line 176
    .line 177
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    const-string v6, ") is unexpected for tag: "

    .line 181
    .line 182
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    iget-object v6, v5, La/c;->b:Ljava/lang/String;

    .line 186
    .line 187
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    invoke-static {v8, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 195
    .line 196
    .line 197
    move v6, v4

    .line 198
    move v15, v10

    .line 199
    goto :goto_9

    .line 200
    :goto_5
    move v6, v4

    .line 201
    if-ne v11, v3, :cond_e

    .line 202
    .line 203
    move v11, v15

    .line 204
    :cond_e
    int-to-long v3, v12

    .line 205
    aget v9, v9, v11

    .line 206
    .line 207
    move v15, v10

    .line 208
    int-to-long v9, v9

    .line 209
    mul-long v3, v3, v9

    .line 210
    .line 211
    cmp-long v9, v3, v20

    .line 212
    .line 213
    if-ltz v9, :cond_10

    .line 214
    .line 215
    const-wide/32 v9, 0x7fffffff

    .line 216
    .line 217
    .line 218
    cmp-long v25, v3, v9

    .line 219
    .line 220
    if-lez v25, :cond_f

    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_f
    const/4 v9, 0x1

    .line 224
    goto :goto_a

    .line 225
    :cond_10
    :goto_6
    new-instance v9, Ljava/lang/StringBuilder;

    .line 226
    .line 227
    const-string v10, "Skip the tag entry since the number of components is invalid: "

    .line 228
    .line 229
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v9

    .line 239
    invoke-static {v8, v9}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 240
    .line 241
    .line 242
    :goto_7
    const/4 v9, 0x0

    .line 243
    goto :goto_a

    .line 244
    :goto_8
    new-instance v3, Ljava/lang/StringBuilder;

    .line 245
    .line 246
    const-string v4, "Skip the tag entry since data format is invalid: "

    .line 247
    .line 248
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    invoke-static {v8, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 259
    .line 260
    .line 261
    :goto_9
    move-wide/from16 v3, v20

    .line 262
    .line 263
    goto :goto_7

    .line 264
    :goto_a
    if-nez v9, :cond_11

    .line 265
    .line 266
    invoke-virtual {v1, v13, v14}, La/a;->f(J)V

    .line 267
    .line 268
    .line 269
    goto/16 :goto_10

    .line 270
    .line 271
    :cond_11
    const-string v9, "Compression"

    .line 272
    .line 273
    const-wide/16 v18, 0x4

    .line 274
    .line 275
    cmp-long v10, v3, v18

    .line 276
    .line 277
    if-lez v10, :cond_17

    .line 278
    .line 279
    invoke-virtual/range {p1 .. p1}, La/a;->readInt()I

    .line 280
    .line 281
    .line 282
    move-result v10

    .line 283
    move/from16 v18, v11

    .line 284
    .line 285
    iget v11, v0, La/e;->b:I

    .line 286
    .line 287
    move/from16 v19, v15

    .line 288
    .line 289
    const/4 v15, 0x7

    .line 290
    if-ne v11, v15, :cond_14

    .line 291
    .line 292
    iget-object v11, v5, La/c;->b:Ljava/lang/String;

    .line 293
    .line 294
    const-string v15, "MakerNote"

    .line 295
    .line 296
    invoke-virtual {v15, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v11

    .line 300
    if-eqz v11, :cond_13

    .line 301
    .line 302
    iput v10, v0, La/e;->f:I

    .line 303
    .line 304
    :cond_12
    move/from16 v22, v12

    .line 305
    .line 306
    move-wide/from16 v25, v13

    .line 307
    .line 308
    goto :goto_b

    .line 309
    :cond_13
    const/4 v11, 0x6

    .line 310
    if-ne v2, v11, :cond_12

    .line 311
    .line 312
    iget-object v15, v5, La/c;->b:Ljava/lang/String;

    .line 313
    .line 314
    const-string v11, "ThumbnailImage"

    .line 315
    .line 316
    invoke-virtual {v11, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v11

    .line 320
    if-eqz v11, :cond_12

    .line 321
    .line 322
    iput v10, v0, La/e;->g:I

    .line 323
    .line 324
    iput v12, v0, La/e;->h:I

    .line 325
    .line 326
    iget-object v11, v0, La/e;->d:Ljava/nio/ByteOrder;

    .line 327
    .line 328
    const/4 v15, 0x6

    .line 329
    invoke-static {v15, v11}, La/b;->c(ILjava/nio/ByteOrder;)La/b;

    .line 330
    .line 331
    .line 332
    move-result-object v11

    .line 333
    iget v15, v0, La/e;->g:I

    .line 334
    .line 335
    move/from16 v22, v12

    .line 336
    .line 337
    move-wide/from16 v25, v13

    .line 338
    .line 339
    int-to-long v12, v15

    .line 340
    iget-object v14, v0, La/e;->d:Ljava/nio/ByteOrder;

    .line 341
    .line 342
    invoke-static {v12, v13, v14}, La/b;->a(JLjava/nio/ByteOrder;)La/b;

    .line 343
    .line 344
    .line 345
    move-result-object v12

    .line 346
    iget v13, v0, La/e;->h:I

    .line 347
    .line 348
    int-to-long v13, v13

    .line 349
    iget-object v15, v0, La/e;->d:Ljava/nio/ByteOrder;

    .line 350
    .line 351
    invoke-static {v13, v14, v15}, La/b;->a(JLjava/nio/ByteOrder;)La/b;

    .line 352
    .line 353
    .line 354
    move-result-object v13

    .line 355
    const/4 v14, 0x4

    .line 356
    aget-object v15, v7, v14

    .line 357
    .line 358
    invoke-virtual {v15, v9, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    aget-object v11, v7, v14

    .line 362
    .line 363
    const-string v15, "JPEGInterchangeFormat"

    .line 364
    .line 365
    invoke-virtual {v11, v15, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    aget-object v11, v7, v14

    .line 369
    .line 370
    const-string v12, "JPEGInterchangeFormatLength"

    .line 371
    .line 372
    invoke-virtual {v11, v12, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    goto :goto_b

    .line 376
    :cond_14
    move/from16 v22, v12

    .line 377
    .line 378
    move-wide/from16 v25, v13

    .line 379
    .line 380
    const/16 v12, 0xa

    .line 381
    .line 382
    if-ne v11, v12, :cond_15

    .line 383
    .line 384
    iget-object v11, v5, La/c;->b:Ljava/lang/String;

    .line 385
    .line 386
    const-string v12, "JpgFromRaw"

    .line 387
    .line 388
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result v11

    .line 392
    if-eqz v11, :cond_15

    .line 393
    .line 394
    iput v10, v0, La/e;->i:I

    .line 395
    .line 396
    :cond_15
    :goto_b
    int-to-long v11, v10

    .line 397
    add-long v13, v11, v3

    .line 398
    .line 399
    move-wide/from16 v27, v3

    .line 400
    .line 401
    int-to-long v2, v6

    .line 402
    cmp-long v4, v13, v2

    .line 403
    .line 404
    if-gtz v4, :cond_16

    .line 405
    .line 406
    invoke-virtual {v1, v11, v12}, La/a;->f(J)V

    .line 407
    .line 408
    .line 409
    move-wide/from16 v13, v25

    .line 410
    .line 411
    goto :goto_c

    .line 412
    :cond_16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 413
    .line 414
    const-string v3, "Skip the tag entry since data offset is invalid: "

    .line 415
    .line 416
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 420
    .line 421
    .line 422
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    invoke-static {v8, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 427
    .line 428
    .line 429
    move-wide/from16 v13, v25

    .line 430
    .line 431
    invoke-virtual {v1, v13, v14}, La/a;->f(J)V

    .line 432
    .line 433
    .line 434
    goto/16 :goto_10

    .line 435
    .line 436
    :cond_17
    move-wide/from16 v27, v3

    .line 437
    .line 438
    move/from16 v18, v11

    .line 439
    .line 440
    move/from16 v22, v12

    .line 441
    .line 442
    move/from16 v19, v15

    .line 443
    .line 444
    :goto_c
    sget-object v2, La/e;->x:Ljava/util/HashMap;

    .line 445
    .line 446
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 447
    .line 448
    .line 449
    move-result-object v3

    .line 450
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    check-cast v2, Ljava/lang/Integer;

    .line 455
    .line 456
    if-eqz v2, :cond_1d

    .line 457
    .line 458
    move/from16 v11, v18

    .line 459
    .line 460
    const/4 v3, 0x3

    .line 461
    if-eq v11, v3, :cond_1b

    .line 462
    .line 463
    const/4 v3, 0x4

    .line 464
    if-eq v11, v3, :cond_1a

    .line 465
    .line 466
    const/16 v3, 0x8

    .line 467
    .line 468
    if-eq v11, v3, :cond_19

    .line 469
    .line 470
    const/16 v3, 0x9

    .line 471
    .line 472
    if-eq v11, v3, :cond_18

    .line 473
    .line 474
    const/16 v3, 0xd

    .line 475
    .line 476
    if-eq v11, v3, :cond_18

    .line 477
    .line 478
    const-wide/16 v3, -0x1

    .line 479
    .line 480
    goto :goto_e

    .line 481
    :cond_18
    invoke-virtual/range {p1 .. p1}, La/a;->readInt()I

    .line 482
    .line 483
    .line 484
    move-result v3

    .line 485
    :goto_d
    int-to-long v3, v3

    .line 486
    goto :goto_e

    .line 487
    :cond_19
    invoke-virtual/range {p1 .. p1}, La/a;->readShort()S

    .line 488
    .line 489
    .line 490
    move-result v3

    .line 491
    goto :goto_d

    .line 492
    :cond_1a
    invoke-virtual/range {p1 .. p1}, La/a;->readInt()I

    .line 493
    .line 494
    .line 495
    move-result v3

    .line 496
    int-to-long v3, v3

    .line 497
    const-wide v9, 0xffffffffL

    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    and-long/2addr v3, v9

    .line 503
    goto :goto_e

    .line 504
    :cond_1b
    invoke-virtual/range {p1 .. p1}, La/a;->readUnsignedShort()I

    .line 505
    .line 506
    .line 507
    move-result v3

    .line 508
    goto :goto_d

    .line 509
    :goto_e
    cmp-long v5, v3, v20

    .line 510
    .line 511
    if-lez v5, :cond_1c

    .line 512
    .line 513
    int-to-long v9, v6

    .line 514
    cmp-long v5, v3, v9

    .line 515
    .line 516
    if-gez v5, :cond_1c

    .line 517
    .line 518
    invoke-virtual {v1, v3, v4}, La/a;->f(J)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 522
    .line 523
    .line 524
    move-result v2

    .line 525
    invoke-virtual {v0, v1, v2}, La/e;->p(La/a;I)V

    .line 526
    .line 527
    .line 528
    goto :goto_f

    .line 529
    :cond_1c
    new-instance v2, Ljava/lang/StringBuilder;

    .line 530
    .line 531
    const-string v5, "Skip jump into the IFD since its offset is invalid: "

    .line 532
    .line 533
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v2

    .line 543
    invoke-static {v8, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 544
    .line 545
    .line 546
    :goto_f
    invoke-virtual {v1, v13, v14}, La/a;->f(J)V

    .line 547
    .line 548
    .line 549
    goto :goto_10

    .line 550
    :cond_1d
    move/from16 v11, v18

    .line 551
    .line 552
    move-wide/from16 v3, v27

    .line 553
    .line 554
    long-to-int v2, v3

    .line 555
    new-array v2, v2, [B

    .line 556
    .line 557
    invoke-virtual {v1, v2}, La/a;->readFully([B)V

    .line 558
    .line 559
    .line 560
    new-instance v3, La/b;

    .line 561
    .line 562
    move/from16 v4, v22

    .line 563
    .line 564
    invoke-direct {v3, v2, v11, v4}, La/b;-><init>([BII)V

    .line 565
    .line 566
    .line 567
    aget-object v2, v7, p2

    .line 568
    .line 569
    iget-object v4, v5, La/c;->b:Ljava/lang/String;

    .line 570
    .line 571
    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    iget-object v2, v5, La/c;->b:Ljava/lang/String;

    .line 575
    .line 576
    const-string v4, "DNGVersion"

    .line 577
    .line 578
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 579
    .line 580
    .line 581
    move-result v4

    .line 582
    if-eqz v4, :cond_1e

    .line 583
    .line 584
    const/4 v4, 0x3

    .line 585
    iput v4, v0, La/e;->b:I

    .line 586
    .line 587
    :cond_1e
    const-string v4, "Make"

    .line 588
    .line 589
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 590
    .line 591
    .line 592
    move-result v4

    .line 593
    if-nez v4, :cond_1f

    .line 594
    .line 595
    const-string v4, "Model"

    .line 596
    .line 597
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 598
    .line 599
    .line 600
    move-result v4

    .line 601
    if-eqz v4, :cond_20

    .line 602
    .line 603
    :cond_1f
    iget-object v4, v0, La/e;->d:Ljava/nio/ByteOrder;

    .line 604
    .line 605
    invoke-virtual {v3, v4}, La/b;->f(Ljava/nio/ByteOrder;)Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v4

    .line 609
    const-string v5, "PENTAX"

    .line 610
    .line 611
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 612
    .line 613
    .line 614
    move-result v4

    .line 615
    if-nez v4, :cond_21

    .line 616
    .line 617
    :cond_20
    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 618
    .line 619
    .line 620
    move-result v2

    .line 621
    if-eqz v2, :cond_22

    .line 622
    .line 623
    iget-object v2, v0, La/e;->d:Ljava/nio/ByteOrder;

    .line 624
    .line 625
    invoke-virtual {v3, v2}, La/b;->e(Ljava/nio/ByteOrder;)I

    .line 626
    .line 627
    .line 628
    move-result v2

    .line 629
    const v3, 0xffff

    .line 630
    .line 631
    .line 632
    if-ne v2, v3, :cond_22

    .line 633
    .line 634
    :cond_21
    const/16 v2, 0x8

    .line 635
    .line 636
    iput v2, v0, La/e;->b:I

    .line 637
    .line 638
    :cond_22
    iget v2, v1, La/a;->d:I

    .line 639
    .line 640
    int-to-long v2, v2

    .line 641
    cmp-long v4, v2, v13

    .line 642
    .line 643
    if-eqz v4, :cond_23

    .line 644
    .line 645
    invoke-virtual {v1, v13, v14}, La/a;->f(J)V

    .line 646
    .line 647
    .line 648
    :cond_23
    :goto_10
    add-int/lit8 v2, v24, 0x1

    .line 649
    .line 650
    int-to-short v2, v2

    .line 651
    move v4, v6

    .line 652
    move/from16 v3, v23

    .line 653
    .line 654
    move v6, v2

    .line 655
    move/from16 v2, p2

    .line 656
    .line 657
    goto/16 :goto_0

    .line 658
    .line 659
    :cond_24
    move v6, v4

    .line 660
    iget v2, v1, La/a;->d:I

    .line 661
    .line 662
    const/4 v3, 0x4

    .line 663
    add-int/2addr v2, v3

    .line 664
    if-gt v2, v6, :cond_26

    .line 665
    .line 666
    invoke-virtual/range {p1 .. p1}, La/a;->readInt()I

    .line 667
    .line 668
    .line 669
    move-result v2

    .line 670
    const/16 v4, 0x8

    .line 671
    .line 672
    if-le v2, v4, :cond_26

    .line 673
    .line 674
    if-ge v2, v6, :cond_26

    .line 675
    .line 676
    int-to-long v4, v2

    .line 677
    invoke-virtual {v1, v4, v5}, La/a;->f(J)V

    .line 678
    .line 679
    .line 680
    aget-object v2, v7, v3

    .line 681
    .line 682
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    .line 683
    .line 684
    .line 685
    move-result v2

    .line 686
    if-eqz v2, :cond_25

    .line 687
    .line 688
    invoke-virtual {v0, v1, v3}, La/e;->p(La/a;I)V

    .line 689
    .line 690
    .line 691
    goto :goto_11

    .line 692
    :cond_25
    const/4 v2, 0x5

    .line 693
    aget-object v3, v7, v2

    .line 694
    .line 695
    invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z

    .line 696
    .line 697
    .line 698
    move-result v3

    .line 699
    if-eqz v3, :cond_26

    .line 700
    .line 701
    invoke-virtual {v0, v1, v2}, La/e;->p(La/a;I)V

    .line 702
    .line 703
    .line 704
    :cond_26
    :goto_11
    return-void
.end method

.method public final q(La/a;)V
    .locals 11

    .line 1
    iget-object v0, p0, La/e;->c:[Ljava/util/HashMap;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    const-string v1, "Compression"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, La/b;

    .line 13
    .line 14
    if-eqz v1, :cond_8

    .line 15
    .line 16
    iget-object v2, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, La/b;->e(Ljava/nio/ByteOrder;)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v2, 0x1

    .line 23
    const/4 v3, 0x6

    .line 24
    if-eq v1, v2, :cond_1

    .line 25
    .line 26
    if-eq v1, v3, :cond_0

    .line 27
    .line 28
    const/4 v4, 0x7

    .line 29
    if-eq v1, v4, :cond_1

    .line 30
    .line 31
    goto/16 :goto_3

    .line 32
    .line 33
    :cond_0
    invoke-virtual {p0, p1, v0}, La/e;->k(La/a;Ljava/util/HashMap;)V

    .line 34
    .line 35
    .line 36
    goto/16 :goto_3

    .line 37
    .line 38
    :cond_1
    const-string v1, "BitsPerSample"

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, La/b;

    .line 45
    .line 46
    if-eqz v1, :cond_9

    .line 47
    .line 48
    iget-object v4, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 49
    .line 50
    invoke-virtual {v1, v4}, La/b;->g(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, [I

    .line 55
    .line 56
    sget-object v4, La/e;->j:[I

    .line 57
    .line 58
    invoke-static {v4, v1}, Ljava/util/Arrays;->equals([I[I)Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_2

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    iget v5, p0, La/e;->b:I

    .line 66
    .line 67
    const/4 v6, 0x3

    .line 68
    if-ne v5, v6, :cond_9

    .line 69
    .line 70
    const-string v5, "PhotometricInterpretation"

    .line 71
    .line 72
    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    check-cast v5, La/b;

    .line 77
    .line 78
    if-eqz v5, :cond_9

    .line 79
    .line 80
    iget-object v6, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 81
    .line 82
    invoke-virtual {v5, v6}, La/b;->e(Ljava/nio/ByteOrder;)I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-ne v5, v2, :cond_3

    .line 87
    .line 88
    sget-object v2, La/e;->k:[I

    .line 89
    .line 90
    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([I[I)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-nez v2, :cond_4

    .line 95
    .line 96
    :cond_3
    if-ne v5, v3, :cond_9

    .line 97
    .line 98
    invoke-static {v1, v4}, Ljava/util/Arrays;->equals([I[I)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_9

    .line 103
    .line 104
    :cond_4
    :goto_0
    const-string v1, "StripOffsets"

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    check-cast v1, La/b;

    .line 111
    .line 112
    const-string v2, "StripByteCounts"

    .line 113
    .line 114
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    check-cast v0, La/b;

    .line 119
    .line 120
    if-eqz v1, :cond_9

    .line 121
    .line 122
    if-eqz v0, :cond_9

    .line 123
    .line 124
    iget-object v2, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 125
    .line 126
    invoke-virtual {v1, v2}, La/b;->g(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-static {v1}, La/e;->b(Ljava/io/Serializable;)[J

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    iget-object v2, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 135
    .line 136
    invoke-virtual {v0, v2}, La/b;->g(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-static {v0}, La/e;->b(Ljava/io/Serializable;)[J

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    const-string v2, "ExifInterface"

    .line 145
    .line 146
    if-nez v1, :cond_5

    .line 147
    .line 148
    const-string p1, "stripOffsets should not be null."

    .line 149
    .line 150
    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_5
    if-nez v0, :cond_6

    .line 155
    .line 156
    const-string p1, "stripByteCounts should not be null."

    .line 157
    .line 158
    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_6
    array-length v2, v0

    .line 163
    const/4 v3, 0x0

    .line 164
    const-wide/16 v4, 0x0

    .line 165
    .line 166
    const/4 v6, 0x0

    .line 167
    :goto_1
    if-ge v6, v2, :cond_7

    .line 168
    .line 169
    aget-wide v7, v0, v6

    .line 170
    .line 171
    add-long/2addr v4, v7

    .line 172
    add-int/lit8 v6, v6, 0x1

    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_7
    long-to-int v2, v4

    .line 176
    new-array v2, v2, [B

    .line 177
    .line 178
    const/4 v4, 0x0

    .line 179
    const/4 v5, 0x0

    .line 180
    const/4 v6, 0x0

    .line 181
    :goto_2
    array-length v7, v1

    .line 182
    if-ge v4, v7, :cond_9

    .line 183
    .line 184
    aget-wide v7, v1, v4

    .line 185
    .line 186
    long-to-int v8, v7

    .line 187
    aget-wide v9, v0, v4

    .line 188
    .line 189
    long-to-int v7, v9

    .line 190
    sub-int/2addr v8, v5

    .line 191
    int-to-long v9, v8

    .line 192
    invoke-virtual {p1, v9, v10}, La/a;->f(J)V

    .line 193
    .line 194
    .line 195
    add-int/2addr v5, v8

    .line 196
    new-array v8, v7, [B

    .line 197
    .line 198
    invoke-virtual {p1, v8}, Ljava/io/InputStream;->read([B)I

    .line 199
    .line 200
    .line 201
    add-int/2addr v5, v7

    .line 202
    invoke-static {v8, v3, v2, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 203
    .line 204
    .line 205
    add-int/2addr v6, v7

    .line 206
    add-int/lit8 v4, v4, 0x1

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_8
    invoke-virtual {p0, p1, v0}, La/e;->k(La/a;Ljava/util/HashMap;)V

    .line 210
    .line 211
    .line 212
    :cond_9
    :goto_3
    return-void
.end method

.method public final r(II)V
    .locals 6

    .line 1
    iget-object v0, p0, La/e;->c:[Ljava/util/HashMap;

    .line 2
    .line 3
    aget-object v1, v0, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_3

    .line 10
    .line 11
    aget-object v1, v0, p2

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    aget-object v1, v0, p1

    .line 21
    .line 22
    const-string v2, "ImageLength"

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, La/b;

    .line 29
    .line 30
    aget-object v3, v0, p1

    .line 31
    .line 32
    const-string v4, "ImageWidth"

    .line 33
    .line 34
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, La/b;

    .line 39
    .line 40
    aget-object v5, v0, p2

    .line 41
    .line 42
    invoke-virtual {v5, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, La/b;

    .line 47
    .line 48
    aget-object v5, v0, p2

    .line 49
    .line 50
    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    check-cast v4, La/b;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    if-nez v3, :cond_1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    if-eqz v2, :cond_3

    .line 62
    .line 63
    if-nez v4, :cond_2

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    iget-object v5, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 67
    .line 68
    invoke-virtual {v1, v5}, La/b;->e(Ljava/nio/ByteOrder;)I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    iget-object v5, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 73
    .line 74
    invoke-virtual {v3, v5}, La/b;->e(Ljava/nio/ByteOrder;)I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    iget-object v5, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 79
    .line 80
    invoke-virtual {v2, v5}, La/b;->e(Ljava/nio/ByteOrder;)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    iget-object v5, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 85
    .line 86
    invoke-virtual {v4, v5}, La/b;->e(Ljava/nio/ByteOrder;)I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-ge v1, v2, :cond_3

    .line 91
    .line 92
    if-ge v3, v4, :cond_3

    .line 93
    .line 94
    aget-object v1, v0, p1

    .line 95
    .line 96
    aget-object v2, v0, p2

    .line 97
    .line 98
    aput-object v2, v0, p1

    .line 99
    .line 100
    aput-object v1, v0, p2

    .line 101
    .line 102
    :cond_3
    :goto_0
    return-void
.end method

.method public final s(La/a;I)V
    .locals 10

    .line 1
    iget-object v0, p0, La/e;->c:[Ljava/util/HashMap;

    .line 2
    .line 3
    aget-object v1, v0, p2

    .line 4
    .line 5
    const-string v2, "DefaultCropSize"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, La/b;

    .line 12
    .line 13
    aget-object v2, v0, p2

    .line 14
    .line 15
    const-string v3, "SensorTopBorder"

    .line 16
    .line 17
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, La/b;

    .line 22
    .line 23
    aget-object v3, v0, p2

    .line 24
    .line 25
    const-string v4, "SensorLeftBorder"

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, La/b;

    .line 32
    .line 33
    aget-object v4, v0, p2

    .line 34
    .line 35
    const-string v5, "SensorBottomBorder"

    .line 36
    .line 37
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, La/b;

    .line 42
    .line 43
    aget-object v5, v0, p2

    .line 44
    .line 45
    const-string v6, "SensorRightBorder"

    .line 46
    .line 47
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    check-cast v5, La/b;

    .line 52
    .line 53
    const-string v6, "ImageLength"

    .line 54
    .line 55
    const-string v7, "ImageWidth"

    .line 56
    .line 57
    if-eqz v1, :cond_5

    .line 58
    .line 59
    iget p1, v1, La/b;->a:I

    .line 60
    .line 61
    const/4 v2, 0x5

    .line 62
    const-string v3, "Invalid crop size values. cropSize="

    .line 63
    .line 64
    const-string v4, "ExifInterface"

    .line 65
    .line 66
    const/4 v5, 0x1

    .line 67
    const/4 v8, 0x0

    .line 68
    const/4 v9, 0x2

    .line 69
    if-ne p1, v2, :cond_2

    .line 70
    .line 71
    iget-object p1, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 72
    .line 73
    invoke-virtual {v1, p1}, La/b;->g(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, [La/d;

    .line 78
    .line 79
    if-eqz p1, :cond_1

    .line 80
    .line 81
    array-length v1, p1

    .line 82
    if-eq v1, v9, :cond_0

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    aget-object v1, p1, v8

    .line 86
    .line 87
    iget-object v2, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 88
    .line 89
    invoke-static {v1, v2}, La/b;->b(La/d;Ljava/nio/ByteOrder;)La/b;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    aget-object p1, p1, v5

    .line 94
    .line 95
    iget-object v2, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 96
    .line 97
    invoke-static {p1, v2}, La/b;->b(La/d;Ljava/nio/ByteOrder;)La/b;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    goto :goto_1

    .line 102
    :cond_1
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {v4, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_2
    iget-object p1, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 123
    .line 124
    invoke-virtual {v1, p1}, La/b;->g(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    check-cast p1, [I

    .line 129
    .line 130
    if-eqz p1, :cond_4

    .line 131
    .line 132
    array-length v1, p1

    .line 133
    if-eq v1, v9, :cond_3

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_3
    aget v1, p1, v8

    .line 137
    .line 138
    iget-object v2, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 139
    .line 140
    invoke-static {v1, v2}, La/b;->c(ILjava/nio/ByteOrder;)La/b;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    aget p1, p1, v5

    .line 145
    .line 146
    iget-object v2, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 147
    .line 148
    invoke-static {p1, v2}, La/b;->c(ILjava/nio/ByteOrder;)La/b;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    :goto_1
    aget-object v2, v0, p2

    .line 153
    .line 154
    invoke-virtual {v2, v7, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    aget-object p2, v0, p2

    .line 158
    .line 159
    invoke-virtual {p2, v6, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    goto/16 :goto_3

    .line 163
    .line 164
    :cond_4
    :goto_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-static {p1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-static {v4, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    :cond_5
    if-eqz v2, :cond_6

    .line 185
    .line 186
    if-eqz v3, :cond_6

    .line 187
    .line 188
    if-eqz v4, :cond_6

    .line 189
    .line 190
    if-eqz v5, :cond_6

    .line 191
    .line 192
    iget-object p1, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 193
    .line 194
    invoke-virtual {v2, p1}, La/b;->e(Ljava/nio/ByteOrder;)I

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    iget-object v1, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 199
    .line 200
    invoke-virtual {v4, v1}, La/b;->e(Ljava/nio/ByteOrder;)I

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    iget-object v2, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 205
    .line 206
    invoke-virtual {v5, v2}, La/b;->e(Ljava/nio/ByteOrder;)I

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    iget-object v4, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 211
    .line 212
    invoke-virtual {v3, v4}, La/b;->e(Ljava/nio/ByteOrder;)I

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    if-le v1, p1, :cond_8

    .line 217
    .line 218
    if-le v2, v3, :cond_8

    .line 219
    .line 220
    sub-int/2addr v1, p1

    .line 221
    sub-int/2addr v2, v3

    .line 222
    iget-object p1, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 223
    .line 224
    invoke-static {v1, p1}, La/b;->c(ILjava/nio/ByteOrder;)La/b;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    iget-object v1, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 229
    .line 230
    invoke-static {v2, v1}, La/b;->c(ILjava/nio/ByteOrder;)La/b;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    aget-object v2, v0, p2

    .line 235
    .line 236
    invoke-virtual {v2, v6, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    aget-object p1, v0, p2

    .line 240
    .line 241
    invoke-virtual {p1, v7, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    goto :goto_3

    .line 245
    :cond_6
    aget-object v1, v0, p2

    .line 246
    .line 247
    invoke-virtual {v1, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    check-cast v1, La/b;

    .line 252
    .line 253
    aget-object v2, v0, p2

    .line 254
    .line 255
    invoke-virtual {v2, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    check-cast v2, La/b;

    .line 260
    .line 261
    if-eqz v1, :cond_7

    .line 262
    .line 263
    if-nez v2, :cond_8

    .line 264
    .line 265
    :cond_7
    aget-object v0, v0, p2

    .line 266
    .line 267
    const-string v1, "JPEGInterchangeFormat"

    .line 268
    .line 269
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    check-cast v0, La/b;

    .line 274
    .line 275
    if-eqz v0, :cond_8

    .line 276
    .line 277
    iget-object v1, p0, La/e;->d:Ljava/nio/ByteOrder;

    .line 278
    .line 279
    invoke-virtual {v0, v1}, La/b;->e(Ljava/nio/ByteOrder;)I

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    invoke-virtual {p0, p1, v0, p2}, La/e;->e(La/a;II)V

    .line 284
    .line 285
    .line 286
    :cond_8
    :goto_3
    return-void
.end method
