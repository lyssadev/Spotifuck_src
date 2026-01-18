package androidx.fragment.app;

import java.util.ArrayList;
import p030Q0.AbstractC0328E;

/* renamed from: androidx.fragment.app.Q */
/* loaded from: classes.dex */
public final class RunnableC0586Q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1797a;

    /* renamed from: b */
    public final /* synthetic */ C0587S f1798b;

    /* renamed from: c */
    public final /* synthetic */ C0597i f1799c;

    public /* synthetic */ RunnableC0586Q(C0597i c0597i, C0587S c0587s, int i) {
        this.f1797a = i;
        this.f1799c = c0597i;
        this.f1798b = c0587s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1797a) {
            case 0:
                ArrayList arrayList = this.f1799c.f1858b;
                C0587S c0587s = this.f1798b;
                if (arrayList.contains(c0587s)) {
                    AbstractC0328E.m931a(c0587s.f1802c.f1903J, c0587s.f1800a);
                    break;
                }
                break;
            default:
                C0597i c0597i = this.f1799c;
                ArrayList arrayList2 = c0597i.f1858b;
                C0587S c0587s2 = this.f1798b;
                arrayList2.remove(c0587s2);
                c0597i.f1859c.remove(c0587s2);
                break;
        }
    }
}
