package p010G;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import p091p0.AbstractC1230a;

/* renamed from: G.i */
/* loaded from: classes.dex */
public final class C0102i extends Drawable implements Drawable.Callback, InterfaceC0101h, InterfaceC0100g {

    /* renamed from: l */
    public static final PorterDuff.Mode f274l = PorterDuff.Mode.SRC_IN;

    /* renamed from: m */
    public static Method f275m;

    /* renamed from: f */
    public int f276f;

    /* renamed from: g */
    public PorterDuff.Mode f277g;

    /* renamed from: h */
    public boolean f278h;

    /* renamed from: i */
    public C0103j f279i;

    /* renamed from: j */
    public boolean f280j;

    /* renamed from: k */
    public Drawable f281k;

    /* renamed from: a */
    public static void m377a() {
        if (f275m == null) {
            try {
                f275m = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    /* renamed from: b */
    public final boolean m378b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f281k;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    /* renamed from: c */
    public final C0103j m379c() {
        C0103j c0103j = this.f279i;
        C0103j c0103j2 = new C0103j();
        c0103j2.f284c = null;
        c0103j2.f285d = f274l;
        if (c0103j != null) {
            c0103j2.f282a = c0103j.f282a;
            c0103j2.f283b = c0103j.f283b;
            c0103j2.f284c = c0103j.f284c;
            c0103j2.f285d = c0103j.f285d;
        }
        return c0103j2;
    }

    /* renamed from: d */
    public final boolean m380d(int[] iArr) {
        return m385i(iArr) || this.f281k.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f281k.draw(canvas);
    }

    /* renamed from: e */
    public final void m381e(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    /* renamed from: f */
    public final void m382f(ColorStateList colorStateList) {
        this.f279i.f284c = colorStateList;
        m385i(this.f281k.getState());
    }

    /* renamed from: g */
    public final void m383g(PorterDuff.Mode mode) {
        this.f279i.f285d = mode;
        m385i(this.f281k.getState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C0103j c0103j = this.f279i;
        return changingConfigurations | (c0103j != null ? c0103j.getChangingConfigurations() : 0) | this.f281k.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        C0103j c0103j = this.f279i;
        if (c0103j == null || c0103j.f283b == null) {
            return null;
        }
        c0103j.f282a = getChangingConfigurations();
        return this.f279i;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f281k.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        return this.f281k.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f281k.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f281k.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return AbstractC1230a.m2878R(this.f281k);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f281k.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f281k.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f281k.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.f281k.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f281k.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f281k.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f281k.getTransparentRegion();
    }

    /* renamed from: h */
    public final void m384h(Drawable drawable) {
        Drawable drawable2 = this.f281k;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f281k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C0103j c0103j = this.f279i;
            if (c0103j != null) {
                c0103j.f283b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: i */
    public final boolean m385i(int[] iArr) {
        if (!m378b()) {
            return false;
        }
        C0103j c0103j = this.f279i;
        ColorStateList colorStateList = c0103j.f284c;
        PorterDuff.Mode mode = c0103j.f285d;
        if (colorStateList == null || mode == null) {
            this.f278h = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f278h || colorForState != this.f276f || mode != this.f277g) {
                setColorFilter(colorForState, mode);
                this.f276f = colorForState;
                this.f277g = mode;
                this.f278h = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f281k.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Method method;
        Drawable drawable = this.f281k;
        if (drawable == null || (method = f275m) == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(drawable, null)).booleanValue();
        } catch (Exception e) {
            Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            return false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        C0103j c0103j;
        ColorStateList colorStateList = (!m378b() || (c0103j = this.f279i) == null) ? null : c0103j.f284c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f281k.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f281k.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f280j && super.mutate() == this) {
            this.f279i = m379c();
            Drawable drawable = this.f281k;
            if (drawable != null) {
                drawable.mutate();
            }
            C0103j c0103j = this.f279i;
            if (c0103j != null) {
                Drawable drawable2 = this.f281k;
                c0103j.f283b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f280j = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f281k;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        return AbstractC1230a.m2915y0(this.f281k, i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return this.f281k.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f281k.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        this.f281k.setAutoMirrored(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        this.f281k.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f281k.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z2) {
        this.f281k.setDither(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z2) {
        this.f281k.setFilterBitmap(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f2, float f3) {
        this.f281k.setHotspot(f2, f3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f281k.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (!m380d(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        if (m378b()) {
            m381e(i);
        } else {
            this.f281k.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (m378b()) {
            m382f(colorStateList);
        } else {
            this.f281k.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (m378b()) {
            m383g(mode);
        } else {
            this.f281k.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        return super.setVisible(z2, z3) || this.f281k.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
