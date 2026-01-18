package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import p000A.C0001b;
import p007E.C0057j;
import p023N.AbstractC0195F;
import p023N.AbstractC0206Q;
import p023N.AbstractC0209U;
import p023N.AbstractC0210V;
import p023N.AbstractC0259w;
import p023N.AbstractC0261x;
import p023N.C0229h;
import p023N.C0241n;
import p023N.C0247q;
import p023N.C0263y;
import p023N.InterfaceC0245p;
import p035T.AbstractC0388e;
import p035T.AbstractC0392i;
import p035T.C0391h;
import p035T.C0395l;
import p035T.InterfaceC0393j;
import p068h.C0837h;
import p091p0.AbstractC1230a;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0245p {

    /* renamed from: H */
    public static final float f1606H = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: I */
    public static final C0391h f1607I = new C0391h(0);

    /* renamed from: J */
    public static final int[] f1608J = {R.attr.fillViewport};

    /* renamed from: A */
    public int f1609A;

    /* renamed from: B */
    public C0395l f1610B;

    /* renamed from: C */
    public final C0247q f1611C;

    /* renamed from: D */
    public final C0241n f1612D;

    /* renamed from: E */
    public float f1613E;

    /* renamed from: F */
    public InterfaceC0393j f1614F;

    /* renamed from: G */
    public final C0229h f1615G;

    /* renamed from: f */
    public final float f1616f;

    /* renamed from: g */
    public long f1617g;

    /* renamed from: h */
    public final Rect f1618h;

    /* renamed from: i */
    public final OverScroller f1619i;

    /* renamed from: j */
    public final EdgeEffect f1620j;

    /* renamed from: k */
    public final EdgeEffect f1621k;

    /* renamed from: l */
    public int f1622l;

    /* renamed from: m */
    public boolean f1623m;

    /* renamed from: n */
    public boolean f1624n;

    /* renamed from: o */
    public View f1625o;

    /* renamed from: p */
    public boolean f1626p;

    /* renamed from: q */
    public VelocityTracker f1627q;

    /* renamed from: r */
    public boolean f1628r;

    /* renamed from: s */
    public boolean f1629s;

    /* renamed from: t */
    public final int f1630t;

    /* renamed from: u */
    public final int f1631u;

    /* renamed from: v */
    public final int f1632v;

    /* renamed from: w */
    public int f1633w;

    /* renamed from: x */
    public final int[] f1634x;

    /* renamed from: y */
    public final int[] f1635y;

    /* renamed from: z */
    public int f1636z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, it.deviato.spotifuck.R.attr.nestedScrollViewStyle);
        this.f1618h = new Rect();
        this.f1623m = true;
        this.f1624n = false;
        this.f1625o = null;
        this.f1626p = false;
        this.f1629s = true;
        this.f1633w = -1;
        this.f1634x = new int[2];
        this.f1635y = new int[2];
        this.f1615G = new C0229h(getContext(), new C0001b(11, this));
        int i = Build.VERSION.SDK_INT;
        this.f1620j = i >= 31 ? AbstractC0388e.m986a(context, attributeSet) : new EdgeEffect(context);
        this.f1621k = i >= 31 ? AbstractC0388e.m986a(context, attributeSet) : new EdgeEffect(context);
        this.f1616f = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f1619i = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1630t = viewConfiguration.getScaledTouchSlop();
        this.f1631u = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1632v = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1608J, it.deviato.spotifuck.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f1611C = new C0247q();
        this.f1612D = new C0241n(this);
        setNestedScrollingEnabled(true);
        AbstractC0206Q.m681p(this, f1607I);
    }

    /* renamed from: l */
    public static boolean m1398l(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m1398l((View) parent, nestedScrollView);
    }

    @Override // p023N.InterfaceC0243o
    /* renamed from: a */
    public final void mo762a(View view, View view2, int i, int i2) {
        C0247q c0247q = this.f1611C;
        if (i2 == 1) {
            c0247q.f646b = i;
        } else {
            c0247q.f645a = i;
        }
        this.f1612D.m759g(2, i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // p023N.InterfaceC0245p
    /* renamed from: b */
    public final void mo768b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m1405n(i4, i5, iArr);
    }

    @Override // p023N.InterfaceC0243o
    /* renamed from: c */
    public final void mo763c(View view, int i, int i2, int i3, int i4, int i5) {
        m1405n(i4, i5, null);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int iRound;
        int i;
        if (this.f1619i.isFinished()) {
            return;
        }
        this.f1619i.computeScrollOffset();
        int currY = this.f1619i.getCurrY();
        int i2 = currY - this.f1609A;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f1621k;
        EdgeEffect edgeEffect2 = this.f1620j;
        if (i2 <= 0 || AbstractC1230a.m2876N(edgeEffect2) == 0.0f) {
            if (i2 < 0 && AbstractC1230a.m2876N(edgeEffect) != 0.0f) {
                float f2 = height;
                iRound = Math.round(AbstractC1230a.m2897m0(edgeEffect, (i2 * 4.0f) / f2, 0.5f) * (f2 / 4.0f));
                if (iRound != i2) {
                    edgeEffect.finish();
                }
            }
            this.f1609A = currY;
            int[] iArr = this.f1635y;
            iArr[1] = 0;
            this.f1612D.m755c(0, i2, iArr, null, 1);
            i = i2 - iArr[1];
            int scrollRange = getScrollRange();
            if (i != 0) {
                int scrollY = getScrollY();
                m1407p(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i - scrollY2;
                iArr[1] = 0;
                this.f1612D.m756d(0, scrollY2, 0, i3, this.f1634x, 1, iArr);
                i = i3 - iArr[1];
            }
            if (i != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f1619i.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f1619i.getCurrVelocity());
                    }
                }
                this.f1619i.abortAnimation();
                m1414w(1);
            }
            if (this.f1619i.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                m1414w(1);
                return;
            }
        }
        iRound = Math.round(AbstractC1230a.m2897m0(edgeEffect2, ((-i2) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i2) {
            edgeEffect2.finish();
        }
        i2 -= iRound;
        this.f1609A = currY;
        int[] iArr2 = this.f1635y;
        iArr2[1] = 0;
        this.f1612D.m755c(0, i2, iArr2, null, 1);
        i = i2 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (i != 0) {
        }
        if (i != 0) {
        }
        if (this.f1619i.isFinished()) {
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // p023N.InterfaceC0243o
    /* renamed from: d */
    public final void mo764d(View view, int i) {
        C0247q c0247q = this.f1611C;
        if (i == 1) {
            c0247q.f646b = 0;
        } else {
            c0247q.f645a = 0;
        }
        m1414w(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m1401i(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.f1612D.m753a(f2, f3, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f1612D.m754b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f1612D.m755c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f1612D.m756d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f1620j;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (AbstractC0392i.m998a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (AbstractC0392i.m998a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f1621k;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (AbstractC0392i.m998a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (AbstractC0392i.m998a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // p023N.InterfaceC0243o
    /* renamed from: e */
    public final void mo765e(View view, int i, int i2, int[] iArr, int i3) {
        this.f1612D.m755c(i, i2, iArr, null, i3);
    }

    @Override // p023N.InterfaceC0243o
    /* renamed from: f */
    public final boolean mo766f(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    /* renamed from: g */
    public final boolean m1399g(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m1404m(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m1410s(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f1618h;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            m1410s(m1400h(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && !m1404m(viewFindFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0247q c0247q = this.f1611C;
        return c0247q.f646b | c0247q.f645a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f1613E == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f1613E = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1613E;
    }

    /* renamed from: h */
    public final int m1400h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f1612D.m758f(0);
    }

    /* renamed from: i */
    public final boolean m1401i(KeyEvent keyEvent) {
        this.f1618h.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    return keyEvent.isAltPressed() ? m1403k(33) : m1399g(33);
                }
                if (keyCode == 20) {
                    return keyEvent.isAltPressed() ? m1403k(130) : m1399g(130);
                }
                if (keyCode == 62) {
                    m1408q(keyEvent.isShiftPressed() ? 33 : 130);
                    return false;
                }
                if (keyCode == 92) {
                    return m1403k(33);
                }
                if (keyCode == 93) {
                    return m1403k(130);
                }
                if (keyCode == 122) {
                    m1408q(33);
                    return false;
                }
                if (keyCode != 123) {
                    return false;
                }
                m1408q(130);
                return false;
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
        return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1612D.f631d;
    }

    /* renamed from: j */
    public final void m1402j(int i) {
        if (getChildCount() > 0) {
            this.f1619i.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f1612D.m759g(2, 1);
            this.f1609A = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    /* renamed from: k */
    public final boolean m1403k(int i) {
        int childCount;
        boolean z2 = i == 130;
        int height = getHeight();
        Rect rect = this.f1618h;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m1409r(i, rect.top, rect.bottom);
    }

    /* renamed from: m */
    public final boolean m1404m(View view, int i, int i2) {
        Rect rect = this.f1618h;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public final void m1405n(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1612D.m756d(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* renamed from: o */
    public final void m1406o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1633w) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1622l = (int) motionEvent.getY(i);
            this.f1633w = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f1627q;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1624n = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        int i;
        float axisValue;
        int width;
        char c2;
        int iM690b;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        char c3;
        boolean z2;
        VelocityTracker velocityTracker;
        float yVelocity;
        float f2;
        long j2;
        float fSqrt;
        VelocityTracker velocityTracker2;
        float[] fArr;
        int i2;
        float f3;
        if (motionEvent.getAction() != 8 || this.f1626p) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            i = 9;
            axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            axisValue = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            i = 26;
        } else {
            i = 0;
            axisValue = 0.0f;
            width = 0;
        }
        if (axisValue == 0.0f) {
            return false;
        }
        m1410s(-((int) (getVerticalScrollFactorCompat() * axisValue)), width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i == 0) {
            return true;
        }
        C0229h c0229h = this.f1615G;
        c0229h.getClass();
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i3 = c0229h.f607f;
        int[] iArr = c0229h.f609h;
        if (i3 == source && c0229h.f608g == deviceId && c0229h.f606e == i) {
            c3 = 0;
            z2 = false;
        } else {
            Context context = c0229h.f602a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 34) {
                Method method = AbstractC0210V.f567a;
                iM690b = AbstractC0209U.m690b(viewConfiguration, deviceId2, i, source2);
            } else {
                Method method2 = AbstractC0210V.f567a;
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i, source2) == null) {
                    c2 = 0;
                    iM690b = Integer.MAX_VALUE;
                    iArr[c2] = iM690b;
                    int deviceId3 = motionEvent.getDeviceId();
                    int source3 = motionEvent.getSource();
                    if (i4 < 34) {
                        scaledMaximumFlingVelocity = AbstractC0209U.m689a(viewConfiguration, deviceId3, i, source3);
                    } else {
                        InputDevice device2 = InputDevice.getDevice(deviceId3);
                        if ((device2 == null || device2.getMotionRange(i, source3) == null) ? false : true) {
                            Resources resources = context.getResources();
                            int identifier = (source3 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                            Objects.requireNonNull(viewConfiguration);
                            if (identifier == -1) {
                                scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                            } else if (identifier != 0) {
                                int dimensionPixelSize = resources.getDimensionPixelSize(identifier);
                                scaledMaximumFlingVelocity = dimensionPixelSize >= 0 ? dimensionPixelSize : Integer.MIN_VALUE;
                            }
                        } else {
                            scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                        }
                    }
                    iArr[1] = scaledMaximumFlingVelocity;
                    c0229h.f607f = source;
                    c0229h.f608g = deviceId;
                    c0229h.f606e = i;
                    c3 = 0;
                    z2 = true;
                } else {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source2 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier2 != 0) {
                        scaledMinimumFlingVelocity = resources2.getDimensionPixelSize(identifier2);
                        if (scaledMinimumFlingVelocity < 0) {
                            scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                        }
                    } else {
                        iM690b = Integer.MAX_VALUE;
                    }
                    iM690b = scaledMinimumFlingVelocity;
                }
            }
            c2 = 0;
            iArr[c2] = iM690b;
            int deviceId32 = motionEvent.getDeviceId();
            int source32 = motionEvent.getSource();
            if (i4 < 34) {
            }
            iArr[1] = scaledMaximumFlingVelocity;
            c0229h.f607f = source;
            c0229h.f608g = deviceId;
            c0229h.f606e = i;
            c3 = 0;
            z2 = true;
        }
        if (iArr[c3] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker3 = c0229h.f604c;
            if (velocityTracker3 == null) {
                return true;
            }
            velocityTracker3.recycle();
            c0229h.f604c = null;
            return true;
        }
        if (c0229h.f604c == null) {
            c0229h.f604c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker4 = c0229h.f604c;
        Map map = AbstractC0261x.f659a;
        velocityTracker4.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = AbstractC0261x.f659a;
            if (!map2.containsKey(velocityTracker4)) {
                map2.put(velocityTracker4, new C0263y());
            }
            C0263y c0263y = (C0263y) map2.get(velocityTracker4);
            c0263y.getClass();
            long eventTime = motionEvent.getEventTime();
            int i5 = c0263y.f664d;
            long[] jArr = c0263y.f662b;
            if (i5 != 0 && eventTime - jArr[c0263y.f665e] > 40) {
                c0263y.f664d = 0;
                c0263y.f663c = 0.0f;
            }
            int i6 = (c0263y.f665e + 1) % 20;
            c0263y.f665e = i6;
            int i7 = c0263y.f664d;
            if (i7 != 20) {
                c0263y.f664d = i7 + 1;
            }
            c0263y.f661a[i6] = motionEvent.getAxisValue(26);
            jArr[c0263y.f665e] = eventTime;
        }
        velocityTracker4.computeCurrentVelocity(1000, Float.MAX_VALUE);
        C0263y c0263y2 = (C0263y) AbstractC0261x.f659a.get(velocityTracker4);
        if (c0263y2 != null) {
            int i8 = c0263y2.f664d;
            if (i8 < 2) {
                velocityTracker = velocityTracker4;
                fSqrt = 0.0f;
                f3 = fSqrt * 1000;
                c0263y2.f663c = f3;
                if (f3 >= (-Math.abs(Float.MAX_VALUE))) {
                    c0263y2.f663c = -Math.abs(Float.MAX_VALUE);
                } else if (c0263y2.f663c > Math.abs(Float.MAX_VALUE)) {
                    c0263y2.f663c = Math.abs(Float.MAX_VALUE);
                }
            } else {
                int i9 = c0263y2.f665e;
                int i10 = ((i9 + 20) - (i8 - 1)) % 20;
                long[] jArr2 = c0263y2.f662b;
                long j3 = jArr2[i9];
                while (true) {
                    j2 = jArr2[i10];
                    if (j3 - j2 <= 100) {
                        break;
                    }
                    c0263y2.f664d--;
                    i10 = (i10 + 1) % 20;
                }
                int i11 = c0263y2.f664d;
                if (i11 >= 2) {
                    float[] fArr2 = c0263y2.f661a;
                    if (i11 == 2) {
                        int i12 = (i10 + 1) % 20;
                        if (j2 != jArr2[i12]) {
                            velocityTracker = velocityTracker4;
                            fSqrt = fArr2[i12] / (r8 - j2);
                        }
                    } else {
                        float f4 = 0.0f;
                        int i13 = 0;
                        int i14 = 0;
                        while (true) {
                            if (i13 >= c0263y2.f664d - 1) {
                                break;
                            }
                            int i15 = i13 + i10;
                            long j4 = jArr2[i15 % 20];
                            int i16 = (i15 + 1) % 20;
                            if (jArr2[i16] == j4) {
                                velocityTracker2 = velocityTracker4;
                                fArr = fArr2;
                                i2 = 1;
                            } else {
                                i14++;
                                velocityTracker2 = velocityTracker4;
                                float fSqrt2 = (f4 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f4) * 2.0f));
                                float f5 = fArr2[i16];
                                long j5 = jArr2[i16];
                                fArr = fArr2;
                                float f6 = f5 / (j5 - j4);
                                float fAbs = (Math.abs(f6) * (f6 - fSqrt2)) + f4;
                                i2 = 1;
                                if (i14 == 1) {
                                    fAbs *= 0.5f;
                                }
                                f4 = fAbs;
                            }
                            i13 += i2;
                            fArr2 = fArr;
                            velocityTracker4 = velocityTracker2;
                        }
                        velocityTracker = velocityTracker4;
                        fSqrt = ((float) Math.sqrt(Math.abs(f4) * 2.0f)) * (f4 < 0.0f ? -1.0f : 1.0f);
                    }
                    f3 = fSqrt * 1000;
                    c0263y2.f663c = f3;
                    if (f3 >= (-Math.abs(Float.MAX_VALUE))) {
                    }
                }
            }
        } else {
            velocityTracker = velocityTracker4;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            yVelocity = AbstractC0259w.m796a(velocityTracker, i);
        } else {
            VelocityTracker velocityTracker5 = velocityTracker;
            if (i == 0) {
                yVelocity = velocityTracker5.getXVelocity();
            } else if (i == 1) {
                yVelocity = velocityTracker5.getYVelocity();
            } else {
                C0263y c0263y3 = (C0263y) AbstractC0261x.f659a.get(velocityTracker5);
                yVelocity = (c0263y3 == null || i != 26) ? 0.0f : c0263y3.f663c;
            }
        }
        NestedScrollView nestedScrollView = (NestedScrollView) c0229h.f603b.f2g;
        float f7 = yVelocity * (-nestedScrollView.getVerticalScrollFactorCompat());
        float fSignum = Math.signum(f7);
        if (z2 || (fSignum != Math.signum(c0229h.f605d) && fSignum != 0.0f)) {
            nestedScrollView.f1619i.abortAnimation();
        }
        if (Math.abs(f7) < iArr[0]) {
            return true;
        }
        float fMax = Math.max(-r4, Math.min(f7, iArr[1]));
        if (fMax == 0.0f) {
            f2 = 0.0f;
        } else {
            nestedScrollView.f1619i.abortAnimation();
            nestedScrollView.m1402j((int) fMax);
            f2 = fMax;
        }
        c0229h.f605d = f2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0119  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.f1626p) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y2 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 < childAt.getTop() - scrollY || y2 >= childAt.getBottom() - scrollY || x2 < childAt.getLeft() || x2 >= childAt.getRight()) {
                    if (!m1413v(motionEvent) && this.f1619i.isFinished()) {
                        z2 = false;
                    }
                    this.f1626p = z2;
                    VelocityTracker velocityTracker = this.f1627q;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f1627q = null;
                    }
                } else {
                    this.f1622l = y2;
                    this.f1633w = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f1627q;
                    if (velocityTracker2 == null) {
                        this.f1627q = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f1627q.addMovement(motionEvent);
                    this.f1619i.computeScrollOffset();
                    if (!m1413v(motionEvent) && this.f1619i.isFinished()) {
                        z2 = false;
                    }
                    this.f1626p = z2;
                    this.f1612D.m759g(2, 0);
                }
            }
        } else if (i == 1) {
            this.f1626p = false;
            this.f1633w = -1;
            VelocityTracker velocityTracker3 = this.f1627q;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f1627q = null;
            }
            if (this.f1619i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m1414w(0);
        } else if (i == 2) {
            int i2 = this.f1633w;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                } else {
                    int y3 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y3 - this.f1622l) > this.f1630t && (2 & getNestedScrollAxes()) == 0) {
                        this.f1626p = true;
                        this.f1622l = y3;
                        if (this.f1627q == null) {
                            this.f1627q = VelocityTracker.obtain();
                        }
                        this.f1627q.addMovement(motionEvent);
                        this.f1636z = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i != 3) {
            if (i == 6) {
                m1406o(motionEvent);
            }
        }
        return this.f1626p;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int measuredHeight;
        super.onLayout(z2, i, i2, i3, i4);
        int i5 = 0;
        this.f1623m = false;
        View view = this.f1625o;
        if (view != null && m1398l(view, this)) {
            View view2 = this.f1625o;
            Rect rect = this.f1618h;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM1400h = m1400h(rect);
            if (iM1400h != 0) {
                scrollBy(0, iM1400h);
            }
        }
        this.f1625o = null;
        if (!this.f1624n) {
            if (this.f1610B != null) {
                scrollTo(getScrollX(), this.f1610B.f1006a);
                this.f1610B = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i5 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i5 != scrollY) {
                scrollTo(getScrollX(), i5);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1624n = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1628r && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        m1402j((int) f3);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return this.f1612D.m754b(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        this.f1612D.m755c(i, i2, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m1405n(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo762a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z2, boolean z3) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus != null && m1404m(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0395l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0395l c0395l = (C0395l) parcelable;
        super.onRestoreInstanceState(c0395l.getSuperState());
        this.f1610B = c0395l;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0395l c0395l = new C0395l(super.onSaveInstanceState());
        c0395l.f1006a = getScrollY();
        return c0395l;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC0393j interfaceC0393j = this.f1614F;
        if (interfaceC0393j != null) {
            C0057j c0057j = (C0057j) interfaceC0393j;
            C0837h.m2111b(this, (View) c0057j.f122g, (View) c0057j.f123h);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m1404m(viewFindFocus, 0, i4)) {
            return;
        }
        Rect rect = this.f1618h;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iM1400h = m1400h(rect);
        if (iM1400h != 0) {
            if (this.f1629s) {
                m1412u(0, iM1400h, false);
            } else {
                scrollBy(0, iM1400h);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo766f(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo764d(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f1627q == null) {
            this.f1627q = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1636z = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f2 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f1636z);
        C0241n c0241n = this.f1612D;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f1621k;
            EdgeEffect edgeEffect2 = this.f1620j;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f1627q;
                velocityTracker.computeCurrentVelocity(1000, this.f1632v);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1633w);
                if (Math.abs(yVelocity) >= this.f1631u) {
                    if (AbstractC1230a.m2876N(edgeEffect2) != 0.0f) {
                        if (m1411t(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            m1402j(-yVelocity);
                        }
                    } else if (AbstractC1230a.m2876N(edgeEffect) != 0.0f) {
                        int i = -yVelocity;
                        if (m1411t(edgeEffect, i)) {
                            edgeEffect.onAbsorb(i);
                        } else {
                            m1402j(i);
                        }
                    } else {
                        int i2 = -yVelocity;
                        float f3 = i2;
                        if (!c0241n.m754b(0.0f, f3)) {
                            dispatchNestedFling(0.0f, f3, true);
                            m1402j(i2);
                        }
                    }
                } else if (this.f1619i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1633w = -1;
                this.f1626p = false;
                VelocityTracker velocityTracker2 = this.f1627q;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f1627q = null;
                }
                m1414w(0);
                this.f1620j.onRelease();
                this.f1621k.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f1633w);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f1633w + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    int i3 = this.f1622l - y2;
                    float x2 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i3 / getHeight();
                    if (AbstractC1230a.m2876N(edgeEffect2) != 0.0f) {
                        float f4 = -AbstractC1230a.m2897m0(edgeEffect2, -height, x2);
                        if (AbstractC1230a.m2876N(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f2 = f4;
                    } else if (AbstractC1230a.m2876N(edgeEffect) != 0.0f) {
                        float fM2897m0 = AbstractC1230a.m2897m0(edgeEffect, height, 1.0f - x2);
                        if (AbstractC1230a.m2876N(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f2 = fM2897m0;
                    }
                    int iRound = Math.round(f2 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i4 = i3 - iRound;
                    if (!this.f1626p && Math.abs(i4) > this.f1630t) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f1626p = true;
                        i4 = i4 > 0 ? i4 - this.f1630t : i4 + this.f1630t;
                    }
                    if (this.f1626p) {
                        int iM1410s = m1410s(i4, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f1622l = y2 - iM1410s;
                        this.f1636z += iM1410s;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f1626p && getChildCount() > 0 && this.f1619i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1633w = -1;
                this.f1626p = false;
                VelocityTracker velocityTracker3 = this.f1627q;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f1627q = null;
                }
                m1414w(0);
                this.f1620j.onRelease();
                this.f1621k.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f1622l = (int) motionEvent.getY(actionIndex);
                this.f1633w = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m1406o(motionEvent);
                this.f1622l = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f1633w));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f1626p && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f1619i.isFinished()) {
                this.f1619i.abortAnimation();
                m1414w(1);
            }
            int y3 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f1622l = y3;
            this.f1633w = pointerId;
            c0241n.m759g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f1627q;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    /* renamed from: p */
    public final boolean m1407p(int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i5 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            z2 = false;
        } else {
            i2 = 0;
            z2 = true;
        }
        if (i5 > i4) {
            z3 = true;
        } else if (i5 < 0) {
            z3 = true;
            i4 = 0;
        } else {
            i4 = i5;
            z3 = false;
        }
        if (z3 && !this.f1612D.m758f(1)) {
            this.f1619i.springBack(i2, i4, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i2, i4);
        return z2 || z3;
    }

    /* renamed from: q */
    public final void m1408q(int i) {
        boolean z2 = i == 130;
        int height = getHeight();
        Rect rect = this.f1618h;
        if (z2) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        m1409r(i, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1409r(int i, int i2, int i3) {
        boolean z2;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z3 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z5 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z4 = z5;
                } else {
                    boolean z6 = (z3 && top < view.getTop()) || (!z3 && bottom > view.getBottom());
                    if (z4) {
                        if (z5 && z6) {
                            view = view2;
                        }
                    } else if (z5) {
                        view = view2;
                        z4 = true;
                    } else if (z6) {
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m1410s(z3 ? i2 - scrollY : i3 - i4, 0, 1, true);
            z2 = true;
        } else {
            z2 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f1623m) {
            this.f1625o = view2;
        } else {
            Rect rect = this.f1618h;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM1400h = m1400h(rect);
            if (iM1400h != 0) {
                scrollBy(0, iM1400h);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iM1400h = m1400h(rect);
        boolean z3 = iM1400h != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, iM1400h);
            } else {
                m1412u(0, iM1400h, false);
            }
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        VelocityTracker velocityTracker;
        if (z2 && (velocityTracker = this.f1627q) != null) {
            velocityTracker.recycle();
            this.f1627q = null;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1623m = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public final int m1410s(int i, int i2, int i3, boolean z2) {
        int i4;
        int i5;
        boolean z3;
        VelocityTracker velocityTracker;
        C0241n c0241n = this.f1612D;
        if (i3 == 1) {
            c0241n.m759g(2, i3);
        }
        boolean zM755c = this.f1612D.m755c(0, i, this.f1635y, this.f1634x, i3);
        int[] iArr = this.f1635y;
        int[] iArr2 = this.f1634x;
        if (zM755c) {
            i4 = i - iArr[1];
            i5 = iArr2[1];
        } else {
            i4 = i;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z2;
        boolean z5 = m1407p(i4, 0, scrollY, scrollRange) && !c0241n.m758f(i3);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f1612D.m756d(0, scrollY2, 0, i4 - scrollY2, this.f1634x, i3, iArr);
        int i6 = i5 + iArr2[1];
        int i7 = i4 - iArr[1];
        int i8 = scrollY + i7;
        EdgeEffect edgeEffect = this.f1621k;
        EdgeEffect edgeEffect2 = this.f1620j;
        if (i8 < 0) {
            if (z4) {
                AbstractC1230a.m2897m0(edgeEffect2, (-i7) / getHeight(), i2 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i8 > scrollRange && z4) {
            AbstractC1230a.m2897m0(edgeEffect, i7 / getHeight(), 1.0f - (i2 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z3 = z5;
        } else {
            postInvalidateOnAnimation();
            z3 = false;
        }
        if (z3 && i3 == 0 && (velocityTracker = this.f1627q) != null) {
            velocityTracker.clear();
        }
        if (i3 == 1) {
            m1414w(i3);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i6;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f1628r) {
            this.f1628r = z2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0241n c0241n = this.f1612D;
        if (c0241n.f631d) {
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            AbstractC0195F.m620z(c0241n.f630c);
        }
        c0241n.f631d = z2;
    }

    public void setOnScrollChangeListener(InterfaceC0393j interfaceC0393j) {
        this.f1614F = interfaceC0393j;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f1629s = z2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f1612D.m759g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m1414w(0);
    }

    /* renamed from: t */
    public final boolean m1411t(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fM2876N = AbstractC1230a.m2876N(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i) * 0.35f;
        float f2 = this.f1616f * 0.015f;
        double dLog = Math.log(fAbs / f2);
        double d2 = f1606H;
        return ((float) (Math.exp((d2 / (d2 - 1.0d)) * dLog) * ((double) f2))) < fM2876N;
    }

    /* renamed from: u */
    public final void m1412u(int i, int i2, boolean z2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1617g > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f1619i.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z2) {
                this.f1612D.m759g(2, 1);
            } else {
                m1414w(1);
            }
            this.f1609A = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f1619i.isFinished()) {
                this.f1619i.abortAnimation();
                m1414w(1);
            }
            scrollBy(i, i2);
        }
        this.f1617g = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: v */
    public final boolean m1413v(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.f1620j;
        if (AbstractC1230a.m2876N(edgeEffect) != 0.0f) {
            AbstractC1230a.m2897m0(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z2 = true;
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.f1621k;
        if (AbstractC1230a.m2876N(edgeEffect2) == 0.0f) {
            return z2;
        }
        AbstractC1230a.m2897m0(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* renamed from: w */
    public final void m1414w(int i) {
        this.f1612D.m760h(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
