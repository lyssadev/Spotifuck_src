package p111y;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: y.g */
/* loaded from: classes.dex */
public final class C1348g {

    /* renamed from: a */
    public final float f5536a;

    /* renamed from: b */
    public final float f5537b;

    /* renamed from: c */
    public final float f5538c;

    /* renamed from: d */
    public final float f5539d;

    /* renamed from: e */
    public final int f5540e;

    public C1348g(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.f5536a = Float.NaN;
        this.f5537b = Float.NaN;
        this.f5538c = Float.NaN;
        this.f5539d = Float.NaN;
        this.f5540e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1359r.f5671j);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f5540e);
                this.f5540e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C1355n().m3280b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f5539d = typedArrayObtainStyledAttributes.getDimension(index, this.f5539d);
            } else if (index == 2) {
                this.f5537b = typedArrayObtainStyledAttributes.getDimension(index, this.f5537b);
            } else if (index == 3) {
                this.f5538c = typedArrayObtainStyledAttributes.getDimension(index, this.f5538c);
            } else if (index == 4) {
                this.f5536a = typedArrayObtainStyledAttributes.getDimension(index, this.f5536a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
