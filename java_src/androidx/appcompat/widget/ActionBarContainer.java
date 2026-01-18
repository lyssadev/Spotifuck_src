package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import it.deviato.spotifuck.R;
import p065g.AbstractC0752a;
import p087o.AbstractC1121S0;
import p087o.C1139b;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: f */
    public boolean f1370f;

    /* renamed from: g */
    public View f1371g;

    /* renamed from: h */
    public View f1372h;

    /* renamed from: i */
    public Drawable f1373i;

    /* renamed from: j */
    public Drawable f1374j;

    /* renamed from: k */
    public Drawable f1375k;

    /* renamed from: l */
    public final boolean f1376l;

    /* renamed from: m */
    public boolean f1377m;

    /* renamed from: n */
    public final int f1378n;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C1139b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0752a.f2737a);
        boolean z2 = false;
        this.f1373i = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f1374j = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f1378n = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f1376l = true;
            this.f1375k = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f1376l ? !(this.f1373i != null || this.f1374j != null) : this.f1375k == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1373i;
        if (drawable != null && drawable.isStateful()) {
            this.f1373i.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1374j;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1374j.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1375k;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1375k.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1373i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1374j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1375k;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1371g = findViewById(R.id.action_bar);
        this.f1372h = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1370f || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        boolean z3 = true;
        if (this.f1376l) {
            Drawable drawable = this.f1375k;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = false;
            }
        } else {
            if (this.f1373i == null) {
                z3 = false;
            } else if (this.f1371g.getVisibility() == 0) {
                this.f1373i.setBounds(this.f1371g.getLeft(), this.f1371g.getTop(), this.f1371g.getRight(), this.f1371g.getBottom());
            } else {
                View view = this.f1372h;
                if (view == null || view.getVisibility() != 0) {
                    this.f1373i.setBounds(0, 0, 0, 0);
                } else {
                    this.f1373i.setBounds(this.f1372h.getLeft(), this.f1372h.getTop(), this.f1372h.getRight(), this.f1372h.getBottom());
                }
            }
            this.f1377m = false;
        }
        if (z3) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f1371g == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f1378n) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f1371g == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1373i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1373i);
        }
        this.f1373i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1371g;
            if (view != null) {
                this.f1373i.setBounds(view.getLeft(), this.f1371g.getTop(), this.f1371g.getRight(), this.f1371g.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f1376l ? !(this.f1373i != null || this.f1374j != null) : this.f1375k == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1375k;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1375k);
        }
        this.f1375k = drawable;
        boolean z2 = this.f1376l;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.f1375k) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? !(this.f1373i != null || this.f1374j != null) : this.f1375k == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f1374j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1374j);
        }
        this.f1374j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1377m && this.f1374j != null) {
                throw null;
            }
        }
        boolean z2 = false;
        if (!this.f1376l ? !(this.f1373i != null || this.f1374j != null) : this.f1375k == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z2) {
        this.f1370f = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z2 = i == 0;
        Drawable drawable = this.f1373i;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f1374j;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f1375k;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1373i;
        boolean z2 = this.f1376l;
        return (drawable == drawable2 && !z2) || (drawable == this.f1374j && this.f1377m) || ((drawable == this.f1375k && z2) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public void setTabContainer(AbstractC1121S0 abstractC1121S0) {
    }
}
