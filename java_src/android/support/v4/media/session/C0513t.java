package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.C0549d;
import androidx.emoji2.text.C0560o;
import androidx.emoji2.text.C0563r;
import androidx.emoji2.text.C0566u;
import androidx.emoji2.text.C0567v;
import androidx.emoji2.text.InterfaceC0559n;
import androidx.lifecycle.AbstractC0626L;
import androidx.lifecycle.AbstractC0627M;
import androidx.lifecycle.C0628N;
import androidx.lifecycle.C0630P;
import androidx.lifecycle.InterfaceC0629O;
import androidx.media.session.MediaButtonReceiver;
import androidx.recyclerview.widget.RecyclerView;
import it.deviato.spotifuck.WebService;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.SSLSocket;
import p000A.C0001b;
import p000A.C0010k;
import p007E.AbstractC0065r;
import p009F.AbstractC0085d;
import p009F.AbstractC0086e;
import p018K0.C0146e;
import p021M.C0181b;
import p023N.AbstractC0206Q;
import p032R0.C0373o;
import p033S.InterfaceC0380g;
import p036T0.AbstractC0411g;
import p041W.C0423a;
import p047Z0.AbstractC0469c;
import p052b0.AbstractC0664b;
import p052b0.C0663a;
import p052b0.C0665c;
import p068h.C0826K;
import p074j0.AbstractC0912a0;
import p074j0.C0887B;
import p074j0.C0915c;
import p087o.C1122T;
import p087o.C1186s;
import p091p0.AbstractC1230a;
import p105v.C1308d;
import p105v.C1309e;
import p107w.C1317b;
import p111y.C1347f;

/* renamed from: android.support.v4.media.session.t */
/* loaded from: classes.dex */
public final class C0513t implements InterfaceC0380g {

    /* renamed from: e */
    public static int f1242e;

    /* renamed from: f */
    public static C0513t f1243f;

    /* renamed from: a */
    public final /* synthetic */ int f1244a;

    /* renamed from: b */
    public Object f1245b;

    /* renamed from: c */
    public Object f1246c;

    /* renamed from: d */
    public Object f1247d;

    public /* synthetic */ C0513t(Object obj, Object obj2, Object obj3, int i) {
        this.f1244a = i;
        this.f1245b = obj;
        this.f1246c = obj2;
        this.f1247d = obj3;
    }

    /* renamed from: A */
    public static C0513t m1223A(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C0513t(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    /* renamed from: G */
    public static Bundle m1224G(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        m1226j(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    /* renamed from: h */
    public static boolean m1225h(Editable editable, KeyEvent keyEvent, boolean z2) {
        C0567v[] c0567vArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c0567vArr = (C0567v[]) editable.getSpans(selectionStart, selectionEnd, C0567v.class)) != null && c0567vArr.length > 0) {
            for (C0567v c0567v : c0567vArr) {
                int spanStart = editable.getSpanStart(c0567v);
                int spanEnd = editable.getSpanEnd(c0567v);
                if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: j */
    public static void m1226j(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(C0513t.class.getClassLoader());
        }
    }

    /* renamed from: B */
    public Object m1227B(CharSequence charSequence, int i, int i2, int i3, boolean z2, InterfaceC0559n interfaceC0559n) {
        char c2;
        C0560o c0560o = new C0560o((C0563r) ((C0010k) this.f1246c).f25h);
        int i4 = i;
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zMo38c = true;
        int iCharCount = i4;
        while (iCharCount < i2 && i5 < i3 && zMo38c) {
            SparseArray sparseArray = c0560o.f1667c.f1680a;
            C0563r c0563r = sparseArray == null ? null : (C0563r) sparseArray.get(iCodePointAt);
            if (c0560o.f1665a == 2) {
                if (c0563r != null) {
                    c0560o.f1667c = c0563r;
                    c0560o.f1670f++;
                } else {
                    if (iCodePointAt == 65038) {
                        c0560o.m1443a();
                    } else if (iCodePointAt != 65039) {
                        C0563r c0563r2 = c0560o.f1667c;
                        if (c0563r2.f1681b != null) {
                            if (c0560o.f1670f != 1) {
                                c0560o.f1668d = c0563r2;
                                c0560o.m1443a();
                            } else if (c0560o.m1444b()) {
                                c0560o.f1668d = c0560o.f1667c;
                                c0560o.m1443a();
                            } else {
                                c0560o.m1443a();
                            }
                            c2 = 3;
                        } else {
                            c0560o.m1443a();
                        }
                    }
                    c2 = 1;
                }
                c2 = 2;
            } else if (c0563r == null) {
                c0560o.m1443a();
                c2 = 1;
            } else {
                c0560o.f1665a = 2;
                c0560o.f1667c = c0563r;
                c0560o.f1670f = 1;
                c2 = 2;
            }
            c0560o.f1669e = iCodePointAt;
            if (c2 == 1) {
                iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                if (iCharCount < i2) {
                    iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                }
            } else if (c2 == 2) {
                int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                if (iCharCount2 < i2) {
                    iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                }
                iCharCount = iCharCount2;
            } else if (c2 == 3) {
                if (z2 || !m1247v(charSequence, i4, iCharCount, c0560o.f1668d.f1681b)) {
                    zMo38c = interfaceC0559n.mo38c(charSequence, i4, iCharCount, c0560o.f1668d.f1681b);
                    i5++;
                }
            }
            i4 = iCharCount;
        }
        if (c0560o.f1665a == 2 && c0560o.f1667c.f1681b != null && ((c0560o.f1670f > 1 || c0560o.m1444b()) && i5 < i3 && zMo38c && (z2 || !m1247v(charSequence, i4, iCharCount, c0560o.f1667c.f1681b)))) {
            interfaceC0559n.mo38c(charSequence, i4, iCharCount, c0560o.f1667c.f1681b);
        }
        return interfaceC0559n.mo43h();
    }

    /* renamed from: C */
    public void m1228C() {
        ((TypedArray) this.f1246c).recycle();
    }

    /* renamed from: D */
    public void m1229D(PlaybackStateCompat playbackStateCompat) {
        C0508o c0508o = (C0508o) this.f1245b;
        c0508o.f1237f = playbackStateCompat;
        synchronized (c0508o.f1235d) {
            for (int iBeginBroadcast = c0508o.f1236e.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((InterfaceC0495b) c0508o.f1236e.getBroadcastItem(iBeginBroadcast)).mo1167G(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            c0508o.f1236e.finishBroadcast();
        }
        MediaSession mediaSession = c0508o.f1232a;
        if (playbackStateCompat.f1214l == null) {
            PlaybackState.Builder builderM1255d = AbstractC0514u.m1255d();
            AbstractC0514u.m1275x(builderM1255d, playbackStateCompat.f1203a, playbackStateCompat.f1204b, playbackStateCompat.f1206d, playbackStateCompat.f1210h);
            AbstractC0514u.m1272u(builderM1255d, playbackStateCompat.f1205c);
            AbstractC0514u.m1270s(builderM1255d, playbackStateCompat.f1207e);
            AbstractC0514u.m1273v(builderM1255d, playbackStateCompat.f1209g);
            for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.f1211i) {
                PlaybackState.CustomAction customActionM1253b = customAction.f1219e;
                if (customActionM1253b == null) {
                    PlaybackState.CustomAction.Builder builderM1256e = AbstractC0514u.m1256e(customAction.f1215a, customAction.f1216b, customAction.f1217c);
                    AbstractC0514u.m1274w(builderM1256e, customAction.f1218d);
                    customActionM1253b = AbstractC0514u.m1253b(builderM1256e);
                }
                AbstractC0514u.m1252a(builderM1255d, customActionM1253b);
            }
            AbstractC0514u.m1271t(builderM1255d, playbackStateCompat.f1212j);
            if (Build.VERSION.SDK_INT >= 22) {
                AbstractC0515v.m1277b(builderM1255d, playbackStateCompat.f1213k);
            }
            playbackStateCompat.f1214l = AbstractC0514u.m1254c(builderM1255d);
        }
        mediaSession.setPlaybackState(playbackStateCompat.f1214l);
    }

    /* renamed from: E */
    public void m1230E(C1309e c1309e, int i, int i2, int i3) {
        c1309e.getClass();
        int i4 = c1309e.f5220b0;
        int i5 = c1309e.f5222c0;
        c1309e.f5220b0 = 0;
        c1309e.f5222c0 = 0;
        c1309e.m3155O(i2);
        c1309e.m3152L(i3);
        if (i4 < 0) {
            c1309e.f5220b0 = 0;
        } else {
            c1309e.f5220b0 = i4;
        }
        if (i5 < 0) {
            c1309e.f5222c0 = 0;
        } else {
            c1309e.f5222c0 = i5;
        }
        C1309e c1309e2 = (C1309e) this.f1246c;
        c1309e2.f5274t0 = i;
        c1309e2.m3184U();
    }

    /* renamed from: F */
    public void m1231F(View view) {
        if (((ArrayList) this.f1247d).remove(view)) {
            C0887B c0887b = (C0887B) this.f1245b;
            AbstractC0912a0 abstractC0912a0M1751I = RecyclerView.m1751I(view);
            if (abstractC0912a0M1751I != null) {
                int i = abstractC0912a0M1751I.f3669p;
                RecyclerView recyclerView = c0887b.f3571a;
                if (recyclerView.m1766L()) {
                    abstractC0912a0M1751I.f3670q = i;
                    recyclerView.f2223w0.add(abstractC0912a0M1751I);
                } else {
                    WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                    abstractC0912a0M1751I.f3654a.setImportantForAccessibility(i);
                }
                abstractC0912a0M1751I.f3669p = 0;
            }
        }
    }

    /* renamed from: H */
    public void m1232H(C1309e c1309e) {
        ArrayList arrayList = (ArrayList) this.f1247d;
        arrayList.clear();
        int size = c1309e.f5271q0.size();
        for (int i = 0; i < size; i++) {
            C1308d c1308d = (C1308d) c1309e.f5271q0.get(i);
            int[] iArr = c1308d.f5248p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c1308d);
            }
        }
        c1309e.f5273s0.f5362b = true;
    }

    @Override // p033S.InterfaceC0380g
    /* renamed from: a */
    public ClipDescription mo973a() {
        return (ClipDescription) this.f1246c;
    }

    @Override // p033S.InterfaceC0380g
    /* renamed from: c */
    public Uri mo975c() {
        return (Uri) this.f1247d;
    }

    @Override // p033S.InterfaceC0380g
    /* renamed from: d */
    public Object mo976d() {
        return null;
    }

    @Override // p033S.InterfaceC0380g
    /* renamed from: e */
    public Uri mo977e() {
        return (Uri) this.f1245b;
    }

    /* renamed from: f */
    public void m1233f(View view, int i, boolean z2) {
        RecyclerView recyclerView = ((C0887B) this.f1245b).f3571a;
        int childCount = i < 0 ? recyclerView.getChildCount() : m1244s(i);
        ((C0915c) this.f1246c).m2358e(childCount, z2);
        if (z2) {
            m1248w(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.m1751I(view);
    }

    /* renamed from: g */
    public void m1234g(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z2) {
        RecyclerView recyclerView = ((C0887B) this.f1245b).f3571a;
        int childCount = i < 0 ? recyclerView.getChildCount() : m1244s(i);
        ((C0915c) this.f1246c).m2358e(childCount, z2);
        if (z2) {
            m1248w(view);
        }
        AbstractC0912a0 abstractC0912a0M1751I = RecyclerView.m1751I(view);
        if (abstractC0912a0M1751I != null) {
            if (!abstractC0912a0M1751I.m2326k() && !abstractC0912a0M1751I.m2331p()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + abstractC0912a0M1751I + recyclerView.m1804y());
            }
            abstractC0912a0M1751I.f3663j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    /* renamed from: i */
    public void m1235i(int i) {
        AbstractC0912a0 abstractC0912a0M1751I;
        int iM1244s = m1244s(i);
        ((C0915c) this.f1246c).m2359f(iM1244s);
        RecyclerView recyclerView = ((C0887B) this.f1245b).f3571a;
        View childAt = recyclerView.getChildAt(iM1244s);
        if (childAt != null && (abstractC0912a0M1751I = RecyclerView.m1751I(childAt)) != null) {
            if (abstractC0912a0M1751I.m2326k() && !abstractC0912a0M1751I.m2331p()) {
                throw new IllegalArgumentException("called detach on an already detached child " + abstractC0912a0M1751I + recyclerView.m1804y());
            }
            abstractC0912a0M1751I.m2316a(256);
        }
        recyclerView.detachViewFromParent(iM1244s);
    }

    /* renamed from: k */
    public AbstractC0627M m1236k(String str, Class cls) {
        AbstractC0627M abstractC0627MMo42g;
        AbstractC0469c.m1102e("key", str);
        C0630P c0630p = (C0630P) this.f1245b;
        c0630p.getClass();
        LinkedHashMap linkedHashMap = c0630p.f1987a;
        AbstractC0627M abstractC0627M = (AbstractC0627M) linkedHashMap.get(str);
        boolean zIsInstance = cls.isInstance(abstractC0627M);
        InterfaceC0629O interfaceC0629O = (InterfaceC0629O) this.f1246c;
        if (zIsInstance) {
            if (interfaceC0629O instanceof AbstractC0626L) {
            }
            AbstractC0469c.m1100c("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get", abstractC0627M);
            return abstractC0627M;
        }
        C0665c c0665c = new C0665c((AbstractC0664b) this.f1247d);
        c0665c.f2259a.put(C0628N.f1986b, str);
        try {
            abstractC0627MMo42g = interfaceC0629O.mo40e(cls, c0665c);
        } catch (AbstractMethodError unused) {
            abstractC0627MMo42g = interfaceC0629O.mo42g(cls);
        }
        AbstractC0469c.m1102e("viewModel", abstractC0627MMo42g);
        AbstractC0627M abstractC0627M2 = (AbstractC0627M) linkedHashMap.put(str, abstractC0627MMo42g);
        if (abstractC0627M2 != null) {
            abstractC0627M2.mo1516b();
        }
        return abstractC0627MMo42g;
    }

    /* renamed from: l */
    public View m1237l(int i) {
        return ((C0887B) this.f1245b).f3571a.getChildAt(m1244s(i));
    }

    /* renamed from: m */
    public int m1238m() {
        return ((C0887B) this.f1245b).f3571a.getChildCount() - ((ArrayList) this.f1247d).size();
    }

    /* renamed from: n */
    public ColorStateList m1239n(int i) {
        int resourceId;
        ColorStateList colorStateListM2870I;
        TypedArray typedArray = (TypedArray) this.f1246c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM2870I = AbstractC1230a.m2870I((Context) this.f1245b, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM2870I;
    }

    /* renamed from: o */
    public Drawable m1240o(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f1246c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : AbstractC0411g.m1039n((Context) this.f1245b, resourceId);
    }

    /* renamed from: p */
    public Drawable m1241p(int i) {
        int resourceId;
        Drawable drawableM2732g;
        if (!((TypedArray) this.f1246c).hasValue(i) || (resourceId = ((TypedArray) this.f1246c).getResourceId(i, 0)) == 0) {
            return null;
        }
        C1186s c1186sM2807a = C1186s.m2807a();
        Context context = (Context) this.f1245b;
        synchronized (c1186sM2807a) {
            drawableM2732g = c1186sM2807a.f4726a.m2732g(context, resourceId, true);
        }
        return drawableM2732g;
    }

    /* renamed from: q */
    public Typeface m1242q(int i, int i2, C1122T c1122t) {
        int resourceId = ((TypedArray) this.f1246c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f1247d) == null) {
            this.f1247d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f1247d;
        ThreadLocal threadLocal = AbstractC0065r.f135a;
        Context context = (Context) this.f1245b;
        if (context.isRestricted()) {
            return null;
        }
        return AbstractC0065r.m293c(context, resourceId, typedValue, i2, c1122t, true, false);
    }

    /* renamed from: r */
    public Method m1243r(Class cls) throws NoSuchMethodException, SecurityException {
        Method method;
        Class cls2;
        try {
            method = cls.getMethod((String) this.f1246c, (Class[]) this.f1247d);
        } catch (NoSuchMethodException unused) {
        }
        try {
            if ((method.getModifiers() & 1) == 0) {
                method = null;
            }
        } catch (NoSuchMethodException unused2) {
        }
        if (method == null || (cls2 = (Class) this.f1245b) == null || cls2.isAssignableFrom(method.getReturnType())) {
            return method;
        }
        return null;
    }

    /* renamed from: s */
    public int m1244s(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((C0887B) this.f1245b).f3571a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C0915c c0915c = (C0915c) this.f1246c;
            int iM2355b = i - (i2 - c0915c.m2355b(i2));
            if (iM2355b == 0) {
                while (c0915c.m2357d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iM2355b;
        }
        return -1;
    }

    /* renamed from: t */
    public View m1245t(int i) {
        return ((C0887B) this.f1245b).f3571a.getChildAt(i);
    }

    public String toString() {
        switch (this.f1244a) {
            case 7:
                return ((C0915c) this.f1246c).toString() + ", hidden list:" + ((ArrayList) this.f1247d).size();
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public int m1246u() {
        return ((C0887B) this.f1245b).f3571a.getChildCount();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m1247v(CharSequence charSequence, int i, int i2, C0566u c0566u) {
        boolean zM332a;
        if ((c0566u.f1689c & 3) == 0) {
            C0549d c0549d = (C0549d) this.f1247d;
            C0423a c0423aM1456c = c0566u.m1456c();
            int iM590a = c0423aM1456c.m590a(8);
            short s2 = iM590a != 0 ? ((ByteBuffer) c0423aM1456c.f551d).getShort(iM590a + c0423aM1456c.f548a) : (short) 0;
            c0549d.getClass();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 23 || s2 <= i3) {
                ThreadLocal threadLocal = C0549d.f1640b;
                if (threadLocal.get() == null) {
                    threadLocal.set(new StringBuilder());
                }
                StringBuilder sb = (StringBuilder) threadLocal.get();
                sb.setLength(0);
                while (i < i2) {
                    sb.append(charSequence.charAt(i));
                    i++;
                }
                TextPaint textPaint = c0549d.f1641a;
                String string = sb.toString();
                ThreadLocal threadLocal2 = AbstractC0086e.f253a;
                if (Build.VERSION.SDK_INT >= 23) {
                    zM332a = AbstractC0085d.m332a(textPaint, string);
                } else {
                    int length = string.length();
                    if (length != 1 || !Character.isWhitespace(string.charAt(0))) {
                        float fMeasureText = textPaint.measureText("\udfffd");
                        float fMeasureText2 = textPaint.measureText("m");
                        float fMeasureText3 = textPaint.measureText(string);
                        float fMeasureText4 = 0.0f;
                        if (fMeasureText3 != 0.0f) {
                            if (string.codePointCount(0, string.length()) > 1) {
                                if (fMeasureText3 <= fMeasureText2 * 2.0f) {
                                    int i4 = 0;
                                    while (i4 < length) {
                                        int iCharCount = Character.charCount(string.codePointAt(i4)) + i4;
                                        fMeasureText4 += textPaint.measureText(string, i4, iCharCount);
                                        i4 = iCharCount;
                                    }
                                    if (fMeasureText3 >= fMeasureText4) {
                                    }
                                }
                                zM332a = false;
                            }
                            if (fMeasureText3 != fMeasureText) {
                                zM332a = true;
                            } else {
                                ThreadLocal threadLocal3 = AbstractC0086e.f253a;
                                C0181b c0181b = (C0181b) threadLocal3.get();
                                if (c0181b == null) {
                                    c0181b = new C0181b(new Rect(), new Rect());
                                    threadLocal3.set(c0181b);
                                } else {
                                    ((Rect) c0181b.f528a).setEmpty();
                                    ((Rect) c0181b.f529b).setEmpty();
                                }
                                Rect rect = (Rect) c0181b.f528a;
                                textPaint.getTextBounds("\udfffd", 0, 2, rect);
                                Object obj = c0181b.f529b;
                                textPaint.getTextBounds(string, 0, length, (Rect) obj);
                                zM332a = !rect.equals(obj);
                            }
                        } else {
                            zM332a = false;
                        }
                    }
                }
                int i5 = c0566u.f1689c & 4;
                c0566u.f1689c = zM332a ? i5 | 2 : i5 | 1;
            }
        }
        return (c0566u.f1689c & 3) == 2;
    }

    /* renamed from: w */
    public void m1248w(View view) {
        ((ArrayList) this.f1247d).add(view);
        C0887B c0887b = (C0887B) this.f1245b;
        AbstractC0912a0 abstractC0912a0M1751I = RecyclerView.m1751I(view);
        if (abstractC0912a0M1751I != null) {
            int i = abstractC0912a0M1751I.f3670q;
            View view2 = abstractC0912a0M1751I.f3654a;
            if (i != -1) {
                abstractC0912a0M1751I.f3669p = i;
            } else {
                WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                abstractC0912a0M1751I.f3669p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = c0887b.f3571a;
            if (recyclerView.m1766L()) {
                abstractC0912a0M1751I.f3670q = 4;
                recyclerView.f2223w0.add(abstractC0912a0M1751I);
            } else {
                WeakHashMap weakHashMap2 = AbstractC0206Q.f560a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    /* renamed from: x */
    public Object m1249x(SSLSocket sSLSocket, Object... objArr) throws NoSuchMethodException, SecurityException {
        Method methodM1243r = m1243r(sSLSocket.getClass());
        if (methodM1243r == null) {
            throw new AssertionError("Method " + ((String) this.f1246c) + " not supported for object " + sSLSocket);
        }
        try {
            return methodM1243r.invoke(sSLSocket, objArr);
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodM1243r);
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    /* renamed from: y */
    public void m1250y(SSLSocket sSLSocket, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Method methodM1243r = m1243r(sSLSocket.getClass());
            if (methodM1243r == null) {
                return;
            }
            try {
                methodM1243r.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: z */
    public boolean m1251z(int i, C1308d c1308d, C1347f c1347f) {
        int[] iArr = c1308d.f5248p0;
        int i2 = iArr[0];
        C1317b c1317b = (C1317b) this.f1245b;
        c1317b.f5349a = i2;
        c1317b.f5350b = iArr[1];
        c1317b.f5351c = c1308d.m3170q();
        c1317b.f5352d = c1308d.m3166k();
        c1317b.f5357i = false;
        c1317b.f5358j = i;
        boolean z2 = c1317b.f5349a == 3;
        boolean z3 = c1317b.f5350b == 3;
        boolean z4 = z2 && c1308d.f5213W > 0.0f;
        boolean z5 = z3 && c1308d.f5213W > 0.0f;
        int[] iArr2 = c1308d.f5252t;
        if (z4 && iArr2[0] == 4) {
            c1317b.f5349a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            c1317b.f5350b = 1;
        }
        c1347f.m3264b(c1308d, c1317b);
        c1308d.m3155O(c1317b.f5353e);
        c1308d.m3152L(c1317b.f5354f);
        c1308d.f5195E = c1317b.f5356h;
        c1308d.m3149I(c1317b.f5355g);
        c1317b.f5358j = 0;
        return c1317b.f5357i;
    }

    public C0513t(C0630P c0630p, InterfaceC0629O interfaceC0629O, AbstractC0664b abstractC0664b) {
        this.f1244a = 4;
        AbstractC0469c.m1102e("store", c0630p);
        AbstractC0469c.m1102e("defaultCreationExtras", abstractC0664b);
        this.f1245b = c0630p;
        this.f1246c = interfaceC0629O;
        this.f1247d = abstractC0664b;
    }

    public C0513t(C0887B c0887b) {
        this.f1244a = 7;
        this.f1245b = c0887b;
        this.f1246c = new C0915c();
        this.f1247d = new ArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0513t(C0630P c0630p, InterfaceC0629O interfaceC0629O) {
        this(c0630p, interfaceC0629O, C0663a.f2258b);
        this.f1244a = 4;
        AbstractC0469c.m1102e("store", c0630p);
    }

    public C0513t(Runnable runnable) {
        this.f1244a = 1;
        this.f1246c = new CopyOnWriteArrayList();
        this.f1247d = new HashMap();
        this.f1245b = runnable;
    }

    public C0513t(Context context, TypedArray typedArray) {
        this.f1244a = 8;
        this.f1245b = context;
        this.f1246c = typedArray;
    }

    public C0513t(Context context, LocationManager locationManager) {
        this.f1244a = 6;
        this.f1247d = new C0826K();
        this.f1245b = context;
        this.f1246c = locationManager;
    }

    public C0513t(C1309e c1309e) {
        this.f1244a = 12;
        this.f1247d = new ArrayList();
        this.f1245b = new C1317b();
        this.f1246c = c1309e;
    }

    public C0513t(C0010k c0010k, C0146e c0146e, C0549d c0549d, Set set) {
        this.f1244a = 3;
        this.f1245b = c0146e;
        this.f1246c = c0010k;
        this.f1247d = c0549d;
        if (set.isEmpty()) {
            return;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            int[] iArr = (int[]) it2.next();
            String str = new String(iArr, 0, iArr.length);
            m1227B(str, 0, str.length(), 1, true, new C0001b(16, str));
        }
    }

    public C0513t(WebService webService, String str) {
        PendingIntent broadcast;
        this.f1244a = 0;
        this.f1247d = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            ComponentName componentNameM1634b = MediaButtonReceiver.m1634b(webService);
            if (componentNameM1634b == null) {
                Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
            }
            if (componentNameM1634b != null) {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(componentNameM1634b);
                broadcast = PendingIntent.getBroadcast(webService, 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            } else {
                broadcast = null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                this.f1245b = new C0511r(webService, str);
            } else if (i >= 28) {
                this.f1245b = new C0510q(webService, str);
            } else if (i >= 22) {
                this.f1245b = new C0509p(webService, str);
            } else {
                this.f1245b = new C0508o(webService, str);
            }
            ((C0508o) this.f1245b).m1221e(new C0373o(1), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
            ((C0508o) this.f1245b).f1232a.setMediaButtonReceiver(broadcast);
            this.f1246c = new C0001b(webService, ((C0508o) this.f1245b).f1234c);
            if (f1242e == 0) {
                f1242e = (int) (TypedValue.applyDimension(1, 320.0f, webService.getResources().getDisplayMetrics()) + 0.5f);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }

    public C0513t(int i) {
        this.f1244a = i;
        switch (i) {
            case 11:
                break;
            default:
                this.f1246c = null;
                break;
        }
    }

    @Override // p033S.InterfaceC0380g
    /* renamed from: b */
    public void mo974b() {
    }
}
