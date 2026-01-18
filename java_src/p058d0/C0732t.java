package p058d0;

import android.text.TextUtils;
import java.util.Objects;

/* renamed from: d0.t */
/* loaded from: classes.dex */
public class C0732t {

    /* renamed from: a */
    public final String f2722a;

    /* renamed from: b */
    public final int f2723b;

    /* renamed from: c */
    public final int f2724c;

    public C0732t(String str, int i, int i2) {
        this.f2722a = str;
        this.f2723b = i;
        this.f2724c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0732t)) {
            return false;
        }
        C0732t c0732t = (C0732t) obj;
        int i = this.f2724c;
        String str = this.f2722a;
        int i2 = this.f2723b;
        return (i2 < 0 || c0732t.f2723b < 0) ? TextUtils.equals(str, c0732t.f2722a) && i == c0732t.f2724c : TextUtils.equals(str, c0732t.f2722a) && i2 == c0732t.f2723b && i == c0732t.f2724c;
    }

    public final int hashCode() {
        return Objects.hash(this.f2722a, Integer.valueOf(this.f2724c));
    }
}
