package androidx.activity;

import p047Z0.AbstractC0469c;
import p068h.AbstractActivityC0841l;

/* renamed from: androidx.activity.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0522d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1266a;

    /* renamed from: b */
    public final /* synthetic */ AbstractActivityC0841l f1267b;

    public /* synthetic */ RunnableC0522d(AbstractActivityC0841l abstractActivityC0841l, int i) {
        this.f1266a = i;
        this.f1267b = abstractActivityC0841l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1266a) {
            case 0:
                this.f1267b.invalidateOptionsMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!AbstractC0469c.m1098a(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e2) {
                    if (!AbstractC0469c.m1098a(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
        }
    }
}
