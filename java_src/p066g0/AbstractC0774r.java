package p066g0;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC0606r;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import it.deviato.spotifuck.R;
import p024N0.RunnableC0268B;
import p030Q0.HandlerC0341j;
import p074j0.AbstractC0896K;

/* renamed from: g0.r */
/* loaded from: classes.dex */
public abstract class AbstractC0774r extends AbstractComponentCallbacksC0606r {

    /* renamed from: a0 */
    public C0779w f2804a0;

    /* renamed from: b0 */
    public RecyclerView f2805b0;

    /* renamed from: c0 */
    public boolean f2806c0;

    /* renamed from: d0 */
    public boolean f2807d0;

    /* renamed from: Z */
    public final C0773q f2803Z = new C0773q(this);

    /* renamed from: e0 */
    public int f2808e0 = R.layout.preference_list_fragment;

    /* renamed from: f0 */
    public final HandlerC0341j f2809f0 = new HandlerC0341j(this, Looper.getMainLooper(), 4);

    /* renamed from: g0 */
    public final RunnableC0268B f2810g0 = new RunnableC0268B(9, this);

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: A */
    public final void mo1565A() {
        this.f1901H = true;
        C0779w c0779w = this.f2804a0;
        c0779w.f2834h = null;
        c0779w.f2835i = null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: B */
    public final void mo1579B(Bundle bundle) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen2 = this.f2804a0.f2833g) != null) {
            preferenceScreen2.mo1653a(bundle2);
        }
        if (this.f2806c0 && (preferenceScreen = this.f2804a0.f2833g) != null) {
            this.f2805b0.setAdapter(new C0777u(preferenceScreen));
            preferenceScreen.mo1659i();
        }
        this.f2807d0 = true;
    }

    /* renamed from: K */
    public abstract void mo1986K(String str);

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: t */
    public final void mo1572t(Bundle bundle) {
        super.mo1572t(bundle);
        TypedValue typedValue = new TypedValue();
        m1581F().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        m1581F().getTheme().applyStyle(i, false);
        C0779w c0779w = new C0779w(m1581F());
        this.f2804a0 = c0779w;
        c0779w.f2836j = this;
        Bundle bundle2 = this.f1923k;
        mo1986K(bundle2 != null ? bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: u */
    public final View mo1598u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView;
        TypedArray typedArrayObtainStyledAttributes = m1581F().obtainStyledAttributes(null, AbstractC0782z.f2852h, R.attr.preferenceFragmentCompatStyle, 0);
        this.f2808e0 = typedArrayObtainStyledAttributes.getResourceId(0, this.f2808e0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(m1581F());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f2808e0, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        if (!m1581F().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
            recyclerView = (RecyclerView) layoutInflaterCloneInContext.inflate(R.layout.preference_recyclerview, viewGroup2, false);
            m1581F();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            recyclerView.setAccessibilityDelegateCompat(new C0780x(recyclerView));
        }
        this.f2805b0 = recyclerView;
        C0773q c0773q = this.f2803Z;
        recyclerView.m1787g(c0773q);
        if (drawable != null) {
            c0773q.getClass();
            c0773q.f2800b = drawable.getIntrinsicHeight();
        } else {
            c0773q.f2800b = 0;
        }
        c0773q.f2799a = drawable;
        AbstractC0774r abstractC0774r = c0773q.f2802d;
        RecyclerView recyclerView2 = abstractC0774r.f2805b0;
        if (recyclerView2.f2214s.size() != 0) {
            AbstractC0896K abstractC0896K = recyclerView2.f2212r;
            if (abstractC0896K != null) {
                abstractC0896K.mo1735c("Cannot invalidate item decorations during a scroll or layout");
            }
            recyclerView2.m1768N();
            recyclerView2.requestLayout();
        }
        if (dimensionPixelSize != -1) {
            c0773q.f2800b = dimensionPixelSize;
            RecyclerView recyclerView3 = abstractC0774r.f2805b0;
            if (recyclerView3.f2214s.size() != 0) {
                AbstractC0896K abstractC0896K2 = recyclerView3.f2212r;
                if (abstractC0896K2 != null) {
                    abstractC0896K2.mo1735c("Cannot invalidate item decorations during a scroll or layout");
                }
                recyclerView3.m1768N();
                recyclerView3.requestLayout();
            }
        }
        c0773q.f2801c = z2;
        if (this.f2805b0.getParent() == null) {
            viewGroup2.addView(this.f2805b0);
        }
        this.f2809f0.post(this.f2810g0);
        return viewInflate;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: v */
    public final void mo1573v() {
        HandlerC0341j handlerC0341j = this.f2809f0;
        handlerC0341j.removeCallbacks(this.f2810g0);
        handlerC0341j.removeMessages(1);
        if (this.f2806c0) {
            this.f2805b0.setAdapter(null);
            PreferenceScreen preferenceScreen = this.f2804a0.f2833g;
            if (preferenceScreen != null) {
                preferenceScreen.mo1661m();
            }
        }
        this.f2805b0 = null;
        this.f1901H = true;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: y */
    public final void mo1576y(Bundle bundle) {
        PreferenceScreen preferenceScreen = this.f2804a0.f2833g;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.mo1654b(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: z */
    public final void mo1577z() {
        this.f1901H = true;
        C0779w c0779w = this.f2804a0;
        c0779w.f2834h = this;
        c0779w.f2835i = this;
    }
}
