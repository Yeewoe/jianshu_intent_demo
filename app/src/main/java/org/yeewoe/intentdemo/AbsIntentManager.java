package org.yeewoe.intentdemo;

import android.content.Context;
import android.content.Intent;

/**
 * Created by wyw on 2016/12/12.
 */
public abstract class AbsIntentManager {
    private static final String EXTRA_FROM = "extra_from";

    public static Intent buildIntent(Context context, Class<?> clazz) {
        Intent intent = new Intent(context, clazz);
        intent.putExtra(EXTRA_FROM, context.getClass().getName());
        return intent;
    }

    public static Intent buildIntent(Context context, Class<?> clazz, int flags) {
        Intent intent = new Intent(context, clazz);
        intent.putExtra(EXTRA_FROM, context.getClass().getName());
        if (flags > 0) {
            intent.addFlags(flags);
        }
        return intent;
    }
}
