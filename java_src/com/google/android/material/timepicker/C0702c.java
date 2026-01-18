package com.google.android.material.timepicker;

import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import it.deviato.spotifuck.R;
import p023N.C0217b;
import p025O.C0304f;
import p025O.C0308j;
import p025O.C0309k;

/* renamed from: com.google.android.material.timepicker.c */
/* loaded from: classes.dex */
public final class C0702c extends C0217b {

    /* renamed from: d */
    public final /* synthetic */ ClockFaceView f2649d;

    public C0702c(ClockFaceView clockFaceView) {
        this.f2649d = clockFaceView;
    }

    @Override // p023N.C0217b
    /* renamed from: d */
    public final void mo295d(View view, C0309k c0309k) {
        View.AccessibilityDelegate accessibilityDelegate = this.f575a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0309k.f826a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            View view2 = (View) this.f2649d.f2619C.get(iIntValue - 1);
            if (Build.VERSION.SDK_INT >= 22) {
                accessibilityNodeInfo.setTraversalAfter(view2);
            }
        }
        c0309k.m916i(C0308j.m907a(view.isSelected(), 0, 1, iIntValue, 1));
        accessibilityNodeInfo.setClickable(true);
        c0309k.m910b(C0304f.f812e);
    }

    @Override // p023N.C0217b
    /* renamed from: g */
    public final boolean mo296g(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.mo296g(view, i, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f2649d;
        view.getHitRect(clockFaceView.f2631z);
        float fCenterX = clockFaceView.f2631z.centerX();
        float fCenterY = clockFaceView.f2631z.centerY();
        clockFaceView.f2630y.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.f2630y.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
