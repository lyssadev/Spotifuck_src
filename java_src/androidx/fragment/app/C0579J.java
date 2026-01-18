package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.AbstractC0627M;
import androidx.lifecycle.C0630P;
import java.util.HashMap;
import java.util.Iterator;
import p018K0.C0146e;

/* renamed from: androidx.fragment.app.J */
/* loaded from: classes.dex */
public final class C0579J extends AbstractC0627M {

    /* renamed from: i */
    public static final C0146e f1758i = new C0146e(15);

    /* renamed from: f */
    public final boolean f1762f;

    /* renamed from: c */
    public final HashMap f1759c = new HashMap();

    /* renamed from: d */
    public final HashMap f1760d = new HashMap();

    /* renamed from: e */
    public final HashMap f1761e = new HashMap();

    /* renamed from: g */
    public boolean f1763g = false;

    /* renamed from: h */
    public boolean f1764h = false;

    public C0579J(boolean z2) {
        this.f1762f = z2;
    }

    @Override // androidx.lifecycle.AbstractC0627M
    /* renamed from: b */
    public final void mo1516b() {
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        this.f1763g = true;
    }

    /* renamed from: c */
    public final void m1517c(String str) {
        HashMap map = this.f1760d;
        C0579J c0579j = (C0579J) map.get(str);
        if (c0579j != null) {
            c0579j.mo1516b();
            map.remove(str);
        }
        HashMap map2 = this.f1761e;
        C0630P c0630p = (C0630P) map2.get(str);
        if (c0630p != null) {
            c0630p.m1608a();
            map2.remove(str);
        }
    }

    /* renamed from: d */
    public final void m1518d(AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r) {
        if (this.f1764h) {
            Log.isLoggable("FragmentManager", 2);
        } else {
            if (this.f1759c.remove(abstractComponentCallbacksC0606r.f1922j) == null || !Log.isLoggable("FragmentManager", 2)) {
                return;
            }
            abstractComponentCallbacksC0606r.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0579J.class != obj.getClass()) {
            return false;
        }
        C0579J c0579j = (C0579J) obj;
        return this.f1759c.equals(c0579j.f1759c) && this.f1760d.equals(c0579j.f1760d) && this.f1761e.equals(c0579j.f1761e);
    }

    public final int hashCode() {
        return this.f1761e.hashCode() + ((this.f1760d.hashCode() + (this.f1759c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it2 = this.f1759c.values().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it3 = this.f1760d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it4 = this.f1761e.keySet().iterator();
        while (it4.hasNext()) {
            sb.append((String) it4.next());
            if (it4.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
