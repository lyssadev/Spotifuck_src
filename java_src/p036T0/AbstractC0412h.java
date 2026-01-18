package p036T0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p034S0.C0381a;
import p047Z0.AbstractC0469c;

/* renamed from: T0.h */
/* loaded from: classes.dex */
public abstract class AbstractC0412h extends AbstractC0411g {
    /* renamed from: V */
    public static int m1062V(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: W */
    public static Map m1063W(ArrayList arrayList) {
        C0409e c0409e = C0409e.f1019a;
        int size = arrayList.size();
        if (size == 0) {
            return c0409e;
        }
        if (size == 1) {
            C0381a c0381a = (C0381a) arrayList.get(0);
            AbstractC0469c.m1102e("pair", c0381a);
            Map mapSingletonMap = Collections.singletonMap(c0381a.f969a, c0381a.f970b);
            AbstractC0469c.m1101d("singletonMap(pair.first, pair.second)", mapSingletonMap);
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m1062V(arrayList.size()));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0381a c0381a2 = (C0381a) it2.next();
            linkedHashMap.put(c0381a2.f969a, c0381a2.f970b);
        }
        return linkedHashMap;
    }
}
