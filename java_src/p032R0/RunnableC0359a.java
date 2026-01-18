package p032R0;

import android.content.Context;
import it.deviato.spotifuck.AppSingleton;
import it.deviato.spotifuck.MainActivity;

/* renamed from: R0.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0359a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f941a;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f941a) {
            case 0:
                Context context = AppSingleton.f3422f;
                MainActivity.m2227u();
                break;
            case 1:
                AppSingleton.f3426j.dispatchWindowVisibilityChanged(0);
                break;
            case 2:
                AppSingleton.f3426j.dispatchWindowVisibilityChanged(8);
                break;
            case 3:
                MainActivity.f3450L.performClick();
                break;
            case 4:
                MainActivity.f3450L.performClick();
                break;
            case 5:
                MainActivity.f3454P = false;
                break;
            default:
                MainActivity.f3451M.setVisibility(4);
                MainActivity.f3448J.setVisibility(8);
                break;
        }
    }

    public /* synthetic */ RunnableC0359a(MainActivity mainActivity, int i) {
        this.f941a = i;
    }
}
