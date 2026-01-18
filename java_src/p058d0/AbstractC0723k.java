package p058d0;

import java.util.ArrayList;

/* renamed from: d0.k */
/* loaded from: classes.dex */
public abstract class AbstractC0723k {

    /* renamed from: a */
    public final Object f2684a;

    /* renamed from: b */
    public boolean f2685b;

    /* renamed from: c */
    public boolean f2686c;

    /* renamed from: d */
    public int f2687d;

    public AbstractC0723k(Object obj) {
        this.f2684a = obj;
    }

    /* renamed from: a */
    public void mo1954a() {
        boolean z2 = this.f2685b;
        Object obj = this.f2684a;
        if (z2) {
            throw new IllegalStateException("detach() called when detach() had already been called for: " + obj);
        }
        if (!this.f2686c) {
            this.f2685b = true;
        } else {
            throw new IllegalStateException("detach() called when sendResult() had already been called for: " + obj);
        }
    }

    /* renamed from: b */
    public final boolean m1955b() {
        return this.f2685b || this.f2686c;
    }

    /* renamed from: c */
    public abstract void mo1953c(ArrayList arrayList);

    /* renamed from: d */
    public final void m1956d(ArrayList arrayList) {
        if (this.f2686c) {
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f2684a);
        }
        this.f2686c = true;
        mo1953c(arrayList);
    }
}
