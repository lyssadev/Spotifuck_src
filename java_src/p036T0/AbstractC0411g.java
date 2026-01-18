package p036T0;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Trace;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.emoji2.text.AbstractC0552g;
import androidx.emoji2.text.C0548c;
import androidx.emoji2.text.C0561p;
import androidx.emoji2.text.C0562q;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p000A.C0010k;
import p017K.C0132e;
import p018K0.C0146e;
import p041W.C0424b;
import p047Z0.AbstractC0469c;
import p047Z0.InterfaceC0467a;
import p059d1.InterfaceC0734b;
import p067g1.C0810u;
import p070h1.AbstractC0869c;
import p074j0.AbstractC0896K;
import p074j0.C0908X;
import p085n0.AbstractC1079v;
import p087o.AbstractC1156g1;
import p087o.C1116P0;
import p087o.ViewOnLongClickListenerC1162i1;
import p091p0.AbstractC1230a;

/* renamed from: T0.g */
/* loaded from: classes.dex */
public abstract class AbstractC0411g {

    /* renamed from: a */
    public static Field f1021a = null;

    /* renamed from: b */
    public static boolean f1022b = false;

    /* renamed from: c */
    public static Class f1023c = null;

    /* renamed from: d */
    public static boolean f1024d = false;

    /* renamed from: e */
    public static Field f1025e = null;

    /* renamed from: f */
    public static boolean f1026f = false;

    /* renamed from: g */
    public static Field f1027g = null;

    /* renamed from: h */
    public static boolean f1028h = false;

    /* renamed from: i */
    public static long f1029i = 0;

    /* renamed from: j */
    public static Method f1030j = null;

    /* renamed from: k */
    public static boolean f1031k = true;

    /* renamed from: H */
    public static boolean m1023H(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* renamed from: I */
    public static C0424b m1024I(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j2;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j2 = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j2 = byteBufferDuplicate.getInt() & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j2 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j2 - byteBufferDuplicate.position())));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j3 = byteBufferDuplicate.getInt() & 4294967295L;
            for (int i4 = 0; i4 < j3; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j4 = byteBufferDuplicate.getInt() & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j4 + j2));
                    C0424b c0424b = new C0424b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    c0424b.f551d = byteBufferDuplicate;
                    c0424b.f548a = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    c0424b.f549b = i6;
                    c0424b.f550c = ((ByteBuffer) c0424b.f551d).getShort(i6);
                    return c0424b;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* renamed from: J */
    public static String m1025J(C0810u c0810u) {
        int length = c0810u.f3022a.length() + 3;
        String str = c0810u.f3029h;
        int iIndexOf = str.indexOf(47, length);
        String strSubstring = str.substring(iIndexOf, AbstractC0869c.m2185h(str, iIndexOf, str.length(), "?#"));
        String strM2050e = c0810u.m2050e();
        if (strM2050e == null) {
            return strSubstring;
        }
        return strSubstring + '?' + strM2050e;
    }

    /* renamed from: N */
    public static void m1026N(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1156g1.m2782a(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC1162i1 viewOnLongClickListenerC1162i1 = ViewOnLongClickListenerC1162i1.f4640p;
        if (viewOnLongClickListenerC1162i1 != null && viewOnLongClickListenerC1162i1.f4642f == view) {
            ViewOnLongClickListenerC1162i1.m2794b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC1162i1(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC1162i1 viewOnLongClickListenerC1162i12 = ViewOnLongClickListenerC1162i1.f4641q;
        if (viewOnLongClickListenerC1162i12 != null && viewOnLongClickListenerC1162i12.f4642f == view) {
            viewOnLongClickListenerC1162i12.m2795a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* renamed from: Q */
    public static void m1027Q(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC1079v.m2662b(viewGroup, z2);
        } else if (f1031k) {
            try {
                AbstractC1079v.m2662b(viewGroup, z2);
            } catch (NoSuchMethodError unused) {
                f1031k = false;
            }
        }
    }

    /* renamed from: R */
    public static int m1028R(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: U */
    public static void m1029U(Parcel parcel, Parcelable parcelable, int i) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i);
        }
    }

    /* renamed from: a */
    public static Object m1030a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* renamed from: b */
    public static Object m1031b(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m1032c(int i, Rect rect, Rect rect2, Rect rect3) {
        int i2;
        int i3;
        boolean zM1033d = m1033d(i, rect, rect2);
        if (m1033d(i, rect, rect3) || !zM1033d) {
            return false;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    if (rect.bottom <= rect3.top) {
                        if (i != 17 && i != 66) {
                            int iM1045x = m1045x(i, rect, rect2);
                            if (i == 17) {
                                i2 = rect.left;
                                i3 = rect3.left;
                            } else if (i == 33) {
                                i2 = rect.top;
                                i3 = rect3.top;
                            } else if (i == 66) {
                                i2 = rect3.right;
                                i3 = rect.right;
                            } else {
                                if (i != 130) {
                                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                }
                                i2 = rect3.bottom;
                                i3 = rect.bottom;
                            }
                            return iM1045x < Math.max(1, i2 - i3);
                        }
                    }
                } else if (rect.right <= rect3.left) {
                }
            } else if (rect.top >= rect3.bottom) {
            }
        } else if (rect.left >= rect3.right) {
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m1033d(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* renamed from: i */
    public static int m1034i(C0908X c0908x, AbstractC0552g abstractC0552g, View view, View view2, AbstractC0896K abstractC0896K, boolean z2) {
        if (abstractC0896K.m2296v() == 0 || c0908x.m2313b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(AbstractC0896K.m2268H(view) - AbstractC0896K.m2268H(view2)) + 1;
        }
        return Math.min(abstractC0552g.mo1431l(), abstractC0552g.mo1421b(view2) - abstractC0552g.mo1424e(view));
    }

    /* renamed from: j */
    public static int m1035j(C0908X c0908x, AbstractC0552g abstractC0552g, View view, View view2, AbstractC0896K abstractC0896K, boolean z2, boolean z3) {
        if (abstractC0896K.m2296v() == 0 || c0908x.m2313b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z3 ? Math.max(0, (c0908x.m2313b() - Math.max(AbstractC0896K.m2268H(view), AbstractC0896K.m2268H(view2))) - 1) : Math.max(0, Math.min(AbstractC0896K.m2268H(view), AbstractC0896K.m2268H(view2)));
        if (z2) {
            return Math.round((iMax * (Math.abs(abstractC0552g.mo1421b(view2) - abstractC0552g.mo1424e(view)) / (Math.abs(AbstractC0896K.m2268H(view) - AbstractC0896K.m2268H(view2)) + 1))) + (abstractC0552g.mo1430k() - abstractC0552g.mo1424e(view)));
        }
        return iMax;
    }

    /* renamed from: k */
    public static int m1036k(C0908X c0908x, AbstractC0552g abstractC0552g, View view, View view2, AbstractC0896K abstractC0896K, boolean z2) {
        if (abstractC0896K.m2296v() == 0 || c0908x.m2313b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return c0908x.m2313b();
        }
        return (int) (((abstractC0552g.mo1421b(view2) - abstractC0552g.mo1424e(view)) / (Math.abs(AbstractC0896K.m2268H(view) - AbstractC0896K.m2268H(view2)) + 1)) * c0908x.m2313b());
    }

    /* renamed from: l */
    public static C0562q m1037l(Context context) {
        ProviderInfo providerInfo;
        C0132e c0132e;
        ApplicationInfo applicationInfo;
        C0146e c0548c = Build.VERSION.SDK_INT >= 28 ? new C0548c(10) : new C0146e(10);
        PackageManager packageManager = context.getPackageManager();
        AbstractC1230a.m2892j("Package manager required to locate emoji font provider", packageManager);
        Iterator<ResolveInfo> it2 = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it2.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it2.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            c0132e = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrMo498d = c0548c.mo498d(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrMo498d) {
                    arrayList.add(signature.toByteArray());
                }
                c0132e = new C0132e(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
            }
        }
        if (c0132e == null) {
            return null;
        }
        return new C0562q(new C0561p(context, c0132e));
    }

    /* renamed from: m */
    public static void m1038m(Object obj) throws NoSuchFieldException, SecurityException {
        LongSparseArray longSparseArray;
        if (!f1024d) {
            try {
                f1023c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f1024d = true;
        }
        Class cls = f1023c;
        if (cls == null) {
            return;
        }
        if (!f1026f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f1025e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            f1026f = true;
        }
        Field field = f1025e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    /* renamed from: n */
    public static Drawable m1039n(Context context, int i) {
        return C1116P0.m2724d().m2731f(context, i);
    }

    /* renamed from: o */
    public static Set m1040o() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.emptySet();
            }
            Set set = (Set) objInvoke;
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                if (!(it2.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: q */
    public static final Class m1041q(InterfaceC0734b interfaceC0734b) {
        AbstractC0469c.m1102e("<this>", interfaceC0734b);
        Class clsMo1097a = ((InterfaceC0467a) interfaceC0734b).mo1097a();
        if (!clsMo1097a.isPrimitive()) {
            return clsMo1097a;
        }
        String name = clsMo1097a.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return clsMo1097a;
    }

    /* renamed from: t */
    public static boolean m1042t(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    /* renamed from: u */
    public static boolean m1043u(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
    }

    /* renamed from: w */
    public static boolean m1044w() {
        try {
            if (f1030j == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f1030j == null) {
                f1029i = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f1030j = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f1030j.invoke(null, Long.valueOf(f1029i))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* renamed from: x */
    public static int m1045x(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    /* renamed from: y */
    public static int m1046y(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* renamed from: z */
    public static void m1047z(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    /* renamed from: A */
    public abstract void mo1048A(Throwable th);

    /* renamed from: B */
    public abstract void mo1049B(C0010k c0010k);

    /* renamed from: D */
    public abstract void mo573D(int i);

    /* renamed from: E */
    public abstract void mo574E(View view, int i, int i2);

    /* renamed from: F */
    public abstract void mo575F(View view, float f2, float f3);

    /* renamed from: G */
    public abstract Object mo1051G(Intent intent, int i);

    /* renamed from: L */
    public abstract void mo1053L(boolean z2);

    /* renamed from: M */
    public abstract void mo1054M(boolean z2);

    /* renamed from: O */
    public abstract void mo1055O();

    /* renamed from: P */
    public abstract void mo1056P();

    /* renamed from: S */
    public abstract boolean mo576S(View view, int i);

    /* renamed from: T */
    public abstract TransformationMethod mo1057T(TransformationMethod transformationMethod);

    /* renamed from: e */
    public boolean mo1058e() {
        return false;
    }

    /* renamed from: f */
    public abstract int mo577f(View view, int i);

    /* renamed from: g */
    public abstract int mo578g(View view, int i);

    /* renamed from: h */
    public abstract List mo1059h(String str, List list);

    /* renamed from: p */
    public abstract InputFilter[] mo1060p(InputFilter[] inputFilterArr);

    /* renamed from: r */
    public int mo579r(View view) {
        return 0;
    }

    /* renamed from: s */
    public int mo580s() {
        return 0;
    }

    /* renamed from: v */
    public abstract boolean mo1061v();

    /* renamed from: K */
    public void mo1052K() {
    }

    /* renamed from: C */
    public void mo1050C(View view, int i) {
    }
}
