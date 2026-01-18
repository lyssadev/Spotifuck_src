package p083m1;

import java.io.IOException;
import java.util.ArrayList;
import p070h1.AbstractRunnableC0867a;

/* renamed from: m1.k */
/* loaded from: classes.dex */
public final class C1004k extends AbstractRunnableC0867a {

    /* renamed from: b */
    public final /* synthetic */ int f4089b = 2;

    /* renamed from: c */
    public final /* synthetic */ int f4090c;

    /* renamed from: d */
    public final /* synthetic */ C1012s f4091d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1004k(C1012s c1012s, Object[] objArr, int i, ArrayList arrayList) {
        super("OkHttp %s Push Request[%s]", objArr);
        this.f4091d = c1012s;
        this.f4090c = i;
    }

    /* renamed from: b */
    private final void m2498b() {
        this.f4091d.f4121j.getClass();
        try {
            this.f4091d.f4129r.m2540l(this.f4090c, 6);
            synchronized (this.f4091d) {
                this.f4091d.f4131t.remove(Integer.valueOf(this.f4090c));
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: c */
    private final void m2499c() {
        this.f4091d.f4121j.getClass();
        try {
            this.f4091d.f4129r.m2540l(this.f4090c, 6);
            synchronized (this.f4091d) {
                this.f4091d.f4131t.remove(Integer.valueOf(this.f4090c));
            }
        } catch (IOException unused) {
        }
    }

    @Override // p070h1.AbstractRunnableC0867a
    /* renamed from: a */
    public final void mo2177a() {
        switch (this.f4089b) {
            case 0:
                m2498b();
                return;
            case 1:
                m2499c();
                return;
            default:
                this.f4091d.f4121j.getClass();
                synchronized (this.f4091d) {
                    this.f4091d.f4131t.remove(Integer.valueOf(this.f4090c));
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1004k(C1012s c1012s, Object[] objArr, int i, ArrayList arrayList, boolean z2) {
        super("OkHttp %s Push Headers[%s]", objArr);
        this.f4091d = c1012s;
        this.f4090c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1004k(C1012s c1012s, Object[] objArr, int i, int i2) {
        super("OkHttp %s Push Reset[%s]", objArr);
        this.f4091d = c1012s;
        this.f4090c = i;
    }
}
