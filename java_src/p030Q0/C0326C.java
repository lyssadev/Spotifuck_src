package p030Q0;

import android.os.HandlerThread;
import android.os.Looper;
import p000A.C0001b;
import p098r1.C1268h;

/* renamed from: Q0.C */
/* loaded from: classes.dex */
public final class C0326C {

    /* renamed from: a */
    public final C0001b f834a;

    /* renamed from: b */
    public final HandlerC0341j f835b;

    /* renamed from: c */
    public long f836c;

    /* renamed from: d */
    public long f837d;

    /* renamed from: e */
    public long f838e;

    /* renamed from: f */
    public long f839f;

    /* renamed from: g */
    public long f840g;

    /* renamed from: h */
    public long f841h;

    /* renamed from: i */
    public long f842i;

    /* renamed from: j */
    public long f843j;

    /* renamed from: k */
    public int f844k;

    /* renamed from: l */
    public int f845l;

    /* renamed from: m */
    public int f846m;

    public C0326C(C0001b c0001b) {
        int i = 1;
        this.f834a = c0001b;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        C1268h c1268h = AbstractC0331H.f862a;
        HandlerC0352u handlerC0352u = new HandlerC0352u(looper, i);
        handlerC0352u.sendMessageDelayed(handlerC0352u.obtainMessage(), 1000L);
        this.f835b = new HandlerC0341j(handlerThread.getLooper(), this, i);
    }

    /* renamed from: a */
    public final C0327D m929a() {
        C0001b c0001b = this.f834a;
        return new C0327D(((C0346o) c0001b.f2g).maxSize(), ((C0346o) c0001b.f2g).size(), this.f836c, this.f837d, this.f838e, this.f839f, this.f840g, this.f841h, this.f842i, this.f843j, this.f844k, this.f845l, this.f846m, System.currentTimeMillis());
    }
}
