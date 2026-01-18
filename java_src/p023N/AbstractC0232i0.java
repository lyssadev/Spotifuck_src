package p023N;

import android.view.animation.Interpolator;

/* renamed from: N.i0 */
/* loaded from: classes.dex */
public abstract class AbstractC0232i0 {

    /* renamed from: a */
    public final int f611a;

    /* renamed from: b */
    public float f612b;

    /* renamed from: c */
    public final Interpolator f613c;

    /* renamed from: d */
    public final long f614d;

    public AbstractC0232i0(int i, Interpolator interpolator, long j2) {
        this.f611a = i;
        this.f613c = interpolator;
        this.f614d = j2;
    }

    /* renamed from: a */
    public long mo723a() {
        return this.f614d;
    }

    /* renamed from: b */
    public float mo724b() {
        Interpolator interpolator = this.f613c;
        return interpolator != null ? interpolator.getInterpolation(this.f612b) : this.f612b;
    }

    /* renamed from: c */
    public int mo725c() {
        return this.f611a;
    }

    /* renamed from: d */
    public void mo726d(float f2) {
        this.f612b = f2;
    }
}
