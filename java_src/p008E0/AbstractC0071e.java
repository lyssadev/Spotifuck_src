package p008E0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import p087o.AbstractC1086A0;
import p094q0.AbstractC1241a;

/* renamed from: E0.e */
/* loaded from: classes.dex */
public abstract class AbstractC0071e extends AbstractC1086A0 {

    /* renamed from: u */
    public Drawable f212u;

    /* renamed from: v */
    public final Rect f213v;

    /* renamed from: w */
    public final Rect f214w;

    /* renamed from: x */
    public int f215x;

    /* renamed from: y */
    public final boolean f216y;

    /* renamed from: z */
    public boolean f217z;

    public AbstractC0071e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f213v = new Rect();
        this.f214w = new Rect();
        this.f215x = 119;
        this.f216y = true;
        this.f217z = false;
        int[] iArr = AbstractC1241a.f4944h;
        AbstractC0079m.m316a(context, attributeSet, 0, 0);
        AbstractC0079m.m317b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f215x = typedArrayObtainStyledAttributes.getInt(1, this.f215x);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f216y = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f212u;
        if (drawable != null) {
            if (this.f217z) {
                this.f217z = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z2 = this.f216y;
                Rect rect = this.f213v;
                if (z2) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f215x;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f214w;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f212u;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f212u;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f212u.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f212u;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f215x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f212u;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // p087o.AbstractC1086A0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        this.f217z = z2 | this.f217z;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f217z = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f212u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f212u);
            }
            this.f212u = drawable;
            this.f217z = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f215x == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f215x != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f215x = i;
            if (i == 119 && this.f212u != null) {
                this.f212u.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f212u;
    }
}
