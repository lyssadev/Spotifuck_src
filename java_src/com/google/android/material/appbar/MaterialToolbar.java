package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import it.deviato.spotifuck.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import p000A.C0009j;
import p008E0.AbstractC0079m;
import p010G.AbstractC0094a;
import p018K0.C0148g;
import p023N.AbstractC0195F;
import p023N.AbstractC0206Q;
import p028P0.AbstractC0322a;
import p084n.MenuC1035l;
import p091p0.AbstractC1230a;
import p094q0.AbstractC1241a;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: e0 */
    public static final ImageView.ScaleType[] f2274e0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: W */
    public Integer f2275W;

    /* renamed from: a0 */
    public boolean f2276a0;

    /* renamed from: b0 */
    public boolean f2277b0;

    /* renamed from: c0 */
    public ImageView.ScaleType f2278c0;

    /* renamed from: d0 */
    public Boolean f2279d0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(AbstractC0322a.m923a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayM321f = AbstractC0079m.m321f(context2, attributeSet, AbstractC1241a.f4955s, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayM321f.hasValue(2)) {
            setNavigationIconTint(typedArrayM321f.getColor(2, -1));
        }
        this.f2276a0 = typedArrayM321f.getBoolean(4, false);
        this.f2277b0 = typedArrayM321f.getBoolean(3, false);
        int i = typedArrayM321f.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f2274e0;
            if (i < scaleTypeArr.length) {
                this.f2278c0 = scaleTypeArr[i];
            }
        }
        if (typedArrayM321f.hasValue(0)) {
            this.f2279d0 = Boolean.valueOf(typedArrayM321f.getBoolean(0, false));
        }
        typedArrayM321f.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : AbstractC1230a.m2875L(background);
        if (colorStateListValueOf != null) {
            C0148g c0148g = new C0148g();
            c0148g.m517j(colorStateListValueOf);
            c0148g.m515h(context2);
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            c0148g.m516i(AbstractC0195F.m603i(this));
            setBackground(c0148g);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f2278c0;
    }

    public Integer getNavigationIconTint() {
        return this.f2275W;
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* renamed from: m */
    public final void mo1358m(int i) {
        Menu menu = getMenu();
        boolean z2 = menu instanceof MenuC1035l;
        if (z2) {
            ((MenuC1035l) menu).m2594w();
        }
        super.mo1358m(i);
        if (z2) {
            ((MenuC1035l) menu).m2593v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C0148g) {
            AbstractC1230a.m2859B0(this, (C0148g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z2, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.f2276a0 || this.f2277b0) {
            ArrayList arrayListM319d = AbstractC0079m.m319d(this, getTitle());
            boolean zIsEmpty = arrayListM319d.isEmpty();
            C0009j c0009j = AbstractC0079m.f243c;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListM319d, c0009j);
            ArrayList arrayListM319d2 = AbstractC0079m.m319d(this, getSubtitle());
            TextView textView2 = arrayListM319d2.isEmpty() ? null : (TextView) Collections.max(arrayListM319d2, c0009j);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f2276a0 && textView != null) {
                    m1845v(textView, pair);
                }
                if (this.f2277b0 && textView2 != null) {
                    m1845v(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f2279d0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f2278c0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        Drawable background = getBackground();
        if (background instanceof C0148g) {
            ((C0148g) background).m516i(f2);
        }
    }

    public void setLogoAdjustViewBounds(boolean z2) {
        Boolean bool = this.f2279d0;
        if (bool == null || bool.booleanValue() != z2) {
            this.f2279d0 = Boolean.valueOf(z2);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f2278c0 != scaleType) {
            this.f2278c0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f2275W != null) {
            drawable = AbstractC1230a.m2872J0(drawable.mutate());
            AbstractC0094a.m362g(drawable, this.f2275W.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f2275W = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z2) {
        if (this.f2277b0 != z2) {
            this.f2277b0 = z2;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z2) {
        if (this.f2276a0 != z2) {
            this.f2276a0 = z2;
            requestLayout();
        }
    }

    /* renamed from: v */
    public final void m1845v(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }
}
