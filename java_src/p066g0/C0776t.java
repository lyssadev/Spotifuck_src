package p066g0;

import android.text.TextUtils;
import androidx.preference.Preference;

/* renamed from: g0.t */
/* loaded from: classes.dex */
public final class C0776t {

    /* renamed from: a */
    public final int f2812a;

    /* renamed from: b */
    public final int f2813b;

    /* renamed from: c */
    public final String f2814c;

    public C0776t(Preference preference) {
        this.f2814c = preference.getClass().getName();
        this.f2812a = preference.f2064D;
        this.f2813b = preference.f2065E;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0776t)) {
            return false;
        }
        C0776t c0776t = (C0776t) obj;
        return this.f2812a == c0776t.f2812a && this.f2813b == c0776t.f2813b && TextUtils.equals(this.f2814c, c0776t.f2814c);
    }

    public final int hashCode() {
        return this.f2814c.hashCode() + ((((527 + this.f2812a) * 31) + this.f2813b) * 31);
    }
}
