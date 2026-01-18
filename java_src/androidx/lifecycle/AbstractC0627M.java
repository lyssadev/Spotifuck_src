package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* renamed from: androidx.lifecycle.M */
/* loaded from: classes.dex */
public abstract class AbstractC0627M {

    /* renamed from: a */
    public final HashMap f1983a = new HashMap();

    /* renamed from: b */
    public final LinkedHashSet f1984b = new LinkedHashSet();

    /* renamed from: a */
    public static void m1607a(Object obj) throws IOException {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: b */
    public void mo1516b() {
    }
}
