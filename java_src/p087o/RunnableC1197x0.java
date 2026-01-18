package p087o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: o.x0 */
/* loaded from: classes.dex */
public final class RunnableC1197x0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f4758a;

    /* renamed from: b */
    public final /* synthetic */ AbstractViewOnTouchListenerC1199y0 f4759b;

    public /* synthetic */ RunnableC1197x0(AbstractViewOnTouchListenerC1199y0 abstractViewOnTouchListenerC1199y0, int i) {
        this.f4758a = i;
        this.f4759b = abstractViewOnTouchListenerC1199y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4758a) {
            case 0:
                ViewParent parent = this.f4759b.f4766i.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC1199y0 abstractViewOnTouchListenerC1199y0 = this.f4759b;
                abstractViewOnTouchListenerC1199y0.m2826a();
                View view = abstractViewOnTouchListenerC1199y0.f4766i;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC1199y0.mo2570c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC1199y0.f4769l = true;
                    break;
                }
                break;
        }
    }
}
