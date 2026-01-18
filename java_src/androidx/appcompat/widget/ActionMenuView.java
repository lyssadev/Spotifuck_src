package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p018K0.C0146e;
import p074j0.C0944w;
import p084n.C1037n;
import p084n.InterfaceC1034k;
import p084n.InterfaceC1049z;
import p084n.MenuC1035l;
import p087o.AbstractC1086A0;
import p087o.AbstractC1177n1;
import p087o.C1133Y0;
import p087o.C1154g;
import p087o.C1163j;
import p087o.C1166k;
import p087o.C1172m;
import p087o.C1201z0;
import p087o.InterfaceC1169l;
import p087o.InterfaceC1175n;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC1086A0 implements InterfaceC1034k, InterfaceC1049z {

    /* renamed from: A */
    public boolean f1430A;

    /* renamed from: B */
    public int f1431B;

    /* renamed from: C */
    public final int f1432C;

    /* renamed from: D */
    public final int f1433D;

    /* renamed from: E */
    public InterfaceC1175n f1434E;

    /* renamed from: u */
    public MenuC1035l f1435u;

    /* renamed from: v */
    public Context f1436v;

    /* renamed from: w */
    public int f1437w;

    /* renamed from: x */
    public boolean f1438x;

    /* renamed from: y */
    public C1166k f1439y;

    /* renamed from: z */
    public C1133Y0 f1440z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f1432C = (int) (56.0f * f2);
        this.f1433D = (int) (f2 * 4.0f);
        this.f1436v = context;
        this.f1437w = 0;
    }

    /* renamed from: j */
    public static C1172m m1335j() {
        C1172m c1172m = new C1172m(-2, -2);
        c1172m.f4687a = false;
        ((LinearLayout.LayoutParams) c1172m).gravity = 16;
        return c1172m;
    }

    /* renamed from: k */
    public static C1172m m1336k(ViewGroup.LayoutParams layoutParams) {
        C1172m c1172m;
        if (layoutParams == null) {
            return m1335j();
        }
        if (layoutParams instanceof C1172m) {
            C1172m c1172m2 = (C1172m) layoutParams;
            c1172m = new C1172m(c1172m2);
            c1172m.f4687a = c1172m2.f4687a;
        } else {
            c1172m = new C1172m(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c1172m).gravity <= 0) {
            ((LinearLayout.LayoutParams) c1172m).gravity = 16;
        }
        return c1172m;
    }

    @Override // p084n.InterfaceC1049z
    /* renamed from: b */
    public final void mo1318b(MenuC1035l menuC1035l) {
        this.f1435u = menuC1035l;
    }

    @Override // p084n.InterfaceC1034k
    /* renamed from: c */
    public final boolean mo1319c(C1037n c1037n) {
        return this.f1435u.m2588q(c1037n, null, 0);
    }

    @Override // p087o.AbstractC1086A0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1172m;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p087o.AbstractC1086A0
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C1201z0 generateDefaultLayoutParams() {
        return m1335j();
    }

    @Override // p087o.AbstractC1086A0
    /* renamed from: g */
    public final C1201z0 generateLayoutParams(AttributeSet attributeSet) {
        return new C1172m(getContext(), attributeSet);
    }

    @Override // p087o.AbstractC1086A0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1335j();
    }

    @Override // p087o.AbstractC1086A0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1336k(layoutParams);
    }

    public Menu getMenu() {
        if (this.f1435u == null) {
            Context context = getContext();
            MenuC1035l menuC1035l = new MenuC1035l(context);
            this.f1435u = menuC1035l;
            menuC1035l.f4262e = new C0944w(this);
            C1166k c1166k = new C1166k(context);
            this.f1439y = c1166k;
            c1166k.f4676q = true;
            c1166k.f4677r = true;
            c1166k.f4669j = new C0146e(26);
            this.f1435u.m2581b(c1166k, this.f1436v);
            C1166k c1166k2 = this.f1439y;
            c1166k2.f4672m = this;
            this.f1435u = c1166k2.f4667h;
        }
        return this.f1435u;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C1166k c1166k = this.f1439y;
        C1163j c1163j = c1166k.f4673n;
        if (c1163j != null) {
            return c1163j.getDrawable();
        }
        if (c1166k.f4675p) {
            return c1166k.f4674o;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f1437w;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // p087o.AbstractC1086A0
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C1201z0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1336k(layoutParams);
    }

    /* renamed from: l */
    public final boolean m1340l(int i) {
        boolean zMo1315c = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC1169l)) {
            zMo1315c = ((InterfaceC1169l) childAt).mo1315c();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC1169l)) ? zMo1315c : zMo1315c | ((InterfaceC1169l) childAt2).mo1314b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1166k c1166k = this.f1439y;
        if (c1166k != null) {
            c1166k.mo2548c();
            if (this.f1439y.m2799i()) {
                this.f1439y.m2798e();
                this.f1439y.m2800l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1166k c1166k = this.f1439y;
        if (c1166k != null) {
            c1166k.m2798e();
            C1154g c1154g = c1166k.f4684y;
            if (c1154g == null || !c1154g.m2603b()) {
                return;
            }
            c1154g.f4334i.dismiss();
        }
    }

    @Override // p087o.AbstractC1086A0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.f1430A) {
            super.onLayout(z2, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z3 = AbstractC1177n1.f4699a;
        boolean z4 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C1172m c1172m = (C1172m) childAt.getLayoutParams();
                if (c1172m.f4687a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m1340l(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z4) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c1172m).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c1172m).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c1172m).leftMargin) + ((LinearLayout.LayoutParams) c1172m).rightMargin;
                    m1340l(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z4) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                C1172m c1172m2 = (C1172m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c1172m2.f4687a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) c1172m2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c1172m2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            C1172m c1172m3 = (C1172m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c1172m3.f4687a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) c1172m3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c1172m3).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v31 */
    @Override // p087o.AbstractC1086A0, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        ?? r4;
        int i8;
        int i9;
        int i10;
        MenuC1035l menuC1035l;
        boolean z4 = this.f1430A;
        boolean z5 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f1430A = z5;
        if (z4 != z5) {
            this.f1431B = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f1430A && (menuC1035l = this.f1435u) != null && size != this.f1431B) {
            this.f1431B = size;
            menuC1035l.m2587p(true);
        }
        int childCount = getChildCount();
        if (!this.f1430A || childCount <= 0) {
            for (int i11 = 0; i11 < childCount; i11++) {
                C1172m c1172m = (C1172m) getChildAt(i11).getLayoutParams();
                ((LinearLayout.LayoutParams) c1172m).rightMargin = 0;
                ((LinearLayout.LayoutParams) c1172m).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i12 = size2 - paddingRight;
        int i13 = this.f1432C;
        int i14 = i12 / i13;
        int i15 = i12 % i13;
        if (i14 == 0) {
            setMeasuredDimension(i12, 0);
            return;
        }
        int i16 = (i15 / i14) + i13;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i17 = 0;
        int iMax2 = 0;
        int i18 = 0;
        boolean z6 = false;
        long j2 = 0;
        int i19 = 0;
        while (true) {
            i3 = this.f1433D;
            if (i18 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i18);
            int i20 = size3;
            int i21 = i12;
            if (childAt.getVisibility() == 8) {
                i8 = mode;
                i9 = paddingBottom;
            } else {
                boolean z7 = childAt instanceof ActionMenuItemView;
                int i22 = i17 + 1;
                if (z7) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                C1172m c1172m2 = (C1172m) childAt.getLayoutParams();
                c1172m2.f4692f = false;
                c1172m2.f4689c = 0;
                c1172m2.f4688b = 0;
                c1172m2.f4690d = false;
                ((LinearLayout.LayoutParams) c1172m2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c1172m2).rightMargin = 0;
                c1172m2.f4691e = z7 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i23 = c1172m2.f4687a ? 1 : i14;
                C1172m c1172m3 = (C1172m) childAt.getLayoutParams();
                i8 = mode;
                i9 = paddingBottom;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z7 ? (ActionMenuItemView) childAt : null;
                boolean z8 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                if (i23 <= 0 || (z8 && i23 < 2)) {
                    i10 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i23 * i16, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i10 = measuredWidth / i16;
                    if (measuredWidth % i16 != 0) {
                        i10++;
                    }
                    if (z8 && i10 < 2) {
                        i10 = 2;
                    }
                }
                c1172m3.f4690d = !c1172m3.f4687a && z8;
                c1172m3.f4688b = i10;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10 * i16, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i10);
                if (c1172m2.f4690d) {
                    i19++;
                }
                if (c1172m2.f4687a) {
                    z6 = true;
                }
                i14 -= i10;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i10 == 1) {
                    j2 |= 1 << i18;
                }
                i17 = i22;
            }
            i18++;
            size3 = i20;
            i12 = i21;
            paddingBottom = i9;
            mode = i8;
        }
        int i24 = mode;
        int i25 = i12;
        int i26 = size3;
        boolean z9 = z6 && i17 == 2;
        boolean z10 = false;
        while (i19 > 0 && i14 > 0) {
            int i27 = Integer.MAX_VALUE;
            int i28 = 0;
            int i29 = 0;
            long j3 = 0;
            while (i29 < childCount2) {
                C1172m c1172m4 = (C1172m) getChildAt(i29).getLayoutParams();
                boolean z11 = z10;
                if (c1172m4.f4690d) {
                    int i30 = c1172m4.f4688b;
                    if (i30 < i27) {
                        j3 = 1 << i29;
                        i27 = i30;
                        i28 = 1;
                    } else if (i30 == i27) {
                        j3 |= 1 << i29;
                        i28++;
                    }
                }
                i29++;
                z10 = z11;
            }
            z2 = z10;
            j2 |= j3;
            if (i28 > i14) {
                break;
            }
            int i31 = i27 + 1;
            int i32 = 0;
            while (i32 < childCount2) {
                View childAt2 = getChildAt(i32);
                C1172m c1172m5 = (C1172m) childAt2.getLayoutParams();
                int i33 = iMax;
                int i34 = childMeasureSpec;
                int i35 = childCount2;
                long j4 = 1 << i32;
                if ((j3 & j4) != 0) {
                    if (z9 && c1172m5.f4691e) {
                        r4 = 1;
                        r4 = 1;
                        if (i14 == 1) {
                            childAt2.setPadding(i3 + i16, 0, i3, 0);
                        }
                    } else {
                        r4 = 1;
                    }
                    c1172m5.f4688b += r4;
                    c1172m5.f4692f = r4;
                    i14--;
                } else if (c1172m5.f4688b == i31) {
                    j2 |= j4;
                }
                i32++;
                childMeasureSpec = i34;
                iMax = i33;
                childCount2 = i35;
            }
            z10 = true;
        }
        z2 = z10;
        int i36 = iMax;
        int i37 = childMeasureSpec;
        int i38 = childCount2;
        boolean z12 = !z6 && i17 == 1;
        if (i14 <= 0 || j2 == 0 || (i14 >= i17 - 1 && !z12 && iMax2 <= 1)) {
            i4 = i38;
            z3 = z2;
        } else {
            float fBitCount = Long.bitCount(j2);
            if (!z12) {
                if ((j2 & 1) != 0 && !((C1172m) getChildAt(0).getLayoutParams()).f4691e) {
                    fBitCount -= 0.5f;
                }
                int i39 = i38 - 1;
                if ((j2 & (1 << i39)) != 0 && !((C1172m) getChildAt(i39).getLayoutParams()).f4691e) {
                    fBitCount -= 0.5f;
                }
            }
            int i40 = fBitCount > 0.0f ? (int) ((i14 * i16) / fBitCount) : 0;
            boolean z13 = z2;
            i4 = i38;
            for (int i41 = 0; i41 < i4; i41++) {
                if ((j2 & (1 << i41)) != 0) {
                    View childAt3 = getChildAt(i41);
                    C1172m c1172m6 = (C1172m) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c1172m6.f4689c = i40;
                        c1172m6.f4692f = true;
                        if (i41 == 0 && !c1172m6.f4691e) {
                            ((LinearLayout.LayoutParams) c1172m6).leftMargin = (-i40) / 2;
                        }
                        z13 = true;
                    } else {
                        if (c1172m6.f4687a) {
                            c1172m6.f4689c = i40;
                            c1172m6.f4692f = true;
                            ((LinearLayout.LayoutParams) c1172m6).rightMargin = (-i40) / 2;
                            z13 = true;
                        } else {
                            if (i41 != 0) {
                                ((LinearLayout.LayoutParams) c1172m6).leftMargin = i40 / 2;
                            }
                            if (i41 != i4 - 1) {
                                ((LinearLayout.LayoutParams) c1172m6).rightMargin = i40 / 2;
                            }
                        }
                    }
                }
            }
            z3 = z13;
        }
        if (z3) {
            int i42 = 0;
            while (i42 < i4) {
                View childAt4 = getChildAt(i42);
                C1172m c1172m7 = (C1172m) childAt4.getLayoutParams();
                if (c1172m7.f4692f) {
                    i7 = i37;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c1172m7.f4688b * i16) + c1172m7.f4689c, 1073741824), i7);
                } else {
                    i7 = i37;
                }
                i42++;
                i37 = i7;
            }
        }
        if (i24 != 1073741824) {
            i6 = i25;
            i5 = i36;
        } else {
            i5 = i26;
            i6 = i25;
        }
        setMeasuredDimension(i6, i5);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f1439y.f4681v = z2;
    }

    public void setOnMenuItemClickListener(InterfaceC1175n interfaceC1175n) {
        this.f1434E = interfaceC1175n;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C1166k c1166k = this.f1439y;
        C1163j c1163j = c1166k.f4673n;
        if (c1163j != null) {
            c1163j.setImageDrawable(drawable);
        } else {
            c1166k.f4675p = true;
            c1166k.f4674o = drawable;
        }
    }

    public void setOverflowReserved(boolean z2) {
        this.f1438x = z2;
    }

    public void setPopupTheme(int i) {
        if (this.f1437w != i) {
            this.f1437w = i;
            if (i == 0) {
                this.f1436v = getContext();
            } else {
                this.f1436v = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C1166k c1166k) {
        this.f1439y = c1166k;
        c1166k.f4672m = this;
        this.f1435u = c1166k.f4667h;
    }

    @Override // p087o.AbstractC1086A0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1172m(getContext(), attributeSet);
    }
}
