package p053b1;

import java.util.Random;
import p030Q0.C0334c;
import p047Z0.AbstractC0469c;

/* renamed from: b1.b */
/* loaded from: classes.dex */
public final class C0668b extends AbstractC0667a {

    /* renamed from: c */
    public final C0334c f2261c = new C0334c(1);

    @Override // p053b1.AbstractC0667a
    /* renamed from: b */
    public final Random mo1842b() {
        Object obj = this.f2261c.get();
        AbstractC0469c.m1101d("implStorage.get()", obj);
        return (Random) obj;
    }
}
