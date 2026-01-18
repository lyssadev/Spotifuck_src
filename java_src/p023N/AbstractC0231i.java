package p023N;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;

/* renamed from: N.i */
/* loaded from: classes.dex */
public abstract class AbstractC0231i {
    /* renamed from: a */
    public static DisplayCutout m727a(Rect rect, List<Rect> list) {
        return new DisplayCutout(rect, list);
    }

    /* renamed from: b */
    public static List<Rect> m728b(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    /* renamed from: c */
    public static int m729c(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    /* renamed from: d */
    public static int m730d(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    /* renamed from: e */
    public static int m731e(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    /* renamed from: f */
    public static int m732f(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }
}
