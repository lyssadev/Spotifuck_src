package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.AbstractComponentCallbacksC0606r;
import androidx.fragment.app.C0571B;
import androidx.fragment.app.C0577H;
import androidx.fragment.app.C0589a;
import it.deviato.spotifuck.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p007E.AbstractC0049b;
import p018K0.C0146e;
import p023N.AbstractC0206Q;
import p032R0.ViewOnClickListenerC0367i;
import p036T0.AbstractC0411g;
import p066g0.AbstractC0774r;
import p066g0.AbstractC0782z;
import p066g0.C0777u;
import p066g0.C0779w;
import p066g0.C0781y;
import p066g0.InterfaceC0769m;
import p066g0.ViewOnCreateContextMenuListenerC0770n;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: A */
    public final boolean f2061A;

    /* renamed from: B */
    public final boolean f2062B;

    /* renamed from: C */
    public final boolean f2063C;

    /* renamed from: D */
    public int f2064D;

    /* renamed from: E */
    public final int f2065E;

    /* renamed from: F */
    public C0777u f2066F;

    /* renamed from: G */
    public ArrayList f2067G;

    /* renamed from: H */
    public PreferenceGroup f2068H;

    /* renamed from: I */
    public boolean f2069I;

    /* renamed from: J */
    public ViewOnCreateContextMenuListenerC0770n f2070J;

    /* renamed from: K */
    public C0146e f2071K;

    /* renamed from: L */
    public final ViewOnClickListenerC0367i f2072L;

    /* renamed from: a */
    public final Context f2073a;

    /* renamed from: b */
    public C0779w f2074b;

    /* renamed from: c */
    public long f2075c;

    /* renamed from: d */
    public boolean f2076d;

    /* renamed from: e */
    public InterfaceC0769m f2077e;

    /* renamed from: f */
    public int f2078f;

    /* renamed from: g */
    public CharSequence f2079g;

    /* renamed from: h */
    public CharSequence f2080h;

    /* renamed from: i */
    public int f2081i;

    /* renamed from: j */
    public Drawable f2082j;

    /* renamed from: k */
    public final String f2083k;

    /* renamed from: l */
    public Intent f2084l;

    /* renamed from: m */
    public final String f2085m;

    /* renamed from: n */
    public Bundle f2086n;

    /* renamed from: o */
    public final boolean f2087o;

    /* renamed from: p */
    public final boolean f2088p;

    /* renamed from: q */
    public final boolean f2089q;

    /* renamed from: r */
    public final String f2090r;

    /* renamed from: s */
    public final Object f2091s;

    /* renamed from: t */
    public boolean f2092t;

    /* renamed from: u */
    public boolean f2093u;

    /* renamed from: v */
    public final boolean f2094v;

    /* renamed from: w */
    public final boolean f2095w;

    /* renamed from: x */
    public final boolean f2096x;

    /* renamed from: y */
    public final boolean f2097y;

    /* renamed from: z */
    public final boolean f2098z;

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this.f2078f = Integer.MAX_VALUE;
        this.f2087o = true;
        this.f2088p = true;
        this.f2089q = true;
        this.f2092t = true;
        this.f2093u = true;
        this.f2094v = true;
        this.f2095w = true;
        this.f2096x = true;
        this.f2098z = true;
        this.f2063C = true;
        this.f2064D = R.layout.preference;
        this.f2072L = new ViewOnClickListenerC0367i(2, this);
        this.f2073a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0782z.f2851g, i, 0);
        this.f2081i = typedArrayObtainStyledAttributes.getResourceId(23, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        String string = typedArrayObtainStyledAttributes.getString(26);
        this.f2083k = string == null ? typedArrayObtainStyledAttributes.getString(6) : string;
        CharSequence text = typedArrayObtainStyledAttributes.getText(34);
        this.f2079g = text == null ? typedArrayObtainStyledAttributes.getText(4) : text;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(33);
        this.f2080h = text2 == null ? typedArrayObtainStyledAttributes.getText(7) : text2;
        this.f2078f = typedArrayObtainStyledAttributes.getInt(28, typedArrayObtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = typedArrayObtainStyledAttributes.getString(22);
        this.f2085m = string2 == null ? typedArrayObtainStyledAttributes.getString(13) : string2;
        this.f2064D = typedArrayObtainStyledAttributes.getResourceId(27, typedArrayObtainStyledAttributes.getResourceId(3, R.layout.preference));
        this.f2065E = typedArrayObtainStyledAttributes.getResourceId(35, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.f2087o = typedArrayObtainStyledAttributes.getBoolean(21, typedArrayObtainStyledAttributes.getBoolean(2, true));
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(30, typedArrayObtainStyledAttributes.getBoolean(5, true));
        this.f2088p = z2;
        this.f2089q = typedArrayObtainStyledAttributes.getBoolean(29, typedArrayObtainStyledAttributes.getBoolean(1, true));
        String string3 = typedArrayObtainStyledAttributes.getString(19);
        this.f2090r = string3 == null ? typedArrayObtainStyledAttributes.getString(10) : string3;
        this.f2095w = typedArrayObtainStyledAttributes.getBoolean(16, typedArrayObtainStyledAttributes.getBoolean(16, z2));
        this.f2096x = typedArrayObtainStyledAttributes.getBoolean(17, typedArrayObtainStyledAttributes.getBoolean(17, z2));
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.f2091s = mo1641n(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.f2091s = mo1641n(typedArrayObtainStyledAttributes, 11);
        }
        this.f2063C = typedArrayObtainStyledAttributes.getBoolean(31, typedArrayObtainStyledAttributes.getBoolean(12, true));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.f2097y = zHasValue;
        if (zHasValue) {
            this.f2098z = typedArrayObtainStyledAttributes.getBoolean(32, typedArrayObtainStyledAttributes.getBoolean(14, true));
        }
        this.f2061A = typedArrayObtainStyledAttributes.getBoolean(24, typedArrayObtainStyledAttributes.getBoolean(15, false));
        this.f2094v = typedArrayObtainStyledAttributes.getBoolean(25, typedArrayObtainStyledAttributes.getBoolean(25, true));
        this.f2062B = typedArrayObtainStyledAttributes.getBoolean(20, typedArrayObtainStyledAttributes.getBoolean(20, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: t */
    public static void m1652t(View view, boolean z2) {
        view.setEnabled(z2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                m1652t(viewGroup.getChildAt(childCount), z2);
            }
        }
    }

    /* renamed from: a */
    public void mo1653a(Bundle bundle) {
        Parcelable parcelable;
        if (TextUtils.isEmpty(this.f2083k) || (parcelable = bundle.getParcelable(this.f2083k)) == null) {
            return;
        }
        this.f2069I = false;
        mo1642o(parcelable);
        if (!this.f2069I) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    /* renamed from: b */
    public void mo1654b(Bundle bundle) {
        if (TextUtils.isEmpty(this.f2083k)) {
            return;
        }
        this.f2069I = false;
        Parcelable parcelableMo1643p = mo1643p();
        if (!this.f2069I) {
            throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
        }
        if (parcelableMo1643p != null) {
            bundle.putParcelable(this.f2083k, parcelableMo1643p);
        }
    }

    /* renamed from: c */
    public long mo1655c() {
        return this.f2075c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = this.f2078f;
        int i2 = preference2.f2078f;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.f2079g;
        CharSequence charSequence2 = preference2.f2079g;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.f2079g.toString());
    }

    /* renamed from: d */
    public final String m1656d(String str) {
        return !m1663v() ? str : this.f2074b.m1999c().getString(this.f2083k, str);
    }

    /* renamed from: e */
    public CharSequence mo1647e() {
        C0146e c0146e = this.f2071K;
        return c0146e != null ? c0146e.m502m(this) : this.f2080h;
    }

    /* renamed from: f */
    public boolean mo1657f() {
        return this.f2087o && this.f2092t && this.f2093u;
    }

    /* renamed from: g */
    public void mo1640g() {
        int iIndexOf;
        C0777u c0777u = this.f2066F;
        if (c0777u == null || (iIndexOf = c0777u.f2817e.indexOf(this)) == -1) {
            return;
        }
        c0777u.f3572a.m2256c(iIndexOf, 1, this);
    }

    /* renamed from: h */
    public void mo1658h(boolean z2) {
        ArrayList arrayList = this.f2067G;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Preference preference = (Preference) arrayList.get(i);
            if (preference.f2092t == z2) {
                preference.f2092t = !z2;
                preference.mo1658h(preference.mo1645u());
                preference.mo1640g();
            }
        }
    }

    /* renamed from: i */
    public void mo1659i() {
        PreferenceScreen preferenceScreen;
        String str = this.f2090r;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C0779w c0779w = this.f2074b;
        Preference preferenceM1664w = null;
        if (c0779w != null && (preferenceScreen = c0779w.f2833g) != null) {
            preferenceM1664w = preferenceScreen.m1664w(str);
        }
        if (preferenceM1664w == null) {
            throw new IllegalStateException("Dependency \"" + str + "\" not found for preference \"" + this.f2083k + "\" (title: \"" + ((Object) this.f2079g) + "\"");
        }
        if (preferenceM1664w.f2067G == null) {
            preferenceM1664w.f2067G = new ArrayList();
        }
        preferenceM1664w.f2067G.add(this);
        boolean zMo1645u = preferenceM1664w.mo1645u();
        if (this.f2092t == zMo1645u) {
            this.f2092t = !zMo1645u;
            mo1658h(mo1645u());
            mo1640g();
        }
    }

    /* renamed from: j */
    public final void m1660j(C0779w c0779w) {
        this.f2074b = c0779w;
        if (!this.f2076d) {
            this.f2075c = c0779w.m1998b();
        }
        if (m1663v()) {
            C0779w c0779w2 = this.f2074b;
            if ((c0779w2 != null ? c0779w2.m1999c() : null).contains(this.f2083k)) {
                mo1644q(null);
                return;
            }
        }
        Object obj = this.f2091s;
        if (obj != null) {
            mo1644q(obj);
        }
    }

    /* renamed from: k */
    public void mo1636k(C0781y c0781y) {
        Integer numValueOf;
        ViewOnClickListenerC0367i viewOnClickListenerC0367i = this.f2072L;
        View view = c0781y.f3654a;
        view.setOnClickListener(viewOnClickListenerC0367i);
        view.setId(0);
        TextView textView = (TextView) c0781y.m2001r(android.R.id.summary);
        if (textView != null) {
            CharSequence charSequenceMo1647e = mo1647e();
            if (TextUtils.isEmpty(charSequenceMo1647e)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceMo1647e);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) c0781y.m2001r(android.R.id.title);
        boolean z2 = this.f2088p;
        if (textView2 != null) {
            CharSequence charSequence = this.f2079g;
            if (TextUtils.isEmpty(charSequence)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (this.f2097y) {
                    textView2.setSingleLine(this.f2098z);
                }
                if (!z2 && mo1657f() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) c0781y.m2001r(android.R.id.icon);
        boolean z3 = this.f2061A;
        if (imageView != null) {
            int i = this.f2081i;
            if (i != 0 || this.f2082j != null) {
                if (this.f2082j == null) {
                    this.f2082j = AbstractC0411g.m1039n(this.f2073a, i);
                }
                Drawable drawable = this.f2082j;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.f2082j != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(z3 ? 4 : 8);
            }
        }
        View viewM2001r = c0781y.m2001r(R.id.icon_frame);
        if (viewM2001r == null) {
            viewM2001r = c0781y.m2001r(android.R.id.icon_frame);
        }
        if (viewM2001r != null) {
            if (this.f2082j != null) {
                viewM2001r.setVisibility(0);
            } else {
                viewM2001r.setVisibility(z3 ? 4 : 8);
            }
        }
        if (this.f2063C) {
            m1652t(view, mo1657f());
        } else {
            m1652t(view, true);
        }
        view.setFocusable(z2);
        view.setClickable(z2);
        c0781y.f2843w = this.f2095w;
        c0781y.f2844x = this.f2096x;
        boolean z4 = this.f2062B;
        if (z4 && this.f2070J == null) {
            this.f2070J = new ViewOnCreateContextMenuListenerC0770n(this);
        }
        view.setOnCreateContextMenuListener(z4 ? this.f2070J : null);
        view.setLongClickable(z4);
        if (!z4 || z2) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        view.setBackground(null);
    }

    /* renamed from: l */
    public void mo1639l() {
    }

    /* renamed from: m */
    public void mo1661m() {
        ArrayList arrayList;
        PreferenceScreen preferenceScreen;
        String str = this.f2090r;
        if (str != null) {
            C0779w c0779w = this.f2074b;
            Preference preferenceM1664w = null;
            if (c0779w != null && (preferenceScreen = c0779w.f2833g) != null) {
                preferenceM1664w = preferenceScreen.m1664w(str);
            }
            if (preferenceM1664w == null || (arrayList = preferenceM1664w.f2067G) == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    /* renamed from: n */
    public Object mo1641n(TypedArray typedArray, int i) {
        return null;
    }

    /* renamed from: o */
    public void mo1642o(Parcelable parcelable) {
        this.f2069I = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    /* renamed from: p */
    public Parcelable mo1643p() {
        this.f2069I = true;
        return AbsSavedState.EMPTY_STATE;
    }

    /* renamed from: q */
    public void mo1644q(Object obj) {
    }

    /* renamed from: r */
    public void mo1637r(View view) {
        AbstractC0774r abstractC0774r;
        String str;
        if (mo1657f() && this.f2088p) {
            mo1639l();
            InterfaceC0769m interfaceC0769m = this.f2077e;
            if (interfaceC0769m != null) {
                interfaceC0769m.mo265a(this);
                return;
            }
            C0779w c0779w = this.f2074b;
            if (c0779w == null || (abstractC0774r = c0779w.f2834h) == null || (str = this.f2085m) == null) {
                Intent intent = this.f2084l;
                if (intent != null) {
                    this.f2073a.startActivity(intent);
                    return;
                }
                return;
            }
            for (AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = abstractC0774r; abstractComponentCallbacksC0606r != null; abstractComponentCallbacksC0606r = abstractComponentCallbacksC0606r.f1938z) {
            }
            Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
            C0577H c0577hM1590j = abstractC0774r.m1590j();
            if (this.f2086n == null) {
                this.f2086n = new Bundle();
            }
            Bundle bundle = this.f2086n;
            C0571B c0571bM1469C = c0577hM1590j.m1469C();
            abstractC0774r.m1580E().getClassLoader();
            AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606rM1460a = c0571bM1469C.m1460a(str);
            abstractComponentCallbacksC0606rM1460a.m1584I(bundle);
            abstractComponentCallbacksC0606rM1460a.m1585J(abstractC0774r);
            C0589a c0589a = new C0589a(c0577hM1590j);
            int id = ((View) abstractC0774r.m1582G().getParent()).getId();
            if (id == 0) {
                throw new IllegalArgumentException("Must use non-zero containerViewId");
            }
            c0589a.m1546e(id, abstractComponentCallbacksC0606rM1460a, null, 2);
            if (!c0589a.f1815h) {
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
            c0589a.f1814g = true;
            c0589a.f1816i = null;
            c0589a.m1545d(false);
        }
    }

    /* renamed from: s */
    public final void m1662s(String str) {
        if (m1663v() && !TextUtils.equals(str, m1656d(null))) {
            SharedPreferences.Editor editorM1997a = this.f2074b.m1997a();
            editorM1997a.putString(this.f2083k, str);
            if (this.f2074b.f2831e) {
                return;
            }
            editorM1997a.apply();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f2079g;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence charSequenceMo1647e = mo1647e();
        if (!TextUtils.isEmpty(charSequenceMo1647e)) {
            sb.append(charSequenceMo1647e);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    /* renamed from: u */
    public boolean mo1645u() {
        return !mo1657f();
    }

    /* renamed from: v */
    public final boolean m1663v() {
        return (this.f2074b == null || !this.f2089q || TextUtils.isEmpty(this.f2083k)) ? false : true;
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0049b.m229b(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }
}
