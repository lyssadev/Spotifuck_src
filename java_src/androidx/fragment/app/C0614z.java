package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import p000A.C0010k;
import p057d.C0709a;

/* renamed from: androidx.fragment.app.z */
/* loaded from: classes.dex */
public final class C0614z {

    /* renamed from: a */
    public final /* synthetic */ int f1956a;

    /* renamed from: b */
    public final /* synthetic */ C0577H f1957b;

    public /* synthetic */ C0614z(C0577H c0577h, int i) {
        this.f1956a = i;
        this.f1957b = c0577h;
    }

    /* renamed from: a */
    public final void m1599a(Object obj) {
        switch (this.f1956a) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                C0577H c0577h = this.f1957b;
                C0574E c0574e = (C0574E) c0577h.f1713C.pollFirst();
                if (c0574e == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    C0010k c0010k = c0577h.f1726c;
                    String str = c0574e.f1702a;
                    if (c0010k.m83e(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
            case 1:
                C0709a c0709a = (C0709a) obj;
                C0577H c0577h2 = this.f1957b;
                C0574E c0574e2 = (C0574E) c0577h2.f1713C.pollFirst();
                if (c0574e2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    String str2 = c0574e2.f1702a;
                    AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606rM83e = c0577h2.f1726c.m83e(str2);
                    if (abstractComponentCallbacksC0606rM83e == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        int i2 = c0709a.f2658a;
                        if (Log.isLoggable("FragmentManager", 2)) {
                            abstractComponentCallbacksC0606rM83e.toString();
                            Objects.toString(c0709a.f2659b);
                            break;
                        }
                    }
                }
                break;
            default:
                C0709a c0709a2 = (C0709a) obj;
                C0577H c0577h3 = this.f1957b;
                C0574E c0574e3 = (C0574E) c0577h3.f1713C.pollFirst();
                if (c0574e3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    String str3 = c0574e3.f1702a;
                    AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606rM83e2 = c0577h3.f1726c.m83e(str3);
                    if (abstractComponentCallbacksC0606rM83e2 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        int i3 = c0709a2.f2658a;
                        if (Log.isLoggable("FragmentManager", 2)) {
                            abstractComponentCallbacksC0606rM83e2.toString();
                            Objects.toString(c0709a2.f2659b);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
