package p084n;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.fragment.app.AbstractC0595g;
import p012H.InterfaceMenuItemC0105a;
import p096r.C1256k;

/* renamed from: n.A */
/* loaded from: classes.dex */
public class MenuC1020A extends AbstractC0595g implements Menu {

    /* renamed from: c */
    public final MenuC1035l f4173c;

    public MenuC1020A(Context context, MenuC1035l menuC1035l) {
        super(context);
        if (menuC1035l == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f4173c = menuC1035l;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m1553g(this.f4173c.m2580a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f4173c.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m1553g(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f4173c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        C1256k c1256k = (C1256k) this.f1856b;
        if (c1256k != null) {
            c1256k.clear();
        }
        this.f4173c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f4173c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return m1553g(this.f4173c.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return m1553g(this.f4173c.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f4173c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f4173c.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.f4173c.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f4173c.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((C1256k) this.f1856b) != null) {
            int i2 = 0;
            while (true) {
                C1256k c1256k = (C1256k) this.f1856b;
                if (i2 >= c1256k.f5012c) {
                    break;
                }
                if (((InterfaceMenuItemC0105a) c1256k.m2973h(i2)).getGroupId() == i) {
                    ((C1256k) this.f1856b).m2974i(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f4173c.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((C1256k) this.f1856b) != null) {
            int i2 = 0;
            while (true) {
                C1256k c1256k = (C1256k) this.f1856b;
                if (i2 >= c1256k.f5012c) {
                    break;
                }
                if (((InterfaceMenuItemC0105a) c1256k.m2973h(i2)).getItemId() == i) {
                    ((C1256k) this.f1856b).m2974i(i2);
                    break;
                }
                i2++;
            }
        }
        this.f4173c.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z2, boolean z3) {
        this.f4173c.setGroupCheckable(i, z2, z3);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z2) {
        this.f4173c.setGroupEnabled(i, z2);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z2) {
        this.f4173c.setGroupVisible(i, z2);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f4173c.setQwertyMode(z2);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f4173c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.f4173c.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m1553g(this.f4173c.add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.f4173c.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m1553g(this.f4173c.m2580a(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.f4173c.addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m1553g(this.f4173c.add(i, i2, i3, i4));
    }
}
