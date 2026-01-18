package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import it.deviato.spotifuck.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import p023N.AbstractC0193D;
import p023N.AbstractC0206Q;
import p023N.C0260w0;
import p030Q0.AbstractC0328E;
import p044Y.AbstractC0437a;
import p047Z0.AbstractC0469c;
import p068h.AbstractActivityC0841l;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: f */
    public final ArrayList f1705f;

    /* renamed from: g */
    public final ArrayList f1706g;

    /* renamed from: h */
    public View.OnApplyWindowInsetsListener f1707h;

    /* renamed from: i */
    public boolean f1708i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        AbstractC0469c.m1102e("context", context);
        this.f1705f = new ArrayList();
        this.f1706g = new ArrayList();
        this.f1708i = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0437a.f1099b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* renamed from: a */
    public final void m1463a(View view) {
        if (this.f1706g.contains(view)) {
            this.f1705f.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        AbstractC0469c.m1102e("child", view);
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0606r ? (AbstractComponentCallbacksC0606r) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C0260w0 c0260w0M800g;
        AbstractC0469c.m1102e("insets", windowInsets);
        C0260w0 c0260w0M800g2 = C0260w0.m800g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1707h;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            AbstractC0469c.m1101d("onApplyWindowInsetsListe…lyWindowInsets(v, insets)", windowInsetsOnApplyWindowInsets);
            c0260w0M800g = C0260w0.m800g(null, windowInsetsOnApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            WindowInsets windowInsetsM805f = c0260w0M800g2.m805f();
            if (windowInsetsM805f != null) {
                WindowInsets windowInsetsM593b = AbstractC0193D.m593b(this, windowInsetsM805f);
                if (!windowInsetsM593b.equals(windowInsetsM805f)) {
                    c0260w0M800g2 = C0260w0.m800g(this, windowInsetsM593b);
                }
            }
            c0260w0M800g = c0260w0M800g2;
        }
        if (!c0260w0M800g.f658a.mo786m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                WeakHashMap weakHashMap2 = AbstractC0206Q.f560a;
                WindowInsets windowInsetsM805f2 = c0260w0M800g.m805f();
                if (windowInsetsM805f2 != null) {
                    WindowInsets windowInsetsM592a = AbstractC0193D.m592a(childAt, windowInsetsM805f2);
                    if (!windowInsetsM592a.equals(windowInsetsM805f2)) {
                        C0260w0.m800g(childAt, windowInsetsM592a);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AbstractC0469c.m1102e("canvas", canvas);
        if (this.f1708i) {
            Iterator it2 = this.f1705f.iterator();
            while (it2.hasNext()) {
                super.drawChild(canvas, (View) it2.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        AbstractC0469c.m1102e("canvas", canvas);
        AbstractC0469c.m1102e("child", view);
        if (this.f1708i) {
            ArrayList arrayList = this.f1705f;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        AbstractC0469c.m1102e("view", view);
        this.f1706g.remove(view);
        if (this.f1705f.remove(view)) {
            this.f1708i = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0606r> F getFragment() {
        AbstractActivityC0841l abstractActivityC0841l;
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r;
        C0577H c0577hM1587g;
        View view = this;
        while (true) {
            abstractActivityC0841l = null;
            if (view == null) {
                abstractComponentCallbacksC0606r = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            abstractComponentCallbacksC0606r = tag instanceof AbstractComponentCallbacksC0606r ? (AbstractComponentCallbacksC0606r) tag : null;
            if (abstractComponentCallbacksC0606r != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0606r == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof AbstractActivityC0841l) {
                    abstractActivityC0841l = (AbstractActivityC0841l) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (abstractActivityC0841l == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            c0577hM1587g = ((C0608t) abstractActivityC0841l.f3288x.f2g).f1944i;
        } else {
            if (!abstractComponentCallbacksC0606r.m1595o()) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0606r + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            c0577hM1587g = abstractComponentCallbacksC0606r.m1587g();
        }
        return (F) c0577hM1587g.m1515z(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        AbstractC0469c.m1102e("insets", windowInsets);
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                AbstractC0469c.m1101d("view", childAt);
                m1463a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        AbstractC0469c.m1102e("view", view);
        m1463a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        AbstractC0469c.m1101d("view", childAt);
        m1463a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        AbstractC0469c.m1102e("view", view);
        m1463a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            AbstractC0469c.m1101d("view", childAt);
            m1463a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            AbstractC0469c.m1101d("view", childAt);
            m1463a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z2) {
        this.f1708i = z2;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        AbstractC0469c.m1102e("listener", onApplyWindowInsetsListener);
        this.f1707h = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        AbstractC0469c.m1102e("view", view);
        if (view.getParent() == this) {
            this.f1706g.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, C0577H c0577h) {
        View view;
        super(context, attributeSet);
        AbstractC0469c.m1102e("context", context);
        AbstractC0469c.m1102e("attrs", attributeSet);
        AbstractC0469c.m1102e("fm", c0577h);
        this.f1705f = new ArrayList();
        this.f1706g = new ArrayList();
        this.f1708i = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0437a.f1099b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606rM1515z = c0577h.m1515z(id);
        if (classAttribute != null && abstractComponentCallbacksC0606rM1515z == null) {
            if (id == -1) {
                throw new IllegalStateException(AbstractC0328E.m937g("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            C0571B c0571bM1469C = c0577h.m1469C();
            context.getClassLoader();
            AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606rM1460a = c0571bM1469C.m1460a(classAttribute);
            AbstractC0469c.m1101d("fm.fragmentFactory.insta…ontext.classLoader, name)", abstractComponentCallbacksC0606rM1460a);
            abstractComponentCallbacksC0606rM1460a.f1901H = true;
            C0608t c0608t = abstractComponentCallbacksC0606rM1460a.f1936x;
            if ((c0608t == null ? null : c0608t.f1941f) != null) {
                abstractComponentCallbacksC0606rM1460a.f1901H = true;
            }
            C0589a c0589a = new C0589a(c0577h);
            c0589a.f1823p = true;
            abstractComponentCallbacksC0606rM1460a.f1902I = this;
            c0589a.m1546e(getId(), abstractComponentCallbacksC0606rM1460a, string, 1);
            if (!c0589a.f1814g) {
                c0589a.f1815h = false;
                C0577H c0577h2 = c0589a.f1824q;
                if (c0577h2.f1743t != null && !c0577h2.f1717G) {
                    c0577h2.m1512w(true);
                    c0589a.mo1462a(c0577h2.f1719I, c0577h2.f1720J);
                    c0577h2.f1725b = true;
                    try {
                        c0577h2.m1479P(c0577h2.f1719I, c0577h2.f1720J);
                        c0577h2.m1493d();
                        c0577h2.m1489Z();
                        if (c0577h2.f1718H) {
                            c0577h2.f1718H = false;
                            c0577h2.m1487X();
                        }
                        ((HashMap) c0577h2.f1726c.f23f).values().removeAll(Collections.singleton(null));
                    } catch (Throwable th) {
                        c0577h2.m1493d();
                        throw th;
                    }
                }
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it2 = c0577h.f1726c.m85g().iterator();
        while (it2.hasNext()) {
            C0582M c0582m = (C0582M) it2.next();
            AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = c0582m.f1780c;
            if (abstractComponentCallbacksC0606r.f1895B == getId() && (view = abstractComponentCallbacksC0606r.f1903J) != null && view.getParent() == null) {
                abstractComponentCallbacksC0606r.f1902I = this;
                c0582m.m1520b();
            }
        }
    }
}
