package p023N;

import android.view.WindowInsetsAnimation;

/* renamed from: N.h0 */
/* loaded from: classes.dex */
public final class C0230h0 extends AbstractC0232i0 {

    /* renamed from: e */
    public final WindowInsetsAnimation f610e;

    public C0230h0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f610e = windowInsetsAnimation;
    }

    @Override // p023N.AbstractC0232i0
    /* renamed from: a */
    public final long mo723a() {
        return this.f610e.getDurationMillis();
    }

    @Override // p023N.AbstractC0232i0
    /* renamed from: b */
    public final float mo724b() {
        return this.f610e.getInterpolatedFraction();
    }

    @Override // p023N.AbstractC0232i0
    /* renamed from: c */
    public final int mo725c() {
        return this.f610e.getTypeMask();
    }

    @Override // p023N.AbstractC0232i0
    /* renamed from: d */
    public final void mo726d(float f2) {
        this.f610e.setFraction(f2);
    }
}
