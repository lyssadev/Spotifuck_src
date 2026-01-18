package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import p000A.AbstractC0002c;
import p000A.C0005f;
import p023N.AbstractC0206Q;
import p091p0.AbstractC1230a;
import p094q0.AbstractC1241a;
import p100s0.AbstractC1295a;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC1295a {

    /* renamed from: b */
    public final int f2273b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    /* renamed from: s */
    public static void m1843s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: d */
    public boolean mo64d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC0002c abstractC0002c = ((C0005f) view2.getLayoutParams()).f4a;
        if (abstractC0002c instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC0002c).getClass();
            int i = this.f2273b;
            AbstractC0206Q.m676k(view, bottom - (i == 0 ? 0 : AbstractC1230a.m2895l((int) (0.0f * i), 0, i)));
        }
        return false;
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: h */
    public final boolean mo68h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        m1843s(coordinatorLayout.m1383j(view));
        return false;
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: l */
    public final void mo72l(CoordinatorLayout coordinatorLayout, View view) {
        m1843s(coordinatorLayout.m1383j(view));
    }

    @Override // p100s0.AbstractC1295a
    /* renamed from: r */
    public final void mo1844r(CoordinatorLayout coordinatorLayout, View view, int i) {
        m1843s(coordinatorLayout.m1383j(view));
        coordinatorLayout.m1388q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1241a.f4957u);
        this.f2273b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: b */
    public final void mo62b(View view) {
    }
}
