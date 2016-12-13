package org.yeewoe.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        findViewById(R.id.btn_sign_in).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                onLogin();
            }
        });

        findViewById(R.id.btn_sign_up).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                onSignUp();
            }
        });
    }

    public void onLogin() {
        // TODO verify account 、password ...
        /** 如果一切校验通过，这里将跳往到主界面 **/
        AuthIntentManager.intentToMain(this, "输入的用户名");
        /** 这里需要销毁LoginActivity，避免从{@linkplain org.yeewoe.intentdemo.MainActivity 主界面}点击返回到这里||| **/
        finish();
    }

    private void onSignUp() {
        // TODO 注册
        AuthIntentManager.intentToSignUp(this);
    }
}
