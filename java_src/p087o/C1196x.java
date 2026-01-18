package p087o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.session.C0513t;
import android.util.AttributeSet;
import android.widget.ImageView;
import p023N.AbstractC0206Q;
import p035T.AbstractC0389f;
import p036T0.AbstractC0411g;
import p065g.AbstractC0752a;
import p067g1.C0804o;

/* renamed from: o.x */
/* loaded from: classes.dex */
public final class C1196x {

    /* renamed from: a */
    public final ImageView f4754a;

    /* renamed from: b */
    public C0804o f4755b;

    /* renamed from: c */
    public C0804o f4756c;

    /* renamed from: d */
    public int f4757d = 0;

    public C1196x(ImageView imageView) {
        this.f4754a = imageView;
    }

    /* renamed from: a */
    public final void m2824a() {
        ImageView imageView = this.f4754a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC1181p0.m2803a(drawable);
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            if (i <= 21 && i == 21) {
                if (this.f4756c == null) {
                    this.f4756c = new C0804o();
                }
                C0804o c0804o = this.f4756c;
                c0804o.f2987c = null;
                c0804o.f2986b = false;
                c0804o.f2988d = null;
                c0804o.f2985a = false;
                ColorStateList colorStateListM989a = AbstractC0389f.m989a(imageView);
                if (colorStateListM989a != null) {
                    c0804o.f2986b = true;
                    c0804o.f2987c = colorStateListM989a;
                }
                PorterDuff.Mode modeM990b = AbstractC0389f.m990b(imageView);
                if (modeM990b != null) {
                    c0804o.f2985a = true;
                    c0804o.f2988d = modeM990b;
                }
                if (c0804o.f2986b || c0804o.f2985a) {
                    C1186s.m2810e(drawable, c0804o, imageView.getDrawableState());
                    return;
                }
            }
            C0804o c0804o2 = this.f4755b;
            if (c0804o2 != null) {
                C1186s.m2810e(drawable, c0804o2, imageView.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public final void m2825b(AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable drawable2;
        int resourceId;
        ImageView imageView = this.f4754a;
        Context context = imageView.getContext();
        int[] iArr = AbstractC0752a.f2742f;
        C0513t c0513tM1223A = C0513t.m1223A(context, attributeSet, iArr, i);
        AbstractC0206Q.m680o(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) c0513tM1223A.f1246c, i);
        try {
            Drawable drawable3 = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) c0513tM1223A.f1246c;
            if (drawable3 == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable3 = AbstractC0411g.m1039n(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                AbstractC1181p0.m2803a(drawable3);
            }
            if (typedArray.hasValue(2)) {
                ColorStateList colorStateListM1239n = c0513tM1223A.m1239n(2);
                int i2 = Build.VERSION.SDK_INT;
                AbstractC0389f.m991c(imageView, colorStateListM1239n);
                if (i2 == 21 && (drawable2 = imageView.getDrawable()) != null && AbstractC0389f.m989a(imageView) != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable2);
                }
            }
            if (typedArray.hasValue(3)) {
                PorterDuff.Mode modeM2805c = AbstractC1181p0.m2805c(typedArray.getInt(3, -1), null);
                int i3 = Build.VERSION.SDK_INT;
                AbstractC0389f.m992d(imageView, modeM2805c);
                if (i3 == 21 && (drawable = imageView.getDrawable()) != null && AbstractC0389f.m989a(imageView) != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
            c0513tM1223A.m1228C();
        } catch (Throwable th) {
            c0513tM1223A.m1228C();
            throw th;
        }
    }
}
