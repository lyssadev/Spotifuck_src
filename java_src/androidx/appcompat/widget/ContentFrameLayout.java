package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import p023N.C0214Z;
import p068h.C0850u;
import p068h.LayoutInflaterFactory2C0819D;
import p084n.MenuC1035l;
import p087o.C1153f1;
import p087o.C1154g;
import p087o.C1166k;
import p087o.InterfaceC1167k0;
import p087o.InterfaceC1170l0;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: f */
    public TypedValue f1445f;

    /* renamed from: g */
    public TypedValue f1446g;

    /* renamed from: h */
    public TypedValue f1447h;

    /* renamed from: i */
    public TypedValue f1448i;

    /* renamed from: j */
    public TypedValue f1449j;

    /* renamed from: k */
    public TypedValue f1450k;

    /* renamed from: l */
    public final Rect f1451l;

    /* renamed from: m */
    public InterfaceC1167k0 f1452m;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1451l = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1449j == null) {
            this.f1449j = new TypedValue();
        }
        return this.f1449j;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1450k == null) {
            this.f1450k = new TypedValue();
        }
        return this.f1450k;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1447h == null) {
            this.f1447h = new TypedValue();
        }
        return this.f1447h;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1448i == null) {
            this.f1448i = new TypedValue();
        }
        return this.f1448i;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1445f == null) {
            this.f1445f = new TypedValue();
        }
        return this.f1445f;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1446g == null) {
            this.f1446g = new TypedValue();
        }
        return this.f1446g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC1167k0 interfaceC1167k0 = this.f1452m;
        if (interfaceC1167k0 != null) {
            interfaceC1167k0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1166k c1166k;
        super.onDetachedFromWindow();
        InterfaceC1167k0 interfaceC1167k0 = this.f1452m;
        if (interfaceC1167k0 != null) {
            LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D = ((C0850u) interfaceC1167k0).f3309g;
            InterfaceC1170l0 interfaceC1170l0 = layoutInflaterFactory2C0819D.f3156w;
            if (interfaceC1170l0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1170l0;
                actionBarOverlayLayout.m1333k();
                ActionMenuView actionMenuView = ((C1153f1) actionBarOverlayLayout.f1413j).f4605a.f1523f;
                if (actionMenuView != null && (c1166k = actionMenuView.f1439y) != null) {
                    c1166k.m2798e();
                    C1154g c1154g = c1166k.f4684y;
                    if (c1154g != null && c1154g.m2603b()) {
                        c1154g.f4334i.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C0819D.f3110B != null) {
                layoutInflaterFactory2C0819D.f3150q.getDecorView().removeCallbacks(layoutInflaterFactory2C0819D.f3111C);
                if (layoutInflaterFactory2C0819D.f3110B.isShowing()) {
                    try {
                        layoutInflaterFactory2C0819D.f3110B.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C0819D.f3110B = null;
            }
            C0214Z c0214z = layoutInflaterFactory2C0819D.f3112D;
            if (c0214z != null) {
                c0214z.m700b();
            }
            MenuC1035l menuC1035l = layoutInflaterFactory2C0819D.m2086y(0).f3097h;
            if (menuC1035l != null) {
                menuC1035l.m2582c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        boolean z2;
        int iMakeMeasureSpec2;
        int i3;
        int i4;
        float fraction;
        int i5;
        int i6;
        float fraction2;
        int i7;
        int i8;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z3 = true;
        boolean z4 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Rect rect = this.f1451l;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i;
            z2 = false;
        } else {
            TypedValue typedValue = z4 ? this.f1448i : this.f1447h;
            if (typedValue != null && (i7 = typedValue.type) != 0) {
                if (i7 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else if (i7 == 6) {
                    int i9 = displayMetrics.widthPixels;
                    fraction3 = typedValue.getFraction(i9, i9);
                } else {
                    i8 = 0;
                    if (i8 <= 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z2 = true;
                    }
                }
                i8 = (int) fraction3;
                if (i8 <= 0) {
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i2;
        } else {
            TypedValue typedValue2 = z4 ? this.f1449j : this.f1450k;
            if (typedValue2 != null && (i5 = typedValue2.type) != 0) {
                if (i5 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else if (i5 == 6) {
                    int i10 = displayMetrics.heightPixels;
                    fraction2 = typedValue2.getFraction(i10, i10);
                } else {
                    i6 = 0;
                    if (i6 <= 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                    }
                }
                i6 = (int) fraction2;
                if (i6 <= 0) {
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z2 || mode != Integer.MIN_VALUE) {
            z3 = false;
        } else {
            TypedValue typedValue3 = z4 ? this.f1446g : this.f1445f;
            if (typedValue3 != null && (i3 = typedValue3.type) != 0) {
                if (i3 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else if (i3 == 6) {
                    int i11 = displayMetrics.widthPixels;
                    fraction = typedValue3.getFraction(i11, i11);
                } else {
                    i4 = 0;
                    if (i4 > 0) {
                        i4 -= rect.left + rect.right;
                    }
                    if (measuredWidth >= i4) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                    }
                }
                i4 = (int) fraction;
                if (i4 > 0) {
                }
                if (measuredWidth >= i4) {
                }
            }
        }
        if (z3) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(InterfaceC1167k0 interfaceC1167k0) {
        this.f1452m = interfaceC1167k0;
    }
}
