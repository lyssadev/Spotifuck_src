package p072i1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;
import p098r1.AbstractC1275o;
import p098r1.C1261a;
import p098r1.C1274n;
import p098r1.C1284x;
import p098r1.InterfaceC1281u;

/* renamed from: i1.d */
/* loaded from: classes.dex */
public final class C0874d {

    /* renamed from: a */
    public final C0875e f3379a;

    /* renamed from: b */
    public final boolean[] f3380b;

    /* renamed from: c */
    public boolean f3381c;

    /* renamed from: d */
    public final /* synthetic */ C0877g f3382d;

    public C0874d(C0877g c0877g, C0875e c0875e) {
        this.f3382d = c0877g;
        this.f3379a = c0875e;
        this.f3380b = c0875e.f3387e ? null : new boolean[c0877g.f3403h];
    }

    /* renamed from: a */
    public final void m2203a() {
        synchronized (this.f3382d) {
            try {
                if (this.f3381c) {
                    throw new IllegalStateException();
                }
                if (this.f3379a.f3388f == this) {
                    this.f3382d.m2210g(this, false);
                }
                this.f3381c = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m2204b() {
        synchronized (this.f3382d) {
            try {
                if (this.f3381c) {
                    throw new IllegalStateException();
                }
                if (this.f3379a.f3388f == this) {
                    this.f3382d.m2210g(this, true);
                }
                this.f3381c = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final void m2205c() {
        C0875e c0875e = this.f3379a;
        if (c0875e.f3388f != this) {
            return;
        }
        int i = 0;
        while (true) {
            C0877g c0877g = this.f3382d;
            if (i >= c0877g.f3403h) {
                c0875e.f3388f = null;
                return;
            } else {
                try {
                    c0877g.f3396a.m2679a(c0875e.f3386d[i]);
                } catch (IOException unused) {
                }
                i++;
            }
        }
    }

    /* renamed from: d */
    public final InterfaceC1281u m2206d(int i) {
        C1261a c1261a;
        synchronized (this.f3382d) {
            try {
                if (this.f3381c) {
                    throw new IllegalStateException();
                }
                C0875e c0875e = this.f3379a;
                if (c0875e.f3388f != this) {
                    Logger logger = AbstractC1275o.f5062a;
                    return new C1274n();
                }
                if (!c0875e.f3387e) {
                    this.f3380b[i] = true;
                }
                File file = c0875e.f3386d[i];
                try {
                    this.f3382d.f3396a.getClass();
                    try {
                        Logger logger2 = AbstractC1275o.f5062a;
                    } catch (FileNotFoundException unused) {
                        file.getParentFile().mkdirs();
                        Logger logger3 = AbstractC1275o.f5062a;
                        c1261a = new C1261a(new C1284x(), new FileOutputStream(file));
                    }
                    if (file == null) {
                        throw new IllegalArgumentException("file == null");
                    }
                    c1261a = new C1261a(new C1284x(), new FileOutputStream(file));
                    return new C0873c(this, c1261a, 1);
                } catch (FileNotFoundException unused2) {
                    Logger logger4 = AbstractC1275o.f5062a;
                    return new C1274n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
