package p087o;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: o.U */
/* loaded from: classes.dex */
public final class RunnableC1124U implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f4553a = 0;

    /* renamed from: b */
    public final /* synthetic */ int f4554b;

    /* renamed from: c */
    public final /* synthetic */ View f4555c;

    /* renamed from: d */
    public final /* synthetic */ Object f4556d;

    public RunnableC1124U(TextView textView, Typeface typeface, int i) {
        this.f4555c = textView;
        this.f4556d = typeface;
        this.f4554b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4553a) {
            case 0:
                ((TextView) this.f4555c).setTypeface((Typeface) this.f4556d, this.f4554b);
                break;
            default:
                ((BottomSheetBehavior) this.f4556d).m1853E(this.f4555c, this.f4554b, false);
                break;
        }
    }

    public RunnableC1124U(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f4556d = bottomSheetBehavior;
        this.f4555c = view;
        this.f4554b = i;
    }
}
