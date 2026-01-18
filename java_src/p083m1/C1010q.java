package p083m1;

import java.io.IOException;
import java.util.concurrent.ThreadPoolExecutor;
import p017K.C0137j;
import p070h1.AbstractC0869c;
import p070h1.AbstractRunnableC0867a;
import p089o1.C1226g;

/* renamed from: m1.q */
/* loaded from: classes.dex */
public final class C1010q extends AbstractRunnableC0867a {

    /* renamed from: b */
    public final /* synthetic */ int f4107b = 1;

    /* renamed from: c */
    public final /* synthetic */ Object f4108c;

    /* renamed from: d */
    public final Object f4109d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1010q(C1012s c1012s, C1014u c1014u) {
        super("OkHttp %s", c1012s.f4115d);
        this.f4108c = c1012s;
        this.f4109d = c1014u;
    }

    @Override // p070h1.AbstractRunnableC0867a
    /* renamed from: a */
    public final void mo2177a() throws IOException {
        Object obj = this.f4109d;
        Object obj2 = this.f4108c;
        switch (this.f4107b) {
            case 0:
                C1018y c1018y = (C1018y) obj;
                C1010q c1010q = (C1010q) obj2;
                try {
                    ((C1012s) c1010q.f4108c).f4113b.mo2417b(c1018y);
                    return;
                } catch (IOException e) {
                    C1226g.f4880a.mo2849k(4, "Http2Connection.Listener failure for " + ((C1012s) c1010q.f4108c).f4115d, e);
                    try {
                        c1018y.m2526c(2);
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            case 1:
                C1010q c1010q2 = (C1010q) obj2;
                try {
                    ((C1012s) c1010q2.f4108c).f4129r.m2534f((C0137j) obj);
                    return;
                } catch (IOException unused2) {
                    C1012s c1012s = (C1012s) c1010q2.f4108c;
                    ThreadPoolExecutor threadPoolExecutor = C1012s.f4111u;
                    c1012s.m2501g();
                    return;
                }
            default:
                C1012s c1012s2 = (C1012s) obj2;
                C1014u c1014u = (C1014u) obj;
                try {
                    try {
                        c1014u.m2512h(this);
                        do {
                        } while (c1014u.m2511g(false, this));
                        c1012s2.m2500f(1, 6);
                    } catch (IOException unused3) {
                        c1012s2.m2500f(2, 2);
                    } catch (Throwable th) {
                        try {
                            c1012s2.m2500f(3, 3);
                        } catch (IOException unused4) {
                        }
                        AbstractC0869c.m2180c(c1014u);
                        throw th;
                    }
                } catch (IOException unused5) {
                }
                AbstractC0869c.m2180c(c1014u);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1010q(C1010q c1010q, Object[] objArr, C1018y c1018y) {
        super("OkHttp %s stream %d", objArr);
        this.f4108c = c1010q;
        this.f4109d = c1018y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1010q(C1010q c1010q, Object[] objArr, C0137j c0137j) {
        super("OkHttp %s ACK Settings", objArr);
        this.f4108c = c1010q;
        this.f4109d = c0137j;
    }
}
