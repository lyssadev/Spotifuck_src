package p084n;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import it.deviato.spotifuck.R;
import java.util.ArrayList;

/* renamed from: n.g */
/* loaded from: classes.dex */
public final class C1030g extends BaseAdapter {

    /* renamed from: a */
    public int f4243a = -1;

    /* renamed from: b */
    public final /* synthetic */ C1031h f4244b;

    public C1030g(C1031h c1031h) {
        this.f4244b = c1031h;
        m2573a();
    }

    /* renamed from: a */
    public final void m2573a() {
        MenuC1035l menuC1035l = this.f4244b.f4247h;
        C1037n c1037n = menuC1035l.f4279v;
        if (c1037n != null) {
            menuC1035l.m2585i();
            ArrayList arrayList = menuC1035l.f4267j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C1037n) arrayList.get(i)) == c1037n) {
                    this.f4243a = i;
                    return;
                }
            }
        }
        this.f4243a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1037n getItem(int i) {
        C1031h c1031h = this.f4244b;
        MenuC1035l menuC1035l = c1031h.f4247h;
        menuC1035l.m2585i();
        ArrayList arrayList = menuC1035l.f4267j;
        c1031h.getClass();
        int i2 = this.f4243a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C1037n) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C1031h c1031h = this.f4244b;
        MenuC1035l menuC1035l = c1031h.f4247h;
        menuC1035l.m2585i();
        int size = menuC1035l.f4267j.size();
        c1031h.getClass();
        return this.f4243a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f4244b.f4246g.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC1048y) view).mo1313a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m2573a();
        super.notifyDataSetChanged();
    }
}
