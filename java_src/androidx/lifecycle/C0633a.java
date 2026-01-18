package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a */
/* loaded from: classes.dex */
public final class C0633a {

    /* renamed from: a */
    public final HashMap f1992a = new HashMap();

    /* renamed from: b */
    public final HashMap f1993b;

    public C0633a(HashMap map) {
        this.f1993b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0644l enumC0644l = (EnumC0644l) entry.getValue();
            List arrayList = (List) this.f1992a.get(enumC0644l);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f1992a.put(enumC0644l, arrayList);
            }
            arrayList.add((C0634b) entry.getKey());
        }
    }

    /* renamed from: a */
    public static void m1609a(List list, InterfaceC0650r interfaceC0650r, EnumC0644l enumC0644l, InterfaceC0649q interfaceC0649q) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0634b c0634b = (C0634b) list.get(size);
                c0634b.getClass();
                try {
                    int i = c0634b.f1994a;
                    Method method = c0634b.f1995b;
                    if (i == 0) {
                        method.invoke(interfaceC0649q, null);
                    } else if (i == 1) {
                        method.invoke(interfaceC0649q, interfaceC0650r);
                    } else if (i == 2) {
                        method.invoke(interfaceC0649q, interfaceC0650r, enumC0644l);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
