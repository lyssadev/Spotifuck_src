package p088o0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import p010G.AbstractC0094a;
import p112y0.C1362a;
import p112y0.C1364c;

/* renamed from: o0.b */
/* loaded from: classes.dex */
public final class C1203b extends Animatable2.AnimationCallback {

    /* renamed from: a */
    public final /* synthetic */ C1362a f4787a;

    public C1203b(C1362a c1362a) {
        this.f4787a = c1362a;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f4787a.f5675b.f5694t;
        if (colorStateList != null) {
            AbstractC0094a.m363h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        C1364c c1364c = this.f4787a.f5675b;
        ColorStateList colorStateList = c1364c.f5694t;
        if (colorStateList != null) {
            AbstractC0094a.m362g(drawable, colorStateList.getColorForState(c1364c.f5698x, colorStateList.getDefaultColor()));
        }
    }
}
