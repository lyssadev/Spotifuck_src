package p107w;

import java.util.Iterator;

/* renamed from: w.g */
/* loaded from: classes.dex */
public class C1322g extends C1321f {

    /* renamed from: m */
    public int f5381m;

    public C1322g(AbstractC1330o abstractC1330o) {
        super(abstractC1330o);
        if (abstractC1330o instanceof C1326k) {
            this.f5373e = 2;
        } else {
            this.f5373e = 3;
        }
    }

    @Override // p107w.C1321f
    /* renamed from: d */
    public final void mo3219d(int i) {
        if (this.f5378j) {
            return;
        }
        this.f5378j = true;
        this.f5375g = i;
        Iterator it2 = this.f5379k.iterator();
        while (it2.hasNext()) {
            InterfaceC1319d interfaceC1319d = (InterfaceC1319d) it2.next();
            interfaceC1319d.mo3202a(interfaceC1319d);
        }
    }
}
