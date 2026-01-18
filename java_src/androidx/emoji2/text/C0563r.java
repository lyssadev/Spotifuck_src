package androidx.emoji2.text;

import android.util.SparseArray;

/* renamed from: androidx.emoji2.text.r */
/* loaded from: classes.dex */
public final class C0563r {

    /* renamed from: a */
    public final SparseArray f1680a;

    /* renamed from: b */
    public C0566u f1681b;

    public C0563r(int i) {
        this.f1680a = new SparseArray(i);
    }

    /* renamed from: a */
    public final void m1448a(C0566u c0566u, int i, int i2) {
        int iM1454a = c0566u.m1454a(i);
        SparseArray sparseArray = this.f1680a;
        C0563r c0563r = sparseArray == null ? null : (C0563r) sparseArray.get(iM1454a);
        if (c0563r == null) {
            c0563r = new C0563r(1);
            sparseArray.put(c0566u.m1454a(i), c0563r);
        }
        if (i2 > i) {
            c0563r.m1448a(c0566u, i + 1, i2);
        } else {
            c0563r.f1681b = c0566u;
        }
    }
}
