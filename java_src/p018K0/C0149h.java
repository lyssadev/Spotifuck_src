package p018K0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: K0.h */
/* loaded from: classes.dex */
public final class C0149h implements InterfaceC0144c {

    /* renamed from: a */
    public final float f431a;

    public C0149h(float f2) {
        this.f431a = f2;
    }

    @Override // p018K0.InterfaceC0144c
    /* renamed from: a */
    public final float mo491a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f431a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0149h) && this.f431a == ((C0149h) obj).f431a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f431a)});
    }
}
