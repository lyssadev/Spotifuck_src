package p068h;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: h.e */
/* loaded from: classes.dex */
public final class C0834e implements AdapterView.OnItemClickListener {

    /* renamed from: f */
    public final /* synthetic */ AlertController$RecycleListView f3223f;

    /* renamed from: g */
    public final /* synthetic */ C0837h f3224g;

    /* renamed from: h */
    public final /* synthetic */ C0835f f3225h;

    public C0834e(C0835f c0835f, AlertController$RecycleListView alertController$RecycleListView, C0837h c0837h) {
        this.f3225h = c0835f;
        this.f3223f = alertController$RecycleListView;
        this.f3224g = c0837h;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        C0835f c0835f = this.f3225h;
        boolean[] zArr = c0835f.f3241p;
        AlertController$RecycleListView alertController$RecycleListView = this.f3223f;
        if (zArr != null) {
            zArr[i] = alertController$RecycleListView.isItemChecked(i);
        }
        c0835f.f3245t.onClick(this.f3224g.f3254b, i, alertController$RecycleListView.isItemChecked(i));
    }
}
