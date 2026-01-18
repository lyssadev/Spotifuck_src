package p030Q0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.fragment.app.AbstractC0595g;
import p098r1.C1268h;

/* renamed from: Q0.l */
/* loaded from: classes.dex */
public final class C0343l extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ int f899a = 0;

    /* renamed from: b */
    public final Object f900b;

    public C0343l(C0344m c0344m) {
        this.f900b = c0344m;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Object obj = this.f900b;
        switch (this.f899a) {
            case 0:
                if (intent != null) {
                    String action = intent.getAction();
                    C0344m c0344m = (C0344m) obj;
                    if (!"android.intent.action.AIRPLANE_MODE".equals(action)) {
                        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                            C1268h c1268h = AbstractC0331H.f862a;
                            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                            HandlerC0341j handlerC0341j = c0344m.f908h;
                            handlerC0341j.sendMessage(handlerC0341j.obtainMessage(9, activeNetworkInfo));
                            break;
                        }
                    } else if (intent.hasExtra("state")) {
                        boolean booleanExtra = intent.getBooleanExtra("state", false);
                        HandlerC0341j handlerC0341j2 = c0344m.f908h;
                        handlerC0341j2.sendMessage(handlerC0341j2.obtainMessage(10, booleanExtra ? 1 : 0, 0));
                        break;
                    }
                }
                break;
            default:
                ((AbstractC0595g) obj).mo1554h();
                break;
        }
    }

    public C0343l(AbstractC0595g abstractC0595g) {
        this.f900b = abstractC0595g;
    }
}
