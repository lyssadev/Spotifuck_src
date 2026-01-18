package androidx.lifecycle;

import p047Z0.AbstractC0469c;

/* renamed from: androidx.lifecycle.j */
/* loaded from: classes.dex */
public final class C0642j {
    /* renamed from: a */
    public static EnumC0644l m1612a(EnumC0645m enumC0645m) {
        AbstractC0469c.m1102e("state", enumC0645m);
        int iOrdinal = enumC0645m.ordinal();
        if (iOrdinal == 1) {
            return EnumC0644l.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return EnumC0644l.ON_START;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return EnumC0644l.ON_RESUME;
    }
}
