package p030Q0;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import p070h1.AbstractC0869c;

/* renamed from: Q0.c */
/* loaded from: classes.dex */
public final class C0334c extends ThreadLocal {

    /* renamed from: a */
    public final /* synthetic */ int f867a;

    public /* synthetic */ C0334c(int i) {
        this.f867a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f867a) {
            case 0:
                return new StringBuilder("Picasso-");
            case 1:
                return new Random();
            default:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(AbstractC0869c.f3366e);
                return simpleDateFormat;
        }
    }
}
