package p018K0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import p016J0.C0127a;

/* renamed from: K0.n */
/* loaded from: classes.dex */
public final class C0155n extends AbstractC0161t {

    /* renamed from: c */
    public final /* synthetic */ ArrayList f469c;

    /* renamed from: d */
    public final /* synthetic */ Matrix f470d;

    public C0155n(ArrayList arrayList, Matrix matrix) {
        this.f469c = arrayList;
        this.f470d = matrix;
    }

    @Override // p018K0.AbstractC0161t
    /* renamed from: a */
    public final void mo530a(Matrix matrix, C0127a c0127a, int i, Canvas canvas) {
        Iterator it2 = this.f469c.iterator();
        while (it2.hasNext()) {
            ((AbstractC0161t) it2.next()).mo530a(this.f470d, c0127a, i, canvas);
        }
    }
}
