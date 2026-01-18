package p017K;

import android.util.Base64;
import java.util.List;

/* renamed from: K.e */
/* loaded from: classes.dex */
public final class C0132e {

    /* renamed from: a */
    public final String f346a;

    /* renamed from: b */
    public final String f347b;

    /* renamed from: c */
    public final String f348c;

    /* renamed from: d */
    public final List f349d;

    /* renamed from: e */
    public final String f350e;

    public C0132e(String str, String str2, String str3, List list) {
        str.getClass();
        this.f346a = str;
        str2.getClass();
        this.f347b = str2;
        this.f348c = str3;
        list.getClass();
        this.f349d = list;
        this.f350e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f346a + ", mProviderPackage: " + this.f347b + ", mQuery: " + this.f348c + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.f349d;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}
