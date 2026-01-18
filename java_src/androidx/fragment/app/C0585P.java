package androidx.fragment.app;

import java.io.Writer;

/* renamed from: androidx.fragment.app.P */
/* loaded from: classes.dex */
public final class C0585P extends Writer {

    /* renamed from: a */
    public final StringBuilder f1796a = new StringBuilder(128);

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m1538f();
    }

    /* renamed from: f */
    public final void m1538f() {
        StringBuilder sb = this.f1796a;
        if (sb.length() > 0) {
            sb.toString();
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m1538f();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = cArr[i + i3];
            if (c2 == '\n') {
                m1538f();
            } else {
                this.f1796a.append(c2);
            }
        }
    }
}
