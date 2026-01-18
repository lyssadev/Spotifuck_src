package androidx.activity;

import p032R0.C0366h;
import p036T0.C0405a;
import p047Z0.AbstractC0469c;

/* renamed from: androidx.activity.y */
/* loaded from: classes.dex */
public final class C0543y implements InterfaceC0521c {

    /* renamed from: a */
    public final C0366h f1328a;

    /* renamed from: b */
    public final /* synthetic */ C0517A f1329b;

    public C0543y(C0517A c0517a, C0366h c0366h) {
        AbstractC0469c.m1102e("onBackPressedCallback", c0366h);
        this.f1329b = c0517a;
        this.f1328a = c0366h;
    }

    @Override // androidx.activity.InterfaceC0521c
    public final void cancel() {
        C0517A c0517a = this.f1329b;
        C0405a c0405a = c0517a.f1249b;
        C0366h c0366h = this.f1328a;
        c0405a.remove(c0366h);
        if (AbstractC0469c.m1098a(c0517a.f1250c, c0366h)) {
            c0366h.getClass();
            c0517a.f1250c = null;
        }
        c0366h.f947b.remove(this);
        C0544z c0544z = c0366h.f948c;
        if (c0544z != null) {
            c0544z.mo1093a();
        }
        c0366h.f948c = null;
    }
}
