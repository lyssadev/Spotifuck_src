package p072i1;

import java.io.EOFException;
import java.io.IOException;
import p098r1.AbstractC1269i;
import p098r1.C1261a;
import p098r1.C1265e;

/* renamed from: i1.c */
/* loaded from: classes.dex */
public final class C0873c extends AbstractC1269i {

    /* renamed from: b */
    public boolean f3376b;

    /* renamed from: c */
    public final /* synthetic */ int f3377c;

    /* renamed from: d */
    public final /* synthetic */ Object f3378d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0873c(Object obj, C1261a c1261a, int i) {
        super(c1261a);
        this.f3377c = i;
        this.f3378d = obj;
    }

    @Override // p098r1.AbstractC1269i, p098r1.InterfaceC1281u
    /* renamed from: b */
    public final void mo2201b(C1265e c1265e, long j2) throws EOFException {
        if (this.f3376b) {
            c1265e.m3006s(j2);
            return;
        }
        try {
            super.mo2201b(c1265e, j2);
        } catch (IOException unused) {
            this.f3376b = true;
            m2202f();
        }
    }

    @Override // p098r1.AbstractC1269i, p098r1.InterfaceC1281u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3376b) {
            return;
        }
        try {
            super.close();
        } catch (IOException unused) {
            this.f3376b = true;
            m2202f();
        }
    }

    /* renamed from: f */
    public final void m2202f() {
        switch (this.f3377c) {
            case 0:
                ((C0877g) this.f3378d).f3408m = true;
                return;
            default:
                synchronized (((C0874d) this.f3378d).f3382d) {
                    ((C0874d) this.f3378d).m2205c();
                }
                return;
        }
    }

    @Override // p098r1.AbstractC1269i, p098r1.InterfaceC1281u, java.io.Flushable
    public final void flush() {
        if (this.f3376b) {
            return;
        }
        try {
            super.flush();
        } catch (IOException unused) {
            this.f3376b = true;
            m2202f();
        }
    }
}
