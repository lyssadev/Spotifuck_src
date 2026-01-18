package p015J;

/* renamed from: J.c */
/* loaded from: classes.dex */
public final class C0118c {

    /* renamed from: a */
    public boolean f317a;

    /* renamed from: b */
    public InterfaceC0117b f318b;

    /* renamed from: c */
    public boolean f319c;

    /* renamed from: a */
    public final void m448a(InterfaceC0117b interfaceC0117b) {
        synchronized (this) {
            while (this.f319c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f318b == interfaceC0117b) {
                return;
            }
            this.f318b = interfaceC0117b;
            if (this.f317a) {
                interfaceC0117b.mo48m();
            }
        }
    }
}
