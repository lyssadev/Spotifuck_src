package p087o;

import android.database.DataSetObserver;

/* renamed from: o.E0 */
/* loaded from: classes.dex */
public final class C1094E0 extends DataSetObserver {

    /* renamed from: a */
    public final /* synthetic */ C1100H0 f4460a;

    public C1094E0(C1100H0 c1100h0) {
        this.f4460a = c1100h0;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C1100H0 c1100h0 = this.f4460a;
        if (c1100h0.f4477E.isShowing()) {
            c1100h0.mo2546i();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f4460a.dismiss();
    }
}
