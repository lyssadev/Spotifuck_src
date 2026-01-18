package p083m1;

import java.io.IOException;
import java.util.Locale;
import p070h1.AbstractC0869c;
import p098r1.C1268h;

/* renamed from: m1.f */
/* loaded from: classes.dex */
public abstract class AbstractC0999f {

    /* renamed from: a */
    public static final C1268h f4070a = C1268h.m3017f("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    public static final String[] f4071b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c */
    public static final String[] f4072c = new String[64];

    /* renamed from: d */
    public static final String[] f4073d = new String[256];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f4073d;
            if (i2 >= strArr.length) {
                break;
            }
            Object[] objArr = {Integer.toBinaryString(i2)};
            byte[] bArr = AbstractC0869c.f3362a;
            strArr[i2] = String.format(Locale.US, "%8s", objArr).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f4072c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i3 = iArr[0];
        strArr2[i3 | 8] = strArr2[i3] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            int i6 = iArr[0];
            String[] strArr3 = f4072c;
            int i7 = i6 | i5;
            strArr3[i7] = strArr3[i6] + '|' + strArr3[i5];
            strArr3[i7 | 8] = strArr3[i6] + '|' + strArr3[i5] + "|PADDED";
        }
        while (true) {
            String[] strArr4 = f4072c;
            if (i >= strArr4.length) {
                return;
            }
            if (strArr4[i] == null) {
                strArr4[i] = f4073d[i];
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m2495a(boolean z2, int i, int i2, byte b2, byte b3) {
        String str;
        String strReplace;
        String[] strArr = f4071b;
        if (b2 < strArr.length) {
            str = strArr[b2];
        } else {
            Object[] objArr = {Byte.valueOf(b2)};
            byte[] bArr = AbstractC0869c.f3362a;
            str = String.format(Locale.US, "0x%02x", objArr);
        }
        if (b3 == 0) {
            strReplace = "";
        } else {
            String[] strArr2 = f4073d;
            if (b2 == 2 || b2 == 3) {
                strReplace = strArr2[b3];
            } else if (b2 == 4 || b2 == 6) {
                strReplace = b3 == 1 ? "ACK" : strArr2[b3];
            } else if (b2 != 7 && b2 != 8) {
                String[] strArr3 = f4072c;
                String str2 = b3 < strArr3.length ? strArr3[b3] : strArr2[b3];
                strReplace = (b2 != 5 || (b3 & 4) == 0) ? (b2 != 0 || (b3 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED") : str2.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        Object[] objArr2 = {z2 ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), str, strReplace};
        byte[] bArr2 = AbstractC0869c.f3362a;
        return String.format(Locale.US, "%s 0x%08x %5d %-13s %s", objArr2);
    }

    /* renamed from: b */
    public static void m2496b(String str, Object... objArr) {
        byte[] bArr = AbstractC0869c.f3362a;
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    /* renamed from: c */
    public static void m2497c(String str, Object... objArr) throws IOException {
        byte[] bArr = AbstractC0869c.f3362a;
        throw new IOException(String.format(Locale.US, str, objArr));
    }
}
