package p083m1;

import java.io.IOException;
import p070h1.AbstractRunnableC0867a;

/* renamed from: m1.j */
/* loaded from: classes.dex */
public final class C1003j extends AbstractRunnableC0867a {

    /* renamed from: b */
    public final /* synthetic */ int f4086b;

    /* renamed from: c */
    public final /* synthetic */ long f4087c;

    /* renamed from: d */
    public final /* synthetic */ C1012s f4088d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1003j(C1012s c1012s, Object[] objArr, int i, long j2) {
        super("OkHttp Window Update %s stream %d", objArr);
        this.f4088d = c1012s;
        this.f4086b = i;
        this.f4087c = j2;
    }

    @Override // p070h1.AbstractRunnableC0867a
    /* renamed from: a */
    public final void mo2177a() {
        C1012s c1012s = this.f4088d;
        try {
            c1012s.f4129r.m2543o(this.f4086b, this.f4087c);
        } catch (IOException unused) {
            c1012s.m2501g();
        }
    }
}
