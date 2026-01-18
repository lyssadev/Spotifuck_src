package p007E;

import android.animation.Animator;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.EditText;
import androidx.activity.C0530l;
import androidx.emoji2.text.C0566u;
import androidx.emoji2.text.C0567v;
import androidx.emoji2.text.C0569x;
import androidx.emoji2.text.InterfaceC0559n;
import androidx.fragment.app.AbstractComponentCallbacksC0606r;
import androidx.fragment.app.C0577H;
import androidx.fragment.app.C0587S;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xmlpull.v1.XmlPullParserException;
import p000A.C0001b;
import p000A.C0010k;
import p003C.RunnableC0015b;
import p008E0.AbstractC0079m;
import p008E0.C0081o;
import p009F.C0084c;
import p015J.AbstractC0116a;
import p015J.InterfaceC0117b;
import p017K.C0135h;
import p017K.RunnableC0128a;
import p018K0.C0146e;
import p019L.C0173j;
import p023N.AbstractC0193D;
import p023N.AbstractC0206Q;
import p023N.C0214Z;
import p023N.C0247q;
import p023N.C0256u0;
import p023N.C0260w0;
import p023N.InterfaceC0249r;
import p024N0.RunnableC0268B;
import p035T.InterfaceC0393j;
import p043X.C0427a;
import p043X.C0435i;
import p047Z0.AbstractC0469c;
import p057d.C0709a;
import p066g0.C0777u;
import p066g0.InterfaceC0769m;
import p067g1.C0783A;
import p067g1.C0785C;
import p067g1.C0799j;
import p067g1.C0815z;
import p068h.AbstractActivityC0841l;
import p068h.C0851v;
import p068h.LayoutInflaterFactory2C0819D;
import p074j0.AbstractC0912a0;
import p074j0.C0894I;
import p074j0.C0924g0;
import p074j0.C0930j0;
import p074j0.C0932k0;
import p082m.AbstractC0977a;
import p082m.C0981e;
import p084n.MenuC1020A;
import p084n.MenuC1035l;
import p096r.C1250e;
import p096r.C1256k;
import p101t.C1299d;
import p101t.C1301f;
import p111y.C1343b;
import p111y.C1350i;
import p111y.C1355n;

/* renamed from: E.j */
/* loaded from: classes.dex */
public final class C0057j implements InterfaceC0249r, InterfaceC0559n, InterfaceC0117b, InterfaceC0769m, InterfaceC0393j {

    /* renamed from: f */
    public final /* synthetic */ int f121f;

    /* renamed from: g */
    public Object f122g;

    /* renamed from: h */
    public Object f123h;

    public /* synthetic */ C0057j(int i, boolean z2) {
        this.f121f = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004e, code lost:
    
        if (r3.m2005f().f2950e == false) goto L33;
     */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m250A(C0785C c0785c, C0783A c0783a) {
        int i = c0785c.f2877c;
        if (i != 200 && i != 410 && i != 414 && i != 501 && i != 203 && i != 204) {
            if (i != 307) {
                if (i != 308 && i != 404 && i != 405) {
                    switch (i) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            if (c0785c.m2006g("Expires") == null) {
                if (c0785c.m2005f().f2948c == -1) {
                    if (!c0785c.m2005f().f2951f) {
                    }
                }
            }
        }
        if (c0785c.m2005f().f2947b) {
            return false;
        }
        C0799j c0799jM2020a = c0783a.f2862e;
        if (c0799jM2020a == null) {
            c0799jM2020a = C0799j.m2020a(c0783a.f2860c);
            c0783a.f2862e = c0799jM2020a;
        }
        return !c0799jM2020a.f2947b;
    }

    /* renamed from: y */
    public static int m251y(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    /* renamed from: B */
    public boolean m252B(View view) {
        C0894I c0894i = (C0894I) this.f122g;
        int iM2266d = c0894i.m2266d();
        int iM2265c = c0894i.m2265c();
        int iM2264b = c0894i.m2264b(view);
        int iM2263a = c0894i.m2263a(view);
        C0930j0 c0930j0 = (C0930j0) this.f123h;
        c0930j0.f3758b = iM2266d;
        c0930j0.f3759c = iM2265c;
        c0930j0.f3760d = iM2264b;
        c0930j0.f3761e = iM2263a;
        c0930j0.f3757a = 24579;
        return c0930j0.m2377a();
    }

    /* renamed from: C */
    public void m253C(int i, int i2) {
        int[] iArr = (int[]) this.f122g;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m281u(i3);
        int[] iArr2 = (int[]) this.f122g;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f122g, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f123h;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0924g0 c0924g0 = (C0924g0) ((ArrayList) this.f123h).get(size);
            int i4 = c0924g0.f3713a;
            if (i4 >= i) {
                c0924g0.f3713a = i4 + i2;
            }
        }
    }

    /* renamed from: D */
    public void m254D(int i, int i2) {
        int[] iArr = (int[]) this.f122g;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m281u(i3);
        int[] iArr2 = (int[]) this.f122g;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f122g;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f123h;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0924g0 c0924g0 = (C0924g0) ((ArrayList) this.f123h).get(size);
            int i4 = c0924g0.f3713a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f123h).remove(size);
                } else {
                    c0924g0.f3713a = i4 - i2;
                }
            }
        }
    }

    /* renamed from: E */
    public void m255E(AbstractC0977a abstractC0977a) {
        C0010k c0010k = (C0010k) this.f122g;
        ((ActionMode.Callback) c0010k.f23f).onDestroyActionMode(c0010k.m84f(abstractC0977a));
        LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D = (LayoutInflaterFactory2C0819D) this.f123h;
        if (layoutInflaterFactory2C0819D.f3110B != null) {
            layoutInflaterFactory2C0819D.f3150q.getDecorView().removeCallbacks(layoutInflaterFactory2C0819D.f3111C);
        }
        if (layoutInflaterFactory2C0819D.f3109A != null) {
            C0214Z c0214z = layoutInflaterFactory2C0819D.f3112D;
            if (c0214z != null) {
                c0214z.m700b();
            }
            C0214Z c0214zM666a = AbstractC0206Q.m666a(layoutInflaterFactory2C0819D.f3109A);
            c0214zM666a.m699a(0.0f);
            layoutInflaterFactory2C0819D.f3112D = c0214zM666a;
            c0214zM666a.m702d(new C0851v(2, this));
        }
        layoutInflaterFactory2C0819D.f3159z = null;
        ViewGroup viewGroup = layoutInflaterFactory2C0819D.f3115G;
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        AbstractC0193D.m594c(viewGroup);
        layoutInflaterFactory2C0819D.m2066H();
    }

    /* renamed from: F */
    public boolean m256F(AbstractC0977a abstractC0977a, MenuC1035l menuC1035l) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C0819D) this.f123h).f3115G;
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        AbstractC0193D.m594c(viewGroup);
        C0010k c0010k = (C0010k) this.f122g;
        C0981e c0981eM84f = c0010k.m84f(abstractC0977a);
        C1256k c1256k = (C1256k) c0010k.f24g;
        Menu menuC1020A = (Menu) c1256k.getOrDefault(menuC1035l, null);
        if (menuC1020A == null) {
            menuC1020A = new MenuC1020A((Context) c0010k.f26i, menuC1035l);
            c1256k.put(menuC1035l, menuC1020A);
        }
        return ((ActionMode.Callback) c0010k.f23f).onPrepareActionMode(c0981eM84f, menuC1020A);
    }

    /* renamed from: G */
    public void m257G(C0135h c0135h) {
        int i = c0135h.f359b;
        Handler handler = (Handler) this.f123h;
        C0001b c0001b = (C0001b) this.f122g;
        if (i == 0) {
            handler.post(new RunnableC0015b(c0001b, c0135h.f358a, 3));
        } else {
            handler.post(new RunnableC0128a(i, 0, c0001b));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x022e, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013f  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m258H(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        C1350i c1350iM3275d;
        char c2;
        C1355n c1355n = new C1355n();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    c1350iM3275d = null;
                } catch (IOException e) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e);
                } catch (XmlPullParserException e2) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e2);
                }
                while (eventType != 1) {
                    if (eventType != 0) {
                        char c3 = 3;
                        if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        c3 = 6;
                                        break;
                                    } else {
                                        c3 = 65535;
                                        break;
                                    }
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        c3 = 7;
                                        break;
                                    }
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        c3 = 1;
                                        break;
                                    }
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        c3 = 4;
                                        break;
                                    }
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        c3 = 5;
                                        break;
                                    }
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        c3 = 2;
                                        break;
                                    }
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        c3 = '\t';
                                        break;
                                    }
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        break;
                                    }
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        c3 = '\b';
                                        break;
                                    }
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        c3 = 0;
                                        break;
                                    }
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            switch (c3) {
                                case 0:
                                    c1350iM3275d = C1355n.m3275d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                case 1:
                                    c1350iM3275d = C1355n.m3275d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                case 2:
                                    c1350iM3275d = C1355n.m3275d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c1350iM3275d.f5556d.f5586a = true;
                                    break;
                                case 3:
                                    c1350iM3275d = C1355n.m3275d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c1350iM3275d.f5556d.f5601h0 = 1;
                                    break;
                                case 4:
                                    if (c1350iM3275d == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c1350iM3275d.f5554b.m3272a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 5:
                                    if (c1350iM3275d == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c1350iM3275d.f5557e.m3273a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 6:
                                    if (c1350iM3275d == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c1350iM3275d.f5556d.m3270a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 7:
                                    if (c1350iM3275d == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c1350iM3275d.f5555c.m3271a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case '\b':
                                case '\t':
                                    if (c1350iM3275d == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    C1343b.m3252a(context, xmlResourceParser, c1350iM3275d.f5558f);
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        c2 = 3;
                                        break;
                                    } else {
                                        c2 = 65535;
                                        break;
                                    }
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        c2 = 1;
                                        break;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        c2 = 2;
                                        break;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        c2 = 0;
                                        break;
                                    }
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            if (c2 == 0) {
                                ((SparseArray) this.f123h).put(identifier, c1355n);
                                return;
                            } else if (c2 == 1 || c2 == 2 || c2 == 3) {
                                c1355n.f5660c.put(Integer.valueOf(c1350iM3275d.f5553a), c1350iM3275d);
                                c1350iM3275d = null;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f123h).put(identifier, c1355n);
                return;
            }
        }
    }

    /* renamed from: I */
    public C0247q m259I(AbstractC0912a0 abstractC0912a0, int i) {
        C0932k0 c0932k0;
        C0247q c0247q;
        C1256k c1256k = (C1256k) this.f122g;
        int iM2970e = c1256k.m2970e(abstractC0912a0);
        if (iM2970e >= 0 && (c0932k0 = (C0932k0) c1256k.m2975j(iM2970e)) != null) {
            int i2 = c0932k0.f3764a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                c0932k0.f3764a = i3;
                if (i == 4) {
                    c0247q = c0932k0.f3765b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0247q = c0932k0.f3766c;
                }
                if ((i3 & 12) == 0) {
                    c1256k.m2974i(iM2970e);
                    c0932k0.f3764a = 0;
                    c0932k0.f3765b = null;
                    c0932k0.f3766c = null;
                    C0932k0.f3763d.mo584c(c0932k0);
                }
                return c0247q;
            }
        }
        return null;
    }

    /* renamed from: J */
    public void m260J(AbstractC0912a0 abstractC0912a0) {
        C0932k0 c0932k0 = (C0932k0) ((C1256k) this.f122g).getOrDefault(abstractC0912a0, null);
        if (c0932k0 == null) {
            return;
        }
        c0932k0.f3764a &= -2;
    }

    /* renamed from: K */
    public void m261K(AbstractC0912a0 abstractC0912a0) {
        C1250e c1250e = (C1250e) this.f123h;
        int iM2961g = c1250e.m2961g() - 1;
        while (true) {
            if (iM2961g < 0) {
                break;
            }
            if (abstractC0912a0 == c1250e.m2962h(iM2961g)) {
                Object[] objArr = c1250e.f4987c;
                Object obj = objArr[iM2961g];
                Object obj2 = C1250e.f4984e;
                if (obj != obj2) {
                    objArr[iM2961g] = obj2;
                    c1250e.f4985a = true;
                }
            } else {
                iM2961g--;
            }
        }
        C0932k0 c0932k0 = (C0932k0) ((C1256k) this.f122g).remove(abstractC0912a0);
        if (c0932k0 != null) {
            c0932k0.f3764a = 0;
            c0932k0.f3765b = null;
            c0932k0.f3766c = null;
            C0932k0.f3763d.mo584c(c0932k0);
        }
    }

    /* renamed from: L */
    public synchronized void m262L() {
        ((ArrayDeque) this.f122g).size();
        ((ArrayDeque) this.f123h).size();
    }

    /* renamed from: M */
    public void m263M(int i, Bundle bundle, Messenger messenger) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = 1;
        messageObtain.setData(bundle);
        messageObtain.replyTo = messenger;
        ((Messenger) this.f122g).send(messageObtain);
    }

    /* renamed from: N */
    public void m264N() {
        Object parcelable;
        Integer num;
        C0530l c0530l = (C0530l) this.f122g;
        c0530l.getClass();
        String str = (String) this.f123h;
        AbstractC0469c.m1102e("key", str);
        if (!c0530l.f1284d.contains(str) && (num = (Integer) c0530l.f1282b.remove(str)) != null) {
            c0530l.f1281a.remove(num);
        }
        c0530l.f1285e.remove(str);
        LinkedHashMap linkedHashMap = c0530l.f1286f;
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = c0530l.f1287g;
        if (bundle.containsKey(str)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = AbstractC0116a.m443a(bundle, str, C0709a.class);
            } else {
                parcelable = bundle.getParcelable(str);
                if (!C0709a.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C0709a) parcelable));
            bundle.remove(str);
        }
        if (c0530l.f1283c.get(str) != null) {
            throw new ClassCastException();
        }
    }

    @Override // p066g0.InterfaceC0769m
    /* renamed from: a */
    public void mo265a(Preference preference) {
        ((PreferenceGroup) this.f122g).f2104R = Integer.MAX_VALUE;
        C0777u c0777u = (C0777u) this.f123h;
        Handler handler = c0777u.f2819g;
        RunnableC0268B runnableC0268B = c0777u.f2820h;
        handler.removeCallbacks(runnableC0268B);
        handler.post(runnableC0268B);
    }

    /* renamed from: b */
    public void m266b(AbstractC0912a0 abstractC0912a0, C0247q c0247q) {
        C1256k c1256k = (C1256k) this.f122g;
        C0932k0 c0932k0M2378a = (C0932k0) c1256k.getOrDefault(abstractC0912a0, null);
        if (c0932k0M2378a == null) {
            c0932k0M2378a = C0932k0.m2378a();
            c1256k.put(abstractC0912a0, c0932k0M2378a);
        }
        c0932k0M2378a.f3766c = c0247q;
        c0932k0M2378a.f3764a |= 8;
    }

    @Override // androidx.emoji2.text.InterfaceC0559n
    /* renamed from: c */
    public boolean mo38c(CharSequence charSequence, int i, int i2, C0566u c0566u) {
        if ((c0566u.f1689c & 4) > 0) {
            return true;
        }
        if (((C0569x) this.f122g) == null) {
            this.f122g = new C0569x(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((C0146e) this.f123h).getClass();
        ((C0569x) this.f122g).setSpan(new C0567v(c0566u), i, i2, 33);
        return true;
    }

    /* renamed from: d */
    public void m267d(boolean z2) {
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = ((C0577H) this.f123h).f1745v;
        if (abstractComponentCallbacksC0606r != null) {
            abstractComponentCallbacksC0606r.m1590j().f1735l.m267d(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f122g).iterator();
        if (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: e */
    public void m268e(boolean z2) {
        C0577H c0577h = (C0577H) this.f123h;
        AbstractActivityC0841l abstractActivityC0841l = c0577h.f1743t.f1942g;
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = c0577h.f1745v;
        if (abstractComponentCallbacksC0606r != null) {
            abstractComponentCallbacksC0606r.m1590j().f1735l.m268e(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f122g).iterator();
        if (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: f */
    public void m269f(boolean z2) {
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = ((C0577H) this.f123h).f1745v;
        if (abstractComponentCallbacksC0606r != null) {
            abstractComponentCallbacksC0606r.m1590j().f1735l.m269f(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f122g).iterator();
        if (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: g */
    public void m270g(boolean z2) {
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = ((C0577H) this.f123h).f1745v;
        if (abstractComponentCallbacksC0606r != null) {
            abstractComponentCallbacksC0606r.m1590j().f1735l.m270g(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f122g).iterator();
        if (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    @Override // androidx.emoji2.text.InterfaceC0559n
    /* renamed from: h */
    public Object mo43h() {
        return (C0569x) this.f122g;
    }

    /* renamed from: i */
    public void m271i(boolean z2) {
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = ((C0577H) this.f123h).f1745v;
        if (abstractComponentCallbacksC0606r != null) {
            abstractComponentCallbacksC0606r.m1590j().f1735l.m271i(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f122g).iterator();
        if (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: j */
    public void m272j(boolean z2) {
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = ((C0577H) this.f123h).f1745v;
        if (abstractComponentCallbacksC0606r != null) {
            abstractComponentCallbacksC0606r.m1590j().f1735l.m272j(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f122g).iterator();
        if (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: k */
    public void m273k(boolean z2) {
        C0577H c0577h = (C0577H) this.f123h;
        AbstractActivityC0841l abstractActivityC0841l = c0577h.f1743t.f1942g;
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = c0577h.f1745v;
        if (abstractComponentCallbacksC0606r != null) {
            abstractComponentCallbacksC0606r.m1590j().f1735l.m273k(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f122g).iterator();
        if (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    @Override // p023N.InterfaceC0249r
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0260w0 mo47l(View view, C0260w0 c0260w0) {
        boolean z2;
        C0081o c0081o = (C0081o) this.f123h;
        int i = c0081o.f244a;
        C0173j c0173j = (C0173j) this.f122g;
        C0256u0 c0256u0 = c0260w0.f658a;
        C0084c c0084cMo774f = c0256u0.mo774f(7);
        C0084c c0084cMo774f2 = c0256u0.mo774f(32);
        int i2 = c0084cMo774f.f250b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c0173j.f511b;
        bottomSheetBehavior.f2347w = i2;
        boolean zM320e = AbstractC0079m.m320e(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z3 = bottomSheetBehavior.f2339o;
        if (z3) {
            int iM801a = c0260w0.m801a();
            bottomSheetBehavior.f2346v = iM801a;
            paddingBottom = iM801a + c0081o.f246c;
        }
        int i3 = c0081o.f245b;
        boolean z4 = bottomSheetBehavior.f2340p;
        int i4 = c0084cMo774f.f249a;
        if (z4) {
            paddingLeft = (zM320e ? i3 : i) + i4;
        }
        boolean z5 = bottomSheetBehavior.f2341q;
        int i5 = c0084cMo774f.f251c;
        if (z5) {
            if (!zM320e) {
                i = i3;
            }
            paddingRight = i + i5;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z6 = true;
        if (!bottomSheetBehavior.f2343s || marginLayoutParams.leftMargin == i4) {
            z2 = false;
        } else {
            marginLayoutParams.leftMargin = i4;
            z2 = true;
        }
        if (bottomSheetBehavior.f2344t && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z2 = true;
        }
        if (bottomSheetBehavior.f2345u) {
            int i6 = marginLayoutParams.topMargin;
            int i7 = c0084cMo774f.f250b;
            if (i6 != i7) {
                marginLayoutParams.topMargin = i7;
            } else {
                z6 = z2;
            }
        }
        if (z6) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z7 = c0173j.f510a;
        if (z7) {
            bottomSheetBehavior.f2337m = c0084cMo774f2.f252d;
        }
        if (z3 || z7) {
            bottomSheetBehavior.m1857I();
        }
        return c0260w0;
    }

    @Override // p015J.InterfaceC0117b
    /* renamed from: m */
    public void mo48m() {
        ((Animator) this.f122g).end();
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString((C0587S) this.f123h);
        }
    }

    /* renamed from: n */
    public void m274n(boolean z2) {
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = ((C0577H) this.f123h).f1745v;
        if (abstractComponentCallbacksC0606r != null) {
            abstractComponentCallbacksC0606r.m1590j().f1735l.m274n(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f122g).iterator();
        if (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: o */
    public void m275o(boolean z2) {
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = ((C0577H) this.f123h).f1745v;
        if (abstractComponentCallbacksC0606r != null) {
            abstractComponentCallbacksC0606r.m1590j().f1735l.m275o(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f122g).iterator();
        if (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: p */
    public void m276p(boolean z2) {
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = ((C0577H) this.f123h).f1745v;
        if (abstractComponentCallbacksC0606r != null) {
            abstractComponentCallbacksC0606r.m1590j().f1735l.m276p(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f122g).iterator();
        if (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: q */
    public void m277q(boolean z2) {
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = ((C0577H) this.f123h).f1745v;
        if (abstractComponentCallbacksC0606r != null) {
            abstractComponentCallbacksC0606r.m1590j().f1735l.m277q(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f122g).iterator();
        if (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: r */
    public void m278r(boolean z2) {
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = ((C0577H) this.f123h).f1745v;
        if (abstractComponentCallbacksC0606r != null) {
            abstractComponentCallbacksC0606r.m1590j().f1735l.m278r(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f122g).iterator();
        if (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: s */
    public void m279s(boolean z2) {
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = ((C0577H) this.f123h).f1745v;
        if (abstractComponentCallbacksC0606r != null) {
            abstractComponentCallbacksC0606r.m1590j().f1735l.m279s(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f122g).iterator();
        if (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: t */
    public void m280t(boolean z2) {
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = ((C0577H) this.f123h).f1745v;
        if (abstractComponentCallbacksC0606r != null) {
            abstractComponentCallbacksC0606r.m1590j().f1735l.m280t(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f122g).iterator();
        if (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public String toString() {
        switch (this.f121f) {
            case 3:
                return "Bounds{lower=" + ((C0084c) this.f122g) + " upper=" + ((C0084c) this.f123h) + "}";
            case 20:
                String str = "[ ";
                if (((C1301f) this.f122g) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((C1301f) this.f122g).f5151h[i] + " ";
                    }
                }
                return str + "] " + ((C1301f) this.f122g);
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public void m281u(int i) {
        int[] iArr = (int[]) this.f122g;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f122g = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f122g = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f122g;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* renamed from: v */
    public synchronized void m282v(C0815z c0815z) {
        ((ArrayDeque) this.f123h).add(c0815z);
    }

    /* renamed from: w */
    public View m283w(int i, int i2, int i3, int i4) {
        View viewM2294u;
        C0894I c0894i = (C0894I) this.f122g;
        int iM2266d = c0894i.m2266d();
        int iM2265c = c0894i.m2265c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (c0894i.f3580a) {
                case 0:
                    viewM2294u = c0894i.f3581b.m2294u(i);
                    break;
                default:
                    viewM2294u = c0894i.f3581b.m2294u(i);
                    break;
            }
            int iM2264b = c0894i.m2264b(viewM2294u);
            int iM2263a = c0894i.m2263a(viewM2294u);
            C0930j0 c0930j0 = (C0930j0) this.f123h;
            c0930j0.f3758b = iM2266d;
            c0930j0.f3759c = iM2265c;
            c0930j0.f3760d = iM2264b;
            c0930j0.f3761e = iM2263a;
            if (i3 != 0) {
                c0930j0.f3757a = i3;
                if (c0930j0.m2377a()) {
                    return viewM2294u;
                }
            }
            if (i4 != 0) {
                c0930j0.f3757a = i4;
                if (c0930j0.m2377a()) {
                    view = viewM2294u;
                }
            }
            i += i5;
        }
        return view;
    }

    /* renamed from: x */
    public void m284x(C0815z c0815z) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f123h;
        synchronized (this) {
            try {
                if (!arrayDeque.remove(c0815z)) {
                    throw new AssertionError("Call wasn't in-flight!");
                }
                m262L();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: z */
    public void m285z() {
        ((SparseIntArray) this.f122g).clear();
    }

    public /* synthetic */ C0057j(Object obj, Object obj2, int i) {
        this.f121f = i;
        this.f122g = obj;
        this.f123h = obj2;
    }

    public /* synthetic */ C0057j(Object obj, Object obj2, int i, boolean z2) {
        this.f121f = i;
        this.f123h = obj;
        this.f122g = obj2;
    }

    public C0057j(C1299d c1299d) {
        this.f121f = 20;
        this.f123h = c1299d;
    }

    public C0057j(C0577H c0577h) {
        this.f121f = 9;
        this.f122g = new CopyOnWriteArrayList();
        this.f123h = c0577h;
    }

    public C0057j(int i) {
        this.f121f = i;
        switch (i) {
            case 16:
                this.f122g = new SparseIntArray();
                this.f123h = new SparseIntArray();
                break;
            case 19:
                this.f122g = new C1256k();
                this.f123h = new C1250e();
                break;
            default:
                new ArrayDeque();
                this.f122g = new ArrayDeque();
                this.f123h = new ArrayDeque();
                break;
        }
    }

    public C0057j(C0894I c0894i) {
        this.f121f = 18;
        this.f122g = c0894i;
        C0930j0 c0930j0 = new C0930j0();
        c0930j0.f3757a = 0;
        this.f123h = c0930j0;
    }

    public C0057j(Animation animation) {
        this.f121f = 8;
        this.f122g = animation;
        this.f123h = null;
    }

    public C0057j(Animator animator) {
        this.f121f = 8;
        this.f122g = null;
        this.f123h = animator;
    }

    public C0057j(ArrayList arrayList, ArrayList arrayList2) {
        this.f121f = 0;
        int size = arrayList.size();
        this.f122g = new int[size];
        this.f123h = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f122g)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f123h)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public C0057j(int i, int i2) {
        this.f121f = 0;
        this.f122g = new int[]{i, i2};
        this.f123h = new float[]{0.0f, 1.0f};
    }

    public C0057j(int i, int i2, int i3) {
        this.f121f = 0;
        this.f122g = new int[]{i, i2, i3};
        this.f123h = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C0057j(EditText editText) {
        this.f121f = 4;
        this.f122g = editText;
        C0435i c0435i = new C0435i(editText);
        this.f123h = c0435i;
        editText.addTextChangedListener(c0435i);
        if (C0427a.f1078b == null) {
            synchronized (C0427a.f1077a) {
                try {
                    if (C0427a.f1078b == null) {
                        C0427a c0427a = new C0427a();
                        try {
                            C0427a.f1079c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C0427a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        C0427a.f1078b = c0427a;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(C0427a.f1078b);
    }
}
