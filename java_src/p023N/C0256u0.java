package p023N;

import android.os.Build;
import android.view.View;
import java.util.Objects;
import p009F.C0084c;

/* renamed from: N.u0 */
/* loaded from: classes.dex */
public class C0256u0 {

    /* renamed from: b */
    public static final C0260w0 f655b;

    /* renamed from: a */
    public final C0260w0 f656a;

    static {
        int i = Build.VERSION.SDK_INT;
        f655b = (i >= 30 ? new C0242n0() : i >= 29 ? new C0240m0() : new C0238l0()).mo734b().f658a.mo788a().f658a.mo783b().f658a.mo784c();
    }

    public C0256u0(C0260w0 c0260w0) {
        this.f656a = c0260w0;
    }

    /* renamed from: a */
    public C0260w0 mo788a() {
        return this.f656a;
    }

    /* renamed from: b */
    public C0260w0 mo783b() {
        return this.f656a;
    }

    /* renamed from: c */
    public C0260w0 mo784c() {
        return this.f656a;
    }

    /* renamed from: e */
    public C0233j mo789e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0256u0)) {
            return false;
        }
        C0256u0 c0256u0 = (C0256u0) obj;
        return mo777n() == c0256u0.mo777n() && mo786m() == c0256u0.mo786m() && Objects.equals(mo775j(), c0256u0.mo775j()) && Objects.equals(mo785h(), c0256u0.mo785h()) && Objects.equals(mo789e(), c0256u0.mo789e());
    }

    /* renamed from: f */
    public C0084c mo774f(int i) {
        return C0084c.f248e;
    }

    /* renamed from: g */
    public C0084c mo790g() {
        return mo775j();
    }

    /* renamed from: h */
    public C0084c mo785h() {
        return C0084c.f248e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo777n()), Boolean.valueOf(mo786m()), mo775j(), mo785h(), mo789e());
    }

    /* renamed from: i */
    public C0084c mo791i() {
        return mo775j();
    }

    /* renamed from: j */
    public C0084c mo775j() {
        return C0084c.f248e;
    }

    /* renamed from: k */
    public C0084c mo792k() {
        return mo775j();
    }

    /* renamed from: l */
    public C0260w0 mo776l(int i, int i2, int i3, int i4) {
        return f655b;
    }

    /* renamed from: m */
    public boolean mo786m() {
        return false;
    }

    /* renamed from: n */
    public boolean mo777n() {
        return false;
    }

    /* renamed from: d */
    public void mo773d(View view) {
    }

    /* renamed from: o */
    public void mo778o(C0084c[] c0084cArr) {
    }

    /* renamed from: p */
    public void mo779p(C0260w0 c0260w0) {
    }

    /* renamed from: q */
    public void mo787q(C0084c c0084c) {
    }
}
