package p082m;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import it.deviato.spotifuck.R;

/* renamed from: m.c */
/* loaded from: classes.dex */
public final class C0979c extends ContextWrapper {

    /* renamed from: f */
    public static Configuration f3970f;

    /* renamed from: a */
    public int f3971a;

    /* renamed from: b */
    public Resources.Theme f3972b;

    /* renamed from: c */
    public LayoutInflater f3973c;

    /* renamed from: d */
    public Configuration f3974d;

    /* renamed from: e */
    public Resources f3975e;

    public C0979c(Context context, int i) {
        super(context);
        this.f3971a = i;
    }

    /* renamed from: a */
    public final void m2473a(Configuration configuration) {
        if (this.f3975e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f3974d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f3974d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: b */
    public final void m2474b() {
        if (this.f3972b == null) {
            this.f3972b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f3972b.setTo(theme);
            }
        }
        this.f3972b.applyStyle(this.f3971a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Resources getResources() {
        if (this.f3975e == null) {
            Configuration configuration = this.f3974d;
            if (configuration == null) {
                this.f3975e = super.getResources();
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f3970f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f3970f = configuration2;
                    }
                    if (configuration.equals(f3970f)) {
                    }
                }
                this.f3975e = createConfigurationContext(this.f3974d).getResources();
            }
        }
        return this.f3975e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f3973c == null) {
            this.f3973c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f3973c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f3972b;
        if (theme != null) {
            return theme;
        }
        if (this.f3971a == 0) {
            this.f3971a = R.style.Theme_AppCompat_Light;
        }
        m2474b();
        return this.f3972b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f3971a != i) {
            this.f3971a = i;
            m2474b();
        }
    }
}
