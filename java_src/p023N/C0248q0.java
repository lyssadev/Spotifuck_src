package p023N;

import android.view.WindowInsets;
import p009F.C0084c;

/* renamed from: N.q0 */
/* loaded from: classes.dex */
public class C0248q0 extends AbstractC0246p0 {

    /* renamed from: m */
    public C0084c f647m;

    public C0248q0(C0260w0 c0260w0, WindowInsets windowInsets) {
        super(c0260w0, windowInsets);
        this.f647m = null;
    }

    @Override // p023N.C0256u0
    /* renamed from: b */
    public C0260w0 mo783b() {
        return C0260w0.m800g(null, this.f640c.consumeStableInsets());
    }

    @Override // p023N.C0256u0
    /* renamed from: c */
    public C0260w0 mo784c() {
        return C0260w0.m800g(null, this.f640c.consumeSystemWindowInsets());
    }

    @Override // p023N.C0256u0
    /* renamed from: h */
    public final C0084c mo785h() {
        if (this.f647m == null) {
            WindowInsets windowInsets = this.f640c;
            this.f647m = C0084c.m329b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f647m;
    }

    @Override // p023N.C0256u0
    /* renamed from: m */
    public boolean mo786m() {
        return this.f640c.isConsumed();
    }

    @Override // p023N.C0256u0
    /* renamed from: q */
    public void mo787q(C0084c c0084c) {
        this.f647m = c0084c;
    }
}
