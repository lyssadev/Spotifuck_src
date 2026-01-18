package p030Q0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.util.List;
import p024N0.C0288p;
import p098r1.AbstractC1275o;
import p098r1.C1268h;

/* renamed from: Q0.h */
/* loaded from: classes.dex */
public class C0339h extends AbstractC0325B {

    /* renamed from: a */
    public final /* synthetic */ int f893a;

    /* renamed from: b */
    public final Context f894b;

    public /* synthetic */ C0339h(Context context, int i) {
        this.f893a = i;
        this.f894b = context;
    }

    @Override // p030Q0.AbstractC0325B
    /* renamed from: a */
    public boolean mo925a(C0357z c0357z) {
        switch (this.f893a) {
            case 0:
                return "content".equals(c0357z.f938a.getScheme());
            default:
                return "android.resource".equals(c0357z.f938a.getScheme());
        }
    }

    @Override // p030Q0.AbstractC0325B
    /* renamed from: c */
    public C0288p mo927c(C0357z c0357z, int i) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        Resources resourcesForApplication;
        int identifier;
        Context context = this.f894b;
        switch (this.f893a) {
            case 0:
                return new C0288p(AbstractC1275o.m3040b(context.getContentResolver().openInputStream(c0357z.f938a)), 2);
            default:
                C1268h c1268h = AbstractC0331H.f862a;
                c0357z.getClass();
                Uri uri = c0357z.f938a;
                if (uri == null) {
                    resourcesForApplication = context.getResources();
                } else {
                    String authority = uri.getAuthority();
                    if (authority == null) {
                        throw new FileNotFoundException("No package provided: " + uri);
                    }
                    try {
                        resourcesForApplication = context.getPackageManager().getResourcesForApplication(authority);
                    } catch (PackageManager.NameNotFoundException unused) {
                        throw new FileNotFoundException("Unable to obtain resources for package: " + uri);
                    }
                }
                if (uri == null) {
                    identifier = 0;
                } else {
                    String authority2 = uri.getAuthority();
                    if (authority2 == null) {
                        throw new FileNotFoundException("No package provided: " + uri);
                    }
                    List<String> pathSegments = uri.getPathSegments();
                    if (pathSegments == null || pathSegments.isEmpty()) {
                        throw new FileNotFoundException("No path segments: " + uri);
                    }
                    if (pathSegments.size() == 1) {
                        try {
                            identifier = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused2) {
                            throw new FileNotFoundException("Last path segment is not a resource ID: " + uri);
                        }
                    } else {
                        if (pathSegments.size() != 2) {
                            throw new FileNotFoundException("More than two path segments: " + uri);
                        }
                        identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                    }
                }
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resourcesForApplication, identifier, null);
                if (bitmapDecodeResource != null) {
                    return new C0288p(bitmapDecodeResource, null, 2, 0);
                }
                throw new NullPointerException("bitmap == null");
        }
    }
}
