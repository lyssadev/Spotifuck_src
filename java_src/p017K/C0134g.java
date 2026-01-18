package p017K;

import java.util.ArrayList;
import p007E.C0057j;
import p021M.InterfaceC0180a;
import p096r.C1256k;

/* renamed from: K.g */
/* loaded from: classes.dex */
public final class C0134g implements InterfaceC0180a {

    /* renamed from: a */
    public final /* synthetic */ int f356a;

    /* renamed from: b */
    public final /* synthetic */ Object f357b;

    public /* synthetic */ C0134g(int i, Object obj) {
        this.f356a = i;
        this.f357b = obj;
    }

    @Override // p021M.InterfaceC0180a
    /* renamed from: a */
    public final void mo485a(Object obj) {
        switch (this.f356a) {
            case 0:
                C0135h c0135h = (C0135h) obj;
                if (c0135h == null) {
                    c0135h = new C0135h(-3);
                }
                ((C0057j) this.f357b).m257G(c0135h);
                return;
            default:
                C0135h c0135h2 = (C0135h) obj;
                synchronized (AbstractC0136i.f362c) {
                    try {
                        C1256k c1256k = AbstractC0136i.f363d;
                        ArrayList arrayList = (ArrayList) c1256k.getOrDefault((String) this.f357b, null);
                        if (arrayList == null) {
                            return;
                        }
                        c1256k.remove((String) this.f357b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((InterfaceC0180a) arrayList.get(i)).mo485a(c0135h2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
