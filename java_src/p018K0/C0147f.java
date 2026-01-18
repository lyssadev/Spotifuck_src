package p018K0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p006D0.C0047a;

/* renamed from: K0.f */
/* loaded from: classes.dex */
public class C0147f extends Drawable.ConstantState {

    /* renamed from: a */
    public C0152k f392a;

    /* renamed from: b */
    public C0047a f393b;

    /* renamed from: c */
    public ColorStateList f394c;

    /* renamed from: d */
    public ColorStateList f395d;

    /* renamed from: e */
    public ColorStateList f396e;

    /* renamed from: f */
    public PorterDuff.Mode f397f;

    /* renamed from: g */
    public Rect f398g;

    /* renamed from: h */
    public final float f399h;

    /* renamed from: i */
    public float f400i;

    /* renamed from: j */
    public float f401j;

    /* renamed from: k */
    public int f402k;

    /* renamed from: l */
    public float f403l;

    /* renamed from: m */
    public float f404m;

    /* renamed from: n */
    public int f405n;

    /* renamed from: o */
    public int f406o;

    /* renamed from: p */
    public final Paint.Style f407p;

    public C0147f(C0152k c0152k) {
        this.f394c = null;
        this.f395d = null;
        this.f396e = null;
        this.f397f = PorterDuff.Mode.SRC_IN;
        this.f398g = null;
        this.f399h = 1.0f;
        this.f400i = 1.0f;
        this.f402k = 255;
        this.f403l = 0.0f;
        this.f404m = 0.0f;
        this.f405n = 0;
        this.f406o = 0;
        this.f407p = Paint.Style.FILL_AND_STROKE;
        this.f392a = c0152k;
        this.f393b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C0148g c0148g = new C0148g(this);
        c0148g.f414j = true;
        return c0148g;
    }

    public C0147f(C0147f c0147f) {
        this.f394c = null;
        this.f395d = null;
        this.f396e = null;
        this.f397f = PorterDuff.Mode.SRC_IN;
        this.f398g = null;
        this.f399h = 1.0f;
        this.f400i = 1.0f;
        this.f402k = 255;
        this.f403l = 0.0f;
        this.f404m = 0.0f;
        this.f405n = 0;
        this.f406o = 0;
        this.f407p = Paint.Style.FILL_AND_STROKE;
        this.f392a = c0147f.f392a;
        this.f393b = c0147f.f393b;
        this.f401j = c0147f.f401j;
        this.f394c = c0147f.f394c;
        this.f395d = c0147f.f395d;
        this.f397f = c0147f.f397f;
        this.f396e = c0147f.f396e;
        this.f402k = c0147f.f402k;
        this.f399h = c0147f.f399h;
        this.f406o = c0147f.f406o;
        this.f400i = c0147f.f400i;
        this.f403l = c0147f.f403l;
        this.f404m = c0147f.f404m;
        this.f405n = c0147f.f405n;
        this.f407p = c0147f.f407p;
        if (c0147f.f398g != null) {
            this.f398g = new Rect(c0147f.f398g);
        }
    }
}
