package androidx.lifecycle;

import android.os.Handler;
import p000A.C0001b;
import p003C.RunnableC0014a;
import p047Z0.AbstractC0469c;

/* renamed from: androidx.lifecycle.C */
/* loaded from: classes.dex */
public final class C0617C implements InterfaceC0650r {

    /* renamed from: n */
    public static final C0617C f1958n = new C0617C();

    /* renamed from: f */
    public int f1959f;

    /* renamed from: g */
    public int f1960g;

    /* renamed from: j */
    public Handler f1963j;

    /* renamed from: h */
    public boolean f1961h = true;

    /* renamed from: i */
    public boolean f1962i = true;

    /* renamed from: k */
    public final C0652t f1964k = new C0652t(this);

    /* renamed from: l */
    public final RunnableC0014a f1965l = new RunnableC0014a(11, this);

    /* renamed from: m */
    public final C0001b f1966m = new C0001b(20, this);

    /* renamed from: a */
    public final void m1600a() {
        int i = this.f1960g + 1;
        this.f1960g = i;
        if (i == 1) {
            if (this.f1961h) {
                this.f1964k.m1618d(EnumC0644l.ON_RESUME);
                this.f1961h = false;
            } else {
                Handler handler = this.f1963j;
                AbstractC0469c.m1099b(handler);
                handler.removeCallbacks(this.f1965l);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0650r
    /* renamed from: d */
    public final C0652t mo1299d() {
        return this.f1964k;
    }
}
