package p024N0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;
import p009F.AbstractC0082a;
import p010G.AbstractC0094a;
import p023N.AbstractC0206Q;

/* renamed from: N0.w */
/* loaded from: classes.dex */
public final class C0295w extends ArrayAdapter {

    /* renamed from: a */
    public ColorStateList f784a;

    /* renamed from: b */
    public ColorStateList f785b;

    /* renamed from: c */
    public final /* synthetic */ C0296x f786c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0295w(C0296x c0296x, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f786c = c0296x;
        m860a();
    }

    /* renamed from: a */
    public final void m860a() {
        ColorStateList colorStateList;
        C0296x c0296x = this.f786c;
        ColorStateList colorStateList2 = c0296x.f794q;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f785b = colorStateList;
        if (c0296x.f793p != 0 && c0296x.f794q != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{AbstractC0082a.m324b(c0296x.f794q.getColorForState(iArr3, 0), c0296x.f793p), AbstractC0082a.m324b(c0296x.f794q.getColorForState(iArr2, 0), c0296x.f793p), c0296x.f793p});
        }
        this.f784a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            C0296x c0296x = this.f786c;
            Drawable rippleDrawable = null;
            if (c0296x.getText().toString().contentEquals(textView.getText()) && c0296x.f793p != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(c0296x.f793p);
                if (this.f785b != null) {
                    AbstractC0094a.m363h(colorDrawable, this.f784a);
                    rippleDrawable = new RippleDrawable(this.f785b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
