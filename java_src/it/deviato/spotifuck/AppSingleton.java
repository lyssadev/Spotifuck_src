package it.deviato.spotifuck;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import p030Q0.RunnableC0336e;
import p032R0.C0361c;
import p032R0.C0362d;
import p032R0.C0363e;
import p032R0.C0364f;
import p032R0.RunnableC0359a;

/* loaded from: classes.dex */
public class AppSingleton extends Application {

    /* renamed from: A */
    public static int f3416A = 0;

    /* renamed from: B */
    public static boolean f3417B = false;

    /* renamed from: C */
    public static final Handler f3418C = new Handler(Looper.getMainLooper());

    /* renamed from: D */
    public static final Handler f3419D = new Handler(Looper.getMainLooper());

    /* renamed from: E */
    public static RunnableC0336e f3420E;

    /* renamed from: F */
    public static RunnableC0336e f3421F;

    /* renamed from: f */
    public static Context f3422f;

    /* renamed from: g */
    public static WeakReference f3423g;

    /* renamed from: h */
    public static SharedPreferences f3424h;

    /* renamed from: i */
    public static SharedPreferences.Editor f3425i;

    /* renamed from: j */
    public static C0361c f3426j;

    /* renamed from: k */
    public static String f3427k;

    /* renamed from: l */
    public static String f3428l;

    /* renamed from: m */
    public static boolean f3429m;

    /* renamed from: n */
    public static boolean f3430n;

    /* renamed from: o */
    public static boolean f3431o;

    /* renamed from: p */
    public static boolean f3432p;

    /* renamed from: q */
    public static boolean f3433q;

    /* renamed from: r */
    public static boolean f3434r;

    /* renamed from: s */
    public static boolean f3435s;

    /* renamed from: t */
    public static boolean f3436t;

    /* renamed from: u */
    public static boolean f3437u;

    /* renamed from: v */
    public static boolean f3438v;

    /* renamed from: w */
    public static boolean f3439w;

    /* renamed from: x */
    public static boolean f3440x;

    /* renamed from: y */
    public static boolean f3441y;

    /* renamed from: z */
    public static int f3442z;

    /* renamed from: a */
    public static void m2223a() {
        MainActivity mainActivity = (MainActivity) f3423g.get();
        if (mainActivity != null) {
            mainActivity.runOnUiThread(new RunnableC0359a(mainActivity, 0));
        }
    }

    /* renamed from: b */
    public static WebView m2224b() {
        if (f3426j == null) {
            C0361c c0361c = new C0361c(f3422f);
            f3426j = c0361c;
            WebSettings settings = c0361c.getSettings();
            settings.setUserAgentString("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
            settings.setJavaScriptEnabled(true);
            settings.setSupportMultipleWindows(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setDomStorageEnabled(true);
            settings.setDatabaseEnabled(true);
            settings.setMediaPlaybackRequiresUserGesture(false);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            settings.setSupportZoom(true);
            f3426j.setInitialScale(100);
            f3426j.setBackgroundColor(-12303292);
            f3426j.addJavascriptInterface(new C0364f(f3422f), "AndBridge");
            f3426j.setWebChromeClient(new C0362d());
            f3426j.setWebViewClient(new C0363e());
            if (!f3417B) {
                if (f3430n) {
                    f3426j.loadUrl("https://open.spotify.com/");
                } else {
                    f3426j.loadUrl("https://accounts.spotify.com/login");
                }
            }
        }
        return f3426j;
    }

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        f3422f = getApplicationContext();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        f3424h = defaultSharedPreferences;
        f3425i = defaultSharedPreferences.edit();
        f3429m = f3424h.getBoolean("ServiceOn", true);
        f3430n = f3424h.getBoolean("LoggedIn", false);
        f3427k = f3424h.getString("APlayMode", "disabled");
        f3432p = f3424h.getBoolean("CloseNowPlay", false);
        f3431o = f3424h.getBoolean("TakeControl", true);
        f3428l = f3424h.getString("GuiMode", "csshack");
        f3433q = f3424h.getBoolean("Amoled", false);
        f3434r = f3424h.getBoolean("AndAuto", true);
        f3435s = f3424h.getBoolean("SwipeStop", true);
        f3442z = Integer.parseInt(f3424h.getString("AutoShut", "0"));
        f3416A = Integer.parseInt(f3424h.getString("AutoSleep", "0"));
        f3436t = f3424h.getBoolean("ForcePortrait", false);
        f3437u = f3424h.getBoolean("ForceEn", false);
        f3438v = f3424h.getBoolean("HPAP", false);
        f3439w = f3424h.getBoolean("HPAS", false);
        f3440x = f3424h.getBoolean("BTAP", false);
        f3441y = f3424h.getBoolean("BTAS", false);
    }
}
