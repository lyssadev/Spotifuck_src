package p047Z0;

/* renamed from: Z0.e */
/* loaded from: classes.dex */
public final class C0471e implements InterfaceC0467a {

    /* renamed from: a */
    public final Class f1111a;

    public C0471e(Class cls) {
        this.f1111a = cls;
    }

    @Override // p047Z0.InterfaceC0467a
    /* renamed from: a */
    public final Class mo1097a() {
        return this.f1111a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0471e) {
            if (AbstractC0469c.m1098a(this.f1111a, ((C0471e) obj).f1111a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1111a.hashCode();
    }

    public final String toString() {
        return this.f1111a.toString() + " (Kotlin reflection is not available)";
    }
}
