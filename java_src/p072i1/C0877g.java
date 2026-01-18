package p072i1;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import p024N0.RunnableC0268B;
import p030Q0.AbstractC0328E;
import p070h1.AbstractC0869c;
import p086n1.C1084a;
import p089o1.C1226g;
import p098r1.AbstractC1275o;
import p098r1.C1261a;
import p098r1.C1276p;
import p098r1.C1277q;
import p098r1.C1284x;

/* renamed from: i1.g */
/* loaded from: classes.dex */
public final class C0877g implements Closeable, Flushable {

    /* renamed from: u */
    public static final Pattern f3395u = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: a */
    public final C1084a f3396a;

    /* renamed from: b */
    public final File f3397b;

    /* renamed from: c */
    public final File f3398c;

    /* renamed from: d */
    public final File f3399d;

    /* renamed from: e */
    public final File f3400e;

    /* renamed from: f */
    public final int f3401f;

    /* renamed from: g */
    public final long f3402g;

    /* renamed from: h */
    public final int f3403h;

    /* renamed from: i */
    public long f3404i;

    /* renamed from: j */
    public C1276p f3405j;

    /* renamed from: k */
    public final LinkedHashMap f3406k;

    /* renamed from: l */
    public int f3407l;

    /* renamed from: m */
    public boolean f3408m;

    /* renamed from: n */
    public boolean f3409n;

    /* renamed from: o */
    public boolean f3410o;

    /* renamed from: p */
    public boolean f3411p;

    /* renamed from: q */
    public boolean f3412q;

    /* renamed from: r */
    public long f3413r;

    /* renamed from: s */
    public final ThreadPoolExecutor f3414s;

    /* renamed from: t */
    public final RunnableC0268B f3415t;

    public C0877g(File file, long j2, ThreadPoolExecutor threadPoolExecutor) {
        C1084a c1084a = C1084a.f4433a;
        this.f3404i = 0L;
        this.f3406k = new LinkedHashMap(0, 0.75f, true);
        this.f3413r = 0L;
        this.f3415t = new RunnableC0268B(12, this);
        this.f3396a = c1084a;
        this.f3397b = file;
        this.f3401f = 201105;
        this.f3398c = new File(file, "journal");
        this.f3399d = new File(file, "journal.tmp");
        this.f3400e = new File(file, "journal.bkp");
        this.f3403h = 2;
        this.f3402g = j2;
        this.f3414s = threadPoolExecutor;
    }

    /* renamed from: t */
    public static void m2208t(String str) {
        if (!f3395u.matcher(str).matches()) {
            throw new IllegalArgumentException(AbstractC0328E.m937g("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f3409n && !this.f3410o) {
                for (C0875e c0875e : (C0875e[]) this.f3406k.values().toArray(new C0875e[this.f3406k.size()])) {
                    C0874d c0874d = c0875e.f3388f;
                    if (c0874d != null) {
                        c0874d.m2203a();
                    }
                }
                m2222s();
                this.f3405j.close();
                this.f3405j = null;
                this.f3410o = true;
                return;
            }
            this.f3410o = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: f */
    public final synchronized void m2209f() {
        if (m2214k()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f3409n) {
            m2209f();
            m2222s();
            this.f3405j.flush();
        }
    }

    /* renamed from: g */
    public final synchronized void m2210g(C0874d c0874d, boolean z2) {
        C0875e c0875e = c0874d.f3379a;
        if (c0875e.f3388f != c0874d) {
            throw new IllegalStateException();
        }
        if (z2 && !c0875e.f3387e) {
            for (int i = 0; i < this.f3403h; i++) {
                if (!c0874d.f3380b[i]) {
                    c0874d.m2203a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                C1084a c1084a = this.f3396a;
                File file = c0875e.f3386d[i];
                c1084a.getClass();
                if (!file.exists()) {
                    c0874d.m2203a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.f3403h; i2++) {
            File file2 = c0875e.f3386d[i2];
            if (z2) {
                this.f3396a.getClass();
                if (file2.exists()) {
                    File file3 = c0875e.f3385c[i2];
                    this.f3396a.m2681c(file2, file3);
                    long j2 = c0875e.f3384b[i2];
                    this.f3396a.getClass();
                    long length = file3.length();
                    c0875e.f3384b[i2] = length;
                    this.f3404i = (this.f3404i - j2) + length;
                }
            } else {
                this.f3396a.m2679a(file2);
            }
        }
        this.f3407l++;
        c0875e.f3388f = null;
        if (c0875e.f3387e || z2) {
            c0875e.f3387e = true;
            C1276p c1276p = this.f3405j;
            c1276p.mo2991c("CLEAN");
            c1276p.mo2992d(32);
            this.f3405j.mo2991c(c0875e.f3383a);
            C1276p c1276p2 = this.f3405j;
            for (long j3 : c0875e.f3384b) {
                c1276p2.mo2992d(32);
                c1276p2.m3044h(j3);
            }
            this.f3405j.mo2992d(10);
            if (z2) {
                long j4 = this.f3413r;
                this.f3413r = 1 + j4;
                c0875e.f3389g = j4;
            }
        } else {
            this.f3406k.remove(c0875e.f3383a);
            C1276p c1276p3 = this.f3405j;
            c1276p3.mo2991c("REMOVE");
            c1276p3.mo2992d(32);
            this.f3405j.mo2991c(c0875e.f3383a);
            this.f3405j.mo2992d(10);
        }
        this.f3405j.flush();
        if (this.f3404i > this.f3402g || m2215l()) {
            this.f3414s.execute(this.f3415t);
        }
    }

    /* renamed from: h */
    public final synchronized C0874d m2211h(String str, long j2) {
        m2213j();
        m2209f();
        m2208t(str);
        C0875e c0875e = (C0875e) this.f3406k.get(str);
        if (j2 != -1 && (c0875e == null || c0875e.f3389g != j2)) {
            return null;
        }
        if (c0875e != null && c0875e.f3388f != null) {
            return null;
        }
        if (!this.f3411p && !this.f3412q) {
            C1276p c1276p = this.f3405j;
            c1276p.mo2991c("DIRTY");
            c1276p.mo2992d(32);
            c1276p.mo2991c(str);
            c1276p.mo2992d(10);
            this.f3405j.flush();
            if (this.f3408m) {
                return null;
            }
            if (c0875e == null) {
                c0875e = new C0875e(this, str);
                this.f3406k.put(str, c0875e);
            }
            C0874d c0874d = new C0874d(this, c0875e);
            c0875e.f3388f = c0874d;
            return c0874d;
        }
        this.f3414s.execute(this.f3415t);
        return null;
    }

    /* renamed from: i */
    public final synchronized C0876f m2212i(String str) {
        m2213j();
        m2209f();
        m2208t(str);
        C0875e c0875e = (C0875e) this.f3406k.get(str);
        if (c0875e != null && c0875e.f3387e) {
            C0876f c0876fM2207a = c0875e.m2207a();
            if (c0876fM2207a == null) {
                return null;
            }
            this.f3407l++;
            C1276p c1276p = this.f3405j;
            c1276p.mo2991c("READ");
            c1276p.mo2992d(32);
            c1276p.mo2991c(str);
            c1276p.mo2992d(10);
            if (m2215l()) {
                this.f3414s.execute(this.f3415t);
            }
            return c0876fM2207a;
        }
        return null;
    }

    /* renamed from: j */
    public final synchronized void m2213j() {
        try {
            if (this.f3409n) {
                return;
            }
            C1084a c1084a = this.f3396a;
            File file = this.f3400e;
            c1084a.getClass();
            if (file.exists()) {
                C1084a c1084a2 = this.f3396a;
                File file2 = this.f3398c;
                c1084a2.getClass();
                if (file2.exists()) {
                    this.f3396a.m2679a(this.f3400e);
                } else {
                    this.f3396a.m2681c(this.f3400e, this.f3398c);
                }
            }
            C1084a c1084a3 = this.f3396a;
            File file3 = this.f3398c;
            c1084a3.getClass();
            if (file3.exists()) {
                try {
                    m2218o();
                    m2217n();
                    this.f3409n = true;
                    return;
                } catch (IOException e) {
                    C1226g.f4880a.mo2849k(5, "DiskLruCache " + this.f3397b + " is corrupt: " + e.getMessage() + ", removing", e);
                    try {
                        close();
                        this.f3396a.m2680b(this.f3397b);
                        this.f3410o = false;
                    } catch (Throwable th) {
                        this.f3410o = false;
                        throw th;
                    }
                }
            }
            m2220q();
            this.f3409n = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: k */
    public final synchronized boolean m2214k() {
        return this.f3410o;
    }

    /* renamed from: l */
    public final boolean m2215l() {
        int i = this.f3407l;
        return i >= 2000 && i >= this.f3406k.size();
    }

    /* renamed from: m */
    public final C1276p m2216m() {
        C1261a c1261a;
        File file = this.f3398c;
        this.f3396a.getClass();
        try {
            Logger logger = AbstractC1275o.f5062a;
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = AbstractC1275o.f5062a;
            c1261a = new C1261a(new C1284x(), new FileOutputStream(file, true));
        }
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        c1261a = new C1261a(new C1284x(), new FileOutputStream(file, true));
        return new C1276p(new C0873c(this, c1261a, 0));
    }

    /* renamed from: n */
    public final void m2217n() throws IOException {
        File file = this.f3399d;
        C1084a c1084a = this.f3396a;
        c1084a.m2679a(file);
        Iterator it2 = this.f3406k.values().iterator();
        while (it2.hasNext()) {
            C0875e c0875e = (C0875e) it2.next();
            C0874d c0874d = c0875e.f3388f;
            int i = this.f3403h;
            int i2 = 0;
            if (c0874d == null) {
                while (i2 < i) {
                    this.f3404i += c0875e.f3384b[i2];
                    i2++;
                }
            } else {
                c0875e.f3388f = null;
                while (i2 < i) {
                    c1084a.m2679a(c0875e.f3385c[i2]);
                    c1084a.m2679a(c0875e.f3386d[i2]);
                    i2++;
                }
                it2.remove();
            }
        }
    }

    /* renamed from: o */
    public final void m2218o() throws IOException {
        File file = this.f3398c;
        this.f3396a.getClass();
        Logger logger = AbstractC1275o.f5062a;
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        C1277q c1277q = new C1277q(AbstractC1275o.m3040b(new FileInputStream(file)));
        try {
            String strM3054n = c1277q.m3054n(Long.MAX_VALUE);
            String strM3054n2 = c1277q.m3054n(Long.MAX_VALUE);
            String strM3054n3 = c1277q.m3054n(Long.MAX_VALUE);
            String strM3054n4 = c1277q.m3054n(Long.MAX_VALUE);
            String strM3054n5 = c1277q.m3054n(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strM3054n) || !"1".equals(strM3054n2) || !Integer.toString(this.f3401f).equals(strM3054n3) || !Integer.toString(this.f3403h).equals(strM3054n4) || !"".equals(strM3054n5)) {
                throw new IOException("unexpected journal header: [" + strM3054n + ", " + strM3054n2 + ", " + strM3054n4 + ", " + strM3054n5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m2219p(c1277q.m3054n(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.f3407l = i - this.f3406k.size();
                    if (c1277q.m3046f()) {
                        this.f3405j = m2216m();
                    } else {
                        m2220q();
                    }
                    AbstractC0869c.m2180c(c1277q);
                    return;
                }
            }
        } catch (Throwable th) {
            AbstractC0869c.m2180c(c1277q);
            throw th;
        }
    }

    /* renamed from: p */
    public final void m2219p(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.f3406k;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C0875e c0875e = (C0875e) linkedHashMap.get(strSubstring);
        if (c0875e == null) {
            c0875e = new C0875e(this, strSubstring);
            linkedHashMap.put(strSubstring, c0875e);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                c0875e.f3388f = new C0874d(this, c0875e);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        c0875e.f3387e = true;
        c0875e.f3388f = null;
        if (strArrSplit.length != c0875e.f3390h.f3403h) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                c0875e.f3384b[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    /* renamed from: q */
    public final synchronized void m2220q() {
        C1261a c1261a;
        try {
            C1276p c1276p = this.f3405j;
            if (c1276p != null) {
                c1276p.close();
            }
            C1084a c1084a = this.f3396a;
            File file = this.f3399d;
            c1084a.getClass();
            try {
                Logger logger = AbstractC1275o.f5062a;
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                Logger logger2 = AbstractC1275o.f5062a;
                c1261a = new C1261a(new C1284x(), new FileOutputStream(file));
            }
            if (file == null) {
                throw new IllegalArgumentException("file == null");
            }
            c1261a = new C1261a(new C1284x(), new FileOutputStream(file));
            C1276p c1276p2 = new C1276p(c1261a);
            try {
                c1276p2.mo2991c("libcore.io.DiskLruCache");
                c1276p2.mo2992d(10);
                c1276p2.mo2991c("1");
                c1276p2.mo2992d(10);
                c1276p2.m3044h(this.f3401f);
                c1276p2.mo2992d(10);
                c1276p2.m3044h(this.f3403h);
                c1276p2.mo2992d(10);
                c1276p2.mo2992d(10);
                Iterator it2 = this.f3406k.values().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C0875e c0875e = (C0875e) it2.next();
                    if (c0875e.f3388f != null) {
                        c1276p2.mo2991c("DIRTY");
                        c1276p2.mo2992d(32);
                        c1276p2.mo2991c(c0875e.f3383a);
                        c1276p2.mo2992d(10);
                    } else {
                        c1276p2.mo2991c("CLEAN");
                        c1276p2.mo2992d(32);
                        c1276p2.mo2991c(c0875e.f3383a);
                        for (long j2 : c0875e.f3384b) {
                            c1276p2.mo2992d(32);
                            c1276p2.m3044h(j2);
                        }
                        c1276p2.mo2992d(10);
                    }
                }
                c1276p2.close();
                C1084a c1084a2 = this.f3396a;
                File file2 = this.f3398c;
                c1084a2.getClass();
                if (file2.exists()) {
                    this.f3396a.m2681c(this.f3398c, this.f3400e);
                }
                this.f3396a.m2681c(this.f3399d, this.f3398c);
                this.f3396a.m2679a(this.f3400e);
                this.f3405j = m2216m();
                this.f3408m = false;
                this.f3412q = false;
            } catch (Throwable th) {
                c1276p2.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: r */
    public final void m2221r(C0875e c0875e) throws IOException {
        C0874d c0874d = c0875e.f3388f;
        if (c0874d != null) {
            c0874d.m2205c();
        }
        for (int i = 0; i < this.f3403h; i++) {
            this.f3396a.m2679a(c0875e.f3385c[i]);
            long j2 = this.f3404i;
            long[] jArr = c0875e.f3384b;
            this.f3404i = j2 - jArr[i];
            jArr[i] = 0;
        }
        this.f3407l++;
        C1276p c1276p = this.f3405j;
        c1276p.mo2991c("REMOVE");
        c1276p.mo2992d(32);
        String str = c0875e.f3383a;
        c1276p.mo2991c(str);
        c1276p.mo2992d(10);
        this.f3406k.remove(str);
        if (m2215l()) {
            this.f3414s.execute(this.f3415t);
        }
    }

    /* renamed from: s */
    public final void m2222s() throws IOException {
        while (this.f3404i > this.f3402g) {
            m2221r((C0875e) this.f3406k.values().iterator().next());
        }
        this.f3411p = false;
    }
}
