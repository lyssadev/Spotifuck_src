package p030Q0;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Looper;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import p000A.C0001b;
import p098r1.C1268h;
import p101t.AbstractC1300e;

/* renamed from: Q0.m */
/* loaded from: classes.dex */
public final class C0344m {

    /* renamed from: a */
    public final Context f901a;

    /* renamed from: b */
    public final C0356y f902b;

    /* renamed from: c */
    public final C0001b f903c;

    /* renamed from: d */
    public final LinkedHashMap f904d;

    /* renamed from: e */
    public final WeakHashMap f905e;

    /* renamed from: f */
    public final WeakHashMap f906f;

    /* renamed from: g */
    public final LinkedHashSet f907g;

    /* renamed from: h */
    public final HandlerC0341j f908h;

    /* renamed from: i */
    public final HandlerC0352u f909i;

    /* renamed from: j */
    public final C0001b f910j;

    /* renamed from: k */
    public final C0326C f911k;

    /* renamed from: l */
    public final ArrayList f912l;

    /* renamed from: m */
    public final boolean f913m;

    /* JADX WARN: Multi-variable type inference failed */
    public C0344m(Context context, C0356y c0356y, HandlerC0352u handlerC0352u, C0001b c0001b, C0001b c0001b2, C0326C c0326c) {
        HandlerThreadC0342k handlerThreadC0342k = new HandlerThreadC0342k("Picasso-Dispatcher", 10);
        handlerThreadC0342k.start();
        Looper looper = handlerThreadC0342k.getLooper();
        C1268h c1268h = AbstractC0331H.f862a;
        HandlerC0352u handlerC0352u2 = new HandlerC0352u(looper, 1);
        handlerC0352u2.sendMessageDelayed(handlerC0352u2.obtainMessage(), 1000L);
        this.f901a = context;
        this.f902b = c0356y;
        this.f904d = new LinkedHashMap();
        this.f905e = new WeakHashMap();
        this.f906f = new WeakHashMap();
        this.f907g = new LinkedHashSet();
        this.f908h = new HandlerC0341j(handlerThreadC0342k.getLooper(), (Object) this, (int) (0 == true ? 1 : 0));
        this.f903c = c0001b;
        this.f909i = handlerC0352u;
        this.f910j = c0001b2;
        this.f911k = c0326c;
        this.f912l = new ArrayList(4);
        try {
            Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (NullPointerException | SecurityException unused) {
        }
        this.f913m = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
        C0343l c0343l = new C0343l(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        C0344m c0344m = (C0344m) c0343l.f900b;
        if (c0344m.f913m) {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        c0344m.f901a.registerReceiver(c0343l, intentFilter);
    }

    /* renamed from: a */
    public final void m947a(RunnableC0337f runnableC0337f) {
        Future future = runnableC0337f.f885m;
        if (future == null || !future.isCancelled()) {
            Bitmap bitmap = runnableC0337f.f884l;
            if (bitmap != null) {
                bitmap.prepareToDraw();
            }
            this.f912l.add(runnableC0337f);
            HandlerC0341j handlerC0341j = this.f908h;
            if (handlerC0341j.hasMessages(7)) {
                return;
            }
            handlerC0341j.sendEmptyMessageDelayed(7, 200L);
        }
    }

    /* renamed from: b */
    public final void m948b(RunnableC0337f runnableC0337f) {
        HandlerC0341j handlerC0341j = this.f908h;
        handlerC0341j.sendMessage(handlerC0341j.obtainMessage(4, runnableC0337f));
    }

    /* renamed from: c */
    public final void m949c(RunnableC0337f runnableC0337f, boolean z2) {
        runnableC0337f.f874b.getClass();
        this.f904d.remove(runnableC0337f.f878f);
        m947a(runnableC0337f);
    }

    /* renamed from: d */
    public final void m950d(C0345n c0345n, boolean z2) {
        boolean zContains = this.f907g.contains(c0345n.f917d);
        C0354w c0354w = c0345n.f914a;
        if (zContains) {
            this.f906f.put(c0345n.m951a(), c0345n);
            c0354w.getClass();
            return;
        }
        LinkedHashMap linkedHashMap = this.f904d;
        String str = c0345n.f916c;
        RunnableC0337f runnableC0337f = (RunnableC0337f) linkedHashMap.get(str);
        if (runnableC0337f == null) {
            C0356y c0356y = this.f902b;
            if (c0356y.isShutdown()) {
                c0354w.getClass();
                return;
            }
            RunnableC0337f runnableC0337fM941d = RunnableC0337f.m941d(c0354w, this, this.f910j, this.f911k, c0345n);
            runnableC0337fM941d.f885m = c0356y.submit(runnableC0337fM941d);
            linkedHashMap.put(str, runnableC0337fM941d);
            if (z2) {
                this.f905e.remove(c0345n.m951a());
            }
            c0354w.getClass();
            return;
        }
        runnableC0337f.f874b.getClass();
        if (runnableC0337f.f882j == null) {
            runnableC0337f.f882j = c0345n;
            return;
        }
        if (runnableC0337f.f883k == null) {
            runnableC0337f.f883k = new ArrayList(3);
        }
        runnableC0337f.f883k.add(c0345n);
        int i = c0345n.f915b.f940c;
        if (AbstractC1300e.m3116a(i) > AbstractC1300e.m3116a(runnableC0337f.f890r)) {
            runnableC0337f.f890r = i;
        }
    }
}
