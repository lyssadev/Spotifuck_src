package p068h;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: h.F */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0821F implements View.OnClickListener {

    /* renamed from: f */
    public final View f3161f;

    /* renamed from: g */
    public final String f3162g;

    /* renamed from: h */
    public Method f3163h;

    /* renamed from: i */
    public Context f3164i;

    public ViewOnClickListenerC0821F(View view, String str) {
        this.f3161f = view;
        this.f3162g = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str;
        Method method;
        if (this.f3163h == null) {
            View view2 = this.f3161f;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f3162g;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    throw new IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f3163h = method;
                        this.f3164i = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f3163h.invoke(this.f3164i, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
