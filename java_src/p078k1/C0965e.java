package p078k1;

import java.util.ArrayList;
import p067g1.C0783A;
import p067g1.C0785C;
import p067g1.C0791b;
import p067g1.C0815z;
import p067g1.InterfaceC0811v;
import p075j1.C0949b;
import p075j1.C0953f;

/* renamed from: k1.e */
/* loaded from: classes.dex */
public final class C0965e {

    /* renamed from: a */
    public final ArrayList f3925a;

    /* renamed from: b */
    public final C0953f f3926b;

    /* renamed from: c */
    public final InterfaceC0962b f3927c;

    /* renamed from: d */
    public final C0949b f3928d;

    /* renamed from: e */
    public final int f3929e;

    /* renamed from: f */
    public final C0783A f3930f;

    /* renamed from: g */
    public final C0815z f3931g;

    /* renamed from: h */
    public final C0791b f3932h;

    /* renamed from: i */
    public final int f3933i;

    /* renamed from: j */
    public final int f3934j;

    /* renamed from: k */
    public final int f3935k;

    /* renamed from: l */
    public int f3936l;

    public C0965e(ArrayList arrayList, C0953f c0953f, InterfaceC0962b interfaceC0962b, C0949b c0949b, int i, C0783A c0783a, C0815z c0815z, C0791b c0791b, int i2, int i3, int i4) {
        this.f3925a = arrayList;
        this.f3928d = c0949b;
        this.f3926b = c0953f;
        this.f3927c = interfaceC0962b;
        this.f3929e = i;
        this.f3930f = c0783a;
        this.f3931g = c0815z;
        this.f3932h = c0791b;
        this.f3933i = i2;
        this.f3934j = i3;
        this.f3935k = i4;
    }

    /* renamed from: a */
    public final C0785C m2461a(C0783A c0783a) {
        return m2462b(c0783a, this.f3926b, this.f3927c, this.f3928d);
    }

    /* renamed from: b */
    public final C0785C m2462b(C0783A c0783a, C0953f c0953f, InterfaceC0962b interfaceC0962b, C0949b c0949b) {
        ArrayList arrayList = this.f3925a;
        int size = arrayList.size();
        int i = this.f3929e;
        if (i >= size) {
            throw new AssertionError();
        }
        this.f3936l++;
        InterfaceC0962b interfaceC0962b2 = this.f3927c;
        if (interfaceC0962b2 != null) {
            if (!this.f3928d.m2425j(c0783a.f2858a)) {
                throw new IllegalStateException("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port");
            }
        }
        if (interfaceC0962b2 != null && this.f3936l > 1) {
            throw new IllegalStateException("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once");
        }
        int i2 = i + 1;
        C0965e c0965e = new C0965e(arrayList, c0953f, interfaceC0962b, c0949b, i2, c0783a, this.f3931g, this.f3932h, this.f3933i, this.f3934j, this.f3935k);
        InterfaceC0811v interfaceC0811v = (InterfaceC0811v) arrayList.get(i);
        C0785C c0785cMo2053a = interfaceC0811v.mo2053a(c0965e);
        if (interfaceC0962b != null && i2 < arrayList.size() && c0965e.f3936l != 1) {
            throw new IllegalStateException("network interceptor " + interfaceC0811v + " must call proceed() exactly once");
        }
        if (c0785cMo2053a == null) {
            throw new NullPointerException("interceptor " + interfaceC0811v + " returned null");
        }
        if (c0785cMo2053a.f2881g != null) {
            return c0785cMo2053a;
        }
        throw new IllegalStateException("interceptor " + interfaceC0811v + " returned a response with no body");
    }
}
