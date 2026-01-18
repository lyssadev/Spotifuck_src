package p074j0;

import android.database.Observable;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p023N.AbstractC0206Q;

/* renamed from: j0.D */
/* loaded from: classes.dex */
public final class C0889D extends Observable {
    /* renamed from: a */
    public final boolean m2254a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    /* renamed from: b */
    public final void m2255b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((C0904T) ((Observable) this).mObservers.get(size)).f3619a;
            recyclerView.m1789i(null);
            recyclerView.f2197j0.f3633f = true;
            recyclerView.m1775U(true);
            if (!recyclerView.f2194i.m2342j()) {
                recyclerView.requestLayout();
            }
        }
    }

    /* renamed from: c */
    public final void m2256c(int i, int i2, Preference preference) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            C0904T c0904t = (C0904T) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = c0904t.f3619a;
            recyclerView.m1789i(null);
            C0913b c0913b = recyclerView.f2194i;
            if (i2 < 1) {
                c0913b.getClass();
            } else {
                ArrayList arrayList = (ArrayList) c0913b.f3674c;
                arrayList.add(c0913b.m2344l(preference, 4, i, i2));
                c0913b.f3672a = 4 | c0913b.f3672a;
                if (arrayList.size() == 1) {
                    c0904t.getClass();
                    boolean z2 = RecyclerView.f2155B0;
                    RecyclerView recyclerView2 = c0904t.f3619a;
                    if (z2 && recyclerView2.f2222w && recyclerView2.f2220v) {
                        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                        recyclerView2.postOnAnimation(recyclerView2.f2202m);
                    } else {
                        recyclerView2.f2163D = true;
                        recyclerView2.requestLayout();
                    }
                }
            }
        }
    }
}
