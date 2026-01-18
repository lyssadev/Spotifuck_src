package p030Q0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;
import p101t.AbstractC1300e;

/* renamed from: Q0.E */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0328E {
    /* renamed from: a */
    public static final void m931a(View view, int i) {
        int iM3116a = AbstractC1300e.m3116a(i);
        if (iM3116a == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    view.toString();
                    viewGroup.toString();
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (iM3116a == 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(view);
            }
            view.setVisibility(0);
        } else if (iM3116a == 2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(view);
            }
            view.setVisibility(8);
        } else {
            if (iM3116a != 3) {
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(view);
            }
            view.setVisibility(4);
        }
    }

    /* renamed from: b */
    public static int m932b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        throw new IllegalArgumentException(m935e("Unknown visibility ", i));
    }

    /* renamed from: c */
    public static int m933c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return m932b(view.getVisibility());
    }

    /* renamed from: d */
    public static /* synthetic */ int m934d(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            default:
                throw null;
        }
    }

    /* renamed from: e */
    public static String m935e(String str, int i) {
        return str + i;
    }

    /* renamed from: f */
    public static String m936f(String str, String str2) {
        return str + str2;
    }

    /* renamed from: g */
    public static String m937g(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* renamed from: h */
    public static /* synthetic */ void m938h(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    /* renamed from: i */
    public static /* synthetic */ String m939i(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }
}
