package p074j0;

/* renamed from: j0.X */
/* loaded from: classes.dex */
public final class C0908X {

    /* renamed from: a */
    public int f3628a;

    /* renamed from: b */
    public int f3629b;

    /* renamed from: c */
    public int f3630c;

    /* renamed from: d */
    public int f3631d;

    /* renamed from: e */
    public int f3632e;

    /* renamed from: f */
    public boolean f3633f;

    /* renamed from: g */
    public boolean f3634g;

    /* renamed from: h */
    public boolean f3635h;

    /* renamed from: i */
    public boolean f3636i;

    /* renamed from: j */
    public boolean f3637j;

    /* renamed from: k */
    public boolean f3638k;

    /* renamed from: l */
    public int f3639l;

    /* renamed from: m */
    public long f3640m;

    /* renamed from: n */
    public int f3641n;

    /* renamed from: a */
    public final void m2312a(int i) {
        if ((this.f3631d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f3631d));
    }

    /* renamed from: b */
    public final int m2313b() {
        return this.f3634g ? this.f3629b - this.f3630c : this.f3632e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f3628a + ", mData=null, mItemCount=" + this.f3632e + ", mIsMeasuring=" + this.f3636i + ", mPreviousLayoutItemCount=" + this.f3629b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3630c + ", mStructureChanged=" + this.f3633f + ", mInPreLayout=" + this.f3634g + ", mRunSimpleAnimations=" + this.f3637j + ", mRunPredictiveAnimations=" + this.f3638k + '}';
    }
}
