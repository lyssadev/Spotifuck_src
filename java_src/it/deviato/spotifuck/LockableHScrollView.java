package it.deviato.spotifuck;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;

/* loaded from: classes.dex */
public class LockableHScrollView extends HorizontalScrollView {

    /* renamed from: f */
    public boolean f3443f;

    public LockableHScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3443f = true;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f3443f && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f3443f && super.onTouchEvent(motionEvent);
    }

    public void setScrollingEnabled(boolean z2) {
        this.f3443f = z2;
    }
}
