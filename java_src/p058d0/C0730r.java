package p058d0;

import android.os.Build;
import android.text.TextUtils;
import p013H0.AbstractC0111f;

/* renamed from: d0.r */
/* loaded from: classes.dex */
public final class C0730r {

    /* renamed from: a */
    public C0732t f2721a;

    public C0730r(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT < 28) {
            this.f2721a = new C0732t(str, i, i2);
            return;
        }
        C0731s c0731s = new C0731s(str, i, i2);
        AbstractC0111f.m434v(str, i, i2);
        this.f2721a = c0731s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0730r)) {
            return false;
        }
        return this.f2721a.equals(((C0730r) obj).f2721a);
    }

    public final int hashCode() {
        return this.f2721a.hashCode();
    }
}
