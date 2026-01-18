package p097r0;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import p096r.C1256k;

/* renamed from: r0.b */
/* loaded from: classes.dex */
public final class C1259b {

    /* renamed from: a */
    public final C1256k f5021a = new C1256k();

    /* renamed from: b */
    public final C1256k f5022b = new C1256k();

    /* renamed from: a */
    public static C1259b m2983a(Context context, int i) throws Resources.NotFoundException {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return m2984b(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return m2984b(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    /* renamed from: b */
    public static C1259b m2984b(ArrayList arrayList) {
        C1259b c1259b = new C1259b();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c1259b.f5022b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC1258a.f5018b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC1258a.f5019c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC1258a.f5020d;
            }
            C1260c c1260c = new C1260c();
            c1260c.f5026d = 0;
            c1260c.f5027e = 1;
            c1260c.f5023a = startDelay;
            c1260c.f5024b = duration;
            c1260c.f5025c = interpolator;
            c1260c.f5026d = objectAnimator.getRepeatCount();
            c1260c.f5027e = objectAnimator.getRepeatMode();
            c1259b.f5021a.put(propertyName, c1260c);
        }
        return c1259b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1259b) {
            return this.f5021a.equals(((C1259b) obj).f5021a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5021a.hashCode();
    }

    public final String toString() {
        return "\n" + C1259b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f5021a + "}\n";
    }
}
