package p013H0;

import android.graphics.Typeface;
import p000A.C0001b;
import p008E0.C0069c;
import p091p0.AbstractC1230a;

/* renamed from: H0.a */
/* loaded from: classes.dex */
public final class C0106a extends AbstractC1230a {

    /* renamed from: o */
    public final Typeface f289o;

    /* renamed from: p */
    public final C0001b f290p;

    /* renamed from: q */
    public boolean f291q;

    public C0106a(C0001b c0001b, Typeface typeface) {
        this.f289o = typeface;
        this.f290p = c0001b;
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: k0 */
    public final void mo313k0(int i) {
        if (this.f291q) {
            return;
        }
        C0069c c0069c = (C0069c) this.f290p.f2g;
        if (c0069c.m306j(this.f289o)) {
            c0069c.m304h(false);
        }
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: l0 */
    public final void mo314l0(Typeface typeface, boolean z2) {
        if (this.f291q) {
            return;
        }
        C0069c c0069c = (C0069c) this.f290p.f2g;
        if (c0069c.m306j(typeface)) {
            c0069c.m304h(false);
        }
    }
}
