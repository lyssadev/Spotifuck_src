package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000A.AbstractC0002c;
import p023N.AbstractC0206Q;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends AbstractC0002c {
    public ExpandableBehavior() {
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: b */
    public abstract void mo62b(View view);

    @Override // p000A.AbstractC0002c
    /* renamed from: d */
    public final boolean mo64d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: g */
    public final boolean mo67g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        if (!view.isLaidOut()) {
            ArrayList arrayListM1383j = coordinatorLayout.m1383j(view);
            int size = arrayListM1383j.size();
            for (int i2 = 0; i2 < size; i2++) {
                mo62b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
