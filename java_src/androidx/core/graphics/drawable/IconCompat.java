package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import it.deviato.spotifuck.WebService;
import java.lang.reflect.InvocationTargetException;
import p010G.AbstractC0096c;
import p010G.AbstractC0098e;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    public static final PorterDuff.Mode f1595k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f1596a;

    /* renamed from: b */
    public Object f1597b;

    /* renamed from: c */
    public byte[] f1598c;

    /* renamed from: d */
    public Parcelable f1599d;

    /* renamed from: e */
    public int f1600e;

    /* renamed from: f */
    public int f1601f;

    /* renamed from: g */
    public ColorStateList f1602g;

    /* renamed from: h */
    public PorterDuff.Mode f1603h;

    /* renamed from: i */
    public String f1604i;

    /* renamed from: j */
    public String f1605j;

    public IconCompat() {
        this.f1596a = -1;
        this.f1598c = null;
        this.f1599d = null;
        this.f1600e = 0;
        this.f1601f = 0;
        this.f1602g = null;
        this.f1603h = f1595k;
        this.f1604i = null;
    }

    /* renamed from: a */
    public static Bitmap m1393a(Bitmap bitmap, boolean z2) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f2 = iMin;
        float f3 = 0.5f * f2;
        float f4 = 0.9166667f * f3;
        if (z2) {
            float f5 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    /* renamed from: b */
    public static IconCompat m1394b(Resources resources, String str, int i) {
        str.getClass();
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f1600e = i;
        if (resources != null) {
            try {
                iconCompat.f1597b = resources.getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f1597b = str;
        }
        iconCompat.f1605j = str;
        return iconCompat;
    }

    /* renamed from: c */
    public final int m1395c() {
        int i;
        int i2 = this.f1596a;
        if (i2 != -1 || (i = Build.VERSION.SDK_INT) < 23) {
            if (i2 == 2) {
                return this.f1600e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        Object obj = this.f1597b;
        if (i >= 28) {
            return AbstractC0098e.m372a(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }

    /* renamed from: d */
    public final Uri m1396d() {
        int i = this.f1596a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return AbstractC0096c.m367a(this.f1597b);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f1597b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* renamed from: e */
    public final Icon m1397e(WebService webService) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AbstractC0096c.m369c(this, webService);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    public final String toString() {
        String str;
        if (this.f1596a == -1) {
            return String.valueOf(this.f1597b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f1596a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f1596a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1597b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f1597b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f1605j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m1395c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1600e);
                if (this.f1601f != 0) {
                    sb.append(" off=");
                    sb.append(this.f1601f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1597b);
                break;
        }
        if (this.f1602g != null) {
            sb.append(" tint=");
            sb.append(this.f1602g);
        }
        if (this.f1603h != f1595k) {
            sb.append(" mode=");
            sb.append(this.f1603h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i) {
        this.f1598c = null;
        this.f1599d = null;
        this.f1600e = 0;
        this.f1601f = 0;
        this.f1602g = null;
        this.f1603h = f1595k;
        this.f1604i = null;
        this.f1596a = i;
    }
}
