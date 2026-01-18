package p087o;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: o.G0 */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC1098G0 implements View.OnTouchListener {

    /* renamed from: f */
    public final /* synthetic */ C1100H0 f4463f;

    public ViewOnTouchListenerC1098G0(C1100H0 c1100h0) {
        this.f4463f = c1100h0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1085A c1085a;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        C1100H0 c1100h0 = this.f4463f;
        if (action == 0 && (c1085a = c1100h0.f4477E) != null && c1085a.isShowing() && x2 >= 0 && x2 < c1100h0.f4477E.getWidth() && y2 >= 0 && y2 < c1100h0.f4477E.getHeight()) {
            c1100h0.f4473A.postDelayed(c1100h0.f4495w, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        c1100h0.f4473A.removeCallbacks(c1100h0.f4495w);
        return false;
    }
}
