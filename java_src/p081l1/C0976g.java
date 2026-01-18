package p081l1;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
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
import p067g1.C0813x;
import p067g1.EnumC0814y;
import p075j1.C0953f;
import p078k1.AbstractC0964d;
import p078k1.InterfaceC0962b;
import p098r1.AbstractC1275o;
import p098r1.C1276p;
import p098r1.C1277q;
import p098r1.InterfaceC1281u;

/* renamed from: l1.g */
/* loaded from: classes.dex */
public final class C0976g implements InterfaceC0962b {

    /* renamed from: a */
    public final C0813x f3962a;

    /* renamed from: b */
    public final C0953f f3963b;

    /* renamed from: c */
    public final C1277q f3964c;

    /* renamed from: d */
    public final C1276p f3965d;

    /* renamed from: e */
    public int f3966e = 0;

    /* renamed from: f */
    public long f3967f = 262144;

    public C0976g(C0813x c0813x, C0953f c0953f, C1277q c1277q, C1276p c1276p) {
        this.f3962a = c0813x;
        this.f3963b = c0953f;
        this.f3964c = c1277q;
        this.f3965d = c1276p;
    }

    @Override // p078k1.InterfaceC0962b
    /* renamed from: a */
    public final InterfaceC1281u mo2448a(C0783A c0783a, long j2) {
        if ("chunked".equalsIgnoreCase(c0783a.f2860c.m2033a("Transfer-Encoding"))) {
            if (this.f3966e == 1) {
                this.f3966e = 2;
                return new C0971b(this);
            }
            throw new IllegalStateException("state: " + this.f3966e);
        }
        if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f3966e == 1) {
            this.f3966e = 2;
            return new C0973d(this, j2);
        }
        throw new IllegalStateException("state: " + this.f3966e);
    }

    @Override // p078k1.InterfaceC0962b
    /* renamed from: b */
    public final void mo2449b(C0783A c0783a) {
        Proxy.Type type = this.f3963b.m2428a().f3874c.f2892b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(c0783a.f2859b);
        sb.append(' ');
        C0810u c0810u = c0783a.f2858a;
        if (c0810u.f3022a.equals("https") || type != Proxy.Type.HTTP) {
            sb.append(AbstractC0411g.m1025J(c0810u));
        } else {
            sb.append(c0810u);
        }
        sb.append(" HTTP/1.1");
        m2472h(c0783a.f2860c, sb.toString());
    }

    @Override // p078k1.InterfaceC0962b
    /* renamed from: c */
    public final void mo2450c() {
        this.f3965d.flush();
    }

    @Override // p078k1.InterfaceC0962b
    /* renamed from: d */
    public final void mo2451d() {
        this.f3965d.flush();
    }

    @Override // p078k1.InterfaceC0962b
    /* renamed from: e */
    public final C0786D mo2452e(C0785C c0785c) throws IOException {
        int i = 1;
        C0953f c0953f = this.f3963b;
        c0953f.f3901e.getClass();
        c0785c.m2006g("Content-Type");
        if (!AbstractC0964d.m2456b(c0785c)) {
            C0974e c0974eM2471g = m2471g(0L);
            Logger logger = AbstractC1275o.f5062a;
            return new C0786D(0L, new C1277q(c0974eM2471g), i);
        }
        long j2 = -1;
        if ("chunked".equalsIgnoreCase(c0785c.m2006g("Transfer-Encoding"))) {
            C0810u c0810u = c0785c.f2875a.f2858a;
            if (this.f3966e != 4) {
                throw new IllegalStateException("state: " + this.f3966e);
            }
            this.f3966e = 5;
            C0972c c0972c = new C0972c(this, c0810u);
            Logger logger2 = AbstractC1275o.f5062a;
            return new C0786D(j2, new C1277q(c0972c), i);
        }
        long jM2455a = AbstractC0964d.m2455a(c0785c);
        if (jM2455a != -1) {
            C0974e c0974eM2471g2 = m2471g(jM2455a);
            Logger logger3 = AbstractC1275o.f5062a;
            return new C0786D(jM2455a, new C1277q(c0974eM2471g2), i);
        }
        if (this.f3966e != 4) {
            throw new IllegalStateException("state: " + this.f3966e);
        }
        this.f3966e = 5;
        c0953f.m2432e();
        C0975f c0975f = new C0975f(this);
        Logger logger4 = AbstractC1275o.f5062a;
        return new C0786D(j2, new C1277q(c0975f), i);
    }

    @Override // p078k1.InterfaceC0962b
    /* renamed from: f */
    public final C0784B mo2453f(boolean z2) {
        C1277q c1277q = this.f3964c;
        int i = this.f3966e;
        if (i != 1 && i != 3) {
            throw new IllegalStateException("state: " + this.f3966e);
        }
        try {
            String strM3054n = c1277q.m3054n(this.f3967f);
            this.f3967f -= strM3054n.length();
            C0051d c0051dM247c = C0051d.m247c(strM3054n);
            int i2 = c0051dM247c.f107b;
            C0784B c0784b = new C0784B();
            c0784b.f2864b = (EnumC0814y) c0051dM247c.f108c;
            c0784b.f2865c = i2;
            c0784b.f2866d = (String) c0051dM247c.f109d;
            C0001b c0001b = new C0001b(27);
            while (true) {
                String strM3054n2 = c1277q.m3054n(this.f3967f);
                this.f3967f -= strM3054n2.length();
                if (strM3054n2.length() == 0) {
                    break;
                }
                C0791b.f2915e.getClass();
                c0001b.m52q(strM3054n2);
            }
            ArrayList arrayList = (ArrayList) c0001b.f2g;
            String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            C0001b c0001b2 = new C0001b(27);
            Collections.addAll((ArrayList) c0001b2.f2g, strArr);
            c0784b.f2868f = c0001b2;
            if (z2 && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f3966e = 3;
                return c0784b;
            }
            this.f3966e = 4;
            return c0784b;
        } catch (EOFException e) {
            IOException iOException = new IOException("unexpected end of stream on " + this.f3963b);
            iOException.initCause(e);
            throw iOException;
        }
    }

    /* renamed from: g */
    public final C0974e m2471g(long j2) {
        if (this.f3966e != 4) {
            throw new IllegalStateException("state: " + this.f3966e);
        }
        this.f3966e = 5;
        C0974e c0974e = new C0974e(this);
        c0974e.f3960e = j2;
        if (j2 == 0) {
            c0974e.m2469f(true, null);
        }
        return c0974e;
    }

    /* renamed from: h */
    public final void m2472h(C0808s c0808s, String str) {
        if (this.f3966e != 0) {
            throw new IllegalStateException("state: " + this.f3966e);
        }
        C1276p c1276p = this.f3965d;
        c1276p.mo2991c(str);
        c1276p.mo2991c("\r\n");
        int iM2036d = c0808s.m2036d();
        for (int i = 0; i < iM2036d; i++) {
            c1276p.mo2991c(c0808s.m2034b(i));
            c1276p.mo2991c(": ");
            c1276p.mo2991c(c0808s.m2037e(i));
            c1276p.mo2991c("\r\n");
        }
        c1276p.mo2991c("\r\n");
        this.f3966e = 1;
    }
}
