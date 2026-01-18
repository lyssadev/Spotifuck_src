package p047Z0;

import java.io.Serializable;

/* renamed from: Z0.d */
/* loaded from: classes.dex */
public abstract class AbstractC0470d implements Serializable {
    public AbstractC0470d(int i) {
    }

    public final String toString() {
        AbstractC0472f.f1112a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        AbstractC0469c.m1101d("renderLambdaToString(this)", string);
        return string;
    }
}
