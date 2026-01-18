package p077k0;

import android.os.Bundle;
import androidx.activity.C0523e;
import androidx.lifecycle.C0652t;
import androidx.lifecycle.EnumC0645m;
import androidx.savedstate.Recreator;
import java.util.Map;
import p047Z0.AbstractC0469c;
import p093q.C1238d;
import p093q.C1240f;

/* renamed from: k0.d */
/* loaded from: classes.dex */
public final class C0959d {

    /* renamed from: a */
    public final InterfaceC0960e f3918a;

    /* renamed from: b */
    public final C0958c f3919b = new C0958c();

    /* renamed from: c */
    public boolean f3920c;

    public C0959d(InterfaceC0960e interfaceC0960e) {
        this.f3918a = interfaceC0960e;
    }

    /* renamed from: a */
    public final void m2445a() {
        InterfaceC0960e interfaceC0960e = this.f3918a;
        C0652t c0652tMo1299d = interfaceC0960e.mo1299d();
        if (c0652tMo1299d.f2012c != EnumC0645m.f2002b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        c0652tMo1299d.m1615a(new Recreator(interfaceC0960e));
        C0958c c0958c = this.f3919b;
        c0958c.getClass();
        if (c0958c.f3912a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        c0652tMo1299d.m1615a(new C0523e(2, c0958c));
        c0958c.f3912a = true;
        this.f3920c = true;
    }

    /* renamed from: b */
    public final void m2446b(Bundle bundle) {
        if (!this.f3920c) {
            m2445a();
        }
        C0652t c0652tMo1299d = this.f3918a.mo1299d();
        if (c0652tMo1299d.f2012c.compareTo(EnumC0645m.f2004d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c0652tMo1299d.f2012c).toString());
        }
        C0958c c0958c = this.f3919b;
        if (!c0958c.f3912a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c0958c.f3913b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c0958c.f3916e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c0958c.f3913b = true;
    }

    /* renamed from: c */
    public final void m2447c(Bundle bundle) {
        AbstractC0469c.m1102e("outBundle", bundle);
        C0958c c0958c = this.f3919b;
        c0958c.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) c0958c.f3916e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C1240f c1240f = (C1240f) c0958c.f3915d;
        c1240f.getClass();
        C1238d c1238d = new C1238d(c1240f);
        c1240f.f4933c.put(c1238d, Boolean.FALSE);
        while (c1238d.hasNext()) {
            Map.Entry entry = (Map.Entry) c1238d.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC0957b) entry.getValue()).mo1288a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
