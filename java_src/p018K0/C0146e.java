package p018K0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.emoji2.text.C0567v;
import androidx.fragment.app.C0579J;
import androidx.lifecycle.AbstractC0627M;
import androidx.lifecycle.InterfaceC0629O;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import it.deviato.spotifuck.R;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p023N.C0257v;
import p043X.C0428b;
import p052b0.C0665c;
import p055c0.C0673a;
import p069h0.InterfaceC0860e;
import p084n.InterfaceC1046w;
import p084n.MenuC1035l;
import p085n0.AbstractC1081x;
import p085n0.AbstractC1083z;
import p091p0.AbstractC1230a;
import p094q0.AbstractC1241a;

/* renamed from: K0.e */
/* loaded from: classes.dex */
public class C0146e implements InterfaceC0629O, InterfaceC0860e, InterfaceC1046w {

    /* renamed from: g */
    public static C0146e f381g = null;

    /* renamed from: h */
    public static C0146e f382h = null;

    /* renamed from: i */
    public static C0146e f383i = null;

    /* renamed from: j */
    public static boolean f384j = true;

    /* renamed from: k */
    public static Method f385k = null;

    /* renamed from: l */
    public static boolean f386l = false;

    /* renamed from: m */
    public static Field f387m = null;

    /* renamed from: n */
    public static boolean f388n = false;

    /* renamed from: o */
    public static boolean f389o = true;

    /* renamed from: p */
    public static boolean f390p = true;

    /* renamed from: f */
    public final /* synthetic */ int f391f;

    public /* synthetic */ C0146e(int i) {
        this.f391f = i;
    }

    /* renamed from: a */
    public static C0146e m493a(Context context, int i) throws Resources.NotFoundException {
        AbstractC1230a.m2888h("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC1241a.f4949m);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        AbstractC1230a.m2871J(context, typedArrayObtainStyledAttributes, 4);
        AbstractC1230a.m2871J(context, typedArrayObtainStyledAttributes, 9);
        AbstractC1230a.m2871J(context, typedArrayObtainStyledAttributes, 7);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        C0152k.m523a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new C0142a(0)).m522a();
        typedArrayObtainStyledAttributes.recycle();
        C0146e c0146e = new C0146e(17);
        AbstractC1230a.m2890i(rect.left);
        AbstractC1230a.m2890i(rect.top);
        AbstractC1230a.m2890i(rect.right);
        AbstractC1230a.m2890i(rect.bottom);
        return c0146e;
    }

    /* renamed from: c */
    public static Path m494c(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(f2, f3);
        path.lineTo(f4, f5);
        return path;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:91:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m495i(C0428b c0428b, Editable editable, int i, int i2, boolean z2) {
        int iMin;
        if (editable == null || i < 0 || i2 < 0) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) {
            return false;
        }
        if (z2) {
            int iMax = Math.max(i, 0);
            int length = editable.length();
            if (selectionStart < 0 || length < selectionStart || iMax < 0) {
                selectionStart = -1;
                int iMax2 = Math.max(i2, 0);
                iMin = editable.length();
                if (selectionEnd < 0 && iMin >= selectionEnd && iMax2 >= 0) {
                    loop2: while (true) {
                        boolean z3 = false;
                        while (true) {
                            if (iMax2 == 0) {
                                iMin = selectionEnd;
                                break loop2;
                            }
                            if (selectionEnd >= iMin) {
                                if (z3) {
                                    break;
                                }
                            } else {
                                char cCharAt = editable.charAt(selectionEnd);
                                if (z3) {
                                    break;
                                }
                                if (!Character.isSurrogate(cCharAt)) {
                                    iMax2--;
                                    selectionEnd++;
                                } else {
                                    if (Character.isLowSurrogate(cCharAt)) {
                                        break loop2;
                                    }
                                    selectionEnd++;
                                    z3 = true;
                                }
                            }
                        }
                        iMax2--;
                        selectionEnd++;
                    }
                    iMin = -1;
                    return selectionStart == -1 ? false : false;
                }
                iMin = -1;
                if (selectionStart == -1 || iMin == -1) {
                }
            } else {
                loop0: while (true) {
                    boolean z4 = false;
                    while (true) {
                        if (iMax == 0) {
                            break loop0;
                        }
                        selectionStart--;
                        if (selectionStart >= 0) {
                            char cCharAt2 = editable.charAt(selectionStart);
                            if (z4) {
                                break;
                            }
                            if (!Character.isSurrogate(cCharAt2)) {
                                iMax--;
                            } else {
                                if (Character.isHighSurrogate(cCharAt2)) {
                                    break loop0;
                                }
                                z4 = true;
                            }
                        } else {
                            if (z4) {
                                break loop0;
                            }
                            selectionStart = 0;
                        }
                    }
                    iMax--;
                }
                selectionStart = -1;
                int iMax22 = Math.max(i2, 0);
                iMin = editable.length();
                if (selectionEnd < 0) {
                    iMin = -1;
                    if (selectionStart == -1) {
                    }
                }
            }
        } else {
            selectionStart = Math.max(selectionStart - i, 0);
            iMin = Math.min(selectionEnd + i2, editable.length());
        }
        C0567v[] c0567vArr = (C0567v[]) editable.getSpans(selectionStart, iMin, C0567v.class);
        if (c0567vArr == null || c0567vArr.length <= 0) {
            return false;
        }
        for (C0567v c0567v : c0567vArr) {
            int spanStart = editable.getSpanStart(c0567v);
            int spanEnd = editable.getSpanEnd(c0567v);
            selectionStart = Math.min(spanStart, selectionStart);
            iMin = Math.max(spanEnd, iMin);
        }
        int iMax3 = Math.max(selectionStart, 0);
        int iMin2 = Math.min(iMin, editable.length());
        c0428b.beginBatchEdit();
        editable.delete(iMax3, iMin2);
        c0428b.endBatchEdit();
        return true;
    }

    /* renamed from: d */
    public Signature[] mo498d(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // androidx.lifecycle.InterfaceC0629O
    /* renamed from: e */
    public AbstractC0627M mo40e(Class cls, C0665c c0665c) {
        switch (this.f391f) {
        }
        return mo42g(cls);
    }

    /* renamed from: f */
    public float mo499f(View view) {
        if (f384j) {
            try {
                return AbstractC1081x.m2665a(view);
            } catch (NoSuchMethodError unused) {
                f384j = false;
            }
        }
        return view.getAlpha();
    }

    @Override // androidx.lifecycle.InterfaceC0629O
    /* renamed from: g */
    public AbstractC0627M mo42g(Class cls) {
        switch (this.f391f) {
            case 15:
                return new C0579J(true);
            default:
                return new C0673a();
        }
    }

    @Override // p084n.InterfaceC1046w
    /* renamed from: h */
    public boolean mo500h(MenuC1035l menuC1035l) {
        return false;
    }

    /* renamed from: j */
    public boolean mo501j(CharSequence charSequence) {
        return false;
    }

    @Override // p069h0.InterfaceC0860e
    /* renamed from: k */
    public void mo46k(int i, Serializable serializable) {
        String str;
        switch (this.f391f) {
            case 20:
                break;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i == 6 || i == 7 || i == 8) {
                    Log.e("ProfileInstaller", str, (Throwable) serializable);
                    break;
                }
                break;
        }
    }

    /* renamed from: m */
    public CharSequence m502m(Preference preference) {
        switch (this.f391f) {
            case 18:
                EditTextPreference editTextPreference = (EditTextPreference) preference;
                return TextUtils.isEmpty(editTextPreference.f2052S) ? editTextPreference.f2073a.getString(R.string.not_set) : editTextPreference.f2052S;
            default:
                ListPreference listPreference = (ListPreference) preference;
                return TextUtils.isEmpty(listPreference.m1649x()) ? listPreference.f2073a.getString(R.string.not_set) : listPreference.m1649x();
        }
    }

    /* renamed from: n */
    public void mo503n(View view, int i, int i2, int i3, int i4) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!f386l) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                f385k = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f386l = true;
        }
        Method method = f385k;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: o */
    public void mo504o(View view, float f2) {
        if (f384j) {
            try {
                AbstractC1081x.m2666b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                f384j = false;
            }
        }
        view.setAlpha(f2);
    }

    /* renamed from: p */
    public void mo505p(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!f388n) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f387m = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f388n = true;
        }
        Field field = f387m;
        if (field != null) {
            try {
                f387m.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: q */
    public void mo506q(View view, Matrix matrix) {
        if (f389o) {
            try {
                AbstractC1083z.m2677b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f389o = false;
            }
        }
    }

    /* renamed from: r */
    public void mo507r(View view, Matrix matrix) {
        if (f390p) {
            try {
                AbstractC1083z.m2678c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f390p = false;
            }
        }
    }

    public C0146e(View view, int i) {
        this.f391f = i;
        switch (i) {
            case 4:
                if (Build.VERSION.SDK_INT < 30) {
                    new C0146e(view, 3);
                    break;
                } else {
                    new C0257v(view, 3);
                    break;
                }
        }
    }

    /* renamed from: l */
    private final void m496l(int i, Serializable serializable) {
    }

    @Override // p084n.InterfaceC1046w
    /* renamed from: b */
    public void mo497b(MenuC1035l menuC1035l, boolean z2) {
    }
}
