package p096r;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: r.b */
/* loaded from: classes.dex */
public final class C1247b extends C1256k implements Map {

    /* renamed from: h */
    public C1246a f4971h;

    public C1247b(C1256k c1256k) {
        int i = c1256k.f5012c;
        m2968b(i);
        if (this.f5012c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(c1256k.m2973h(i2), c1256k.m2975j(i2));
            }
        } else if (i > 0) {
            System.arraycopy(c1256k.f5010a, 0, this.f5010a, 0, i);
            System.arraycopy(c1256k.f5011b, 0, this.f5011b, 0, i << 1);
            this.f5012c = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f4971h == null) {
            this.f4971h = new C1246a(0, this);
        }
        C1246a c1246a = this.f4971h;
        if (c1246a.f4966a == null) {
            c1246a.f4966a = new C1253h(c1246a, 0);
        }
        return c1246a.f4966a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f4971h == null) {
            this.f4971h = new C1246a(0, this);
        }
        C1246a c1246a = this.f4971h;
        if (c1246a.f4967b == null) {
            c1246a.f4967b = new C1253h(c1246a, 1);
        }
        return c1246a.f4967b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m2968b(map.size() + this.f5012c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f4971h == null) {
            this.f4971h = new C1246a(0, this);
        }
        C1246a c1246a = this.f4971h;
        if (c1246a.f4968c == null) {
            c1246a.f4968c = new C1255j(c1246a);
        }
        return c1246a.f4968c;
    }
}
