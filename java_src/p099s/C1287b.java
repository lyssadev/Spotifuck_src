package p099s;

import java.util.concurrent.CancellationException;

/* renamed from: s.b */
/* loaded from: classes.dex */
public final class C1287b {

    /* renamed from: b */
    public static final C1287b f5086b;

    /* renamed from: c */
    public static final C1287b f5087c;

    /* renamed from: a */
    public final CancellationException f5088a;

    static {
        if (AbstractFutureC1293h.f5099d) {
            f5087c = null;
            f5086b = null;
        } else {
            f5087c = new C1287b(false, null);
            f5086b = new C1287b(true, null);
        }
    }

    public C1287b(boolean z2, CancellationException cancellationException) {
        this.f5088a = cancellationException;
    }
}
