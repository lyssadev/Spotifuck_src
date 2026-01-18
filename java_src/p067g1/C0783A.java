package p067g1;

import p000A.C0001b;
import p000A.C0010k;

/* renamed from: g1.A */
/* loaded from: classes.dex */
public final class C0783A {

    /* renamed from: a */
    public final C0810u f2858a;

    /* renamed from: b */
    public final String f2859b;

    /* renamed from: c */
    public final C0808s f2860c;

    /* renamed from: d */
    public final Object f2861d;

    /* renamed from: e */
    public volatile C0799j f2862e;

    public C0783A(C0010k c0010k) {
        this.f2858a = (C0810u) c0010k.f23f;
        this.f2859b = (String) c0010k.f24g;
        C0001b c0001b = (C0001b) c0010k.f25h;
        c0001b.getClass();
        this.f2860c = new C0808s(c0001b);
        Object obj = c0010k.f26i;
        this.f2861d = obj == null ? this : obj;
    }

    /* renamed from: a */
    public final C0010k m2002a() {
        C0010k c0010k = new C0010k();
        c0010k.f23f = this.f2858a;
        c0010k.f24g = this.f2859b;
        c0010k.f26i = this.f2861d;
        c0010k.f25h = this.f2860c.m2035c();
        return c0010k;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f2859b);
        sb.append(", url=");
        sb.append(this.f2858a);
        sb.append(", tag=");
        Object obj = this.f2861d;
        if (obj == this) {
            obj = null;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }
}
