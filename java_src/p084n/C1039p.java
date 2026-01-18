package p084n;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import p082m.InterfaceC0978b;

/* renamed from: n.p */
/* loaded from: classes.dex */
public final class C1039p extends FrameLayout implements InterfaceC0978b {

    /* renamed from: f */
    public final CollapsibleActionView f4317f;

    /* JADX WARN: Multi-variable type inference failed */
    public C1039p(View view) {
        super(view.getContext());
        this.f4317f = (CollapsibleActionView) view;
        addView(view);
    }
}
