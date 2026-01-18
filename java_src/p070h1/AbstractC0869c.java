package p070h1;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p000A.C0009j;
import p030Q0.AbstractC0328E;
import p067g1.C0786D;
import p067g1.C0810u;
import p098r1.C1265e;
import p098r1.C1268h;
import p098r1.InterfaceC1282v;

/* renamed from: h1.c */
/* loaded from: classes.dex */
public abstract class AbstractC0869c {

    /* renamed from: a */
    public static final byte[] f3362a;

    /* renamed from: b */
    public static final String[] f3363b = new String[0];

    /* renamed from: c */
    public static final C0786D f3364c;

    /* renamed from: d */
    public static final Charset f3365d;

    /* renamed from: e */
    public static final TimeZone f3366e;

    /* renamed from: f */
    public static final C0009j f3367f;

    /* renamed from: g */
    public static final Pattern f3368g;

    static {
        byte[] bArr = new byte[0];
        f3362a = bArr;
        C1265e c1265e = new C1265e();
        c1265e.m3008u(bArr, 0);
        long j2 = 0;
        f3364c = new C0786D(j2, c1265e, 0);
        if (j2 < 0 || j2 > j2 || 0 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        C1268h.m3015c("efbbbf");
        C1268h.m3015c("feff");
        C1268h.m3015c("fffe");
        C1268h.m3015c("0000ffff");
        C1268h.m3015c("ffff0000");
        f3365d = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("UTF-32BE");
        Charset.forName("UTF-32LE");
        f3366e = TimeZone.getTimeZone("GMT");
        f3367f = new C0009j(2);
        f3368g = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    /* renamed from: a */
    public static AssertionError m2178a(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    /* renamed from: b */
    public static String m2179b(String str) {
        int i = -1;
        if (!str.contains(":")) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                while (i < lowerCase.length()) {
                    char cCharAt = lowerCase.charAt(i);
                    i = (cCharAt > 31 && cCharAt < 127 && " #%/:?@[\\]".indexOf(cCharAt) == -1) ? i + 1 : 0;
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressM2183f = (str.startsWith("[") && str.endsWith("]")) ? m2183f(str, 1, str.length() - 1) : m2183f(str, 0, str.length());
        if (inetAddressM2183f == null) {
            return null;
        }
        byte[] address = inetAddressM2183f.getAddress();
        if (address.length != 16) {
            throw new AssertionError(AbstractC0328E.m937g("Invalid IPv6 address: '", str, "'"));
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < address.length) {
            int i4 = i2;
            while (i4 < 16 && address[i4] == 0 && address[i4 + 1] == 0) {
                i4 += 2;
            }
            int i5 = i4 - i2;
            if (i5 > i3 && i5 >= 4) {
                i = i2;
                i3 = i5;
            }
            i2 = i4 + 2;
        }
        C1265e c1265e = new C1265e();
        while (i < address.length) {
            if (i == i) {
                c1265e.m3009v(58);
                i += i3;
                if (i == 16) {
                    c1265e.m3009v(58);
                }
            } else {
                if (i > 0) {
                    c1265e.m3009v(58);
                }
                c1265e.m3011x(((address[i] & 255) << 8) | (address[i + 1] & 255));
                i += 2;
            }
        }
        return c1265e.m3004q();
    }

    /* renamed from: c */
    public static void m2180c(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static void m2181d(Socket socket) throws IOException {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m2191n(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    public static int m2182e(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        if (c2 < 'A' || c2 > 'F') {
            return -1;
        }
        return c2 - '7';
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00cd, code lost:
    
        if (r7 == 16) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00cf, code lost:
    
        if (r8 != (-1)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d1, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d2, code lost:
    
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e4, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ea, code lost:
    
        throw new java.lang.AssertionError();
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088 A[LOOP:2: B:25:0x004e->B:50:0x0088, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0097 A[EDGE_INSN: B:90:0x0097->B:53:0x0097 BREAK  A[LOOP:2: B:25:0x004e->B:50:0x0088], SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InetAddress m2183f(String str, int i, int i2) {
        int i3;
        int i4;
        int i5 = 16;
        byte[] bArr = new byte[16];
        int i6 = 0;
        int i7 = i;
        int i8 = 0;
        int i9 = -1;
        int i10 = -1;
        while (true) {
            if (i7 < i2) {
                if (i8 != i5) {
                    int i11 = i7 + 2;
                    if (i11 <= i2 && str.regionMatches(i7, "::", i6, 2)) {
                        if (i9 == -1) {
                            i8 += 2;
                            i9 = i8;
                            if (i11 != i2) {
                                i10 = i11;
                                i7 = i10;
                                int i12 = 0;
                                while (i7 < i2) {
                                }
                                i4 = i7 - i10;
                                if (i4 == 0) {
                                    break;
                                }
                                break;
                                break;
                            }
                            break;
                        }
                        return null;
                    }
                    if (i8 != 0) {
                        if (!str.regionMatches(i7, ":", i6, 1)) {
                            if (!str.regionMatches(i7, ".", i6, 1)) {
                                return null;
                            }
                            int i13 = i8 - 2;
                            int i14 = i13;
                            loop2: while (true) {
                                if (i10 < i2) {
                                    if (i14 == i5) {
                                        break;
                                    }
                                    if (i14 == i13) {
                                        i3 = i10;
                                        int i15 = 0;
                                        while (i3 < i2) {
                                            char cCharAt = str.charAt(i3);
                                            if (cCharAt >= '0' && cCharAt <= '9') {
                                                if ((i15 == 0 && i10 != i3) || (i15 = ((i15 * 10) + cCharAt) - 48) > 255) {
                                                    break loop2;
                                                }
                                                i3++;
                                            } else {
                                                break;
                                            }
                                        }
                                        if (i3 - i10 != 0) {
                                            break;
                                        }
                                        bArr[i14] = (byte) i15;
                                        i14++;
                                        i10 = i3;
                                        i5 = 16;
                                    } else {
                                        if (str.charAt(i10) != '.') {
                                            break;
                                        }
                                        i10++;
                                        i3 = i10;
                                        int i152 = 0;
                                        while (i3 < i2) {
                                        }
                                        if (i3 - i10 != 0) {
                                        }
                                    }
                                } else if (i14 == i8 + 2) {
                                    i8 += 2;
                                }
                            }
                            return null;
                        }
                        i7++;
                    }
                    i10 = i7;
                    i7 = i10;
                    int i122 = 0;
                    while (i7 < i2) {
                        int iM2182e = m2182e(str.charAt(i7));
                        if (iM2182e == -1) {
                            break;
                        }
                        i122 = (i122 << 4) + iM2182e;
                        i7++;
                    }
                    i4 = i7 - i10;
                    if (i4 == 0 || i4 > 4) {
                        break;
                    }
                    int i16 = i8 + 1;
                    bArr[i8] = (byte) ((i122 >>> 8) & 255);
                    i8 += 2;
                    bArr[i16] = (byte) (i122 & 255);
                    i5 = 16;
                    i6 = 0;
                } else {
                    return null;
                }
            } else {
                break;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static int m2184g(String str, int i, int i2, char c2) {
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: h */
    public static int m2185h(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: i */
    public static boolean m2186i(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: j */
    public static String m2187j(C0810u c0810u, boolean z2) {
        boolean zContains = c0810u.f3025d.contains(":");
        String strM937g = c0810u.f3025d;
        if (zContains) {
            strM937g = AbstractC0328E.m937g("[", strM937g, "]");
        }
        int i = c0810u.f3026e;
        if (!z2 && i == C0810u.m2042b(c0810u.f3022a)) {
            return strM937g;
        }
        return strM937g + ":" + i;
    }

    /* renamed from: k */
    public static List m2188k(List list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: l */
    public static List m2189l(Object... objArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    /* renamed from: m */
    public static String[] m2190m(Comparator comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: n */
    public static boolean m2191n(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: o */
    public static boolean m2192o(Comparator comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: p */
    public static boolean m2193p(InterfaceC1282v interfaceC1282v, int i, TimeUnit timeUnit) {
        long jNanoTime = System.nanoTime();
        long jMo3032c = interfaceC1282v.mo2196a().mo3034e() ? interfaceC1282v.mo2196a().mo3032c() - jNanoTime : Long.MAX_VALUE;
        interfaceC1282v.mo2196a().mo3033d(Math.min(jMo3032c, timeUnit.toNanos(i)) + jNanoTime);
        try {
            C1265e c1265e = new C1265e();
            while (interfaceC1282v.mo2197e(c1265e, 8192L) != -1) {
                try {
                    c1265e.m3006s(c1265e.f5044b);
                } catch (EOFException e) {
                    throw new AssertionError(e);
                }
            }
            if (jMo3032c == Long.MAX_VALUE) {
                interfaceC1282v.mo2196a().mo3030a();
                return true;
            }
            interfaceC1282v.mo2196a().mo3033d(jNanoTime + jMo3032c);
            return true;
        } catch (InterruptedIOException unused) {
            if (jMo3032c == Long.MAX_VALUE) {
                interfaceC1282v.mo2196a().mo3030a();
                return false;
            }
            interfaceC1282v.mo2196a().mo3033d(jNanoTime + jMo3032c);
            return false;
        } catch (Throwable th) {
            if (jMo3032c == Long.MAX_VALUE) {
                interfaceC1282v.mo2196a().mo3030a();
            } else {
                interfaceC1282v.mo2196a().mo3033d(jNanoTime + jMo3032c);
            }
            throw th;
        }
    }

    /* renamed from: q */
    public static int m2194q(String str, int i, int i2) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: r */
    public static int m2195r(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }
}
