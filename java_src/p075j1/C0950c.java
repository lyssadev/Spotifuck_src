package p075j1;

import java.io.IOException;
import java.lang.reflect.Method;

/* renamed from: j1.c */
/* loaded from: classes.dex */
public final class C0950c extends RuntimeException {

    /* renamed from: b */
    public static final Method f3887b;

    /* renamed from: a */
    public IOException f3888a;

    static {
        Method declaredMethod;
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
            declaredMethod = null;
        }
        f3887b = declaredMethod;
    }

    public C0950c(IOException iOException) {
        super(iOException);
        this.f3888a = iOException;
    }
}
