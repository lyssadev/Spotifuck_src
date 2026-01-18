package p074j0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: j0.L */
/* loaded from: classes.dex */
public class C0897L extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public AbstractC0912a0 f3601a;

    /* renamed from: b */
    public final Rect f3602b;

    /* renamed from: c */
    public boolean f3603c;

    /* renamed from: d */
    public boolean f3604d;

    public C0897L(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3602b = new Rect();
        this.f3603c = true;
        this.f3604d = false;
    }

    public C0897L(int i, int i2) {
        super(i, i2);
        this.f3602b = new Rect();
        this.f3603c = true;
        this.f3604d = false;
    }

    public C0897L(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f3602b = new Rect();
        this.f3603c = true;
        this.f3604d = false;
    }

    public C0897L(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f3602b = new Rect();
        this.f3603c = true;
        this.f3604d = false;
    }

    public C0897L(C0897L c0897l) {
        super((ViewGroup.LayoutParams) c0897l);
        this.f3602b = new Rect();
        this.f3603c = true;
        this.f3604d = false;
    }
}
