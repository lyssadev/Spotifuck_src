package p114z0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* renamed from: z0.b */
/* loaded from: classes.dex */
public final class C1367b extends ViewOutlineProvider {

    /* renamed from: a */
    public final /* synthetic */ Chip f5704a;

    public C1367b(Chip chip) {
        this.f5704a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C1370e c1370e = this.f5704a.f2385j;
        if (c1370e != null) {
            c1370e.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
