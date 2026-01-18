package p068h;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: h.c */
/* loaded from: classes.dex */
public final class C0832c extends ArrayAdapter {

    /* renamed from: a */
    public final /* synthetic */ AlertController$RecycleListView f3219a;

    /* renamed from: b */
    public final /* synthetic */ C0835f f3220b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0832c(C0835f c0835f, ContextThemeWrapper contextThemeWrapper, int i, CharSequence[] charSequenceArr, AlertController$RecycleListView alertController$RecycleListView) {
        super(contextThemeWrapper, i, R.id.text1, charSequenceArr);
        this.f3220b = c0835f;
        this.f3219a = alertController$RecycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.f3220b.f3241p;
        if (zArr != null && zArr[i]) {
            this.f3219a.setItemChecked(i, true);
        }
        return view2;
    }
}
