package p068h;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000A.C0001b;
import p007E.C0057j;
import p023N.AbstractC0193D;
import p023N.AbstractC0195F;
import p023N.AbstractC0206Q;
import p023N.C0212X;
import p023N.C0214Z;
import p036T0.AbstractC0411g;
import p065g.AbstractC0752a;
import p082m.C0985i;
import p082m.C0986j;
import p087o.C1153f1;
import p087o.InterfaceC1145d;
import p087o.InterfaceC1173m0;

/* renamed from: h.N */
/* loaded from: classes.dex */
public final class C0829N extends AbstractC0411g implements InterfaceC1145d {

    /* renamed from: J */
    public static final AccelerateInterpolator f3187J = new AccelerateInterpolator();

    /* renamed from: K */
    public static final DecelerateInterpolator f3188K = new DecelerateInterpolator();

    /* renamed from: A */
    public boolean f3189A;

    /* renamed from: B */
    public boolean f3190B;

    /* renamed from: C */
    public boolean f3191C;

    /* renamed from: D */
    public C0986j f3192D;

    /* renamed from: E */
    public boolean f3193E;

    /* renamed from: F */
    public boolean f3194F;

    /* renamed from: G */
    public final C0827L f3195G;

    /* renamed from: H */
    public final C0827L f3196H;

    /* renamed from: I */
    public final C0001b f3197I;

    /* renamed from: l */
    public Context f3198l;

    /* renamed from: m */
    public Context f3199m;

    /* renamed from: n */
    public ActionBarOverlayLayout f3200n;

    /* renamed from: o */
    public ActionBarContainer f3201o;

    /* renamed from: p */
    public InterfaceC1173m0 f3202p;

    /* renamed from: q */
    public ActionBarContextView f3203q;

    /* renamed from: r */
    public final View f3204r;

    /* renamed from: s */
    public boolean f3205s;

    /* renamed from: t */
    public C0828M f3206t;

    /* renamed from: u */
    public C0828M f3207u;

    /* renamed from: v */
    public C0057j f3208v;

    /* renamed from: w */
    public boolean f3209w;

    /* renamed from: x */
    public final ArrayList f3210x;

    /* renamed from: y */
    public int f3211y;

    /* renamed from: z */
    public boolean f3212z;

    public C0829N(Activity activity, boolean z2) {
        new ArrayList();
        this.f3210x = new ArrayList();
        this.f3211y = 0;
        this.f3212z = true;
        this.f3191C = true;
        this.f3195G = new C0827L(this, 0);
        this.f3196H = new C0827L(this, 1);
        this.f3197I = new C0001b(28, this);
        View decorView = activity.getWindow().getDecorView();
        m2107X(decorView);
        if (z2) {
            return;
        }
        this.f3204r = decorView.findViewById(R.id.content);
    }

    /* renamed from: V */
    public final void m2105V(boolean z2) {
        C0214Z c0214zM1328i;
        C0214Z c0214zM1328i2;
        if (z2) {
            if (!this.f3190B) {
                this.f3190B = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f3200n;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m2109Z(false);
            }
        } else if (this.f3190B) {
            this.f3190B = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3200n;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m2109Z(false);
        }
        if (!this.f3201o.isLaidOut()) {
            if (z2) {
                ((C1153f1) this.f3202p).f4605a.setVisibility(4);
                this.f3203q.setVisibility(0);
                return;
            } else {
                ((C1153f1) this.f3202p).f4605a.setVisibility(0);
                this.f3203q.setVisibility(8);
                return;
            }
        }
        if (z2) {
            C1153f1 c1153f1 = (C1153f1) this.f3202p;
            c0214zM1328i = AbstractC0206Q.m666a(c1153f1.f4605a);
            c0214zM1328i.m699a(0.0f);
            c0214zM1328i.m701c(100L);
            c0214zM1328i.m702d(new C0985i(c1153f1, 4));
            c0214zM1328i2 = this.f3203q.m1328i(0, 200L);
        } else {
            C1153f1 c1153f12 = (C1153f1) this.f3202p;
            C0214Z c0214zM666a = AbstractC0206Q.m666a(c1153f12.f4605a);
            c0214zM666a.m699a(1.0f);
            c0214zM666a.m701c(200L);
            c0214zM666a.m702d(new C0985i(c1153f12, 0));
            c0214zM1328i = this.f3203q.m1328i(8, 100L);
            c0214zM1328i2 = c0214zM666a;
        }
        C0986j c0986j = new C0986j();
        ArrayList arrayList = c0986j.f4028a;
        arrayList.add(c0214zM1328i);
        View view = (View) c0214zM1328i.f572a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c0214zM1328i2.f572a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c0214zM1328i2);
        c0986j.m2480b();
    }

    /* renamed from: W */
    public final Context m2106W() {
        if (this.f3199m == null) {
            TypedValue typedValue = new TypedValue();
            this.f3198l.getTheme().resolveAttribute(it.deviato.spotifuck.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f3199m = new ContextThemeWrapper(this.f3198l, i);
            } else {
                this.f3199m = this.f3198l;
            }
        }
        return this.f3199m;
    }

    /* renamed from: X */
    public final void m2107X(View view) {
        InterfaceC1173m0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(it.deviato.spotifuck.R.id.decor_content_parent);
        this.f3200n = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(it.deviato.spotifuck.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC1173m0) {
            wrapper = (InterfaceC1173m0) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f3202p = wrapper;
        this.f3203q = (ActionBarContextView) view.findViewById(it.deviato.spotifuck.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(it.deviato.spotifuck.R.id.action_bar_container);
        this.f3201o = actionBarContainer;
        InterfaceC1173m0 interfaceC1173m0 = this.f3202p;
        if (interfaceC1173m0 == null || this.f3203q == null || actionBarContainer == null) {
            throw new IllegalStateException(C0829N.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((C1153f1) interfaceC1173m0).f4605a.getContext();
        this.f3198l = context;
        if ((((C1153f1) this.f3202p).f4606b & 4) != 0) {
            this.f3205s = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f3202p.getClass();
        m2108Y(context.getResources().getBoolean(it.deviato.spotifuck.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f3198l.obtainStyledAttributes(null, AbstractC0752a.f2737a, it.deviato.spotifuck.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3200n;
            if (!actionBarOverlayLayout2.f1415l) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f3194F = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f3201o;
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            AbstractC0195F.m613s(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: Y */
    public final void m2108Y(boolean z2) {
        if (z2) {
            this.f3201o.setTabContainer(null);
            ((C1153f1) this.f3202p).getClass();
        } else {
            ((C1153f1) this.f3202p).getClass();
            this.f3201o.setTabContainer(null);
        }
        this.f3202p.getClass();
        ((C1153f1) this.f3202p).f4605a.setCollapsible(false);
        this.f3200n.setHasNonEmbeddedTabs(false);
    }

    /* renamed from: Z */
    public final void m2109Z(boolean z2) {
        boolean z3 = this.f3190B || !this.f3189A;
        View view = this.f3204r;
        C0001b c0001b = this.f3197I;
        if (!z3) {
            if (this.f3191C) {
                this.f3191C = false;
                C0986j c0986j = this.f3192D;
                if (c0986j != null) {
                    c0986j.m2479a();
                }
                int i = this.f3211y;
                C0827L c0827l = this.f3195G;
                if (i != 0 || (!this.f3193E && !z2)) {
                    c0827l.mo704a();
                    return;
                }
                this.f3201o.setAlpha(1.0f);
                this.f3201o.setTransitioning(true);
                C0986j c0986j2 = new C0986j();
                float f2 = -this.f3201o.getHeight();
                if (z2) {
                    this.f3201o.getLocationInWindow(new int[]{0, 0});
                    f2 -= r12[1];
                }
                C0214Z c0214zM666a = AbstractC0206Q.m666a(this.f3201o);
                c0214zM666a.m703e(f2);
                View view2 = (View) c0214zM666a.f572a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(c0001b != null ? new C0212X(c0001b, view2) : null);
                }
                boolean z4 = c0986j2.f4032e;
                ArrayList arrayList = c0986j2.f4028a;
                if (!z4) {
                    arrayList.add(c0214zM666a);
                }
                if (this.f3212z && view != null) {
                    C0214Z c0214zM666a2 = AbstractC0206Q.m666a(view);
                    c0214zM666a2.m703e(f2);
                    if (!c0986j2.f4032e) {
                        arrayList.add(c0214zM666a2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f3187J;
                boolean z5 = c0986j2.f4032e;
                if (!z5) {
                    c0986j2.f4030c = accelerateInterpolator;
                }
                if (!z5) {
                    c0986j2.f4029b = 250L;
                }
                if (!z5) {
                    c0986j2.f4031d = c0827l;
                }
                this.f3192D = c0986j2;
                c0986j2.m2480b();
                return;
            }
            return;
        }
        if (this.f3191C) {
            return;
        }
        this.f3191C = true;
        C0986j c0986j3 = this.f3192D;
        if (c0986j3 != null) {
            c0986j3.m2479a();
        }
        this.f3201o.setVisibility(0);
        int i2 = this.f3211y;
        C0827L c0827l2 = this.f3196H;
        if (i2 == 0 && (this.f3193E || z2)) {
            this.f3201o.setTranslationY(0.0f);
            float f3 = -this.f3201o.getHeight();
            if (z2) {
                this.f3201o.getLocationInWindow(new int[]{0, 0});
                f3 -= r12[1];
            }
            this.f3201o.setTranslationY(f3);
            C0986j c0986j4 = new C0986j();
            C0214Z c0214zM666a3 = AbstractC0206Q.m666a(this.f3201o);
            c0214zM666a3.m703e(0.0f);
            View view3 = (View) c0214zM666a3.f572a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(c0001b != null ? new C0212X(c0001b, view3) : null);
            }
            boolean z6 = c0986j4.f4032e;
            ArrayList arrayList2 = c0986j4.f4028a;
            if (!z6) {
                arrayList2.add(c0214zM666a3);
            }
            if (this.f3212z && view != null) {
                view.setTranslationY(f3);
                C0214Z c0214zM666a4 = AbstractC0206Q.m666a(view);
                c0214zM666a4.m703e(0.0f);
                if (!c0986j4.f4032e) {
                    arrayList2.add(c0214zM666a4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f3188K;
            boolean z7 = c0986j4.f4032e;
            if (!z7) {
                c0986j4.f4030c = decelerateInterpolator;
            }
            if (!z7) {
                c0986j4.f4029b = 250L;
            }
            if (!z7) {
                c0986j4.f4031d = c0827l2;
            }
            this.f3192D = c0986j4;
            c0986j4.m2480b();
        } else {
            this.f3201o.setAlpha(1.0f);
            this.f3201o.setTranslationY(0.0f);
            if (this.f3212z && view != null) {
                view.setTranslationY(0.0f);
            }
            c0827l2.mo704a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f3200n;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            AbstractC0193D.m594c(actionBarOverlayLayout);
        }
    }

    public C0829N(Dialog dialog) {
        new ArrayList();
        this.f3210x = new ArrayList();
        this.f3211y = 0;
        this.f3212z = true;
        this.f3191C = true;
        this.f3195G = new C0827L(this, 0);
        this.f3196H = new C0827L(this, 1);
        this.f3197I = new C0001b(28, this);
        m2107X(dialog.getWindow().getDecorView());
    }
}
