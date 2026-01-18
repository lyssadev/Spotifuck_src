package p018K0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: K0.b */
/* loaded from: classes.dex */
public final class C0143b implements InterfaceC0144c {

    /* renamed from: a */
    public final InterfaceC0144c f379a;

    /* renamed from: b */
    public final float f380b;

    public C0143b(float f2, InterfaceC0144c interfaceC0144c) {
        while (interfaceC0144c instanceof C0143b) {
            interfaceC0144c = ((C0143b) interfaceC0144c).f379a;
            f2 += ((C0143b) interfaceC0144c).f380b;
        }
        this.f379a = interfaceC0144c;
        this.f380b = f2;
    }

    @Override // p018K0.InterfaceC0144c
    /* renamed from: a */
    public final float mo491a(RectF rectF) {
        return Math.max(0.0f, this.f379a.mo491a(rectF) + this.f380b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0143b)) {
            return false;
        }
        C0143b c0143b = (C0143b) obj;
        return this.f379a.equals(c0143b.f379a) && this.f380b == c0143b.f380b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f379a, Float.valueOf(this.f380b)});
    }
}
