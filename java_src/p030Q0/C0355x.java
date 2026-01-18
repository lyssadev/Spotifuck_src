package p030Q0;

import java.util.concurrent.FutureTask;
import p101t.AbstractC1300e;

/* renamed from: Q0.x */
/* loaded from: classes.dex */
public final class C0355x extends FutureTask implements Comparable {

    /* renamed from: a */
    public final RunnableC0337f f937a;

    public C0355x(RunnableC0337f runnableC0337f) {
        super(runnableC0337f, null);
        this.f937a = runnableC0337f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        RunnableC0337f runnableC0337f = this.f937a;
        int i = runnableC0337f.f890r;
        RunnableC0337f runnableC0337f2 = ((C0355x) obj).f937a;
        int i2 = runnableC0337f2.f890r;
        return i == i2 ? runnableC0337f.f873a - runnableC0337f2.f873a : AbstractC1300e.m3116a(i2) - AbstractC1300e.m3116a(i);
    }
}
