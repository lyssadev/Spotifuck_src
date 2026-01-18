package p003C;

import android.app.Notification;
import android.app.Person;

/* renamed from: C.q */
/* loaded from: classes.dex */
public abstract class AbstractC0030q {
    /* renamed from: a */
    public static Notification.Builder m145a(Notification.Builder builder, Person person) {
        return builder.addPerson(person);
    }

    /* renamed from: b */
    public static Notification.Action.Builder m146b(Notification.Action.Builder builder, int i) {
        return builder.setSemanticAction(i);
    }
}
