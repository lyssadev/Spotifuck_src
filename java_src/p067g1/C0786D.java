package p067g1;

import p098r1.C1265e;
import p098r1.C1277q;
import p098r1.InterfaceC1267g;

/* renamed from: g1.D */
/* loaded from: classes.dex */
public final class C0786D extends AbstractC0787E {

    /* renamed from: a */
    public final /* synthetic */ int f2888a;

    /* renamed from: b */
    public final long f2889b;

    /* renamed from: c */
    public final InterfaceC1267g f2890c;

    public /* synthetic */ C0786D(long j2, InterfaceC1267g interfaceC1267g, int i) {
        this.f2888a = i;
        this.f2889b = j2;
        this.f2890c = interfaceC1267g;
    }

    @Override // p067g1.AbstractC0787E
    /* renamed from: f */
    public final long mo2008f() {
        switch (this.f2888a) {
        }
        return this.f2889b;
    }

    @Override // p067g1.AbstractC0787E
    /* renamed from: g */
    public final InterfaceC1267g mo2009g() {
        switch (this.f2888a) {
            case 0:
                return (C1265e) this.f2890c;
            default:
                return (C1277q) this.f2890c;
        }
    }
}
