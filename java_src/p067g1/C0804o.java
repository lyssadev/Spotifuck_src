package p067g1;

import java.io.Serializable;

/* renamed from: g1.o */
/* loaded from: classes.dex */
public final class C0804o {

    /* renamed from: a */
    public boolean f2985a;

    /* renamed from: b */
    public boolean f2986b;

    /* renamed from: c */
    public Object f2987c;

    /* renamed from: d */
    public Serializable f2988d;

    public C0804o(boolean z2) {
        this.f2985a = z2;
    }

    /* renamed from: a */
    public void m2026a(String... strArr) {
        if (!this.f2985a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f2987c = (String[]) strArr.clone();
    }

    /* renamed from: b */
    public void m2027b(EnumC0789G... enumC0789GArr) {
        if (!this.f2985a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        String[] strArr = new String[enumC0789GArr.length];
        for (int i = 0; i < enumC0789GArr.length; i++) {
            strArr[i] = enumC0789GArr[i].f2900a;
        }
        m2028c(strArr);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    /* renamed from: c */
    public void m2028c(String... strArr) {
        if (!this.f2985a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f2988d = (String[]) strArr.clone();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.String[]] */
    public C0804o(C0805p c0805p) {
        this.f2985a = c0805p.f2991a;
        this.f2987c = c0805p.f2993c;
        this.f2988d = c0805p.f2994d;
        this.f2986b = c0805p.f2992b;
    }
}
