package androidx.activity;

import java.io.Serializable;
import p030Q0.AbstractC0328E;
import p034S0.C0383c;
import p045Y0.InterfaceC0438a;
import p047Z0.AbstractC0469c;
import p047Z0.AbstractC0472f;
import p047Z0.C0468b;
import p047Z0.C0471e;
import p047Z0.InterfaceC0467a;
import p059d1.InterfaceC0733a;

/* renamed from: androidx.activity.z */
/* loaded from: classes.dex */
public final /* synthetic */ class C0544z implements InterfaceC0438a, InterfaceC0733a, Serializable {

    /* renamed from: a */
    public transient InterfaceC0733a f1330a;

    /* renamed from: b */
    public final Object f1331b;

    /* renamed from: c */
    public final Class f1332c = C0517A.class;

    /* renamed from: d */
    public final String f1333d = "updateEnabledCallbacks";

    /* renamed from: e */
    public final String f1334e = "updateEnabledCallbacks()V";

    /* renamed from: f */
    public final boolean f1335f = false;

    /* renamed from: g */
    public final int f1336g = 0;

    /* renamed from: h */
    public final /* synthetic */ int f1337h;

    public C0544z(int i, Object obj) {
        this.f1337h = i;
        this.f1331b = obj;
    }

    @Override // p045Y0.InterfaceC0438a
    /* renamed from: a */
    public final Object mo1093a() {
        switch (this.f1337h) {
            case 0:
                ((C0517A) this.f1331b).m1282e();
                break;
            default:
                ((C0517A) this.f1331b).m1282e();
                break;
        }
        return C0383c.f975c;
    }

    /* renamed from: b */
    public final InterfaceC0733a m1311b() {
        AbstractC0472f.f1112a.getClass();
        return this;
    }

    /* renamed from: c */
    public final InterfaceC0467a m1312c() {
        Class cls = this.f1332c;
        if (this.f1335f) {
            AbstractC0472f.f1112a.getClass();
            return new C0471e(cls);
        }
        AbstractC0472f.f1112a.getClass();
        return new C0468b(cls);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0544z) {
            C0544z c0544z = (C0544z) obj;
            return this.f1333d.equals(c0544z.f1333d) && this.f1334e.equals(c0544z.f1334e) && this.f1336g == c0544z.f1336g && AbstractC0469c.m1098a(this.f1331b, c0544z.f1331b) && m1312c().equals(c0544z.m1312c());
        }
        if (!(obj instanceof C0544z)) {
            return false;
        }
        InterfaceC0733a interfaceC0733a = this.f1330a;
        if (interfaceC0733a == null) {
            m1311b();
            this.f1330a = this;
            interfaceC0733a = this;
        }
        return obj.equals(interfaceC0733a);
    }

    public final int hashCode() {
        m1312c();
        return this.f1334e.hashCode() + ((this.f1333d.hashCode() + (m1312c().hashCode() * 31)) * 31);
    }

    public final String toString() {
        InterfaceC0733a interfaceC0733a = this.f1330a;
        if (interfaceC0733a == null) {
            m1311b();
            this.f1330a = this;
            interfaceC0733a = this;
        }
        if (interfaceC0733a != this) {
            return interfaceC0733a.toString();
        }
        String str = this.f1333d;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : AbstractC0328E.m937g("function ", str, " (Kotlin reflection is not available)");
    }
}
