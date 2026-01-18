package p008E0;

import android.view.View;
import java.util.WeakHashMap;
import p023N.AbstractC0193D;
import p023N.AbstractC0206Q;

/* renamed from: E0.n */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0080n implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        AbstractC0193D.m594c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
