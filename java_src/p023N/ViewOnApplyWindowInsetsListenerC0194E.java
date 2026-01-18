package p023N;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* renamed from: N.E */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0194E implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public C0260w0 f552a = null;

    /* renamed from: b */
    public final /* synthetic */ View f553b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC0249r f554c;

    public ViewOnApplyWindowInsetsListenerC0194E(View view, InterfaceC0249r interfaceC0249r) {
        this.f553b = view;
        this.f554c = interfaceC0249r;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C0260w0 c0260w0M800g = C0260w0.m800g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC0249r interfaceC0249r = this.f554c;
        if (i < 30) {
            AbstractC0195F.m595a(windowInsets, this.f553b);
            if (c0260w0M800g.equals(this.f552a)) {
                return interfaceC0249r.mo47l(view, c0260w0M800g).m805f();
            }
        }
        this.f552a = c0260w0M800g;
        C0260w0 c0260w0Mo47l = interfaceC0249r.mo47l(view, c0260w0M800g);
        if (i >= 30) {
            return c0260w0Mo47l.m805f();
        }
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        AbstractC0193D.m594c(view);
        return c0260w0Mo47l.m805f();
    }
}
