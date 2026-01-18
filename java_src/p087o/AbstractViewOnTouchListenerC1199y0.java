package p087o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import p084n.InterfaceC1021B;

/* renamed from: o.y0 */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC1199y0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: f */
    public final float f4763f;

    /* renamed from: g */
    public final int f4764g;

    /* renamed from: h */
    public final int f4765h;

    /* renamed from: i */
    public final View f4766i;

    /* renamed from: j */
    public RunnableC1197x0 f4767j;

    /* renamed from: k */
    public RunnableC1197x0 f4768k;

    /* renamed from: l */
    public boolean f4769l;

    /* renamed from: m */
    public int f4770m;

    /* renamed from: n */
    public final int[] f4771n = new int[2];

    public AbstractViewOnTouchListenerC1199y0(View view) {
        this.f4766i = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f4763f = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f4764g = tapTimeout;
        this.f4765h = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* renamed from: a */
    public final void m2826a() {
        RunnableC1197x0 runnableC1197x0 = this.f4768k;
        View view = this.f4766i;
        if (runnableC1197x0 != null) {
            view.removeCallbacks(runnableC1197x0);
        }
        RunnableC1197x0 runnableC1197x02 = this.f4767j;
        if (runnableC1197x02 != null) {
            view.removeCallbacks(runnableC1197x02);
        }
    }

    /* renamed from: b */
    public abstract InterfaceC1021B mo2569b();

    /* renamed from: c */
    public abstract boolean mo2570c();

    /* renamed from: d */
    public boolean mo2571d() {
        InterfaceC1021B interfaceC1021BMo2569b = mo2569b();
        if (interfaceC1021BMo2569b == null || !interfaceC1021BMo2569b.mo2544a()) {
            return true;
        }
        interfaceC1021BMo2569b.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException {
        boolean z2;
        C1193v0 c1193v0Mo2545e;
        boolean z3 = this.f4769l;
        View view2 = this.f4766i;
        if (z3) {
            InterfaceC1021B interfaceC1021BMo2569b = mo2569b();
            if (interfaceC1021BMo2569b == null || !interfaceC1021BMo2569b.mo2544a() || (c1193v0Mo2545e = interfaceC1021BMo2569b.mo2545e()) == null || !c1193v0Mo2545e.isShown()) {
                z2 = !mo2571d();
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f4771n;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                c1193v0Mo2545e.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zM2823b = c1193v0Mo2545e.m2823b(motionEventObtainNoHistory, this.f4770m);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z4 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (!zM2823b || !z4) {
                }
            }
        } else if (view2.isEnabled()) {
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0) {
                this.f4770m = motionEvent.getPointerId(0);
                if (this.f4767j == null) {
                    this.f4767j = new RunnableC1197x0(this, 0);
                }
                view2.postDelayed(this.f4767j, this.f4764g);
                if (this.f4768k == null) {
                    this.f4768k = new RunnableC1197x0(this, 1);
                }
                view2.postDelayed(this.f4768k, this.f4765h);
            } else if (actionMasked2 == 1) {
                m2826a();
            } else if (actionMasked2 == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f4770m);
                if (iFindPointerIndex >= 0) {
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float f2 = this.f4763f;
                    float f3 = -f2;
                    if (x2 < f3 || y2 < f3 || x2 >= (view2.getRight() - view2.getLeft()) + f2 || y2 >= (view2.getBottom() - view2.getTop()) + f2) {
                        m2826a();
                        view2.getParent().requestDisallowInterceptTouchEvent(true);
                        z2 = mo2570c();
                        if (z2) {
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                            view2.onTouchEvent(motionEventObtain);
                            motionEventObtain.recycle();
                        }
                    }
                }
            } else if (actionMasked2 == 3) {
            }
            if (z2) {
            }
        } else {
            if (z2) {
            }
        }
        this.f4769l = z2;
        return z2 || z3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f4769l = false;
        this.f4770m = -1;
        RunnableC1197x0 runnableC1197x0 = this.f4767j;
        if (runnableC1197x0 != null) {
            this.f4766i.removeCallbacks(runnableC1197x0);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
