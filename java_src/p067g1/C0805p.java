package p067g1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.net.ssl.SSLSocket;
import p070h1.AbstractC0869c;

/* renamed from: g1.p */
/* loaded from: classes.dex */
public final class C0805p {

    /* renamed from: e */
    public static final C0805p f2989e;

    /* renamed from: f */
    public static final C0805p f2990f;

    /* renamed from: a */
    public final boolean f2991a;

    /* renamed from: b */
    public final boolean f2992b;

    /* renamed from: c */
    public final String[] f2993c;

    /* renamed from: d */
    public final String[] f2994d;

    static {
        C0802m[] c0802mArr = {C0802m.f2971k, C0802m.f2973m, C0802m.f2972l, C0802m.f2974n, C0802m.f2976p, C0802m.f2975o, C0802m.f2969i, C0802m.f2970j, C0802m.f2967g, C0802m.f2968h, C0802m.f2965e, C0802m.f2966f, C0802m.f2964d};
        C0804o c0804o = new C0804o(true);
        String[] strArr = new String[13];
        for (int i = 0; i < 13; i++) {
            strArr[i] = c0802mArr[i].f2977a;
        }
        c0804o.m2026a(strArr);
        EnumC0789G enumC0789G = EnumC0789G.TLS_1_0;
        c0804o.m2027b(EnumC0789G.TLS_1_3, EnumC0789G.TLS_1_2, EnumC0789G.TLS_1_1, enumC0789G);
        if (!c0804o.f2985a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        c0804o.f2986b = true;
        C0805p c0805p = new C0805p(c0804o);
        f2989e = c0805p;
        C0804o c0804o2 = new C0804o(c0805p);
        c0804o2.m2027b(enumC0789G);
        if (!c0804o2.f2985a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        c0804o2.f2986b = true;
        new C0805p(c0804o2);
        f2990f = new C0805p(new C0804o(false));
    }

    public C0805p(C0804o c0804o) {
        this.f2991a = c0804o.f2985a;
        this.f2993c = (String[]) c0804o.f2987c;
        this.f2994d = (String[]) c0804o.f2988d;
        this.f2992b = c0804o.f2986b;
    }

    /* renamed from: a */
    public final boolean m2029a(SSLSocket sSLSocket) {
        if (!this.f2991a) {
            return false;
        }
        String[] strArr = this.f2994d;
        if (strArr != null && !AbstractC0869c.m2192o(AbstractC0869c.f3367f, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f2993c;
        return strArr2 == null || AbstractC0869c.m2192o(C0802m.f2962b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0805p)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0805p c0805p = (C0805p) obj;
        boolean z2 = c0805p.f2991a;
        boolean z3 = this.f2991a;
        if (z3 != z2) {
            return false;
        }
        return !z3 || (Arrays.equals(this.f2993c, c0805p.f2993c) && Arrays.equals(this.f2994d, c0805p.f2994d) && this.f2992b == c0805p.f2992b);
    }

    public final int hashCode() {
        if (this.f2991a) {
            return ((((527 + Arrays.hashCode(this.f2993c)) * 31) + Arrays.hashCode(this.f2994d)) * 31) + (!this.f2992b ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String string;
        if (!this.f2991a) {
            return "ConnectionSpec()";
        }
        String string2 = "[all enabled]";
        String[] strArr = this.f2993c;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(C0802m.m2023a(str));
            }
            string = Collections.unmodifiableList(arrayList).toString();
        } else {
            string = "[all enabled]";
        }
        String[] strArr2 = this.f2994d;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String str2 : strArr2) {
                arrayList2.add(EnumC0789G.m2010a(str2));
            }
            string2 = Collections.unmodifiableList(arrayList2).toString();
        }
        return "ConnectionSpec(cipherSuites=" + string + ", tlsVersions=" + string2 + ", supportsTlsExtensions=" + this.f2992b + ")";
    }
}
