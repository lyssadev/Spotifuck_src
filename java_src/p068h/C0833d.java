package p068h;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: h.d */
/* loaded from: classes.dex */
public final class C0833d implements AdapterView.OnItemClickListener {

    /* renamed from: f */
    public final /* synthetic */ C0837h f3221f;

    /* renamed from: g */
    public final /* synthetic */ C0835f f3222g;

    public C0833d(C0835f c0835f, C0837h c0837h) {
        this.f3222g = c0835f;
        this.f3221f = c0837h;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        C0835f c0835f = this.f3222g;
        DialogInterface.OnClickListener onClickListener = c0835f.f3239n;
        C0837h c0837h = this.f3221f;
        onClickListener.onClick(c0837h.f3254b, i);
        if (c0835f.f3243r) {
            return;
        }
        c0837h.f3254b.dismiss();
    }
}
