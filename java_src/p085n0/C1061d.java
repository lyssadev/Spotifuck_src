package p085n0;

import android.view.ViewGroup;
import p036T0.AbstractC0411g;

/* renamed from: n0.d */
/* loaded from: classes.dex */
public final class C1061d extends AbstractC1071n {

    /* renamed from: a */
    public boolean f4362a = false;

    /* renamed from: b */
    public final ViewGroup f4363b;

    public C1061d(ViewGroup viewGroup) {
        this.f4363b = viewGroup;
    }

    @Override // p085n0.AbstractC1071n, p085n0.InterfaceC1068k
    /* renamed from: a */
    public final void mo2608a() {
        AbstractC0411g.m1027Q(this.f4363b, false);
    }

    @Override // p085n0.InterfaceC1068k
    /* renamed from: b */
    public final void mo2609b(AbstractC1070m abstractC1070m) {
        if (!this.f4362a) {
            AbstractC0411g.m1027Q(this.f4363b, false);
        }
        abstractC1070m.mo2632x(this);
    }

    @Override // p085n0.AbstractC1071n, p085n0.InterfaceC1068k
    /* renamed from: d */
    public final void mo2611d() {
        AbstractC0411g.m1027Q(this.f4363b, true);
    }

    @Override // p085n0.AbstractC1071n, p085n0.InterfaceC1068k
    /* renamed from: g */
    public final void mo2614g(AbstractC1070m abstractC1070m) {
        AbstractC0411g.m1027Q(this.f4363b, false);
        this.f4362a = true;
    }
}
