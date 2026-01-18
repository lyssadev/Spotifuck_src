package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.activity.InterfaceC0518B;
import androidx.lifecycle.C0630P;
import androidx.lifecycle.C0652t;
import androidx.lifecycle.InterfaceC0631Q;
import p003C.InterfaceC0033t;
import p003C.InterfaceC0034u;
import p005D.InterfaceC0045f;
import p005D.InterfaceC0046g;
import p023N.InterfaceC0237l;
import p057d.InterfaceC0712d;
import p068h.AbstractActivityC0841l;
import p077k0.C0958c;
import p077k0.InterfaceC0960e;

/* renamed from: androidx.fragment.app.t */
/* loaded from: classes.dex */
public final class C0608t extends AbstractC0610v implements InterfaceC0045f, InterfaceC0046g, InterfaceC0033t, InterfaceC0034u, InterfaceC0631Q, InterfaceC0518B, InterfaceC0712d, InterfaceC0960e, InterfaceC0580K, InterfaceC0237l {

    /* renamed from: f */
    public final AbstractActivityC0841l f1941f;

    /* renamed from: g */
    public final AbstractActivityC0841l f1942g;

    /* renamed from: h */
    public final Handler f1943h;

    /* renamed from: i */
    public final C0577H f1944i;

    /* renamed from: j */
    public final /* synthetic */ AbstractActivityC0841l f1945j;

    public C0608t(AbstractActivityC0841l abstractActivityC0841l) {
        this.f1945j = abstractActivityC0841l;
        Handler handler = new Handler();
        this.f1944i = new C0577H();
        this.f1941f = abstractActivityC0841l;
        this.f1942g = abstractActivityC0841l;
        this.f1943h = handler;
    }

    @Override // p077k0.InterfaceC0960e
    /* renamed from: b */
    public final C0958c mo1297b() {
        return this.f1945j.f1293i.f3919b;
    }

    @Override // androidx.lifecycle.InterfaceC0631Q
    /* renamed from: c */
    public final C0630P mo1298c() {
        return this.f1945j.mo1298c();
    }

    @Override // androidx.lifecycle.InterfaceC0650r
    /* renamed from: d */
    public final C0652t mo1299d() {
        return this.f1945j.f3289y;
    }

    @Override // androidx.fragment.app.AbstractC0610v
    /* renamed from: e */
    public final View mo1563e(int i) {
        return this.f1945j.findViewById(i);
    }

    @Override // androidx.fragment.app.AbstractC0610v
    /* renamed from: f */
    public final boolean mo1564f() {
        Window window = this.f1945j.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.fragment.app.InterfaceC0580K
    /* renamed from: a */
    public final void mo1461a() {
    }
}
