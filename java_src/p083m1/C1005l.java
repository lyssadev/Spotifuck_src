package p083m1;

import java.io.IOException;
import p070h1.AbstractRunnableC0867a;
import p098r1.C1265e;

/* renamed from: m1.l */
/* loaded from: classes.dex */
public final class C1005l extends AbstractRunnableC0867a {

    /* renamed from: b */
    public final /* synthetic */ int f4092b;

    /* renamed from: c */
    public final /* synthetic */ C1265e f4093c;

    /* renamed from: d */
    public final /* synthetic */ int f4094d;

    /* renamed from: e */
    public final /* synthetic */ C1012s f4095e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1005l(C1012s c1012s, Object[] objArr, int i, C1265e c1265e, int i2, boolean z2) {
        super("OkHttp %s Push Data[%s]", objArr);
        this.f4095e = c1012s;
        this.f4092b = i;
        this.f4093c = c1265e;
        this.f4094d = i2;
    }

    @Override // p070h1.AbstractRunnableC0867a
    /* renamed from: a */
    public final void mo2177a() {
        try {
            C0992C c0992c = this.f4095e.f4121j;
            C1265e c1265e = this.f4093c;
            int i = this.f4094d;
            c0992c.getClass();
            c1265e.m3006s(i);
            this.f4095e.f4129r.m2540l(this.f4092b, 6);
            synchronized (this.f4095e) {
                this.f4095e.f4131t.remove(Integer.valueOf(this.f4092b));
            }
        } catch (IOException unused) {
        }
    }
}
