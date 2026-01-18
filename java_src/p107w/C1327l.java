package p107w;

import java.util.ArrayList;

/* renamed from: w.l */
/* loaded from: classes.dex */
public final class C1327l {

    /* renamed from: a */
    public AbstractC1330o f5384a;

    /* renamed from: b */
    public ArrayList f5385b;

    /* renamed from: a */
    public static long m3233a(C1321f c1321f, long j2) {
        AbstractC1330o abstractC1330o = c1321f.f5372d;
        if (abstractC1330o instanceof C1325j) {
            return j2;
        }
        ArrayList arrayList = c1321f.f5379k;
        int size = arrayList.size();
        long jMin = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC1319d interfaceC1319d = (InterfaceC1319d) arrayList.get(i);
            if (interfaceC1319d instanceof C1321f) {
                C1321f c1321f2 = (C1321f) interfaceC1319d;
                if (c1321f2.f5372d != abstractC1330o) {
                    jMin = Math.min(jMin, m3233a(c1321f2, c1321f2.f5374f + j2));
                }
            }
        }
        if (c1321f != abstractC1330o.f5402i) {
            return jMin;
        }
        long jMo3206j = abstractC1330o.mo3206j();
        long j3 = j2 - jMo3206j;
        return Math.min(Math.min(jMin, m3233a(abstractC1330o.f5401h, j3)), j3 - r9.f5374f);
    }

    /* renamed from: b */
    public static long m3234b(C1321f c1321f, long j2) {
        AbstractC1330o abstractC1330o = c1321f.f5372d;
        if (abstractC1330o instanceof C1325j) {
            return j2;
        }
        ArrayList arrayList = c1321f.f5379k;
        int size = arrayList.size();
        long jMax = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC1319d interfaceC1319d = (InterfaceC1319d) arrayList.get(i);
            if (interfaceC1319d instanceof C1321f) {
                C1321f c1321f2 = (C1321f) interfaceC1319d;
                if (c1321f2.f5372d != abstractC1330o) {
                    jMax = Math.max(jMax, m3234b(c1321f2, c1321f2.f5374f + j2));
                }
            }
        }
        if (c1321f != abstractC1330o.f5401h) {
            return jMax;
        }
        long jMo3206j = abstractC1330o.mo3206j();
        long j3 = j2 + jMo3206j;
        return Math.max(Math.max(jMax, m3234b(abstractC1330o.f5402i, j3)), j3 - r9.f5374f);
    }
}
