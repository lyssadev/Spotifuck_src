package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements InterfaceC0648p {

    /* renamed from: a */
    public final InterfaceC0649q f1988a;

    /* renamed from: b */
    public final C0633a f1989b;

    public ReflectiveGenericLifecycleObserver(InterfaceC0649q interfaceC0649q) {
        this.f1988a = interfaceC0649q;
        C0635c c0635c = C0635c.f1996c;
        Class<?> cls = interfaceC0649q.getClass();
        C0633a c0633a = (C0633a) c0635c.f1997a.get(cls);
        this.f1989b = c0633a == null ? c0635c.m1611a(cls, null) : c0633a;
    }

    @Override // androidx.lifecycle.InterfaceC0648p
    /* renamed from: b */
    public final void mo1283b(InterfaceC0650r interfaceC0650r, EnumC0644l enumC0644l) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        HashMap map = this.f1989b.f1992a;
        List list = (List) map.get(enumC0644l);
        InterfaceC0649q interfaceC0649q = this.f1988a;
        C0633a.m1609a(list, interfaceC0650r, enumC0644l, interfaceC0649q);
        C0633a.m1609a((List) map.get(EnumC0644l.ON_ANY), interfaceC0650r, enumC0644l, interfaceC0649q);
    }
}
