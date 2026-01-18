package p058d0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p000A.C0001b;
import p021M.C0181b;
import p051b.C0662d;

/* renamed from: d0.n */
/* loaded from: classes.dex */
public final class RunnableC0726n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2697a = 1;

    /* renamed from: b */
    public final /* synthetic */ C0001b f2698b;

    /* renamed from: c */
    public final /* synthetic */ String f2699c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f2700d;

    /* renamed from: e */
    public final /* synthetic */ C0001b f2701e;

    /* renamed from: f */
    public final /* synthetic */ Object f2702f;

    public RunnableC0726n(C0001b c0001b, C0001b c0001b2, String str, IBinder iBinder, Bundle bundle) {
        this.f2701e = c0001b;
        this.f2698b = c0001b2;
        this.f2699c = str;
        this.f2702f = iBinder;
        this.f2700d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2697a) {
            case 0:
                IBinder binder = ((Messenger) this.f2698b.f2g).getBinder();
                C0001b c0001b = this.f2701e;
                C0715c c0715c = (C0715c) ((AbstractServiceC0729q) c0001b.f2g).f2718j.getOrDefault(binder, null);
                if (c0715c == null) {
                    Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + this.f2699c);
                    return;
                }
                AbstractServiceC0729q abstractServiceC0729q = (AbstractServiceC0729q) c0001b.f2g;
                abstractServiceC0729q.getClass();
                HashMap map = c0715c.f2673e;
                String str = this.f2699c;
                List arrayList = (List) map.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    IBinder iBinder = (IBinder) this.f2702f;
                    Bundle bundle = this.f2700d;
                    if (!zHasNext) {
                        arrayList.add(new C0181b(iBinder, bundle));
                        map.put(str, arrayList);
                        C0713a c0713a = new C0713a(abstractServiceC0729q, str, c0715c, str, bundle);
                        if (bundle == null) {
                            abstractServiceC0729q.mo1958b(str, c0713a);
                        } else {
                            c0713a.f2687d = 1;
                            abstractServiceC0729q.mo1958b(str, c0713a);
                        }
                        if (c0713a.m1955b()) {
                            return;
                        }
                        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + c0715c.f2669a + " id=" + str);
                    }
                    C0181b c0181b = (C0181b) it2.next();
                    if (iBinder == c0181b.f528a) {
                        Bundle bundle2 = (Bundle) c0181b.f529b;
                        if (bundle == bundle2) {
                            return;
                        }
                        if (bundle == null) {
                            if (bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle2 == null) {
                            if (bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
                            return;
                        }
                    }
                }
                break;
            default:
                IBinder binder2 = ((Messenger) this.f2698b.f2g).getBinder();
                C0001b c0001b2 = this.f2701e;
                if (((C0715c) ((AbstractServiceC0729q) c0001b2.f2g).f2718j.getOrDefault(binder2, null)) != null) {
                    ((AbstractServiceC0729q) c0001b2.f2g).getClass();
                    ((C0662d) this.f2702f).m1840b(-1, null);
                    return;
                }
                Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.f2699c + ", extras=" + this.f2700d);
                return;
        }
    }

    public RunnableC0726n(C0001b c0001b, C0001b c0001b2, String str, Bundle bundle, C0662d c0662d) {
        this.f2701e = c0001b;
        this.f2698b = c0001b2;
        this.f2699c = str;
        this.f2700d = bundle;
        this.f2702f = c0662d;
    }
}
