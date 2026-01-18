package p023N;

import android.os.Build;
import android.view.animation.Interpolator;
import p004C0.AbstractC0038c;

/* renamed from: N.j0 */
/* loaded from: classes.dex */
public final class C0234j0 {

    /* renamed from: a */
    public AbstractC0232i0 f616a;

    public C0234j0(int i, Interpolator interpolator, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f616a = new C0230h0(AbstractC0038c.m195i(i, interpolator, j2));
        } else {
            this.f616a = new C0226f0(i, interpolator, j2);
        }
    }
}
