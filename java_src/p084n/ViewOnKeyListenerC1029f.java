package p084n;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import it.deviato.spotifuck.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import p024N0.ViewOnAttachStateChangeListenerC0287o;
import p074j0.C0944w;
import p087o.AbstractC1104J0;
import p087o.AbstractC1106K0;
import p087o.C1085A;
import p087o.C1110M0;
import p087o.C1193v0;

/* renamed from: n.f */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC1029f extends AbstractC1043t implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A */
    public boolean f4218A;

    /* renamed from: B */
    public InterfaceC1046w f4219B;

    /* renamed from: C */
    public ViewTreeObserver f4220C;

    /* renamed from: D */
    public C1044u f4221D;

    /* renamed from: E */
    public boolean f4222E;

    /* renamed from: g */
    public final Context f4223g;

    /* renamed from: h */
    public final int f4224h;

    /* renamed from: i */
    public final int f4225i;

    /* renamed from: j */
    public final boolean f4226j;

    /* renamed from: k */
    public final Handler f4227k;

    /* renamed from: s */
    public View f4235s;

    /* renamed from: t */
    public View f4236t;

    /* renamed from: u */
    public int f4237u;

    /* renamed from: v */
    public boolean f4238v;

    /* renamed from: w */
    public boolean f4239w;

    /* renamed from: x */
    public int f4240x;

    /* renamed from: y */
    public int f4241y;

    /* renamed from: l */
    public final ArrayList f4228l = new ArrayList();

    /* renamed from: m */
    public final ArrayList f4229m = new ArrayList();

    /* renamed from: n */
    public final ViewTreeObserverOnGlobalLayoutListenerC1027d f4230n = new ViewTreeObserverOnGlobalLayoutListenerC1027d(0, this);

    /* renamed from: o */
    public final ViewOnAttachStateChangeListenerC0287o f4231o = new ViewOnAttachStateChangeListenerC0287o(2, this);

    /* renamed from: p */
    public final C0944w f4232p = new C0944w(this);

    /* renamed from: q */
    public int f4233q = 0;

    /* renamed from: r */
    public int f4234r = 0;

    /* renamed from: z */
    public boolean f4242z = false;

    public ViewOnKeyListenerC1029f(Context context, View view, int i, boolean z2) {
        this.f4223g = context;
        this.f4235s = view;
        this.f4225i = i;
        this.f4226j = z2;
        this.f4237u = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f4224h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f4227k = new Handler();
    }

    @Override // p084n.InterfaceC1021B
    /* renamed from: a */
    public final boolean mo2544a() {
        ArrayList arrayList = this.f4229m;
        return arrayList.size() > 0 && ((C1028e) arrayList.get(0)).f4215a.f4477E.isShowing();
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: b */
    public final void mo2547b(MenuC1035l menuC1035l, boolean z2) {
        ArrayList arrayList = this.f4229m;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC1035l == ((C1028e) arrayList.get(i)).f4216b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((C1028e) arrayList.get(i2)).f4216b.m2582c(false);
        }
        C1028e c1028e = (C1028e) arrayList.remove(i);
        c1028e.f4216b.m2589r(this);
        boolean z3 = this.f4222E;
        C1110M0 c1110m0 = c1028e.f4215a;
        if (z3) {
            if (Build.VERSION.SDK_INT >= 23) {
                AbstractC1104J0.m2709b(c1110m0.f4477E, null);
            }
            c1110m0.f4477E.setAnimationStyle(0);
        }
        c1110m0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f4237u = ((C1028e) arrayList.get(size2 - 1)).f4217c;
        } else {
            this.f4237u = this.f4235s.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C1028e) arrayList.get(0)).f4216b.m2582c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC1046w interfaceC1046w = this.f4219B;
        if (interfaceC1046w != null) {
            interfaceC1046w.mo497b(menuC1035l, true);
        }
        ViewTreeObserver viewTreeObserver = this.f4220C;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f4220C.removeGlobalOnLayoutListener(this.f4230n);
            }
            this.f4220C = null;
        }
        this.f4236t.removeOnAttachStateChangeListener(this.f4231o);
        this.f4221D.onDismiss();
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: c */
    public final void mo2548c() {
        Iterator it2 = this.f4229m.iterator();
        while (it2.hasNext()) {
            ListAdapter adapter = ((C1028e) it2.next()).f4215a.f4480h.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C1032i) adapter).notifyDataSetChanged();
        }
    }

    @Override // p084n.InterfaceC1021B
    public final void dismiss() {
        ArrayList arrayList = this.f4229m;
        int size = arrayList.size();
        if (size > 0) {
            C1028e[] c1028eArr = (C1028e[]) arrayList.toArray(new C1028e[size]);
            for (int i = size - 1; i >= 0; i--) {
                C1028e c1028e = c1028eArr[i];
                if (c1028e.f4215a.f4477E.isShowing()) {
                    c1028e.f4215a.dismiss();
                }
            }
        }
    }

    @Override // p084n.InterfaceC1021B
    /* renamed from: e */
    public final C1193v0 mo2545e() {
        ArrayList arrayList = this.f4229m;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C1028e) arrayList.get(arrayList.size() - 1)).f4215a.f4480h;
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: g */
    public final boolean mo2549g(SubMenuC1023D subMenuC1023D) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Iterator it2 = this.f4229m.iterator();
        while (it2.hasNext()) {
            C1028e c1028e = (C1028e) it2.next();
            if (subMenuC1023D == c1028e.f4216b) {
                c1028e.f4215a.f4480h.requestFocus();
                return true;
            }
        }
        if (!subMenuC1023D.hasVisibleItems()) {
            return false;
        }
        mo2552l(subMenuC1023D);
        InterfaceC1046w interfaceC1046w = this.f4219B;
        if (interfaceC1046w != null) {
            interfaceC1046w.mo500h(subMenuC1023D);
        }
        return true;
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: h */
    public final boolean mo2550h() {
        return false;
    }

    @Override // p084n.InterfaceC1021B
    /* renamed from: i */
    public final void mo2546i() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (mo2544a()) {
            return;
        }
        ArrayList arrayList = this.f4228l;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m2572v((MenuC1035l) it2.next());
        }
        arrayList.clear();
        View view = this.f4235s;
        this.f4236t = view;
        if (view != null) {
            boolean z2 = this.f4220C == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f4220C = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f4230n);
            }
            this.f4236t.addOnAttachStateChangeListener(this.f4231o);
        }
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: j */
    public final void mo2551j(InterfaceC1046w interfaceC1046w) {
        this.f4219B = interfaceC1046w;
    }

    @Override // p084n.AbstractC1043t
    /* renamed from: l */
    public final void mo2552l(MenuC1035l menuC1035l) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        menuC1035l.m2581b(this, this.f4223g);
        if (mo2544a()) {
            m2572v(menuC1035l);
        } else {
            this.f4228l.add(menuC1035l);
        }
    }

    @Override // p084n.AbstractC1043t
    /* renamed from: n */
    public final void mo2553n(View view) {
        if (this.f4235s != view) {
            this.f4235s = view;
            this.f4234r = Gravity.getAbsoluteGravity(this.f4233q, view.getLayoutDirection());
        }
    }

    @Override // p084n.AbstractC1043t
    /* renamed from: o */
    public final void mo2554o(boolean z2) {
        this.f4242z = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C1028e c1028e;
        ArrayList arrayList = this.f4229m;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c1028e = null;
                break;
            }
            c1028e = (C1028e) arrayList.get(i);
            if (!c1028e.f4215a.f4477E.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c1028e != null) {
            c1028e.f4216b.m2582c(false);
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
        if (this.f4233q != i) {
            this.f4233q = i;
            this.f4234r = Gravity.getAbsoluteGravity(i, this.f4235s.getLayoutDirection());
        }
    }

    @Override // p084n.AbstractC1043t
    /* renamed from: q */
    public final void mo2556q(int i) {
        this.f4238v = true;
        this.f4240x = i;
    }

    @Override // p084n.AbstractC1043t
    /* renamed from: r */
    public final void mo2557r(PopupWindow.OnDismissListener onDismissListener) {
        this.f4221D = (C1044u) onDismissListener;
    }

    @Override // p084n.AbstractC1043t
    /* renamed from: s */
    public final void mo2558s(boolean z2) {
        this.f4218A = z2;
    }

    @Override // p084n.AbstractC1043t
    /* renamed from: t */
    public final void mo2559t(int i) {
        this.f4239w = true;
        this.f4241y = i;
    }

    /* renamed from: v */
    public final void m2572v(MenuC1035l menuC1035l) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        View childAt;
        C1028e c1028e;
        char c2;
        int i;
        int i2;
        MenuItem item;
        C1032i c1032i;
        int headersCount;
        int i3;
        int firstVisiblePosition;
        Context context = this.f4223g;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        C1032i c1032i2 = new C1032i(menuC1035l, layoutInflaterFrom, this.f4226j, R.layout.abc_cascading_menu_item_layout);
        if (!mo2544a() && this.f4242z) {
            c1032i2.f4253c = true;
        } else if (mo2544a()) {
            c1032i2.f4253c = AbstractC1043t.m2601u(menuC1035l);
        }
        int iM2600m = AbstractC1043t.m2600m(c1032i2, context, this.f4224h);
        C1110M0 c1110m0 = new C1110M0(context, null, this.f4225i);
        C1085A c1085a = c1110m0.f4477E;
        c1110m0.f4514I = this.f4232p;
        c1110m0.f4493u = this;
        c1085a.setOnDismissListener(this);
        c1110m0.f4492t = this.f4235s;
        c1110m0.f4489q = this.f4234r;
        c1110m0.f4476D = true;
        c1085a.setFocusable(true);
        c1085a.setInputMethodMode(2);
        c1110m0.mo2704n(c1032i2);
        c1110m0.m2706r(iM2600m);
        c1110m0.f4489q = this.f4234r;
        ArrayList arrayList = this.f4229m;
        if (arrayList.size() > 0) {
            c1028e = (C1028e) arrayList.get(arrayList.size() - 1);
            MenuC1035l menuC1035l2 = c1028e.f4216b;
            int size = menuC1035l2.f4263f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    item = null;
                    break;
                }
                item = menuC1035l2.getItem(i4);
                if (item.hasSubMenu() && menuC1035l == item.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (item == null) {
                childAt = null;
            } else {
                C1193v0 c1193v0 = c1028e.f4215a.f4480h;
                ListAdapter adapter = c1193v0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c1032i = (C1032i) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c1032i = (C1032i) adapter;
                    headersCount = 0;
                }
                int count = c1032i.getCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= count) {
                        i3 = -1;
                        i5 = -1;
                        break;
                    } else {
                        if (item == c1032i.getItem(i5)) {
                            i3 = -1;
                            break;
                        }
                        i5++;
                    }
                }
                childAt = (i5 != i3 && (firstVisiblePosition = (i5 + headersCount) - c1193v0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c1193v0.getChildCount()) ? c1193v0.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            childAt = null;
            c1028e = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = C1110M0.f4513J;
                if (method != null) {
                    try {
                        method.invoke(c1085a, Boolean.FALSE);
                    } catch (Exception unused) {
                    }
                }
            } else {
                AbstractC1106K0.m2721a(c1085a, false);
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 23) {
                AbstractC1104J0.m2708a(c1085a, null);
            }
            C1193v0 c1193v02 = ((C1028e) arrayList.get(arrayList.size() - 1)).f4215a.f4480h;
            int[] iArr = new int[2];
            c1193v02.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f4236t.getWindowVisibleDisplayFrame(rect);
            int i7 = (this.f4237u != 1 ? iArr[0] - iM2600m >= 0 : (c1193v02.getWidth() + iArr[0]) + iM2600m > rect.right) ? 0 : 1;
            boolean z2 = i7 == 1;
            this.f4237u = i7;
            if (i6 >= 26) {
                c1110m0.f4492t = childAt;
                i2 = 0;
                i = 0;
            } else {
                int[] iArr2 = new int[2];
                this.f4235s.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.f4234r & 7) == 5) {
                    c2 = 0;
                    iArr2[0] = this.f4235s.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                } else {
                    c2 = 0;
                }
                i = iArr3[c2] - iArr2[c2];
                i2 = iArr3[1] - iArr2[1];
            }
            c1110m0.f4483k = (this.f4234r & 5) == 5 ? z2 ? i + iM2600m : i - childAt.getWidth() : z2 ? i + childAt.getWidth() : i - iM2600m;
            c1110m0.f4488p = true;
            c1110m0.f4487o = true;
            c1110m0.m2702l(i2);
        } else {
            if (this.f4238v) {
                c1110m0.f4483k = this.f4240x;
            }
            if (this.f4239w) {
                c1110m0.m2702l(this.f4241y);
            }
            Rect rect2 = this.f4324f;
            c1110m0.f4475C = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new C1028e(c1110m0, menuC1035l, this.f4237u));
        c1110m0.mo2546i();
        C1193v0 c1193v03 = c1110m0.f4480h;
        c1193v03.setOnKeyListener(this);
        if (c1028e == null && this.f4218A && menuC1035l.f4270m != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c1193v03, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC1035l.f4270m);
            c1193v03.addHeaderView(frameLayout, null, false);
            c1110m0.mo2546i();
        }
    }
}
