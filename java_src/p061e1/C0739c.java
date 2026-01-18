package p061e1;

import java.util.Iterator;

/* renamed from: e1.c */
/* loaded from: classes.dex */
public final class C0739c implements InterfaceC0740d {

    /* renamed from: a */
    public final C0741e f2729a;

    public C0739c(C0741e c0741e) {
        this.f2729a = c0741e;
    }

    @Override // p061e1.InterfaceC0740d
    public final Iterator iterator() {
        return new C0738b(this);
    }
}
