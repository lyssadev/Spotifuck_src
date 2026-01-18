package p110x0;

import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: x0.c */
/* loaded from: classes.dex */
public final class C1339c {

    /* renamed from: a */
    public final int f5437a;

    /* renamed from: b */
    public final /* synthetic */ int f5438b;

    /* renamed from: c */
    public final /* synthetic */ CarouselLayoutManager f5439c;

    public C1339c(int i) {
        this.f5437a = i;
    }

    /* renamed from: a */
    public final int m3251a() {
        switch (this.f5438b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f5439c;
                if (carouselLayoutManager.m1876B0()) {
                    return carouselLayoutManager.f3599n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1339c(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f5438b = i;
        switch (i) {
            case 1:
                this.f5439c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f5439c = carouselLayoutManager;
                break;
        }
    }
}
