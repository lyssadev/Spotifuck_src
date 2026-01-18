package p008E0;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import p091p0.AbstractC1230a;
import p114z0.C1370e;

/* renamed from: E0.i */
/* loaded from: classes.dex */
public final class C0075i extends AbstractC1230a {

    /* renamed from: o */
    public final /* synthetic */ int f233o;

    /* renamed from: p */
    public final /* synthetic */ Object f234p;

    public /* synthetic */ C0075i(int i, Object obj) {
        this.f233o = i;
        this.f234p = obj;
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: k0 */
    public final void mo313k0(int i) {
        switch (this.f233o) {
            case 0:
                C0077k c0077k = (C0077k) this.f234p;
                c0077k.f238d = true;
                InterfaceC0076j interfaceC0076j = (InterfaceC0076j) c0077k.f239e.get();
                if (interfaceC0076j != null) {
                    C1370e c1370e = (C1370e) interfaceC0076j;
                    c1370e.m3311u();
                    c1370e.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: l0 */
    public final void mo314l0(Typeface typeface, boolean z2) {
        switch (this.f233o) {
            case 0:
                if (!z2) {
                    C0077k c0077k = (C0077k) this.f234p;
                    c0077k.f238d = true;
                    InterfaceC0076j interfaceC0076j = (InterfaceC0076j) c0077k.f239e.get();
                    if (interfaceC0076j != null) {
                        C1370e c1370e = (C1370e) interfaceC0076j;
                        c1370e.m3311u();
                        c1370e.invalidateSelf();
                        break;
                    }
                }
                break;
            default:
                Chip chip = (Chip) this.f234p;
                C1370e c1370e2 = chip.f2385j;
                chip.setText(c1370e2.f5721H0 ? c1370e2.f5724J : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
        }
    }

    /* renamed from: L0 */
    private final void m312L0(int i) {
    }
}
