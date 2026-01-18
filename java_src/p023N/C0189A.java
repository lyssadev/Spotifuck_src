package p023N;

import android.text.TextUtils;
import android.view.View;

/* renamed from: N.A */
/* loaded from: classes.dex */
public final class C0189A extends AbstractC0192C {

    /* renamed from: e */
    public final /* synthetic */ int f544e;

    public C0189A(int i, Class cls, int i2, int i3, int i4) {
        this.f544e = i4;
        this.f548a = i;
        this.f551d = cls;
        this.f550c = i2;
        this.f549b = i3;
    }

    @Override // p023N.AbstractC0192C
    /* renamed from: b */
    public final Object mo585b(View view) {
        switch (this.f544e) {
            case 0:
                return Boolean.valueOf(AbstractC0199J.m644d(view));
            case 1:
                return AbstractC0199J.m642b(view);
            case 2:
                return AbstractC0201L.m658b(view);
            default:
                return Boolean.valueOf(AbstractC0199J.m643c(view));
        }
    }

    @Override // p023N.AbstractC0192C
    /* renamed from: c */
    public final void mo586c(View view, Object obj) {
        switch (this.f544e) {
            case 0:
                AbstractC0199J.m650j(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                AbstractC0199J.m648h(view, (CharSequence) obj);
                break;
            case 2:
                AbstractC0201L.m661e(view, (CharSequence) obj);
                break;
            default:
                AbstractC0199J.m647g(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // p023N.AbstractC0192C
    /* renamed from: e */
    public final boolean mo587e(Object obj, Object obj2) {
        switch (this.f544e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            case 2:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
