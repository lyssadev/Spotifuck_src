package p030Q0;

import android.net.NetworkInfo;
import java.io.IOException;
import p000A.C0001b;
import p000A.C0010k;
import p024N0.C0288p;
import p067g1.AbstractC0787E;
import p067g1.C0783A;
import p067g1.C0785C;
import p067g1.C0791b;
import p067g1.C0798i;
import p067g1.C0799j;
import p067g1.C0813x;
import p067g1.C0815z;
import p089o1.C1226g;

/* renamed from: Q0.t */
/* loaded from: classes.dex */
public final class C0351t extends AbstractC0325B {

    /* renamed from: a */
    public final C0001b f924a;

    /* renamed from: b */
    public final C0326C f925b;

    public C0351t(C0001b c0001b, C0326C c0326c) {
        this.f924a = c0001b;
        this.f925b = c0326c;
    }

    @Override // p030Q0.AbstractC0325B
    /* renamed from: a */
    public final boolean mo925a(C0357z c0357z) {
        String scheme = c0357z.f938a.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    @Override // p030Q0.AbstractC0325B
    /* renamed from: b */
    public final int mo926b() {
        return 2;
    }

    @Override // p030Q0.AbstractC0325B
    /* renamed from: c */
    public final C0288p mo927c(C0357z c0357z, int i) throws C0350s, C0349r {
        C0799j c0799j;
        if (i == 0) {
            c0799j = null;
        } else if ((i & 4) != 0) {
            c0799j = C0799j.f2945n;
        } else {
            C0798i c0798i = new C0798i();
            if ((i & 1) != 0) {
                c0798i.f2942b = true;
            }
            if ((i & 2) != 0) {
                c0798i.f2943c = true;
            }
            c0799j = new C0799j(c0798i);
        }
        C0010k c0010k = new C0010k(5);
        c0010k.m96s(c0357z.f938a.toString());
        if (c0799j != null) {
            String string = c0799j.toString();
            if (string.isEmpty()) {
                ((C0001b) c0010k.f25h).m32B("Cache-Control");
            } else {
                c0010k.m88j("Cache-Control", string);
            }
        }
        C0783A c0783aM80b = c0010k.m80b();
        C0813x c0813x = (C0813x) this.f924a.f2g;
        c0813x.getClass();
        C0815z c0815z = new C0815z(c0813x, c0783aM80b);
        c0813x.f3055d.getClass();
        c0815z.f3083c = C0791b.f2914d;
        synchronized (c0815z) {
            if (c0815z.f3085e) {
                throw new IllegalStateException("Already Executed");
            }
            c0815z.f3085e = true;
        }
        c0815z.f3082b.f3938b = C1226g.f4880a.mo2847i();
        c0815z.f3083c.getClass();
        try {
            try {
                c0813x.f3052a.m282v(c0815z);
                C0785C c0785cM2055a = c0815z.m2055a();
                c0813x.f3052a.m284x(c0815z);
                AbstractC0787E abstractC0787E = c0785cM2055a.f2881g;
                int i2 = c0785cM2055a.f2877c;
                if (i2 < 200 || i2 >= 300) {
                    abstractC0787E.close();
                    throw new C0350s(AbstractC0328E.m935e("HTTP ", c0785cM2055a.f2877c));
                }
                int i3 = c0785cM2055a.f2883i == null ? 3 : 2;
                if (i3 == 2 && abstractC0787E.mo2008f() == 0) {
                    abstractC0787E.close();
                    throw new C0349r("Received response with 0 content-length header.");
                }
                if (i3 == 3 && abstractC0787E.mo2008f() > 0) {
                    C0326C c0326c = this.f925b;
                    long jMo2008f = abstractC0787E.mo2008f();
                    HandlerC0341j handlerC0341j = c0326c.f835b;
                    handlerC0341j.sendMessage(handlerC0341j.obtainMessage(4, Long.valueOf(jMo2008f)));
                }
                return new C0288p(abstractC0787E.mo2009g(), i3);
            } catch (IOException e) {
                c0815z.f3083c.getClass();
                throw e;
            }
        } catch (Throwable th) {
            c0815z.f3081a.f3052a.m284x(c0815z);
            throw th;
        }
    }

    @Override // p030Q0.AbstractC0325B
    /* renamed from: d */
    public final boolean mo928d(NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }
}
