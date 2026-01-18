package p078k1;

import java.io.IOException;
import java.net.ProtocolException;
import p036T0.AbstractC0411g;
import p067g1.AbstractC0787E;
import p067g1.C0783A;
import p067g1.C0784B;
import p067g1.C0785C;
import p067g1.InterfaceC0811v;
import p075j1.C0953f;

/* renamed from: k1.a */
/* loaded from: classes.dex */
public final class C0961a implements InterfaceC0811v {
    @Override // p067g1.InterfaceC0811v
    /* renamed from: a */
    public final C0785C mo2053a(C0965e c0965e) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        c0965e.f3932h.getClass();
        InterfaceC0962b interfaceC0962b = c0965e.f3927c;
        C0783A c0783a = c0965e.f3930f;
        interfaceC0962b.mo2449b(c0783a);
        AbstractC0411g.m1023H(c0783a.f2859b);
        C0953f c0953f = c0965e.f3926b;
        interfaceC0962b.mo2450c();
        C0784B c0784bMo2453f = interfaceC0962b.mo2453f(false);
        c0784bMo2453f.f2863a = c0783a;
        c0784bMo2453f.f2867e = c0953f.m2428a().f3877f;
        c0784bMo2453f.f2873k = jCurrentTimeMillis;
        c0784bMo2453f.f2874l = System.currentTimeMillis();
        C0785C c0785cM2004a = c0784bMo2453f.m2004a();
        int i = c0785cM2004a.f2877c;
        if (i == 100) {
            C0784B c0784bMo2453f2 = interfaceC0962b.mo2453f(false);
            c0784bMo2453f2.f2863a = c0783a;
            c0784bMo2453f2.f2867e = c0953f.m2428a().f3877f;
            c0784bMo2453f2.f2873k = jCurrentTimeMillis;
            c0784bMo2453f2.f2874l = System.currentTimeMillis();
            c0785cM2004a = c0784bMo2453f2.m2004a();
            i = c0785cM2004a.f2877c;
        }
        C0784B c0784bM2007h = c0785cM2004a.m2007h();
        c0784bM2007h.f2869g = interfaceC0962b.mo2452e(c0785cM2004a);
        C0785C c0785cM2004a2 = c0784bM2007h.m2004a();
        if ("close".equalsIgnoreCase(c0785cM2004a2.f2875a.f2860c.m2033a("Connection")) || "close".equalsIgnoreCase(c0785cM2004a2.m2006g("Connection"))) {
            c0953f.m2432e();
        }
        if (i == 204 || i == 205) {
            AbstractC0787E abstractC0787E = c0785cM2004a2.f2881g;
            if (abstractC0787E.mo2008f() > 0) {
                throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + abstractC0787E.mo2008f());
            }
        }
        return c0785cM2004a2;
    }
}
