package p066g0;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
import p024N0.RunnableC0268B;

/* renamed from: g0.v */
/* loaded from: classes.dex */
public final class C0778v {

    /* renamed from: e */
    public static final Class[] f2821e = {Context.class, AttributeSet.class};

    /* renamed from: f */
    public static final HashMap f2822f = new HashMap();

    /* renamed from: a */
    public final Context f2823a;

    /* renamed from: c */
    public final C0779w f2825c;

    /* renamed from: b */
    public final Object[] f2824b = new Object[2];

    /* renamed from: d */
    public final String[] f2826d = {Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};

    public C0778v(Context context, C0779w c0779w) {
        this.f2823a = context;
        this.f2825c = c0779w;
    }

    /* renamed from: a */
    public final Preference m1993a(String str, String[] strArr, AttributeSet attributeSet) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Class<?> cls;
        HashMap map = f2822f;
        Constructor<?> constructor = (Constructor) map.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.f2823a.getClassLoader();
                    if (strArr == null || strArr.length == 0) {
                        cls = Class.forName(str, false, classLoader);
                    } else {
                        cls = null;
                        ClassNotFoundException e = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e2) {
                                e = e2;
                            }
                        }
                        if (cls == null) {
                            if (e != null) {
                                throw e;
                            }
                            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                        }
                    }
                    constructor = cls.getConstructor(f2821e);
                    constructor.setAccessible(true);
                    map.put(str, constructor);
                } catch (Exception e3) {
                    InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                    inflateException.initCause(e3);
                    throw inflateException;
                }
            } catch (ClassNotFoundException e4) {
                throw e4;
            }
        }
        Object[] objArr = this.f2824b;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    /* renamed from: b */
    public final Preference m1994b(String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? m1993a(str, this.f2826d, attributeSet) : m1993a(str, null, attributeSet);
        } catch (InflateException e) {
            throw e;
        } catch (ClassNotFoundException e2) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e2);
            throw inflateException;
        } catch (Exception e3) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e3);
            throw inflateException2;
        }
    }

    /* renamed from: c */
    public final PreferenceGroup m1995c(XmlResourceParser xmlResourceParser) {
        int next;
        PreferenceGroup preferenceGroup;
        synchronized (this.f2824b) {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
            this.f2824b[0] = this.f2823a;
            do {
                try {
                    try {
                        next = xmlResourceParser.next();
                        if (next == 2) {
                            break;
                        }
                    } catch (InflateException e) {
                        throw e;
                    }
                } catch (IOException e2) {
                    InflateException inflateException = new InflateException(xmlResourceParser.getPositionDescription() + ": " + e2.getMessage());
                    inflateException.initCause(e2);
                    throw inflateException;
                } catch (XmlPullParserException e3) {
                    InflateException inflateException2 = new InflateException(e3.getMessage());
                    inflateException2.initCause(e3);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(xmlResourceParser.getPositionDescription() + ": No start tag found!");
            }
            preferenceGroup = (PreferenceGroup) m1994b(xmlResourceParser.getName(), attributeSetAsAttributeSet);
            preferenceGroup.m1660j(this.f2825c);
            m1996d(xmlResourceParser, preferenceGroup, attributeSetAsAttributeSet);
        }
        return preferenceGroup;
    }

    /* renamed from: d */
    public final void m1996d(XmlResourceParser xmlResourceParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        long jM1998b;
        int depth = xmlResourceParser.getDepth();
        while (true) {
            int next = xmlResourceParser.next();
            if ((next == 3 && xmlResourceParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.f2084l = Intent.parseIntent(this.f2823a.getResources(), xmlResourceParser, attributeSet);
                    } catch (IOException e) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    Resources resources = this.f2823a.getResources();
                    if (preference.f2086n == null) {
                        preference.f2086n = new Bundle();
                    }
                    resources.parseBundleExtra("extra", attributeSet, preference.f2086n);
                    try {
                        int depth2 = xmlResourceParser.getDepth();
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            if (next2 == 1 || (next2 == 3 && xmlResourceParser.getDepth() <= depth2)) {
                                break;
                            }
                        }
                    } catch (IOException e2) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e2);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference preferenceM1994b = m1994b(name, attributeSet);
                    PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
                    if (!preferenceGroup.f2100N.contains(preferenceM1994b)) {
                        if (preferenceM1994b.f2083k != null) {
                            PreferenceGroup preferenceGroup2 = preferenceGroup;
                            while (true) {
                                PreferenceGroup preferenceGroup3 = preferenceGroup2.f2068H;
                                if (preferenceGroup3 == null) {
                                    break;
                                } else {
                                    preferenceGroup2 = preferenceGroup3;
                                }
                            }
                            String str = preferenceM1994b.f2083k;
                            if (preferenceGroup2.m1664w(str) != null) {
                                Log.e("PreferenceGroup", "Found duplicated key: \"" + str + "\". This can cause unintended behaviour, please use unique keys for every preference.");
                            }
                        }
                        int i = preferenceM1994b.f2078f;
                        if (i == Integer.MAX_VALUE) {
                            if (preferenceGroup.f2101O) {
                                int i2 = preferenceGroup.f2102P;
                                preferenceGroup.f2102P = i2 + 1;
                                if (i2 != i) {
                                    preferenceM1994b.f2078f = i2;
                                    C0777u c0777u = preferenceM1994b.f2066F;
                                    if (c0777u != null) {
                                        Handler handler = c0777u.f2819g;
                                        RunnableC0268B runnableC0268B = c0777u.f2820h;
                                        handler.removeCallbacks(runnableC0268B);
                                        handler.post(runnableC0268B);
                                    }
                                }
                            }
                            if (preferenceM1994b instanceof PreferenceGroup) {
                                ((PreferenceGroup) preferenceM1994b).f2101O = preferenceGroup.f2101O;
                            }
                        }
                        int iBinarySearch = Collections.binarySearch(preferenceGroup.f2100N, preferenceM1994b);
                        if (iBinarySearch < 0) {
                            iBinarySearch = (iBinarySearch * (-1)) - 1;
                        }
                        boolean zMo1645u = preferenceGroup.mo1645u();
                        if (preferenceM1994b.f2093u == zMo1645u) {
                            preferenceM1994b.f2093u = !zMo1645u;
                            preferenceM1994b.mo1658h(preferenceM1994b.mo1645u());
                            preferenceM1994b.mo1640g();
                        }
                        synchronized (preferenceGroup) {
                            preferenceGroup.f2100N.add(iBinarySearch, preferenceM1994b);
                        }
                        C0779w c0779w = preferenceGroup.f2074b;
                        String str2 = preferenceM1994b.f2083k;
                        if (str2 == null || !preferenceGroup.f2099M.containsKey(str2)) {
                            jM1998b = c0779w.m1998b();
                        } else {
                            jM1998b = ((Long) preferenceGroup.f2099M.getOrDefault(str2, null)).longValue();
                            preferenceGroup.f2099M.remove(str2);
                        }
                        preferenceM1994b.f2075c = jM1998b;
                        preferenceM1994b.f2076d = true;
                        try {
                            preferenceM1994b.m1660j(c0779w);
                            preferenceM1994b.f2076d = false;
                            if (preferenceM1994b.f2068H != null) {
                                throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
                            }
                            preferenceM1994b.f2068H = preferenceGroup;
                            if (preferenceGroup.f2103Q) {
                                preferenceM1994b.mo1659i();
                            }
                            C0777u c0777u2 = preferenceGroup.f2066F;
                            if (c0777u2 != null) {
                                Handler handler2 = c0777u2.f2819g;
                                RunnableC0268B runnableC0268B2 = c0777u2.f2820h;
                                handler2.removeCallbacks(runnableC0268B2);
                                handler2.post(runnableC0268B2);
                            }
                        } catch (Throwable th) {
                            preferenceM1994b.f2076d = false;
                            throw th;
                        }
                    }
                    m1996d(xmlResourceParser, preferenceM1994b, attributeSet);
                }
            }
        }
    }
}
