package p023N;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import p009F.C0084c;

/* renamed from: N.l0 */
/* loaded from: classes.dex */
public final class C0238l0 extends AbstractC0244o0 {

    /* renamed from: e */
    public static Field f621e = null;

    /* renamed from: f */
    public static boolean f622f = false;

    /* renamed from: g */
    public static Constructor f623g = null;

    /* renamed from: h */
    public static boolean f624h = false;

    /* renamed from: c */
    public WindowInsets f625c;

    /* renamed from: d */
    public C0084c f626d;

    public C0238l0() {
        this.f625c = m733i();
    }

    /* renamed from: i */
    private static WindowInsets m733i() {
        if (!f622f) {
            try {
                f621e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            f622f = true;
        }
        Field field = f621e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!f624h) {
            try {
                f623g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            f624h = true;
        }
        Constructor constructor = f623g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // p023N.AbstractC0244o0
    /* renamed from: b */
    public C0260w0 mo734b() {
        m767a();
        C0260w0 c0260w0M800g = C0260w0.m800g(null, this.f625c);
        C0084c[] c0084cArr = this.f634b;
        C0256u0 c0256u0 = c0260w0M800g.f658a;
        c0256u0.mo778o(c0084cArr);
        c0256u0.mo787q(this.f626d);
        return c0260w0M800g;
    }

    @Override // p023N.AbstractC0244o0
    /* renamed from: e */
    public void mo735e(C0084c c0084c) {
        this.f626d = c0084c;
    }

    @Override // p023N.AbstractC0244o0
    /* renamed from: g */
    public void mo736g(C0084c c0084c) {
        WindowInsets windowInsets = this.f625c;
        if (windowInsets != null) {
            this.f625c = windowInsets.replaceSystemWindowInsets(c0084c.f249a, c0084c.f250b, c0084c.f251c, c0084c.f252d);
        }
    }

    public C0238l0(C0260w0 c0260w0) {
        super(c0260w0);
        this.f625c = c0260w0.m805f();
    }
}
