package p087o;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p082m.InterfaceC0978b;
import p084n.C1037n;
import p084n.C1039p;
import p084n.InterfaceC1047x;
import p084n.MenuC1035l;
import p084n.SubMenuC1023D;

/* renamed from: o.a1 */
/* loaded from: classes.dex */
public final class C1138a1 implements InterfaceC1047x {

    /* renamed from: f */
    public MenuC1035l f4584f;

    /* renamed from: g */
    public C1037n f4585g;

    /* renamed from: h */
    public final /* synthetic */ Toolbar f4586h;

    public C1138a1(Toolbar toolbar) {
        this.f4586h = toolbar;
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: c */
    public final void mo2548c() {
        if (this.f4585g != null) {
            MenuC1035l menuC1035l = this.f4584f;
            if (menuC1035l != null) {
                int size = menuC1035l.f4263f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f4584f.getItem(i) == this.f4585g) {
                        return;
                    }
                }
            }
            mo2577k(this.f4585g);
        }
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: d */
    public final boolean mo2575d(C1037n c1037n) {
        Toolbar toolbar = this.f4586h;
        toolbar.m1352c();
        ViewParent parent = toolbar.f1530m.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1530m);
            }
            toolbar.addView(toolbar.f1530m);
        }
        View actionView = c1037n.getActionView();
        toolbar.f1531n = actionView;
        this.f4585g = c1037n;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1531n);
            }
            C1141b1 c1141b1M1346h = Toolbar.m1346h();
            c1141b1M1346h.f4589a = (toolbar.f1536s & 112) | 8388611;
            c1141b1M1346h.f4590b = 2;
            toolbar.f1531n.setLayoutParams(c1141b1M1346h);
            toolbar.addView(toolbar.f1531n);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C1141b1) childAt.getLayoutParams()).f4590b != 2 && childAt != toolbar.f1523f) {
                toolbar.removeViewAt(childCount);
                toolbar.f1510J.add(childAt);
            }
        }
        toolbar.requestLayout();
        c1037n.f4287C = true;
        c1037n.f4301n.m2587p(false);
        KeyEvent.Callback callback = toolbar.f1531n;
        if (callback instanceof InterfaceC0978b) {
            ((C1039p) ((InterfaceC0978b) callback)).f4317f.onActionViewExpanded();
        }
        toolbar.m1366u();
        return true;
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: f */
    public final void mo2576f(Context context, MenuC1035l menuC1035l) {
        C1037n c1037n;
        MenuC1035l menuC1035l2 = this.f4584f;
        if (menuC1035l2 != null && (c1037n = this.f4585g) != null) {
            menuC1035l2.mo2560d(c1037n);
        }
        this.f4584f = menuC1035l;
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: g */
    public final boolean mo2549g(SubMenuC1023D subMenuC1023D) {
        return false;
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: h */
    public final boolean mo2550h() {
        return false;
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: k */
    public final boolean mo2577k(C1037n c1037n) {
        Toolbar toolbar = this.f4586h;
        KeyEvent.Callback callback = toolbar.f1531n;
        if (callback instanceof InterfaceC0978b) {
            ((C1039p) ((InterfaceC0978b) callback)).f4317f.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f1531n);
        toolbar.removeView(toolbar.f1530m);
        toolbar.f1531n = null;
        ArrayList arrayList = toolbar.f1510J;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f4585g = null;
        toolbar.requestLayout();
        c1037n.f4287C = false;
        c1037n.f4301n.m2587p(false);
        toolbar.m1366u();
        return true;
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: b */
    public final void mo2547b(MenuC1035l menuC1035l, boolean z2) {
    }
}
