package p072i1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Logger;
import p070h1.AbstractC0869c;
import p086n1.C1084a;
import p098r1.AbstractC1275o;
import p098r1.InterfaceC1282v;

/* renamed from: i1.e */
/* loaded from: classes.dex */
public final class C0875e {

    /* renamed from: a */
    public final String f3383a;

    /* renamed from: b */
    public final long[] f3384b;

    /* renamed from: c */
    public final File[] f3385c;

    /* renamed from: d */
    public final File[] f3386d;

    /* renamed from: e */
    public boolean f3387e;

    /* renamed from: f */
    public C0874d f3388f;

    /* renamed from: g */
    public long f3389g;

    /* renamed from: h */
    public final /* synthetic */ C0877g f3390h;

    public C0875e(C0877g c0877g, String str) {
        this.f3390h = c0877g;
        this.f3383a = str;
        int i = c0877g.f3403h;
        this.f3384b = new long[i];
        this.f3385c = new File[i];
        this.f3386d = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < c0877g.f3403h; i2++) {
            sb.append(i2);
            File[] fileArr = this.f3385c;
            String string = sb.toString();
            File file = c0877g.f3397b;
            fileArr[i2] = new File(file, string);
            sb.append(".tmp");
            this.f3386d[i2] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    /* renamed from: a */
    public final C0876f m2207a() throws IOException {
        InterfaceC1282v interfaceC1282v;
        C0877g c0877g = this.f3390h;
        if (!Thread.holdsLock(c0877g)) {
            throw new AssertionError();
        }
        InterfaceC1282v[] interfaceC1282vArr = new InterfaceC1282v[c0877g.f3403h];
        for (int i = 0; i < c0877g.f3403h; i++) {
            try {
                C1084a c1084a = c0877g.f3396a;
                File file = this.f3385c[i];
                c1084a.getClass();
                Logger logger = AbstractC1275o.f5062a;
                if (file == null) {
                    throw new IllegalArgumentException("file == null");
                }
                interfaceC1282vArr[i] = AbstractC1275o.m3040b(new FileInputStream(file));
            } catch (FileNotFoundException unused) {
                for (int i2 = 0; i2 < c0877g.f3403h && (interfaceC1282v = interfaceC1282vArr[i2]) != null; i2++) {
                    AbstractC0869c.m2180c(interfaceC1282v);
                }
                try {
                    c0877g.m2221r(this);
                    return null;
                } catch (IOException unused2) {
                    return null;
                }
            }
        }
        return new C0876f(c0877g, this.f3383a, this.f3389g, interfaceC1282vArr);
    }
}
