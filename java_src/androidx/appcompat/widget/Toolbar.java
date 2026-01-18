package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.media.session.C0513t;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.C0570A;
import it.deviato.spotifuck.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p023N.AbstractC0206Q;
import p023N.InterfaceC0237l;
import p024N0.RunnableC0268B;
import p032R0.ViewOnClickListenerC0367i;
import p036T0.AbstractC0411g;
import p065g.AbstractC0752a;
import p082m.C0984h;
import p084n.C1037n;
import p084n.MenuC1035l;
import p087o.AbstractC1135Z0;
import p087o.AbstractC1177n1;
import p087o.C1119R0;
import p087o.C1133Y0;
import p087o.C1138a1;
import p087o.C1141b1;
import p087o.C1146d0;
import p087o.C1147d1;
import p087o.C1153f1;
import p087o.C1166k;
import p087o.C1194w;
import p087o.C1198y;
import p087o.InterfaceC1144c1;
import p087o.InterfaceC1173m0;
import p087o.RunnableC1131X0;
import p087o.ViewOnClickListenerC1150e1;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC0237l {

    /* renamed from: A */
    public int f1501A;

    /* renamed from: B */
    public final int f1502B;

    /* renamed from: C */
    public CharSequence f1503C;

    /* renamed from: D */
    public CharSequence f1504D;

    /* renamed from: E */
    public ColorStateList f1505E;

    /* renamed from: F */
    public ColorStateList f1506F;

    /* renamed from: G */
    public boolean f1507G;

    /* renamed from: H */
    public boolean f1508H;

    /* renamed from: I */
    public final ArrayList f1509I;

    /* renamed from: J */
    public final ArrayList f1510J;

    /* renamed from: K */
    public final int[] f1511K;

    /* renamed from: L */
    public final C0513t f1512L;

    /* renamed from: M */
    public ArrayList f1513M;

    /* renamed from: N */
    public final C1133Y0 f1514N;

    /* renamed from: O */
    public C1153f1 f1515O;

    /* renamed from: P */
    public C1166k f1516P;

    /* renamed from: Q */
    public C1138a1 f1517Q;

    /* renamed from: R */
    public boolean f1518R;

    /* renamed from: S */
    public OnBackInvokedCallback f1519S;

    /* renamed from: T */
    public OnBackInvokedDispatcher f1520T;

    /* renamed from: U */
    public boolean f1521U;

    /* renamed from: V */
    public final RunnableC0268B f1522V;

    /* renamed from: f */
    public ActionMenuView f1523f;

    /* renamed from: g */
    public C1146d0 f1524g;

    /* renamed from: h */
    public C1146d0 f1525h;

    /* renamed from: i */
    public C1194w f1526i;

    /* renamed from: j */
    public C1198y f1527j;

    /* renamed from: k */
    public final Drawable f1528k;

    /* renamed from: l */
    public final CharSequence f1529l;

    /* renamed from: m */
    public C1194w f1530m;

    /* renamed from: n */
    public View f1531n;

    /* renamed from: o */
    public Context f1532o;

    /* renamed from: p */
    public int f1533p;

    /* renamed from: q */
    public int f1534q;

    /* renamed from: r */
    public int f1535r;

    /* renamed from: s */
    public final int f1536s;

    /* renamed from: t */
    public final int f1537t;

    /* renamed from: u */
    public int f1538u;

    /* renamed from: v */
    public int f1539v;

    /* renamed from: w */
    public int f1540w;

    /* renamed from: x */
    public int f1541x;

    /* renamed from: y */
    public C1119R0 f1542y;

    /* renamed from: z */
    public int f1543z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C0984h(getContext());
    }

    /* renamed from: h */
    public static C1141b1 m1346h() {
        C1141b1 c1141b1 = new C1141b1(-2, -2);
        c1141b1.f4590b = 0;
        c1141b1.f4589a = 8388627;
        return c1141b1;
    }

    /* renamed from: i */
    public static C1141b1 m1347i(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof C1141b1;
        if (z2) {
            C1141b1 c1141b1 = (C1141b1) layoutParams;
            C1141b1 c1141b12 = new C1141b1(c1141b1);
            c1141b12.f4590b = 0;
            c1141b12.f4590b = c1141b1.f4590b;
            return c1141b12;
        }
        if (z2) {
            C1141b1 c1141b13 = new C1141b1((C1141b1) layoutParams);
            c1141b13.f4590b = 0;
            return c1141b13;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C1141b1 c1141b14 = new C1141b1(layoutParams);
            c1141b14.f4590b = 0;
            return c1141b14;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C1141b1 c1141b15 = new C1141b1(marginLayoutParams);
        c1141b15.f4590b = 0;
        ((ViewGroup.MarginLayoutParams) c1141b15).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c1141b15).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c1141b15).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c1141b15).bottomMargin = marginLayoutParams.bottomMargin;
        return c1141b15;
    }

    /* renamed from: k */
    public static int m1348k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* renamed from: l */
    public static int m1349l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: a */
    public final void m1350a(ArrayList arrayList, int i) {
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z2) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C1141b1 c1141b1 = (C1141b1) childAt.getLayoutParams();
                if (c1141b1.f4590b == 0 && m1365t(childAt)) {
                    int i3 = c1141b1.f4589a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            C1141b1 c1141b12 = (C1141b1) childAt2.getLayoutParams();
            if (c1141b12.f4590b == 0 && m1365t(childAt2)) {
                int i5 = c1141b12.f4589a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    /* renamed from: b */
    public final void m1351b(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C1141b1 c1141b1M1346h = layoutParams == null ? m1346h() : !checkLayoutParams(layoutParams) ? m1347i(layoutParams) : (C1141b1) layoutParams;
        c1141b1M1346h.f4590b = 1;
        if (!z2 || this.f1531n == null) {
            addView(view, c1141b1M1346h);
        } else {
            view.setLayoutParams(c1141b1M1346h);
            this.f1510J.add(view);
        }
    }

    /* renamed from: c */
    public final void m1352c() {
        if (this.f1530m == null) {
            C1194w c1194w = new C1194w(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f1530m = c1194w;
            c1194w.setImageDrawable(this.f1528k);
            this.f1530m.setContentDescription(this.f1529l);
            C1141b1 c1141b1M1346h = m1346h();
            c1141b1M1346h.f4589a = (this.f1536s & 112) | 8388611;
            c1141b1M1346h.f4590b = 2;
            this.f1530m.setLayoutParams(c1141b1M1346h);
            this.f1530m.setOnClickListener(new ViewOnClickListenerC0367i(5, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C1141b1);
    }

    /* renamed from: d */
    public final void m1353d() {
        if (this.f1542y == null) {
            C1119R0 c1119r0 = new C1119R0();
            c1119r0.f4541a = 0;
            c1119r0.f4542b = 0;
            c1119r0.f4543c = Integer.MIN_VALUE;
            c1119r0.f4544d = Integer.MIN_VALUE;
            c1119r0.f4545e = 0;
            c1119r0.f4546f = 0;
            c1119r0.f4547g = false;
            c1119r0.f4548h = false;
            this.f1542y = c1119r0;
        }
    }

    /* renamed from: e */
    public final void m1354e() {
        m1355f();
        ActionMenuView actionMenuView = this.f1523f;
        if (actionMenuView.f1435u == null) {
            MenuC1035l menuC1035l = (MenuC1035l) actionMenuView.getMenu();
            if (this.f1517Q == null) {
                this.f1517Q = new C1138a1(this);
            }
            this.f1523f.setExpandedActionViewsExclusive(true);
            menuC1035l.m2581b(this.f1517Q, this.f1532o);
            m1366u();
        }
    }

    /* renamed from: f */
    public final void m1355f() {
        if (this.f1523f == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1523f = actionMenuView;
            actionMenuView.setPopupTheme(this.f1533p);
            this.f1523f.setOnMenuItemClickListener(this.f1514N);
            ActionMenuView actionMenuView2 = this.f1523f;
            C1133Y0 c1133y0 = new C1133Y0(this);
            actionMenuView2.getClass();
            actionMenuView2.f1440z = c1133y0;
            C1141b1 c1141b1M1346h = m1346h();
            c1141b1M1346h.f4589a = (this.f1536s & 112) | 8388613;
            this.f1523f.setLayoutParams(c1141b1M1346h);
            m1351b(this.f1523f, false);
        }
    }

    /* renamed from: g */
    public final void m1356g() {
        if (this.f1526i == null) {
            this.f1526i = new C1194w(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C1141b1 c1141b1M1346h = m1346h();
            c1141b1M1346h.f4589a = (this.f1536s & 112) | 8388611;
            this.f1526i.setLayoutParams(c1141b1M1346h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1346h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1347i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C1194w c1194w = this.f1530m;
        if (c1194w != null) {
            return c1194w.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C1194w c1194w = this.f1530m;
        if (c1194w != null) {
            return c1194w.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C1119R0 c1119r0 = this.f1542y;
        if (c1119r0 != null) {
            return c1119r0.f4547g ? c1119r0.f4541a : c1119r0.f4542b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1501A;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C1119R0 c1119r0 = this.f1542y;
        if (c1119r0 != null) {
            return c1119r0.f4541a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C1119R0 c1119r0 = this.f1542y;
        if (c1119r0 != null) {
            return c1119r0.f4542b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C1119R0 c1119r0 = this.f1542y;
        if (c1119r0 != null) {
            return c1119r0.f4547g ? c1119r0.f4542b : c1119r0.f4541a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1543z;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC1035l menuC1035l;
        ActionMenuView actionMenuView = this.f1523f;
        return (actionMenuView == null || (menuC1035l = actionMenuView.f1435u) == null || !menuC1035l.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1501A, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1543z, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C1198y c1198y = this.f1527j;
        if (c1198y != null) {
            return c1198y.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C1198y c1198y = this.f1527j;
        if (c1198y != null) {
            return c1198y.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m1354e();
        return this.f1523f.getMenu();
    }

    public View getNavButtonView() {
        return this.f1526i;
    }

    public CharSequence getNavigationContentDescription() {
        C1194w c1194w = this.f1526i;
        if (c1194w != null) {
            return c1194w.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C1194w c1194w = this.f1526i;
        if (c1194w != null) {
            return c1194w.getDrawable();
        }
        return null;
    }

    public C1166k getOuterActionMenuPresenter() {
        return this.f1516P;
    }

    public Drawable getOverflowIcon() {
        m1354e();
        return this.f1523f.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1532o;
    }

    public int getPopupTheme() {
        return this.f1533p;
    }

    public CharSequence getSubtitle() {
        return this.f1504D;
    }

    public final TextView getSubtitleTextView() {
        return this.f1525h;
    }

    public CharSequence getTitle() {
        return this.f1503C;
    }

    public int getTitleMarginBottom() {
        return this.f1541x;
    }

    public int getTitleMarginEnd() {
        return this.f1539v;
    }

    public int getTitleMarginStart() {
        return this.f1538u;
    }

    public int getTitleMarginTop() {
        return this.f1540w;
    }

    public final TextView getTitleTextView() {
        return this.f1524g;
    }

    public InterfaceC1173m0 getWrapper() {
        Drawable drawable;
        if (this.f1515O == null) {
            C1153f1 c1153f1 = new C1153f1();
            c1153f1.f4618n = 0;
            c1153f1.f4605a = this;
            c1153f1.f4612h = getTitle();
            c1153f1.f4613i = getSubtitle();
            c1153f1.f4611g = c1153f1.f4612h != null;
            c1153f1.f4610f = getNavigationIcon();
            C0513t c0513tM1223A = C0513t.m1223A(getContext(), null, AbstractC0752a.f2737a, R.attr.actionBarStyle);
            c1153f1.f4619o = c0513tM1223A.m1240o(15);
            TypedArray typedArray = (TypedArray) c0513tM1223A.f1246c;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                c1153f1.f4611g = true;
                c1153f1.f4612h = text;
                if ((c1153f1.f4606b & 8) != 0) {
                    Toolbar toolbar = c1153f1.f4605a;
                    toolbar.setTitle(text);
                    if (c1153f1.f4611g) {
                        AbstractC0206Q.m682q(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                c1153f1.f4613i = text2;
                if ((c1153f1.f4606b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableM1240o = c0513tM1223A.m1240o(20);
            if (drawableM1240o != null) {
                c1153f1.f4609e = drawableM1240o;
                c1153f1.m2780c();
            }
            Drawable drawableM1240o2 = c0513tM1223A.m1240o(17);
            if (drawableM1240o2 != null) {
                c1153f1.f4608d = drawableM1240o2;
                c1153f1.m2780c();
            }
            if (c1153f1.f4610f == null && (drawable = c1153f1.f4619o) != null) {
                c1153f1.f4610f = drawable;
                int i = c1153f1.f4606b & 4;
                Toolbar toolbar2 = c1153f1.f4605a;
                if (i != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            c1153f1.m2778a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = c1153f1.f4607c;
                if (view != null && (c1153f1.f4606b & 16) != 0) {
                    removeView(view);
                }
                c1153f1.f4607c = viewInflate;
                if (viewInflate != null && (c1153f1.f4606b & 16) != 0) {
                    addView(viewInflate);
                }
                c1153f1.m2778a(c1153f1.f4606b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                m1353d();
                this.f1542y.m2739a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f1534q = resourceId2;
                C1146d0 c1146d0 = this.f1524g;
                if (c1146d0 != null) {
                    c1146d0.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f1535r = resourceId3;
                C1146d0 c1146d02 = this.f1525h;
                if (c1146d02 != null) {
                    c1146d02.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            c0513tM1223A.m1228C();
            if (R.string.abc_action_bar_up_description != c1153f1.f4618n) {
                c1153f1.f4618n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i2 = c1153f1.f4618n;
                    c1153f1.f4614j = i2 != 0 ? getContext().getString(i2) : null;
                    c1153f1.m2779b();
                }
            }
            c1153f1.f4614j = getNavigationContentDescription();
            setNavigationOnClickListener(new ViewOnClickListenerC1150e1(c1153f1));
            this.f1515O = c1153f1;
        }
        return this.f1515O;
    }

    /* renamed from: j */
    public final int m1357j(View view, int i) {
        C1141b1 c1141b1 = (C1141b1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = c1141b1.f4589a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f1502B & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c1141b1).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) c1141b1).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) c1141b1).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    /* renamed from: m */
    public void mo1358m(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: n */
    public final void m1359n() {
        Iterator it2 = this.f1513M.iterator();
        while (it2.hasNext()) {
            getMenu().removeItem(((MenuItem) it2.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it3 = ((CopyOnWriteArrayList) this.f1512L.f1246c).iterator();
        while (it3.hasNext()) {
            ((C0570A) it3.next()).f1697a.m1499j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1513M = currentMenuItems2;
    }

    /* renamed from: o */
    public final boolean m1360o(View view) {
        return view.getParent() == this || this.f1510J.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1366u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1522V);
        m1366u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1508H = false;
        }
        if (!this.f1508H) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1508H = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1508H = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0298 A[LOOP:0: B:105:0x0296->B:106:0x0298, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b5 A[LOOP:1: B:108:0x02b3->B:109:0x02b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02d3 A[LOOP:2: B:111:0x02d1->B:112:0x02d3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0321 A[LOOP:3: B:120:0x031f->B:121:0x0321, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0221  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int iM1361p;
        int iM1362q;
        boolean zM1365t;
        boolean zM1365t2;
        int i5;
        int measuredHeight;
        int i6;
        int i7;
        boolean z3;
        int i8;
        int i9;
        int i10;
        int paddingTop;
        int i11;
        int i12;
        int i13;
        int i14;
        int size;
        int iM1361p2;
        int i15;
        int size2;
        int i16;
        int size3;
        int i17;
        int i18;
        int i19;
        int size4;
        boolean z4 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i20 = width - paddingRight;
        int[] iArr = this.f1511K;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        int minimumHeight = getMinimumHeight();
        int iMin = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (!m1365t(this.f1526i)) {
            iM1361p = paddingLeft;
        } else {
            if (z4) {
                iM1362q = m1362q(this.f1526i, i20, iMin, iArr);
                iM1361p = paddingLeft;
                if (m1365t(this.f1530m)) {
                    if (z4) {
                        iM1362q = m1362q(this.f1530m, iM1362q, iMin, iArr);
                    } else {
                        iM1361p = m1361p(this.f1530m, iM1361p, iMin, iArr);
                    }
                }
                if (m1365t(this.f1523f)) {
                    if (z4) {
                        iM1361p = m1361p(this.f1523f, iM1361p, iMin, iArr);
                    } else {
                        iM1362q = m1362q(this.f1523f, iM1362q, iMin, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - iM1361p);
                iArr[1] = Math.max(0, currentContentInsetRight - (i20 - iM1362q));
                int iMax = Math.max(iM1361p, currentContentInsetLeft);
                int iMin2 = Math.min(iM1362q, i20 - currentContentInsetRight);
                if (m1365t(this.f1531n)) {
                    if (z4) {
                        iMin2 = m1362q(this.f1531n, iMin2, iMin, iArr);
                    } else {
                        iMax = m1361p(this.f1531n, iMax, iMin, iArr);
                    }
                }
                if (m1365t(this.f1527j)) {
                    if (z4) {
                        iMin2 = m1362q(this.f1527j, iMin2, iMin, iArr);
                    } else {
                        iMax = m1361p(this.f1527j, iMax, iMin, iArr);
                    }
                }
                zM1365t = m1365t(this.f1524g);
                zM1365t2 = m1365t(this.f1525h);
                if (zM1365t) {
                    i5 = paddingRight;
                    measuredHeight = 0;
                } else {
                    C1141b1 c1141b1 = (C1141b1) this.f1524g.getLayoutParams();
                    i5 = paddingRight;
                    measuredHeight = ((ViewGroup.MarginLayoutParams) c1141b1).bottomMargin + this.f1524g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1141b1).topMargin;
                }
                if (zM1365t2) {
                    i6 = width;
                } else {
                    C1141b1 c1141b12 = (C1141b1) this.f1525h.getLayoutParams();
                    i6 = width;
                    measuredHeight += this.f1525h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1141b12).topMargin + ((ViewGroup.MarginLayoutParams) c1141b12).bottomMargin;
                }
                if (!zM1365t || zM1365t2) {
                    C1146d0 c1146d0 = !zM1365t ? this.f1524g : this.f1525h;
                    C1146d0 c1146d02 = !zM1365t2 ? this.f1525h : this.f1524g;
                    C1141b1 c1141b13 = (C1141b1) c1146d0.getLayoutParams();
                    C1141b1 c1141b14 = (C1141b1) c1146d02.getLayoutParams();
                    if ((zM1365t || this.f1524g.getMeasuredWidth() <= 0) && (!zM1365t2 || this.f1525h.getMeasuredWidth() <= 0)) {
                        i7 = paddingLeft;
                        z3 = false;
                    } else {
                        i7 = paddingLeft;
                        z3 = true;
                    }
                    i8 = this.f1502B & 112;
                    i9 = iMin;
                    if (i8 == 48) {
                        i10 = iMax;
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1141b13).topMargin + this.f1540w;
                    } else if (i8 != 80) {
                        int iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                        i10 = iMax;
                        int i21 = ((ViewGroup.MarginLayoutParams) c1141b13).topMargin + this.f1540w;
                        if (iMax2 < i21) {
                            iMax2 = i21;
                        } else {
                            int i22 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                            int i23 = ((ViewGroup.MarginLayoutParams) c1141b13).bottomMargin;
                            int i24 = this.f1541x;
                            if (i22 < i23 + i24) {
                                iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c1141b14).bottomMargin + i24) - i22));
                            }
                        }
                        paddingTop = paddingTop2 + iMax2;
                    } else {
                        i10 = iMax;
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c1141b14).bottomMargin) - this.f1541x) - measuredHeight;
                    }
                    if (z4) {
                        int i25 = (z3 ? this.f1538u : 0) - iArr[1];
                        iMin2 -= Math.max(0, i25);
                        iArr[1] = Math.max(0, -i25);
                        if (zM1365t) {
                            C1141b1 c1141b15 = (C1141b1) this.f1524g.getLayoutParams();
                            int measuredWidth = iMin2 - this.f1524g.getMeasuredWidth();
                            int measuredHeight2 = this.f1524g.getMeasuredHeight() + paddingTop;
                            this.f1524g.layout(measuredWidth, paddingTop, iMin2, measuredHeight2);
                            i13 = measuredWidth - this.f1539v;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c1141b15).bottomMargin;
                        } else {
                            i13 = iMin2;
                        }
                        if (zM1365t2) {
                            int i26 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1141b1) this.f1525h.getLayoutParams())).topMargin;
                            this.f1525h.layout(iMin2 - this.f1525h.getMeasuredWidth(), i26, iMin2, this.f1525h.getMeasuredHeight() + i26);
                            i14 = iMin2 - this.f1539v;
                        } else {
                            i14 = iMin2;
                        }
                        if (z3) {
                            iMin2 = Math.min(i13, i14);
                        }
                        iMax = i10;
                    } else {
                        int i27 = (z3 ? this.f1538u : 0) - iArr[0];
                        iMax = Math.max(0, i27) + i10;
                        iArr[0] = Math.max(0, -i27);
                        if (zM1365t) {
                            C1141b1 c1141b16 = (C1141b1) this.f1524g.getLayoutParams();
                            int measuredWidth2 = this.f1524g.getMeasuredWidth() + iMax;
                            int measuredHeight3 = this.f1524g.getMeasuredHeight() + paddingTop;
                            this.f1524g.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                            i11 = measuredWidth2 + this.f1539v;
                            paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c1141b16).bottomMargin;
                        } else {
                            i11 = iMax;
                        }
                        if (zM1365t2) {
                            int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1141b1) this.f1525h.getLayoutParams())).topMargin;
                            int measuredWidth3 = this.f1525h.getMeasuredWidth() + iMax;
                            this.f1525h.layout(iMax, i28, measuredWidth3, this.f1525h.getMeasuredHeight() + i28);
                            i12 = measuredWidth3 + this.f1539v;
                        } else {
                            i12 = iMax;
                        }
                        if (z3) {
                            iMax = Math.max(i11, i12);
                        }
                    }
                } else {
                    i7 = paddingLeft;
                    i9 = iMin;
                }
                ArrayList arrayList = this.f1509I;
                m1350a(arrayList, 3);
                size = arrayList.size();
                iM1361p2 = iMax;
                for (i15 = 0; i15 < size; i15++) {
                    iM1361p2 = m1361p((View) arrayList.get(i15), iM1361p2, i9, iArr);
                }
                int i29 = i9;
                m1350a(arrayList, 5);
                size2 = arrayList.size();
                for (i16 = 0; i16 < size2; i16++) {
                    iMin2 = m1362q((View) arrayList.get(i16), iMin2, i29, iArr);
                }
                m1350a(arrayList, 1);
                int i30 = iArr[0];
                int i31 = iArr[1];
                size3 = arrayList.size();
                int i32 = i31;
                int i33 = i30;
                i17 = 0;
                int measuredWidth4 = 0;
                while (i17 < size3) {
                    View view = (View) arrayList.get(i17);
                    C1141b1 c1141b17 = (C1141b1) view.getLayoutParams();
                    int i34 = ((ViewGroup.MarginLayoutParams) c1141b17).leftMargin - i33;
                    int i35 = ((ViewGroup.MarginLayoutParams) c1141b17).rightMargin - i32;
                    int iMax3 = Math.max(0, i34);
                    int iMax4 = Math.max(0, i35);
                    int iMax5 = Math.max(0, -i34);
                    int iMax6 = Math.max(0, -i35);
                    measuredWidth4 += view.getMeasuredWidth() + iMax3 + iMax4;
                    i17++;
                    i32 = iMax6;
                    i33 = iMax5;
                }
                i19 = ((((i6 - i7) - i5) / 2) + i7) - (measuredWidth4 / 2);
                int i36 = measuredWidth4 + i19;
                if (i19 >= iM1361p2) {
                    iM1361p2 = i36 > iMin2 ? i19 - (i36 - iMin2) : i19;
                }
                size4 = arrayList.size();
                for (i18 = 0; i18 < size4; i18++) {
                    iM1361p2 = m1361p((View) arrayList.get(i18), iM1361p2, i29, iArr);
                }
                arrayList.clear();
            }
            iM1361p = m1361p(this.f1526i, paddingLeft, iMin, iArr);
        }
        iM1362q = i20;
        if (m1365t(this.f1530m)) {
        }
        if (m1365t(this.f1523f)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM1361p);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i20 - iM1362q));
        int iMax7 = Math.max(iM1361p, currentContentInsetLeft2);
        int iMin22 = Math.min(iM1362q, i20 - currentContentInsetRight2);
        if (m1365t(this.f1531n)) {
        }
        if (m1365t(this.f1527j)) {
        }
        zM1365t = m1365t(this.f1524g);
        zM1365t2 = m1365t(this.f1525h);
        if (zM1365t) {
        }
        if (zM1365t2) {
        }
        if (zM1365t) {
            if (!zM1365t) {
            }
            if (!zM1365t2) {
            }
            C1141b1 c1141b132 = (C1141b1) c1146d0.getLayoutParams();
            C1141b1 c1141b142 = (C1141b1) c1146d02.getLayoutParams();
            if (zM1365t) {
                i7 = paddingLeft;
                z3 = false;
                i8 = this.f1502B & 112;
                i9 = iMin;
                if (i8 == 48) {
                }
                if (z4) {
                }
            } else {
                i7 = paddingLeft;
                z3 = false;
                i8 = this.f1502B & 112;
                i9 = iMin;
                if (i8 == 48) {
                }
                if (z4) {
                }
            }
        }
        ArrayList arrayList2 = this.f1509I;
        m1350a(arrayList2, 3);
        size = arrayList2.size();
        iM1361p2 = iMax7;
        while (i15 < size) {
        }
        int i292 = i9;
        m1350a(arrayList2, 5);
        size2 = arrayList2.size();
        while (i16 < size2) {
        }
        m1350a(arrayList2, 1);
        int i302 = iArr[0];
        int i312 = iArr[1];
        size3 = arrayList2.size();
        int i322 = i312;
        int i332 = i302;
        i17 = 0;
        int measuredWidth42 = 0;
        while (i17 < size3) {
        }
        i19 = ((((i6 - i7) - i5) / 2) + i7) - (measuredWidth42 / 2);
        int i362 = measuredWidth42 + i19;
        if (i19 >= iM1361p2) {
        }
        size4 = arrayList2.size();
        while (i18 < size4) {
        }
        arrayList2.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c2;
        char c3;
        int iM1348k;
        int iMax;
        int iCombineMeasuredStates;
        int iM1348k2;
        int iCombineMeasuredStates2;
        int iMax2;
        int iM1349l;
        boolean z2 = AbstractC1177n1.f4699a;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            c2 = 1;
            c3 = 0;
        } else {
            c2 = 0;
            c3 = 1;
        }
        if (m1365t(this.f1526i)) {
            m1364s(this.f1526i, i, 0, i2, this.f1537t);
            iM1348k = m1348k(this.f1526i) + this.f1526i.getMeasuredWidth();
            iMax = Math.max(0, m1349l(this.f1526i) + this.f1526i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1526i.getMeasuredState());
        } else {
            iM1348k = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m1365t(this.f1530m)) {
            m1364s(this.f1530m, i, 0, i2, this.f1537t);
            iM1348k = m1348k(this.f1530m) + this.f1530m.getMeasuredWidth();
            iMax = Math.max(iMax, m1349l(this.f1530m) + this.f1530m.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1530m.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM1348k);
        int iMax4 = Math.max(0, currentContentInsetStart - iM1348k);
        int[] iArr = this.f1511K;
        iArr[c2] = iMax4;
        if (m1365t(this.f1523f)) {
            m1364s(this.f1523f, i, iMax3, i2, this.f1537t);
            iM1348k2 = m1348k(this.f1523f) + this.f1523f.getMeasuredWidth();
            iMax = Math.max(iMax, m1349l(this.f1523f) + this.f1523f.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1523f.getMeasuredState());
        } else {
            iM1348k2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iM1348k2);
        iArr[c3] = Math.max(0, currentContentInsetEnd - iM1348k2);
        if (m1365t(this.f1531n)) {
            iMax5 += m1363r(this.f1531n, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m1349l(this.f1531n) + this.f1531n.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1531n.getMeasuredState());
        }
        if (m1365t(this.f1527j)) {
            iMax5 += m1363r(this.f1527j, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m1349l(this.f1527j) + this.f1527j.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1527j.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((C1141b1) childAt.getLayoutParams()).f4590b == 0 && m1365t(childAt)) {
                iMax5 += m1363r(childAt, i, iMax5, i2, 0, iArr);
                iMax = Math.max(iMax, m1349l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i5 = this.f1540w + this.f1541x;
        int i6 = this.f1538u + this.f1539v;
        if (m1365t(this.f1524g)) {
            m1363r(this.f1524g, i, iMax5 + i6, i2, i5, iArr);
            int iM1348k3 = m1348k(this.f1524g) + this.f1524g.getMeasuredWidth();
            iM1349l = m1349l(this.f1524g) + this.f1524g.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1524g.getMeasuredState());
            iMax2 = iM1348k3;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
            iM1349l = 0;
        }
        if (m1365t(this.f1525h)) {
            iMax2 = Math.max(iMax2, m1363r(this.f1525h, i, iMax5 + i6, i2, iM1349l + i5, iArr));
            iM1349l = m1349l(this.f1525h) + this.f1525h.getMeasuredHeight() + iM1349l;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f1525h.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, iM1349l);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax6;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax5 + iMax2, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.f1518R) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i7 = 0; i7 < childCount2; i7++) {
            View childAt2 = getChildAt(i7);
            if (m1365t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C1147d1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1147d1 c1147d1 = (C1147d1) parcelable;
        super.onRestoreInstanceState(c1147d1.f1033a);
        ActionMenuView actionMenuView = this.f1523f;
        MenuC1035l menuC1035l = actionMenuView != null ? actionMenuView.f1435u : null;
        int i = c1147d1.f4601c;
        if (i != 0 && this.f1517Q != null && menuC1035l != null && (menuItemFindItem = menuC1035l.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c1147d1.f4602d) {
            RunnableC0268B runnableC0268B = this.f1522V;
            removeCallbacks(runnableC0268B);
            post(runnableC0268B);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m1353d();
        C1119R0 c1119r0 = this.f1542y;
        boolean z2 = i == 1;
        if (z2 == c1119r0.f4547g) {
            return;
        }
        c1119r0.f4547g = z2;
        if (!c1119r0.f4548h) {
            c1119r0.f4541a = c1119r0.f4545e;
            c1119r0.f4542b = c1119r0.f4546f;
            return;
        }
        if (z2) {
            int i2 = c1119r0.f4544d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = c1119r0.f4545e;
            }
            c1119r0.f4541a = i2;
            int i3 = c1119r0.f4543c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = c1119r0.f4546f;
            }
            c1119r0.f4542b = i3;
            return;
        }
        int i4 = c1119r0.f4543c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = c1119r0.f4545e;
        }
        c1119r0.f4541a = i4;
        int i5 = c1119r0.f4544d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = c1119r0.f4546f;
        }
        c1119r0.f4542b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1166k c1166k;
        C1037n c1037n;
        C1147d1 c1147d1 = new C1147d1(super.onSaveInstanceState());
        C1138a1 c1138a1 = this.f1517Q;
        if (c1138a1 != null && (c1037n = c1138a1.f4585g) != null) {
            c1147d1.f4601c = c1037n.f4288a;
        }
        ActionMenuView actionMenuView = this.f1523f;
        c1147d1.f4602d = (actionMenuView == null || (c1166k = actionMenuView.f1439y) == null || !c1166k.m2799i()) ? false : true;
        return c1147d1;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1507G = false;
        }
        if (!this.f1507G) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1507G = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1507G = false;
        }
        return true;
    }

    /* renamed from: p */
    public final int m1361p(View view, int i, int i2, int[] iArr) {
        C1141b1 c1141b1 = (C1141b1) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c1141b1).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iM1357j = m1357j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM1357j, iMax + measuredWidth, view.getMeasuredHeight() + iM1357j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c1141b1).rightMargin + iMax;
    }

    /* renamed from: q */
    public final int m1362q(View view, int i, int i2, int[] iArr) {
        C1141b1 c1141b1 = (C1141b1) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c1141b1).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iM1357j = m1357j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM1357j, iMax, view.getMeasuredHeight() + iM1357j);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c1141b1).leftMargin);
    }

    /* renamed from: r */
    public final int m1363r(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* renamed from: s */
    public final void m1364s(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z2) {
        if (this.f1521U != z2) {
            this.f1521U = z2;
            m1366u();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(AbstractC0411g.m1039n(getContext(), i));
    }

    public void setCollapsible(boolean z2) {
        this.f1518R = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1501A) {
            this.f1501A = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1543z) {
            this.f1543z = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(AbstractC0411g.m1039n(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(AbstractC0411g.m1039n(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m1356g();
        this.f1526i.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        m1354e();
        this.f1523f.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1533p != i) {
            this.f1533p = i;
            if (i == 0) {
                this.f1532o = getContext();
            } else {
                this.f1532o = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f1541x = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1539v = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1538u = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1540w = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* renamed from: t */
    public final boolean m1365t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: u */
    public final void m1366u() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM2768a = AbstractC1135Z0.m2768a(this);
            C1138a1 c1138a1 = this.f1517Q;
            boolean z2 = (c1138a1 == null || c1138a1.f4585g == null || onBackInvokedDispatcherM2768a == null || !isAttachedToWindow() || !this.f1521U) ? false : true;
            if (z2 && this.f1520T == null) {
                if (this.f1519S == null) {
                    this.f1519S = AbstractC1135Z0.m2769b(new RunnableC1131X0(this, 0));
                }
                AbstractC1135Z0.m2770c(onBackInvokedDispatcherM2768a, this.f1519S);
                this.f1520T = onBackInvokedDispatcherM2768a;
                return;
            }
            if (z2 || (onBackInvokedDispatcher = this.f1520T) == null) {
                return;
            }
            AbstractC1135Z0.m2771d(onBackInvokedDispatcher, this.f1519S);
            this.f1520T = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f1502B = 8388627;
        this.f1509I = new ArrayList();
        this.f1510J = new ArrayList();
        this.f1511K = new int[2];
        this.f1512L = new C0513t(new RunnableC1131X0(this, 1));
        this.f1513M = new ArrayList();
        this.f1514N = new C1133Y0(this);
        this.f1522V = new RunnableC0268B(18, this);
        Context context2 = getContext();
        int[] iArr = AbstractC0752a.f2760x;
        C0513t c0513tM1223A = C0513t.m1223A(context2, attributeSet, iArr, R.attr.toolbarStyle);
        AbstractC0206Q.m680o(this, context, iArr, attributeSet, (TypedArray) c0513tM1223A.f1246c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) c0513tM1223A.f1246c;
        this.f1534q = typedArray.getResourceId(28, 0);
        this.f1535r = typedArray.getResourceId(19, 0);
        this.f1502B = typedArray.getInteger(0, 8388627);
        this.f1536s = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f1541x = dimensionPixelOffset;
        this.f1540w = dimensionPixelOffset;
        this.f1539v = dimensionPixelOffset;
        this.f1538u = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f1538u = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f1539v = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f1540w = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f1541x = dimensionPixelOffset5;
        }
        this.f1537t = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        m1353d();
        C1119R0 c1119r0 = this.f1542y;
        c1119r0.f4548h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c1119r0.f4545e = dimensionPixelSize;
            c1119r0.f4541a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c1119r0.f4546f = dimensionPixelSize2;
            c1119r0.f4542b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c1119r0.m2739a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f1543z = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f1501A = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f1528k = c0513tM1223A.m1240o(4);
        this.f1529l = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f1532o = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableM1240o = c0513tM1223A.m1240o(16);
        if (drawableM1240o != null) {
            setNavigationIcon(drawableM1240o);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableM1240o2 = c0513tM1223A.m1240o(11);
        if (drawableM1240o2 != null) {
            setLogo(drawableM1240o2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(c0513tM1223A.m1239n(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(c0513tM1223A.m1239n(20));
        }
        if (typedArray.hasValue(14)) {
            mo1358m(typedArray.getResourceId(14, 0));
        }
        c0513tM1223A.m1228C();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C1141b1 c1141b1 = new C1141b1(context, attributeSet);
        c1141b1.f4589a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0752a.f2738b);
        c1141b1.f4589a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        c1141b1.f4590b = 0;
        return c1141b1;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1352c();
        }
        C1194w c1194w = this.f1530m;
        if (c1194w != null) {
            c1194w.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m1352c();
            this.f1530m.setImageDrawable(drawable);
        } else {
            C1194w c1194w = this.f1530m;
            if (c1194w != null) {
                c1194w.setImageDrawable(this.f1528k);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1527j == null) {
                this.f1527j = new C1198y(getContext(), null, 0);
            }
            if (!m1360o(this.f1527j)) {
                m1351b(this.f1527j, true);
            }
        } else {
            C1198y c1198y = this.f1527j;
            if (c1198y != null && m1360o(c1198y)) {
                removeView(this.f1527j);
                this.f1510J.remove(this.f1527j);
            }
        }
        C1198y c1198y2 = this.f1527j;
        if (c1198y2 != null) {
            c1198y2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1527j == null) {
            this.f1527j = new C1198y(getContext(), null, 0);
        }
        C1198y c1198y = this.f1527j;
        if (c1198y != null) {
            c1198y.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1356g();
        }
        C1194w c1194w = this.f1526i;
        if (c1194w != null) {
            c1194w.setContentDescription(charSequence);
            AbstractC0411g.m1026N(this.f1526i, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m1356g();
            if (!m1360o(this.f1526i)) {
                m1351b(this.f1526i, true);
            }
        } else {
            C1194w c1194w = this.f1526i;
            if (c1194w != null && m1360o(c1194w)) {
                removeView(this.f1526i);
                this.f1510J.remove(this.f1526i);
            }
        }
        C1194w c1194w2 = this.f1526i;
        if (c1194w2 != null) {
            c1194w2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C1146d0 c1146d0 = this.f1525h;
            if (c1146d0 != null && m1360o(c1146d0)) {
                removeView(this.f1525h);
                this.f1510J.remove(this.f1525h);
            }
        } else {
            if (this.f1525h == null) {
                Context context = getContext();
                C1146d0 c1146d02 = new C1146d0(context, null);
                this.f1525h = c1146d02;
                c1146d02.setSingleLine();
                this.f1525h.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1535r;
                if (i != 0) {
                    this.f1525h.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1506F;
                if (colorStateList != null) {
                    this.f1525h.setTextColor(colorStateList);
                }
            }
            if (!m1360o(this.f1525h)) {
                m1351b(this.f1525h, true);
            }
        }
        C1146d0 c1146d03 = this.f1525h;
        if (c1146d03 != null) {
            c1146d03.setText(charSequence);
        }
        this.f1504D = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1506F = colorStateList;
        C1146d0 c1146d0 = this.f1525h;
        if (c1146d0 != null) {
            c1146d0.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C1146d0 c1146d0 = this.f1524g;
            if (c1146d0 != null && m1360o(c1146d0)) {
                removeView(this.f1524g);
                this.f1510J.remove(this.f1524g);
            }
        } else {
            if (this.f1524g == null) {
                Context context = getContext();
                C1146d0 c1146d02 = new C1146d0(context, null);
                this.f1524g = c1146d02;
                c1146d02.setSingleLine();
                this.f1524g.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1534q;
                if (i != 0) {
                    this.f1524g.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1505E;
                if (colorStateList != null) {
                    this.f1524g.setTextColor(colorStateList);
                }
            }
            if (!m1360o(this.f1524g)) {
                m1351b(this.f1524g, true);
            }
        }
        C1146d0 c1146d03 = this.f1524g;
        if (c1146d03 != null) {
            c1146d03.setText(charSequence);
        }
        this.f1503C = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1505E = colorStateList;
        C1146d0 c1146d0 = this.f1524g;
        if (c1146d0 != null) {
            c1146d0.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(InterfaceC1144c1 interfaceC1144c1) {
    }
}
