package p023N;

import android.view.WindowInsets;
import p000A.AbstractC0000a;
import p009F.C0084c;

/* renamed from: N.m0 */
/* loaded from: classes.dex */
public class C0240m0 extends AbstractC0244o0 {

    /* renamed from: c */
    public final WindowInsets.Builder f627c;

    public C0240m0() {
        this.f627c = AbstractC0000a.m10g();
    }

    @Override // p023N.AbstractC0244o0
    /* renamed from: b */
    public C0260w0 mo734b() {
        m767a();
        C0260w0 c0260w0M800g = C0260w0.m800g(null, this.f627c.build());
        c0260w0M800g.f658a.mo778o(this.f634b);
        return c0260w0M800g;
    }

    @Override // p023N.AbstractC0244o0
    /* renamed from: d */
    public void mo750d(C0084c c0084c) {
        this.f627c.setMandatorySystemGestureInsets(c0084c.m331d());
    }

    @Override // p023N.AbstractC0244o0
    /* renamed from: e */
    public void mo735e(C0084c c0084c) {
        this.f627c.setStableInsets(c0084c.m331d());
    }

    @Override // p023N.AbstractC0244o0
    /* renamed from: f */
    public void mo751f(C0084c c0084c) {
        this.f627c.setSystemGestureInsets(c0084c.m331d());
    }

    @Override // p023N.AbstractC0244o0
    /* renamed from: g */
    public void mo736g(C0084c c0084c) {
        this.f627c.setSystemWindowInsets(c0084c.m331d());
    }

    @Override // p023N.AbstractC0244o0
    /* renamed from: h */
    public void mo752h(C0084c c0084c) {
        this.f627c.setTappableElementInsets(c0084c.m331d());
    }

    public C0240m0(C0260w0 c0260w0) {
        WindowInsets.Builder builderM10g;
        super(c0260w0);
        WindowInsets windowInsetsM805f = c0260w0.m805f();
        if (windowInsetsM805f != null) {
            builderM10g = AbstractC0000a.m11h(windowInsetsM805f);
        } else {
            builderM10g = AbstractC0000a.m10g();
        }
        this.f627c = builderM10g;
    }
}
