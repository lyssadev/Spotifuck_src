package p058d0;

import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p000A.C0001b;
import p021M.C0181b;
import p074j0.C0944w;
import p084n.C1028e;
import p084n.C1037n;
import p084n.MenuC1035l;
import p084n.ViewOnKeyListenerC1029f;

/* renamed from: d0.o */
/* loaded from: classes.dex */
public final class RunnableC0727o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2703a;

    /* renamed from: b */
    public final /* synthetic */ Object f2704b;

    /* renamed from: c */
    public final /* synthetic */ Object f2705c;

    /* renamed from: d */
    public final /* synthetic */ Object f2706d;

    /* renamed from: e */
    public final /* synthetic */ Object f2707e;

    public /* synthetic */ RunnableC0727o(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f2703a = i;
        this.f2707e = obj;
        this.f2704b = obj2;
        this.f2705c = obj3;
        this.f2706d = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2703a) {
            case 0:
                IBinder binder = ((Messenger) ((C0001b) this.f2704b).f2g).getBinder();
                C0001b c0001b = (C0001b) this.f2707e;
                C0715c c0715c = (C0715c) ((AbstractServiceC0729q) c0001b.f2g).f2718j.getOrDefault(binder, null);
                String str = (String) this.f2705c;
                if (c0715c != null) {
                    ((AbstractServiceC0729q) c0001b.f2g).getClass();
                    HashMap map = c0715c.f2673e;
                    IBinder iBinder = (IBinder) this.f2706d;
                    boolean z2 = false;
                    if (iBinder != null) {
                        List list = (List) map.get(str);
                        if (list != null) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                if (iBinder == ((C0181b) it2.next()).f528a) {
                                    it2.remove();
                                    z2 = true;
                                }
                            }
                            if (list.size() == 0) {
                                map.remove(str);
                            }
                        }
                    } else if (map.remove(str) != null) {
                        z2 = true;
                    }
                    if (!z2) {
                        Log.w("MBServiceCompat", "removeSubscription called for " + str + " which is not subscribed");
                        break;
                    }
                } else {
                    Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + str);
                    break;
                }
                break;
            default:
                C1028e c1028e = (C1028e) this.f2704b;
                if (c1028e != null) {
                    C0944w c0944w = (C0944w) this.f2707e;
                    ((ViewOnKeyListenerC1029f) c0944w.f3861f).f4222E = true;
                    c1028e.f4216b.m2582c(false);
                    ((ViewOnKeyListenerC1029f) c0944w.f3861f).f4222E = false;
                }
                C1037n c1037n = (C1037n) this.f2705c;
                if (c1037n.isEnabled() && c1037n.hasSubMenu()) {
                    ((MenuC1035l) this.f2706d).m2588q(c1037n, null, 4);
                    break;
                }
                break;
        }
    }
}
