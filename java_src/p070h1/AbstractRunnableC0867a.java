package p070h1;

import java.util.Locale;

/* renamed from: h1.a */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC0867a implements Runnable {

    /* renamed from: a */
    public final String f3359a;

    public AbstractRunnableC0867a(String str, Object... objArr) {
        byte[] bArr = AbstractC0869c.f3362a;
        this.f3359a = String.format(Locale.US, str, objArr);
    }

    /* renamed from: a */
    public abstract void mo2177a();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f3359a);
        try {
            mo2177a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
