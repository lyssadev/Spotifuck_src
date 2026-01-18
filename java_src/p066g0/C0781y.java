package p066g0;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import p074j0.AbstractC0912a0;

/* renamed from: g0.y */
/* loaded from: classes.dex */
public final class C0781y extends AbstractC0912a0 {

    /* renamed from: t */
    public final Drawable f2840t;

    /* renamed from: u */
    public final ColorStateList f2841u;

    /* renamed from: v */
    public final SparseArray f2842v;

    /* renamed from: w */
    public boolean f2843w;

    /* renamed from: x */
    public boolean f2844x;

    public C0781y(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.f2842v = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        sparseArray.put(it.deviato.spotifuck.R.id.icon_frame, view.findViewById(it.deviato.spotifuck.R.id.icon_frame));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.f2840t = view.getBackground();
        if (textView != null) {
            this.f2841u = textView.getTextColors();
        }
    }

    /* renamed from: r */
    public final View m2001r(int i) {
        SparseArray sparseArray = this.f2842v;
        View view = (View) sparseArray.get(i);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.f3654a.findViewById(i);
        if (viewFindViewById != null) {
            sparseArray.put(i, viewFindViewById);
        }
        return viewFindViewById;
    }
}
