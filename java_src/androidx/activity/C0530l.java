package androidx.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.C0614z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import p007E.C0057j;
import p015J.AbstractC0116a;
import p036T0.AbstractC0411g;
import p047Z0.AbstractC0469c;
import p057d.C0709a;
import p057d.C0710b;
import p061e1.C0737a;
import p061e1.C0739c;
import p061e1.C0741e;

/* renamed from: androidx.activity.l */
/* loaded from: classes.dex */
public final class C0530l {

    /* renamed from: a */
    public final LinkedHashMap f1281a = new LinkedHashMap();

    /* renamed from: b */
    public final LinkedHashMap f1282b = new LinkedHashMap();

    /* renamed from: c */
    public final LinkedHashMap f1283c = new LinkedHashMap();

    /* renamed from: d */
    public final ArrayList f1284d = new ArrayList();

    /* renamed from: e */
    public final transient LinkedHashMap f1285e = new LinkedHashMap();

    /* renamed from: f */
    public final LinkedHashMap f1286f = new LinkedHashMap();

    /* renamed from: g */
    public final Bundle f1287g = new Bundle();

    /* renamed from: a */
    public final boolean m1293a(int i, int i2, Intent intent) {
        String str = (String) this.f1281a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0710b c0710b = (C0710b) this.f1285e.get(str);
        if ((c0710b != null ? c0710b.f2660a : null) != null) {
            ArrayList arrayList = this.f1284d;
            if (arrayList.contains(str)) {
                c0710b.f2660a.m1599a(c0710b.f2661b.mo1051G(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f1286f.remove(str);
        this.f1287g.putParcelable(str, new C0709a(intent, i2));
        return true;
    }

    /* renamed from: b */
    public final C0057j m1294b(String str, AbstractC0411g abstractC0411g, C0614z c0614z) {
        Object parcelable;
        AbstractC0469c.m1102e("key", str);
        LinkedHashMap linkedHashMap = this.f1282b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            Iterator it2 = new C0737a(new C0739c(new C0741e(1))).iterator();
            while (it2.hasNext()) {
                Number number = (Number) it2.next();
                int iIntValue = number.intValue();
                LinkedHashMap linkedHashMap2 = this.f1281a;
                if (!linkedHashMap2.containsKey(Integer.valueOf(iIntValue))) {
                    int iIntValue2 = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(iIntValue2), str);
                    linkedHashMap.put(str, Integer.valueOf(iIntValue2));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.f1285e.put(str, new C0710b(c0614z, abstractC0411g));
        LinkedHashMap linkedHashMap3 = this.f1286f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            c0614z.m1599a(obj);
        }
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.f1287g;
        if (i >= 34) {
            parcelable = AbstractC0116a.m443a(bundle, str, C0709a.class);
        } else {
            parcelable = bundle.getParcelable(str);
            if (!C0709a.class.isInstance(parcelable)) {
                parcelable = null;
            }
        }
        C0709a c0709a = (C0709a) parcelable;
        if (c0709a != null) {
            bundle.remove(str);
            c0614z.m1599a(abstractC0411g.mo1051G(c0709a.f2659b, c0709a.f2658a));
        }
        return new C0057j(this, str, 10);
    }
}
