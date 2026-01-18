package p067g1;

import p000A.C0001b;

/* renamed from: g1.B */
/* loaded from: classes.dex */
public final class C0784B {

    /* renamed from: a */
    public C0783A f2863a;

    /* renamed from: b */
    public EnumC0814y f2864b;

    /* renamed from: d */
    public String f2866d;

    /* renamed from: e */
    public C0807r f2867e;

    /* renamed from: g */
    public AbstractC0787E f2869g;

    /* renamed from: h */
    public C0785C f2870h;

    /* renamed from: i */
    public C0785C f2871i;

    /* renamed from: j */
    public C0785C f2872j;

    /* renamed from: k */
    public long f2873k;

    /* renamed from: l */
    public long f2874l;

    /* renamed from: c */
    public int f2865c = -1;

    /* renamed from: f */
    public C0001b f2868f = new C0001b(27);

    /* renamed from: b */
    public static void m2003b(String str, C0785C c0785c) {
        if (c0785c.f2881g != null) {
            throw new IllegalArgumentException(str.concat(".body != null"));
        }
        if (c0785c.f2882h != null) {
            throw new IllegalArgumentException(str.concat(".networkResponse != null"));
        }
        if (c0785c.f2883i != null) {
            throw new IllegalArgumentException(str.concat(".cacheResponse != null"));
        }
        if (c0785c.f2884j != null) {
            throw new IllegalArgumentException(str.concat(".priorResponse != null"));
        }
    }

    /* renamed from: a */
    public final C0785C m2004a() {
        if (this.f2863a == null) {
            throw new IllegalStateException("request == null");
        }
        if (this.f2864b == null) {
            throw new IllegalStateException("protocol == null");
        }
        if (this.f2865c >= 0) {
            if (this.f2866d != null) {
                return new C0785C(this);
            }
            throw new IllegalStateException("message == null");
        }
        throw new IllegalStateException("code < 0: " + this.f2865c);
    }
}
