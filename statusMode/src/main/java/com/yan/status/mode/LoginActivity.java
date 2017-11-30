package com.yan.status.mode;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * @author : 楠GG
 * @date : 2017/11/30 22:33
 * @description : 登录Activity
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mUsername;
    private EditText mPassword;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
        findViewById(R.id.login).setOnClickListener(this);
    }

    private void initView() {
        mUsername = findViewById(R.id.username);
        mPassword = findViewById(R.id.password);
    }

    @Override
    public void onClick(View v) {
        String username = mUsername.getText().toString().trim();
        String password = mPassword.getText().toString().trim();
        if ("123".equals(username) && "123".equals(password)) {
            //登录成功后修改为已登录状态
            LoginContext.getLoginContext().setState(new LoginState());
            Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
            finish();
        } else {
            Toast.makeText(this, "账号或密码错误", Toast.LENGTH_SHORT).show();
        }
    }
}
