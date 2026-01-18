package p110x0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import it.deviato.spotifuck.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p009F.AbstractC0082a;
import p074j0.AbstractC0893H;

/* renamed from: x0.b */
/* loaded from: classes.dex */
public final class C1338b extends AbstractC0893H {

    /* renamed from: a */
    public final Paint f5435a;

    /* renamed from: b */
    public final List f5436b;

    public C1338b() {
        Paint paint = new Paint();
        this.f5435a = paint;
        this.f5436b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // p074j0.AbstractC0893H
    /* renamed from: c */
    public final void mo1984c(Canvas canvas, RecyclerView recyclerView) {
        int iM2280G;
        int iM2277D;
        int iM2278E;
        int iM2279F;
        Paint paint = this.f5435a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        Iterator it2 = this.f5436b.iterator();
        while (it2.hasNext()) {
            ((AbstractC1340d) it2.next()).getClass();
            ThreadLocal threadLocal = AbstractC0082a.f247a;
            float f2 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f2)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f2)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f2)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f2))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).m1875A0()) {
                C1339c c1339c = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2379q;
                switch (c1339c.f5438b) {
                    case 0:
                        iM2280G = 0;
                        break;
                    default:
                        iM2280G = c1339c.f5439c.m2280G();
                        break;
                }
                float f3 = iM2280G;
                C1339c c1339c2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2379q;
                switch (c1339c2.f5438b) {
                    case 0:
                        iM2277D = c1339c2.f5439c.f3600o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = c1339c2.f5439c;
                        iM2277D = carouselLayoutManager.f3600o - carouselLayoutManager.m2277D();
                        break;
                }
                canvas.drawLine(0.0f, f3, 0.0f, iM2277D, paint);
            } else {
                C1339c c1339c3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2379q;
                switch (c1339c3.f5438b) {
                    case 0:
                        iM2278E = c1339c3.f5439c.m2278E();
                        break;
                    default:
                        iM2278E = 0;
                        break;
                }
                float f4 = iM2278E;
                C1339c c1339c4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2379q;
                switch (c1339c4.f5438b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = c1339c4.f5439c;
                        iM2279F = carouselLayoutManager2.f3599n - carouselLayoutManager2.m2279F();
                        break;
                    default:
                        iM2279F = c1339c4.f5439c.f3599n;
                        break;
                }
                canvas.drawLine(f4, 0.0f, iM2279F, 0.0f, paint);
            }
        }
    }
}
