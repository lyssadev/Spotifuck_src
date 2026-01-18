package p081l1;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p000A.C0001b;
import p067g1.C0791b;
import p067g1.C0808s;
import p067g1.C0810u;
import p070h1.AbstractC0869c;
import p078k1.AbstractC0964d;
import p098r1.C1265e;
import p098r1.C1277q;

/* renamed from: l1.c */
/* loaded from: classes.dex */
public final class C0972c extends AbstractC0970a {

    /* renamed from: e */
    public final C0810u f3952e;

    /* renamed from: f */
    public long f3953f;

    /* renamed from: g */
    public boolean f3954g;

    /* renamed from: h */
    public final /* synthetic */ C0976g f3955h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0972c(C0976g c0976g, C0810u c0810u) {
        super(c0976g);
        this.f3955h = c0976g;
        this.f3953f = -1L;
        this.f3954g = true;
        this.f3952e = c0810u;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean zM2193p;
        if (this.f3946b) {
            return;
        }
        if (this.f3954g) {
            try {
                zM2193p = AbstractC0869c.m2193p(this, 100, TimeUnit.MILLISECONDS);
            } catch (IOException unused) {
                zM2193p = false;
            }
            if (!zM2193p) {
                m2469f(false, null);
            }
        }
        this.f3946b = true;
    }

    @Override // p081l1.AbstractC0970a, p098r1.InterfaceC1282v
    /* renamed from: e */
    public final long mo2197e(C1265e c1265e, long j2) throws InterruptedException, IOException, NumberFormatException {
        C1265e c1265e2;
        long j3;
        byte bM2995h;
        if (this.f3946b) {
            throw new IllegalStateException("closed");
        }
        if (!this.f3954g) {
            return -1L;
        }
        long j4 = this.f3953f;
        if (j4 == 0 || j4 == -1) {
            C0976g c0976g = this.f3955h;
            if (j4 != -1) {
                c0976g.f3964c.m3054n(Long.MAX_VALUE);
            }
            try {
                C1277q c1277q = c0976g.f3964c;
                C1277q c1277q2 = c0976g.f3964c;
                c1277q.m3056p(1L);
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    boolean zM3055o = c1277q.m3055o(i2);
                    c1265e2 = c1277q.f5066a;
                    if (!zM3055o) {
                        break;
                    }
                    bM2995h = c1265e2.m2995h(i);
                    if ((bM2995h < 48 || bM2995h > 57) && ((bM2995h < 97 || bM2995h > 102) && (bM2995h < 65 || bM2995h > 70))) {
                        break;
                    }
                    i = i2;
                }
                if (i == 0) {
                    throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(bM2995h)));
                }
                this.f3953f = c1265e2.m3000m();
                String strTrim = c1277q2.m3054n(Long.MAX_VALUE).trim();
                if (this.f3953f < 0 || !(strTrim.isEmpty() || strTrim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f3953f + strTrim + "\"");
                }
                if (this.f3953f == 0) {
                    this.f3954g = false;
                    C0791b c0791b = c0976g.f3962a.f3057f;
                    C0001b c0001b = new C0001b(27);
                    while (true) {
                        String strM3054n = c1277q2.m3054n(c0976g.f3967f);
                        c0976g.f3967f -= strM3054n.length();
                        if (strM3054n.length() == 0) {
                            break;
                        }
                        C0791b.f2915e.getClass();
                        c0001b.m52q(strM3054n);
                    }
                    AbstractC0964d.m2458d(c0791b, this.f3952e, new C0808s(c0001b));
                    m2469f(true, null);
                }
                if (!this.f3954g) {
                    return -1L;
                }
                j3 = -1;
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        } else {
            j3 = -1;
        }
        long jMo2197e = super.mo2197e(c1265e, Math.min(8192L, this.f3953f));
        if (jMo2197e != j3) {
            this.f3953f -= jMo2197e;
            return jMo2197e;
        }
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        m2469f(false, protocolException);
        throw protocolException;
    }
}
