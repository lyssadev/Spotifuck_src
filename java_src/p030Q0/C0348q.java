package p030Q0;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import p024N0.C0288p;
import p048a.C0476b;
import p048a.C0479e;
import p098r1.AbstractC1275o;
import p098r1.C1262b;

/* renamed from: Q0.q */
/* loaded from: classes.dex */
public final class C0348q extends C0339h {

    /* renamed from: d */
    public static final String[] f922d = {"orientation"};

    /* renamed from: c */
    public final /* synthetic */ int f923c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0348q(Context context, int i) {
        super(context, 0);
        this.f923c = i;
    }

    @Override // p030Q0.C0339h, p030Q0.AbstractC0325B
    /* renamed from: a */
    public final boolean mo925a(C0357z c0357z) {
        switch (this.f923c) {
            case 0:
                Uri uri = c0357z.f938a;
                return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
            default:
                return "file".equals(c0357z.f938a.getScheme());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[PHI: r0 r7
      0x0059: PHI (r0v2 android.database.Cursor) = (r0v1 android.database.Cursor), (r0v7 android.database.Cursor), (r0v7 android.database.Cursor) binds: [B:29:0x0070, B:16:0x0055, B:21:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0059: PHI (r7v2 int) = (r7v0 int), (r7v5 int), (r7v0 int) binds: [B:29:0x0070, B:16:0x0055, B:21:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    @Override // p030Q0.C0339h, p030Q0.AbstractC0325B
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0288p mo927c(C0357z c0357z, int i) throws Throwable {
        Cursor cursorQuery;
        String type;
        switch (this.f923c) {
            case 0:
                Context context = this.f894b;
                ContentResolver contentResolver = context.getContentResolver();
                int i2 = 0;
                Cursor cursor = null;
                try {
                    cursorQuery = contentResolver.query(c0357z.f938a, f922d, null, null, null);
                } catch (RuntimeException unused) {
                    cursorQuery = null;
                } catch (Throwable th) {
                    th = th;
                }
                if (cursorQuery != null) {
                    try {
                    } catch (RuntimeException unused2) {
                        if (cursorQuery != null) {
                        }
                        Uri uri = c0357z.f938a;
                        type = contentResolver.getType(uri);
                        if (type != null) {
                        }
                        return new C0288p(null, AbstractC1275o.m3040b(context.getContentResolver().openInputStream(uri)), 2, i2);
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                    if (cursorQuery.moveToFirst()) {
                        i2 = cursorQuery.getInt(0);
                        cursorQuery.close();
                    } else if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } else if (cursorQuery != null) {
                }
                Uri uri2 = c0357z.f938a;
                type = contentResolver.getType(uri2);
                if (type != null) {
                    type.startsWith("video/");
                }
                return new C0288p(null, AbstractC1275o.m3040b(context.getContentResolver().openInputStream(uri2)), 2, i2);
            default:
                C1262b c1262bM3040b = AbstractC1275o.m3040b(this.f894b.getContentResolver().openInputStream(c0357z.f938a));
                C0479e c0479e = new C0479e(c0357z.f938a.getPath());
                C0476b c0476bM1118d = c0479e.m1118d("Orientation");
                int iM1111e = 1;
                if (c0476bM1118d != null) {
                    try {
                        iM1111e = c0476bM1118d.m1111e(c0479e.f1148d);
                    } catch (NumberFormatException unused3) {
                    }
                }
                return new C0288p(null, c1262bM3040b, 2, iM1111e);
        }
    }
}
