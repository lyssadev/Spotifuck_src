package p007E;

import android.content.res.Resources;
import java.util.Objects;

/* renamed from: E.n */
/* loaded from: classes.dex */
public final class C0061n {

    /* renamed from: a */
    public final Resources f127a;

    /* renamed from: b */
    public final Resources.Theme f128b;

    public C0061n(Resources resources, Resources.Theme theme) {
        this.f127a = resources;
        this.f128b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0061n.class != obj.getClass()) {
            return false;
        }
        C0061n c0061n = (C0061n) obj;
        return this.f127a.equals(c0061n.f127a) && Objects.equals(this.f128b, c0061n.f128b);
    }

    public final int hashCode() {
        return Objects.hash(this.f127a, this.f128b);
    }
}
