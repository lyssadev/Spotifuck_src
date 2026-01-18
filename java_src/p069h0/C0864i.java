package p069h0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* renamed from: h0.i */
/* loaded from: classes.dex */
public final class C0864i {

    /* renamed from: a */
    public final int f3349a;

    /* renamed from: b */
    public final int f3350b;

    /* renamed from: c */
    public final long f3351c;

    /* renamed from: d */
    public final long f3352d;

    public C0864i(int i, int i2, long j2, long j3) {
        this.f3349a = i;
        this.f3350b = i2;
        this.f3351c = j2;
        this.f3352d = j3;
    }

    /* renamed from: a */
    public static C0864i m2172a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C0864i c0864i = new C0864i(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c0864i;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: b */
    public final void m2173b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f3349a);
            dataOutputStream.writeInt(this.f3350b);
            dataOutputStream.writeLong(this.f3351c);
            dataOutputStream.writeLong(this.f3352d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0864i)) {
            return false;
        }
        C0864i c0864i = (C0864i) obj;
        return this.f3350b == c0864i.f3350b && this.f3351c == c0864i.f3351c && this.f3349a == c0864i.f3349a && this.f3352d == c0864i.f3352d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3350b), Long.valueOf(this.f3351c), Integer.valueOf(this.f3349a), Long.valueOf(this.f3352d));
    }
}
