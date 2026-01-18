package p032R0;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.C0513t;
import android.webkit.JavascriptInterface;
import it.deviato.spotifuck.AppSingleton;
import it.deviato.spotifuck.MainActivity;
import it.deviato.spotifuck.R;
import it.deviato.spotifuck.WebService;
import org.json.JSONException;
import org.json.JSONObject;
import p003C.RunnableC0014a;
import p030Q0.C0324A;
import p030Q0.C0354w;
import p030Q0.RunnableC0336e;

/* renamed from: R0.f */
/* loaded from: classes.dex */
public final class C0364f {
    public C0364f(Context context) {
    }

    @JavascriptInterface
    public static void deferMessage(String str) {
        MainActivity mainActivity = (MainActivity) AppSingleton.f3423g.get();
        if (mainActivity != null) {
            if (str.equals("unlock")) {
                str = mainActivity.getString(R.string.txt_unlock);
            } else if (str.equals("reload")) {
                str = mainActivity.getString(R.string.txt_reload);
            } else if (str.equals("adblock")) {
                str = mainActivity.getString(R.string.txt_adblock);
            }
            mainActivity.runOnUiThread(new RunnableC0014a(mainActivity, str));
        }
    }

    @JavascriptInterface
    public static void manageTShut(boolean z2) {
        if (!WebService.f3497t.booleanValue() || AppSingleton.f3442z <= 0 || !z2) {
            if (AppSingleton.f3420E != null) {
                AppSingleton.f3418C.removeCallbacks(AppSingleton.f3420E);
            }
        } else {
            if (AppSingleton.f3420E != null) {
                AppSingleton.f3418C.removeCallbacks(AppSingleton.f3420E);
            }
            AppSingleton.f3420E = new RunnableC0336e(1);
            AppSingleton.f3418C.postDelayed(AppSingleton.f3420E, AppSingleton.f3442z * 60000);
        }
    }

    @JavascriptInterface
    public static void manageTSleep(boolean z2) {
        if (!WebService.f3497t.booleanValue() || AppSingleton.f3416A <= 0 || !z2) {
            if (AppSingleton.f3421F != null) {
                AppSingleton.f3419D.removeCallbacks(AppSingleton.f3421F);
            }
        } else {
            if (AppSingleton.f3421F != null) {
                AppSingleton.f3419D.removeCallbacks(AppSingleton.f3421F);
            }
            AppSingleton.f3421F = new RunnableC0336e(2);
            AppSingleton.f3419D.postDelayed(AppSingleton.f3421F, AppSingleton.f3416A * 60000);
        }
    }

    @JavascriptInterface
    public static void wakeOff() {
        new Handler(Looper.getMainLooper()).post(new RunnableC0359a(2));
    }

    @JavascriptInterface
    public static void wakeUp() {
        new Handler(Looper.getMainLooper()).post(new RunnableC0359a(1));
    }

    @JavascriptInterface
    public void cssInjected() {
        AppSingleton.m2223a();
    }

    @JavascriptInterface
    public boolean isWoke() {
        return AppSingleton.f3426j.getWindowVisibility() == 0;
    }

    @JavascriptInterface
    public void loginDetected() {
        AppSingleton.f3430n = true;
        AppSingleton.f3425i.putBoolean("LoggedIn", true);
        AppSingleton.f3425i.commit();
    }

    @JavascriptInterface
    public void playLoaded() {
        AppSingleton.f3417B = true;
        AppSingleton.m2223a();
    }

    @JavascriptInterface
    public void recMediaPosition(long j2) {
        WebService.f3483A = j2;
        WebService.m2230e();
    }

    @JavascriptInterface
    public void recMediaStatus(String str) throws Resources.NotFoundException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Object objOpt = jSONObject.opt("track");
            if (objOpt != null && !JSONObject.NULL.equals(objOpt)) {
                WebService.f3501x = objOpt.toString();
                WebService.f3500w = jSONObject.optString("artist");
                WebService.f3483A = jSONObject.optLong("position");
                WebService.f3503z = jSONObject.optLong("duration");
                WebService.f3486D = jSONObject.optBoolean("playing");
                WebService.f3502y = jSONObject.optString("repeat");
                WebService.f3487E = jSONObject.optBoolean("fav");
                String strReplace = jSONObject.optString("cover").replace("00004851", "0000b273");
                WebService.f3499v = null;
                if (strReplace != null && !strReplace.isEmpty()) {
                    try {
                        C0354w c0354wM952c = C0354w.m952c();
                        c0354wM952c.getClass();
                        if (strReplace.trim().length() == 0) {
                            throw new IllegalArgumentException("Path must not be empty.");
                        }
                        WebService.f3499v = new C0324A(c0354wM952c, Uri.parse(strReplace)).m924a();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                C0513t c0513t = WebService.f3491n;
                C0513t c0513t2 = WebService.f3491n;
                C0513t c0513t3 = WebService.f3491n;
                C0513t c0513t4 = WebService.f3491n;
                C0513t c0513t5 = WebService.f3491n;
                C0513t c0513t6 = WebService.f3491n;
                C0513t c0513t7 = WebService.f3491n;
                WebService.m2231f();
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
