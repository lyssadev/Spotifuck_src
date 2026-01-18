package it.deviato.spotifuck;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import it.deviato.spotifuck.AppSingleton;
import it.deviato.spotifuck.LockableHScrollView;
import it.deviato.spotifuck.MainActivity;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import java.util.WeakHashMap;
import p023N.AbstractC0195F;
import p023N.AbstractC0206Q;
import p023N.C0227g;
import p024N0.ViewOnClickListenerC0273a;
import p032R0.C0366h;
import p032R0.RunnableC0359a;
import p032R0.ViewOnClickListenerC0367i;
import p068h.AbstractActivityC0841l;
import p091p0.AbstractC1230a;

/* loaded from: classes.dex */
public class MainActivity extends AbstractActivityC0841l {

    /* renamed from: F */
    public static LockableHScrollView f3444F = null;

    /* renamed from: G */
    public static FrameLayout f3445G = null;

    /* renamed from: H */
    public static TextView f3446H = null;

    /* renamed from: I */
    public static TextView f3447I = null;

    /* renamed from: J */
    public static TextView f3448J = null;

    /* renamed from: K */
    public static WebView f3449K = null;

    /* renamed from: L */
    public static Switch f3450L = null;

    /* renamed from: M */
    public static ProgressBar f3451M = null;

    /* renamed from: N */
    public static Intent f3452N = null;

    /* renamed from: O */
    public static int f3453O = 0;

    /* renamed from: P */
    public static boolean f3454P = false;

    /* renamed from: Q */
    public static boolean f3455Q = AppSingleton.f3437u;

    /* renamed from: R */
    public static boolean f3456R = false;

    /* renamed from: S */
    public static boolean f3457S = false;

    /* renamed from: D */
    public final Handler f3458D = new Handler();

    /* renamed from: E */
    public final RunnableC0359a f3459E = new RunnableC0359a(5);

    /* renamed from: t */
    public static void m2226t(String str) {
        f3451M.setVisibility(0);
        f3448J.setText(str);
        f3448J.setVisibility(0);
        f3448J.bringToFront();
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0359a(6), 2500L);
    }

    /* renamed from: u */
    public static void m2227u() {
        if (!f3450L.isChecked()) {
            f3451M.setVisibility(4);
            if (Build.VERSION.SDK_INT >= 23) {
                f3450L.setThumbTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_checked}, new int[]{-16842912}}, new int[]{-1, -3355444}));
                return;
            }
            return;
        }
        if (AppSingleton.f3417B) {
            f3451M.setVisibility(4);
            if (Build.VERSION.SDK_INT >= 23) {
                f3450L.setThumbTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_checked}, new int[]{-16842912}}, new int[]{Color.parseColor("#00C8F0"), -3355444}));
                return;
            }
            return;
        }
        f3451M.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 23) {
            f3450L.setThumbTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_checked}, new int[]{-16842912}}, new int[]{-1, -3355444}));
        }
    }

    @Override // p068h.AbstractActivityC0841l, androidx.activity.AbstractActivityC0532n, p003C.AbstractActivityC0021h, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        if (AppSingleton.f3437u) {
            Locale.setDefault(new Locale("en"));
        }
        AppSingleton.f3423g = new WeakReference(this);
        setContentView(R.layout.activity_main);
        View viewFindViewById = findViewById(R.id.main);
        C0227g c0227g = new C0227g(2);
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        AbstractC0195F.m615u(viewFindViewById, c0227g);
        f3452N = new Intent(AppSingleton.f3422f, (Class<?>) WebService.class);
        m1302i().m1278a(this, new C0366h(this));
        f3444F = (LockableHScrollView) findViewById(R.id.hScrollView);
        f3445G = (FrameLayout) findViewById(R.id.webViewContainer);
        f3446H = (TextView) findViewById(R.id.frameBgText);
        f3447I = (TextView) findViewById(R.id.frameStatusText);
        f3448J = (TextView) findViewById(R.id.txtMessage);
        String userAgentString = new WebView(AppSingleton.f3422f).getSettings().getUserAgentString();
        int iIndexOf = userAgentString.indexOf("Chrome/");
        if (iIndexOf != -1) {
            int iIndexOf2 = userAgentString.indexOf(" ", iIndexOf);
            if (iIndexOf2 == -1) {
                iIndexOf2 = userAgentString.length();
            }
            f3447I.setText("WebView v." + userAgentString.substring(iIndexOf + 7, iIndexOf2));
        }
        f3451M = (ProgressBar) findViewById(R.id.progressBar);
        ((ImageView) findViewById(R.id.btnSettings)).setOnClickListener(new ViewOnClickListenerC0273a(3, this));
        f3450L = (Switch) findViewById(R.id.swcStart);
        if (AppSingleton.f3429m) {
            f3450L.setChecked(true);
            AbstractC1230a.m2867G0(AppSingleton.f3422f, f3452N);
            m2228s();
        }
        m2227u();
        f3450L.setOnClickListener(new ViewOnClickListenerC0367i(0, this));
    }

    @Override // p068h.AbstractActivityC0841l, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        AppSingleton.f3423g = new WeakReference(null);
    }

    @Override // p068h.AbstractActivityC0841l, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (AppSingleton.f3436t) {
            setRequestedOrientation(1);
        } else {
            setRequestedOrientation(13);
        }
        if (WebService.f3497t.booleanValue() && !f3449K.isAttachedToWindow()) {
            f3445G.removeView(f3449K);
            final int i = 0;
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) { // from class: R0.g

                /* renamed from: b */
                public final /* synthetic */ MainActivity f945b;

                {
                    this.f945b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity mainActivity = this.f945b;
                    switch (i) {
                        case 0:
                            LockableHScrollView lockableHScrollView = MainActivity.f3444F;
                            mainActivity.m2228s();
                            MainActivity.f3449K.isAttachedToWindow();
                            break;
                        default:
                            LockableHScrollView lockableHScrollView2 = MainActivity.f3444F;
                            mainActivity.getClass();
                            AbstractC1230a.m2867G0(AppSingleton.f3422f, MainActivity.f3452N);
                            mainActivity.m2228s();
                            break;
                    }
                }
            }, 200L);
        }
        if (AppSingleton.f3437u) {
            Locale.setDefault(new Locale("en"));
        }
        boolean z2 = f3455Q;
        boolean z3 = AppSingleton.f3437u;
        if (z2 != z3) {
            f3456R = true;
        }
        f3455Q = z3;
        if (f3456R) {
            f3456R = false;
            WebView webView = new WebView(AppSingleton.f3422f);
            webView.clearCache(true);
            webView.clearHistory();
            webView.clearFormData();
            WebStorage.getInstance().deleteAllData();
            if (AppSingleton.f3429m) {
                f3449K.reload();
                m2226t(getString(R.string.txt_reload));
            }
        }
        if (f3457S) {
            f3457S = false;
            boolean zBooleanValue = WebService.f3497t.booleanValue();
            if (zBooleanValue) {
                f3446H.setText(R.string.txt_servicenr);
                f3445G.removeView(f3449K);
                startService(new Intent(AppSingleton.f3422f, (Class<?>) WebService.class).setAction("STOP_SERVICE"));
            }
            WebView webView2 = new WebView(AppSingleton.f3422f);
            webView2.clearCache(true);
            webView2.clearHistory();
            webView2.clearFormData();
            WebStorage.getInstance().deleteAllData();
            CookieManager.getInstance().removeAllCookies(null);
            CookieManager.getInstance().flush();
            AppSingleton.f3430n = false;
            AppSingleton.f3425i.putBoolean("LoggedIn", false);
            AppSingleton.f3425i.commit();
            if (zBooleanValue) {
                final int i2 = 1;
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) { // from class: R0.g

                    /* renamed from: b */
                    public final /* synthetic */ MainActivity f945b;

                    {
                        this.f945b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MainActivity mainActivity = this.f945b;
                        switch (i2) {
                            case 0:
                                LockableHScrollView lockableHScrollView = MainActivity.f3444F;
                                mainActivity.m2228s();
                                MainActivity.f3449K.isAttachedToWindow();
                                break;
                            default:
                                LockableHScrollView lockableHScrollView2 = MainActivity.f3444F;
                                mainActivity.getClass();
                                AbstractC1230a.m2867G0(AppSingleton.f3422f, MainActivity.f3452N);
                                mainActivity.m2228s();
                                break;
                        }
                    }
                }, 600L);
            }
            Toast.makeText(AppSingleton.f3422f, "All Cookies Deleted!", 0).show();
        }
    }

    /* renamed from: s */
    public final void m2228s() {
        f3446H.setText(R.string.txt_loadingpage);
        f3449K = AppSingleton.m2224b();
        if (AppSingleton.f3428l.equals("bigwindow")) {
            f3444F.setScrollingEnabled(true);
            f3453O = 1600;
        } else {
            f3444F.setScrollingEnabled(false);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            f3453O = displayMetrics.widthPixels;
        }
        f3449K.setLayoutParams(new FrameLayout.LayoutParams(f3453O, -1));
        if (f3449K.getParent() != null) {
            ((ViewGroup) f3449K.getParent()).removeView(f3449K);
        }
        f3445G.addView(f3449K);
    }
}
