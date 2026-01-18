package p056c1;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import p047Z0.AbstractC0469c;
import p053b1.AbstractC0667a;

/* renamed from: c1.a */
/* loaded from: classes.dex */
public final class C0674a extends AbstractC0667a {
    @Override // p053b1.AbstractC0667a
    /* renamed from: b */
    public final Random mo1842b() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        AbstractC0469c.m1101d("current()", threadLocalRandomCurrent);
        return threadLocalRandomCurrent;
    }
}
