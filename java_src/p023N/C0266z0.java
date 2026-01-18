package p023N;

import android.view.View;
import android.view.Window;

/* renamed from: N.z0 */
/* loaded from: classes.dex */
public final class C0266z0 extends C0264y0 {
    @Override // p091p0.AbstractC1230a
    /* renamed from: t0 */
    public final void mo588t0(boolean z2) {
        if (!z2) {
            m806L0(16);
            return;
        }
        Window window = this.f660o;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }
}
