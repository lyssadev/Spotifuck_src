package androidx.activity;

import android.os.Build;
import android.widget.Toast;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.C0577H;
import androidx.lifecycle.C0652t;
import androidx.lifecycle.EnumC0645m;
import androidx.lifecycle.InterfaceC0650r;
import it.deviato.spotifuck.AppSingleton;
import it.deviato.spotifuck.MainActivity;
import it.deviato.spotifuck.R;
import it.deviato.spotifuck.WebService;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p032R0.C0366h;
import p036T0.C0405a;
import p047Z0.AbstractC0469c;

/* renamed from: androidx.activity.A */
/* loaded from: classes.dex */
public final class C0517A {

    /* renamed from: a */
    public final Runnable f1248a;

    /* renamed from: b */
    public final C0405a f1249b = new C0405a();

    /* renamed from: c */
    public C0366h f1250c;

    /* renamed from: d */
    public final OnBackInvokedCallback f1251d;

    /* renamed from: e */
    public OnBackInvokedDispatcher f1252e;

    /* renamed from: f */
    public boolean f1253f;

    /* renamed from: g */
    public boolean f1254g;

    public C0517A(Runnable runnable) {
        this.f1248a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.f1251d = i >= 34 ? new C0542x(new C0539u(this, 0), new C0539u(this, 1), new C0540v(this, 0), new C0540v(this, 1)) : new C0541w(0, new C0540v(this, 2));
        }
    }

    /* renamed from: a */
    public final void m1278a(InterfaceC0650r interfaceC0650r, C0366h c0366h) {
        AbstractC0469c.m1102e("onBackPressedCallback", c0366h);
        C0652t c0652tMo1299d = interfaceC0650r.mo1299d();
        if (c0652tMo1299d.f2012c == EnumC0645m.f2001a) {
            return;
        }
        c0366h.f947b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, c0652tMo1299d, c0366h));
        m1282e();
        c0366h.f948c = new C0544z(0, this);
    }

    /* renamed from: b */
    public final void m1279b() {
        Object objPrevious;
        if (this.f1250c == null) {
            C0405a c0405a = this.f1249b;
            ListIterator<E> listIterator = c0405a.listIterator(c0405a.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((C0366h) objPrevious).f946a) {
                        break;
                    }
                }
            }
        }
        this.f1250c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* renamed from: c */
    public final void m1280c() {
        C0366h c0366hPrevious;
        C0366h c0366h = this.f1250c;
        if (c0366h == null) {
            C0405a c0405a = this.f1249b;
            ListIterator listIterator = c0405a.listIterator(c0405a.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    c0366hPrevious = 0;
                    break;
                } else {
                    c0366hPrevious = listIterator.previous();
                    if (((C0366h) c0366hPrevious).f946a) {
                        break;
                    }
                }
            }
            c0366h = c0366hPrevious;
        }
        this.f1250c = null;
        if (c0366h == null) {
            Runnable runnable = this.f1248a;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        switch (c0366h.f949d) {
            case 0:
                boolean zBooleanValue = WebService.f3497t.booleanValue();
                MainActivity mainActivity = (MainActivity) c0366h.f950e;
                if (!zBooleanValue) {
                    mainActivity.finish();
                    break;
                } else {
                    String url = MainActivity.f3449K.getUrl();
                    if (!url.equals("https://open.spotify.com/") && !url.matches("https://open\\.spotify\\.com/intl-[a-zA-Z]{2}/") && MainActivity.f3449K.canGoBack()) {
                        MainActivity.f3449K.goBack();
                        MainActivity.m2226t(mainActivity.getString(R.string.txt_loadprevious));
                        break;
                    } else if (!MainActivity.f3454P) {
                        MainActivity.f3454P = true;
                        Toast.makeText(AppSingleton.f3422f, mainActivity.getString(R.string.txt_pressagain), 0).show();
                        mainActivity.f3458D.postDelayed(mainActivity.f3459E, 2000L);
                        break;
                    } else {
                        mainActivity.moveTaskToBack(true);
                        break;
                    }
                }
                break;
            default:
                C0577H c0577h = (C0577H) c0366h.f950e;
                c0577h.m1513x(true);
                if (!c0577h.f1731h.f946a) {
                    c0577h.f1730g.m1280c();
                    break;
                } else {
                    c0577h.m1475L();
                    break;
                }
        }
    }

    /* renamed from: d */
    public final void m1281d(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1252e;
        OnBackInvokedCallback onBackInvokedCallback = this.f1251d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z2 && !this.f1253f) {
            AbstractC0527i.m1291b(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1253f = true;
        } else {
            if (z2 || !this.f1253f) {
                return;
            }
            AbstractC0527i.m1292c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1253f = false;
        }
    }

    /* renamed from: e */
    public final void m1282e() {
        boolean z2 = this.f1254g;
        C0405a c0405a = this.f1249b;
        boolean z3 = false;
        if (!(c0405a instanceof Collection) || !c0405a.isEmpty()) {
            Iterator<E> it2 = c0405a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (((C0366h) it2.next()).f946a) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f1254g = z3;
        if (z3 == z2 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        m1281d(z3);
    }
}
