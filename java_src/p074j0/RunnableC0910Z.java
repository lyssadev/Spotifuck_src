package p074j0;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;
import p023N.AbstractC0206Q;
import p039V.InterpolatorC0420d;

/* renamed from: j0.Z */
/* loaded from: classes.dex */
public final class RunnableC0910Z implements Runnable {

    /* renamed from: a */
    public int f3642a;

    /* renamed from: b */
    public int f3643b;

    /* renamed from: c */
    public OverScroller f3644c;

    /* renamed from: d */
    public Interpolator f3645d;

    /* renamed from: e */
    public boolean f3646e;

    /* renamed from: f */
    public boolean f3647f;

    /* renamed from: g */
    public final /* synthetic */ RecyclerView f3648g;

    public RunnableC0910Z(RecyclerView recyclerView) {
        this.f3648g = recyclerView;
        InterpolatorC0420d interpolatorC0420d = RecyclerView.f2158E0;
        this.f3645d = interpolatorC0420d;
        this.f3646e = false;
        this.f3647f = false;
        this.f3644c = new OverScroller(recyclerView.getContext(), interpolatorC0420d);
    }

    /* renamed from: a */
    public final void m2314a() {
        if (this.f3646e) {
            this.f3647f = true;
            return;
        }
        RecyclerView recyclerView = this.f3648g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        recyclerView.postOnAnimation(this);
    }

    /* renamed from: b */
    public final void m2315b(int i, int i2, int i3, Interpolator interpolator) {
        int iRound;
        RecyclerView recyclerView = this.f3648g;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z2 = iAbs > iAbs2;
            int iSqrt = (int) Math.sqrt(0);
            int iSqrt2 = (int) Math.sqrt((i2 * i2) + (i * i));
            int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i4 = width / 2;
            float f2 = width;
            float f3 = i4;
            float fSin = (((float) Math.sin((Math.min(1.0f, (iSqrt2 * 1.0f) / f2) - 0.5f) * 0.47123894f)) * f3) + f3;
            if (iSqrt > 0) {
                iRound = Math.round(Math.abs(fSin / iSqrt) * 1000.0f) * 4;
            } else {
                if (!z2) {
                    iAbs = iAbs2;
                }
                iRound = (int) (((iAbs / f2) + 1.0f) * 300.0f);
            }
            i3 = Math.min(iRound, 2000);
        }
        int i5 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.f2158E0;
        }
        if (this.f3645d != interpolator) {
            this.f3645d = interpolator;
            this.f3644c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f3643b = 0;
        this.f3642a = 0;
        recyclerView.setScrollState(2);
        this.f3644c.startScroll(0, 0, i, i2, i5);
        if (Build.VERSION.SDK_INT < 23) {
            this.f3644c.computeScrollOffset();
        }
        m2314a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.f3648g;
        if (recyclerView.f2212r == null) {
            recyclerView.removeCallbacks(this);
            this.f3644c.abortAnimation();
            return;
        }
        this.f3647f = false;
        this.f3646e = true;
        recyclerView.m1792m();
        OverScroller overScroller = this.f3644c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.f3642a;
            int i6 = currY - this.f3643b;
            this.f3642a = currX;
            this.f3643b = currY;
            int[] iArr = recyclerView.f2221v0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean zM1797r = recyclerView.m1797r(i5, i6, iArr, null, 1);
            int[] iArr2 = recyclerView.f2221v0;
            if (zM1797r) {
                i5 -= iArr2[0];
                i6 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.m1791l(i5, i6);
            }
            if (recyclerView.f2210q != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.m1780Z(i5, i6, iArr2);
                int i7 = iArr2[0];
                int i8 = iArr2[1];
                int i9 = i5 - i7;
                int i10 = i6 - i8;
                C0943v c0943v = recyclerView.f2212r.f3590e;
                if (c0943v != null && !c0943v.f3848d && c0943v.f3849e) {
                    int iM2313b = recyclerView.f2197j0.m2313b();
                    if (iM2313b == 0) {
                        c0943v.m2402i();
                    } else if (c0943v.f3845a >= iM2313b) {
                        c0943v.f3845a = iM2313b - 1;
                        c0943v.m2400g(i7, i8);
                    } else {
                        c0943v.m2400g(i7, i8);
                    }
                }
                i4 = i7;
                i = i9;
                i2 = i10;
                i3 = i8;
            } else {
                i = i5;
                i2 = i6;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.f2214s.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f2221v0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i11 = i3;
            recyclerView.m1798s(i4, i3, i, i2, null, 1, iArr3);
            int i12 = i - iArr2[0];
            int i13 = i2 - iArr2[1];
            if (i4 != 0 || i11 != 0) {
                recyclerView.m1799t(i4, i11);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z2 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
            C0943v c0943v2 = recyclerView.f2212r.f3590e;
            if ((c0943v2 == null || !c0943v2.f3848d) && z2) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i14 = i12 < 0 ? -currVelocity : i12 > 0 ? currVelocity : 0;
                    if (i13 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i13 <= 0) {
                        currVelocity = 0;
                    }
                    if (i14 < 0) {
                        recyclerView.m1801v();
                        if (recyclerView.f2170K.isFinished()) {
                            recyclerView.f2170K.onAbsorb(-i14);
                        }
                    } else if (i14 > 0) {
                        recyclerView.m1802w();
                        if (recyclerView.f2172M.isFinished()) {
                            recyclerView.f2172M.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.m1803x();
                        if (recyclerView.f2171L.isFinished()) {
                            recyclerView.f2171L.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.m1800u();
                        if (recyclerView.f2173N.isFinished()) {
                            recyclerView.f2173N.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f2156C0) {
                    C0935n c0935n = recyclerView.f2195i0;
                    int[] iArr4 = c0935n.f3801c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c0935n.f3802d = 0;
                }
            } else {
                m2314a();
                RunnableC0937p runnableC0937p = recyclerView.f2193h0;
                if (runnableC0937p != null) {
                    runnableC0937p.m2387a(recyclerView, i4, i11);
                }
            }
        }
        C0943v c0943v3 = recyclerView.f2212r.f3590e;
        if (c0943v3 != null && c0943v3.f3848d) {
            c0943v3.m2400g(0, 0);
        }
        this.f3646e = false;
        if (!this.f3647f) {
            recyclerView.setScrollState(0);
            recyclerView.m1785e0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = AbstractC0206Q.f560a;
            recyclerView.postOnAnimation(this);
        }
    }
}
