package p063f0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.C0484b;
import android.support.v4.media.C0485c;
import android.support.v4.media.C0488f;
import it.deviato.spotifuck.R;
import p007E.C0057j;
import p009F.AbstractC0082a;
import p087o.AbstractC1125U0;
import p087o.C1116P0;
import p087o.C1186s;
import p091p0.AbstractC1230a;

/* renamed from: f0.b */
/* loaded from: classes.dex */
public final class C0744b {

    /* renamed from: a */
    public final Object f2730a;

    /* renamed from: b */
    public Object f2731b;

    /* renamed from: c */
    public final Object f2732c;

    /* renamed from: d */
    public final Cloneable f2733d;

    /* renamed from: e */
    public final Object f2734e;

    /* renamed from: f */
    public Object f2735f;

    /* JADX WARN: Type inference failed for: r0v5, types: [int[], java.lang.Cloneable] */
    public C0744b() {
        this.f2730a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.f2731b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f2732c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        this.f2733d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.f2734e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f2735f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    /* renamed from: a */
    public static boolean m1968a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static ColorStateList m1969b(Context context, int i) {
        int iM2743c = AbstractC1125U0.m2743c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{AbstractC1125U0.f4558b, AbstractC1125U0.f4560d, AbstractC1125U0.f4559c, AbstractC1125U0.f4562f}, new int[]{AbstractC1125U0.m2742b(context, R.attr.colorButtonNormal), AbstractC0082a.m324b(iM2743c, i), AbstractC0082a.m324b(iM2743c, i), i});
    }

    /* renamed from: d */
    public static LayerDrawable m1970d(C1116P0 c1116p0, Context context, int i) throws Resources.NotFoundException {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableM2731f = c1116p0.m2731f(context, R.drawable.abc_star_black_48dp);
        Drawable drawableM2731f2 = c1116p0.m2731f(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableM2731f instanceof BitmapDrawable) && drawableM2731f.getIntrinsicWidth() == dimensionPixelSize && drawableM2731f.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableM2731f;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM2731f.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM2731f.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableM2731f2 instanceof BitmapDrawable) && drawableM2731f2.getIntrinsicWidth() == dimensionPixelSize && drawableM2731f2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableM2731f2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM2731f2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM2731f2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* renamed from: f */
    public static void m1971f(Drawable drawable, int i) {
        drawable.mutate().setColorFilter(C1186s.m2808c(i, C1186s.f4724b));
    }

    /* renamed from: c */
    public void m1972c() {
        Messenger messenger;
        C0485c c0485c = ((C0488f) this.f2735f).f1188a;
        C0057j c0057j = c0485c.f1184f;
        if (c0057j != null && (messenger = c0485c.f1185g) != null) {
            try {
                c0057j.m263M(7, null, messenger);
            } catch (RemoteException unused) {
            }
        }
        c0485c.f1180b.disconnect();
        ((BroadcastReceiver.PendingResult) this.f2734e).finish();
    }

    /* renamed from: e */
    public ColorStateList m1973e(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return AbstractC1230a.m2870I(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC1230a.m2870I(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return m1969b(context, AbstractC1125U0.m2743c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return m1969b(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return m1969b(context, AbstractC1125U0.m2743c(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC1230a.m2870I(context, R.color.abc_tint_spinner);
            }
            if (m1968a((int[]) this.f2731b, i)) {
                return AbstractC1125U0.m2744d(context, R.attr.colorControlNormal);
            }
            if (m1968a((int[]) this.f2734e, i)) {
                return AbstractC1230a.m2870I(context, R.color.abc_tint_default);
            }
            if (m1968a((int[]) this.f2735f, i)) {
                return AbstractC1230a.m2870I(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC1230a.m2870I(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListM2744d = AbstractC1125U0.m2744d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListM2744d == null || !colorStateListM2744d.isStateful()) {
            iArr[0] = AbstractC1125U0.f4558b;
            iArr2[0] = AbstractC1125U0.m2742b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = AbstractC1125U0.f4561e;
            iArr2[1] = AbstractC1125U0.m2743c(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC1125U0.f4562f;
            iArr2[2] = AbstractC1125U0.m2743c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = AbstractC1125U0.f4558b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListM2744d.getColorForState(iArr3, 0);
            iArr[1] = AbstractC1125U0.f4561e;
            iArr2[1] = AbstractC1125U0.m2743c(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC1125U0.f4562f;
            iArr2[2] = colorStateListM2744d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public C0744b(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        this.f2730a = new C0484b(this);
        this.f2732c = context;
        this.f2733d = intent;
        this.f2734e = pendingResult;
    }
}
