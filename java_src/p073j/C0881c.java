package p073j;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import p036T0.AbstractC0411g;

/* renamed from: j.c */
/* loaded from: classes.dex */
public final class C0881c extends AbstractC0411g {

    /* renamed from: l */
    public final ObjectAnimator f3542l;

    /* renamed from: m */
    public final boolean f3543m;

    public C0881c(AnimationDrawable animationDrawable, boolean z2, boolean z3) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z2 ? numberOfFrames - 1 : 0;
        int i2 = z2 ? 0 : numberOfFrames - 1;
        C0882d c0882d = new C0882d();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        c0882d.f3545b = numberOfFrames2;
        int[] iArr = c0882d.f3544a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            c0882d.f3544a = new int[numberOfFrames2];
        }
        int[] iArr2 = c0882d.f3544a;
        int i3 = 0;
        for (int i4 = 0; i4 < numberOfFrames2; i4++) {
            int duration = animationDrawable.getDuration(z2 ? (numberOfFrames2 - i4) - 1 : i4);
            iArr2[i4] = duration;
            i3 += duration;
        }
        c0882d.f3546c = i3;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        objectAnimatorOfInt.setAutoCancel(true);
        objectAnimatorOfInt.setDuration(c0882d.f3546c);
        objectAnimatorOfInt.setInterpolator(c0882d);
        this.f3543m = z3;
        this.f3542l = objectAnimatorOfInt;
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: K */
    public final void mo1052K() {
        this.f3542l.reverse();
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: O */
    public final void mo1055O() {
        this.f3542l.start();
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: P */
    public final void mo1056P() {
        this.f3542l.cancel();
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: e */
    public final boolean mo1058e() {
        return this.f3543m;
    }
}
