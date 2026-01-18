package p083m1;

import java.io.IOException;
import p070h1.AbstractRunnableC0867a;

/* renamed from: m1.p */
/* loaded from: classes.dex */
public final class C1009p extends AbstractRunnableC0867a {

    /* renamed from: b */
    public final boolean f4103b;

    /* renamed from: c */
    public final int f4104c;

    /* renamed from: d */
    public final int f4105d;

    /* renamed from: e */
    public final /* synthetic */ C1012s f4106e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1009p(C1012s c1012s, boolean z2, int i, int i2) {
        super("OkHttp %s ping %08x%08x", c1012s.f4115d, Integer.valueOf(i), Integer.valueOf(i2));
        this.f4106e = c1012s;
        this.f4103b = z2;
        this.f4104c = i;
        this.f4105d = i2;
    }

    @Override // p070h1.AbstractRunnableC0867a
    /* renamed from: a */
    public final void mo2177a() {
        boolean z2;
        C1012s c1012s = this.f4106e;
        boolean z3 = this.f4103b;
        int i = this.f4104c;
        int i2 = this.f4105d;
        if (z3) {
            c1012s.getClass();
        } else {
            synchronized (c1012s) {
                z2 = c1012s.f4122k;
                c1012s.f4122k = true;
            }
            if (z2) {
                c1012s.m2501g();
                return;
            }
        }
        try {
            c1012s.f4129r.m2539k(i, i2, z3);
        } catch (IOException unused) {
            c1012s.m2501g();
        }
    }
}
