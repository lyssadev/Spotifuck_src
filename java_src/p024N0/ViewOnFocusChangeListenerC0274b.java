package p024N0;

import android.view.View;

/* renamed from: N0.b */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0274b implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f678a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0290r f679b;

    public /* synthetic */ ViewOnFocusChangeListenerC0274b(AbstractC0290r abstractC0290r, int i) {
        this.f678a = i;
        this.f679b = abstractC0290r;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        switch (this.f678a) {
            case 0:
                C0277e c0277e = (C0277e) this.f679b;
                c0277e.m818t(c0277e.m819u());
                break;
            default:
                C0284l c0284l = (C0284l) this.f679b;
                c0284l.f707l = z2;
                c0284l.m850q();
                if (!z2) {
                    c0284l.m828t(false);
                    c0284l.f708m = false;
                    break;
                }
                break;
        }
    }
}
