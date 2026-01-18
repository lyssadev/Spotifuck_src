package p085n0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;
import p018K0.C0146e;
import p036T0.AbstractC0411g;

/* renamed from: n0.f */
/* loaded from: classes.dex */
public final class C1063f extends AbstractC1070m {

    /* renamed from: A */
    public static final String[] f4371A = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: B */
    public static final C1059b f4372B = new C1059b(PointF.class, "topLeft", 0);

    /* renamed from: C */
    public static final C1059b f4373C = new C1059b(PointF.class, "bottomRight", 1);

    /* renamed from: D */
    public static final C1059b f4374D = new C1059b(PointF.class, "bottomRight", 2);

    /* renamed from: E */
    public static final C1059b f4375E = new C1059b(PointF.class, "topLeft", 3);

    /* renamed from: F */
    public static final C1059b f4376F = new C1059b(PointF.class, "position", 4);

    /* renamed from: I */
    public static void m2635I(C1078u c1078u) {
        View view = c1078u.f4429b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = c1078u.f4428a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", c1078u.f4429b.getParent());
    }

    @Override // p085n0.AbstractC1070m
    /* renamed from: d */
    public final void mo2626d(C1078u c1078u) {
        m2635I(c1078u);
    }

    @Override // p085n0.AbstractC1070m
    /* renamed from: g */
    public final void mo2628g(C1078u c1078u) {
        m2635I(c1078u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p085n0.AbstractC1070m
    /* renamed from: k */
    public final Animator mo2636k(FrameLayout frameLayout, C1078u c1078u, C1078u c1078u2) {
        int i;
        ObjectAnimator objectAnimatorM2643a;
        if (c1078u == null || c1078u2 == null) {
            return null;
        }
        HashMap map = c1078u.f4428a;
        HashMap map2 = c1078u2.f4428a;
        ViewGroup viewGroup = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup2 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup == null || viewGroup2 == null) {
            return null;
        }
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        if (i <= 0) {
            return null;
        }
        View view = c1078u2.f4429b;
        AbstractC1080w.m2663a(view, i2, i4, i6, i8);
        if (i == 2) {
            if (i10 == i12 && i11 == i13) {
                this.f4417v.getClass();
                objectAnimatorM2643a = AbstractC1066i.m2643a(view, f4376F, C0146e.m494c(i2, i4, i3, i5));
            } else {
                C1062e c1062e = new C1062e(view);
                this.f4417v.getClass();
                ObjectAnimator objectAnimatorM2643a2 = AbstractC1066i.m2643a(c1062e, f4372B, C0146e.m494c(i2, i4, i3, i5));
                this.f4417v.getClass();
                ObjectAnimator objectAnimatorM2643a3 = AbstractC1066i.m2643a(c1062e, f4373C, C0146e.m494c(i6, i8, i7, i9));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorM2643a2, objectAnimatorM2643a3);
                animatorSet.addListener(new C1060c(c1062e));
                objectAnimatorM2643a = animatorSet;
            }
        } else if (i2 == i3 && i4 == i5) {
            this.f4417v.getClass();
            objectAnimatorM2643a = AbstractC1066i.m2643a(view, f4374D, C0146e.m494c(i6, i8, i7, i9));
        } else {
            this.f4417v.getClass();
            objectAnimatorM2643a = AbstractC1066i.m2643a(view, f4375E, C0146e.m494c(i2, i4, i3, i5));
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup3 = (ViewGroup) view.getParent();
            AbstractC0411g.m1027Q(viewGroup3, true);
            m2654o().m2648a(new C1061d(viewGroup3));
        }
        return objectAnimatorM2643a;
    }

    @Override // p085n0.AbstractC1070m
    /* renamed from: q */
    public final String[] mo2637q() {
        return f4371A;
    }
}
