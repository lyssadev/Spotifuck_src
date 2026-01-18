package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import it.deviato.spotifuck.R;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import p000A.AbstractC0002c;
import p000A.AbstractC0011l;
import p000A.C0001b;
import p000A.C0005f;
import p000A.C0008i;
import p000A.C0009j;
import p000A.C0010k;
import p000A.InterfaceC0003d;
import p000A.ViewGroupOnHierarchyChangeListenerC0004e;
import p000A.ViewTreeObserverOnPreDrawListenerC0006g;
import p005D.AbstractC0040a;
import p021M.C0182c;
import p021M.C0183d;
import p023N.AbstractC0193D;
import p023N.AbstractC0195F;
import p023N.AbstractC0206Q;
import p023N.C0247q;
import p023N.C0260w0;
import p023N.InterfaceC0243o;
import p023N.InterfaceC0245p;
import p091p0.AbstractC1230a;
import p096r.C1256k;
import p113z.AbstractC1365a;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0243o, InterfaceC0245p {

    /* renamed from: A */
    public static final ThreadLocal f1565A;

    /* renamed from: B */
    public static final C0009j f1566B;

    /* renamed from: C */
    public static final C0183d f1567C;

    /* renamed from: y */
    public static final String f1568y;

    /* renamed from: z */
    public static final Class[] f1569z;

    /* renamed from: f */
    public final ArrayList f1570f;

    /* renamed from: g */
    public final C0010k f1571g;

    /* renamed from: h */
    public final ArrayList f1572h;

    /* renamed from: i */
    public final ArrayList f1573i;

    /* renamed from: j */
    public final int[] f1574j;

    /* renamed from: k */
    public final int[] f1575k;

    /* renamed from: l */
    public boolean f1576l;

    /* renamed from: m */
    public boolean f1577m;

    /* renamed from: n */
    public final int[] f1578n;

    /* renamed from: o */
    public View f1579o;

    /* renamed from: p */
    public View f1580p;

    /* renamed from: q */
    public ViewTreeObserverOnPreDrawListenerC0006g f1581q;

    /* renamed from: r */
    public boolean f1582r;

    /* renamed from: s */
    public C0260w0 f1583s;

    /* renamed from: t */
    public boolean f1584t;

    /* renamed from: u */
    public Drawable f1585u;

    /* renamed from: v */
    public ViewGroup.OnHierarchyChangeListener f1586v;

    /* renamed from: w */
    public C0001b f1587w;

    /* renamed from: x */
    public final C0247q f1588x;

    static {
        int i = 0;
        Package r12 = CoordinatorLayout.class.getPackage();
        f1568y = r12 != null ? r12.getName() : null;
        f1566B = new C0009j(i);
        f1569z = new Class[]{Context.class, AttributeSet.class};
        f1565A = new ThreadLocal();
        f1567C = new C0183d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f1570f = new ArrayList();
        this.f1571g = new C0010k(0);
        this.f1572h = new ArrayList();
        this.f1573i = new ArrayList();
        this.f1574j = new int[2];
        this.f1575k = new int[2];
        this.f1588x = new C0247q();
        int[] iArr = AbstractC1365a.f5701a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f1578n = intArray;
            float f2 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.f1578n[i] = (int) (r3[i] * f2);
            }
        }
        this.f1585u = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        m1392w();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0004e(this));
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* renamed from: g */
    public static Rect m1376g() {
        Rect rect = (Rect) f1567C.mo582a();
        return rect == null ? new Rect() : rect;
    }

    /* renamed from: l */
    public static void m1377l(int i, Rect rect, Rect rect2, C0005f c0005f, int i2, int i3) {
        int i4 = c0005f.f6c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c0005f.f7d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int iWidth = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    /* renamed from: n */
    public static C0005f m1378n(View view) {
        C0005f c0005f = (C0005f) view.getLayoutParams();
        if (!c0005f.f5b) {
            InterfaceC0003d interfaceC0003d = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC0003d = (InterfaceC0003d) superclass.getAnnotation(InterfaceC0003d.class);
                if (interfaceC0003d != null) {
                    break;
                }
            }
            if (interfaceC0003d != null) {
                try {
                    AbstractC0002c abstractC0002c = (AbstractC0002c) interfaceC0003d.value().getDeclaredConstructor(null).newInstance(null);
                    AbstractC0002c abstractC0002c2 = c0005f.f4a;
                    if (abstractC0002c2 != abstractC0002c) {
                        if (abstractC0002c2 != null) {
                            abstractC0002c2.mo65e();
                        }
                        c0005f.f4a = abstractC0002c;
                        c0005f.f5b = true;
                        if (abstractC0002c != null) {
                            abstractC0002c.mo63c(c0005f);
                        }
                    }
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC0003d.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            c0005f.f5b = true;
        }
        return c0005f;
    }

    /* renamed from: u */
    public static void m1379u(View view, int i) {
        C0005f c0005f = (C0005f) view.getLayoutParams();
        int i2 = c0005f.f12i;
        if (i2 != i) {
            AbstractC0206Q.m675j(view, i - i2);
            c0005f.f12i = i;
        }
    }

    /* renamed from: v */
    public static void m1380v(View view, int i) {
        C0005f c0005f = (C0005f) view.getLayoutParams();
        int i2 = c0005f.f13j;
        if (i2 != i) {
            AbstractC0206Q.m676k(view, i - i2);
            c0005f.f13j = i;
        }
    }

    @Override // p023N.InterfaceC0243o
    /* renamed from: a */
    public final void mo762a(View view, View view2, int i, int i2) {
        C0247q c0247q = this.f1588x;
        if (i2 == 1) {
            c0247q.f646b = i;
        } else {
            c0247q.f645a = i;
        }
        this.f1580p = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((C0005f) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // p023N.InterfaceC0245p
    /* renamed from: b */
    public final void mo768b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC0002c abstractC0002c;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0005f c0005f = (C0005f) childAt.getLayoutParams();
                if (c0005f.m78a(i5) && (abstractC0002c = c0005f.f4a) != null) {
                    int[] iArr2 = this.f1574j;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0002c.mo71k(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z2) {
            m1387p(1);
        }
    }

    @Override // p023N.InterfaceC0243o
    /* renamed from: c */
    public final void mo763c(View view, int i, int i2, int i3, int i4, int i5) {
        mo768b(view, i, i2, i3, i4, 0, this.f1575k);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0005f) && super.checkLayoutParams(layoutParams);
    }

    @Override // p023N.InterfaceC0243o
    /* renamed from: d */
    public final void mo764d(View view, int i) {
        C0247q c0247q = this.f1588x;
        if (i == 1) {
            c0247q.f646b = 0;
        } else {
            c0247q.f645a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0005f c0005f = (C0005f) childAt.getLayoutParams();
            if (c0005f.m78a(i)) {
                AbstractC0002c abstractC0002c = c0005f.f4a;
                if (abstractC0002c != null) {
                    abstractC0002c.mo76p(childAt, view, i);
                }
                if (i == 0) {
                    c0005f.f16m = false;
                } else if (i == 1) {
                    c0005f.f17n = false;
                }
            }
        }
        this.f1580p = null;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        AbstractC0002c abstractC0002c = ((C0005f) view.getLayoutParams()).f4a;
        if (abstractC0002c != null) {
            abstractC0002c.getClass();
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1585u;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // p023N.InterfaceC0243o
    /* renamed from: e */
    public final void mo765e(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC0002c abstractC0002c;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0005f c0005f = (C0005f) childAt.getLayoutParams();
                if (c0005f.m78a(i3) && (abstractC0002c = c0005f.f4a) != null) {
                    int[] iArr2 = this.f1574j;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0002c.mo70j(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z2) {
            m1387p(1);
        }
    }

    @Override // p023N.InterfaceC0243o
    /* renamed from: f */
    public final boolean mo766f(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0005f c0005f = (C0005f) childAt.getLayoutParams();
                AbstractC0002c abstractC0002c = c0005f.f4a;
                if (abstractC0002c != null) {
                    boolean zMo75o = abstractC0002c.mo75o(childAt, i, i2);
                    z2 |= zMo75o;
                    if (i2 == 0) {
                        c0005f.f16m = zMo75o;
                    } else if (i2 == 1) {
                        c0005f.f17n = zMo75o;
                    }
                } else if (i2 == 0) {
                    c0005f.f16m = false;
                } else if (i2 == 1) {
                    c0005f.f17n = false;
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0005f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0005f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        m1390s();
        return Collections.unmodifiableList(this.f1570f);
    }

    public final C0260w0 getLastWindowInsets() {
        return this.f1583s;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0247q c0247q = this.f1588x;
        return c0247q.f646b | c0247q.f645a;
    }

    public Drawable getStatusBarBackground() {
        return this.f1585u;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    /* renamed from: h */
    public final void m1381h(C0005f c0005f, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0005f).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c0005f).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0005f).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c0005f).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    /* renamed from: i */
    public final void m1382i(View view, Rect rect, boolean z2) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            m1384k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: j */
    public final ArrayList m1383j(View view) {
        C1256k c1256k = (C1256k) this.f1571g.f24g;
        int i = c1256k.f5012c;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) c1256k.m2975j(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c1256k.m2973h(i2));
            }
        }
        ArrayList arrayList3 = this.f1573i;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    /* renamed from: k */
    public final void m1384k(View view, Rect rect) {
        ThreadLocal threadLocal = AbstractC0011l.f27a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = AbstractC0011l.f27a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        AbstractC0011l.m97a(this, view, matrix);
        ThreadLocal threadLocal3 = AbstractC0011l.f28b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: m */
    public final int m1385m(int i) {
        int[] iArr = this.f1578n;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    /* renamed from: o */
    public final boolean m1386o(View view, int i, int i2) {
        C0183d c0183d = f1567C;
        Rect rectM1376g = m1376g();
        m1384k(view, rectM1376g);
        try {
            return rectM1376g.contains(i, i2);
        } finally {
            rectM1376g.setEmpty();
            c0183d.mo584c(rectM1376g);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1391t(false);
        if (this.f1582r) {
            if (this.f1581q == null) {
                this.f1581q = new ViewTreeObserverOnPreDrawListenerC0006g(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1581q);
        }
        if (this.f1583s == null) {
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            if (getFitsSystemWindows()) {
                AbstractC0193D.m594c(this);
            }
        }
        this.f1577m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1391t(false);
        if (this.f1582r && this.f1581q != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1581q);
        }
        View view = this.f1580p;
        if (view != null) {
            mo764d(view, 0);
        }
        this.f1577m = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f1584t || this.f1585u == null) {
            return;
        }
        C0260w0 c0260w0 = this.f1583s;
        int iM804d = c0260w0 != null ? c0260w0.m804d() : 0;
        if (iM804d > 0) {
            this.f1585u.setBounds(0, 0, getWidth(), iM804d);
            this.f1585u.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m1391t(true);
        }
        boolean zM1389r = m1389r(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m1391t(true);
        }
        return zM1389r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        AbstractC0002c abstractC0002c;
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f1570f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((abstractC0002c = ((C0005f) view.getLayoutParams()).f4a) == null || !abstractC0002c.mo67g(this, view, layoutDirection))) {
                m1388q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0189  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        AbstractC0002c abstractC0002c;
        int i7;
        ArrayList arrayList;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iMax;
        m1390s();
        int childCount = getChildCount();
        int i15 = 0;
        loop0: while (true) {
            if (i15 >= childCount) {
                z2 = false;
                break;
            }
            View childAt = getChildAt(i15);
            C1256k c1256k = (C1256k) this.f1571g.f24g;
            int i16 = c1256k.f5012c;
            for (int i17 = 0; i17 < i16; i17++) {
                ArrayList arrayList2 = (ArrayList) c1256k.m2975j(i17);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z2 = true;
                    break loop0;
                }
            }
            i15++;
        }
        if (z2 != this.f1582r) {
            if (z2) {
                if (this.f1577m) {
                    if (this.f1581q == null) {
                        this.f1581q = new ViewTreeObserverOnPreDrawListenerC0006g(this);
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.f1581q);
                }
                this.f1582r = true;
            } else {
                if (this.f1577m && this.f1581q != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.f1581q);
                }
                this.f1582r = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        int layoutDirection = getLayoutDirection();
        boolean z3 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i18 = paddingLeft + paddingRight;
        int i19 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z4 = this.f1583s != null && getFitsSystemWindows();
        ArrayList arrayList3 = this.f1570f;
        int size3 = arrayList3.size();
        int i20 = suggestedMinimumWidth;
        int i21 = suggestedMinimumHeight;
        int iCombineMeasuredStates = 0;
        int i22 = 0;
        while (i22 < size3) {
            View view = (View) arrayList3.get(i22);
            if (view.getVisibility() == 8) {
                i12 = i22;
                i7 = size3;
                arrayList = arrayList3;
                i10 = paddingLeft;
                i13 = paddingRight;
                i8 = layoutDirection;
            } else {
                C0005f c0005f = (C0005f) view.getLayoutParams();
                int i23 = c0005f.f8e;
                if (i23 < 0 || mode == 0) {
                    i3 = iCombineMeasuredStates;
                    i4 = i22;
                } else {
                    int iM1385m = m1385m(i23);
                    i3 = iCombineMeasuredStates;
                    int i24 = c0005f.f6c;
                    if (i24 == 0) {
                        i24 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i24, layoutDirection) & 7;
                    i4 = i22;
                    if ((absoluteGravity == 3 && !z3) || (absoluteGravity == 5 && z3)) {
                        iMax = Math.max(0, (size - paddingRight) - iM1385m);
                    } else if ((absoluteGravity == 5 && !z3) || (absoluteGravity == 3 && z3)) {
                        iMax = Math.max(0, iM1385m - paddingLeft);
                    }
                    i5 = iMax;
                    if (z4 || view.getFitsSystemWindows()) {
                        i6 = i21;
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    } else {
                        int iM803c = this.f1583s.m803c() + this.f1583s.m802b();
                        i6 = i21;
                        int iM801a = this.f1583s.m801a() + this.f1583s.m804d();
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iM803c, mode);
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iM801a, mode2);
                    }
                    abstractC0002c = c0005f.f4a;
                    if (abstractC0002c == null) {
                        int i25 = i3;
                        i12 = i4;
                        i10 = paddingLeft;
                        i11 = i25;
                        int i26 = i6;
                        i13 = paddingRight;
                        i14 = i26;
                        i8 = layoutDirection;
                        i9 = i20;
                        i7 = size3;
                        arrayList = arrayList3;
                        if (!abstractC0002c.mo68h(this, view, iMakeMeasureSpec, i5, iMakeMeasureSpec2)) {
                        }
                        int iMax2 = Math.max(i9, view.getMeasuredWidth() + i18 + ((ViewGroup.MarginLayoutParams) c0005f).leftMargin + ((ViewGroup.MarginLayoutParams) c0005f).rightMargin);
                        int iMax3 = Math.max(i14, view.getMeasuredHeight() + i19 + ((ViewGroup.MarginLayoutParams) c0005f).topMargin + ((ViewGroup.MarginLayoutParams) c0005f).bottomMargin);
                        i20 = iMax2;
                        iCombineMeasuredStates = View.combineMeasuredStates(i11, view.getMeasuredState());
                        i21 = iMax3;
                    } else {
                        i7 = size3;
                        arrayList = arrayList3;
                        i8 = layoutDirection;
                        i9 = i20;
                        int i27 = i4;
                        i10 = paddingLeft;
                        i11 = i3;
                        i12 = i27;
                        int i28 = i6;
                        i13 = paddingRight;
                        i14 = i28;
                    }
                    measureChildWithMargins(view, iMakeMeasureSpec, i5, iMakeMeasureSpec2, 0);
                    int iMax22 = Math.max(i9, view.getMeasuredWidth() + i18 + ((ViewGroup.MarginLayoutParams) c0005f).leftMargin + ((ViewGroup.MarginLayoutParams) c0005f).rightMargin);
                    int iMax32 = Math.max(i14, view.getMeasuredHeight() + i19 + ((ViewGroup.MarginLayoutParams) c0005f).topMargin + ((ViewGroup.MarginLayoutParams) c0005f).bottomMargin);
                    i20 = iMax22;
                    iCombineMeasuredStates = View.combineMeasuredStates(i11, view.getMeasuredState());
                    i21 = iMax32;
                }
                i5 = 0;
                if (z4) {
                    i6 = i21;
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                    abstractC0002c = c0005f.f4a;
                    if (abstractC0002c == null) {
                    }
                    measureChildWithMargins(view, iMakeMeasureSpec, i5, iMakeMeasureSpec2, 0);
                    int iMax222 = Math.max(i9, view.getMeasuredWidth() + i18 + ((ViewGroup.MarginLayoutParams) c0005f).leftMargin + ((ViewGroup.MarginLayoutParams) c0005f).rightMargin);
                    int iMax322 = Math.max(i14, view.getMeasuredHeight() + i19 + ((ViewGroup.MarginLayoutParams) c0005f).topMargin + ((ViewGroup.MarginLayoutParams) c0005f).bottomMargin);
                    i20 = iMax222;
                    iCombineMeasuredStates = View.combineMeasuredStates(i11, view.getMeasuredState());
                    i21 = iMax322;
                }
            }
            i22 = i12 + 1;
            paddingLeft = i10;
            paddingRight = i13;
            layoutDirection = i8;
            size3 = i7;
            arrayList3 = arrayList;
        }
        int i29 = iCombineMeasuredStates;
        setMeasuredDimension(View.resolveSizeAndState(i20, i, (-16777216) & i29), View.resolveSizeAndState(i21, i2, i29 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0005f c0005f = (C0005f) childAt.getLayoutParams();
                if (c0005f.m78a(0)) {
                    AbstractC0002c abstractC0002c = c0005f.f4a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        AbstractC0002c abstractC0002c;
        int childCount = getChildCount();
        boolean zMo69i = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0005f c0005f = (C0005f) childAt.getLayoutParams();
                if (c0005f.m78a(0) && (abstractC0002c = c0005f.f4a) != null) {
                    zMo69i |= abstractC0002c.mo69i(view);
                }
            }
        }
        return zMo69i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo765e(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo763c(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo762a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0008i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0008i c0008i = (C0008i) parcelable;
        super.onRestoreInstanceState(c0008i.f1033a);
        SparseArray sparseArray = c0008i.f21c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0002c abstractC0002c = m1378n(childAt).f4a;
            if (id != -1 && abstractC0002c != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC0002c.mo73m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableMo74n;
        C0008i c0008i = new C0008i(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0002c abstractC0002c = ((C0005f) childAt.getLayoutParams()).f4a;
            if (id != -1 && abstractC0002c != null && (parcelableMo74n = abstractC0002c.mo74n(childAt)) != null) {
                sparseArray.append(id, parcelableMo74n);
            }
        }
        c0008i.f21c = sparseArray;
        return c0008i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo766f(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo764d(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM1389r;
        boolean zMo77q;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1579o == null) {
            zM1389r = m1389r(motionEvent, 1);
            if (!zM1389r) {
                zMo77q = false;
            }
            motionEventObtain = null;
            if (this.f1579o != null) {
                zMo77q |= super.onTouchEvent(motionEvent);
            } else if (zM1389r) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                m1391t(false);
            }
            return zMo77q;
        }
        zM1389r = false;
        AbstractC0002c abstractC0002c = ((C0005f) this.f1579o.getLayoutParams()).f4a;
        if (abstractC0002c != null) {
            zMo77q = abstractC0002c.mo77q(this.f1579o, motionEvent);
        }
        motionEventObtain = null;
        if (this.f1579o != null) {
        }
        if (motionEventObtain != null) {
        }
        if (actionMasked != 1) {
            m1391t(false);
        }
        return zMo77q;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x004b A[EDGE_INSN: B:134:0x004b->B:10:0x004b BREAK  A[LOOP:2: B:122:0x02d7->B:127:0x02ee], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1387p(int i) {
        int i2;
        Rect rect;
        int i3;
        Rect rect2;
        int i4;
        Rect rect3;
        int i5;
        int i6;
        ArrayList arrayList;
        boolean z2;
        int i7;
        boolean z3;
        int width;
        int i8;
        int i9;
        int i10;
        int height;
        int i11;
        int i12;
        int i13;
        C0005f c0005f;
        int i14;
        C0183d c0183d;
        int i15;
        Rect rect4;
        Rect rect5;
        Rect rect6;
        ArrayList arrayList2;
        int i16;
        AbstractC0002c abstractC0002c;
        int i17 = i;
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.f1570f;
        int size = arrayList3.size();
        Rect rectM1376g = m1376g();
        Rect rectM1376g2 = m1376g();
        Rect rectM1376g3 = m1376g();
        int i18 = 0;
        while (true) {
            C0183d c0183d2 = f1567C;
            if (i18 >= size) {
                Rect rect7 = rectM1376g3;
                Rect rect8 = rectM1376g2;
                Rect rect9 = rectM1376g;
                rect9.setEmpty();
                c0183d2.mo584c(rect9);
                rect8.setEmpty();
                c0183d2.mo584c(rect8);
                rect7.setEmpty();
                c0183d2.mo584c(rect7);
                return;
            }
            View view = (View) arrayList3.get(i18);
            C0005f c0005f2 = (C0005f) view.getLayoutParams();
            if (i17 == 0 && view.getVisibility() == 8) {
                i4 = i17;
                i3 = layoutDirection;
                i2 = i18;
                rect3 = rectM1376g3;
                rect = rectM1376g2;
                rect2 = rectM1376g;
                arrayList = arrayList3;
                i6 = size;
            } else {
                int i19 = 0;
                while (i19 < i18) {
                    if (c0005f2.f15l == ((View) arrayList3.get(i19))) {
                        C0005f c0005f3 = (C0005f) view.getLayoutParams();
                        if (c0005f3.f14k != null) {
                            Rect rectM1376g4 = m1376g();
                            Rect rectM1376g5 = m1376g();
                            arrayList2 = arrayList3;
                            Rect rectM1376g6 = m1376g();
                            m1384k(c0005f3.f14k, rectM1376g4);
                            m1382i(view, rectM1376g5, false);
                            i16 = size;
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            c0005f = c0005f2;
                            c0183d = c0183d2;
                            i15 = i18;
                            i14 = layoutDirection;
                            rect4 = rectM1376g3;
                            rect5 = rectM1376g2;
                            rect6 = rectM1376g;
                            m1377l(layoutDirection, rectM1376g4, rectM1376g6, c0005f3, measuredWidth, measuredHeight);
                            boolean z4 = (rectM1376g6.left == rectM1376g5.left && rectM1376g6.top == rectM1376g5.top) ? false : true;
                            m1381h(c0005f3, rectM1376g6, measuredWidth, measuredHeight);
                            int i20 = rectM1376g6.left - rectM1376g5.left;
                            int i21 = rectM1376g6.top - rectM1376g5.top;
                            if (i20 != 0) {
                                AbstractC0206Q.m675j(view, i20);
                            }
                            if (i21 != 0) {
                                AbstractC0206Q.m676k(view, i21);
                            }
                            if (z4 && (abstractC0002c = c0005f3.f4a) != null) {
                                abstractC0002c.mo64d(this, view, c0005f3.f14k);
                            }
                            rectM1376g4.setEmpty();
                            c0183d.mo584c(rectM1376g4);
                            rectM1376g5.setEmpty();
                            c0183d.mo584c(rectM1376g5);
                            rectM1376g6.setEmpty();
                            c0183d.mo584c(rectM1376g6);
                        } else {
                            c0005f = c0005f2;
                            i14 = layoutDirection;
                            c0183d = c0183d2;
                            i15 = i18;
                            rect4 = rectM1376g3;
                            rect5 = rectM1376g2;
                            rect6 = rectM1376g;
                            arrayList2 = arrayList3;
                            i16 = size;
                        }
                    }
                    i19++;
                    c0183d2 = c0183d;
                    size = i16;
                    arrayList3 = arrayList2;
                    layoutDirection = i14;
                    c0005f2 = c0005f;
                    i18 = i15;
                    rectM1376g3 = rect4;
                    rectM1376g2 = rect5;
                    rectM1376g = rect6;
                }
                C0005f c0005f4 = c0005f2;
                int i22 = layoutDirection;
                C0182c c0182c = c0183d2;
                i2 = i18;
                Rect rect10 = rectM1376g3;
                rect = rectM1376g2;
                Rect rect11 = rectM1376g;
                ArrayList arrayList4 = arrayList3;
                int i23 = size;
                m1382i(view, rect, true);
                if (c0005f4.f10g == 0 || rect.isEmpty()) {
                    i3 = i22;
                    rect2 = rect11;
                } else {
                    i3 = i22;
                    int absoluteGravity = Gravity.getAbsoluteGravity(c0005f4.f10g, i3);
                    int i24 = absoluteGravity & 112;
                    if (i24 == 48) {
                        rect2 = rect11;
                        rect2.top = Math.max(rect2.top, rect.bottom);
                    } else if (i24 != 80) {
                        rect2 = rect11;
                    } else {
                        rect2 = rect11;
                        rect2.bottom = Math.max(rect2.bottom, getHeight() - rect.top);
                    }
                    int i25 = absoluteGravity & 7;
                    if (i25 == 3) {
                        rect2.left = Math.max(rect2.left, rect.right);
                    } else if (i25 == 5) {
                        rect2.right = Math.max(rect2.right, getWidth() - rect.left);
                    }
                }
                if (c0005f4.f11h == 0 || view.getVisibility() != 0) {
                    i4 = i;
                    if (i4 != 2) {
                        rect3 = rect10;
                        rect3.set(((C0005f) view.getLayoutParams()).f18o);
                        if (rect3.equals(rect)) {
                            i6 = i23;
                            arrayList = arrayList4;
                        } else {
                            ((C0005f) view.getLayoutParams()).f18o.set(rect);
                        }
                    } else {
                        rect3 = rect10;
                    }
                    i5 = i2 + 1;
                    i6 = i23;
                    while (true) {
                        arrayList = arrayList4;
                        if (i5 >= i6) {
                            break;
                        }
                        View view2 = (View) arrayList.get(i5);
                        AbstractC0002c abstractC0002c2 = ((C0005f) view2.getLayoutParams()).f4a;
                        if (abstractC0002c2 != null) {
                            abstractC0002c2.mo62b(view2);
                        }
                        i5++;
                        arrayList4 = arrayList;
                    }
                } else {
                    WeakHashMap weakHashMap2 = AbstractC0206Q.f560a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        C0005f c0005f5 = (C0005f) view.getLayoutParams();
                        AbstractC0002c abstractC0002c3 = c0005f5.f4a;
                        Rect rectM1376g7 = m1376g();
                        Rect rectM1376g8 = m1376g();
                        rectM1376g8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (abstractC0002c3 == null || !abstractC0002c3.mo61a(view)) {
                            rectM1376g7.set(rectM1376g8);
                        } else if (!rectM1376g8.contains(rectM1376g7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectM1376g7.toShortString() + " | Bounds:" + rectM1376g8.toShortString());
                        }
                        rectM1376g8.setEmpty();
                        c0182c.mo584c(rectM1376g8);
                        if (rectM1376g7.isEmpty()) {
                            rectM1376g7.setEmpty();
                            c0182c.mo584c(rectM1376g7);
                            i4 = i;
                            if (i4 != 2) {
                            }
                            i5 = i2 + 1;
                            i6 = i23;
                            while (true) {
                                arrayList = arrayList4;
                                if (i5 >= i6) {
                                }
                                i5++;
                                arrayList4 = arrayList;
                            }
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(c0005f5.f11h, i3);
                            if ((absoluteGravity2 & 48) != 48 || (i12 = (rectM1376g7.top - ((ViewGroup.MarginLayoutParams) c0005f5).topMargin) - c0005f5.f13j) >= (i13 = rect2.top)) {
                                z2 = false;
                            } else {
                                m1380v(view, i13 - i12);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectM1376g7.bottom) - ((ViewGroup.MarginLayoutParams) c0005f5).bottomMargin) + c0005f5.f13j) < (i11 = rect2.bottom)) {
                                m1380v(view, height - i11);
                                z2 = true;
                            }
                            if (z2) {
                                i7 = 0;
                            } else {
                                i7 = 0;
                                m1380v(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i9 = (rectM1376g7.left - ((ViewGroup.MarginLayoutParams) c0005f5).leftMargin) - c0005f5.f12i) >= (i10 = rect2.left)) {
                                z3 = false;
                            } else {
                                m1379u(view, i10 - i9);
                                z3 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectM1376g7.right) - ((ViewGroup.MarginLayoutParams) c0005f5).rightMargin) + c0005f5.f12i) < (i8 = rect2.right)) {
                                m1379u(view, width - i8);
                                z3 = true;
                            }
                            if (!z3) {
                                m1379u(view, i7);
                            }
                            rectM1376g7.setEmpty();
                            c0182c.mo584c(rectM1376g7);
                            i4 = i;
                            if (i4 != 2) {
                            }
                            i5 = i2 + 1;
                            i6 = i23;
                            while (true) {
                                arrayList = arrayList4;
                                if (i5 >= i6) {
                                }
                                i5++;
                                arrayList4 = arrayList;
                            }
                        }
                    }
                }
            }
            size = i6;
            i18 = i2 + 1;
            rectM1376g2 = rect;
            i17 = i4;
            rectM1376g3 = rect3;
            arrayList3 = arrayList;
            rectM1376g = rect2;
            layoutDirection = i3;
        }
    }

    /* renamed from: q */
    public final void m1388q(View view, int i) {
        Rect rectM1376g;
        Rect rectM1376g2;
        C0005f c0005f = (C0005f) view.getLayoutParams();
        View view2 = c0005f.f14k;
        if (view2 == null && c0005f.f9f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        C0183d c0183d = f1567C;
        if (view2 != null) {
            rectM1376g = m1376g();
            rectM1376g2 = m1376g();
            try {
                m1384k(view2, rectM1376g);
                C0005f c0005f2 = (C0005f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m1377l(i, rectM1376g, rectM1376g2, c0005f2, measuredWidth, measuredHeight);
                m1381h(c0005f2, rectM1376g2, measuredWidth, measuredHeight);
                view.layout(rectM1376g2.left, rectM1376g2.top, rectM1376g2.right, rectM1376g2.bottom);
                return;
            } finally {
                rectM1376g.setEmpty();
                c0183d.mo584c(rectM1376g);
                rectM1376g2.setEmpty();
                c0183d.mo584c(rectM1376g2);
            }
        }
        int i2 = c0005f.f8e;
        if (i2 < 0) {
            C0005f c0005f3 = (C0005f) view.getLayoutParams();
            rectM1376g = m1376g();
            rectM1376g.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0005f3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0005f3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0005f3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0005f3).bottomMargin);
            if (this.f1583s != null) {
                WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectM1376g.left = this.f1583s.m802b() + rectM1376g.left;
                    rectM1376g.top = this.f1583s.m804d() + rectM1376g.top;
                    rectM1376g.right -= this.f1583s.m803c();
                    rectM1376g.bottom -= this.f1583s.m801a();
                }
            }
            rectM1376g2 = m1376g();
            int i3 = c0005f3.f6c;
            if ((i3 & 7) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            Gravity.apply(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), rectM1376g, rectM1376g2, i);
            view.layout(rectM1376g2.left, rectM1376g2.top, rectM1376g2.right, rectM1376g2.bottom);
            return;
        }
        C0005f c0005f4 = (C0005f) view.getLayoutParams();
        int i4 = c0005f4.f6c;
        if (i4 == 0) {
            i4 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = absoluteGravity & 7;
        int i6 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i2 = width - i2;
        }
        int iM1385m = m1385m(i2) - measuredWidth2;
        if (i5 == 1) {
            iM1385m += measuredWidth2 / 2;
        } else if (i5 == 5) {
            iM1385m += measuredWidth2;
        }
        int i7 = i6 != 16 ? i6 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0005f4).leftMargin, Math.min(iM1385m, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c0005f4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0005f4).topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c0005f4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    /* renamed from: r */
    public final boolean m1389r(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f1572h;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        C0009j c0009j = f1566B;
        if (c0009j != null) {
            Collections.sort(arrayList, c0009j);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zMo66f = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            AbstractC0002c abstractC0002c = ((C0005f) view.getLayoutParams()).f4a;
            if (zMo66f && actionMasked != 0) {
                if (abstractC0002c != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        abstractC0002c.mo66f(this, view, motionEventObtain);
                    } else if (i == 1) {
                        abstractC0002c.mo77q(view, motionEventObtain);
                    }
                }
            } else if (!zMo66f && abstractC0002c != null) {
                if (i == 0) {
                    zMo66f = abstractC0002c.mo66f(this, view, motionEvent);
                } else if (i == 1) {
                    zMo66f = abstractC0002c.mo77q(view, motionEvent);
                }
                if (zMo66f) {
                    this.f1579o = view;
                }
            }
        }
        arrayList.clear();
        return zMo66f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        AbstractC0002c abstractC0002c = ((C0005f) view.getLayoutParams()).f4a;
        if (abstractC0002c != null) {
            abstractC0002c.mo72l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.f1576l) {
            return;
        }
        m1391t(false);
        this.f1576l = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0104  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1390s() {
        C0182c c0182c;
        View viewFindViewById;
        ArrayList arrayList = this.f1570f;
        arrayList.clear();
        C0010k c0010k = this.f1571g;
        C1256k c1256k = (C1256k) c0010k.f24g;
        int i = c1256k.f5012c;
        int i2 = 0;
        while (true) {
            c0182c = (C0182c) c0010k.f23f;
            if (i2 >= i) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) c1256k.m2975j(i2);
            if (arrayList2 != null) {
                arrayList2.clear();
                c0182c.mo584c(arrayList2);
            }
            i2++;
        }
        c1256k.clear();
        int childCount = getChildCount();
        int i3 = 0;
        loop1: while (true) {
            C1256k c1256k2 = (C1256k) c0010k.f24g;
            if (i3 >= childCount) {
                ArrayList arrayList3 = (ArrayList) c0010k.f25h;
                arrayList3.clear();
                HashSet hashSet = (HashSet) c0010k.f26i;
                hashSet.clear();
                int i4 = c1256k2.f5012c;
                for (int i5 = 0; i5 < i4; i5++) {
                    c0010k.m81c(c1256k2.m2973h(i5), arrayList3, hashSet);
                }
                arrayList.addAll(arrayList3);
                Collections.reverse(arrayList);
                return;
            }
            View childAt = getChildAt(i3);
            C0005f c0005fM1378n = m1378n(childAt);
            int i6 = c0005fM1378n.f9f;
            if (i6 == -1) {
                c0005fM1378n.f15l = null;
                c0005fM1378n.f14k = null;
            } else {
                View view = c0005fM1378n.f14k;
                if (view == null || view.getId() != i6) {
                    viewFindViewById = findViewById(i6);
                    c0005fM1378n.f14k = viewFindViewById;
                    if (viewFindViewById != null) {
                        if (!isInEditMode()) {
                            throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i6) + " to anchor view " + childAt);
                        }
                        c0005fM1378n.f15l = null;
                        c0005fM1378n.f14k = null;
                    } else if (viewFindViewById != this) {
                        for (ViewParent parent = viewFindViewById.getParent(); parent != this && parent != null; parent = parent.getParent()) {
                            if (parent != childAt) {
                                if (parent instanceof View) {
                                    viewFindViewById = parent;
                                }
                            } else {
                                if (!isInEditMode()) {
                                    throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                                }
                                c0005fM1378n.f15l = null;
                                c0005fM1378n.f14k = null;
                            }
                        }
                        c0005fM1378n.f15l = viewFindViewById;
                    } else {
                        if (!isInEditMode()) {
                            throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                        }
                        c0005fM1378n.f15l = null;
                        c0005fM1378n.f14k = null;
                    }
                } else {
                    View view2 = c0005fM1378n.f14k;
                    for (ViewParent parent2 = view2.getParent(); parent2 != this; parent2 = parent2.getParent()) {
                        if (parent2 == null || parent2 == childAt) {
                            c0005fM1378n.f15l = null;
                            c0005fM1378n.f14k = null;
                            viewFindViewById = findViewById(i6);
                            c0005fM1378n.f14k = viewFindViewById;
                            if (viewFindViewById != null) {
                            }
                        } else {
                            if (parent2 instanceof View) {
                                view2 = parent2;
                            }
                        }
                    }
                    c0005fM1378n.f15l = view2;
                }
            }
            if (!c1256k2.containsKey(childAt)) {
                c1256k2.put(childAt, null);
            }
            for (int i7 = 0; i7 < childCount; i7++) {
                if (i7 != i3) {
                    View childAt2 = getChildAt(i7);
                    if (childAt2 != c0005fM1378n.f15l) {
                        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((C0005f) childAt2.getLayoutParams()).f10g, layoutDirection);
                        if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(c0005fM1378n.f11h, layoutDirection) & absoluteGravity) != absoluteGravity) {
                            AbstractC0002c abstractC0002c = c0005fM1378n.f4a;
                            if (abstractC0002c != null) {
                                abstractC0002c.mo62b(childAt);
                            }
                        } else {
                            if (!c1256k2.containsKey(childAt2) && !c1256k2.containsKey(childAt2)) {
                                c1256k2.put(childAt2, null);
                            }
                            if (!c1256k2.containsKey(childAt2) || !c1256k2.containsKey(childAt)) {
                                break loop1;
                            }
                            ArrayList arrayList4 = (ArrayList) c1256k2.getOrDefault(childAt2, null);
                            if (arrayList4 == null) {
                                arrayList4 = (ArrayList) c0182c.mo582a();
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                }
                                c1256k2.put(childAt2, arrayList4);
                            }
                            arrayList4.add(childAt);
                        }
                    }
                }
            }
            i3++;
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        m1392w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1586v = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Drawable drawable2 = this.f1585u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f1585u = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f1585u.setState(getDrawableState());
                }
                Drawable drawable3 = this.f1585u;
                WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                AbstractC1230a.m2915y0(drawable3, getLayoutDirection());
                this.f1585u.setVisible(getVisibility() == 0, false);
                this.f1585u.setCallback(this);
            }
            WeakHashMap weakHashMap2 = AbstractC0206Q.f560a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setStatusBarBackground(i != 0 ? AbstractC0040a.m215b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z2 = i == 0;
        Drawable drawable = this.f1585u;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.f1585u.setVisible(z2, false);
    }

    /* renamed from: t */
    public final void m1391t(boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC0002c abstractC0002c = ((C0005f) childAt.getLayoutParams()).f4a;
            if (abstractC0002c != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    abstractC0002c.mo66f(this, childAt, motionEventObtain);
                } else {
                    abstractC0002c.mo77q(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0005f) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.f1579o = null;
        this.f1576l = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1585u;
    }

    /* renamed from: w */
    public final void m1392w() {
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        if (!getFitsSystemWindows()) {
            AbstractC0195F.m615u(this, null);
            return;
        }
        if (this.f1587w == null) {
            this.f1587w = new C0001b(0, this);
        }
        AbstractC0195F.m615u(this, this.f1587w);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0005f ? new C0005f((C0005f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0005f((ViewGroup.MarginLayoutParams) layoutParams) : new C0005f(layoutParams);
    }
}
