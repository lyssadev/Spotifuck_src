package p024N0;

import android.view.View;
import android.widget.AdapterView;
import p087o.C1100H0;
import p087o.C1111N;
import p087o.C1117Q;

/* renamed from: N0.v */
/* loaded from: classes.dex */
public final class C0294v implements AdapterView.OnItemClickListener {

    /* renamed from: f */
    public final /* synthetic */ int f782f;

    /* renamed from: g */
    public final /* synthetic */ Object f783g;

    public /* synthetic */ C0294v(int i, Object obj) {
        this.f782f = i;
        this.f783g = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        Object item;
        switch (this.f782f) {
            case 0:
                C0296x c0296x = (C0296x) this.f783g;
                if (i < 0) {
                    C1100H0 c1100h0 = c0296x.f787j;
                    item = !c1100h0.f4477E.isShowing() ? null : c1100h0.f4480h.getSelectedItem();
                } else {
                    item = c0296x.getAdapter().getItem(i);
                }
                C0296x.m861a(c0296x, item);
                AdapterView.OnItemClickListener onItemClickListener = c0296x.getOnItemClickListener();
                C1100H0 c1100h02 = c0296x.f787j;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = c1100h02.f4477E.isShowing() ? c1100h02.f4480h.getSelectedView() : null;
                        i = !c1100h02.f4477E.isShowing() ? -1 : c1100h02.f4480h.getSelectedItemPosition();
                        j2 = !c1100h02.f4477E.isShowing() ? Long.MIN_VALUE : c1100h02.f4480h.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c1100h02.f4480h, view, i, j2);
                }
                c1100h02.dismiss();
                break;
            default:
                C1111N c1111n = (C1111N) this.f783g;
                c1111n.f4519M.setSelection(i);
                C1117Q c1117q = c1111n.f4519M;
                if (c1117q.getOnItemClickListener() != null) {
                    c1117q.performItemClick(view, i, c1111n.f4516J.getItemId(i));
                }
                c1111n.dismiss();
                break;
        }
    }
}
