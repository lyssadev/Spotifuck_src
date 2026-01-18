package p083m1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import p111y.AbstractC1359r;
import p111y.C1355n;

/* renamed from: m1.A */
/* loaded from: classes.dex */
public final class C0990A {

    /* renamed from: a */
    public final int f4034a;

    /* renamed from: b */
    public final int f4035b;

    /* renamed from: c */
    public final Object f4036c;

    public C0990A(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.f4036c = new ArrayList();
        this.f4035b = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1359r.f5669h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f4034a = typedArrayObtainStyledAttributes.getResourceId(index, this.f4034a);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f4035b);
                this.f4035b = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C1355n().m3280b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public C0990A() {
        this.f4036c = new C0990A[256];
        this.f4034a = 0;
        this.f4035b = 0;
    }

    public C0990A(int i, int i2) {
        this.f4036c = null;
        this.f4034a = i;
        int i3 = i2 & 7;
        this.f4035b = i3 == 0 ? 8 : i3;
    }
}
