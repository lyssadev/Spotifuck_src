package p058d0;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000A.C0001b;
import p000A.C0010k;
import p030Q0.HandlerC0341j;
import p096r.C1247b;

/* renamed from: d0.q */
/* loaded from: classes.dex */
public abstract class AbstractServiceC0729q extends Service {

    /* renamed from: m */
    public static final /* synthetic */ int f2713m = 0;

    /* renamed from: f */
    public C0010k f2714f;

    /* renamed from: g */
    public final C0001b f2715g = new C0001b(24, this);

    /* renamed from: h */
    public final C0715c f2716h = new C0715c(this, "android.media.session.MediaController", -1, -1, null);

    /* renamed from: i */
    public final ArrayList f2717i = new ArrayList();

    /* renamed from: j */
    public final C1247b f2718j = new C1247b();

    /* renamed from: k */
    public final HandlerC0341j f2719k;

    /* renamed from: l */
    public MediaSessionCompat$Token f2720l;

    static {
        Log.isLoggable("MBServiceCompat", 3);
    }

    public AbstractServiceC0729q() {
        HandlerC0341j handlerC0341j = new HandlerC0341j(3);
        handlerC0341j.f898b = this;
        this.f2719k = handlerC0341j;
    }

    /* renamed from: a */
    public static List m1957a(List list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i == -1 && i2 == -1) {
            return list;
        }
        int i3 = i2 * i;
        int size = i3 + i2;
        if (i < 0 || i2 < 1 || i3 >= list.size()) {
            return Collections.emptyList();
        }
        if (size > list.size()) {
            size = list.size();
        }
        return list.subList(i3, size);
    }

    /* renamed from: b */
    public abstract void mo1958b(String str, AbstractC0723k abstractC0723k);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return ((C0716d) this.f2714f.f23f).onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f2714f = new C0722j(this);
        } else if (i >= 26) {
            this.f2714f = new C0721i(this);
        } else if (i >= 23) {
            this.f2714f = new C0718f(this);
        } else {
            this.f2714f = new C0010k(this);
        }
        this.f2714f.mo93p();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f2719k.f898b = null;
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
