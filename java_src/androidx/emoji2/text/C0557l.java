package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;
import p000A.C0010k;
import p036T0.AbstractC0411g;

/* renamed from: androidx.emoji2.text.l */
/* loaded from: classes.dex */
public final class C0557l extends AbstractC0411g {

    /* renamed from: l */
    public final /* synthetic */ AbstractC0411g f1663l;

    /* renamed from: m */
    public final /* synthetic */ ThreadPoolExecutor f1664m;

    public C0557l(AbstractC0411g abstractC0411g, ThreadPoolExecutor threadPoolExecutor) {
        this.f1663l = abstractC0411g;
        this.f1664m = threadPoolExecutor;
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: A */
    public final void mo1048A(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f1664m;
        try {
            this.f1663l.mo1048A(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: B */
    public final void mo1049B(C0010k c0010k) {
        ThreadPoolExecutor threadPoolExecutor = this.f1664m;
        try {
            this.f1663l.mo1049B(c0010k);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
