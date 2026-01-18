package p067g1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p000A.C0001b;

/* renamed from: g1.s */
/* loaded from: classes.dex */
public final class C0808s {

    /* renamed from: a */
    public final String[] f3012a;

    public C0808s(C0001b c0001b) {
        ArrayList arrayList = (ArrayList) c0001b.f2g;
        this.f3012a = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: a */
    public final String m2033a(String str) {
        String[] strArr = this.f3012a;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* renamed from: b */
    public final String m2034b(int i) {
        return this.f3012a[i * 2];
    }

    /* renamed from: c */
    public final C0001b m2035c() {
        C0001b c0001b = new C0001b(27);
        Collections.addAll((ArrayList) c0001b.f2g, this.f3012a);
        return c0001b;
    }

    /* renamed from: d */
    public final int m2036d() {
        return this.f3012a.length / 2;
    }

    /* renamed from: e */
    public final String m2037e(int i) {
        return this.f3012a[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0808s) && Arrays.equals(((C0808s) obj).f3012a, this.f3012a);
    }

    /* renamed from: f */
    public final List m2038f(String str) {
        int iM2036d = m2036d();
        ArrayList arrayList = null;
        for (int i = 0; i < iM2036d; i++) {
            if (str.equalsIgnoreCase(m2034b(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m2037e(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3012a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iM2036d = m2036d();
        for (int i = 0; i < iM2036d; i++) {
            sb.append(m2034b(i));
            sb.append(": ");
            sb.append(m2037e(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}
