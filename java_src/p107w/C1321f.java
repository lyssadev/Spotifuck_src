package p107w;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: w.f */
/* loaded from: classes.dex */
public class C1321f implements InterfaceC1319d {

    /* renamed from: d */
    public final AbstractC1330o f5372d;

    /* renamed from: f */
    public int f5374f;

    /* renamed from: g */
    public int f5375g;

    /* renamed from: a */
    public AbstractC1330o f5369a = null;

    /* renamed from: b */
    public boolean f5370b = false;

    /* renamed from: c */
    public boolean f5371c = false;

    /* renamed from: e */
    public int f5373e = 1;

    /* renamed from: h */
    public int f5376h = 1;

    /* renamed from: i */
    public C1322g f5377i = null;

    /* renamed from: j */
    public boolean f5378j = false;

    /* renamed from: k */
    public final ArrayList f5379k = new ArrayList();

    /* renamed from: l */
    public final ArrayList f5380l = new ArrayList();

    public C1321f(AbstractC1330o abstractC1330o) {
        this.f5372d = abstractC1330o;
    }

    @Override // p107w.InterfaceC1319d
    /* renamed from: a */
    public final void mo3202a(InterfaceC1319d interfaceC1319d) {
        ArrayList arrayList = this.f5380l;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (!((C1321f) it2.next()).f5378j) {
                return;
            }
        }
        this.f5371c = true;
        AbstractC1330o abstractC1330o = this.f5369a;
        if (abstractC1330o != null) {
            abstractC1330o.mo3202a(this);
        }
        if (this.f5370b) {
            this.f5372d.mo3202a(this);
            return;
        }
        Iterator it3 = arrayList.iterator();
        C1321f c1321f = null;
        int i = 0;
        while (it3.hasNext()) {
            C1321f c1321f2 = (C1321f) it3.next();
            if (!(c1321f2 instanceof C1322g)) {
                i++;
                c1321f = c1321f2;
            }
        }
        if (c1321f != null && i == 1 && c1321f.f5378j) {
            C1322g c1322g = this.f5377i;
            if (c1322g != null) {
                if (!c1322g.f5378j) {
                    return;
                } else {
                    this.f5374f = this.f5376h * c1322g.f5375g;
                }
            }
            mo3219d(c1321f.f5375g + this.f5374f);
        }
        AbstractC1330o abstractC1330o2 = this.f5369a;
        if (abstractC1330o2 != null) {
            abstractC1330o2.mo3202a(this);
        }
    }

    /* renamed from: b */
    public final void m3217b(AbstractC1330o abstractC1330o) {
        this.f5379k.add(abstractC1330o);
        if (this.f5378j) {
            abstractC1330o.mo3202a(abstractC1330o);
        }
    }

    /* renamed from: c */
    public final void m3218c() {
        this.f5380l.clear();
        this.f5379k.clear();
        this.f5378j = false;
        this.f5375g = 0;
        this.f5371c = false;
        this.f5370b = false;
    }

    /* renamed from: d */
    public void mo3219d(int i) {
        if (this.f5378j) {
            return;
        }
        this.f5378j = true;
        this.f5375g = i;
        Iterator it2 = this.f5379k.iterator();
        while (it2.hasNext()) {
            InterfaceC1319d interfaceC1319d = (InterfaceC1319d) it2.next();
            interfaceC1319d.mo3202a(interfaceC1319d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5372d.f5395b.f5232h0);
        sb.append(":");
        switch (this.f5373e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f5378j ? Integer.valueOf(this.f5375g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f5380l.size());
        sb.append(":d=");
        sb.append(this.f5379k.size());
        sb.append(">");
        return sb.toString();
    }
}
