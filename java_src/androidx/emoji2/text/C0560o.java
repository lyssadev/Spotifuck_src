package androidx.emoji2.text;

import java.nio.ByteBuffer;
import p041W.C0423a;

/* renamed from: androidx.emoji2.text.o */
/* loaded from: classes.dex */
public final class C0560o {

    /* renamed from: a */
    public int f1665a = 1;

    /* renamed from: b */
    public final C0563r f1666b;

    /* renamed from: c */
    public C0563r f1667c;

    /* renamed from: d */
    public C0563r f1668d;

    /* renamed from: e */
    public int f1669e;

    /* renamed from: f */
    public int f1670f;

    public C0560o(C0563r c0563r) {
        this.f1666b = c0563r;
        this.f1667c = c0563r;
    }

    /* renamed from: a */
    public final void m1443a() {
        this.f1665a = 1;
        this.f1667c = this.f1666b;
        this.f1670f = 0;
    }

    /* renamed from: b */
    public final boolean m1444b() {
        C0423a c0423aM1456c = this.f1667c.f1681b.m1456c();
        int iM590a = c0423aM1456c.m590a(6);
        return !(iM590a == 0 || ((ByteBuffer) c0423aM1456c.f551d).get(iM590a + c0423aM1456c.f548a) == 0) || this.f1669e == 65039;
    }
}
