package p017K;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: K.f */
/* loaded from: classes.dex */
public final class CallableC0133f implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f351a;

    /* renamed from: b */
    public final /* synthetic */ String f352b;

    /* renamed from: c */
    public final /* synthetic */ Context f353c;

    /* renamed from: d */
    public final /* synthetic */ C0132e f354d;

    /* renamed from: e */
    public final /* synthetic */ int f355e;

    public /* synthetic */ CallableC0133f(String str, Context context, C0132e c0132e, int i, int i2) {
        this.f351a = i2;
        this.f352b = str;
        this.f353c = context;
        this.f354d = c0132e;
        this.f355e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f351a) {
            case 0:
                return AbstractC0136i.m486a(this.f352b, this.f353c, this.f354d, this.f355e);
            default:
                try {
                    return AbstractC0136i.m486a(this.f352b, this.f353c, this.f354d, this.f355e);
                } catch (Throwable unused) {
                    return new C0135h(-3);
                }
        }
    }
}
