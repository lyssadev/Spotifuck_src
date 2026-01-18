package p023N;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: N.r0 */
/* loaded from: classes.dex */
public class C0250r0 extends C0248q0 {
    public C0250r0(C0260w0 c0260w0, WindowInsets windowInsets) {
        super(c0260w0, windowInsets);
    }

    @Override // p023N.C0256u0
    /* renamed from: a */
    public C0260w0 mo788a() {
        return C0260w0.m800g(null, this.f640c.consumeDisplayCutout());
    }

    @Override // p023N.C0256u0
    /* renamed from: e */
    public C0233j mo789e() {
        DisplayCutout displayCutout = this.f640c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0233j(displayCutout);
    }

    @Override // p023N.AbstractC0246p0, p023N.C0256u0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0250r0)) {
            return false;
        }
        C0250r0 c0250r0 = (C0250r0) obj;
        return Objects.equals(this.f640c, c0250r0.f640c) && Objects.equals(this.f644g, c0250r0.f644g);
    }

    @Override // p023N.C0256u0
    public int hashCode() {
        return this.f640c.hashCode();
    }
}
