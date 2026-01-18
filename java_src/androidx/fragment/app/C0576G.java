package androidx.fragment.app;

import java.util.ArrayList;

/* renamed from: androidx.fragment.app.G */
/* loaded from: classes.dex */
public final class C0576G implements InterfaceC0575F {

    /* renamed from: a */
    public final int f1709a;

    /* renamed from: b */
    public final /* synthetic */ C0577H f1710b;

    public C0576G(C0577H c0577h, int i) {
        this.f1710b = c0577h;
        this.f1709a = i;
    }

    @Override // androidx.fragment.app.InterfaceC0575F
    /* renamed from: a */
    public final boolean mo1462a(ArrayList arrayList, ArrayList arrayList2) {
        C0577H c0577h = this.f1710b;
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = c0577h.f1746w;
        int i = this.f1709a;
        if (abstractComponentCallbacksC0606r == null || i >= 0 || !abstractComponentCallbacksC0606r.m1587g().m1476M(-1, 0)) {
            return c0577h.m1477N(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
