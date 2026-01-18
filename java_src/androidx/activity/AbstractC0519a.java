package androidx.activity;

import android.window.BackEvent;
import p047Z0.AbstractC0469c;

/* renamed from: androidx.activity.a */
/* loaded from: classes.dex */
public abstract class AbstractC0519a {
    /* renamed from: a */
    public static float m1284a(BackEvent backEvent) {
        AbstractC0469c.m1102e("backEvent", backEvent);
        return backEvent.getProgress();
    }

    /* renamed from: b */
    public static int m1285b(BackEvent backEvent) {
        AbstractC0469c.m1102e("backEvent", backEvent);
        return backEvent.getSwipeEdge();
    }

    /* renamed from: c */
    public static float m1286c(BackEvent backEvent) {
        AbstractC0469c.m1102e("backEvent", backEvent);
        return backEvent.getTouchX();
    }

    /* renamed from: d */
    public static float m1287d(BackEvent backEvent) {
        AbstractC0469c.m1102e("backEvent", backEvent);
        return backEvent.getTouchY();
    }
}
