package androidx.emoji2.text;

import android.os.Build;
import android.support.v4.media.session.C0513t;
import java.util.ArrayList;
import p000A.C0010k;
import p017K.RunnableC0128a;
import p036T0.AbstractC0411g;

/* renamed from: androidx.emoji2.text.e */
/* loaded from: classes.dex */
public final class C0550e extends AbstractC0411g {

    /* renamed from: l */
    public final /* synthetic */ C0551f f1642l;

    public C0550e(C0551f c0551f) {
        this.f1642l = c0551f;
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: A */
    public final void mo1048A(Throwable th) {
        this.f1642l.f1643a.m1439d(th);
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: B */
    public final void mo1049B(C0010k c0010k) {
        C0551f c0551f = this.f1642l;
        c0551f.f1645c = c0010k;
        C0010k c0010k2 = c0551f.f1645c;
        C0555j c0555j = c0551f.f1643a;
        c0551f.f1644b = new C0513t(c0010k2, c0555j.f1657g, c0555j.f1659i, Build.VERSION.SDK_INT >= 34 ? AbstractC0558m.m1442a() : AbstractC0411g.m1040o());
        C0555j c0555j2 = c0551f.f1643a;
        c0555j2.getClass();
        ArrayList arrayList = new ArrayList();
        c0555j2.f1651a.writeLock().lock();
        try {
            c0555j2.f1653c = 1;
            arrayList.addAll(c0555j2.f1652b);
            c0555j2.f1652b.clear();
            c0555j2.f1651a.writeLock().unlock();
            c0555j2.f1654d.post(new RunnableC0128a(arrayList, c0555j2.f1653c, (Throwable) null));
        } catch (Throwable th) {
            c0555j2.f1651a.writeLock().unlock();
            throw th;
        }
    }
}
