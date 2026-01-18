package androidx.activity;

import android.window.BackEvent;
import p047Z0.AbstractC0469c;

/* renamed from: androidx.activity.b */
/* loaded from: classes.dex */
public final class C0520b {

    /* renamed from: a */
    public final float f1262a;

    /* renamed from: b */
    public final float f1263b;

    /* renamed from: c */
    public final float f1264c;

    /* renamed from: d */
    public final int f1265d;

    public C0520b(BackEvent backEvent) {
        AbstractC0469c.m1102e("backEvent", backEvent);
        float fM1286c = AbstractC0519a.m1286c(backEvent);
        float fM1287d = AbstractC0519a.m1287d(backEvent);
        float fM1284a = AbstractC0519a.m1284a(backEvent);
        int iM1285b = AbstractC0519a.m1285b(backEvent);
        this.f1262a = fM1286c;
        this.f1263b = fM1287d;
        this.f1264c = fM1284a;
        this.f1265d = iM1285b;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f1262a + ", touchY=" + this.f1263b + ", progress=" + this.f1264c + ", swipeEdge=" + this.f1265d + '}';
    }
}
