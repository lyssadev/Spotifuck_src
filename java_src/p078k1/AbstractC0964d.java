package p078k1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import p067g1.C0785C;
import p067g1.C0791b;
import p067g1.C0806q;
import p067g1.C0808s;
import p067g1.C0810u;
import p070h1.AbstractC0869c;
import p089o1.C1226g;
import p092p1.C1234a;

/* renamed from: k1.d */
/* loaded from: classes.dex */
public abstract class AbstractC0964d {

    /* renamed from: a */
    public static final /* synthetic */ int f3924a = 0;

    static {
        Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");
    }

    /* renamed from: a */
    public static long m2455a(C0785C c0785c) {
        String strM2033a = c0785c.f2880f.m2033a("Content-Length");
        if (strM2033a == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strM2033a);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* renamed from: b */
    public static boolean m2456b(C0785C c0785c) {
        if (c0785c.f2875a.f2859b.equals("HEAD")) {
            return false;
        }
        int i = c0785c.f2877c;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && m2455a(c0785c) == -1 && !"chunked".equalsIgnoreCase(c0785c.m2006g("Transfer-Encoding"))) ? false : true;
    }

    /* renamed from: c */
    public static int m2457c(String str, int i) throws NumberFormatException {
        try {
            long j2 = Long.parseLong(str);
            if (j2 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j2 < 0) {
                return 0;
            }
            return (int) j2;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x030a A[LOOP:9: B:201:0x0307->B:203:0x030a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m2458d(C0791b c0791b, C0810u c0810u, C0808s c0808s) throws InterruptedException, NumberFormatException {
        List list;
        int i;
        C0806q c0806q;
        int i2;
        int i3;
        int i4;
        int i5;
        long j2;
        String strSubstring;
        String strM2930a;
        String strM2930a2;
        String strM2930a3;
        String[] strArrSplit;
        int i6;
        int length;
        int length2;
        int i7;
        String[] strArrSplit2;
        String string;
        String strSubstring2;
        if (c0791b == C0791b.f2912b) {
            return;
        }
        Pattern pattern = C0806q.f2995j;
        List listM2038f = c0808s.m2038f("Set-Cookie");
        int size = listM2038f.size();
        int i8 = 0;
        int i9 = 0;
        ArrayList arrayList = null;
        while (i9 < size) {
            String str = (String) listM2038f.get(i9);
            long jCurrentTimeMillis = System.currentTimeMillis();
            int length3 = str.length();
            int iM2184g = AbstractC0869c.m2184g(str, i8, length3, ';');
            int iM2184g2 = AbstractC0869c.m2184g(str, i8, iM2184g, '=');
            if (iM2184g2 == iM2184g) {
                list = listM2038f;
                i = size;
                c0806q = null;
            } else {
                int iM2194q = AbstractC0869c.m2194q(str, i8, iM2184g2);
                String strSubstring3 = str.substring(iM2194q, AbstractC0869c.m2195r(str, iM2194q, iM2184g2));
                if (!strSubstring3.isEmpty()) {
                    int length4 = strSubstring3.length();
                    int i10 = 0;
                    while (i10 < length4) {
                        char cCharAt = strSubstring3.charAt(i10);
                        if (cCharAt <= 31 || cCharAt >= 127) {
                            i2 = 1;
                            i3 = -1;
                            break;
                        }
                        i10++;
                    }
                    i2 = 1;
                    i3 = -1;
                    i10 = -1;
                    if (i10 != i3) {
                        list = listM2038f;
                    } else {
                        int iM2194q2 = AbstractC0869c.m2194q(str, iM2184g2 + i2, iM2184g);
                        String strSubstring4 = str.substring(iM2194q2, AbstractC0869c.m2195r(str, iM2194q2, iM2184g));
                        int length5 = strSubstring4.length();
                        for (int i11 = 0; i11 < length5; i11++) {
                            char cCharAt2 = strSubstring4.charAt(i11);
                            if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                                i4 = 1;
                                i5 = i11;
                                break;
                            }
                        }
                        i4 = 1;
                        i5 = -1;
                        if (i5 == -1) {
                            int i12 = iM2184g + i4;
                            long jM2031b = 253402300799999L;
                            String str2 = null;
                            String str3 = null;
                            long j3 = -1;
                            boolean z2 = false;
                            boolean z3 = false;
                            boolean z4 = true;
                            boolean z5 = false;
                            while (true) {
                                if (i12 < length3) {
                                    int iM2184g3 = AbstractC0869c.m2184g(str, i12, length3, ';');
                                    List list2 = listM2038f;
                                    int iM2184g4 = AbstractC0869c.m2184g(str, i12, iM2184g3, '=');
                                    int iM2194q3 = AbstractC0869c.m2194q(str, i12, iM2184g4);
                                    String strSubstring5 = str.substring(iM2194q3, AbstractC0869c.m2195r(str, iM2194q3, iM2184g4));
                                    if (iM2184g4 < iM2184g3) {
                                        int iM2194q4 = AbstractC0869c.m2194q(str, iM2184g4 + 1, iM2184g3);
                                        strSubstring2 = str.substring(iM2194q4, AbstractC0869c.m2195r(str, iM2194q4, iM2184g3));
                                    } else {
                                        strSubstring2 = "";
                                    }
                                    if (strSubstring5.equalsIgnoreCase("expires")) {
                                        try {
                                            jM2031b = C0806q.m2031b(strSubstring2, strSubstring2.length());
                                            z5 = true;
                                        } catch (NumberFormatException | IllegalArgumentException unused) {
                                        }
                                    } else if (strSubstring5.equalsIgnoreCase("max-age")) {
                                        try {
                                            long j4 = Long.parseLong(strSubstring2);
                                            j3 = j4 > 0 ? j4 : Long.MIN_VALUE;
                                        } catch (NumberFormatException e) {
                                            if (!strSubstring2.matches("-?\\d+")) {
                                                throw e;
                                            }
                                            j3 = strSubstring2.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
                                        }
                                        z5 = true;
                                    } else if (strSubstring5.equalsIgnoreCase("domain")) {
                                        if (strSubstring2.endsWith(".")) {
                                            throw new IllegalArgumentException();
                                        }
                                        if (strSubstring2.startsWith(".")) {
                                            strSubstring2 = strSubstring2.substring(1);
                                        }
                                        String strM2179b = AbstractC0869c.m2179b(strSubstring2);
                                        if (strM2179b == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        str2 = strM2179b;
                                        z4 = false;
                                    } else if (strSubstring5.equalsIgnoreCase("path")) {
                                        str3 = strSubstring2;
                                    } else if (strSubstring5.equalsIgnoreCase("secure")) {
                                        z2 = true;
                                    } else if (strSubstring5.equalsIgnoreCase("httponly")) {
                                        z3 = true;
                                    }
                                    i12 = iM2184g3 + 1;
                                    listM2038f = list2;
                                } else {
                                    list = listM2038f;
                                    if (j3 == Long.MIN_VALUE) {
                                        j2 = Long.MIN_VALUE;
                                    } else if (j3 != -1) {
                                        long j5 = jCurrentTimeMillis + (j3 <= 9223372036854775L ? j3 * 1000 : Long.MAX_VALUE);
                                        j2 = (j5 < jCurrentTimeMillis || j5 > 253402300799999L) ? 253402300799999L : j5;
                                    } else {
                                        j2 = jM2031b;
                                    }
                                    String str4 = c0810u.f3025d;
                                    if (str2 == null) {
                                        str2 = str4;
                                    } else if (!str4.equals(str2) && (!str4.endsWith(str2) || str4.charAt((str4.length() - str2.length()) - 1) != '.' || AbstractC0869c.f3368g.matcher(str4).matches())) {
                                    }
                                    if (str4.length() != str2.length()) {
                                        C1234a c1234a = C1234a.f4915h;
                                        c1234a.getClass();
                                        String[] strArrSplit3 = IDN.toUnicode(str2).split("\\.");
                                        if (c1234a.f4916a.get() || !c1234a.f4916a.compareAndSet(false, true)) {
                                            try {
                                                c1234a.f4917b.await();
                                            } catch (InterruptedException unused2) {
                                            }
                                        } else {
                                            boolean z6 = false;
                                            while (true) {
                                                try {
                                                    try {
                                                        c1234a.m2931b();
                                                        break;
                                                    } finally {
                                                        if (z6) {
                                                            Thread.currentThread().interrupt();
                                                        }
                                                    }
                                                } catch (InterruptedIOException unused3) {
                                                    z6 = true;
                                                } catch (IOException e2) {
                                                    C1226g.f4880a.mo2849k(5, "Failed to read public suffix list", e2);
                                                    if (z6) {
                                                    }
                                                }
                                            }
                                        }
                                        synchronized (c1234a) {
                                            if (c1234a.f4918c == null) {
                                                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
                                            }
                                        }
                                        int length6 = strArrSplit3.length;
                                        byte[][] bArr = new byte[length6][];
                                        for (int i13 = 0; i13 < strArrSplit3.length; i13++) {
                                            bArr[i13] = strArrSplit3[i13].getBytes(AbstractC0869c.f3365d);
                                        }
                                        int i14 = 0;
                                        while (true) {
                                            if (i14 >= length6) {
                                                strM2930a = null;
                                                break;
                                            }
                                            strM2930a = C1234a.m2930a(c1234a.f4918c, bArr, i14);
                                            if (strM2930a != null) {
                                                break;
                                            } else {
                                                i14++;
                                            }
                                        }
                                        if (length6 > 1) {
                                            byte[][] bArr2 = (byte[][]) bArr.clone();
                                            i = size;
                                            for (int i15 = 0; i15 < bArr2.length - 1; i15++) {
                                                bArr2[i15] = C1234a.f4912e;
                                                strM2930a2 = C1234a.m2930a(c1234a.f4918c, bArr2, i15);
                                                if (strM2930a2 != null) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            i = size;
                                        }
                                        strM2930a2 = null;
                                        if (strM2930a2 != null) {
                                            for (int i16 = 0; i16 < length6 - 1; i16++) {
                                                strM2930a3 = C1234a.m2930a(c1234a.f4919d, bArr, i16);
                                                if (strM2930a3 != null) {
                                                    break;
                                                }
                                            }
                                            strM2930a3 = null;
                                            if (strM2930a3 == null) {
                                                strArrSplit = "!".concat(strM2930a3).split("\\.");
                                            } else if (strM2930a == null && strM2930a2 == null) {
                                                strArrSplit = C1234a.f4914g;
                                            } else {
                                                strArrSplit = strM2930a != null ? strM2930a.split("\\.") : C1234a.f4913f;
                                                String[] strArrSplit4 = strM2930a2 != null ? strM2930a2.split("\\.") : C1234a.f4913f;
                                                if (strArrSplit.length <= strArrSplit4.length) {
                                                    strArrSplit = strArrSplit4;
                                                }
                                            }
                                            if (strArrSplit3.length != strArrSplit.length) {
                                                i6 = 0;
                                                if (strArrSplit[0].charAt(0) != '!') {
                                                    string = null;
                                                }
                                                if (string == null) {
                                                }
                                            } else {
                                                i6 = 0;
                                            }
                                            if (strArrSplit[i6].charAt(i6) != '!') {
                                                length = strArrSplit3.length;
                                                length2 = strArrSplit.length;
                                            } else {
                                                length = strArrSplit3.length;
                                                length2 = strArrSplit.length + 1;
                                            }
                                            StringBuilder sb = new StringBuilder();
                                            strArrSplit2 = str2.split("\\.");
                                            for (i7 = length - length2; i7 < strArrSplit2.length; i7++) {
                                                sb.append(strArrSplit2[i7]);
                                                sb.append('.');
                                            }
                                            sb.deleteCharAt(sb.length() - 1);
                                            string = sb.toString();
                                            if (string == null) {
                                            }
                                        } else {
                                            strM2930a3 = null;
                                            if (strM2930a3 == null) {
                                            }
                                            if (strArrSplit3.length != strArrSplit.length) {
                                            }
                                            if (strArrSplit[i6].charAt(i6) != '!') {
                                            }
                                            StringBuilder sb2 = new StringBuilder();
                                            strArrSplit2 = str2.split("\\.");
                                            while (i7 < strArrSplit2.length) {
                                            }
                                            sb2.deleteCharAt(sb2.length() - 1);
                                            string = sb2.toString();
                                            if (string == null) {
                                            }
                                        }
                                    } else {
                                        i = size;
                                    }
                                    if (str3 == null || !str3.startsWith("/")) {
                                        int length7 = c0810u.f3022a.length() + 3;
                                        String str5 = c0810u.f3029h;
                                        int iIndexOf = str5.indexOf(47, length7);
                                        String strSubstring6 = str5.substring(iIndexOf, AbstractC0869c.m2185h(str5, iIndexOf, str5.length(), "?#"));
                                        int iLastIndexOf = strSubstring6.lastIndexOf(47);
                                        strSubstring = iLastIndexOf != 0 ? strSubstring6.substring(0, iLastIndexOf) : "/";
                                    } else {
                                        strSubstring = str3;
                                    }
                                    c0806q = new C0806q(strSubstring3, strSubstring4, j2, str2, strSubstring, z2, z3, z4, z5);
                                }
                            }
                        }
                        c0806q = null;
                    }
                    i = size;
                    c0806q = null;
                }
            }
            if (c0806q != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c0806q);
            }
            i9++;
            i8 = 0;
            listM2038f = list;
            size = i;
        }
        if ((arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList()).isEmpty()) {
            return;
        }
        c0791b.getClass();
    }

    /* renamed from: e */
    public static int m2459e(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* renamed from: f */
    public static Set m2460f(C0808s c0808s) {
        Set setEmptySet = Collections.emptySet();
        int iM2036d = c0808s.m2036d();
        for (int i = 0; i < iM2036d; i++) {
            if ("Vary".equalsIgnoreCase(c0808s.m2034b(i))) {
                String strM2037e = c0808s.m2037e(i);
                if (setEmptySet.isEmpty()) {
                    setEmptySet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : strM2037e.split(",")) {
                    setEmptySet.add(str.trim());
                }
            }
        }
        return setEmptySet;
    }
}
