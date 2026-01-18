package p058d0;

import android.os.Build;
import android.os.IBinder;
import android.support.v4.media.C0491i;
import android.text.TextUtils;
import java.util.HashMap;
import p000A.C0001b;
import p013H0.AbstractC0111f;
import p024N0.RunnableC0268B;

/* renamed from: d0.c */
/* loaded from: classes.dex */
public final class C0715c implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final String f2669a;

    /* renamed from: b */
    public final int f2670b;

    /* renamed from: c */
    public final int f2671c;

    /* renamed from: d */
    public final C0001b f2672d;

    /* renamed from: e */
    public final HashMap f2673e = new HashMap();

    /* renamed from: f */
    public C0491i f2674f;

    /* renamed from: g */
    public final /* synthetic */ AbstractServiceC0729q f2675g;

    public C0715c(AbstractServiceC0729q abstractServiceC0729q, String str, int i, int i2, C0001b c0001b) {
        this.f2675g = abstractServiceC0729q;
        this.f2669a = str;
        this.f2670b = i;
        this.f2671c = i2;
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC0111f.m434v(str, i, i2);
        }
        this.f2672d = c0001b;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.f2675g.f2719k.post(new RunnableC0268B(7, this));
    }
}
