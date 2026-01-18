package androidx.activity;

import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.support.v4.media.session.C0513t;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.C0570A;
import androidx.lifecycle.AbstractC0623I;
import androidx.lifecycle.C0628N;
import androidx.lifecycle.C0630P;
import androidx.lifecycle.C0652t;
import androidx.lifecycle.EnumC0644l;
import androidx.lifecycle.FragmentC0620F;
import androidx.lifecycle.InterfaceC0631Q;
import androidx.lifecycle.InterfaceC0640h;
import androidx.lifecycle.InterfaceC0648p;
import androidx.lifecycle.InterfaceC0650r;
import it.deviato.spotifuck.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p003C.AbstractActivityC0021h;
import p003C.C0022i;
import p003C.C0035v;
import p003C.InterfaceC0033t;
import p003C.InterfaceC0034u;
import p005D.InterfaceC0045f;
import p005D.InterfaceC0046g;
import p021M.InterfaceC0180a;
import p023N.InterfaceC0237l;
import p034S0.C0382b;
import p036T0.AbstractC0411g;
import p045Y0.InterfaceC0438a;
import p047Z0.AbstractC0469c;
import p052b0.C0665c;
import p054c.C0671a;
import p054c.InterfaceC0672b;
import p057d.InterfaceC0712d;
import p068h.AbstractActivityC0841l;
import p077k0.C0958c;
import p077k0.C0959d;
import p077k0.InterfaceC0960e;

/* renamed from: androidx.activity.n */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0532n extends AbstractActivityC0021h implements InterfaceC0631Q, InterfaceC0640h, InterfaceC0960e, InterfaceC0518B, InterfaceC0712d, InterfaceC0045f, InterfaceC0046g, InterfaceC0033t, InterfaceC0034u, InterfaceC0237l {

    /* renamed from: w */
    public static final /* synthetic */ int f1290w = 0;

    /* renamed from: g */
    public final C0671a f1291g = new C0671a();

    /* renamed from: h */
    public final C0513t f1292h;

    /* renamed from: i */
    public final C0959d f1293i;

    /* renamed from: j */
    public C0630P f1294j;

    /* renamed from: k */
    public final ViewTreeObserverOnDrawListenerC0529k f1295k;

    /* renamed from: l */
    public final C0382b f1296l;

    /* renamed from: m */
    public final C0530l f1297m;

    /* renamed from: n */
    public final CopyOnWriteArrayList f1298n;

    /* renamed from: o */
    public final CopyOnWriteArrayList f1299o;

    /* renamed from: p */
    public final CopyOnWriteArrayList f1300p;

    /* renamed from: q */
    public final CopyOnWriteArrayList f1301q;

    /* renamed from: r */
    public final CopyOnWriteArrayList f1302r;

    /* renamed from: s */
    public final CopyOnWriteArrayList f1303s;

    /* renamed from: t */
    public boolean f1304t;

    /* renamed from: u */
    public boolean f1305u;

    /* renamed from: v */
    public final C0382b f1306v;

    public AbstractActivityC0532n() {
        final AbstractActivityC0841l abstractActivityC0841l = (AbstractActivityC0841l) this;
        this.f1292h = new C0513t(new RunnableC0522d(abstractActivityC0841l, 0));
        C0959d c0959d = new C0959d(this);
        this.f1293i = c0959d;
        this.f1295k = new ViewTreeObserverOnDrawListenerC0529k(abstractActivityC0841l);
        this.f1296l = new C0382b(new C0531m(abstractActivityC0841l, 1));
        new AtomicInteger();
        this.f1297m = new C0530l();
        this.f1298n = new CopyOnWriteArrayList();
        this.f1299o = new CopyOnWriteArrayList();
        this.f1300p = new CopyOnWriteArrayList();
        this.f1301q = new CopyOnWriteArrayList();
        this.f1302r = new CopyOnWriteArrayList();
        this.f1303s = new CopyOnWriteArrayList();
        C0652t c0652t = this.f57f;
        if (c0652t == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        c0652t.m1615a(new C0523e(0, abstractActivityC0841l));
        this.f57f.m1615a(new C0523e(1, abstractActivityC0841l));
        this.f57f.m1615a(new InterfaceC0648p() { // from class: androidx.activity.ComponentActivity$4
            @Override // androidx.lifecycle.InterfaceC0648p
            /* renamed from: b */
            public final void mo1283b(InterfaceC0650r interfaceC0650r, EnumC0644l enumC0644l) {
                int i = AbstractActivityC0532n.f1290w;
                AbstractActivityC0841l abstractActivityC0841l2 = abstractActivityC0841l;
                if (abstractActivityC0841l2.f1294j == null) {
                    C0528j c0528j = (C0528j) abstractActivityC0841l2.getLastNonConfigurationInstance();
                    if (c0528j != null) {
                        abstractActivityC0841l2.f1294j = c0528j.f1276a;
                    }
                    if (abstractActivityC0841l2.f1294j == null) {
                        abstractActivityC0841l2.f1294j = new C0630P();
                    }
                }
                abstractActivityC0841l2.f57f.m1620f(this);
            }
        });
        c0959d.m2445a();
        AbstractC0623I.m1603b(this);
        if (Build.VERSION.SDK_INT <= 23) {
            this.f57f.m1615a(new ImmLeaksCleaner(this));
        }
        c0959d.f3919b.m2443e("android:support:activity-result", new C0524f(0, abstractActivityC0841l));
        m1301h(new C0525g(abstractActivityC0841l, 0));
        this.f1306v = new C0382b(new C0531m(abstractActivityC0841l, 2));
    }

    @Override // androidx.lifecycle.InterfaceC0640h
    /* renamed from: a */
    public final C0665c mo1296a() {
        C0665c c0665c = new C0665c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c0665c.f2259a;
        if (application != null) {
            C0628N c0628n = C0628N.f1985a;
            Application application2 = getApplication();
            AbstractC0469c.m1101d("application", application2);
            linkedHashMap.put(c0628n, application2);
        }
        linkedHashMap.put(AbstractC0623I.f1973a, this);
        linkedHashMap.put(AbstractC0623I.f1974b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(AbstractC0623I.f1975c, extras);
        }
        return c0665c;
    }

    @Override // p077k0.InterfaceC0960e
    /* renamed from: b */
    public final C0958c mo1297b() {
        return this.f1293i.f3919b;
    }

    @Override // androidx.lifecycle.InterfaceC0631Q
    /* renamed from: c */
    public final C0630P mo1298c() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f1294j == null) {
            C0528j c0528j = (C0528j) getLastNonConfigurationInstance();
            if (c0528j != null) {
                this.f1294j = c0528j.f1276a;
            }
            if (this.f1294j == null) {
                this.f1294j = new C0630P();
            }
        }
        C0630P c0630p = this.f1294j;
        AbstractC0469c.m1099b(c0630p);
        return c0630p;
    }

    @Override // androidx.lifecycle.InterfaceC0650r
    /* renamed from: d */
    public final C0652t mo1299d() {
        return this.f57f;
    }

    /* renamed from: g */
    public final void m1300g(InterfaceC0180a interfaceC0180a) {
        AbstractC0469c.m1102e("listener", interfaceC0180a);
        this.f1298n.add(interfaceC0180a);
    }

    /* renamed from: h */
    public final void m1301h(InterfaceC0672b interfaceC0672b) {
        C0671a c0671a = this.f1291g;
        c0671a.getClass();
        AbstractActivityC0532n abstractActivityC0532n = c0671a.f2265b;
        if (abstractActivityC0532n != null) {
            interfaceC0672b.mo1289a(abstractActivityC0532n);
        }
        c0671a.f2264a.add(interfaceC0672b);
    }

    /* renamed from: i */
    public final C0517A m1302i() {
        return (C0517A) this.f1306v.m978a();
    }

    /* renamed from: j */
    public final void m1303j() {
        View decorView = getWindow().getDecorView();
        AbstractC0469c.m1101d("window.decorView", decorView);
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC0469c.m1101d("window.decorView", decorView2);
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC0469c.m1101d("window.decorView", decorView3);
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC0469c.m1101d("window.decorView", decorView4);
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        AbstractC0469c.m1101d("window.decorView", decorView5);
        decorView5.setTag(R.id.report_drawn, this);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f1297m.m1293a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        m1302i().m1280c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        AbstractC0469c.m1102e("newConfig", configuration);
        super.onConfigurationChanged(configuration);
        Iterator it2 = this.f1298n.iterator();
        while (it2.hasNext()) {
            ((InterfaceC0180a) it2.next()).mo485a(configuration);
        }
    }

    @Override // p003C.AbstractActivityC0021h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f1293i.m2446b(bundle);
        C0671a c0671a = this.f1291g;
        c0671a.getClass();
        c0671a.f2265b = this;
        Iterator it2 = c0671a.f2264a.iterator();
        while (it2.hasNext()) {
            ((InterfaceC0672b) it2.next()).mo1289a(this);
        }
        super.onCreate(bundle);
        int i = FragmentC0620F.f1970g;
        AbstractC0623I.m1604c(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        AbstractC0469c.m1102e("menu", menu);
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f1292h.f1246c).iterator();
        while (it2.hasNext()) {
            ((C0570A) it2.next()).f1697a.m1499j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        AbstractC0469c.m1102e("item", menuItem);
        boolean z2 = true;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f1292h.f1246c).iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            }
            if (((C0570A) it2.next()).f1697a.m1504o()) {
                break;
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2) {
        if (this.f1304t) {
            return;
        }
        Iterator it2 = this.f1301q.iterator();
        while (it2.hasNext()) {
            ((InterfaceC0180a) it2.next()).mo485a(new C0022i(z2));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        AbstractC0469c.m1102e("intent", intent);
        super.onNewIntent(intent);
        Iterator it2 = this.f1300p.iterator();
        while (it2.hasNext()) {
            ((InterfaceC0180a) it2.next()).mo485a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        AbstractC0469c.m1102e("menu", menu);
        Iterator it2 = ((CopyOnWriteArrayList) this.f1292h.f1246c).iterator();
        while (it2.hasNext()) {
            ((C0570A) it2.next()).f1697a.m1505p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2) {
        if (this.f1305u) {
            return;
        }
        Iterator it2 = this.f1302r.iterator();
        while (it2.hasNext()) {
            ((InterfaceC0180a) it2.next()).mo485a(new C0035v(z2));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        AbstractC0469c.m1102e("menu", menu);
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it2 = ((CopyOnWriteArrayList) this.f1292h.f1246c).iterator();
        while (it2.hasNext()) {
            ((C0570A) it2.next()).f1697a.m1508s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        AbstractC0469c.m1102e("permissions", strArr);
        AbstractC0469c.m1102e("grantResults", iArr);
        if (this.f1297m.m1293a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0528j c0528j;
        C0630P c0630p = this.f1294j;
        if (c0630p == null && (c0528j = (C0528j) getLastNonConfigurationInstance()) != null) {
            c0630p = c0528j.f1276a;
        }
        if (c0630p == null) {
            return null;
        }
        C0528j c0528j2 = new C0528j();
        c0528j2.f1276a = c0630p;
        return c0528j2;
    }

    @Override // p003C.AbstractActivityC0021h, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        AbstractC0469c.m1102e("outState", bundle);
        C0652t c0652t = this.f57f;
        if (c0652t instanceof C0652t) {
            AbstractC0469c.m1100c("null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry", c0652t);
            c0652t.m1621g();
        }
        super.onSaveInstanceState(bundle);
        this.f1293i.m2447c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it2 = this.f1299o.iterator();
        while (it2.hasNext()) {
            ((InterfaceC0180a) it2.next()).mo485a(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it2 = this.f1303s.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC0411g.m1044w()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            C0534p c0534p = (C0534p) this.f1296l.m978a();
            synchronized (c0534p.f1310a) {
                try {
                    c0534p.f1311b = true;
                    Iterator it2 = c0534p.f1312c.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC0438a) it2.next()).mo1093a();
                    }
                    c0534p.f1312c.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m1303j();
        View decorView = getWindow().getDecorView();
        AbstractC0469c.m1101d("window.decorView", decorView);
        ViewTreeObserverOnDrawListenerC0529k viewTreeObserverOnDrawListenerC0529k = this.f1295k;
        viewTreeObserverOnDrawListenerC0529k.getClass();
        if (!viewTreeObserverOnDrawListenerC0529k.f1279c) {
            viewTreeObserverOnDrawListenerC0529k.f1279c = true;
            decorView.getViewTreeObserver().addOnDrawListener(viewTreeObserverOnDrawListenerC0529k);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        AbstractC0469c.m1102e("intent", intent);
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        AbstractC0469c.m1102e("intent", intentSender);
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        AbstractC0469c.m1102e("intent", intent);
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        AbstractC0469c.m1102e("intent", intentSender);
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        AbstractC0469c.m1102e("newConfig", configuration);
        this.f1304t = true;
        try {
            super.onMultiWindowModeChanged(z2, configuration);
            this.f1304t = false;
            Iterator it2 = this.f1301q.iterator();
            while (it2.hasNext()) {
                ((InterfaceC0180a) it2.next()).mo485a(new C0022i(z2));
            }
        } catch (Throwable th) {
            this.f1304t = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        AbstractC0469c.m1102e("newConfig", configuration);
        this.f1305u = true;
        try {
            super.onPictureInPictureModeChanged(z2, configuration);
            this.f1305u = false;
            Iterator it2 = this.f1302r.iterator();
            while (it2.hasNext()) {
                ((InterfaceC0180a) it2.next()).mo485a(new C0035v(z2));
            }
        } catch (Throwable th) {
            this.f1305u = false;
            throw th;
        }
    }
}
