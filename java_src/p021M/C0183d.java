package p021M;

/* renamed from: M.d */
/* loaded from: classes.dex */
public final class C0183d extends C0182c {

    /* renamed from: c */
    public final Object f532c;

    public C0183d() {
        super(12);
        this.f532c = new Object();
    }

    @Override // p021M.C0182c
    /* renamed from: a */
    public final Object mo582a() {
        Object objMo582a;
        synchronized (this.f532c) {
            objMo582a = super.mo582a();
        }
        return objMo582a;
    }

    @Override // p021M.C0182c
    /* renamed from: c */
    public final boolean mo584c(Object obj) {
        boolean zMo584c;
        synchronized (this.f532c) {
            zMo584c = super.mo584c(obj);
        }
        return zMo584c;
    }
}
