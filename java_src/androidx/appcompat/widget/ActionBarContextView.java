package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import it.deviato.spotifuck.R;
import p023N.AbstractC0206Q;
import p023N.C0214Z;
import p032R0.ViewOnClickListenerC0367i;
import p036T0.AbstractC0411g;
import p065g.AbstractC0752a;
import p082m.AbstractC0977a;
import p084n.InterfaceC1049z;
import p084n.MenuC1035l;
import p087o.AbstractC1177n1;
import p087o.C1136a;
import p087o.C1154g;
import p087o.C1166k;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: f */
    public final C1136a f1379f;

    /* renamed from: g */
    public final Context f1380g;

    /* renamed from: h */
    public ActionMenuView f1381h;

    /* renamed from: i */
    public C1166k f1382i;

    /* renamed from: j */
    public int f1383j;

    /* renamed from: k */
    public C0214Z f1384k;

    /* renamed from: l */
    public boolean f1385l;

    /* renamed from: m */
    public boolean f1386m;

    /* renamed from: n */
    public CharSequence f1387n;

    /* renamed from: o */
    public CharSequence f1388o;

    /* renamed from: p */
    public View f1389p;

    /* renamed from: q */
    public View f1390q;

    /* renamed from: r */
    public View f1391r;

    /* renamed from: s */
    public LinearLayout f1392s;

    /* renamed from: t */
    public TextView f1393t;

    /* renamed from: u */
    public TextView f1394u;

    /* renamed from: v */
    public final int f1395v;

    /* renamed from: w */
    public final int f1396w;

    /* renamed from: x */
    public boolean f1397x;

    /* renamed from: y */
    public final int f1398y;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        this.f1379f = new C1136a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1380g = context;
        } else {
            this.f1380g = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0752a.f2740d, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AbstractC0411g.m1039n(context, resourceId));
        this.f1395v = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f1396w = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f1383j = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f1398y = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: f */
    public static int m1322f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    /* renamed from: g */
    public static int m1323g(View view, int i, int i2, int i3, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z2) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    /* renamed from: c */
    public final void m1324c(AbstractC0977a abstractC0977a) {
        View view = this.f1389p;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f1398y, (ViewGroup) this, false);
            this.f1389p = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f1389p);
        }
        View viewFindViewById = this.f1389p.findViewById(R.id.action_mode_close_button);
        this.f1390q = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC0367i(4, abstractC0977a));
        MenuC1035l menuC1035lMo2093c = abstractC0977a.mo2093c();
        C1166k c1166k = this.f1382i;
        if (c1166k != null) {
            c1166k.m2798e();
            C1154g c1154g = c1166k.f4684y;
            if (c1154g != null && c1154g.m2603b()) {
                c1154g.f4334i.dismiss();
            }
        }
        C1166k c1166k2 = new C1166k(getContext());
        this.f1382i = c1166k2;
        c1166k2.f4676q = true;
        c1166k2.f4677r = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menuC1035lMo2093c.m2581b(this.f1382i, this.f1380g);
        C1166k c1166k3 = this.f1382i;
        InterfaceC1049z interfaceC1049z = c1166k3.f4672m;
        if (interfaceC1049z == null) {
            InterfaceC1049z interfaceC1049z2 = (InterfaceC1049z) c1166k3.f4668i.inflate(c1166k3.f4670k, (ViewGroup) this, false);
            c1166k3.f4672m = interfaceC1049z2;
            interfaceC1049z2.mo1318b(c1166k3.f4667h);
            c1166k3.mo2548c();
        }
        InterfaceC1049z interfaceC1049z3 = c1166k3.f4672m;
        if (interfaceC1049z != interfaceC1049z3) {
            ((ActionMenuView) interfaceC1049z3).setPresenter(c1166k3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC1049z3;
        this.f1381h = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f1381h, layoutParams);
    }

    /* renamed from: d */
    public final void m1325d() {
        if (this.f1392s == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1392s = linearLayout;
            this.f1393t = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f1394u = (TextView) this.f1392s.findViewById(R.id.action_bar_subtitle);
            int i = this.f1395v;
            if (i != 0) {
                this.f1393t.setTextAppearance(getContext(), i);
            }
            int i2 = this.f1396w;
            if (i2 != 0) {
                this.f1394u.setTextAppearance(getContext(), i2);
            }
        }
        this.f1393t.setText(this.f1387n);
        this.f1394u.setText(this.f1388o);
        boolean zIsEmpty = TextUtils.isEmpty(this.f1387n);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f1388o);
        this.f1394u.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f1392s.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f1392s.getParent() == null) {
            addView(this.f1392s);
        }
    }

    /* renamed from: e */
    public final void m1326e() {
        removeAllViews();
        this.f1391r = null;
        this.f1381h = null;
        this.f1382i = null;
        View view = this.f1390q;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f1384k != null ? this.f1379f.f4582b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1383j;
    }

    public CharSequence getSubtitle() {
        return this.f1388o;
    }

    public CharSequence getTitle() {
        return this.f1387n;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            C0214Z c0214z = this.f1384k;
            if (c0214z != null) {
                c0214z.m700b();
            }
            super.setVisibility(i);
        }
    }

    /* renamed from: i */
    public final C0214Z m1328i(int i, long j2) {
        C0214Z c0214z = this.f1384k;
        if (c0214z != null) {
            c0214z.m700b();
        }
        C1136a c1136a = this.f1379f;
        if (i != 0) {
            C0214Z c0214zM666a = AbstractC0206Q.m666a(this);
            c0214zM666a.m699a(0.0f);
            c0214zM666a.m701c(j2);
            c1136a.f4583c.f1384k = c0214zM666a;
            c1136a.f4582b = i;
            c0214zM666a.m702d(c1136a);
            return c0214zM666a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0214Z c0214zM666a2 = AbstractC0206Q.m666a(this);
        c0214zM666a2.m699a(1.0f);
        c0214zM666a2.m701c(j2);
        c1136a.f4583c.f1384k = c0214zM666a2;
        c1136a.f4582b = i;
        c0214zM666a2.m702d(c1136a);
        return c0214zM666a2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0752a.f2737a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C1166k c1166k = this.f1382i;
        if (c1166k != null) {
            Configuration configuration2 = c1166k.f4666g.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            c1166k.f4680u = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            MenuC1035l menuC1035l = c1166k.f4667h;
            if (menuC1035l != null) {
                menuC1035l.m2587p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1166k c1166k = this.f1382i;
        if (c1166k != null) {
            c1166k.m2798e();
            C1154g c1154g = this.f1382i.f4684y;
            if (c1154g == null || !c1154g.m2603b()) {
                return;
            }
            c1154g.f4334i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1386m = false;
        }
        if (!this.f1386m) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1386m = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1386m = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        boolean z3 = AbstractC1177n1.f4699a;
        boolean z4 = getLayoutDirection() == 1;
        int paddingRight = z4 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1389p;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1389p.getLayoutParams();
            int i5 = z4 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z4 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z4 ? paddingRight - i5 : paddingRight + i5;
            int iM1323g = m1323g(this.f1389p, i7, paddingTop, paddingTop2, z4) + i7;
            paddingRight = z4 ? iM1323g - i6 : iM1323g + i6;
        }
        LinearLayout linearLayout = this.f1392s;
        if (linearLayout != null && this.f1391r == null && linearLayout.getVisibility() != 8) {
            paddingRight += m1323g(this.f1392s, paddingRight, paddingTop, paddingTop2, z4);
        }
        View view2 = this.f1391r;
        if (view2 != null) {
            m1323g(view2, paddingRight, paddingTop, paddingTop2, z4);
        }
        int paddingLeft = z4 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1381h;
        if (actionMenuView != null) {
            m1323g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z4);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f1383j;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f1389p;
        if (view != null) {
            int iM1322f = m1322f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1389p.getLayoutParams();
            paddingLeft = iM1322f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1381h;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m1322f(this.f1381h, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f1392s;
        if (linearLayout != null && this.f1391r == null) {
            if (this.f1397x) {
                this.f1392s.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f1392s.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f1392s.setVisibility(z2 ? 0 : 8);
            } else {
                paddingLeft = m1322f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f1391r;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.f1391r.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f1383j > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1385l = false;
        }
        if (!this.f1385l) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1385l = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1385l = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f1383j = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1391r;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1391r = view;
        if (view != null && (linearLayout = this.f1392s) != null) {
            removeView(linearLayout);
            this.f1392s = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1388o = charSequence;
        m1325d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1387n = charSequence;
        m1325d();
        AbstractC0206Q.m682q(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f1397x) {
            requestLayout();
        }
        this.f1397x = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
