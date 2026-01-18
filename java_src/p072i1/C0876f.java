package p072i1;

import java.io.Closeable;
import java.io.IOException;
import p070h1.AbstractC0869c;
import p098r1.InterfaceC1282v;

/* renamed from: i1.f */
/* loaded from: classes.dex */
public final class C0876f implements Closeable {

    /* renamed from: a */
    public final String f3391a;

    /* renamed from: b */
    public final long f3392b;

    /* renamed from: c */
    public final InterfaceC1282v[] f3393c;

    /* renamed from: d */
    public final /* synthetic */ C0877g f3394d;

    public C0876f(C0877g c0877g, String str, long j2, InterfaceC1282v[] interfaceC1282vArr) {
        this.f3394d = c0877g;
        this.f3391a = str;
        this.f3392b = j2;
        this.f3393c = interfaceC1282vArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        for (InterfaceC1282v interfaceC1282v : this.f3393c) {
            AbstractC0869c.m2180c(interfaceC1282v);
        }
    }
}
