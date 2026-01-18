package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import p023N.ViewTreeObserverOnPreDrawListenerC0255u;

/* renamed from: androidx.fragment.app.u */
/* loaded from: classes.dex */
public final class RunnableC0609u extends AnimationSet implements Runnable {

    /* renamed from: a */
    public final ViewGroup f1946a;

    /* renamed from: b */
    public final View f1947b;

    /* renamed from: c */
    public boolean f1948c;

    /* renamed from: d */
    public boolean f1949d;

    /* renamed from: e */
    public boolean f1950e;

    public RunnableC0609u(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f1950e = true;
        this.f1946a = viewGroup;
        this.f1947b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation) {
        this.f1950e = true;
        if (this.f1948c) {
            return !this.f1949d;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f1948c = true;
            ViewTreeObserverOnPreDrawListenerC0255u.m794a(this.f1946a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f1948c;
        ViewGroup viewGroup = this.f1946a;
        if (z2 || !this.f1950e) {
            viewGroup.endViewTransition(this.f1947b);
            this.f1949d = true;
        } else {
            this.f1950e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation, float f2) {
        this.f1950e = true;
        if (this.f1948c) {
            return !this.f1949d;
        }
        if (!super.getTransformation(j2, transformation, f2)) {
            this.f1948c = true;
            ViewTreeObserverOnPreDrawListenerC0255u.m794a(this.f1946a, this);
        }
        return true;
    }
}
