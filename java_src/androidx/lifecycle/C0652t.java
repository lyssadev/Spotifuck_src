package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p030Q0.AbstractC0328E;
import p047Z0.AbstractC0469c;
import p090p.C1227a;
import p093q.C1235a;
import p093q.C1236b;
import p093q.C1237c;
import p093q.C1238d;

/* renamed from: androidx.lifecycle.t */
/* loaded from: classes.dex */
public final class C0652t {

    /* renamed from: a */
    public final boolean f2010a;

    /* renamed from: b */
    public C1235a f2011b;

    /* renamed from: c */
    public EnumC0645m f2012c;

    /* renamed from: d */
    public final WeakReference f2013d;

    /* renamed from: e */
    public int f2014e;

    /* renamed from: f */
    public boolean f2015f;

    /* renamed from: g */
    public boolean f2016g;

    /* renamed from: h */
    public final ArrayList f2017h;

    public C0652t(InterfaceC0650r interfaceC0650r) {
        new AtomicReference();
        this.f2010a = true;
        this.f2011b = new C1235a();
        this.f2012c = EnumC0645m.f2002b;
        this.f2017h = new ArrayList();
        this.f2013d = new WeakReference(interfaceC0650r);
    }

    /* renamed from: a */
    public final void m1615a(InterfaceC0649q interfaceC0649q) {
        InterfaceC0648p reflectiveGenericLifecycleObserver;
        InterfaceC0650r interfaceC0650r;
        ArrayList arrayList = this.f2017h;
        Object obj = null;
        m1617c("addObserver");
        EnumC0645m enumC0645m = this.f2012c;
        EnumC0645m enumC0645m2 = EnumC0645m.f2001a;
        if (enumC0645m != enumC0645m2) {
            enumC0645m2 = EnumC0645m.f2002b;
        }
        C0651s c0651s = new C0651s();
        HashMap map = AbstractC0653u.f2018a;
        boolean z2 = interfaceC0649q instanceof InterfaceC0648p;
        boolean z3 = interfaceC0649q instanceof InterfaceC0636d;
        if (z2 && z3) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0636d) interfaceC0649q, (InterfaceC0648p) interfaceC0649q);
        } else if (z3) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0636d) interfaceC0649q, null);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = (InterfaceC0648p) interfaceC0649q;
        } else {
            Class<?> cls = interfaceC0649q.getClass();
            if (AbstractC0653u.m1625c(cls) == 2) {
                Object obj2 = AbstractC0653u.f2019b.get(cls);
                AbstractC0469c.m1099b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC0653u.m1623a((Constructor) list.get(0), interfaceC0649q);
                    throw null;
                }
                int size = list.size();
                InterfaceC0639g[] interfaceC0639gArr = new InterfaceC0639g[size];
                if (size > 0) {
                    AbstractC0653u.m1623a((Constructor) list.get(0), interfaceC0649q);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC0639gArr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC0649q);
            }
        }
        c0651s.f2009b = reflectiveGenericLifecycleObserver;
        c0651s.f2008a = enumC0645m2;
        C1235a c1235a = this.f2011b;
        C1237c c1237cMo2932a = c1235a.mo2932a(interfaceC0649q);
        if (c1237cMo2932a != null) {
            obj = c1237cMo2932a.f4925b;
        } else {
            HashMap map2 = c1235a.f4920e;
            C1237c c1237c = new C1237c(interfaceC0649q, c0651s);
            c1235a.f4934d++;
            C1237c c1237c2 = c1235a.f4932b;
            if (c1237c2 == null) {
                c1235a.f4931a = c1237c;
                c1235a.f4932b = c1237c;
            } else {
                c1237c2.f4926c = c1237c;
                c1237c.f4927d = c1237c2;
                c1235a.f4932b = c1237c;
            }
            map2.put(interfaceC0649q, c1237c);
        }
        if (((C0651s) obj) == null && (interfaceC0650r = (InterfaceC0650r) this.f2013d.get()) != null) {
            boolean z4 = this.f2014e != 0 || this.f2015f;
            EnumC0645m enumC0645mM1616b = m1616b(interfaceC0649q);
            this.f2014e++;
            while (c0651s.f2008a.compareTo(enumC0645mM1616b) < 0 && this.f2011b.f4920e.containsKey(interfaceC0649q)) {
                arrayList.add(c0651s.f2008a);
                C0642j c0642j = EnumC0644l.Companion;
                EnumC0645m enumC0645m3 = c0651s.f2008a;
                c0642j.getClass();
                EnumC0644l enumC0644lM1612a = C0642j.m1612a(enumC0645m3);
                if (enumC0644lM1612a == null) {
                    throw new IllegalStateException("no event up from " + c0651s.f2008a);
                }
                c0651s.m1614a(interfaceC0650r, enumC0644lM1612a);
                arrayList.remove(arrayList.size() - 1);
                enumC0645mM1616b = m1616b(interfaceC0649q);
            }
            if (!z4) {
                m1622h();
            }
            this.f2014e--;
        }
    }

    /* renamed from: b */
    public final EnumC0645m m1616b(InterfaceC0649q interfaceC0649q) {
        C0651s c0651s;
        HashMap map = this.f2011b.f4920e;
        C1237c c1237c = map.containsKey(interfaceC0649q) ? ((C1237c) map.get(interfaceC0649q)).f4927d : null;
        EnumC0645m enumC0645m = (c1237c == null || (c0651s = (C0651s) c1237c.f4925b) == null) ? null : c0651s.f2008a;
        ArrayList arrayList = this.f2017h;
        EnumC0645m enumC0645m2 = arrayList.isEmpty() ? null : (EnumC0645m) arrayList.get(arrayList.size() - 1);
        EnumC0645m enumC0645m3 = this.f2012c;
        AbstractC0469c.m1102e("state1", enumC0645m3);
        if (enumC0645m == null || enumC0645m.compareTo(enumC0645m3) >= 0) {
            enumC0645m = enumC0645m3;
        }
        return (enumC0645m2 == null || enumC0645m2.compareTo(enumC0645m) >= 0) ? enumC0645m : enumC0645m2;
    }

    /* renamed from: c */
    public final void m1617c(String str) {
        if (this.f2010a) {
            C1227a.m2855V().f4883l.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC0328E.m937g("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    /* renamed from: d */
    public final void m1618d(EnumC0644l enumC0644l) {
        AbstractC0469c.m1102e("event", enumC0644l);
        m1617c("handleLifecycleEvent");
        m1619e(enumC0644l.m1613a());
    }

    /* renamed from: e */
    public final void m1619e(EnumC0645m enumC0645m) {
        EnumC0645m enumC0645m2 = this.f2012c;
        if (enumC0645m2 == enumC0645m) {
            return;
        }
        EnumC0645m enumC0645m3 = EnumC0645m.f2002b;
        EnumC0645m enumC0645m4 = EnumC0645m.f2001a;
        if (enumC0645m2 == enumC0645m3 && enumC0645m == enumC0645m4) {
            throw new IllegalStateException(("no event down from " + this.f2012c + " in component " + this.f2013d.get()).toString());
        }
        this.f2012c = enumC0645m;
        if (this.f2015f || this.f2014e != 0) {
            this.f2016g = true;
            return;
        }
        this.f2015f = true;
        m1622h();
        this.f2015f = false;
        if (this.f2012c == enumC0645m4) {
            this.f2011b = new C1235a();
        }
    }

    /* renamed from: f */
    public final void m1620f(InterfaceC0649q interfaceC0649q) {
        m1617c("removeObserver");
        this.f2011b.mo2933b(interfaceC0649q);
    }

    /* renamed from: g */
    public final void m1621g() {
        EnumC0645m enumC0645m = EnumC0645m.f2003c;
        m1617c("setCurrentState");
        m1619e(enumC0645m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r7.f2016g = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        return;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1622h() {
        InterfaceC0650r interfaceC0650r = (InterfaceC0650r) this.f2013d.get();
        if (interfaceC0650r == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C1235a c1235a = this.f2011b;
            if (c1235a.f4934d != 0) {
                C1237c c1237c = c1235a.f4931a;
                AbstractC0469c.m1099b(c1237c);
                EnumC0645m enumC0645m = ((C0651s) c1237c.f4925b).f2008a;
                C1237c c1237c2 = this.f2011b.f4932b;
                AbstractC0469c.m1099b(c1237c2);
                EnumC0645m enumC0645m2 = ((C0651s) c1237c2.f4925b).f2008a;
                if (enumC0645m == enumC0645m2 && this.f2012c == enumC0645m2) {
                    break;
                }
                this.f2016g = false;
                EnumC0645m enumC0645m3 = this.f2012c;
                C1237c c1237c3 = this.f2011b.f4931a;
                AbstractC0469c.m1099b(c1237c3);
                if (enumC0645m3.compareTo(((C0651s) c1237c3.f4925b).f2008a) < 0) {
                    C1235a c1235a2 = this.f2011b;
                    C1236b c1236b = new C1236b(c1235a2.f4932b, c1235a2.f4931a, 1);
                    c1235a2.f4933c.put(c1236b, Boolean.FALSE);
                    while (c1236b.hasNext() && !this.f2016g) {
                        Map.Entry entry = (Map.Entry) c1236b.next();
                        AbstractC0469c.m1101d("next()", entry);
                        InterfaceC0649q interfaceC0649q = (InterfaceC0649q) entry.getKey();
                        C0651s c0651s = (C0651s) entry.getValue();
                        while (c0651s.f2008a.compareTo(this.f2012c) > 0 && !this.f2016g && this.f2011b.f4920e.containsKey(interfaceC0649q)) {
                            C0642j c0642j = EnumC0644l.Companion;
                            EnumC0645m enumC0645m4 = c0651s.f2008a;
                            c0642j.getClass();
                            AbstractC0469c.m1102e("state", enumC0645m4);
                            int iOrdinal = enumC0645m4.ordinal();
                            EnumC0644l enumC0644l = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : EnumC0644l.ON_PAUSE : EnumC0644l.ON_STOP : EnumC0644l.ON_DESTROY;
                            if (enumC0644l == null) {
                                throw new IllegalStateException("no event down from " + c0651s.f2008a);
                            }
                            this.f2017h.add(enumC0644l.m1613a());
                            c0651s.m1614a(interfaceC0650r, enumC0644l);
                            this.f2017h.remove(r4.size() - 1);
                        }
                    }
                }
                C1237c c1237c4 = this.f2011b.f4932b;
                if (!this.f2016g && c1237c4 != null && this.f2012c.compareTo(((C0651s) c1237c4.f4925b).f2008a) > 0) {
                    C1235a c1235a3 = this.f2011b;
                    c1235a3.getClass();
                    C1238d c1238d = new C1238d(c1235a3);
                    c1235a3.f4933c.put(c1238d, Boolean.FALSE);
                    while (c1238d.hasNext() && !this.f2016g) {
                        Map.Entry entry2 = (Map.Entry) c1238d.next();
                        InterfaceC0649q interfaceC0649q2 = (InterfaceC0649q) entry2.getKey();
                        C0651s c0651s2 = (C0651s) entry2.getValue();
                        while (c0651s2.f2008a.compareTo(this.f2012c) < 0 && !this.f2016g && this.f2011b.f4920e.containsKey(interfaceC0649q2)) {
                            this.f2017h.add(c0651s2.f2008a);
                            C0642j c0642j2 = EnumC0644l.Companion;
                            EnumC0645m enumC0645m5 = c0651s2.f2008a;
                            c0642j2.getClass();
                            EnumC0644l enumC0644lM1612a = C0642j.m1612a(enumC0645m5);
                            if (enumC0644lM1612a == null) {
                                throw new IllegalStateException("no event up from " + c0651s2.f2008a);
                            }
                            c0651s2.m1614a(interfaceC0650r, enumC0644lM1612a);
                            this.f2017h.remove(r4.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
