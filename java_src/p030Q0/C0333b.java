package p030Q0;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import p024N0.C0288p;
import p098r1.AbstractC1275o;

/* renamed from: Q0.b */
/* loaded from: classes.dex */
public final class C0333b extends AbstractC0325B {

    /* renamed from: a */
    public final Context f864a;

    /* renamed from: b */
    public final Object f865b = new Object();

    /* renamed from: c */
    public AssetManager f866c;

    public C0333b(Context context) {
        this.f864a = context;
    }

    @Override // p030Q0.AbstractC0325B
    /* renamed from: a */
    public final boolean mo925a(C0357z c0357z) {
        Uri uri = c0357z.f938a;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // p030Q0.AbstractC0325B
    /* renamed from: c */
    public final C0288p mo927c(C0357z c0357z, int i) {
        if (this.f866c == null) {
            synchronized (this.f865b) {
                try {
                    if (this.f866c == null) {
                        this.f866c = this.f864a.getAssets();
                    }
                } finally {
                }
            }
        }
        return new C0288p(AbstractC1275o.m3040b(this.f866c.open(c0357z.f938a.toString().substring(22))), 2);
    }
}
