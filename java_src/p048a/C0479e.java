package p048a;

import android.util.Log;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TimeZone;
import java.util.regex.Pattern;
import p030Q0.AbstractC0328E;

/* renamed from: a.e */
/* loaded from: classes.dex */
public final class C0479e {

    /* renamed from: j */
    public static final int[] f1128j;

    /* renamed from: k */
    public static final int[] f1129k;

    /* renamed from: l */
    public static final byte[] f1130l;

    /* renamed from: m */
    public static final byte[] f1131m;

    /* renamed from: n */
    public static final byte[] f1132n;

    /* renamed from: o */
    public static final String[] f1133o;

    /* renamed from: p */
    public static final int[] f1134p;

    /* renamed from: q */
    public static final byte[] f1135q;

    /* renamed from: r */
    public static final C0477c f1136r;

    /* renamed from: s */
    public static final C0477c[][] f1137s;

    /* renamed from: t */
    public static final C0477c[] f1138t;

    /* renamed from: u */
    public static final HashMap[] f1139u;

    /* renamed from: v */
    public static final HashMap[] f1140v;

    /* renamed from: w */
    public static final HashSet f1141w;

    /* renamed from: x */
    public static final HashMap f1142x;

    /* renamed from: y */
    public static final Charset f1143y;

    /* renamed from: z */
    public static final byte[] f1144z;

    /* renamed from: a */
    public final String f1145a;

    /* renamed from: b */
    public int f1146b;

    /* renamed from: c */
    public final HashMap[] f1147c = new HashMap[f1137s.length];

    /* renamed from: d */
    public ByteOrder f1148d = ByteOrder.BIG_ENDIAN;

    /* renamed from: e */
    public int f1149e;

    /* renamed from: f */
    public int f1150f;

    /* renamed from: g */
    public int f1151g;

    /* renamed from: h */
    public int f1152h;

    /* renamed from: i */
    public int f1153i;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f1128j = new int[]{8, 8, 8};
        f1129k = new int[]{8};
        f1130l = new byte[]{-1, -40, -1};
        f1131m = new byte[]{79, 76, 89, 77, 80, 0};
        f1132n = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f1133o = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
        f1134p = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f1135q = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C0477c[] c0477cArr = {new C0477c("NewSubfileType", 254, 4), new C0477c("SubfileType", 255, 4), new C0477c("ImageWidth", 256), new C0477c("ImageLength", 257), new C0477c("BitsPerSample", 258, 3), new C0477c("Compression", 259, 3), new C0477c("PhotometricInterpretation", 262, 3), new C0477c("ImageDescription", 270, 2), new C0477c("Make", 271, 2), new C0477c("Model", 272, 2), new C0477c("StripOffsets", 273), new C0477c("Orientation", 274, 3), new C0477c("SamplesPerPixel", 277, 3), new C0477c("RowsPerStrip", 278), new C0477c("StripByteCounts", 279), new C0477c("XResolution", 282, 5), new C0477c("YResolution", 283, 5), new C0477c("PlanarConfiguration", 284, 3), new C0477c("ResolutionUnit", 296, 3), new C0477c("TransferFunction", 301, 3), new C0477c("Software", 305, 2), new C0477c("DateTime", 306, 2), new C0477c("Artist", 315, 2), new C0477c("WhitePoint", 318, 5), new C0477c("PrimaryChromaticities", 319, 5), new C0477c("SubIFDPointer", 330, 4), new C0477c("JPEGInterchangeFormat", 513, 4), new C0477c("JPEGInterchangeFormatLength", 514, 4), new C0477c("YCbCrCoefficients", 529, 5), new C0477c("YCbCrSubSampling", 530, 3), new C0477c("YCbCrPositioning", 531, 3), new C0477c("ReferenceBlackWhite", 532, 5), new C0477c("Copyright", 33432, 2), new C0477c("ExifIFDPointer", 34665, 4), new C0477c("GPSInfoIFDPointer", 34853, 4), new C0477c("SensorTopBorder", 4, 4), new C0477c("SensorLeftBorder", 5, 4), new C0477c("SensorBottomBorder", 6, 4), new C0477c("SensorRightBorder", 7, 4), new C0477c("ISO", 23, 3), new C0477c("JpgFromRaw", 46, 7)};
        C0477c[] c0477cArr2 = {new C0477c("ExposureTime", 33434, 5), new C0477c("FNumber", 33437, 5), new C0477c("ExposureProgram", 34850, 3), new C0477c("SpectralSensitivity", 34852, 2), new C0477c("PhotographicSensitivity", 34855, 3), new C0477c("OECF", 34856, 7), new C0477c("ExifVersion", 36864, 2), new C0477c("DateTimeOriginal", 36867, 2), new C0477c("DateTimeDigitized", 36868, 2), new C0477c("ComponentsConfiguration", 37121, 7), new C0477c("CompressedBitsPerPixel", 37122, 5), new C0477c("ShutterSpeedValue", 37377, 10), new C0477c("ApertureValue", 37378, 5), new C0477c("BrightnessValue", 37379, 10), new C0477c("ExposureBiasValue", 37380, 10), new C0477c("MaxApertureValue", 37381, 5), new C0477c("SubjectDistance", 37382, 5), new C0477c("MeteringMode", 37383, 3), new C0477c("LightSource", 37384, 3), new C0477c("Flash", 37385, 3), new C0477c("FocalLength", 37386, 5), new C0477c("SubjectArea", 37396, 3), new C0477c("MakerNote", 37500, 7), new C0477c("UserComment", 37510, 7), new C0477c("SubSecTime", 37520, 2), new C0477c("SubSecTimeOriginal", 37521, 2), new C0477c("SubSecTimeDigitized", 37522, 2), new C0477c("FlashpixVersion", 40960, 7), new C0477c("ColorSpace", 40961, 3), new C0477c("PixelXDimension", 40962), new C0477c("PixelYDimension", 40963), new C0477c("RelatedSoundFile", 40964, 2), new C0477c("InteroperabilityIFDPointer", 40965, 4), new C0477c("FlashEnergy", 41483, 5), new C0477c("SpatialFrequencyResponse", 41484, 7), new C0477c("FocalPlaneXResolution", 41486, 5), new C0477c("FocalPlaneYResolution", 41487, 5), new C0477c("FocalPlaneResolutionUnit", 41488, 3), new C0477c("SubjectLocation", 41492, 3), new C0477c("ExposureIndex", 41493, 5), new C0477c("SensingMethod", 41495, 3), new C0477c("FileSource", 41728, 7), new C0477c("SceneType", 41729, 7), new C0477c("CFAPattern", 41730, 7), new C0477c("CustomRendered", 41985, 3), new C0477c("ExposureMode", 41986, 3), new C0477c("WhiteBalance", 41987, 3), new C0477c("DigitalZoomRatio", 41988, 5), new C0477c("FocalLengthIn35mmFilm", 41989, 3), new C0477c("SceneCaptureType", 41990, 3), new C0477c("GainControl", 41991, 3), new C0477c("Contrast", 41992, 3), new C0477c("Saturation", 41993, 3), new C0477c("Sharpness", 41994, 3), new C0477c("DeviceSettingDescription", 41995, 7), new C0477c("SubjectDistanceRange", 41996, 3), new C0477c("ImageUniqueID", 42016, 2), new C0477c("DNGVersion", 50706, 1), new C0477c("DefaultCropSize", 50720)};
        C0477c[] c0477cArr3 = {new C0477c("GPSVersionID", 0, 1), new C0477c("GPSLatitudeRef", 1, 2), new C0477c("GPSLatitude", 2, 5), new C0477c("GPSLongitudeRef", 3, 2), new C0477c("GPSLongitude", 4, 5), new C0477c("GPSAltitudeRef", 5, 1), new C0477c("GPSAltitude", 6, 5), new C0477c("GPSTimeStamp", 7, 5), new C0477c("GPSSatellites", 8, 2), new C0477c("GPSStatus", 9, 2), new C0477c("GPSMeasureMode", 10, 2), new C0477c("GPSDOP", 11, 5), new C0477c("GPSSpeedRef", 12, 2), new C0477c("GPSSpeed", 13, 5), new C0477c("GPSTrackRef", 14, 2), new C0477c("GPSTrack", 15, 5), new C0477c("GPSImgDirectionRef", 16, 2), new C0477c("GPSImgDirection", 17, 5), new C0477c("GPSMapDatum", 18, 2), new C0477c("GPSDestLatitudeRef", 19, 2), new C0477c("GPSDestLatitude", 20, 5), new C0477c("GPSDestLongitudeRef", 21, 2), new C0477c("GPSDestLongitude", 22, 5), new C0477c("GPSDestBearingRef", 23, 2), new C0477c("GPSDestBearing", 24, 5), new C0477c("GPSDestDistanceRef", 25, 2), new C0477c("GPSDestDistance", 26, 5), new C0477c("GPSProcessingMethod", 27, 7), new C0477c("GPSAreaInformation", 28, 7), new C0477c("GPSDateStamp", 29, 2), new C0477c("GPSDifferential", 30, 3)};
        C0477c[] c0477cArr4 = {new C0477c("InteroperabilityIndex", 1, 2)};
        C0477c[] c0477cArr5 = {new C0477c("NewSubfileType", 254, 4), new C0477c("SubfileType", 255, 4), new C0477c("ThumbnailImageWidth", 256), new C0477c("ThumbnailImageLength", 257), new C0477c("BitsPerSample", 258, 3), new C0477c("Compression", 259, 3), new C0477c("PhotometricInterpretation", 262, 3), new C0477c("ImageDescription", 270, 2), new C0477c("Make", 271, 2), new C0477c("Model", 272, 2), new C0477c("StripOffsets", 273), new C0477c("Orientation", 274, 3), new C0477c("SamplesPerPixel", 277, 3), new C0477c("RowsPerStrip", 278), new C0477c("StripByteCounts", 279), new C0477c("XResolution", 282, 5), new C0477c("YResolution", 283, 5), new C0477c("PlanarConfiguration", 284, 3), new C0477c("ResolutionUnit", 296, 3), new C0477c("TransferFunction", 301, 3), new C0477c("Software", 305, 2), new C0477c("DateTime", 306, 2), new C0477c("Artist", 315, 2), new C0477c("WhitePoint", 318, 5), new C0477c("PrimaryChromaticities", 319, 5), new C0477c("SubIFDPointer", 330, 4), new C0477c("JPEGInterchangeFormat", 513, 4), new C0477c("JPEGInterchangeFormatLength", 514, 4), new C0477c("YCbCrCoefficients", 529, 5), new C0477c("YCbCrSubSampling", 530, 3), new C0477c("YCbCrPositioning", 531, 3), new C0477c("ReferenceBlackWhite", 532, 5), new C0477c("Copyright", 33432, 2), new C0477c("ExifIFDPointer", 34665, 4), new C0477c("GPSInfoIFDPointer", 34853, 4), new C0477c("DNGVersion", 50706, 1), new C0477c("DefaultCropSize", 50720)};
        f1136r = new C0477c("StripOffsets", 273, 3);
        f1137s = new C0477c[][]{c0477cArr, c0477cArr2, c0477cArr3, c0477cArr4, c0477cArr5, c0477cArr, new C0477c[]{new C0477c("ThumbnailImage", 256, 7), new C0477c("CameraSettingsIFDPointer", 8224, 4), new C0477c("ImageProcessingIFDPointer", 8256, 4)}, new C0477c[]{new C0477c("PreviewImageStart", 257, 4), new C0477c("PreviewImageLength", 258, 4)}, new C0477c[]{new C0477c("AspectFrame", 4371, 3)}, new C0477c[]{new C0477c("ColorSpace", 55, 3)}};
        f1138t = new C0477c[]{new C0477c("SubIFDPointer", 330, 4), new C0477c("ExifIFDPointer", 34665, 4), new C0477c("GPSInfoIFDPointer", 34853, 4), new C0477c("InteroperabilityIFDPointer", 40965, 4), new C0477c("CameraSettingsIFDPointer", 8224, 1), new C0477c("ImageProcessingIFDPointer", 8256, 1)};
        f1139u = new HashMap[10];
        f1140v = new HashMap[10];
        f1141w = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f1142x = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f1143y = charsetForName;
        f1144z = "Exif\u0000\u0000".getBytes(charsetForName);
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C0477c[][] c0477cArr6 = f1137s;
            if (i >= c0477cArr6.length) {
                HashMap map = f1142x;
                C0477c[] c0477cArr7 = f1138t;
                map.put(Integer.valueOf(c0477cArr7[0].f1122a), 5);
                map.put(Integer.valueOf(c0477cArr7[1].f1122a), 1);
                map.put(Integer.valueOf(c0477cArr7[2].f1122a), 2);
                map.put(Integer.valueOf(c0477cArr7[3].f1122a), 3);
                map.put(Integer.valueOf(c0477cArr7[4].f1122a), 7);
                map.put(Integer.valueOf(c0477cArr7[5].f1122a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
            f1139u[i] = new HashMap();
            f1140v[i] = new HashMap();
            for (C0477c c0477c : c0477cArr6[i]) {
                f1139u[i].put(Integer.valueOf(c0477c.f1122a), c0477c);
                f1140v[i].put(c0477c.f1123b, c0477c);
            }
            i++;
        }
    }

    public C0479e(String str) throws Throwable {
        if (str == null) {
            throw new IllegalArgumentException("filename cannot be null");
        }
        this.f1145a = str;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                m1127m(fileInputStream2);
                try {
                    fileInputStream2.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static long[] m1114b(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* renamed from: o */
    public static ByteOrder m1115o(C0475a c0475a) throws IOException {
        short s2 = c0475a.readShort();
        if (s2 == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s2 == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s2));
    }

    /* renamed from: a */
    public final void m1116a() {
        String strM1117c = m1117c("DateTimeOriginal");
        HashMap[] mapArr = this.f1147c;
        if (strM1117c != null && m1117c("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strM1117c.concat("\u0000").getBytes(f1143y);
            map.put("DateTime", new C0476b(bytes, 2, bytes.length));
        }
        if (m1117c("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", C0476b.m1107a(0L, this.f1148d));
        }
        if (m1117c("ImageLength") == null) {
            mapArr[0].put("ImageLength", C0476b.m1107a(0L, this.f1148d));
        }
        if (m1117c("Orientation") == null) {
            mapArr[0].put("Orientation", C0476b.m1107a(0L, this.f1148d));
        }
        if (m1117c("LightSource") == null) {
            mapArr[1].put("LightSource", C0476b.m1107a(0L, this.f1148d));
        }
    }

    /* renamed from: c */
    public final String m1117c(String str) {
        C0476b c0476bM1118d = m1118d(str);
        if (c0476bM1118d != null) {
            if (!f1141w.contains(str)) {
                return c0476bM1118d.m1112f(this.f1148d);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = c0476bM1118d.f1119a;
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                C0478d[] c0478dArr = (C0478d[]) c0476bM1118d.m1113g(this.f1148d);
                if (c0478dArr == null || c0478dArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c0478dArr));
                    return null;
                }
                C0478d c0478d = c0478dArr[0];
                Integer numValueOf = Integer.valueOf((int) (c0478d.f1126a / c0478d.f1127b));
                C0478d c0478d2 = c0478dArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (c0478d2.f1126a / c0478d2.f1127b));
                C0478d c0478d3 = c0478dArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c0478d3.f1126a / c0478d3.f1127b)));
            }
            try {
                return Double.toString(c0476bM1118d.m1110d(this.f1148d));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: d */
    public final C0476b m1118d(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f1137s.length; i++) {
            C0476b c0476b = (C0476b) this.f1147c[i].get(str);
            if (c0476b != null) {
                return c0476b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0125, code lost:
    
        r12.f1116b = r11.f1148d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0129, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056 A[FALL_THROUGH] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1119e(C0475a c0475a, int i, int i2) throws IOException {
        c0475a.f1116b = ByteOrder.BIG_ENDIAN;
        c0475a.m1106f(i);
        byte b2 = c0475a.readByte();
        if (b2 != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(b2 & 255));
        }
        if (c0475a.readByte() != -40) {
            throw new IOException("Invalid marker: " + Integer.toHexString(b2 & 255));
        }
        int i3 = i + 2;
        while (true) {
            byte b3 = c0475a.readByte();
            if (b3 != -1) {
                throw new IOException("Invalid marker:" + Integer.toHexString(b3 & 255));
            }
            byte b4 = c0475a.readByte();
            if (b4 != -39 && b4 != -38) {
                int unsignedShort = c0475a.readUnsignedShort();
                int i4 = unsignedShort - 2;
                int i5 = i3 + 4;
                if (i4 < 0) {
                    throw new IOException("Invalid length");
                }
                if (b4 != -31) {
                    HashMap[] mapArr = this.f1147c;
                    if (b4 != -2) {
                        switch (b4) {
                            default:
                                switch (b4) {
                                    default:
                                        switch (b4) {
                                            default:
                                                switch (b4) {
                                                }
                                            case -55:
                                            case -54:
                                            case -53:
                                                if (c0475a.skipBytes(1) != 1) {
                                                    throw new IOException("Invalid SOFx");
                                                }
                                                mapArr[i2].put("ImageLength", C0476b.m1107a(c0475a.readUnsignedShort(), this.f1148d));
                                                mapArr[i2].put("ImageWidth", C0476b.m1107a(c0475a.readUnsignedShort(), this.f1148d));
                                                i4 = unsignedShort - 7;
                                                break;
                                        }
                                    case -59:
                                    case -58:
                                    case -57:
                                        break;
                                }
                            case -64:
                            case -63:
                            case -62:
                            case -61:
                                break;
                        }
                    } else {
                        byte[] bArr = new byte[i4];
                        if (c0475a.read(bArr) != i4) {
                            throw new IOException("Invalid exif");
                        }
                        if (m1117c("UserComment") == null) {
                            HashMap map = mapArr[1];
                            Charset charset = f1143y;
                            byte[] bytes = new String(bArr, charset).concat("\u0000").getBytes(charset);
                            map.put("UserComment", new C0476b(bytes, 2, bytes.length));
                        }
                        i4 = 0;
                    }
                } else if (i4 >= 6) {
                    byte[] bArr2 = new byte[6];
                    if (c0475a.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    i5 = i3 + 10;
                    int i6 = unsignedShort - 8;
                    if (!Arrays.equals(bArr2, f1144z)) {
                        i4 = i6;
                    } else {
                        if (i6 <= 0) {
                            throw new IOException("Invalid exif");
                        }
                        this.f1149e = i5;
                        byte[] bArr3 = new byte[i6];
                        if (c0475a.read(bArr3) != i6) {
                            throw new IOException("Invalid exif");
                        }
                        i5 += i6;
                        C0475a c0475a2 = new C0475a(bArr3);
                        m1128n(c0475a2, i6);
                        m1129p(c0475a2, i2);
                        i4 = 0;
                    }
                }
                if (i4 < 0) {
                    throw new IOException("Invalid length");
                }
                if (c0475a.skipBytes(i4) != i4) {
                    throw new IOException("Invalid JPEG segment");
                }
                i3 = i5 + i4;
            }
        }
    }

    /* renamed from: f */
    public final int m1120f(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr2 = f1130l;
            if (i >= bArr2.length) {
                return 4;
            }
            if (bArr[i] != bArr2[i]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i2 = 0; i2 < bytes.length; i2++) {
                    if (bArr[i2] != bytes[i2]) {
                        C0475a c0475a = new C0475a(bArr);
                        ByteOrder byteOrderM1115o = m1115o(c0475a);
                        this.f1148d = byteOrderM1115o;
                        c0475a.f1116b = byteOrderM1115o;
                        short s2 = c0475a.readShort();
                        c0475a.close();
                        if (s2 == 20306 || s2 == 21330) {
                            return 7;
                        }
                        C0475a c0475a2 = new C0475a(bArr);
                        ByteOrder byteOrderM1115o2 = m1115o(c0475a2);
                        this.f1148d = byteOrderM1115o2;
                        c0475a2.f1116b = byteOrderM1115o2;
                        short s3 = c0475a2.readShort();
                        c0475a2.close();
                        return s3 == 85 ? 10 : 0;
                    }
                }
                return 9;
            }
            i++;
        }
    }

    /* renamed from: g */
    public final void m1121g(C0475a c0475a) throws Throwable {
        int i;
        int i2;
        m1123i(c0475a);
        HashMap[] mapArr = this.f1147c;
        C0476b c0476b = (C0476b) mapArr[1].get("MakerNote");
        if (c0476b != null) {
            C0475a c0475a2 = new C0475a(c0476b.f1121c);
            c0475a2.f1116b = this.f1148d;
            byte[] bArr = f1131m;
            byte[] bArr2 = new byte[bArr.length];
            c0475a2.readFully(bArr2);
            c0475a2.m1106f(0L);
            byte[] bArr3 = f1132n;
            byte[] bArr4 = new byte[bArr3.length];
            c0475a2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c0475a2.m1106f(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c0475a2.m1106f(12L);
            }
            m1129p(c0475a2, 6);
            C0476b c0476b2 = (C0476b) mapArr[7].get("PreviewImageStart");
            C0476b c0476b3 = (C0476b) mapArr[7].get("PreviewImageLength");
            if (c0476b2 != null && c0476b3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", c0476b2);
                mapArr[5].put("JPEGInterchangeFormatLength", c0476b3);
            }
            C0476b c0476b4 = (C0476b) mapArr[8].get("AspectFrame");
            if (c0476b4 != null) {
                int[] iArr = (int[]) c0476b4.m1113g(this.f1148d);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                C0476b c0476bM1109c = C0476b.m1109c(i5, this.f1148d);
                C0476b c0476bM1109c2 = C0476b.m1109c(i6, this.f1148d);
                mapArr[0].put("ImageWidth", c0476bM1109c);
                mapArr[0].put("ImageLength", c0476bM1109c2);
            }
        }
    }

    /* renamed from: h */
    public final void m1122h(C0475a c0475a) throws IOException {
        c0475a.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        c0475a.read(bArr);
        c0475a.skipBytes(4);
        c0475a.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        m1119e(c0475a, i, 5);
        c0475a.m1106f(i2);
        c0475a.f1116b = ByteOrder.BIG_ENDIAN;
        int i3 = c0475a.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            int unsignedShort = c0475a.readUnsignedShort();
            int unsignedShort2 = c0475a.readUnsignedShort();
            if (unsignedShort == f1136r.f1122a) {
                short s2 = c0475a.readShort();
                short s3 = c0475a.readShort();
                C0476b c0476bM1109c = C0476b.m1109c(s2, this.f1148d);
                C0476b c0476bM1109c2 = C0476b.m1109c(s3, this.f1148d);
                HashMap[] mapArr = this.f1147c;
                mapArr[0].put("ImageLength", c0476bM1109c);
                mapArr[0].put("ImageWidth", c0476bM1109c2);
                return;
            }
            c0475a.skipBytes(unsignedShort2);
        }
    }

    /* renamed from: i */
    public final void m1123i(C0475a c0475a) throws Throwable {
        C0476b c0476b;
        m1128n(c0475a, c0475a.f1115a.available());
        m1129p(c0475a, 0);
        m1132s(c0475a, 0);
        m1132s(c0475a, 5);
        m1132s(c0475a, 4);
        m1131r(0, 5);
        m1131r(0, 4);
        m1131r(5, 4);
        HashMap[] mapArr = this.f1147c;
        C0476b c0476b2 = (C0476b) mapArr[1].get("PixelXDimension");
        C0476b c0476b3 = (C0476b) mapArr[1].get("PixelYDimension");
        if (c0476b2 != null && c0476b3 != null) {
            mapArr[0].put("ImageWidth", c0476b2);
            mapArr[0].put("ImageLength", c0476b3);
        }
        if (mapArr[4].isEmpty() && m1126l(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        m1126l(mapArr[4]);
        if (this.f1146b != 8 || (c0476b = (C0476b) mapArr[1].get("MakerNote")) == null) {
            return;
        }
        C0475a c0475a2 = new C0475a(c0476b.f1121c);
        c0475a2.f1116b = this.f1148d;
        c0475a2.m1106f(6L);
        m1129p(c0475a2, 9);
        C0476b c0476b4 = (C0476b) mapArr[9].get("ColorSpace");
        if (c0476b4 != null) {
            mapArr[1].put("ColorSpace", c0476b4);
        }
    }

    /* renamed from: j */
    public final void m1124j(C0475a c0475a) throws Throwable {
        m1123i(c0475a);
        HashMap[] mapArr = this.f1147c;
        if (((C0476b) mapArr[0].get("JpgFromRaw")) != null) {
            m1119e(c0475a, this.f1153i, 5);
        }
        C0476b c0476b = (C0476b) mapArr[0].get("ISO");
        C0476b c0476b2 = (C0476b) mapArr[1].get("PhotographicSensitivity");
        if (c0476b == null || c0476b2 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", c0476b);
    }

    /* renamed from: k */
    public final void m1125k(C0475a c0475a, HashMap map) throws Throwable {
        int i;
        C0476b c0476b = (C0476b) map.get("JPEGInterchangeFormat");
        C0476b c0476b2 = (C0476b) map.get("JPEGInterchangeFormatLength");
        if (c0476b == null || c0476b2 == null) {
            return;
        }
        int iM1111e = c0476b.m1111e(this.f1148d);
        int iMin = Math.min(c0476b2.m1111e(this.f1148d), c0475a.f1115a.available() - iM1111e);
        int i2 = this.f1146b;
        if (i2 != 4 && i2 != 9 && i2 != 10) {
            if (i2 == 7) {
                i = this.f1150f;
            }
            if (iM1111e > 0 || iMin <= 0 || this.f1145a != null) {
                return;
            }
            c0475a.m1106f(iM1111e);
            c0475a.readFully(new byte[iMin]);
            return;
        }
        i = this.f1149e;
        iM1111e += i;
        if (iM1111e > 0) {
        }
    }

    /* renamed from: l */
    public final boolean m1126l(HashMap map) {
        C0476b c0476b = (C0476b) map.get("ImageLength");
        C0476b c0476b2 = (C0476b) map.get("ImageWidth");
        if (c0476b == null || c0476b2 == null) {
            return false;
        }
        return c0476b.m1111e(this.f1148d) <= 512 && c0476b2.m1111e(this.f1148d) <= 512;
    }

    /* renamed from: m */
    public final void m1127m(FileInputStream fileInputStream) {
        for (int i = 0; i < f1137s.length; i++) {
            try {
                this.f1147c[i] = new HashMap();
            } catch (IOException unused) {
            } catch (Throwable th) {
                m1116a();
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 5000);
        this.f1146b = m1120f(bufferedInputStream);
        C0475a c0475a = new C0475a(bufferedInputStream);
        switch (this.f1146b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                m1123i(c0475a);
                break;
            case 4:
                m1119e(c0475a, 0, 0);
                break;
            case 7:
                m1121g(c0475a);
                break;
            case 9:
                m1122h(c0475a);
                break;
            case 10:
                m1124j(c0475a);
                break;
        }
        m1130q(c0475a);
        m1116a();
    }

    /* renamed from: n */
    public final void m1128n(C0475a c0475a, int i) throws IOException {
        ByteOrder byteOrderM1115o = m1115o(c0475a);
        this.f1148d = byteOrderM1115o;
        c0475a.f1116b = byteOrderM1115o;
        int unsignedShort = c0475a.readUnsignedShort();
        int i2 = this.f1146b;
        if (i2 != 7 && i2 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i3 = c0475a.readInt();
        if (i3 < 8 || i3 >= i) {
            throw new IOException(AbstractC0328E.m935e("Invalid first Ifd offset: ", i3));
        }
        int i4 = i3 - 8;
        if (i4 > 0 && c0475a.skipBytes(i4) != i4) {
            throw new IOException(AbstractC0328E.m935e("Couldn't jump to first Ifd: ", i4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010e  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1129p(C0475a c0475a, int i) throws IOException {
        HashMap[] mapArr;
        int i2;
        short s2;
        short s3;
        int i3;
        int i4;
        long j2;
        boolean z2;
        int i5;
        long j3;
        int i6;
        int i7;
        int i8;
        int unsignedShort;
        long j4;
        long j5;
        int i9 = i;
        int i10 = c0475a.f1118d + 2;
        int i11 = c0475a.f1117c;
        if (i10 > i11) {
            return;
        }
        short s4 = c0475a.readShort();
        if ((s4 * 12) + c0475a.f1118d > i11) {
            return;
        }
        short s5 = 0;
        while (true) {
            mapArr = this.f1147c;
            if (s5 >= s4) {
                break;
            }
            int unsignedShort2 = c0475a.readUnsignedShort();
            int unsignedShort3 = c0475a.readUnsignedShort();
            int i12 = c0475a.readInt();
            long j6 = c0475a.f1118d + 4;
            C0477c c0477c = (C0477c) f1139u[i9].get(Integer.valueOf(unsignedShort2));
            if (c0477c == null) {
                Log.w("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
                s2 = s4;
                s3 = s5;
                i3 = unsignedShort2;
                i4 = i11;
            } else {
                if (unsignedShort3 > 0) {
                    if (unsignedShort3 >= f1134p.length) {
                        s2 = s4;
                        s3 = s5;
                        i3 = unsignedShort2;
                        i4 = i11;
                        Log.w("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                    } else {
                        int i13 = c0477c.f1124c;
                        s2 = s4;
                        if (i13 == 7 || unsignedShort3 == 7 || i13 == unsignedShort3 || (i5 = c0477c.f1125d) == unsignedShort3) {
                            s3 = s5;
                        } else {
                            s3 = s5;
                            if (((i13 != 4 && i5 != 4) || unsignedShort3 != 3) && (((i13 != 9 && i5 != 9) || unsignedShort3 != 8) && ((i13 != 12 && i5 != 12) || unsignedShort3 != 11))) {
                                Log.w("ExifInterface", "Skip the tag entry since data format (" + f1133o[unsignedShort3] + ") is unexpected for tag: " + c0477c.f1123b);
                                i4 = i11;
                                i3 = unsignedShort2;
                            }
                        }
                        i4 = i11;
                        if (unsignedShort3 == 7) {
                            unsignedShort3 = i13;
                        }
                        i3 = unsignedShort2;
                        j2 = i12 * r9[unsignedShort3];
                        if (j2 < 0 || j2 > 2147483647L) {
                            Log.w("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i12);
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                    }
                }
                if (z2) {
                    c0475a.m1106f(j6);
                } else {
                    if (j2 > 4) {
                        int i14 = c0475a.readInt();
                        i6 = unsignedShort3;
                        int i15 = this.f1146b;
                        i8 = i3;
                        if (i15 == 7) {
                            if ("MakerNote".equals(c0477c.f1123b)) {
                                this.f1150f = i14;
                            } else if (i9 == 6 && "ThumbnailImage".equals(c0477c.f1123b)) {
                                this.f1151g = i14;
                                this.f1152h = i12;
                                C0476b c0476bM1109c = C0476b.m1109c(6, this.f1148d);
                                i7 = i12;
                                j5 = j6;
                                C0476b c0476bM1107a = C0476b.m1107a(this.f1151g, this.f1148d);
                                C0476b c0476bM1107a2 = C0476b.m1107a(this.f1152h, this.f1148d);
                                mapArr[4].put("Compression", c0476bM1109c);
                                mapArr[4].put("JPEGInterchangeFormat", c0476bM1107a);
                                mapArr[4].put("JPEGInterchangeFormatLength", c0476bM1107a2);
                            }
                            i7 = i12;
                            j5 = j6;
                        } else {
                            i7 = i12;
                            j5 = j6;
                            if (i15 == 10 && "JpgFromRaw".equals(c0477c.f1123b)) {
                                this.f1153i = i14;
                            }
                        }
                        long j7 = i14;
                        j3 = j2;
                        if (j7 + j2 <= i4) {
                            c0475a.m1106f(j7);
                            j6 = j5;
                        } else {
                            Log.w("ExifInterface", "Skip the tag entry since data offset is invalid: " + i14);
                            c0475a.m1106f(j5);
                        }
                    } else {
                        j3 = j2;
                        i6 = unsignedShort3;
                        i7 = i12;
                        i8 = i3;
                    }
                    Integer num = (Integer) f1142x.get(Integer.valueOf(i8));
                    if (num != null) {
                        int i16 = i6;
                        if (i16 != 3) {
                            if (i16 == 4) {
                                j4 = c0475a.readInt() & 4294967295L;
                            } else if (i16 == 8) {
                                unsignedShort = c0475a.readShort();
                            } else if (i16 == 9 || i16 == 13) {
                                unsignedShort = c0475a.readInt();
                            } else {
                                j4 = -1;
                            }
                            if (j4 > 0 || j4 >= i4) {
                                Log.w("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j4);
                            } else {
                                c0475a.m1106f(j4);
                                m1129p(c0475a, num.intValue());
                            }
                            c0475a.m1106f(j6);
                        } else {
                            unsignedShort = c0475a.readUnsignedShort();
                        }
                        j4 = unsignedShort;
                        if (j4 > 0) {
                            Log.w("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j4);
                            c0475a.m1106f(j6);
                        }
                    } else {
                        byte[] bArr = new byte[(int) j3];
                        c0475a.readFully(bArr);
                        C0476b c0476b = new C0476b(bArr, i6, i7);
                        mapArr[i].put(c0477c.f1123b, c0476b);
                        String str = c0477c.f1123b;
                        if ("DNGVersion".equals(str)) {
                            this.f1146b = 3;
                        }
                        if ((("Make".equals(str) || "Model".equals(str)) && c0476b.m1112f(this.f1148d).contains("PENTAX")) || ("Compression".equals(str) && c0476b.m1111e(this.f1148d) == 65535)) {
                            this.f1146b = 8;
                        }
                        if (c0475a.f1118d != j6) {
                            c0475a.m1106f(j6);
                        }
                    }
                }
                i11 = i4;
                s4 = s2;
                s5 = (short) (s3 + 1);
                i9 = i;
            }
            j2 = 0;
            z2 = false;
            if (z2) {
            }
            i11 = i4;
            s4 = s2;
            s5 = (short) (s3 + 1);
            i9 = i;
        }
        int i17 = i11;
        if (c0475a.f1118d + 4 > i17 || (i2 = c0475a.readInt()) <= 8 || i2 >= i17) {
            return;
        }
        c0475a.m1106f(i2);
        if (mapArr[4].isEmpty()) {
            m1129p(c0475a, 4);
        } else if (mapArr[5].isEmpty()) {
            m1129p(c0475a, 5);
        }
    }

    /* renamed from: q */
    public final void m1130q(C0475a c0475a) throws Throwable {
        C0476b c0476b;
        HashMap map = this.f1147c[4];
        C0476b c0476b2 = (C0476b) map.get("Compression");
        if (c0476b2 == null) {
            m1125k(c0475a, map);
            return;
        }
        int iM1111e = c0476b2.m1111e(this.f1148d);
        if (iM1111e != 1) {
            if (iM1111e == 6) {
                m1125k(c0475a, map);
                return;
            } else if (iM1111e != 7) {
                return;
            }
        }
        C0476b c0476b3 = (C0476b) map.get("BitsPerSample");
        if (c0476b3 != null) {
            int[] iArr = (int[]) c0476b3.m1113g(this.f1148d);
            int[] iArr2 = f1128j;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.f1146b != 3 || (c0476b = (C0476b) map.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int iM1111e2 = c0476b.m1111e(this.f1148d);
                if ((iM1111e2 != 1 || !Arrays.equals(iArr, f1129k)) && (iM1111e2 != 6 || !Arrays.equals(iArr, iArr2))) {
                    return;
                }
            }
            C0476b c0476b4 = (C0476b) map.get("StripOffsets");
            C0476b c0476b5 = (C0476b) map.get("StripByteCounts");
            if (c0476b4 == null || c0476b5 == null) {
                return;
            }
            long[] jArrM1114b = m1114b(c0476b4.m1113g(this.f1148d));
            long[] jArrM1114b2 = m1114b(c0476b5.m1113g(this.f1148d));
            if (jArrM1114b == null) {
                Log.w("ExifInterface", "stripOffsets should not be null.");
                return;
            }
            if (jArrM1114b2 == null) {
                Log.w("ExifInterface", "stripByteCounts should not be null.");
                return;
            }
            long j2 = 0;
            for (long j3 : jArrM1114b2) {
                j2 += j3;
            }
            byte[] bArr = new byte[(int) j2];
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < jArrM1114b.length; i3++) {
                int i4 = (int) jArrM1114b[i3];
                int i5 = (int) jArrM1114b2[i3];
                int i6 = i4 - i;
                c0475a.m1106f(i6);
                int i7 = i + i6;
                byte[] bArr2 = new byte[i5];
                c0475a.read(bArr2);
                i = i7 + i5;
                System.arraycopy(bArr2, 0, bArr, i2, i5);
                i2 += i5;
            }
        }
    }

    /* renamed from: r */
    public final void m1131r(int i, int i2) throws Throwable {
        HashMap[] mapArr = this.f1147c;
        if (mapArr[i].isEmpty() || mapArr[i2].isEmpty()) {
            return;
        }
        C0476b c0476b = (C0476b) mapArr[i].get("ImageLength");
        C0476b c0476b2 = (C0476b) mapArr[i].get("ImageWidth");
        C0476b c0476b3 = (C0476b) mapArr[i2].get("ImageLength");
        C0476b c0476b4 = (C0476b) mapArr[i2].get("ImageWidth");
        if (c0476b == null || c0476b2 == null || c0476b3 == null || c0476b4 == null) {
            return;
        }
        int iM1111e = c0476b.m1111e(this.f1148d);
        int iM1111e2 = c0476b2.m1111e(this.f1148d);
        int iM1111e3 = c0476b3.m1111e(this.f1148d);
        int iM1111e4 = c0476b4.m1111e(this.f1148d);
        if (iM1111e >= iM1111e3 || iM1111e2 >= iM1111e4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    /* renamed from: s */
    public final void m1132s(C0475a c0475a, int i) throws Throwable {
        C0476b c0476b;
        C0476b c0476bM1109c;
        C0476b c0476bM1109c2;
        HashMap[] mapArr = this.f1147c;
        C0476b c0476b2 = (C0476b) mapArr[i].get("DefaultCropSize");
        C0476b c0476b3 = (C0476b) mapArr[i].get("SensorTopBorder");
        C0476b c0476b4 = (C0476b) mapArr[i].get("SensorLeftBorder");
        C0476b c0476b5 = (C0476b) mapArr[i].get("SensorBottomBorder");
        C0476b c0476b6 = (C0476b) mapArr[i].get("SensorRightBorder");
        if (c0476b2 != null) {
            if (c0476b2.f1119a == 5) {
                C0478d[] c0478dArr = (C0478d[]) c0476b2.m1113g(this.f1148d);
                if (c0478dArr == null || c0478dArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c0478dArr));
                    return;
                }
                c0476bM1109c = C0476b.m1108b(c0478dArr[0], this.f1148d);
                c0476bM1109c2 = C0476b.m1108b(c0478dArr[1], this.f1148d);
            } else {
                int[] iArr = (int[]) c0476b2.m1113g(this.f1148d);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c0476bM1109c = C0476b.m1109c(iArr[0], this.f1148d);
                c0476bM1109c2 = C0476b.m1109c(iArr[1], this.f1148d);
            }
            mapArr[i].put("ImageWidth", c0476bM1109c);
            mapArr[i].put("ImageLength", c0476bM1109c2);
            return;
        }
        if (c0476b3 == null || c0476b4 == null || c0476b5 == null || c0476b6 == null) {
            C0476b c0476b7 = (C0476b) mapArr[i].get("ImageLength");
            C0476b c0476b8 = (C0476b) mapArr[i].get("ImageWidth");
            if ((c0476b7 == null || c0476b8 == null) && (c0476b = (C0476b) mapArr[i].get("JPEGInterchangeFormat")) != null) {
                m1119e(c0475a, c0476b.m1111e(this.f1148d), i);
                return;
            }
            return;
        }
        int iM1111e = c0476b3.m1111e(this.f1148d);
        int iM1111e2 = c0476b5.m1111e(this.f1148d);
        int iM1111e3 = c0476b6.m1111e(this.f1148d);
        int iM1111e4 = c0476b4.m1111e(this.f1148d);
        if (iM1111e2 <= iM1111e || iM1111e3 <= iM1111e4) {
            return;
        }
        C0476b c0476bM1109c3 = C0476b.m1109c(iM1111e2 - iM1111e, this.f1148d);
        C0476b c0476bM1109c4 = C0476b.m1109c(iM1111e3 - iM1111e4, this.f1148d);
        mapArr[i].put("ImageLength", c0476bM1109c3);
        mapArr[i].put("ImageWidth", c0476bM1109c4);
    }
}
