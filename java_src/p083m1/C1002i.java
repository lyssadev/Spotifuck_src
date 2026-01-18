package p083m1;

import java.io.IOException;
import p070h1.AbstractRunnableC0867a;

/* renamed from: m1.i */
/* loaded from: classes.dex */
public final class C1002i extends AbstractRunnableC0867a {

    /* renamed from: b */
    public final /* synthetic */ int f4083b;

    /* renamed from: c */
    public final /* synthetic */ int f4084c;

    /* renamed from: d */
    public final /* synthetic */ C1012s f4085d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1002i(C1012s c1012s, Object[] objArr, int i, int i2) {
        super("OkHttp %s stream %d", objArr);
        this.f4085d = c1012s;
        this.f4083b = i;
        this.f4084c = i2;
    }

    @Override // p070h1.AbstractRunnableC0867a
    /* renamed from: a */
    public final void mo2177a() {
        C1012s c1012s = this.f4085d;
        try {
            c1012s.f4129r.m2540l(this.f4083b, this.f4084c);
        } catch (IOException unused) {
            c1012s.m2501g();
        }
    }
}
