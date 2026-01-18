package p084n;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import it.deviato.spotifuck.R;
import p024N0.ViewOnAttachStateChangeListenerC0287o;
import p087o.C1110M0;
import p087o.C1193v0;

/* renamed from: n.C */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC1022C extends AbstractC1043t implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: g */
    public final Context f4174g;

    /* renamed from: h */
    public final MenuC1035l f4175h;

    /* renamed from: i */
    public final C1032i f4176i;

    /* renamed from: j */
    public final boolean f4177j;

    /* renamed from: k */
    public final int f4178k;

    /* renamed from: l */
    public final int f4179l;

    /* renamed from: m */
    public final C1110M0 f4180m;

    /* renamed from: p */
    public C1044u f4183p;

    /* renamed from: q */
    public View f4184q;

    /* renamed from: r */
    public View f4185r;

    /* renamed from: s */
    public InterfaceC1046w f4186s;

    /* renamed from: t */
    public ViewTreeObserver f4187t;

    /* renamed from: u */
    public boolean f4188u;

    /* renamed from: v */
    public boolean f4189v;

    /* renamed from: w */
    public int f4190w;

    /* renamed from: y */
    public boolean f4192y;

    /* renamed from: n */
    public final ViewTreeObserverOnGlobalLayoutListenerC1027d f4181n = new ViewTreeObserverOnGlobalLayoutListenerC1027d(1, this);

    /* renamed from: o */
    public final ViewOnAttachStateChangeListenerC0287o f4182o = new ViewOnAttachStateChangeListenerC0287o(3, this);

    /* renamed from: x */
    public int f4191x = 0;

    public ViewOnKeyListenerC1022C(int i, Context context, View view, MenuC1035l menuC1035l, boolean z2) {
        this.f4174g = context;
        this.f4175h = menuC1035l;
        this.f4177j = z2;
        this.f4176i = new C1032i(menuC1035l, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f4179l = i;
        Resources resources = context.getResources();
        this.f4178k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f4184q = view;
        this.f4180m = new C1110M0(context, null, i);
        menuC1035l.m2581b(this, context);
    }

    @Override // p084n.InterfaceC1021B
    /* renamed from: a */
    public final boolean mo2544a() {
        return !this.f4188u && this.f4180m.f4477E.isShowing();
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: b */
    public final void mo2547b(MenuC1035l menuC1035l, boolean z2) {
        if (menuC1035l != this.f4175h) {
            return;
        }
        dismiss();
        InterfaceC1046w interfaceC1046w = this.f4186s;
        if (interfaceC1046w != null) {
            interfaceC1046w.mo497b(menuC1035l, z2);
        }
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: c */
    public final void mo2548c() {
        this.f4189v = false;
        C1032i c1032i = this.f4176i;
        if (c1032i != null) {
            c1032i.notifyDataSetChanged();
        }
    }

    @Override // p084n.InterfaceC1021B
    public final void dismiss() {
        if (mo2544a()) {
            this.f4180m.dismiss();
        }
    }

    @Override // p084n.InterfaceC1021B
    /* renamed from: e */
    public final C1193v0 mo2545e() {
        return this.f4180m.f4480h;
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: g */
    public final boolean mo2549g(SubMenuC1023D subMenuC1023D) {
        if (subMenuC1023D.hasVisibleItems()) {
            View view = this.f4185r;
            C1045v c1045v = new C1045v(this.f4179l, this.f4174g, view, subMenuC1023D, this.f4177j);
            InterfaceC1046w interfaceC1046w = this.f4186s;
            c1045v.f4333h = interfaceC1046w;
            AbstractC1043t abstractC1043t = c1045v.f4334i;
            if (abstractC1043t != null) {
                abstractC1043t.mo2551j(interfaceC1046w);
            }
            boolean zM2601u = AbstractC1043t.m2601u(subMenuC1023D);
            c1045v.f4332g = zM2601u;
            AbstractC1043t abstractC1043t2 = c1045v.f4334i;
            if (abstractC1043t2 != null) {
                abstractC1043t2.mo2554o(zM2601u);
            }
            c1045v.f4335j = this.f4183p;
            this.f4183p = null;
            this.f4175h.m2582c(false);
            C1110M0 c1110m0 = this.f4180m;
            int width = c1110m0.f4483k;
            int iM2700j = c1110m0.m2700j();
            if ((Gravity.getAbsoluteGravity(this.f4191x, this.f4184q.getLayoutDirection()) & 7) == 5) {
                width += this.f4184q.getWidth();
            }
            if (!c1045v.m2603b()) {
                if (c1045v.f4330e != null) {
                    c1045v.m2605d(width, iM2700j, true, true);
                }
            }
            InterfaceC1046w interfaceC1046w2 = this.f4186s;
            if (interfaceC1046w2 != null) {
                interfaceC1046w2.mo500h(subMenuC1023D);
            }
            return true;
        }
        return false;
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: h */
    public final boolean mo2550h() {
        return false;
    }

    @Override // p084n.InterfaceC1021B
    /* renamed from: i */
    public final void mo2546i() {
        View view;
        if (mo2544a()) {
            return;
        }
        if (this.f4188u || (view = this.f4184q) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f4185r = view;
        C1110M0 c1110m0 = this.f4180m;
        c1110m0.f4477E.setOnDismissListener(this);
        c1110m0.f4493u = this;
        c1110m0.f4476D = true;
        c1110m0.f4477E.setFocusable(true);
        View view2 = this.f4185r;
        boolean z2 = this.f4187t == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f4187t = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f4181n);
        }
        view2.addOnAttachStateChangeListener(this.f4182o);
        c1110m0.f4492t = view2;
        c1110m0.f4489q = this.f4191x;
        boolean z3 = this.f4189v;
        Context context = this.f4174g;
        C1032i c1032i = this.f4176i;
        if (!z3) {
            this.f4190w = AbstractC1043t.m2600m(c1032i, context, this.f4178k);
            this.f4189v = true;
        }
        c1110m0.m2706r(this.f4190w);
        c1110m0.f4477E.setInputMethodMode(2);
        Rect rect = this.f4324f;
        c1110m0.f4475C = rect != null ? new Rect(rect) : null;
        c1110m0.mo2546i();
        C1193v0 c1193v0 = c1110m0.f4480h;
        c1193v0.setOnKeyListener(this);
        if (this.f4192y) {
            MenuC1035l menuC1035l = this.f4175h;
            if (menuC1035l.f4270m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c1193v0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC1035l.f4270m);
                }
                frameLayout.setEnabled(false);
                c1193v0.addHeaderView(frameLayout, null, false);
            }
        }
        c1110m0.mo2704n(c1032i);
        c1110m0.mo2546i();
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: j */
    public final void mo2551j(InterfaceC1046w interfaceC1046w) {
        this.f4186s = interfaceC1046w;
    }

    @Override // p084n.AbstractC1043t
    /* renamed from: n */
    public final void mo2553n(View view) {
        this.f4184q = view;
    }

    @Override // p084n.AbstractC1043t
    /* renamed from: o */
    public final void mo2554o(boolean z2) {
        this.f4176i.f4253c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f4188u = true;
        this.f4175h.m2582c(true);
        ViewTreeObserver viewTreeObserver = this.f4187t;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f4187t = this.f4185r.getViewTreeObserver();
            }
            this.f4187t.removeGlobalOnLayoutListener(this.f4181n);
            this.f4187t = null;
        }
        this.f4185r.removeOnAttachStateChangeListener(this.f4182o);
        C1044u c1044u = this.f4183p;
        if (c1044u != null) {
            c1044u.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p084n.AbstractC1043t
    /* renamed from: p */
    public final void mo2555p(int i) {
        this.f4191x = i;
    }

    @Override // p084n.AbstractC1043t
    /* renamed from: q */
    public final void mo2556q(int i) {
        this.f4180m.f4483k = i;
    }

    @Override // p084n.AbstractC1043t
    /* renamed from: r */
    public final void mo2557r(PopupWindow.OnDismissListener onDismissListener) {
        this.f4183p = (C1044u) onDismissListener;
    }

    @Override // p084n.AbstractC1043t
    /* renamed from: s */
    public final void mo2558s(boolean z2) {
        this.f4192y = z2;
    }

    @Override // p084n.AbstractC1043t
    /* renamed from: t */
    public final void mo2559t(int i) {
        this.f4180m.m2702l(i);
    }

    @Override // p084n.AbstractC1043t
    /* renamed from: l */
    public final void mo2552l(MenuC1035l menuC1035l) {
    }
}
