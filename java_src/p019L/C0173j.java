package p019L;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: L.j */
/* loaded from: classes.dex */
public final class C0173j {

    /* renamed from: a */
    public final boolean f510a;

    /* renamed from: b */
    public final Object f511b;

    public C0173j(C0172i c0172i, boolean z2) {
        this.f511b = c0172i;
        this.f510a = z2;
    }

    /* renamed from: a */
    public boolean m557a() {
        return this.f510a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m558b(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        if (((C0172i) this.f511b) == null) {
            return m557a();
        }
        char c2 = 2;
        for (int i2 = 0; i2 < i && c2 == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            C0173j c0173j = AbstractC0174k.f512a;
            if (directionality == 0) {
                c2 = 1;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                        break;
                    default:
                        c2 = 2;
                        break;
                }
            } else {
                c2 = 0;
            }
        }
        if (c2 == 0) {
            return true;
        }
        if (c2 != 1) {
            return m557a();
        }
        return false;
    }

    public C0173j(BottomSheetBehavior bottomSheetBehavior, boolean z2) {
        this.f511b = bottomSheetBehavior;
        this.f510a = z2;
    }
}
