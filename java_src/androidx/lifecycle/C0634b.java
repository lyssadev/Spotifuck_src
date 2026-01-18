package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.b */
/* loaded from: classes.dex */
public final class C0634b {

    /* renamed from: a */
    public final int f1994a;

    /* renamed from: b */
    public final Method f1995b;

    public C0634b(int i, Method method) throws SecurityException {
        this.f1994a = i;
        this.f1995b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0634b)) {
            return false;
        }
        C0634b c0634b = (C0634b) obj;
        return this.f1994a == c0634b.f1994a && this.f1995b.getName().equals(c0634b.f1995b.getName());
    }

    public final int hashCode() {
        return this.f1995b.getName().hashCode() + (this.f1994a * 31);
    }
}
