package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import p065g.AbstractC0752a;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: f */
    public final int f1338f;

    /* renamed from: g */
    public final int f1339g;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0752a.f2756t);
        this.f1339g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f1338f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
