package p087o;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import p000A.C0001b;
import p023N.AbstractC0206Q;
import p023N.C0221d;
import p023N.InterfaceC0219c;

/* renamed from: o.F */
/* loaded from: classes.dex */
public abstract class AbstractC1095F {
    /* renamed from: a */
    public static boolean m2694a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0219c c0001b;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c0001b = new C0001b(clipData, 3);
            } else {
                C0221d c0221d = new C0221d();
                c0221d.f583g = clipData;
                c0221d.f584h = 3;
                c0001b = c0221d;
            }
            AbstractC0206Q.m677l(textView, c0001b.mo45j());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    /* renamed from: b */
    public static boolean m2695b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0219c c0001b;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c0001b = new C0001b(clipData, 3);
        } else {
            C0221d c0221d = new C0221d();
            c0221d.f583g = clipData;
            c0221d.f584h = 3;
            c0001b = c0221d;
        }
        AbstractC0206Q.m677l(view, c0001b.mo45j());
        return true;
    }
}
