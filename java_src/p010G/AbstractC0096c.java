package p010G;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* renamed from: G.c */
/* loaded from: classes.dex */
public abstract class AbstractC0096c {
    /* renamed from: a */
    public static Uri m367a(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC0098e.m375d(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }

    /* renamed from: b */
    public static Drawable m368b(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0188  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Icon m369c(IconCompat iconCompat, Context context) throws FileNotFoundException {
        Icon iconCreateWithBitmap;
        String strM373b;
        int i;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        InputStream inputStreamOpenInputStream;
        switch (iconCompat.f1596a) {
            case -1:
                return (Icon) iconCompat.f1597b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f1597b);
                break;
            case 2:
                int i2 = iconCompat.f1596a;
                if (i2 == -1 && (i = Build.VERSION.SDK_INT) >= 23) {
                    Object obj = iconCompat.f1597b;
                    if (i >= 28) {
                        strM373b = AbstractC0098e.m373b(obj);
                    } else {
                        try {
                            strM373b = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e) {
                            Log.e("IconCompat", "Unable to get icon package", e);
                            strM373b = null;
                            iconCreateWithBitmap = Icon.createWithResource(strM373b, iconCompat.f1600e);
                            colorStateList = iconCompat.f1602g;
                            if (colorStateList != null) {
                            }
                            mode = iconCompat.f1603h;
                            if (mode != IconCompat.f1595k) {
                            }
                            return iconCreateWithBitmap;
                        } catch (NoSuchMethodException e2) {
                            Log.e("IconCompat", "Unable to get icon package", e2);
                            strM373b = null;
                            iconCreateWithBitmap = Icon.createWithResource(strM373b, iconCompat.f1600e);
                            colorStateList = iconCompat.f1602g;
                            if (colorStateList != null) {
                            }
                            mode = iconCompat.f1603h;
                            if (mode != IconCompat.f1595k) {
                            }
                            return iconCreateWithBitmap;
                        } catch (InvocationTargetException e3) {
                            Log.e("IconCompat", "Unable to get icon package", e3);
                            strM373b = null;
                            iconCreateWithBitmap = Icon.createWithResource(strM373b, iconCompat.f1600e);
                            colorStateList = iconCompat.f1602g;
                            if (colorStateList != null) {
                            }
                            mode = iconCompat.f1603h;
                            if (mode != IconCompat.f1595k) {
                            }
                            return iconCreateWithBitmap;
                        }
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + iconCompat);
                    }
                    String str = iconCompat.f1605j;
                    strM373b = (str == null || TextUtils.isEmpty(str)) ? ((String) iconCompat.f1597b).split(":", -1)[0] : iconCompat.f1605j;
                }
                iconCreateWithBitmap = Icon.createWithResource(strM373b, iconCompat.f1600e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f1597b, iconCompat.f1600e, iconCompat.f1601f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f1597b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 26) {
                    iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.m1393a((Bitmap) iconCompat.f1597b, false));
                    break;
                } else {
                    iconCreateWithBitmap = AbstractC0097d.m371b((Bitmap) iconCompat.f1597b);
                    break;
                }
            case 6:
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 30) {
                    iconCreateWithBitmap = AbstractC0099f.m376a(iconCompat.m1396d());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.m1396d());
                    }
                    Uri uriM1396d = iconCompat.m1396d();
                    String scheme = uriM1396d.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriM1396d);
                        } catch (Exception e4) {
                            Log.w("IconCompat", "Unable to load image from URI: " + uriM1396d, e4);
                            inputStreamOpenInputStream = null;
                            if (inputStreamOpenInputStream != null) {
                            }
                        }
                        if (inputStreamOpenInputStream != null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.m1396d());
                        }
                        if (i3 < 26) {
                            iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.m1393a(BitmapFactory.decodeStream(inputStreamOpenInputStream), false));
                            break;
                        } else {
                            iconCreateWithBitmap = AbstractC0097d.m371b(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                            break;
                        }
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) iconCompat.f1597b));
                        } catch (FileNotFoundException e5) {
                            Log.w("IconCompat", "Unable to load image from path: " + uriM1396d, e5);
                            inputStreamOpenInputStream = null;
                            if (inputStreamOpenInputStream != null) {
                            }
                        }
                        if (inputStreamOpenInputStream != null) {
                        }
                    }
                }
                break;
        }
        colorStateList = iconCompat.f1602g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        mode = iconCompat.f1603h;
        if (mode != IconCompat.f1595k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }
}
