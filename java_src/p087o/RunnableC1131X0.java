package p087o;

import androidx.appcompat.widget.Toolbar;
import p084n.C1037n;

/* renamed from: o.X0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1131X0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f4565a;

    /* renamed from: b */
    public final /* synthetic */ Toolbar f4566b;

    public /* synthetic */ RunnableC1131X0(Toolbar toolbar, int i) {
        this.f4565a = i;
        this.f4566b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4565a) {
            case 0:
                C1138a1 c1138a1 = this.f4566b.f1517Q;
                C1037n c1037n = c1138a1 == null ? null : c1138a1.f4585g;
                if (c1037n != null) {
                    c1037n.collapseActionView();
                    break;
                }
                break;
            default:
                this.f4566b.m1359n();
                break;
        }
    }
}
