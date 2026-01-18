package p084n;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: n.i */
/* loaded from: classes.dex */
public final class C1032i extends BaseAdapter {

    /* renamed from: a */
    public final MenuC1035l f4251a;

    /* renamed from: b */
    public int f4252b = -1;

    /* renamed from: c */
    public boolean f4253c;

    /* renamed from: d */
    public final boolean f4254d;

    /* renamed from: e */
    public final LayoutInflater f4255e;

    /* renamed from: f */
    public final int f4256f;

    public C1032i(MenuC1035l menuC1035l, LayoutInflater layoutInflater, boolean z2, int i) {
        this.f4254d = z2;
        this.f4255e = layoutInflater;
        this.f4251a = menuC1035l;
        this.f4256f = i;
        m2578a();
    }

    /* renamed from: a */
    public final void m2578a() {
        MenuC1035l menuC1035l = this.f4251a;
        C1037n c1037n = menuC1035l.f4279v;
        if (c1037n != null) {
            menuC1035l.m2585i();
            ArrayList arrayList = menuC1035l.f4267j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C1037n) arrayList.get(i)) == c1037n) {
                    this.f4252b = i;
                    return;
                }
            }
        }
        this.f4252b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1037n getItem(int i) {
        ArrayList arrayListM2586l;
        MenuC1035l menuC1035l = this.f4251a;
        if (this.f4254d) {
            menuC1035l.m2585i();
            arrayListM2586l = menuC1035l.f4267j;
        } else {
            arrayListM2586l = menuC1035l.m2586l();
        }
        int i2 = this.f4252b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C1037n) arrayListM2586l.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListM2586l;
        MenuC1035l menuC1035l = this.f4251a;
        if (this.f4254d) {
            menuC1035l.m2585i();
            arrayListM2586l = menuC1035l.f4267j;
        } else {
            arrayListM2586l = menuC1035l.m2586l();
        }
        return this.f4252b < 0 ? arrayListM2586l.size() : arrayListM2586l.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f4255e.inflate(this.f4256f, viewGroup, false);
        }
        int i2 = getItem(i).f4289b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f4289b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f4251a.mo2565m() && i2 != i4) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        InterfaceC1048y interfaceC1048y = (InterfaceC1048y) view;
        if (this.f4253c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC1048y.mo1313a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m2578a();
        super.notifyDataSetChanged();
    }
}
