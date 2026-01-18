package p086n1;

import java.io.File;
import java.io.IOException;

/* renamed from: n1.a */
/* loaded from: classes.dex */
public final class C1084a {

    /* renamed from: a */
    public static final C1084a f4433a = new C1084a();

    /* renamed from: a */
    public final void m2679a(File file) throws IOException {
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + file);
    }

    /* renamed from: b */
    public final void m2680b(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                m2680b(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete " + file2);
            }
        }
    }

    /* renamed from: c */
    public final void m2681c(File file, File file2) throws IOException {
        m2679a(file2);
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException("failed to rename " + file + " to " + file2);
    }
}
