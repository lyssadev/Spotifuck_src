package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.material.timepicker.b */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0701b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: f */
    public final /* synthetic */ ClockFaceView f2648f;

    public ViewTreeObserverOnPreDrawListenerC0701b(ClockFaceView clockFaceView) {
        this.f2648f = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f2648f;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f2630y.f2635i) - clockFaceView.f2623G;
        if (height != clockFaceView.f2651w) {
            clockFaceView.f2651w = height;
            clockFaceView.mo1948m();
            int i = clockFaceView.f2651w;
            ClockHandView clockHandView = clockFaceView.f2630y;
            clockHandView.f2643q = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
