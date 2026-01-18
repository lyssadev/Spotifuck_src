package p084n;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p005D.AbstractC0040a;
import p023N.AbstractC0208T;
import p023N.AbstractC0210V;

/* renamed from: n.l */
/* loaded from: classes.dex */
public class MenuC1035l implements Menu {

    /* renamed from: y */
    public static final int[] f4257y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f4258a;

    /* renamed from: b */
    public final Resources f4259b;

    /* renamed from: c */
    public boolean f4260c;

    /* renamed from: d */
    public final boolean f4261d;

    /* renamed from: e */
    public InterfaceC1033j f4262e;

    /* renamed from: f */
    public final ArrayList f4263f;

    /* renamed from: g */
    public final ArrayList f4264g;

    /* renamed from: h */
    public boolean f4265h;

    /* renamed from: i */
    public final ArrayList f4266i;

    /* renamed from: j */
    public final ArrayList f4267j;

    /* renamed from: k */
    public boolean f4268k;

    /* renamed from: m */
    public CharSequence f4270m;

    /* renamed from: n */
    public Drawable f4271n;

    /* renamed from: o */
    public View f4272o;

    /* renamed from: v */
    public C1037n f4279v;

    /* renamed from: x */
    public boolean f4281x;

    /* renamed from: l */
    public int f4269l = 0;

    /* renamed from: p */
    public boolean f4273p = false;

    /* renamed from: q */
    public boolean f4274q = false;

    /* renamed from: r */
    public boolean f4275r = false;

    /* renamed from: s */
    public boolean f4276s = false;

    /* renamed from: t */
    public final ArrayList f4277t = new ArrayList();

    /* renamed from: u */
    public final CopyOnWriteArrayList f4278u = new CopyOnWriteArrayList();

    /* renamed from: w */
    public boolean f4280w = false;

    public MenuC1035l(Context context) {
        boolean zM688b;
        boolean z2 = false;
        this.f4258a = context;
        Resources resources = context.getResources();
        this.f4259b = resources;
        this.f4263f = new ArrayList();
        this.f4264g = new ArrayList();
        this.f4265h = true;
        this.f4266i = new ArrayList();
        this.f4267j = new ArrayList();
        this.f4268k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = AbstractC0210V.f567a;
            if (Build.VERSION.SDK_INT >= 28) {
                zM688b = AbstractC0208T.m688b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zM688b = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zM688b) {
                z2 = true;
            }
        }
        this.f4261d = z2;
    }

    /* renamed from: a */
    public final C1037n m2580a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (f4257y[i5] << 16) | (65535 & i3);
        C1037n c1037n = new C1037n(this, i, i2, i3, i6, charSequence, this.f4269l);
        ArrayList arrayList = this.f4263f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((C1037n) arrayList.get(size)).f4291d <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, c1037n);
        m2587p(true);
        return c1037n;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m2580a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f4258a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C1037n c1037nM2580a = m2580a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            c1037nM2580a.setIcon(resolveInfo.loadIcon(packageManager));
            c1037nM2580a.f4294g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = c1037nM2580a;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public final void m2581b(InterfaceC1047x interfaceC1047x, Context context) {
        this.f4278u.add(new WeakReference(interfaceC1047x));
        interfaceC1047x.mo2576f(context, this);
        this.f4268k = true;
    }

    /* renamed from: c */
    public final void m2582c(boolean z2) {
        if (this.f4276s) {
            return;
        }
        this.f4276s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4278u;
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            WeakReference weakReference = (WeakReference) it2.next();
            InterfaceC1047x interfaceC1047x = (InterfaceC1047x) weakReference.get();
            if (interfaceC1047x == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC1047x.mo2547b(this, z2);
            }
        }
        this.f4276s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C1037n c1037n = this.f4279v;
        if (c1037n != null) {
            mo2560d(c1037n);
        }
        this.f4263f.clear();
        m2587p(true);
    }

    public final void clearHeader() {
        this.f4271n = null;
        this.f4270m = null;
        this.f4272o = null;
        m2587p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m2582c(true);
    }

    /* renamed from: d */
    public boolean mo2560d(C1037n c1037n) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4278u;
        boolean zMo2577k = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f4279v == c1037n) {
            m2594w();
            Iterator it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                WeakReference weakReference = (WeakReference) it2.next();
                InterfaceC1047x interfaceC1047x = (InterfaceC1047x) weakReference.get();
                if (interfaceC1047x == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo2577k = interfaceC1047x.mo2577k(c1037n);
                    if (zMo2577k) {
                        break;
                    }
                }
            }
            m2593v();
            if (zMo2577k) {
                this.f4279v = null;
            }
        }
        return zMo2577k;
    }

    /* renamed from: e */
    public boolean mo2561e(MenuC1035l menuC1035l, MenuItem menuItem) {
        InterfaceC1033j interfaceC1033j = this.f4262e;
        return interfaceC1033j != null && interfaceC1033j.mo2069d(menuC1035l, menuItem);
    }

    /* renamed from: f */
    public boolean mo2562f(C1037n c1037n) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4278u;
        boolean zMo2575d = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m2594w();
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            WeakReference weakReference = (WeakReference) it2.next();
            InterfaceC1047x interfaceC1047x = (InterfaceC1047x) weakReference.get();
            if (interfaceC1047x == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zMo2575d = interfaceC1047x.mo2575d(c1037n);
                if (zMo2575d) {
                    break;
                }
            }
        }
        m2593v();
        if (zMo2575d) {
            this.f4279v = c1037n;
        }
        return zMo2575d;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f4263f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1037n c1037n = (C1037n) arrayList.get(i2);
            if (c1037n.f4288a == i) {
                return c1037n;
            }
            if (c1037n.hasSubMenu() && (menuItemFindItem = c1037n.f4302o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final C1037n m2583g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f4277t;
        arrayList.clear();
        m2584h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C1037n) arrayList.get(0);
        }
        boolean zMo2566n = mo2566n();
        for (int i2 = 0; i2 < size; i2++) {
            C1037n c1037n = (C1037n) arrayList.get(i2);
            char c2 = zMo2566n ? c1037n.f4297j : c1037n.f4295h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (zMo2566n && c2 == '\b' && i == 67))) {
                return c1037n;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f4263f.get(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2584h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        boolean zMo2566n = mo2566n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.f4263f;
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1037n c1037n = (C1037n) arrayList2.get(i2);
                if (c1037n.hasSubMenu()) {
                    c1037n.f4302o.m2584h(arrayList, i, keyEvent);
                }
                char c2 = zMo2566n ? c1037n.f4297j : c1037n.f4295h;
                if ((modifiers & 69647) == ((zMo2566n ? c1037n.f4298k : c1037n.f4296i) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if (c2 != cArr[0] && c2 != cArr[2]) {
                        if (zMo2566n && c2 == '\b') {
                            if (i == 67) {
                            }
                        }
                    }
                    if (c1037n.isEnabled()) {
                        arrayList.add(c1037n);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f4281x) {
            return true;
        }
        ArrayList arrayList = this.f4263f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C1037n) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void m2585i() {
        ArrayList arrayListM2586l = m2586l();
        if (this.f4268k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f4278u;
            Iterator it2 = copyOnWriteArrayList.iterator();
            boolean zMo2550h = false;
            while (it2.hasNext()) {
                WeakReference weakReference = (WeakReference) it2.next();
                InterfaceC1047x interfaceC1047x = (InterfaceC1047x) weakReference.get();
                if (interfaceC1047x == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo2550h |= interfaceC1047x.mo2550h();
                }
            }
            ArrayList arrayList = this.f4266i;
            ArrayList arrayList2 = this.f4267j;
            if (zMo2550h) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM2586l.size();
                for (int i = 0; i < size; i++) {
                    C1037n c1037n = (C1037n) arrayListM2586l.get(i);
                    if (c1037n.m2598f()) {
                        arrayList.add(c1037n);
                    } else {
                        arrayList2.add(c1037n);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m2586l());
            }
            this.f4268k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m2583g(i, keyEvent) != null;
    }

    /* renamed from: j */
    public String mo2563j() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: l */
    public final ArrayList m2586l() {
        boolean z2 = this.f4265h;
        ArrayList arrayList = this.f4264g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f4263f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C1037n c1037n = (C1037n) arrayList2.get(i);
            if (c1037n.isVisible()) {
                arrayList.add(c1037n);
            }
        }
        this.f4265h = false;
        this.f4268k = true;
        return arrayList;
    }

    /* renamed from: m */
    public boolean mo2565m() {
        return this.f4280w;
    }

    /* renamed from: n */
    public boolean mo2566n() {
        return this.f4260c;
    }

    /* renamed from: o */
    public boolean mo2567o() {
        return this.f4261d;
    }

    /* renamed from: p */
    public final void m2587p(boolean z2) {
        if (this.f4273p) {
            this.f4274q = true;
            if (z2) {
                this.f4275r = true;
                return;
            }
            return;
        }
        if (z2) {
            this.f4265h = true;
            this.f4268k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4278u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m2594w();
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            WeakReference weakReference = (WeakReference) it2.next();
            InterfaceC1047x interfaceC1047x = (InterfaceC1047x) weakReference.get();
            if (interfaceC1047x == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC1047x.mo2548c();
            }
        }
        m2593v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return m2588q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C1037n c1037nM2583g = m2583g(i, keyEvent);
        boolean zM2588q = c1037nM2583g != null ? m2588q(c1037nM2583g, null, i2) : false;
        if ((i2 & 2) != 0) {
            m2582c(true);
        }
        return zM2588q;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2588q(MenuItem menuItem, InterfaceC1047x interfaceC1047x, int i) {
        boolean zExpandActionView;
        C1037n c1037n = (C1037n) menuItem;
        if (c1037n == null || !c1037n.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c1037n.f4303p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c1037n)) {
            MenuC1035l menuC1035l = c1037n.f4301n;
            if (!menuC1035l.mo2561e(menuC1035l, c1037n)) {
                Intent intent = c1037n.f4294g;
                if (intent != null) {
                    try {
                        menuC1035l.f4258a.startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                    }
                } else {
                    ActionProviderVisibilityListenerC1038o actionProviderVisibilityListenerC1038o = c1037n.f4285A;
                    zExpandActionView = actionProviderVisibilityListenerC1038o != null && actionProviderVisibilityListenerC1038o.f4315b.onPerformDefaultAction();
                }
            }
        }
        ActionProviderVisibilityListenerC1038o actionProviderVisibilityListenerC1038o2 = c1037n.f4285A;
        boolean z2 = actionProviderVisibilityListenerC1038o2 != null && actionProviderVisibilityListenerC1038o2.f4315b.hasSubMenu();
        if (c1037n.m2597e()) {
            zExpandActionView |= c1037n.expandActionView();
            if (zExpandActionView) {
                m2582c(true);
            }
        } else if (c1037n.hasSubMenu() || z2) {
            if ((i & 4) == 0) {
                m2582c(false);
            }
            if (!c1037n.hasSubMenu()) {
                SubMenuC1023D subMenuC1023D = new SubMenuC1023D(this.f4258a, this, c1037n);
                c1037n.f4302o = subMenuC1023D;
                subMenuC1023D.setHeaderTitle(c1037n.f4292e);
            }
            SubMenuC1023D subMenuC1023D2 = c1037n.f4302o;
            if (z2) {
                actionProviderVisibilityListenerC1038o2.f4316c.getClass();
                actionProviderVisibilityListenerC1038o2.f4315b.onPrepareSubMenu(subMenuC1023D2);
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f4278u;
            if (!copyOnWriteArrayList.isEmpty()) {
                zMo2549g = interfaceC1047x != null ? interfaceC1047x.mo2549g(subMenuC1023D2) : false;
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    WeakReference weakReference = (WeakReference) it2.next();
                    InterfaceC1047x interfaceC1047x2 = (InterfaceC1047x) weakReference.get();
                    if (interfaceC1047x2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zMo2549g) {
                        zMo2549g = interfaceC1047x2.mo2549g(subMenuC1023D2);
                    }
                }
            }
            zExpandActionView |= zMo2549g;
            if (!zExpandActionView) {
                m2582c(true);
            }
        } else if ((i & 1) == 0) {
            m2582c(true);
        }
        return zExpandActionView;
    }

    /* renamed from: r */
    public final void m2589r(InterfaceC1047x interfaceC1047x) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4278u;
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            WeakReference weakReference = (WeakReference) it2.next();
            InterfaceC1047x interfaceC1047x2 = (InterfaceC1047x) weakReference.get();
            if (interfaceC1047x2 == null || interfaceC1047x2 == interfaceC1047x) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f4263f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C1037n) arrayList.get(i3)).f4289b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((C1037n) arrayList.get(i3)).f4289b != i) {
                    break;
                }
                if (i3 >= 0) {
                    ArrayList arrayList2 = this.f4263f;
                    if (i3 < arrayList2.size()) {
                        arrayList2.remove(i3);
                    }
                }
                i2 = i4;
            }
            m2587p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f4263f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C1037n) arrayList.get(i2)).f4288a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            ArrayList arrayList2 = this.f4263f;
            if (i2 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i2);
            m2587p(true);
        }
    }

    /* renamed from: s */
    public final void m2590s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo2563j());
        int size = this.f4263f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1023D) item.getSubMenu()).m2590s(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z2, boolean z3) {
        ArrayList arrayList = this.f4263f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1037n c1037n = (C1037n) arrayList.get(i2);
            if (c1037n.f4289b == i) {
                c1037n.f4311x = (c1037n.f4311x & (-5)) | (z3 ? 4 : 0);
                c1037n.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f4280w = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z2) {
        ArrayList arrayList = this.f4263f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1037n c1037n = (C1037n) arrayList.get(i2);
            if (c1037n.f4289b == i) {
                c1037n.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z2) {
        ArrayList arrayList = this.f4263f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C1037n c1037n = (C1037n) arrayList.get(i2);
            if (c1037n.f4289b == i) {
                int i3 = c1037n.f4311x;
                int i4 = (i3 & (-9)) | (z2 ? 0 : 8);
                c1037n.f4311x = i4;
                if (i3 != i4) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            m2587p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f4260c = z2;
        m2587p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f4263f.size();
    }

    /* renamed from: t */
    public final void m2591t(Bundle bundle) {
        int size = this.f4263f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1023D) item.getSubMenu()).m2591t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo2563j(), sparseArray);
        }
    }

    /* renamed from: u */
    public final void m2592u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f4272o = view;
            this.f4270m = null;
            this.f4271n = null;
        } else {
            if (i > 0) {
                this.f4270m = this.f4259b.getText(i);
            } else if (charSequence != null) {
                this.f4270m = charSequence;
            }
            if (i2 > 0) {
                this.f4271n = AbstractC0040a.m215b(this.f4258a, i2);
            } else if (drawable != null) {
                this.f4271n = drawable;
            }
            this.f4272o = null;
        }
        m2587p(false);
    }

    /* renamed from: v */
    public final void m2593v() {
        this.f4273p = false;
        if (this.f4274q) {
            this.f4274q = false;
            m2587p(this.f4275r);
        }
    }

    /* renamed from: w */
    public final void m2594w() {
        if (this.f4273p) {
            return;
        }
        this.f4273p = true;
        this.f4274q = false;
        this.f4275r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m2580a(0, 0, 0, this.f4259b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f4259b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m2580a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C1037n c1037nM2580a = m2580a(i, i2, i3, charSequence);
        SubMenuC1023D subMenuC1023D = new SubMenuC1023D(this.f4258a, this, c1037nM2580a);
        c1037nM2580a.f4302o = subMenuC1023D;
        subMenuC1023D.setHeaderTitle(c1037nM2580a.f4292e);
        return subMenuC1023D;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m2580a(i, i2, i3, this.f4259b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f4259b.getString(i4));
    }

    /* renamed from: k */
    public MenuC1035l mo2564k() {
        return this;
    }
}
