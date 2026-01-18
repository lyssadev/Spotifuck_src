package p067g1;

import java.util.concurrent.TimeUnit;
import p078k1.AbstractC0964d;

/* renamed from: g1.j */
/* loaded from: classes.dex */
public final class C0799j {

    /* renamed from: n */
    public static final C0799j f2945n;

    /* renamed from: a */
    public final boolean f2946a;

    /* renamed from: b */
    public final boolean f2947b;

    /* renamed from: c */
    public final int f2948c;

    /* renamed from: d */
    public final int f2949d;

    /* renamed from: e */
    public final boolean f2950e;

    /* renamed from: f */
    public final boolean f2951f;

    /* renamed from: g */
    public final boolean f2952g;

    /* renamed from: h */
    public final int f2953h;

    /* renamed from: i */
    public final int f2954i;

    /* renamed from: j */
    public final boolean f2955j;

    /* renamed from: k */
    public final boolean f2956k;

    /* renamed from: l */
    public final boolean f2957l;

    /* renamed from: m */
    public String f2958m;

    static {
        C0798i c0798i = new C0798i();
        c0798i.f2942b = true;
        new C0799j(c0798i);
        C0798i c0798i2 = new C0798i();
        c0798i2.f2944d = true;
        long seconds = TimeUnit.SECONDS.toSeconds(Integer.MAX_VALUE);
        c0798i2.f2941a = seconds <= 2147483647L ? (int) seconds : Integer.MAX_VALUE;
        f2945n = new C0799j(c0798i2);
    }

    public C0799j(boolean z2, boolean z3, int i, int i2, boolean z4, boolean z5, boolean z6, int i3, int i4, boolean z7, boolean z8, boolean z9, String str) {
        this.f2946a = z2;
        this.f2947b = z3;
        this.f2948c = i;
        this.f2949d = i2;
        this.f2950e = z4;
        this.f2951f = z5;
        this.f2952g = z6;
        this.f2953h = i3;
        this.f2954i = i4;
        this.f2955j = z7;
        this.f2956k = z8;
        this.f2957l = z9;
        this.f2958m = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0799j m2020a(C0808s c0808s) {
        int i;
        int iM2459e;
        String strTrim;
        char cCharAt;
        C0808s c0808s2 = c0808s;
        int iM2036d = c0808s.m2036d();
        int i2 = 0;
        boolean z2 = true;
        String str = null;
        boolean z3 = false;
        boolean z4 = false;
        int iM2457c = -1;
        int iM2457c2 = -1;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int iM2457c3 = -1;
        int iM2457c4 = -1;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (i2 < iM2036d) {
            String strM2034b = c0808s2.m2034b(i2);
            String strM2037e = c0808s2.m2037e(i2);
            if (strM2034b.equalsIgnoreCase("Cache-Control")) {
                if (str == null) {
                    str = strM2037e;
                }
                for (i = 0; i < strM2037e.length(); i = iM2459e) {
                    int iM2459e2 = AbstractC0964d.m2459e(strM2037e, i, "=,;");
                    String strTrim2 = strM2037e.substring(i, iM2459e2).trim();
                    if (iM2459e2 == strM2037e.length() || strM2037e.charAt(iM2459e2) == ',' || strM2037e.charAt(iM2459e2) == ';') {
                        iM2459e = iM2459e2 + 1;
                        strTrim = null;
                    } else {
                        while (true) {
                            iM2459e2++;
                            if (iM2459e2 >= strM2037e.length() || ((cCharAt = strM2037e.charAt(iM2459e2)) != ' ' && cCharAt != '\t')) {
                                break;
                            }
                        }
                        if (iM2459e2 >= strM2037e.length() || strM2037e.charAt(iM2459e2) != '\"') {
                            iM2459e = AbstractC0964d.m2459e(strM2037e, iM2459e2, ",;");
                            strTrim = strM2037e.substring(iM2459e2, iM2459e).trim();
                        } else {
                            int i3 = iM2459e2 + 1;
                            int iM2459e3 = AbstractC0964d.m2459e(strM2037e, i3, "\"");
                            strTrim = strM2037e.substring(i3, iM2459e3);
                            iM2459e = iM2459e3 + 1;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(strTrim2)) {
                        z3 = true;
                    } else if ("no-store".equalsIgnoreCase(strTrim2)) {
                        z4 = true;
                    } else if ("max-age".equalsIgnoreCase(strTrim2)) {
                        iM2457c = AbstractC0964d.m2457c(strTrim, -1);
                    } else if ("s-maxage".equalsIgnoreCase(strTrim2)) {
                        iM2457c2 = AbstractC0964d.m2457c(strTrim, -1);
                    } else if ("private".equalsIgnoreCase(strTrim2)) {
                        z5 = true;
                    } else if ("public".equalsIgnoreCase(strTrim2)) {
                        z6 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(strTrim2)) {
                        z7 = true;
                    } else if ("max-stale".equalsIgnoreCase(strTrim2)) {
                        iM2457c3 = AbstractC0964d.m2457c(strTrim, Integer.MAX_VALUE);
                    } else if ("min-fresh".equalsIgnoreCase(strTrim2)) {
                        iM2457c4 = AbstractC0964d.m2457c(strTrim, -1);
                    } else if ("only-if-cached".equalsIgnoreCase(strTrim2)) {
                        z8 = true;
                    } else if ("no-transform".equalsIgnoreCase(strTrim2)) {
                        z9 = true;
                    } else if ("immutable".equalsIgnoreCase(strTrim2)) {
                        z10 = true;
                    }
                }
                i2++;
                c0808s2 = c0808s;
            } else if (!strM2034b.equalsIgnoreCase("Pragma")) {
                i2++;
                c0808s2 = c0808s;
            }
            z2 = false;
            while (i < strM2037e.length()) {
            }
            i2++;
            c0808s2 = c0808s;
        }
        return new C0799j(z3, z4, iM2457c, iM2457c2, z5, z6, z7, iM2457c3, iM2457c4, z8, z9, z10, !z2 ? null : str);
    }

    public final String toString() {
        String string = this.f2958m;
        if (string == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f2946a) {
                sb.append("no-cache, ");
            }
            if (this.f2947b) {
                sb.append("no-store, ");
            }
            int i = this.f2948c;
            if (i != -1) {
                sb.append("max-age=");
                sb.append(i);
                sb.append(", ");
            }
            int i2 = this.f2949d;
            if (i2 != -1) {
                sb.append("s-maxage=");
                sb.append(i2);
                sb.append(", ");
            }
            if (this.f2950e) {
                sb.append("private, ");
            }
            if (this.f2951f) {
                sb.append("public, ");
            }
            if (this.f2952g) {
                sb.append("must-revalidate, ");
            }
            int i3 = this.f2953h;
            if (i3 != -1) {
                sb.append("max-stale=");
                sb.append(i3);
                sb.append(", ");
            }
            int i4 = this.f2954i;
            if (i4 != -1) {
                sb.append("min-fresh=");
                sb.append(i4);
                sb.append(", ");
            }
            if (this.f2955j) {
                sb.append("only-if-cached, ");
            }
            if (this.f2956k) {
                sb.append("no-transform, ");
            }
            if (this.f2957l) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                string = "";
            } else {
                sb.delete(sb.length() - 2, sb.length());
                string = sb.toString();
            }
            this.f2958m = string;
        }
        return string;
    }

    public C0799j(C0798i c0798i) {
        this.f2946a = c0798i.f2942b;
        this.f2947b = c0798i.f2943c;
        this.f2948c = -1;
        this.f2949d = -1;
        this.f2950e = false;
        this.f2951f = false;
        this.f2952g = false;
        this.f2953h = c0798i.f2941a;
        this.f2954i = -1;
        this.f2955j = c0798i.f2944d;
        this.f2956k = false;
        this.f2957l = false;
    }
}
