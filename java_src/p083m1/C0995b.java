package p083m1;

import java.util.Locale;
import p070h1.AbstractC0869c;
import p098r1.C1268h;

/* renamed from: m1.b */
/* loaded from: classes.dex */
public final class C0995b {

    /* renamed from: d */
    public static final C1268h f4043d = C1268h.m3017f(":");

    /* renamed from: e */
    public static final C1268h f4044e = C1268h.m3017f(":status");

    /* renamed from: f */
    public static final C1268h f4045f = C1268h.m3017f(":method");

    /* renamed from: g */
    public static final C1268h f4046g = C1268h.m3017f(":path");

    /* renamed from: h */
    public static final C1268h f4047h = C1268h.m3017f(":scheme");

    /* renamed from: i */
    public static final C1268h f4048i = C1268h.m3017f(":authority");

    /* renamed from: a */
    public final C1268h f4049a;

    /* renamed from: b */
    public final C1268h f4050b;

    /* renamed from: c */
    public final int f4051c;

    public C0995b(String str, String str2) {
        this(C1268h.m3017f(str), C1268h.m3017f(str2));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0995b)) {
            return false;
        }
        C0995b c0995b = (C0995b) obj;
        return this.f4049a.equals(c0995b.f4049a) && this.f4050b.equals(c0995b.f4050b);
    }

    public final int hashCode() {
        return this.f4050b.hashCode() + ((this.f4049a.hashCode() + 527) * 31);
    }

    public final String toString() {
        String strMo3028o = this.f4049a.mo3028o();
        String strMo3028o2 = this.f4050b.mo3028o();
        byte[] bArr = AbstractC0869c.f3362a;
        Locale locale = Locale.US;
        return strMo3028o + ": " + strMo3028o2;
    }

    public C0995b(C1268h c1268h, String str) {
        this(c1268h, C1268h.m3017f(str));
    }

    public C0995b(C1268h c1268h, C1268h c1268h2) {
        this.f4049a = c1268h;
        this.f4050b = c1268h2;
        this.f4051c = c1268h2.mo3025l() + c1268h.mo3025l() + 32;
    }
}
