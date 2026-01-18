package p074j0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p023N.AbstractC0206Q;
import p024N0.C0269C;
import p024N0.RunnableC0268B;

/* renamed from: j0.m */
/* loaded from: classes.dex */
public final class C0934m extends AbstractC0893H {

    /* renamed from: C */
    public static final int[] f3769C = {R.attr.state_pressed};

    /* renamed from: D */
    public static final int[] f3770D = new int[0];

    /* renamed from: A */
    public int f3771A;

    /* renamed from: B */
    public final RunnableC0268B f3772B;

    /* renamed from: a */
    public final int f3773a;

    /* renamed from: b */
    public final int f3774b;

    /* renamed from: c */
    public final StateListDrawable f3775c;

    /* renamed from: d */
    public final Drawable f3776d;

    /* renamed from: e */
    public final int f3777e;

    /* renamed from: f */
    public final int f3778f;

    /* renamed from: g */
    public final StateListDrawable f3779g;

    /* renamed from: h */
    public final Drawable f3780h;

    /* renamed from: i */
    public final int f3781i;

    /* renamed from: j */
    public final int f3782j;

    /* renamed from: k */
    public int f3783k;

    /* renamed from: l */
    public int f3784l;

    /* renamed from: m */
    public float f3785m;

    /* renamed from: n */
    public int f3786n;

    /* renamed from: o */
    public int f3787o;

    /* renamed from: p */
    public float f3788p;

    /* renamed from: s */
    public final RecyclerView f3791s;

    /* renamed from: z */
    public final ValueAnimator f3798z;

    /* renamed from: q */
    public int f3789q = 0;

    /* renamed from: r */
    public int f3790r = 0;

    /* renamed from: t */
    public boolean f3792t = false;

    /* renamed from: u */
    public boolean f3793u = false;

    /* renamed from: v */
    public int f3794v = 0;

    /* renamed from: w */
    public int f3795w = 0;

    /* renamed from: x */
    public final int[] f3796x = new int[2];

    /* renamed from: y */
    public final int[] f3797y = new int[2];

    public C0934m(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3798z = valueAnimatorOfFloat;
        this.f3771A = 0;
        RunnableC0268B runnableC0268B = new RunnableC0268B(14, this);
        this.f3772B = runnableC0268B;
        C0931k c0931k = new C0931k(this);
        this.f3775c = stateListDrawable;
        this.f3776d = drawable;
        this.f3779g = stateListDrawable2;
        this.f3780h = drawable2;
        this.f3777e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f3778f = Math.max(i, drawable.getIntrinsicWidth());
        this.f3781i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f3782j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f3773a = i2;
        this.f3774b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C0933l(this));
        valueAnimatorOfFloat.addUpdateListener(new C0269C(1 == true ? 1 : 0, this));
        RecyclerView recyclerView2 = this.f3791s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            AbstractC0896K abstractC0896K = recyclerView2.f2212r;
            if (abstractC0896K != null) {
                abstractC0896K.mo1735c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f2214s;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m1768N();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f3791s;
            recyclerView3.f2216t.remove(this);
            if (recyclerView3.f2218u == this) {
                recyclerView3.f2218u = null;
            }
            ArrayList arrayList2 = this.f3791s.f2201l0;
            if (arrayList2 != null) {
                arrayList2.remove(c0931k);
            }
            this.f3791s.removeCallbacks(runnableC0268B);
        }
        this.f3791s = recyclerView;
        if (recyclerView != null) {
            recyclerView.m1787g(this);
            this.f3791s.f2216t.add(this);
            this.f3791s.m1788h(c0931k);
        }
    }

    /* renamed from: f */
    public static int m2379f(float f2, float f3, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f3 - f2) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    @Override // p074j0.AbstractC0893H
    /* renamed from: c */
    public final void mo1984c(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f3789q;
        RecyclerView recyclerView2 = this.f3791s;
        if (i != recyclerView2.getWidth() || this.f3790r != recyclerView2.getHeight()) {
            this.f3789q = recyclerView2.getWidth();
            this.f3790r = recyclerView2.getHeight();
            m2382g(0);
            return;
        }
        if (this.f3771A != 0) {
            if (this.f3792t) {
                int i2 = this.f3789q;
                int i3 = this.f3777e;
                int i4 = i2 - i3;
                int i5 = this.f3784l;
                int i6 = this.f3783k;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f3775c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f3790r;
                int i9 = this.f3778f;
                Drawable drawable = this.f3776d;
                drawable.setBounds(0, 0, i9, i8);
                WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.f3793u) {
                int i10 = this.f3790r;
                int i11 = this.f3781i;
                int i12 = i10 - i11;
                int i13 = this.f3787o;
                int i14 = this.f3786n;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.f3779g;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.f3789q;
                int i17 = this.f3782j;
                Drawable drawable2 = this.f3780h;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(0.0f, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    /* renamed from: d */
    public final boolean m2380d(float f2, float f3) {
        if (f3 >= this.f3790r - this.f3781i) {
            int i = this.f3787o;
            int i2 = this.f3786n;
            if (f2 >= i - (i2 / 2) && f2 <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m2381e(float f2, float f3) {
        RecyclerView recyclerView = this.f3791s;
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i = this.f3777e;
        if (z2) {
            if (f2 > i / 2) {
                return false;
            }
        } else if (f2 < this.f3789q - i) {
            return false;
        }
        int i2 = this.f3784l;
        int i3 = this.f3783k / 2;
        return f3 >= ((float) (i2 - i3)) && f3 <= ((float) (i3 + i2));
    }

    /* renamed from: g */
    public final void m2382g(int i) {
        RunnableC0268B runnableC0268B = this.f3772B;
        StateListDrawable stateListDrawable = this.f3775c;
        if (i == 2 && this.f3794v != 2) {
            stateListDrawable.setState(f3769C);
            this.f3791s.removeCallbacks(runnableC0268B);
        }
        if (i == 0) {
            this.f3791s.invalidate();
        } else {
            m2383h();
        }
        if (this.f3794v == 2 && i != 2) {
            stateListDrawable.setState(f3770D);
            this.f3791s.removeCallbacks(runnableC0268B);
            this.f3791s.postDelayed(runnableC0268B, 1200);
        } else if (i == 1) {
            this.f3791s.removeCallbacks(runnableC0268B);
            this.f3791s.postDelayed(runnableC0268B, 1500);
        }
        this.f3794v = i;
    }

    /* renamed from: h */
    public final void m2383h() {
        int i = this.f3771A;
        ValueAnimator valueAnimator = this.f3798z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f3771A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
