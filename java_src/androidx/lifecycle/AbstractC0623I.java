package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import java.util.Iterator;
import java.util.Map;
import p047Z0.AbstractC0469c;
import p077k0.InterfaceC0957b;
import p077k0.InterfaceC0960e;
import p093q.C1236b;
import p093q.C1240f;

/* renamed from: androidx.lifecycle.I */
/* loaded from: classes.dex */
public abstract class AbstractC0623I {

    /* renamed from: a */
    public static final C0628N f1973a = new C0628N();

    /* renamed from: b */
    public static final C0628N f1974b = new C0628N();

    /* renamed from: c */
    public static final C0628N f1975c = new C0628N();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m1602a(Activity activity, EnumC0644l enumC0644l) {
        AbstractC0469c.m1102e("activity", activity);
        AbstractC0469c.m1102e("event", enumC0644l);
        if (activity instanceof InterfaceC0650r) {
            C0652t c0652tMo1299d = ((InterfaceC0650r) activity).mo1299d();
            if (c0652tMo1299d instanceof C0652t) {
                c0652tMo1299d.m1618d(enumC0644l);
            }
        }
    }

    /* renamed from: b */
    public static final void m1603b(InterfaceC0960e interfaceC0960e) {
        InterfaceC0957b interfaceC0957b;
        EnumC0645m enumC0645m = interfaceC0960e.mo1299d().f2012c;
        if (enumC0645m != EnumC0645m.f2002b && enumC0645m != EnumC0645m.f2003c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Iterator it2 = ((C1240f) interfaceC0960e.mo1297b().f3915d).iterator();
        while (true) {
            C1236b c1236b = (C1236b) it2;
            if (!c1236b.hasNext()) {
                interfaceC0957b = null;
                break;
            }
            Map.Entry entry = (Map.Entry) c1236b.next();
            AbstractC0469c.m1101d("components", entry);
            String str = (String) entry.getKey();
            interfaceC0957b = (InterfaceC0957b) entry.getValue();
            if (AbstractC0469c.m1098a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (interfaceC0957b == null) {
            C0624J c0624j = new C0624J(interfaceC0960e.mo1297b(), (InterfaceC0631Q) interfaceC0960e);
            interfaceC0960e.mo1297b().m2443e("androidx.lifecycle.internal.SavedStateHandlesProvider", c0624j);
            interfaceC0960e.mo1299d().m1615a(new SavedStateHandleAttacher(c0624j));
        }
    }

    /* renamed from: c */
    public static void m1604c(Activity activity) {
        AbstractC0469c.m1102e("activity", activity);
        if (Build.VERSION.SDK_INT >= 29) {
            C0619E.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new C0619E());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0620F(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
