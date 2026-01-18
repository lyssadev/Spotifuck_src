package p066g0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;
import p007E.C0057j;
import p023N.AbstractC0206Q;
import p024N0.RunnableC0268B;
import p036T0.AbstractC0411g;
import p074j0.AbstractC0888C;
import p074j0.AbstractC0912a0;

/* renamed from: g0.u */
/* loaded from: classes.dex */
public final class C0777u extends AbstractC0888C {

    /* renamed from: c */
    public final PreferenceScreen f2815c;

    /* renamed from: d */
    public ArrayList f2816d;

    /* renamed from: e */
    public ArrayList f2817e;

    /* renamed from: f */
    public final ArrayList f2818f;

    /* renamed from: h */
    public final RunnableC0268B f2820h = new RunnableC0268B(10, this);

    /* renamed from: g */
    public final Handler f2819g = new Handler(Looper.getMainLooper());

    public C0777u(PreferenceScreen preferenceScreen) {
        this.f2815c = preferenceScreen;
        preferenceScreen.f2066F = this;
        this.f2816d = new ArrayList();
        this.f2817e = new ArrayList();
        this.f2818f = new ArrayList();
        m2253f(preferenceScreen.f2105S);
        m1992k();
    }

    /* renamed from: j */
    public static boolean m1987j(PreferenceGroup preferenceGroup) {
        return preferenceGroup.f2104R != Integer.MAX_VALUE;
    }

    @Override // p074j0.AbstractC0888C
    /* renamed from: a */
    public final int mo1905a() {
        return this.f2817e.size();
    }

    @Override // p074j0.AbstractC0888C
    /* renamed from: b */
    public final long mo1906b(int i) {
        if (this.f3573b) {
            return m1991i(i).mo1655c();
        }
        return -1L;
    }

    @Override // p074j0.AbstractC0888C
    /* renamed from: c */
    public final int mo1988c(int i) {
        C0776t c0776t = new C0776t(m1991i(i));
        ArrayList arrayList = this.f2818f;
        int iIndexOf = arrayList.indexOf(c0776t);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = arrayList.size();
        arrayList.add(c0776t);
        return size;
    }

    @Override // p074j0.AbstractC0888C
    /* renamed from: d */
    public final void mo1907d(AbstractC0912a0 abstractC0912a0, int i) {
        ColorStateList colorStateList;
        C0781y c0781y = (C0781y) abstractC0912a0;
        Preference preferenceM1991i = m1991i(i);
        View view = c0781y.f3654a;
        Drawable background = view.getBackground();
        Drawable drawable = c0781y.f2840t;
        if (background != drawable) {
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            view.setBackground(drawable);
        }
        TextView textView = (TextView) c0781y.m2001r(R.id.title);
        if (textView != null && (colorStateList = c0781y.f2841u) != null && !textView.getTextColors().equals(colorStateList)) {
            textView.setTextColor(colorStateList);
        }
        preferenceM1991i.mo1636k(c0781y);
    }

    @Override // p074j0.AbstractC0888C
    /* renamed from: e */
    public final AbstractC0912a0 mo1908e(ViewGroup viewGroup, int i) {
        C0776t c0776t = (C0776t) this.f2818f.get(i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, AbstractC0782z.f2845a);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = AbstractC0411g.m1039n(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(c0776t.f2812a, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            viewInflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = c0776t.f2813b;
            if (i2 != 0) {
                layoutInflaterFrom.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new C0781y(viewInflate);
    }

    /* renamed from: g */
    public final ArrayList m1989g(PreferenceGroup preferenceGroup) {
        boolean z2 = false;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = preferenceGroup.f2100N.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Preference preferenceM1665x = preferenceGroup.m1665x(i2);
            if (preferenceM1665x.f2094v) {
                if (!m1987j(preferenceGroup) || i < preferenceGroup.f2104R) {
                    arrayList.add(preferenceM1665x);
                } else {
                    arrayList2.add(preferenceM1665x);
                }
                if (preferenceM1665x instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceM1665x;
                    if (preferenceGroup2 instanceof PreferenceScreen) {
                        continue;
                    } else {
                        if (m1987j(preferenceGroup) && m1987j(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        Iterator it2 = m1989g(preferenceGroup2).iterator();
                        while (it2.hasNext()) {
                            Preference preference = (Preference) it2.next();
                            if (!m1987j(preferenceGroup) || i < preferenceGroup.f2104R) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        if (m1987j(preferenceGroup) && i > preferenceGroup.f2104R) {
            long j2 = preferenceGroup.f2075c;
            CharSequence string = null;
            C0761e c0761e = new C0761e(preferenceGroup.f2073a, null);
            c0761e.f2064D = it.deviato.spotifuck.R.layout.expand_button;
            Context context = c0761e.f2073a;
            Drawable drawableM1039n = AbstractC0411g.m1039n(context, it.deviato.spotifuck.R.drawable.ic_arrow_down_24dp);
            if (c0761e.f2082j != drawableM1039n) {
                c0761e.f2082j = drawableM1039n;
                c0761e.f2081i = 0;
                c0761e.mo1640g();
            }
            c0761e.f2081i = it.deviato.spotifuck.R.drawable.ic_arrow_down_24dp;
            String string2 = context.getString(it.deviato.spotifuck.R.string.expand_button_title);
            if (!TextUtils.equals(string2, c0761e.f2079g)) {
                c0761e.f2079g = string2;
                c0761e.mo1640g();
            }
            if (999 != c0761e.f2078f) {
                c0761e.f2078f = 999;
                C0777u c0777u = c0761e.f2066F;
                if (c0777u != null) {
                    Handler handler = c0777u.f2819g;
                    RunnableC0268B runnableC0268B = c0777u.f2820h;
                    handler.removeCallbacks(runnableC0268B);
                    handler.post(runnableC0268B);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Preference preference2 = (Preference) it3.next();
                CharSequence charSequence = preference2.f2079g;
                boolean z3 = preference2 instanceof PreferenceGroup;
                if (z3 && !TextUtils.isEmpty(charSequence)) {
                    arrayList3.add((PreferenceGroup) preference2);
                }
                if (arrayList3.contains(preference2.f2068H)) {
                    if (z3) {
                        arrayList3.add((PreferenceGroup) preference2);
                    }
                } else if (!TextUtils.isEmpty(charSequence)) {
                    string = string == null ? charSequence : context.getString(it.deviato.spotifuck.R.string.summary_collapsed_preference_list, string, charSequence);
                }
            }
            if (c0761e.f2071K != null) {
                throw new IllegalStateException("Preference already has a SummaryProvider set.");
            }
            if (!TextUtils.equals(c0761e.f2080h, string)) {
                c0761e.f2080h = string;
                c0761e.mo1640g();
            }
            c0761e.f2778M = j2 + 1000000;
            c0761e.f2077e = new C0057j(this, preferenceGroup, 11, z2);
            arrayList.add(c0761e);
        }
        return arrayList;
    }

    /* renamed from: h */
    public final void m1990h(ArrayList arrayList, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.f2100N);
        }
        int size = preferenceGroup.f2100N.size();
        for (int i = 0; i < size; i++) {
            Preference preferenceM1665x = preferenceGroup.m1665x(i);
            arrayList.add(preferenceM1665x);
            C0776t c0776t = new C0776t(preferenceM1665x);
            if (!this.f2818f.contains(c0776t)) {
                this.f2818f.add(c0776t);
            }
            if (preferenceM1665x instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceM1665x;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    m1990h(arrayList, preferenceGroup2);
                }
            }
            preferenceM1665x.f2066F = this;
        }
    }

    /* renamed from: i */
    public final Preference m1991i(int i) {
        if (i < 0 || i >= this.f2817e.size()) {
            return null;
        }
        return (Preference) this.f2817e.get(i);
    }

    /* renamed from: k */
    public final void m1992k() {
        Iterator it2 = this.f2816d.iterator();
        while (it2.hasNext()) {
            ((Preference) it2.next()).f2066F = null;
        }
        ArrayList arrayList = new ArrayList(this.f2816d.size());
        this.f2816d = arrayList;
        PreferenceScreen preferenceScreen = this.f2815c;
        m1990h(arrayList, preferenceScreen);
        this.f2817e = m1989g(preferenceScreen);
        this.f3572a.m2255b();
        Iterator it3 = this.f2816d.iterator();
        while (it3.hasNext()) {
            ((Preference) it3.next()).getClass();
        }
    }
}
