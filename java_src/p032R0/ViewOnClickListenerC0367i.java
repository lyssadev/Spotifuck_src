package p032R0;

import android.content.Intent;
import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.Preference;
import com.google.android.material.datepicker.C0684j;
import it.deviato.spotifuck.AppSingleton;
import it.deviato.spotifuck.MainActivity;
import it.deviato.spotifuck.R;
import it.deviato.spotifuck.WebService;
import p068h.C0837h;
import p082m.AbstractC0977a;
import p084n.C1037n;
import p087o.C1138a1;
import p091p0.AbstractC1230a;

/* renamed from: R0.i */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0367i implements View.OnClickListener {

    /* renamed from: f */
    public final /* synthetic */ int f951f;

    /* renamed from: g */
    public final /* synthetic */ Object f952g;

    public /* synthetic */ ViewOnClickListenerC0367i(int i, Object obj) {
        this.f951f = i;
        this.f952g = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        switch (this.f951f) {
            case 0:
                boolean zIsChecked = MainActivity.f3450L.isChecked();
                MainActivity mainActivity = (MainActivity) this.f952g;
                if (zIsChecked) {
                    AppSingleton.f3429m = true;
                    AppSingleton.f3425i.putBoolean("ServiceOn", true);
                    AppSingleton.f3425i.commit();
                    AbstractC1230a.m2867G0(AppSingleton.f3422f, MainActivity.f3452N);
                    mainActivity.m2228s();
                } else {
                    AppSingleton.f3429m = false;
                    AppSingleton.f3425i.putBoolean("ServiceOn", false);
                    AppSingleton.f3425i.commit();
                    mainActivity.getClass();
                    MainActivity.f3446H.setText(R.string.txt_servicenr);
                    MainActivity.f3445G.removeView(MainActivity.f3449K);
                    mainActivity.startService(new Intent(AppSingleton.f3422f, (Class<?>) WebService.class).setAction("STOP_SERVICE"));
                }
                mainActivity.getClass();
                MainActivity.m2227u();
                break;
            case 1:
                C0684j c0684j = (C0684j) this.f952g;
                int i = c0684j.f2431d0;
                if (i != 2) {
                    if (i == 1) {
                        c0684j.m1894L(2);
                        break;
                    }
                } else {
                    c0684j.m1894L(1);
                    break;
                }
                break;
            case 2:
                ((Preference) this.f952g).mo1637r(view);
                break;
            case 3:
                C0837h c0837h = (C0837h) this.f952g;
                Message messageObtain = (view != c0837h.f3261i || (message3 = c0837h.f3263k) == null) ? (view != c0837h.f3264l || (message2 = c0837h.f3266n) == null) ? (view != c0837h.f3267o || (message = c0837h.f3269q) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                c0837h.f3251F.obtainMessage(1, c0837h.f3254b).sendToTarget();
                break;
            case 4:
                ((AbstractC0977a) this.f952g).mo2091a();
                break;
            default:
                C1138a1 c1138a1 = ((Toolbar) this.f952g).f1517Q;
                C1037n c1037n = c1138a1 == null ? null : c1138a1.f4585g;
                if (c1037n != null) {
                    c1037n.collapseActionView();
                    break;
                }
                break;
        }
    }
}
