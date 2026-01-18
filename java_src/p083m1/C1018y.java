package p083m1;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: m1.y */
/* loaded from: classes.dex */
public final class C1018y {

    /* renamed from: b */
    public long f4156b;

    /* renamed from: c */
    public final int f4157c;

    /* renamed from: d */
    public final C1012s f4158d;

    /* renamed from: e */
    public ArrayList f4159e;

    /* renamed from: f */
    public boolean f4160f;

    /* renamed from: g */
    public final C1016w f4161g;

    /* renamed from: h */
    public final C1015v f4162h;

    /* renamed from: i */
    public final C1017x f4163i;

    /* renamed from: j */
    public final C1017x f4164j;

    /* renamed from: a */
    public long f4155a = 0;

    /* renamed from: k */
    public int f4165k = 0;

    public C1018y(int i, C1012s c1012s, boolean z2, boolean z3, ArrayList arrayList) {
        int i2 = 0;
        this.f4163i = new C1017x(i2, this);
        this.f4164j = new C1017x(i2, this);
        if (c1012s == null) {
            throw new NullPointerException("connection == null");
        }
        this.f4157c = i;
        this.f4158d = c1012s;
        this.f4156b = c1012s.f4126o.m488b();
        C1016w c1016w = new C1016w(this, c1012s.f4125n.m488b());
        this.f4161g = c1016w;
        C1015v c1015v = new C1015v(this);
        this.f4162h = c1015v;
        c1016w.f4151e = z3;
        c1015v.f4145c = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2524a() {
        boolean z2;
        boolean zM2530g;
        synchronized (this) {
            try {
                C1016w c1016w = this.f4161g;
                if (c1016w.f4151e || !c1016w.f4150d) {
                    z2 = false;
                } else {
                    C1015v c1015v = this.f4162h;
                    if (c1015v.f4145c || c1015v.f4144b) {
                        z2 = true;
                    }
                }
                zM2530g = m2530g();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            m2526c(6);
        } else {
            if (zM2530g) {
                return;
            }
            this.f4158d.m2504j(this.f4157c);
        }
    }

    /* renamed from: b */
    public final void m2525b() throws IOException {
        C1015v c1015v = this.f4162h;
        if (c1015v.f4144b) {
            throw new IOException("stream closed");
        }
        if (c1015v.f4145c) {
            throw new IOException("stream finished");
        }
        if (this.f4165k != 0) {
            throw new C0993D(this.f4165k);
        }
    }

    /* renamed from: c */
    public final void m2526c(int i) {
        if (m2527d(i)) {
            this.f4158d.f4129r.m2540l(this.f4157c, i);
        }
    }

    /* renamed from: d */
    public final boolean m2527d(int i) {
        synchronized (this) {
            try {
                if (this.f4165k != 0) {
                    return false;
                }
                if (this.f4161g.f4151e && this.f4162h.f4145c) {
                    return false;
                }
                this.f4165k = i;
                notifyAll();
                this.f4158d.m2504j(this.f4157c);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public final C1015v m2528e() {
        synchronized (this) {
            try {
                if (!this.f4160f && !m2529f()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f4162h;
    }

    /* renamed from: f */
    public final boolean m2529f() {
        return this.f4158d.f4112a == ((this.f4157c & 1) == 1);
    }

    /* renamed from: g */
    public final synchronized boolean m2530g() {
        try {
            if (this.f4165k != 0) {
                return false;
            }
            C1016w c1016w = this.f4161g;
            if (c1016w.f4151e || c1016w.f4150d) {
                C1015v c1015v = this.f4162h;
                if (c1015v.f4145c || c1015v.f4144b) {
                    if (this.f4160f) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: h */
    public final void m2531h() {
        boolean zM2530g;
        synchronized (this) {
            this.f4161g.f4151e = true;
            zM2530g = m2530g();
            notifyAll();
        }
        if (zM2530g) {
            return;
        }
        this.f4158d.m2504j(this.f4157c);
    }

    /* renamed from: i */
    public final void m2532i(ArrayList arrayList) {
        boolean zM2530g;
        synchronized (this) {
            zM2530g = true;
            try {
                this.f4160f = true;
                if (this.f4159e == null) {
                    this.f4159e = arrayList;
                    zM2530g = m2530g();
                    notifyAll();
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(this.f4159e);
                    arrayList2.add(null);
                    arrayList2.addAll(arrayList);
                    this.f4159e = arrayList2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM2530g) {
            return;
        }
        this.f4158d.m2504j(this.f4157c);
    }

    /* renamed from: j */
    public final synchronized void m2533j(int i) {
        if (this.f4165k == 0) {
            this.f4165k = i;
            notifyAll();
        }
    }
}
