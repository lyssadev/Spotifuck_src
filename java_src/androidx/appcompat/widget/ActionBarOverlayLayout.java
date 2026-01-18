package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import it.deviato.spotifuck.R;
import java.util.WeakHashMap;
import p009F.C0084c;
import p023N.AbstractC0193D;
import p023N.AbstractC0195F;
import p023N.AbstractC0206Q;
import p023N.AbstractC0244o0;
import p023N.C0213Y;
import p023N.C0238l0;
import p023N.C0240m0;
import p023N.C0242n0;
import p023N.C0247q;
import p023N.C0256u0;
import p023N.C0260w0;
import p023N.InterfaceC0243o;
import p023N.InterfaceC0245p;
import p036T0.AbstractC0411g;
import p068h.C0829N;
import p082m.C0986j;
import p084n.InterfaceC1046w;
import p084n.MenuC1035l;
import p087o.C1138a1;
import p087o.C1148e;
import p087o.C1151f;
import p087o.C1153f1;
import p087o.C1166k;
import p087o.InterfaceC1145d;
import p087o.InterfaceC1170l0;
import p087o.InterfaceC1173m0;
import p087o.RunnableC1142c;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC1170l0, InterfaceC0243o, InterfaceC0245p {

    /* renamed from: H */
    public static final int[] f1399H = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: I */
    public static final C0260w0 f1400I;

    /* renamed from: J */
    public static final Rect f1401J;

    /* renamed from: A */
    public OverScroller f1402A;

    /* renamed from: B */
    public ViewPropertyAnimator f1403B;

    /* renamed from: C */
    public final C0213Y f1404C;

    /* renamed from: D */
    public final RunnableC1142c f1405D;

    /* renamed from: E */
    public final RunnableC1142c f1406E;

    /* renamed from: F */
    public final C0247q f1407F;

    /* renamed from: G */
    public final C1151f f1408G;

    /* renamed from: f */
    public int f1409f;

    /* renamed from: g */
    public int f1410g;

    /* renamed from: h */
    public ContentFrameLayout f1411h;

    /* renamed from: i */
    public ActionBarContainer f1412i;

    /* renamed from: j */
    public InterfaceC1173m0 f1413j;

    /* renamed from: k */
    public Drawable f1414k;

    /* renamed from: l */
    public boolean f1415l;

    /* renamed from: m */
    public boolean f1416m;

    /* renamed from: n */
    public boolean f1417n;

    /* renamed from: o */
    public boolean f1418o;

    /* renamed from: p */
    public int f1419p;

    /* renamed from: q */
    public int f1420q;

    /* renamed from: r */
    public final Rect f1421r;

    /* renamed from: s */
    public final Rect f1422s;

    /* renamed from: t */
    public final Rect f1423t;

    /* renamed from: u */
    public final Rect f1424u;

    /* renamed from: v */
    public C0260w0 f1425v;

    /* renamed from: w */
    public C0260w0 f1426w;

    /* renamed from: x */
    public C0260w0 f1427x;

    /* renamed from: y */
    public C0260w0 f1428y;

    /* renamed from: z */
    public InterfaceC1145d f1429z;

    static {
        int i = Build.VERSION.SDK_INT;
        AbstractC0244o0 c0242n0 = i >= 30 ? new C0242n0() : i >= 29 ? new C0240m0() : new C0238l0();
        c0242n0.mo736g(C0084c.m329b(0, 1, 0, 1));
        f1400I = c0242n0.mo734b();
        f1401J = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1410g = 0;
        this.f1421r = new Rect();
        this.f1422s = new Rect();
        this.f1423t = new Rect();
        this.f1424u = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C0260w0 c0260w0 = C0260w0.f657b;
        this.f1425v = c0260w0;
        this.f1426w = c0260w0;
        this.f1427x = c0260w0;
        this.f1428y = c0260w0;
        this.f1404C = new C0213Y(3, this);
        this.f1405D = new RunnableC1142c(this, 0);
        this.f1406E = new RunnableC1142c(this, 1);
        m1331i(context);
        this.f1407F = new C0247q();
        C1151f c1151f = new C1151f(context);
        c1151f.setWillNotDraw(true);
        this.f1408G = c1151f;
        addView(c1151f);
    }

    /* renamed from: g */
    public static boolean m1329g(View view, Rect rect, boolean z2) {
        boolean z3;
        C1148e c1148e = (C1148e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c1148e).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c1148e).leftMargin = i2;
            z3 = true;
        } else {
            z3 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c1148e).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c1148e).topMargin = i4;
            z3 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c1148e).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c1148e).rightMargin = i6;
            z3 = true;
        }
        if (z2) {
            int i7 = ((ViewGroup.MarginLayoutParams) c1148e).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c1148e).bottomMargin = i8;
                return true;
            }
        }
        return z3;
    }

    @Override // p023N.InterfaceC0243o
    /* renamed from: a */
    public final void mo762a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // p023N.InterfaceC0245p
    /* renamed from: b */
    public final void mo768b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo763c(view, i, i2, i3, i4, i5);
    }

    @Override // p023N.InterfaceC0243o
    /* renamed from: c */
    public final void mo763c(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1148e;
    }

    @Override // p023N.InterfaceC0243o
    /* renamed from: d */
    public final void mo764d(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f1414k != null) {
            if (this.f1412i.getVisibility() == 0) {
                translationY = (int) (this.f1412i.getTranslationY() + this.f1412i.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f1414k.setBounds(0, translationY, getWidth(), this.f1414k.getIntrinsicHeight() + translationY);
            this.f1414k.draw(canvas);
        }
    }

    @Override // p023N.InterfaceC0243o
    /* renamed from: e */
    public final void mo765e(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // p023N.InterfaceC0243o
    /* renamed from: f */
    public final boolean mo766f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1148e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1148e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1412i;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0247q c0247q = this.f1407F;
        return c0247q.f646b | c0247q.f645a;
    }

    public CharSequence getTitle() {
        m1333k();
        return ((C1153f1) this.f1413j).f4605a.getTitle();
    }

    /* renamed from: h */
    public final void m1330h() {
        removeCallbacks(this.f1405D);
        removeCallbacks(this.f1406E);
        ViewPropertyAnimator viewPropertyAnimator = this.f1403B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: i */
    public final void m1331i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1399H);
        this.f1409f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f1414k = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f1402A = new OverScroller(context);
    }

    /* renamed from: j */
    public final void m1332j(int i) {
        m1333k();
        if (i == 2) {
            this.f1413j.getClass();
        } else if (i == 5) {
            this.f1413j.getClass();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    /* renamed from: k */
    public final void m1333k() {
        InterfaceC1173m0 wrapper;
        if (this.f1411h == null) {
            this.f1411h = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f1412i = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC1173m0) {
                wrapper = (InterfaceC1173m0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f1413j = wrapper;
        }
    }

    /* renamed from: l */
    public final void m1334l(MenuC1035l menuC1035l, InterfaceC1046w interfaceC1046w) {
        m1333k();
        C1153f1 c1153f1 = (C1153f1) this.f1413j;
        C1166k c1166k = c1153f1.f4617m;
        Toolbar toolbar = c1153f1.f4605a;
        if (c1166k == null) {
            c1153f1.f4617m = new C1166k(toolbar.getContext());
        }
        C1166k c1166k2 = c1153f1.f4617m;
        c1166k2.f4669j = interfaceC1046w;
        if (menuC1035l == null && toolbar.f1523f == null) {
            return;
        }
        toolbar.m1355f();
        MenuC1035l menuC1035l2 = toolbar.f1523f.f1435u;
        if (menuC1035l2 == menuC1035l) {
            return;
        }
        if (menuC1035l2 != null) {
            menuC1035l2.m2589r(toolbar.f1516P);
            menuC1035l2.m2589r(toolbar.f1517Q);
        }
        if (toolbar.f1517Q == null) {
            toolbar.f1517Q = new C1138a1(toolbar);
        }
        c1166k2.f4681v = true;
        if (menuC1035l != null) {
            menuC1035l.m2581b(c1166k2, toolbar.f1532o);
            menuC1035l.m2581b(toolbar.f1517Q, toolbar.f1532o);
        } else {
            c1166k2.mo2576f(toolbar.f1532o, null);
            toolbar.f1517Q.mo2576f(toolbar.f1532o, null);
            c1166k2.mo2548c();
            toolbar.f1517Q.mo2548c();
        }
        toolbar.f1523f.setPopupTheme(toolbar.f1533p);
        toolbar.f1523f.setPresenter(c1166k2);
        toolbar.f1516P = c1166k2;
        toolbar.m1366u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m1333k();
        C0260w0 c0260w0M800g = C0260w0.m800g(this, windowInsets);
        boolean zM1329g = m1329g(this.f1412i, new Rect(c0260w0M800g.m802b(), c0260w0M800g.m804d(), c0260w0M800g.m803c(), c0260w0M800g.m801a()), false);
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        Rect rect = this.f1421r;
        AbstractC0195F.m596b(this, c0260w0M800g, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        C0256u0 c0256u0 = c0260w0M800g.f658a;
        C0260w0 c0260w0Mo776l = c0256u0.mo776l(i, i2, i3, i4);
        this.f1425v = c0260w0Mo776l;
        boolean z2 = true;
        if (!this.f1426w.equals(c0260w0Mo776l)) {
            this.f1426w = this.f1425v;
            zM1329g = true;
        }
        Rect rect2 = this.f1422s;
        if (rect2.equals(rect)) {
            z2 = zM1329g;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return c0256u0.mo788a().f658a.mo784c().f658a.mo783b().m805f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1331i(getContext());
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        AbstractC0193D.m594c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1330h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C1148e c1148e = (C1148e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c1148e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c1148e).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        m1333k();
        measureChildWithMargins(this.f1412i, i, 0, i2, 0);
        C1148e c1148e = (C1148e) this.f1412i.getLayoutParams();
        int iMax = Math.max(0, this.f1412i.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1148e).leftMargin + ((ViewGroup.MarginLayoutParams) c1148e).rightMargin);
        int iMax2 = Math.max(0, this.f1412i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1148e).topMargin + ((ViewGroup.MarginLayoutParams) c1148e).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1412i.getMeasuredState());
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f1409f;
            if (this.f1416m && this.f1412i.getTabContainer() != null) {
                measuredHeight += this.f1409f;
            }
        } else {
            measuredHeight = this.f1412i.getVisibility() != 8 ? this.f1412i.getMeasuredHeight() : 0;
        }
        Rect rect = this.f1421r;
        Rect rect2 = this.f1423t;
        rect2.set(rect);
        this.f1427x = this.f1425v;
        if (this.f1415l || z2) {
            C0084c c0084cM329b = C0084c.m329b(this.f1427x.m802b(), this.f1427x.m804d() + measuredHeight, this.f1427x.m803c(), this.f1427x.m801a());
            C0260w0 c0260w0 = this.f1427x;
            int i3 = Build.VERSION.SDK_INT;
            AbstractC0244o0 c0242n0 = i3 >= 30 ? new C0242n0(c0260w0) : i3 >= 29 ? new C0240m0(c0260w0) : new C0238l0(c0260w0);
            c0242n0.mo736g(c0084cM329b);
            this.f1427x = c0242n0.mo734b();
        } else {
            C1151f c1151f = this.f1408G;
            C0260w0 c0260w02 = f1400I;
            Rect rect3 = this.f1424u;
            AbstractC0195F.m596b(c1151f, c0260w02, rect3);
            if (!rect3.equals(f1401J)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f1427x = this.f1427x.f658a.mo776l(0, measuredHeight, 0, 0);
            }
        }
        m1329g(this.f1411h, rect2, true);
        if (!this.f1428y.equals(this.f1427x)) {
            C0260w0 c0260w03 = this.f1427x;
            this.f1428y = c0260w03;
            ContentFrameLayout contentFrameLayout = this.f1411h;
            WindowInsets windowInsetsM805f = c0260w03.m805f();
            if (windowInsetsM805f != null) {
                WindowInsets windowInsetsM592a = AbstractC0193D.m592a(contentFrameLayout, windowInsetsM805f);
                if (!windowInsetsM592a.equals(windowInsetsM805f)) {
                    C0260w0.m800g(contentFrameLayout, windowInsetsM592a);
                }
            }
        }
        measureChildWithMargins(this.f1411h, i, 0, i2, 0);
        C1148e c1148e2 = (C1148e) this.f1411h.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f1411h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1148e2).leftMargin + ((ViewGroup.MarginLayoutParams) c1148e2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f1411h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1148e2).topMargin + ((ViewGroup.MarginLayoutParams) c1148e2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1411h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.f1417n || !z2) {
            return false;
        }
        this.f1402A.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1402A.getFinalY() > this.f1412i.getHeight()) {
            m1330h();
            this.f1406E.run();
        } else {
            m1330h();
            this.f1405D.run();
        }
        this.f1418o = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f1419p + i2;
        this.f1419p = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C0829N c0829n;
        C0986j c0986j;
        this.f1407F.f645a = i;
        this.f1419p = getActionBarHideOffset();
        m1330h();
        InterfaceC1145d interfaceC1145d = this.f1429z;
        if (interfaceC1145d == null || (c0986j = (c0829n = (C0829N) interfaceC1145d).f3192D) == null) {
            return;
        }
        c0986j.m2479a();
        c0829n.f3192D = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1412i.getVisibility() != 0) {
            return false;
        }
        return this.f1417n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f1417n || this.f1418o) {
            return;
        }
        if (this.f1419p <= this.f1412i.getHeight()) {
            m1330h();
            postDelayed(this.f1405D, 600L);
        } else {
            m1330h();
            postDelayed(this.f1406E, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m1333k();
        int i2 = this.f1420q ^ i;
        this.f1420q = i;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 256) != 0;
        InterfaceC1145d interfaceC1145d = this.f1429z;
        if (interfaceC1145d != null) {
            C0829N c0829n = (C0829N) interfaceC1145d;
            c0829n.f3212z = !z3;
            if (z2 || !z3) {
                if (c0829n.f3189A) {
                    c0829n.f3189A = false;
                    c0829n.m2109Z(true);
                }
            } else if (!c0829n.f3189A) {
                c0829n.f3189A = true;
                c0829n.m2109Z(true);
            }
        }
        if ((i2 & 256) == 0 || this.f1429z == null) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        AbstractC0193D.m594c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1410g = i;
        InterfaceC1145d interfaceC1145d = this.f1429z;
        if (interfaceC1145d != null) {
            ((C0829N) interfaceC1145d).f3211y = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        m1330h();
        this.f1412i.setTranslationY(-Math.max(0, Math.min(i, this.f1412i.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC1145d interfaceC1145d) {
        this.f1429z = interfaceC1145d;
        if (getWindowToken() != null) {
            ((C0829N) this.f1429z).f3211y = this.f1410g;
            int i = this.f1420q;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                AbstractC0193D.m594c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f1416m = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f1417n) {
            this.f1417n = z2;
            if (z2) {
                return;
            }
            m1330h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m1333k();
        C1153f1 c1153f1 = (C1153f1) this.f1413j;
        c1153f1.f4608d = i != 0 ? AbstractC0411g.m1039n(c1153f1.f4605a.getContext(), i) : null;
        c1153f1.m2780c();
    }

    public void setLogo(int i) {
        m1333k();
        C1153f1 c1153f1 = (C1153f1) this.f1413j;
        c1153f1.f4609e = i != 0 ? AbstractC0411g.m1039n(c1153f1.f4605a.getContext(), i) : null;
        c1153f1.m2780c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1415l = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i) {
    }

    @Override // p087o.InterfaceC1170l0
    public void setWindowCallback(Window.Callback callback) {
        m1333k();
        ((C1153f1) this.f1413j).f4615k = callback;
    }

    @Override // p087o.InterfaceC1170l0
    public void setWindowTitle(CharSequence charSequence) {
        m1333k();
        C1153f1 c1153f1 = (C1153f1) this.f1413j;
        if (c1153f1.f4611g) {
            return;
        }
        c1153f1.f4612h = charSequence;
        if ((c1153f1.f4606b & 8) != 0) {
            Toolbar toolbar = c1153f1.f4605a;
            toolbar.setTitle(charSequence);
            if (c1153f1.f4611g) {
                AbstractC0206Q.m682q(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1148e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m1333k();
        C1153f1 c1153f1 = (C1153f1) this.f1413j;
        c1153f1.f4608d = drawable;
        c1153f1.m2780c();
    }
}
