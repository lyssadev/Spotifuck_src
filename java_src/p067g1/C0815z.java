package p067g1;

import java.util.ArrayList;
import p072i1.C0872b;
import p078k1.C0961a;
import p078k1.C0965e;
import p078k1.C0966f;

/* renamed from: g1.z */
/* loaded from: classes.dex */
public final class C0815z implements Cloneable {

    /* renamed from: a */
    public final C0813x f3081a;

    /* renamed from: b */
    public final C0966f f3082b;

    /* renamed from: c */
    public C0791b f3083c;

    /* renamed from: d */
    public final C0783A f3084d;

    /* renamed from: e */
    public boolean f3085e;

    public C0815z(C0813x c0813x, C0783A c0783a) {
        this.f3081a = c0813x;
        this.f3084d = c0783a;
        this.f3082b = new C0966f(c0813x);
    }

    /* renamed from: a */
    public final C0785C m2055a() {
        ArrayList arrayList = new ArrayList();
        C0813x c0813x = this.f3081a;
        arrayList.addAll(c0813x.f3053b);
        arrayList.add(this.f3082b);
        arrayList.add(new C0872b(2, c0813x.f3057f));
        C0797h c0797h = c0813x.f3058g;
        arrayList.add(new C0872b(0, c0797h != null ? c0797h.f2939a : null));
        arrayList.add(new C0872b(1, c0813x));
        arrayList.addAll(c0813x.f3054c);
        arrayList.add(new C0961a());
        C0791b c0791b = this.f3083c;
        C0783A c0783a = this.f3084d;
        return new C0965e(arrayList, null, null, null, 0, c0783a, this, c0791b, c0813x.f3071t, c0813x.f3072u, c0813x.f3073v).m2461a(c0783a);
    }

    public final Object clone() {
        C0783A c0783a = this.f3084d;
        C0813x c0813x = this.f3081a;
        C0815z c0815z = new C0815z(c0813x, c0783a);
        c0813x.f3055d.getClass();
        c0815z.f3083c = C0791b.f2914d;
        return c0815z;
    }
}
