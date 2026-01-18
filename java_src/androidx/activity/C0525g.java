package androidx.activity;

import android.os.Bundle;
import androidx.fragment.app.C0608t;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p047Z0.AbstractC0469c;
import p047Z0.AbstractC0474h;
import p050a1.InterfaceC0482a;
import p054c.InterfaceC0672b;
import p068h.AbstractActivityC0841l;

/* renamed from: androidx.activity.g */
/* loaded from: classes.dex */
public final /* synthetic */ class C0525g implements InterfaceC0672b {

    /* renamed from: a */
    public final /* synthetic */ int f1272a;

    /* renamed from: b */
    public final /* synthetic */ AbstractActivityC0841l f1273b;

    public /* synthetic */ C0525g(AbstractActivityC0841l abstractActivityC0841l, int i) {
        this.f1272a = i;
        this.f1273b = abstractActivityC0841l;
    }

    @Override // p054c.InterfaceC0672b
    /* renamed from: a */
    public final void mo1289a(AbstractActivityC0532n abstractActivityC0532n) {
        switch (this.f1272a) {
            case 0:
                AbstractC0469c.m1102e("it", abstractActivityC0532n);
                AbstractActivityC0841l abstractActivityC0841l = this.f1273b;
                Bundle bundleM2441c = abstractActivityC0841l.f1293i.f3919b.m2441c("android:support:activity-result");
                if (bundleM2441c != null) {
                    C0530l c0530l = abstractActivityC0841l.f1297m;
                    c0530l.getClass();
                    ArrayList<Integer> integerArrayList = bundleM2441c.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleM2441c.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = bundleM2441c.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        c0530l.f1284d.addAll(stringArrayList2);
                    }
                    Bundle bundle = bundleM2441c.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    Bundle bundle2 = c0530l.f1287g;
                    if (bundle != null) {
                        bundle2.putAll(bundle);
                    }
                    int size = stringArrayList.size();
                    for (int i = 0; i < size; i++) {
                        String str = stringArrayList.get(i);
                        LinkedHashMap linkedHashMap = c0530l.f1282b;
                        boolean zContainsKey = linkedHashMap.containsKey(str);
                        LinkedHashMap linkedHashMap2 = c0530l.f1281a;
                        if (zContainsKey) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (bundle2.containsKey(str)) {
                                continue;
                            } else {
                                if (linkedHashMap2 instanceof InterfaceC0482a) {
                                    ClassCastException classCastException = new ClassCastException((linkedHashMap2 == null ? "null" : linkedHashMap2.getClass().getName()) + " cannot be cast to kotlin.collections.MutableMap");
                                    AbstractC0469c.m1103f(classCastException, AbstractC0474h.class.getName());
                                    throw classCastException;
                                }
                                linkedHashMap2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i);
                        AbstractC0469c.m1101d("rcs[i]", num2);
                        int iIntValue = num2.intValue();
                        String str2 = stringArrayList.get(i);
                        AbstractC0469c.m1101d("keys[i]", str2);
                        String str3 = str2;
                        linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                        linkedHashMap.put(str3, Integer.valueOf(iIntValue));
                    }
                    return;
                }
                return;
            default:
                C0608t c0608t = (C0608t) this.f1273b.f3288x.f2g;
                c0608t.f1944i.m1491b(c0608t, c0608t, null);
                return;
        }
    }
}
