package p018K0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: K0.a */
/* loaded from: classes.dex */
public final class C0142a implements InterfaceC0144c {

    /* renamed from: a */
    public final float f378a;

    public C0142a(float f2) {
        this.f378a = f2;
    }

    @Override // p018K0.InterfaceC0144c
    /* renamed from: a */
    public final float mo491a(RectF rectF) {
        return this.f378a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0142a) && this.f378a == ((C0142a) obj).f378a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f378a)});
    }
}
