package p028P0;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p082m.C0979c;

/* renamed from: P0.a */
/* loaded from: classes.dex */
public abstract class AbstractC0322a {

    /* renamed from: a */
    public static final int[] f829a = {R.attr.theme, it.deviato.spotifuck.R.attr.theme};

    /* renamed from: b */
    public static final int[] f830b = {it.deviato.spotifuck.R.attr.materialThemeOverlay};

    /* renamed from: a */
    public static Context m923a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f830b, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z2 = (context instanceof C0979c) && ((C0979c) context).f3971a == resourceId;
        if (resourceId == 0 || z2) {
            return context;
        }
        C0979c c0979c = new C0979c(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f829a);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c0979c.getTheme().applyStyle(resourceId2, true);
        }
        return c0979c;
    }
}
