package p023N;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import it.deviato.spotifuck.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: N.P */
/* loaded from: classes.dex */
public final class C0205P {

    /* renamed from: d */
    public static final ArrayList f556d = new ArrayList();

    /* renamed from: a */
    public WeakHashMap f557a;

    /* renamed from: b */
    public SparseArray f558b;

    /* renamed from: c */
    public WeakReference f559c;

    /* renamed from: a */
    public final View m665a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f557a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View viewM665a = m665a(viewGroup.getChildAt(childCount));
                    if (viewM665a != null) {
                        return viewM665a;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                throw new ClassCastException();
            }
        }
        return null;
    }
}
