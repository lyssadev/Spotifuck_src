package p030Q0;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.C0488f;
import android.support.v4.media.session.C0508o;
import android.support.v4.media.session.C0513t;
import android.text.TextUtils;
import android.util.Log;
import androidx.preference.PreferenceScreen;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import p000A.C0001b;
import p032R0.C0373o;
import p051b.C0662d;
import p058d0.AbstractServiceC0729q;
import p058d0.C0730r;
import p058d0.RunnableC0724l;
import p058d0.RunnableC0725m;
import p058d0.RunnableC0726n;
import p058d0.RunnableC0727o;
import p058d0.RunnableC0728p;
import p066g0.AbstractC0774r;
import p066g0.C0777u;
import p098r1.C1268h;

/* renamed from: Q0.j */
/* loaded from: classes.dex */
public final class HandlerC0341j extends Handler {

    /* renamed from: a */
    public final /* synthetic */ int f897a;

    /* renamed from: b */
    public Object f898b;

    public /* synthetic */ HandlerC0341j(int i) {
        this.f897a = i;
    }

    /* renamed from: a */
    public void m946a(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0501  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        boolean zMo928d;
        boolean z2;
        Object objM951a;
        C0508o c0508o;
        C0373o c0373o;
        HandlerC0341j handlerC0341j;
        NetworkInfo activeNetworkInfo = null;
        ArrayList arrayList = null;
        int i = 0;
        int i2 = 25;
        int i3 = 1;
        switch (this.f897a) {
            case 0:
                int i4 = message.what;
                C0344m c0344m = (C0344m) this.f898b;
                switch (i4) {
                    case 1:
                        c0344m.m950d((C0345n) message.obj, true);
                        return;
                    case 2:
                        C0345n c0345n = (C0345n) message.obj;
                        c0344m.getClass();
                        String str = c0345n.f916c;
                        LinkedHashMap linkedHashMap = c0344m.f904d;
                        RunnableC0337f runnableC0337f = (RunnableC0337f) linkedHashMap.get(str);
                        C0354w c0354w = c0345n.f914a;
                        if (runnableC0337f != null) {
                            runnableC0337f.m944c(c0345n);
                            if (runnableC0337f.m943a()) {
                                linkedHashMap.remove(str);
                                c0354w.getClass();
                            }
                        }
                        if (c0344m.f907g.contains(c0345n.f917d)) {
                            c0344m.f906f.remove(c0345n.m951a());
                            c0354w.getClass();
                        }
                        C0345n c0345n2 = (C0345n) c0344m.f905e.remove(c0345n.m951a());
                        if (c0345n2 != null) {
                            c0345n2.f914a.getClass();
                            return;
                        }
                        return;
                    case 3:
                    case 8:
                    default:
                        C0354w.f929g.post(new RunnableC0340i(message, 0));
                        return;
                    case 4:
                        RunnableC0337f runnableC0337f2 = (RunnableC0337f) message.obj;
                        c0344m.getClass();
                        runnableC0337f2.getClass();
                        Bitmap bitmap = runnableC0337f2.f884l;
                        C0001b c0001b = c0344m.f910j;
                        c0001b.getClass();
                        String str2 = runnableC0337f2.f878f;
                        if (str2 == null || bitmap == null) {
                            throw new NullPointerException("key == null || bitmap == null");
                        }
                        C1268h c1268h = AbstractC0331H.f862a;
                        int allocationByteCount = bitmap.getAllocationByteCount();
                        if (allocationByteCount < 0) {
                            throw new IllegalStateException("Negative size: " + bitmap);
                        }
                        C0346o c0346o = (C0346o) c0001b.f2g;
                        if (allocationByteCount > c0346o.maxSize()) {
                            c0346o.remove(str2);
                        } else {
                            c0346o.put(str2, new C0347p(bitmap, allocationByteCount));
                        }
                        c0344m.f904d.remove(str2);
                        c0344m.m947a(runnableC0337f2);
                        runnableC0337f2.f874b.getClass();
                        return;
                    case 5:
                        RunnableC0337f runnableC0337f3 = (RunnableC0337f) message.obj;
                        c0344m.getClass();
                        Future future = runnableC0337f3.f885m;
                        if (future == null || !future.isCancelled()) {
                            C0356y c0356y = c0344m.f902b;
                            if (c0356y.isShutdown()) {
                                c0344m.m949c(runnableC0337f3, false);
                                return;
                            }
                            boolean z3 = c0344m.f913m;
                            if (z3) {
                                C1268h c1268h2 = AbstractC0331H.f862a;
                                activeNetworkInfo = ((ConnectivityManager) c0344m.f901a.getSystemService("connectivity")).getActiveNetworkInfo();
                            }
                            int i5 = runnableC0337f3.f889q;
                            AbstractC0325B abstractC0325B = runnableC0337f3.f881i;
                            if (i5 > 0) {
                                runnableC0337f3.f889q = i5 - 1;
                                zMo928d = abstractC0325B.mo928d(activeNetworkInfo);
                            } else {
                                zMo928d = false;
                            }
                            if (zMo928d) {
                                runnableC0337f3.f874b.getClass();
                                if (runnableC0337f3.f887o instanceof C0349r) {
                                    runnableC0337f3.f880h |= 1;
                                }
                                runnableC0337f3.f885m = c0356y.submit(runnableC0337f3);
                                return;
                            }
                            if (z3) {
                                abstractC0325B.getClass();
                                z2 = abstractC0325B instanceof C0351t;
                            }
                            c0344m.m949c(runnableC0337f3, z2);
                            if (z2) {
                                C0345n c0345n3 = runnableC0337f3.f882j;
                                WeakHashMap weakHashMap = c0344m.f905e;
                                if (c0345n3 != null && (objM951a = c0345n3.m951a()) != null) {
                                    c0345n3.f918e = true;
                                    weakHashMap.put(objM951a, c0345n3);
                                }
                                ArrayList arrayList2 = runnableC0337f3.f883k;
                                if (arrayList2 != null) {
                                    int size = arrayList2.size();
                                    while (i < size) {
                                        C0345n c0345n4 = (C0345n) arrayList2.get(i);
                                        Object objM951a2 = c0345n4.m951a();
                                        if (objM951a2 != null) {
                                            c0345n4.f918e = true;
                                            weakHashMap.put(objM951a2, c0345n4);
                                        }
                                        i++;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        c0344m.m949c((RunnableC0337f) message.obj, false);
                        return;
                    case 7:
                        c0344m.getClass();
                        ArrayList arrayList3 = c0344m.f912l;
                        ArrayList arrayList4 = new ArrayList(arrayList3);
                        arrayList3.clear();
                        HandlerC0352u handlerC0352u = c0344m.f909i;
                        handlerC0352u.sendMessage(handlerC0352u.obtainMessage(8, arrayList4));
                        if (arrayList4.isEmpty()) {
                            return;
                        }
                        ((RunnableC0337f) arrayList4.get(0)).f874b.getClass();
                        return;
                    case 9:
                        NetworkInfo networkInfo = (NetworkInfo) message.obj;
                        C0356y c0356y2 = c0344m.f902b;
                        if (c0356y2 instanceof C0356y) {
                            if (networkInfo != null) {
                                c0356y2.getClass();
                                if (networkInfo.isConnectedOrConnecting()) {
                                    int type = networkInfo.getType();
                                    if (type == 0) {
                                        int subtype = networkInfo.getSubtype();
                                        switch (subtype) {
                                            case 1:
                                            case 2:
                                                c0356y2.m955f(1);
                                                break;
                                            default:
                                                switch (subtype) {
                                                    case 12:
                                                        break;
                                                    case 13:
                                                    case 14:
                                                    case 15:
                                                        c0356y2.m955f(3);
                                                        break;
                                                    default:
                                                        c0356y2.m955f(3);
                                                        break;
                                                }
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                                c0356y2.m955f(2);
                                                break;
                                        }
                                    } else if (type == 1 || type == 6 || type == 9) {
                                        c0356y2.m955f(4);
                                    } else {
                                        c0356y2.m955f(3);
                                    }
                                } else {
                                    c0356y2.m955f(3);
                                }
                            }
                        }
                        if (networkInfo == null || !networkInfo.isConnected()) {
                            return;
                        }
                        WeakHashMap weakHashMap2 = c0344m.f905e;
                        if (weakHashMap2.isEmpty()) {
                            return;
                        }
                        Iterator it2 = weakHashMap2.values().iterator();
                        while (it2.hasNext()) {
                            C0345n c0345n5 = (C0345n) it2.next();
                            it2.remove();
                            c0345n5.f914a.getClass();
                            c0344m.m950d(c0345n5, false);
                        }
                        return;
                    case 10:
                        c0344m.getClass();
                        return;
                    case 11:
                        Object obj = message.obj;
                        if (c0344m.f907g.add(obj)) {
                            Iterator it3 = c0344m.f904d.values().iterator();
                            while (it3.hasNext()) {
                                RunnableC0337f runnableC0337f4 = (RunnableC0337f) it3.next();
                                runnableC0337f4.f874b.getClass();
                                C0345n c0345n6 = runnableC0337f4.f882j;
                                ArrayList arrayList5 = runnableC0337f4.f883k;
                                boolean z4 = (arrayList5 == null || arrayList5.isEmpty()) ? false : true;
                                if (c0345n6 != null || z4) {
                                    WeakHashMap weakHashMap3 = c0344m.f906f;
                                    if (c0345n6 != null && c0345n6.f917d.equals(obj)) {
                                        runnableC0337f4.m944c(c0345n6);
                                        weakHashMap3.put(c0345n6.m951a(), c0345n6);
                                    }
                                    if (z4) {
                                        for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                                            C0345n c0345n7 = (C0345n) arrayList5.get(size2);
                                            if (c0345n7.f917d.equals(obj)) {
                                                runnableC0337f4.m944c(c0345n7);
                                                weakHashMap3.put(c0345n7.m951a(), c0345n7);
                                            }
                                        }
                                    }
                                    if (runnableC0337f4.m943a()) {
                                        it3.remove();
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    case 12:
                        Object obj2 = message.obj;
                        if (c0344m.f907g.remove(obj2)) {
                            Iterator it4 = c0344m.f906f.values().iterator();
                            while (it4.hasNext()) {
                                C0345n c0345n8 = (C0345n) it4.next();
                                if (c0345n8.f917d.equals(obj2)) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(c0345n8);
                                    it4.remove();
                                }
                            }
                            if (arrayList != null) {
                                HandlerC0352u handlerC0352u2 = c0344m.f909i;
                                handlerC0352u2.sendMessage(handlerC0352u2.obtainMessage(13, arrayList));
                                return;
                            }
                            return;
                        }
                        return;
                }
            case 1:
                int i6 = message.what;
                C0326C c0326c = (C0326C) this.f898b;
                if (i6 == 0) {
                    c0326c.f836c++;
                    return;
                }
                if (i6 == 1) {
                    c0326c.f837d++;
                    return;
                }
                if (i6 == 2) {
                    long j2 = message.arg1;
                    int i7 = c0326c.f845l + 1;
                    c0326c.f845l = i7;
                    long j3 = c0326c.f839f + j2;
                    c0326c.f839f = j3;
                    c0326c.f842i = j3 / i7;
                    return;
                }
                if (i6 == 3) {
                    long j4 = message.arg1;
                    c0326c.f846m++;
                    long j5 = c0326c.f840g + j4;
                    c0326c.f840g = j5;
                    c0326c.f843j = j5 / c0326c.f845l;
                    return;
                }
                if (i6 != 4) {
                    C0354w.f929g.post(new RunnableC0340i(message, 1));
                    return;
                }
                Long l2 = (Long) message.obj;
                c0326c.f844k++;
                long jLongValue = l2.longValue() + c0326c.f838e;
                c0326c.f838e = jLongValue;
                c0326c.f841h = jLongValue / c0326c.f844k;
                return;
            case 2:
                if (message.what == 1) {
                    synchronized (((C0373o) this.f898b).f959a) {
                        c0508o = (C0508o) ((C0373o) this.f898b).f962d.get();
                        c0373o = (C0373o) this.f898b;
                        handlerC0341j = c0373o.f963e;
                    }
                    if (c0508o == null || c0373o != c0508o.m1218b() || handlerC0341j == null) {
                        return;
                    }
                    c0508o.mo1222f((C0730r) message.obj);
                    ((C0373o) this.f898b).m957a(c0508o, handlerC0341j);
                    c0508o.mo1222f(null);
                    return;
                }
                return;
            case 3:
                AbstractServiceC0729q abstractServiceC0729q = (AbstractServiceC0729q) this.f898b;
                if (abstractServiceC0729q == null) {
                    removeCallbacksAndMessages(null);
                    return;
                }
                abstractServiceC0729q.getClass();
                Bundle data = message.getData();
                int i8 = message.what;
                C0001b c0001b2 = abstractServiceC0729q.f2715g;
                switch (i8) {
                    case 1:
                        Bundle bundle = data.getBundle("data_root_hints");
                        C0513t.m1226j(bundle);
                        String string = data.getString("data_package_name");
                        int i9 = data.getInt("data_calling_pid");
                        int i10 = data.getInt("data_calling_uid");
                        C0001b c0001b3 = new C0001b(i2, message.replyTo);
                        AbstractServiceC0729q abstractServiceC0729q2 = (AbstractServiceC0729q) c0001b2.f2g;
                        if (string != null) {
                            String[] packagesForUid = abstractServiceC0729q2.getPackageManager().getPackagesForUid(i10);
                            int length = packagesForUid.length;
                            while (i < length) {
                                if (packagesForUid[i].equals(string)) {
                                    abstractServiceC0729q2.f2719k.m946a(new RunnableC0724l(c0001b2, c0001b3, string, i9, i10, bundle));
                                    return;
                                }
                                i++;
                            }
                        } else {
                            abstractServiceC0729q2.getClass();
                        }
                        throw new IllegalArgumentException("Package/uid mismatch: uid=" + i10 + " package=" + string);
                    case 2:
                        ((AbstractServiceC0729q) c0001b2.f2g).f2719k.m946a(new RunnableC0725m(c0001b2, new C0001b(i2, message.replyTo), i));
                        return;
                    case 3:
                        Bundle bundle2 = data.getBundle("data_options");
                        C0513t.m1226j(bundle2);
                        ((AbstractServiceC0729q) c0001b2.f2g).f2719k.m946a(new RunnableC0726n(c0001b2, new C0001b(i2, message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), bundle2));
                        return;
                    case 4:
                        ((AbstractServiceC0729q) c0001b2.f2g).f2719k.m946a(new RunnableC0727o(c0001b2, new C0001b(i2, message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), 0));
                        return;
                    case 5:
                        String string2 = data.getString("data_media_item_id");
                        C0662d c0662d = (C0662d) data.getParcelable("data_result_receiver");
                        C0001b c0001b4 = new C0001b(i2, message.replyTo);
                        c0001b2.getClass();
                        if (TextUtils.isEmpty(string2) || c0662d == null) {
                            return;
                        }
                        ((AbstractServiceC0729q) c0001b2.f2g).f2719k.m946a(new RunnableC0728p(c0001b2, c0001b4, string2, c0662d));
                        return;
                    case 6:
                        Bundle bundle3 = data.getBundle("data_root_hints");
                        C0513t.m1226j(bundle3);
                        ((AbstractServiceC0729q) c0001b2.f2g).f2719k.m946a(new RunnableC0724l(c0001b2, new C0001b(i2, message.replyTo), data.getInt("data_calling_uid"), data.getString("data_package_name"), data.getInt("data_calling_pid"), bundle3));
                        return;
                    case 7:
                        ((AbstractServiceC0729q) c0001b2.f2g).f2719k.m946a(new RunnableC0725m(c0001b2, new C0001b(i2, message.replyTo), i3));
                        return;
                    case 8:
                        Bundle bundle4 = data.getBundle("data_search_extras");
                        C0513t.m1226j(bundle4);
                        String string3 = data.getString("data_search_query");
                        C0662d c0662d2 = (C0662d) data.getParcelable("data_result_receiver");
                        C0001b c0001b5 = new C0001b(i2, message.replyTo);
                        c0001b2.getClass();
                        if (TextUtils.isEmpty(string3) || c0662d2 == null) {
                            return;
                        }
                        ((AbstractServiceC0729q) c0001b2.f2g).f2719k.m946a(new RunnableC0728p(c0001b2, c0001b5, string3, bundle4, c0662d2));
                        return;
                    case 9:
                        Bundle bundle5 = data.getBundle("data_custom_action_extras");
                        C0513t.m1226j(bundle5);
                        String string4 = data.getString("data_custom_action");
                        C0662d c0662d3 = (C0662d) data.getParcelable("data_result_receiver");
                        C0001b c0001b6 = new C0001b(i2, message.replyTo);
                        c0001b2.getClass();
                        if (TextUtils.isEmpty(string4) || c0662d3 == null) {
                            return;
                        }
                        ((AbstractServiceC0729q) c0001b2.f2g).f2719k.m946a(new RunnableC0726n(c0001b2, c0001b6, string4, bundle5, c0662d3));
                        return;
                    default:
                        Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                        return;
                }
            case 4:
                if (message.what != 1) {
                    return;
                }
                AbstractC0774r abstractC0774r = (AbstractC0774r) this.f898b;
                PreferenceScreen preferenceScreen = abstractC0774r.f2804a0.f2833g;
                if (preferenceScreen != null) {
                    abstractC0774r.f2805b0.setAdapter(new C0777u(preferenceScreen));
                    preferenceScreen.mo1659i();
                    return;
                }
                return;
            default:
                int i11 = message.what;
                if (i11 == -3 || i11 == -2 || i11 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f898b).get(), message.what);
                    return;
                } else {
                    if (i11 != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
        }
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message message, long j2) {
        switch (this.f897a) {
            case 3:
                Bundle data = message.getData();
                data.setClassLoader(C0488f.class.getClassLoader());
                data.putInt("data_calling_uid", Binder.getCallingUid());
                int callingPid = Binder.getCallingPid();
                if (callingPid > 0) {
                    data.putInt("data_calling_pid", callingPid);
                } else if (!data.containsKey("data_calling_pid")) {
                    data.putInt("data_calling_pid", -1);
                }
                break;
        }
        return super.sendMessageAtTime(message, j2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerC0341j(Looper looper, Object obj, int i) {
        super(looper);
        this.f897a = i;
        this.f898b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerC0341j(Object obj, Looper looper, int i) {
        super(looper);
        this.f897a = i;
        this.f898b = obj;
    }
}
