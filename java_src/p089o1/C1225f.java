package p089o1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p070h1.AbstractC0869c;

/* renamed from: o1.f */
/* loaded from: classes.dex */
public final class C1225f implements InvocationHandler {

    /* renamed from: a */
    public final ArrayList f4877a;

    /* renamed from: b */
    public boolean f4878b;

    /* renamed from: c */
    public String f4879c;

    public C1225f(ArrayList arrayList) {
        this.f4877a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = AbstractC0869c.f3363b;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return Boolean.TRUE;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.f4878b = true;
            return null;
        }
        boolean zEquals = name.equals("protocols");
        ArrayList arrayList = this.f4877a;
        if (zEquals && objArr.length == 0) {
            return arrayList;
        }
        if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.contains(list.get(i))) {
                        String str = (String) list.get(i);
                        this.f4879c = str;
                        return str;
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f4879c = str2;
                return str2;
            }
        }
        if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
            return method.invoke(this, objArr);
        }
        this.f4879c = (String) objArr[0];
        return null;
    }
}
