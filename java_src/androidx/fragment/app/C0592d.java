package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;
import p030Q0.AbstractC0328E;

/* renamed from: androidx.fragment.app.d */
/* loaded from: classes.dex */
public final class C0592d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f1843a;

    /* renamed from: b */
    public final /* synthetic */ View f1844b;

    /* renamed from: c */
    public final /* synthetic */ boolean f1845c;

    /* renamed from: d */
    public final /* synthetic */ C0587S f1846d;

    /* renamed from: e */
    public final /* synthetic */ C0594f f1847e;

    public C0592d(ViewGroup viewGroup, View view, boolean z2, C0587S c0587s, C0594f c0594f) {
        this.f1843a = viewGroup;
        this.f1844b = view;
        this.f1845c = z2;
        this.f1846d = c0587s;
        this.f1847e = c0594f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f1843a;
        View view = this.f1844b;
        viewGroup.endViewTransition(view);
        C0587S c0587s = this.f1846d;
        if (this.f1845c) {
            AbstractC0328E.m931a(view, c0587s.f1800a);
        }
        this.f1847e.m1550d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(c0587s);
        }
    }
}
