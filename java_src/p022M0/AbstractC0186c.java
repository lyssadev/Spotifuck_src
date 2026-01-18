package p022M0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import it.deviato.spotifuck.R;
import java.util.WeakHashMap;
import p008E0.AbstractC0079m;
import p010G.AbstractC0094a;
import p018K0.C0148g;
import p018K0.C0152k;
import p023N.AbstractC0193D;
import p023N.AbstractC0195F;
import p023N.AbstractC0206Q;
import p028P0.AbstractC0322a;
import p091p0.AbstractC1230a;
import p094q0.AbstractC1241a;

/* renamed from: M0.c */
/* loaded from: classes.dex */
public abstract class AbstractC0186c extends FrameLayout {

    /* renamed from: n */
    public static final ViewOnTouchListenerC0185b f533n = new ViewOnTouchListenerC0185b();

    /* renamed from: f */
    public final C0152k f534f;

    /* renamed from: g */
    public int f535g;

    /* renamed from: h */
    public final float f536h;

    /* renamed from: i */
    public final float f537i;

    /* renamed from: j */
    public final int f538j;

    /* renamed from: k */
    public final int f539k;

    /* renamed from: l */
    public ColorStateList f540l;

    /* renamed from: m */
    public PorterDuff.Mode f541m;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC0186c(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        GradientDrawable gradientDrawable;
        Drawable drawableM2872J0;
        super(AbstractC0322a.m923a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC1241a.f4960x);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            AbstractC0195F.m613s(this, dimensionPixelSize);
        }
        this.f535g = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f534f = C0152k.m524b(context2, attributeSet, 0, 0).m522a();
        }
        this.f536h = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC1230a.m2871J(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(AbstractC0079m.m322g(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f537i = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f538j = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f539k = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f533n);
        setFocusable(true);
        if (getBackground() == null) {
            int iM2889h0 = AbstractC1230a.m2889h0(AbstractC1230a.m2868H(this, R.attr.colorSurface), AbstractC1230a.m2868H(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha());
            C0152k c0152k = this.f534f;
            if (c0152k != null) {
                int i = AbstractC0187d.f542a;
                C0148g c0148g = new C0148g(c0152k);
                c0148g.m517j(ColorStateList.valueOf(iM2889h0));
                gradientDrawable = c0148g;
            } else {
                Resources resources = getResources();
                int i2 = AbstractC0187d.f542a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(iM2889h0);
                gradientDrawable = gradientDrawable2;
            }
            if (this.f540l != null) {
                drawableM2872J0 = AbstractC1230a.m2872J0(gradientDrawable);
                AbstractC0094a.m363h(drawableM2872J0, this.f540l);
            } else {
                drawableM2872J0 = AbstractC1230a.m2872J0(gradientDrawable);
            }
            WeakHashMap weakHashMap2 = AbstractC0206Q.f560a;
            setBackground(drawableM2872J0);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f537i;
    }

    public int getAnimationMode() {
        return this.f535g;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f536h;
    }

    public int getMaxInlineActionWidth() {
        return this.f539k;
    }

    public int getMaxWidth() {
        return this.f538j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        AbstractC0193D.m594c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f538j;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.f535g = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f540l != null) {
            drawable = AbstractC1230a.m2872J0(drawable.mutate());
            AbstractC0094a.m363h(drawable, this.f540l);
            AbstractC0094a.m364i(drawable, this.f541m);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f540l = colorStateList;
        if (getBackground() != null) {
            Drawable drawableM2872J0 = AbstractC1230a.m2872J0(getBackground().mutate());
            AbstractC0094a.m363h(drawableM2872J0, colorStateList);
            AbstractC0094a.m364i(drawableM2872J0, this.f541m);
            if (drawableM2872J0 != getBackground()) {
                super.setBackgroundDrawable(drawableM2872J0);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f541m = mode;
        if (getBackground() != null) {
            Drawable drawableM2872J0 = AbstractC1230a.m2872J0(getBackground().mutate());
            AbstractC0094a.m364i(drawableM2872J0, mode);
            if (drawableM2872J0 != getBackground()) {
                super.setBackgroundDrawable(drawableM2872J0);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f533n);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(AbstractC0187d abstractC0187d) {
    }
}
