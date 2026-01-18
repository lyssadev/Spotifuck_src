package p024N0;

import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.support.v4.media.session.C0513t;
import android.util.SparseArray;
import p030Q0.AbstractC0331H;
import p098r1.C1268h;
import p098r1.InterfaceC1282v;

/* renamed from: N0.p */
/* loaded from: classes.dex */
public final class C0288p {

    /* renamed from: a */
    public final int f718a;

    /* renamed from: b */
    public final int f719b;

    /* renamed from: c */
    public final Object f720c;

    /* renamed from: d */
    public final Object f721d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0288p(InterfaceC1282v interfaceC1282v, int i) {
        this(null, interfaceC1282v, i, 0);
        C1268h c1268h = AbstractC0331H.f862a;
        if (interfaceC1282v == null) {
            throw new NullPointerException("source == null");
        }
    }

    public C0288p(Bitmap bitmap, InterfaceC1282v interfaceC1282v, int i, int i2) {
        if ((bitmap != null) != (interfaceC1282v != null)) {
            this.f720c = bitmap;
            this.f721d = interfaceC1282v;
            if (i != 0) {
                this.f718a = i;
                this.f719b = i2;
                return;
            }
            throw new NullPointerException("loadedFrom == null");
        }
        throw new AssertionError();
    }

    public C0288p(C0289q c0289q, C0513t c0513t) {
        this.f720c = new SparseArray();
        this.f721d = c0289q;
        TypedArray typedArray = (TypedArray) c0513t.f1246c;
        this.f718a = typedArray.getResourceId(28, 0);
        this.f719b = typedArray.getResourceId(52, 0);
    }
}
