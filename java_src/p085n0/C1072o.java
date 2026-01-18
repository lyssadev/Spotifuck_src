package p085n0;

import java.util.ArrayList;
import p096r.C1247b;

/* renamed from: n0.o */
/* loaded from: classes.dex */
public final class C1072o extends AbstractC1071n {

    /* renamed from: a */
    public final /* synthetic */ C1247b f4418a;

    /* renamed from: b */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC1073p f4419b;

    public C1072o(ViewTreeObserverOnPreDrawListenerC1073p viewTreeObserverOnPreDrawListenerC1073p, C1247b c1247b) {
        this.f4419b = viewTreeObserverOnPreDrawListenerC1073p;
        this.f4418a = c1247b;
    }

    @Override // p085n0.InterfaceC1068k
    /* renamed from: b */
    public final void mo2609b(AbstractC1070m abstractC1070m) {
        ((ArrayList) this.f4418a.getOrDefault(this.f4419b.f4421g, null)).remove(abstractC1070m);
        abstractC1070m.mo2632x(this);
    }
}
