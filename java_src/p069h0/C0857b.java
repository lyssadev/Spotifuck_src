package p069h0;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* renamed from: h0.b */
/* loaded from: classes.dex */
public final class C0857b {

    /* renamed from: a */
    public final Executor f3320a;

    /* renamed from: b */
    public final InterfaceC0860e f3321b;

    /* renamed from: c */
    public final byte[] f3322c;

    /* renamed from: d */
    public final File f3323d;

    /* renamed from: e */
    public final String f3324e;

    /* renamed from: f */
    public boolean f3325f = false;

    /* renamed from: g */
    public C0858c[] f3326g;

    /* renamed from: h */
    public byte[] f3327h;

    public C0857b(AssetManager assetManager, Executor executor, InterfaceC0860e interfaceC0860e, String str, File file) {
        this.f3320a = executor;
        this.f3321b = interfaceC0860e;
        this.f3324e = str;
        this.f3323d = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i >= 24) {
            if (i < 31) {
                switch (i) {
                    case 24:
                    case 25:
                        bArr = AbstractC0861f.f3344h;
                        break;
                    case 26:
                        bArr = AbstractC0861f.f3343g;
                        break;
                    case 27:
                        bArr = AbstractC0861f.f3342f;
                        break;
                    case 28:
                    case 29:
                    case 30:
                        bArr = AbstractC0861f.f3341e;
                        break;
                }
            } else {
                bArr = AbstractC0861f.f3340d;
            }
        }
        this.f3322c = bArr;
    }

    /* renamed from: a */
    public final FileInputStream m2147a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null) {
                message.contains("compressed");
            }
            return null;
        }
    }

    /* renamed from: b */
    public final void m2148b(final int i, final Serializable serializable) {
        this.f3320a.execute(new Runnable() { // from class: h0.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f3317a.f3321b.mo46k(i, serializable);
            }
        });
    }
}
