package p023N;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import p009F.C0084c;

/* renamed from: N.p0 */
/* loaded from: classes.dex */
public abstract class AbstractC0246p0 extends C0256u0 {

    /* renamed from: h */
    public static boolean f635h = false;

    /* renamed from: i */
    public static Method f636i;

    /* renamed from: j */
    public static Class f637j;

    /* renamed from: k */
    public static Field f638k;

    /* renamed from: l */
    public static Field f639l;

    /* renamed from: c */
    public final WindowInsets f640c;

    /* renamed from: d */
    public C0084c[] f641d;

    /* renamed from: e */
    public C0084c f642e;

    /* renamed from: f */
    public C0260w0 f643f;

    /* renamed from: g */
    public C0084c f644g;

    public AbstractC0246p0(C0260w0 c0260w0, WindowInsets windowInsets) {
        super(c0260w0);
        this.f642e = null;
        this.f640c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: r */
    private C0084c m769r(int i, boolean z2) {
        C0084c c0084cM328a = C0084c.f248e;
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                c0084cM328a = C0084c.m328a(c0084cM328a, m780s(i2, z2));
            }
        }
        return c0084cM328a;
    }

    /* renamed from: t */
    private C0084c m770t() {
        C0260w0 c0260w0 = this.f643f;
        return c0260w0 != null ? c0260w0.f658a.mo785h() : C0084c.f248e;
    }

    /* renamed from: u */
    private C0084c m771u(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f635h) {
            m772v();
        }
        Method method = f636i;
        if (method != null && f637j != null && f638k != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f638k.get(f639l.get(objInvoke));
                if (rect != null) {
                    return C0084c.m329b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: v */
    private static void m772v() throws ClassNotFoundException, SecurityException {
        try {
            f636i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f637j = cls;
            f638k = cls.getDeclaredField("mVisibleInsets");
            f639l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f638k.setAccessible(true);
            f639l.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        f635h = true;
    }

    @Override // p023N.C0256u0
    /* renamed from: d */
    public void mo773d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C0084c c0084cM771u = m771u(view);
        if (c0084cM771u == null) {
            c0084cM771u = C0084c.f248e;
        }
        m781w(c0084cM771u);
    }

    @Override // p023N.C0256u0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f644g, ((AbstractC0246p0) obj).f644g);
        }
        return false;
    }

    @Override // p023N.C0256u0
    /* renamed from: f */
    public C0084c mo774f(int i) {
        return m769r(i, false);
    }

    @Override // p023N.C0256u0
    /* renamed from: j */
    public final C0084c mo775j() {
        if (this.f642e == null) {
            WindowInsets windowInsets = this.f640c;
            this.f642e = C0084c.m329b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f642e;
    }

    @Override // p023N.C0256u0
    /* renamed from: l */
    public C0260w0 mo776l(int i, int i2, int i3, int i4) {
        C0260w0 c0260w0M800g = C0260w0.m800g(null, this.f640c);
        int i5 = Build.VERSION.SDK_INT;
        AbstractC0244o0 c0242n0 = i5 >= 30 ? new C0242n0(c0260w0M800g) : i5 >= 29 ? new C0240m0(c0260w0M800g) : new C0238l0(c0260w0M800g);
        c0242n0.mo736g(C0260w0.m799e(mo775j(), i, i2, i3, i4));
        c0242n0.mo735e(C0260w0.m799e(mo785h(), i, i2, i3, i4));
        return c0242n0.mo734b();
    }

    @Override // p023N.C0256u0
    /* renamed from: n */
    public boolean mo777n() {
        return this.f640c.isRound();
    }

    @Override // p023N.C0256u0
    /* renamed from: o */
    public void mo778o(C0084c[] c0084cArr) {
        this.f641d = c0084cArr;
    }

    @Override // p023N.C0256u0
    /* renamed from: p */
    public void mo779p(C0260w0 c0260w0) {
        this.f643f = c0260w0;
    }

    /* renamed from: s */
    public C0084c m780s(int i, boolean z2) {
        C0084c c0084cMo785h;
        int i2;
        if (i == 1) {
            return z2 ? C0084c.m329b(0, Math.max(m770t().f250b, mo775j().f250b), 0, 0) : C0084c.m329b(0, mo775j().f250b, 0, 0);
        }
        if (i == 2) {
            if (z2) {
                C0084c c0084cM770t = m770t();
                C0084c c0084cMo785h2 = mo785h();
                return C0084c.m329b(Math.max(c0084cM770t.f249a, c0084cMo785h2.f249a), 0, Math.max(c0084cM770t.f251c, c0084cMo785h2.f251c), Math.max(c0084cM770t.f252d, c0084cMo785h2.f252d));
            }
            C0084c c0084cMo775j = mo775j();
            C0260w0 c0260w0 = this.f643f;
            c0084cMo785h = c0260w0 != null ? c0260w0.f658a.mo785h() : null;
            int iMin = c0084cMo775j.f252d;
            if (c0084cMo785h != null) {
                iMin = Math.min(iMin, c0084cMo785h.f252d);
            }
            return C0084c.m329b(c0084cMo775j.f249a, 0, c0084cMo775j.f251c, iMin);
        }
        C0084c c0084c = C0084c.f248e;
        if (i == 8) {
            C0084c[] c0084cArr = this.f641d;
            c0084cMo785h = c0084cArr != null ? c0084cArr[3] : null;
            if (c0084cMo785h != null) {
                return c0084cMo785h;
            }
            C0084c c0084cMo775j2 = mo775j();
            C0084c c0084cM770t2 = m770t();
            int i3 = c0084cMo775j2.f252d;
            if (i3 > c0084cM770t2.f252d) {
                return C0084c.m329b(0, 0, 0, i3);
            }
            C0084c c0084c2 = this.f644g;
            return (c0084c2 == null || c0084c2.equals(c0084c) || (i2 = this.f644g.f252d) <= c0084cM770t2.f252d) ? c0084c : C0084c.m329b(0, 0, 0, i2);
        }
        if (i == 16) {
            return mo791i();
        }
        if (i == 32) {
            return mo790g();
        }
        if (i == 64) {
            return mo792k();
        }
        if (i != 128) {
            return c0084c;
        }
        C0260w0 c0260w02 = this.f643f;
        C0233j c0233jMo789e = c0260w02 != null ? c0260w02.f658a.mo789e() : mo789e();
        if (c0233jMo789e == null) {
            return c0084c;
        }
        int i4 = Build.VERSION.SDK_INT;
        return C0084c.m329b(i4 >= 28 ? AbstractC0231i.m730d(c0233jMo789e.f615a) : 0, i4 >= 28 ? AbstractC0231i.m732f(c0233jMo789e.f615a) : 0, i4 >= 28 ? AbstractC0231i.m731e(c0233jMo789e.f615a) : 0, i4 >= 28 ? AbstractC0231i.m729c(c0233jMo789e.f615a) : 0);
    }

    /* renamed from: w */
    public void m781w(C0084c c0084c) {
        this.f644g = c0084c;
    }
}
