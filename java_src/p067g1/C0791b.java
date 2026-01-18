package p067g1;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import p075j1.C0949b;
import p075j1.C0952e;
import p075j1.C0953f;

/* renamed from: g1.b */
/* loaded from: classes.dex */
public final class C0791b {

    /* renamed from: a */
    public static final C0791b f2911a = new C0791b();

    /* renamed from: b */
    public static final C0791b f2912b = new C0791b();

    /* renamed from: c */
    public static final C0791b f2913c = new C0791b();

    /* renamed from: d */
    public static final C0791b f2914d = new C0791b();

    /* renamed from: e */
    public static C0791b f2915e;

    /* renamed from: a */
    public static Socket m2012a(C0803n c0803n, C0790a c0790a, C0953f c0953f) {
        Iterator it2 = c0803n.f2982d.iterator();
        while (it2.hasNext()) {
            C0949b c0949b = (C0949b) it2.next();
            if (c0949b.m2422g(c0790a, null) && c0949b.f3879h != null && c0949b != c0953f.m2428a()) {
                if (c0953f.f3908l != null || c0953f.f3905i.f3885n.size() != 1) {
                    throw new IllegalStateException();
                }
                Reference reference = (Reference) c0953f.f3905i.f3885n.get(0);
                Socket socketM2429b = c0953f.m2429b(true, false, false);
                c0953f.f3905i = c0949b;
                c0949b.f3885n.add(reference);
                return socketM2429b;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m2013b(C0803n c0803n, C0790a c0790a, C0953f c0953f, C0788F c0788f) {
        Iterator it2 = c0803n.f2982d.iterator();
        while (it2.hasNext()) {
            C0949b c0949b = (C0949b) it2.next();
            if (c0949b.m2422g(c0790a, c0788f)) {
                if (c0953f.f3905i != null) {
                    throw new IllegalStateException();
                }
                c0953f.f3905i = c0949b;
                c0953f.f3906j = true;
                c0949b.f3885n.add(new C0952e(c0953f, c0953f.f3902f));
                return;
            }
        }
    }
}
