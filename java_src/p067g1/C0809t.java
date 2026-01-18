package p067g1;

import java.util.ArrayList;
import p070h1.AbstractC0869c;

/* renamed from: g1.t */
/* loaded from: classes.dex */
public final class C0809t {

    /* renamed from: a */
    public String f3013a;

    /* renamed from: d */
    public String f3016d;

    /* renamed from: f */
    public final ArrayList f3018f;

    /* renamed from: g */
    public ArrayList f3019g;

    /* renamed from: h */
    public String f3020h;

    /* renamed from: b */
    public String f3014b = "";

    /* renamed from: c */
    public String f3015c = "";

    /* renamed from: e */
    public int f3017e = -1;

    public C0809t() {
        ArrayList arrayList = new ArrayList();
        this.f3018f = arrayList;
        arrayList.add("");
    }

    /* renamed from: a */
    public final C0810u m2039a() {
        if (this.f3013a == null) {
            throw new IllegalStateException("scheme == null");
        }
        if (this.f3016d != null) {
            return new C0810u(this);
        }
        throw new IllegalStateException("host == null");
    }

    /* renamed from: b */
    public final int m2040b(C0810u c0810u, String str) throws NumberFormatException {
        char cCharAt;
        int i;
        char c2;
        char c3;
        int iM2185h;
        ArrayList arrayList;
        int i2;
        ArrayList arrayList2;
        int i3;
        char c4;
        ArrayList arrayList3;
        char cCharAt2;
        int iM2194q = AbstractC0869c.m2194q(str, 0, str.length());
        int iM2195r = AbstractC0869c.m2195r(str, iM2194q, str.length());
        char c5 = 65535;
        if (iM2195r - iM2194q >= 2 && (((cCharAt = str.charAt(iM2194q)) >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
            i = iM2194q + 1;
            while (true) {
                if (i >= iM2195r) {
                    break;
                }
                char cCharAt3 = str.charAt(i);
                if ((cCharAt3 >= 'a' && cCharAt3 <= 'z') || ((cCharAt3 >= 'A' && cCharAt3 <= 'Z') || ((cCharAt3 >= '0' && cCharAt3 <= '9') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                    i++;
                } else if (cCharAt3 != ':') {
                    break;
                }
            }
        } else {
            i = -1;
        }
        if (i != -1) {
            if (str.regionMatches(true, iM2194q, "https:", 0, 6)) {
                this.f3013a = "https";
                iM2194q += 6;
            } else {
                if (!str.regionMatches(true, iM2194q, "http:", 0, 5)) {
                    return 3;
                }
                this.f3013a = "http";
                iM2194q += 5;
            }
        } else {
            if (c0810u == null) {
                return 2;
            }
            this.f3013a = c0810u.f3022a;
        }
        int i4 = iM2194q;
        int i5 = 0;
        while (true) {
            c2 = '/';
            c3 = '\\';
            if (i4 >= iM2195r || !((cCharAt2 = str.charAt(i4)) == '\\' || cCharAt2 == '/')) {
                break;
            }
            i5++;
            i4++;
        }
        ArrayList arrayList4 = this.f3018f;
        char c6 = '?';
        char c7 = '#';
        if (i5 >= 2 || c0810u == null || !c0810u.f3022a.equals(this.f3013a)) {
            int i6 = iM2194q + i5;
            boolean z2 = false;
            boolean z3 = false;
            while (true) {
                iM2185h = AbstractC0869c.m2185h(str, i6, iM2195r, "@/\\?#");
                char cCharAt4 = iM2185h != iM2195r ? str.charAt(iM2185h) : (char) 65535;
                if (cCharAt4 == c5 || cCharAt4 == c7 || cCharAt4 == c2 || cCharAt4 == c3 || cCharAt4 == c6) {
                    break;
                }
                if (cCharAt4 != '@') {
                    arrayList2 = arrayList4;
                } else {
                    if (z2) {
                        arrayList2 = arrayList4;
                        i3 = iM2185h;
                        this.f3015c += "%40" + C0810u.m2041a(str, i6, i3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                    } else {
                        int iM2184g = AbstractC0869c.m2184g(str, i6, iM2185h, ':');
                        arrayList2 = arrayList4;
                        i3 = iM2185h;
                        String strM2041a = C0810u.m2041a(str, i6, iM2184g, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                        if (z3) {
                            strM2041a = this.f3014b + "%40" + strM2041a;
                        }
                        this.f3014b = strM2041a;
                        if (iM2184g != i3) {
                            this.f3015c = C0810u.m2041a(str, iM2184g + 1, i3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                            z2 = true;
                        }
                        z3 = true;
                    }
                    i6 = i3 + 1;
                }
                arrayList4 = arrayList2;
                c7 = '#';
                c6 = '?';
                c3 = '\\';
                c5 = 65535;
                c2 = '/';
            }
            arrayList = arrayList4;
            int i7 = i6;
            while (true) {
                if (i7 < iM2185h) {
                    char cCharAt5 = str.charAt(i7);
                    if (cCharAt5 == ':') {
                        break;
                    }
                    if (cCharAt5 == '[') {
                        do {
                            i7++;
                            if (i7 < iM2185h) {
                            }
                        } while (str.charAt(i7) != ']');
                    }
                    i7++;
                } else {
                    i7 = iM2185h;
                    break;
                }
            }
            int i8 = i7 + 1;
            if (i8 < iM2185h) {
                this.f3016d = AbstractC0869c.m2179b(C0810u.m2044h(str, i6, i7, false));
                try {
                    i2 = Integer.parseInt(C0810u.m2041a(str, i8, iM2185h, "", false, false, false, true));
                } catch (NumberFormatException unused) {
                }
                if (i2 <= 0 || i2 > 65535) {
                    i2 = -1;
                }
                this.f3017e = i2;
                if (i2 == -1) {
                    return 4;
                }
            } else {
                this.f3016d = AbstractC0869c.m2179b(C0810u.m2044h(str, i6, i7, false));
                this.f3017e = C0810u.m2042b(this.f3013a);
            }
            if (this.f3016d == null) {
                return 5;
            }
            iM2194q = iM2185h;
        } else {
            this.f3014b = c0810u.m2051f();
            this.f3015c = c0810u.m2048c();
            this.f3016d = c0810u.f3025d;
            this.f3017e = c0810u.f3026e;
            arrayList4.clear();
            arrayList4.addAll(c0810u.m2049d());
            if (iM2194q == iM2195r || str.charAt(iM2194q) == '#') {
                String strM2050e = c0810u.m2050e();
                this.f3019g = strM2050e != null ? C0810u.m2047k(C0810u.m2041a(strM2050e, 0, strM2050e.length(), " \"'<>#", true, false, true, true)) : null;
            }
            arrayList = arrayList4;
        }
        int iM2185h2 = AbstractC0869c.m2185h(str, iM2194q, iM2195r, "?#");
        if (iM2194q != iM2185h2) {
            char cCharAt6 = str.charAt(iM2194q);
            if (cCharAt6 == '/' || cCharAt6 == '\\') {
                arrayList3 = arrayList;
                arrayList3.clear();
                arrayList3.add("");
                iM2194q++;
            } else {
                arrayList3 = arrayList;
                arrayList3.set(arrayList.size() - 1, "");
            }
            int i9 = iM2194q;
            while (i9 < iM2185h2) {
                int iM2185h3 = AbstractC0869c.m2185h(str, i9, iM2185h2, "/\\");
                boolean z4 = iM2185h3 < iM2185h2;
                String strM2041a2 = C0810u.m2041a(str, i9, iM2185h3, " \"<>^`{}|/\\?#", true, false, false, true);
                if (!strM2041a2.equals(".") && !strM2041a2.equalsIgnoreCase("%2e")) {
                    if (!strM2041a2.equals("..") && !strM2041a2.equalsIgnoreCase("%2e.") && !strM2041a2.equalsIgnoreCase(".%2e") && !strM2041a2.equalsIgnoreCase("%2e%2e")) {
                        if (((String) arrayList3.get(arrayList3.size() - 1)).isEmpty()) {
                            arrayList3.set(arrayList3.size() - 1, strM2041a2);
                        } else {
                            arrayList3.add(strM2041a2);
                        }
                        if (z4) {
                            arrayList3.add("");
                        }
                    } else if (!((String) arrayList3.remove(arrayList3.size() - 1)).isEmpty() || arrayList3.isEmpty()) {
                        arrayList3.add("");
                    } else {
                        arrayList3.set(arrayList3.size() - 1, "");
                    }
                }
                if (z4) {
                    iM2185h3++;
                }
                i9 = iM2185h3;
            }
        }
        if (iM2185h2 >= iM2195r || str.charAt(iM2185h2) != '?') {
            c4 = '#';
        } else {
            c4 = '#';
            int iM2184g2 = AbstractC0869c.m2184g(str, iM2185h2, iM2195r, '#');
            this.f3019g = C0810u.m2047k(C0810u.m2041a(str, iM2185h2 + 1, iM2184g2, " \"'<>#", true, false, true, true));
            iM2185h2 = iM2184g2;
        }
        if (iM2185h2 < iM2195r && str.charAt(iM2185h2) == c4) {
            this.f3020h = C0810u.m2041a(str, iM2185h2 + 1, iM2195r, "", true, false, false, false);
        }
        return 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3013a);
        sb.append("://");
        if (!this.f3014b.isEmpty() || !this.f3015c.isEmpty()) {
            sb.append(this.f3014b);
            if (!this.f3015c.isEmpty()) {
                sb.append(':');
                sb.append(this.f3015c);
            }
            sb.append('@');
        }
        if (this.f3016d.indexOf(58) != -1) {
            sb.append('[');
            sb.append(this.f3016d);
            sb.append(']');
        } else {
            sb.append(this.f3016d);
        }
        int iM2042b = this.f3017e;
        if (iM2042b == -1) {
            iM2042b = C0810u.m2042b(this.f3013a);
        }
        if (iM2042b != C0810u.m2042b(this.f3013a)) {
            sb.append(':');
            sb.append(iM2042b);
        }
        ArrayList arrayList = this.f3018f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append((String) arrayList.get(i));
        }
        if (this.f3019g != null) {
            sb.append('?');
            C0810u.m2043g(sb, this.f3019g);
        }
        if (this.f3020h != null) {
            sb.append('#');
            sb.append(this.f3020h);
        }
        return sb.toString();
    }
}
