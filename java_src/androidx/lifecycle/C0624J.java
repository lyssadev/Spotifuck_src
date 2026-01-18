package androidx.lifecycle;

import android.os.Bundle;
import androidx.activity.C0531m;
import java.util.Iterator;
import java.util.Map;
import p034S0.C0382b;
import p047Z0.AbstractC0469c;
import p077k0.C0958c;
import p077k0.InterfaceC0957b;

/* renamed from: androidx.lifecycle.J */
/* loaded from: classes.dex */
public final class C0624J implements InterfaceC0957b {

    /* renamed from: a */
    public final C0958c f1976a;

    /* renamed from: b */
    public boolean f1977b;

    /* renamed from: c */
    public Bundle f1978c;

    /* renamed from: d */
    public final C0382b f1979d;

    public C0624J(C0958c c0958c, InterfaceC0631Q interfaceC0631Q) {
        AbstractC0469c.m1102e("savedStateRegistry", c0958c);
        this.f1976a = c0958c;
        this.f1979d = new C0382b(new C0531m(interfaceC0631Q, 3));
    }

    @Override // p077k0.InterfaceC0957b
    /* renamed from: a */
    public final Bundle mo1288a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1978c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it2 = ((C0625K) this.f1979d.m978a()).f1980c.entrySet().iterator();
        if (!it2.hasNext()) {
            this.f1977b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it2.next();
        ((AbstractC0621G) entry.getValue()).getClass();
        throw null;
    }
}
