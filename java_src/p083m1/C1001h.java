package p083m1;

import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import p000A.C0001b;
import p007E.C0051d;
import p036T0.AbstractC0411g;
import p067g1.C0783A;
import p067g1.C0784B;
import p067g1.C0785C;
import p067g1.C0786D;
import p067g1.C0791b;
import p067g1.C0808s;
import p067g1.C0810u;
import p067g1.EnumC0814y;
import p070h1.AbstractC0869c;
import p075j1.C0953f;
import p078k1.AbstractC0964d;
import p078k1.C0965e;
import p078k1.InterfaceC0962b;
import p098r1.AbstractC1275o;
import p098r1.C1268h;
import p098r1.C1277q;
import p098r1.InterfaceC1281u;

/* renamed from: m1.h */
/* loaded from: classes.dex */
public final class C1001h implements InterfaceC0962b {

    /* renamed from: e */
    public static final List f4077e;

    /* renamed from: f */
    public static final List f4078f;

    /* renamed from: a */
    public final C0965e f4079a;

    /* renamed from: b */
    public final C0953f f4080b;

    /* renamed from: c */
    public final C1012s f4081c;

    /* renamed from: d */
    public C1018y f4082d;

    static {
        C1268h c1268hM3017f = C1268h.m3017f("connection");
        C1268h c1268hM3017f2 = C1268h.m3017f("host");
        C1268h c1268hM3017f3 = C1268h.m3017f("keep-alive");
        C1268h c1268hM3017f4 = C1268h.m3017f("proxy-connection");
        C1268h c1268hM3017f5 = C1268h.m3017f("transfer-encoding");
        C1268h c1268hM3017f6 = C1268h.m3017f("te");
        C1268h c1268hM3017f7 = C1268h.m3017f("encoding");
        C1268h c1268hM3017f8 = C1268h.m3017f("upgrade");
        f4077e = AbstractC0869c.m2189l(c1268hM3017f, c1268hM3017f2, c1268hM3017f3, c1268hM3017f4, c1268hM3017f6, c1268hM3017f5, c1268hM3017f7, c1268hM3017f8, C0995b.f4045f, C0995b.f4046g, C0995b.f4047h, C0995b.f4048i);
        f4078f = AbstractC0869c.m2189l(c1268hM3017f, c1268hM3017f2, c1268hM3017f3, c1268hM3017f4, c1268hM3017f6, c1268hM3017f5, c1268hM3017f7, c1268hM3017f8);
    }

    public C1001h(C0965e c0965e, C0953f c0953f, C1012s c1012s) {
        this.f4079a = c0965e;
        this.f4080b = c0953f;
        this.f4081c = c1012s;
    }

    @Override // p078k1.InterfaceC0962b
    /* renamed from: a */
    public final InterfaceC1281u mo2448a(C0783A c0783a, long j2) {
        return this.f4082d.m2528e();
    }

    @Override // p078k1.InterfaceC0962b
    /* renamed from: b */
    public final void mo2449b(C0783A c0783a) {
        int i;
        C1018y c1018y;
        if (this.f4082d != null) {
            return;
        }
        c0783a.getClass();
        C0808s c0808s = c0783a.f2860c;
        ArrayList arrayList = new ArrayList(c0808s.m2036d() + 4);
        arrayList.add(new C0995b(C0995b.f4045f, c0783a.f2859b));
        C1268h c1268h = C0995b.f4046g;
        C0810u c0810u = c0783a.f2858a;
        arrayList.add(new C0995b(c1268h, AbstractC0411g.m1025J(c0810u)));
        String strM2033a = c0783a.f2860c.m2033a("Host");
        if (strM2033a != null) {
            arrayList.add(new C0995b(C0995b.f4048i, strM2033a));
        }
        arrayList.add(new C0995b(C0995b.f4047h, c0810u.f3022a));
        int iM2036d = c0808s.m2036d();
        for (int i2 = 0; i2 < iM2036d; i2++) {
            C1268h c1268hM3017f = C1268h.m3017f(c0808s.m2034b(i2).toLowerCase(Locale.US));
            if (!f4077e.contains(c1268hM3017f)) {
                arrayList.add(new C0995b(c1268hM3017f, c0808s.m2037e(i2)));
            }
        }
        C1012s c1012s = this.f4081c;
        boolean z2 = !false;
        synchronized (c1012s.f4129r) {
            synchronized (c1012s) {
                try {
                    if (c1012s.f4117f > 1073741823) {
                        c1012s.m2505k(5);
                    }
                    if (c1012s.f4118g) {
                        throw new C0994a();
                    }
                    i = c1012s.f4117f;
                    c1012s.f4117f = i + 2;
                    c1018y = new C1018y(i, c1012s, z2, false, arrayList);
                    if (c1018y.m2530g()) {
                        c1012s.f4114c.put(Integer.valueOf(i), c1018y);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c1012s.f4129r.m2542n(z2, i, arrayList);
        }
        c1012s.f4129r.flush();
        this.f4082d = c1018y;
        C1017x c1017x = c1018y.f4163i;
        long j2 = this.f4079a.f3934j;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c1017x.mo3036g(j2, timeUnit);
        this.f4082d.f4164j.mo3036g(this.f4079a.f3935k, timeUnit);
    }

    @Override // p078k1.InterfaceC0962b
    /* renamed from: c */
    public final void mo2450c() {
        this.f4082d.m2528e().close();
    }

    @Override // p078k1.InterfaceC0962b
    /* renamed from: d */
    public final void mo2451d() {
        this.f4081c.flush();
    }

    @Override // p078k1.InterfaceC0962b
    /* renamed from: e */
    public final C0786D mo2452e(C0785C c0785c) {
        this.f4080b.f3901e.getClass();
        c0785c.m2006g("Content-Type");
        long jM2455a = AbstractC0964d.m2455a(c0785c);
        C1000g c1000g = new C1000g(this, this.f4082d.f4161g);
        Logger logger = AbstractC1275o.f5062a;
        return new C0786D(jM2455a, new C1277q(c1000g), 1);
    }

    @Override // p078k1.InterfaceC0962b
    /* renamed from: f */
    public final C0784B mo2453f(boolean z2) throws ProtocolException, NumberFormatException {
        ArrayList arrayList;
        C1018y c1018y = this.f4082d;
        synchronized (c1018y) {
            try {
                if (!c1018y.m2529f()) {
                    throw new IllegalStateException("servers cannot read response headers");
                }
                c1018y.f4163i.m2987i();
                while (c1018y.f4159e == null && c1018y.f4165k == 0) {
                    try {
                        try {
                            c1018y.wait();
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        c1018y.f4163i.m2523n();
                        throw th;
                    }
                }
                c1018y.f4163i.m2523n();
                arrayList = c1018y.f4159e;
                if (arrayList == null) {
                    throw new C0993D(c1018y.f4165k);
                }
                c1018y.f4159e = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C0001b c0001b = new C0001b(27);
        int size = arrayList.size();
        C0051d c0051dM247c = null;
        for (int i = 0; i < size; i++) {
            C0995b c0995b = (C0995b) arrayList.get(i);
            if (c0995b != null) {
                String strMo3028o = c0995b.f4050b.mo3028o();
                C1268h c1268h = C0995b.f4044e;
                C1268h c1268h2 = c0995b.f4049a;
                if (c1268h2.equals(c1268h)) {
                    c0051dM247c = C0051d.m247c("HTTP/1.1 " + strMo3028o);
                } else if (!f4078f.contains(c1268h2)) {
                    C0791b c0791b = C0791b.f2915e;
                    String strMo3028o2 = c1268h2.mo3028o();
                    c0791b.getClass();
                    c0001b.m53r(strMo3028o2, strMo3028o);
                }
            } else if (c0051dM247c != null && c0051dM247c.f107b == 100) {
                c0001b = new C0001b(27);
                c0051dM247c = null;
            }
        }
        if (c0051dM247c == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        C0784B c0784b = new C0784B();
        c0784b.f2864b = EnumC0814y.HTTP_2;
        c0784b.f2865c = c0051dM247c.f107b;
        c0784b.f2866d = (String) c0051dM247c.f109d;
        ArrayList arrayList2 = (ArrayList) c0001b.f2g;
        String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
        C0001b c0001b2 = new C0001b(27);
        Collections.addAll((ArrayList) c0001b2.f2g, strArr);
        c0784b.f2868f = c0001b2;
        if (z2) {
            C0791b.f2915e.getClass();
            if (c0784b.f2865c == 100) {
                return null;
            }
        }
        return c0784b;
    }
}
