package p067g1;

import java.io.Closeable;
import p000A.C0001b;

/* renamed from: g1.C */
/* loaded from: classes.dex */
public final class C0785C implements Closeable {

    /* renamed from: a */
    public final C0783A f2875a;

    /* renamed from: b */
    public final EnumC0814y f2876b;

    /* renamed from: c */
    public final int f2877c;

    /* renamed from: d */
    public final String f2878d;

    /* renamed from: e */
    public final C0807r f2879e;

    /* renamed from: f */
    public final C0808s f2880f;

    /* renamed from: g */
    public final AbstractC0787E f2881g;

    /* renamed from: h */
    public final C0785C f2882h;

    /* renamed from: i */
    public final C0785C f2883i;

    /* renamed from: j */
    public final C0785C f2884j;

    /* renamed from: k */
    public final long f2885k;

    /* renamed from: l */
    public final long f2886l;

    /* renamed from: m */
    public volatile C0799j f2887m;

    public C0785C(C0784B c0784b) {
        this.f2875a = c0784b.f2863a;
        this.f2876b = c0784b.f2864b;
        this.f2877c = c0784b.f2865c;
        this.f2878d = c0784b.f2866d;
        this.f2879e = c0784b.f2867e;
        C0001b c0001b = c0784b.f2868f;
        c0001b.getClass();
        this.f2880f = new C0808s(c0001b);
        this.f2881g = c0784b.f2869g;
        this.f2882h = c0784b.f2870h;
        this.f2883i = c0784b.f2871i;
        this.f2884j = c0784b.f2872j;
        this.f2885k = c0784b.f2873k;
        this.f2886l = c0784b.f2874l;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC0787E abstractC0787E = this.f2881g;
        if (abstractC0787E == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        abstractC0787E.close();
    }

    /* renamed from: f */
    public final C0799j m2005f() {
        C0799j c0799j = this.f2887m;
        if (c0799j != null) {
            return c0799j;
        }
        C0799j c0799jM2020a = C0799j.m2020a(this.f2880f);
        this.f2887m = c0799jM2020a;
        return c0799jM2020a;
    }

    /* renamed from: g */
    public final String m2006g(String str) {
        String strM2033a = this.f2880f.m2033a(str);
        if (strM2033a != null) {
            return strM2033a;
        }
        return null;
    }

    /* renamed from: h */
    public final C0784B m2007h() {
        C0784B c0784b = new C0784B();
        c0784b.f2863a = this.f2875a;
        c0784b.f2864b = this.f2876b;
        c0784b.f2865c = this.f2877c;
        c0784b.f2866d = this.f2878d;
        c0784b.f2867e = this.f2879e;
        c0784b.f2868f = this.f2880f.m2035c();
        c0784b.f2869g = this.f2881g;
        c0784b.f2870h = this.f2882h;
        c0784b.f2871i = this.f2883i;
        c0784b.f2872j = this.f2884j;
        c0784b.f2873k = this.f2885k;
        c0784b.f2874l = this.f2886l;
        return c0784b;
    }

    public final String toString() {
        return "Response{protocol=" + this.f2876b + ", code=" + this.f2877c + ", message=" + this.f2878d + ", url=" + this.f2875a.f2858a + '}';
    }
}
