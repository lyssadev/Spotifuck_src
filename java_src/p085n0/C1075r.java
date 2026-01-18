package p085n0;

/* renamed from: n0.r */
/* loaded from: classes.dex */
public final class C1075r extends AbstractC1071n {

    /* renamed from: a */
    public final /* synthetic */ int f4425a = 1;

    /* renamed from: b */
    public AbstractC1070m f4426b;

    public /* synthetic */ C1075r() {
    }

    @Override // p085n0.InterfaceC1068k
    /* renamed from: b */
    public final void mo2609b(AbstractC1070m abstractC1070m) {
        switch (this.f4425a) {
            case 0:
                this.f4426b.mo2634z();
                abstractC1070m.mo2632x(this);
                break;
            default:
                C1058a c1058a = (C1058a) this.f4426b;
                int i = c1058a.f4358C - 1;
                c1058a.f4358C = i;
                if (i == 0) {
                    c1058a.f4359D = false;
                    c1058a.m2652m();
                }
                abstractC1070m.mo2632x(this);
                break;
        }
    }

    @Override // p085n0.AbstractC1071n, p085n0.InterfaceC1068k
    /* renamed from: e */
    public void mo2612e(AbstractC1070m abstractC1070m) {
        switch (this.f4425a) {
            case 1:
                C1058a c1058a = (C1058a) this.f4426b;
                if (!c1058a.f4359D) {
                    c1058a.m2647G();
                    c1058a.f4359D = true;
                    break;
                }
                break;
        }
    }

    public C1075r(AbstractC1070m abstractC1070m) {
        this.f4426b = abstractC1070m;
    }
}
