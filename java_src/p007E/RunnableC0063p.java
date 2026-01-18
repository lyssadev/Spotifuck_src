package p007E;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: E.p */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0063p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f132a;

    /* renamed from: b */
    public final /* synthetic */ int f133b;

    /* renamed from: c */
    public final /* synthetic */ Object f134c;

    public /* synthetic */ RunnableC0063p(int i, int i2, Object obj) {
        this.f132a = i2;
        this.f134c = obj;
        this.f133b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f132a) {
            case 0:
                ((AbstractC0049b) this.f134c).mo242i(this.f133b);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f134c;
                View view = (View) sideSheetBehavior.f2524p.get();
                if (view != null) {
                    sideSheetBehavior.m1915t(view, this.f133b, false);
                    break;
                }
                break;
        }
    }
}
