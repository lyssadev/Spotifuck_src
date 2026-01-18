package p087o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import it.deviato.spotifuck.R;
import java.util.ArrayList;
import p074j0.C0944w;
import p084n.AbstractC1043t;
import p084n.ActionProviderVisibilityListenerC1038o;
import p084n.C1037n;
import p084n.InterfaceC1046w;
import p084n.InterfaceC1047x;
import p084n.InterfaceC1048y;
import p084n.InterfaceC1049z;
import p084n.MenuC1035l;
import p084n.SubMenuC1023D;

/* renamed from: o.k */
/* loaded from: classes.dex */
public final class C1166k implements InterfaceC1047x {

    /* renamed from: A */
    public C1157h f4663A;

    /* renamed from: f */
    public final Context f4665f;

    /* renamed from: g */
    public Context f4666g;

    /* renamed from: h */
    public MenuC1035l f4667h;

    /* renamed from: i */
    public final LayoutInflater f4668i;

    /* renamed from: j */
    public InterfaceC1046w f4669j;

    /* renamed from: m */
    public InterfaceC1049z f4672m;

    /* renamed from: n */
    public C1163j f4673n;

    /* renamed from: o */
    public Drawable f4674o;

    /* renamed from: p */
    public boolean f4675p;

    /* renamed from: q */
    public boolean f4676q;

    /* renamed from: r */
    public boolean f4677r;

    /* renamed from: s */
    public int f4678s;

    /* renamed from: t */
    public int f4679t;

    /* renamed from: u */
    public int f4680u;

    /* renamed from: v */
    public boolean f4681v;

    /* renamed from: x */
    public C1154g f4683x;

    /* renamed from: y */
    public C1154g f4684y;

    /* renamed from: z */
    public RunnableC1160i f4685z;

    /* renamed from: k */
    public final int f4670k = R.layout.abc_action_menu_layout;

    /* renamed from: l */
    public final int f4671l = R.layout.abc_action_menu_item_layout;

    /* renamed from: w */
    public final SparseBooleanArray f4682w = new SparseBooleanArray();

    /* renamed from: B */
    public final C0944w f4664B = new C0944w(this);

    public C1166k(Context context) {
        this.f4665f = context;
        this.f4668i = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [n.y] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* renamed from: a */
    public final View m2797a(C1037n c1037n, View view, ViewGroup viewGroup) {
        View actionView = c1037n.getActionView();
        if (actionView == null || c1037n.m2597e()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC1048y ? (InterfaceC1048y) view : (InterfaceC1048y) this.f4668i.inflate(this.f4671l, viewGroup, false);
            actionMenuItemView.mo1313a(c1037n);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f4672m);
            if (this.f4663A == null) {
                this.f4663A = new C1157h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f4663A);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c1037n.f4287C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C1172m)) {
            actionView.setLayoutParams(ActionMenuView.m1336k(layoutParams));
        }
        return actionView;
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: b */
    public final void mo2547b(MenuC1035l menuC1035l, boolean z2) {
        m2798e();
        C1154g c1154g = this.f4684y;
        if (c1154g != null && c1154g.m2603b()) {
            c1154g.f4334i.dismiss();
        }
        InterfaceC1046w interfaceC1046w = this.f4669j;
        if (interfaceC1046w != null) {
            interfaceC1046w.mo497b(menuC1035l, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p084n.InterfaceC1047x
    /* renamed from: c */
    public final void mo2548c() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f4672m;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            MenuC1035l menuC1035l = this.f4667h;
            if (menuC1035l != null) {
                menuC1035l.m2585i();
                ArrayList arrayListM2586l = this.f4667h.m2586l();
                int size = arrayListM2586l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C1037n c1037n = (C1037n) arrayListM2586l.get(i2);
                    if (c1037n.m2598f()) {
                        View childAt = viewGroup.getChildAt(i);
                        C1037n itemData = childAt instanceof InterfaceC1048y ? ((InterfaceC1048y) childAt).getItemData() : null;
                        View viewM2797a = m2797a(c1037n, childAt, viewGroup);
                        if (c1037n != itemData) {
                            viewM2797a.setPressed(false);
                            viewM2797a.jumpDrawablesToCurrentState();
                        }
                        if (viewM2797a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewM2797a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewM2797a);
                            }
                            ((ViewGroup) this.f4672m).addView(viewM2797a, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f4673n) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f4672m).requestLayout();
        MenuC1035l menuC1035l2 = this.f4667h;
        if (menuC1035l2 != null) {
            menuC1035l2.m2585i();
            ArrayList arrayList2 = menuC1035l2.f4266i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC1038o actionProviderVisibilityListenerC1038o = ((C1037n) arrayList2.get(i3)).f4285A;
            }
        }
        MenuC1035l menuC1035l3 = this.f4667h;
        if (menuC1035l3 != null) {
            menuC1035l3.m2585i();
            arrayList = menuC1035l3.f4267j;
        }
        if (this.f4676q && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((C1037n) arrayList.get(0)).f4287C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f4673n == null) {
                this.f4673n = new C1163j(this, this.f4665f);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f4673n.getParent();
            if (viewGroup3 != this.f4672m) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f4673n);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f4672m;
                C1163j c1163j = this.f4673n;
                actionMenuView.getClass();
                C1172m c1172mM1335j = ActionMenuView.m1335j();
                c1172mM1335j.f4687a = true;
                actionMenuView.addView(c1163j, c1172mM1335j);
            }
        } else {
            C1163j c1163j2 = this.f4673n;
            if (c1163j2 != null) {
                Object parent = c1163j2.getParent();
                Object obj = this.f4672m;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f4673n);
                }
            }
        }
        ((ActionMenuView) this.f4672m).setOverflowReserved(this.f4676q);
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: d */
    public final boolean mo2575d(C1037n c1037n) {
        return false;
    }

    /* renamed from: e */
    public final boolean m2798e() {
        Object obj;
        RunnableC1160i runnableC1160i = this.f4685z;
        if (runnableC1160i != null && (obj = this.f4672m) != null) {
            ((View) obj).removeCallbacks(runnableC1160i);
            this.f4685z = null;
            return true;
        }
        C1154g c1154g = this.f4683x;
        if (c1154g == null) {
            return false;
        }
        if (c1154g.m2603b()) {
            c1154g.f4334i.dismiss();
        }
        return true;
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: f */
    public final void mo2576f(Context context, MenuC1035l menuC1035l) {
        this.f4666g = context;
        LayoutInflater.from(context);
        this.f4667h = menuC1035l;
        Resources resources = context.getResources();
        if (!this.f4677r) {
            this.f4676q = true;
        }
        int i = 2;
        this.f4678s = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f4680u = i;
        int measuredWidth = this.f4678s;
        if (this.f4676q) {
            if (this.f4673n == null) {
                C1163j c1163j = new C1163j(this, this.f4665f);
                this.f4673n = c1163j;
                if (this.f4675p) {
                    c1163j.setImageDrawable(this.f4674o);
                    this.f4674o = null;
                    this.f4675p = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f4673n.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f4673n.getMeasuredWidth();
        } else {
            this.f4673n = null;
        }
        this.f4679t = measuredWidth;
        float f2 = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p084n.InterfaceC1047x
    /* renamed from: g */
    public final boolean mo2549g(SubMenuC1023D subMenuC1023D) {
        boolean z2;
        if (!subMenuC1023D.hasVisibleItems()) {
            return false;
        }
        SubMenuC1023D subMenuC1023D2 = subMenuC1023D;
        while (true) {
            MenuC1035l menuC1035l = subMenuC1023D2.f4194z;
            if (menuC1035l == this.f4667h) {
                break;
            }
            subMenuC1023D2 = (SubMenuC1023D) menuC1035l;
        }
        ViewGroup viewGroup = (ViewGroup) this.f4672m;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof InterfaceC1048y) && ((InterfaceC1048y) childAt).getItemData() == subMenuC1023D2.f4193A) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC1023D.f4193A.getClass();
        int size = subMenuC1023D.f4263f.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z2 = false;
                break;
            }
            MenuItem item = subMenuC1023D.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i2++;
        }
        C1154g c1154g = new C1154g(this, this.f4666g, subMenuC1023D, view);
        this.f4684y = c1154g;
        c1154g.f4332g = z2;
        AbstractC1043t abstractC1043t = c1154g.f4334i;
        if (abstractC1043t != null) {
            abstractC1043t.mo2554o(z2);
        }
        C1154g c1154g2 = this.f4684y;
        if (!c1154g2.m2603b()) {
            if (c1154g2.f4330e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c1154g2.m2605d(0, 0, false, false);
        }
        InterfaceC1046w interfaceC1046w = this.f4669j;
        if (interfaceC1046w != null) {
            interfaceC1046w.mo500h(subMenuC1023D);
        }
        return true;
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: h */
    public final boolean mo2550h() {
        ArrayList arrayListM2586l;
        int size;
        int i;
        boolean z2;
        MenuC1035l menuC1035l = this.f4667h;
        if (menuC1035l != null) {
            arrayListM2586l = menuC1035l.m2586l();
            size = arrayListM2586l.size();
        } else {
            arrayListM2586l = null;
            size = 0;
        }
        int i2 = this.f4680u;
        int i3 = this.f4679t;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f4672m;
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z2 = true;
            if (i4 >= size) {
                break;
            }
            C1037n c1037n = (C1037n) arrayListM2586l.get(i4);
            int i7 = c1037n.f4312y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z3 = true;
            }
            if (this.f4681v && c1037n.f4287C) {
                i2 = 0;
            }
            i4++;
        }
        if (this.f4676q && (z3 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = this.f4682w;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            C1037n c1037n2 = (C1037n) arrayListM2586l.get(i9);
            int i11 = c1037n2.f4312y;
            boolean z4 = (i11 & 2) == i;
            int i12 = c1037n2.f4289b;
            if (z4) {
                View viewM2797a = m2797a(c1037n2, null, viewGroup);
                viewM2797a.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewM2797a.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z2);
                }
                c1037n2.m2599g(z2);
            } else if ((i11 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i12);
                boolean z6 = (i8 > 0 || z5) && i3 > 0;
                if (z6) {
                    View viewM2797a2 = m2797a(c1037n2, null, viewGroup);
                    viewM2797a2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewM2797a2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i10 == 0) {
                        i10 = measuredWidth2;
                    }
                    z6 &= i3 + i10 > 0;
                }
                if (z6 && i12 != 0) {
                    sparseBooleanArray.put(i12, true);
                } else if (z5) {
                    sparseBooleanArray.put(i12, false);
                    for (int i13 = 0; i13 < i9; i13++) {
                        C1037n c1037n3 = (C1037n) arrayListM2586l.get(i13);
                        if (c1037n3.f4289b == i12) {
                            if (c1037n3.m2598f()) {
                                i8++;
                            }
                            c1037n3.m2599g(false);
                        }
                    }
                }
                if (z6) {
                    i8--;
                }
                c1037n2.m2599g(z6);
            } else {
                c1037n2.m2599g(false);
                i9++;
                i = 2;
                z2 = true;
            }
            i9++;
            i = 2;
            z2 = true;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean m2799i() {
        C1154g c1154g = this.f4683x;
        return c1154g != null && c1154g.m2603b();
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: j */
    public final void mo2551j(InterfaceC1046w interfaceC1046w) {
        throw null;
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: k */
    public final boolean mo2577k(C1037n c1037n) {
        return false;
    }

    /* renamed from: l */
    public final boolean m2800l() {
        MenuC1035l menuC1035l;
        if (!this.f4676q || m2799i() || (menuC1035l = this.f4667h) == null || this.f4672m == null || this.f4685z != null) {
            return false;
        }
        menuC1035l.m2585i();
        if (menuC1035l.f4267j.isEmpty()) {
            return false;
        }
        RunnableC1160i runnableC1160i = new RunnableC1160i(this, new C1154g(this, this.f4666g, this.f4667h, this.f4673n));
        this.f4685z = runnableC1160i;
        ((View) this.f4672m).post(runnableC1160i);
        return true;
    }
}
