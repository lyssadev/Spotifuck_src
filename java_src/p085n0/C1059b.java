package p085n0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;

/* renamed from: n0.b */
/* loaded from: classes.dex */
public final class C1059b extends Property {

    /* renamed from: a */
    public final /* synthetic */ int f4361a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1059b(Class cls, String str, int i) {
        super(cls, str);
        this.f4361a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f4361a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(AbstractC1080w.f4431a.mo499f((View) obj));
            case 6:
                return ((View) obj).getClipBounds();
            default:
                return Float.valueOf(((SwitchCompat) obj).f1462E);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f4361a) {
            case 0:
                C1062e c1062e = (C1062e) obj;
                PointF pointF = (PointF) obj2;
                c1062e.getClass();
                c1062e.f4364a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                c1062e.f4365b = iRound;
                int i = c1062e.f4369f + 1;
                c1062e.f4369f = i;
                if (i == c1062e.f4370g) {
                    AbstractC1080w.m2663a(c1062e.f4368e, c1062e.f4364a, iRound, c1062e.f4366c, c1062e.f4367d);
                    c1062e.f4369f = 0;
                    c1062e.f4370g = 0;
                    break;
                }
                break;
            case 1:
                C1062e c1062e2 = (C1062e) obj;
                PointF pointF2 = (PointF) obj2;
                c1062e2.getClass();
                c1062e2.f4366c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                c1062e2.f4367d = iRound2;
                int i2 = c1062e2.f4370g + 1;
                c1062e2.f4370g = i2;
                if (c1062e2.f4369f == i2) {
                    AbstractC1080w.m2663a(c1062e2.f4368e, c1062e2.f4364a, c1062e2.f4365b, c1062e2.f4366c, iRound2);
                    c1062e2.f4369f = 0;
                    c1062e2.f4370g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC1080w.m2663a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC1080w.m2663a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                AbstractC1080w.m2663a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                float fFloatValue = ((Float) obj2).floatValue();
                AbstractC1080w.f4431a.mo504o((View) obj, fFloatValue);
                break;
            case 6:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
            default:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
        }
    }
}
