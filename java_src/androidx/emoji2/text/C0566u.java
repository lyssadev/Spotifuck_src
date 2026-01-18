package androidx.emoji2.text;

import java.nio.ByteBuffer;
import p000A.C0010k;
import p041W.C0423a;
import p041W.C0424b;

/* renamed from: androidx.emoji2.text.u */
/* loaded from: classes.dex */
public final class C0566u {

    /* renamed from: d */
    public static final ThreadLocal f1686d = new ThreadLocal();

    /* renamed from: a */
    public final int f1687a;

    /* renamed from: b */
    public final C0010k f1688b;

    /* renamed from: c */
    public volatile int f1689c = 0;

    public C0566u(C0010k c0010k, int i) {
        this.f1688b = c0010k;
        this.f1687a = i;
    }

    /* renamed from: a */
    public final int m1454a(int i) {
        C0423a c0423aM1456c = m1456c();
        int iM590a = c0423aM1456c.m590a(16);
        if (iM590a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c0423aM1456c.f551d;
        int i2 = iM590a + c0423aM1456c.f548a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    /* renamed from: b */
    public final int m1455b() {
        C0423a c0423aM1456c = m1456c();
        int iM590a = c0423aM1456c.m590a(16);
        if (iM590a == 0) {
            return 0;
        }
        int i = iM590a + c0423aM1456c.f548a;
        return ((ByteBuffer) c0423aM1456c.f551d).getInt(((ByteBuffer) c0423aM1456c.f551d).getInt(i) + i);
    }

    /* renamed from: c */
    public final C0423a m1456c() {
        ThreadLocal threadLocal = f1686d;
        C0423a c0423a = (C0423a) threadLocal.get();
        if (c0423a == null) {
            c0423a = new C0423a();
            threadLocal.set(c0423a);
        }
        C0424b c0424b = (C0424b) this.f1688b.f23f;
        int iM590a = c0424b.m590a(6);
        if (iM590a != 0) {
            int i = iM590a + c0424b.f548a;
            int i2 = (this.f1687a * 4) + ((ByteBuffer) c0424b.f551d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) c0424b.f551d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) c0424b.f551d;
            c0423a.f551d = byteBuffer;
            if (byteBuffer != null) {
                c0423a.f548a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                c0423a.f549b = i4;
                c0423a.f550c = ((ByteBuffer) c0423a.f551d).getShort(i4);
            } else {
                c0423a.f548a = 0;
                c0423a.f549b = 0;
                c0423a.f550c = 0;
            }
        }
        return c0423a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C0423a c0423aM1456c = m1456c();
        int iM590a = c0423aM1456c.m590a(4);
        sb.append(Integer.toHexString(iM590a != 0 ? ((ByteBuffer) c0423aM1456c.f551d).getInt(iM590a + c0423aM1456c.f548a) : 0));
        sb.append(", codepoints:");
        int iM1455b = m1455b();
        for (int i = 0; i < iM1455b; i++) {
            sb.append(Integer.toHexString(m1454a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
