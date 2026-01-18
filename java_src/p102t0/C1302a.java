package p102t0;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import p003C.RunnableC0015b;
import p023N.AbstractC0206Q;
import p036T0.AbstractC0411g;

/* renamed from: t0.a */
/* loaded from: classes.dex */
public final class C1302a extends AbstractC0411g {

    /* renamed from: l */
    public int f5156l;

    /* renamed from: m */
    public int f5157m = -1;

    /* renamed from: n */
    public final /* synthetic */ SwipeDismissBehavior f5158n;

    public C1302a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f5158n = swipeDismissBehavior;
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: C */
    public final void mo1050C(View view, int i) {
        this.f5157m = i;
        this.f5156l = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f5158n;
            swipeDismissBehavior.f2290c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f2290c = false;
        }
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: D */
    public final void mo573D(int i) {
        this.f5158n.getClass();
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: E */
    public final void mo574E(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f5158n;
        float f2 = width * swipeDismissBehavior.f2292e;
        float width2 = view.getWidth() * swipeDismissBehavior.f2293f;
        float fAbs = Math.abs(i - this.f5156l);
        if (fAbs <= f2) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f2) / (width2 - f2))), 1.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    @Override // p036T0.AbstractC0411g
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo575F(View view, float f2, float f3) {
        int i;
        this.f5157m = -1;
        int width = view.getWidth();
        boolean z2 = true;
        SwipeDismissBehavior swipeDismissBehavior = this.f5158n;
        if (f2 != 0.0f) {
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            boolean z3 = view.getLayoutDirection() == 1;
            int i2 = swipeDismissBehavior.f2291d;
            if (i2 != 2 && (i2 != 0 ? i2 != 1 || (!z3 ? f2 < 0.0f : f2 > 0.0f) : !z3 ? f2 > 0.0f : f2 < 0.0f)) {
                i = this.f5156l;
                z2 = false;
            } else if (f2 >= 0.0f) {
                int left = view.getLeft();
                int i3 = this.f5156l;
                i = left < i3 ? this.f5156l - width : i3 + width;
            }
        } else {
            int left2 = view.getLeft() - this.f5156l;
            float width2 = view.getWidth();
            swipeDismissBehavior.getClass();
            if (Math.abs(left2) >= Math.round(width2 * 0.5f)) {
            }
        }
        if (swipeDismissBehavior.f2288a.m1087o(i, view.getTop())) {
            RunnableC0015b runnableC0015b = new RunnableC0015b(swipeDismissBehavior, view, z2);
            WeakHashMap weakHashMap2 = AbstractC0206Q.f560a;
            view.postOnAnimation(runnableC0015b);
        }
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: S */
    public final boolean mo576S(View view, int i) {
        int i2 = this.f5157m;
        return (i2 == -1 || i2 == i) && this.f5158n.mo1846r(view);
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: f */
    public final int mo577f(View view, int i) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i2 = this.f5158n.f2291d;
        if (i2 == 0) {
            if (z2) {
                width = this.f5156l - view.getWidth();
                width2 = this.f5156l;
            } else {
                width = this.f5156l;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.f5156l - view.getWidth();
            width2 = view.getWidth() + this.f5156l;
        } else if (z2) {
            width = this.f5156l;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f5156l - view.getWidth();
            width2 = this.f5156l;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: g */
    public final int mo578g(View view, int i) {
        return view.getTop();
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: r */
    public final int mo579r(View view) {
        return view.getWidth();
    }
}
