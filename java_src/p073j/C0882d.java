package p073j;

import android.animation.TimeInterpolator;

/* renamed from: j.d */
/* loaded from: classes.dex */
public final class C0882d implements TimeInterpolator {

    /* renamed from: a */
    public int[] f3544a;

    /* renamed from: b */
    public int f3545b;

    /* renamed from: c */
    public int f3546c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        int i = (int) ((f2 * this.f3546c) + 0.5f);
        int i2 = this.f3545b;
        int[] iArr = this.f3544a;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = iArr[i3];
            if (i < i4) {
                break;
            }
            i -= i4;
            i3++;
        }
        return (i3 / i2) + (i3 < i2 ? i / this.f3546c : 0.0f);
    }
}
