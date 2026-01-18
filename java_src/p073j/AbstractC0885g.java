package p073j;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.InvocationTargetException;
import p010G.AbstractC0094a;
import p024N0.RunnableC0268B;
import p091p0.AbstractC1230a;

/* renamed from: j.g */
/* loaded from: classes.dex */
public abstract class AbstractC0885g extends Drawable implements Drawable.Callback {

    /* renamed from: r */
    public static final /* synthetic */ int f3556r = 0;

    /* renamed from: f */
    public C0880b f3557f;

    /* renamed from: g */
    public Rect f3558g;

    /* renamed from: h */
    public Drawable f3559h;

    /* renamed from: i */
    public Drawable f3560i;

    /* renamed from: j */
    public int f3561j;

    /* renamed from: k */
    public boolean f3562k;

    /* renamed from: l */
    public int f3563l;

    /* renamed from: m */
    public boolean f3564m;

    /* renamed from: n */
    public RunnableC0268B f3565n;

    /* renamed from: o */
    public long f3566o;

    /* renamed from: p */
    public long f3567p;

    /* renamed from: q */
    public C0884f f3568q;

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2242a(boolean z2) {
        boolean z3;
        Drawable drawable;
        boolean z4 = true;
        this.f3562k = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f3559h;
        if (drawable2 != null) {
            long j2 = this.f3566o;
            if (j2 != 0) {
                if (j2 <= jUptimeMillis) {
                    drawable2.setAlpha(this.f3561j);
                    this.f3566o = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j2 - jUptimeMillis) * 255)) / this.f3557f.f3540y)) * this.f3561j) / 255);
                    z3 = true;
                }
            }
            drawable = this.f3560i;
            if (drawable == null) {
                long j3 = this.f3567p;
                if (j3 != 0) {
                    if (j3 <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.f3560i = null;
                        this.f3567p = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j3 - jUptimeMillis) * 255)) / this.f3557f.f3541z) * this.f3561j) / 255);
                    }
                }
                if (z2 && z4) {
                    scheduleSelf(this.f3565n, jUptimeMillis + 16);
                    return;
                }
                return;
            }
            this.f3567p = 0L;
            z4 = z3;
            if (z2) {
                return;
            } else {
                return;
            }
        }
        this.f3566o = 0L;
        z3 = false;
        drawable = this.f3560i;
        if (drawable == null) {
        }
        z4 = z3;
        if (z2) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        C0880b c0880b = this.f3557f;
        if (theme == null) {
            c0880b.getClass();
            return;
        }
        c0880b.m2235c();
        int i = c0880b.f3523h;
        Drawable[] drawableArr = c0880b.f3522g;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null && AbstractC0094a.m357b(drawable)) {
                AbstractC0094a.m356a(drawableArr[i2], theme);
                c0880b.f3520e |= drawableArr[i2].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            c0880b.f3517b = resources;
            int i3 = resources.getDisplayMetrics().densityDpi;
            if (i3 == 0) {
                i3 = 160;
            }
            int i4 = c0880b.f3518c;
            c0880b.f3518c = i3;
            if (i4 != i3) {
                c0880b.f3528m = false;
                c0880b.f3525j = false;
            }
        }
    }

    /* renamed from: b */
    public final void m2243b(Drawable drawable) {
        if (this.f3568q == null) {
            this.f3568q = new C0884f();
        }
        C0884f c0884f = this.f3568q;
        c0884f.f3555g = drawable.getCallback();
        drawable.setCallback(c0884f);
        try {
            if (this.f3557f.f3540y <= 0 && this.f3562k) {
                drawable.setAlpha(this.f3561j);
            }
            C0880b c0880b = this.f3557f;
            if (c0880b.f3508C) {
                drawable.setColorFilter(c0880b.f3507B);
            } else {
                if (c0880b.f3511F) {
                    AbstractC0094a.m363h(drawable, c0880b.f3509D);
                }
                C0880b c0880b2 = this.f3557f;
                if (c0880b2.f3512G) {
                    AbstractC0094a.m364i(drawable, c0880b2.f3510E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f3557f.f3538w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                AbstractC1230a.m2915y0(drawable, AbstractC1230a.m2878R(this));
            }
            drawable.setAutoMirrored(this.f3557f.f3506A);
            Rect rect = this.f3558g;
            if (rect != null) {
                AbstractC0094a.m361f(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            C0884f c0884f2 = this.f3568q;
            Drawable.Callback callback = (Drawable.Callback) c0884f2.f3555g;
            c0884f2.f3555g = null;
            drawable.setCallback(callback);
        } catch (Throwable th) {
            C0884f c0884f3 = this.f3568q;
            Drawable.Callback callback2 = (Drawable.Callback) c0884f3.f3555g;
            c0884f3.f3555g = null;
            drawable.setCallback(callback2);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2244c(int i) {
        if (i == this.f3563l) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f3557f.f3541z > 0) {
            Drawable drawable = this.f3560i;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f3559h;
            if (drawable2 != null) {
                this.f3560i = drawable2;
                this.f3567p = this.f3557f.f3541z + jUptimeMillis;
            } else {
                this.f3560i = null;
                this.f3567p = 0L;
            }
        } else {
            Drawable drawable3 = this.f3559h;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i >= 0) {
            C0880b c0880b = this.f3557f;
            if (i < c0880b.f3523h) {
                Drawable drawableM2236d = c0880b.m2236d(i);
                this.f3559h = drawableM2236d;
                this.f3563l = i;
                if (drawableM2236d != null) {
                    int i2 = this.f3557f.f3540y;
                    if (i2 > 0) {
                        this.f3566o = jUptimeMillis + i2;
                    }
                    m2243b(drawableM2236d);
                }
            } else {
                this.f3559h = null;
                this.f3563l = -1;
            }
        }
        if (this.f3566o != 0 || this.f3567p != 0) {
            RunnableC0268B runnableC0268B = this.f3565n;
            if (runnableC0268B == null) {
                this.f3565n = new RunnableC0268B(13, (C0883e) this);
            } else {
                unscheduleSelf(runnableC0268B);
            }
            m2242a(true);
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f3557f.canApplyTheme();
    }

    /* renamed from: d */
    public abstract void mo2239d(C0880b c0880b);

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f3559h;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f3560i;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f3561j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f3557f.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z2;
        C0880b c0880b = this.f3557f;
        if (!c0880b.f3536u) {
            c0880b.m2235c();
            c0880b.f3536u = true;
            int i = c0880b.f3523h;
            Drawable[] drawableArr = c0880b.f3522g;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    c0880b.f3537v = true;
                    z2 = true;
                    break;
                }
                if (drawableArr[i2].getConstantState() == null) {
                    c0880b.f3537v = false;
                    z2 = false;
                    break;
                }
                i2++;
            }
        } else {
            z2 = c0880b.f3537v;
        }
        if (!z2) {
            return null;
        }
        this.f3557f.f3519d = getChangingConfigurations();
        return this.f3557f;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f3559h;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f3558g;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C0880b c0880b = this.f3557f;
        if (c0880b.f3527l) {
            if (!c0880b.f3528m) {
                c0880b.m2234b();
            }
            return c0880b.f3530o;
        }
        Drawable drawable = this.f3559h;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C0880b c0880b = this.f3557f;
        if (c0880b.f3527l) {
            if (!c0880b.f3528m) {
                c0880b.m2234b();
            }
            return c0880b.f3529n;
        }
        Drawable drawable = this.f3559h;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C0880b c0880b = this.f3557f;
        if (c0880b.f3527l) {
            if (!c0880b.f3528m) {
                c0880b.m2234b();
            }
            return c0880b.f3532q;
        }
        Drawable drawable = this.f3559h;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C0880b c0880b = this.f3557f;
        if (c0880b.f3527l) {
            if (!c0880b.f3528m) {
                c0880b.m2234b();
            }
            return c0880b.f3531p;
        }
        Drawable drawable = this.f3559h;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Drawable drawable = this.f3559h;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        C0880b c0880b = this.f3557f;
        if (c0880b.f3533r) {
            return c0880b.f3534s;
        }
        c0880b.m2235c();
        int i = c0880b.f3523h;
        Drawable[] drawableArr = c0880b.f3522g;
        int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i2 = 1; i2 < i; i2++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
        }
        c0880b.f3534s = opacity;
        c0880b.f3533r = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f3559h;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C0880b c0880b = this.f3557f;
        boolean padding = false;
        Rect rect2 = null;
        if (!c0880b.f3524i) {
            Rect rect3 = c0880b.f3526k;
            if (rect3 != null || c0880b.f3525j) {
                rect2 = rect3;
            } else {
                c0880b.m2235c();
                Rect rect4 = new Rect();
                int i = c0880b.f3523h;
                Drawable[] drawableArr = c0880b.f3522g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                c0880b.f3525j = true;
                c0880b.f3526k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.f3559h;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f3557f.f3506A && AbstractC1230a.m2878R(this) == 1) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C0880b c0880b = this.f3557f;
        if (c0880b != null) {
            c0880b.f3533r = false;
            c0880b.f3535t = false;
        }
        if (drawable != this.f3559h || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f3557f.f3506A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z2;
        Drawable drawable = this.f3560i;
        boolean z3 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f3560i = null;
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable2 = this.f3559h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f3562k) {
                this.f3559h.setAlpha(this.f3561j);
            }
        }
        if (this.f3567p != 0) {
            this.f3567p = 0L;
            z2 = true;
        }
        if (this.f3566o != 0) {
            this.f3566o = 0L;
        } else {
            z3 = z2;
        }
        if (z3) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f3564m && super.mutate() == this) {
            C0883e c0883e = (C0883e) this;
            C0880b c0880b = new C0880b(c0883e.f3549u, c0883e, null);
            c0880b.f3514I = c0880b.f3514I.clone();
            c0880b.f3515J = c0880b.f3515J.clone();
            mo2239d(c0880b);
            this.f3564m = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3560i;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f3559h;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        C0880b c0880b = this.f3557f;
        int i2 = this.f3563l;
        int i3 = c0880b.f3523h;
        Drawable[] drawableArr = c0880b.f3522g;
        boolean z2 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                boolean zM2915y0 = Build.VERSION.SDK_INT >= 23 ? AbstractC1230a.m2915y0(drawable, i) : false;
                if (i4 == i2) {
                    z2 = zM2915y0;
                }
            }
        }
        c0880b.f3539x = i;
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f3560i;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f3559h;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable != this.f3559h || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f3562k && this.f3561j == i) {
            return;
        }
        this.f3562k = true;
        this.f3561j = i;
        Drawable drawable = this.f3559h;
        if (drawable != null) {
            if (this.f3566o == 0) {
                drawable.setAlpha(i);
            } else {
                m2242a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        C0880b c0880b = this.f3557f;
        if (c0880b.f3506A != z2) {
            c0880b.f3506A = z2;
            Drawable drawable = this.f3559h;
            if (drawable != null) {
                drawable.setAutoMirrored(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C0880b c0880b = this.f3557f;
        c0880b.f3508C = true;
        if (c0880b.f3507B != colorFilter) {
            c0880b.f3507B = colorFilter;
            Drawable drawable = this.f3559h;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z2) {
        C0880b c0880b = this.f3557f;
        if (c0880b.f3538w != z2) {
            c0880b.f3538w = z2;
            Drawable drawable = this.f3559h;
            if (drawable != null) {
                drawable.setDither(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f2, float f3) {
        Drawable drawable = this.f3559h;
        if (drawable != null) {
            AbstractC0094a.m360e(drawable, f2, f3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f3558g;
        if (rect == null) {
            this.f3558g = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f3559h;
        if (drawable != null) {
            AbstractC0094a.m361f(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        C0880b c0880b = this.f3557f;
        c0880b.f3511F = true;
        if (c0880b.f3509D != colorStateList) {
            c0880b.f3509D = colorStateList;
            AbstractC0094a.m363h(this.f3559h, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        C0880b c0880b = this.f3557f;
        c0880b.f3512G = true;
        if (c0880b.f3510E != mode) {
            c0880b.f3510E = mode;
            AbstractC0094a.m364i(this.f3559h, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        Drawable drawable = this.f3560i;
        if (drawable != null) {
            drawable.setVisible(z2, z3);
        }
        Drawable drawable2 = this.f3559h;
        if (drawable2 != null) {
            drawable2.setVisible(z2, z3);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f3559h || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
