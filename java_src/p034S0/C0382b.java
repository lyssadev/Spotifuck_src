package p034S0;

import java.io.Serializable;
import p045Y0.InterfaceC0438a;
import p047Z0.AbstractC0469c;
import p047Z0.AbstractC0470d;

/* renamed from: S0.b */
/* loaded from: classes.dex */
public final class C0382b implements Serializable {

    /* renamed from: a */
    public AbstractC0470d f971a;

    /* renamed from: b */
    public volatile Object f972b = C0383c.f974b;

    /* renamed from: c */
    public final Object f973c = this;

    /* JADX WARN: Multi-variable type inference failed */
    public C0382b(InterfaceC0438a interfaceC0438a) {
        this.f971a = (AbstractC0470d) interfaceC0438a;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Y0.a, Z0.d, java.lang.Object] */
    /* renamed from: a */
    public final Object m978a() {
        Object objMo1093a;
        Object obj = this.f972b;
        C0383c c0383c = C0383c.f974b;
        if (obj != c0383c) {
            return obj;
        }
        synchronized (this.f973c) {
            objMo1093a = this.f972b;
            if (objMo1093a == c0383c) {
                ?? r12 = this.f971a;
                AbstractC0469c.m1099b(r12);
                objMo1093a = r12.mo1093a();
                this.f972b = objMo1093a;
                this.f971a = null;
            }
        }
        return objMo1093a;
    }

    public final String toString() {
        return this.f972b != C0383c.f974b ? String.valueOf(m978a()) : "Lazy value not initialized yet.";
    }
}
