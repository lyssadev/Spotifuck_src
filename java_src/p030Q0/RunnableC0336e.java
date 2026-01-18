package p030Q0;

import android.os.Trace;
import android.support.v4.media.session.C0513t;
import androidx.emoji2.text.C0555j;
import it.deviato.spotifuck.AppSingleton;
import it.deviato.spotifuck.MainActivity;
import it.deviato.spotifuck.R;
import it.deviato.spotifuck.WebService;
import p015J.AbstractC0126k;
import p032R0.C0364f;
import p032R0.RunnableC0359a;

/* renamed from: Q0.e */
/* loaded from: classes.dex */
public final class RunnableC0336e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f868a;

    public /* synthetic */ RunnableC0336e(int i) {
        this.f868a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f868a) {
            case 0:
                throw null;
            case 1:
                MainActivity mainActivity = (MainActivity) AppSingleton.f3423g.get();
                C0364f.deferMessage(mainActivity.getString(R.string.menu_autoshut));
                mainActivity.runOnUiThread(new RunnableC0359a(mainActivity, 3));
                C0513t c0513t = WebService.f3491n;
                AppSingleton.m2223a();
                return;
            case 2:
                MainActivity mainActivity2 = (MainActivity) AppSingleton.f3423g.get();
                C0364f.deferMessage(mainActivity2.getString(R.string.menu_autosleep));
                mainActivity2.runOnUiThread(new RunnableC0359a(mainActivity2, 4));
                AppSingleton.f3416A = 0;
                AppSingleton.f3425i.putString("AutoSleep", "0");
                AppSingleton.f3425i.commit();
                C0513t c0513t2 = WebService.f3491n;
                AppSingleton.m2223a();
                return;
            default:
                try {
                    int i = AbstractC0126k.f327a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (C0555j.f1650k != null) {
                        C0555j.m1436a().m1438c();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i2 = AbstractC0126k.f327a;
                    Trace.endSection();
                    throw th;
                }
        }
    }
}
