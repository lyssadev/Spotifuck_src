package p082m;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import org.xmlpull.v1.XmlPullParserException;
import p065g.AbstractC0752a;
import p084n.ActionProviderVisibilityListenerC1038o;
import p084n.MenuC1035l;
import p087o.AbstractC1181p0;
import p091p0.AbstractC1230a;

/* renamed from: m.h */
/* loaded from: classes.dex */
public final class C0984h extends MenuInflater {

    /* renamed from: e */
    public static final Class[] f4018e;

    /* renamed from: f */
    public static final Class[] f4019f;

    /* renamed from: a */
    public final Object[] f4020a;

    /* renamed from: b */
    public final Object[] f4021b;

    /* renamed from: c */
    public final Context f4022c;

    /* renamed from: d */
    public Object f4023d;

    static {
        Class[] clsArr = {Context.class};
        f4018e = clsArr;
        f4019f = clsArr;
    }

    public C0984h(Context context) {
        super(context);
        this.f4022c = context;
        Object[] objArr = {context};
        this.f4020a = objArr;
        this.f4021b = objArr;
    }

    /* renamed from: a */
    public static Object m2477a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? m2477a(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* renamed from: b */
    public final void m2478b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ?? r4;
        int i;
        ColorStateList colorStateList;
        int resourceId;
        C0983g c0983g = new C0983g(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r4 = 1;
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        while (!z2) {
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType == i) {
                if (!z3) {
                    String name2 = xmlResourceParser.getName();
                    boolean zEquals = name2.equals("group");
                    C0984h c0984h = c0983g.f3991E;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = c0984h.f4022c.obtainStyledAttributes(attributeSet, AbstractC0752a.f2752p);
                        c0983g.f3993b = typedArrayObtainStyledAttributes.getResourceId(r4, 0);
                        c0983g.f3994c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        c0983g.f3995d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        c0983g.f3996e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        c0983g.f3997f = typedArrayObtainStyledAttributes.getBoolean(2, r4);
                        c0983g.f3998g = typedArrayObtainStyledAttributes.getBoolean(0, r4);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        Context context = c0984h.f4022c;
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0752a.f2753q);
                        c0983g.f4000i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                        c0983g.f4001j = (typedArrayObtainStyledAttributes2.getInt(5, c0983g.f3994c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, c0983g.f3995d) & 65535);
                        c0983g.f4002k = typedArrayObtainStyledAttributes2.getText(7);
                        c0983g.f4003l = typedArrayObtainStyledAttributes2.getText(8);
                        c0983g.f4004m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes2.getString(9);
                        c0983g.f4005n = string == null ? (char) 0 : string.charAt(0);
                        c0983g.f4006o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes2.getString(10);
                        c0983g.f4007p = string2 == null ? (char) 0 : string2.charAt(0);
                        c0983g.f4008q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                            c0983g.f4009r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            c0983g.f4009r = c0983g.f3996e;
                        }
                        c0983g.f4010s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                        c0983g.f4011t = typedArrayObtainStyledAttributes2.getBoolean(4, c0983g.f3997f);
                        c0983g.f4012u = typedArrayObtainStyledAttributes2.getBoolean(1, c0983g.f3998g);
                        c0983g.f4013v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                        c0983g.f4016y = typedArrayObtainStyledAttributes2.getString(12);
                        c0983g.f4014w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                        c0983g.f4015x = typedArrayObtainStyledAttributes2.getString(15);
                        String string3 = typedArrayObtainStyledAttributes2.getString(14);
                        boolean z4 = string3 != null;
                        if (z4 && c0983g.f4014w == 0 && c0983g.f4015x == null) {
                            c0983g.f4017z = (ActionProviderVisibilityListenerC1038o) c0983g.m2475a(string3, f4019f, c0984h.f4021b);
                        } else {
                            if (z4) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            c0983g.f4017z = null;
                        }
                        c0983g.f3987A = typedArrayObtainStyledAttributes2.getText(17);
                        c0983g.f3988B = typedArrayObtainStyledAttributes2.getText(22);
                        if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                            c0983g.f3990D = AbstractC1181p0.m2805c(typedArrayObtainStyledAttributes2.getInt(19, -1), c0983g.f3990D);
                        } else {
                            c0983g.f3990D = null;
                        }
                        if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC1230a.m2870I(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                            }
                            c0983g.f3989C = colorStateList;
                        } else {
                            c0983g.f3989C = null;
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        c0983g.f3999h = false;
                    } else if (name2.equals("menu")) {
                        c0983g.f3999h = true;
                        SubMenu subMenuAddSubMenu = c0983g.f3992a.addSubMenu(c0983g.f3993b, c0983g.f4000i, c0983g.f4001j, c0983g.f4002k);
                        c0983g.m2476b(subMenuAddSubMenu.getItem());
                        m2478b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        str = name2;
                        z3 = true;
                    }
                }
                eventType = xmlResourceParser.next();
                r4 = 1;
                i = 2;
            } else if (eventType == 3) {
                String name3 = xmlResourceParser.getName();
                if (z3 && name3.equals(str)) {
                    z3 = false;
                    str = null;
                } else if (name3.equals("group")) {
                    c0983g.f3993b = 0;
                    c0983g.f3994c = 0;
                    c0983g.f3995d = 0;
                    c0983g.f3996e = 0;
                    c0983g.f3997f = r4;
                    c0983g.f3998g = r4;
                } else if (name3.equals("item")) {
                    if (!c0983g.f3999h) {
                        ActionProviderVisibilityListenerC1038o actionProviderVisibilityListenerC1038o = c0983g.f4017z;
                        if (actionProviderVisibilityListenerC1038o == null || !actionProviderVisibilityListenerC1038o.f4315b.hasSubMenu()) {
                            c0983g.f3999h = r4;
                            c0983g.m2476b(c0983g.f3992a.add(c0983g.f3993b, c0983g.f4000i, c0983g.f4001j, c0983g.f4002k));
                        } else {
                            c0983g.f3999h = r4;
                            c0983g.m2476b(c0983g.f3992a.addSubMenu(c0983g.f3993b, c0983g.f4000i, c0983g.f4001j, c0983g.f4002k).getItem());
                        }
                    }
                } else if (name3.equals("menu")) {
                    z2 = true;
                }
                eventType = xmlResourceParser.next();
                r4 = 1;
                i = 2;
            }
            eventType = xmlResourceParser.next();
            r4 = 1;
            i = 2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof MenuC1035l)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z2 = false;
        try {
            try {
                layout = this.f4022c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof MenuC1035l) {
                    MenuC1035l menuC1035l = (MenuC1035l) menu;
                    if (!menuC1035l.f4273p) {
                        menuC1035l.m2594w();
                        z2 = true;
                    }
                }
                m2478b(layout, attributeSetAsAttributeSet, menu);
                if (z2) {
                    ((MenuC1035l) menu).m2593v();
                }
                layout.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z2) {
                ((MenuC1035l) menu).m2593v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
