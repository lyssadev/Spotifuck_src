package p068h;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import p047Z0.AbstractC0469c;
import p077k0.C0958c;
import p077k0.InterfaceC0957b;

/* renamed from: h.j */
/* loaded from: classes.dex */
public final class C0839j implements InterfaceC0957b {

    /* renamed from: a */
    public final /* synthetic */ int f3282a = 0;

    /* renamed from: b */
    public final Object f3283b;

    public C0839j(C0958c c0958c) {
        AbstractC0469c.m1102e("registry", c0958c);
        this.f3283b = new LinkedHashSet();
        c0958c.m2443e("androidx.savedstate.Restarter", this);
    }

    @Override // p077k0.InterfaceC0957b
    /* renamed from: a */
    public final Bundle mo1288a() {
        switch (this.f3282a) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC0841l) this.f3283b).m2120k().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f3283b));
                return bundle2;
        }
    }

    public C0839j(AbstractActivityC0841l abstractActivityC0841l) {
        this.f3283b = abstractActivityC0841l;
    }
}
