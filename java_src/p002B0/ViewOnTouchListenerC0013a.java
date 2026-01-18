package p002B0;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: B0.a */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0013a implements View.OnTouchListener {

    /* renamed from: f */
    public final Dialog f34f;

    /* renamed from: g */
    public final int f35g;

    /* renamed from: h */
    public final int f36h;

    /* renamed from: i */
    public final int f37i;

    public ViewOnTouchListenerC0013a(Dialog dialog, Rect rect) {
        this.f34f = dialog;
        this.f35g = rect.left;
        this.f36h = rect.top;
        this.f37i = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f35g;
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, viewFindViewById.getTop() + this.f36h, width, viewFindViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i = this.f37i;
            motionEventObtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f34f.onTouchEvent(motionEventObtain);
    }
}
