package p024N0;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.os.Messenger;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AnimationAnimationListenerC0593e;
import androidx.fragment.app.C0577H;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0601m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.IOException;
import java.util.WeakHashMap;
import java.util.logging.Logger;
import p020L0.C0179e;
import p023N.AbstractC0206Q;
import p035T.C0384a;
import p035T.ViewOnTouchListenerC0390g;
import p039V.C0421e;
import p058d0.C0715c;
import p066g0.AbstractC0774r;
import p066g0.C0760d;
import p066g0.C0777u;
import p067g1.C0803n;
import p072i1.C0877g;
import p073j.C0883e;
import p074j0.C0934m;
import p087o.C1166k;
import p087o.C1193v0;
import p098r1.AbstractC1275o;
import p098r1.C1274n;
import p098r1.C1276p;

/* renamed from: N0.B */
/* loaded from: classes.dex */
public final class RunnableC0268B implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f669a;

    /* renamed from: b */
    public final /* synthetic */ Object f670b;

    public /* synthetic */ RunnableC0268B(int i, Object obj) {
        this.f669a = i;
        this.f670b = obj;
    }

    /* renamed from: a */
    private final void m807a() {
        synchronized (((C0877g) this.f670b)) {
            C0877g c0877g = (C0877g) this.f670b;
            if ((!c0877g.f3409n) || c0877g.f3410o) {
                return;
            }
            try {
                c0877g.m2222s();
            } catch (IOException unused) {
                ((C0877g) this.f670b).f3411p = true;
            }
            try {
                if (((C0877g) this.f670b).m2215l()) {
                    ((C0877g) this.f670b).m2220q();
                    ((C0877g) this.f670b).f3407l = 0;
                }
            } catch (IOException unused2) {
                C0877g c0877g2 = (C0877g) this.f670b;
                c0877g2.f3412q = true;
                Logger logger = AbstractC1275o.f5062a;
                c0877g2.f3405j = new C1276p(new C1274n());
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        C1166k c1166k;
        switch (this.f669a) {
            case 0:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f670b).f2577h.f729l;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 1:
                throw new RuntimeException((Exception) this.f670b);
            case 2:
                ViewOnTouchListenerC0390g viewOnTouchListenerC0390g = (ViewOnTouchListenerC0390g) this.f670b;
                if (viewOnTouchListenerC0390g.f1001t) {
                    boolean z2 = viewOnTouchListenerC0390g.f999r;
                    C0384a c0384a = viewOnTouchListenerC0390g.f987f;
                    if (z2) {
                        viewOnTouchListenerC0390g.f999r = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c0384a.f981e = jCurrentAnimationTimeMillis;
                        c0384a.f983g = -1L;
                        c0384a.f982f = jCurrentAnimationTimeMillis;
                        c0384a.f984h = 0.5f;
                    }
                    if ((c0384a.f983g > 0 && AnimationUtils.currentAnimationTimeMillis() > c0384a.f983g + c0384a.f985i) || !viewOnTouchListenerC0390g.m997e()) {
                        viewOnTouchListenerC0390g.f1001t = false;
                        return;
                    }
                    boolean z3 = viewOnTouchListenerC0390g.f1000s;
                    ListView listView = viewOnTouchListenerC0390g.f989h;
                    if (z3) {
                        viewOnTouchListenerC0390g.f1000s = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (c0384a.f982f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fM979a = c0384a.m979a(jCurrentAnimationTimeMillis2);
                    long j2 = jCurrentAnimationTimeMillis2 - c0384a.f982f;
                    c0384a.f982f = jCurrentAnimationTimeMillis2;
                    viewOnTouchListenerC0390g.f1003v.scrollListBy((int) (j2 * ((fM979a * 4.0f) + ((-4.0f) * fM979a * fM979a)) * c0384a.f980d));
                    WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 3:
                ((C0421e) this.f670b).m1086n(0);
                return;
            case 4:
                AnimationAnimationListenerC0593e animationAnimationListenerC0593e = (AnimationAnimationListenerC0593e) this.f670b;
                animationAnimationListenerC0593e.f1849b.endViewTransition(animationAnimationListenerC0593e.f1850c);
                animationAnimationListenerC0593e.f1851d.m1550d();
                return;
            case 5:
                DialogInterfaceOnCancelListenerC0601m dialogInterfaceOnCancelListenerC0601m = (DialogInterfaceOnCancelListenerC0601m) this.f670b;
                dialogInterfaceOnCancelListenerC0601m.f1867a0.onDismiss(dialogInterfaceOnCancelListenerC0601m.f1875i0);
                return;
            case 6:
                ((C0577H) this.f670b).m1513x(true);
                return;
            case 7:
                C0715c c0715c = (C0715c) this.f670b;
                c0715c.f2675g.f2718j.remove(((Messenger) c0715c.f2672d.f2g).getBinder());
                return;
            case 8:
                ((C0760d) this.f670b).m1979P();
                return;
            case 9:
                RecyclerView recyclerView = ((AbstractC0774r) this.f670b).f2805b0;
                recyclerView.focusableViewAvailable(recyclerView);
                return;
            case 10:
                ((C0777u) this.f670b).m1992k();
                return;
            case 11:
                break;
            case 12:
                m807a();
                return;
            case 13:
                C0883e c0883e = (C0883e) this.f670b;
                c0883e.m2242a(true);
                c0883e.invalidateSelf();
                return;
            case 14:
                C0934m c0934m = (C0934m) this.f670b;
                int i = c0934m.f3771A;
                ValueAnimator valueAnimator = c0934m.f3798z;
                if (i == 1) {
                    valueAnimator.cancel();
                } else if (i != 2) {
                    return;
                }
                c0934m.f3771A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 15:
                ((StaggeredGridLayoutManager) this.f670b).m1808B0();
                return;
            case 16:
                C1193v0 c1193v0 = (C1193v0) this.f670b;
                c1193v0.f4750q = null;
                c1193v0.drawableStateChanged();
                return;
            case 17:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f670b;
                if (searchView$SearchAutoComplete.f1454k) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f1454k = false;
                    return;
                }
                return;
            case 18:
                ActionMenuView actionMenuView = ((Toolbar) this.f670b).f1523f;
                if (actionMenuView == null || (c1166k = actionMenuView.f1439y) == null) {
                    return;
                }
                c1166k.m2800l();
                return;
            default:
                C0179e c0179e = (C0179e) this.f670b;
                c0179e.f525c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c0179e.f527e;
                C0421e c0421e = bottomSheetBehavior.f2307M;
                if (c0421e != null && c0421e.m1078f()) {
                    c0179e.m581a(c0179e.f524b);
                    return;
                } else {
                    if (bottomSheetBehavior.f2306L == 2) {
                        bottomSheetBehavior.m1851C(c0179e.f524b);
                        return;
                    }
                    return;
                }
        }
        while (true) {
            long jM2024a = ((C0803n) this.f670b).m2024a(System.nanoTime());
            if (jM2024a == -1) {
                return;
            }
            if (jM2024a > 0) {
                long j3 = jM2024a / 1000000;
                long j4 = jM2024a - (1000000 * j3);
                synchronized (((C0803n) this.f670b)) {
                    try {
                        ((C0803n) this.f670b).wait(j3, (int) j4);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }
}
