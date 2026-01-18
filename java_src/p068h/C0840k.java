package p068h;

import android.view.LayoutInflater;
import androidx.activity.AbstractActivityC0532n;
import p054c.InterfaceC0672b;

/* renamed from: h.k */
/* loaded from: classes.dex */
public final class C0840k implements InterfaceC0672b {

    /* renamed from: a */
    public final /* synthetic */ AbstractActivityC0841l f3284a;

    public C0840k(AbstractActivityC0841l abstractActivityC0841l) {
        this.f3284a = abstractActivityC0841l;
    }

    @Override // p054c.InterfaceC0672b
    /* renamed from: a */
    public final void mo1289a(AbstractActivityC0532n abstractActivityC0532n) {
        AbstractActivityC0841l abstractActivityC0841l = this.f3284a;
        AbstractC0848s abstractC0848sM2120k = abstractActivityC0841l.m2120k();
        LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D = (LayoutInflaterFactory2C0819D) abstractC0848sM2120k;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(layoutInflaterFactory2C0819D.f3149p);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(layoutInflaterFactory2C0819D);
        } else {
            boolean z2 = layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C0819D;
        }
        abstractActivityC0841l.f1293i.f3919b.m2441c("androidx:appcompat");
        abstractC0848sM2120k.mo2067b();
    }
}
