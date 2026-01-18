package p067g1;

import java.io.IOException;
import p072i1.C0876f;
import p098r1.AbstractC1270j;
import p098r1.InterfaceC1282v;

/* renamed from: g1.e */
/* loaded from: classes.dex */
public final class C0794e extends AbstractC1270j {

    /* renamed from: b */
    public final /* synthetic */ C0876f f2923b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0794e(InterfaceC1282v interfaceC1282v, C0876f c0876f) {
        super(interfaceC1282v);
        this.f2923b = c0876f;
    }

    @Override // p098r1.AbstractC1270j, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f2923b.close();
        super.close();
    }
}
