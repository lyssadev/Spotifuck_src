package p067g1;

import java.io.IOException;
import p070h1.AbstractC0869c;
import p072i1.C0874d;
import p098r1.InterfaceC1281u;

/* renamed from: g1.d */
/* loaded from: classes.dex */
public final class C0793d {

    /* renamed from: a */
    public final C0874d f2918a;

    /* renamed from: b */
    public final InterfaceC1281u f2919b;

    /* renamed from: c */
    public final C0792c f2920c;

    /* renamed from: d */
    public boolean f2921d;

    /* renamed from: e */
    public final /* synthetic */ C0797h f2922e;

    public C0793d(C0797h c0797h, C0874d c0874d) {
        this.f2922e = c0797h;
        this.f2918a = c0874d;
        InterfaceC1281u interfaceC1281uM2206d = c0874d.m2206d(1);
        this.f2919b = interfaceC1281uM2206d;
        this.f2920c = new C0792c(this, interfaceC1281uM2206d, c0874d);
    }

    /* renamed from: a */
    public final void m2014a() throws IOException {
        synchronized (this.f2922e) {
            try {
                if (this.f2921d) {
                    return;
                }
                this.f2921d = true;
                this.f2922e.getClass();
                AbstractC0869c.m2180c(this.f2919b);
                try {
                    this.f2918a.m2203a();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
