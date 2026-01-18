package p023N;

import android.view.View;
import android.view.Window;
import p018K0.C0146e;
import p091p0.AbstractC1230a;

/* renamed from: N.x0 */
/* loaded from: classes.dex */
public class C0262x0 extends AbstractC1230a {

    /* renamed from: o */
    public final Window f660o;

    public C0262x0(Window window, C0146e c0146e) {
        this.f660o = window;
    }

    /* renamed from: L0 */
    public final void m806L0(int i) {
        View decorView = this.f660o.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
