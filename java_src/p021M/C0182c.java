package p021M;

import p047Z0.AbstractC0469c;
import p101t.C1297b;

/* renamed from: M.c */
/* loaded from: classes.dex */
public class C0182c {

    /* renamed from: a */
    public final Object[] f530a;

    /* renamed from: b */
    public int f531b;

    public C0182c(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f530a = new Object[i];
    }

    /* renamed from: a */
    public Object mo582a() {
        int i = this.f531b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f530a;
        Object obj = objArr[i2];
        AbstractC0469c.m1100c("null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool", obj);
        objArr[i2] = null;
        this.f531b--;
        return obj;
    }

    /* renamed from: b */
    public void m583b(C1297b c1297b) {
        int i = this.f531b;
        Object[] objArr = this.f530a;
        if (i < objArr.length) {
            objArr[i] = c1297b;
            this.f531b = i + 1;
        }
    }

    /* renamed from: c */
    public boolean mo584c(Object obj) {
        Object[] objArr;
        boolean z2;
        AbstractC0469c.m1102e("instance", obj);
        int i = this.f531b;
        int i2 = 0;
        while (true) {
            objArr = this.f530a;
            if (i2 >= i) {
                z2 = false;
                break;
            }
            if (objArr[i2] == obj) {
                z2 = true;
                break;
            }
            i2++;
        }
        if (z2) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i3 = this.f531b;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.f531b = i3 + 1;
        return true;
    }

    public C0182c() {
        this.f530a = new Object[256];
    }
}
