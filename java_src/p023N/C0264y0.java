package p023N;

import android.view.View;
import android.view.Window;

/* renamed from: N.y0 */
/* loaded from: classes.dex */
public class C0264y0 extends C0262x0 {
    @Override // p091p0.AbstractC1230a
    /* renamed from: u0 */
    public final void mo589u0(boolean z2) {
        if (!z2) {
            m806L0(8192);
            return;
        }
        Window window = this.f660o;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }
}
