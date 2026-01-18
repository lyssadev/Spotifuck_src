package p087o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: o.b */
/* loaded from: classes.dex */
public final class C1139b extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f4587a;

    public C1139b(ActionBarContainer actionBarContainer) {
        this.f4587a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f4587a;
        if (actionBarContainer.f1376l) {
            Drawable drawable = actionBarContainer.f1375k;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1373i;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f1374j;
        if (drawable3 == null || !actionBarContainer.f1377m) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f4587a;
        if (actionBarContainer.f1376l) {
            if (actionBarContainer.f1375k != null) {
                actionBarContainer.f1373i.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f1373i;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
