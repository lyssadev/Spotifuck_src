package p000A;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.WeakHashMap;
import p023N.AbstractC0195F;
import p023N.AbstractC0206Q;
import p074j0.C0936o;
import p101t.C1301f;

/* renamed from: A.j */
/* loaded from: classes.dex */
public final class C0009j implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ int f22a;

    public /* synthetic */ C0009j(int i) {
        this.f22a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i = -1;
        switch (this.f22a) {
            case 0:
                WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                float fM607m = AbstractC0195F.m607m((View) obj);
                float fM607m2 = AbstractC0195F.m607m((View) obj2);
                if (fM607m > fM607m2) {
                    return -1;
                }
                return fM607m < fM607m2 ? 1 : 0;
            case 1:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 2:
                return ((String) obj).compareTo((String) obj2);
            case 3:
                C0936o c0936o = (C0936o) obj;
                C0936o c0936o2 = (C0936o) obj2;
                RecyclerView recyclerView = c0936o.f3806d;
                if ((recyclerView == null) == (c0936o2.f3806d == null)) {
                    boolean z2 = c0936o.f3803a;
                    if (z2 == c0936o2.f3803a) {
                        i = c0936o2.f3804b - c0936o.f3804b;
                        if (i == 0) {
                            int i2 = c0936o.f3805c - c0936o2.f3805c;
                            if (i2 != 0) {
                                return i2;
                            }
                            return 0;
                        }
                    } else if (!z2) {
                    }
                } else if (recyclerView == null) {
                    i = 1;
                }
                return i;
            default:
                return ((C1301f) obj).f5145b - ((C1301f) obj2).f5145b;
        }
    }
}
