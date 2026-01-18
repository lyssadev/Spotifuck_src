package p093q;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: q.f */
/* loaded from: classes.dex */
public class C1240f implements Iterable {

    /* renamed from: a */
    public C1237c f4931a;

    /* renamed from: b */
    public C1237c f4932b;

    /* renamed from: c */
    public final WeakHashMap f4933c = new WeakHashMap();

    /* renamed from: d */
    public int f4934d = 0;

    /* renamed from: a */
    public C1237c mo2932a(Object obj) {
        C1237c c1237c = this.f4931a;
        while (c1237c != null && !c1237c.f4924a.equals(obj)) {
            c1237c = c1237c.f4926c;
        }
        return c1237c;
    }

    /* renamed from: b */
    public Object mo2933b(Object obj) {
        C1237c c1237cMo2932a = mo2932a(obj);
        if (c1237cMo2932a == null) {
            return null;
        }
        this.f4934d--;
        WeakHashMap weakHashMap = this.f4933c;
        if (!weakHashMap.isEmpty()) {
            Iterator it2 = weakHashMap.keySet().iterator();
            while (it2.hasNext()) {
                ((AbstractC1239e) it2.next()).mo2934a(c1237cMo2932a);
            }
        }
        C1237c c1237c = c1237cMo2932a.f4927d;
        if (c1237c != null) {
            c1237c.f4926c = c1237cMo2932a.f4926c;
        } else {
            this.f4931a = c1237cMo2932a.f4926c;
        }
        C1237c c1237c2 = c1237cMo2932a.f4926c;
        if (c1237c2 != null) {
            c1237c2.f4927d = c1237c;
        } else {
            this.f4932b = c1237c;
        }
        c1237cMo2932a.f4926c = null;
        c1237cMo2932a.f4927d = null;
        return c1237cMo2932a.f4925b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((p093q.C1236b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1240f)) {
            return false;
        }
        C1240f c1240f = (C1240f) obj;
        if (this.f4934d != c1240f.f4934d) {
            return false;
        }
        Iterator it2 = iterator();
        Iterator it3 = c1240f.iterator();
        while (true) {
            C1236b c1236b = (C1236b) it2;
            if (!c1236b.hasNext()) {
                break;
            }
            C1236b c1236b2 = (C1236b) it3;
            if (!c1236b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c1236b.next();
            Object next = c1236b2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                break;
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it2 = iterator();
        int iHashCode = 0;
        while (true) {
            C1236b c1236b = (C1236b) it2;
            if (!c1236b.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c1236b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1236b c1236b = new C1236b(this.f4931a, this.f4932b, 0);
        this.f4933c.put(c1236b, Boolean.FALSE);
        return c1236b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it2 = iterator();
        while (true) {
            C1236b c1236b = (C1236b) it2;
            if (!c1236b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c1236b.next()).toString());
            if (c1236b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
