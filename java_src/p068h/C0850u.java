package p068h;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import it.deviato.spotifuck.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p009F.C0084c;
import p023N.AbstractC0193D;
import p023N.AbstractC0206Q;
import p023N.AbstractC0244o0;
import p023N.C0238l0;
import p023N.C0240m0;
import p023N.C0242n0;
import p023N.C0260w0;
import p023N.InterfaceC0249r;
import p084n.InterfaceC1046w;
import p084n.MenuC1035l;
import p087o.AbstractC1174m1;
import p087o.AbstractC1177n1;
import p087o.InterfaceC1167k0;
import p091p0.AbstractC1230a;

/* renamed from: h.u */
/* loaded from: classes.dex */
public final class C0850u implements InterfaceC0249r, InterfaceC1167k0, InterfaceC1046w {

    /* renamed from: f */
    public final /* synthetic */ int f3308f;

    /* renamed from: g */
    public final /* synthetic */ LayoutInflaterFactory2C0819D f3309g;

    public /* synthetic */ C0850u(LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D, int i) {
        this.f3308f = i;
        this.f3309g = layoutInflaterFactory2C0819D;
    }

    @Override // p084n.InterfaceC1046w
    /* renamed from: b */
    public void mo497b(MenuC1035l menuC1035l, boolean z2) {
        C0818C c0818c;
        switch (this.f3308f) {
            case 2:
                this.f3309g.m2079p(menuC1035l);
                break;
            default:
                MenuC1035l menuC1035lMo2564k = menuC1035l.mo2564k();
                int i = 0;
                boolean z3 = menuC1035lMo2564k != menuC1035l;
                if (z3) {
                    menuC1035l = menuC1035lMo2564k;
                }
                LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D = this.f3309g;
                C0818C[] c0818cArr = layoutInflaterFactory2C0819D.f3126R;
                int length = c0818cArr != null ? c0818cArr.length : 0;
                while (true) {
                    if (i >= length) {
                        c0818c = null;
                    } else {
                        c0818c = c0818cArr[i];
                        if (c0818c == null || c0818c.f3097h != menuC1035l) {
                            i++;
                        }
                    }
                }
                if (c0818c != null) {
                    if (!z3) {
                        layoutInflaterFactory2C0819D.m2080q(c0818c, z2);
                        break;
                    } else {
                        layoutInflaterFactory2C0819D.m2078o(c0818c.f3090a, c0818c, menuC1035lMo2564k);
                        layoutInflaterFactory2C0819D.m2080q(c0818c, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // p084n.InterfaceC1046w
    /* renamed from: h */
    public boolean mo500h(MenuC1035l menuC1035l) {
        Window.Callback callback;
        switch (this.f3308f) {
            case 2:
                Window.Callback callback2 = this.f3309g.f3150q.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC1035l);
                    break;
                }
                break;
            default:
                if (menuC1035l == menuC1035l.mo2564k()) {
                    LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D = this.f3309g;
                    if (layoutInflaterFactory2C0819D.f3120L && (callback = layoutInflaterFactory2C0819D.f3150q.getCallback()) != null && !layoutInflaterFactory2C0819D.f3131W) {
                        callback.onMenuOpened(108, menuC1035l);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // p023N.InterfaceC0249r
    /* renamed from: l */
    public C0260w0 mo47l(View view, C0260w0 c0260w0) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z2;
        boolean z3;
        boolean z4;
        C0260w0 c0260w0Mo734b = c0260w0;
        int iM804d = c0260w0.m804d();
        LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D = this.f3309g;
        layoutInflaterFactory2C0819D.getClass();
        int iM804d2 = c0260w0.m804d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C0819D.f3109A;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0819D.f3109A.getLayoutParams();
            if (layoutInflaterFactory2C0819D.f3109A.isShown()) {
                if (layoutInflaterFactory2C0819D.f3143i0 == null) {
                    layoutInflaterFactory2C0819D.f3143i0 = new Rect();
                    layoutInflaterFactory2C0819D.f3144j0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C0819D.f3143i0;
                Rect rect2 = layoutInflaterFactory2C0819D.f3144j0;
                rect.set(c0260w0.m802b(), c0260w0.m804d(), c0260w0.m803c(), c0260w0.m801a());
                ViewGroup viewGroup = layoutInflaterFactory2C0819D.f3115G;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z5 = AbstractC1177n1.f4699a;
                    AbstractC1174m1.m2801a(viewGroup, rect, rect2);
                } else {
                    if (!AbstractC1177n1.f4699a) {
                        AbstractC1177n1.f4699a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            AbstractC1177n1.f4700b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                AbstractC1177n1.f4700b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                    Method method = AbstractC1177n1.f4700b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception unused2) {
                        }
                    }
                }
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                C0260w0 c0260w0M673h = AbstractC0206Q.m673h(layoutInflaterFactory2C0819D.f3115G);
                int iM802b = c0260w0M673h == null ? 0 : c0260w0M673h.m802b();
                int iM803c = c0260w0M673h == null ? 0 : c0260w0M673h.m803c();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z4 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z4 = true;
                }
                Context context = layoutInflaterFactory2C0819D.f3149p;
                if (i <= 0 || layoutInflaterFactory2C0819D.f3117I != null) {
                    View view2 = layoutInflaterFactory2C0819D.f3117I;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != iM802b || marginLayoutParams2.rightMargin != iM803c) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = iM802b;
                            marginLayoutParams2.rightMargin = iM803c;
                            layoutInflaterFactory2C0819D.f3117I.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C0819D.f3117I = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iM802b;
                    layoutParams.rightMargin = iM803c;
                    layoutInflaterFactory2C0819D.f3115G.addView(layoutInflaterFactory2C0819D.f3117I, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C0819D.f3117I;
                boolean z6 = view4 != null;
                if (z6 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C0819D.f3117I;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? AbstractC1230a.m2865F(context, R.color.abc_decor_view_status_guard_light) : AbstractC1230a.m2865F(context, R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C0819D.f3122N && z6) {
                    iM804d2 = 0;
                }
                z2 = z6;
                z3 = z4;
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z3 = true;
                } else {
                    z3 = false;
                }
                z2 = false;
            }
            if (z3) {
                layoutInflaterFactory2C0819D.f3109A.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C0819D.f3117I;
        if (view6 != null) {
            view6.setVisibility(z2 ? 0 : 8);
        }
        if (iM804d != iM804d2) {
            int iM802b2 = c0260w0.m802b();
            int iM803c2 = c0260w0.m803c();
            int iM801a = c0260w0.m801a();
            int i6 = Build.VERSION.SDK_INT;
            AbstractC0244o0 c0242n0 = i6 >= 30 ? new C0242n0(c0260w0Mo734b) : i6 >= 29 ? new C0240m0(c0260w0Mo734b) : new C0238l0(c0260w0Mo734b);
            c0242n0.mo736g(C0084c.m329b(iM802b2, iM804d2, iM803c2, iM801a));
            c0260w0Mo734b = c0242n0.mo734b();
        }
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        WindowInsets windowInsetsM805f = c0260w0Mo734b.m805f();
        if (windowInsetsM805f == null) {
            return c0260w0Mo734b;
        }
        WindowInsets windowInsetsM593b = AbstractC0193D.m593b(view, windowInsetsM805f);
        return !windowInsetsM593b.equals(windowInsetsM805f) ? C0260w0.m800g(view, windowInsetsM593b) : c0260w0Mo734b;
    }
}
