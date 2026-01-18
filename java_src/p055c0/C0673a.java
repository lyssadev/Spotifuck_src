package p055c0;

import androidx.lifecycle.AbstractC0627M;
import p018K0.C0146e;
import p096r.C1257l;

/* renamed from: c0.a */
/* loaded from: classes.dex */
public final class C0673a extends AbstractC0627M {

    /* renamed from: d */
    public static final C0146e f2266d = new C0146e(16);

    /* renamed from: c */
    public final C1257l f2267c = new C1257l();

    @Override // androidx.lifecycle.AbstractC0627M
    /* renamed from: b */
    public final void mo1516b() {
        C1257l c1257l = this.f2267c;
        int i = c1257l.f5016c;
        if (i > 0) {
            c1257l.f5015b[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = c1257l.f5015b;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        c1257l.f5016c = 0;
    }
}
