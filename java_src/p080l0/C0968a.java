package p080l0;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.fragment.app.C0605q;
import it.deviato.spotifuck.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p036T0.AbstractC0411g;

/* renamed from: l0.a */
/* loaded from: classes.dex */
public final class C0968a {

    /* renamed from: d */
    public static volatile C0968a f3940d;

    /* renamed from: e */
    public static final Object f3941e = new Object();

    /* renamed from: c */
    public final Context f3944c;

    /* renamed from: b */
    public final HashSet f3943b = new HashSet();

    /* renamed from: a */
    public final HashMap f3942a = new HashMap();

    public C0968a(Context context) {
        this.f3944c = context.getApplicationContext();
    }

    /* renamed from: c */
    public static C0968a m2466c(Context context) {
        if (f3940d == null) {
            synchronized (f3941e) {
                try {
                    if (f3940d == null) {
                        f3940d = new C0968a(context);
                    }
                } finally {
                }
            }
        }
        return f3940d;
    }

    /* renamed from: a */
    public final void m2467a(Bundle bundle) throws ClassNotFoundException {
        HashSet hashSet;
        String string = this.f3944c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it2 = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    hashSet = this.f3943b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it2.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0969b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    m2468b((Class) it3.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new C0605q(e);
            }
        }
    }

    /* renamed from: b */
    public final Object m2468b(Class cls, HashSet hashSet) {
        Object objMo1416b;
        if (AbstractC0411g.m1044w()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = this.f3942a;
        if (map.containsKey(cls)) {
            objMo1416b = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0969b interfaceC0969b = (InterfaceC0969b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listMo1415a = interfaceC0969b.mo1415a();
                if (!listMo1415a.isEmpty()) {
                    for (Class cls2 : listMo1415a) {
                        if (!map.containsKey(cls2)) {
                            m2468b(cls2, hashSet);
                        }
                    }
                }
                objMo1416b = interfaceC0969b.mo1416b(this.f3944c);
                hashSet.remove(cls);
                map.put(cls, objMo1416b);
            } catch (Throwable th2) {
                throw new C0605q(th2);
            }
        }
        Trace.endSection();
        return objMo1416b;
    }
}
