package androidx.fragment.app;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import p034S0.C0381a;
import p036T0.AbstractC0411g;
import p036T0.AbstractC0412h;
import p036T0.C0409e;
import p057d.C0709a;

/* renamed from: androidx.fragment.app.D */
/* loaded from: classes.dex */
public final class C0573D extends AbstractC0411g {

    /* renamed from: l */
    public final /* synthetic */ int f1701l;

    public /* synthetic */ C0573D(int i) {
        this.f1701l = i;
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: G */
    public final Object mo1051G(Intent intent, int i) {
        switch (this.f1701l) {
            case 0:
                return new C0709a(intent, i);
            case 1:
                C0409e c0409e = C0409e.f1019a;
                if (i != -1 || intent == null) {
                    return c0409e;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return c0409e;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i2 == 0));
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : stringArrayExtra) {
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                Iterator it3 = arrayList.iterator();
                ArrayList arrayList3 = new ArrayList(Math.min(arrayList2.size(), arrayList.size()));
                while (it2.hasNext() && it3.hasNext()) {
                    arrayList3.add(new C0381a(it2.next(), it3.next()));
                }
                return AbstractC0412h.m1063W(arrayList3);
            default:
                return new C0709a(intent, i);
        }
    }
}
