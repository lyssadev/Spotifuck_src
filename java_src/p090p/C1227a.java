package p090p;

import p036T0.AbstractC0411g;

/* renamed from: p.a */
/* loaded from: classes.dex */
public final class C1227a extends AbstractC0411g {

    /* renamed from: m */
    public static volatile C1227a f4882m;

    /* renamed from: l */
    public final C1229c f4883l = new C1229c();

    /* renamed from: V */
    public static C1227a m2855V() {
        if (f4882m != null) {
            return f4882m;
        }
        synchronized (C1227a.class) {
            try {
                if (f4882m == null) {
                    f4882m = new C1227a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f4882m;
    }
}
