package p067g1;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: g1.F */
/* loaded from: classes.dex */
public final class C0788F {

    /* renamed from: a */
    public final C0790a f2891a;

    /* renamed from: b */
    public final Proxy f2892b;

    /* renamed from: c */
    public final InetSocketAddress f2893c;

    public C0788F(C0790a c0790a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (c0790a == null) {
            throw new NullPointerException("address == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f2891a = c0790a;
        this.f2892b = proxy;
        this.f2893c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0788F) {
            C0788F c0788f = (C0788F) obj;
            if (c0788f.f2891a.equals(this.f2891a) && c0788f.f2892b.equals(this.f2892b) && c0788f.f2893c.equals(this.f2893c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2893c.hashCode() + ((this.f2892b.hashCode() + ((this.f2891a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f2893c + "}";
    }
}
