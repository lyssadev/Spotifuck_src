package p007E;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* renamed from: E.m */
/* loaded from: classes.dex */
public final class C0060m {

    /* renamed from: a */
    public final ColorStateList f124a;

    /* renamed from: b */
    public final Configuration f125b;

    /* renamed from: c */
    public final int f126c;

    public C0060m(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f124a = colorStateList;
        this.f125b = configuration;
        this.f126c = theme == null ? 0 : theme.hashCode();
    }
}
