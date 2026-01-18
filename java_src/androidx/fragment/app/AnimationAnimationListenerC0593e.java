package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;
import p024N0.RunnableC0268B;

/* renamed from: androidx.fragment.app.e */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0593e implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ C0587S f1848a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f1849b;

    /* renamed from: c */
    public final /* synthetic */ View f1850c;

    /* renamed from: d */
    public final /* synthetic */ C0594f f1851d;

    public AnimationAnimationListenerC0593e(C0587S c0587s, ViewGroup viewGroup, View view, C0594f c0594f) {
        this.f1848a = c0587s;
        this.f1849b = viewGroup;
        this.f1850c = view;
        this.f1851d = c0594f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f1849b.post(new RunnableC0268B(4, this));
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(this.f1848a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(this.f1848a);
        }
    }
}
