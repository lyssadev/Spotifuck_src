package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.C0513t;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p007E.C0057j;
import p017K.RunnableC0128a;
import p018K0.C0146e;
import p091p0.AbstractC1230a;
import p096r.C1248c;

/* renamed from: androidx.emoji2.text.j */
/* loaded from: classes.dex */
public final class C0555j {

    /* renamed from: j */
    public static final Object f1649j = new Object();

    /* renamed from: k */
    public static volatile C0555j f1650k;

    /* renamed from: a */
    public final ReentrantReadWriteLock f1651a;

    /* renamed from: b */
    public final C1248c f1652b;

    /* renamed from: c */
    public volatile int f1653c;

    /* renamed from: d */
    public final Handler f1654d;

    /* renamed from: e */
    public final C0551f f1655e;

    /* renamed from: f */
    public final InterfaceC0554i f1656f;

    /* renamed from: g */
    public final C0146e f1657g;

    /* renamed from: h */
    public final int f1658h;

    /* renamed from: i */
    public final C0549d f1659i;

    public C0555j(C0562q c0562q) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1651a = reentrantReadWriteLock;
        this.f1653c = 3;
        InterfaceC0554i interfaceC0554i = (InterfaceC0554i) c0562q.f1647b;
        this.f1656f = interfaceC0554i;
        int i = c0562q.f1646a;
        this.f1658h = i;
        this.f1659i = (C0549d) c0562q.f1648c;
        this.f1654d = new Handler(Looper.getMainLooper());
        this.f1652b = new C1248c(0);
        this.f1657g = new C0146e(11);
        C0551f c0551f = new C0551f(this);
        this.f1655e = c0551f;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f1653c = 0;
            } catch (Throwable th) {
                this.f1651a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m1437b() == 0) {
            try {
                interfaceC0554i.mo50o(new C0550e(c0551f));
            } catch (Throwable th2) {
                m1439d(th2);
            }
        }
    }

    /* renamed from: a */
    public static C0555j m1436a() {
        C0555j c0555j;
        synchronized (f1649j) {
            try {
                c0555j = f1650k;
                if (!(c0555j != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return c0555j;
    }

    /* renamed from: b */
    public final int m1437b() {
        this.f1651a.readLock().lock();
        try {
            return this.f1653c;
        } finally {
            this.f1651a.readLock().unlock();
        }
    }

    /* renamed from: c */
    public final void m1438c() {
        if (!(this.f1658h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (m1437b() == 1) {
            return;
        }
        this.f1651a.writeLock().lock();
        try {
            if (this.f1653c == 0) {
                return;
            }
            this.f1653c = 0;
            this.f1651a.writeLock().unlock();
            C0551f c0551f = this.f1655e;
            C0555j c0555j = c0551f.f1643a;
            try {
                c0555j.f1656f.mo50o(new C0550e(c0551f));
            } catch (Throwable th) {
                c0555j.m1439d(th);
            }
        } finally {
            this.f1651a.writeLock().unlock();
        }
    }

    /* renamed from: d */
    public final void m1439d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1651a.writeLock().lock();
        try {
            this.f1653c = 2;
            arrayList.addAll(this.f1652b);
            this.f1652b.clear();
            this.f1651a.writeLock().unlock();
            this.f1654d.post(new RunnableC0128a(arrayList, this.f1653c, th));
        } catch (Throwable th2) {
            this.f1651a.writeLock().unlock();
            throw th2;
        }
    }

    /* renamed from: e */
    public final CharSequence m1440e(CharSequence charSequence, int i, int i2) {
        C0567v[] c0567vArr;
        if (!(m1437b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        AbstractC1230a.m2888h("start should be <= than end", i <= i2);
        C0569x c0569x = null;
        if (charSequence == null) {
            return null;
        }
        AbstractC1230a.m2888h("start should be < than charSequence length", i <= charSequence.length());
        AbstractC1230a.m2888h("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        C0513t c0513t = this.f1655e.f1644b;
        c0513t.getClass();
        boolean z2 = charSequence instanceof C0565t;
        if (z2) {
            ((C0565t) charSequence).m1449a();
        }
        if (z2) {
            c0569x = new C0569x((Spannable) charSequence);
        } else {
            try {
                if (charSequence instanceof Spannable) {
                    c0569x = new C0569x((Spannable) charSequence);
                } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, C0567v.class) <= i2) {
                    c0569x = new C0569x();
                    c0569x.f1695a = false;
                    c0569x.f1696b = new SpannableString(charSequence);
                }
            } finally {
                if (z2) {
                    ((C0565t) charSequence).m1450b();
                }
            }
        }
        if (c0569x != null && (c0567vArr = (C0567v[]) c0569x.f1696b.getSpans(i, i2, C0567v.class)) != null && c0567vArr.length > 0) {
            for (C0567v c0567v : c0567vArr) {
                int spanStart = c0569x.f1696b.getSpanStart(c0567v);
                int spanEnd = c0569x.f1696b.getSpanEnd(c0567v);
                if (spanStart != i2) {
                    c0569x.removeSpan(c0567v);
                }
                i = Math.min(spanStart, i);
                i2 = Math.max(spanEnd, i2);
            }
        }
        int i3 = i;
        int i4 = i2;
        if (i3 != i4 && i3 < charSequence.length()) {
            C0569x c0569x2 = (C0569x) c0513t.m1227B(charSequence, i3, i4, Integer.MAX_VALUE, false, new C0057j(c0569x, (C0146e) c0513t.f1245b, 6));
            if (c0569x2 != null) {
                Spannable spannable = c0569x2.f1696b;
                if (z2) {
                    ((C0565t) charSequence).m1450b();
                }
                return spannable;
            }
            if (!z2) {
                return charSequence;
            }
        } else if (!z2) {
            return charSequence;
        }
        return charSequence;
    }

    /* renamed from: f */
    public final void m1441f(AbstractC0553h abstractC0553h) {
        AbstractC1230a.m2892j("initCallback cannot be null", abstractC0553h);
        this.f1651a.writeLock().lock();
        try {
            if (this.f1653c == 1 || this.f1653c == 2) {
                this.f1654d.post(new RunnableC0128a(Arrays.asList(abstractC0553h), this.f1653c, (Throwable) null));
            } else {
                this.f1652b.add(abstractC0553h);
            }
            this.f1651a.writeLock().unlock();
        } catch (Throwable th) {
            this.f1651a.writeLock().unlock();
            throw th;
        }
    }
}
