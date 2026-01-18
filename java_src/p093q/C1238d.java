package p093q;

import java.util.Iterator;

/* renamed from: q.d */
/* loaded from: classes.dex */
public final class C1238d extends AbstractC1239e implements Iterator {

    /* renamed from: a */
    public C1237c f4928a;

    /* renamed from: b */
    public boolean f4929b = true;

    /* renamed from: c */
    public final /* synthetic */ C1240f f4930c;

    public C1238d(C1240f c1240f) {
        this.f4930c = c1240f;
    }

    @Override // p093q.AbstractC1239e
    /* renamed from: a */
    public final void mo2934a(C1237c c1237c) {
        C1237c c1237c2 = this.f4928a;
        if (c1237c == c1237c2) {
            C1237c c1237c3 = c1237c2.f4927d;
            this.f4928a = c1237c3;
            this.f4929b = c1237c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4929b) {
            return this.f4930c.f4931a != null;
        }
        C1237c c1237c = this.f4928a;
        return (c1237c == null || c1237c.f4926c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f4929b) {
            this.f4929b = false;
            this.f4928a = this.f4930c.f4931a;
        } else {
            C1237c c1237c = this.f4928a;
            this.f4928a = c1237c != null ? c1237c.f4926c : null;
        }
        return this.f4928a;
    }
}
