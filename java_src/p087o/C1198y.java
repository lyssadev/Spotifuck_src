package p087o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import p036T0.AbstractC0411g;
import p067g1.C0804o;
import p074j0.C0913b;

/* renamed from: o.y */
/* loaded from: classes.dex */
public class C1198y extends ImageView {

    /* renamed from: f */
    public final C0913b f4760f;

    /* renamed from: g */
    public final C1196x f4761g;

    /* renamed from: h */
    public boolean f4762h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1198y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC1127V0.m2746a(context);
        this.f4762h = false;
        AbstractC1125U0.m2741a(this, getContext());
        C0913b c0913b = new C0913b(this);
        this.f4760f = c0913b;
        c0913b.m2343k(attributeSet, i);
        C1196x c1196x = new C1196x(this);
        this.f4761g = c1196x;
        c1196x.m2825b(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0913b c0913b = this.f4760f;
        if (c0913b != null) {
            c0913b.m2333a();
        }
        C1196x c1196x = this.f4761g;
        if (c1196x != null) {
            c1196x.m2824a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0913b c0913b = this.f4760f;
        if (c0913b != null) {
            return c0913b.m2340h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0913b c0913b = this.f4760f;
        if (c0913b != null) {
            return c0913b.m2341i();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0804o c0804o;
        C1196x c1196x = this.f4761g;
        if (c1196x == null || (c0804o = c1196x.f4755b) == null) {
            return null;
        }
        return (ColorStateList) c0804o.f2987c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0804o c0804o;
        C1196x c1196x = this.f4761g;
        if (c1196x == null || (c0804o = c1196x.f4755b) == null) {
            return null;
        }
        return (PorterDuff.Mode) c0804o.f2988d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(this.f4761g.f4754a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0913b c0913b = this.f4760f;
        if (c0913b != null) {
            c0913b.m2345m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0913b c0913b = this.f4760f;
        if (c0913b != null) {
            c0913b.m2346n(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C1196x c1196x = this.f4761g;
        if (c1196x != null) {
            c1196x.m2824a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C1196x c1196x = this.f4761g;
        if (c1196x != null && drawable != null && !this.f4762h) {
            c1196x.f4757d = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c1196x != null) {
            c1196x.m2824a();
            if (this.f4762h) {
                return;
            }
            ImageView imageView = c1196x.f4754a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c1196x.f4757d);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f4762h = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C1196x c1196x = this.f4761g;
        if (c1196x != null) {
            ImageView imageView = c1196x.f4754a;
            if (i != 0) {
                Drawable drawableM1039n = AbstractC0411g.m1039n(imageView.getContext(), i);
                if (drawableM1039n != null) {
                    AbstractC1181p0.m2803a(drawableM1039n);
                }
                imageView.setImageDrawable(drawableM1039n);
            } else {
                imageView.setImageDrawable(null);
            }
            c1196x.m2824a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C1196x c1196x = this.f4761g;
        if (c1196x != null) {
            c1196x.m2824a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0913b c0913b = this.f4760f;
        if (c0913b != null) {
            c0913b.m2351s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0913b c0913b = this.f4760f;
        if (c0913b != null) {
            c0913b.m2352t(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C1196x c1196x = this.f4761g;
        if (c1196x != null) {
            if (c1196x.f4755b == null) {
                c1196x.f4755b = new C0804o();
            }
            C0804o c0804o = c1196x.f4755b;
            c0804o.f2987c = colorStateList;
            c0804o.f2986b = true;
            c1196x.m2824a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C1196x c1196x = this.f4761g;
        if (c1196x != null) {
            if (c1196x.f4755b == null) {
                c1196x.f4755b = new C0804o();
            }
            C0804o c0804o = c1196x.f4755b;
            c0804o.f2988d = mode;
            c0804o.f2985a = true;
            c1196x.m2824a();
        }
    }
}
