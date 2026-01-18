package p074j0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: j0.y */
/* loaded from: classes.dex */
public final class C0946y extends C0943v {

    /* renamed from: q */
    public final /* synthetic */ int f3863q;

    /* renamed from: r */
    public final /* synthetic */ Object f3864r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0946y(Object obj, Context context, int i) {
        super(context);
        this.f3863q = i;
        this.f3864r = obj;
    }

    @Override // p074j0.C0943v
    /* renamed from: b */
    public int mo2396b(View view, int i) {
        switch (this.f3863q) {
            case 1:
                ((CarouselLayoutManager) this.f3864r).getClass();
                return 0;
            default:
                return super.mo2396b(view, i);
        }
    }

    @Override // p074j0.C0943v
    /* renamed from: c */
    public int mo2397c(View view, int i) {
        switch (this.f3863q) {
            case 1:
                ((CarouselLayoutManager) this.f3864r).getClass();
                return 0;
            default:
                return super.mo2397c(view, i);
        }
    }

    @Override // p074j0.C0943v
    /* renamed from: d */
    public float mo1909d(DisplayMetrics displayMetrics) {
        switch (this.f3863q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.mo1909d(displayMetrics);
        }
    }

    @Override // p074j0.C0943v
    /* renamed from: e */
    public int mo2398e(int i) {
        switch (this.f3863q) {
            case 0:
                return Math.min(100, super.mo2398e(i));
            default:
                return super.mo2398e(i);
        }
    }

    @Override // p074j0.C0943v
    /* renamed from: f */
    public PointF mo2399f(int i) {
        switch (this.f3863q) {
            case 1:
                ((CarouselLayoutManager) this.f3864r).getClass();
                return null;
            default:
                return super.mo2399f(i);
        }
    }

    @Override // p074j0.C0943v
    /* renamed from: h */
    public void mo2401h(View view, C0906V c0906v) {
        switch (this.f3863q) {
            case 0:
                C0947z c0947z = (C0947z) this.f3864r;
                int[] iArrM2411a = c0947z.m2411a(c0947z.f3865a.getLayoutManager(), view);
                int i = iArrM2411a[0];
                int i2 = iArrM2411a[1];
                int iCeil = (int) Math.ceil(mo2398e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
                if (iCeil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f3854j;
                    c0906v.f3621a = i;
                    c0906v.f3622b = i2;
                    c0906v.f3623c = iCeil;
                    c0906v.f3625e = decelerateInterpolator;
                    c0906v.f3626f = true;
                    break;
                }
                break;
            default:
                super.mo2401h(view, c0906v);
                break;
        }
    }
}
