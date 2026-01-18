package p074j0;

import android.util.SparseArray;

/* renamed from: j0.P */
/* loaded from: classes.dex */
public final class C0901P {

    /* renamed from: a */
    public SparseArray f3609a;

    /* renamed from: b */
    public int f3610b;

    /* renamed from: a */
    public final C0900O m2299a(int i) {
        SparseArray sparseArray = this.f3609a;
        C0900O c0900o = (C0900O) sparseArray.get(i);
        if (c0900o != null) {
            return c0900o;
        }
        C0900O c0900o2 = new C0900O();
        sparseArray.put(i, c0900o2);
        return c0900o2;
    }
}
