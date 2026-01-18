package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import it.deviato.spotifuck.R;
import java.util.WeakHashMap;
import p003C.RunnableC0014a;
import p018K0.C0148g;
import p018K0.C0149h;
import p018K0.C0151j;
import p023N.AbstractC0206Q;
import p094q0.AbstractC1241a;

/* renamed from: com.google.android.material.timepicker.e */
/* loaded from: classes.dex */
public abstract class AbstractC0704e extends ConstraintLayout {

    /* renamed from: v */
    public final RunnableC0014a f2650v;

    /* renamed from: w */
    public int f2651w;

    /* renamed from: x */
    public final C0148g f2652x;

    public AbstractC0704e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C0148g c0148g = new C0148g();
        this.f2652x = c0148g;
        C0149h c0149h = new C0149h(0.5f);
        C0151j c0151jM527e = c0148g.f410f.f392a.m527e();
        c0151jM527e.f436e = c0149h;
        c0151jM527e.f437f = c0149h;
        c0151jM527e.f438g = c0149h;
        c0151jM527e.f439h = c0149h;
        c0148g.setShapeAppearanceModel(c0151jM527e.m522a());
        this.f2652x.m517j(ColorStateList.valueOf(-1));
        C0148g c0148g2 = this.f2652x;
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        setBackground(c0148g2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1241a.f4956t, R.attr.materialClockStyle, 0);
        this.f2651w = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f2650v = new RunnableC0014a(12, this);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0014a runnableC0014a = this.f2650v;
            handler.removeCallbacks(runnableC0014a);
            handler.post(runnableC0014a);
        }
    }

    /* renamed from: m */
    public abstract void mo1948m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo1948m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0014a runnableC0014a = this.f2650v;
            handler.removeCallbacks(runnableC0014a);
            handler.post(runnableC0014a);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f2652x.m517j(ColorStateList.valueOf(i));
    }
}
