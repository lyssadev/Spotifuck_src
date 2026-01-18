package p067g1;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import p000A.C0001b;
import p007E.C0051d;
import p070h1.AbstractC0869c;
import p072i1.C0874d;
import p078k1.AbstractC0964d;
import p089o1.C1226g;
import p098r1.AbstractC1275o;
import p098r1.C1264d;
import p098r1.C1265e;
import p098r1.C1268h;
import p098r1.C1276p;
import p098r1.C1277q;
import p098r1.InterfaceC1281u;
import p098r1.InterfaceC1282v;

/* renamed from: g1.g */
/* loaded from: classes.dex */
public final class C0796g {

    /* renamed from: k */
    public static final String f2927k;

    /* renamed from: l */
    public static final String f2928l;

    /* renamed from: a */
    public final String f2929a;

    /* renamed from: b */
    public final C0808s f2930b;

    /* renamed from: c */
    public final String f2931c;

    /* renamed from: d */
    public final EnumC0814y f2932d;

    /* renamed from: e */
    public final int f2933e;

    /* renamed from: f */
    public final String f2934f;

    /* renamed from: g */
    public final C0808s f2935g;

    /* renamed from: h */
    public final C0807r f2936h;

    /* renamed from: i */
    public final long f2937i;

    /* renamed from: j */
    public final long f2938j;

    static {
        C1226g c1226g = C1226g.f4880a;
        c1226g.getClass();
        f2927k = "OkHttp-Sent-Millis";
        c1226g.getClass();
        f2928l = "OkHttp-Received-Millis";
    }

    public C0796g(InterfaceC1282v interfaceC1282v) throws IOException {
        try {
            Logger logger = AbstractC1275o.f5062a;
            C1277q c1277q = new C1277q(interfaceC1282v);
            this.f2929a = c1277q.m3054n(Long.MAX_VALUE);
            this.f2931c = c1277q.m3054n(Long.MAX_VALUE);
            C0001b c0001b = new C0001b(27);
            int iM2018f = C0797h.m2018f(c1277q);
            for (int i = 0; i < iM2018f; i++) {
                c0001b.m52q(c1277q.m3054n(Long.MAX_VALUE));
            }
            this.f2930b = new C0808s(c0001b);
            C0051d c0051dM247c = C0051d.m247c(c1277q.m3054n(Long.MAX_VALUE));
            this.f2932d = (EnumC0814y) c0051dM247c.f108c;
            this.f2933e = c0051dM247c.f107b;
            this.f2934f = (String) c0051dM247c.f109d;
            C0001b c0001b2 = new C0001b(27);
            int iM2018f2 = C0797h.m2018f(c1277q);
            for (int i2 = 0; i2 < iM2018f2; i2++) {
                c0001b2.m52q(c1277q.m3054n(Long.MAX_VALUE));
            }
            String str = f2927k;
            String strM56v = c0001b2.m56v(str);
            String str2 = f2928l;
            String strM56v2 = c0001b2.m56v(str2);
            c0001b2.m32B(str);
            c0001b2.m32B(str2);
            this.f2937i = strM56v != null ? Long.parseLong(strM56v) : 0L;
            this.f2938j = strM56v2 != null ? Long.parseLong(strM56v2) : 0L;
            this.f2935g = new C0808s(c0001b2);
            if (this.f2929a.startsWith("https://")) {
                String strM3054n = c1277q.m3054n(Long.MAX_VALUE);
                if (strM3054n.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + strM3054n + "\"");
                }
                this.f2936h = new C0807r(!c1277q.m3046f() ? EnumC0789G.m2010a(c1277q.m3054n(Long.MAX_VALUE)) : EnumC0789G.SSL_3_0, C0802m.m2023a(c1277q.m3054n(Long.MAX_VALUE)), AbstractC0869c.m2188k(m2015a(c1277q)), AbstractC0869c.m2188k(m2015a(c1277q)));
            } else {
                this.f2936h = null;
            }
            interfaceC1282v.close();
        } catch (Throwable th) {
            interfaceC1282v.close();
            throw th;
        }
    }

    /* renamed from: a */
    public static List m2015a(C1277q c1277q) throws IOException, CertificateException {
        int iM2018f = C0797h.m2018f(c1277q);
        if (iM2018f == -1) {
            return Collections.emptyList();
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(iM2018f);
            for (int i = 0; i < iM2018f; i++) {
                String strM3054n = c1277q.m3054n(Long.MAX_VALUE);
                C1265e c1265e = new C1265e();
                C1268h c1268hM3014b = C1268h.m3014b(strM3054n);
                if (c1268hM3014b == null) {
                    throw new IllegalArgumentException("byteString == null");
                }
                c1268hM3014b.mo3029p(c1265e);
                arrayList.add(certificateFactory.generateCertificate(new C1264d(c1265e, 0)));
            }
            return arrayList;
        } catch (CertificateException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m2016b(C1276p c1276p, List list) throws IOException {
        try {
            c1276p.m3044h(list.size());
            c1276p.mo2992d(10);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                c1276p.mo2991c(C1268h.m3018i(((Certificate) list.get(i)).getEncoded()).mo3019a());
                c1276p.mo2992d(10);
            }
        } catch (CertificateEncodingException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* renamed from: c */
    public final void m2017c(C0874d c0874d) {
        InterfaceC1281u interfaceC1281uM2206d = c0874d.m2206d(0);
        Logger logger = AbstractC1275o.f5062a;
        C1276p c1276p = new C1276p(interfaceC1281uM2206d);
        String str = this.f2929a;
        c1276p.mo2991c(str);
        c1276p.mo2992d(10);
        c1276p.mo2991c(this.f2931c);
        c1276p.mo2992d(10);
        C0808s c0808s = this.f2930b;
        c1276p.m3044h(c0808s.m2036d());
        c1276p.mo2992d(10);
        int iM2036d = c0808s.m2036d();
        for (int i = 0; i < iM2036d; i++) {
            c1276p.mo2991c(c0808s.m2034b(i));
            c1276p.mo2991c(": ");
            c1276p.mo2991c(c0808s.m2037e(i));
            c1276p.mo2992d(10);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2932d == EnumC0814y.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f2933e);
        String str2 = this.f2934f;
        if (str2 != null) {
            sb.append(' ');
            sb.append(str2);
        }
        c1276p.mo2991c(sb.toString());
        c1276p.mo2992d(10);
        C0808s c0808s2 = this.f2935g;
        c1276p.m3044h(c0808s2.m2036d() + 2);
        c1276p.mo2992d(10);
        int iM2036d2 = c0808s2.m2036d();
        for (int i2 = 0; i2 < iM2036d2; i2++) {
            c1276p.mo2991c(c0808s2.m2034b(i2));
            c1276p.mo2991c(": ");
            c1276p.mo2991c(c0808s2.m2037e(i2));
            c1276p.mo2992d(10);
        }
        c1276p.mo2991c(f2927k);
        c1276p.mo2991c(": ");
        c1276p.m3044h(this.f2937i);
        c1276p.mo2992d(10);
        c1276p.mo2991c(f2928l);
        c1276p.mo2991c(": ");
        c1276p.m3044h(this.f2938j);
        c1276p.mo2992d(10);
        if (str.startsWith("https://")) {
            c1276p.mo2992d(10);
            C0807r c0807r = this.f2936h;
            c1276p.mo2991c(c0807r.f3009b.f2977a);
            c1276p.mo2992d(10);
            m2016b(c1276p, c0807r.f3010c);
            m2016b(c1276p, c0807r.f3011d);
            c1276p.mo2991c(c0807r.f3008a.f2900a);
            c1276p.mo2992d(10);
        }
        c1276p.close();
    }

    public C0796g(C0785C c0785c) {
        C0808s c0808s;
        C0783A c0783a = c0785c.f2875a;
        this.f2929a = c0783a.f2858a.f3029h;
        int i = AbstractC0964d.f3924a;
        C0808s c0808s2 = c0785c.f2882h.f2875a.f2860c;
        C0808s c0808s3 = c0785c.f2880f;
        Set setM2460f = AbstractC0964d.m2460f(c0808s3);
        if (setM2460f.isEmpty()) {
            c0808s = new C0808s(new C0001b(27));
        } else {
            C0001b c0001b = new C0001b(27);
            int iM2036d = c0808s2.m2036d();
            for (int i2 = 0; i2 < iM2036d; i2++) {
                String strM2034b = c0808s2.m2034b(i2);
                if (setM2460f.contains(strM2034b)) {
                    String strM2037e = c0808s2.m2037e(i2);
                    C0001b.m30s(strM2034b, strM2037e);
                    c0001b.m53r(strM2034b, strM2037e);
                }
            }
            c0808s = new C0808s(c0001b);
        }
        this.f2930b = c0808s;
        this.f2931c = c0783a.f2859b;
        this.f2932d = c0785c.f2876b;
        this.f2933e = c0785c.f2877c;
        this.f2934f = c0785c.f2878d;
        this.f2935g = c0808s3;
        this.f2936h = c0785c.f2879e;
        this.f2937i = c0785c.f2885k;
        this.f2938j = c0785c.f2886l;
    }
}
