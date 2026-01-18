package p030Q0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p024N0.C0288p;
import p098r1.AbstractC1275o;

/* renamed from: Q0.g */
/* loaded from: classes.dex */
public final class C0338g extends AbstractC0325B {

    /* renamed from: b */
    public static final UriMatcher f891b;

    /* renamed from: a */
    public final Context f892a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f891b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public C0338g(Context context) {
        this.f892a = context;
    }

    @Override // p030Q0.AbstractC0325B
    /* renamed from: a */
    public final boolean mo925a(C0357z c0357z) {
        Uri uri = c0357z.f938a;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f891b.match(uri) != -1;
    }

    @Override // p030Q0.AbstractC0325B
    /* renamed from: c */
    public final C0288p mo927c(C0357z c0357z, int i) throws FileNotFoundException {
        InputStream inputStreamOpenContactPhotoInputStream;
        ContentResolver contentResolver = this.f892a.getContentResolver();
        Uri uriLookupContact = c0357z.f938a;
        int iMatch = f891b.match(uriLookupContact);
        if (iMatch != 1) {
            if (iMatch != 2) {
                if (iMatch != 3) {
                    if (iMatch != 4) {
                        throw new IllegalStateException("Invalid uri: " + uriLookupContact);
                    }
                }
            }
            inputStreamOpenContactPhotoInputStream = contentResolver.openInputStream(uriLookupContact);
        } else {
            uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uriLookupContact);
            inputStreamOpenContactPhotoInputStream = uriLookupContact == null ? null : ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact, true);
        }
        if (inputStreamOpenContactPhotoInputStream == null) {
            return null;
        }
        return new C0288p(AbstractC1275o.m3040b(inputStreamOpenContactPhotoInputStream), 2);
    }
}
