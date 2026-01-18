package p023N;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import p009F.C0084c;

/* renamed from: N.w0 */
/* loaded from: classes.dex */
public final class C0260w0 {

    /* renamed from: b */
    public static final C0260w0 f657b;

    /* renamed from: a */
    public final C0256u0 f658a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f657b = C0254t0.f651q;
        } else {
            f657b = C0256u0.f655b;
        }
    }

    public C0260w0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f658a = new C0254t0(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f658a = new C0252s0(this, windowInsets);
        } else if (i >= 28) {
            this.f658a = new C0250r0(this, windowInsets);
        } else {
            this.f658a = new C0248q0(this, windowInsets);
        }
    }

    /* renamed from: e */
    public static C0084c m799e(C0084c c0084c, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, c0084c.f249a - i);
        int iMax2 = Math.max(0, c0084c.f250b - i2);
        int iMax3 = Math.max(0, c0084c.f251c - i3);
        int iMax4 = Math.max(0, c0084c.f252d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? c0084c : C0084c.m329b(iMax, iMax2, iMax3, iMax4);
    }

    /* renamed from: g */
    public static C0260w0 m800g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C0260w0 c0260w0 = new C0260w0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            C0260w0 c0260w0M673h = AbstractC0206Q.m673h(view);
            C0256u0 c0256u0 = c0260w0.f658a;
            c0256u0.mo779p(c0260w0M673h);
            c0256u0.mo773d(view.getRootView());
        }
        return c0260w0;
    }

    /* renamed from: a */
    public final int m801a() {
        return this.f658a.mo775j().f252d;
    }

    /* renamed from: b */
    public final int m802b() {
        return this.f658a.mo775j().f249a;
    }

    /* renamed from: c */
    public final int m803c() {
        return this.f658a.mo775j().f251c;
    }

    /* renamed from: d */
    public final int m804d() {
        return this.f658a.mo775j().f250b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0260w0)) {
            return false;
        }
        return Objects.equals(this.f658a, ((C0260w0) obj).f658a);
    }

    /* renamed from: f */
    public final WindowInsets m805f() {
        C0256u0 c0256u0 = this.f658a;
        if (c0256u0 instanceof AbstractC0246p0) {
            return ((AbstractC0246p0) c0256u0).f640c;
        }
        return null;
    }

    public final int hashCode() {
        C0256u0 c0256u0 = this.f658a;
        if (c0256u0 == null) {
            return 0;
        }
        return c0256u0.hashCode();
    }

    public C0260w0() {
        this.f658a = new C0256u0(this);
    }
}
