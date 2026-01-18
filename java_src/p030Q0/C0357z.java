package p030Q0;

import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: Q0.z */
/* loaded from: classes.dex */
public final class C0357z {

    /* renamed from: a */
    public final Uri f938a;

    /* renamed from: b */
    public final List f939b = null;

    /* renamed from: c */
    public final int f940c;

    static {
        TimeUnit.SECONDS.toNanos(5L);
    }

    public C0357z(Uri uri, int i) {
        this.f938a = uri;
        this.f940c = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        sb.append(this.f938a);
        List list = this.f939b;
        if (list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                if (it2.next() != null) {
                    throw new ClassCastException();
                }
                sb.append(' ');
                throw null;
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
