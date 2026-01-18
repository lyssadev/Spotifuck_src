package p016J0;

import android.graphics.Paint;
import android.graphics.Path;
import p009F.AbstractC0082a;

/* renamed from: J0.a */
/* loaded from: classes.dex */
public final class C0127a {

    /* renamed from: i */
    public static final int[] f328i = new int[3];

    /* renamed from: j */
    public static final float[] f329j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    public static final int[] f330k = new int[4];

    /* renamed from: l */
    public static final float[] f331l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    public final Paint f332a;

    /* renamed from: b */
    public final Paint f333b;

    /* renamed from: c */
    public final Paint f334c;

    /* renamed from: d */
    public final int f335d;

    /* renamed from: e */
    public final int f336e;

    /* renamed from: f */
    public final int f337f;

    /* renamed from: g */
    public final Path f338g = new Path();

    /* renamed from: h */
    public final Paint f339h;

    public C0127a() {
        Paint paint = new Paint();
        this.f339h = paint;
        Paint paint2 = new Paint();
        this.f332a = paint2;
        this.f335d = AbstractC0082a.m326d(-16777216, 68);
        this.f336e = AbstractC0082a.m326d(-16777216, 20);
        this.f337f = AbstractC0082a.m326d(-16777216, 0);
        paint2.setColor(this.f335d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f333b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f334c = new Paint(paint3);
    }
}
