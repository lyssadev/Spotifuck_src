package p087o;

import p084n.InterfaceC1021B;

/* renamed from: o.I */
/* loaded from: classes.dex */
public final class C1101I extends AbstractViewOnTouchListenerC1199y0 {

    /* renamed from: o */
    public final /* synthetic */ C1111N f4499o;

    /* renamed from: p */
    public final /* synthetic */ C1117Q f4500p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1101I(C1117Q c1117q, C1117Q c1117q2, C1111N c1111n) {
        super(c1117q2);
        this.f4500p = c1117q;
        this.f4499o = c1111n;
    }

    @Override // p087o.AbstractViewOnTouchListenerC1199y0
    /* renamed from: b */
    public final InterfaceC1021B mo2569b() {
        return this.f4499o;
    }

    @Override // p087o.AbstractViewOnTouchListenerC1199y0
    /* renamed from: c */
    public final boolean mo2570c() {
        C1117Q c1117q = this.f4500p;
        if (c1117q.getInternalPopup().mo2710a()) {
            return true;
        }
        c1117q.f4538k.mo2714f(c1117q.getTextDirection(), c1117q.getTextAlignment());
        return true;
    }
}
