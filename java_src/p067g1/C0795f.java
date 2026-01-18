package p067g1;

import java.util.logging.Logger;
import p072i1.C0876f;
import p098r1.AbstractC1275o;
import p098r1.C1277q;
import p098r1.InterfaceC1267g;

/* renamed from: g1.f */
/* loaded from: classes.dex */
public final class C0795f extends AbstractC0787E {

    /* renamed from: a */
    public final C0876f f2924a;

    /* renamed from: b */
    public final C1277q f2925b;

    /* renamed from: c */
    public final String f2926c;

    public C0795f(C0876f c0876f, String str) {
        this.f2924a = c0876f;
        this.f2926c = str;
        C0794e c0794e = new C0794e(c0876f.f3393c[1], c0876f);
        Logger logger = AbstractC1275o.f5062a;
        this.f2925b = new C1277q(c0794e);
    }

    @Override // p067g1.AbstractC0787E
    /* renamed from: f */
    public final long mo2008f() {
        try {
            String str = this.f2926c;
            if (str != null) {
                return Long.parseLong(str);
            }
            return -1L;
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // p067g1.AbstractC0787E
    /* renamed from: g */
    public final InterfaceC1267g mo2009g() {
        return this.f2925b;
    }
}
