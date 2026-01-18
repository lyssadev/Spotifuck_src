package p068h;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p015J.C0121f;
import p096r.C1248c;
import p096r.C1252g;

/* renamed from: h.s */
/* loaded from: classes.dex */
public abstract class AbstractC0848s {

    /* renamed from: f */
    public static final ExecutorC0846q f3297f = new ExecutorC0846q(new ExecutorC0847r());

    /* renamed from: g */
    public static final int f3298g = -100;

    /* renamed from: h */
    public static C0121f f3299h = null;

    /* renamed from: i */
    public static C0121f f3300i = null;

    /* renamed from: j */
    public static Boolean f3301j = null;

    /* renamed from: k */
    public static boolean f3302k = false;

    /* renamed from: l */
    public static final C1248c f3303l = new C1248c(0);

    /* renamed from: m */
    public static final Object f3304m = new Object();

    /* renamed from: n */
    public static final Object f3305n = new Object();

    /* renamed from: a */
    public static boolean m2131a(Context context) {
        if (f3301j == null) {
            try {
                int i = AbstractServiceC0824I.f3173f;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC0824I.class), Build.VERSION.SDK_INT >= 24 ? AbstractC0823H.m2089a() | 128 : 640).metaData;
                if (bundle != null) {
                    f3301j = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f3301j = Boolean.FALSE;
            }
        }
        return f3301j.booleanValue();
    }

    /* renamed from: e */
    public static void m2132e(LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D) {
        synchronized (f3304m) {
            try {
                Iterator it2 = f3303l.iterator();
                while (true) {
                    C1252g c1252g = (C1252g) it2;
                    if (c1252g.hasNext()) {
                        AbstractC0848s abstractC0848s = (AbstractC0848s) ((WeakReference) c1252g.next()).get();
                        if (abstractC0848s == layoutInflaterFactory2C0819D || abstractC0848s == null) {
                            c1252g.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public abstract void mo2067b();

    /* renamed from: c */
    public abstract void mo2068c();

    /* renamed from: g */
    public abstract boolean mo2071g(int i);

    /* renamed from: h */
    public abstract void mo2072h(int i);

    /* renamed from: i */
    public abstract void mo2073i(View view);

    /* renamed from: j */
    public abstract void mo2074j(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: k */
    public abstract void mo2075k(CharSequence charSequence);
}
