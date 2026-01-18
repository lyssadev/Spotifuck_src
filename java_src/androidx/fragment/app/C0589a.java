package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;
import p046Z.AbstractC0464d;

/* renamed from: androidx.fragment.app.a */
/* loaded from: classes.dex */
public final class C0589a implements InterfaceC0575F {

    /* renamed from: a */
    public final ArrayList f1808a;

    /* renamed from: b */
    public int f1809b;

    /* renamed from: c */
    public int f1810c;

    /* renamed from: d */
    public int f1811d;

    /* renamed from: e */
    public int f1812e;

    /* renamed from: f */
    public int f1813f;

    /* renamed from: g */
    public boolean f1814g;

    /* renamed from: h */
    public boolean f1815h;

    /* renamed from: i */
    public String f1816i;

    /* renamed from: j */
    public int f1817j;

    /* renamed from: k */
    public CharSequence f1818k;

    /* renamed from: l */
    public int f1819l;

    /* renamed from: m */
    public CharSequence f1820m;

    /* renamed from: n */
    public ArrayList f1821n;

    /* renamed from: o */
    public ArrayList f1822o;

    /* renamed from: p */
    public boolean f1823p;

    /* renamed from: q */
    public final C0577H f1824q;

    /* renamed from: r */
    public boolean f1825r;

    /* renamed from: s */
    public int f1826s;

    public C0589a(C0577H c0577h) {
        c0577h.m1469C();
        C0608t c0608t = c0577h.f1743t;
        if (c0608t != null) {
            c0608t.f1942g.getClassLoader();
        }
        this.f1808a = new ArrayList();
        this.f1815h = true;
        this.f1823p = false;
        this.f1826s = -1;
        this.f1824q = c0577h;
    }

    @Override // androidx.fragment.app.InterfaceC0575F
    /* renamed from: a */
    public final boolean mo1462a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1814g) {
            return true;
        }
        C0577H c0577h = this.f1824q;
        if (c0577h.f1727d == null) {
            c0577h.f1727d = new ArrayList();
        }
        c0577h.f1727d.add(this);
        return true;
    }

    /* renamed from: b */
    public final void m1543b(C0583N c0583n) {
        this.f1808a.add(c0583n);
        c0583n.f1786d = this.f1809b;
        c0583n.f1787e = this.f1810c;
        c0583n.f1788f = this.f1811d;
        c0583n.f1789g = this.f1812e;
    }

    /* renamed from: c */
    public final void m1544c(int i) {
        if (this.f1814g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            ArrayList arrayList = this.f1808a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0583N c0583n = (C0583N) arrayList.get(i2);
                AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = c0583n.f1784b;
                if (abstractComponentCallbacksC0606r != null) {
                    abstractComponentCallbacksC0606r.f1934v += i;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(c0583n.f1784b);
                        int i3 = c0583n.f1784b.f1934v;
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final int m1545d(boolean z2) {
        if (this.f1825r) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new C0585P());
            m1547f("  ", printWriter, true);
            printWriter.close();
        }
        this.f1825r = true;
        boolean z3 = this.f1814g;
        C0577H c0577h = this.f1824q;
        if (z3) {
            this.f1826s = c0577h.f1732i.getAndIncrement();
        } else {
            this.f1826s = -1;
        }
        c0577h.m1511v(this, z2);
        return this.f1826s;
    }

    /* renamed from: e */
    public final void m1546e(int i, AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r, String str, int i2) {
        String str2 = abstractComponentCallbacksC0606r.f1910Q;
        if (str2 != null) {
            AbstractC0464d.m1096c(abstractComponentCallbacksC0606r, str2);
        }
        Class<?> cls = abstractComponentCallbacksC0606r.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC0606r.f1896C;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC0606r + ": was " + abstractComponentCallbacksC0606r.f1896C + " now " + str);
            }
            abstractComponentCallbacksC0606r.f1896C = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0606r + " with tag " + str + " to container view with no id");
            }
            int i3 = abstractComponentCallbacksC0606r.f1894A;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC0606r + ": was " + abstractComponentCallbacksC0606r.f1894A + " now " + i);
            }
            abstractComponentCallbacksC0606r.f1894A = i;
            abstractComponentCallbacksC0606r.f1895B = i;
        }
        m1543b(new C0583N(i2, abstractComponentCallbacksC0606r));
        abstractComponentCallbacksC0606r.f1935w = this.f1824q;
    }

    /* renamed from: f */
    public final void m1547f(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1816i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1826s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1825r);
            if (this.f1813f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1813f));
            }
            if (this.f1809b != 0 || this.f1810c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1809b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1810c));
            }
            if (this.f1811d != 0 || this.f1812e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1811d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1812e));
            }
            if (this.f1817j != 0 || this.f1818k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1817j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1818k);
            }
            if (this.f1819l != 0 || this.f1820m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1819l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1820m);
            }
        }
        ArrayList arrayList = this.f1808a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0583N c0583n = (C0583N) arrayList.get(i);
            switch (c0583n.f1783a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c0583n.f1783a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c0583n.f1784b);
            if (z2) {
                if (c0583n.f1786d != 0 || c0583n.f1787e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c0583n.f1786d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c0583n.f1787e));
                }
                if (c0583n.f1788f != 0 || c0583n.f1789g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c0583n.f1788f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c0583n.f1789g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1826s >= 0) {
            sb.append(" #");
            sb.append(this.f1826s);
        }
        if (this.f1816i != null) {
            sb.append(" ");
            sb.append(this.f1816i);
        }
        sb.append("}");
        return sb.toString();
    }
}
