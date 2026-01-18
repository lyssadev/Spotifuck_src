package p093q;

import java.util.Iterator;

/* renamed from: q.b */
/* loaded from: classes.dex */
public final class C1236b extends AbstractC1239e implements Iterator {

    /* renamed from: a */
    public C1237c f4921a;

    /* renamed from: b */
    public C1237c f4922b;

    /* renamed from: c */
    public final /* synthetic */ int f4923c;

    public C1236b(C1237c c1237c, C1237c c1237c2, int i) {
        this.f4923c = i;
        this.f4921a = c1237c2;
        this.f4922b = c1237c;
    }

    @Override // p093q.AbstractC1239e
    /* renamed from: a */
    public final void mo2934a(C1237c c1237c) {
        C1237c c1237c2;
        C1237c c1237cM2935b = null;
        if (this.f4921a == c1237c && c1237c == this.f4922b) {
            this.f4922b = null;
            this.f4921a = null;
        }
        C1237c c1237c3 = this.f4921a;
        if (c1237c3 == c1237c) {
            switch (this.f4923c) {
                case 0:
                    c1237c2 = c1237c3.f4927d;
                    break;
                default:
                    c1237c2 = c1237c3.f4926c;
                    break;
            }
            this.f4921a = c1237c2;
        }
        C1237c c1237c4 = this.f4922b;
        if (c1237c4 == c1237c) {
            C1237c c1237c5 = this.f4921a;
            if (c1237c4 != c1237c5 && c1237c5 != null) {
                c1237cM2935b = m2935b(c1237c4);
            }
            this.f4922b = c1237cM2935b;
        }
    }

    /* renamed from: b */
    public final C1237c m2935b(C1237c c1237c) {
        switch (this.f4923c) {
            case 0:
                return c1237c.f4926c;
            default:
                return c1237c.f4927d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4922b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1237c c1237c = this.f4922b;
        C1237c c1237c2 = this.f4921a;
        this.f4922b = (c1237c == c1237c2 || c1237c2 == null) ? null : m2935b(c1237c);
        return c1237c;
    }
}
