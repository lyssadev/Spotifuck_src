package androidx.activity;

import android.os.Bundle;
import androidx.fragment.app.C0577H;
import androidx.fragment.app.C0608t;
import androidx.lifecycle.EnumC0644l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p068h.AbstractActivityC0841l;
import p077k0.InterfaceC0957b;

/* renamed from: androidx.activity.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C0524f implements InterfaceC0957b {

    /* renamed from: a */
    public final /* synthetic */ int f1270a;

    /* renamed from: b */
    public final /* synthetic */ Object f1271b;

    public /* synthetic */ C0524f(int i, Object obj) {
        this.f1270a = i;
        this.f1271b = obj;
    }

    @Override // p077k0.InterfaceC0957b
    /* renamed from: a */
    public final Bundle mo1288a() {
        switch (this.f1270a) {
            case 0:
                Bundle bundle = new Bundle();
                C0530l c0530l = ((AbstractActivityC0841l) this.f1271b).f1297m;
                c0530l.getClass();
                LinkedHashMap linkedHashMap = c0530l.f1282b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0530l.f1284d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(c0530l.f1287g));
                return bundle;
            case 1:
                AbstractActivityC0841l abstractActivityC0841l = (AbstractActivityC0841l) this.f1271b;
                while (AbstractActivityC0841l.m2119m(((C0608t) abstractActivityC0841l.f3288x.f2g).f1944i)) {
                }
                abstractActivityC0841l.f3289y.m1618d(EnumC0644l.ON_STOP);
                return new Bundle();
            default:
                return ((C0577H) this.f1271b).m1481R();
        }
    }
}
