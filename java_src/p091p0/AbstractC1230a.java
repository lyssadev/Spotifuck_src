package p091p0;

import android.animation.TimeInterpolator;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.support.v4.media.session.C0513t;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.CompoundButton;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import it.deviato.spotifuck.R;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import p000A.AbstractC0000a;
import p003C.AbstractC0019f;
import p003C.AbstractC0020g;
import p005D.AbstractC0041b;
import p005D.AbstractC0042c;
import p006D0.C0047a;
import p007E.AbstractC0050c;
import p007E.AbstractC0059l;
import p007E.AbstractC0065r;
import p007E.C0054g;
import p007E.C0060m;
import p007E.C0061n;
import p009F.AbstractC0082a;
import p009F.C0087f;
import p010G.AbstractC0094a;
import p010G.AbstractC0095b;
import p010G.C0102i;
import p010G.InterfaceC0100g;
import p010G.InterfaceC0101h;
import p017K.C0138k;
import p018K0.C0145d;
import p018K0.C0146e;
import p018K0.C0147f;
import p018K0.C0148g;
import p018K0.C0150i;
import p018K0.C0162u;
import p019L.C0170g;
import p023N.AbstractC0195F;
import p023N.AbstractC0206Q;
import p023N.C0205P;
import p023N.InterfaceC0216a0;
import p023N.InterfaceC0235k;
import p027P.AbstractC0321a;
import p030Q0.AbstractC0328E;
import p035T.AbstractC0386c;
import p035T.AbstractC0387d;
import p035T.AbstractC0388e;
import p035T.AbstractC0396m;
import p035T.AbstractC0397n;
import p035T.AbstractC0398o;
import p035T.AbstractC0399p;
import p035T.ActionModeCallbackC0401r;
import p036T0.AbstractC0411g;
import p087o.C1085A;
import p087o.C1146d0;

/* renamed from: p0.a */
/* loaded from: classes.dex */
public abstract class AbstractC1230a implements InterfaceC0216a0 {

    /* renamed from: a */
    public static Method f4887a = null;

    /* renamed from: b */
    public static boolean f4888b = false;

    /* renamed from: c */
    public static Method f4889c = null;

    /* renamed from: d */
    public static boolean f4890d = false;

    /* renamed from: e */
    public static boolean f4891e = false;

    /* renamed from: f */
    public static Method f4892f = null;

    /* renamed from: g */
    public static boolean f4893g = false;

    /* renamed from: h */
    public static Field f4894h;

    /* renamed from: i */
    public static Field f4895i;

    /* renamed from: j */
    public static boolean f4896j;

    /* renamed from: k */
    public static Method f4897k;

    /* renamed from: l */
    public static boolean f4898l;

    /* renamed from: m */
    public static Field f4899m;

    /* renamed from: n */
    public static boolean f4900n;

    public AbstractC1230a() {
        new ConcurrentHashMap();
    }

    /* renamed from: A */
    public static C0087f[] m2856A(C0087f[] c0087fArr) {
        C0087f[] c0087fArr2 = new C0087f[c0087fArr.length];
        for (int i = 0; i < c0087fArr.length; i++) {
            c0087fArr2[i] = new C0087f(c0087fArr[i]);
        }
        return c0087fArr2;
    }

    /* renamed from: A0 */
    public static void m2857A0(C1085A c1085a, boolean z2) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractC0396m.m1001c(c1085a, z2);
            return;
        }
        if (!f4900n) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f4899m = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f4900n = true;
        }
        Field field = f4899m;
        if (field != null) {
            try {
                field.set(c1085a, Boolean.valueOf(z2));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: B */
    public static boolean m2858B(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = C0205P.f556d;
        C0205P c0205p = (C0205P) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (c0205p == null) {
            c0205p = new C0205P();
            c0205p.f557a = null;
            c0205p.f558b = null;
            c0205p.f559c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c0205p);
        }
        WeakReference weakReference2 = c0205p.f559c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        c0205p.f559c = new WeakReference(keyEvent);
        if (c0205p.f558b == null) {
            c0205p.f558b = new SparseArray();
        }
        SparseArray sparseArray = c0205p.f558b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    /* renamed from: B0 */
    public static void m2859B0(View view, C0148g c0148g) {
        C0047a c0047a = c0148g.f410f.f393b;
        if (c0047a == null || !c0047a.f87a) {
            return;
        }
        float fM603i = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            fM603i += AbstractC0195F.m603i((View) parent);
        }
        C0147f c0147f = c0148g.f410f;
        if (c0147f.f403l != fM603i) {
            c0147f.f403l = fM603i;
            c0148g.m520m();
        }
    }

    /* renamed from: C */
    public static boolean m2860C(InterfaceC0235k interfaceC0235k, View view, Window.Callback callback, KeyEvent keyEvent) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (interfaceC0235k == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return interfaceC0235k.mo110e(keyEvent);
        }
        if (!(callback instanceof Activity)) {
            if (!(callback instanceof Dialog)) {
                return (view != null && AbstractC0206Q.m667b(view, keyEvent)) || interfaceC0235k.mo110e(keyEvent);
            }
            Dialog dialog = (Dialog) callback;
            if (!f4893g) {
                try {
                    Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                    f4894h = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f4893g = true;
            }
            Field field = f4894h;
            if (field != null) {
                try {
                    onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                } catch (IllegalAccessException unused2) {
                }
            } else {
                onKeyListener = null;
            }
            if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            Window window = dialog.getWindow();
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (AbstractC0206Q.m667b(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
        }
        Activity activity = (Activity) callback;
        activity.onUserInteraction();
        Window window2 = activity.getWindow();
        if (window2.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                if (!f4891e) {
                    try {
                        f4892f = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused3) {
                    }
                    f4891e = true;
                }
                Method method = f4892f;
                if (method != null) {
                    try {
                        Object objInvoke = method.invoke(actionBar, keyEvent);
                        if (objInvoke != null) {
                            zBooleanValue = ((Boolean) objInvoke).booleanValue();
                        }
                    } catch (IllegalAccessException | InvocationTargetException unused4) {
                    }
                }
                if (zBooleanValue) {
                    return true;
                }
            }
        }
        if (window2.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window2.getDecorView();
        if (AbstractC0206Q.m667b(decorView2, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView2 != null ? decorView2.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: C0 */
    public static void m2861C0(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    /* renamed from: D0 */
    public static void m2862D0(Drawable drawable, int i) {
        AbstractC0094a.m362g(drawable, i);
    }

    /* renamed from: E */
    public static Drawable m2863E(CompoundButton compoundButton) throws NoSuchFieldException, SecurityException {
        if (Build.VERSION.SDK_INT >= 23) {
            return AbstractC0386c.m984a(compoundButton);
        }
        if (!f4896j) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f4895i = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f4896j = true;
        }
        Field field = f4895i;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException unused2) {
                f4895i = null;
            }
        }
        return null;
    }

    /* renamed from: E0 */
    public static void m2864E0(PopupWindow popupWindow, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractC0396m.m1002d(popupWindow, i);
            return;
        }
        if (!f4898l) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f4897k = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f4898l = true;
        }
        Method method = f4897k;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: F */
    public static int m2865F(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? AbstractC0041b.m217a(context, i) : context.getResources().getColor(i);
    }

    /* renamed from: G */
    public static int m2866G(Context context, int i, int i2) {
        Integer numValueOf;
        TypedValue typedValueM2901o0 = m2901o0(context, i);
        if (typedValueM2901o0 != null) {
            int i3 = typedValueM2901o0.resourceId;
            numValueOf = Integer.valueOf(i3 != 0 ? m2865F(context, i3) : typedValueM2901o0.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i2;
    }

    /* renamed from: G0 */
    public static void m2867G0(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0042c.m221b(context, intent);
        } else {
            context.startService(intent);
        }
    }

    /* renamed from: H */
    public static int m2868H(View view, int i) {
        Context context = view.getContext();
        TypedValue typedValueM2909s0 = m2909s0(view.getContext(), i, view.getClass().getCanonicalName());
        int i2 = typedValueM2909s0.resourceId;
        return i2 != 0 ? m2865F(context, i2) : typedValueM2909s0.data;
    }

    /* renamed from: H0 */
    public static ActionMode.Callback m2869H0(ActionMode.Callback callback) {
        return (!(callback instanceof ActionModeCallbackC0401r) || Build.VERSION.SDK_INT < 26) ? callback : ((ActionModeCallbackC0401r) callback).f1007a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r5.f126c == r8.hashCode()) goto L21;
     */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList m2870I(Context context, int i) throws Resources.NotFoundException {
        ColorStateList colorStateListM244a;
        ColorStateList colorStateList;
        C0060m c0060m;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        C0061n c0061n = new C0061n(resources, theme);
        synchronized (AbstractC0065r.f137c) {
            try {
                SparseArray sparseArray = (SparseArray) AbstractC0065r.f136b.get(c0061n);
                colorStateListM244a = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (c0060m = (C0060m) sparseArray.get(i)) == null) {
                    colorStateList = null;
                } else {
                    if (c0060m.f125b.equals(resources.getConfiguration())) {
                        if (theme != null || c0060m.f126c != 0) {
                            if (theme != null) {
                            }
                        }
                        colorStateList = c0060m.f124a;
                    }
                    sparseArray.remove(i);
                    colorStateList = null;
                }
            } finally {
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = AbstractC0065r.f135a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateListM244a = AbstractC0050c.m244a(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListM244a == null) {
            return Build.VERSION.SDK_INT >= 23 ? AbstractC0059l.m289b(resources, i, theme) : resources.getColorStateList(i);
        }
        AbstractC0065r.m291a(c0061n, i, colorStateListM244a, theme);
        return colorStateListM244a;
    }

    /* renamed from: J */
    public static ColorStateList m2871J(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListM2870I;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM2870I = m2870I(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM2870I;
    }

    /* renamed from: J0 */
    public static Drawable m2872J0(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 || (drawable instanceof InterfaceC0100g)) {
            return drawable;
        }
        C0102i c0102i = new C0102i();
        c0102i.f279i = c0102i.m379c();
        c0102i.m384h(drawable);
        C0102i.m377a();
        return c0102i;
    }

    /* renamed from: K */
    public static ColorStateList m2873K(Context context, C0513t c0513t, int i) {
        int resourceId;
        ColorStateList colorStateListM2870I;
        TypedArray typedArray = (TypedArray) c0513t.f1246c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM2870I = m2870I(context, resourceId)) == null) ? c0513t.m1239n(i) : colorStateListM2870I;
    }

    /* renamed from: K0 */
    public static ActionMode.Callback m2874K0(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof ActionModeCallbackC0401r) || callback == null) ? callback : new ActionModeCallbackC0401r(callback, textView);
    }

    /* renamed from: L */
    public static ColorStateList m2875L(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !AbstractC0000a.m23t(drawable)) {
            return null;
        }
        return AbstractC0000a.m7d(drawable).getColorStateList();
    }

    /* renamed from: N */
    public static float m2876N(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0388e.m987b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: O */
    public static Drawable m2877O(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableM1039n;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableM1039n = AbstractC0411g.m1039n(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableM1039n;
    }

    /* renamed from: R */
    public static int m2878R(Drawable drawable) throws NoSuchMethodException, SecurityException {
        if (Build.VERSION.SDK_INT >= 23) {
            return AbstractC0095b.m365a(drawable);
        }
        if (!f4890d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", null);
                f4889c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f4890d = true;
        }
        Method method = f4889c;
        if (method == null) {
            return 0;
        }
        try {
            return ((Integer) method.invoke(drawable, null)).intValue();
        } catch (Exception unused2) {
            f4889c = null;
            return 0;
        }
    }

    /* renamed from: S */
    public static float m2879S(String[] strArr, int i) throws NumberFormatException {
        float f2 = Float.parseFloat(strArr[i]);
        if (f2 >= 0.0f && f2 <= 1.0f) {
            return f2;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f2);
    }

    /* renamed from: Y */
    public static File m2880Y(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: Z */
    public static C0170g m2881Z(C1146d0 c1146d0) {
        int iM1003a;
        int iM1006d;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new C0170g(AbstractC0399p.m1014c(c1146d0));
        }
        TextPaint textPaint = new TextPaint(c1146d0.getPaint());
        if (i >= 23) {
            iM1003a = 1;
            iM1006d = 1;
        } else {
            iM1003a = 0;
            iM1006d = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (i >= 23) {
            iM1003a = AbstractC0397n.m1003a(c1146d0);
            iM1006d = AbstractC0397n.m1006d(c1146d0);
        }
        if (c1146d0.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (c1146d0.getInputType() & 15) != 3) {
            boolean z2 = c1146d0.getLayoutDirection() == 1;
            switch (c1146d0.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z2) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(AbstractC0399p.m1013b(AbstractC0398o.m1011a(c1146d0.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new C0170g(textPaint, textDirectionHeuristic, iM1003a, iM1006d);
    }

    /* renamed from: a0 */
    public static boolean m2882a0(int i) {
        if (i != 0) {
            ThreadLocal threadLocal = AbstractC0082a.f247a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int iRed = Color.red(i);
            int iGreen = Color.green(i);
            int iBlue = Color.blue(i);
            if (dArr.length != 3) {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
            double d2 = iRed / 255.0d;
            double dPow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double d3 = iGreen / 255.0d;
            double dPow2 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            double d4 = iBlue / 255.0d;
            double dPow3 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
            dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
            double d5 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
            dArr[1] = d5;
            dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
            if (d5 / 100.0d > 0.5d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b0 */
    public static boolean m2883b0(EditText editText) {
        return editText.getInputType() != 0;
    }

    /* renamed from: d */
    public static void m2884d(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = m2872J0(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                AbstractC0094a.m363h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                AbstractC0094a.m363h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                AbstractC0094a.m364i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: d0 */
    public static boolean m2885d0(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* renamed from: e0 */
    public static boolean m2886e0(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    /* renamed from: g */
    public static boolean m2887g(C0087f[] c0087fArr, C0087f[] c0087fArr2) {
        if (c0087fArr == null || c0087fArr2 == null || c0087fArr.length != c0087fArr2.length) {
            return false;
        }
        for (int i = 0; i < c0087fArr.length; i++) {
            C0087f c0087f = c0087fArr[i];
            char c2 = c0087f.f254a;
            C0087f c0087f2 = c0087fArr2[i];
            if (c2 != c0087f2.f254a || c0087f.f255b.length != c0087f2.f255b.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static void m2888h(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: h0 */
    public static int m2889h0(int i, int i2, float f2) {
        return AbstractC0082a.m324b(AbstractC0082a.m326d(i2, Math.round(Color.alpha(i2) * f2)), i);
    }

    /* renamed from: i */
    public static void m2890i(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: i0 */
    public static Typeface m2891i0(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, m2895l(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    /* renamed from: j */
    public static void m2892j(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: j0 */
    public static MappedByteBuffer m2893j0(Context context, Uri uri) throws IOException {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m2894k(Context context, String str) {
        int iM107a;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        int i = Build.VERSION.SDK_INT;
        String strM106d = i >= 23 ? AbstractC0019f.m106d(str) : null;
        if (strM106d != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int iMyUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            int iM105c = 1;
            if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName)) {
                if (i >= 29) {
                    AppOpsManager appOpsManagerM109c = AbstractC0020g.m109c(context);
                    iM107a = AbstractC0020g.m107a(appOpsManagerM109c, strM106d, Binder.getCallingUid(), packageName);
                    if (iM107a == 0) {
                        iM107a = AbstractC0020g.m107a(appOpsManagerM109c, strM106d, iMyUid, AbstractC0020g.m108b(context));
                    }
                    if (iM107a != 0) {
                        return -2;
                    }
                } else if (i >= 23) {
                    iM105c = AbstractC0019f.m105c((AppOpsManager) AbstractC0019f.m103a(context, AppOpsManager.class), strM106d, packageName);
                }
            } else if (i >= 23) {
                iM105c = AbstractC0019f.m105c((AppOpsManager) AbstractC0019f.m103a(context, AppOpsManager.class), strM106d, packageName);
            }
            iM107a = iM105c;
            if (iM107a != 0) {
            }
        }
        return 0;
    }

    /* renamed from: l */
    public static int m2895l(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public static void m2896m(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            m2896m(((InsetDrawable) drawable).getDrawable());
            return;
        }
        if (drawable instanceof InterfaceC0101h) {
            m2896m(((C0102i) ((InterfaceC0101h) drawable)).f281k);
            return;
        }
        if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
            return;
        }
        int childCount = drawableContainerState.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Drawable child = drawableContainerState.getChild(i);
            if (child != null) {
                m2896m(child);
            }
        }
    }

    /* renamed from: m0 */
    public static float m2897m0(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0388e.m988c(edgeEffect, f2, f3);
        }
        AbstractC0387d.m985a(edgeEffect, f2, f3);
        return f2;
    }

    /* renamed from: n */
    public static void m2898n(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: n0 */
    public static void m2899n0(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = m2872J0(drawable).mutate();
        AbstractC0094a.m363h(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    /* renamed from: o */
    public static ImageView.ScaleType m2900o(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    /* renamed from: o0 */
    public static TypedValue m2901o0(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: p */
    public static float[] m2902p(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* renamed from: p0 */
    public static boolean m2903p0(Context context, int i, boolean z2) {
        TypedValue typedValueM2901o0 = m2901o0(context, i);
        return (typedValueM2901o0 == null || typedValueM2901o0.type != 18) ? z2 : typedValueM2901o0.data != 0;
    }

    /* renamed from: q */
    public static boolean m2904q(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                boolean zM2906r = m2906r(file, inputStreamOpenRawResource);
                m2898n(inputStreamOpenRawResource);
                return zM2906r;
            } catch (Throwable th) {
                th = th;
                m2898n(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    /* renamed from: q0 */
    public static int m2905q0(Context context, int i, int i2) {
        TypedValue typedValueM2901o0 = m2901o0(context, i);
        return (typedValueM2901o0 == null || typedValueM2901o0.type != 16) ? i2 : typedValueM2901o0.data;
    }

    /* renamed from: r */
    public static boolean m2906r(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    m2898n(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            m2898n(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            m2898n(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    /* renamed from: r0 */
    public static TimeInterpolator m2907r0(Context context, int i, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!m2886e0(strValueOf, "cubic-bezier") && !m2886e0(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!m2886e0(strValueOf, "cubic-bezier")) {
            if (m2886e0(strValueOf, "path")) {
                return AbstractC0321a.m922c(m2914y(strValueOf.substring(5, strValueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
        if (strArrSplit.length == 4) {
            return AbstractC0321a.m921b(m2879S(strArrSplit, 0), m2879S(strArrSplit, 1), m2879S(strArrSplit, 2), m2879S(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    /* renamed from: s */
    public static AbstractC1230a m2908s(int i) {
        return i != 0 ? i != 1 ? new C0150i() : new C0145d() : new C0150i();
    }

    /* renamed from: s0 */
    public static TypedValue m2909s0(Context context, int i, String str) {
        TypedValue typedValueM2901o0 = m2901o0(context, i);
        if (typedValueM2901o0 != null) {
            return typedValueM2901o0;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    /* renamed from: v0 */
    public static void m2910v0(TextView textView, int i) {
        m2890i(i);
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC0399p.m1015d(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: w0 */
    public static void m2911w0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = onLongClickListener != null;
        boolean z3 = zHasOnClickListeners || z2;
        checkableImageButton.setFocusable(z3);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        checkableImageButton.setImportantForAccessibility(z3 ? 1 : 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098 A[Catch: NumberFormatException -> 0x00ac, LOOP:3: B:25:0x006a->B:44:0x0098, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009e A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3 A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0097 A[SYNTHETIC] */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0087f[] m2912x(String str) {
        int i;
        String strTrim;
        float[] fArrM2902p;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i3 < str.length()) {
            while (i3 < str.length()) {
                char cCharAt = str.charAt(i3);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    }
                    i3++;
                }
                if (cCharAt == 'e' || cCharAt == 'E') {
                    i3++;
                } else {
                    strTrim = str.substring(i4, i3).trim();
                    if (!strTrim.isEmpty()) {
                        if (strTrim.charAt(i2) == 'z' || strTrim.charAt(i2) == 'Z') {
                            fArrM2902p = new float[i2];
                        } else {
                            try {
                                float[] fArr = new float[strTrim.length()];
                                int length = strTrim.length();
                                int i5 = 1;
                                int i6 = 0;
                                while (i5 < length) {
                                    boolean z2 = false;
                                    boolean z3 = false;
                                    boolean z4 = false;
                                    boolean z5 = false;
                                    for (int i7 = i5; i7 < strTrim.length(); i7++) {
                                        char cCharAt2 = strTrim.charAt(i7);
                                        if (cCharAt2 == ' ') {
                                            z2 = false;
                                            z4 = true;
                                            if (z4) {
                                            }
                                        } else {
                                            if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i7 != i5 && !z2) {
                                                            z2 = false;
                                                            z4 = true;
                                                            z5 = true;
                                                            break;
                                                        }
                                                        z2 = false;
                                                        break;
                                                    case '.':
                                                        if (z3) {
                                                            z2 = false;
                                                            z4 = true;
                                                            z5 = true;
                                                            break;
                                                        } else {
                                                            z2 = false;
                                                            z3 = true;
                                                            break;
                                                        }
                                                    default:
                                                        z2 = false;
                                                        break;
                                                }
                                            } else {
                                                z2 = true;
                                            }
                                            if (z4) {
                                            }
                                        }
                                        if (i5 < i7) {
                                            fArr[i6] = Float.parseFloat(strTrim.substring(i5, i7));
                                            i6++;
                                        }
                                        i5 = !z5 ? i7 : i7 + 1;
                                    }
                                    if (i5 < i7) {
                                    }
                                    if (!z5) {
                                    }
                                }
                                fArrM2902p = m2902p(fArr, i6);
                                i2 = 0;
                            } catch (NumberFormatException e) {
                                throw new RuntimeException(AbstractC0328E.m937g("error in parsing \"", strTrim, "\""), e);
                            }
                        }
                        arrayList.add(new C0087f(strTrim.charAt(i2), fArrM2902p));
                    }
                    i4 = i3;
                    i3++;
                    i2 = 0;
                }
            }
            strTrim = str.substring(i4, i3).trim();
            if (!strTrim.isEmpty()) {
            }
            i4 = i3;
            i3++;
            i2 = 0;
        }
        if (i3 - i4 != 1 || i4 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new C0087f(str.charAt(i4), new float[0]));
        }
        return (C0087f[]) arrayList.toArray(new C0087f[i]);
    }

    /* renamed from: x0 */
    public static void m2913x0(TextView textView, int i) {
        m2890i(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: y */
    public static Path m2914y(String str) {
        Path path = new Path();
        try {
            C0087f.m334b(m2912x(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(str), e);
        }
    }

    /* renamed from: y0 */
    public static boolean m2915y0(Drawable drawable, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 23) {
            return AbstractC0095b.m366b(drawable, i);
        }
        if (!f4888b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f4887a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f4888b = true;
        }
        Method method = f4887a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i));
                return true;
            } catch (Exception unused2) {
                f4887a = null;
            }
        }
        return false;
    }

    /* renamed from: z */
    public static Drawable m2916z(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        boolean z2 = Build.VERSION.SDK_INT < 23;
        if (drawable == null) {
            return null;
        }
        if (colorStateList == null) {
            if (!z2) {
                return drawable;
            }
            drawable.mutate();
            return drawable;
        }
        Drawable drawableMutate = m2872J0(drawable).mutate();
        if (mode == null) {
            return drawableMutate;
        }
        AbstractC0094a.m364i(drawableMutate, mode);
        return drawableMutate;
    }

    /* renamed from: z0 */
    public static void m2917z0(TextView textView, int i) {
        m2890i(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    /* renamed from: D */
    public C0138k mo354D(int i, C0138k[] c0138kArr) {
        new C0146e(1);
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z2 = (i & 2) != 0;
        C0138k c0138k = null;
        int i3 = Integer.MAX_VALUE;
        for (C0138k c0138k2 : c0138kArr) {
            int iAbs = (Math.abs(c0138k2.f368c - i2) * 2) + (c0138k2.f369d == z2 ? 0 : 1);
            if (c0138k == null || i3 > iAbs) {
                c0138k = c0138k2;
                i3 = iAbs;
            }
        }
        return c0138k;
    }

    /* renamed from: F0 */
    public abstract boolean mo559F0(View view, float f2);

    /* renamed from: I0 */
    public abstract void mo560I0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    /* renamed from: M */
    public abstract void mo492M(C0162u c0162u, float f2, float f3);

    /* renamed from: P */
    public abstract int mo561P();

    /* renamed from: Q */
    public abstract int mo562Q();

    /* renamed from: T */
    public abstract int mo563T();

    /* renamed from: U */
    public abstract int mo564U();

    /* renamed from: V */
    public abstract int mo565V(View view);

    /* renamed from: W */
    public abstract int mo566W(CoordinatorLayout coordinatorLayout);

    /* renamed from: X */
    public abstract int mo567X();

    /* renamed from: c0 */
    public abstract boolean mo568c0(float f2);

    /* renamed from: e */
    public abstract int mo569e(ViewGroup.MarginLayoutParams marginLayoutParams);

    /* renamed from: f */
    public abstract float mo570f(int i);

    /* renamed from: f0 */
    public abstract boolean mo571f0(View view);

    /* renamed from: g0 */
    public abstract boolean mo572g0(float f2, float f3);

    /* renamed from: k0 */
    public abstract void mo313k0(int i);

    /* renamed from: l0 */
    public abstract void mo314l0(Typeface typeface, boolean z2);

    /* renamed from: t */
    public abstract Typeface mo339t(Context context, C0054g c0054g, Resources resources, int i);

    /* renamed from: u */
    public abstract Typeface mo340u(Context context, C0138k[] c0138kArr, int i);

    /* renamed from: v */
    public Typeface mo355v(Context context, InputStream inputStream) {
        File fileM2880Y = m2880Y(context);
        if (fileM2880Y == null) {
            return null;
        }
        try {
            if (m2906r(fileM2880Y, inputStream)) {
                return Typeface.createFromFile(fileM2880Y.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM2880Y.delete();
        }
    }

    /* renamed from: w */
    public Typeface mo351w(Context context, Resources resources, int i, String str, int i2) {
        File fileM2880Y = m2880Y(context);
        if (fileM2880Y == null) {
            return null;
        }
        try {
            if (m2904q(fileM2880Y, resources, i)) {
                return Typeface.createFromFile(fileM2880Y.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM2880Y.delete();
        }
    }

    /* renamed from: t0 */
    public void mo588t0(boolean z2) {
    }

    /* renamed from: u0 */
    public void mo589u0(boolean z2) {
    }

    @Override // p023N.InterfaceC0216a0
    /* renamed from: b */
    public void mo705b() {
    }

    @Override // p023N.InterfaceC0216a0
    /* renamed from: c */
    public void mo706c() {
    }
}
