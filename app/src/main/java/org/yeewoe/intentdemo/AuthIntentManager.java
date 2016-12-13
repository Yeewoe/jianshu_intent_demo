package org.yeewoe.intentdemo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/**
 * <h3>ClassInfo</h3>
 * auth模块使用的Intent管理类
 * <p />
 * <h3>可处理的功能</h3>
 * <ul>
 * <li>注册跳转</li>
 * <li>主界面跳转</li>
 * </ul>
 *
 * Created by yeewoe on 2016/12/12.
 */

public class AuthIntentManager extends AbsIntentManager {
    /**
     * 跳往注册页面
     */
    public static void intentToSignUp(Activity activity) {

    }

    /**
     * 跳转主界面
     */
    public static void intentToMain(Context context, String account) {
        Intent intent = buildIntent(context, MainActivity.class);
        intent.putExtra(MainActivity.EXTRA_ACCOUNT, account);
        context.startActivity(intent);
    }
}
