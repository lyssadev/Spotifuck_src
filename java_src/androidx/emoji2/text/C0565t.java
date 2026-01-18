package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import p091p0.AbstractC1230a;

/* renamed from: androidx.emoji2.text.t */
/* loaded from: classes.dex */
public final class C0565t extends SpannableStringBuilder {

    /* renamed from: a */
    public final Class f1684a;

    /* renamed from: b */
    public final ArrayList f1685b;

    public C0565t(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f1685b = new ArrayList();
        AbstractC1230a.m2892j("watcherClass cannot be null", cls);
        this.f1684a = cls;
    }

    /* renamed from: a */
    public final void m1449a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1685b;
            if (i >= arrayList.size()) {
                return;
            }
            ((C0564s) arrayList.get(i)).f1683g.incrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* renamed from: b */
    public final void m1450b() {
        m1453e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1685b;
            if (i >= arrayList.size()) {
                return;
            }
            ((C0564s) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    /* renamed from: c */
    public final C0564s m1451c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1685b;
            if (i >= arrayList.size()) {
                return null;
            }
            C0564s c0564s = (C0564s) arrayList.get(i);
            if (c0564s.f1682f == obj) {
                return c0564s;
            }
            i++;
        }
    }

    /* renamed from: d */
    public final boolean m1452d(Object obj) {
        if (obj != null) {
            if (this.f1684a == obj.getClass()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    /* renamed from: e */
    public final void m1453e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1685b;
            if (i >= arrayList.size()) {
                return;
            }
            ((C0564s) arrayList.get(i)).f1683g.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C0564s c0564sM1451c;
        if (m1452d(obj) && (c0564sM1451c = m1451c(obj)) != null) {
            obj = c0564sM1451c;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C0564s c0564sM1451c;
        if (m1452d(obj) && (c0564sM1451c = m1451c(obj)) != null) {
            obj = c0564sM1451c;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C0564s c0564sM1451c;
        if (m1452d(obj) && (c0564sM1451c = m1451c(obj)) != null) {
            obj = c0564sM1451c;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.f1684a != cls) {
            return super.getSpans(i, i2, cls);
        }
        C0564s[] c0564sArr = (C0564s[]) super.getSpans(i, i2, C0564s.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, c0564sArr.length);
        for (int i3 = 0; i3 < c0564sArr.length; i3++) {
            objArr[i3] = c0564sArr[i3].f1682f;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || this.f1684a == cls) {
            cls = C0564s.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C0564s c0564sM1451c;
        if (m1452d(obj)) {
            c0564sM1451c = m1451c(obj);
            if (c0564sM1451c != null) {
                obj = c0564sM1451c;
            }
        } else {
            c0564sM1451c = null;
        }
        super.removeSpan(obj);
        if (c0564sM1451c != null) {
            this.f1685b.remove(c0564sM1451c);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (m1452d(obj)) {
            C0564s c0564s = new C0564s(obj);
            this.f1685b.add(c0564s);
            obj = c0564s;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C0565t(this.f1684a, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m1449a();
        super.replace(i, i2, charSequence);
        m1453e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public C0565t(Class cls, C0565t c0565t, int i, int i2) {
        super(c0565t, i, i2);
        this.f1685b = new ArrayList();
        AbstractC1230a.m2892j("watcherClass cannot be null", cls);
        this.f1684a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m1449a();
        super.replace(i, i2, charSequence, i3, i4);
        m1453e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
