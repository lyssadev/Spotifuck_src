package p035T;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.WeakHashMap;
import p023N.AbstractC0206Q;
import p024N0.RunnableC0268B;
import p087o.C1193v0;

/* renamed from: T.g */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0390g implements View.OnTouchListener {

    /* renamed from: w */
    public static final int f986w = ViewConfiguration.getTapTimeout();

    /* renamed from: f */
    public final C0384a f987f;

    /* renamed from: g */
    public final AccelerateInterpolator f988g;

    /* renamed from: h */
    public final ListView f989h;

    /* renamed from: i */
    public RunnableC0268B f990i;

    /* renamed from: j */
    public final float[] f991j;

    /* renamed from: k */
    public final float[] f992k;

    /* renamed from: l */
    public final int f993l;

    /* renamed from: m */
    public final int f994m;

    /* renamed from: n */
    public final float[] f995n;

    /* renamed from: o */
    public final float[] f996o;

    /* renamed from: p */
    public final float[] f997p;

    /* renamed from: q */
    public boolean f998q;

    /* renamed from: r */
    public boolean f999r;

    /* renamed from: s */
    public boolean f1000s;

    /* renamed from: t */
    public boolean f1001t;

    /* renamed from: u */
    public boolean f1002u;

    /* renamed from: v */
    public final C1193v0 f1003v;

    public ViewOnTouchListenerC0390g(C1193v0 c1193v0) {
        C0384a c0384a = new C0384a();
        c0384a.f981e = Long.MIN_VALUE;
        c0384a.f983g = -1L;
        c0384a.f982f = 0L;
        this.f987f = c0384a;
        this.f988g = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f991j = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f992k = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f995n = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f996o = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f997p = fArr5;
        this.f989h = c1193v0;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        this.f993l = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f994m = f986w;
        c0384a.f977a = 500;
        c0384a.f978b = 500;
        this.f1003v = c1193v0;
    }

    /* renamed from: b */
    public static float m993b(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m994a(int i, float f2, float f3, float f4) {
        float fM993b;
        float interpolation;
        float fM993b2 = m993b(this.f991j[i] * f3, 0.0f, this.f992k[i]);
        float fM995c = m995c(f3 - f2, fM993b2) - m995c(f2, fM993b2);
        AccelerateInterpolator accelerateInterpolator = this.f988g;
        if (fM995c < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-fM995c);
        } else {
            if (fM995c <= 0.0f) {
                fM993b = 0.0f;
                if (fM993b != 0.0f) {
                    return 0.0f;
                }
                float f5 = this.f995n[i];
                float f6 = this.f996o[i];
                float f7 = this.f997p[i];
                float f8 = f5 * f4;
                return fM993b > 0.0f ? m993b(fM993b * f8, f6, f7) : -m993b((-fM993b) * f8, f6, f7);
            }
            interpolation = accelerateInterpolator.getInterpolation(fM995c);
        }
        fM993b = m993b(interpolation, -1.0f, 1.0f);
        if (fM993b != 0.0f) {
        }
    }

    /* renamed from: c */
    public final float m995c(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i = this.f993l;
        if (i == 0 || i == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.f1001t && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    /* renamed from: d */
    public final void m996d() {
        int i = 0;
        if (this.f999r) {
            this.f1001t = false;
            return;
        }
        C0384a c0384a = this.f987f;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (jCurrentAnimationTimeMillis - c0384a.f981e);
        int i3 = c0384a.f978b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c0384a.f985i = i;
        c0384a.f984h = c0384a.m979a(jCurrentAnimationTimeMillis);
        c0384a.f983g = jCurrentAnimationTimeMillis;
    }

    /* renamed from: e */
    public final boolean m997e() {
        C1193v0 c1193v0;
        int count;
        C0384a c0384a = this.f987f;
        float f2 = c0384a.f980d;
        int iAbs = (int) (f2 / Math.abs(f2));
        Math.abs(c0384a.f979c);
        if (iAbs == 0 || (count = (c1193v0 = this.f1003v).getCount()) == 0) {
            return false;
        }
        int childCount = c1193v0.getChildCount();
        int firstVisiblePosition = c1193v0.getFirstVisiblePosition();
        int i = firstVisiblePosition + childCount;
        if (iAbs > 0) {
            if (i >= count && c1193v0.getChildAt(childCount - 1).getBottom() <= c1193v0.getHeight()) {
                return false;
            }
        } else {
            if (iAbs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && c1193v0.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int i2 = 2;
        if (!this.f1002u) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                m996d();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                }
            }
            return false;
        }
        this.f1000s = true;
        this.f998q = false;
        float x2 = motionEvent.getX();
        float width = view.getWidth();
        ListView listView = this.f989h;
        float fM994a = m994a(0, x2, width, listView.getWidth());
        float fM994a2 = m994a(1, motionEvent.getY(), view.getHeight(), listView.getHeight());
        C0384a c0384a = this.f987f;
        c0384a.f979c = fM994a;
        c0384a.f980d = fM994a2;
        if (!this.f1001t && m997e()) {
            if (this.f990i == null) {
                this.f990i = new RunnableC0268B(i2, this);
            }
            this.f1001t = true;
            this.f999r = true;
            if (this.f998q || (i = this.f994m) <= 0) {
                this.f990i.run();
            } else {
                RunnableC0268B runnableC0268B = this.f990i;
                long j2 = i;
                WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                listView.postOnAnimationDelayed(runnableC0268B, j2);
            }
            this.f998q = true;
        }
        return false;
    }
}
