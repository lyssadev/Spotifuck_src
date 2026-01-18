package p067g1;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p070h1.AbstractC0869c;
import p098r1.C1265e;

/* renamed from: g1.u */
/* loaded from: classes.dex */
public final class C0810u {

    /* renamed from: i */
    public static final char[] f3021i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public final String f3022a;

    /* renamed from: b */
    public final String f3023b;

    /* renamed from: c */
    public final String f3024c;

    /* renamed from: d */
    public final String f3025d;

    /* renamed from: e */
    public final int f3026e;

    /* renamed from: f */
    public final List f3027f;

    /* renamed from: g */
    public final String f3028g;

    /* renamed from: h */
    public final String f3029h;

    public C0810u(C0809t c0809t) {
        this.f3022a = c0809t.f3013a;
        String str = c0809t.f3014b;
        this.f3023b = m2044h(str, 0, str.length(), false);
        String str2 = c0809t.f3015c;
        this.f3024c = m2044h(str2, 0, str2.length(), false);
        this.f3025d = c0809t.f3016d;
        int i = c0809t.f3017e;
        this.f3026e = i == -1 ? m2042b(c0809t.f3013a) : i;
        m2045i(c0809t.f3018f, false);
        ArrayList arrayList = c0809t.f3019g;
        this.f3027f = arrayList != null ? m2045i(arrayList, true) : null;
        String str3 = c0809t.f3020h;
        this.f3028g = str3 != null ? m2044h(str3, 0, str3.length(), false) : null;
        this.f3029h = c0809t.toString();
    }

    /* renamed from: a */
    public static String m2041a(String str, int i, int i2, String str2, boolean z2, boolean z3, boolean z4, boolean z5) {
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z5) || str2.indexOf(iCodePointAt) != -1 || ((iCodePointAt == 37 && (!z2 || (z3 && !m2046j(str, iCharCount, i2)))) || (iCodePointAt == 43 && z4)))) {
                C1265e c1265e = new C1265e();
                c1265e.m3012y(str, i, iCharCount);
                C1265e c1265e2 = null;
                while (iCharCount < i2) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z2 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z4) {
                            String str3 = z2 ? "+" : "%2B";
                            c1265e.m3012y(str3, 0, str3.length());
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= 128 && z5) || str2.indexOf(iCodePointAt2) != -1 || (iCodePointAt2 == 37 && (!z2 || (z3 && !m2046j(str, iCharCount, i2)))))) {
                            if (c1265e2 == null) {
                                c1265e2 = new C1265e();
                            }
                            c1265e2.m3013z(iCodePointAt2);
                            while (!c1265e2.m2994g()) {
                                byte bM2997j = c1265e2.m2997j();
                                c1265e.m3009v(37);
                                char[] cArr = f3021i;
                                c1265e.m3009v(cArr[((bM2997j & 255) >> 4) & 15]);
                                c1265e.m3009v(cArr[bM2997j & 15]);
                            }
                        } else {
                            c1265e.m3013z(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                }
                return c1265e.m3004q();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i, i2);
    }

    /* renamed from: b */
    public static int m2042b(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* renamed from: g */
    public static void m2043g(StringBuilder sb, List list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m2044h(String str, int i, int i2, boolean z2) {
        int i3;
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z2)) {
                C1265e c1265e = new C1265e();
                c1265e.m3012y(str, i, iCharCount);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i3 = iCharCount + 2) < i2) {
                        int iM2182e = AbstractC0869c.m2182e(str.charAt(iCharCount + 1));
                        int iM2182e2 = AbstractC0869c.m2182e(str.charAt(i3));
                        if (iM2182e != -1 && iM2182e2 != -1) {
                            c1265e.m3009v((iM2182e << 4) + iM2182e2);
                            iCharCount = i3;
                        }
                    } else if (iCodePointAt == 43 && z2) {
                        c1265e.m3009v(32);
                    } else {
                        c1265e.m3013z(iCodePointAt);
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
                return c1265e.m3004q();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }

    /* renamed from: i */
    public static List m2045i(ArrayList arrayList, boolean z2) {
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            arrayList2.add(str != null ? m2044h(str, 0, str.length(), z2) : null);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    /* renamed from: j */
    public static boolean m2046j(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && AbstractC0869c.m2182e(str.charAt(i + 1)) != -1 && AbstractC0869c.m2182e(str.charAt(i3)) != -1;
    }

    /* renamed from: k */
    public static ArrayList m2047k(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iIndexOf = str.indexOf(38, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i);
            if (iIndexOf2 == -1 || iIndexOf2 > iIndexOf) {
                arrayList.add(str.substring(i, iIndexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            }
            i = iIndexOf + 1;
        }
        return arrayList;
    }

    /* renamed from: c */
    public final String m2048c() {
        if (this.f3024c.isEmpty()) {
            return "";
        }
        int length = this.f3022a.length() + 3;
        String str = this.f3029h;
        return str.substring(str.indexOf(58, length) + 1, str.indexOf(64));
    }

    /* renamed from: d */
    public final ArrayList m2049d() {
        int length = this.f3022a.length() + 3;
        String str = this.f3029h;
        int iIndexOf = str.indexOf(47, length);
        int iM2185h = AbstractC0869c.m2185h(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iM2185h) {
            int i = iIndexOf + 1;
            int iM2184g = AbstractC0869c.m2184g(str, i, iM2185h, '/');
            arrayList.add(str.substring(i, iM2184g));
            iIndexOf = iM2184g;
        }
        return arrayList;
    }

    /* renamed from: e */
    public final String m2050e() {
        if (this.f3027f == null) {
            return null;
        }
        String str = this.f3029h;
        int iIndexOf = str.indexOf(63) + 1;
        return str.substring(iIndexOf, AbstractC0869c.m2184g(str, iIndexOf, str.length(), '#'));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0810u) && ((C0810u) obj).f3029h.equals(this.f3029h);
    }

    /* renamed from: f */
    public final String m2051f() {
        if (this.f3023b.isEmpty()) {
            return "";
        }
        int length = this.f3022a.length() + 3;
        String str = this.f3029h;
        return str.substring(length, AbstractC0869c.m2185h(str, length, str.length(), ":@"));
    }

    public final int hashCode() {
        return this.f3029h.hashCode();
    }

    /* renamed from: l */
    public final URI m2052l() {
        C0809t c0809t = new C0809t();
        String str = this.f3022a;
        c0809t.f3013a = str;
        c0809t.f3014b = m2051f();
        c0809t.f3015c = m2048c();
        c0809t.f3016d = this.f3025d;
        int iM2042b = m2042b(str);
        int i = this.f3026e;
        if (i == iM2042b) {
            i = -1;
        }
        c0809t.f3017e = i;
        ArrayList arrayList = c0809t.f3018f;
        arrayList.clear();
        arrayList.addAll(m2049d());
        String strM2050e = m2050e();
        String strSubstring = null;
        c0809t.f3019g = strM2050e != null ? m2047k(m2041a(strM2050e, 0, strM2050e.length(), " \"'<>#", true, false, true, true)) : null;
        if (this.f3028g != null) {
            String str2 = this.f3029h;
            strSubstring = str2.substring(str2.indexOf(35) + 1);
        }
        c0809t.f3020h = strSubstring;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str3 = (String) arrayList.get(i2);
            arrayList.set(i2, m2041a(str3, 0, str3.length(), "[]", true, true, false, true));
        }
        ArrayList arrayList2 = c0809t.f3019g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str4 = (String) c0809t.f3019g.get(i3);
                if (str4 != null) {
                    c0809t.f3019g.set(i3, m2041a(str4, 0, str4.length(), "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str5 = c0809t.f3020h;
        if (str5 != null) {
            c0809t.f3020h = m2041a(str5, 0, str5.length(), " \"#<>\\^`{|}", true, true, false, false);
        }
        String string = c0809t.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final String toString() {
        return this.f3029h;
    }
}
