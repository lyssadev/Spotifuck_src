package p068h;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.C0513t;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.AbstractActivityC0532n;
import androidx.activity.C0524f;
import androidx.activity.C0525g;
import androidx.fragment.app.AbstractComponentCallbacksC0606r;
import androidx.fragment.app.C0577H;
import androidx.fragment.app.C0584O;
import androidx.fragment.app.C0608t;
import androidx.lifecycle.C0652t;
import androidx.lifecycle.EnumC0644l;
import androidx.lifecycle.EnumC0645m;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Objects;
import p000A.C0001b;
import p003C.AbstractC0018e;
import p007E.AbstractC0049b;
import p015J.C0121f;
import p021M.InterfaceC0180a;
import p055c0.C0673a;
import p068h.AbstractActivityC0841l;
import p082m.C0979c;
import p082m.C0984h;
import p082m.C0986j;
import p087o.AbstractC1168k1;
import p087o.C1153f1;
import p087o.C1186s;
import p096r.C1257l;

/* renamed from: h.l */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0841l extends AbstractActivityC0532n implements InterfaceC0842m {

    /* renamed from: A */
    public boolean f3285A;

    /* renamed from: C */
    public LayoutInflaterFactory2C0819D f3287C;

    /* renamed from: z */
    public boolean f3290z;

    /* renamed from: x */
    public final C0001b f3288x = new C0001b(18, new C0608t(this));

    /* renamed from: y */
    public final C0652t f3289y = new C0652t(this);

    /* renamed from: B */
    public boolean f3286B = true;

    public AbstractActivityC0841l() {
        this.f1293i.f3919b.m2443e("android:support:lifecycle", new C0524f(1, this));
        final int i = 0;
        m1300g(new InterfaceC0180a(this) { // from class: androidx.fragment.app.s

            /* renamed from: b */
            public final /* synthetic */ AbstractActivityC0841l f1940b;

            {
                this.f1940b = this;
            }

            @Override // p021M.InterfaceC0180a
            /* renamed from: a */
            public final void mo485a(Object obj) {
                switch (i) {
                    case 0:
                        this.f1940b.f3288x.m58x();
                        break;
                    default:
                        this.f1940b.f3288x.m58x();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.f1300p.add(new InterfaceC0180a(this) { // from class: androidx.fragment.app.s

            /* renamed from: b */
            public final /* synthetic */ AbstractActivityC0841l f1940b;

            {
                this.f1940b = this;
            }

            @Override // p021M.InterfaceC0180a
            /* renamed from: a */
            public final void mo485a(Object obj) {
                switch (i2) {
                    case 0:
                        this.f1940b.f3288x.m58x();
                        break;
                    default:
                        this.f1940b.f3288x.m58x();
                        break;
                }
            }
        });
        m1301h(new C0525g(this, 1));
        this.f1293i.f3919b.m2443e("androidx:appcompat", new C0839j(this));
        m1301h(new C0840k(this));
    }

    /* renamed from: m */
    public static boolean m2119m(C0577H c0577h) {
        boolean zM2119m = false;
        for (AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r : c0577h.f1726c.m87i()) {
            if (abstractComponentCallbacksC0606r != null) {
                C0608t c0608t = abstractComponentCallbacksC0606r.f1936x;
                if ((c0608t == null ? null : c0608t.f1945j) != null) {
                    zM2119m |= m2119m(abstractComponentCallbacksC0606r.m1587g());
                }
                C0584O c0584o = abstractComponentCallbacksC0606r.f1913T;
                EnumC0645m enumC0645m = EnumC0645m.f2004d;
                if (c0584o != null && c0584o.mo1299d().f2012c.compareTo(enumC0645m) >= 0) {
                    abstractComponentCallbacksC0606r.f1913T.f1794h.m1621g();
                    zM2119m = true;
                }
                if (abstractComponentCallbacksC0606r.f1912S.f2012c.compareTo(enumC0645m) >= 0) {
                    abstractComponentCallbacksC0606r.f1912S.m1621g();
                    zM2119m = true;
                }
            }
        }
        return zM2119m;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m1303j();
        LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D = (LayoutInflaterFactory2C0819D) m2120k();
        layoutInflaterFactory2C0819D.m2083u();
        ((ViewGroup) layoutInflaterFactory2C0819D.f3115G.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0819D.f3151r.m2142a(layoutInflaterFactory2C0819D.f3150q.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D = (LayoutInflaterFactory2C0819D) m2120k();
        layoutInflaterFactory2C0819D.f3129U = true;
        int i = layoutInflaterFactory2C0819D.f3133Y;
        if (i == -100) {
            i = AbstractC0848s.f3298g;
        }
        int iM2060B = layoutInflaterFactory2C0819D.m2060B(context, i);
        if (AbstractC0848s.m2131a(context) && AbstractC0848s.m2131a(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (AbstractC0848s.f3305n) {
                    try {
                        C0121f c0121f = AbstractC0848s.f3299h;
                        if (c0121f == null) {
                            if (AbstractC0848s.f3300i == null) {
                                AbstractC0848s.f3300i = C0121f.m455b(AbstractC0018e.m102e(context));
                            }
                            if (!AbstractC0848s.f3300i.f322a.isEmpty()) {
                                AbstractC0848s.f3299h = AbstractC0848s.f3300i;
                            }
                        } else if (!c0121f.equals(AbstractC0848s.f3300i)) {
                            C0121f c0121f2 = AbstractC0848s.f3299h;
                            AbstractC0848s.f3300i = c0121f2;
                            AbstractC0018e.m101d(context, c0121f2.f322a.mo457b());
                        }
                    } finally {
                    }
                }
            } else if (!AbstractC0848s.f3302k) {
                AbstractC0848s.f3297f.execute(new RunnableC0843n(context, 0));
            }
        }
        C0121f c0121fM2056n = LayoutInflaterFactory2C0819D.m2056n(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C0819D.m2057r(context, iM2060B, c0121fM2056n, null, false));
            } catch (IllegalStateException unused) {
            }
        } else if (context instanceof C0979c) {
            try {
                ((C0979c) context).m2473a(LayoutInflaterFactory2C0819D.m2057r(context, iM2060B, c0121fM2056n, null, false));
            } catch (IllegalStateException unused2) {
            }
        } else if (LayoutInflaterFactory2C0819D.f3108p0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f2 = configuration3.fontScale;
                    float f3 = configuration4.fontScale;
                    if (f2 != f3) {
                        configuration.fontScale = f3;
                    }
                    int i2 = configuration3.mcc;
                    int i3 = configuration4.mcc;
                    if (i2 != i3) {
                        configuration.mcc = i3;
                    }
                    int i4 = configuration3.mnc;
                    int i5 = configuration4.mnc;
                    if (i4 != i5) {
                        configuration.mnc = i5;
                    }
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 >= 24) {
                        AbstractC0853x.m2135a(configuration3, configuration4, configuration);
                    } else if (!Objects.equals(configuration3.locale, configuration4.locale)) {
                        configuration.locale = configuration4.locale;
                    }
                    int i7 = configuration3.touchscreen;
                    int i8 = configuration4.touchscreen;
                    if (i7 != i8) {
                        configuration.touchscreen = i8;
                    }
                    int i9 = configuration3.keyboard;
                    int i10 = configuration4.keyboard;
                    if (i9 != i10) {
                        configuration.keyboard = i10;
                    }
                    int i11 = configuration3.keyboardHidden;
                    int i12 = configuration4.keyboardHidden;
                    if (i11 != i12) {
                        configuration.keyboardHidden = i12;
                    }
                    int i13 = configuration3.navigation;
                    int i14 = configuration4.navigation;
                    if (i13 != i14) {
                        configuration.navigation = i14;
                    }
                    int i15 = configuration3.navigationHidden;
                    int i16 = configuration4.navigationHidden;
                    if (i15 != i16) {
                        configuration.navigationHidden = i16;
                    }
                    int i17 = configuration3.orientation;
                    int i18 = configuration4.orientation;
                    if (i17 != i18) {
                        configuration.orientation = i18;
                    }
                    int i19 = configuration3.screenLayout & 15;
                    int i20 = configuration4.screenLayout & 15;
                    if (i19 != i20) {
                        configuration.screenLayout |= i20;
                    }
                    int i21 = configuration3.screenLayout & 192;
                    int i22 = configuration4.screenLayout & 192;
                    if (i21 != i22) {
                        configuration.screenLayout |= i22;
                    }
                    int i23 = configuration3.screenLayout & 48;
                    int i24 = configuration4.screenLayout & 48;
                    if (i23 != i24) {
                        configuration.screenLayout |= i24;
                    }
                    int i25 = configuration3.screenLayout & 768;
                    int i26 = configuration4.screenLayout & 768;
                    if (i25 != i26) {
                        configuration.screenLayout |= i26;
                    }
                    if (i6 >= 26) {
                        if ((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                            configuration.colorMode |= configuration4.colorMode & 3;
                        }
                        if ((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                            configuration.colorMode |= configuration4.colorMode & 12;
                        }
                    }
                    int i27 = configuration3.uiMode & 15;
                    int i28 = configuration4.uiMode & 15;
                    if (i27 != i28) {
                        configuration.uiMode |= i28;
                    }
                    int i29 = configuration3.uiMode & 48;
                    int i30 = configuration4.uiMode & 48;
                    if (i29 != i30) {
                        configuration.uiMode |= i30;
                    }
                    int i31 = configuration3.screenWidthDp;
                    int i32 = configuration4.screenWidthDp;
                    if (i31 != i32) {
                        configuration.screenWidthDp = i32;
                    }
                    int i33 = configuration3.screenHeightDp;
                    int i34 = configuration4.screenHeightDp;
                    if (i33 != i34) {
                        configuration.screenHeightDp = i34;
                    }
                    int i35 = configuration3.smallestScreenWidthDp;
                    int i36 = configuration4.smallestScreenWidthDp;
                    if (i35 != i36) {
                        configuration.smallestScreenWidthDp = i36;
                    }
                    int i37 = configuration3.densityDpi;
                    int i38 = configuration4.densityDpi;
                    if (i37 != i38) {
                        configuration.densityDpi = i38;
                    }
                }
            }
            Configuration configurationM2057r = LayoutInflaterFactory2C0819D.m2057r(context, iM2060B, c0121fM2056n, configuration, true);
            C0979c c0979c = new C0979c(context, it.deviato.spotifuck.R.style.Theme_AppCompat_Empty);
            c0979c.m2473a(configurationM2057r);
            try {
                if (context.getTheme() != null) {
                    AbstractC0049b.m238m(c0979c.getTheme());
                }
            } catch (NullPointerException unused3) {
            }
            context = c0979c;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m2121l();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // p003C.AbstractActivityC0021h, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        keyEvent.getKeyCode();
        m2121l();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        return;
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            return;
                        }
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                        return;
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                        return;
                    }
                    break;
            }
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.f3290z);
        printWriter.print(" mResumed=");
        printWriter.print(this.f3285A);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3286B);
        if (getApplication() != null) {
            C0513t c0513t = new C0513t(mo1298c(), C0673a.f2266d);
            String canonicalName = C0673a.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            C1257l c1257l = ((C0673a) c0513t.m1236k("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), C0673a.class)).f2267c;
            if (c1257l.f5016c > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (c1257l.f5016c > 0) {
                    if (c1257l.f5015b[0] != null) {
                        throw new ClassCastException();
                    }
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(c1257l.f5014a[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((C0608t) this.f3288x.f2g).f1944i.m1510u(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D = (LayoutInflaterFactory2C0819D) m2120k();
        layoutInflaterFactory2C0819D.m2083u();
        return layoutInflaterFactory2C0819D.f3150q.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D = (LayoutInflaterFactory2C0819D) m2120k();
        if (layoutInflaterFactory2C0819D.f3154u == null) {
            layoutInflaterFactory2C0819D.m2087z();
            C0829N c0829n = layoutInflaterFactory2C0819D.f3153t;
            layoutInflaterFactory2C0819D.f3154u = new C0984h(c0829n != null ? c0829n.m2106W() : layoutInflaterFactory2C0819D.f3149p);
        }
        return layoutInflaterFactory2C0819D.f3154u;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = AbstractC1168k1.f4686a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D = (LayoutInflaterFactory2C0819D) m2120k();
        if (layoutInflaterFactory2C0819D.f3153t != null) {
            layoutInflaterFactory2C0819D.m2087z();
            layoutInflaterFactory2C0819D.f3153t.getClass();
            layoutInflaterFactory2C0819D.m2059A(0);
        }
    }

    /* renamed from: k */
    public final AbstractC0848s m2120k() {
        if (this.f3287C == null) {
            ExecutorC0846q executorC0846q = AbstractC0848s.f3297f;
            this.f3287C = new LayoutInflaterFactory2C0819D(this, null, this, this);
        }
        return this.f3287C;
    }

    /* renamed from: l */
    public final C0829N m2121l() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D = (LayoutInflaterFactory2C0819D) m2120k();
        layoutInflaterFactory2C0819D.m2087z();
        return layoutInflaterFactory2C0819D.f3153t;
    }

    /* renamed from: n */
    public final void m2122n() {
        super.onDestroy();
        ((C0608t) this.f3288x.f2g).f1944i.m1500k();
        this.f3289y.m1618d(EnumC0644l.ON_DESTROY);
    }

    /* renamed from: o */
    public final boolean m2123o(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((C0608t) this.f3288x.f2g).f1944i.m1498i();
        }
        return false;
    }

    @Override // androidx.activity.AbstractActivityC0532n, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f3288x.m58x();
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.AbstractActivityC0532n, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D = (LayoutInflaterFactory2C0819D) m2120k();
        if (layoutInflaterFactory2C0819D.f3120L && layoutInflaterFactory2C0819D.f3114F) {
            layoutInflaterFactory2C0819D.m2087z();
            C0829N c0829n = layoutInflaterFactory2C0819D.f3153t;
            if (c0829n != null) {
                c0829n.m2108Y(c0829n.f3198l.getResources().getBoolean(it.deviato.spotifuck.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C1186s c1186sM2807a = C1186s.m2807a();
        Context context = layoutInflaterFactory2C0819D.f3149p;
        synchronized (c1186sM2807a) {
            c1186sM2807a.f4726a.m2735l(context);
        }
        layoutInflaterFactory2C0819D.f3132X = new Configuration(layoutInflaterFactory2C0819D.f3149p.getResources().getConfiguration());
        layoutInflaterFactory2C0819D.m2076l(false, false);
    }

    @Override // androidx.activity.AbstractActivityC0532n, p003C.AbstractActivityC0021h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3289y.m1618d(EnumC0644l.ON_CREATE);
        C0577H c0577h = ((C0608t) this.f3288x.f2g).f1944i;
        c0577h.f1715E = false;
        c0577h.f1716F = false;
        c0577h.f1722L.f1764h = false;
        c0577h.m1509t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((C0608t) this.f3288x.f2g).f1944i.f1729f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        m2122n();
        m2120k().mo2068c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // androidx.activity.AbstractActivityC0532n, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intent intentM98a;
        if (m2123o(i, menuItem)) {
            return true;
        }
        C0829N c0829nM2121l = m2121l();
        if (menuItem.getItemId() != 16908332 || c0829nM2121l == null || (((C1153f1) c0829nM2121l.f3202p).f4606b & 4) == 0 || (intentM98a = AbstractC0018e.m98a(this)) == null) {
            return false;
        }
        if (!shouldUpRecreateTask(intentM98a)) {
            navigateUpTo(intentM98a);
            return true;
        }
        ArrayList arrayList = new ArrayList();
        Intent intentM98a2 = AbstractC0018e.m98a(this);
        if (intentM98a2 == null) {
            intentM98a2 = AbstractC0018e.m98a(this);
        }
        if (intentM98a2 != null) {
            ComponentName component = intentM98a2.getComponent();
            if (component == null) {
                component = intentM98a2.resolveActivity(getPackageManager());
            }
            int size = arrayList.size();
            try {
                Intent intentM99b = AbstractC0018e.m99b(this, component);
                while (intentM99b != null) {
                    arrayList.add(size, intentM99b);
                    intentM99b = AbstractC0018e.m99b(this, intentM99b.getComponent());
                }
                arrayList.add(intentM98a2);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e);
            }
        }
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        startActivities(intentArr, null);
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f3285A = false;
        ((C0608t) this.f3288x.f2g).f1944i.m1509t(5);
        this.f3289y.m1618d(EnumC0644l.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C0819D) m2120k()).m2083u();
    }

    @Override // android.app.Activity
    public final void onPostResume() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m2124p();
        LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D = (LayoutInflaterFactory2C0819D) m2120k();
        layoutInflaterFactory2C0819D.m2087z();
        C0829N c0829n = layoutInflaterFactory2C0819D.f3153t;
        if (c0829n != null) {
            c0829n.f3193E = true;
        }
    }

    @Override // androidx.activity.AbstractActivityC0532n, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f3288x.m58x();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        C0001b c0001b = this.f3288x;
        c0001b.m58x();
        super.onResume();
        this.f3285A = true;
        ((C0608t) c0001b.f2g).f1944i.m1513x(true);
    }

    @Override // android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        m2125q();
        ((LayoutInflaterFactory2C0819D) m2120k()).m2076l(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f3288x.m58x();
    }

    @Override // android.app.Activity
    public final void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m2126r();
        LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D = (LayoutInflaterFactory2C0819D) m2120k();
        layoutInflaterFactory2C0819D.m2087z();
        C0829N c0829n = layoutInflaterFactory2C0819D.f3153t;
        if (c0829n != null) {
            c0829n.f3193E = false;
            C0986j c0986j = c0829n.f3192D;
            if (c0986j != null) {
                c0986j.m2479a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m2120k().mo2075k(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m2121l();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    /* renamed from: p */
    public final void m2124p() {
        super.onPostResume();
        this.f3289y.m1618d(EnumC0644l.ON_RESUME);
        C0577H c0577h = ((C0608t) this.f3288x.f2g).f1944i;
        c0577h.f1715E = false;
        c0577h.f1716F = false;
        c0577h.f1722L.f1764h = false;
        c0577h.m1509t(7);
    }

    /* renamed from: q */
    public final void m2125q() {
        C0001b c0001b = this.f3288x;
        c0001b.m58x();
        super.onStart();
        this.f3286B = false;
        boolean z2 = this.f3290z;
        C0608t c0608t = (C0608t) c0001b.f2g;
        if (!z2) {
            this.f3290z = true;
            C0577H c0577h = c0608t.f1944i;
            c0577h.f1715E = false;
            c0577h.f1716F = false;
            c0577h.f1722L.f1764h = false;
            c0577h.m1509t(4);
        }
        c0608t.f1944i.m1513x(true);
        this.f3289y.m1618d(EnumC0644l.ON_START);
        C0577H c0577h2 = c0608t.f1944i;
        c0577h2.f1715E = false;
        c0577h2.f1716F = false;
        c0577h2.f1722L.f1764h = false;
        c0577h2.m1509t(5);
    }

    /* renamed from: r */
    public final void m2126r() {
        C0001b c0001b;
        super.onStop();
        this.f3286B = true;
        do {
            c0001b = this.f3288x;
        } while (m2119m(((C0608t) c0001b.f2g).f1944i));
        C0577H c0577h = ((C0608t) c0001b.f2g).f1944i;
        c0577h.f1716F = true;
        c0577h.f1722L.f1764h = true;
        c0577h.m1509t(4);
        this.f3289y.m1618d(EnumC0644l.ON_STOP);
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        m1303j();
        m2120k().mo2072h(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C0819D) m2120k()).f3134Z = i;
    }

    @Override // androidx.activity.AbstractActivityC0532n, android.app.Activity
    public void setContentView(View view) {
        m1303j();
        m2120k().mo2073i(view);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((C0608t) this.f3288x.f2g).f1944i.f1729f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1303j();
        m2120k().mo2074j(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
