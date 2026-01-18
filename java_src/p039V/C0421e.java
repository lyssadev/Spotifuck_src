package p039V;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Arrays;
import p023N.AbstractC0206Q;
import p024N0.RunnableC0268B;
import p036T0.AbstractC0411g;

/* renamed from: V.e */
/* loaded from: classes.dex */
public final class C0421e {

    /* renamed from: v */
    public static final InterpolatorC0420d f1054v = new InterpolatorC0420d(0);

    /* renamed from: a */
    public int f1055a;

    /* renamed from: b */
    public final int f1056b;

    /* renamed from: d */
    public float[] f1058d;

    /* renamed from: e */
    public float[] f1059e;

    /* renamed from: f */
    public float[] f1060f;

    /* renamed from: g */
    public float[] f1061g;

    /* renamed from: h */
    public int[] f1062h;

    /* renamed from: i */
    public int[] f1063i;

    /* renamed from: j */
    public int[] f1064j;

    /* renamed from: k */
    public int f1065k;

    /* renamed from: l */
    public VelocityTracker f1066l;

    /* renamed from: m */
    public final float f1067m;

    /* renamed from: n */
    public final float f1068n;

    /* renamed from: o */
    public final int f1069o;

    /* renamed from: p */
    public final OverScroller f1070p;

    /* renamed from: q */
    public final AbstractC0411g f1071q;

    /* renamed from: r */
    public View f1072r;

    /* renamed from: s */
    public boolean f1073s;

    /* renamed from: t */
    public final CoordinatorLayout f1074t;

    /* renamed from: c */
    public int f1057c = -1;

    /* renamed from: u */
    public final RunnableC0268B f1075u = new RunnableC0268B(3, this);

    public C0421e(Context context, CoordinatorLayout coordinatorLayout, AbstractC0411g abstractC0411g) {
        if (coordinatorLayout == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0411g == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f1074t = coordinatorLayout;
        this.f1071q = abstractC0411g;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1069o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f1056b = viewConfiguration.getScaledTouchSlop();
        this.f1067m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1068n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1070p = new OverScroller(context, f1054v);
    }

    /* renamed from: a */
    public final void m1073a() {
        this.f1057c = -1;
        float[] fArr = this.f1058d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f1059e, 0.0f);
            Arrays.fill(this.f1060f, 0.0f);
            Arrays.fill(this.f1061g, 0.0f);
            Arrays.fill(this.f1062h, 0);
            Arrays.fill(this.f1063i, 0);
            Arrays.fill(this.f1064j, 0);
            this.f1065k = 0;
        }
        VelocityTracker velocityTracker = this.f1066l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1066l = null;
        }
    }

    /* renamed from: b */
    public final void m1074b(View view, int i) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f1074t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f1072r = view;
        this.f1057c = i;
        this.f1071q.mo1050C(view, i);
        m1086n(1);
    }

    /* renamed from: c */
    public final boolean m1075c(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        AbstractC0411g abstractC0411g = this.f1071q;
        boolean z2 = abstractC0411g.mo579r(view) > 0;
        boolean z3 = abstractC0411g.mo580s() > 0;
        if (!z2 || !z3) {
            return z2 ? Math.abs(f2) > ((float) this.f1056b) : z3 && Math.abs(f3) > ((float) this.f1056b);
        }
        float f4 = (f3 * f3) + (f2 * f2);
        int i = this.f1056b;
        return f4 > ((float) (i * i));
    }

    /* renamed from: d */
    public final void m1076d(int i) {
        float[] fArr = this.f1058d;
        if (fArr != null) {
            int i2 = this.f1065k;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.f1059e[i] = 0.0f;
                this.f1060f[i] = 0.0f;
                this.f1061g[i] = 0.0f;
                this.f1062h[i] = 0;
                this.f1063i[i] = 0;
                this.f1064j[i] = 0;
                this.f1065k = (~i3) & i2;
            }
        }
    }

    /* renamed from: e */
    public final int m1077e(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.f1074t.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: f */
    public final boolean m1078f() {
        if (this.f1055a == 2) {
            OverScroller overScroller = this.f1070p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f1072r.getLeft();
            int top = currY - this.f1072r.getTop();
            if (left != 0) {
                AbstractC0206Q.m675j(this.f1072r, left);
            }
            if (top != 0) {
                AbstractC0206Q.m676k(this.f1072r, top);
            }
            if (left != 0 || top != 0) {
                this.f1071q.mo574E(this.f1072r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f1074t.post(this.f1075u);
            }
        }
        return this.f1055a == 2;
    }

    /* renamed from: g */
    public final View m1079g(int i, int i2) {
        CoordinatorLayout coordinatorLayout = this.f1074t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f1071q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: h */
    public final boolean m1080h(int i, int i2, int i3, int i4) {
        float f2;
        float f3;
        float f4;
        float f5;
        int left = this.f1072r.getLeft();
        int top = this.f1072r.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.f1070p;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            m1086n(0);
            return false;
        }
        View view = this.f1072r;
        int i7 = (int) this.f1068n;
        int i8 = (int) this.f1067m;
        int iAbs = Math.abs(i3);
        if (iAbs < i7) {
            i3 = 0;
        } else if (iAbs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int iAbs2 = Math.abs(i4);
        if (iAbs2 < i7) {
            i4 = 0;
        } else if (iAbs2 > i8) {
            i4 = i4 > 0 ? i8 : -i8;
        }
        int iAbs3 = Math.abs(i5);
        int iAbs4 = Math.abs(i6);
        int iAbs5 = Math.abs(i3);
        int iAbs6 = Math.abs(i4);
        int i9 = iAbs5 + iAbs6;
        int i10 = iAbs3 + iAbs4;
        if (i3 != 0) {
            f2 = iAbs5;
            f3 = i9;
        } else {
            f2 = iAbs3;
            f3 = i10;
        }
        float f6 = f2 / f3;
        if (i4 != 0) {
            f4 = iAbs6;
            f5 = i9;
        } else {
            f4 = iAbs4;
            f5 = i10;
        }
        float f7 = f4 / f5;
        AbstractC0411g abstractC0411g = this.f1071q;
        overScroller.startScroll(left, top, i5, i6, (int) ((m1077e(i6, i4, abstractC0411g.mo580s()) * f7) + (m1077e(i5, i3, abstractC0411g.mo579r(view)) * f6)));
        m1086n(2);
        return true;
    }

    /* renamed from: i */
    public final boolean m1081i(int i) {
        if ((this.f1065k & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: j */
    public final void m1082j(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m1073a();
        }
        if (this.f1066l == null) {
            this.f1066l = VelocityTracker.obtain();
        }
        this.f1066l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM1079g = m1079g((int) x2, (int) y2);
            m1084l(x2, y2, pointerId);
            m1089q(viewM1079g, pointerId);
            int i3 = this.f1062h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f1055a == 1) {
                m1083k();
            }
            m1073a();
            return;
        }
        AbstractC0411g abstractC0411g = this.f1071q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f1055a == 1) {
                    this.f1073s = true;
                    abstractC0411g.mo575F(this.f1072r, 0.0f, 0.0f);
                    this.f1073s = false;
                    if (this.f1055a == 1) {
                        m1086n(0);
                    }
                }
                m1073a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x3 = motionEvent.getX(actionIndex);
                float y3 = motionEvent.getY(actionIndex);
                m1084l(x3, y3, pointerId2);
                if (this.f1055a == 0) {
                    m1089q(m1079g((int) x3, (int) y3), pointerId2);
                    int i4 = this.f1062h[pointerId2];
                    return;
                }
                int i5 = (int) x3;
                int i6 = (int) y3;
                View view = this.f1072r;
                if (view != null && i5 >= view.getLeft() && i5 < view.getRight() && i6 >= view.getTop() && i6 < view.getBottom()) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    m1089q(this.f1072r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f1055a == 1 && pointerId3 == this.f1057c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.f1057c) {
                        View viewM1079g2 = m1079g((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view2 = this.f1072r;
                        if (viewM1079g2 == view2 && m1089q(view2, pointerId4)) {
                            i = this.f1057c;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    m1083k();
                }
            }
            m1076d(pointerId3);
            return;
        }
        if (this.f1055a == 1) {
            if (m1081i(this.f1057c)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f1057c);
                float x4 = motionEvent.getX(iFindPointerIndex);
                float y4 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f1060f;
                int i7 = this.f1057c;
                int i8 = (int) (x4 - fArr[i7]);
                int i9 = (int) (y4 - this.f1061g[i7]);
                int left = this.f1072r.getLeft() + i8;
                int top = this.f1072r.getTop() + i9;
                int left2 = this.f1072r.getLeft();
                int top2 = this.f1072r.getTop();
                if (i8 != 0) {
                    left = abstractC0411g.mo577f(this.f1072r, left);
                    AbstractC0206Q.m675j(this.f1072r, left - left2);
                }
                if (i9 != 0) {
                    top = abstractC0411g.mo578g(this.f1072r, top);
                    AbstractC0206Q.m676k(this.f1072r, top - top2);
                }
                if (i8 != 0 || i9 != 0) {
                    abstractC0411g.mo574E(this.f1072r, left, top);
                }
                m1085m(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i2 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i2);
            if (m1081i(pointerId5)) {
                float x5 = motionEvent.getX(i2);
                float y5 = motionEvent.getY(i2);
                float f2 = x5 - this.f1058d[pointerId5];
                float f3 = y5 - this.f1059e[pointerId5];
                Math.abs(f2);
                Math.abs(f3);
                int i10 = this.f1062h[pointerId5];
                Math.abs(f3);
                Math.abs(f2);
                int i11 = this.f1062h[pointerId5];
                Math.abs(f2);
                Math.abs(f3);
                int i12 = this.f1062h[pointerId5];
                Math.abs(f3);
                Math.abs(f2);
                int i13 = this.f1062h[pointerId5];
                if (this.f1055a != 1) {
                    View viewM1079g3 = m1079g((int) x5, (int) y5);
                    if (m1075c(viewM1079g3, f2, f3) && m1089q(viewM1079g3, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i2++;
        }
        m1085m(motionEvent);
    }

    /* renamed from: k */
    public final void m1083k() {
        VelocityTracker velocityTracker = this.f1066l;
        float f2 = this.f1067m;
        velocityTracker.computeCurrentVelocity(1000, f2);
        float xVelocity = this.f1066l.getXVelocity(this.f1057c);
        float f3 = this.f1068n;
        float fAbs = Math.abs(xVelocity);
        float f4 = 0.0f;
        if (fAbs < f3) {
            xVelocity = 0.0f;
        } else if (fAbs > f2) {
            xVelocity = xVelocity > 0.0f ? f2 : -f2;
        }
        float yVelocity = this.f1066l.getYVelocity(this.f1057c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 >= f3) {
            if (fAbs2 > f2) {
                if (yVelocity <= 0.0f) {
                    f2 = -f2;
                }
                f4 = f2;
            } else {
                f4 = yVelocity;
            }
        }
        this.f1073s = true;
        this.f1071q.mo575F(this.f1072r, xVelocity, f4);
        this.f1073s = false;
        if (this.f1055a == 1) {
            m1086n(0);
        }
    }

    /* renamed from: l */
    public final void m1084l(float f2, float f3, int i) {
        float[] fArr = this.f1058d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f1059e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f1060f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f1061g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f1062h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f1063i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f1064j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f1058d = fArr2;
            this.f1059e = fArr3;
            this.f1060f = fArr4;
            this.f1061g = fArr5;
            this.f1062h = iArr;
            this.f1063i = iArr2;
            this.f1064j = iArr3;
        }
        float[] fArr9 = this.f1058d;
        this.f1060f[i] = f2;
        fArr9[i] = f2;
        float[] fArr10 = this.f1059e;
        this.f1061g[i] = f3;
        fArr10[i] = f3;
        int[] iArr7 = this.f1062h;
        int i3 = (int) f2;
        int i4 = (int) f3;
        CoordinatorLayout coordinatorLayout = this.f1074t;
        int left = coordinatorLayout.getLeft();
        int i5 = this.f1069o;
        int i6 = i3 < left + i5 ? 1 : 0;
        if (i4 < coordinatorLayout.getTop() + i5) {
            i6 |= 4;
        }
        if (i3 > coordinatorLayout.getRight() - i5) {
            i6 |= 2;
        }
        if (i4 > coordinatorLayout.getBottom() - i5) {
            i6 |= 8;
        }
        iArr7[i] = i6;
        this.f1065k |= 1 << i;
    }

    /* renamed from: m */
    public final void m1085m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m1081i(pointerId)) {
                float x2 = motionEvent.getX(i);
                float y2 = motionEvent.getY(i);
                this.f1060f[pointerId] = x2;
                this.f1061g[pointerId] = y2;
            }
        }
    }

    /* renamed from: n */
    public final void m1086n(int i) {
        this.f1074t.removeCallbacks(this.f1075u);
        if (this.f1055a != i) {
            this.f1055a = i;
            this.f1071q.mo573D(i);
            if (this.f1055a == 0) {
                this.f1072r = null;
            }
        }
    }

    /* renamed from: o */
    public final boolean m1087o(int i, int i2) {
        if (this.f1073s) {
            return m1080h(i, i2, (int) this.f1066l.getXVelocity(this.f1057c), (int) this.f1066l.getYVelocity(this.f1057c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1088p(MotionEvent motionEvent) {
        View viewM1079g;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m1073a();
        }
        if (this.f1066l == null) {
            this.f1066l = VelocityTracker.obtain();
        }
        this.f1066l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            m1084l(x2, y2, pointerId);
            View viewM1079g2 = m1079g((int) x2, (int) y2);
            if (viewM1079g2 == this.f1072r && this.f1055a == 2) {
                m1089q(viewM1079g2, pointerId);
            }
            int i = this.f1062h[pointerId];
        } else if (actionMasked == 1) {
            m1073a();
        } else if (actionMasked != 2) {
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId2 = motionEvent.getPointerId(actionIndex);
                    float x3 = motionEvent.getX(actionIndex);
                    float y3 = motionEvent.getY(actionIndex);
                    m1084l(x3, y3, pointerId2);
                    int i2 = this.f1055a;
                    if (i2 == 0) {
                        int i3 = this.f1062h[pointerId2];
                    } else if (i2 == 2 && (viewM1079g = m1079g((int) x3, (int) y3)) == this.f1072r) {
                        m1089q(viewM1079g, pointerId2);
                    }
                } else if (actionMasked == 6) {
                    m1076d(motionEvent.getPointerId(actionIndex));
                }
            }
        } else if (this.f1058d != null && this.f1059e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i4 = 0; i4 < pointerCount; i4++) {
                int pointerId3 = motionEvent.getPointerId(i4);
                if (m1081i(pointerId3)) {
                    float x4 = motionEvent.getX(i4);
                    float y4 = motionEvent.getY(i4);
                    float f2 = x4 - this.f1058d[pointerId3];
                    float f3 = y4 - this.f1059e[pointerId3];
                    View viewM1079g3 = m1079g((int) x4, (int) y4);
                    boolean z2 = viewM1079g3 != null && m1075c(viewM1079g3, f2, f3);
                    if (z2) {
                        int left = viewM1079g3.getLeft();
                        AbstractC0411g abstractC0411g = this.f1071q;
                        int iMo577f = abstractC0411g.mo577f(viewM1079g3, ((int) f2) + left);
                        int top = viewM1079g3.getTop();
                        int iMo578g = abstractC0411g.mo578g(viewM1079g3, ((int) f3) + top);
                        int iMo579r = abstractC0411g.mo579r(viewM1079g3);
                        int iMo580s = abstractC0411g.mo580s();
                        if ((iMo579r == 0 || (iMo579r > 0 && iMo577f == left)) && (iMo580s == 0 || (iMo580s > 0 && iMo578g == top))) {
                            break;
                        }
                        Math.abs(f2);
                        Math.abs(f3);
                        int i5 = this.f1062h[pointerId3];
                        Math.abs(f3);
                        Math.abs(f2);
                        int i6 = this.f1062h[pointerId3];
                        Math.abs(f2);
                        Math.abs(f3);
                        int i7 = this.f1062h[pointerId3];
                        Math.abs(f3);
                        Math.abs(f2);
                        int i8 = this.f1062h[pointerId3];
                        if (this.f1055a == 1 || (z2 && m1089q(viewM1079g3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            m1085m(motionEvent);
        }
        return this.f1055a == 1;
    }

    /* renamed from: q */
    public final boolean m1089q(View view, int i) {
        if (view == this.f1072r && this.f1057c == i) {
            return true;
        }
        if (view == null || !this.f1071q.mo576S(view, i)) {
            return false;
        }
        this.f1057c = i;
        m1074b(view, i);
        return true;
    }
}
