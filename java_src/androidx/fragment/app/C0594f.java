package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import it.deviato.spotifuck.R;
import p007E.C0057j;
import p036T0.AbstractC0411g;

/* renamed from: androidx.fragment.app.f */
/* loaded from: classes.dex */
public final class C0594f extends AbstractC0595g {

    /* renamed from: c */
    public boolean f1852c;

    /* renamed from: d */
    public boolean f1853d;

    /* renamed from: e */
    public C0057j f1854e;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0027  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0057j m1548j(Context context) throws Resources.NotFoundException {
        int i;
        Animation animationLoadAnimation;
        C0057j c0057j;
        int iM1028R;
        if (this.f1853d) {
            return this.f1854e;
        }
        C0587S c0587s = (C0587S) this.f1855a;
        boolean z2 = c0587s.f1800a == 2;
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = c0587s.f1802c;
        C0604p c0604p = abstractComponentCallbacksC0606r.f1906M;
        int i2 = c0604p == null ? 0 : c0604p.f1887f;
        if (this.f1852c) {
            if (z2) {
                i = c0604p == null ? 0 : c0604p.f1885d;
            } else if (c0604p != null) {
                i = c0604p.f1886e;
            }
        } else if (z2) {
            if (c0604p != null) {
                i = c0604p.f1883b;
            }
        } else if (c0604p != null) {
            i = c0604p.f1884c;
        }
        abstractComponentCallbacksC0606r.m1583H(0, 0, 0, 0);
        ViewGroup viewGroup = abstractComponentCallbacksC0606r.f1902I;
        C0057j c0057j2 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            abstractComponentCallbacksC0606r.f1902I.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = abstractComponentCallbacksC0606r.f1902I;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            if (i == 0 && i2 != 0) {
                if (i2 == 4097) {
                    iM1028R = z2 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                } else if (i2 == 8194) {
                    iM1028R = z2 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                } else if (i2 == 8197) {
                    iM1028R = z2 ? AbstractC0411g.m1028R(context, android.R.attr.activityCloseEnterAnimation) : AbstractC0411g.m1028R(context, android.R.attr.activityCloseExitAnimation);
                } else if (i2 == 4099) {
                    iM1028R = z2 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                } else if (i2 != 4100) {
                    i = -1;
                } else {
                    iM1028R = z2 ? AbstractC0411g.m1028R(context, android.R.attr.activityOpenEnterAnimation) : AbstractC0411g.m1028R(context, android.R.attr.activityOpenExitAnimation);
                }
                i = iM1028R;
            }
            if (i != 0) {
                boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(i));
                if (zEquals) {
                    try {
                        animationLoadAnimation = AnimationUtils.loadAnimation(context, i);
                    } catch (Resources.NotFoundException e) {
                        throw e;
                    } catch (RuntimeException unused) {
                    }
                    if (animationLoadAnimation != null) {
                        c0057j = new C0057j(animationLoadAnimation);
                        c0057j2 = c0057j;
                    }
                } else {
                    try {
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
                        if (animatorLoadAnimator != null) {
                            c0057j = new C0057j(animatorLoadAnimator);
                            c0057j2 = c0057j;
                        }
                    } catch (RuntimeException e2) {
                        if (zEquals) {
                            throw e2;
                        }
                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, i);
                        if (animationLoadAnimation2 != null) {
                            c0057j2 = new C0057j(animationLoadAnimation2);
                        }
                    }
                }
            }
        }
        this.f1854e = c0057j2;
        this.f1853d = true;
        return c0057j2;
    }
}
