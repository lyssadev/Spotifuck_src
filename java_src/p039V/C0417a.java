package p039V;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;
import p000A.C0001b;
import p023N.AbstractC0206Q;
import p025O.C0309k;
import p114z0.C1368c;

/* renamed from: V.a */
/* loaded from: classes.dex */
public final class C0417a extends C0001b {

    /* renamed from: i */
    public final /* synthetic */ AbstractC0418b f1035i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0417a(AbstractC0418b abstractC0418b) {
        super(7);
        this.f1035i = abstractC0418b;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    @Override // p000A.C0001b
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo31A(int i, int i2, Bundle bundle) {
        int i3;
        AbstractC0418b abstractC0418b = this.f1035i;
        Chip chip = abstractC0418b.f1044i;
        if (i == -1) {
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            return chip.performAccessibilityAction(i2, bundle);
        }
        boolean z2 = true;
        if (i2 == 1) {
            return abstractC0418b.m1071p(i);
        }
        if (i2 == 2) {
            return abstractC0418b.m1065j(i);
        }
        boolean z3 = false;
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = abstractC0418b.f1043h;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i3 = abstractC0418b.f1046k) != i) {
                if (i3 != Integer.MIN_VALUE) {
                    abstractC0418b.f1046k = Integer.MIN_VALUE;
                    abstractC0418b.f1044i.invalidate();
                    abstractC0418b.m1072q(i3, 65536);
                }
                abstractC0418b.f1046k = i;
                chip.invalidate();
                abstractC0418b.m1072q(i, 32768);
            }
        } else {
            if (i2 != 128) {
                C1368c c1368c = (C1368c) abstractC0418b;
                if (i2 != 16) {
                    return false;
                }
                Chip chip2 = c1368c.f5705q;
                if (i == 0) {
                    return chip2.performClick();
                }
                if (i != 1) {
                    return false;
                }
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f2388m;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z3 = true;
                }
                if (!chip2.f2399x) {
                    return z3;
                }
                chip2.f2398w.m1072q(1, 1);
                return z3;
            }
            if (abstractC0418b.f1046k == i) {
                abstractC0418b.f1046k = Integer.MIN_VALUE;
                chip.invalidate();
                abstractC0418b.m1072q(i, 65536);
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    @Override // p000A.C0001b
    /* renamed from: t */
    public final C0309k mo54t(int i) {
        return new C0309k(AccessibilityNodeInfo.obtain(this.f1035i.m1069n(i).f826a));
    }

    @Override // p000A.C0001b
    /* renamed from: u */
    public final C0309k mo55u(int i) {
        AbstractC0418b abstractC0418b = this.f1035i;
        int i2 = i == 2 ? abstractC0418b.f1046k : abstractC0418b.f1047l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return mo54t(i2);
    }
}
