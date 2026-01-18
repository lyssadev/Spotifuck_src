package p093q;

import java.util.HashMap;

/* renamed from: q.a */
/* loaded from: classes.dex */
public final class C1235a extends C1240f {

    /* renamed from: e */
    public final HashMap f4920e = new HashMap();

    @Override // p093q.C1240f
    /* renamed from: a */
    public final C1237c mo2932a(Object obj) {
        return (C1237c) this.f4920e.get(obj);
    }

    @Override // p093q.C1240f
    /* renamed from: b */
    public final Object mo2933b(Object obj) {
        Object objMo2933b = super.mo2933b(obj);
        this.f4920e.remove(obj);
        return objMo2933b;
    }
}
