package p017K;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p007E.AbstractC0049b;

/* renamed from: K.d */
/* loaded from: classes.dex */
public abstract class AbstractC0131d {

    /* renamed from: a */
    public static final C0129b f345a = new C0129b();

    /* JADX WARN: Removed duplicated region for block: B:62:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ba  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0137j m484a(Context context, C0132e c0132e) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        Cursor cursor;
        Cursor cursorQuery;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = c0132e.f346a;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
        }
        String str2 = providerInfoResolveContentProvider.packageName;
        String str3 = c0132e.f347b;
        if (!str2.equals(str3)) {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str3);
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        C0129b c0129b = f345a;
        Collections.sort(arrayList, c0129b);
        List listM237l = c0132e.f349d;
        if (listM237l == null) {
            listM237l = AbstractC0049b.m237l(resources, 0);
        }
        int i = 0;
        loop1: while (true) {
            cursor = null;
            if (i >= listM237l.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) listM237l.get(i));
            Collections.sort(arrayList2, c0129b);
            if (arrayList.size() == arrayList2.size()) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                        break;
                    }
                }
                break loop1;
            }
            i++;
        }
        if (providerInfoResolveContentProvider == null) {
            return new C0137j(1, (C0138k[]) null);
        }
        String str4 = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str4).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
        C0130c c0130c = Build.VERSION.SDK_INT < 24 ? new C0130c(context, uriBuild, 0) : new C0130c(context, uriBuild, 1);
        try {
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            String[] strArr2 = {c0132e.f348c};
            switch (c0130c.f343a) {
                case 0:
                    cursorQuery = null;
                    ContentProviderClient contentProviderClient = c0130c.f344b;
                    if (contentProviderClient != null) {
                        try {
                            cursorQuery = contentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e) {
                            Log.w("FontsProvider", "Unable to query the content provider", e);
                        }
                    }
                    cursor = cursorQuery;
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        arrayList3 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            arrayList3.add(new C0138k(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, columnIndex != -1 ? cursor.getInt(columnIndex) : 0));
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    c0130c.m483a();
                    return new C0137j(0, (C0138k[]) arrayList3.toArray(new C0138k[0]));
                default:
                    cursorQuery = null;
                    ContentProviderClient contentProviderClient2 = c0130c.f344b;
                    if (contentProviderClient2 != null) {
                        try {
                            cursorQuery = contentProviderClient2.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e2) {
                            Log.w("FontsProvider", "Unable to query the content provider", e2);
                        }
                    }
                    cursor = cursorQuery;
                    if (cursor != null) {
                        int columnIndex7 = cursor.getColumnIndex("result_code");
                        arrayList3 = new ArrayList();
                        int columnIndex22 = cursor.getColumnIndex("_id");
                        int columnIndex32 = cursor.getColumnIndex("file_id");
                        int columnIndex42 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex52 = cursor.getColumnIndex("font_weight");
                        int columnIndex62 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                        }
                        break;
                    }
                    if (cursor != null) {
                    }
                    c0130c.m483a();
                    return new C0137j(0, (C0138k[]) arrayList3.toArray(new C0138k[0]));
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            c0130c.m483a();
            throw th;
        }
    }
}
