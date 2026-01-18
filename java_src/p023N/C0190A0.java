package p023N;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import p018K0.C0146e;
import p091p0.AbstractC1230a;

/* renamed from: N.A0 */
/* loaded from: classes.dex */
public final class C0190A0 extends AbstractC1230a {

    /* renamed from: o */
    public final WindowInsetsController f545o;

    /* renamed from: p */
    public Window f546p;

    public C0190A0(WindowInsetsController windowInsetsController, C0146e c0146e) {
        this.f545o = windowInsetsController;
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: t0 */
    public final void mo588t0(boolean z2) {
        Window window = this.f546p;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f545o.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f545o.setSystemBarsAppearance(0, 16);
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: u0 */
    public final void mo589u0(boolean z2) {
        Window window = this.f546p;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f545o.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f545o.setSystemBarsAppearance(0, 8);
    }
}
