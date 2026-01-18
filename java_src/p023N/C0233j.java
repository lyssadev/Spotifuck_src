package p023N;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: N.j */
/* loaded from: classes.dex */
public final class C0233j {

    /* renamed from: a */
    public final DisplayCutout f615a;

    public C0233j(DisplayCutout displayCutout) {
        this.f615a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0233j.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f615a, ((C0233j) obj).f615a);
    }

    public final int hashCode() {
        return this.f615a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f615a + "}";
    }
}
