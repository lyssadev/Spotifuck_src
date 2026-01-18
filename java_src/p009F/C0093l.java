package p009F;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import p007E.C0054g;
import p007E.C0055h;
import p017K.C0138k;
import p091p0.AbstractC1230a;

/* renamed from: F.l */
/* loaded from: classes.dex */
public final class C0093l extends AbstractC1230a {
    /* renamed from: L0 */
    public static Font m352L0(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM353M0 = m353M0(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iM353M02 = m353M0(fontStyle, font2.getStyle());
            if (iM353M02 < iM353M0) {
                font = font2;
                iM353M0 = iM353M02;
            }
        }
        return font;
    }

    /* renamed from: M0 */
    public static int m353M0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: D */
    public final C0138k mo354D(int i, C0138k[] c0138kArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: t */
    public final Typeface mo339t(Context context, C0054g c0054g, Resources resources, int i) throws IOException {
        try {
            FontFamily.Builder builder = null;
            for (C0055h c0055h : c0054g.f110a) {
                try {
                    Font fontBuild = new Font.Builder(resources, c0055h.f116f).setWeight(c0055h.f112b).setSlant(c0055h.f113c ? 1 : 0).setTtcIndex(c0055h.f115e).setFontVariationSettings(c0055h.f114d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m352L0(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: u */
    public final Typeface mo340u(Context context, C0138k[] c0138kArr, int i) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C0138k c0138k : c0138kArr) {
                try {
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(c0138k.f366a, "r", null);
                } catch (IOException unused) {
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                } else {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c0138k.f368c).setSlant(c0138k.f369d ? 1 : 0).setTtcIndex(c0138k.f367b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                    } catch (Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                parcelFileDescriptorOpenFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m352L0(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: v */
    public final Typeface mo355v(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: w */
    public final Typeface mo351w(Context context, Resources resources, int i, String str, int i2) throws IOException {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }
}
