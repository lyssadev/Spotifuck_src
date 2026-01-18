package p111y;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import p105v.C1311g;

/* renamed from: y.t */
/* loaded from: classes.dex */
public abstract class AbstractC1361t extends AbstractC1344c {

    /* renamed from: m */
    public boolean f5672m;

    /* renamed from: n */
    public boolean f5673n;

    @Override // p111y.AbstractC1344c
    /* renamed from: e */
    public final void mo3258e(ConstraintLayout constraintLayout) {
        m3257d(constraintLayout);
    }

    @Override // p111y.AbstractC1344c
    /* renamed from: g */
    public void mo3260g(AttributeSet attributeSet) {
        super.mo3260g(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1359r.f5663b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f5672m = true;
                } else if (index == 22) {
                    this.f5673n = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: j */
    public abstract void mo1369j(C1311g c1311g, int i, int i2);

    @Override // p111y.AbstractC1344c, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5672m || this.f5673n) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f5453g; i++) {
                    View view = (View) constraintLayout.f1550f.get(this.f5452f[i]);
                    if (view != null) {
                        if (this.f5672m) {
                            view.setVisibility(visibility);
                        }
                        if (this.f5673n && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m3257d((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m3257d((ConstraintLayout) parent);
    }
}
