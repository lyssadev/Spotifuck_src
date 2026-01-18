package androidx.fragment.app;

import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.media.session.C0513t;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0517A;
import androidx.activity.C0524f;
import androidx.activity.C0530l;
import androidx.activity.C0544z;
import androidx.activity.InterfaceC0518B;
import androidx.activity.InterfaceC0521c;
import androidx.lifecycle.EnumC0645m;
import androidx.lifecycle.InterfaceC0631Q;
import it.deviato.spotifuck.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p000A.C0010k;
import p003C.C0022i;
import p003C.C0035v;
import p003C.InterfaceC0033t;
import p003C.InterfaceC0034u;
import p005D.InterfaceC0045f;
import p005D.InterfaceC0046g;
import p007E.C0057j;
import p018K0.C0146e;
import p021M.InterfaceC0180a;
import p023N.InterfaceC0237l;
import p024N0.RunnableC0268B;
import p030Q0.AbstractC0328E;
import p032R0.C0366h;
import p046Z.AbstractC0464d;
import p047Z0.AbstractC0469c;
import p055c0.C0673a;
import p057d.InterfaceC0712d;
import p068h.AbstractActivityC0841l;
import p077k0.C0958c;
import p077k0.InterfaceC0960e;
import p096r.C1257l;

/* renamed from: androidx.fragment.app.H */
/* loaded from: classes.dex */
public final class C0577H {

    /* renamed from: A */
    public C0057j f1711A;

    /* renamed from: B */
    public C0057j f1712B;

    /* renamed from: C */
    public ArrayDeque f1713C;

    /* renamed from: D */
    public boolean f1714D;

    /* renamed from: E */
    public boolean f1715E;

    /* renamed from: F */
    public boolean f1716F;

    /* renamed from: G */
    public boolean f1717G;

    /* renamed from: H */
    public boolean f1718H;

    /* renamed from: I */
    public ArrayList f1719I;

    /* renamed from: J */
    public ArrayList f1720J;

    /* renamed from: K */
    public ArrayList f1721K;

    /* renamed from: L */
    public C0579J f1722L;

    /* renamed from: M */
    public final RunnableC0268B f1723M;

    /* renamed from: b */
    public boolean f1725b;

    /* renamed from: d */
    public ArrayList f1727d;

    /* renamed from: e */
    public ArrayList f1728e;

    /* renamed from: g */
    public C0517A f1730g;

    /* renamed from: l */
    public final C0057j f1735l;

    /* renamed from: m */
    public final CopyOnWriteArrayList f1736m;

    /* renamed from: n */
    public final C0613y f1737n;

    /* renamed from: o */
    public final C0613y f1738o;

    /* renamed from: p */
    public final C0613y f1739p;

    /* renamed from: q */
    public final C0613y f1740q;

    /* renamed from: r */
    public final C0570A f1741r;

    /* renamed from: s */
    public int f1742s;

    /* renamed from: t */
    public C0608t f1743t;

    /* renamed from: u */
    public AbstractC0610v f1744u;

    /* renamed from: v */
    public AbstractComponentCallbacksC0606r f1745v;

    /* renamed from: w */
    public AbstractComponentCallbacksC0606r f1746w;

    /* renamed from: x */
    public final C0571B f1747x;

    /* renamed from: y */
    public final C0146e f1748y;

    /* renamed from: z */
    public C0057j f1749z;

    /* renamed from: a */
    public final ArrayList f1724a = new ArrayList();

    /* renamed from: c */
    public final C0010k f1726c = new C0010k(3);

    /* renamed from: f */
    public final LayoutInflaterFactory2C0612x f1729f = new LayoutInflaterFactory2C0612x(this);

    /* renamed from: h */
    public final C0366h f1731h = new C0366h(this);

    /* renamed from: i */
    public final AtomicInteger f1732i = new AtomicInteger();

    /* renamed from: j */
    public final Map f1733j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k */
    public final Map f1734k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.fragment.app.y] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.y] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.fragment.app.y] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.y] */
    public C0577H() {
        Collections.synchronizedMap(new HashMap());
        this.f1735l = new C0057j(this);
        this.f1736m = new CopyOnWriteArrayList();
        final int i = 0;
        this.f1737n = new InterfaceC0180a(this) { // from class: androidx.fragment.app.y

            /* renamed from: b */
            public final /* synthetic */ C0577H f1955b;

            {
                this.f1955b = this;
            }

            @Override // p021M.InterfaceC0180a
            /* renamed from: a */
            public final void mo485a(Object obj) {
                switch (i) {
                    case 0:
                        C0577H c0577h = this.f1955b;
                        if (c0577h.m1472G()) {
                            c0577h.m1497h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        C0577H c0577h2 = this.f1955b;
                        if (c0577h2.m1472G() && num.intValue() == 80) {
                            c0577h2.m1501l(false);
                            break;
                        }
                        break;
                    case 2:
                        C0022i c0022i = (C0022i) obj;
                        C0577H c0577h3 = this.f1955b;
                        if (c0577h3.m1472G()) {
                            c0577h3.m1502m(c0022i.f58a, false);
                            break;
                        }
                        break;
                    default:
                        C0035v c0035v = (C0035v) obj;
                        C0577H c0577h4 = this.f1955b;
                        if (c0577h4.m1472G()) {
                            c0577h4.m1507r(c0035v.f84a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f1738o = new InterfaceC0180a(this) { // from class: androidx.fragment.app.y

            /* renamed from: b */
            public final /* synthetic */ C0577H f1955b;

            {
                this.f1955b = this;
            }

            @Override // p021M.InterfaceC0180a
            /* renamed from: a */
            public final void mo485a(Object obj) {
                switch (i2) {
                    case 0:
                        C0577H c0577h = this.f1955b;
                        if (c0577h.m1472G()) {
                            c0577h.m1497h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        C0577H c0577h2 = this.f1955b;
                        if (c0577h2.m1472G() && num.intValue() == 80) {
                            c0577h2.m1501l(false);
                            break;
                        }
                        break;
                    case 2:
                        C0022i c0022i = (C0022i) obj;
                        C0577H c0577h3 = this.f1955b;
                        if (c0577h3.m1472G()) {
                            c0577h3.m1502m(c0022i.f58a, false);
                            break;
                        }
                        break;
                    default:
                        C0035v c0035v = (C0035v) obj;
                        C0577H c0577h4 = this.f1955b;
                        if (c0577h4.m1472G()) {
                            c0577h4.m1507r(c0035v.f84a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f1739p = new InterfaceC0180a(this) { // from class: androidx.fragment.app.y

            /* renamed from: b */
            public final /* synthetic */ C0577H f1955b;

            {
                this.f1955b = this;
            }

            @Override // p021M.InterfaceC0180a
            /* renamed from: a */
            public final void mo485a(Object obj) {
                switch (i3) {
                    case 0:
                        C0577H c0577h = this.f1955b;
                        if (c0577h.m1472G()) {
                            c0577h.m1497h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        C0577H c0577h2 = this.f1955b;
                        if (c0577h2.m1472G() && num.intValue() == 80) {
                            c0577h2.m1501l(false);
                            break;
                        }
                        break;
                    case 2:
                        C0022i c0022i = (C0022i) obj;
                        C0577H c0577h3 = this.f1955b;
                        if (c0577h3.m1472G()) {
                            c0577h3.m1502m(c0022i.f58a, false);
                            break;
                        }
                        break;
                    default:
                        C0035v c0035v = (C0035v) obj;
                        C0577H c0577h4 = this.f1955b;
                        if (c0577h4.m1472G()) {
                            c0577h4.m1507r(c0035v.f84a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f1740q = new InterfaceC0180a(this) { // from class: androidx.fragment.app.y

            /* renamed from: b */
            public final /* synthetic */ C0577H f1955b;

            {
                this.f1955b = this;
            }

            @Override // p021M.InterfaceC0180a
            /* renamed from: a */
            public final void mo485a(Object obj) {
                switch (i4) {
                    case 0:
                        C0577H c0577h = this.f1955b;
                        if (c0577h.m1472G()) {
                            c0577h.m1497h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        C0577H c0577h2 = this.f1955b;
                        if (c0577h2.m1472G() && num.intValue() == 80) {
                            c0577h2.m1501l(false);
                            break;
                        }
                        break;
                    case 2:
                        C0022i c0022i = (C0022i) obj;
                        C0577H c0577h3 = this.f1955b;
                        if (c0577h3.m1472G()) {
                            c0577h3.m1502m(c0022i.f58a, false);
                            break;
                        }
                        break;
                    default:
                        C0035v c0035v = (C0035v) obj;
                        C0577H c0577h4 = this.f1955b;
                        if (c0577h4.m1472G()) {
                            c0577h4.m1507r(c0035v.f84a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f1741r = new C0570A(this);
        this.f1742s = -1;
        this.f1747x = new C0571B(this);
        this.f1748y = new C0146e(14);
        this.f1713C = new ArrayDeque();
        this.f1723M = new RunnableC0268B(6, this);
    }

    /* renamed from: F */
    public static boolean m1464F(AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r) {
        abstractComponentCallbacksC0606r.getClass();
        Iterator it2 = abstractComponentCallbacksC0606r.f1937y.f1726c.m86h().iterator();
        boolean zM1464F = false;
        while (it2.hasNext()) {
            AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r2 = (AbstractComponentCallbacksC0606r) it2.next();
            if (abstractComponentCallbacksC0606r2 != null) {
                zM1464F = m1464F(abstractComponentCallbacksC0606r2);
            }
            if (zM1464F) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: H */
    public static boolean m1465H(AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r) {
        if (abstractComponentCallbacksC0606r == null) {
            return true;
        }
        return abstractComponentCallbacksC0606r.f1900G && (abstractComponentCallbacksC0606r.f1935w == null || m1465H(abstractComponentCallbacksC0606r.f1938z));
    }

    /* renamed from: I */
    public static boolean m1466I(AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r) {
        if (abstractComponentCallbacksC0606r == null) {
            return true;
        }
        C0577H c0577h = abstractComponentCallbacksC0606r.f1935w;
        return abstractComponentCallbacksC0606r.equals(c0577h.f1746w) && m1466I(c0577h.f1745v);
    }

    /* renamed from: A */
    public final AbstractComponentCallbacksC0606r m1467A(String str) {
        C0010k c0010k = this.f1726c;
        ArrayList arrayList = (ArrayList) c0010k.f25h;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = (AbstractComponentCallbacksC0606r) arrayList.get(size);
            if (abstractComponentCallbacksC0606r != null && str.equals(abstractComponentCallbacksC0606r.f1896C)) {
                return abstractComponentCallbacksC0606r;
            }
        }
        for (C0582M c0582m : ((HashMap) c0010k.f23f).values()) {
            if (c0582m != null) {
                AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r2 = c0582m.f1780c;
                if (str.equals(abstractComponentCallbacksC0606r2.f1896C)) {
                    return abstractComponentCallbacksC0606r2;
                }
            }
        }
        return null;
    }

    /* renamed from: B */
    public final ViewGroup m1468B(AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r) {
        ViewGroup viewGroup = abstractComponentCallbacksC0606r.f1902I;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0606r.f1895B > 0 && this.f1744u.mo1564f()) {
            View viewMo1563e = this.f1744u.mo1563e(abstractComponentCallbacksC0606r.f1895B);
            if (viewMo1563e instanceof ViewGroup) {
                return (ViewGroup) viewMo1563e;
            }
        }
        return null;
    }

    /* renamed from: C */
    public final C0571B m1469C() {
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = this.f1745v;
        return abstractComponentCallbacksC0606r != null ? abstractComponentCallbacksC0606r.f1935w.m1469C() : this.f1747x;
    }

    /* renamed from: D */
    public final C0146e m1470D() {
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = this.f1745v;
        return abstractComponentCallbacksC0606r != null ? abstractComponentCallbacksC0606r.f1935w.m1470D() : this.f1748y;
    }

    /* renamed from: E */
    public final void m1471E(AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(abstractComponentCallbacksC0606r);
        }
        if (abstractComponentCallbacksC0606r.f1897D) {
            return;
        }
        abstractComponentCallbacksC0606r.f1897D = true;
        abstractComponentCallbacksC0606r.f1907N = true ^ abstractComponentCallbacksC0606r.f1907N;
        m1486W(abstractComponentCallbacksC0606r);
    }

    /* renamed from: G */
    public final boolean m1472G() {
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = this.f1745v;
        if (abstractComponentCallbacksC0606r == null) {
            return true;
        }
        return abstractComponentCallbacksC0606r.m1595o() && this.f1745v.m1590j().m1472G();
    }

    /* renamed from: J */
    public final void m1473J(int i, boolean z2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        HashMap map;
        C0608t c0608t;
        if (this.f1743t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i != this.f1742s) {
            this.f1742s = i;
            C0010k c0010k = this.f1726c;
            Iterator it2 = ((ArrayList) c0010k.f25h).iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                map = (HashMap) c0010k.f23f;
                if (!zHasNext) {
                    break;
                }
                C0582M c0582m = (C0582M) map.get(((AbstractComponentCallbacksC0606r) it2.next()).f1922j);
                if (c0582m != null) {
                    c0582m.m1529k();
                }
            }
            for (C0582M c0582m2 : map.values()) {
                if (c0582m2 != null) {
                    c0582m2.m1529k();
                    AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = c0582m2.f1780c;
                    if (abstractComponentCallbacksC0606r.f1929q && !abstractComponentCallbacksC0606r.m1597q()) {
                        c0010k.m90l(c0582m2);
                    }
                }
            }
            m1487X();
            if (this.f1714D && (c0608t = this.f1743t) != null && this.f1742s == 7) {
                c0608t.f1945j.invalidateOptionsMenu();
                this.f1714D = false;
            }
        }
    }

    /* renamed from: K */
    public final void m1474K() {
        if (this.f1743t == null) {
            return;
        }
        this.f1715E = false;
        this.f1716F = false;
        this.f1722L.f1764h = false;
        for (AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r : this.f1726c.m87i()) {
            if (abstractComponentCallbacksC0606r != null) {
                abstractComponentCallbacksC0606r.f1937y.m1474K();
            }
        }
    }

    /* renamed from: L */
    public final boolean m1475L() {
        return m1476M(-1, 0);
    }

    /* renamed from: M */
    public final boolean m1476M(int i, int i2) {
        m1513x(false);
        m1512w(true);
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = this.f1746w;
        if (abstractComponentCallbacksC0606r != null && i < 0 && abstractComponentCallbacksC0606r.m1587g().m1475L()) {
            return true;
        }
        boolean zM1477N = m1477N(this.f1719I, this.f1720J, i, i2);
        if (zM1477N) {
            this.f1725b = true;
            try {
                m1479P(this.f1719I, this.f1720J);
            } finally {
                m1493d();
            }
        }
        m1489Z();
        if (this.f1718H) {
            this.f1718H = false;
            m1487X();
        }
        ((HashMap) this.f1726c.f23f).values().removeAll(Collections.singleton(null));
        return zM1477N;
    }

    /* renamed from: N */
    public final boolean m1477N(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z2 = (i2 & 1) != 0;
        ArrayList arrayList3 = this.f1727d;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                size = z2 ? 0 : this.f1727d.size() - 1;
            } else {
                int size2 = this.f1727d.size() - 1;
                while (size2 >= 0) {
                    C0589a c0589a = (C0589a) this.f1727d.get(size2);
                    if (i >= 0 && i == c0589a.f1826s) {
                        break;
                    }
                    size2--;
                }
                if (size2 >= 0) {
                    if (z2) {
                        while (size2 > 0) {
                            C0589a c0589a2 = (C0589a) this.f1727d.get(size2 - 1);
                            if (i < 0 || i != c0589a2.f1826s) {
                                break;
                            }
                            size2--;
                        }
                    } else if (size2 != this.f1727d.size() - 1) {
                        size2++;
                    }
                    size = size2;
                } else {
                    size = size2;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f1727d.size() - 1; size3 >= size; size3--) {
            arrayList.add((C0589a) this.f1727d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* renamed from: O */
    public final void m1478O(AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(abstractComponentCallbacksC0606r);
            int i = abstractComponentCallbacksC0606r.f1934v;
        }
        boolean zM1597q = abstractComponentCallbacksC0606r.m1597q();
        if (abstractComponentCallbacksC0606r.f1898E && zM1597q) {
            return;
        }
        C0010k c0010k = this.f1726c;
        synchronized (((ArrayList) c0010k.f25h)) {
            ((ArrayList) c0010k.f25h).remove(abstractComponentCallbacksC0606r);
        }
        abstractComponentCallbacksC0606r.f1928p = false;
        if (m1464F(abstractComponentCallbacksC0606r)) {
            this.f1714D = true;
        }
        abstractComponentCallbacksC0606r.f1929q = true;
        m1486W(abstractComponentCallbacksC0606r);
    }

    /* renamed from: P */
    public final void m1479P(ArrayList arrayList, ArrayList arrayList2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((C0589a) arrayList.get(i)).f1823p) {
                if (i2 != i) {
                    m1514y(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0589a) arrayList.get(i2)).f1823p) {
                        i2++;
                    }
                }
                m1514y(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m1514y(arrayList, arrayList2, i2, size);
        }
    }

    /* renamed from: Q */
    public final void m1480Q(Parcelable parcelable) {
        C0057j c0057j;
        C0582M c0582m;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f1743t.f1942g.getClassLoader());
                this.f1734k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f1743t.f1942g.getClassLoader());
                arrayList.add((C0581L) bundle.getParcelable("state"));
            }
        }
        C0010k c0010k = this.f1726c;
        HashMap map = (HashMap) c0010k.f24g;
        map.clear();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0581L c0581l = (C0581L) it2.next();
            map.put(c0581l.f1766b, c0581l);
        }
        C0578I c0578i = (C0578I) bundle3.getParcelable("state");
        if (c0578i == null) {
            return;
        }
        HashMap map2 = (HashMap) c0010k.f23f;
        map2.clear();
        Iterator it3 = c0578i.f1750a.iterator();
        while (true) {
            boolean zHasNext = it3.hasNext();
            c0057j = this.f1735l;
            if (!zHasNext) {
                break;
            }
            C0581L c0581l2 = (C0581L) ((HashMap) c0010k.f24g).remove((String) it3.next());
            if (c0581l2 != null) {
                AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = (AbstractComponentCallbacksC0606r) this.f1722L.f1759c.get(c0581l2.f1766b);
                if (abstractComponentCallbacksC0606r != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        abstractComponentCallbacksC0606r.toString();
                    }
                    c0582m = new C0582M(c0057j, c0010k, abstractComponentCallbacksC0606r, c0581l2);
                } else {
                    c0582m = new C0582M(this.f1735l, this.f1726c, this.f1743t.f1942g.getClassLoader(), m1469C(), c0581l2);
                }
                AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r2 = c0582m.f1780c;
                abstractComponentCallbacksC0606r2.f1935w = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    abstractComponentCallbacksC0606r2.toString();
                }
                c0582m.m1531m(this.f1743t.f1942g.getClassLoader());
                c0010k.m89k(c0582m);
                c0582m.f1782e = this.f1742s;
            }
        }
        C0579J c0579j = this.f1722L;
        c0579j.getClass();
        Iterator it4 = new ArrayList(c0579j.f1759c.values()).iterator();
        while (it4.hasNext()) {
            AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r3 = (AbstractComponentCallbacksC0606r) it4.next();
            if (map2.get(abstractComponentCallbacksC0606r3.f1922j) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    abstractComponentCallbacksC0606r3.toString();
                    Objects.toString(c0578i.f1750a);
                }
                this.f1722L.m1518d(abstractComponentCallbacksC0606r3);
                abstractComponentCallbacksC0606r3.f1935w = this;
                C0582M c0582m2 = new C0582M(c0057j, c0010k, abstractComponentCallbacksC0606r3);
                c0582m2.f1782e = 1;
                c0582m2.m1529k();
                abstractComponentCallbacksC0606r3.f1929q = true;
                c0582m2.m1529k();
            }
        }
        ArrayList<String> arrayList2 = c0578i.f1751b;
        ((ArrayList) c0010k.f25h).clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606rM82d = c0010k.m82d(str3);
                if (abstractComponentCallbacksC0606rM82d == null) {
                    throw new IllegalStateException(AbstractC0328E.m937g("No instantiated fragment for (", str3, ")"));
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    abstractComponentCallbacksC0606rM82d.toString();
                }
                c0010k.m79a(abstractComponentCallbacksC0606rM82d);
            }
        }
        if (c0578i.f1752c != null) {
            this.f1727d = new ArrayList(c0578i.f1752c.length);
            int i = 0;
            while (true) {
                C0590b[] c0590bArr = c0578i.f1752c;
                if (i >= c0590bArr.length) {
                    break;
                }
                C0590b c0590b = c0590bArr[i];
                c0590b.getClass();
                C0589a c0589a = new C0589a(this);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int[] iArr = c0590b.f1827a;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    C0583N c0583n = new C0583N();
                    int i4 = i2 + 1;
                    c0583n.f1783a = iArr[i2];
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(c0589a);
                        int i5 = iArr[i4];
                    }
                    c0583n.f1790h = EnumC0645m.values()[c0590b.f1829c[i3]];
                    c0583n.f1791i = EnumC0645m.values()[c0590b.f1830d[i3]];
                    int i6 = i2 + 2;
                    c0583n.f1785c = iArr[i4] != 0;
                    int i7 = iArr[i6];
                    c0583n.f1786d = i7;
                    int i8 = iArr[i2 + 3];
                    c0583n.f1787e = i8;
                    int i9 = i2 + 5;
                    int i10 = iArr[i2 + 4];
                    c0583n.f1788f = i10;
                    i2 += 6;
                    int i11 = iArr[i9];
                    c0583n.f1789g = i11;
                    c0589a.f1809b = i7;
                    c0589a.f1810c = i8;
                    c0589a.f1811d = i10;
                    c0589a.f1812e = i11;
                    c0589a.m1543b(c0583n);
                    i3++;
                }
                c0589a.f1813f = c0590b.f1831e;
                c0589a.f1816i = c0590b.f1832f;
                c0589a.f1814g = true;
                c0589a.f1817j = c0590b.f1834h;
                c0589a.f1818k = c0590b.f1835i;
                c0589a.f1819l = c0590b.f1836j;
                c0589a.f1820m = c0590b.f1837k;
                c0589a.f1821n = c0590b.f1838l;
                c0589a.f1822o = c0590b.f1839m;
                c0589a.f1823p = c0590b.f1840n;
                c0589a.f1826s = c0590b.f1833g;
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = c0590b.f1828b;
                    if (i12 >= arrayList3.size()) {
                        break;
                    }
                    String str4 = (String) arrayList3.get(i12);
                    if (str4 != null) {
                        ((C0583N) c0589a.f1808a.get(i12)).f1784b = c0010k.m82d(str4);
                    }
                    i12++;
                }
                c0589a.m1544c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    c0589a.toString();
                    PrintWriter printWriter = new PrintWriter(new C0585P());
                    c0589a.m1547f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1727d.add(c0589a);
                i++;
            }
        } else {
            this.f1727d = null;
        }
        this.f1732i.set(c0578i.f1753d);
        String str5 = c0578i.f1754e;
        if (str5 != null) {
            AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606rM82d2 = c0010k.m82d(str5);
            this.f1746w = abstractComponentCallbacksC0606rM82d2;
            m1506q(abstractComponentCallbacksC0606rM82d2);
        }
        ArrayList arrayList4 = c0578i.f1755f;
        if (arrayList4 != null) {
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                this.f1733j.put((String) arrayList4.get(i13), (C0591c) c0578i.f1756g.get(i13));
            }
        }
        this.f1713C = new ArrayDeque(c0578i.f1757h);
    }

    /* renamed from: R */
    public final Bundle m1481R() {
        int i;
        ArrayList arrayList;
        C0590b[] c0590bArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it2 = m1494e().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C0597i c0597i = (C0597i) it2.next();
            if (c0597i.f1861e) {
                Log.isLoggable("FragmentManager", 2);
                c0597i.f1861e = false;
                c0597i.m1559c();
            }
        }
        Iterator it3 = m1494e().iterator();
        while (it3.hasNext()) {
            ((C0597i) it3.next()).m1561e();
        }
        m1513x(true);
        this.f1715E = true;
        this.f1722L.f1764h = true;
        C0010k c0010k = this.f1726c;
        c0010k.getClass();
        HashMap map = (HashMap) c0010k.f23f;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it4 = map.values().iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            C0582M c0582m = (C0582M) it4.next();
            if (c0582m != null) {
                AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = c0582m.f1780c;
                C0581L c0581l = new C0581L(abstractComponentCallbacksC0606r);
                if (abstractComponentCallbacksC0606r.f1918f <= -1 || c0581l.f1777m != null) {
                    c0581l.f1777m = abstractComponentCallbacksC0606r.f1919g;
                } else {
                    Bundle bundle2 = new Bundle();
                    abstractComponentCallbacksC0606r.mo1576y(bundle2);
                    abstractComponentCallbacksC0606r.f1915V.m2447c(bundle2);
                    bundle2.putParcelable("android:support:fragments", abstractComponentCallbacksC0606r.f1937y.m1481R());
                    c0582m.f1778a.m276p(false);
                    Bundle bundle3 = bundle2.isEmpty() ? null : bundle2;
                    if (abstractComponentCallbacksC0606r.f1903J != null) {
                        c0582m.m1533o();
                    }
                    if (abstractComponentCallbacksC0606r.f1920h != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0606r.f1920h);
                    }
                    if (abstractComponentCallbacksC0606r.f1921i != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBundle("android:view_registry_state", abstractComponentCallbacksC0606r.f1921i);
                    }
                    if (!abstractComponentCallbacksC0606r.f1905L) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0606r.f1905L);
                    }
                    c0581l.f1777m = bundle3;
                    if (abstractComponentCallbacksC0606r.f1925m != null) {
                        if (bundle3 == null) {
                            c0581l.f1777m = new Bundle();
                        }
                        c0581l.f1777m.putString("android:target_state", abstractComponentCallbacksC0606r.f1925m);
                        int i2 = abstractComponentCallbacksC0606r.f1926n;
                        if (i2 != 0) {
                            c0581l.f1777m.putInt("android:target_req_state", i2);
                        }
                    }
                }
                AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r2 = c0582m.f1780c;
                arrayList2.add(abstractComponentCallbacksC0606r2.f1922j);
                if (Log.isLoggable("FragmentManager", 2)) {
                    abstractComponentCallbacksC0606r2.toString();
                    Objects.toString(abstractComponentCallbacksC0606r2.f1919g);
                }
            }
        }
        C0010k c0010k2 = this.f1726c;
        c0010k2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) c0010k2.f24g).values());
        if (arrayList3.isEmpty()) {
            Log.isLoggable("FragmentManager", 2);
        } else {
            C0010k c0010k3 = this.f1726c;
            synchronized (((ArrayList) c0010k3.f25h)) {
                try {
                    if (((ArrayList) c0010k3.f25h).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) c0010k3.f25h).size());
                        Iterator it5 = ((ArrayList) c0010k3.f25h).iterator();
                        while (it5.hasNext()) {
                            AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r3 = (AbstractComponentCallbacksC0606r) it5.next();
                            arrayList.add(abstractComponentCallbacksC0606r3.f1922j);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                abstractComponentCallbacksC0606r3.toString();
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList4 = this.f1727d;
            if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
                c0590bArr = null;
            } else {
                c0590bArr = new C0590b[size];
                for (i = 0; i < size; i++) {
                    c0590bArr[i] = new C0590b((C0589a) this.f1727d.get(i));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(this.f1727d.get(i));
                    }
                }
            }
            C0578I c0578i = new C0578I();
            c0578i.f1754e = null;
            ArrayList arrayList5 = new ArrayList();
            c0578i.f1755f = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            c0578i.f1756g = arrayList6;
            c0578i.f1750a = arrayList2;
            c0578i.f1751b = arrayList;
            c0578i.f1752c = c0590bArr;
            c0578i.f1753d = this.f1732i.get();
            AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r4 = this.f1746w;
            if (abstractComponentCallbacksC0606r4 != null) {
                c0578i.f1754e = abstractComponentCallbacksC0606r4.f1922j;
            }
            arrayList5.addAll(this.f1733j.keySet());
            arrayList6.addAll(this.f1733j.values());
            c0578i.f1757h = new ArrayList(this.f1713C);
            bundle.putParcelable("state", c0578i);
            for (String str : this.f1734k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f1734k.get(str));
            }
            Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                C0581L c0581l2 = (C0581L) it6.next();
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("state", c0581l2);
                bundle.putBundle("fragment_" + c0581l2.f1766b, bundle4);
            }
        }
        return bundle;
    }

    /* renamed from: S */
    public final void m1482S() {
        synchronized (this.f1724a) {
            try {
                if (this.f1724a.size() == 1) {
                    this.f1743t.f1943h.removeCallbacks(this.f1723M);
                    this.f1743t.f1943h.post(this.f1723M);
                    m1489Z();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: T */
    public final void m1483T(AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r, boolean z2) {
        ViewGroup viewGroupM1468B = m1468B(abstractComponentCallbacksC0606r);
        if (viewGroupM1468B == null || !(viewGroupM1468B instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupM1468B).setDrawDisappearingViewsLast(!z2);
    }

    /* renamed from: U */
    public final void m1484U(AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r, EnumC0645m enumC0645m) {
        if (abstractComponentCallbacksC0606r.equals(this.f1726c.m82d(abstractComponentCallbacksC0606r.f1922j)) && (abstractComponentCallbacksC0606r.f1936x == null || abstractComponentCallbacksC0606r.f1935w == this)) {
            abstractComponentCallbacksC0606r.f1911R = enumC0645m;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0606r + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: V */
    public final void m1485V(AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r) {
        if (abstractComponentCallbacksC0606r != null) {
            if (!abstractComponentCallbacksC0606r.equals(this.f1726c.m82d(abstractComponentCallbacksC0606r.f1922j)) || (abstractComponentCallbacksC0606r.f1936x != null && abstractComponentCallbacksC0606r.f1935w != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0606r + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r2 = this.f1746w;
        this.f1746w = abstractComponentCallbacksC0606r;
        m1506q(abstractComponentCallbacksC0606r2);
        m1506q(this.f1746w);
    }

    /* renamed from: W */
    public final void m1486W(AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r) {
        ViewGroup viewGroupM1468B = m1468B(abstractComponentCallbacksC0606r);
        if (viewGroupM1468B != null) {
            C0604p c0604p = abstractComponentCallbacksC0606r.f1906M;
            if ((c0604p == null ? 0 : c0604p.f1886e) + (c0604p == null ? 0 : c0604p.f1885d) + (c0604p == null ? 0 : c0604p.f1884c) + (c0604p == null ? 0 : c0604p.f1883b) > 0) {
                if (viewGroupM1468B.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupM1468B.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0606r);
                }
                AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r2 = (AbstractComponentCallbacksC0606r) viewGroupM1468B.getTag(R.id.visible_removing_fragment_view_tag);
                C0604p c0604p2 = abstractComponentCallbacksC0606r.f1906M;
                boolean z2 = c0604p2 != null ? c0604p2.f1882a : false;
                if (abstractComponentCallbacksC0606r2.f1906M == null) {
                    return;
                }
                abstractComponentCallbacksC0606r2.m1586f().f1882a = z2;
            }
        }
    }

    /* renamed from: X */
    public final void m1487X() {
        Iterator it2 = this.f1726c.m85g().iterator();
        while (it2.hasNext()) {
            C0582M c0582m = (C0582M) it2.next();
            AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = c0582m.f1780c;
            if (abstractComponentCallbacksC0606r.f1904K) {
                if (this.f1725b) {
                    this.f1718H = true;
                } else {
                    abstractComponentCallbacksC0606r.f1904K = false;
                    c0582m.m1529k();
                }
            }
        }
    }

    /* renamed from: Y */
    public final void m1488Y(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0585P());
        C0608t c0608t = this.f1743t;
        if (c0608t == null) {
            try {
                m1510u("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            c0608t.f1945j.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    /* renamed from: Z */
    public final void m1489Z() {
        synchronized (this.f1724a) {
            try {
                if (!this.f1724a.isEmpty()) {
                    C0366h c0366h = this.f1731h;
                    c0366h.f946a = true;
                    C0544z c0544z = c0366h.f948c;
                    if (c0544z != null) {
                        c0544z.mo1093a();
                    }
                    return;
                }
                C0366h c0366h2 = this.f1731h;
                ArrayList arrayList = this.f1727d;
                c0366h2.f946a = (arrayList != null ? arrayList.size() : 0) > 0 && m1466I(this.f1745v);
                C0544z c0544z2 = c0366h2.f948c;
                if (c0544z2 != null) {
                    c0544z2.mo1093a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final C0582M m1490a(AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r) {
        String str = abstractComponentCallbacksC0606r.f1910Q;
        if (str != null) {
            AbstractC0464d.m1096c(abstractComponentCallbacksC0606r, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            abstractComponentCallbacksC0606r.toString();
        }
        C0582M c0582mM1495f = m1495f(abstractComponentCallbacksC0606r);
        abstractComponentCallbacksC0606r.f1935w = this;
        C0010k c0010k = this.f1726c;
        c0010k.m89k(c0582mM1495f);
        if (!abstractComponentCallbacksC0606r.f1898E) {
            c0010k.m79a(abstractComponentCallbacksC0606r);
            abstractComponentCallbacksC0606r.f1929q = false;
            if (abstractComponentCallbacksC0606r.f1903J == null) {
                abstractComponentCallbacksC0606r.f1907N = false;
            }
            if (m1464F(abstractComponentCallbacksC0606r)) {
                this.f1714D = true;
            }
        }
        return c0582mM1495f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final void m1491b(C0608t c0608t, AbstractC0610v abstractC0610v, AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r) {
        String str;
        if (this.f1743t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f1743t = c0608t;
        this.f1744u = abstractC0610v;
        this.f1745v = abstractComponentCallbacksC0606r;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1736m;
        if (abstractComponentCallbacksC0606r != 0) {
            copyOnWriteArrayList.add(new C0572C(abstractComponentCallbacksC0606r));
        } else if (c0608t instanceof InterfaceC0580K) {
            copyOnWriteArrayList.add(c0608t);
        }
        if (this.f1745v != null) {
            m1489Z();
        }
        if (c0608t instanceof InterfaceC0518B) {
            C0517A c0517aM1302i = c0608t.f1945j.m1302i();
            this.f1730g = c0517aM1302i;
            c0517aM1302i.m1278a(abstractComponentCallbacksC0606r != 0 ? abstractComponentCallbacksC0606r : c0608t, this.f1731h);
        }
        if (abstractComponentCallbacksC0606r != 0) {
            C0579J c0579j = abstractComponentCallbacksC0606r.f1935w.f1722L;
            HashMap map = c0579j.f1760d;
            C0579J c0579j2 = (C0579J) map.get(abstractComponentCallbacksC0606r.f1922j);
            if (c0579j2 == null) {
                c0579j2 = new C0579J(c0579j.f1762f);
                map.put(abstractComponentCallbacksC0606r.f1922j, c0579j2);
            }
            this.f1722L = c0579j2;
        } else if (c0608t instanceof InterfaceC0631Q) {
            C0513t c0513t = new C0513t(c0608t.f1945j.mo1298c(), C0579J.f1758i);
            String canonicalName = C0579J.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.f1722L = (C0579J) c0513t.m1236k("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), C0579J.class);
        } else {
            this.f1722L = new C0579J(false);
        }
        C0579J c0579j3 = this.f1722L;
        c0579j3.f1764h = this.f1715E || this.f1716F;
        this.f1726c.f26i = c0579j3;
        C0608t c0608t2 = this.f1743t;
        if ((c0608t2 instanceof InterfaceC0960e) && abstractComponentCallbacksC0606r == 0) {
            C0958c c0958cMo1297b = c0608t2.mo1297b();
            c0958cMo1297b.m2443e("android:support:fragments", new C0524f(2, this));
            Bundle bundleM2441c = c0958cMo1297b.m2441c("android:support:fragments");
            if (bundleM2441c != null) {
                m1480Q(bundleM2441c);
            }
        }
        C0608t c0608t3 = this.f1743t;
        if (c0608t3 instanceof InterfaceC0712d) {
            AbstractActivityC0841l abstractActivityC0841l = c0608t3.f1945j;
            if (abstractComponentCallbacksC0606r != 0) {
                str = abstractComponentCallbacksC0606r.f1922j + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            String strM936f = AbstractC0328E.m936f(str2, "StartActivityForResult");
            C0573D c0573d = new C0573D(2);
            C0614z c0614z = new C0614z(this, 1);
            C0530l c0530l = abstractActivityC0841l.f1297m;
            this.f1749z = c0530l.m1294b(strM936f, c0573d, c0614z);
            this.f1711A = c0530l.m1294b(AbstractC0328E.m936f(str2, "StartIntentSenderForResult"), new C0573D(0), new C0614z(this, 2));
            this.f1712B = c0530l.m1294b(AbstractC0328E.m936f(str2, "RequestPermissions"), new C0573D(1), new C0614z(this, 0));
        }
        C0608t c0608t4 = this.f1743t;
        if (c0608t4 instanceof InterfaceC0045f) {
            c0608t4.f1945j.m1300g(this.f1737n);
        }
        C0608t c0608t5 = this.f1743t;
        if (c0608t5 instanceof InterfaceC0046g) {
            AbstractActivityC0841l abstractActivityC0841l2 = c0608t5.f1945j;
            C0613y c0613y = this.f1738o;
            abstractActivityC0841l2.getClass();
            AbstractC0469c.m1102e("listener", c0613y);
            abstractActivityC0841l2.f1299o.add(c0613y);
        }
        C0608t c0608t6 = this.f1743t;
        if (c0608t6 instanceof InterfaceC0033t) {
            AbstractActivityC0841l abstractActivityC0841l3 = c0608t6.f1945j;
            C0613y c0613y2 = this.f1739p;
            abstractActivityC0841l3.getClass();
            AbstractC0469c.m1102e("listener", c0613y2);
            abstractActivityC0841l3.f1301q.add(c0613y2);
        }
        C0608t c0608t7 = this.f1743t;
        if (c0608t7 instanceof InterfaceC0034u) {
            AbstractActivityC0841l abstractActivityC0841l4 = c0608t7.f1945j;
            C0613y c0613y3 = this.f1740q;
            abstractActivityC0841l4.getClass();
            AbstractC0469c.m1102e("listener", c0613y3);
            abstractActivityC0841l4.f1302r.add(c0613y3);
        }
        C0608t c0608t8 = this.f1743t;
        if ((c0608t8 instanceof InterfaceC0237l) && abstractComponentCallbacksC0606r == 0) {
            AbstractActivityC0841l abstractActivityC0841l5 = c0608t8.f1945j;
            C0570A c0570a = this.f1741r;
            abstractActivityC0841l5.getClass();
            AbstractC0469c.m1102e("provider", c0570a);
            C0513t c0513t2 = abstractActivityC0841l5.f1292h;
            ((CopyOnWriteArrayList) c0513t2.f1246c).add(c0570a);
            ((Runnable) c0513t2.f1245b).run();
        }
    }

    /* renamed from: c */
    public final void m1492c(AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(abstractComponentCallbacksC0606r);
        }
        if (abstractComponentCallbacksC0606r.f1898E) {
            abstractComponentCallbacksC0606r.f1898E = false;
            if (abstractComponentCallbacksC0606r.f1928p) {
                return;
            }
            this.f1726c.m79a(abstractComponentCallbacksC0606r);
            if (Log.isLoggable("FragmentManager", 2)) {
                abstractComponentCallbacksC0606r.toString();
            }
            if (m1464F(abstractComponentCallbacksC0606r)) {
                this.f1714D = true;
            }
        }
    }

    /* renamed from: d */
    public final void m1493d() {
        this.f1725b = false;
        this.f1720J.clear();
        this.f1719I.clear();
    }

    /* renamed from: e */
    public final HashSet m1494e() {
        HashSet hashSet = new HashSet();
        Iterator it2 = this.f1726c.m85g().iterator();
        while (it2.hasNext()) {
            ViewGroup viewGroup = ((C0582M) it2.next()).f1780c.f1902I;
            if (viewGroup != null) {
                hashSet.add(C0597i.m1556f(viewGroup, m1470D()));
            }
        }
        return hashSet;
    }

    /* renamed from: f */
    public final C0582M m1495f(AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r) {
        String str = abstractComponentCallbacksC0606r.f1922j;
        C0010k c0010k = this.f1726c;
        C0582M c0582m = (C0582M) ((HashMap) c0010k.f23f).get(str);
        if (c0582m != null) {
            return c0582m;
        }
        C0582M c0582m2 = new C0582M(this.f1735l, c0010k, abstractComponentCallbacksC0606r);
        c0582m2.m1531m(this.f1743t.f1942g.getClassLoader());
        c0582m2.f1782e = this.f1742s;
        return c0582m2;
    }

    /* renamed from: g */
    public final void m1496g(AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(abstractComponentCallbacksC0606r);
        }
        if (abstractComponentCallbacksC0606r.f1898E) {
            return;
        }
        abstractComponentCallbacksC0606r.f1898E = true;
        if (abstractComponentCallbacksC0606r.f1928p) {
            if (Log.isLoggable("FragmentManager", 2)) {
                abstractComponentCallbacksC0606r.toString();
            }
            C0010k c0010k = this.f1726c;
            synchronized (((ArrayList) c0010k.f25h)) {
                ((ArrayList) c0010k.f25h).remove(abstractComponentCallbacksC0606r);
            }
            abstractComponentCallbacksC0606r.f1928p = false;
            if (m1464F(abstractComponentCallbacksC0606r)) {
                this.f1714D = true;
            }
            m1486W(abstractComponentCallbacksC0606r);
        }
    }

    /* renamed from: h */
    public final void m1497h(boolean z2) {
        if (z2 && (this.f1743t instanceof InterfaceC0045f)) {
            m1488Y(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r : this.f1726c.m87i()) {
            if (abstractComponentCallbacksC0606r != null) {
                abstractComponentCallbacksC0606r.f1901H = true;
                if (z2) {
                    abstractComponentCallbacksC0606r.f1937y.m1497h(true);
                }
            }
        }
    }

    /* renamed from: i */
    public final boolean m1498i() {
        if (this.f1742s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r : this.f1726c.m87i()) {
            if (abstractComponentCallbacksC0606r != null) {
                if (!abstractComponentCallbacksC0606r.f1897D ? abstractComponentCallbacksC0606r.f1937y.m1498i() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m1499j() {
        if (this.f1742s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r : this.f1726c.m87i()) {
            if (abstractComponentCallbacksC0606r != null && m1465H(abstractComponentCallbacksC0606r)) {
                if (!abstractComponentCallbacksC0606r.f1897D ? abstractComponentCallbacksC0606r.f1937y.m1499j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0606r);
                    z2 = true;
                }
            }
        }
        if (this.f1728e != null) {
            for (int i = 0; i < this.f1728e.size(); i++) {
                AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r2 = (AbstractComponentCallbacksC0606r) this.f1728e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0606r2)) {
                    abstractComponentCallbacksC0606r2.getClass();
                }
            }
        }
        this.f1728e = arrayList;
        return z2;
    }

    /* renamed from: k */
    public final void m1500k() {
        boolean zIsChangingConfigurations = true;
        this.f1717G = true;
        m1513x(true);
        Iterator it2 = m1494e().iterator();
        while (it2.hasNext()) {
            ((C0597i) it2.next()).m1561e();
        }
        C0608t c0608t = this.f1743t;
        boolean z2 = c0608t instanceof InterfaceC0631Q;
        C0010k c0010k = this.f1726c;
        if (z2) {
            zIsChangingConfigurations = ((C0579J) c0010k.f26i).f1763g;
        } else {
            AbstractActivityC0841l abstractActivityC0841l = c0608t.f1942g;
            if (abstractActivityC0841l instanceof Activity) {
                zIsChangingConfigurations = true ^ abstractActivityC0841l.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it3 = this.f1733j.values().iterator();
            while (it3.hasNext()) {
                for (String str : ((C0591c) it3.next()).f1841a) {
                    C0579J c0579j = (C0579J) c0010k.f26i;
                    c0579j.getClass();
                    Log.isLoggable("FragmentManager", 3);
                    c0579j.m1517c(str);
                }
            }
        }
        m1509t(-1);
        C0608t c0608t2 = this.f1743t;
        if (c0608t2 instanceof InterfaceC0046g) {
            AbstractActivityC0841l abstractActivityC0841l2 = c0608t2.f1945j;
            C0613y c0613y = this.f1738o;
            abstractActivityC0841l2.getClass();
            AbstractC0469c.m1102e("listener", c0613y);
            abstractActivityC0841l2.f1299o.remove(c0613y);
        }
        C0608t c0608t3 = this.f1743t;
        if (c0608t3 instanceof InterfaceC0045f) {
            AbstractActivityC0841l abstractActivityC0841l3 = c0608t3.f1945j;
            C0613y c0613y2 = this.f1737n;
            abstractActivityC0841l3.getClass();
            AbstractC0469c.m1102e("listener", c0613y2);
            abstractActivityC0841l3.f1298n.remove(c0613y2);
        }
        C0608t c0608t4 = this.f1743t;
        if (c0608t4 instanceof InterfaceC0033t) {
            AbstractActivityC0841l abstractActivityC0841l4 = c0608t4.f1945j;
            C0613y c0613y3 = this.f1739p;
            abstractActivityC0841l4.getClass();
            AbstractC0469c.m1102e("listener", c0613y3);
            abstractActivityC0841l4.f1301q.remove(c0613y3);
        }
        C0608t c0608t5 = this.f1743t;
        if (c0608t5 instanceof InterfaceC0034u) {
            AbstractActivityC0841l abstractActivityC0841l5 = c0608t5.f1945j;
            C0613y c0613y4 = this.f1740q;
            abstractActivityC0841l5.getClass();
            AbstractC0469c.m1102e("listener", c0613y4);
            abstractActivityC0841l5.f1302r.remove(c0613y4);
        }
        C0608t c0608t6 = this.f1743t;
        if (c0608t6 instanceof InterfaceC0237l) {
            AbstractActivityC0841l abstractActivityC0841l6 = c0608t6.f1945j;
            C0570A c0570a = this.f1741r;
            abstractActivityC0841l6.getClass();
            AbstractC0469c.m1102e("provider", c0570a);
            C0513t c0513t = abstractActivityC0841l6.f1292h;
            ((CopyOnWriteArrayList) c0513t.f1246c).remove(c0570a);
            if (((HashMap) c0513t.f1247d).remove(c0570a) != null) {
                throw new ClassCastException();
            }
            ((Runnable) c0513t.f1245b).run();
        }
        this.f1743t = null;
        this.f1744u = null;
        this.f1745v = null;
        if (this.f1730g != null) {
            Iterator it4 = this.f1731h.f947b.iterator();
            while (it4.hasNext()) {
                ((InterfaceC0521c) it4.next()).cancel();
            }
            this.f1730g = null;
        }
        C0057j c0057j = this.f1749z;
        if (c0057j != null) {
            c0057j.m264N();
            this.f1711A.m264N();
            this.f1712B.m264N();
        }
    }

    /* renamed from: l */
    public final void m1501l(boolean z2) {
        if (z2 && (this.f1743t instanceof InterfaceC0046g)) {
            m1488Y(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r : this.f1726c.m87i()) {
            if (abstractComponentCallbacksC0606r != null) {
                abstractComponentCallbacksC0606r.f1901H = true;
                if (z2) {
                    abstractComponentCallbacksC0606r.f1937y.m1501l(true);
                }
            }
        }
    }

    /* renamed from: m */
    public final void m1502m(boolean z2, boolean z3) {
        if (z3 && (this.f1743t instanceof InterfaceC0033t)) {
            m1488Y(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r : this.f1726c.m87i()) {
            if (abstractComponentCallbacksC0606r != null && z3) {
                abstractComponentCallbacksC0606r.f1937y.m1502m(z2, true);
            }
        }
    }

    /* renamed from: n */
    public final void m1503n() {
        Iterator it2 = this.f1726c.m86h().iterator();
        while (it2.hasNext()) {
            AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = (AbstractComponentCallbacksC0606r) it2.next();
            if (abstractComponentCallbacksC0606r != null) {
                abstractComponentCallbacksC0606r.m1596p();
                abstractComponentCallbacksC0606r.f1937y.m1503n();
            }
        }
    }

    /* renamed from: o */
    public final boolean m1504o() {
        if (this.f1742s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r : this.f1726c.m87i()) {
            if (abstractComponentCallbacksC0606r != null) {
                if (!abstractComponentCallbacksC0606r.f1897D ? abstractComponentCallbacksC0606r.f1937y.m1504o() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: p */
    public final void m1505p() {
        if (this.f1742s < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r : this.f1726c.m87i()) {
            if (abstractComponentCallbacksC0606r != null && !abstractComponentCallbacksC0606r.f1897D) {
                abstractComponentCallbacksC0606r.f1937y.m1505p();
            }
        }
    }

    /* renamed from: q */
    public final void m1506q(AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r) {
        if (abstractComponentCallbacksC0606r != null) {
            if (abstractComponentCallbacksC0606r.equals(this.f1726c.m82d(abstractComponentCallbacksC0606r.f1922j))) {
                abstractComponentCallbacksC0606r.f1935w.getClass();
                boolean zM1466I = m1466I(abstractComponentCallbacksC0606r);
                Boolean bool = abstractComponentCallbacksC0606r.f1927o;
                if (bool == null || bool.booleanValue() != zM1466I) {
                    abstractComponentCallbacksC0606r.f1927o = Boolean.valueOf(zM1466I);
                    C0577H c0577h = abstractComponentCallbacksC0606r.f1937y;
                    c0577h.m1489Z();
                    c0577h.m1506q(c0577h.f1746w);
                }
            }
        }
    }

    /* renamed from: r */
    public final void m1507r(boolean z2, boolean z3) {
        if (z3 && (this.f1743t instanceof InterfaceC0034u)) {
            m1488Y(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r : this.f1726c.m87i()) {
            if (abstractComponentCallbacksC0606r != null && z3) {
                abstractComponentCallbacksC0606r.f1937y.m1507r(z2, true);
            }
        }
    }

    /* renamed from: s */
    public final boolean m1508s() {
        if (this.f1742s < 1) {
            return false;
        }
        boolean z2 = false;
        for (AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r : this.f1726c.m87i()) {
            if (abstractComponentCallbacksC0606r != null && m1465H(abstractComponentCallbacksC0606r)) {
                if (!abstractComponentCallbacksC0606r.f1897D ? abstractComponentCallbacksC0606r.f1937y.m1508s() : false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    /* renamed from: t */
    public final void m1509t(int i) {
        try {
            this.f1725b = true;
            for (C0582M c0582m : ((HashMap) this.f1726c.f23f).values()) {
                if (c0582m != null) {
                    c0582m.f1782e = i;
                }
            }
            m1473J(i, false);
            Iterator it2 = m1494e().iterator();
            while (it2.hasNext()) {
                ((C0597i) it2.next()).m1561e();
            }
            this.f1725b = false;
            m1513x(true);
        } catch (Throwable th) {
            this.f1725b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = this.f1745v;
        if (abstractComponentCallbacksC0606r != null) {
            sb.append(abstractComponentCallbacksC0606r.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f1745v)));
            sb.append("}");
        } else {
            C0608t c0608t = this.f1743t;
            if (c0608t != null) {
                sb.append(c0608t.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f1743t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public final void m1510u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strM936f = AbstractC0328E.m936f(str, "    ");
        C0010k c0010k = this.f1726c;
        c0010k.getClass();
        String str2 = str + "    ";
        HashMap map = (HashMap) c0010k.f23f;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0582M c0582m : map.values()) {
                printWriter.print(str);
                if (c0582m != null) {
                    AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = c0582m.f1780c;
                    printWriter.println(abstractComponentCallbacksC0606r);
                    abstractComponentCallbacksC0606r.getClass();
                    printWriter.print(str2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0606r.f1894A));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0606r.f1895B));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0606r.f1896C);
                    printWriter.print(str2);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0606r.f1918f);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0606r.f1922j);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0606r.f1934v);
                    printWriter.print(str2);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0606r.f1928p);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0606r.f1929q);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0606r.f1930r);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0606r.f1931s);
                    printWriter.print(str2);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0606r.f1897D);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0606r.f1898E);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0606r.f1900G);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0606r.f1899F);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0606r.f1905L);
                    if (abstractComponentCallbacksC0606r.f1935w != null) {
                        printWriter.print(str2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0606r.f1935w);
                    }
                    if (abstractComponentCallbacksC0606r.f1936x != null) {
                        printWriter.print(str2);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0606r.f1936x);
                    }
                    if (abstractComponentCallbacksC0606r.f1938z != null) {
                        printWriter.print(str2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0606r.f1938z);
                    }
                    if (abstractComponentCallbacksC0606r.f1923k != null) {
                        printWriter.print(str2);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0606r.f1923k);
                    }
                    if (abstractComponentCallbacksC0606r.f1919g != null) {
                        printWriter.print(str2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0606r.f1919g);
                    }
                    if (abstractComponentCallbacksC0606r.f1920h != null) {
                        printWriter.print(str2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0606r.f1920h);
                    }
                    if (abstractComponentCallbacksC0606r.f1921i != null) {
                        printWriter.print(str2);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0606r.f1921i);
                    }
                    Object objM1592l = abstractComponentCallbacksC0606r.m1592l(false);
                    if (objM1592l != null) {
                        printWriter.print(str2);
                        printWriter.print("mTarget=");
                        printWriter.print(objM1592l);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0606r.f1926n);
                    }
                    printWriter.print(str2);
                    printWriter.print("mPopDirection=");
                    C0604p c0604p = abstractComponentCallbacksC0606r.f1906M;
                    printWriter.println(c0604p == null ? false : c0604p.f1882a);
                    C0604p c0604p2 = abstractComponentCallbacksC0606r.f1906M;
                    if ((c0604p2 == null ? 0 : c0604p2.f1883b) != 0) {
                        printWriter.print(str2);
                        printWriter.print("getEnterAnim=");
                        C0604p c0604p3 = abstractComponentCallbacksC0606r.f1906M;
                        printWriter.println(c0604p3 == null ? 0 : c0604p3.f1883b);
                    }
                    C0604p c0604p4 = abstractComponentCallbacksC0606r.f1906M;
                    if ((c0604p4 == null ? 0 : c0604p4.f1884c) != 0) {
                        printWriter.print(str2);
                        printWriter.print("getExitAnim=");
                        C0604p c0604p5 = abstractComponentCallbacksC0606r.f1906M;
                        printWriter.println(c0604p5 == null ? 0 : c0604p5.f1884c);
                    }
                    C0604p c0604p6 = abstractComponentCallbacksC0606r.f1906M;
                    if ((c0604p6 == null ? 0 : c0604p6.f1885d) != 0) {
                        printWriter.print(str2);
                        printWriter.print("getPopEnterAnim=");
                        C0604p c0604p7 = abstractComponentCallbacksC0606r.f1906M;
                        printWriter.println(c0604p7 == null ? 0 : c0604p7.f1885d);
                    }
                    C0604p c0604p8 = abstractComponentCallbacksC0606r.f1906M;
                    if ((c0604p8 == null ? 0 : c0604p8.f1886e) != 0) {
                        printWriter.print(str2);
                        printWriter.print("getPopExitAnim=");
                        C0604p c0604p9 = abstractComponentCallbacksC0606r.f1906M;
                        printWriter.println(c0604p9 == null ? 0 : c0604p9.f1886e);
                    }
                    if (abstractComponentCallbacksC0606r.f1902I != null) {
                        printWriter.print(str2);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0606r.f1902I);
                    }
                    if (abstractComponentCallbacksC0606r.f1903J != null) {
                        printWriter.print(str2);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0606r.f1903J);
                    }
                    if (abstractComponentCallbacksC0606r.m1588h() != null) {
                        C0513t c0513t = new C0513t(abstractComponentCallbacksC0606r.mo1298c(), C0673a.f2266d);
                        String canonicalName = C0673a.class.getCanonicalName();
                        if (canonicalName == null) {
                            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                        C1257l c1257l = ((C0673a) c0513t.m1236k("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), C0673a.class)).f2267c;
                        if (c1257l.f5016c > 0) {
                            printWriter.print(str2);
                            printWriter.println("Loaders:");
                            if (c1257l.f5016c > 0) {
                                if (c1257l.f5015b[0] != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(str2);
                                printWriter.print("  #");
                                printWriter.print(c1257l.f5014a[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str2);
                    printWriter.println("Child " + abstractComponentCallbacksC0606r.f1937y + ":");
                    abstractComponentCallbacksC0606r.f1937y.m1510u(AbstractC0328E.m936f(str2, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) c0010k.f25h;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r2 = (AbstractComponentCallbacksC0606r) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0606r2.toString());
            }
        }
        ArrayList arrayList2 = this.f1728e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r3 = (AbstractComponentCallbacksC0606r) this.f1728e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0606r3.toString());
            }
        }
        ArrayList arrayList3 = this.f1727d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                C0589a c0589a = (C0589a) this.f1727d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c0589a.toString());
                c0589a.m1547f(strM936f, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1732i.get());
        synchronized (this.f1724a) {
            try {
                int size4 = this.f1724a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (InterfaceC0575F) this.f1724a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1743t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1744u);
        if (this.f1745v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1745v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1742s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1715E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1716F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1717G);
        if (this.f1714D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1714D);
        }
    }

    /* renamed from: v */
    public final void m1511v(InterfaceC0575F interfaceC0575F, boolean z2) {
        if (!z2) {
            if (this.f1743t == null) {
                if (!this.f1717G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f1715E || this.f1716F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1724a) {
            try {
                if (this.f1743t == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f1724a.add(interfaceC0575F);
                    m1482S();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: w */
    public final void m1512w(boolean z2) {
        if (this.f1725b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f1743t == null) {
            if (!this.f1717G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f1743t.f1943h.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && (this.f1715E || this.f1716F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f1719I == null) {
            this.f1719I = new ArrayList();
            this.f1720J = new ArrayList();
        }
    }

    /* renamed from: x */
    public final boolean m1513x(boolean z2) {
        boolean zMo1462a;
        m1512w(z2);
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.f1719I;
            ArrayList arrayList2 = this.f1720J;
            synchronized (this.f1724a) {
                if (this.f1724a.isEmpty()) {
                    zMo1462a = false;
                } else {
                    try {
                        int size = this.f1724a.size();
                        zMo1462a = false;
                        for (int i = 0; i < size; i++) {
                            zMo1462a |= ((InterfaceC0575F) this.f1724a.get(i)).mo1462a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zMo1462a) {
                break;
            }
            z3 = true;
            this.f1725b = true;
            try {
                m1479P(this.f1719I, this.f1720J);
            } finally {
                m1493d();
            }
        }
        m1489Z();
        if (this.f1718H) {
            this.f1718H = false;
            m1487X();
        }
        ((HashMap) this.f1726c.f23f).values().removeAll(Collections.singleton(null));
        return z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0161  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1514y(ArrayList arrayList, ArrayList arrayList2, int i, int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        ArrayList arrayList3;
        C0010k c0010k;
        C0010k c0010k2;
        C0010k c0010k3;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        boolean z2 = ((C0589a) arrayList4.get(i)).f1823p;
        ArrayList arrayList6 = this.f1721K;
        if (arrayList6 == null) {
            this.f1721K = new ArrayList();
        } else {
            arrayList6.clear();
        }
        ArrayList arrayList7 = this.f1721K;
        C0010k c0010k4 = this.f1726c;
        arrayList7.addAll(c0010k4.m87i());
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = this.f1746w;
        int i6 = i;
        boolean z3 = false;
        while (true) {
            int i7 = 1;
            if (i6 >= i2) {
                C0010k c0010k5 = c0010k4;
                this.f1721K.clear();
                if (!z2 && this.f1742s >= 1) {
                    for (int i8 = i; i8 < i2; i8++) {
                        Iterator it2 = ((C0589a) arrayList.get(i8)).f1808a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r2 = ((C0583N) it2.next()).f1784b;
                            if (abstractComponentCallbacksC0606r2 == null || abstractComponentCallbacksC0606r2.f1935w == null) {
                                c0010k = c0010k5;
                            } else {
                                c0010k = c0010k5;
                                c0010k.m89k(m1495f(abstractComponentCallbacksC0606r2));
                            }
                            c0010k5 = c0010k;
                        }
                    }
                }
                for (int i9 = i; i9 < i2; i9++) {
                    C0589a c0589a = (C0589a) arrayList.get(i9);
                    if (((Boolean) arrayList2.get(i9)).booleanValue()) {
                        c0589a.m1544c(-1);
                        ArrayList arrayList8 = c0589a.f1808a;
                        boolean z4 = true;
                        for (int size = arrayList8.size() - 1; size >= 0; size--) {
                            C0583N c0583n = (C0583N) arrayList8.get(size);
                            AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r3 = c0583n.f1784b;
                            if (abstractComponentCallbacksC0606r3 != null) {
                                if (abstractComponentCallbacksC0606r3.f1906M != null) {
                                    abstractComponentCallbacksC0606r3.m1586f().f1882a = z4;
                                }
                                int i10 = c0589a.f1813f;
                                int i11 = 8194;
                                if (i10 != 4097) {
                                    if (i10 != 8194) {
                                        i11 = 4100;
                                        if (i10 != 8197) {
                                            i11 = i10 != 4099 ? i10 != 4100 ? 0 : 8197 : 4099;
                                        }
                                    } else {
                                        i11 = 4097;
                                    }
                                }
                                if (abstractComponentCallbacksC0606r3.f1906M != null || i11 != 0) {
                                    abstractComponentCallbacksC0606r3.m1586f();
                                    abstractComponentCallbacksC0606r3.f1906M.f1887f = i11;
                                }
                                abstractComponentCallbacksC0606r3.m1586f();
                                abstractComponentCallbacksC0606r3.f1906M.getClass();
                            }
                            int i12 = c0583n.f1783a;
                            C0577H c0577h = c0589a.f1824q;
                            switch (i12) {
                                case 1:
                                    abstractComponentCallbacksC0606r3.m1583H(c0583n.f1786d, c0583n.f1787e, c0583n.f1788f, c0583n.f1789g);
                                    z4 = true;
                                    c0577h.m1483T(abstractComponentCallbacksC0606r3, true);
                                    c0577h.m1478O(abstractComponentCallbacksC0606r3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c0583n.f1783a);
                                case 3:
                                    abstractComponentCallbacksC0606r3.m1583H(c0583n.f1786d, c0583n.f1787e, c0583n.f1788f, c0583n.f1789g);
                                    c0577h.m1490a(abstractComponentCallbacksC0606r3);
                                    z4 = true;
                                case 4:
                                    abstractComponentCallbacksC0606r3.m1583H(c0583n.f1786d, c0583n.f1787e, c0583n.f1788f, c0583n.f1789g);
                                    c0577h.getClass();
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        Objects.toString(abstractComponentCallbacksC0606r3);
                                    }
                                    if (abstractComponentCallbacksC0606r3.f1897D) {
                                        abstractComponentCallbacksC0606r3.f1897D = false;
                                        abstractComponentCallbacksC0606r3.f1907N = !abstractComponentCallbacksC0606r3.f1907N;
                                    }
                                    z4 = true;
                                case 5:
                                    abstractComponentCallbacksC0606r3.m1583H(c0583n.f1786d, c0583n.f1787e, c0583n.f1788f, c0583n.f1789g);
                                    c0577h.m1483T(abstractComponentCallbacksC0606r3, true);
                                    c0577h.m1471E(abstractComponentCallbacksC0606r3);
                                    z4 = true;
                                case 6:
                                    abstractComponentCallbacksC0606r3.m1583H(c0583n.f1786d, c0583n.f1787e, c0583n.f1788f, c0583n.f1789g);
                                    c0577h.m1492c(abstractComponentCallbacksC0606r3);
                                    z4 = true;
                                case 7:
                                    abstractComponentCallbacksC0606r3.m1583H(c0583n.f1786d, c0583n.f1787e, c0583n.f1788f, c0583n.f1789g);
                                    c0577h.m1483T(abstractComponentCallbacksC0606r3, true);
                                    c0577h.m1496g(abstractComponentCallbacksC0606r3);
                                    z4 = true;
                                case 8:
                                    c0577h.m1485V(null);
                                    z4 = true;
                                case 9:
                                    c0577h.m1485V(abstractComponentCallbacksC0606r3);
                                    z4 = true;
                                case 10:
                                    c0577h.m1484U(abstractComponentCallbacksC0606r3, c0583n.f1790h);
                                    z4 = true;
                            }
                        }
                    } else {
                        c0589a.m1544c(1);
                        ArrayList arrayList9 = c0589a.f1808a;
                        int size2 = arrayList9.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            C0583N c0583n2 = (C0583N) arrayList9.get(i13);
                            AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r4 = c0583n2.f1784b;
                            if (abstractComponentCallbacksC0606r4 != null) {
                                if (abstractComponentCallbacksC0606r4.f1906M != null) {
                                    abstractComponentCallbacksC0606r4.m1586f().f1882a = false;
                                }
                                int i14 = c0589a.f1813f;
                                if (abstractComponentCallbacksC0606r4.f1906M != null || i14 != 0) {
                                    abstractComponentCallbacksC0606r4.m1586f();
                                    abstractComponentCallbacksC0606r4.f1906M.f1887f = i14;
                                }
                                abstractComponentCallbacksC0606r4.m1586f();
                                abstractComponentCallbacksC0606r4.f1906M.getClass();
                            }
                            int i15 = c0583n2.f1783a;
                            C0577H c0577h2 = c0589a.f1824q;
                            switch (i15) {
                                case 1:
                                    arrayList3 = arrayList9;
                                    abstractComponentCallbacksC0606r4.m1583H(c0583n2.f1786d, c0583n2.f1787e, c0583n2.f1788f, c0583n2.f1789g);
                                    c0577h2.m1483T(abstractComponentCallbacksC0606r4, false);
                                    c0577h2.m1490a(abstractComponentCallbacksC0606r4);
                                    i13++;
                                    arrayList9 = arrayList3;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c0583n2.f1783a);
                                case 3:
                                    arrayList3 = arrayList9;
                                    abstractComponentCallbacksC0606r4.m1583H(c0583n2.f1786d, c0583n2.f1787e, c0583n2.f1788f, c0583n2.f1789g);
                                    c0577h2.m1478O(abstractComponentCallbacksC0606r4);
                                    i13++;
                                    arrayList9 = arrayList3;
                                case 4:
                                    arrayList3 = arrayList9;
                                    abstractComponentCallbacksC0606r4.m1583H(c0583n2.f1786d, c0583n2.f1787e, c0583n2.f1788f, c0583n2.f1789g);
                                    c0577h2.m1471E(abstractComponentCallbacksC0606r4);
                                    i13++;
                                    arrayList9 = arrayList3;
                                case 5:
                                    arrayList3 = arrayList9;
                                    abstractComponentCallbacksC0606r4.m1583H(c0583n2.f1786d, c0583n2.f1787e, c0583n2.f1788f, c0583n2.f1789g);
                                    c0577h2.m1483T(abstractComponentCallbacksC0606r4, false);
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        Objects.toString(abstractComponentCallbacksC0606r4);
                                    }
                                    if (abstractComponentCallbacksC0606r4.f1897D) {
                                        abstractComponentCallbacksC0606r4.f1897D = false;
                                        abstractComponentCallbacksC0606r4.f1907N = !abstractComponentCallbacksC0606r4.f1907N;
                                    }
                                    i13++;
                                    arrayList9 = arrayList3;
                                case 6:
                                    arrayList3 = arrayList9;
                                    abstractComponentCallbacksC0606r4.m1583H(c0583n2.f1786d, c0583n2.f1787e, c0583n2.f1788f, c0583n2.f1789g);
                                    c0577h2.m1496g(abstractComponentCallbacksC0606r4);
                                    i13++;
                                    arrayList9 = arrayList3;
                                case 7:
                                    arrayList3 = arrayList9;
                                    abstractComponentCallbacksC0606r4.m1583H(c0583n2.f1786d, c0583n2.f1787e, c0583n2.f1788f, c0583n2.f1789g);
                                    c0577h2.m1483T(abstractComponentCallbacksC0606r4, false);
                                    c0577h2.m1492c(abstractComponentCallbacksC0606r4);
                                    i13++;
                                    arrayList9 = arrayList3;
                                case 8:
                                    c0577h2.m1485V(abstractComponentCallbacksC0606r4);
                                    arrayList3 = arrayList9;
                                    i13++;
                                    arrayList9 = arrayList3;
                                case 9:
                                    c0577h2.m1485V(null);
                                    arrayList3 = arrayList9;
                                    i13++;
                                    arrayList9 = arrayList3;
                                case 10:
                                    c0577h2.m1484U(abstractComponentCallbacksC0606r4, c0583n2.f1791i);
                                    arrayList3 = arrayList9;
                                    i13++;
                                    arrayList9 = arrayList3;
                            }
                        }
                    }
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i16 = i; i16 < i2; i16++) {
                    C0589a c0589a2 = (C0589a) arrayList.get(i16);
                    if (zBooleanValue) {
                        for (int size3 = c0589a2.f1808a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r5 = ((C0583N) c0589a2.f1808a.get(size3)).f1784b;
                            if (abstractComponentCallbacksC0606r5 != null) {
                                m1495f(abstractComponentCallbacksC0606r5).m1529k();
                            }
                        }
                    } else {
                        Iterator it3 = c0589a2.f1808a.iterator();
                        while (it3.hasNext()) {
                            AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r6 = ((C0583N) it3.next()).f1784b;
                            if (abstractComponentCallbacksC0606r6 != null) {
                                m1495f(abstractComponentCallbacksC0606r6).m1529k();
                            }
                        }
                    }
                }
                m1473J(this.f1742s, true);
                HashSet hashSet = new HashSet();
                for (int i17 = i; i17 < i2; i17++) {
                    Iterator it4 = ((C0589a) arrayList.get(i17)).f1808a.iterator();
                    while (it4.hasNext()) {
                        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r7 = ((C0583N) it4.next()).f1784b;
                        if (abstractComponentCallbacksC0606r7 != null && (viewGroup = abstractComponentCallbacksC0606r7.f1902I) != null) {
                            hashSet.add(C0597i.m1556f(viewGroup, m1470D()));
                        }
                    }
                }
                Iterator it5 = hashSet.iterator();
                while (it5.hasNext()) {
                    C0597i c0597i = (C0597i) it5.next();
                    c0597i.f1860d = zBooleanValue;
                    synchronized (c0597i.f1858b) {
                        try {
                            c0597i.m1562g();
                            c0597i.f1861e = false;
                            int size4 = c0597i.f1858b.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    C0587S c0587s = (C0587S) c0597i.f1858b.get(size4);
                                    int iM933c = AbstractC0328E.m933c(c0587s.f1802c.f1903J);
                                    if (c0587s.f1800a != 2 || iM933c == 2) {
                                        size4--;
                                    } else {
                                        C0604p c0604p = c0587s.f1802c.f1906M;
                                        c0597i.f1861e = false;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c0597i.m1559c();
                }
                for (int i18 = i; i18 < i2; i18++) {
                    C0589a c0589a3 = (C0589a) arrayList.get(i18);
                    if (((Boolean) arrayList2.get(i18)).booleanValue() && c0589a3.f1826s >= 0) {
                        c0589a3.f1826s = -1;
                    }
                    c0589a3.getClass();
                }
                return;
            }
            C0589a c0589a4 = (C0589a) arrayList4.get(i6);
            if (((Boolean) arrayList5.get(i6)).booleanValue()) {
                c0010k2 = c0010k4;
                int i19 = 1;
                ArrayList arrayList10 = this.f1721K;
                ArrayList arrayList11 = c0589a4.f1808a;
                int size5 = arrayList11.size() - 1;
                while (size5 >= 0) {
                    C0583N c0583n3 = (C0583N) arrayList11.get(size5);
                    int i20 = c0583n3.f1783a;
                    if (i20 != i19) {
                        if (i20 != 3) {
                            switch (i20) {
                                case 6:
                                    arrayList10.add(c0583n3.f1784b);
                                    break;
                                case 8:
                                    abstractComponentCallbacksC0606r = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0606r = c0583n3.f1784b;
                                    break;
                                case 10:
                                    c0583n3.f1791i = c0583n3.f1790h;
                                    break;
                            }
                        }
                        size5--;
                        i19 = 1;
                    }
                    arrayList10.remove(c0583n3.f1784b);
                    size5--;
                    i19 = 1;
                }
            } else {
                ArrayList arrayList12 = this.f1721K;
                int i21 = 0;
                while (true) {
                    ArrayList arrayList13 = c0589a4.f1808a;
                    if (i21 < arrayList13.size()) {
                        C0583N c0583n4 = (C0583N) arrayList13.get(i21);
                        int i22 = c0583n4.f1783a;
                        if (i22 == i7) {
                            c0010k3 = c0010k4;
                            i3 = 1;
                            arrayList12.add(c0583n4.f1784b);
                        } else if (i22 != 2) {
                            if (i22 == 3 || i22 == 6) {
                                arrayList12.remove(c0583n4.f1784b);
                                AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r8 = c0583n4.f1784b;
                                if (abstractComponentCallbacksC0606r8 == abstractComponentCallbacksC0606r) {
                                    arrayList13.add(i21, new C0583N(9, abstractComponentCallbacksC0606r8));
                                    i21++;
                                    c0010k3 = c0010k4;
                                    i3 = 1;
                                    abstractComponentCallbacksC0606r = null;
                                }
                            } else {
                                if (i22 != 7) {
                                    if (i22 == 8) {
                                        arrayList13.add(i21, new C0583N(9, abstractComponentCallbacksC0606r, 0));
                                        c0583n4.f1785c = true;
                                        i21++;
                                        abstractComponentCallbacksC0606r = c0583n4.f1784b;
                                    }
                                }
                                c0010k3 = c0010k4;
                                i3 = 1;
                                arrayList12.add(c0583n4.f1784b);
                            }
                            c0010k3 = c0010k4;
                            i3 = 1;
                        } else {
                            AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r9 = c0583n4.f1784b;
                            int i23 = abstractComponentCallbacksC0606r9.f1895B;
                            int size6 = arrayList12.size() - 1;
                            boolean z5 = false;
                            while (size6 >= 0) {
                                C0010k c0010k6 = c0010k4;
                                AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r10 = (AbstractComponentCallbacksC0606r) arrayList12.get(size6);
                                if (abstractComponentCallbacksC0606r10.f1895B != i23) {
                                    i4 = i23;
                                } else if (abstractComponentCallbacksC0606r10 == abstractComponentCallbacksC0606r9) {
                                    i4 = i23;
                                    z5 = true;
                                } else {
                                    if (abstractComponentCallbacksC0606r10 == abstractComponentCallbacksC0606r) {
                                        i4 = i23;
                                        arrayList13.add(i21, new C0583N(9, abstractComponentCallbacksC0606r10, 0));
                                        i21++;
                                        i5 = 0;
                                        abstractComponentCallbacksC0606r = null;
                                    } else {
                                        i4 = i23;
                                        i5 = 0;
                                    }
                                    C0583N c0583n5 = new C0583N(3, abstractComponentCallbacksC0606r10, i5);
                                    c0583n5.f1786d = c0583n4.f1786d;
                                    c0583n5.f1788f = c0583n4.f1788f;
                                    c0583n5.f1787e = c0583n4.f1787e;
                                    c0583n5.f1789g = c0583n4.f1789g;
                                    arrayList13.add(i21, c0583n5);
                                    arrayList12.remove(abstractComponentCallbacksC0606r10);
                                    i21++;
                                    abstractComponentCallbacksC0606r = abstractComponentCallbacksC0606r;
                                }
                                size6--;
                                i23 = i4;
                                c0010k4 = c0010k6;
                            }
                            c0010k3 = c0010k4;
                            i3 = 1;
                            if (z5) {
                                arrayList13.remove(i21);
                                i21--;
                            } else {
                                c0583n4.f1783a = 1;
                                c0583n4.f1785c = true;
                                arrayList12.add(abstractComponentCallbacksC0606r9);
                            }
                        }
                        i21 += i3;
                        c0010k4 = c0010k3;
                        i7 = 1;
                    } else {
                        c0010k2 = c0010k4;
                    }
                }
            }
            z3 = z3 || c0589a4.f1814g;
            i6++;
            arrayList4 = arrayList;
            arrayList5 = arrayList2;
            c0010k4 = c0010k2;
        }
    }

    /* renamed from: z */
    public final AbstractComponentCallbacksC0606r m1515z(int i) {
        C0010k c0010k = this.f1726c;
        ArrayList arrayList = (ArrayList) c0010k.f25h;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = (AbstractComponentCallbacksC0606r) arrayList.get(size);
            if (abstractComponentCallbacksC0606r != null && abstractComponentCallbacksC0606r.f1894A == i) {
                return abstractComponentCallbacksC0606r;
            }
        }
        for (C0582M c0582m : ((HashMap) c0010k.f23f).values()) {
            if (c0582m != null) {
                AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r2 = c0582m.f1780c;
                if (abstractComponentCallbacksC0606r2.f1894A == i) {
                    return abstractComponentCallbacksC0606r2;
                }
            }
        }
        return null;
    }
}
