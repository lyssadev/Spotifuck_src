package p096r;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: r.f */
/* loaded from: classes.dex */
public class C1251f {

    /* renamed from: a */
    public final LinkedHashMap f4989a;

    /* renamed from: b */
    public int f4990b;

    /* renamed from: c */
    public final int f4991c;

    /* renamed from: d */
    public int f4992d;

    /* renamed from: e */
    public int f4993e;

    public C1251f(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f4991c = i;
        this.f4989a = new LinkedHashMap(0, 0.75f, true);
    }

    /* renamed from: a */
    public final Object m2963a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = this.f4989a.get(obj);
                if (obj2 != null) {
                    this.f4992d++;
                    return obj2;
                }
                this.f4993e++;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final Object m2964b(Object obj, Object obj2) {
        Object objPut;
        if (obj == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f4990b++;
                objPut = this.f4989a.put(obj, obj2);
                if (objPut != null) {
                    this.f4990b--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m2965c(this.f4991c);
        return objPut;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2965c(int i) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.f4990b < 0 || (this.f4989a.isEmpty() && this.f4990b != 0)) {
                        break;
                    }
                    if (this.f4990b <= i || this.f4989a.isEmpty()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) this.f4989a.entrySet().iterator().next();
                    Object key = entry.getKey();
                    entry.getValue();
                    this.f4989a.remove(key);
                    this.f4990b--;
                } finally {
                }
            }
        }
    }

    public final synchronized String toString() {
        int i;
        int i2;
        int i3;
        try {
            i = this.f4992d;
            i2 = this.f4993e;
            int i4 = i + i2;
            i3 = i4 != 0 ? (i * 100) / i4 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.f4991c + ",hits=" + i + ",misses=" + i2 + ",hitRate=" + i3 + "%]";
    }
}
