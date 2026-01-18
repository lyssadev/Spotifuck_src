package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import it.deviato.spotifuck.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p023N.AbstractC0206Q;
import p091p0.AbstractC1230a;
import p094q0.AbstractC1241a;
import p111y.C1350i;
import p111y.C1351j;
import p111y.C1355n;

/* loaded from: classes.dex */
class ClockFaceView extends AbstractC0704e implements InterfaceC0703d {

    /* renamed from: A */
    public final RectF f2617A;

    /* renamed from: B */
    public final Rect f2618B;

    /* renamed from: C */
    public final SparseArray f2619C;

    /* renamed from: D */
    public final C0702c f2620D;

    /* renamed from: E */
    public final int[] f2621E;

    /* renamed from: F */
    public final float[] f2622F;

    /* renamed from: G */
    public final int f2623G;

    /* renamed from: H */
    public final int f2624H;

    /* renamed from: I */
    public final int f2625I;

    /* renamed from: J */
    public final int f2626J;

    /* renamed from: K */
    public final String[] f2627K;

    /* renamed from: L */
    public float f2628L;

    /* renamed from: M */
    public final ColorStateList f2629M;

    /* renamed from: y */
    public final ClockHandView f2630y;

    /* renamed from: z */
    public final Rect f2631z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2631z = new Rect();
        this.f2617A = new RectF();
        this.f2618B = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f2619C = sparseArray;
        this.f2622F = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1241a.f4940d, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListM2871J = AbstractC1230a.m2871J(context, typedArrayObtainStyledAttributes, 1);
        this.f2629M = colorStateListM2871J;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f2630y = clockHandView;
        this.f2623G = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListM2871J.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListM2871J.getDefaultColor());
        this.f2621E = new int[]{colorForState, colorForState, colorStateListM2871J.getDefaultColor()};
        clockHandView.f2634h.add(this);
        int defaultColor = AbstractC1230a.m2870I(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListM2871J2 = AbstractC1230a.m2871J(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListM2871J2 != null ? colorStateListM2871J2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0701b(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f2620D = new C0702c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f2627K = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z2 = false;
        for (int i = 0; i < Math.max(this.f2627K.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.f2627K.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.f2627K[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i2 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i2));
                z2 = i2 > 1 ? true : z2;
                AbstractC0206Q.m681p(textView, this.f2620D);
                textView.setTextColor(this.f2629M);
            }
        }
        ClockHandView clockHandView2 = this.f2630y;
        if (clockHandView2.f2633g && !z2) {
            clockHandView2.f2644r = 1;
        }
        clockHandView2.f2633g = z2;
        clockHandView2.invalidate();
        this.f2624H = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f2625I = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f2626J = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.AbstractC0704e
    /* renamed from: m */
    public final void mo1948m() {
        C1355n c1355n = new C1355n();
        c1355n.m3280b(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!map.containsKey(i2)) {
                    map.put(i2, new ArrayList());
                }
                ((List) map.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f2651w * 0.66f) : this.f2651w;
            Iterator it2 = list.iterator();
            float size = 0.0f;
            while (it2.hasNext()) {
                int id = ((View) it2.next()).getId();
                HashMap map2 = c1355n.f5660c;
                if (!map2.containsKey(Integer.valueOf(id))) {
                    map2.put(Integer.valueOf(id), new C1350i());
                }
                C1351j c1351j = ((C1350i) map2.get(Integer.valueOf(id))).f5556d;
                c1351j.f5626z = R.id.circle_center;
                c1351j.f5560A = iRound;
                c1351j.f5561B = size;
                size += 360.0f / list.size();
            }
        }
        c1355n.m3279a(this);
        setConstraintSet(null);
        requestLayout();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f2619C;
            if (i3 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i3)).setVisibility(0);
            i3++;
        }
    }

    /* renamed from: n */
    public final void m1949n() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f2630y.f2638l;
        float f2 = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f2619C;
            int size = sparseArray.size();
            rectF = this.f2617A;
            rect = this.f2631z;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f2) {
                    textView = textView2;
                    f2 = fHeight;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f2618B);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f2621E, this.f2622F, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f2627K.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        m1949n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException, NumberFormatException {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f2626J / Math.max(Math.max(this.f2624H / displayMetrics.heightPixels, this.f2625I / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
