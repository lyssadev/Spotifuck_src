package androidx.lifecycle;

import p047Z0.AbstractC0469c;

/* renamed from: androidx.lifecycle.s */
/* loaded from: classes.dex */
public final class C0651s {

    /* renamed from: a */
    public EnumC0645m f2008a;

    /* renamed from: b */
    public InterfaceC0648p f2009b;

    /* renamed from: a */
    public final void m1614a(InterfaceC0650r interfaceC0650r, EnumC0644l enumC0644l) {
        EnumC0645m enumC0645mM1613a = enumC0644l.m1613a();
        EnumC0645m enumC0645m = this.f2008a;
        AbstractC0469c.m1102e("state1", enumC0645m);
        if (enumC0645mM1613a.compareTo(enumC0645m) < 0) {
            enumC0645m = enumC0645mM1613a;
        }
        this.f2008a = enumC0645m;
        this.f2009b.mo1283b(interfaceC0650r, enumC0644l);
        this.f2008a = enumC0645mM1613a;
    }
}
