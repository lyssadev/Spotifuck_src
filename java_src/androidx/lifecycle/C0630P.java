package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: androidx.lifecycle.P */
/* loaded from: classes.dex */
public final class C0630P {

    /* renamed from: a */
    public final LinkedHashMap f1987a = new LinkedHashMap();

    /* renamed from: a */
    public final void m1608a() {
        for (AbstractC0627M abstractC0627M : this.f1987a.values()) {
            abstractC0627M.getClass();
            HashMap map = abstractC0627M.f1983a;
            if (map != null) {
                synchronized (map) {
                    try {
                        Iterator it2 = abstractC0627M.f1983a.values().iterator();
                        while (it2.hasNext()) {
                            AbstractC0627M.m1607a(it2.next());
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = abstractC0627M.f1984b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it3 = abstractC0627M.f1984b.iterator();
                        while (it3.hasNext()) {
                            AbstractC0627M.m1607a((Closeable) it3.next());
                        }
                    } finally {
                    }
                }
            }
            abstractC0627M.mo1516b();
        }
        this.f1987a.clear();
    }
}
