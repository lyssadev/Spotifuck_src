package androidx.activity;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0644l;
import androidx.lifecycle.InterfaceC0648p;
import androidx.lifecycle.InterfaceC0650r;
import p068h.AbstractActivityC0841l;

/* renamed from: androidx.activity.h */
/* loaded from: classes.dex */
public final /* synthetic */ class C0526h implements InterfaceC0648p {

    /* renamed from: a */
    public final /* synthetic */ C0517A f1274a;

    /* renamed from: b */
    public final /* synthetic */ AbstractActivityC0841l f1275b;

    public /* synthetic */ C0526h(C0517A c0517a, AbstractActivityC0841l abstractActivityC0841l) {
        this.f1274a = c0517a;
        this.f1275b = abstractActivityC0841l;
    }

    @Override // androidx.lifecycle.InterfaceC0648p
    /* renamed from: b */
    public final void mo1283b(InterfaceC0650r interfaceC0650r, EnumC0644l enumC0644l) {
        if (enumC0644l == EnumC0644l.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM1290a = AbstractC0527i.m1290a(this.f1275b);
            C0517A c0517a = this.f1274a;
            c0517a.f1252e = onBackInvokedDispatcherM1290a;
            c0517a.m1281d(c0517a.f1254g);
        }
    }
}
