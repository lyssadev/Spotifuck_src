package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import it.deviato.spotifuck.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p023N.AbstractC0206Q;
import p091p0.AbstractC1230a;
import p094q0.AbstractC1241a;
import p097r0.AbstractC1258a;

/* loaded from: classes.dex */
class ClockHandView extends View {

    /* renamed from: f */
    public final ValueAnimator f2632f;

    /* renamed from: g */
    public boolean f2633g;

    /* renamed from: h */
    public final ArrayList f2634h;

    /* renamed from: i */
    public final int f2635i;

    /* renamed from: j */
    public final float f2636j;

    /* renamed from: k */
    public final Paint f2637k;

    /* renamed from: l */
    public final RectF f2638l;

    /* renamed from: m */
    public final int f2639m;

    /* renamed from: n */
    public float f2640n;

    /* renamed from: o */
    public boolean f2641o;

    /* renamed from: p */
    public double f2642p;

    /* renamed from: q */
    public int f2643q;

    /* renamed from: r */
    public int f2644r;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f2632f = new ValueAnimator();
        this.f2634h = new ArrayList();
        Paint paint = new Paint();
        this.f2637k = paint;
        this.f2638l = new RectF();
        this.f2644r = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1241a.f4941e, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        AbstractC1230a.m2905q0(context, R.attr.motionDurationLong2, 200);
        AbstractC1230a.m2907r0(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC1258a.f5018b);
        this.f2643q = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f2635i = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f2639m = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f2636j = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m1951b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final int m1950a(int i) {
        return i == 2 ? Math.round(this.f2643q * 0.66f) : this.f2643q;
    }

    /* renamed from: b */
    public final void m1951b(float f2) {
        ValueAnimator valueAnimator = this.f2632f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f3 = f2 % 360.0f;
        this.f2640n = f3;
        this.f2642p = Math.toRadians(f3 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fM1950a = m1950a(this.f2644r);
        float fCos = (((float) Math.cos(this.f2642p)) * fM1950a) + width;
        float fSin = (fM1950a * ((float) Math.sin(this.f2642p))) + height;
        float f4 = this.f2635i;
        this.f2638l.set(fCos - f4, fSin - f4, fCos + f4, fSin + f4);
        Iterator it2 = this.f2634h.iterator();
        while (it2.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((InterfaceC0703d) it2.next());
            if (Math.abs(clockFaceView.f2628L - f3) > 0.001f) {
                clockFaceView.f2628L = f3;
                clockFaceView.m1949n();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f2 = width;
        float fM1950a = m1950a(this.f2644r);
        float fCos = (((float) Math.cos(this.f2642p)) * fM1950a) + f2;
        float f3 = height;
        float fSin = (fM1950a * ((float) Math.sin(this.f2642p))) + f3;
        Paint paint = this.f2637k;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f2635i, paint);
        double dSin = Math.sin(this.f2642p);
        paint.setStrokeWidth(this.f2639m);
        canvas.drawLine(f2, f3, width + ((int) (Math.cos(this.f2642p) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f2, f3, this.f2636j, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        if (this.f2632f.isRunning()) {
            return;
        }
        m1951b(this.f2640n);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        boolean z4 = false;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                z2 = this.f2641o;
                if (this.f2633g) {
                    this.f2644r = ((float) Math.hypot((double) (x2 - ((float) (getWidth() / 2))), (double) (y2 - ((float) (getHeight() / 2))))) <= ((float) m1950a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
                }
            } else {
                z2 = false;
            }
            z3 = false;
        } else {
            this.f2641o = false;
            z2 = false;
            z3 = true;
        }
        boolean z5 = this.f2641o;
        int degrees = (int) Math.toDegrees(Math.atan2(y2 - (getHeight() / 2), x2 - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f2 = i;
        boolean z6 = this.f2640n != f2;
        if (z3 && z6) {
            z4 = true;
        } else if (z6 || z2) {
            m1951b(f2);
            z4 = true;
        }
        this.f2641o = z5 | z4;
        return true;
    }
}
