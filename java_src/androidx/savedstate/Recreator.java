package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0627M;
import androidx.lifecycle.C0630P;
import androidx.lifecycle.C0652t;
import androidx.lifecycle.EnumC0644l;
import androidx.lifecycle.EnumC0645m;
import androidx.lifecycle.InterfaceC0631Q;
import androidx.lifecycle.InterfaceC0648p;
import androidx.lifecycle.InterfaceC0650r;
import androidx.lifecycle.SavedStateHandleController;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p030Q0.AbstractC0328E;
import p047Z0.AbstractC0469c;
import p077k0.C0958c;
import p077k0.InterfaceC0956a;
import p077k0.InterfaceC0960e;

/* loaded from: classes.dex */
public final class Recreator implements InterfaceC0648p {

    /* renamed from: a */
    public final InterfaceC0960e f2251a;

    public Recreator(InterfaceC0960e interfaceC0960e) {
        this.f2251a = interfaceC0960e;
    }

    @Override // androidx.lifecycle.InterfaceC0648p
    /* renamed from: b */
    public final void mo1283b(InterfaceC0650r interfaceC0650r, EnumC0644l enumC0644l) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Object obj;
        if (enumC0644l != EnumC0644l.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC0650r.mo1299d().m1620f(this);
        InterfaceC0960e interfaceC0960e = this.f2251a;
        Bundle bundleM2441c = interfaceC0960e.mo1297b().m2441c("androidx.savedstate.Restarter");
        if (bundleM2441c == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleM2441c.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(InterfaceC0956a.class);
                AbstractC0469c.m1101d("{\n                Class.…class.java)\n            }", clsAsSubclass);
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        AbstractC0469c.m1101d("{\n                constr…wInstance()\n            }", objNewInstance);
                        if (!(interfaceC0960e instanceof InterfaceC0631Q)) {
                            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                        }
                        C0630P c0630pMo1298c = ((InterfaceC0631Q) interfaceC0960e).mo1298c();
                        final C0958c c0958cMo1297b = interfaceC0960e.mo1297b();
                        c0630pMo1298c.getClass();
                        LinkedHashMap linkedHashMap = c0630pMo1298c.f1987a;
                        Iterator it2 = new HashSet(linkedHashMap.keySet()).iterator();
                        while (it2.hasNext()) {
                            String str2 = (String) it2.next();
                            AbstractC0469c.m1102e("key", str2);
                            AbstractC0627M abstractC0627M = (AbstractC0627M) linkedHashMap.get(str2);
                            AbstractC0469c.m1099b(abstractC0627M);
                            final C0652t c0652tMo1299d = interfaceC0960e.mo1299d();
                            AbstractC0469c.m1102e("registry", c0958cMo1297b);
                            AbstractC0469c.m1102e("lifecycle", c0652tMo1299d);
                            HashMap map = abstractC0627M.f1983a;
                            if (map == null) {
                                obj = null;
                            } else {
                                synchronized (map) {
                                    obj = abstractC0627M.f1983a.get("androidx.lifecycle.savedstate.vm.tag");
                                }
                            }
                            SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                            if (savedStateHandleController != null && !savedStateHandleController.f1991a) {
                                savedStateHandleController.getClass();
                                AbstractC0469c.m1102e("registry", c0958cMo1297b);
                                AbstractC0469c.m1102e("lifecycle", c0652tMo1299d);
                                if (savedStateHandleController.f1991a) {
                                    throw new IllegalStateException("Already attached to lifecycleOwner");
                                }
                                savedStateHandleController.f1991a = true;
                                c0652tMo1299d.m1615a(savedStateHandleController);
                                c0958cMo1297b.m2443e(null, null);
                                EnumC0645m enumC0645m = c0652tMo1299d.f2012c;
                                if (enumC0645m == EnumC0645m.f2002b || enumC0645m.compareTo(EnumC0645m.f2004d) >= 0) {
                                    c0958cMo1297b.m2444f();
                                } else {
                                    c0652tMo1299d.m1615a(new InterfaceC0648p() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                                        @Override // androidx.lifecycle.InterfaceC0648p
                                        /* renamed from: b */
                                        public final void mo1283b(InterfaceC0650r interfaceC0650r2, EnumC0644l enumC0644l2) throws NoSuchMethodException, SecurityException {
                                            if (enumC0644l2 == EnumC0644l.ON_START) {
                                                c0652tMo1299d.m1620f(this);
                                                c0958cMo1297b.m2444f();
                                            }
                                        }
                                    });
                                }
                            }
                        }
                        if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                            c0958cMo1297b.m2444f();
                        }
                    } catch (Exception e) {
                        throw new RuntimeException("Failed to instantiate " + str, e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(AbstractC0328E.m937g("Class ", str, " wasn't found"), e3);
            }
        }
    }
}
