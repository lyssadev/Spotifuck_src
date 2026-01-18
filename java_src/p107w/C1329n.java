package p107w;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p018K0.C0146e;
import p030Q0.AbstractC0328E;
import p101t.C1298c;
import p105v.AbstractC1314j;
import p105v.C1308d;
import p105v.C1309e;

/* renamed from: w.n */
/* loaded from: classes.dex */
public final class C1329n {

    /* renamed from: f */
    public static int f5388f;

    /* renamed from: a */
    public ArrayList f5389a;

    /* renamed from: b */
    public int f5390b;

    /* renamed from: c */
    public int f5391c;

    /* renamed from: d */
    public ArrayList f5392d;

    /* renamed from: e */
    public int f5393e;

    /* renamed from: a */
    public final void m3236a(ArrayList arrayList) {
        int size = this.f5389a.size();
        if (this.f5393e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C1329n c1329n = (C1329n) arrayList.get(i);
                if (this.f5393e == c1329n.f5390b) {
                    m3238c(this.f5391c, c1329n);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* renamed from: b */
    public final int m3237b(C1298c c1298c, int i) {
        int iM3094n;
        int iM3094n2;
        ArrayList arrayList = this.f5389a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C1309e c1309e = (C1309e) ((C1308d) arrayList.get(0)).f5210T;
        c1298c.m3113t();
        c1309e.mo3127b(c1298c, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C1308d) arrayList.get(i2)).mo3127b(c1298c, false);
        }
        if (i == 0 && c1309e.f5280z0 > 0) {
            AbstractC1314j.m3199a(c1309e, c1298c, arrayList, 0);
        }
        if (i == 1 && c1309e.f5259A0 > 0) {
            AbstractC1314j.m3199a(c1309e, c1298c, arrayList, 1);
        }
        try {
            c1298c.m3109p();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f5392d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C1308d c1308d = (C1308d) arrayList.get(i3);
            C0146e c0146e = new C0146e(27);
            new WeakReference(c1308d);
            C1298c.m3094n(c1308d.f5199I);
            C1298c.m3094n(c1308d.f5200J);
            C1298c.m3094n(c1308d.f5201K);
            C1298c.m3094n(c1308d.f5202L);
            C1298c.m3094n(c1308d.f5203M);
            this.f5392d.add(c0146e);
        }
        if (i == 0) {
            iM3094n = C1298c.m3094n(c1309e.f5199I);
            iM3094n2 = C1298c.m3094n(c1309e.f5201K);
            c1298c.m3113t();
        } else {
            iM3094n = C1298c.m3094n(c1309e.f5200J);
            iM3094n2 = C1298c.m3094n(c1309e.f5202L);
            c1298c.m3113t();
        }
        return iM3094n2 - iM3094n;
    }

    /* renamed from: c */
    public final void m3238c(int i, C1329n c1329n) {
        Iterator it2 = this.f5389a.iterator();
        while (it2.hasNext()) {
            C1308d c1308d = (C1308d) it2.next();
            ArrayList arrayList = c1329n.f5389a;
            if (!arrayList.contains(c1308d)) {
                arrayList.add(c1308d);
            }
            int i2 = c1329n.f5390b;
            if (i == 0) {
                c1308d.f5244n0 = i2;
            } else {
                c1308d.f5246o0 = i2;
            }
        }
        this.f5393e = c1329n.f5390b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f5391c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f5390b);
        sb.append("] <");
        String string = sb.toString();
        Iterator it2 = this.f5389a.iterator();
        while (it2.hasNext()) {
            string = string + " " + ((C1308d) it2.next()).f5232h0;
        }
        return AbstractC0328E.m936f(string, " >");
    }
}
