package p023N;

import android.view.WindowInsets;
import p009F.C0084c;

/* renamed from: N.s0 */
/* loaded from: classes.dex */
public class C0252s0 extends C0250r0 {

    /* renamed from: n */
    public C0084c f648n;

    /* renamed from: o */
    public C0084c f649o;

    /* renamed from: p */
    public C0084c f650p;

    public C0252s0(C0260w0 c0260w0, WindowInsets windowInsets) {
        super(c0260w0, windowInsets);
        this.f648n = null;
        this.f649o = null;
        this.f650p = null;
    }

    @Override // p023N.C0256u0
    /* renamed from: g */
    public C0084c mo790g() {
        if (this.f649o == null) {
            this.f649o = C0084c.m330c(this.f640c.getMandatorySystemGestureInsets());
        }
        return this.f649o;
    }

    @Override // p023N.C0256u0
    /* renamed from: i */
    public C0084c mo791i() {
        if (this.f648n == null) {
            this.f648n = C0084c.m330c(this.f640c.getSystemGestureInsets());
        }
        return this.f648n;
    }

    @Override // p023N.C0256u0
    /* renamed from: k */
    public C0084c mo792k() {
        if (this.f650p == null) {
            this.f650p = C0084c.m330c(this.f640c.getTappableElementInsets());
        }
        return this.f650p;
    }

    @Override // p023N.AbstractC0246p0, p023N.C0256u0
    /* renamed from: l */
    public C0260w0 mo776l(int i, int i2, int i3, int i4) {
        return C0260w0.m800g(null, this.f640c.inset(i, i2, i3, i4));
    }

    @Override // p023N.C0248q0, p023N.C0256u0
    /* renamed from: q */
    public void mo787q(C0084c c0084c) {
    }
}
