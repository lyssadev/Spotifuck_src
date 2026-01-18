package androidx.activity;

import androidx.lifecycle.C0652t;
import androidx.lifecycle.EnumC0644l;
import androidx.lifecycle.InterfaceC0648p;
import androidx.lifecycle.InterfaceC0650r;
import p032R0.C0366h;
import p047Z0.AbstractC0469c;

/* loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements InterfaceC0648p, InterfaceC0521c {

    /* renamed from: a */
    public final C0652t f1258a;

    /* renamed from: b */
    public final C0366h f1259b;

    /* renamed from: c */
    public C0543y f1260c;

    /* renamed from: d */
    public final /* synthetic */ C0517A f1261d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(C0517A c0517a, C0652t c0652t, C0366h c0366h) {
        AbstractC0469c.m1102e("onBackPressedCallback", c0366h);
        this.f1261d = c0517a;
        this.f1258a = c0652t;
        this.f1259b = c0366h;
        c0652t.m1615a(this);
    }

    @Override // androidx.lifecycle.InterfaceC0648p
    /* renamed from: b */
    public final void mo1283b(InterfaceC0650r interfaceC0650r, EnumC0644l enumC0644l) {
        if (enumC0644l != EnumC0644l.ON_START) {
            if (enumC0644l != EnumC0644l.ON_STOP) {
                if (enumC0644l == EnumC0644l.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                C0543y c0543y = this.f1260c;
                if (c0543y != null) {
                    c0543y.cancel();
                    return;
                }
                return;
            }
        }
        C0517A c0517a = this.f1261d;
        c0517a.getClass();
        C0366h c0366h = this.f1259b;
        AbstractC0469c.m1102e("onBackPressedCallback", c0366h);
        c0517a.f1249b.addLast(c0366h);
        C0543y c0543y2 = new C0543y(c0517a, c0366h);
        c0366h.f947b.add(c0543y2);
        c0517a.m1282e();
        c0366h.f948c = new C0544z(1, c0517a);
        this.f1260c = c0543y2;
    }

    @Override // androidx.activity.InterfaceC0521c
    public final void cancel() {
        this.f1258a.m1620f(this);
        this.f1259b.f947b.remove(this);
        C0543y c0543y = this.f1260c;
        if (c0543y != null) {
            c0543y.cancel();
        }
        this.f1260c = null;
    }
}
