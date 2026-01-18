package p047Z0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p034S0.C0381a;
import p036T0.AbstractC0411g;
import p036T0.AbstractC0412h;
import p045Y0.InterfaceC0438a;
import p045Y0.InterfaceC0439b;
import p045Y0.InterfaceC0440c;
import p045Y0.InterfaceC0441d;
import p045Y0.InterfaceC0442e;
import p045Y0.InterfaceC0443f;
import p045Y0.InterfaceC0444g;
import p045Y0.InterfaceC0445h;
import p045Y0.InterfaceC0446i;
import p045Y0.InterfaceC0447j;
import p045Y0.InterfaceC0448k;
import p045Y0.InterfaceC0449l;
import p045Y0.InterfaceC0450m;
import p045Y0.InterfaceC0451n;
import p045Y0.InterfaceC0452o;
import p045Y0.InterfaceC0453p;
import p045Y0.InterfaceC0454q;
import p045Y0.InterfaceC0455r;
import p045Y0.InterfaceC0456s;
import p045Y0.InterfaceC0457t;
import p045Y0.InterfaceC0458u;
import p045Y0.InterfaceC0459v;
import p045Y0.InterfaceC0460w;
import p059d1.InterfaceC0734b;
import p064f1.AbstractC0751g;

/* renamed from: Z0.b */
/* loaded from: classes.dex */
public final class C0468b implements InterfaceC0734b, InterfaceC0467a {

    /* renamed from: b */
    public static final Map f1108b;

    /* renamed from: a */
    public final Class f1109a;

    static {
        int i = 0;
        List listAsList = Arrays.asList(InterfaceC0438a.class, InterfaceC0449l.class, InterfaceC0453p.class, InterfaceC0454q.class, InterfaceC0455r.class, InterfaceC0456s.class, InterfaceC0457t.class, InterfaceC0458u.class, InterfaceC0459v.class, InterfaceC0460w.class, InterfaceC0439b.class, InterfaceC0440c.class, InterfaceC0441d.class, InterfaceC0442e.class, InterfaceC0443f.class, InterfaceC0444g.class, InterfaceC0445h.class, InterfaceC0446i.class, InterfaceC0447j.class, InterfaceC0448k.class, InterfaceC0450m.class, InterfaceC0451n.class, InterfaceC0452o.class);
        AbstractC0469c.m1101d("asList(this)", listAsList);
        ArrayList arrayList = new ArrayList(listAsList.size());
        for (Object obj : listAsList) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new C0381a((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f1108b = AbstractC0412h.m1063W(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        AbstractC0469c.m1101d("primitiveFqNames.values", collectionValues);
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            AbstractC0469c.m1101d("kotlinName", str);
            sb.append(AbstractC0751g.m1974V(str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f1108b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0412h.m1062V(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), AbstractC0751g.m1974V((String) entry2.getValue()));
        }
    }

    public C0468b(Class cls) {
        AbstractC0469c.m1102e("jClass", cls);
        this.f1109a = cls;
    }

    @Override // p047Z0.InterfaceC0467a
    /* renamed from: a */
    public final Class mo1097a() {
        return this.f1109a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0468b) && AbstractC0411g.m1041q(this).equals(AbstractC0411g.m1041q((InterfaceC0734b) obj));
    }

    public final int hashCode() {
        return AbstractC0411g.m1041q(this).hashCode();
    }

    public final String toString() {
        return this.f1109a.toString() + " (Kotlin reflection is not available)";
    }
}
